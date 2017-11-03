// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:21 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327BA5E802E4 package "Attribute"
package ch.ehi.uml1_4.foundation.core;
// -end- 327BA5E802E4 package "Attribute"

// -beg- preserve=no 327BA5E802E4 autoimport "Attribute"
import ch.ehi.uml1_4.foundation.core.StructuralFeature;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.collaborations.AssociationEndRole;
import ch.ehi.uml1_4.behaviour.commonbehavior.AttributeLink;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.datatypes.Expression;
// -end- 327BA5E802E4 autoimport "Attribute"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327BA5E802E4 import "Attribute"

// -end- 327BA5E802E4 import "Attribute"

/** An attribute is a named slot within a classifier that describes a range of values that instances ofthe classifier may hold.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:21 $
 */
<<<<<<< HEAD
public interface Attribute extends StructuralFeature , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327BA5E802E4 detail_begin "Attribute"

  // -end- 327BA5E802E4 detail_begin "Attribute"

  /** add a AssociationEndRole.
   *  
   *  @see #removeAssociationEndRole
   *  @see #containsAssociationEndRole
   *  @see #iteratorAssociationEndRole
   *  @see #clearAssociationEndRole
   *  @see #sizeAssociationEndRole
   */
  // -beg- preserve=no 3650E6BE0096 add_head327BA5E802E4 "Attribute::addAssociationEndRole"
  public void addAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 3650E6BE0096 add_head327BA5E802E4 "Attribute::addAssociationEndRole"
    ; // empty

  /** disconnect a AssociationEndRole.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 3650E6BE0096 remove_head327BA5E802E4 "Attribute::removeAssociationEndRole"
  public AssociationEndRole removeAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 3650E6BE0096 remove_head327BA5E802E4 "Attribute::removeAssociationEndRole"
    ; // empty

  /** tests if a given AssociationEndRole is connected.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 3650E6BE0096 test_head327BA5E802E4 "Attribute::containsAssociationEndRole"
  public boolean containsAssociationEndRole(AssociationEndRole associationEndRole1)
  // -end- 3650E6BE0096 test_head327BA5E802E4 "Attribute::containsAssociationEndRole"
    ; // empty

  /** used to enumerate all connected AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 3650E6BE0096 get_all_head327BA5E802E4 "Attribute::iteratorAssociationEndRole"
  public java.util.Iterator iteratorAssociationEndRole()
  // -end- 3650E6BE0096 get_all_head327BA5E802E4 "Attribute::iteratorAssociationEndRole"
    ; // empty

  /** disconnect all AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 3650E6BE0096 remove_all_head327BA5E802E4 "Attribute::clearAssociationEndRole"
  public void clearAssociationEndRole()
  // -end- 3650E6BE0096 remove_all_head327BA5E802E4 "Attribute::clearAssociationEndRole"
    ; // empty

  /** returns the number of AssociationEndRoles.
   *  @see #addAssociationEndRole
   */
  // -beg- preserve=no 3650E6BE0096 size_head327BA5E802E4 "Attribute::sizeAssociationEndRole"
  public int sizeAssociationEndRole()
  // -end- 3650E6BE0096 size_head327BA5E802E4 "Attribute::sizeAssociationEndRole"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3650E6BE0096 _link_body327BA5E802E4 "Attribute::_linkAssociationEndRole"
  public void _linkAssociationEndRole(AssociationEndRole associationEndRole1);
  // -end- 3650E6BE0096 _link_body327BA5E802E4 "Attribute::_linkAssociationEndRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3650E6BE0096 _unlink_body327BA5E802E4 "Attribute::_unlinkAssociationEndRole"
  public void _unlinkAssociationEndRole(AssociationEndRole associationEndRole1);
  // -end- 3650E6BE0096 _unlink_body327BA5E802E4 "Attribute::_unlinkAssociationEndRole"

  /** add a AttributeLink.
   *  
   *  @see #removeAttributeLink
   *  @see #containsAttributeLink
   *  @see #iteratorAttributeLink
   *  @see #clearAttributeLink
   *  @see #sizeAttributeLink
   */
  // -beg- preserve=no 33DBC16F0028 add_head327BA5E802E4 "Attribute::addAttributeLink"
  public void addAttributeLink(AttributeLink attributeLink1)
  // -end- 33DBC16F0028 add_head327BA5E802E4 "Attribute::addAttributeLink"
    ; // empty

  /** disconnect a AttributeLink.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC16F0028 remove_head327BA5E802E4 "Attribute::removeAttributeLink"
  public AttributeLink removeAttributeLink(AttributeLink attributeLink1)
  // -end- 33DBC16F0028 remove_head327BA5E802E4 "Attribute::removeAttributeLink"
    ; // empty

  /** tests if a given AttributeLink is connected.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC16F0028 test_head327BA5E802E4 "Attribute::containsAttributeLink"
  public boolean containsAttributeLink(AttributeLink attributeLink1)
  // -end- 33DBC16F0028 test_head327BA5E802E4 "Attribute::containsAttributeLink"
    ; // empty

  /** used to enumerate all connected AttributeLinks.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC16F0028 get_all_head327BA5E802E4 "Attribute::iteratorAttributeLink"
  public java.util.Iterator iteratorAttributeLink()
  // -end- 33DBC16F0028 get_all_head327BA5E802E4 "Attribute::iteratorAttributeLink"
    ; // empty

  /** disconnect all AttributeLinks.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC16F0028 remove_all_head327BA5E802E4 "Attribute::clearAttributeLink"
  public void clearAttributeLink()
  // -end- 33DBC16F0028 remove_all_head327BA5E802E4 "Attribute::clearAttributeLink"
    ; // empty

  /** returns the number of AttributeLinks.
   *  @see #addAttributeLink
   */
  // -beg- preserve=no 33DBC16F0028 size_head327BA5E802E4 "Attribute::sizeAttributeLink"
  public int sizeAttributeLink()
  // -end- 33DBC16F0028 size_head327BA5E802E4 "Attribute::sizeAttributeLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBC16F0028 _link_body327BA5E802E4 "Attribute::_linkAttributeLink"
  public void _linkAttributeLink(AttributeLink attributeLink1);
  // -end- 33DBC16F0028 _link_body327BA5E802E4 "Attribute::_linkAttributeLink"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBC16F0028 _unlink_body327BA5E802E4 "Attribute::_unlinkAttributeLink"
  public void _unlinkAttributeLink(AttributeLink attributeLink1);
  // -end- 33DBC16F0028 _unlink_body327BA5E802E4 "Attribute::_unlinkAttributeLink"

  /** attaches a AssociationEnd.
   *  
   *  @see #detachAssociationEnd
   *  @see #getAssociationEnd
   *  @see #containsAssociationEnd
   */
  // -beg- preserve=no 33DBE50B001E attach_head327BA5E802E4 "Attribute::attachAssociationEnd"
  public void attachAssociationEnd(AssociationEnd associationEnd1)
  // -end- 33DBE50B001E attach_head327BA5E802E4 "Attribute::attachAssociationEnd"
    ; // empty

  /** disconnect the currently attached AssociationEnd.
   *  @see #attachAssociationEnd
   */
  // -beg- preserve=no 33DBE50B001E detach_head327BA5E802E4 "Attribute::detachAssociationEnd"
  public AssociationEnd detachAssociationEnd()
  // -end- 33DBE50B001E detach_head327BA5E802E4 "Attribute::detachAssociationEnd"
    ; // empty

  /** get the currently attached AssociationEnd.
   *  @see #attachAssociationEnd
   */
  // -beg- preserve=no 33DBE50B001E get_head327BA5E802E4 "Attribute::getAssociationEnd"
  public AssociationEnd getAssociationEnd()
  // -end- 33DBE50B001E get_head327BA5E802E4 "Attribute::getAssociationEnd"
    ; // empty

  /** tests if there is a AssociationEnd attached.
   *  @see #attachAssociationEnd
   */
  // -beg- preserve=no 33DBE50B001E test_head327BA5E802E4 "Attribute::containsAssociationEnd"
  public boolean containsAssociationEnd()
  // -end- 33DBE50B001E test_head327BA5E802E4 "Attribute::containsAssociationEnd"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBE50B001E _link_body327BA5E802E4 "Attribute::_linkAssociationEnd"
  public void _linkAssociationEnd(AssociationEnd associationEnd1);
  // -end- 33DBE50B001E _link_body327BA5E802E4 "Attribute::_linkAssociationEnd"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBE50B001E _unlink_body327BA5E802E4 "Attribute::_unlinkAssociationEnd"
  public void _unlinkAssociationEnd(AssociationEnd associationEnd1);
  // -end- 33DBE50B001E _unlink_body327BA5E802E4 "Attribute::_unlinkAssociationEnd"

  /** get current value of initialValue
   *  @see #setInitialValue
   */
  // -beg- preserve=no 327BBC7501CC get_head327BA5E802E4 "initialValue"
   Expression getInitialValue()
  // -end- 327BBC7501CC get_head327BA5E802E4 "initialValue"
    ; // empty
  /** set current value of initialValue
   *  @see #getInitialValue
   */
  // -beg- preserve=no 327BBC7501CC set_head327BA5E802E4 "initialValue"
   void setInitialValue(Expression value1)
  // -end- 327BBC7501CC set_head327BA5E802E4 "initialValue"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327BA5E802E4 detail_end "Attribute"

  // -end- 327BA5E802E4 detail_end "Attribute"

}

