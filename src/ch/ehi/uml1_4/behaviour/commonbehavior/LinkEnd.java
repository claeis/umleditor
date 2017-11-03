// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:02 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33F2803D0320 package "LinkEnd"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 33F2803D0320 package "LinkEnd"

// -beg- preserve=no 33F2803D0320 autoimport "LinkEnd"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.Link;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.commonbehavior.AttributeLink;
// -end- 33F2803D0320 autoimport "LinkEnd"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33F2803D0320 import "LinkEnd"

// -end- 33F2803D0320 import "LinkEnd"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:02 $
 */
<<<<<<< HEAD
public interface LinkEnd extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33F2803D0320 detail_begin "LinkEnd"

  // -end- 33F2803D0320 detail_begin "LinkEnd"

  /** attaches a Instance.
   *  
   *  @see #detachInstance
   *  @see #getInstance
   *  @see #containsInstance
   */
  // -beg- preserve=no 33DBC1DC01FF attach_head33F2803D0320 "LinkEnd::attachInstance"
  public void attachInstance(Instance instance1)
  // -end- 33DBC1DC01FF attach_head33F2803D0320 "LinkEnd::attachInstance"
    ; // empty

  /** disconnect the currently attached Instance.
   *  @see #attachInstance
   */
  // -beg- preserve=no 33DBC1DC01FF detach_head33F2803D0320 "LinkEnd::detachInstance"
  public Instance detachInstance()
  // -end- 33DBC1DC01FF detach_head33F2803D0320 "LinkEnd::detachInstance"
    ; // empty

  /** get the currently attached Instance.
   *  @see #attachInstance
   */
  // -beg- preserve=no 33DBC1DC01FF get_head33F2803D0320 "LinkEnd::getInstance"
  public Instance getInstance()
  // -end- 33DBC1DC01FF get_head33F2803D0320 "LinkEnd::getInstance"
    ; // empty

  /** tests if there is a Instance attached.
   *  @see #attachInstance
   */
  // -beg- preserve=no 33DBC1DC01FF test_head33F2803D0320 "LinkEnd::containsInstance"
  public boolean containsInstance()
  // -end- 33DBC1DC01FF test_head33F2803D0320 "LinkEnd::containsInstance"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBC1DC01FF _link_body33F2803D0320 "LinkEnd::_linkInstance"
  public void _linkInstance(Instance instance1);
  // -end- 33DBC1DC01FF _link_body33F2803D0320 "LinkEnd::_linkInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBC1DC01FF _unlink_body33F2803D0320 "LinkEnd::_unlinkInstance"
  public void _unlinkInstance(Instance instance1);
  // -end- 33DBC1DC01FF _unlink_body33F2803D0320 "LinkEnd::_unlinkInstance"

  /** attaches a Link.
   *  
   *  @see #detachLink
   *  @see #getLink
   *  @see #containsLink
   */
  // -beg- preserve=no 328A598B03C0 attach_head33F2803D0320 "LinkEnd::attachLink"
  public void attachLink(Link link1)
  // -end- 328A598B03C0 attach_head33F2803D0320 "LinkEnd::attachLink"
    ; // empty

  /** disconnect the currently attached Link.
   *  @see #attachLink
   */
  // -beg- preserve=no 328A598B03C0 detach_head33F2803D0320 "LinkEnd::detachLink"
  public Link detachLink()
  // -end- 328A598B03C0 detach_head33F2803D0320 "LinkEnd::detachLink"
    ; // empty

  /** get the currently attached Link.
   *  @see #attachLink
   */
  // -beg- preserve=no 328A598B03C0 get_head33F2803D0320 "LinkEnd::getLink"
  public Link getLink()
  // -end- 328A598B03C0 get_head33F2803D0320 "LinkEnd::getLink"
    ; // empty

  /** tests if there is a Link attached.
   *  @see #attachLink
   */
  // -beg- preserve=no 328A598B03C0 test_head33F2803D0320 "LinkEnd::containsLink"
  public boolean containsLink()
  // -end- 328A598B03C0 test_head33F2803D0320 "LinkEnd::containsLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A598B03C0 _link_body33F2803D0320 "LinkEnd::_linkLink"
  public void _linkLink(Link link1);
  // -end- 328A598B03C0 _link_body33F2803D0320 "LinkEnd::_linkLink"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A598B03C0 _unlink_body33F2803D0320 "LinkEnd::_unlinkLink"
  public void _unlinkLink(Link link1);
  // -end- 328A598B03C0 _unlink_body33F2803D0320 "LinkEnd::_unlinkLink"

  /** attaches a AssociationEnd.
   *  
   *  @see #detachAssociationEnd
   *  @see #getAssociationEnd
   *  @see #containsAssociationEnd
   */
  // -beg- preserve=no 328A5C1F029F attach_head33F2803D0320 "LinkEnd::attachAssociationEnd"
  public void attachAssociationEnd(AssociationEnd associationEnd1)
  // -end- 328A5C1F029F attach_head33F2803D0320 "LinkEnd::attachAssociationEnd"
    ; // empty

  /** disconnect the currently attached AssociationEnd.
   *  @see #attachAssociationEnd
   */
  // -beg- preserve=no 328A5C1F029F detach_head33F2803D0320 "LinkEnd::detachAssociationEnd"
  public AssociationEnd detachAssociationEnd()
  // -end- 328A5C1F029F detach_head33F2803D0320 "LinkEnd::detachAssociationEnd"
    ; // empty

  /** get the currently attached AssociationEnd.
   *  @see #attachAssociationEnd
   */
  // -beg- preserve=no 328A5C1F029F get_head33F2803D0320 "LinkEnd::getAssociationEnd"
  public AssociationEnd getAssociationEnd()
  // -end- 328A5C1F029F get_head33F2803D0320 "LinkEnd::getAssociationEnd"
    ; // empty

  /** tests if there is a AssociationEnd attached.
   *  @see #attachAssociationEnd
   */
  // -beg- preserve=no 328A5C1F029F test_head33F2803D0320 "LinkEnd::containsAssociationEnd"
  public boolean containsAssociationEnd()
  // -end- 328A5C1F029F test_head33F2803D0320 "LinkEnd::containsAssociationEnd"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5C1F029F _link_body33F2803D0320 "LinkEnd::_linkAssociationEnd"
  public void _linkAssociationEnd(AssociationEnd associationEnd1);
  // -end- 328A5C1F029F _link_body33F2803D0320 "LinkEnd::_linkAssociationEnd"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5C1F029F _unlink_body33F2803D0320 "LinkEnd::_unlinkAssociationEnd"
  public void _unlinkAssociationEnd(AssociationEnd associationEnd1);
  // -end- 328A5C1F029F _unlink_body33F2803D0320 "LinkEnd::_unlinkAssociationEnd"

  /** add a QualifierValue.
   *  
   *  @see #removeQualifierValue
   *  @see #containsQualifierValue
   *  @see #iteratorQualifierValue
   *  @see #clearQualifierValue
   *  @see #sizeQualifierValue
   */
  // -beg- preserve=no 3742033D01F4 add_head33F2803D0320 "LinkEnd::addQualifierValue"
  public void addQualifierValue(AttributeLink qualifierValue1)
  // -end- 3742033D01F4 add_head33F2803D0320 "LinkEnd::addQualifierValue"
    ; // empty

  // -beg- preserve=no 3742033D01F4 add2_head33F2803D0320 "LinkEnd::add2QualifierValue"
  public void addQualifierValue(int index,AttributeLink qualifierValue1)
  // -end- 3742033D01F4 add2_head33F2803D0320 "LinkEnd::add2QualifierValue"
    ; // empty

  /** disconnect a QualifierValue.
   *  @see #addQualifierValue
   */
  // -beg- preserve=no 3742033D01F4 remove_head33F2803D0320 "LinkEnd::removeQualifierValue"
  public AttributeLink removeQualifierValue(AttributeLink qualifierValue1)
  // -end- 3742033D01F4 remove_head33F2803D0320 "LinkEnd::removeQualifierValue"
    ; // empty

  /** disconnect a QualifierValue.
   *  @see #addQualifierValue
   */
  // -beg- preserve=no 3742033D01F4 remove2_head33F2803D0320 "LinkEnd::remove2QualifierValue"
  public AttributeLink removeQualifierValue(int index)
  // -end- 3742033D01F4 remove2_head33F2803D0320 "LinkEnd::remove2QualifierValue"
    ; // empty

  /** change a QualifierValue.
   *  @see #addQualifierValue
   */
  // -beg- preserve=no 3742033D01F4 set_head33F2803D0320 "LinkEnd::setQualifierValue"
  public AttributeLink setQualifierValue(int index,AttributeLink qualifierValue1)
  // -end- 3742033D01F4 set_head33F2803D0320 "LinkEnd::setQualifierValue"
    ; // empty

  /** tests if a given QualifierValue is connected.
   *  @see #addQualifierValue
   */
  // -beg- preserve=no 3742033D01F4 test_head33F2803D0320 "LinkEnd::containsQualifierValue"
  public boolean containsQualifierValue(AttributeLink qualifierValue1)
  // -end- 3742033D01F4 test_head33F2803D0320 "LinkEnd::containsQualifierValue"
    ; // empty

  /** used to enumerate all connected QualifierValues.
   *  @see #addQualifierValue
   */
  // -beg- preserve=no 3742033D01F4 get_all_head33F2803D0320 "LinkEnd::iteratorQualifierValue"
  public java.util.Iterator iteratorQualifierValue()
  // -end- 3742033D01F4 get_all_head33F2803D0320 "LinkEnd::iteratorQualifierValue"
    ; // empty

  /** disconnect all QualifierValues.
   *  @see #addQualifierValue
   */
  // -beg- preserve=no 3742033D01F4 remove_all_head33F2803D0320 "LinkEnd::clearQualifierValue"
  public void clearQualifierValue()
  // -end- 3742033D01F4 remove_all_head33F2803D0320 "LinkEnd::clearQualifierValue"
    ; // empty

  /** returns the number of QualifierValues.
   *  @see #addQualifierValue
   */
  // -beg- preserve=no 3742033D01F4 size_head33F2803D0320 "LinkEnd::sizeQualifierValue"
  public int sizeQualifierValue()
  // -end- 3742033D01F4 size_head33F2803D0320 "LinkEnd::sizeQualifierValue"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3742033D01F4 _link_body33F2803D0320 "LinkEnd::_linkQualifierValue"
  public void _linkQualifierValue(AttributeLink qualifierValue1);
  // -end- 3742033D01F4 _link_body33F2803D0320 "LinkEnd::_linkQualifierValue"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3742033D01F4 _unlink_body33F2803D0320 "LinkEnd::_unlinkQualifierValue"
  public void _unlinkQualifierValue(AttributeLink qualifierValue1);
  // -end- 3742033D01F4 _unlink_body33F2803D0320 "LinkEnd::_unlinkQualifierValue"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33F2803D0320 detail_end "LinkEnd"

  // -end- 33F2803D0320 detail_end "LinkEnd"

}

