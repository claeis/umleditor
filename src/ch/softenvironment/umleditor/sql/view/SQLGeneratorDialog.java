package ch.softenvironment.umleditor.sql.view;

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
import java.io.*;
import ch.ehi.umleditor.application.*;
import ch.ehi.basics.view.*;
import ch.softenvironment.umleditor.sql.*;


/**
 * Dialog to control SQL-Code to be generated.
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.2 $ $Date: 2004-01-03 15:49:52 $
 */
public class SQLGeneratorDialog extends ch.softenvironment.view.BaseDialog {
	private ch.ehi.uml1_4.foundation.core.Namespace packageElement = null;
	private String fileName = null;
	// generated code
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JCheckBox ivjChxCreateDate = null;
	private javax.swing.JCheckBox ivjChxCreateTables = null;
	private javax.swing.JCheckBox ivjChxDropTables = null;
	private javax.swing.JCheckBox ivjChxLastChange = null;
	private javax.swing.JCheckBox ivjChxObjecID = null;
	private javax.swing.JCheckBox ivjChxUserID = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JLabel ivjLblTechFields = null;
	private javax.swing.JTextField ivjTxtCreateDate = null;
	private javax.swing.JTextField ivjTxtLastChange = null;
	private javax.swing.JTextField ivjTxtObjectID = null;
	private javax.swing.JTextField ivjTxtUserID = null;
	private javax.swing.JButton ivjBtnChoosePackage = null;
	private javax.swing.JLabel ivjLblFile = null;
	private javax.swing.JLabel ivjLblPackage = null;
	private javax.swing.JTextField ivjTxtFile = null;
	private javax.swing.JTextField ivjTxtPackage = null;
	private javax.swing.JCheckBox ivjChxCreateComments = null;
	private javax.swing.JLabel ivjLblDomains = null;
	private javax.swing.JRadioButton ivjRbtSQLMyTypes = null;
	private javax.swing.JRadioButton ivjRbtSQLStandardTypes = null;
	private javax.swing.JCheckBox ivjChxCreateDomains = null;
	private javax.swing.JButton ivjBtnOk = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == SQLGeneratorDialog.this.getBtnCancel()) 
				connEtoC1(e);
			if (e.getSource() == SQLGeneratorDialog.this.getBtnOk()) 
				connEtoC2(e);
			if (e.getSource() == SQLGeneratorDialog.this.getBtnChoosePackage()) 
				connEtoC3(e);
			if (e.getSource() == SQLGeneratorDialog.this.getBtnChooseFile()) 
				connEtoC4(e);
		};
	};
	private javax.swing.JButton ivjBtnChooseFile = null;
/**
 * SQLGeneratorDialog constructor comment.
 * @param owner java.awt.Dialog
 * @param title java.lang.String
 * @param modal boolean
 */
public SQLGeneratorDialog(java.awt.Dialog owner, String title, boolean modal) {
	super(owner, title, modal);
}
/**
 * SQLGeneratorDialog constructor comment.
 * @param owner java.awt.Frame
 * @param title java.lang.String
 * @param modal boolean
 */
public SQLGeneratorDialog(java.awt.Frame owner, String title, boolean modal) {
	super(owner, title, modal);
}
/**
 * SQLGeneratorDialog constructor comment.
 * @param owner java.awt.Frame
 * @param modal boolean
 */
public SQLGeneratorDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * Comment
 */
private void checkOK() {
	getBtnOk().setEnabled((packageElement != null) && (!ch.softenvironment.util.StringUtils.isNullOrEmpty(fileName)));
}
/**
 * Comment
 */
