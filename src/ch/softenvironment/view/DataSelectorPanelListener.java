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
 * Listener for DataSelectorPanel.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public interface DataSelectorPanelListener {
/**
 * Called when a new Object has to be inserted into list.
 * @return java.lang.Object
 */
Object createObject();
/**
 * Called when currentObject is to be removed.
 * @param object Object to be removed
 */
void removeObject(Object object);
/**
 * Called when currentObject is switched to another Index.
 * @param param java.lang.Object
 * @return the saved object
 */
Object saveChanges(Object object);
/**
 * Called when currentObject becomes another one.
 * @param object New current Object in SelectionList
 */
void setCurrentObject(Object object);
}