=======
public interface LinkEnd extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F2803D0320 detail_begin "LinkEnd"

// -end- 33F2803D0320 detail_begin "LinkEnd"

/** attaches a Instance.
 *
 *  @see #detachInstance
 *  @see #getInstance
 *  @see #containsInstance
 */
// -beg- preserve=no 33DBC1DC01FF attach_head33F2803D0320 "LinkEnd::attachInstance"
public void attachInstance(Instance instance1)
// -end- 33DBC1DC01FF attach_head33F2803D0320 "LinkEnd::attachInstance"
;     // empty

/** disconnect the currently attached Instance.
 *  @see #attachInstance
 */
// -beg- preserve=no 33DBC1DC01FF detach_head33F2803D0320 "LinkEnd::detachInstance"
public Instance detachInstance()
// -end- 33DBC1DC01FF detach_head33F2803D0320 "LinkEnd::detachInstance"
;     // empty

/** get the currently attached Instance.
 *  @see #attachInstance
 */
// -beg- preserve=no 33DBC1DC01FF get_head33F2803D0320 "LinkEnd::getInstance"
public Instance getInstance()
// -end- 33DBC1DC01FF get_head33F2803D0320 "LinkEnd::getInstance"
;     // empty

/** tests if there is a Instance attached.
 *  @see #attachInstance
 */
