// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-01 12:44:28 $
// $Revision: 1.1 $
//

// -beg- preserve=no 40432B0300AE package "UmlParameter"
package ch.ehi.uml1_4.implementation;
// -end- 40432B0300AE package "UmlParameter"

// -beg- preserve=no 40432B0300AE autoimport "UmlParameter"
import ch.ehi.uml1_4.foundation.core.Parameter;
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
 *  @version $Revision: 1.1 $ $Date: 2004-03-01 12:44:28 $
 */
public class UmlParameter implements Parameter
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
    setDocumentation(null);
    
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
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    visitor.visit(getDocumentation());
    
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
    if(event!=null){
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
    if(objectFlowState1==null || !objectFlowState.contains(objectFlowState1)){
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
    if(sizeObjectFlowState()>0){
      for(java.util.Iterator p = objectFlowState.iterator(); p.hasNext();){
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
    if(state1==null || !state.contains(state1)){
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
    if(sizeState()>0){
      for(java.util.Iterator p = state.iterator(); p.hasNext();){
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
    if(behavioralFeature!=null){
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
  public  Expression getDefaultValue()
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
  public  void setDefaultValue(Expression value1)
  // -end- 327BE04D0096 set_head40432B0300AE "defaultValue"
  {
    // -beg- preserve=no 327BE04D0096 set_body40432B0300AE "defaultValue"
    if(defaultValue!=value1 && (defaultValue==null || !defaultValue.equals(value1))){
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
  public  int getKind()
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
  public  void setKind(int value1)
  // -end- 335BC753038E set_head40432B0300AE "kind"
  {
    // -beg- preserve=no 335BC753038E set_body40432B0300AE "kind"
    if(kind != value1){
      kind = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
    }
    // -end- 335BC753038E set_body40432B0300AE "kind"
  }

  // -beg- preserve=no 3CE2221702C6 head40432B0300AE "getDefLangName"
  public String getDefLangName()
  // -end- 3CE2221702C6 head40432B0300AE "getDefLangName"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE2221702C6 throws40432B0300AE "getDefLangName"

    // -end- 3CE2221702C6 throws40432B0300AE "getDefLangName"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3CE2221702C6 body40432B0300AE "getDefLangName"
    return null;
    // -end- 3CE2221702C6 body40432B0300AE "getDefLangName"
    }

  // -beg- preserve=no 3CE222250149 head40432B0300AE "setDefLangName"
  public void setDefLangName(String name)
  // -end- 3CE222250149 head40432B0300AE "setDefLangName"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE222250149 throws40432B0300AE "setDefLangName"

    // -end- 3CE222250149 throws40432B0300AE "setDefLangName"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3CE222250149 body40432B0300AE "setDefLangName"
    return;
    // -end- 3CE222250149 body40432B0300AE "setDefLangName"
    }

  // -beg- preserve=no 33CF8BD500F1 code40432B0300AE "behavior"
  private java.util.Set behavior = new java.util.HashSet();
  // -end- 33CF8BD500F1 code40432B0300AE "behavior"

  /** add a Behavior.
   *  
   *  @see #removeBehavior
   *  @see #containsBehavior
   *  @see #iteratorBehavior
   *  @see #clearBehavior
   *  @see #sizeBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 add_head40432B0300AE "ModelElement::addBehavior"
  public void addBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 add_head40432B0300AE "ModelElement::addBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 add_body40432B0300AE "ModelElement::addBehavior"
    behavior.add(behavior1);
    behavior1._linkContext(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addBehavior"));
    return;
    // -end- 33CF8BD500F1 add_body40432B0300AE "ModelElement::addBehavior"
  }

  /** disconnect a Behavior.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 remove_head40432B0300AE "ModelElement::removeBehavior"
  public StateMachine removeBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 remove_head40432B0300AE "ModelElement::removeBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 remove_body40432B0300AE "ModelElement::removeBehavior"
    StateMachine ret=null;
    if(behavior1==null || !behavior.contains(behavior1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = behavior1;
    behavior.remove(behavior1);
    behavior1._unlinkContext(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeBehavior"));
    return ret;
    // -end- 33CF8BD500F1 remove_body40432B0300AE "ModelElement::removeBehavior"
  }

  /** tests if a given Behavior is connected.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 test_head40432B0300AE "ModelElement::containsBehavior"
  public boolean containsBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 test_head40432B0300AE "ModelElement::containsBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 test_body40432B0300AE "ModelElement::containsBehavior"
    return behavior.contains(behavior1);
    // -end- 33CF8BD500F1 test_body40432B0300AE "ModelElement::containsBehavior"
  }

  /** used to enumerate all connected Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 get_all_head40432B0300AE "ModelElement::iteratorBehavior"
  public java.util.Iterator iteratorBehavior()
  // -end- 33CF8BD500F1 get_all_head40432B0300AE "ModelElement::iteratorBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 get_all_body40432B0300AE "ModelElement::iteratorBehavior"
    return behavior.iterator();
    // -end- 33CF8BD500F1 get_all_body40432B0300AE "ModelElement::iteratorBehavior"
  }

  /** disconnect all Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 remove_all_head40432B0300AE "ModelElement::clearBehavior"
  public void clearBehavior()
  // -end- 33CF8BD500F1 remove_all_head40432B0300AE "ModelElement::clearBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 remove_all_body40432B0300AE "ModelElement::clearBehavior"
    if(sizeBehavior()>0){
      for(java.util.Iterator p = behavior.iterator(); p.hasNext();){
        ((StateMachine)p.next())._unlinkContext(this);
      }
      behavior.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearBehavior"));
    }
    // -end- 33CF8BD500F1 remove_all_body40432B0300AE "ModelElement::clearBehavior"
  }

  /** returns the number of Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 size_head40432B0300AE "ModelElement::sizeBehavior"
  public int sizeBehavior()
  // -end- 33CF8BD500F1 size_head40432B0300AE "ModelElement::sizeBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 size_body40432B0300AE "ModelElement::sizeBehavior"
    return behavior.size();
    // -end- 33CF8BD500F1 size_body40432B0300AE "ModelElement::sizeBehavior"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF8BD500F1 _link_body40432B0300AE "ModelElement::_linkBehavior"
  public void _linkBehavior(StateMachine behavior1)
  {
    behavior.add(behavior1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkBehavior"));
    return;
  }
  // -end- 33CF8BD500F1 _link_body40432B0300AE "ModelElement::_linkBehavior"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF8BD500F1 _unlink_body40432B0300AE "ModelElement::_unlinkBehavior"
  public void _unlinkBehavior(StateMachine behavior1)
  {
    behavior.remove(behavior1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkBehavior"));
    return;
  }
  // -end- 33CF8BD500F1 _unlink_body40432B0300AE "ModelElement::_unlinkBehavior"

  // -beg- preserve=no 33CF9A030140 code40432B0300AE "partition"
  private java.util.Set partition = new java.util.HashSet();
  // -end- 33CF9A030140 code40432B0300AE "partition"

  /** add a Partition.
   *  
   *  @see #removePartition
   *  @see #containsPartition
   *  @see #iteratorPartition
   *  @see #clearPartition
   *  @see #sizePartition
   */
  // -beg- preserve=no 33CF9A030140 add_head40432B0300AE "ModelElement::addPartition"
  public void addPartition(Partition partition1)
  // -end- 33CF9A030140 add_head40432B0300AE "ModelElement::addPartition"
  {
    // -beg- preserve=no 33CF9A030140 add_body40432B0300AE "ModelElement::addPartition"
    partition.add(partition1);
    partition1._linkContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPartition"));
    return;
    // -end- 33CF9A030140 add_body40432B0300AE "ModelElement::addPartition"
  }

  /** disconnect a Partition.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 remove_head40432B0300AE "ModelElement::removePartition"
  public Partition removePartition(Partition partition1)
  // -end- 33CF9A030140 remove_head40432B0300AE "ModelElement::removePartition"
  {
    // -beg- preserve=no 33CF9A030140 remove_body40432B0300AE "ModelElement::removePartition"
    Partition ret=null;
    if(partition1==null || !partition.contains(partition1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = partition1;
    partition.remove(partition1);
    partition1._unlinkContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePartition"));
    return ret;
    // -end- 33CF9A030140 remove_body40432B0300AE "ModelElement::removePartition"
  }

  /** tests if a given Partition is connected.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 test_head40432B0300AE "ModelElement::containsPartition"
  public boolean containsPartition(Partition partition1)
  // -end- 33CF9A030140 test_head40432B0300AE "ModelElement::containsPartition"
  {
    // -beg- preserve=no 33CF9A030140 test_body40432B0300AE "ModelElement::containsPartition"
    return partition.contains(partition1);
    // -end- 33CF9A030140 test_body40432B0300AE "ModelElement::containsPartition"
  }

  /** used to enumerate all connected Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 get_all_head40432B0300AE "ModelElement::iteratorPartition"
  public java.util.Iterator iteratorPartition()
  // -end- 33CF9A030140 get_all_head40432B0300AE "ModelElement::iteratorPartition"
  {
    // -beg- preserve=no 33CF9A030140 get_all_body40432B0300AE "ModelElement::iteratorPartition"
    return partition.iterator();
    // -end- 33CF9A030140 get_all_body40432B0300AE "ModelElement::iteratorPartition"
  }

  /** disconnect all Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 remove_all_head40432B0300AE "ModelElement::clearPartition"
  public void clearPartition()
  // -end- 33CF9A030140 remove_all_head40432B0300AE "ModelElement::clearPartition"
  {
    // -beg- preserve=no 33CF9A030140 remove_all_body40432B0300AE "ModelElement::clearPartition"
    if(sizePartition()>0){
      for(java.util.Iterator p = partition.iterator(); p.hasNext();){
        ((Partition)p.next())._unlinkContents(this);
      }
      partition.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPartition"));
    }
    // -end- 33CF9A030140 remove_all_body40432B0300AE "ModelElement::clearPartition"
  }

  /** returns the number of Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 size_head40432B0300AE "ModelElement::sizePartition"
  public int sizePartition()
  // -end- 33CF9A030140 size_head40432B0300AE "ModelElement::sizePartition"
  {
    // -beg- preserve=no 33CF9A030140 size_body40432B0300AE "ModelElement::sizePartition"
    return partition.size();
    // -end- 33CF9A030140 size_body40432B0300AE "ModelElement::sizePartition"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9A030140 _link_body40432B0300AE "ModelElement::_linkPartition"
  public void _linkPartition(Partition partition1)
  {
    partition.add(partition1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPartition"));
    return;
  }
  // -end- 33CF9A030140 _link_body40432B0300AE "ModelElement::_linkPartition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9A030140 _unlink_body40432B0300AE "ModelElement::_unlinkPartition"
  public void _unlinkPartition(Partition partition1)
  {
    partition.remove(partition1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPartition"));
    return;
  }
  // -end- 33CF9A030140 _unlink_body40432B0300AE "ModelElement::_unlinkPartition"

  // -beg- preserve=no 33D1394E029F code40432B0300AE "collaboration"
  private java.util.Set collaboration = new java.util.HashSet();
  // -end- 33D1394E029F code40432B0300AE "collaboration"

  /** add a Collaboration.
   *  
   *  @see #removeCollaboration
   *  @see #containsCollaboration
   *  @see #iteratorCollaboration
   *  @see #clearCollaboration
   *  @see #sizeCollaboration
   */
  // -beg- preserve=no 33D1394E029F add_head40432B0300AE "ModelElement::addCollaboration"
  public void addCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F add_head40432B0300AE "ModelElement::addCollaboration"
  {
    // -beg- preserve=no 33D1394E029F add_body40432B0300AE "ModelElement::addCollaboration"
    collaboration.add(collaboration1);
    collaboration1._linkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCollaboration"));
    return;
    // -end- 33D1394E029F add_body40432B0300AE "ModelElement::addCollaboration"
  }

  /** disconnect a Collaboration.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_head40432B0300AE "ModelElement::removeCollaboration"
  public Collaboration removeCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F remove_head40432B0300AE "ModelElement::removeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_body40432B0300AE "ModelElement::removeCollaboration"
    Collaboration ret=null;
    if(collaboration1==null || !collaboration.contains(collaboration1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = collaboration1;
    collaboration.remove(collaboration1);
    collaboration1._unlinkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCollaboration"));
    return ret;
    // -end- 33D1394E029F remove_body40432B0300AE "ModelElement::removeCollaboration"
  }

  /** tests if a given Collaboration is connected.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F test_head40432B0300AE "ModelElement::containsCollaboration"
  public boolean containsCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F test_head40432B0300AE "ModelElement::containsCollaboration"
  {
    // -beg- preserve=no 33D1394E029F test_body40432B0300AE "ModelElement::containsCollaboration"
    return collaboration.contains(collaboration1);
    // -end- 33D1394E029F test_body40432B0300AE "ModelElement::containsCollaboration"
  }

  /** used to enumerate all connected Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F get_all_head40432B0300AE "ModelElement::iteratorCollaboration"
  public java.util.Iterator iteratorCollaboration()
  // -end- 33D1394E029F get_all_head40432B0300AE "ModelElement::iteratorCollaboration"
  {
    // -beg- preserve=no 33D1394E029F get_all_body40432B0300AE "ModelElement::iteratorCollaboration"
    return collaboration.iterator();
    // -end- 33D1394E029F get_all_body40432B0300AE "ModelElement::iteratorCollaboration"
  }

  /** disconnect all Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_all_head40432B0300AE "ModelElement::clearCollaboration"
  public void clearCollaboration()
  // -end- 33D1394E029F remove_all_head40432B0300AE "ModelElement::clearCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_all_body40432B0300AE "ModelElement::clearCollaboration"
    if(sizeCollaboration()>0){
      for(java.util.Iterator p = collaboration.iterator(); p.hasNext();){
        ((Collaboration)p.next())._unlinkConstrainingElement(this);
      }
      collaboration.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCollaboration"));
    }
    // -end- 33D1394E029F remove_all_body40432B0300AE "ModelElement::clearCollaboration"
  }

  /** returns the number of Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F size_head40432B0300AE "ModelElement::sizeCollaboration"
  public int sizeCollaboration()
  // -end- 33D1394E029F size_head40432B0300AE "ModelElement::sizeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F size_body40432B0300AE "ModelElement::sizeCollaboration"
    return collaboration.size();
    // -end- 33D1394E029F size_body40432B0300AE "ModelElement::sizeCollaboration"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _link_body40432B0300AE "ModelElement::_linkCollaboration"
  public void _linkCollaboration(Collaboration collaboration1)
  {
    collaboration.add(collaboration1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCollaboration"));
    return;
  }
  // -end- 33D1394E029F _link_body40432B0300AE "ModelElement::_linkCollaboration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _unlink_body40432B0300AE "ModelElement::_unlinkCollaboration"
  public void _unlinkCollaboration(Collaboration collaboration1)
  {
    collaboration.remove(collaboration1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCollaboration"));
    return;
  }
  // -end- 33D1394E029F _unlink_body40432B0300AE "ModelElement::_unlinkCollaboration"

  // -beg- preserve=no 36008FB700E7 code40432B0300AE "classifierRole"
  private java.util.Set classifierRole = new java.util.HashSet();
  // -end- 36008FB700E7 code40432B0300AE "classifierRole"

  /** add a ClassifierRole.
   *  
   *  @see #removeClassifierRole
   *  @see #containsClassifierRole
   *  @see #iteratorClassifierRole
   *  @see #clearClassifierRole
   *  @see #sizeClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 add_head40432B0300AE "ModelElement::addClassifierRole"
  public void addClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 add_head40432B0300AE "ModelElement::addClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 add_body40432B0300AE "ModelElement::addClassifierRole"
    classifierRole.add(classifierRole1);
    classifierRole1._linkAvailableContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClassifierRole"));
    return;
    // -end- 36008FB700E7 add_body40432B0300AE "ModelElement::addClassifierRole"
  }

  /** disconnect a ClassifierRole.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_head40432B0300AE "ModelElement::removeClassifierRole"
  public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 remove_head40432B0300AE "ModelElement::removeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_body40432B0300AE "ModelElement::removeClassifierRole"
    ClassifierRole ret=null;
    if(classifierRole1==null || !classifierRole.contains(classifierRole1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = classifierRole1;
    classifierRole.remove(classifierRole1);
    classifierRole1._unlinkAvailableContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClassifierRole"));
    return ret;
    // -end- 36008FB700E7 remove_body40432B0300AE "ModelElement::removeClassifierRole"
  }

  /** tests if a given ClassifierRole is connected.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 test_head40432B0300AE "ModelElement::containsClassifierRole"
  public boolean containsClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 test_head40432B0300AE "ModelElement::containsClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 test_body40432B0300AE "ModelElement::containsClassifierRole"
    return classifierRole.contains(classifierRole1);
    // -end- 36008FB700E7 test_body40432B0300AE "ModelElement::containsClassifierRole"
  }

  /** used to enumerate all connected ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 get_all_head40432B0300AE "ModelElement::iteratorClassifierRole"
  public java.util.Iterator iteratorClassifierRole()
  // -end- 36008FB700E7 get_all_head40432B0300AE "ModelElement::iteratorClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 get_all_body40432B0300AE "ModelElement::iteratorClassifierRole"
    return classifierRole.iterator();
    // -end- 36008FB700E7 get_all_body40432B0300AE "ModelElement::iteratorClassifierRole"
  }

  /** disconnect all ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_all_head40432B0300AE "ModelElement::clearClassifierRole"
  public void clearClassifierRole()
  // -end- 36008FB700E7 remove_all_head40432B0300AE "ModelElement::clearClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_all_body40432B0300AE "ModelElement::clearClassifierRole"
    if(sizeClassifierRole()>0){
      for(java.util.Iterator p = classifierRole.iterator(); p.hasNext();){
        ((ClassifierRole)p.next())._unlinkAvailableContents(this);
      }
      classifierRole.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClassifierRole"));
    }
    // -end- 36008FB700E7 remove_all_body40432B0300AE "ModelElement::clearClassifierRole"
  }

  /** returns the number of ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 size_head40432B0300AE "ModelElement::sizeClassifierRole"
  public int sizeClassifierRole()
  // -end- 36008FB700E7 size_head40432B0300AE "ModelElement::sizeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 size_body40432B0300AE "ModelElement::sizeClassifierRole"
    return classifierRole.size();
    // -end- 36008FB700E7 size_body40432B0300AE "ModelElement::sizeClassifierRole"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _link_body40432B0300AE "ModelElement::_linkClassifierRole"
  public void _linkClassifierRole(ClassifierRole classifierRole1)
  {
    classifierRole.add(classifierRole1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassifierRole"));
    return;
  }
  // -end- 36008FB700E7 _link_body40432B0300AE "ModelElement::_linkClassifierRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _unlink_body40432B0300AE "ModelElement::_unlinkClassifierRole"
  public void _unlinkClassifierRole(ClassifierRole classifierRole1)
  {
    classifierRole.remove(classifierRole1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassifierRole"));
    return;
  }
  // -end- 36008FB700E7 _unlink_body40432B0300AE "ModelElement::_unlinkClassifierRole"

  // -beg- preserve=no 39E9065C0186 code40432B0300AE "collaborationInstanceSet"
  private java.util.Set collaborationInstanceSet = new java.util.HashSet();
  // -end- 39E9065C0186 code40432B0300AE "collaborationInstanceSet"

  /** add a CollaborationInstanceSet.
   *  
   *  @see #removeCollaborationInstanceSet
   *  @see #containsCollaborationInstanceSet
   *  @see #iteratorCollaborationInstanceSet
   *  @see #clearCollaborationInstanceSet
   *  @see #sizeCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 add_head40432B0300AE "ModelElement::addCollaborationInstanceSet"
  public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 add_head40432B0300AE "ModelElement::addCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 add_body40432B0300AE "ModelElement::addCollaborationInstanceSet"
    collaborationInstanceSet.add(collaborationInstanceSet1);
    collaborationInstanceSet1._linkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCollaborationInstanceSet"));
    return;
    // -end- 39E9065C0186 add_body40432B0300AE "ModelElement::addCollaborationInstanceSet"
  }

  /** disconnect a CollaborationInstanceSet.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_head40432B0300AE "ModelElement::removeCollaborationInstanceSet"
  public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 remove_head40432B0300AE "ModelElement::removeCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 remove_body40432B0300AE "ModelElement::removeCollaborationInstanceSet"
    CollaborationInstanceSet ret=null;
    if(collaborationInstanceSet1==null || !collaborationInstanceSet.contains(collaborationInstanceSet1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = collaborationInstanceSet1;
    collaborationInstanceSet.remove(collaborationInstanceSet1);
    collaborationInstanceSet1._unlinkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCollaborationInstanceSet"));
    return ret;
    // -end- 39E9065C0186 remove_body40432B0300AE "ModelElement::removeCollaborationInstanceSet"
  }

  /** tests if a given CollaborationInstanceSet is connected.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 test_head40432B0300AE "ModelElement::containsCollaborationInstanceSet"
  public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 test_head40432B0300AE "ModelElement::containsCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 test_body40432B0300AE "ModelElement::containsCollaborationInstanceSet"
    return collaborationInstanceSet.contains(collaborationInstanceSet1);
    // -end- 39E9065C0186 test_body40432B0300AE "ModelElement::containsCollaborationInstanceSet"
  }

  /** used to enumerate all connected CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 get_all_head40432B0300AE "ModelElement::iteratorCollaborationInstanceSet"
  public java.util.Iterator iteratorCollaborationInstanceSet()
  // -end- 39E9065C0186 get_all_head40432B0300AE "ModelElement::iteratorCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 get_all_body40432B0300AE "ModelElement::iteratorCollaborationInstanceSet"
    return collaborationInstanceSet.iterator();
    // -end- 39E9065C0186 get_all_body40432B0300AE "ModelElement::iteratorCollaborationInstanceSet"
  }

  /** disconnect all CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_all_head40432B0300AE "ModelElement::clearCollaborationInstanceSet"
  public void clearCollaborationInstanceSet()
  // -end- 39E9065C0186 remove_all_head40432B0300AE "ModelElement::clearCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 remove_all_body40432B0300AE "ModelElement::clearCollaborationInstanceSet"
    if(sizeCollaborationInstanceSet()>0){
      for(java.util.Iterator p = collaborationInstanceSet.iterator(); p.hasNext();){
        ((CollaborationInstanceSet)p.next())._unlinkConstrainingElement(this);
      }
      collaborationInstanceSet.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCollaborationInstanceSet"));
    }
    // -end- 39E9065C0186 remove_all_body40432B0300AE "ModelElement::clearCollaborationInstanceSet"
  }

  /** returns the number of CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 size_head40432B0300AE "ModelElement::sizeCollaborationInstanceSet"
  public int sizeCollaborationInstanceSet()
  // -end- 39E9065C0186 size_head40432B0300AE "ModelElement::sizeCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 size_body40432B0300AE "ModelElement::sizeCollaborationInstanceSet"
    return collaborationInstanceSet.size();
    // -end- 39E9065C0186 size_body40432B0300AE "ModelElement::sizeCollaborationInstanceSet"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _link_body40432B0300AE "ModelElement::_linkCollaborationInstanceSet"
  public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  {
    collaborationInstanceSet.add(collaborationInstanceSet1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCollaborationInstanceSet"));
    return;
  }
  // -end- 39E9065C0186 _link_body40432B0300AE "ModelElement::_linkCollaborationInstanceSet"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _unlink_body40432B0300AE "ModelElement::_unlinkCollaborationInstanceSet"
  public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  {
    collaborationInstanceSet.remove(collaborationInstanceSet1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCollaborationInstanceSet"));
    return;
  }
  // -end- 39E9065C0186 _unlink_body40432B0300AE "ModelElement::_unlinkCollaborationInstanceSet"

  // -beg- preserve=no 33598CAA030E code40432B0300AE "namespace"
  private ElementOwnership namespace;
  // -end- 33598CAA030E code40432B0300AE "namespace"

  /** attaches a Namespace.
   *  Designates the Namespace that contains the ModelElement.
   *  @see #detachNamespace
   *  @see #getNamespace
   *  @see #containsNamespace
   *  @see #getNamespaceLink
   *  @see #createNamespaceLink
   */
  // -beg- preserve=no 33598CAA030E attach_head40432B0300AE "ModelElement::attachNamespace"
  public void attachNamespace(Namespace namespace1)
  // -end- 33598CAA030E attach_head40432B0300AE "ModelElement::attachNamespace"
  {
    // -beg- preserve=no 33598CAA030E attach_body40432B0300AE "ModelElement::attachNamespace"
    if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
    if(namespace1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as namespace");}
    namespace = createNamespaceLink();
    namespace.setNamespace(namespace1);
    namespace.setOwnedElement(this);
    namespace1._linkOwnedElement(namespace);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespace"));
    return;
    // -end- 33598CAA030E attach_body40432B0300AE "ModelElement::attachNamespace"
  }

  /** attaches a link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E attachlink_head40432B0300AE "ModelElement::attachNamespaceLink"
  public void attachNamespaceLink(ElementOwnership namespace1)
  // -end- 33598CAA030E attachlink_head40432B0300AE "ModelElement::attachNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E attachlink_body40432B0300AE "ModelElement::attachNamespaceLink"
    if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
    namespace = namespace1;
    namespace.setOwnedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespaceLink"));
    return;
    // -end- 33598CAA030E attachlink_body40432B0300AE "ModelElement::attachNamespaceLink"
  }

  /** disconnect the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E detach_head40432B0300AE "ModelElement::detachNamespace"
  public Namespace detachNamespace()
  // -end- 33598CAA030E detach_head40432B0300AE "ModelElement::detachNamespace"
  {
    // -beg- preserve=no 33598CAA030E detach_body40432B0300AE "ModelElement::detachNamespace"
    Namespace ret = null;
    if(namespace!=null){
      ret = namespace.getNamespace();
      ret._unlinkOwnedElement(namespace);
      namespace = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachNamespace"));
    return ret;
    // -end- 33598CAA030E detach_body40432B0300AE "ModelElement::detachNamespace"
  }

  /** get the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E get_head40432B0300AE "ModelElement::getNamespace"
  public Namespace getNamespace()
  // -end- 33598CAA030E get_head40432B0300AE "ModelElement::getNamespace"
  {
    // -beg- preserve=no 33598CAA030E get_body40432B0300AE "ModelElement::getNamespace"
    if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
    return namespace.getNamespace();
    // -end- 33598CAA030E get_body40432B0300AE "ModelElement::getNamespace"
  }

  /** get the link class of currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E getlink_head40432B0300AE "ModelElement::getNamespaceLink"
  public ElementOwnership getNamespaceLink()
  // -end- 33598CAA030E getlink_head40432B0300AE "ModelElement::getNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E getlink_body40432B0300AE "ModelElement::getNamespaceLink"
    if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
    return namespace;
    // -end- 33598CAA030E getlink_body40432B0300AE "ModelElement::getNamespaceLink"
  }

  /** create a link class for a new link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E createlink_head40432B0300AE "ModelElement::createNamespaceLink"
  public ElementOwnership createNamespaceLink()
  // -end- 33598CAA030E createlink_head40432B0300AE "ModelElement::createNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E createlink_body40432B0300AE "ModelElement::createNamespaceLink"
    return new ElementOwnership();
    // -end- 33598CAA030E createlink_body40432B0300AE "ModelElement::createNamespaceLink"
  }

  /** tests if there is a Namespace attached.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E test_head40432B0300AE "ModelElement::containsNamespace"
  public boolean containsNamespace()
  // -end- 33598CAA030E test_head40432B0300AE "ModelElement::containsNamespace"
  {
    // -beg- preserve=no 33598CAA030E test_body40432B0300AE "ModelElement::containsNamespace"
    return namespace!=null;
    // -end- 33598CAA030E test_body40432B0300AE "ModelElement::containsNamespace"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _link_body40432B0300AE "ModelElement::_linkNamespace"
  public void _linkNamespace(ElementOwnership namespace1)
  {
    namespace = namespace1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkNamespace"));
    return;
  }
  // -end- 33598CAA030E _link_body40432B0300AE "ModelElement::_linkNamespace"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _unlink_body40432B0300AE "ModelElement::_unlinkNamespace"
  public void _unlinkNamespace(ElementOwnership namespace1)
  {
    namespace = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkNamespace"));
    return;
  }
  // -end- 33598CAA030E _unlink_body40432B0300AE "ModelElement::_unlinkNamespace"

  // -beg- preserve=no 33FFE57B0395 code40432B0300AE "clientDependency"
  private java.util.Set clientDependency = new java.util.HashSet();
  // -end- 33FFE57B0395 code40432B0300AE "clientDependency"

  /** add a ClientDependency.
   *  
   *  @see #removeClientDependency
   *  @see #containsClientDependency
   *  @see #iteratorClientDependency
   *  @see #clearClientDependency
   *  @see #sizeClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 add_head40432B0300AE "ModelElement::addClientDependency"
  public void addClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 add_head40432B0300AE "ModelElement::addClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 add_body40432B0300AE "ModelElement::addClientDependency"
    clientDependency.add(clientDependency1);
    clientDependency1._linkClient(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClientDependency"));
    return;
    // -end- 33FFE57B0395 add_body40432B0300AE "ModelElement::addClientDependency"
  }

  /** disconnect a ClientDependency.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 remove_head40432B0300AE "ModelElement::removeClientDependency"
  public Dependency removeClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 remove_head40432B0300AE "ModelElement::removeClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 remove_body40432B0300AE "ModelElement::removeClientDependency"
    Dependency ret=null;
    if(clientDependency1==null || !clientDependency.contains(clientDependency1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = clientDependency1;
    clientDependency.remove(clientDependency1);
    clientDependency1._unlinkClient(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClientDependency"));
    return ret;
    // -end- 33FFE57B0395 remove_body40432B0300AE "ModelElement::removeClientDependency"
  }

  /** tests if a given ClientDependency is connected.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 test_head40432B0300AE "ModelElement::containsClientDependency"
  public boolean containsClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 test_head40432B0300AE "ModelElement::containsClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 test_body40432B0300AE "ModelElement::containsClientDependency"
    return clientDependency.contains(clientDependency1);
    // -end- 33FFE57B0395 test_body40432B0300AE "ModelElement::containsClientDependency"
  }

  /** used to enumerate all connected ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 get_all_head40432B0300AE "ModelElement::iteratorClientDependency"
  public java.util.Iterator iteratorClientDependency()
  // -end- 33FFE57B0395 get_all_head40432B0300AE "ModelElement::iteratorClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 get_all_body40432B0300AE "ModelElement::iteratorClientDependency"
    return clientDependency.iterator();
    // -end- 33FFE57B0395 get_all_body40432B0300AE "ModelElement::iteratorClientDependency"
  }

  /** disconnect all ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 remove_all_head40432B0300AE "ModelElement::clearClientDependency"
  public void clearClientDependency()
  // -end- 33FFE57B0395 remove_all_head40432B0300AE "ModelElement::clearClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 remove_all_body40432B0300AE "ModelElement::clearClientDependency"
    if(sizeClientDependency()>0){
      for(java.util.Iterator p = clientDependency.iterator(); p.hasNext();){
        ((Dependency)p.next())._unlinkClient(this);
      }
      clientDependency.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClientDependency"));
    }
    // -end- 33FFE57B0395 remove_all_body40432B0300AE "ModelElement::clearClientDependency"
  }

  /** returns the number of ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 size_head40432B0300AE "ModelElement::sizeClientDependency"
  public int sizeClientDependency()
  // -end- 33FFE57B0395 size_head40432B0300AE "ModelElement::sizeClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 size_body40432B0300AE "ModelElement::sizeClientDependency"
    return clientDependency.size();
    // -end- 33FFE57B0395 size_body40432B0300AE "ModelElement::sizeClientDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFE57B0395 _link_body40432B0300AE "ModelElement::_linkClientDependency"
  public void _linkClientDependency(Dependency clientDependency1)
  {
    clientDependency.add(clientDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClientDependency"));
    return;
  }
  // -end- 33FFE57B0395 _link_body40432B0300AE "ModelElement::_linkClientDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFE57B0395 _unlink_body40432B0300AE "ModelElement::_unlinkClientDependency"
  public void _unlinkClientDependency(Dependency clientDependency1)
  {
    clientDependency.remove(clientDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClientDependency"));
    return;
  }
  // -end- 33FFE57B0395 _unlink_body40432B0300AE "ModelElement::_unlinkClientDependency"

  // -beg- preserve=no 33E901E003D4 code40432B0300AE "taggedValue"
  private java.util.Set taggedValue = new java.util.HashSet();
  // -end- 33E901E003D4 code40432B0300AE "taggedValue"

  /** add a TaggedValue.
   *  
   *  @see #removeTaggedValue
   *  @see #containsTaggedValue
   *  @see #iteratorTaggedValue
   *  @see #clearTaggedValue
   *  @see #sizeTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 add_head40432B0300AE "ModelElement::addTaggedValue"
  public void addTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 add_head40432B0300AE "ModelElement::addTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 add_body40432B0300AE "ModelElement::addTaggedValue"
    taggedValue.add(taggedValue1);
    taggedValue1._linkModelElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTaggedValue"));
    return;
    // -end- 33E901E003D4 add_body40432B0300AE "ModelElement::addTaggedValue"
  }

  /** disconnect a TaggedValue.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 remove_head40432B0300AE "ModelElement::removeTaggedValue"
  public TaggedValue removeTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 remove_head40432B0300AE "ModelElement::removeTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 remove_body40432B0300AE "ModelElement::removeTaggedValue"
    TaggedValue ret=null;
    if(taggedValue1==null || !taggedValue.contains(taggedValue1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = taggedValue1;
    taggedValue.remove(taggedValue1);
    taggedValue1._unlinkModelElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTaggedValue"));
    return ret;
    // -end- 33E901E003D4 remove_body40432B0300AE "ModelElement::removeTaggedValue"
  }

  /** tests if a given TaggedValue is connected.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 test_head40432B0300AE "ModelElement::containsTaggedValue"
  public boolean containsTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 test_head40432B0300AE "ModelElement::containsTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 test_body40432B0300AE "ModelElement::containsTaggedValue"
    return taggedValue.contains(taggedValue1);
    // -end- 33E901E003D4 test_body40432B0300AE "ModelElement::containsTaggedValue"
  }

  /** used to enumerate all connected TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 get_all_head40432B0300AE "ModelElement::iteratorTaggedValue"
  public java.util.Iterator iteratorTaggedValue()
  // -end- 33E901E003D4 get_all_head40432B0300AE "ModelElement::iteratorTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 get_all_body40432B0300AE "ModelElement::iteratorTaggedValue"
    return taggedValue.iterator();
    // -end- 33E901E003D4 get_all_body40432B0300AE "ModelElement::iteratorTaggedValue"
  }

  /** disconnect all TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 remove_all_head40432B0300AE "ModelElement::clearTaggedValue"
  public void clearTaggedValue()
  // -end- 33E901E003D4 remove_all_head40432B0300AE "ModelElement::clearTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 remove_all_body40432B0300AE "ModelElement::clearTaggedValue"
    if(sizeTaggedValue()>0){
      for(java.util.Iterator p = taggedValue.iterator(); p.hasNext();){
        ((TaggedValue)p.next())._unlinkModelElement(this);
      }
      taggedValue.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTaggedValue"));
    }
    // -end- 33E901E003D4 remove_all_body40432B0300AE "ModelElement::clearTaggedValue"
  }

  /** returns the number of TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 size_head40432B0300AE "ModelElement::sizeTaggedValue"
  public int sizeTaggedValue()
  // -end- 33E901E003D4 size_head40432B0300AE "ModelElement::sizeTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 size_body40432B0300AE "ModelElement::sizeTaggedValue"
    return taggedValue.size();
    // -end- 33E901E003D4 size_body40432B0300AE "ModelElement::sizeTaggedValue"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E901E003D4 _link_body40432B0300AE "ModelElement::_linkTaggedValue"
  public void _linkTaggedValue(TaggedValue taggedValue1)
  {
    taggedValue.add(taggedValue1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTaggedValue"));
    return;
  }
  // -end- 33E901E003D4 _link_body40432B0300AE "ModelElement::_linkTaggedValue"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E901E003D4 _unlink_body40432B0300AE "ModelElement::_unlinkTaggedValue"
  public void _unlinkTaggedValue(TaggedValue taggedValue1)
  {
    taggedValue.remove(taggedValue1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTaggedValue"));
    return;
  }
  // -end- 33E901E003D4 _unlink_body40432B0300AE "ModelElement::_unlinkTaggedValue"

  // -beg- preserve=no 33EA67BB010E code40432B0300AE "constraint"
  private java.util.Set constraint = new java.util.HashSet();
  // -end- 33EA67BB010E code40432B0300AE "constraint"

  /** add a Constraint.
   *  
   *  @see #removeConstraint
   *  @see #containsConstraint
   *  @see #iteratorConstraint
   *  @see #clearConstraint
   *  @see #sizeConstraint
   */
  // -beg- preserve=no 33EA67BB010E add_head40432B0300AE "ModelElement::addConstraint"
  public void addConstraint(Constraint constraint1)
  // -end- 33EA67BB010E add_head40432B0300AE "ModelElement::addConstraint"
  {
    // -beg- preserve=no 33EA67BB010E add_body40432B0300AE "ModelElement::addConstraint"
    constraint.add(constraint1);
    constraint1._linkConstrainedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addConstraint"));
    return;
    // -end- 33EA67BB010E add_body40432B0300AE "ModelElement::addConstraint"
  }

  /** disconnect a Constraint.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E remove_head40432B0300AE "ModelElement::removeConstraint"
  public Constraint removeConstraint(Constraint constraint1)
  // -end- 33EA67BB010E remove_head40432B0300AE "ModelElement::removeConstraint"
  {
    // -beg- preserve=no 33EA67BB010E remove_body40432B0300AE "ModelElement::removeConstraint"
    Constraint ret=null;
    if(constraint1==null || !constraint.contains(constraint1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = constraint1;
    constraint.remove(constraint1);
    constraint1._unlinkConstrainedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeConstraint"));
    return ret;
    // -end- 33EA67BB010E remove_body40432B0300AE "ModelElement::removeConstraint"
  }

  /** tests if a given Constraint is connected.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E test_head40432B0300AE "ModelElement::containsConstraint"
  public boolean containsConstraint(Constraint constraint1)
  // -end- 33EA67BB010E test_head40432B0300AE "ModelElement::containsConstraint"
  {
    // -beg- preserve=no 33EA67BB010E test_body40432B0300AE "ModelElement::containsConstraint"
    return constraint.contains(constraint1);
    // -end- 33EA67BB010E test_body40432B0300AE "ModelElement::containsConstraint"
  }

  /** used to enumerate all connected Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E get_all_head40432B0300AE "ModelElement::iteratorConstraint"
  public java.util.Iterator iteratorConstraint()
  // -end- 33EA67BB010E get_all_head40432B0300AE "ModelElement::iteratorConstraint"
  {
    // -beg- preserve=no 33EA67BB010E get_all_body40432B0300AE "ModelElement::iteratorConstraint"
    return constraint.iterator();
    // -end- 33EA67BB010E get_all_body40432B0300AE "ModelElement::iteratorConstraint"
  }

  /** disconnect all Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E remove_all_head40432B0300AE "ModelElement::clearConstraint"
  public void clearConstraint()
  // -end- 33EA67BB010E remove_all_head40432B0300AE "ModelElement::clearConstraint"
  {
    // -beg- preserve=no 33EA67BB010E remove_all_body40432B0300AE "ModelElement::clearConstraint"
    if(sizeConstraint()>0){
      for(java.util.Iterator p = constraint.iterator(); p.hasNext();){
        ((Constraint)p.next())._unlinkConstrainedElement(this);
      }
      constraint.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearConstraint"));
    }
    // -end- 33EA67BB010E remove_all_body40432B0300AE "ModelElement::clearConstraint"
  }

  /** returns the number of Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E size_head40432B0300AE "ModelElement::sizeConstraint"
  public int sizeConstraint()
  // -end- 33EA67BB010E size_head40432B0300AE "ModelElement::sizeConstraint"
  {
    // -beg- preserve=no 33EA67BB010E size_body40432B0300AE "ModelElement::sizeConstraint"
    return constraint.size();
    // -end- 33EA67BB010E size_body40432B0300AE "ModelElement::sizeConstraint"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EA67BB010E _link_body40432B0300AE "ModelElement::_linkConstraint"
  public void _linkConstraint(Constraint constraint1)
  {
    constraint.add(constraint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkConstraint"));
    return;
  }
  // -end- 33EA67BB010E _link_body40432B0300AE "ModelElement::_linkConstraint"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EA67BB010E _unlink_body40432B0300AE "ModelElement::_unlinkConstraint"
  public void _unlinkConstraint(Constraint constraint1)
  {
    constraint.remove(constraint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkConstraint"));
    return;
  }
  // -end- 33EA67BB010E _unlink_body40432B0300AE "ModelElement::_unlinkConstraint"

  // -beg- preserve=no 335C0D7A02A8 code40432B0300AE "supplierDependency"
  private java.util.Set supplierDependency = new java.util.HashSet();
  // -end- 335C0D7A02A8 code40432B0300AE "supplierDependency"

  /** add a SupplierDependency.
   *  
   *  @see #removeSupplierDependency
   *  @see #containsSupplierDependency
   *  @see #iteratorSupplierDependency
   *  @see #clearSupplierDependency
   *  @see #sizeSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 add_head40432B0300AE "ModelElement::addSupplierDependency"
  public void addSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 add_head40432B0300AE "ModelElement::addSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 add_body40432B0300AE "ModelElement::addSupplierDependency"
    supplierDependency.add(supplierDependency1);
    supplierDependency1._linkSupplier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSupplierDependency"));
    return;
    // -end- 335C0D7A02A8 add_body40432B0300AE "ModelElement::addSupplierDependency"
  }

  /** disconnect a SupplierDependency.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_head40432B0300AE "ModelElement::removeSupplierDependency"
  public Dependency removeSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 remove_head40432B0300AE "ModelElement::removeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_body40432B0300AE "ModelElement::removeSupplierDependency"
    Dependency ret=null;
    if(supplierDependency1==null || !supplierDependency.contains(supplierDependency1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = supplierDependency1;
    supplierDependency.remove(supplierDependency1);
    supplierDependency1._unlinkSupplier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSupplierDependency"));
    return ret;
    // -end- 335C0D7A02A8 remove_body40432B0300AE "ModelElement::removeSupplierDependency"
  }

  /** tests if a given SupplierDependency is connected.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 test_head40432B0300AE "ModelElement::containsSupplierDependency"
  public boolean containsSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 test_head40432B0300AE "ModelElement::containsSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 test_body40432B0300AE "ModelElement::containsSupplierDependency"
    return supplierDependency.contains(supplierDependency1);
    // -end- 335C0D7A02A8 test_body40432B0300AE "ModelElement::containsSupplierDependency"
  }

  /** used to enumerate all connected SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 get_all_head40432B0300AE "ModelElement::iteratorSupplierDependency"
  public java.util.Iterator iteratorSupplierDependency()
  // -end- 335C0D7A02A8 get_all_head40432B0300AE "ModelElement::iteratorSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 get_all_body40432B0300AE "ModelElement::iteratorSupplierDependency"
    return supplierDependency.iterator();
    // -end- 335C0D7A02A8 get_all_body40432B0300AE "ModelElement::iteratorSupplierDependency"
  }

  /** disconnect all SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_all_head40432B0300AE "ModelElement::clearSupplierDependency"
  public void clearSupplierDependency()
  // -end- 335C0D7A02A8 remove_all_head40432B0300AE "ModelElement::clearSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_all_body40432B0300AE "ModelElement::clearSupplierDependency"
    if(sizeSupplierDependency()>0){
      for(java.util.Iterator p = supplierDependency.iterator(); p.hasNext();){
        ((Dependency)p.next())._unlinkSupplier(this);
      }
      supplierDependency.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSupplierDependency"));
    }
    // -end- 335C0D7A02A8 remove_all_body40432B0300AE "ModelElement::clearSupplierDependency"
  }

  /** returns the number of SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 size_head40432B0300AE "ModelElement::sizeSupplierDependency"
  public int sizeSupplierDependency()
  // -end- 335C0D7A02A8 size_head40432B0300AE "ModelElement::sizeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 size_body40432B0300AE "ModelElement::sizeSupplierDependency"
    return supplierDependency.size();
    // -end- 335C0D7A02A8 size_body40432B0300AE "ModelElement::sizeSupplierDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _link_body40432B0300AE "ModelElement::_linkSupplierDependency"
  public void _linkSupplierDependency(Dependency supplierDependency1)
  {
    supplierDependency.add(supplierDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSupplierDependency"));
    return;
  }
  // -end- 335C0D7A02A8 _link_body40432B0300AE "ModelElement::_linkSupplierDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _unlink_body40432B0300AE "ModelElement::_unlinkSupplierDependency"
  public void _unlinkSupplierDependency(Dependency supplierDependency1)
  {
    supplierDependency.remove(supplierDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSupplierDependency"));
    return;
  }
  // -end- 335C0D7A02A8 _unlink_body40432B0300AE "ModelElement::_unlinkSupplierDependency"

  // -beg- preserve=no 362409A9000A code40432B0300AE "presentation"
  private java.util.Set presentation = new java.util.HashSet();
  // -end- 362409A9000A code40432B0300AE "presentation"

  /** add a Presentation.
   *  
   *  @see #removePresentation
   *  @see #containsPresentation
   *  @see #iteratorPresentation
   *  @see #clearPresentation
   *  @see #sizePresentation
   */
  // -beg- preserve=no 362409A9000A add_head40432B0300AE "ModelElement::addPresentation"
  public void addPresentation(PresentationElement presentation1)
  // -end- 362409A9000A add_head40432B0300AE "ModelElement::addPresentation"
  {
    // -beg- preserve=no 362409A9000A add_body40432B0300AE "ModelElement::addPresentation"
    presentation.add(presentation1);
    presentation1._linkSubject(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPresentation"));
    return;
    // -end- 362409A9000A add_body40432B0300AE "ModelElement::addPresentation"
  }

  /** disconnect a Presentation.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_head40432B0300AE "ModelElement::removePresentation"
  public PresentationElement removePresentation(PresentationElement presentation1)
  // -end- 362409A9000A remove_head40432B0300AE "ModelElement::removePresentation"
  {
    // -beg- preserve=no 362409A9000A remove_body40432B0300AE "ModelElement::removePresentation"
    PresentationElement ret=null;
    if(presentation1==null || !presentation.contains(presentation1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = presentation1;
    presentation.remove(presentation1);
    presentation1._unlinkSubject(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePresentation"));
    return ret;
    // -end- 362409A9000A remove_body40432B0300AE "ModelElement::removePresentation"
  }

  /** tests if a given Presentation is connected.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A test_head40432B0300AE "ModelElement::containsPresentation"
  public boolean containsPresentation(PresentationElement presentation1)
  // -end- 362409A9000A test_head40432B0300AE "ModelElement::containsPresentation"
  {
    // -beg- preserve=no 362409A9000A test_body40432B0300AE "ModelElement::containsPresentation"
    return presentation.contains(presentation1);
    // -end- 362409A9000A test_body40432B0300AE "ModelElement::containsPresentation"
  }

  /** used to enumerate all connected Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A get_all_head40432B0300AE "ModelElement::iteratorPresentation"
  public java.util.Iterator iteratorPresentation()
  // -end- 362409A9000A get_all_head40432B0300AE "ModelElement::iteratorPresentation"
  {
    // -beg- preserve=no 362409A9000A get_all_body40432B0300AE "ModelElement::iteratorPresentation"
    return presentation.iterator();
    // -end- 362409A9000A get_all_body40432B0300AE "ModelElement::iteratorPresentation"
  }

  /** disconnect all Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_all_head40432B0300AE "ModelElement::clearPresentation"
  public void clearPresentation()
  // -end- 362409A9000A remove_all_head40432B0300AE "ModelElement::clearPresentation"
  {
    // -beg- preserve=no 362409A9000A remove_all_body40432B0300AE "ModelElement::clearPresentation"
    if(sizePresentation()>0){
      for(java.util.Iterator p = presentation.iterator(); p.hasNext();){
        ((PresentationElement)p.next())._unlinkSubject(this);
      }
      presentation.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPresentation"));
    }
    // -end- 362409A9000A remove_all_body40432B0300AE "ModelElement::clearPresentation"
  }

  /** returns the number of Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A size_head40432B0300AE "ModelElement::sizePresentation"
  public int sizePresentation()
  // -end- 362409A9000A size_head40432B0300AE "ModelElement::sizePresentation"
  {
    // -beg- preserve=no 362409A9000A size_body40432B0300AE "ModelElement::sizePresentation"
    return presentation.size();
    // -end- 362409A9000A size_body40432B0300AE "ModelElement::sizePresentation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _link_body40432B0300AE "ModelElement::_linkPresentation"
  public void _linkPresentation(PresentationElement presentation1)
  {
    presentation.add(presentation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPresentation"));
    return;
  }
  // -end- 362409A9000A _link_body40432B0300AE "ModelElement::_linkPresentation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _unlink_body40432B0300AE "ModelElement::_unlinkPresentation"
  public void _unlinkPresentation(PresentationElement presentation1)
  {
    presentation.remove(presentation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPresentation"));
    return;
  }
  // -end- 362409A9000A _unlink_body40432B0300AE "ModelElement::_unlinkPresentation"

  // -beg- preserve=no 36240CA4024E code40432B0300AE "container"
  private java.util.Set container = new java.util.HashSet();
  // -end- 36240CA4024E code40432B0300AE "container"

  /** add a Container.
   *  
   *  @see #removeContainer
   *  @see #containsContainer
   *  @see #iteratorContainer
   *  @see #clearContainer
   *  @see #sizeContainer
   *  @see #iteratorContainerLink
   *  @see #createContainerLink
   *  @see #findContainerLink
   */
  // -beg- preserve=no 36240CA4024E add_head40432B0300AE "ModelElement::addContainer"
  public void addContainer(Component container1)
  // -end- 36240CA4024E add_head40432B0300AE "ModelElement::addContainer"
  {
    // -beg- preserve=no 36240CA4024E add_body40432B0300AE "ModelElement::addContainer"
    ElementResidence linkobj=createContainerLink();
    linkobj.setContainer(container1);
    linkobj.setResident(this);
    container.add(linkobj);
    container1._linkResident(linkobj);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContainer"));
    return;
    // -end- 36240CA4024E add_body40432B0300AE "ModelElement::addContainer"
  }

  /** add a link to a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E addlink_head40432B0300AE "ModelElement::addContainerLink"
  public void addContainerLink(ElementResidence container1)
  // -end- 36240CA4024E addlink_head40432B0300AE "ModelElement::addContainerLink"
  {
    // -beg- preserve=no 36240CA4024E addlink_body40432B0300AE "ModelElement::addContainerLink"
    container1.setResident(this);
    container.add(container1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContainerLink"));
    return;
    // -end- 36240CA4024E addlink_body40432B0300AE "ModelElement::addContainerLink"
  }

  /** disconnect a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E remove_head40432B0300AE "ModelElement::removeContainer"
  public Component removeContainer(Component container1)
  // -end- 36240CA4024E remove_head40432B0300AE "ModelElement::removeContainer"
  {
    // -beg- preserve=no 36240CA4024E remove_body40432B0300AE "ModelElement::removeContainer"
    Component ret=null;
    ElementResidence linkobj=findContainerLink(container1);
    if(container1==null || linkobj==null){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = linkobj.getContainer();
    container.remove(linkobj);
    ret._unlinkResident(linkobj);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeContainer"));
    return ret;
    // -end- 36240CA4024E remove_body40432B0300AE "ModelElement::removeContainer"
  }

  /** tests if a given Container is connected.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E test_head40432B0300AE "ModelElement::containsContainer"
  public boolean containsContainer(Component container1)
  // -end- 36240CA4024E test_head40432B0300AE "ModelElement::containsContainer"
  {
    // -beg- preserve=no 36240CA4024E test_body40432B0300AE "ModelElement::containsContainer"
    return container.contains(findContainerLink(container1));
    // -end- 36240CA4024E test_body40432B0300AE "ModelElement::containsContainer"
  }

  /** used to enumerate all connected Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E get_all_head40432B0300AE "ModelElement::iteratorContainer"
  public java.util.Iterator iteratorContainer()
  // -end- 36240CA4024E get_all_head40432B0300AE "ModelElement::iteratorContainer"
  {
    // -beg- preserve=no 36240CA4024E get_all_body40432B0300AE "ModelElement::iteratorContainer"
    return new java.util.Iterator(){
      private java.util.Iterator i=container.iterator();
      public boolean hasNext(){
        return i.hasNext();
      }
      public Object next(){
        ElementResidence next=(ElementResidence)i.next();
        return next.getContainer();
      }
      public void remove(){
        i.remove();
      }
    };
    // -end- 36240CA4024E get_all_body40432B0300AE "ModelElement::iteratorContainer"
  }

  /** disconnect all Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E remove_all_head40432B0300AE "ModelElement::clearContainer"
  public void clearContainer()
  // -end- 36240CA4024E remove_all_head40432B0300AE "ModelElement::clearContainer"
  {
    // -beg- preserve=no 36240CA4024E remove_all_body40432B0300AE "ModelElement::clearContainer"
    if(sizeContainer()>0){
      for(java.util.Iterator p = container.iterator(); p.hasNext();){
        ElementResidence linkobj=(ElementResidence)p.next();
        linkobj.getContainer()._unlinkResident(linkobj);
      }
      container.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearContainer"));
    }
    // -end- 36240CA4024E remove_all_body40432B0300AE "ModelElement::clearContainer"
  }

  /** returns the number of Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E size_head40432B0300AE "ModelElement::sizeContainer"
  public int sizeContainer()
  // -end- 36240CA4024E size_head40432B0300AE "ModelElement::sizeContainer"
  {
    // -beg- preserve=no 36240CA4024E size_body40432B0300AE "ModelElement::sizeContainer"
    return container.size();
    // -end- 36240CA4024E size_body40432B0300AE "ModelElement::sizeContainer"
  }

  /** enumerate the link objects of currently connected Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E itlink_head40432B0300AE "ModelElement::getContainerLink"
  public java.util.Iterator iteratorContainerLink()
  // -end- 36240CA4024E itlink_head40432B0300AE "ModelElement::getContainerLink"
  {
    // -beg- preserve=no 36240CA4024E itlink_body40432B0300AE "ModelElement::getContainerLink"
    return container.iterator();
    // -end- 36240CA4024E itlink_body40432B0300AE "ModelElement::getContainerLink"
  }

  /** create a link class for a new link to a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E createlink_head40432B0300AE "ModelElement::createContainerLink"
  public ElementResidence createContainerLink()
  // -end- 36240CA4024E createlink_head40432B0300AE "ModelElement::createContainerLink"
  {
    // -beg- preserve=no 36240CA4024E createlink_body40432B0300AE "ModelElement::createContainerLink"
    // return new ElementResidence();
    throw new java.lang.UnsupportedOperationException();
    // -end- 36240CA4024E createlink_body40432B0300AE "ModelElement::createContainerLink"
  }

  /** find a link object for a given Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E find_head40432B0300AE "ModelElement::findContainerLink"
  public ElementResidence findContainerLink(Component container1)
  // -end- 36240CA4024E find_head40432B0300AE "ModelElement::findContainerLink"
  {
      // -beg- preserve=no 36240CA4024E find_body40432B0300AE "ModelElement::findContainerLink"
      if(container1==null) return null;
      for(java.util.Iterator p = container.iterator(); p.hasNext();){
        ElementResidence linkobj=(ElementResidence)p.next();
        if(linkobj.getContainer()==container1) return linkobj;
      }
      return null;
      // -end- 36240CA4024E find_body40432B0300AE "ModelElement::findContainerLink"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240CA4024E _link_body40432B0300AE "ModelElement::_linkContainer"
    public void _linkContainer(ElementResidence container1)
    {
      container.add(container1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkContainer"));
      return;
    }
    // -end- 36240CA4024E _link_body40432B0300AE "ModelElement::_linkContainer"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240CA4024E _unlink_body40432B0300AE "ModelElement::_unlinkContainer"
    public void _unlinkContainer(ElementResidence container1)
    {
      container.remove(container1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkContainer"));
      return;
    }
    // -end- 36240CA4024E _unlink_body40432B0300AE "ModelElement::_unlinkContainer"

    // -beg- preserve=no 36240F380050 code40432B0300AE "templateParameter"
    private java.util.List templateParameter = new java.util.ArrayList();
    // -end- 36240F380050 code40432B0300AE "templateParameter"

    /** add a TemplateParameter.
     *  
     *  @see #removeTemplateParameter
     *  @see #containsTemplateParameter
     *  @see #iteratorTemplateParameter
     *  @see #clearTemplateParameter
     *  @see #sizeTemplateParameter
     */
    // -beg- preserve=no 36240F380050 add_head40432B0300AE "ModelElement::addTemplateParameter"
    public void addTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 add_head40432B0300AE "ModelElement::addTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 add_body40432B0300AE "ModelElement::addTemplateParameter"
      templateParameter.add(templateParameter1);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTemplateParameter"));
      return;
      // -end- 36240F380050 add_body40432B0300AE "ModelElement::addTemplateParameter"
    }

    // -beg- preserve=no 36240F380050 add2_head40432B0300AE "ModelElement::add2TemplateParameter"
    public void addTemplateParameter(int index,TemplateParameter templateParameter1)
    // -end- 36240F380050 add2_head40432B0300AE "ModelElement::add2TemplateParameter"
    {
      // -beg- preserve=no 36240F380050 add2_body40432B0300AE "ModelElement::add2TemplateParameter"
      templateParameter.add(index,templateParameter1);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTemplateParameter"));
      return;
      // -end- 36240F380050 add2_body40432B0300AE "ModelElement::add2TemplateParameter"
    }

    /** disconnect a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove_head40432B0300AE "ModelElement::removeTemplateParameter"
    public TemplateParameter removeTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 remove_head40432B0300AE "ModelElement::removeTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove_body40432B0300AE "ModelElement::removeTemplateParameter"
      TemplateParameter ret=null;
      if(templateParameter1==null || !templateParameter.contains(templateParameter1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = templateParameter1;
      templateParameter.remove(templateParameter1);
      templateParameter1._unlinkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTemplateParameter"));
      return ret;
      // -end- 36240F380050 remove_body40432B0300AE "ModelElement::removeTemplateParameter"
    }

    /** disconnect a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove2_head40432B0300AE "ModelElement::remove2TemplateParameter"
    public TemplateParameter removeTemplateParameter(int index)
    // -end- 36240F380050 remove2_head40432B0300AE "ModelElement::remove2TemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove2_body40432B0300AE "ModelElement::remove2TemplateParameter"
      TemplateParameter ret=null;
      ret = (TemplateParameter)templateParameter.remove(index);
      ret._unlinkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTemplateParameter"));
      return ret;
      // -end- 36240F380050 remove2_body40432B0300AE "ModelElement::remove2TemplateParameter"
    }

    /** change a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 set_head40432B0300AE "ModelElement::setTemplateParameter"
    public TemplateParameter setTemplateParameter(int index,TemplateParameter templateParameter1)
    // -end- 36240F380050 set_head40432B0300AE "ModelElement::setTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 set_body40432B0300AE "ModelElement::setTemplateParameter"
      TemplateParameter ret=null;
      ret = (TemplateParameter)templateParameter.set(index,templateParameter1);
      ret._unlinkTemplate(this);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setTemplateParameter"));
      return ret;
      // -end- 36240F380050 set_body40432B0300AE "ModelElement::setTemplateParameter"
    }

    /** tests if a given TemplateParameter is connected.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 test_head40432B0300AE "ModelElement::containsTemplateParameter"
    public boolean containsTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 test_head40432B0300AE "ModelElement::containsTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 test_body40432B0300AE "ModelElement::containsTemplateParameter"
      return templateParameter.contains(templateParameter1);
      // -end- 36240F380050 test_body40432B0300AE "ModelElement::containsTemplateParameter"
    }

    /** used to enumerate all connected TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 get_all_head40432B0300AE "ModelElement::iteratorTemplateParameter"
    public java.util.Iterator iteratorTemplateParameter()
    // -end- 36240F380050 get_all_head40432B0300AE "ModelElement::iteratorTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 get_all_body40432B0300AE "ModelElement::iteratorTemplateParameter"
      return templateParameter.iterator();
      // -end- 36240F380050 get_all_body40432B0300AE "ModelElement::iteratorTemplateParameter"
    }

    /** disconnect all TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove_all_head40432B0300AE "ModelElement::clearTemplateParameter"
    public void clearTemplateParameter()
    // -end- 36240F380050 remove_all_head40432B0300AE "ModelElement::clearTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove_all_body40432B0300AE "ModelElement::clearTemplateParameter"
      if(sizeTemplateParameter()>0){
        for(java.util.Iterator p = templateParameter.iterator(); p.hasNext();){
          ((TemplateParameter)p.next())._unlinkTemplate(this);
        }
        templateParameter.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTemplateParameter"));
      }
      // -end- 36240F380050 remove_all_body40432B0300AE "ModelElement::clearTemplateParameter"
    }

    /** returns the number of TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 size_head40432B0300AE "ModelElement::sizeTemplateParameter"
    public int sizeTemplateParameter()
    // -end- 36240F380050 size_head40432B0300AE "ModelElement::sizeTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 size_body40432B0300AE "ModelElement::sizeTemplateParameter"
      return templateParameter.size();
      // -end- 36240F380050 size_body40432B0300AE "ModelElement::sizeTemplateParameter"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240F380050 _link_body40432B0300AE "ModelElement::_linkTemplateParameter"
    public void _linkTemplateParameter(TemplateParameter templateParameter1)
    {
      templateParameter.add(templateParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTemplateParameter"));
      return;
    }
    // -end- 36240F380050 _link_body40432B0300AE "ModelElement::_linkTemplateParameter"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240F380050 _unlink_body40432B0300AE "ModelElement::_unlinkTemplateParameter"
    public void _unlinkTemplateParameter(TemplateParameter templateParameter1)
    {
      templateParameter.remove(templateParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTemplateParameter"));
      return;
    }
    // -end- 36240F380050 _unlink_body40432B0300AE "ModelElement::_unlinkTemplateParameter"

    // -beg- preserve=no 3627D5E9010F code40432B0300AE "targetFlow"
    private java.util.Set targetFlow = new java.util.HashSet();
    // -end- 3627D5E9010F code40432B0300AE "targetFlow"

    /** add a TargetFlow.
     *  
     *  @see #removeTargetFlow
     *  @see #containsTargetFlow
     *  @see #iteratorTargetFlow
     *  @see #clearTargetFlow
     *  @see #sizeTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F add_head40432B0300AE "ModelElement::addTargetFlow"
    public void addTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F add_head40432B0300AE "ModelElement::addTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F add_body40432B0300AE "ModelElement::addTargetFlow"
      targetFlow.add(targetFlow1);
      targetFlow1._linkTarget(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTargetFlow"));
      return;
      // -end- 3627D5E9010F add_body40432B0300AE "ModelElement::addTargetFlow"
    }

    /** disconnect a TargetFlow.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F remove_head40432B0300AE "ModelElement::removeTargetFlow"
    public Flow removeTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F remove_head40432B0300AE "ModelElement::removeTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F remove_body40432B0300AE "ModelElement::removeTargetFlow"
      Flow ret=null;
      if(targetFlow1==null || !targetFlow.contains(targetFlow1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = targetFlow1;
      targetFlow.remove(targetFlow1);
      targetFlow1._unlinkTarget(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTargetFlow"));
      return ret;
      // -end- 3627D5E9010F remove_body40432B0300AE "ModelElement::removeTargetFlow"
    }

    /** tests if a given TargetFlow is connected.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F test_head40432B0300AE "ModelElement::containsTargetFlow"
    public boolean containsTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F test_head40432B0300AE "ModelElement::containsTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F test_body40432B0300AE "ModelElement::containsTargetFlow"
      return targetFlow.contains(targetFlow1);
      // -end- 3627D5E9010F test_body40432B0300AE "ModelElement::containsTargetFlow"
    }

    /** used to enumerate all connected TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F get_all_head40432B0300AE "ModelElement::iteratorTargetFlow"
    public java.util.Iterator iteratorTargetFlow()
    // -end- 3627D5E9010F get_all_head40432B0300AE "ModelElement::iteratorTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F get_all_body40432B0300AE "ModelElement::iteratorTargetFlow"
      return targetFlow.iterator();
      // -end- 3627D5E9010F get_all_body40432B0300AE "ModelElement::iteratorTargetFlow"
    }

    /** disconnect all TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F remove_all_head40432B0300AE "ModelElement::clearTargetFlow"
    public void clearTargetFlow()
    // -end- 3627D5E9010F remove_all_head40432B0300AE "ModelElement::clearTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F remove_all_body40432B0300AE "ModelElement::clearTargetFlow"
      if(sizeTargetFlow()>0){
        for(java.util.Iterator p = targetFlow.iterator(); p.hasNext();){
          ((Flow)p.next())._unlinkTarget(this);
        }
        targetFlow.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTargetFlow"));
      }
      // -end- 3627D5E9010F remove_all_body40432B0300AE "ModelElement::clearTargetFlow"
    }

    /** returns the number of TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F size_head40432B0300AE "ModelElement::sizeTargetFlow"
    public int sizeTargetFlow()
    // -end- 3627D5E9010F size_head40432B0300AE "ModelElement::sizeTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F size_body40432B0300AE "ModelElement::sizeTargetFlow"
      return targetFlow.size();
      // -end- 3627D5E9010F size_body40432B0300AE "ModelElement::sizeTargetFlow"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D5E9010F _link_body40432B0300AE "ModelElement::_linkTargetFlow"
    public void _linkTargetFlow(Flow targetFlow1)
    {
      targetFlow.add(targetFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTargetFlow"));
      return;
    }
    // -end- 3627D5E9010F _link_body40432B0300AE "ModelElement::_linkTargetFlow"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D5E9010F _unlink_body40432B0300AE "ModelElement::_unlinkTargetFlow"
    public void _unlinkTargetFlow(Flow targetFlow1)
    {
      targetFlow.remove(targetFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTargetFlow"));
      return;
    }
    // -end- 3627D5E9010F _unlink_body40432B0300AE "ModelElement::_unlinkTargetFlow"

    // -beg- preserve=no 3627D60F03DF code40432B0300AE "sourceFlow"
    private java.util.Set sourceFlow = new java.util.HashSet();
    // -end- 3627D60F03DF code40432B0300AE "sourceFlow"

    /** add a SourceFlow.
     *  
     *  @see #removeSourceFlow
     *  @see #containsSourceFlow
     *  @see #iteratorSourceFlow
     *  @see #clearSourceFlow
     *  @see #sizeSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF add_head40432B0300AE "ModelElement::addSourceFlow"
    public void addSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF add_head40432B0300AE "ModelElement::addSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF add_body40432B0300AE "ModelElement::addSourceFlow"
      sourceFlow.add(sourceFlow1);
      sourceFlow1._linkSource(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSourceFlow"));
      return;
      // -end- 3627D60F03DF add_body40432B0300AE "ModelElement::addSourceFlow"
    }

    /** disconnect a SourceFlow.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF remove_head40432B0300AE "ModelElement::removeSourceFlow"
    public Flow removeSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF remove_head40432B0300AE "ModelElement::removeSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF remove_body40432B0300AE "ModelElement::removeSourceFlow"
      Flow ret=null;
      if(sourceFlow1==null || !sourceFlow.contains(sourceFlow1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = sourceFlow1;
      sourceFlow.remove(sourceFlow1);
      sourceFlow1._unlinkSource(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSourceFlow"));
      return ret;
      // -end- 3627D60F03DF remove_body40432B0300AE "ModelElement::removeSourceFlow"
    }

    /** tests if a given SourceFlow is connected.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF test_head40432B0300AE "ModelElement::containsSourceFlow"
    public boolean containsSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF test_head40432B0300AE "ModelElement::containsSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF test_body40432B0300AE "ModelElement::containsSourceFlow"
      return sourceFlow.contains(sourceFlow1);
      // -end- 3627D60F03DF test_body40432B0300AE "ModelElement::containsSourceFlow"
    }

    /** used to enumerate all connected SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF get_all_head40432B0300AE "ModelElement::iteratorSourceFlow"
    public java.util.Iterator iteratorSourceFlow()
    // -end- 3627D60F03DF get_all_head40432B0300AE "ModelElement::iteratorSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF get_all_body40432B0300AE "ModelElement::iteratorSourceFlow"
      return sourceFlow.iterator();
      // -end- 3627D60F03DF get_all_body40432B0300AE "ModelElement::iteratorSourceFlow"
    }

    /** disconnect all SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF remove_all_head40432B0300AE "ModelElement::clearSourceFlow"
    public void clearSourceFlow()
    // -end- 3627D60F03DF remove_all_head40432B0300AE "ModelElement::clearSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF remove_all_body40432B0300AE "ModelElement::clearSourceFlow"
      if(sizeSourceFlow()>0){
        for(java.util.Iterator p = sourceFlow.iterator(); p.hasNext();){
          ((Flow)p.next())._unlinkSource(this);
        }
        sourceFlow.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSourceFlow"));
      }
      // -end- 3627D60F03DF remove_all_body40432B0300AE "ModelElement::clearSourceFlow"
    }

    /** returns the number of SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF size_head40432B0300AE "ModelElement::sizeSourceFlow"
    public int sizeSourceFlow()
    // -end- 3627D60F03DF size_head40432B0300AE "ModelElement::sizeSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF size_body40432B0300AE "ModelElement::sizeSourceFlow"
      return sourceFlow.size();
      // -end- 3627D60F03DF size_body40432B0300AE "ModelElement::sizeSourceFlow"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D60F03DF _link_body40432B0300AE "ModelElement::_linkSourceFlow"
    public void _linkSourceFlow(Flow sourceFlow1)
    {
      sourceFlow.add(sourceFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSourceFlow"));
      return;
    }
    // -end- 3627D60F03DF _link_body40432B0300AE "ModelElement::_linkSourceFlow"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D60F03DF _unlink_body40432B0300AE "ModelElement::_unlinkSourceFlow"
    public void _unlinkSourceFlow(Flow sourceFlow1)
    {
      sourceFlow.remove(sourceFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSourceFlow"));
      return;
    }
    // -end- 3627D60F03DF _unlink_body40432B0300AE "ModelElement::_unlinkSourceFlow"

    // -beg- preserve=no 365EEE82035C code40432B0300AE "defaultParameter"
    private java.util.Set defaultParameter = new java.util.HashSet();
    // -end- 365EEE82035C code40432B0300AE "defaultParameter"

    /** add a DefaultParameter.
     *  
     *  @see #removeDefaultParameter
     *  @see #containsDefaultParameter
     *  @see #iteratorDefaultParameter
     *  @see #clearDefaultParameter
     *  @see #sizeDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C add_head40432B0300AE "ModelElement::addDefaultParameter"
    public void addDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C add_head40432B0300AE "ModelElement::addDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C add_body40432B0300AE "ModelElement::addDefaultParameter"
      defaultParameter.add(defaultParameter1);
      defaultParameter1._linkDefaultElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDefaultParameter"));
      return;
      // -end- 365EEE82035C add_body40432B0300AE "ModelElement::addDefaultParameter"
    }

    /** disconnect a DefaultParameter.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C remove_head40432B0300AE "ModelElement::removeDefaultParameter"
    public TemplateParameter removeDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C remove_head40432B0300AE "ModelElement::removeDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C remove_body40432B0300AE "ModelElement::removeDefaultParameter"
      TemplateParameter ret=null;
      if(defaultParameter1==null || !defaultParameter.contains(defaultParameter1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = defaultParameter1;
      defaultParameter.remove(defaultParameter1);
      defaultParameter1._unlinkDefaultElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDefaultParameter"));
      return ret;
      // -end- 365EEE82035C remove_body40432B0300AE "ModelElement::removeDefaultParameter"
    }

    /** tests if a given DefaultParameter is connected.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C test_head40432B0300AE "ModelElement::containsDefaultParameter"
    public boolean containsDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C test_head40432B0300AE "ModelElement::containsDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C test_body40432B0300AE "ModelElement::containsDefaultParameter"
      return defaultParameter.contains(defaultParameter1);
      // -end- 365EEE82035C test_body40432B0300AE "ModelElement::containsDefaultParameter"
    }

    /** used to enumerate all connected DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C get_all_head40432B0300AE "ModelElement::iteratorDefaultParameter"
    public java.util.Iterator iteratorDefaultParameter()
    // -end- 365EEE82035C get_all_head40432B0300AE "ModelElement::iteratorDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C get_all_body40432B0300AE "ModelElement::iteratorDefaultParameter"
      return defaultParameter.iterator();
      // -end- 365EEE82035C get_all_body40432B0300AE "ModelElement::iteratorDefaultParameter"
    }

    /** disconnect all DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C remove_all_head40432B0300AE "ModelElement::clearDefaultParameter"
    public void clearDefaultParameter()
    // -end- 365EEE82035C remove_all_head40432B0300AE "ModelElement::clearDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C remove_all_body40432B0300AE "ModelElement::clearDefaultParameter"
      if(sizeDefaultParameter()>0){
        for(java.util.Iterator p = defaultParameter.iterator(); p.hasNext();){
          ((TemplateParameter)p.next())._unlinkDefaultElement(this);
        }
        defaultParameter.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDefaultParameter"));
      }
      // -end- 365EEE82035C remove_all_body40432B0300AE "ModelElement::clearDefaultParameter"
    }

    /** returns the number of DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C size_head40432B0300AE "ModelElement::sizeDefaultParameter"
    public int sizeDefaultParameter()
    // -end- 365EEE82035C size_head40432B0300AE "ModelElement::sizeDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C size_body40432B0300AE "ModelElement::sizeDefaultParameter"
      return defaultParameter.size();
      // -end- 365EEE82035C size_body40432B0300AE "ModelElement::sizeDefaultParameter"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 365EEE82035C _link_body40432B0300AE "ModelElement::_linkDefaultParameter"
    public void _linkDefaultParameter(TemplateParameter defaultParameter1)
    {
      defaultParameter.add(defaultParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDefaultParameter"));
      return;
    }
    // -end- 365EEE82035C _link_body40432B0300AE "ModelElement::_linkDefaultParameter"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 365EEE82035C _unlink_body40432B0300AE "ModelElement::_unlinkDefaultParameter"
    public void _unlinkDefaultParameter(TemplateParameter defaultParameter1)
    {
      defaultParameter.remove(defaultParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDefaultParameter"));
      return;
    }
    // -end- 365EEE82035C _unlink_body40432B0300AE "ModelElement::_unlinkDefaultParameter"

    // -beg- preserve=no 370E7E3C02DE code40432B0300AE "comment"
    private java.util.Set comment = new java.util.HashSet();
    // -end- 370E7E3C02DE code40432B0300AE "comment"

    /** add a Comment.
     *  
     *  @see #removeComment
     *  @see #containsComment
     *  @see #iteratorComment
     *  @see #clearComment
     *  @see #sizeComment
     */
    // -beg- preserve=no 370E7E3C02DE add_head40432B0300AE "ModelElement::addComment"
    public void addComment(Comment comment1)
    // -end- 370E7E3C02DE add_head40432B0300AE "ModelElement::addComment"
    {
      // -beg- preserve=no 370E7E3C02DE add_body40432B0300AE "ModelElement::addComment"
      comment.add(comment1);
      comment1._linkAnnotatedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addComment"));
      return;
      // -end- 370E7E3C02DE add_body40432B0300AE "ModelElement::addComment"
    }

    /** disconnect a Comment.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE remove_head40432B0300AE "ModelElement::removeComment"
    public Comment removeComment(Comment comment1)
    // -end- 370E7E3C02DE remove_head40432B0300AE "ModelElement::removeComment"
    {
      // -beg- preserve=no 370E7E3C02DE remove_body40432B0300AE "ModelElement::removeComment"
      Comment ret=null;
      if(comment1==null || !comment.contains(comment1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = comment1;
      comment.remove(comment1);
      comment1._unlinkAnnotatedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeComment"));
      return ret;
      // -end- 370E7E3C02DE remove_body40432B0300AE "ModelElement::removeComment"
    }

    /** tests if a given Comment is connected.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE test_head40432B0300AE "ModelElement::containsComment"
    public boolean containsComment(Comment comment1)
    // -end- 370E7E3C02DE test_head40432B0300AE "ModelElement::containsComment"
    {
      // -beg- preserve=no 370E7E3C02DE test_body40432B0300AE "ModelElement::containsComment"
      return comment.contains(comment1);
      // -end- 370E7E3C02DE test_body40432B0300AE "ModelElement::containsComment"
    }

    /** used to enumerate all connected Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE get_all_head40432B0300AE "ModelElement::iteratorComment"
    public java.util.Iterator iteratorComment()
    // -end- 370E7E3C02DE get_all_head40432B0300AE "ModelElement::iteratorComment"
    {
      // -beg- preserve=no 370E7E3C02DE get_all_body40432B0300AE "ModelElement::iteratorComment"
      return comment.iterator();
      // -end- 370E7E3C02DE get_all_body40432B0300AE "ModelElement::iteratorComment"
    }

    /** disconnect all Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE remove_all_head40432B0300AE "ModelElement::clearComment"
    public void clearComment()
    // -end- 370E7E3C02DE remove_all_head40432B0300AE "ModelElement::clearComment"
    {
      // -beg- preserve=no 370E7E3C02DE remove_all_body40432B0300AE "ModelElement::clearComment"
      if(sizeComment()>0){
        for(java.util.Iterator p = comment.iterator(); p.hasNext();){
          ((Comment)p.next())._unlinkAnnotatedElement(this);
        }
        comment.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearComment"));
      }
      // -end- 370E7E3C02DE remove_all_body40432B0300AE "ModelElement::clearComment"
    }

    /** returns the number of Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE size_head40432B0300AE "ModelElement::sizeComment"
    public int sizeComment()
    // -end- 370E7E3C02DE size_head40432B0300AE "ModelElement::sizeComment"
    {
      // -beg- preserve=no 370E7E3C02DE size_body40432B0300AE "ModelElement::sizeComment"
      return comment.size();
      // -end- 370E7E3C02DE size_body40432B0300AE "ModelElement::sizeComment"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 370E7E3C02DE _link_body40432B0300AE "ModelElement::_linkComment"
    public void _linkComment(Comment comment1)
    {
      comment.add(comment1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkComment"));
      return;
    }
    // -end- 370E7E3C02DE _link_body40432B0300AE "ModelElement::_linkComment"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 370E7E3C02DE _unlink_body40432B0300AE "ModelElement::_unlinkComment"
    public void _unlinkComment(Comment comment1)
    {
      comment.remove(comment1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkComment"));
      return;
    }
    // -end- 370E7E3C02DE _unlink_body40432B0300AE "ModelElement::_unlinkComment"

    // -beg- preserve=no 338613A4007B code40432B0300AE "stereotype"
    private java.util.Set stereotype = new java.util.HashSet();
    // -end- 338613A4007B code40432B0300AE "stereotype"

    /** add a Stereotype.
     *  
     *  @see #removeStereotype
     *  @see #containsStereotype
     *  @see #iteratorStereotype
     *  @see #clearStereotype
     *  @see #sizeStereotype
     */
    // -beg- preserve=no 338613A4007B add_head40432B0300AE "ModelElement::addStereotype"
    public void addStereotype(Stereotype stereotype1)
    // -end- 338613A4007B add_head40432B0300AE "ModelElement::addStereotype"
    {
      // -beg- preserve=no 338613A4007B add_body40432B0300AE "ModelElement::addStereotype"
      stereotype.add(stereotype1);
      stereotype1._linkExtendedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addStereotype"));
      return;
      // -end- 338613A4007B add_body40432B0300AE "ModelElement::addStereotype"
    }

    /** disconnect a Stereotype.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B remove_head40432B0300AE "ModelElement::removeStereotype"
    public Stereotype removeStereotype(Stereotype stereotype1)
    // -end- 338613A4007B remove_head40432B0300AE "ModelElement::removeStereotype"
    {
      // -beg- preserve=no 338613A4007B remove_body40432B0300AE "ModelElement::removeStereotype"
      Stereotype ret=null;
      if(stereotype1==null || !stereotype.contains(stereotype1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = stereotype1;
      stereotype.remove(stereotype1);
      stereotype1._unlinkExtendedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeStereotype"));
      return ret;
      // -end- 338613A4007B remove_body40432B0300AE "ModelElement::removeStereotype"
    }

    /** tests if a given Stereotype is connected.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B test_head40432B0300AE "ModelElement::containsStereotype"
    public boolean containsStereotype(Stereotype stereotype1)
    // -end- 338613A4007B test_head40432B0300AE "ModelElement::containsStereotype"
    {
      // -beg- preserve=no 338613A4007B test_body40432B0300AE "ModelElement::containsStereotype"
      return stereotype.contains(stereotype1);
      // -end- 338613A4007B test_body40432B0300AE "ModelElement::containsStereotype"
    }

    /** used to enumerate all connected Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B get_all_head40432B0300AE "ModelElement::iteratorStereotype"
    public java.util.Iterator iteratorStereotype()
    // -end- 338613A4007B get_all_head40432B0300AE "ModelElement::iteratorStereotype"
    {
      // -beg- preserve=no 338613A4007B get_all_body40432B0300AE "ModelElement::iteratorStereotype"
      return stereotype.iterator();
      // -end- 338613A4007B get_all_body40432B0300AE "ModelElement::iteratorStereotype"
    }

    /** disconnect all Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B remove_all_head40432B0300AE "ModelElement::clearStereotype"
    public void clearStereotype()
    // -end- 338613A4007B remove_all_head40432B0300AE "ModelElement::clearStereotype"
    {
      // -beg- preserve=no 338613A4007B remove_all_body40432B0300AE "ModelElement::clearStereotype"
      if(sizeStereotype()>0){
        for(java.util.Iterator p = stereotype.iterator(); p.hasNext();){
          ((Stereotype)p.next())._unlinkExtendedElement(this);
        }
        stereotype.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearStereotype"));
      }
      // -end- 338613A4007B remove_all_body40432B0300AE "ModelElement::clearStereotype"
    }

    /** returns the number of Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B size_head40432B0300AE "ModelElement::sizeStereotype"
    public int sizeStereotype()
    // -end- 338613A4007B size_head40432B0300AE "ModelElement::sizeStereotype"
    {
      // -beg- preserve=no 338613A4007B size_body40432B0300AE "ModelElement::sizeStereotype"
      return stereotype.size();
      // -end- 338613A4007B size_body40432B0300AE "ModelElement::sizeStereotype"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 338613A4007B _link_body40432B0300AE "ModelElement::_linkStereotype"
    public void _linkStereotype(Stereotype stereotype1)
    {
      stereotype.add(stereotype1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkStereotype"));
      return;
    }
    // -end- 338613A4007B _link_body40432B0300AE "ModelElement::_linkStereotype"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 338613A4007B _unlink_body40432B0300AE "ModelElement::_unlinkStereotype"
    public void _unlinkStereotype(Stereotype stereotype1)
    {
      stereotype.remove(stereotype1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkStereotype"));
      return;
    }
    // -end- 338613A4007B _unlink_body40432B0300AE "ModelElement::_unlinkStereotype"

    // -beg- preserve=no 39B9B0F703C8 code40432B0300AE "referenceTag"
    private java.util.Set referenceTag = new java.util.HashSet();
    // -end- 39B9B0F703C8 code40432B0300AE "referenceTag"

    /** add a ReferenceTag.
     *  
     *  @see #removeReferenceTag
     *  @see #containsReferenceTag
     *  @see #iteratorReferenceTag
     *  @see #clearReferenceTag
     *  @see #sizeReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 add_head40432B0300AE "ModelElement::addReferenceTag"
    public void addReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 add_head40432B0300AE "ModelElement::addReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 add_body40432B0300AE "ModelElement::addReferenceTag"
      referenceTag.add(referenceTag1);
      referenceTag1._linkReferenceValue(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addReferenceTag"));
      return;
      // -end- 39B9B0F703C8 add_body40432B0300AE "ModelElement::addReferenceTag"
    }

    /** disconnect a ReferenceTag.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 remove_head40432B0300AE "ModelElement::removeReferenceTag"
    public TaggedValue removeReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 remove_head40432B0300AE "ModelElement::removeReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 remove_body40432B0300AE "ModelElement::removeReferenceTag"
      TaggedValue ret=null;
      if(referenceTag1==null || !referenceTag.contains(referenceTag1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = referenceTag1;
      referenceTag.remove(referenceTag1);
      referenceTag1._unlinkReferenceValue(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeReferenceTag"));
      return ret;
      // -end- 39B9B0F703C8 remove_body40432B0300AE "ModelElement::removeReferenceTag"
    }

    /** tests if a given ReferenceTag is connected.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 test_head40432B0300AE "ModelElement::containsReferenceTag"
    public boolean containsReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 test_head40432B0300AE "ModelElement::containsReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 test_body40432B0300AE "ModelElement::containsReferenceTag"
      return referenceTag.contains(referenceTag1);
      // -end- 39B9B0F703C8 test_body40432B0300AE "ModelElement::containsReferenceTag"
    }

    /** used to enumerate all connected ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 get_all_head40432B0300AE "ModelElement::iteratorReferenceTag"
    public java.util.Iterator iteratorReferenceTag()
    // -end- 39B9B0F703C8 get_all_head40432B0300AE "ModelElement::iteratorReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 get_all_body40432B0300AE "ModelElement::iteratorReferenceTag"
      return referenceTag.iterator();
      // -end- 39B9B0F703C8 get_all_body40432B0300AE "ModelElement::iteratorReferenceTag"
    }

    /** disconnect all ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 remove_all_head40432B0300AE "ModelElement::clearReferenceTag"
    public void clearReferenceTag()
    // -end- 39B9B0F703C8 remove_all_head40432B0300AE "ModelElement::clearReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 remove_all_body40432B0300AE "ModelElement::clearReferenceTag"
      if(sizeReferenceTag()>0){
        for(java.util.Iterator p = referenceTag.iterator(); p.hasNext();){
          ((TaggedValue)p.next())._unlinkReferenceValue(this);
        }
        referenceTag.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearReferenceTag"));
      }
      // -end- 39B9B0F703C8 remove_all_body40432B0300AE "ModelElement::clearReferenceTag"
    }

    /** returns the number of ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 size_head40432B0300AE "ModelElement::sizeReferenceTag"
    public int sizeReferenceTag()
    // -end- 39B9B0F703C8 size_head40432B0300AE "ModelElement::sizeReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 size_body40432B0300AE "ModelElement::sizeReferenceTag"
      return referenceTag.size();
      // -end- 39B9B0F703C8 size_body40432B0300AE "ModelElement::sizeReferenceTag"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 39B9B0F703C8 _link_body40432B0300AE "ModelElement::_linkReferenceTag"
    public void _linkReferenceTag(TaggedValue referenceTag1)
    {
      referenceTag.add(referenceTag1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkReferenceTag"));
      return;
    }
    // -end- 39B9B0F703C8 _link_body40432B0300AE "ModelElement::_linkReferenceTag"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 39B9B0F703C8 _unlink_body40432B0300AE "ModelElement::_unlinkReferenceTag"
    public void _unlinkReferenceTag(TaggedValue referenceTag1)
    {
      referenceTag.remove(referenceTag1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkReferenceTag"));
      return;
    }
    // -end- 39B9B0F703C8 _unlink_body40432B0300AE "ModelElement::_unlinkReferenceTag"

    // -beg- preserve=no 33CD739B0316 code40432B0300AE "importedBy"
    private java.util.Set importedBy = new java.util.HashSet();
    // -end- 33CD739B0316 code40432B0300AE "importedBy"

    /** add a ImportedBy.
     *  
     *  @see #removeImportedBy
     *  @see #containsImportedBy
     *  @see #iteratorImportedBy
     *  @see #clearImportedBy
     *  @see #sizeImportedBy
     *  @see #iteratorImportedByLink
     *  @see #createImportedByLink
     *  @see #findImportedByLink
     */
    // -beg- preserve=no 33CD739B0316 add_head40432B0300AE "ModelElement::addImportedBy"
    public void addImportedBy(Package importedBy1)
    // -end- 33CD739B0316 add_head40432B0300AE "ModelElement::addImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 add_body40432B0300AE "ModelElement::addImportedBy"
      ElementImport linkobj=createImportedByLink();
      linkobj.setImportedBy(importedBy1);
      linkobj.setImportedElement(this);
      importedBy.add(linkobj);
      importedBy1._linkImportedElement(linkobj);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedBy"));
      return;
      // -end- 33CD739B0316 add_body40432B0300AE "ModelElement::addImportedBy"
    }

    /** add a link to a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 addlink_head40432B0300AE "ModelElement::addImportedByLink"
    public void addImportedByLink(ElementImport importedBy1)
    // -end- 33CD739B0316 addlink_head40432B0300AE "ModelElement::addImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 addlink_body40432B0300AE "ModelElement::addImportedByLink"
      importedBy1.setImportedElement(this);
      importedBy.add(importedBy1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedByLink"));
      return;
      // -end- 33CD739B0316 addlink_body40432B0300AE "ModelElement::addImportedByLink"
    }

    /** disconnect a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 remove_head40432B0300AE "ModelElement::removeImportedBy"
    public Package removeImportedBy(Package importedBy1)
    // -end- 33CD739B0316 remove_head40432B0300AE "ModelElement::removeImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 remove_body40432B0300AE "ModelElement::removeImportedBy"
      Package ret=null;
      ElementImport linkobj=findImportedByLink(importedBy1);
      if(importedBy1==null || linkobj==null){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = linkobj.getImportedBy();
      importedBy.remove(linkobj);
      ret._unlinkImportedElement(linkobj);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeImportedBy"));
      return ret;
      // -end- 33CD739B0316 remove_body40432B0300AE "ModelElement::removeImportedBy"
    }

    /** tests if a given ImportedBy is connected.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 test_head40432B0300AE "ModelElement::containsImportedBy"
    public boolean containsImportedBy(Package importedBy1)
    // -end- 33CD739B0316 test_head40432B0300AE "ModelElement::containsImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 test_body40432B0300AE "ModelElement::containsImportedBy"
      return importedBy.contains(findImportedByLink(importedBy1));
      // -end- 33CD739B0316 test_body40432B0300AE "ModelElement::containsImportedBy"
    }

    /** used to enumerate all connected ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 get_all_head40432B0300AE "ModelElement::iteratorImportedBy"
    public java.util.Iterator iteratorImportedBy()
    // -end- 33CD739B0316 get_all_head40432B0300AE "ModelElement::iteratorImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 get_all_body40432B0300AE "ModelElement::iteratorImportedBy"
      return new java.util.Iterator(){
        private java.util.Iterator i=importedBy.iterator();
        public boolean hasNext(){
          return i.hasNext();
        }
        public Object next(){
          ElementImport next=(ElementImport)i.next();
          return next.getImportedBy();
        }
        public void remove(){
          i.remove();
        }
      };
      // -end- 33CD739B0316 get_all_body40432B0300AE "ModelElement::iteratorImportedBy"
    }

    /** disconnect all ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 remove_all_head40432B0300AE "ModelElement::clearImportedBy"
    public void clearImportedBy()
    // -end- 33CD739B0316 remove_all_head40432B0300AE "ModelElement::clearImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 remove_all_body40432B0300AE "ModelElement::clearImportedBy"
      if(sizeImportedBy()>0){
        for(java.util.Iterator p = importedBy.iterator(); p.hasNext();){
          ElementImport linkobj=(ElementImport)p.next();
          linkobj.getImportedBy()._unlinkImportedElement(linkobj);
        }
        importedBy.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearImportedBy"));
      }
      // -end- 33CD739B0316 remove_all_body40432B0300AE "ModelElement::clearImportedBy"
    }

    /** returns the number of ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 size_head40432B0300AE "ModelElement::sizeImportedBy"
    public int sizeImportedBy()
    // -end- 33CD739B0316 size_head40432B0300AE "ModelElement::sizeImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 size_body40432B0300AE "ModelElement::sizeImportedBy"
      return importedBy.size();
      // -end- 33CD739B0316 size_body40432B0300AE "ModelElement::sizeImportedBy"
    }

    /** enumerate the link objects of currently connected ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 itlink_head40432B0300AE "ModelElement::getImportedByLink"
    public java.util.Iterator iteratorImportedByLink()
    // -end- 33CD739B0316 itlink_head40432B0300AE "ModelElement::getImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 itlink_body40432B0300AE "ModelElement::getImportedByLink"
      return importedBy.iterator();
      // -end- 33CD739B0316 itlink_body40432B0300AE "ModelElement::getImportedByLink"
    }

    /** create a link class for a new link to a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 createlink_head40432B0300AE "ModelElement::createImportedByLink"
    public ElementImport createImportedByLink()
    // -end- 33CD739B0316 createlink_head40432B0300AE "ModelElement::createImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 createlink_body40432B0300AE "ModelElement::createImportedByLink"
      // return new ElementImport();
      throw new java.lang.UnsupportedOperationException();
      // -end- 33CD739B0316 createlink_body40432B0300AE "ModelElement::createImportedByLink"
    }

    /** find a link object for a given ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 find_head40432B0300AE "ModelElement::findImportedByLink"
    public ElementImport findImportedByLink(Package importedBy1)
    // -end- 33CD739B0316 find_head40432B0300AE "ModelElement::findImportedByLink"
    {
        // -beg- preserve=no 33CD739B0316 find_body40432B0300AE "ModelElement::findImportedByLink"
        if(importedBy1==null) return null;
        for(java.util.Iterator p = importedBy.iterator(); p.hasNext();){
          ElementImport linkobj=(ElementImport)p.next();
          if(linkobj.getImportedBy()==importedBy1) return linkobj;
        }
        return null;
        // -end- 33CD739B0316 find_body40432B0300AE "ModelElement::findImportedByLink"
      }

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 33CD739B0316 _link_body40432B0300AE "ModelElement::_linkImportedBy"
      public void _linkImportedBy(ElementImport importedBy1)
      {
        importedBy.add(importedBy1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkImportedBy"));
        return;
      }
      // -end- 33CD739B0316 _link_body40432B0300AE "ModelElement::_linkImportedBy"

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 33CD739B0316 _unlink_body40432B0300AE "ModelElement::_unlinkImportedBy"
      public void _unlinkImportedBy(ElementImport importedBy1)
      {
        importedBy.remove(importedBy1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkImportedBy"));
        return;
      }
      // -end- 33CD739B0316 _unlink_body40432B0300AE "ModelElement::_unlinkImportedBy"

      // -beg- preserve=no 335D4BA70064 var40432B0300AE "name"
      private NlsString name = null;
      // -end- 335D4BA70064 var40432B0300AE "name"

      /** get current value of name
       *  @see #setName
       */
      // -beg- preserve=no 335D4BA70064 get_head40432B0300AE "name"
      public  NlsString getName()
      // -end- 335D4BA70064 get_head40432B0300AE "name"
      {
        // -beg- preserve=no 335D4BA70064 get_body40432B0300AE "name"
        return name;
        // -end- 335D4BA70064 get_body40432B0300AE "name"
      }

      /** set current value of name
       *  @see #getName
       */
      // -beg- preserve=no 335D4BA70064 set_head40432B0300AE "name"
      public  void setName(NlsString value1)
      // -end- 335D4BA70064 set_head40432B0300AE "name"
      {
        // -beg- preserve=no 335D4BA70064 set_body40432B0300AE "name"
        if(name!=value1 && (name==null || !name.equals(value1))){
          name = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setName"));
        }
        // -end- 335D4BA70064 set_body40432B0300AE "name"
      }

      // -beg- preserve=no 3C1DF92B0234 var40432B0300AE "documentation"
      private NlsString documentation = null;
      // -end- 3C1DF92B0234 var40432B0300AE "documentation"

      /** get current value of documentation
       *  @see #setDocumentation
       */
      // -beg- preserve=no 3C1DF92B0234 get_head40432B0300AE "documentation"
      public  NlsString getDocumentation()
      // -end- 3C1DF92B0234 get_head40432B0300AE "documentation"
      {
        // -beg- preserve=no 3C1DF92B0234 get_body40432B0300AE "documentation"
        return documentation;
        // -end- 3C1DF92B0234 get_body40432B0300AE "documentation"
      }

      /** set current value of documentation
       *  @see #getDocumentation
       */
      // -beg- preserve=no 3C1DF92B0234 set_head40432B0300AE "documentation"
      public  void setDocumentation(NlsString value1)
      // -end- 3C1DF92B0234 set_head40432B0300AE "documentation"
      {
        // -beg- preserve=no 3C1DF92B0234 set_body40432B0300AE "documentation"
        if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
          documentation = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
        }
        // -end- 3C1DF92B0234 set_body40432B0300AE "documentation"
      }

      // declare/define something only in the code
      // please fill in/modify the following section
      // -beg- preserve=no 40432B0300AE detail_end "UmlParameter"

      // -end- 40432B0300AE detail_end "UmlParameter"

    }