=======
public interface Attribute extends StructuralFeature, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327BA5E802E4 detail_begin "Attribute"

// -end- 327BA5E802E4 detail_begin "Attribute"

/** add a AssociationEndRole.
 *
 *  @see #removeAssociationEndRole
 *  @see #containsAssociationEndRole
 *  @see #iteratorAssociationEndRole
 *  @see #clearAssociationEndRole
 *  @see #sizeAssociationEndRole
 */
// -beg- preserve=no 3650E6BE0096 add_head327BA5E802E4 "Attribute::addAssociationEndRole"
public void addAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 3650E6BE0096 add_head327BA5E802E4 "Attribute::addAssociationEndRole"
;     // empty

/** disconnect a AssociationEndRole.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 3650E6BE0096 remove_head327BA5E802E4 "Attribute::removeAssociationEndRole"
public AssociationEndRole removeAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 3650E6BE0096 remove_head327BA5E802E4 "Attribute::removeAssociationEndRole"
;     // empty

/** tests if a given AssociationEndRole is connected.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 3650E6BE0096 test_head327BA5E802E4 "Attribute::containsAssociationEndRole"
public boolean containsAssociationEndRole(AssociationEndRole associationEndRole1)
// -end- 3650E6BE0096 test_head327BA5E802E4 "Attribute::containsAssociationEndRole"
;     // empty

/** used to enumerate all connected AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 3650E6BE0096 get_all_head327BA5E802E4 "Attribute::iteratorAssociationEndRole"
public Iterator<?> iteratorAssociationEndRole()
// -end- 3650E6BE0096 get_all_head327BA5E802E4 "Attribute::iteratorAssociationEndRole"
;     // empty

/** disconnect all AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 3650E6BE0096 remove_all_head327BA5E802E4 "Attribute::clearAssociationEndRole"
public void clearAssociationEndRole()
// -end- 3650E6BE0096 remove_all_head327BA5E802E4 "Attribute::clearAssociationEndRole"
;     // empty

/** returns the number of AssociationEndRoles.
 *  @see #addAssociationEndRole
 */
