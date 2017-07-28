// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:12 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 32D270E90122 package "TimeEvent"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 32D270E90122 package "TimeEvent"

// -beg- preserve=no 32D270E90122 autoimport "TimeEvent"
import ch.ehi.uml1_4.behaviour.statemachines.Event;
import ch.ehi.uml1_4.foundation.datatypes.TimeExpression;
// -end- 32D270E90122 autoimport "TimeEvent"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 32D270E90122 import "TimeEvent"

// -end- 32D270E90122 import "TimeEvent"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:12 $
 */
public interface TimeEvent extends Event, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 32D270E90122 detail_begin "TimeEvent"

// -end- 32D270E90122 detail_begin "TimeEvent"

/** get current value of when
 *  @see #setWhen
 */
// -beg- preserve=no 33D90A0F0384 get_head32D270E90122 "when"
TimeExpression getWhen()
// -end- 33D90A0F0384 get_head32D270E90122 "when"
;     // empty
/** set current value of when
 *  @see #getWhen
 */
// -beg- preserve=no 33D90A0F0384 set_head32D270E90122 "when"
void setWhen(TimeExpression value1)
// -end- 33D90A0F0384 set_head32D270E90122 "when"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 32D270E90122 detail_end "TimeEvent"

// -end- 32D270E90122 detail_end "TimeEvent"

}
