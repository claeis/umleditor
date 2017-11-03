// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:18 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3298AE8300D9 package "Association"
package ch.ehi.uml1_4.foundation.core;
// -end- 3298AE8300D9 package "Association"

// -beg- preserve=no 3298AE8300D9 autoimport "Association"
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
import ch.ehi.uml1_4.foundation.core.Relationship;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.collaborations.AssociationRole;
import ch.ehi.uml1_4.behaviour.commonbehavior.Link;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
// -end- 3298AE8300D9 autoimport "Association"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3298AE8300D9 import "Association"

// -end- 3298AE8300D9 import "Association"

/** An association defines a semantic relationship between classifiers.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:18 $
 */
<<<<<<< HEAD
public interface Association extends GeneralizableElement , Relationship , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3298AE8300D9 detail_begin "Association"

  // -end- 3298AE8300D9 detail_begin "Association"

  // -beg- preserve=no 3E429071039C head3298AE8300D9 "deepRemoveConnection"
  public void deepRemoveConnection(AssociationEnd connection1)
  // -end- 3E429071039C head3298AE8300D9 "deepRemoveConnection"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3E429071039C throws3298AE8300D9 "deepRemoveConnection"

    // -end- 3E429071039C throws3298AE8300D9 "deepRemoveConnection"
    ; // empty

  /** add a AssociationRole.
   *  
   *  @see #removeAssociationRole
   *  @see #containsAssociationRole
   *  @see #iteratorAssociationRole
   *  @see #clearAssociationRole
   *  @see #sizeAssociationRole
   */
  // -beg- preserve=no 33CD51170096 add_head3298AE8300D9 "Association::addAssociationRole"
  public void addAssociationRole(AssociationRole associationRole1)
  // -end- 33CD51170096 add_head3298AE8300D9 "Association::addAssociationRole"
    ; // empty

  /** disconnect a AssociationRole.
   *  @see #addAssociationRole
   */
  // -beg- preserve=no 33CD51170096 remove_head3298AE8300D9 "Association::removeAssociationRole"
  public AssociationRole removeAssociationRole(AssociationRole associationRole1)
  // -end- 33CD51170096 remove_head3298AE8300D9 "Association::removeAssociationRole"
    ; // empty

  /** tests if a given AssociationRole is connected.
   *  @see #addAssociationRole
   */
  // -beg- preserve=no 33CD51170096 test_head3298AE8300D9 "Association::containsAssociationRole"
  public boolean containsAssociationRole(AssociationRole associationRole1)
  // -end- 33CD51170096 test_head3298AE8300D9 "Association::containsAssociationRole"
    ; // empty

  /** used to enumerate all connected AssociationRoles.
   *  @see #addAssociationRole
   */
  // -beg- preserve=no 33CD51170096 get_all_head3298AE8300D9 "Association::iteratorAssociationRole"
  public java.util.Iterator iteratorAssociationRole()
  // -end- 33CD51170096 get_all_head3298AE8300D9 "Association::iteratorAssociationRole"
    ; // empty

  /** disconnect all AssociationRoles.
   *  @see #addAssociationRole
   */
  // -beg- preserve=no 33CD51170096 remove_all_head3298AE8300D9 "Association::clearAssociationRole"
  public void clearAssociationRole()
  // -end- 33CD51170096 remove_all_head3298AE8300D9 "Association::clearAssociationRole"
    ; // empty

  /** returns the number of AssociationRoles.
   *  @see #addAssociationRole
   */
  // -beg- preserve=no 33CD51170096 size_head3298AE8300D9 "Association::sizeAssociationRole"
  public int sizeAssociationRole()
  // -end- 33CD51170096 size_head3298AE8300D9 "Association::sizeAssociationRole"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD51170096 _link_body3298AE8300D9 "Association::_linkAssociationRole"
  public void _linkAssociationRole(AssociationRole associationRole1);
  // -end- 33CD51170096 _link_body3298AE8300D9 "Association::_linkAssociationRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD51170096 _unlink_body3298AE8300D9 "Association::_unlinkAssociationRole"
  public void _unlinkAssociationRole(AssociationRole associationRole1);
  // -end- 33CD51170096 _unlink_body3298AE8300D9 "Association::_unlinkAssociationRole"

  /** add a Link.
   *  
   *  @see #removeLink
   *  @see #containsLink
   *  @see #iteratorLink
   *  @see #clearLink
   *  @see #sizeLink
   */
  // -beg- preserve=no 328A5BB3023A add_head3298AE8300D9 "Association::addLink"
  public void addLink(Link link1)
  // -end- 328A5BB3023A add_head3298AE8300D9 "Association::addLink"
    ; // empty

  /** disconnect a Link.
   *  @see #addLink
   */
  // -beg- preserve=no 328A5BB3023A remove_head3298AE8300D9 "Association::removeLink"
  public Link removeLink(Link link1)
  // -end- 328A5BB3023A remove_head3298AE8300D9 "Association::removeLink"
    ; // empty

  /** tests if a given Link is connected.
   *  @see #addLink
   */
  // -beg- preserve=no 328A5BB3023A test_head3298AE8300D9 "Association::containsLink"
  public boolean containsLink(Link link1)
  // -end- 328A5BB3023A test_head3298AE8300D9 "Association::containsLink"
    ; // empty

  /** used to enumerate all connected Links.
   *  @see #addLink
   */
  // -beg- preserve=no 328A5BB3023A get_all_head3298AE8300D9 "Association::iteratorLink"
  public java.util.Iterator iteratorLink()
  // -end- 328A5BB3023A get_all_head3298AE8300D9 "Association::iteratorLink"
    ; // empty

  /** disconnect all Links.
   *  @see #addLink
   */
  // -beg- preserve=no 328A5BB3023A remove_all_head3298AE8300D9 "Association::clearLink"
  public void clearLink()
  // -end- 328A5BB3023A remove_all_head3298AE8300D9 "Association::clearLink"
    ; // empty

  /** returns the number of Links.
   *  @see #addLink
   */
  // -beg- preserve=no 328A5BB3023A size_head3298AE8300D9 "Association::sizeLink"
  public int sizeLink()
  // -end- 328A5BB3023A size_head3298AE8300D9 "Association::sizeLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5BB3023A _link_body3298AE8300D9 "Association::_linkLink"
  public void _linkLink(Link link1);
  // -end- 328A5BB3023A _link_body3298AE8300D9 "Association::_linkLink"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5BB3023A _unlink_body3298AE8300D9 "Association::_unlinkLink"
  public void _unlinkLink(Link link1);
  // -end- 328A5BB3023A _unlink_body3298AE8300D9 "Association::_unlinkLink"

  /** add a Connection.
   *  
   *  @see #removeConnection
   *  @see #containsConnection
   *  @see #iteratorConnection
   *  @see #clearConnection
   *  @see #sizeConnection
   */
  // -beg- preserve=no 32A2A510017A add_head3298AE8300D9 "Association::addConnection"
  public void addConnection(AssociationEnd connection1)
  // -end- 32A2A510017A add_head3298AE8300D9 "Association::addConnection"
    ; // empty

  // -beg- preserve=no 32A2A510017A add2_head3298AE8300D9 "Association::add2Connection"
  public void addConnection(int index,AssociationEnd connection1)
  // -end- 32A2A510017A add2_head3298AE8300D9 "Association::add2Connection"
    ; // empty

  /** disconnect a Connection.
   *  @see #addConnection
   */
  // -beg- preserve=no 32A2A510017A remove_head3298AE8300D9 "Association::removeConnection"
  public AssociationEnd removeConnection(AssociationEnd connection1)
  // -end- 32A2A510017A remove_head3298AE8300D9 "Association::removeConnection"
    ; // empty

  /** disconnect a Connection.
   *  @see #addConnection
   */
  // -beg- preserve=no 32A2A510017A remove2_head3298AE8300D9 "Association::remove2Connection"
  public AssociationEnd removeConnection(int index)
  // -end- 32A2A510017A remove2_head3298AE8300D9 "Association::remove2Connection"
    ; // empty

  /** change a Connection.
   *  @see #addConnection
   */
  // -beg- preserve=no 32A2A510017A set_head3298AE8300D9 "Association::setConnection"
  public AssociationEnd setConnection(int index,AssociationEnd connection1)
  // -end- 32A2A510017A set_head3298AE8300D9 "Association::setConnection"
    ; // empty

  /** tests if a given Connection is connected.
   *  @see #addConnection
   */
  // -beg- preserve=no 32A2A510017A test_head3298AE8300D9 "Association::containsConnection"
  public boolean containsConnection(AssociationEnd connection1)
  // -end- 32A2A510017A test_head3298AE8300D9 "Association::containsConnection"
    ; // empty

  /** used to enumerate all connected Connections.
   *  @see #addConnection
   */
  // -beg- preserve=no 32A2A510017A get_all_head3298AE8300D9 "Association::iteratorConnection"
  public java.util.Iterator iteratorConnection()
  // -end- 32A2A510017A get_all_head3298AE8300D9 "Association::iteratorConnection"
    ; // empty

  /** disconnect all Connections.
   *  @see #addConnection
   */
  // -beg- preserve=no 32A2A510017A remove_all_head3298AE8300D9 "Association::clearConnection"
  public void clearConnection()
  // -end- 32A2A510017A remove_all_head3298AE8300D9 "Association::clearConnection"
    ; // empty

  /** returns the number of Connections.
   *  @see #addConnection
   */
  // -beg- preserve=no 32A2A510017A size_head3298AE8300D9 "Association::sizeConnection"
  public int sizeConnection()
  // -end- 32A2A510017A size_head3298AE8300D9 "Association::sizeConnection"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32A2A510017A _link_body3298AE8300D9 "Association::_linkConnection"
  public void _linkConnection(AssociationEnd connection1);
  // -end- 32A2A510017A _link_body3298AE8300D9 "Association::_linkConnection"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32A2A510017A _unlink_body3298AE8300D9 "Association::_unlinkConnection"
  public void _unlinkConnection(AssociationEnd connection1);
  // -end- 32A2A510017A _unlink_body3298AE8300D9 "Association::_unlinkConnection"

  /** add a Presentation.
   *  
   *  @see #removePresentation
   *  @see #containsPresentation
   *  @see #iteratorPresentation
   *  @see #clearPresentation
   *  @see #sizePresentation
   */
  // -beg- preserve=no 362409A9000A add_head3298AE8300D9 "ModelElement::addPresentation"
  public void addPresentation(PresentationElement presentation1)
  // -end- 362409A9000A add_head3298AE8300D9 "ModelElement::addPresentation"
    ; // empty

  /** disconnect a Presentation.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_head3298AE8300D9 "ModelElement::removePresentation"
  public PresentationElement removePresentation(PresentationElement presentation1)
  // -end- 362409A9000A remove_head3298AE8300D9 "ModelElement::removePresentation"
    ; // empty

  /** tests if a given Presentation is connected.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A test_head3298AE8300D9 "ModelElement::containsPresentation"
  public boolean containsPresentation(PresentationElement presentation1)
  // -end- 362409A9000A test_head3298AE8300D9 "ModelElement::containsPresentation"
    ; // empty

  /** used to enumerate all connected Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A get_all_head3298AE8300D9 "ModelElement::iteratorPresentation"
  public java.util.Iterator iteratorPresentation()
  // -end- 362409A9000A get_all_head3298AE8300D9 "ModelElement::iteratorPresentation"
    ; // empty

  /** disconnect all Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_all_head3298AE8300D9 "ModelElement::clearPresentation"
  public void clearPresentation()
  // -end- 362409A9000A remove_all_head3298AE8300D9 "ModelElement::clearPresentation"
    ; // empty

  /** returns the number of Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A size_head3298AE8300D9 "ModelElement::sizePresentation"
  public int sizePresentation()
  // -end- 362409A9000A size_head3298AE8300D9 "ModelElement::sizePresentation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _link_body3298AE8300D9 "ModelElement::_linkPresentation"
  public void _linkPresentation(PresentationElement presentation1);
  // -end- 362409A9000A _link_body3298AE8300D9 "ModelElement::_linkPresentation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _unlink_body3298AE8300D9 "ModelElement::_unlinkPresentation"
  public void _unlinkPresentation(PresentationElement presentation1);
  // -end- 362409A9000A _unlink_body3298AE8300D9 "ModelElement::_unlinkPresentation"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3298AE8300D9 detail_end "Association"

  // -end- 3298AE8300D9 detail_end "Association"

}

=======
public interface Association extends GeneralizableElement, Relationship, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3298AE8300D9 detail_begin "Association"

// -end- 3298AE8300D9 detail_begin "Association"

// -beg- preserve=no 3E429071039C head3298AE8300D9 "deepRemoveConnection"
public void deepRemoveConnection(AssociationEnd connection1)
// -end- 3E429071039C head3298AE8300D9 "deepRemoveConnection"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3E429071039C throws3298AE8300D9 "deepRemoveConnection"

// -end- 3E429071039C throws3298AE8300D9 "deepRemoveConnection"
;     // empty

/** add a AssociationRole.
 *
 *  @see #removeAssociationRole
 *  @see #containsAssociationRole
 *  @see #iteratorAssociationRole
 *  @see #clearAssociationRole
 *  @see #sizeAssociationRole
 */
