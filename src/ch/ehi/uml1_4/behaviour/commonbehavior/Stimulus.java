// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:05 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33FEEA66033E package "Stimulus"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 33FEEA66033E package "Stimulus"

// -beg- preserve=no 33FEEA66033E autoimport "Stimulus"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.collaborations.InteractionInstanceSet;
import ch.ehi.uml1_4.behaviour.collaborations.Message;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.Link;
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
// -end- 33FEEA66033E autoimport "Stimulus"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33FEEA66033E import "Stimulus"

// -end- 33FEEA66033E import "Stimulus"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:05 $
 */
public interface Stimulus extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33FEEA66033E detail_begin "Stimulus"

// -end- 33FEEA66033E detail_begin "Stimulus"

/** add a InteractionInstanceSet.
 *
 *  @see #removeInteractionInstanceSet
 *  @see #containsInteractionInstanceSet
 *  @see #iteratorInteractionInstanceSet
 *  @see #clearInteractionInstanceSet
 *  @see #sizeInteractionInstanceSet
 */
// -beg- preserve=no 39E8FCBA03D9 add_head33FEEA66033E "Stimulus::addInteractionInstanceSet"
public void addInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1)
// -end- 39E8FCBA03D9 add_head33FEEA66033E "Stimulus::addInteractionInstanceSet"
;     // empty

/** disconnect a InteractionInstanceSet.
 *  @see #addInteractionInstanceSet
 */
// -beg- preserve=no 39E8FCBA03D9 remove_head33FEEA66033E "Stimulus::removeInteractionInstanceSet"
public InteractionInstanceSet removeInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1)
// -end- 39E8FCBA03D9 remove_head33FEEA66033E "Stimulus::removeInteractionInstanceSet"
;     // empty

/** tests if a given InteractionInstanceSet is connected.
 *  @see #addInteractionInstanceSet
 */
// -beg- preserve=no 39E8FCBA03D9 test_head33FEEA66033E "Stimulus::containsInteractionInstanceSet"
public boolean containsInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1)
// -end- 39E8FCBA03D9 test_head33FEEA66033E "Stimulus::containsInteractionInstanceSet"
;     // empty

/** used to enumerate all connected InteractionInstanceSets.
 *  @see #addInteractionInstanceSet
 */
// -beg- preserve=no 39E8FCBA03D9 get_all_head33FEEA66033E "Stimulus::iteratorInteractionInstanceSet"
public java.util.Iterator iteratorInteractionInstanceSet()
// -end- 39E8FCBA03D9 get_all_head33FEEA66033E "Stimulus::iteratorInteractionInstanceSet"
;     // empty

/** disconnect all InteractionInstanceSets.
 *  @see #addInteractionInstanceSet
 */
// -beg- preserve=no 39E8FCBA03D9 remove_all_head33FEEA66033E "Stimulus::clearInteractionInstanceSet"
public void clearInteractionInstanceSet()
// -end- 39E8FCBA03D9 remove_all_head33FEEA66033E "Stimulus::clearInteractionInstanceSet"
;     // empty

/** returns the number of InteractionInstanceSets.
 *  @see #addInteractionInstanceSet
 */
// -beg- preserve=no 39E8FCBA03D9 size_head33FEEA66033E "Stimulus::sizeInteractionInstanceSet"
public int sizeInteractionInstanceSet()
// -end- 39E8FCBA03D9 size_head33FEEA66033E "Stimulus::sizeInteractionInstanceSet"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FCBA03D9 _link_body33FEEA66033E "Stimulus::_linkInteractionInstanceSet"
public void _linkInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1);
// -end- 39E8FCBA03D9 _link_body33FEEA66033E "Stimulus::_linkInteractionInstanceSet"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FCBA03D9 _unlink_body33FEEA66033E "Stimulus::_unlinkInteractionInstanceSet"
public void _unlinkInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1);
// -end- 39E8FCBA03D9 _unlink_body33FEEA66033E "Stimulus::_unlinkInteractionInstanceSet"

/** add a PlayedRole.
 *
 *  @see #removePlayedRole
 *  @see #containsPlayedRole
 *  @see #iteratorPlayedRole
 *  @see #clearPlayedRole
 *  @see #sizePlayedRole
 */
