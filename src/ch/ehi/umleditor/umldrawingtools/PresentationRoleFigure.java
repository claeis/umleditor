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
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.Iterator;

import CH.ifa.draw.framework.*;

import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.uml1_4.foundation.datatypes.*;
import ch.ehi.umleditor.application.*;
import ch.softenvironment.util.*;
import ch.softenvironment.view.CommonUserAccess;

/**
 * Displayable edge between ClassFigure and LinkFigure.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.13 $ $Date: 2008-04-08 09:58:25 $
 */
public class PresentationRoleFigure extends EdgeFigure implements java.awt.event.ActionListener {
	
	private static final long serialVersionUID = -774037525765738176L;
	// NLS Constants
	private static java.util.ResourceBundle resPresentationRoleFigure = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/umldrawingtools/resources/PresentationRoleFigure"); //$NON-NLS-1$
	public final static String AGGREGATION = resPresentationRoleFigure.getString("ChxAggregation_text"); //$NON-NLS-1$
	public final static String ASSOCIATION = resPresentationRoleFigure.getString("ChxAssociation_text"); //$NON-NLS-1$
	public final static String COMPOSITE = resPresentationRoleFigure.getString("ChxComposition_text"); //$NON-NLS-1$
	private final static String NAVIGABLE_LABEL = resPresentationRoleFigure.getString("ChxNavigation_text"); //$NON-NLS-1$
	private final static String AGGREGABLE_LABEL = resPresentationRoleFigure.getString("ChxAggregable_text"); //$NON-NLS-1$
	private final static String COMPOSITE_LABEL = resPresentationRoleFigure.getString("ChxComposite_text"); //$NON-NLS-1$
	// NON-NLS Constants
	private final static String NAVIGATION_END = "NAVIGATION_END_MENU"; //$NON-NLS-1$
	private final static String AGGREGATION_END = "AGGREGATION_END"; //$NON-NLS-1$
	private final static String COMPOSITE_END = "COMPOSITE_END"; //$NON-NLS-1$
	private final static String SHOW_ROLE = "SHOW_ROLE"; //$NON-NLS-1$
	private final static String SHOW_MULTIPLICITY = "SHOW_MULTIPLICITY"; //$NON-NLS-1$
	private final static String SHOW_ASSOCIATION_NAME = "SHOW_ASSOCIATION_NAME"; //$NON-NLS-1$

	private JCheckBoxMenuItem chxNavigableEnd = null;
	private JCheckBoxMenuItem chxAggregableEnd = null;
	private JCheckBoxMenuItem chxCompositeEnd = null;
	private JCheckBoxMenuItem chxShowRole = null;
	private JCheckBoxMenuItem chxShowMultiplicity = null;
	private JCheckBoxMenuItem chxShowAssociationName = null;

	private RoleDefFigure roleDefFigure = null;
	private RoleDefFigure multiplicityFigure = null;

	/**
	 * Create a new instance. Used at reopening of ClassDiagram's containing
	 * Dependencies.
	 * 
	 * @see ClassDiagramView.setDiagramElement(Element)
	 */
	public PresentationRoleFigure(ClassDiagramView classDiagram, PresentationRole edge) {
		super(classDiagram);

		this.edge = edge;
		setLineColor(determineForegroundColor(edge));

		// create popupMenu checkBoxes
		chxNavigableEnd = new JCheckBoxMenuItem(NAVIGABLE_LABEL);
		initalizeCheckBox(chxNavigableEnd, NAVIGATION_END);
		chxAggregableEnd = new JCheckBoxMenuItem(AGGREGABLE_LABEL);
		initalizeCheckBox(chxAggregableEnd, AGGREGATION_END);
		chxCompositeEnd = new JCheckBoxMenuItem(COMPOSITE_LABEL);
		initalizeCheckBox(chxCompositeEnd, COMPOSITE_END);

		chxShowRole = new JCheckBoxMenuItem(resPresentationRoleFigure.getString("ChxShowRoles_text")); //$NON-NLS-1$
		initalizeCheckBox(chxShowRole, SHOW_ROLE);
		chxShowMultiplicity = new JCheckBoxMenuItem(resPresentationRoleFigure.getString("ChxShowCardinality_text")); //$NON-NLS-1$
		initalizeCheckBox(chxShowMultiplicity, SHOW_MULTIPLICITY);
		chxShowAssociationName = new JCheckBoxMenuItem(
				resPresentationRoleFigure.getString("ChxShowAssociationName_text")); //$NON-NLS-1$
		initalizeCheckBox(chxShowAssociationName, SHOW_ASSOCIATION_NAME);

		setModelElement((ModelElement) edge.iteratorSubject().next()); // first
																		// is
																		// always
																		// the
																		// "main
																		// edge",
																		// further
																		// ones
																		// might
																		// be
																		// XOR-branches
	}

