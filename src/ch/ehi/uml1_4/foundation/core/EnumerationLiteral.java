// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:29 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 39CB961F030D package "EnumerationLiteral"
package ch.ehi.uml1_4.foundation.core;
// -end- 39CB961F030D package "EnumerationLiteral"

// -beg- preserve=no 39CB961F030D autoimport "EnumerationLiteral"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Enumeration;
// -end- 39CB961F030D autoimport "EnumerationLiteral"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39CB961F030D import "EnumerationLiteral"

// -end- 39CB961F030D import "EnumerationLiteral"

/** An EnumerationLiteral defines an element of the run-time extension of anEnumeration data type.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:29 $
 */
public interface EnumerationLiteral extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 39CB961F030D detail_begin "EnumerationLiteral"

  // -end- 39CB961F030D detail_begin "EnumerationLiteral"

  /** attaches a Enumeration.
   *  
   *  @see #detachEnumeration
   *  @see #getEnumeration
   *  @see #containsEnumeration
   */
  // -beg- preserve=no 39CB96F10020 attach_head39CB961F030D "EnumerationLiteral::attachEnumeration"
  public void attachEnumeration(Enumeration enumeration1)
  // -end- 39CB96F10020 attach_head39CB961F030D "EnumerationLiteral::attachEnumeration"
    ; // empty

  /** disconnect the currently attached Enumeration.
   *  @see #attachEnumeration
   */
  // -beg- preserve=no 39CB96F10020 detach_head39CB961F030D "EnumerationLiteral::detachEnumeration"
  public Enumeration detachEnumeration()
  // -end- 39CB96F10020 detach_head39CB961F030D "EnumerationLiteral::detachEnumeration"
    ; // empty

  /** get the currently attached Enumeration.
   *  @see #attachEnumeration
   */
  // -beg- preserve=no 39CB96F10020 get_head39CB961F030D "EnumerationLiteral::getEnumeration"
  public Enumeration getEnumeration()
  // -end- 39CB96F10020 get_head39CB961F030D "EnumerationLiteral::getEnumeration"
    ; // empty

  /** tests if there is a Enumeration attached.
   *  @see #attachEnumeration
   */
  // -beg- preserve=no 39CB96F10020 test_head39CB961F030D "EnumerationLiteral::containsEnumeration"
  public boolean containsEnumeration()
  // -end- 39CB96F10020 test_head39CB961F030D "EnumerationLiteral::containsEnumeration"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39CB96F10020 _link_body39CB961F030D "EnumerationLiteral::_linkEnumeration"
  public void _linkEnumeration(Enumeration enumeration1);
  // -end- 39CB96F10020 _link_body39CB961F030D "EnumerationLiteral::_linkEnumeration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39CB96F10020 _unlink_body39CB961F030D "EnumerationLiteral::_unlinkEnumeration"
  public void _unlinkEnumeration(Enumeration enumeration1);
  // -end- 39CB96F10020 _unlink_body39CB961F030D "EnumerationLiteral::_unlinkEnumeration"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 39CB961F030D detail_end "EnumerationLiteral"

  // -end- 39CB961F030D detail_end "EnumerationLiteral"

}

