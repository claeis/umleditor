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
import ch.ehi.interlis.modeltopicclass.*;
import ch.softenvironment.util.*;
/**
 * Shortcut-Panel for a DomainDef.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:00 $
 */
public class IliBaseTypeDomainDefPanel extends ch.softenvironment.view.DataPanel {
	private static java.util.ResourceBundle resIliBaseTypeDomainDefPanel = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/IliBaseTypeDomainDefPanel");  //$NON-NLS-1$
	private ch.ehi.interlis.domainsandconstants.DomainDef domainDef = null;
	private javax.swing.JButton ivjBtnChangeDomainDef = null;
	private java.awt.Dialog ownerDialog = null;
	private AbstractClassDef abstractClassDef = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private javax.swing.JLabel ivjLblDomainDefName = null;
	private javax.swing.JTextField ivjTxtDomainDefName = null;
	private javax.swing.JButton ivjBtnAssign = null;

class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == IliBaseTypeDomainDefPanel.this.getBtnChangeDomainDef()) 
				connEtoC1(e);
			if (e.getSource() == IliBaseTypeDomainDefPanel.this.getBtnAssign()) 
				connEtoC2(e);
		};
	};
/**
 * IliBaseTypeDomainDefPanel constructor comment.
 */
public IliBaseTypeDomainDefPanel() {
	super();
	initialize();
}
/**
 * Comment
 */
private void btnAssign() {
	ModelElementSelectionDialog dialog = new ModelElementSelectionDialog(ownerDialog, resIliBaseTypeDomainDefPanel.getString("CTSelection"), true, abstractClassDef); //$NON-NLS-1$
	if (dialog.isSaved()) {
		setObject(dialog.getDomainDef(), abstractClassDef);
	}
}
/**
 * Open a DomainDefDialog.
 */
private void btnChangeDomainDef() {
	LauncherView.getInstance().showSpecification(domainDef);
}
/**
 * connEtoC1:  (BtnChangeDomainDef.action.actionPerformed(java.awt.event.ActionEvent) --> IliBaseTypeDomainDefPanel.btnChangeDomainDef()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnChangeDomainDef();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (BtnNew.action.actionPerformed(java.awt.event.ActionEvent) --> IliBaseTypeDomainDefPanel.btnNew()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.btnAssign();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the BtnNew property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnAssign() {
	if (ivjBtnAssign == null) {
		try {
			ivjBtnAssign = new javax.swing.JButton();
			ivjBtnAssign.setName("BtnAssign");
			ivjBtnAssign.setToolTipText(resIliBaseTypeDomainDefPanel.getString("BtnAssign_toolTipText"));
			ivjBtnAssign.setText(MENU_EDIT_ASSIGN);
			ivjBtnAssign.setBounds(160, 59, 98, 25);
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
 * Return the BtnChangeDomainDef property value.
 * @return javax.swing.JButton
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JButton getBtnChangeDomainDef() {
	if (ivjBtnChangeDomainDef == null) {
		try {
			ivjBtnChangeDomainDef = new javax.swing.JButton();
			ivjBtnChangeDomainDef.setName("BtnChangeDomainDef");
			ivjBtnChangeDomainDef.setToolTipText(resIliBaseTypeDomainDefPanel.getString("BtnChangeDomainDef_toolTipText"));
			ivjBtnChangeDomainDef.setText(MENU_EDIT_CHANGE_WINDOW);
			ivjBtnChangeDomainDef.setBounds(268, 59, 152, 25);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjBtnChangeDomainDef;
}
/**
 * Return the LblDomainDefName property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblDomainDefName() {
	if (ivjLblDomainDefName == null) {
		try {
			ivjLblDomainDefName = new javax.swing.JLabel();
			ivjLblDomainDefName.setName("LblDomainDefName");
			ivjLblDomainDefName.setText(resIliBaseTypeDomainDefPanel.getString("LblDomainDefName_text"));
			ivjLblDomainDefName.setBounds(10, 22, 140, 14);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblDomainDefName;
}
/**
 * Return the changed object displayed.
 */
public Object getObject() {
	return domainDef;
}
/**
 * Return the TxtDomainDefName property value.
 * @return javax.swing.JTextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JTextField getTxtDomainDefName() {
	if (ivjTxtDomainDefName == null) {
		try {
			ivjTxtDomainDefName = new javax.swing.JTextField();
			ivjTxtDomainDefName.setName("TxtDomainDefName");
			ivjTxtDomainDefName.setBounds(160, 21, 260, 20);
			ivjTxtDomainDefName.setEnabled(true);
			ivjTxtDomainDefName.setEditable(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjTxtDomainDefName;
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
	getBtnChangeDomainDef().addActionListener(ivjEventHandler);
	getBtnAssign().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("IliBaseTypeDomainDefPanel");
		setLayout(null);
		setSize(452, 100);
		add(getLblDomainDefName(), getLblDomainDefName().getName());
		add(getTxtDomainDefName(), getTxtDomainDefName().getName());
		add(getBtnChangeDomainDef(), getBtnChangeDomainDef().getName());
		add(getBtnAssign(), getBtnAssign().getName());
		initConnections();
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * Set the Object to be displayed by panel.
 */
public void setDialog(java.awt.Dialog owner) {
	ownerDialog = owner;
}
/**
 * Set the Object to be displayed by panel.
 */
public final void setObject(java.lang.Object object) throws DeveloperException {
	throw new DeveloperException(this, "setObject(Object)", "call setObject(Object, ModelElement) instead");//$NON-NLS-2$//$NON-NLS-1$
}
/**
 * Set the Object to be displayed by panel.
 */
public void setObject(java.lang.Object object, ModelElement abstractClassDef) {
	domainDef = (ch.ehi.interlis.domainsandconstants.DomainDef)object;
	this.abstractClassDef = (AbstractClassDef)abstractClassDef;

	if (domainDef == null) {
		getBtnChangeDomainDef().setEnabled(false);
		getTxtDomainDefName().setText("");//$NON-NLS-1$
	} else {
		getTxtDomainDefName().setText(((ch.ehi.interlis.domainsandconstants.DomainDef)object).getDefLangName());
		getBtnChangeDomainDef().setEnabled(true);
	}
}
}
