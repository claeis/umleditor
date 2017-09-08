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

// -beg- preserve=no 3C1DB6CB0118 package "RoleDefDerived"
package ch.ehi.interlis.associations;
// -end- 3C1DB6CB0118 package "RoleDefDerived"

// -beg- preserve=no 3C1DB6CB0118 autoimport "RoleDefDerived"
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.foundation.core.Abstraction;
import ch.ehi.uml1_4.implementation.AbstractDependency;
import ch.ehi.interlis.logicalexpressions.ObjectPath;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
import ch.ehi.uml1_4.foundation.datatypes.MappingExpression;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Dependency;
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
// -end- 3C1DB6CB0118 autoimport "RoleDefDerived"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C1DB6CB0118 import "RoleDefDerived"

// -end- 3C1DB6CB0118 import "RoleDefDerived"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:40 $
 */
public class RoleDefDerived extends AbstractDependency implements IliSyntax, Abstraction, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1DB6CB0118 detail_begin "RoleDefDerived"

	// -end- 3C1DB6CB0118 detail_begin "RoleDefDerived"

	// -beg- preserve=no 3D4FA21C00EA head3C1DB6CB0118 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21C00EA head3C1DB6CB0118 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21C00EA throws3C1DB6CB0118 "unlinkAll"

	// -end- 3D4FA21C00EA throws3C1DB6CB0118 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21C00EA body3C1DB6CB0118 "unlinkAll"

		// Role RoleDef: RoleDef object(s) may point to this
		detachFrom();
		setSyntax(null);
		setMapping(null);
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
		// -end- 3D4FA21C00EA body3C1DB6CB0118 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21C00F4 head3C1DB6CB0118 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21C00F4 head3C1DB6CB0118 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21C00F4 throws3C1DB6CB0118 "enumerateChildren"

	// -end- 3D4FA21C00F4 throws3C1DB6CB0118 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21C00F4 body3C1DB6CB0118 "enumerateChildren"
		java.util.Iterator it = null;
		if (containsFrom())
			visitor.visit(getFrom());
		visitor.visit(getSyntax());
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
		visitor.visit(getMetaAttrb());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21C00F4 body3C1DB6CB0118 "enumerateChildren"
	}

	// -beg- preserve=no 3C1DB6F5012E code3C1DB6CB0118 "from"
	private ObjectPath from;
	// -end- 3C1DB6F5012E code3C1DB6CB0118 "from"

	/**
	 * attaches a From.
	 *
	 * @see #detachFrom
	 * @see #getFrom
	 * @see #containsFrom
	 */
	// -beg- preserve=no 3C1DB6F5012E attach_head3C1DB6CB0118
	// "RoleDefDerived::attachFrom"
	public void attachFrom(ObjectPath from1)
	// -end- 3C1DB6F5012E attach_head3C1DB6CB0118 "RoleDefDerived::attachFrom"
	{
		// -beg- preserve=no 3C1DB6F5012E attach_body3C1DB6CB0118
		// "RoleDefDerived::attachFrom"
		if (from != null) {
			throw new java.lang.IllegalStateException("already a from attached");
		}
		if (from1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as from");
		}
		from = from1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachFrom"));
		return;
		// -end- 3C1DB6F5012E attach_body3C1DB6CB0118
		// "RoleDefDerived::attachFrom"
	}

	/**
	 * disconnect the currently attached From.
	 * 
	 * @see #attachFrom
	 */
	// -beg- preserve=no 3C1DB6F5012E detach_head3C1DB6CB0118
	// "RoleDefDerived::detachFrom"
	public ObjectPath detachFrom()
	// -end- 3C1DB6F5012E detach_head3C1DB6CB0118 "RoleDefDerived::detachFrom"
	{
		// -beg- preserve=no 3C1DB6F5012E detach_body3C1DB6CB0118
		// "RoleDefDerived::detachFrom"
		ObjectPath ret = null;
		ret = from;
		from = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachFrom"));
		return ret;
		// -end- 3C1DB6F5012E detach_body3C1DB6CB0118
		// "RoleDefDerived::detachFrom"
	}

	/**
	 * get the currently attached From.
	 * 
	 * @see #attachFrom
	 */
	// -beg- preserve=no 3C1DB6F5012E get_head3C1DB6CB0118
	// "RoleDefDerived::getFrom"
	public ObjectPath getFrom()
	// -end- 3C1DB6F5012E get_head3C1DB6CB0118 "RoleDefDerived::getFrom"
	{
		// -beg- preserve=no 3C1DB6F5012E get_body3C1DB6CB0118
		// "RoleDefDerived::getFrom"
		if (from == null) {
			throw new java.lang.IllegalStateException("no from attached");
		}
		return from;
		// -end- 3C1DB6F5012E get_body3C1DB6CB0118 "RoleDefDerived::getFrom"
	}

	/**
	 * tests if there is a From attached.
	 * 
	 * @see #attachFrom
	 */
	// -beg- preserve=no 3C1DB6F5012E test_head3C1DB6CB0118
	// "RoleDefDerived::containsFrom"
	public boolean containsFrom()
	// -end- 3C1DB6F5012E test_head3C1DB6CB0118 "RoleDefDerived::containsFrom"
	{
		// -beg- preserve=no 3C1DB6F5012E test_body3C1DB6CB0118
		// "RoleDefDerived::containsFrom"
		return from != null;
		// -end- 3C1DB6F5012E test_body3C1DB6CB0118
		// "RoleDefDerived::containsFrom"
	}

	// -beg- preserve=no 3C8F5ABE022D var3C1DB6CB0118 "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var3C1DB6CB0118 "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head3C1DB6CB0118 "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head3C1DB6CB0118 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body3C1DB6CB0118 "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body3C1DB6CB0118 "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head3C1DB6CB0118 "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head3C1DB6CB0118 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body3C1DB6CB0118 "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body3C1DB6CB0118 "syntax"
	}

	// -beg- preserve=no 33EB8A4500B4 var3C1DB6CB0118 "mapping"
	private MappingExpression mapping = null;
	// -end- 33EB8A4500B4 var3C1DB6CB0118 "mapping"

	/**
	 * get current value of mapping
	 * 
	 * @see #setMapping
	 */
	// -beg- preserve=no 33EB8A4500B4 get_head3C1DB6CB0118 "mapping"
	public MappingExpression getMapping()
	// -end- 33EB8A4500B4 get_head3C1DB6CB0118 "mapping"
	{
		// -beg- preserve=no 33EB8A4500B4 get_body3C1DB6CB0118 "mapping"
		return mapping;
		// -end- 33EB8A4500B4 get_body3C1DB6CB0118 "mapping"
	}

	/**
	 * set current value of mapping
	 * 
	 * @see #getMapping
	 */
	// -beg- preserve=no 33EB8A4500B4 set_head3C1DB6CB0118 "mapping"
	public void setMapping(MappingExpression value1)
	// -end- 33EB8A4500B4 set_head3C1DB6CB0118 "mapping"
	{
		// -beg- preserve=no 33EB8A4500B4 set_body3C1DB6CB0118 "mapping"
		if (mapping != value1 && (mapping == null || !mapping.equals(value1))) {
			mapping = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMapping"));
		}
		// -end- 33EB8A4500B4 set_body3C1DB6CB0118 "mapping"
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
	// -beg- preserve=no 3C1DB6CB0118 detail_end "RoleDefDerived"

	// -end- 3C1DB6CB0118 detail_end "RoleDefDerived"

}
