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
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.softenvironment.view.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.softenvironment.util.*;
/**
 * Generic User Interface Panel to treat INTERLIS-EXTENDS.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.4 $ $Date: 2005-02-23 16:40:03 $
 */
public class ExtendedPanel extends javax.swing.JPanel {
	private static java.util.ResourceBundle resExtendedPanel = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/ExtendedPanel");
	private Generalization currentGeneralization = null;
	private GeneralizableElement generalizableElement = null;
	private ReferencableComboBox ivjCbxExtends = null;
	private javax.swing.JCheckBox ivjChxExtended = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JLabel ivjLblExtends = null;

class IvjEventHandler implements java.awt.event.ItemListener {
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			if (e.getSource() == ExtendedPanel.this.getCbxExtends())
				connEtoC2(e);
		};
	};
/**
 * ExtendedPanel constructor comment.
 */
public ExtendedPanel() {
	super();
	initialize();
}
/**
 * ExtendedPanel constructor comment.
 * @param layout java.awt.LayoutManager
 */
public ExtendedPanel(java.awt.LayoutManager layout) {
	super(layout);
}
/**
 * ExtendedPanel constructor comment.
 * @param layout java.awt.LayoutManager
 * @param isDoubleBuffered boolean
 */
public ExtendedPanel(java.awt.LayoutManager layout, boolean isDoubleBuffered) {
	super(layout, isDoubleBuffered);
}
/**
 * ExtendedPanel constructor comment.
 * @param isDoubleBuffered boolean
 */
public ExtendedPanel(boolean isDoubleBuffered) {
	super(isDoubleBuffered);
}
/**
 * Check Extended.
 */
private void cbxExtends_ItemStateChanged(java.awt.event.ItemEvent itemEvent) {
	if (getCbxExtends().getSelectedIndex() <= 0) {
		// reset extension
		getChxExtended().setEnabled(false);
		getChxExtended().setSelected(false);
	} else {
		getChxExtended().setEnabled(true);
	}
}
/**
 * Check for valid circumstances for "Extension by Name".
 */
private boolean checkNameExtension(String name) {
	if (getChxExtended().isSelected()) {
		String errorMessage = null;
                // check if this class is in topic
                TopicDef topicDef=null;
		if (!((AbstractClassDef)generalizableElement).containsParentTopicDef()) {
			errorMessage = resExtendedPanel.getString("CEClassWithinTopicDef"); //$NON-NLS-1$
		}else{
                   // get topic of this class
                   topicDef = ((AbstractClassDef)generalizableElement).getParentTopicDef();
                }
                // check if base class has the same name
                AbstractClassDef baseClass=null;
                if(errorMessage==null){
                        baseClass=(AbstractClassDef)getCbxExtends().getElement();
			if (!name.equals(baseClass.getDefLangName())) {
				errorMessage = resExtendedPanel.getString("CENameNotEqual"); //$NON-NLS-1$
                        }
                }
                // check if base class is in topic
                TopicDef topicDefBase=null;
                if(errorMessage==null){
		  if (!baseClass.containsParentTopicDef()) {
		    errorMessage = resExtendedPanel.getString("CEBaseClassOutsideTopicDef"); //$NON-NLS-1$
                  }else{
                    topicDefBase = baseClass.getParentTopicDef();
                  }
		}
                // check if base class is in a topic that is the base of the topic of this
                if(errorMessage==null){
                  TopicDef current=topicDef;
                  while(true){
                    if(!current.containsBaseTopicDef()){
		      errorMessage = resExtendedPanel.getString("CETopicDefNoExtension"); //$NON-NLS-1$
                      break;
                    }
                    current=current.getBaseTopicDef();
                    if(current==topicDefBase){
                      // ok; base class is in a topic that is the base of the topic of this
                      break;
                    }
                  }
                }


		if (errorMessage != null) {
		    ch.softenvironment.view.BaseDialog.showError((java.awt.Component)this, resExtendedPanel.getString("CTInvalidExtension"), errorMessage + "\n" + resExtendedPanel.getString("CWResetExtension"), null); //$NON-NLS-3$//$NON-NLS-2$ //$NON-NLS-1$
			getChxExtended().setSelected(false);
			return false;
		}
	}
	return true;
}
/**
 * connEtoC2:  (CbxExtends.item.itemStateChanged(java.awt.event.ItemEvent) --> ExtendedPanel.cbxExtends_ItemStateChanged(Ljava.awt.event.ItemEvent;)V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.cbxExtends_ItemStateChanged(arg1);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the CbxExtends property value.
 * @return ch.ehi.umleditor.application.ReferencableComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ReferencableComboBox getCbxExtends() {
	if (ivjCbxExtends == null) {
		try {
			ivjCbxExtends = new ch.ehi.umleditor.application.ReferencableComboBox();
			ivjCbxExtends.setName("CbxExtends");
			ivjCbxExtends.setEditable(false);
			ivjCbxExtends.setEnabled(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxExtends;
}
/**
 * Return the ChxExtended property value.
 * @return javax.swing.JCheckBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JCheckBox getChxExtended() {
	if (ivjChxExtended == null) {
		try {
			ivjChxExtended = new javax.swing.JCheckBox();
			ivjChxExtended.setName("ChxExtended");
			ivjChxExtended.setText(resExtendedPanel.getString("ChxExtended_text"));
			ivjChxExtended.setEnabled(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjChxExtended;
}
/**
 * Check and save Generalization back to repository if changed.
 * @see #checkNameExtension() makes sure modelChanges will work
 */
