// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-03 07:58:00 $
// $Revision: 1.2 $
//

// -beg- preserve=no 33F0EC2002BC package "CallConcurrencyKind"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33F0EC2002BC package "CallConcurrencyKind"

// -beg- preserve=no 33F0EC2002BC autoimport "CallConcurrencyKind"

// -end- 33F0EC2002BC autoimport "CallConcurrencyKind"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33F0EC2002BC import "CallConcurrencyKind"

// -end- 33F0EC2002BC import "CallConcurrencyKind"

/** An enumeration that denotes the semantics of multiple concurrent calls to the same passiveinstance (i.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.2 $ $Date: 2004-03-03 07:58:00 $
 */
public interface CallConcurrencyKind extends java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F0EC2002BC detail_begin "CallConcurrencyKind"

// -end- 33F0EC2002BC detail_begin "CallConcurrencyKind"

/** Callers must coordinate so that only one call to an Instance (onany sequential Operation) may be outstanding at once.
 */
// -beg- preserve=no 40458F4202AA var33F0EC2002BC "SEQUENTIAL"
public static final int SEQUENTIAL = 1;
// -end- 40458F4202AA var33F0EC2002BC "SEQUENTIAL"

/** Multiple calls from concurrent threads may occur simultaneouslyto one Instance (on any guarded Operation), but only one isallowed to commence.
 */
// -beg- preserve=no 40458F4A030F var33F0EC2002BC "GUARDED"
public static final int GUARDED = 2;
// -end- 40458F4A030F var33F0EC2002BC "GUARDED"

/** Multiple calls from concurrent threads may occur simultaneouslyto one Instance (on any concurrent Operation).
 */
// -beg- preserve=no 40458F550347 var33F0EC2002BC "CONCURRENT"
public static final int CONCURRENT = 3;
// -end- 40458F550347 var33F0EC2002BC "CONCURRENT"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F0EC2002BC detail_end "CallConcurrencyKind"

// -end- 33F0EC2002BC detail_end "CallConcurrencyKind"

}
