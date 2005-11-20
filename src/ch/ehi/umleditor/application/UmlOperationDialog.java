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
import java.util.Iterator;

import ch.ehi.basics.i18n.ResourceBundle;
import ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
import ch.ehi.uml1_4.implementation.*;
import ch.softenvironment.view.ListMenuChoice;
/**
 * An operation is a service that an instance of the class may be requested to perform.
 * It has a name and a list of arguments.
 * Notation: visibility name ( parameter-list ) : return-type-expression { property-string }
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.6 $ $Date: 2005-11-20 16:43:58 $
 */
public class UmlOperationDialog extends ch.softenvironment.view.BaseDialog implements ListMenuChoice {
	private static java.util.ResourceBundle resources = ResourceBundle.getBundle(UmlOperationDialog.class);
	private ch.ehi.uml1_4.implementation.UmlOperation operation = null;
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JButton ivjBtnApply = null;
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JButton ivjBtnOk = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JLabel ivjLblName = null;
	private javax.swing.JTextField ivjTxtName = null;
	private javax.swing.JButton ivjBtnReturnType = null;
	private javax.swing.JCheckBox ivjChxFinal = null;
	private javax.swing.JTextField txtReturnValue = null;
	private javax.swing.JLabel ivjLblReturnValue = null;
	private DescriptionPanel ivjPnlDescription = null;
	private javax.swing.JPanel ivjPnlDetail = null;
	private javax.swing.JPanel ivjPnlParameter = null;
	private javax.swing.JTabbedPane ivjTbpPane = null;
	private javax.swing.JSeparator ivjJSeparator1 = null;
	private javax.swing.DefaultListSelectionModel ivjLocalColumnModelDefaultListSelectionModel = null;
	private javax.swing.table.TableColumn ivjTbcAttributeName = null;
	private javax.swing.table.TableColumn ivjTbcAttributeType = null;
	private javax.swing.JLabel ivjLblConcurrency = null;
	private javax.swing.JMenuItem ivjMniNewParameter = null;
	private javax.swing.JMenuItem ivjMniOpenParameterSpecication = null;
	private javax.swing.JMenuItem ivjMniRemoveParameter = null;
	private javax.swing.JMenuItem mniMoveDownAttribute = null;
	private javax.swing.JPopupMenu ivjMnuParameters = null;
	private javax.swing.JCheckBox ivjChxAbstract = null;
	private javax.swing.JScrollPane ivjScpParameters = null;
	private javax.swing.JTable ivjTblParameters = null;
	private javax.swing.JMenuItem ivjMniMoveDown = null;
	private javax.swing.JLabel ivjLblScope = null;
	private javax.swing.JLabel ivjLblVisibility = null;
	private javax.swing.JRadioButton ivjRbtClassifier = null;
	private javax.swing.JRadioButton ivjRbtConcurrent = null;
	private javax.swing.JRadioButton ivjRbtGuarded = null;
	private javax.swing.JRadioButton ivjRbtInstance = null;
	private javax.swing.JRadioButton ivjRbtPackage = null;
	private javax.swing.JRadioButton ivjRbtPrivate = null;
	private javax.swing.JRadioButton ivjRbtProtected = null;
	private javax.swing.JRadioButton ivjRbtPublic = null;
	private javax.swing.JRadioButton ivjRbtSequential = null;
	private javax.swing.table.TableColumn ivjTbcKind = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.MouseListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == UmlOperationDialog.this.getBtnOk()) 
				connEtoC1(e);
			if (e.getSource() == UmlOperationDialog.this.getBtnCancel()) 
				connEtoC2(e);
			if (e.getSource() == UmlOperationDialog.this.getBtnApply()) 
				connEtoC3(e);
			if (e.getSource() == UmlOperationDialog.this.getBtnReturnType()) 
				connEtoC4(e);
			if (e.getSource() == UmlOperationDialog.this.getMniOpenParameterSpecication()) 
				connEtoC5(e);
			if (e.getSource() == UmlOperationDialog.this.getMniNewParameter()) 
				connEtoC6(e);
			if (e.getSource() == UmlOperationDialog.this.getMniRemoveParameter()) 
				connEtoC7(e);
			if (e.getSource() == UmlOperationDialog.this.getMniMoveDown()) 
				connEtoC12(e);
		};
		public void mouseClicked(java.awt.event.MouseEvent e) {};
		public void mouseEntered(java.awt.event.MouseEvent e) {};
		public void mouseExited(java.awt.event.MouseEvent e) {};
		public void mousePressed(java.awt.event.MouseEvent e) {
			if (e.getSource() == UmlOperationDialog.this.getScpParameters()) 
				connEtoC10(e);
			if (e.getSource() == UmlOperationDialog.this.getTblParameters()) 
				connEtoC11(e);
		};
		public void mouseReleased(java.awt.event.MouseEvent e) {
			if (e.getSource() == UmlOperationDialog.this.getScpParameters()) 
				connEtoC8(e);
			if (e.getSource() == UmlOperationDialog.this.getTblParameters()) 
				connEtoC9(e);
		};
	};