	/**
	 * Handler for ActionListener.
	 *
	 * Navigation => 0, 1 or both edges possible. Aggregation is XOR Composite
	 * and may be set only on one side of an association.
	 * 
	 * @see #addSpecialMenu()
	 */
	public void actionPerformed(java.awt.event.ActionEvent e) {
		if (e.getActionCommand().equals(NAVIGATION_END)) {
			setNavigableEnd(((JCheckBoxMenuItem) e.getSource()).getState());
		} else if (e.getActionCommand().equals(AGGREGATION_END)) {
			if (((JCheckBoxMenuItem) e.getSource()).getState()) {
				// setAggregationStart(AggregationKind.NONE); NYI: XOR
				setAggregationEnd(AggregationKind.AGGREGATE);
				chxCompositeEnd.setSelected(false);
			} else {
				setAggregationEnd(AggregationKind.NONE);
			}
		} else if (e.getActionCommand().equals(COMPOSITE_END)) {
			if (((JCheckBoxMenuItem) e.getSource()).getState()) {
				// setAggregationStart(AggregationKind.NONE); NYI: XOR
				setAggregationEnd(AggregationKind.COMPOSITE);
				;
				chxAggregableEnd.setSelected(false);
			} else {
				setAggregationEnd(AggregationKind.NONE);
			}
		} else if (e.getActionCommand().equals(SHOW_ROLE)) {
			((PresentationRole) getEdge()).setNameVisible(chxShowRole.isSelected());
		} else if (e.getActionCommand().equals(SHOW_MULTIPLICITY)) {
			((PresentationRole) getEdge()).setMultiplicityVisible(chxShowMultiplicity.isSelected());
		} else if (e.getActionCommand().equals(SHOW_ASSOCIATION_NAME)) {
			((PresentationRole) getEdge()).getAssociation().setShowName(chxShowAssociationName.isSelected());
		}
	}

	/**
	 * Overwrites.
	 */
	protected void addEditMenu(javax.swing.JPopupMenu popupMenu) {
		JMenu editMenu = new JMenu(CommonUserAccess.getMnuEditText());

		if (!isXorEdge()) {
			editMenu.add(new AbstractAction(CommonUserAccess.getMniEditRemoveText()) {
				public void actionPerformed(ActionEvent event) {
					removeVisually();
				}
			});
			editMenu.add(new JSeparator());
		}

		editMenu.add(new AbstractAction(REMOVE_IN_MODEL) {
			public void actionPerformed(ActionEvent event) {
				removeInModel();
			}
		});

		popupMenu.add(editMenu);
	}

	/**
	 * Add individual PopupMenu items for this class.
	 * 
	 * @see NodeFigure
	 * @see createPopupMenu()
	 */
	protected void addSpecialMenu(javax.swing.JPopupMenu popupMenu) {
		popupMenu.add(new JSeparator());

		popupMenu.add(chxNavigableEnd);
		popupMenu.add(chxAggregableEnd);
		popupMenu.add(chxCompositeEnd);

		popupMenu.add(new JSeparator());
		chxShowRole.setSelected(((PresentationRole) getEdge()).isNameVisible());
		popupMenu.add(chxShowRole);
		chxShowMultiplicity.setSelected(((PresentationRole) getEdge()).isMultiplicityVisible());
		popupMenu.add(chxShowMultiplicity);
		chxShowAssociationName.setSelected(isShowAssociationName());
		popupMenu.add(chxShowAssociationName);

		updateCheckBoxes();
	}