// -beg- preserve=no 33CD51170096 add_head3298AE8300D9 "Association::addAssociationRole"
public void addAssociationRole(AssociationRole associationRole1)
// -end- 33CD51170096 add_head3298AE8300D9 "Association::addAssociationRole"
;     // empty

/** disconnect a AssociationRole.
 *  @see #addAssociationRole
 */
// -beg- preserve=no 33CD51170096 remove_head3298AE8300D9 "Association::removeAssociationRole"
public AssociationRole removeAssociationRole(AssociationRole associationRole1)
// -end- 33CD51170096 remove_head3298AE8300D9 "Association::removeAssociationRole"
;     // empty

/** tests if a given AssociationRole is connected.
 *  @see #addAssociationRole
 */
// -beg- preserve=no 33CD51170096 test_head3298AE8300D9 "Association::containsAssociationRole"
public boolean containsAssociationRole(AssociationRole associationRole1)
// -end- 33CD51170096 test_head3298AE8300D9 "Association::containsAssociationRole"
;     // empty

/** used to enumerate all connected AssociationRoles.
 *  @see #addAssociationRole
 */
// -beg- preserve=no 33CD51170096 get_all_head3298AE8300D9 "Association::iteratorAssociationRole"
public Iterator<?> iteratorAssociationRole()
// -end- 33CD51170096 get_all_head3298AE8300D9 "Association::iteratorAssociationRole"
;     // empty

