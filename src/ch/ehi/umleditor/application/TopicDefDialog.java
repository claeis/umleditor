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
import java.util.EventObject;

import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.softenvironment.view.*;

/**
 * User Interface for a TopicDef.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.6 $ $Date: 2005-11-20 16:43:58 $
 */
public class TopicDefDialog extends BaseDialog implements ListMenuChoice {
	
	private static final long serialVersionUID = 7159933891060976398L;
	// ModelElement
	private static java.util.ResourceBundle resTopicDefDialog = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/TopicDefDialog"); //$NON-NLS-1$
	private ch.ehi.interlis.modeltopicclass.TopicDef topicDef = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	private javax.swing.JTabbedPane ivjTbpGeneral = null;
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JLabel ivjLblOid = null;
	private javax.swing.JLabel ivjLblExtends = null;
	private ReferencableComboBox ivjCbxOid = null;
	private javax.swing.JTextField ivjTxtName = null;
	private javax.swing.JComboBox ivjCbxType = null;
	private javax.swing.JButton ivjBtnApply = null;
	private DescriptionPanel ivjPnlDescription = null;
	private javax.swing.JCheckBox ivjChxAbstract = null;
	private javax.swing.JCheckBox ivjChxFinal = null;
	private javax.swing.JPanel ivjPnlDepends = null;
	private javax.swing.JPanel ivjPnlDetail = null;
	private javax.swing.JScrollPane ivjScpDepends = null;
	private javax.swing.table.TableColumn ivjTbcTopicDef = null;
	private javax.swing.JTable ivjTblDepends = null;
	private javax.swing.JMenuItem ivjMniOpenTopicDefSpecification = null;
	private javax.swing.JPopupMenu ivjMnuDepends = null;
	private javax.swing.JSeparator ivjJSeparator11 = null;
	private javax.swing.JMenuItem ivjMniNewTopicDepends = null;
	private javax.swing.JMenuItem ivjMniRemoveTopicDepends = null;
	private ExtendedPanel ivjPnlExtended = null;
	private javax.swing.JLabel ivjLblType = null;

