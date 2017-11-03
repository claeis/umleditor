// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:41 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327BBB9F02B2 package "Parameter"
package ch.ehi.uml1_4.foundation.core;
// -end- 327BBB9F02B2 package "Parameter"

<<<<<<< HEAD
// -beg- preserve=no 327BBB9F02B2 autoimport "Parameter"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.foundation.core.BehavioralFeature;
import ch.ehi.uml1_4.foundation.datatypes.Expression;
import ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind;
// -end- 327BBB9F02B2 autoimport "Parameter"
=======
import java.util.Iterator;

import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.foundation.datatypes.Expression;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327BBB9F02B2 import "Parameter"

// -end- 327BBB9F02B2 import "Parameter"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:41 $
 */
<<<<<<< HEAD
public interface Parameter extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327BBB9F02B2 detail_begin "Parameter"

  // -end- 327BBB9F02B2 detail_begin "Parameter"

  /** attaches a Event.
   *  
   *  @see #detachEvent
   *  @see #getEvent
   *  @see #containsEvent
   */
  // -beg- preserve=no 3337AF9D028B attach_head327BBB9F02B2 "Parameter::attachEvent"
  public void attachEvent(Event event1)
  // -end- 3337AF9D028B attach_head327BBB9F02B2 "Parameter::attachEvent"
    ; // empty

  /** disconnect the currently attached Event.
   *  @see #attachEvent
   */
  // -beg- preserve=no 3337AF9D028B detach_head327BBB9F02B2 "Parameter::detachEvent"
  public Event detachEvent()
  // -end- 3337AF9D028B detach_head327BBB9F02B2 "Parameter::detachEvent"
    ; // empty

  /** get the currently attached Event.
   *  @see #attachEvent
   */
  // -beg- preserve=no 3337AF9D028B get_head327BBB9F02B2 "Parameter::getEvent"
  public Event getEvent()
  // -end- 3337AF9D028B get_head327BBB9F02B2 "Parameter::getEvent"
    ; // empty

  /** tests if there is a Event attached.
   *  @see #attachEvent
   */
  // -beg- preserve=no 3337AF9D028B test_head327BBB9F02B2 "Parameter::containsEvent"
  public boolean containsEvent()
  // -end- 3337AF9D028B test_head327BBB9F02B2 "Parameter::containsEvent"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3337AF9D028B _link_body327BBB9F02B2 "Parameter::_linkEvent"
  public void _linkEvent(Event event1);
  // -end- 3337AF9D028B _link_body327BBB9F02B2 "Parameter::_linkEvent"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3337AF9D028B _unlink_body327BBB9F02B2 "Parameter::_unlinkEvent"
  public void _unlinkEvent(Event event1);
  // -end- 3337AF9D028B _unlink_body327BBB9F02B2 "Parameter::_unlinkEvent"

  /** add a ObjectFlowState.
   *  
   *  @see #removeObjectFlowState
   *  @see #containsObjectFlowState
   *  @see #iteratorObjectFlowState
   *  @see #clearObjectFlowState
   *  @see #sizeObjectFlowState
   */
  // -beg- preserve=no 337D935E0213 add_head327BBB9F02B2 "Parameter::addObjectFlowState"
  public void addObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 337D935E0213 add_head327BBB9F02B2 "Parameter::addObjectFlowState"
    ; // empty

  /** disconnect a ObjectFlowState.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 337D935E0213 remove_head327BBB9F02B2 "Parameter::removeObjectFlowState"
  public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 337D935E0213 remove_head327BBB9F02B2 "Parameter::removeObjectFlowState"
    ; // empty

  /** tests if a given ObjectFlowState is connected.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 337D935E0213 test_head327BBB9F02B2 "Parameter::containsObjectFlowState"
  public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 337D935E0213 test_head327BBB9F02B2 "Parameter::containsObjectFlowState"
    ; // empty

  /** used to enumerate all connected ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 337D935E0213 get_all_head327BBB9F02B2 "Parameter::iteratorObjectFlowState"
  public java.util.Iterator iteratorObjectFlowState()
  // -end- 337D935E0213 get_all_head327BBB9F02B2 "Parameter::iteratorObjectFlowState"
    ; // empty

  /** disconnect all ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 337D935E0213 remove_all_head327BBB9F02B2 "Parameter::clearObjectFlowState"
  public void clearObjectFlowState()
  // -end- 337D935E0213 remove_all_head327BBB9F02B2 "Parameter::clearObjectFlowState"
    ; // empty

  /** returns the number of ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 337D935E0213 size_head327BBB9F02B2 "Parameter::sizeObjectFlowState"
  public int sizeObjectFlowState()
  // -end- 337D935E0213 size_head327BBB9F02B2 "Parameter::sizeObjectFlowState"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 337D935E0213 _link_body327BBB9F02B2 "Parameter::_linkObjectFlowState"
  public void _linkObjectFlowState(ObjectFlowState objectFlowState1);
  // -end- 337D935E0213 _link_body327BBB9F02B2 "Parameter::_linkObjectFlowState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 337D935E0213 _unlink_body327BBB9F02B2 "Parameter::_unlinkObjectFlowState"
  public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1);
  // -end- 337D935E0213 _unlink_body327BBB9F02B2 "Parameter::_unlinkObjectFlowState"

  /** add a State.
   *  
   *  @see #removeState
   *  @see #containsState
   *  @see #iteratorState
   *  @see #clearState
   *  @see #sizeState
   */
  // -beg- preserve=no 36462DDF008C add_head327BBB9F02B2 "Parameter::addState"
  public void addState(ObjectFlowState state1)
  // -end- 36462DDF008C add_head327BBB9F02B2 "Parameter::addState"
    ; // empty

  /** disconnect a State.
   *  @see #addState
   */
  // -beg- preserve=no 36462DDF008C remove_head327BBB9F02B2 "Parameter::removeState"
  public ObjectFlowState removeState(ObjectFlowState state1)
  // -end- 36462DDF008C remove_head327BBB9F02B2 "Parameter::removeState"
    ; // empty

  /** tests if a given State is connected.
   *  @see #addState
   */
  // -beg- preserve=no 36462DDF008C test_head327BBB9F02B2 "Parameter::containsState"
  public boolean containsState(ObjectFlowState state1)
  // -end- 36462DDF008C test_head327BBB9F02B2 "Parameter::containsState"
    ; // empty

  /** used to enumerate all connected States.
   *  @see #addState
   */
  // -beg- preserve=no 36462DDF008C get_all_head327BBB9F02B2 "Parameter::iteratorState"
  public java.util.Iterator iteratorState()
  // -end- 36462DDF008C get_all_head327BBB9F02B2 "Parameter::iteratorState"
    ; // empty

  /** disconnect all States.
   *  @see #addState
   */
  // -beg- preserve=no 36462DDF008C remove_all_head327BBB9F02B2 "Parameter::clearState"
  public void clearState()
  // -end- 36462DDF008C remove_all_head327BBB9F02B2 "Parameter::clearState"
    ; // empty

  /** returns the number of States.
   *  @see #addState
   */
  // -beg- preserve=no 36462DDF008C size_head327BBB9F02B2 "Parameter::sizeState"
  public int sizeState()
  // -end- 36462DDF008C size_head327BBB9F02B2 "Parameter::sizeState"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36462DDF008C _link_body327BBB9F02B2 "Parameter::_linkState"
  public void _linkState(ObjectFlowState state1);
  // -end- 36462DDF008C _link_body327BBB9F02B2 "Parameter::_linkState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36462DDF008C _unlink_body327BBB9F02B2 "Parameter::_unlinkState"
  public void _unlinkState(ObjectFlowState state1);
  // -end- 36462DDF008C _unlink_body327BBB9F02B2 "Parameter::_unlinkState"

  /** attaches a BehavioralFeature.
   *  
   *  @see #detachBehavioralFeature
   *  @see #getBehavioralFeature
   *  @see #containsBehavioralFeature
   */
  // -beg- preserve=no 3359946401AE attach_head327BBB9F02B2 "Parameter::attachBehavioralFeature"
  public void attachBehavioralFeature(BehavioralFeature behavioralFeature1)
  // -end- 3359946401AE attach_head327BBB9F02B2 "Parameter::attachBehavioralFeature"
    ; // empty

  /** disconnect the currently attached BehavioralFeature.
   *  @see #attachBehavioralFeature
   */
  // -beg- preserve=no 3359946401AE detach_head327BBB9F02B2 "Parameter::detachBehavioralFeature"
  public BehavioralFeature detachBehavioralFeature()
  // -end- 3359946401AE detach_head327BBB9F02B2 "Parameter::detachBehavioralFeature"
    ; // empty

  /** get the currently attached BehavioralFeature.
   *  @see #attachBehavioralFeature
   */
  // -beg- preserve=no 3359946401AE get_head327BBB9F02B2 "Parameter::getBehavioralFeature"
  public BehavioralFeature getBehavioralFeature()
  // -end- 3359946401AE get_head327BBB9F02B2 "Parameter::getBehavioralFeature"
    ; // empty

  /** tests if there is a BehavioralFeature attached.
   *  @see #attachBehavioralFeature
   */
  // -beg- preserve=no 3359946401AE test_head327BBB9F02B2 "Parameter::containsBehavioralFeature"
  public boolean containsBehavioralFeature()
  // -end- 3359946401AE test_head327BBB9F02B2 "Parameter::containsBehavioralFeature"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3359946401AE _link_body327BBB9F02B2 "Parameter::_linkBehavioralFeature"
  public void _linkBehavioralFeature(BehavioralFeature behavioralFeature1);
  // -end- 3359946401AE _link_body327BBB9F02B2 "Parameter::_linkBehavioralFeature"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3359946401AE _unlink_body327BBB9F02B2 "Parameter::_unlinkBehavioralFeature"
  public void _unlinkBehavioralFeature(BehavioralFeature behavioralFeature1);
  // -end- 3359946401AE _unlink_body327BBB9F02B2 "Parameter::_unlinkBehavioralFeature"

  /** get current value of defaultValue
   *  @see #setDefaultValue
   */
  // -beg- preserve=no 327BE04D0096 get_head327BBB9F02B2 "defaultValue"
   Expression getDefaultValue()
  // -end- 327BE04D0096 get_head327BBB9F02B2 "defaultValue"
    ; // empty
  /** set current value of defaultValue
   *  @see #getDefaultValue
   */
  // -beg- preserve=no 327BE04D0096 set_head327BBB9F02B2 "defaultValue"
   void setDefaultValue(Expression value1)
  // -end- 327BE04D0096 set_head327BBB9F02B2 "defaultValue"
    ; // empty
  /** get current value of kind
   *  @see ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind
   *  @see #setKind
   */
  // -beg- preserve=no 335BC753038E get_head327BBB9F02B2 "kind"
   int getKind()
  // -end- 335BC753038E get_head327BBB9F02B2 "kind"
    ; // empty
  /** set current value of kind
   *  @see ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind
   *  @see #getKind
   */
  // -beg- preserve=no 335BC753038E set_head327BBB9F02B2 "kind"
   void setKind(int value1)
  // -end- 335BC753038E set_head327BBB9F02B2 "kind"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327BBB9F02B2 detail_end "Parameter"

  // -end- 327BBB9F02B2 detail_end "Parameter"

}

