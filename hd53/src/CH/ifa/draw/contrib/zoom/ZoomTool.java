/*
 * File:   ZoomTool.java
 * Author: Andre Spiegel <spiegel@inf.fu-berlin.de>
 *
 * $Id: ZoomTool.java,v 1.1.1.1 2003-12-23 10:23:26 ceis Exp $
 */

package CH.ifa.draw.contrib.zoom;

import CH.ifa.draw.framework.DrawingEditor;
import CH.ifa.draw.framework.Tool;
import CH.ifa.draw.standard.AbstractTool;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

public class ZoomTool extends AbstractTool {

	private Tool child;

	public ZoomTool(DrawingEditor editor) {
		super(editor);
	}

	public void mouseDown(MouseEvent e, int x, int y) {
		if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
			if (child != null)
				return;
			view().freezeView();
			child = new ZoomAreaTracker(editor());
			child.mouseDown(e, x, y);
		} else if ((e.getModifiers() & InputEvent.BUTTON2_MASK) != 0) {
			((ZoomDrawingView) view()).deZoom(x, y);
		} else if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
			((ZoomDrawingView) view()).zoomOut(x, y);
		}
	}

	public void mouseDrag(MouseEvent e, int x, int y) {
		if (child != null)
			child.mouseDrag(e, x, y);
	}

	public void mouseUp(MouseEvent e, int x, int y) {
		if (child != null) {
			view().unfreezeView();
			child.mouseUp(e, x, y);
		}
		child = null;
	}

}
