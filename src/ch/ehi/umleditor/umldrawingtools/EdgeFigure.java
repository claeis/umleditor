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
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ch.ehi.basics.i18n.ResourceBundle;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.uml1_4.foundation.core.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.figures.*;
import ch.ehi.umleditor.application.*;
import ch.softenvironment.view.*;
import ch.softenvironment.util.*;
/**
 * Figure Specification for all Elements treated as edges in an UML-ClassDiagram.
 * @see NodeFigure
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.3 $ $Date: 2003-12-30 22:09:18 $
 */
abstract class EdgeFigure extends LineConnection implements ModelElementUI {
	// keep reference to real model's presentation
	private static java.util.ResourceBundle resEdgeFigure = ResourceBundle.getBundle(EdgeFigure.class);  //$NON-NLS-1$
	private ClassDiagramView classDiagram = null;
	protected PresentationEdge edge = null;
	protected ModelElement modelElement = null;
	// mouse-Event suppression
	private EdgeFigure lastInvalidEdge = null;
/**
 * EdgeFigure constructor comment.
 * Used by any UML-Tool.
 */
public EdgeFigure() {
	super();
	setLineColor(determineForegroundColor(null));
	showDecoration();
}
/**
 * EdgeFigure constructor comment.
 */
public EdgeFigure(ClassDiagramView classDiagram) {
	this();
	setClassDiagram(classDiagram);
}
/**
 * Factory method to create a default popup menu.
 *
 * @return newly created popup menu
 * @see NodeFigure
 */
public JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	addSpecificationMenu(popupMenu);

	// overwrite this method in subclasses
	addSpecialMenu(popupMenu);

    addSelectInBrowserMenu(popupMenu);

	popupMenu.add(new JSeparator());
	addFormatMenu(popupMenu);
	addEditMenu(popupMenu);

	popupMenu.setLightWeightPopupEnabled(true);
	return popupMenu;
}
/**
 * Add a Deletion Entry to a PopupMenu.
 *
 * @return newly created popup menu
 */
protected void addDeletionMenu(javax.swing.JPopupMenu popupMenu) {
	popupMenu.add(new AbstractAction(MENU_EDIT_REMOVE) {
		public void actionPerformed(ActionEvent event) {
			removeVisually();
		}
	});
	popupMenu.add(new AbstractAction(REMOVE_IN_MODEL) {
		public void actionPerformed(ActionEvent event) {
			removeInModel();
		}
	});
}
/**
 * Add an Edit-Submenu to a PopupMenu.
 *
 * @see NodeFigure
 * @return newly created popup menu
 */
protected void addEditMenu(javax.swing.JPopupMenu popupMenu) {
	JMenu editMenu = new JMenu(MENU_EDIT);

	editMenu.add(new AbstractAction(MENU_EDIT_CUT) {
		public void actionPerformed(ActionEvent event) {
			mniCut();
		}
	});
	editMenu.add(new AbstractAction(MENU_EDIT_COPY) {
		public void actionPerformed(ActionEvent event) {
			mniCopy();
		}
	});
	editMenu.add(new AbstractAction(MENU_EDIT_PASTE) {
		public void actionPerformed(ActionEvent event) {
			mniPaste();
		}
	});
	editMenu.add(new AbstractAction(MENU_EDIT_REMOVE) {
		public void actionPerformed(ActionEvent event) {
			removeVisually();
		}
	});
	editMenu.add(new JSeparator());
	editMenu.add(new AbstractAction(REMOVE_IN_MODEL) {
		public void actionPerformed(ActionEvent event) {
			removeInModel();
		}
	});

	popupMenu.add(editMenu);
}
/**
 * Add a Format Submenu to a PopupMenu.
 *
 * @see NodeFigure
 * @return newly created popup menu
 */
