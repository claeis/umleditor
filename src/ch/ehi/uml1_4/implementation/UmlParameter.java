// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-05 11:09:29 $
// $Revision: 1.2 $
//

// -beg- preserve=no 40432B0300AE package "UmlParameter"
package ch.ehi.uml1_4.implementation;
// -end- 40432B0300AE package "UmlParameter"

// -beg- preserve=no 40432B0300AE autoimport "UmlParameter"
import ch.ehi.uml1_4.foundation.core.Parameter;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.foundation.core.BehavioralFeature;
import ch.ehi.uml1_4.foundation.datatypes.Expression;
import ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind;
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
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.basics.types.NlsString;
// -end- 40432B0300AE autoimport "UmlParameter"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 40432B0300AE import "UmlParameter"

// -end- 40432B0300AE import "UmlParameter"

/** @author Claude Eisenhut
 *  @version $Revision: 1.2 $ $Date: 2004-03-05 11:09:29 $
 */
public class UmlParameter extends AbstractModelElement implements Parameter
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 40432B0300AE detail_begin "UmlParameter"

// -end- 40432B0300AE detail_begin "UmlParameter"

// -beg- preserve=no 40432E440097 head40432B0300AE "unlinkAll"
public void unlinkAll()
// -end- 40432E440097 head40432B0300AE "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 40432E440097 throws40432B0300AE "unlinkAll"

// -end- 40432E440097 throws40432B0300AE "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 40432E440097 body40432B0300AE "unlinkAll"

        detachEvent();
        clearObjectFlowState();
        clearState();
        detachBehavioralFeature();
        // Role Type: Classifier object(s) may point to this
        setDefaultValue(null);
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
        // Role ParameterDefinition: TemplateParameter object(s) may point to this
        clearStereotype();
        clearReferenceTag();
        clearImportedBy();
        // Role EditorTreeElement: EditorTreeElement object(s) may point to this
        setName(null);
        setMetaAttrb(null);
        setDocumentation(null);
        super.unlinkAll();
        // -end- 40432E440097 body40432B0300AE "unlinkAll"
}

// -beg- preserve=no 40432E4701E6 head40432B0300AE "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 40432E4701E6 head40432B0300AE "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 40432E4701E6 throws40432B0300AE "enumerateChildren"

// -end- 40432E4701E6 throws40432B0300AE "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 40432E4701E6 body40432B0300AE "enumerateChildren"
        java.util.Iterator it=null;
        visitor.visit(getDefaultValue());
        it=iteratorBehavior(); while(it.hasNext()) visitor.visit(it.next());
        it=iteratorTaggedValue(); while(it.hasNext()) visitor.visit(it.next());
        it=iteratorTemplateParameter(); while(it.hasNext()) visitor.visit(it.next());
        visitor.visit(getName());
        visitor.visit(getMetaAttrb());
        visitor.visit(getDocumentation());
        super.enumerateChildren(visitor);
        // -end- 40432E4701E6 body40432B0300AE "enumerateChildren"
}

// -beg- preserve=no 3337AF9D028B code40432B0300AE "event"
private Event event;
// -end- 3337AF9D028B code40432B0300AE "event"

/** attaches a Event.
 *
 *  @see #detachEvent
 *  @see #getEvent
 *  @see #containsEvent
 */
