// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:01 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33F275E20000 package "Link"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 33F275E20000 package "Link"

// -beg- preserve=no 33F275E20000 autoimport "Link"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.collaborations.Interaction;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.collaborations.AssociationRole;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.uml1_4.behaviour.commonbehavior.LinkEnd;
import ch.ehi.uml1_4.behaviour.commonbehavior.Stimulus;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
// -end- 33F275E20000 autoimport "Link"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33F275E20000 import "Link"

// -end- 33F275E20000 import "Link"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:01 $
 */
<<<<<<< HEAD
public interface Link extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33F275E20000 detail_begin "Link"

  // -end- 33F275E20000 detail_begin "Link"

  /** attaches a Interaction.
   *  
   *  @see #detachInteraction
   *  @see #getInteraction
   *  @see #containsInteraction
   */
  // -beg- preserve=no 328A58B4032A attach_head33F275E20000 "Link::attachInteraction"
  public void attachInteraction(Interaction interaction1)
  // -end- 328A58B4032A attach_head33F275E20000 "Link::attachInteraction"
    ; // empty

  /** disconnect the currently attached Interaction.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 328A58B4032A detach_head33F275E20000 "Link::detachInteraction"
  public Interaction detachInteraction()
  // -end- 328A58B4032A detach_head33F275E20000 "Link::detachInteraction"
    ; // empty

  /** get the currently attached Interaction.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 328A58B4032A get_head33F275E20000 "Link::getInteraction"
  public Interaction getInteraction()
  // -end- 328A58B4032A get_head33F275E20000 "Link::getInteraction"
    ; // empty

  /** tests if there is a Interaction attached.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 328A58B4032A test_head33F275E20000 "Link::containsInteraction"
  public boolean containsInteraction()
  // -end- 328A58B4032A test_head33F275E20000 "Link::containsInteraction"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A58B4032A _link_body33F275E20000 "Link::_linkInteraction"
  public void _linkInteraction(Interaction interaction1);
  // -end- 328A58B4032A _link_body33F275E20000 "Link::_linkInteraction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A58B4032A _unlink_body33F275E20000 "Link::_unlinkInteraction"
  public void _unlinkInteraction(Interaction interaction1);
  // -end- 328A58B4032A _unlink_body33F275E20000 "Link::_unlinkInteraction"

  /** add a PlayedRole.
   *  
   *  @see #removePlayedRole
   *  @see #containsPlayedRole
   *  @see #iteratorPlayedRole
   *  @see #clearPlayedRole
   *  @see #sizePlayedRole
   */
  // -beg- preserve=no 39E8FECB009D add_head33F275E20000 "Link::addPlayedRole"
  public void addPlayedRole(AssociationRole playedRole1)
  // -end- 39E8FECB009D add_head33F275E20000 "Link::addPlayedRole"
    ; // empty

  /** disconnect a PlayedRole.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FECB009D remove_head33F275E20000 "Link::removePlayedRole"
  public AssociationRole removePlayedRole(AssociationRole playedRole1)
  // -end- 39E8FECB009D remove_head33F275E20000 "Link::removePlayedRole"
    ; // empty

  /** tests if a given PlayedRole is connected.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FECB009D test_head33F275E20000 "Link::containsPlayedRole"
  public boolean containsPlayedRole(AssociationRole playedRole1)
  // -end- 39E8FECB009D test_head33F275E20000 "Link::containsPlayedRole"
    ; // empty

  /** used to enumerate all connected PlayedRoles.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FECB009D get_all_head33F275E20000 "Link::iteratorPlayedRole"
  public java.util.Iterator iteratorPlayedRole()
  // -end- 39E8FECB009D get_all_head33F275E20000 "Link::iteratorPlayedRole"
    ; // empty

  /** disconnect all PlayedRoles.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FECB009D remove_all_head33F275E20000 "Link::clearPlayedRole"
  public void clearPlayedRole()
  // -end- 39E8FECB009D remove_all_head33F275E20000 "Link::clearPlayedRole"
    ; // empty

  /** returns the number of PlayedRoles.
   *  @see #addPlayedRole
   */
  // -beg- preserve=no 39E8FECB009D size_head33F275E20000 "Link::sizePlayedRole"
  public int sizePlayedRole()
  // -end- 39E8FECB009D size_head33F275E20000 "Link::sizePlayedRole"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FECB009D _link_body33F275E20000 "Link::_linkPlayedRole"
  public void _linkPlayedRole(AssociationRole playedRole1);
  // -end- 39E8FECB009D _link_body33F275E20000 "Link::_linkPlayedRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FECB009D _unlink_body33F275E20000 "Link::_unlinkPlayedRole"
  public void _unlinkPlayedRole(AssociationRole playedRole1);
  // -end- 39E8FECB009D _unlink_body33F275E20000 "Link::_unlinkPlayedRole"

  /** add a CollaborationInstanceSet.
   *  
   *  @see #removeCollaborationInstanceSet
   *  @see #containsCollaborationInstanceSet
   *  @see #iteratorCollaborationInstanceSet
   *  @see #clearCollaborationInstanceSet
   *  @see #sizeCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 add_head33F275E20000 "ModelElement::addCollaborationInstanceSet"
  public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 add_head33F275E20000 "ModelElement::addCollaborationInstanceSet"
    ; // empty

  /** disconnect a CollaborationInstanceSet.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_head33F275E20000 "ModelElement::removeCollaborationInstanceSet"
  public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 remove_head33F275E20000 "ModelElement::removeCollaborationInstanceSet"
    ; // empty

  /** tests if a given CollaborationInstanceSet is connected.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 test_head33F275E20000 "ModelElement::containsCollaborationInstanceSet"
  public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 test_head33F275E20000 "ModelElement::containsCollaborationInstanceSet"
    ; // empty

  /** used to enumerate all connected CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 get_all_head33F275E20000 "ModelElement::iteratorCollaborationInstanceSet"
  public java.util.Iterator iteratorCollaborationInstanceSet()
  // -end- 39E9065C0186 get_all_head33F275E20000 "ModelElement::iteratorCollaborationInstanceSet"
    ; // empty

  /** disconnect all CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_all_head33F275E20000 "ModelElement::clearCollaborationInstanceSet"
  public void clearCollaborationInstanceSet()
  // -end- 39E9065C0186 remove_all_head33F275E20000 "ModelElement::clearCollaborationInstanceSet"
    ; // empty

  /** returns the number of CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 size_head33F275E20000 "ModelElement::sizeCollaborationInstanceSet"
  public int sizeCollaborationInstanceSet()
  // -end- 39E9065C0186 size_head33F275E20000 "ModelElement::sizeCollaborationInstanceSet"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _link_body33F275E20000 "ModelElement::_linkCollaborationInstanceSet"
  public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
  // -end- 39E9065C0186 _link_body33F275E20000 "ModelElement::_linkCollaborationInstanceSet"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _unlink_body33F275E20000 "ModelElement::_unlinkCollaborationInstanceSet"
  public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
  // -end- 39E9065C0186 _unlink_body33F275E20000 "ModelElement::_unlinkCollaborationInstanceSet"

  /** attaches a Association.
   *  
   *  @see #detachAssociation
   *  @see #getAssociation
   *  @see #containsAssociation
   */
  // -beg- preserve=no 328A5BB3023B attach_head33F275E20000 "Link::attachAssociation"
  public void attachAssociation(Association association1)
  // -end- 328A5BB3023B attach_head33F275E20000 "Link::attachAssociation"
    ; // empty

  /** disconnect the currently attached Association.
   *  @see #attachAssociation
   */
  // -beg- preserve=no 328A5BB3023B detach_head33F275E20000 "Link::detachAssociation"
  public Association detachAssociation()
  // -end- 328A5BB3023B detach_head33F275E20000 "Link::detachAssociation"
    ; // empty

  /** get the currently attached Association.
   *  @see #attachAssociation
   */
  // -beg- preserve=no 328A5BB3023B get_head33F275E20000 "Link::getAssociation"
  public Association getAssociation()
  // -end- 328A5BB3023B get_head33F275E20000 "Link::getAssociation"
    ; // empty

  /** tests if there is a Association attached.
   *  @see #attachAssociation
   */
  // -beg- preserve=no 328A5BB3023B test_head33F275E20000 "Link::containsAssociation"
  public boolean containsAssociation()
  // -end- 328A5BB3023B test_head33F275E20000 "Link::containsAssociation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5BB3023B _link_body33F275E20000 "Link::_linkAssociation"
  public void _linkAssociation(Association association1);
  // -end- 328A5BB3023B _link_body33F275E20000 "Link::_linkAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5BB3023B _unlink_body33F275E20000 "Link::_unlinkAssociation"
  public void _unlinkAssociation(Association association1);
  // -end- 328A5BB3023B _unlink_body33F275E20000 "Link::_unlinkAssociation"

  /** add a Connection.
   *  
   *  @see #removeConnection
   *  @see #containsConnection
   *  @see #iteratorConnection
   *  @see #clearConnection
   *  @see #sizeConnection
   */
  // -beg- preserve=no 328A598B0352 add_head33F275E20000 "Link::addConnection"
  public void addConnection(LinkEnd connection1)
  // -end- 328A598B0352 add_head33F275E20000 "Link::addConnection"
    ; // empty

  /** disconnect a Connection.
   *  @see #addConnection
   */
  // -beg- preserve=no 328A598B0352 remove_head33F275E20000 "Link::removeConnection"
  public LinkEnd removeConnection(LinkEnd connection1)
  // -end- 328A598B0352 remove_head33F275E20000 "Link::removeConnection"
    ; // empty

  /** tests if a given Connection is connected.
   *  @see #addConnection
   */
  // -beg- preserve=no 328A598B0352 test_head33F275E20000 "Link::containsConnection"
  public boolean containsConnection(LinkEnd connection1)
  // -end- 328A598B0352 test_head33F275E20000 "Link::containsConnection"
    ; // empty

  /** used to enumerate all connected Connections.
   *  @see #addConnection
   */
  // -beg- preserve=no 328A598B0352 get_all_head33F275E20000 "Link::iteratorConnection"
  public java.util.Iterator iteratorConnection()
  // -end- 328A598B0352 get_all_head33F275E20000 "Link::iteratorConnection"
    ; // empty

  /** disconnect all Connections.
   *  @see #addConnection
   */
  // -beg- preserve=no 328A598B0352 remove_all_head33F275E20000 "Link::clearConnection"
  public void clearConnection()
  // -end- 328A598B0352 remove_all_head33F275E20000 "Link::clearConnection"
    ; // empty

  /** returns the number of Connections.
   *  @see #addConnection
   */
  // -beg- preserve=no 328A598B0352 size_head33F275E20000 "Link::sizeConnection"
  public int sizeConnection()
  // -end- 328A598B0352 size_head33F275E20000 "Link::sizeConnection"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A598B0352 _link_body33F275E20000 "Link::_linkConnection"
  public void _linkConnection(LinkEnd connection1);
  // -end- 328A598B0352 _link_body33F275E20000 "Link::_linkConnection"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A598B0352 _unlink_body33F275E20000 "Link::_unlinkConnection"
  public void _unlinkConnection(LinkEnd connection1);
  // -end- 328A598B0352 _unlink_body33F275E20000 "Link::_unlinkConnection"

  /** add a Stimulus.
   *  
   *  @see #removeStimulus
   *  @see #containsStimulus
   *  @see #iteratorStimulus
   *  @see #clearStimulus
   *  @see #sizeStimulus
   */
  // -beg- preserve=no 3650EE690083 add_head33F275E20000 "Link::addStimulus"
  public void addStimulus(Stimulus stimulus1)
  // -end- 3650EE690083 add_head33F275E20000 "Link::addStimulus"
    ; // empty

  /** disconnect a Stimulus.
   *  @see #addStimulus
   */
  // -beg- preserve=no 3650EE690083 remove_head33F275E20000 "Link::removeStimulus"
  public Stimulus removeStimulus(Stimulus stimulus1)
  // -end- 3650EE690083 remove_head33F275E20000 "Link::removeStimulus"
    ; // empty

  /** tests if a given Stimulus is connected.
   *  @see #addStimulus
   */
  // -beg- preserve=no 3650EE690083 test_head33F275E20000 "Link::containsStimulus"
  public boolean containsStimulus(Stimulus stimulus1)
  // -end- 3650EE690083 test_head33F275E20000 "Link::containsStimulus"
    ; // empty

  /** used to enumerate all connected Stimuluss.
   *  @see #addStimulus
   */
  // -beg- preserve=no 3650EE690083 get_all_head33F275E20000 "Link::iteratorStimulus"
  public java.util.Iterator iteratorStimulus()
  // -end- 3650EE690083 get_all_head33F275E20000 "Link::iteratorStimulus"
    ; // empty

  /** disconnect all Stimuluss.
   *  @see #addStimulus
   */
  // -beg- preserve=no 3650EE690083 remove_all_head33F275E20000 "Link::clearStimulus"
  public void clearStimulus()
  // -end- 3650EE690083 remove_all_head33F275E20000 "Link::clearStimulus"
    ; // empty

  /** returns the number of Stimuluss.
   *  @see #addStimulus
   */
  // -beg- preserve=no 3650EE690083 size_head33F275E20000 "Link::sizeStimulus"
  public int sizeStimulus()
  // -end- 3650EE690083 size_head33F275E20000 "Link::sizeStimulus"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3650EE690083 _link_body33F275E20000 "Link::_linkStimulus"
  public void _linkStimulus(Stimulus stimulus1);
  // -end- 3650EE690083 _link_body33F275E20000 "Link::_linkStimulus"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3650EE690083 _unlink_body33F275E20000 "Link::_unlinkStimulus"
  public void _unlinkStimulus(Stimulus stimulus1);
  // -end- 3650EE690083 _unlink_body33F275E20000 "Link::_unlinkStimulus"

  /** attaches a Owner.
   *  
   *  @see #detachOwner
   *  @see #getOwner
   *  @see #containsOwner
   */
  // -beg- preserve=no 397316B000FC attach_head33F275E20000 "Link::attachOwner"
  public void attachOwner(Instance owner1)
  // -end- 397316B000FC attach_head33F275E20000 "Link::attachOwner"
    ; // empty

  /** disconnect the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 397316B000FC detach_head33F275E20000 "Link::detachOwner"
  public Instance detachOwner()
  // -end- 397316B000FC detach_head33F275E20000 "Link::detachOwner"
    ; // empty

  /** get the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 397316B000FC get_head33F275E20000 "Link::getOwner"
  public Instance getOwner()
  // -end- 397316B000FC get_head33F275E20000 "Link::getOwner"
    ; // empty

  /** tests if there is a Owner attached.
   *  @see #attachOwner
   */
  // -beg- preserve=no 397316B000FC test_head33F275E20000 "Link::containsOwner"
  public boolean containsOwner()
  // -end- 397316B000FC test_head33F275E20000 "Link::containsOwner"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 397316B000FC _link_body33F275E20000 "Link::_linkOwner"
  public void _linkOwner(Instance owner1);
  // -end- 397316B000FC _link_body33F275E20000 "Link::_linkOwner"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 397316B000FC _unlink_body33F275E20000 "Link::_unlinkOwner"
  public void _unlinkOwner(Instance owner1);
  // -end- 397316B000FC _unlink_body33F275E20000 "Link::_unlinkOwner"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33F275E20000 detail_end "Link"

  // -end- 33F275E20000 detail_end "Link"

}

