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
import javax.swing.*;
import java.awt.*;
import java.util.*;
import CH.ifa.draw.figures.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.contrib.*;
import ch.ehi.umleditor.application.*;
import ch.ehi.umleditor.umlpresentation.*;

/**
 * A NoteFigure is a graphical representation for an UML-Note
 * in an UML Class Diagram. A Figure separates the graphical
 * representation from the data model. A CommentFigure only allows
 * to write any remarks.
 *
 * A Note is attached only in Diagram and not in Model.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:01 $
 */
public class NoteFigure extends NodeFigure {
	// Composites
	private TextFigure textFigure;
/**
 * Create a new instance of NoteFigure with a RectangleFigure as presentation figure.
 */
public NoteFigure() {
	this(new RectangleFigure());
}
/**
 * Create a new instance of ClassFigure with a given presentation figure
 *
 * @param newPresentationFigure presentation figure
 */
private NoteFigure(Figure newPresentationFigure) {
	super(newPresentationFigure);
}
/**
 * Factory method to create a default popup menu.
 *
 * @return newly created popup menu
 */
public JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	addFormatMenu(popupMenu);
	addEditMenu(popupMenu);

	popupMenu.setLightWeightPopupEnabled(true);
	return popupMenu;
}
/**
 * represent this Figure with an UML-Note Symbol
 */
public void draw(Graphics g) {
	// keep the RectangleFigure transparent
//	getPresentationFigure().setAttribute("FrameColor", Color.white);
	g.setColor((java.awt.Color)getAttribute(JHotDrawConstants.FRAME_COLOR));

	super.draw(g);

	// cut top-right corner
	Rectangle rectangle = displayBox();
	g.drawLine(rectangle.x + rectangle.width - 10, rectangle.y, rectangle.x + rectangle.width - 1, rectangle.y + 9);
}
/**
 * Return default handles on all four edges for this figure.
 */
public Vector handles() {
	Vector handles = new Vector();
	handles.addElement(new NullHandle(this, RelativeLocator.northWest()));
	handles.addElement(new NullHandle(this, RelativeLocator.northEast()));
	handles.addElement(new NullHandle(this, RelativeLocator.southWest()));
	handles.addElement(new NullHandle(this, RelativeLocator.southEast()));

	return handles;
}
/**
 * Hook method called to initizialize a ClassFigure.
 * It is called from the constructors and the clone() method.
 * @see setModelElement()
 */
protected void initialize() {
	// start with an empty Composite
	removeAll();

	// TextFigure containing Info
	textFigure = new TextFigure() {
		public void setText(String newText) {
			super.setText(newText);
			updateName(newText);
			update();
		}
	};
	textFigure.setFont(getFont());

	// add the TextFigure to a Composite
	SeparatorFigure separator = new SeparatorFigure();
	separator.setLineVisible(false);
	GraphicalCompositeFigure infoFigure = new GraphicalCompositeFigure(separator);
	infoFigure.add(textFigure);
	infoFigure.getLayouter().setInsets(new Insets(10, 2, 2, 2));
	add(infoFigure);
/*
	if (getLayouter() != null) {
		// set minimum size
		Rectangle rectangle = displayBox();
		Point corner = new Point((int)rectangle.getLocation().getX() + 100,
							(int)rectangle.getLocation().getY() + 50);
		basicDisplayBox(rectangle.getLocation(), corner);
	}
*/
	super.initialize();
}
/**
 * @see initialize()
 */
protected boolean updateName(String newText) {
	if ((getNode() != null) && (!newText.equals(ElementUtils.mapNlsString(((Note)getNode()).getContent())))) {
        // @see updateModel-> prevent Ping-Pong with MetaModelChange-Event
	    ((Note)getNode()).setContent(new ch.ehi.basics.types.NlsString(((Note)getNode()).getContent(), newText));
	}
	return true;
}
/**
 * ModelElement changed from outside. Therefore a refresh of the View is needed.
 * A NoteFigure can only be deleted within a diagram.
 */
public void updateView() {
	super.updateView();
	textFigure.setText(ElementUtils.mapNlsString(((Note)getNode()).getContent()));
}
}
