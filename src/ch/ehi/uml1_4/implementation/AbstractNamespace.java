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

// -beg- preserve=no 3CE225CF036F package "AbstractNamespace"
package ch.ehi.uml1_4.implementation;
// -end- 3CE225CF036F package "AbstractNamespace"

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.umleditor.umlpresentation.Diagram;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3CE225CF036F import "AbstractNamespace"

// -end- 3CE225CF036F import "AbstractNamespace"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:07 $
 */
public abstract class AbstractNamespace extends AbstractModelElement implements Namespace, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CE225CF036F detail_begin "AbstractNamespace"

	// -end- 3CE225CF036F detail_begin "AbstractNamespace"

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 3CE4F4810039 head3CE225CF036F "getValidOwnedElements"
	public abstract String[] getValidOwnedElements()
	// -end- 3CE4F4810039 head3CE225CF036F "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CE4F4810039 throws3CE225CF036F "getValidOwnedElements"

	// -end- 3CE4F4810039 throws3CE225CF036F "getValidOwnedElements"
	; // empty

	// -beg- preserve=no 3D4FA218006C head3CE225CF036F "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA218006C head3CE225CF036F "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA218006C throws3CE225CF036F "unlinkAll"

	// -end- 3D4FA218006C throws3CE225CF036F "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA218006C body3CE225CF036F "unlinkAll"

		clearOwnedElement();
		clearDiagram();
		clearBehavior();
		clearPartition();
		clearCollaboration();
		clearClassifierRole();
		clearCollaborationInstanceSet();
		detachNamespace();
		clearClientDependency();
		clearTaggedValue();
		clearConstraint();
		clearSupplierDependency();
		clearPresentation();
		clearContainer();
		clearTemplateParameter();
		clearTargetFlow();
		clearSourceFlow();
		clearDefaultParameter();
		clearComment();
		// Role TemplateArgument: TemplateArgument object(s) may point to this
		// Role ParameterDefinition: TemplateParameter object(s) may point to
		// this
		clearStereotype();
		clearReferenceTag();
		clearImportedBy();
		// Role EditorTreeElement: EditorTreeElement object(s) may point to this
		setName(null);
		setMetaAttrb(null);
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA218006C body3CE225CF036F "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180076 head3CE225CF036F "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180076 head3CE225CF036F "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180076 throws3CE225CF036F "enumerateChildren"

	// -end- 3D4FA2180076 throws3CE225CF036F "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180076 body3CE225CF036F "enumerateChildren"
		java.util.Iterator it = null;
		it = iteratorOwnedElement();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorDiagram();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorBehavior();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTaggedValue();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTemplateParameter();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getName());
		visitor.visit(getMetaAttrb());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2180076 body3CE225CF036F "enumerateChildren"
	}

	/**
	 * disconnect the given element and all its subelements from this namespace
	 */
	// -beg- preserve=no 3C8F94DE03A6 head3CE225CF036F "deepDetachOwnedElement"
	public void deepDetachOwnedElement(ModelElement element)
	// -end- 3C8F94DE03A6 head3CE225CF036F "deepDetachOwnedElement"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3C8F94DE03A6 throws3CE225CF036F
	// "deepDetachOwnedElement"

	// -end- 3C8F94DE03A6 throws3CE225CF036F "deepDetachOwnedElement"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3C8F94DE03A6 body3CE225CF036F
		// "deepDetachOwnedElement"
		ch.ehi.interlis.tools.UnlinkAllChildren remover = new ch.ehi.interlis.tools.UnlinkAllChildren();
		remover.visit(element);
		remover.unlinkThem();
		// -end- 3C8F94DE03A6 body3CE225CF036F "deepDetachOwnedElement"
	}

	/**
	 * tests if this Namespace contains an ModelElement with the given name
	 */
	// -beg- preserve=no 3C8F964B01C0 head3CE225CF036F "containsOwnedElement"
	public boolean containsOwnedElement(String name)
	// -end- 3C8F964B01C0 head3CE225CF036F "containsOwnedElement"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3C8F964B01C0 throws3CE225CF036F "containsOwnedElement"

	// -end- 3C8F964B01C0 throws3CE225CF036F "containsOwnedElement"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3C8F964B01C0 body3CE225CF036F
		// "containsOwnedElement"
		java.util.Iterator it = iteratorOwnedElement();
		while (it.hasNext()) {
			ModelElement ele = (ModelElement) it.next();
			if (name.equals(ele.getDefLangName())) {
				return true;
			}
		}
		return false;
		// -end- 3C8F964B01C0 body3CE225CF036F "containsOwnedElement"
	}

	/**
	 * checks if a ModelElement exists in this Namespace and all its
	 * Sub-Namespaces
	 */
	// -beg- preserve=no 3CC7B8D10067 head3CE225CF036F
	// "deepContainsOwnedElement"
	public boolean deepContainsOwnedElement(java.lang.Class aclass, String name)
	// -end- 3CC7B8D10067 head3CE225CF036F "deepContainsOwnedElement"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC7B8D10067 throws3CE225CF036F
	// "deepContainsOwnedElement"

	// -end- 3CC7B8D10067 throws3CE225CF036F "deepContainsOwnedElement"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC7B8D10067 body3CE225CF036F
		// "deepContainsOwnedElement"
		return ch.ehi.uml1_4.tools.NamespaceUtility.deepContainsOwnedElement(this, aclass, name);
		// -end- 3CC7B8D10067 body3CE225CF036F "deepContainsOwnedElement"
	}

	/**
	 * finds a ModelElement in this Namespace or all its Sub-Namespaces
	 */
	// -beg- preserve=no 3CC7B8E5034B head3CE225CF036F "deepGetOwnedElement"
	public ModelElement deepGetOwnedElement(java.lang.Class aclass, String name)
	// -end- 3CC7B8E5034B head3CE225CF036F "deepGetOwnedElement"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC7B8E5034B throws3CE225CF036F "deepGetOwnedElement"

	// -end- 3CC7B8E5034B throws3CE225CF036F "deepGetOwnedElement"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC7B8E5034B body3CE225CF036F
		// "deepGetOwnedElement"
		return ch.ehi.uml1_4.tools.NamespaceUtility.deepGetOwnedElement(this, aclass, name);
		// -end- 3CC7B8E5034B body3CE225CF036F "deepGetOwnedElement"
	}

	/**
	 * checks if a ModelElement exists in this Namespace and all its
	 * Sub-Namespaces
	 */
	// -beg- preserve=no 3D789EFC0327 head3CE225CF036F "deepContainsElementById"
	public boolean deepContainsElementById(String id)
	// -end- 3D789EFC0327 head3CE225CF036F "deepContainsElementById"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D789EFC0327 throws3CE225CF036F
	// "deepContainsElementById"

	// -end- 3D789EFC0327 throws3CE225CF036F "deepContainsElementById"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D789EFC0327 body3CE225CF036F
		// "deepContainsElementById"
		return ch.ehi.uml1_4.tools.NamespaceUtility.deepContainsElementById(this, id);
		// -end- 3D789EFC0327 body3CE225CF036F "deepContainsElementById"
	}

	/**
	 * finds a ModelElement in this Namespace or all its Sub-Namespaces
	 */
	// -beg- preserve=no 3D789F500346 head3CE225CF036F "deepGetElementById"
	public AbstractEditorElement deepGetElementById(String id)
	// -end- 3D789F500346 head3CE225CF036F "deepGetElementById"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D789F500346 throws3CE225CF036F "deepGetElementById"

	// -end- 3D789F500346 throws3CE225CF036F "deepGetElementById"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D789F500346 body3CE225CF036F "deepGetElementById"
		return ch.ehi.uml1_4.tools.NamespaceUtility.deepGetElementById(this, id);
		// -end- 3D789F500346 body3CE225CF036F "deepGetElementById"
	}

	// -beg- preserve=no 33598CAA030D code3CE225CF036F "ownedElement"
	private java.util.List ownedElement = new java.util.ArrayList();
	// -end- 33598CAA030D code3CE225CF036F "ownedElement"

	/**
	 * add a OwnedElement. A set of ModelElementsowned by the Namespace.
	 * 
	 * @see #removeOwnedElement
	 * @see #containsOwnedElement
	 * @see #iteratorOwnedElement
	 * @see #clearOwnedElement
	 * @see #sizeOwnedElement
	 * @see #iteratorOwnedElementLink
	 * @see #createOwnedElementLink
	 * @see #findOwnedElementLink
	 */
	// -beg- preserve=no 33598CAA030D add_head3CE225CF036F
	// "Namespace::addOwnedElement"
	public void addOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D add_head3CE225CF036F "Namespace::addOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D add_body3CE225CF036F
		// "Namespace::addOwnedElement"
		ElementOwnership linkobj = createOwnedElementLink();
		linkobj.setOwnedElement(ownedElement1);
		linkobj.setNamespace(this);
		ownedElement.add(linkobj);
		ownedElement1._linkNamespace(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addOwnedElement"));
		return;
		// -end- 33598CAA030D add_body3CE225CF036F "Namespace::addOwnedElement"
	}

	// -beg- preserve=no 33598CAA030D add2_head3CE225CF036F
	// "Namespace::add2OwnedElement"
	public void addOwnedElement(int index, ModelElement ownedElement1)
	// -end- 33598CAA030D add2_head3CE225CF036F "Namespace::add2OwnedElement"
	{
		// -beg- preserve=no 33598CAA030D add2_body3CE225CF036F
		// "Namespace::add2OwnedElement"
		ElementOwnership linkobj = createOwnedElementLink();
		linkobj.setOwnedElement(ownedElement1);
		linkobj.setNamespace(this);
		ownedElement.add(index, linkobj);
		ownedElement1._linkNamespace(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addOwnedElement"));
		return;
		// -end- 33598CAA030D add2_body3CE225CF036F
		// "Namespace::add2OwnedElement"
	}

	/**
	 * add a link to a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D addlink_head3CE225CF036F
	// "Namespace::addOwnedElementLink"
	public void addOwnedElementLink(ElementOwnership ownedElement1)
	// -end- 33598CAA030D addlink_head3CE225CF036F
	// "Namespace::addOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D addlink_body3CE225CF036F
		// "Namespace::addOwnedElementLink"
		ownedElement1.setNamespace(this);
		ownedElement.add(ownedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addOwnedElementLink"));
		return;
		// -end- 33598CAA030D addlink_body3CE225CF036F
		// "Namespace::addOwnedElementLink"
	}

	/**
	 * disconnect a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove_head3CE225CF036F
	// "Namespace::removeOwnedElement"
	public ModelElement removeOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D remove_head3CE225CF036F
	// "Namespace::removeOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove_body3CE225CF036F
		// "Namespace::removeOwnedElement"
		ModelElement ret = null;
		ElementOwnership linkobj = findOwnedElementLink(ownedElement1);
		if (ownedElement1 == null || linkobj == null) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = linkobj.getOwnedElement();
		ownedElement.remove(linkobj);
		ret._unlinkNamespace(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeOwnedElement"));
		return ret;
		// -end- 33598CAA030D remove_body3CE225CF036F
		// "Namespace::removeOwnedElement"
	}

	/**
	 * disconnect a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove2_head3CE225CF036F
	// "Namespace::remove2OwnedElement"
	public ModelElement removeOwnedElement(int index)
	// -end- 33598CAA030D remove2_head3CE225CF036F
	// "Namespace::remove2OwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove2_body3CE225CF036F
		// "Namespace::remove2OwnedElement"
		ModelElement ret = null;
		ElementOwnership linkobj = (ElementOwnership) ownedElement.get(index);
		ret = linkobj.getOwnedElement();
		ownedElement.remove(linkobj);
		ret._unlinkNamespace(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeOwnedElement"));
		return ret;
		// -end- 33598CAA030D remove2_body3CE225CF036F
		// "Namespace::remove2OwnedElement"
	}

	/**
	 * change a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D set_head3CE225CF036F
	// "Namespace::setOwnedElement"
	public ModelElement setOwnedElement(int index, ModelElement ownedElement1)
	// -end- 33598CAA030D set_head3CE225CF036F "Namespace::setOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D set_body3CE225CF036F
		// "Namespace::setOwnedElement"
		ModelElement ret = null;
		ElementOwnership linkobj = (ElementOwnership) ownedElement.get(index);
		ret = linkobj.getOwnedElement();
		linkobj.setOwnedElement(ownedElement1);
		ret._unlinkNamespace(linkobj);
		ownedElement1._linkNamespace(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setOwnedElement"));
		return ret;
		// -end- 33598CAA030D set_body3CE225CF036F "Namespace::setOwnedElement"
	}

	/**
	 * tests if a given OwnedElement is connected.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D test_head3CE225CF036F
	// "Namespace::containsOwnedElement"
	public boolean containsOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D test_head3CE225CF036F
	// "Namespace::containsOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D test_body3CE225CF036F
		// "Namespace::containsOwnedElement"
		return ownedElement.contains(findOwnedElementLink(ownedElement1));
		// -end- 33598CAA030D test_body3CE225CF036F
		// "Namespace::containsOwnedElement"
	}

	/**
	 * used to enumerate all connected OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D get_all_head3CE225CF036F
	// "Namespace::iteratorOwnedElement"
	public java.util.Iterator iteratorOwnedElement()
	// -end- 33598CAA030D get_all_head3CE225CF036F
	// "Namespace::iteratorOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D get_all_body3CE225CF036F
		// "Namespace::iteratorOwnedElement"
		return new java.util.Iterator() {
			private java.util.Iterator i = ownedElement.iterator();

			public boolean hasNext() {
				return i.hasNext();
			}

			public Object next() {
				ElementOwnership next = (ElementOwnership) i.next();
				return next.getOwnedElement();
			}

			public void remove() {
				i.remove();
			}
		};
		// -end- 33598CAA030D get_all_body3CE225CF036F
		// "Namespace::iteratorOwnedElement"
	}

	/**
	 * disconnect all OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove_all_head3CE225CF036F
	// "Namespace::clearOwnedElement"
	public void clearOwnedElement()
	// -end- 33598CAA030D remove_all_head3CE225CF036F
	// "Namespace::clearOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove_all_body3CE225CF036F
		// "Namespace::clearOwnedElement"
		if (sizeOwnedElement() > 0) {
			for (java.util.Iterator p = ownedElement.iterator(); p.hasNext();) {
				ElementOwnership linkobj = (ElementOwnership) p.next();
				linkobj.getOwnedElement()._unlinkNamespace(linkobj);
			}
			ownedElement.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearOwnedElement"));
		}
		// -end- 33598CAA030D remove_all_body3CE225CF036F
		// "Namespace::clearOwnedElement"
	}

	/**
	 * returns the number of OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D size_head3CE225CF036F
	// "Namespace::sizeOwnedElement"
	public int sizeOwnedElement()
	// -end- 33598CAA030D size_head3CE225CF036F "Namespace::sizeOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D size_body3CE225CF036F
		// "Namespace::sizeOwnedElement"
		return ownedElement.size();
		// -end- 33598CAA030D size_body3CE225CF036F
		// "Namespace::sizeOwnedElement"
	}

	/**
	 * enumerate the link objects of currently connected OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D itlink_head3CE225CF036F
	// "Namespace::getOwnedElementLink"
	public java.util.Iterator iteratorOwnedElementLink()
	// -end- 33598CAA030D itlink_head3CE225CF036F
	// "Namespace::getOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D itlink_body3CE225CF036F
		// "Namespace::getOwnedElementLink"
		return ownedElement.iterator();
		// -end- 33598CAA030D itlink_body3CE225CF036F
		// "Namespace::getOwnedElementLink"
	}

	/**
	 * create a link class for a new link to a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D createlink_head3CE225CF036F
	// "Namespace::createOwnedElementLink"
	public ElementOwnership createOwnedElementLink()
	// -end- 33598CAA030D createlink_head3CE225CF036F
	// "Namespace::createOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D createlink_body3CE225CF036F
		// "Namespace::createOwnedElementLink"
		return new ElementOwnership();
		// -end- 33598CAA030D createlink_body3CE225CF036F
		// "Namespace::createOwnedElementLink"
	}

	/**
	 * find a link object for a given OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D find_head3CE225CF036F
	// "Namespace::findOwnedElementLink"
	public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
	// -end- 33598CAA030D find_head3CE225CF036F
	// "Namespace::findOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D find_body3CE225CF036F
		// "Namespace::findOwnedElementLink"
		if (ownedElement1 == null)
			return null;
		for (java.util.Iterator p = ownedElement.iterator(); p.hasNext();) {
			ElementOwnership linkobj = (ElementOwnership) p.next();
			if (linkobj.getOwnedElement() == ownedElement1)
				return linkobj;
		}
		return null;
		// -end- 33598CAA030D find_body3CE225CF036F
		// "Namespace::findOwnedElementLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030D _link_body3CE225CF036F
	// "Namespace::_linkOwnedElement"
	public void _linkOwnedElement(ElementOwnership ownedElement1) {
		ownedElement.add(ownedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkOwnedElement"));
		return;
	}
	// -end- 33598CAA030D _link_body3CE225CF036F "Namespace::_linkOwnedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030D _unlink_body3CE225CF036F
	// "Namespace::_unlinkOwnedElement"
	public void _unlinkOwnedElement(ElementOwnership ownedElement1) {
		ownedElement.remove(ownedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkOwnedElement"));
		return;
	}
	// -end- 33598CAA030D _unlink_body3CE225CF036F
	// "Namespace::_unlinkOwnedElement"

	// -beg- preserve=no 3C2C4E4F0248 code3CE225CF036F "diagram"
	private java.util.Set diagram = new java.util.HashSet();
	// -end- 3C2C4E4F0248 code3CE225CF036F "diagram"

	/**
	 * add a Diagram.
	 *
	 * @see #removeDiagram
	 * @see #containsDiagram
	 * @see #iteratorDiagram
	 * @see #clearDiagram
	 * @see #sizeDiagram
	 */
	// -beg- preserve=no 3C2C4E4F0248 add_head3CE225CF036F
	// "Namespace::addDiagram"
	public void addDiagram(Diagram diagram1)
	// -end- 3C2C4E4F0248 add_head3CE225CF036F "Namespace::addDiagram"
	{
		// -beg- preserve=no 3C2C4E4F0248 add_body3CE225CF036F
		// "Namespace::addDiagram"
		diagram.add(diagram1);
		diagram1._linkNamespace(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addDiagram"));
		return;
		// -end- 3C2C4E4F0248 add_body3CE225CF036F "Namespace::addDiagram"
	}

	/**
	 * disconnect a Diagram.
	 * 
	 * @see #addDiagram
	 */
	// -beg- preserve=no 3C2C4E4F0248 remove_head3CE225CF036F
	// "Namespace::removeDiagram"
	public Diagram removeDiagram(Diagram diagram1)
	// -end- 3C2C4E4F0248 remove_head3CE225CF036F "Namespace::removeDiagram"
	{
		// -beg- preserve=no 3C2C4E4F0248 remove_body3CE225CF036F
		// "Namespace::removeDiagram"
		Diagram ret = null;
		if (diagram1 == null || !diagram.contains(diagram1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = diagram1;
		diagram.remove(diagram1);
		diagram1._unlinkNamespace(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeDiagram"));
		return ret;
		// -end- 3C2C4E4F0248 remove_body3CE225CF036F "Namespace::removeDiagram"
	}

	/**
	 * tests if a given Diagram is connected.
	 * 
	 * @see #addDiagram
	 */
	// -beg- preserve=no 3C2C4E4F0248 test_head3CE225CF036F
	// "Namespace::containsDiagram"
	public boolean containsDiagram(Diagram diagram1)
	// -end- 3C2C4E4F0248 test_head3CE225CF036F "Namespace::containsDiagram"
	{
		// -beg- preserve=no 3C2C4E4F0248 test_body3CE225CF036F
		// "Namespace::containsDiagram"
		return diagram.contains(diagram1);
		// -end- 3C2C4E4F0248 test_body3CE225CF036F "Namespace::containsDiagram"
	}

	/**
	 * used to enumerate all connected Diagrams.
	 * 
	 * @see #addDiagram
	 */
	// -beg- preserve=no 3C2C4E4F0248 get_all_head3CE225CF036F
	// "Namespace::iteratorDiagram"
	public java.util.Iterator iteratorDiagram()
	// -end- 3C2C4E4F0248 get_all_head3CE225CF036F "Namespace::iteratorDiagram"
	{
		// -beg- preserve=no 3C2C4E4F0248 get_all_body3CE225CF036F
		// "Namespace::iteratorDiagram"
		return diagram.iterator();
		// -end- 3C2C4E4F0248 get_all_body3CE225CF036F
		// "Namespace::iteratorDiagram"
	}

	/**
	 * disconnect all Diagrams.
	 * 
	 * @see #addDiagram
	 */
	// -beg- preserve=no 3C2C4E4F0248 remove_all_head3CE225CF036F
	// "Namespace::clearDiagram"
	public void clearDiagram()
	// -end- 3C2C4E4F0248 remove_all_head3CE225CF036F "Namespace::clearDiagram"
	{
		// -beg- preserve=no 3C2C4E4F0248 remove_all_body3CE225CF036F
		// "Namespace::clearDiagram"
		if (sizeDiagram() > 0) {
			for (java.util.Iterator p = diagram.iterator(); p.hasNext();) {
				((Diagram) p.next())._unlinkNamespace(this);
			}
			diagram.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearDiagram"));
		}
		// -end- 3C2C4E4F0248 remove_all_body3CE225CF036F
		// "Namespace::clearDiagram"
	}

	/**
	 * returns the number of Diagrams.
	 * 
	 * @see #addDiagram
	 */
	// -beg- preserve=no 3C2C4E4F0248 size_head3CE225CF036F
	// "Namespace::sizeDiagram"
	public int sizeDiagram()
	// -end- 3C2C4E4F0248 size_head3CE225CF036F "Namespace::sizeDiagram"
	{
		// -beg- preserve=no 3C2C4E4F0248 size_body3CE225CF036F
		// "Namespace::sizeDiagram"
		return diagram.size();
		// -end- 3C2C4E4F0248 size_body3CE225CF036F "Namespace::sizeDiagram"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3C2C4E4F0248 _link_body3CE225CF036F
	// "Namespace::_linkDiagram"
	public void _linkDiagram(Diagram diagram1) {
		diagram.add(diagram1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkDiagram"));
		return;
	}
	// -end- 3C2C4E4F0248 _link_body3CE225CF036F "Namespace::_linkDiagram"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3C2C4E4F0248 _unlink_body3CE225CF036F
	// "Namespace::_unlinkDiagram"
	public void _unlinkDiagram(Diagram diagram1) {
		diagram.remove(diagram1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkDiagram"));
		return;
	}
	// -end- 3C2C4E4F0248 _unlink_body3CE225CF036F "Namespace::_unlinkDiagram"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CE225CF036F detail_end "AbstractNamespace"

	// -end- 3CE225CF036F detail_end "AbstractNamespace"

}
