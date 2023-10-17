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
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.tools.ModelElementUtility;
import ch.ehi.umleditor.interlis.iliimport.TransferFromIli2cMetamodel;
import ch.interlis.ili2c.metamodel.Ili2cMetaAttrs;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.softenvironment.util.*;
import ch.softenvironment.view.*;

import java.util.Iterator;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
/**
 * INTERLIS BaseType representation of <b>CoordinatType</b>.
 * 
 * @author Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.4 $ $Date: 2006-11-29 17:48:52 $
 */
public class IliBaseTypeCoordPanel extends BasePanel implements DataPanel {
//	private int oldDim = 0;
//	private int newDim = 0;
	private boolean secondEvent = false;
	private /*final*/ static String TAB_TITLE = getResourceString(IliBaseTypeCoordPanel.class, "CINumeric"); //$NON-NLS-1$
	// generated code
//	private java.util.ArrayList numericDimensions = new java.util.ArrayList();
	private javax.swing.JLabel ivjLblPiHalfAxis = null;
	private javax.swing.JLabel ivjLblZeroAxis = null;
	private IliBaseTypeNumericPanel ivjPnlNumeric1D = null;
	private IliBaseTypeNumericPanel ivjPnlNumeric2D = null;
	private IliBaseTypeNumericPanel ivjPnlNumeric3D = null;
	private javax.swing.JRadioButton ivjRbt1D = null;
	private javax.swing.JRadioButton ivjRbt2D = null;
	private javax.swing.JRadioButton ivjRbt3D = null;
	private javax.swing.JTextField ivjTxtPiHalfAxis = null;
	private javax.swing.JTextField ivjTxtZeroAxis = null;
	private javax.swing.JTabbedPane ivjTbpNumericTypes = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JLabel ivjLblDimensions = null;
	private javax.swing.JCheckBox ivjChxRotationDef = null;
	private javax.swing.JLabel ivjLblEpsgCode = null;
	private javax.swing.JTextField ivjTxtEpsgCode = null;
	private boolean isMulti;

class IvjEventHandler implements java.awt.event.FocusListener, java.awt.event.ItemListener {
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == IliBaseTypeCoordPanel.this.getTxtZeroAxis()) 
				connEtoM1(e);
			if (e.getSource() == IliBaseTypeCoordPanel.this.getTxtPiHalfAxis()) 
				connEtoM2(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == IliBaseTypeCoordPanel.this.getRbt1D()) 
				connEtoC1(e);
			if (e.getSource() == IliBaseTypeCoordPanel.this.getRbt2D()) 
				connEtoC2(e);
			if (e.getSource() == IliBaseTypeCoordPanel.this.getRbt3D()) 
				connEtoC3(e);
			if (e.getSource() == IliBaseTypeCoordPanel.this.getChxRotationDef()) 
				connEtoC4(e);
		};
	};
/**
 * IliBaseTypeTextPanel constructor comment.
 */
public IliBaseTypeCoordPanel() {
	super();
	initialize();
}
/**
 * Show a Tab-Panel.
 */
private void addDimensionPanel(IliBaseTypeNumericPanel panel, int dimension) {
	getTbpNumericTypes().add(panel);
	getTbpNumericTypes().setTitleAt(dimension - 1, dimension + TAB_TITLE);
}
/**
 * Comment
 */
