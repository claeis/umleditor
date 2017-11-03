package ch.ehi.umleditor.umldrawingtools;
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
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
import javax.swing.*;
import java.awt.*;
import java.util.*;

import CH.ifa.draw.framework.*;
import CH.ifa.draw.contrib.*;
import ch.ehi.interlis.modeltopicclass.ClassExtends;
import ch.ehi.uml1_4.foundation.core.Element;
import ch.ehi.umleditor.umlpresentation.*;
import ch.softenvironment.util.*;
import ch.softenvironment.view.CommonUserAccess;
<<<<<<< HEAD
/**
 * Draws a PresentationAssocClass of an Association.
 * An association is presented as a Composite of one LinkNode/Figure
 * and 2..* PresentationRoles. Therefore this Figure is an
 * "artificial" Node to represent an AssociationDef.
 * 
 * @author Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.9 $ $Date: 2007-03-06 16:14:00 $
 */
class LinkFigure extends NodeFigure {
=======

/**
 * Draws a PresentationAssocClass of an Association. An association is presented
 * as a Composite of one LinkNode/Figure and 2..* PresentationRoles. Therefore
 * this Figure is an "artificial" Node to represent an AssociationDef.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.9 $ $Date: 2007-03-06 16:14:00 $
 */
class LinkFigure extends NodeFigure {
	
	private static final long serialVersionUID = -5684800811843022269L;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	// shape dimensions (should be dividable by 2)
	public final static int SIZE_MIN = 6;
	public final static int SIZE_MAX = 12;
	private final static int OFFSET_EAST_ATTRIBUTEFIGURE_TO_LINKFIGURE = -30;
	private final static int OFFSET_SOUTH_ATTRIBUTEFIGURE_TO_LINKFIGURE = 80;
	private final static int OFFSET_SOUTH_ASSOCIATIONNAME_TO_LINKFIGURE = 20;