// -beg- preserve=no 39E8FF690197 add_head33FEEA66033E "Stimulus::addPlayedRole"
public void addPlayedRole(Message playedRole1)
// -end- 39E8FF690197 add_head33FEEA66033E "Stimulus::addPlayedRole"
;     // empty

/** disconnect a PlayedRole.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FF690197 remove_head33FEEA66033E "Stimulus::removePlayedRole"
public Message removePlayedRole(Message playedRole1)
// -end- 39E8FF690197 remove_head33FEEA66033E "Stimulus::removePlayedRole"
;     // empty

/** tests if a given PlayedRole is connected.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FF690197 test_head33FEEA66033E "Stimulus::containsPlayedRole"
public boolean containsPlayedRole(Message playedRole1)
// -end- 39E8FF690197 test_head33FEEA66033E "Stimulus::containsPlayedRole"
;     // empty

/** used to enumerate all connected PlayedRoles.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FF690197 get_all_head33FEEA66033E "Stimulus::iteratorPlayedRole"
public java.util.Iterator iteratorPlayedRole()
// -end- 39E8FF690197 get_all_head33FEEA66033E "Stimulus::iteratorPlayedRole"
;     // empty

/** disconnect all PlayedRoles.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FF690197 remove_all_head33FEEA66033E "Stimulus::clearPlayedRole"
public void clearPlayedRole()
// -end- 39E8FF690197 remove_all_head33FEEA66033E "Stimulus::clearPlayedRole"
;     // empty

/** returns the number of PlayedRoles.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FF690197 size_head33FEEA66033E "Stimulus::sizePlayedRole"
public int sizePlayedRole()
// -end- 39E8FF690197 size_head33FEEA66033E "Stimulus::sizePlayedRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FF690197 _link_body33FEEA66033E "Stimulus::_linkPlayedRole"
public void _linkPlayedRole(Message playedRole1);
// -end- 39E8FF690197 _link_body33FEEA66033E "Stimulus::_linkPlayedRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FF690197 _unlink_body33FEEA66033E "Stimulus::_unlinkPlayedRole"
public void _unlinkPlayedRole(Message playedRole1);
// -end- 39E8FF690197 _unlink_body33FEEA66033E "Stimulus::_unlinkPlayedRole"

/** add a Argument.
 *
 *  @see #removeArgument
 *  @see #containsArgument
 *  @see #iteratorArgument
 *  @see #clearArgument
 *  @see #sizeArgument
 */
// -beg- preserve=no 33FF558C0190 add_head33FEEA66033E "Stimulus::addArgument"
public void addArgument(Instance argument1)
// -end- 33FF558C0190 add_head33FEEA66033E "Stimulus::addArgument"
;     // empty

/** disconnect a Argument.
 *  @see #addArgument
 */
// -beg- preserve=no 33FF558C0190 remove_head33FEEA66033E "Stimulus::removeArgument"
public Instance removeArgument(Instance argument1)
// -end- 33FF558C0190 remove_head33FEEA66033E "Stimulus::removeArgument"
;     // empty

/** tests if a given Argument is connected.
 *  @see #addArgument
 */
// -beg- preserve=no 33FF558C0190 test_head33FEEA66033E "Stimulus::containsArgument"
public boolean containsArgument(Instance argument1)
// -end- 33FF558C0190 test_head33FEEA66033E "Stimulus::containsArgument"
;     // empty

/** used to enumerate all connected Arguments.
 *  @see #addArgument
 */
// -beg- preserve=no 33FF558C0190 get_all_head33FEEA66033E "Stimulus::iteratorArgument"
public java.util.Iterator iteratorArgument()
// -end- 33FF558C0190 get_all_head33FEEA66033E "Stimulus::iteratorArgument"
;     // empty

/** disconnect all Arguments.
 *  @see #addArgument
 */
// -beg- preserve=no 33FF558C0190 remove_all_head33FEEA66033E "Stimulus::clearArgument"
public void clearArgument()
// -end- 33FF558C0190 remove_all_head33FEEA66033E "Stimulus::clearArgument"
;     // empty

/** returns the number of Arguments.
 *  @see #addArgument
 */
