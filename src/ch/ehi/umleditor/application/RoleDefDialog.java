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
import ch.ehi.interlis.modeltopicclass.*;
import javax.swing.*;
import ch.ehi.interlis.associations.*;
import ch.ehi.uml1_4.foundation.datatypes.*;
import ch.softenvironment.view.*;
/**
 * User Interface for a RoleDef.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2003-12-25 09:48:10 $
 */
public class RoleDefDialog extends BaseDialog {
	// ModelElement
	private static java.util.ResourceBundle resRoleDefDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/RoleDefDialog");  //$NON-NLS-1$
	ch.ehi.interlis.associations.RoleDef roleDef = null;
	private JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JButton ivjBtnCancel = null;
	private JButton ivjBtnOk = null;
	private JTabbedPane ivjTbpGeneral = null;
	private JLabel ivjLblName = null;
	private JTextField ivjTxtName = null;
	private JButton ivjBtnApply = null;
	private JCheckBox ivjChxAbstract = null;
	private JCheckBox ivjChxExtended = null;
	private JCheckBox ivjChxFinal = null;
	private InterlisSyntaxPanel ivjPnlDerivedFrom = null;
	private DescriptionPanel ivjPnlDescription = null;
	private JComboBox ivjCbxCardinality = null;
	private ReferencableComboBox ivjCbxEnd = null;
	private JCheckBox ivjChxOrdered = null;
	private JLabel ivjLblCardinality = null;
	private JLabel ivjLblEnd = null;
	private JRadioButton ivjRbtAggregation = null;
	private JRadioButton ivjRbtAssociation = null;
	private JRadioButton ivjRbtComposition = null;
	private JPanel ivjPnlDetail = null;
	private JCheckBox ivjChxNavigable = null;
	private JLabel ivjLblKind = null;
	private JLabel ivjLblReferenceKind = null;
	private JLabel ivjLblRestrictionTo = null;
	private JRadioButton ivjRbtReference = null;
	private JRadioButton ivjRbtRelationship = null;
	private JRadioButton ivjRbtStructure = null;
	private JScrollPane ivjScpClassRestriction = null;
	private javax.swing.table.TableColumn ivjTbcClassDef = null;
	private JTable ivjTblClassRestriction = null;
	private JSeparator ivjJSeparator1 = null;
	private JMenuItem ivjMniNewClassDef = null;
	private JMenuItem ivjMniOpenClassDefSpecification = null;
	private JMenuItem ivjMniRemoveClassDef = null;
	private JPopupMenu ivjMnuClassDef = null;
        private RestrictedClassesPanel ivjTabRestricted = null;
	private JPanel ivjPnlReferenceType = null;
	private JCheckBox ivjChxExternal = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.ItemListener, java.awt.event.MouseListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == RoleDefDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == RoleDefDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == RoleDefDialog.this.getBtnApply())
				connEtoC3(e);
			if (e.getSource() == RoleDefDialog.this.getMniNewClassDef())
				connEtoC4(e);
			if (e.getSource() == RoleDefDialog.this.getMniOpenClassDefSpecification())
				connEtoC7(e);
			if (e.getSource() == RoleDefDialog.this.getMniRemoveClassDef())
				connEtoC8(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == RoleDefDialog.this.getTxtName())
				connEtoM1(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == RoleDefDialog.this.getRbtReference())
				connEtoC9(e);
			if (e.getSource() == RoleDefDialog.this.getRbtStructure())
				connEtoC10(e);
			if (e.getSource() == RoleDefDialog.this.getRbtRelationship())
				connEtoC11(e);
		};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == RoleDefDialog.this.getScpClassRestriction())
				connEtoC12(e);
			if (e.getSource() == RoleDefDialog.this.getTblClassRestriction())
				connEtoC13(e);
		};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == RoleDefDialog.this.getScpClassRestriction())
				connEtoC5(e);
			if (e.getSource() == RoleDefDialog.this.getTblClassRestriction())
				connEtoC6(e);
		};
	};
/**
 * Constructor
 */
public RoleDefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();
	setRelativeLocation(owner);
	setElement(element);
	show();
}
/**
 * Constructor
 * @param owner Symbol
 * @param modal Symbol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public RoleDefDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * Adapt the given PopupMenu before displaying it (for e.g. disable Items).
 */
protected void adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	/* ce boolean isSelected = getTblClassRestriction().getSelectedRow() >= 0;
	getMniOpenClassDefSpecification().setEnabled(isSelected);
	getMniRemoveClassDef().setEnabled(isSelected);
        */
}
/**
 * Comment
 */