// -beg- preserve=no 3337AF9D028B attach_head40432B0300AE "Parameter::attachEvent"
public void attachEvent(Event event1)
// -end- 3337AF9D028B attach_head40432B0300AE "Parameter::attachEvent"
{
        // -beg- preserve=no 3337AF9D028B attach_body40432B0300AE "Parameter::attachEvent"
        if(event!=null) {throw new java.lang.IllegalStateException("already a event attached");}
        if(event1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as event");}
        event = event1;
        event1._linkParameter(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachEvent"));
        return;
        // -end- 3337AF9D028B attach_body40432B0300AE "Parameter::attachEvent"
}

/** disconnect the currently attached Event.
 *  @see #attachEvent
 */
// -beg- preserve=no 3337AF9D028B detach_head40432B0300AE "Parameter::detachEvent"
public Event detachEvent()
// -end- 3337AF9D028B detach_head40432B0300AE "Parameter::detachEvent"
{
        // -beg- preserve=no 3337AF9D028B detach_body40432B0300AE "Parameter::detachEvent"
        Event ret = null;
        if(event!=null) {
                event._unlinkParameter(this);
                ret = event;
                event = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachEvent"));
        return ret;
        // -end- 3337AF9D028B detach_body40432B0300AE "Parameter::detachEvent"
}

/** get the currently attached Event.
 *  @see #attachEvent
 */
// -beg- preserve=no 3337AF9D028B get_head40432B0300AE "Parameter::getEvent"
public Event getEvent()
// -end- 3337AF9D028B get_head40432B0300AE "Parameter::getEvent"
{
        // -beg- preserve=no 3337AF9D028B get_body40432B0300AE "Parameter::getEvent"
        if(event==null) {throw new java.lang.IllegalStateException("no event attached");}
        return event;
        // -end- 3337AF9D028B get_body40432B0300AE "Parameter::getEvent"
}

/** tests if there is a Event attached.
 *  @see #attachEvent
 */
// -beg- preserve=no 3337AF9D028B test_head40432B0300AE "Parameter::containsEvent"
public boolean containsEvent()
// -end- 3337AF9D028B test_head40432B0300AE "Parameter::containsEvent"
{
        // -beg- preserve=no 3337AF9D028B test_body40432B0300AE "Parameter::containsEvent"
        return event!=null;
        // -end- 3337AF9D028B test_body40432B0300AE "Parameter::containsEvent"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3337AF9D028B _link_body40432B0300AE "Parameter::_linkEvent"
public void _linkEvent(Event event1)
{
        event = event1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkEvent"));
        return;
}
// -end- 3337AF9D028B _link_body40432B0300AE "Parameter::_linkEvent"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3337AF9D028B _unlink_body40432B0300AE "Parameter::_unlinkEvent"
public void _unlinkEvent(Event event1)
{
        event = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkEvent"));
        return;
}
// -end- 3337AF9D028B _unlink_body40432B0300AE "Parameter::_unlinkEvent"

// -beg- preserve=no 337D935E0213 code40432B0300AE "objectFlowState"
private java.util.Set objectFlowState = new java.util.HashSet();
// -end- 337D935E0213 code40432B0300AE "objectFlowState"

/** add a ObjectFlowState.
 *
 *  @see #removeObjectFlowState
 *  @see #containsObjectFlowState
 *  @see #iteratorObjectFlowState
 *  @see #clearObjectFlowState
 *  @see #sizeObjectFlowState
 */
// -beg- preserve=no 337D935E0213 add_head40432B0300AE "Parameter::addObjectFlowState"
public void addObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 337D935E0213 add_head40432B0300AE "Parameter::addObjectFlowState"
{
        // -beg- preserve=no 337D935E0213 add_body40432B0300AE "Parameter::addObjectFlowState"
        objectFlowState.add(objectFlowState1);
        objectFlowState1._linkAvailable(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addObjectFlowState"));
        return;
        // -end- 337D935E0213 add_body40432B0300AE "Parameter::addObjectFlowState"
}

/** disconnect a ObjectFlowState.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 remove_head40432B0300AE "Parameter::removeObjectFlowState"
public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 337D935E0213 remove_head40432B0300AE "Parameter::removeObjectFlowState"
{
        // -beg- preserve=no 337D935E0213 remove_body40432B0300AE "Parameter::removeObjectFlowState"
        ObjectFlowState ret=null;
        if(objectFlowState1==null || !objectFlowState.contains(objectFlowState1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = objectFlowState1;
        objectFlowState.remove(objectFlowState1);
        objectFlowState1._unlinkAvailable(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeObjectFlowState"));
        return ret;
        // -end- 337D935E0213 remove_body40432B0300AE "Parameter::removeObjectFlowState"
}

/** tests if a given ObjectFlowState is connected.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 test_head40432B0300AE "Parameter::containsObjectFlowState"
public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 337D935E0213 test_head40432B0300AE "Parameter::containsObjectFlowState"
{
        // -beg- preserve=no 337D935E0213 test_body40432B0300AE "Parameter::containsObjectFlowState"
        return objectFlowState.contains(objectFlowState1);
        // -end- 337D935E0213 test_body40432B0300AE "Parameter::containsObjectFlowState"
}

/** used to enumerate all connected ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 get_all_head40432B0300AE "Parameter::iteratorObjectFlowState"
public java.util.Iterator iteratorObjectFlowState()
// -end- 337D935E0213 get_all_head40432B0300AE "Parameter::iteratorObjectFlowState"
{
        // -beg- preserve=no 337D935E0213 get_all_body40432B0300AE "Parameter::iteratorObjectFlowState"
        return objectFlowState.iterator();
        // -end- 337D935E0213 get_all_body40432B0300AE "Parameter::iteratorObjectFlowState"
}

/** disconnect all ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 remove_all_head40432B0300AE "Parameter::clearObjectFlowState"
public void clearObjectFlowState()
// -end- 337D935E0213 remove_all_head40432B0300AE "Parameter::clearObjectFlowState"
{
        // -beg- preserve=no 337D935E0213 remove_all_body40432B0300AE "Parameter::clearObjectFlowState"
        if(sizeObjectFlowState()>0) {
                for(java.util.Iterator p = objectFlowState.iterator(); p.hasNext(); ) {
                        ((ObjectFlowState)p.next())._unlinkAvailable(this);
                }
                objectFlowState.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearObjectFlowState"));
        }
        // -end- 337D935E0213 remove_all_body40432B0300AE "Parameter::clearObjectFlowState"
}

/** returns the number of ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 size_head40432B0300AE "Parameter::sizeObjectFlowState"
public int sizeObjectFlowState()
// -end- 337D935E0213 size_head40432B0300AE "Parameter::sizeObjectFlowState"
{
        // -beg- preserve=no 337D935E0213 size_body40432B0300AE "Parameter::sizeObjectFlowState"
        return objectFlowState.size();
        // -end- 337D935E0213 size_body40432B0300AE "Parameter::sizeObjectFlowState"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 337D935E0213 _link_body40432B0300AE "Parameter::_linkObjectFlowState"
public void _linkObjectFlowState(ObjectFlowState objectFlowState1)
{
        objectFlowState.add(objectFlowState1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkObjectFlowState"));
        return;
}
// -end- 337D935E0213 _link_body40432B0300AE "Parameter::_linkObjectFlowState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 337D935E0213 _unlink_body40432B0300AE "Parameter::_unlinkObjectFlowState"
public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1)
{
        objectFlowState.remove(objectFlowState1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkObjectFlowState"));
        return;
}
// -end- 337D935E0213 _unlink_body40432B0300AE "Parameter::_unlinkObjectFlowState"

// -beg- preserve=no 36462DDF008C code40432B0300AE "state"
private java.util.Set state = new java.util.HashSet();
// -end- 36462DDF008C code40432B0300AE "state"

/** add a State.
 *
 *  @see #removeState
 *  @see #containsState
 *  @see #iteratorState
 *  @see #clearState
 *  @see #sizeState
 */
// -beg- preserve=no 36462DDF008C add_head40432B0300AE "Parameter::addState"
public void addState(ObjectFlowState state1)
// -end- 36462DDF008C add_head40432B0300AE "Parameter::addState"
{
        // -beg- preserve=no 36462DDF008C add_body40432B0300AE "Parameter::addState"
        state.add(state1);
        state1._linkParameter(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addState"));
        return;
        // -end- 36462DDF008C add_body40432B0300AE "Parameter::addState"
}

/** disconnect a State.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C remove_head40432B0300AE "Parameter::removeState"
public ObjectFlowState removeState(ObjectFlowState state1)
// -end- 36462DDF008C remove_head40432B0300AE "Parameter::removeState"
{
        // -beg- preserve=no 36462DDF008C remove_body40432B0300AE "Parameter::removeState"
        ObjectFlowState ret=null;
        if(state1==null || !state.contains(state1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = state1;
        state.remove(state1);
        state1._unlinkParameter(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeState"));
        return ret;
        // -end- 36462DDF008C remove_body40432B0300AE "Parameter::removeState"
}

/** tests if a given State is connected.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C test_head40432B0300AE "Parameter::containsState"
public boolean containsState(ObjectFlowState state1)
// -end- 36462DDF008C test_head40432B0300AE "Parameter::containsState"
{
        // -beg- preserve=no 36462DDF008C test_body40432B0300AE "Parameter::containsState"
        return state.contains(state1);
        // -end- 36462DDF008C test_body40432B0300AE "Parameter::containsState"
}

/** used to enumerate all connected States.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C get_all_head40432B0300AE "Parameter::iteratorState"
public java.util.Iterator iteratorState()
// -end- 36462DDF008C get_all_head40432B0300AE "Parameter::iteratorState"
{
        // -beg- preserve=no 36462DDF008C get_all_body40432B0300AE "Parameter::iteratorState"
        return state.iterator();
        // -end- 36462DDF008C get_all_body40432B0300AE "Parameter::iteratorState"
}

/** disconnect all States.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C remove_all_head40432B0300AE "Parameter::clearState"
public void clearState()
// -end- 36462DDF008C remove_all_head40432B0300AE "Parameter::clearState"
{
        // -beg- preserve=no 36462DDF008C remove_all_body40432B0300AE "Parameter::clearState"
        if(sizeState()>0) {
                for(java.util.Iterator p = state.iterator(); p.hasNext(); ) {
                        ((ObjectFlowState)p.next())._unlinkParameter(this);
                }
                state.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearState"));
        }
        // -end- 36462DDF008C remove_all_body40432B0300AE "Parameter::clearState"
}

/** returns the number of States.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C size_head40432B0300AE "Parameter::sizeState"
public int sizeState()
// -end- 36462DDF008C size_head40432B0300AE "Parameter::sizeState"
{
        // -beg- preserve=no 36462DDF008C size_body40432B0300AE "Parameter::sizeState"
        return state.size();
        // -end- 36462DDF008C size_body40432B0300AE "Parameter::sizeState"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 36462DDF008C _link_body40432B0300AE "Parameter::_linkState"
public void _linkState(ObjectFlowState state1)
{
        state.add(state1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkState"));
        return;
}
// -end- 36462DDF008C _link_body40432B0300AE "Parameter::_linkState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36462DDF008C _unlink_body40432B0300AE "Parameter::_unlinkState"
public void _unlinkState(ObjectFlowState state1)
{
        state.remove(state1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkState"));
        return;
}
// -end- 36462DDF008C _unlink_body40432B0300AE "Parameter::_unlinkState"

// -beg- preserve=no 3359946401AE code40432B0300AE "behavioralFeature"
private BehavioralFeature behavioralFeature;
// -end- 3359946401AE code40432B0300AE "behavioralFeature"

/** attaches a BehavioralFeature.
 *
 *  @see #detachBehavioralFeature
 *  @see #getBehavioralFeature
 *  @see #containsBehavioralFeature
 */
// -beg- preserve=no 3359946401AE attach_head40432B0300AE "Parameter::attachBehavioralFeature"
public void attachBehavioralFeature(BehavioralFeature behavioralFeature1)
// -end- 3359946401AE attach_head40432B0300AE "Parameter::attachBehavioralFeature"
{
        // -beg- preserve=no 3359946401AE attach_body40432B0300AE "Parameter::attachBehavioralFeature"
        if(behavioralFeature!=null) {throw new java.lang.IllegalStateException("already a behavioralFeature attached");}
        if(behavioralFeature1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as behavioralFeature");}
        behavioralFeature = behavioralFeature1;
        behavioralFeature1._linkParameter(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachBehavioralFeature"));
        return;
        // -end- 3359946401AE attach_body40432B0300AE "Parameter::attachBehavioralFeature"
}

/** disconnect the currently attached BehavioralFeature.
 *  @see #attachBehavioralFeature
 */
// -beg- preserve=no 3359946401AE detach_head40432B0300AE "Parameter::detachBehavioralFeature"
public BehavioralFeature detachBehavioralFeature()
// -end- 3359946401AE detach_head40432B0300AE "Parameter::detachBehavioralFeature"
{
        // -beg- preserve=no 3359946401AE detach_body40432B0300AE "Parameter::detachBehavioralFeature"
        BehavioralFeature ret = null;
        if(behavioralFeature!=null) {
                behavioralFeature._unlinkParameter(this);
                ret = behavioralFeature;
                behavioralFeature = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachBehavioralFeature"));
        return ret;
        // -end- 3359946401AE detach_body40432B0300AE "Parameter::detachBehavioralFeature"
}

/** get the currently attached BehavioralFeature.
 *  @see #attachBehavioralFeature
 */
// -beg- preserve=no 3359946401AE get_head40432B0300AE "Parameter::getBehavioralFeature"
public BehavioralFeature getBehavioralFeature()
// -end- 3359946401AE get_head40432B0300AE "Parameter::getBehavioralFeature"
{
        // -beg- preserve=no 3359946401AE get_body40432B0300AE "Parameter::getBehavioralFeature"
        if(behavioralFeature==null) {throw new java.lang.IllegalStateException("no behavioralFeature attached");}
        return behavioralFeature;
        // -end- 3359946401AE get_body40432B0300AE "Parameter::getBehavioralFeature"
}

/** tests if there is a BehavioralFeature attached.
 *  @see #attachBehavioralFeature
 */
// -beg- preserve=no 3359946401AE test_head40432B0300AE "Parameter::containsBehavioralFeature"
public boolean containsBehavioralFeature()
// -end- 3359946401AE test_head40432B0300AE "Parameter::containsBehavioralFeature"
{
        // -beg- preserve=no 3359946401AE test_body40432B0300AE "Parameter::containsBehavioralFeature"
        return behavioralFeature!=null;
        // -end- 3359946401AE test_body40432B0300AE "Parameter::containsBehavioralFeature"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3359946401AE _link_body40432B0300AE "Parameter::_linkBehavioralFeature"
public void _linkBehavioralFeature(BehavioralFeature behavioralFeature1)
{
        behavioralFeature = behavioralFeature1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkBehavioralFeature"));
        return;
}
// -end- 3359946401AE _link_body40432B0300AE "Parameter::_linkBehavioralFeature"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3359946401AE _unlink_body40432B0300AE "Parameter::_unlinkBehavioralFeature"
public void _unlinkBehavioralFeature(BehavioralFeature behavioralFeature1)
{
        behavioralFeature = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkBehavioralFeature"));
        return;
}
// -end- 3359946401AE _unlink_body40432B0300AE "Parameter::_unlinkBehavioralFeature"

// -beg- preserve=no 327BE04D0096 var40432B0300AE "defaultValue"
private Expression defaultValue = null;
// -end- 327BE04D0096 var40432B0300AE "defaultValue"

/** get current value of defaultValue
 *  @see #setDefaultValue
 */
// -beg- preserve=no 327BE04D0096 get_head40432B0300AE "defaultValue"
public Expression getDefaultValue()
// -end- 327BE04D0096 get_head40432B0300AE "defaultValue"
{
        // -beg- preserve=no 327BE04D0096 get_body40432B0300AE "defaultValue"
        return defaultValue;
        // -end- 327BE04D0096 get_body40432B0300AE "defaultValue"
}

/** set current value of defaultValue
 *  @see #getDefaultValue
 */
// -beg- preserve=no 327BE04D0096 set_head40432B0300AE "defaultValue"
public void setDefaultValue(Expression value1)
// -end- 327BE04D0096 set_head40432B0300AE "defaultValue"
{
        // -beg- preserve=no 327BE04D0096 set_body40432B0300AE "defaultValue"
        if(defaultValue!=value1 && (defaultValue==null || !defaultValue.equals(value1))) {
                defaultValue = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDefaultValue"));
        }
        // -end- 327BE04D0096 set_body40432B0300AE "defaultValue"
}

// -beg- preserve=no 335BC753038E var40432B0300AE "kind"
private int kind;
// -end- 335BC753038E var40432B0300AE "kind"

/** get current value of kind
 *  Specifies what kind of a Parameter is required.
 *  @see ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind
 *  @see #setKind
 */
// -beg- preserve=no 335BC753038E get_head40432B0300AE "kind"
public int getKind()
// -end- 335BC753038E get_head40432B0300AE "kind"
{
        // -beg- preserve=no 335BC753038E get_body40432B0300AE "kind"
        return kind;
        // -end- 335BC753038E get_body40432B0300AE "kind"
}

/** set current value of kind
 *  @see ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind
 *  @see #getKind
 */
// -beg- preserve=no 335BC753038E set_head40432B0300AE "kind"
public void setKind(int value1)
// -end- 335BC753038E set_head40432B0300AE "kind"
{
        // -beg- preserve=no 335BC753038E set_body40432B0300AE "kind"
        if(kind != value1) {
                kind = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
        }
        // -end- 335BC753038E set_body40432B0300AE "kind"
}

public NlsString getMetaAttrb(){
        return super.getMetaAttrb();
}

public void setMetaAttrb(NlsString value) {
        super.setMettaAttrb(value);
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 40432B0300AE detail_end "UmlParameter"

// -end- 40432B0300AE detail_end "UmlParameter"

}
