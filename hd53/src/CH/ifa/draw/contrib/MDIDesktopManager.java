/*
 * @(#)MDIDesktopPane.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.contrib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

/**
 * Private class used to replace the standard DesktopManager for JDesktopPane.
 * Used to provide scrollbar functionality.
 */
class MDIDesktopManager extends DefaultDesktopManager {
	private MDIDesktopPane desktop;

	public MDIDesktopManager(MDIDesktopPane desktop) {
		this.desktop = desktop;
	}

	public void endResizingFrame(JComponent f) {
		super.endResizingFrame(f);
		resizeDesktop();
	}

	public void endDraggingFrame(JComponent f) {
		super.endDraggingFrame(f);
		resizeDesktop();
	}

	public void setNormalSize() {
		JScrollPane scrollPane = getScrollPane();
		int x = 0;
		int y = 0;
		Insets scrollInsets = getScrollPaneInsets();

		if (scrollPane != null) {
			Dimension d = scrollPane.getVisibleRect().getSize();
			if (scrollPane.getBorder() != null) {
			   d.setSize(d.getWidth() - scrollInsets.left - scrollInsets.right,
						 d.getHeight() - scrollInsets.top - scrollInsets.bottom);
			}

			d.setSize(d.getWidth() - 20, d.getHeight() - 20);
			desktop.setAllSize(d);
			scrollPane.invalidate();
			scrollPane.validate();
		}
	}

	private Insets getScrollPaneInsets() {
		JScrollPane scrollPane = getScrollPane();
		if ((scrollPane == null) || 
				(getScrollPane().getBorder() == null)) { // BUG FIX (Motif seems to have no border): Peter Hirzel 
			return new Insets(0, 0, 0, 0);
		}
		else return getScrollPane().getBorder().getBorderInsets(scrollPane);
	}

	public JScrollPane getScrollPane() {
		if (desktop.getParent() instanceof JViewport) {
			JViewport viewPort = (JViewport)desktop.getParent();
			if (viewPort.getParent() instanceof JScrollPane)
				return (JScrollPane)viewPort.getParent();
		}
		return null;
	}

	protected void resizeDesktop() {
		int x = 0;
		int y = 0;
		JScrollPane scrollPane = getScrollPane();
		Insets scrollInsets = getScrollPaneInsets();

		if (scrollPane != null) {
			JInternalFrame allFrames[] = desktop.getAllFrames();
			for (int i = 0; i < allFrames.length; i++) {
				if (allFrames[i].getX() + allFrames[i].getWidth() > x) {
					x = allFrames[i].getX() + allFrames[i].getWidth();
				}
				if (allFrames[i].getY() + allFrames[i].getHeight() > y) {
					y = allFrames[i].getY() + allFrames[i].getHeight();
				}
			}
			Dimension d=scrollPane.getVisibleRect().getSize();
			if (scrollPane.getBorder() != null) {
			   d.setSize(d.getWidth() - scrollInsets.left - scrollInsets.right,
						 d.getHeight() - scrollInsets.top - scrollInsets.bottom);
			}

			if (x <= d.getWidth()) {
				x = ((int)d.getWidth()) - 20;
			}
			if (y <= d.getHeight()) {
				y = ((int)d.getHeight()) - 20;
			}
			desktop.setAllSize(x,y);
			scrollPane.invalidate();
			scrollPane.validate();
		}
	}
}