private void adaptReferenceType() {
	if (getRbtReference().isSelected()) {
		getChxOrdered().setVisible(false);
		getLblCardinality().setVisible(false);
		getCbxCardinality().setVisible(false);
		getCbxCardinality().setSelectedItem(null);
		// restricted to ClassDef or AssociationDef
	} else {
		getChxOrdered().setVisible(true);
		getLblCardinality().setVisible(true);
		getCbxCardinality().setVisible(true);
		// restricted to ClassDef only
	}
}
/**
 * connEtoC1:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> AttributeDefDialog.okPressed()V)
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
 * connEtoC10:  (RbtStructure.item.itemStateChanged(java.awt.event.ItemEvent) --> RoleDefDialog.adaptReferenceType()V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC10(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.adaptReferenceType();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC11:  (RbtRelationship.item.itemStateChanged(java.awt.event.ItemEvent) --> RoleDefDialog.adaptReferenceType()V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC11(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.adaptReferenceType();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC12:  (ScpClassRestriction.mouse.mousePressed(java.awt.event.MouseEvent) --> RoleDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC12(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuClassDef());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC13:  (TblClassRestriction.mouse.mousePressed(java.awt.event.MouseEvent) --> RoleDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC13(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuClassDef());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> AttributeDefDialog.cancelPressed()V)
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
 * connEtoC3:  (BtnApply.action.actionPerformed(java.awt.event.ActionEvent) --> AttributeDefDialog.applyPressed()V)
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
 * connEtoC4:  (MniNewClassDef.action.actionPerformed(java.awt.event.ActionEvent) --> RoleDefDialog.mniNewClassDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniNewClassDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (ScpClassRestriction.mouse.mouseReleased(java.awt.event.MouseEvent) --> RoleDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuClassDef());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (TblClassRestriction.mouse.mouseReleased(java.awt.event.MouseEvent) --> RoleDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuClassDef());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC7:  (MniOpenClassDefSpecification.action.actionPerformed(java.awt.event.ActionEvent) --> RoleDefDialog.mniOpenClassDefSpecification()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC7(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniOpenClassDefSpecification();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC8:  (MniRemoveClassDef.action.actionPerformed(java.awt.event.ActionEvent) --> RoleDefDialog.mniRemoveClassDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC8(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniRemoveClassDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC9:  (RbtReference.item.itemStateChanged(java.awt.event.ItemEvent) --> RoleDefDialog.adaptReferenceType()V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC9(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.adaptReferenceType();
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
			constraintsLblName.insets = new java.awt.Insets(13, 10, 9, 1);
			getBaseDialogContentPane().add(getLblName(), constraintsLblName);

			java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
			constraintsTxtName.gridx = 2; constraintsTxtName.gridy = 1;
			constraintsTxtName.gridwidth = 3;
			constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtName.weightx = 1.0;
			constraintsTxtName.ipadx = 342;
			constraintsTxtName.insets = new java.awt.Insets(10, 9, 6, 55);
			getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

			java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
			constraintsTbpGeneral.gridx = 1; constraintsTbpGeneral.gridy = 3;
			constraintsTbpGeneral.gridwidth = 4;
			constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpGeneral.weightx = 1.0;
			constraintsTbpGeneral.weighty = 1.0;
			constraintsTbpGeneral.ipadx = 373;
			constraintsTbpGeneral.ipady = 254;
			constraintsTbpGeneral.insets = new java.awt.Insets(7, 8, 9, 25);
			getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 4;
			constraintsBtnOk.ipadx = 64;
			constraintsBtnOk.insets = new java.awt.Insets(9, 30, 7, 6);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 4;
			constraintsBtnCancel.ipadx = 18;
			constraintsBtnCancel.insets = new java.awt.Insets(9, 1, 7, 22);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsRbtAssociation = new java.awt.GridBagConstraints();
			constraintsRbtAssociation.gridx = 2; constraintsRbtAssociation.gridy = 2;
			constraintsRbtAssociation.ipadx = 35;
			constraintsRbtAssociation.insets = new java.awt.Insets(6, 9, 7, 3);
			getBaseDialogContentPane().add(getRbtAssociation(), constraintsRbtAssociation);

			java.awt.GridBagConstraints constraintsRbtAggregation = new java.awt.GridBagConstraints();
			constraintsRbtAggregation.gridx = 3; constraintsRbtAggregation.gridy = 2;
			constraintsRbtAggregation.ipadx = 33;
			constraintsRbtAggregation.insets = new java.awt.Insets(6, 3, 7, 3);
			getBaseDialogContentPane().add(getRbtAggregation(), constraintsRbtAggregation);

			java.awt.GridBagConstraints constraintsRbtComposition = new java.awt.GridBagConstraints();
			constraintsRbtComposition.gridx = 4; constraintsRbtComposition.gridy = 2;
			constraintsRbtComposition.ipadx = 31;
			constraintsRbtComposition.insets = new java.awt.Insets(6, 3, 7, 9);
			getBaseDialogContentPane().add(getRbtComposition(), constraintsRbtComposition);

			java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
			constraintsBtnApply.gridx = 3; constraintsBtnApply.gridy = 4;
			constraintsBtnApply.ipadx = 13;
			constraintsBtnApply.insets = new java.awt.Insets(9, 6, 7, 7);
			getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

			java.awt.GridBagConstraints constraintsLblKind = new java.awt.GridBagConstraints();
			constraintsLblKind.gridx = 1; constraintsLblKind.gridy = 2;
			constraintsLblKind.ipadx = 120;
			constraintsLblKind.insets = new java.awt.Insets(9, 10, 12, 1);
			getBaseDialogContentPane().add(getLblKind(), constraintsLblKind);
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
 * Return the JComboBox1 property value.
 * @return javax.swing.JComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JComboBox getCbxCardinality() {
	if (ivjCbxCardinality == null) {
		try {
			ivjCbxCardinality = new javax.swing.JComboBox();
			ivjCbxCardinality.setName("CbxCardinality");
			ivjCbxCardinality.setEditable(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxCardinality;
}
/**
 * Return the CbxEnd property value.
 * @return ch.ehi.umleditor.application.ReferencableComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ReferencableComboBox getCbxEnd() {
	if (ivjCbxEnd == null) {
		try {
			ivjCbxEnd = new ch.ehi.umleditor.application.ReferencableComboBox();
			ivjCbxEnd.setName("CbxEnd");
			ivjCbxEnd.setEnabled(true);
			ivjCbxEnd.setEditable(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxEnd;
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
			ivjChxAbstract.setToolTipText(resRoleDefDialog.getString("ChxAbstract_toolTipText"));
			ivjChxAbstract.setText(resRoleDefDialog.getString("ChxAbstract_text"));
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
 * Return the JCheckBox2 property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxExtended() {
	if (ivjChxExtended == null) {
		try {
			ivjChxExtended = new javax.swing.JCheckBox();
			ivjChxExtended.setName("ChxExtended");
			ivjChxExtended.setToolTipText("");
			ivjChxExtended.setText("Spezialisiert");
			// user code begin {1}
			ivjChxExtended.setToolTipText(resRoleDefDialog.getString("ChxExtended_toolTipText"));
			ivjChxExtended.setText(resRoleDefDialog.getString("ChxExtended_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxExtended;
}
/**
 * Return the ChxExternal property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxExternal() {
	if (ivjChxExternal == null) {
		try {
			ivjChxExternal = new javax.swing.JCheckBox();
			ivjChxExternal.setName("ChxExternal");
			ivjChxExternal.setText("Extern");
			// user code begin {1}
			ivjChxExternal.setToolTipText(resRoleDefDialog.getString("ChxExternal_toolTipText"));
			ivjChxExternal.setText(resRoleDefDialog.getString("ChxExternal_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxExternal;
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
			ivjChxFinal.setText("Abschliessend");
			// user code begin {1}
			ivjChxFinal.setText(resRoleDefDialog.getString("ChxFinal_text"));
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
 * Return the ChxNavigable property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxNavigable() {
	if (ivjChxNavigable == null) {
		try {
			ivjChxNavigable = new javax.swing.JCheckBox();
			ivjChxNavigable.setName("ChxNavigable");
			ivjChxNavigable.setText("Navigierbar");
			// user code begin {1}
			ivjChxNavigable.setText(resRoleDefDialog.getString("ChxNavigable_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxNavigable;
}
/**
 * Return the ChxAbstract1 property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxOrdered() {
	if (ivjChxOrdered == null) {
		try {
			ivjChxOrdered = new javax.swing.JCheckBox();
			ivjChxOrdered.setName("ChxOrdered");
			ivjChxOrdered.setText("Geordnet");
			// user code begin {1}
			ivjChxOrdered.setText(resRoleDefDialog.getString("ChxOrdered_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxOrdered;
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
 * Return the JLabel2 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblCardinality() {
	if (ivjLblCardinality == null) {
		try {
			ivjLblCardinality = new javax.swing.JLabel();
			ivjLblCardinality.setName("LblCardinality");
			ivjLblCardinality.setText("Kardinalität");
			// user code begin {1}
			ivjLblCardinality.setText(resRoleDefDialog.getString("LblCardinality_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblCardinality;
}
/**
 * Return the JLabel11 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblEnd() {
	if (ivjLblEnd == null) {
		try {
			ivjLblEnd = new javax.swing.JLabel();
			ivjLblEnd.setName("LblEnd");
			ivjLblEnd.setToolTipText("");
			ivjLblEnd.setText("Beteiligte Klasse:");
			// user code begin {1}
			ivjLblEnd.setToolTipText(resRoleDefDialog.getString("LblEnd_toolTipText"));
			ivjLblEnd.setText(resRoleDefDialog.getString("LblEnd_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblEnd;
}
/**
 * Return the LblKind property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblKind() {
	if (ivjLblKind == null) {
		try {
			ivjLblKind = new javax.swing.JLabel();
			ivjLblKind.setName("LblKind");
			ivjLblKind.setToolTipText("");
			ivjLblKind.setText("Art:");
			// user code begin {1}
			ivjLblKind.setToolTipText(resRoleDefDialog.getString("LblKind_toolTipText"));
			ivjLblKind.setText(resRoleDefDialog.getString("LblKind_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblKind;
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
			ivjLblName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
			// user code begin {1}
			ivjLblName.setText(resRoleDefDialog.getString("LblName_text"));
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
 * Return the LblReferenceKind property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblReferenceKind() {
	if (ivjLblReferenceKind == null) {
		try {
			ivjLblReferenceKind = new javax.swing.JLabel();
			ivjLblReferenceKind.setName("LblReferenceKind");
			ivjLblReferenceKind.setToolTipText("");
			ivjLblReferenceKind.setText("Referenzart:");
			ivjLblReferenceKind.setBounds(9, 11, 140, 14);
			// user code begin {1}
			ivjLblReferenceKind.setText(resRoleDefDialog.getString("LblReferenceKind_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblReferenceKind;
}
/**
 * Return the LblRestrictionTo property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblRestrictionTo() {
	if (ivjLblRestrictionTo == null) {
		try {
			ivjLblRestrictionTo = new javax.swing.JLabel();
			ivjLblRestrictionTo.setName("LblRestrictionTo");
			ivjLblRestrictionTo.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjLblRestrictionTo.setText("Restriktion:");
			// user code begin {1}
			ivjLblRestrictionTo.setText(resRoleDefDialog.getString("LblRestrictionTo_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblRestrictionTo;
}
/**
 * Return the MniNewClassDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniNewClassDef() {
	if (ivjMniNewClassDef == null) {
		try {
			ivjMniNewClassDef = new javax.swing.JMenuItem();
			ivjMniNewClassDef.setName("MniNewClassDef");
			ivjMniNewClassDef.setText("Neu");
			ivjMniNewClassDef.setEnabled(true);
			// user code begin {1}
			ivjMniNewClassDef.setText(getNewString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniNewClassDef;
}
/**
 * Return the MniOpenClassDefSpecification property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniOpenClassDefSpecification() {
	if (ivjMniOpenClassDefSpecification == null) {
		try {
			ivjMniOpenClassDefSpecification = new javax.swing.JMenuItem();
			ivjMniOpenClassDefSpecification.setName("MniOpenClassDefSpecification");
			ivjMniOpenClassDefSpecification.setText("Öffne Spezifikation...");
			ivjMniOpenClassDefSpecification.setEnabled(false);
			// user code begin {1}
			ivjMniOpenClassDefSpecification.setText(getChangeWindowString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniOpenClassDefSpecification;
}
/**
 * Return the MniRemoveClassDef property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRemoveClassDef() {
	if (ivjMniRemoveClassDef == null) {
		try {
			ivjMniRemoveClassDef = new javax.swing.JMenuItem();
			ivjMniRemoveClassDef.setName("MniRemoveClassDef");
			ivjMniRemoveClassDef.setText("Löschen");
			ivjMniRemoveClassDef.setEnabled(false);
			// user code begin {1}
			ivjMniRemoveClassDef.setText(getRemoveString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRemoveClassDef;
}
/**
 * Return the MnuClassDef property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getMnuClassDef() {
	if (ivjMnuClassDef == null) {
		try {
			ivjMnuClassDef = new javax.swing.JPopupMenu();
			ivjMnuClassDef.setName("MnuClassDef");
			ivjMnuClassDef.add(getMniOpenClassDefSpecification());
			ivjMnuClassDef.add(getJSeparator1());
			ivjMnuClassDef.add(getMniNewClassDef());
			ivjMnuClassDef.add(getMniRemoveClassDef());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuClassDef;
}
/**
 * Return the PnlDerivedFrom property value.
 * @return ch.ehi.umleditor.application.InterlisSyntaxPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private InterlisSyntaxPanel getPnlDerivedFrom() {
	if (ivjPnlDerivedFrom == null) {
		try {
			ivjPnlDerivedFrom = new ch.ehi.umleditor.application.InterlisSyntaxPanel();
			ivjPnlDerivedFrom.setName("PnlDerivedFrom");
			ivjPnlDerivedFrom.setToolTipText(resRoleDefDialog.getString("RoleDefDerived"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlDerivedFrom;
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
 * Return the JPanel1 property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlDetail() {
	if (ivjPnlDetail == null) {
		try {
			ivjPnlDetail = new javax.swing.JPanel();
			ivjPnlDetail.setName("PnlDetail");
			ivjPnlDetail.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsChxAbstract = new java.awt.GridBagConstraints();
			constraintsChxAbstract.gridx = 1; constraintsChxAbstract.gridy = 1;
			constraintsChxAbstract.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxAbstract.ipadx = 66;
			constraintsChxAbstract.insets = new java.awt.Insets(13, 15, 2, 9);
			getPnlDetail().add(getChxAbstract(), constraintsChxAbstract);

			java.awt.GridBagConstraints constraintsChxExtended = new java.awt.GridBagConstraints();
			constraintsChxExtended.gridx = 1; constraintsChxExtended.gridy = 3;
			constraintsChxExtended.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxExtended.ipadx = 45;
			constraintsChxExtended.insets = new java.awt.Insets(3, 15, 5, 9);
			getPnlDetail().add(getChxExtended(), constraintsChxExtended);

			java.awt.GridBagConstraints constraintsChxFinal = new java.awt.GridBagConstraints();
			constraintsChxFinal.gridx = 1; constraintsChxFinal.gridy = 2;
			constraintsChxFinal.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxFinal.ipadx = 31;
			constraintsChxFinal.insets = new java.awt.Insets(3, 15, 3, 9);
			getPnlDetail().add(getChxFinal(), constraintsChxFinal);

			java.awt.GridBagConstraints constraintsChxOrdered = new java.awt.GridBagConstraints();
			constraintsChxOrdered.gridx = 2; constraintsChxOrdered.gridy = 1;
			constraintsChxOrdered.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxOrdered.ipadx = 101;
			constraintsChxOrdered.insets = new java.awt.Insets(13, 9, 2, 212);
			getPnlDetail().add(getChxOrdered(), constraintsChxOrdered);

			java.awt.GridBagConstraints constraintsLblCardinality = new java.awt.GridBagConstraints();
			constraintsLblCardinality.gridx = 1; constraintsLblCardinality.gridy = 4;
			constraintsLblCardinality.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblCardinality.ipadx = 72;
			constraintsLblCardinality.insets = new java.awt.Insets(10, 15, 7, 12);
			getPnlDetail().add(getLblCardinality(), constraintsLblCardinality);

			java.awt.GridBagConstraints constraintsCbxCardinality = new java.awt.GridBagConstraints();
			constraintsCbxCardinality.gridx = 2; constraintsCbxCardinality.gridy = 4;
			constraintsCbxCardinality.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsCbxCardinality.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsCbxCardinality.weightx = 1.0;
			constraintsCbxCardinality.ipadx = 31;
			constraintsCbxCardinality.insets = new java.awt.Insets(5, 9, 3, 241);
			getPnlDetail().add(getCbxCardinality(), constraintsCbxCardinality);

			java.awt.GridBagConstraints constraintsLblEnd = new java.awt.GridBagConstraints();
			constraintsLblEnd.gridx = 1; constraintsLblEnd.gridy = 5;
			constraintsLblEnd.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblEnd.ipadx = 42;
			constraintsLblEnd.insets = new java.awt.Insets(7, 15, 8, 9);
			getPnlDetail().add(getLblEnd(), constraintsLblEnd);

			java.awt.GridBagConstraints constraintsCbxEnd = new java.awt.GridBagConstraints();
			constraintsCbxEnd.gridx = 2; constraintsCbxEnd.gridy = 5;
			constraintsCbxEnd.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsCbxEnd.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsCbxEnd.weightx = 1.0;
			constraintsCbxEnd.ipadx = 253;
			constraintsCbxEnd.insets = new java.awt.Insets(3, 9, 3, 11);
			getPnlDetail().add(getCbxEnd(), constraintsCbxEnd);

			java.awt.GridBagConstraints constraintsChxNavigable = new java.awt.GridBagConstraints();
			constraintsChxNavigable.gridx = 2; constraintsChxNavigable.gridy = 3;
			constraintsChxNavigable.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxNavigable.ipadx = 88;
			constraintsChxNavigable.insets = new java.awt.Insets(3, 9, 5, 212);
			getPnlDetail().add(getChxNavigable(), constraintsChxNavigable);

			java.awt.GridBagConstraints constraintsLblRestrictionTo = new java.awt.GridBagConstraints();
			constraintsLblRestrictionTo.gridx = 1; constraintsLblRestrictionTo.gridy = 6;
			constraintsLblRestrictionTo.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblRestrictionTo.ipadx = 75;
			constraintsLblRestrictionTo.insets = new java.awt.Insets(3, 15, 133, 9);
			getPnlDetail().add(getLblRestrictionTo(), constraintsLblRestrictionTo);

			java.awt.GridBagConstraints constraintsScpClassRestriction = new java.awt.GridBagConstraints();
			constraintsScpClassRestriction.gridx = 2; constraintsScpClassRestriction.gridy = 6;
			constraintsScpClassRestriction.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpClassRestriction.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsScpClassRestriction.weightx = 1.0;
			constraintsScpClassRestriction.weighty = 1.0;
			//constraintsScpClassRestriction.ipadx = 357;
			//constraintsScpClassRestriction.ipady = 116;
			constraintsScpClassRestriction.insets = new java.awt.Insets(4, 9, 4, 11);
			getPnlDetail().add(getTabRestricted(), constraintsScpClassRestriction);

			java.awt.GridBagConstraints constraintsPnlReferenceType = new java.awt.GridBagConstraints();
			constraintsPnlReferenceType.gridx = 1; constraintsPnlReferenceType.gridy = 7;
			constraintsPnlReferenceType.gridwidth = 2;
			constraintsPnlReferenceType.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsPnlReferenceType.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsPnlReferenceType.weightx = 1.0;
			constraintsPnlReferenceType.weighty = 1.0;
			constraintsPnlReferenceType.ipadx = 556;
			constraintsPnlReferenceType.ipady = 33;
			constraintsPnlReferenceType.insets = new java.awt.Insets(4, 7, 33, 0);
			getPnlDetail().add(getPnlReferenceType(), constraintsPnlReferenceType);

			java.awt.GridBagConstraints constraintsChxExternal = new java.awt.GridBagConstraints();
			constraintsChxExternal.gridx = 2; constraintsChxExternal.gridy = 2;
			constraintsChxExternal.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxExternal.ipadx = 116;
			constraintsChxExternal.insets = new java.awt.Insets(3, 9, 3, 212);
			getPnlDetail().add(getChxExternal(), constraintsChxExternal);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlDetail;
}
/**
 * Return the PnlReferenceType property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlReferenceType() {
	if (ivjPnlReferenceType == null) {
		try {
			ivjPnlReferenceType = new javax.swing.JPanel();
			ivjPnlReferenceType.setName("PnlReferenceType");
			ivjPnlReferenceType.setLayout(null);
			getPnlReferenceType().add(getLblReferenceKind(), getLblReferenceKind().getName());
			getPnlReferenceType().add(getRbtRelationship(), getRbtRelationship().getName());
			getPnlReferenceType().add(getRbtStructure(), getRbtStructure().getName());
			getPnlReferenceType().add(getRbtReference(), getRbtReference().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlReferenceType;
}
/**
 * Return the JRadioButton41 property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtAggregation() {
	if (ivjRbtAggregation == null) {
		try {
			ivjRbtAggregation = new javax.swing.JRadioButton();
			ivjRbtAggregation.setName("RbtAggregation");
			ivjRbtAggregation.setText("Aggregation");
			// user code begin {1}
			ivjRbtAggregation.setText(resRoleDefDialog.getString("RbtAggregation_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtAggregation;
}
/**
 * Return the JRadioButton4 property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtAssociation() {
	if (ivjRbtAssociation == null) {
		try {
			ivjRbtAssociation = new javax.swing.JRadioButton();
			ivjRbtAssociation.setName("RbtAssociation");
			ivjRbtAssociation.setText("Assoziation");
			// user code begin {1}
			ivjRbtAssociation.setText(resRoleDefDialog.getString("RbtRelationship_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtAssociation;
}
/**
 * Return the JRadioButton411 property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtComposition() {
	if (ivjRbtComposition == null) {
		try {
			ivjRbtComposition = new javax.swing.JRadioButton();
			ivjRbtComposition.setName("RbtComposition");
			ivjRbtComposition.setToolTipText("");
			ivjRbtComposition.setText("Komposition");
			// user code begin {1}
			ivjRbtComposition.setText(resRoleDefDialog.getString("RbtComposition_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtComposition;
}
/**
 * Return the RbtReference property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtReference() {
	if (ivjRbtReference == null) {
		try {
			ivjRbtReference = new javax.swing.JRadioButton();
			ivjRbtReference.setName("RbtReference");
			ivjRbtReference.setToolTipText("");
			ivjRbtReference.setText("Referenz");
			ivjRbtReference.setBounds(429, 7, 126, 22);
			// user code begin {1}
			ivjRbtReference.setText(resRoleDefDialog.getString("RbtReference_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtReference;
}
/**
 * Return the RbtRelationship property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtRelationship() {
	if (ivjRbtRelationship == null) {
		try {
			ivjRbtRelationship = new javax.swing.JRadioButton();
			ivjRbtRelationship.setName("RbtRelationship");
			ivjRbtRelationship.setToolTipText("");
			ivjRbtRelationship.setText("Assoziation");
			ivjRbtRelationship.setBounds(166, 7, 126, 22);
			// user code begin {1}
			ivjRbtRelationship.setText(resRoleDefDialog.getString("RbtRelationship_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtRelationship;
}
/**
 * Return the RbtStructure property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtStructure() {
	if (ivjRbtStructure == null) {
		try {
			ivjRbtStructure = new javax.swing.JRadioButton();
			ivjRbtStructure.setName("RbtStructure");
			ivjRbtStructure.setToolTipText("");
			ivjRbtStructure.setText("Struktur");
			ivjRbtStructure.setBounds(298, 7, 126, 22);
			// user code begin {1}
			ivjRbtStructure.setText(resRoleDefDialog.getString("RbtStructure_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtStructure;
}
/**
 * Return the ScpClassRestriction property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpClassRestriction() {
	if (ivjScpClassRestriction == null) {
		try {
			ivjScpClassRestriction = new javax.swing.JScrollPane();
			ivjScpClassRestriction.setName("ScpClassRestriction");
			ivjScpClassRestriction.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			ivjScpClassRestriction.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			getScpClassRestriction().setViewportView(getTblClassRestriction());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpClassRestriction;
}
/**
 * Return the TbcClassDef property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcClassDef() {
	if (ivjTbcClassDef == null) {
		try {
			ivjTbcClassDef = new javax.swing.table.TableColumn();
			ivjTbcClassDef.setHeaderValue("ClassDef");
			// user code begin {1}
			ivjTbcClassDef.setHeaderValue(resRoleDefDialog.getString("TbcClassDef_header"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcClassDef;
}
/**
 * Return the TblClassRestriction property value.
 * @return javax.swing.JTable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTable getTblClassRestriction() {
	if (ivjTblClassRestriction == null) {
		try {
			ivjTblClassRestriction = new javax.swing.JTable();
			ivjTblClassRestriction.setName("TblClassRestriction");
			getScpClassRestriction().setColumnHeaderView(ivjTblClassRestriction.getTableHeader());
			getScpClassRestriction().getViewport().setBackingStoreEnabled(true);
			ivjTblClassRestriction.setBounds(0, 0, 200, 200);
			ivjTblClassRestriction.setAutoCreateColumnsFromModel(false);
			ivjTblClassRestriction.addColumn(getTbcClassDef());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTblClassRestriction;
}
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private RestrictedClassesPanel getTabRestricted() {
	if (ivjTabRestricted == null) {
		try {
			ivjTabRestricted = new RestrictedClassesPanel();
			ivjTabRestricted.setName("TabRestricted");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTabRestricted;
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
			ivjTbpGeneral.insertTab(getDetailString(), null, getPnlDetail(), null, 1);
			ivjTbpGeneral.insertTab(resRoleDefDialog.getString("TbpDerivedFrom_title"), null, getPnlDerivedFrom(), null, 2);
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
	getMniNewClassDef().addActionListener(ivjEventHandler);
	getScpClassRestriction().addMouseListener(ivjEventHandler);
	getTblClassRestriction().addMouseListener(ivjEventHandler);
	getMniOpenClassDefSpecification().addActionListener(ivjEventHandler);
	getMniRemoveClassDef().addActionListener(ivjEventHandler);
	getRbtReference().addItemListener(ivjEventHandler);
	getRbtStructure().addItemListener(ivjEventHandler);
	getRbtRelationship().addItemListener(ivjEventHandler);
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
		setName("UMLClassSpecificationDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(601, 529);
		setTitle(resRoleDefDialog.getString("UMLClassSpecificationDialog_title"));
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	ButtonGroup buttonGroup = new ButtonGroup();
	buttonGroup.add(getRbtRelationship());
	buttonGroup.add(getRbtStructure());
	buttonGroup.add(getRbtReference());

	buttonGroup = new ButtonGroup();
	buttonGroup.add(getRbtAssociation());
	buttonGroup.add(getRbtAggregation());
	buttonGroup.add(getRbtComposition());

	getCbxCardinality().setModel(new DefaultComboBoxModel(MultiplicityConverter.getDefaultCardinalities()));

	//ce getTblClassRestriction().setModel(new EditorTableModel());
	//ce ((EditorTableModel)getTblClassRestriction().getModel()).setRestrictedClassDef(null);
        getTabRestricted().setOwnerDialog(this);

	// user code end
}
/**
 * Comment
 */
