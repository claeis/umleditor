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
import ch.ehi.uml1_4.foundation.core.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.contrib.*;
import ch.ehi.umleditor.application.*;
import ch.softenvironment.util.ResourceManager;
import ch.softenvironment.util.Tracer;
import ch.softenvironment.view.*;
/**
 * Fiure Specification for all Elements treated as Nodes in an UML-Class-Diagram.
 * @see EdgeFigure
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.5 $ $Date: 2004-04-27 09:22:46 $
 */
abstract class NodeFigure extends GraphicalCompositeFigure implements ModelElementUI {
	// keep reference to real model's presentation
	protected ch.ehi.umleditor.umlpresentation.PresentationNode node;
	private ClassDiagramView classDiagram = null;
	private boolean creating = true;
/**
 * UmlFigure constructor comment.
 * @param newPresentationFigure ch.ifa.draw.framework.Figure
 */
public NodeFigure(Figure newPresentationFigure) {
	super(newPresentationFigure);
	setCreating(true);
}
/**
 * Factory method to create a default popup menu.
 *
 * @return newly created popup menu
 */
public JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	addSpecificationMenu(popupMenu);

	// overwrite this method in subclasses
	addSpecialMenu(popupMenu);

	popupMenu.add(new JSeparator());
	popupMenu.add(new AbstractAction(ModelElementUI.SELECT_IN_BROWSER) {
		public void actionPerformed(ActionEvent event) {
			selectInBrowser();
		}
	});
	
	popupMenu.add(new JSeparator());
	addFormatMenu(popupMenu);
	addEditMenu(popupMenu);

	popupMenu.setLightWeightPopupEnabled(true);
	return popupMenu;
}
/**
 * Add a standard Edit-Submenu to a PopupMenu.
 *
 * @see EdgeFigure
 * @return newly created popup menu
 */