protected void addFormatMenu(javax.swing.JPopupMenu popupMenu) {
	JMenu formatMenu = new JMenu(MENU_FORMAT);
/*
	JPopupMenu fontSizeMenu = new JPopupMenu();
	fontSizeMenu.setName("Schriftgrösse");
	formatMenu.add(fontSizeMenu);
*/
	formatMenu.add(new AbstractAction(MENU_FORMAT_FONT) {
		public void actionPerformed(ActionEvent event) {
			mniFont();
		}
	});
	formatMenu.add(new AbstractAction(MENU_FORMAT_LINE_COLOR) {
		public void actionPerformed(ActionEvent event) {
			mniLineColor();
		}
	});
	formatMenu.add(new AbstractAction(MENU_FORMAT_FILL_COLOR) {
		public void actionPerformed(ActionEvent event) {
			mniFillColor();
		}
	});

	popupMenu.add(formatMenu);
}
/**
 * Save the presentation in Model which will cause Diagram to draw this edge.
 * Interpretation of WayPoint-Iterator:
 *	- first		=> start of LineConnection
 *  - second	=> end of LineConnection
 */
protected void addModelElement(ModelElement relationship) {
	setModelElement(relationship);
	getEdge().addSubject(relationship);

    // keep references
    getClassDiagram().getDiagram().addPresentationElement(getEdge());
}
protected void addSelectInBrowserMenu(javax.swing.JPopupMenu popupMenu) {
	popupMenu.add(new JSeparator());
	popupMenu.add(new AbstractAction(ModelElementUI.SELECT_IN_BROWSER) {
		public void actionPerformed(ActionEvent event) {
			selectInBrowser();
		}
	});
}
/**
 * Add individual PopupMenu items for this class.
 * @see NodeFigure
 * @see createPopupMenu()
 */
protected abstract void addSpecialMenu(JPopupMenu popupMenu);
/**
 * Add a Specification Entry to a PopupMenu.
 *
 * @return newly created popup menu
 * @see NodeFigure
 */
protected void addSpecificationMenu(javax.swing.JPopupMenu popupMenu) {
	popupMenu.add(new AbstractAction(MENU_EDIT_CHANGE_WINDOW) {
		public void actionPerformed(ActionEvent event) {
			showSpecification();
		}
	});
}
/**
 * Connect Handles of the two Nodes connected to this Edge.
 * @see #setEdge(..)
 */
protected final void connectNodes() {
	try {
		java.util.Iterator iterator = getEdge().iteratorWayPoint();
		Vector wayPoints = new Vector();
		while (iterator.hasNext()) {
			wayPoints.add(iterator.next());
		}
	
		// start -> assume dummy value
		int x = 0;
		int y = 0;
		startPoint(x, y);
		Connector start = null;
		if ((getModelElement() instanceof ch.ehi.uml1_4.foundation.core.Generalization) && (getStartElement() instanceof ch.ehi.uml1_4.foundation.core.Association)) {
			start = getClassDiagram().findAssociationAttributeConnector(getStartElement(), x, y);
		} else {
			start = getClassDiagram().findNodeConnector(getStartElement(), x, y);
		} 
		if (start == null) {
Tracer.getInstance().developerError(this, "connectNodes()", "Missing StartNode: there must have been an improper deletion of nodes/edges before=>" + getSourceName(getStartElement()));//$NON-NLS-2$//$NON-NLS-1$
//			shouldWarn(NlsUtils.formatMessage(resEdgeFigure.getString("CWMissingStartNode"), getSourceName(getStartElement()))); //$NON-NLS-1$
			removeVisually();
		} else {
			// end -> assume dummy value
			x = 0;
			y = 0;
			endPoint(x, y);
			iterator = getEdge().iteratorEndpoint();
			iterator.next();  
			Object second = iterator.next();
			Connector end = null;
			if ((second instanceof PresentationAssocClass) && 
				((getModelElement() instanceof RoleDef) || ((getModelElement() instanceof ch.ehi.uml1_4.foundation.core.Generalization)))) {
				// LinkFigure -> must be an AssociatenDef connected to
				// a AssociationAttributeFigure
				// @see ElementFactory#createPresentationRole(..)
				end = getClassDiagram().findAssociationAttributeConnector(getEndElement(), x, y);
			} else {
				// the usual
				end = getClassDiagram().findNodeConnector(getEndElement(), x, y);
			}
			if (end == null) {
Tracer.getInstance().developerError(this, "connectNodes()", "Missing EndNode: there must have been an improper deletion of nodes/edges before=>" + getSourceName(getEndElement()));//$NON-NLS-2$//$NON-NLS-1$
				//shouldWarn(NlsUtils.formatMessage(resEdgeFigure.getString("CWMissingEndNode"), getSourceName(getEndElement()))); //$NON-NLS-1$
				removeVisually();
			} else {
				connectStart(start);
				setEndConnector(end);
	
				// set split-points
				for (int i=0; i<wayPoints.size(); i++) {
					WayPoint currentPoint = (WayPoint)wayPoints.get(i);
					super.insertPointAt(new Point(currentPoint.getEast(), currentPoint.getSouth()), i + 1);
				}
	
				// create start and endPoint()
				updateConnection();
				endFigure().addFigureChangeListener(this);
			}
		}
	} catch(Throwable e) {
		Tracer.getInstance().debug(this, "connectNodes()", e.toString());
	}
}
/**
 * Create a WayPoint.
 * @param p Coordinates of WayPoint
 */