public boolean getClassifierExtension(String name) {
	return checkNameExtension(name) && getExtension();
}
/**
 * Check and save Generalization back to repository if changed.
 */
public boolean getExtension() {
	if (getCbxExtends().hasElementChanged()) {
Tracer.getInstance().developerWarning(this, "getExtension()", "INTERLIS implements 1 Generalization only");//$NON-NLS-2$//$NON-NLS-1$
		if (currentGeneralization != null) {
			generalizableElement.removeGeneralization(currentGeneralization);
			currentGeneralization = null;
		}		

		GeneralizableElement parent = (GeneralizableElement)getCbxExtends().getElement();
		if (parent != null) {
			String error = ElementUtils.checkInheritance(parent, generalizableElement);
			if (error != null) {
				BaseDialog.showWarning((java.awt.Component)this,
						resExtendedPanel.getString("CTNoGeneralization"), //$NON-NLS-1$
						error);
				return false;
			}
			try {
				currentGeneralization = ElementFactory.createGeneralization(parent, generalizableElement);
			} catch(Throwable e) {
				handleException(e);
				return false;
			}
		}
	}

	if ((currentGeneralization != null) && (currentGeneralization instanceof ClassExtends)) {
		((ClassExtends)currentGeneralization).setExtended(getChxExtended().isSelected());
	}

	return true;
}
/**
 * Return the LblExtends property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblExtends() {
	if (ivjLblExtends == null) {
		try {
			ivjLblExtends = new javax.swing.JLabel();
			ivjLblExtends.setName("LblExtends");
			ivjLblExtends.setToolTipText(resExtendedPanel.getString("LblExtends_toolTipText"));
			ivjLblExtends.setText("EXTENDS:");	// @see #setExtendables(..)
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblExtends;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
private void handleException(java.lang.Throwable exception) {
	LauncherView.getInstance().handleException(exception);
}
/**
 * Initializes connections
 * @exception java.lang.Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws java.lang.Exception {
	// user code begin {1}
	// user code end
	getCbxExtends().addItemListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("ExtendedPanel");
		setLayout(new java.awt.GridBagLayout());
		setAlignmentY(java.awt.Component.TOP_ALIGNMENT);
		setSize(458, 34);
		setMaximumSize(new java.awt.Dimension(2147483647, 24));

		java.awt.GridBagConstraints constraintsChxExtended = new java.awt.GridBagConstraints();
		constraintsChxExtended.gridx = 1; constraintsChxExtended.gridy = 1;
		constraintsChxExtended.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsChxExtended.ipadx = 55;
		constraintsChxExtended.insets = new java.awt.Insets(0, 0, 2, 5);
		add(getChxExtended(), constraintsChxExtended);

		java.awt.GridBagConstraints constraintsLblExtends = new java.awt.GridBagConstraints();
		constraintsLblExtends.gridx = 2; constraintsLblExtends.gridy = 1;
		constraintsLblExtends.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsLblExtends.ipadx = 84;
		constraintsLblExtends.insets = new java.awt.Insets(5, 5, 5, 5);
		add(getLblExtends(), constraintsLblExtends);

		java.awt.GridBagConstraints constraintsCbxExtends = new java.awt.GridBagConstraints();
		constraintsCbxExtends.gridx = 3; constraintsCbxExtends.gridy = 1;
		constraintsCbxExtends.fill = java.awt.GridBagConstraints.HORIZONTAL;
		constraintsCbxExtends.anchor = java.awt.GridBagConstraints.NORTHWEST;
		constraintsCbxExtends.weightx = 1.0;
		constraintsCbxExtends.ipadx = 26;
		constraintsCbxExtends.ipady = 0;
		constraintsCbxExtends.insets = new java.awt.Insets(1, 5, 3, 6);
		add(getCbxExtends(), constraintsCbxExtends);
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	getChxExtended().setEnabled(false);
	// user code end
}
/**
 * set the element of which this panel shows the extens/extended info
 * @param generalizableElement (ClassDef or AssociationDef)
 * @see #setExtendables()
 */
