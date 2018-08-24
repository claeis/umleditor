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

import ch.ehi.interlis.associations.*;
import ch.ehi.interlis.domainsandconstants.DomainDef;

import java.util.*;
import java.awt.event.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.framework.*;

import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.uml1_4.changepropagation.MetaModelChange;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.umleditor.application.*;
import ch.softenvironment.util.*;
import ch.softenvironment.view.*;
/**
 * Drawing View for Class-Diagram's.
 * 
 * @author Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.25 $ $Date: 2008-04-08 09:58:25 $
 * @see DelegationSelectionTool#handleMousePopupMenu(..)
 */
public class ClassDiagramView extends CH.ifa.draw.contrib.zoom.ZoomDrawingView {
	private ch.ehi.umleditor.umlpresentation.Diagram diagram = null;
	private Element parentElement = null;
	// Menu Checkboxes
	private boolean showAssociationNames = false;
	private boolean showAttributes = true;
	private boolean showLinkFigure = false;
	private boolean showRoles = true;
	private boolean showMultiplicity = false;
	private boolean loading = false;
	
	private java.util.Map xorNotes = new java.util.HashMap();
	/**
	 * Create XOR-Note ONCE for all Participants only.
	 * @param roleDef
	 * @param position
	 */
	protected void addXorNote(RoleDef roleDef, java.awt.Dimension position) {
		if (!xorNotes.containsKey(roleDef)) {
			xorNotes.put(roleDef, position);
		}
	}
	/**
	 * Useful to force recalculation of the position of XOR-Note.
	 * @param roleDefOrParticipant
	 */
	protected void removeXorNote(Object roleDefOrParticipant) {
		RoleDef roleDef = null;
		if (roleDefOrParticipant instanceof RoleDef) {
			roleDef = ((RoleDef)roleDefOrParticipant);
		} else if (roleDefOrParticipant instanceof Participant) {
			roleDef = ((Participant)roleDefOrParticipant).getAssociation();
		}
		if ((roleDef != null) && xorNotes.containsKey(roleDef)) {
			xorNotes.remove(roleDef);
		}
	}
	protected java.awt.Dimension getXorNote(RoleDef roleDef) {
		if (xorNotes.containsKey(roleDef)) {
			return (java.awt.Dimension)xorNotes.get(roleDef);
		} else {
			return null;
		}
	}
	
	/*
	 * flag
	 * @see #addClassifier()
	 * @see #saveNodeInDiagram()
	 */	 
	private boolean tryAssociations = true;
/**
 * ClassDiagramView constructor comment.
 * @param editor CH.ifa.draw.framework.DrawingEditor
 * @param width int
 * @param height int
 */
public ClassDiagramView(DrawingEditor editor, Diagram diagram) {
	// @see LauncherView.addInternalFrame(..) for setting the Editor
	super(editor /*,
			LauncherView.getInstance().getSettings().getDiagramWidth().intValue(),
			LauncherView.getInstance().getSettings().getDiagramHeight().intValue()*/);
	setDrawing(new StandardDrawing());
	setBackground(ch.ehi.umleditor.application.LauncherView.getSettings().getBackgroundColor());

	// @see refresh() for setDiagramElement(Element)
	this.diagram = diagram;
}
/**
 * Adds a given (Model)-Element to Diagram.
 * @return the added figure.
 * @see NavigationView#mniAddToDiagram()
 */
public Figure add(Element element) {
    // 1) check whether element already displayed in Diagram
    Iterator iterator = getDiagram().iteratorPresentationElement();
    while (iterator.hasNext()) {
        PresentationElement presentationElement = (PresentationElement) iterator.next();
        Iterator subjects = presentationElement.iteratorSubject();
        while (subjects.hasNext()) {
            ModelElement modelElement = (ModelElement) subjects.next();
            if (modelElement.equals(element)) {
                BaseDialog.showWarning((java.awt.Component)LauncherView.getInstance(),
                    NodeFigure.getResourceString(ClassDiagramView.class, "CTAddElement"), //$NON-NLS-1$
                    NlsUtils.formatMessage(NodeFigure.getResourceString(ClassDiagramView.class, "CWElementAdded"), modelElement.getDefLangName())); //$NON-NLS-1$
                return null;
            }
        }
    }

    // 2) otherwise create the PresentationElement
    if (element instanceof AssociationDef) {
        Figure edge =  saveAssociation((AssociationDef)element);
        // add XOR-edges of this association
        Iterator it = ((AssociationDef)element).iteratorConnection();
        while (it.hasNext()) {
            // each RoleDef might be also an XOR-end
            RoleDef role = (RoleDef)it.next();
            Iterator xorIt = role.iteratorXorParticipant();
            while(xorIt.hasNext()) {
                Participant p = (Participant)xorIt.next();
                checkXorRole((AbstractModelElement)p.getParticipant());
            }
        }
        return edge;
    } else if (isDrawablePackage(element.getClass())) {
        return savePackageFigure((ModelElement) element, new PackageFigure());
    } else if ((element instanceof Classifier) ||
            ClassFigure.isPseudoClassifier(element)) {
    	return saveClassFigure((AbstractModelElement /*Classifier*/)element, new ClassFigure()); 
    } else if (element instanceof ch.ehi.umleditor.umlpresentation.Association) {
    	return saveAssociationComposite((ch.ehi.umleditor.umlpresentation.Association)element);
	} else if (element instanceof RoleDef) {
    	return loadPresentationRole((RoleDef)element, null);
    } else {
        throw new DeveloperException(NlsUtils.formatMessage(NodeFigure.getResourceString(ClassDiagramView.class, "CEInvalidType"), element.toString())); //$NON-NLS-1$
    }
}
/**
 * Adds a new figure to the drawing.
 * Called by UML-Toolbox.
 * @return the added figure.
 * @see EdgeFigure.handleConnection(Figure, Figure)
 */
public Figure add(Figure figure) {
	try {
		if (figure instanceof AssociationAttributeFigure) {
			// must precede ClassFigure test below
			super.add(figure);
		} else if (figure instanceof ClassFigure) {
			saveClassFigure(ElementFactory.createClassDef(getParentElement()), figure);
		} else if (figure instanceof PackageFigure) {
			// create the ModelElement
		    ModelElement packageDef =
       			(ModelElement)ElementFactory.createOwnedElement(determinePackageModelElementClass(), getParentElement());
    		savePackageFigure(packageDef, figure);
		} else if (figure instanceof NoteFigure) {
			// create the PresentationElement
		    ch.ehi.umleditor.umlpresentation.Note note = ElementFactory.createNote();

		    // saveNode(..)	=> Special Case: Note has no ModelElement
		    ((NoteFigure)figure).setClassDiagram(this);
			((NoteFigure)figure).setNode(note);

			saveNodeInDiagram(note, figure);
		} else if ((figure instanceof EdgeFigure) || 
					(figure instanceof LinkFigure) ||
					(figure instanceof RoleDefFigure)) {
			super.add(figure);
		}
	} catch(Throwable e) {
	    BaseDialog.showError(LauncherView.getInstance(), ModelElementUI.CREATION_ERROR, NodeFigure.getResourceString(ClassDiagramView.class, "CEFigureNotCreated"), e); //$NON-NLS-1$
	}

	return figure;
}
/**
 * Add given RoleDef's Classifier if missing in Diagram.
 * @see #saveNodeInDiagram()
 */
private Figure addClassifier(RoleDef roleDef) {
	Figure figure = findFigure((Classifier)roleDef.getParticipant());
	if (figure == null) {
		tryAssociations = false;	// prevent double insert of Association
		figure = add((Classifier)roleDef.getParticipant());
		tryAssociations = true;
	}
  	return figure;
}
/**
 * @see #allowsClasses(Element).
 */
public boolean allowsClasses() {
	return allowsClasses(getParentElement());
}
/**
 * Determine whether a ClassDiagram may contain given Element of non-Package-Type.
 * @return whether allowed or not
 */
public static boolean allowsClasses(Element element) {
	String validOwnedElements[];
	if ((element instanceof Namespace) && ((validOwnedElements = ((Namespace)element).getValidOwnedElements()) != null)) {
		for (int i=0; i<validOwnedElements.length; i++) {
			try {
				if (java.lang.Class.forName((String)validOwnedElements[i]).equals(ClassDef.class)) {
					return true;
				}
			} catch(ClassNotFoundException e) {
				Tracer.getInstance().developerError("Class <" + validOwnedElements[i] + "> does not exist!");//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
			}
		}
	}

	return false;
}
/**
 * @see #allowsPackages(Element)
 */
public boolean allowsPackages() {
	return allowsPackages(getParentElement());
}
/**
 * Determine whether a ClassDiagram may contain given Element of PackageType.
 * @return whether allowed or not
 */
public static boolean allowsPackages(Element element) {
	String validOwnedElements[];
	if ((element instanceof Namespace) && ((validOwnedElements = ((Namespace)element).getValidOwnedElements()) != null)) {
		for (int i=0; i<validOwnedElements.length; i++) {
			try {
				// check for valid Package-Types
				java.lang.Class possibleClass = java.lang.Class.forName((String)validOwnedElements[i]);
				if (isDrawablePackage(possibleClass)) {
					return true;
				}
			} catch(ClassNotFoundException e) {
				Tracer.getInstance().developerError("Class <" + validOwnedElements[i] + "> does not exist!");//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
			}
		}
	}
	return false;
}
/**
 * Determine the valid default Package-Type to be created in this Diagram.
 * @see #allowsPackages()
 */
private java.lang.Class determinePackageModelElementClass() {
	if (getParentElement() instanceof ch.ehi.uml1_4.implementation.UmlModel) {
		return ch.ehi.interlis.modeltopicclass.INTERLIS2Def.class;
	} else if (parentElement instanceof INTERLIS2Def) {
		return ch.ehi.interlis.modeltopicclass.ModelDef.class;
	} else if (parentElement instanceof ModelDef) {
		return ch.ehi.interlis.modeltopicclass.TopicDef.class;
	} else {
		return ch.ehi.uml1_4.implementation.UmlPackage.class;
	}
}
/**
 * Find the Figure of Type AssociationAttributeFigure in this DrawingView 
 * of the given AssociationDef.
 * Create the figure if suppressed yet, because if there is an Generalization or 
 * an "Intermediate"-Association between two Associations, the AttributeFigure of the LinkFigure
 * are always drawn.
 * 
 * @param startEndElement (beginning/ending Association where modelElement "is put inbetween")
 * @param modelElement (the element between two Associations)
 * @return Connector
 */
protected Connector findAssociationAttributeConnector(Element startEndElement, int x, int y, Element modelElement) {
	LinkFigure linkFigure = (LinkFigure)findFigure(startEndElement);
	if (linkFigure == null) {
		return null;
	} else {
		// make sure AssociationAttributeFigure is not suppressed
		AssociationAttributeFigure attrFigure = linkFigure.showAttributeFigure(startEndElement, modelElement);
		if (attrFigure == null) {
			return null;
		}
		return (Connector)attrFigure.connectorAt(x, y);
	}
}
/**
 * Find the ClassFigure in this DrawingView at the given coordinates.
 * @return ClassFigure
 */
protected ClassFigure findClassFigure(int x, int y) {
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if ((figure instanceof ClassFigure) &&
				(!(figure instanceof AssociationAttributeFigure)) &&
				(figure.containsPoint(x, y))) {
			return (ClassFigure)figure;
		}
	}
	return null;
}
/**
 * Find a possible NodeFigure as target for given connection
 * at given coordinates.
 */
