package ch.ehi.umleditor.application;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import ch.softenvironment.view.BaseDialog;

public class OrganizationDialog extends BaseDialog  {
	
	private static final long serialVersionUID = 4784616198924585960L;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JLabel ivjLblOrganization = null;
	public javax.swing.JTextField ivjTxtOrganization = null;
	private javax.swing.JLabel ivjLblPosition = null;
	public javax.swing.JTextField ivjTxtPosition = null;
	private javax.swing.JLabel ivjLblKind = null;
	public javax.swing.JTextField ivjTxtKind = null;
	private javax.swing.JLabel ivjLblAddress = null;
	public javax.swing.JTextField ivjTxtAddress = null;
	private javax.swing.JLabel ivjLblCity = null;
	public javax.swing.JTextField ivjTxtCity = null;
	private javax.swing.JLabel ivjLblState = null;
	public javax.swing.JTextField ivjTxtState = null;
	private javax.swing.JLabel ivjLblCountry = null;
	public javax.swing.JTextField ivjTxtCountry = null;
	private javax.swing.JLabel ivjLblPhone = null;
	public javax.swing.JTextField ivjTxtPhone = null;
	
		 
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	
	class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == OrganizationDialog.this.getBtnCancel())
				connEtoC1(e);
			if (e.getSource() == OrganizationDialog.this.getBtnOk())
				connEtoC2(e);
		};
		
		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == OrganizationDialog.this.getTxtAddress())
				connEtoM1(e);
			if (e.getSource() == OrganizationDialog.this.getTxtCity())
				connEtoM2(e);
			if (e.getSource() == OrganizationDialog.this.getTxtCountry())
				connEtoM3(e);
			if (e.getSource() == OrganizationDialog.this.getTxtKind())
				connEtoM4(e);
			if (e.getSource() == OrganizationDialog.this.getTxtOrganization())
				connEtoM5(e);
			if (e.getSource() == OrganizationDialog.this.getTxtPhone())
				connEtoM6(e);
			if (e.getSource() == OrganizationDialog.this.getTxtPosition())
				connEtoM7(e);
			if (e.getSource() == OrganizationDialog.this.getTxtState())
				connEtoM8(e);
		};
		
		public void focusLost(java.awt.event.FocusEvent e) {
		};
		
	};

	protected OrganizationDialog(Component owner, boolean modal) {
		super(owner, modal);
		initialize();
		addEscapeKey();
		addUndoRedo(getTxtAddress(), getTxtCity(), getTxtCountry(), getTxtKind(), getTxtOrganization(), getTxtPhone(), getTxtPosition(), getTxtPosition(), getTxtState());
		setRelativeLocation(owner);
	}
	public OrganizationDialog(java.awt.Frame owner, String title, boolean modal) {
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
	  * Handle Ctrl+z and Ctrl+y to Undo/Redo text
	  * @param textcomp
	  */
	 private void addUndoRedo(JTextComponent... textcomp) {
		
		 for(int i=0;i<textcomp.length;i++){
			 final UndoManager undo = new UndoManager();
				 Document doc = textcomp[i].getDocument();
			    
			   // Listen for undo and redo events
			   doc.addUndoableEditListener(new UndoableEditListener() {
			       public void undoableEditHappened(UndoableEditEvent evt) {
			           undo.addEdit(evt.getEdit());
			       }
			   });
			    
			   // Create an undo action and add it to the text component
			   textcomp[i].getActionMap().put("Undo",
			       new AbstractAction("Undo") {
			           public void actionPerformed(ActionEvent evt) {
			               try {
			                   if (undo.canUndo()) {
			                       undo.undo();
			                   }
			               } catch (CannotUndoException e) {
			               }
			           }
			      });
			    
			   // Bind the undo action to ctl-Z
			   textcomp[i].getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");
			    
			   // Create a redo action and add it to the text component
			   textcomp[i].getActionMap().put("Redo",
			       new AbstractAction("Redo") {
			           public void actionPerformed(ActionEvent evt) {
			               try {
			                   if (undo.canRedo()) {
			                       undo.redo();
			                   }
			               } catch (CannotRedoException e) {
			               }
			           }
			       });
			    
			   // Bind the redo action to ctl-Y
			   textcomp[i].getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
		 }
	 }
	 
	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("OrganizationDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(627, 504);
			setTitle("Organization");
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
		getTxtAddress().addActionListener(ivjEventHandler);
		getTxtCity().addActionListener(ivjEventHandler);
		getTxtCountry().addActionListener(ivjEventHandler);
		getTxtKind().addActionListener(ivjEventHandler);
		getTxtOrganization().addActionListener(ivjEventHandler);
		getTxtPhone().addActionListener(ivjEventHandler);
		getTxtPosition().addActionListener(ivjEventHandler);
		getTxtState().addActionListener(ivjEventHandler);
		
		getBtnCancel().addActionListener(ivjEventHandler);
		getBtnOk().addActionListener(ivjEventHandler);
	}
	
	private javax.swing.JLabel getLblOrganization() {
		if (ivjLblOrganization == null) {
			try {
				ivjLblOrganization = new javax.swing.JLabel();
				ivjLblOrganization.setName("LblOrganization");
				ivjLblOrganization.setText("Entidad:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				
				handleException(ivjExc);
			}
		}
		return ivjLblOrganization;
	}
	
	public javax.swing.JTextField getTxtOrganization() {
		if (ivjTxtOrganization == null) {
			try {
				ivjTxtOrganization = new javax.swing.JTextField();
				ivjTxtOrganization.setName("TxtOrganization");
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjTxtOrganization;
	}
	
	private javax.swing.JLabel getLblPosition() {
		if (ivjLblPosition == null) {
			try {
				ivjLblPosition = new javax.swing.JLabel();
				ivjLblPosition.setName("LblPosition");
				ivjLblPosition.setText("Cargo:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				
				handleException(ivjExc);
			}
		}
		return ivjLblPosition;
	}
	
	public javax.swing.JTextField getTxtPosition() {
		if (ivjTxtPosition == null) {
			try {
				ivjTxtPosition = new javax.swing.JTextField();
				ivjTxtPosition.setName("TxtPosition");
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjTxtPosition;
	}
	
	private javax.swing.JLabel getLblKind() {
		if (ivjLblKind == null) {
			try {
				ivjLblKind = new javax.swing.JLabel();
				ivjLblKind.setName("LblKind");
				ivjLblKind.setText("Tipo:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				
				handleException(ivjExc);
			}
		}
		return ivjLblKind;
	}
	
	public javax.swing.JTextField getTxtKind() {
		if (ivjTxtKind == null) {
			try {
				ivjTxtKind = new javax.swing.JTextField();
				ivjTxtKind.setName("TxtKind");
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjTxtKind;
	}
	
	private javax.swing.JLabel getLblAddress() {
		if (ivjLblAddress == null) {
			try {
				ivjLblAddress = new javax.swing.JLabel();
				ivjLblAddress.setName("LblAddress");
				ivjLblAddress.setText("Dirección:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				
				handleException(ivjExc);
			}
		}
		return ivjLblAddress;
	}
	
	public javax.swing.JTextField getTxtAddress() {
		if (ivjTxtAddress == null) {
			try {
				ivjTxtAddress = new javax.swing.JTextField();
				ivjTxtAddress.setName("TxtAddress");
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjTxtAddress;
	}
	
	private javax.swing.JLabel getLblCity() {
		if (ivjLblCity == null) {
			try {
				ivjLblCity = new javax.swing.JLabel();
				ivjLblCity.setName("LblCity");
				ivjLblCity.setText("Ciudad:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				
				handleException(ivjExc);
			}
		}
		return ivjLblCity;
	}
	
	public javax.swing.JTextField getTxtCity() {
		if (ivjTxtCity == null) {
			try {
				ivjTxtCity = new javax.swing.JTextField();
				ivjTxtCity.setName("TxtCity");
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjTxtCity;
	}
	
	private javax.swing.JLabel getLblState() {
		if (ivjLblState == null) {
			try {
				ivjLblState = new javax.swing.JLabel();
				ivjLblState.setName("LblState");
				ivjLblState.setText("Departamento:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				
				handleException(ivjExc);
			}
		}
		return ivjLblState;
	}
	
	public javax.swing.JTextField getTxtState() {
		if (ivjTxtState == null) {
			try {
				ivjTxtState = new javax.swing.JTextField();
				ivjTxtState.setName("TxtState");
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjTxtState;
	}
	
	private javax.swing.JLabel getLblCountry() {
		if (ivjLblCountry == null) {
			try {
				ivjLblCountry = new javax.swing.JLabel();
				ivjLblCountry.setName("LblCountry");
				ivjLblCountry.setText("País:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				
				handleException(ivjExc);
			}
		}
		return ivjLblCountry;
	}
	
	public javax.swing.JTextField getTxtCountry() {
		if (ivjTxtCountry == null) {
			try {
				ivjTxtCountry = new javax.swing.JTextField();
				ivjTxtCountry.setName("TxtCountry");
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjTxtCountry;
	}
	
	private javax.swing.JLabel getLblPhone() {
		if (ivjLblPhone == null) {
			try {
				ivjLblPhone = new javax.swing.JLabel();
				ivjLblPhone.setName("LblPhone");
				ivjLblPhone.setText("Teléfono:");
				//ivjLblOrganization.setText(resClassDefDialog.getString("LblName_text"));
			} catch (java.lang.Throwable ivjExc) {
				
				handleException(ivjExc);
			}
		}
		return ivjLblPhone;
	}
	
	public javax.swing.JTextField getTxtPhone() {
		if (ivjTxtPhone == null) {
			try {
				ivjTxtPhone = new javax.swing.JTextField();
				ivjTxtPhone.setName("TxtPhone");
			} catch (java.lang.Throwable ivjExc) {
				handleException(ivjExc);
			}
		}
		return ivjTxtPhone;
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

				java.awt.GridBagConstraints constraintsLblOrganization = new java.awt.GridBagConstraints();
				constraintsLblOrganization.gridx = 0;
				constraintsLblOrganization.gridy = 0;
				constraintsLblOrganization.ipadx = 50;
				constraintsLblOrganization.insets = new java.awt.Insets(12, 19, 370, 11);
				getBaseDialogContentPane().add(getLblOrganization(), constraintsLblOrganization);

				java.awt.GridBagConstraints constraintsTxtOrganization = new java.awt.GridBagConstraints();
				constraintsTxtOrganization.gridx = 1;
				constraintsTxtOrganization.gridy = 0;
				constraintsTxtOrganization.gridwidth = 2;
				constraintsTxtOrganization.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtOrganization.weightx = 1.0;
				constraintsTxtOrganization.ipadx = 55;
				constraintsTxtOrganization.insets = new java.awt.Insets(19, 2, 370, 95);
				getBaseDialogContentPane().add(getTxtOrganization(), constraintsTxtOrganization);

				java.awt.GridBagConstraints constraintsLblPosition = new java.awt.GridBagConstraints();
				constraintsLblPosition.gridx = 0;
				constraintsLblPosition.gridy = 0;
				constraintsLblPosition.ipadx = 104;
				constraintsLblPosition.insets = new java.awt.Insets(80, 58, 365, 9);
				getBaseDialogContentPane().add(getLblPosition(), constraintsLblPosition);

				java.awt.GridBagConstraints constraintsTxtPosition = new java.awt.GridBagConstraints();
				constraintsTxtPosition.gridx = 1;
				constraintsTxtPosition.gridy = 0;
				constraintsTxtPosition.gridwidth = 2;
				constraintsTxtPosition.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtPosition.weightx = 1.0;
				constraintsTxtPosition.ipadx = 315;
				constraintsTxtPosition.insets = new java.awt.Insets(78, 6, 365, 95);
				getBaseDialogContentPane().add(getTxtPosition(), constraintsTxtPosition);

				java.awt.GridBagConstraints constraintsLblKind = new java.awt.GridBagConstraints();
				constraintsLblKind.gridx = 0;
				constraintsLblKind.gridy = 0;
				constraintsLblKind.ipadx = 104;
				constraintsLblKind.insets = new java.awt.Insets(138, 50, 360, 9);
				getBaseDialogContentPane().add(getLblKind(), constraintsLblKind);

				java.awt.GridBagConstraints constraintsTxtKind = new java.awt.GridBagConstraints();
				constraintsTxtKind.gridx = 1;
				constraintsTxtKind.gridy = 0;
				constraintsTxtKind.gridwidth = 2;
				constraintsTxtKind.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtKind.weightx = 1.0;
				constraintsTxtKind.ipadx = 315;
				constraintsTxtKind.insets = new java.awt.Insets(137, 6, 360, 95);
				getBaseDialogContentPane().add(getTxtKind(), constraintsTxtKind);				
				
				java.awt.GridBagConstraints constraintsLblAddress = new java.awt.GridBagConstraints();
				constraintsLblAddress.gridx = 0;
				constraintsLblAddress.gridy = 0;
				constraintsLblAddress.ipadx = 104;
				constraintsLblAddress.insets = new java.awt.Insets(196, 72, 355, 6);
				getBaseDialogContentPane().add(getLblAddress(), constraintsLblAddress);

				java.awt.GridBagConstraints constraintsTxtAddress = new java.awt.GridBagConstraints();
				constraintsTxtAddress.gridx = 1;
				constraintsTxtAddress.gridy = 0;
				constraintsTxtAddress.gridwidth = 2;
				constraintsTxtAddress.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtAddress.weightx = 1.0;
				constraintsTxtAddress.ipadx = 315;
				constraintsTxtAddress.insets = new java.awt.Insets(196, 6, 355, 95);
				getBaseDialogContentPane().add(getTxtAddress(), constraintsTxtAddress);
				
				java.awt.GridBagConstraints constraintsLblCity = new java.awt.GridBagConstraints();
				constraintsLblCity.gridx = 0;
				constraintsLblCity.gridy = 0;
				constraintsLblCity.ipadx = 104;
				constraintsLblCity.insets = new java.awt.Insets(254, 56, 350, 6);
				getBaseDialogContentPane().add(getLblCity(), constraintsLblCity);

				java.awt.GridBagConstraints constraintsTxtCity = new java.awt.GridBagConstraints();
				constraintsTxtCity.gridx = 1;
				constraintsTxtCity.gridy = 0;
				constraintsTxtCity.gridwidth = 2;
				constraintsTxtCity.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtCity.weightx = 1.0;
				constraintsTxtCity.ipadx = 315;
				constraintsTxtCity.insets = new java.awt.Insets(255, 6, 350, 95);
				getBaseDialogContentPane().add(getTxtCity(), constraintsTxtCity);
				
				java.awt.GridBagConstraints constraintsLblState = new java.awt.GridBagConstraints();
				constraintsLblState.gridx = 0;
				constraintsLblState.gridy = 0;
				constraintsLblState.ipadx = 104;
				constraintsLblState.insets = new java.awt.Insets(312, 92, 345, 6);
				getBaseDialogContentPane().add(getLblState(), constraintsLblState);

				java.awt.GridBagConstraints constraintsTxtState = new java.awt.GridBagConstraints();
				constraintsTxtState.gridx = 1;
				constraintsTxtState.gridy = 0;
				constraintsTxtState.gridwidth = 2;
				constraintsTxtState.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtState.weightx = 1.0;
				constraintsTxtState.ipadx = 315;
				constraintsTxtState.insets = new java.awt.Insets(314, 6, 345, 95);
				getBaseDialogContentPane().add(getTxtState(), constraintsTxtState);
				
				java.awt.GridBagConstraints constraintsLblCountry = new java.awt.GridBagConstraints();
				constraintsLblCountry.gridx = 0;
				constraintsLblCountry.gridy = 0;
				constraintsLblCountry.ipadx = 104;
				constraintsLblCountry.insets = new java.awt.Insets(370, 50, 340, 6);
				getBaseDialogContentPane().add(getLblCountry(), constraintsLblCountry);

				java.awt.GridBagConstraints constraintsTxtCountry = new java.awt.GridBagConstraints();
				constraintsTxtCountry.gridx = 1;
				constraintsTxtCountry.gridy = 0;
				constraintsTxtCountry.gridwidth = 2;
				constraintsTxtCountry.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtCountry.weightx = 1.0;
				constraintsTxtCountry.ipadx = 315;
				constraintsTxtCountry.insets = new java.awt.Insets(373, 6, 340, 95);
				getBaseDialogContentPane().add(getTxtCountry(), constraintsTxtCountry);
				
				java.awt.GridBagConstraints constraintsLblPhone = new java.awt.GridBagConstraints();
				constraintsLblPhone.gridx = 0;
				constraintsLblPhone.gridy = 0;
				constraintsLblPhone.ipadx = 104;
				constraintsLblPhone.insets = new java.awt.Insets(428, 58, 335, 6);
				getBaseDialogContentPane().add(getLblPhone(), constraintsLblPhone);

				java.awt.GridBagConstraints constraintsTxtPhone = new java.awt.GridBagConstraints();
				constraintsTxtPhone.gridx = 1;
				constraintsTxtPhone.gridy = 0;
				constraintsTxtPhone.gridwidth = 2;
				constraintsTxtPhone.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtPhone.weightx = 1.0;
				constraintsTxtPhone.ipadx = 315;
				constraintsTxtPhone.insets = new java.awt.Insets(432, 6, 335, 95);
				getBaseDialogContentPane().add(getTxtPhone(), constraintsTxtPhone);
				
				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 0;
				constraintsBtnOk.gridy = 0;
				constraintsBtnOk.ipadx = 64;
				constraintsBtnOk.insets = new java.awt.Insets(430, 32, 3, 10);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);


			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
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
			this.okPressed();
			//dialog.setDefaultCloseOperation(dialog.DISPOSE_ON_CLOSE);
			
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
	}
	
	private void connEtoM1(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtAddress().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}
	
	private void connEtoM2(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtCity().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}
	
	private void connEtoM3(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtCountry().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}
	
	private void connEtoM4(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtKind().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}
	
	private void connEtoM5(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtOrganization().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}
	
	private void connEtoM6(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtPhone().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}
	
	private void connEtoM7(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtPosition().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	private void connEtoM8(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtState().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}
	
	protected void handleException(java.lang.Throwable exception) {
		super.handleException(exception);
	}
}