	/**
	 * Algorithm to determine initial Multiplicity Position.
	 * 
	 * @param nodeDisplayBox
	 *            (Dimensions of NodeFigure)
	 * @param connectionPoint
	 *            (Connector Location where edge runs into NodeFigure)
	 */
	private java.awt.Point calculateMultiplicityPosition(java.awt.Rectangle nodeDisplayBox,
			java.awt.Point connectionPoint) {
		java.awt.Point p = calculateRolePosition(nodeDisplayBox, connectionPoint);
		p.x = p.x + 20;
		p.y = p.y + 14;

		return p;
	}

	/**
	 * Algorithm to determine initial Role Position.
	 * 
	 * @param nodeDisplayBox
	 *            (Dimensions of NodeFigure)
	 * @param connectionPoint
	 *            (Connector Location where edge runs into NodeFigure)
	 */
	private java.awt.Point calculateRolePosition(java.awt.Rectangle nodeDisplayBox, java.awt.Point connectionPoint) {
		int x = connectionPoint.x;
		int y = connectionPoint.y;
		int nodeCenterX = (int) nodeDisplayBox.getCenterX();
		int nodeCenterY = (int) nodeDisplayBox.getCenterY();
		if (connectionPoint.x < nodeCenterX) {
			// edge is left of Node
			x = nodeDisplayBox.x - (nodeDisplayBox.x - connectionPoint.x) - 40;
		} else if (connectionPoint.x >= nodeCenterX) {
			// edge is right of Node
			x = nodeDisplayBox.x + nodeDisplayBox.width + 5;
		}
		if (connectionPoint.y < nodeCenterY) {
			// edge is above Node
			y = connectionPoint.y - 20;
		} else if (connectionPoint.y >= nodeCenterY) {
			// edge is below Node
			y = nodeDisplayBox.y + nodeDisplayBox.height + 15;
		}

		return new java.awt.Point(x, y);
	}

