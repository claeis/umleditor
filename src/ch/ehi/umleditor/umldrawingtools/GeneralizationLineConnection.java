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
import java.awt.event.ActionEvent;

import javax.swing.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.interlis.modeltopicclass.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.figures.*;
import ch.ehi.umleditor.application.*;
import ch.softenvironment.view.*;

/**
<<<<<<< HEAD
 * An InheritanceLineConnection is a graphical representation for
 * an inheritance relationship (is-a) between two classes (represented
 * by ClassFigures).
 *
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.5 $ $Date: 2005-02-23 16:46:01 $
 */
public class GeneralizationLineConnection extends EdgeFigure {
	private boolean showDrawing = true;
/**
 * Used for new Generalization's in ClassDiagram's by UML-Tool.
 */
public GeneralizationLineConnection() {
    super();
}
/**
 * Used at reopening of ClassDiagram's containing Generalizations.
 * @see ClassDiagramView.setDiagramElement(Element)
 */
public GeneralizationLineConnection(ClassDiagramView classDiagram, PresentationEdge edge) {
	super(classDiagram);
    setLineColor(determineForegroundColor(edge));	// must precede edge-setting
    this.edge = edge;
    setModelElement((ModelElement)edge.iteratorSubject().next());
}
/**
 * Used to present given Model-Generalization.
 */
public GeneralizationLineConnection(ClassDiagramView classDiagram, Figure start, Figure end, ch.ehi.uml1_4.foundation.core.Generalization generalization) {
	super(classDiagram);
    setEdge(new ch.ehi.umleditor.umlpresentation.Generalization(), start, end);
	addModelElement((ModelElement)generalization);
}
/**
 * Add an Deletion Entry to a PopupMenu.
 *
 * @see EdgeFigure
 * @return newly created popup menu
 */
protected void addEditMenu(javax.swing.JPopupMenu popupMenu) {
	JMenu editMenu = new JMenu(CommonUserAccess.getMnuEditText());

	editMenu.add(new AbstractAction(REMOVE_IN_MODEL) {
		public void actionPerformed(ActionEvent event) {
			removeInModel();
		}
	});

	popupMenu.add(editMenu);
}
protected void addSelectInBrowserMenu(javax.swing.JPopupMenu popupMenu) {}
/**
 * Add individual PopupMenu items for this class.
 * @see NodeFigure
 * @see createPopupMenu()
 */
protected void addSpecialMenu(javax.swing.JPopupMenu popupMenu) {}
protected void addSpecificationMenu(javax.swing.JPopupMenu popupMenu) {}
/**
 * Test whether an inheritance relationship between two ClassFigures or PackageFigures
 * can be established. An inheritance relationshop can be established if
 * there is no cyclic inheritance graph. This method is called before
 * the two classes are connected in the diagram.
 *
 * @param   start   subclass/child/specialization
 * @param   end     superclass/parent/generalization
 * @return  true, if an inheritance relationship can be established, false otherwise
 */
public boolean canConnect(Figure start, Figure end) {
	String typeError = NodeFigure.getResourceString(GeneralizationLineConnection.class, "CWGeneralizationNodeTypes"); //$NON-NLS-1$
	GeneralizableElement child = null;
	GeneralizableElement parent = null;

	try {
		// Casting possible ?
		child = getGeneralizableElement(start);
		parent = getGeneralizableElement(end);
	} catch(ClassCastException e) {
		shouldWarn(typeError);
		return false;
	}

	if (!(((child instanceof AbstractClassDef) && (parent instanceof AbstractClassDef)) ||
			((child instanceof TopicDef) && (parent instanceof TopicDef)))) {
		shouldWarn(typeError);
		return false;
	}

	if (getEdge() == null) {
		String error = ElementUtils.checkInheritance(parent, child);
		if (error != null) {
			shouldWarn(error);
			return false;
		}
	} // else given Generalization was dragged

	return true;
}
/**
 * Overwrites.
 *
 * Show Mouse-connection while establishing Association.
 * Then leave the drawing to Composite-Figure's.
 */
public final void draw(Graphics g) {
	if (showDrawing) {
		super.draw(g);
	}
}
/**
 * Return the ending/Parent ModelElement of the Relationship.
 * @return Element	superclass/parent/generalization(end)
 */
protected Element getEndElement() {
	if ((getModelElement() != null) && ((ch.ehi.uml1_4.foundation.core.Generalization)getModelElement()).containsParent()) {
		return ((ch.ehi.uml1_4.foundation.core.Generalization)getModelElement()).getParent();
	} else {
		return null;
	}
}
/**
 * Return the starting/Child ModelElement of the Relationship.
 * @return Element	subclass/child/specialization/(start)
 */
protected Element getStartElement() {
	if ((getModelElement() != null) && ((ch.ehi.uml1_4.foundation.core.Generalization)getModelElement()).containsChild()) {
		return ((ch.ehi.uml1_4.foundation.core.Generalization)getModelElement()).getChild();
	} else {
		return null;
	}
}
/**
 * Hook method to plug in application behaviour into
 * a template method. This method is called when a
 * connection between two objects has been established.
 * @param   start   subclass/child/specialization
 * @param   end     superclass/parent/generalization
 * @see canConnect(..)
 * @see removeInModel()
 */
protected void handleConnect(Figure start, Figure end) {
	try {
		if (getEdge() == null) {
			GeneralizableElement child = getGeneralizableElement(start);
			GeneralizableElement parent = getGeneralizableElement(end);
						
			if (start instanceof LinkFigure) {
				// Association inherits Association => suppress visual drawing
				// @see LinkFigure#updateInheritance(..)
				showDrawing = false;
				ElementFactory.createGeneralization(parent, child);
			} else {
				// the usual
				setEdge(new ch.ehi.umleditor.umlpresentation.Generalization(), start, end);
				ch.ehi.uml1_4.foundation.core.Generalization generalization = ElementFactory.createGeneralization(parent, child);

				setToolView();

				addModelElement((ModelElement)generalization);
			}			
	    } // else dragging of existing Generalization was done
	} catch(Throwable e) {
	    BaseDialog.showError(LauncherView.getInstance(), CREATION_ERROR, NodeFigure.getResourceString(GeneralizationLineConnection.class, "CEGeneralizationFailed"), e); //$NON-NLS-1$
	}
}
/**
 * Decorate the RelationShip-Ends.
 * Overwrites.
 */
protected void showDecoration() {
    setStartDecoration(null);
    ArrowTip arrow = new ArrowTip(0.35, 15, 14);
    arrow.setFillColor(ch.ehi.umleditor.application.LauncherView.getSettings().getBackgroundColor());
    arrow.setBorderColor(getLineColor());
    setEndDecoration(arrow);
}
/**
 * Show Warning message because Relationship is illegal between current start and end Figure.
 * @see shouldWarn(EdgeFigure, Figure, Figure)
 */
protected void showIllegalRelationship(String warning) {
    BaseDialog.showWarning((java.awt.Component)ch.ehi.umleditor.application.LauncherView.getInstance(),
						NodeFigure.getResourceString(GeneralizationLineConnection.class, "CWGeneralizationNotAllowed"), //$NON-NLS-1$
						warning);
}
/**
 * Show the Specification Dialog of the PresentationElement.
 * @author Peter Hirzel
 */
public void showSpecification() {
	LauncherView.getInstance().showSpecification(getModelElement());
}
/**
 * Overwrites.
 */
public void updateView() {
	if ((getModelElement() != null) && (!((ch.ehi.uml1_4.foundation.core.Generalization)getModelElement()).containsChild())) {
		removeVisually();
	} else {
		super.updateView();
	}
}
=======
 * An InheritanceLineConnection is a graphical representation for an inheritance
 * relationship (is-a) between two classes (represented by ClassFigures).
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.5 $ $Date: 2005-02-23 16:46:01 $
 */
public class GeneralizationLineConnection extends EdgeFigure {
	