=======
public interface Link extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F275E20000 detail_begin "Link"

// -end- 33F275E20000 detail_begin "Link"

/** attaches a Interaction.
 *
 *  @see #detachInteraction
 *  @see #getInteraction
 *  @see #containsInteraction
 */
// -beg- preserve=no 328A58B4032A attach_head33F275E20000 "Link::attachInteraction"
public void attachInteraction(Interaction interaction1)
// -end- 328A58B4032A attach_head33F275E20000 "Link::attachInteraction"
;     // empty

/** disconnect the currently attached Interaction.
 *  @see #attachInteraction
 */
// -beg- preserve=no 328A58B4032A detach_head33F275E20000 "Link::detachInteraction"
public Interaction detachInteraction()
// -end- 328A58B4032A detach_head33F275E20000 "Link::detachInteraction"
;     // empty

/** get the currently attached Interaction.
 *  @see #attachInteraction
 */
// -beg- preserve=no 328A58B4032A get_head33F275E20000 "Link::getInteraction"
public Interaction getInteraction()
// -end- 328A58B4032A get_head33F275E20000 "Link::getInteraction"
;     // empty

/** tests if there is a Interaction attached.
 *  @see #attachInteraction
 */
// -beg- preserve=no 328A58B4032A test_head33F275E20000 "Link::containsInteraction"
public boolean containsInteraction()
// -end- 328A58B4032A test_head33F275E20000 "Link::containsInteraction"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A58B4032A _link_body33F275E20000 "Link::_linkInteraction"
public void _linkInteraction(Interaction interaction1);
// -end- 328A58B4032A _link_body33F275E20000 "Link::_linkInteraction"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A58B4032A _unlink_body33F275E20000 "Link::_unlinkInteraction"
public void _unlinkInteraction(Interaction interaction1);
// -end- 328A58B4032A _unlink_body33F275E20000 "Link::_unlinkInteraction"

