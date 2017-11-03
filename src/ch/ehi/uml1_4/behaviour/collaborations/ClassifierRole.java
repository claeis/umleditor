// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:46 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 337A47370316 package "ClassifierRole"
package ch.ehi.uml1_4.behaviour.collaborations;
// -end- 337A47370316 package "ClassifierRole"

// -beg- preserve=no 337A47370316 autoimport "ClassifierRole"
import ch.ehi.uml1_4.foundation.core.Classifier;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.collaborations.AssociationEndRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.behaviour.collaborations.Message;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
// -end- 337A47370316 autoimport "ClassifierRole"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 337A47370316 import "ClassifierRole"

// -end- 337A47370316 import "ClassifierRole"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:46 $
 */
<<<<<<< HEAD
public interface ClassifierRole extends Classifier , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 337A47370316 detail_begin "ClassifierRole"

  // -end- 337A47370316 detail_begin "ClassifierRole"

  /** add a Base.
   *  
   *  @see #removeBase
   *  @see #containsBase
   *  @see #iteratorBase
   *  @see #clearBase
   *  @see #sizeBase
   */
  // -beg- preserve=no 33CD4F090208 add_head337A47370316 "ClassifierRole::addBase"
  public void addBase(Classifier base1)
  // -end- 33CD4F090208 add_head337A47370316 "ClassifierRole::addBase"
    ; // empty

  /** disconnect a Base.
   *  @see #addBase
   */
  // -beg- preserve=no 33CD4F090208 remove_head337A47370316 "ClassifierRole::removeBase"
  public Classifier removeBase(Classifier base1)
  // -end- 33CD4F090208 remove_head337A47370316 "ClassifierRole::removeBase"
    ; // empty

  /** tests if a given Base is connected.
   *  @see #addBase
   */
  // -beg- preserve=no 33CD4F090208 test_head337A47370316 "ClassifierRole::containsBase"
  public boolean containsBase(Classifier base1)
  // -end- 33CD4F090208 test_head337A47370316 "ClassifierRole::containsBase"
    ; // empty

  /** used to enumerate all connected Bases.
   *  @see #addBase
   */
  // -beg- preserve=no 33CD4F090208 get_all_head337A47370316 "ClassifierRole::iteratorBase"
  public java.util.Iterator iteratorBase()
  // -end- 33CD4F090208 get_all_head337A47370316 "ClassifierRole::iteratorBase"
    ; // empty

  /** disconnect all Bases.
   *  @see #addBase
   */
  // -beg- preserve=no 33CD4F090208 remove_all_head337A47370316 "ClassifierRole::clearBase"
  public void clearBase()
  // -end- 33CD4F090208 remove_all_head337A47370316 "ClassifierRole::clearBase"
    ; // empty

  /** returns the number of Bases.
   *  @see #addBase
   */
  // -beg- preserve=no 33CD4F090208 size_head337A47370316 "ClassifierRole::sizeBase"
  public int sizeBase()
  // -end- 33CD4F090208 size_head337A47370316 "ClassifierRole::sizeBase"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD4F090208 _link_body337A47370316 "ClassifierRole::_linkBase"
  public void _linkBase(Classifier base1);
  // -end- 33CD4F090208 _link_body337A47370316 "ClassifierRole::_linkBase"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD4F090208 _unlink_body337A47370316 "ClassifierRole::_unlinkBase"
  public void _unlinkBase(Classifier base1);
  // -end- 33CD4F090208 _unlink_body337A47370316 "ClassifierRole::_unlinkBase"

  /** add a AssociationEndRole.
   *  
   *  @see #removeAssociationEndRole
   *  @see #containsAssociationEndRole
   *  @see #iteratorAssociationEndRole
   *  @see #clearAssociationEndRole
   *  @see #sizeAssociationEndRole
   */
  // -beg- preserve=no 33CD4F7101EA add_head337A47370316 "ClassifierRole::addAssociationEndRole"
  public void addAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 33CD4F7101EA add_head337A47370316 "ClassifierRole::addAssociationEndRole"
    ; // empty

  /** disconnect a AssociationEndRole.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD4F7101EA remove_head337A47370316 "ClassifierRole::removeAssociationEndRole"
  public AssociationEndRole removeAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 33CD4F7101EA remove_head337A47370316 "ClassifierRole::removeAssociationEndRole"
    ; // empty

  /** tests if a given AssociationEndRole is connected.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD4F7101EA test_head337A47370316 "ClassifierRole::containsAssociationEndRole"
  public boolean containsAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 33CD4F7101EA test_head337A47370316 "ClassifierRole::containsAssociationEndRole"
    ; // empty

  /** used to enumerate all connected AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD4F7101EA get_all_head337A47370316 "ClassifierRole::iteratorAssociationEndRole"
  public java.util.Iterator iteratorAssociationEndRole()
  // -end- 33CD4F7101EA get_all_head337A47370316 "ClassifierRole::iteratorAssociationEndRole"
    ; // empty

  /** disconnect all AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD4F7101EA remove_all_head337A47370316 "ClassifierRole::clearAssociationEndRole"
  public void clearAssociationEndRole()
  // -end- 33CD4F7101EA remove_all_head337A47370316 "ClassifierRole::clearAssociationEndRole"
    ; // empty

  /** returns the number of AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 33CD4F7101EA size_head337A47370316 "ClassifierRole::sizeAssociationEndRole"
  public int sizeAssociationEndRole()
  // -end- 33CD4F7101EA size_head337A47370316 "ClassifierRole::sizeAssociationEndRole"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD4F7101EA _link_body337A47370316 "ClassifierRole::_linkAssociationEndRole"
  public void _linkAssociationEndRole(AssociationEndRole associationEndRole1);
  // -end- 33CD4F7101EA _link_body337A47370316 "ClassifierRole::_linkAssociationEndRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD4F7101EA _unlink_body337A47370316 "ClassifierRole::_unlinkAssociationEndRole"
  public void _unlinkAssociationEndRole(AssociationEndRole associationEndRole1);
  // -end- 33CD4F7101EA _unlink_body337A47370316 "ClassifierRole::_unlinkAssociationEndRole"

  /** add a Collaboration.
   *  
   *  @see #removeCollaboration
   *  @see #containsCollaboration
   *  @see #iteratorCollaboration
   *  @see #clearCollaboration
   *  @see #sizeCollaboration
   */
  // -beg- preserve=no 33D1394E029F add_head337A47370316 "ModelElement::addCollaboration"
  public void addCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F add_head337A47370316 "ModelElement::addCollaboration"
    ; // empty

  /** disconnect a Collaboration.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_head337A47370316 "ModelElement::removeCollaboration"
  public Collaboration removeCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F remove_head337A47370316 "ModelElement::removeCollaboration"
    ; // empty

  /** tests if a given Collaboration is connected.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F test_head337A47370316 "ModelElement::containsCollaboration"
  public boolean containsCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F test_head337A47370316 "ModelElement::containsCollaboration"
    ; // empty

  /** used to enumerate all connected Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F get_all_head337A47370316 "ModelElement::iteratorCollaboration"
  public java.util.Iterator iteratorCollaboration()
  // -end- 33D1394E029F get_all_head337A47370316 "ModelElement::iteratorCollaboration"
    ; // empty

  /** disconnect all Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_all_head337A47370316 "ModelElement::clearCollaboration"
  public void clearCollaboration()
  // -end- 33D1394E029F remove_all_head337A47370316 "ModelElement::clearCollaboration"
    ; // empty

  /** returns the number of Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F size_head337A47370316 "ModelElement::sizeCollaboration"
  public int sizeCollaboration()
  // -end- 33D1394E029F size_head337A47370316 "ModelElement::sizeCollaboration"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _link_body337A47370316 "ModelElement::_linkCollaboration"
  public void _linkCollaboration(Collaboration collaboration1);
  // -end- 33D1394E029F _link_body337A47370316 "ModelElement::_linkCollaboration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _unlink_body337A47370316 "ModelElement::_unlinkCollaboration"
  public void _unlinkCollaboration(Collaboration collaboration1);
  // -end- 33D1394E029F _unlink_body337A47370316 "ModelElement::_unlinkCollaboration"

  /** add a AvailableFeature.
   *  
   *  @see #removeAvailableFeature
   *  @see #containsAvailableFeature
   *  @see #iteratorAvailableFeature
   *  @see #clearAvailableFeature
   *  @see #sizeAvailableFeature
   */
  // -beg- preserve=no 33CD57D3021C add_head337A47370316 "ClassifierRole::addAvailableFeature"
  public void addAvailableFeature(Feature availableFeature1)
  // -end- 33CD57D3021C add_head337A47370316 "ClassifierRole::addAvailableFeature"
    ; // empty

  /** disconnect a AvailableFeature.
   *  @see #addAvailableFeature
   */
  // -beg- preserve=no 33CD57D3021C remove_head337A47370316 "ClassifierRole::removeAvailableFeature"
  public Feature removeAvailableFeature(Feature availableFeature1)
  // -end- 33CD57D3021C remove_head337A47370316 "ClassifierRole::removeAvailableFeature"
    ; // empty

  /** tests if a given AvailableFeature is connected.
   *  @see #addAvailableFeature
   */
  // -beg- preserve=no 33CD57D3021C test_head337A47370316 "ClassifierRole::containsAvailableFeature"
  public boolean containsAvailableFeature(Feature availableFeature1)
  // -end- 33CD57D3021C test_head337A47370316 "ClassifierRole::containsAvailableFeature"
    ; // empty

  /** used to enumerate all connected AvailableFeatures.
   *  @see #addAvailableFeature
   */
  // -beg- preserve=no 33CD57D3021C get_all_head337A47370316 "ClassifierRole::iteratorAvailableFeature"
  public java.util.Iterator iteratorAvailableFeature()
  // -end- 33CD57D3021C get_all_head337A47370316 "ClassifierRole::iteratorAvailableFeature"
    ; // empty

  /** disconnect all AvailableFeatures.
   *  @see #addAvailableFeature
   */
  // -beg- preserve=no 33CD57D3021C remove_all_head337A47370316 "ClassifierRole::clearAvailableFeature"
  public void clearAvailableFeature()
  // -end- 33CD57D3021C remove_all_head337A47370316 "ClassifierRole::clearAvailableFeature"
    ; // empty

  /** returns the number of AvailableFeatures.
   *  @see #addAvailableFeature
   */
  // -beg- preserve=no 33CD57D3021C size_head337A47370316 "ClassifierRole::sizeAvailableFeature"
  public int sizeAvailableFeature()
  // -end- 33CD57D3021C size_head337A47370316 "ClassifierRole::sizeAvailableFeature"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD57D3021C _link_body337A47370316 "ClassifierRole::_linkAvailableFeature"
  public void _linkAvailableFeature(Feature availableFeature1);
  // -end- 33CD57D3021C _link_body337A47370316 "ClassifierRole::_linkAvailableFeature"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD57D3021C _unlink_body337A47370316 "ClassifierRole::_unlinkAvailableFeature"
  public void _unlinkAvailableFeature(Feature availableFeature1);
  // -end- 33CD57D3021C _unlink_body337A47370316 "ClassifierRole::_unlinkAvailableFeature"

  /** add a Message.
   *  
   *  @see #removeMessage
   *  @see #containsMessage
   *  @see #iteratorMessage
   *  @see #clearMessage
   *  @see #sizeMessage
   */
  // -beg- preserve=no 33DBBB2B03DF add_head337A47370316 "ClassifierRole::addMessage"
  public void addMessage(Message message1)
  // -end- 33DBBB2B03DF add_head337A47370316 "ClassifierRole::addMessage"
    ; // empty

  /** disconnect a Message.
   *  @see #addMessage
   */
  // -beg- preserve=no 33DBBB2B03DF remove_head337A47370316 "ClassifierRole::removeMessage"
  public Message removeMessage(Message message1)
  // -end- 33DBBB2B03DF remove_head337A47370316 "ClassifierRole::removeMessage"
    ; // empty

  /** tests if a given Message is connected.
   *  @see #addMessage
   */
  // -beg- preserve=no 33DBBB2B03DF test_head337A47370316 "ClassifierRole::containsMessage"
  public boolean containsMessage(Message message1)
  // -end- 33DBBB2B03DF test_head337A47370316 "ClassifierRole::containsMessage"
    ; // empty

  /** used to enumerate all connected Messages.
   *  @see #addMessage
   */
  // -beg- preserve=no 33DBBB2B03DF get_all_head337A47370316 "ClassifierRole::iteratorMessage"
  public java.util.Iterator iteratorMessage()
  // -end- 33DBBB2B03DF get_all_head337A47370316 "ClassifierRole::iteratorMessage"
    ; // empty

  /** disconnect all Messages.
   *  @see #addMessage
   */
  // -beg- preserve=no 33DBBB2B03DF remove_all_head337A47370316 "ClassifierRole::clearMessage"
  public void clearMessage()
  // -end- 33DBBB2B03DF remove_all_head337A47370316 "ClassifierRole::clearMessage"
    ; // empty

  /** returns the number of Messages.
   *  @see #addMessage
   */
  // -beg- preserve=no 33DBBB2B03DF size_head337A47370316 "ClassifierRole::sizeMessage"
  public int sizeMessage()
  // -end- 33DBBB2B03DF size_head337A47370316 "ClassifierRole::sizeMessage"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBBB2B03DF _link_body337A47370316 "ClassifierRole::_linkMessage"
  public void _linkMessage(Message message1);
  // -end- 33DBBB2B03DF _link_body337A47370316 "ClassifierRole::_linkMessage"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBBB2B03DF _unlink_body337A47370316 "ClassifierRole::_unlinkMessage"
  public void _unlinkMessage(Message message1);
  // -end- 33DBBB2B03DF _unlink_body337A47370316 "ClassifierRole::_unlinkMessage"

  /** add a AvailableContents.
   *  
   *  @see #removeAvailableContents
   *  @see #containsAvailableContents
   *  @see #iteratorAvailableContents
   *  @see #clearAvailableContents
   *  @see #sizeAvailableContents
   */
  // -beg- preserve=no 36008FB700E6 add_head337A47370316 "ClassifierRole::addAvailableContents"
  public void addAvailableContents(ModelElement availableContents1)
  // -end- 36008FB700E6 add_head337A47370316 "ClassifierRole::addAvailableContents"
    ; // empty

  /** disconnect a AvailableContents.
   *  @see #addAvailableContents
   */
  // -beg- preserve=no 36008FB700E6 remove_head337A47370316 "ClassifierRole::removeAvailableContents"
  public ModelElement removeAvailableContents(ModelElement availableContents1)
  // -end- 36008FB700E6 remove_head337A47370316 "ClassifierRole::removeAvailableContents"
    ; // empty

  /** tests if a given AvailableContents is connected.
   *  @see #addAvailableContents
   */
  // -beg- preserve=no 36008FB700E6 test_head337A47370316 "ClassifierRole::containsAvailableContents"
  public boolean containsAvailableContents(ModelElement availableContents1)
  // -end- 36008FB700E6 test_head337A47370316 "ClassifierRole::containsAvailableContents"
    ; // empty

  /** used to enumerate all connected AvailableContentss.
   *  @see #addAvailableContents
   */
  // -beg- preserve=no 36008FB700E6 get_all_head337A47370316 "ClassifierRole::iteratorAvailableContents"
  public java.util.Iterator iteratorAvailableContents()
  // -end- 36008FB700E6 get_all_head337A47370316 "ClassifierRole::iteratorAvailableContents"
    ; // empty

  /** disconnect all AvailableContentss.
   *  @see #addAvailableContents
   */
  // -beg- preserve=no 36008FB700E6 remove_all_head337A47370316 "ClassifierRole::clearAvailableContents"
  public void clearAvailableContents()
  // -end- 36008FB700E6 remove_all_head337A47370316 "ClassifierRole::clearAvailableContents"
    ; // empty

  /** returns the number of AvailableContentss.
   *  @see #addAvailableContents
   */
  // -beg- preserve=no 36008FB700E6 size_head337A47370316 "ClassifierRole::sizeAvailableContents"
  public int sizeAvailableContents()
  // -end- 36008FB700E6 size_head337A47370316 "ClassifierRole::sizeAvailableContents"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E6 _link_body337A47370316 "ClassifierRole::_linkAvailableContents"
  public void _linkAvailableContents(ModelElement availableContents1);
  // -end- 36008FB700E6 _link_body337A47370316 "ClassifierRole::_linkAvailableContents"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E6 _unlink_body337A47370316 "ClassifierRole::_unlinkAvailableContents"
  public void _unlinkAvailableContents(ModelElement availableContents1);
  // -end- 36008FB700E6 _unlink_body337A47370316 "ClassifierRole::_unlinkAvailableContents"

  /** add a ConformingInstance.
   *  
   *  @see #removeConformingInstance
   *  @see #containsConformingInstance
   *  @see #iteratorConformingInstance
   *  @see #clearConformingInstance
   *  @see #sizeConformingInstance
   */
  // -beg- preserve=no 39E8FF920242 add_head337A47370316 "ClassifierRole::addConformingInstance"
  public void addConformingInstance(Instance conformingInstance1)
  // -end- 39E8FF920242 add_head337A47370316 "ClassifierRole::addConformingInstance"
    ; // empty

  /** disconnect a ConformingInstance.
   *  @see #addConformingInstance
   */
  // -beg- preserve=no 39E8FF920242 remove_head337A47370316 "ClassifierRole::removeConformingInstance"
  public Instance removeConformingInstance(Instance conformingInstance1)
  // -end- 39E8FF920242 remove_head337A47370316 "ClassifierRole::removeConformingInstance"
    ; // empty

  /** tests if a given ConformingInstance is connected.
   *  @see #addConformingInstance
   */
  // -beg- preserve=no 39E8FF920242 test_head337A47370316 "ClassifierRole::containsConformingInstance"
  public boolean containsConformingInstance(Instance conformingInstance1)
  // -end- 39E8FF920242 test_head337A47370316 "ClassifierRole::containsConformingInstance"
    ; // empty

  /** used to enumerate all connected ConformingInstances.
   *  @see #addConformingInstance
   */
  // -beg- preserve=no 39E8FF920242 get_all_head337A47370316 "ClassifierRole::iteratorConformingInstance"
  public java.util.Iterator iteratorConformingInstance()
  // -end- 39E8FF920242 get_all_head337A47370316 "ClassifierRole::iteratorConformingInstance"
    ; // empty

  /** disconnect all ConformingInstances.
   *  @see #addConformingInstance
   */
  // -beg- preserve=no 39E8FF920242 remove_all_head337A47370316 "ClassifierRole::clearConformingInstance"
  public void clearConformingInstance()
  // -end- 39E8FF920242 remove_all_head337A47370316 "ClassifierRole::clearConformingInstance"
    ; // empty

  /** returns the number of ConformingInstances.
   *  @see #addConformingInstance
   */
  // -beg- preserve=no 39E8FF920242 size_head337A47370316 "ClassifierRole::sizeConformingInstance"
  public int sizeConformingInstance()
  // -end- 39E8FF920242 size_head337A47370316 "ClassifierRole::sizeConformingInstance"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF920242 _link_body337A47370316 "ClassifierRole::_linkConformingInstance"
  public void _linkConformingInstance(Instance conformingInstance1);
  // -end- 39E8FF920242 _link_body337A47370316 "ClassifierRole::_linkConformingInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF920242 _unlink_body337A47370316 "ClassifierRole::_unlinkConformingInstance"
  public void _unlinkConformingInstance(Instance conformingInstance1);
  // -end- 39E8FF920242 _unlink_body337A47370316 "ClassifierRole::_unlinkConformingInstance"

  /** get current value of multiplicity
   *  @see #setMultiplicity
   */
  // -beg- preserve=no 33CD54F601F4 get_head337A47370316 "multiplicity"
   Multiplicity getMultiplicity()
  // -end- 33CD54F601F4 get_head337A47370316 "multiplicity"
    ; // empty
  /** set current value of multiplicity
   *  @see #getMultiplicity
   */
  // -beg- preserve=no 33CD54F601F4 set_head337A47370316 "multiplicity"
   void setMultiplicity(Multiplicity value1)
  // -end- 33CD54F601F4 set_head337A47370316 "multiplicity"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 337A47370316 detail_end "ClassifierRole"

  // -end- 337A47370316 detail_end "ClassifierRole"

}

