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
import java.util.*;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.ehi.interlis.associations.*;
import ch.ehi.interlis.domainsandconstants.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.uml1_4.foundation.core.*;
/**
 * Provide a list of ModelElement's to choose.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:38 $
 */
public class ModelElementSelectionDialog extends ch.softenvironment.view.BaseDialog {
	private static java.util.ResourceBundle resModelElementSelectionDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/ModelElementSelectionDialog");  //$NON-NLS-1$
	private java.util.Iterator iterator = null;
	private java.util.TreeSet referencables = null;
	private ModelDef modelDef = null;
	private RoleDef roleDef = null;
	private TopicDef topicDef = null;
	private AbstractClassDef abstractClassDef = null;
	private DomainDef domainDef = null;
	private java.util.ArrayList selectedItems = new java.util.ArrayList();
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JButton ivjBtnAssign = null;
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JLabel ivjLblClassName = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JList ivjLstModelElements = null;
	private javax.swing.JScrollPane ivjScpModelElements = null;

class IvjEventHandler implements java.awt.event.ActionListener, javax.swing.event.ListSelectionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == ModelElementSelectionDialog.this.getBtnAssign())
				connEtoC1(e);
			if (e.getSource() == ModelElementSelectionDialog.this.getBtnCancel())
				connEtoC2(e);
		};
		public void valueChanged(javax.swing.event.ListSelectionEvent e) {
			if (e.getSource() == ModelElementSelectionDialog.this.getLstModelElements())
				connEtoC3(e);
		};
	};
/**
 * ModelElementSelectionDialog constructor comment.
 * @param owner java.awt.Dialog
 * @param title java.lang.String
 * @param modal boolean
 */
public ModelElementSelectionDialog(java.awt.Dialog owner, String title, boolean modal, RoleDef roleDef) {
	super(owner, title, modal);
	initialize();
	setRestrictedRoleList(roleDef);
	show();
}
/**
 * ModelElementSelectionDialog constructor comment.
 * @param owner java.awt.Dialog
 * @param title java.lang.String
 * @param modal boolean
 */
public ModelElementSelectionDialog(java.awt.Dialog owner, String title, boolean modal, AbstractClassDef abstractClassDef) {
	super(owner, title, modal);
	initialize();
	setDomainList(abstractClassDef);
	show();
}
/**
 * ModelElementSelectionDialog constructor comment.
 * @param owner java.awt.Dialog
 * @param title java.lang.String
 * @param modal boolean
 */
public ModelElementSelectionDialog(java.awt.Dialog owner, String title, boolean modal, ModelDef modelDef) {
	super(owner, title, modal);
	initialize();
	setImportList(modelDef);
	show();
}
/**
 * ModelElementSelectionDialog constructor comment.
 * @param owner java.awt.Dialog
 * @param title java.lang.String
 * @param modal boolean
 */
public ModelElementSelectionDialog(java.awt.Dialog owner, String title, boolean modal, TopicDef topicDef) {
	super(owner, title, modal);
	initialize();
	setTopicDependsList(topicDef);
	show();
}
/** Generic constructor
 *
 */
public ModelElementSelectionDialog(java.awt.Dialog owner, String title, boolean modal, ModelElement context,java.lang.Class aclass) {
	super(owner, title, modal);
	initialize();
	getLblClassName().setText(ElementUtils.getDisplayName(aclass));
	fillList(context, aclass);
	show();
}
/**
 * connEtoC1:  (BtnAssign.action.actionPerformed(java.awt.event.ActionEvent) --> ModelElementSelectionDialog.okPressed()V)
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
 * connEtoC2:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> ModelElementSelectionDialog.cancelPressed()V)
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
 * connEtoC3:  (LstModelElements.listSelection.valueChanged(javax.swing.event.ListSelectionEvent) --> ModelElementSelectionDialog.lstModelElements_ValueChanged()V)
 * @param arg1 javax.swing.event.ListSelectionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(javax.swing.event.ListSelectionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.lstModelElements_ValueChanged();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Fill the list with possible references.
 * The List will be sorted according to ModelElement name with package-name successor, such as:
 *    aTopic (ch.ehi.interlis.modeltopicclass)
 *	  bTopic (ch.softenvironment.topics)
 *     :
 */
