package ch.softenvironment.view;

/* 
 *This file is part of the UML/INTERLIS-Editor.
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
 */
 
/**
 * This is the event multicaster class to support the ch.softenvironment.view.SimpleEditorPanelListenerEventMulticaster interface.
 */
public class SimpleEditorPanelListenerEventMulticaster extends java.awt.AWTEventMulticaster implements ch.softenvironment.view.SimpleEditorPanelListener {
/**
 * Constructor to support multicast events.
 * @param a java.util.EventListener
 * @param b java.util.EventListener
 */
protected SimpleEditorPanelListenerEventMulticaster(java.util.EventListener a, java.util.EventListener b) {
	super(a, b);
}
/**
 * Add new listener to support multicast events.
 * @return ch.softenvironment.view.SimpleEditorPanelListener
 * @param a ch.softenvironment.view.SimpleEditorPanelListener
 * @param b ch.softenvironment.view.SimpleEditorPanelListener
 */
public static ch.softenvironment.view.SimpleEditorPanelListener add(ch.softenvironment.view.SimpleEditorPanelListener a, ch.softenvironment.view.SimpleEditorPanelListener b) {
	return (ch.softenvironment.view.SimpleEditorPanelListener)addInternal(a, b);
}
/**
 * Add new listener to support multicast events.
 * @return java.util.EventListener
 * @param a java.util.EventListener
 * @param b java.util.EventListener
 */
protected static java.util.EventListener addInternal(java.util.EventListener a, java.util.EventListener b) {
	if (a == null)  return b;
	if (b == null)  return a;
	return new SimpleEditorPanelListenerEventMulticaster(a, b);
}
/**
 * 
 * @return java.util.EventListener
 * @param oldl ch.softenvironment.view.SimpleEditorPanelListener
 */
protected java.util.EventListener remove(ch.softenvironment.view.SimpleEditorPanelListener oldl) {
	if (oldl == a)  return b;
	if (oldl == b)  return a;
	java.util.EventListener a2 = removeInternal(a, oldl);
	java.util.EventListener b2 = removeInternal(b, oldl);
	if (a2 == a && b2 == b)
		return this;
	return addInternal(a2, b2);
}
/**
 * Remove listener to support multicast events.
 * @return ch.softenvironment.view.SimpleEditorPanelListener
 * @param l ch.softenvironment.view.SimpleEditorPanelListener
 * @param oldl ch.softenvironment.view.SimpleEditorPanelListener
 */
public static ch.softenvironment.view.SimpleEditorPanelListener remove(ch.softenvironment.view.SimpleEditorPanelListener l, ch.softenvironment.view.SimpleEditorPanelListener oldl) {
	if (l == oldl || l == null)
		return null;
	if(l instanceof SimpleEditorPanelListenerEventMulticaster)
		return (ch.softenvironment.view.SimpleEditorPanelListener)((ch.softenvironment.view.SimpleEditorPanelListenerEventMulticaster) l).remove(oldl);
	return l;
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void txaEditorKey_keyReleased(java.util.EventObject newEvent) {
	((ch.softenvironment.view.SimpleEditorPanelListener)a).txaEditorKey_keyReleased(newEvent);
	((ch.softenvironment.view.SimpleEditorPanelListener)b).txaEditorKey_keyReleased(newEvent);
}
}
