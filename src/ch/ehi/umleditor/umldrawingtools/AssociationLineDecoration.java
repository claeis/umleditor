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
import CH.ifa.draw.figures.*;
import ch.ehi.uml1_4.foundation.datatypes.AggregationKind;

/**
 * An AggregationDecoration decorates (by means draws a diamond) at the end of an Association
 * to represent an UML aggregation between to classes.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:46 $
 */
public class AssociationLineDecoration extends AbstractLineDecoration {
	// Size of the diamond (measured as a diagonal line)
	private int     mySize;

/**
 * Create a new instance of AggregationDecoration with a default
 * diamond size of 21.
 */
public AssociationLineDecoration(int aggregationKind, java.awt.Color lineColor) {
	super();

    setSize(21);
    setBorderColor(lineColor);
    if (aggregationKind == AggregationKind.AGGREGATE) {
		setFillColor(ch.ehi.umleditor.application.LauncherView.getSettings().getBackgroundColor());
    } else {
        // must be COMPOSITE
		setFillColor(lineColor);
    }
}
/**
 * Create a new instance of AggregationDecoration with a default
 * diamond size of 21.
 */
public static AbstractLineDecoration createDecoration(ch.ehi.uml1_4.foundation.core.AssociationEnd associationEnd, java.awt.Color lineColor) {
	int aggregationKind = associationEnd.getAggregation();
	
	if (aggregationKind == AggregationKind.NONE) {
		if (associationEnd.isNavigable()) {
			return getNavigableDecoration(lineColor);
		}
	} else {
		AssociationLineDecoration decoration = new AssociationLineDecoration(aggregationKind, lineColor); 
		if (associationEnd.isNavigable()) {
			// add additional Navigable Arrow
			
		}
		return decoration;
	}
	return null;
}
/**
 * Return Navigation Decoration.
 */
private static ArrowTip getNavigableDecoration(java.awt.Color lineColor) {
	ArrowTip arrowTip = new ArrowTip(0.4, 12.0, 0.0);
    arrowTip.setBorderColor(lineColor);

    return arrowTip;
}
	/**
	 * Return the size of the diamond. The size is measured as diagonal line.
	 *
	 * @return diamond size
	 */
	public int getSize() {
		return mySize;
	}
   /**
	* Calculates the outline of an arrow tip.
	*/
	public Polygon outline(int x1, int y1, int x2, int y2) {
		Polygon shape = new Polygon();

		// calculate direction vector
		double xDir = (double)(x2 - x1);
		double yDir = (double)(y2 - y1);
		
		// calculate direction vector length
		double vLength = Math.sqrt(xDir*xDir + yDir*yDir);
		if (vLength == 0.0) {
			return shape;
		}

		if (xDir == 0.0) {
			xDir = 1.0;
		}

		// normalize direction vector
		xDir = xDir / vLength;
		yDir = yDir / vLength;

		double endX = x1 + xDir * getSize();
		double endY = y1 + yDir * getSize();

		// calculate vector length
		double h = Math.sqrt(getSize());
		
		// calculate orthogonal vector
		double v1y = 1.0;
		double v1x = -(yDir * v1y) / xDir;
		// calculate orthogonal vector length
		double v1Length = Math.sqrt(v1x*v1x + v1y*v1y);
		// normalize orthogonal vector
		v1y = v1y / v1Length;
		v1x = v1x / v1Length;
		double p1y = (endY + y1)/2 + v1y * h;
		double p1x = (endX + x1)/2 + v1x * h;
		double p2y = (endY + y1)/2 - v1y * h;
		double p2x = (endX + x1)/2 - v1x * h;

		shape.addPoint(x1, y1);

		shape.addPoint((int)p1x, (int)p1y);
		shape.addPoint((int)endX, (int)endY);
		shape.addPoint((int)p2x, (int)p2y);
				
		shape.addPoint(x1, y1);
		
		return shape;

	}
	/**
	 * Set the size of the diamond. The size is measured as diagonal line.
	 *
	 * @param newSize size of the diamond
	 */
	public void setSize(int newSize) {
		mySize = newSize;
	}
}