	/**
	 * Overwrites.
	 */
	public void draw(Graphics g) {
		try {
			super.draw(g);

			if (roleDefFigure == null) {
				if (getEndAssociationEnd() != null) {
					Figure figure = getClassDiagram().findFigure(getEndElement());
					if ((figure != null) && ((PresentationRole) getEdge()).isNameVisible()) {
						// show RoleDef
						PresentationRole role = (PresentationRole) getEdge();
						roleDefFigure = new RoleDefFigure(this, RoleDefFigure.ROLE_DEF);
						java.awt.Point p = null;
						if ((role.getNameAngle() > 0.0) && (role.getNameRadius() > 0.0)) {
							p = new java.awt.Point((int) role.getNameAngle(), (int) role.getNameRadius());
						} else {
							p = calculateRolePosition(figure.displayBox(), endPoint());
						}
						roleDefFigure.displayBox(p, p);
						getClassDiagram().add(roleDefFigure);
						roleDefFigure.draw(g);
						roleDefFigure.setCreating(false);
					}
				}
			} else if (!((PresentationRole) getEdge()).isNameVisible()) {
				removeRole();
			}

			if (multiplicityFigure == null) {
				if ((getEndAssociationEnd() != null) && (getEndAssociationEnd().getMultiplicity() != null)) {
					Figure figure = getClassDiagram().findFigure(getEndElement());
					if ((figure != null) && ((PresentationRole) getEdge()).isMultiplicityVisible()) {
						// show Multiplicity
						PresentationRole role = (PresentationRole) getEdge();
						multiplicityFigure = new RoleDefFigure(this, RoleDefFigure.CARDINALITY);
						java.awt.Point p = null;
						if ((role.getMultiplicityAngle() > 0.0) && (role.getMultiplicityRadius() > 0.0)) {
							p = new java.awt.Point((int) role.getMultiplicityAngle(),
									(int) role.getMultiplicityRadius());
						} else {
							p = calculateMultiplicityPosition(figure.displayBox(), endPoint());
						}
						multiplicityFigure.displayBox(p, p);
						getClassDiagram().add(multiplicityFigure);
						multiplicityFigure.draw(g);
						multiplicityFigure.setCreating(false);
					}
				}
			} else if ((getEndAssociationEnd() == null) || (getEndAssociationEnd().getMultiplicity() == null)
					|| (!((PresentationRole) getEdge()).isMultiplicityVisible())) {
				// automatic suppression of undefined Cardinality
				removeMultiplicity();
			}

			// Iterator iteratorXorParticipant =
			// ((RoleDef)getModelElement()).iteratorXorParticipant();
			// while (iteratorXorParticipant.hasNext()) {
			if (isXorEdge()) {
				// XOR-branch
				Participant participant = (Participant) getModelElement(); // iteratorXorParticipant.next();
				LinkFigure linkFigure = (LinkFigure) getClassDiagram()
						.findFigure(participant.getAssociation().getAssociation());
				ClassFigure xorStartNode = (ClassFigure) getClassDiagram()
						.findFigure(participant.getAssociation().getParticipant());
				ClassFigure xorEndNode = (ClassFigure) getClassDiagram().findFigure(participant.getParticipant());

				// AssociationEnd
				int xorStartEdgeX = xorStartNode.center().x;
				int xorStartEdgeY = xorStartNode.center().y;
				// XOR-Participant
				int xorEndEdgeX = xorEndNode.center().x;
				int xorEndEdgeY = xorEndNode.center().y;

				WayPoint startWayPoint = null;
				Figure roleDefFig = getClassDiagram().findFigure(participant.getAssociation());
				if (roleDefFig == null) {
					getClassDiagram().removeXorNote(participant.getAssociation());
					return;
				}

				java.util.Iterator iterator = ((PresentationRoleFigure) roleDefFig).getEdge().iteratorWayPoint();
				if (iterator.hasNext()) {
					startWayPoint = (WayPoint) iterator.next(); // take closest
																// to LinkNode
					xorStartEdgeX = startWayPoint.getEast();
					xorStartEdgeY = startWayPoint.getSouth();
				}

				WayPoint endWayPoint = null;
				iterator = getEdge().iteratorWayPoint();
				if (iterator.hasNext()) {
					endWayPoint = (WayPoint) iterator.next(); // take closest to
																// LinkNode
					xorEndEdgeX = endWayPoint.getEast();
					xorEndEdgeY = endWayPoint.getSouth();
				}

				// XOR-Note
				int noteX = (xorStartEdgeX + xorEndEdgeX) / 2;
				int noteY = (xorStartEdgeY + xorEndEdgeY) / 2 - 20;
				java.awt.Dimension dim = getClassDiagram().getXorNote(participant.getAssociation());
				if (dim == null) {
					getClassDiagram().addXorNote(participant.getAssociation(), new java.awt.Dimension(noteX, noteY));
				} else {
					noteX = dim.width;
					noteY = dim.height;
				}

				// add Text-offset
				noteX = noteX + 10;
				noteY = noteY - 5;
				// NoteAnchor: original PresentationRole-edge to XOR-Note
				if (startWayPoint == null) {
					NoteAnchorLineConnection.drawNoteLine(g,
							// "connect" in the middle between LinkNode and
							// xorEndNode
							(linkFigure.center().x + xorStartEdgeX) / 2, (linkFigure.center().y + xorStartEdgeY) / 2,
							noteX, noteY);
				} else {
					NoteAnchorLineConnection.drawNoteLine(g, xorStartEdgeX, xorStartEdgeY, noteX, noteY);
				}

				// NoteAnchor: pseudo XOR-edge to XOR-Note
				if (endWayPoint == null) {
					// "connect" in the middle between LinkNode and xorEndNode
					NoteAnchorLineConnection.drawNoteLine(g, (linkFigure.center().x + xorEndEdgeX) / 2,
							(linkFigure.center().y + xorEndEdgeY) / 2, noteX, noteY);
				} else {
					NoteAnchorLineConnection.drawNoteLine(g, endWayPoint.getEast(), endWayPoint.getSouth(), noteX,
							noteY);
				}

				// Overwrite line in text
				g.drawString("{XOR}", noteX - 10, noteY + 5);
			}
			// }
		} catch (Throwable e) {
			Tracer.getInstance().debug(e.getLocalizedMessage());
		}
	}

