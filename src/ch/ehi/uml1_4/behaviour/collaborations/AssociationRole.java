// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:45 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 337A480F01E0 package "AssociationRole"
package ch.ehi.uml1_4.behaviour.collaborations;
// -end- 337A480F01E0 package "AssociationRole"

// -beg- preserve=no 337A480F01E0 autoimport "AssociationRole"
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;

import java.util.Iterator;

import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.Message;
import ch.ehi.uml1_4.behaviour.commonbehavior.Link;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
// -end- 337A480F01E0 autoimport "AssociationRole"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 337A480F01E0 import "AssociationRole"

// -end- 337A480F01E0 import "AssociationRole"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:45 $
 */
public interface AssociationRole extends Association, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 337A480F01E0 detail_begin "AssociationRole"

// -end- 337A480F01E0 detail_begin "AssociationRole"

/** add a Connection.
 *
 *  @see #removeConnection
 *  @see #containsConnection
 *  @see #iteratorConnection
 *  @see #clearConnection
 *  @see #sizeConnection
 */
// -beg- preserve=no 32A2A510017A add_head337A480F01E0 "Association::addConnection"
public void addConnection(AssociationEnd connection1)
// -end- 32A2A510017A add_head337A480F01E0 "Association::addConnection"
;     // empty

// -beg- preserve=no 32A2A510017A add2_head337A480F01E0 "Association::add2Connection"
public void addConnection(int index,AssociationEnd connection1)
// -end- 32A2A510017A add2_head337A480F01E0 "Association::add2Connection"
;     // empty

/** disconnect a Connection.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A remove_head337A480F01E0 "Association::removeConnection"
public AssociationEnd removeConnection(AssociationEnd connection1)
// -end- 32A2A510017A remove_head337A480F01E0 "Association::removeConnection"
;     // empty

/** disconnect a Connection.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A remove2_head337A480F01E0 "Association::remove2Connection"
public AssociationEnd removeConnection(int index)
// -end- 32A2A510017A remove2_head337A480F01E0 "Association::remove2Connection"
;     // empty

/** change a Connection.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A set_head337A480F01E0 "Association::setConnection"
public AssociationEnd setConnection(int index,AssociationEnd connection1)
// -end- 32A2A510017A set_head337A480F01E0 "Association::setConnection"
;     // empty

/** tests if a given Connection is connected.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A test_head337A480F01E0 "Association::containsConnection"
public boolean containsConnection(AssociationEnd connection1)
// -end- 32A2A510017A test_head337A480F01E0 "Association::containsConnection"
;     // empty

/** used to enumerate all connected Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A get_all_head337A480F01E0 "Association::iteratorConnection"
public Iterator<?> iteratorConnection()
// -end- 32A2A510017A get_all_head337A480F01E0 "Association::iteratorConnection"
;     // empty

/** disconnect all Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A remove_all_head337A480F01E0 "Association::clearConnection"
public void clearConnection()
// -end- 32A2A510017A remove_all_head337A480F01E0 "Association::clearConnection"
;     // empty

/** returns the number of Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A size_head337A480F01E0 "Association::sizeConnection"
public int sizeConnection()
// -end- 32A2A510017A size_head337A480F01E0 "Association::sizeConnection"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 32A2A510017A _link_body337A480F01E0 "Association::_linkConnection"
public void _linkConnection(AssociationEnd connection1);
// -end- 32A2A510017A _link_body337A480F01E0 "Association::_linkConnection"

/** DONT USE; link management internal
 */
// -beg- preserve=no 32A2A510017A _unlink_body337A480F01E0 "Association::_unlinkConnection"
public void _unlinkConnection(AssociationEnd connection1);
// -end- 32A2A510017A _unlink_body337A480F01E0 "Association::_unlinkConnection"

/** attaches a Base.
 *
 *  @see #detachBase
 *  @see #getBase
 *  @see #containsBase
 */
// -beg- preserve=no 33CD511700D2 attach_head337A480F01E0 "AssociationRole::attachBase"
public void attachBase(Association base1)
// -end- 33CD511700D2 attach_head337A480F01E0 "AssociationRole::attachBase"
;     // empty

/** disconnect the currently attached Base.
 *  @see #attachBase
 */
// -beg- preserve=no 33CD511700D2 detach_head337A480F01E0 "AssociationRole::detachBase"
public Association detachBase()
// -end- 33CD511700D2 detach_head337A480F01E0 "AssociationRole::detachBase"
;     // empty

/** get the currently attached Base.
 *  @see #attachBase
 */
