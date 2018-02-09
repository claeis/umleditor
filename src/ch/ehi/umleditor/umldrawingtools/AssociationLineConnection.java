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
import java.awt.*;
import java.util.*;
import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.interlis.associations.*;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.modeltopicclass.ClassExtends;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.umleditor.application.*;

import CH.ifa.draw.framework.*;

import ch.softenvironment.view.*;
import ch.softenvironment.util.*;

/**
 * An AssociationLineConnection is a Composite-Factory for
 * UML-Toolbar->Association. It serves ONLY to establish an
 * Association-Composite by visually drawing an UML-Association between two
 * Classifiers.
 *
 * A Composite consists of a LinkFigure and at least PresentationRoleFigure's.
 *
 * In comparison to Dependency's or Generalization's: - an Association is
 * managed graphically by a Composite instead of an Edge. - the
 * AssociationLineConnection is not added to a diagram itself.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.9 $ $Date: 2008-04-08 09:58:25 $
 * @see #handleConnect(Figure, Figure)
 */
public class AssociationLineConnection extends EdgeFigure {
	
	private static final long serialVersionUID = -5837730310516707453L;
	private boolean showDrawing = true;

	/**
	 * Create a new non-directed AssociationLineConnection. This Method will be
	 * used by UmlToolbar.
	 * 
	 * @see LauncherView#adaptTools()
	 */
	public AssociationLineConnection() {
		super();
	}

	/**
	 * Create an Association from given ClassFigure to ClassFigure itself.
	 * 
	 * @see ClassFigureSelectionTool
	 */
	public AssociationLineConnection(ClassFigure classFigure) {
		this();
		handleConnect(classFigure, classFigure);
	}

