// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:00 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327BC77C038E package "Instance"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 327BC77C038E package "Instance"

// -beg- preserve=no 327BC77C038E autoimport "Instance"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.collaborations.Interaction;
import ch.ehi.uml1_4.behaviour.commonbehavior.ActionInstance;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.behaviour.commonbehavior.AttributeLink;
import ch.ehi.uml1_4.behaviour.commonbehavior.LinkEnd;
import ch.ehi.uml1_4.behaviour.commonbehavior.Stimulus;
import ch.ehi.uml1_4.behaviour.commonbehavior.ComponentInstance;
import ch.ehi.uml1_4.behaviour.commonbehavior.Link;
// -end- 327BC77C038E autoimport "Instance"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327BC77C038E import "Instance"

// -end- 327BC77C038E import "Instance"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:00 $
 */
public interface Instance extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327BC77C038E detail_begin "Instance"

  // -end- 327BC77C038E detail_begin "Instance"

  /** attaches a Interaction.
   *  
   *  @see #detachInteraction
   *  @see #getInteraction
   *  @see #containsInteraction
   */
  // -beg- preserve=no 328A5B570051 attach_head327BC77C038E "Instance::attachInteraction"
  public void attachInteraction(Interaction interaction1)
  // -end- 328A5B570051 attach_head327BC77C038E "Instance::attachInteraction"
    ; // empty

  /** disconnect the currently attached Interaction.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 328A5B570051 detach_head327BC77C038E "Instance::detachInteraction"
  public Interaction detachInteraction()
  // -end- 328A5B570051 detach_head327BC77C038E "Instance::detachInteraction"
    ; // empty

  /** get the currently attached Interaction.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 328A5B570051 get_head327BC77C038E "Instance::getInteraction"
  public Interaction getInteraction()
  // -end- 328A5B570051 get_head327BC77C038E "Instance::getInteraction"
    ; // empty

  /** tests if there is a Interaction attached.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 328A5B570051 test_head327BC77C038E "Instance::containsInteraction"
  public boolean containsInteraction()
  // -end- 328A5B570051 test_head327BC77C038E "Instance::containsInteraction"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5B570051 _link_body327BC77C038E "Instance::_linkInteraction"
  public void _linkInteraction(Interaction interaction1);
  // -end- 328A5B570051 _link_body327BC77C038E "Instance::_linkInteraction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5B570051 _unlink_body327BC77C038E "Instance::_unlinkInteraction"
  public void _unlinkInteraction(Interaction interaction1);
  // -end- 328A5B570051 _unlink_body327BC77C038E "Instance::_unlinkInteraction"

  /** add a ActionInstance.
   *  
   *  @see #removeActionInstance
   *  @see #containsActionInstance
   *  @see #iteratorActionInstance
   *  @see #clearActionInstance
   *  @see #sizeActionInstance
   */
  // -beg- preserve=no 32B59CAB00FB add_head327BC77C038E "Instance::addActionInstance"
  public void addActionInstance(ActionInstance actionInstance1)
  // -end- 32B59CAB00FB add_head327BC77C038E "Instance::addActionInstance"
    ; // empty

  /** disconnect a ActionInstance.
   *  @see #addActionInstance
   */
  // -beg- preserve=no 32B59CAB00FB remove_head327BC77C038E "Instance::removeActionInstance"
  public ActionInstance removeActionInstance(ActionInstance actionInstance1)
  // -end- 32B59CAB00FB remove_head327BC77C038E "Instance::removeActionInstance"
    ; // empty

  /** tests if a given ActionInstance is connected.
   *  @see #addActionInstance
   */
  // -beg- preserve=no 32B59CAB00FB test_head327BC77C038E "Instance::containsActionInstance"
  public boolean containsActionInstance(ActionInstance actionInstance1)
  // -end- 32B59CAB00FB test_head327BC77C038E "Instance::containsActionInstance"
    ; // empty

  /** used to enumerate all connected ActionInstances.
   *  @see #addActionInstance
   */
  // -beg- preserve=no 32B59CAB00FB get_all_head327BC77C038E "Instance::iteratorActionInstance"
  public java.util.Iterator iteratorActionInstance()
  // -end- 32B59CAB00FB get_all_head327BC77C038E "Instance::iteratorActionInstance"
    ; // empty

  /** disconnect all ActionInstances.
   *  @see #addActionInstance
   */
  // -beg- preserve=no 32B59CAB00FB remove_all_head327BC77C038E "Instance::clearActionInstance"
  public void clearActionInstance()
  // -end- 32B59CAB00FB remove_all_head327BC77C038E "Instance::clearActionInstance"
    ; // empty

  /** returns the number of ActionInstances.
   *  @see #addActionInstance
   */
  // -beg- preserve=no 32B59CAB00FB size_head327BC77C038E "Instance::sizeActionInstance"
  public int sizeActionInstance()
  // -end- 32B59CAB00FB size_head327BC77C038E "Instance::sizeActionInstance"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B59CAB00FB _link_body327BC77C038E "Instance::_linkActionInstance"
  public void _linkActionInstance(ActionInstance actionInstance1);
  // -end- 32B59CAB00FB _link_body327BC77C038E "Instance::_linkActionInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B59CAB00FB _unlink_body327BC77C038E "Instance::_unlinkActionInstance"
  public void _unlinkActionInstance(ActionInstance actionInstance1);
  // -end- 32B59CAB00FB _unlink_body327BC77C038E "Instance::_unlinkActionInstance"

  /** add a CollaborationInstanceSet.
   *  
   *  @see #removeCollaborationInstanceSet
   *  @see #containsCollaborationInstanceSet
   *  @see #iteratorCollaborationInstanceSet
   *  @see #clearCollaborationInstanceSet
   *  @see #sizeCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 add_head327BC77C038E "ModelElement::addCollaborationInstanceSet"
  public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 add_head327BC77C038E "ModelElement::addCollaborationInstanceSet"
    ; // empty

  /** disconnect a CollaborationInstanceSet.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_head327BC77C038E "ModelElement::removeCollaborationInstanceSet"
  public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 remove_head327BC77C038E "ModelElement::removeCollaborationInstanceSet"
    ; // empty

  /** tests if a given CollaborationInstanceSet is connected.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 test_head327BC77C038E "ModelElement::containsCollaborationInstanceSet"
  public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 test_head327BC77C038E "ModelElement::containsCollaborationInstanceSet"
    ; // empty

  /** used to enumerate all connected CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 get_all_head327BC77C038E "ModelElement::iteratorCollaborationInstanceSet"
  public java.util.Iterator iteratorCollaborationInstanceSet()
  // -end- 39E9065C0186 get_all_head327BC77C038E "ModelElement::iteratorCollaborationInstanceSet"
    ; // empty

  /** disconnect all CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_all_head327BC77C038E "ModelElement::clearCollaborationInstanceSet"
  public void clearCollaborationInstanceSet()
  // -end- 39E9065C0186 remove_all_head327BC77C038E "ModelElement::clearCollaborationInstanceSet"
    ; // empty

  /** returns the number of CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 size_head327BC77C038E "ModelElement::sizeCollaborationInstanceSet"
  public int sizeCollaborationInstanceSet()
  // -end- 39E9065C0186 size_head327BC77C038E "ModelElement::sizeCollaborationInstanceSet"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _link_body327BC77C038E "ModelElement::_linkCollaborationInstanceSet"
  public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
  // -end- 39E9065C0186 _link_body327BC77C038E "ModelElement::_linkCollaborationInstanceSet"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _unlink_body327BC77C038E "ModelElement::_unlinkCollaborationInstanceSet"
  public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
  // -end- 39E9065C0186 _unlink_body327BC77C038E "ModelElement::_unlinkCollaborationInstanceSet"

  /** add a PlayedRole.
   *  
   *  @see #removePlayedRole
   *  @see #containsPlayedRole
   *  @see #iteratorPlayedRole
   *  @see #clearPlayedRole
   *  @see #sizePlayedRole
   */
  // -beg- preserve=no 39E8FF920251 add_head327BC77C038E "Instance::addPlayedRole"
  public void addPlayedRole(ClassifierRole playedRole1)
  // -end- 39E8FF920251 add_head327BC77C038E "Instance::addPlayedRole"
    ; // empty

  /** disconnect a PlayedRole.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FF920251 remove_head327BC77C038E "Instance::removePlayedRole"
  public ClassifierRole removePlayedRole(ClassifierRole playedRole1)
  // -end- 39E8FF920251 remove_head327BC77C038E "Instance::removePlayedRole"
    ; // empty

  /** tests if a given PlayedRole is connected.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FF920251 test_head327BC77C038E "Instance::containsPlayedRole"
  public boolean containsPlayedRole(ClassifierRole playedRole1)
  // -end- 39E8FF920251 test_head327BC77C038E "Instance::containsPlayedRole"
    ; // empty

  /** used to enumerate all connected PlayedRoles.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FF920251 get_all_head327BC77C038E "Instance::iteratorPlayedRole"
  public java.util.Iterator iteratorPlayedRole()
  // -end- 39E8FF920251 get_all_head327BC77C038E "Instance::iteratorPlayedRole"
    ; // empty

  /** disconnect all PlayedRoles.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FF920251 remove_all_head327BC77C038E "Instance::clearPlayedRole"
  public void clearPlayedRole()
  // -end- 39E8FF920251 remove_all_head327BC77C038E "Instance::clearPlayedRole"
    ; // empty

  /** returns the number of PlayedRoles.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FF920251 size_head327BC77C038E "Instance::sizePlayedRole"
  public int sizePlayedRole()
  // -end- 39E8FF920251 size_head327BC77C038E "Instance::sizePlayedRole"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF920251 _link_body327BC77C038E "Instance::_linkPlayedRole"
  public void _linkPlayedRole(ClassifierRole playedRole1);
  // -end- 39E8FF920251 _link_body327BC77C038E "Instance::_linkPlayedRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF920251 _unlink_body327BC77C038E "Instance::_unlinkPlayedRole"
  public void _unlinkPlayedRole(ClassifierRole playedRole1);
  // -end- 39E8FF920251 _unlink_body327BC77C038E "Instance::_unlinkPlayedRole"

  /** add a Classifier.
   *  
   *  @see #removeClassifier
   *  @see #containsClassifier
   *  @see #iteratorClassifier
   *  @see #clearClassifier
   *  @see #sizeClassifier
   */
  // -beg- preserve=no 33CAD7E900AA add_head327BC77C038E "Instance::addClassifier"
  public void addClassifier(Classifier classifier1)
  // -end- 33CAD7E900AA add_head327BC77C038E "Instance::addClassifier"
    ; // empty

  /** disconnect a Classifier.
   *  @see #addClassifier
   */
  // -beg- preserve=no 33CAD7E900AA remove_head327BC77C038E "Instance::removeClassifier"
  public Classifier removeClassifier(Classifier classifier1)
  // -end- 33CAD7E900AA remove_head327BC77C038E "Instance::removeClassifier"
    ; // empty

  /** tests if a given Classifier is connected.
   *  @see #addClassifier
   */
  // -beg- preserve=no 33CAD7E900AA test_head327BC77C038E "Instance::containsClassifier"
  public boolean containsClassifier(Classifier classifier1)
  // -end- 33CAD7E900AA test_head327BC77C038E "Instance::containsClassifier"
    ; // empty

  /** used to enumerate all connected Classifiers.
   *  @see #addClassifier
   */
  // -beg- preserve=no 33CAD7E900AA get_all_head327BC77C038E "Instance::iteratorClassifier"
  public java.util.Iterator iteratorClassifier()
  // -end- 33CAD7E900AA get_all_head327BC77C038E "Instance::iteratorClassifier"
    ; // empty

  /** disconnect all Classifiers.
   *  @see #addClassifier
   */
  // -beg- preserve=no 33CAD7E900AA remove_all_head327BC77C038E "Instance::clearClassifier"
  public void clearClassifier()
  // -end- 33CAD7E900AA remove_all_head327BC77C038E "Instance::clearClassifier"
    ; // empty

  /** returns the number of Classifiers.
   *  @see #addClassifier
   */
  // -beg- preserve=no 33CAD7E900AA size_head327BC77C038E "Instance::sizeClassifier"
  public int sizeClassifier()
  // -end- 33CAD7E900AA size_head327BC77C038E "Instance::sizeClassifier"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AA _link_body327BC77C038E "Instance::_linkClassifier"
  public void _linkClassifier(Classifier classifier1);
  // -end- 33CAD7E900AA _link_body327BC77C038E "Instance::_linkClassifier"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AA _unlink_body327BC77C038E "Instance::_unlinkClassifier"
  public void _unlinkClassifier(Classifier classifier1);
  // -end- 33CAD7E900AA _unlink_body327BC77C038E "Instance::_unlinkClassifier"

  /** add a AttributeLink.
   *  
   *  @see #removeAttributeLink
   *  @see #containsAttributeLink
   *  @see #iteratorAttributeLink
   *  @see #clearAttributeLink
   *  @see #sizeAttributeLink
   */
  // -beg- preserve=no 33DBC1A401EB add_head327BC77C038E "Instance::addAttributeLink"
  public void addAttributeLink(AttributeLink attributeLink1)
  // -end- 33DBC1A401EB add_head327BC77C038E "Instance::addAttributeLink"
    ; // empty

  /** disconnect a AttributeLink.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC1A401EB remove_head327BC77C038E "Instance::removeAttributeLink"
  public AttributeLink removeAttributeLink(AttributeLink attributeLink1)
  // -end- 33DBC1A401EB remove_head327BC77C038E "Instance::removeAttributeLink"
    ; // empty

  /** tests if a given AttributeLink is connected.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC1A401EB test_head327BC77C038E "Instance::containsAttributeLink"
  public boolean containsAttributeLink(AttributeLink attributeLink1)
  // -end- 33DBC1A401EB test_head327BC77C038E "Instance::containsAttributeLink"
    ; // empty

  /** used to enumerate all connected AttributeLinks.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC1A401EB get_all_head327BC77C038E "Instance::iteratorAttributeLink"
  public java.util.Iterator iteratorAttributeLink()
  // -end- 33DBC1A401EB get_all_head327BC77C038E "Instance::iteratorAttributeLink"
    ; // empty

  /** disconnect all AttributeLinks.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC1A401EB remove_all_head327BC77C038E "Instance::clearAttributeLink"
  public void clearAttributeLink()
  // -end- 33DBC1A401EB remove_all_head327BC77C038E "Instance::clearAttributeLink"
    ; // empty

  /** returns the number of AttributeLinks.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC1A401EB size_head327BC77C038E "Instance::sizeAttributeLink"
  public int sizeAttributeLink()
  // -end- 33DBC1A401EB size_head327BC77C038E "Instance::sizeAttributeLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBC1A401EB _link_body327BC77C038E "Instance::_linkAttributeLink"
  public void _linkAttributeLink(AttributeLink attributeLink1);
  // -end- 33DBC1A401EB _link_body327BC77C038E "Instance::_linkAttributeLink"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBC1A401EB _unlink_body327BC77C038E "Instance::_unlinkAttributeLink"
  public void _unlinkAttributeLink(AttributeLink attributeLink1);
  // -end- 33DBC1A401EB _unlink_body327BC77C038E "Instance::_unlinkAttributeLink"

  /** add a LinkEnd.
   *  
   *  @see #removeLinkEnd
   *  @see #containsLinkEnd
   *  @see #iteratorLinkEnd
   *  @see #clearLinkEnd
   *  @see #sizeLinkEnd
   */
  // -beg- preserve=no 33DBC1DC01FE add_head327BC77C038E "Instance::addLinkEnd"
  public void addLinkEnd(LinkEnd linkEnd1)
  // -end- 33DBC1DC01FE add_head327BC77C038E "Instance::addLinkEnd"
    ; // empty

  /** disconnect a LinkEnd.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 33DBC1DC01FE remove_head327BC77C038E "Instance::removeLinkEnd"
  public LinkEnd removeLinkEnd(LinkEnd linkEnd1)
  // -end- 33DBC1DC01FE remove_head327BC77C038E "Instance::removeLinkEnd"
    ; // empty

  /** tests if a given LinkEnd is connected.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 33DBC1DC01FE test_head327BC77C038E "Instance::containsLinkEnd"
  public boolean containsLinkEnd(LinkEnd linkEnd1)
  // -end- 33DBC1DC01FE test_head327BC77C038E "Instance::containsLinkEnd"
    ; // empty

  /** used to enumerate all connected LinkEnds.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 33DBC1DC01FE get_all_head327BC77C038E "Instance::iteratorLinkEnd"
  public java.util.Iterator iteratorLinkEnd()
  // -end- 33DBC1DC01FE get_all_head327BC77C038E "Instance::iteratorLinkEnd"
    ; // empty

  /** disconnect all LinkEnds.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 33DBC1DC01FE remove_all_head327BC77C038E "Instance::clearLinkEnd"
  public void clearLinkEnd()
  // -end- 33DBC1DC01FE remove_all_head327BC77C038E "Instance::clearLinkEnd"
    ; // empty

  /** returns the number of LinkEnds.
   *  @see #addLinkEnd
   */
  // -beg- preserve=no 33DBC1DC01FE size_head327BC77C038E "Instance::sizeLinkEnd"
  public int sizeLinkEnd()
  // -end- 33DBC1DC01FE size_head327BC77C038E "Instance::sizeLinkEnd"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBC1DC01FE _link_body327BC77C038E "Instance::_linkLinkEnd"
  public void _linkLinkEnd(LinkEnd linkEnd1);
  // -end- 33DBC1DC01FE _link_body327BC77C038E "Instance::_linkLinkEnd"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBC1DC01FE _unlink_body327BC77C038E "Instance::_unlinkLinkEnd"
  public void _unlinkLinkEnd(LinkEnd linkEnd1);
  // -end- 33DBC1DC01FE _unlink_body327BC77C038E "Instance::_unlinkLinkEnd"

  /** add a Slot.
   *  
   *  @see #removeSlot
   *  @see #containsSlot
   *  @see #iteratorSlot
   *  @see #clearSlot
   *  @see #sizeSlot
   */
  // -beg- preserve=no 33FF4EFA0137 add_head327BC77C038E "Instance::addSlot"
  public void addSlot(AttributeLink slot1)
  // -end- 33FF4EFA0137 add_head327BC77C038E "Instance::addSlot"
    ; // empty

  /** disconnect a Slot.
   *  @see #addSlot
   */
  // -beg- preserve=no 33FF4EFA0137 remove_head327BC77C038E "Instance::removeSlot"
  public AttributeLink removeSlot(AttributeLink slot1)
  // -end- 33FF4EFA0137 remove_head327BC77C038E "Instance::removeSlot"
    ; // empty

  /** tests if a given Slot is connected.
   *  @see #addSlot
   */
  // -beg- preserve=no 33FF4EFA0137 test_head327BC77C038E "Instance::containsSlot"
  public boolean containsSlot(AttributeLink slot1)
  // -end- 33FF4EFA0137 test_head327BC77C038E "Instance::containsSlot"
    ; // empty

  /** used to enumerate all connected Slots.
   *  @see #addSlot
   */
  // -beg- preserve=no 33FF4EFA0137 get_all_head327BC77C038E "Instance::iteratorSlot"
  public java.util.Iterator iteratorSlot()
  // -end- 33FF4EFA0137 get_all_head327BC77C038E "Instance::iteratorSlot"
    ; // empty

  /** disconnect all Slots.
   *  @see #addSlot
   */
  // -beg- preserve=no 33FF4EFA0137 remove_all_head327BC77C038E "Instance::clearSlot"
  public void clearSlot()
  // -end- 33FF4EFA0137 remove_all_head327BC77C038E "Instance::clearSlot"
    ; // empty

  /** returns the number of Slots.
   *  @see #addSlot
   */
  // -beg- preserve=no 33FF4EFA0137 size_head327BC77C038E "Instance::sizeSlot"
  public int sizeSlot()
  // -end- 33FF4EFA0137 size_head327BC77C038E "Instance::sizeSlot"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FF4EFA0137 _link_body327BC77C038E "Instance::_linkSlot"
  public void _linkSlot(AttributeLink slot1);
  // -end- 33FF4EFA0137 _link_body327BC77C038E "Instance::_linkSlot"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FF4EFA0137 _unlink_body327BC77C038E "Instance::_unlinkSlot"
  public void _unlinkSlot(AttributeLink slot1);
  // -end- 33FF4EFA0137 _unlink_body327BC77C038E "Instance::_unlinkSlot"

  /** add a Stimulus.
   *  
   *  @see #removeStimulus
   *  @see #containsStimulus
   *  @see #iteratorStimulus
   *  @see #clearStimulus
   *  @see #sizeStimulus
   */
  // -beg- preserve=no 33FF558C015E add_head327BC77C038E "Instance::addStimulus"
  public void addStimulus(Stimulus stimulus1)
  // -end- 33FF558C015E add_head327BC77C038E "Instance::addStimulus"
    ; // empty

  /** disconnect a Stimulus.
   *  @see #addStimulus
   */
  // -beg- preserve=no 33FF558C015E remove_head327BC77C038E "Instance::removeStimulus"
  public Stimulus removeStimulus(Stimulus stimulus1)
  // -end- 33FF558C015E remove_head327BC77C038E "Instance::removeStimulus"
    ; // empty

  /** tests if a given Stimulus is connected.
   *  @see #addStimulus
   */
  // -beg- preserve=no 33FF558C015E test_head327BC77C038E "Instance::containsStimulus"
  public boolean containsStimulus(Stimulus stimulus1)
  // -end- 33FF558C015E test_head327BC77C038E "Instance::containsStimulus"
    ; // empty

  /** used to enumerate all connected Stimuluss.
   *  @see #addStimulus
   */
  // -beg- preserve=no 33FF558C015E get_all_head327BC77C038E "Instance::iteratorStimulus"
  public java.util.Iterator iteratorStimulus()
  // -end- 33FF558C015E get_all_head327BC77C038E "Instance::iteratorStimulus"
    ; // empty

  /** disconnect all Stimuluss.
   *  @see #addStimulus
   */
  // -beg- preserve=no 33FF558C015E remove_all_head327BC77C038E "Instance::clearStimulus"
  public void clearStimulus()
  // -end- 33FF558C015E remove_all_head327BC77C038E "Instance::clearStimulus"
    ; // empty

  /** returns the number of Stimuluss.
   *  @see #addStimulus
   */
  // -beg- preserve=no 33FF558C015E size_head327BC77C038E "Instance::sizeStimulus"
  public int sizeStimulus()
  // -end- 33FF558C015E size_head327BC77C038E "Instance::sizeStimulus"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FF558C015E _link_body327BC77C038E "Instance::_linkStimulus"
  public void _linkStimulus(Stimulus stimulus1);
  // -end- 33FF558C015E _link_body327BC77C038E "Instance::_linkStimulus"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FF558C015E _unlink_body327BC77C038E "Instance::_unlinkStimulus"
  public void _unlinkStimulus(Stimulus stimulus1);
  // -end- 33FF558C015E _unlink_body327BC77C038E "Instance::_unlinkStimulus"

  /** attaches a ComponentInstance.
   *  
   *  @see #detachComponentInstance
   *  @see #getComponentInstance
   *  @see #containsComponentInstance
   */
  // -beg- preserve=no 364B65EA0154 attach_head327BC77C038E "Instance::attachComponentInstance"
  public void attachComponentInstance(ComponentInstance componentInstance1)
  // -end- 364B65EA0154 attach_head327BC77C038E "Instance::attachComponentInstance"
    ; // empty

  /** disconnect the currently attached ComponentInstance.
   *  @see #attachComponentInstance
   */
  // -beg- preserve=no 364B65EA0154 detach_head327BC77C038E "Instance::detachComponentInstance"
  public ComponentInstance detachComponentInstance()
  // -end- 364B65EA0154 detach_head327BC77C038E "Instance::detachComponentInstance"
    ; // empty

  /** get the currently attached ComponentInstance.
   *  @see #attachComponentInstance
   */
  // -beg- preserve=no 364B65EA0154 get_head327BC77C038E "Instance::getComponentInstance"
  public ComponentInstance getComponentInstance()
  // -end- 364B65EA0154 get_head327BC77C038E "Instance::getComponentInstance"
    ; // empty

  /** tests if there is a ComponentInstance attached.
   *  @see #attachComponentInstance
   */
  // -beg- preserve=no 364B65EA0154 test_head327BC77C038E "Instance::containsComponentInstance"
  public boolean containsComponentInstance()
  // -end- 364B65EA0154 test_head327BC77C038E "Instance::containsComponentInstance"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364B65EA0154 _link_body327BC77C038E "Instance::_linkComponentInstance"
  public void _linkComponentInstance(ComponentInstance componentInstance1);
  // -end- 364B65EA0154 _link_body327BC77C038E "Instance::_linkComponentInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364B65EA0154 _unlink_body327BC77C038E "Instance::_unlinkComponentInstance"
  public void _unlinkComponentInstance(ComponentInstance componentInstance1);
  // -end- 364B65EA0154 _unlink_body327BC77C038E "Instance::_unlinkComponentInstance"

  /** attaches a Owner.
   *  
   *  @see #detachOwner
   *  @see #getOwner
   *  @see #containsOwner
   */
  // -beg- preserve=no 3973156F0245 attach_head327BC77C038E "Instance::attachOwner"
  public void attachOwner(Instance owner1)
  // -end- 3973156F0245 attach_head327BC77C038E "Instance::attachOwner"
    ; // empty

  /** disconnect the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 3973156F0245 detach_head327BC77C038E "Instance::detachOwner"
  public Instance detachOwner()
  // -end- 3973156F0245 detach_head327BC77C038E "Instance::detachOwner"
    ; // empty

  /** get the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 3973156F0245 get_head327BC77C038E "Instance::getOwner"
  public Instance getOwner()
  // -end- 3973156F0245 get_head327BC77C038E "Instance::getOwner"
    ; // empty

  /** tests if there is a Owner attached.
   *  @see #attachOwner
   */
  // -beg- preserve=no 3973156F0245 test_head327BC77C038E "Instance::containsOwner"
  public boolean containsOwner()
  // -end- 3973156F0245 test_head327BC77C038E "Instance::containsOwner"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3973156F0245 _link_body327BC77C038E "Instance::_linkOwner"
  public void _linkOwner(Instance owner1);
  // -end- 3973156F0245 _link_body327BC77C038E "Instance::_linkOwner"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3973156F0245 _unlink_body327BC77C038E "Instance::_unlinkOwner"
  public void _unlinkOwner(Instance owner1);
  // -end- 3973156F0245 _unlink_body327BC77C038E "Instance::_unlinkOwner"

  /** add a OwnedInstance.
   *  
   *  @see #removeOwnedInstance
   *  @see #containsOwnedInstance
   *  @see #iteratorOwnedInstance
   *  @see #clearOwnedInstance
   *  @see #sizeOwnedInstance
   */
  // -beg- preserve=no 3973156F0259 add_head327BC77C038E "Instance::addOwnedInstance"
  public void addOwnedInstance(Instance ownedInstance1)
  // -end- 3973156F0259 add_head327BC77C038E "Instance::addOwnedInstance"
    ; // empty

  /** disconnect a OwnedInstance.
   *  @see #addOwnedInstance
   */
  // -beg- preserve=no 3973156F0259 remove_head327BC77C038E "Instance::removeOwnedInstance"
  public Instance removeOwnedInstance(Instance ownedInstance1)
  // -end- 3973156F0259 remove_head327BC77C038E "Instance::removeOwnedInstance"
    ; // empty

  /** tests if a given OwnedInstance is connected.
   *  @see #addOwnedInstance
   */
  // -beg- preserve=no 3973156F0259 test_head327BC77C038E "Instance::containsOwnedInstance"
  public boolean containsOwnedInstance(Instance ownedInstance1)
  // -end- 3973156F0259 test_head327BC77C038E "Instance::containsOwnedInstance"
    ; // empty

  /** used to enumerate all connected OwnedInstances.
   *  @see #addOwnedInstance
   */
  // -beg- preserve=no 3973156F0259 get_all_head327BC77C038E "Instance::iteratorOwnedInstance"
  public java.util.Iterator iteratorOwnedInstance()
  // -end- 3973156F0259 get_all_head327BC77C038E "Instance::iteratorOwnedInstance"
    ; // empty

  /** disconnect all OwnedInstances.
   *  @see #addOwnedInstance
   */
  // -beg- preserve=no 3973156F0259 remove_all_head327BC77C038E "Instance::clearOwnedInstance"
  public void clearOwnedInstance()
  // -end- 3973156F0259 remove_all_head327BC77C038E "Instance::clearOwnedInstance"
    ; // empty

  /** returns the number of OwnedInstances.
   *  @see #addOwnedInstance
   */
  // -beg- preserve=no 3973156F0259 size_head327BC77C038E "Instance::sizeOwnedInstance"
  public int sizeOwnedInstance()
  // -end- 3973156F0259 size_head327BC77C038E "Instance::sizeOwnedInstance"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3973156F0259 _link_body327BC77C038E "Instance::_linkOwnedInstance"
  public void _linkOwnedInstance(Instance ownedInstance1);
  // -end- 3973156F0259 _link_body327BC77C038E "Instance::_linkOwnedInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3973156F0259 _unlink_body327BC77C038E "Instance::_unlinkOwnedInstance"
  public void _unlinkOwnedInstance(Instance ownedInstance1);
  // -end- 3973156F0259 _unlink_body327BC77C038E "Instance::_unlinkOwnedInstance"

  /** add a OwnedLink.
   *  
   *  @see #removeOwnedLink
   *  @see #containsOwnedLink
   *  @see #iteratorOwnedLink
   *  @see #clearOwnedLink
   *  @see #sizeOwnedLink
   */
  // -beg- preserve=no 397316B00106 add_head327BC77C038E "Instance::addOwnedLink"
  public void addOwnedLink(Link ownedLink1)
  // -end- 397316B00106 add_head327BC77C038E "Instance::addOwnedLink"
    ; // empty

  /** disconnect a OwnedLink.
   *  @see #addOwnedLink
   */
  // -beg- preserve=no 397316B00106 remove_head327BC77C038E "Instance::removeOwnedLink"
  public Link removeOwnedLink(Link ownedLink1)
  // -end- 397316B00106 remove_head327BC77C038E "Instance::removeOwnedLink"
    ; // empty

  /** tests if a given OwnedLink is connected.
   *  @see #addOwnedLink
   */
  // -beg- preserve=no 397316B00106 test_head327BC77C038E "Instance::containsOwnedLink"
  public boolean containsOwnedLink(Link ownedLink1)
  // -end- 397316B00106 test_head327BC77C038E "Instance::containsOwnedLink"
    ; // empty

  /** used to enumerate all connected OwnedLinks.
   *  @see #addOwnedLink
   */
  // -beg- preserve=no 397316B00106 get_all_head327BC77C038E "Instance::iteratorOwnedLink"
  public java.util.Iterator iteratorOwnedLink()
  // -end- 397316B00106 get_all_head327BC77C038E "Instance::iteratorOwnedLink"
    ; // empty

  /** disconnect all OwnedLinks.
   *  @see #addOwnedLink
   */
  // -beg- preserve=no 397316B00106 remove_all_head327BC77C038E "Instance::clearOwnedLink"
  public void clearOwnedLink()
  // -end- 397316B00106 remove_all_head327BC77C038E "Instance::clearOwnedLink"
    ; // empty

  /** returns the number of OwnedLinks.
   *  @see #addOwnedLink
   */
  // -beg- preserve=no 397316B00106 size_head327BC77C038E "Instance::sizeOwnedLink"
  public int sizeOwnedLink()
  // -end- 397316B00106 size_head327BC77C038E "Instance::sizeOwnedLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 397316B00106 _link_body327BC77C038E "Instance::_linkOwnedLink"
  public void _linkOwnedLink(Link ownedLink1);
  // -end- 397316B00106 _link_body327BC77C038E "Instance::_linkOwnedLink"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 397316B00106 _unlink_body327BC77C038E "Instance::_unlinkOwnedLink"
  public void _unlinkOwnedLink(Link ownedLink1);
  // -end- 397316B00106 _unlink_body327BC77C038E "Instance::_unlinkOwnedLink"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327BC77C038E detail_end "Instance"

  // -end- 327BC77C038E detail_end "Instance"

}

