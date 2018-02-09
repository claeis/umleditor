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

// -beg- preserve=no 358A5F6F01B7 package "AttributeDef"
package ch.ehi.interlis.attributes;
// -end- 358A5F6F01B7 package "AttributeDef"

// -beg- preserve=no 358A5F6F01B7 autoimport "AttributeDef"
import ch.ehi.uml1_4.foundation.core.Attribute;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.interlis.modeltopicclass.IdentDef;
import ch.ehi.interlis.logicalexpressions.FunctionCall;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.interlis.attributes.AttrType;
import ch.ehi.interlis.domainsandconstants.basetypes.Constant;
import ch.ehi.interlis.attributes.AttributeValueUsage;
import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.attributes.AttributeSubdivisionKind;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.collaborations.AssociationEndRole;
import ch.ehi.uml1_4.behaviour.commonbehavior.AttributeLink;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.datatypes.Expression;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
import ch.ehi.uml1_4.foundation.datatypes.ChangeableKind;
import ch.ehi.uml1_4.foundation.datatypes.ScopeKind;
import ch.ehi.uml1_4.foundation.datatypes.OrderingKind;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
// -end- 358A5F6F01B7 autoimport "AttributeDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5F6F01B7 import "AttributeDef"

// -end- 358A5F6F01B7 import "AttributeDef"

/**
 * Definition eines Attributes (Feldes) innerhalb einer Klasse.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.2 $ $Date: 2006-06-13 14:23:05 $
 */
