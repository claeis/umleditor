package ch.ehi.umleditor.application;

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
import javax.swing.*;
import ch.softenvironment.view.*;
/**
 * User Interface for an Option dialog.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:48 $
 */
public class OptionsDialog extends BaseDialog {
	private static java.util.ResourceBundle resOptionsDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/OptionsDialog");  //$NON-NLS-1$
	private UserSettings settings = null;
	private JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JButton ivjBtnWorkingDirectory = null;
	private JLabel ivjLblWorkingDirectery = null;
	private JTextField ivjTxtWorkingDirectory = null;
	private JButton ivjBtnImportDirectory = null;
	private JLabel ivjLblImportDirectory = null;
	private JTextField ivjTxtImportDirectory = null;
	private JLabel ivjLblWidth = null;
	private JPanel ivjPnlDiagrams = null;
	private JPanel ivjPnlPaths = null;
	private JTabbedPane ivjTbpOptions = null;
	private JTextField ivjTxtDiagramWidth = null;
	private JLabel ivjLblHeight = null;
	private JTextField ivjTxtDiagramHeight = null;
	private JButton ivjBtnCancel = null;
	private JButton ivjBtnOk = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == OptionsDialog.this.getBtnCancel()) 
				connEtoC1(e);
			if (e.getSource() == OptionsDialog.this.getBtnOk()) 
				connEtoC2(e);
			if (e.getSource() == OptionsDialog.this.getBtnWorkingDirectory()) 
				connEtoC3(e);
			if (e.getSource() == OptionsDialog.this.getBtnImportDirectory()) 
				connEtoC4(e);
		};
	};
/**
 * PrintDialog constructor comment.
 * @param owner java.awt.Frame
 */
public OptionsDialog(java.awt.Frame owner) {
	super(owner, true);
	initialize();
	setRelativeLocation(owner);
	show();
}
/**
 * Constructor
 * @param owner Symbol
 * @param modal Symbol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public OptionsDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * Comment
 */
private void btnImportDirectory() {
	JFileChooser dialog = new JFileChooser(getTxtImportDirectory().getText());
	dialog.setDialogTitle(resOptionsDialog.getString("CTImport")); //$NON-NLS-1$
	dialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	dialog.setMultiSelectionEnabled(false);

	if (dialog.showDialog(this, getAssignString()) == JFileChooser.APPROVE_OPTION) {//$NON-NLS-1$
		getTxtImportDirectory().setText(dialog.getSelectedFile().getAbsolutePath());
	}
}
/**
 * Comment
 */
