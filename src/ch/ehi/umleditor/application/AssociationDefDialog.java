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

import ch.ehi.interlis.attributes.*;
import ch.ehi.interlis.associations.*;
import javax.swing.table.*;
import ch.softenvironment.view.*;
/**
 * User Interface for an AssociationDef.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2004-04-27 09:20:44 $
 */
public class AssociationDefDialog extends BaseDialog {
	// keep ModelElement
	private ch.ehi.interlis.associations.AssociationDef associationDef = null;
	private AssociationDefDerived currentViewRef = null;
	private javax.swing.JMenuItem mniMoveDownAttribute = null;
	private javax.swing.JMenuItem mniMoveDownRole = null;
        // generated
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JTabbedPane ivjTbpGeneral = null;
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JTextField ivjTxtName = null;
	private javax.swing.JPanel ivjJPanel1 = null;
	private javax.swing.JButton ivjBtnApply = null;
	private javax.swing.JCheckBox ivjChxAbstract = null;
	private javax.swing.JCheckBox ivjChxFinal = null;
	private javax.swing.JPanel ivjJPanel3 = null;
	private InterlisSyntaxPanel ivjPnlConstraints = null;
	private DescriptionPanel ivjPnlDescription = null;
	private javax.swing.JLabel ivjLblDerivedFrom = null;
	private javax.swing.JScrollPane ivjScpAttributes = null;
	private javax.swing.JScrollPane ivjScpRoles = null;
	private TableColumn ivjTbcAttributeName = null;
	private TableColumn ivjTbcAttributeType = null;
	private TableColumn ivjTbcRoleCardinality = null;
	private TableColumn ivjTbcRoleClassDef = null;
	private TableColumn ivjTbcRoleKind = null;
	private TableColumn ivjTbcRoleName = null;
	private javax.swing.JTable ivjTblAttributes = null;
	private javax.swing.JTable ivjTblRoles = null;
	private javax.swing.JSeparator ivjJSeparator1 = null;
	private javax.swing.JMenuItem ivjMniNewAttribute = null;
	private javax.swing.JMenuItem ivjMniOpenAttributeSpecification = null;
	private javax.swing.JMenuItem ivjMniRemoveAttribute = null;
	private javax.swing.JPopupMenu ivjMnuAttributes = null;
	private javax.swing.JPopupMenu ivjMnuRoles = null;
	private javax.swing.JMenuItem ivjMniOpenRoleSpecification = null;
	private ExtendedPanel ivjPnlExtended = null;
	private ReferencableComboBox ivjCbxViewableRef = null;
	private javax.swing.JSeparator ivjJSeparator2 = null;
	private javax.swing.JMenuItem ivjMniNewRole = null;
	private javax.swing.JMenuItem ivjMniRemoveRoleDef = null;
	private javax.swing.DefaultListSelectionModel ivjLocalColumnModelDefaultListSelectionModel = null;
	private javax.swing.JPanel ivjPnlAttributes = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.MouseListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == AssociationDefDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == AssociationDefDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == AssociationDefDialog.this.getBtnApply())
				connEtoC3(e);
			if (e.getSource() == AssociationDefDialog.this.getMniOpenRoleSpecification())
				connEtoC6(e);
			if (e.getSource() == AssociationDefDialog.this.getMniOpenAttributeSpecification())
				connEtoC9(e);
			if (e.getSource() == AssociationDefDialog.this.getMniNewAttribute())
				connEtoC10(e);
			if (e.getSource() == AssociationDefDialog.this.getMniRemoveAttribute())
				connEtoC11(e);
			if (e.getSource() == AssociationDefDialog.this.getMniNewRole())
				connEtoC12(e);
			if (e.getSource() == AssociationDefDialog.this.getMniRemoveRoleDef())
				connEtoC13(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == AssociationDefDialog.this.getTxtName())
				connEtoM1(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == AssociationDefDialog.this.getTblAttributes())
				connEtoC8(e);
			if (e.getSource() == AssociationDefDialog.this.getScpAttributes())
				connEtoC14(e);
		};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == AssociationDefDialog.this.getScpRoles())
				connEtoC4(e);
			if (e.getSource() == AssociationDefDialog.this.getTblRoles())
				connEtoC5(e);
			if (e.getSource() == AssociationDefDialog.this.getScpAttributes())
				connEtoC7(e);
			if (e.getSource() == AssociationDefDialog.this.getTblAttributes())
				connEtoC15(e);
			if (e.getSource() == AssociationDefDialog.this.getScpRoles())
				connEtoC16(e);
			if (e.getSource() == AssociationDefDialog.this.getTblRoles())
				connEtoC17(e);
		};
	};