/** disconnect all AssociationRoles.
 *  @see #addAssociationRole
 */
// -beg- preserve=no 33CD51170096 remove_all_head3298AE8300D9 "Association::clearAssociationRole"
public void clearAssociationRole()
// -end- 33CD51170096 remove_all_head3298AE8300D9 "Association::clearAssociationRole"
;     // empty

/** returns the number of AssociationRoles.
 *  @see #addAssociationRole
 */
// -beg- preserve=no 33CD51170096 size_head3298AE8300D9 "Association::sizeAssociationRole"
public int sizeAssociationRole()
// -end- 33CD51170096 size_head3298AE8300D9 "Association::sizeAssociationRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD51170096 _link_body3298AE8300D9 "Association::_linkAssociationRole"
public void _linkAssociationRole(AssociationRole associationRole1);
// -end- 33CD51170096 _link_body3298AE8300D9 "Association::_linkAssociationRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD51170096 _unlink_body3298AE8300D9 "Association::_unlinkAssociationRole"
public void _unlinkAssociationRole(AssociationRole associationRole1);
// -end- 33CD51170096 _unlink_body3298AE8300D9 "Association::_unlinkAssociationRole"

/** add a Link.
 *
 *  @see #removeLink
 *  @see #containsLink
 *  @see #iteratorLink
 *  @see #clearLink
 *  @see #sizeLink
 */
