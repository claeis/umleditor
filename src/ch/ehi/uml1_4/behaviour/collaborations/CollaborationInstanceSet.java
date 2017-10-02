// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:50 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 39E8FB800232 package "CollaborationInstanceSet"
package ch.ehi.uml1_4.behaviour.collaborations;
// -end- 39E8FB800232 package "CollaborationInstanceSet"

// -beg- preserve=no 39E8FB800232 autoimport "CollaborationInstanceSet"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.collaborations.InteractionInstanceSet;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;

import java.util.Iterator;

import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.Link;
// -end- 39E8FB800232 autoimport "CollaborationInstanceSet"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39E8FB800232 import "CollaborationInstanceSet"

// -end- 39E8FB800232 import "CollaborationInstanceSet"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:50 $
 */
public interface CollaborationInstanceSet extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 39E8FB800232 detail_begin "CollaborationInstanceSet"

// -end- 39E8FB800232 detail_begin "CollaborationInstanceSet"

/** add a InteractionInstance.
 *
 *  @see #removeInteractionInstance
 *  @see #containsInteractionInstance
 *  @see #iteratorInteractionInstance
 *  @see #clearInteractionInstance
 *  @see #sizeInteractionInstance
 */
// -beg- preserve=no 39E8FB9602FD add_head39E8FB800232 "CollaborationInstanceSet::addInteractionInstance"
public void addInteractionInstance(InteractionInstanceSet interactionInstance1)
// -end- 39E8FB9602FD add_head39E8FB800232 "CollaborationInstanceSet::addInteractionInstance"
;     // empty

/** disconnect a InteractionInstance.
 *  @see #addInteractionInstance
 */
// -beg- preserve=no 39E8FB9602FD remove_head39E8FB800232 "CollaborationInstanceSet::removeInteractionInstance"
public InteractionInstanceSet removeInteractionInstance(InteractionInstanceSet interactionInstance1)
// -end- 39E8FB9602FD remove_head39E8FB800232 "CollaborationInstanceSet::removeInteractionInstance"
;     // empty

/** tests if a given InteractionInstance is connected.
 *  @see #addInteractionInstance
 */
// -beg- preserve=no 39E8FB9602FD test_head39E8FB800232 "CollaborationInstanceSet::containsInteractionInstance"
public boolean containsInteractionInstance(InteractionInstanceSet interactionInstance1)
// -end- 39E8FB9602FD test_head39E8FB800232 "CollaborationInstanceSet::containsInteractionInstance"
;     // empty

/** used to enumerate all connected InteractionInstances.
 *  @see #addInteractionInstance
 */
// -beg- preserve=no 39E8FB9602FD get_all_head39E8FB800232 "CollaborationInstanceSet::iteratorInteractionInstance"
public Iterator<?> iteratorInteractionInstance()
// -end- 39E8FB9602FD get_all_head39E8FB800232 "CollaborationInstanceSet::iteratorInteractionInstance"
;     // empty

/** disconnect all InteractionInstances.
 *  @see #addInteractionInstance
 */
// -beg- preserve=no 39E8FB9602FD remove_all_head39E8FB800232 "CollaborationInstanceSet::clearInteractionInstance"
public void clearInteractionInstance()
// -end- 39E8FB9602FD remove_all_head39E8FB800232 "CollaborationInstanceSet::clearInteractionInstance"
;     // empty

/** returns the number of InteractionInstances.
 *  @see #addInteractionInstance
 */
// -beg- preserve=no 39E8FB9602FD size_head39E8FB800232 "CollaborationInstanceSet::sizeInteractionInstance"
public int sizeInteractionInstance()
// -end- 39E8FB9602FD size_head39E8FB800232 "CollaborationInstanceSet::sizeInteractionInstance"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FB9602FD _link_body39E8FB800232 "CollaborationInstanceSet::_linkInteractionInstance"
public void _linkInteractionInstance(InteractionInstanceSet interactionInstance1);
// -end- 39E8FB9602FD _link_body39E8FB800232 "CollaborationInstanceSet::_linkInteractionInstance"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FB9602FD _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkInteractionInstance"
public void _unlinkInteractionInstance(InteractionInstanceSet interactionInstance1);
// -end- 39E8FB9602FD _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkInteractionInstance"

