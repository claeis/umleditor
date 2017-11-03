// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-03 07:57:59 $
// $Revision: 1.2 $
//

// -beg- preserve=no 33DD704201E0 package "VisibilityKind"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33DD704201E0 package "VisibilityKind"

// -beg- preserve=no 33DD704201E0 autoimport "VisibilityKind"

// -end- 33DD704201E0 autoimport "VisibilityKind"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33DD704201E0 import "VisibilityKind"

// -end- 33DD704201E0 import "VisibilityKind"

/** In the metamodel VisibilityKind defines an enumeration that denotes how the element to whichit refers is seen outside the enclosing name space.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.2 $ $Date: 2004-03-03 07:57:59 $
 */
public interface VisibilityKind extends java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33DD704201E0 detail_begin "VisibilityKind"

// -end- 33DD704201E0 detail_begin "VisibilityKind"

/** Other elements may see and use the target element.
 */
// -beg- preserve=no 40459046038A var33DD704201E0 "PUBLIC"
public static final int PUBLIC = 1;
// -end- 40459046038A var33DD704201E0 "PUBLIC"

/** Descendants of the source element may see and use the targetelement.
 */
// -beg- preserve=no 4045904C0324 var33DD704201E0 "PROTECTED"
public static final int PROTECTED = 2;
// -end- 4045904C0324 var33DD704201E0 "PROTECTED"

/** Only the source element may see and use the target element.
 */
// -beg- preserve=no 404590530310 var33DD704201E0 "PRIVATE"
public static final int PRIVATE = 3;
// -end- 404590530310 var33DD704201E0 "PRIVATE"

/** Elements declared in the same package as the target element maysee and use the target element.
 */
// -beg- preserve=no 404590590355 var33DD704201E0 "PACKAGE"
public static final int PACKAGE = 4;
// -end- 404590590355 var33DD704201E0 "PACKAGE"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33DD704201E0 detail_end "VisibilityKind"

// -end- 33DD704201E0 detail_end "VisibilityKind"

}
