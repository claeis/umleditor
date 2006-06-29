package ch.ehi.umleditor.umldrawingtools;
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
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.uml1_4.implementation.UmlOperation;
import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.interlis.metaobjects.MetaDataUseDef;
import ch.ehi.interlis.metaobjects.MetaDataUseDefKind;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.views.ViewDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.*;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
import ch.ehi.interlis.functions.FunctionDef;
import ch.ehi.interlis.graphicdescriptions.GraphicDef;
import ch.ehi.interlis.graphicdescriptions.GraphicParameterDef;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import CH.ifa.draw.figures.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.contrib.*;
import ch.ehi.umleditor.application.*;

/**
 * A ClassFigure is a graphical representation for an UML Class
 * in an UML Class Diagram.
 * A ClassFigure separates the graphical representation from the data model
 * (PresentationElement). A class has a class
 * name, attributes and methods.
 * 
 * @author Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.10 $ $Date: 2006-06-29 22:16:01 $
 */
public class ClassFigure extends NodeFigure implements ActionListener {
	private static java.util.ResourceBundle resources = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/umldrawingtools/resources/ClassFigure");  //$NON-NLS-1$
    private GraphicalCompositeFigure nameFigure;
	private TextFigure classNameFigure;	// DON't set = null
	private SeparatorFigure attributeSeparator; // DON't set = null
	private SeparatorFigure operationSeparator; // DON't set = null
	// Direct reference to a composite figure which stores text figures for attribute names.
	// This figure is also part of this composite container.
	private GraphicalCompositeFigure attributesFigure; // DON't set = null

	// Direct reference to a composite figure which stores text figures for method names.
	// This figure is also part of this composite container.
	private GraphicalCompositeFigure operationsFigure; // DON't set = null

