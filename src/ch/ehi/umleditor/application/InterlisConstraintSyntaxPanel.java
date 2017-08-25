package ch.ehi.umleditor.application;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.IliSyntax;
import ch.ehi.interlis.constraints.ConstraintDef;
import ch.ehi.interlis.constraints.ConstraintExpression;
import ch.ehi.interlis.metaobjects.ParameterDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.softenvironment.view.BasePanel;
import ch.softenvironment.view.DataPanel;
import ch.softenvironment.view.DataSelectorPanel;
import ch.softenvironment.view.DataSelectorPanelListener;
import ch.softenvironment.view.SimpleEditorPanel;

public class InterlisConstraintSyntaxPanel extends BasePanel implements DataPanel, DataSelectorPanelListener  {

	private static final long serialVersionUID = -4028167429385508142L;
	private SimpleEditorPanel ivjPnlEditor = null;
	private ModelElement modelElement = null;
	private IliSyntax iliSyntax = null;
	private Constraint constraint = null;
	private DataSelectorPanel ivjPnlDataSelector = null;
	private ReferencableComboBox ivjCbxUsage = null;
	private javax.swing.JLabel ivjLblUsage = null;
	private javax.swing.JPanel ivjPnlUsage = null;
	private javax.swing.JPanel ivjPnlMetaValues = null;
	private javax.swing.JLabel ivjLblMetaName = null;
	private javax.swing.JTextField ivjTxtMetaName = null;
	private javax.swing.JLabel ivjLblMetaMsg = null;
	private javax.swing.JTextField ivjTxtMetaMsg = null;

	/**
	 * DescriptionPanel constructor comment.
	 */
	public InterlisConstraintSyntaxPanel() {
		super();
		initialize();
	}

	/**
	 * Called when a new Object has to be inserted into list.
	 * 
	 * @return java.lang.Object
	 */
	public java.lang.Object createObject() {
		return new NlsString();
	}

	/**
	 * Return the CbxUsage property value.
	 * 
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
	 * 
	 * @see #setConstraint(Constraint)
	 */
	public NlsString getConstraint() {
		String syntax = getPnlEditor().getText();

		if ((syntax != null) && (syntax.length() > 0)) {
			// replace current value
			if (((ConstraintExpression) constraint.getBody()).getSyntax() == null) {
				return new ch.ehi.basics.types.NlsString(syntax);
			} else {
				return new ch.ehi.basics.types.NlsString(((ConstraintExpression) constraint.getBody()).getSyntax(),
						syntax);
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
				Object eleo = iterator.next();
				ConstraintDef constraintDef = null;
				if (eleo instanceof NlsString) {
					// new constraint
					ConstraintExpression expression = new ConstraintExpression();
					expression.setSyntax((NlsString) eleo);
					constraintDef = (ConstraintDef) ElementFactory.createObject(ConstraintDef.class);
					constraintDef.setBody(expression);
				} else {
					// existing constraint
					constraintDef = (ConstraintDef) eleo;
				}
				modelElement.addConstraint(constraintDef);
			}
		} catch (Throwable e) {
			handleException(e);
		}
		return modelElement;
	}
	/**
	 * Return the JLabelMetaName property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblMetaName() {
		if (ivjLblMetaName == null) {
			try {
				ivjLblMetaName = new javax.swing.JLabel();
				ivjLblMetaName.setName("LblMetaName");
				ivjLblMetaName.setText("Name:");
				// user code begin {1}
				//ivjLblMetaName.setText(resClassDefDialog.getString("LblMetaName_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblMetaName;
	}
	
	/**
	 * Return the JLabelMetaMsg property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getLblMetaMsg() {
		if (ivjLblMetaMsg == null) {
			try {
				ivjLblMetaMsg = new javax.swing.JLabel();
				ivjLblMetaMsg.setName("LblMetaMsg");
				ivjLblMetaMsg.setText("Message:");
				// user code begin {1}
				//ivjLblMetaMsg.setText(resClassDefDialog.getString("LblMetaMsg_text"));
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjLblMetaMsg;
	}

	/**
	 * Return the JTextField2 property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtMetaName() {
		if (ivjTxtMetaName == null) {
			try {
				ivjTxtMetaName = new javax.swing.JTextField();
				ivjTxtMetaName.setName("TxtMetaName");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtMetaName;
	}
	
	/**
	 * Return the JTextField2 property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getTxtMetaMsg() {
		if (ivjTxtMetaMsg == null) {
			try {
				ivjTxtMetaMsg = new javax.swing.JTextField();
				ivjTxtMetaMsg.setName("TxtMetaMsg");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjTxtMetaMsg;
	}

	/**
	 * Return the LblUsage property value.
	 * 
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

	public Object getObject() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Return the changed object displayed.
	 */
	public ModelElement getParameterDefs() {
		((ClassDef) modelElement).clearParameterDef();

		try {
			java.util.Iterator iterator = getPnlDataSelector().getObjects().iterator();
			while (iterator.hasNext()) {
				ParameterDef expression = (ParameterDef) ElementFactory.createObject(ParameterDef.class);
				expression.setSyntax((NlsString) iterator.next());
				((ClassDef) modelElement).addParameterDef(expression);
			}
		} catch (Throwable e) {
			handleException(e);
		}

		return modelElement;
	}

