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

// -beg- preserve=no 4551E98A02BB package "UmlConstraint"
package ch.ehi.uml1_4.implementation;
// -end- 4551E98A02BB package "UmlConstraint"

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 4551E98A02BB autoimport "UmlConstraint"
// -beg- preserve=no 4551E98A02BB autoimport "UmlConstraint"
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4551E98A02BB import "UmlConstraint"

// -end- 4551E98A02BB import "UmlConstraint"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlConstraint extends AbstractModelElement implements Constraint {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551E98A02BB detail_begin "UmlConstraint"

	// -end- 4551E98A02BB detail_begin "UmlConstraint"

	// -beg- preserve=no 4551E9BF00CC head4551E98A02BB "unlinkAll"
	public void unlinkAll()
	// -end- 4551E9BF00CC head4551E98A02BB "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551E9BF00CC throws4551E98A02BB "unlinkAll"

	// -end- 4551E9BF00CC throws4551E98A02BB "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551E9BF00CC body4551E98A02BB "unlinkAll"

		clearConstrainedElement();
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
		setMetaAttrb(null);
		setDocumentation(null);
		super.unlinkAll();
		// -end- 4551E9BF00CC body4551E98A02BB "unlinkAll"
	}

	// -beg- preserve=no 4551E9BF00D6 head4551E98A02BB "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 4551E9BF00D6 head4551E98A02BB "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551E9BF00D6 throws4551E98A02BB "enumerateChildren"

	// -end- 4551E9BF00D6 throws4551E98A02BB "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551E9BF00D6 body4551E98A02BB "enumerateChildren"
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
		visitor.visit(getMetaAttrb());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 4551E9BF00D6 body4551E98A02BB "enumerateChildren"
	}

	// -beg- preserve=no 33EA67BB010F code4551E98A02BB "constrainedElement"
	private java.util.List constrainedElement = new java.util.ArrayList();
	// -end- 33EA67BB010F code4551E98A02BB "constrainedElement"

	/**
	 * add a ConstrainedElement.
	 *
	 * @see #removeConstrainedElement
	 * @see #containsConstrainedElement
	 * @see #iteratorConstrainedElement
	 * @see #clearConstrainedElement
	 * @see #sizeConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F add_head4551E98A02BB
	// "Constraint::addConstrainedElement"
	public void addConstrainedElement(ModelElement constrainedElement1)
	// -end- 33EA67BB010F add_head4551E98A02BB
	// "Constraint::addConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F add_body4551E98A02BB
		// "Constraint::addConstrainedElement"
		constrainedElement.add(constrainedElement1);
		constrainedElement1._linkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addConstrainedElement"));
		return;
		// -end- 33EA67BB010F add_body4551E98A02BB
		// "Constraint::addConstrainedElement"
	}

	// -beg- preserve=no 33EA67BB010F add2_head4551E98A02BB
	// "Constraint::add2ConstrainedElement"
	public void addConstrainedElement(int index, ModelElement constrainedElement1)
	// -end- 33EA67BB010F add2_head4551E98A02BB
	// "Constraint::add2ConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F add2_body4551E98A02BB
		// "Constraint::add2ConstrainedElement"
		constrainedElement.add(index, constrainedElement1);
		constrainedElement1._linkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addConstrainedElement"));
		return;
		// -end- 33EA67BB010F add2_body4551E98A02BB
		// "Constraint::add2ConstrainedElement"
	}

	/**
	 * disconnect a ConstrainedElement.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F remove_head4551E98A02BB
	// "Constraint::removeConstrainedElement"
	public ModelElement removeConstrainedElement(ModelElement constrainedElement1)
	// -end- 33EA67BB010F remove_head4551E98A02BB
	// "Constraint::removeConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F remove_body4551E98A02BB
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
		// -end- 33EA67BB010F remove_body4551E98A02BB
		// "Constraint::removeConstrainedElement"
	}

	/**
	 * disconnect a ConstrainedElement.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F remove2_head4551E98A02BB
	// "Constraint::remove2ConstrainedElement"
	public ModelElement removeConstrainedElement(int index)
	// -end- 33EA67BB010F remove2_head4551E98A02BB
	// "Constraint::remove2ConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F remove2_body4551E98A02BB
		// "Constraint::remove2ConstrainedElement"
		ModelElement ret = null;
		ret = (ModelElement) constrainedElement.remove(index);
		ret._unlinkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeConstrainedElement"));
		return ret;
		// -end- 33EA67BB010F remove2_body4551E98A02BB
		// "Constraint::remove2ConstrainedElement"
	}

	/**
	 * change a ConstrainedElement.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F set_head4551E98A02BB
	// "Constraint::setConstrainedElement"
	public ModelElement setConstrainedElement(int index, ModelElement constrainedElement1)
	// -end- 33EA67BB010F set_head4551E98A02BB
	// "Constraint::setConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F set_body4551E98A02BB
		// "Constraint::setConstrainedElement"
		ModelElement ret = null;
		ret = (ModelElement) constrainedElement.set(index, constrainedElement1);
		ret._unlinkConstraint(this);
		constrainedElement1._linkConstraint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setConstrainedElement"));
		return ret;
		// -end- 33EA67BB010F set_body4551E98A02BB
		// "Constraint::setConstrainedElement"
	}

	/**
	 * tests if a given ConstrainedElement is connected.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F test_head4551E98A02BB
	// "Constraint::containsConstrainedElement"
	public boolean containsConstrainedElement(ModelElement constrainedElement1)
	// -end- 33EA67BB010F test_head4551E98A02BB
	// "Constraint::containsConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F test_body4551E98A02BB
		// "Constraint::containsConstrainedElement"
		return constrainedElement.contains(constrainedElement1);
		// -end- 33EA67BB010F test_body4551E98A02BB
		// "Constraint::containsConstrainedElement"
	}

	/**
	 * used to enumerate all connected ConstrainedElements.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F get_all_head4551E98A02BB
	// "Constraint::iteratorConstrainedElement"
	public java.util.Iterator iteratorConstrainedElement()
	// -end- 33EA67BB010F get_all_head4551E98A02BB
	// "Constraint::iteratorConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F get_all_body4551E98A02BB
		// "Constraint::iteratorConstrainedElement"
		return constrainedElement.iterator();
		// -end- 33EA67BB010F get_all_body4551E98A02BB
		// "Constraint::iteratorConstrainedElement"
	}

	/**
	 * disconnect all ConstrainedElements.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F remove_all_head4551E98A02BB
	// "Constraint::clearConstrainedElement"
	public void clearConstrainedElement()
	// -end- 33EA67BB010F remove_all_head4551E98A02BB
	// "Constraint::clearConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F remove_all_body4551E98A02BB
		// "Constraint::clearConstrainedElement"
		if (sizeConstrainedElement() > 0) {
			for (java.util.Iterator p = constrainedElement.iterator(); p.hasNext();) {
				((ModelElement) p.next())._unlinkConstraint(this);
			}
			constrainedElement.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearConstrainedElement"));
		}
		// -end- 33EA67BB010F remove_all_body4551E98A02BB
		// "Constraint::clearConstrainedElement"
	}

	/**
	 * returns the number of ConstrainedElements.
	 * 
	 * @see #addConstrainedElement
	 */
	// -beg- preserve=no 33EA67BB010F size_head4551E98A02BB
	// "Constraint::sizeConstrainedElement"
	public int sizeConstrainedElement()
	// -end- 33EA67BB010F size_head4551E98A02BB
	// "Constraint::sizeConstrainedElement"
	{
		// -beg- preserve=no 33EA67BB010F size_body4551E98A02BB
		// "Constraint::sizeConstrainedElement"
		return constrainedElement.size();
		// -end- 33EA67BB010F size_body4551E98A02BB
		// "Constraint::sizeConstrainedElement"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33EA67BB010F _link_body4551E98A02BB
	// "Constraint::_linkConstrainedElement"
	public void _linkConstrainedElement(ModelElement constrainedElement1) {
		constrainedElement.add(constrainedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkConstrainedElement"));
		return;
	}
	// -end- 33EA67BB010F _link_body4551E98A02BB
	// "Constraint::_linkConstrainedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33EA67BB010F _unlink_body4551E98A02BB
	// "Constraint::_unlinkConstrainedElement"
	public void _unlinkConstrainedElement(ModelElement constrainedElement1) {
		constrainedElement.remove(constrainedElement1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkConstrainedElement"));
		return;
	}
	// -end- 33EA67BB010F _unlink_body4551E98A02BB
	// "Constraint::_unlinkConstrainedElement"

	// -beg- preserve=no 364B66900259 code4551E98A02BB "constrainedStereotype"
	private Stereotype constrainedStereotype;
	// -end- 364B66900259 code4551E98A02BB "constrainedStereotype"

	/**
	 * attaches a ConstrainedStereotype.
	 *
	 * @see #detachConstrainedStereotype
	 * @see #getConstrainedStereotype
	 * @see #containsConstrainedStereotype
	 */
	// -beg- preserve=no 364B66900259 attach_head4551E98A02BB
	// "Constraint::attachConstrainedStereotype"
	public void attachConstrainedStereotype(Stereotype constrainedStereotype1)
	// -end- 364B66900259 attach_head4551E98A02BB
	// "Constraint::attachConstrainedStereotype"
	{
		// -beg- preserve=no 364B66900259 attach_body4551E98A02BB
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
		// -end- 364B66900259 attach_body4551E98A02BB
		// "Constraint::attachConstrainedStereotype"
	}

	/**
	 * disconnect the currently attached ConstrainedStereotype.
	 * 
	 * @see #attachConstrainedStereotype
	 */
	// -beg- preserve=no 364B66900259 detach_head4551E98A02BB
	// "Constraint::detachConstrainedStereotype"
	public Stereotype detachConstrainedStereotype()
	// -end- 364B66900259 detach_head4551E98A02BB
	// "Constraint::detachConstrainedStereotype"
	{
		// -beg- preserve=no 364B66900259 detach_body4551E98A02BB
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
		// -end- 364B66900259 detach_body4551E98A02BB
		// "Constraint::detachConstrainedStereotype"
	}

	/**
	 * get the currently attached ConstrainedStereotype.
	 * 
	 * @see #attachConstrainedStereotype
	 */
	// -beg- preserve=no 364B66900259 get_head4551E98A02BB
	// "Constraint::getConstrainedStereotype"
	public Stereotype getConstrainedStereotype()
	// -end- 364B66900259 get_head4551E98A02BB
	// "Constraint::getConstrainedStereotype"
	{
		// -beg- preserve=no 364B66900259 get_body4551E98A02BB
		// "Constraint::getConstrainedStereotype"
		if (constrainedStereotype == null) {
			throw new java.lang.IllegalStateException("no constrainedStereotype attached");
		}
		return constrainedStereotype;
		// -end- 364B66900259 get_body4551E98A02BB
		// "Constraint::getConstrainedStereotype"
	}

	/**
	 * tests if there is a ConstrainedStereotype attached.
	 * 
	 * @see #attachConstrainedStereotype
	 */
	// -beg- preserve=no 364B66900259 test_head4551E98A02BB
	// "Constraint::containsConstrainedStereotype"
	public boolean containsConstrainedStereotype()
	// -end- 364B66900259 test_head4551E98A02BB
	// "Constraint::containsConstrainedStereotype"
	{
		// -beg- preserve=no 364B66900259 test_body4551E98A02BB
		// "Constraint::containsConstrainedStereotype"
		return constrainedStereotype != null;
		// -end- 364B66900259 test_body4551E98A02BB
		// "Constraint::containsConstrainedStereotype"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 364B66900259 _link_body4551E98A02BB
	// "Constraint::_linkConstrainedStereotype"
	public void _linkConstrainedStereotype(Stereotype constrainedStereotype1) {
		constrainedStereotype = constrainedStereotype1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkConstrainedStereotype"));
		return;
	}
	// -end- 364B66900259 _link_body4551E98A02BB
	// "Constraint::_linkConstrainedStereotype"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 364B66900259 _unlink_body4551E98A02BB
	// "Constraint::_unlinkConstrainedStereotype"
	public void _unlinkConstrainedStereotype(Stereotype constrainedStereotype1) {
		constrainedStereotype = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
				new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkConstrainedStereotype"));
		return;
	}
	// -end- 364B66900259 _unlink_body4551E98A02BB
	// "Constraint::_unlinkConstrainedStereotype"

	// -beg- preserve=no 32866F630244 var4551E98A02BB "body"
	private BooleanExpression body = null;
	// -end- 32866F630244 var4551E98A02BB "body"

	/**
	 * get current value of body
	 * 
	 * @see #setBody
	 */
	// -beg- preserve=no 32866F630244 get_head4551E98A02BB "body"
	public BooleanExpression getBody()
	// -end- 32866F630244 get_head4551E98A02BB "body"
	{
		// -beg- preserve=no 32866F630244 get_body4551E98A02BB "body"
		return body;
		// -end- 32866F630244 get_body4551E98A02BB "body"
	}

	/**
	 * set current value of body
	 * 
	 * @see #getBody
	 */
	// -beg- preserve=no 32866F630244 set_head4551E98A02BB "body"
	public void setBody(BooleanExpression value1)
	// -end- 32866F630244 set_head4551E98A02BB "body"
	{
		// -beg- preserve=no 32866F630244 set_body4551E98A02BB "body"
		if (body != value1 && (body == null || !body.equals(value1))) {
			body = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setBody"));
		}
		// -end- 32866F630244 set_body4551E98A02BB "body"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMettaAttrb(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551E98A02BB detail_end "UmlConstraint"

	// -end- 4551E98A02BB detail_end "UmlConstraint"

}