protected Figure findConnectableFigure(int x, int y, ConnectionFigure connection) {
	// copied code from JHotDraw's ConnectionTool#findConnectableFigure(..)
	FigureEnumeration k = drawing().figuresReverse();
	while (k.hasMoreElements()) {
		Figure figure = k.nextFigure();
		if (!figure.includes(connection) && figure.canConnect()
				&& figure.containsPoint(x, y)) {
			return figure;
		}
	}
	return null;
}
/**
 * Finds an existing ConnectionFigure (say Edge) at given Coordinates.
 * @see ConnectionTool#findConnection(..) => copied Code
 */
protected ConnectionFigure findConnection(int x, int y) {
	// copied Method from JHotDraw's ConnectionTool#findConnection(..)
	java.util.Enumeration k = drawing().figuresReverse();
	while (k.hasMoreElements()) {
		Figure figure = (Figure) k.nextElement();
		figure = figure.findFigureInside(x, y);
		if (figure != null && (figure instanceof ConnectionFigure)) {
			return (ConnectionFigure)figure;
		}
	}
	return null;
}
/**
 * Find the Figure in this DrawingView containing the given Element.
 * Remark:
 * - RoleDefFigure and AssociationAttributeFigure cannot be found by this method
 *	 (because they are artifical)
 * @return Connector (of the found Figures)
 */
protected Figure findFigure(Element element) {
	//TUNE THIS METHOD!
	if (element != null) {
		FigureEnumeration enumeration = drawing().figures();
		while (enumeration.hasMoreElements()) {
			Figure figure = enumeration.nextFigure();
			if ((figure instanceof RoleDefFigure) ||
					(figure instanceof AssociationAttributeFigure)) {
				// this are artifical figures and are to be maintained
				// by its Responsibles, such as:
				// - PresentantionRoleFigure->RoleDefFigure
				// - LinkFigure->AssociationAttributeFigure
				continue;
			}

			if (element instanceof PresentationElement) {
				// try by presentationElement
				if (figure instanceof NodeFigure) {
					// Note, PresentationLink
					if (element.equals(((NodeFigure)figure).getNode())) {
						return figure;
					}
				} else if (figure instanceof EdgeFigure) {
					if (element.equals(((EdgeFigure)figure).getEdge())) {
						return figure;
					}
				}
			} else {
				// try by ModelElement
				if ((figure instanceof ClassFigure) || (figure instanceof PackageFigure) || (figure instanceof LinkFigure)) {
					if (element.equals(((NodeFigure)figure).getModelElement())) {
						return figure;
					}
				} else if ((figure instanceof EdgeFigure) && element.equals(((EdgeFigure)figure).getModelElement())) {
					return figure;
				} //else Tracer.getInstance().nyi(this, "findFigure(Element)", "for ModelElement <" + element.toString() + ">");
			}
		}
	}
	return null;
}
/**
 * Find the Figure in this DrawingView containing the given Element.
 * @return Connector (of the found Figures)
 */