	private static final long serialVersionUID = -1688714642415616186L;
	private boolean showDrawing = true;

	/**
	 * Used for new Generalization's in ClassDiagram's by UML-Tool.
	 */
	public GeneralizationLineConnection() {
		super();
	}

	/**
	 * Used at reopening of ClassDiagram's containing Generalizations.
	 * 
	 * @see ClassDiagramView.setDiagramElement(Element)
	 */
	public GeneralizationLineConnection(ClassDiagramView classDiagram, PresentationEdge edge) {
		super(classDiagram);
		setLineColor(determineForegroundColor(edge)); // must precede
														// edge-setting
		this.edge = edge;
		setModelElement((ModelElement) edge.iteratorSubject().next());
	}

	/**
	 * Used to present given Model-Generalization.
	 */
	public GeneralizationLineConnection(ClassDiagramView classDiagram, Figure start, Figure end,
			ch.ehi.uml1_4.foundation.core.Generalization generalization) {
		super(classDiagram);
		setEdge(new ch.ehi.umleditor.umlpresentation.Generalization(), start, end);
		addModelElement((ModelElement) generalization);
	}

	/**
	 * Add an Deletion Entry to a PopupMenu.
	 *
	 * @see EdgeFigure
	 * @return newly created popup menu
	 */
	protected void addEditMenu(javax.swing.JPopupMenu popupMenu) {
		JMenu editMenu = new JMenu(CommonUserAccess.getMnuEditText());

		editMenu.add(new AbstractAction(REMOVE_IN_MODEL) {
			public void actionPerformed(ActionEvent event) {
				removeInModel();
			}
		});

		popupMenu.add(editMenu);
	}

	protected void addSelectInBrowserMenu(javax.swing.JPopupMenu popupMenu) {
	}

	/**
	 * Add individual PopupMenu items for this class.
	 * 
	 * @see NodeFigure
	 * @see createPopupMenu()
	 */
	protected void addSpecialMenu(javax.swing.JPopupMenu popupMenu) {
	}

	protected void addSpecificationMenu(javax.swing.JPopupMenu popupMenu) {
	}

