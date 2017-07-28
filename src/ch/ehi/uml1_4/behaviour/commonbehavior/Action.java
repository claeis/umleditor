// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:54 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 328AAE8E0028 package "Action"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 328AAE8E0028 package "Action"

// -beg- preserve=no 328AAE8E0028 autoimport "Action"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.statemachines.State;
import ch.ehi.uml1_4.behaviour.statemachines.Transition;
import ch.ehi.uml1_4.behaviour.collaborations.Message;
import ch.ehi.uml1_4.behaviour.commonbehavior.Argument;
import ch.ehi.uml1_4.behaviour.commonbehavior.ActionSequence;
import ch.ehi.uml1_4.behaviour.commonbehavior.Stimulus;
import ch.ehi.uml1_4.foundation.datatypes.IterationExpression;
import ch.ehi.uml1_4.foundation.datatypes.ObjectSetExpression;
import ch.ehi.uml1_4.foundation.datatypes.ActionExpression;
// -end- 328AAE8E0028 autoimport "Action"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 328AAE8E0028 import "Action"

// -end- 328AAE8E0028 import "Action"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:54 $
 */
public interface Action extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 328AAE8E0028 detail_begin "Action"

// -end- 328AAE8E0028 detail_begin "Action"

/** attaches a State.
 *
 *  @see #detachState
 *  @see #getState
 *  @see #containsState
 */
// -beg- preserve=no 33377C0F0187 attach_head328AAE8E0028 "Action::attachState"
public void attachState(State state1)
// -end- 33377C0F0187 attach_head328AAE8E0028 "Action::attachState"
;     // empty

/** disconnect the currently attached State.
 *  @see #attachState
 */
// -beg- preserve=no 33377C0F0187 detach_head328AAE8E0028 "Action::detachState"
public State detachState()
// -end- 33377C0F0187 detach_head328AAE8E0028 "Action::detachState"
;     // empty

/** get the currently attached State.
 *  @see #attachState
 */
// -beg- preserve=no 33377C0F0187 get_head328AAE8E0028 "Action::getState"
public State getState()
// -end- 33377C0F0187 get_head328AAE8E0028 "Action::getState"
;     // empty

/** tests if there is a State attached.
 *  @see #attachState
 */
// -beg- preserve=no 33377C0F0187 test_head328AAE8E0028 "Action::containsState"
public boolean containsState()
// -end- 33377C0F0187 test_head328AAE8E0028 "Action::containsState"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33377C0F0187 _link_body328AAE8E0028 "Action::_linkState"
public void _linkState(State state1);
// -end- 33377C0F0187 _link_body328AAE8E0028 "Action::_linkState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33377C0F0187 _unlink_body328AAE8E0028 "Action::_unlinkState"
public void _unlinkState(State state1);
// -end- 33377C0F0187 _unlink_body328AAE8E0028 "Action::_unlinkState"

/** attaches a Transition.
 *
 *  @see #detachTransition
 *  @see #getTransition
 *  @see #containsTransition
 */
// -beg- preserve=no 3288E53E0226 attach_head328AAE8E0028 "Action::attachTransition"
public void attachTransition(Transition transition1)
// -end- 3288E53E0226 attach_head328AAE8E0028 "Action::attachTransition"
;     // empty

/** disconnect the currently attached Transition.
 *  @see #attachTransition
 */
// -beg- preserve=no 3288E53E0226 detach_head328AAE8E0028 "Action::detachTransition"
public Transition detachTransition()
// -end- 3288E53E0226 detach_head328AAE8E0028 "Action::detachTransition"
;     // empty

/** get the currently attached Transition.
 *  @see #attachTransition
 */
// -beg- preserve=no 3288E53E0226 get_head328AAE8E0028 "Action::getTransition"
public Transition getTransition()
// -end- 3288E53E0226 get_head328AAE8E0028 "Action::getTransition"
;     // empty

/** tests if there is a Transition attached.
 *  @see #attachTransition
 */
// -beg- preserve=no 3288E53E0226 test_head328AAE8E0028 "Action::containsTransition"
public boolean containsTransition()
// -end- 3288E53E0226 test_head328AAE8E0028 "Action::containsTransition"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288E53E0226 _link_body328AAE8E0028 "Action::_linkTransition"
public void _linkTransition(Transition transition1);
// -end- 3288E53E0226 _link_body328AAE8E0028 "Action::_linkTransition"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288E53E0226 _unlink_body328AAE8E0028 "Action::_unlinkTransition"
public void _unlinkTransition(Transition transition1);
// -end- 3288E53E0226 _unlink_body328AAE8E0028 "Action::_unlinkTransition"