protected Connector findNodeConnector(Element element, int x, int y) {
	Figure figure = findFigure(element);
	if (figure == null) {
		return null;
	} else {
		return (Connector)figure.connectorAt(x, y);
	}
}
/**
 * Find parent ModelElement of this diagram.
 */
private void findParentElement(Element root) {
    if (root instanceof Namespace) {
        Iterator iterator = ((Namespace) root).iteratorDiagram();
        while ((parentElement == null) && iterator.hasNext()) {
            if (diagram.equals((Diagram)iterator.next())) {
                // parent found
                parentElement = root;
            }
        }
        if (parentElement == null) {
	        // try further hierarchies
            iterator = ((Namespace) root).iteratorOwnedElement();
            while ((parentElement == null) && iterator.hasNext()) {
                findParentElement((Element) iterator.next());
            }
        }
    }
}
/**
 * Return the default Dimension according to UserSettings.
 * If the default Size is not large enough, the size will be enlarged automatically.
 */
public java.awt.Dimension getDefaultDimension() {
	int defaultWidth = LauncherView.getSettings().getDiagramWidth().intValue();
    int defaultHeight = LauncherView.getSettings().getDiagramHeight().intValue();
	java.awt.Dimension minDim = getMinimumDimension();
	double newWidth = 0;
	double newHeight = 0;
	
	if ((int)minDim.getWidth() > defaultWidth) {
		// enlarge width a little bit
		newWidth = minDim.getWidth() + minDim.getWidth() / 5;
	} else {
		newWidth = defaultWidth;
	}

	if ((int)minDim.getHeight() > defaultHeight) {
		// enlarge height a little bit
		newHeight = minDim.getHeight() + minDim.getHeight() / 5;
	} else {
		newHeight = defaultHeight;
	}

    return new java.awt.Dimension((int)newWidth, (int)newHeight);
}
/**
 * Return the Diagram-Element.
 */
public Diagram getDiagram() {
	return diagram;
}
/**
 * Return the minimal Dimension to represent all Figures presented by this diagram.
 */
public java.awt.Dimension getMinimumDimension() {
	java.awt.Dimension max=new java.awt.Dimension(0,0);
    if (getDiagram() != null) {
        Iterator iterator = getDiagram().iteratorPresentationElement();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
			if (obj instanceof ch.ehi.umleditor.umlpresentation.Association) {
				ch.ehi.umleditor.umlpresentation.Association assoc = (ch.ehi.umleditor.umlpresentation.Association) obj;
				PresentationNode node=assoc.getLinkPresentation();
				getMinDimHelper_processNode(node,max);
				Iterator ri = assoc.iteratorRolePresentation();
				while (ri.hasNext()) {
					PresentationEdge role = (PresentationEdge) ri.next();
					getMinDimHelper_processEdge(role,max);
				}
			}else if (obj instanceof PresentationEdge) {
                PresentationEdge edge = (PresentationEdge) obj;
				getMinDimHelper_processEdge(edge,max);
            } else if (obj instanceof PresentationNode) {
	           PresentationNode node = (PresentationNode) obj;
			   getMinDimHelper_processNode(node,max);
			}
        }
    }
	max.width++;
	max.height++;
    return max;
}
private void getMinDimHelper_processEdge(PresentationEdge edge,java.awt.Dimension max)
{
	Iterator wpi = edge.iteratorWayPoint();
	while (wpi.hasNext()) {
		WayPoint wp = (WayPoint) wpi.next();
		if (wp.getEast() > max.width){
			max.width = wp.getEast();
		}
		if (wp.getSouth() > max.height){
			max.height = wp.getSouth();
		}
	}
	
}
private void getMinDimHelper_processNode(PresentationNode node,java.awt.Dimension max)
{
	int east;
	int south;
	int width;
	int height;
	if(node instanceof ch.ehi.umleditor.umlpresentation.PresentationAssocClass){
		ch.ehi.umleditor.umlpresentation.PresentationAssocClass assocClass=(ch.ehi.umleditor.umlpresentation.PresentationAssocClass)node;
		if(!assocClass.isLinkWithoutClass()){
			// consider AssociationClass figure
			east=(int)assocClass.getClassAngle();
			south=(int)assocClass.getClassRadius();
			width=node.getWidth();
			height=node.getHeight();
			if (east + width > max.width){
				max.width = east + width;
			}
			if (south + height > max.height){
				max.height = south + height;
			}
		}
		// consider node as a waypoint!
		east=node.getEast();
		south=node.getSouth();
		width=0;
		height=0;
	}else{
		// consider figure
		east=node.getEast();
		south=node.getSouth();
		width=node.getWidth();
		height=node.getHeight();
	}
	if (east + width > max.width){
		max.width = east + width;
	}
	if (south + height > max.height){
		max.height = south + height;
	}
}
/**
 * Return the Element containing the Diagram itself and all Figure-ModelElements in it.
 */
protected Element getParentElement() {
	if (parentElement == null) {
		findParentElement(LauncherView.getInstance().getModel());
	}
	return parentElement;
}
/**
 * Return the title of this Diagram.
 * @return String ("Class Diagram: Parentpackage / DiagramName")
 */
public String getTitle() {
	Object[] tokens = { ((ModelElement)getParentElement()).getDefLangName(), ElementUtils.mapNlsString(getDiagram().getName()) };
	return NlsUtils.formatMessage(NodeFigure.getResourceString(ClassDiagramView.class, "CTClassDiagram"), tokens); //$NON-NLS-1$
}
/**
 * Allow suppressing of MetaModelChange-Events.
 * Ignored events are up to callers-Responsibility.
 * Events are ignored until reset by ignore==true.
 */
public void ignoreMetaModelChanges(boolean ignore) {
	java.awt.Container container = this;
	while (!((container = container.getParent()) instanceof DrawingFrame));
	DrawingFrame frame = (DrawingFrame)container;

	if (ignore) {
		frame.unregisterListener();
	} else {
		frame.registerListener();
	}
}
/**
 * Check wether Element might by added to Diagram.
 */
public boolean isAddable(Element element) {
	return (element != null) && 
                ((element instanceof AbstractClassDef) || 
				isDrawablePackage(element.getClass()) ||
				ClassFigure.isPseudoClassifier(element) ||
                (element instanceof DomainDef));
}
/**
 * Return whether given Class is a drawable Package.
 */
private static boolean isDrawablePackage(java.lang.Class aClass) {
	if (//aClass.equals(Ili2ModelSet.class) ||
			aClass.equals(INTERLIS2Def.class) ||
			aClass.equals(ModelDef.class) ||
			aClass.equals(TopicDef.class) ||
			aClass.equals(ch.ehi.uml1_4.implementation.UmlPackage.class)) {
		return true;
	}
	return false;
}
/**
 * Return state if loading figures.
 * @return boolean
 */
protected boolean isLoading() {
	return loading;
}
/**
 * 
 */
public boolean isShowAllRoles() {
	return showRoles;
}
/**
 * 
 */
protected boolean isShowAssociationNames() {
	return showAssociationNames;
}
/**
 * 
 */
protected boolean isShowAttributeMultiplicity() {
	return getDiagram().isShowAttributeMultiplicity();
}
/**
 * 
 */
protected boolean isShowAttributes() {
	return showAttributes;
}
/**
 * 
 */
