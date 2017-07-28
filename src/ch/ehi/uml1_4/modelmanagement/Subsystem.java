// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:17 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33CD6DE5030C package "Subsystem"
package ch.ehi.uml1_4.modelmanagement;
// -end- 33CD6DE5030C package "Subsystem"

// -beg- preserve=no 33CD6DE5030C autoimport "Subsystem"
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.foundation.core.Classifier;
// -end- 33CD6DE5030C autoimport "Subsystem"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33CD6DE5030C import "Subsystem"

// -end- 33CD6DE5030C import "Subsystem"

/** A subsystem is a grouping of model elements that represents a behavioral unit in a physicalsystem.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:17 $
 */
public interface Subsystem extends Package, Classifier, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33CD6DE5030C detail_begin "Subsystem"

// -end- 33CD6DE5030C detail_begin "Subsystem"

/** get current value of isInstantiable
 *  @see #setInstantiable
 */
// -beg- preserve=no 33F223B800AA get_head33CD6DE5030C "isInstantiable"
boolean isInstantiable()
// -end- 33F223B800AA get_head33CD6DE5030C "isInstantiable"
;     // empty
/** set current value of isInstantiable
 *  @see #isInstantiable
 */
// -beg- preserve=no 33F223B800AA set_head33CD6DE5030C "isInstantiable"
void setInstantiable(boolean value1)
// -end- 33F223B800AA set_head33CD6DE5030C "isInstantiable"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33CD6DE5030C detail_end "Subsystem"

// -end- 33CD6DE5030C detail_end "Subsystem"

}