private void chxRotationDef_ItemStateChanged(java.awt.event.ItemEvent itemEvent) {
	if (getChxRotationDef().isSelected()) {
		getTxtPiHalfAxis().setEditable(true);
		getTxtZeroAxis().setEditable(true);
	} else {
		getTxtPiHalfAxis().setEditable(false);
		getTxtPiHalfAxis().setText(null);
		getTxtZeroAxis().setEditable(false);
		getTxtZeroAxis().setText(null);
	}
}
/**
 * connEtoC1:  (Rbt1D.item.itemStateChanged(java.awt.event.ItemEvent) --> IliBaseTypeCoordPanel.dimensionChanged(Ljava.awt.event.ItemEvent;)V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.dimensionChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (Rbt2D.item.itemStateChanged(java.awt.event.ItemEvent) --> IliBaseTypeCoordPanel.dimensionChanged(Ljava.awt.event.ItemEvent;)V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.dimensionChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC3:  (Rbt3D.item.itemStateChanged(java.awt.event.ItemEvent) --> IliBaseTypeCoordPanel.dimensionChanged(Ljava.awt.event.ItemEvent;)V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.dimensionChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC4:  (ChxRotationDef.item.itemStateChanged(java.awt.event.ItemEvent) --> IliBaseTypeCoordPanel.chxRotationDef_ItemStateChanged(Ljava.awt.event.ItemEvent;)V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC4(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.chxRotationDef_ItemStateChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM1:  (TxtZeroAxis.focus.focusGained(java.awt.event.FocusEvent) --> TxtZeroAxis.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtZeroAxis().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM2:  (TxtPiHalfAxis.focus.focusGained(java.awt.event.FocusEvent) --> TxtPiHalfAxis.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM2(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtPiHalfAxis().selectAll();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Show appropriate Dimension tabs.
 */
private void dimensionChanged(java.awt.event.ItemEvent itemEvent) {
	if (secondEvent) {
		secondEvent = false;

		// prevent adding-exception
		getTbpNumericTypes().remove(getPnlNumeric2D());
		getTbpNumericTypes().remove(getPnlNumeric3D());
		
		if (getRbt1D().isSelected()) {
			//newDim = 1;
		} else if (getRbt2D().isSelected()) {
			//newDim = 2;
			addDimensionPanel(getPnlNumeric2D(), 2);
		} else if (getRbt3D().isSelected()) {
			//newDim = 3;
			addDimensionPanel(getPnlNumeric2D(), 2);
			addDimensionPanel(getPnlNumeric3D(), 3);
		}
	} else {
		// event comes twicely -> trigger on second one
		secondEvent = true;
	}
}
/**
 * Return the ChxRotationDef property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxRotationDef() {
	if (ivjChxRotationDef == null) {
		try {
			ivjChxRotationDef = new javax.swing.JCheckBox();
			ivjChxRotationDef.setName("ChxRotationDef");
			ivjChxRotationDef.setToolTipText("");
			ivjChxRotationDef.setText("Rotation");
			// user code begin {1}
			ivjChxRotationDef.setToolTipText(getResourceString("ChxRotationDef_toolTipText"));
			ivjChxRotationDef.setText(getResourceString("ChxRotationDef_text"));
			
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxRotationDef;
}
/**
 * Return the LblDimensions property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblDimensions() {
	if (ivjLblDimensions == null) {
		try {
			ivjLblDimensions = new javax.swing.JLabel();
			ivjLblDimensions.setName("LblDimensions");
			ivjLblDimensions.setText("Dimensionen:");
			// user code begin {1}
			ivjLblDimensions.setText(getResourceString("LblDimensions_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblDimensions;
}
/**
 * Return the LblEpsg property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblEpsg() {
	if (ivjLblEpsgCode == null) {
		try {
			ivjLblEpsgCode = new javax.swing.JLabel();
			ivjLblEpsgCode.setName("LblEpsg");
			ivjLblEpsgCode.setText("EPSG Code");
			ivjLblEpsgCode.setBounds(416, 6, 136, 20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblEpsgCode;
}
/**
 * Return the TxtEpsgCode property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public javax.swing.JTextField getTxtEpsgCode() {
	if (ivjTxtEpsgCode == null) {
		try {
			ivjTxtEpsgCode = new javax.swing.JTextField();
			ivjTxtEpsgCode.setName("TxtEpsgCode");
			ivjTxtEpsgCode.setBounds(168, 133, 153, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			//handleException(ivjExc);
		}
	}
	return ivjTxtEpsgCode;
}
/**
 * Return the LblPiHalfAxis property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblPiHalfAxis() {
	if (ivjLblPiHalfAxis == null) {
		try {
			ivjLblPiHalfAxis = new javax.swing.JLabel();
			ivjLblPiHalfAxis.setName("LblPiHalfAxis");
			ivjLblPiHalfAxis.setToolTipText("PI-Halbachse");
			ivjLblPiHalfAxis.setText("PiHalfAxis:");
			// user code begin {1}
			ivjLblPiHalfAxis.setToolTipText(getResourceString("LblPiHalfAxis_toolTipText"));
			ivjLblPiHalfAxis.setText(getResourceString("LblPiHalfAxist_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblPiHalfAxis;
}
/**
 * Return the LblZeroAxis property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblZeroAxis() {
	if (ivjLblZeroAxis == null) {
		try {
			ivjLblZeroAxis = new javax.swing.JLabel();
			ivjLblZeroAxis.setName("LblZeroAxis");
			ivjLblZeroAxis.setToolTipText("0-Achse");
			ivjLblZeroAxis.setText("NullAxis:");
			// user code begin {1}
			ivjLblZeroAxis.setToolTipText(getResourceString("LblZeroAxis_toolTipText"));
			ivjLblZeroAxis.setText(getResourceString("LblZeroAxis_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblZeroAxis;
}
/**
 * Return the changed object displayed.
 */