/** add a Message.
 *
 *  @see #removeMessage
 *  @see #containsMessage
 *  @see #iteratorMessage
 *  @see #clearMessage
 *  @see #sizeMessage
 */
// -beg- preserve=no 36265CF90050 add_head328AAE8E0028 "Action::addMessage"
public void addMessage(Message message1)
// -end- 36265CF90050 add_head328AAE8E0028 "Action::addMessage"
;     // empty

/** disconnect a Message.
 *  @see #addMessage
 */
// -beg- preserve=no 36265CF90050 remove_head328AAE8E0028 "Action::removeMessage"
public Message removeMessage(Message message1)
// -end- 36265CF90050 remove_head328AAE8E0028 "Action::removeMessage"
;     // empty

/** tests if a given Message is connected.
 *  @see #addMessage
 */
// -beg- preserve=no 36265CF90050 test_head328AAE8E0028 "Action::containsMessage"
public boolean containsMessage(Message message1)
// -end- 36265CF90050 test_head328AAE8E0028 "Action::containsMessage"
;     // empty

/** used to enumerate all connected Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 36265CF90050 get_all_head328AAE8E0028 "Action::iteratorMessage"
public java.util.Iterator iteratorMessage()
// -end- 36265CF90050 get_all_head328AAE8E0028 "Action::iteratorMessage"
;     // empty

/** disconnect all Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 36265CF90050 remove_all_head328AAE8E0028 "Action::clearMessage"
public void clearMessage()
// -end- 36265CF90050 remove_all_head328AAE8E0028 "Action::clearMessage"
;     // empty

/** returns the number of Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 36265CF90050 size_head328AAE8E0028 "Action::sizeMessage"
public int sizeMessage()
// -end- 36265CF90050 size_head328AAE8E0028 "Action::sizeMessage"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36265CF90050 _link_body328AAE8E0028 "Action::_linkMessage"
public void _linkMessage(Message message1);
// -end- 36265CF90050 _link_body328AAE8E0028 "Action::_linkMessage"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36265CF90050 _unlink_body328AAE8E0028 "Action::_unlinkMessage"
public void _unlinkMessage(Message message1);
// -end- 36265CF90050 _unlink_body328AAE8E0028 "Action::_unlinkMessage"

/** add a ActualArgument.
 *
 *  @see #removeActualArgument
 *  @see #containsActualArgument
 *  @see #iteratorActualArgument
 *  @see #clearActualArgument
 *  @see #sizeActualArgument
 */
// -beg- preserve=no 33CFA4B90281 add_head328AAE8E0028 "Action::addActualArgument"
public void addActualArgument(Argument actualArgument1)
// -end- 33CFA4B90281 add_head328AAE8E0028 "Action::addActualArgument"
;     // empty

// -beg- preserve=no 33CFA4B90281 add2_head328AAE8E0028 "Action::add2ActualArgument"
public void addActualArgument(int index,Argument actualArgument1)
// -end- 33CFA4B90281 add2_head328AAE8E0028 "Action::add2ActualArgument"
;     // empty

/** disconnect a ActualArgument.
 *  @see #addActualArgument
 */
// -beg- preserve=no 33CFA4B90281 remove_head328AAE8E0028 "Action::removeActualArgument"
public Argument removeActualArgument(Argument actualArgument1)
// -end- 33CFA4B90281 remove_head328AAE8E0028 "Action::removeActualArgument"
;     // empty

/** disconnect a ActualArgument.
 *  @see #addActualArgument
 */
// -beg- preserve=no 33CFA4B90281 remove2_head328AAE8E0028 "Action::remove2ActualArgument"
public Argument removeActualArgument(int index)
// -end- 33CFA4B90281 remove2_head328AAE8E0028 "Action::remove2ActualArgument"
;     // empty

/** change a ActualArgument.
 *  @see #addActualArgument
 */
// -beg- preserve=no 33CFA4B90281 set_head328AAE8E0028 "Action::setActualArgument"
public Argument setActualArgument(int index,Argument actualArgument1)
// -end- 33CFA4B90281 set_head328AAE8E0028 "Action::setActualArgument"
;     // empty

