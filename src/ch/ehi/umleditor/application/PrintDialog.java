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
/**
 * User Interface for a print dialog.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:50 $
 */
public class PrintDialog extends BaseDialog {
private static java.util.ResourceBundle resPrintDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/PrintDialog");   //$NON-NLS-1$
private javax.swing.JPanel ivjBaseDialogContentPane = null;
IvjEventHandler ivjEventHandler = new IvjEventHandler();
private javax.swing.JCheckBox ivjChxCurrentDiagram = null;
private javax.swing.JButton ivjBtnCancel = null;
private javax.swing.JButton ivjBtnOk = null;

class IvjEventHandler implements java.awt.event.ActionListener {
public void actionPerformed(java.awt.event.ActionEvent e) {
								if (e.getSource() == PrintDialog.this.getBtnCancel())
																connEtoC1(e);
								if (e.getSource() == PrintDialog.this.getBtnOk())
																connEtoC2(e);
};
};
/**
 * PrintDialog constructor comment.
 * @param owner java.awt.Frame
 */
public PrintDialog(java.awt.Frame owner) {
								super(owner, true);
								initialize();
								setRelativeLocation(owner);
								show();
}
/**
 * Constructor
 * @param owner Symbol
 * @param modal Symbol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public PrintDialog(java.awt.Frame owner, boolean modal) {
								super(owner, modal);
								initialize();
}
/**
 * connEtoC1:  (JButton11.action.actionPerformed(java.awt.event.ActionEvent) --> PrintDialog.cancelPressed()V)
 * @param arg1 java.awt.event.ActionEvent
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
 * connEtoC2:  (JButton1.action.actionPerformed(java.awt.event.ActionEvent) --> PrintDialog.okPressed()V)
 * @param arg1 java.awt.event.ActionEvent
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

																								java.awt.GridBagConstraints constraintsChxCurrentDiagram = new java.awt.GridBagConstraints();
																								constraintsChxCurrentDiagram.gridx = 0; constraintsChxCurrentDiagram.gridy = 0;
																								constraintsChxCurrentDiagram.gridwidth = 2;
																								constraintsChxCurrentDiagram.ipadx = 12;
																								constraintsChxCurrentDiagram.insets = new java.awt.Insets(7, 37, 23, 113);
																								getBaseDialogContentPane().add(getChxCurrentDiagram(), constraintsChxCurrentDiagram);

																								java.awt.GridBagConstraints constraintsBtnOk = new java.awt.GridBagConstraints();
																								constraintsBtnOk.gridx = 0; constraintsBtnOk.gridy = 1;
																								constraintsBtnOk.ipadx = 50;
																								constraintsBtnOk.insets = new java.awt.Insets(24, 38, 22, 4);
																								getBaseDialogContentPane().add(getBtnOk(), constraintsBtnOk);

																								java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
																								constraintsBtnCancel.gridx = 1; constraintsBtnCancel.gridy = 1;
																								constraintsBtnCancel.ipadx = 4;
																								constraintsBtnCancel.insets = new java.awt.Insets(24, 5, 22, 42);
																								getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);
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
 * Return the JButton11 property value.
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
																								ivjBtnOk.setEnabled(true);
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
 * Return the JRadioButton2 property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxCurrentDiagram() {
								if (ivjChxCurrentDiagram == null) {
																try {
																								ivjChxCurrentDiagram = new javax.swing.JCheckBox();
																								ivjChxCurrentDiagram.setName("ChxCurrentDiagram");
																								ivjChxCurrentDiagram.setSelected(false);
																								ivjChxCurrentDiagram.setText(resPrintDialog.getString("ChxCurrentDiagram_text"));
																								// user code begin {1}
																								// user code end
																} catch (java.lang.Throwable ivjExc) {
																								// user code begin {2}
																								// user code end
																								handleException(ivjExc);
																}
								}
								return ivjChxCurrentDiagram;
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
								getBtnCancel().addActionListener(ivjEventHandler);
								getBtnOk().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
								try {
																// user code begin {1}
																// user code end
																setName("PrintDialog");
																setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
																setSize(291, 188);
																setTitle(resPrintDialog.getString("PrintDialog_title"));
																setContentPane(getBaseDialogContentPane());
																initConnections();
								} catch (java.lang.Throwable ivjExc) {
																handleException(ivjExc);
								}
								// user code begin {2}
								getChxCurrentDiagram().setEnabled(LauncherView.getInstance().getCurrentClassDiagram() != null);
								// user code end
}
/**
 * @return boolean whether saving was successful or not
 */
protected boolean save() {
								if (getChxCurrentDiagram().isSelected()) {
																LauncherView.getInstance().printClassDiagram(LauncherView.getInstance().getCurrentClassDiagram());
								}

								return super.save();
}
}