public class AttributeDef extends AbstractModelElement implements Attribute, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5F6F01B7 detail_begin "AttributeDef"

	// -end- 358A5F6F01B7 detail_begin "AttributeDef"

	private static final long serialVersionUID = -1937154760396973712L;

	// -beg- preserve=no 3D4FA21A0213 head358A5F6F01B7 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21A0213 head358A5F6F01B7 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A0213 throws358A5F6F01B7 "unlinkAll"

	// -end- 3D4FA21A0213 throws358A5F6F01B7 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A0213 body358A5F6F01B7 "unlinkAll"

		clearIdentDef();
		// Role SurfaceType: SurfaceType object(s) may point to this
		detachFunctionCall();
		detachOwner();
		detachAttrType();
		detachConstant();
		detachAttributeValueUsage();
		setName(null);
		setMetaAttrb(null);
		setConsistencyRequirement(null);
		clearAssociationEndRole();
		clearAttributeLink();
		detachAssociationEnd();
		setInitialValue(null);
		// Role Type: Classifier object(s) may point to this
		setMultiplicity(null);
		clearClassifierRole();
		clearBehavior();
		clearPartition();
		clearCollaboration();
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
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA21A0213 body358A5F6F01B7 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21A023B head358A5F6F01B7 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21A023B head358A5F6F01B7 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A023B throws358A5F6F01B7 "enumerateChildren"

	// -end- 3D4FA21A023B throws358A5F6F01B7 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A023B body358A5F6F01B7 "enumerateChildren"
		java.util.Iterator it = null;
		if (containsFunctionCall())
			visitor.visit(getFunctionCall());
		if (containsAttrType())
			visitor.visit(getAttrType());
		if (containsConstant())
			visitor.visit(getConstant());
		if (containsAttributeValueUsage())
			visitor.visit(getAttributeValueUsage());
		visitor.visit(getName());
		visitor.visit(getMetaAttrb());
		visitor.visit(getConsistencyRequirement());
		visitor.visit(getInitialValue());
		visitor.visit(getMultiplicity());
		it = iteratorBehavior();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTaggedValue();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTemplateParameter();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21A023B body358A5F6F01B7 "enumerateChildren"
	}

	// -beg- preserve=no 358A621003A9 code358A5F6F01B7 "identDef"
	private java.util.Set identDef = new java.util.HashSet();
	// -end- 358A621003A9 code358A5F6F01B7 "identDef"

	/**
	 * add a IdentDef.
	 *
	 * @see #removeIdentDef
	 * @see #containsIdentDef
	 * @see #iteratorIdentDef
	 * @see #clearIdentDef
	 * @see #sizeIdentDef
	 */
	// -beg- preserve=no 358A621003A9 add_head358A5F6F01B7
	// "AttributeDef::addIdentDef"
	public void addIdentDef(IdentDef identDef1)
	// -end- 358A621003A9 add_head358A5F6F01B7 "AttributeDef::addIdentDef"
	{
		// -beg- preserve=no 358A621003A9 add_body358A5F6F01B7
		// "AttributeDef::addIdentDef"
		identDef.add(identDef1);
		identDef1._linkAttributeDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addIdentDef"));
		return;
		// -end- 358A621003A9 add_body358A5F6F01B7 "AttributeDef::addIdentDef"
	}

	/**
	 * disconnect a IdentDef.
	 * 
	 * @see #addIdentDef
	 */
	// -beg- preserve=no 358A621003A9 remove_head358A5F6F01B7
	// "AttributeDef::removeIdentDef"
	public IdentDef removeIdentDef(IdentDef identDef1)
	// -end- 358A621003A9 remove_head358A5F6F01B7 "AttributeDef::removeIdentDef"
	{
		// -beg- preserve=no 358A621003A9 remove_body358A5F6F01B7
		// "AttributeDef::removeIdentDef"
		IdentDef ret = null;
		if (identDef1 == null || !identDef.contains(identDef1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = identDef1;
		identDef.remove(identDef1);
		identDef1._unlinkAttributeDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeIdentDef"));
		return ret;
		// -end- 358A621003A9 remove_body358A5F6F01B7
		// "AttributeDef::removeIdentDef"
	}

	/**
	 * tests if a given IdentDef is connected.
	 * 
	 * @see #addIdentDef
	 */
	// -beg- preserve=no 358A621003A9 test_head358A5F6F01B7
	// "AttributeDef::containsIdentDef"
	public boolean containsIdentDef(IdentDef identDef1)
	// -end- 358A621003A9 test_head358A5F6F01B7 "AttributeDef::containsIdentDef"
	{
		// -beg- preserve=no 358A621003A9 test_body358A5F6F01B7
		// "AttributeDef::containsIdentDef"
		return identDef.contains(identDef1);
		// -end- 358A621003A9 test_body358A5F6F01B7
		// "AttributeDef::containsIdentDef"
	}

	/**
	 * used to enumerate all connected IdentDefs.
	 * 
	 * @see #addIdentDef
	 */
	// -beg- preserve=no 358A621003A9 get_all_head358A5F6F01B7
	// "AttributeDef::iteratorIdentDef"
	public java.util.Iterator iteratorIdentDef()
	// -end- 358A621003A9 get_all_head358A5F6F01B7
	// "AttributeDef::iteratorIdentDef"
	{
		// -beg- preserve=no 358A621003A9 get_all_body358A5F6F01B7
		// "AttributeDef::iteratorIdentDef"
		return identDef.iterator();
		// -end- 358A621003A9 get_all_body358A5F6F01B7
		// "AttributeDef::iteratorIdentDef"
	}

	/**
	 * disconnect all IdentDefs.
	 * 
	 * @see #addIdentDef
	 */
	// -beg- preserve=no 358A621003A9 remove_all_head358A5F6F01B7
	// "AttributeDef::clearIdentDef"
	public void clearIdentDef()
	// -end- 358A621003A9 remove_all_head358A5F6F01B7
	// "AttributeDef::clearIdentDef"
	{
		// -beg- preserve=no 358A621003A9 remove_all_body358A5F6F01B7
		// "AttributeDef::clearIdentDef"
		if (sizeIdentDef() > 0) {
			for (java.util.Iterator p = identDef.iterator(); p.hasNext();) {
				((IdentDef) p.next())._unlinkAttributeDef(this);
			}
			identDef.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearIdentDef"));
		}
		// -end- 358A621003A9 remove_all_body358A5F6F01B7
		// "AttributeDef::clearIdentDef"
	}

	/**
	 * returns the number of IdentDefs.
	 * 
	 * @see #addIdentDef
	 */
	// -beg- preserve=no 358A621003A9 size_head358A5F6F01B7
	// "AttributeDef::sizeIdentDef"
	public int sizeIdentDef()
	// -end- 358A621003A9 size_head358A5F6F01B7 "AttributeDef::sizeIdentDef"
	{
		// -beg- preserve=no 358A621003A9 size_body358A5F6F01B7
		// "AttributeDef::sizeIdentDef"
		return identDef.size();
		// -end- 358A621003A9 size_body358A5F6F01B7 "AttributeDef::sizeIdentDef"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A621003A9 _link_body358A5F6F01B7
	// "AttributeDef::_linkIdentDef"
	public void _linkIdentDef(IdentDef identDef1) {
		identDef.add(identDef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkIdentDef"));
		return;
	}
	// -end- 358A621003A9 _link_body358A5F6F01B7 "AttributeDef::_linkIdentDef"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A621003A9 _unlink_body358A5F6F01B7
	// "AttributeDef::_unlinkIdentDef"
	public void _unlinkIdentDef(IdentDef identDef1) {
		identDef.remove(identDef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkIdentDef"));
		return;
	}
	// -end- 358A621003A9 _unlink_body358A5F6F01B7
	// "AttributeDef::_unlinkIdentDef"

	// -beg- preserve=no 394744550078 code358A5F6F01B7 "functionCall"
	private FunctionCall functionCall;
	// -end- 394744550078 code358A5F6F01B7 "functionCall"

	/**
	 * attaches a FunctionCall.
	 *
	 * @see #detachFunctionCall
	 * @see #getFunctionCall
	 * @see #containsFunctionCall
	 */
	// -beg- preserve=no 394744550078 attach_head358A5F6F01B7
	// "AttributeDef::attachFunctionCall"
	public void attachFunctionCall(FunctionCall functionCall1)
	// -end- 394744550078 attach_head358A5F6F01B7
	// "AttributeDef::attachFunctionCall"
	{
		// -beg- preserve=no 394744550078 attach_body358A5F6F01B7
		// "AttributeDef::attachFunctionCall"
		if (functionCall != null) {
			throw new java.lang.IllegalStateException("already a functionCall attached");
		}
		if (functionCall1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as functionCall");
		}
		functionCall = functionCall1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachFunctionCall"));
		return;
		// -end- 394744550078 attach_body358A5F6F01B7
		// "AttributeDef::attachFunctionCall"
	}

	/**
	 * disconnect the currently attached FunctionCall.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 394744550078 detach_head358A5F6F01B7
	// "AttributeDef::detachFunctionCall"
	public FunctionCall detachFunctionCall()
	// -end- 394744550078 detach_head358A5F6F01B7
	// "AttributeDef::detachFunctionCall"
	{
		// -beg- preserve=no 394744550078 detach_body358A5F6F01B7
		// "AttributeDef::detachFunctionCall"
		FunctionCall ret = null;
		ret = functionCall;
		functionCall = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachFunctionCall"));
		return ret;
		// -end- 394744550078 detach_body358A5F6F01B7
		// "AttributeDef::detachFunctionCall"
	}

	/**
	 * get the currently attached FunctionCall.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 394744550078 get_head358A5F6F01B7
	// "AttributeDef::getFunctionCall"
	public FunctionCall getFunctionCall()
	// -end- 394744550078 get_head358A5F6F01B7 "AttributeDef::getFunctionCall"
	{
		// -beg- preserve=no 394744550078 get_body358A5F6F01B7
		// "AttributeDef::getFunctionCall"
		if (functionCall == null) {
			throw new java.lang.IllegalStateException("no functionCall attached");
		}
		return functionCall;
		// -end- 394744550078 get_body358A5F6F01B7
		// "AttributeDef::getFunctionCall"
	}

	/**
	 * tests if there is a FunctionCall attached.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 394744550078 test_head358A5F6F01B7
	// "AttributeDef::containsFunctionCall"
	public boolean containsFunctionCall()
	// -end- 394744550078 test_head358A5F6F01B7
	// "AttributeDef::containsFunctionCall"
	{
		// -beg- preserve=no 394744550078 test_body358A5F6F01B7
		// "AttributeDef::containsFunctionCall"
		return functionCall != null;
		// -end- 394744550078 test_body358A5F6F01B7
		// "AttributeDef::containsFunctionCall"
	}

	// -beg- preserve=no 32B5D7EF03DD code358A5F6F01B7 "owner"
	private Classifier owner;
	// -end- 32B5D7EF03DD code358A5F6F01B7 "owner"

	/**
	 * attaches a Owner.
	 *
	 * @see #detachOwner
	 * @see #getOwner
	 * @see #containsOwner
	 */
	// -beg- preserve=no 32B5D7EF03DD attach_head358A5F6F01B7
	// "Feature::attachOwner"
	public void attachOwner(Classifier owner1)
	// -end- 32B5D7EF03DD attach_head358A5F6F01B7 "Feature::attachOwner"
	{
		// -beg- preserve=no 32B5D7EF03DD attach_body358A5F6F01B7
		// "Feature::attachOwner"
		if (owner != null) {
			throw new java.lang.IllegalStateException("already a owner attached");
		}
		if (owner1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as owner");
		}
		owner = owner1;
		owner1._linkFeature(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachOwner"));
		return;
		// -end- 32B5D7EF03DD attach_body358A5F6F01B7 "Feature::attachOwner"
	}

	/**
	 * disconnect the currently attached Owner.
	 * 
	 * @see #attachOwner
	 */
	// -beg- preserve=no 32B5D7EF03DD detach_head358A5F6F01B7
	// "Feature::detachOwner"
	public Classifier detachOwner()
	// -end- 32B5D7EF03DD detach_head358A5F6F01B7 "Feature::detachOwner"
	{
		// -beg- preserve=no 32B5D7EF03DD detach_body358A5F6F01B7
		// "Feature::detachOwner"
		Classifier ret = null;
		if (owner != null) {
			owner._unlinkFeature(this);
			ret = owner;
			owner = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachOwner"));
		return ret;
		// -end- 32B5D7EF03DD detach_body358A5F6F01B7 "Feature::detachOwner"
	}

	/**
	 * get the currently attached Owner.
	 * 
	 * @see #attachOwner
	 */
	// -beg- preserve=no 32B5D7EF03DD get_head358A5F6F01B7 "Feature::getOwner"
	public Classifier getOwner()
	// -end- 32B5D7EF03DD get_head358A5F6F01B7 "Feature::getOwner"
	{
		// -beg- preserve=no 32B5D7EF03DD get_body358A5F6F01B7
		// "Feature::getOwner"
		/*if (owner == null) {
			throw new java.lang.IllegalStateException("no owner attached");
		}*/
		return owner;
		// -end- 32B5D7EF03DD get_body358A5F6F01B7 "Feature::getOwner"
	}

	/**
	 * tests if there is a Owner attached.
	 * 
	 * @see #attachOwner
	 */
	// -beg- preserve=no 32B5D7EF03DD test_head358A5F6F01B7
	// "Feature::containsOwner"
	public boolean containsOwner()
	// -end- 32B5D7EF03DD test_head358A5F6F01B7 "Feature::containsOwner"
	{
		// -beg- preserve=no 32B5D7EF03DD test_body358A5F6F01B7
		// "Feature::containsOwner"
		return owner != null;
		// -end- 32B5D7EF03DD test_body358A5F6F01B7 "Feature::containsOwner"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03DD _link_body358A5F6F01B7
	// "Feature::_linkOwner"
	public void _linkOwner(Classifier owner1) {
		owner = owner1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkOwner"));
		return;
	}
	// -end- 32B5D7EF03DD _link_body358A5F6F01B7 "Feature::_linkOwner"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03DD _unlink_body358A5F6F01B7
	// "Feature::_unlinkOwner"
	public void _unlinkOwner(Classifier owner1) {
		owner = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkOwner"));
		return;
	}
	// -end- 32B5D7EF03DD _unlink_body358A5F6F01B7 "Feature::_unlinkOwner"

	// -beg- preserve=no 3C1786810327 code358A5F6F01B7 "attrType"
	private AttrType attrType;
	// -end- 3C1786810327 code358A5F6F01B7 "attrType"

	/**
	 * attaches a AttrType.
	 *
	 * @see #detachAttrType
	 * @see #getAttrType
	 * @see #containsAttrType
	 */
	// -beg- preserve=no 3C1786810327 attach_head358A5F6F01B7
	// "AttributeDef::attachAttrType"
	public void attachAttrType(AttrType attrType1)
	// -end- 3C1786810327 attach_head358A5F6F01B7 "AttributeDef::attachAttrType"
	{
		// -beg- preserve=no 3C1786810327 attach_body358A5F6F01B7
		// "AttributeDef::attachAttrType"
		if (attrType != null) {
			throw new java.lang.IllegalStateException("already a attrType attached");
		}
		if (attrType1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as attrType");
		}
		attrType = attrType1;
		attrType1._linkAttributeDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachAttrType"));
		return;
		// -end- 3C1786810327 attach_body358A5F6F01B7
		// "AttributeDef::attachAttrType"
	}

	/**
	 * disconnect the currently attached AttrType.
	 * 
	 * @see #attachAttrType
	 */
	// -beg- preserve=no 3C1786810327 detach_head358A5F6F01B7
	// "AttributeDef::detachAttrType"
	public AttrType detachAttrType()
	// -end- 3C1786810327 detach_head358A5F6F01B7 "AttributeDef::detachAttrType"
	{
		// -beg- preserve=no 3C1786810327 detach_body358A5F6F01B7
		// "AttributeDef::detachAttrType"
		AttrType ret = null;
		if (attrType != null) {
			attrType._unlinkAttributeDef(this);
			ret = attrType;
			attrType = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachAttrType"));
		return ret;
		// -end- 3C1786810327 detach_body358A5F6F01B7
		// "AttributeDef::detachAttrType"
	}

	/**
	 * get the currently attached AttrType.
	 * 
	 * @see #attachAttrType
	 */
	// -beg- preserve=no 3C1786810327 get_head358A5F6F01B7
	// "AttributeDef::getAttrType"
	public AttrType getAttrType()
	// -end- 3C1786810327 get_head358A5F6F01B7 "AttributeDef::getAttrType"
	{
		// -beg- preserve=no 3C1786810327 get_body358A5F6F01B7
		// "AttributeDef::getAttrType"
		if (attrType == null) {
			throw new java.lang.IllegalStateException("no attrType attached");
		}
		return attrType;
		// -end- 3C1786810327 get_body358A5F6F01B7 "AttributeDef::getAttrType"
	}

	/**
	 * tests if there is a AttrType attached.
	 * 
	 * @see #attachAttrType
	 */
	// -beg- preserve=no 3C1786810327 test_head358A5F6F01B7
	// "AttributeDef::containsAttrType"
	public boolean containsAttrType()
	// -end- 3C1786810327 test_head358A5F6F01B7 "AttributeDef::containsAttrType"
	{
		// -beg- preserve=no 3C1786810327 test_body358A5F6F01B7
		// "AttributeDef::containsAttrType"
		return attrType != null;
		// -end- 3C1786810327 test_body358A5F6F01B7
		// "AttributeDef::containsAttrType"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3C1786810327 _link_body358A5F6F01B7
	// "AttributeDef::_linkAttrType"
	public void _linkAttrType(AttrType attrType1) {
		attrType = attrType1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAttrType"));
		return;
	}
	// -end- 3C1786810327 _link_body358A5F6F01B7 "AttributeDef::_linkAttrType"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3C1786810327 _unlink_body358A5F6F01B7
	// "AttributeDef::_unlinkAttrType"
	public void _unlinkAttrType(AttrType attrType1) {
		attrType = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAttrType"));
		return;
	}
	// -end- 3C1786810327 _unlink_body358A5F6F01B7
	// "AttributeDef::_unlinkAttrType"

	// -beg- preserve=no 3C1DD2340244 code358A5F6F01B7 "constant"
	private Constant constant;
	// -end- 3C1DD2340244 code358A5F6F01B7 "constant"

	/**
	 * attaches a Constant.
	 *
	 * @see #detachConstant
	 * @see #getConstant
	 * @see #containsConstant
	 */
	// -beg- preserve=no 3C1DD2340244 attach_head358A5F6F01B7
	// "AttributeDef::attachConstant"
	public void attachConstant(Constant constant1)
	// -end- 3C1DD2340244 attach_head358A5F6F01B7 "AttributeDef::attachConstant"
	{
		// -beg- preserve=no 3C1DD2340244 attach_body358A5F6F01B7
		// "AttributeDef::attachConstant"
		if (constant != null) {
			throw new java.lang.IllegalStateException("already a constant attached");
		}
		if (constant1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as constant");
		}
		constant = constant1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachConstant"));
		return;
		// -end- 3C1DD2340244 attach_body358A5F6F01B7
		// "AttributeDef::attachConstant"
	}

	/**
	 * disconnect the currently attached Constant.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3C1DD2340244 detach_head358A5F6F01B7
	// "AttributeDef::detachConstant"
	public Constant detachConstant()
	// -end- 3C1DD2340244 detach_head358A5F6F01B7 "AttributeDef::detachConstant"
	{
		// -beg- preserve=no 3C1DD2340244 detach_body358A5F6F01B7
		// "AttributeDef::detachConstant"
		Constant ret = null;
		ret = constant;
		constant = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachConstant"));
		return ret;
		// -end- 3C1DD2340244 detach_body358A5F6F01B7
		// "AttributeDef::detachConstant"
	}

	/**
	 * get the currently attached Constant.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3C1DD2340244 get_head358A5F6F01B7
	// "AttributeDef::getConstant"
	public Constant getConstant()
	// -end- 3C1DD2340244 get_head358A5F6F01B7 "AttributeDef::getConstant"
	{
		// -beg- preserve=no 3C1DD2340244 get_body358A5F6F01B7
		// "AttributeDef::getConstant"
		if (constant == null) {
			throw new java.lang.IllegalStateException("no constant attached");
		}
		return constant;
		// -end- 3C1DD2340244 get_body358A5F6F01B7 "AttributeDef::getConstant"
	}

	/**
	 * tests if there is a Constant attached.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3C1DD2340244 test_head358A5F6F01B7
	// "AttributeDef::containsConstant"
	public boolean containsConstant()
	// -end- 3C1DD2340244 test_head358A5F6F01B7 "AttributeDef::containsConstant"
	{
		// -beg- preserve=no 3C1DD2340244 test_body358A5F6F01B7
		// "AttributeDef::containsConstant"
		return constant != null;
		// -end- 3C1DD2340244 test_body358A5F6F01B7
		// "AttributeDef::containsConstant"
	}

	// -beg- preserve=no 3C1DD30601BC code358A5F6F01B7 "attributeValueUsage"
	private AttributeValueUsage attributeValueUsage;
	// -end- 3C1DD30601BC code358A5F6F01B7 "attributeValueUsage"

	/**
	 * attaches a AttributeValueUsage.
	 *
	 * @see #detachAttributeValueUsage
	 * @see #getAttributeValueUsage
	 * @see #containsAttributeValueUsage
	 */
	// -beg- preserve=no 3C1DD30601BC attach_head358A5F6F01B7
	// "AttributeDef::attachAttributeValueUsage"
	public void attachAttributeValueUsage(AttributeValueUsage attributeValueUsage1)
	// -end- 3C1DD30601BC attach_head358A5F6F01B7
	// "AttributeDef::attachAttributeValueUsage"
	{
		// -beg- preserve=no 3C1DD30601BC attach_body358A5F6F01B7
		// "AttributeDef::attachAttributeValueUsage"
		if (attributeValueUsage != null) {
			throw new java.lang.IllegalStateException("already a attributeValueUsage attached");
		}
		if (attributeValueUsage1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as attributeValueUsage");
		}
		attributeValueUsage = attributeValueUsage1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachAttributeValueUsage"));
		return;
		// -end- 3C1DD30601BC attach_body358A5F6F01B7
		// "AttributeDef::attachAttributeValueUsage"
	}

	/**
	 * disconnect the currently attached AttributeValueUsage.
	 * 
	 * @see #attachAttributeValueUsage
	 */
	// -beg- preserve=no 3C1DD30601BC detach_head358A5F6F01B7
	// "AttributeDef::detachAttributeValueUsage"
	public AttributeValueUsage detachAttributeValueUsage()
	// -end- 3C1DD30601BC detach_head358A5F6F01B7
	// "AttributeDef::detachAttributeValueUsage"
	{
		// -beg- preserve=no 3C1DD30601BC detach_body358A5F6F01B7
		// "AttributeDef::detachAttributeValueUsage"
		AttributeValueUsage ret = null;
		ret = attributeValueUsage;
		attributeValueUsage = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachAttributeValueUsage"));
		return ret;
		// -end- 3C1DD30601BC detach_body358A5F6F01B7
		// "AttributeDef::detachAttributeValueUsage"
	}

	/**
	 * get the currently attached AttributeValueUsage.
	 * 
	 * @see #attachAttributeValueUsage
	 */
	// -beg- preserve=no 3C1DD30601BC get_head358A5F6F01B7
	// "AttributeDef::getAttributeValueUsage"
	public AttributeValueUsage getAttributeValueUsage()
	// -end- 3C1DD30601BC get_head358A5F6F01B7
	// "AttributeDef::getAttributeValueUsage"
	{
		// -beg- preserve=no 3C1DD30601BC get_body358A5F6F01B7
		// "AttributeDef::getAttributeValueUsage"
		if (attributeValueUsage == null) {
			throw new java.lang.IllegalStateException("no attributeValueUsage attached");
		}
		return attributeValueUsage;
		// -end- 3C1DD30601BC get_body358A5F6F01B7
		// "AttributeDef::getAttributeValueUsage"
	}

	/**
	 * tests if there is a AttributeValueUsage attached.
	 * 
	 * @see #attachAttributeValueUsage
	 */
	// -beg- preserve=no 3C1DD30601BC test_head358A5F6F01B7
	// "AttributeDef::containsAttributeValueUsage"
	public boolean containsAttributeValueUsage()
	// -end- 3C1DD30601BC test_head358A5F6F01B7
	// "AttributeDef::containsAttributeValueUsage"
	{
		// -beg- preserve=no 3C1DD30601BC test_body358A5F6F01B7
		// "AttributeDef::containsAttributeValueUsage"
		return attributeValueUsage != null;
		// -end- 3C1DD30601BC test_body358A5F6F01B7
		// "AttributeDef::containsAttributeValueUsage"
	}

	// -beg- preserve=no 358A62870332 var358A5F6F01B7 "name"

	// -end- 358A62870332 var358A5F6F01B7 "name"

	/**
	 * get current value of name Name des Attributes.
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 358A62870332 get_head358A5F6F01B7 "name"
	public NlsString getName()
	// -end- 358A62870332 get_head358A5F6F01B7 "name"
	{
		// -beg- preserve=no 358A62870332 get_body358A5F6F01B7 "name"
		return super.getName();
		// -end- 358A62870332 get_body358A5F6F01B7 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 358A62870332 set_head358A5F6F01B7 "name"
	public void setName(NlsString value1)
	// -end- 358A62870332 set_head358A5F6F01B7 "name"
	{
		// -beg- preserve=no 358A62870332 set_body358A5F6F01B7 "name"
		super.setName(value1);
		// -end- 358A62870332 set_body358A5F6F01B7 "name"
	}

	// -beg- preserve=no 358A6D3E02BE var358A5F6F01B7 "consistencyRequirement"
	private NlsString consistencyRequirement = null;
	// -end- 358A6D3E02BE var358A5F6F01B7 "consistencyRequirement"

	/**
	 * get current value of consistencyRequirement Nur in INTERLIS1 vorhanden.
	 * 
	 * @see #setConsistencyRequirement
	 */
	// -beg- preserve=no 358A6D3E02BE get_head358A5F6F01B7
	// "consistencyRequirement"
	public NlsString getConsistencyRequirement()
	// -end- 358A6D3E02BE get_head358A5F6F01B7 "consistencyRequirement"
	{
		// -beg- preserve=no 358A6D3E02BE get_body358A5F6F01B7
		// "consistencyRequirement"
		return consistencyRequirement;
		// -end- 358A6D3E02BE get_body358A5F6F01B7 "consistencyRequirement"
	}

	/**
	 * set current value of consistencyRequirement
	 * 
	 * @see #getConsistencyRequirement
	 */
	// -beg- preserve=no 358A6D3E02BE set_head358A5F6F01B7
	// "consistencyRequirement"
	public void setConsistencyRequirement(NlsString value1)
	// -end- 358A6D3E02BE set_head358A5F6F01B7 "consistencyRequirement"
	{
		// -beg- preserve=no 358A6D3E02BE set_body358A5F6F01B7
		// "consistencyRequirement"
		if (consistencyRequirement != value1
				&& (consistencyRequirement == null || !consistencyRequirement.equals(value1))) {
			consistencyRequirement = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
					new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setConsistencyRequirement"));
		}
		// -end- 358A6D3E02BE set_body358A5F6F01B7 "consistencyRequirement"
	}

	// -beg- preserve=no 3C1DCFAB00E2 var358A5F6F01B7 "isAbstract"
	private boolean isAbstract;
	// -end- 3C1DCFAB00E2 var358A5F6F01B7 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 3C1DCFAB00E2 get_head358A5F6F01B7 "isAbstract"
	public boolean isAbstract()
	// -end- 3C1DCFAB00E2 get_head358A5F6F01B7 "isAbstract"
	{
		// -beg- preserve=no 3C1DCFAB00E2 get_body358A5F6F01B7 "isAbstract"
		return isAbstract;
		// -end- 3C1DCFAB00E2 get_body358A5F6F01B7 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 3C1DCFAB00E2 set_head358A5F6F01B7 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 3C1DCFAB00E2 set_head358A5F6F01B7 "isAbstract"
	{
		// -beg- preserve=no 3C1DCFAB00E2 set_body358A5F6F01B7 "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 3C1DCFAB00E2 set_body358A5F6F01B7 "isAbstract"
	}

	// -beg- preserve=no 3C1DCFB30351 var358A5F6F01B7 "propExtended"
	private boolean propExtended;
	// -end- 3C1DCFB30351 var358A5F6F01B7 "propExtended"

	/**
	 * get current value of propExtended
	 * 
	 * @see #setPropExtended
	 */
	// -beg- preserve=no 3C1DCFB30351 get_head358A5F6F01B7 "propExtended"
	public boolean isPropExtended()
	// -end- 3C1DCFB30351 get_head358A5F6F01B7 "propExtended"
	{
		// -beg- preserve=no 3C1DCFB30351 get_body358A5F6F01B7 "propExtended"
		return propExtended;
		// -end- 3C1DCFB30351 get_body358A5F6F01B7 "propExtended"
	}

	/**
	 * set current value of propExtended
	 * 
	 * @see #isPropExtended
	 */
	// -beg- preserve=no 3C1DCFB30351 set_head358A5F6F01B7 "propExtended"
	public void setPropExtended(boolean value1)
	// -end- 3C1DCFB30351 set_head358A5F6F01B7 "propExtended"
	{
		// -beg- preserve=no 3C1DCFB30351 set_body358A5F6F01B7 "propExtended"
		if (propExtended != value1) {
			propExtended = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setPropExtended"));
		}
		// -end- 3C1DCFB30351 set_body358A5F6F01B7 "propExtended"
	}

	// -beg- preserve=no 3C1DCFBD0174 var358A5F6F01B7 "propFinal"
	private boolean propFinal;
	// -end- 3C1DCFBD0174 var358A5F6F01B7 "propFinal"

	/**
	 * get current value of propFinal
	 * 
	 * @see #setPropFinal
	 */
	// -beg- preserve=no 3C1DCFBD0174 get_head358A5F6F01B7 "propFinal"
	public boolean isPropFinal()
	// -end- 3C1DCFBD0174 get_head358A5F6F01B7 "propFinal"
	{
		// -beg- preserve=no 3C1DCFBD0174 get_body358A5F6F01B7 "propFinal"
		return propFinal;
		// -end- 3C1DCFBD0174 get_body358A5F6F01B7 "propFinal"
	}

	/**
	 * set current value of propFinal
	 * 
	 * @see #isPropFinal
	 */
	// -beg- preserve=no 3C1DCFBD0174 set_head358A5F6F01B7 "propFinal"
	public void setPropFinal(boolean value1)
	// -end- 3C1DCFBD0174 set_head358A5F6F01B7 "propFinal"
	{
		// -beg- preserve=no 3C1DCFBD0174 set_body358A5F6F01B7 "propFinal"
		if (propFinal != value1) {
			propFinal = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setPropFinal"));
		}
		// -end- 3C1DCFBD0174 set_body358A5F6F01B7 "propFinal"
	}

	// -beg- preserve=no 44892AB30395 var358A5F6F01B7 "propTransient"
	private boolean propTransient;
	// -end- 44892AB30395 var358A5F6F01B7 "propTransient"

	/**
	 * get current value of propTransient
	 * 
	 * @see #setPropTransient
	 */
	// -beg- preserve=no 44892AB30395 get_head358A5F6F01B7 "propTransient"
	public boolean isPropTransient()
	// -end- 44892AB30395 get_head358A5F6F01B7 "propTransient"
	{
		// -beg- preserve=no 44892AB30395 get_body358A5F6F01B7 "propTransient"
		return propTransient;
		// -end- 44892AB30395 get_body358A5F6F01B7 "propTransient"
	}

	/**
	 * set current value of propTransient
	 * 
	 * @see #isPropTransient
	 */
	// -beg- preserve=no 44892AB30395 set_head358A5F6F01B7 "propTransient"
	public void setPropTransient(boolean value1)
	// -end- 44892AB30395 set_head358A5F6F01B7 "propTransient"
	{
		// -beg- preserve=no 44892AB30395 set_body358A5F6F01B7 "propTransient"
		if (propTransient != value1) {
			propTransient = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setPropTransient"));
		}
		// -end- 44892AB30395 set_body358A5F6F01B7 "propTransient"
	}

	// -beg- preserve=no 44892C0E0357 var358A5F6F01B7 "subdivision"
	private int subdivision;
	// -end- 44892C0E0357 var358A5F6F01B7 "subdivision"

	/**
	 * get current value of subdivision
	 * 
	 * @see ch.ehi.interlis.attributes.AttributeSubdivisionKind
	 * @see #setSubdivision
	 */
	// -beg- preserve=no 44892C0E0357 get_head358A5F6F01B7 "subdivision"
	public int getSubdivision()
	// -end- 44892C0E0357 get_head358A5F6F01B7 "subdivision"
	{
		// -beg- preserve=no 44892C0E0357 get_body358A5F6F01B7 "subdivision"
		return subdivision;
		// -end- 44892C0E0357 get_body358A5F6F01B7 "subdivision"
	}

	/**
	 * set current value of subdivision
	 * 
	 * @see ch.ehi.interlis.attributes.AttributeSubdivisionKind
	 * @see #getSubdivision
	 */
	// -beg- preserve=no 44892C0E0357 set_head358A5F6F01B7 "subdivision"
	public void setSubdivision(int value1)
	// -end- 44892C0E0357 set_head358A5F6F01B7 "subdivision"
	{
		// -beg- preserve=no 44892C0E0357 set_body358A5F6F01B7 "subdivision"
		if (subdivision != value1) {
			subdivision = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSubdivision"));
		}
		// -end- 44892C0E0357 set_body358A5F6F01B7 "subdivision"
	}

	// -beg- preserve=no 3650E6BE0096 code358A5F6F01B7 "associationEndRole"
	private java.util.Set associationEndRole = new java.util.HashSet();
	// -end- 3650E6BE0096 code358A5F6F01B7 "associationEndRole"

	/**
	 * add a AssociationEndRole.
	 *
	 * @see #removeAssociationEndRole
	 * @see #containsAssociationEndRole
	 * @see #iteratorAssociationEndRole
	 * @see #clearAssociationEndRole
	 * @see #sizeAssociationEndRole
	 */
	// -beg- preserve=no 3650E6BE0096 add_head358A5F6F01B7
	// "Attribute::addAssociationEndRole"
	public void addAssociationEndRole(AssociationEndRole associationEndRole1)
	// -end- 3650E6BE0096 add_head358A5F6F01B7
	// "Attribute::addAssociationEndRole"
	{
		// -beg- preserve=no 3650E6BE0096 add_body358A5F6F01B7
		// "Attribute::addAssociationEndRole"
		associationEndRole.add(associationEndRole1);
		associationEndRole1._linkAvailableQualifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAssociationEndRole"));
		return;
		// -end- 3650E6BE0096 add_body358A5F6F01B7
		// "Attribute::addAssociationEndRole"
	}

	/**
	 * disconnect a AssociationEndRole.
	 * 
	 * @see #addAssociationEndRole
	 */
	// -beg- preserve=no 3650E6BE0096 remove_head358A5F6F01B7
	// "Attribute::removeAssociationEndRole"
	public AssociationEndRole removeAssociationEndRole(AssociationEndRole associationEndRole1)
	// -end- 3650E6BE0096 remove_head358A5F6F01B7
	// "Attribute::removeAssociationEndRole"
	{
		// -beg- preserve=no 3650E6BE0096 remove_body358A5F6F01B7
		// "Attribute::removeAssociationEndRole"
		AssociationEndRole ret = null;
		if (associationEndRole1 == null || !associationEndRole.contains(associationEndRole1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = associationEndRole1;
		associationEndRole.remove(associationEndRole1);
		associationEndRole1._unlinkAvailableQualifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAssociationEndRole"));
		return ret;
		// -end- 3650E6BE0096 remove_body358A5F6F01B7
		// "Attribute::removeAssociationEndRole"
	}

	/**
	 * tests if a given AssociationEndRole is connected.
	 * 
	 * @see #addAssociationEndRole
	 */
	// -beg- preserve=no 3650E6BE0096 test_head358A5F6F01B7
	// "Attribute::containsAssociationEndRole"
	public boolean containsAssociationEndRole(AssociationEndRole associationEndRole1)
	// -end- 3650E6BE0096 test_head358A5F6F01B7
	// "Attribute::containsAssociationEndRole"
	{
		// -beg- preserve=no 3650E6BE0096 test_body358A5F6F01B7
		// "Attribute::containsAssociationEndRole"
		return associationEndRole.contains(associationEndRole1);
		// -end- 3650E6BE0096 test_body358A5F6F01B7
		// "Attribute::containsAssociationEndRole"
	}

	/**
	 * used to enumerate all connected AssociationEndRoles.
	 * 
	 * @see #addAssociationEndRole
	 */
	// -beg- preserve=no 3650E6BE0096 get_all_head358A5F6F01B7
	// "Attribute::iteratorAssociationEndRole"
	public java.util.Iterator iteratorAssociationEndRole()
	// -end- 3650E6BE0096 get_all_head358A5F6F01B7
	// "Attribute::iteratorAssociationEndRole"
	{
		// -beg- preserve=no 3650E6BE0096 get_all_body358A5F6F01B7
		// "Attribute::iteratorAssociationEndRole"
		return associationEndRole.iterator();
		// -end- 3650E6BE0096 get_all_body358A5F6F01B7
		// "Attribute::iteratorAssociationEndRole"
	}

	/**
	 * disconnect all AssociationEndRoles.
	 * 
	 * @see #addAssociationEndRole
	 */
	// -beg- preserve=no 3650E6BE0096 remove_all_head358A5F6F01B7
	// "Attribute::clearAssociationEndRole"
	public void clearAssociationEndRole()
	// -end- 3650E6BE0096 remove_all_head358A5F6F01B7
	// "Attribute::clearAssociationEndRole"
	{
		// -beg- preserve=no 3650E6BE0096 remove_all_body358A5F6F01B7
		// "Attribute::clearAssociationEndRole"
		if (sizeAssociationEndRole() > 0) {
			for (java.util.Iterator p = associationEndRole.iterator(); p.hasNext();) {
				((AssociationEndRole) p.next())._unlinkAvailableQualifier(this);
			}
			associationEndRole.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAssociationEndRole"));
		}
		// -end- 3650E6BE0096 remove_all_body358A5F6F01B7
		// "Attribute::clearAssociationEndRole"
	}

	/**
	 * returns the number of AssociationEndRoles.
	 * 
	 * @see #addAssociationEndRole
	 */
	// -beg- preserve=no 3650E6BE0096 size_head358A5F6F01B7
	// "Attribute::sizeAssociationEndRole"
	public int sizeAssociationEndRole()
	// -end- 3650E6BE0096 size_head358A5F6F01B7
	// "Attribute::sizeAssociationEndRole"
	{
		// -beg- preserve=no 3650E6BE0096 size_body358A5F6F01B7
		// "Attribute::sizeAssociationEndRole"
		return associationEndRole.size();
		// -end- 3650E6BE0096 size_body358A5F6F01B7
		// "Attribute::sizeAssociationEndRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3650E6BE0096 _link_body358A5F6F01B7
	// "Attribute::_linkAssociationEndRole"
	public void _linkAssociationEndRole(AssociationEndRole associationEndRole1) {
		associationEndRole.add(associationEndRole1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAssociationEndRole"));
		return;
	}
	// -end- 3650E6BE0096 _link_body358A5F6F01B7
	// "Attribute::_linkAssociationEndRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3650E6BE0096 _unlink_body358A5F6F01B7
	// "Attribute::_unlinkAssociationEndRole"
	public void _unlinkAssociationEndRole(AssociationEndRole associationEndRole1) {
		associationEndRole.remove(associationEndRole1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAssociationEndRole"));
		return;
	}
	// -end- 3650E6BE0096 _unlink_body358A5F6F01B7
	// "Attribute::_unlinkAssociationEndRole"

	// -beg- preserve=no 33DBC16F0028 code358A5F6F01B7 "attributeLink"
	private java.util.Set attributeLink = new java.util.HashSet();
	// -end- 33DBC16F0028 code358A5F6F01B7 "attributeLink"

	/**
	 * add a AttributeLink.
	 *
	 * @see #removeAttributeLink
	 * @see #containsAttributeLink
	 * @see #iteratorAttributeLink
	 * @see #clearAttributeLink
	 * @see #sizeAttributeLink
	 */
	// -beg- preserve=no 33DBC16F0028 add_head358A5F6F01B7
	// "Attribute::addAttributeLink"
	public void addAttributeLink(AttributeLink attributeLink1)
	// -end- 33DBC16F0028 add_head358A5F6F01B7 "Attribute::addAttributeLink"
	{
		// -beg- preserve=no 33DBC16F0028 add_body358A5F6F01B7
		// "Attribute::addAttributeLink"
		attributeLink.add(attributeLink1);
		attributeLink1._linkAttribute(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAttributeLink"));
		return;
		// -end- 33DBC16F0028 add_body358A5F6F01B7 "Attribute::addAttributeLink"
	}

	/**
	 * disconnect a AttributeLink.
	 * 
	 * @see #addAttributeLink
	 */
	// -beg- preserve=no 33DBC16F0028 remove_head358A5F6F01B7
	// "Attribute::removeAttributeLink"
	public AttributeLink removeAttributeLink(AttributeLink attributeLink1)
	// -end- 33DBC16F0028 remove_head358A5F6F01B7
	// "Attribute::removeAttributeLink"
	{
		// -beg- preserve=no 33DBC16F0028 remove_body358A5F6F01B7
		// "Attribute::removeAttributeLink"
		AttributeLink ret = null;
		if (attributeLink1 == null || !attributeLink.contains(attributeLink1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = attributeLink1;
		attributeLink.remove(attributeLink1);
		attributeLink1._unlinkAttribute(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAttributeLink"));
		return ret;
		// -end- 33DBC16F0028 remove_body358A5F6F01B7
		// "Attribute::removeAttributeLink"
	}

	/**
	 * tests if a given AttributeLink is connected.
	 * 
	 * @see #addAttributeLink
	 */
	// -beg- preserve=no 33DBC16F0028 test_head358A5F6F01B7
	// "Attribute::containsAttributeLink"
	public boolean containsAttributeLink(AttributeLink attributeLink1)
	// -end- 33DBC16F0028 test_head358A5F6F01B7
	// "Attribute::containsAttributeLink"
	{
		// -beg- preserve=no 33DBC16F0028 test_body358A5F6F01B7
		// "Attribute::containsAttributeLink"
		return attributeLink.contains(attributeLink1);
		// -end- 33DBC16F0028 test_body358A5F6F01B7
		// "Attribute::containsAttributeLink"
	}

	/**
	 * used to enumerate all connected AttributeLinks.
	 * 
	 * @see #addAttributeLink
	 */
	// -beg- preserve=no 33DBC16F0028 get_all_head358A5F6F01B7
	// "Attribute::iteratorAttributeLink"
	public java.util.Iterator iteratorAttributeLink()
	// -end- 33DBC16F0028 get_all_head358A5F6F01B7
	// "Attribute::iteratorAttributeLink"
	{
		// -beg- preserve=no 33DBC16F0028 get_all_body358A5F6F01B7
		// "Attribute::iteratorAttributeLink"
		return attributeLink.iterator();
		// -end- 33DBC16F0028 get_all_body358A5F6F01B7
		// "Attribute::iteratorAttributeLink"
	}

	/**
	 * disconnect all AttributeLinks.
	 * 
	 * @see #addAttributeLink
	 */
	// -beg- preserve=no 33DBC16F0028 remove_all_head358A5F6F01B7
	// "Attribute::clearAttributeLink"
	public void clearAttributeLink()
	// -end- 33DBC16F0028 remove_all_head358A5F6F01B7
	// "Attribute::clearAttributeLink"
	{
		// -beg- preserve=no 33DBC16F0028 remove_all_body358A5F6F01B7
		// "Attribute::clearAttributeLink"
		if (sizeAttributeLink() > 0) {
			for (java.util.Iterator p = attributeLink.iterator(); p.hasNext();) {
				((AttributeLink) p.next())._unlinkAttribute(this);
			}
			attributeLink.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAttributeLink"));
		}
		// -end- 33DBC16F0028 remove_all_body358A5F6F01B7
		// "Attribute::clearAttributeLink"
	}

	/**
	 * returns the number of AttributeLinks.
	 * 
	 * @see #addAttributeLink
	 */
	// -beg- preserve=no 33DBC16F0028 size_head358A5F6F01B7
	// "Attribute::sizeAttributeLink"
	public int sizeAttributeLink()
	// -end- 33DBC16F0028 size_head358A5F6F01B7 "Attribute::sizeAttributeLink"
	{
		// -beg- preserve=no 33DBC16F0028 size_body358A5F6F01B7
		// "Attribute::sizeAttributeLink"
		return attributeLink.size();
		// -end- 33DBC16F0028 size_body358A5F6F01B7
		// "Attribute::sizeAttributeLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33DBC16F0028 _link_body358A5F6F01B7
	// "Attribute::_linkAttributeLink"
	public void _linkAttributeLink(AttributeLink attributeLink1) {
		attributeLink.add(attributeLink1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAttributeLink"));
		return;
	}
	// -end- 33DBC16F0028 _link_body358A5F6F01B7 "Attribute::_linkAttributeLink"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33DBC16F0028 _unlink_body358A5F6F01B7
	// "Attribute::_unlinkAttributeLink"
	public void _unlinkAttributeLink(AttributeLink attributeLink1) {
		attributeLink.remove(attributeLink1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAttributeLink"));
		return;
	}
	// -end- 33DBC16F0028 _unlink_body358A5F6F01B7
	// "Attribute::_unlinkAttributeLink"

	// -beg- preserve=no 33DBE50B001E code358A5F6F01B7 "associationEnd"
	private AssociationEnd associationEnd;
	// -end- 33DBE50B001E code358A5F6F01B7 "associationEnd"

	/**
	 * attaches a AssociationEnd.
	 *
	 * @see #detachAssociationEnd
	 * @see #getAssociationEnd
	 * @see #containsAssociationEnd
	 */
	// -beg- preserve=no 33DBE50B001E attach_head358A5F6F01B7
	// "Attribute::attachAssociationEnd"
	public void attachAssociationEnd(AssociationEnd associationEnd1)
	// -end- 33DBE50B001E attach_head358A5F6F01B7
	// "Attribute::attachAssociationEnd"
	{
		// -beg- preserve=no 33DBE50B001E attach_body358A5F6F01B7
		// "Attribute::attachAssociationEnd"
		if (associationEnd != null) {
			throw new java.lang.IllegalStateException("already a associationEnd attached");
		}
		if (associationEnd1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as associationEnd");
		}
		associationEnd = associationEnd1;
		associationEnd1._linkQualifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachAssociationEnd"));
		return;
		// -end- 33DBE50B001E attach_body358A5F6F01B7
		// "Attribute::attachAssociationEnd"
	}

	/**
	 * disconnect the currently attached AssociationEnd.
	 * 
	 * @see #attachAssociationEnd
	 */
	// -beg- preserve=no 33DBE50B001E detach_head358A5F6F01B7
	// "Attribute::detachAssociationEnd"
	public AssociationEnd detachAssociationEnd()
	// -end- 33DBE50B001E detach_head358A5F6F01B7
	// "Attribute::detachAssociationEnd"
	{
		// -beg- preserve=no 33DBE50B001E detach_body358A5F6F01B7
		// "Attribute::detachAssociationEnd"
		AssociationEnd ret = null;
		if (associationEnd != null) {
			associationEnd._unlinkQualifier(this);
			ret = associationEnd;
			associationEnd = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachAssociationEnd"));
		return ret;
		// -end- 33DBE50B001E detach_body358A5F6F01B7
		// "Attribute::detachAssociationEnd"
	}

	/**
	 * get the currently attached AssociationEnd.
	 * 
	 * @see #attachAssociationEnd
	 */
	// -beg- preserve=no 33DBE50B001E get_head358A5F6F01B7
	// "Attribute::getAssociationEnd"
	public AssociationEnd getAssociationEnd()
	// -end- 33DBE50B001E get_head358A5F6F01B7 "Attribute::getAssociationEnd"
	{
		// -beg- preserve=no 33DBE50B001E get_body358A5F6F01B7
		// "Attribute::getAssociationEnd"
		if (associationEnd == null) {
			throw new java.lang.IllegalStateException("no associationEnd attached");
		}
		return associationEnd;
		// -end- 33DBE50B001E get_body358A5F6F01B7
		// "Attribute::getAssociationEnd"
	}

	/**
	 * tests if there is a AssociationEnd attached.
	 * 
	 * @see #attachAssociationEnd
	 */
	// -beg- preserve=no 33DBE50B001E test_head358A5F6F01B7
	// "Attribute::containsAssociationEnd"
	public boolean containsAssociationEnd()
	// -end- 33DBE50B001E test_head358A5F6F01B7
	// "Attribute::containsAssociationEnd"
	{
		// -beg- preserve=no 33DBE50B001E test_body358A5F6F01B7
		// "Attribute::containsAssociationEnd"
		return associationEnd != null;
		// -end- 33DBE50B001E test_body358A5F6F01B7
		// "Attribute::containsAssociationEnd"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33DBE50B001E _link_body358A5F6F01B7
	// "Attribute::_linkAssociationEnd"
	public void _linkAssociationEnd(AssociationEnd associationEnd1) {
		associationEnd = associationEnd1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAssociationEnd"));
		return;
	}
	// -end- 33DBE50B001E _link_body358A5F6F01B7
	// "Attribute::_linkAssociationEnd"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33DBE50B001E _unlink_body358A5F6F01B7
	// "Attribute::_unlinkAssociationEnd"
	public void _unlinkAssociationEnd(AssociationEnd associationEnd1) {
		associationEnd = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAssociationEnd"));
		return;
	}
	// -end- 33DBE50B001E _unlink_body358A5F6F01B7
	// "Attribute::_unlinkAssociationEnd"

	// -beg- preserve=no 327BBC7501CC var358A5F6F01B7 "initialValue"
	private Expression initialValue = null;
	// -end- 327BBC7501CC var358A5F6F01B7 "initialValue"

	/**
	 * get current value of initialValue
	 * 
	 * @see #setInitialValue
	 */
	// -beg- preserve=no 327BBC7501CC get_head358A5F6F01B7 "initialValue"
	public Expression getInitialValue()
	// -end- 327BBC7501CC get_head358A5F6F01B7 "initialValue"
	{
		// -beg- preserve=no 327BBC7501CC get_body358A5F6F01B7 "initialValue"
		return initialValue;
		// -end- 327BBC7501CC get_body358A5F6F01B7 "initialValue"
	}

	/**
	 * set current value of initialValue
	 * 
	 * @see #getInitialValue
	 */
	// -beg- preserve=no 327BBC7501CC set_head358A5F6F01B7 "initialValue"
	public void setInitialValue(Expression value1)
	// -end- 327BBC7501CC set_head358A5F6F01B7 "initialValue"
	{
		// -beg- preserve=no 327BBC7501CC set_body358A5F6F01B7 "initialValue"
		if (initialValue != value1 && (initialValue == null || !initialValue.equals(value1))) {
			initialValue = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setInitialValue"));
		}
		// -end- 327BBC7501CC set_body358A5F6F01B7 "initialValue"
	}

	// -beg- preserve=no 32B6AEA8032B var358A5F6F01B7 "multiplicity"
	private Multiplicity multiplicity = null;
	// -end- 32B6AEA8032B var358A5F6F01B7 "multiplicity"

	/**
	 * get current value of multiplicity
	 * 
	 * @see #setMultiplicity
	 */
	// -beg- preserve=no 32B6AEA8032B get_head358A5F6F01B7 "multiplicity"
	public Multiplicity getMultiplicity()
	// -end- 32B6AEA8032B get_head358A5F6F01B7 "multiplicity"
	{
		// -beg- preserve=no 32B6AEA8032B get_body358A5F6F01B7 "multiplicity"
		return multiplicity;
		// -end- 32B6AEA8032B get_body358A5F6F01B7 "multiplicity"
	}

	/**
	 * set current value of multiplicity
	 * 
	 * @see #getMultiplicity
	 */
	// -beg- preserve=no 32B6AEA8032B set_head358A5F6F01B7 "multiplicity"
	public void setMultiplicity(Multiplicity value1)
	// -end- 32B6AEA8032B set_head358A5F6F01B7 "multiplicity"
	{
		// -beg- preserve=no 32B6AEA8032B set_body358A5F6F01B7 "multiplicity"
		if (multiplicity != value1 && (multiplicity == null || !multiplicity.equals(value1))) {
			multiplicity = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMultiplicity"));
		}
		// -end- 32B6AEA8032B set_body358A5F6F01B7 "multiplicity"
	}

	// -beg- preserve=no 3163DE07014A var358A5F6F01B7 "changeability"
	private int changeability;
	// -end- 3163DE07014A var358A5F6F01B7 "changeability"

	/**
	 * get current value of changeability
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
	 * @see #setChangeability
	 */
	// -beg- preserve=no 3163DE07014A get_head358A5F6F01B7 "changeability"
	public int getChangeability()
	// -end- 3163DE07014A get_head358A5F6F01B7 "changeability"
	{
		// -beg- preserve=no 3163DE07014A get_body358A5F6F01B7 "changeability"
		return changeability;
		// -end- 3163DE07014A get_body358A5F6F01B7 "changeability"
	}

	/**
	 * set current value of changeability
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
	 * @see #getChangeability
	 */
	// -beg- preserve=no 3163DE07014A set_head358A5F6F01B7 "changeability"
	public void setChangeability(int value1)
	// -end- 3163DE07014A set_head358A5F6F01B7 "changeability"
	{
		// -beg- preserve=no 3163DE07014A set_body358A5F6F01B7 "changeability"
		if (changeability != value1) {
			changeability = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setChangeability"));
		}
		// -end- 3163DE07014A set_body358A5F6F01B7 "changeability"
	}

	// -beg- preserve=no 335A35E5028A var358A5F6F01B7 "targetScope"
	private int targetScope;
	// -end- 335A35E5028A var358A5F6F01B7 "targetScope"

	/**
	 * get current value of targetScope
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
	 * @see #setTargetScope
	 */
	// -beg- preserve=no 335A35E5028A get_head358A5F6F01B7 "targetScope"
	public int getTargetScope()
	// -end- 335A35E5028A get_head358A5F6F01B7 "targetScope"
	{
		// -beg- preserve=no 335A35E5028A get_body358A5F6F01B7 "targetScope"
		return targetScope;
		// -end- 335A35E5028A get_body358A5F6F01B7 "targetScope"
	}

	/**
	 * set current value of targetScope
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
	 * @see #getTargetScope
	 */
	// -beg- preserve=no 335A35E5028A set_head358A5F6F01B7 "targetScope"
	public void setTargetScope(int value1)
	// -end- 335A35E5028A set_head358A5F6F01B7 "targetScope"
	{
		// -beg- preserve=no 335A35E5028A set_body358A5F6F01B7 "targetScope"
		if (targetScope != value1) {
			targetScope = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setTargetScope"));
		}
		// -end- 335A35E5028A set_body358A5F6F01B7 "targetScope"
	}

	// -beg- preserve=no 3A554D5703C8 var358A5F6F01B7 "ordering"
	private int ordering;
	// -end- 3A554D5703C8 var358A5F6F01B7 "ordering"

	/**
	 * get current value of ordering
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
	 * @see #setOrdering
	 */
	// -beg- preserve=no 3A554D5703C8 get_head358A5F6F01B7 "ordering"
	public int getOrdering()
	// -end- 3A554D5703C8 get_head358A5F6F01B7 "ordering"
	{
		// -beg- preserve=no 3A554D5703C8 get_body358A5F6F01B7 "ordering"
		return ordering;
		// -end- 3A554D5703C8 get_body358A5F6F01B7 "ordering"
	}

	/**
	 * set current value of ordering
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
	 * @see #getOrdering
	 */
	// -beg- preserve=no 3A554D5703C8 set_head358A5F6F01B7 "ordering"
	public void setOrdering(int value1)
	// -end- 3A554D5703C8 set_head358A5F6F01B7 "ordering"
	{
		// -beg- preserve=no 3A554D5703C8 set_body358A5F6F01B7 "ordering"
		if (ordering != value1) {
			ordering = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setOrdering"));
		}
		// -end- 3A554D5703C8 set_body358A5F6F01B7 "ordering"
	}

	// -beg- preserve=no 36008FB700E7 code358A5F6F01B7 "classifierRole"

	// -end- 36008FB700E7 code358A5F6F01B7 "classifierRole"

	/**
	 * add a ClassifierRole.
	 *
	 * @see #removeClassifierRole
	 * @see #containsClassifierRole
	 * @see #iteratorClassifierRole
	 * @see #clearClassifierRole
	 * @see #sizeClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 add_head358A5F6F01B7
	// "ModelElement::addClassifierRole"
	public void addClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 add_head358A5F6F01B7 "ModelElement::addClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 add_body358A5F6F01B7
		// "ModelElement::addClassifierRole"
		super.addClassifierRole(classifierRole1);
		// -end- 36008FB700E7 add_body358A5F6F01B7
		// "ModelElement::addClassifierRole"
	}

	/**
	 * disconnect a ClassifierRole.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_head358A5F6F01B7
	// "ModelElement::removeClassifierRole"
	public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 remove_head358A5F6F01B7
	// "ModelElement::removeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_body358A5F6F01B7
		// "ModelElement::removeClassifierRole"
		return super.removeClassifierRole(classifierRole1);
		// -end- 36008FB700E7 remove_body358A5F6F01B7
		// "ModelElement::removeClassifierRole"
	}

	/**
	 * tests if a given ClassifierRole is connected.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 test_head358A5F6F01B7
	// "ModelElement::containsClassifierRole"
	public boolean containsClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 test_head358A5F6F01B7
	// "ModelElement::containsClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 test_body358A5F6F01B7
		// "ModelElement::containsClassifierRole"
		return super.containsClassifierRole(classifierRole1);
		// -end- 36008FB700E7 test_body358A5F6F01B7
		// "ModelElement::containsClassifierRole"
	}

	/**
	 * used to enumerate all connected ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 get_all_head358A5F6F01B7
	// "ModelElement::iteratorClassifierRole"
	public java.util.Iterator iteratorClassifierRole()
	// -end- 36008FB700E7 get_all_head358A5F6F01B7
	// "ModelElement::iteratorClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 get_all_body358A5F6F01B7
		// "ModelElement::iteratorClassifierRole"
		return super.iteratorClassifierRole();
		// -end- 36008FB700E7 get_all_body358A5F6F01B7
		// "ModelElement::iteratorClassifierRole"
	}

	/**
	 * disconnect all ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_all_head358A5F6F01B7
	// "ModelElement::clearClassifierRole"
	public void clearClassifierRole()
	// -end- 36008FB700E7 remove_all_head358A5F6F01B7
	// "ModelElement::clearClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_all_body358A5F6F01B7
		// "ModelElement::clearClassifierRole"
		super.clearClassifierRole();
		// -end- 36008FB700E7 remove_all_body358A5F6F01B7
		// "ModelElement::clearClassifierRole"
	}

	/**
	 * returns the number of ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 size_head358A5F6F01B7
	// "ModelElement::sizeClassifierRole"
	public int sizeClassifierRole()
	// -end- 36008FB700E7 size_head358A5F6F01B7
	// "ModelElement::sizeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 size_body358A5F6F01B7
		// "ModelElement::sizeClassifierRole"
		return super.sizeClassifierRole();
		// -end- 36008FB700E7 size_body358A5F6F01B7
		// "ModelElement::sizeClassifierRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _link_body358A5F6F01B7
	// "ModelElement::_linkClassifierRole"
	public void _linkClassifierRole(ClassifierRole classifierRole1) {
		super._linkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _link_body358A5F6F01B7
	// "ModelElement::_linkClassifierRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _unlink_body358A5F6F01B7
	// "ModelElement::_unlinkClassifierRole"
	public void _unlinkClassifierRole(ClassifierRole classifierRole1) {
		super._unlinkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _unlink_body358A5F6F01B7
	// "ModelElement::_unlinkClassifierRole"

	// -beg- preserve=no 31653E23032A var358A5F6F01B7 "ownerScope"
	private int ownerScope;
	// -end- 31653E23032A var358A5F6F01B7 "ownerScope"

	/**
	 * get current value of ownerScope
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
	 * @see #setOwnerScope
	 */
	// -beg- preserve=no 31653E23032A get_head358A5F6F01B7 "ownerScope"
	public int getOwnerScope()
	// -end- 31653E23032A get_head358A5F6F01B7 "ownerScope"
	{
		// -beg- preserve=no 31653E23032A get_body358A5F6F01B7 "ownerScope"
		return ownerScope;
		// -end- 31653E23032A get_body358A5F6F01B7 "ownerScope"
	}

	/**
	 * set current value of ownerScope
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
	 * @see #getOwnerScope
	 */
	// -beg- preserve=no 31653E23032A set_head358A5F6F01B7 "ownerScope"
	public void setOwnerScope(int value1)
	// -end- 31653E23032A set_head358A5F6F01B7 "ownerScope"
	{
		// -beg- preserve=no 31653E23032A set_body358A5F6F01B7 "ownerScope"
		if (ownerScope != value1) {
			ownerScope = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setOwnerScope"));
		}
		// -end- 31653E23032A set_body358A5F6F01B7 "ownerScope"
	}

	// -beg- preserve=no 33D1265902DA var358A5F6F01B7 "visibility"
	private int visibility;
	// -end- 33D1265902DA var358A5F6F01B7 "visibility"

	/**
	 * get current value of visibility
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
	 * @see #setVisibility
	 */
	// -beg- preserve=no 33D1265902DA get_head358A5F6F01B7 "visibility"
	public int getVisibility()
	// -end- 33D1265902DA get_head358A5F6F01B7 "visibility"
	{
		// -beg- preserve=no 33D1265902DA get_body358A5F6F01B7 "visibility"
		return visibility;
		// -end- 33D1265902DA get_body358A5F6F01B7 "visibility"
	}

	/**
	 * set current value of visibility
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
	 * @see #getVisibility
	 */
	// -beg- preserve=no 33D1265902DA set_head358A5F6F01B7 "visibility"
	public void setVisibility(int value1)
	// -end- 33D1265902DA set_head358A5F6F01B7 "visibility"
	{
		// -beg- preserve=no 33D1265902DA set_body358A5F6F01B7 "visibility"
		if (visibility != value1) {
			visibility = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setVisibility"));
		}
		// -end- 33D1265902DA set_body358A5F6F01B7 "visibility"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 358A5F6F01B7 detail_end "AttributeDef"

	/**
	 * @deprecated
	 *
	 */
	public boolean isMandatory() {
		return false;
	}

	/**
	 * @deprecated
	 *
	 */
	public void setMandatory(boolean value1) {
		if (multiplicity == null) {
			ch.ehi.uml1_4.implementation.UmlMultiplicityRange r = new ch.ehi.uml1_4.implementation.UmlMultiplicityRange();
			r.setLower(value1 ? 1 : 0);
			r.setUpper(1);
			ch.ehi.uml1_4.implementation.UmlMultiplicity m = new ch.ehi.uml1_4.implementation.UmlMultiplicity();
			m.addRange(r);
			setMultiplicity(m);
		}
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

	// -end- 358A5F6F01B7 detail_end "AttributeDef"

}