/** add a PlayedRole.
 *
 *  @see #removePlayedRole
 *  @see #containsPlayedRole
 *  @see #iteratorPlayedRole
 *  @see #clearPlayedRole
 *  @see #sizePlayedRole
 */
// -beg- preserve=no 39E8FECB009D add_head33F275E20000 "Link::addPlayedRole"
public void addPlayedRole(AssociationRole playedRole1)
// -end- 39E8FECB009D add_head33F275E20000 "Link::addPlayedRole"
;     // empty

/** disconnect a PlayedRole.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FECB009D remove_head33F275E20000 "Link::removePlayedRole"
public AssociationRole removePlayedRole(AssociationRole playedRole1)
// -end- 39E8FECB009D remove_head33F275E20000 "Link::removePlayedRole"
;     // empty

/** tests if a given PlayedRole is connected.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FECB009D test_head33F275E20000 "Link::containsPlayedRole"
public boolean containsPlayedRole(AssociationRole playedRole1)
// -end- 39E8FECB009D test_head33F275E20000 "Link::containsPlayedRole"
;     // empty

/** used to enumerate all connected PlayedRoles.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FECB009D get_all_head33F275E20000 "Link::iteratorPlayedRole"
public Iterator<?> iteratorPlayedRole()
// -end- 39E8FECB009D get_all_head33F275E20000 "Link::iteratorPlayedRole"
;     // empty

/** disconnect all PlayedRoles.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FECB009D remove_all_head33F275E20000 "Link::clearPlayedRole"
public void clearPlayedRole()
// -end- 39E8FECB009D remove_all_head33F275E20000 "Link::clearPlayedRole"
;     // empty

/** returns the number of PlayedRoles.
 *  @see #addPlayedRole
 */
