/*
 * File:   ZoomDrawingView.java
 * Author: Andre Spiegel <spiegel@inf.fu-berlin.de>
 *
 * $Id: ZoomDrawingView.java,v 1.1.1.1 2003-12-23 10:23:25 ceis Exp $
 */

package CH.ifa.draw.contrib.zoom;

import CH.ifa.draw.framework.Drawing;
import CH.ifa.draw.framework.DrawingChangeEvent;
import CH.ifa.draw.framework.DrawingEditor;
import CH.ifa.draw.framework.FigureEnumeration;
import CH.ifa.draw.standard.SimpleUpdateStrategy;
import CH.ifa.draw.standard.StandardDrawing;
import CH.ifa.draw.standard.StandardDrawingView;
import CH.ifa.draw.util.Geom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

/**
 * A view that can display drawings at an arbitrary scale.
 */
public class ZoomDrawingView extends CH.ifa.draw.standard.StandardDrawingView {

	private double scale = 1.0;

	private Rectangle damagedArea = null;

	public ZoomDrawingView(DrawingEditor editor) {
		this(editor, MINIMUM_WIDTH, MINIMUM_HEIGHT);
	}

	public ZoomDrawingView(DrawingEditor editor, int width, int height) {
		super(editor, width, height);
		setDisplayUpdate(new SimpleUpdateStrategy());
		addKeyListener(createKeyListener());
	}

	/**
	 * @return The current zoom scale of this view.  The dimensions of
	 *         figures are multiplied by this number before display.
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * Sets a new zoom scale for this view.  The dimensions of figures
	 * are multiplied by this number before display.
	 */
	public void setScale(double scale) {
		Dimension oldSize = getUserSize();
		this.scale = scale;
		setUserSize(oldSize.width, oldSize.height);
		centralize(drawing());
		forceRedraw();
	}

	private void forceRedraw() {
		drawingInvalidated(new DrawingChangeEvent
				(drawing(), new Rectangle(getSize())));
		repairDamage();
	}

	/**
	 * Sets the size of this view in user coordinates.  The size of the view
	 * on the screen will be this size, multiplied by the current scale.
	 */
	public void setUserSize(int width, int height) {
		setSize((int) (width * scale),
				(int) (height * scale));
	}

	/**
	 * Sets the size of this view in user coordinates.  The size of the view
	 * on the screen will be this size, multiplied by the current scale.
	 */
	public void setUserSize(Dimension d) {
		setUserSize(d.width, d.height);
	}

	/**
	 * @return the size of this view, in screen coordinates
	 */
	public Dimension getSize() {
		return super.getSize();
	}

	/**
	 * @return The size of this view, in user coordinates.  The size
	 *         on the screen is this size, multiplied by the current scale.
	 */
	public Dimension getUserSize() {
		Dimension screenSize = getSize();
		return new Dimension((int) (screenSize.width / scale),
				(int) (screenSize.height / scale));
	}

	/**
	 * Readjusts this view and its containing ScrollPane to display the
	 * given rectangle, which is given in user coordinates.  This method
	 * only works if this view is contained in a JViewport.  It throws
	 * a RuntimeException otherwise.
	 */
	public void zoom(int x, int y, int width, int height) {
		if (getParent() instanceof javax.swing.JViewport) {
			JViewport viewport = (JViewport) getParent();
			Dimension viewportSize = viewport.getSize();
			Dimension userSize = getUserSize();
			double xScale = (double) viewportSize.width / (double) width;
			double yScale = (double) viewportSize.height / (double) height;
			double newScale = Math.min(xScale, yScale);
			this.scale = newScale;
			setUserSize(userSize);
			revalidate();
			viewport.setViewPosition(new Point((int) (x * scale),
					(int) (y * scale)));
			forceRedraw();
		} else
			throw new RuntimeException
					("zooming only works if this view is contained in a ScrollPane");
	}

