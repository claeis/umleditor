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

/**
 * A set of utility methods to create Handles for the common
 * locations on a figure's display box.
 *
 * @see Handle
 *
 * @version <$CURRENT_VERSION$>
 */

 // TBD: use anonymous inner classes (had some problems with JDK 1.1)

public class BoxHandleKit {

	/**
	 * Fills the given Vector with handles at each corner of a
	 * figure.
	 */
	static public void addCornerHandles(Figure f, Vector handles) {
		handles.addElement(southEast(f));
		handles.addElement(southWest(f));
		handles.addElement(northEast(f));
		handles.addElement(northWest(f));
	}

	/**
	 * Fills the given Vector with handles at each corner
	 * and the north, south, east, and west of the figure.
	 */
	static public void addHandles(Figure f, Vector handles) {
		addCornerHandles(f, handles);
		handles.addElement(south(f));
		handles.addElement(north(f));
		handles.addElement(east(f));
		handles.addElement(west(f));
	}

	static public Handle south(Figure owner) {
		return new SouthHandle(owner);
	}

	static public Handle southEast(Figure owner) {
		return new SouthEastHandle(owner);
	}

	static public Handle southWest(Figure owner) {
		return new SouthWestHandle(owner);
	}

	static public Handle north(Figure owner) {
		return new NorthHandle(owner);
	}

	static public Handle northEast(Figure owner) {
		return new NorthEastHandle(owner);
	}

	static public Handle northWest(Figure owner) {
		return new NorthWestHandle(owner);
	}

	static public Handle east(Figure owner) {
		return new EastHandle(owner);
	}

	static public Handle west(Figure owner) {
		return new WestHandle(owner);
	}
}