// -beg- preserve=no 3650E6BE0096 size_head327BA5E802E4 "Attribute::sizeAssociationEndRole"
public int sizeAssociationEndRole()
// -end- 3650E6BE0096 size_head327BA5E802E4 "Attribute::sizeAssociationEndRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650E6BE0096 _link_body327BA5E802E4 "Attribute::_linkAssociationEndRole"
public void _linkAssociationEndRole(AssociationEndRole associationEndRole1);
// -end- 3650E6BE0096 _link_body327BA5E802E4 "Attribute::_linkAssociationEndRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3650E6BE0096 _unlink_body327BA5E802E4 "Attribute::_unlinkAssociationEndRole"
public void _unlinkAssociationEndRole(AssociationEndRole associationEndRole1);
// -end- 3650E6BE0096 _unlink_body327BA5E802E4 "Attribute::_unlinkAssociationEndRole"

/** add a AttributeLink.
 *
 *  @see #removeAttributeLink
 *  @see #containsAttributeLink
 *  @see #iteratorAttributeLink
 *  @see #clearAttributeLink
 *  @see #sizeAttributeLink
 */
// -beg- preserve=no 33DBC16F0028 add_head327BA5E802E4 "Attribute::addAttributeLink"
public void addAttributeLink(AttributeLink attributeLink1)
// -end- 33DBC16F0028 add_head327BA5E802E4 "Attribute::addAttributeLink"
;     // empty

/** disconnect a AttributeLink.
 *  @see #addAttributeLink
 */
// -beg- preserve=no 33DBC16F0028 remove_head327BA5E802E4 "Attribute::removeAttributeLink"
public AttributeLink removeAttributeLink(AttributeLink attributeLink1)
// -end- 33DBC16F0028 remove_head327BA5E802E4 "Attribute::removeAttributeLink"
;     // empty

/** tests if a given AttributeLink is connected.
 *  @see #addAttributeLink
 */
// -beg- preserve=no 33DBC16F0028 test_head327BA5E802E4 "Attribute::containsAttributeLink"
public boolean containsAttributeLink(AttributeLink attributeLink1)
// -end- 33DBC16F0028 test_head327BA5E802E4 "Attribute::containsAttributeLink"
;     // empty