	/**
	 * Return the PnlDataSelector property value.
	 * 
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
	 * 
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
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getPnlMetaValues() {
		if (ivjPnlMetaValues == null) {
			try {
				ivjPnlMetaValues = new javax.swing.JPanel();
				ivjPnlMetaValues.setName("PnlMetaValues");
				ivjPnlMetaValues.setPreferredSize(new java.awt.Dimension(0, 40));// Revisar esto 
				ivjPnlMetaValues.setLayout(new java.awt.GridBagLayout());
				
				// show label metaName at panel
				java.awt.GridBagConstraints constraintsLblMetaName = new java.awt.GridBagConstraints();
				constraintsLblMetaName.gridx = 1;
				constraintsLblMetaName.gridy = 1;
				constraintsLblMetaName.ipadx = 104;
				constraintsLblMetaName.insets = new java.awt.Insets(1, 11, 10, 6);
				getPnlMetaValues().add(getLblMetaName(), constraintsLblMetaName);

				// show textfield metaName in panel
				java.awt.GridBagConstraints constraintsTxtMetaName = new java.awt.GridBagConstraints();
				constraintsTxtMetaName.gridx = 1;
				constraintsTxtMetaName.gridy = 2;
				constraintsTxtMetaName.gridwidth = 2;
				constraintsTxtMetaName.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtMetaName.weightx = 1.0;
				constraintsTxtMetaName.ipadx = 315;
				constraintsTxtMetaName.insets = new java.awt.Insets(1, 12, 10, 15);
				getPnlMetaValues().add(getTxtMetaName(), constraintsTxtMetaName);
				
				// show label metaMsg at panel
				java.awt.GridBagConstraints constraintsLblMetaMsg = new java.awt.GridBagConstraints();
				constraintsLblMetaMsg.gridx = 2;
				constraintsLblMetaMsg.gridy = 1;
				constraintsLblMetaMsg.ipadx = 104;
				constraintsLblMetaMsg.insets = new java.awt.Insets(2, 11, 7, 6);
				getPnlMetaValues().add(getLblMetaMsg(), constraintsLblMetaMsg);

				// show textfield metaName in panel
				java.awt.GridBagConstraints constraintsTxtMetaMsg = new java.awt.GridBagConstraints();
				constraintsTxtMetaMsg.gridx = 2;
				constraintsTxtMetaMsg.gridy = 2;
				constraintsTxtMetaMsg.gridwidth = 2;
				constraintsTxtMetaMsg.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsTxtMetaMsg.weightx = 1.0;
				constraintsTxtMetaMsg.ipadx = 315;
				constraintsTxtMetaMsg.insets = new java.awt.Insets(2, 12, 7, 15);
				getPnlMetaValues().add(getTxtMetaMsg(), constraintsTxtMetaMsg);
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjPnlMetaValues;
	}
	/**
	 * Return the PnlUsage property value.
	 * 
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
				constraintsLblUsage.gridx = 1;
				constraintsLblUsage.gridy = 1;
				constraintsLblUsage.ipadx = 101;
				constraintsLblUsage.insets = new java.awt.Insets(11, 6, 15, 5);
				getPnlUsage().add(getLblUsage(), constraintsLblUsage);

				java.awt.GridBagConstraints constraintsCbxUsage = new java.awt.GridBagConstraints();
				constraintsCbxUsage.gridx = 2;
				constraintsCbxUsage.gridy = 1;
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
	 * 
	 * @param exception
	 *            java.lang.Throwable
	 */
	protected void handleException(java.lang.Throwable exception) {
		ch.softenvironment.view.BaseDialog.showError((java.awt.Component) this, getResourceString("CESyntax"), //$NON-NLS-1$
				exception.toString(), exception);
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
			add(getPnlMetaValues(), "North");
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		getPnlEditor().setToolTipText(getResourceString("PnlEditor_toolTipText"));
		setCurrentObject(null);
		getPnlDataSelector().setListener(this);
		getPnlMetaValues().setVisible(false);
		getPnlUsage().setVisible(false);
		// user code end
	}