	public void layoutMultiplicity() {
		if (multiplicityFigure != null) {
			Figure figure = getClassDiagram().findFigure(getEndElement());
			java.awt.Point p = calculateMultiplicityPosition(figure.displayBox(), endPoint());
			// save new values to repository
			multiplicityFigure.updateCoordinates();
			// update view
			multiplicityFigure.displayBox(p, p);
		}
	}

	public void layoutRolename() {
		if (roleDefFigure != null) {
			Figure figure = getClassDiagram().findFigure(getEndElement());
			java.awt.Point p = calculateRolePosition(figure.displayBox(), endPoint());
			// save new values to repository
			roleDefFigure.updateCoordinates();
			// update view
			roleDefFigure.displayBox(p, p);
		}
	}

	/**
	 * Overwrites.
	 */
	public void figureRemoved(FigureChangeEvent e) {
		removeLabels();
		super.figureRemoved(e);
	}

	/**
	 * Return the RoleDef which this Figure is presenting.
	 * 
	 * @return AssociationEnd (RoleDef)
	 */
	protected AssociationEnd getEndAssociationEnd() {
		if (getModelElement() instanceof AssociationEnd) {
			return (AssociationEnd) getModelElement();
		} else if (getModelElement() instanceof Participant) {
			// must be XOR-Participant
			return (AssociationEnd) ((Participant) getModelElement()).getAssociation();
		} else {
			// probably not intitialized yet
			return null;
		}
	}

	/**
	 * Return the ending ModelElement of the Relationship which is either a
	 * ClassDef or a PresentationAssocLink.
	 * 
	 * @return Element
	 */
	protected Element getEndElement() {
		if (getModelElement() != null) {
			if (getModelElement() instanceof AssociationEnd) {
				if (((AssociationEnd) getModelElement()).containsParticipant()) {
					return ((AssociationEnd) getModelElement()).getParticipant();
				}
			} else if (getModelElement() instanceof Participant) {
				// XOR
				return ((Participant) getModelElement()).getParticipant();
			}
		}

		return null;
	}

	/**
	 * Return the starting ModelElement of the Relationship which is always an
	 * AssociationDef.
	 *
	 * @return Element
	 */
	protected Element getStartElement() {
		/*
		 * 
		 * if ((getModelElement() != null) &&
		 * (((AssociationEnd)getModelElement()).containsAssociation())) { return
		 * ((AssociationEnd)getModelElement()).getAssociation(); } else { return
		 * null; }
		 */
		if ((edge != null) && ((PresentationRole) edge).containsAssociation()) {
			Iterator iterator = ((PresentationRole) edge).getAssociation().iteratorSubject();
			if (iterator.hasNext()) {
				return (ch.ehi.uml1_4.foundation.core.Association) iterator.next();
			}
		}
		return null;
	}

	/**
	 * Setup dfault Checkbox for PopupMenu.
	 */
	private JCheckBoxMenuItem initalizeCheckBox(JCheckBoxMenuItem checkBox, String actionCommand) {
		checkBox.setActionCommand(actionCommand);
		checkBox.addActionListener(this);
		checkBox.setSelected(false);

		return checkBox;
	}

	/**
	 *
	 */
	private boolean isShowAssociationName() {
		return ((PresentationRole) getEdge()).getAssociation().isShowName();
	}

	private boolean isXorEdge() {
		return getModelElement() instanceof Participant;
	}