protected boolean isShowAttributeTypes() {
	return getDiagram().isShowAttributeType();
}
/**
 * 
 */
protected boolean isShowLinkFigure() {
	return showLinkFigure;
}
/**
 * 
 */
public boolean isShowMultiplicities() {
	return showMultiplicity;
}
/**
 * Handles key down events. Cursor keys are handled
 * by the view the other key events are delegated to the
 * currently active tool.
 */
public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();
/*
	addToSelection(figure);
	Command cmd = new DeleteCommand("Delete", this);
	cmd.execute();
*/

    if ((code == KeyEvent.VK_BACK_SPACE) || (code == KeyEvent.VK_DELETE)) {
        java.util.Enumeration figures = selection().elements();
        while (figures.hasMoreElements()) {
	        // 1) remove Edges
	        Figure figure = (Figure)figures.nextElement();
	        if (figure instanceof EdgeFigure) {
		        ((EdgeFigure)figure).removeVisually();
			}
        }
        figures = selection().elements();
        while (figures.hasMoreElements()) {
	        // 1) remove Nodes
            Figure figure = (Figure)figures.nextElement();
	        if (figure instanceof NodeFigure) {
		        ((NodeFigure)figure).removeVisually();
			}
        }
    } else {
        super.keyPressed(e);
    }

    checkDamage();
}
/**
 * Show a Composite Edge by means the different Association types.
 */
private void loadAssociation(ch.ehi.umleditor.umlpresentation.Association composite) {
    // 1) LinkFigure
    LinkFigure linkFigure = new LinkFigure();
	loadNode(composite.getLinkPresentation(), linkFigure);

    // 2) RoleFigure's
    java.util.Iterator iteratorRole = composite.iteratorRolePresentation();
    while(iteratorRole.hasNext()) {
    	loadPresentationRole(null, (PresentationRole)iteratorRole.next());
    }
/*    
    // 3) XOR Participant's between RoleFigure's
    AssociationDef assoc = (AssociationDef)composite.iteratorSubject().next();
    java.util.Iterator iteratorConnection = assoc.iteratorXorAssociation();
    while(iteratorConnection.hasNext()) {
        RoleDef roleDef = (RoleDef)iteratorConnection.next();
        Iterator iteratorXorParticipant = roleDef.iteratorXorParticipant();
       // while (iteratorXorParticipant.hasNext()) {
            //loadXorConstraint((Participant)iteratorXorParticipant.next());
         //   roleFigure.addXorRole(participant);
       // }
    }
*/
	linkFigure.setCreating(false);
}
/**
 * Draw a node out of Model on this Diagram.
 */
private NodeFigure loadNode(ch.ehi.umleditor.umlpresentation.PresentationNode node, Figure figure) {
	// set model
	((NodeFigure)figure).setClassDiagram(this);
	((NodeFigure)figure).setNode(node);

	// show Figure
	super.add(figure);

	// move the figure to the last saved coordinates
	java.awt.Point origin = new java.awt.Point(node.getEast(), node.getSouth());
	java.awt.Point corner = new java.awt.Point(node.getEast() + node.getWidth(), node.getSouth() + node.getHeight());
	figure.displayBox(origin, corner);

	return (NodeFigure)figure;
}
/**
 * If necessary switch End-Node of Connection.
 * @param edgeFigure
 * @param edge
 * @param targetNode
 * @param index
 * @param endpoint
 * @return
 */
private boolean correctNode(EdgeFigure edgeFigure, PresentationEdge edge, Element targetNode, int index, PresentationNode endpoint) {
	if (targetNode != null) {
		// verify whether view and Model are the same		
		Iterator presentationSubject = endpoint.iteratorSubject();
		if (presentationSubject.hasNext()) {
			ModelElement presentationNode = (ModelElement)presentationSubject.next();
			if (targetNode.equals(presentationNode)) {
				return true;
			} else {
				Figure targetFigure = findFigure(targetNode);
				if (targetFigure != null) {
					Tracer.getInstance().developerWarning("AUTO-CORRECTION: endpoint[" + index + "]=child->relocation:"); // + " <current Classifier>"/*presentationNode.getName().getValue()*/ + "=>" + targetClient.getName().getValue());
					// change the presentation Connection
					edge.setEndpoint(index, ((NodeFigure)targetFigure).getNode());
					Connector connector = findNodeConnector(targetNode, 0, 0);
					edgeFigure.willChange();
					if (index == 0) {
						edgeFigure.setStartConnector(connector);
					} else {
						edgeFigure.setEndConnector(connector);
					}
					edgeFigure.changed();
					checkDamage();
					return true;
				}
			}
		}
	}
	return false;		
}
/**
 * Client or Supplier might have been changed, therefore correct its Presentation.
 * @param dependency
 * @return true->Presentation-Dependency still exists; false->was removed as correction
 */
private boolean correctDependencyRelocation(DependencyLineConnection dependencyFigure) {
	ch.ehi.umleditor.umlpresentation.Dependency dependency = (ch.ehi.umleditor.umlpresentation.Dependency)dependencyFigure.getEdge();
	if ((dependency.sizeEndpoint() == 2)) {
		Iterator endpoints = dependency.iteratorEndpoint();
		if (correctNode((EdgeFigure)dependencyFigure, (PresentationEdge)dependency, dependencyFigure.getStartElement(), 0, (PresentationNode)endpoints.next())) {
			if (correctNode((EdgeFigure)dependencyFigure, (PresentationEdge)dependency, dependencyFigure.getEndElement(), 1, (PresentationNode)endpoints.next())) {
				return true;
			}
		}
	}
	Tracer.getInstance().developerWarning("AUTO-CORRECTION: Removing Dependency-Presentation from Diagram");
	getDiagram().deletePresentationElement(dependency);	
	return false;
}
/**
 * Parent or Child might have been changed, therefore correct its Presentation.
 * @param generalization
 * @return true->role still exists; false->role was removed as correction
 */
private boolean correctGeneralizationRelocation(GeneralizationLineConnection generalizationFigure) {
	ch.ehi.umleditor.umlpresentation.Generalization generalization = (ch.ehi.umleditor.umlpresentation.Generalization)generalizationFigure.getEdge();
	if ((generalization.sizeEndpoint() == 2)) {
		Iterator endpoints = generalization.iteratorEndpoint();
		if (correctNode((EdgeFigure)generalizationFigure, (PresentationEdge)generalization, generalizationFigure.getStartElement(), 0, (PresentationNode)endpoints.next())) {
			if (correctNode((EdgeFigure)generalizationFigure, (PresentationEdge)generalization, generalizationFigure.getEndElement(), 1, (PresentationNode)endpoints.next())) {
				return true;
			}
		}
	}

	Tracer.getInstance().developerWarning("AUTO-CORRECTION: Removing Generalization-Presentation from Diagram");
	getDiagram().deletePresentationElement(generalization);	
	return false;
}
/**
 * Participiant might have been changed, therefore correct its PresentationRole.
 * @param role
 * @return true->role still exists; false->role was removed as correction
 */
