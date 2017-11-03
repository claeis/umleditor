// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:10 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327D9E410186 package "StateMachine"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 327D9E410186 package "StateMachine"

// -beg- preserve=no 327D9E410186 autoimport "StateMachine"
import ch.ehi.uml1_4.foundation.core.ModelElement;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.statemachines.State;
import ch.ehi.uml1_4.behaviour.statemachines.Transition;
import ch.ehi.uml1_4.behaviour.statemachines.SubmachineState;
// -end- 327D9E410186 autoimport "StateMachine"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327D9E410186 import "StateMachine"

// -end- 327D9E410186 import "StateMachine"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:10 $
 */
<<<<<<< HEAD
public interface StateMachine extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327D9E410186 detail_begin "StateMachine"

  // -end- 327D9E410186 detail_begin "StateMachine"

  /** attaches a Context.
   *  
   *  @see #detachContext
   *  @see #getContext
   *  @see #containsContext
   */
  // -beg- preserve=no 33CF8BD500F0 attach_head327D9E410186 "StateMachine::attachContext"
  public void attachContext(ModelElement context1)
  // -end- 33CF8BD500F0 attach_head327D9E410186 "StateMachine::attachContext"
    ; // empty

  /** disconnect the currently attached Context.
   *  @see #attachContext
   */
  // -beg- preserve=no 33CF8BD500F0 detach_head327D9E410186 "StateMachine::detachContext"
  public ModelElement detachContext()
  // -end- 33CF8BD500F0 detach_head327D9E410186 "StateMachine::detachContext"
    ; // empty

  /** get the currently attached Context.
   *  @see #attachContext
   */
  // -beg- preserve=no 33CF8BD500F0 get_head327D9E410186 "StateMachine::getContext"
  public ModelElement getContext()
  // -end- 33CF8BD500F0 get_head327D9E410186 "StateMachine::getContext"
    ; // empty

  /** tests if there is a Context attached.
   *  @see #attachContext
   */
  // -beg- preserve=no 33CF8BD500F0 test_head327D9E410186 "StateMachine::containsContext"
  public boolean containsContext()
  // -end- 33CF8BD500F0 test_head327D9E410186 "StateMachine::containsContext"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF8BD500F0 _link_body327D9E410186 "StateMachine::_linkContext"
  public void _linkContext(ModelElement context1);
  // -end- 33CF8BD500F0 _link_body327D9E410186 "StateMachine::_linkContext"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF8BD500F0 _unlink_body327D9E410186 "StateMachine::_unlinkContext"
  public void _unlinkContext(ModelElement context1);
  // -end- 33CF8BD500F0 _unlink_body327D9E410186 "StateMachine::_unlinkContext"

  /** attaches a Top.
   *  
   *  @see #detachTop
   *  @see #getTop
   *  @see #containsTop
   */
  // -beg- preserve=no 33EBFA1C007A attach_head327D9E410186 "StateMachine::attachTop"
  public void attachTop(State top1)
  // -end- 33EBFA1C007A attach_head327D9E410186 "StateMachine::attachTop"
    ; // empty

  /** disconnect the currently attached Top.
   *  @see #attachTop
   */
  // -beg- preserve=no 33EBFA1C007A detach_head327D9E410186 "StateMachine::detachTop"
  public State detachTop()
  // -end- 33EBFA1C007A detach_head327D9E410186 "StateMachine::detachTop"
    ; // empty

  /** get the currently attached Top.
   *  @see #attachTop
   */
  // -beg- preserve=no 33EBFA1C007A get_head327D9E410186 "StateMachine::getTop"
  public State getTop()
  // -end- 33EBFA1C007A get_head327D9E410186 "StateMachine::getTop"
    ; // empty

  /** tests if there is a Top attached.
   *  @see #attachTop
   */
  // -beg- preserve=no 33EBFA1C007A test_head327D9E410186 "StateMachine::containsTop"
  public boolean containsTop()
  // -end- 33EBFA1C007A test_head327D9E410186 "StateMachine::containsTop"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EBFA1C007A _link_body327D9E410186 "StateMachine::_linkTop"
  public void _linkTop(State top1);
  // -end- 33EBFA1C007A _link_body327D9E410186 "StateMachine::_linkTop"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EBFA1C007A _unlink_body327D9E410186 "StateMachine::_unlinkTop"
  public void _unlinkTop(State top1);
  // -end- 33EBFA1C007A _unlink_body327D9E410186 "StateMachine::_unlinkTop"

  /** add a Transitions.
   *  
   *  @see #removeTransitions
   *  @see #containsTransitions
   *  @see #iteratorTransitions
   *  @see #clearTransitions
   *  @see #sizeTransitions
   */
  // -beg- preserve=no 3288D72700C8 add_head327D9E410186 "StateMachine::addTransitions"
  public void addTransitions(Transition transitions1)
  // -end- 3288D72700C8 add_head327D9E410186 "StateMachine::addTransitions"
    ; // empty

  /** disconnect a Transitions.
   *  @see #addTransitions
   */
  // -beg- preserve=no 3288D72700C8 remove_head327D9E410186 "StateMachine::removeTransitions"
  public Transition removeTransitions(Transition transitions1)
  // -end- 3288D72700C8 remove_head327D9E410186 "StateMachine::removeTransitions"
    ; // empty

  /** tests if a given Transitions is connected.
   *  @see #addTransitions
   */
  // -beg- preserve=no 3288D72700C8 test_head327D9E410186 "StateMachine::containsTransitions"
  public boolean containsTransitions(Transition transitions1)
  // -end- 3288D72700C8 test_head327D9E410186 "StateMachine::containsTransitions"
    ; // empty

  /** used to enumerate all connected Transitionss.
   *  @see #addTransitions
   */
  // -beg- preserve=no 3288D72700C8 get_all_head327D9E410186 "StateMachine::iteratorTransitions"
  public java.util.Iterator iteratorTransitions()
  // -end- 3288D72700C8 get_all_head327D9E410186 "StateMachine::iteratorTransitions"
    ; // empty

  /** disconnect all Transitionss.
   *  @see #addTransitions
   */
  // -beg- preserve=no 3288D72700C8 remove_all_head327D9E410186 "StateMachine::clearTransitions"
  public void clearTransitions()
  // -end- 3288D72700C8 remove_all_head327D9E410186 "StateMachine::clearTransitions"
    ; // empty

  /** returns the number of Transitionss.
   *  @see #addTransitions
   */
  // -beg- preserve=no 3288D72700C8 size_head327D9E410186 "StateMachine::sizeTransitions"
  public int sizeTransitions()
  // -end- 3288D72700C8 size_head327D9E410186 "StateMachine::sizeTransitions"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3288D72700C8 _link_body327D9E410186 "StateMachine::_linkTransitions"
  public void _linkTransitions(Transition transitions1);
  // -end- 3288D72700C8 _link_body327D9E410186 "StateMachine::_linkTransitions"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3288D72700C8 _unlink_body327D9E410186 "StateMachine::_unlinkTransitions"
  public void _unlinkTransitions(Transition transitions1);
  // -end- 3288D72700C8 _unlink_body327D9E410186 "StateMachine::_unlinkTransitions"

  /** add a SubmachineState.
   *  
   *  @see #removeSubmachineState
   *  @see #containsSubmachineState
   *  @see #iteratorSubmachineState
   *  @see #clearSubmachineState
   *  @see #sizeSubmachineState
   */
  // -beg- preserve=no 3403125E03A3 add_head327D9E410186 "StateMachine::addSubmachineState"
  public void addSubmachineState(SubmachineState submachineState1)
  // -end- 3403125E03A3 add_head327D9E410186 "StateMachine::addSubmachineState"
    ; // empty

  /** disconnect a SubmachineState.
   *  @see #addSubmachineState
   */
  // -beg- preserve=no 3403125E03A3 remove_head327D9E410186 "StateMachine::removeSubmachineState"
  public SubmachineState removeSubmachineState(SubmachineState submachineState1)
  // -end- 3403125E03A3 remove_head327D9E410186 "StateMachine::removeSubmachineState"
    ; // empty

  /** tests if a given SubmachineState is connected.
   *  @see #addSubmachineState
   */
  // -beg- preserve=no 3403125E03A3 test_head327D9E410186 "StateMachine::containsSubmachineState"
  public boolean containsSubmachineState(SubmachineState submachineState1)
  // -end- 3403125E03A3 test_head327D9E410186 "StateMachine::containsSubmachineState"
    ; // empty

  /** used to enumerate all connected SubmachineStates.
   *  @see #addSubmachineState
   */
  // -beg- preserve=no 3403125E03A3 get_all_head327D9E410186 "StateMachine::iteratorSubmachineState"
  public java.util.Iterator iteratorSubmachineState()
  // -end- 3403125E03A3 get_all_head327D9E410186 "StateMachine::iteratorSubmachineState"
    ; // empty

  /** disconnect all SubmachineStates.
   *  @see #addSubmachineState
   */
  // -beg- preserve=no 3403125E03A3 remove_all_head327D9E410186 "StateMachine::clearSubmachineState"
  public void clearSubmachineState()
  // -end- 3403125E03A3 remove_all_head327D9E410186 "StateMachine::clearSubmachineState"
    ; // empty

  /** returns the number of SubmachineStates.
   *  @see #addSubmachineState
   */
  // -beg- preserve=no 3403125E03A3 size_head327D9E410186 "StateMachine::sizeSubmachineState"
  public int sizeSubmachineState()
  // -end- 3403125E03A3 size_head327D9E410186 "StateMachine::sizeSubmachineState"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3403125E03A3 _link_body327D9E410186 "StateMachine::_linkSubmachineState"
  public void _linkSubmachineState(SubmachineState submachineState1);
  // -end- 3403125E03A3 _link_body327D9E410186 "StateMachine::_linkSubmachineState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3403125E03A3 _unlink_body327D9E410186 "StateMachine::_unlinkSubmachineState"
  public void _unlinkSubmachineState(SubmachineState submachineState1);
  // -end- 3403125E03A3 _unlink_body327D9E410186 "StateMachine::_unlinkSubmachineState"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327D9E410186 detail_end "StateMachine"

  // -end- 327D9E410186 detail_end "StateMachine"

}