	/**
	 * Called when currentObject is to be removed.
	 * 
	 * @param object
	 *            Object to be removed
	 */
	public void removeObject(java.lang.Object object) {
	}

	/**
	 * Called when currentObject is switched to another Index.
	 * 
	 * @param param
	 *            java.lang.Object
	 * @return the saved object
	 */
	public java.lang.Object saveChanges(java.lang.Object object) {
		if (object instanceof ConstraintDef) {
			ConstraintDef constraintDef = (ConstraintDef) object;
			((ConstraintExpression) constraintDef.getBody()).setSyntax(new NlsString(
					((ConstraintExpression) constraintDef.getBody()).getSyntax(), getPnlEditor().getText()));
			constraintDef.setMetaName(new NlsString(getTxtMetaName().getText()));
			constraintDef.setMetaMsg(new NlsString(getTxtMetaMsg().getText()));
			return constraintDef;
		}
		return new NlsString((NlsString) object, getPnlEditor().getText());
	}

	/**
	 * Use the Panel for single Constraint only.
	 */
	public void setConstraint(Constraint constraint) {
		this.constraint = constraint;

		getPnlDataSelector().setVisible(false);
		getPnlEditor().setEditable(true);
		getPnlMetaValues().setVisible(true);

		if (((ConstraintExpression) constraint.getBody()).getSyntax() == null) {
			getPnlEditor().setText(new String());
		} else {
			getPnlEditor()
					.setText(ElementUtils.mapNlsString(((ConstraintExpression) constraint.getBody()).getSyntax()));
		}
		// show instance with meta attribute name 
		if(constraint.getMetaName() == null){
			getTxtMetaName().setText(new String());
		}else{
			getTxtMetaName().setText(constraint.getMetaName().toString());
		}
		// show instance with meta attribute message
		if(constraint.getMetaMsg() == null){
			getTxtMetaMsg().setText(new String());
		}else{
			getTxtMetaMsg().setText(constraint.getMetaMsg().toString());
		}
	}

	/**
	 */
	public void setConstraints(ModelElement modelElement) {
		this.modelElement = modelElement;

		java.util.Iterator iterator = modelElement.iteratorConstraint();
		java.util.ArrayList list = new java.util.ArrayList();
		while ((iterator != null) && iterator.hasNext()) {
			ch.ehi.uml1_4.foundation.core.Constraint constraint = (ch.ehi.uml1_4.foundation.core.Constraint) iterator
					.next();
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
			if (syntax instanceof ConstraintDef) {
				ConstraintDef constraintDef = (ConstraintDef) syntax;
				getPnlEditor().setText(
						ElementUtils.mapNlsString(((ConstraintExpression) constraintDef.getBody()).getSyntax()));
			} else {
				getPnlEditor().setText(ElementUtils.mapNlsString(((ch.ehi.basics.types.NlsString) syntax)));
			}
		}
	}

	public void setObject(Object object) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Set the Object to be displayed by panel. Only first entry in given
	 * Iterator argument is treated by this Panel.
	 * 
	 * @param object
	 *            (Constraint expected)
	 * @see #setObject(String) for simple usage
	 */
	public void setParameterDefs(ModelElement modelElement) {
		this.modelElement = modelElement;

		java.util.Iterator iterator = ((ClassDef) modelElement).iteratorParameterDef();
		java.util.ArrayList list = new java.util.ArrayList();
		while ((iterator != null) && iterator.hasNext()) {
			ParameterDef parameterDef = (ParameterDef) iterator.next();
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
		if ((iliSyntax instanceof ch.ehi.interlis.units.UnitDef)
				|| (iliSyntax instanceof ch.ehi.interlis.functions.FunctionDef)
				|| (iliSyntax instanceof ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef)
				|| (iliSyntax instanceof ch.ehi.interlis.graphicdescriptions.GraphicParameterDef)
				|| (iliSyntax instanceof ch.ehi.interlis.views.ViewDef)
				|| (iliSyntax instanceof ch.ehi.interlis.graphicdescriptions.GraphicDef)) {
			setUsage((ch.ehi.uml1_4.foundation.core.ModelElement) iliSyntax);
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
	 * The following types may specify an UmlUsage: - UnitDef - FunctionDef -
	 * LineFormTypeDef - GraphicParameterDef - ViewDef - GraphicDef
	 *
	 * @see ReferencableComboBox#setUsage(..)
	 */
	public void setUsage(ModelElement modelElement) {
		getPnlUsage().setVisible(true);
		getCbxUsage().setEnabled(getCbxUsage().setUsage(modelElement));
	}

}