protected static WayPoint createWayPoint(Point p) {
	WayPoint wayPoint = (WayPoint)ElementFactory.createObject(WayPoint.class);
	wayPoint.setEast(p.x);
	wayPoint.setSouth(p.y);

	return wayPoint;
}
/**
 * Assume default Color if none.
 */
protected java.awt.Color determineForegroundColor(PresentationEdge edge) {
	if ((edge == null) || (edge.getForeground() == null)) {
		return ch.ehi.umleditor.application.LauncherView.getSettings().getForegroundColor();
	} else {
		return ColorConverter.createColor(edge.getForeground());
	}
}
/**
 * @see setAttribute(..)
 */
public Object getAttribute(String name) {
    if (name.equals(Figure.POPUP_MENU)) {
        return adaptPopupMenu(new JPopupMenu());
    } else if (name.equals(JHotDrawConstants.FONT_NAME)) {
		if ((getEdge() != null) && (getEdge().getFont() != null)) {
			return getEdge().getFont();
		}
	}

    return super.getAttribute(name);
}
/**
 * Return the classDiagram where this Figure is shown.
 */
protected ClassDiagramView getClassDiagram() {
	return classDiagram;
}
/**
 * Return the Model's presentationElement.
 */
public PresentationEdge getEdge() {
	return edge;
}
/**
 * Return the ending Element of the Relationship.
 * @return Element
 */
protected abstract Element getEndElement();
/**
 * Return the name of the Font.
 */
protected java.awt.Font getFont() {
	String font = (String)getAttribute(JHotDrawConstants.FONT_NAME);
	if (font == null) {
		return java.awt.Font.decode(ch.ehi.umleditor.application.LauncherView.getSettings().getFont());
	} else {
		return java.awt.Font.decode(font);
	}
}
/**
 * Return the encapsulated GeneralizableElement within NodeFigure.
 */
protected GeneralizableElement getGeneralizableElement(Figure figure) {
	return (GeneralizableElement)(((NodeFigure)figure).getModelElement());
}
/**
 * Return the drawing color for the Frame.
 * @see NodeFigure
 */
protected java.awt.Color getLineColor() {
	java.awt.Color color = (java.awt.Color)getAttribute(JHotDrawConstants.FRAME_COLOR);
	if (color == null) {
		return ch.ehi.umleditor.application.LauncherView.getSettings().getForegroundColor();
	} else {
		return (java.awt.Color)getAttribute(JHotDrawConstants.FRAME_COLOR);
	}
}
/**
 * Return the ModelElement displayed by this Figure.
 * @return ModelElement
 */