public java.lang.Object getObject() {
	CoordinateType type = new CoordinateType();

	if (getChxRotationDef().isSelected()) {
		RotationDef rotationDef = new RotationDef();
		rotationDef.setNullAxis((new Long(getTxtZeroAxis().getText())).longValue());
		rotationDef.setPihalfAxis((new Long(getTxtPiHalfAxis().getText())).longValue());
		type.attachRotationDef(rotationDef);
	}

	// save Dimensions
	type.addDim((NumericalType)getPnlNumeric1D().getObject());	// 1D always is
	if (getRbt2D().isSelected()) {
		type.addDim((NumericalType)getPnlNumeric2D().getObject());
	} else if (getRbt3D().isSelected()) {
		type.addDim((NumericalType)getPnlNumeric2D().getObject());
		type.addDim((NumericalType)getPnlNumeric3D().getObject());
	}

	type.setMulti(isMulti);

	return type;
}
/**
 * Return the PnlNumeric1D property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeNumericPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeNumericPanel getPnlNumeric1D() {
	if (ivjPnlNumeric1D == null) {
		try {
			ivjPnlNumeric1D = new ch.ehi.umleditor.application.IliBaseTypeNumericPanel();
			ivjPnlNumeric1D.setName("PnlNumeric1D");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlNumeric1D;
}
/**
 * Return the PnlNumeric2D property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeNumericPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeNumericPanel getPnlNumeric2D() {
	if (ivjPnlNumeric2D == null) {
		try {
			ivjPnlNumeric2D = new ch.ehi.umleditor.application.IliBaseTypeNumericPanel();
			ivjPnlNumeric2D.setName("PnlNumeric2D");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlNumeric2D;
}
/**
 * Return the PnlNumeric3D property value.
 * @return ch.ehi.umleditor.application.IliBaseTypeNumericPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private IliBaseTypeNumericPanel getPnlNumeric3D() {
	if (ivjPnlNumeric3D == null) {
		try {
			ivjPnlNumeric3D = new ch.ehi.umleditor.application.IliBaseTypeNumericPanel();
			ivjPnlNumeric3D.setName("PnlNumeric3D");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlNumeric3D;
}
/**
 * Return the Rbt1D property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbt1D() {
	if (ivjRbt1D == null) {
		try {
			ivjRbt1D = new javax.swing.JRadioButton();
			ivjRbt1D.setName("Rbt1D");
			ivjRbt1D.setText("1D");
			// user code begin {1}
			ivjRbt1D.setText(getResourceString("Rbt1D_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbt1D;
}
/**
 * Return the Rbt2D property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbt2D() {
	if (ivjRbt2D == null) {
		try {
			ivjRbt2D = new javax.swing.JRadioButton();
			ivjRbt2D.setName("Rbt2D");
			ivjRbt2D.setText("2D");
			// user code begin {1}
			ivjRbt2D.setText(getResourceString("Rbt2D_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbt2D;
}
/**
 * Return the Rbt3D property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbt3D() {
	if (ivjRbt3D == null) {
		try {
			ivjRbt3D = new javax.swing.JRadioButton();
			ivjRbt3D.setName("Rbt3D");
			ivjRbt3D.setText("3D");
			// user code begin {1}
			ivjRbt3D.setText(getResourceString("Rbt3D_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbt3D;
}
/**
 * Return the JTabbedPane1 property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTabbedPane getTbpNumericTypes() {
	if (ivjTbpNumericTypes == null) {
		try {
			ivjTbpNumericTypes = new javax.swing.JTabbedPane();
			ivjTbpNumericTypes.setName("TbpNumericTypes");
			ivjTbpNumericTypes.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
			ivjTbpNumericTypes.insertTab(getResourceString("Tbp1D_title"), null, getPnlNumeric1D(), null, 0);
			ivjTbpNumericTypes.insertTab(getResourceString("Tbp2D_title"), null, getPnlNumeric2D(), null, 1);
			ivjTbpNumericTypes.insertTab(getResourceString("Tbp3D_title"), null, getPnlNumeric3D(), null, 2);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbpNumericTypes;
}
/**
 * Return the TxtPiHalfAxis property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtPiHalfAxis() {
	if (ivjTxtPiHalfAxis == null) {
		try {
			ivjTxtPiHalfAxis = new javax.swing.JTextField();
			ivjTxtPiHalfAxis.setName("TxtPiHalfAxis");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtPiHalfAxis;
}
/**
 * Return the TxtZeroAxis property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtZeroAxis() {
	if (ivjTxtZeroAxis == null) {
		try {
			ivjTxtZeroAxis = new javax.swing.JTextField();
			ivjTxtZeroAxis.setName("TxtZeroAxis");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtZeroAxis;
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
	getRbt1D().addItemListener(ivjEventHandler);
	getRbt2D().addItemListener(ivjEventHandler);
	getRbt3D().addItemListener(ivjEventHandler);
	getTxtZeroAxis().addFocusListener(ivjEventHandler);
	getTxtPiHalfAxis().addFocusListener(ivjEventHandler);
	getChxRotationDef().addItemListener(ivjEventHandler);
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
		setToolTipText("INTERLIS Basistyp <COORD>");
		setLayout(new java.awt.GridBagLayout());
		setSize(526, 390); //526, 390

		java.awt.GridBagConstraints constraintsRbt1D = new java.awt.GridBagConstraints();
		constraintsRbt1D.gridx = 2; constraintsRbt1D.gridy = 1;
		constraintsRbt1D.ipadx = 1;
		constraintsRbt1D.ipady = -2;
		constraintsRbt1D.insets = new java.awt.Insets(14, 7, 5, 5);
		add(getRbt1D(), constraintsRbt1D);

		java.awt.GridBagConstraints constraintsRbt3D = new java.awt.GridBagConstraints();
		constraintsRbt3D.gridx = 4; constraintsRbt3D.gridy = 1;
		constraintsRbt3D.ipadx = 1;
		constraintsRbt3D.ipady = -2;
		constraintsRbt3D.insets = new java.awt.Insets(14, 4, 5, 10);
		add(getRbt3D(), constraintsRbt3D);

		java.awt.GridBagConstraints constraintsRbt2D = new java.awt.GridBagConstraints();
		constraintsRbt2D.gridx = 3; constraintsRbt2D.gridy = 1;
		constraintsRbt2D.ipadx = 1;
		constraintsRbt2D.ipady = -2;
		constraintsRbt2D.insets = new java.awt.Insets(14, 5, 5, 4);
		add(getRbt2D(), constraintsRbt2D);

		java.awt.GridBagConstraints constraintsTbpNumericTypes = new java.awt.GridBagConstraints();
		constraintsTbpNumericTypes.gridx = 1; constraintsTbpNumericTypes.gridy = 2;
		constraintsTbpNumericTypes.gridwidth = 5;
		constraintsTbpNumericTypes.fill = java.awt.GridBagConstraints.BOTH;
		constraintsTbpNumericTypes.weightx = 1.0;
		constraintsTbpNumericTypes.weighty = 1.0; //1.0
		constraintsTbpNumericTypes.ipadx = 16;
		constraintsTbpNumericTypes.ipady = 2; // 2
		constraintsTbpNumericTypes.insets = new java.awt.Insets(25, 3, 4, 14); //5, 3, 4, 14
		add(getTbpNumericTypes(), constraintsTbpNumericTypes);

		java.awt.GridBagConstraints constraintsLblDimensions = new java.awt.GridBagConstraints();
		constraintsLblDimensions.gridx = 1; constraintsLblDimensions.gridy = 1;
		constraintsLblDimensions.ipadx = 63;
		constraintsTbpNumericTypes.ipady = 2;
		constraintsLblDimensions.insets = new java.awt.Insets(18, 11, 7, 3);
		add(getLblDimensions(), constraintsLblDimensions);
		
		java.awt.GridBagConstraints constraintsLblEpsgCode = new java.awt.GridBagConstraints();
		constraintsLblEpsgCode.gridx = 1; constraintsLblEpsgCode.gridy = 2;
		constraintsLblEpsgCode.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsLblEpsgCode.ipadx = 10;
		constraintsLblEpsgCode.insets = new java.awt.Insets(5, 11, 6, 15);
		add(getLblEpsg(), constraintsLblEpsgCode);
		
        java.awt.GridBagConstraints constraintsTxtEpsgCode = new java.awt.GridBagConstraints();
        constraintsTxtEpsgCode.gridx = 2; constraintsTxtEpsgCode.gridy = 2;
        constraintsTxtEpsgCode.anchor = java.awt.GridBagConstraints.NORTHWEST;
        constraintsTxtEpsgCode.fill = java.awt.GridBagConstraints.HORIZONTAL;
        constraintsTxtEpsgCode.gridwidth = 2;
        constraintsTxtEpsgCode.ipadx = 80; 
        constraintsTxtEpsgCode.ipady = -2;
        constraintsTxtEpsgCode.insets = new java.awt.Insets(5, 11, 6, 15);
        add(getTxtEpsgCode(), constraintsTxtEpsgCode);
		
		java.awt.GridBagConstraints constraintsTxtZeroAxis = new java.awt.GridBagConstraints();
		constraintsTxtZeroAxis.gridx = 5; constraintsTxtZeroAxis.gridy = 3;
		constraintsTxtZeroAxis.fill = java.awt.GridBagConstraints.HORIZONTAL;
		constraintsTxtZeroAxis.weightx = 1.0;
		constraintsTxtZeroAxis.ipadx = 104;
		constraintsTxtZeroAxis.insets = new java.awt.Insets(4, 11, 8, 95);
		add(getTxtZeroAxis(), constraintsTxtZeroAxis);

		java.awt.GridBagConstraints constraintsChxRotationDef = new java.awt.GridBagConstraints();
		constraintsChxRotationDef.gridx = 1; constraintsChxRotationDef.gridy = 3;
		constraintsChxRotationDef.ipadx = 49;
		constraintsChxRotationDef.ipady = -8;
		constraintsChxRotationDef.insets = new java.awt.Insets(6, 8, 5, 6);
		add(getChxRotationDef(), constraintsChxRotationDef);

		java.awt.GridBagConstraints constraintsLblZeroAxis = new java.awt.GridBagConstraints();
		constraintsLblZeroAxis.gridx = 2; constraintsLblZeroAxis.gridy = 3;
		constraintsLblZeroAxis.gridwidth = 3;
		constraintsLblZeroAxis.ipadx = 91;
		constraintsLblZeroAxis.insets = new java.awt.Insets(4, 4, 7, 14);
		add(getLblZeroAxis(), constraintsLblZeroAxis);

		java.awt.GridBagConstraints constraintsLblPiHalfAxis = new java.awt.GridBagConstraints();
		constraintsLblPiHalfAxis.gridx = 2; constraintsLblPiHalfAxis.gridy = 4;
		constraintsLblPiHalfAxis.gridwidth = 3;
		constraintsLblPiHalfAxis.ipadx = 79;
		constraintsLblPiHalfAxis.insets = new java.awt.Insets(2, 4, 13, 14);
		add(getLblPiHalfAxis(), constraintsLblPiHalfAxis);

		java.awt.GridBagConstraints constraintsTxtPiHalfAxis = new java.awt.GridBagConstraints();
		constraintsTxtPiHalfAxis.gridx = 5; constraintsTxtPiHalfAxis.gridy = 4;
		constraintsTxtPiHalfAxis.fill = java.awt.GridBagConstraints.HORIZONTAL;
		constraintsTxtPiHalfAxis.weightx = 1.0;
		constraintsTxtPiHalfAxis.ipadx = 104;
		constraintsTxtPiHalfAxis.insets = new java.awt.Insets(3, 11, 6, 95);
		add(getTxtPiHalfAxis(), constraintsTxtPiHalfAxis);
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setToolTipText(getResourceString("PnlBaseType_toolTipText"));
	javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
	group.add(getRbt1D());
	group.add(getRbt2D());
	group.add(getRbt3D());
	getTxtPiHalfAxis().setText("0");
	getTxtZeroAxis().setText("0");
	getTbpNumericTypes().setTitleAt(0, "1" + TAB_TITLE);
	getRbt1D().setSelected(true);
	dimensionChanged(null);
	getChxRotationDef().setSelected(false);
	getTxtEpsgCode().setText("");
	// user code end
}
public final void setObject(java.lang.Object object) throws DeveloperException {
	throw new DeveloperException("call setObject(Object, ModelElement) instead");//$NON-NLS-1$
}
/**
 * Set the Object to be displayed by panel.
 */
