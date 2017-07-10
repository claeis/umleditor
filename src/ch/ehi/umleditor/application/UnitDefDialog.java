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
import ch.softenvironment.view.*;
/**
 * User Interface for a UnitDef.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:04 $
 */
public class UnitDefDialog extends BaseDialog {
	// ModelElement
	private static java.util.ResourceBundle resUnitDefDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/UnitDefDialog");  //$NON-NLS-1$
	ch.ehi.interlis.units.UnitDef unitDef = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JTabbedPane ivjTbpGeneral = null;
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JTextField ivjTxtName = null;
	private javax.swing.JButton ivjBtnApply = null;
	private DescriptionPanel ivjPnlDescription = null;
	private InterlisSyntaxPanel ivjPnlSyntax = null;
	private javax.swing.JLabel ivjLblDescName = null;
	private javax.swing.JTextField ivjTxtDescName = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == UnitDefDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == UnitDefDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == UnitDefDialog.this.getBtnApply())
				connEtoC3(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == UnitDefDialog.this.getTxtName())
				connEtoM1(e);
			if (e.getSource() == UnitDefDialog.this.getTxtDescName())
				connEtoM2(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
	};
/**
 * Constructor
 */
public UnitDefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();
	setRelativeLocation(owner);
	setElement(element);
	show();
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
 * connEtoM2:  (TxtShortName.focus.focusGained(java.awt.event.FocusEvent) --> TxtShortName.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM2(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtDescName().selectAll();
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
			constraintsLblName.gridwidth = 2;
			constraintsLblName.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblName.ipadx = 82;
			constraintsLblName.insets = new java.awt.Insets(22, 15, 6, 3);
			getBaseDialogContentPane().add(getLblName(), constraintsLblName);

			java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
			constraintsTxtName.gridx = 3; constraintsTxtName.gridy = 1;
			constraintsTxtName.gridwidth = 2;
			constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtName.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsTxtName.weightx = 1.0;
			constraintsTxtName.ipadx = 158;
			constraintsTxtName.insets = new java.awt.Insets(19, 4, 3, 15);
			getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 4;
			constraintsBtnOk.ipadx = 70;
			constraintsBtnOk.insets = new java.awt.Insets(3, 25, 7, 5);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 4;
			constraintsBtnCancel.gridwidth = 2;
			constraintsBtnCancel.ipadx = 24;
			constraintsBtnCancel.insets = new java.awt.Insets(3, 6, 7, 3);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
			constraintsBtnApply.gridx = 4; constraintsBtnApply.gridy = 4;
			constraintsBtnApply.ipadx = 14;
			constraintsBtnApply.insets = new java.awt.Insets(3, 4, 7, 20);
			getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

			java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
			constraintsTbpGeneral.gridx = 1; constraintsTbpGeneral.gridy = 3;
			constraintsTbpGeneral.gridwidth = 4;
			constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpGeneral.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsTbpGeneral.weightx = 1.0;
			constraintsTbpGeneral.weighty = 1.0;
			constraintsTbpGeneral.ipadx = 252;
			constraintsTbpGeneral.ipady = 99;
			constraintsTbpGeneral.insets = new java.awt.Insets(5, 10, 2, 9);
			getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

			java.awt.GridBagConstraints constraintsLblDescName = new java.awt.GridBagConstraints();
			constraintsLblDescName.gridx = 1; constraintsLblDescName.gridy = 2;
			constraintsLblDescName.gridwidth = 2;
			constraintsLblDescName.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsLblDescName.ipadx = 151;
			constraintsLblDescName.insets = new java.awt.Insets(6, 15, 7, 3);
			getBaseDialogContentPane().add(getLblDescName(), constraintsLblDescName);

			java.awt.GridBagConstraints constraintsTxtDescName = new java.awt.GridBagConstraints();
			constraintsTxtDescName.gridx = 3; constraintsTxtDescName.gridy = 2;
			constraintsTxtDescName.gridwidth = 2;
			constraintsTxtDescName.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtDescName.anchor = java.awt.GridBagConstraints.NORTHWEST;
			constraintsTxtDescName.weightx = 1.0;
			constraintsTxtDescName.ipadx = 158;
			constraintsTxtDescName.insets = new java.awt.Insets(3, 4, 4, 15);
			getBaseDialogContentPane().add(getTxtDescName(), constraintsTxtDescName);
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
			ivjBtnCancel.setText(getCancelString());
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
			ivjBtnOk.setText(getOKString());
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnOk;
}
/**
 * Return the LblName1 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblDescName() {
	if (ivjLblDescName == null) {
		try {
			ivjLblDescName = new javax.swing.JLabel();
			ivjLblDescName.setName("LblDescName");
			ivjLblDescName.setText(resUnitDefDialog.getString("LblDescName_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblDescName;
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
			ivjLblName.setText(resUnitDefDialog.getString("LblName_text"));
			// user code begin {1}
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
 * Return the PnlUnitCode property value.
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
			ivjTbpGeneral.insertTab(resUnitDefDialog.getString("TbpDefinition_title"), null, getPnlSyntax(), null, 1);
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
 * Return the TxtName1 property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtDescName() {
	if (ivjTxtDescName == null) {
		try {
			ivjTxtDescName = new javax.swing.JTextField();
			ivjTxtDescName.setName("TxtDescName");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtDescName;
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
	getTxtName().addFocusListener(ivjEventHandler);
	getTxtDescName().addFocusListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("UnitDefSpecificationDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(426, 285);
		setTitle(resUnitDefDialog.getString("UnitDefSpecificationDialog_title"));
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * Save ModelElement changes.
 * @see okPressed()
 * @see applyPressed
 */
protected boolean save() {
	if (!ElementUtils.trySetName(unitDef, getTxtName().getText())) {
		return false;
	}
	if (unitDef.getDescName() == null) {
		unitDef.setDescName(new ch.ehi.basics.types.NlsString(getTxtDescName().getText()));
	} else {
		unitDef.setDescName(new ch.ehi.basics.types.NlsString(unitDef.getDescName(), getTxtDescName().getText()));
	}
	getPnlDescription().getObject();

	// page Definition
	unitDef.setSyntax(getPnlSyntax().getSyntax());

	return super.save();
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	unitDef = (ch.ehi.interlis.units.UnitDef)element;

	// general & page Description
	getTxtName().setText(unitDef.getDefLangName());
	getTxtDescName().setText(ElementUtils.mapNlsString(unitDef.getDescName()));
	getPnlDescription().setObject(element);

	// page Definition
	getPnlSyntax().setSyntax(unitDef);
}
}
