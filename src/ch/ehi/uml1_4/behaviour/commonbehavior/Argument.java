// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:55 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33D9073E03B6 package "Argument"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 33D9073E03B6 package "Argument"

// -beg- preserve=no 33D9073E03B6 autoimport "Argument"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
import ch.ehi.uml1_4.foundation.datatypes.Expression;
// -end- 33D9073E03B6 autoimport "Argument"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33D9073E03B6 import "Argument"

// -end- 33D9073E03B6 import "Argument"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:55 $
 */
public interface Argument extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33D9073E03B6 detail_begin "Argument"

  // -end- 33D9073E03B6 detail_begin "Argument"

  /** attaches a Action.
   *  
   *  @see #detachAction
   *  @see #getAction
   *  @see #containsAction
   */
  // -beg- preserve=no 33CFA4B90280 attach_head33D9073E03B6 "Argument::attachAction"
  public void attachAction(Action action1)
  // -end- 33CFA4B90280 attach_head33D9073E03B6 "Argument::attachAction"
    ; // empty

  /** disconnect the currently attached Action.
   *  @see #attachAction
   */
  // -beg- preserve=no 33CFA4B90280 detach_head33D9073E03B6 "Argument::detachAction"
  public Action detachAction()
  // -end- 33CFA4B90280 detach_head33D9073E03B6 "Argument::detachAction"
    ; // empty

  /** get the currently attached Action.
   *  @see #attachAction
   */
  // -beg- preserve=no 33CFA4B90280 get_head33D9073E03B6 "Argument::getAction"
  public Action getAction()
  // -end- 33CFA4B90280 get_head33D9073E03B6 "Argument::getAction"
    ; // empty

  /** tests if there is a Action attached.
   *  @see #attachAction
   */
  // -beg- preserve=no 33CFA4B90280 test_head33D9073E03B6 "Argument::containsAction"
  public boolean containsAction()
  // -end- 33CFA4B90280 test_head33D9073E03B6 "Argument::containsAction"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFA4B90280 _link_body33D9073E03B6 "Argument::_linkAction"
  public void _linkAction(Action action1);
  // -end- 33CFA4B90280 _link_body33D9073E03B6 "Argument::_linkAction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFA4B90280 _unlink_body33D9073E03B6 "Argument::_unlinkAction"
  public void _unlinkAction(Action action1);
  // -end- 33CFA4B90280 _unlink_body33D9073E03B6 "Argument::_unlinkAction"

  /** get current value of value
   *  @see #setValue
   */
  // -beg- preserve=no 33D9076D00FA get_head33D9073E03B6 "value"
   Expression getValue()
  // -end- 33D9076D00FA get_head33D9073E03B6 "value"
    ; // empty
  /** set current value of value
   *  @see #getValue
   */
  // -beg- preserve=no 33D9076D00FA set_head33D9073E03B6 "value"
   void setValue(Expression value1)
  // -end- 33D9076D00FA set_head33D9073E03B6 "value"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33D9073E03B6 detail_end "Argument"

  // -end- 33D9073E03B6 detail_end "Argument"

}