// -beg- preserve=no 33FF558C0190 size_head33FEEA66033E "Stimulus::sizeArgument"
public int sizeArgument()
// -end- 33FF558C0190 size_head33FEEA66033E "Stimulus::sizeArgument"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF558C0190 _link_body33FEEA66033E "Stimulus::_linkArgument"
public void _linkArgument(Instance argument1);
// -end- 33FF558C0190 _link_body33FEEA66033E "Stimulus::_linkArgument"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF558C0190 _unlink_body33FEEA66033E "Stimulus::_unlinkArgument"
public void _unlinkArgument(Instance argument1);
// -end- 33FF558C0190 _unlink_body33FEEA66033E "Stimulus::_unlinkArgument"

/** attaches a Sender.
 *
 *  @see #detachSender
 *  @see #getSender
 *  @see #containsSender
 */
// -beg- preserve=no 34030E17017C attach_head33FEEA66033E "Stimulus::attachSender"
public void attachSender(Instance sender1)
// -end- 34030E17017C attach_head33FEEA66033E "Stimulus::attachSender"
;     // empty

/** disconnect the currently attached Sender.
 *  @see #attachSender
 */
// -beg- preserve=no 34030E17017C detach_head33FEEA66033E "Stimulus::detachSender"
public Instance detachSender()
// -end- 34030E17017C detach_head33FEEA66033E "Stimulus::detachSender"
;     // empty

/** get the currently attached Sender.
 *  @see #attachSender
 */
// -beg- preserve=no 34030E17017C get_head33FEEA66033E "Stimulus::getSender"
public Instance getSender()
// -end- 34030E17017C get_head33FEEA66033E "Stimulus::getSender"
;     // empty

/** tests if there is a Sender attached.
 *  @see #attachSender
 */
// -beg- preserve=no 34030E17017C test_head33FEEA66033E "Stimulus::containsSender"
public boolean containsSender()
// -end- 34030E17017C test_head33FEEA66033E "Stimulus::containsSender"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 34030E17017C _link_body33FEEA66033E "Stimulus::_linkSender"
public void _linkSender(Instance sender1);
// -end- 34030E17017C _link_body33FEEA66033E "Stimulus::_linkSender"

/** DONT USE; link management internal
 */
// -beg- preserve=no 34030E17017C _unlink_body33FEEA66033E "Stimulus::_unlinkSender"
public void _unlinkSender(Instance sender1);
// -end- 34030E17017C _unlink_body33FEEA66033E "Stimulus::_unlinkSender"

/** attaches a Receiver.
 *
 *  @see #detachReceiver
 *  @see #getReceiver
 *  @see #containsReceiver
 */
// -beg- preserve=no 3650ECD502F8 attach_head33FEEA66033E "Stimulus::attachReceiver"
public void attachReceiver(Instance receiver1)
// -end- 3650ECD502F8 attach_head33FEEA66033E "Stimulus::attachReceiver"
;     // empty

/** disconnect the currently attached Receiver.
 *  @see #attachReceiver
 */
// -beg- preserve=no 3650ECD502F8 detach_head33FEEA66033E "Stimulus::detachReceiver"
public Instance detachReceiver()
// -end- 3650ECD502F8 detach_head33FEEA66033E "Stimulus::detachReceiver"
;     // empty

/** get the currently attached Receiver.
 *  @see #attachReceiver
 */
// -beg- preserve=no 3650ECD502F8 get_head33FEEA66033E "Stimulus::getReceiver"
public Instance getReceiver()
// -end- 3650ECD502F8 get_head33FEEA66033E "Stimulus::getReceiver"
;     // empty

/** tests if there is a Receiver attached.
 *  @see #attachReceiver
 */
// -beg- preserve=no 3650ECD502F8 test_head33FEEA66033E "Stimulus::containsReceiver"
public boolean containsReceiver()
// -end- 3650ECD502F8 test_head33FEEA66033E "Stimulus::containsReceiver"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650ECD502F8 _link_body33FEEA66033E "Stimulus::_linkReceiver"
public void _linkReceiver(Instance receiver1);
// -end- 3650ECD502F8 _link_body33FEEA66033E "Stimulus::_linkReceiver"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650ECD502F8 _unlink_body33FEEA66033E "Stimulus::_unlinkReceiver"
public void _unlinkReceiver(Instance receiver1);
// -end- 3650ECD502F8 _unlink_body33FEEA66033E "Stimulus::_unlinkReceiver"

