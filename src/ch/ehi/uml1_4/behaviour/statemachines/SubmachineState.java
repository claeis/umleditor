// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:11 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3403111A024E package "SubmachineState"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 3403111A024E package "SubmachineState"

// -beg- preserve=no 3403111A024E autoimport "SubmachineState"
import ch.ehi.uml1_4.behaviour.statemachines.CompositeState;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
// -end- 3403111A024E autoimport "SubmachineState"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3403111A024E import "SubmachineState"

// -end- 3403111A024E import "SubmachineState"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:11 $
 */
public interface SubmachineState extends CompositeState, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3403111A024E detail_begin "SubmachineState"

// -end- 3403111A024E detail_begin "SubmachineState"

/** attaches a Submachine.
 *
 *  @see #detachSubmachine
 *  @see #getSubmachine
 *  @see #containsSubmachine
 */
// -beg- preserve=no 3403125E03A2 attach_head3403111A024E "SubmachineState::attachSubmachine"
public void attachSubmachine(StateMachine submachine1)
// -end- 3403125E03A2 attach_head3403111A024E "SubmachineState::attachSubmachine"
;     // empty

/** disconnect the currently attached Submachine.
 *  @see #attachSubmachine
 */
// -beg- preserve=no 3403125E03A2 detach_head3403111A024E "SubmachineState::detachSubmachine"
public StateMachine detachSubmachine()
// -end- 3403125E03A2 detach_head3403111A024E "SubmachineState::detachSubmachine"
;     // empty

/** get the currently attached Submachine.
 *  @see #attachSubmachine
 */
// -beg- preserve=no 3403125E03A2 get_head3403111A024E "SubmachineState::getSubmachine"
public StateMachine getSubmachine()
// -end- 3403125E03A2 get_head3403111A024E "SubmachineState::getSubmachine"
;     // empty

/** tests if there is a Submachine attached.
 *  @see #attachSubmachine
 */
// -beg- preserve=no 3403125E03A2 test_head3403111A024E "SubmachineState::containsSubmachine"
public boolean containsSubmachine()
// -end- 3403125E03A2 test_head3403111A024E "SubmachineState::containsSubmachine"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3403125E03A2 _link_body3403111A024E "SubmachineState::_linkSubmachine"
public void _linkSubmachine(StateMachine submachine1);
// -end- 3403125E03A2 _link_body3403111A024E "SubmachineState::_linkSubmachine"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3403125E03A2 _unlink_body3403111A024E "SubmachineState::_unlinkSubmachine"
public void _unlinkSubmachine(StateMachine submachine1);
// -end- 3403125E03A2 _unlink_body3403111A024E "SubmachineState::_unlinkSubmachine"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3403111A024E detail_end "SubmachineState"

// -end- 3403111A024E detail_end "SubmachineState"

}