=======
public interface StateMachine extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327D9E410186 detail_begin "StateMachine"

// -end- 327D9E410186 detail_begin "StateMachine"

/** attaches a Context.
 *
 *  @see #detachContext
 *  @see #getContext
 *  @see #containsContext
 */
// -beg- preserve=no 33CF8BD500F0 attach_head327D9E410186 "StateMachine::attachContext"
public void attachContext(ModelElement context1)
// -end- 33CF8BD500F0 attach_head327D9E410186 "StateMachine::attachContext"
;     // empty

/** disconnect the currently attached Context.
 *  @see #attachContext
 */
// -beg- preserve=no 33CF8BD500F0 detach_head327D9E410186 "StateMachine::detachContext"
public ModelElement detachContext()
// -end- 33CF8BD500F0 detach_head327D9E410186 "StateMachine::detachContext"
;     // empty

/** get the currently attached Context.
 *  @see #attachContext
 */
// -beg- preserve=no 33CF8BD500F0 get_head327D9E410186 "StateMachine::getContext"
public ModelElement getContext()
// -end- 33CF8BD500F0 get_head327D9E410186 "StateMachine::getContext"
;     // empty

/** tests if there is a Context attached.
 *  @see #attachContext
 */
// -beg- preserve=no 33CF8BD500F0 test_head327D9E410186 "StateMachine::containsContext"
public boolean containsContext()
// -end- 33CF8BD500F0 test_head327D9E410186 "StateMachine::containsContext"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF8BD500F0 _link_body327D9E410186 "StateMachine::_linkContext"
public void _linkContext(ModelElement context1);
// -end- 33CF8BD500F0 _link_body327D9E410186 "StateMachine::_linkContext"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF8BD500F0 _unlink_body327D9E410186 "StateMachine::_unlinkContext"
public void _unlinkContext(ModelElement context1);
// -end- 33CF8BD500F0 _unlink_body327D9E410186 "StateMachine::_unlinkContext"

