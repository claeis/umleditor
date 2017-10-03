// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:08 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 328A47F10064 package "Pseudostate"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 328A47F10064 package "Pseudostate"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 328A47F10064 import "Pseudostate"

// -end- 328A47F10064 import "Pseudostate"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:08 $
 */
public interface Pseudostate extends StateVertex, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 328A47F10064 detail_begin "Pseudostate"

// -end- 328A47F10064 detail_begin "Pseudostate"

/** get current value of kind
 *  @see ch.ehi.uml1_4.foundation.datatypes.PseudostateKind
 *  @see #setKind
 */
// -beg- preserve=no 328A480D00AA get_head328A47F10064 "kind"
int getKind()
// -end- 328A480D00AA get_head328A47F10064 "kind"
;     // empty
/** set current value of kind
 *  @see ch.ehi.uml1_4.foundation.datatypes.PseudostateKind
 *  @see #getKind
 */
// -beg- preserve=no 328A480D00AA set_head328A47F10064 "kind"
void setKind(int value1)
// -end- 328A480D00AA set_head328A47F10064 "kind"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 328A47F10064 detail_end "Pseudostate"

// -end- 328A47F10064 detail_end "Pseudostate"

}
