// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:22 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3298BCF00260 package "BehavioralFeature"
package ch.ehi.uml1_4.foundation.core;
// -end- 3298BCF00260 package "BehavioralFeature"

// -beg- preserve=no 3298BCF00260 autoimport "BehavioralFeature"
import ch.ehi.uml1_4.foundation.core.Feature;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.commonbehavior.Signal;
import ch.ehi.uml1_4.foundation.core.Parameter;
// -end- 3298BCF00260 autoimport "BehavioralFeature"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3298BCF00260 import "BehavioralFeature"

// -end- 3298BCF00260 import "BehavioralFeature"

/** A behavioral feature refers to a dynamic feature of a model element, such as an operation ormethod.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:22 $
 */
<<<<<<< HEAD
public interface BehavioralFeature extends Feature , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3298BCF00260 detail_begin "BehavioralFeature"

  // -end- 3298BCF00260 detail_begin "BehavioralFeature"

  /** add a RaisedSignal.
   *  
   *  @see #removeRaisedSignal
   *  @see #containsRaisedSignal
   *  @see #iteratorRaisedSignal
   *  @see #clearRaisedSignal
   *  @see #sizeRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 add_head3298BCF00260 "BehavioralFeature::addRaisedSignal"
  public void addRaisedSignal(Signal raisedSignal1)
  // -end- 33FFD98400B6 add_head3298BCF00260 "BehavioralFeature::addRaisedSignal"
    ; // empty

  /** disconnect a RaisedSignal.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 remove_head3298BCF00260 "BehavioralFeature::removeRaisedSignal"
  public Signal removeRaisedSignal(Signal raisedSignal1)
  // -end- 33FFD98400B6 remove_head3298BCF00260 "BehavioralFeature::removeRaisedSignal"
    ; // empty

  /** tests if a given RaisedSignal is connected.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 test_head3298BCF00260 "BehavioralFeature::containsRaisedSignal"
  public boolean containsRaisedSignal(Signal raisedSignal1)
  // -end- 33FFD98400B6 test_head3298BCF00260 "BehavioralFeature::containsRaisedSignal"
    ; // empty

  /** used to enumerate all connected RaisedSignals.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 get_all_head3298BCF00260 "BehavioralFeature::iteratorRaisedSignal"
  public java.util.Iterator iteratorRaisedSignal()
  // -end- 33FFD98400B6 get_all_head3298BCF00260 "BehavioralFeature::iteratorRaisedSignal"
    ; // empty

  /** disconnect all RaisedSignals.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 remove_all_head3298BCF00260 "BehavioralFeature::clearRaisedSignal"
  public void clearRaisedSignal()
  // -end- 33FFD98400B6 remove_all_head3298BCF00260 "BehavioralFeature::clearRaisedSignal"
    ; // empty

  /** returns the number of RaisedSignals.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 size_head3298BCF00260 "BehavioralFeature::sizeRaisedSignal"
  public int sizeRaisedSignal()
  // -end- 33FFD98400B6 size_head3298BCF00260 "BehavioralFeature::sizeRaisedSignal"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFD98400B6 _link_body3298BCF00260 "BehavioralFeature::_linkRaisedSignal"
  public void _linkRaisedSignal(Signal raisedSignal1);
  // -end- 33FFD98400B6 _link_body3298BCF00260 "BehavioralFeature::_linkRaisedSignal"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFD98400B6 _unlink_body3298BCF00260 "BehavioralFeature::_unlinkRaisedSignal"
  public void _unlinkRaisedSignal(Signal raisedSignal1);
  // -end- 33FFD98400B6 _unlink_body3298BCF00260 "BehavioralFeature::_unlinkRaisedSignal"

  /** add a Parameter.
   *  
   *  @see #removeParameter
   *  @see #containsParameter
   *  @see #iteratorParameter
   *  @see #clearParameter
   *  @see #sizeParameter
   */
  // -beg- preserve=no 33599464017C add_head3298BCF00260 "BehavioralFeature::addParameter"
  public void addParameter(Parameter parameter1)
  // -end- 33599464017C add_head3298BCF00260 "BehavioralFeature::addParameter"
    ; // empty

  // -beg- preserve=no 33599464017C add2_head3298BCF00260 "BehavioralFeature::add2Parameter"
  public void addParameter(int index,Parameter parameter1)
  // -end- 33599464017C add2_head3298BCF00260 "BehavioralFeature::add2Parameter"
    ; // empty

  /** disconnect a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C remove_head3298BCF00260 "BehavioralFeature::removeParameter"
  public Parameter removeParameter(Parameter parameter1)
  // -end- 33599464017C remove_head3298BCF00260 "BehavioralFeature::removeParameter"
    ; // empty

  /** disconnect a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C remove2_head3298BCF00260 "BehavioralFeature::remove2Parameter"
  public Parameter removeParameter(int index)
  // -end- 33599464017C remove2_head3298BCF00260 "BehavioralFeature::remove2Parameter"
    ; // empty

  /** change a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C set_head3298BCF00260 "BehavioralFeature::setParameter"
  public Parameter setParameter(int index,Parameter parameter1)
  // -end- 33599464017C set_head3298BCF00260 "BehavioralFeature::setParameter"
    ; // empty

  /** tests if a given Parameter is connected.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C test_head3298BCF00260 "BehavioralFeature::containsParameter"
  public boolean containsParameter(Parameter parameter1)
  // -end- 33599464017C test_head3298BCF00260 "BehavioralFeature::containsParameter"
    ; // empty

  /** used to enumerate all connected Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C get_all_head3298BCF00260 "BehavioralFeature::iteratorParameter"
  public java.util.Iterator iteratorParameter()
  // -end- 33599464017C get_all_head3298BCF00260 "BehavioralFeature::iteratorParameter"
    ; // empty

  /** disconnect all Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C remove_all_head3298BCF00260 "BehavioralFeature::clearParameter"
  public void clearParameter()
  // -end- 33599464017C remove_all_head3298BCF00260 "BehavioralFeature::clearParameter"
    ; // empty

  /** returns the number of Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C size_head3298BCF00260 "BehavioralFeature::sizeParameter"
  public int sizeParameter()
  // -end- 33599464017C size_head3298BCF00260 "BehavioralFeature::sizeParameter"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33599464017C _link_body3298BCF00260 "BehavioralFeature::_linkParameter"
  public void _linkParameter(Parameter parameter1);
  // -end- 33599464017C _link_body3298BCF00260 "BehavioralFeature::_linkParameter"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33599464017C _unlink_body3298BCF00260 "BehavioralFeature::_unlinkParameter"
  public void _unlinkParameter(Parameter parameter1);
  // -end- 33599464017C _unlink_body3298BCF00260 "BehavioralFeature::_unlinkParameter"

  /** get current value of isQuery
   *  @see #setQuery
   */
  // -beg- preserve=no 335A34A3012C get_head3298BCF00260 "isQuery"
   boolean isQuery()
  // -end- 335A34A3012C get_head3298BCF00260 "isQuery"
    ; // empty
  /** set current value of isQuery
   *  @see #isQuery
   */
  // -beg- preserve=no 335A34A3012C set_head3298BCF00260 "isQuery"
   void setQuery(boolean value1)
  // -end- 335A34A3012C set_head3298BCF00260 "isQuery"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3298BCF00260 detail_end "BehavioralFeature"

  // -end- 3298BCF00260 detail_end "BehavioralFeature"

}

