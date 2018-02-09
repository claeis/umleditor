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
/**
 * Converter between java.awt.Color and ch.ehi.umleditor.umlpresentation.Color.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:40:51 $
 */
public abstract class ColorConverter {
	/**
	 * @param ch.ehi.umleditor.umlpresentation.Color
	 * @return converted java.awt.Color.
	 */
	public static java.awt.Color createColor(ch.ehi.umleditor.umlpresentation.Color color) {
		if (color == null) {
			return null;
		} else {
			return new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue());
		}
	}

	/**
	 * @return ch.ehi.umleditor.umlpresentation.Color
	 * @param converted
	 *            java.awt.Color.
	 */
	public static ch.ehi.umleditor.umlpresentation.Color createColor(java.awt.Color awtColor) {
		if (awtColor == null) {
			return null;
		} else {
			ch.ehi.umleditor.umlpresentation.Color presentationColor = new ch.ehi.umleditor.umlpresentation.Color();
			presentationColor.setRed(awtColor.getRed());
			presentationColor.setGreen(awtColor.getGreen());
			presentationColor.setBlue(awtColor.getBlue());

			return presentationColor;
		}
	}

	/**
	 * Return whether Colors mean the same RGB value.
	 */
	public static boolean isSame(ch.ehi.umleditor.umlpresentation.Color presentationColor, java.awt.Color color) {
		if (presentationColor == null) {
			if (color == null) {
				return true;
			} else {
				return false;
			}
		} else if (color == null) {
			return false;
		}

		return (presentationColor.getRed() == color.getRed()) && (presentationColor.getGreen() == color.getGreen())
				&& (presentationColor.getBlue() == color.getBlue());
	}
}
