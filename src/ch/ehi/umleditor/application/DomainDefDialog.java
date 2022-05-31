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
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import ch.ehi.interlis.domainsandconstants.UnknownType;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.umleditor.interlis.iliimport.TransferFromIli2cMetamodel;
import ch.interlis.ili2c.metamodel.Ili2cMetaAttrs;
import ch.softenvironment.util.Tracer;

import java.util.Iterator;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.types.NlsString;
import ch.softenvironment.view.*;

/**
 * User Interface for a DomainDef.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.7 $ $Date: 2006-07-03 15:48:44 $
 */
public class DomainDefDialog extends BaseDialog {
	// ModelElement
	private ch.ehi.interlis.domainsandconstants.DomainDef domainDef = null;
	private BasePanel currentDataPanel = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JTextField ivjTxtName = null;
	private javax.swing.JButton ivjBtnApply = null;
	private javax.swing.JComboBox ivjCbxType = null;
	private javax.swing.JCheckBox ivjChxAbstract = null;
	private javax.swing.JCheckBox ivjChxFinal = null;
	private DescriptionPanel ivjPnlDescription = null;
	private javax.swing.JCheckBox ivjChxMandatory = null;
	private javax.swing.JLabel ivjLblType = null;
	private javax.swing.JPanel ivjPnlDetail = null;
	private IliBaseTypeBasketPanel ivjPnlTypeBasket = null;
	private IliBaseTypeCoordPanel ivjPnlTypeCoord = null;
	private IliBaseTypeEnumPanel ivjPnlTypeEnum = null;
	private IliBaseTypeLinePanel ivjPnlTypeLine = null;
	private IliBaseTypeTextPanel ivjPnlTypeText = null;
	private IliBaseTypeOidPanel ivjPnlTypeOid = null;
	private IliBaseTypeClassPanel ivjPnlTypeClass = null;
    private InterlisSyntaxPanel ivjPnlTypeUnknown=null;
	private IliBaseTypeDatePanel ivjPnlTypeDate=null;
	private IliBaseTypeDateTimePanel ivjPnlTypeDateTime=null;
	private IliBaseTypeTimePanel ivjPnlTypeTime=null;
	private IliBaseTypeNumericPanel ivjPnlTypeNumeric = null;
	private javax.swing.JTabbedPane ivjTbpTypes = null;
	private ExtendedPanel ivjPnlExtended = null;
	private IliBaseTypeAlignmentPanel ivjPnlTypeAlignment = null;
	private MetaAttributePanel ivjPnlMetaAttributes = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.ItemListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == DomainDefDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == DomainDefDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == DomainDefDialog.this.getBtnApply())
				connEtoC3(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == DomainDefDialog.this.getTxtName())
				connEtoM1(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == DomainDefDialog.this.getCbxType())
				connEtoC4(e);
		};
	};
/**
 * Constructor
 */
public DomainDefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();
	addEscapeKey();
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
public DomainDefDialog(java.awt.Frame owner, boolean modal) {
	super(owner, modal);
	initialize();
}
/**
 * Handle escape key to close the dialog
 */
 private void addEscapeKey() {
	 
	 KeyStroke escape = KeyStroke.getKeyStroke (KeyEvent.VK_ESCAPE, 0, false);
	 Action escapeAction = new AbstractAction() {
		
		private static final long serialVersionUID = -2972481431614869047L;
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			dispose();
		}
	 };
	 getRootPane ().getInputMap (JComponent.WHEN_IN_FOCUSED_WINDOW).put (escape, "ESCAPE");
	 getRootPane ().getActionMap ().put ("ESCAPE", escapeAction);
 }
/**
 * Adapt the chosen INTERLIS type and manage the specific type Panel.
 * @see AttributeDefDialog#adaptType()
 */
