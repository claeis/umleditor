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
/**
 * Show a Dialog to select a Color.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public class ColorChooserDialog extends BaseDialog {
	private static java.util.ResourceBundle resColorChooserDialog = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/ColorChooserDialog");
	private java.awt.Color chosenColor = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JButton ivjBtnOk = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JColorChooser ivjColChooser = null;
	private javax.swing.JButton ivjBtnCancel = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == ColorChooserDialog.this.getBtnCancel()) 
				connEtoC1(e);
			if (e.getSource() == ColorChooserDialog.this.getBtnOk()) 
				connEtoC2(e);
		};
	};
/**
 * ColorChooser constructor comment.
 * @param owner java.awt.Frame
 * @param modal boolean
 */
public ColorChooserDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
	show();
}
/**
 * connEtoC1:  (BtnAbbrechen.action.actionPerformed(java.awt.event.ActionEvent) --> ColorChooser.cancelPressed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.cancelPressed();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> ColorChooser.okPressed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.okPressed();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the BaseDialogContentPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getBaseDialogContentPane() {
	if (ivjBaseDialogContentPane == null) {
		try {
			ivjBaseDialogContentPane = new javax.swing.JPanel();
			ivjBaseDialogContentPane.setName("BaseDialogContentPane");
			ivjBaseDialogContentPane.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsColChooser = new java.awt.GridBagConstraints();
			constraintsColChooser.gridx = 1; constraintsColChooser.gridy = 1;
			constraintsColChooser.gridwidth = 2;
			constraintsColChooser.insets = new java.awt.Insets(8, 7, 5, 8);
			getBaseDialogContentPane().add(getColChooser(), constraintsColChooser);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 2;
			constraintsBtnOk.ipadx = 59;
			constraintsBtnOk.insets = new java.awt.Insets(6, 111, 28, 1);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 2;
			constraintsBtnCancel.ipadx = 13;
			constraintsBtnCancel.insets = new java.awt.Insets(6, 2, 28, 110);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBaseDialogContentPane;
}
/**
 * Return the BtnAbbrechen property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new javax.swing.JButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText(resColorChooserDialog.getString("BtnCancel_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnCancel;
}
/**
 * Return the BtnOk property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnOk() {
	if (ivjBtnOk == null) {
		try {
			ivjBtnOk = new javax.swing.JButton();
			ivjBtnOk.setName("BtnOk");
			ivjBtnOk.setText(resColorChooserDialog.getString("BtnOk_text"));
			ivjBtnOk.setEnabled(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnOk;
}
/**
 * Return the selected Color.
 * @see undo()
 */
public Color getChosenColor() {
	if (isSaved() && (chosenColor == null)) {
		return Color.white;
	} else {
		return chosenColor;
	}
}
/**
 * Return the ColColorChooser property value.
 * @return javax.swing.JColorChooser
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JColorChooser getColChooser() {
	if (ivjColChooser == null) {
		try {
			ivjColChooser = new javax.swing.JColorChooser();
			ivjColChooser.setName("ColChooser");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjColChooser;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	super.handleException(exception);
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getBtnCancel().addActionListener(ivjEventHandler);
	getBtnOk().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("ColorChooser");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(444, 410);
		setTitle(resColorChooserDialog.getString("CTColorChooser"));
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	javax.swing.event.ChangeListener changeListener =
		new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent e) {
				chosenColor = getColChooser().getColor();
			}
		};
	getColChooser().getSelectionModel().addChangeListener(changeListener);
	// user code end
}
/**
 * Resets chosen color to null.
 * @see cancelPressed()
 */
protected void undo() {
	chosenColor = null;
}
}
