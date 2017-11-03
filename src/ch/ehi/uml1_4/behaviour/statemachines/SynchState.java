// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:11 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3611CF280262 package "SynchState"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 3611CF280262 package "SynchState"

// -beg- preserve=no 3611CF280262 autoimport "SynchState"
import ch.ehi.uml1_4.behaviour.statemachines.StateVertex;
import ch.ehi.uml1_4.foundation.datatypes.UnlimitedInteger;
// -end- 3611CF280262 autoimport "SynchState"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3611CF280262 import "SynchState"

// -end- 3611CF280262 import "SynchState"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:11 $
 */
<<<<<<< HEAD
public interface SynchState extends StateVertex , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3611CF280262 detail_begin "SynchState"

  // -end- 3611CF280262 detail_begin "SynchState"

  /** get current value of bound
   *  @see #setBound
   */
  // -beg- preserve=no 3611CFB300FA get_head3611CF280262 "bound"
   UnlimitedInteger getBound()
  // -end- 3611CFB300FA get_head3611CF280262 "bound"
    ; // empty
  /** set current value of bound
   *  @see #getBound
   */
  // -beg- preserve=no 3611CFB300FA set_head3611CF280262 "bound"
   void setBound(UnlimitedInteger value1)
  // -end- 3611CFB300FA set_head3611CF280262 "bound"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3611CF280262 detail_end "SynchState"

  // -end- 3611CF280262 detail_end "SynchState"

}

=======
public interface SynchState extends StateVertex, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3611CF280262 detail_begin "SynchState"

// -end- 3611CF280262 detail_begin "SynchState"

/** get current value of bound
 *  @see #setBound
 */
// -beg- preserve=no 3611CFB300FA get_head3611CF280262 "bound"
UnlimitedInteger getBound()
// -end- 3611CFB300FA get_head3611CF280262 "bound"
;     // empty
/** set current value of bound
 *  @see #getBound
 */
// -beg- preserve=no 3611CFB300FA set_head3611CF280262 "bound"
void setBound(UnlimitedInteger value1)
// -end- 3611CFB300FA set_head3611CF280262 "bound"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3611CF280262 detail_end "SynchState"

// -end- 3611CF280262 detail_end "SynchState"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