// -beg- preserve=no 33DBC1DC01FF test_head33F2803D0320 "LinkEnd::containsInstance"
public boolean containsInstance()
// -end- 33DBC1DC01FF test_head33F2803D0320 "LinkEnd::containsInstance"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBC1DC01FF _link_body33F2803D0320 "LinkEnd::_linkInstance"
public void _linkInstance(Instance instance1);
// -end- 33DBC1DC01FF _link_body33F2803D0320 "LinkEnd::_linkInstance"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBC1DC01FF _unlink_body33F2803D0320 "LinkEnd::_unlinkInstance"
public void _unlinkInstance(Instance instance1);
// -end- 33DBC1DC01FF _unlink_body33F2803D0320 "LinkEnd::_unlinkInstance"

/** attaches a Link.
 *
 *  @see #detachLink
 *  @see #getLink
 *  @see #containsLink
 */
// -beg- preserve=no 328A598B03C0 attach_head33F2803D0320 "LinkEnd::attachLink"
public void attachLink(Link link1)
// -end- 328A598B03C0 attach_head33F2803D0320 "LinkEnd::attachLink"
;     // empty

/** disconnect the currently attached Link.
 *  @see #attachLink
 */
// -beg- preserve=no 328A598B03C0 detach_head33F2803D0320 "LinkEnd::detachLink"
public Link detachLink()
// -end- 328A598B03C0 detach_head33F2803D0320 "LinkEnd::detachLink"
;     // empty

