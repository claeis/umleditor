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
<<<<<<< HEAD
 * DragTracker implements the dragging of the clicked
 * figure.
=======
 * DragTracker implements the dragging of the clicked figure.
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
 *
 * Adapted version of CH.ifa.draw.standard.DragTracker.
 *
 * @see SelectionTool
<<<<<<< HEAD
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.2 $ $Date: 2005-02-21 13:51:32 $
 */
 public class JHotDrawDragTracker extends CH.ifa.draw.standard.AbstractTool {

	private Figure  fAnchorFigure;
	private int     fLastX, fLastY;      // previous mouse position
=======
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2005-02-21 13:51:32 $
 */
public class JHotDrawDragTracker extends CH.ifa.draw.standard.AbstractTool {

	private Figure fAnchorFigure;
	private int fLastX, fLastY; // previous mouse position
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	private boolean fMoved = false;

	public static class UndoActivity extends UndoableAdapter {
		private Point myOriginalPoint;
		private Point myBackupPoint;
<<<<<<< HEAD
		
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		public UndoActivity(DrawingView newDrawingView, Point newOriginalPoint) {
			super(newDrawingView);
			setOriginalPoint(newOriginalPoint);
			setUndoable(true);
			setRedoable(true);
		}

		/*
		 * Undo the activity
<<<<<<< HEAD
=======
		 * 
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
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
<<<<<<< HEAD
=======
		 * 
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		 * @return true if the activity could be redone, false otherwise
		 */
		public boolean redo() {
			if (!super.redo()) {
				return false;
			}
			moveAffectedFigures(getOriginalPoint(), getBackupPoint());
			return true;
		}
<<<<<<< HEAD
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
=======

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
				figures.nextFigure().moveBy(endPoint.x - startPoint.x, endPoint.y - startPoint.y);
			}
		}
	}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	public JHotDrawDragTracker(DrawingEditor newDrawingEditor, Figure anchor) {
		super(newDrawingEditor);
		fAnchorFigure = anchor;
	}
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	public void activate() {
		setUndoActivity(createUndoActivity());
		getUndoActivity().setAffectedFigures(view().selectionElements());
	}
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	/**
	 * Factory method for undo activity
	 */
	protected Undoable createUndoActivity() {
		return new JHotDrawDragTracker.UndoActivity(view(), new Point(fLastX, fLastY));
	}
<<<<<<< HEAD
	public void deactivate() {
		if (fMoved) {
			((JHotDrawDragTracker.UndoActivity)getUndoActivity()).setBackupPoint(new Point(fLastX, fLastY));
		}
		else {
			setUndoActivity(null);
		}
	}
=======

	public void deactivate() {
		if (fMoved) {
			((JHotDrawDragTracker.UndoActivity) getUndoActivity()).setBackupPoint(new Point(fLastX, fLastY));
		} else {
			setUndoActivity(null);
		}
	}

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	public void mouseDown(MouseEvent e, int x, int y) {
		super.mouseDown(e, x, y);
		fLastX = x;
		fLastY = y;

		if (e.isShiftDown()) {
<<<<<<< HEAD
		   view().toggleSelection(fAnchorFigure);
		   fAnchorFigure = null;
		}
		else if (!view().isFigureSelected(fAnchorFigure)) {
=======
			view().toggleSelection(fAnchorFigure);
			fAnchorFigure = null;
		} else if (!view().isFigureSelected(fAnchorFigure)) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			view().clearSelection();
			view().addToSelection(fAnchorFigure);
		}
	}
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	public void mouseDrag(MouseEvent e, int x, int y) {
		super.mouseDrag(e, x, y);
		fMoved = (Math.abs(x - fAnchorX) > 4) || (Math.abs(y - fAnchorY) > 4);

		if (fMoved) {
<<<<<<< HEAD
//TODO Patch: adaption of original CH.ifa.draw.standard.DragTracker
=======
			// TODO Patch: adaption of original CH.ifa.draw.standard.DragTracker
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
			FigureEnumeration figures = getUndoActivity().getAffectedFigures();
			while (figures.hasMoreElements()) {
				Figure figure = figures.nextFigure();
				if ((getUndoActivity().getAffectedFiguresCount() > 1) && (figure instanceof RoleDefFigure)) {
<<<<<<< HEAD
					// suppress Role-moving twicely (once by model-calculation & once by Drag)
//TODO Hack: meaningful multi-selection of Associations, Classes and Roles assumed
=======
					// suppress Role-moving twicely (once by model-calculation &
					// once by Drag)
					// TODO Hack: meaningful multi-selection of Associations,
					// Classes and Roles assumed
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
				} else {
					figure.moveBy(x - fLastX, y - fLastY);
				}
			}
		}
		fLastX = x;
		fLastY = y;
	}
}
