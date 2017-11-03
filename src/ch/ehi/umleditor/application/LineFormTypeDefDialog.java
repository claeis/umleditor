package ch.ehi.umleditor.application;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
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
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.softenvironment.view.*;

/**
 * User Interface for a LineFormTypeDef.
 *
 * @author: ce
 * @version $Revision: 1.2 $ $Date: 2004-04-27 09:20:44 $
 */
public class LineFormTypeDefDialog extends BaseDialog {
	
	private static final long serialVersionUID = -5290164142478410306L;
	// ModelElement
	private LineFormTypeDef modelElement = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JTabbedPane ivjTbpGeneral = null;
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JTextField ivjTxtName = null;
	private javax.swing.JButton ivjBtnApply = null;
	private DescriptionPanel ivjPnlDescription = null;
	private JPanel ivjPnlDetail = null;
	private ReferencableComboBox ivjCbxStructure = null;
	private javax.swing.JLabel ivjLblStructure = null;

	class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == LineFormTypeDefDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == LineFormTypeDefDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == LineFormTypeDefDialog.this.getBtnApply())
				connEtoC3(e);
		};

		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == LineFormTypeDefDialog.this.getTxtName())
				connEtoM1(e);
		};

		public void focusLost(java.awt.event.FocusEvent e) {
		};
	};

	/**
	 * Constructor
	 */
	public LineFormTypeDefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
		super(owner, true);
		initialize();
		addEscapeKey();
		setRelativeLocation(owner);
		setElement(element);
		show();
	}
	/**
	 * Handle escape key to close the dialog
	 */
	 private void addEscapeKey() {
		 
		 KeyStroke escape = KeyStroke.getKeyStroke (KeyEvent.VK_ESCAPE, 0, false);
		 Action escapeAction = new AbstractAction() {
			
			private static final long serialVersionUID = 1596889083747329566L;

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
	 * connEtoC1: (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) -->
	 * UmlModelDialog.okPressed()V)
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
	 * --> Ili2ModelSetDialog.cancelPressed()V)
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
	 * --> Ili2ModelSetDialog.applyPressed()V)
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
				constraintsLblName.gridx = 0;
				constraintsLblName.gridy = 0;
				constraintsLblName.ipadx = 63;
				constraintsLblName.insets = new java.awt.Insets(22, 15, 6, 4);
				getBaseDialogContentPane().add(getLblName(), constraintsLblName);

				java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
				constraintsTxtName.gridx = 1;
				constraintsTxtName.gridy = 0;
				constraintsTxtName.gridwidth = 3;
				constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtName.weightx = 1.0;
				constraintsTxtName.ipadx = 285;
				constraintsTxtName.insets = new java.awt.Insets(19, 4, 3, 15);
				getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 0;
				constraintsBtnOk.gridy = 2;
				constraintsBtnOk.gridwidth = 2;
				constraintsBtnOk.ipadx = 64;
				constraintsBtnOk.insets = new java.awt.Insets(3, 23, 6, 3);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

				java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
				constraintsBtnCancel.gridx = 2;
				constraintsBtnCancel.gridy = 2;
				constraintsBtnCancel.ipadx = 18;
				constraintsBtnCancel.insets = new java.awt.Insets(3, 3, 6, 3);
				getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

				java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
				constraintsBtnApply.gridx = 3;
				constraintsBtnApply.gridy = 2;
				constraintsBtnApply.ipadx = 8;
				constraintsBtnApply.insets = new java.awt.Insets(3, 3, 6, 46);
				getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

				java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
				constraintsTbpGeneral.gridx = 0;
				constraintsTbpGeneral.gridy = 1;
				constraintsTbpGeneral.gridwidth = 4;
				constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
				constraintsTbpGeneral.weightx = 1.0;
				constraintsTbpGeneral.weighty = 1.0;
				constraintsTbpGeneral.ipadx = 376;
				constraintsTbpGeneral.ipady = 50;
				constraintsTbpGeneral.insets = new java.awt.Insets(5, 10, 3, 9);
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
	 * 
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
	 * 
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
	 * 
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
	 * Return the CbxUnitDef property value.
	 * 
	 * @return ch.ehi.umleditor.application.ReferencableComboBox
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private ReferencableComboBox getCbxStructure() {
		if (ivjCbxStructure == null) {
			try {
				ivjCbxStructure = new ch.ehi.umleditor.application.ReferencableComboBox();
				ivjCbxStructure.setName("CbxStructure");
				// ivjCbxStructure.setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
				// ivjCbxStructure.setBounds(316, 87, 161, 23);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjCbxStructure;
	}

	/**
	 * Return the LblUnit property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblStructure() {
		if (ivjLblStructure == null) {
			try {
				ivjLblStructure = new javax.swing.JLabel();
				ivjLblStructure.setName("LblStructure");
				ivjLblStructure.setText("Struktur:");
				// ivjLblStructure.setBounds(168, 89, 140, 14);
				// user code begin {1}
				ivjLblStructure.setText(getResourceString("LblStructure_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblStructure;
	}

	/**
	 * Return the PnlSyntax property value.
	 * 
	 * @return ch.ehi.umleditor.application.InterlisSyntaxPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private JPanel getPnlDetail() {
		if (ivjPnlDetail == null) {
			try {
				ivjPnlDetail = new JPanel();
				ivjPnlDetail.setName("PnlDetail");
				ivjPnlDetail.setLayout(new java.awt.GridBagLayout());
				java.awt.GridBagConstraints constraintsCbxStructure = new java.awt.GridBagConstraints();
				constraintsCbxStructure.gridx = 1;
				constraintsCbxStructure.gridy = 0;
				constraintsCbxStructure.gridwidth = 1;
				constraintsCbxStructure.gridheight = 1;
				constraintsCbxStructure.weightx = 1.0;
				constraintsCbxStructure.fill = java.awt.GridBagConstraints.HORIZONTAL;
				getPnlDetail().add(getCbxStructure(), constraintsCbxStructure);

				java.awt.GridBagConstraints constraintsLblStructure = new java.awt.GridBagConstraints();
				constraintsLblStructure.gridx = 0;
				constraintsLblStructure.gridy = 0;
				constraintsLblStructure.gridwidth = 1;
				constraintsLblStructure.gridheight = 1;
				constraintsLblStructure.anchor = java.awt.GridBagConstraints.WEST;
				getPnlDetail().add(getLblStructure(), constraintsLblStructure);
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
				ivjTbpGeneral.insertTab(getResourceString("TbpDetail_title"), null, getPnlDetail(), null, 1);
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
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("CommonSpecificationDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(426, 385);
			setTitle("<Generic>(Spezifikation)");
			setContentPane(getBaseDialogContentPane());
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		setTitle(getResourceString("Dialog_title"));
		// user code end
	}

	/**
	 * Save ModelElement changes.
	 * 
	 * @see okPressed()
	 * @see applyPressed
	 */
	protected boolean save() {
		if (!ElementUtils.trySetName(modelElement, getTxtName().getText())) {
			return false;
		}
		getPnlDescription().getObject();

		// structure

		if (modelElement.containsStructure()) {
			modelElement.detachStructure();
		}
		if ((getCbxStructure().getElement() != null)) {
			modelElement.attachStructure((ClassDef) getCbxStructure().getElement());
		}

		return super.save();
	}

	/**
	 * Map model to view.
	 */
	private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
		modelElement = (LineFormTypeDef) element;

		// general & page Description
		getTxtName().setText(modelElement.getDefLangName());
		getPnlDescription().setObject(modelElement);

		// structure
		if (modelElement.containsStructure()) {
			getCbxStructure().setElement(ClassDef.class, modelElement, modelElement.getStructure());
		} else {
			getCbxStructure().setElement(ClassDef.class, modelElement, null);
		}

	}
}
