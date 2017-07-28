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
import java.util.Set;

import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.umleditor.umlpresentation.Diagram;
/**
 * Show a Find-Dialog to search for Elements in the model.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2006-01-02 16:16:48 $
 */
public class FindDialog extends ch.softenvironment.view.BaseDialog {
private static java.util.ResourceBundle resources = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/FindDialog");
private java.util.Set results = null;
private javax.swing.JPanel ivjBaseDialogContentPane = null;
private javax.swing.JButton ivjBtnCancel = null;
private javax.swing.JButton ivjBtnSearch = null;
private javax.swing.JCheckBox ivjChxIgnoreCase = null;
private javax.swing.JCheckBox ivjChxUseDocument = null;
private javax.swing.JCheckBox ivjChxUseName = null;
private javax.swing.JLabel ivjLblName = null;
private javax.swing.JLabel ivjLblSearchList = null;
private javax.swing.JList ivjLstSearchList = null;
private javax.swing.JScrollPane ivjScpSearchList = null;
private javax.swing.JTextField ivjTxtName = null;
IvjEventHandler ivjEventHandler = new IvjEventHandler();

class IvjEventHandler implements java.awt.event.ActionListener, javax.swing.event.ListSelectionListener {
public void actionPerformed(java.awt.event.ActionEvent e) {
								if (e.getSource() == FindDialog.this.getBtnSearch())
																connEtoC1(e);
								if (e.getSource() == FindDialog.this.getBtnCancel())
																connEtoC2(e);
};
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
								if (e.getSource() == FindDialog.this.getLstSearchList())
																connEtoC3(e);
};
};
/**
 * FindDialog constructor comment.
 * @param owner java.awt.Frame
 * @param modal boolean
 */