private void adaptType() {
	String item = (String)getCbxType().getSelectedItem();
	BasePanel newPanel = null;

	if (item.equals(IliBaseTypeKind.NULL_TYPE) ||
			item.equals(IliBaseTypeKind.BOOLEAN)) {
		newPanel = null;
	} else if (item.equals(IliBaseTypeKind.TEXT)) {
		newPanel = getPnlTypeText();
	} else if (item.equals(IliBaseTypeKind.ENUM)) {
		newPanel = getPnlTypeEnum();
	} else if (item.equals(IliBaseTypeKind.NUMERIC)) {
		newPanel = getPnlTypeNumeric();
		// initalize aggregations
		getPnlTypeNumeric().setObject(ElementFactory.createNumericType(), domainDef);
	} else if (item.equals(IliBaseTypeKind.COORD)) {
		newPanel = getPnlTypeCoord();
		// initalize Numeric aggregations
		getPnlTypeCoord().setObject(null, domainDef, domainDef);
	} else if (item.equals(IliBaseTypeKind.BASKET)) {
		newPanel = getPnlTypeBasket();
		// initalize aggregations
		getPnlTypeBasket().setObject(ElementFactory.createBasketType(), domainDef);
	} else if (item.equals(IliBaseTypeKind.ALIGNMENT)) {
		newPanel = getPnlTypeAlignment();
		// initalize aggregations
		getPnlTypeAlignment().setObject(new HorizAlignment());
	} else if (item.equals(IliBaseTypeKind.POLYLINE)) {
		newPanel = getPnlTypeLine();
		getPnlTypeLine().setObject(new IliPolyline(), domainDef, domainDef);
	} else if (item.equals(IliBaseTypeKind.SURFACE)) {
		newPanel = getPnlTypeLine();
		getPnlTypeLine().setObject(new IndividualSurface(), domainDef, domainDef);
	} else if (item.equals(IliBaseTypeKind.OID_TYPE)) {
		newPanel = getPnlTypeOid();
		getPnlTypeOid().setObject(new OidType(), domainDef);
	} else if (item.equals(IliBaseTypeKind.CLASS_TYPE)) {
		newPanel = getPnlTypeClass();
		getPnlTypeClass().setObject(new ClassType(), domainDef);
	} else if (item.equals(IliBaseTypeKind.UNKNOWN)) {
		newPanel = getPnlTypeUnknown();
	} else if (item.equals(IliBaseTypeKind.DATE)) {
		newPanel = getPnlTypeDate();
	} else if (item.equals(IliBaseTypeKind.DATETIME)) {
		newPanel = getPnlTypeDateTime();
	} else if (item.equals(IliBaseTypeKind.TIME)) {
		newPanel = getPnlTypeTime();
	} else if (item.equals(IliBaseTypeKind.AREA)) {
		newPanel = getPnlTypeLine();
		getPnlTypeLine().setObject(new Tesselation(), domainDef, domainDef);
	}

	if (currentDataPanel != newPanel) {
		if (currentDataPanel != null) {
			getTbpTypes().remove(currentDataPanel);
		}
		currentDataPanel = newPanel;
		if (currentDataPanel != null) {
			getTbpTypes().add(currentDataPanel);
			getTbpTypes().setTitleAt(getTbpTypes().getTabCount() - 1, getResourceString("TbcTypeSpecific_text")); //$NON-NLS-1$
			getTbpTypes().setSelectedComponent(currentDataPanel);
		}
	}
}
/**
 * connEtoC1:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> DomainDefDialog.okPressed()V)
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
 * connEtoC2:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> DomainDefDialog.cancelPressed()V)
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
 * connEtoC3:  (BtnApply.action.actionPerformed(java.awt.event.ActionEvent) --> DomainDefDialog.applyPressed()V)
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
 * connEtoC4:  (CbxType.item.itemStateChanged(java.awt.event.ItemEvent) --> DomainDefDialog.adaptType()V)
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
			constraintsLblName.gridx = 1; constraintsLblName.gridy = 1;
			constraintsLblName.ipadx = 104;
			constraintsLblName.insets = new java.awt.Insets(17, 10, 4, 5);
			getBaseDialogContentPane().add(getLblName(), constraintsLblName);

			java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
			constraintsTxtName.gridx = 2; constraintsTxtName.gridy = 1;
			constraintsTxtName.gridwidth = 3;
			constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtName.weightx = 1.0;
			constraintsTxtName.ipadx = 221;
			constraintsTxtName.insets = new java.awt.Insets(13, 5, 2, 161);
			getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

			java.awt.GridBagConstraints constraintsTbpTypes = new java.awt.GridBagConstraints();
			constraintsTbpTypes.gridx = 1; constraintsTbpTypes.gridy = 3;
			constraintsTbpTypes.gridwidth = 4;
			constraintsTbpTypes.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpTypes.weightx = 1.0;
			constraintsTbpTypes.weighty = 1.0;
			constraintsTbpTypes.ipadx = -357;
			constraintsTbpTypes.ipady = -2; // -2
			constraintsTbpTypes.insets = new java.awt.Insets(2, 7, 7, 9);
			getBaseDialogContentPane().add(getTbpTypes(), constraintsTbpTypes);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 4;
			constraintsBtnOk.gridwidth = 2;
			constraintsBtnOk.ipadx = 64;
			constraintsBtnOk.insets = new java.awt.Insets(7, 101, 8, 8);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 3; constraintsBtnCancel.gridy = 4;
			constraintsBtnCancel.ipadx = 18;
			constraintsBtnCancel.insets = new java.awt.Insets(7, 9, 8, 4);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
			constraintsBtnApply.gridx = 4; constraintsBtnApply.gridy = 4;
			constraintsBtnApply.ipadx = 8;
			constraintsBtnApply.insets = new java.awt.Insets(7, 5, 8, 74);
			getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

			java.awt.GridBagConstraints constraintsCbxType = new java.awt.GridBagConstraints();
			constraintsCbxType.gridx = 2; constraintsCbxType.gridy = 2;
			constraintsCbxType.gridwidth = 2;
			constraintsCbxType.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsCbxType.weightx = 1.0;
			constraintsCbxType.ipadx = 61;
			constraintsCbxType.insets = new java.awt.Insets(3, 5, 2, 5);
			getBaseDialogContentPane().add(getCbxType(), constraintsCbxType);

			java.awt.GridBagConstraints constraintsLblType = new java.awt.GridBagConstraints();
			constraintsLblType.gridx = 1; constraintsLblType.gridy = 2;
			constraintsLblType.ipadx = 117;
			constraintsLblType.insets = new java.awt.Insets(9, 10, 5, 5);
			getBaseDialogContentPane().add(getLblType(), constraintsLblType);
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
			ivjBtnApply.setText(getApplyString());
			// user code begin {1}
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
 * Return the ChxAbstract property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxAbstract() {
	if (ivjChxAbstract == null) {
		try {
			ivjChxAbstract = new javax.swing.JCheckBox();
			ivjChxAbstract.setName("ChxAbstract");
 			ivjChxAbstract.setToolTipText("Abstrakt");
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
 * Return the ChxFinal property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxFinal() {
	if (ivjChxFinal == null) {
		try {
			ivjChxFinal = new javax.swing.JCheckBox();
			ivjChxFinal.setName("ChxFinal");
 			ivjChxFinal.setText("Final");
 			ivjChxFinal.setToolTipText("");
			ivjChxFinal.setEnabled(true);
			// user code begin {1}
			ivjChxFinal.setText(getResourceString("ChxFinal_text"));
			ivjChxFinal.setToolTipText(getResourceString("ChxFinal_toolTipText"));
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
 * Return the ChxExtended property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxMandatory() {
	if (ivjChxMandatory == null) {
		try {
			ivjChxMandatory = new javax.swing.JCheckBox();
			ivjChxMandatory.setName("ChxMandatory");
 			ivjChxMandatory.setToolTipText("Mandatory");
 			ivjChxMandatory.setText("Mandatory");
			ivjChxMandatory.setEnabled(true);
			// user code begin {1}
			ivjChxMandatory.setToolTipText(getResourceString("ChxMandatory_toolTipText"));
			ivjChxMandatory.setText(getResourceString("ChxMandatory_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxMandatory;
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
 * Return the LblName1 property value.
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
 			ivjLblType.setText(getResourceString("LblType_text"));
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
 * Return the PnlMetaAttributes property value.
 */