/**
 * Constructor
 * @param owner
 * @param element to be displayed
 */
public UmlOperationDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
	super(owner, true);
	initialize();
	setTitle(((UmlOperation)element).getOwner().getDefLangName() + "->" + getTitle());
	setRelativeLocation(owner);
	setElement(element);
	show();
}
public void adaptUserAction(EventObject event, Object control) {
	boolean isSelected = getTblParameters().getSelectedRow() >= 0;
	getMniOpenParameterSpecication().setEnabled(isSelected);
	getMniRemoveParameter().setEnabled(isSelected);
	getMniMoveDown().setEnabled(isSelected);
}
/**
 * Comment
 */
private void btnReturnType() {
	LauncherView.getInstance().nyi("Assignment of <Return Type>");
}
/**
 * connEtoC1:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> OperationDialog.okPressed()V)
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
 * connEtoC10:  (ScpAttributes.mouse.mousePressed(java.awt.event.MouseEvent) --> OperationDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC10(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuParameters());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC11:  (TblAttributes.mouse.mousePressed(java.awt.event.MouseEvent) --> OperationDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC11(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuParameters());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC12:  (MniMoveDown.action.actionPerformed(java.awt.event.ActionEvent) --> UmlOperationDialog.mniMoveDownParameter()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC12(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniMoveDownParameter();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> OperationDialog.cancelPressed()V)
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
 * connEtoC3:  (BtnApply.action.actionPerformed(java.awt.event.ActionEvent) --> OperationDialog.applyPressed()V)
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
 * connEtoC4:  (BtnReturnType.action.actionPerformed(java.awt.event.ActionEvent) --> OperationDialog.btnReturnType()V)
 * @param arg1 java.awt.event.ActionEvent
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
 * connEtoC5:  (MniOpenAttributeSpecication.action.actionPerformed(java.awt.event.ActionEvent) --> OperationDialog.mniOpenParameterSpecification()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniOpenParameterSpecification();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (MniNewAttribute.action.actionPerformed(java.awt.event.ActionEvent) --> OperationDialog.mniNewParameter()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniNewParameter();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC7:  (MniRemoveAttribute.action.actionPerformed(java.awt.event.ActionEvent) --> OperationDialog.mniRemoveParameter()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC7(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.mniRemoveParameter();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC8:  (ScpAttributes.mouse.mouseReleased(java.awt.event.MouseEvent) --> OperationDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC8(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuParameters());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC9:  (TblAttributes.mouse.mouseReleased(java.awt.event.MouseEvent) --> OperationDialog.genericPopupDisplay(Ljava.awt.event.MouseEvent;Ljavax.swing.JPopupMenu;)V)
 * @param arg1 java.awt.event.MouseEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC9(java.awt.event.MouseEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.genericPopupDisplay(arg1, getMnuParameters());
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
			constraintsLblName.ipadx = 104;
			constraintsLblName.insets = new java.awt.Insets(16, 10, 7, 5);
			getBaseDialogContentPane().add(getLblName(), constraintsLblName);

			java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
			constraintsTxtName.gridx = 2; constraintsTxtName.gridy = 1;
			constraintsTxtName.gridwidth = 2;
			constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsTxtName.weightx = 1.0;
			constraintsTxtName.ipadx = 236;
			constraintsTxtName.insets = new java.awt.Insets(13, 5, 4, 4);
			getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

			java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
			constraintsBtnOk.gridx = 1; constraintsBtnOk.gridy = 4;
			constraintsBtnOk.ipadx = 56;
			constraintsBtnOk.insets = new java.awt.Insets(9, 25, 13, 23);
			getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 4;
			constraintsBtnCancel.ipadx = 10;
			constraintsBtnCancel.insets = new java.awt.Insets(9, 11, 13, 18);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
			constraintsBtnApply.gridx = 3; constraintsBtnApply.gridy = 4;
			constraintsBtnApply.gridwidth = 2;
			constraintsBtnApply.insets = new java.awt.Insets(9, 18, 13, 48);
			getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

			java.awt.GridBagConstraints constraintsTbpPane = new java.awt.GridBagConstraints();
			constraintsTbpPane.gridx = 1; constraintsTbpPane.gridy = 3;
			constraintsTbpPane.gridwidth = 4;
			constraintsTbpPane.fill = java.awt.GridBagConstraints.BOTH;
			constraintsTbpPane.weightx = 1.0;
			constraintsTbpPane.weighty = 1.0;
			constraintsTbpPane.ipadx = 416;
			constraintsTbpPane.ipady = 155;
			constraintsTbpPane.insets = new java.awt.Insets(8, 9, 8, 8);
			getBaseDialogContentPane().add(getTbpPane(), constraintsTbpPane);

			java.awt.GridBagConstraints constraintsLblReturnValue = new java.awt.GridBagConstraints();
			constraintsLblReturnValue.gridx = 1; constraintsLblReturnValue.gridy = 2;
			constraintsLblReturnValue.ipadx = 66;
			constraintsLblReturnValue.insets = new java.awt.Insets(6, 10, 16, 5);
			getBaseDialogContentPane().add(getLblReturnValue(), constraintsLblReturnValue);

			java.awt.GridBagConstraints constraintsJTextField1 = new java.awt.GridBagConstraints();
			constraintsJTextField1.gridx = 2; constraintsJTextField1.gridy = 2;
			constraintsJTextField1.gridwidth = 2;
			constraintsJTextField1.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsJTextField1.weightx = 1.0;
			constraintsJTextField1.ipadx = 236;
			constraintsJTextField1.insets = new java.awt.Insets(6, 5, 10, 4);
			getBaseDialogContentPane().add(getTxtReturnValue(), constraintsJTextField1);

			java.awt.GridBagConstraints constraintsBtnReturnType = new java.awt.GridBagConstraints();
			constraintsBtnReturnType.gridx = 4; constraintsBtnReturnType.gridy = 2;
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
 * Return the ChxAbtract property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxAbstract() {
	if (ivjChxAbstract == null) {
		try {
			ivjChxAbstract = new javax.swing.JCheckBox();
			ivjChxAbstract.setName("ChxAbstract");
			ivjChxAbstract.setText("Abstract");
			ivjChxAbstract.setBounds(9, 11, 131, 22);
			// user code begin {1}
			ivjChxAbstract.setText(resources.getString("ChxAbstract_text"));
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
 * Return the ChxFinal property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxFinal() {
	if (ivjChxFinal == null) {
		try {
			ivjChxFinal = new javax.swing.JCheckBox();
			ivjChxFinal.setName("ChxFinal");
			ivjChxFinal.setToolTipText("Show whether is leaf Operation in inheritance chain");
			ivjChxFinal.setText("Final");
			ivjChxFinal.setBounds(9, 39, 131, 22);
			// user code begin {1}
			ivjChxFinal.setText(resources.getString("ChxFinal_text"));
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
 * Return the JSeparator1 property value.
 * @return javax.swing.JSeparator
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JSeparator getJSeparator1() {
	if (ivjJSeparator1 == null) {
		try {
			ivjJSeparator1 = new javax.swing.JSeparator();
			ivjJSeparator1.setName("JSeparator1");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjJSeparator1;
}
/**
 * Return the JTextField1 property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtReturnValue() {
	if (txtReturnValue == null) {
		try {
			txtReturnValue = new javax.swing.JTextField();
			txtReturnValue.setName("txtReturnValue");
			txtReturnValue.setEditable(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return txtReturnValue;
}
/**
 * Return the LblConcurrency property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblConcurrency() {
	if (ivjLblConcurrency == null) {
		try {
			ivjLblConcurrency = new javax.swing.JLabel();
			ivjLblConcurrency.setName("LblConcurrency");
			ivjLblConcurrency.setText("Concurrency:");
			ivjLblConcurrency.setBounds(318, 82, 124, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblConcurrency;
}
/**
 * Return the LblName property value.
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
			ivjLblName.setText(resources.getString("LblName_text"));
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
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblReturnValue() {
	if (ivjLblReturnValue == null) {
		try {
			ivjLblReturnValue = new javax.swing.JLabel();
			ivjLblReturnValue.setName("LblReturnValue");
			ivjLblReturnValue.setText("Return value:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblReturnValue;
}
/**
 * Return the LblScope property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblScope() {
	if (ivjLblScope == null) {
		try {
			ivjLblScope = new javax.swing.JLabel();
			ivjLblScope.setName("LblScope");
			ivjLblScope.setText("Scope:");
			ivjLblScope.setBounds(318, 16, 124, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblScope;
}
/**
 * Return the LblVisibility property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblVisibility() {
	if (ivjLblVisibility == null) {
		try {
			ivjLblVisibility = new javax.swing.JLabel();
			ivjLblVisibility.setName("LblVisibility");
			ivjLblVisibility.setText("Visibility:");
			ivjLblVisibility.setBounds(9, 82, 140, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblVisibility;
}
/**
 * Return the LocalColumnModelDefaultListSelectionModel property value.
 * @return javax.swing.DefaultListSelectionModel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.DefaultListSelectionModel getLocalColumnModelDefaultListSelectionModel() {
	javax.swing.DefaultListSelectionModel ivjLocalColumnModelDefaultListSelectionModel = null;
	try {
		/* Create part */
		ivjLocalColumnModelDefaultListSelectionModel = new javax.swing.DefaultListSelectionModel();
		ivjLocalColumnModelDefaultListSelectionModel.setAnchorSelectionIndex(0);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjLocalColumnModelDefaultListSelectionModel;
}
/**
 * Return the MniMoveDown property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniMoveDown() {
	if (ivjMniMoveDown == null) {
		try {
			ivjMniMoveDown = new javax.swing.JMenuItem();
			ivjMniMoveDown.setName("MniMoveDown");
			ivjMniMoveDown.setText("Move down");
			ivjMniMoveDown.setEnabled(false);
			// user code begin {1}
			ivjMniMoveDown.setText(resources.getString("MniMoveDown_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniMoveDown;
}
/**
 * Return the MniNewAttribute property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniNewParameter() {
	if (ivjMniNewParameter == null) {
		try {
			ivjMniNewParameter = new javax.swing.JMenuItem();
			ivjMniNewParameter.setName("MniNewParameter");
			ivjMniNewParameter.setText("Neu");
			ivjMniNewParameter.setEnabled(true);
			// user code begin {1}
			ivjMniNewParameter.setText(getNewString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniNewParameter;
}
/**
 * Return the MniOpenAttributeSpecication property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniOpenParameterSpecication() {
	if (ivjMniOpenParameterSpecication == null) {
		try {
			ivjMniOpenParameterSpecication = new javax.swing.JMenuItem();
			ivjMniOpenParameterSpecication.setName("MniOpenParameterSpecication");
			ivjMniOpenParameterSpecication.setText("Öffne Spezifikation...");
			ivjMniOpenParameterSpecication.setEnabled(false);
			// user code begin {1}
			ivjMniOpenParameterSpecication.setText(getChangeWindowString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniOpenParameterSpecication;
}
/**
 * Return the MniRemoveAttribute property value.
 * @return javax.swing.JMenuItem
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JMenuItem getMniRemoveParameter() {
	if (ivjMniRemoveParameter == null) {
		try {
			ivjMniRemoveParameter = new javax.swing.JMenuItem();
			ivjMniRemoveParameter.setName("MniRemoveParameter");
			ivjMniRemoveParameter.setText("Löschen");
			ivjMniRemoveParameter.setEnabled(false);
			// user code begin {1}
			ivjMniRemoveParameter.setText(getRemoveString());
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMniRemoveParameter;
}
/**
 * Return the MnuAttributes property value.
 * @return javax.swing.JPopupMenu
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPopupMenu getMnuParameters() {
	if (ivjMnuParameters == null) {
		try {
			ivjMnuParameters = new javax.swing.JPopupMenu();
			ivjMnuParameters.setName("MnuParameters");
			ivjMnuParameters.add(getMniOpenParameterSpecication());
			ivjMnuParameters.add(getJSeparator1());
			ivjMnuParameters.add(getMniNewParameter());
			ivjMnuParameters.add(getMniRemoveParameter());
			ivjMnuParameters.add(getMniMoveDown());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjMnuParameters;
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
 * Return the PnlDetail property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlDetail() {
	if (ivjPnlDetail == null) {
		try {
			ivjPnlDetail = new javax.swing.JPanel();
			ivjPnlDetail.setName("PnlDetail");
			ivjPnlDetail.setLayout(null);
			getPnlDetail().add(getChxAbstract(), getChxAbstract().getName());
			getPnlDetail().add(getChxFinal(), getChxFinal().getName());
			getPnlDetail().add(getLblConcurrency(), getLblConcurrency().getName());
			getPnlDetail().add(getRbtSequential(), getRbtSequential().getName());
			getPnlDetail().add(getRbtGuarded(), getRbtGuarded().getName());
			getPnlDetail().add(getRbtConcurrent(), getRbtConcurrent().getName());
			getPnlDetail().add(getLblVisibility(), getLblVisibility().getName());
			getPnlDetail().add(getRbtPublic(), getRbtPublic().getName());
			getPnlDetail().add(getRbtProtected(), getRbtProtected().getName());
			getPnlDetail().add(getRbtPrivate(), getRbtPrivate().getName());
			getPnlDetail().add(getRbtPackage(), getRbtPackage().getName());
			getPnlDetail().add(getLblScope(), getLblScope().getName());
			getPnlDetail().add(getRbtInstance(), getRbtInstance().getName());
			getPnlDetail().add(getRbtClassifier(), getRbtClassifier().getName());
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
 * Return the PnlParameter property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlParameter() {
	if (ivjPnlParameter == null) {
		try {
			ivjPnlParameter = new javax.swing.JPanel();
			ivjPnlParameter.setName("PnlParameter");
			ivjPnlParameter.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsScpParameters = new java.awt.GridBagConstraints();
			constraintsScpParameters.gridx = 1; constraintsScpParameters.gridy = 1;
			constraintsScpParameters.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpParameters.weightx = 1.0;
			constraintsScpParameters.weighty = 1.0;
			constraintsScpParameters.ipadx = 506;
			constraintsScpParameters.ipady = 175;
			constraintsScpParameters.insets = new java.awt.Insets(8, 6, 6, 7);
			getPnlParameter().add(getScpParameters(), constraintsScpParameters);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlParameter;
}
/**
 * Return the RbtClassifier property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtClassifier() {
	if (ivjRbtClassifier == null) {
		try {
			ivjRbtClassifier = new javax.swing.JRadioButton();
			ivjRbtClassifier.setName("RbtClassifier");
			ivjRbtClassifier.setText("Classifier");
			ivjRbtClassifier.setBounds(464, 36, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtClassifier;
}
/**
 * Return the RbtConcurrent property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtConcurrent() {
	if (ivjRbtConcurrent == null) {
		try {
			ivjRbtConcurrent = new javax.swing.JRadioButton();
			ivjRbtConcurrent.setName("RbtConcurrent");
			ivjRbtConcurrent.setText("Concurrent");
			ivjRbtConcurrent.setBounds(464, 126, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtConcurrent;
}
/**
 * Return the RbtGuarded property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtGuarded() {
	if (ivjRbtGuarded == null) {
		try {
			ivjRbtGuarded = new javax.swing.JRadioButton();
			ivjRbtGuarded.setName("RbtGuarded");
			ivjRbtGuarded.setText("Guarded");
			ivjRbtGuarded.setBounds(464, 102, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtGuarded;
}
/**
 * Return the RbtInstance property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtInstance() {
	if (ivjRbtInstance == null) {
		try {
			ivjRbtInstance = new javax.swing.JRadioButton();
			ivjRbtInstance.setName("RbtInstance");
			ivjRbtInstance.setText("Instance");
			ivjRbtInstance.setBounds(464, 12, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtInstance;
}
/**
 * Return the RbtPackage property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtPackage() {
	if (ivjRbtPackage == null) {
		try {
			ivjRbtPackage = new javax.swing.JRadioButton();
			ivjRbtPackage.setName("RbtPackage");
			ivjRbtPackage.setText("Package");
			ivjRbtPackage.setBounds(166, 153, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtPackage;
}
/**
 * Return the RbtPrivate property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtPrivate() {
	if (ivjRbtPrivate == null) {
		try {
			ivjRbtPrivate = new javax.swing.JRadioButton();
			ivjRbtPrivate.setName("RbtPrivate");
			ivjRbtPrivate.setText("Private");
			ivjRbtPrivate.setBounds(166, 126, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtPrivate;
}
/**
 * Return the RbtProtected property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtProtected() {
	if (ivjRbtProtected == null) {
		try {
			ivjRbtProtected = new javax.swing.JRadioButton();
			ivjRbtProtected.setName("RbtProtected");
			ivjRbtProtected.setText("Protected");
			ivjRbtProtected.setBounds(166, 102, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtProtected;
}
/**
 * Return the RbtPublic property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtPublic() {
	if (ivjRbtPublic == null) {
		try {
			ivjRbtPublic = new javax.swing.JRadioButton();
			ivjRbtPublic.setName("RbtPublic");
			ivjRbtPublic.setText("Public");
			ivjRbtPublic.setBounds(166, 78, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtPublic;
}
/**
 * Return the RbtSequential property value.
 * @return javax.swing.JRadioButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JRadioButton getRbtSequential() {
	if (ivjRbtSequential == null) {
		try {
			ivjRbtSequential = new javax.swing.JRadioButton();
			ivjRbtSequential.setName("RbtSequential");
			ivjRbtSequential.setText("Sequential");
			ivjRbtSequential.setBounds(464, 78, 120, 22);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjRbtSequential;
}
/**
 * Return the ScpAttributes property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpParameters() {
	if (ivjScpParameters == null) {
		try {
			ivjScpParameters = new javax.swing.JScrollPane();
			ivjScpParameters.setName("ScpParameters");
			ivjScpParameters.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			ivjScpParameters.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			getScpParameters().setViewportView(getTblParameters());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpParameters;
}
/**
 * Return the TbcAttributeName property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcAttributeName() {
	if (ivjTbcAttributeName == null) {
		try {
			ivjTbcAttributeName = new javax.swing.table.TableColumn();
			ivjTbcAttributeName.setHeaderValue("Name");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcAttributeName;
}
/**
 * Return the TbcAttributeType property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcAttributeType() {
	if (ivjTbcAttributeType == null) {
		try {
			ivjTbcAttributeType = new javax.swing.table.TableColumn();
			ivjTbcAttributeType.setHeaderValue("Type");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcAttributeType;
}
/**
 * Return the TbcKind property value.
 * @return javax.swing.table.TableColumn
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.table.TableColumn getTbcKind() {
	if (ivjTbcKind == null) {
		try {
			ivjTbcKind = new javax.swing.table.TableColumn();
			ivjTbcKind.setHeaderValue("Kind");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTbcKind;
}
/**
 * Return the TblAttributes property value.
 * @return javax.swing.JTable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTable getTblParameters() {
	if (ivjTblParameters == null) {
		try {
			javax.swing.table.DefaultTableColumnModel ivjLocalColumnModel;
			ivjLocalColumnModel = new javax.swing.table.DefaultTableColumnModel();
			ivjLocalColumnModel.setSelectionModel(getLocalColumnModelDefaultListSelectionModel());
			ivjTblParameters = new javax.swing.JTable();
			ivjTblParameters.setName("TblParameters");
			getScpParameters().setColumnHeaderView(ivjTblParameters.getTableHeader());
			getScpParameters().getViewport().setBackingStoreEnabled(true);
			ivjTblParameters.setCellSelectionEnabled(false);
			ivjTblParameters.setColumnModel(ivjLocalColumnModel);
			ivjTblParameters.setBounds(0, 0, 200, 200);
			ivjTblParameters.setRowSelectionAllowed(true);
			ivjTblParameters.setEnabled(true);
			ivjTblParameters.addColumn(getTbcAttributeName());
			ivjTblParameters.addColumn(getTbcAttributeType());
			ivjTblParameters.addColumn(getTbcKind());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTblParameters;
}

/**
 * Return the TbpPane property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTabbedPane getTbpPane() {
	if (ivjTbpPane == null) {
		try {
			ivjTbpPane = new javax.swing.JTabbedPane();
			ivjTbpPane.setName("TbpPane");
			ivjTbpPane.insertTab(getDescriptionString(), null, getPnlDescription(), null, 0);
			ivjTbpPane.insertTab(getDetailString(), null, getPnlDetail(), null, 1);
			ivjTbpPane.insertTab(resources.getString("TbpParameter_text"), null, getPnlParameter(), null, 2);
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
	getBtnReturnType().addActionListener(ivjEventHandler);
	getMniOpenParameterSpecication().addActionListener(ivjEventHandler);
	getMniNewParameter().addActionListener(ivjEventHandler);
	getMniRemoveParameter().addActionListener(ivjEventHandler);
	getScpParameters().addMouseListener(ivjEventHandler);
	getTblParameters().addMouseListener(ivjEventHandler);
	getMniMoveDown().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("OperationDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(638, 377);
		setTitle("Operation");
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	setTitle(resources.getString("CTDialog"));
	javax.swing.ButtonGroup group = new javax.swing.ButtonGroup();
	group.add(getRbtInstance());
	group.add(getRbtClassifier());

	group = new javax.swing.ButtonGroup();
	group.add(getRbtPackage());
	group.add(getRbtPrivate());
	group.add(getRbtProtected());
	group.add(getRbtPublic());

	group = new javax.swing.ButtonGroup();
	group.add(getRbtGuarded());
	group.add(getRbtSequential());
	group.add(getRbtConcurrent());
	// user code end
}
/**
 * Move down selected Parameter in Parameters-List.
 */