// -beg- preserve=no 328A5BB3023A add_head3298AE8300D9 "Association::addLink"
public void addLink(Link link1)
// -end- 328A5BB3023A add_head3298AE8300D9 "Association::addLink"
;     // empty

/** disconnect a Link.
 *  @see #addLink
 */
// -beg- preserve=no 328A5BB3023A remove_head3298AE8300D9 "Association::removeLink"
public Link removeLink(Link link1)
// -end- 328A5BB3023A remove_head3298AE8300D9 "Association::removeLink"
;     // empty

/** tests if a given Link is connected.
 *  @see #addLink
 */
// -beg- preserve=no 328A5BB3023A test_head3298AE8300D9 "Association::containsLink"
public boolean containsLink(Link link1)
// -end- 328A5BB3023A test_head3298AE8300D9 "Association::containsLink"
;     // empty

/** used to enumerate all connected Links.
 *  @see #addLink
 */
// -beg- preserve=no 328A5BB3023A get_all_head3298AE8300D9 "Association::iteratorLink"
public Iterator<?> iteratorLink()
// -end- 328A5BB3023A get_all_head3298AE8300D9 "Association::iteratorLink"
;     // empty

/** disconnect all Links.
 *  @see #addLink
 */
// -beg- preserve=no 328A5BB3023A remove_all_head3298AE8300D9 "Association::clearLink"
public void clearLink()
// -end- 328A5BB3023A remove_all_head3298AE8300D9 "Association::clearLink"
;     // empty