/**
 * Constructor
 */
public AssociationDefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();
	setRelativeLocation(owner);
	setElement(element);
	show();
}
/**
 * Adapt the given PopupMenu before displaying it (for e.g. disable Items).
 */
protected void adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	if (popupMenu.equals(getMnuAttributes())) {
		boolean isSelected = getTblAttributes().getSelectedRow() >= 0;
		getMniOpenAttributeSpecification().setEnabled(isSelected);
		getMniRemoveAttribute().setEnabled(isSelected);
		mniMoveDownAttribute.setEnabled(isSelected);
	} else {
		// must be Roles
		boolean isSelected = getTblRoles().getSelectedRow() >= 0;
		getMniOpenRoleSpecification().setEnabled(isSelected);
		getMniRemoveRoleDef().setEnabled(isSelected);
		mniMoveDownRole.setEnabled(isSelected);
	}
}
/**
 * connEtoC1:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> ClassDefDialog.okPressed()V)
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
 * connEtoC10:  (MniNewAttribute.action.actionPerformed(java.awt.event.ActionEvent) --> AssociationDefDialog.mniNewAttribute()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC10(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniNewAttribute();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC11:  (MniRemoveAttribute.action.actionPerformed(java.awt.event.ActionEvent) --> AssociationDefDialog.mniRemoveAttribute()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC11(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniRemoveAttribute();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC12:  (MniNewRole.action.actionPerformed(java.awt.event.ActionEvent) --> AssociationDefDialog.mniNewRole()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC12(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniNewRole();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC13:  (MniRemoveRoleDef.action.actionPerformed(java.awt.event.ActionEvent) --> AssociationDefDialog.mniRemoveRoleDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC13(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniRemoveRoleDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC14:  (ScpAttributes.mouse.mouseReleased(java.awt.event.MouseEvent) --> AssociationDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC14(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuAttributes());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC15:  (TblAttributes.mouse.mouseReleased(java.awt.event.MouseEvent) --> AssociationDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC15(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuAttributes());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC16:  (ScpRoles.mouse.mouseReleased(java.awt.event.MouseEvent) --> AssociationDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC16(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuRoles());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC17:  (TblRoles.mouse.mouseReleased(java.awt.event.MouseEvent) --> AssociationDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC17(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuRoles());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> ClassDefDialog.cancelPressed()V)
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
 * connEtoC3:  (BtnApply.action.actionPerformed(java.awt.event.ActionEvent) --> ClassDefDialog.applyPressed()V)
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
 * connEtoC4:  (ScpRoles.mouse.mouseReleased(java.awt.event.MouseEvent) --> AssociationDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuRoles());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (TblRoles.mouse.mouseReleased(java.awt.event.MouseEvent) --> AssociationDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuRoles());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (MniOpenAttributeSpecication1.action.actionPerformed(java.awt.event.ActionEvent) --> AssociationDefDialog.mniShowRoleSpecication()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniShowRoleSpecication();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC7:  (ScpAttributes.mouse.mouseReleased(java.awt.event.MouseEvent) --> AssociationDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC7(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuAttributes());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC8:  (TblAttributes.mouse.mouseReleased(java.awt.event.MouseEvent) --> AssociationDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC8(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuAttributes());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC9:  (MniOpenAttributeSpecification.action.actionPerformed(java.awt.event.ActionEvent) --> AssociationDefDialog.mniShowAttributeSpecification()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC9(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniShowAttributeSpecification();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM1:  (TxtName.focus.focusGained(java.awt.event.FocusEvent) --> TxtName.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtName().selectAll();
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

			java.awt.GridBagConstraints constraintsLblName = new java.awt.GridBagConstraints();
			constraintsLblName.gridx = 1; constraintsLblName.gridy = 1;
			constraintsLblName.ipadx = 104;
			constraintsLblName.insets = new java.awt.Insets(22, 10, 8, 5);
			getBaseDialogContentPane().add(getLblName(), constraintsLblName);

			java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
			constraintsTxtName.gridx = 2; constraintsTxtName.gridy = 1;
			constraintsTxtName.gridwidth = 3;
			constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtName.weightx = 1.0;
			constraintsTxtName.ipadx = 187;
			constraintsTxtName.insets = new java.awt.Insets(19, 5, 5, 207);
			getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

			java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
			constraintsTbpGeneral.gridx = 1; constraintsTbpGeneral.gridy = 2;
			constraintsTbpGeneral.gridwidth = 4;
			constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpGeneral.weightx = 1.0;
			constraintsTbpGeneral.weighty = 1.0;
			constraintsTbpGeneral.ipadx = 132;
			constraintsTbpGeneral.ipady = 34;
			constraintsTbpGeneral.insets = new java.awt.Insets(5, 12, 4, 13);
			getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 3;
			constraintsBtnOk.gridwidth = 2;
			constraintsBtnOk.ipadx = 64;
			constraintsBtnOk.insets = new java.awt.Insets(4, 88, 10, 4);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 3; constraintsBtnCancel.gridy = 3;
			constraintsBtnCancel.ipadx = 18;
			constraintsBtnCancel.insets = new java.awt.Insets(4, 4, 10, 6);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
			constraintsBtnApply.gridx = 4; constraintsBtnApply.gridy = 3;
			constraintsBtnApply.ipadx = 8;
			constraintsBtnApply.insets = new java.awt.Insets(4, 7, 10, 104);
			getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);
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
 * Return the CbxViewableRef property value.
 * @return ch.ehi.umleditor.application.ReferencableComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ReferencableComboBox getCbxViewableRef() {
	if (ivjCbxViewableRef == null) {
		try {
			ivjCbxViewableRef = new ch.ehi.umleditor.application.ReferencableComboBox();
			ivjCbxViewableRef.setName("CbxViewableRef");
			ivjCbxViewableRef.setToolTipText("");
			ivjCbxViewableRef.setEditable(false);
			// user code begin {1}
			ivjCbxViewableRef.setToolTipText(getResourceString("CbxViewableRef_toolTipText"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxViewableRef;
}
/**
 * Return the JCheckBox1 property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxAbstract() {
	if (ivjChxAbstract == null) {
		try {
			ivjChxAbstract = new javax.swing.JCheckBox();
			ivjChxAbstract.setName("ChxAbstract");
			ivjChxAbstract.setToolTipText("");
			ivjChxAbstract.setText("Abstrakt");
			// user code begin {1}
			ivjChxAbstract.setToolTipText(getResourceString("ChxAbstract_toolTipText"));
			ivjChxAbstract.setText(getResourceString("ChxAbstract_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxAbstract;
}
/**
 * Return the JCheckBox3 property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxFinal() {
	if (ivjChxFinal == null) {
		try {
			ivjChxFinal = new javax.swing.JCheckBox();
			ivjChxFinal.setName("ChxFinal");
			ivjChxFinal.setToolTipText("");
			ivjChxFinal.setText("Final");
			ivjChxFinal.setEnabled(true);
			// user code begin {1}
			ivjChxFinal.setToolTipText(getResourceString("ChxFinal_toolTipText"));
			ivjChxFinal.setText(getResourceString("ChxFinal_text"));
			ivjChxFinal.setEnabled(true);
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxFinal;
}
/**
 * Return the JPanel1 property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getJPanel1() {
	if (ivjJPanel1 == null) {
		try {
			ivjJPanel1 = new javax.swing.JPanel();
			ivjJPanel1.setName("JPanel1");
			ivjJPanel1.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsChxAbstract = new java.awt.GridBagConstraints();
			constraintsChxAbstract.gridx = 1; constraintsChxAbstract.gridy = 1;
			constraintsChxAbstract.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxAbstract.ipadx = 119;
			constraintsChxAbstract.insets = new java.awt.Insets(13, 10, 1, 2);
			getJPanel1().add(getChxAbstract(), constraintsChxAbstract);

			java.awt.GridBagConstraints constraintsChxFinal = new java.awt.GridBagConstraints();
			constraintsChxFinal.gridx = 1; constraintsChxFinal.gridy = 2;
			constraintsChxFinal.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxFinal.ipadx = 119;
			constraintsChxFinal.insets = new java.awt.Insets(1, 10, 1, 2);
			getJPanel1().add(getChxFinal(), constraintsChxFinal);

			java.awt.GridBagConstraints constraintsLblDerivedFrom = new java.awt.GridBagConstraints();
			constraintsLblDerivedFrom.gridx = 1; constraintsLblDerivedFrom.gridy = 4;
			constraintsLblDerivedFrom.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblDerivedFrom.ipadx = 140;
			constraintsLblDerivedFrom.ipady = 14;
			constraintsLblDerivedFrom.insets = new java.awt.Insets(14, 10, 49, 2);
			getJPanel1().add(getLblDerivedFrom(), constraintsLblDerivedFrom);

			java.awt.GridBagConstraints constraintsCbxViewableRef = new java.awt.GridBagConstraints();
			constraintsCbxViewableRef.gridx = 2; constraintsCbxViewableRef.gridy = 4;
			constraintsCbxViewableRef.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsCbxViewableRef.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsCbxViewableRef.weightx = 1.0;
			constraintsCbxViewableRef.ipadx = 68;
			constraintsCbxViewableRef.insets = new java.awt.Insets(12, 3, 42, 179);
			getJPanel1().add(getCbxViewableRef(), constraintsCbxViewableRef);

			java.awt.GridBagConstraints constraintsPnlExtended = new java.awt.GridBagConstraints();
			constraintsPnlExtended.gridx = 1; constraintsPnlExtended.gridy = 3;
			constraintsPnlExtended.gridwidth = 2;
			constraintsPnlExtended.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsPnlExtended.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsPnlExtended.weightx = 1.0;
			constraintsPnlExtended.weighty = 1.0;
			constraintsPnlExtended.ipadx = 59;
			constraintsPnlExtended.insets = new java.awt.Insets(2, 10, 12, 9);
			getJPanel1().add(getPnlExtended(), constraintsPnlExtended);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJPanel1;
}
/**
 * Return the JPanel3 property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getJPanel3() {
	if (ivjJPanel3 == null) {
		try {
			ivjJPanel3 = new javax.swing.JPanel();
			ivjJPanel3.setName("JPanel3");
			ivjJPanel3.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsScpRoles = new java.awt.GridBagConstraints();
			constraintsScpRoles.gridx = 1; constraintsScpRoles.gridy = 1;
			constraintsScpRoles.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpRoles.weightx = 1.0;
			constraintsScpRoles.weighty = 1.0;
			constraintsScpRoles.ipadx = 360;
			constraintsScpRoles.ipady = 119;
			constraintsScpRoles.insets = new java.awt.Insets(9, 10, 5, 4);
			getJPanel3().add(getScpRoles(), constraintsScpRoles);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJPanel3;
}
/**
 * Return the JSeparator1 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator1() {
	if (ivjJSeparator1 == null) {
		try {
			ivjJSeparator1 = new javax.swing.JSeparator();
			ivjJSeparator1.setName("JSeparator1");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator1;
}
/**
 * Return the JSeparator2 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator2() {
	if (ivjJSeparator2 == null) {
		try {
			ivjJSeparator2 = new javax.swing.JSeparator();
			ivjJSeparator2.setName("JSeparator2");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator2;
}
/**
 * Return the JLabel21 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblDerivedFrom() {
	if (ivjLblDerivedFrom == null) {
		try {
			ivjLblDerivedFrom = new javax.swing.JLabel();
			ivjLblDerivedFrom.setName("LblDerivedFrom");
			ivjLblDerivedFrom.setToolTipText("");
			ivjLblDerivedFrom.setText("Abgeleitet von:");
			// user code begin {1}
			ivjLblDerivedFrom.setToolTipText(getResourceString("LblDerivedFrom_toolTipText"));
			ivjLblDerivedFrom.setText(getResourceString("LblDerivedFrom_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblDerivedFrom;
}
/**
 * Return the JLabel1 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblName() {
	if (ivjLblName == null) {
		try {
			ivjLblName = new javax.swing.JLabel();
			ivjLblName.setName("LblName");
			ivjLblName.setText("Name:");
			// user code begin {1}
			ivjLblName.setText(getResourceString("LblName_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblName;
}
/**
 * Return the LocalColumnModelDefaultListSelectionModel property value.
 * @return javax.swing.DefaultListSelectionModel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.DefaultListSelectionModel getLocalColumnModelDefaultListSelectionModel() {
	javax.swing.DefaultListSelectionModel ivjLocalColumnModelDefaultListSelectionModel = null;
	try {
		/* Create part */
		ivjLocalColumnModelDefaultListSelectionModel = new javax.swing.DefaultListSelectionModel();
		ivjLocalColumnModelDefaultListSelectionModel.setAnchorSelectionIndex(0);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjLocalColumnModelDefaultListSelectionModel;
}
/**
 * Return the MniNewAttribute property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniNewAttribute() {
	if (ivjMniNewAttribute == null) {
		try {
			ivjMniNewAttribute = new javax.swing.JMenuItem();
			ivjMniNewAttribute.setName("MniNewAttribute");
			ivjMniNewAttribute.setText("Neu");
			ivjMniNewAttribute.setEnabled(true);
			// user code begin {1}
			ivjMniNewAttribute.setText(getNewString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniNewAttribute;
}
/**
 * Return the MniNewRole property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniNewRole() {
	if (ivjMniNewRole == null) {
		try {
			ivjMniNewRole = new javax.swing.JMenuItem();
			ivjMniNewRole.setName("MniNewRole");
			ivjMniNewRole.setText("Neu");
			ivjMniNewRole.setEnabled(true);
			// user code begin {1}
			ivjMniNewRole.setText(getNewString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniNewRole;
}
/**
 * Return the MniOpenAttributeSpecification property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniOpenAttributeSpecification() {
	if (ivjMniOpenAttributeSpecification == null) {
		try {
			ivjMniOpenAttributeSpecification = new javax.swing.JMenuItem();
			ivjMniOpenAttributeSpecification.setName("MniOpenAttributeSpecification");
			ivjMniOpenAttributeSpecification.setText("Öffne Spezifikation...");
			ivjMniOpenAttributeSpecification.setEnabled(false);
			// user code begin {1}
			ivjMniOpenAttributeSpecification.setText(getChangeWindowString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniOpenAttributeSpecification;
}
/**
 * Return the MniOpenAttributeSpecication1 property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniOpenRoleSpecification() {
	if (ivjMniOpenRoleSpecification == null) {
		try {
			ivjMniOpenRoleSpecification = new javax.swing.JMenuItem();
			ivjMniOpenRoleSpecification.setName("MniOpenRoleSpecification");
			ivjMniOpenRoleSpecification.setText("Öffne Spezifikation...");
			ivjMniOpenRoleSpecification.setEnabled(false);
			// user code begin {1}
			ivjMniOpenRoleSpecification.setText(getChangeWindowString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniOpenRoleSpecification;
}
/**
 * Return the MniRemoveAttribute property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRemoveAttribute() {
	if (ivjMniRemoveAttribute == null) {
		try {
			ivjMniRemoveAttribute = new javax.swing.JMenuItem();
			ivjMniRemoveAttribute.setName("MniRemoveAttribute");
			ivjMniRemoveAttribute.setText("Löschen");
			ivjMniRemoveAttribute.setEnabled(false);
			// user code begin {1}
			ivjMniRemoveAttribute.setText(getRemoveString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRemoveAttribute;
}
/**
 * Return the MniRemoveRoleDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRemoveRoleDef() {
	if (ivjMniRemoveRoleDef == null) {
		try {
			ivjMniRemoveRoleDef = new javax.swing.JMenuItem();
			ivjMniRemoveRoleDef.setName("MniRemoveRoleDef");
			ivjMniRemoveRoleDef.setText("Löschen");
			ivjMniRemoveRoleDef.setEnabled(false);
			// user code begin {1}
			ivjMniRemoveRoleDef.setText(getRemoveString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRemoveRoleDef;
}
/**
 * Return the MnuAttributes property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getMnuAttributes() {
	if (ivjMnuAttributes == null) {
		try {
			ivjMnuAttributes = new javax.swing.JPopupMenu();
			ivjMnuAttributes.setName("MnuAttributes");
			ivjMnuAttributes.add(getMniOpenAttributeSpecification());
			ivjMnuAttributes.add(getJSeparator1());
			ivjMnuAttributes.add(getMniNewAttribute());
			ivjMnuAttributes.add(getMniRemoveAttribute());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuAttributes;
}
/**
 * Return the MnuRoles property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getMnuRoles() {
	if (ivjMnuRoles == null) {
		try {
			ivjMnuRoles = new javax.swing.JPopupMenu();
			ivjMnuRoles.setName("MnuRoles");
			ivjMnuRoles.add(getMniOpenRoleSpecification());
			ivjMnuRoles.add(getJSeparator2());
			ivjMnuRoles.add(getMniNewRole());
			ivjMnuRoles.add(getMniRemoveRoleDef());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuRoles;
}
/**
 * Return the JPanel2 property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlAttributes() {
	if (ivjPnlAttributes == null) {
		try {
			ivjPnlAttributes = new javax.swing.JPanel();
			ivjPnlAttributes.setName("PnlAttributes");
			ivjPnlAttributes.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsScpAttributes = new java.awt.GridBagConstraints();
			constraintsScpAttributes.gridx = 1; constraintsScpAttributes.gridy = 1;
			constraintsScpAttributes.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpAttributes.weightx = 1.0;
			constraintsScpAttributes.weighty = 1.0;
			constraintsScpAttributes.ipadx = 488;
			constraintsScpAttributes.ipady = 155;
			constraintsScpAttributes.insets = new java.awt.Insets(8, 9, 4, 9);
			getPnlAttributes().add(getScpAttributes(), constraintsScpAttributes);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlAttributes;
}
/**
 * Return the PnlConstraints property value.
 * @return ch.ehi.umleditor.application.InterlisSyntaxPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private InterlisSyntaxPanel getPnlConstraints() {
	if (ivjPnlConstraints == null) {
		try {
			ivjPnlConstraints = new ch.ehi.umleditor.application.InterlisSyntaxPanel();
			ivjPnlConstraints.setName("PnlConstraints");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlConstraints;
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
 * Return the PnlExtended property value.
 * @return ch.ehi.umleditor.application.ExtendedPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ExtendedPanel getPnlExtended() {
	if (ivjPnlExtended == null) {
		try {
			ivjPnlExtended = new ch.ehi.umleditor.application.ExtendedPanel();
			ivjPnlExtended.setName("PnlExtended");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlExtended;
}
/**
 * Return the JScrollPane1 property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpAttributes() {
	if (ivjScpAttributes == null) {
		try {
			ivjScpAttributes = new javax.swing.JScrollPane();
			ivjScpAttributes.setName("ScpAttributes");
			ivjScpAttributes.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			ivjScpAttributes.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			getScpAttributes().setViewportView(getTblAttributes());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpAttributes;
}
/**
 * Return the JScrollPane11 property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpRoles() {
	if (ivjScpRoles == null) {
		try {
			ivjScpRoles = new javax.swing.JScrollPane();
			ivjScpRoles.setName("ScpRoles");
			ivjScpRoles.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			ivjScpRoles.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			getScpRoles().setViewportView(getTblRoles());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpRoles;
}
/**
 * Return the TableColumn1 property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcAttributeName() {
	if (ivjTbcAttributeName == null) {
		try {
			ivjTbcAttributeName = new javax.swing.table.TableColumn();
			ivjTbcAttributeName.setHeaderValue("Name");
			// user code begin {1}
			ivjTbcAttributeName.setHeaderValue(getResourceString("TbcAttributeName_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcAttributeName;
}
/**
 * Return the TableColumn2 property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcAttributeType() {
	if (ivjTbcAttributeType == null) {
		try {
			ivjTbcAttributeType = new javax.swing.table.TableColumn();
			ivjTbcAttributeType.setHeaderValue("Typ");
			// user code begin {1}
			ivjTbcAttributeType.setHeaderValue(getResourceString("TbcAttributeType_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcAttributeType;
}
/**
 * Return the TableColumn3 property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcRoleCardinality() {
	if (ivjTbcRoleCardinality == null) {
		try {
			ivjTbcRoleCardinality = new javax.swing.table.TableColumn();
			ivjTbcRoleCardinality.setHeaderValue("Kardinalität");
			// user code begin {1}
			ivjTbcRoleCardinality.setHeaderValue(getResourceString("TbcRoleCardinality_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcRoleCardinality;
}
/**
 * Return the TableColumn4 property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcRoleClassDef() {
	if (ivjTbcRoleClassDef == null) {
		try {
			ivjTbcRoleClassDef = new javax.swing.table.TableColumn();
			ivjTbcRoleClassDef.setHeaderValue("Klasse");
			// user code begin {1}
			ivjTbcRoleClassDef.setHeaderValue(getResourceString("TbcRoleClass_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcRoleClassDef;
}
/**
 * Return the TableColumn21 property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcRoleKind() {
	if (ivjTbcRoleKind == null) {
		try {
			ivjTbcRoleKind = new javax.swing.table.TableColumn();
			ivjTbcRoleKind.setHeaderValue("Art");
			// user code begin {1}
			ivjTbcRoleKind.setHeaderValue(getResourceString("TbcRoleKind_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcRoleKind;
}
/**
 * Return the TableColumn11 property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcRoleName() {
	if (ivjTbcRoleName == null) {
		try {
			ivjTbcRoleName = new javax.swing.table.TableColumn();
			ivjTbcRoleName.setHeaderValue("Name");
			// user code begin {1}
			ivjTbcRoleName.setHeaderValue(getResourceString("TbcRoleName_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcRoleName;
}
/**
 * Return the ScrollPaneTable property value.
 * @return javax.swing.JTable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTable getTblAttributes() {
	if (ivjTblAttributes == null) {
		try {
			javax.swing.table.DefaultTableColumnModel ivjLocalColumnModel;
			ivjLocalColumnModel = new javax.swing.table.DefaultTableColumnModel();
			ivjLocalColumnModel.setSelectionModel(getLocalColumnModelDefaultListSelectionModel());
			ivjTblAttributes = new javax.swing.JTable();
			ivjTblAttributes.setName("TblAttributes");
			getScpAttributes().setColumnHeaderView(ivjTblAttributes.getTableHeader());
			getScpAttributes().getViewport().setBackingStoreEnabled(true);
			ivjTblAttributes.setCellSelectionEnabled(false);
			ivjTblAttributes.setColumnModel(ivjLocalColumnModel);
			ivjTblAttributes.setBounds(0, 0, 200, 200);
			ivjTblAttributes.setRowSelectionAllowed(true);
			ivjTblAttributes.setEnabled(true);
			ivjTblAttributes.addColumn(getTbcAttributeName());
			ivjTblAttributes.addColumn(getTbcAttributeType());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTblAttributes;
}
/**
 * Return the ScrollPaneTable1 property value.
 * @return javax.swing.JTable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTable getTblRoles() {
	if (ivjTblRoles == null) {
		try {
			ivjTblRoles = new javax.swing.JTable();
			ivjTblRoles.setName("TblRoles");
			getScpRoles().setColumnHeaderView(ivjTblRoles.getTableHeader());
			getScpRoles().getViewport().setBackingStoreEnabled(true);
			ivjTblRoles.setBounds(0, 0, 200, 200);
			ivjTblRoles.setEnabled(true);
			ivjTblRoles.addColumn(getTbcRoleName());
			ivjTblRoles.addColumn(getTbcRoleKind());
			ivjTblRoles.addColumn(getTbcRoleCardinality());
			ivjTblRoles.addColumn(getTbcRoleClassDef());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTblRoles;
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
			ivjTbpGeneral.insertTab(getDetailString(), null, getJPanel1(), null, 1);
			ivjTbpGeneral.insertTab(getResourceString("TbpAttributes_text"), null, getPnlAttributes(), null, 2);
			ivjTbpGeneral.insertTab(getResourceString("TbpRoles_text"), null, getJPanel3(), null, 3);
			ivjTbpGeneral.insertTab(getResourceString("TbpRestrictions_text"), null, getPnlConstraints(), null, 4);
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
 * Return the JTextField1 property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtName() {
	if (ivjTxtName == null) {
		try {
			ivjTxtName = new javax.swing.JTextField();
			ivjTxtName.setName("TxtName");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtName;
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
	getScpRoles().addMouseListener(ivjEventHandler);
	getTblRoles().addMouseListener(ivjEventHandler);
	getMniOpenRoleSpecification().addActionListener(ivjEventHandler);
	getMniOpenAttributeSpecification().addActionListener(ivjEventHandler);
	getMniNewAttribute().addActionListener(ivjEventHandler);
	getMniRemoveAttribute().addActionListener(ivjEventHandler);
	getMniNewRole().addActionListener(ivjEventHandler);
	getMniRemoveRoleDef().addActionListener(ivjEventHandler);
	getScpAttributes().addMouseListener(ivjEventHandler);
	getTblAttributes().addMouseListener(ivjEventHandler);
	getTxtName().addFocusListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("AssociationDefDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(558, 361);
		setTitle("Beziehung");
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setTitle(getResourceString("CTDialog"));

        mniMoveDownAttribute=new javax.swing.JMenuItem();
	mniMoveDownAttribute.setText(getResourceString("MniMoveDownAttribute_text"));
	mniMoveDownAttribute.addActionListener(new java.awt.event.ActionListener() {
	  // callback handler if menu item was selected
	  public void actionPerformed(java.awt.event.ActionEvent e) {
		mniMoveDownAttribute();
	  }
	});
	getMnuAttributes().add(mniMoveDownAttribute);

        mniMoveDownRole=new javax.swing.JMenuItem();
	mniMoveDownRole.setText(getResourceString("MniMoveDownRole_text"));
	mniMoveDownRole.addActionListener(new java.awt.event.ActionListener() {
	  // callback handler if menu item was selected
	  public void actionPerformed(java.awt.event.ActionEvent e) {
		mniMoveDownRoleDef();
	  }
	});
	getMnuRoles().add(mniMoveDownRole);

	// user code end
}
/**
 * Comment
 */
