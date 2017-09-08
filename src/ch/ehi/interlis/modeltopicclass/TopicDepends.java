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

// -beg- preserve=no 3C17712203B7 package "TopicDepends"
package ch.ehi.interlis.modeltopicclass;
// -end- 3C17712203B7 package "TopicDepends"

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 3C17712203B7 autoimport "TopicDepends"
import ch.ehi.uml1_4.foundation.core.ModelElement;
// -beg- preserve=no 3C17712203B7 autoimport "TopicDepends"
import ch.ehi.uml1_4.foundation.core.Usage;
import ch.ehi.uml1_4.implementation.AbstractDependency;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C17712203B7 import "TopicDepends"

// -end- 3C17712203B7 import "TopicDepends"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:11 $
 */
public class TopicDepends extends AbstractDependency implements Usage, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C17712203B7 detail_begin "TopicDepends"

	// -end- 3C17712203B7 detail_begin "TopicDepends"

	// -beg- preserve=no 3D4FA21A0029 head3C17712203B7 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21A0029 head3C17712203B7 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A0029 throws3C17712203B7 "unlinkAll"

	// -end- 3D4FA21A0029 throws3C17712203B7 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A0029 body3C17712203B7 "unlinkAll"

		detachChild();
		clearSupplier();
		clearClient();
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
		// -end- 3D4FA21A0029 body3C17712203B7 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21A0033 head3C17712203B7 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21A0033 head3C17712203B7 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A0033 throws3C17712203B7 "enumerateChildren"

	// -end- 3D4FA21A0033 throws3C17712203B7 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A0033 body3C17712203B7 "enumerateChildren"
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
		// -end- 3D4FA21A0033 body3C17712203B7 "enumerateChildren"
	}

	// -beg- preserve=no 3940E48403B8 code3C17712203B7 "child"
	private TopicDef child;
	// -end- 3940E48403B8 code3C17712203B7 "child"

	/**
	 * attaches a Child.
	 *
	 * @see #detachChild
	 * @see #getChild
	 * @see #containsChild
	 */
	// -beg- preserve=no 3940E48403B8 attach_head3C17712203B7
	// "TopicDepends::attachChild"
	public void attachChild(TopicDef child1)
	// -end- 3940E48403B8 attach_head3C17712203B7 "TopicDepends::attachChild"
	{
		// -beg- preserve=no 3940E48403B8 attach_body3C17712203B7
		// "TopicDepends::attachChild"
		if (child != null) {
			throw new java.lang.IllegalStateException("already a child attached");
		}
		if (child1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as child");
		}
		child = child1;
		child1._linkClientDependency(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachChild"));
		return;
		// -end- 3940E48403B8 attach_body3C17712203B7
		// "TopicDepends::attachChild"
	}

	/**
	 * disconnect the currently attached Child.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 3940E48403B8 detach_head3C17712203B7
	// "TopicDepends::detachChild"
	public TopicDef detachChild()
	// -end- 3940E48403B8 detach_head3C17712203B7 "TopicDepends::detachChild"
	{
		// -beg- preserve=no 3940E48403B8 detach_body3C17712203B7
		// "TopicDepends::detachChild"
		TopicDef ret = null;
		if (child != null) {
			child._unlinkClientDependency(this);
			ret = child;
			child = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachChild"));
		return ret;
		// -end- 3940E48403B8 detach_body3C17712203B7
		// "TopicDepends::detachChild"
	}

	/**
	 * get the currently attached Child.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 3940E48403B8 get_head3C17712203B7
	// "TopicDepends::getChild"
	public TopicDef getChild()
	// -end- 3940E48403B8 get_head3C17712203B7 "TopicDepends::getChild"
	{
		// -beg- preserve=no 3940E48403B8 get_body3C17712203B7
		// "TopicDepends::getChild"
		if (child == null) {
			throw new java.lang.IllegalStateException("no child attached");
		}
		return child;
		// -end- 3940E48403B8 get_body3C17712203B7 "TopicDepends::getChild"
	}

	/**
	 * tests if there is a Child attached.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 3940E48403B8 test_head3C17712203B7
	// "TopicDepends::containsChild"
	public boolean containsChild()
	// -end- 3940E48403B8 test_head3C17712203B7 "TopicDepends::containsChild"
	{
		// -beg- preserve=no 3940E48403B8 test_body3C17712203B7
		// "TopicDepends::containsChild"
		return child != null;
		// -end- 3940E48403B8 test_body3C17712203B7
		// "TopicDepends::containsChild"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3940E48403B8 _link_body3C17712203B7
	// "TopicDepends::_linkChild"
	public void _linkChild(TopicDef child1) {
		child = child1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkChild"));
		return;
	}
	// -end- 3940E48403B8 _link_body3C17712203B7 "TopicDepends::_linkChild"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3940E48403B8 _unlink_body3C17712203B7
	// "TopicDepends::_unlinkChild"
	public void _unlinkChild(TopicDef child1) {
		child = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkChild"));
		return;
	}
	// -end- 3940E48403B8 _unlink_body3C17712203B7 "TopicDepends::_unlinkChild"

	// -beg- preserve=no 335C0D7A02E4 code3C17712203B7 "supplier"

	// -end- 335C0D7A02E4 code3C17712203B7 "supplier"

	/**
	 * add a Supplier.
	 *
	 * @see #removeSupplier
	 * @see #containsSupplier
	 * @see #iteratorSupplier
	 * @see #clearSupplier
	 * @see #sizeSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 add_head3C17712203B7
	// "Dependency::addSupplier"
	public void addSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 add_head3C17712203B7 "Dependency::addSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 add_body3C17712203B7
		// "Dependency::addSupplier"
		super.addSupplier(supplier1);
		// -end- 335C0D7A02E4 add_body3C17712203B7 "Dependency::addSupplier"
	}

	/**
	 * disconnect a Supplier.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 remove_head3C17712203B7
	// "Dependency::removeSupplier"
	public ModelElement removeSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 remove_head3C17712203B7 "Dependency::removeSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 remove_body3C17712203B7
		// "Dependency::removeSupplier"
		return super.removeSupplier(supplier1);
		// -end- 335C0D7A02E4 remove_body3C17712203B7
		// "Dependency::removeSupplier"
	}

	/**
	 * tests if a given Supplier is connected.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 test_head3C17712203B7
	// "Dependency::containsSupplier"
	public boolean containsSupplier(ModelElement supplier1)
	// -end- 335C0D7A02E4 test_head3C17712203B7 "Dependency::containsSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 test_body3C17712203B7
		// "Dependency::containsSupplier"
		return super.containsSupplier(supplier1);
		// -end- 335C0D7A02E4 test_body3C17712203B7
		// "Dependency::containsSupplier"
	}

	/**
	 * used to enumerate all connected Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 get_all_head3C17712203B7
	// "Dependency::iteratorSupplier"
	public java.util.Iterator iteratorSupplier()
	// -end- 335C0D7A02E4 get_all_head3C17712203B7
	// "Dependency::iteratorSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 get_all_body3C17712203B7
		// "Dependency::iteratorSupplier"
		return super.iteratorSupplier();
		// -end- 335C0D7A02E4 get_all_body3C17712203B7
		// "Dependency::iteratorSupplier"
	}

	/**
	 * disconnect all Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 remove_all_head3C17712203B7
	// "Dependency::clearSupplier"
	public void clearSupplier()
	// -end- 335C0D7A02E4 remove_all_head3C17712203B7
	// "Dependency::clearSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 remove_all_body3C17712203B7
		// "Dependency::clearSupplier"
		super.clearSupplier();
		// -end- 335C0D7A02E4 remove_all_body3C17712203B7
		// "Dependency::clearSupplier"
	}

	/**
	 * returns the number of Suppliers.
	 * 
	 * @see #addSupplier
	 */
	// -beg- preserve=no 335C0D7A02E4 size_head3C17712203B7
	// "Dependency::sizeSupplier"
	public int sizeSupplier()
	// -end- 335C0D7A02E4 size_head3C17712203B7 "Dependency::sizeSupplier"
	{
		// -beg- preserve=no 335C0D7A02E4 size_body3C17712203B7
		// "Dependency::sizeSupplier"
		return super.sizeSupplier();
		// -end- 335C0D7A02E4 size_body3C17712203B7 "Dependency::sizeSupplier"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02E4 _link_body3C17712203B7
	// "Dependency::_linkSupplier"
	public void _linkSupplier(ModelElement supplier1) {
		super._linkSupplier(supplier1);
	}
	// -end- 335C0D7A02E4 _link_body3C17712203B7 "Dependency::_linkSupplier"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C0D7A02E4 _unlink_body3C17712203B7
	// "Dependency::_unlinkSupplier"
	public void _unlinkSupplier(ModelElement supplier1) {
		super._unlinkSupplier(supplier1);
	}
	// -end- 335C0D7A02E4 _unlink_body3C17712203B7 "Dependency::_unlinkSupplier"

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
	// -beg- preserve=no 3C17712203B7 detail_end "TopicDepends"

	// -end- 3C17712203B7 detail_end "TopicDepends"

}
