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
 
import ch.softenvironment.util.*;
/**
 * Dialog for user Warning.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public class WarningDialog extends BaseDialog {
	private static java.util.ResourceBundle resWarningDialog = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/WarningDialog");
	private javax.swing.JPanel ivjJDialogContentPane = null;
	private javax.swing.JLabel ivjLblWarningIcon = null;
	private javax.swing.JTextArea ivjTxaWarning = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JScrollPane ivjScpWarning = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == WarningDialog.this.getBtnCancel()) 
				connEtoM1(e);
		};
	};
/**
 * Create and open WarningDialog modally.
 */
public WarningDialog(java.awt.Dialog owner, String title, String warning) {
	super(owner, title, true);
	setUp(owner, title, warning);
}
/**
 * Create and open WarningDialog modally.
 * @param warning (the origin C printf formatter Symbols may be used, such as '\n')
 */
public WarningDialog(java.awt.Frame owner, String title, String warning) {
	super(owner, title, true);
	setUp(owner, title, warning);
}
/**
 * Constructor
 * @param owner Symbol
 * @param modal Symbol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public WarningDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * Create and open WarningDialog modally.
 */
public WarningDialog(javax.swing.JPanel owner, String title, String warning) {
	super(null, true);
Tracer.getInstance().nyi(this, "WarningDialog(Panel..)", "relative location gets lost");//$NON-NLS-2$//$NON-NLS-1$
	setUp(null, title, warning);
}
/**
 * connEtoM1:  (BtnOK.action.actionPerformed(java.awt.event.ActionEvent) --> WarningDialog.dispose()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the BtnNo property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new javax.swing.JButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText(resWarningDialog.getString("BtnCancel_text"));
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
 * Return the JDialogContentPane property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getJDialogContentPane() {
	if (ivjJDialogContentPane == null) {
		try {
			ivjJDialogContentPane = new javax.swing.JPanel();
			ivjJDialogContentPane.setName("JDialogContentPane");
			ivjJDialogContentPane.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 2;
			constraintsBtnCancel.ipadx = 9;
			constraintsBtnCancel.insets = new java.awt.Insets(5, 103, 6, 162);
			getJDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsLblWarningIcon = new java.awt.GridBagConstraints();
			constraintsLblWarningIcon.gridx = 1; constraintsLblWarningIcon.gridy = 1;
			constraintsLblWarningIcon.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblWarningIcon.ipady = 6;
			constraintsLblWarningIcon.insets = new java.awt.Insets(33, 8, 30, 8);
			getJDialogContentPane().add(getLblWarningIcon(), constraintsLblWarningIcon);

			java.awt.GridBagConstraints constraintsScpWarning = new java.awt.GridBagConstraints();
			constraintsScpWarning.gridx = 2; constraintsScpWarning.gridy = 1;
			constraintsScpWarning.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpWarning.weightx = 1.0;
			constraintsScpWarning.weighty = 1.0;
			constraintsScpWarning.ipadx = 328;
			constraintsScpWarning.ipady = 57;
			constraintsScpWarning.insets = new java.awt.Insets(17, 8, 5, 13);
			getJDialogContentPane().add(getScpWarning(), constraintsScpWarning);
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
 * Return the LblQuestionIcon property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblWarningIcon() {
	if (ivjLblWarningIcon == null) {
		try {
			ivjLblWarningIcon = new javax.swing.JLabel();
			ivjLblWarningIcon.setName("LblWarningIcon");
			ivjLblWarningIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ch/softenvironment/images/warning-icon.gif")));
			ivjLblWarningIcon.setText("");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblWarningIcon;
}
/**
 * Return the ScpWarning property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpWarning() {
	if (ivjScpWarning == null) {
		try {
			ivjScpWarning = new javax.swing.JScrollPane();
			ivjScpWarning.setName("ScpWarning");
			ivjScpWarning.setAutoscrolls(true);
			getScpWarning().setViewportView(getTxaWarning());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpWarning;
}
/**
 * Return the TxaQuery property value.
 * @return javax.swing.JTextArea
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextArea getTxaWarning() {
	if (ivjTxaWarning == null) {
		try {
			ivjTxaWarning = new javax.swing.JTextArea();
			ivjTxaWarning.setName("TxaWarning");
			ivjTxaWarning.setLineWrap(true);
			ivjTxaWarning.setWrapStyleWord(true);
			ivjTxaWarning.setBounds(0, 0, 352, 83);
			ivjTxaWarning.setEditable(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxaWarning;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	super.traceOnly(exception);
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
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("WarningDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(426, 178);
		setTitle(resWarningDialog.getString("CTWarningDialog"));
		setContentPane(getJDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * For Test only.
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		WarningDialog aWarningDialog;
		aWarningDialog = new WarningDialog(new java.awt.Frame(), false);
		aWarningDialog.setModal(true);
		aWarningDialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aWarningDialog.show();
		java.awt.Insets insets = aWarningDialog.getInsets();
		aWarningDialog.setSize(aWarningDialog.getWidth() + insets.left + insets.right, aWarningDialog.getHeight() + insets.top + insets.bottom);
		aWarningDialog.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("Exception occurred in main() of ch.softenvironment.view.BaseDialog");//$NON-NLS-1$
		exception.printStackTrace(System.out);
	}
}
/**
 * Initialize the Dialog.
 */
private void setUp(java.awt.Window owner, String title, String warning) {
	initialize();
	setTitle(title);
	getTxaWarning().setText(warning);
	setRelativeLocation(owner);
	show();
}
}