// -beg- preserve=no 33CD511700D2 get_head337A480F01E0 "AssociationRole::getBase"
public Association getBase()
// -end- 33CD511700D2 get_head337A480F01E0 "AssociationRole::getBase"
;     // empty

/** tests if there is a Base attached.
 *  @see #attachBase
 */
// -beg- preserve=no 33CD511700D2 test_head337A480F01E0 "AssociationRole::containsBase"
public boolean containsBase()
// -end- 33CD511700D2 test_head337A480F01E0 "AssociationRole::containsBase"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD511700D2 _link_body337A480F01E0 "AssociationRole::_linkBase"
public void _linkBase(Association base1);
// -end- 33CD511700D2 _link_body337A480F01E0 "AssociationRole::_linkBase"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD511700D2 _unlink_body337A480F01E0 "AssociationRole::_unlinkBase"
public void _unlinkBase(Association base1);
// -end- 33CD511700D2 _unlink_body337A480F01E0 "AssociationRole::_unlinkBase"

/** add a Collaboration.
 *
 *  @see #removeCollaboration
 *  @see #containsCollaboration
 *  @see #iteratorCollaboration
 *  @see #clearCollaboration
 *  @see #sizeCollaboration
 */
// -beg- preserve=no 33D1394E029F add_head337A480F01E0 "ModelElement::addCollaboration"
public void addCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F add_head337A480F01E0 "ModelElement::addCollaboration"
;     // empty

/** disconnect a Collaboration.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_head337A480F01E0 "ModelElement::removeCollaboration"
public Collaboration removeCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F remove_head337A480F01E0 "ModelElement::removeCollaboration"
;     // empty

/** tests if a given Collaboration is connected.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F test_head337A480F01E0 "ModelElement::containsCollaboration"
public boolean containsCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F test_head337A480F01E0 "ModelElement::containsCollaboration"
;     // empty

/** used to enumerate all connected Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F get_all_head337A480F01E0 "ModelElement::iteratorCollaboration"
public Iterator<?> iteratorCollaboration()
// -end- 33D1394E029F get_all_head337A480F01E0 "ModelElement::iteratorCollaboration"
;     // empty

/** disconnect all Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_all_head337A480F01E0 "ModelElement::clearCollaboration"
public void clearCollaboration()
// -end- 33D1394E029F remove_all_head337A480F01E0 "ModelElement::clearCollaboration"
;     // empty

/** returns the number of Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F size_head337A480F01E0 "ModelElement::sizeCollaboration"
public int sizeCollaboration()
// -end- 33D1394E029F size_head337A480F01E0 "ModelElement::sizeCollaboration"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _link_body337A480F01E0 "ModelElement::_linkCollaboration"
public void _linkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _link_body337A480F01E0 "ModelElement::_linkCollaboration"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _unlink_body337A480F01E0 "ModelElement::_unlinkCollaboration"
public void _unlinkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _unlink_body337A480F01E0 "ModelElement::_unlinkCollaboration"

/** add a Message.
 *
 *  @see #removeMessage
 *  @see #containsMessage
 *  @see #iteratorMessage
 *  @see #clearMessage
 *  @see #sizeMessage
 */
// -beg- preserve=no 35FEAB5F01C3 add_head337A480F01E0 "AssociationRole::addMessage"
public void addMessage(Message message1)
// -end- 35FEAB5F01C3 add_head337A480F01E0 "AssociationRole::addMessage"
;     // empty

/** disconnect a Message.
 *  @see #addMessage
 */
// -beg- preserve=no 35FEAB5F01C3 remove_head337A480F01E0 "AssociationRole::removeMessage"
public Message removeMessage(Message message1)
// -end- 35FEAB5F01C3 remove_head337A480F01E0 "AssociationRole::removeMessage"
;     // empty

/** tests if a given Message is connected.
 *  @see #addMessage
 */
// -beg- preserve=no 35FEAB5F01C3 test_head337A480F01E0 "AssociationRole::containsMessage"
public boolean containsMessage(Message message1)
// -end- 35FEAB5F01C3 test_head337A480F01E0 "AssociationRole::containsMessage"
;     // empty

/** used to enumerate all connected Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 35FEAB5F01C3 get_all_head337A480F01E0 "AssociationRole::iteratorMessage"
public Iterator<?> iteratorMessage()
// -end- 35FEAB5F01C3 get_all_head337A480F01E0 "AssociationRole::iteratorMessage"
;     // empty

/** disconnect all Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 35FEAB5F01C3 remove_all_head337A480F01E0 "AssociationRole::clearMessage"
public void clearMessage()
// -end- 35FEAB5F01C3 remove_all_head337A480F01E0 "AssociationRole::clearMessage"
;     // empty

/** returns the number of Messages.
 *  @see #addMessage
 */