/** add a ParticipatingInstance.
 *
 *  @see #removeParticipatingInstance
 *  @see #containsParticipatingInstance
 *  @see #iteratorParticipatingInstance
 *  @see #clearParticipatingInstance
 *  @see #sizeParticipatingInstance
 */
// -beg- preserve=no 39E8FC61002E add_head39E8FB800232 "CollaborationInstanceSet::addParticipatingInstance"
public void addParticipatingInstance(Instance participatingInstance1)
// -end- 39E8FC61002E add_head39E8FB800232 "CollaborationInstanceSet::addParticipatingInstance"
;     // empty

/** disconnect a ParticipatingInstance.
 *  @see #addParticipatingInstance
 */
// -beg- preserve=no 39E8FC61002E remove_head39E8FB800232 "CollaborationInstanceSet::removeParticipatingInstance"
public Instance removeParticipatingInstance(Instance participatingInstance1)
// -end- 39E8FC61002E remove_head39E8FB800232 "CollaborationInstanceSet::removeParticipatingInstance"
;     // empty

/** tests if a given ParticipatingInstance is connected.
 *  @see #addParticipatingInstance
 */
// -beg- preserve=no 39E8FC61002E test_head39E8FB800232 "CollaborationInstanceSet::containsParticipatingInstance"
public boolean containsParticipatingInstance(Instance participatingInstance1)
// -end- 39E8FC61002E test_head39E8FB800232 "CollaborationInstanceSet::containsParticipatingInstance"
;     // empty

/** used to enumerate all connected ParticipatingInstances.
 *  @see #addParticipatingInstance
 */
// -beg- preserve=no 39E8FC61002E get_all_head39E8FB800232 "CollaborationInstanceSet::iteratorParticipatingInstance"
public Iterator<?> iteratorParticipatingInstance()
// -end- 39E8FC61002E get_all_head39E8FB800232 "CollaborationInstanceSet::iteratorParticipatingInstance"
;     // empty

/** disconnect all ParticipatingInstances.
 *  @see #addParticipatingInstance
 */
// -beg- preserve=no 39E8FC61002E remove_all_head39E8FB800232 "CollaborationInstanceSet::clearParticipatingInstance"
public void clearParticipatingInstance()
// -end- 39E8FC61002E remove_all_head39E8FB800232 "CollaborationInstanceSet::clearParticipatingInstance"
;     // empty

/** returns the number of ParticipatingInstances.
 *  @see #addParticipatingInstance
 */
// -beg- preserve=no 39E8FC61002E size_head39E8FB800232 "CollaborationInstanceSet::sizeParticipatingInstance"
public int sizeParticipatingInstance()
// -end- 39E8FC61002E size_head39E8FB800232 "CollaborationInstanceSet::sizeParticipatingInstance"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FC61002E _link_body39E8FB800232 "CollaborationInstanceSet::_linkParticipatingInstance"
public void _linkParticipatingInstance(Instance participatingInstance1);
// -end- 39E8FC61002E _link_body39E8FB800232 "CollaborationInstanceSet::_linkParticipatingInstance"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FC61002E _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkParticipatingInstance"
public void _unlinkParticipatingInstance(Instance participatingInstance1);
// -end- 39E8FC61002E _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkParticipatingInstance"

/** attaches a Collaboration.
 *
 *  @see #detachCollaboration
 *  @see #getCollaboration
 *  @see #containsCollaboration
 */
// -beg- preserve=no 39E8FF8203C8 attach_head39E8FB800232 "CollaborationInstanceSet::attachCollaboration"
public void attachCollaboration(Collaboration collaboration1)
// -end- 39E8FF8203C8 attach_head39E8FB800232 "CollaborationInstanceSet::attachCollaboration"
;     // empty

