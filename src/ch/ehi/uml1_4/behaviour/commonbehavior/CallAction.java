// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:56 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 336990DE026C package "CallAction"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 336990DE026C package "CallAction"

// -beg- preserve=no 336990DE026C autoimport "CallAction"
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
import ch.ehi.uml1_4.foundation.core.Operation;
// -end- 336990DE026C autoimport "CallAction"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 336990DE026C import "CallAction"

// -end- 336990DE026C import "CallAction"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:56 $
 */
<<<<<<< HEAD
public interface CallAction extends Action , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 336990DE026C detail_begin "CallAction"

  // -end- 336990DE026C detail_begin "CallAction"

  /** attaches a Called.
   *  
   *  @see #detachCalled
   *  @see #getCalled
   *  @see #containsCalled
   */
  // -beg- preserve=no 3369916301AE attach_head336990DE026C "CallAction::attachCalled"
  public void attachCalled(Operation called1)
  // -end- 3369916301AE attach_head336990DE026C "CallAction::attachCalled"
    ; // empty

  /** disconnect the currently attached Called.
   *  @see #attachCalled
   */
  // -beg- preserve=no 3369916301AE detach_head336990DE026C "CallAction::detachCalled"
  public Operation detachCalled()
  // -end- 3369916301AE detach_head336990DE026C "CallAction::detachCalled"
    ; // empty

  /** get the currently attached Called.
   *  @see #attachCalled
   */
  // -beg- preserve=no 3369916301AE get_head336990DE026C "CallAction::getCalled"
  public Operation getCalled()
  // -end- 3369916301AE get_head336990DE026C "CallAction::getCalled"
    ; // empty

  /** tests if there is a Called attached.
   *  @see #attachCalled
   */
  // -beg- preserve=no 3369916301AE test_head336990DE026C "CallAction::containsCalled"
  public boolean containsCalled()
  // -end- 3369916301AE test_head336990DE026C "CallAction::containsCalled"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3369916301AE _link_body336990DE026C "CallAction::_linkCalled"
  public void _linkCalled(Operation called1);
  // -end- 3369916301AE _link_body336990DE026C "CallAction::_linkCalled"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3369916301AE _unlink_body336990DE026C "CallAction::_unlinkCalled"
  public void _unlinkCalled(Operation called1);
  // -end- 3369916301AE _unlink_body336990DE026C "CallAction::_unlinkCalled"

  /** attaches a Operation.
   *  
   *  @see #detachOperation
   *  @see #getOperation
   *  @see #containsOperation
   */
  // -beg- preserve=no 36266EAA01FE attach_head336990DE026C "CallAction::attachOperation"
  public void attachOperation(Operation operation1)
  // -end- 36266EAA01FE attach_head336990DE026C "CallAction::attachOperation"
    ; // empty

  /** disconnect the currently attached Operation.
   *  @see #attachOperation
   */
  // -beg- preserve=no 36266EAA01FE detach_head336990DE026C "CallAction::detachOperation"
  public Operation detachOperation()
  // -end- 36266EAA01FE detach_head336990DE026C "CallAction::detachOperation"
    ; // empty

  /** get the currently attached Operation.
   *  @see #attachOperation
   */
  // -beg- preserve=no 36266EAA01FE get_head336990DE026C "CallAction::getOperation"
  public Operation getOperation()
  // -end- 36266EAA01FE get_head336990DE026C "CallAction::getOperation"
    ; // empty

  /** tests if there is a Operation attached.
   *  @see #attachOperation
   */
  // -beg- preserve=no 36266EAA01FE test_head336990DE026C "CallAction::containsOperation"
  public boolean containsOperation()
  // -end- 36266EAA01FE test_head336990DE026C "CallAction::containsOperation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36266EAA01FE _link_body336990DE026C "CallAction::_linkOperation"
  public void _linkOperation(Operation operation1);
  // -end- 36266EAA01FE _link_body336990DE026C "CallAction::_linkOperation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36266EAA01FE _unlink_body336990DE026C "CallAction::_unlinkOperation"
  public void _unlinkOperation(Operation operation1);
  // -end- 36266EAA01FE _unlink_body336990DE026C "CallAction::_unlinkOperation"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 336990DE026C detail_end "CallAction"

  // -end- 336990DE026C detail_end "CallAction"

}