/** attaches a CommunicationLink.
 *
 *  @see #detachCommunicationLink
 *  @see #getCommunicationLink
 *  @see #containsCommunicationLink
 */
// -beg- preserve=no 3650EE690082 attach_head33FEEA66033E "Stimulus::attachCommunicationLink"
public void attachCommunicationLink(Link communicationLink1)
// -end- 3650EE690082 attach_head33FEEA66033E "Stimulus::attachCommunicationLink"
;     // empty

/** disconnect the currently attached CommunicationLink.
 *  @see #attachCommunicationLink
 */
// -beg- preserve=no 3650EE690082 detach_head33FEEA66033E "Stimulus::detachCommunicationLink"
public Link detachCommunicationLink()
// -end- 3650EE690082 detach_head33FEEA66033E "Stimulus::detachCommunicationLink"
;     // empty

/** get the currently attached CommunicationLink.
 *  @see #attachCommunicationLink
 */
// -beg- preserve=no 3650EE690082 get_head33FEEA66033E "Stimulus::getCommunicationLink"
public Link getCommunicationLink()
// -end- 3650EE690082 get_head33FEEA66033E "Stimulus::getCommunicationLink"
;     // empty

/** tests if there is a CommunicationLink attached.
 *  @see #attachCommunicationLink
 */
// -beg- preserve=no 3650EE690082 test_head33FEEA66033E "Stimulus::containsCommunicationLink"
public boolean containsCommunicationLink()
// -end- 3650EE690082 test_head33FEEA66033E "Stimulus::containsCommunicationLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650EE690082 _link_body33FEEA66033E "Stimulus::_linkCommunicationLink"
public void _linkCommunicationLink(Link communicationLink1);
// -end- 3650EE690082 _link_body33FEEA66033E "Stimulus::_linkCommunicationLink"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650EE690082 _unlink_body33FEEA66033E "Stimulus::_unlinkCommunicationLink"
public void _unlinkCommunicationLink(Link communicationLink1);
// -end- 3650EE690082 _unlink_body33FEEA66033E "Stimulus::_unlinkCommunicationLink"

/** attaches a DispatchAction.
 *
 *  @see #detachDispatchAction
 *  @see #getDispatchAction
 *  @see #containsDispatchAction
 */
// -beg- preserve=no 3650F0CD0295 attach_head33FEEA66033E "Stimulus::attachDispatchAction"
public void attachDispatchAction(Action dispatchAction1)
// -end- 3650F0CD0295 attach_head33FEEA66033E "Stimulus::attachDispatchAction"
;     // empty

/** disconnect the currently attached DispatchAction.
 *  @see #attachDispatchAction
 */
// -beg- preserve=no 3650F0CD0295 detach_head33FEEA66033E "Stimulus::detachDispatchAction"
public Action detachDispatchAction()
// -end- 3650F0CD0295 detach_head33FEEA66033E "Stimulus::detachDispatchAction"
;     // empty

/** get the currently attached DispatchAction.
 *  @see #attachDispatchAction
 */
// -beg- preserve=no 3650F0CD0295 get_head33FEEA66033E "Stimulus::getDispatchAction"
public Action getDispatchAction()
// -end- 3650F0CD0295 get_head33FEEA66033E "Stimulus::getDispatchAction"
;     // empty

/** tests if there is a DispatchAction attached.
 *  @see #attachDispatchAction
 */
// -beg- preserve=no 3650F0CD0295 test_head33FEEA66033E "Stimulus::containsDispatchAction"
public boolean containsDispatchAction()
// -end- 3650F0CD0295 test_head33FEEA66033E "Stimulus::containsDispatchAction"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650F0CD0295 _link_body33FEEA66033E "Stimulus::_linkDispatchAction"
public void _linkDispatchAction(Action dispatchAction1);
// -end- 3650F0CD0295 _link_body33FEEA66033E "Stimulus::_linkDispatchAction"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650F0CD0295 _unlink_body33FEEA66033E "Stimulus::_unlinkDispatchAction"
public void _unlinkDispatchAction(Action dispatchAction1);
// -end- 3650F0CD0295 _unlink_body33FEEA66033E "Stimulus::_unlinkDispatchAction"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33FEEA66033E detail_end "Stimulus"

// -end- 33FEEA66033E detail_end "Stimulus"

}