=======
public interface ClassifierRole extends Classifier, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 337A47370316 detail_begin "ClassifierRole"

// -end- 337A47370316 detail_begin "ClassifierRole"

/** add a Base.
 *
 *  @see #removeBase
 *  @see #containsBase
 *  @see #iteratorBase
 *  @see #clearBase
 *  @see #sizeBase
 */
// -beg- preserve=no 33CD4F090208 add_head337A47370316 "ClassifierRole::addBase"
public void addBase(Classifier base1)
// -end- 33CD4F090208 add_head337A47370316 "ClassifierRole::addBase"
;     // empty

/** disconnect a Base.
 *  @see #addBase
 */
// -beg- preserve=no 33CD4F090208 remove_head337A47370316 "ClassifierRole::removeBase"
public Classifier removeBase(Classifier base1)
// -end- 33CD4F090208 remove_head337A47370316 "ClassifierRole::removeBase"
;     // empty

/** tests if a given Base is connected.
 *  @see #addBase
 */
// -beg- preserve=no 33CD4F090208 test_head337A47370316 "ClassifierRole::containsBase"
public boolean containsBase(Classifier base1)
// -end- 33CD4F090208 test_head337A47370316 "ClassifierRole::containsBase"
;     // empty

/** used to enumerate all connected Bases.
 *  @see #addBase
 */