private void mniNewClassDef() {
	ModelElementSelectionDialog dialog = new ModelElementSelectionDialog(this, resRoleDefDialog.getString("CTClassDefSelection"), true, roleDef); //$NON-NLS-1$
	getTblClassRestriction().setModel(new EditorTableModel());
	((EditorTableModel)getTblClassRestriction().getModel()).setRestrictedClassDef(roleDef.iteratorRestriction());
}
/**
 * Comment
 */
private void mniOpenClassDefSpecification() {
	((EditorTableModel)getTblClassRestriction().getModel()).showSpecification(getTblClassRestriction().getSelectedRows());
}
/**
 * Comment
 */
private void mniRemoveClassDef() {
	((EditorTableModel)getTblClassRestriction().getModel()).removeRows(getTblClassRestriction().getSelectedRows());
}
/**
 * Update Model.
 * @see okPressed()
 * @see applyPressed
 */
protected boolean save() {
	if (!ElementUtils.trySetName(roleDef, getTxtName().getText())) {
		return false;
	}
	getPnlDescription().getObject();

	// save ReferenceKind
	if (getRbtStructure().isSelected()) {
		roleDef.setIliAttributeKind(AssociationAsIliAttrKind.STRUCTURE);
		roleDef.setMultiplicity(MultiplicityConverter.createMultiplicity((String)getCbxCardinality().getSelectedItem()));
	} else if (getRbtReference().isSelected()) {
		roleDef.setIliAttributeKind(AssociationAsIliAttrKind.REFERENCE);
		roleDef.setMultiplicity(null);
	} else {
		roleDef.setIliAttributeKind(AssociationAsIliAttrKind.ASSOCIATION);
		roleDef.setMultiplicity(MultiplicityConverter.createMultiplicity((String)getCbxCardinality().getSelectedItem()));
	}

	// save AggregationKind
	if (getRbtAggregation().isSelected()) {
		roleDef.setAggregation(AggregationKind.AGGREGATE);
	} else if (getRbtComposition().isSelected()) {
		roleDef.setAggregation(AggregationKind.COMPOSITE);
	} else {
		roleDef.setAggregation(AggregationKind.NONE);
	}

	// page Detail
	roleDef.setAbstract(getChxAbstract().isSelected());
	roleDef.setPropExtended(getChxExtended().isSelected());
	roleDef.setPropFinal(getChxFinal().isSelected());
	roleDef.setOrdering(getChxOrdered().isSelected() ? OrderingKind.ORDERED : OrderingKind.UNORDERED);
	roleDef.setPropExternal(getChxExternal().isSelected());
	roleDef.setNavigable(getChxNavigable().isSelected());
	if (getCbxEnd().hasElementChanged()) {
		// remove ClassDef
		if (roleDef.containsParticipant()) {
			roleDef.detachParticipant();
		}
		if (getCbxEnd().getElement() != null) {
			roleDef.attachParticipant((AbstractClassDef)getCbxEnd().getElement());
		}
	}
        roleDef.clearRestriction();
        AbstractClassDef[] rv=(AbstractClassDef[])getTabRestricted().getObject();
        for(int i=0;i<rv.length;i++){
            roleDef.addRestriction(rv[i]);
        }

	// page DerivedFrom RoleDef has 0/1 RoleDefDerived
	if (roleDef.containsRoleDefDerived()) {
		roleDef.getRoleDefDerived().setSyntax(getPnlDerivedFrom().getSyntax());
	} else {
		if (getPnlDerivedFrom().getSyntax() != null) {
			RoleDefDerived roleDefDerived = new RoleDefDerived();
			roleDefDerived.setSyntax(getPnlDerivedFrom().getSyntax());
			roleDef.attachRoleDefDerived(roleDefDerived);
		}
	}

	return super.save();
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	roleDef = (ch.ehi.interlis.associations.RoleDef)element;

	getTxtName().setText(roleDef.getDefLangName());
	getPnlDescription().setObject(element);

	// set ReferenceKind
	if (roleDef.getIliAttributeKind() == AssociationAsIliAttrKind.REFERENCE) {
		getRbtReference().setSelected(true);
	} else if (roleDef.getIliAttributeKind() == AssociationAsIliAttrKind.STRUCTURE) {
		getRbtStructure().setSelected(true);
		getCbxCardinality().setSelectedItem(MultiplicityConverter.getRange(roleDef.getMultiplicity()));
	} else {
		// the Usual
		getRbtRelationship().setSelected(true);
		getCbxCardinality().setSelectedItem(MultiplicityConverter.getRange(roleDef.getMultiplicity()));
	}

	// set AggregationKind
	if (roleDef.getAggregation() == AggregationKind.AGGREGATE) {
		getRbtAggregation().setSelected(true);
	} else if (roleDef.getAggregation() == AggregationKind.COMPOSITE) {
		getRbtComposition().setSelected(true);
	} else {
		// NONE
		getRbtAssociation().setSelected(true);
	}

	// set page Detail
	getChxAbstract().setSelected(roleDef.isAbstract());
	getChxExtended().setSelected(roleDef.isPropExtended());
	getChxFinal().setSelected(roleDef.isPropFinal());
	getChxOrdered().setSelected(roleDef.getOrdering() == OrderingKind.ORDERED);
	getChxExternal().setSelected(roleDef.isPropExternal());
	getChxNavigable().setSelected(roleDef.isNavigable());
	if (roleDef.containsParticipant()) {
		getCbxEnd().setElement(AbstractClassDef.class, roleDef.getAssociation(), roleDef.getParticipant());
	} else {
		getCbxEnd().setElement(AbstractClassDef.class, roleDef.getAssociation(), null);
	}
	//ce getTblClassRestriction().setModel(new EditorTableModel());
	//ce ((EditorTableModel)getTblClassRestriction().getModel()).setRestrictedClassDef(roleDef.iteratorRestriction());
        AbstractClassDef[] rv=new AbstractClassDef[roleDef.sizeRestriction()];
        java.util.Iterator ri=roleDef.iteratorRestriction();
        for(int i=0;i<rv.length;i++){
          rv[i]=(AbstractClassDef)ri.next();
        }
        getTabRestricted().setObject(rv,roleDef.getAssociation());


	// set page DerivedFrom
	if (roleDef.containsRoleDefDerived()) {
		getPnlDerivedFrom().setSyntax(roleDef.getRoleDefDerived());
	} else {
		getPnlDerivedFrom().setSyntax(null);
	}
}
}
