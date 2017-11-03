// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:43 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33DD6F5903A2 package "AggregationKind"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33DD6F5903A2 package "AggregationKind"

// -beg- preserve=no 33DD6F5903A2 autoimport "AggregationKind"

// -end- 33DD6F5903A2 autoimport "AggregationKind"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33DD6F5903A2 import "AggregationKind"

// -end- 33DD6F5903A2 import "AggregationKind"

<<<<<<< HEAD
/** An enumeration that denotes what kind of aggregation an Association is.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:43 $
 */
public interface AggregationKind extends java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33DD6F5903A2 detail_begin "AggregationKind"

  // -end- 33DD6F5903A2 detail_begin "AggregationKind"

  /** The end is not an aggregate.
   */
  // -beg- preserve=no 3C7166020151 var33DD6F5903A2 "NONE"
  public static final int NONE = 1;
  // -end- 3C7166020151 var33DD6F5903A2 "NONE"

  /** The end is an aggregate; therefore, the other end is a part andmust have the aggregation value of none.
   */
  // -beg- preserve=no 3C71660501A6 var33DD6F5903A2 "AGGREGATE"
  public static final int AGGREGATE = 2;
  // -end- 3C71660501A6 var33DD6F5903A2 "AGGREGATE"

  /** The end is a composite; therefore, the other end is a part and musthave the aggregation value of none.
   */
  // -beg- preserve=no 3C716608007E var33DD6F5903A2 "COMPOSITE"
  public static final int COMPOSITE = 3;
  // -end- 3C716608007E var33DD6F5903A2 "COMPOSITE"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33DD6F5903A2 detail_end "AggregationKind"

  // -end- 33DD6F5903A2 detail_end "AggregationKind"

}

=======
/**
 * An enumeration that denotes what kind of aggregation an Association is.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:43 $
 */
public interface AggregationKind extends java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 33DD6F5903A2 detail_begin "AggregationKind"

	// -end- 33DD6F5903A2 detail_begin "AggregationKind"

	/**
	 * The end is not an aggregate.
	 */
	// -beg- preserve=no 3C7166020151 var33DD6F5903A2 "NONE"
	public static final int NONE = 1;
	// -end- 3C7166020151 var33DD6F5903A2 "NONE"

	/**
	 * The end is an aggregate; therefore, the other end is a part andmust have
	 * the aggregation value of none.
	 */
	// -beg- preserve=no 3C71660501A6 var33DD6F5903A2 "AGGREGATE"
	public static final int AGGREGATE = 2;
	// -end- 3C71660501A6 var33DD6F5903A2 "AGGREGATE"

	/**
	 * The end is a composite; therefore, the other end is a part and musthave
	 * the aggregation value of none.
	 */
	// -beg- preserve=no 3C716608007E var33DD6F5903A2 "COMPOSITE"
	public static final int COMPOSITE = 3;
	// -end- 3C716608007E var33DD6F5903A2 "COMPOSITE"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 33DD6F5903A2 detail_end "AggregationKind"

	// -end- 33DD6F5903A2 detail_end "AggregationKind"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