private void fillList(ModelElement modelElement, java.lang.Class referenceClass) {
	referencables = new java.util.TreeSet(new ModelElementComparator());

	java.util.Set set = ch.ehi.interlis.tools.ModelElementUtility.getReferencableElements(modelElement, referenceClass);
	java.util.Iterator iterator = set.iterator();
	while (iterator.hasNext()) {
		Object referencableObject = iterator.next();
		java.util.Iterator iteratorDependency = modelElement.iteratorClientDependency();
		boolean found = false;
		while (!found && iteratorDependency.hasNext()) {
			Dependency dependency = (Dependency)iteratorDependency.next();
			java.util.Iterator iteratorSupplier = dependency.iteratorSupplier();
			while (!found && iteratorSupplier.hasNext()) {
				Object supplier = iteratorSupplier.next();
				if (supplier.equals(referencableObject)) {
					// only show not yet mapped Elements
					found = true;
				}
			}
		}
		if (!found) {
			referencables.add(referencableObject);
		}
	}

	// create displayable list (which contains a null Element more in addition to translations)
	// show Referencable Element-Names in Cbx
	Vector names = new Vector();
	names.add(new String());	// allow also an Empty-Element => (+/-)1
	iterator = referencables.iterator();
	while (iterator.hasNext()) {
		ModelElement refModelElement = (ModelElement)iterator.next();
		names.add(ElementUtils.formatWithPackageName(refModelElement));
	}
//	setModel(new javax.swing.DefaultComboBoxModel(names));
	getLstModelElements().setListData(names);
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

			java.awt.GridBagConstraints constraintsLblClassName = new java.awt.GridBagConstraints();
			constraintsLblClassName.gridx = 1; constraintsLblClassName.gridy = 1;
			constraintsLblClassName.ipadx = 67;
			constraintsLblClassName.insets = new java.awt.Insets(17, 13, 5, 22);
			getBaseDialogContentPane().add(getLblClassName(), constraintsLblClassName);

			java.awt.GridBagConstraints constraintsBtnAssign = new java.awt.GridBagConstraints();
			constraintsBtnAssign.gridx = 1; constraintsBtnAssign.gridy = 3;
			constraintsBtnAssign.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsBtnAssign.ipadx = 21;
			constraintsBtnAssign.insets = new java.awt.Insets(9, 30, 12, 11);
			getBaseDialogContentPane().add(getBtnAssign(), constraintsBtnAssign);

			java.awt.GridBagConstraints constraintsBtnCancel = new java.awt.GridBagConstraints();
			constraintsBtnCancel.gridx = 2; constraintsBtnCancel.gridy = 3;
			constraintsBtnCancel.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsBtnCancel.ipadx = 29;
			constraintsBtnCancel.insets = new java.awt.Insets(9, 11, 12, 54);
			getBaseDialogContentPane().add(getBtnCancel(), constraintsBtnCancel);

			java.awt.GridBagConstraints constraintsScpModelElements = new java.awt.GridBagConstraints();
			constraintsScpModelElements.gridx = 1; constraintsScpModelElements.gridy = 2;
			constraintsScpModelElements.gridwidth = 2;
			constraintsScpModelElements.fill = java.awt.GridBagConstraints.BOTH;
			constraintsScpModelElements.weightx = 1.0;
			constraintsScpModelElements.weighty = 1.0;
			constraintsScpModelElements.ipadx = 293;
			constraintsScpModelElements.ipady = 128;
			constraintsScpModelElements.insets = new java.awt.Insets(5, 15, 8, 12);
			getBaseDialogContentPane().add(getScpModelElements(), constraintsScpModelElements);
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
 * Return the BtnAssign property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnAssign() {
	if (ivjBtnAssign == null) {
		try {
			ivjBtnAssign = new javax.swing.JButton();
			ivjBtnAssign.setName("BtnAssign");
			ivjBtnAssign.setText(getAssignString());
			ivjBtnAssign.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnAssign;
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
 * ModelElementSelectionDialog constructor comment.
 * @param owner java.awt.Dialog
 * @param title java.lang.String
 * @param modal boolean
 */
public DomainDef getDomainDef() {
	return domainDef;
}
/**
 * Return the LblClassName property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblClassName() {
	if (ivjLblClassName == null) {
		try {
			ivjLblClassName = new javax.swing.JLabel();
			ivjLblClassName.setName("LblClassName");
			ivjLblClassName.setText("<Class>:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblClassName;
}
/**
 * Return the JList1 property value.
 * @return javax.swing.JList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JList getLstModelElements() {
	if (ivjLstModelElements == null) {
		try {
			ivjLstModelElements = new javax.swing.JList();
			ivjLstModelElements.setName("LstModelElements");
			ivjLstModelElements.setBounds(0, 0, 311, 160);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLstModelElements;
}
/**
 * Return the ScpModelElements property value.
 * @return javax.swing.JScrollPane
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JScrollPane getScpModelElements() {
	if (ivjScpModelElements == null) {
		try {
			ivjScpModelElements = new javax.swing.JScrollPane();
			ivjScpModelElements.setName("ScpModelElements");
			ivjScpModelElements.setAutoscrolls(true);
			getScpModelElements().setViewportView(getLstModelElements());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjScpModelElements;
}
/**
 * ModelElementSelectionDialog constructor comment.
 * @param owner java.awt.Dialog
 * @param title java.lang.String
 * @param modal boolean
 */
public java.util.ArrayList getSelectedItems() {
	return selectedItems;
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
	getBtnAssign().addActionListener(ivjEventHandler);
	getBtnCancel().addActionListener(ivjEventHandler);
	getLstModelElements().addListSelectionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("ModelElementSelectionDialog");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(425, 245);
		setTitle(resModelElementSelectionDialog.getString("ModelElementSelectionDialog_title"));
		setContentPane(getBaseDialogContentPane());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * Comment
 */
private void lstModelElements_ValueChanged() {
	getBtnAssign().setEnabled(!getLstModelElements().isSelectionEmpty());
}
/**
 * @return boolean whether saving was successful or not
 */
protected boolean save() {
	// keep selected Items
	selectedItems = new java.util.ArrayList();
	int indices[] = getLstModelElements().getSelectedIndices();
	Object sortedArray[] = referencables.toArray();
	for (int i=0; i<indices.length; i++) {
		selectedItems.add(sortedArray[indices[i] - 1]);
	}

	// do nothing by default
	if (modelDef != null) {
		// case IMPORT(ModelDef)
		try {
			for (int i=0; i<selectedItems.size(); i++) {
				ModelDef supplier = (ModelDef)selectedItems.get(i);
				ElementFactory.createDependency(IliImport.class, modelDef, supplier);
			}
		} catch(Throwable exception) {
			handleException(exception);
		}
	} else if (topicDef != null) {
		// case IMPORT(ModelDef)
		try {
			for (int i=0; i<selectedItems.size(); i++) {
				TopicDef supplier = (TopicDef)selectedItems.get(i);
				ElementFactory.createDependency(TopicDepends.class, topicDef, supplier);
			}
		} catch(Throwable exception) {
			handleException(exception);
		}
	} else if (abstractClassDef != null) {
		// case IMPORT(ModelDef)
		domainDef = null;
		for (int i=0; i<selectedItems.size(); i++) {
			domainDef = (DomainDef)selectedItems.get(i);
			break;	// only the first is relevant (SINGLE_SELECTION)
		}
	} else if (roleDef != null) {
		// case restrictedTo(RoleDef)
		try {
			for (int i=0; i<selectedItems.size(); i++) {
				AbstractClassDef restriction = (AbstractClassDef)selectedItems.get(i);
				roleDef.addRestriction(restriction);
			}
		} catch(Throwable exception) {
			handleException(exception);
		}
	}

	return super.save();
}
/**
 * Show a list of DomainDef's for given AbstractClassDef.
 */
public void setDomainList(AbstractClassDef abstractClassDef) {
	getLblClassName().setText(ElementUtils.getDisplayName(DomainDef.class));
	this.abstractClassDef = abstractClassDef;

	getLstModelElements().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
	fillList(abstractClassDef, DomainDef.class);
}
/**
 * Show a list of ModelDef's for given ModelDef.
 */
public void setImportList(ModelDef modelDef) {
	getLblClassName().setText(ElementUtils.getDisplayName(ModelDef.class));
	this.modelDef = modelDef;

	fillList(modelDef, ModelDef.class);
}
/**
 * Show a list of ClassDef's for given RoleDef.
 */
public void setRestrictedRoleList(RoleDef roleDef) {
	getLblClassName().setText(ElementUtils.getDisplayName(ClassDef.class));
	this.roleDef = roleDef;

	fillList(roleDef.getAssociation(), AbstractClassDef.class);
}
/**
 * Show a list of TopicDef's for given TopicDef.
 */
public void setTopicDependsList(TopicDef topicDef) {
	getLblClassName().setText(ElementUtils.getDisplayName(TopicDef.class));
	this.topicDef = topicDef;

	fillList(topicDef, TopicDef.class);
}
}