/** get the currently attached Link.
 *  @see #attachLink
 */
// -beg- preserve=no 328A598B03C0 get_head33F2803D0320 "LinkEnd::getLink"
public Link getLink()
// -end- 328A598B03C0 get_head33F2803D0320 "LinkEnd::getLink"
;     // empty

/** tests if there is a Link attached.
 *  @see #attachLink
 */
// -beg- preserve=no 328A598B03C0 test_head33F2803D0320 "LinkEnd::containsLink"
public boolean containsLink()
// -end- 328A598B03C0 test_head33F2803D0320 "LinkEnd::containsLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A598B03C0 _link_body33F2803D0320 "LinkEnd::_linkLink"
public void _linkLink(Link link1);
// -end- 328A598B03C0 _link_body33F2803D0320 "LinkEnd::_linkLink"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A598B03C0 _unlink_body33F2803D0320 "LinkEnd::_unlinkLink"
public void _unlinkLink(Link link1);
// -end- 328A598B03C0 _unlink_body33F2803D0320 "LinkEnd::_unlinkLink"

/** attaches a AssociationEnd.
 *
 *  @see #detachAssociationEnd
 *  @see #getAssociationEnd
 *  @see #containsAssociationEnd
 */
// -beg- preserve=no 328A5C1F029F attach_head33F2803D0320 "LinkEnd::attachAssociationEnd"
public void attachAssociationEnd(AssociationEnd associationEnd1)
// -end- 328A5C1F029F attach_head33F2803D0320 "LinkEnd::attachAssociationEnd"
;     // empty

/** disconnect the currently attached AssociationEnd.
 *  @see #attachAssociationEnd
 */
// -beg- preserve=no 328A5C1F029F detach_head33F2803D0320 "LinkEnd::detachAssociationEnd"
public AssociationEnd detachAssociationEnd()
// -end- 328A5C1F029F detach_head33F2803D0320 "LinkEnd::detachAssociationEnd"
;     // empty

/** get the currently attached AssociationEnd.
 *  @see #attachAssociationEnd
 */
// -beg- preserve=no 328A5C1F029F get_head33F2803D0320 "LinkEnd::getAssociationEnd"
public AssociationEnd getAssociationEnd()
// -end- 328A5C1F029F get_head33F2803D0320 "LinkEnd::getAssociationEnd"
;     // empty

/** tests if there is a AssociationEnd attached.
 *  @see #attachAssociationEnd
 */
// -beg- preserve=no 328A5C1F029F test_head33F2803D0320 "LinkEnd::containsAssociationEnd"
public boolean containsAssociationEnd()
// -end- 328A5C1F029F test_head33F2803D0320 "LinkEnd::containsAssociationEnd"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A5C1F029F _link_body33F2803D0320 "LinkEnd::_linkAssociationEnd"
public void _linkAssociationEnd(AssociationEnd associationEnd1);
// -end- 328A5C1F029F _link_body33F2803D0320 "LinkEnd::_linkAssociationEnd"

/** DONT USE; link management internal
 */
// -beg- preserve=no 328A5C1F029F _unlink_body33F2803D0320 "LinkEnd::_unlinkAssociationEnd"
public void _unlinkAssociationEnd(AssociationEnd associationEnd1);
// -end- 328A5C1F029F _unlink_body33F2803D0320 "LinkEnd::_unlinkAssociationEnd"