/** tests if a given ActualArgument is connected.
 *  @see #addActualArgument
 */
// -beg- preserve=no 33CFA4B90281 test_head328AAE8E0028 "Action::containsActualArgument"
public boolean containsActualArgument(Argument actualArgument1)
// -end- 33CFA4B90281 test_head328AAE8E0028 "Action::containsActualArgument"
;     // empty

/** used to enumerate all connected ActualArguments.
 *  @see #addActualArgument
 */
// -beg- preserve=no 33CFA4B90281 get_all_head328AAE8E0028 "Action::iteratorActualArgument"
public java.util.Iterator iteratorActualArgument()
// -end- 33CFA4B90281 get_all_head328AAE8E0028 "Action::iteratorActualArgument"
;     // empty

/** disconnect all ActualArguments.
 *  @see #addActualArgument
 */
// -beg- preserve=no 33CFA4B90281 remove_all_head328AAE8E0028 "Action::clearActualArgument"
public void clearActualArgument()
// -end- 33CFA4B90281 remove_all_head328AAE8E0028 "Action::clearActualArgument"
;     // empty

/** returns the number of ActualArguments.
 *  @see #addActualArgument
 */
// -beg- preserve=no 33CFA4B90281 size_head328AAE8E0028 "Action::sizeActualArgument"
public int sizeActualArgument()
// -end- 33CFA4B90281 size_head328AAE8E0028 "Action::sizeActualArgument"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CFA4B90281 _link_body328AAE8E0028 "Action::_linkActualArgument"
public void _linkActualArgument(Argument actualArgument1);
// -end- 33CFA4B90281 _link_body328AAE8E0028 "Action::_linkActualArgument"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CFA4B90281 _unlink_body328AAE8E0028 "Action::_unlinkActualArgument"
public void _unlinkActualArgument(Argument actualArgument1);
// -end- 33CFA4B90281 _unlink_body328AAE8E0028 "Action::_unlinkActualArgument"

/** attaches a ActionSequence.
 *
 *  @see #detachActionSequence
 *  @see #getActionSequence
 *  @see #containsActionSequence
 */
// -beg- preserve=no 363555210065 attach_head328AAE8E0028 "Action::attachActionSequence"
public void attachActionSequence(ActionSequence actionSequence1)
// -end- 363555210065 attach_head328AAE8E0028 "Action::attachActionSequence"
;     // empty

/** disconnect the currently attached ActionSequence.
 *  @see #attachActionSequence
 */
// -beg- preserve=no 363555210065 detach_head328AAE8E0028 "Action::detachActionSequence"
public ActionSequence detachActionSequence()
// -end- 363555210065 detach_head328AAE8E0028 "Action::detachActionSequence"
;     // empty

/** get the currently attached ActionSequence.
 *  @see #attachActionSequence
 */
// -beg- preserve=no 363555210065 get_head328AAE8E0028 "Action::getActionSequence"
public ActionSequence getActionSequence()
// -end- 363555210065 get_head328AAE8E0028 "Action::getActionSequence"
;     // empty

/** tests if there is a ActionSequence attached.
 *  @see #attachActionSequence
 */
// -beg- preserve=no 363555210065 test_head328AAE8E0028 "Action::containsActionSequence"
public boolean containsActionSequence()
// -end- 363555210065 test_head328AAE8E0028 "Action::containsActionSequence"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 363555210065 _link_body328AAE8E0028 "Action::_linkActionSequence"
public void _linkActionSequence(ActionSequence actionSequence1);
// -end- 363555210065 _link_body328AAE8E0028 "Action::_linkActionSequence"

/** DONT USE; link management internal
 */
// -beg- preserve=no 363555210065 _unlink_body328AAE8E0028 "Action::_unlinkActionSequence"
public void _unlinkActionSequence(ActionSequence actionSequence1);
// -end- 363555210065 _unlink_body328AAE8E0028 "Action::_unlinkActionSequence"

/** add a Stimulus.
 *
 *  @see #removeStimulus
 *  @see #containsStimulus
 *  @see #iteratorStimulus
 *  @see #clearStimulus
 *  @see #sizeStimulus
 */
// -beg- preserve=no 3650F0CD0294 add_head328AAE8E0028 "Action::addStimulus"
public void addStimulus(Stimulus stimulus1)
// -end- 3650F0CD0294 add_head328AAE8E0028 "Action::addStimulus"
;     // empty

