/*
 * @(#)ColorMap.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	© by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package CH.ifa.draw.util;

import java.awt.Color;

class ColorEntry {
	public String 	fName;
	public Color 	fColor;

	ColorEntry(String name, Color color) {
		fColor = color;
		fName = name;
	}
}

