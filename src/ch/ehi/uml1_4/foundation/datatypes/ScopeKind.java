// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-03 07:58:00 $
// $Revision: 1.2 $
//

// -beg- preserve=no 33DD7020032A package "ScopeKind"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33DD7020032A package "ScopeKind"

// -beg- preserve=no 33DD7020032A autoimport "ScopeKind"

// -end- 33DD7020032A autoimport "ScopeKind"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33DD7020032A import "ScopeKind"

// -end- 33DD7020032A import "ScopeKind"

/** In the metamodel ScopeKind defines an enumeration that denotes whether a feature belongs toindividual instances or an entire classifier.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.2 $ $Date: 2004-03-03 07:58:00 $
 */
public interface ScopeKind extends java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33DD7020032A detail_begin "ScopeKind"

// -end- 33DD7020032A detail_begin "ScopeKind"

/** The feature pertains to Instances of a Classifier.
 */
// -beg- preserve=no 40458FEF00B4 var33DD7020032A "INSTANCE"
public static final int INSTANCE = 1;
// -end- 40458FEF00B4 var33DD7020032A "INSTANCE"

/** The feature pertains to an entire Classifier.
 */
// -beg- preserve=no 40458FF40346 var33DD7020032A "CLASSIFIER"
public static final int CLASSIFIER = 2;
// -end- 40458FF40346 var33DD7020032A "CLASSIFIER"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33DD7020032A detail_end "ScopeKind"

// -end- 33DD7020032A detail_end "ScopeKind"

}