	// PopupMenu
	private static String SUPPRESS_ATTRIBUTES_ACTION_COMMAND = "SUPPRESS_ATTRIBUTES";//$NON-NLS-1$
	private static String SUPPRESS_OPERATIONS_ACTION_COMMAND = "SUPPRESS_OPERATIONS";//$NON-NLS-1$
	private static String SHOW_INHERITED_ATTRIBUTES_ACTION_COMMAND = "SHOW_INHERITED_ATTRIBUTES";//$NON-NLS-1$
	private JCheckBoxMenuItem chxSuppressAttributes = null;
	private JCheckBoxMenuItem chxSuppressOperations = null;
	private JCheckBoxMenuItem chxShowInheritedAttributes = null;
/**
 * Create a new instance of ClassFigure with a RectangleFigure as presentation figure
 */
public ClassFigure() {
    this(new RectangleFigure());
}
/**
 * Create a new instance of ClassFigure with a given presentation figure
 *
 * @param newPresentationFigure presentation figure
 */
private ClassFigure(Figure newPresentationFigure) {
    super(newPresentationFigure);
}
/**
 * Invoked when an action occurs.
 */
public void actionPerformed(java.awt.event.ActionEvent e) {
	try {
		if (e.getActionCommand().equals(SUPPRESS_ATTRIBUTES_ACTION_COMMAND)) {
			((PresentationAbstractClass)getNode()).setSuppressAttributes(chxSuppressAttributes.isSelected());
		} else if (e.getActionCommand().equals(SUPPRESS_OPERATIONS_ACTION_COMMAND)) {
			((PresentationAbstractClass)getNode()).setSuppressOperations(chxSuppressOperations.isSelected());
		} else if (e.getActionCommand().equals(SHOW_INHERITED_ATTRIBUTES_ACTION_COMMAND)) {
			((PresentationAbstractClass)getNode()).setShowInheritedAttributes(chxShowInheritedAttributes.isSelected());
		}
		// updateAttributeFigure(); => is called by Model-Change
	} catch(Throwable exception) {
		ch.softenvironment.util.Tracer.getInstance().runtimeError(e.toString(), exception)		;
		ch.ehi.umleditor.application.LauncherView.getInstance().handleException(exception);
	}
}
/**
 * Add an attribute.
 */
private void addAttribute() {
    try {
        // 1) add model
        ElementFactory.createAttributeDef((AbstractClassDef)getModelElement());

        // 2) add view for model 
        // @see updateModel()
    } catch (Throwable e) {
        LauncherView.getInstance().handleException(e);
    }
}
/**
 * Add a method.
 */
private void addOperation() {
	try {
        // 1) add model
        ElementFactory.createUmlOperation((AbstractClassDef)getModelElement());

        // 2) add view for model 
        // @see updateModel()
    } catch (Throwable e) {
        LauncherView.getInstance().handleException(e);
    }
}
/**
 * Add individual PopupMenu items for this class.
 * @see createPopupMenu()
 */
protected void addSpecialMenu(javax.swing.JPopupMenu popupMenu) {
    if (getModelElement() instanceof AbstractClassDef) {
        popupMenu.add(new JSeparator());
        
    	popupMenu.add(new AbstractAction(resources.getString("MniNewAttributeDef_text")) { //$NON-NLS-1$
    		public void actionPerformed(ActionEvent event) {
    			addAttribute();
    		}
    	});
    
    	popupMenu.add(new AbstractAction(resources.getString("MniNewMethod_text")) {	//$NON-NLS-1$
    		public void actionPerformed(ActionEvent event) {
    			addOperation();
    		}
    	});
    
    	chxSuppressAttributes = new javax.swing.JCheckBoxMenuItem(resources.getString("MniSuppressAttributes_text")); //$NON-NLS-1$
    	chxSuppressAttributes.setActionCommand(SUPPRESS_ATTRIBUTES_ACTION_COMMAND);
     	chxSuppressAttributes.addActionListener(this);
     	chxShowInheritedAttributes = new javax.swing.JCheckBoxMenuItem(resources.getString("MniShowInheritedAttributes_text")); //$NON-NLS-1$
    	chxShowInheritedAttributes.setActionCommand(SHOW_INHERITED_ATTRIBUTES_ACTION_COMMAND);
    	chxShowInheritedAttributes.addActionListener(this);  
    	chxSuppressOperations = new javax.swing.JCheckBoxMenuItem(resources.getString("MniSuppressOperations_text")); //$NON-NLS-1$
    	chxSuppressOperations.setActionCommand(SUPPRESS_OPERATIONS_ACTION_COMMAND);
    	chxSuppressOperations.addActionListener(this);
       	if (getNode() == null) {
    	   	chxSuppressAttributes.setSelected(false);
    		chxShowInheritedAttributes.setSelected(false);
    		chxSuppressOperations.setSelected(false);
        } else {
    	    chxSuppressAttributes.setSelected(((PresentationAbstractClass)getNode()).isSuppressAttributes());
    		chxShowInheritedAttributes.setSelected(((PresentationAbstractClass)getNode()).isShowInheritedAttributes());
    		chxSuppressOperations.setSelected(((PresentationAbstractClass)getNode()).isSuppressOperations());
     	}
    	chxShowInheritedAttributes.setEnabled(!chxSuppressAttributes.isSelected());
    	popupMenu.add(chxSuppressAttributes);
    	popupMenu.add(chxShowInheritedAttributes);
    	popupMenu.add(chxSuppressOperations);
    }
}
/**
 * ClassFigure movement is different from AssociationAttributeFigure movement.
 * Overwrites.
 */
protected void basicMoveBy(int dx, int dy) {
    super.basicMoveBy(dx, dy);

    Iterator edges = getNode().iteratorPresentationEdge();
    while (edges.hasNext()) {
		ch.ehi.umleditor.umlpresentation.PresentationEdge edge = (ch.ehi.umleditor.umlpresentation.PresentationEdge)edges.next();
		Figure figure = getClassDiagram().findFigure(edge);
		if ((figure != null) &&
				(figure instanceof PresentationRoleFigure) &&
				((PresentationRoleFigure)figure).getEndElement().equals(this.getModelElement())) {
			// only move Roles of moved Node
			((PresentationRoleFigure)figure).moveRelative(dx, dy);
		}
    }
}
/**
 * Display AttributeDef in AttributeCompartment box.
 */
private Figure createAttributeFigure(final AttributeDef attributeDef) {
    AttributeFigure attributeFigure = new AttributeFigure(attributeDef, getClassDiagram()) {
        public void setText(String newName) {
	        String name = getPureAttributeName(newName);
            // rename Attribute (prevent ping-pong with MetaModelChange)
            ElementUtils.trySetName(attributeDef, name);
            updateModel();
        }
    };
    attributeFigure.setText(attributeDef.getDefLangName());
    attributeFigure.setFont(getFont());

    return attributeFigure;
}
/**
 * Display AttributeDef in AttributeCompartment box.
 */
private Figure createOperationFigure(final UmlOperation operation) {
	OperationFigure operationFigure = new OperationFigure(operation, getClassDiagram()) {
		public void setText(String newName) {
			String name = getPureOperationName(newName);
			// rename Attribute (prevent ping-pong with MetaModelChange)
			ElementUtils.trySetName(operation, name);
			updateModel();
		}
	};
	operationFigure.setText(operation.getDefLangName());
	operationFigure.setFont(getFont());

	return operationFigure;
}
/**
 * Overwrites.
 */
public Object getAttribute(String name) {
	if (name.equals(Figure.POPUP_MENU)) {
		// necessary because CheckBox-Selection-State will not be handled properly otherwise
		// @see #addSpecialMenu(JPopupMenu)
		return adaptPopupMenu(new JPopupMenu());
	} else {
		return super.getAttribute(name);
	}
}
/**
 * Return default handles on all four edges for this figure.
 */
public Vector handles() {
	Vector handles = new Vector();
	handles.addElement(new NullHandle(getPresentationFigure(), RelativeLocator.northWest()));
	handles.addElement(new NullHandle(getPresentationFigure(), RelativeLocator.northEast()));
	handles.addElement(new NullHandle(getPresentationFigure(), RelativeLocator.southWest()));
	handles.addElement(new NullHandle(getPresentationFigure(), RelativeLocator.southEast()));

	return handles;
}
/**
 * Hook method called to initizialize a ClassFigure.
 * It is called from the constructors and the clone() method.
 */
protected void initialize() {
    // start with an empty Composite
    removeAll();

    // create a TextFigure responsible for the class name
    classNameFigure = new TextFigure() {
        public void setText(String newText) {
	        String name = newText;
            if (!updateName(newText)) {
	            name = getModelElement().getDefLangName();
            }
            super.setText(name);
            update();
        }
    };
    classNameFigure.setFont(getFont());
    
    // add the TextFigure to the Composite
    nameFigure = new GraphicalCompositeFigure(new SeparatorFigure());
    nameFigure.add(classNameFigure);
//  nameFigure.add(stereotypeFigure);
    nameFigure.getLayouter().setInsets(new Insets(0, 4, 0, 0));
    add(nameFigure);

    // create a figure responsible for maintaining attributes
    attributeSeparator = new SeparatorFigure();
    attributesFigure = new GraphicalCompositeFigure(attributeSeparator);
    attributesFigure.getLayouter().setInsets(new Insets(4, 4, 4, 0));
    // add the figure to the Composite
    add(attributesFigure);

    // create a figure responsible for maintaining methods
    operationSeparator = new SeparatorFigure();
    operationsFigure = new GraphicalCompositeFigure(operationSeparator);
    operationsFigure.getLayouter().setInsets(new Insets(4, 4, 4, 0));
    operationSeparator.setLineVisible(false);
    // add the figure to the Composite
    add(operationsFigure);

    super.initialize();
}
	/**
	 * Test whether this figure has child figures.
	 *
	 * @return true, if there are no child figures, false otherwise
	 */
	public boolean isEmpty() {
		return figureCount() == 0;
	}
/**
 * Update the attribute figure and the ClassFigure itself as well. This causes calculating
 * the layout of contained figures.
 */
private void updateAttributeFigure() {
//TODO Tune: currently all attributeFigure's are removed and readded at modelChange");//$NON-NLS-2$//$NON-NLS-1$
	attributesFigure.removeAll();
	
	if (((PresentationAbstractClass)getNode()).isSuppressAttributes()) {
		attributeSeparator.setLineVisible(false);
	} else {
		attributeSeparator.setLineVisible(true);
		Iterator iterator = null;
		if (((PresentationAbstractClass)getNode()).isShowInheritedAttributes()) {
			// show local + inherited attributes
			java.util.List inheritedAttributes = ((ch.ehi.interlis.modeltopicclass.AbstractClassDef)getModelElement()).getConsolidatedAttributes();
			iterator = inheritedAttributes.iterator();
		} else {
            if (getModelElement() instanceof Classifier) {
    			// show local attributes only
    			iterator = ((Classifier)getModelElement()).iteratorFeature();
            }
		}
        if (iterator != null) {
    		while (iterator.hasNext()) {
    			Object feature = iterator.next();
    			if (feature instanceof AttributeDef) {
    				attributesFigure.add(createAttributeFigure((AttributeDef)feature));
    			}
    		}
        }
	}

    attributesFigure.update();
    update();
}

/**
 * Update the method figure and the ClassFigure itself as well. This causes calculating
 * the layout of contained figures.
 */
private void updateOperationFigure() {
//TODO Tune: currently all operationFigure's are removed and readded at modelChange
	operationsFigure.removeAll();
	operationSeparator.setLineVisible(false);	//automatic display acc. to existing methods
	
	if ((getModelElement() instanceof Classifier) && (!((PresentationAbstractClass)getNode()).isSuppressOperations())) {
		Iterator iterator = ((Classifier)getModelElement()).iteratorFeature();
			
		while (iterator.hasNext()) {
			Object feature = iterator.next();
			if (feature instanceof UmlOperation) {
				operationSeparator.setLineVisible(true);
				operationsFigure.add(createOperationFigure((UmlOperation)feature));
			}
		}
	}

	operationsFigure.update();
	update();
}
private void updateEnumerationFigure() {
//TODO Tune: currently all attributeFigure's are removed and readded at modelChange");//$NON-NLS-2$//$NON-NLS-1$
    attributesFigure.removeAll();
    
    Type type = ((DomainDef)getModelElement()).getType();
    if ((type != null) && (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration)) {
        attributeSeparator.setLineVisible(true);
        createEnumerationFigure((ch.ehi.interlis.domainsandconstants.basetypes.Enumeration)type, "");
    }
    attributesFigure.update();
    update();
}
private void createEnumerationFigure(ch.ehi.interlis.domainsandconstants.basetypes.Enumeration type, String offset) {
    Iterator iterator = type.iteratorEnumElement();
    
    while (iterator.hasNext()) {
        EnumElement element = (EnumElement)iterator.next();
        TextFigure enumFigure = new TextFigure();
        enumFigure.setFont(getFont());
        enumFigure.setText(offset + element.getName().getValue());
        enumFigure.setReadOnly(true);
        attributesFigure.add(enumFigure);
        
        if (element.containsChild()) {
            createEnumerationFigure(element.getChild(), offset + "  ");
        }
    }
}
/**
 * ModelElement changed. Therefore a refresh of the View is needed.
 */
public void updateView() {
    ModelElement element = getModelElement();
	if (element != null) {
		if (!element.containsNamespace()) {
			// case removed => parent detached this node before sending MetaModelChanged-Event
			removeVisually();
		} else {
			// node might have changed
			super.updateView();
			// show abstract Classes in italics
			Font font = classNameFigure.getFont();
			if ((element instanceof Classifier) && ((Classifier)element).isAbstract()) {
				font = new Font(font.getName(), Font.ITALIC, font.getSize());
			} else {
				font = new Font(font.getName(), Font.PLAIN, font.getSize());
			}
			classNameFigure.setFont(font);
			classNameFigure.setText(element.getDefLangName());
            
            if ((element instanceof DomainDef) && ((DomainDef)element).containsType()) {
               updateEnumerationFigure();
            } else if (element instanceof AbstractModelElement) {
			   updateAttributeFigure();
			   updateOperationFigure();
            }
		}
	}
}
/**
 * Overwrites.
 */
public void setNode(ch.ehi.umleditor.umlpresentation.PresentationNode node) {
    super.setNode(node);
    
    updateStereotype();
}
/**
 * Show Stereotype.
 * @see #isPseudoClassifier(Object)
 */
private void updateStereotype() {
    ModelElement element = getModelElement();
    String stereotypName = null;
    if (element instanceof ch.ehi.interlis.metaobjects.MetaDataUseDef) {
        attributeSeparator.setLineVisible(false);
        ch.ehi.interlis.metaobjects.MetaDataUseDef metadata = (ch.ehi.interlis.metaobjects.MetaDataUseDef)element;
        if (metadata.getKind() == MetaDataUseDefKind.SIGN) {
            stereotypName = "ILISIGN";
        } else if (metadata.getKind() == MetaDataUseDefKind.REFSYSTEM) {
            stereotypName = "ILICRS";
        } else {
            stereotypName = "ILISIGN | ILICRS";
        }
    } else if (element instanceof UnitDef) {
        attributeSeparator.setLineVisible(false);
        stereotypName = "ILIUNIT";
    } else if (element instanceof FunctionDef) {
        attributeSeparator.setLineVisible(false);
        stereotypName = "ILIFUNCTION";
    } else if (element instanceof LineFormTypeDef) {
        attributeSeparator.setLineVisible(false);
        stereotypName = "ILILINEFORM";
    } else if (element instanceof DomainDef) {
        Type type = ((DomainDef)element).getType();
        if ((type != null) && (type instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration)) {
            stereotypName = "enumeration";
        } else {
            attributeSeparator.setLineVisible(false);
            stereotypName = "ILIDOMAIN";
        }
    } else if (element instanceof GraphicParameterDef) {
        attributeSeparator.setLineVisible(false);
        stereotypName = "ILIRUNTIMEPARAM";
    } else if (element instanceof ViewDef) {
        attributeSeparator.setLineVisible(false);
        stereotypName = "ILIVIEW";
    } else if (element instanceof GraphicDef) {
        attributeSeparator.setLineVisible(false);
        stereotypName = "ILIGRAPHIC";
    }
    if (stereotypName != null) {
        TextFigure stereotypeFigure = new TextFigure();
        stereotypeFigure.setFont(getFont());
        stereotypeFigure.setText("<<" + stereotypName + ">>");
        stereotypeFigure.setReadOnly(true);
        nameFigure.add(stereotypeFigure);
    }
}
/**
 * @deprecated
 */
protected static boolean isPseudoClassifier(Object element) {
//TODO HACK: AbstractModelElement's which should implement Classifier
    return (element instanceof RoleDef) ||
        (element instanceof MetaDataUseDef) ||
        (element instanceof UnitDef) ||
        (element instanceof FunctionDef) ||
        (element instanceof LineFormTypeDef) ||
    //  (element instanceof DomainDef) ||
        (element instanceof GraphicParameterDef) ||
        (element instanceof ViewDef) ||
        (element instanceof GraphicDef) ||
        (element instanceof TopicDef);
}
}