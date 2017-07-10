// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:45 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 36619BC301D6 package "OrderingKind"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 36619BC301D6 package "OrderingKind"

// -beg- preserve=no 36619BC301D6 autoimport "OrderingKind"

// -end- 36619BC301D6 autoimport "OrderingKind"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 36619BC301D6 import "OrderingKind"

// -end- 36619BC301D6 import "OrderingKind"

/** Defines an enumeration that specifies how the elements of a set are arranged.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:45 $
 */
public interface OrderingKind extends java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 36619BC301D6 detail_begin "OrderingKind"

  // -end- 36619BC301D6 detail_begin "OrderingKind"

  /** The elements of the set have no inherent ordering.
   */
  // -beg- preserve=no 3C716787013D var36619BC301D6 "UNORDERED"
  public static final int UNORDERED = 1;
  // -end- 3C716787013D var36619BC301D6 "UNORDERED"

  /** The elements of the set have a sequential ordering.
   */
  // -beg- preserve=no 3C71679200FC var36619BC301D6 "ORDERED"
  public static final int ORDERED = 2;
  // -end- 3C71679200FC var36619BC301D6 "ORDERED"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 36619BC301D6 detail_end "OrderingKind"

  // -end- 36619BC301D6 detail_end "OrderingKind"

}

