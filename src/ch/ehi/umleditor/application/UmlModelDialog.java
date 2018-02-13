package ch.ehi.umleditor.application;

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
 * User Interface for a UmlModel.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:02 $
 */
public class UmlModelDialog extends BaseDialog {
	
	private static final long serialVersionUID = 3946204899418170851L;
	// ModelElement
	private static java.util.ResourceBundle resUmlModelDialog = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/UmlModelDialog"); //$NON-NLS-1$
	ch.ehi.uml1_4.implementation.UmlModel umlModel = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JTabbedPane ivjTbpGeneral = null;
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JButton ivjBtnApply = null;
	private javax.swing.JLabel ivjLblName1 = null;
	private DescriptionPanel ivjPnlDescription = null;
	private javax.swing.JTextField ivjTxtAuthor = null;
	private javax.swing.JTextField ivjTxtVersion = null;

	class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == UmlModelDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == UmlModelDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == UmlModelDialog.this.getBtnApply())
				connEtoC3(e);
		};

		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == UmlModelDialog.this.getTxtAuthor())
				connEtoM1(e);
			if (e.getSource() == UmlModelDialog.this.getTxtVersion())
				connEtoM2(e);
		};

		public void focusLost(java.awt.event.FocusEvent e) {
		};
	};

	/**
	 * Constructor
	 */
	public UmlModelDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
		super(owner, true);
		initialize();
		addEscapeKey();
		addUndoRedo(getTxtAuthor(),getTxtVersion());
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
			
			private static final long serialVersionUID = -5792395685460657532L;

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
	 * connEtoM1: (TxtAuthor.focus.focusGained(java.awt.event.FocusEvent) -->
	 * TxtAuthor.selectAll()V)
	 * 
	 * @param arg1
	 *            java.awt.event.FocusEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoM1(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtAuthor().selectAll();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoM2: (TxtVersion.focus.focusGained(java.awt.event.FocusEvent) -->
	 * TxtVersion.selectAll()V)
	 * 
	 * @param arg1
	 *            java.awt.event.FocusEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoM2(java.awt.event.FocusEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			getTxtVersion().selectAll();
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
				constraintsLblName.ipadx = 44;
				constraintsLblName.insets = new java.awt.Insets(22, 15, 6, 4);
				getBaseDialogContentPane().add(getLblName(), constraintsLblName);

				java.awt.GridBagConstraints constraintsTxtAuthor = new java.awt.GridBagConstraints();
				constraintsTxtAuthor.gridx = 2;
				constraintsTxtAuthor.gridy = 1;
				constraintsTxtAuthor.gridwidth = 3;
				constraintsTxtAuthor.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtAuthor.weightx = 1.0;
				constraintsTxtAuthor.ipadx = 299;
				constraintsTxtAuthor.insets = new java.awt.Insets(19, 4, 3, 15);
				getBaseDialogContentPane().add(getTxtAuthor(), constraintsTxtAuthor);

				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 1;
				constraintsBtnOk.gridy = 4;
				constraintsBtnOk.gridwidth = 2;
				constraintsBtnOk.ipadx = 64;
				constraintsBtnOk.insets = new java.awt.Insets(3, 23, 19, 3);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

				java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
				constraintsBtnCancel.gridx = 3;
				constraintsBtnCancel.gridy = 4;
				constraintsBtnCancel.ipadx = 18;
				constraintsBtnCancel.insets = new java.awt.Insets(3, 3, 19, 3);
				getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

				java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
				constraintsBtnApply.gridx = 4;
				constraintsBtnApply.gridy = 4;
				constraintsBtnApply.ipadx = 8;
				constraintsBtnApply.insets = new java.awt.Insets(3, 3, 19, 46);
				getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

				java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
				constraintsTbpGeneral.gridx = 1;
				constraintsTbpGeneral.gridy = 3;
				constraintsTbpGeneral.gridwidth = 4;
				constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
				constraintsTbpGeneral.weightx = 1.0;
				constraintsTbpGeneral.weighty = 1.0;
				constraintsTbpGeneral.ipadx = 376;
				constraintsTbpGeneral.ipady = 67;
				constraintsTbpGeneral.insets = new java.awt.Insets(5, 10, 3, 9);
				getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

				java.awt.GridBagConstraints constraintsLblName1 = new java.awt.GridBagConstraints();
				constraintsLblName1.gridx = 1;
				constraintsLblName1.gridy = 2;
				constraintsLblName1.ipadx = 38;
				constraintsLblName1.insets = new java.awt.Insets(6, 15, 7, 4);
				getBaseDialogContentPane().add(getLblName1(), constraintsLblName1);

				java.awt.GridBagConstraints constraintsTxtVersion = new java.awt.GridBagConstraints();
				constraintsTxtVersion.gridx = 2;
				constraintsTxtVersion.gridy = 2;
				constraintsTxtVersion.gridwidth = 3;
				constraintsTxtVersion.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtVersion.weightx = 1.0;
				constraintsTxtVersion.ipadx = 299;
				constraintsTxtVersion.insets = new java.awt.Insets(3, 4, 4, 15);
				getBaseDialogContentPane().add(getTxtVersion(), constraintsTxtVersion);
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
				ivjLblName.setText(resUmlModelDialog.getString("LblName_text"));
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
	 * Return the LblName1 property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblName1() {
		if (ivjLblName1 == null) {
			try {
				ivjLblName1 = new javax.swing.JLabel();
				ivjLblName1.setName("LblName1");
				ivjLblName1.setText(resUmlModelDialog.getString("LblVersion_text"));
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblName1;
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
	private javax.swing.JTextField getTxtAuthor() {
		if (ivjTxtAuthor == null) {
			try {
				ivjTxtAuthor = new javax.swing.JTextField();
				ivjTxtAuthor.setName("TxtAuthor");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtAuthor;
	}

	/**
	 * Return the TxtName1 property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtVersion() {
		if (ivjTxtVersion == null) {
			try {
				ivjTxtVersion = new javax.swing.JTextField();
				ivjTxtVersion.setName("TxtVersion");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtVersion;
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
		getTxtAuthor().addFocusListener(ivjEventHandler);
		getTxtVersion().addFocusListener(ivjEventHandler);
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("UmlModelSpecificationDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(426, 243);
			setTitle(resUmlModelDialog.getString("CTDialog"));
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
		umlModel.setAuthor(getTxtAuthor().getText());
		umlModel.setVersion(getTxtVersion().getText());

		getPnlDescription().getObject();

		return super.save();
	}

	/**
	 * Map model to view.
	 */
	private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
		umlModel = (ch.ehi.uml1_4.implementation.UmlModel) element;

		getTxtAuthor().setText(umlModel.getAuthor());
		getTxtVersion().setText(umlModel.getVersion());

		getPnlDescription().setObject(element);
	}
}
