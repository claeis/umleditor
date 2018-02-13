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

import ch.ehi.uml1_4.implementation.*;

/**
 * A Parameter is an Argument of Operation.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.3 $ $Date: 2004-10-01 20:01:15 $
 * @see UmlOperation
 */
public class UmlParameterDialog extends ch.softenvironment.view.BaseDialog {
	
	private static final long serialVersionUID = -5696611965125147639L;
	private ch.ehi.uml1_4.implementation.UmlParameter parameter = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JButton ivjBtnApply = null;
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JTextField ivjTxtName = null;
	private javax.swing.JButton ivjBtnReturnType = null;
	private javax.swing.JTextField ivjJTextField1 = null;
	private DescriptionPanel ivjPnlDescription = null;
	private javax.swing.JPanel ivjPnlDetail = null;
	private javax.swing.JTabbedPane ivjTbpPane = null;
	private javax.swing.JMenuItem mniMoveDownAttribute = null;
	private javax.swing.JLabel ivjLblKind = null;
	private javax.swing.JLabel ivjLblType = null;
	private InterlisSyntaxPanel ivjPnlDefault = null;
	private javax.swing.JRadioButton ivjRbtIn = null;
	private javax.swing.JRadioButton ivjRbtInOut = null;
	private javax.swing.JRadioButton ivjRbtOut = null;