public FindDialog(java.awt.Frame owner, boolean modal) {
								super(owner, modal);
								initialize();
								java.awt.Point parentOrigin = owner.getLocation();
								setLocation((int)parentOrigin.getX() + 250, (int)parentOrigin.getY() + 40);
								show();
}
public FindDialog(java.awt.Frame owner, boolean modal, Set results, String title) {
								super(owner, modal);
								initialize();
								java.awt.Point parentOrigin = owner.getLocation();
								setLocation((int)parentOrigin.getX() + 250, (int)parentOrigin.getY() + 40);

								setTitle(title);
								getLblName().setVisible(false);
								getTxtName().setVisible(false);
								getChxIgnoreCase().setVisible(false);
								getChxUseDocument().setVisible(false);
								getChxUseName().setVisible(false);
								getBtnSearch().setVisible(false);

								showResults(results);
								show();
}
/**
 * connEtoC1:  (BtnSearch.action.actionPerformed(java.awt.event.ActionEvent) --> FindDialog.search()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
								try {
																// user code begin {1}
																// user code end
																this.search();
																// user code begin {2}
																// user code end
								} catch (java.lang.Throwable ivjExc) {
																// user code begin {3}
																// user code end
																handleException(ivjExc);
								}
}
/**
 * connEtoC2:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> FindDialog.cancelPressed()V)
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
 * connEtoC3:  (LstSearchList.listSelection.valueChanged(javax.swing.event.ListSelectionEvent) --> FindDialog.selectElement(Ljavax.swing.event.ListSelectionEvent;)V)
 * @param arg1 javax.swing.event.ListSelectionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(javax.swing.event.ListSelectionEvent arg1) {
								try {
																// user code begin {1}
																// user code end
																this.selectElement(arg1);
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
																								constraintsLblName.anchor = java.awt.GridBagConstraints.NORTHWEST;
																								constraintsLblName.ipadx = 104;
																								constraintsLblName.insets = new java.awt.Insets(15, 16, 11, 1);
																								getBaseDialogContentPane().add(getLblName(), constraintsLblName);

																								java.awt.GridBagConstraints constraintsTxtName = new java.awt.GridBagConstraints();
																								constraintsTxtName.gridx = 2; constraintsTxtName.gridy = 1;
																								constraintsTxtName.gridwidth = 2;
																								constraintsTxtName.fill = java.awt.GridBagConstraints.HORIZONTAL;
																								constraintsTxtName.anchor = java.awt.GridBagConstraints.NORTHWEST;
																								constraintsTxtName.weightx = 1.0;
																								constraintsTxtName.ipadx = 246;
																								constraintsTxtName.insets = new java.awt.Insets(12, 2, 8, 17);
																								getBaseDialogContentPane().add(getTxtName(), constraintsTxtName);

																								java.awt.GridBagConstraints constraintsChxIgnoreCase = new java.awt.GridBagConstraints();
																								constraintsChxIgnoreCase.gridx = 1; constraintsChxIgnoreCase.gridy = 4;
																								constraintsChxIgnoreCase.gridwidth = 2;
																								constraintsChxIgnoreCase.anchor = java.awt.GridBagConstraints.NORTHWEST;
																								constraintsChxIgnoreCase.ipadx = 36;
																								constraintsChxIgnoreCase.insets = new java.awt.Insets(2, 16, 7, 12);
																								getBaseDialogContentPane().add(getChxIgnoreCase(), constraintsChxIgnoreCase);

																								java.awt.GridBagConstraints constraintsChxUseDocument = new java.awt.GridBagConstraints();
																								constraintsChxUseDocument.gridx = 1; constraintsChxUseDocument.gridy = 3;
																								constraintsChxUseDocument.gridwidth = 2;
																								constraintsChxUseDocument.anchor = java.awt.GridBagConstraints.NORTHWEST;
																								constraintsChxUseDocument.ipadx = 21;
																								constraintsChxUseDocument.insets = new java.awt.Insets(3, 16, 2, 12);
																								getBaseDialogContentPane().add(getChxUseDocument(), constraintsChxUseDocument);

																								java.awt.GridBagConstraints constraintsChxUseName = new java.awt.GridBagConstraints();
																								constraintsChxUseName.gridx = 1; constraintsChxUseName.gridy = 2;
																								constraintsChxUseName.gridwidth = 2;
																								constraintsChxUseName.anchor = java.awt.GridBagConstraints.NORTHWEST;
																								constraintsChxUseName.ipadx = 67;
																								constraintsChxUseName.insets = new java.awt.Insets(8, 16, 2, 12);
																								getBaseDialogContentPane().add(getChxUseName(), constraintsChxUseName);

																								java.awt.GridBagConstraints constraintsBtnSearch = new java.awt.GridBagConstraints();
																								constraintsBtnSearch.gridx = 1; constraintsBtnSearch.gridy = 7;
																								constraintsBtnSearch.gridwidth = 2;
																								constraintsBtnSearch.fill = java.awt.GridBagConstraints.HORIZONTAL;
																								constraintsBtnSearch.ipadx = 30;
																								constraintsBtnSearch.insets = new java.awt.Insets(5, 112, 11, 5);
																								getBaseDialogContentPane().add(getBtnSearch(), constraintsBtnSearch);

																								java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
																								constraintsBtnCancel.gridx = 3; constraintsBtnCancel.gridy = 7;
																								constraintsBtnCancel.fill = java.awt.GridBagConstraints.HORIZONTAL;
																								constraintsBtnCancel.ipadx = 10;
																								constraintsBtnCancel.insets = new java.awt.Insets(5, 5, 11, 90);
																								getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

																								java.awt.GridBagConstraints constraintsScpSearchList = new java.awt.GridBagConstraints();
																								constraintsScpSearchList.gridx = 1; constraintsScpSearchList.gridy = 6;
																								constraintsScpSearchList.gridwidth = 3;
																								constraintsScpSearchList.fill = java.awt.GridBagConstraints.BOTH;
																								constraintsScpSearchList.anchor = java.awt.GridBagConstraints.NORTHWEST;
																								constraintsScpSearchList.weightx = 1.0;
																								constraintsScpSearchList.weighty = 1.0;
																								constraintsScpSearchList.ipadx = 376;
																								constraintsScpSearchList.ipady = 74;
																								constraintsScpSearchList.insets = new java.awt.Insets(5, 16, 5, 12);
																								getBaseDialogContentPane().add(getScpSearchList(), constraintsScpSearchList);

																								java.awt.GridBagConstraints constraintsLblSearchList = new java.awt.GridBagConstraints();
																								constraintsLblSearchList.gridx = 1; constraintsLblSearchList.gridy = 5;
																								constraintsLblSearchList.anchor = java.awt.GridBagConstraints.NORTHWEST;
																								constraintsLblSearchList.ipadx = 44;
																								constraintsLblSearchList.insets = new java.awt.Insets(7, 16, 4, 1);
																								getBaseDialogContentPane().add(getLblSearchList(), constraintsLblSearchList);
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
 * Return the BtnSearch property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnSearch() {
								if (ivjBtnSearch == null) {
																try {
																								ivjBtnSearch = new javax.swing.JButton();
																								ivjBtnSearch.setName("BtnSearch");
																								ivjBtnSearch.setText("Suchen");
																								// user code begin {1}
																								ivjBtnSearch.setText(resources.getString("BtnSearch_text"));
																								// user code end
																} catch (java.lang.Throwable ivjExc) {
																								// user code begin {2}
																								// user code end
																								handleException(ivjExc);
																}
								}
								return ivjBtnSearch;
}
/**
 * Return the ChxIgnoreCase property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxIgnoreCase() {
								if (ivjChxIgnoreCase == null) {
																try {
																								ivjChxIgnoreCase = new javax.swing.JCheckBox();
																								ivjChxIgnoreCase.setName("ChxIgnoreCase");
																								ivjChxIgnoreCase.setText("GROSS/klein  ignorieren");
																								// user code begin {1}
																								ivjChxIgnoreCase.setText(resources.getString("ChxIngoreCase_text"));
																								// user code end
																} catch (java.lang.Throwable ivjExc) {
																								// user code begin {2}
																								// user code end
																								handleException(ivjExc);
																}
								}
								return ivjChxIgnoreCase;
}
/**
 * Return the ChxUseDocument property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxUseDocument() {
								if (ivjChxUseDocument == null) {
																try {
																								ivjChxUseDocument = new javax.swing.JCheckBox();
																								ivjChxUseDocument.setName("ChxUseDocument");
																								ivjChxUseDocument.setToolTipText("Element-Bescheibung");
																								ivjChxUseDocument.setText("Beschreibung einbeziehen");
																								// user code begin {1}
																								ivjChxUseDocument.setText(resources.getString("ChxUseDescription_text"));
																								// user code end
																} catch (java.lang.Throwable ivjExc) {
																								// user code begin {2}
																								// user code end
																								handleException(ivjExc);
																}
								}
								return ivjChxUseDocument;
}
/**
 * Return the ChxUseName property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxUseName() {
								if (ivjChxUseName == null) {
																try {
																								ivjChxUseName = new javax.swing.JCheckBox();
																								ivjChxUseName.setName("ChxUseName");
																								ivjChxUseName.setText("Name einbeziehen");
																								// user code begin {1}
																								ivjChxUseName.setText(resources.getString("ChxUseName_text"));
																								// user code end
																} catch (java.lang.Throwable ivjExc) {
																								// user code begin {2}
																								// user code end
																								handleException(ivjExc);
																}
								}
								return ivjChxUseName;
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
 * Return the LblSearchList property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblSearchList() {
								if (ivjLblSearchList == null) {
																try {
																								ivjLblSearchList = new javax.swing.JLabel();
																								ivjLblSearchList.setName("LblSearchList");
																								ivjLblSearchList.setText("Suchergebnisse:");
																								// user code begin {1}
																								ivjLblSearchList.setText(resources.getString("LblSearchList_text"));
																								// user code end
																} catch (java.lang.Throwable ivjExc) {
																								// user code begin {2}
																								// user code end
																								handleException(ivjExc);
																}
								}
								return ivjLblSearchList;
}
/**
 * Return the LstSearchList property value.
 * @return javax.swing.JList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JList getLstSearchList() {
								if (ivjLstSearchList == null) {
																try {
																								ivjLstSearchList = new javax.swing.JList();
																								ivjLstSearchList.setName("LstSearchList");
																								ivjLstSearchList.setBounds(0, 0, 160, 120);
																								ivjLstSearchList.setEnabled(true);
																								ivjLstSearchList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
																								// user code begin {1}
																								// user code end
																} catch (java.lang.Throwable ivjExc) {
																								// user code begin {2}
																								// user code end
																								handleException(ivjExc);
																}
								}
								return ivjLstSearchList;
}
/**
 * Return the ScpSearchList property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpSearchList() {
								if (ivjScpSearchList == null) {
																try {
																								ivjScpSearchList = new javax.swing.JScrollPane();
																								ivjScpSearchList.setName("ScpSearchList");
																								getScpSearchList().setViewportView(getLstSearchList());
																								// user code begin {1}
																								// user code end
																} catch (java.lang.Throwable ivjExc) {
																								// user code begin {2}
																								// user code end
																								handleException(ivjExc);
																}
								}
								return ivjScpSearchList;
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
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
								// user code begin {1}
								// user code end
								getBtnSearch().addActionListener(ivjEventHandler);
								getBtnCancel().addActionListener(ivjEventHandler);
								getLstSearchList().addListSelectionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
								try {
																// user code begin {1}
																// user code end
																setName("FindDialog");
																setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
																setSize(426, 302);
																setTitle("Suchen");
																setContentPane(getBaseDialogContentPane());
																initConnections();
								} catch (java.lang.Throwable ivjExc) {
																handleException(ivjExc);
								}
								// user code begin {2}
								setTitle(resources.getString("CTTitle"));
								getChxUseName().setSelected(true);
								getChxIgnoreCase().setSelected(true);
								// user code end
}
/**
 * Search in Model.
 */