public void setObject(java.lang.Object object, ModelElement modelElement, ModelElement baseElement) {
	// initialize default for Numeric-Dimensions

	getPnlNumeric1D().setObject(ElementFactory.createNumericType(), modelElement);
	getPnlNumeric2D().setObject(ElementFactory.createNumericType(), modelElement);
	getPnlNumeric3D().setObject(ElementFactory.createNumericType(), modelElement);
	
    getTxtEpsgCode().setText(ElementUtils.getIliTaggedValue(baseElement, Ili2cMetaAttrs.ILI2C_CRS));
	
	if (object != null) {
		CoordinateType type = (CoordinateType)object;

		if (type.containsRotationDef()) {
			getChxRotationDef().setSelected(true);
			getTxtZeroAxis().setText(((new Long(type.getRotationDef().getNullAxis())).toString()));
			getTxtPiHalfAxis().setText(((new Long(type.getRotationDef().getPihalfAxis())).toString()));
		} else {
			getChxRotationDef().setSelected(false);
		}
	
		java.util.Iterator iterator = type.iteratorDim();
		if (iterator.hasNext()) {
			//oldDim = 1;
			getPnlNumeric1D().setObject(iterator.next(), modelElement);
			getRbt1D().setSelected(true);
		}
		else {
			throw new DeveloperException("unexpected Dimension");//$NON-NLS-1$
		}
	
		if (iterator.hasNext()) {
			//oldDim = 2;
			getPnlNumeric2D().setObject(iterator.next(), modelElement);
			getRbt2D().setSelected(true);
			if (iterator.hasNext()) {
				//oldDim = 3;
				getPnlNumeric3D().setObject(iterator.next(), modelElement);
				getRbt3D().setSelected(true);
			} else {
				getTbpNumericTypes().remove(getPnlNumeric3D());
			}
		} else {
			getTbpNumericTypes().remove(getPnlNumeric2D());
			getTbpNumericTypes().remove(getPnlNumeric3D());
		}

		isMulti = type.isMulti();
	}
}

public void setMulti(boolean isMulti) {
	this.isMulti = isMulti;
}
}
