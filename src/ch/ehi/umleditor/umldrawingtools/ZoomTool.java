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
 * ZoomTool for separating Zoom-Out/in functions.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:04 $
 */
public class ZoomTool extends CH.ifa.draw.standard.AbstractTool {
	private double zoomFactor = 1.2;
	private boolean zoomIn = false;
/**
 * ZoomTool constructor comment.
 * @param editor CH.ifa.draw.framework.DrawingEditor
 * @param out true->zoomOut; false->zoomIn
 */
public ZoomTool(CH.ifa.draw.framework.DrawingEditor editor, boolean zoomIn) {
	super(editor);
	this.zoomIn = zoomIn;
}
/**
 * ZoomTool constructor comment.
 * @param editor CH.ifa.draw.framework.DrawingEditor
 * @param out true->zoomOut; false->zoomIn
 * @param zoomFactor scaling Factor to be used by ZoomTool
 */
public ZoomTool(CH.ifa.draw.framework.DrawingEditor editor, boolean zoomIn, double zoomFactor) {
	this(editor, zoomIn);
	this.zoomFactor = zoomFactor;
}
/**
 * Overwrites.
 */
public void activate() {
	super.activate();

	if (zoomIn) {
   		((ClassDiagramView)view()).deZoom(zoomFactor, 0, 0);
	} else {
  		((ClassDiagramView)view()).zoomOut(zoomFactor, 0, 0);
	}
	ch.ehi.umleditor.application.LauncherView.getInstance().toolDone();
}
}
