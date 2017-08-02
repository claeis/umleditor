// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-05 11:09:29 $
// $Revision: 1.2 $
//

// -beg- preserve=no 40432AE50263 package "UmlOperation"
package ch.ehi.uml1_4.implementation;
// -end- 40432AE50263 package "UmlOperation"

// -beg- preserve=no 40432AE50263 autoimport "UmlOperation"
import ch.ehi.uml1_4.foundation.core.Operation;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.commonbehavior.CallAction;
import ch.ehi.uml1_4.behaviour.statemachines.CallEvent;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.foundation.core.Method;
import ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind;
import ch.ehi.basics.types.NlsString;
import ch.ehi.uml1_4.behaviour.commonbehavior.Signal;
import ch.ehi.uml1_4.foundation.core.Parameter;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.datatypes.ScopeKind;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
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
// -end- 40432AE50263 autoimport "UmlOperation"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 40432AE50263 import "UmlOperation"

// -end- 40432AE50263 import "UmlOperation"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.2 $ $Date: 2004-03-05 11:09:29 $
 */
public class UmlOperation extends AbstractModelElement implements Operation {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 40432AE50263 detail_begin "UmlOperation"

	// -end- 40432AE50263 detail_begin "UmlOperation"

	// -beg- preserve=no 40432E3302E2 head40432AE50263 "unlinkAll"
	public void unlinkAll()
	// -end- 40432E3302E2 head40432AE50263 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 40432E3302E2 throws40432AE50263 "unlinkAll"

	// -end- 40432E3302E2 throws40432AE50263 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 40432E3302E2 body40432AE50263 "unlinkAll"