/** returns the number of Links.
 *  @see #addLink
 */
// -beg- preserve=no 328A5BB3023A size_head3298AE8300D9 "Association::sizeLink"
public int sizeLink()
// -end- 328A5BB3023A size_head3298AE8300D9 "Association::sizeLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A5BB3023A _link_body3298AE8300D9 "Association::_linkLink"
public void _linkLink(Link link1);
// -end- 328A5BB3023A _link_body3298AE8300D9 "Association::_linkLink"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A5BB3023A _unlink_body3298AE8300D9 "Association::_unlinkLink"
public void _unlinkLink(Link link1);
// -end- 328A5BB3023A _unlink_body3298AE8300D9 "Association::_unlinkLink"

/** add a Connection.
 *
 *  @see #removeConnection
 *  @see #containsConnection
 *  @see #iteratorConnection
 *  @see #clearConnection
 *  @see #sizeConnection
 */
// -beg- preserve=no 32A2A510017A add_head3298AE8300D9 "Association::addConnection"
public void addConnection(AssociationEnd connection1)
// -end- 32A2A510017A add_head3298AE8300D9 "Association::addConnection"
;     // empty

// -beg- preserve=no 32A2A510017A add2_head3298AE8300D9 "Association::add2Connection"
public void addConnection(int index,AssociationEnd connection1)
// -end- 32A2A510017A add2_head3298AE8300D9 "Association::add2Connection"
;     // empty

