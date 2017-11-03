// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:06 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3337A5530096 package "ChangeEvent"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 3337A5530096 package "ChangeEvent"

// -beg- preserve=no 3337A5530096 autoimport "ChangeEvent"
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
// -end- 3337A5530096 autoimport "ChangeEvent"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3337A5530096 import "ChangeEvent"

// -end- 3337A5530096 import "ChangeEvent"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:06 $
 */
<<<<<<< HEAD
public interface ChangeEvent extends Event , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3337A5530096 detail_begin "ChangeEvent"

  // -end- 3337A5530096 detail_begin "ChangeEvent"

  /** get current value of changeExpression
   *  @see #setChangeExpression
   */
  // -beg- preserve=no 33D909C80186 get_head3337A5530096 "changeExpression"
   BooleanExpression getChangeExpression()
  // -end- 33D909C80186 get_head3337A5530096 "changeExpression"
    ; // empty
  /** set current value of changeExpression
   *  @see #getChangeExpression
   */
  // -beg- preserve=no 33D909C80186 set_head3337A5530096 "changeExpression"
   void setChangeExpression(BooleanExpression value1)
  // -end- 33D909C80186 set_head3337A5530096 "changeExpression"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3337A5530096 detail_end "ChangeEvent"

  // -end- 3337A5530096 detail_end "ChangeEvent"

}

=======
public interface ChangeEvent extends Event, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3337A5530096 detail_begin "ChangeEvent"

// -end- 3337A5530096 detail_begin "ChangeEvent"

/** get current value of changeExpression
 *  @see #setChangeExpression
 */
// -beg- preserve=no 33D909C80186 get_head3337A5530096 "changeExpression"
BooleanExpression getChangeExpression()
// -end- 33D909C80186 get_head3337A5530096 "changeExpression"
;     // empty
/** set current value of changeExpression
 *  @see #getChangeExpression
 */
// -beg- preserve=no 33D909C80186 set_head3337A5530096 "changeExpression"
void setChangeExpression(BooleanExpression value1)
// -end- 33D909C80186 set_head3337A5530096 "changeExpression"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3337A5530096 detail_end "ChangeEvent"

// -end- 3337A5530096 detail_end "ChangeEvent"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