public ch.ehi.uml1_4.foundation.core.ModelElement getModelElement() {
	return modelElement;
}
private String getSourceName(Element element) {
	String edgeName = StringUtils.getPureClassName(this.getClass()) + ":";
	if (element == null) {
		return edgeName + "<???>";
	} else if (element instanceof ModelElement) {
		return edgeName + ((ModelElement)element).getName().getValue();
	} else {
		return edgeName + element.toString();
	}
}
/**
 * Return the starting Element of the Relationship.
 * @return Element
 */
protected abstract Element getStartElement();
/**
 * Return index of WayPoint if there is one close to the given arguments.
 * @see PolyLineFigure#joinSegments() for Algorithm.
 */
protected int getWayPointIndex(int x, int y) {
	for (int i=1; i<(fPoints.size() - 1); i++) {
		Point p = pointAt(i);
		if (CH.ifa.draw.util.Geom.length(x, y, p.x, p.y) < ch.ehi.umleditor.application.LauncherView.getSettings().getConnectorZone().intValue()) {
//			removePointAt(i);
			return i;
		}
	}
	return -1;
}
/**
 * Overwrites.
 * Keep way Point in PresentationModel as well.
 * @see ConnectionTool.mouseDown(MouseEvent e, int x, int y)
 * #splitSegment(int x, int y)
 */
public void insertPointAt(Point p, int index) {
	if (getEdge() != null) {
	    super.insertPointAt(p, index);
 		getEdge().addWayPoint(index - 1, createWayPoint(p));
    }
}
/**
 * Edit->Copy Action.
 * @see addEditMenu(..)
 */
private void mniCopy() {
	LauncherView.getInstance().nyi(MENU_EDIT_COPY);
}
/**
 * Edit->Cut Action.
 * @see addEditMenu(..)
 */
private void mniCut() {
	LauncherView.getInstance().nyi(MENU_EDIT_CUT);//$NON-NLS-1$
}
/**
 * FillColor Action.
 * @see addEditMenu(..)
 */
private void mniFillColor() {
    // makes no sense here
	mniLineColor();
}
/**
 * Font Action.
 * @see addEditMenu(..)
 */
private void mniFont() {
LauncherView.getInstance().nyi(MENU_FORMAT_FONT);
}
/**
 * LineColor Action.
 * @see addEditMenu(..)
 */
private void mniLineColor() {
	ColorChooserDialog dialog = new ColorChooserDialog(LauncherView.getInstance(), true);
	if (dialog.isSaved()) {
		setLineColor(dialog.getChosenColor());
	}
}
/**
 * Edit->Paste Action.
 * @see addEditMenu(..)
 */
private void mniPaste() {
LauncherView.getInstance().nyi(MENU_EDIT_PASTE);
}
/**
 * Remove the Figure in Model (implies visual deletion).
 * @see removeVisually
 * @see ElementMapper#removeElement(Element)
 * @see ClassDiagramView#updateEdgeFigure(..)
 */
public void removeInModel() {
	try {
		// 1) remove visually
		removeVisually();

		// 2) remove in model
		if (getModelElement() != null) {
		    ElementFactory.removeElement(getModelElement());
	 		setModelElement(null);
		}
	} catch(Throwable e) {
		NodeFigure.handleException(e, NodeFigure.REMOVE_IN_MODEL, DeveloperException.DEVELOPER_ERROR, this);
	}
}
/**
 * Overwrites.
 * Remove WayPoint from Model.
 * @see #joinSegments(int x, int y)
 */
public void removePointAt(int i) {
	if (getEdge() != null) {
		super.removePointAt(i);
		getEdge().removeWayPoint(i - 1);
	}
}
/**
 * Remove the Figure visually ONLY in its Diagram.
 * Still kept in real model.
 */