public void setClassifierExtension(GeneralizableElement generalizableElement) {
	setExtendables(generalizableElement);

	// set the generalization by name
	boolean extended = false;
	if (((AbstractClassDef)generalizableElement).containsParentTopicDef()) {
		TopicDef topicDefThis = ((AbstractClassDef)generalizableElement).getParentTopicDef();
		java.util.Iterator iterator = generalizableElement.iteratorGeneralization();
		if (iterator.hasNext()) {
Tracer.getInstance().developerWarning(this, "setClassifierExtension()", "INTERLIS implements 1 Generalization only");//$NON-NLS-2$//$NON-NLS-1$
			currentGeneralization = (Generalization)iterator.next();
			if ((currentGeneralization instanceof ClassExtends) && topicDefThis.containsBaseTopicDef()) {
				// set extended only as selected if inside an extended topic
				extended = ((ClassExtends)currentGeneralization).isExtended();
			}
		}
	}
	getChxExtended().setSelected(extended);
}
/**
 * Setup Cbx.
 */
private void setExtendables(GeneralizableElement generalizableElement) {
	this.generalizableElement = generalizableElement;

	if (generalizableElement instanceof TopicDef) {
		getLblExtends().setText(resExtendedPanel.getString("LblExtends1_text"));
	} else {
		getLblExtends().setText(resExtendedPanel.getString("LblExtends2_text"));
	}

	// get the current base element
	GeneralizableElement parent = null;
	java.util.Iterator iterator = generalizableElement.iteratorGeneralization();
//	java.util.Set set = ch.ehi.interlis.tools.ModelElementUtility.getReferencableElements((ModelElement)generalizableElement, TopicDef.class);
//	java.util.Iterator iterator = set.iterator();
	if (iterator.hasNext()) {
Tracer.getInstance().developerWarning(this, "setExtendables()", "INTERLIS implements 1 Generalization only");//$NON-NLS-2$//$NON-NLS-1$
		ch.ehi.uml1_4.foundation.core.Generalization generalization = (ch.ehi.uml1_4.foundation.core.Generalization)iterator.next();
		parent = generalization.getParent();
	}

	getCbxExtends().setElement(generalizableElement.getClass(), generalizableElement, parent);
}
/**
 * Show the parent of the given generalization in the dropDownList.
 * @see #setExtendables()
 */
public void setExtension(DomainDef generalizableElement) {
	setExtendables(generalizableElement);
	getChxExtended().setVisible(false);
}
public void setExtension(TopicDef generalizableElement) {
	setExtendables(generalizableElement);
	getChxExtended().setVisible(false);
	getLblExtends().setVisible(false);
}
}
