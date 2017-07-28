package ch.ehi.umleditor.application;

import java.util.HashSet;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.tree.*;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.Artifact;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.umleditor.objectcatalog.ObjectCatalog;

import javax.swing.tree.MutableTreeNode;

public class ModellanguageDialog extends ch.softenvironment.view.BaseDialog {
static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(ModellanguageDialog.class);

private String selectedLanguage=null;
class IvjEventHandler implements java.awt.event.ActionListener {
public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == ModellanguageDialog.this.getBtnCancel())
                connEtoC1(e);
        if (e.getSource() == ModellanguageDialog.this.getBtnOk())
                connEtoC2(e);
};
};
private javax.swing.JPanel ivjBaseDialogContentPane = null;
private javax.swing.JButton ivjBtnCancel = null;
private javax.swing.JButton ivjBtnOk = null;
IvjEventHandler ivjEventHandler = new IvjEventHandler();
private JComboBox ivjCbxLanguage=null;
private javax.swing.JLabel ivjLblLanguage=null;
public ModellanguageDialog(java.awt.Dialog owner, String title, boolean modal) {
        super(owner, title, modal);
        initialize();
        if(title!=null) {
                setTitle(title);
        }
        show();
}
public ModellanguageDialog(java.awt.Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        initialize();
        if(title!=null) {
                setTitle(title);
        }
        show();
}
/**
 * connEtoC1:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> PackageSelectionDialog.cancelPressed()V)
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
 * connEtoC2:  (BtnOk.action.actionPerformed(java.awt.event.ActionEvent) --> PackageSelectionDialog.okPressed()V)
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

                        javax.swing.JPanel btnPane = new javax.swing.JPanel();
                        btnPane.setLayout( new java.awt.GridLayout(1,0,5,0));
                        btnPane.add(getBtnOk());
                        btnPane.add(getBtnCancel());

                        java.awt.GridBagConstraints constraintsBtnPane = new java.awt.GridBagConstraints();
                        constraintsBtnPane.gridx = 0; constraintsBtnPane.gridy = 2;
                        constraintsBtnPane.gridwidth = 2;
                        constraintsBtnPane.anchor = java.awt.GridBagConstraints.SOUTHEAST;
                        constraintsBtnPane.weightx = 1.0;
                        constraintsBtnPane.weighty = 1.0;
                        constraintsBtnPane.insets = new java.awt.Insets(5, 5, 5, 5);
                        getBaseDialogContentPane().add(btnPane, constraintsBtnPane);

                        java.awt.GridBagConstraints constraintsCbxLanguage = new java.awt.GridBagConstraints();
                        constraintsCbxLanguage.gridx = 1; constraintsCbxLanguage.gridy = 1;
                        constraintsCbxLanguage.fill = java.awt.GridBagConstraints.HORIZONTAL;
                        constraintsCbxLanguage.weightx = 1.0;
                        constraintsCbxLanguage.weighty = 1.0;
                        constraintsCbxLanguage.insets = new java.awt.Insets(5, 5, 5, 5);
                        getBaseDialogContentPane().add(getCbxLanguage(), constraintsCbxLanguage);

                        java.awt.GridBagConstraints constraintsLblLanguage = new java.awt.GridBagConstraints();
                        constraintsLblLanguage.gridx = 0; constraintsLblLanguage.gridy = 1;
                        constraintsLblLanguage.anchor = java.awt.GridBagConstraints.WEST;
                        constraintsLblLanguage.insets = new java.awt.Insets(5, 5, 5, 5);
                        getBaseDialogContentPane().add(getLblLanguage(), constraintsLblLanguage);
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
 * Return the BtnOk property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnOk() {
        if (ivjBtnOk == null) {
                try {
                        ivjBtnOk = new javax.swing.JButton();
                        ivjBtnOk.setName("BtnOk");
                        ivjBtnOk.setText("OK");
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
/** returns the language selected by the user
 */
public String getSelectedLanguage(){
        return selectedLanguage;
}
/**
 * Return the TreTree property value.
 * @return javax.swing.JTree
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private JComboBox getCbxLanguage(){
        if (ivjCbxLanguage == null) {
                try {
                        ivjCbxLanguage = new JComboBox();
                        ivjCbxLanguage.setName("CbxLanguage");
                        ivjCbxLanguage.setEditable(true);
                        // user code begin {1}
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjCbxLanguage;
}
private javax.swing.JLabel getLblLanguage() {
        if (ivjLblLanguage == null) {
                try {
                        ivjLblLanguage = new javax.swing.JLabel();
                        ivjLblLanguage.setName("LblLanguage");
                        ivjLblLanguage.setText("Language");
                        // user code begin {1}
                        ivjLblLanguage.setText(rsrc.getString("LblLanguage_text"));
                        // user code end
                } catch (java.lang.Throwable ivjExc) {
                        // user code begin {2}
                        // user code end
                        handleException(ivjExc);
                }
        }
        return ivjLblLanguage;
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
                setName("ModellanguageDialog");
                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setSize(426, 240);
                setTitle("<Modellanguage>");
                setContentPane(getBaseDialogContentPane());
                initConnections();
        } catch (java.lang.Throwable ivjExc) {
                handleException(ivjExc);
        }
        // user code begin {2}

        // get the languages
        Set languages = new HashSet();
        {
                java.util.Set set = ch.ehi.interlis.tools.ModelElementUtility.getChildElements(LauncherView.getInstance().getModel(), INTERLIS2Def.class);
                java.util.Iterator iterator = set.iterator();
                set=new HashSet();
                while(iterator.hasNext()) {
                        INTERLIS2Def def=(INTERLIS2Def)iterator.next();
                        set.addAll(ch.ehi.interlis.tools.ModelElementUtility.getChildElements(def, ModelDef.class));
                }
                iterator=set.iterator();
                while (iterator.hasNext()) {
                        ModelDef modelDef = (ModelDef)iterator.next();
                        // 1) get the BaseLanguage
                        if (modelDef.getBaseLanguage() != null) {
                                languages.add(modelDef.getBaseLanguage());
                        }
                        // 2) get the ValidSecondLanguages
                        languages.addAll(modelDef.getValidSecondLanguages());
                }

        }
        String lang = NlsString.getDefaultLanguage();
        languages.add(lang);
        getCbxLanguage().setModel(new DefaultComboBoxModel(new java.util.Vector(languages)));
        getCbxLanguage().setSelectedItem(lang);
        // user code end
}
/**
 * Overwrites in case OK-Button was pressed.
 * @return boolean whether saving was successful or not
 */
protected boolean save() {
        selectedLanguage=ch.ehi.basics.tools.StringUtility.purge((String)getCbxLanguage().getSelectedItem());
        return super.save();
}
}
