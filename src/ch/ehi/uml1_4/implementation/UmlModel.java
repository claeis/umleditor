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

// -beg- preserve=no 3C4FDE4A01DE package "UmlModel"
package ch.ehi.uml1_4.implementation;
// -end- 3C4FDE4A01DE package "UmlModel"

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 3C4FDE4A01DE autoimport "UmlModel"
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
// -beg- preserve=no 3C4FDE4A01DE autoimport "UmlModel"
import ch.ehi.uml1_4.modelmanagement.Model;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C4FDE4A01DE import "UmlModel"

// -end- 3C4FDE4A01DE import "UmlModel"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:11 $
 */
public class UmlModel extends AbstractNamespace implements Model, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C4FDE4A01DE detail_begin "UmlModel"

	// -end- 3C4FDE4A01DE detail_begin "UmlModel"

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 3CE4F53500EC head3C4FDE4A01DE "getValidOwnedElements"
	public String[] getValidOwnedElements()
	// -end- 3CE4F53500EC head3C4FDE4A01DE "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CE4F53500EC throws3C4FDE4A01DE "getValidOwnedElements"

	// -end- 3CE4F53500EC throws3C4FDE4A01DE "getValidOwnedElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CE4F53500EC body3C4FDE4A01DE
		// "getValidOwnedElements"
		String ret[] = { "ch.ehi.uml1_4.implementation.UmlPackage", "ch.ehi.interlis.metaobjects.MetaObjectFile" };
		return ret;
		// -end- 3CE4F53500EC body3C4FDE4A01DE "getValidOwnedElements"
	}

	// -beg- preserve=no 3D4FA21703AA head3C4FDE4A01DE "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21703AA head3C4FDE4A01DE "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21703AA throws3C4FDE4A01DE "unlinkAll"

	// -end- 3D4FA21703AA throws3C4FDE4A01DE "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21703AA body3C4FDE4A01DE "unlinkAll"

		clearOwnedElement();
		clearImportedElement();
		clearPresentation();
		clearGeneralization();
		clearSpecialization();
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
		// -end- 3D4FA21703AA body3C4FDE4A01DE "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21703BE head3C4FDE4A01DE "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21703BE head3C4FDE4A01DE "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21703BE throws3C4FDE4A01DE "enumerateChildren"

	// -end- 3D4FA21703BE throws3C4FDE4A01DE "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21703BE body3C4FDE4A01DE "enumerateChildren"
		java.util.Iterator it = null;
		it = iteratorOwnedElement();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorImportedElement();
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
		// -end- 3D4FA21703BE body3C4FDE4A01DE "enumerateChildren"
	}

	// -beg- preserve=no 33598CAA030D code3C4FDE4A01DE "ownedElement"

	// -end- 33598CAA030D code3C4FDE4A01DE "ownedElement"

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
	// -beg- preserve=no 33598CAA030D add_head3C4FDE4A01DE
	// "Namespace::addOwnedElement"
	public void addOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D add_head3C4FDE4A01DE "Namespace::addOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D add_body3C4FDE4A01DE
		// "Namespace::addOwnedElement"
		super.addOwnedElement(ownedElement1);
		// -end- 33598CAA030D add_body3C4FDE4A01DE "Namespace::addOwnedElement"
	}

	// -beg- preserve=no 33598CAA030D add2_head3C4FDE4A01DE
	// "Namespace::add2OwnedElement"
	public void addOwnedElement(int index, ModelElement ownedElement1)
	// -end- 33598CAA030D add2_head3C4FDE4A01DE "Namespace::add2OwnedElement"
	{
		// -beg- preserve=no 33598CAA030D add2_body3C4FDE4A01DE
		// "Namespace::add2OwnedElement"
		super.addOwnedElement(index, ownedElement1);
		// -end- 33598CAA030D add2_body3C4FDE4A01DE
		// "Namespace::add2OwnedElement"
	}

	/**
	 * add a link to a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D addlink_head3C4FDE4A01DE
	// "Namespace::addOwnedElementLink"
	public void addOwnedElementLink(ElementOwnership ownedElement1)
	// -end- 33598CAA030D addlink_head3C4FDE4A01DE
	// "Namespace::addOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D addlink_body3C4FDE4A01DE
		// "Namespace::addOwnedElementLink"
		super.addOwnedElementLink(ownedElement1);
		// -end- 33598CAA030D addlink_body3C4FDE4A01DE
		// "Namespace::addOwnedElementLink"
	}

	/**
	 * disconnect a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove_head3C4FDE4A01DE
	// "Namespace::removeOwnedElement"
	public ModelElement removeOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D remove_head3C4FDE4A01DE
	// "Namespace::removeOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove_body3C4FDE4A01DE
		// "Namespace::removeOwnedElement"
		return super.removeOwnedElement(ownedElement1);
		// -end- 33598CAA030D remove_body3C4FDE4A01DE
		// "Namespace::removeOwnedElement"
	}

	/**
	 * disconnect a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove2_head3C4FDE4A01DE
	// "Namespace::remove2OwnedElement"
	public ModelElement removeOwnedElement(int index)
	// -end- 33598CAA030D remove2_head3C4FDE4A01DE
	// "Namespace::remove2OwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove2_body3C4FDE4A01DE
		// "Namespace::remove2OwnedElement"
		return super.removeOwnedElement(index);
		// -end- 33598CAA030D remove2_body3C4FDE4A01DE
		// "Namespace::remove2OwnedElement"
	}

	/**
	 * change a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D set_head3C4FDE4A01DE
	// "Namespace::setOwnedElement"
	public ModelElement setOwnedElement(int index, ModelElement ownedElement1)
	// -end- 33598CAA030D set_head3C4FDE4A01DE "Namespace::setOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D set_body3C4FDE4A01DE
		// "Namespace::setOwnedElement"
		return super.setOwnedElement(index, ownedElement1);
		// -end- 33598CAA030D set_body3C4FDE4A01DE "Namespace::setOwnedElement"
	}

	/**
	 * tests if a given OwnedElement is connected.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D test_head3C4FDE4A01DE
	// "Namespace::containsOwnedElement"
	public boolean containsOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D test_head3C4FDE4A01DE
	// "Namespace::containsOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D test_body3C4FDE4A01DE
		// "Namespace::containsOwnedElement"
		return super.containsOwnedElement(ownedElement1);
		// -end- 33598CAA030D test_body3C4FDE4A01DE
		// "Namespace::containsOwnedElement"
	}

	/**
	 * used to enumerate all connected OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D get_all_head3C4FDE4A01DE
	// "Namespace::iteratorOwnedElement"
	public java.util.Iterator iteratorOwnedElement()
	// -end- 33598CAA030D get_all_head3C4FDE4A01DE
	// "Namespace::iteratorOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D get_all_body3C4FDE4A01DE
		// "Namespace::iteratorOwnedElement"
		return super.iteratorOwnedElement();
		// -end- 33598CAA030D get_all_body3C4FDE4A01DE
		// "Namespace::iteratorOwnedElement"
	}

	/**
	 * disconnect all OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove_all_head3C4FDE4A01DE
	// "Namespace::clearOwnedElement"
	public void clearOwnedElement()
	// -end- 33598CAA030D remove_all_head3C4FDE4A01DE
	// "Namespace::clearOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove_all_body3C4FDE4A01DE
		// "Namespace::clearOwnedElement"
		super.clearOwnedElement();
		// -end- 33598CAA030D remove_all_body3C4FDE4A01DE
		// "Namespace::clearOwnedElement"
	}

	/**
	 * returns the number of OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D size_head3C4FDE4A01DE
	// "Namespace::sizeOwnedElement"
	public int sizeOwnedElement()
	// -end- 33598CAA030D size_head3C4FDE4A01DE "Namespace::sizeOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D size_body3C4FDE4A01DE
		// "Namespace::sizeOwnedElement"
		return super.sizeOwnedElement();
		// -end- 33598CAA030D size_body3C4FDE4A01DE
		// "Namespace::sizeOwnedElement"
	}

	/**
	 * enumerate the link objects of currently connected OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D itlink_head3C4FDE4A01DE
	// "Namespace::getOwnedElementLink"
	public java.util.Iterator iteratorOwnedElementLink()
	// -end- 33598CAA030D itlink_head3C4FDE4A01DE
	// "Namespace::getOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D itlink_body3C4FDE4A01DE
		// "Namespace::getOwnedElementLink"
		return super.iteratorOwnedElementLink();
		// -end- 33598CAA030D itlink_body3C4FDE4A01DE
		// "Namespace::getOwnedElementLink"
	}

	/**
	 * create a link class for a new link to a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D createlink_head3C4FDE4A01DE
	// "Namespace::createOwnedElementLink"
	public ElementOwnership createOwnedElementLink()
	// -end- 33598CAA030D createlink_head3C4FDE4A01DE
	// "Namespace::createOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D createlink_body3C4FDE4A01DE
		// "Namespace::createOwnedElementLink"
		return super.createOwnedElementLink();
		// -end- 33598CAA030D createlink_body3C4FDE4A01DE
		// "Namespace::createOwnedElementLink"
	}

	/**
	 * find a link object for a given OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D find_head3C4FDE4A01DE
	// "Namespace::findOwnedElementLink"
	public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
	// -end- 33598CAA030D find_head3C4FDE4A01DE
	// "Namespace::findOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D find_body3C4FDE4A01DE
		// "Namespace::findOwnedElementLink"
		return super.findOwnedElementLink(ownedElement1);
		// -end- 33598CAA030D find_body3C4FDE4A01DE
		// "Namespace::findOwnedElementLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030D _link_body3C4FDE4A01DE
	// "Namespace::_linkOwnedElement"
	public void _linkOwnedElement(ElementOwnership ownedElement1) {
		super._linkOwnedElement(ownedElement1);
	}
	// -end- 33598CAA030D _link_body3C4FDE4A01DE "Namespace::_linkOwnedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030D _unlink_body3C4FDE4A01DE
	// "Namespace::_unlinkOwnedElement"
	public void _unlinkOwnedElement(ElementOwnership ownedElement1) {
		super._unlinkOwnedElement(ownedElement1);
	}
	// -end- 33598CAA030D _unlink_body3C4FDE4A01DE
	// "Namespace::_unlinkOwnedElement"

	// -beg- preserve=no 3C8F572001F0 var3C4FDE4A01DE "author"
	private String author;
	// -end- 3C8F572001F0 var3C4FDE4A01DE "author"

	/**
	 * get current value of author author of this model (document)
	 * 
	 * @see #setAuthor
	 */
	// -beg- preserve=no 3C8F572001F0 get_head3C4FDE4A01DE "author"
	public String getAuthor()
	// -end- 3C8F572001F0 get_head3C4FDE4A01DE "author"
	{
		// -beg- preserve=no 3C8F572001F0 get_body3C4FDE4A01DE "author"
		return author;
		// -end- 3C8F572001F0 get_body3C4FDE4A01DE "author"
	}

	/**
	 * set current value of author
	 * 
	 * @see #getAuthor
	 */
	// -beg- preserve=no 3C8F572001F0 set_head3C4FDE4A01DE "author"
	public void setAuthor(String value1)
	// -end- 3C8F572001F0 set_head3C4FDE4A01DE "author"
	{
		// -beg- preserve=no 3C8F572001F0 set_body3C4FDE4A01DE "author"
		if (author != value1) {
			author = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAuthor"));
		}
		// -end- 3C8F572001F0 set_body3C4FDE4A01DE "author"
	}

	// -beg- preserve=no 3C8F572C03B0 var3C4FDE4A01DE "version"
	private String version;
	// -end- 3C8F572C03B0 var3C4FDE4A01DE "version"

	/**
	 * get current value of version version of this model (document)
	 * 
	 * @see #setVersion
	 */
	// -beg- preserve=no 3C8F572C03B0 get_head3C4FDE4A01DE "version"
	public String getVersion()
	// -end- 3C8F572C03B0 get_head3C4FDE4A01DE "version"
	{
		// -beg- preserve=no 3C8F572C03B0 get_body3C4FDE4A01DE "version"
		return version;
		// -end- 3C8F572C03B0 get_body3C4FDE4A01DE "version"
	}

	/**
	 * set current value of version
	 * 
	 * @see #getVersion
	 */
	// -beg- preserve=no 3C8F572C03B0 set_head3C4FDE4A01DE "version"
	public void setVersion(String value1)
	// -end- 3C8F572C03B0 set_head3C4FDE4A01DE "version"
	{
		// -beg- preserve=no 3C8F572C03B0 set_body3C4FDE4A01DE "version"
		if (version != value1) {
			version = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setVersion"));
		}
		// -end- 3C8F572C03B0 set_body3C4FDE4A01DE "version"
	}

	// -beg- preserve=no 33CD739B02DA code3C4FDE4A01DE "importedElement"
	private java.util.Set importedElement = new java.util.HashSet();
	// -end- 33CD739B02DA code3C4FDE4A01DE "importedElement"

	/**
	 * add a ImportedElement. The namespace defined by a package is extended by
	 * modelelements in other, imported packages.
	 * 
	 * @see #removeImportedElement
	 * @see #containsImportedElement
	 * @see #iteratorImportedElement
	 * @see #clearImportedElement
	 * @see #sizeImportedElement
	 * @see #iteratorImportedElementLink
	 * @see #createImportedElementLink
	 * @see #findImportedElementLink
	 */
	// -beg- preserve=no 33CD739B02DA add_head3C4FDE4A01DE
	// "Package::addImportedElement"
	public void addImportedElement(ModelElement importedElement1)
	// -end- 33CD739B02DA add_head3C4FDE4A01DE "Package::addImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA add_body3C4FDE4A01DE
		// "Package::addImportedElement"
		ElementImport linkobj = createImportedElementLink();
		linkobj.setImportedElement(importedElement1);
		linkobj.setImportedBy(this);
		importedElement.add(linkobj);
		importedElement1._linkImportedBy(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addImportedElement"));
		return;
		// -end- 33CD739B02DA add_body3C4FDE4A01DE "Package::addImportedElement"
	}

	/**
	 * add a link to a ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA addlink_head3C4FDE4A01DE
	// "Package::addImportedElementLink"
	public void addImportedElementLink(ElementImport importedElement1)
	// -end- 33CD739B02DA addlink_head3C4FDE4A01DE
	// "Package::addImportedElementLink"
	{
		// -beg- preserve=no 33CD739B02DA addlink_body3C4FDE4A01DE
		// "Package::addImportedElementLink"
		importedElement1.setImportedBy(this);
		importedElement.add(importedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addImportedElementLink"));
		return;
		// -end- 33CD739B02DA addlink_body3C4FDE4A01DE
		// "Package::addImportedElementLink"
	}

	/**
	 * disconnect a ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA remove_head3C4FDE4A01DE
	// "Package::removeImportedElement"
	public ModelElement removeImportedElement(ModelElement importedElement1)
	// -end- 33CD739B02DA remove_head3C4FDE4A01DE
	// "Package::removeImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA remove_body3C4FDE4A01DE
		// "Package::removeImportedElement"
		ModelElement ret = null;
		ElementImport linkobj = findImportedElementLink(importedElement1);
		if (importedElement1 == null || linkobj == null) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = linkobj.getImportedElement();
		importedElement.remove(linkobj);
		ret._unlinkImportedBy(linkobj);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeImportedElement"));
		return ret;
		// -end- 33CD739B02DA remove_body3C4FDE4A01DE
		// "Package::removeImportedElement"
	}

	/**
	 * tests if a given ImportedElement is connected.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA test_head3C4FDE4A01DE
	// "Package::containsImportedElement"
	public boolean containsImportedElement(ModelElement importedElement1)
	// -end- 33CD739B02DA test_head3C4FDE4A01DE
	// "Package::containsImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA test_body3C4FDE4A01DE
		// "Package::containsImportedElement"
		return importedElement.contains(findImportedElementLink(importedElement1));
		// -end- 33CD739B02DA test_body3C4FDE4A01DE
		// "Package::containsImportedElement"
	}

	/**
	 * used to enumerate all connected ImportedElements.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA get_all_head3C4FDE4A01DE
	// "Package::iteratorImportedElement"
	public java.util.Iterator iteratorImportedElement()
	// -end- 33CD739B02DA get_all_head3C4FDE4A01DE
	// "Package::iteratorImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA get_all_body3C4FDE4A01DE
		// "Package::iteratorImportedElement"
		return new java.util.Iterator() {
			private java.util.Iterator i = importedElement.iterator();

			public boolean hasNext() {
				return i.hasNext();
			}

			public Object next() {
				ElementImport next = (ElementImport) i.next();
				return next.getImportedElement();
			}

			public void remove() {
				i.remove();
			}
		};
		// -end- 33CD739B02DA get_all_body3C4FDE4A01DE
		// "Package::iteratorImportedElement"
	}

	/**
	 * disconnect all ImportedElements.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA remove_all_head3C4FDE4A01DE
	// "Package::clearImportedElement"
	public void clearImportedElement()
	// -end- 33CD739B02DA remove_all_head3C4FDE4A01DE
	// "Package::clearImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA remove_all_body3C4FDE4A01DE
		// "Package::clearImportedElement"
		if (sizeImportedElement() > 0) {
			for (java.util.Iterator p = importedElement.iterator(); p.hasNext();) {
				ElementImport linkobj = (ElementImport) p.next();
				linkobj.getImportedElement()._unlinkImportedBy(linkobj);
			}
			importedElement.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearImportedElement"));
		}
		// -end- 33CD739B02DA remove_all_body3C4FDE4A01DE
		// "Package::clearImportedElement"
	}

	/**
	 * returns the number of ImportedElements.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA size_head3C4FDE4A01DE
	// "Package::sizeImportedElement"
	public int sizeImportedElement()
	// -end- 33CD739B02DA size_head3C4FDE4A01DE "Package::sizeImportedElement"
	{
		// -beg- preserve=no 33CD739B02DA size_body3C4FDE4A01DE
		// "Package::sizeImportedElement"
		return importedElement.size();
		// -end- 33CD739B02DA size_body3C4FDE4A01DE
		// "Package::sizeImportedElement"
	}

	/**
	 * enumerate the link objects of currently connected ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA itlink_head3C4FDE4A01DE
	// "Package::getImportedElementLink"
	public java.util.Iterator iteratorImportedElementLink()
	// -end- 33CD739B02DA itlink_head3C4FDE4A01DE
	// "Package::getImportedElementLink"
	{
		// -beg- preserve=no 33CD739B02DA itlink_body3C4FDE4A01DE
		// "Package::getImportedElementLink"
		return importedElement.iterator();
		// -end- 33CD739B02DA itlink_body3C4FDE4A01DE
		// "Package::getImportedElementLink"
	}

	/**
	 * create a link class for a new link to a ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA createlink_head3C4FDE4A01DE
	// "Package::createImportedElementLink"
	public ElementImport createImportedElementLink()
	// -end- 33CD739B02DA createlink_head3C4FDE4A01DE
	// "Package::createImportedElementLink"
	{
		// -beg- preserve=no 33CD739B02DA createlink_body3C4FDE4A01DE
		// "Package::createImportedElementLink"
		// return new ElementImport();
		throw new java.lang.UnsupportedOperationException();
		// -end- 33CD739B02DA createlink_body3C4FDE4A01DE
		// "Package::createImportedElementLink"
	}

	/**
	 * find a link object for a given ImportedElement.
	 * 
	 * @see #addImportedElement
	 */
	// -beg- preserve=no 33CD739B02DA find_head3C4FDE4A01DE
	// "Package::findImportedElementLink"
	public ElementImport findImportedElementLink(ModelElement importedElement1)
	// -end- 33CD739B02DA find_head3C4FDE4A01DE
	// "Package::findImportedElementLink"
	{
		// -beg- preserve=no 33CD739B02DA find_body3C4FDE4A01DE
		// "Package::findImportedElementLink"
		if (importedElement1 == null)
			return null;
		for (java.util.Iterator p = importedElement.iterator(); p.hasNext();) {
			ElementImport linkobj = (ElementImport) p.next();
			if (linkobj.getImportedElement() == importedElement1)
				return linkobj;
		}
		return null;
		// -end- 33CD739B02DA find_body3C4FDE4A01DE
		// "Package::findImportedElementLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CD739B02DA _link_body3C4FDE4A01DE
	// "Package::_linkImportedElement"
	public void _linkImportedElement(ElementImport importedElement1) {
		importedElement.add(importedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkImportedElement"));
		return;
	}
	// -end- 33CD739B02DA _link_body3C4FDE4A01DE "Package::_linkImportedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CD739B02DA _unlink_body3C4FDE4A01DE
	// "Package::_unlinkImportedElement"
	public void _unlinkImportedElement(ElementImport importedElement1) {
		importedElement.remove(importedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkImportedElement"));
		return;
	}
	// -end- 33CD739B02DA _unlink_body3C4FDE4A01DE
	// "Package::_unlinkImportedElement"

	// -beg- preserve=no 362409A9000A code3C4FDE4A01DE "presentation"

	// -end- 362409A9000A code3C4FDE4A01DE "presentation"

	/**
	 * add a Presentation.
	 *
	 * @see #removePresentation
	 * @see #containsPresentation
	 * @see #iteratorPresentation
	 * @see #clearPresentation
	 * @see #sizePresentation
	 */
	// -beg- preserve=no 362409A9000A add_head3C4FDE4A01DE
	// "ModelElement::addPresentation"
	public void addPresentation(PresentationElement presentation1)
	// -end- 362409A9000A add_head3C4FDE4A01DE "ModelElement::addPresentation"
	{
		// -beg- preserve=no 362409A9000A add_body3C4FDE4A01DE
		// "ModelElement::addPresentation"
		super.addPresentation(presentation1);
		// -end- 362409A9000A add_body3C4FDE4A01DE
		// "ModelElement::addPresentation"
	}

	/**
	 * disconnect a Presentation.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_head3C4FDE4A01DE
	// "ModelElement::removePresentation"
	public PresentationElement removePresentation(PresentationElement presentation1)
	// -end- 362409A9000A remove_head3C4FDE4A01DE
	// "ModelElement::removePresentation"
	{
		// -beg- preserve=no 362409A9000A remove_body3C4FDE4A01DE
		// "ModelElement::removePresentation"
		return super.removePresentation(presentation1);
		// -end- 362409A9000A remove_body3C4FDE4A01DE
		// "ModelElement::removePresentation"
	}

	/**
	 * tests if a given Presentation is connected.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A test_head3C4FDE4A01DE
	// "ModelElement::containsPresentation"
	public boolean containsPresentation(PresentationElement presentation1)
	// -end- 362409A9000A test_head3C4FDE4A01DE
	// "ModelElement::containsPresentation"
	{
		// -beg- preserve=no 362409A9000A test_body3C4FDE4A01DE
		// "ModelElement::containsPresentation"
		return super.containsPresentation(presentation1);
		// -end- 362409A9000A test_body3C4FDE4A01DE
		// "ModelElement::containsPresentation"
	}

	/**
	 * used to enumerate all connected Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A get_all_head3C4FDE4A01DE
	// "ModelElement::iteratorPresentation"
	public java.util.Iterator iteratorPresentation()
	// -end- 362409A9000A get_all_head3C4FDE4A01DE
	// "ModelElement::iteratorPresentation"
	{
		// -beg- preserve=no 362409A9000A get_all_body3C4FDE4A01DE
		// "ModelElement::iteratorPresentation"
		return super.iteratorPresentation();
		// -end- 362409A9000A get_all_body3C4FDE4A01DE
		// "ModelElement::iteratorPresentation"
	}

	/**
	 * disconnect all Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_all_head3C4FDE4A01DE
	// "ModelElement::clearPresentation"
	public void clearPresentation()
	// -end- 362409A9000A remove_all_head3C4FDE4A01DE
	// "ModelElement::clearPresentation"
	{
		// -beg- preserve=no 362409A9000A remove_all_body3C4FDE4A01DE
		// "ModelElement::clearPresentation"
		super.clearPresentation();
		// -end- 362409A9000A remove_all_body3C4FDE4A01DE
		// "ModelElement::clearPresentation"
	}

	/**
	 * returns the number of Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A size_head3C4FDE4A01DE
	// "ModelElement::sizePresentation"
	public int sizePresentation()
	// -end- 362409A9000A size_head3C4FDE4A01DE "ModelElement::sizePresentation"
	{
		// -beg- preserve=no 362409A9000A size_body3C4FDE4A01DE
		// "ModelElement::sizePresentation"
		return super.sizePresentation();
		// -end- 362409A9000A size_body3C4FDE4A01DE
		// "ModelElement::sizePresentation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _link_body3C4FDE4A01DE
	// "ModelElement::_linkPresentation"
	public void _linkPresentation(PresentationElement presentation1) {
		super._linkPresentation(presentation1);
	}
	// -end- 362409A9000A _link_body3C4FDE4A01DE
	// "ModelElement::_linkPresentation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _unlink_body3C4FDE4A01DE
	// "ModelElement::_unlinkPresentation"
	public void _unlinkPresentation(PresentationElement presentation1) {
		super._unlinkPresentation(presentation1);
	}
	// -end- 362409A9000A _unlink_body3C4FDE4A01DE
	// "ModelElement::_unlinkPresentation"

	// -beg- preserve=no 335C14A5019A code3C4FDE4A01DE "generalization"
	private java.util.Set generalization = new java.util.HashSet();
	// -end- 335C14A5019A code3C4FDE4A01DE "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head3C4FDE4A01DE
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head3C4FDE4A01DE
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body3C4FDE4A01DE
		// "GeneralizableElement::addGeneralization"
		generalization.add(generalization1);
		generalization1._linkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addGeneralization"));
		return;
		// -end- 335C14A5019A add_body3C4FDE4A01DE
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head3C4FDE4A01DE
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head3C4FDE4A01DE
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body3C4FDE4A01DE
		// "GeneralizableElement::removeGeneralization"
		Generalization ret = null;
		if (generalization1 == null || !generalization.contains(generalization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = generalization1;
		generalization.remove(generalization1);
		generalization1._unlinkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeGeneralization"));
		return ret;
		// -end- 335C14A5019A remove_body3C4FDE4A01DE
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head3C4FDE4A01DE
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head3C4FDE4A01DE
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body3C4FDE4A01DE
		// "GeneralizableElement::containsGeneralization"
		return generalization.contains(generalization1);
		// -end- 335C14A5019A test_body3C4FDE4A01DE
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head3C4FDE4A01DE
	// "GeneralizableElement::iteratorGeneralization"
	public java.util.Iterator iteratorGeneralization()
	// -end- 335C14A5019A get_all_head3C4FDE4A01DE
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body3C4FDE4A01DE
		// "GeneralizableElement::iteratorGeneralization"
		return generalization.iterator();
		// -end- 335C14A5019A get_all_body3C4FDE4A01DE
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head3C4FDE4A01DE
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head3C4FDE4A01DE
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body3C4FDE4A01DE
		// "GeneralizableElement::clearGeneralization"
		if (sizeGeneralization() > 0) {
			for (java.util.Iterator p = generalization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkChild(this);
			}
			generalization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearGeneralization"));
		}
		// -end- 335C14A5019A remove_all_body3C4FDE4A01DE
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head3C4FDE4A01DE
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head3C4FDE4A01DE
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body3C4FDE4A01DE
		// "GeneralizableElement::sizeGeneralization"
		return generalization.size();
		// -end- 335C14A5019A size_body3C4FDE4A01DE
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body3C4FDE4A01DE
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		generalization.add(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _link_body3C4FDE4A01DE
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body3C4FDE4A01DE
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		generalization.remove(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _unlink_body3C4FDE4A01DE
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code3C4FDE4A01DE "specialization"
	private java.util.Set specialization = new java.util.HashSet();
	// -end- 335C146B01D6 code3C4FDE4A01DE "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head3C4FDE4A01DE
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head3C4FDE4A01DE
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body3C4FDE4A01DE
		// "GeneralizableElement::addSpecialization"
		specialization.add(specialization1);
		specialization1._linkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecialization"));
		return;
		// -end- 335C146B01D6 add_body3C4FDE4A01DE
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head3C4FDE4A01DE
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head3C4FDE4A01DE
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body3C4FDE4A01DE
		// "GeneralizableElement::removeSpecialization"
		Generalization ret = null;
		if (specialization1 == null || !specialization.contains(specialization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = specialization1;
		specialization.remove(specialization1);
		specialization1._unlinkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSpecialization"));
		return ret;
		// -end- 335C146B01D6 remove_body3C4FDE4A01DE
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head3C4FDE4A01DE
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head3C4FDE4A01DE
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body3C4FDE4A01DE
		// "GeneralizableElement::containsSpecialization"
		return specialization.contains(specialization1);
		// -end- 335C146B01D6 test_body3C4FDE4A01DE
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head3C4FDE4A01DE
	// "GeneralizableElement::iteratorSpecialization"
	public java.util.Iterator iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head3C4FDE4A01DE
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body3C4FDE4A01DE
		// "GeneralizableElement::iteratorSpecialization"
		return specialization.iterator();
		// -end- 335C146B01D6 get_all_body3C4FDE4A01DE
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head3C4FDE4A01DE
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head3C4FDE4A01DE
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body3C4FDE4A01DE
		// "GeneralizableElement::clearSpecialization"
		if (sizeSpecialization() > 0) {
			for (java.util.Iterator p = specialization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkParent(this);
			}
			specialization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecialization"));
		}
		// -end- 335C146B01D6 remove_all_body3C4FDE4A01DE
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head3C4FDE4A01DE
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head3C4FDE4A01DE
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body3C4FDE4A01DE
		// "GeneralizableElement::sizeSpecialization"
		return specialization.size();
		// -end- 335C146B01D6 size_body3C4FDE4A01DE
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body3C4FDE4A01DE
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		specialization.add(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _link_body3C4FDE4A01DE
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body3C4FDE4A01DE
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		specialization.remove(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _unlink_body3C4FDE4A01DE
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 327A877801CC var3C4FDE4A01DE "isRoot"
	private boolean isRoot;
	// -end- 327A877801CC var3C4FDE4A01DE "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head3C4FDE4A01DE "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head3C4FDE4A01DE "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body3C4FDE4A01DE "isRoot"
		return isRoot;
		// -end- 327A877801CC get_body3C4FDE4A01DE "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head3C4FDE4A01DE "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head3C4FDE4A01DE "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body3C4FDE4A01DE "isRoot"
		if (isRoot != value1) {
			isRoot = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRoot"));
		}
		// -end- 327A877801CC set_body3C4FDE4A01DE "isRoot"
	}

	// -beg- preserve=no 327A877E006E var3C4FDE4A01DE "isLeaf"
	private boolean isLeaf;
	// -end- 327A877E006E var3C4FDE4A01DE "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head3C4FDE4A01DE "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head3C4FDE4A01DE "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body3C4FDE4A01DE "isLeaf"
		return isLeaf;
		// -end- 327A877E006E get_body3C4FDE4A01DE "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head3C4FDE4A01DE "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head3C4FDE4A01DE "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body3C4FDE4A01DE "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLeaf"));
		}
		// -end- 327A877E006E set_body3C4FDE4A01DE "isLeaf"
	}

	// -beg- preserve=no 327A878400D2 var3C4FDE4A01DE "isAbstract"
	private boolean isAbstract;
	// -end- 327A878400D2 var3C4FDE4A01DE "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 327A878400D2 get_head3C4FDE4A01DE "isAbstract"
	public boolean isAbstract()
	// -end- 327A878400D2 get_head3C4FDE4A01DE "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 get_body3C4FDE4A01DE "isAbstract"
		return isAbstract;
		// -end- 327A878400D2 get_body3C4FDE4A01DE "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 327A878400D2 set_head3C4FDE4A01DE "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 327A878400D2 set_head3C4FDE4A01DE "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 set_body3C4FDE4A01DE "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 327A878400D2 set_body3C4FDE4A01DE "isAbstract"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMettaAttrb(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C4FDE4A01DE detail_end "UmlModel"

	// -end- 3C4FDE4A01DE detail_end "UmlModel"

}
