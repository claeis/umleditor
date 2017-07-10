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

import ch.ehi.interlis.domainsandconstants.linetypes.*;
import javax.swing.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import ch.ehi.interlis.domainsandconstants.UnknownType;
import ch.ehi.interlis.attributes.*;
import ch.ehi.uml1_4.foundation.datatypes.OrderingKind;
import ch.softenvironment.view.*;
import ch.softenvironment.util.*;
/**
 * User Interface for an AttributeDef.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.8 $ $Date: 2007-01-14 08:17:17 $
 */
public class AttributeDefDialog extends BaseDialog {
	// ModelElement
	private static java.util.ResourceBundle resAttributeDefDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/AttributeDefDialog");
	private static java.util.ResourceBundle resRoleDefDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/RoleDefDialog"); //$NON-NLS-1$;
	private AttributeDef attributeDef = null;
	private BasePanel currentDataPanel = null;
	private JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JButton ivjBtnCancel = null;
	private JButton ivjBtnOk = null;
	private JTabbedPane ivjTbpGeneral = null;
	private JLabel ivjLblName = null;
	private JTextField ivjTxtName = null;
	private JComboBox ivjCbxType = null;
	private JButton ivjBtnApply = null;
	private JCheckBox ivjChxAbstract = null;
	private JCheckBox ivjChxFinal = null;
	private JCheckBox ivjChxTransient = null;
	private JCheckBox ivjChxOrdered = null;
	private JPanel ivjPnlConstraints = null;
	private DescriptionPanel ivjPnlDescription = null;
	private JLabel ivjLblType = null;
	private JPanel ivjPnlDetail = null;
	private IliBaseTypeBasketPanel ivjPnlTypeBasket = null;
	private IliBaseTypeCoordPanel ivjPnlTypeCoord = null;
	private IliBaseTypeEnumPanel ivjPnlTypeEnum = null;
	private IliBaseTypeLinePanel ivjPnlTypeLine = null;
	private IliBaseTypeNumericPanel ivjPnlTypeNumeric = null;
	private IliBaseTypeTextPanel ivjPnlTypeText = null;
        private InterlisSyntaxPanel ivjPnlTypeUnknown=null;
	private IliBaseTypeDatePanel ivjPnlTypeDate=null;
	private IliBaseTypeDateTimePanel ivjPnlTypeDateTime=null;
	private IliBaseTypeTimePanel ivjPnlTypeTime=null;
	private IliBaseTypeOidPanel ivjPnlTypeOid = null;
	private IliBaseTypeClassPanel ivjPnlTypeClass = null;
	private IliBaseTypeStructAttrPanel ivjPnlTypeStructAttr = null;
	private IliBaseTypeRefAttrPanel ivjPnlTypeRefAttr = null;
	private InterlisSyntaxPanel ivjPnlSyntax = null;
	private JCheckBox ivjChxExtended = null;
	private IliBaseTypeDomainDefPanel ivjPnlTypeDomainDef = null;
	private IliBaseTypeAlignmentPanel ivjPnlTypeAlignment = null;
	private JComboBox ivjCbxCardinality = null;
	private JLabel ivjLblCardinality = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.ItemListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == AttributeDefDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == AttributeDefDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == AttributeDefDialog.this.getBtnApply())
				connEtoC3(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == AttributeDefDialog.this.getTxtName())
				connEtoM1(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == AttributeDefDialog.this.getCbxType())
				connEtoC4(e);
		};
	};
/**
 * Constructor
 */
public AttributeDefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();
	setTitle(((AttributeDef)element).getOwner().getDefLangName() + "->" + getTitle());
	setRelativeLocation(owner);
	setElement(element);
	show();
}
/**
 * Adapt the chosen INTERLIS type Panel and create a new default type Instance.
 * @see DomainDefDialog#adaptType()
 */
