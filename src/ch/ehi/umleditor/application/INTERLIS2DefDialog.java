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
import ch.ehi.basics.view.*;
import javax.swing.*;

import java.awt.Point;
import java.util.*;

import ch.ehi.interlis.modeltopicclass.*;
import ch.softenvironment.view.*;
/**
 * User Interface for a INTERLIS2Def.
 * 
 * @author Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.5 $ $Date: 2008-04-08 08:05:02 $
 */
public class INTERLIS2DefDialog extends BaseDialog implements ListMenuChoice {
	// ModelElement
	private static java.util.ResourceBundle resINTERLIS2DefDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/INTERLIS2DefDialog");  //$NON-NLS-1$
	ch.ehi.interlis.modeltopicclass.INTERLIS2Def interlis2Def = null;
	private JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JButton ivjBtnCancel = null;
	private JButton ivjBtnOk = null;
	private JTabbedPane ivjTbpGeneral = null;
	private JButton ivjBtnApply = null;
	private DescriptionPanel ivjPnlDescription = null;
	private JTextField ivjTxtINTERLISLanguageVersion = null;
	private JLabel ivjLblInterlisLanguageVersion = null;
	private javax.swing.table.TableColumn ivjTbcFilename = null;
	private JScrollPane ivjScpFilename = null;
	private JTable ivjTblFileName = null;
	private javax.swing.table.TableColumn ivjTbcLanguage = null;
	private JTextField ivjTxtFilename = null;
	private JPopupMenu ivjJPopupMenu1 = null;
	private JMenuItem ivjMniChange = null;
	private JButton ivjBtnCancelFilename = null;
	private JButton ivjBtnFilenameOK = null;
	private JDialog ivjDlgFilename = null;
	private JPanel ivjJDialogContentPane = null;
	private JLabel ivjLblFilename = null;
	private JLabel ivjLblLanguage = null;
	private JTextField ivjTxtLanguage = null;
	private JButton ivjBtnFileSearch = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.MouseListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == INTERLIS2DefDialog.this.getBtnOk()) 
				connEtoC1(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getBtnCancel()) 
				connEtoC2(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getBtnApply()) 
				connEtoC3(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getMniChange()) 
				connEtoC6(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getBtnCancelFilename()) 
				connEtoM1(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getBtnFilenameOK()) 
				connEtoC7(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getBtnFileSearch()) 
				connEtoC8(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == INTERLIS2DefDialog.this.getTxtINTERLISLanguageVersion()) 
				connEtoM2(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getTxtFilename()) 
				connEtoM3(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == INTERLIS2DefDialog.this.getScpFilename()) 
				connEtoC9(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getTblFileName()) 
				connEtoC10(e);
		};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == INTERLIS2DefDialog.this.getScpFilename()) 
				connEtoC4(e);
			if (e.getSource() == INTERLIS2DefDialog.this.getTblFileName()) 
				connEtoC5(e);
		};
	};
/**
 * Constructor
 */
public INTERLIS2DefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();
	setRelativeLocation(owner);
	setElement(element);
	show();
}
public void adaptUserAction(EventObject event, Object control) {
	getMniChange().setEnabled(getTblFileName().getSelectedRow() >= 0);
}
/**
 * Show a save Dialog.
 */