=======
public interface Parameter extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327BBB9F02B2 detail_begin "Parameter"

// -end- 327BBB9F02B2 detail_begin "Parameter"

/** attaches a Event.
 *
 *  @see #detachEvent
 *  @see #getEvent
 *  @see #containsEvent
 */
// -beg- preserve=no 3337AF9D028B attach_head327BBB9F02B2 "Parameter::attachEvent"
public void attachEvent(Event event1)
// -end- 3337AF9D028B attach_head327BBB9F02B2 "Parameter::attachEvent"
;     // empty

/** disconnect the currently attached Event.
 *  @see #attachEvent
 */
// -beg- preserve=no 3337AF9D028B detach_head327BBB9F02B2 "Parameter::detachEvent"
public Event detachEvent()
// -end- 3337AF9D028B detach_head327BBB9F02B2 "Parameter::detachEvent"
;     // empty

/** get the currently attached Event.
 *  @see #attachEvent
 */
// -beg- preserve=no 3337AF9D028B get_head327BBB9F02B2 "Parameter::getEvent"
public Event getEvent()
// -end- 3337AF9D028B get_head327BBB9F02B2 "Parameter::getEvent"
;     // empty

/** tests if there is a Event attached.
 *  @see #attachEvent
 */
// -beg- preserve=no 3337AF9D028B test_head327BBB9F02B2 "Parameter::containsEvent"
public boolean containsEvent()
// -end- 3337AF9D028B test_head327BBB9F02B2 "Parameter::containsEvent"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3337AF9D028B _link_body327BBB9F02B2 "Parameter::_linkEvent"
public void _linkEvent(Event event1);
// -end- 3337AF9D028B _link_body327BBB9F02B2 "Parameter::_linkEvent"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3337AF9D028B _unlink_body327BBB9F02B2 "Parameter::_unlinkEvent"
public void _unlinkEvent(Event event1);
// -end- 3337AF9D028B _unlink_body327BBB9F02B2 "Parameter::_unlinkEvent"

