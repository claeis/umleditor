// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:11 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 328A484303D4 package "StateVertex"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 328A484303D4 package "StateVertex"

// -beg- preserve=no 328A484303D4 autoimport "StateVertex"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.behaviour.statemachines.Transition;
// -end- 328A484303D4 autoimport "StateVertex"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 328A484303D4 import "StateVertex"
import ch.ehi.uml1_4.foundation.core.ElementResidence;
// -end- 328A484303D4 import "StateVertex"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:11 $
 */
public interface StateVertex extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 328A484303D4 detail_begin "StateVertex"

// -end- 328A484303D4 detail_begin "StateVertex"

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
// -beg- preserve=no 36240CA4024E add_head328A484303D4 "ModelElement::addContainer"
public void addContainer(Component container1)
// -end- 36240CA4024E add_head328A484303D4 "ModelElement::addContainer"
;     // empty

/** add a link to a Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E addlink_head328A484303D4 "ModelElement::addContainerLink"
public void addContainerLink(ElementResidence container1)
// -end- 36240CA4024E addlink_head328A484303D4 "ModelElement::addContainerLink"
;     // empty

/** disconnect a Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E remove_head328A484303D4 "ModelElement::removeContainer"
public Component removeContainer(Component container1)
// -end- 36240CA4024E remove_head328A484303D4 "ModelElement::removeContainer"
;     // empty

/** tests if a given Container is connected.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E test_head328A484303D4 "ModelElement::containsContainer"
public boolean containsContainer(Component container1)
// -end- 36240CA4024E test_head328A484303D4 "ModelElement::containsContainer"
;     // empty

/** used to enumerate all connected Containers.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E get_all_head328A484303D4 "ModelElement::iteratorContainer"
public java.util.Iterator iteratorContainer()
// -end- 36240CA4024E get_all_head328A484303D4 "ModelElement::iteratorContainer"
;     // empty

/** disconnect all Containers.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E remove_all_head328A484303D4 "ModelElement::clearContainer"
public void clearContainer()
// -end- 36240CA4024E remove_all_head328A484303D4 "ModelElement::clearContainer"
;     // empty

/** returns the number of Containers.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E size_head328A484303D4 "ModelElement::sizeContainer"
public int sizeContainer()
// -end- 36240CA4024E size_head328A484303D4 "ModelElement::sizeContainer"
;     // empty

/** enumerate the link objects of currently connected Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E itlink_head328A484303D4 "ModelElement::getContainerLink"
public java.util.Iterator iteratorContainerLink()
// -end- 36240CA4024E itlink_head328A484303D4 "ModelElement::getContainerLink"
;     // empty

/** create a link class for a new link to a Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E createlink_head328A484303D4 "ModelElement::createContainerLink"
public ElementResidence createContainerLink()
// -end- 36240CA4024E createlink_head328A484303D4 "ModelElement::createContainerLink"
;     // empty

/** find a link object for a given Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E find_head328A484303D4 "ModelElement::findContainerLink"
public ElementResidence findContainerLink(Component container1)
// -end- 36240CA4024E find_head328A484303D4 "ModelElement::findContainerLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240CA4024E _link_body328A484303D4 "ModelElement::_linkContainer"
public void _linkContainer(ElementResidence container1);
// -end- 36240CA4024E _link_body328A484303D4 "ModelElement::_linkContainer"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240CA4024E _unlink_body328A484303D4 "ModelElement::_unlinkContainer"
public void _unlinkContainer(ElementResidence container1);
// -end- 36240CA4024E _unlink_body328A484303D4 "ModelElement::_unlinkContainer"

/** add a Outgoing.
 *
 *  @see #removeOutgoing
 *  @see #containsOutgoing
 *  @see #iteratorOutgoing
 *  @see #clearOutgoing
 *  @see #sizeOutgoing
 */
// -beg- preserve=no 3289028300D2 add_head328A484303D4 "StateVertex::addOutgoing"
public void addOutgoing(Transition outgoing1)
// -end- 3289028300D2 add_head328A484303D4 "StateVertex::addOutgoing"
;     // empty

/** disconnect a Outgoing.
 *  @see #addOutgoing
 */
// -beg- preserve=no 3289028300D2 remove_head328A484303D4 "StateVertex::removeOutgoing"
public Transition removeOutgoing(Transition outgoing1)
// -end- 3289028300D2 remove_head328A484303D4 "StateVertex::removeOutgoing"
;     // empty

/** tests if a given Outgoing is connected.
 *  @see #addOutgoing
 */