private boolean correctRoleRelocation(ch.ehi.umleditor.umlpresentation.PresentationRole role) {
	Iterator subjects = role.iteratorSubject();
	while (subjects.hasNext()) {
		Object object = subjects.next();
if (!(object instanceof AssociationEnd)) {
//TODO NYI: role subject is not an AssociationEnd
	continue;	
}
		AssociationEnd subjectRoleDef = (AssociationEnd)object;
		if (subjectRoleDef.containsParticipant()) {
			Classifier targetClass = subjectRoleDef.getParticipant();
//Tracer.getInstance().debug("PresentationRole->Subject:RoleDef=" + subjectRoleDef.getName().getValue() + ", ClassDef=" + targetClass.getName().getValue());
			Iterator endpoints = role.iteratorEndpoint();
			if (endpoints.hasNext()) {
				endpoints.next(); // skip PresentationAssocClass (LinkNode)
				if (endpoints.hasNext()) {
					object = endpoints.next();
if (!(object instanceof ch.ehi.umleditor.umlpresentation.PresentationAbstractClass)) {
//TODO NYI: endpoint is not an umlpresentation.PresentationAbstractClass
	continue;	
}
					ch.ehi.umleditor.umlpresentation.PresentationAbstractClass presentationClass = (ch.ehi.umleditor.umlpresentation.PresentationAbstractClass)object;
					if (!presentationClass.containsSubject(targetClass)) {
						// role was probably moved to another Classifier in Model by another Diagram
/*							Iterator classSubjects = presentationClass.iteratorSubject();
							while (classSubjects.hasNext()) {
								Classifier wrongClassDef = (Classifier)classSubjects.next();
							}
*/
						Tracer.getInstance().developerWarning("AUTO-CORRECTION: endpoint[1]->relocation:" + " <current Classifier>"/*wrongClassDef.getName().getValue()*/ + "=>" + targetClass.getName().getValue());
						ClassFigure newClass = (ClassFigure)findFigure(targetClass);
						if (newClass != null) {
							// damage will be changed by LinkFigure#updateView()
							role.setEndpoint(1, newClass.getNode());
						}
					}
					return true;
				}
			}
		}
	}
/*
Iterator its = role.getAssociation().iteratorSubject();
while(its.hasNext()) {
	AssociationDef subj = (AssociationDef)its.next();
	Iterator itsc = subj.iteratorConnection();
	while (itsc.hasNext()) {
		RoleDef ro = (RoleDef)itsc.next();
		Tracer.getInstance().debug("RoleDef via Association=" + ro.getParticipant().getName().getValue());
	}				
}
*/		
	getDiagram().removePresentationElement(role);
	Tracer.getInstance().developerWarning("AUTO-CORRECTION: removing PresentationRole because no AssociationEnd is set!");
	return false;
}
/**
 * Add a single PresentationRole to Diagram.
 */
protected Figure loadPresentationRole(RoleDef roleDef, PresentationRole role) {
	if (role == null) {
		Figure linkFigure = findFigure(roleDef.getAssociation());
		if (linkFigure == null) {
			// whole associationDef is missing
			saveAssociation((AssociationDef)roleDef.getAssociation());
		} else {
			// make sure Classifier is to be found in Diagram as well
			Figure nodeFigure = null;
            if (role.iteratorEndpoint().hasNext()) {
                // might point to an XOR-branch as well
                nodeFigure = findFigure((Classifier)role.iteratorEndpoint().next());
            } else {
                // the "main" role end
                nodeFigure = findFigure((Classifier)roleDef.getParticipant());
            }
			if (nodeFigure == null) {
				// role will be inserted by new Node automatically
				nodeFigure = add((Classifier)roleDef.getParticipant());
			} else {
//TODO NYI: search whether Role is presented in Diagram or not
LauncherView.getInstance().nyi("RoleDef zu Diagramm einfuegen");//$NON-NLS-1$
                return null;
/*
				// add NEW role to composite
				ch.ehi.umleditor.umlpresentation.Association associationComposite = ((PresentationAssocClass)((LinkFigure)linkFigure).getNode()).getAssociation();
				PresentationRole edgeRole = ElementMapper.createPresentationRole(this, associationComposite, ((NodeFigure)nodeFigure).getNode(), roleDef);

				// add visually
				EdgeFigure figure = new PresentationRoleFigure(this, edgeRole);
				loadSimpleEdge(figure);
				retur figure;
*/
			}
		}
		return null;
	} else {
		if (role.iteratorSubject().hasNext() && (role.iteratorSubject().next() instanceof Participant)) {
            // show XOR
            return loadRole(role);
        } else if (correctRoleRelocation(role)) {
			// show role visually
            return loadRole(role);
		} else {
			return null;
		}
	}
}
/**
 * Draw the presentation Role.
 * @param role
 * @return
 */
private EdgeFigure loadRole(PresentationRole role) {
    EdgeFigure figure = new PresentationRoleFigure(this, role);
    loadSimpleEdge(figure);
    return figure;
}
/**
 * Show a simple Edge by means plain EdgeFigure as Dependency or Generalization.
 */
protected void loadSimpleEdge(EdgeFigure figure) {
	figure.connectNodes();

	// show Figure
	super.add(figure);
	figure.updateView();
}
/**
 * Refresh Drawings.
 */
public void refresh() {
	// 1) clear all
	FigureEnumeration enumerator = drawing().figures();
	while (enumerator.hasMoreElements()) {
		remove(enumerator.nextFigure());
	}

	// 2) redraw
	if (diagram != null) {
		setDiagramElement(diagram);
	}
}
public void updateFigures() {
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof NodeFigure) {
			((NodeFigure)figure).updateView();
		}else if (figure instanceof EdgeFigure) {
			((EdgeFigure)figure).updateView();
		}
	}
}

/**
 * Removes a figure from the drawing.
 * No influence on Model.
 * @return the removed figure
 */
public Figure remove(Figure figure) {
	// seems to be tricky in JHotDraw, to get what is wanted
	/*Figure fig =*/ super.remove(figure);
	clearSelection();
	repaint();
	repairDamage();
//	removeFromSelection(figure);
/*
	if ((figure != null) && (editor().view() != null)) {
		// remove Node from Drawing
 		clearSelection();
 		addToSelection(figure);
 		Command deleteCommand = new UndoableCommand(new DeleteCommand(JHotDrawConstants.DELECTE_COMMAND, editor()));
	    deleteCommand.execute();
	}
*/
	return figure;
}
/**
 * Draw figure and save Element into Diagram.
 */
private Figure saveAssociation(ch.ehi.uml1_4.foundation.core.Association associationDef)  {
	// 1) check for necessary nodes	
	ArrayList roles = AssociationLineConnection.getRoleClassifiers(associationDef);
	if ((roles.size() < 2) && (AssociationLineConnection.getParent(associationDef) == null)) {
	    BaseDialog.showWarning((java.awt.Component)LauncherView.getInstance(), NodeFigure.getResourceString(ClassDiagramView.class, "CTAssociationNotDisplayable"), NodeFigure.getResourceString(ClassDiagramView.class, "CWRoleMissing")); //$NON-NLS-2$ //$NON-NLS-1$
		return null;
	} else {
		// 2) create Composite
		ch.ehi.umleditor.umlpresentation.Association associationComposite = ElementFactory.createAssociationComposite(associationDef, isShowAssociationNames());
		for (int i=0; i<roles.size(); i++) {
			// 2.1) make sure Classifier's are to be found in Diagram as well
			Figure figure = addClassifier((RoleDef)roles.get(i));
			// 2.2) create PresentationRole's
			ElementFactory.createPresentationRole(this, associationComposite, ((NodeFigure)figure).getNode(), (RoleDef)roles.get(i));
		}

		// 3) add Composite to Diagram
		return add(associationComposite);
	}
}
/**
 * Draw figure's and save Element into Diagram.
 */
