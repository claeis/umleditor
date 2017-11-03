// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:42 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3A555929037A package "ProgrammingLanguageDataType"
package ch.ehi.uml1_4.foundation.core;
// -end- 3A555929037A package "ProgrammingLanguageDataType"

// -beg- preserve=no 3A555929037A autoimport "ProgrammingLanguageDataType"
import ch.ehi.uml1_4.foundation.core.DataType;
import ch.ehi.uml1_4.foundation.datatypes.TypeExpression;
// -end- 3A555929037A autoimport "ProgrammingLanguageDataType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3A555929037A import "ProgrammingLanguageDataType"

// -end- 3A555929037A import "ProgrammingLanguageDataType"

/** A data type is a type whose values have no identity (i.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:42 $
 */
public interface ProgrammingLanguageDataType extends DataType, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3A555929037A detail_begin "ProgrammingLanguageDataType"

// -end- 3A555929037A detail_begin "ProgrammingLanguageDataType"

/** get current value of expression
 *  An expression for the ProgrammingLanguageDataType expressedin its particular programming language.
 *  @see #setExpression
 */
// -beg- preserve=no 3A555A110290 get_head3A555929037A "expression"
TypeExpression getExpression()
// -end- 3A555A110290 get_head3A555929037A "expression"
;     // empty
/** set current value of expression
 *  @see #getExpression
 */
// -beg- preserve=no 3A555A110290 set_head3A555929037A "expression"
void setExpression(TypeExpression value1)
// -end- 3A555A110290 set_head3A555929037A "expression"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3A555929037A detail_end "ProgrammingLanguageDataType"

// -end- 3A555929037A detail_end "ProgrammingLanguageDataType"

}
