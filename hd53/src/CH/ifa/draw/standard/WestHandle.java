/*
 * @(#)BoxHandleKit.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.standard;

import CH.ifa.draw.framework.*;
import CH.ifa.draw.util.Undoable;
import CH.ifa.draw.util.UndoableAdapter;
import java.awt.*;
import java.util.Vector;

class WestHandle extends ResizeHandle {
	WestHandle(Figure owner) {
		super(owner, RelativeLocator.west());
	}

	public void invokeStep (int x, int y, int anchorX, int anchorY, DrawingView view) {
		Rectangle r = owner().displayBox();
		owner().displayBox(
			new Point(Math.min(r.x + r.width, x), r.y),
			new Point(r.x + r.width, r.y + r.height)
		);
	}
}