// -beg- preserve=no 33CD4F090208 get_all_head337A47370316 "ClassifierRole::iteratorBase"
public Iterator<?> iteratorBase()
// -end- 33CD4F090208 get_all_head337A47370316 "ClassifierRole::iteratorBase"
;     // empty

/** disconnect all Bases.
 *  @see #addBase
 */
// -beg- preserve=no 33CD4F090208 remove_all_head337A47370316 "ClassifierRole::clearBase"
public void clearBase()
// -end- 33CD4F090208 remove_all_head337A47370316 "ClassifierRole::clearBase"
;     // empty

/** returns the number of Bases.
 *  @see #addBase
 */
// -beg- preserve=no 33CD4F090208 size_head337A47370316 "ClassifierRole::sizeBase"
public int sizeBase()
// -end- 33CD4F090208 size_head337A47370316 "ClassifierRole::sizeBase"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD4F090208 _link_body337A47370316 "ClassifierRole::_linkBase"
public void _linkBase(Classifier base1);
// -end- 33CD4F090208 _link_body337A47370316 "ClassifierRole::_linkBase"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD4F090208 _unlink_body337A47370316 "ClassifierRole::_unlinkBase"
public void _unlinkBase(Classifier base1);
// -end- 33CD4F090208 _unlink_body337A47370316 "ClassifierRole::_unlinkBase"

