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
/**
 * Constants used by JHotDraw but not yet defined by JHotDraw.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:56 $
 * @see ColorMap
 * @see AttributeFigure.drawFrame(Graphics)
 * @see TextFigure.getAttribute(String)
 * @see AttributeFigure.getFrame/FillColor()
 */
public abstract class JHotDrawConstants {
	// @see ColorMap
	public final static String TRANSPARENT_COLOR = "None";
	// @see AttributeFigure.drawFrame(Graphics)
	public final static String TEXT_COLOR = "TextColor";
	// @see TextFigure.getAttribute(String)
//	public final static String FONT_SIZE = "FontSize";
//	public final static String FONT_STYLE = "FontStyle";
	public final static String FONT_NAME = "FontName";
	// @see AttributeFigure.getFrame/FillColor()
	public final static String FILL_COLOR = "FillColor";
	public final static String FRAME_COLOR = "FrameColor";

	// Tool-Commands
	public final static String DELECTE_COMMAND = "Delete";
}
