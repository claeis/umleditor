/*
 * @(#)MDI_InternalFrame.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.contrib;

import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.*;
import java.awt.*;
import javax.swing.JInternalFrame;

/**
 * This class provides support for JHotDraw applications with multiple
 * document interfaces.
 *
 * @author  Wolfram Kaiser
 * @version <$CURRENT_VERSION$>
 */
public class MDI_InternalFrame extends JInternalFrame {
	private DrawingView internalDrawingView;
	
	/**
	 * Create a new internal frame
	 */
	public MDI_InternalFrame() {
		super();
	}

	/**
	 * Create a new internal frame with a given name
	 *
	 * @param   title       name of the internal frame
	 */
	public MDI_InternalFrame(String title) {
		super(title);
	}

	/**
	 * Create a new internal frame with a given name
	 *
	 * @param   title       name of the internal frame
	 * @param   resizable   true, if the frame is resizable
	 */
	public MDI_InternalFrame(String title, boolean resizable) {
		super(title, resizable);
	}

	/**
	 * Create a new internal frame with a given name
	 *
	 * @param   title       name of the internal frame
	 * @param   resizable   true, if the frame is resizable
	 * @param   closable    true, if the frame is closable
	 */
	public MDI_InternalFrame(String title, boolean resizable, boolean closable) {
		super(title, resizable, closable);
	}

	/**
	 * Create a new internal frame with a given name
	 *
	 * @param   title       name of the internal frame
	 * @param   resizable   true, if the frame is resizable
	 * @param   closable    true, if the frame is closable
	 * @param   maximizable true, if the frame is maximizable
	 */
	public MDI_InternalFrame(String title, boolean resizable, boolean closable, boolean maximizable) {
		super(title, resizable, closable, maximizable);
	}

	/**
	 * Create a new internal frame with a given name
	 *
	 * @param   title       name of the internal frame
	 * @param   resizable   true, if the frame is resizable
	 * @param   closable    true, if the frame is closable
	 * @param   maximizable true, if the frame is maximizable
	 * @param   iconifiable ture, if the frame is iconifiable
	 */
	public MDI_InternalFrame(String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
		super(title, resizable, closable, maximizable, iconifiable);
	}

	/**
	 * Set the drawing view which represents the internal frame
	 *
	 * @param   newInternalDrawingView  drawing view for this internal frame
	 */
	public void setDrawingView(DrawingView newInternalDrawingView) {
		internalDrawingView = newInternalDrawingView;
	}

	/**
	 * Get the drawing view which represents the internal frame
	 *
	 * @param   newInternalDrawingView  drawing view for this internal frame
	 */
	public DrawingView getDrawingView() {
		return internalDrawingView;
	}

	/**
	 * Set the drawing which is represented in the internal frame
	 *
	 * @param	newInternalDrawing	drawing for the internal frame
	 */
	public void setDrawing(Drawing newInternalDrawing) {
		getDrawingView().setDrawing(newInternalDrawing);
	}

	/**
	 * Get the drawing which is represented in the internal frame
	 *
	 * @return	drawing for the internal frame
	 */
	public Drawing getDrawing() {
		return getDrawingView().drawing();
	}

	/**
	 * Searches the DrawingView in the children's component hierarchy.
	 *
	 * @param	newDrawingView	DrawingView to be searched
	 * @param	container		Container which is searched
	 */
	protected DrawingView findDrawingView(DrawingView newDrawingView, Container container) {
		DrawingView oldDrawingView = null;
		Component[] components = container.getComponents();
		for (int i = 0; i < components.length; i++) {
			if (components[i] instanceof DrawingView) {
				return (DrawingView)components[i];
			}
			else if (components[i] instanceof Container) {
				oldDrawingView = findDrawingView(newDrawingView, (Container)components[i]);
				if (oldDrawingView != null) {
					return oldDrawingView;
				}
			}
		}
		return oldDrawingView;
	}
}