private Figure saveAssociationComposite(ch.ehi.umleditor.umlpresentation.Association associationComposite)  {
	// Composite is saved in Diagram instead of Edges
	getDiagram().addPresentationElement(associationComposite);

	// display the whole composite
	loadAssociation(associationComposite);
	
	return null;
}
/**
 * Draw figure and save Element into Diagram.
 */
private Figure saveClassFigure(AbstractModelElement /*Classifier*/ classifier, Figure figure)  {
//TODO HACK: classifier type should be Classifier 
	// create the PresentationElement
    ch.ehi.umleditor.umlpresentation.Class classDefView = (ch.ehi.umleditor.umlpresentation.Class)ElementFactory.createObject(ch.ehi.umleditor.umlpresentation.Class.class);
 	saveNode(classDefView, classifier, figure);

  	return figure;
}
/**
 * Save the presentation of Node in Model.
 */
protected void saveNode(ch.ehi.umleditor.umlpresentation.PresentationNode node, ModelElement modelElement, Figure figure) {
	((NodeFigure)figure).setClassDiagram(this);

	node.addSubject(modelElement);
	((NodeFigure)figure).setNode(node);

	saveNodeInDiagram(node, figure);
}
/**
 * Map Figure to View, save Coordinates of a Node
 * and add it to the contained Diagram-Element.
 */
protected void saveNodeInDiagram(PresentationNode node, Figure figure) {
	// show figure as late as possible (because of FigureName generation, save Failures etc)
	super.add(figure);
	((NodeFigure)figure).update();

	// keep coordinates
	// -> @see NodeFigure.basicDisplayBox(Point origin, Point corner)

    // keep Colors
    node.setForeground(ColorConverter.createColor(((NodeFigure)figure).getLineColor()));
    node.setBackground(ColorConverter.createColor(((NodeFigure)figure).getFillColor()));

    // keep references
    getDiagram().addPresentationElement(node);

    // try to draw any presentationEdges if other node is shown
    Iterator iterator = node.iteratorSubject();
    if (iterator.hasNext()) {
	    // Node should always have ONE Node ModelElement
	    ch.ehi.uml1_4.implementation.AbstractModelElement modelElement = (ch.ehi.uml1_4.implementation.AbstractModelElement)iterator.next();
	    
	    // show Dependencies
		Iterator dependencies = modelElement.iteratorClientDependency();
		while (dependencies.hasNext()) {
			// modelElement is Client
			ch.ehi.uml1_4.foundation.core.Dependency dependency = (ch.ehi.uml1_4.foundation.core.Dependency)dependencies.next();
			Iterator suppliers = dependency.iteratorSupplier();
			if (suppliers.hasNext()) {
				Object supplier = suppliers.next();
				if (supplier instanceof GeneralizableElement) {
					Figure end = findFigure((GeneralizableElement)supplier);
					if (end != null) {
						loadSimpleEdge(new DependencyLineConnection(this, figure, end, dependency));
					}
				}
			}
		}
		dependencies = modelElement.iteratorSupplierDependency();
		while (dependencies.hasNext()) {
			// modelElement is Supplier
			ch.ehi.uml1_4.foundation.core.Dependency dependency = (ch.ehi.uml1_4.foundation.core.Dependency)dependencies.next();
			Iterator clients = dependency.iteratorClient();
			if (clients.hasNext()) {
				Object client = clients.next();
				if (client instanceof GeneralizableElement) {
					Figure start = findFigure((GeneralizableElement)client);
					if (start != null) {
						loadSimpleEdge(new DependencyLineConnection(this, start, figure, dependency));
					}
				}
			}
		}
		
	    // show Generalizations
	    if (modelElement instanceof GeneralizableElement) {
		    Iterator generalizations = ((GeneralizableElement)modelElement).iteratorSpecialization();
		    while (generalizations.hasNext()) {
				ch.ehi.uml1_4.foundation.core.Generalization generalization = (ch.ehi.uml1_4.foundation.core.Generalization)generalizations.next();
				Figure parent = findFigure(generalization.getParent());
				Figure child = findFigure(generalization.getChild());
				if ((parent != null) && (child != null)) {
					loadSimpleEdge(new GeneralizationLineConnection(this, figure, parent, generalization));
				}
		    }
		    generalizations = ((GeneralizableElement)modelElement).iteratorGeneralization();
		    while (generalizations.hasNext()) {
			    ch.ehi.uml1_4.foundation.core.Generalization generalization = (ch.ehi.uml1_4.foundation.core.Generalization)generalizations.next();
				Figure start = findFigure(generalization.getParent());
				if (start != null) {
					loadSimpleEdge(new GeneralizationLineConnection(this, start, figure, generalization));
				}
		    }
	    }

	    // show Associations
	    if ((modelElement instanceof Classifier) && tryAssociations) {
	    	// BE AWARE:
	    	// Associations are added to the Repository as ownedElement only 
	    	// at ONE END of at least two possible Classifier's.
	    	
		    // 1) modelElement IS Owner of Association
	    	Iterator elements = modelElement.getNamespace().iteratorOwnedElement();
	    	while (elements.hasNext()) {
	    		Object ownedModelElement = /*(ch.ehi.uml1_4.implementation.AbstractModelElement)*/ elements.next();
	    		if (ownedModelElement instanceof ch.ehi.uml1_4.foundation.core.Association) {
	    			checkAssociation(modelElement, node, (ch.ehi.uml1_4.foundation.core.Association)ownedModelElement);
	    		}
	    	}
	    	
		    // 2) modelElement is NOT the Owner	but the opposite
	    	elements = ((Classifier)modelElement).iteratorAssociation();
	    	while (elements.hasNext()) {
	    		Object associationEnd = elements.next();
	    		if (associationEnd instanceof AssociationEnd) {
	    			checkAssociation(modelElement, node, ((AssociationEnd)associationEnd).getAssociation());
	    		}
	    	}
	    }
    }
}
/**
 * Check whether given association should have been drawn. 
 * @param modelElement
 * @param node
 * @param associationDef
 */
private void checkAssociation(ch.ehi.uml1_4.implementation.AbstractModelElement modelElement, PresentationNode node, ch.ehi.uml1_4.foundation.core.Association associationDef) {
	Iterator it = associationDef.iteratorConnection();
	while (it.hasNext()) {
		AssociationEnd roleDef = (AssociationEnd)it.next();
		if (roleDef.containsParticipant() && roleDef.getParticipant().equals(modelElement)) {
			trySaveAssociation(associationDef, node, roleDef);
		}		
	}    
    
    checkXorRole(modelElement);
}
/**
 * Add an XOR-edge to given XOR-ClassDef if association and the XOR-Node is already drawn.
 * @param modelElement
 */