=======
public interface BehavioralFeature extends Feature, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3298BCF00260 detail_begin "BehavioralFeature"

// -end- 3298BCF00260 detail_begin "BehavioralFeature"

/** add a RaisedSignal.
 *
 *  @see #removeRaisedSignal
 *  @see #containsRaisedSignal
 *  @see #iteratorRaisedSignal
 *  @see #clearRaisedSignal
 *  @see #sizeRaisedSignal
 */
// -beg- preserve=no 33FFD98400B6 add_head3298BCF00260 "BehavioralFeature::addRaisedSignal"
public void addRaisedSignal(Signal raisedSignal1)
// -end- 33FFD98400B6 add_head3298BCF00260 "BehavioralFeature::addRaisedSignal"
;     // empty

/** disconnect a RaisedSignal.
 *  @see #addRaisedSignal
 */
// -beg- preserve=no 33FFD98400B6 remove_head3298BCF00260 "BehavioralFeature::removeRaisedSignal"
public Signal removeRaisedSignal(Signal raisedSignal1)
// -end- 33FFD98400B6 remove_head3298BCF00260 "BehavioralFeature::removeRaisedSignal"
;     // empty

/** tests if a given RaisedSignal is connected.
 *  @see #addRaisedSignal
 */
// -beg- preserve=no 33FFD98400B6 test_head3298BCF00260 "BehavioralFeature::containsRaisedSignal"
public boolean containsRaisedSignal(Signal raisedSignal1)
// -end- 33FFD98400B6 test_head3298BCF00260 "BehavioralFeature::containsRaisedSignal"
;     // empty

/** used to enumerate all connected RaisedSignals.
 *  @see #addRaisedSignal
 */
// -beg- preserve=no 33FFD98400B6 get_all_head3298BCF00260 "BehavioralFeature::iteratorRaisedSignal"
public Iterator<?> iteratorRaisedSignal()
// -end- 33FFD98400B6 get_all_head3298BCF00260 "BehavioralFeature::iteratorRaisedSignal"
;     // empty

/** disconnect all RaisedSignals.
 *  @see #addRaisedSignal
 */
// -beg- preserve=no 33FFD98400B6 remove_all_head3298BCF00260 "BehavioralFeature::clearRaisedSignal"
public void clearRaisedSignal()
// -end- 33FFD98400B6 remove_all_head3298BCF00260 "BehavioralFeature::clearRaisedSignal"
;     // empty

/** returns the number of RaisedSignals.
 *  @see #addRaisedSignal
 */