	private AssociationAttributeFigure attributeFigure = null;
	private RoleDefFigure nameFigure = null;
	private boolean showAttributeFigureTemporarily = false;
	private boolean updatingChild = false;

<<<<<<< HEAD
/**
 * Create a new instance of LinkFigure with suppressed Diamond.
 */
public LinkFigure() {
	this(new DiamondFigure(new Point(0, 0), new Point(0, 0)));
//NYI!  connectorVisibility(true);
}
/**
 * Create a new instance of ClassFigure with a given presentation figure
 *
 * @param newPresentationFigure presentation figure
 */
private LinkFigure(Figure newPresentationFigure) {
	super(newPresentationFigure);
}
/**
 * Overwrites.
 * No PopupMenu here.
 */
protected final JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	return null;
}
/**
 * The Link may vary in its shape:
 * - Binary Association => invisible
 * - All other 			=> Diamond
 */
public void draw(Graphics g) {
//	g.setColor(getLineColor());

//TODO rotate Diamond according to angle of its association
    
	// Draw Link-Shape
	Rectangle r = displayBox();
	int deltaX = getNode().getEast() - r.x;
	int deltaY = getNode().getSouth() - r.y;
	if ((deltaX != 0) || (deltaY != 0)) {
		moveBy(deltaX, deltaY);
	}

 	if (nameFigure == null) {
//		Figure figure = getClassDiagram().findFigure(getEndElement());
		if (((PresentationAssocClass)getNode()).getAssociation().isShowName()) {
		 	// show AssociationName
	 		nameFigure = new RoleDefFigure(this);
	 		java.awt.Point p = new Point(getNode().getEast(), getNode().getSouth() + OFFSET_SOUTH_ASSOCIATIONNAME_TO_LINKFIGURE);
			nameFigure.displayBox(p, p);
			getClassDiagram().add(nameFigure);
			nameFigure.draw(g);
			nameFigure.setCreating(false);
	 	}
	} else if (!((PresentationAssocClass)getNode()).getAssociation().isShowName()) {
		removeLabels();
	} else if ((deltaX != 0) ||  (deltaY != 0)) {
		// move existing AssociationName-Figure relative to LinkFigure
		nameFigure.moveBy(deltaX, deltaY);
	}

//		getPresentationFigure().setAttribute(JHotDrawConstants.FRAME_COLOR, getLineColor());
	int figureSize = getDiamondSize();
	getPresentationFigure().displayBox(new Rectangle(getNode().getEast(), getNode().getSouth(), figureSize, figureSize));

    /* show XOR connector
    if (isXOR()) {
        g.setColor(Color.red);
        g.fillOval(r.x - (SIZE_MAX / 2 + 3), r.y, 3, 16);
    }*/
    
	super.draw(g);
}
/**
 * Overwrites.
 */
public void figureRemoved(FigureChangeEvent e) {
	removeLabels();
	super.figureRemoved(e);
}
/**
 * @return current Dimension of Diamond.
 */
protected int getDiamondSize() {
	int figureSize = 0;
	if (isN_Ary()) {
		figureSize = SIZE_MAX;
	} else if (getClassDiagram().isShowLinkFigure()) {
		figureSize = SIZE_MIN;
	}
//NYI! in JHotDraw 53 => connectorVisibility(figureSize > 0);
	return figureSize;
}
/**
 * Overwrites.
 * No handles at all.
 */
public Vector handles() {
    if (handles == null) {
        handles = new Vector(0);
    }
    return handles;
}
/**
 * Determine if this Node must present a Diamond or not.
 */
private boolean isN_Ary() {
	if (((PresentationAssocClass)getNode()).containsAssociation()) {
		Iterator roles = ((PresentationAssocClass)getNode()).getAssociation().iteratorRolePresentation();
		int count = 0;
		while (roles.hasNext()) {
			roles.next(); // skip
			if (++count > 2) return true;
		}
	}

	return false;
}
/**
 * Remove AssociationAttributeFigure if any.
 */
private void removeFeatures() {
	if (attributeFigure != null) {
//		showAttributeFigure = false;
        attributeFigure.removeAll();
		getClassDiagram().remove(attributeFigure);
		attributeFigure = null;
        ((PresentationAssocClass)getNode()).setClassAngle(0.0);
        ((PresentationAssocClass)getNode()).setClassRadius(0.0);
	}
}
/**
 * Remove visual components ONLY in Diagram:
 * @see ClassDiagramView.remove(Figure)
 */
protected void removeLabels() {
	if (nameFigure != null) {
		((PresentationAssocClass)getNode()).getAssociation().setShowName(false);
		getClassDiagram().remove(nameFigure);
		nameFigure = null;
/*		if (getNode() != null) {
			((PresentationAssocClass)getNode()).setNameAngle(0.0);
			((PresentationAssocClass)getNode()).setNameRadius(0.0);
		}
*/
	}
}
/**
 * Overwrites.
 */
public void removeVisually() {
	try {
		if (!isCreating()) {
			// 1) remove add-on's
			removeLabels();
			
			// 2) remove edges resp. PresentationRoles
			PresentationAssocClass linkNode = (PresentationAssocClass)getNode();
			Iterator edges = linkNode.iteratorPresentationEdge();
			// 2.1) remove edges drawings' from diagram
			while (edges.hasNext()) {
				Element edge = (Element)edges.next();
				if (edge instanceof PresentationRole) {
					PresentationRole role = (PresentationRole)edge;
					PresentationRoleFigure presentationRoleFigure = (PresentationRoleFigure)getClassDiagram().findFigure(role);
					if (presentationRoleFigure != null) {
						presentationRoleFigure.removeLabels();
						getClassDiagram().remove(presentationRoleFigure);
					}
				} else {
					Figure figure = getClassDiagram().findFigure(edge);
					if (figure != null) {
						getClassDiagram().remove(figure);
					}
				}
			}
			// 2.2 remove all edges in Composite
			if (linkNode.iteratorPresentationEdge().hasNext()) {
				// suppress recursive Change-Event
				linkNode.clearPresentationEdge();
			}
			
			// 3) remove LinkNode
			// 3.1) remove associated Attributes
			removeFeatures();

			// 3.2) remove LinkFigure from diagram
			getClassDiagram().remove(this);

			// 3.3) remove Composite (NOT LinkNode!) from diagram
			if (linkNode.containsAssociation() && getClassDiagram().getDiagram().containsPresentationElement(linkNode.getAssociation())) {
				getClassDiagram().getDiagram().removePresentationElement(linkNode.getAssociation());
			}
		}
	} catch(ConcurrentModificationException cme) {
		Tracer.getInstance().runtimeWarning("Event-Mechanism caused redundant Ping-Pong-remove: " + cme.getLocalizedMessage());
	} catch(Throwable e) {
		handleException(e, CommonUserAccess.getMniEditRemoveText(), null, this);
	}
}
/**
 * Force AttributeFigure to be drawn.
 * AttributeFigure's are necessary in case of:
 * - generalized Associations
 * - Association to another Association (not n-ary)
 * - Associations with Attributes(Features)
 * @see #updateFeatures(..)
 */
protected AssociationAttributeFigure showAttributeFigure(Element startEndElement, Element modelElement) {
//TODO nasty HACK
showAttributeFigureTemporarily = true;
	updateAttributeFigure((ch.ehi.uml1_4.foundation.core.Association)startEndElement, true);
	return attributeFigure;	
}
/**
 * Update Attributes of AssociationDef visually.
 * Show/Hide AssociationAttributeFigure according to existing features
 * or if inherited Association.
 */
private void updateFeatures(ch.ehi.uml1_4.foundation.core.Association associationDef, boolean linkNodeVisible) {
	Iterator features = ((ch.ehi.interlis.modeltopicclass.AbstractClassDef)associationDef).iteratorFeature();
	PresentationAssocClass linkNode = (PresentationAssocClass)getNode();
	if (features.hasNext() || showAttributeFigureTemporarily) {
		if (attributeFigure == null) {
			// show AttributeFigure automatically
			attributeFigure = new AssociationAttributeFigure(this, getClassDiagram(), linkNodeVisible);
            if (linkNode.getClassAngle() == 0.0) {
                linkNode.setClassAngle(getNode().getEast() + OFFSET_EAST_ATTRIBUTEFIGURE_TO_LINKFIGURE);
            }
            if (linkNode.getClassRadius() == 0.0) {
                linkNode.setClassRadius(getNode().getSouth() + OFFSET_SOUTH_ATTRIBUTEFIGURE_TO_LINKFIGURE);
            }
			getClassDiagram().add(attributeFigure);
		}
		attributeFigure.updateView();
	} else if ((attributeFigure != null) && (!showAttributeFigureTemporarily)) {
		removeFeatures();
	}
}
/**
 * Show GeneralizationLineConnection in case not yet displayed by Diagram.
 */
private void updateInheritance(ch.ehi.uml1_4.foundation.core.Association associationDef) {
	// if child gets  visible-> check for existing parents and create visual Generalization to it
	Iterator iterator = associationDef.iteratorGeneralization();
    showAttributeFigureTemporarily = (iterator.hasNext() || associationDef.iteratorSpecialization().hasNext());
	if ((!getClassDiagram().isLoading()) && (!updatingChild) && iterator.hasNext()) {
		Element extension = (Element)iterator.next();
		if ((extension instanceof ClassExtends) &&((ClassExtends)extension).containsParent()) {
			Element parentAssociationDef = ((ClassExtends)extension).getParent();
			if (parentAssociationDef instanceof ch.ehi.uml1_4.foundation.core.Association) {
				// draw the Generalization
				LinkFigure parentAssocFigure = (LinkFigure)getClassDiagram().findFigure(parentAssociationDef);
				if (parentAssocFigure != null) {
					Figure generalizationFigure = getClassDiagram().findFigure(extension);
					if (generalizationFigure == null) {
						updatingChild = true;
//Tracer.getInstance().debug(this, "updateInheritance()", "drawing CHILD->parent in " + toString());
						generalizationFigure = new GeneralizationLineConnection(getClassDiagram(), this, parentAssocFigure, (ClassExtends)extension);
						getClassDiagram().loadSimpleEdge((EdgeFigure)generalizationFigure);
						updatingChild = false;
=======
	/**
	 * Create a new instance of LinkFigure with suppressed Diamond.
	 */
	public LinkFigure() {
		this(new DiamondFigure(new Point(0, 0), new Point(0, 0)));
		// NYI! connectorVisibility(true);
	}

	/**
	 * Create a new instance of ClassFigure with a given presentation figure
	 *
	 * @param newPresentationFigure
	 *            presentation figure
	 */
	private LinkFigure(Figure newPresentationFigure) {
		super(newPresentationFigure);
	}

	/**
	 * Overwrites. No PopupMenu here.
	 */
	protected final JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
		return null;
	}

	/**
	 * The Link may vary in its shape: - Binary Association => invisible - All
	 * other => Diamond
	 */
	public void draw(Graphics g) {
		// g.setColor(getLineColor());

		// TODO rotate Diamond according to angle of its association

		// Draw Link-Shape
		Rectangle r = displayBox();
		int deltaX = getNode().getEast() - r.x;
		int deltaY = getNode().getSouth() - r.y;
		if ((deltaX != 0) || (deltaY != 0)) {
			moveBy(deltaX, deltaY);
		}

		if (nameFigure == null) {
			// Figure figure = getClassDiagram().findFigure(getEndElement());
			if (((PresentationAssocClass) getNode()).getAssociation().isShowName()) {
				// show AssociationName
				nameFigure = new RoleDefFigure(this);
				java.awt.Point p = new Point(getNode().getEast(),
						getNode().getSouth() + OFFSET_SOUTH_ASSOCIATIONNAME_TO_LINKFIGURE);
				nameFigure.displayBox(p, p);
				getClassDiagram().add(nameFigure);
				nameFigure.draw(g);
				nameFigure.setCreating(false);
			}
		} else if (!((PresentationAssocClass) getNode()).getAssociation().isShowName()) {
			removeLabels();
		} else if ((deltaX != 0) || (deltaY != 0)) {
			// move existing AssociationName-Figure relative to LinkFigure
			nameFigure.moveBy(deltaX, deltaY);
		}

		// getPresentationFigure().setAttribute(JHotDrawConstants.FRAME_COLOR,
		// getLineColor());
		int figureSize = getDiamondSize();
		getPresentationFigure()
				.displayBox(new Rectangle(getNode().getEast(), getNode().getSouth(), figureSize, figureSize));

		/*
		 * show XOR connector if (isXOR()) { g.setColor(Color.red);
		 * g.fillOval(r.x - (SIZE_MAX / 2 + 3), r.y, 3, 16); }
		 */

		super.draw(g);
	}

	/**
	 * Overwrites.
	 */
	public void figureRemoved(FigureChangeEvent e) {
		removeLabels();
		super.figureRemoved(e);
	}

	/**
	 * @return current Dimension of Diamond.
	 */
	protected int getDiamondSize() {
		int figureSize = 0;
		if (isN_Ary()) {
			figureSize = SIZE_MAX;
		} else if (getClassDiagram().isShowLinkFigure()) {
			figureSize = SIZE_MIN;
		}
		// NYI! in JHotDraw 53 => connectorVisibility(figureSize > 0);
		return figureSize;
	}

	/**
	 * Overwrites. No handles at all.
	 */
	public Vector handles() {
		if (handles == null) {
			handles = new Vector(0);
		}
		return handles;
	}

	/**
	 * Determine if this Node must present a Diamond or not.
	 */
	private boolean isN_Ary() {
		if (((PresentationAssocClass) getNode()).containsAssociation()) {
			Iterator roles = ((PresentationAssocClass) getNode()).getAssociation().iteratorRolePresentation();
			int count = 0;
			while (roles.hasNext()) {
				roles.next(); // skip
				if (++count > 2)
					return true;
			}
		}

		return false;
	}

	/**
	 * Remove AssociationAttributeFigure if any.
	 */
	private void removeFeatures() {
		if (attributeFigure != null) {
			// showAttributeFigure = false;
			attributeFigure.removeAll();
			getClassDiagram().remove(attributeFigure);
			attributeFigure = null;
			((PresentationAssocClass) getNode()).setClassAngle(0.0);
			((PresentationAssocClass) getNode()).setClassRadius(0.0);
		}
	}

	/**
	 * Remove visual components ONLY in Diagram:
	 * 
	 * @see ClassDiagramView.remove(Figure)
	 */
	protected void removeLabels() {
		if (nameFigure != null) {
			((PresentationAssocClass) getNode()).getAssociation().setShowName(false);
			getClassDiagram().remove(nameFigure);
			nameFigure = null;
			/*
			 * if (getNode() != null) {
			 * ((PresentationAssocClass)getNode()).setNameAngle(0.0);
			 * ((PresentationAssocClass)getNode()).setNameRadius(0.0); }
			 */
		}
	}

	/**
	 * Overwrites.
	 */
	public void removeVisually() {
		try {
			if (!isCreating()) {
				// 1) remove add-on's
				removeLabels();

				// 2) remove edges resp. PresentationRoles
				PresentationAssocClass linkNode = (PresentationAssocClass) getNode();
				Iterator edges = linkNode.iteratorPresentationEdge();
				// 2.1) remove edges drawings' from diagram
				while (edges.hasNext()) {
					Element edge = (Element) edges.next();
					if (edge instanceof PresentationRole) {
						PresentationRole role = (PresentationRole) edge;
						PresentationRoleFigure presentationRoleFigure = (PresentationRoleFigure) getClassDiagram()
								.findFigure(role);
						if (presentationRoleFigure != null) {
							presentationRoleFigure.removeLabels();
							getClassDiagram().remove(presentationRoleFigure);
						}
					} else {
						Figure figure = getClassDiagram().findFigure(edge);
						if (figure != null) {
							getClassDiagram().remove(figure);
						}
					}
				}
				// 2.2 remove all edges in Composite
				if (linkNode.iteratorPresentationEdge().hasNext()) {
					// suppress recursive Change-Event
					linkNode.clearPresentationEdge();
				}

				// 3) remove LinkNode
				// 3.1) remove associated Attributes
				removeFeatures();

				// 3.2) remove LinkFigure from diagram
				getClassDiagram().remove(this);

				// 3.3) remove Composite (NOT LinkNode!) from diagram
				if (linkNode.containsAssociation()
						&& getClassDiagram().getDiagram().containsPresentationElement(linkNode.getAssociation())) {
					getClassDiagram().getDiagram().removePresentationElement(linkNode.getAssociation());
				}
			}
		} catch (ConcurrentModificationException cme) {
			Tracer.getInstance()
					.runtimeWarning("Event-Mechanism caused redundant Ping-Pong-remove: " + cme.getLocalizedMessage());
		} catch (Throwable e) {
			handleException(e, CommonUserAccess.getMniEditRemoveText(), null, this);
		}
	}

	/**
	 * Force AttributeFigure to be drawn. AttributeFigure's are necessary in
	 * case of: - generalized Associations - Association to another Association
	 * (not n-ary) - Associations with Attributes(Features)
	 * 
	 * @see #updateFeatures(..)
	 */
	protected AssociationAttributeFigure showAttributeFigure(Element startEndElement, Element modelElement) {
		// TODO nasty HACK
		showAttributeFigureTemporarily = true;
		updateAttributeFigure((ch.ehi.uml1_4.foundation.core.Association) startEndElement, true);
		return attributeFigure;
	}

	/**
	 * Update Attributes of AssociationDef visually. Show/Hide
	 * AssociationAttributeFigure according to existing features or if inherited
	 * Association.
	 */
	private void updateFeatures(ch.ehi.uml1_4.foundation.core.Association associationDef, boolean linkNodeVisible) {
		Iterator features = ((ch.ehi.interlis.modeltopicclass.AbstractClassDef) associationDef).iteratorFeature();
		PresentationAssocClass linkNode = (PresentationAssocClass) getNode();
		if (features.hasNext() || showAttributeFigureTemporarily) {
			if (attributeFigure == null) {
				// show AttributeFigure automatically
				attributeFigure = new AssociationAttributeFigure(this, getClassDiagram(), linkNodeVisible);
				if (linkNode.getClassAngle() == 0.0) {
					linkNode.setClassAngle(getNode().getEast() + OFFSET_EAST_ATTRIBUTEFIGURE_TO_LINKFIGURE);
				}
				if (linkNode.getClassRadius() == 0.0) {
					linkNode.setClassRadius(getNode().getSouth() + OFFSET_SOUTH_ATTRIBUTEFIGURE_TO_LINKFIGURE);
				}
				getClassDiagram().add(attributeFigure);
			}
			attributeFigure.updateView();
		} else if ((attributeFigure != null) && (!showAttributeFigureTemporarily)) {
			removeFeatures();
		}
	}

	/**
	 * Show GeneralizationLineConnection in case not yet displayed by Diagram.
	 */
	private void updateInheritance(ch.ehi.uml1_4.foundation.core.Association associationDef) {
		// if child gets visible-> check for existing parents and create visual
		// Generalization to it
		Iterator iterator = associationDef.iteratorGeneralization();
		showAttributeFigureTemporarily = (iterator.hasNext() || associationDef.iteratorSpecialization().hasNext());
		if ((!getClassDiagram().isLoading()) && (!updatingChild) && iterator.hasNext()) {
			Element extension = (Element) iterator.next();
			if ((extension instanceof ClassExtends) && ((ClassExtends) extension).containsParent()) {
				Element parentAssociationDef = ((ClassExtends) extension).getParent();
				if (parentAssociationDef instanceof ch.ehi.uml1_4.foundation.core.Association) {
					// draw the Generalization
					LinkFigure parentAssocFigure = (LinkFigure) getClassDiagram().findFigure(parentAssociationDef);
					if (parentAssocFigure != null) {
						Figure generalizationFigure = getClassDiagram().findFigure(extension);
						if (generalizationFigure == null) {
							updatingChild = true;
							// Tracer.getInstance().debug(this,
							// "updateInheritance()", "drawing CHILD->parent in
							// " + toString());
							generalizationFigure = new GeneralizationLineConnection(getClassDiagram(), this,
									parentAssocFigure, (ClassExtends) extension);
							getClassDiagram().loadSimpleEdge((EdgeFigure) generalizationFigure);
							updatingChild = false;
						}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
					}
				}
			}
		}
<<<<<<< HEAD
	}

	// if parent gets visible -> check for existing children and create visual Generalization to it
	iterator = associationDef.iteratorSpecialization();
	if (iterator.hasNext()) {
		Element extension = (Element)iterator.next();
		if ((extension instanceof ClassExtends) &&((ClassExtends)extension).containsChild()) {
			Element childAssociationDef = ((ClassExtends)extension).getChild();
			if (childAssociationDef instanceof ch.ehi.uml1_4.foundation.core.Association) {
				Figure childAssocFigure = getClassDiagram().findFigure(childAssociationDef);
				if (childAssocFigure != null) {
					((LinkFigure)childAssocFigure).updateInheritance((ch.ehi.uml1_4.foundation.core.Association)childAssociationDef);
=======

		// if parent gets visible -> check for existing children and create
		// visual Generalization to it
		iterator = associationDef.iteratorSpecialization();
		if (iterator.hasNext()) {
			Element extension = (Element) iterator.next();
			if ((extension instanceof ClassExtends) && ((ClassExtends) extension).containsChild()) {
				Element childAssociationDef = ((ClassExtends) extension).getChild();
				if (childAssociationDef instanceof ch.ehi.uml1_4.foundation.core.Association) {
					Figure childAssocFigure = getClassDiagram().findFigure(childAssociationDef);
					if (childAssocFigure != null) {
						((LinkFigure) childAssocFigure)
								.updateInheritance((ch.ehi.uml1_4.foundation.core.Association) childAssociationDef);
					}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
				}
			}
		}
	}
<<<<<<< HEAD
}
/**
 * Refresh Label-Figures:
 */
protected void updateLabels() {
	if (nameFigure != null) {
		nameFigure.updateView();
	}
}
/**
 * Overwrites.
 *
 * Since the AssociationDef ModelElement is mapped to a LinkFigure,
 * the LinkFigure will also be found as the representing Figure in
 * Diagram.
 * The LinkFigure is also responsible for showing associated Attributes.
 * @see ClassDiagramView#findFigure(Element)
 */
public void updateView() {
	if (!isCreating()) {
		ch.ehi.uml1_4.foundation.core.Association associationDef = (ch.ehi.uml1_4.foundation.core.Association)getModelElement();
		
		if (associationDef != null) {
			if (!associationDef.containsNamespace()) {
				removeVisually();
				return;
			}
			
			// check if not at least presented by 2 RoleDef's
			java.util.Iterator iterator = AssociationLineConnection.getRoleClassifiers(associationDef).iterator();
			ch.ehi.interlis.associations.RoleDef roleDef = null;
			int count = 0;
			while (iterator.hasNext()) {
				roleDef = (ch.ehi.interlis.associations.RoleDef)iterator.next();
				if ((getClassDiagram().findFigure(roleDef.getParticipant()) != null) && // the node
						(getClassDiagram().findFigure(roleDef) != null) &&	// the edge
						(++count == 2)) {
					break;
				}
			}
			
			// if inherited associationDef -> show in any case
/*			Association parentAssociationDef = AssociationLineConnection.getParent(associationDef);
            if (parentAssociationDef != null) {  //showAttributeFigureTemporarily = parentAssociationDef != null;
			     showAttributeFigureTemporarily = true;
            }
*/
			if ((count == 2) || showAttributeFigureTemporarily) {
				// do the visual update
				updateAttributeFigure(associationDef, count == 2);
				
				return;
			}
			
			// remove in any other case
			removeVisually();
		}
	}
}
private void updateAttributeFigure(ch.ehi.uml1_4.foundation.core.Association associationDef, boolean linkNodeVisible) {
    updateLabels();
    updateFeatures(associationDef, linkNodeVisible);
//  boolean tmp = showAttributeFigureTemporarily;
    updateInheritance(associationDef); // -> might change showAttributeFigureTemporarily
/*  if (tmp && (!showAttributeFigureTemporarily)) {
        // do it again because AttrbuteFigure should be erased maybe
//        updateView();
    }
*/
}
=======

	/**
	 * Refresh Label-Figures:
	 */
	protected void updateLabels() {
		if (nameFigure != null) {
			nameFigure.updateView();
		}
	}

	/**
	 * Overwrites.
	 *
	 * Since the AssociationDef ModelElement is mapped to a LinkFigure, the
	 * LinkFigure will also be found as the representing Figure in Diagram. The
	 * LinkFigure is also responsible for showing associated Attributes.
	 * 
	 * @see ClassDiagramView#findFigure(Element)
	 */
	public void updateView() {
		if (!isCreating()) {
			ch.ehi.uml1_4.foundation.core.Association associationDef = (ch.ehi.uml1_4.foundation.core.Association) getModelElement();

			if (associationDef != null) {
				if (!associationDef.containsNamespace()) {
					removeVisually();
					return;
				}

				// check if not at least presented by 2 RoleDef's
				java.util.Iterator iterator = AssociationLineConnection.getRoleClassifiers(associationDef).iterator();
				ch.ehi.interlis.associations.RoleDef roleDef = null;
				int count = 0;
				while (iterator.hasNext()) {
					roleDef = (ch.ehi.interlis.associations.RoleDef) iterator.next();
					if ((getClassDiagram().findFigure(roleDef.getParticipant()) != null) && // the
																							// node
							(getClassDiagram().findFigure(roleDef) != null) && // the
																				// edge
							(++count == 2)) {
						break;
					}
				}

				// if inherited associationDef -> show in any case
				/*
				 * Association parentAssociationDef =
				 * AssociationLineConnection.getParent(associationDef); if
				 * (parentAssociationDef != null) {
				 * //showAttributeFigureTemporarily = parentAssociationDef !=
				 * null; showAttributeFigureTemporarily = true; }
				 */
				if ((count == 2) || showAttributeFigureTemporarily) {
					// do the visual update
					updateAttributeFigure(associationDef, count == 2);

					return;
				}

				// remove in any other case
				removeVisually();
			}
		}
	}

	private void updateAttributeFigure(ch.ehi.uml1_4.foundation.core.Association associationDef,
			boolean linkNodeVisible) {
		updateLabels();
		updateFeatures(associationDef, linkNodeVisible);
		// boolean tmp = showAttributeFigureTemporarily;
		updateInheritance(associationDef); // -> might change
											// showAttributeFigureTemporarily
		/*
		 * if (tmp && (!showAttributeFigureTemporarily)) { // do it again
		 * because AttrbuteFigure should be erased maybe // updateView(); }
		 */
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