// -beg- preserve=no 39E8FECB009D size_head33F275E20000 "Link::sizePlayedRole"
public int sizePlayedRole()
// -end- 39E8FECB009D size_head33F275E20000 "Link::sizePlayedRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FECB009D _link_body33F275E20000 "Link::_linkPlayedRole"
public void _linkPlayedRole(AssociationRole playedRole1);
// -end- 39E8FECB009D _link_body33F275E20000 "Link::_linkPlayedRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FECB009D _unlink_body33F275E20000 "Link::_unlinkPlayedRole"
public void _unlinkPlayedRole(AssociationRole playedRole1);
// -end- 39E8FECB009D _unlink_body33F275E20000 "Link::_unlinkPlayedRole"

/** add a CollaborationInstanceSet.
 *
 *  @see #removeCollaborationInstanceSet
 *  @see #containsCollaborationInstanceSet
 *  @see #iteratorCollaborationInstanceSet
 *  @see #clearCollaborationInstanceSet
 *  @see #sizeCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 add_head33F275E20000 "ModelElement::addCollaborationInstanceSet"
public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 add_head33F275E20000 "ModelElement::addCollaborationInstanceSet"
;     // empty

/** disconnect a CollaborationInstanceSet.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 remove_head33F275E20000 "ModelElement::removeCollaborationInstanceSet"
public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 remove_head33F275E20000 "ModelElement::removeCollaborationInstanceSet"
;     // empty

/** tests if a given CollaborationInstanceSet is connected.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 test_head33F275E20000 "ModelElement::containsCollaborationInstanceSet"
public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 test_head33F275E20000 "ModelElement::containsCollaborationInstanceSet"
;     // empty

/** used to enumerate all connected CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 get_all_head33F275E20000 "ModelElement::iteratorCollaborationInstanceSet"
public Iterator<?> iteratorCollaborationInstanceSet()
// -end- 39E9065C0186 get_all_head33F275E20000 "ModelElement::iteratorCollaborationInstanceSet"
;     // empty

/** disconnect all CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 remove_all_head33F275E20000 "ModelElement::clearCollaborationInstanceSet"
public void clearCollaborationInstanceSet()
// -end- 39E9065C0186 remove_all_head33F275E20000 "ModelElement::clearCollaborationInstanceSet"
;     // empty

/** returns the number of CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 size_head33F275E20000 "ModelElement::sizeCollaborationInstanceSet"
public int sizeCollaborationInstanceSet()
// -end- 39E9065C0186 size_head33F275E20000 "ModelElement::sizeCollaborationInstanceSet"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9065C0186 _link_body33F275E20000 "ModelElement::_linkCollaborationInstanceSet"
public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
// -end- 39E9065C0186 _link_body33F275E20000 "ModelElement::_linkCollaborationInstanceSet"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9065C0186 _unlink_body33F275E20000 "ModelElement::_unlinkCollaborationInstanceSet"
public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
// -end- 39E9065C0186 _unlink_body33F275E20000 "ModelElement::_unlinkCollaborationInstanceSet"

/** attaches a Association.
 *
 *  @see #detachAssociation
 *  @see #getAssociation
 *  @see #containsAssociation
 */