/** disconnect a Stimulus.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650F0CD0294 remove_head328AAE8E0028 "Action::removeStimulus"
public Stimulus removeStimulus(Stimulus stimulus1)
// -end- 3650F0CD0294 remove_head328AAE8E0028 "Action::removeStimulus"
;     // empty

/** tests if a given Stimulus is connected.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650F0CD0294 test_head328AAE8E0028 "Action::containsStimulus"
public boolean containsStimulus(Stimulus stimulus1)
// -end- 3650F0CD0294 test_head328AAE8E0028 "Action::containsStimulus"
;     // empty

/** used to enumerate all connected Stimuluss.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650F0CD0294 get_all_head328AAE8E0028 "Action::iteratorStimulus"
public java.util.Iterator iteratorStimulus()
// -end- 3650F0CD0294 get_all_head328AAE8E0028 "Action::iteratorStimulus"
;     // empty

/** disconnect all Stimuluss.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650F0CD0294 remove_all_head328AAE8E0028 "Action::clearStimulus"
public void clearStimulus()
// -end- 3650F0CD0294 remove_all_head328AAE8E0028 "Action::clearStimulus"
;     // empty

/** returns the number of Stimuluss.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650F0CD0294 size_head328AAE8E0028 "Action::sizeStimulus"
public int sizeStimulus()
// -end- 3650F0CD0294 size_head328AAE8E0028 "Action::sizeStimulus"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650F0CD0294 _link_body328AAE8E0028 "Action::_linkStimulus"
public void _linkStimulus(Stimulus stimulus1);
// -end- 3650F0CD0294 _link_body328AAE8E0028 "Action::_linkStimulus"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650F0CD0294 _unlink_body328AAE8E0028 "Action::_unlinkStimulus"
public void _unlinkStimulus(Stimulus stimulus1);
// -end- 3650F0CD0294 _unlink_body328AAE8E0028 "Action::_unlinkStimulus"

/** get current value of recurrence
 *  @see #setRecurrence
 */
// -beg- preserve=no 33CFC98800AA get_head328AAE8E0028 "recurrence"
IterationExpression getRecurrence()
// -end- 33CFC98800AA get_head328AAE8E0028 "recurrence"
;     // empty
/** set current value of recurrence
 *  @see #getRecurrence
 */
// -beg- preserve=no 33CFC98800AA set_head328AAE8E0028 "recurrence"
void setRecurrence(IterationExpression value1)
// -end- 33CFC98800AA set_head328AAE8E0028 "recurrence"
;     // empty
/** get current value of target
 *  @see #setTarget
 */
// -beg- preserve=no 33D9065A015E get_head328AAE8E0028 "target"
ObjectSetExpression getTarget()
// -end- 33D9065A015E get_head328AAE8E0028 "target"
;     // empty
/** set current value of target
 *  @see #getTarget
 */
// -beg- preserve=no 33D9065A015E set_head328AAE8E0028 "target"
void setTarget(ObjectSetExpression value1)
// -end- 33D9065A015E set_head328AAE8E0028 "target"
;     // empty
/** get current value of isAsynchronous
 *  @see #setAsynchronous
 */
// -beg- preserve=no 33FB68A302E4 get_head328AAE8E0028 "isAsynchronous"
boolean isAsynchronous()
// -end- 33FB68A302E4 get_head328AAE8E0028 "isAsynchronous"
;     // empty
/** set current value of isAsynchronous
 *  @see #isAsynchronous
 */
// -beg- preserve=no 33FB68A302E4 set_head328AAE8E0028 "isAsynchronous"
void setAsynchronous(boolean value1)
// -end- 33FB68A302E4 set_head328AAE8E0028 "isAsynchronous"
;     // empty
/** get current value of script
 *  @see #setScript
 */
// -beg- preserve=no 33FB68AE00B4 get_head328AAE8E0028 "script"
ActionExpression getScript()
// -end- 33FB68AE00B4 get_head328AAE8E0028 "script"
;     // empty
/** set current value of script
 *  @see #getScript
 */
// -beg- preserve=no 33FB68AE00B4 set_head328AAE8E0028 "script"
void setScript(ActionExpression value1)
// -end- 33FB68AE00B4 set_head328AAE8E0028 "script"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 328AAE8E0028 detail_end "Action"

// -end- 328AAE8E0028 detail_end "Action"

}