private MetaAttributePanel getPnlMetaAttributes() {
	if (ivjPnlMetaAttributes == null) {
		try {
			ivjPnlMetaAttributes = new MetaAttributePanel(this);
			ivjPnlMetaAttributes.setName("PnlMetaAttributes");
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
	}
	return ivjPnlMetaAttributes;
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
			constraintsChxAbstract.ipadx = 53;
			constraintsChxAbstract.insets = new java.awt.Insets(20, 20, 2, 417);
			getPnlDetail().add(getChxAbstract(), constraintsChxAbstract);

			java.awt.GridBagConstraints constraintsChxMandatory = new java.awt.GridBagConstraints();
			constraintsChxMandatory.gridx = 1; constraintsChxMandatory.gridy = 3;
			constraintsChxMandatory.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxMandatory.ipadx = 42;
			constraintsChxMandatory.insets = new java.awt.Insets(2, 20, 16, 417);
			getPnlDetail().add(getChxMandatory(), constraintsChxMandatory);

			java.awt.GridBagConstraints constraintsChxFinal = new java.awt.GridBagConstraints();
			constraintsChxFinal.gridx = 1; constraintsChxFinal.gridy = 2;
			constraintsChxFinal.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsChxFinal.ipadx = 83;
			constraintsChxFinal.insets = new java.awt.Insets(3, 20, 1, 417);
			getPnlDetail().add(getChxFinal(), constraintsChxFinal);

			java.awt.GridBagConstraints constraintsPnlExtended = new java.awt.GridBagConstraints();
			constraintsPnlExtended.gridx = 1; constraintsPnlExtended.gridy = 4;
			constraintsPnlExtended.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsPnlExtended.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsPnlExtended.weightx = 1.0;
			constraintsPnlExtended.weighty = 1.0;
			constraintsPnlExtended.ipadx = 83;
			constraintsPnlExtended.ipady = 30;
			constraintsPnlExtended.insets = new java.awt.Insets(17, 20, 221, 16);
			getPnlDetail().add(getPnlExtended(), constraintsPnlExtended);
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
 * Return the TbpGeneral property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeBasketPanel getPnlTypeBasket() {
	if (ivjPnlTypeBasket == null) {
		try {
			ivjPnlTypeBasket = new ch.ehi.umleditor.application.IliBaseTypeBasketPanel();
			ivjPnlTypeBasket.setName("PnlTypeBasket");
			ivjPnlTypeBasket.setToolTipText("INTERLIS Basistyp <BASKET>");
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
			ivjPnlTypeText.setLayout(null);
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
 * Return the TbpTypes property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTabbedPane getTbpTypes() {
	if (ivjTbpTypes == null) {
		try {
			ivjTbpTypes = new javax.swing.JTabbedPane();
			ivjTbpTypes.setName("TbpTypes");
			ivjTbpTypes.insertTab(getDescriptionString(), null, getPnlDescription(), null, 0);
			ivjTbpTypes.insertTab(getDetailString(), null, getPnlDetail(), null, 1);
			ivjTbpTypes.insertTab("Typ:TEXT", null, getPnlTypeText(), null, 2);
			ivjTbpTypes.insertTab("Typ: ENUM", null, getPnlTypeEnum(), null, 3);
			ivjTbpTypes.insertTab("Typ: NUMERIC", null, getPnlTypeNumeric(), null, 4);
			ivjTbpTypes.insertTab("Typ: COORD", null, getPnlTypeCoord(), null, 5);
			ivjTbpTypes.insertTab("Typ: BASKET", null, getPnlTypeBasket(), null, 6);
			ivjTbpTypes.insertTab("Typ: <Line>", null, getPnlTypeLine(), null, 7);
			ivjTbpTypes.insertTab("PnlTypeAlignment", null, getPnlTypeAlignment(), null, 8);
			ivjTbpTypes.insertTab("PnlTypeUnknown", null, getPnlTypeUnknown(), null, 9);
			ivjTbpTypes.insertTab("PnlTypeOid", null, getPnlTypeOid(), null, 10);
			ivjTbpTypes.insertTab("PnlTypeClass", null, getPnlTypeClass(), null, 11);
			ivjTbpTypes.insertTab("PnlTypeDate", null, getPnlTypeDate(), null, 12);
			ivjTbpTypes.insertTab("PnlTypeDateTime", null, getPnlTypeDateTime(), null, 13);
			ivjTbpTypes.insertTab("PnlTypeTime", null, getPnlTypeTime(), null, 14);
			ivjTbpTypes.insertTab(getResourceString("TbpMetaAttributes_text"), null, getPnlMetaAttributes(), null, 15);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbpTypes;
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
		setName("DomainDefDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(598, 657); // 598, 557
		setTitle(getResourceString("CTDialog"));
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	getTbpTypes().remove(getPnlTypeBasket());
	getTbpTypes().remove(getPnlTypeAlignment());
	getTbpTypes().remove(getPnlTypeCoord());
	getTbpTypes().remove(getPnlTypeEnum());
	getTbpTypes().remove(getPnlTypeLine());
	getTbpTypes().remove(getPnlTypeNumeric());
	getTbpTypes().remove(getPnlTypeText());
	getTbpTypes().remove(getPnlTypeUnknown());
	getTbpTypes().remove(getPnlTypeOid());
	getTbpTypes().remove(getPnlTypeClass());
	getTbpTypes().remove(getPnlTypeDate());
	getTbpTypes().remove(getPnlTypeDateTime());
	getTbpTypes().remove(getPnlTypeTime());

	getCbxType().setModel(new javax.swing.DefaultComboBoxModel(IliBaseTypeKind.getDomainDefTypes()));
	getCbxType().setSelectedItem(IliBaseTypeKind.NULL_TYPE);

	getPnlTypeLine().setOwnerDialog(this);
	getPnlTypeClass().setOwnerDialog(this);
	// user code end
}
/**
 * Save ModelElement changes.
 * @see okPressed()
 * @see applyPressed
 */
protected boolean save() {
	if (!ElementUtils.trySetName(domainDef, getTxtName().getText())) {
		return false;
	}
	getPnlDescription().getObject();

	// page details
	domainDef.setAbstract(getChxAbstract().isSelected());
	domainDef.setPropFinal(getChxFinal().isSelected());
	domainDef.setMandatory(getChxMandatory().isSelected());
	if (!getPnlExtended().getExtension()) {
		return false;
	}

	// page specific type
	if (domainDef.containsType()) {
		domainDef.detachType();
	}
	if (getCbxType().getSelectedItem() == IliBaseTypeKind.BOOLEAN) {
		domainDef.attachType(new BooleanType());
	} else if (getCbxType().getSelectedItem() == IliBaseTypeKind.ALIGNMENT) {
		domainDef.attachType((BaseType)getPnlTypeAlignment().getObject());
	} else if (getCbxType().getSelectedItem() == IliBaseTypeKind.UNKNOWN) {
                UnknownType unknown=new UnknownType();
                unknown.setSyntax(getPnlTypeUnknown().getSyntax());
		domainDef.attachType(unknown);
	} else if (currentDataPanel != null) {
		domainDef.attachType((ch.ehi.interlis.domainsandconstants.Type)((DataPanel)currentDataPanel).getObject());
		setEPSGCode();
	}

	// page MetaAttributes
	getPnlMetaAttributes().saveToObject(domainDef);

	return super.save();
}
private void setEPSGCode() {
    String epsgCode=null;
    String item = (String)getCbxType().getSelectedItem();
    if (item.equals(IliBaseTypeKind.POLYLINE)) {
        epsgCode=getPnlTypeLine().getTxtEpsgCode().getText();
    } else if (item.equals(IliBaseTypeKind.COORD)) {
        epsgCode= getPnlTypeCoord().getTxtEpsgCode().getText();
    } else if (item.equals(IliBaseTypeKind.SURFACE)) {
        epsgCode= getPnlTypeLine().getTxtEpsgCode().getText();
    } else if (item.equals(IliBaseTypeKind.AREA)) {
        epsgCode= getPnlTypeLine().getTxtEpsgCode().getText();
    }
    if(epsgCode!=null) {
        ElementUtils.setIliTaggedValue(domainDef, Ili2cMetaAttrs.ILI2C_CRS, epsgCode);
    }
}
/**
 * Map model to view.
 * @see DomainDefDialog#setElement(Element)
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	domainDef = (ch.ehi.interlis.domainsandconstants.DomainDef)element;

	// general & page Description
	getTxtName().setText(domainDef.getDefLangName());
	getPnlDescription().setObject(element);

	// page Details
	getChxAbstract().setSelected(domainDef.isAbstract());
	getChxFinal().setSelected(domainDef.isPropFinal());
	getChxMandatory().setSelected(domainDef.isMandatory());
	getPnlExtended().setExtension(domainDef);

	// page specific type
	if (domainDef.containsType()) {
		ch.ehi.interlis.domainsandconstants.Type type =	domainDef.getType();
		if (type instanceof BooleanType) {
			getCbxType().setSelectedItem(IliBaseTypeKind.BOOLEAN);
		} else if ((type instanceof VertAlignment) || (type instanceof HorizAlignment)) {
			getCbxType().setSelectedItem(IliBaseTypeKind.ALIGNMENT);
			getPnlTypeAlignment().setObject(type);
		} else if (type instanceof Text) {
			getCbxType().setSelectedItem(IliBaseTypeKind.TEXT);
			getPnlTypeText().setObject(type);
		} else if (type instanceof Enumeration) {
			getCbxType().setSelectedItem(IliBaseTypeKind.ENUM);
			getPnlTypeEnum().setObject(type);
		} else if (type instanceof NumericType) {
			getCbxType().setSelectedItem(IliBaseTypeKind.NUMERIC);
			getPnlTypeNumeric().setObject(type, domainDef);
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
				getPnlTypeCoord().setObject(type, domainDef, domainDef);
			}else{
				// 2.2 type; doesn't exist in 2.3
				// convert to Syntax
				UnknownType convertedType=ElementUtils.convertType(type);
				getCbxType().setSelectedItem(IliBaseTypeKind.UNKNOWN);
				getPnlTypeUnknown().setSyntax(convertedType);
			}
		} else if (type instanceof IliPolyline) {
			getCbxType().setSelectedItem(IliBaseTypeKind.POLYLINE);
			getPnlTypeLine().setObject(type, domainDef, domainDef);
		} else if (type instanceof IndividualSurface) {
			getCbxType().setSelectedItem(IliBaseTypeKind.SURFACE);
			getPnlTypeLine().setObject(type, domainDef, domainDef);
		} else if (type instanceof Tesselation) {
			getCbxType().setSelectedItem(IliBaseTypeKind.AREA);
			getPnlTypeLine().setObject(type, domainDef, domainDef);
		} else if (type instanceof OidType) {
			getCbxType().setSelectedItem(IliBaseTypeKind.OID_TYPE);
			getPnlTypeOid().setObject(type, domainDef);
		} else if (type instanceof ClassType) {
			getCbxType().setSelectedItem(IliBaseTypeKind.CLASS_TYPE);
			getPnlTypeClass().setObject(type, domainDef);
		} else if (type instanceof DateType) {
			getCbxType().setSelectedItem(IliBaseTypeKind.DATE);
			getPnlTypeDate().setObject(type, domainDef);
		} else if (type instanceof DateTimeType) {
			getCbxType().setSelectedItem(IliBaseTypeKind.DATETIME);
			getPnlTypeDateTime().setObject(type, domainDef);
		} else if (type instanceof TimeType) {
			getCbxType().setSelectedItem(IliBaseTypeKind.TIME);
			getPnlTypeTime().setObject(type, domainDef);
		} else if (type instanceof UnknownType) {
			getCbxType().setSelectedItem(IliBaseTypeKind.UNKNOWN);
			getPnlTypeUnknown().setSyntax((UnknownType)type);
		} else {
//TODO NYI: Type not displayable <" + type.toString() + ">"
		}
	}

	// page MetaAttributes
	getPnlMetaAttributes().setCurrentObject(domainDef);
}
/**
 * Overwrites.
 */
public void dispose() {
    domainDef = null; // try to avoid OutOfMemoryException in case dialog might not be garbaged
    super.dispose();
}
}
