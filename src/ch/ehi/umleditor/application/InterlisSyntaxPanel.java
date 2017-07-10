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
import ch.ehi.basics.types.*;
import ch.ehi.interlis.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.interlis.metaobjects.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.interlis.constraints.*;
import ch.softenvironment.view.*;
/**
 * Panel Containing a SimpleEditorPanel to edit 0/1 or 0..* INTERLIS-Syntax.
 * @author: Peter Hirzel
 */
public class InterlisSyntaxPanel extends BasePanel implements DataPanel, DataSelectorPanelListener {
	private SimpleEditorPanel ivjPnlEditor = null;
	private ModelElement modelElement = null;
	private IliSyntax iliSyntax = null;
	private Constraint constraint = null;
	private DataSelectorPanel ivjPnlDataSelector = null;
	private ReferencableComboBox ivjCbxUsage = null;
	private javax.swing.JLabel ivjLblUsage = null;
	private javax.swing.JPanel ivjPnlUsage = null;
/**
 * DescriptionPanel constructor comment.
 */
public InterlisSyntaxPanel() {
	super();
	initialize();
}
/**
 * Called when a new Object has to be inserted into list.
 * @return java.lang.Object
 */
public java.lang.Object createObject() {
	return new NlsString();
}
/**
 * Return the CbxUsage property value.
 * @return ch.ehi.umleditor.application.ReferencableComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ReferencableComboBox getCbxUsage() {
	if (ivjCbxUsage == null) {
		try {
			ivjCbxUsage = new ch.ehi.umleditor.application.ReferencableComboBox();
			ivjCbxUsage.setName("CbxUsage");
			ivjCbxUsage.setEnabled(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCbxUsage;
}
/**
 * Return the very one Constraint.
 * @see #setConstraint(Constraint)
 */
public NlsString getConstraint() {
	String syntax = getPnlEditor().getText();

	if ((syntax != null) && (syntax.length() > 0)) {
		// replace current value
		if (((ConstraintExpression)constraint.getBody()).getSyntax() == null) {
			return new ch.ehi.basics.types.NlsString(syntax);
		} else {
			return new ch.ehi.basics.types.NlsString(((ConstraintExpression)constraint.getBody()).getSyntax(), syntax);
		}
	} else {
		return null;
	}
}
/**
 * Return the ModelElement with changed Constraints.
 */
public ModelElement getConstraints() {
	modelElement.clearConstraint();
	java.util.Iterator iterator = getPnlDataSelector().getObjects().iterator();
	try {
		while (iterator.hasNext()) {
			Object eleo=iterator.next();
			ConstraintDef constraintDef = null;
			if(eleo instanceof NlsString){
				// new constraint
				ConstraintExpression expression = new ConstraintExpression();
				expression.setSyntax((NlsString)eleo);
				constraintDef = (ConstraintDef)ElementFactory.createObject(ConstraintDef.class);
				constraintDef.setBody(expression);
			}else{
				// existing constraint
				constraintDef = (ConstraintDef)eleo;
			}
			modelElement.addConstraint(constraintDef);
		}
	} catch(Throwable e) {
		handleException(e);
	}
	return modelElement;
}
/**
 * Return the LblUsage property value.
 * @return javax.swing.JLabel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JLabel getLblUsage() {
	if (ivjLblUsage == null) {
		try {
			ivjLblUsage = new javax.swing.JLabel();
			ivjLblUsage.setName("LblUsage");
			ivjLblUsage.setText("Abhängig von:");
			// user code begin {1}
			ivjLblUsage.setText(getResourceString("LblUsage_text"));
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjLblUsage;
}
public Object getObject(){
  throw new UnsupportedOperationException();
}
/**
 * Return the changed object displayed.
 */
public ModelElement getParameterDefs() {
	((ClassDef)modelElement).clearParameterDef();

	try {
		java.util.Iterator iterator = getPnlDataSelector().getObjects().iterator();
		while (iterator.hasNext()) {
			ParameterDef expression = (ParameterDef)ElementFactory.createObject(ParameterDef.class);
			expression.setSyntax((NlsString)iterator.next());
			((ClassDef)modelElement).addParameterDef(expression);
		}
	} catch(Throwable e) {
		handleException(e);
	}

	return modelElement;
}
/**
 * Return the PnlDataSelector property value.
 * @return ch.softenvironment.view.DataSelectorPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ch.softenvironment.view.DataSelectorPanel getPnlDataSelector() {
	if (ivjPnlDataSelector == null) {
		try {
			ivjPnlDataSelector = new ch.softenvironment.view.DataSelectorPanel();
			ivjPnlDataSelector.setName("PnlDataSelector");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlDataSelector;
}
/**
 * Return the PnlEditor property value.
 * @return ch.softenvironment.view.SimpleEditorPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private ch.softenvironment.view.SimpleEditorPanel getPnlEditor() {
	if (ivjPnlEditor == null) {
		try {
			ivjPnlEditor = new ch.softenvironment.view.SimpleEditorPanel();
			ivjPnlEditor.setName("PnlEditor");
			ivjPnlEditor.setLayout(new javax.swing.BoxLayout(getPnlEditor(), javax.swing.BoxLayout.X_AXIS));
			ivjPnlEditor.setEnabled(true);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlEditor;
}
/**
 * Return the PnlUsage property value.
 * @return javax.swing.JPanel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private javax.swing.JPanel getPnlUsage() {
	if (ivjPnlUsage == null) {
		try {
			ivjPnlUsage = new javax.swing.JPanel();
			ivjPnlUsage.setName("PnlUsage");
			ivjPnlUsage.setPreferredSize(new java.awt.Dimension(0, 40));
			ivjPnlUsage.setLayout(new java.awt.GridBagLayout());

			java.awt.GridBagConstraints constraintsLblUsage = new java.awt.GridBagConstraints();
			constraintsLblUsage.gridx = 1; constraintsLblUsage.gridy = 1;
			constraintsLblUsage.ipadx = 101;
			constraintsLblUsage.insets = new java.awt.Insets(11, 6, 15, 5);
			getPnlUsage().add(getLblUsage(), constraintsLblUsage);

			java.awt.GridBagConstraints constraintsCbxUsage = new java.awt.GridBagConstraints();
			constraintsCbxUsage.gridx = 2; constraintsCbxUsage.gridy = 1;
			constraintsCbxUsage.fill = java.awt.GridBagConstraints.HORIZONTAL;
			constraintsCbxUsage.weightx = 1.0;
			constraintsCbxUsage.ipadx = 89;
			constraintsCbxUsage.insets = new java.awt.Insets(7, 5, 10, 7);
			getPnlUsage().add(getCbxUsage(), constraintsCbxUsage);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPnlUsage;
}
/**
 * Return the current single Syntax.
 */
public ch.ehi.basics.types.NlsString getSyntax() {
	if (getCbxUsage().hasElementChanged()) {
		getCbxUsage().save0or1Dependency(ch.ehi.uml1_4.implementation.UmlUsage.class);
	}

	String syntax = getPnlEditor().getText();

	if ((syntax != null) && (syntax.length() > 0)) {
		// replace current value
		if ((iliSyntax == null) || (iliSyntax.getSyntax() == null)) {
			return new NlsString(syntax);
		} else {
			return new NlsString(iliSyntax.getSyntax(), syntax);
		}
	} else {
		return null;
	}
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
    ch.softenvironment.view.BaseDialog.showError((java.awt.Component)this, getResourceString("CESyntax"), exception.toString(), exception); //$NON-NLS-1$
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("PnlInterlisSyntax");
		setBorder(new javax.swing.border.EtchedBorder());
		setLayout(new java.awt.BorderLayout());
		setSize(382, 165);
		add(getPnlEditor(), "Center");
		add(getPnlDataSelector(), "South");
		add(getPnlUsage(), "North");
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	getPnlEditor().setToolTipText(getResourceString("PnlEditor_toolTipText"));
	setCurrentObject(null);
	getPnlDataSelector().setListener(this);
	getPnlUsage().setVisible(false);
	// user code end
}
/**
 * Called when currentObject is to be removed.
 * @param object Object to be removed
 */
public void removeObject(java.lang.Object object) {}
/**
 * Called when currentObject is switched to another Index.
 * @param param java.lang.Object
 * @return the saved object
 */
public java.lang.Object saveChanges(java.lang.Object object) {
	if(object instanceof ConstraintDef){
		ConstraintDef constraintDef = (ConstraintDef)object;
		((ConstraintExpression)constraintDef.getBody()).setSyntax(new NlsString(((ConstraintExpression)constraintDef.getBody()).getSyntax(), getPnlEditor().getText()));
		return constraintDef;
	}
	return new NlsString((NlsString)object, getPnlEditor().getText());
}
/**
 * Use the Panel for single Constraint only.
 */
public void setConstraint(Constraint constraint) {
	this.constraint = constraint;

	getPnlDataSelector().setVisible(false);
	getPnlEditor().setEditable(true);

	if (((ConstraintExpression)constraint.getBody()).getSyntax() == null) {
		getPnlEditor().setText(new String());
	} else {
		getPnlEditor().setText(ElementUtils.mapNlsString(((ConstraintExpression)constraint.getBody()).getSyntax()));
	}
}
/**
 */
public void setConstraints(ModelElement modelElement) {
	this.modelElement = modelElement;

	java.util.Iterator iterator = modelElement.iteratorConstraint();
	java.util.ArrayList list = new java.util.ArrayList();
	while ((iterator != null) && iterator.hasNext()) {
		ch.ehi.uml1_4.foundation.core.Constraint constraint = (ch.ehi.uml1_4.foundation.core.Constraint)iterator.next();
		list.add(constraint);
	}

	getPnlDataSelector().setObjects(list);
}
/**
 * Display the given Syntax in SimpleEditorPanel.
 */
public void setCurrentObject(java.lang.Object syntax) {
	if (syntax == null) {
		getPnlEditor().setEditable(false);
		getPnlEditor().setText(null);
	} else {
		getPnlEditor().setEditable(true);
		if(syntax instanceof ConstraintDef){
			ConstraintDef constraintDef = (ConstraintDef)syntax;
			getPnlEditor().setText(ElementUtils.mapNlsString(((ConstraintExpression)constraintDef.getBody()).getSyntax()));
		}else{
			getPnlEditor().setText(ElementUtils.mapNlsString(((ch.ehi.basics.types.NlsString)syntax)));
		}
	}
}
public void setObject(Object object){
  throw new UnsupportedOperationException();
}
/**
 * Set the Object to be displayed by panel.
 * Only first entry in given Iterator argument is treated by this Panel.
 * @param object (Constraint expected)
 * @see #setObject(String) for simple usage
 */
public void setParameterDefs(ModelElement modelElement) {
	this.modelElement = modelElement;

	java.util.Iterator iterator = ((ClassDef)modelElement).iteratorParameterDef();
	java.util.ArrayList list = new java.util.ArrayList();
	while ((iterator != null) && iterator.hasNext()) {
		ParameterDef parameterDef = (ParameterDef)iterator.next();
		list.add(parameterDef.getSyntax());
	}

	getPnlDataSelector().setObjects(list);
}
/**
 * Use the Panel for single Syntax only.
 */
public void setSyntax(IliSyntax iliSyntax) {
	this.iliSyntax = iliSyntax;

	// map UmlUsage (according to INTERLIS Reference)
	if ((iliSyntax instanceof ch.ehi.interlis.units.UnitDef) ||
			(iliSyntax instanceof ch.ehi.interlis.functions.FunctionDef) ||
			(iliSyntax instanceof ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef) ||
			(iliSyntax instanceof ch.ehi.interlis.graphicdescriptions.GraphicParameterDef) ||
			(iliSyntax instanceof ch.ehi.interlis.views.ViewDef) ||
			(iliSyntax instanceof ch.ehi.interlis.graphicdescriptions.GraphicDef)) {
		setUsage((ch.ehi.uml1_4.foundation.core.ModelElement)iliSyntax);
	}

	// show current Interlis-Syntax code
	getPnlDataSelector().setVisible(false);
	getPnlEditor().setEditable(true);
	if ((iliSyntax == null) || (iliSyntax.getSyntax() == null)) {
		getPnlEditor().setText(new String());
	} else {
		getPnlEditor().setText(ElementUtils.mapNlsString(iliSyntax.getSyntax()));
	}
}
/**
 * The following types may specify an UmlUsage:
 *	- UnitDef
 *	- FunctionDef
 *  - LineFormTypeDef
 *  - GraphicParameterDef
 *  - ViewDef
 *  - GraphicDef
 *
 * @see ReferencableComboBox#setUsage(..)
 */
public void setUsage(ModelElement modelElement) {
	getPnlUsage().setVisible(true);
	getCbxUsage().setEnabled(getCbxUsage().setUsage(modelElement));
}
}