/** attaches a Top.
 *
 *  @see #detachTop
 *  @see #getTop
 *  @see #containsTop
 */
// -beg- preserve=no 33EBFA1C007A attach_head327D9E410186 "StateMachine::attachTop"
public void attachTop(State top1)
// -end- 33EBFA1C007A attach_head327D9E410186 "StateMachine::attachTop"
;     // empty

/** disconnect the currently attached Top.
 *  @see #attachTop
 */
// -beg- preserve=no 33EBFA1C007A detach_head327D9E410186 "StateMachine::detachTop"
public State detachTop()
// -end- 33EBFA1C007A detach_head327D9E410186 "StateMachine::detachTop"
;     // empty

/** get the currently attached Top.
 *  @see #attachTop
 */
// -beg- preserve=no 33EBFA1C007A get_head327D9E410186 "StateMachine::getTop"
public State getTop()
// -end- 33EBFA1C007A get_head327D9E410186 "StateMachine::getTop"
;     // empty

/** tests if there is a Top attached.
 *  @see #attachTop
 */
// -beg- preserve=no 33EBFA1C007A test_head327D9E410186 "StateMachine::containsTop"
public boolean containsTop()
// -end- 33EBFA1C007A test_head327D9E410186 "StateMachine::containsTop"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33EBFA1C007A _link_body327D9E410186 "StateMachine::_linkTop"
public void _linkTop(State top1);
// -end- 33EBFA1C007A _link_body327D9E410186 "StateMachine::_linkTop"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33EBFA1C007A _unlink_body327D9E410186 "StateMachine::_unlinkTop"
public void _unlinkTop(State top1);
// -end- 33EBFA1C007A _unlink_body327D9E410186 "StateMachine::_unlinkTop"