private void chooseFile() {
	FileChooser saveDialog =  new FileChooser(LauncherView.getSettings().getWorkingDirectory());
//		saveDialog.setDialogTitle(rsrc.getString("CTobjcatFileSelector"));
		saveDialog.addChoosableFileFilter(LauncherView.createSQLFilter());

		if (saveDialog.showSaveDialog(this) == FileChooser.APPROVE_OPTION) {
			LauncherView.getSettings().setWorkingDirectory(saveDialog.getCurrentDirectory().getAbsolutePath());
			fileName = saveDialog.getSelectedFile().getAbsolutePath();
			checkOK();
		}
}
/**
 * Choose a Package to create Database Modell.
 */
private void choosePackage() {
	PackageSelectionDialog packageDialog = new PackageSelectionDialog(this, "Paket für SQL DDL Generierung auswählen", true, LauncherView.getInstance().getModel());
	if (packageDialog.isSaved()) {
		packageElement = packageDialog.getSelectedPackage();
		getTxtPackage().setText(packageElement.getDefLangName());
		checkOK();
	}
}
/**
 * connEtoC1:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> SQLGeneratorDialog.cancelPressed()V)
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
 * connEtoC2:  (BtbOk.action.actionPerformed(java.awt.event.ActionEvent) --> SQLGeneratorDialog.okPressed()V)
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
 * connEtoC3:  (BtnChoosePackage.action.actionPerformed(java.awt.event.ActionEvent) --> SQLGeneratorDialog.choosePackage()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.choosePackage();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (BtnChoosePackage1.action.actionPerformed(java.awt.event.ActionEvent) --> SQLGeneratorDialog.chooseFile()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.chooseFile();
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
			ivjBaseDialogContentPane.setLayout(null);
			getBaseDialogContentPane().add(getChxDropTables(), getChxDropTables().getName());
			getBaseDialogContentPane().add(getChxCreateTables(), getChxCreateTables().getName());
			getBaseDialogContentPane().add(getLblTechFields(), getLblTechFields().getName());
			getBaseDialogContentPane().add(getChxObjecID(), getChxObjecID().getName());
			getBaseDialogContentPane().add(getTxtObjectID(), getTxtObjectID().getName());
			getBaseDialogContentPane().add(getChxCreateDate(), getChxCreateDate().getName());
			getBaseDialogContentPane().add(getTxtCreateDate(), getTxtCreateDate().getName());
			getBaseDialogContentPane().add(getChxLastChange(), getChxLastChange().getName());
			getBaseDialogContentPane().add(getTxtLastChange(), getTxtLastChange().getName());
			getBaseDialogContentPane().add(getChxUserID(), getChxUserID().getName());
			getBaseDialogContentPane().add(getTxtUserID(), getTxtUserID().getName());
			getBaseDialogContentPane().add(getBtnOk(), getBtnOk().getName());
			getBaseDialogContentPane().add(getBtnCancel(), getBtnCancel().getName());
			getBaseDialogContentPane().add(getLblPackage(), getLblPackage().getName());
			getBaseDialogContentPane().add(getTxtPackage(), getTxtPackage().getName());
			getBaseDialogContentPane().add(getBtnChoosePackage(), getBtnChoosePackage().getName());
			getBaseDialogContentPane().add(getLblFile(), getLblFile().getName());
			getBaseDialogContentPane().add(getTxtFile(), getTxtFile().getName());
			getBaseDialogContentPane().add(getBtnChooseFile(), getBtnChooseFile().getName());
			getBaseDialogContentPane().add(getChxCreateComments(), getChxCreateComments().getName());
			getBaseDialogContentPane().add(getLblDomains(), getLblDomains().getName());
			getBaseDialogContentPane().add(getRbtSQLStandardTypes(), getRbtSQLStandardTypes().getName());
			getBaseDialogContentPane().add(getRbtSQLMyTypes(), getRbtSQLMyTypes().getName());
			getBaseDialogContentPane().add(getChxCreateDomains(), getChxCreateDomains().getName());
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
 * Return the BtnCancel property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new javax.swing.JButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText("Abbrechen");
			ivjBtnCancel.setBounds(302, 339, 119, 25);
			// user code begin {1}
			ivjBtnCancel.setText(getCancelString());
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
 * Return the BtnChoosePackage1 property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnChooseFile() {
	if (ivjBtnChooseFile == null) {
		try {
			ivjBtnChooseFile = new javax.swing.JButton();
			ivjBtnChooseFile.setName("BtnChooseFile");
			ivjBtnChooseFile.setText("...");
			ivjBtnChooseFile.setBounds(404, 62, 51, 25);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnChooseFile;
}
/**
 * Return the BtnChoosePackage property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnChoosePackage() {
	if (ivjBtnChoosePackage == null) {
		try {
			ivjBtnChoosePackage = new javax.swing.JButton();
			ivjBtnChoosePackage.setName("BtnChoosePackage");
			ivjBtnChoosePackage.setText("...");
			ivjBtnChoosePackage.setBounds(404, 35, 51, 25);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnChoosePackage;
}
/**
 * Return the BtbOk property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnOk() {
	if (ivjBtnOk == null) {
		try {
			ivjBtnOk = new javax.swing.JButton();
			ivjBtnOk.setName("BtnOk");
			ivjBtnOk.setText("OK");
			ivjBtnOk.setBounds(173, 339, 119, 25);
			// user code begin {1}
			ivjBtnOk.setText(getOKString());
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
 * Return the ChxCreateComments property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxCreateComments() {
	if (ivjChxCreateComments == null) {
		try {
			ivjChxCreateComments = new javax.swing.JCheckBox();
			ivjChxCreateComments.setName("ChxCreateComments");
			ivjChxCreateComments.setText("CREATE Comment");
			ivjChxCreateComments.setBounds(30, 163, 165, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxCreateComments;
}
/**
 * Return the ChxCreateDate property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxCreateDate() {
	if (ivjChxCreateDate == null) {
		try {
			ivjChxCreateDate = new javax.swing.JCheckBox();
			ivjChxCreateDate.setName("ChxCreateDate");
			ivjChxCreateDate.setSelected(true);
			ivjChxCreateDate.setText("Erstellungs-Datum");
			ivjChxCreateDate.setBounds(32, 250, 165, 22);
			ivjChxCreateDate.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxCreateDate;
}
/**
 * Return the ChxCreateDomains property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxCreateDomains() {
	if (ivjChxCreateDomains == null) {
		try {
			ivjChxCreateDomains = new javax.swing.JCheckBox();
			ivjChxCreateDomains.setName("ChxCreateDomains");
			ivjChxCreateDomains.setSelected(true);
			ivjChxCreateDomains.setText("CREATE Domains");
			ivjChxCreateDomains.setBounds(30, 139, 165, 22);
			ivjChxCreateDomains.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxCreateDomains;
}
/**
 * Return the ChxCreateTables property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxCreateTables() {
	if (ivjChxCreateTables == null) {
		try {
			ivjChxCreateTables = new javax.swing.JCheckBox();
			ivjChxCreateTables.setName("ChxCreateTables");
			ivjChxCreateTables.setSelected(true);
			ivjChxCreateTables.setText("CREATE Tables");
			ivjChxCreateTables.setBounds(30, 114, 165, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxCreateTables;
}
/**
 * Return the ChxDropTables property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxDropTables() {
	if (ivjChxDropTables == null) {
		try {
			ivjChxDropTables = new javax.swing.JCheckBox();
			ivjChxDropTables.setName("ChxDropTables");
			ivjChxDropTables.setText("DROP Tables");
			ivjChxDropTables.setBounds(30, 88, 165, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxDropTables;
}
/**
 * Return the ChxLastChange property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxLastChange() {
	if (ivjChxLastChange == null) {
		try {
			ivjChxLastChange = new javax.swing.JCheckBox();
			ivjChxLastChange.setName("ChxLastChange");
			ivjChxLastChange.setSelected(true);
			ivjChxLastChange.setText("Letzte Änderung");
			ivjChxLastChange.setBounds(32, 279, 165, 22);
			ivjChxLastChange.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxLastChange;
}
/**
 * Return the ChxObjecID property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxObjecID() {
	if (ivjChxObjecID == null) {
		try {
			ivjChxObjecID = new javax.swing.JCheckBox();
			ivjChxObjecID.setName("ChxObjecID");
			ivjChxObjecID.setSelected(true);
			ivjChxObjecID.setText("Objekt-Identität");
			ivjChxObjecID.setBounds(32, 220, 165, 22);
			ivjChxObjecID.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxObjecID;
}
/**
 * Return the ChxUserID property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxUserID() {
	if (ivjChxUserID == null) {
		try {
			ivjChxUserID = new javax.swing.JCheckBox();
			ivjChxUserID.setName("ChxUserID");
			ivjChxUserID.setSelected(true);
			ivjChxUserID.setText("Benutzer-ID");
			ivjChxUserID.setBounds(32, 306, 165, 22);
			ivjChxUserID.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxUserID;
}
/**
 * Return the LblDomains property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblDomains() {
	if (ivjLblDomains == null) {
		try {
			ivjLblDomains = new javax.swing.JLabel();
			ivjLblDomains.setName("LblDomains");
			ivjLblDomains.setText("Typisierung (DOMAIN):");
			ivjLblDomains.setBounds(200, 118, 135, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblDomains;
}
/**
 * Return the LblFile property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblFile() {
	if (ivjLblFile == null) {
		try {
			ivjLblFile = new javax.swing.JLabel();
			ivjLblFile.setName("LblFile");
			ivjLblFile.setText("Datei (ASCII):");
			ivjLblFile.setBounds(30, 61, 99, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblFile;
}
/**
 * Return the LblPackage property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblPackage() {
	if (ivjLblPackage == null) {
		try {
			ivjLblPackage = new javax.swing.JLabel();
			ivjLblPackage.setName("LblPackage");
			ivjLblPackage.setText("Paket:");
			ivjLblPackage.setBounds(30, 37, 89, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblPackage;
}
/**
 * Return the LblTechFields property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblTechFields() {
	if (ivjLblTechFields == null) {
		try {
			ivjLblTechFields = new javax.swing.JLabel();
			ivjLblTechFields.setName("LblTechFields");
			ivjLblTechFields.setText("Technische Felder:");
			ivjLblTechFields.setBounds(20, 194, 123, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblTechFields;
}
/**
 * Return the RbtSQLMyTypes property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtSQLMyTypes() {
	if (ivjRbtSQLMyTypes == null) {
		try {
			ivjRbtSQLMyTypes = new javax.swing.JRadioButton();
			ivjRbtSQLMyTypes.setName("RbtSQLMyTypes");
			ivjRbtSQLMyTypes.setSelected(true);
			ivjRbtSQLMyTypes.setText("Eigene DOMAINS");
			ivjRbtSQLMyTypes.setBounds(344, 142, 184, 22);
			ivjRbtSQLMyTypes.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtSQLMyTypes;
}
/**
 * Return the RbtSQLStandardTypes property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtSQLStandardTypes() {
	if (ivjRbtSQLStandardTypes == null) {
		try {
			ivjRbtSQLStandardTypes = new javax.swing.JRadioButton();
			ivjRbtSQLStandardTypes.setName("RbtSQLStandardTypes");
			ivjRbtSQLStandardTypes.setText("SQL Standard Typen");
			ivjRbtSQLStandardTypes.setBounds(344, 116, 184, 22);
			ivjRbtSQLStandardTypes.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtSQLStandardTypes;
}
/**
 * Return the TxtCreateDate property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtCreateDate() {
	if (ivjTxtCreateDate == null) {
		try {
			ivjTxtCreateDate = new javax.swing.JTextField();
			ivjTxtCreateDate.setName("TxtCreateDate");
			ivjTxtCreateDate.setToolTipText("Vorschlag des Feldnamens");
			ivjTxtCreateDate.setText("CDAT");
			ivjTxtCreateDate.setBounds(202, 251, 122, 20);
			ivjTxtCreateDate.setEnabled(false);
			// user code begin {1}
			ivjTxtCreateDate.setText("T_CreateDate");
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtCreateDate;
}
/**
 * Return the JTextField11 property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtFile() {
	if (ivjTxtFile == null) {
		try {
			ivjTxtFile = new javax.swing.JTextField();
			ivjTxtFile.setName("TxtFile");
			ivjTxtFile.setBounds(200, 64, 194, 20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtFile;
}
/**
 * Return the TxtLastChange property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtLastChange() {
	if (ivjTxtLastChange == null) {
		try {
			ivjTxtLastChange = new javax.swing.JTextField();
			ivjTxtLastChange.setName("TxtLastChange");
			ivjTxtLastChange.setToolTipText("Vorschlag des Feldnamens");
			ivjTxtLastChange.setText("LCHG");
			ivjTxtLastChange.setBounds(202, 280, 122, 20);
			ivjTxtLastChange.setEnabled(false);
			// user code begin {1}
			ivjTxtLastChange.setText("T_LastChange");
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtLastChange;
}
/**
 * Return the TxtObjectID property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtObjectID() {
	if (ivjTxtObjectID == null) {
		try {
			ivjTxtObjectID = new javax.swing.JTextField();
			ivjTxtObjectID.setName("TxtObjectID");
			ivjTxtObjectID.setToolTipText("Vorschlag des Feldnamens");
			ivjTxtObjectID.setText("ID");
			ivjTxtObjectID.setBounds(202, 223, 122, 20);
			ivjTxtObjectID.setEnabled(false);
			// user code begin {1}
			ivjTxtObjectID.setText("T_Id");
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtObjectID;
}
/**
 * Return the JTextField1 property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtPackage() {
	if (ivjTxtPackage == null) {
		try {
			ivjTxtPackage = new javax.swing.JTextField();
			ivjTxtPackage.setName("TxtPackage");
			ivjTxtPackage.setBounds(200, 36, 194, 20);
			ivjTxtPackage.setEditable(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtPackage;
}
/**
 * Return the TxtUserID property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtUserID() {
	if (ivjTxtUserID == null) {
		try {
			ivjTxtUserID = new javax.swing.JTextField();
			ivjTxtUserID.setName("TxtUserID");
			ivjTxtUserID.setToolTipText("Vorschlag des Feldnamens");
			ivjTxtUserID.setText("USER");
			ivjTxtUserID.setBounds(202, 307, 122, 20);
			ivjTxtUserID.setEnabled(false);
			// user code begin {1}
			ivjTxtUserID.setText("T_User");
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtUserID;
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
	getBtnChoosePackage().addActionListener(ivjEventHandler);
	getBtnChooseFile().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("SQLGeneratorDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(564, 411);
		setTitle("SQL-Code Generieren");
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	checkOK();
	// user code end
}
/**
 * Overwrites.
 * @see #okPressed()
 * @see #applyPressed()
 * @return boolean whether saving was successful or not
 */
protected boolean save() {
	try {
		File file = new File(fileName);
		FileOutputStream outStream = new FileOutputStream(file);
		PrintStream printStream = new PrintStream(outStream);
		
		SQLCodeGeneratingVisitor sqlInterface = new SQLCodeGeneratingVisitor();
		sqlInterface.accept(packageElement, printStream, getChxDropTables().isSelected(), getChxCreateTables().isSelected(), getChxCreateComments().isSelected(), getChxCreateDomains().isSelected(), null);
		outStream.flush();
		outStream.close();

		LauncherView.getInstance().log("SQL-Export", "Erfolgreich ausgeführt!");
	} catch(IOException ex) {
		LauncherView.getInstance().log("SQL-Export", "Fehlerhaft: " + ex.getLocalizedMessage());
	}
	return super.save();
}
}
