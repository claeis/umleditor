// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:02 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 364B6592023A package "NodeInstance"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 364B6592023A package "NodeInstance"

// -beg- preserve=no 364B6592023A autoimport "NodeInstance"
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.ComponentInstance;
// -end- 364B6592023A autoimport "NodeInstance"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 364B6592023A import "NodeInstance"

// -end- 364B6592023A import "NodeInstance"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:02 $
 */
public interface NodeInstance extends Instance, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 364B6592023A detail_begin "NodeInstance"

// -end- 364B6592023A detail_begin "NodeInstance"

/** add a Resident.
 *
 *  @see #removeResident
 *  @see #containsResident
 *  @see #iteratorResident
 *  @see #clearResident
 *  @see #sizeResident
 */
// -beg- preserve=no 364B65E50123 add_head364B6592023A "NodeInstance::addResident"
public void addResident(ComponentInstance resident1)
// -end- 364B65E50123 add_head364B6592023A "NodeInstance::addResident"
;     // empty

/** disconnect a Resident.
 *  @see #addResident
 */
// -beg- preserve=no 364B65E50123 remove_head364B6592023A "NodeInstance::removeResident"
public ComponentInstance removeResident(ComponentInstance resident1)
// -end- 364B65E50123 remove_head364B6592023A "NodeInstance::removeResident"
;     // empty

/** tests if a given Resident is connected.
 *  @see #addResident
 */
// -beg- preserve=no 364B65E50123 test_head364B6592023A "NodeInstance::containsResident"
public boolean containsResident(ComponentInstance resident1)
// -end- 364B65E50123 test_head364B6592023A "NodeInstance::containsResident"
;     // empty

/** used to enumerate all connected Residents.
 *  @see #addResident
 */
// -beg- preserve=no 364B65E50123 get_all_head364B6592023A "NodeInstance::iteratorResident"
public java.util.Iterator iteratorResident()
// -end- 364B65E50123 get_all_head364B6592023A "NodeInstance::iteratorResident"
;     // empty

/** disconnect all Residents.
 *  @see #addResident
 */
// -beg- preserve=no 364B65E50123 remove_all_head364B6592023A "NodeInstance::clearResident"
public void clearResident()
// -end- 364B65E50123 remove_all_head364B6592023A "NodeInstance::clearResident"
;     // empty

/** returns the number of Residents.
 *  @see #addResident
 */
// -beg- preserve=no 364B65E50123 size_head364B6592023A "NodeInstance::sizeResident"
public int sizeResident()
// -end- 364B65E50123 size_head364B6592023A "NodeInstance::sizeResident"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 364B65E50123 _link_body364B6592023A "NodeInstance::_linkResident"
public void _linkResident(ComponentInstance resident1);
// -end- 364B65E50123 _link_body364B6592023A "NodeInstance::_linkResident"

/** DONT USE; link management internal
 */
// -beg- preserve=no 364B65E50123 _unlink_body364B6592023A "NodeInstance::_unlinkResident"
public void _unlinkResident(ComponentInstance resident1);
// -end- 364B65E50123 _unlink_body364B6592023A "NodeInstance::_unlinkResident"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 364B6592023A detail_end "NodeInstance"

// -end- 364B6592023A detail_end "NodeInstance"

}
