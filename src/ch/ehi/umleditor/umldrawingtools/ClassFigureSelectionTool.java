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
 * Special tool to create a recursive Association (from a selected class to
 * itself).
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:51 $
 */
public class ClassFigureSelectionTool extends CH.ifa.draw.contrib.CustomSelectionTool {
	/**
	 * ClassFigureSelectionTool constructor comment.
	 * 
	 * @param editor
	 *            CH.ifa.draw.framework.DrawingEditor
	 */
	public ClassFigureSelectionTool(CH.ifa.draw.framework.DrawingEditor editor) {
		super(editor);
	}

	/**
	 * Overwrites.
	 */
	protected void handleMouseClick(java.awt.event.MouseEvent e, int x, int y) {
		ClassFigure classFigure = ((ClassDiagramView) view()).findClassFigure(x, y);
		if (classFigure != null) {
			new AssociationLineConnection(classFigure);
			ch.ehi.umleditor.application.LauncherView.getInstance().toolDone();
		}
	}
}