private void mniMoveDownParameter() {
LauncherView.getInstance().nyi("Move down Parameter");
/*	int [] selv=getTblParameters().getSelectedRows();
	if(selv.length>0){
		((EditorTableModel)getTblParameters().getModel()).moveRowDown(selv[0]);
	}*/
}
/**
 * @deprecated
 */
private void mniNewParameter() {
	newObject(null);
}
/**
 * @deprecated
 */
private void mniOpenParameterSpecification() {
	changeObjects(null);
}
/**
 * @deprecated
 */
private void mniRemoveParameter() {
	removeObjects(null);
}
/**
 * Update Model.
 * @see okPressed()
 * @see applyPressed
 */
protected boolean save() {
	if (!ElementUtils.trySetName(operation, getTxtName().getText())) {
		return false;
	}

	getPnlDescription().getObject();

	// page details
	operation.setAbstract(getChxAbstract().isSelected());
	operation.setLeaf(getChxFinal().isSelected());
	if (getRbtClassifier().isSelected()) {
		operation.setOwnerScope(ch.ehi.uml1_4.foundation.datatypes.ScopeKind.CLASSIFIER);
	} else {
		operation.setOwnerScope(ch.ehi.uml1_4.foundation.datatypes.ScopeKind.INSTANCE);
	}
	if (getRbtPrivate().isSelected()) {
		operation.setVisibility(VisibilityKind.PRIVATE);
	} else if (getRbtProtected().isSelected()){
		operation.setVisibility(VisibilityKind.PROTECTED);
	} else if (getRbtPackage().isSelected()){
		operation.setVisibility(VisibilityKind.PACKAGE);
	} else {
		operation.setVisibility(VisibilityKind.PUBLIC);
	}
	if (getRbtGuarded().isSelected()){
		operation.setConcurrency(CallConcurrencyKind.GUARDED);
	} else if (getRbtConcurrent().isSelected()){
		operation.setConcurrency(CallConcurrencyKind.CONCURRENT);
	} else {
		operation.setConcurrency(CallConcurrencyKind.SEQUENTIAL);
	}
	
	return super.save();
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
	operation = (UmlOperation)element;

	// general & page Description
	getTxtName().setText(operation.getDefLangName());
	getPnlDescription().setObject(element);

	// page Details
	getChxAbstract().setSelected(operation.isAbstract());
	getChxFinal().setSelected(operation.isLeaf());
	if (operation.getOwnerScope() == ch.ehi.uml1_4.foundation.datatypes.ScopeKind.INSTANCE) {
		getRbtInstance().setSelected(true);
	} else {
		getRbtClassifier().setSelected(true);
	}
	switch (operation.getVisibility()) {
		case VisibilityKind.PRIVATE:
			getRbtPrivate().setSelected(true);
			break;
		case VisibilityKind.PROTECTED:
			getRbtProtected().setSelected(true);
			break;
		case VisibilityKind.PACKAGE:
			getRbtPackage().setSelected(true);
			break;
		default:
			getRbtPublic().setSelected(true);
			break;
	}
	switch (operation.getConcurrency()) {
	case CallConcurrencyKind.GUARDED:
		getRbtGuarded().setSelected(true);
		break;
	case CallConcurrencyKind.CONCURRENT:
		getRbtConcurrent().setSelected(true);
		break;
	default:
		getRbtSequential().setSelected(true);
		break;
	}
	
	// page parameters
	Iterator iterator = operation.iteratorParameter();
	getTblParameters().setModel(new EditorTableModel());
	UmlParameter returnValue = ((EditorTableModel)getTblParameters().getModel()).setUmlParameter(iterator);
	// set Return type
	getTxtReturnValue().setText("" + (returnValue == null ? "" : returnValue.getDefLangName()));
}

public void changeObjects(Object source) {
    try {
        ((EditorTableModel)getTblParameters().getModel()).showSpecification(getTblParameters().getSelectedRows());
    } catch(Throwable e) {
        handleException(e);
    }
}
public void copyObject(Object source) {
    // TODO Auto-generated method stub
    
}
public void newObject(Object source) {
    try {
        // update model
        ch.ehi.uml1_4.implementation.UmlParameter parameter = ElementFactory.createUmlParameter(operation);
        // update view
        ((EditorTableModel)getTblParameters().getModel()).addRowElement(parameter);
    } catch(Throwable e) {
        handleException(e);
    }
}
public void removeObjects(Object source) {
    try {
        ((EditorTableModel)getTblParameters().getModel()).removeRows(getTblParameters().getSelectedRows());
    } catch(Throwable e) {
        handleException(e);
    }
}
}