	/**
	 * Test whether an inheritance relationship between two ClassFigures or
	 * PackageFigures can be established. An inheritance relationshop can be
	 * established if there is no cyclic inheritance graph. This method is
	 * called before the two classes are connected in the diagram.
	 *
	 * @param start
	 *            subclass/child/specialization
	 * @param end
	 *            superclass/parent/generalization
	 * @return true, if an inheritance relationship can be established, false
	 *         otherwise
	 */
	public boolean canConnect(Figure start, Figure end) {
		String typeError = NodeFigure.getResourceString(GeneralizationLineConnection.class,
				"CWGeneralizationNodeTypes"); //$NON-NLS-1$
		GeneralizableElement child = null;
		GeneralizableElement parent = null;

		try {
			// Casting possible ?
			child = getGeneralizableElement(start);
			parent = getGeneralizableElement(end);
		} catch (ClassCastException e) {
			shouldWarn(typeError);
			return false;
		}

		if (!(((child instanceof AbstractClassDef) && (parent instanceof AbstractClassDef))
				|| ((child instanceof TopicDef) && (parent instanceof TopicDef)))) {
			shouldWarn(typeError);
			return false;
		}

		if (getEdge() == null) {
			String error = ElementUtils.checkInheritance(parent, child);
			if (error != null) {
				shouldWarn(error);
				return false;
			}
		} // else given Generalization was dragged

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
	 * Return the ending/Parent ModelElement of the Relationship.
	 * 
	 * @return Element superclass/parent/generalization(end)
	 */
	protected Element getEndElement() {
		if ((getModelElement() != null)
				&& ((ch.ehi.uml1_4.foundation.core.Generalization) getModelElement()).containsParent()) {
			return ((ch.ehi.uml1_4.foundation.core.Generalization) getModelElement()).getParent();
		} else {
			return null;
		}
	}

	/**
	 * Return the starting/Child ModelElement of the Relationship.
	 * 
	 * @return Element subclass/child/specialization/(start)
	 */
	protected Element getStartElement() {
		if ((getModelElement() != null)
				&& ((ch.ehi.uml1_4.foundation.core.Generalization) getModelElement()).containsChild()) {
			return ((ch.ehi.uml1_4.foundation.core.Generalization) getModelElement()).getChild();
		} else {
			return null;
		}
	}

	/**
	 * Hook method to plug in application behaviour into a template method. This
	 * method is called when a connection between two objects has been
	 * established.
	 * 
	 * @param start
	 *            subclass/child/specialization
	 * @param end
	 *            superclass/parent/generalization
	 * @see canConnect(..)
	 * @see removeInModel()
	 */
	protected void handleConnect(Figure start, Figure end) {
		try {
			if (getEdge() == null) {
				GeneralizableElement child = getGeneralizableElement(start);
				GeneralizableElement parent = getGeneralizableElement(end);

				if (start instanceof LinkFigure) {
					// Association inherits Association => suppress visual
					// drawing
					// @see LinkFigure#updateInheritance(..)
					showDrawing = false;
					ElementFactory.createGeneralization(parent, child);
				} else {
					// the usual
					setEdge(new ch.ehi.umleditor.umlpresentation.Generalization(), start, end);
					ch.ehi.uml1_4.foundation.core.Generalization generalization = ElementFactory
							.createGeneralization(parent, child);

					setToolView();

					addModelElement((ModelElement) generalization);
				}
			} // else dragging of existing Generalization was done
		} catch (Throwable e) {
			BaseDialog.showError(LauncherView.getInstance(), CREATION_ERROR,
					NodeFigure.getResourceString(GeneralizationLineConnection.class, "CEGeneralizationFailed"), e); //$NON-NLS-1$
		}
	}

	/**
	 * Decorate the RelationShip-Ends. Overwrites.
	 */
	protected void showDecoration() {
		setStartDecoration(null);
		ArrowTip arrow = new ArrowTip(0.35, 15, 14);
		arrow.setFillColor(ch.ehi.umleditor.application.LauncherView.getSettings().getBackgroundColor());
		arrow.setBorderColor(getLineColor());
		setEndDecoration(arrow);
	}

	/**
	 * Show Warning message because Relationship is illegal between current
	 * start and end Figure.
	 * 
	 * @see shouldWarn(EdgeFigure, Figure, Figure)
	 */
	protected void showIllegalRelationship(String warning) {
		BaseDialog.showWarning((java.awt.Component) ch.ehi.umleditor.application.LauncherView.getInstance(),
				NodeFigure.getResourceString(GeneralizationLineConnection.class, "CWGeneralizationNotAllowed"), //$NON-NLS-1$
				warning);
	}

	/**
	 * Show the Specification Dialog of the PresentationElement.
	 * 
	 * @author Peter Hirzel
	 */
	public void showSpecification() {
		LauncherView.getInstance().showSpecification(getModelElement());
	}

	/**
	 * Overwrites.
	 */
	public void updateView() {
		if ((getModelElement() != null)
				&& (!((ch.ehi.uml1_4.foundation.core.Generalization) getModelElement()).containsChild())) {
			removeVisually();
		} else {
			super.updateView();
		}
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