	/**
	 * Zooms out by a factor of two, keeping point (x,y), which is given
	 * in user coordinates, in the center.
	 */
	public void zoomOut(int x, int y) {
		if (getParent() instanceof javax.swing.JViewport) {
			JViewport viewport = (JViewport) getParent();
			Dimension viewportSize = viewport.getSize();
			Dimension userSize = getUserSize();
			this.scale = this.scale / 2.0;
			int xScreen = (int) (x * scale);
			int yScreen = (int) (y * scale);
			int xOrigin = xScreen - viewportSize.width / 2;
			int yOrigin = yScreen - viewportSize.height / 2;
			if (xOrigin < 0) xOrigin = 0;
			if (yOrigin < 0) yOrigin = 0;
			setUserSize(userSize);
			revalidate();
			viewport.setViewPosition(new Point(xOrigin, yOrigin));
			forceRedraw();
		} else
			throw new RuntimeException
					("zooming only works if this view is contained in a ScrollPane");
	}

	/**
	 * Sets the zoom scale to 1.0 and adjusts the scroll pane
	 * so that point (x, y) is in the center.
	 */
	public void deZoom(int x, int y) {
		if (getParent() instanceof javax.swing.JViewport) {
			JViewport viewport = (JViewport) getParent();
			Dimension viewportSize = viewport.getSize();
			Dimension userSize = getUserSize();
			int xOrigin = x - viewportSize.width / 2;
			int yOrigin = y - viewportSize.height / 2;
			if (xOrigin < 0) xOrigin = 0;
			if (yOrigin < 0) yOrigin = 0;
			this.scale = 1.0;
			setUserSize(userSize);
			revalidate();
			viewport.setViewPosition(new Point((int) (xOrigin),
					(int) (yOrigin)));
			forceRedraw();
		} else
			throw new RuntimeException
					("zooming only works if this view is contained in a ScrollPane");
	}
        private boolean isPrinting=false;
	public void print(Graphics g) {
          isPrinting=true;
          super.print(g);
          isPrinting=false;
        }
	public void paint(Graphics g) {
		if (this.scale != 1.0 && !isPrinting) {
			Graphics2D g2 = (Graphics2D) g;
			// Don't use setTransform() here because that would destroy
			// any transformation that Swing sets for partial redrawing.
			// Simply add our own transformation to any existing one.
			g2.transform(AffineTransform.getScaleInstance(scale, scale));
		}
		super.paint(g);
	}

	public Graphics getGraphics() {
		Graphics g = super.getGraphics();
		if (this.scale != 1.0) {
			Graphics2D g2 = (Graphics2D) g;
			g2.transform(AffineTransform.getScaleInstance(scale, scale));
		}
		return g;
	}


	/**
	 * Constrain to user coordinates, not screen coordinates.
	 */
	protected Point constrainPoint(Point p) {
		Dimension size = getSize();
		p.x = Geom.range(1, (int) (size.width / scale), p.x);
		p.y = Geom.range(1, (int) (size.height / scale), p.y);
		if (getConstrainer() != null)
			return getConstrainer().constrainPoint(p);
		return p;
	}