// -beg- preserve=no 3289028300D2 test_head328A484303D4 "StateVertex::containsOutgoing"
public boolean containsOutgoing(Transition outgoing1)
// -end- 3289028300D2 test_head328A484303D4 "StateVertex::containsOutgoing"
;     // empty

/** used to enumerate all connected Outgoings.
 *  @see #addOutgoing
 */
// -beg- preserve=no 3289028300D2 get_all_head328A484303D4 "StateVertex::iteratorOutgoing"
public java.util.Iterator iteratorOutgoing()
// -end- 3289028300D2 get_all_head328A484303D4 "StateVertex::iteratorOutgoing"
;     // empty

/** disconnect all Outgoings.
 *  @see #addOutgoing
 */
// -beg- preserve=no 3289028300D2 remove_all_head328A484303D4 "StateVertex::clearOutgoing"
public void clearOutgoing()
// -end- 3289028300D2 remove_all_head328A484303D4 "StateVertex::clearOutgoing"
;     // empty

/** returns the number of Outgoings.
 *  @see #addOutgoing
 */
// -beg- preserve=no 3289028300D2 size_head328A484303D4 "StateVertex::sizeOutgoing"
public int sizeOutgoing()
// -end- 3289028300D2 size_head328A484303D4 "StateVertex::sizeOutgoing"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3289028300D2 _link_body328A484303D4 "StateVertex::_linkOutgoing"
public void _linkOutgoing(Transition outgoing1);
// -end- 3289028300D2 _link_body328A484303D4 "StateVertex::_linkOutgoing"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3289028300D2 _unlink_body328A484303D4 "StateVertex::_unlinkOutgoing"
public void _unlinkOutgoing(Transition outgoing1);
// -end- 3289028300D2 _unlink_body328A484303D4 "StateVertex::_unlinkOutgoing"

/** add a Incoming.
 *
 *  @see #removeIncoming
 *  @see #containsIncoming
 *  @see #iteratorIncoming
 *  @see #clearIncoming
 *  @see #sizeIncoming
 */
// -beg- preserve=no 3289028D035C add_head328A484303D4 "StateVertex::addIncoming"
public void addIncoming(Transition incoming1)
// -end- 3289028D035C add_head328A484303D4 "StateVertex::addIncoming"
;     // empty

/** disconnect a Incoming.
 *  @see #addIncoming
 */
// -beg- preserve=no 3289028D035C remove_head328A484303D4 "StateVertex::removeIncoming"
public Transition removeIncoming(Transition incoming1)
// -end- 3289028D035C remove_head328A484303D4 "StateVertex::removeIncoming"
;     // empty

/** tests if a given Incoming is connected.
 *  @see #addIncoming
 */
// -beg- preserve=no 3289028D035C test_head328A484303D4 "StateVertex::containsIncoming"
public boolean containsIncoming(Transition incoming1)
// -end- 3289028D035C test_head328A484303D4 "StateVertex::containsIncoming"
;     // empty

/** used to enumerate all connected Incomings.
 *  @see #addIncoming
 */
// -beg- preserve=no 3289028D035C get_all_head328A484303D4 "StateVertex::iteratorIncoming"
public java.util.Iterator iteratorIncoming()
// -end- 3289028D035C get_all_head328A484303D4 "StateVertex::iteratorIncoming"
;     // empty

/** disconnect all Incomings.
 *  @see #addIncoming
 */
// -beg- preserve=no 3289028D035C remove_all_head328A484303D4 "StateVertex::clearIncoming"
public void clearIncoming()
// -end- 3289028D035C remove_all_head328A484303D4 "StateVertex::clearIncoming"
;     // empty

/** returns the number of Incomings.
 *  @see #addIncoming
 */
// -beg- preserve=no 3289028D035C size_head328A484303D4 "StateVertex::sizeIncoming"
public int sizeIncoming()
// -end- 3289028D035C size_head328A484303D4 "StateVertex::sizeIncoming"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3289028D035C _link_body328A484303D4 "StateVertex::_linkIncoming"
public void _linkIncoming(Transition incoming1);
// -end- 3289028D035C _link_body328A484303D4 "StateVertex::_linkIncoming"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3289028D035C _unlink_body328A484303D4 "StateVertex::_unlinkIncoming"
public void _unlinkIncoming(Transition incoming1);
// -end- 3289028D035C _unlink_body328A484303D4 "StateVertex::_unlinkIncoming"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 328A484303D4 detail_end "StateVertex"

// -end- 328A484303D4 detail_end "StateVertex"

}
