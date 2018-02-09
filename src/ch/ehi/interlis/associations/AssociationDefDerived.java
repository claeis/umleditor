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

// -beg- preserve=no 3C1DB4C00011 package "AssociationDefDerived"
package ch.ehi.interlis.associations;
// -end- 3C1DB4C00011 package "AssociationDefDerived"

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
import java.util.Iterator;
// -end- 3C1DB4C00011 autoimport "AssociationDefDerived"
// -beg- preserve=no 3C1DB4C00011 autoimport "AssociationDefDerived"
import ch.ehi.uml1_4.foundation.core.Abstraction;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.datatypes.MappingExpression;
import ch.ehi.uml1_4.implementation.AbstractDependency;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C1DB4C00011 import "AssociationDefDerived"

// -end- 3C1DB4C00011 import "AssociationDefDerived"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:32 $
 */
public class AssociationDefDerived extends AbstractDependency implements Abstraction, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1DB4C00011 detail_begin "AssociationDefDerived"

	// -end- 3C1DB4C00011 detail_begin "AssociationDefDerived"

	private static final long serialVersionUID = 7665825754253139269L;

	// -beg- preserve=no 3D4FA21C00D6 head3C1DB4C00011 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21C00D6 head3C1DB4C00011 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21C00D6 throws3C1DB4C00011 "unlinkAll"

	// -end- 3D4FA21C00D6 throws3C1DB4C00011 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21C00D6 body3C1DB4C00011 "unlinkAll"

		clearClient();
		clearSupplier();
		setMapping(null);
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
		// -end- 3D4FA21C00D6 body3C1DB4C00011 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21C00D7 head3C1DB4C00011 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21C00D7 head3C1DB4C00011 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21C00D7 throws3C1DB4C00011 "enumerateChildren"

	// -end- 3D4FA21C00D7 throws3C1DB4C00011 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21C00D7 body3C1DB4C00011 "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getMapping());
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
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21C00D7 body3C1DB4C00011 "enumerateChildren"
	}

	// -beg- preserve=no 33FFE57B03B3 code3C1DB4C00011 "client"

	// -end- 33FFE57B03B3 code3C1DB4C00011 "client"

	/**
	 * add a Client.
	 *
	 * @see #removeClient
	 * @see #containsClient
	 * @see #iteratorClient
	 * @see #clearClient
	 * @see #sizeClient
	 */
	// -beg- preserve=no 33FFE57B03B3 add_head3C1DB4C00011
	// "Dependency::addClient"
	public void addClient(ModelElement client1)
	// -end- 33FFE57B03B3 add_head3C1DB4C00011 "Dependency::addClient"
	{
		// -beg- preserve=no 33FFE57B03B3 add_body3C1DB4C00011
		// "Dependency::addClient"
		super.addClient(client1);
		// -end- 33FFE57B03B3 add_body3C1DB4C00011 "Dependency::addClient"
	}

	/**
	 * disconnect a Client.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 remove_head3C1DB4C00011
	// "Dependency::removeClient"
	public ModelElement removeClient(ModelElement client1)
	// -end- 33FFE57B03B3 remove_head3C1DB4C00011 "Dependency::removeClient"
	{
		// -beg- preserve=no 33FFE57B03B3 remove_body3C1DB4C00011
		// "Dependency::removeClient"
		return super.removeClient(client1);
		// -end- 33FFE57B03B3 remove_body3C1DB4C00011 "Dependency::removeClient"
	}

	/**
	 * tests if a given Client is connected.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 test_head3C1DB4C00011
	// "Dependency::containsClient"
	public boolean containsClient(ModelElement client1)
	// -end- 33FFE57B03B3 test_head3C1DB4C00011 "Dependency::containsClient"
	{
		// -beg- preserve=no 33FFE57B03B3 test_body3C1DB4C00011
		// "Dependency::containsClient"
		return super.containsClient(client1);
		// -end- 33FFE57B03B3 test_body3C1DB4C00011 "Dependency::containsClient"
	}

	/**
	 * used to enumerate all connected Clients.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 get_all_head3C1DB4C00011
	// "Dependency::iteratorClient"
	public Iterator<?> iteratorClient()
	// -end- 33FFE57B03B3 get_all_head3C1DB4C00011 "Dependency::iteratorClient"
	{
		// -beg- preserve=no 33FFE57B03B3 get_all_body3C1DB4C00011
		// "Dependency::iteratorClient"
		return super.iteratorClient();
		// -end- 33FFE57B03B3 get_all_body3C1DB4C00011
		// "Dependency::iteratorClient"
	}

	/**
	 * disconnect all Clients.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 remove_all_head3C1DB4C00011
	// "Dependency::clearClient"
	public void clearClient()
	// -end- 33FFE57B03B3 remove_all_head3C1DB4C00011 "Dependency::clearClient"
	{
		// -beg- preserve=no 33FFE57B03B3 remove_all_body3C1DB4C00011
		// "Dependency::clearClient"
		super.clearClient();
		// -end- 33FFE57B03B3 remove_all_body3C1DB4C00011
		// "Dependency::clearClient"
	}

	/**
	 * returns the number of Clients.
	 * 
	 * @see #addClient
	 */
	// -beg- preserve=no 33FFE57B03B3 size_head3C1DB4C00011
	// "Dependency::sizeClient"
	public int sizeClient()
	// -end- 33FFE57B03B3 size_head3C1DB4C00011 "Dependency::sizeClient"
	{
		// -beg- preserve=no 33FFE57B03B3 size_body3C1DB4C00011
		// "Dependency::sizeClient"
		return super.sizeClient();
		// -end- 33FFE57B03B3 size_body3C1DB4C00011 "Dependency::sizeClient"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B03B3 _link_body3C1DB4C00011
	// "Dependency::_linkClient"
	public void _linkClient(ModelElement client1) {
		super._linkClient(client1);
	}
	// -end- 33FFE57B03B3 _link_body3C1DB4C00011 "Dependency::_linkClient"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B03B3 _unlink_body3C1DB4C00011
	// "Dependency::_unlinkClient"
	public void _unlinkClient(ModelElement client1) {
		super._unlinkClient(client1);
	}
	// -end- 33FFE57B03B3 _unlink_body3C1DB4C00011 "Dependency::_unlinkClient"

	// -beg- preserve=no 335C0D7A02E4 code3C1DB4C00011 "supplier"

	// -end- 335C0D7A02E4 code3C1DB4C00011 "supplier"

	/**
	 * add a Supplier.
	 *
	 * @see #removeSupplier
	 * @see #containsSupplier
	 * @see #iteratorSupplier
	 * @see #clearSupplier
	 * @see #sizeSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 add_head3C1DB4C00011
	// "Dependency::addSupplier"
	public void addSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 add_head3C1DB4C00011 "Dependency::addSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 add_body3C1DB4C00011
		// "Dependency::addSupplier"
		super.addSupplier(supplier1);
		// -end- 335C0D7A02E4 add_body3C1DB4C00011 "Dependency::addSupplier"
	}

	/**
	 * disconnect a Supplier.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 remove_head3C1DB4C00011
	// "Dependency::removeSupplier"
	public ModelElement removeSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 remove_head3C1DB4C00011 "Dependency::removeSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 remove_body3C1DB4C00011
		// "Dependency::removeSupplier"
		return super.removeSupplier(supplier1);
		// -end- 335C0D7A02E4 remove_body3C1DB4C00011
		// "Dependency::removeSupplier"
	}

	/**
	 * tests if a given Supplier is connected.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 test_head3C1DB4C00011
	// "Dependency::containsSupplier"
	public boolean containsSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 test_head3C1DB4C00011 "Dependency::containsSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 test_body3C1DB4C00011
		// "Dependency::containsSupplier"
		return super.containsSupplier(supplier1);
		// -end- 335C0D7A02E4 test_body3C1DB4C00011
		// "Dependency::containsSupplier"
	}

	/**
	 * used to enumerate all connected Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 get_all_head3C1DB4C00011
	// "Dependency::iteratorSupplier"
	public Iterator<?> iteratorSupplier()
	// -end- 335C0D7A02E4 get_all_head3C1DB4C00011
	// "Dependency::iteratorSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 get_all_body3C1DB4C00011
		// "Dependency::iteratorSupplier"
		return super.iteratorSupplier();
		// -end- 335C0D7A02E4 get_all_body3C1DB4C00011
		// "Dependency::iteratorSupplier"
	}

	/**
	 * disconnect all Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 remove_all_head3C1DB4C00011
	// "Dependency::clearSupplier"
	public void clearSupplier()
	// -end- 335C0D7A02E4 remove_all_head3C1DB4C00011
	// "Dependency::clearSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 remove_all_body3C1DB4C00011
		// "Dependency::clearSupplier"
		super.clearSupplier();
		// -end- 335C0D7A02E4 remove_all_body3C1DB4C00011
		// "Dependency::clearSupplier"
	}

	/**
	 * returns the number of Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 size_head3C1DB4C00011
	// "Dependency::sizeSupplier"
	public int sizeSupplier()
	// -end- 335C0D7A02E4 size_head3C1DB4C00011 "Dependency::sizeSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 size_body3C1DB4C00011
		// "Dependency::sizeSupplier"
		return super.sizeSupplier();
		// -end- 335C0D7A02E4 size_body3C1DB4C00011 "Dependency::sizeSupplier"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02E4 _link_body3C1DB4C00011
	// "Dependency::_linkSupplier"
	public void _linkSupplier(ModelElement supplier1) {
		super._linkSupplier(supplier1);
	}
	// -end- 335C0D7A02E4 _link_body3C1DB4C00011 "Dependency::_linkSupplier"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02E4 _unlink_body3C1DB4C00011
	// "Dependency::_unlinkSupplier"
	public void _unlinkSupplier(ModelElement supplier1) {
		super._unlinkSupplier(supplier1);
	}
	// -end- 335C0D7A02E4 _unlink_body3C1DB4C00011 "Dependency::_unlinkSupplier"

	// -beg- preserve=no 33EB8A4500B4 var3C1DB4C00011 "mapping"
	private MappingExpression mapping = null;
	// -end- 33EB8A4500B4 var3C1DB4C00011 "mapping"

	/**
	 * get current value of mapping
	 * 
	 * @see #setMapping
	 */
	// -beg- preserve=no 33EB8A4500B4 get_head3C1DB4C00011 "mapping"
	public MappingExpression getMapping()
	// -end- 33EB8A4500B4 get_head3C1DB4C00011 "mapping"
	{
		// -beg- preserve=no 33EB8A4500B4 get_body3C1DB4C00011 "mapping"
		return mapping;
		// -end- 33EB8A4500B4 get_body3C1DB4C00011 "mapping"
	}

	/**
	 * set current value of mapping
	 * 
	 * @see #getMapping
	 */
	// -beg- preserve=no 33EB8A4500B4 set_head3C1DB4C00011 "mapping"
	public void setMapping(MappingExpression value1)
	// -end- 33EB8A4500B4 set_head3C1DB4C00011 "mapping"
	{
		// -beg- preserve=no 33EB8A4500B4 set_body3C1DB4C00011 "mapping"
		if (mapping != value1 && (mapping == null || !mapping.equals(value1))) {
			mapping = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMapping"));
		}
		// -end- 33EB8A4500B4 set_body3C1DB4C00011 "mapping"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMetaAttrb(value);
	}
	public NlsString getMetaName() {
		return super.getMetaName();
	}

	public void setMetaName(NlsString value) {
		super.setMetaName(value);
	}
	public NlsString getMetaMsg() {
		return super.getMetaMsg();
	}

	public void setMetaMsg(NlsString value) {
		super.setMetaMsg(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1DB4C00011 detail_end "AssociationDefDerived"

	// -end- 3C1DB4C00011 detail_end "AssociationDefDerived"

}
