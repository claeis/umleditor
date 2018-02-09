// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:13 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3288D70A0212 package "Transition"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 3288D70A0212 package "Transition"

// -beg- preserve=no 3288D70A0212 autoimport "Transition"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.statemachines.Guard;
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
import ch.ehi.uml1_4.behaviour.statemachines.State;
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.statemachines.StateVertex;
// -end- 3288D70A0212 autoimport "Transition"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3288D70A0212 import "Transition"

// -end- 3288D70A0212 import "Transition"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:13 $
 */
public interface Transition extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3288D70A0212 detail_begin "Transition"

// -end- 3288D70A0212 detail_begin "Transition"

/** attaches a Guard.
 *
 *  @see #detachGuard
 *  @see #getGuard
 *  @see #containsGuard
 */
// -beg- preserve=no 3369606C0002 attach_head3288D70A0212 "Transition::attachGuard"
public void attachGuard(Guard guard1)
// -end- 3369606C0002 attach_head3288D70A0212 "Transition::attachGuard"
;     // empty

/** disconnect the currently attached Guard.
 *  @see #attachGuard
 */
// -beg- preserve=no 3369606C0002 detach_head3288D70A0212 "Transition::detachGuard"
public Guard detachGuard()
// -end- 3369606C0002 detach_head3288D70A0212 "Transition::detachGuard"
;     // empty

/** get the currently attached Guard.
 *  @see #attachGuard
 */
// -beg- preserve=no 3369606C0002 get_head3288D70A0212 "Transition::getGuard"
public Guard getGuard()
// -end- 3369606C0002 get_head3288D70A0212 "Transition::getGuard"
;     // empty

/** tests if there is a Guard attached.
 *  @see #attachGuard
 */
// -beg- preserve=no 3369606C0002 test_head3288D70A0212 "Transition::containsGuard"
public boolean containsGuard()
// -end- 3369606C0002 test_head3288D70A0212 "Transition::containsGuard"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3369606C0002 _link_body3288D70A0212 "Transition::_linkGuard"
public void _linkGuard(Guard guard1);
// -end- 3369606C0002 _link_body3288D70A0212 "Transition::_linkGuard"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3369606C0002 _unlink_body3288D70A0212 "Transition::_unlinkGuard"
public void _unlinkGuard(Guard guard1);
// -end- 3369606C0002 _unlink_body3288D70A0212 "Transition::_unlinkGuard"

/** attaches a Effect.
 *
 *  @see #detachEffect
 *  @see #getEffect
 *  @see #containsEffect
 */
// -beg- preserve=no 3288E53E017C attach_head3288D70A0212 "Transition::attachEffect"
public void attachEffect(Action effect1)
// -end- 3288E53E017C attach_head3288D70A0212 "Transition::attachEffect"
;     // empty

/** disconnect the currently attached Effect.
 *  @see #attachEffect
 */
// -beg- preserve=no 3288E53E017C detach_head3288D70A0212 "Transition::detachEffect"
public Action detachEffect()
// -end- 3288E53E017C detach_head3288D70A0212 "Transition::detachEffect"
;     // empty

/** get the currently attached Effect.
 *  @see #attachEffect
 */
// -beg- preserve=no 3288E53E017C get_head3288D70A0212 "Transition::getEffect"
public Action getEffect()
// -end- 3288E53E017C get_head3288D70A0212 "Transition::getEffect"
;     // empty

/** tests if there is a Effect attached.
 *  @see #attachEffect
 */
// -beg- preserve=no 3288E53E017C test_head3288D70A0212 "Transition::containsEffect"
public boolean containsEffect()
// -end- 3288E53E017C test_head3288D70A0212 "Transition::containsEffect"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288E53E017C _link_body3288D70A0212 "Transition::_linkEffect"
public void _linkEffect(Action effect1);
// -end- 3288E53E017C _link_body3288D70A0212 "Transition::_linkEffect"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288E53E017C _unlink_body3288D70A0212 "Transition::_unlinkEffect"
public void _unlinkEffect(Action effect1);
// -end- 3288E53E017C _unlink_body3288D70A0212 "Transition::_unlinkEffect"

/** attaches a State.
 *
 *  @see #detachState
 *  @see #getState
 *  @see #containsState
 */
