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
import ch.ehi.basics.view.*;
import javax.swing.*;
import ch.softenvironment.view.*;

/**
 * User Interface for a MetaObjectFile.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:31 $
 */
public class MetaObjectFileDialog extends BaseDialog {
	// ModelElement
	private static java.util.ResourceBundle resMetaObjectFileDialog = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/MetaObjectFileDialog"); //$NON-NLS-1$
	ch.ehi.interlis.metaobjects.MetaObjectFile metaObjectFile = null;
	private JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JButton ivjBtnCancel = null;
	private JButton ivjBtnOk = null;
	private JTabbedPane ivjTbpGeneral = null;
	private JButton ivjBtnApply = null;
	private DescriptionPanel ivjPnlDescription = null;
	private JButton ivjBtnFileSearch = null;
	private JLabel ivjLblFilename = null;
	private JTextField ivjTxtFilename = null;

	class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == MetaObjectFileDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == MetaObjectFileDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == MetaObjectFileDialog.this.getBtnApply())
				connEtoC3(e);
			if (e.getSource() == MetaObjectFileDialog.this.getBtnFileSearch())
				connEtoC4(e);
		};

		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == MetaObjectFileDialog.this.getTxtFilename())
				connEtoM1(e);
		};

		public void focusLost(java.awt.event.FocusEvent e) {
		};
	};

	/**
	 * Constructor
	 */
	public MetaObjectFileDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
		super(owner, true);
		initialize();

		setTitle(resMetaObjectFileDialog.getString("CTSpecification")); //$NON-NLS-1$
		setRelativeLocation(owner);
		setElement(element);
		show();
	}

	/**
	 * Open a File-Dialog.
	 */
	private void btnFileSearch() {
		FileChooser openDialog = new FileChooser(LauncherView.getInstance().getSettings().getWorkingDirectory());
		openDialog.setDialogTitle(resMetaObjectFileDialog.getString("CTAssignFilename")); //$NON-NLS-1$
		openDialog.addChoosableFileFilter(LauncherView.createXmlFilter());

		if (openDialog.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			try {
				LauncherView.getInstance().getSettings()
						.setWorkingDirectory(openDialog.getCurrentDirectory().getAbsolutePath());
				String fileName = openDialog.getSelectedFile().getAbsolutePath();
				getTxtFilename().setText(fileName);
			} catch (Throwable e) {
				handleException(e);
			}
		}
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
	 * connEtoC4:
	 * (BtnFileSearch.action.actionPerformed(java.awt.event.ActionEvent) -->
	 * MetaObjectFileDialog.btnFileSearch()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC4(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.btnFileSearch();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoM1: (TxtFilename.focus.focusGained(java.awt.event.FocusEvent) -->
	 * TxtFilename.selectAll()V)
	 * 
	 * @param arg1
	 *            java.awt.event.FocusEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoM1(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtFilename().selectAll();
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

				java.awt.GridBagConstraints constraintsLblFilename = new java.awt.GridBagConstraints();
				constraintsLblFilename.gridx = 1;
				constraintsLblFilename.gridy = 1;
				constraintsLblFilename.gridwidth = 2;
				constraintsLblFilename.ipadx = 74;
				constraintsLblFilename.insets = new java.awt.Insets(22, 15, 6, 3);
				getBaseDialogContentPane().add(getLblFilename(), constraintsLblFilename);

				java.awt.GridBagConstraints constraintsTxtFilename = new java.awt.GridBagConstraints();
				constraintsTxtFilename.gridx = 3;
				constraintsTxtFilename.gridy = 1;
				constraintsTxtFilename.gridwidth = 2;
				constraintsTxtFilename.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtFilename.weightx = 1.0;
				constraintsTxtFilename.ipadx = 203;
				constraintsTxtFilename.insets = new java.awt.Insets(19, 4, 3, 4);
				getBaseDialogContentPane().add(getTxtFilename(), constraintsTxtFilename);

				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 1;
				constraintsBtnOk.gridy = 3;
				constraintsBtnOk.ipadx = 64;
				constraintsBtnOk.insets = new java.awt.Insets(4, 32, 5, 3);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

				java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
				constraintsBtnCancel.gridx = 2;
				constraintsBtnCancel.gridy = 3;
				constraintsBtnCancel.gridwidth = 2;
				constraintsBtnCancel.ipadx = 18;
				constraintsBtnCancel.insets = new java.awt.Insets(4, 3, 5, 5);
				getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

				java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
				constraintsBtnApply.gridx = 4;
				constraintsBtnApply.gridy = 3;
				constraintsBtnApply.gridwidth = 2;
				constraintsBtnApply.ipadx = 16;
				constraintsBtnApply.insets = new java.awt.Insets(4, 5, 5, 25);
				getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

				java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
				constraintsTbpGeneral.gridx = 1;
				constraintsTbpGeneral.gridy = 2;
				constraintsTbpGeneral.gridwidth = 5;
				constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
				constraintsTbpGeneral.weightx = 1.0;
				constraintsTbpGeneral.weighty = 1.0;
				constraintsTbpGeneral.ipadx = 376;
				constraintsTbpGeneral.ipady = 99;
				constraintsTbpGeneral.insets = new java.awt.Insets(0, 10, 3, 9);
				getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

				java.awt.GridBagConstraints constraintsBtnFileSearch = new java.awt.GridBagConstraints();
				constraintsBtnFileSearch.gridx = 5;
				constraintsBtnFileSearch.gridy = 1;
				constraintsBtnFileSearch.insets = new java.awt.Insets(17, 4, 0, 6);
				getBaseDialogContentPane().add(getBtnFileSearch(), constraintsBtnFileSearch);
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
	 * Return the BtnFileSearch property value.
	 * 
	 * @return javax.swing.JButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JButton getBtnFileSearch() {
		if (ivjBtnFileSearch == null) {
			try {
				ivjBtnFileSearch = new javax.swing.JButton();
				ivjBtnFileSearch.setName("BtnFileSearch");
				ivjBtnFileSearch.setText("...");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjBtnFileSearch;
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
	 * Return the LblFilename property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblFilename() {
		if (ivjLblFilename == null) {
			try {
				ivjLblFilename = new javax.swing.JLabel();
				ivjLblFilename.setName("LblFilename");
				ivjLblFilename.setToolTipText("");
				ivjLblFilename.setText(resMetaObjectFileDialog.getString("LblFilename_text"));
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblFilename;
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
				ivjTbpGeneral.setToolTipText(resMetaObjectFileDialog.getString("TbpGeneral_toolTipText"));
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
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtFilename() {
		if (ivjTxtFilename == null) {
			try {
				ivjTxtFilename = new javax.swing.JTextField();
				ivjTxtFilename.setName("TxtFilename");
				ivjTxtFilename.setToolTipText(resMetaObjectFileDialog.getString("TxtFilename_toolTipText"));
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtFilename;
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
		getBtnFileSearch().addActionListener(ivjEventHandler);
		getTxtFilename().addFocusListener(ivjEventHandler);
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("ContractSpecificationDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(426, 230);
			setTitle("MetaObjectFile (Spezifikation)");
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
	 * 
	 * @see okPressed()
	 * @see applyPressed
	 */
	protected boolean save() {
		// name is NON-NLS here
		metaObjectFile
				.setName(new ch.ehi.basics.types.NlsString(metaObjectFile.getName(), "", getTxtFilename().getText()));//$NON-NLS-1$
		getPnlDescription().getObject();

		return super.save();
	}

	/**
	 * Map model to view.
	 */
	private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
		metaObjectFile = (ch.ehi.interlis.metaobjects.MetaObjectFile) element;

		// general & page Description
		// name is NON-NLS here
		getTxtFilename().setText(metaObjectFile.getName().getValue(""));//$NON-NLS-1$
		getPnlDescription().setObject(metaObjectFile);
	}
}