	/**
	 * Overwrites.
	 */
	protected final void addModelElement(ModelElement relationship) {
		throw new DeveloperException("done in handleException");// $NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Add individual PopupMenu items for this class.
	 * 
	 * @see NodeFigure
	 * @see createPopupMenu()
	 */
	protected final void addSpecialMenu(javax.swing.JPopupMenu popupMenu) {
	}

	/**
	 * Tests whether two figures can be connected.
	 * 
	 * @see handleConnect()
	 */
	public boolean canConnect(Figure start, Figure end) {
		// user may see what line is being drawn
		showDrawing = true;

		try {
			// only GeneralizableElement's are valid types
			GeneralizableElement participantFrom = getGeneralizableElement(start);
			GeneralizableElement participantTo = getGeneralizableElement(end);

			if ((start instanceof LinkFigure) && (end instanceof LinkFigure)) {
				/*
				 * (participantFrom instanceof
				 * ch.ehi.uml1_4.foundation.core.Association && (participantTo
				 * instanceof ch.ehi.uml1_4.foundation.core.Association))
				 */
				// better connect by AttributeFigures
				shouldWarn(NodeFigure.getResourceString(AssociationLineConnection.class, "CWInbetweenAssociations")); //$NON-NLS-1$
				return false;
			}

			if (!((participantFrom instanceof Classifier) && (participantTo instanceof Classifier))) {
				shouldWarn(NodeFigure.getResourceString(AssociationLineConnection.class, "CWNoClassifier")); //$NON-NLS-1$
				return false;
			}
		} catch (ClassCastException e) {
			shouldWarn(NodeFigure.getResourceString(AssociationLineConnection.class, "CWFigureNotGeneralizable")); //$NON-NLS-1$
			return false;
		}

		return true;
	}

	/**
	 * Overwrites.
	 *
	 * Show Mouse-connection while establishing Association. Then leave the
	 * drawing to Composite-Figure's.
	 */
	public final void draw(Graphics g) {
		if (showDrawing) {
			super.draw(g);
		}
	}

	/**
	 * Return the ending Element of the Relationship.
	 * 
	 * @return Element
	 */
	protected final ch.ehi.uml1_4.foundation.core.Element getEndElement() {
		throw new DeveloperException("@see handleConnect(..)");// $NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Return the Parent AssociationDef if any.
	 * 
	 * @param associationDef
	 *            potential child
	 * @return AssociationDef
	 */
	protected static ch.ehi.uml1_4.foundation.core.Association getParent(
			ch.ehi.uml1_4.foundation.core.Association childAssociationDef) {
		// check for inherited parent Roles
		Iterator iterator = childAssociationDef.iteratorGeneralization();
		if (iterator.hasNext()) {
			Object extension = iterator.next();
			if ((extension instanceof ClassExtends) && ((ClassExtends) extension).containsParent()) {
				Object parentAssociationDef = ((ClassExtends) extension).getParent();
				if (parentAssociationDef instanceof ch.ehi.uml1_4.foundation.core.Association) {
					return (ch.ehi.uml1_4.foundation.core.Association) parentAssociationDef;
				}
			}
		}
		return null;
	}

	/**
	 * Return the list of RoleDef's of the given Association containing a valid
	 * Classifier.
	 */
	protected static ArrayList getRoleClassifiers(ch.ehi.uml1_4.foundation.core.Association associationDef) {
		ArrayList roles = new ArrayList();

		Iterator iterator = associationDef.iteratorConnection();
		if (iterator.hasNext()) {
			while (iterator.hasNext()) {
				RoleDef roleDef = (RoleDef) iterator.next();
				if (roleDef.containsParticipant()) {
					roles.add(roleDef);
				}
			}
		}
		/*
		 * if (roles.size() == 0) { // check for inherited parent Roles
		 * ch.ehi.uml1_4.foundation.core.Association parentAssociationDef =
		 * getParent(associationDef); if (parentAssociationDef instanceof
		 * ch.ehi.uml1_4.foundation.core.Association) { roles =
		 * getRoles((ch.ehi.uml1_4.foundation.core.Association)
		 * parentAssociationDef); } }
		 */
		return roles;
	}

	/**
	 * Return the starting Element of the Relationship.
	 * 
	 * @return Element
	 */
	protected final ch.ehi.uml1_4.foundation.core.Element getStartElement() {
		throw new DeveloperException("@see handleConnect(..)");// $NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Create a new Association. By Default the association is not Navigable and
	 * of NONE AggregationKind.
	 *
	 * This method is called when a connection between two objects has been
	 * established.
	 * 
	 * @see canConnect(..)
	 */
	protected void handleConnect(Figure start, Figure end) {
		try {
			// drawing is done by appropriate figures itself
			showDrawing = false;

			setToolView();

			// create the core Model
			GeneralizableElement participantFrom = getGeneralizableElement(start);
			GeneralizableElement participantTo = getGeneralizableElement(end);

			if (((start instanceof LinkFigure)
					&& ((end instanceof ClassFigure) && (!(end instanceof AssociationAttributeFigure))))
					|| ((end instanceof LinkFigure)
							&& ((start instanceof ClassFigure) && (!(start instanceof AssociationAttributeFigure))))) {
				// if ((participantFrom instanceof
				// ch.ehi.uml1_4.foundation.core.Association) ||
				// (participantTo instanceof
				// ch.ehi.uml1_4.foundation.core.Association))

				// Composite and Link are already existing
				PresentationAssocClass linkView = null;
				ch.ehi.uml1_4.foundation.core.Association from = null;
				Classifier to = null;
				PresentationNode classifier = null;
				ClassFigure xorEnd2 = null;
				if (start instanceof LinkFigure) {
					// start is an Association
					linkView = (PresentationAssocClass) ((LinkFigure) start).getNode();
					from = (ch.ehi.uml1_4.foundation.core.Association) participantFrom;
					to = (Classifier) participantTo;
					xorEnd2 = (ClassFigure) end;
					classifier = xorEnd2.getNode();
				} else {
					// end is an Association
					linkView = (PresentationAssocClass) ((LinkFigure) end).getNode();
					from = (ch.ehi.uml1_4.foundation.core.Association) participantTo;
					to = (Classifier) participantFrom;
					xorEnd2 = (ClassFigure) start;
					classifier = xorEnd2.getNode();
				}

				LinkNodeDialog dialog = new LinkNodeDialog(
						LauncherView.getInstance() /* getClassDiagram() */, linkView.getAssociation(), classifier);
				dialog.setVisible(true);
				if (dialog.isSaved()) {
					if (dialog.isNAry()) {
						RoleDef roleDef = ElementFactory.createRoleDef(from, to);
						PresentationRole nAryRole = ElementFactory.createPresentationRole(getClassDiagram(),
								linkView.getAssociation(), classifier, roleDef);
						getClassDiagram().loadPresentationRole(null, nAryRole);
					} else { // XOR
								// 1) create the constraint
						Participant participant = ElementFactory.createParticipant(dialog.getXorParticipant(),
								(AbstractClassDef) to /*
														 * (AbstractClassDef)
														 * roleDef.
														 * getParticipant()
														 */);

						// 2) add role only for "cloned" drawing, shares same
						// roleDef (definition by INTERLIS)
						NodeFigure nodeFigure = (NodeFigure) getClassDiagram().findFigure((AbstractClassDef) to);
						PresentationRole xorRole = ElementFactory.createPresentationRole(getClassDiagram(),
								linkView.getAssociation(), nodeFigure.getNode(),
								participant /* dialog.getXorParticipant() */);
						getClassDiagram().loadPresentationRole(null, xorRole);
						/*
						 * //getClassDiagram().loadXorRole(participant);
						 * PresentationRoleFigure roleFigure =
						 * (PresentationRoleFigure)getClassDiagram().findFigure(
						 * dialog.getXorParticipant());
						 * //roleFigure.addXorRole(participant);
						 * roleFigure.updateView();
						 */
						/*
						 * // 2) create additional XOR Note
						 * ch.ehi.umleditor.umlpresentation.Note note =
						 * ElementFactory.createNote(); // RoleDef roleDef =
						 * participant.getAssociation(); //AbstractClassDef
						 * targetClass = participant.getParticipant();
						 * note.setContent(new NlsString("XOR")); //
						 * (" + dialog.getXorParticipant().getParticipant().getName().getValue() + "
						 * &
						 * " + roleDef.getParticipant().getName().getValue() + "
						 * )")); NoteFigure noteFigure = new NoteFigure();
						 * // @see ClassDiagramView#add(Figure)
						 * noteFigure.setClassDiagram(getClassDiagram());
						 * noteFigure.setNode(note); ClassFigure xorEnd1 =
						 * (ClassFigure)getClassDiagram().findFigure(dialog.
						 * getXorParticipant().getParticipant());
						 * noteFigure.basicMoveBy((xorEnd1.getNode().getEast() +
						 * xorEnd2.getNode().getEast()) /2,
						 * (xorEnd1.getNode().getSouth() +
						 * xorEnd2.getNode().getSouth()) /2);
						 * getClassDiagram().saveNodeInDiagram(note,
						 * noteFigure);
						 * 
						 * // 3) connect both note-edges with XOR-ends NoteEdge
						 * edge = new NoteEdge(); NoteAnchorLineConnection
						 * noteEdge = new
						 * NoteAnchorLineConnection(getClassDiagram(), edge);
						 * noteEdge.setEdge(edge, noteFigure, xorEnd1);
						 * getClassDiagram().getDiagram().addPresentationElement
						 * (edge); //noteEdge.getEdge()
						 * getClassDiagram().loadSimpleEdge(noteEdge); edge =
						 * new NoteEdge(); noteEdge = new
						 * NoteAnchorLineConnection(getClassDiagram(), edge);
						 * noteEdge.setEdge(edge, noteFigure, xorEnd2);
						 * //getClassDiagram().findFigure(classifier)
						 * getClassDiagram().getDiagram().addPresentationElement
						 * (edge); //noteEdge.getEdge()
						 * getClassDiagram().loadSimpleEdge(noteEdge);
						 */
					}
				}
			} else if (((start instanceof AssociationAttributeFigure) && (end instanceof ClassFigure))
					|| ((end instanceof AssociationAttributeFigure) && (end instanceof ClassFigure))
					|| ((end instanceof ClassFigure) && (end instanceof ClassFigure))) {

				// case: create complete Association
				ch.ehi.uml1_4.foundation.core.Association associationDef = ElementFactory
						.createAssociationDef(participantFrom, participantTo);
				ch.ehi.umleditor.umlpresentation.Association associationComposite = ElementFactory
						.createAssociationComposite(associationDef, getClassDiagram().isShowAssociationNames());

				// introduce an artificial Link
				// PresentationAssocClass linkView =
				// associationComposite.getLinkPresentation();

				// create the two PresentationRole's
				java.util.Iterator iteratorRole = associationDef.iteratorConnection();
				PresentationRole startRole = ElementFactory.createPresentationRole(getClassDiagram(),
						associationComposite, ((NodeFigure) start).getNode(), (RoleDef) iteratorRole.next());
				PresentationRole endRole = ElementFactory.createPresentationRole(getClassDiagram(),
						associationComposite, ((NodeFigure) end).getNode(), (RoleDef) iteratorRole.next());
				if (start.equals(end)) {
					// association to itself
					Rectangle rectangle = start.displayBox();
					Point below = new Point(start.center().x, rectangle.y + rectangle.height + 15);
					Point right = new Point(rectangle.x + rectangle.width + 15, start.center().y);
					startRole.addWayPoint(EdgeFigure.createWayPoint(below));
					endRole.addWayPoint(EdgeFigure.createWayPoint(new Point(right.x, below.y)));
					endRole.addWayPoint(EdgeFigure.createWayPoint(right));
					startRole.setNameAngle(below.x - 15);
					startRole.setNameRadius(rectangle.y + rectangle.height + 18);
					startRole.setMultiplicityAngle(below.x - 10);
					startRole.setMultiplicityRadius(rectangle.y + rectangle.height + 30);
					endRole.setNameAngle(rectangle.x + rectangle.width + 10);
					endRole.setNameRadius(right.y - 15);
					endRole.setMultiplicityAngle(rectangle.x + rectangle.width + 15);
					endRole.setMultiplicityRadius(right.y + 8);
				}

				// Composite is saved in Diagram instead of Edge
				getClassDiagram().add(associationComposite);
			}

			// stop drawing interaction to user
			getClassDiagram().remove(this);
		} catch (Throwable e) {
			BaseDialog.showError(LauncherView.getInstance(), CREATION_ERROR,
					NodeFigure.getResourceString(AssociationLineConnection.class, "CWAssociationNotEstablished"), e); // $NON-NLS-2$//$NON-NLS-1$
		}
	}

	/**
	 * Overwrites.
	 *
	 * This Figure is represented by a Composite, therefore drawing is delegated
	 * to the Composite Elements.
	 * 
	 * @see LinkFigure
	 * @see PresentationRoleFigure
	 */
	public final void removeVisually() {
	}

	/**
	 * Overwrites
	 */
	public final void setEdge(PresentationEdge edge, Figure start, Figure end) {
		throw new DeveloperException("@see handleConnect(..)");// $NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Overwrites.
	 */
	protected final void setModelElement(ModelElement modelElement) {
		throw new DeveloperException("only a Creator -> go for LinkFigure instead");// $NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Show Warning message because Relationship is illegal between current
	 * start and end Figure.
	 * 
	 * @see shouldWarn(EdgeFigure, String)
	 */
	protected void showIllegalRelationship(java.lang.String warning) {
		BaseDialog.showWarning((java.awt.Component) LauncherView.getInstance(),
				NodeFigure.getResourceString(AssociationLineConnection.class, "CWAssociationNotAllowed"), //$NON-NLS-1$
				warning);
	}

	/**
	 * Show the Specification Dialog of the PresentationElement.
	 */
	public final void showSpecification() {
		throw new DeveloperException("see PresentationRole instead");// $NON-NLS-2$//$NON-NLS-1$
	}

	/**
	 * Overwrites.
	 *
	 * This Figure is represented by a Composite, therefore drawing is delegated
	 * to the Composite Elements.
	 * 
	 * @see LinkFigure
	 * @see PresentationRoleFigure
	 */
	public final void updateView() {
	}
}