	public void drawBackground(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0,
				(int) (getBounds().width / scale),
				(int) (getBounds().height / scale));
	}

	private void centralize(Drawing d, Dimension bounds) {
		Point boundsCenter = new Point(bounds.width / 2, bounds.height / 2);
		Rectangle r = ((StandardDrawing) d).displayBox();
		Point drawingCenter = new Point(r.x + r.width / 2, r.y + r.height / 2);
		int diffX = boundsCenter.x - drawingCenter.x;
		int diffY = boundsCenter.y - drawingCenter.y;
		if (diffX != 0 || diffY != 0) {
			for (FigureEnumeration k = d.figures(); k.hasMoreElements();) {
				k.nextFigure().moveBy(diffX, diffY);
			}
		}
	}

	private void centralize(Drawing d) {
		centralize(d, getUserSize());
	}

	public void setDrawing(Drawing d) {
		super.setDrawing(d);

		Rectangle r = ((StandardDrawing) d).displayBox();
		Dimension drawingSize = new Dimension(r.width, r.height);
		Dimension viewportSize = new Dimension(r.width, r.height);
		if (getParent() != null) {
			viewportSize = ((JViewport) getParent()).getSize();
		}
		Dimension userSize = new Dimension(viewportSize);
		this.scale = 1.0;

		while (drawingSize.width > userSize.width ||
				drawingSize.height > userSize.height) {
			this.scale = this.scale / 2.0;
			userSize.width = userSize.width * 2;
			userSize.height = userSize.height * 2;
		}
		centralize(d, userSize);
		super.setPreferredSize(viewportSize);
		super.setSize(viewportSize);
		revalidate();
	}

	public Dimension getMinimumSize() {
		return super.getSize();
	}

	public Dimension getPreferredSize() {
		return getMinimumSize();
	}

	/**
	 * Overridden to scale damage to screen coordinates.
	 */
	public void repairDamage() {
		if (damagedArea != null) {
			repaint((int) (damagedArea.x * scale),
					(int) (damagedArea.y * scale),
					(int) (damagedArea.width * scale),
					(int) (damagedArea.height * scale));
			damagedArea = null;
		}
	}

	/**
	 * Overridden to accumulate damage in an instance variable of this class.
	 */
	public void drawingInvalidated(DrawingChangeEvent e) {
		Rectangle r = e.getInvalidatedRectangle();
		if (damagedArea == null)
			damagedArea = r;
		else
			damagedArea.add(r);
	}

	/**
	 * @return a new MouseEvent, the coordinates of which are transformed
	 *         to compensate for the current zoom factor
	 */
	private MouseEvent createScaledEvent(MouseEvent e) {
		return new MouseEvent(e.getComponent(),
				e.getID(),
				e.getWhen(),
				e.getModifiers(),
				(int) (e.getX() / getScale()),
				(int) (e.getY() / getScale()),
				e.getClickCount(),
				e.isPopupTrigger());
	}


	protected MouseListener createMouseListener() {
		return new StandardDrawingView.DrawingViewMouseListener() {
			public void mousePressed(MouseEvent e) {
				super.mousePressed(createScaledEvent(e));
			}
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(createScaledEvent(e));
			}
		};
	}

	protected MouseMotionListener createMouseMotionListener() {
		return new StandardDrawingView.DrawingViewMouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(createScaledEvent(e));
			}
			public void mouseMoved(MouseEvent e) {
				super.mouseMoved(createScaledEvent(e));
			}
		};
	}

	protected KeyListener createKeyListener() {
		return new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == ' ') {
					forceRedraw();
				}
				else if (e.getKeyChar() == 'o') {
					setScale(getScale() / 2);
				}
				else if (e.getKeyChar() == 'i') {
					setScale(getScale() * 2);
				}
				else if (e.getKeyChar() == 'c') {
					centralize(drawing());
				}
				else {
					super.keyPressed(e);
				}
			}
		};
	}

	/**
	 * Enlarge the View by given zoomFactor and adjusts the scroll pane
	 * so that point (x, y) is in the center.
	 * @autor Peter Hirzel
	 * @see #deZoom(int x, int y)
	 */
	public void deZoom(double zoomFactor, int x, int y) {
		if (getParent() instanceof javax.swing.JViewport) {
			JViewport viewport = (JViewport) getParent();
			Dimension viewportSize = viewport.getSize();
			Dimension userSize = getUserSize();
			int xOrigin = x - viewportSize.width / 2;
			int yOrigin = y - viewportSize.height / 2;
			if (xOrigin < 0) xOrigin = 0;
			if (yOrigin < 0) yOrigin = 0;
			this.scale = this.scale * zoomFactor;
			setUserSize(userSize);
			revalidate();
			viewport.setViewPosition(new Point((int) (xOrigin),
					(int) (yOrigin)));
			forceRedraw();
		} else
			throw new RuntimeException
					("zooming only works if this view is contained in a ScrollPane");
	}

/**
 * Zooms out by a factor of two, keeping point (x,y), which is given
 * in user coordinates, in the center.
 * @autor Peter Hirzel
 * @see #zoomOut(int x, int y)
 */
public void zoomOut(double zoomFactor, int x, int y) {
	if (getParent() instanceof javax.swing.JViewport) {
		JViewport viewport = (JViewport) getParent();
		Dimension viewportSize = viewport.getSize();
		Dimension userSize = getUserSize();
		this.scale = this.scale / zoomFactor;
		int xScreen = (int) (x * scale);
		int yScreen = (int) (y * scale);
		int xOrigin = xScreen - viewportSize.width / 2;
		int yOrigin = yScreen - viewportSize.height / 2;
		if (xOrigin < 0) xOrigin = 0;
		if (yOrigin < 0) yOrigin = 0;
		setUserSize(userSize);
		revalidate();
		viewport.setViewPosition(new Point(xOrigin, yOrigin));
		forceRedraw();
	} else
		throw new RuntimeException
				("zooming only works if this view is contained in a ScrollPane");
}
}