private void checkXorRole(ch.ehi.uml1_4.implementation.AbstractModelElement modelElement) {    
    if (modelElement instanceof ClassDef) {
        Iterator it = ((ClassDef)modelElement).iteratorXorAssociation();
        while (it.hasNext()) {
            // add XOR-Constraint if AssociationDef is already drawn (when add XOR-node to diagram)
            Participant participant = (Participant)it.next(); //iteratorXorAssociation().next();
            if (findFigure(participant) == null) {
                LinkFigure edge = (LinkFigure)findFigure(participant.getAssociation().getAssociation());
                if (edge != null) {
                    // @see AssociationLineConnection#handleConnect()
                    PresentationAssocClass linkView = (PresentationAssocClass)edge.getNode();
                    NodeFigure nodeFigure = (NodeFigure)findFigure(modelElement);  
                    if (nodeFigure != null) {
                        // XOR-node exists too
                        PresentationRole xorRole = ElementFactory.createPresentationRole(this,  linkView.getAssociation(), nodeFigure.getNode(), participant);
                        loadPresentationRole(null, xorRole);
                    }
                }
            }
        }
    }
}
/**
 * Draw figure and save Element into Diagram.
 */
private Figure savePackageFigure(ModelElement modelElement, Figure figure)  {
	// create the PresentationElement
    ch.ehi.umleditor.umlpresentation.Package packageView = (ch.ehi.umleditor.umlpresentation.Package)ElementFactory.createObject(ch.ehi.umleditor.umlpresentation.Package.class);
    saveNode(packageView, modelElement, figure);

  	return figure;
}
/**
 * Set the presentationModel of this Diagram and draw contained Figures (PresentationElement's).
 * The whole diagram is displayed, where dependencies of elements is maintained
 * at drawing time (for e.g. an Association cannot be drawn until its nodes are shown).
 */
public void setDiagramElement(Element diagram) {
	this.diagram = (Diagram)diagram;
	loading = true;

	// 1) show Nodes (the first ones to see -> no visual dependencies yet)
	java.util.Iterator iterator = getDiagram().iteratorPresentationElement();
	ArrayList dependencies = new ArrayList();
	ch.ehi.basics.tools.TopoSort associations = new ch.ehi.basics.tools.TopoSort();
	ArrayList generalizations = new ArrayList();
	ArrayList noteAnchors = new ArrayList();
	while (iterator.hasNext()) {
		PresentationElement presentation = (PresentationElement)iterator.next();
		if (presentation instanceof ch.ehi.umleditor.umlpresentation.Class) {
			NodeFigure figure = loadNode((PresentationNode)presentation, new ClassFigure());
			figure.setCreating(false);
		} else if (presentation instanceof ch.ehi.umleditor.umlpresentation.Package) {
			NodeFigure figure = loadNode((PresentationNode)presentation, new PackageFigure());
			figure.setCreating(false);
		} else if (presentation instanceof ch.ehi.umleditor.umlpresentation.Note) {
			NodeFigure figure = loadNode((PresentationNode)presentation, new NoteFigure());
			figure.setCreating(false);
		} else if (presentation instanceof ch.ehi.umleditor.umlpresentation.Generalization) {
			// show in 3)
			generalizations.add(presentation);
		} else if (presentation instanceof ch.ehi.umleditor.umlpresentation.NoteEdge) {
			// show in 4)
			noteAnchors.add(presentation);			
		} else if (presentation instanceof ch.ehi.umleditor.umlpresentation.Dependency) {
			//	show in 2)
			dependencies.add(presentation);
		} else if (presentation instanceof ch.ehi.umleditor.umlpresentation.Association) {
			// show in 2) make sure inherited Assoc or atributed Assoc
			// will be shown after "plain" Assoc between two nodes

			//			add every edge at least once
    		associations.add(presentation);
    		
			Iterator presRoles = ((ch.ehi.umleditor.umlpresentation.Association)presentation).iteratorRolePresentation();
			if (presRoles.hasNext()) {
				PresentationRole role = (PresentationRole)presRoles.next();
				Iterator endPoints = role.iteratorEndpoint();
				if (endPoints.hasNext()) {
					// first role of no interest (own LinkNode)
					endPoints.next();
				}
				if (endPoints.hasNext()) {
					Object second = endPoints.next();
					if (second instanceof PresentationAssocClass) {
						// add condition "supplier(-edge) before edge"
						associations.addcond(((PresentationAssocClass)second).getAssociation(), presentation);
					}
				}
			}
		} else {
Tracer.getInstance().developerWarning("unknown Edge-Type");			//$NON-NLS-2$//$NON-NLS-1$
		}
	}

	// 2) connect Nodes by Edges (only Node dependent edges)
	iterator = dependencies.iterator();
	while (iterator.hasNext()) {
		PresentationEdge dependency = (PresentationEdge)iterator.next();
		loadSimpleEdge(new DependencyLineConnection(this, (PresentationEdge)dependency));
	}
	if(!associations.sort()) {
		throw new DeveloperException("TopoSort could not sort!");
	}
	iterator = associations.getResult().iterator();
	while (iterator.hasNext()) {
		ch.ehi.umleditor.umlpresentation.Association association = (ch.ehi.umleditor.umlpresentation.Association)iterator.next();
		loadAssociation(association);
	}

	// 3) show Generalizations after Associations (case: inherited Associations)
	iterator = generalizations.iterator();
	while (iterator.hasNext()) {
		PresentationEdge edge = (PresentationEdge)iterator.next();
/*		Iterator endpoints = edge.iteratorEndpoint();
		if (endpoints.hasNext()) {
			Object endpoint = endpoints.next();
			if (endpoint instanceof PresentationAssocClass) {
				// Generalizations between Associations are generated
				// @see LinkFigure#updateInheritance();
				continue;
			}
		}
*/
		loadSimpleEdge(new GeneralizationLineConnection(this, edge));
	}

	// 4) show NoteAnchors at last
	iterator = noteAnchors.iterator();
	while (iterator.hasNext()) {
		loadSimpleEdge(new NoteAnchorLineConnection(this, (PresentationEdge)iterator.next()));
	}
	
	loading = false;
}
/**
 * Show/hide all Association names in Diagram.
 */
protected void showAllAssociationNames(boolean visible) {
	showAssociationNames = visible;
	
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof LinkFigure) {
			((PresentationAssocClass)((LinkFigure)figure).getNode()).getAssociation().setShowName(visible);
			((LinkFigure)figure).changed();
		}
	}
	checkDamage();
}
/**
 * Show/hide all Attribute-Multiplicities in Diagram.
 */
protected void showAllAttributeMultiplicity(boolean visible) {
	getDiagram().setShowAttributeMultiplicity(visible);
	updateAttributes();
}
/**
 * Show/hide all Attributes names in Diagram.
 * Settings are stored on each class separately.
 */
protected void showAllAttributes(boolean visible) {
	showAttributes = visible;
	
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof ClassFigure) {
			((PresentationAbstractClass)((ClassFigure)figure).getNode()).setSuppressAttributes(!visible);
		}
	}
}
/**
 * Show/hide all Attribute-Types in Diagram.
 */
protected void showAllAttributeTypes(boolean visible) {
	getDiagram().setShowAttributeType(visible);
	updateAttributes();
}
/**
 * Show/hide all LinkFigures of an Association.
 */
protected void showAllLinkFigures(boolean visible) {
	showLinkFigure = visible;
	
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof LinkFigure) {
			figure.changed();
		}
	}
	checkDamage();
}
/**
 * Show/hide all Operations in Diagram.
 * Settings are stored on each class separately.
 */
