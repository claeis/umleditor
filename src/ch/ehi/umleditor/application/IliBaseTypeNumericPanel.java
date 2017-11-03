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
import ch.ehi.interlis.units.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import ch.softenvironment.util.*;
import ch.softenvironment.view.*;
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
/**
 * INTERLIS BaseType representation of <b>NumericalType</b>.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.5 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeNumericPanel extends BasePanel implements DataPanel {
<<<<<<< HEAD
=======
	
	private static final long serialVersionUID = -6277857692669521896L;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	private JRadioButton ivjRbtUnspecified = null;
	private ReferencableComboBox ivjCbxUnitDef = null;
	private JCheckBox ivjChxCircular = null;
	private JLabel ivjLblMax = null;
	private JLabel ivjLblMin = null;
	private JLabel ivjLblReferenceSystem = null;
	private JLabel ivjLblUnit = null;
	private InterlisSyntaxPanel ivjPnlReferenceSystem = null;
	private JRadioButton ivjRbtClockwise = null;
	private JRadioButton ivjRbtCounterClockwise = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JLabel ivjLblKind = null;
	private IliDimPanel ivjPnlMax = null;
	private IliDimPanel ivjPnlMin = null;
	private JPanel ivjPnlTop = null;
	private JRadioButton ivjRbtRangeDefined = null;
	private JRadioButton ivjRbtRangeStructured = null;
	private JRadioButton ivjRbtRangeUndefined = null;
	private JTextField ivjTxtMaxStruct = null;
	private JTextField ivjTxtMinStruct = null;

<<<<<<< HEAD
class IvjEventHandler implements java.awt.event.ItemListener {
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == IliBaseTypeNumericPanel.this.getRbtRangeDefined()) 
				connEtoC1(e);
			if (e.getSource() == IliBaseTypeNumericPanel.this.getRbtRangeUndefined()) 
				connEtoC2(e);
		};
	};
/**
 * IliBaseTypeTextPanel constructor comment.
 */
public IliBaseTypeNumericPanel() {
	super();
	initialize();
}
/**
 * connEtoC1:  (ChxRangeDefined.item.itemStateChanged(java.awt.event.ItemEvent) --> IliBaseTypeNumericPanel.chxRangeDefined_ItemStateChanged(Ljava.awt.event.ItemEvent;)V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.rangeChanged();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (RbtRangeUndefined.item.itemStateChanged(java.awt.event.ItemEvent) --> IliBaseTypeNumericPanel.rangeChanged()V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.rangeChanged();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the CbxUnitDef property value.
 * @return ch.ehi.umleditor.application.ReferencableComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ReferencableComboBox getCbxUnitDef() {
	if (ivjCbxUnitDef == null) {
		try {
			ivjCbxUnitDef = new ch.ehi.umleditor.application.ReferencableComboBox();
			ivjCbxUnitDef.setName("CbxUnitDef");
			ivjCbxUnitDef.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjCbxUnitDef.setBounds(316, 87, 161, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxUnitDef;
}
/**
 * Return the ChxCircular property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxCircular() {
	if (ivjChxCircular == null) {
		try {
			ivjChxCircular = new javax.swing.JCheckBox();
			ivjChxCircular.setName("ChxCircular");
			ivjChxCircular.setToolTipText("");
			ivjChxCircular.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjChxCircular.setText("Zirkulär");
			ivjChxCircular.setBounds(4, 84, 153, 22);
			// user code begin {1}
			ivjChxCircular.setToolTipText(getResourceString("ChxCircular_toolTipText"));
			ivjChxCircular.setText(getResourceString("ChxCircular_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxCircular;
}
/**
 * Return Kind.
 */
