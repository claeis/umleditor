// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:45 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33DD6FC5001E package "Multiplicity"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33DD6FC5001E package "Multiplicity"

// -beg- preserve=no 33DD6FC5001E autoimport "Multiplicity"
import ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange;
// -end- 33DD6FC5001E autoimport "Multiplicity"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33DD6FC5001E import "Multiplicity"

// -end- 33DD6FC5001E import "Multiplicity"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:45 $
 */
public interface Multiplicity extends java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33DD6FC5001E detail_begin "Multiplicity"

// -end- 33DD6FC5001E detail_begin "Multiplicity"

/** add a Range.
 *
 *  @see #removeRange
 *  @see #containsRange
 *  @see #iteratorRange
 *  @see #clearRange
 *  @see #sizeRange
 */
// -beg- preserve=no 33FF95B90300 add_head33DD6FC5001E "Multiplicity::addRange"
public void addRange(MultiplicityRange range1)
// -end- 33FF95B90300 add_head33DD6FC5001E "Multiplicity::addRange"
;     // empty

/** disconnect a Range.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 remove_head33DD6FC5001E "Multiplicity::removeRange"
public MultiplicityRange removeRange(MultiplicityRange range1)
// -end- 33FF95B90300 remove_head33DD6FC5001E "Multiplicity::removeRange"
;     // empty

/** tests if a given Range is connected.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 test_head33DD6FC5001E "Multiplicity::containsRange"
public boolean containsRange(MultiplicityRange range1)
// -end- 33FF95B90300 test_head33DD6FC5001E "Multiplicity::containsRange"
;     // empty

/** used to enumerate all connected Ranges.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 get_all_head33DD6FC5001E "Multiplicity::iteratorRange"
public java.util.Iterator iteratorRange()
// -end- 33FF95B90300 get_all_head33DD6FC5001E "Multiplicity::iteratorRange"
;     // empty

/** disconnect all Ranges.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 remove_all_head33DD6FC5001E "Multiplicity::clearRange"
public void clearRange()
// -end- 33FF95B90300 remove_all_head33DD6FC5001E "Multiplicity::clearRange"
;     // empty

/** returns the number of Ranges.
 *  @see #addRange
 */
// -beg- preserve=no 33FF95B90300 size_head33DD6FC5001E "Multiplicity::sizeRange"
public int sizeRange()
// -end- 33FF95B90300 size_head33DD6FC5001E "Multiplicity::sizeRange"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF95B90300 _link_body33DD6FC5001E "Multiplicity::_linkRange"
public void _linkRange(MultiplicityRange range1);
// -end- 33FF95B90300 _link_body33DD6FC5001E "Multiplicity::_linkRange"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF95B90300 _unlink_body33DD6FC5001E "Multiplicity::_unlinkRange"
public void _unlinkRange(MultiplicityRange range1);
// -end- 33FF95B90300 _unlink_body33DD6FC5001E "Multiplicity::_unlinkRange"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33DD6FC5001E detail_end "Multiplicity"

// -end- 33DD6FC5001E detail_end "Multiplicity"

}