/** disconnect the currently attached Collaboration.
 *  @see #attachCollaboration
 */
// -beg- preserve=no 39E8FF8203C8 detach_head39E8FB800232 "CollaborationInstanceSet::detachCollaboration"
public Collaboration detachCollaboration()
// -end- 39E8FF8203C8 detach_head39E8FB800232 "CollaborationInstanceSet::detachCollaboration"
;     // empty

/** get the currently attached Collaboration.
 *  @see #attachCollaboration
 */
// -beg- preserve=no 39E8FF8203C8 get_head39E8FB800232 "CollaborationInstanceSet::getCollaboration"
public Collaboration getCollaboration()
// -end- 39E8FF8203C8 get_head39E8FB800232 "CollaborationInstanceSet::getCollaboration"
;     // empty

/** tests if there is a Collaboration attached.
 *  @see #attachCollaboration
 */
// -beg- preserve=no 39E8FF8203C8 test_head39E8FB800232 "CollaborationInstanceSet::containsCollaboration"
public boolean containsCollaboration()
// -end- 39E8FF8203C8 test_head39E8FB800232 "CollaborationInstanceSet::containsCollaboration"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FF8203C8 _link_body39E8FB800232 "CollaborationInstanceSet::_linkCollaboration"
public void _linkCollaboration(Collaboration collaboration1);
// -end- 39E8FF8203C8 _link_body39E8FB800232 "CollaborationInstanceSet::_linkCollaboration"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FF8203C8 _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkCollaboration"
public void _unlinkCollaboration(Collaboration collaboration1);
// -end- 39E8FF8203C8 _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkCollaboration"

/** add a ConstrainingElement.
 *
 *  @see #removeConstrainingElement
 *  @see #containsConstrainingElement
 *  @see #iteratorConstrainingElement
 *  @see #clearConstrainingElement
 *  @see #sizeConstrainingElement
 */
// -beg- preserve=no 39E9065C0222 add_head39E8FB800232 "CollaborationInstanceSet::addConstrainingElement"
public void addConstrainingElement(ModelElement constrainingElement1)
// -end- 39E9065C0222 add_head39E8FB800232 "CollaborationInstanceSet::addConstrainingElement"
;     // empty

/** disconnect a ConstrainingElement.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 39E9065C0222 remove_head39E8FB800232 "CollaborationInstanceSet::removeConstrainingElement"
public ModelElement removeConstrainingElement(ModelElement constrainingElement1)
// -end- 39E9065C0222 remove_head39E8FB800232 "CollaborationInstanceSet::removeConstrainingElement"
;     // empty

/** tests if a given ConstrainingElement is connected.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 39E9065C0222 test_head39E8FB800232 "CollaborationInstanceSet::containsConstrainingElement"
public boolean containsConstrainingElement(ModelElement constrainingElement1)
// -end- 39E9065C0222 test_head39E8FB800232 "CollaborationInstanceSet::containsConstrainingElement"
;     // empty

/** used to enumerate all connected ConstrainingElements.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 39E9065C0222 get_all_head39E8FB800232 "CollaborationInstanceSet::iteratorConstrainingElement"
public Iterator<?> iteratorConstrainingElement()
// -end- 39E9065C0222 get_all_head39E8FB800232 "CollaborationInstanceSet::iteratorConstrainingElement"
;     // empty

/** disconnect all ConstrainingElements.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 39E9065C0222 remove_all_head39E8FB800232 "CollaborationInstanceSet::clearConstrainingElement"
public void clearConstrainingElement()
// -end- 39E9065C0222 remove_all_head39E8FB800232 "CollaborationInstanceSet::clearConstrainingElement"
;     // empty

/** returns the number of ConstrainingElements.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 39E9065C0222 size_head39E8FB800232 "CollaborationInstanceSet::sizeConstrainingElement"
public int sizeConstrainingElement()
// -end- 39E9065C0222 size_head39E8FB800232 "CollaborationInstanceSet::sizeConstrainingElement"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9065C0222 _link_body39E8FB800232 "CollaborationInstanceSet::_linkConstrainingElement"
public void _linkConstrainingElement(ModelElement constrainingElement1);
// -end- 39E9065C0222 _link_body39E8FB800232 "CollaborationInstanceSet::_linkConstrainingElement"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9065C0222 _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkConstrainingElement"
public void _unlinkConstrainingElement(ModelElement constrainingElement1);
// -end- 39E9065C0222 _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkConstrainingElement"

/** add a ParticipatingLink.
 *
 *  @see #removeParticipatingLink
 *  @see #containsParticipatingLink
 *  @see #iteratorParticipatingLink
 *  @see #clearParticipatingLink
 *  @see #sizeParticipatingLink
 */
