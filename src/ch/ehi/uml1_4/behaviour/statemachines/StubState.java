// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:11 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 361AFBD10172 package "StubState"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 361AFBD10172 package "StubState"

// -beg- preserve=no 361AFBD10172 autoimport "StubState"
import ch.ehi.uml1_4.behaviour.statemachines.StateVertex;
import ch.ehi.basics.types.NlsString;
// -end- 361AFBD10172 autoimport "StubState"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 361AFBD10172 import "StubState"

// -end- 361AFBD10172 import "StubState"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:11 $
 */
public interface StubState extends StateVertex , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 361AFBD10172 detail_begin "StubState"

  // -end- 361AFBD10172 detail_begin "StubState"

  /** get current value of referenceState
   *  @see #setReferenceState
   */
  // -beg- preserve=no 361AFBED01B8 get_head361AFBD10172 "referenceState"
   NlsString getReferenceState()
  // -end- 361AFBED01B8 get_head361AFBD10172 "referenceState"
    ; // empty
  /** set current value of referenceState
   *  @see #getReferenceState
   */
  // -beg- preserve=no 361AFBED01B8 set_head361AFBD10172 "referenceState"
   void setReferenceState(NlsString value1)
  // -end- 361AFBED01B8 set_head361AFBD10172 "referenceState"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 361AFBD10172 detail_end "StubState"

  // -end- 361AFBD10172 detail_end "StubState"

}