private void btnFileSearch() {
	FileChooser dialog = new FileChooser(LauncherView.getSettings().getWorkingDirectory());
	dialog.setDialogTitle(resINTERLIS2DefDialog.getString("CTAssignFilename")); //$NON-NLS-1$
	dialog.addChoosableFileFilter(LauncherView.createInterlisModelFilter());

	if (dialog.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
		try {
			LauncherView.getSettings().setWorkingDirectory(dialog.getCurrentDirectory().getAbsolutePath());
			String fileName = dialog.getSelectedFile().getAbsolutePath();
			getTxtFilename().setText(fileName);
 		} catch(Throwable e) {
			handleException(e);
	 	}
	}
}
/**
 * connEtoC1:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> UmlModelDialog.okPressed()V)
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
 * connEtoC10:  (TblFileName.mouse.mousePressed(java.awt.event.MouseEvent) --> INTERLIS2DefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC10(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getJPopupMenu1());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> Ili2ModelSetDialog.cancelPressed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
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
 * connEtoC3:  (BtnApply.action.actionPerformed(java.awt.event.ActionEvent) --> Ili2ModelSetDialog.applyPressed()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.applyPressed();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (ScpFilename.mouse.mouseReleased(java.awt.event.MouseEvent) --> INTERLIS2DefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getJPopupMenu1());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (TblFileName.mouse.mouseReleased(java.awt.event.MouseEvent) --> INTERLIS2DefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getJPopupMenu1());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (MniChange.action.actionPerformed(java.awt.event.ActionEvent) --> INTERLIS2DefDialog.mniChange()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniChange();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC7:  (BtnFilenameOK.action.actionPerformed(java.awt.event.ActionEvent) --> INTERLIS2DefDialog.saveFileName()Z)
 * @return boolean
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private boolean connEtoC7(java.awt.event.ActionEvent arg1) {
	boolean connEtoC7Result = false;
	try {
		// user code begin {1}
		// user code end
		connEtoC7Result = this.saveFileName();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
	return connEtoC7Result;
}
/**
 * connEtoC8:  (BtnFileSearch.action.actionPerformed(java.awt.event.ActionEvent) --> INTERLIS2DefDialog.btnFileSearch()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC8(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnFileSearch();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC9:  (ScpFilename.mouse.mousePressed(java.awt.event.MouseEvent) --> INTERLIS2DefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC9(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getJPopupMenu1());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM1:  (BtnCancelFilename.action.actionPerformed(java.awt.event.ActionEvent) --> DlgFilename.dispose()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getDlgFilename().dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM2:  (TxtINTERLISLanguageVersion.focus.focusGained(java.awt.event.FocusEvent) --> TxtINTERLISLanguageVersion.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM2(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtINTERLISLanguageVersion().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM3:  (TxtFilename.focus.focusGained(java.awt.event.FocusEvent) --> TxtFilename.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM3(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtFilename().selectAll();
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
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 4;
			constraintsBtnOk.ipadx = 64;
			constraintsBtnOk.insets = new java.awt.Insets(3, 16, 9, 5);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 4;
			constraintsBtnCancel.ipadx = 14;
			constraintsBtnCancel.insets = new java.awt.Insets(3, 3, 9, 3);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
			constraintsBtnApply.gridx = 3; constraintsBtnApply.gridy = 4;
			constraintsBtnApply.ipadx = 8;
			constraintsBtnApply.insets = new java.awt.Insets(3, 3, 9, 55);
			getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

			java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
			constraintsTbpGeneral.gridx = 1; constraintsTbpGeneral.gridy = 3;
			constraintsTbpGeneral.gridwidth = 3;
			constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpGeneral.weightx = 1.0;
			constraintsTbpGeneral.weighty = 1.0;
			constraintsTbpGeneral.ipadx = 372;
			constraintsTbpGeneral.ipady = 100;
			constraintsTbpGeneral.insets = new java.awt.Insets(2, 10, 2, 13);
			getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

			java.awt.GridBagConstraints constraintsLblInterlisLanguageVersion = new java.awt.GridBagConstraints();
			constraintsLblInterlisLanguageVersion.gridx = 1; constraintsLblInterlisLanguageVersion.gridy = 2;
			constraintsLblInterlisLanguageVersion.ipadx = 38;
			constraintsLblInterlisLanguageVersion.insets = new java.awt.Insets(7, 10, 6, 2);
			getBaseDialogContentPane().add(getLblInterlisLanguageVersion(), constraintsLblInterlisLanguageVersion);

			java.awt.GridBagConstraints constraintsTxtINTERLISLanguageVersion = new java.awt.GridBagConstraints();
			constraintsTxtINTERLISLanguageVersion.gridx = 2; constraintsTxtINTERLISLanguageVersion.gridy = 2;
			constraintsTxtINTERLISLanguageVersion.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtINTERLISLanguageVersion.weightx = 1.0;
			constraintsTxtINTERLISLanguageVersion.ipadx = 57;
			constraintsTxtINTERLISLanguageVersion.insets = new java.awt.Insets(6, 4, 1, 52);
			getBaseDialogContentPane().add(getTxtINTERLISLanguageVersion(), constraintsTxtINTERLISLanguageVersion);

			java.awt.GridBagConstraints constraintsScpFilename = new java.awt.GridBagConstraints();
			constraintsScpFilename.gridx = 1; constraintsScpFilename.gridy = 1;
			constraintsScpFilename.gridwidth = 3;
			constraintsScpFilename.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpFilename.weightx = 1.0;
			constraintsScpFilename.weighty = 1.0;
			constraintsScpFilename.ipadx = 381;
			constraintsScpFilename.ipady = 89;
			constraintsScpFilename.insets = new java.awt.Insets(15, 10, 5, 13);
			getBaseDialogContentPane().add(getScpFilename(), constraintsScpFilename);
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
 * Return the BtnApply property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnApply() {
	if (ivjBtnApply == null) {
		try {
			ivjBtnApply = new javax.swing.JButton();
			ivjBtnApply.setName("BtnApply");
			ivjBtnApply.setText("Übernehmen");
			// user code begin {1}
			ivjBtnApply.setText(getApplyString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnApply;
}
/**
 * Return the JButton2 property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnCancel() {
	if (ivjBtnCancel == null) {
		try {
			ivjBtnCancel = new javax.swing.JButton();
			ivjBtnCancel.setName("BtnCancel");
			ivjBtnCancel.setText("Abbrechen");
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
 * Return the BtnCancelFilename property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnCancelFilename() {
	if (ivjBtnCancelFilename == null) {
		try {
			ivjBtnCancelFilename = new javax.swing.JButton();
			ivjBtnCancelFilename.setName("BtnCancelFilename");
			ivjBtnCancelFilename.setText("Abbrechen");
			// user code begin {1}
			ivjBtnCancelFilename.setText(getCancelString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnCancelFilename;
}
/**
 * Return the BtnFilenameOK property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnFilenameOK() {
	if (ivjBtnFilenameOK == null) {
		try {
			ivjBtnFilenameOK = new javax.swing.JButton();
			ivjBtnFilenameOK.setName("BtnFilenameOK");
			ivjBtnFilenameOK.setText("OK");
			// user code begin {1}
			ivjBtnFilenameOK.setText(getOKString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnFilenameOK;
}
/**
 * Return the BtnFileSearch property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnFileSearch() {
	if (ivjBtnFileSearch == null) {
		try {
			ivjBtnFileSearch = new javax.swing.JButton();
			ivjBtnFileSearch.setName("BtnFileSearch");
			ivjBtnFileSearch.setText("...");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnFileSearch;
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
			ivjBtnOk.setText("Ok");
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
 * Return the DlgFilename property value.
 * @return javax.swing.JDialog
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JDialog getDlgFilename() {
	if (ivjDlgFilename == null) {
		try {
			ivjDlgFilename = new javax.swing.JDialog(this, true);
			ivjDlgFilename.setName("DlgFilename");
			ivjDlgFilename.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			ivjDlgFilename.setBounds(124, 215, 488, 148);
			ivjDlgFilename.setTitle(resINTERLIS2DefDialog.getString("DlgFilename_title"));
			getDlgFilename().setContentPane(getJDialogContentPane());
			// user code begin {1}
			// @see BaseDialog#setRelativeLocation()
			ivjDlgFilename.setLocation(new Point(this.getX() + BaseFrame.X_CHILD_OFFSET,
						this.getY() + BaseFrame.Y_CHILD_OFFSET));		
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjDlgFilename;
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

			java.awt.GridBagConstraints constraintsLblLanguage = new java.awt.GridBagConstraints();
			constraintsLblLanguage.gridx = 1; constraintsLblLanguage.gridy = 1;
			constraintsLblLanguage.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblLanguage.ipadx = 89;
			constraintsLblLanguage.insets = new java.awt.Insets(25, 8, 5, 3);
			getJDialogContentPane().add(getLblLanguage(), constraintsLblLanguage);

			java.awt.GridBagConstraints constraintsLblFilename = new java.awt.GridBagConstraints();
			constraintsLblFilename.gridx = 1; constraintsLblFilename.gridy = 2;
			constraintsLblFilename.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblFilename.ipadx = 76;
			constraintsLblFilename.insets = new java.awt.Insets(6, 8, 13, 3);
			getJDialogContentPane().add(getLblFilename(), constraintsLblFilename);

			java.awt.GridBagConstraints constraintsTxtLanguage = new java.awt.GridBagConstraints();
			constraintsTxtLanguage.gridx = 2; constraintsTxtLanguage.gridy = 1;
			constraintsTxtLanguage.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtLanguage.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsTxtLanguage.weightx = 1.0;
			constraintsTxtLanguage.ipadx = 110;
			constraintsTxtLanguage.insets = new java.awt.Insets(21, 4, 3, 21);
			getJDialogContentPane().add(getTxtLanguage(), constraintsTxtLanguage);

			java.awt.GridBagConstraints constraintsBtnFilenameOK = new java.awt.GridBagConstraints();
			constraintsBtnFilenameOK.gridx = 2; constraintsBtnFilenameOK.gridy = 3;
			constraintsBtnFilenameOK.ipadx = 68;
			constraintsBtnFilenameOK.insets = new java.awt.Insets(5, 18, 19, 2);
			getJDialogContentPane().add(getBtnFilenameOK(), constraintsBtnFilenameOK);

			java.awt.GridBagConstraints constraintsBtnCancelFilename = new java.awt.GridBagConstraints();
			constraintsBtnCancelFilename.gridx = 3; constraintsBtnCancelFilename.gridy = 3;
			constraintsBtnCancelFilename.ipadx = 22;
			constraintsBtnCancelFilename.insets = new java.awt.Insets(5, 3, 19, 21);
			getJDialogContentPane().add(getBtnCancelFilename(), constraintsBtnCancelFilename);

			java.awt.GridBagConstraints constraintsTxtFilename = new java.awt.GridBagConstraints();
			constraintsTxtFilename.gridx = 2; constraintsTxtFilename.gridy = 2;
			constraintsTxtFilename.gridwidth = 2;
			constraintsTxtFilename.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtFilename.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsTxtFilename.weightx = 1.0;
			constraintsTxtFilename.ipadx = 269;
			constraintsTxtFilename.insets = new java.awt.Insets(6, 4, 7, 5);
			getJDialogContentPane().add(getTxtFilename(), constraintsTxtFilename);

			java.awt.GridBagConstraints constraintsBtnFileSearch = new java.awt.GridBagConstraints();
			constraintsBtnFileSearch.gridx = 4; constraintsBtnFileSearch.gridy = 2;
			constraintsBtnFileSearch.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsBtnFileSearch.ipadx = -5;
			constraintsBtnFileSearch.insets = new java.awt.Insets(4, 6, 4, 11);
			getJDialogContentPane().add(getBtnFileSearch(), constraintsBtnFileSearch);
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
 * Return the JPopupMenu1 property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getJPopupMenu1() {
	if (ivjJPopupMenu1 == null) {
		try {
			ivjJPopupMenu1 = new javax.swing.JPopupMenu();
			ivjJPopupMenu1.setName("JPopupMenu1");
			ivjJPopupMenu1.add(getMniChange());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJPopupMenu1;
}
/**
 * Return the LblFilename property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblFilename() {
	if (ivjLblFilename == null) {
		try {
			ivjLblFilename = new javax.swing.JLabel();
			ivjLblFilename.setName("LblFilename");
			ivjLblFilename.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjLblFilename.setText("Dateiname:");
			// user code begin {1}
			ivjLblFilename.setText(resINTERLIS2DefDialog.getString("LblFilename_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblFilename;
}
/**
 * Return the LblVersion property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblInterlisLanguageVersion() {
	if (ivjLblInterlisLanguageVersion == null) {
		try {
			ivjLblInterlisLanguageVersion = new javax.swing.JLabel();
			ivjLblInterlisLanguageVersion.setName("LblInterlisLanguageVersion");
			ivjLblInterlisLanguageVersion.setText(resINTERLIS2DefDialog.getString("LblInterlisLanguageVersion_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblInterlisLanguageVersion;
}
/**
 * Return the LblLanguage property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblLanguage() {
	if (ivjLblLanguage == null) {
		try {
			ivjLblLanguage = new javax.swing.JLabel();
			ivjLblLanguage.setName("LblLanguage");
			ivjLblLanguage.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjLblLanguage.setText("Sprache:");
			// user code begin {1}
			ivjLblLanguage.setText(resINTERLIS2DefDialog.getString("LblLanguage_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblLanguage;
}
/**
 * Return the MniChange property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniChange() {
	if (ivjMniChange == null) {
		try {
			ivjMniChange = new javax.swing.JMenuItem();
			ivjMniChange.setName("MniChange");
			ivjMniChange.setText("Ändern...");
			ivjMniChange.setEnabled(false);
			// user code begin {1}
			ivjMniChange.setText(getChangeWindowString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniChange;
}
/**
 * Return the PnlDescription property value.
 * @return ch.ehi.umleditor.application.DescriptionPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private DescriptionPanel getPnlDescription() {
	if (ivjPnlDescription == null) {
		try {
			ivjPnlDescription = new ch.ehi.umleditor.application.DescriptionPanel();
			ivjPnlDescription.setName("PnlDescription");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlDescription;
}
/**
 * Return the JScrollPane1 property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpFilename() {
	if (ivjScpFilename == null) {
		try {
			ivjScpFilename = new javax.swing.JScrollPane();
			ivjScpFilename.setName("ScpFilename");
			ivjScpFilename.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			ivjScpFilename.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			getScpFilename().setViewportView(getTblFileName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpFilename;
}
/**
 * Return the TbcFilename property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcFilename() {
	if (ivjTbcFilename == null) {
		try {
			ivjTbcFilename = new javax.swing.table.TableColumn();
			ivjTbcFilename.setHeaderValue("Dateiname");
			// user code begin {1}
			ivjTbcFilename.setHeaderValue(resINTERLIS2DefDialog.getString("TbcFilename_header"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcFilename;
}
/**
 * Return the TbcLanguage property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcLanguage() {
	if (ivjTbcLanguage == null) {
		try {
			ivjTbcLanguage = new javax.swing.table.TableColumn();
			ivjTbcLanguage.setHeaderValue("Sprache");
			// user code begin {1}
			ivjTbcLanguage.setHeaderValue(resINTERLIS2DefDialog.getString("TbcLanguage_header"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcLanguage;
}
/**
 * Return the ScrollPaneTable property value.
 * @return javax.swing.JTable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTable getTblFileName() {
	if (ivjTblFileName == null) {
		try {
			ivjTblFileName = new javax.swing.JTable();
			ivjTblFileName.setName("TblFileName");
			getScpFilename().setColumnHeaderView(ivjTblFileName.getTableHeader());
//			getScpFilename().getViewport().setBackingStoreEnabled(true);
			ivjTblFileName.setBounds(0, 0, 200, 200);
			ivjTblFileName.setEnabled(true);
			ivjTblFileName.addColumn(getTbcLanguage());
			ivjTblFileName.addColumn(getTbcFilename());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTblFileName;
}
/**
 * Return the TbpGeneral property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTabbedPane getTbpGeneral() {
	if (ivjTbpGeneral == null) {
		try {
			ivjTbpGeneral = new javax.swing.JTabbedPane();
			ivjTbpGeneral.setName("TbpGeneral");
			ivjTbpGeneral.insertTab(getDescriptionString(), null, getPnlDescription(), null, 0);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbpGeneral;
}
/**
 * Return the TxtFilename property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtFilename() {
	if (ivjTxtFilename == null) {
		try {
			ivjTxtFilename = new javax.swing.JTextField();
			ivjTxtFilename.setName("TxtFilename");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtFilename;
}
/**
 * Return the JTextField1 property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtINTERLISLanguageVersion() {
	if (ivjTxtINTERLISLanguageVersion == null) {
		try {
			ivjTxtINTERLISLanguageVersion = new javax.swing.JTextField();
			ivjTxtINTERLISLanguageVersion.setName("TxtINTERLISLanguageVersion");
			ivjTxtINTERLISLanguageVersion.setToolTipText(resINTERLIS2DefDialog.getString("TxtINTERLISLanguageVersion_toolTipText"));
			ivjTxtINTERLISLanguageVersion.setText("");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtINTERLISLanguageVersion;
}
/**
 * Return the TxtLanguage property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtLanguage() {
	if (ivjTxtLanguage == null) {
		try {
			ivjTxtLanguage = new javax.swing.JTextField();
			ivjTxtLanguage.setName("TxtLanguage");
			ivjTxtLanguage.setEditable(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtLanguage;
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
	getBtnOk().addActionListener(ivjEventHandler);
	getBtnCancel().addActionListener(ivjEventHandler);
	getBtnApply().addActionListener(ivjEventHandler);
	getScpFilename().addMouseListener(ivjEventHandler);
	getTblFileName().addMouseListener(ivjEventHandler);
	getMniChange().addActionListener(ivjEventHandler);
	getBtnCancelFilename().addActionListener(ivjEventHandler);
	getBtnFilenameOK().addActionListener(ivjEventHandler);
	getBtnFileSearch().addActionListener(ivjEventHandler);
	getTxtINTERLISLanguageVersion().addFocusListener(ivjEventHandler);
	getTxtFilename().addFocusListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("Ili2ModelSetSpecificationDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(426, 355);
		setTitle(resINTERLIS2DefDialog.getString("Ili2ModelSetSpecificationDialog_title"));
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * @deprecated
 */