protected void addEditMenu(javax.swing.JPopupMenu popupMenu) {
	JMenu editMenu = new JMenu(CommonUserAccess.getMnuEditText());

	editMenu.add(new AbstractAction(CommonUserAccess.getMniEditCutText()) {
		public void actionPerformed(ActionEvent event) {
			mniCut();
		}
	});
	editMenu.add(new AbstractAction(CommonUserAccess.getMniEditCopyText()) {
		public void actionPerformed(ActionEvent event) {
			mniCopy();
		}
	});
	editMenu.add(new AbstractAction(CommonUserAccess.getMniEditPasteText()) {
		public void actionPerformed(ActionEvent event) {
			mniPaste();
		}
	});
	editMenu.add(new AbstractAction(CommonUserAccess.getMniEditRemoveText()) {
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
 * Add a Format-Submenu to a PopupMenu.
 *
 * @see EdgeFigure
 * @return newly created popup menu
 */
protected void addFormatMenu(javax.swing.JPopupMenu popupMenu) {
	JMenu formatMenu = new JMenu(CommonUserAccess.getMnuFormatText());
/*
	JPopupMenu fontSizeMenu = new JPopupMenu();
	fontSizeMenu.setName("Schriftgrösse");
	formatMenu.add(fontSizeMenu);
*/	
	formatMenu.add(new AbstractAction(CommonUserAccess.getMniFormatFontText()) {
		public void actionPerformed(ActionEvent event) {
			mniFont();
		}
	});
	formatMenu.add(new AbstractAction(CommonUserAccess.getMniFormatLineColorText()) {
		public void actionPerformed(ActionEvent event) {
			mniLineColor();
		}
	});
	formatMenu.add(new AbstractAction(CommonUserAccess.getMniFormatFillColorText()) {
		public void actionPerformed(ActionEvent event) {
			mniFillColor();
		}
	});

	popupMenu.add(formatMenu);
}
/**
 * Add individual PopupMenu items for this class.
 * @see createPopupMenu()
 */
protected void addSpecialMenu(JPopupMenu popupMenu) {
	// Overwrite for specific adaption
}
/**
 * Add an Specification Entry to a PopupMenu.
 *
 * @see EdgeFigure
 * @see createPopupMenu()
 */
protected void addSpecificationMenu(javax.swing.JPopupMenu popupMenu) {
	popupMenu.add(new AbstractAction(CommonUserAccess.getMniEditChangeWindowText()) {
		public void actionPerformed(ActionEvent event) {
			showSpecification();
		}
	});
}
/**
 * Overwrites because relocation of new Nodes comes after adding the figure to the
 * DrawingView.
 * @see ClassDiagramView.saveNodeInDiagram(..)
 * @see StandardDrawingView.add(Figure)
 * @see CreationTool.mouseDown(..)
 */
public void basicDisplayBox(Point origin, Point corner) {
	super.basicDisplayBox(origin, corner);
	
	if ((LauncherView.getInstance().tool() instanceof CreationTool) || (this instanceof LinkFigure)) {
Tracer.getInstance().hack(this, "basicDisplayBox()", "anchorPoint set afterwards by CreationTool.mouseDown(..)");
		updateCoordinates();
	}
}
/**
 * Overwrites.
 */
protected void basicMoveBy(int dx, int dy) {
    super.basicMoveBy(dx, dy);

    updateCoordinates();
}
/**
 * Overwrites.
 */
public Object getAttribute(String name) {
	if (name.equals(JHotDrawConstants.FONT_NAME)) {
		if ((getNode() != null) && (getNode().getFont() != null)) {
			return getNode().getFont();
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
 * Return the nodes Fill-Color.
 * @see AttributeFigure#getFillColor()
 * @see EdgeFigure
 */
protected java.awt.Color getFillColor() {
	java.awt.Color color = (java.awt.Color)getAttribute(JHotDrawConstants.FILL_COLOR);
	if (color == null) {
		return ch.ehi.umleditor.application.LauncherView.getSettings().getBackgroundColor();
	} else {
		return color;
	}
}
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
 * Return the drawing color for the Frame.
 * @see EdgeFigure
 */
protected java.awt.Color getLineColor() {
	java.awt.Color color = (java.awt.Color)getAttribute(JHotDrawConstants.FRAME_COLOR);
	if (color == null) {
		return ch.ehi.umleditor.application.LauncherView.getSettings().getForegroundColor();
	} else {
		return color;
	}
}
/**
 * Return the ModelElement displayed by this Figure.
 * @return ModelElement
 */
public ModelElement getModelElement() {
	if ((node != null) && (node.iteratorSubject().hasNext())) {
		// must be 1st subject for sure
		return (ModelElement)node.iteratorSubject().next();
	}
	return null;
}
/**
 * Return the Model's presentationElement.
 */
public ch.ehi.umleditor.umlpresentation.PresentationNode getNode() {
	return node;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected void handleException(java.lang.Throwable exception) {
	LauncherView.getInstance().handleException(exception);
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
protected static void handleException(java.lang.Throwable exception, String title, String message, Object source) {
	LauncherView.getInstance().handleException(exception, title, message + " [" + source.toString() + "]");
}
/**
 * Initialize the node.
 */
protected void initialize() {
	super.initialize();

//	setLayouter(new SimpleLayouter(this));
	
	setAttribute(Figure.POPUP_MENU, adaptPopupMenu(new JPopupMenu()));
	setAttribute(JHotDrawConstants.FILL_COLOR, ch.ehi.umleditor.application.LauncherView.getSettings().getBackgroundColor());
	setAttribute(JHotDrawConstants.FRAME_COLOR, ch.ehi.umleditor.application.LauncherView.getSettings().getForegroundColor());
}
/**
 * Suppress visual updates while creating.
 */
protected boolean isCreating() {
	return creating;
}
/**
 * Edit->Copy Action.
 * @see addEditMenu(..)
 */
protected void mniCopy() {
	LauncherView.getInstance().nyi("Copy");
}
/**
 * Edit->Cut Action.
 * @see addEditMenu(..)
 */
protected void mniCut() {
	LauncherView.getInstance().nyi("Cut");
}
/**
 * Figure's FillColor Action.
 */
private void mniFillColor() {
	ColorChooserDialog dialog = new ColorChooserDialog(LauncherView.getInstance(), true);
	if (dialog.isSaved()) {
		setFillColor(dialog.getChosenColor());
//		getClassDiagram().repaint();
	}
}
/**
 * Font-Action.
 * @see addEditMenu(..)
 */
private void mniFont() {
	LauncherView.getInstance().nyi("Font");
}
/**
 * Line-Color Action.
 * @see addEditMenu(..)
 */
private void mniLineColor() {
	ColorChooserDialog dialog = new ColorChooserDialog(LauncherView.getInstance(), true);
	if (dialog.isSaved()) {
		setLineColor(dialog.getChosenColor());
//		getClassDiagram().repaint();
	}
}
/**
 * Edit->Paste Action.
 * @see addEditMenu(..)
 */
protected void mniPaste() {
	LauncherView.getInstance().nyi("Paste");
}
/**
 * Remove the Figure in Model (implies visual deletion).
 * @see ClassDiagramView.saveNode(..)
 * @see removeVisually()
 */
public void removeInModel() {
	try {
		// 1) remove visible part
		removeVisually();

		// 2) remove in Model
		if (getModelElement() != null) {
			ElementFactory.removeElement(getModelElement());
		}
	} catch(Throwable e) {
		handleException(e, REMOVE_IN_MODEL, ch.softenvironment.util.DeveloperException.DEVELOPER_ERROR, this);
	}
}
/**
 * Remove the Figure visually ONLY.
 * Still kept in real model.
 */
public void removeVisually() {
	try {
		// 1) remove drawing
		getClassDiagram().remove(this);

		// 2) remove Node from Model
		if (getClassDiagram().getDiagram().containsPresentationElement(node)) {
			if (node instanceof ch.ehi.umleditor.umlpresentation.Note) {
				node.clearPresentationEdge();
			}
			getClassDiagram().getDiagram().deletePresentationElement(node); //removePresentationElement(node);
		}
	} catch(Throwable e) {
		handleException(e, CommonUserAccess.getMniEditRemoveText(), ch.softenvironment.util.DeveloperException.DEVELOPER_ERROR, this);
	}
}
/**
 * Select the ModelElement of this Figure in NavigationTree.
 */
public void selectInBrowser() {
	LauncherView.getInstance().getPnlNavigation().selectElement(getModelElement());
}
/**
 * Set the classDiagram where this Figure is shown.
 * @see EdgeFigure
 */
protected void setClassDiagram(ClassDiagramView classDiagram) {
	this.classDiagram = classDiagram;
}
/**
 * Suppress visual updates while creating.
 * @see #updateView()
 * @see #removeVisually()
 */
protected void setCreating(boolean creating) {
	this.creating = creating;
	if (!creating) {
		// delay update while creating
		updateView();
	}
}
/**
 * Set the Fill Color.
 * @see EdgeFigure
 * @see setAttribute(..)
 */
protected void setFillColor(java.awt.Color color) {
	setAttribute(JHotDrawConstants.FILL_COLOR, color);
	
	if ((getNode() != null) && (!ColorConverter.isSame(getNode().getBackground(), color))) {
		// prevent ping-pong with MetaModelChange
		getNode().setBackground(ColorConverter.createColor(color));
	}
}
/**
 * Set the Font.
 * @param font (like "family-style-size")
 * @see EdgeFigure
 * @see setAttribute(..)
 */
protected void setFont(String font) {
	setAttribute(JHotDrawConstants.FONT_NAME, font);
	
	if ((getNode() != null) && (!getNode().getFont().equalsIgnoreCase(font))) {
		// prevent ping-pong with MetaModelChange
		getNode().setFont(font);
	}
}
/**
 * Set the Line/Frame Color.
 * @see EdgeFigure
 * @see setAttribute(..)
 */
protected void setLineColor(java.awt.Color color) {
	setAttribute(JHotDrawConstants.FRAME_COLOR, color);
	
	if ((getNode() != null) && (!ColorConverter.isSame(getNode().getForeground(), color))){
		// prevent ping-pong with MetaModelChange
		getNode().setForeground(ColorConverter.createColor(color));
	}
}
/**
 * Set the Model's presentationElement.
 */
public void setNode(ch.ehi.umleditor.umlpresentation.PresentationNode node) {
	this.node = node;
}
/**
 * Show the Specification Dialog of the PresentationElement.
 * @author Peter Hirzel
 */
public void showSpecification() {
	ch.ehi.umleditor.application.LauncherView.getInstance().showSpecification(getModelElement());
}
/**
 * Update Coordinates into node.
 */
public void updateCoordinates() {
	Rectangle rectangle = getPresentationFigure().displayBox();

	node.setEast((int)rectangle.getX());
    node.setSouth((int)rectangle.getY());
    node.setWidth((int)rectangle.getWidth());
    node.setHeight((int)rectangle.getHeight());
}
/**
 * Update Attribute name of ModelElement.
 * @see updateModel()
 */
protected boolean updateName(String newName) {
    if (!newName.equals(getModelElement().getDefLangName())) {
        // prevent Ping-Pong with MetaModelChange-Event
        if (!ElementUtils.trySetName(getModelElement(), newName)) {
	        return false;
        }
    }
    return true;
}
/**
 * ModelElement changed from outside. Therefore a refresh of the View is needed.
 */
public void updateView() {
	// show the saved colors -> should precede setNode(node) !
	if (getNode().getBackground() != null) {
		setFillColor(ColorConverter.createColor(getNode().getBackground()));
	}
	
	if (getNode().getForeground() != null) {
		setLineColor(ColorConverter.createColor(getNode().getForeground()));
	}
}
/**
 * @see BaseFrame#getResourceString(..)
 */
protected static String getResourceString(java.lang.Class resource, String property) {
	return ResourceManager.getInstance().getResource(resource, property);
}
}