/** add a Transitions.
 *
 *  @see #removeTransitions
 *  @see #containsTransitions
 *  @see #iteratorTransitions
 *  @see #clearTransitions
 *  @see #sizeTransitions
 */
// -beg- preserve=no 3288D72700C8 add_head327D9E410186 "StateMachine::addTransitions"
public void addTransitions(Transition transitions1)
// -end- 3288D72700C8 add_head327D9E410186 "StateMachine::addTransitions"
;     // empty

/** disconnect a Transitions.
 *  @see #addTransitions
 */
// -beg- preserve=no 3288D72700C8 remove_head327D9E410186 "StateMachine::removeTransitions"
public Transition removeTransitions(Transition transitions1)
// -end- 3288D72700C8 remove_head327D9E410186 "StateMachine::removeTransitions"
;     // empty

/** tests if a given Transitions is connected.
 *  @see #addTransitions
 */
// -beg- preserve=no 3288D72700C8 test_head327D9E410186 "StateMachine::containsTransitions"
public boolean containsTransitions(Transition transitions1)
// -end- 3288D72700C8 test_head327D9E410186 "StateMachine::containsTransitions"
;     // empty

/** used to enumerate all connected Transitionss.
 *  @see #addTransitions
 */
// -beg- preserve=no 3288D72700C8 get_all_head327D9E410186 "StateMachine::iteratorTransitions"
public Iterator<?> iteratorTransitions()
// -end- 3288D72700C8 get_all_head327D9E410186 "StateMachine::iteratorTransitions"
;     // empty

/** disconnect all Transitionss.
 *  @see #addTransitions
 */
// -beg- preserve=no 3288D72700C8 remove_all_head327D9E410186 "StateMachine::clearTransitions"
public void clearTransitions()
// -end- 3288D72700C8 remove_all_head327D9E410186 "StateMachine::clearTransitions"
;     // empty