private void mniChange() {
	changeObjects(null);
}
/**
 * Save ModelElement changes.
 * @see okPressed()
 * @see applyPressed
 */
protected boolean save() {
	interlis2Def.setVersion((new Double(getTxtINTERLISLanguageVersion().getText())).doubleValue());
	getPnlDescription().getObject();

	return super.save();
}
/**
 * 
 */
private boolean saveFileName() {
	if (!ElementUtils.trySetName(interlis2Def, getTxtFilename().getText(), getTxtLanguage().getText())) {
	    ch.softenvironment.view.BaseDialog.showWarning((java.awt.Component)getDlgFilename(), resINTERLIS2DefDialog.getString("CTNameConflict"), resINTERLIS2DefDialog.getString("CENameExists")); //$NON-NLS-2$ //$NON-NLS-1$
		return false;
	}
	getDlgFilename().dispose();
	setLanguageTable();
	return true;
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	interlis2Def = (ch.ehi.interlis.modeltopicclass.INTERLIS2Def)element;

	setLanguageTable();

//	getTxtFilename().setText(interlis2Def.getDefLangName());
	getTxtINTERLISLanguageVersion().setText((new Double(interlis2Def.getVersion())).toString());
	getPnlDescription().setObject(element);
}
/**
 * Show BaseLanguage and ValidSeconfLanguages with appropriate fileName.
 */