	class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == UmlParameterDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == UmlParameterDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == UmlParameterDialog.this.getBtnApply())
				connEtoC3(e);
			if (e.getSource() == UmlParameterDialog.this.getBtnReturnType())
				connEtoC4(e);
		};
	};

	/**
	 * Constructor
	 * 
	 * @param owner
	 * @param element
	 *            to be displayed
	 */
	public UmlParameterDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
		super(owner, true);
		initialize();
		addEscapeKey();
		addUndoRedo(getTxtName(),getJTextField1());
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
			
			private static final long serialVersionUID = 8829495523917981954L;

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
	 * Comment
	 */
	private void btnReturnType() {
		LauncherView.getInstance().nyi("Assignment of <Type>");
	}

	/**
	 * connEtoC1: (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) -->
	 * OperationDialog.okPressed()V)
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
	 * --> OperationDialog.cancelPressed()V)
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
	 * --> OperationDialog.applyPressed()V)
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
	 * (BtnReturnType.action.actionPerformed(java.awt.event.ActionEvent) -->
	 * OperationDialog.btnReturnType()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC4(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.btnReturnType();
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
				constraintsLblName.ipadx = 104;
				constraintsLblName.insets = new java.awt.Insets(16, 10, 7, 5);
				getBaseDialogContentPane().add(getLblName(), constraintsLblName);

				java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
				constraintsTxtName.gridx = 2;
				constraintsTxtName.gridy = 1;
				constraintsTxtName.gridwidth = 2;
				constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtName.weightx = 1.0;
				constraintsTxtName.ipadx = 410;
				constraintsTxtName.insets = new java.awt.Insets(13, 5, 4, 4);
				getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 1;
				constraintsBtnOk.gridy = 4;
				constraintsBtnOk.ipadx = 56;
				constraintsBtnOk.insets = new java.awt.Insets(9, 25, 13, 23);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

				java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
				constraintsBtnCancel.gridx = 2;
				constraintsBtnCancel.gridy = 4;
				constraintsBtnCancel.ipadx = 10;
				constraintsBtnCancel.insets = new java.awt.Insets(9, 11, 13, 61);
				getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

				java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
				constraintsBtnApply.gridx = 3;
				constraintsBtnApply.gridy = 4;
				constraintsBtnApply.insets = new java.awt.Insets(9, 62, 13, 75);
				getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

				java.awt.GridBagConstraints constraintsTbpPane = new java.awt.GridBagConstraints();
				constraintsTbpPane.gridx = 1;
				constraintsTbpPane.gridy = 3;
				constraintsTbpPane.gridwidth = 4;
				constraintsTbpPane.fill = java.awt.GridBagConstraints.BOTH;
				constraintsTbpPane.weightx = 1.0;
				constraintsTbpPane.weighty = 1.0;
				constraintsTbpPane.ipadx = 312;
				constraintsTbpPane.ipady = 166;
				constraintsTbpPane.insets = new java.awt.Insets(8, 9, 8, 8);
				getBaseDialogContentPane().add(getTbpPane(), constraintsTbpPane);

				java.awt.GridBagConstraints constraintsLblType = new java.awt.GridBagConstraints();
				constraintsLblType.gridx = 1;
				constraintsLblType.gridy = 2;
				constraintsLblType.ipadx = 110;
				constraintsLblType.insets = new java.awt.Insets(6, 10, 16, 5);
				getBaseDialogContentPane().add(getLblType(), constraintsLblType);

				java.awt.GridBagConstraints constraintsJTextField1 = new java.awt.GridBagConstraints();
				constraintsJTextField1.gridx = 2;
				constraintsJTextField1.gridy = 2;
				constraintsJTextField1.gridwidth = 2;
				constraintsJTextField1.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsJTextField1.weightx = 1.0;
				constraintsJTextField1.ipadx = 410;
				constraintsJTextField1.insets = new java.awt.Insets(6, 5, 10, 4);
				getBaseDialogContentPane().add(getJTextField1(), constraintsJTextField1);

				java.awt.GridBagConstraints constraintsBtnReturnType = new java.awt.GridBagConstraints();
				constraintsBtnReturnType.gridx = 4;
				constraintsBtnReturnType.gridy = 2;
				constraintsBtnReturnType.insets = new java.awt.Insets(4, 5, 7, 12);
				getBaseDialogContentPane().add(getBtnReturnType(), constraintsBtnReturnType);
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
	 * Return the BtnReturnType property value.
	 * 
	 * @return javax.swing.JButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JButton getBtnReturnType() {
		if (ivjBtnReturnType == null) {
			try {
				ivjBtnReturnType = new javax.swing.JButton();
				ivjBtnReturnType.setName("BtnReturnType");
				ivjBtnReturnType.setText("...");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjBtnReturnType;
	}

	/**
	 * Return the JTextField1 property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getJTextField1() {
		if (ivjJTextField1 == null) {
			try {
				ivjJTextField1 = new javax.swing.JTextField();
				ivjJTextField1.setName("JTextField1");
				ivjJTextField1.setEditable(false);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjJTextField1;
	}

	/**
	 * Return the LblConcurrency property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblKind() {
		if (ivjLblKind == null) {
			try {
				ivjLblKind = new javax.swing.JLabel();
				ivjLblKind.setName("LblKind");
				ivjLblKind.setText("Kind:");
				ivjLblKind.setBounds(12, 18, 124, 14);
				// user code begin {1}
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
	 * Return the LblName property value.
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
	 * Return the LblReturnValue property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblType() {
		if (ivjLblType == null) {
			try {
				ivjLblType = new javax.swing.JLabel();
				ivjLblType.setName("LblType");
				ivjLblType.setText("Type:");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblType;
	}

	/**
	 * Return the PnlDefault property value.
	 * 
	 * @return ch.ehi.umleditor.application.InterlisSyntaxPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private InterlisSyntaxPanel getPnlDefault() {
		if (ivjPnlDefault == null) {
			try {
				ivjPnlDefault = new ch.ehi.umleditor.application.InterlisSyntaxPanel();
				ivjPnlDefault.setName("PnlDefault");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlDefault;
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
	 * Return the PnlDetail property value.
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getPnlDetail() {
		if (ivjPnlDetail == null) {
			try {
				ivjPnlDetail = new javax.swing.JPanel();
				ivjPnlDetail.setName("PnlDetail");
				ivjPnlDetail.setLayout(null);
				getPnlDetail().add(getLblKind(), getLblKind().getName());
				getPnlDetail().add(getRbtIn(), getRbtIn().getName());
				getPnlDetail().add(getRbtOut(), getRbtOut().getName());
				getPnlDetail().add(getRbtInOut(), getRbtInOut().getName());
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
	 * Return the RbtSequential property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtIn() {
		if (ivjRbtIn == null) {
			try {
				ivjRbtIn = new javax.swing.JRadioButton();
				ivjRbtIn.setName("RbtIn");
				ivjRbtIn.setText("In");
				ivjRbtIn.setBounds(158, 14, 120, 22);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtIn;
	}

	/**
	 * Return the RbtConcurrent property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtInOut() {
		if (ivjRbtInOut == null) {
			try {
				ivjRbtInOut = new javax.swing.JRadioButton();
				ivjRbtInOut.setName("RbtInOut");
				ivjRbtInOut.setText("In/Out");
				ivjRbtInOut.setBounds(158, 62, 120, 22);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtInOut;
	}

	/**
	 * Return the RbtGuarded property value.
	 * 
	 * @return javax.swing.JRadioButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JRadioButton getRbtOut() {
		if (ivjRbtOut == null) {
			try {
				ivjRbtOut = new javax.swing.JRadioButton();
				ivjRbtOut.setName("RbtOut");
				ivjRbtOut.setText("Out");
				ivjRbtOut.setBounds(158, 38, 120, 22);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjRbtOut;
	}

	/**
	 * Return the TbpPane property value.
	 * 
	 * @return javax.swing.JTabbedPane
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTabbedPane getTbpPane() {
		if (ivjTbpPane == null) {
			try {
				ivjTbpPane = new javax.swing.JTabbedPane();
				ivjTbpPane.setName("TbpPane");
				ivjTbpPane.insertTab("Description", null, getPnlDescription(), null, 0);
				ivjTbpPane.insertTab("Detail", null, getPnlDetail(), null, 1);
				ivjTbpPane.insertTab("Default value", null, getPnlDefault(), null, 2);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTbpPane;
	}

	/**
	 * Return the TxtName property value.
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
		getBtnReturnType().addActionListener(ivjEventHandler);
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("ParameterDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(638, 377);
			setTitle("Parameter");
			setContentPane(getBaseDialogContentPane());
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		// setTitle(resources.getString("CTDialog"));
		javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
		group.add(getRbtIn());
		group.add(getRbtOut());
		group.add(getRbtInOut());
		// user code end
	}

	/**
	 * Update Model.
	 * 
	 * @see okPressed()
	 * @see applyPressed
	 */
	protected boolean save() {
		if (!ElementUtils.trySetName(parameter, getTxtName().getText())) {
			return false;
		}

		getPnlDescription().getObject();

		// page details
		if (getRbtIn().isSelected()) {
			parameter.setKind(ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.IN);
		} else if (getRbtOut().isSelected()) {
			parameter.setKind(ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.OUT);
		} else {
			parameter.setKind(ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.INOUT);
		}

		// parameter.attachBehavioralFeature(..ABORT;

		// default value
		/*
		 * if (getPnlDefault().getSyntax() == null) {
		 * parameter.setDefaultValue(null); } else { Expression expression =
		 * null; if (parameter.getDefaultValue() == null) { expression = new
		 * Expression(); } else { expression = parameter.getDefaultValue(); }
		 * expression.setBody(getPnlDefault().getSyntax()); }
		 */
		return super.save();
	}

	/**
	 * Map model to view.
	 */
	private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
		parameter = (UmlParameter) element;

		// general & page Description
		getTxtName().setText(parameter.getDefLangName());
		getPnlDescription().setObject(element);

		// page Details
		switch (parameter.getKind()) {
		case ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.IN:
			getRbtIn().setSelected(true);
			break;
		case ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.OUT:
			getRbtOut().setSelected(true);
			break;
		case ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.INOUT:
			getRbtInOut().setSelected(true);
			break;
		}
		// parameter.getBehavioralFeature().getOwner())
		getTbpPane().remove(getPnlDefault()); // @see save();
	}
}
