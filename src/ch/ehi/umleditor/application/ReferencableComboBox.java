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
import java.util.*;
import ch.ehi.uml1_4.foundation.core.*;
/**
 * ComboBox showing possible Referencable ModelElement's.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2007-03-06 12:49:02 $
 */
public class ReferencableComboBox extends javax.swing.JComboBox {
//	private static java.util.ResourceBundle resReferencableComboBox = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/ReferencableComboBox");  //$NON-NLS-1$
private ModelElement client = null;
private java.util.TreeSet referencables = null;
private String initialItem = null;
private Dependency initialDependency = null;
/**
 * ReferencableComboBox constructor comment.
 */
public ReferencableComboBox() {
								super();
}
/**
 * ReferencableComboBox constructor comment.
 * @param items java.lang.Object[]
 */
public ReferencableComboBox(java.lang.Object[] items) {
								super(items);
}
/**
 * ReferencableComboBox constructor comment.
 * @param items java.util.Vector
 */
public ReferencableComboBox(java.util.Vector items) {
								super(items);
}
/**
 * ReferencableComboBox constructor comment.
 * @param aModel javax.swing.ComboBoxModel
 */
public ReferencableComboBox(javax.swing.ComboBoxModel aModel) {
								super(aModel);
}
/**
 * Return the selected ModelElement in ComboBox.
 * @see #setElement(..)
 */
protected ModelElement getElement() {
								if (getSelectedIndex() > 0) {
																Iterator iterator = referencables.iterator();
																String name = (String)getSelectedItem();
																while (iterator.hasNext()) {
																								ModelElement modelElement = (ModelElement)iterator.next();
																								if (ElementUtils.formatWithPackageName(modelElement).equals(name)) {
																																return modelElement;
																								}
																}
								}

								return null;
}
/**
 * @return the supplier of the given Client
 */
private ModelElement getSupplier(java.lang.Class dependencyClass, ModelElement client) {
								this.client = client;

								// get the current supplier
								java.util.Iterator iterator = client.iteratorClientDependency();
								while (iterator.hasNext()) {
																Object element = iterator.next();
																if (element.getClass().equals(dependencyClass)) {
																								// 0 or 1
																								initialDependency = (Dependency)element;
																								return (ModelElement)initialDependency.iteratorSupplier().next();
																}
								}

								return null;
}
/**
 * Return whether selected ModelElement has changed since inital-setting.
 * @see #setElement(..)
 */
protected boolean hasElementChanged() {
								if (getSelectedItem() == null) {
																return (initialItem != null);
								} else {
																return (!getSelectedItem().equals(initialItem));
								}
}
/**
 * Return a Dependency of the given class.
 * @see #setElement(..)
 */
protected void save0or1Dependency(java.lang.Class dependencyClass) {
								if (hasElementChanged()) {
																// 1) remove current Dependency
																if (initialDependency != null) {
																								client.removeClientDependency(initialDependency);
																								initialDependency = null;
																}
																// 2) add new Dependency
																if (getElement() != null) {
																								try {
																																ModelElement supplier = (ModelElement)getElement();
																																initialDependency = (Dependency)ElementFactory.createDependency(dependencyClass, client, supplier);
																								} catch(Throwable e) {
																																LauncherView.getInstance().handleException(e);
																								}
																}
								}
}
/**
 * Fill ComboBox with potential Dependency-Elements and
 * set the current element.
 * @param client of Dependency
 * @see #save0or1Dependency()
 */
protected void set0or1Dependency(java.lang.Class dependencyClass, ModelElement client) {
								setElement(ch.ehi.interlis.views.ViewableDef.class, client, getSupplier(dependencyClass, client));
}
/**
 * Fill a ComboBox with all owned Elements of the given ModelElement's parent-TopicDef.
 * The names are displayed with a qualified path.
 * @param modelElement (the element to find referenceClass-Elements for)
 * @param currentModelElement (the currently chosen one)
 * @return whether any ModelElements were found
 */
private boolean setDisplayList(java.util.Set set, ModelElement modelElement, ModelElement currentModelElement) {
								referencables = new java.util.TreeSet(new ModelElementComparator());

								java.util.Iterator iterator = set.iterator();
								while (iterator.hasNext()) {
																Object object = iterator.next();
																if (!modelElement.equals(object)) {
																								// do not put the given object itself into list
																								referencables.add(object);
																}
								}

								// enable that currentModelElement is shown; in case it is not referencable
								if((currentModelElement!=null) && !referencables.contains(currentModelElement)) {
																referencables.add(currentModelElement);
								}

								// create displayable list (which contains a null Element more in addition to translations)
								// show Referencable Element-Names in Cbx
								Vector names = new Vector(); // keep the sort-Order
								names.add(new String()); // allow also an Empty-Element => (+/-)1
								iterator = referencables.iterator();
								while (iterator.hasNext()) {
																ModelElement refModelElement = (ModelElement)iterator.next();
																names.add(ElementUtils.formatWithPackageName(refModelElement));
								}

								setModel(new javax.swing.DefaultComboBoxModel(names));

								// set given Element as the chosen one
								if (currentModelElement != null) {
																initialItem = ElementUtils.formatWithPackageName(currentModelElement);
																setSelectedItem(initialItem);
																/*
																   new ch.softenvironment.view.WarningDialog(LauncherView.getInstance(),
																   resReferencableComboBox.getString("CTMissingElement"), //$NON-NLS-1$
																   resReferencableComboBox.getString("CWMissingElement") + "\n[" + currentModelElement.toString() + "]\n" + resReferencableComboBox.getString("CWLostReference") + "\n[@see ReferencableComboBox#setDisplayList(..)]");//$NON-NLS-5$ //$NON-NLS-4$//$NON-NLS-3$//$NON-NLS-2$ //$NON-NLS-1$
																 */
								}

								return names.size() > 0;
}
/**
 * Fill a ComboBox of Referencables and set a given ModelElement.
 * @param referenceClass (type of namespace-elements to be found)
 * @param modelElement (the element to find referenceClass-Elements for)
 * @param currentModelElement (the currently chosen one)
 * @see #getElement()
 * @see ElementMapper#getReferencableElements()
 */
protected void setElement(java.lang.Class referenceClass, ModelElement modelElement, ModelElement currentModelElement) {
								setDisplayList(ch.ehi.interlis.tools.ModelElementUtility.getReferencableElements(modelElement, referenceClass),
																							modelElement,
																							currentModelElement);
}
protected void setElement(Set referencableElements, ModelElement modelElement, ModelElement currentModelElement) {
								setDisplayList(referencableElements,
																							modelElement,
																							currentModelElement);
}
/**
 * Overwrites.
 * @see #setElement(..)
 */
public void setSelectedIndex(int anIndex) {
								if ((anIndex == 0) && (getItemCount() == 0)) {
																// probably not yet initialized
																super.setSelectedIndex(-1);
								} else {
																super.setSelectedIndex(anIndex);
								}

}
/**
 * Fill a ComboBox with all owned Elements of the given ModelElement's parent-TopicDef.
 * @param modelElement (the element to find referenceClass-Elements for)
 * @param currentModelElement (the currently chosen one)
 */
protected boolean setUsage(ModelElement modelElement) {
								java.util.Set ownedElements = ch.ehi.interlis.tools.ModelElementUtility.getPeerElements(modelElement, null);

								return setDisplayList(ownedElements, modelElement, getSupplier(ch.ehi.uml1_4.implementation.UmlUsage.class, modelElement));
}
}