private void setLanguageTable() {
	java.util.Set set = ch.ehi.interlis.tools.ModelElementUtility.getChildElements(interlis2Def, ModelDef.class);
	java.util.Iterator iterator = set.iterator();

	// get the languages
	Set languages = new HashSet();
	while (iterator.hasNext()) {
		ModelDef modelDef = (ModelDef)iterator.next();
		// 1) get the BaseLanguage
		if (modelDef.getBaseLanguage() != null) {
			 languages.add(modelDef.getBaseLanguage());
		}
		// 2) get the ValidSecondLanguages
		languages.addAll(modelDef.getValidSecondLanguages());
	}

	// build a Vector of language and corresponding filename
	Vector filenames = new Vector();
	iterator = languages.iterator();
	while (iterator.hasNext()) {
		Vector row = new Vector(2);
		String language = (String)iterator.next();
		row.add(language);
		row.add(interlis2Def.getName().getValue(language));
		filenames.add(row);
	}	

	getTblFileName().setModel(new EditorTableModel());
	((EditorTableModel)getTblFileName().getModel()).setTranslationFile(filenames.iterator());
}

public void changeObjects(Object source) {
    try {
        int row = getTblFileName().getSelectedRow();
        getTxtLanguage().setText((String)getTblFileName().getModel().getValueAt(row, 0));
        getTxtFilename().setText((String)getTblFileName().getModel().getValueAt(row, 1));
        getDlgFilename().setVisible(true);
    } catch(Throwable e) {
        handleException(e);
    }
}
public void copyObject(Object source) {
    // TODO Auto-generated method stub
    
}
public void newObject(Object source) {
    // TODO Auto-generated method stub
    
}
public void removeObjects(Object source) {
    // TODO Auto-generated method stub
    
}
}