/** add a ObjectFlowState.
 *
 *  @see #removeObjectFlowState
 *  @see #containsObjectFlowState
 *  @see #iteratorObjectFlowState
 *  @see #clearObjectFlowState
 *  @see #sizeObjectFlowState
 */
// -beg- preserve=no 337D935E0213 add_head327BBB9F02B2 "Parameter::addObjectFlowState"
public void addObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 337D935E0213 add_head327BBB9F02B2 "Parameter::addObjectFlowState"
;     // empty

/** disconnect a ObjectFlowState.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 remove_head327BBB9F02B2 "Parameter::removeObjectFlowState"
public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 337D935E0213 remove_head327BBB9F02B2 "Parameter::removeObjectFlowState"
;     // empty

/** tests if a given ObjectFlowState is connected.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 test_head327BBB9F02B2 "Parameter::containsObjectFlowState"
public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 337D935E0213 test_head327BBB9F02B2 "Parameter::containsObjectFlowState"
;     // empty

/** used to enumerate all connected ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 get_all_head327BBB9F02B2 "Parameter::iteratorObjectFlowState"
public Iterator<?> iteratorObjectFlowState()
// -end- 337D935E0213 get_all_head327BBB9F02B2 "Parameter::iteratorObjectFlowState"
;     // empty

/** disconnect all ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 remove_all_head327BBB9F02B2 "Parameter::clearObjectFlowState"
public void clearObjectFlowState()
// -end- 337D935E0213 remove_all_head327BBB9F02B2 "Parameter::clearObjectFlowState"
;     // empty

/** returns the number of ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 337D935E0213 size_head327BBB9F02B2 "Parameter::sizeObjectFlowState"
public int sizeObjectFlowState()
// -end- 337D935E0213 size_head327BBB9F02B2 "Parameter::sizeObjectFlowState"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 337D935E0213 _link_body327BBB9F02B2 "Parameter::_linkObjectFlowState"
public void _linkObjectFlowState(ObjectFlowState objectFlowState1);
// -end- 337D935E0213 _link_body327BBB9F02B2 "Parameter::_linkObjectFlowState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 337D935E0213 _unlink_body327BBB9F02B2 "Parameter::_unlinkObjectFlowState"
public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1);
// -end- 337D935E0213 _unlink_body327BBB9F02B2 "Parameter::_unlinkObjectFlowState"

/** add a State.
 *
 *  @see #removeState
 *  @see #containsState
 *  @see #iteratorState
 *  @see #clearState
 *  @see #sizeState
 */