private void mniNewAttribute() {
	try {
		// update model
		AttributeDef attributeDef = ElementFactory.createAttributeDef(associationDef);
		// update view
		((EditorTableModel)getTblAttributes().getModel()).addRowElement(attributeDef);
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Comment
 */
private void mniNewRole() {
	try {
		// update model
		RoleDef roleDef = ElementFactory.createRoleDef(associationDef, null);
		// update view
		((EditorTableModel)getTblRoles().getModel()).addRowElement(roleDef);
	} catch(Throwable e) {
		handleException(e);
	}
}
/**
 * Comment
 */
private void mniRemoveAttribute() {
	((EditorTableModel)getTblAttributes().getModel()).removeRows(getTblAttributes().getSelectedRows());
}
/**
 * Move down selected Attribute in Attributes-List.
 */
private void mniMoveDownAttribute() {
   int [] selv=getTblAttributes().getSelectedRows();
   if(selv.length>0){
 	((EditorTableModel)getTblAttributes().getModel()).moveRowDown(selv[0]);
   }
}
/**
 * Comment
 */
private void mniRemoveRoleDef() {
	((EditorTableModel)getTblRoles().getModel()).removeRows(getTblRoles().getSelectedRows());
}
/**
 * Move down selected Role in Roles-List.
 */
private void mniMoveDownRoleDef() {
  int [] selv=getTblRoles().getSelectedRows();
  if(selv.length>0){
	((EditorTableModel)getTblRoles().getModel()).moveRowDown(selv[0]);
  }
}
/**
 * Comment
 */
private void mniShowAttributeSpecification() {
	((EditorTableModel)getTblAttributes().getModel()).showSpecification(getTblAttributes().getSelectedRows());
}
/**
 * Comment
 */
private void mniShowRoleSpecication() {
	((EditorTableModel)getTblRoles().getModel()).showSpecification(getTblRoles().getSelectedRows());
}
/**
 * Save ModelElement changes.
 * @see okPressed()
 * @see applyPressed
 */
protected boolean save() {
	if (!ElementUtils.trySetName(associationDef, getTxtName().getText())) {
		return false;
	}
	getPnlDescription().getObject();

	// page Details
	associationDef.setAbstract(getChxAbstract().isSelected());
	associationDef.setPropFinal(getChxFinal().isSelected());
	if (!getPnlExtended().getClassifierExtension(getTxtName().getText())) {
		return false;
	}
	getCbxViewableRef().save0or1Dependency(AssociationDefDerived.class);

	// page Constraints
	getPnlConstraints().getConstraints();

	return super.save();
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	associationDef = (ch.ehi.interlis.associations.AssociationDef)element;

	// general & page Description
	getTxtName().setText(associationDef.getDefLangName());
	getPnlDescription().setObject(element);

	// page Details
	getChxAbstract().setSelected(associationDef.isAbstract());
	getChxFinal().setSelected(associationDef.isPropFinal());
	getPnlExtended().setClassifierExtension(associationDef);
	getCbxViewableRef().set0or1Dependency(AssociationDefDerived.class, associationDef);

	// page Attributes
	getTblAttributes().setModel(new EditorTableModel());
	((EditorTableModel)getTblAttributes().getModel()).setAttributeDef(associationDef.iteratorFeature());

	// page Roles
	getTblRoles().setModel(new EditorTableModel());
	((EditorTableModel)getTblRoles().getModel()).setRoleDef(associationDef.iteratorConnection());

	// page Constraints
	getPnlConstraints().setConstraints(associationDef);
}
}