=======
public interface CallAction extends Action, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 336990DE026C detail_begin "CallAction"

// -end- 336990DE026C detail_begin "CallAction"

/** attaches a Called.
 *
 *  @see #detachCalled
 *  @see #getCalled
 *  @see #containsCalled
 */
// -beg- preserve=no 3369916301AE attach_head336990DE026C "CallAction::attachCalled"
public void attachCalled(Operation called1)
// -end- 3369916301AE attach_head336990DE026C "CallAction::attachCalled"
;     // empty

/** disconnect the currently attached Called.
 *  @see #attachCalled
 */
// -beg- preserve=no 3369916301AE detach_head336990DE026C "CallAction::detachCalled"
public Operation detachCalled()
// -end- 3369916301AE detach_head336990DE026C "CallAction::detachCalled"
;     // empty

/** get the currently attached Called.
 *  @see #attachCalled
 */
// -beg- preserve=no 3369916301AE get_head336990DE026C "CallAction::getCalled"
public Operation getCalled()
// -end- 3369916301AE get_head336990DE026C "CallAction::getCalled"
;     // empty

/** tests if there is a Called attached.
 *  @see #attachCalled
 */
// -beg- preserve=no 3369916301AE test_head336990DE026C "CallAction::containsCalled"
public boolean containsCalled()
// -end- 3369916301AE test_head336990DE026C "CallAction::containsCalled"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3369916301AE _link_body336990DE026C "CallAction::_linkCalled"
public void _linkCalled(Operation called1);
// -end- 3369916301AE _link_body336990DE026C "CallAction::_linkCalled"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3369916301AE _unlink_body336990DE026C "CallAction::_unlinkCalled"
public void _unlinkCalled(Operation called1);
// -end- 3369916301AE _unlink_body336990DE026C "CallAction::_unlinkCalled"

/** attaches a Operation.
 *
 *  @see #detachOperation
 *  @see #getOperation
 *  @see #containsOperation
 */
// -beg- preserve=no 36266EAA01FE attach_head336990DE026C "CallAction::attachOperation"
public void attachOperation(Operation operation1)
// -end- 36266EAA01FE attach_head336990DE026C "CallAction::attachOperation"
;     // empty

/** disconnect the currently attached Operation.
 *  @see #attachOperation
 */
// -beg- preserve=no 36266EAA01FE detach_head336990DE026C "CallAction::detachOperation"
public Operation detachOperation()
// -end- 36266EAA01FE detach_head336990DE026C "CallAction::detachOperation"
;     // empty

/** get the currently attached Operation.
 *  @see #attachOperation
 */
// -beg- preserve=no 36266EAA01FE get_head336990DE026C "CallAction::getOperation"
public Operation getOperation()
// -end- 36266EAA01FE get_head336990DE026C "CallAction::getOperation"
;     // empty

/** tests if there is a Operation attached.
 *  @see #attachOperation
 */
// -beg- preserve=no 36266EAA01FE test_head336990DE026C "CallAction::containsOperation"
public boolean containsOperation()
// -end- 36266EAA01FE test_head336990DE026C "CallAction::containsOperation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36266EAA01FE _link_body336990DE026C "CallAction::_linkOperation"
public void _linkOperation(Operation operation1);
// -end- 36266EAA01FE _link_body336990DE026C "CallAction::_linkOperation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36266EAA01FE _unlink_body336990DE026C "CallAction::_unlinkOperation"
public void _unlinkOperation(Operation operation1);
// -end- 36266EAA01FE _unlink_body336990DE026C "CallAction::_unlinkOperation"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 336990DE026C detail_end "CallAction"

// -end- 336990DE026C detail_end "CallAction"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
