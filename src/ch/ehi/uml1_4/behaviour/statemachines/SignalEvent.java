// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:08 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 32D270CC01FE package "SignalEvent"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 32D270CC01FE package "SignalEvent"

// -beg- preserve=no 32D270CC01FE autoimport "SignalEvent"
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.behaviour.commonbehavior.Signal;
// -end- 32D270CC01FE autoimport "SignalEvent"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 32D270CC01FE import "SignalEvent"

// -end- 32D270CC01FE import "SignalEvent"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:08 $
 */
public interface SignalEvent extends Event, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 32D270CC01FE detail_begin "SignalEvent"

// -end- 32D270CC01FE detail_begin "SignalEvent"

/** attaches a Signal.
 *
 *  @see #detachSignal
 *  @see #getSignal
 *  @see #containsSignal
 */
// -beg- preserve=no 336A39BE038F attach_head32D270CC01FE "SignalEvent::attachSignal"
public void attachSignal(Signal signal1)
// -end- 336A39BE038F attach_head32D270CC01FE "SignalEvent::attachSignal"
;     // empty

/** disconnect the currently attached Signal.
 *  @see #attachSignal
 */
// -beg- preserve=no 336A39BE038F detach_head32D270CC01FE "SignalEvent::detachSignal"
public Signal detachSignal()
// -end- 336A39BE038F detach_head32D270CC01FE "SignalEvent::detachSignal"
;     // empty

/** get the currently attached Signal.
 *  @see #attachSignal
 */
// -beg- preserve=no 336A39BE038F get_head32D270CC01FE "SignalEvent::getSignal"
public Signal getSignal()
// -end- 336A39BE038F get_head32D270CC01FE "SignalEvent::getSignal"
;     // empty

/** tests if there is a Signal attached.
 *  @see #attachSignal
 */
// -beg- preserve=no 336A39BE038F test_head32D270CC01FE "SignalEvent::containsSignal"
public boolean containsSignal()
// -end- 336A39BE038F test_head32D270CC01FE "SignalEvent::containsSignal"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 336A39BE038F _link_body32D270CC01FE "SignalEvent::_linkSignal"
public void _linkSignal(Signal signal1);
// -end- 336A39BE038F _link_body32D270CC01FE "SignalEvent::_linkSignal"

/** DONT USE; link management internal
 */
// -beg- preserve=no 336A39BE038F _unlink_body32D270CC01FE "SignalEvent::_unlinkSignal"
public void _unlinkSignal(Signal signal1);
// -end- 336A39BE038F _unlink_body32D270CC01FE "SignalEvent::_unlinkSignal"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 32D270CC01FE detail_end "SignalEvent"

// -end- 32D270CC01FE detail_end "SignalEvent"

}
