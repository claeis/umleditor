/*
 * @(#)BoxHandleKit.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.standard;

import CH.ifa.draw.framework.*;
import CH.ifa.draw.util.Undoable;
import CH.ifa.draw.util.UndoableAdapter;
import java.awt.*;
import java.util.Vector;

class ResizeHandle extends LocatorHandle {
	ResizeHandle(Figure owner, Locator loc) {
		super(owner, loc);
	}

	public void invokeStart(int  x, int  y, DrawingView view) {
		setUndoActivity(createUndoActivity(view));
		getUndoActivity().setAffectedFigures(new SingleFigureEnumerator(owner()));
		((ResizeHandle.UndoActivity)getUndoActivity()).setOldDisplayBox(owner().displayBox());
	}
	
	public void invokeEnd(int x, int y, int anchorX, int anchorY, DrawingView view) {
		Rectangle oldDisplayBox = ((ResizeHandle.UndoActivity)getUndoActivity()).getOldDisplayBox();
		if (owner().displayBox().equals(oldDisplayBox)) {
			// display box hasn't change so there is nothing to undo
			setUndoActivity(null);
		}
	}

	/**
	 * Factory method for undo activity. To be overriden by subclasses.
	 */
	protected Undoable createUndoActivity(DrawingView view) {
		return new ResizeHandle.UndoActivity(view);
	}

	public static class UndoActivity extends UndoableAdapter {
		private Rectangle myOldDisplayBox;
		
		public UndoActivity(DrawingView newView) {
			super(newView);
			setUndoable(true);
			setRedoable(true);
		}
		
		public boolean undo() {
			if (!super.undo()) {
				return false;
			}

			return resetDisplayBox();
		}
	
		public boolean redo() {
			// do not call execute directly as the selection might has changed
			if (!isRedoable()) {
				return false;
			}

			return resetDisplayBox();
		}

		private boolean resetDisplayBox() {
			FigureEnumeration fe = getAffectedFigures();
			if (!fe.hasMoreElements()) {
				return false;
			}
			Figure currentFigure = fe.nextFigure();
			
			Rectangle figureDisplayBox = currentFigure.displayBox();
			currentFigure.displayBox(getOldDisplayBox());
			setOldDisplayBox(figureDisplayBox);
			return true;
		}
		
		protected void setOldDisplayBox(Rectangle newOldDisplayBox) {
			myOldDisplayBox = newOldDisplayBox;
		}

		public Rectangle getOldDisplayBox() {
			return myOldDisplayBox;
		}
	}
}

