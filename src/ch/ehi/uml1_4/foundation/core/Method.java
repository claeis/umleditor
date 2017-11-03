// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:32 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327BB67E0028 package "Method"
package ch.ehi.uml1_4.foundation.core;
// -end- 327BB67E0028 package "Method"

// -beg- preserve=no 327BB67E0028 autoimport "Method"
import ch.ehi.uml1_4.foundation.core.BehavioralFeature;
import ch.ehi.uml1_4.foundation.core.Operation;
import ch.ehi.uml1_4.foundation.datatypes.ProcedureExpression;
// -end- 327BB67E0028 autoimport "Method"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327BB67E0028 import "Method"

// -end- 327BB67E0028 import "Method"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:32 $
 */
public interface Method extends BehavioralFeature, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327BB67E0028 detail_begin "Method"

// -end- 327BB67E0028 detail_begin "Method"

/** attaches a Specification.
 *
 *  @see #detachSpecification
 *  @see #getSpecification
 *  @see #containsSpecification
 */
// -beg- preserve=no 32B6D9BE00C9 attach_head327BB67E0028 "Method::attachSpecification"
public void attachSpecification(Operation specification1)
// -end- 32B6D9BE00C9 attach_head327BB67E0028 "Method::attachSpecification"
;     // empty

/** disconnect the currently attached Specification.
 *  @see #attachSpecification
 */
// -beg- preserve=no 32B6D9BE00C9 detach_head327BB67E0028 "Method::detachSpecification"
public Operation detachSpecification()
// -end- 32B6D9BE00C9 detach_head327BB67E0028 "Method::detachSpecification"
;     // empty

/** get the currently attached Specification.
 *  @see #attachSpecification
 */
// -beg- preserve=no 32B6D9BE00C9 get_head327BB67E0028 "Method::getSpecification"
public Operation getSpecification()
// -end- 32B6D9BE00C9 get_head327BB67E0028 "Method::getSpecification"
;     // empty

/** tests if there is a Specification attached.
 *  @see #attachSpecification
 */
// -beg- preserve=no 32B6D9BE00C9 test_head327BB67E0028 "Method::containsSpecification"
public boolean containsSpecification()
// -end- 32B6D9BE00C9 test_head327BB67E0028 "Method::containsSpecification"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B6D9BE00C9 _link_body327BB67E0028 "Method::_linkSpecification"
public void _linkSpecification(Operation specification1);
// -end- 32B6D9BE00C9 _link_body327BB67E0028 "Method::_linkSpecification"

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B6D9BE00C9 _unlink_body327BB67E0028 "Method::_unlinkSpecification"
public void _unlinkSpecification(Operation specification1);
// -end- 32B6D9BE00C9 _unlink_body327BB67E0028 "Method::_unlinkSpecification"

/** get current value of body
 *  @see #setBody
 */
// -beg- preserve=no 327BBD2A02D0 get_head327BB67E0028 "body"
ProcedureExpression getBody()
// -end- 327BBD2A02D0 get_head327BB67E0028 "body"
;     // empty
/** set current value of body
 *  @see #getBody
 */
// -beg- preserve=no 327BBD2A02D0 set_head327BB67E0028 "body"
void setBody(ProcedureExpression value1)
// -end- 327BBD2A02D0 set_head327BB67E0028 "body"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327BB67E0028 detail_end "Method"

// -end- 327BB67E0028 detail_end "Method"

}