// -beg- preserve=no 328902D40000 attach_head3288D70A0212 "Transition::attachState"
public void attachState(State state1)
// -end- 328902D40000 attach_head3288D70A0212 "Transition::attachState"
;     // empty

/** disconnect the currently attached State.
 *  @see #attachState
 */
// -beg- preserve=no 328902D40000 detach_head3288D70A0212 "Transition::detachState"
public State detachState()
// -end- 328902D40000 detach_head3288D70A0212 "Transition::detachState"
;     // empty

/** get the currently attached State.
 *  @see #attachState
 */
// -beg- preserve=no 328902D40000 get_head3288D70A0212 "Transition::getState"
public State getState()
// -end- 328902D40000 get_head3288D70A0212 "Transition::getState"
;     // empty

/** tests if there is a State attached.
 *  @see #attachState
 */
// -beg- preserve=no 328902D40000 test_head3288D70A0212 "Transition::containsState"
public boolean containsState()
// -end- 328902D40000 test_head3288D70A0212 "Transition::containsState"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328902D40000 _link_body3288D70A0212 "Transition::_linkState"
public void _linkState(State state1);
// -end- 328902D40000 _link_body3288D70A0212 "Transition::_linkState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328902D40000 _unlink_body3288D70A0212 "Transition::_unlinkState"
public void _unlinkState(State state1);
// -end- 328902D40000 _unlink_body3288D70A0212 "Transition::_unlinkState"

/** attaches a Trigger.
 *
 *  @see #detachTrigger
 *  @see #getTrigger
 *  @see #containsTrigger
 */
// -beg- preserve=no 3288E53A0104 attach_head3288D70A0212 "Transition::attachTrigger"
public void attachTrigger(Event trigger1)
// -end- 3288E53A0104 attach_head3288D70A0212 "Transition::attachTrigger"
;     // empty

/** disconnect the currently attached Trigger.
 *  @see #attachTrigger
 */
// -beg- preserve=no 3288E53A0104 detach_head3288D70A0212 "Transition::detachTrigger"
public Event detachTrigger()
// -end- 3288E53A0104 detach_head3288D70A0212 "Transition::detachTrigger"
;     // empty

/** get the currently attached Trigger.
 *  @see #attachTrigger
 */
// -beg- preserve=no 3288E53A0104 get_head3288D70A0212 "Transition::getTrigger"
public Event getTrigger()
// -end- 3288E53A0104 get_head3288D70A0212 "Transition::getTrigger"
;     // empty

/** tests if there is a Trigger attached.
 *  @see #attachTrigger
 */
// -beg- preserve=no 3288E53A0104 test_head3288D70A0212 "Transition::containsTrigger"
public boolean containsTrigger()
// -end- 3288E53A0104 test_head3288D70A0212 "Transition::containsTrigger"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288E53A0104 _link_body3288D70A0212 "Transition::_linkTrigger"
public void _linkTrigger(Event trigger1);
// -end- 3288E53A0104 _link_body3288D70A0212 "Transition::_linkTrigger"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288E53A0104 _unlink_body3288D70A0212 "Transition::_unlinkTrigger"
public void _unlinkTrigger(Event trigger1);
// -end- 3288E53A0104 _unlink_body3288D70A0212 "Transition::_unlinkTrigger"

/** attaches a StateMachine.
 *
 *  @see #detachStateMachine
 *  @see #getStateMachine
 *  @see #containsStateMachine
 */
// -beg- preserve=no 3288D72700C9 attach_head3288D70A0212 "Transition::attachStateMachine"
public void attachStateMachine(StateMachine stateMachine1)
// -end- 3288D72700C9 attach_head3288D70A0212 "Transition::attachStateMachine"
;     // empty

/** disconnect the currently attached StateMachine.
 *  @see #attachStateMachine
 */
// -beg- preserve=no 3288D72700C9 detach_head3288D70A0212 "Transition::detachStateMachine"
public StateMachine detachStateMachine()
// -end- 3288D72700C9 detach_head3288D70A0212 "Transition::detachStateMachine"
;     // empty

/** get the currently attached StateMachine.
 *  @see #attachStateMachine
 */
// -beg- preserve=no 3288D72700C9 get_head3288D70A0212 "Transition::getStateMachine"
public StateMachine getStateMachine()
// -end- 3288D72700C9 get_head3288D70A0212 "Transition::getStateMachine"
;     // empty

