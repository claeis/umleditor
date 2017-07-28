// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:45 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33E93BD00075 package "MultiplicityRange"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33E93BD00075 package "MultiplicityRange"

// -beg- preserve=no 33E93BD00075 autoimport "MultiplicityRange"
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
// -end- 33E93BD00075 autoimport "MultiplicityRange"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33E93BD00075 import "MultiplicityRange"

// -end- 33E93BD00075 import "MultiplicityRange"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:45 $
 */
public interface MultiplicityRange extends java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33E93BD00075 detail_begin "MultiplicityRange"

// -end- 33E93BD00075 detail_begin "MultiplicityRange"

/** attaches a Multiplicity.
 *
 *  @see #detachMultiplicity
 *  @see #getMultiplicity
 *  @see #containsMultiplicity
 */
// -beg- preserve=no 33FF95B90378 attach_head33E93BD00075 "MultiplicityRange::attachMultiplicity"
public void attachMultiplicity(Multiplicity multiplicity1)
// -end- 33FF95B90378 attach_head33E93BD00075 "MultiplicityRange::attachMultiplicity"
;     // empty

/** disconnect the currently attached Multiplicity.
 *  @see #attachMultiplicity
 */
// -beg- preserve=no 33FF95B90378 detach_head33E93BD00075 "MultiplicityRange::detachMultiplicity"
public Multiplicity detachMultiplicity()
// -end- 33FF95B90378 detach_head33E93BD00075 "MultiplicityRange::detachMultiplicity"
;     // empty

/** get the currently attached Multiplicity.
 *  @see #attachMultiplicity
 */
// -beg- preserve=no 33FF95B90378 get_head33E93BD00075 "MultiplicityRange::getMultiplicity"
public Multiplicity getMultiplicity()
// -end- 33FF95B90378 get_head33E93BD00075 "MultiplicityRange::getMultiplicity"
;     // empty

/** tests if there is a Multiplicity attached.
 *  @see #attachMultiplicity
 */
// -beg- preserve=no 33FF95B90378 test_head33E93BD00075 "MultiplicityRange::containsMultiplicity"
public boolean containsMultiplicity()
// -end- 33FF95B90378 test_head33E93BD00075 "MultiplicityRange::containsMultiplicity"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF95B90378 _link_body33E93BD00075 "MultiplicityRange::_linkMultiplicity"
public void _linkMultiplicity(Multiplicity multiplicity1);
// -end- 33FF95B90378 _link_body33E93BD00075 "MultiplicityRange::_linkMultiplicity"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF95B90378 _unlink_body33E93BD00075 "MultiplicityRange::_unlinkMultiplicity"
public void _unlinkMultiplicity(Multiplicity multiplicity1);
// -end- 33FF95B90378 _unlink_body33E93BD00075 "MultiplicityRange::_unlinkMultiplicity"

/** get current value of lower
 *  @see #setLower
 */
// -beg- preserve=no 33E93BE902E8 get_head33E93BD00075 "lower"
long getLower()
// -end- 33E93BE902E8 get_head33E93BD00075 "lower"
;     // empty
/** set current value of lower
 *  @see #getLower
 */
// -beg- preserve=no 33E93BE902E8 set_head33E93BD00075 "lower"
void setLower(long value1)
// -end- 33E93BE902E8 set_head33E93BD00075 "lower"
;     // empty
/** get current value of upper
 *  @see #setUpper
 */
// -beg- preserve=no 33E93BFA0329 get_head33E93BD00075 "upper"
long getUpper()
// -end- 33E93BFA0329 get_head33E93BD00075 "upper"
;     // empty
/** set current value of upper
 *  @see #getUpper
 */
// -beg- preserve=no 33E93BFA0329 set_head33E93BD00075 "upper"
void setUpper(long value1)
// -end- 33E93BFA0329 set_head33E93BD00075 "upper"
;     // empty
// -beg- preserve=no 3CCBDFC30287 var33E93BD00075 "UNBOUND"
public static final long UNBOUND = Long.MAX_VALUE;
// -end- 3CCBDFC30287 var33E93BD00075 "UNBOUND"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33E93BD00075 detail_end "MultiplicityRange"

// -end- 33E93BD00075 detail_end "MultiplicityRange"

}
