// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:07 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33695FE9000A package "Guard"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 33695FE9000A package "Guard"

// -beg- preserve=no 33695FE9000A autoimport "Guard"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.statemachines.Transition;
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
// -end- 33695FE9000A autoimport "Guard"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33695FE9000A import "Guard"

// -end- 33695FE9000A import "Guard"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:07 $
 */
<<<<<<< HEAD
public interface Guard extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33695FE9000A detail_begin "Guard"

  // -end- 33695FE9000A detail_begin "Guard"

  /** attaches a Transition.
   *  
   *  @see #detachTransition
   *  @see #getTransition
   *  @see #containsTransition
   */
  // -beg- preserve=no 3369606C0001 attach_head33695FE9000A "Guard::attachTransition"
  public void attachTransition(Transition transition1)
  // -end- 3369606C0001 attach_head33695FE9000A "Guard::attachTransition"
    ; // empty

  /** disconnect the currently attached Transition.
   *  @see #attachTransition
   */
  // -beg- preserve=no 3369606C0001 detach_head33695FE9000A "Guard::detachTransition"
  public Transition detachTransition()
  // -end- 3369606C0001 detach_head33695FE9000A "Guard::detachTransition"
    ; // empty

  /** get the currently attached Transition.
   *  @see #attachTransition
   */
  // -beg- preserve=no 3369606C0001 get_head33695FE9000A "Guard::getTransition"
  public Transition getTransition()
  // -end- 3369606C0001 get_head33695FE9000A "Guard::getTransition"
    ; // empty

  /** tests if there is a Transition attached.
   *  @see #attachTransition
   */
  // -beg- preserve=no 3369606C0001 test_head33695FE9000A "Guard::containsTransition"
  public boolean containsTransition()
  // -end- 3369606C0001 test_head33695FE9000A "Guard::containsTransition"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3369606C0001 _link_body33695FE9000A "Guard::_linkTransition"
  public void _linkTransition(Transition transition1);
  // -end- 3369606C0001 _link_body33695FE9000A "Guard::_linkTransition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3369606C0001 _unlink_body33695FE9000A "Guard::_unlinkTransition"
  public void _unlinkTransition(Transition transition1);
  // -end- 3369606C0001 _unlink_body33695FE9000A "Guard::_unlinkTransition"

  /** get current value of expression
   *  @see #setExpression
   */
  // -beg- preserve=no 33D76AF301C7 get_head33695FE9000A "expression"
   BooleanExpression getExpression()
  // -end- 33D76AF301C7 get_head33695FE9000A "expression"
    ; // empty
  /** set current value of expression
   *  @see #getExpression
   */
  // -beg- preserve=no 33D76AF301C7 set_head33695FE9000A "expression"
   void setExpression(BooleanExpression value1)
  // -end- 33D76AF301C7 set_head33695FE9000A "expression"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33695FE9000A detail_end "Guard"

  // -end- 33695FE9000A detail_end "Guard"

}

=======
public interface Guard extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33695FE9000A detail_begin "Guard"

// -end- 33695FE9000A detail_begin "Guard"

/** attaches a Transition.
 *
 *  @see #detachTransition
 *  @see #getTransition
 *  @see #containsTransition
 */
// -beg- preserve=no 3369606C0001 attach_head33695FE9000A "Guard::attachTransition"
public void attachTransition(Transition transition1)
// -end- 3369606C0001 attach_head33695FE9000A "Guard::attachTransition"
;     // empty

/** disconnect the currently attached Transition.
 *  @see #attachTransition
 */
// -beg- preserve=no 3369606C0001 detach_head33695FE9000A "Guard::detachTransition"
public Transition detachTransition()
// -end- 3369606C0001 detach_head33695FE9000A "Guard::detachTransition"
;     // empty

/** get the currently attached Transition.
 *  @see #attachTransition
 */
// -beg- preserve=no 3369606C0001 get_head33695FE9000A "Guard::getTransition"
public Transition getTransition()
// -end- 3369606C0001 get_head33695FE9000A "Guard::getTransition"
;     // empty

/** tests if there is a Transition attached.
 *  @see #attachTransition
 */
// -beg- preserve=no 3369606C0001 test_head33695FE9000A "Guard::containsTransition"
public boolean containsTransition()
// -end- 3369606C0001 test_head33695FE9000A "Guard::containsTransition"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3369606C0001 _link_body33695FE9000A "Guard::_linkTransition"
public void _linkTransition(Transition transition1);
// -end- 3369606C0001 _link_body33695FE9000A "Guard::_linkTransition"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3369606C0001 _unlink_body33695FE9000A "Guard::_unlinkTransition"
public void _unlinkTransition(Transition transition1);
// -end- 3369606C0001 _unlink_body33695FE9000A "Guard::_unlinkTransition"

/** get current value of expression
 *  @see #setExpression
 */
// -beg- preserve=no 33D76AF301C7 get_head33695FE9000A "expression"
BooleanExpression getExpression()
// -end- 33D76AF301C7 get_head33695FE9000A "expression"
;     // empty
/** set current value of expression
 *  @see #getExpression
 */
// -beg- preserve=no 33D76AF301C7 set_head33695FE9000A "expression"
void setExpression(BooleanExpression value1)
// -end- 33D76AF301C7 set_head33695FE9000A "expression"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33695FE9000A detail_end "Guard"

// -end- 33695FE9000A detail_end "Guard"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
