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
 * This is the event multicaster class to support the ch.softenvironment.view.ToolBarListenerEventMulticaster interface.
 */
public class ToolBarListenerEventMulticaster extends java.awt.AWTEventMulticaster implements ToolBarListener {
/**
 * Constructor to support multicast events.
 * @param a java.util.EventListener
 * @param b java.util.EventListener
 */
protected ToolBarListenerEventMulticaster(java.util.EventListener a, java.util.EventListener b) {
	super(a, b);
}
/**
 * Add new listener to support multicast events.
 * @return ch.softenvironment.view.ToolBarListener
 * @param a ch.softenvironment.view.ToolBarListener
 * @param b ch.softenvironment.view.ToolBarListener
 */
public static ch.softenvironment.view.ToolBarListener add(ch.softenvironment.view.ToolBarListener a, ch.softenvironment.view.ToolBarListener b) {
	return (ch.softenvironment.view.ToolBarListener)addInternal(a, b);
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
	return new ToolBarListenerEventMulticaster(a, b);
}
/**
 * 
 * @return java.util.EventListener
 * @param oldl ch.softenvironment.view.ToolBarListener
 */
protected java.util.EventListener remove(ch.softenvironment.view.ToolBarListener oldl) {
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
 * @return ch.softenvironment.view.ToolBarListener
 * @param l ch.softenvironment.view.ToolBarListener
 * @param oldl ch.softenvironment.view.ToolBarListener
 */
public static ch.softenvironment.view.ToolBarListener remove(ch.softenvironment.view.ToolBarListener l, ch.softenvironment.view.ToolBarListener oldl) {
	if (l == oldl || l == null)
		return null;
	if(l instanceof ToolBarListenerEventMulticaster)
		return (ch.softenvironment.view.ToolBarListener)((ch.softenvironment.view.ToolBarListenerEventMulticaster) l).remove(oldl);
	return l;
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbCopyAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbCopyAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbCopyAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbCutAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbCutAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbCutAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbDeleteAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbDeleteAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbDeleteAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbFindAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbFindAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbFindAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbNewAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbNewAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbNewAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbOpenAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbOpenAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbOpenAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbPasteAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbPasteAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbPasteAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbPrintAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbPrintAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbPrintAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbRedoAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbRedoAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbRedoAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbSaveAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbSaveAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbSaveAction_actionPerformed(newEvent);
}
/**
 * 
 * @param newEvent java.util.EventObject
 */
public void tbbUndoAction_actionPerformed(java.util.EventObject newEvent) {
	((ch.softenvironment.view.ToolBarListener)a).tbbUndoAction_actionPerformed(newEvent);
	((ch.softenvironment.view.ToolBarListener)b).tbbUndoAction_actionPerformed(newEvent);
}
}
