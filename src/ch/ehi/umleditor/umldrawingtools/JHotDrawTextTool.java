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
import CH.ifa.draw.standard.*;
import CH.ifa.draw.util.FloatingTextField;
import CH.ifa.draw.util.UndoableAdapter;
import CH.ifa.draw.util.Undoable;
import java.awt.*;
import java.awt.event.*;

/**
 * Advanced clone of
 * @see CH.ifa.draw.figures.TextTool
 *
 * Handles keyBoard ENTER.
 *
 * @see TextHolder
 * @see FloatingTextField
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.2 $ $Date: 2005-02-21 13:51:32 $
 */
public class JHotDrawTextTool extends CreationTool implements ActionListener {

	private FloatingTextField   fTextField;
	private TextHolder  fTypingTarget;

	public static class UndoActivity extends UndoableAdapter {
		private String myOriginalText;
		private String myBackupText;
		
		public UndoActivity(DrawingView newDrawingView, String newOriginalText) {
			super(newDrawingView);
			setOriginalText(newOriginalText);
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

			getDrawingView().clearSelection();

			if (!isValidText(getOriginalText())) {
				FigureEnumeration fe  = getAffectedFigures();
				while (fe.hasMoreElements()) {
					getDrawingView().drawing().orphan(fe.nextFigure());
				}
			}
			// add text figure if it has been removed (no backup text)
			else if (!isValidText(getBackupText())) {
				FigureEnumeration fe  = getAffectedFigures();
				while (fe.hasMoreElements()) {
					getDrawingView().add(fe.nextFigure());
				}
				setText(getOriginalText());
			}
			else {
				setText(getOriginalText());
			}
			

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

			getDrawingView().clearSelection();
				
			// the text figure did exist but was remove
			if (!isValidText(getBackupText())) {
				FigureEnumeration fe  = getAffectedFigures();
				while (fe.hasMoreElements()) {
					getDrawingView().drawing().orphan(fe.nextFigure());
				}
			}
			// the text figure didn't exist before
			else if (!isValidText(getOriginalText())) {
				FigureEnumeration fe  = getAffectedFigures();
				while (fe.hasMoreElements()) {
					getDrawingView().drawing().add(fe.nextFigure());
					setText(getBackupText());
				}
			}
			else {
				setText(getBackupText());
			}

			return true;
		}
		
		protected boolean isValidText(String toBeChecked) {
			return ((toBeChecked != null) && (toBeChecked.length() > 0));
		}
		
		protected void setText(String newText) {
			FigureEnumeration fe = getAffectedFigures();
			while (fe.hasMoreElements()) {
				Figure currentFigure = fe.nextFigure();
				if (currentFigure instanceof DecoratorFigure) {
					currentFigure = ((DecoratorFigure)currentFigure).getDecoratedFigure();
				}
				if (currentFigure instanceof TextHolder) {
					((TextHolder)currentFigure).setText(newText);
				}
			}
		}
		
		public void setBackupText(String newBackupText) {
			myBackupText = newBackupText;
		}
		
		public String getBackupText() {
			return myBackupText;
		}
		
		public void setOriginalText(String newOriginalText) {
			myOriginalText = newOriginalText;
		}
		
		public String getOriginalText() {
			return myOriginalText;
		}
	}
	public JHotDrawTextTool(DrawingEditor newDrawingEditor, Figure prototype) {
		super(newDrawingEditor, prototype);
	}
/**
 * Stop Editing at Keyboard-ENTER.
 * Extended by Peter Hirzel.
 * @see #beginEdit(TextHolder)
 */
public void actionPerformed(java.awt.event.ActionEvent e) {
//TODO Patch: Extended for KeyBoard-ENTER handling
	endEdit();
}
	/**
	 * Sets the text cursor.
	 */
	public void activate() {
		super.activate();
		view().clearSelection();
		// JDK1.1 TEXT_CURSOR has an incorrect hot spot
		//view().setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
	}
	protected void beginEdit(TextHolder figure) {
		if (fTextField == null) {
			fTextField = new FloatingTextField();
//TODO Patch: Extended by Peter Hirzel for KeyBoard-ENTER handling		
fTextField.addActionListener(this);
		}

		if (figure != getTypingTarget() && getTypingTarget() != null) {
			endEdit();
		}

		fTextField.createOverlay((Container)view(), figure.getFont());
		fTextField.setBounds(fieldBounds(figure), figure.getText());

		setTypingTarget(figure);
		setUndoActivity(createUndoActivity());
	}
	/**
	 * Factory method for undo activity
	 */
	protected Undoable createUndoActivity() {
		return new JHotDrawTextTool.UndoActivity(view(), getTypingTarget().getText());
	}
	/**
	 * Terminates the editing of a text figure.
	 */
	public void deactivate() {
		endEdit();
        super.deactivate();
	}
	protected void endEdit() {
		if (getTypingTarget() != null) {
			if (fTextField.getText().length() > 0) {
				getTypingTarget().setText(fTextField.getText());
			}
			else {
				drawing().orphan((Figure)getAddedFigure());

				// nothing to undo
//	            setUndoActivity(null);
			}

			// put created figure into a figure enumeration
			getUndoActivity().setAffectedFigures(
				new SingleFigureEnumerator(getAddedFigure()));
			((JHotDrawTextTool.UndoActivity)getUndoActivity()).setBackupText(
				getTypingTarget().getText());

			setTypingTarget(null);
			fTextField.endOverlay();
//	        view().checkDamage();
		}
	}
	private Rectangle fieldBounds(TextHolder figure) {
		Rectangle box = figure.textDisplayBox();
		int nChars = figure.overlayColumns();
		Dimension d = fTextField.getPreferredSize(nChars);
		return new Rectangle(box.x, box.y, d.width, d.height);
	}
	protected TextHolder getTypingTarget() {
		return fTypingTarget;
	}
	/**
	 * Test whether the text tool is currently activated and is displaying
	 * a overlay TextFigure for accepting input.
	 *
	 * @return true, if the text tool has a accepting target TextFigure for its input, false otherwise
	 */
	public boolean isActivated() {
		return getTypingTarget() != null;
	}
	/**
	 * If the pressed figure is a TextHolder it can be edited otherwise
	 * a new text figure is created.
	 */
	public void mouseDown(MouseEvent e, int x, int y)
	{
		TextHolder textHolder = null;
		Figure pressedFigure = drawing().findFigureInside(x, y);
		if (pressedFigure instanceof TextHolder) {
			textHolder = (TextHolder) pressedFigure;
			if (!textHolder.acceptsTyping())
				textHolder = null;
		}
		if (textHolder != null) {
			beginEdit(textHolder);
			return;
		}
		if (getTypingTarget() != null) {
			endEdit();
			editor().toolDone();
		} else {
			super.mouseDown(e, x, y);
			// update view so the created figure is drawn before the floating text
			// figure is overlaid. (Note, fDamage should be null in StandardDrawingView
			// when the overlay figure is drawn because a JTextField cannot be scrolled)
			view().checkDamage();
			textHolder = (TextHolder)getCreatedFigure();
			beginEdit(textHolder);
		}
	}
	public void mouseDrag(MouseEvent e, int x, int y) {
	}
	public void mouseUp(MouseEvent e, int x, int y) {
	}
	protected void setTypingTarget(TextHolder newTypingTarget) {
		fTypingTarget = newTypingTarget;
	}
}
