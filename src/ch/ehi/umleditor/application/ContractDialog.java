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
import ch.softenvironment.view.*;
/**
 * User Interface for a Contract.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:38 $
 */
public class ContractDialog extends BaseDialog {
	// ModelElement
	private static java.util.ResourceBundle resContractDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/ContractDialog");
	Contract contract = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JTabbedPane ivjTbpGeneral = null;
	private javax.swing.JButton ivjBtnApply = null;
	private DescriptionPanel ivjPnlDescription = null;
	private javax.swing.JLabel ivjLblIssuer = null;
	private javax.swing.JTextField ivjTxtIssuer = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == ContractDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == ContractDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == ContractDialog.this.getBtnApply())
				connEtoC3(e);
		};
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == ContractDialog.this.getTxtIssuer())
				connEtoM1(e);
		};
		public void focusLost(java.awt.event.FocusEvent e) {};
	};
/**
 * Constructor
 */
public ContractDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();

	setTitle(ElementUtils.getDisplayName(element) + " " + resContractDialog.getString("CTDialog")); //$NON-NLS-1$
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
 * connEtoM1:  (TxtIssuer.focus.focusGained(java.awt.event.FocusEvent) --> TxtIssuer.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.FocusEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTxtIssuer().selectAll();
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

			java.awt.GridBagConstraints constraintsLblIssuer = new java.awt.GridBagConstraints();
			constraintsLblIssuer.gridx = 1; constraintsLblIssuer.gridy = 1;
			constraintsLblIssuer.gridwidth = 2;
			constraintsLblIssuer.ipadx = 131;
			constraintsLblIssuer.insets = new java.awt.Insets(22, 15, 4, 4);
			getBaseDialogContentPane().add(getLblIssuer(), constraintsLblIssuer);

			java.awt.GridBagConstraints constraintsTxtIssuer = new java.awt.GridBagConstraints();
			constraintsTxtIssuer.gridx = 3; constraintsTxtIssuer.gridy = 1;
			constraintsTxtIssuer.gridwidth = 2;
			constraintsTxtIssuer.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtIssuer.weightx = 1.0;
			constraintsTxtIssuer.ipadx = 214;
			constraintsTxtIssuer.insets = new java.awt.Insets(19, 4, 1, 15);
			getBaseDialogContentPane().add(getTxtIssuer(), constraintsTxtIssuer);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 3;
			constraintsBtnOk.ipadx = 64;
			constraintsBtnOk.insets = new java.awt.Insets(4, 32, 5, 3);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 3;
			constraintsBtnCancel.gridwidth = 2;
			constraintsBtnCancel.ipadx = 18;
			constraintsBtnCancel.insets = new java.awt.Insets(4, 3, 5, 5);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
			constraintsBtnApply.gridx = 4; constraintsBtnApply.gridy = 3;
			constraintsBtnApply.ipadx = 16;
			constraintsBtnApply.insets = new java.awt.Insets(4, 5, 5, 25);
			getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

			java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
			constraintsTbpGeneral.gridx = 1; constraintsTbpGeneral.gridy = 2;
			constraintsTbpGeneral.gridwidth = 4;
			constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpGeneral.weightx = 1.0;
			constraintsTbpGeneral.weighty = 1.0;
			constraintsTbpGeneral.ipadx = 376;
			constraintsTbpGeneral.ipady = 99;
			constraintsTbpGeneral.insets = new java.awt.Insets(2, 10, 3, 9);
			getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);
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
 * Return the JLabel1 property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblIssuer() {
	if (ivjLblIssuer == null) {
		try {
			ivjLblIssuer = new javax.swing.JLabel();
			ivjLblIssuer.setName("LblIssuer");
			ivjLblIssuer.setToolTipText(resContractDialog.getString("LblIssuer_toolTipText"));
			ivjLblIssuer.setText(resContractDialog.getString("LblIssuer_text"));
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblIssuer;
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
 * Return the TbpGeneral property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTabbedPane getTbpGeneral() {
	if (ivjTbpGeneral == null) {
		try {
			ivjTbpGeneral = new javax.swing.JTabbedPane();
			ivjTbpGeneral.setName("TbpGeneral");
			ivjTbpGeneral.setToolTipText(resContractDialog.getString("TbpGeneral_toolTipText"));
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
 * Return the JTextField1 property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtIssuer() {
	if (ivjTxtIssuer == null) {
		try {
			ivjTxtIssuer = new javax.swing.JTextField();
			ivjTxtIssuer.setName("TxtIssuer");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtIssuer;
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
	getTxtIssuer().addFocusListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("ContractSpecificationDialog");//$NON-NLS-1$
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(426, 230);
		setTitle("Vertrag (Spezifikation)"); //$NON-NLS-1$
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
	contract.setIssuer(new ch.ehi.basics.types.NlsString(contract.getIssuer(), getTxtIssuer().getText()));
//	contract.setExplanation(new ch.ehi.basics.types.NlsString(contract.getExplanation(), getTxtExplanation().getText()));
	getPnlDescription().getObject();

	return super.save();
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	contract = (Contract)element;

	// general & page Description
	getTxtIssuer().setText(ElementUtils.mapNlsString(contract.getIssuer()));
//	getTxtExplanation().setText(ElementMapper.mapNlsString(contract.getExplanation()));
	getPnlDescription().setObject(contract);
}
}