// -beg- preserve=no 36462DDF008C add_head327BBB9F02B2 "Parameter::addState"
public void addState(ObjectFlowState state1)
// -end- 36462DDF008C add_head327BBB9F02B2 "Parameter::addState"
;     // empty

/** disconnect a State.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C remove_head327BBB9F02B2 "Parameter::removeState"
public ObjectFlowState removeState(ObjectFlowState state1)
// -end- 36462DDF008C remove_head327BBB9F02B2 "Parameter::removeState"
;     // empty

/** tests if a given State is connected.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C test_head327BBB9F02B2 "Parameter::containsState"
public boolean containsState(ObjectFlowState state1)
// -end- 36462DDF008C test_head327BBB9F02B2 "Parameter::containsState"
;     // empty

/** used to enumerate all connected States.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C get_all_head327BBB9F02B2 "Parameter::iteratorState"
public Iterator<?> iteratorState()
// -end- 36462DDF008C get_all_head327BBB9F02B2 "Parameter::iteratorState"
;     // empty

/** disconnect all States.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C remove_all_head327BBB9F02B2 "Parameter::clearState"
public void clearState()
// -end- 36462DDF008C remove_all_head327BBB9F02B2 "Parameter::clearState"
;     // empty

/** returns the number of States.
 *  @see #addState
 */