// -beg- preserve=no 328A5BB3023B attach_head33F275E20000 "Link::attachAssociation"
public void attachAssociation(Association association1)
// -end- 328A5BB3023B attach_head33F275E20000 "Link::attachAssociation"
;     // empty

/** disconnect the currently attached Association.
 *  @see #attachAssociation
 */
// -beg- preserve=no 328A5BB3023B detach_head33F275E20000 "Link::detachAssociation"
public Association detachAssociation()
// -end- 328A5BB3023B detach_head33F275E20000 "Link::detachAssociation"
;     // empty

/** get the currently attached Association.
 *  @see #attachAssociation
 */
// -beg- preserve=no 328A5BB3023B get_head33F275E20000 "Link::getAssociation"
public Association getAssociation()
// -end- 328A5BB3023B get_head33F275E20000 "Link::getAssociation"
;     // empty

/** tests if there is a Association attached.
 *  @see #attachAssociation
 */
// -beg- preserve=no 328A5BB3023B test_head33F275E20000 "Link::containsAssociation"
public boolean containsAssociation()
// -end- 328A5BB3023B test_head33F275E20000 "Link::containsAssociation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A5BB3023B _link_body33F275E20000 "Link::_linkAssociation"
public void _linkAssociation(Association association1);
// -end- 328A5BB3023B _link_body33F275E20000 "Link::_linkAssociation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A5BB3023B _unlink_body33F275E20000 "Link::_unlinkAssociation"
public void _unlinkAssociation(Association association1);
// -end- 328A5BB3023B _unlink_body33F275E20000 "Link::_unlinkAssociation"

