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

<<<<<<< HEAD

/**
 * An AssociationAttributeFigure is a graphical representation for the
 * Attributes of an Association.
 * This Figure looks like a Class Figure but the name and Attributes correspond to the
 * Association values. A dotted line Connection between LinkNode of an Associaten
 * and the AttributeFigure will be drawn.
 *
 * This figure will automatically be showed or hided, depending whether Association has Features
 * or not.
 *
 * @author Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.3 $ $Date: 2005-09-16 09:50:06 $
 */
class AssociationAttributeFigure extends ClassFigure {
	private LinkFigure linkFigure = null;
	private boolean linkNodeVisible = true;
/**
 * Create a new instance of ClassFigure with a RectangleFigure as presentation figure
 */
public AssociationAttributeFigure(LinkFigure linkFigure, ClassDiagramView view, boolean linkNodeVisible) {
    super();
    this.linkFigure = linkFigure;
    setClassDiagram(view);
    this.linkNodeVisible = linkNodeVisible;
}
/**
 * Overwrites.
 * Connect Association-Attributes with a dashed line to LinkDiamond.
 */
public void draw(Graphics g) {
//	g.setColor(getLineColor());

	ch.ehi.umleditor.umlpresentation.PresentationAssocClass linkNode = (ch.ehi.umleditor.umlpresentation.PresentationAssocClass)getNode();
	
	//	Draw Link-Shape
	Rectangle rectangleAttributeFigure = displayBox();
	if (!((rectangleAttributeFigure.x == (int)linkNode.getClassAngle()) && (rectangleAttributeFigure.y == (int)linkNode.getClassRadius()))) {
//Tracer.getInstance().debug("draw->moveBy: ClassAngle(x=)="+linkNode.getClassAngle() + " ClassRadius(y)="+linkNode.getClassRadius());
		moveBy((int)linkNode.getClassAngle() - rectangleAttributeFigure.x, (int)linkNode.getClassRadius() - rectangleAttributeFigure.y);
		rectangleAttributeFigure = displayBox();
	}
	Rectangle rectangleLinkFigure = linkFigure.displayBox();
	
	// draw the dashed line from AttributeFigure to LinkNode
	if (linkNodeVisible) {
		int diamondCenter = linkFigure.getDiamondSize() / 2;
		
		drawLine(g, (int)linkNode.getClassAngle() + 25 /*empirical offset*/, (int)linkNode.getClassRadius(), 
				(int)linkNode.getEast() + diamondCenter, (int)linkNode.getSouth() + diamondCenter);
	}
	
	super.draw(g);
}
/**
 * Draw the line which is a dotted line.
 * Some minor inaccuracy are possible due to rounding errors or incomplete
 * last lines.
 *
 * @param g  graphics context into which the line is drawn
 * @param x1 start x point
 * @param y1 start y point
 * @param x2 end x point
 * @param y2 end y point
 */
private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
    int xDistance = x2 - x1;
    int yDistance = y2 - y1;
    double direction = Math.PI / 2 - Math.atan2(xDistance, yDistance);

    double xAngle = Math.cos(direction);
    double yAngle = Math.sin(direction);
    int lineLength = (int) Math.sqrt(xDistance * xDistance + yDistance * yDistance);

    for (int i = 0; i + 5 < lineLength; i = i + 10) {
        int p1x = x1 + (int) (i * xAngle);
        int p1y = y1 + (int) (i * yAngle);
        int p2x = x1 + (int) ((i + 5) * xAngle);
        int p2y = y1 + (int) ((i + 5) * yAngle);
        g.drawLine(p1x, p1y, p2x, p2y);
    }
}
/**
 * Overwrites.
 * @return ModelElement
 */
public ModelElement getModelElement() {
	if (linkFigure != null) {
		return linkFigure.getModelElement();
	}
	return null;
}
/**
 * Overwrites.
 */
public ch.ehi.umleditor.umlpresentation.PresentationNode getNode() {
	return linkFigure == null ? null : linkFigure.getNode();
}
/**
 * Overwrites.
 * This figure is removed by its responsible.
 * @see LinkFigure#removeVisually()
 */
public final void removeVisually() {
	linkFigure.removeVisually();
}
/**
 * Overwrites.
 * Coordinates are kept in polar System.
 */
public void updateCoordinates() {
	ch.ehi.umleditor.umlpresentation.PresentationAssocClass linkNode = (ch.ehi.umleditor.umlpresentation.PresentationAssocClass)linkFigure.getNode();
	Rectangle rectangle = getPresentationFigure().displayBox();

//TODO NYI: use Polar coordinates instead
	linkNode.setClassAngle(rectangle.getX());
    linkNode.setClassRadius(rectangle.getY());

//Tracer.getInstance().debug("UpdateCoordinates: ClassAngle(x="+rectangle.getX()+")="+linkNode.getClassAngle() + " ClassRadius(y"+rectangle.getY()+")="+linkNode.getClassRadius());
	linkNode.setWidth((int)rectangle.getWidth());
	linkNode.setHeight((int)rectangle.getHeight());
}
=======
/**
 * An AssociationAttributeFigure is a graphical representation for the
 * Attributes of an Association. This Figure looks like a Class Figure but the
 * name and Attributes correspond to the Association values. A dotted line
 * Connection between LinkNode of an Associaten and the AttributeFigure will be
 * drawn.
 *
 * This figure will automatically be showed or hided, depending whether
 * Association has Features or not.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.3 $ $Date: 2005-09-16 09:50:06 $
 */