private int getkind() {
	if (getRbtUnspecified().isSelected()) {
		return RotationKind.UNDEFINED;
	} else if (getRbtClockwise().isSelected()) {
		return RotationKind.CLOCKWISE;
	} else if (getRbtCounterClockwise().isSelected()) {
		return RotationKind.COUNTERCLOCKWISE;
	} else {
		throw new DeveloperException("nothing choosed");//$NON-NLS-1$
	}
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
			ivjLblKind.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjLblKind.setText("Art:");
			ivjLblKind.setBounds(4, 109, 153, 14);
			// user code begin {1}
			ivjLblKind.setText(getResourceString("LblKind_text"));
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
 * Return the LblMax property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblMax() {
	if (ivjLblMax == null) {
		try {
			ivjLblMax = new javax.swing.JLabel();
			ivjLblMax.setName("LblMax");
			ivjLblMax.setToolTipText("");
			ivjLblMax.setText("Max-Dec/Struct:");
			ivjLblMax.setBounds(168, 34, 140, 14);
			// user code begin {1}
			ivjLblMax.setText(getResourceString("LblMaxDec_text"));
			ivjLblMax.setToolTipText(getResourceString("LblMax_toolTipText"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblMax;
}
/**
 * Return the LblMin property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblMin() {
	if (ivjLblMin == null) {
		try {
			ivjLblMin = new javax.swing.JLabel();
			ivjLblMin.setName("LblMin");
			ivjLblMin.setToolTipText("Min.");
			ivjLblMin.setText("Min-Dec/Struct:");
			ivjLblMin.setBounds(168, 10, 140, 14);
			// user code begin {1}
			ivjLblMin.setText(getResourceString("LblMinStruct_text"));
			ivjLblMin.setToolTipText(getResourceString("LblMin_toolTipText"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblMin;
}
/**
 * Return the LblReferenceSystem property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblReferenceSystem() {
	if (ivjLblReferenceSystem == null) {
		try {
			ivjLblReferenceSystem = new javax.swing.JLabel();
			ivjLblReferenceSystem.setName("LblReferenceSystem");
			ivjLblReferenceSystem.setToolTipText("Referenz System");
			ivjLblReferenceSystem.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjLblReferenceSystem.setText("RefSys:");
			// user code begin {1}
			ivjLblReferenceSystem.setToolTipText(getResourceString("LblReferenceSystem_toolTipText"));
			ivjLblReferenceSystem.setText(getResourceString("LblReferenceSystem_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblReferenceSystem;
}
/**
 * Return the LblUnit property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblUnit() {
	if (ivjLblUnit == null) {
		try {
			ivjLblUnit = new javax.swing.JLabel();
			ivjLblUnit.setName("LblUnit");
			ivjLblUnit.setToolTipText("");
			ivjLblUnit.setText("Einheit:");
			ivjLblUnit.setBounds(168, 89, 140, 14);
			// user code begin {1}
			ivjLblUnit.setToolTipText(getResourceString("LblUnit_toolTipText"));
			ivjLblUnit.setText(getResourceString("LblUnit_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblUnit;
}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
	NumericalType type = null;
		type = ElementFactory.createNumericType();
		// Range
		if (getRbtRangeDefined().isSelected()) {
			((NumericType)type).setRangeDefined(true);
			((NumericType)type).setMinDec((IliDim)getPnlMin().getObject());
			((NumericType)type).setMaxDec((IliDim)getPnlMax().getObject());
		}

	type.setCircular(getChxCircular().isSelected());
	if (type.containsUnitDef()) {
		type.detachUnitDef();
	}
	if (/*getChxCircular().isSelected() &&*/ (getCbxUnitDef().getElement() != null)) {
		// modelCheck is up to model
		type.attachUnitDef((UnitDef)getCbxUnitDef().getElement());
	}

	if (type.containsRefSys()) {
		type.getRefSys().setSyntax(getPnlReferenceSystem().getSyntax());
	} else if (getPnlReferenceSystem().getSyntax() != null) {
		// create new RefSys
		RefSys refSys = new RefSys();
		refSys.setSyntax(getPnlReferenceSystem().getSyntax());
		type.attachRefSys(refSys);
	}

	type.setDirection(getkind());

	return type;
}
/**
 * Return the PnlMax property value.
 * @return ch.ehi.umleditor.application.IliDimPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliDimPanel getPnlMax() {
	if (ivjPnlMax == null) {
		try {
			ivjPnlMax = new ch.ehi.umleditor.application.IliDimPanel();
			ivjPnlMax.setName("PnlMax");
			ivjPnlMax.setBounds(316, 33, 161, 24);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlMax;
}
/**
 * Return the PnlMin property value.
 * @return ch.ehi.umleditor.application.IliDimPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliDimPanel getPnlMin() {
	if (ivjPnlMin == null) {
		try {
			ivjPnlMin = new ch.ehi.umleditor.application.IliDimPanel();
			ivjPnlMin.setName("PnlMin");
			ivjPnlMin.setBounds(316, 5, 161, 24);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlMin;
}
/**
 * Return the PnlReferenceSystem property value.
 * @return ch.ehi.umleditor.application.InterlisSyntaxPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private InterlisSyntaxPanel getPnlReferenceSystem() {
	if (ivjPnlReferenceSystem == null) {
		try {
			ivjPnlReferenceSystem = new ch.ehi.umleditor.application.InterlisSyntaxPanel();
			ivjPnlReferenceSystem.setName("PnlReferenceSystem");
			ivjPnlReferenceSystem.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlReferenceSystem;
}
/**
 * Return the JPanel1 property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlTop() {
	if (ivjPnlTop == null) {
		try {
			ivjPnlTop = new javax.swing.JPanel();
			ivjPnlTop.setName("PnlTop");
			ivjPnlTop.setLayout(null);
			getPnlTop().add(getRbtRangeDefined(), getRbtRangeDefined().getName());
			getPnlTop().add(getLblMin(), getLblMin().getName());
			getPnlTop().add(getLblMax(), getLblMax().getName());
			getPnlTop().add(getPnlMin(), getPnlMin().getName());
			getPnlTop().add(getPnlMax(), getPnlMax().getName());
			getPnlTop().add(getChxCircular(), getChxCircular().getName());
			getPnlTop().add(getLblUnit(), getLblUnit().getName());
			getPnlTop().add(getCbxUnitDef(), getCbxUnitDef().getName());
			getPnlTop().add(getLblKind(), getLblKind().getName());
			getPnlTop().add(getRbtUnspecified(), getRbtUnspecified().getName());
			getPnlTop().add(getRbtClockwise(), getRbtClockwise().getName());
			getPnlTop().add(getRbtCounterClockwise(), getRbtCounterClockwise().getName());
			getPnlTop().add(getRbtRangeUndefined(), getRbtRangeUndefined().getName());
			getPnlTop().add(getTxtMinStruct(), getTxtMinStruct().getName());
			getPnlTop().add(getTxtMaxStruct(), getTxtMaxStruct().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlTop;
}
/**
 * Return the RbtClockwise property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtClockwise() {
	if (ivjRbtClockwise == null) {
		try {
			ivjRbtClockwise = new javax.swing.JRadioButton();
			ivjRbtClockwise.setName("RbtClockwise");
			ivjRbtClockwise.setToolTipText("");
			ivjRbtClockwise.setText("Uhrzeigersinn");
			ivjRbtClockwise.setBounds(168, 133, 153, 22);
			// user code begin {1}
			ivjRbtClockwise.setToolTipText(getResourceString("RbtClockwise_toolTipText"));
			ivjRbtClockwise.setText(getResourceString("RbtClockwise_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtClockwise;
}
/**
 * Return the RbtCounterClockwise property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtCounterClockwise() {
	if (ivjRbtCounterClockwise == null) {
		try {
			ivjRbtCounterClockwise = new javax.swing.JRadioButton();
			ivjRbtCounterClockwise.setName("RbtCounterClockwise");
			ivjRbtCounterClockwise.setToolTipText("");
			ivjRbtCounterClockwise.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjRbtCounterClockwise.setText("Gegenuhrzeigersinn");
			ivjRbtCounterClockwise.setBounds(168, 158, 153, 22);
			// user code begin {1}
			ivjRbtCounterClockwise.setToolTipText(getResourceString("RbtCounterClockwise_toolTipText"));
			ivjRbtCounterClockwise.setText(getResourceString("RbtCounterClockwise_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtCounterClockwise;
}
/**
 * Return the RbtRangeDefined property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtRangeDefined() {
	if (ivjRbtRangeDefined == null) {
		try {
			ivjRbtRangeDefined = new javax.swing.JRadioButton();
			ivjRbtRangeDefined.setName("RbtRangeDefined");
			ivjRbtRangeDefined.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjRbtRangeDefined.setText("Definierter Bereich");
			ivjRbtRangeDefined.setBounds(4, 31, 153, 22);
			// user code begin {1}
			ivjRbtRangeDefined.setText(getResourceString("RbtRangeDefined_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtRangeDefined;
}
/**
 * Return the RbtRangeStructured property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton XXgetRbtRangeStructured() {
	if (ivjRbtRangeStructured == null) {
		try {
			ivjRbtRangeStructured = new javax.swing.JRadioButton();
			ivjRbtRangeStructured.setName("RbtRangeStructured");
			ivjRbtRangeStructured.setText("Strukturierte Zahl");
			ivjRbtRangeStructured.setBounds(4, 56, 153, 22);
			// user code begin {1}
			ivjRbtRangeStructured.setText(getResourceString("RbtRangeStructured_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtRangeStructured;
}
/**
 * Return the RbtRangeUndefined property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtRangeUndefined() {
	if (ivjRbtRangeUndefined == null) {
		try {
			ivjRbtRangeUndefined = new javax.swing.JRadioButton();
			ivjRbtRangeUndefined.setName("RbtRangeUndefined");
			ivjRbtRangeUndefined.setToolTipText("");
			ivjRbtRangeUndefined.setText("Undefininierter Bereich");
			ivjRbtRangeUndefined.setBounds(4, 5, 153, 22);
			// user code begin {1}
			ivjRbtRangeUndefined.setText(getResourceString("RbtRangeUndefined_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtRangeUndefined;
}
/**
 * Return the RbtUnspecified property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtUnspecified() {
	if (ivjRbtUnspecified == null) {
		try {
			ivjRbtUnspecified = new javax.swing.JRadioButton();
			ivjRbtUnspecified.setName("RbtUnspecified");
			ivjRbtUnspecified.setToolTipText("");
			ivjRbtUnspecified.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjRbtUnspecified.setText("Undefiniert");
			ivjRbtUnspecified.setBounds(168, 109, 153, 22);
			// user code begin {1}
			ivjRbtUnspecified.setToolTipText(getResourceString("RbtUnspecified_toolTipText"));
			ivjRbtUnspecified.setText(getResourceString("RbtUnspecified_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtUnspecified;
}
/**
 * Return the TxtMaxStruct property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtMaxStruct() {
	if (ivjTxtMaxStruct == null) {
		try {
			ivjTxtMaxStruct = new javax.swing.JTextField();
			ivjTxtMaxStruct.setName("TxtMaxStruct");
			ivjTxtMaxStruct.setBounds(316, 33, 136, 20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtMaxStruct;
}
/**
 * Return the TxtMinStruct property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtMinStruct() {
	if (ivjTxtMinStruct == null) {
		try {
			ivjTxtMinStruct = new javax.swing.JTextField();
			ivjTxtMinStruct.setName("TxtMinStruct");
			ivjTxtMinStruct.setBounds(316, 6, 136, 20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtMinStruct;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	LauncherView.getInstance().handleException(exception);
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getRbtRangeDefined().addItemListener(ivjEventHandler);
	getRbtRangeUndefined().addItemListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("IliBaseTypeTextPanel");
		setLayout(new java.awt.GridBagLayout());
		setSize(487, 259);

		java.awt.GridBagConstraints constraintsLblReferenceSystem = new java.awt.GridBagConstraints();
		constraintsLblReferenceSystem.gridx = 1; constraintsLblReferenceSystem.gridy = 2;
		constraintsLblReferenceSystem.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsLblReferenceSystem.ipadx = 110;
		constraintsLblReferenceSystem.insets = new java.awt.Insets(6, 9, 50, 4);
		add(getLblReferenceSystem(), constraintsLblReferenceSystem);

		java.awt.GridBagConstraints constraintsPnlReferenceSystem = new java.awt.GridBagConstraints();
		constraintsPnlReferenceSystem.gridx = 2; constraintsPnlReferenceSystem.gridy = 2;
		constraintsPnlReferenceSystem.fill = java.awt.GridBagConstraints.BOTH;
		constraintsPnlReferenceSystem.weightx = 1.0;
		constraintsPnlReferenceSystem.weighty = 1.0;
		constraintsPnlReferenceSystem.ipadx = 160;
		constraintsPnlReferenceSystem.ipady = 11;
		constraintsPnlReferenceSystem.insets = new java.awt.Insets(3, 5, 7, 6);
		add(getPnlReferenceSystem(), constraintsPnlReferenceSystem);

		java.awt.GridBagConstraints constraintsPnlTop = new java.awt.GridBagConstraints();
		constraintsPnlTop.gridx = 1; constraintsPnlTop.gridy = 1;
		constraintsPnlTop.gridwidth = 2;
		constraintsPnlTop.fill = java.awt.GridBagConstraints.BOTH;
		constraintsPnlTop.weightx = 1.0;
		constraintsPnlTop.weighty = 1.0;
		constraintsPnlTop.ipadx = 481;
		constraintsPnlTop.ipady = 184;
		constraintsPnlTop.insets = new java.awt.Insets(3, 3, 2, 3);
		add(getPnlTop(), constraintsPnlTop);
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setToolTipText(getResourceString("IliBaseTypeNumericPanel_toolTipText"));
	javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
	group.add(getRbtRangeUndefined());
	group.add(getRbtRangeDefined());
	getRbtRangeUndefined().setSelected(false);

	group = new javax.swing.ButtonGroup();
	group.add(getRbtUnspecified());
	group.add(getRbtClockwise());
	group.add(getRbtCounterClockwise());
	getRbtUnspecified().setSelected(true);

	getChxCircular().setSelected(false);
	// user code end
}
/**
 * Comment
 */
private void rangeChanged() {
	if (getRbtRangeDefined().isSelected()) {
		getLblMin().setVisible(true);
		getLblMin().setText(getResourceString("LblMinDec_text")); //$NON-NLS-1$
		getLblMax().setVisible(true);
		getLblMax().setText(getResourceString("LblMaxDec_text")); //$NON-NLS-1$
		getPnlMin().setVisible(true);
		getPnlMax().setVisible(true);
		getTxtMinStruct().setVisible(false);
		getTxtMaxStruct().setVisible(false);
	} else {
		// undefined
		getLblMin().setVisible(false);
		getLblMax().setVisible(false);
		getPnlMin().setVisible(false);
		getPnlMax().setVisible(false);
		getTxtMinStruct().setVisible(false);
		getTxtMaxStruct().setVisible(false);
	}
}
/**
 * Set the Object to be displayed by panel.
 * @see #setObject(Object, ModelElement) -> call first
 */
public final void setObject(java.lang.Object object) throws DeveloperException {
	throw new DeveloperException("call setObject(Object, ModelElement) instead");//$NON-NLS-1$
}
/**
 * Set the Object to be displayed by panel.
 */
public void setObject(java.lang.Object object, ch.ehi.uml1_4.foundation.core.ModelElement modelElement) {
	NumericalType type = (NumericalType)object;

		if (((NumericType)type).isRangeDefined()) {
			getRbtRangeDefined().setSelected(true);
			getPnlMin().setObject(((NumericType)type).getMinDec());
			getPnlMax().setObject(((NumericType)type).getMaxDec());
=======
	class IvjEventHandler implements java.awt.event.ItemListener {
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == IliBaseTypeNumericPanel.this.getRbtRangeDefined())
				connEtoC1(e);
			if (e.getSource() == IliBaseTypeNumericPanel.this.getRbtRangeUndefined())
				connEtoC2(e);
		};
	};

	/**
	 * IliBaseTypeTextPanel constructor comment.
	 */
	public IliBaseTypeNumericPanel() {
		super();
		initialize();
	}

	/**
	 * connEtoC1:
	 * (ChxRangeDefined.item.itemStateChanged(java.awt.event.ItemEvent) -->
	 * IliBaseTypeNumericPanel.chxRangeDefined_ItemStateChanged(Ljava.awt.event.ItemEvent;)V)
	 * 
	 * @param arg1
	 *            java.awt.event.ItemEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC1(java.awt.event.ItemEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.rangeChanged();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoC2:
	 * (RbtRangeUndefined.item.itemStateChanged(java.awt.event.ItemEvent) -->
	 * IliBaseTypeNumericPanel.rangeChanged()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ItemEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC2(java.awt.event.ItemEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.rangeChanged();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * Return the CbxUnitDef property value.
	 * 
	 * @return ch.ehi.umleditor.application.ReferencableComboBox
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private ReferencableComboBox getCbxUnitDef() {
		if (ivjCbxUnitDef == null) {
			try {
				ivjCbxUnitDef = new ch.ehi.umleditor.application.ReferencableComboBox();
				ivjCbxUnitDef.setName("CbxUnitDef");
				ivjCbxUnitDef.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				ivjCbxUnitDef.setBounds(316, 87, 161, 23);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjCbxUnitDef;
	}

	/**
	 * Return the ChxCircular property value.
	 * 
	 * @return javax.swing.JCheckBox
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JCheckBox getChxCircular() {
		if (ivjChxCircular == null) {
			try {
				ivjChxCircular = new javax.swing.JCheckBox();
				ivjChxCircular.setName("ChxCircular");
				ivjChxCircular.setToolTipText("");
				ivjChxCircular.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				ivjChxCircular.setText("ZirkulÃ¤r");
				ivjChxCircular.setBounds(4, 84, 153, 22);
				// user code begin {1}
				ivjChxCircular.setToolTipText(getResourceString("ChxCircular_toolTipText"));
				ivjChxCircular.setText(getResourceString("ChxCircular_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjChxCircular;
	}

	/**
	 * Return Kind.
	 */
	private int getkind() {
		if (getRbtUnspecified().isSelected()) {
			return RotationKind.UNDEFINED;
		} else if (getRbtClockwise().isSelected()) {
			return RotationKind.CLOCKWISE;
		} else if (getRbtCounterClockwise().isSelected()) {
			return RotationKind.COUNTERCLOCKWISE;
		} else {
			throw new DeveloperException("nothing choosed");//$NON-NLS-1$
		}
	}

	/**
	 * Return the LblKind property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblKind() {
		if (ivjLblKind == null) {
			try {
				ivjLblKind = new javax.swing.JLabel();
				ivjLblKind.setName("LblKind");
				ivjLblKind.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				ivjLblKind.setText("Art:");
				ivjLblKind.setBounds(4, 109, 153, 14);
				// user code begin {1}
				ivjLblKind.setText(getResourceString("LblKind_text"));
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
	 * Return the LblMax property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblMax() {
		if (ivjLblMax == null) {
			try {
				ivjLblMax = new javax.swing.JLabel();
				ivjLblMax.setName("LblMax");
				ivjLblMax.setToolTipText("");
				ivjLblMax.setText("Max-Dec/Struct:");
				ivjLblMax.setBounds(168, 34, 140, 14);
				// user code begin {1}
				ivjLblMax.setText(getResourceString("LblMaxDec_text"));
				ivjLblMax.setToolTipText(getResourceString("LblMax_toolTipText"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblMax;
	}

	/**
	 * Return the LblMin property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblMin() {
		if (ivjLblMin == null) {
			try {
				ivjLblMin = new javax.swing.JLabel();
				ivjLblMin.setName("LblMin");
				ivjLblMin.setToolTipText("Min.");
				ivjLblMin.setText("Min-Dec/Struct:");
				ivjLblMin.setBounds(168, 10, 140, 14);
				// user code begin {1}
				ivjLblMin.setText(getResourceString("LblMinStruct_text"));
				ivjLblMin.setToolTipText(getResourceString("LblMin_toolTipText"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblMin;
	}

	/**
	 * Return the LblReferenceSystem property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblReferenceSystem() {
		if (ivjLblReferenceSystem == null) {
			try {
				ivjLblReferenceSystem = new javax.swing.JLabel();
				ivjLblReferenceSystem.setName("LblReferenceSystem");
				ivjLblReferenceSystem.setToolTipText("Referenz System");
				ivjLblReferenceSystem.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				ivjLblReferenceSystem.setText("RefSys:");
				// user code begin {1}
				ivjLblReferenceSystem.setToolTipText(getResourceString("LblReferenceSystem_toolTipText"));
				ivjLblReferenceSystem.setText(getResourceString("LblReferenceSystem_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblReferenceSystem;
	}

	/**
	 * Return the LblUnit property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblUnit() {
		if (ivjLblUnit == null) {
			try {
				ivjLblUnit = new javax.swing.JLabel();
				ivjLblUnit.setName("LblUnit");
				ivjLblUnit.setToolTipText("");
				ivjLblUnit.setText("Einheit:");
				ivjLblUnit.setBounds(168, 89, 140, 14);
				// user code begin {1}
				ivjLblUnit.setToolTipText(getResourceString("LblUnit_toolTipText"));
				ivjLblUnit.setText(getResourceString("LblUnit_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblUnit;
	}

	/**
	 * Return the changed object displayed.
	 */
	public java.lang.Object getObject() {
		NumericalType type = null;
		type = ElementFactory.createNumericType();
		// Range
		if (getRbtRangeDefined().isSelected()) {
			((NumericType) type).setRangeDefined(true);
			((NumericType) type).setMinDec((IliDim) getPnlMin().getObject());
			((NumericType) type).setMaxDec((IliDim) getPnlMax().getObject());
		}

		type.setCircular(getChxCircular().isSelected());
		if (type.containsUnitDef()) {
			type.detachUnitDef();
		}
		if (/* getChxCircular().isSelected() && */ (getCbxUnitDef().getElement() != null)) {
			// modelCheck is up to model
			type.attachUnitDef((UnitDef) getCbxUnitDef().getElement());
		}

		if (type.containsRefSys()) {
			type.getRefSys().setSyntax(getPnlReferenceSystem().getSyntax());
		} else if (getPnlReferenceSystem().getSyntax() != null) {
			// create new RefSys
			RefSys refSys = new RefSys();
			refSys.setSyntax(getPnlReferenceSystem().getSyntax());
			type.attachRefSys(refSys);
		}

		type.setDirection(getkind());

		return type;
	}

	/**
	 * Return the PnlMax property value.
	 * 
	 * @return ch.ehi.umleditor.application.IliDimPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private IliDimPanel getPnlMax() {
		if (ivjPnlMax == null) {
			try {
				ivjPnlMax = new ch.ehi.umleditor.application.IliDimPanel();
				ivjPnlMax.setName("PnlMax");
				ivjPnlMax.setBounds(316, 33, 161, 24);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlMax;
	}

	/**
	 * Return the PnlMin property value.
	 * 
	 * @return ch.ehi.umleditor.application.IliDimPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private IliDimPanel getPnlMin() {
		if (ivjPnlMin == null) {
			try {
				ivjPnlMin = new ch.ehi.umleditor.application.IliDimPanel();
				ivjPnlMin.setName("PnlMin");
				ivjPnlMin.setBounds(316, 5, 161, 24);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlMin;
	}

	/**
	 * Return the PnlReferenceSystem property value.
	 * 
	 * @return ch.ehi.umleditor.application.InterlisSyntaxPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private InterlisSyntaxPanel getPnlReferenceSystem() {
		if (ivjPnlReferenceSystem == null) {
			try {
				ivjPnlReferenceSystem = new ch.ehi.umleditor.application.InterlisSyntaxPanel();
				ivjPnlReferenceSystem.setName("PnlReferenceSystem");
				ivjPnlReferenceSystem.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlReferenceSystem;
	}

	/**
	 * Return the JPanel1 property value.
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getPnlTop() {
		if (ivjPnlTop == null) {
			try {
				ivjPnlTop = new javax.swing.JPanel();
				ivjPnlTop.setName("PnlTop");
				ivjPnlTop.setLayout(null);
				getPnlTop().add(getRbtRangeDefined(), getRbtRangeDefined().getName());
				getPnlTop().add(getLblMin(), getLblMin().getName());
				getPnlTop().add(getLblMax(), getLblMax().getName());
				getPnlTop().add(getPnlMin(), getPnlMin().getName());
				getPnlTop().add(getPnlMax(), getPnlMax().getName());
				getPnlTop().add(getChxCircular(), getChxCircular().getName());
				getPnlTop().add(getLblUnit(), getLblUnit().getName());
				getPnlTop().add(getCbxUnitDef(), getCbxUnitDef().getName());
				getPnlTop().add(getLblKind(), getLblKind().getName());
				getPnlTop().add(getRbtUnspecified(), getRbtUnspecified().getName());
				getPnlTop().add(getRbtClockwise(), getRbtClockwise().getName());
				getPnlTop().add(getRbtCounterClockwise(), getRbtCounterClockwise().getName());
				getPnlTop().add(getRbtRangeUndefined(), getRbtRangeUndefined().getName());
				getPnlTop().add(getTxtMinStruct(), getTxtMinStruct().getName());
				getPnlTop().add(getTxtMaxStruct(), getTxtMaxStruct().getName());
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlTop;
	}

	/**
	 * Return the RbtClockwise property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtClockwise() {
		if (ivjRbtClockwise == null) {
			try {
				ivjRbtClockwise = new javax.swing.JRadioButton();
				ivjRbtClockwise.setName("RbtClockwise");
				ivjRbtClockwise.setToolTipText("");
				ivjRbtClockwise.setText("Uhrzeigersinn");
				ivjRbtClockwise.setBounds(168, 133, 153, 22);
				// user code begin {1}
				ivjRbtClockwise.setToolTipText(getResourceString("RbtClockwise_toolTipText"));
				ivjRbtClockwise.setText(getResourceString("RbtClockwise_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtClockwise;
	}

	/**
	 * Return the RbtCounterClockwise property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtCounterClockwise() {
		if (ivjRbtCounterClockwise == null) {
			try {
				ivjRbtCounterClockwise = new javax.swing.JRadioButton();
				ivjRbtCounterClockwise.setName("RbtCounterClockwise");
				ivjRbtCounterClockwise.setToolTipText("");
				ivjRbtCounterClockwise.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				ivjRbtCounterClockwise.setText("Gegenuhrzeigersinn");
				ivjRbtCounterClockwise.setBounds(168, 158, 153, 22);
				// user code begin {1}
				ivjRbtCounterClockwise.setToolTipText(getResourceString("RbtCounterClockwise_toolTipText"));
				ivjRbtCounterClockwise.setText(getResourceString("RbtCounterClockwise_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtCounterClockwise;
	}

	/**
	 * Return the RbtRangeDefined property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtRangeDefined() {
		if (ivjRbtRangeDefined == null) {
			try {
				ivjRbtRangeDefined = new javax.swing.JRadioButton();
				ivjRbtRangeDefined.setName("RbtRangeDefined");
				ivjRbtRangeDefined.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				ivjRbtRangeDefined.setText("Definierter Bereich");
				ivjRbtRangeDefined.setBounds(4, 31, 153, 22);
				// user code begin {1}
				ivjRbtRangeDefined.setText(getResourceString("RbtRangeDefined_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtRangeDefined;
	}

	/**
	 * Return the RbtRangeStructured property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton XXgetRbtRangeStructured() {
		if (ivjRbtRangeStructured == null) {
			try {
				ivjRbtRangeStructured = new javax.swing.JRadioButton();
				ivjRbtRangeStructured.setName("RbtRangeStructured");
				ivjRbtRangeStructured.setText("Strukturierte Zahl");
				ivjRbtRangeStructured.setBounds(4, 56, 153, 22);
				// user code begin {1}
				ivjRbtRangeStructured.setText(getResourceString("RbtRangeStructured_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtRangeStructured;
	}

	/**
	 * Return the RbtRangeUndefined property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtRangeUndefined() {
		if (ivjRbtRangeUndefined == null) {
			try {
				ivjRbtRangeUndefined = new javax.swing.JRadioButton();
				ivjRbtRangeUndefined.setName("RbtRangeUndefined");
				ivjRbtRangeUndefined.setToolTipText("");
				ivjRbtRangeUndefined.setText("Undefininierter Bereich");
				ivjRbtRangeUndefined.setBounds(4, 5, 153, 22);
				// user code begin {1}
				ivjRbtRangeUndefined.setText(getResourceString("RbtRangeUndefined_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtRangeUndefined;
	}

	/**
	 * Return the RbtUnspecified property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtUnspecified() {
		if (ivjRbtUnspecified == null) {
			try {
				ivjRbtUnspecified = new javax.swing.JRadioButton();
				ivjRbtUnspecified.setName("RbtUnspecified");
				ivjRbtUnspecified.setToolTipText("");
				ivjRbtUnspecified.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				ivjRbtUnspecified.setText("Undefiniert");
				ivjRbtUnspecified.setBounds(168, 109, 153, 22);
				// user code begin {1}
				ivjRbtUnspecified.setToolTipText(getResourceString("RbtUnspecified_toolTipText"));
				ivjRbtUnspecified.setText(getResourceString("RbtUnspecified_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtUnspecified;
	}

	/**
	 * Return the TxtMaxStruct property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtMaxStruct() {
		if (ivjTxtMaxStruct == null) {
			try {
				ivjTxtMaxStruct = new javax.swing.JTextField();
				ivjTxtMaxStruct.setName("TxtMaxStruct");
				ivjTxtMaxStruct.setBounds(316, 33, 136, 20);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtMaxStruct;
	}

	/**
	 * Return the TxtMinStruct property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtMinStruct() {
		if (ivjTxtMinStruct == null) {
			try {
				ivjTxtMinStruct = new javax.swing.JTextField();
				ivjTxtMinStruct.setName("TxtMinStruct");
				ivjTxtMinStruct.setBounds(316, 6, 136, 20);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtMinStruct;
	}

	/**
	 * Called whenever the part throws an exception.
	 * 
	 * @param exception
	 *            java.lang.Throwable
	 */
	protected void handleException(java.lang.Throwable exception) {
		LauncherView.getInstance().handleException(exception);
	}

	/**
	 * Initializes connections
	 * 
	 * @exception java.lang.Exception
	 *                The exception description.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initConnections() throws java.lang.Exception {
		// user code begin {1}
		// user code end
		getRbtRangeDefined().addItemListener(ivjEventHandler);
		getRbtRangeUndefined().addItemListener(ivjEventHandler);
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("IliBaseTypeTextPanel");
			setLayout(new java.awt.GridBagLayout());
			setSize(487, 259);

			java.awt.GridBagConstraints constraintsLblReferenceSystem = new java.awt.GridBagConstraints();
			constraintsLblReferenceSystem.gridx = 1;
			constraintsLblReferenceSystem.gridy = 2;
			constraintsLblReferenceSystem.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblReferenceSystem.ipadx = 110;
			constraintsLblReferenceSystem.insets = new java.awt.Insets(6, 9, 50, 4);
			add(getLblReferenceSystem(), constraintsLblReferenceSystem);

			java.awt.GridBagConstraints constraintsPnlReferenceSystem = new java.awt.GridBagConstraints();
			constraintsPnlReferenceSystem.gridx = 2;
			constraintsPnlReferenceSystem.gridy = 2;
			constraintsPnlReferenceSystem.fill = java.awt.GridBagConstraints.BOTH;
			constraintsPnlReferenceSystem.weightx = 1.0;
			constraintsPnlReferenceSystem.weighty = 1.0;
			constraintsPnlReferenceSystem.ipadx = 160;
			constraintsPnlReferenceSystem.ipady = 11;
			constraintsPnlReferenceSystem.insets = new java.awt.Insets(3, 5, 7, 6);
			add(getPnlReferenceSystem(), constraintsPnlReferenceSystem);

			java.awt.GridBagConstraints constraintsPnlTop = new java.awt.GridBagConstraints();
			constraintsPnlTop.gridx = 1;
			constraintsPnlTop.gridy = 1;
			constraintsPnlTop.gridwidth = 2;
			constraintsPnlTop.fill = java.awt.GridBagConstraints.BOTH;
			constraintsPnlTop.weightx = 1.0;
			constraintsPnlTop.weighty = 1.0;
			constraintsPnlTop.ipadx = 481;
			constraintsPnlTop.ipady = 184;
			constraintsPnlTop.insets = new java.awt.Insets(3, 3, 2, 3);
			add(getPnlTop(), constraintsPnlTop);
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		setToolTipText(getResourceString("IliBaseTypeNumericPanel_toolTipText"));
		javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
		group.add(getRbtRangeUndefined());
		group.add(getRbtRangeDefined());
		getRbtRangeUndefined().setSelected(false);

		group = new javax.swing.ButtonGroup();
		group.add(getRbtUnspecified());
		group.add(getRbtClockwise());
		group.add(getRbtCounterClockwise());
		getRbtUnspecified().setSelected(true);

		getChxCircular().setSelected(false);
		// user code end
	}

	/**
	 * Comment
	 */
	private void rangeChanged() {
		if (getRbtRangeDefined().isSelected()) {
			getLblMin().setVisible(true);
			getLblMin().setText(getResourceString("LblMinDec_text")); //$NON-NLS-1$
			getLblMax().setVisible(true);
			getLblMax().setText(getResourceString("LblMaxDec_text")); //$NON-NLS-1$
			getPnlMin().setVisible(true);
			getPnlMax().setVisible(true);
			getTxtMinStruct().setVisible(false);
			getTxtMaxStruct().setVisible(false);
		} else {
			// undefined
			getLblMin().setVisible(false);
			getLblMax().setVisible(false);
			getPnlMin().setVisible(false);
			getPnlMax().setVisible(false);
			getTxtMinStruct().setVisible(false);
			getTxtMaxStruct().setVisible(false);
		}
	}

	/**
	 * Set the Object to be displayed by panel.
	 * 
	 * @see #setObject(Object, ModelElement) -> call first
	 */
	public final void setObject(java.lang.Object object) throws DeveloperException {
		throw new DeveloperException("call setObject(Object, ModelElement) instead");//$NON-NLS-1$
	}

	/**
	 * Set the Object to be displayed by panel.
	 */
	public void setObject(java.lang.Object object, ch.ehi.uml1_4.foundation.core.ModelElement modelElement) {
		NumericalType type = (NumericalType) object;

		if (((NumericType) type).isRangeDefined()) {
			getRbtRangeDefined().setSelected(true);
			getPnlMin().setObject(((NumericType) type).getMinDec());
			getPnlMax().setObject(((NumericType) type).getMaxDec());
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		} else {
			getRbtRangeUndefined().setSelected(true);
		}

<<<<<<< HEAD
	// @see #chxCircular_ItemStateChanged()
	getChxCircular().setSelected(type.isCircular());

	if (type.containsUnitDef()) {
		getCbxUnitDef().setElement(UnitDef.class, modelElement, type.getUnitDef());
	} else {
		getCbxUnitDef().setElement(UnitDef.class, modelElement, null);
	}

	if (type.containsRefSys()) {
		getPnlReferenceSystem().setSyntax(type.getRefSys());
	} else {
		getPnlReferenceSystem().setSyntax(null);
	}

	switch (type.getDirection()) {
=======
		// @see #chxCircular_ItemStateChanged()
		getChxCircular().setSelected(type.isCircular());

		if (type.containsUnitDef()) {
			getCbxUnitDef().setElement(UnitDef.class, modelElement, type.getUnitDef());
		} else {
			getCbxUnitDef().setElement(UnitDef.class, modelElement, null);
		}

		if (type.containsRefSys()) {
			getPnlReferenceSystem().setSyntax(type.getRefSys());
		} else {
			getPnlReferenceSystem().setSyntax(null);
		}

		switch (type.getDirection()) {
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
		case RotationKind.UNDEFINED: {
			getRbtUnspecified().setSelected(true);
			break;
		}
		case RotationKind.CLOCKWISE: {
			getRbtClockwise().setSelected(true);
			break;
		}
		case RotationKind.COUNTERCLOCKWISE: {
			getRbtCounterClockwise().setSelected(true);
			break;
		}
		default: {
			throw new DeveloperException("Unknown Kind <" + type.getDirection() + ">");//$NON-NLS-1$
		}
<<<<<<< HEAD
	}
}
}
=======
		}
	}
}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