protected void showAllOperations(boolean visible) {
	showAttributes = visible;
	
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof ClassFigure) {
			((PresentationAbstractClass)((ClassFigure)figure).getNode()).setSuppressOperations(!visible);
		}
	}
}
/**
 * Show/hide all roles in Diagram.
 */
protected void showAllMultiplicities(boolean visible) {
	showMultiplicity = visible;
	
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof PresentationRoleFigure) {
			((PresentationRole)((PresentationRoleFigure)figure).getEdge()).setMultiplicityVisible(visible);
		}
	}
}
/**
 * Show/hide all roles in Diagram.
 */
protected void showAllRoles(boolean visible) {
	showRoles = visible;
	
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof PresentationRoleFigure) {
			((PresentationRole)((PresentationRoleFigure)figure).getEdge()).setNameVisible(visible);
		}
	}
}
/**
 * layout all visible rolenames in Diagram.
 */
protected void layoutAllVisibleRolenames() {
	
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof PresentationRoleFigure) {
			((PresentationRoleFigure)figure).layoutRolename();
		}
	}
}
/**
 * layout all visible multiplicities in Diagram.
 */
protected void layoutAllVisibleMultiplicities() {
	
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof PresentationRoleFigure) {
			((PresentationRoleFigure)figure).layoutMultiplicity();
		}
	}
}
/**
 * Draw AssociationComposite in case there are at least two nodes visible yet.
 * @param associationDef Relationship to be drawn
 * @param node (the already given Node of the Relationship)
 */
private void trySaveAssociation(ch.ehi.uml1_4.foundation.core.Association associationDef, PresentationNode node, AssociationEnd roleDef)  {
	Figure linkFigure = findFigure(associationDef);
	if (linkFigure == null) {
		// no composite yet
		List roles = AssociationLineConnection.getRoleClassifiers(associationDef);
		Map nodes = new HashMap();
		for (int i=0; i<roles.size(); i++) {
			// make sure Classifier's are to be found in Diagram as well
			Figure figure = findFigure((Classifier)((RoleDef)roles.get(i)).getParticipant());
			if (figure != null) {
				// make sure role matches to node
				nodes.put(new Integer(i), figure);
			}
		}
		if (nodes.size() > 1) {
			// at least one other node was found => show given Association
			ch.ehi.umleditor.umlpresentation.Association associationComposite = ElementFactory.createAssociationComposite(associationDef, isShowAssociationNames());
			Iterator iterator = nodes.keySet().iterator();
			while (iterator.hasNext()) {
				Integer i = (Integer)iterator.next();
				Figure classifierFigure = (NodeFigure)nodes.get(i);
				// create PresentationRole
				ElementFactory.createPresentationRole(this, associationComposite, ((NodeFigure)classifierFigure).getNode(), (RoleDef)roles.get(i.intValue()));
			}
		  	add(associationComposite);
		}
	} else {
		// composite already given => only add role to given Node
		if (findFigure(roleDef) == null) {
			ch.ehi.umleditor.umlpresentation.Association associationComposite = ((PresentationAssocClass)((LinkFigure)linkFigure).getNode()).getAssociation();
			PresentationRole edgeRole = ElementFactory.createPresentationRole(this, associationComposite, node, roleDef);
			loadPresentationRole(null, edgeRole);
		}	
	}
}
/**
 * The UML-Model changed for a certain Element.
 * @param event (contains latest changes)
 */
public void update(ch.ehi.uml1_4.changepropagation.MetaModelChange event) {
	Figure figure = null;

	if (event.getSource() instanceof Feature) {
		// special case -> no direct child-Element of Diagram
		// => AttributeDef and UmlOperation
		if (((Feature)event.getSource()).containsOwner()) {
			figure = findFigure(((Feature)event.getSource()).getOwner());
		} /*else if (event.getOperation().startsWith(MetaModelChange.OP__UNLINK)){
            // AttributeDef might have been deleted in NavTree
            //updateAttributes();
            refresh();
        }*/
	} else if ((event.getSource() instanceof RoleDef) && ((RoleDef)event.getSource()).containsAssociation()) {
		figure = findFigure((RoleDef)event.getSource());
/*	}
	else if (event.getSource() instanceof ch.ehi.umleditor.umlpresentation.WayPoint) {
	} else if (event.getSource() instanceof ch.ehi.umleditor.umlpresentation.Color)	{
	} else if (event.getSource() instanceof ch.ehi.umleditor.umlpresentation.Diagram) {
	} else if (event.getSource() instanceof ch.ehi.uml1_4.foundation.datatypes.Multiplicity) {
*/
	} else if (event.getSource() instanceof Element) {
		figure = findFigure((Element)event.getSource());
	}

	if (figure != null) {
		if (figure instanceof NodeFigure) {
			((NodeFigure)figure).updateView();
		} else /* edgeFigure */ {
			// for AssociationDef's: @see LinkFigure.updateView(), @see PresentationRoleFigure.updateView()
			if (event.getOperation().startsWith(MetaModelChange.OP_SET)) {
				if (figure instanceof PresentationRoleFigure) {
					((PresentationRoleFigure)figure).updateView();
				}
			} else if (event.getOperation().startsWith(MetaModelChange.OP_CHANGE)) {
//Tracer.getInstance().debug("Check diagram for Relocation=" +getDiagram().getName().getValue() + ", Event=" + event.toString() + ", type=" + event.getOperation());
				if ((figure instanceof PresentationRoleFigure) && event.getOperation().equals("changeParticipant")) {
					PresentationRoleFigure roleFigure = (PresentationRoleFigure)figure;
					PresentationRole role = (PresentationRole)roleFigure.getEdge();
					if (correctRoleRelocation(role)) {
						// correctRoleRelocation(..) guarantees for given Iterator-Elements!
						Iterator endpoints = role.iteratorEndpoint();
						endpoints.next(); // skip PresentationAssocClass (LinkNode)
						ch.ehi.umleditor.umlpresentation.Class presentationClass = (ch.ehi.umleditor.umlpresentation.Class)endpoints.next();
						Iterator subjects = presentationClass.iteratorSubject();
						Connector end = findNodeConnector((Element)subjects.next(), 0, 0);
						if (end == null) {
							Tracer.getInstance().developerWarning("AUTO-CORRECTION: Removing PresentationRole from Diagram");
							getDiagram().deletePresentationElement(role);
						} else {
							roleFigure.setEndConnector(end);
						}
					}
				} else if (figure instanceof DependencyLineConnection) {
					if (correctDependencyRelocation((DependencyLineConnection)figure)) {
						((EdgeFigure)figure).updateView();
					}
				} else if (figure instanceof GeneralizationLineConnection) {
					if (correctGeneralizationRelocation((GeneralizationLineConnection)figure)) {
						((EdgeFigure)figure).updateView();
					} 
				}
			}
		}
	} // else no figure found to update
}
/**
 * Update all Attributes in Diagram.
 */
private void updateAttributes() {
	FigureEnumeration enumeration = drawing().figures();
	while (enumeration.hasMoreElements()) {
		Figure figure = enumeration.nextFigure();
		if (figure instanceof ClassFigure) {
			((ClassFigure)figure).updateView();
		}
	}
}
}
