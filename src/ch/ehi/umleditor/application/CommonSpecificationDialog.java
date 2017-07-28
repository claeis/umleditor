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
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.interlis.constraints.*;
import ch.ehi.interlis.*;
import ch.softenvironment.view.*;
/**
 * User Interface for a common ModelElement without an explicit GUI.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2004-04-27 09:20:44 $
 */
public class CommonSpecificationDialog extends BaseDialog {
/**
 *
 */
private static final long serialVersionUID = 8132412233745703532L;
// ModelElement
ch.ehi.uml1_4.foundation.core.ModelElement modelElement = null;
private javax.swing.JPanel ivjBaseDialogContentPane = null;
IvjEventHandler ivjEventHandler = new IvjEventHandler();
private javax.swing.JButton ivjBtnCancel = null;
private javax.swing.JButton ivjBtnOk = null;
private javax.swing.JTabbedPane ivjTbpGeneral = null;
private javax.swing.JLabel ivjLblName = null;
private javax.swing.JTextField ivjTxtName = null;
private javax.swing.JButton ivjBtnApply = null;
private DescriptionPanel ivjPnlDescription = null;
private InterlisSyntaxPanel ivjPnlSyntax = null;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.FocusListener {
public void actionPerformed(java.awt.event.ActionEvent e) {
								if (e.getSource() == CommonSpecificationDialog.this.getBtnOk())
																connEtoC1(e);
								if (e.getSource() == CommonSpecificationDialog.this.getBtnCancel())
																connEtoC2(e);
								if (e.getSource() == CommonSpecificationDialog.this.getBtnApply())
																connEtoC3(e);
};
public void focusGained(java.awt.event.FocusEvent e) {
								if (e.getSource() == CommonSpecificationDialog.this.getTxtName())
																connEtoM1(e);
};
public void focusLost(java.awt.event.FocusEvent e) {
};
};
/**
 * Constructor
 */
public CommonSpecificationDialog(java.awt.Frame owner, ch.ehi.uml1_4.foundation.core.Element element) {
								super(owner, true);
								initialize();
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
 * connEtoM1:  (TxtName.focus.focusGained(java.awt.event.FocusEvent) --> TxtName.selectAll()V)
 * @param arg1 java.awt.event.FocusEvent
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
																								constraintsLblName.gridx = 0; constraintsLblName.gridy = 0;
																								constraintsLblName.ipadx = 63;
																								constraintsLblName.insets = new java.awt.Insets(22, 15, 6, 4);
																								getBaseDialogContentPane().add(getLblName(), constraintsLblName);

																								java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
																								constraintsTxtName.gridx = 1; constraintsTxtName.gridy = 0;
																								constraintsTxtName.gridwidth = 3;
																								constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
																								constraintsTxtName.weightx = 1.0;
																								constraintsTxtName.ipadx = 285;
																								constraintsTxtName.insets = new java.awt.Insets(19, 4, 3, 15);
																								getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

																								java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
																								constraintsBtnOk.gridx = 0; constraintsBtnOk.gridy = 2;
																								constraintsBtnOk.gridwidth = 2;
																								constraintsBtnOk.ipadx = 64;
																								constraintsBtnOk.insets = new java.awt.Insets(3, 23, 6, 3);
																								getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

																								java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
																								constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 2;
																								constraintsBtnCancel.ipadx = 18;
																								constraintsBtnCancel.insets = new java.awt.Insets(3, 3, 6, 3);
																								getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

																								java.awt.GridBagConstraints constraintsBtnApply = new java.awt.GridBagConstraints();
																								constraintsBtnApply.gridx = 3; constraintsBtnApply.gridy = 2;
																								constraintsBtnApply.ipadx = 8;
																								constraintsBtnApply.insets = new java.awt.Insets(3, 3, 6, 46);
																								getBaseDialogContentPane().add(getBtnApply(), constraintsBtnApply);

																								java.awt.GridBagConstraints constraintsTbpGeneral = new java.awt.GridBagConstraints();
																								constraintsTbpGeneral.gridx = 0; constraintsTbpGeneral.gridy = 1;
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
 * Return the PnlSyntax property value.
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
 * Return the TbpGeneral property value.
 * @return javax.swing.JTabbedPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTabbedPane getTbpGeneral() {
								if (ivjTbpGeneral == null) {
																try {
																								ivjTbpGeneral = new javax.swing.JTabbedPane();
																								ivjTbpGeneral.setName("TbpGeneral");
																								ivjTbpGeneral.insertTab(getDescriptionString(), null, getPnlDescription(), null, 0);
																								ivjTbpGeneral.insertTab(getResourceString("TbpSyntax_text"), null, getPnlSyntax(), null, 1);
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
																setSize(426, 261);
																setTitle("<Generic>(Spezifikation)");
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
								if (!ElementUtils.trySetName(modelElement, getTxtName().getText())) {
																return false;
								}
								getPnlDescription().getObject();

								// syntax
								if (modelElement instanceof ch.ehi.uml1_4.foundation.core.Constraint) {
																((ConstraintExpression)((Constraint)modelElement).getBody()).setSyntax(getPnlSyntax().getConstraint());
								} else if (modelElement instanceof IliSyntax) {
																((IliSyntax)modelElement).setSyntax(getPnlSyntax().getSyntax());
								}

								return super.save();
}
/**
 * Map model to view.
 */
private void setElement(ch.ehi.uml1_4.foundation.core.Element element) {
								modelElement = (ch.ehi.uml1_4.foundation.core.ModelElement)element;

								// general & page Description
								getTxtName().setText(modelElement.getDefLangName());
								getPnlDescription().setObject(modelElement);

								// syntax
								if (element instanceof ch.ehi.uml1_4.foundation.core.Constraint) {
																getPnlSyntax().setConstraint((ch.ehi.uml1_4.foundation.core.Constraint)modelElement);
								} else if (element instanceof IliSyntax) {
																getPnlSyntax().setSyntax((IliSyntax)element);
								} else {
																getTbpGeneral().remove(getPnlSyntax());
//		getPnlSyntax().setVisible(false);
								}
}
}