	/**
	 * Move the RoleDef and Cardinality Figures.
	 * 
	 * @see ClassFigure#basicMoveBy(..)
	 */
	protected void moveRelative(int dx, int dy) {
		if (roleDefFigure != null) {
			roleDefFigure.basicMoveBy(dx, dy);
		}

		if (multiplicityFigure != null) {
			multiplicityFigure.basicMoveBy(dx, dy);
		}
	}

	/**
	 * Remove visual components ONLY in Diagram:
	 * 
	 * @see ClassDiagramView.remove(Figure)
	 */
	protected void removeLabels() {
		removeRole();
		removeMultiplicity();
	}

	/**
	 * Remove visual components ONLY in Diagram: - RoleDefFigure for Cardinality
	 */
	protected void removeMultiplicity() {
		if (multiplicityFigure != null) {
			getClassDiagram().remove(multiplicityFigure);
			multiplicityFigure = null;
			if (getEdge() != null) {
				((PresentationRole) getEdge()).setMultiplicityAngle(0.0);
				((PresentationRole) getEdge()).setMultiplicityRadius(0.0);
			}
		}
	}

	/**
	 * Remove visual ONLY in Diagram: - RoleDefFigure for Role-Description
	 */
	protected void removeRole() {
		if (roleDefFigure != null) {
			getClassDiagram().remove(roleDefFigure);
			roleDefFigure = null;
			if (getEdge() != null) {
				((PresentationRole) getEdge()).setNameAngle(0.0);
				((PresentationRole) getEdge()).setNameRadius(0.0);
			}
		}
	}

	/**
	 * Overwrites.
	 */
	public void removeInModel() {
		try {
			// don't call removeVisually() here -> associationDef gets lost
			// afterwards
			ch.ehi.uml1_4.foundation.core.Association associationDef = (ch.ehi.uml1_4.foundation.core.Association) getStartElement();

			// 1) remove visually
			removeVisually(associationDef);
			// 2) remove in model
			if (associationDef != null) {
				ElementFactory.removeElement(associationDef);
				setModelElement(null);
			}
		} catch (Throwable e) {
			NodeFigure.handleException(e, NodeFigure.REMOVE_IN_MODEL, null, this);
		}
	}

	/**
	 * Remove everything that belongs to an AssociationDef, such as Name, Roles,
	 * Multiplicities.
	 * 
	 * @param associationDef
	 */
	private void removeVisually(ch.ehi.uml1_4.foundation.core.Association associationDef) {
		removeLabels();

		if (associationDef != null) {
			java.util.Iterator iterator = associationDef.iteratorPresentation();
			while (iterator.hasNext()) {
				// Iterator contains a Composite and a PresentationAssocClass
				Object presentation = iterator.next();
				if (presentation instanceof PresentationAssocClass) {
					// remove Edge from Association-Composite
					if (((PresentationAssocClass) presentation).containsAssociation() && (getEdge() != null)
							&& ((PresentationAssocClass) presentation).getAssociation()
									.containsRolePresentation((PresentationRole) getEdge())) {
						((PresentationAssocClass) presentation).getAssociation()
								.removeRolePresentation((PresentationRole) getEdge());
						break;
					}
				}
			}

			getClassDiagram().remove(this);

			updateLinkFigure(associationDef);
		}
	}

	/**
	 * Remove the Figure visually ONLY. Still kept in real model. Special Case:
	 * Composite is kept in Diagram instead of edge itself
	 * 
	 * @see AssociationLineConnection#handleConnect(Figure, Figure)
	 */
	public void removeVisually() {
		try {
			removeVisually((ch.ehi.uml1_4.foundation.core.Association) getStartElement());
		} catch (Throwable e) {
			NodeFigure.handleException(e, CommonUserAccess.getMniEditRemoveText(), null, this);
		}
	}

	/**
	 * Select the ModelElement of this Figure in NavigationTree.
	 */
	public void selectInBrowser() {
		LauncherView.getInstance().getPnlNavigation().selectElement(((RoleDef) getModelElement()).getAssociation());
	}

