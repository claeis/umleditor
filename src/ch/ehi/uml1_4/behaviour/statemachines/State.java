// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:09 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3287F81C0136 package "State"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 3287F81C0136 package "State"

// -beg- preserve=no 3287F81C0136 autoimport "State"
import ch.ehi.uml1_4.behaviour.statemachines.StateVertex;
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.behaviour.statemachines.Transition;
// -end- 3287F81C0136 autoimport "State"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3287F81C0136 import "State"

// -end- 3287F81C0136 import "State"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:09 $
 */
public interface State extends StateVertex , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3287F81C0136 detail_begin "State"

  // -end- 3287F81C0136 detail_begin "State"

  /** attaches a Entry.
   *  
   *  @see #detachEntry
   *  @see #getEntry
   *  @see #containsEntry
   */
  // -beg- preserve=no 33377C0F0186 attach_head3287F81C0136 "State::attachEntry"
  public void attachEntry(Action entry1)
  // -end- 33377C0F0186 attach_head3287F81C0136 "State::attachEntry"
    ; // empty

  /** disconnect the currently attached Entry.
   *  @see #attachEntry
   */
  // -beg- preserve=no 33377C0F0186 detach_head3287F81C0136 "State::detachEntry"
  public Action detachEntry()
  // -end- 33377C0F0186 detach_head3287F81C0136 "State::detachEntry"
    ; // empty

  /** get the currently attached Entry.
   *  @see #attachEntry
   */
  // -beg- preserve=no 33377C0F0186 get_head3287F81C0136 "State::getEntry"
  public Action getEntry()
  // -end- 33377C0F0186 get_head3287F81C0136 "State::getEntry"
    ; // empty

  /** tests if there is a Entry attached.
   *  @see #attachEntry
   */
  // -beg- preserve=no 33377C0F0186 test_head3287F81C0136 "State::containsEntry"
  public boolean containsEntry()
  // -end- 33377C0F0186 test_head3287F81C0136 "State::containsEntry"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33377C0F0186 _link_body3287F81C0136 "State::_linkEntry"
  public void _linkEntry(Action entry1);
  // -end- 33377C0F0186 _link_body3287F81C0136 "State::_linkEntry"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33377C0F0186 _unlink_body3287F81C0136 "State::_unlinkEntry"
  public void _unlinkEntry(Action entry1);
  // -end- 33377C0F0186 _unlink_body3287F81C0136 "State::_unlinkEntry"

  /** attaches a Exit.
   *  
   *  @see #detachExit
   *  @see #getExit
   *  @see #containsExit
   */
  // -beg- preserve=no 333784BC0050 attach_head3287F81C0136 "State::attachExit"
  public void attachExit(Action exit1)
  // -end- 333784BC0050 attach_head3287F81C0136 "State::attachExit"
    ; // empty

  /** disconnect the currently attached Exit.
   *  @see #attachExit
   */
  // -beg- preserve=no 333784BC0050 detach_head3287F81C0136 "State::detachExit"
  public Action detachExit()
  // -end- 333784BC0050 detach_head3287F81C0136 "State::detachExit"
    ; // empty

  /** get the currently attached Exit.
   *  @see #attachExit
   */
  // -beg- preserve=no 333784BC0050 get_head3287F81C0136 "State::getExit"
  public Action getExit()
  // -end- 333784BC0050 get_head3287F81C0136 "State::getExit"
    ; // empty

  /** tests if there is a Exit attached.
   *  @see #attachExit
   */
  // -beg- preserve=no 333784BC0050 test_head3287F81C0136 "State::containsExit"
  public boolean containsExit()
  // -end- 333784BC0050 test_head3287F81C0136 "State::containsExit"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 333784BC0050 _link_body3287F81C0136 "State::_linkExit"
  public void _linkExit(Action exit1);
  // -end- 333784BC0050 _link_body3287F81C0136 "State::_linkExit"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 333784BC0050 _unlink_body3287F81C0136 "State::_unlinkExit"
  public void _unlinkExit(Action exit1);
  // -end- 333784BC0050 _unlink_body3287F81C0136 "State::_unlinkExit"

  /** add a ClassifierInState.
   *  
   *  @see #removeClassifierInState
   *  @see #containsClassifierInState
   *  @see #iteratorClassifierInState
   *  @see #clearClassifierInState
   *  @see #sizeClassifierInState
   */
  // -beg- preserve=no 33CF9AE0026D add_head3287F81C0136 "State::addClassifierInState"
  public void addClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9AE0026D add_head3287F81C0136 "State::addClassifierInState"
    ; // empty

  /** disconnect a ClassifierInState.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9AE0026D remove_head3287F81C0136 "State::removeClassifierInState"
  public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9AE0026D remove_head3287F81C0136 "State::removeClassifierInState"
    ; // empty

  /** tests if a given ClassifierInState is connected.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9AE0026D test_head3287F81C0136 "State::containsClassifierInState"
  public boolean containsClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9AE0026D test_head3287F81C0136 "State::containsClassifierInState"
    ; // empty

  /** used to enumerate all connected ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9AE0026D get_all_head3287F81C0136 "State::iteratorClassifierInState"
  public java.util.Iterator iteratorClassifierInState()
  // -end- 33CF9AE0026D get_all_head3287F81C0136 "State::iteratorClassifierInState"
    ; // empty

  /** disconnect all ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9AE0026D remove_all_head3287F81C0136 "State::clearClassifierInState"
  public void clearClassifierInState()
  // -end- 33CF9AE0026D remove_all_head3287F81C0136 "State::clearClassifierInState"
    ; // empty

  /** returns the number of ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9AE0026D size_head3287F81C0136 "State::sizeClassifierInState"
  public int sizeClassifierInState()
  // -end- 33CF9AE0026D size_head3287F81C0136 "State::sizeClassifierInState"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9AE0026D _link_body3287F81C0136 "State::_linkClassifierInState"
  public void _linkClassifierInState(ClassifierInState classifierInState1);
  // -end- 33CF9AE0026D _link_body3287F81C0136 "State::_linkClassifierInState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9AE0026D _unlink_body3287F81C0136 "State::_unlinkClassifierInState"
  public void _unlinkClassifierInState(ClassifierInState classifierInState1);
  // -end- 33CF9AE0026D _unlink_body3287F81C0136 "State::_unlinkClassifierInState"

  /** attaches a StateMachine.
   *  
   *  @see #detachStateMachine
   *  @see #getStateMachine
   *  @see #containsStateMachine
   */
  // -beg- preserve=no 33EBFA1C0079 attach_head3287F81C0136 "State::attachStateMachine"
  public void attachStateMachine(StateMachine stateMachine1)
  // -end- 33EBFA1C0079 attach_head3287F81C0136 "State::attachStateMachine"
    ; // empty

  /** disconnect the currently attached StateMachine.
   *  @see #attachStateMachine
   */
  // -beg- preserve=no 33EBFA1C0079 detach_head3287F81C0136 "State::detachStateMachine"
  public StateMachine detachStateMachine()
  // -end- 33EBFA1C0079 detach_head3287F81C0136 "State::detachStateMachine"
    ; // empty

  /** get the currently attached StateMachine.
   *  @see #attachStateMachine
   */
  // -beg- preserve=no 33EBFA1C0079 get_head3287F81C0136 "State::getStateMachine"
  public StateMachine getStateMachine()
  // -end- 33EBFA1C0079 get_head3287F81C0136 "State::getStateMachine"
    ; // empty

  /** tests if there is a StateMachine attached.
   *  @see #attachStateMachine
   */
  // -beg- preserve=no 33EBFA1C0079 test_head3287F81C0136 "State::containsStateMachine"
  public boolean containsStateMachine()
  // -end- 33EBFA1C0079 test_head3287F81C0136 "State::containsStateMachine"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EBFA1C0079 _link_body3287F81C0136 "State::_linkStateMachine"
  public void _linkStateMachine(StateMachine stateMachine1);
  // -end- 33EBFA1C0079 _link_body3287F81C0136 "State::_linkStateMachine"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EBFA1C0079 _unlink_body3287F81C0136 "State::_unlinkStateMachine"
  public void _unlinkStateMachine(StateMachine stateMachine1);
  // -end- 33EBFA1C0079 _unlink_body3287F81C0136 "State::_unlinkStateMachine"

  /** add a DeferrableEvent.
   *  
   *  @see #removeDeferrableEvent
   *  @see #containsDeferrableEvent
   *  @see #iteratorDeferrableEvent
   *  @see #clearDeferrableEvent
   *  @see #sizeDeferrableEvent
   */
  // -beg- preserve=no 33FA3AC103D4 add_head3287F81C0136 "State::addDeferrableEvent"
  public void addDeferrableEvent(Event deferrableEvent1)
  // -end- 33FA3AC103D4 add_head3287F81C0136 "State::addDeferrableEvent"
    ; // empty

  /** disconnect a DeferrableEvent.
   *  @see #addDeferrableEvent
   */
  // -beg- preserve=no 33FA3AC103D4 remove_head3287F81C0136 "State::removeDeferrableEvent"
  public Event removeDeferrableEvent(Event deferrableEvent1)
  // -end- 33FA3AC103D4 remove_head3287F81C0136 "State::removeDeferrableEvent"
    ; // empty

  /** tests if a given DeferrableEvent is connected.
   *  @see #addDeferrableEvent
   */
  // -beg- preserve=no 33FA3AC103D4 test_head3287F81C0136 "State::containsDeferrableEvent"
  public boolean containsDeferrableEvent(Event deferrableEvent1)
  // -end- 33FA3AC103D4 test_head3287F81C0136 "State::containsDeferrableEvent"
    ; // empty

  /** used to enumerate all connected DeferrableEvents.
   *  @see #addDeferrableEvent
   */
  // -beg- preserve=no 33FA3AC103D4 get_all_head3287F81C0136 "State::iteratorDeferrableEvent"
  public java.util.Iterator iteratorDeferrableEvent()
  // -end- 33FA3AC103D4 get_all_head3287F81C0136 "State::iteratorDeferrableEvent"
    ; // empty

  /** disconnect all DeferrableEvents.
   *  @see #addDeferrableEvent
   */
  // -beg- preserve=no 33FA3AC103D4 remove_all_head3287F81C0136 "State::clearDeferrableEvent"
  public void clearDeferrableEvent()
  // -end- 33FA3AC103D4 remove_all_head3287F81C0136 "State::clearDeferrableEvent"
    ; // empty

  /** returns the number of DeferrableEvents.
   *  @see #addDeferrableEvent
   */
  // -beg- preserve=no 33FA3AC103D4 size_head3287F81C0136 "State::sizeDeferrableEvent"
  public int sizeDeferrableEvent()
  // -end- 33FA3AC103D4 size_head3287F81C0136 "State::sizeDeferrableEvent"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FA3AC103D4 _link_body3287F81C0136 "State::_linkDeferrableEvent"
  public void _linkDeferrableEvent(Event deferrableEvent1);
  // -end- 33FA3AC103D4 _link_body3287F81C0136 "State::_linkDeferrableEvent"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FA3AC103D4 _unlink_body3287F81C0136 "State::_unlinkDeferrableEvent"
  public void _unlinkDeferrableEvent(Event deferrableEvent1);
  // -end- 33FA3AC103D4 _unlink_body3287F81C0136 "State::_unlinkDeferrableEvent"

  /** add a InternalTransition.
   *  
   *  @see #removeInternalTransition
   *  @see #containsInternalTransition
   *  @see #iteratorInternalTransition
   *  @see #clearInternalTransition
   *  @see #sizeInternalTransition
   */
  // -beg- preserve=no 328902D3029E add_head3287F81C0136 "State::addInternalTransition"
  public void addInternalTransition(Transition internalTransition1)
  // -end- 328902D3029E add_head3287F81C0136 "State::addInternalTransition"
    ; // empty

  /** disconnect a InternalTransition.
   *  @see #addInternalTransition
   */
  // -beg- preserve=no 328902D3029E remove_head3287F81C0136 "State::removeInternalTransition"
  public Transition removeInternalTransition(Transition internalTransition1)
  // -end- 328902D3029E remove_head3287F81C0136 "State::removeInternalTransition"
    ; // empty

  /** tests if a given InternalTransition is connected.
   *  @see #addInternalTransition
   */
  // -beg- preserve=no 328902D3029E test_head3287F81C0136 "State::containsInternalTransition"
  public boolean containsInternalTransition(Transition internalTransition1)
  // -end- 328902D3029E test_head3287F81C0136 "State::containsInternalTransition"
    ; // empty

  /** used to enumerate all connected InternalTransitions.
   *  @see #addInternalTransition
   */
  // -beg- preserve=no 328902D3029E get_all_head3287F81C0136 "State::iteratorInternalTransition"
  public java.util.Iterator iteratorInternalTransition()
  // -end- 328902D3029E get_all_head3287F81C0136 "State::iteratorInternalTransition"
    ; // empty

  /** disconnect all InternalTransitions.
   *  @see #addInternalTransition
   */
  // -beg- preserve=no 328902D3029E remove_all_head3287F81C0136 "State::clearInternalTransition"
  public void clearInternalTransition()
  // -end- 328902D3029E remove_all_head3287F81C0136 "State::clearInternalTransition"
    ; // empty

  /** returns the number of InternalTransitions.
   *  @see #addInternalTransition
   */
  // -beg- preserve=no 328902D3029E size_head3287F81C0136 "State::sizeInternalTransition"
  public int sizeInternalTransition()
  // -end- 328902D3029E size_head3287F81C0136 "State::sizeInternalTransition"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328902D3029E _link_body3287F81C0136 "State::_linkInternalTransition"
  public void _linkInternalTransition(Transition internalTransition1);
  // -end- 328902D3029E _link_body3287F81C0136 "State::_linkInternalTransition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328902D3029E _unlink_body3287F81C0136 "State::_unlinkInternalTransition"
  public void _unlinkInternalTransition(Transition internalTransition1);
  // -end- 328902D3029E _unlink_body3287F81C0136 "State::_unlinkInternalTransition"

  /** attaches a DoActivity.
   *  
   *  @see #detachDoActivity
   *  @see #getDoActivity
   *  @see #containsDoActivity
   */
  // -beg- preserve=no 364987D30040 attach_head3287F81C0136 "State::attachDoActivity"
  public void attachDoActivity(Action doActivity1)
  // -end- 364987D30040 attach_head3287F81C0136 "State::attachDoActivity"
    ; // empty

  /** disconnect the currently attached DoActivity.
   *  @see #attachDoActivity
   */
  // -beg- preserve=no 364987D30040 detach_head3287F81C0136 "State::detachDoActivity"
  public Action detachDoActivity()
  // -end- 364987D30040 detach_head3287F81C0136 "State::detachDoActivity"
    ; // empty

  /** get the currently attached DoActivity.
   *  @see #attachDoActivity
   */
  // -beg- preserve=no 364987D30040 get_head3287F81C0136 "State::getDoActivity"
  public Action getDoActivity()
  // -end- 364987D30040 get_head3287F81C0136 "State::getDoActivity"
    ; // empty

  /** tests if there is a DoActivity attached.
   *  @see #attachDoActivity
   */
  // -beg- preserve=no 364987D30040 test_head3287F81C0136 "State::containsDoActivity"
  public boolean containsDoActivity()
  // -end- 364987D30040 test_head3287F81C0136 "State::containsDoActivity"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364987D30040 _link_body3287F81C0136 "State::_linkDoActivity"
  public void _linkDoActivity(Action doActivity1);
  // -end- 364987D30040 _link_body3287F81C0136 "State::_linkDoActivity"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364987D30040 _unlink_body3287F81C0136 "State::_unlinkDoActivity"
  public void _unlinkDoActivity(Action doActivity1);
  // -end- 364987D30040 _unlink_body3287F81C0136 "State::_unlinkDoActivity"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3287F81C0136 detail_end "State"

  // -end- 3287F81C0136 detail_end "State"

}

