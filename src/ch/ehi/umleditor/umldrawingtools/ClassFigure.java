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
import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.interlis.attributes.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import CH.ifa.draw.figures.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.contrib.*;
import ch.ehi.umleditor.application.*;
import ch.softenvironment.util.*;

/**
 * A ClassFigure is a graphical representation for an UML Class
 * in an UML Class Diagram.
 * A ClassFigure separates the graphical representation from the data model
 * (PresentationElement). A class has a class
 * name, attributes and methods.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:51 $
 */
public class ClassFigure extends NodeFigure implements ActionListener {
	// TextFigure for editing the class name
	private static java.util.ResourceBundle resources = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/umldrawingtools/resources/ClassFigure");  //$NON-NLS-1$
	private TextFigure classNameFigure;	// DON't set = null
	private SeparatorFigure classHeaderSeparator; // DON't set = null

	// Direct reference to a composite figure which stores text figures for attribute names.
	// This figure is also part of this composite container.
	private GraphicalCompositeFigure attributesFigure; // DON't set = null

	// Direct reference to a composite figure which stores text figures for method names.
	// This figure is also part of this composite container.
	private GraphicalCompositeFigure methodsFigure; // DON't set = null

	// PopupMenu
	private static String SUPPRESS_ATTRIBUTES_ACTION_COMMAND = "SUPPRESS_ATTRIBUTES";//$NON-NLS-1$
	private static String SHOW_INHERITED_ATTRIBUTES_ACTION_COMMAND = "SHOW_INHERITED_ATTRIBUTES";//$NON-NLS-1$
	private JCheckBoxMenuItem chxSuppressAttributes = null;
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
		} else if (e.getActionCommand().equals(SHOW_INHERITED_ATTRIBUTES_ACTION_COMMAND)) {
			((PresentationAbstractClass)getNode()).setShowInheritedAttributes(chxShowInheritedAttributes.isSelected());
		}
		// updateAttributeFigure(); => is called by Model-Change
	} catch(Throwable exception) {
		ch.softenvironment.util.Tracer.getInstance().runtimeError(this, "actionPerformed(ActionEvent)", e.toString())		;
		ch.ehi.umleditor.application.LauncherView.getInstance().handleException(exception);
	}
}
/**
 * Add an attribute.
 *
 * @param attributeName expected format "attributeName" or "attributeName : Type"
 */
private void addAttribute() {
    try {
        // 1) add model
        ElementFactory.createAttributeDef((AbstractClassDef)getModelElement());

        // 2) add view for model @see updateModel()
    } catch (Throwable e) {
        LauncherView.getInstance().handleException(e);
    }
}
/**
 * Add a name for a method. The underlying class in the model is updated as well
 * to hold the method name.
 *
 * @param newMethod name of the new method
 */
private void addMethod(String newMethod) {
/*
	TextFigure classFigureMethod = new TextFigure() {
		public void setText(String newString) {
			if (!getText().equals(newString)) {
			}
			super.setText(newString);
			updateMethodFigure();
		}
	};
	classFigureMethod.setText(newMethod);
	classFigureMethod.setFont(getFont());
	methodsFigure.add(classFigureMethod);
	updateMethodFigure();
*/
}
/**
 * Add individual PopupMenu items for this class.
 * @see createPopupMenu()
 */