class AssociationAttributeFigure extends ClassFigure {
	
	private static final long serialVersionUID = 7959822419713745249L;
	private LinkFigure linkFigure = null;
	private boolean linkNodeVisible = true;

	/**
	 * Create a new instance of ClassFigure with a RectangleFigure as
	 * presentation figure
	 */
	public AssociationAttributeFigure(LinkFigure linkFigure, ClassDiagramView view, boolean linkNodeVisible) {
		super();
		this.linkFigure = linkFigure;
		setClassDiagram(view);
		this.linkNodeVisible = linkNodeVisible;
	}

	/**
	 * Overwrites. Connect Association-Attributes with a dashed line to
	 * LinkDiamond.
	 */
	public void draw(Graphics g) {
		// g.setColor(getLineColor());

		ch.ehi.umleditor.umlpresentation.PresentationAssocClass linkNode = (ch.ehi.umleditor.umlpresentation.PresentationAssocClass) getNode();

		// Draw Link-Shape
		Rectangle rectangleAttributeFigure = displayBox();
		if (!((rectangleAttributeFigure.x == (int) linkNode.getClassAngle())
				&& (rectangleAttributeFigure.y == (int) linkNode.getClassRadius()))) {
			// Tracer.getInstance().debug("draw->moveBy:
			// ClassAngle(x=)="+linkNode.getClassAngle() + "
			// ClassRadius(y)="+linkNode.getClassRadius());
			moveBy((int) linkNode.getClassAngle() - rectangleAttributeFigure.x,
					(int) linkNode.getClassRadius() - rectangleAttributeFigure.y);
			rectangleAttributeFigure = displayBox();
		}
		Rectangle rectangleLinkFigure = linkFigure.displayBox();

		// draw the dashed line from AttributeFigure to LinkNode
		if (linkNodeVisible) {
			int diamondCenter = linkFigure.getDiamondSize() / 2;

			drawLine(g,
					(int) linkNode.getClassAngle() + 25 /* empirical offset */, (int) linkNode.getClassRadius(),
					(int) linkNode.getEast() + diamondCenter, (int) linkNode.getSouth() + diamondCenter);
		}

		super.draw(g);
	}

	/**
	 * Draw the line which is a dotted line. Some minor inaccuracy are possible
	 * due to rounding errors or incomplete last lines.
	 *
	 * @param g
	 *            graphics context into which the line is drawn
	 * @param x1
	 *            start x point
	 * @param y1
	 *            start y point
	 * @param x2
	 *            end x point
	 * @param y2
	 *            end y point
	 */
	private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
		int xDistance = x2 - x1;
		int yDistance = y2 - y1;
		double direction = Math.PI / 2 - Math.atan2(xDistance, yDistance);

		double xAngle = Math.cos(direction);
		double yAngle = Math.sin(direction);
		int lineLength = (int) Math.sqrt(xDistance * xDistance + yDistance * yDistance);

		for (int i = 0; i + 5 < lineLength; i = i + 10) {
			int p1x = x1 + (int) (i * xAngle);
			int p1y = y1 + (int) (i * yAngle);
			int p2x = x1 + (int) ((i + 5) * xAngle);
			int p2y = y1 + (int) ((i + 5) * yAngle);
			g.drawLine(p1x, p1y, p2x, p2y);
		}
	}

	/**
	 * Overwrites.
	 * 
	 * @return ModelElement
	 */
	public ModelElement getModelElement() {
		if (linkFigure != null) {
			return linkFigure.getModelElement();
		}
		return null;
	}

	/**
	 * Overwrites.
	 */
	public ch.ehi.umleditor.umlpresentation.PresentationNode getNode() {
		return linkFigure == null ? null : linkFigure.getNode();
	}

	/**
	 * Overwrites. This figure is removed by its responsible.
	 * 
	 * @see LinkFigure#removeVisually()
	 */
	public final void removeVisually() {
		linkFigure.removeVisually();
	}

	/**
	 * Overwrites. Coordinates are kept in polar System.
	 */
	public void updateCoordinates() {
		ch.ehi.umleditor.umlpresentation.PresentationAssocClass linkNode = (ch.ehi.umleditor.umlpresentation.PresentationAssocClass) linkFigure
				.getNode();
		Rectangle rectangle = getPresentationFigure().displayBox();

		// TODO NYI: use Polar coordinates instead
		linkNode.setClassAngle(rectangle.getX());
		linkNode.setClassRadius(rectangle.getY());

		// Tracer.getInstance().debug("UpdateCoordinates:
		// ClassAngle(x="+rectangle.getX()+")="+linkNode.getClassAngle() + "
		// ClassRadius(y"+rectangle.getY()+")="+linkNode.getClassRadius());
		linkNode.setWidth((int) rectangle.getWidth());
		linkNode.setHeight((int) rectangle.getHeight());
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
