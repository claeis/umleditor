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

// -beg- preserve=no 3941018702C7 package "ConstraintDef"
package ch.ehi.interlis.constraints;
// -end- 3941018702C7 package "ConstraintDef"

// -beg- preserve=no 3941018702C7 autoimport "ConstraintDef"
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.basics.types.NlsString;
// -end- 3941018702C7 autoimport "ConstraintDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3941018702C7 import "ConstraintDef"

// -end- 3941018702C7 import "ConstraintDef"

/**
 * Definiert eine Einschränkung.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:51 $
 */
public class ConstraintDef extends AbstractModelElement implements Constraint, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3941018702C7 detail_begin "ConstraintDef"

	// -end- 3941018702C7 detail_begin "ConstraintDef"

	private static final long serialVersionUID = -3745171397136169541L;

	// -beg- preserve=no 3D4FA218015C head3941018702C7 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA218015C head3941018702C7 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA218015C throws3941018702C7 "unlinkAll"

	// -end- 3D4FA218015C throws3941018702C7 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA218015C body3941018702C7 "unlinkAll"

		clearConstrainedElement();
		// Role ViewDef: ViewDef object(s) may point to this
		// Role ViewProjectionDef: ViewProjectionDef object(s) may point to this
		detachConstrainedStereotype();
		setBody(null);
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
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA218015C body3941018702C7 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180170 head3941018702C7 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180170 head3941018702C7 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180170 throws3941018702C7 "enumerateChildren"

	// -end- 3D4FA2180170 throws3941018702C7 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180170 body3941018702C7 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getBody());
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
		// -end- 3D4FA2180170 body3941018702C7 "enumerateChildren"
	}

	// -beg- preserve=no 33EA67BB010F code3941018702C7 "constrainedElement"
	private java.util.List constrainedElement = new java.util.ArrayList();
	// -end- 33EA67BB010F code3941018702C7 "constrainedElement"

	/**
	 * add a ConstrainedElement.
	 *
	 * @see #removeConstrainedElement
	 * @see #containsConstrainedElement
	 * @see #iteratorConstrainedElement
	 * @see #clearConstrainedElement
	 * @see #sizeConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F add_head3941018702C7
	// "Constraint::addConstrainedElement"
	public void addConstrainedElement(ModelElement constrainedElement1)
	// -end- 33EA67BB010F add_head3941018702C7
	// "Constraint::addConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F add_body3941018702C7
		// "Constraint::addConstrainedElement"
		constrainedElement.add(constrainedElement1);
		constrainedElement1._linkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addConstrainedElement"));
		return;
		// -end- 33EA67BB010F add_body3941018702C7
		// "Constraint::addConstrainedElement"
	}

	// -beg- preserve=no 33EA67BB010F add2_head3941018702C7
	// "Constraint::add2ConstrainedElement"
	public void addConstrainedElement(int index, ModelElement constrainedElement1)
	// -end- 33EA67BB010F add2_head3941018702C7
	// "Constraint::add2ConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F add2_body3941018702C7
		// "Constraint::add2ConstrainedElement"
		constrainedElement.add(index, constrainedElement1);
		constrainedElement1._linkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addConstrainedElement"));
		return;
		// -end- 33EA67BB010F add2_body3941018702C7
		// "Constraint::add2ConstrainedElement"
	}

	/**
	 * disconnect a ConstrainedElement.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F remove_head3941018702C7
	// "Constraint::removeConstrainedElement"
	public ModelElement removeConstrainedElement(ModelElement constrainedElement1)
	// -end- 33EA67BB010F remove_head3941018702C7
	// "Constraint::removeConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F remove_body3941018702C7
		// "Constraint::removeConstrainedElement"
		ModelElement ret = null;
		if (constrainedElement1 == null || !constrainedElement.contains(constrainedElement1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = constrainedElement1;
		constrainedElement.remove(constrainedElement1);
		constrainedElement1._unlinkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeConstrainedElement"));
		return ret;
		// -end- 33EA67BB010F remove_body3941018702C7
		// "Constraint::removeConstrainedElement"
	}

	/**
	 * disconnect a ConstrainedElement.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F remove2_head3941018702C7
	// "Constraint::remove2ConstrainedElement"
	public ModelElement removeConstrainedElement(int index)
	// -end- 33EA67BB010F remove2_head3941018702C7
	// "Constraint::remove2ConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F remove2_body3941018702C7
		// "Constraint::remove2ConstrainedElement"
		ModelElement ret = null;
		ret = (ModelElement) constrainedElement.remove(index);
		ret._unlinkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeConstrainedElement"));
		return ret;
		// -end- 33EA67BB010F remove2_body3941018702C7
		// "Constraint::remove2ConstrainedElement"
	}

	/**
	 * change a ConstrainedElement.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F set_head3941018702C7
	// "Constraint::setConstrainedElement"
	public ModelElement setConstrainedElement(int index, ModelElement constrainedElement1)
	// -end- 33EA67BB010F set_head3941018702C7
	// "Constraint::setConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F set_body3941018702C7
		// "Constraint::setConstrainedElement"
		ModelElement ret = null;
		ret = (ModelElement) constrainedElement.set(index, constrainedElement1);
		ret._unlinkConstraint(this);
		constrainedElement1._linkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setConstrainedElement"));
		return ret;
		// -end- 33EA67BB010F set_body3941018702C7
		// "Constraint::setConstrainedElement"
	}

	/**
	 * tests if a given ConstrainedElement is connected.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F test_head3941018702C7
	// "Constraint::containsConstrainedElement"
	public boolean containsConstrainedElement(ModelElement constrainedElement1)
	// -end- 33EA67BB010F test_head3941018702C7
	// "Constraint::containsConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F test_body3941018702C7
		// "Constraint::containsConstrainedElement"
		return constrainedElement.contains(constrainedElement1);
		// -end- 33EA67BB010F test_body3941018702C7
		// "Constraint::containsConstrainedElement"
	}

	/**
	 * used to enumerate all connected ConstrainedElements.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F get_all_head3941018702C7
	// "Constraint::iteratorConstrainedElement"
	public java.util.Iterator iteratorConstrainedElement()
	// -end- 33EA67BB010F get_all_head3941018702C7
	// "Constraint::iteratorConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F get_all_body3941018702C7
		// "Constraint::iteratorConstrainedElement"
		return constrainedElement.iterator();
		// -end- 33EA67BB010F get_all_body3941018702C7
		// "Constraint::iteratorConstrainedElement"
	}

	/**
	 * disconnect all ConstrainedElements.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F remove_all_head3941018702C7
	// "Constraint::clearConstrainedElement"
	public void clearConstrainedElement()
	// -end- 33EA67BB010F remove_all_head3941018702C7
	// "Constraint::clearConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F remove_all_body3941018702C7
		// "Constraint::clearConstrainedElement"
		if (sizeConstrainedElement() > 0) {
			for (java.util.Iterator p = constrainedElement.iterator(); p.hasNext();) {
				((ModelElement) p.next())._unlinkConstraint(this);
			}
			constrainedElement.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearConstrainedElement"));
		}
		// -end- 33EA67BB010F remove_all_body3941018702C7
		// "Constraint::clearConstrainedElement"
	}

	/**
	 * returns the number of ConstrainedElements.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F size_head3941018702C7
	// "Constraint::sizeConstrainedElement"
	public int sizeConstrainedElement()
	// -end- 33EA67BB010F size_head3941018702C7
	// "Constraint::sizeConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F size_body3941018702C7
		// "Constraint::sizeConstrainedElement"
		return constrainedElement.size();
		// -end- 33EA67BB010F size_body3941018702C7
		// "Constraint::sizeConstrainedElement"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33EA67BB010F _link_body3941018702C7
	// "Constraint::_linkConstrainedElement"
	public void _linkConstrainedElement(ModelElement constrainedElement1) {
		constrainedElement.add(constrainedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkConstrainedElement"));
		return;
	}
	// -end- 33EA67BB010F _link_body3941018702C7
	// "Constraint::_linkConstrainedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33EA67BB010F _unlink_body3941018702C7
	// "Constraint::_unlinkConstrainedElement"
	public void _unlinkConstrainedElement(ModelElement constrainedElement1) {
		constrainedElement.remove(constrainedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkConstrainedElement"));
		return;
	}
	// -end- 33EA67BB010F _unlink_body3941018702C7
	// "Constraint::_unlinkConstrainedElement"

	// -beg- preserve=no 364B66900259 code3941018702C7 "constrainedStereotype"
	private Stereotype constrainedStereotype;
	// -end- 364B66900259 code3941018702C7 "constrainedStereotype"

	/**
	 * attaches a ConstrainedStereotype.
	 *
	 * @see #detachConstrainedStereotype
	 * @see #getConstrainedStereotype
	 * @see #containsConstrainedStereotype
	 */
	// -beg- preserve=no 364B66900259 attach_head3941018702C7
	// "Constraint::attachConstrainedStereotype"
	public void attachConstrainedStereotype(Stereotype constrainedStereotype1)
	// -end- 364B66900259 attach_head3941018702C7
	// "Constraint::attachConstrainedStereotype"
	{
		// -beg- preserve=no 364B66900259 attach_body3941018702C7
		// "Constraint::attachConstrainedStereotype"
		if (constrainedStereotype != null) {
			throw new java.lang.IllegalStateException("already a constrainedStereotype attached");
		}
		if (constrainedStereotype1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as constrainedStereotype");
		}
		constrainedStereotype = constrainedStereotype1;
		constrainedStereotype1._linkStereotypeConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachConstrainedStereotype"));
		return;
		// -end- 364B66900259 attach_body3941018702C7
		// "Constraint::attachConstrainedStereotype"
	}

	/**
	 * disconnect the currently attached ConstrainedStereotype.
	 * 
	 * @see #attachConstrainedStereotype
	 */
	// -beg- preserve=no 364B66900259 detach_head3941018702C7
	// "Constraint::detachConstrainedStereotype"
	public Stereotype detachConstrainedStereotype()
	// -end- 364B66900259 detach_head3941018702C7
	// "Constraint::detachConstrainedStereotype"
	{
		// -beg- preserve=no 364B66900259 detach_body3941018702C7
		// "Constraint::detachConstrainedStereotype"
		Stereotype ret = null;
		if (constrainedStereotype != null) {
			constrainedStereotype._unlinkStereotypeConstraint(this);
			ret = constrainedStereotype;
			constrainedStereotype = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachConstrainedStereotype"));
		return ret;
		// -end- 364B66900259 detach_body3941018702C7
		// "Constraint::detachConstrainedStereotype"
	}

	/**
	 * get the currently attached ConstrainedStereotype.
	 * 
	 * @see #attachConstrainedStereotype
	 */
	// -beg- preserve=no 364B66900259 get_head3941018702C7
	// "Constraint::getConstrainedStereotype"
	public Stereotype getConstrainedStereotype()
	// -end- 364B66900259 get_head3941018702C7
	// "Constraint::getConstrainedStereotype"
	{
		// -beg- preserve=no 364B66900259 get_body3941018702C7
		// "Constraint::getConstrainedStereotype"
		if (constrainedStereotype == null) {
			throw new java.lang.IllegalStateException("no constrainedStereotype attached");
		}
		return constrainedStereotype;
		// -end- 364B66900259 get_body3941018702C7
		// "Constraint::getConstrainedStereotype"
	}

	/**
	 * tests if there is a ConstrainedStereotype attached.
	 * 
	 * @see #attachConstrainedStereotype
	 */
	// -beg- preserve=no 364B66900259 test_head3941018702C7
	// "Constraint::containsConstrainedStereotype"
	public boolean containsConstrainedStereotype()
	// -end- 364B66900259 test_head3941018702C7
	// "Constraint::containsConstrainedStereotype"
	{
		// -beg- preserve=no 364B66900259 test_body3941018702C7
		// "Constraint::containsConstrainedStereotype"
		return constrainedStereotype != null;
		// -end- 364B66900259 test_body3941018702C7
		// "Constraint::containsConstrainedStereotype"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 364B66900259 _link_body3941018702C7
	// "Constraint::_linkConstrainedStereotype"
	public void _linkConstrainedStereotype(Stereotype constrainedStereotype1) {
		constrainedStereotype = constrainedStereotype1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkConstrainedStereotype"));
		return;
	}
	// -end- 364B66900259 _link_body3941018702C7
	// "Constraint::_linkConstrainedStereotype"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 364B66900259 _unlink_body3941018702C7
	// "Constraint::_unlinkConstrainedStereotype"
	public void _unlinkConstrainedStereotype(Stereotype constrainedStereotype1) {
		constrainedStereotype = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
				new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkConstrainedStereotype"));
		return;
	}
	// -end- 364B66900259 _unlink_body3941018702C7
	// "Constraint::_unlinkConstrainedStereotype"

	// -beg- preserve=no 32866F630244 var3941018702C7 "body"
	private BooleanExpression body = null;
	// -end- 32866F630244 var3941018702C7 "body"

	/**
	 * get current value of body
	 * 
	 * @see #setBody
	 */
	// -beg- preserve=no 32866F630244 get_head3941018702C7 "body"
	public BooleanExpression getBody()
	// -end- 32866F630244 get_head3941018702C7 "body"
	{
		// -beg- preserve=no 32866F630244 get_body3941018702C7 "body"
		return body;
		// -end- 32866F630244 get_body3941018702C7 "body"
	}

	/**
	 * set current value of body
	 * 
	 * @see #getBody
	 */
	// -beg- preserve=no 32866F630244 set_head3941018702C7 "body"
	public void setBody(BooleanExpression value1)
	// -end- 32866F630244 set_head3941018702C7 "body"
	{
		// -beg- preserve=no 32866F630244 set_body3941018702C7 "body"
		if (body != value1 && (body == null || !body.equals(value1))) {
			body = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setBody"));
		}
		// -end- 32866F630244 set_body3941018702C7 "body"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3941018702C7 detail_end "ConstraintDef"

	// -end- 3941018702C7 detail_end "ConstraintDef"

}