	class IvjEventHandler
			implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.MouseListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == TopicDefDialog.this.getBtnOk())
				connEtoC1(e);
			if (e.getSource() == TopicDefDialog.this.getBtnCancel())
				connEtoC2(e);
			if (e.getSource() == TopicDefDialog.this.getBtnApply())
				connEtoC3(e);
			if (e.getSource() == TopicDefDialog.this.getMniOpenTopicDefSpecification())
				connEtoC6(e);
			if (e.getSource() == TopicDefDialog.this.getMniNewTopicDepends())
				connEtoC13(e);
			if (e.getSource() == TopicDefDialog.this.getMniRemoveTopicDepends())
				connEtoC14(e);
		};

		public void focusGained(java.awt.event.FocusEvent e) {
			if (e.getSource() == TopicDefDialog.this.getTxtName())
				connEtoM1(e);
		};

		public void focusLost(java.awt.event.FocusEvent e) {
		};

		public void mouseClicked(java.awt.event.MouseEvent e) {
		};

		public void mouseEntered(java.awt.event.MouseEvent e) {
		};

		public void mouseExited(java.awt.event.MouseEvent e) {
		};

		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == TopicDefDialog.this.getScpDepends())
				connEtoC7(e);
			if (e.getSource() == TopicDefDialog.this.getTblDepends())
				connEtoC8(e);
		};

		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == TopicDefDialog.this.getScpDepends())
				connEtoC4(e);
			if (e.getSource() == TopicDefDialog.this.getTblDepends())
				connEtoC5(e);
		};
	};

	/**
	 * Constructor
	 */
	public TopicDefDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
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
	public TopicDefDialog(java.awt.Frame owner, boolean modal) {
		super(owner, modal);
		initialize();
	}

	public void adaptUserAction(EventObject event, Object control) {
		boolean isSelected = getTblDepends().getSelectedRow() >= 0;
		getMniOpenTopicDefSpecification().setEnabled(isSelected);
		getMniRemoveTopicDepends().setEnabled(isSelected);
	}

	/**
	 * Comment
	 */
	private void btnDepends() {
		return;
	}

	/**
	 * connEtoC1: (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) -->
	 * TopicDefDialog.okPressed()V)
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
	 * connEtoC13:
	 * (MniNewTopicDepends.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> TopicDefDialog.mniNewTopicDepends()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC13(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.mniNewTopicDepends();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoC14:
	 * (MniRemoveTopicDepends.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> TopicDefDialog.mniRemoveTopicDepends()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC14(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.mniRemoveTopicDepends();
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
	 * --> TopicDefDialog.cancelPressed()V)
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
	 * --> TopicDefDialog.applyPressed()V)
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
	 * connEtoC4: (ScpDepends.mouse.mouseReleased(java.awt.event.MouseEvent) -->
	 * TopicDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
	 * 
	 * @param arg1
	 *            java.awt.event.MouseEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC4(java.awt.event.MouseEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.genericPopupDisplay(arg1, getMnuDepends());
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoC5: (TblDepends.mouse.mouseReleased(java.awt.event.MouseEvent) -->
	 * TopicDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
	 * 
	 * @param arg1
	 *            java.awt.event.MouseEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC5(java.awt.event.MouseEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.genericPopupDisplay(arg1, getMnuDepends());
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoC6:
	 * (MniOpenTopicDefSpecification.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> TopicDefDialog.mniOpenTopicDefSpecification()V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC6(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.mniOpenTopicDefSpecification();
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoC7: (ScpDepends.mouse.mousePressed(java.awt.event.MouseEvent) -->
	 * TopicDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
	 * 
	 * @param arg1
	 *            java.awt.event.MouseEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC7(java.awt.event.MouseEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.genericPopupDisplay(arg1, getMnuDepends());
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoC8: (TblDepends.mouse.mousePressed(java.awt.event.MouseEvent) -->
	 * TopicDefDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
	 * 
	 * @param arg1
	 *            java.awt.event.MouseEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC8(java.awt.event.MouseEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.genericPopupDisplay(arg1, getMnuDepends());
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
				constraintsLblName.gridx = 1;
				constraintsLblName.gridy = 1;
				constraintsLblName.gridwidth = 2;
				constraintsLblName.ipadx = 104;
				constraintsLblName.insets = new java.awt.Insets(22, 10, 5, 7);
				getBaseDialogContentPane().add(getLblName(), constraintsLblName);

				java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
				constraintsTxtName.gridx = 3;
				constraintsTxtName.gridy = 1;
				constraintsTxtName.gridwidth = 2;
				constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtName.weightx = 1.0;
				constraintsTxtName.ipadx = 249;
				constraintsTxtName.insets = new java.awt.Insets(19, 1, 2, 15);
				getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

				java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
				constraintsTbpGeneral.gridx = 1;
				constraintsTbpGeneral.gridy = 3;
				constraintsTbpGeneral.gridwidth = 4;
				constraintsTbpGeneral.fill = java.awt.GridBagConstraints.BOTH;
				constraintsTbpGeneral.weightx = 1.0;
				constraintsTbpGeneral.weighty = 1.0;
				constraintsTbpGeneral.insets = new java.awt.Insets(7, 7, 5, 11);
				getBaseDialogContentPane().add(getTbpGeneral(), constraintsTbpGeneral);

				java.awt.GridBagConstraints constraintsLblType = new java.awt.GridBagConstraints();
				constraintsLblType.gridx = 1;
				constraintsLblType.gridy = 2;
				constraintsLblType.gridwidth = 2;
				constraintsLblType.ipadx = 124;
				constraintsLblType.insets = new java.awt.Insets(7, 10, 11, 0);
				getBaseDialogContentPane().add(getLblType(), constraintsLblType);

				java.awt.GridBagConstraints constraintsCbxType = new java.awt.GridBagConstraints();
				constraintsCbxType.gridx = 3;
				constraintsCbxType.gridy = 2;
				constraintsCbxType.gridwidth = 2;
				constraintsCbxType.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsCbxType.weightx = 1.0;
				constraintsCbxType.ipadx = 26;
				constraintsCbxType.insets = new java.awt.Insets(3, 1, 6, 116);
				getBaseDialogContentPane().add(getCbxType(), constraintsCbxType);

				java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
				constraintsBtnOk.gridx = 1;
				constraintsBtnOk.gridy = 4;
				constraintsBtnOk.ipadx = 64;
				constraintsBtnOk.insets = new java.awt.Insets(5, 27, 8, 3);
				getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

				java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
				constraintsBtnCancel.gridx = 2;
				constraintsBtnCancel.gridy = 4;
				constraintsBtnCancel.gridwidth = 2;
				constraintsBtnCancel.ipadx = 18;
				constraintsBtnCancel.insets = new java.awt.Insets(5, 3, 8, 3);
				getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

				java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
				constraintsBtnApply.gridx = 4;
				constraintsBtnApply.gridy = 4;
				constraintsBtnApply.ipadx = 8;
				constraintsBtnApply.insets = new java.awt.Insets(5, 3, 8, 42);
				getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);
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
	 * Return the CbxType property value.
	 * 
	 * @return javax.swing.JComboBox
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JComboBox getCbxType() {
		if (ivjCbxType == null) {
			try {
				ivjCbxType = new javax.swing.JComboBox();
				ivjCbxType.setName("CbxType");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjCbxType;
	}

	/**
	 * Return the JCheckBox1 property value.
	 * 
	 * @return javax.swing.JCheckBox
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JCheckBox getChxAbstract() {
		if (ivjChxAbstract == null) {
			try {
				ivjChxAbstract = new javax.swing.JCheckBox();
				ivjChxAbstract.setName("ChxAbstract");
				ivjChxAbstract.setToolTipText("");
				ivjChxAbstract.setText("Abstrakt");
				ivjChxAbstract.setBounds(7, 12, 140, 22);
				// user code begin {1}
				ivjChxAbstract.setToolTipText(resTopicDefDialog.getString("ChxAbstract_toolTipText"));
				ivjChxAbstract.setText(resTopicDefDialog.getString("ChxAbstract_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjChxAbstract;
	}

	/**
	 * Return the JCheckBox2 property value.
	 * 
	 * @return javax.swing.JCheckBox
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JCheckBox getChxFinal() {
		if (ivjChxFinal == null) {
			try {
				ivjChxFinal = new javax.swing.JCheckBox();
				ivjChxFinal.setName("ChxFinal");
				ivjChxFinal.setToolTipText("");
				ivjChxFinal.setText("Abschliessend");
				ivjChxFinal.setBounds(7, 40, 140, 22);
				// user code begin {1}
				ivjChxFinal.setToolTipText(resTopicDefDialog.getString("ChxFinal_toolTipText"));
				ivjChxFinal.setText(resTopicDefDialog.getString("ChxFinal_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjChxFinal;
	}

	/**
	 * Return the JSeparator11 property value.
	 * 
	 * @return javax.swing.JSeparator
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JSeparator getJSeparator11() {
		if (ivjJSeparator11 == null) {
			try {
				ivjJSeparator11 = new javax.swing.JSeparator();
				ivjJSeparator11.setName("JSeparator11");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjJSeparator11;
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
				ivjLblName.setText(resTopicDefDialog.getString("LblName_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblName;
	}

	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblExtends() {
		if (ivjLblExtends == null) {
			try {
				ivjLblExtends = new javax.swing.JLabel();
				ivjLblExtends.setName("LblExtends");
				ivjLblExtends.setText("Extends:");
				// user code begin {1}
				ivjLblExtends.setText(resTopicDefDialog.getString("LblExtends_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblExtends;
	}

	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblOid() {
		if (ivjLblOid == null) {
			try {
				ivjLblOid = new javax.swing.JLabel();
				ivjLblOid.setName("LblOid");
				ivjLblOid.setText("OID:");
				// user code begin {1}
				ivjLblOid.setText(resTopicDefDialog.getString("LblOid_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblOid;
	}

	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private ReferencableComboBox getCbxOid() {
		if (ivjCbxOid == null) {
			try {
				ivjCbxOid = new ReferencableComboBox();
				ivjCbxOid.setName("CbxOid");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjCbxOid;
	}

	/**
	 * Return the JLabel1 property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblType() {
		if (ivjLblType == null) {
			try {
				ivjLblType = new javax.swing.JLabel();
				ivjLblType.setName("LblType");
				ivjLblType.setText("Typ:");
				// user code begin {1}
				ivjLblType.setText(resTopicDefDialog.getString("LblType_text"));
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
	 * Return the MniNewTopicDepends property value.
	 * 
	 * @return javax.swing.JMenuItem
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JMenuItem getMniNewTopicDepends() {
		if (ivjMniNewTopicDepends == null) {
			try {
				ivjMniNewTopicDepends = new javax.swing.JMenuItem();
				ivjMniNewTopicDepends.setName("MniNewTopicDepends");
				ivjMniNewTopicDepends.setText("Neu");
				ivjMniNewTopicDepends.setEnabled(true);
				// user code begin {1}
				ivjMniNewTopicDepends.setText(getNewString());
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjMniNewTopicDepends;
	}

	/**
	 * Return the MniOpenTopicDefSpecification property value.
	 * 
	 * @return javax.swing.JMenuItem
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JMenuItem getMniOpenTopicDefSpecification() {
		if (ivjMniOpenTopicDefSpecification == null) {
			try {
				ivjMniOpenTopicDefSpecification = new javax.swing.JMenuItem();
				ivjMniOpenTopicDefSpecification.setName("MniOpenTopicDefSpecification");
				ivjMniOpenTopicDefSpecification.setText("Öffne Spezifikation...");
				ivjMniOpenTopicDefSpecification.setEnabled(false);
				// user code begin {1}
				ivjMniOpenTopicDefSpecification.setText(getChangeWindowString());
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjMniOpenTopicDefSpecification;
	}

	/**
	 * Return the MniRemoveTopicDepends property value.
	 * 
	 * @return javax.swing.JMenuItem
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JMenuItem getMniRemoveTopicDepends() {
		if (ivjMniRemoveTopicDepends == null) {
			try {
				ivjMniRemoveTopicDepends = new javax.swing.JMenuItem();
				ivjMniRemoveTopicDepends.setName("MniRemoveTopicDepends");
				ivjMniRemoveTopicDepends.setText("Löschen");
				ivjMniRemoveTopicDepends.setEnabled(false);
				// user code begin {1}
				ivjMniRemoveTopicDepends.setText(getRemoveString());
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjMniRemoveTopicDepends;
	}

	/**
	 * Return the MnuDepends property value.
	 * 
	 * @return javax.swing.JPopupMenu
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPopupMenu getMnuDepends() {
		if (ivjMnuDepends == null) {
			try {
				ivjMnuDepends = new javax.swing.JPopupMenu();
				ivjMnuDepends.setName("MnuDepends");
				ivjMnuDepends.add(getMniOpenTopicDefSpecification());
				ivjMnuDepends.add(getJSeparator11());
				ivjMnuDepends.add(getMniNewTopicDepends());
				ivjMnuDepends.add(getMniRemoveTopicDepends());
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjMnuDepends;
	}

	/**
	 * Return the JPanel2 property value.
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getPnlDepends() {
		if (ivjPnlDepends == null) {
			try {
				ivjPnlDepends = new javax.swing.JPanel();
				ivjPnlDepends.setName("PnlDepends");
				ivjPnlDepends.setToolTipText(resTopicDefDialog.getString("PnlDepends_toolTipText"));
				ivjPnlDepends.setLayout(new java.awt.GridBagLayout());

				java.awt.GridBagConstraints constraintsScpDepends = new java.awt.GridBagConstraints();
				constraintsScpDepends.gridx = 1;
				constraintsScpDepends.gridy = 1;
				constraintsScpDepends.fill = java.awt.GridBagConstraints.BOTH;
				constraintsScpDepends.weightx = 1.0;
				constraintsScpDepends.weighty = 1.0;
				constraintsScpDepends.ipadx = 368;
				constraintsScpDepends.ipady = 89;
				constraintsScpDepends.insets = new java.awt.Insets(10, 6, 7, 7);
				getPnlDepends().add(getScpDepends(), constraintsScpDepends);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlDepends;
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
	 * Return the JPanel1 property value.
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getPnlDetail() {
		if (ivjPnlDetail == null) {
			try {
				ivjPnlDetail = new javax.swing.JPanel();
				ivjPnlDetail.setName("PnlDetail");
				ivjPnlDetail.setLayout(new java.awt.GridBagLayout());
				java.awt.GridBagConstraints constraintsChxAbstract = new java.awt.GridBagConstraints();
				constraintsChxAbstract.gridx = 0;
				constraintsChxAbstract.gridy = 0;
				constraintsChxAbstract.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsChxAbstract.insets = new java.awt.Insets(2, 2, 2, 2);
				ivjPnlDetail.add(getChxAbstract(), constraintsChxAbstract);

				java.awt.GridBagConstraints constraintsChxFinal = new java.awt.GridBagConstraints();
				constraintsChxFinal.gridx = 0;
				constraintsChxFinal.gridy = 1;
				constraintsChxFinal.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsChxFinal.insets = new java.awt.Insets(2, 2, 2, 2);
				ivjPnlDetail.add(getChxFinal(), constraintsChxFinal);

				java.awt.GridBagConstraints constraintsLblExtends = new java.awt.GridBagConstraints();
				constraintsLblExtends.gridx = 0;
				constraintsLblExtends.gridy = 2;
				constraintsLblExtends.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsLblExtends.insets = new java.awt.Insets(2, 2, 2, 2);
				ivjPnlDetail.add(getLblExtends(), constraintsLblExtends);

				java.awt.GridBagConstraints constraintsPnlExtended = new java.awt.GridBagConstraints();
				constraintsPnlExtended.gridx = 1;
				constraintsPnlExtended.gridy = 2;
				constraintsPnlExtended.weightx = 1.0;
				constraintsPnlExtended.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsPnlExtended.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsPnlExtended.insets = new java.awt.Insets(0, 0, 0, 0);
				ivjPnlDetail.add(getPnlExtended(), constraintsPnlExtended);

				java.awt.GridBagConstraints constraintsCbxOid = new java.awt.GridBagConstraints();
				constraintsCbxOid.gridx = 1;
				constraintsCbxOid.gridy = 3;
				constraintsCbxOid.weightx = 1.0;
				constraintsCbxOid.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsCbxOid.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsCbxOid.insets = new java.awt.Insets(1, 5, 3, 6);
				ivjPnlDetail.add(getCbxOid(), constraintsCbxOid);

				java.awt.GridBagConstraints constraintsLblOid = new java.awt.GridBagConstraints();
				constraintsLblOid.gridx = 0;
				constraintsLblOid.gridy = 3;
				constraintsLblOid.anchor = java.awt.GridBagConstraints.NORTHWEST;
				constraintsLblOid.insets = new java.awt.Insets(2, 2, 2, 2);
				ivjPnlDetail.add(getLblOid(), constraintsLblOid);

				/*
				 * ivjPnlDetail.setLayout(null);
				 * getPnlDetail().add(getChxAbstract(),
				 * getChxAbstract().getName());
				 * getPnlDetail().add(getChxFinal(), getChxFinal().getName());
				 * getPnlDetail().add(getPnlExtended(),
				 * getPnlExtended().getName());
				 */
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
	 * Return the PnlExtended property value.
	 * 
	 * @return ch.ehi.umleditor.application.ExtendedPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private ExtendedPanel getPnlExtended() {
		if (ivjPnlExtended == null) {
			try {
				ivjPnlExtended = new ch.ehi.umleditor.application.ExtendedPanel();
				ivjPnlExtended.setName("PnlExtended");
				ivjPnlExtended.setLocation(7, 79);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlExtended;
	}

	/**
	 * Return the JScrollPane1 property value.
	 * 
	 * @return javax.swing.JScrollPane
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JScrollPane getScpDepends() {
		if (ivjScpDepends == null) {
			try {
				ivjScpDepends = new javax.swing.JScrollPane();
				ivjScpDepends.setName("ScpDepends");
				ivjScpDepends.setAutoscrolls(false);
				ivjScpDepends.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				ivjScpDepends.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				getScpDepends().setViewportView(getTblDepends());
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjScpDepends;
	}

	/**
	 * Return the TableColumn1 property value.
	 * 
	 * @return javax.swing.table.TableColumn
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.table.TableColumn getTbcTopicDef() {
		if (ivjTbcTopicDef == null) {
			try {
				ivjTbcTopicDef = new javax.swing.table.TableColumn();
				ivjTbcTopicDef.setHeaderValue("TopicDef");
				// user code begin {1}
				ivjTbcTopicDef.setHeaderValue(resTopicDefDialog.getString("TbcTopicDef_header"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTbcTopicDef;
	}

	/**
	 * Return the ScrollPaneTable property value.
	 * 
	 * @return javax.swing.JTable
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTable getTblDepends() {
		if (ivjTblDepends == null) {
			try {
				ivjTblDepends = new javax.swing.JTable();
				ivjTblDepends.setName("TblDepends");
				getScpDepends().setColumnHeaderView(ivjTblDepends.getTableHeader());
				getScpDepends().getViewport().setBackingStoreEnabled(true);
				ivjTblDepends.setBounds(0, 0, 200, 200);
				ivjTblDepends.setAutoCreateColumnsFromModel(false);
				ivjTblDepends.addColumn(getTbcTopicDef());
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTblDepends;
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
				ivjTbpGeneral.insertTab(getDetailString(), null, getPnlDetail(), null, 1);
				ivjTbpGeneral.insertTab(resTopicDefDialog.getString("TbpDepends_title"), null, getPnlDepends(), null,
						2);
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
		getScpDepends().addMouseListener(ivjEventHandler);
		getTblDepends().addMouseListener(ivjEventHandler);
		getMniOpenTopicDefSpecification().addActionListener(ivjEventHandler);
		getMniNewTopicDepends().addActionListener(ivjEventHandler);
		getMniRemoveTopicDepends().addActionListener(ivjEventHandler);
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
			setName("TopicDefDialog");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setSize(490, 406);
			setTitle(resTopicDefDialog.getString("CTDialog"));
			setContentPane(getBaseDialogContentPane());
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		// Type
		java.util.Vector types = new java.util.Vector(2);
		// @see #setElement() for correct sequence
		// @see #save()
		types.add(resTopicDefDialog.getString("CITypeUrestricted"));
		types.add(resTopicDefDialog.getString("CITypeVIEW"));
		getCbxType().setModel(new javax.swing.DefaultComboBoxModel(types));
		// user code end
	}

	/**
	 * @deprecated
	 */
	private void mniNewTopicDepends() {
		newObject(null);
	}

	/**
	 * @deprecated
	 */
	private void mniOpenTopicDefSpecification() {
		changeObjects(null);
	}

	/**
	 * @deprecated
	 */
	private void mniRemoveTopicDepends() {
		removeObjects(null);
	}

	/**
	 * Save ModelElement changes.
	 * 
	 * @see okPressed()
	 * @see applyPressed
	 */
	protected boolean save() {
		if (!ElementUtils.trySetName(topicDef, getTxtName().getText())) {
			return false;
		}
		// @see #initalize() for correct sequence
		// @see #setElement()
		switch (getCbxType().getSelectedIndex()) {
		case 0: {
			topicDef.setKind(TopicDefKind.DATA);
			break;
		}
		case 1: {
			topicDef.setKind(TopicDefKind.VIEW);
			break;
		}
		}
		getPnlDescription().getObject();

		// page Detail
		topicDef.setAbstract(getChxAbstract().isSelected());
		topicDef.setPropFinal(getChxFinal().isSelected());
		if (!getPnlExtended().getExtension()) {
			return false;
		}
		if (topicDef.containsOiddomain()) {
			topicDef.detachOiddomain();
		}
		if ((getCbxOid().getElement() != null)) {
			topicDef.attachOiddomain((DomainDef) getCbxOid().getElement());
		}

		return super.save();
	}

	/**
	 * Map model to view.
	 */
	private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
		topicDef = (ch.ehi.interlis.modeltopicclass.TopicDef) element;

		// general & page Description
		getTxtName().setText(topicDef.getDefLangName());
		switch (topicDef.getKind()) {
		case TopicDefKind.DATA: {
			getCbxType().setSelectedIndex(0);
			break;
		}
		case TopicDefKind.VIEW: {
			getCbxType().setSelectedIndex(1);
			break;
		}
		}
		getPnlDescription().setObject(element);

		// page Detail
		getChxAbstract().setSelected(topicDef.isAbstract());
		getChxFinal().setSelected(topicDef.isPropFinal());
		getPnlExtended().setExtension(topicDef);
		if (topicDef.containsOiddomain()) {
			getCbxOid().setElement(DomainDef.class, topicDef, topicDef.getOiddomain());
		} else {
			getCbxOid().setElement(DomainDef.class, topicDef, null);
		}

		// page Depends
		getTblDepends().setModel(new EditorTableModel());
		((EditorTableModel) getTblDepends().getModel()).setClientDependency(topicDef.iteratorClientDependency(),
				"TopicDef");//$NON-NLS-1$
		/*
		 * // page Import getTblUses().setModel(new EditorTableModel());
		 * ((EditorTableModel)getTblUses().getModel()).setPatternUse(topicDef.
		 * iteratorClientDependency());
		 */
	}

	public void changeObjects(Object source) {
		try {
			((EditorTableModel) getTblDepends().getModel())
					.showDependencySpecification(getTblDepends().getSelectedRows());
		} catch (Throwable e) {
			BaseDialog.showError((java.awt.Component) this, "Model error",
					"There is something wrong with this element! You are best adviced by deleting and recreating it again.",
					e);
		}
	}

	public void copyObject(Object source) {
		// TODO Auto-generated method stub

	}

	public void newObject(Object source) {
		try {
			ModelElementSelectionDialog dialog = new ModelElementSelectionDialog(this,
					resTopicDefDialog.getString("CTSelection"), true, topicDef); //$NON-NLS-1$
			getTblDepends().setModel(new EditorTableModel());
			((EditorTableModel) getTblDepends().getModel()).setClientDependency(topicDef.iteratorClientDependency(),
					resTopicDefDialog.getString("CITopicDef")); //$NON-NLS-1$
		} catch (Throwable e) {
			handleException(e);
		}

	}

	public void removeObjects(Object source) {
		try {
			((EditorTableModel) getTblDepends().getModel()).removeRows(getTblDepends().getSelectedRows());
		} catch (Throwable e) {
			handleException(e);
		}
	}
}