private void adaptType() {
	String item = (String)getCbxType().getSelectedItem();
	BasePanel newPanel = null;

	if (item.equals(IliBaseTypeKind.NULL_TYPE) || item.equals(IliBaseTypeKind.BOOLEAN)) {
		newPanel = null;
	} else if (item.equals(IliBaseTypeKind.TEXT)) {
		newPanel = getPnlTypeText();
	} else if (item.equals(IliBaseTypeKind.ENUM)) {
		newPanel = getPnlTypeEnum();
	} else if (item.equals(IliBaseTypeKind.NUMERIC)) {
		newPanel = getPnlTypeNumeric();
		// initalize aggregations
		getPnlTypeNumeric().setObject(ElementFactory.createNumericType(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.COORD)) {
		newPanel = getPnlTypeCoord();
		// initalize Numeric aggregations
		getPnlTypeCoord().setObject(null, attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.BASKET)) {
		newPanel = getPnlTypeBasket();
		getPnlTypeBasket().setObject(ElementFactory.createBasketType(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.ALIGNMENT)) {
		newPanel = getPnlTypeAlignment();
		// initalize aggregations
		getPnlTypeAlignment().setObject(new HorizAlignment());
	} else if (item.equals(IliBaseTypeKind.POLYLINE)) {
		newPanel = getPnlTypeLine();
		getPnlTypeLine().setObject(new IliPolyline(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.SURFACE)) {
		newPanel = getPnlTypeLine();
		getPnlTypeLine().setObject(new IndividualSurface(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.AREA)) {
		newPanel = getPnlTypeLine();
		getPnlTypeLine().setObject(new Tesselation(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.UNKNOWN)) {
		newPanel = getPnlTypeUnknown();
	} else if (item.equals(IliBaseTypeKind.DATE)) {
		newPanel = getPnlTypeDate();
	} else if (item.equals(IliBaseTypeKind.DATETIME)) {
		newPanel = getPnlTypeDateTime();
	} else if (item.equals(IliBaseTypeKind.TIME)) {
		newPanel = getPnlTypeTime();
	} else if (item.equals(IliBaseTypeKind.OID_TYPE)) {
		newPanel = getPnlTypeOid();
		getPnlTypeOid().setObject(new OidType(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.CLASS_TYPE)) {
		newPanel = getPnlTypeClass();
		getPnlTypeClass().setObject(new ClassType(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.STRUCTURE)) {
		newPanel = getPnlTypeStructAttr();
		getPnlTypeStructAttr().setOwnerDialog(this);
		getPnlTypeStructAttr().setObject(new StructAttrType(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.REFERENCE)) {
		newPanel = getPnlTypeRefAttr();
		getPnlTypeRefAttr().setOwnerDialog(this);
		getPnlTypeRefAttr().setObject(new RefAttrType(), attributeDef.getOwner());
	} else if (item.equals(IliBaseTypeKind.DOMAINDEF)) {
		newPanel = getPnlTypeDomainDef();
		getPnlTypeDomainDef().setDialog(this);
		try {
			getPnlTypeDomainDef().setObject(null, attributeDef.getOwner());
		} catch(Throwable e) {
			handleException(e);
		}
	}

	if (currentDataPanel != newPanel) {
		if (currentDataPanel != null) {
			getTbpGeneral().remove(currentDataPanel);
		}
		currentDataPanel = newPanel;
		if (currentDataPanel != null) {
			getTbpGeneral().add(currentDataPanel);
			getTbpGeneral().setTitleAt(getTbpGeneral().getTabCount() - 1, resAttributeDefDialog.getString("CTTypeSpecific")); //$NON-NLS-1$
			getTbpGeneral().setSelectedComponent(currentDataPanel);
		}
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
 * connEtoC4:  (CbxType.item.itemStateChanged(java.awt.event.ItemEvent) --> AttributeDefDialog.adaptType()V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.adaptType();
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
			constraintsLblName.gridx = 0; constraintsLblName.gridy = 0;
			constraintsLblName.ipadx = 104;
			constraintsLblName.insets = new java.awt.Insets(22, 19, 8, 3);
			getBaseDialogContentPane().add(getLblName(), constraintsLblName);

			java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
			constraintsTxtName.gridx = 1; constraintsTxtName.gridy = 0;
			constraintsTxtName.gridwidth = 4;
			constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtName.weightx = 1.0;
			constraintsTxtName.ipadx = 317;
			constraintsTxtName.insets = new java.awt.Insets(19, 3, 5, 117);
			getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

			java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
			constraintsTbpGeneral.gridx = 0; constraintsTbpGeneral.gridy = 2;
			constraintsTbpGeneral.gridwidth = 5;
			constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpGeneral.weightx = 1.0;
			constraintsTbpGeneral.weighty = 1.0;
			constraintsTbpGeneral.ipady = -2;
			constraintsTbpGeneral.insets = new java.awt.Insets(4, 12, 4, 11);
			getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

			java.awt.GridBagConstraints constraintsLblType = new java.awt.GridBagConstraints();
			constraintsLblType.gridx = 0; constraintsLblType.gridy = 1;
			constraintsLblType.ipadx = 117;
			constraintsLblType.insets = new java.awt.Insets(9, 19, 8, 3);
			getBaseDialogContentPane().add(getLblType(), constraintsLblType);

			java.awt.GridBagConstraints constraintsCbxType = new java.awt.GridBagConstraints();
			constraintsCbxType.gridx = 1; constraintsCbxType.gridy = 1;
			constraintsCbxType.gridwidth = 3;
			constraintsCbxType.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsCbxType.weightx = 1.0;
			constraintsCbxType.ipadx = 79;
			constraintsCbxType.insets = new java.awt.Insets(5, 3, 3, 20);
			getBaseDialogContentPane().add(getCbxType(), constraintsCbxType);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 0; constraintsBtnOk.gridy = 3;
			constraintsBtnOk.gridwidth = 2;
			constraintsBtnOk.ipadx = 64;
			constraintsBtnOk.insets = new java.awt.Insets(5, 80, 9, 13);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 3;
			constraintsBtnCancel.ipadx = 18;
			constraintsBtnCancel.insets = new java.awt.Insets(5, 13, 9, 14);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
			constraintsBtnApply.gridx = 3; constraintsBtnApply.gridy = 3;
			constraintsBtnApply.gridwidth = 2;
			constraintsBtnApply.ipadx = 8;
			constraintsBtnApply.insets = new java.awt.Insets(5, 14, 9, 124);
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
 * Return the CbxCardinality property value.
 * @return javax.swing.JComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JComboBox getCbxCardinality() {
	if (ivjCbxCardinality == null) {
		try {
			ivjCbxCardinality = new javax.swing.JComboBox();
			ivjCbxCardinality.setName("CbxCardinality");
			ivjCbxCardinality.setBounds(165, 113, 177, 23);
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
 * Return the CbxType property value.
 * @return javax.swing.JComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JComboBox getCbxType() {
	if (ivjCbxType == null) {
		try {
			ivjCbxType = new javax.swing.JComboBox();
			ivjCbxType.setName("CbxType");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxType;
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
			ivjChxAbstract.setToolTipText(resAttributeDefDialog.getString("ChxAbstract_toolTipText"));
 			ivjChxAbstract.setText(resAttributeDefDialog.getString("ChxAbstract_text"));
			ivjChxAbstract.setBounds(17, 13, 140, 22);
			// user code begin {1}
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
 * Return the ChxExtended property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxExtended() {
	if (ivjChxExtended == null) {
		try {
			ivjChxExtended = new javax.swing.JCheckBox();
			ivjChxExtended.setName("ChxExtended");
			ivjChxExtended.setToolTipText(resAttributeDefDialog.getString("ChxExtended_toolTipText"));
			ivjChxExtended.setText(resAttributeDefDialog.getString("ChxExtended_text"));
			ivjChxExtended.setBounds(17, 70, 140, 22);
			// user code begin {1}
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
 * Return the JCheckBox3 property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxFinal() {
	if (ivjChxFinal == null) {
		try {
			ivjChxFinal = new javax.swing.JCheckBox();
			ivjChxFinal.setName("ChxFinal");
			ivjChxFinal.setText(resAttributeDefDialog.getString("ChxFinal_text"));
			ivjChxFinal.setBounds(17, 42, 140, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxFinal;
}
private javax.swing.JCheckBox getChxTransient() {
	if (ivjChxTransient == null) {
		try {
			ivjChxTransient = new javax.swing.JCheckBox();
			ivjChxTransient.setName("ChxTransient");
			ivjChxTransient.setText(resAttributeDefDialog.getString("ChxTransient_text"));
			ivjChxTransient.setBounds(165, 13, 140, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxTransient;
}
private javax.swing.JCheckBox getChxOrdered() {
	if (ivjChxOrdered == null) {
		try {
			ivjChxOrdered = new javax.swing.JCheckBox();
			ivjChxOrdered.setName("ChxTransient");
			ivjChxOrdered.setText(resRoleDefDialog.getString("ChxOrdered_text"));
			ivjChxOrdered.setBounds(165, 42, 140, 22);
			// user code begin {1}
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
 * Return the LblCardinality property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblCardinality() {
	if (ivjLblCardinality == null) {
		try {
			ivjLblCardinality = new javax.swing.JLabel();
			ivjLblCardinality.setName("LblCardinality");
			ivjLblCardinality.setText(resRoleDefDialog.getString("LblCardinality_text"));
			ivjLblCardinality.setBounds(17, 116, 140, 14);
			// user code begin {1}
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
			ivjLblName.setText(resAttributeDefDialog.getString("LblName_text"));
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
 * Return the JLabel11 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblType() {
	if (ivjLblType == null) {
		try {
			ivjLblType = new javax.swing.JLabel();
			ivjLblType.setName("LblType");
			ivjLblType.setText("Typ:");
			// user code begin {1}
			ivjLblType.setText(resAttributeDefDialog.getString("LblType_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblType;
}
/**
 * Return the PnlConstraints property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlConstraints() {
	if (ivjPnlConstraints == null) {
		try {
			ivjPnlConstraints = new javax.swing.JPanel();
			ivjPnlConstraints.setName("PnlConstraints");
			ivjPnlConstraints.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsPnlSyntax = new java.awt.GridBagConstraints();
			constraintsPnlSyntax.gridx = 0; constraintsPnlSyntax.gridy = 0;
			constraintsPnlSyntax.fill = java.awt.GridBagConstraints.BOTH;
			constraintsPnlSyntax.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsPnlSyntax.weightx = 1.0;
			constraintsPnlSyntax.weighty = 1.0;
			constraintsPnlSyntax.ipadx = 404;
			constraintsPnlSyntax.ipady = 222;
			constraintsPnlSyntax.insets = new java.awt.Insets(4, 8, 10, 13);
			getPnlConstraints().add(getPnlSyntax(), constraintsPnlSyntax);
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
 * Return the JPanel1 property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlDetail() {
	if (ivjPnlDetail == null) {
		try {
			ivjPnlDetail = new javax.swing.JPanel();
			ivjPnlDetail.setName("PnlDetail");
			ivjPnlDetail.setLayout(null);
			getPnlDetail().add(getChxAbstract(), getChxAbstract().getName());
			getPnlDetail().add(getChxExtended(), getChxExtended().getName());
			getPnlDetail().add(getChxFinal(), getChxFinal().getName());
			getPnlDetail().add(getChxTransient(), getChxTransient().getName());
			getPnlDetail().add(getChxOrdered(), getChxOrdered().getName());
			getPnlDetail().add(getCbxCardinality(), getCbxCardinality().getName());
			getPnlDetail().add(getLblCardinality(), getLblCardinality().getName());
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
 * Return the PnlSyntax property value.
 * @return ch.ehi.umleditor.application.InterlisSyntaxPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private InterlisSyntaxPanel getPnlSyntax() {
	if (ivjPnlSyntax == null) {
		try {
			ivjPnlSyntax = new ch.ehi.umleditor.application.InterlisSyntaxPanel();
			ivjPnlSyntax.setName("PnlSyntax");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlSyntax;
}
/**
 * Return the PnlTypeAlignment property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeAlignmentPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeAlignmentPanel getPnlTypeAlignment() {
	if (ivjPnlTypeAlignment == null) {
		try {
			ivjPnlTypeAlignment = new ch.ehi.umleditor.application.IliBaseTypeAlignmentPanel();
			ivjPnlTypeAlignment.setName("PnlTypeAlignment");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeAlignment;
}
/**
 * Return the PnlTypeBasket property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeBasketPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeBasketPanel getPnlTypeBasket() {
	if (ivjPnlTypeBasket == null) {
		try {
			ivjPnlTypeBasket = new ch.ehi.umleditor.application.IliBaseTypeBasketPanel();
			ivjPnlTypeBasket.setName("PnlTypeBasket");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeBasket;
}
/**
 * Return the PnlTypeCoord property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeCoordPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeCoordPanel getPnlTypeCoord() {
	if (ivjPnlTypeCoord == null) {
		try {
			ivjPnlTypeCoord = new ch.ehi.umleditor.application.IliBaseTypeCoordPanel();
			ivjPnlTypeCoord.setName("PnlTypeCoord");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeCoord;
}
/**
 * Return the PnlTypeDomainDef property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeDomainDefPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeDomainDefPanel getPnlTypeDomainDef() {
	if (ivjPnlTypeDomainDef == null) {
		try {
			ivjPnlTypeDomainDef = new ch.ehi.umleditor.application.IliBaseTypeDomainDefPanel();
			ivjPnlTypeDomainDef.setName("PnlTypeDomainDef");
			ivjPnlTypeDomainDef.setLayout(null);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeDomainDef;
}
/**
 * Return the PnlTypeEnum property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeEnumPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeEnumPanel getPnlTypeEnum() {
	if (ivjPnlTypeEnum == null) {
		try {
			ivjPnlTypeEnum = new ch.ehi.umleditor.application.IliBaseTypeEnumPanel();
			ivjPnlTypeEnum.setName("PnlTypeEnum");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeEnum;
}
/**
 * Return the PnlTypeLine property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeLinePanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeLinePanel getPnlTypeLine() {
	if (ivjPnlTypeLine == null) {
		try {
			ivjPnlTypeLine = new ch.ehi.umleditor.application.IliBaseTypeLinePanel();
			ivjPnlTypeLine.setName("PnlTypeLine");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeLine;
}
/**
 * Return the PnlTypeNumeric property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeNumericPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeNumericPanel getPnlTypeNumeric() {
	if (ivjPnlTypeNumeric == null) {
		try {
			ivjPnlTypeNumeric = new ch.ehi.umleditor.application.IliBaseTypeNumericPanel();
			ivjPnlTypeNumeric.setName("PnlTypeNumeric");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeNumeric;
}
/**
 * Return the PnlTypeText property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeTextPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeTextPanel getPnlTypeText() {
	if (ivjPnlTypeText == null) {
		try {
			ivjPnlTypeText = new ch.ehi.umleditor.application.IliBaseTypeTextPanel();
			ivjPnlTypeText.setName("PnlTypeText");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeText;
}
/**
 * Return the PnlTypeUnknown property value.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private InterlisSyntaxPanel getPnlTypeUnknown() {
	if (ivjPnlTypeUnknown == null) {
		try {
			ivjPnlTypeUnknown = new ch.ehi.umleditor.application.InterlisSyntaxPanel();
			ivjPnlTypeUnknown.setName("PnlTypeUnknown");
			// user code begin {1}
                        ivjPnlTypeUnknown.setSyntax(null);
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeUnknown;
}
/**
 * Return the PnlTypeDate property value.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeDatePanel getPnlTypeDate() {
	if (ivjPnlTypeDate == null) {
		try {
			ivjPnlTypeDate = new IliBaseTypeDatePanel();
			ivjPnlTypeDate.setName("PnlTypeDate");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeDate;
}
/**
 * Return the PnlTypeDateTime property value.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeDateTimePanel getPnlTypeDateTime() {
	if (ivjPnlTypeDateTime == null) {
		try {
			ivjPnlTypeDateTime = new IliBaseTypeDateTimePanel();
			ivjPnlTypeDateTime.setName("PnlTypeDateTime");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeDateTime;
}
/**
 * Return the PnlTypeTime property value.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeTimePanel getPnlTypeTime() {
	if (ivjPnlTypeTime == null) {
		try {
			ivjPnlTypeTime = new IliBaseTypeTimePanel();
			ivjPnlTypeTime.setName("PnlTypeTime");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeTime;
}
/**
 * Return the PnlTypeOid property value.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeOidPanel getPnlTypeOid() {
	if (ivjPnlTypeOid == null) {
		try {
			ivjPnlTypeOid = new ch.ehi.umleditor.application.IliBaseTypeOidPanel();
			ivjPnlTypeOid.setName("PnlTypeOid");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeOid;
}
/**
 * Return the PnlTypeClass property value.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeClassPanel getPnlTypeClass() {
	if (ivjPnlTypeClass == null) {
		try {
			ivjPnlTypeClass = new ch.ehi.umleditor.application.IliBaseTypeClassPanel();
			ivjPnlTypeClass.setName("PnlTypeClass");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeClass;
}
private IliBaseTypeStructAttrPanel getPnlTypeStructAttr() {
	if (ivjPnlTypeStructAttr == null) {
		try {
			ivjPnlTypeStructAttr = new ch.ehi.umleditor.application.IliBaseTypeStructAttrPanel();
			ivjPnlTypeStructAttr.setName("PnlTypeStructAttr");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeStructAttr;
}
private IliBaseTypeRefAttrPanel getPnlTypeRefAttr() {
	if (ivjPnlTypeRefAttr == null) {
		try {
			ivjPnlTypeRefAttr = new ch.ehi.umleditor.application.IliBaseTypeRefAttrPanel();
			ivjPnlTypeRefAttr.setName("PnlTypeRefAttr");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTypeRefAttr;
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
			ivjTbpGeneral.insertTab(resAttributeDefDialog.getString("TbpRestriction_text"), null, getPnlConstraints(), null, 2);
			ivjTbpGeneral.insertTab("Typ: TEXT", null, getPnlTypeText(), null, 3);
			ivjTbpGeneral.insertTab("Typ: ENUM", null, getPnlTypeEnum(), null, 4);
			ivjTbpGeneral.insertTab("Typ: NUMERIC", null, getPnlTypeNumeric(), null, 5);
			ivjTbpGeneral.insertTab("Typ: COORD", null, getPnlTypeCoord(), null, 6);
			ivjTbpGeneral.insertTab("Typ: BASKET", null, getPnlTypeBasket(), null, 7);
			ivjTbpGeneral.insertTab("Typ: <Line>", null, getPnlTypeLine(), null, 8);
			ivjTbpGeneral.insertTab("Typ: DomainDef", null, getPnlTypeDomainDef(), null, 9);
			ivjTbpGeneral.insertTab("PnlTypeAlignment", null, getPnlTypeAlignment(), null, 10);
			ivjTbpGeneral.insertTab("PnlTypeUnknown", null, getPnlTypeUnknown(), null, 11);
			ivjTbpGeneral.insertTab("PnlTypeDate", null, getPnlTypeDate(), null, 12);
			ivjTbpGeneral.insertTab("PnlTypeDateTime", null, getPnlTypeDateTime(), null, 13);
			ivjTbpGeneral.insertTab("PnlTypeTime", null, getPnlTypeTime(), null, 14);
			ivjTbpGeneral.insertTab("PnlTypeOid", null, getPnlTypeOid(), null, 15);
			ivjTbpGeneral.insertTab("PnlTypeClass", null, getPnlTypeClass(), null, 16);
			ivjTbpGeneral.insertTab("PnlTypeStructAttr", null, getPnlTypeStructAttr(), null, 17);
			ivjTbpGeneral.insertTab("PnlTypeRefAttr", null, getPnlTypeRefAttr(), null, 18);
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
	getCbxType().addItemListener(ivjEventHandler);
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
		setSize(603, 568);
		setTitle(resAttributeDefDialog.getString("CTDialogTitle"));
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	getTbpGeneral().remove(getPnlTypeBasket());
	getTbpGeneral().remove(getPnlTypeAlignment());
	getTbpGeneral().remove(getPnlTypeCoord());
	getTbpGeneral().remove(getPnlTypeEnum());
	getTbpGeneral().remove(getPnlTypeLine());
	getTbpGeneral().remove(getPnlTypeNumeric());
	getTbpGeneral().remove(getPnlTypeText());
	getTbpGeneral().remove(getPnlTypeDomainDef());
	getTbpGeneral().remove(getPnlTypeUnknown());
	getTbpGeneral().remove(getPnlTypeDate());
	getTbpGeneral().remove(getPnlTypeDateTime());
	getTbpGeneral().remove(getPnlTypeTime());
	getTbpGeneral().remove(getPnlTypeOid());
	getTbpGeneral().remove(getPnlTypeClass());
	getTbpGeneral().remove(getPnlTypeStructAttr());
	getTbpGeneral().remove(getPnlTypeRefAttr());

	getCbxType().setModel(new javax.swing.DefaultComboBoxModel(IliBaseTypeKind.getAttributeDefTypes()));
	getCbxType().setSelectedItem(IliBaseTypeKind.NULL_TYPE);

	getCbxCardinality().setModel(new DefaultComboBoxModel(MultiplicityConverter.getDefaultCardinalities()));

	getPnlTypeLine().setOwnerDialog(this);
	getPnlTypeClass().setOwnerDialog(this);
	// user code end
}
/**
 * Update Model.
 * @see okPressed()
 * @see applyPressed
 */
protected boolean save() {
	if (!ElementUtils.trySetName(attributeDef, getTxtName().getText())) {
		return false;
	}
        // ??? ce2003-04-05 Why is this call required? Does the function name
        // match the semantics?
	getPnlDescription().getObject();

	// page details
	attributeDef.setAbstract(getChxAbstract().isSelected());
	attributeDef.setPropExtended(getChxExtended().isSelected());
	attributeDef.setPropFinal(getChxFinal().isSelected());
	attributeDef.setPropTransient(getChxTransient().isSelected());
	attributeDef.setOrdering(getChxOrdered().isSelected() ? OrderingKind.ORDERED : OrderingKind.UNORDERED);
	attributeDef.setMultiplicity(MultiplicityConverter.createMultiplicity((String)getCbxCardinality().getSelectedItem()));

	// page Constraints
	/*if (getRbtUndefined().isSelected()) {
		if (attributeDef.containsFunctionCall()) {
			attributeDef.detachFunctionCall();
		} else if (attributeDef.containsConstant()) {
			attributeDef.detachConstant();
		} else if (attributeDef.containsAttributeValueUsage()) {
			attributeDef.detachAttributeValueUsage();
		}
	} else if (getRbtFunctionCall().isSelected()) {
		if (attributeDef.containsFunctionCall()) {
			attributeDef.getFunctionCall().setSyntax(getPnlSyntax().getSyntax());
		} else {
			if (attributeDef.containsConstant()) {
				attributeDef.detachConstant();
			}
			if (attributeDef.containsAttributeValueUsage()) {
				attributeDef.detachAttributeValueUsage();
			}
			FunctionCall functionCall = new FunctionCall();
			functionCall.setSyntax(getPnlSyntax().getSyntax());
			attributeDef.attachFunctionCall(functionCall);
		}
	} else if (getRbtConstant().isSelected()) {
		if (attributeDef.containsConstant()) {
			attributeDef.getConstant().setSyntax(getPnlSyntax().getSyntax());
		} else {
			if (attributeDef.containsFunctionCall()) {
				attributeDef.detachFunctionCall();
			}
			if (attributeDef.containsAttributeValueUsage()) {
				attributeDef.detachAttributeValueUsage();
			}
			Constant constant = new Constant();
			constant.setSyntax(getPnlSyntax().getSyntax());
			attributeDef.attachConstant(constant);
		}
	} else if (getRbtAttributePath().isSelected()) {
		if (attributeDef.containsAttributeValueUsage()) {
			attributeDef.getAttributeValueUsage().setSyntax(getPnlSyntax().getSyntax());
		} else {
			if (attributeDef.containsFunctionCall()) {
				attributeDef.detachFunctionCall();
			}
			if (attributeDef.containsConstant()) {
				attributeDef.detachConstant();
			}
			AttributeValueUsage attributeValueUsage = new AttributeValueUsage();
			attributeValueUsage.setSyntax(getPnlSyntax().getSyntax());
			attributeDef.attachAttributeValueUsage(attributeValueUsage);
		}
	}
*/
	if (getPnlSyntax().getSyntax() == null) {
		if (attributeDef.containsAttributeValueUsage()) {
			attributeDef.detachAttributeValueUsage();
		}
	} else {
		if (attributeDef.containsAttributeValueUsage()) {
			attributeDef.getAttributeValueUsage().setSyntax(getPnlSyntax().getSyntax());
		} else {
			AttributeValueUsage attributeValueUsage = new AttributeValueUsage();
			attributeValueUsage.setSyntax(getPnlSyntax().getSyntax());
			attributeDef.attachAttributeValueUsage(attributeValueUsage);
		}
	}

	// page type specific
	if (attributeDef.containsAttrType()) {
	  // remove current type
          ch.ehi.interlis.tools.UnlinkAllChildren remover=new ch.ehi.interlis.tools.UnlinkAllChildren();
          remover.visit(attributeDef.getAttrType());
          remover.unlinkThem();
	}
	if (getCbxType().getSelectedItem() != IliBaseTypeKind.getNullType()) {
			// must be DomainType
			DomainAttribute domainAttribute = new DomainAttribute();
			if (getCbxType().getSelectedItem() == IliBaseTypeKind.DOMAINDEF) {
				// either DomainDef
				if (((DataPanel)currentDataPanel).getObject() != null) {
					domainAttribute.attachDomainDef((ch.ehi.interlis.domainsandconstants.DomainDef)((DataPanel)currentDataPanel).getObject());
				}
			} else {
				// or direct-type
				if (getCbxType().getSelectedItem() == IliBaseTypeKind.BOOLEAN) {
					domainAttribute.attachDirect(new BooleanType());
				} else if (getCbxType().getSelectedItem() == IliBaseTypeKind.ALIGNMENT) {
					domainAttribute.attachDirect((BaseType)getPnlTypeAlignment().getObject());
				} else if (getCbxType().getSelectedItem() == IliBaseTypeKind.UNKNOWN) {
                                        UnknownType unknown=new UnknownType();
                                        unknown.setSyntax(getPnlTypeUnknown().getSyntax());
					domainAttribute.attachDirect(unknown);
				} else {
					domainAttribute.attachDirect((ch.ehi.interlis.domainsandconstants.Type)((DataPanel)currentDataPanel).getObject());
				}
			}
			attributeDef.attachAttrType(domainAttribute);
	}
	return super.save();
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	attributeDef = (AttributeDef)element;
	
	// general & page Description
	getTxtName().setText(attributeDef.getDefLangName());
	getPnlDescription().setObject(element);

	// page Details
	getChxAbstract().setSelected(attributeDef.isAbstract());
	getChxExtended().setSelected(attributeDef.isPropExtended());
	getChxFinal().setSelected(attributeDef.isPropFinal());
	getChxTransient().setSelected(attributeDef.isPropTransient());
	getChxOrdered().setSelected(attributeDef.getOrdering()==OrderingKind.ORDERED ? true:false);

	getCbxCardinality().setSelectedItem(MultiplicityConverter.getRange(attributeDef.getMultiplicity()));

	// page Constraints
	/* if (attributeDef.containsFunctionCall()) {
		getRbtFunctionCall().setSelected(true);
		getPnlSyntax().setSyntax(attributeDef.getFunctionCall());
	} else if (attributeDef.containsConstant()) {
		getRbtConstant().setSelected(true);
		getPnlSyntax().setSyntax(attributeDef.getConstant());
	} else */ if (attributeDef.containsAttributeValueUsage()) {
		getPnlSyntax().setSyntax(attributeDef.getAttributeValueUsage());
	} else {
		getPnlSyntax().setSyntax(null);
	}

	if (attributeDef.containsAttrType()) {
		// page specific type
		AttrType attrType = attributeDef.getAttrType();
		if (attrType instanceof DomainAttribute) {
			// @see DomainDefDialog#setElement(Element)
			if (((DomainAttribute)attrType).containsDirect()) {
				ch.ehi.interlis.domainsandconstants.Type type = ((DomainAttribute)attrType).getDirect();
				if (type instanceof BooleanType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.BOOLEAN);
				} else if ((type instanceof VertAlignment) || (type instanceof HorizAlignment)) {
					getCbxType().setSelectedItem(IliBaseTypeKind.ALIGNMENT);
					getPnlTypeAlignment().setObject(type);
				} else if (type instanceof Text) {
					getCbxType().setSelectedItem(IliBaseTypeKind.TEXT);
					getPnlTypeText().setObject(type);
				} else if (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration) {
					getCbxType().setSelectedItem(IliBaseTypeKind.ENUM);
					getPnlTypeEnum().setObject(type);
				} else if (type instanceof NumericType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.NUMERIC);
					getPnlTypeNumeric().setObject(type, attributeDef.getOwner());
				} else if (type instanceof StructuredUnitType
						|| type instanceof BasketType) {
					// 2.2 type; doesn't exist in 2.3
					// convert to Syntax
					UnknownType convertedType=ElementUtils.convertType(type);
					getCbxType().setSelectedItem(IliBaseTypeKind.UNKNOWN);
					getPnlTypeUnknown().setSyntax(convertedType);
				} else if (type instanceof CoordinateType) {
					CoordinateType ct=(CoordinateType)type;
					java.util.Iterator dimi=ct.iteratorDim();
					boolean isIli22=false;
					while(dimi.hasNext()){
						NumericalType dim=(NumericalType)dimi.next();
						if(dim instanceof StructuredUnitType){
							isIli22=true;
						}
					}
					if(!isIli22){
						getCbxType().setSelectedItem(IliBaseTypeKind.COORD);
						getPnlTypeCoord().setObject(type, attributeDef.getOwner());
					}else{
						// 2.2 type; doesn't exist in 2.3
						// convert to Syntax
						UnknownType convertedType=ElementUtils.convertType(type);
						getCbxType().setSelectedItem(IliBaseTypeKind.UNKNOWN);
						getPnlTypeUnknown().setSyntax(convertedType);
					}
				} else if (type instanceof IliPolyline) {
					getCbxType().setSelectedItem(IliBaseTypeKind.POLYLINE);
					getPnlTypeLine().setObject(type, attributeDef.getOwner());
				} else if (type instanceof IndividualSurface) {
					getCbxType().setSelectedItem(IliBaseTypeKind.SURFACE);
					getPnlTypeLine().setObject(type, attributeDef.getOwner());
				} else if (type instanceof Tesselation) {
					getCbxType().setSelectedItem(IliBaseTypeKind.AREA);
					getPnlTypeLine().setObject(type, attributeDef.getOwner());
				} else if (type instanceof UnknownType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.UNKNOWN);
					getPnlTypeUnknown().setSyntax((UnknownType)type);
				} else if (type instanceof DateType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.DATE);
					getPnlTypeDate().setObject(type, attributeDef.getOwner());
				} else if (type instanceof DateTimeType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.DATETIME);
					getPnlTypeDateTime().setObject(type, attributeDef.getOwner());
				} else if (type instanceof TimeType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.TIME);
					getPnlTypeTime().setObject(type, attributeDef.getOwner());
				} else if (type instanceof OidType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.OID_TYPE);
					getPnlTypeOid().setObject(type, attributeDef.getOwner());
				} else if (type instanceof ClassType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.CLASS_TYPE);
					getPnlTypeClass().setObject(type, attributeDef.getOwner());
				} else if (type instanceof StructAttrType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.STRUCTURE);
					getPnlTypeStructAttr().setObject(type, attributeDef.getOwner());
				} else if (type instanceof RefAttrType) {
					getCbxType().setSelectedItem(IliBaseTypeKind.REFERENCE);
					getPnlTypeRefAttr().setObject(type, attributeDef.getOwner());
				} else {
//TODO NYI: Type not displayable <" + type.toString() + ">
				}
			} else {
				getCbxType().setSelectedItem(IliBaseTypeKind.DOMAINDEF);
				ch.ehi.interlis.domainsandconstants.DomainDef domainDef = null;
				if (((DomainAttribute)attrType).containsDomainDef()) {
					domainDef = ((DomainAttribute)attrType).getDomainDef();
				} else {
					Tracer.getInstance().runtimeWarning("DomainAttribute contains neither DirectType nor DomainDef");
				}
				getPnlTypeDomainDef().setObject(domainDef, attributeDef.getOwner());
			}
		} else {
			Tracer.getInstance().developerError("should be a certain AttrType");
		}
	}
}
}