public void removeVisually() {
	try {
		// 1) remove drawing
		if (getClassDiagram() != null) {
			// remove drawing
			getClassDiagram().remove(this);

			// 2) remove in model
			if ((edge != null) && getClassDiagram().getDiagram().containsPresentationElement(edge)) {
				// remove Edge from Diagram
				getClassDiagram().getDiagram().removePresentationElement(edge);
		/*
				// remove WayPoints
				edge.clearWayPoint();

				if (edge.containsSubject(getModelElement())) {
					// remove from model
					edge.removeSubject(getModelElement());
				}
		*/
			}
		}
	} catch(Throwable e) {
		NodeFigure.handleException(e, MENU_EDIT_REMOVE, DeveloperException.DEVELOPER_ERROR, this);
	}
}
/**
 * Select the ModelElement of this Figure in NavigationTree.
 */
public void selectInBrowser() {
	LauncherView.getInstance().getPnlNavigation().selectElement(getModelElement());
}
/**
 * Extend Attribute-map with Popup-Menu and
 * make sure LineDecorations change Colors as well.
 */
public void setAttribute(String name, Object value) {
    if (name.equals(JHotDrawConstants.FRAME_COLOR)) {
	    // don't forget to change color of Decoration
	    if (getStartDecoration() != null) {
			((AbstractLineDecoration)getStartDecoration()).setBorderColor((java.awt.Color)value);
   		   		changed();
    	}
	    if (getEndDecoration() != null) {
			((AbstractLineDecoration)getEndDecoration()).setBorderColor((java.awt.Color)value);
  	    		changed();
  	  	}
    }
    super.setAttribute(name, value);
}
/**
 * Set the ClassDiagram drawing this Edge.
 *
 * Attention: the ClassDiagram should be assigned as last action
 * for new established edges, so updateView() may be sure to do
 * the right thing.
 *
 * @see #updateView()
 * @see NodeFigure
 */
private void setClassDiagram(ClassDiagramView classDiagram) {
	this.classDiagram = classDiagram;
if (classDiagram == null) {
	int debug =0;
}
}
/**
 * Set the Edge and its Coordinates.
 * WayPoints are kept in an own ArrayList therefore endPoint-List contains only two entries:
 *	[0] => start
 *	[1] => end
 * @see #connectNodes()
 */
public void setEdge(PresentationEdge edge, Figure start, Figure end) {
	this.edge = edge;

	// save Color
	getEdge().setForeground(ColorConverter.createColor(getLineColor()));

	edge.addEndpoint(((NodeFigure)start).getNode());
	edge.addEndpoint(((NodeFigure)end).getNode());
}
/**
 * Overwrites for promoting visibility only.
 */
protected void setEndConnector(Connector newEndConnector) {
	super.setEndConnector(newEndConnector);
}
/**
 * Set the Font.
 * @param font (like "family-style-size")
 * @see EdgeFigure
 * @see setAttribute(..)
 */
protected void setFont(String font) {
	setAttribute(JHotDrawConstants.FONT_NAME, font);

	if ((getEdge() != null) && (!getEdge().getFont().equalsIgnoreCase(font))) {
		// prevent ping-pong with MetaModelChange
		getEdge().setFont(font);
	}
}
/**
 * Set the Line/Frame Color.
 * @see NodeFigure
 * @see setAttribute(..)
 */
protected void setLineColor(java.awt.Color color) {
	setAttribute(JHotDrawConstants.FRAME_COLOR, color);

	if ((getEdge() != null) && (!ColorConverter.isSame(getEdge().getForeground(), color))) {
		// prevent ping-pong by MetaModelChange
		getEdge().setForeground(ColorConverter.createColor(color));
	}
}
/**
 * ModelElement displayed by this Edge.
 */