// -beg- preserve=no 33FFD98400B6 size_head3298BCF00260 "BehavioralFeature::sizeRaisedSignal"
public int sizeRaisedSignal()
// -end- 33FFD98400B6 size_head3298BCF00260 "BehavioralFeature::sizeRaisedSignal"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FFD98400B6 _link_body3298BCF00260 "BehavioralFeature::_linkRaisedSignal"
public void _linkRaisedSignal(Signal raisedSignal1);
// -end- 33FFD98400B6 _link_body3298BCF00260 "BehavioralFeature::_linkRaisedSignal"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FFD98400B6 _unlink_body3298BCF00260 "BehavioralFeature::_unlinkRaisedSignal"
public void _unlinkRaisedSignal(Signal raisedSignal1);
// -end- 33FFD98400B6 _unlink_body3298BCF00260 "BehavioralFeature::_unlinkRaisedSignal"

/** add a Parameter.
 *
 *  @see #removeParameter
 *  @see #containsParameter
 *  @see #iteratorParameter
 *  @see #clearParameter
 *  @see #sizeParameter
 */
// -beg- preserve=no 33599464017C add_head3298BCF00260 "BehavioralFeature::addParameter"
public void addParameter(Parameter parameter1)
// -end- 33599464017C add_head3298BCF00260 "BehavioralFeature::addParameter"
;     // empty

// -beg- preserve=no 33599464017C add2_head3298BCF00260 "BehavioralFeature::add2Parameter"
public void addParameter(int index,Parameter parameter1)
// -end- 33599464017C add2_head3298BCF00260 "BehavioralFeature::add2Parameter"
;     // empty

/** disconnect a Parameter.
 *  @see #addParameter
 */
// -beg- preserve=no 33599464017C remove_head3298BCF00260 "BehavioralFeature::removeParameter"
public Parameter removeParameter(Parameter parameter1)
// -end- 33599464017C remove_head3298BCF00260 "BehavioralFeature::removeParameter"
;     // empty

/** disconnect a Parameter.
 *  @see #addParameter
 */
// -beg- preserve=no 33599464017C remove2_head3298BCF00260 "BehavioralFeature::remove2Parameter"
public Parameter removeParameter(int index)
// -end- 33599464017C remove2_head3298BCF00260 "BehavioralFeature::remove2Parameter"
;     // empty

/** change a Parameter.
 *  @see #addParameter
 */
// -beg- preserve=no 33599464017C set_head3298BCF00260 "BehavioralFeature::setParameter"
public Parameter setParameter(int index,Parameter parameter1)
// -end- 33599464017C set_head3298BCF00260 "BehavioralFeature::setParameter"
;     // empty

/** tests if a given Parameter is connected.
 *  @see #addParameter
 */
// -beg- preserve=no 33599464017C test_head3298BCF00260 "BehavioralFeature::containsParameter"
public boolean containsParameter(Parameter parameter1)
// -end- 33599464017C test_head3298BCF00260 "BehavioralFeature::containsParameter"
;     // empty

/** used to enumerate all connected Parameters.
 *  @see #addParameter
 */
// -beg- preserve=no 33599464017C get_all_head3298BCF00260 "BehavioralFeature::iteratorParameter"
public Iterator<?> iteratorParameter()
// -end- 33599464017C get_all_head3298BCF00260 "BehavioralFeature::iteratorParameter"
;     // empty

/** disconnect all Parameters.
 *  @see #addParameter
 */
// -beg- preserve=no 33599464017C remove_all_head3298BCF00260 "BehavioralFeature::clearParameter"
public void clearParameter()
// -end- 33599464017C remove_all_head3298BCF00260 "BehavioralFeature::clearParameter"
;     // empty

/** returns the number of Parameters.
 *  @see #addParameter
 */
// -beg- preserve=no 33599464017C size_head3298BCF00260 "BehavioralFeature::sizeParameter"
public int sizeParameter()
// -end- 33599464017C size_head3298BCF00260 "BehavioralFeature::sizeParameter"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33599464017C _link_body3298BCF00260 "BehavioralFeature::_linkParameter"
public void _linkParameter(Parameter parameter1);
// -end- 33599464017C _link_body3298BCF00260 "BehavioralFeature::_linkParameter"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33599464017C _unlink_body3298BCF00260 "BehavioralFeature::_unlinkParameter"
public void _unlinkParameter(Parameter parameter1);
// -end- 33599464017C _unlink_body3298BCF00260 "BehavioralFeature::_unlinkParameter"

/** get current value of isQuery
 *  @see #setQuery
 */
// -beg- preserve=no 335A34A3012C get_head3298BCF00260 "isQuery"
boolean isQuery()
// -end- 335A34A3012C get_head3298BCF00260 "isQuery"
;     // empty
/** set current value of isQuery
 *  @see #isQuery
 */
// -beg- preserve=no 335A34A3012C set_head3298BCF00260 "isQuery"
void setQuery(boolean value1)
// -end- 335A34A3012C set_head3298BCF00260 "isQuery"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3298BCF00260 detail_end "BehavioralFeature"

// -end- 3298BCF00260 detail_end "BehavioralFeature"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
