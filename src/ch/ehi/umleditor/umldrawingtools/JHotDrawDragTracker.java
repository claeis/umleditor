package ch.ehi.umleditor.umldrawingtools;

/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
import CH.ifa.draw.framework.*;
import CH.ifa.draw.util.UndoableAdapter;
import CH.ifa.draw.util.Undoable;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * DragTracker implements the dragging of the clicked
 * figure.
 *
 * Adapted version of CH.ifa.draw.standard.DragTracker.
 *
 * @see SelectionTool
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.2 $ $Date: 2005-02-21 13:51:32 $
 */
 public class JHotDrawDragTracker extends CH.ifa.draw.standard.AbstractTool {

	private Figure  fAnchorFigure;
	private int     fLastX, fLastY;      // previous mouse position
	private boolean fMoved = false;

	public static class UndoActivity extends UndoableAdapter {
		private Point myOriginalPoint;
		private Point myBackupPoint;
		
		public UndoActivity(DrawingView newDrawingView, Point newOriginalPoint) {
			super(newDrawingView);
			setOriginalPoint(newOriginalPoint);
			setUndoable(true);
			setRedoable(true);
		}

		/*
		 * Undo the activity
		 * @return true if the activity could be undone, false otherwise
		 */
		public boolean undo() {
			if (!super.undo()) {
				return false;
			}
			moveAffectedFigures(getBackupPoint(), getOriginalPoint());
			return true;
		}

		/*
		 * Redo the activity
		 * @return true if the activity could be redone, false otherwise
		 */
		public boolean redo() {
			if (!super.redo()) {
				return false;
			}
			moveAffectedFigures(getOriginalPoint(), getBackupPoint());
			return true;
		}
		public void setBackupPoint(Point newBackupPoint) {
			myBackupPoint = newBackupPoint;
		}
		
		public Point getBackupPoint() {
			return myBackupPoint;
		}
		
		public void setOriginalPoint(Point newOriginalPoint) {
			myOriginalPoint = newOriginalPoint;
		}
		
		public Point getOriginalPoint() {
			return myOriginalPoint;
		}
		
		public void moveAffectedFigures(Point startPoint, Point endPoint) {
			FigureEnumeration figures = getAffectedFigures();
			while (figures.hasMoreElements()) {
				figures.nextFigure().moveBy(endPoint.x - startPoint.x,
					endPoint.y - startPoint.y);
			}
		}
	}
	public JHotDrawDragTracker(DrawingEditor newDrawingEditor, Figure anchor) {
		super(newDrawingEditor);
		fAnchorFigure = anchor;
	}
	public void activate() {
		setUndoActivity(createUndoActivity());
		getUndoActivity().setAffectedFigures(view().selectionElements());
	}
	/**
	 * Factory method for undo activity
	 */
	protected Undoable createUndoActivity() {
		return new JHotDrawDragTracker.UndoActivity(view(), new Point(fLastX, fLastY));
	}
	public void deactivate() {
		if (fMoved) {
			((JHotDrawDragTracker.UndoActivity)getUndoActivity()).setBackupPoint(new Point(fLastX, fLastY));
		}
		else {
			setUndoActivity(null);
		}
	}
	public void mouseDown(MouseEvent e, int x, int y) {
		super.mouseDown(e, x, y);
		fLastX = x;
		fLastY = y;

		if (e.isShiftDown()) {
		   view().toggleSelection(fAnchorFigure);
		   fAnchorFigure = null;
		}
		else if (!view().isFigureSelected(fAnchorFigure)) {
			view().clearSelection();
			view().addToSelection(fAnchorFigure);
		}
	}
	public void mouseDrag(MouseEvent e, int x, int y) {
		super.mouseDrag(e, x, y);
		fMoved = (Math.abs(x - fAnchorX) > 4) || (Math.abs(y - fAnchorY) > 4);

		if (fMoved) {
//TODO Patch: adaption of original CH.ifa.draw.standard.DragTracker
			FigureEnumeration figures = getUndoActivity().getAffectedFigures();
			while (figures.hasMoreElements()) {
				Figure figure = figures.nextFigure();
				if ((getUndoActivity().getAffectedFiguresCount() > 1) && (figure instanceof RoleDefFigure)) {
					// suppress Role-moving twicely (once by model-calculation & once by Drag)
//TODO Hack: meaningful multi-selection of Associations, Classes and Roles assumed
				} else {
					figure.moveBy(x - fLastX, y - fLastY);
				}
			}
		}
		fLastX = x;
		fLastY = y;
	}
}
