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

/**
 * A SeparatorFigure is similar to a LineFigure
 * but draws only a horizontal line and separates
 * from other figures beneath in addition.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2003-12-30 22:07:47 $
 */
class SeparatorFigure extends LineFigure {
private boolean lineVisible = true;

//	static final long serialVersionUID = 7110919055213080660L;

/**
 * Create a new SeparatorFigure
 */
public SeparatorFigure() {
								super();
}
/**
 * Draw the separation line and to hold some space free
 */
public void draw(Graphics g) {
								if (lineVisible) {
																g.setColor(getFrameColor());
																g.drawLine(startPoint().x, startPoint().y, endPoint().x - 1, startPoint().y);
								}
}
/**
 * Set whether line shall be drawn visible or invisible.
 */
public void setLineVisible(boolean visible) {
								lineVisible = visible;
}
}
