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
public interface ToolBarListener extends java.util.EventListener {
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbCopyAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbCutAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbDeleteAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbFindAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbNewAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbOpenAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbPasteAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbPrintAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbRedoAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbSaveAction_actionPerformed(java.util.EventObject newEvent);
/**
 * 
 * @param newEvent java.util.EventObject
 */
void tbbUndoAction_actionPerformed(java.util.EventObject newEvent);
}
