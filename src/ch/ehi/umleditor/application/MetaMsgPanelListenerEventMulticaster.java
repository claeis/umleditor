package ch.ehi.umleditor.application;

public class MetaMsgPanelListenerEventMulticaster extends java.awt.AWTEventMulticaster
implements ch.ehi.umleditor.application.MetaMsgPanelListener {
	/**
	 * Constructor to support multicast events.
	 * 
	 * @param a
	 *            java.util.EventListener
	 * @param b
	 *            java.util.EventListener
	 */
	protected MetaMsgPanelListenerEventMulticaster(java.util.EventListener a, java.util.EventListener b) {
		super(a, b);
	}

	/**
	 * Add new listener to support multicast events.
	 * 
	 * @return ch.ehi.umleditor.application.MetaMsgPanelListener
	 * @param a
	 *            ch.ehi.umleditor.application.MetaMsgPanelListener
	 * @param b
	 *            ch.ehi.umleditor.application.MetaMsgPanelListener
	 */
	public static ch.ehi.umleditor.application.MetaMsgPanelListener add(
			ch.ehi.umleditor.application.MetaMsgPanelListener a,
			ch.ehi.umleditor.application.MetaMsgPanelListener b) {
		return (ch.ehi.umleditor.application.MetaMsgPanelListener) addInternal(a, b);
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
		return new MetaMsgPanelListenerEventMulticaster(a, b);
	}

	/**
	 *
	 * @param newEvent
	 *            java.util.EventObject
	 */
	public void pnlEditSimpleEditPanel_txaEditKey_keyReleased(java.util.EventObject newEvent) {
		((ch.ehi.umleditor.application.MetaMsgPanelListener) a)
				.pnlEditSimpleEditPanel_txaEditKey_keyReleased(newEvent);
		((ch.ehi.umleditor.application.MetaMsgPanelListener) b)
				.pnlEditSimpleEditPanel_txaEditKey_keyReleased(newEvent);
	}

	/**
	 *
	 * @return java.util.EventListener
	 * @param oldl
	 *            ch.ehi.umleditor.application.MetaMsg,criptionPanelListener
	 */
	protected java.util.EventListener remove(ch.ehi.umleditor.application.MetaMsgPanelListener oldl) {
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
	 * @return ch.ehi.umleditor.application.MetaMsgPanel,PanelListener
	 * @param l
	 *            ch.ehi.umleditor.application.MetaMsgPanel,PanelListener
	 * @param oldl
	 *            ch.ehi.umleditor.application.MetaMsgPanel,PanelListener
	 */
	public static ch.ehi.umleditor.application.MetaMsgPanelListener remove(
			ch.ehi.umleditor.application.MetaMsgPanelListener l,
			ch.ehi.umleditor.application.MetaMsgPanelListener oldl) {
		if (l == oldl || l == null)
			return null;
		if (l instanceof MetaMsgPanelListenerEventMulticaster)
			return (ch.ehi.umleditor.application.MetaMsgPanelListener) ((ch.ehi.umleditor.application.MetaMsgPanelListenerEventMulticaster) l)
					.remove(oldl);
		return l;
	}

}
