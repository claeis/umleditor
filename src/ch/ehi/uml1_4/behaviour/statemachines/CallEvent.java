// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:06 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 32D270DC0262 package "CallEvent"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 32D270DC0262 package "CallEvent"

// -beg- preserve=no 32D270DC0262 autoimport "CallEvent"
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.foundation.core.Operation;
// -end- 32D270DC0262 autoimport "CallEvent"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 32D270DC0262 import "CallEvent"

// -end- 32D270DC0262 import "CallEvent"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:06 $
 */
public interface CallEvent extends Event , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32D270DC0262 detail_begin "CallEvent"

  // -end- 32D270DC0262 detail_begin "CallEvent"

  /** attaches a Operation.
   *  
   *  @see #detachOperation
   *  @see #getOperation
   *  @see #containsOperation
   */
  // -beg- preserve=no 32B598450000 attach_head32D270DC0262 "CallEvent::attachOperation"
  public void attachOperation(Operation operation1)
  // -end- 32B598450000 attach_head32D270DC0262 "CallEvent::attachOperation"
    ; // empty

  /** disconnect the currently attached Operation.
   *  @see #attachOperation
   */
  // -beg- preserve=no 32B598450000 detach_head32D270DC0262 "CallEvent::detachOperation"
  public Operation detachOperation()
  // -end- 32B598450000 detach_head32D270DC0262 "CallEvent::detachOperation"
    ; // empty

  /** get the currently attached Operation.
   *  @see #attachOperation
   */
  // -beg- preserve=no 32B598450000 get_head32D270DC0262 "CallEvent::getOperation"
  public Operation getOperation()
  // -end- 32B598450000 get_head32D270DC0262 "CallEvent::getOperation"
    ; // empty

  /** tests if there is a Operation attached.
   *  @see #attachOperation
   */
  // -beg- preserve=no 32B598450000 test_head32D270DC0262 "CallEvent::containsOperation"
  public boolean containsOperation()
  // -end- 32B598450000 test_head32D270DC0262 "CallEvent::containsOperation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B598450000 _link_body32D270DC0262 "CallEvent::_linkOperation"
  public void _linkOperation(Operation operation1);
  // -end- 32B598450000 _link_body32D270DC0262 "CallEvent::_linkOperation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B598450000 _unlink_body32D270DC0262 "CallEvent::_unlinkOperation"
  public void _unlinkOperation(Operation operation1);
  // -end- 32B598450000 _unlink_body32D270DC0262 "CallEvent::_unlinkOperation"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32D270DC0262 detail_end "CallEvent"

  // -end- 32D270DC0262 detail_end "CallEvent"

}