/** used to enumerate all connected AttributeLinks.
 *  @see #addAttributeLink
 */
// -beg- preserve=no 33DBC16F0028 get_all_head327BA5E802E4 "Attribute::iteratorAttributeLink"
public Iterator<?> iteratorAttributeLink()
// -end- 33DBC16F0028 get_all_head327BA5E802E4 "Attribute::iteratorAttributeLink"
;     // empty

/** disconnect all AttributeLinks.
 *  @see #addAttributeLink
 */
// -beg- preserve=no 33DBC16F0028 remove_all_head327BA5E802E4 "Attribute::clearAttributeLink"
public void clearAttributeLink()
// -end- 33DBC16F0028 remove_all_head327BA5E802E4 "Attribute::clearAttributeLink"
;     // empty

/** returns the number of AttributeLinks.
 *  @see #addAttributeLink
 */
// -beg- preserve=no 33DBC16F0028 size_head327BA5E802E4 "Attribute::sizeAttributeLink"
public int sizeAttributeLink()
// -end- 33DBC16F0028 size_head327BA5E802E4 "Attribute::sizeAttributeLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBC16F0028 _link_body327BA5E802E4 "Attribute::_linkAttributeLink"
public void _linkAttributeLink(AttributeLink attributeLink1);
// -end- 33DBC16F0028 _link_body327BA5E802E4 "Attribute::_linkAttributeLink"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBC16F0028 _unlink_body327BA5E802E4 "Attribute::_unlinkAttributeLink"
public void _unlinkAttributeLink(AttributeLink attributeLink1);
// -end- 33DBC16F0028 _unlink_body327BA5E802E4 "Attribute::_unlinkAttributeLink"

/** attaches a AssociationEnd.
 *
 *  @see #detachAssociationEnd
 *  @see #getAssociationEnd
 *  @see #containsAssociationEnd
 */
// -beg- preserve=no 33DBE50B001E attach_head327BA5E802E4 "Attribute::attachAssociationEnd"
public void attachAssociationEnd(AssociationEnd associationEnd1)
// -end- 33DBE50B001E attach_head327BA5E802E4 "Attribute::attachAssociationEnd"
;     // empty

/** disconnect the currently attached AssociationEnd.
 *  @see #attachAssociationEnd
 */
// -beg- preserve=no 33DBE50B001E detach_head327BA5E802E4 "Attribute::detachAssociationEnd"
public AssociationEnd detachAssociationEnd()
// -end- 33DBE50B001E detach_head327BA5E802E4 "Attribute::detachAssociationEnd"
;     // empty

/** get the currently attached AssociationEnd.
 *  @see #attachAssociationEnd
 */
// -beg- preserve=no 33DBE50B001E get_head327BA5E802E4 "Attribute::getAssociationEnd"
public AssociationEnd getAssociationEnd()
// -end- 33DBE50B001E get_head327BA5E802E4 "Attribute::getAssociationEnd"
;     // empty

/** tests if there is a AssociationEnd attached.
 *  @see #attachAssociationEnd
 */
// -beg- preserve=no 33DBE50B001E test_head327BA5E802E4 "Attribute::containsAssociationEnd"
public boolean containsAssociationEnd()
// -end- 33DBE50B001E test_head327BA5E802E4 "Attribute::containsAssociationEnd"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBE50B001E _link_body327BA5E802E4 "Attribute::_linkAssociationEnd"
public void _linkAssociationEnd(AssociationEnd associationEnd1);
// -end- 33DBE50B001E _link_body327BA5E802E4 "Attribute::_linkAssociationEnd"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBE50B001E _unlink_body327BA5E802E4 "Attribute::_unlinkAssociationEnd"
public void _unlinkAssociationEnd(AssociationEnd associationEnd1);
// -end- 33DBE50B001E _unlink_body327BA5E802E4 "Attribute::_unlinkAssociationEnd"

/** get current value of initialValue
 *  @see #setInitialValue
 */
// -beg- preserve=no 327BBC7501CC get_head327BA5E802E4 "initialValue"
Expression getInitialValue()
// -end- 327BBC7501CC get_head327BA5E802E4 "initialValue"
;     // empty
/** set current value of initialValue
 *  @see #getInitialValue
 */
// -beg- preserve=no 327BBC7501CC set_head327BA5E802E4 "initialValue"
void setInitialValue(Expression value1)
// -end- 327BBC7501CC set_head327BA5E802E4 "initialValue"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327BA5E802E4 detail_end "Attribute"

// -end- 327BA5E802E4 detail_end "Attribute"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
