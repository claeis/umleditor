// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:42 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33CF9DAB035C package "SubactivityState"
package ch.ehi.uml1_4.behaviour.activitygraphs;
// -end- 33CF9DAB035C package "SubactivityState"

// -beg- preserve=no 33CF9DAB035C autoimport "SubactivityState"
import ch.ehi.uml1_4.behaviour.statemachines.SubmachineState;
import ch.ehi.uml1_4.foundation.datatypes.ArgListsExpression;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
// -end- 33CF9DAB035C autoimport "SubactivityState"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33CF9DAB035C import "SubactivityState"

// -end- 33CF9DAB035C import "SubactivityState"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:42 $
 */
public interface SubactivityState extends SubmachineState, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33CF9DAB035C detail_begin "SubactivityState"

// -end- 33CF9DAB035C detail_begin "SubactivityState"

/** get current value of isDynamic
 *  @see #setDynamic
 */
// -beg- preserve=no 36462C9E0104 get_head33CF9DAB035C "isDynamic"
boolean isDynamic()
// -end- 36462C9E0104 get_head33CF9DAB035C "isDynamic"
;     // empty
/** set current value of isDynamic
 *  @see #isDynamic
 */
// -beg- preserve=no 36462C9E0104 set_head33CF9DAB035C "isDynamic"
void setDynamic(boolean value1)
// -end- 36462C9E0104 set_head33CF9DAB035C "isDynamic"
;     // empty
/** get current value of dynamicArguments
 *  @see #setDynamicArguments
 */
// -beg- preserve=no 36462CBE0118 get_head33CF9DAB035C "dynamicArguments"
ArgListsExpression getDynamicArguments()
// -end- 36462CBE0118 get_head33CF9DAB035C "dynamicArguments"
;     // empty
/** set current value of dynamicArguments
 *  @see #getDynamicArguments
 */
// -beg- preserve=no 36462CBE0118 set_head33CF9DAB035C "dynamicArguments"
void setDynamicArguments(ArgListsExpression value1)
// -end- 36462CBE0118 set_head33CF9DAB035C "dynamicArguments"
;     // empty
/** get current value of dynamicMultiplicity
 *  @see #setDynamicMultiplicity
 */
// -beg- preserve=no 36A4ECB703C0 get_head33CF9DAB035C "dynamicMultiplicity"
Multiplicity getDynamicMultiplicity()
// -end- 36A4ECB703C0 get_head33CF9DAB035C "dynamicMultiplicity"
;     // empty
/** set current value of dynamicMultiplicity
 *  @see #getDynamicMultiplicity
 */
// -beg- preserve=no 36A4ECB703C0 set_head33CF9DAB035C "dynamicMultiplicity"
void setDynamicMultiplicity(Multiplicity value1)
// -end- 36A4ECB703C0 set_head33CF9DAB035C "dynamicMultiplicity"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33CF9DAB035C detail_end "SubactivityState"

// -end- 33CF9DAB035C detail_end "SubactivityState"

}
