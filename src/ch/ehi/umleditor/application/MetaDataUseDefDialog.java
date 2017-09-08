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
import ch.softenvironment.util.*;

/**
 * User Interface for a MetaDataUseDef.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.3 $ $Date: 2007-01-14 08:17:16 $
 */
public class MetaDataUseDefDialog extends BaseDialog {
	
	private static final long serialVersionUID = -351882692096969451L;
	// ModelElement
	private static java.util.ResourceBundle resMetaDataUseDefDialog = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/MetaDataUseDefDialog"); //$NON-NLS-1$
	ch.ehi.interlis.metaobjects.MetaDataUseDef metaDataUseDef = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JTabbedPane ivjTbpGeneral = null;
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JTextField ivjTxtName = null;
	private javax.swing.JButton ivjBtnApply = null;
	private DescriptionPanel ivjPnlDescription = null;
	private javax.swing.JRadioButton ivjRbtRefSystem = null;
	private javax.swing.JRadioButton ivjRbtSign = null;
	private InterlisSyntaxPanel ivjPnlSyntax = null;
	private javax.swing.JLabel ivjLblKind = null;
	private javax.swing.JLabel ivjLblBasketOID = null;
	private javax.swing.JTextField ivjTxtBasketOID = null;

	class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == MetaDataUseDefDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == MetaDataUseDefDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == MetaDataUseDefDialog.this.getBtnApply())
				connEtoC3(e);
		};

		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == MetaDataUseDefDialog.this.getTxtName())
				connEtoM1(e);
			if (e.getSource() == MetaDataUseDefDialog.this.getTxtBasketOID())
				connEtoM2(e);
		};

		public void focusLost(java.awt.event.FocusEvent e) {
		};
	};

	/**
	 * Constructor
	 */
	public MetaDataUseDefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
		super(owner, true);
		initialize();
		setRelativeLocation(owner);
		setElement(element);
		show();
	}

	/**
	 * Constructor
	 * 
	 * @param owner
	 *            Symbol
	 * @param modal
	 *            Symbol
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	public MetaDataUseDefDialog(java.awt.Frame owner, boolean modal) {
		super(owner, modal);
		initialize();
	}

	/**
	 * connEtoC1: (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) -->
	 * MetaDataUseDefDialog.okPressed()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
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
	 * connEtoC2: (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> MetaDataUseDefDialog.cancelPressed()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
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
	 * connEtoC3: (BtnApply.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> MetaDataUseDefDialog.applyPressed()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
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
	 * connEtoM1: (TxtName.focus.focusGained(java.awt.event.FocusEvent) -->
	 * TxtName.selectAll()V)
	 * 
	 * @param arg1
	 *            java.awt.event.FocusEvent
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
	 * connEtoM2: (TxtBasketOID.focus.focusGained(java.awt.event.FocusEvent) -->
	 * TxtBasketOID.selectAll()V)
	 * 
	 * @param arg1
	 *            java.awt.event.FocusEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoM2(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtBasketOID().selectAll();
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
	 * 
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
				constraintsLblName.gridx = 1;
				constraintsLblName.gridy = 1;
				constraintsLblName.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsLblName.ipadx = 144;
				constraintsLblName.insets = new java.awt.Insets(15, 9, 7, 2);
				getBaseDialogContentPane().add(getLblName(), constraintsLblName);

				java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
				constraintsTxtName.gridx = 2;
				constraintsTxtName.gridy = 1;
				constraintsTxtName.gridwidth = 3;
				constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtName.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsTxtName.weightx = 1.0;
				constraintsTxtName.ipadx = 255;
				constraintsTxtName.insets = new java.awt.Insets(14, 8, 2, 15);
				getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

				java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
				constraintsTbpGeneral.gridx = 1;
				constraintsTbpGeneral.gridy = 4;
				constraintsTbpGeneral.gridwidth = 4;
				constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
				constraintsTbpGeneral.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsTbpGeneral.weightx = 1.0;
				constraintsTbpGeneral.weighty = 1.0;
				constraintsTbpGeneral.ipadx = 300;
				constraintsTbpGeneral.ipady = 58;
				constraintsTbpGeneral.insets = new java.awt.Insets(3, 9, 5, 9);
				getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 1;
				constraintsBtnOk.gridy = 5;
				constraintsBtnOk.ipadx = 64;
				constraintsBtnOk.insets = new java.awt.Insets(5, 73, 9, 3);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

				java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
				constraintsBtnCancel.gridx = 2;
				constraintsBtnCancel.gridy = 5;
				constraintsBtnCancel.ipadx = 18;
				constraintsBtnCancel.insets = new java.awt.Insets(5, 3, 9, 4);
				getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

				java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
				constraintsBtnApply.gridx = 3;
				constraintsBtnApply.gridy = 5;
				constraintsBtnApply.gridwidth = 2;
				constraintsBtnApply.ipadx = 3;
				constraintsBtnApply.insets = new java.awt.Insets(5, 4, 9, 46);
				getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

				java.awt.GridBagConstraints constraintsRbtSign = new java.awt.GridBagConstraints();
				constraintsRbtSign.gridx = 2;
				constraintsRbtSign.gridy = 3;
				constraintsRbtSign.gridwidth = 2;
				constraintsRbtSign.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsRbtSign.ipadx = 74;
				constraintsRbtSign.insets = new java.awt.Insets(3, 8, 3, 3);
				getBaseDialogContentPane().add(getRbtSign(), constraintsRbtSign);

				java.awt.GridBagConstraints constraintsRbtRefSystem = new java.awt.GridBagConstraints();
				constraintsRbtRefSystem.gridx = 4;
				constraintsRbtRefSystem.gridy = 3;
				constraintsRbtRefSystem.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsRbtRefSystem.ipadx = 36;
				constraintsRbtRefSystem.insets = new java.awt.Insets(3, 4, 3, 12);
				getBaseDialogContentPane().add(getRbtRefSystem(), constraintsRbtRefSystem);

				java.awt.GridBagConstraints constraintsLblKind = new java.awt.GridBagConstraints();
				constraintsLblKind.gridx = 1;
				constraintsLblKind.gridy = 3;
				constraintsLblKind.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsLblKind.ipadx = 160;
				constraintsLblKind.insets = new java.awt.Insets(4, 9, 10, 2);
				getBaseDialogContentPane().add(getLblKind(), constraintsLblKind);

				java.awt.GridBagConstraints constraintsLblBasketOID = new java.awt.GridBagConstraints();
				constraintsLblBasketOID.gridx = 1;
				constraintsLblBasketOID.gridy = 2;
				constraintsLblBasketOID.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsLblBasketOID.ipadx = 114;
				constraintsLblBasketOID.insets = new java.awt.Insets(4, 9, 7, 2);
				getBaseDialogContentPane().add(getLblBasketOID(), constraintsLblBasketOID);

				java.awt.GridBagConstraints constraintsTxtBasketOID = new java.awt.GridBagConstraints();
				constraintsTxtBasketOID.gridx = 2;
				constraintsTxtBasketOID.gridy = 2;
				constraintsTxtBasketOID.gridwidth = 3;
				constraintsTxtBasketOID.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtBasketOID.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsTxtBasketOID.weightx = 1.0;
				constraintsTxtBasketOID.ipadx = 255;
				constraintsTxtBasketOID.insets = new java.awt.Insets(3, 8, 2, 15);
				getBaseDialogContentPane().add(getTxtBasketOID(), constraintsTxtBasketOID);
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
	 * 
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
	 * 
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
	 * 
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
	 * Return the LblBasketOID property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblBasketOID() {
		if (ivjLblBasketOID == null) {
			try {
				ivjLblBasketOID = new javax.swing.JLabel();
				ivjLblBasketOID.setName("LblBasketOID");
				ivjLblBasketOID.setToolTipText("");
				ivjLblBasketOID.setText("Basket OID:");
				// user code begin {1}
				ivjLblBasketOID.setText(resMetaDataUseDefDialog.getString("LblBasketOID_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblBasketOID;
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
				ivjLblKind.setText("Art:");
				// user code begin {1}
				ivjLblKind.setText(resMetaDataUseDefDialog.getString("LblKind_text"));
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
	 * 
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
				ivjLblName.setText(resMetaDataUseDefDialog.getString("LblName_text"));
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
	 * 
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
	 * Return the PnlConstraints property value.
	 * 
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
	 * Return the RbtRefSystem property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtRefSystem() {
		if (ivjRbtRefSystem == null) {
			try {
				ivjRbtRefSystem = new javax.swing.JRadioButton();
				ivjRbtRefSystem.setName("RbtRefSystem");
				ivjRbtRefSystem.setToolTipText("Reference-System");
				ivjRbtRefSystem.setText("REFSYSTEM");
				// user code begin {1}
				ivjRbtRefSystem.setToolTipText(resMetaDataUseDefDialog.getString("RbtRefSystem_toolTipText"));
				ivjRbtRefSystem.setText(resMetaDataUseDefDialog.getString("RbtRefSystem_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtRefSystem;
	}

	/**
	 * Return the RbtSign property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtSign() {
		if (ivjRbtSign == null) {
			try {
				ivjRbtSign = new javax.swing.JRadioButton();
				ivjRbtSign.setName("RbtSign");
				ivjRbtSign.setToolTipText("Sign");
				ivjRbtSign.setText("SIGN");
				// user code begin {1}
				ivjRbtSign.setToolTipText(resMetaDataUseDefDialog.getString("RbtSign_toolTipText"));
				ivjRbtSign.setText(resMetaDataUseDefDialog.getString("RbtSign_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtSign;
	}

	/**
	 * Return the TbpGeneral property value.
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTabbedPane getTbpGeneral() {
		if (ivjTbpGeneral == null) {
			try {
				ivjTbpGeneral = new javax.swing.JTabbedPane();
				ivjTbpGeneral.setName("TbpGeneral");
				ivjTbpGeneral.insertTab(getDescriptionString(), null, getPnlDescription(), null, 0);
				ivjTbpGeneral.insertTab(resMetaDataUseDefDialog.getString("TbpDefinition_title"), null, getPnlSyntax(),
						null, 1);
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
	 * Return the TxtBasketOID property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtBasketOID() {
		if (ivjTxtBasketOID == null) {
			try {
				ivjTxtBasketOID = new javax.swing.JTextField();
				ivjTxtBasketOID.setName("TxtBasketOID");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtBasketOID;
	}

	/**
	 * Return the JTextField1 property value.
	 * 
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
	 * 
	 * @param exception
	 *            java.lang.Throwable
	 */
	protected void handleException(java.lang.Throwable exception) {
		super.handleException(exception);
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
		getBtnOk().addActionListener(ivjEventHandler);
		getBtnCancel().addActionListener(ivjEventHandler);
		getBtnApply().addActionListener(ivjEventHandler);
		getTxtName().addFocusListener(ivjEventHandler);
		getTxtBasketOID().addFocusListener(ivjEventHandler);
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("SpecificationDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(473, 269);
			setTitle("MetaDataUseDef (Spezifikation)");
			setContentPane(getBaseDialogContentPane());
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		setTitle(resMetaDataUseDefDialog.getString("CTDialog"));
		setSize(560, 285);
		javax.swing.ButtonGroup buttonGroup = new javax.swing.ButtonGroup();
		buttonGroup.add(getRbtSign());
		buttonGroup.add(getRbtRefSystem());
		// user code end
	}

	/**
	 * Save ModelElement changes.
	 * 
	 * @see okPressed()
	 * @see applyPressed
	 */
	protected boolean save() {
		if (!ElementUtils.trySetName(metaDataUseDef, getTxtName().getText())) {
			return false;
		}
		metaDataUseDef.setBasketOid(getTxtBasketOID().getText());

		if (getRbtSign().isSelected()) {
			metaDataUseDef.setKind(ch.ehi.interlis.metaobjects.MetaDataUseDefKind.SIGN);
		} else if (getRbtRefSystem().isSelected()) {
			metaDataUseDef.setKind(ch.ehi.interlis.metaobjects.MetaDataUseDefKind.REFSYSTEM);
		} else {
			Tracer.getInstance().developerWarning("MetaDataUseDef.kind not properly initialized");// $NON-NLS-2$//$NON-NLS-1$
		}

		getPnlDescription().getObject();

		metaDataUseDef.setSyntax(getPnlSyntax().getSyntax());

		return super.save();
	}

	/**
	 * Map model to view.
	 */
	private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
		metaDataUseDef = (ch.ehi.interlis.metaobjects.MetaDataUseDef) element;

		getTxtName().setText(metaDataUseDef.getDefLangName());
		getTxtBasketOID().setText(metaDataUseDef.getBasketOid());
		getPnlDescription().setObject(element);

		switch (metaDataUseDef.getKind()) {
		case ch.ehi.interlis.metaobjects.MetaDataUseDefKind.SIGN: {
			getRbtSign().setSelected(true);
			break;
		}
		case ch.ehi.interlis.metaobjects.MetaDataUseDefKind.REFSYSTEM: {
			getRbtRefSystem().setSelected(true);
			break;
		}
		}

		getPnlSyntax().setSyntax(metaDataUseDef);
	}
}
