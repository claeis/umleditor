package ch.softenvironment.view;

/* 
 *This file is part of the UML/INTERLIS-Editor.
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
 */

import java.awt.*;
import ch.softenvironment.util.Tracer;
/**
 * Template-Dialog defining minimal functionality.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public abstract class BaseDialog extends javax.swing.JDialog {
	private static java.util.ResourceBundle resourceBundle = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/BaseDialog");
	private javax.swing.JPanel ivjJDialogContentPane = null;
	private boolean saved = false;
/**
 * BaseDialog constructor comment.
 * @param owner java.awt.Frame
 * @param title java.lang.String
 * @param modal boolean
 */
public BaseDialog(java.awt.Dialog owner, String title, boolean modal) {
	super(owner, title, modal);
	initialize();
}
/**
 * BaseDialog constructor comment.
 * @param owner java.awt.Frame
 * @param title java.lang.String
 * @param modal boolean
 */
public BaseDialog(Frame owner, String title, boolean modal) {
	super(owner, title, modal);
	initialize();
}
/**
 * BaseDialog constructor comment.
 * @param owner java.awt.Frame
 * @param modal boolean
 */
public BaseDialog(Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * Adapt the given PopupMenu before displaying it (for e.g. disable Items).
 * Overwrite this method.
 * @see #genericPopupDisplay()
 */
protected void adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
}
/**
 * Typical Apply-Action.
 * 
 * @see #save()
 */
protected void applyPressed() {
	save();
}
/**
 * Undo changes and close Dialog.
 * @see #undo()
 */
protected void cancelPressed() {
	undo();
	dispose();
}
/**
 * Ask user whether the remove action shall be proceeded or not.
 * @see BaseFrame#checkDeletion()
 */
protected boolean checkDeletion() {
	return checkDeletion(resourceBundle.getString("CTDeletion"), resourceBundle.getString("CIQueryForDeletion")); //$NON-NLS-2$ //$NON-NLS-1$
}
/**
 * Ask user whether the remove action shall be proceeded or not.
 * @param title String (of Deletion Message Box)
 * @param question String (of Deletion question)
 * @see BaseFrame#checkDeletion()
 */
protected boolean checkDeletion(String title, String question) {
	QueryDialog dialog = new QueryDialog(this, title, question);
	dialog.dispose();
	return dialog.isYes();
}
/**
 * @see BaseFrame
 */
protected void genericPopupDisplay(java.awt.event.MouseEvent event, javax.swing.JPopupMenu popupMenu) {
	if (event.isPopupTrigger()) {
		adaptPopupMenu(popupMenu);
		popupMenu.show(event.getComponent(), event.getX(), event.getY());
	}
}
/**
 * Return Apply-Button Label-String.
 */
protected String getApplyString() {
	return resourceBundle.getString("BtnApply_text");
}
/**
 * Return Button Label-String.
 */
protected String getAssignString() {
	return resourceBundle.getString("BtnAssign_text");
}
/**
 * Return Cancel-Button Label-String.
 */
protected String getCancelString() {
	return resourceBundle.getString("BtnCancel_text");
}
/**
 * Return New-Button Label-String.
 */
protected String getChangeWindowString() {
	return resourceBundle.getString("BtnChangeWindow_text");
}
/**
 * Return Description Label-String.
 */
protected String getDescriptionString() {
	return resourceBundle.getString("CIDescription");
}
/**
 * Return Detail-String.
 */
protected String getDetailString() {
	return resourceBundle.getString("CIDetail");
}
/**
 * Return the JDialogContentPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getJDialogContentPane() {
	if (ivjJDialogContentPane == null) {
		try {
			ivjJDialogContentPane = new javax.swing.JPanel();
			ivjJDialogContentPane.setName("JDialogContentPane");
			ivjJDialogContentPane.setLayout(null);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJDialogContentPane;
}
/**
 * Return New-Button Label-String.
 * @see DataPanel
 */
protected String getNewString() {
	return resourceBundle.getString("BtnNew_text");
}
/**
 * Return New-Button Label-String.
 */
protected String getNewWindowString() {
	return resourceBundle.getString("BtnNewWindow_text");
}
/**
 * Return OK-Button Label-String.
 */
protected String getOKString() {
	return resourceBundle.getString("BtnOK_text");
}
/**
 * Return Remove-Button Label-String.
 */
protected String getRemoveString() {
	return resourceBundle.getString("BtnRemove_text");
}
/**
 * Return Button Label-String.
 */
protected String getSearchWindowString() {
	return resourceBundle.getString("BtnSearchWindow_text");
}
/**
 * Popup an error Dialog.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	BaseFrame.showException(this, exception);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("BaseDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(426, 240);
		setTitle("<Abstract/Template Dialog>");
		setContentPane(getJDialogContentPane());
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * Overwrite this method for other OK-Reasons.
 * @see #okPressed()
 * @see #applyPressed()
 * @return boolean whether saving was successful or not
 */
public boolean isSaved() {
	// do nothing by default
	return saved;
}
/**
 * Typical OK-Action. Save Contents and close Dialog.
 * Trigger an OK-Buttons actionPerformed-Event to this method.
 * @see #save()
 */
protected void okPressed() {
	if (save()) {
		dispose();
	}
}
/**
 * Overwrite this method for other OK-Reasons.
 * @see #okPressed()
 * @see #applyPressed()
 * @return boolean whether saving was successful or not
 */
protected boolean save() {
	// do nothing by default
	saved = true;
	return true;
}
/**
 * Show the Dialog in the center of the screen.
 */
public void setCenterLocation() {
	Dimension screenSize = BaseFrame.getScreenSize();
	Dimension frameSize = getSize();

	if (frameSize.height > screenSize.height) {
		frameSize.height = screenSize.height;
	}
	if (frameSize.width > screenSize.width) {
		frameSize.width = screenSize.width;
	}

	setLocation(
		new Point(
			(screenSize.width - frameSize.width) / 2,
			(screenSize.height - frameSize.height) / 2));
}
/**
 * Set this Dialog relative to parent.
 */
public void setRelativeLocation(java.awt.Window parent) {
	if (parent != null) {
		setLocation(new Point(parent.getX() + BaseFrame.X_CHILD_OFFSET,
								parent.getY() + BaseFrame.Y_CHILD_OFFSET));
	}
}
/**
 * Trace the exception.
 * @param exception java.lang.Throwable
 */
protected void traceOnly(java.lang.Throwable exception) {
	Tracer.getInstance().uncaughtException(this, "traceOnly(..)", exception);//$NON-NLS-1$
}
/**
 * Overwrite this method for other Undo-Reasons.
 * @see #cancelPressed()
 */
protected void undo() {
	// do nothing by default
}
}