/** add a AssociationEndRole.
 *
 *  @see #removeAssociationEndRole
 *  @see #containsAssociationEndRole
 *  @see #iteratorAssociationEndRole
 *  @see #clearAssociationEndRole
 *  @see #sizeAssociationEndRole
 */
// -beg- preserve=no 33CD4F7101EA add_head337A47370316 "ClassifierRole::addAssociationEndRole"
public void addAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 33CD4F7101EA add_head337A47370316 "ClassifierRole::addAssociationEndRole"
;     // empty

/** disconnect a AssociationEndRole.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD4F7101EA remove_head337A47370316 "ClassifierRole::removeAssociationEndRole"
public AssociationEndRole removeAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 33CD4F7101EA remove_head337A47370316 "ClassifierRole::removeAssociationEndRole"
;     // empty

/** tests if a given AssociationEndRole is connected.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD4F7101EA test_head337A47370316 "ClassifierRole::containsAssociationEndRole"
public boolean containsAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 33CD4F7101EA test_head337A47370316 "ClassifierRole::containsAssociationEndRole"
;     // empty

/** used to enumerate all connected AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD4F7101EA get_all_head337A47370316 "ClassifierRole::iteratorAssociationEndRole"
public Iterator<?> iteratorAssociationEndRole()
// -end- 33CD4F7101EA get_all_head337A47370316 "ClassifierRole::iteratorAssociationEndRole"
;     // empty

/** disconnect all AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD4F7101EA remove_all_head337A47370316 "ClassifierRole::clearAssociationEndRole"
public void clearAssociationEndRole()
// -end- 33CD4F7101EA remove_all_head337A47370316 "ClassifierRole::clearAssociationEndRole"
;     // empty

/** returns the number of AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 33CD4F7101EA size_head337A47370316 "ClassifierRole::sizeAssociationEndRole"
public int sizeAssociationEndRole()
// -end- 33CD4F7101EA size_head337A47370316 "ClassifierRole::sizeAssociationEndRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD4F7101EA _link_body337A47370316 "ClassifierRole::_linkAssociationEndRole"
public void _linkAssociationEndRole(AssociationEndRole associationEndRole1);
// -end- 33CD4F7101EA _link_body337A47370316 "ClassifierRole::_linkAssociationEndRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD4F7101EA _unlink_body337A47370316 "ClassifierRole::_unlinkAssociationEndRole"
public void _unlinkAssociationEndRole(AssociationEndRole associationEndRole1);
// -end- 33CD4F7101EA _unlink_body337A47370316 "ClassifierRole::_unlinkAssociationEndRole"

/** add a Collaboration.
 *
 *  @see #removeCollaboration
 *  @see #containsCollaboration
 *  @see #iteratorCollaboration
 *  @see #clearCollaboration
 *  @see #sizeCollaboration
 */
