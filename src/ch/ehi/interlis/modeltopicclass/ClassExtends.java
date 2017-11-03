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

// -beg- preserve=no 3C1DABC0011D package "ClassExtends"
package ch.ehi.interlis.modeltopicclass;
// -end- 3C1DABC0011D package "ClassExtends"

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
// -beg- preserve=no 3C1DABC0011D autoimport "ClassExtends"
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.implementation.AbstractGeneralization;
// -end- 3C1DABC0011D autoimport "ClassExtends"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C1DABC0011D import "ClassExtends"

// -end- 3C1DABC0011D import "ClassExtends"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:36 $
 */
public class ClassExtends extends AbstractGeneralization implements Generalization, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1DABC0011D detail_begin "ClassExtends"

	// -end- 3C1DABC0011D detail_begin "ClassExtends"

	private static final long serialVersionUID = 3232212005984710460L;

	// -beg- preserve=no 3D4FA21A006F head3C1DABC0011D "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21A006F head3C1DABC0011D "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A006F throws3C1DABC0011D "unlinkAll"

	// -end- 3D4FA21A006F throws3C1DABC0011D "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A006F body3C1DABC0011D "unlinkAll"

		detachChild();
		detachParent();
		detachPowertype();
		clearPresentation();
		setDiscriminator(null);
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
		// -end- 3D4FA21A006F body3C1DABC0011D "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21A0083 head3C1DABC0011D "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21A0083 head3C1DABC0011D "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A0083 throws3C1DABC0011D "enumerateChildren"

	// -end- 3D4FA21A0083 throws3C1DABC0011D "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A0083 body3C1DABC0011D "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getDiscriminator());
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
		// -end- 3D4FA21A0083 body3C1DABC0011D "enumerateChildren"
	}

	// -beg- preserve=no 335C14A50352 code3C1DABC0011D "child"

	// -end- 335C14A50352 code3C1DABC0011D "child"

	/**
	 * attaches a Child.
	 *
	 * @see #detachChild
	 * @see #getChild
	 * @see #containsChild
	 */
	// -beg- preserve=no 335C14A50352 attach_head3C1DABC0011D
	// "Generalization::attachChild"
	public void attachChild(GeneralizableElement child1)
	// -end- 335C14A50352 attach_head3C1DABC0011D "Generalization::attachChild"
	{
		// -beg- preserve=no 335C14A50352 attach_body3C1DABC0011D
		// "Generalization::attachChild"
		super.attachChild(child1);
		// -end- 335C14A50352 attach_body3C1DABC0011D
		// "Generalization::attachChild"
	}

	/**
	 * disconnect the currently attached Child.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 335C14A50352 detach_head3C1DABC0011D
	// "Generalization::detachChild"
	public GeneralizableElement detachChild()
	// -end- 335C14A50352 detach_head3C1DABC0011D "Generalization::detachChild"
	{
		// -beg- preserve=no 335C14A50352 detach_body3C1DABC0011D
		// "Generalization::detachChild"
		return super.detachChild();
		// -end- 335C14A50352 detach_body3C1DABC0011D
		// "Generalization::detachChild"
	}

	/**
	 * get the currently attached Child.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 335C14A50352 get_head3C1DABC0011D
	// "Generalization::getChild"
	public GeneralizableElement getChild()
	// -end- 335C14A50352 get_head3C1DABC0011D "Generalization::getChild"
	{
		// -beg- preserve=no 335C14A50352 get_body3C1DABC0011D
		// "Generalization::getChild"
		return super.getChild();
		// -end- 335C14A50352 get_body3C1DABC0011D "Generalization::getChild"
	}

	/**
	 * tests if there is a Child attached.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 335C14A50352 test_head3C1DABC0011D
	// "Generalization::containsChild"
	public boolean containsChild()
	// -end- 335C14A50352 test_head3C1DABC0011D "Generalization::containsChild"
	{
		// -beg- preserve=no 335C14A50352 test_body3C1DABC0011D
		// "Generalization::containsChild"
		return super.containsChild();
		// -end- 335C14A50352 test_body3C1DABC0011D
		// "Generalization::containsChild"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A50352 _link_body3C1DABC0011D
	// "Generalization::_linkChild"
	public void _linkChild(GeneralizableElement child1) {
		super._linkChild(child1);
	}
	// -end- 335C14A50352 _link_body3C1DABC0011D "Generalization::_linkChild"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A50352 _unlink_body3C1DABC0011D
	// "Generalization::_unlinkChild"
	public void _unlinkChild(GeneralizableElement child1) {
		super._unlinkChild(child1);
	}
	// -end- 335C14A50352 _unlink_body3C1DABC0011D
	// "Generalization::_unlinkChild"

	// -beg- preserve=no 335C146B0352 code3C1DABC0011D "parent"

	// -end- 335C146B0352 code3C1DABC0011D "parent"

	/**
	 * attaches a Parent.
	 *
	 * @see #detachParent
	 * @see #getParent
	 * @see #containsParent
	 */
	// -beg- preserve=no 335C146B0352 attach_head3C1DABC0011D
	// "Generalization::attachParent"
	public void attachParent(GeneralizableElement parent1)
	// -end- 335C146B0352 attach_head3C1DABC0011D "Generalization::attachParent"
	{
		// -beg- preserve=no 335C146B0352 attach_body3C1DABC0011D
		// "Generalization::attachParent"
		super.attachParent(parent1);
		// -end- 335C146B0352 attach_body3C1DABC0011D
		// "Generalization::attachParent"
	}

	/**
	 * disconnect the currently attached Parent.
	 * 
	 * @see #attachParent
	 */
	// -beg- preserve=no 335C146B0352 detach_head3C1DABC0011D
	// "Generalization::detachParent"
	public GeneralizableElement detachParent()
	// -end- 335C146B0352 detach_head3C1DABC0011D "Generalization::detachParent"
	{
		// -beg- preserve=no 335C146B0352 detach_body3C1DABC0011D
		// "Generalization::detachParent"
		return super.detachParent();
		// -end- 335C146B0352 detach_body3C1DABC0011D
		// "Generalization::detachParent"
	}

	/**
	 * get the currently attached Parent.
	 * 
	 * @see #attachParent
	 */
	// -beg- preserve=no 335C146B0352 get_head3C1DABC0011D
	// "Generalization::getParent"
	public GeneralizableElement getParent()
	// -end- 335C146B0352 get_head3C1DABC0011D "Generalization::getParent"
	{
		// -beg- preserve=no 335C146B0352 get_body3C1DABC0011D
		// "Generalization::getParent"
		return super.getParent();
		// -end- 335C146B0352 get_body3C1DABC0011D "Generalization::getParent"
	}

	/**
	 * tests if there is a Parent attached.
	 * 
	 * @see #attachParent
	 */
	// -beg- preserve=no 335C146B0352 test_head3C1DABC0011D
	// "Generalization::containsParent"
	public boolean containsParent()
	// -end- 335C146B0352 test_head3C1DABC0011D "Generalization::containsParent"
	{
		// -beg- preserve=no 335C146B0352 test_body3C1DABC0011D
		// "Generalization::containsParent"
		return super.containsParent();
		// -end- 335C146B0352 test_body3C1DABC0011D
		// "Generalization::containsParent"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B0352 _link_body3C1DABC0011D
	// "Generalization::_linkParent"
	public void _linkParent(GeneralizableElement parent1) {
		super._linkParent(parent1);
	}
	// -end- 335C146B0352 _link_body3C1DABC0011D "Generalization::_linkParent"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B0352 _unlink_body3C1DABC0011D
	// "Generalization::_unlinkParent"
	public void _unlinkParent(GeneralizableElement parent1) {
		super._unlinkParent(parent1);
	}
	// -end- 335C146B0352 _unlink_body3C1DABC0011D
	// "Generalization::_unlinkParent"

	// -beg- preserve=no 3C68E22702BD var3C1DABC0011D "extended"
	private boolean extended;
	// -end- 3C68E22702BD var3C1DABC0011D "extended"

	/**
	 * get current value of extended
	 * 
	 * @see #setExtended
	 */
	// -beg- preserve=no 3C68E22702BD get_head3C1DABC0011D "extended"
	public boolean isExtended()
	// -end- 3C68E22702BD get_head3C1DABC0011D "extended"
	{
		// -beg- preserve=no 3C68E22702BD get_body3C1DABC0011D "extended"
		return extended;
		// -end- 3C68E22702BD get_body3C1DABC0011D "extended"
	}

	/**
	 * set current value of extended
	 * 
	 * @see #isExtended
	 */
	// -beg- preserve=no 3C68E22702BD set_head3C1DABC0011D "extended"
	public void setExtended(boolean value1)
	// -end- 3C68E22702BD set_head3C1DABC0011D "extended"
	{
		// -beg- preserve=no 3C68E22702BD set_body3C1DABC0011D "extended"
		if (extended != value1) {
			extended = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setExtended"));
		}
		// -end- 3C68E22702BD set_body3C1DABC0011D "extended"
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
	// -beg- preserve=no 3C1DABC0011D detail_end "ClassExtends"

	// -end- 3C1DABC0011D detail_end "ClassExtends"

}
