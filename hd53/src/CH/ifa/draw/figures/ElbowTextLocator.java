/*
 * @(#)ElbowConnection.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.figures;

import java.awt.*;
import java.util.*;
import java.io.IOException;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.util.*;

class ElbowTextLocator extends AbstractLocator {
	public Point locate(Figure owner) {
		Point p = owner.center();
		Rectangle r = owner.displayBox();
		return new Point(p.x, p.y-10); // hack
	}
}