	/**
	 * Set the starting/from (Participant-Classifier) AssociationEnd.
	 *
	 * @param int
	 *            AggregationKind
	 * @see getAggregationKind()
	 */
	private void setAggregationEnd(int aggregationKind) {
		// set the From AssociationEnd
		AssociationEnd associationEnd = getEndAssociationEnd();

		if ((associationEnd != null) && (associationEnd.getAggregation() != aggregationKind)) {
			// prevent ping-pong with MetaModelChange-Event
			associationEnd.setAggregation(aggregationKind);
			showDecoration();
		}
	}

	/**
	 * Overwrites.
	 */
	protected void setModelElement(ModelElement modelElement) {
		super.setModelElement(modelElement);

		updateCheckBoxes();

		showDecoration();
	}

	private void updateCheckBoxes() {
		if (modelElement != null) {
			// adapt PopupMenu
			AssociationEnd associationEnd = getEndAssociationEnd();
			chxNavigableEnd.setSelected(associationEnd.isNavigable());
			chxAggregableEnd.setSelected(associationEnd.getAggregation() == AggregationKind.AGGREGATE);
			chxCompositeEnd.setSelected(associationEnd.getAggregation() == AggregationKind.COMPOSITE);
			chxShowAssociationName.setSelected(isShowAssociationName());
		}
	}

	/**
	 * Set beginning (Start) AssociationEnd.
	 *
	 * @param
	 */
	private void setNavigable(boolean isNavigable, AssociationEnd associationEnd) {
		if ((associationEnd != null) && (associationEnd.isNavigable() != isNavigable)) {
			// prevent ping-pong with MetaModelChange-Event
			associationEnd.setNavigable(isNavigable);
			showDecoration();
		}
	}

	/**
	 * Set ending (End) AssociationEnd.
	 *
	 * @param
	 */
	private void setNavigableEnd(boolean isNavigable) {
		setNavigable(isNavigable, getEndAssociationEnd());
	}

	/**
	 * Show the AggregationKind visually.
	 */
	protected void showDecoration() {
		// connection to LinkFigure resp. AssociationDef
		setStartDecoration(null);

		AssociationEnd associationEnd = getEndAssociationEnd();
		if (associationEnd == null) {
			setEndDecoration(null);
		} else {
			setEndDecoration(AssociationLineDecoration.createDecoration(associationEnd, getLineColor()));
		}

		updateImmediately();
	}

	/**
	 * Show Warning message because Relationship is illegal between current
	 * start and end Figure.
	 * 
	 * @see shouldWarn(EdgeFigure, String)
	 */
	protected void showIllegalRelationship(java.lang.String warning) {
		/*
		 * new WarningDialog(LauncherView.getInstance(), "NO CONNECTION",
		 * //resPresentationRoleFigure.getString("CWConnectionNotEstablished"),
		 * //$NON-NLS-1$ warning);
		 */
	}

	/**
	 * Show the Specification Dialog of the PresentationElement.
	 * 
	 * @author Peter Hirzel
	 */
	public void showSpecification() {
		ch.ehi.umleditor.application.LauncherView.getInstance().showSpecification(getStartElement());
	}

	/**
	 * Refresh Label-Figures: - RoleDef - Multiplicity
	 */
	protected void updateLabels() {
		if (roleDefFigure != null) {
			roleDefFigure.updateView();
		}

		if (multiplicityFigure != null) {
			multiplicityFigure.updateView();
		}
	}

	/**
	 * Delegate any update to LinkFigure.
	 */
	private void updateLinkFigure(ch.ehi.uml1_4.foundation.core.Association associationDef) {
		Figure linkFigure = getClassDiagram().findFigure(associationDef);
		if (linkFigure != null) {
			((LinkFigure) linkFigure).updateView();
		}
	}

	/**
	 * Overwrites.
	 */
	public void updateView() {
		ch.ehi.uml1_4.foundation.core.Association associationDef = (ch.ehi.uml1_4.foundation.core.Association) getStartElement();
		if (associationDef != null) {
			if (!associationDef.containsNamespace()) {
				removeVisually();
			} else {
				updateLabels();
				showDecoration();
				updateLinkFigure(associationDef);
			}
		}
	}
}