protected void setModelElement(ModelElement modelElement) {
	this.modelElement = modelElement;
}
/**
 * Overwrites.
 * Set/reset a WayPoint with the given index at location p.
 * Save/update the WayPoint in PresentationModel as well.
 * @see ConnectionTool.mouseDrag(MouseEvent e, int x, int y)
 */
public void setPointAt(Point p, int index) {
	if (getEdge() != null) {
		super.setPointAt(p, index);
		if ((index != 0) && (index < pointCount() - 1)) {
			// only treat points within endPoints
			getEdge().setWayPoint(index - 1, createWayPoint(p));
		}
	}
}
/**
 * Overwrites for promoting visibility only.
 */
protected void setStartConnector(Connector newStartConnector) {
	super.setStartConnector(newStartConnector);
}
/**
 * Set's the current UML-Tool's view as Diagram.
 * @see #updateView() Sequence of call is important
 */
protected void setToolView() {
	// keep the classDiagram where this figure is drawn
    setClassDiagram((ClassDiagramView)((AbstractTool)LauncherView.getInstance().tool()).view());
}
/**
 * Check wether user must be warned because of illegal Relationship.
 * Several mouse events might trigger canConnect(Figure, Figure) but only
 * one Warning is desired.
 * @see canConnect(Figure, Figure)
 */
protected void shouldWarn(String warning) {
	if ((lastInvalidEdge == null) || (!(lastInvalidEdge.equals(this)))) {
		lastInvalidEdge = this;
		this.showIllegalRelationship(warning);
	}
	// undraw illegal Relationship
//	release();
//	invalidate();
//	changed();

	// this EdgeFigure is not any more desired in Diagram
	if (getClassDiagram() != null) {
		getClassDiagram().remove(this);
	}
}
/**
 * Decorate the RelationShip-Ends.
 * Overwrite this method for specific behaviour.
 */
protected void showDecoration() {
	setStartDecoration(null);
    setEndDecoration(null);
}
/**
 * Show Warning message because Relationship is illegal between current start and end Figure.
 * @see shouldWarn(EdgeFigure, String)
 */
protected abstract void showIllegalRelationship(String warning);
/**
 * Show the Specification Dialog of the PresentationElement.
 */
public abstract void showSpecification();
/**
 * Overwrites.
 */
public void updateConnection() {
	try {
		super.updateConnection();
	} catch(Throwable e) {
		// in case of dragging a NullPointerExcepion might be experienced
		Tracer.getInstance().patch(this, "updateConnection()", "JHotDraw-Error ignored [" + e.toString() + "]");
	}
}
/**
 * Make the changes visible immediately.
 */
protected void updateImmediately() {
	/* comment by Wolfram
		changing a figure and drawing the changes (-> updating) are two separate methods.
		This provides more flexibility if you have a sequence of changes but want to redraw only once.
		Thus, changed() marks the figure as dirty (e.g calling figureInvalidated()) whereas figureRequestUpdate()
		performs the redraw afterwards (unfortunatelly the programmer must take care of this).

		I admit that in most circumstances figureChanged() and figureRequestUpdate() should probably do the same.
		The concept is inconsistent in so far that one time you call a method (changed) on a figure to do
		something and the other time you notify a listener (figureRequestUpdate).
		Perhaps we need a method (Figure.update() ?) that makes this more consistent.
	*/
	willChange();
	if (listener() != null) {
		listener().figureRequestUpdate(new FigureChangeEvent(this));
	}
	changed();
}
/**
 * ModelElement changed from outside. Therefore a refresh of the View is needed.
 * @see #setClassDiagram(ClassDiagramView)
 */
public void updateView() {
	// don't remove while establishing connection
	if (getClassDiagram() != null) {
		if ((getStartElement() == null) || (getEndElement() == null) ||
				(getClassDiagram().findFigure(getStartElement()) == null) ||
				(getClassDiagram().findFigure(getEndElement()) == null)) {
			// both presentationNodes are both to be found in ClassDiagram
			removeVisually();
		}
	}
}
}
