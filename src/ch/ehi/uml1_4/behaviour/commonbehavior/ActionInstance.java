// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:54 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33FF526E030C package "ActionInstance"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 33FF526E030C package "ActionInstance"

// -beg- preserve=no 33FF526E030C autoimport "ActionInstance"
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
// -end- 33FF526E030C autoimport "ActionInstance"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33FF526E030C import "ActionInstance"

// -end- 33FF526E030C import "ActionInstance"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:54 $
 */
public interface ActionInstance extends java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33FF526E030C detail_begin "ActionInstance"

// -end- 33FF526E030C detail_begin "ActionInstance"

/** attaches a Instance.
 *
 *  @see #detachInstance
 *  @see #getInstance
 *  @see #containsInstance
 */
// -beg- preserve=no 32B59CAB00FA attach_head33FF526E030C "ActionInstance::attachInstance"
public void attachInstance(Instance instance1)
// -end- 32B59CAB00FA attach_head33FF526E030C "ActionInstance::attachInstance"
;     // empty

/** disconnect the currently attached Instance.
 *  @see #attachInstance
 */
// -beg- preserve=no 32B59CAB00FA detach_head33FF526E030C "ActionInstance::detachInstance"
public Instance detachInstance()
// -end- 32B59CAB00FA detach_head33FF526E030C "ActionInstance::detachInstance"
;     // empty

/** get the currently attached Instance.
 *  @see #attachInstance
 */
// -beg- preserve=no 32B59CAB00FA get_head33FF526E030C "ActionInstance::getInstance"
public Instance getInstance()
// -end- 32B59CAB00FA get_head33FF526E030C "ActionInstance::getInstance"
;     // empty

/** tests if there is a Instance attached.
 *  @see #attachInstance
 */
// -beg- preserve=no 32B59CAB00FA test_head33FF526E030C "ActionInstance::containsInstance"
public boolean containsInstance()
// -end- 32B59CAB00FA test_head33FF526E030C "ActionInstance::containsInstance"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B59CAB00FA _link_body33FF526E030C "ActionInstance::_linkInstance"
public void _linkInstance(Instance instance1);
// -end- 32B59CAB00FA _link_body33FF526E030C "ActionInstance::_linkInstance"

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B59CAB00FA _unlink_body33FF526E030C "ActionInstance::_unlinkInstance"
public void _unlinkInstance(Instance instance1);
// -end- 32B59CAB00FA _unlink_body33FF526E030C "ActionInstance::_unlinkInstance"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33FF526E030C detail_end "ActionInstance"

// -end- 33FF526E030C detail_end "ActionInstance"

}