// -beg- preserve=no 33D1394E029F add_head337A47370316 "ModelElement::addCollaboration"
public void addCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F add_head337A47370316 "ModelElement::addCollaboration"
;     // empty

/** disconnect a Collaboration.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_head337A47370316 "ModelElement::removeCollaboration"
public Collaboration removeCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F remove_head337A47370316 "ModelElement::removeCollaboration"
;     // empty

/** tests if a given Collaboration is connected.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F test_head337A47370316 "ModelElement::containsCollaboration"
public boolean containsCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F test_head337A47370316 "ModelElement::containsCollaboration"
;     // empty

/** used to enumerate all connected Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F get_all_head337A47370316 "ModelElement::iteratorCollaboration"
public Iterator<?> iteratorCollaboration()
// -end- 33D1394E029F get_all_head337A47370316 "ModelElement::iteratorCollaboration"
;     // empty

/** disconnect all Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_all_head337A47370316 "ModelElement::clearCollaboration"
public void clearCollaboration()
// -end- 33D1394E029F remove_all_head337A47370316 "ModelElement::clearCollaboration"
;     // empty

/** returns the number of Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F size_head337A47370316 "ModelElement::sizeCollaboration"
public int sizeCollaboration()
// -end- 33D1394E029F size_head337A47370316 "ModelElement::sizeCollaboration"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _link_body337A47370316 "ModelElement::_linkCollaboration"
public void _linkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _link_body337A47370316 "ModelElement::_linkCollaboration"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _unlink_body337A47370316 "ModelElement::_unlinkCollaboration"
public void _unlinkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _unlink_body337A47370316 "ModelElement::_unlinkCollaboration"

/** add a AvailableFeature.
 *
 *  @see #removeAvailableFeature
 *  @see #containsAvailableFeature
 *  @see #iteratorAvailableFeature
 *  @see #clearAvailableFeature
 *  @see #sizeAvailableFeature
 */
