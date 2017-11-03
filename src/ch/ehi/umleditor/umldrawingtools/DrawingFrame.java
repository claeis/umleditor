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
import CH.ifa.draw.framework.*;
import CH.ifa.draw.contrib.*;
<<<<<<< HEAD
/**
 * This class represents a JInternalFrame with a JHotDraw drawing area.
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:54 $
 */
public class DrawingFrame extends MDI_InternalFrame implements ch.ehi.uml1_4.changepropagation.MetaModelListener {
/**
 * DrawingFrame constructor comment.
 * @param title java.lang.String
 */
public DrawingFrame() {
	super("(untitled)", true, true, true, true);
}
/**
 * Destroy this Internal Frame.
 */
public void dispose() {
    unregisterListener();	
	super.dispose();
}
/**
 * This function gets called when a change to a metamodel object occured.
 * @see MetaModelListener
 */
public void metaModelChanged(ch.ehi.uml1_4.changepropagation.MetaModelChange event) {
	if (getDrawingView() instanceof ClassDiagramView) {
		ClassDiagramView diagramView = (ClassDiagramView)getDrawingView();
		
		if (diagramView.getParentElement().equals(event.getSource()) && event.getOperation().equals("clearDiagram")) {
			// package of this diagram has been deleted => remove contained diagrams too
			super.dispose(); // unregister of listener done by _unlinkAll()
		}
//		if ((event.getSource() == diagramView.getDiagram()) || (event.getSource() == diagramView.getParentElement())) {
			// 1) update Diagram Title
			setTitle(diagramView.getTitle());
			repaint();
//		} else {
			// 2) update Figures within Diagram
			diagramView.update(event);
//		}
	}
}
/**
 * Register this Frame's drawing for Model changes.
 */
protected void registerListener() {
    if ((getDrawingView() instanceof ClassDiagramView) &&
		    (!ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().containsMetaModelListener(this))) {
		((ClassDiagramView)getDrawingView()).refresh();
		// unregister Listener
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().addMetaModelListener(this);
    }
}
/**
 * Set the drawing view which represents the internal frame
 *
 * @param   newInternalDrawingView  drawing view for this internal frame
 */
public void setDrawingView(DrawingView newInternalDrawingView) {
    super.setDrawingView(newInternalDrawingView);
	
    if (newInternalDrawingView instanceof ClassDiagramView) {
	    setTitle(((ClassDiagramView)newInternalDrawingView).getTitle());
	    // register Listener
		registerListener();
    }
}
/**
 * Unregister this Frame's drawing for Model changes.
 */
protected void unregisterListener() {
    if ((getDrawingView() instanceof ClassDiagramView) &&
		    (ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().containsMetaModelListener(this))) {
		// unregister Listener
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().removeMetaModelListener(this);
    }
}
=======

/**
 * This class represents a JInternalFrame with a JHotDraw drawing area.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:54 $
 */
public class DrawingFrame extends MDI_InternalFrame implements ch.ehi.uml1_4.changepropagation.MetaModelListener {
	
	private static final long serialVersionUID = 6560387221488920990L;

	/**
	 * DrawingFrame constructor comment.
	 * 
	 * @param title
	 *            java.lang.String
	 */
	public DrawingFrame() {
		super("(untitled)", true, true, true, true);
	}

	/**
	 * Destroy this Internal Frame.
	 */
	public void dispose() {
		unregisterListener();
		super.dispose();
	}

	/**
	 * This function gets called when a change to a metamodel object occured.
	 * 
	 * @see MetaModelListener
	 */
	public void metaModelChanged(ch.ehi.uml1_4.changepropagation.MetaModelChange event) {
		if (getDrawingView() instanceof ClassDiagramView) {
			ClassDiagramView diagramView = (ClassDiagramView) getDrawingView();

			if (diagramView.getParentElement().equals(event.getSource())
					&& event.getOperation().equals("clearDiagram")) {
				// package of this diagram has been deleted => remove contained
				// diagrams too
				super.dispose(); // unregister of listener done by _unlinkAll()
			}
			// if ((event.getSource() == diagramView.getDiagram()) ||
			// (event.getSource() == diagramView.getParentElement())) {
			// 1) update Diagram Title
			setTitle(diagramView.getTitle());
			repaint();
			// } else {
			// 2) update Figures within Diagram
			diagramView.update(event);
			// }
		}
	}

	/**
	 * Register this Frame's drawing for Model changes.
	 */
	protected void registerListener() {
		if ((getDrawingView() instanceof ClassDiagramView)
				&& (!ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().containsMetaModelListener(this))) {
			((ClassDiagramView) getDrawingView()).refresh();
			// unregister Listener
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().addMetaModelListener(this);
		}
	}

	/**
	 * Set the drawing view which represents the internal frame
	 *
	 * @param newInternalDrawingView
	 *            drawing view for this internal frame
	 */
	public void setDrawingView(DrawingView newInternalDrawingView) {
		super.setDrawingView(newInternalDrawingView);

		if (newInternalDrawingView instanceof ClassDiagramView) {
			setTitle(((ClassDiagramView) newInternalDrawingView).getTitle());
			// register Listener
			registerListener();
		}
	}

	/**
	 * Unregister this Frame's drawing for Model changes.
	 */
	protected void unregisterListener() {
		if ((getDrawingView() instanceof ClassDiagramView)
				&& (ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().containsMetaModelListener(this))) {
			// unregister Listener
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().removeMetaModelListener(this);
		}
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
