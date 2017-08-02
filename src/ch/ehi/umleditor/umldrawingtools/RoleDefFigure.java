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
import ch.softenvironment.view.*;
import ch.ehi.interlis.associations.Participant;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.umleditor.application.*;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import ch.ehi.uml1_4.foundation.core.*;
import CH.ifa.draw.figures.*;

/**
 * This Figure serves as an additional figure to represent
 * PresentationRoleFigure. This way a roleName and/or Multiplicity of a RoleDef
 * can be displayed by two separate Figures.
 * 
 * @see PresentationRoleFigure#getEdge() to keep Presentation-Data.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.12 $ $Date: 2007-12-28 10:27:16 $
 */
class RoleDefFigure extends NodeFigure {
	private PresentationRoleFigure edgeFigure = null;
	private LinkFigure linkFigure = null;

	protected static final int ROLE_DEF = 0;
	protected static final int CARDINALITY = 1;
	protected static final int ASSOCIATION_NAME = 2;

	private int type = ASSOCIATION_NAME;

	private TextFigure textFigure = null;

	/**
	 * Constructor.
	 */
	public RoleDefFigure(LinkFigure linkFigure) {
		super(new RectangleFigure());

		// actually PresentationRoleFigure and RoleDefFigure belong to the same
		// edge
		this.linkFigure = linkFigure;
		this.type = ASSOCIATION_NAME;

		initializeView();
		updateView();
	}

	/**
	 * Constructor.
	 */
	public RoleDefFigure(PresentationRoleFigure edgeFigure, final int type) {
		super(new RectangleFigure());

		// actually PresentationRoleFigure and RoleDefFigure belong to the same
		// edge
		this.edgeFigure = edgeFigure;
		this.type = type;

		initializeView();
		updateView();
	}

	/**
	 * Overwrites.
	 */
	protected javax.swing.JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
		addSpecificationMenu(popupMenu);