		clearCallAction();
		clearOccurrence();
		clearCollaboration();
		clearMethod();
		setSpecification(null);
		clearRaisedSignal();
		clearParameter();
		clearClassifierRole();
		detachOwner();
		clearBehavior();
		clearPartition();
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
		// -end- 40432E3302E2 body40432AE50263 "unlinkAll"
	}

	// -beg- preserve=no 40432E380194 head40432AE50263 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 40432E380194 head40432AE50263 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 40432E380194 throws40432AE50263 "enumerateChildren"

	// -end- 40432E380194 throws40432AE50263 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 40432E380194 body40432AE50263 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getSpecification());
		it = iteratorParameter();
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
		// -end- 40432E380194 body40432AE50263 "enumerateChildren"
	}

	// -beg- preserve=no 336991630064 code40432AE50263 "callAction"
	private java.util.Set callAction = new java.util.HashSet();
	// -end- 336991630064 code40432AE50263 "callAction"

	/**
	 * add a CallAction.
	 *
	 * @see #removeCallAction
	 * @see #containsCallAction
	 * @see #iteratorCallAction
	 * @see #clearCallAction
	 * @see #sizeCallAction
	 */
	// -beg- preserve=no 336991630064 add_head40432AE50263
	// "Operation::addCallAction"
	public void addCallAction(CallAction callAction1)
	// -end- 336991630064 add_head40432AE50263 "Operation::addCallAction"
	{
		// -beg- preserve=no 336991630064 add_body40432AE50263
		// "Operation::addCallAction"
		callAction.add(callAction1);
		callAction1._linkCalled(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addCallAction"));
		return;
		// -end- 336991630064 add_body40432AE50263 "Operation::addCallAction"
	}

	/**
	 * disconnect a CallAction.
	 * 
	 * @see #addCallAction
	 */
	// -beg- preserve=no 336991630064 remove_head40432AE50263
	// "Operation::removeCallAction"
	public CallAction removeCallAction(CallAction callAction1)
	// -end- 336991630064 remove_head40432AE50263 "Operation::removeCallAction"
	{
		// -beg- preserve=no 336991630064 remove_body40432AE50263
		// "Operation::removeCallAction"
		CallAction ret = null;
		if (callAction1 == null || !callAction.contains(callAction1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = callAction1;
		callAction.remove(callAction1);
		callAction1._unlinkCalled(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeCallAction"));
		return ret;
		// -end- 336991630064 remove_body40432AE50263
		// "Operation::removeCallAction"
	}

	/**
	 * tests if a given CallAction is connected.
	 * 
	 * @see #addCallAction
	 */
	// -beg- preserve=no 336991630064 test_head40432AE50263
	// "Operation::containsCallAction"
	public boolean containsCallAction(CallAction callAction1)
	// -end- 336991630064 test_head40432AE50263 "Operation::containsCallAction"
	{
		// -beg- preserve=no 336991630064 test_body40432AE50263
		// "Operation::containsCallAction"
		return callAction.contains(callAction1);
		// -end- 336991630064 test_body40432AE50263
		// "Operation::containsCallAction"
	}

	/**
	 * used to enumerate all connected CallActions.
	 * 
	 * @see #addCallAction
	 */
	// -beg- preserve=no 336991630064 get_all_head40432AE50263
	// "Operation::iteratorCallAction"
	public java.util.Iterator iteratorCallAction()
	// -end- 336991630064 get_all_head40432AE50263
	// "Operation::iteratorCallAction"
	{
		// -beg- preserve=no 336991630064 get_all_body40432AE50263
		// "Operation::iteratorCallAction"
		return callAction.iterator();
		// -end- 336991630064 get_all_body40432AE50263
		// "Operation::iteratorCallAction"
	}

	/**
	 * disconnect all CallActions.
	 * 
	 * @see #addCallAction
	 */
	// -beg- preserve=no 336991630064 remove_all_head40432AE50263
	// "Operation::clearCallAction"
	public void clearCallAction()
	// -end- 336991630064 remove_all_head40432AE50263
	// "Operation::clearCallAction"
	{
		// -beg- preserve=no 336991630064 remove_all_body40432AE50263
		// "Operation::clearCallAction"
		if (sizeCallAction() > 0) {
			for (java.util.Iterator p = callAction.iterator(); p.hasNext();) {
				((CallAction) p.next())._unlinkCalled(this);
			}
			callAction.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearCallAction"));
		}
		// -end- 336991630064 remove_all_body40432AE50263
		// "Operation::clearCallAction"
	}

	/**
	 * returns the number of CallActions.
	 * 
	 * @see #addCallAction
	 */
	// -beg- preserve=no 336991630064 size_head40432AE50263
	// "Operation::sizeCallAction"
	public int sizeCallAction()
	// -end- 336991630064 size_head40432AE50263 "Operation::sizeCallAction"
	{
		// -beg- preserve=no 336991630064 size_body40432AE50263
		// "Operation::sizeCallAction"
		return callAction.size();
		// -end- 336991630064 size_body40432AE50263 "Operation::sizeCallAction"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 336991630064 _link_body40432AE50263
	// "Operation::_linkCallAction"
	public void _linkCallAction(CallAction callAction1) {
		callAction.add(callAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkCallAction"));
		return;
	}
	// -end- 336991630064 _link_body40432AE50263 "Operation::_linkCallAction"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 336991630064 _unlink_body40432AE50263
	// "Operation::_unlinkCallAction"
	public void _unlinkCallAction(CallAction callAction1) {
		callAction.remove(callAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkCallAction"));
		return;
	}
	// -end- 336991630064 _unlink_body40432AE50263
	// "Operation::_unlinkCallAction"

	// -beg- preserve=no 32B598450001 code40432AE50263 "occurrence"
	private java.util.Set occurrence = new java.util.HashSet();
	// -end- 32B598450001 code40432AE50263 "occurrence"

	/**
	 * add a Occurrence.
	 *
	 * @see #removeOccurrence
	 * @see #containsOccurrence
	 * @see #iteratorOccurrence
	 * @see #clearOccurrence
	 * @see #sizeOccurrence
	 */
	// -beg- preserve=no 32B598450001 add_head40432AE50263
	// "Operation::addOccurrence"
	public void addOccurrence(CallEvent occurrence1)
	// -end- 32B598450001 add_head40432AE50263 "Operation::addOccurrence"
	{
		// -beg- preserve=no 32B598450001 add_body40432AE50263
		// "Operation::addOccurrence"
		occurrence.add(occurrence1);
		occurrence1._linkOperation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addOccurrence"));
		return;
		// -end- 32B598450001 add_body40432AE50263 "Operation::addOccurrence"
	}

	/**
	 * disconnect a Occurrence.
	 * 
	 * @see #addOccurrence
	 */
	// -beg- preserve=no 32B598450001 remove_head40432AE50263
	// "Operation::removeOccurrence"
	public CallEvent removeOccurrence(CallEvent occurrence1)
	// -end- 32B598450001 remove_head40432AE50263 "Operation::removeOccurrence"
	{
		// -beg- preserve=no 32B598450001 remove_body40432AE50263
		// "Operation::removeOccurrence"
		CallEvent ret = null;
		if (occurrence1 == null || !occurrence.contains(occurrence1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = occurrence1;
		occurrence.remove(occurrence1);
		occurrence1._unlinkOperation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeOccurrence"));
		return ret;
		// -end- 32B598450001 remove_body40432AE50263
		// "Operation::removeOccurrence"
	}

	/**
	 * tests if a given Occurrence is connected.
	 * 
	 * @see #addOccurrence
	 */
	// -beg- preserve=no 32B598450001 test_head40432AE50263
	// "Operation::containsOccurrence"
	public boolean containsOccurrence(CallEvent occurrence1)
	// -end- 32B598450001 test_head40432AE50263 "Operation::containsOccurrence"
	{
		// -beg- preserve=no 32B598450001 test_body40432AE50263
		// "Operation::containsOccurrence"
		return occurrence.contains(occurrence1);
		// -end- 32B598450001 test_body40432AE50263
		// "Operation::containsOccurrence"
	}

	/**
	 * used to enumerate all connected Occurrences.
	 * 
	 * @see #addOccurrence
	 */
	// -beg- preserve=no 32B598450001 get_all_head40432AE50263
	// "Operation::iteratorOccurrence"
	public java.util.Iterator iteratorOccurrence()
	// -end- 32B598450001 get_all_head40432AE50263
	// "Operation::iteratorOccurrence"
	{
		// -beg- preserve=no 32B598450001 get_all_body40432AE50263
		// "Operation::iteratorOccurrence"
		return occurrence.iterator();
		// -end- 32B598450001 get_all_body40432AE50263
		// "Operation::iteratorOccurrence"
	}

	/**
	 * disconnect all Occurrences.
	 * 
	 * @see #addOccurrence
	 */
	// -beg- preserve=no 32B598450001 remove_all_head40432AE50263
	// "Operation::clearOccurrence"
	public void clearOccurrence()
	// -end- 32B598450001 remove_all_head40432AE50263
	// "Operation::clearOccurrence"
	{
		// -beg- preserve=no 32B598450001 remove_all_body40432AE50263
		// "Operation::clearOccurrence"
		if (sizeOccurrence() > 0) {
			for (java.util.Iterator p = occurrence.iterator(); p.hasNext();) {
				((CallEvent) p.next())._unlinkOperation(this);
			}
			occurrence.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearOccurrence"));
		}
		// -end- 32B598450001 remove_all_body40432AE50263
		// "Operation::clearOccurrence"
	}

	/**
	 * returns the number of Occurrences.
	 * 
	 * @see #addOccurrence
	 */
	// -beg- preserve=no 32B598450001 size_head40432AE50263
	// "Operation::sizeOccurrence"
	public int sizeOccurrence()
	// -end- 32B598450001 size_head40432AE50263 "Operation::sizeOccurrence"
	{
		// -beg- preserve=no 32B598450001 size_body40432AE50263
		// "Operation::sizeOccurrence"
		return occurrence.size();
		// -end- 32B598450001 size_body40432AE50263 "Operation::sizeOccurrence"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B598450001 _link_body40432AE50263
	// "Operation::_linkOccurrence"
	public void _linkOccurrence(CallEvent occurrence1) {
		occurrence.add(occurrence1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkOccurrence"));
		return;
	}
	// -end- 32B598450001 _link_body40432AE50263 "Operation::_linkOccurrence"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B598450001 _unlink_body40432AE50263
	// "Operation::_unlinkOccurrence"
	public void _unlinkOccurrence(CallEvent occurrence1) {
		occurrence.remove(occurrence1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkOccurrence"));
		return;
	}
	// -end- 32B598450001 _unlink_body40432AE50263
	// "Operation::_unlinkOccurrence"

	// -beg- preserve=no 33D1394E029F code40432AE50263 "collaboration"

	// -end- 33D1394E029F code40432AE50263 "collaboration"

	/**
	 * add a Collaboration.
	 *
	 * @see #removeCollaboration
	 * @see #containsCollaboration
	 * @see #iteratorCollaboration
	 * @see #clearCollaboration
	 * @see #sizeCollaboration
	 */
	// -beg- preserve=no 33D1394E029F add_head40432AE50263
	// "ModelElement::addCollaboration"
	public void addCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F add_head40432AE50263 "ModelElement::addCollaboration"
	{
		// -beg- preserve=no 33D1394E029F add_body40432AE50263
		// "ModelElement::addCollaboration"
		super.addCollaboration(collaboration1);
		// -end- 33D1394E029F add_body40432AE50263
		// "ModelElement::addCollaboration"
	}

	/**
	 * disconnect a Collaboration.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_head40432AE50263
	// "ModelElement::removeCollaboration"
	public Collaboration removeCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F remove_head40432AE50263
	// "ModelElement::removeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_body40432AE50263
		// "ModelElement::removeCollaboration"
		return super.removeCollaboration(collaboration1);
		// -end- 33D1394E029F remove_body40432AE50263
		// "ModelElement::removeCollaboration"
	}

	/**
	 * tests if a given Collaboration is connected.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F test_head40432AE50263
	// "ModelElement::containsCollaboration"
	public boolean containsCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F test_head40432AE50263
	// "ModelElement::containsCollaboration"
	{
		// -beg- preserve=no 33D1394E029F test_body40432AE50263
		// "ModelElement::containsCollaboration"
		return super.containsCollaboration(collaboration1);
		// -end- 33D1394E029F test_body40432AE50263
		// "ModelElement::containsCollaboration"
	}

	/**
	 * used to enumerate all connected Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F get_all_head40432AE50263
	// "ModelElement::iteratorCollaboration"
	public java.util.Iterator iteratorCollaboration()
	// -end- 33D1394E029F get_all_head40432AE50263
	// "ModelElement::iteratorCollaboration"
	{
		// -beg- preserve=no 33D1394E029F get_all_body40432AE50263
		// "ModelElement::iteratorCollaboration"
		return super.iteratorCollaboration();
		// -end- 33D1394E029F get_all_body40432AE50263
		// "ModelElement::iteratorCollaboration"
	}

	/**
	 * disconnect all Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_all_head40432AE50263
	// "ModelElement::clearCollaboration"
	public void clearCollaboration()
	// -end- 33D1394E029F remove_all_head40432AE50263
	// "ModelElement::clearCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_all_body40432AE50263
		// "ModelElement::clearCollaboration"
		super.clearCollaboration();
		// -end- 33D1394E029F remove_all_body40432AE50263
		// "ModelElement::clearCollaboration"
	}

	/**
	 * returns the number of Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F size_head40432AE50263
	// "ModelElement::sizeCollaboration"
	public int sizeCollaboration()
	// -end- 33D1394E029F size_head40432AE50263
	// "ModelElement::sizeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F size_body40432AE50263
		// "ModelElement::sizeCollaboration"
		return super.sizeCollaboration();
		// -end- 33D1394E029F size_body40432AE50263
		// "ModelElement::sizeCollaboration"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _link_body40432AE50263
	// "ModelElement::_linkCollaboration"
	public void _linkCollaboration(Collaboration collaboration1) {
		super._linkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _link_body40432AE50263
	// "ModelElement::_linkCollaboration"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _unlink_body40432AE50263
	// "ModelElement::_unlinkCollaboration"
	public void _unlinkCollaboration(Collaboration collaboration1) {
		super._unlinkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _unlink_body40432AE50263
	// "ModelElement::_unlinkCollaboration"

	// -beg- preserve=no 32B6D9BE00C8 code40432AE50263 "method"
	private java.util.Set method = new java.util.HashSet();
	// -end- 32B6D9BE00C8 code40432AE50263 "method"

	/**
	 * add a Method.
	 *
	 * @see #removeMethod
	 * @see #containsMethod
	 * @see #iteratorMethod
	 * @see #clearMethod
	 * @see #sizeMethod
	 */
	// -beg- preserve=no 32B6D9BE00C8 add_head40432AE50263
	// "Operation::addMethod"
	public void addMethod(Method method1)
	// -end- 32B6D9BE00C8 add_head40432AE50263 "Operation::addMethod"
	{
		// -beg- preserve=no 32B6D9BE00C8 add_body40432AE50263
		// "Operation::addMethod"
		method.add(method1);
		method1._linkSpecification(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addMethod"));
		return;
		// -end- 32B6D9BE00C8 add_body40432AE50263 "Operation::addMethod"
	}

	/**
	 * disconnect a Method.
	 * 
	 * @see #addMethod
	 */
	// -beg- preserve=no 32B6D9BE00C8 remove_head40432AE50263
	// "Operation::removeMethod"
	public Method removeMethod(Method method1)
	// -end- 32B6D9BE00C8 remove_head40432AE50263 "Operation::removeMethod"
	{
		// -beg- preserve=no 32B6D9BE00C8 remove_body40432AE50263
		// "Operation::removeMethod"
		Method ret = null;
		if (method1 == null || !method.contains(method1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = method1;
		method.remove(method1);
		method1._unlinkSpecification(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeMethod"));
		return ret;
		// -end- 32B6D9BE00C8 remove_body40432AE50263 "Operation::removeMethod"
	}

	/**
	 * tests if a given Method is connected.
	 * 
	 * @see #addMethod
	 */
	// -beg- preserve=no 32B6D9BE00C8 test_head40432AE50263
	// "Operation::containsMethod"
	public boolean containsMethod(Method method1)
	// -end- 32B6D9BE00C8 test_head40432AE50263 "Operation::containsMethod"
	{
		// -beg- preserve=no 32B6D9BE00C8 test_body40432AE50263
		// "Operation::containsMethod"
		return method.contains(method1);
		// -end- 32B6D9BE00C8 test_body40432AE50263 "Operation::containsMethod"
	}

	/**
	 * used to enumerate all connected Methods.
	 * 
	 * @see #addMethod
	 */
	// -beg- preserve=no 32B6D9BE00C8 get_all_head40432AE50263
	// "Operation::iteratorMethod"
	public java.util.Iterator iteratorMethod()
	// -end- 32B6D9BE00C8 get_all_head40432AE50263 "Operation::iteratorMethod"
	{
		// -beg- preserve=no 32B6D9BE00C8 get_all_body40432AE50263
		// "Operation::iteratorMethod"
		return method.iterator();
		// -end- 32B6D9BE00C8 get_all_body40432AE50263
		// "Operation::iteratorMethod"
	}

	/**
	 * disconnect all Methods.
	 * 
	 * @see #addMethod
	 */
	// -beg- preserve=no 32B6D9BE00C8 remove_all_head40432AE50263
	// "Operation::clearMethod"
	public void clearMethod()
	// -end- 32B6D9BE00C8 remove_all_head40432AE50263 "Operation::clearMethod"
	{
		// -beg- preserve=no 32B6D9BE00C8 remove_all_body40432AE50263
		// "Operation::clearMethod"
		if (sizeMethod() > 0) {
			for (java.util.Iterator p = method.iterator(); p.hasNext();) {
				((Method) p.next())._unlinkSpecification(this);
			}
			method.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearMethod"));
		}
		// -end- 32B6D9BE00C8 remove_all_body40432AE50263
		// "Operation::clearMethod"
	}

	/**
	 * returns the number of Methods.
	 * 
	 * @see #addMethod
	 */
	// -beg- preserve=no 32B6D9BE00C8 size_head40432AE50263
	// "Operation::sizeMethod"
	public int sizeMethod()
	// -end- 32B6D9BE00C8 size_head40432AE50263 "Operation::sizeMethod"
	{
		// -beg- preserve=no 32B6D9BE00C8 size_body40432AE50263
		// "Operation::sizeMethod"
		return method.size();
		// -end- 32B6D9BE00C8 size_body40432AE50263 "Operation::sizeMethod"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B6D9BE00C8 _link_body40432AE50263
	// "Operation::_linkMethod"
	public void _linkMethod(Method method1) {
		method.add(method1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkMethod"));
		return;
	}
	// -end- 32B6D9BE00C8 _link_body40432AE50263 "Operation::_linkMethod"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B6D9BE00C8 _unlink_body40432AE50263
	// "Operation::_unlinkMethod"
	public void _unlinkMethod(Method method1) {
		method.remove(method1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkMethod"));
		return;
	}
	// -end- 32B6D9BE00C8 _unlink_body40432AE50263 "Operation::_unlinkMethod"

	// -beg- preserve=no 33F0E99F0230 var40432AE50263 "concurrency"
	private int concurrency;
	// -end- 33F0E99F0230 var40432AE50263 "concurrency"

	/**
	 * get current value of concurrency
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind
	 * @see #setConcurrency
	 */
	// -beg- preserve=no 33F0E99F0230 get_head40432AE50263 "concurrency"
	public int getConcurrency()
	// -end- 33F0E99F0230 get_head40432AE50263 "concurrency"
	{
		// -beg- preserve=no 33F0E99F0230 get_body40432AE50263 "concurrency"
		return concurrency;
		// -end- 33F0E99F0230 get_body40432AE50263 "concurrency"
	}

	/**
	 * set current value of concurrency
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind
	 * @see #getConcurrency
	 */
	// -beg- preserve=no 33F0E99F0230 set_head40432AE50263 "concurrency"
	public void setConcurrency(int value1)
	// -end- 33F0E99F0230 set_head40432AE50263 "concurrency"
	{
		// -beg- preserve=no 33F0E99F0230 set_body40432AE50263 "concurrency"
		if (concurrency != value1) {
			concurrency = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setConcurrency"));
		}
		// -end- 33F0E99F0230 set_body40432AE50263 "concurrency"
	}

	// -beg- preserve=no 3627CF1A035C var40432AE50263 "isRoot"
	private boolean isRoot;
	// -end- 3627CF1A035C var40432AE50263 "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 3627CF1A035C get_head40432AE50263 "isRoot"
	public boolean isRoot()
	// -end- 3627CF1A035C get_head40432AE50263 "isRoot"
	{
		// -beg- preserve=no 3627CF1A035C get_body40432AE50263 "isRoot"
		return isRoot;
		// -end- 3627CF1A035C get_body40432AE50263 "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 3627CF1A035C set_head40432AE50263 "isRoot"
	public void setRoot(boolean value1)
	// -end- 3627CF1A035C set_head40432AE50263 "isRoot"
	{
		// -beg- preserve=no 3627CF1A035C set_body40432AE50263 "isRoot"
		if (isRoot != value1) {
			isRoot = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRoot"));
		}
		// -end- 3627CF1A035C set_body40432AE50263 "isRoot"
	}

	// -beg- preserve=no 3627CF2301AE var40432AE50263 "isLeaf"
	private boolean isLeaf;
	// -end- 3627CF2301AE var40432AE50263 "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 3627CF2301AE get_head40432AE50263 "isLeaf"
	public boolean isLeaf()
	// -end- 3627CF2301AE get_head40432AE50263 "isLeaf"
	{
		// -beg- preserve=no 3627CF2301AE get_body40432AE50263 "isLeaf"
		return isLeaf;
		// -end- 3627CF2301AE get_body40432AE50263 "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 3627CF2301AE set_head40432AE50263 "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 3627CF2301AE set_head40432AE50263 "isLeaf"
	{
		// -beg- preserve=no 3627CF2301AE set_body40432AE50263 "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLeaf"));
		}
		// -end- 3627CF2301AE set_body40432AE50263 "isLeaf"
	}

	// -beg- preserve=no 3627CF2B030C var40432AE50263 "isAbstract"
	private boolean isAbstract;
	// -end- 3627CF2B030C var40432AE50263 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 3627CF2B030C get_head40432AE50263 "isAbstract"
	public boolean isAbstract()
	// -end- 3627CF2B030C get_head40432AE50263 "isAbstract"
	{
		// -beg- preserve=no 3627CF2B030C get_body40432AE50263 "isAbstract"
		return isAbstract;
		// -end- 3627CF2B030C get_body40432AE50263 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 3627CF2B030C set_head40432AE50263 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 3627CF2B030C set_head40432AE50263 "isAbstract"
	{
		// -beg- preserve=no 3627CF2B030C set_body40432AE50263 "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 3627CF2B030C set_body40432AE50263 "isAbstract"
	}

	// -beg- preserve=no 33EC14D000FA var40432AE50263 "specification"
	private NlsString specification = null;
	// -end- 33EC14D000FA var40432AE50263 "specification"

	/**
	 * get current value of specification
	 * 
	 * @see #setSpecification
	 */
	// -beg- preserve=no 33EC14D000FA get_head40432AE50263 "specification"
	public NlsString getSpecification()
	// -end- 33EC14D000FA get_head40432AE50263 "specification"
	{
		// -beg- preserve=no 33EC14D000FA get_body40432AE50263 "specification"
		return specification;
		// -end- 33EC14D000FA get_body40432AE50263 "specification"
	}

	/**
	 * set current value of specification
	 * 
	 * @see #getSpecification
	 */
	// -beg- preserve=no 33EC14D000FA set_head40432AE50263 "specification"
	public void setSpecification(NlsString value1)
	// -end- 33EC14D000FA set_head40432AE50263 "specification"
	{
		// -beg- preserve=no 33EC14D000FA set_body40432AE50263 "specification"
		if (specification != value1 && (specification == null || !specification.equals(value1))) {
			specification = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSpecification"));
		}
		// -end- 33EC14D000FA set_body40432AE50263 "specification"
	}

	// -beg- preserve=no 33FFD98400B6 code40432AE50263 "raisedSignal"
	private java.util.Set raisedSignal = new java.util.HashSet();
	// -end- 33FFD98400B6 code40432AE50263 "raisedSignal"

	/**
	 * add a RaisedSignal.
	 *
	 * @see #removeRaisedSignal
	 * @see #containsRaisedSignal
	 * @see #iteratorRaisedSignal
	 * @see #clearRaisedSignal
	 * @see #sizeRaisedSignal
	 */
	// -beg- preserve=no 33FFD98400B6 add_head40432AE50263
	// "BehavioralFeature::addRaisedSignal"
	public void addRaisedSignal(Signal raisedSignal1)
	// -end- 33FFD98400B6 add_head40432AE50263
	// "BehavioralFeature::addRaisedSignal"
	{
		// -beg- preserve=no 33FFD98400B6 add_body40432AE50263
		// "BehavioralFeature::addRaisedSignal"
		raisedSignal.add(raisedSignal1);
		raisedSignal1._linkContext(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addRaisedSignal"));
		return;
		// -end- 33FFD98400B6 add_body40432AE50263
		// "BehavioralFeature::addRaisedSignal"
	}

	/**
	 * disconnect a RaisedSignal.
	 * 
	 * @see #addRaisedSignal
	 */
	// -beg- preserve=no 33FFD98400B6 remove_head40432AE50263
	// "BehavioralFeature::removeRaisedSignal"
	public Signal removeRaisedSignal(Signal raisedSignal1)
	// -end- 33FFD98400B6 remove_head40432AE50263
	// "BehavioralFeature::removeRaisedSignal"
	{
		// -beg- preserve=no 33FFD98400B6 remove_body40432AE50263
		// "BehavioralFeature::removeRaisedSignal"
		Signal ret = null;
		if (raisedSignal1 == null || !raisedSignal.contains(raisedSignal1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = raisedSignal1;
		raisedSignal.remove(raisedSignal1);
		raisedSignal1._unlinkContext(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeRaisedSignal"));
		return ret;
		// -end- 33FFD98400B6 remove_body40432AE50263
		// "BehavioralFeature::removeRaisedSignal"
	}

	/**
	 * tests if a given RaisedSignal is connected.
	 * 
	 * @see #addRaisedSignal
	 */
	// -beg- preserve=no 33FFD98400B6 test_head40432AE50263
	// "BehavioralFeature::containsRaisedSignal"
	public boolean containsRaisedSignal(Signal raisedSignal1)
	// -end- 33FFD98400B6 test_head40432AE50263
	// "BehavioralFeature::containsRaisedSignal"
	{
		// -beg- preserve=no 33FFD98400B6 test_body40432AE50263
		// "BehavioralFeature::containsRaisedSignal"
		return raisedSignal.contains(raisedSignal1);
		// -end- 33FFD98400B6 test_body40432AE50263
		// "BehavioralFeature::containsRaisedSignal"
	}

	/**
	 * used to enumerate all connected RaisedSignals.
	 * 
	 * @see #addRaisedSignal
	 */
	// -beg- preserve=no 33FFD98400B6 get_all_head40432AE50263
	// "BehavioralFeature::iteratorRaisedSignal"
	public java.util.Iterator iteratorRaisedSignal()
	// -end- 33FFD98400B6 get_all_head40432AE50263
	// "BehavioralFeature::iteratorRaisedSignal"
	{
		// -beg- preserve=no 33FFD98400B6 get_all_body40432AE50263
		// "BehavioralFeature::iteratorRaisedSignal"
		return raisedSignal.iterator();
		// -end- 33FFD98400B6 get_all_body40432AE50263
		// "BehavioralFeature::iteratorRaisedSignal"
	}

	/**
	 * disconnect all RaisedSignals.
	 * 
	 * @see #addRaisedSignal
	 */
	// -beg- preserve=no 33FFD98400B6 remove_all_head40432AE50263
	// "BehavioralFeature::clearRaisedSignal"
	public void clearRaisedSignal()
	// -end- 33FFD98400B6 remove_all_head40432AE50263
	// "BehavioralFeature::clearRaisedSignal"
	{
		// -beg- preserve=no 33FFD98400B6 remove_all_body40432AE50263
		// "BehavioralFeature::clearRaisedSignal"
		if (sizeRaisedSignal() > 0) {
			for (java.util.Iterator p = raisedSignal.iterator(); p.hasNext();) {
				((Signal) p.next())._unlinkContext(this);
			}
			raisedSignal.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearRaisedSignal"));
		}
		// -end- 33FFD98400B6 remove_all_body40432AE50263
		// "BehavioralFeature::clearRaisedSignal"
	}

	/**
	 * returns the number of RaisedSignals.
	 * 
	 * @see #addRaisedSignal
	 */
	// -beg- preserve=no 33FFD98400B6 size_head40432AE50263
	// "BehavioralFeature::sizeRaisedSignal"
	public int sizeRaisedSignal()
	// -end- 33FFD98400B6 size_head40432AE50263
	// "BehavioralFeature::sizeRaisedSignal"
	{
		// -beg- preserve=no 33FFD98400B6 size_body40432AE50263
		// "BehavioralFeature::sizeRaisedSignal"
		return raisedSignal.size();
		// -end- 33FFD98400B6 size_body40432AE50263
		// "BehavioralFeature::sizeRaisedSignal"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFD98400B6 _link_body40432AE50263
	// "BehavioralFeature::_linkRaisedSignal"
	public void _linkRaisedSignal(Signal raisedSignal1) {
		raisedSignal.add(raisedSignal1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkRaisedSignal"));
		return;
	}
	// -end- 33FFD98400B6 _link_body40432AE50263
	// "BehavioralFeature::_linkRaisedSignal"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFD98400B6 _unlink_body40432AE50263
	// "BehavioralFeature::_unlinkRaisedSignal"
	public void _unlinkRaisedSignal(Signal raisedSignal1) {
		raisedSignal.remove(raisedSignal1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkRaisedSignal"));
		return;
	}
	// -end- 33FFD98400B6 _unlink_body40432AE50263
	// "BehavioralFeature::_unlinkRaisedSignal"

	// -beg- preserve=no 33599464017C code40432AE50263 "parameter"
	private java.util.List parameter = new java.util.ArrayList();
	// -end- 33599464017C code40432AE50263 "parameter"

	/**
	 * add a Parameter.
	 *
	 * @see #removeParameter
	 * @see #containsParameter
	 * @see #iteratorParameter
	 * @see #clearParameter
	 * @see #sizeParameter
	 */
	// -beg- preserve=no 33599464017C add_head40432AE50263
	// "BehavioralFeature::addParameter"
	public void addParameter(Parameter parameter1)
	// -end- 33599464017C add_head40432AE50263 "BehavioralFeature::addParameter"
	{
		// -beg- preserve=no 33599464017C add_body40432AE50263
		// "BehavioralFeature::addParameter"
		parameter.add(parameter1);
		parameter1._linkBehavioralFeature(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addParameter"));
		return;
		// -end- 33599464017C add_body40432AE50263
		// "BehavioralFeature::addParameter"
	}

	// -beg- preserve=no 33599464017C add2_head40432AE50263
	// "BehavioralFeature::add2Parameter"
	public void addParameter(int index, Parameter parameter1)
	// -end- 33599464017C add2_head40432AE50263
	// "BehavioralFeature::add2Parameter"
	{
		// -beg- preserve=no 33599464017C add2_body40432AE50263
		// "BehavioralFeature::add2Parameter"
		parameter.add(index, parameter1);
		parameter1._linkBehavioralFeature(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addParameter"));
		return;
		// -end- 33599464017C add2_body40432AE50263
		// "BehavioralFeature::add2Parameter"
	}

	/**
	 * disconnect a Parameter.
	 * 
	 * @see #addParameter
	 */
	// -beg- preserve=no 33599464017C remove_head40432AE50263
	// "BehavioralFeature::removeParameter"
	public Parameter removeParameter(Parameter parameter1)
	// -end- 33599464017C remove_head40432AE50263
	// "BehavioralFeature::removeParameter"
	{
		// -beg- preserve=no 33599464017C remove_body40432AE50263
		// "BehavioralFeature::removeParameter"
		Parameter ret = null;
		if (parameter1 == null || !parameter.contains(parameter1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = parameter1;
		parameter.remove(parameter1);
		parameter1._unlinkBehavioralFeature(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeParameter"));
		return ret;
		// -end- 33599464017C remove_body40432AE50263
		// "BehavioralFeature::removeParameter"
	}

	/**
	 * disconnect a Parameter.
	 * 
	 * @see #addParameter
	 */
	// -beg- preserve=no 33599464017C remove2_head40432AE50263
	// "BehavioralFeature::remove2Parameter"
	public Parameter removeParameter(int index)
	// -end- 33599464017C remove2_head40432AE50263
	// "BehavioralFeature::remove2Parameter"
	{
		// -beg- preserve=no 33599464017C remove2_body40432AE50263
		// "BehavioralFeature::remove2Parameter"
		Parameter ret = null;
		ret = (Parameter) parameter.remove(index);
		ret._unlinkBehavioralFeature(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeParameter"));
		return ret;
		// -end- 33599464017C remove2_body40432AE50263
		// "BehavioralFeature::remove2Parameter"
	}

	/**
	 * change a Parameter.
	 * 
	 * @see #addParameter
	 */
	// -beg- preserve=no 33599464017C set_head40432AE50263
	// "BehavioralFeature::setParameter"
	public Parameter setParameter(int index, Parameter parameter1)
	// -end- 33599464017C set_head40432AE50263 "BehavioralFeature::setParameter"
	{
		// -beg- preserve=no 33599464017C set_body40432AE50263
		// "BehavioralFeature::setParameter"
		Parameter ret = null;
		ret = (Parameter) parameter.set(index, parameter1);
		ret._unlinkBehavioralFeature(this);
		parameter1._linkBehavioralFeature(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setParameter"));
		return ret;
		// -end- 33599464017C set_body40432AE50263
		// "BehavioralFeature::setParameter"
	}

	/**
	 * tests if a given Parameter is connected.
	 * 
	 * @see #addParameter
	 */
	// -beg- preserve=no 33599464017C test_head40432AE50263
	// "BehavioralFeature::containsParameter"
	public boolean containsParameter(Parameter parameter1)
	// -end- 33599464017C test_head40432AE50263
	// "BehavioralFeature::containsParameter"
	{
		// -beg- preserve=no 33599464017C test_body40432AE50263
		// "BehavioralFeature::containsParameter"
		return parameter.contains(parameter1);
		// -end- 33599464017C test_body40432AE50263
		// "BehavioralFeature::containsParameter"
	}

	/**
	 * used to enumerate all connected Parameters.
	 * 
	 * @see #addParameter
	 */
	// -beg- preserve=no 33599464017C get_all_head40432AE50263
	// "BehavioralFeature::iteratorParameter"
	public java.util.Iterator iteratorParameter()
	// -end- 33599464017C get_all_head40432AE50263
	// "BehavioralFeature::iteratorParameter"
	{
		// -beg- preserve=no 33599464017C get_all_body40432AE50263
		// "BehavioralFeature::iteratorParameter"
		return parameter.iterator();
		// -end- 33599464017C get_all_body40432AE50263
		// "BehavioralFeature::iteratorParameter"
	}

	/**
	 * disconnect all Parameters.
	 * 
	 * @see #addParameter
	 */
	// -beg- preserve=no 33599464017C remove_all_head40432AE50263
	// "BehavioralFeature::clearParameter"
	public void clearParameter()
	// -end- 33599464017C remove_all_head40432AE50263
	// "BehavioralFeature::clearParameter"
	{
		// -beg- preserve=no 33599464017C remove_all_body40432AE50263
		// "BehavioralFeature::clearParameter"
		if (sizeParameter() > 0) {
			for (java.util.Iterator p = parameter.iterator(); p.hasNext();) {
				((Parameter) p.next())._unlinkBehavioralFeature(this);
			}
			parameter.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearParameter"));
		}
		// -end- 33599464017C remove_all_body40432AE50263
		// "BehavioralFeature::clearParameter"
	}

	/**
	 * returns the number of Parameters.
	 * 
	 * @see #addParameter
	 */
	// -beg- preserve=no 33599464017C size_head40432AE50263
	// "BehavioralFeature::sizeParameter"
	public int sizeParameter()
	// -end- 33599464017C size_head40432AE50263
	// "BehavioralFeature::sizeParameter"
	{
		// -beg- preserve=no 33599464017C size_body40432AE50263
		// "BehavioralFeature::sizeParameter"
		return parameter.size();
		// -end- 33599464017C size_body40432AE50263
		// "BehavioralFeature::sizeParameter"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33599464017C _link_body40432AE50263
	// "BehavioralFeature::_linkParameter"
	public void _linkParameter(Parameter parameter1) {
		parameter.add(parameter1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkParameter"));
		return;
	}
	// -end- 33599464017C _link_body40432AE50263
	// "BehavioralFeature::_linkParameter"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33599464017C _unlink_body40432AE50263
	// "BehavioralFeature::_unlinkParameter"
	public void _unlinkParameter(Parameter parameter1) {
		parameter.remove(parameter1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkParameter"));
		return;
	}
	// -end- 33599464017C _unlink_body40432AE50263
	// "BehavioralFeature::_unlinkParameter"

	// -beg- preserve=no 335A34A3012C var40432AE50263 "isQuery"
	private boolean isQuery;
	// -end- 335A34A3012C var40432AE50263 "isQuery"

	/**
	 * get current value of isQuery
	 * 
	 * @see #setQuery
	 */
	// -beg- preserve=no 335A34A3012C get_head40432AE50263 "isQuery"
	public boolean isQuery()
	// -end- 335A34A3012C get_head40432AE50263 "isQuery"
	{
		// -beg- preserve=no 335A34A3012C get_body40432AE50263 "isQuery"
		return isQuery;
		// -end- 335A34A3012C get_body40432AE50263 "isQuery"
	}

	/**
	 * set current value of isQuery
	 * 
	 * @see #isQuery
	 */
	// -beg- preserve=no 335A34A3012C set_head40432AE50263 "isQuery"
	public void setQuery(boolean value1)
	// -end- 335A34A3012C set_head40432AE50263 "isQuery"
	{
		// -beg- preserve=no 335A34A3012C set_body40432AE50263 "isQuery"
		if (isQuery != value1) {
			isQuery = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setQuery"));
		}
		// -end- 335A34A3012C set_body40432AE50263 "isQuery"
	}

	// -beg- preserve=no 36008FB700E7 code40432AE50263 "classifierRole"

	// -end- 36008FB700E7 code40432AE50263 "classifierRole"

	/**
	 * add a ClassifierRole.
	 *
	 * @see #removeClassifierRole
	 * @see #containsClassifierRole
	 * @see #iteratorClassifierRole
	 * @see #clearClassifierRole
	 * @see #sizeClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 add_head40432AE50263
	// "ModelElement::addClassifierRole"
	public void addClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 add_head40432AE50263 "ModelElement::addClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 add_body40432AE50263
		// "ModelElement::addClassifierRole"
		super.addClassifierRole(classifierRole1);
		// -end- 36008FB700E7 add_body40432AE50263
		// "ModelElement::addClassifierRole"
	}

	/**
	 * disconnect a ClassifierRole.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_head40432AE50263
	// "ModelElement::removeClassifierRole"
	public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 remove_head40432AE50263
	// "ModelElement::removeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_body40432AE50263
		// "ModelElement::removeClassifierRole"
		return super.removeClassifierRole(classifierRole1);
		// -end- 36008FB700E7 remove_body40432AE50263
		// "ModelElement::removeClassifierRole"
	}

	/**
	 * tests if a given ClassifierRole is connected.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 test_head40432AE50263
	// "ModelElement::containsClassifierRole"
	public boolean containsClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 test_head40432AE50263
	// "ModelElement::containsClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 test_body40432AE50263
		// "ModelElement::containsClassifierRole"
		return super.containsClassifierRole(classifierRole1);
		// -end- 36008FB700E7 test_body40432AE50263
		// "ModelElement::containsClassifierRole"
	}

	/**
	 * used to enumerate all connected ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 get_all_head40432AE50263
	// "ModelElement::iteratorClassifierRole"
	public java.util.Iterator iteratorClassifierRole()
	// -end- 36008FB700E7 get_all_head40432AE50263
	// "ModelElement::iteratorClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 get_all_body40432AE50263
		// "ModelElement::iteratorClassifierRole"
		return super.iteratorClassifierRole();
		// -end- 36008FB700E7 get_all_body40432AE50263
		// "ModelElement::iteratorClassifierRole"
	}

	/**
	 * disconnect all ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_all_head40432AE50263
	// "ModelElement::clearClassifierRole"
	public void clearClassifierRole()
	// -end- 36008FB700E7 remove_all_head40432AE50263
	// "ModelElement::clearClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_all_body40432AE50263
		// "ModelElement::clearClassifierRole"
		super.clearClassifierRole();
		// -end- 36008FB700E7 remove_all_body40432AE50263
		// "ModelElement::clearClassifierRole"
	}

	/**
	 * returns the number of ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 size_head40432AE50263
	// "ModelElement::sizeClassifierRole"
	public int sizeClassifierRole()
	// -end- 36008FB700E7 size_head40432AE50263
	// "ModelElement::sizeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 size_body40432AE50263
		// "ModelElement::sizeClassifierRole"
		return super.sizeClassifierRole();
		// -end- 36008FB700E7 size_body40432AE50263
		// "ModelElement::sizeClassifierRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _link_body40432AE50263
	// "ModelElement::_linkClassifierRole"
	public void _linkClassifierRole(ClassifierRole classifierRole1) {
		super._linkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _link_body40432AE50263
	// "ModelElement::_linkClassifierRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _unlink_body40432AE50263
	// "ModelElement::_unlinkClassifierRole"
	public void _unlinkClassifierRole(ClassifierRole classifierRole1) {
		super._unlinkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _unlink_body40432AE50263
	// "ModelElement::_unlinkClassifierRole"

	// -beg- preserve=no 32B5D7EF03DD code40432AE50263 "owner"
	private Classifier owner;
	// -end- 32B5D7EF03DD code40432AE50263 "owner"

	/**
	 * attaches a Owner.
	 *
	 * @see #detachOwner
	 * @see #getOwner
	 * @see #containsOwner
	 */
	// -beg- preserve=no 32B5D7EF03DD attach_head40432AE50263
	// "Feature::attachOwner"
	public void attachOwner(Classifier owner1)
	// -end- 32B5D7EF03DD attach_head40432AE50263 "Feature::attachOwner"
	{
		// -beg- preserve=no 32B5D7EF03DD attach_body40432AE50263
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
		// -end- 32B5D7EF03DD attach_body40432AE50263 "Feature::attachOwner"
	}

	/**
	 * disconnect the currently attached Owner.
	 * 
	 * @see #attachOwner
	 */
	// -beg- preserve=no 32B5D7EF03DD detach_head40432AE50263
	// "Feature::detachOwner"
	public Classifier detachOwner()
	// -end- 32B5D7EF03DD detach_head40432AE50263 "Feature::detachOwner"
	{
		// -beg- preserve=no 32B5D7EF03DD detach_body40432AE50263
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
		// -end- 32B5D7EF03DD detach_body40432AE50263 "Feature::detachOwner"
	}

	/**
	 * get the currently attached Owner.
	 * 
	 * @see #attachOwner
	 */
	// -beg- preserve=no 32B5D7EF03DD get_head40432AE50263 "Feature::getOwner"
	public Classifier getOwner()
	// -end- 32B5D7EF03DD get_head40432AE50263 "Feature::getOwner"
	{
		// -beg- preserve=no 32B5D7EF03DD get_body40432AE50263
		// "Feature::getOwner"
		if (owner == null) {
			throw new java.lang.IllegalStateException("no owner attached");
		}
		return owner;
		// -end- 32B5D7EF03DD get_body40432AE50263 "Feature::getOwner"
	}

	/**
	 * tests if there is a Owner attached.
	 * 
	 * @see #attachOwner
	 */
	// -beg- preserve=no 32B5D7EF03DD test_head40432AE50263
	// "Feature::containsOwner"
	public boolean containsOwner()
	// -end- 32B5D7EF03DD test_head40432AE50263 "Feature::containsOwner"
	{
		// -beg- preserve=no 32B5D7EF03DD test_body40432AE50263
		// "Feature::containsOwner"
		return owner != null;
		// -end- 32B5D7EF03DD test_body40432AE50263 "Feature::containsOwner"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03DD _link_body40432AE50263
	// "Feature::_linkOwner"
	public void _linkOwner(Classifier owner1) {
		owner = owner1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkOwner"));
		return;
	}
	// -end- 32B5D7EF03DD _link_body40432AE50263 "Feature::_linkOwner"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03DD _unlink_body40432AE50263
	// "Feature::_unlinkOwner"
	public void _unlinkOwner(Classifier owner1) {
		owner = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkOwner"));
		return;
	}
	// -end- 32B5D7EF03DD _unlink_body40432AE50263 "Feature::_unlinkOwner"

	// -beg- preserve=no 31653E23032A var40432AE50263 "ownerScope"
	private int ownerScope;
	// -end- 31653E23032A var40432AE50263 "ownerScope"

	/**
	 * get current value of ownerScope
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
	 * @see #setOwnerScope
	 */
	// -beg- preserve=no 31653E23032A get_head40432AE50263 "ownerScope"
	public int getOwnerScope()
	// -end- 31653E23032A get_head40432AE50263 "ownerScope"
	{
		// -beg- preserve=no 31653E23032A get_body40432AE50263 "ownerScope"
		return ownerScope;
		// -end- 31653E23032A get_body40432AE50263 "ownerScope"
	}

	/**
	 * set current value of ownerScope
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
	 * @see #getOwnerScope
	 */
	// -beg- preserve=no 31653E23032A set_head40432AE50263 "ownerScope"
	public void setOwnerScope(int value1)
	// -end- 31653E23032A set_head40432AE50263 "ownerScope"
	{
		// -beg- preserve=no 31653E23032A set_body40432AE50263 "ownerScope"
		if (ownerScope != value1) {
			ownerScope = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setOwnerScope"));
		}
		// -end- 31653E23032A set_body40432AE50263 "ownerScope"
	}

	// -beg- preserve=no 33D1265902DA var40432AE50263 "visibility"
	private int visibility;
	// -end- 33D1265902DA var40432AE50263 "visibility"

	/**
	 * get current value of visibility
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
	 * @see #setVisibility
	 */
	// -beg- preserve=no 33D1265902DA get_head40432AE50263 "visibility"
	public int getVisibility()
	// -end- 33D1265902DA get_head40432AE50263 "visibility"
	{
		// -beg- preserve=no 33D1265902DA get_body40432AE50263 "visibility"
		return visibility;
		// -end- 33D1265902DA get_body40432AE50263 "visibility"
	}

	/**
	 * set current value of visibility
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
	 * @see #getVisibility
	 */
	// -beg- preserve=no 33D1265902DA set_head40432AE50263 "visibility"
	public void setVisibility(int value1)
	// -end- 33D1265902DA set_head40432AE50263 "visibility"
	{
		// -beg- preserve=no 33D1265902DA set_body40432AE50263 "visibility"
		if (visibility != value1) {
			visibility = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setVisibility"));
		}
		// -end- 33D1265902DA set_body40432AE50263 "visibility"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMettaAttrb(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 40432AE50263 detail_end "UmlOperation"

	// -end- 40432AE50263 detail_end "UmlOperation"

}