// -beg- preserve=no 36462DDF008C size_head327BBB9F02B2 "Parameter::sizeState"
public int sizeState()
// -end- 36462DDF008C size_head327BBB9F02B2 "Parameter::sizeState"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36462DDF008C _link_body327BBB9F02B2 "Parameter::_linkState"
public void _linkState(ObjectFlowState state1);
// -end- 36462DDF008C _link_body327BBB9F02B2 "Parameter::_linkState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36462DDF008C _unlink_body327BBB9F02B2 "Parameter::_unlinkState"
public void _unlinkState(ObjectFlowState state1);
// -end- 36462DDF008C _unlink_body327BBB9F02B2 "Parameter::_unlinkState"

/** attaches a BehavioralFeature.
 *
 *  @see #detachBehavioralFeature
 *  @see #getBehavioralFeature
 *  @see #containsBehavioralFeature
 */
// -beg- preserve=no 3359946401AE attach_head327BBB9F02B2 "Parameter::attachBehavioralFeature"
public void attachBehavioralFeature(BehavioralFeature behavioralFeature1)
// -end- 3359946401AE attach_head327BBB9F02B2 "Parameter::attachBehavioralFeature"
;     // empty

/** disconnect the currently attached BehavioralFeature.
 *  @see #attachBehavioralFeature
 */
// -beg- preserve=no 3359946401AE detach_head327BBB9F02B2 "Parameter::detachBehavioralFeature"
public BehavioralFeature detachBehavioralFeature()
// -end- 3359946401AE detach_head327BBB9F02B2 "Parameter::detachBehavioralFeature"
;     // empty

/** get the currently attached BehavioralFeature.
 *  @see #attachBehavioralFeature
 */
// -beg- preserve=no 3359946401AE get_head327BBB9F02B2 "Parameter::getBehavioralFeature"
public BehavioralFeature getBehavioralFeature()
// -end- 3359946401AE get_head327BBB9F02B2 "Parameter::getBehavioralFeature"
;     // empty

/** tests if there is a BehavioralFeature attached.
 *  @see #attachBehavioralFeature
 */
// -beg- preserve=no 3359946401AE test_head327BBB9F02B2 "Parameter::containsBehavioralFeature"
public boolean containsBehavioralFeature()
// -end- 3359946401AE test_head327BBB9F02B2 "Parameter::containsBehavioralFeature"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3359946401AE _link_body327BBB9F02B2 "Parameter::_linkBehavioralFeature"
public void _linkBehavioralFeature(BehavioralFeature behavioralFeature1);
// -end- 3359946401AE _link_body327BBB9F02B2 "Parameter::_linkBehavioralFeature"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3359946401AE _unlink_body327BBB9F02B2 "Parameter::_unlinkBehavioralFeature"
public void _unlinkBehavioralFeature(BehavioralFeature behavioralFeature1);
// -end- 3359946401AE _unlink_body327BBB9F02B2 "Parameter::_unlinkBehavioralFeature"

/** get current value of defaultValue
 *  @see #setDefaultValue
 */
// -beg- preserve=no 327BE04D0096 get_head327BBB9F02B2 "defaultValue"
Expression getDefaultValue()
// -end- 327BE04D0096 get_head327BBB9F02B2 "defaultValue"
;     // empty
/** set current value of defaultValue
 *  @see #getDefaultValue
 */
// -beg- preserve=no 327BE04D0096 set_head327BBB9F02B2 "defaultValue"
void setDefaultValue(Expression value1)
// -end- 327BE04D0096 set_head327BBB9F02B2 "defaultValue"
;     // empty
/** get current value of kind
 *  @see ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind
 *  @see #setKind
 */
// -beg- preserve=no 335BC753038E get_head327BBB9F02B2 "kind"
int getKind()
// -end- 335BC753038E get_head327BBB9F02B2 "kind"
;     // empty
/** set current value of kind
 *  @see ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind
 *  @see #getKind
 */
// -beg- preserve=no 335BC753038E set_head327BBB9F02B2 "kind"
void setKind(int value1)
// -end- 335BC753038E set_head327BBB9F02B2 "kind"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327BBB9F02B2 detail_end "Parameter"

// -end- 327BBB9F02B2 detail_end "Parameter"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
