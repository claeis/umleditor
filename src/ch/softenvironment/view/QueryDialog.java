package ch.softenvironment.view;

import ch.softenvironment.util.*;
/**
 * Dialog for user query. Provides only YES or NO Options.
 * @author: Peter Hirzel (©2002)
 */
public class QueryDialog extends BaseDialog {
	private static java.util.ResourceBundle resQueryDialog = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/QueryDialog");
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JPanel ivjJDialogContentPane = null;
	private javax.swing.JButton ivjBtnNo = null;
	private javax.swing.JButton ivjBtnYes = null;
	private javax.swing.JTextArea ivjTxaQuery = null;
	private boolean yes = false;
	private javax.swing.JLabel ivjLblQuestionIcon = null;
	private javax.swing.JScrollPane ivjScpText = null;
	private javax.swing.JPanel ivjPnlCenter = null;
	private javax.swing.JPanel ivjPnlSouth = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == QueryDialog.this.getBtnYes()) 
				connEtoC1(e);
			if (e.getSource() == QueryDialog.this.getBtnNo()) 
				connEtoC2(e);
		};
	};
/**
 * Create and open QuestionDialog modally.
 */
public QueryDialog(java.awt.Dialog owner, String title, String question) {
	super(owner, title, true);
	setUp(owner, title, question);
}
/**
 * Create and open QuestionDialog modally.
 */
public QueryDialog(java.awt.Frame owner, String title, String question) {
	super(owner, title, true);
	setUp(owner, title, question);
}
/**
 * Constructor
 * @param owner Symbol
 * @param modal Symbol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public QueryDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * Create and open QuestionDialog modally.
 */
public QueryDialog(javax.swing.JPanel owner, String title, String question) {
	super(null, true);
Tracer.getInstance().nyi(this, "QueryDialog(Panel..)", "relative location gets lost");//$NON-NLS-2$//$NON-NLS-1$
	setUp(null, title, question);
}
/**
 * Comment
 */
public void btnNo_ActionPerformed() {
	yes = false;
	dispose();
}
/**
 * Comment
 */
public void btnYes_ActionPerformed() {
	yes = true;
	dispose();
}
/**
 * connEtoC1:  (BtnYes.action.actionPerformed(java.awt.event.ActionEvent) --> QueryDialog.btnYes_ActionPerformed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnYes_ActionPerformed();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnNo.action.actionPerformed(java.awt.event.ActionEvent) --> QueryDialog.btnNo_ActionPerformed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnNo_ActionPerformed();
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
private javax.swing.JButton getBtnNo() {
	if (ivjBtnNo == null) {
		try {
			ivjBtnNo = new javax.swing.JButton();
			ivjBtnNo.setName("BtnNo");
			ivjBtnNo.setText(resQueryDialog.getString("BtnNo_text"));
			ivjBtnNo.setBounds(234, 2, 106, 25);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnNo;
}
/**
 * Return the JButton1 property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnYes() {
	if (ivjBtnYes == null) {
		try {
			ivjBtnYes = new javax.swing.JButton();
			ivjBtnYes.setName("BtnYes");
			ivjBtnYes.setText(resQueryDialog.getString("BtnYes_text"));
			ivjBtnYes.setBounds(101, 2, 106, 25);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnYes;
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
			ivjJDialogContentPane.setLayout(new java.awt.BorderLayout());
			getJDialogContentPane().add(getLblQuestionIcon(), "West");
			getJDialogContentPane().add(getPnlSouth(), "South");
			getJDialogContentPane().add(getPnlCenter(), "Center");
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
private javax.swing.JLabel getLblQuestionIcon() {
	if (ivjLblQuestionIcon == null) {
		try {
			ivjLblQuestionIcon = new javax.swing.JLabel();
			ivjLblQuestionIcon.setName("LblQuestionIcon");
			ivjLblQuestionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ch/softenvironment/images/question-icon.gif")));
			ivjLblQuestionIcon.setText("");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblQuestionIcon;
}
/**
 * Return the PnlCenter property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlCenter() {
	if (ivjPnlCenter == null) {
		try {
			ivjPnlCenter = new javax.swing.JPanel();
			ivjPnlCenter.setName("PnlCenter");
			ivjPnlCenter.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsScpText = new java.awt.GridBagConstraints();
			constraintsScpText.gridx = 1; constraintsScpText.gridy = 1;
			constraintsScpText.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpText.weightx = 1.0;
			constraintsScpText.weighty = 1.0;
			constraintsScpText.ipadx = 344;
			constraintsScpText.ipady = 61;
			constraintsScpText.insets = new java.awt.Insets(16, 11, 11, 11);
			getPnlCenter().add(getScpText(), constraintsScpText);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlCenter;
}
/**
 * Return the PnlSouth property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlSouth() {
	if (ivjPnlSouth == null) {
		try {
			ivjPnlSouth = new javax.swing.JPanel();
			ivjPnlSouth.setName("PnlSouth");
			ivjPnlSouth.setPreferredSize(new java.awt.Dimension(0, 30));
			ivjPnlSouth.setLayout(null);
			getPnlSouth().add(getBtnYes(), getBtnYes().getName());
			getPnlSouth().add(getBtnNo(), getBtnNo().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlSouth;
}
/**
 * Return the ScpText property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpText() {
	if (ivjScpText == null) {
		try {
			ivjScpText = new javax.swing.JScrollPane();
			ivjScpText.setName("ScpText");
			ivjScpText.setAutoscrolls(true);
			getScpText().setViewportView(getTxaQuery());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpText;
}
/**
 * Return the TxaQuery property value.
 * @return javax.swing.JTextArea
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextArea getTxaQuery() {
	if (ivjTxaQuery == null) {
		try {
			ivjTxaQuery = new javax.swing.JTextArea();
			ivjTxaQuery.setName("TxaQuery");
			ivjTxaQuery.setLineWrap(true);
			ivjTxaQuery.setWrapStyleWord(true);
			ivjTxaQuery.setBounds(0, 0, 352, 99);
			ivjTxaQuery.setEditable(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxaQuery;
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
	getBtnYes().addActionListener(ivjEventHandler);
	getBtnNo().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("QueryDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(426, 140);
		setTitle("Frage");
		setContentPane(getJDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * @return boolean (either Yes or No)
 */
public boolean isYes() {
	return yes;
}
/**
 * For Test only.
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		QueryDialog aQueryDialog;
		aQueryDialog = new QueryDialog(new java.awt.Frame(), false);
		aQueryDialog.setModal(true);
		aQueryDialog.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aQueryDialog.show();
		java.awt.Insets insets = aQueryDialog.getInsets();
		aQueryDialog.setSize(aQueryDialog.getWidth() + insets.left + insets.right, aQueryDialog.getHeight() + insets.top + insets.bottom);
		aQueryDialog.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("Exception occurred in main() of ch.softenvironment.view.BaseDialog");//$NON-NLS-1$
		exception.printStackTrace(System.out);
	}
}
/**
 * Initialize the Dialog.
 */
private void setUp(java.awt.Window owner, String title, String question) {
	initialize();
	setTitle(title);
	getTxaQuery().setText(question);
	setRelativeLocation(owner);
	show();
}
}