// -beg- preserve=no 33CD57D3021C add_head337A47370316 "ClassifierRole::addAvailableFeature"
public void addAvailableFeature(Feature availableFeature1)
// -end- 33CD57D3021C add_head337A47370316 "ClassifierRole::addAvailableFeature"
;     // empty

/** disconnect a AvailableFeature.
 *  @see #addAvailableFeature
 */
// -beg- preserve=no 33CD57D3021C remove_head337A47370316 "ClassifierRole::removeAvailableFeature"
public Feature removeAvailableFeature(Feature availableFeature1)
// -end- 33CD57D3021C remove_head337A47370316 "ClassifierRole::removeAvailableFeature"
;     // empty

/** tests if a given AvailableFeature is connected.
 *  @see #addAvailableFeature
 */
// -beg- preserve=no 33CD57D3021C test_head337A47370316 "ClassifierRole::containsAvailableFeature"
public boolean containsAvailableFeature(Feature availableFeature1)
// -end- 33CD57D3021C test_head337A47370316 "ClassifierRole::containsAvailableFeature"
;     // empty

/** used to enumerate all connected AvailableFeatures.
 *  @see #addAvailableFeature
 */
// -beg- preserve=no 33CD57D3021C get_all_head337A47370316 "ClassifierRole::iteratorAvailableFeature"
public Iterator<?> iteratorAvailableFeature()
// -end- 33CD57D3021C get_all_head337A47370316 "ClassifierRole::iteratorAvailableFeature"
;     // empty

/** disconnect all AvailableFeatures.
 *  @see #addAvailableFeature
 */
// -beg- preserve=no 33CD57D3021C remove_all_head337A47370316 "ClassifierRole::clearAvailableFeature"
public void clearAvailableFeature()
// -end- 33CD57D3021C remove_all_head337A47370316 "ClassifierRole::clearAvailableFeature"
;     // empty

