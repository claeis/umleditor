package ch.softenvironment.view;

/**
 * Login Dialog for Application startup.
 * @author: Peter Hirzel (©2002)
 */
public class LoginDialog extends BaseDialog {
	// vars
	private static java.util.ResourceBundle resLoginDialog = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/LoginDialog");
	private String userId = "";//$NON-NLS-1$
	private String password = "";//$NON-NLS-1$
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JPanel ivjJDialogContentPane = null;
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JTextField ivjTxtId = null;
	private javax.swing.JPasswordField ivjTxtPassword = null;
	private javax.swing.JLabel ivjLblId = null;
	private javax.swing.JLabel ivjLblPassword = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == LoginDialog.this.getBtnCancel()) 
				connEtoM1(e);
			if (e.getSource() == LoginDialog.this.getBtnOk()) 
				connEtoC1(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == LoginDialog.this.getTxtId()) 
				connEtoM2(e);
			if (e.getSource() == LoginDialog.this.getTxtPassword()) 
				connEtoM3(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
	};
/**
 * Create and open LoginDialog modally.
 */
public LoginDialog(BaseFrame owner) {
	super(owner, true);
	initialize();
	setCenterLocation();
	show();
}
/**
 * Constructor
 * @param owner Symbol
 * @param modal Symbol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public LoginDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * connEtoC1:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> LoginDialog.btnOk_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
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
 * connEtoM1:  (JButton1.action.actionPerformed(java.awt.event.ActionEvent) --> ErrorDialog.dispose()V)
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
 * connEtoM2:  (TxtId.focus.focusGained(java.awt.event.FocusEvent) --> TxtId.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM2(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtId().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM3:  (TxtPassword.focus.focusGained(java.awt.event.FocusEvent) --> TxtPassword.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM3(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtPassword().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the JButton1 property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new javax.swing.JButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText(resLoginDialog.getString("BtnCancel_text"));
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
			ivjBtnOk.setSelected(false);
			ivjBtnOk.setText(resLoginDialog.getString("BtnOk_text"));
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

			java.awt.GridBagConstraints constraintsTxtId = new java.awt.GridBagConstraints();
			constraintsTxtId.gridx = 2; constraintsTxtId.gridy = 1;
			constraintsTxtId.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtId.weightx = 1.0;
			constraintsTxtId.ipadx = 136;
			constraintsTxtId.insets = new java.awt.Insets(10, 9, 3, 24);
			getJDialogContentPane().add(getTxtId(), constraintsTxtId);

			java.awt.GridBagConstraints constraintsTxtPassword = new java.awt.GridBagConstraints();
			constraintsTxtPassword.gridx = 2; constraintsTxtPassword.gridy = 2;
			constraintsTxtPassword.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtPassword.weightx = 1.0;
			constraintsTxtPassword.ipadx = 136;
			constraintsTxtPassword.insets = new java.awt.Insets(3, 9, 10, 24);
			getJDialogContentPane().add(getTxtPassword(), constraintsTxtPassword);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 3;
			constraintsBtnOk.ipadx = 55;
			constraintsBtnOk.insets = new java.awt.Insets(11, 37, 15, 8);
			getJDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 3;
			constraintsBtnCancel.ipadx = 9;
			constraintsBtnCancel.insets = new java.awt.Insets(11, 1, 15, 66);
			getJDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsLblId = new java.awt.GridBagConstraints();
			constraintsLblId.gridx = 1; constraintsLblId.gridy = 1;
			constraintsLblId.ipadx = 72;
			constraintsLblId.insets = new java.awt.Insets(13, 10, 6, 1);
			getJDialogContentPane().add(getLblId(), constraintsLblId);

			java.awt.GridBagConstraints constraintsLblPassword = new java.awt.GridBagConstraints();
			constraintsLblPassword.gridx = 1; constraintsLblPassword.gridy = 2;
			constraintsLblPassword.ipadx = 82;
			constraintsLblPassword.insets = new java.awt.Insets(6, 10, 13, 1);
			getJDialogContentPane().add(getLblPassword(), constraintsLblPassword);
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
 * Return the JLabel1 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblId() {
	if (ivjLblId == null) {
		try {
			ivjLblId = new javax.swing.JLabel();
			ivjLblId.setName("LblId");
			ivjLblId.setText(resLoginDialog.getString("LblId_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblId;
}
/**
 * Return the JLabel11 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblPassword() {
	if (ivjLblPassword == null) {
		try {
			ivjLblPassword = new javax.swing.JLabel();
			ivjLblPassword.setName("LblPassword");
			ivjLblPassword.setText(resLoginDialog.getString("LblPassword_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblPassword;
}
/**
 * Return Password for UserId.
 */
public String getPassword() {
	return password;
}
/**
 * Return the TxtId property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtId() {
	if (ivjTxtId == null) {
		try {
			ivjTxtId = new javax.swing.JTextField();
			ivjTxtId.setName("TxtId");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtId;
}
/**
 * Return the TxtPassword property value.
 * @return javax.swing.JPasswordField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPasswordField getTxtPassword() {
	if (ivjTxtPassword == null) {
		try {
			ivjTxtPassword = new javax.swing.JPasswordField();
			ivjTxtPassword.setName("TxtPassword");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtPassword;
}
/**
 * Return UserId.
 */
public String getUserId() {
	return userId;
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
	getTxtId().addFocusListener(ivjEventHandler);
	getTxtPassword().addFocusListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("LoginDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(324, 137);
		setTitle(resLoginDialog.getString("LoginDialog_title"));
		setContentPane(getJDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * Keep Id and Password
 */
protected boolean save() {
	userId = getTxtId().getText();
	password = new String(getTxtPassword().getPassword());

	return super.save();
}
}
