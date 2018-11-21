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
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.ehi.interlis.associations.*;
import ch.ehi.interlis.domainsandconstants.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.uml1_4.foundation.core.*;
/**
 * Edit a Participants restrictions.
 */
public class ParticipantDialog extends ch.softenvironment.view.BaseDialog {
	private static java.util.ResourceBundle resModelElementSelectionDialog = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/ParticipantDialog");  //$NON-NLS-1$
	private javax.swing.JPanel ivjBaseDialogContentPane = null;
	private javax.swing.JButton ivjBtnAssign = null;
	private javax.swing.JButton ivjBtnCancel = null;
	private javax.swing.JLabel ivjLblClassName = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private RestrictedClassesPanel ivjLstModelElements = null;
	private ParticipantsPanelItem item=null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == ParticipantDialog.this.getBtnAssign())
				connEtoC1(e);
			if (e.getSource() == ParticipantDialog.this.getBtnCancel())
				connEtoC2(e);
		};
	};
/**
 * ModelElementSelectionDialog constructor comment.
 * @param owner java.awt.Dialog
 * @param title java.lang.String
 * @param modal boolean
 */
public ParticipantDialog(java.awt.Dialog owner, String title, boolean modal,ParticipantsPanelItem item,ModelElement context) {
	super(owner, title, modal);
	this.item=new ParticipantsPanelItem(item);
	initialize();
	addEscapeKey();
	java.util.Set referenceableElements=ch.ehi.interlis.tools.ModelElementUtility.getReferencableElements(context, AbstractClassDef.class);
	getLstModelElements().setObject(this.item.getRestrictions(), context,referenceableElements);
	show();
}
/**
 * Handle escape key to close the dialog
 */
 private void addEscapeKey() {
	 
	 KeyStroke escape = KeyStroke.getKeyStroke (KeyEvent.VK_ESCAPE, 0, false);
	 Action escapeAction = new AbstractAction() {
		
		private static final long serialVersionUID = -2972481431614869047L;
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
			getBaseDialogContentPane().add(getLstModelElements(), constraintsScpModelElements);
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
			ivjBtnAssign.setText(getOKString());
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
private RestrictedClassesPanel getLstModelElements() {
	if (ivjLstModelElements == null) {
		try {
			ivjLstModelElements = new RestrictedClassesPanel();
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
		getLblClassName().setText(item.getTarget().getDefLangName());
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * @return boolean whether saving was successful or not
 */
protected boolean save() {
	AbstractClassDef[] rv=(AbstractClassDef[])getLstModelElements().getObject();
	item.setRestrictions(rv);
	return super.save();
}
public ParticipantsPanelItem getItem()
{
	return item;
}
}
