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

// -beg- preserve=no 3E42404202F6 package "AbstractDependency"
package ch.ehi.uml1_4.implementation;
// -end- 3E42404202F6 package "AbstractDependency"

// -beg- preserve=no 3E42404202F6 autoimport "AbstractDependency"
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.basics.types.NlsString;
// -end- 3E42404202F6 autoimport "AbstractDependency"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3E42404202F6 import "AbstractDependency"

// -end- 3E42404202F6 import "AbstractDependency"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:50 $
 */
public abstract class AbstractDependency extends AbstractModelElement implements Dependency {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3E42404202F6 detail_begin "AbstractDependency"

	// -end- 3E42404202F6 detail_begin "AbstractDependency"

	private static final long serialVersionUID = -3492473053374185782L;

	// -beg- preserve=no 3E42412A026D head3E42404202F6 "unlinkAll"
	public void unlinkAll()
	// -end- 3E42412A026D head3E42404202F6 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E42412A026D throws3E42404202F6 "unlinkAll"

	// -end- 3E42412A026D throws3E42404202F6 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3E42412A026D body3E42404202F6 "unlinkAll"

		clearClient();
		clearSupplier();
		clearPresentation();
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
		// -end- 3E42412A026D body3E42404202F6 "unlinkAll"
	}

	// -beg- preserve=no 3E42412D01B3 head3E42404202F6 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3E42412D01B3 head3E42404202F6 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E42412D01B3 throws3E42404202F6 "enumerateChildren"

	// -end- 3E42412D01B3 throws3E42404202F6 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3E42412D01B3 body3E42404202F6 "enumerateChildren"
		java.util.Iterator it = null;
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
		// -end- 3E42412D01B3 body3E42404202F6 "enumerateChildren"
	}

	// -beg- preserve=no 3E4256D201CF head3E42404202F6 "changeClient"
	public void changeClient(ModelElement oldClient, ModelElement newClient)
	// -end- 3E4256D201CF head3E42404202F6 "changeClient"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E4256D201CF throws3E42404202F6 "changeClient"

	// -end- 3E4256D201CF throws3E42404202F6 "changeClient"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E4256D201CF body3E42404202F6 "changeClient"
		if (oldClient == null || !client.contains(oldClient)) {
			throw new java.lang.IllegalArgumentException("cannot change null or unknown object");
		}
		client.remove(oldClient);
		oldClient._unlinkClientDependency(this);
		client.add(newClient);
		newClient._linkClientDependency(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "changeClient"));
		return;
		// -end- 3E4256D201CF body3E42404202F6 "changeClient"
	}

	// -beg- preserve=no 3E4256D201F7 head3E42404202F6 "changeSupplier"
	public void changeSupplier(ModelElement oldSupplier, ModelElement newSupplier)
	// -end- 3E4256D201F7 head3E42404202F6 "changeSupplier"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E4256D201F7 throws3E42404202F6 "changeSupplier"

	// -end- 3E4256D201F7 throws3E42404202F6 "changeSupplier"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E4256D201F7 body3E42404202F6 "changeSupplier"
		if (oldSupplier == null || !supplier.contains(oldSupplier)) {
			throw new java.lang.IllegalArgumentException("cannot change null or unknown object");
		}
		supplier.remove(oldSupplier);
		oldSupplier._unlinkSupplierDependency(this);
		supplier.add(newSupplier);
		newSupplier._linkSupplierDependency(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "changeSupplier"));
		return;
		// -end- 3E4256D201F7 body3E42404202F6 "changeSupplier"
	}

	// -beg- preserve=no 33FFE57B03B3 code3E42404202F6 "client"
	private java.util.Set client = new java.util.HashSet();
	// -end- 33FFE57B03B3 code3E42404202F6 "client"

	/**
	 * add a Client.
	 *
	 * @see #removeClient
	 * @see #containsClient
	 * @see #iteratorClient
	 * @see #clearClient
	 * @see #sizeClient
	 */
	// -beg- preserve=no 33FFE57B03B3 add_head3E42404202F6
	// "Dependency::addClient"
	public void addClient(ModelElement client1)
	// -end- 33FFE57B03B3 add_head3E42404202F6 "Dependency::addClient"
	{
		// -beg- preserve=no 33FFE57B03B3 add_body3E42404202F6
		// "Dependency::addClient"
		client.add(client1);
		client1._linkClientDependency(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addClient"));
		return;
		// -end- 33FFE57B03B3 add_body3E42404202F6 "Dependency::addClient"
	}

	/**
	 * disconnect a Client.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 remove_head3E42404202F6
	// "Dependency::removeClient"
	public ModelElement removeClient(ModelElement client1)
	// -end- 33FFE57B03B3 remove_head3E42404202F6 "Dependency::removeClient"
	{
		// -beg- preserve=no 33FFE57B03B3 remove_body3E42404202F6
		// "Dependency::removeClient"
		ModelElement ret = null;
		if (client1 == null || !client.contains(client1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = client1;
		client.remove(client1);
		client1._unlinkClientDependency(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeClient"));
		return ret;
		// -end- 33FFE57B03B3 remove_body3E42404202F6 "Dependency::removeClient"
	}

	/**
	 * tests if a given Client is connected.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 test_head3E42404202F6
	// "Dependency::containsClient"
	public boolean containsClient(ModelElement client1)
	// -end- 33FFE57B03B3 test_head3E42404202F6 "Dependency::containsClient"
	{
		// -beg- preserve=no 33FFE57B03B3 test_body3E42404202F6
		// "Dependency::containsClient"
		return client.contains(client1);
		// -end- 33FFE57B03B3 test_body3E42404202F6 "Dependency::containsClient"
	}

	/**
	 * used to enumerate all connected Clients.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 get_all_head3E42404202F6
	// "Dependency::iteratorClient"
	public java.util.Iterator iteratorClient()
	// -end- 33FFE57B03B3 get_all_head3E42404202F6 "Dependency::iteratorClient"
	{
		// -beg- preserve=no 33FFE57B03B3 get_all_body3E42404202F6
		// "Dependency::iteratorClient"
		return client.iterator();
		// -end- 33FFE57B03B3 get_all_body3E42404202F6
		// "Dependency::iteratorClient"
	}

	/**
	 * disconnect all Clients.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 remove_all_head3E42404202F6
	// "Dependency::clearClient"
	public void clearClient()
	// -end- 33FFE57B03B3 remove_all_head3E42404202F6 "Dependency::clearClient"
	{
		// -beg- preserve=no 33FFE57B03B3 remove_all_body3E42404202F6
		// "Dependency::clearClient"
		if (sizeClient() > 0) {
			for (java.util.Iterator p = client.iterator(); p.hasNext();) {
				((ModelElement) p.next())._unlinkClientDependency(this);
			}
			client.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearClient"));
		}
		// -end- 33FFE57B03B3 remove_all_body3E42404202F6
		// "Dependency::clearClient"
	}

	/**
	 * returns the number of Clients.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 size_head3E42404202F6
	// "Dependency::sizeClient"
	public int sizeClient()
	// -end- 33FFE57B03B3 size_head3E42404202F6 "Dependency::sizeClient"
	{
		// -beg- preserve=no 33FFE57B03B3 size_body3E42404202F6
		// "Dependency::sizeClient"
		return client.size();
		// -end- 33FFE57B03B3 size_body3E42404202F6 "Dependency::sizeClient"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B03B3 _link_body3E42404202F6
	// "Dependency::_linkClient"
	public void _linkClient(ModelElement client1) {
		client.add(client1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkClient"));
		return;
	}
	// -end- 33FFE57B03B3 _link_body3E42404202F6 "Dependency::_linkClient"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B03B3 _unlink_body3E42404202F6
	// "Dependency::_unlinkClient"
	public void _unlinkClient(ModelElement client1) {
		client.remove(client1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkClient"));
		return;
	}
	// -end- 33FFE57B03B3 _unlink_body3E42404202F6 "Dependency::_unlinkClient"

	// -beg- preserve=no 335C0D7A02E4 code3E42404202F6 "supplier"
	private java.util.Set supplier = new java.util.HashSet();
	// -end- 335C0D7A02E4 code3E42404202F6 "supplier"

	/**
	 * add a Supplier.
	 *
	 * @see #removeSupplier
	 * @see #containsSupplier
	 * @see #iteratorSupplier
	 * @see #clearSupplier
	 * @see #sizeSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 add_head3E42404202F6
	// "Dependency::addSupplier"
	public void addSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 add_head3E42404202F6 "Dependency::addSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 add_body3E42404202F6
		// "Dependency::addSupplier"
		supplier.add(supplier1);
		supplier1._linkSupplierDependency(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSupplier"));
		return;
		// -end- 335C0D7A02E4 add_body3E42404202F6 "Dependency::addSupplier"
	}

	/**
	 * disconnect a Supplier.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 remove_head3E42404202F6
	// "Dependency::removeSupplier"
	public ModelElement removeSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 remove_head3E42404202F6 "Dependency::removeSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 remove_body3E42404202F6
		// "Dependency::removeSupplier"
		ModelElement ret = null;
		if (supplier1 == null || !supplier.contains(supplier1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = supplier1;
		supplier.remove(supplier1);
		supplier1._unlinkSupplierDependency(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSupplier"));
		return ret;
		// -end- 335C0D7A02E4 remove_body3E42404202F6
		// "Dependency::removeSupplier"
	}

	/**
	 * tests if a given Supplier is connected.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 test_head3E42404202F6
	// "Dependency::containsSupplier"
	public boolean containsSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 test_head3E42404202F6 "Dependency::containsSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 test_body3E42404202F6
		// "Dependency::containsSupplier"
		return supplier.contains(supplier1);
		// -end- 335C0D7A02E4 test_body3E42404202F6
		// "Dependency::containsSupplier"
	}

	/**
	 * used to enumerate all connected Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 get_all_head3E42404202F6
	// "Dependency::iteratorSupplier"
	public java.util.Iterator iteratorSupplier()
	// -end- 335C0D7A02E4 get_all_head3E42404202F6
	// "Dependency::iteratorSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 get_all_body3E42404202F6
		// "Dependency::iteratorSupplier"
		return supplier.iterator();
		// -end- 335C0D7A02E4 get_all_body3E42404202F6
		// "Dependency::iteratorSupplier"
	}

	/**
	 * disconnect all Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 remove_all_head3E42404202F6
	// "Dependency::clearSupplier"
	public void clearSupplier()
	// -end- 335C0D7A02E4 remove_all_head3E42404202F6
	// "Dependency::clearSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 remove_all_body3E42404202F6
		// "Dependency::clearSupplier"
		if (sizeSupplier() > 0) {
			for (java.util.Iterator p = supplier.iterator(); p.hasNext();) {
				((ModelElement) p.next())._unlinkSupplierDependency(this);
			}
			supplier.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSupplier"));
		}
		// -end- 335C0D7A02E4 remove_all_body3E42404202F6
		// "Dependency::clearSupplier"
	}

	/**
	 * returns the number of Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 size_head3E42404202F6
	// "Dependency::sizeSupplier"
	public int sizeSupplier()
	// -end- 335C0D7A02E4 size_head3E42404202F6 "Dependency::sizeSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 size_body3E42404202F6
		// "Dependency::sizeSupplier"
		return supplier.size();
		// -end- 335C0D7A02E4 size_body3E42404202F6 "Dependency::sizeSupplier"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02E4 _link_body3E42404202F6
	// "Dependency::_linkSupplier"
	public void _linkSupplier(ModelElement supplier1) {
		supplier.add(supplier1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSupplier"));
		return;
	}
	// -end- 335C0D7A02E4 _link_body3E42404202F6 "Dependency::_linkSupplier"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02E4 _unlink_body3E42404202F6
	// "Dependency::_unlinkSupplier"
	public void _unlinkSupplier(ModelElement supplier1) {
		supplier.remove(supplier1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSupplier"));
		return;
	}
	// -end- 335C0D7A02E4 _unlink_body3E42404202F6 "Dependency::_unlinkSupplier"

	// -beg- preserve=no 362409A9000A code3E42404202F6 "presentation"

	// -end- 362409A9000A code3E42404202F6 "presentation"

	/**
	 * add a Presentation.
	 *
	 * @see #removePresentation
	 * @see #containsPresentation
	 * @see #iteratorPresentation
	 * @see #clearPresentation
	 * @see #sizePresentation
	 */
	// -beg- preserve=no 362409A9000A add_head3E42404202F6
	// "ModelElement::addPresentation"
	public void addPresentation(PresentationElement presentation1)
	// -end- 362409A9000A add_head3E42404202F6 "ModelElement::addPresentation"
	{
		// -beg- preserve=no 362409A9000A add_body3E42404202F6
		// "ModelElement::addPresentation"
		super.addPresentation(presentation1);
		// -end- 362409A9000A add_body3E42404202F6
		// "ModelElement::addPresentation"
	}

	/**
	 * disconnect a Presentation.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_head3E42404202F6
	// "ModelElement::removePresentation"
	public PresentationElement removePresentation(PresentationElement presentation1)
	// -end- 362409A9000A remove_head3E42404202F6
	// "ModelElement::removePresentation"
	{
		// -beg- preserve=no 362409A9000A remove_body3E42404202F6
		// "ModelElement::removePresentation"
		return super.removePresentation(presentation1);
		// -end- 362409A9000A remove_body3E42404202F6
		// "ModelElement::removePresentation"
	}

	/**
	 * tests if a given Presentation is connected.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A test_head3E42404202F6
	// "ModelElement::containsPresentation"
	public boolean containsPresentation(PresentationElement presentation1)
	// -end- 362409A9000A test_head3E42404202F6
	// "ModelElement::containsPresentation"
	{
		// -beg- preserve=no 362409A9000A test_body3E42404202F6
		// "ModelElement::containsPresentation"
		return super.containsPresentation(presentation1);
		// -end- 362409A9000A test_body3E42404202F6
		// "ModelElement::containsPresentation"
	}

	/**
	 * used to enumerate all connected Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A get_all_head3E42404202F6
	// "ModelElement::iteratorPresentation"
	public java.util.Iterator iteratorPresentation()
	// -end- 362409A9000A get_all_head3E42404202F6
	// "ModelElement::iteratorPresentation"
	{
		// -beg- preserve=no 362409A9000A get_all_body3E42404202F6
		// "ModelElement::iteratorPresentation"
		return super.iteratorPresentation();
		// -end- 362409A9000A get_all_body3E42404202F6
		// "ModelElement::iteratorPresentation"
	}

	/**
	 * disconnect all Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_all_head3E42404202F6
	// "ModelElement::clearPresentation"
	public void clearPresentation()
	// -end- 362409A9000A remove_all_head3E42404202F6
	// "ModelElement::clearPresentation"
	{
		// -beg- preserve=no 362409A9000A remove_all_body3E42404202F6
		// "ModelElement::clearPresentation"
		super.clearPresentation();
		// -end- 362409A9000A remove_all_body3E42404202F6
		// "ModelElement::clearPresentation"
	}

	/**
	 * returns the number of Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A size_head3E42404202F6
	// "ModelElement::sizePresentation"
	public int sizePresentation()
	// -end- 362409A9000A size_head3E42404202F6 "ModelElement::sizePresentation"
	{
		// -beg- preserve=no 362409A9000A size_body3E42404202F6
		// "ModelElement::sizePresentation"
		return super.sizePresentation();
		// -end- 362409A9000A size_body3E42404202F6
		// "ModelElement::sizePresentation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _link_body3E42404202F6
	// "ModelElement::_linkPresentation"
	public void _linkPresentation(PresentationElement presentation1) {
		super._linkPresentation(presentation1);
	}
	// -end- 362409A9000A _link_body3E42404202F6
	// "ModelElement::_linkPresentation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _unlink_body3E42404202F6
	// "ModelElement::_unlinkPresentation"
	public void _unlinkPresentation(PresentationElement presentation1) {
		super._unlinkPresentation(presentation1);
	}
	// -end- 362409A9000A _unlink_body3E42404202F6
	// "ModelElement::_unlinkPresentation"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3E42404202F6 detail_end "AbstractDependency"

	// -end- 3E42404202F6 detail_end "AbstractDependency"

}