/** returns the number of Transitionss.
 *  @see #addTransitions
 */
// -beg- preserve=no 3288D72700C8 size_head327D9E410186 "StateMachine::sizeTransitions"
public int sizeTransitions()
// -end- 3288D72700C8 size_head327D9E410186 "StateMachine::sizeTransitions"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288D72700C8 _link_body327D9E410186 "StateMachine::_linkTransitions"
public void _linkTransitions(Transition transitions1);
// -end- 3288D72700C8 _link_body327D9E410186 "StateMachine::_linkTransitions"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288D72700C8 _unlink_body327D9E410186 "StateMachine::_unlinkTransitions"
public void _unlinkTransitions(Transition transitions1);
// -end- 3288D72700C8 _unlink_body327D9E410186 "StateMachine::_unlinkTransitions"

/** add a SubmachineState.
 *
 *  @see #removeSubmachineState
 *  @see #containsSubmachineState
 *  @see #iteratorSubmachineState
 *  @see #clearSubmachineState
 *  @see #sizeSubmachineState
 */
// -beg- preserve=no 3403125E03A3 add_head327D9E410186 "StateMachine::addSubmachineState"
public void addSubmachineState(SubmachineState submachineState1)
// -end- 3403125E03A3 add_head327D9E410186 "StateMachine::addSubmachineState"
;     // empty

/** disconnect a SubmachineState.
 *  @see #addSubmachineState
 */
// -beg- preserve=no 3403125E03A3 remove_head327D9E410186 "StateMachine::removeSubmachineState"
public SubmachineState removeSubmachineState(SubmachineState submachineState1)
// -end- 3403125E03A3 remove_head327D9E410186 "StateMachine::removeSubmachineState"
;     // empty

/** tests if a given SubmachineState is connected.
 *  @see #addSubmachineState
 */
// -beg- preserve=no 3403125E03A3 test_head327D9E410186 "StateMachine::containsSubmachineState"
public boolean containsSubmachineState(SubmachineState submachineState1)
// -end- 3403125E03A3 test_head327D9E410186 "StateMachine::containsSubmachineState"
;     // empty

/** used to enumerate all connected SubmachineStates.
 *  @see #addSubmachineState
 */
// -beg- preserve=no 3403125E03A3 get_all_head327D9E410186 "StateMachine::iteratorSubmachineState"
public Iterator<?> iteratorSubmachineState()
// -end- 3403125E03A3 get_all_head327D9E410186 "StateMachine::iteratorSubmachineState"
;     // empty

/** disconnect all SubmachineStates.
 *  @see #addSubmachineState
 */
// -beg- preserve=no 3403125E03A3 remove_all_head327D9E410186 "StateMachine::clearSubmachineState"
public void clearSubmachineState()
// -end- 3403125E03A3 remove_all_head327D9E410186 "StateMachine::clearSubmachineState"
;     // empty

/** returns the number of SubmachineStates.
 *  @see #addSubmachineState
 */
// -beg- preserve=no 3403125E03A3 size_head327D9E410186 "StateMachine::sizeSubmachineState"
public int sizeSubmachineState()
// -end- 3403125E03A3 size_head327D9E410186 "StateMachine::sizeSubmachineState"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3403125E03A3 _link_body327D9E410186 "StateMachine::_linkSubmachineState"
public void _linkSubmachineState(SubmachineState submachineState1);
// -end- 3403125E03A3 _link_body327D9E410186 "StateMachine::_linkSubmachineState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3403125E03A3 _unlink_body327D9E410186 "StateMachine::_unlinkSubmachineState"
public void _unlinkSubmachineState(SubmachineState submachineState1);
// -end- 3403125E03A3 _unlink_body327D9E410186 "StateMachine::_unlinkSubmachineState"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327D9E410186 detail_end "StateMachine"

// -end- 327D9E410186 detail_end "StateMachine"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