/** tests if there is a StateMachine attached.
 *  @see #attachStateMachine
 */
// -beg- preserve=no 3288D72700C9 test_head3288D70A0212 "Transition::containsStateMachine"
public boolean containsStateMachine()
// -end- 3288D72700C9 test_head3288D70A0212 "Transition::containsStateMachine"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288D72700C9 _link_body3288D70A0212 "Transition::_linkStateMachine"
public void _linkStateMachine(StateMachine stateMachine1);
// -end- 3288D72700C9 _link_body3288D70A0212 "Transition::_linkStateMachine"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288D72700C9 _unlink_body3288D70A0212 "Transition::_unlinkStateMachine"
public void _unlinkStateMachine(StateMachine stateMachine1);
// -end- 3288D72700C9 _unlink_body3288D70A0212 "Transition::_unlinkStateMachine"

/** attaches a Source.
 *
 *  @see #detachSource
 *  @see #getSource
 *  @see #containsSource
 */
// -beg- preserve=no 328902830028 attach_head3288D70A0212 "Transition::attachSource"
public void attachSource(StateVertex source1)
// -end- 328902830028 attach_head3288D70A0212 "Transition::attachSource"
;     // empty

/** disconnect the currently attached Source.
 *  @see #attachSource
 */
// -beg- preserve=no 328902830028 detach_head3288D70A0212 "Transition::detachSource"
public StateVertex detachSource()
// -end- 328902830028 detach_head3288D70A0212 "Transition::detachSource"
;     // empty

/** get the currently attached Source.
 *  @see #attachSource
 */
// -beg- preserve=no 328902830028 get_head3288D70A0212 "Transition::getSource"
public StateVertex getSource()
// -end- 328902830028 get_head3288D70A0212 "Transition::getSource"
;     // empty

/** tests if there is a Source attached.
 *  @see #attachSource
 */
// -beg- preserve=no 328902830028 test_head3288D70A0212 "Transition::containsSource"
public boolean containsSource()
// -end- 328902830028 test_head3288D70A0212 "Transition::containsSource"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328902830028 _link_body3288D70A0212 "Transition::_linkSource"
public void _linkSource(StateVertex source1);
// -end- 328902830028 _link_body3288D70A0212 "Transition::_linkSource"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328902830028 _unlink_body3288D70A0212 "Transition::_unlinkSource"
public void _unlinkSource(StateVertex source1);
// -end- 328902830028 _unlink_body3288D70A0212 "Transition::_unlinkSource"

/** attaches a Target.
 *
 *  @see #detachTarget
 *  @see #getTarget
 *  @see #containsTarget
 */
// -beg- preserve=no 3289028D02BC attach_head3288D70A0212 "Transition::attachTarget"
public void attachTarget(StateVertex target1)
// -end- 3289028D02BC attach_head3288D70A0212 "Transition::attachTarget"
;     // empty

/** disconnect the currently attached Target.
 *  @see #attachTarget
 */
// -beg- preserve=no 3289028D02BC detach_head3288D70A0212 "Transition::detachTarget"
public StateVertex detachTarget()
// -end- 3289028D02BC detach_head3288D70A0212 "Transition::detachTarget"
;     // empty

/** get the currently attached Target.
 *  @see #attachTarget
 */
// -beg- preserve=no 3289028D02BC get_head3288D70A0212 "Transition::getTarget"
public StateVertex getTarget()
// -end- 3289028D02BC get_head3288D70A0212 "Transition::getTarget"
;     // empty

/** tests if there is a Target attached.
 *  @see #attachTarget
 */
// -beg- preserve=no 3289028D02BC test_head3288D70A0212 "Transition::containsTarget"
public boolean containsTarget()
// -end- 3289028D02BC test_head3288D70A0212 "Transition::containsTarget"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3289028D02BC _link_body3288D70A0212 "Transition::_linkTarget"
public void _linkTarget(StateVertex target1);
// -end- 3289028D02BC _link_body3288D70A0212 "Transition::_linkTarget"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3289028D02BC _unlink_body3288D70A0212 "Transition::_unlinkTarget"
public void _unlinkTarget(StateVertex target1);
// -end- 3289028D02BC _unlink_body3288D70A0212 "Transition::_unlinkTarget"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3288D70A0212 detail_end "Transition"

// -end- 3288D70A0212 detail_end "Transition"

}
