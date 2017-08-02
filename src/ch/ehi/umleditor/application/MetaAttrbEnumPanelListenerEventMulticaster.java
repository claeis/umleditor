package ch.ehi.umleditor.application;
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
 * This is the event multicaster class to support the
 * ch.ehi.umleditor.application.DescriptionPanelListenerEventMulticaster
 * interface.
 */
public class MetaAttrbEnumPanelListenerEventMulticaster extends java.awt.AWTEventMulticaster
		implements ch.ehi.umleditor.application.MetaAttrbEnumPanelListener {
	/**
	 * Constructor to support multicast events.
	 * 
	 * @param a
	 *            java.util.EventListener
	 * @param b
	 *            java.util.EventListener
	 */
	protected MetaAttrbEnumPanelListenerEventMulticaster(java.util.EventListener a, java.util.EventListener b) {
		super(a, b);
	}

	/**
	 * Add new listener to support multicast events.
	 * 
	 * @return ch.ehi.umleditor.application.MetaAttrbEnumPanelListener
	 * @param a
	 *            ch.ehi.umleditor.application.MetaAttrbEnumPanelListener
	 * @param b
	 *            ch.ehi.umleditor.application.MetaAttrbEnumPanelListener
	 */
	public static ch.ehi.umleditor.application.MetaAttrbEnumPanelListener add(
			ch.ehi.umleditor.application.MetaAttrbEnumPanelListener a,
			ch.ehi.umleditor.application.MetaAttrbEnumPanelListener b) {
		return (ch.ehi.umleditor.application.MetaAttrbEnumPanelListener) addInternal(a, b);
	}

	/**
	 * Add new listener to support multicast events.
	 * 
	 * @return java.util.EventListener
	 * @param a
	 *            java.util.EventListener
	 * @param b
	 *            java.util.EventListener
	 */
	protected static java.util.EventListener addInternal(java.util.EventListener a, java.util.EventListener b) {
		if (a == null)
			return b;
		if (b == null)
			return a;
		return new MetaAttrbEnumPanelListenerEventMulticaster(a, b);
	}

	/**
	 *
	 * @param newEvent
	 *            java.util.EventObject
	 */
	public void pnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject newEvent) {
		((ch.ehi.umleditor.application.MetaAttrbEnumPanelListener) a)
				.pnlEditSimpleEditPanel_txaEditKey_keyReleased(newEvent);
		((ch.ehi.umleditor.application.MetaAttrbEnumPanelListener) b)
				.pnlEditSimpleEditPanel_txaEditKey_keyReleased(newEvent);
	}

	/**
	 *
	 * @return java.util.EventListener
	 * @param oldl
	 *            ch.ehi.umleditor.application.MetaAttrbEnu,criptionPanelListener
	 */
	protected java.util.EventListener remove(ch.ehi.umleditor.application.MetaAttrbEnumPanelListener oldl) {
		if (oldl == a)
			return b;
		if (oldl == b)
			return a;
		java.util.EventListener a2 = removeInternal(a, oldl);
		java.util.EventListener b2 = removeInternal(b, oldl);
		if (a2 == a && b2 == b)
			return this;
		return addInternal(a2, b2);
	}

	/**
	 * Remove listener to support multicast events.
	 * 
	 * @return ch.ehi.umleditor.application.MetaAttrbEnu,PanelListener
	 * @param l
	 *            ch.ehi.umleditor.application.MetaAttrbEnu,PanelListener
	 * @param oldl
	 *            ch.ehi.umleditor.application.MetaAttrbEnu,PanelListener
	 */
	public static ch.ehi.umleditor.application.MetaAttrbEnumPanelListener remove(
			ch.ehi.umleditor.application.MetaAttrbEnumPanelListener l,
			ch.ehi.umleditor.application.MetaAttrbEnumPanelListener oldl) {
		if (l == oldl || l == null)
			return null;
		if (l instanceof MetaAttrbEnumPanelListenerEventMulticaster)
			return (ch.ehi.umleditor.application.MetaAttrbEnumPanelListener) ((ch.ehi.umleditor.application.MetaAttrbEnumPanelListenerEventMulticaster) l)
					.remove(oldl);
		return l;
	}

}
