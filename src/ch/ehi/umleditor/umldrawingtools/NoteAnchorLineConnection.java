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
import ch.ehi.uml1_4.foundation.core.*;
import ch.softenvironment.util.*;
import java.awt.Graphics;
import CH.ifa.draw.framework.Figure;
import ch.ehi.umleditor.application.*;
import ch.softenvironment.view.*;

/**
 * Draw an anchor line from a Note to any Figure.
 * A Note anchor line is drawn dotted.
 * 
 * @author Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.6 $ $Date: 2007-03-12 18:30:46 $
 */
public class NoteAnchorLineConnection extends EdgeFigure {
	private static java.util.ResourceBundle resNoteAnchorLineConnection = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/umldrawingtools/resources/NoteAnchorLineConnection");  //$NON-NLS-1$
	
/**
 * Used to create new Note-line by UML-Tool.
 */
public NoteAnchorLineConnection() {
    super();
}
/**
 * Used at reopening of ClassDiagram's containing a Note-line.
 */
public NoteAnchorLineConnection(ClassDiagramView classDiagram, PresentationEdge edge) {
	super(classDiagram);
    setLineColor(determineForegroundColor(edge));	// must precede edge-setting
    this.edge = edge;
}
/**
 * Factory method to create a popup menu.
 * Overwrites
 *
 * @return newly created popup menu
 */
public javax.swing.JPopupMenu adaptPopupMenu(javax.swing.JPopupMenu popupMenu) {
	addFormatMenu(popupMenu);
	addEditMenu(popupMenu);
	
	popupMenu.setLightWeightPopupEnabled(true);
	return popupMenu;
}
/**
 * Add individual PopupMenu items for this class.
 * @see NodeFigure
 * @see createPopupMenu()
 */
protected void addSpecialMenu(javax.swing.JPopupMenu popupMenu) {}
/**
 * Tests whether the two figures may be connected.
 * Overwrites.
 *
 * @param start figure representing the start/client class which is dependend on the end class
 * @param end   figure representing the end/supplier class
 */
public boolean canConnect(Figure start, Figure end) {
	if (!((start instanceof NoteFigure) || (end instanceof NoteFigure))) {
		shouldWarn(resNoteAnchorLineConnection.getString("CWNoteNeeded")); //$NON-NLS-1$
		return false;
	} 
	if (!((start instanceof NodeFigure) && (end instanceof NodeFigure))) {
		shouldWarn(resNoteAnchorLineConnection.getString("CWNodeType")); //$NON-NLS-1$
		return false;
	}

	return true;
}
/**
 * Overwrites.
 */
protected void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
    drawNoteLine(g, x1, y1, x2, y2);
}
/**
 * Draw the line which is a dotted line for a Note Anchor connection in UML. Instead
 * of drawing one line from start point to end point, the line is divided into
 * several small lines each 2 pixels long and 5 pixels away from the previous
 * line. Some minor inaccuracy are possible due to rounding errors or incomplete
 * last lines.
 *
 * @param g  graphics context into which the line is drawn
 * @param x1 start x point
 * @param y1 start y point
 * @param x2 end x point
 * @param y2 end y point
 */
protected static void drawNoteLine(Graphics g, int x1, int y1, int x2, int y2) {
    int xDistance = x2 - x1;
    int yDistance = y2 - y1;
    double direction = Math.PI / 2 - Math.atan2(xDistance, yDistance);

    double xAngle = Math.cos(direction);
    double yAngle = Math.sin(direction);
    int lineLength = (int) Math.sqrt(xDistance * xDistance + yDistance * yDistance);

    for (int i = 0; i + 5 < lineLength; i = i + 7) {
        int p1x = x1 + (int) (i * xAngle);
        int p1y = y1 + (int) (i * yAngle);
        int p2x = x1 + (int) ((i + 2) * xAngle);
        int p2y = y1 + (int) ((i + 2) * yAngle);
        g.drawLine(p1x, p1y, p2x, p2y);
    }
}
/**
 * Return the ending Element of the Relationship which might be a:
 *   - NoteFigure
 *   - ClassFigure
 *   - PackageFigure
 *   - any other in principle
 * @return Element
 */
protected Element getEndElement() {
	java.util.Iterator iterator = getEdge().iteratorEndpoint();
	if (iterator.hasNext()) {
		iterator.next();	// skip Note
		if (iterator.hasNext()) {
			return (Element)iterator.next();
		}
	}

	return null;
}
/**
 * Return the starting Element of the Relationship, which is always
 * a NoteFigure in this case.
 * @see handleConnect(..) => (might reverse order)
 * @return Element
 */
protected Element getStartElement() {
	java.util.Iterator iteratorNote = getEdge().iteratorEndpoint();
	if (iteratorNote.hasNext()) {
		return (Element)iteratorNote.next();
	} else {
		return null;
	}
}
/**
 * Add NoteAnchorLines to Diagram only (not in Model)
 *
 * @param start figure representing the start Node (always NoteFigure)
 * @param end   figure representing the end Node
 * @see canConnect(..)
 * @see removeInModel()
 */
protected void handleConnect(Figure start, Figure end) {
	try {
		if (getEdge() == null) {
			NodeFigure child = (NodeFigure)start;
//			NodeFigure parent = (NodeFigure)end;

			// Def.: start must always be the NoteFigure
			if (child instanceof NoteFigure) {
				setEdge(new NoteEdge(), start, end);
			} else {
				// @see canConnect(Figure, Figure)
				setEdge(new NoteEdge(), end, start);
			}
			
			// keep references in Diagram only
			setToolView();
	    	getClassDiagram().getDiagram().addPresentationElement(getEdge());
		} // else NoteAnchorLine was dragged
	} catch(Throwable e) {
	    BaseDialog.showError(LauncherView.getInstance(), CREATION_ERROR, resNoteAnchorLineConnection.getString("CENoteNotConnected"), e); //$NON-NLS-1$
	}
}
/**
 * Show Warning message because Relationship is illegal between current start and end Figure.
 * @see shouldWarn(EdgeFigure, String)
 */
protected void showIllegalRelationship(java.lang.String warning) {
    BaseDialog.showWarning((java.awt.Component)LauncherView.getInstance(),
					resNoteAnchorLineConnection.getString("CWConnectionNotEstablished"), //$NON-NLS-1$
					warning);
}
/**
 * Show the Specification Dialog of the PresentationElement.
 * @author Peter Hirzel
 */
public final void showSpecification() {
	throw new DeveloperException("no Dialog assumed");
}
}
