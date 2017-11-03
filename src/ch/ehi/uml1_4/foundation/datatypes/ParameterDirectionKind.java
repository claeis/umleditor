// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-02 15:42:28 $
// $Revision: 1.2 $
//

// -beg- preserve=no 33DD6FDC024E package "ParameterDirectionKind"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33DD6FDC024E package "ParameterDirectionKind"

// -beg- preserve=no 33DD6FDC024E autoimport "ParameterDirectionKind"

// -end- 33DD6FDC024E autoimport "ParameterDirectionKind"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33DD6FDC024E import "ParameterDirectionKind"

// -end- 33DD6FDC024E import "ParameterDirectionKind"

/** In the metamodel ParameterDirectionKind defines an enumeration that denotes if a Parameter isused for supplying an argument and/or for returning a value.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.2 $ $Date: 2004-03-02 15:42:28 $
 */
public interface ParameterDirectionKind extends java.io.Serializable
{
<<<<<<< HEAD
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33DD6FDC024E detail_begin "ParameterDirectionKind"

  // -end- 33DD6FDC024E detail_begin "ParameterDirectionKind"

  /** An input Parameter (may not be modified).
   */
  // -beg- preserve=no 4044A7FF028F var33DD6FDC024E "IN"
  public static final int IN = 1;
  // -end- 4044A7FF028F var33DD6FDC024E "IN"

  /** An output Parameter (may be modified to communicateinformation to the caller).
   */
  // -beg- preserve=no 4044A8040282 var33DD6FDC024E "OUT"
  public static final int OUT = 2;
  // -end- 4044A8040282 var33DD6FDC024E "OUT"

  /** An input Parameter that may be modified.
   */
  // -beg- preserve=no 4044A80A0367 var33DD6FDC024E "INOUT"
  public static final int INOUT = 3;
  // -end- 4044A80A0367 var33DD6FDC024E "INOUT"

  /** A return value of a call.
   */
  // -beg- preserve=no 4044A81103C1 var33DD6FDC024E "RETURN"
  public static final int RETURN = 4;
  // -end- 4044A81103C1 var33DD6FDC024E "RETURN"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33DD6FDC024E detail_end "ParameterDirectionKind"

  // -end- 33DD6FDC024E detail_end "ParameterDirectionKind"

}

=======
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33DD6FDC024E detail_begin "ParameterDirectionKind"

// -end- 33DD6FDC024E detail_begin "ParameterDirectionKind"

/** An input Parameter (may not be modified).
 */
// -beg- preserve=no 4044A7FF028F var33DD6FDC024E "IN"
public static final int IN = 1;
// -end- 4044A7FF028F var33DD6FDC024E "IN"

/** An output Parameter (may be modified to communicateinformation to the caller).
 */
// -beg- preserve=no 4044A8040282 var33DD6FDC024E "OUT"
public static final int OUT = 2;
// -end- 4044A8040282 var33DD6FDC024E "OUT"

/** An input Parameter that may be modified.
 */
// -beg- preserve=no 4044A80A0367 var33DD6FDC024E "INOUT"
public static final int INOUT = 3;
// -end- 4044A80A0367 var33DD6FDC024E "INOUT"

/** A return value of a call.
 */
// -beg- preserve=no 4044A81103C1 var33DD6FDC024E "RETURN"
public static final int RETURN = 4;
// -end- 4044A81103C1 var33DD6FDC024E "RETURN"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33DD6FDC024E detail_end "ParameterDirectionKind"

// -end- 33DD6FDC024E detail_end "ParameterDirectionKind"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