/** returns the number of AvailableFeatures.
 *  @see #addAvailableFeature
 */
// -beg- preserve=no 33CD57D3021C size_head337A47370316 "ClassifierRole::sizeAvailableFeature"
public int sizeAvailableFeature()
// -end- 33CD57D3021C size_head337A47370316 "ClassifierRole::sizeAvailableFeature"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD57D3021C _link_body337A47370316 "ClassifierRole::_linkAvailableFeature"
public void _linkAvailableFeature(Feature availableFeature1);
// -end- 33CD57D3021C _link_body337A47370316 "ClassifierRole::_linkAvailableFeature"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD57D3021C _unlink_body337A47370316 "ClassifierRole::_unlinkAvailableFeature"
public void _unlinkAvailableFeature(Feature availableFeature1);
// -end- 33CD57D3021C _unlink_body337A47370316 "ClassifierRole::_unlinkAvailableFeature"

/** add a Message.
 *
 *  @see #removeMessage
 *  @see #containsMessage
 *  @see #iteratorMessage
 *  @see #clearMessage
 *  @see #sizeMessage
 */
// -beg- preserve=no 33DBBB2B03DF add_head337A47370316 "ClassifierRole::addMessage"
public void addMessage(Message message1)
// -end- 33DBBB2B03DF add_head337A47370316 "ClassifierRole::addMessage"
;     // empty

/** disconnect a Message.
 *  @see #addMessage
 */
// -beg- preserve=no 33DBBB2B03DF remove_head337A47370316 "ClassifierRole::removeMessage"
public Message removeMessage(Message message1)
// -end- 33DBBB2B03DF remove_head337A47370316 "ClassifierRole::removeMessage"
;     // empty

/** tests if a given Message is connected.
 *  @see #addMessage
 */
// -beg- preserve=no 33DBBB2B03DF test_head337A47370316 "ClassifierRole::containsMessage"
public boolean containsMessage(Message message1)
// -end- 33DBBB2B03DF test_head337A47370316 "ClassifierRole::containsMessage"
;     // empty

/** used to enumerate all connected Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 33DBBB2B03DF get_all_head337A47370316 "ClassifierRole::iteratorMessage"
public Iterator<?> iteratorMessage()
// -end- 33DBBB2B03DF get_all_head337A47370316 "ClassifierRole::iteratorMessage"
;     // empty

/** disconnect all Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 33DBBB2B03DF remove_all_head337A47370316 "ClassifierRole::clearMessage"
public void clearMessage()
// -end- 33DBBB2B03DF remove_all_head337A47370316 "ClassifierRole::clearMessage"
;     // empty

/** returns the number of Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 33DBBB2B03DF size_head337A47370316 "ClassifierRole::sizeMessage"
public int sizeMessage()
// -end- 33DBBB2B03DF size_head337A47370316 "ClassifierRole::sizeMessage"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBBB2B03DF _link_body337A47370316 "ClassifierRole::_linkMessage"
public void _linkMessage(Message message1);
// -end- 33DBBB2B03DF _link_body337A47370316 "ClassifierRole::_linkMessage"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBBB2B03DF _unlink_body337A47370316 "ClassifierRole::_unlinkMessage"
public void _unlinkMessage(Message message1);
// -end- 33DBBB2B03DF _unlink_body337A47370316 "ClassifierRole::_unlinkMessage"

/** add a AvailableContents.
 *
 *  @see #removeAvailableContents
 *  @see #containsAvailableContents
 *  @see #iteratorAvailableContents
 *  @see #clearAvailableContents
 *  @see #sizeAvailableContents
 */
// -beg- preserve=no 36008FB700E6 add_head337A47370316 "ClassifierRole::addAvailableContents"
public void addAvailableContents(ModelElement availableContents1)
// -end- 36008FB700E6 add_head337A47370316 "ClassifierRole::addAvailableContents"
;     // empty

/** disconnect a AvailableContents.
 *  @see #addAvailableContents
 */
// -beg- preserve=no 36008FB700E6 remove_head337A47370316 "ClassifierRole::removeAvailableContents"
public ModelElement removeAvailableContents(ModelElement availableContents1)
// -end- 36008FB700E6 remove_head337A47370316 "ClassifierRole::removeAvailableContents"
;     // empty

/** tests if a given AvailableContents is connected.
 *  @see #addAvailableContents
 */
// -beg- preserve=no 36008FB700E6 test_head337A47370316 "ClassifierRole::containsAvailableContents"
public boolean containsAvailableContents(ModelElement availableContents1)
// -end- 36008FB700E6 test_head337A47370316 "ClassifierRole::containsAvailableContents"
;     // empty

/** used to enumerate all connected AvailableContentss.
 *  @see #addAvailableContents
 */
// -beg- preserve=no 36008FB700E6 get_all_head337A47370316 "ClassifierRole::iteratorAvailableContents"
public Iterator<?> iteratorAvailableContents()
// -end- 36008FB700E6 get_all_head337A47370316 "ClassifierRole::iteratorAvailableContents"
;     // empty