private void btnWorkingDirectory() {
	JFileChooser dialog = new JFileChooser(getTxtWorkingDirectory().getText());
	dialog.setDialogTitle(resOptionsDialog.getString("CTWorkingDirectory")); //$NON-NLS-1$
	dialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	dialog.setMultiSelectionEnabled(false);

	if (dialog.showDialog(this, getAssignString()) == JFileChooser.APPROVE_OPTION) {//$NON-NLS-1$
		getTxtWorkingDirectory().setText(dialog.getSelectedFile().getAbsolutePath());
	}
}
/**
 * connEtoC1:  (JButton11.action.actionPerformed(java.awt.event.ActionEvent) --> PrintDialog.cancelPressed()V)
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
 * connEtoC2:  (JButton1.action.actionPerformed(java.awt.event.ActionEvent) --> PrintDialog.okPressed()V)
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
 * connEtoC3:  (BtnWorkingDirectory.action.actionPerformed(java.awt.event.ActionEvent) --> OptionsDialog.btnFilePrompter(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnWorkingDirectory();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (BtnImportDirectory.action.actionPerformed(java.awt.event.ActionEvent) --> OptionsDialog.btnFilePrompter(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnImportDirectory();
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

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 2;
			constraintsBtnOk.ipadx = 50;
			constraintsBtnOk.insets = new java.awt.Insets(8, 180, 8, 4);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 2;
			constraintsBtnCancel.ipadx = 4;
			constraintsBtnCancel.insets = new java.awt.Insets(8, 4, 8, 170);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsTbpOptions = new java.awt.GridBagConstraints();
			constraintsTbpOptions.gridx = 1; constraintsTbpOptions.gridy = 1;
			constraintsTbpOptions.gridwidth = 2;
			constraintsTbpOptions.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpOptions.weightx = 1.0;
			constraintsTbpOptions.weighty = 1.0;
			constraintsTbpOptions.ipadx = 535;
			constraintsTbpOptions.ipady = 86;
			constraintsTbpOptions.insets = new java.awt.Insets(10, 11, 8, 9);
			getBaseDialogContentPane().add(getTbpOptions(), constraintsTbpOptions);
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
 * Return the JButton11 property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new javax.swing.JButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText(getCancelString());
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
 * Return the BtnImportDirectory property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnImportDirectory() {
	if (ivjBtnImportDirectory == null) {
		try {
			ivjBtnImportDirectory = new javax.swing.JButton();
			ivjBtnImportDirectory.setName("BtnImportDirectory");
			ivjBtnImportDirectory.setText("...");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnImportDirectory;
}
/**
 * Return the JButton1 property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnOk() {
	if (ivjBtnOk == null) {
		try {
			ivjBtnOk = new javax.swing.JButton();
			ivjBtnOk.setName("BtnOk");
			ivjBtnOk.setText(getOKString());
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
 * Return the BtnWorkingDirectory property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnWorkingDirectory() {
	if (ivjBtnWorkingDirectory == null) {
		try {
			ivjBtnWorkingDirectory = new javax.swing.JButton();
			ivjBtnWorkingDirectory.setName("BtnWorkingDirectory");
			ivjBtnWorkingDirectory.setText("...");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnWorkingDirectory;
}
/**
 * Return the LblHeight property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblHeight() {
	if (ivjLblHeight == null) {
		try {
			ivjLblHeight = new javax.swing.JLabel();
			ivjLblHeight.setName("LblHeight");
			ivjLblHeight.setText(resOptionsDialog.getString("LblHeight_text"));
			ivjLblHeight.setBounds(19, 52, 112, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblHeight;
}
/**
 * Return the LblImportDirectory property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblImportDirectory() {
	if (ivjLblImportDirectory == null) {
		try {
			ivjLblImportDirectory = new javax.swing.JLabel();
			ivjLblImportDirectory.setName("LblImportDirectory");
			ivjLblImportDirectory.setText(resOptionsDialog.getString("LblImportDirectory_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblImportDirectory;
}
/**
 * Return the LblWidth property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblWidth() {
	if (ivjLblWidth == null) {
		try {
			ivjLblWidth = new javax.swing.JLabel();
			ivjLblWidth.setName("LblWidth");
			ivjLblWidth.setText(resOptionsDialog.getString("LblWidth_text"));
			ivjLblWidth.setBounds(19, 22, 112, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblWidth;
}
/**
 * Return the LblWorkingDirectery property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblWorkingDirectery() {
	if (ivjLblWorkingDirectery == null) {
		try {
			ivjLblWorkingDirectery = new javax.swing.JLabel();
			ivjLblWorkingDirectery.setName("LblWorkingDirectery");
			ivjLblWorkingDirectery.setText(resOptionsDialog.getString("LblWorkingDirectery_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblWorkingDirectery;
}
/**
 * Return the PnlDiagrams property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlDiagrams() {
	if (ivjPnlDiagrams == null) {
		try {
			ivjPnlDiagrams = new javax.swing.JPanel();
			ivjPnlDiagrams.setName("PnlDiagrams");
			ivjPnlDiagrams.setLayout(null);
			getPnlDiagrams().add(getLblWidth(), getLblWidth().getName());
			getPnlDiagrams().add(getTxtDiagramWidth(), getTxtDiagramWidth().getName());
			getPnlDiagrams().add(getLblHeight(), getLblHeight().getName());
			getPnlDiagrams().add(getTxtDiagramHeight(), getTxtDiagramHeight().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlDiagrams;
}
/**
 * Return the PnlPaths property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlPaths() {
	if (ivjPnlPaths == null) {
		try {
			ivjPnlPaths = new javax.swing.JPanel();
			ivjPnlPaths.setName("PnlPaths");
			ivjPnlPaths.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsLblWorkingDirectery = new java.awt.GridBagConstraints();
			constraintsLblWorkingDirectery.gridx = 1; constraintsLblWorkingDirectery.gridy = 1;
			constraintsLblWorkingDirectery.ipadx = 26;
			constraintsLblWorkingDirectery.insets = new java.awt.Insets(32, 9, 8, 3);
			getPnlPaths().add(getLblWorkingDirectery(), constraintsLblWorkingDirectery);

			java.awt.GridBagConstraints constraintsTxtWorkingDirectory = new java.awt.GridBagConstraints();
			constraintsTxtWorkingDirectory.gridx = 2; constraintsTxtWorkingDirectory.gridy = 1;
			constraintsTxtWorkingDirectory.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtWorkingDirectory.weightx = 1.0;
			constraintsTxtWorkingDirectory.ipadx = 328;
			constraintsTxtWorkingDirectory.insets = new java.awt.Insets(30, 3, 4, 4);
			getPnlPaths().add(getTxtWorkingDirectory(), constraintsTxtWorkingDirectory);

			java.awt.GridBagConstraints constraintsBtnWorkingDirectory = new java.awt.GridBagConstraints();
			constraintsBtnWorkingDirectory.gridx = 3; constraintsBtnWorkingDirectory.gridy = 1;
			constraintsBtnWorkingDirectory.ipadx = -5;
			constraintsBtnWorkingDirectory.insets = new java.awt.Insets(27, 5, 2, 6);
			getPnlPaths().add(getBtnWorkingDirectory(), constraintsBtnWorkingDirectory);

			java.awt.GridBagConstraints constraintsLblImportDirectory = new java.awt.GridBagConstraints();
			constraintsLblImportDirectory.gridx = 1; constraintsLblImportDirectory.gridy = 2;
			constraintsLblImportDirectory.ipadx = 24;
			constraintsLblImportDirectory.insets = new java.awt.Insets(6, 9, 29, 3);
			getPnlPaths().add(getLblImportDirectory(), constraintsLblImportDirectory);

			java.awt.GridBagConstraints constraintsTxtImportDirectory = new java.awt.GridBagConstraints();
			constraintsTxtImportDirectory.gridx = 2; constraintsTxtImportDirectory.gridy = 2;
			constraintsTxtImportDirectory.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtImportDirectory.weightx = 1.0;
			constraintsTxtImportDirectory.ipadx = 328;
			constraintsTxtImportDirectory.insets = new java.awt.Insets(4, 3, 25, 4);
			getPnlPaths().add(getTxtImportDirectory(), constraintsTxtImportDirectory);

			java.awt.GridBagConstraints constraintsBtnImportDirectory = new java.awt.GridBagConstraints();
			constraintsBtnImportDirectory.gridx = 3; constraintsBtnImportDirectory.gridy = 2;
			constraintsBtnImportDirectory.ipadx = -5;
			constraintsBtnImportDirectory.insets = new java.awt.Insets(3, 5, 21, 6);
			getPnlPaths().add(getBtnImportDirectory(), constraintsBtnImportDirectory);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlPaths;
}
/**
 * Return the TbpOptions property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTabbedPane getTbpOptions() {
	if (ivjTbpOptions == null) {
		try {
			ivjTbpOptions = new javax.swing.JTabbedPane();
			ivjTbpOptions.setName("TbpOptions");
			ivjTbpOptions.insertTab(resOptionsDialog.getString("TbpPath_title"), null, getPnlPaths(), null, 0);
			ivjTbpOptions.insertTab(resOptionsDialog.getString("TbpClassdiagramms_title"), null, getPnlDiagrams(), null, 1);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbpOptions;
}
/**
 * Return the TxtDiagramHeight property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtDiagramHeight() {
	if (ivjTxtDiagramHeight == null) {
		try {
			ivjTxtDiagramHeight = new javax.swing.JTextField();
			ivjTxtDiagramHeight.setName("TxtDiagramHeight");
			ivjTxtDiagramHeight.setBounds(153, 48, 90, 20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtDiagramHeight;
}
/**
 * Return the TxtDiagramWidth property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtDiagramWidth() {
	if (ivjTxtDiagramWidth == null) {
		try {
			ivjTxtDiagramWidth = new javax.swing.JTextField();
			ivjTxtDiagramWidth.setName("TxtDiagramWidth");
			ivjTxtDiagramWidth.setBounds(153, 18, 90, 20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtDiagramWidth;
}
/**
 * Return the TxtImportDirectory property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtImportDirectory() {
	if (ivjTxtImportDirectory == null) {
		try {
			ivjTxtImportDirectory = new javax.swing.JTextField();
			ivjTxtImportDirectory.setName("TxtImportDirectory");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtImportDirectory;
}
/**
 * Return the TxtWorkingDirectory property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtWorkingDirectory() {
	if (ivjTxtWorkingDirectory == null) {
		try {
			ivjTxtWorkingDirectory = new javax.swing.JTextField();
			ivjTxtWorkingDirectory.setName("TxtWorkingDirectory");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtWorkingDirectory;
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
	getBtnWorkingDirectory().addActionListener(ivjEventHandler);
	getBtnImportDirectory().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("OptionsDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(560, 188);
		setTitle(resOptionsDialog.getString("OptionsDialog_title"));
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setSettings();
	// user code end
}
/**
 * Overwrites.
 */
protected boolean save() {
	// save changes
	settings.setWorkingDirectory(getTxtWorkingDirectory().getText());
	settings.setImportDirectory(getTxtImportDirectory().getText());

	settings.setDiagramWidth(new Integer(getTxtDiagramWidth().getText()));
	settings.setDiagramHeight(new Integer(getTxtDiagramHeight().getText()));
	
	LauncherView.getInstance().getSettings().save();
	return super.save();
}
/**
 * Show Settings-Values.
 */
private void setSettings() {
	settings = LauncherView.getSettings();
	
	getTxtWorkingDirectory().setText(settings.getWorkingDirectory());
	getTxtImportDirectory().setText(settings.getImportDirectory());

	getTxtDiagramWidth().setText(settings.getDiagramWidth().toString());
	getTxtDiagramHeight().setText(settings.getDiagramHeight().toString());
}
}
