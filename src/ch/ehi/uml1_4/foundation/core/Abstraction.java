// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:17 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3388FE7D006E package "Abstraction"
package ch.ehi.uml1_4.foundation.core;
// -end- 3388FE7D006E package "Abstraction"

// -beg- preserve=no 3388FE7D006E autoimport "Abstraction"
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.datatypes.MappingExpression;
// -end- 3388FE7D006E autoimport "Abstraction"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3388FE7D006E import "Abstraction"

// -end- 3388FE7D006E import "Abstraction"

/** An abstraction is a Dependency relationship that relates two elements or sets of elements thatrepresent the same concept at different levels of abstraction or from different viewpoints.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:17 $
 */
public interface Abstraction extends Dependency, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3388FE7D006E detail_begin "Abstraction"

// -end- 3388FE7D006E detail_begin "Abstraction"

/** get current value of mapping
 *  @see #setMapping
 */
// -beg- preserve=no 33EB8A4500B4 get_head3388FE7D006E "mapping"
MappingExpression getMapping()
// -end- 33EB8A4500B4 get_head3388FE7D006E "mapping"
;     // empty
/** set current value of mapping
 *  @see #getMapping
 */
// -beg- preserve=no 33EB8A4500B4 set_head3388FE7D006E "mapping"
void setMapping(MappingExpression value1)
// -end- 33EB8A4500B4 set_head3388FE7D006E "mapping"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3388FE7D006E detail_end "Abstraction"

// -end- 3388FE7D006E detail_end "Abstraction"

}