/** add a QualifierValue.
 *
 *  @see #removeQualifierValue
 *  @see #containsQualifierValue
 *  @see #iteratorQualifierValue
 *  @see #clearQualifierValue
 *  @see #sizeQualifierValue
 */
// -beg- preserve=no 3742033D01F4 add_head33F2803D0320 "LinkEnd::addQualifierValue"
public void addQualifierValue(AttributeLink qualifierValue1)
// -end- 3742033D01F4 add_head33F2803D0320 "LinkEnd::addQualifierValue"
;     // empty

// -beg- preserve=no 3742033D01F4 add2_head33F2803D0320 "LinkEnd::add2QualifierValue"
public void addQualifierValue(int index,AttributeLink qualifierValue1)
// -end- 3742033D01F4 add2_head33F2803D0320 "LinkEnd::add2QualifierValue"
;     // empty

/** disconnect a QualifierValue.
 *  @see #addQualifierValue
 */
// -beg- preserve=no 3742033D01F4 remove_head33F2803D0320 "LinkEnd::removeQualifierValue"
public AttributeLink removeQualifierValue(AttributeLink qualifierValue1)
// -end- 3742033D01F4 remove_head33F2803D0320 "LinkEnd::removeQualifierValue"
;     // empty

/** disconnect a QualifierValue.
 *  @see #addQualifierValue
 */
// -beg- preserve=no 3742033D01F4 remove2_head33F2803D0320 "LinkEnd::remove2QualifierValue"
public AttributeLink removeQualifierValue(int index)
// -end- 3742033D01F4 remove2_head33F2803D0320 "LinkEnd::remove2QualifierValue"
;     // empty

/** change a QualifierValue.
 *  @see #addQualifierValue
 */
// -beg- preserve=no 3742033D01F4 set_head33F2803D0320 "LinkEnd::setQualifierValue"
public AttributeLink setQualifierValue(int index,AttributeLink qualifierValue1)
// -end- 3742033D01F4 set_head33F2803D0320 "LinkEnd::setQualifierValue"
;     // empty

/** tests if a given QualifierValue is connected.
 *  @see #addQualifierValue
 */
// -beg- preserve=no 3742033D01F4 test_head33F2803D0320 "LinkEnd::containsQualifierValue"
public boolean containsQualifierValue(AttributeLink qualifierValue1)
// -end- 3742033D01F4 test_head33F2803D0320 "LinkEnd::containsQualifierValue"
;     // empty

/** used to enumerate all connected QualifierValues.
 *  @see #addQualifierValue
 */
// -beg- preserve=no 3742033D01F4 get_all_head33F2803D0320 "LinkEnd::iteratorQualifierValue"
public Iterator<?> iteratorQualifierValue()
// -end- 3742033D01F4 get_all_head33F2803D0320 "LinkEnd::iteratorQualifierValue"
;     // empty

/** disconnect all QualifierValues.
 *  @see #addQualifierValue
 */
// -beg- preserve=no 3742033D01F4 remove_all_head33F2803D0320 "LinkEnd::clearQualifierValue"
public void clearQualifierValue()
// -end- 3742033D01F4 remove_all_head33F2803D0320 "LinkEnd::clearQualifierValue"
;     // empty

/** returns the number of QualifierValues.
 *  @see #addQualifierValue
 */
// -beg- preserve=no 3742033D01F4 size_head33F2803D0320 "LinkEnd::sizeQualifierValue"
public int sizeQualifierValue()
// -end- 3742033D01F4 size_head33F2803D0320 "LinkEnd::sizeQualifierValue"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3742033D01F4 _link_body33F2803D0320 "LinkEnd::_linkQualifierValue"
public void _linkQualifierValue(AttributeLink qualifierValue1);
// -end- 3742033D01F4 _link_body33F2803D0320 "LinkEnd::_linkQualifierValue"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3742033D01F4 _unlink_body33F2803D0320 "LinkEnd::_unlinkQualifierValue"
public void _unlinkQualifierValue(AttributeLink qualifierValue1);
// -end- 3742033D01F4 _unlink_body33F2803D0320 "LinkEnd::_unlinkQualifierValue"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F2803D0320 detail_end "LinkEnd"

// -end- 33F2803D0320 detail_end "LinkEnd"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
