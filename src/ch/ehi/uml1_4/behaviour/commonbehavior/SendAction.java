// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:03 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 336990B900A0 package "SendAction"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 336990B900A0 package "SendAction"

// -beg- preserve=no 336990B900A0 autoimport "SendAction"
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
import ch.ehi.uml1_4.behaviour.commonbehavior.Signal;
// -end- 336990B900A0 autoimport "SendAction"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 336990B900A0 import "SendAction"

// -end- 336990B900A0 import "SendAction"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:03 $
 */
public interface SendAction extends Action , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 336990B900A0 detail_begin "SendAction"

  // -end- 336990B900A0 detail_begin "SendAction"

  /** attaches a Signal.
   *  
   *  @see #detachSignal
   *  @see #getSignal
   *  @see #containsSignal
   */
  // -beg- preserve=no 33699121012D attach_head336990B900A0 "SendAction::attachSignal"
  public void attachSignal(Signal signal1)
  // -end- 33699121012D attach_head336990B900A0 "SendAction::attachSignal"
    ; // empty

  /** disconnect the currently attached Signal.
   *  @see #attachSignal
   */
  // -beg- preserve=no 33699121012D detach_head336990B900A0 "SendAction::detachSignal"
  public Signal detachSignal()
  // -end- 33699121012D detach_head336990B900A0 "SendAction::detachSignal"
    ; // empty

  /** get the currently attached Signal.
   *  @see #attachSignal
   */
  // -beg- preserve=no 33699121012D get_head336990B900A0 "SendAction::getSignal"
  public Signal getSignal()
  // -end- 33699121012D get_head336990B900A0 "SendAction::getSignal"
    ; // empty

  /** tests if there is a Signal attached.
   *  @see #attachSignal
   */
  // -beg- preserve=no 33699121012D test_head336990B900A0 "SendAction::containsSignal"
  public boolean containsSignal()
  // -end- 33699121012D test_head336990B900A0 "SendAction::containsSignal"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33699121012D _link_body336990B900A0 "SendAction::_linkSignal"
  public void _linkSignal(Signal signal1);
  // -end- 33699121012D _link_body336990B900A0 "SendAction::_linkSignal"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33699121012D _unlink_body336990B900A0 "SendAction::_unlinkSignal"
  public void _unlinkSignal(Signal signal1);
  // -end- 33699121012D _unlink_body336990B900A0 "SendAction::_unlinkSignal"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 336990B900A0 detail_end "SendAction"

  // -end- 336990B900A0 detail_end "SendAction"

}

