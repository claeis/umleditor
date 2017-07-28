// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:40 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3288E51A0316 package "ActionState"
package ch.ehi.uml1_4.behaviour.activitygraphs;
// -end- 3288E51A0316 package "ActionState"

// -beg- preserve=no 3288E51A0316 autoimport "ActionState"
import ch.ehi.uml1_4.behaviour.statemachines.SimpleState;
import ch.ehi.uml1_4.foundation.datatypes.ArgListsExpression;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
// -end- 3288E51A0316 autoimport "ActionState"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3288E51A0316 import "ActionState"

// -end- 3288E51A0316 import "ActionState"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:40 $
 */
public interface ActionState extends SimpleState, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3288E51A0316 detail_begin "ActionState"

// -end- 3288E51A0316 detail_begin "ActionState"

/** get current value of isDynamic
 *  @see #setDynamic
 */
// -beg- preserve=no 36462B9902EE get_head3288E51A0316 "isDynamic"
boolean isDynamic()
// -end- 36462B9902EE get_head3288E51A0316 "isDynamic"
;     // empty
/** set current value of isDynamic
 *  @see #isDynamic
 */
// -beg- preserve=no 36462B9902EE set_head3288E51A0316 "isDynamic"
void setDynamic(boolean value1)
// -end- 36462B9902EE set_head3288E51A0316 "isDynamic"
;     // empty
/** get current value of dynamicArguments
 *  @see #setDynamicArguments
 */
// -beg- preserve=no 36462D0E0398 get_head3288E51A0316 "dynamicArguments"
ArgListsExpression getDynamicArguments()
// -end- 36462D0E0398 get_head3288E51A0316 "dynamicArguments"
;     // empty
/** set current value of dynamicArguments
 *  @see #getDynamicArguments
 */
// -beg- preserve=no 36462D0E0398 set_head3288E51A0316 "dynamicArguments"
void setDynamicArguments(ArgListsExpression value1)
// -end- 36462D0E0398 set_head3288E51A0316 "dynamicArguments"
;     // empty
/** get current value of dynamicMultiplicity
 *  @see #setDynamicMultiplicity
 */
// -beg- preserve=no 36A4EC7D019A get_head3288E51A0316 "dynamicMultiplicity"
Multiplicity getDynamicMultiplicity()
// -end- 36A4EC7D019A get_head3288E51A0316 "dynamicMultiplicity"
;     // empty
/** set current value of dynamicMultiplicity
 *  @see #getDynamicMultiplicity
 */
// -beg- preserve=no 36A4EC7D019A set_head3288E51A0316 "dynamicMultiplicity"
void setDynamicMultiplicity(Multiplicity value1)
// -end- 36A4EC7D019A set_head3288E51A0316 "dynamicMultiplicity"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3288E51A0316 detail_end "ActionState"

// -end- 3288E51A0316 detail_end "ActionState"

}