/** add a Connection.
 *
 *  @see #removeConnection
 *  @see #containsConnection
 *  @see #iteratorConnection
 *  @see #clearConnection
 *  @see #sizeConnection
 */
// -beg- preserve=no 328A598B0352 add_head33F275E20000 "Link::addConnection"
public void addConnection(LinkEnd connection1)
// -end- 328A598B0352 add_head33F275E20000 "Link::addConnection"
;     // empty

/** disconnect a Connection.
 *  @see #addConnection
 */
// -beg- preserve=no 328A598B0352 remove_head33F275E20000 "Link::removeConnection"
public LinkEnd removeConnection(LinkEnd connection1)
// -end- 328A598B0352 remove_head33F275E20000 "Link::removeConnection"
;     // empty

/** tests if a given Connection is connected.
 *  @see #addConnection
 */
// -beg- preserve=no 328A598B0352 test_head33F275E20000 "Link::containsConnection"
public boolean containsConnection(LinkEnd connection1)
// -end- 328A598B0352 test_head33F275E20000 "Link::containsConnection"
;     // empty

/** used to enumerate all connected Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 328A598B0352 get_all_head33F275E20000 "Link::iteratorConnection"
public Iterator<?> iteratorConnection()
// -end- 328A598B0352 get_all_head33F275E20000 "Link::iteratorConnection"
;     // empty

/** disconnect all Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 328A598B0352 remove_all_head33F275E20000 "Link::clearConnection"
public void clearConnection()
// -end- 328A598B0352 remove_all_head33F275E20000 "Link::clearConnection"
;     // empty

/** returns the number of Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 328A598B0352 size_head33F275E20000 "Link::sizeConnection"
public int sizeConnection()
// -end- 328A598B0352 size_head33F275E20000 "Link::sizeConnection"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A598B0352 _link_body33F275E20000 "Link::_linkConnection"
public void _linkConnection(LinkEnd connection1);
// -end- 328A598B0352 _link_body33F275E20000 "Link::_linkConnection"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A598B0352 _unlink_body33F275E20000 "Link::_unlinkConnection"
public void _unlinkConnection(LinkEnd connection1);
// -end- 328A598B0352 _unlink_body33F275E20000 "Link::_unlinkConnection"

/** add a Stimulus.
 *
 *  @see #removeStimulus
 *  @see #containsStimulus
 *  @see #iteratorStimulus
 *  @see #clearStimulus
 *  @see #sizeStimulus
 */
