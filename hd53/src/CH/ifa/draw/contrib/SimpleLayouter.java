/*
 * @(#)SimpleLayouter.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.contrib;

import CH.ifa.draw.framework.FigureEnumeration;
import CH.ifa.draw.framework.Figure;

import java.awt.*;

/**
 * @author	Wolfram Kaiser
 * @version <$CURRENT_VERSION$>
 */
public class SimpleLayouter extends StandardLayouter {

	public SimpleLayouter(Layoutable newLayoutable) {
		super(newLayoutable);
	}

	/**
	 * Create a new instance of this type and sets the layoutable
	 */
	public Layouter create(Layoutable newLayoutable) {
		SimpleLayouter newLayouter = new SimpleLayouter(newLayoutable);
		newLayouter.setInsets((Insets)getInsets().clone());
		return newLayouter;
	}

	public Rectangle calculateLayout(Point origin, Point corner) {
		Rectangle maxRect = new Rectangle(origin);
		FigureEnumeration enum = getLayoutable().figures();
		while (enum.hasMoreElements()) {
			Figure currentFigure = enum.nextFigure();
			maxRect = maxRect.union(currentFigure.displayBox());
		}
		maxRect.width += getInsets().left + getInsets().right;
		maxRect.height += getInsets().top + getInsets().bottom;
		return maxRect;
	}

	public Rectangle layout(Point origin, Point corner) {
		return calculateLayout(origin, corner);
	}
}
