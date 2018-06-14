package ch.ehi.umleditor.application;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import ch.softenvironment.view.BaseDialog;

public class Documentation extends BaseDialog  {
	
	private static final long serialVersionUID = -4771203121843036504L;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	
	private javax.swing.JLabel ivjLblVersionControl = null;
	private javax.swing.JLabel ivjLblDate = null;
	public javax.swing.JTextField ivjTxtDate = null;
	private javax.swing.JLabel ivjLblAuthor = null;
	public javax.swing.JTextField ivjTxtAuthor = null;
	private javax.swing.JLabel ivjLblVersion = null;
	public javax.swing.JTextField ivjTxtVersion = null;
	private javax.swing.JLabel ivjLblChanges = null;
	public javax.swing.JTextField ivjTxtChanges = null;
				
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	
	class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == Documentation.this.getBtnCancel())
				connEtoC1(e);
			if (e.getSource() == Documentation.this.getBtnOk())
				connEtoC2(e);
		};
	};
	
	protected Documentation(Component owner, boolean modal) {
		super(owner, modal);
		initialize();
		addEscapeKey();
	}
	
	public Documentation(java.awt.Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		initialize();
		if (title != null) {
			setTitle(title);
		}
		show();
	}
	
	/**
	 * Handle escape key to close the dialog
	 */
	 private void addEscapeKey() {
		 
		 KeyStroke escape = KeyStroke.getKeyStroke (KeyEvent.VK_ESCAPE, 0, false);
		 Action escapeAction = new AbstractAction() {
			
			private static final long serialVersionUID = 1410051176024257413L;

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
		 * Initialize the class.
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private void initialize() {
			try {
				// user code begin {1}
				// user code end
				setName("DocumentationDialog");
				setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
				setSize(627, 504);
				setTitle("Documentation");
				setContentPane(getBaseDialogContentPane());
				initConnections();
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		
		/**
		 * Initializes connections
		 * 
		 * @exception java.lang.Exception
		 *                The exception description.
		 */
		private void initConnections() throws java.lang.Exception {
			// user code begin {1}
			// user code end
			getBtnCancel().addActionListener(ivjEventHandler);
			getBtnOk().addActionListener(ivjEventHandler);
		}
		
		
		private javax.swing.JLabel getLblVersionControl() {
			if (ivjLblVersionControl == null) {
				try {
					ivjLblVersionControl = new javax.swing.JLabel();
					ivjLblVersionControl.setName("LblVersionControl");
					ivjLblVersionControl.setText("Control de versiones:");
					//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjLblVersionControl;
		}
		
		private javax.swing.JLabel getLblDate() {
			if (ivjLblDate == null) {
				try {
					ivjLblDate = new javax.swing.JLabel();
					ivjLblDate.setName("LblDate");
					ivjLblDate.setText("Fecha:");
					//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjLblDate;
		}
		
		public javax.swing.JTextField getTxtDate() {
			if (ivjTxtDate == null) {
				try {
					ivjTxtDate = new javax.swing.JTextField();
					ivjTxtDate.setName("TxtDate");
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjTxtDate;
		}
		
		private javax.swing.JLabel getLblAuthor() {
			if (ivjLblAuthor  == null) {
				try {
					ivjLblAuthor = new javax.swing.JLabel();
					ivjLblAuthor.setName("LblAuthor");
					ivjLblAuthor.setText("Autor:");
					//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjLblAuthor;
		}
		
		public javax.swing.JTextField getTxtAuthor() {
			if (ivjTxtAuthor == null) {
				try {
					ivjTxtAuthor = new javax.swing.JTextField();
					ivjTxtAuthor.setName("TxtAuthor");
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjTxtAuthor;
		}
		
		private javax.swing.JLabel getLblVersion() {
			if (ivjLblVersion  == null) {
				try {
					ivjLblVersion = new javax.swing.JLabel();
					ivjLblVersion.setName("LblVersion");
					ivjLblVersion.setText("Version:");
					//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjLblVersion;
		}
		
		public javax.swing.JTextField getTxtVersion() {
			if (ivjTxtVersion == null) {
				try {
					ivjTxtVersion = new javax.swing.JTextField();
					ivjTxtVersion.setName("TxtAuthor");
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjTxtVersion;
		}
		
		private javax.swing.JLabel getLblChanges() {
			if (ivjLblChanges  == null) {
				try {
					ivjLblChanges = new javax.swing.JLabel();
					ivjLblChanges.setName("LblChanges");
					ivjLblChanges.setText("Cambios:");
					//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjLblChanges;
		}
		
		public javax.swing.JTextField getTxtChanges() {
			if (ivjTxtChanges == null) {
				try {
					ivjTxtChanges = new javax.swing.JTextField();
					ivjTxtChanges.setName("TxtChanges");
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjTxtChanges;
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

					java.awt.GridBagConstraints constraintsLblVersionControl = new java.awt.GridBagConstraints();
					constraintsLblVersionControl.gridx = 0;
					constraintsLblVersionControl.gridy = 0;
					constraintsLblVersionControl.ipadx = 104;
					constraintsLblVersionControl.insets = new java.awt.Insets(92, 59, 410, 51);
					getBaseDialogContentPane().add(getLblVersionControl(), constraintsLblVersionControl);
					
					java.awt.GridBagConstraints constraintsLblDate = new java.awt.GridBagConstraints();
					constraintsLblDate.gridx = 0;
					constraintsLblDate.gridy = 0;
					constraintsLblDate.ipadx = 104;
					constraintsLblDate.insets = new java.awt.Insets(138, 95, 360, 6);
					getBaseDialogContentPane().add(getLblDate(), constraintsLblDate);
					
					java.awt.GridBagConstraints constraintsTxtDate = new java.awt.GridBagConstraints();
					constraintsTxtDate.gridx = 1;
					constraintsTxtDate.gridy = 0;
					constraintsTxtDate.gridwidth = 2;
					constraintsTxtDate.fill = java.awt.GridBagConstraints.HORIZONTAL;
					constraintsTxtDate.weightx = 1.0;
					constraintsTxtDate.ipadx = 315;
					constraintsTxtDate.insets = new java.awt.Insets(137, 6, 360, 95);
					getBaseDialogContentPane().add(getTxtDate(), constraintsTxtDate);
					
					java.awt.GridBagConstraints constraintsLblAuthor = new java.awt.GridBagConstraints();
					constraintsLblAuthor.gridx = 0;
					constraintsLblAuthor.gridy = 0;
					constraintsLblAuthor.ipadx = 104;
					constraintsLblAuthor.insets = new java.awt.Insets(196, 95, 355, 6);
					getBaseDialogContentPane().add(getLblAuthor(), constraintsLblAuthor);
				
					java.awt.GridBagConstraints constraintsTxtAuthor = new java.awt.GridBagConstraints();
					constraintsTxtAuthor.gridx = 1;
					constraintsTxtAuthor.gridy = 0;
					constraintsTxtAuthor.gridwidth = 2;
					constraintsTxtAuthor.fill = java.awt.GridBagConstraints.HORIZONTAL;
					constraintsTxtAuthor.weightx = 1.0;
					constraintsTxtAuthor.ipadx = 315;
					constraintsTxtAuthor.insets = new java.awt.Insets(196, 6, 355, 95);
					getBaseDialogContentPane().add(getTxtAuthor(), constraintsTxtAuthor);
					
					java.awt.GridBagConstraints constraintsLblVersion = new java.awt.GridBagConstraints();
					constraintsLblVersion.gridx = 0;
					constraintsLblVersion.gridy = 0;
					constraintsLblVersion.ipadx = 104;
					constraintsLblVersion.insets = new java.awt.Insets(254, 95, 350, 6);
					getBaseDialogContentPane().add(getLblVersion(), constraintsLblVersion);
					
					java.awt.GridBagConstraints constraintsTxtVersion = new java.awt.GridBagConstraints();
					constraintsTxtVersion.gridx = 1;
					constraintsTxtVersion.gridy = 0;
					constraintsTxtVersion.gridwidth = 2;
					constraintsTxtVersion.fill = java.awt.GridBagConstraints.HORIZONTAL;
					constraintsTxtVersion.weightx = 1.0;
					constraintsTxtVersion.ipadx = 315;
					constraintsTxtVersion.insets = new java.awt.Insets(255, 6, 350, 95);
					getBaseDialogContentPane().add(getTxtVersion(), constraintsTxtVersion);
					
					java.awt.GridBagConstraints constraintsLblChanges = new java.awt.GridBagConstraints();
					constraintsLblChanges.gridx = 0;
					constraintsLblChanges.gridy = 0;
					constraintsLblChanges.ipadx = 104;
					constraintsLblChanges.insets = new java.awt.Insets(312, 95, 345, 6);
					getBaseDialogContentPane().add(getLblChanges(), constraintsLblChanges);
					
					java.awt.GridBagConstraints constraintsTxtChanges = new java.awt.GridBagConstraints();
					constraintsTxtChanges.gridx = 1;
					constraintsTxtChanges.gridy = 0;
					constraintsTxtChanges.gridwidth = 2;
					constraintsTxtChanges.fill = java.awt.GridBagConstraints.HORIZONTAL;
					constraintsTxtChanges.weightx = 1.0;
					constraintsTxtChanges.ipadx = 315;
					constraintsTxtChanges.insets = new java.awt.Insets(314, 6, 345, 95);
					getBaseDialogContentPane().add(getTxtChanges(), constraintsTxtChanges);
					
					java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
					constraintsBtnOk.gridx = 0;
					constraintsBtnOk.gridy = 0;
					constraintsBtnOk.ipadx = 64;
					constraintsBtnOk.insets = new java.awt.Insets(570, 95, 340, 6);
					getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

					java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
					constraintsBtnCancel.gridx = 1;
					constraintsBtnCancel.gridy = 0;
					constraintsBtnCancel.ipadx = 64;
					constraintsBtnCancel.insets = new java.awt.Insets(570, 6, 340, 15);
					getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);
					
				} catch (java.lang.Throwable ivjExc) {
					handleException(ivjExc);
				}
			}
			return ivjBaseDialogContentPane;
		}

				
		/**
		 * Return the BtnCancel property value.
		 * 
		 * @return javax.swing.JButton
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private javax.swing.JButton getBtnCancel() {
			if (ivjBtnCancel == null) {
				try {
					ivjBtnCancel = new javax.swing.JButton();
					ivjBtnCancel.setName("BtnCancel");
					// user code begin {1}
					ivjBtnCancel.setText("Cancel");
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
		 * Return the BtnOk property value.
		 * 
		 * @return javax.swing.JButton
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private javax.swing.JButton getBtnOk() {
			if (ivjBtnOk == null) {
				try {
					ivjBtnOk = new javax.swing.JButton();
					ivjBtnOk.setName("BtnOk");
					ivjBtnOk.setText("OK");
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
		 * connEtoC1: (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent)
		 * --> PackageSelectionDialog.cancelPressed()V)
		 * 
		 * @param arg1
		 *            java.awt.event.ActionEvent
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private void connEtoC1(java.awt.event.ActionEvent arg1) {
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
		 * connEtoC2: (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) -->
		 * PackageSelectionDialog.okPressed()V)
		 * 
		 * @param arg1
		 *            java.awt.event.ActionEvent
		 */
		/* WARNING: THIS METHOD WILL BE REGENERATED. */
		private void connEtoC2(java.awt.event.ActionEvent arg1) {
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
}