/** disconnect all AvailableContentss.
 *  @see #addAvailableContents
 */
// -beg- preserve=no 36008FB700E6 remove_all_head337A47370316 "ClassifierRole::clearAvailableContents"
public void clearAvailableContents()
// -end- 36008FB700E6 remove_all_head337A47370316 "ClassifierRole::clearAvailableContents"
;     // empty

/** returns the number of AvailableContentss.
 *  @see #addAvailableContents
 */
// -beg- preserve=no 36008FB700E6 size_head337A47370316 "ClassifierRole::sizeAvailableContents"
public int sizeAvailableContents()
// -end- 36008FB700E6 size_head337A47370316 "ClassifierRole::sizeAvailableContents"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36008FB700E6 _link_body337A47370316 "ClassifierRole::_linkAvailableContents"
public void _linkAvailableContents(ModelElement availableContents1);
// -end- 36008FB700E6 _link_body337A47370316 "ClassifierRole::_linkAvailableContents"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36008FB700E6 _unlink_body337A47370316 "ClassifierRole::_unlinkAvailableContents"
public void _unlinkAvailableContents(ModelElement availableContents1);
// -end- 36008FB700E6 _unlink_body337A47370316 "ClassifierRole::_unlinkAvailableContents"

/** add a ConformingInstance.
 *
 *  @see #removeConformingInstance
 *  @see #containsConformingInstance
 *  @see #iteratorConformingInstance
 *  @see #clearConformingInstance
 *  @see #sizeConformingInstance
 */
// -beg- preserve=no 39E8FF920242 add_head337A47370316 "ClassifierRole::addConformingInstance"
public void addConformingInstance(Instance conformingInstance1)
// -end- 39E8FF920242 add_head337A47370316 "ClassifierRole::addConformingInstance"
;     // empty

/** disconnect a ConformingInstance.
 *  @see #addConformingInstance
 */
// -beg- preserve=no 39E8FF920242 remove_head337A47370316 "ClassifierRole::removeConformingInstance"
public Instance removeConformingInstance(Instance conformingInstance1)
// -end- 39E8FF920242 remove_head337A47370316 "ClassifierRole::removeConformingInstance"
;     // empty

/** tests if a given ConformingInstance is connected.
 *  @see #addConformingInstance
 */
// -beg- preserve=no 39E8FF920242 test_head337A47370316 "ClassifierRole::containsConformingInstance"
public boolean containsConformingInstance(Instance conformingInstance1)
// -end- 39E8FF920242 test_head337A47370316 "ClassifierRole::containsConformingInstance"
;     // empty

/** used to enumerate all connected ConformingInstances.
 *  @see #addConformingInstance
 */
// -beg- preserve=no 39E8FF920242 get_all_head337A47370316 "ClassifierRole::iteratorConformingInstance"
public Iterator<?> iteratorConformingInstance()
// -end- 39E8FF920242 get_all_head337A47370316 "ClassifierRole::iteratorConformingInstance"
;     // empty

/** disconnect all ConformingInstances.
 *  @see #addConformingInstance
 */
// -beg- preserve=no 39E8FF920242 remove_all_head337A47370316 "ClassifierRole::clearConformingInstance"
public void clearConformingInstance()
// -end- 39E8FF920242 remove_all_head337A47370316 "ClassifierRole::clearConformingInstance"
;     // empty

/** returns the number of ConformingInstances.
 *  @see #addConformingInstance
 */
// -beg- preserve=no 39E8FF920242 size_head337A47370316 "ClassifierRole::sizeConformingInstance"
public int sizeConformingInstance()
// -end- 39E8FF920242 size_head337A47370316 "ClassifierRole::sizeConformingInstance"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FF920242 _link_body337A47370316 "ClassifierRole::_linkConformingInstance"
public void _linkConformingInstance(Instance conformingInstance1);
// -end- 39E8FF920242 _link_body337A47370316 "ClassifierRole::_linkConformingInstance"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FF920242 _unlink_body337A47370316 "ClassifierRole::_unlinkConformingInstance"
public void _unlinkConformingInstance(Instance conformingInstance1);
// -end- 39E8FF920242 _unlink_body337A47370316 "ClassifierRole::_unlinkConformingInstance"

/** get current value of multiplicity
 *  @see #setMultiplicity
 */
// -beg- preserve=no 33CD54F601F4 get_head337A47370316 "multiplicity"
Multiplicity getMultiplicity()
// -end- 33CD54F601F4 get_head337A47370316 "multiplicity"
;     // empty
/** set current value of multiplicity
 *  @see #getMultiplicity
 */
// -beg- preserve=no 33CD54F601F4 set_head337A47370316 "multiplicity"
void setMultiplicity(Multiplicity value1)
// -end- 33CD54F601F4 set_head337A47370316 "multiplicity"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 337A47370316 detail_end "ClassifierRole"

// -end- 337A47370316 detail_end "ClassifierRole"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