// -beg- preserve=no 39E9069600EA add_head39E8FB800232 "CollaborationInstanceSet::addParticipatingLink"
public void addParticipatingLink(Link participatingLink1)
// -end- 39E9069600EA add_head39E8FB800232 "CollaborationInstanceSet::addParticipatingLink"
;     // empty

/** disconnect a ParticipatingLink.
 *  @see #addParticipatingLink
 */
// -beg- preserve=no 39E9069600EA remove_head39E8FB800232 "CollaborationInstanceSet::removeParticipatingLink"
public Link removeParticipatingLink(Link participatingLink1)
// -end- 39E9069600EA remove_head39E8FB800232 "CollaborationInstanceSet::removeParticipatingLink"
;     // empty

/** tests if a given ParticipatingLink is connected.
 *  @see #addParticipatingLink
 */
// -beg- preserve=no 39E9069600EA test_head39E8FB800232 "CollaborationInstanceSet::containsParticipatingLink"
public boolean containsParticipatingLink(Link participatingLink1)
// -end- 39E9069600EA test_head39E8FB800232 "CollaborationInstanceSet::containsParticipatingLink"
;     // empty

/** used to enumerate all connected ParticipatingLinks.
 *  @see #addParticipatingLink
 */
// -beg- preserve=no 39E9069600EA get_all_head39E8FB800232 "CollaborationInstanceSet::iteratorParticipatingLink"
public Iterator<?> iteratorParticipatingLink()
// -end- 39E9069600EA get_all_head39E8FB800232 "CollaborationInstanceSet::iteratorParticipatingLink"
;     // empty

/** disconnect all ParticipatingLinks.
 *  @see #addParticipatingLink
 */
// -beg- preserve=no 39E9069600EA remove_all_head39E8FB800232 "CollaborationInstanceSet::clearParticipatingLink"
public void clearParticipatingLink()
// -end- 39E9069600EA remove_all_head39E8FB800232 "CollaborationInstanceSet::clearParticipatingLink"
;     // empty

/** returns the number of ParticipatingLinks.
 *  @see #addParticipatingLink
 */
// -beg- preserve=no 39E9069600EA size_head39E8FB800232 "CollaborationInstanceSet::sizeParticipatingLink"
public int sizeParticipatingLink()
// -end- 39E9069600EA size_head39E8FB800232 "CollaborationInstanceSet::sizeParticipatingLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9069600EA _link_body39E8FB800232 "CollaborationInstanceSet::_linkParticipatingLink"
public void _linkParticipatingLink(Link participatingLink1);
// -end- 39E9069600EA _link_body39E8FB800232 "CollaborationInstanceSet::_linkParticipatingLink"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9069600EA _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkParticipatingLink"
public void _unlinkParticipatingLink(Link participatingLink1);
// -end- 39E9069600EA _unlink_body39E8FB800232 "CollaborationInstanceSet::_unlinkParticipatingLink"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 39E8FB800232 detail_end "CollaborationInstanceSet"

// -end- 39E8FB800232 detail_end "CollaborationInstanceSet"

}