protected void addSpecialMenu(javax.swing.JPopupMenu popupMenu) {
	popupMenu.add(new JSeparator());

	popupMenu.add(new AbstractAction(resources.getString("MniNewAttributeDef_text")) { //$NON-NLS-1$
		public void actionPerformed(ActionEvent event) {
			addAttribute();
		}
	});
/*
 	//future use
	popupMenu.add(new AbstractAction(resources.getString("MniNewMethod_text")) {
		public void actionPerformed(ActionEvent event) {
			addMethod("<method()>");
		}
	});
*/

	chxSuppressAttributes = new javax.swing.JCheckBoxMenuItem(resources.getString("MniSuppressAttributes_text")); //$NON-NLS-1$
	chxSuppressAttributes.setActionCommand(SUPPRESS_ATTRIBUTES_ACTION_COMMAND);
 	chxSuppressAttributes.addActionListener(this);
 	chxShowInheritedAttributes = new javax.swing.JCheckBoxMenuItem(resources.getString("MniShowInheritedAttributes_text")); //$NON-NLS-1$
	chxShowInheritedAttributes.setActionCommand(SHOW_INHERITED_ATTRIBUTES_ACTION_COMMAND);
	chxShowInheritedAttributes.addActionListener(this);  
   	if (getNode() == null) {
	   	chxSuppressAttributes.setSelected(false);
		chxShowInheritedAttributes.setSelected(false);
    } else {
	    chxSuppressAttributes.setSelected(((PresentationAbstractClass)getNode()).isSuppressAttributes());
		chxShowInheritedAttributes.setSelected(((PresentationAbstractClass)getNode()).isShowInheritedAttributes());
 	}
	chxShowInheritedAttributes.setEnabled(!chxSuppressAttributes.isSelected());
	popupMenu.add(chxSuppressAttributes);
	popupMenu.add(chxShowInheritedAttributes);
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
    GraphicalCompositeFigure nameFigure =
        new GraphicalCompositeFigure(new SeparatorFigure());
    nameFigure.add(classNameFigure);
    nameFigure.getLayouter().setInsets(new Insets(0, 4, 0, 0));
    add(nameFigure);

    // create a figure responsible for maintaining attributes
    classHeaderSeparator = new SeparatorFigure();
    attributesFigure = new GraphicalCompositeFigure(classHeaderSeparator);
    attributesFigure.getLayouter().setInsets(new Insets(4, 4, 4, 0));
    // add the figure to the Composite
    add(attributesFigure);
/*
    // create a figure responsible for maintaining methods
    methodsFigure = new GraphicalCompositeFigure(new SeparatorFigure());
    methodsFigure.getLayouter().setInsets(new Insets(4, 4, 4, 0));
    // add the figure to the Composite
    add(methodsFigure);
*/
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
protected void updateAttributeFigure() {
Tracer.getInstance().tune(this, "updateAttributeFigure()", "currently all attributeFigure's are removed and readded at modelChange");//$NON-NLS-2$//$NON-NLS-1$
	attributesFigure.removeAll();
	
	if ( ((PresentationAbstractClass)getNode()).isSuppressAttributes()) {
		classHeaderSeparator.setLineVisible(false);
	} else {
		classHeaderSeparator.setLineVisible(true);
		Iterator iterator = null;
		if (((PresentationAbstractClass)getNode()).isShowInheritedAttributes()) {
			// show local + inherited attributes
			java.util.List inheritedAttributes = ((ch.ehi.interlis.modeltopicclass.AbstractClassDef)getModelElement()).getConsolidatedAttributes();
			iterator = inheritedAttributes.iterator();
		} else {
			// show local attributes only
			iterator = ((AbstractClassDef)getModelElement()).iteratorFeature();
		}
		while (iterator.hasNext()) {
			attributesFigure.add(createAttributeFigure((AttributeDef)iterator.next()));
		}
	}

    attributesFigure.update();
    update();
}
/**
 * Update the method figure and the ClassFigure itself as well. This causes calculating
 * the layout of contained figures.
 */
private void updateMethodFigure() {
/*
    methodsFigure.update();
    update();
*/
}
/**
 * ModelElement changed. Therefore a refresh of the View is needed.
 */
public void updateView() {
	if (getModelElement() != null) {
		if (!getModelElement().containsNamespace()) {
			// case removed => parent detached this node before sending MetaModelChanged-Event
			removeVisually();
		} else {
			// node might have changed
			super.updateView();
			classNameFigure.setText(getModelElement().getDefLangName());
			updateAttributeFigure();
//			updateMethodFigure();
		}
	}
}
}