// -beg- preserve=no 35FEAB5F01C3 size_head337A480F01E0 "AssociationRole::sizeMessage"
public int sizeMessage()
// -end- 35FEAB5F01C3 size_head337A480F01E0 "AssociationRole::sizeMessage"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 35FEAB5F01C3 _link_body337A480F01E0 "AssociationRole::_linkMessage"
public void _linkMessage(Message message1);
// -end- 35FEAB5F01C3 _link_body337A480F01E0 "AssociationRole::_linkMessage"

/** DONT USE; link management internal
 */
// -beg- preserve=no 35FEAB5F01C3 _unlink_body337A480F01E0 "AssociationRole::_unlinkMessage"
public void _unlinkMessage(Message message1);
// -end- 35FEAB5F01C3 _unlink_body337A480F01E0 "AssociationRole::_unlinkMessage"

/** add a ConformingLink.
 *
 *  @see #removeConformingLink
 *  @see #containsConformingLink
 *  @see #iteratorConformingLink
 *  @see #clearConformingLink
 *  @see #sizeConformingLink
 */
// -beg- preserve=no 39E8FECB009C add_head337A480F01E0 "AssociationRole::addConformingLink"
public void addConformingLink(Link conformingLink1)
// -end- 39E8FECB009C add_head337A480F01E0 "AssociationRole::addConformingLink"
;     // empty

/** disconnect a ConformingLink.
 *  @see #addConformingLink
 */
// -beg- preserve=no 39E8FECB009C remove_head337A480F01E0 "AssociationRole::removeConformingLink"
public Link removeConformingLink(Link conformingLink1)
// -end- 39E8FECB009C remove_head337A480F01E0 "AssociationRole::removeConformingLink"
;     // empty

/** tests if a given ConformingLink is connected.
 *  @see #addConformingLink
 */
// -beg- preserve=no 39E8FECB009C test_head337A480F01E0 "AssociationRole::containsConformingLink"
public boolean containsConformingLink(Link conformingLink1)
// -end- 39E8FECB009C test_head337A480F01E0 "AssociationRole::containsConformingLink"
;     // empty

/** used to enumerate all connected ConformingLinks.
 *  @see #addConformingLink
 */
// -beg- preserve=no 39E8FECB009C get_all_head337A480F01E0 "AssociationRole::iteratorConformingLink"
public Iterator<?> iteratorConformingLink()
// -end- 39E8FECB009C get_all_head337A480F01E0 "AssociationRole::iteratorConformingLink"
;     // empty

/** disconnect all ConformingLinks.
 *  @see #addConformingLink
 */
// -beg- preserve=no 39E8FECB009C remove_all_head337A480F01E0 "AssociationRole::clearConformingLink"
public void clearConformingLink()
// -end- 39E8FECB009C remove_all_head337A480F01E0 "AssociationRole::clearConformingLink"
;     // empty

/** returns the number of ConformingLinks.
 *  @see #addConformingLink
 */
// -beg- preserve=no 39E8FECB009C size_head337A480F01E0 "AssociationRole::sizeConformingLink"
public int sizeConformingLink()
// -end- 39E8FECB009C size_head337A480F01E0 "AssociationRole::sizeConformingLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FECB009C _link_body337A480F01E0 "AssociationRole::_linkConformingLink"
public void _linkConformingLink(Link conformingLink1);
// -end- 39E8FECB009C _link_body337A480F01E0 "AssociationRole::_linkConformingLink"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E8FECB009C _unlink_body337A480F01E0 "AssociationRole::_unlinkConformingLink"
public void _unlinkConformingLink(Link conformingLink1);
// -end- 39E8FECB009C _unlink_body337A480F01E0 "AssociationRole::_unlinkConformingLink"

/** get current value of multiplicity
 *  @see #setMultiplicity
 */
// -beg- preserve=no 33CD553E03B6 get_head337A480F01E0 "multiplicity"
Multiplicity getMultiplicity()
// -end- 33CD553E03B6 get_head337A480F01E0 "multiplicity"
;     // empty
/** set current value of multiplicity
 *  @see #getMultiplicity
 */
// -beg- preserve=no 33CD553E03B6 set_head337A480F01E0 "multiplicity"
void setMultiplicity(Multiplicity value1)
// -end- 33CD553E03B6 set_head337A480F01E0 "multiplicity"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 337A480F01E0 detail_end "AssociationRole"

// -end- 337A480F01E0 detail_end "AssociationRole"

}
