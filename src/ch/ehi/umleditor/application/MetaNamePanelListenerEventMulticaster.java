package ch.ehi.umleditor.application;

public class MetaNamePanelListenerEventMulticaster extends java.awt.AWTEventMulticaster
implements ch.ehi.umleditor.application.MetaNamePanelListener {
	/**
	 * Constructor to support multicast events.
	 * 
	 * @param a
	 *            java.util.EventListener
	 * @param b
	 *            java.util.EventListener
	 */
	protected MetaNamePanelListenerEventMulticaster(java.util.EventListener a, java.util.EventListener b) {
		super(a, b);
	}

	/**
	 * Add new listener to support multicast events.
	 * 
	 * @return ch.ehi.umleditor.application.MetaNamePanelListener
	 * @param a
	 *            ch.ehi.umleditor.application.MetaNamePanelListener
	 * @param b
	 *            ch.ehi.umleditor.application.MetaNamePanelListener
	 */
	public static ch.ehi.umleditor.application.MetaNamePanelListener add(
			ch.ehi.umleditor.application.MetaNamePanelListener a,
			ch.ehi.umleditor.application.MetaNamePanelListener b) {
		return (ch.ehi.umleditor.application.MetaNamePanelListener) addInternal(a, b);
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
		return new MetaNamePanelListenerEventMulticaster(a, b);
	}

	/**
	 *
	 * @param newEvent
	 *            java.util.EventObject
	 */
	public void pnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject newEvent) {
		((ch.ehi.umleditor.application.MetaNamePanelListener) a)
				.pnlEditSimpleEditPanel_txaEditKey_keyReleased(newEvent);
		((ch.ehi.umleditor.application.MetaNamePanelListener) b)
				.pnlEditSimpleEditPanel_txaEditKey_keyReleased(newEvent);
	}

	/**
	 *
	 * @return java.util.EventListener
	 * @param oldl
	 *            ch.ehi.umleditor.application.MetaAttrbEnu,criptionPanelListener
	 */
	protected java.util.EventListener remove(ch.ehi.umleditor.application.MetaNamePanelListener oldl) {
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
	 * @return ch.ehi.umleditor.application.MetaNamePanel,PanelListener
	 * @param l
	 *            ch.ehi.umleditor.application.MetaNamePanel,PanelListener
	 * @param oldl
	 *            ch.ehi.umleditor.application.MetaNamePanel,PanelListener
	 */
	public static ch.ehi.umleditor.application.MetaNamePanelListener remove(
			ch.ehi.umleditor.application.MetaNamePanelListener l,
			ch.ehi.umleditor.application.MetaNamePanelListener oldl) {
		if (l == oldl || l == null)
			return null;
		if (l instanceof MetaNamePanelListenerEventMulticaster)
			return (ch.ehi.umleditor.application.MetaNamePanelListener) ((ch.ehi.umleditor.application.MetaNamePanelListenerEventMulticaster) l)
					.remove(oldl);
		return l;
	}



}