// -beg- preserve=no 3650EE690083 add_head33F275E20000 "Link::addStimulus"
public void addStimulus(Stimulus stimulus1)
// -end- 3650EE690083 add_head33F275E20000 "Link::addStimulus"
;     // empty

/** disconnect a Stimulus.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650EE690083 remove_head33F275E20000 "Link::removeStimulus"
public Stimulus removeStimulus(Stimulus stimulus1)
// -end- 3650EE690083 remove_head33F275E20000 "Link::removeStimulus"
;     // empty

/** tests if a given Stimulus is connected.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650EE690083 test_head33F275E20000 "Link::containsStimulus"
public boolean containsStimulus(Stimulus stimulus1)
// -end- 3650EE690083 test_head33F275E20000 "Link::containsStimulus"
;     // empty

/** used to enumerate all connected Stimuluss.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650EE690083 get_all_head33F275E20000 "Link::iteratorStimulus"
public Iterator<?> iteratorStimulus()
// -end- 3650EE690083 get_all_head33F275E20000 "Link::iteratorStimulus"
;     // empty

/** disconnect all Stimuluss.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650EE690083 remove_all_head33F275E20000 "Link::clearStimulus"
public void clearStimulus()
// -end- 3650EE690083 remove_all_head33F275E20000 "Link::clearStimulus"
;     // empty

/** returns the number of Stimuluss.
 *  @see #addStimulus
 */
// -beg- preserve=no 3650EE690083 size_head33F275E20000 "Link::sizeStimulus"
public int sizeStimulus()
// -end- 3650EE690083 size_head33F275E20000 "Link::sizeStimulus"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650EE690083 _link_body33F275E20000 "Link::_linkStimulus"
public void _linkStimulus(Stimulus stimulus1);
// -end- 3650EE690083 _link_body33F275E20000 "Link::_linkStimulus"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650EE690083 _unlink_body33F275E20000 "Link::_unlinkStimulus"
public void _unlinkStimulus(Stimulus stimulus1);
// -end- 3650EE690083 _unlink_body33F275E20000 "Link::_unlinkStimulus"

/** attaches a Owner.
 *
 *  @see #detachOwner
 *  @see #getOwner
 *  @see #containsOwner
 */
// -beg- preserve=no 397316B000FC attach_head33F275E20000 "Link::attachOwner"
public void attachOwner(Instance owner1)
// -end- 397316B000FC attach_head33F275E20000 "Link::attachOwner"
;     // empty

/** disconnect the currently attached Owner.
 *  @see #attachOwner
 */
// -beg- preserve=no 397316B000FC detach_head33F275E20000 "Link::detachOwner"
public Instance detachOwner()
// -end- 397316B000FC detach_head33F275E20000 "Link::detachOwner"
;     // empty

/** get the currently attached Owner.
 *  @see #attachOwner
 */
// -beg- preserve=no 397316B000FC get_head33F275E20000 "Link::getOwner"
public Instance getOwner()
// -end- 397316B000FC get_head33F275E20000 "Link::getOwner"
;     // empty

/** tests if there is a Owner attached.
 *  @see #attachOwner
 */
// -beg- preserve=no 397316B000FC test_head33F275E20000 "Link::containsOwner"
public boolean containsOwner()
// -end- 397316B000FC test_head33F275E20000 "Link::containsOwner"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 397316B000FC _link_body33F275E20000 "Link::_linkOwner"
public void _linkOwner(Instance owner1);
// -end- 397316B000FC _link_body33F275E20000 "Link::_linkOwner"

/** DONT USE; link management internal
 */
// -beg- preserve=no 397316B000FC _unlink_body33F275E20000 "Link::_unlinkOwner"
public void _unlinkOwner(Instance owner1);
// -end- 397316B000FC _unlink_body33F275E20000 "Link::_unlinkOwner"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F275E20000 detail_end "Link"

// -end- 33F275E20000 detail_end "Link"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