private void search() {
								try {
//		results = null;

																ch.ehi.uml1_4.tools.DefaultFindCondition condition = new ch.ehi.uml1_4.tools.DefaultFindCondition();
																condition.setText(getTxtName().getText());
																condition.setSearchInName(getChxUseName().isSelected());
																condition.setSearchInDocumentation(getChxUseDocument().isSelected());
																condition.setIgnoreCase(getChxIgnoreCase().isSelected());

																results = ch.ehi.uml1_4.tools.NamespaceUtility.deepFindOwnedElements(LauncherView.getInstance().getModel(), condition);
																showResults(results);
								} catch(Throwable e) {
																super.handleException(e);
								}
}
private void showResults(Set results) {
								getLstSearchList().removeAll();
								this.results = results;

								java.util.Iterator iterator = results.iterator();
								java.util.Vector names = new java.util.Vector();
								while (iterator.hasNext()) {
																Object object = iterator.next();
																if (object instanceof ModelElement) {
//      ModelElement element = (ModelElement)iterator.next();
																								names.add(ElementUtils.formatWithPackageName((ModelElement)object));
																} else if (object instanceof Diagram) {
																								names.add(((Diagram)object).getName().getValue());
																}
								}
								getLstSearchList().setListData(names);
}
/**
 * Select Element in Browser.
 */
private void selectElement(javax.swing.event.ListSelectionEvent listSelectionEvent) {
								int index = getLstSearchList().getSelectedIndex();
								if (index >= 0) {
																java.util.Iterator iterator = results.iterator();
																for (int i=0; i<index; i++) {
																								iterator.next();
																}
																Element element = (Element)iterator.next();
																LauncherView.getInstance().getPnlNavigation().selectElement(element);
								}
}
}
