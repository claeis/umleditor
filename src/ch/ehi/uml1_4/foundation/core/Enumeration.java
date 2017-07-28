// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:29 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 39CB960D02BF package "Enumeration"
package ch.ehi.uml1_4.foundation.core;
// -end- 39CB960D02BF package "Enumeration"

// -beg- preserve=no 39CB960D02BF autoimport "Enumeration"
import ch.ehi.uml1_4.foundation.core.DataType;
import ch.ehi.uml1_4.foundation.core.EnumerationLiteral;
// -end- 39CB960D02BF autoimport "Enumeration"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39CB960D02BF import "Enumeration"

// -end- 39CB960D02BF import "Enumeration"

/** In the metamodel, Enumeration defines a kind of DataType whose range is a list ofpredefined values, called enumeration literals.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:29 $
 */
public interface Enumeration extends DataType, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 39CB960D02BF detail_begin "Enumeration"

// -end- 39CB960D02BF detail_begin "Enumeration"

/** add a Literal.
 *
 *  @see #removeLiteral
 *  @see #containsLiteral
 *  @see #iteratorLiteral
 *  @see #clearLiteral
 *  @see #sizeLiteral
 */
// -beg- preserve=no 39CB96F1001F add_head39CB960D02BF "Enumeration::addLiteral"
public void addLiteral(EnumerationLiteral literal1)
// -end- 39CB96F1001F add_head39CB960D02BF "Enumeration::addLiteral"
;     // empty

// -beg- preserve=no 39CB96F1001F add2_head39CB960D02BF "Enumeration::add2Literal"
public void addLiteral(int index,EnumerationLiteral literal1)
// -end- 39CB96F1001F add2_head39CB960D02BF "Enumeration::add2Literal"
;     // empty

/** disconnect a Literal.
 *  @see #addLiteral
 */
// -beg- preserve=no 39CB96F1001F remove_head39CB960D02BF "Enumeration::removeLiteral"
public EnumerationLiteral removeLiteral(EnumerationLiteral literal1)
// -end- 39CB96F1001F remove_head39CB960D02BF "Enumeration::removeLiteral"
;     // empty

/** disconnect a Literal.
 *  @see #addLiteral
 */
// -beg- preserve=no 39CB96F1001F remove2_head39CB960D02BF "Enumeration::remove2Literal"
public EnumerationLiteral removeLiteral(int index)
// -end- 39CB96F1001F remove2_head39CB960D02BF "Enumeration::remove2Literal"
;     // empty

/** change a Literal.
 *  @see #addLiteral
 */
// -beg- preserve=no 39CB96F1001F set_head39CB960D02BF "Enumeration::setLiteral"
public EnumerationLiteral setLiteral(int index,EnumerationLiteral literal1)
// -end- 39CB96F1001F set_head39CB960D02BF "Enumeration::setLiteral"
;     // empty

/** tests if a given Literal is connected.
 *  @see #addLiteral
 */
// -beg- preserve=no 39CB96F1001F test_head39CB960D02BF "Enumeration::containsLiteral"
public boolean containsLiteral(EnumerationLiteral literal1)
// -end- 39CB96F1001F test_head39CB960D02BF "Enumeration::containsLiteral"
;     // empty

/** used to enumerate all connected Literals.
 *  @see #addLiteral
 */
// -beg- preserve=no 39CB96F1001F get_all_head39CB960D02BF "Enumeration::iteratorLiteral"
public java.util.Iterator iteratorLiteral()
// -end- 39CB96F1001F get_all_head39CB960D02BF "Enumeration::iteratorLiteral"
;     // empty

/** disconnect all Literals.
 *  @see #addLiteral
 */
// -beg- preserve=no 39CB96F1001F remove_all_head39CB960D02BF "Enumeration::clearLiteral"
public void clearLiteral()
// -end- 39CB96F1001F remove_all_head39CB960D02BF "Enumeration::clearLiteral"
;     // empty

/** returns the number of Literals.
 *  @see #addLiteral
 */
// -beg- preserve=no 39CB96F1001F size_head39CB960D02BF "Enumeration::sizeLiteral"
public int sizeLiteral()
// -end- 39CB96F1001F size_head39CB960D02BF "Enumeration::sizeLiteral"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39CB96F1001F _link_body39CB960D02BF "Enumeration::_linkLiteral"
public void _linkLiteral(EnumerationLiteral literal1);
// -end- 39CB96F1001F _link_body39CB960D02BF "Enumeration::_linkLiteral"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39CB96F1001F _unlink_body39CB960D02BF "Enumeration::_unlinkLiteral"
public void _unlinkLiteral(EnumerationLiteral literal1);
// -end- 39CB96F1001F _unlink_body39CB960D02BF "Enumeration::_unlinkLiteral"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 39CB960D02BF detail_end "Enumeration"

// -end- 39CB960D02BF detail_end "Enumeration"

}