		addSelectionMenu(popupMenu);
		popupMenu.add(new AbstractAction(getResourceString(RoleDefFigure.class, "MniSelectTargetInBrowser_text")) {
			public void actionPerformed(ActionEvent event) {
				ModelElement ele = getModelElement();
				Classifier target = null;
				if (ele instanceof Participant) {
					Participant participant = ((Participant) ele);
					if (participant.containsParticipant()) {
						target = participant.getParticipant();
					}
				} else {
					RoleDef role = (RoleDef) ele;
					if (role.containsParticipant()) {
						target = role.getParticipant();
					}
				}
				if (target != null) {
					LauncherView.getInstance().getPnlNavigation().selectElement(target);
				}
			}
		});
		popupMenu.add(new AbstractAction(getResourceString(RoleDefFigure.class, "MniSelectOwnerInBrowser_text")) {
			public void actionPerformed(ActionEvent event) {
				ModelElement ele = getModelElement();
				if (ele instanceof Participant) {
					ele = ((Participant) ele).getAssociation();
				}
				RoleDef role = (RoleDef) ele;
				if (role.getAssociation() != null) {
					LauncherView.getInstance().getPnlNavigation().selectElement(role.getAssociation());
				}
			}
		});
		return popupMenu;
	}

	/**
	 * This Figure is not connectable at all. Overwrites.
	 */
	public boolean canConnect() {
		return false;
	}

	/**
	 * Overwrites.
	 */
	public void draw(Graphics g) {
		super.draw(g);

		if (type == ROLE_DEF) {
			// draw preceding "+" (UML-Syntax for a Role-Descriptor)
			Rectangle r = displayBox();
			g.setColor(edgeFigure.getLineColor());
			g.drawString("+", r.x - 8, r.y + 11);//$NON-NLS-1$
		}
	}

	/**
	 * Overwrites. Same Diagram as in parent Figure.
	 */
	protected ClassDiagramView getClassDiagram() {
		if (type == ASSOCIATION_NAME) {
			return linkFigure.getClassDiagram();
		} else {
			return edgeFigure.getClassDiagram();
		}
	}

	/**
	 * Same edge as in parent Figure.
	 */
	private PresentationRole getEdge() {
		return (PresentationRole) edgeFigure.getEdge();
	}

	/**
	 * Overwrites. Same edge as in parent Figure.
	 */
	public ModelElement getModelElement() {
		// @see ClassDiagram.findFigure(..)
		if (type == ASSOCIATION_NAME) {
			return linkFigure.getModelElement();
		} else {
			return edgeFigure.getModelElement();
		}
	}

	/**
	 * This figure has no handles. public java.util.Vector handles() { return
	 * new java.util.Vector(); }
	 */
	/**
	 * Hook method called to initizialize a ClassFigure. It is called from the
	 * constructors and the clone() method.
	 * 
	 * @see setModelElement()
	 */
	protected void initializeView() {
		// keep the RectangleFigure transparent
		java.awt.Color transparent = getClassDiagram().getBackground();
		getPresentationFigure().setAttribute(JHotDrawConstants.FRAME_COLOR, transparent);

		// start with an empty Composite
		removeAll();

		// TextFigure containing Info
		textFigure = new TextFigure() {
			public void setText(String newText) {
				if (newText != null) {
					String name = newText;

					if (type == CARDINALITY) {
						// must be CARDINALITY @see #draw(Graphics)
						try {
							ch.ehi.uml1_4.foundation.datatypes.Multiplicity multiplicity = MultiplicityConverter
									.createMultiplicity(newText);
							if (!MultiplicityConverter.isSame(multiplicity,
									edgeFigure.getEndAssociationEnd().getMultiplicity())) {
								edgeFigure.getEndAssociationEnd().setMultiplicity(multiplicity);
								name = MultiplicityConverter.getRange(multiplicity);
							}
						} catch (Throwable e) {
							String errorMsg = null;
							if (e instanceof ch.softenvironment.util.DeveloperException) {
								errorMsg = ((ch.softenvironment.util.DeveloperException) e).getMessage();
							} else {
								errorMsg = "[" + e.toString() + "]";//$NON-NLS-2$//$NON-NLS-1$
							}
							BaseDialog.showWarning((java.awt.Component) LauncherView.getInstance(),
									getResourceString(RoleDefFigure.class, "CTInvalidInput"), //$NON-NLS-1$
									getResourceString(RoleDefFigure.class, "CWInputReset") + "\n" + errorMsg);//$NON-NLS-2$ //$NON-NLS-1$
						}
						name = MultiplicityConverter.getRange(edgeFigure.getEndAssociationEnd().getMultiplicity());
					} else {
						if (!updateName(newText)) {
							name = getModelElement().getDefLangName();
						}
					}

					super.setText(name);
					update();
				}
			}
		};
		textFigure.setFont(getFont());

		add(textFigure);
	}

	/**
	 * Remove the Figure visually ONLY. Still kept in real model. Special Case:
	 * Composite is kept in Diagram instead of edge itself
	 * 
	 * @see AssociationLineConnection#handleConnect(Figure, Figure)
	 */
	public void removeVisually() {
		try {
			switch (type) {
			case ROLE_DEF:
				getEdge().setNameVisible(false);
				break;
			case CARDINALITY:
				getEdge().setMultiplicityVisible(false);
				break;
			case ASSOCIATION_NAME:
				linkFigure.removeLabels();
				break;
			}
		} catch (Throwable e) {
			NodeFigure.handleException(e, CommonUserAccess.getMniEditRemoveText(), null, this);
		}
	}

	/**
	 * Overwrites. Coordinates are kept in polar System.
	 */
	public void updateCoordinates() {
		Rectangle rectangle = getPresentationFigure().displayBox();
		double x1 = rectangle.getX();
		double y1 = rectangle.getY();

		if (type == ROLE_DEF) {
			// TODO NYI: use Polar coordinates instead
			getEdge().setNameAngle(x1);
			getEdge().setNameRadius(y1);
		} else if (type == CARDINALITY) {
			getEdge().setMultiplicityAngle(x1);
			getEdge().setMultiplicityRadius(y1);
		} else if (type == ASSOCIATION_NAME) {
			// ch.ehi.umleditor.umlpresentation.PresentationNode n =
			// linkFigure.getNode();
			// ch.softenvironment.util.Tracer.getInstance().debug("width=" +
			// n.getWidth() + " height="+n.getHeight() + " south="+ n.getSouth()
			// + " east="+n.getEast());
			// linkFigure.getNode().setWidth((int)x1);
			// linkFigure.getNode().setHeight((int)y1);
		}
	}

	/**
	 * ModelElement changed from outside. Therefore a refresh of the View is
	 * needed.
	 */
	public void updateView() {
		if (type == ROLE_DEF) {
			if (getModelElement() != null) {
				// node might have changed
				// super.updateView();
				if (getModelElement() instanceof Participant) {
					// XOR
					textFigure.setText(((Participant) getModelElement()).getAssociation().getDefLangName());
				} else {
					// RoleDef
					textFigure.setText(getModelElement().getDefLangName());
				}
			}
		} else if (type == CARDINALITY) {
			if ((getEdge() != null) && (edgeFigure.getEndAssociationEnd() != null)) {
				// super.updateView();
				textFigure.setText(ch.ehi.umleditor.application.MultiplicityConverter
						.getRange(edgeFigure.getEndAssociationEnd().getMultiplicity()));
			}
		} else if (type == ASSOCIATION_NAME) {
			textFigure.setText(linkFigure.getModelElement().getDefLangName());
		}
	}
}