/** disconnect a Connection.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A remove_head3298AE8300D9 "Association::removeConnection"
public AssociationEnd removeConnection(AssociationEnd connection1)
// -end- 32A2A510017A remove_head3298AE8300D9 "Association::removeConnection"
;     // empty

/** disconnect a Connection.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A remove2_head3298AE8300D9 "Association::remove2Connection"
public AssociationEnd removeConnection(int index)
// -end- 32A2A510017A remove2_head3298AE8300D9 "Association::remove2Connection"
;     // empty

/** change a Connection.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A set_head3298AE8300D9 "Association::setConnection"
public AssociationEnd setConnection(int index,AssociationEnd connection1)
// -end- 32A2A510017A set_head3298AE8300D9 "Association::setConnection"
;     // empty

/** tests if a given Connection is connected.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A test_head3298AE8300D9 "Association::containsConnection"
public boolean containsConnection(AssociationEnd connection1)
// -end- 32A2A510017A test_head3298AE8300D9 "Association::containsConnection"
;     // empty

/** used to enumerate all connected Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A get_all_head3298AE8300D9 "Association::iteratorConnection"
public Iterator<?> iteratorConnection()
// -end- 32A2A510017A get_all_head3298AE8300D9 "Association::iteratorConnection"
;     // empty

/** disconnect all Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A remove_all_head3298AE8300D9 "Association::clearConnection"
public void clearConnection()
// -end- 32A2A510017A remove_all_head3298AE8300D9 "Association::clearConnection"
;     // empty

/** returns the number of Connections.
 *  @see #addConnection
 */
// -beg- preserve=no 32A2A510017A size_head3298AE8300D9 "Association::sizeConnection"
public int sizeConnection()
// -end- 32A2A510017A size_head3298AE8300D9 "Association::sizeConnection"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 32A2A510017A _link_body3298AE8300D9 "Association::_linkConnection"
public void _linkConnection(AssociationEnd connection1);
// -end- 32A2A510017A _link_body3298AE8300D9 "Association::_linkConnection"

/** DONT USE; link management internal
 */
// -beg- preserve=no 32A2A510017A _unlink_body3298AE8300D9 "Association::_unlinkConnection"
public void _unlinkConnection(AssociationEnd connection1);
// -end- 32A2A510017A _unlink_body3298AE8300D9 "Association::_unlinkConnection"

/** add a Presentation.
 *
 *  @see #removePresentation
 *  @see #containsPresentation
 *  @see #iteratorPresentation
 *  @see #clearPresentation
 *  @see #sizePresentation
 */
// -beg- preserve=no 362409A9000A add_head3298AE8300D9 "ModelElement::addPresentation"
public void addPresentation(PresentationElement presentation1)
// -end- 362409A9000A add_head3298AE8300D9 "ModelElement::addPresentation"
;     // empty

/** disconnect a Presentation.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_head3298AE8300D9 "ModelElement::removePresentation"
public PresentationElement removePresentation(PresentationElement presentation1)
// -end- 362409A9000A remove_head3298AE8300D9 "ModelElement::removePresentation"
;     // empty

/** tests if a given Presentation is connected.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A test_head3298AE8300D9 "ModelElement::containsPresentation"
public boolean containsPresentation(PresentationElement presentation1)
// -end- 362409A9000A test_head3298AE8300D9 "ModelElement::containsPresentation"
;     // empty

/** used to enumerate all connected Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A get_all_head3298AE8300D9 "ModelElement::iteratorPresentation"
public Iterator<?> iteratorPresentation()
// -end- 362409A9000A get_all_head3298AE8300D9 "ModelElement::iteratorPresentation"
;     // empty

/** disconnect all Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_all_head3298AE8300D9 "ModelElement::clearPresentation"
public void clearPresentation()
// -end- 362409A9000A remove_all_head3298AE8300D9 "ModelElement::clearPresentation"
;     // empty

/** returns the number of Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A size_head3298AE8300D9 "ModelElement::sizePresentation"
public int sizePresentation()
// -end- 362409A9000A size_head3298AE8300D9 "ModelElement::sizePresentation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _link_body3298AE8300D9 "ModelElement::_linkPresentation"
public void _linkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _link_body3298AE8300D9 "ModelElement::_linkPresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _unlink_body3298AE8300D9 "ModelElement::_unlinkPresentation"
public void _unlinkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _unlink_body3298AE8300D9 "ModelElement::_unlinkPresentation"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3298AE8300D9 detail_end "Association"

// -end- 3298AE8300D9 detail_end "Association"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
