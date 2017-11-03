// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:03 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33EC13250140 package "Reception"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 33EC13250140 package "Reception"

// -beg- preserve=no 33EC13250140 autoimport "Reception"
import ch.ehi.uml1_4.foundation.core.BehavioralFeature;
import ch.ehi.uml1_4.behaviour.commonbehavior.Signal;
import ch.ehi.basics.types.NlsString;
// -end- 33EC13250140 autoimport "Reception"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33EC13250140 import "Reception"

// -end- 33EC13250140 import "Reception"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:03 $
 */
<<<<<<< HEAD
public interface Reception extends BehavioralFeature , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33EC13250140 detail_begin "Reception"

  // -end- 33EC13250140 detail_begin "Reception"

  /** attaches a Signal.
   *  
   *  @see #detachSignal
   *  @see #getSignal
   *  @see #containsSignal
   */
  // -beg- preserve=no 33FA370702F9 attach_head33EC13250140 "Reception::attachSignal"
  public void attachSignal(Signal signal1)
  // -end- 33FA370702F9 attach_head33EC13250140 "Reception::attachSignal"
    ; // empty

  /** disconnect the currently attached Signal.
   *  @see #attachSignal
   */
  // -beg- preserve=no 33FA370702F9 detach_head33EC13250140 "Reception::detachSignal"
  public Signal detachSignal()
  // -end- 33FA370702F9 detach_head33EC13250140 "Reception::detachSignal"
    ; // empty

  /** get the currently attached Signal.
   *  @see #attachSignal
   */
  // -beg- preserve=no 33FA370702F9 get_head33EC13250140 "Reception::getSignal"
  public Signal getSignal()
  // -end- 33FA370702F9 get_head33EC13250140 "Reception::getSignal"
    ; // empty

  /** tests if there is a Signal attached.
   *  @see #attachSignal
   */
  // -beg- preserve=no 33FA370702F9 test_head33EC13250140 "Reception::containsSignal"
  public boolean containsSignal()
  // -end- 33FA370702F9 test_head33EC13250140 "Reception::containsSignal"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FA370702F9 _link_body33EC13250140 "Reception::_linkSignal"
  public void _linkSignal(Signal signal1);
  // -end- 33FA370702F9 _link_body33EC13250140 "Reception::_linkSignal"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FA370702F9 _unlink_body33EC13250140 "Reception::_unlinkSignal"
  public void _unlinkSignal(Signal signal1);
  // -end- 33FA370702F9 _unlink_body33EC13250140 "Reception::_unlinkSignal"

  /** get current value of specification
   *  @see #setSpecification
   */
  // -beg- preserve=no 374201720370 get_head33EC13250140 "specification"
   NlsString getSpecification()
  // -end- 374201720370 get_head33EC13250140 "specification"
    ; // empty
  /** set current value of specification
   *  @see #getSpecification
   */
  // -beg- preserve=no 374201720370 set_head33EC13250140 "specification"
   void setSpecification(NlsString value1)
  // -end- 374201720370 set_head33EC13250140 "specification"
    ; // empty
  /** get current value of isRoot
   *  @see #setRoot
   */
  // -beg- preserve=no 3742018201A4 get_head33EC13250140 "isRoot"
   boolean isRoot()
  // -end- 3742018201A4 get_head33EC13250140 "isRoot"
    ; // empty
  /** set current value of isRoot
   *  @see #isRoot
   */
  // -beg- preserve=no 3742018201A4 set_head33EC13250140 "isRoot"
   void setRoot(boolean value1)
  // -end- 3742018201A4 set_head33EC13250140 "isRoot"
    ; // empty
  /** get current value of isLeaf
   *  @see #setLeaf
   */
  // -beg- preserve=no 37420187005A get_head33EC13250140 "isLeaf"
   boolean isLeaf()
  // -end- 37420187005A get_head33EC13250140 "isLeaf"
    ; // empty
  /** set current value of isLeaf
   *  @see #isLeaf
   */
  // -beg- preserve=no 37420187005A set_head33EC13250140 "isLeaf"
   void setLeaf(boolean value1)
  // -end- 37420187005A set_head33EC13250140 "isLeaf"
    ; // empty
  /** get current value of isAbstract
   *  @see #setAbstract
   */
  // -beg- preserve=no 374201A60122 get_head33EC13250140 "isAbstract"
   boolean isAbstract()
  // -end- 374201A60122 get_head33EC13250140 "isAbstract"
    ; // empty
  /** set current value of isAbstract
   *  @see #isAbstract
   */
  // -beg- preserve=no 374201A60122 set_head33EC13250140 "isAbstract"
   void setAbstract(boolean value1)
  // -end- 374201A60122 set_head33EC13250140 "isAbstract"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33EC13250140 detail_end "Reception"

  // -end- 33EC13250140 detail_end "Reception"

}

=======
public interface Reception extends BehavioralFeature, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33EC13250140 detail_begin "Reception"

// -end- 33EC13250140 detail_begin "Reception"

/** attaches a Signal.
 *
 *  @see #detachSignal
 *  @see #getSignal
 *  @see #containsSignal
 */
// -beg- preserve=no 33FA370702F9 attach_head33EC13250140 "Reception::attachSignal"
public void attachSignal(Signal signal1)
// -end- 33FA370702F9 attach_head33EC13250140 "Reception::attachSignal"
;     // empty

/** disconnect the currently attached Signal.
 *  @see #attachSignal
 */
// -beg- preserve=no 33FA370702F9 detach_head33EC13250140 "Reception::detachSignal"
public Signal detachSignal()
// -end- 33FA370702F9 detach_head33EC13250140 "Reception::detachSignal"
;     // empty

/** get the currently attached Signal.
 *  @see #attachSignal
 */
// -beg- preserve=no 33FA370702F9 get_head33EC13250140 "Reception::getSignal"
public Signal getSignal()
// -end- 33FA370702F9 get_head33EC13250140 "Reception::getSignal"
;     // empty

/** tests if there is a Signal attached.
 *  @see #attachSignal
 */
// -beg- preserve=no 33FA370702F9 test_head33EC13250140 "Reception::containsSignal"
public boolean containsSignal()
// -end- 33FA370702F9 test_head33EC13250140 "Reception::containsSignal"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FA370702F9 _link_body33EC13250140 "Reception::_linkSignal"
public void _linkSignal(Signal signal1);
// -end- 33FA370702F9 _link_body33EC13250140 "Reception::_linkSignal"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FA370702F9 _unlink_body33EC13250140 "Reception::_unlinkSignal"
public void _unlinkSignal(Signal signal1);
// -end- 33FA370702F9 _unlink_body33EC13250140 "Reception::_unlinkSignal"

/** get current value of specification
 *  @see #setSpecification
 */
// -beg- preserve=no 374201720370 get_head33EC13250140 "specification"
NlsString getSpecification()
// -end- 374201720370 get_head33EC13250140 "specification"
;     // empty
/** set current value of specification
 *  @see #getSpecification
 */
// -beg- preserve=no 374201720370 set_head33EC13250140 "specification"
void setSpecification(NlsString value1)
// -end- 374201720370 set_head33EC13250140 "specification"
;     // empty
/** get current value of isRoot
 *  @see #setRoot
 */
// -beg- preserve=no 3742018201A4 get_head33EC13250140 "isRoot"
boolean isRoot()
// -end- 3742018201A4 get_head33EC13250140 "isRoot"
;     // empty
/** set current value of isRoot
 *  @see #isRoot
 */
// -beg- preserve=no 3742018201A4 set_head33EC13250140 "isRoot"
void setRoot(boolean value1)
// -end- 3742018201A4 set_head33EC13250140 "isRoot"
;     // empty
/** get current value of isLeaf
 *  @see #setLeaf
 */
// -beg- preserve=no 37420187005A get_head33EC13250140 "isLeaf"
boolean isLeaf()
// -end- 37420187005A get_head33EC13250140 "isLeaf"
;     // empty
/** set current value of isLeaf
 *  @see #isLeaf
 */
// -beg- preserve=no 37420187005A set_head33EC13250140 "isLeaf"
void setLeaf(boolean value1)
// -end- 37420187005A set_head33EC13250140 "isLeaf"
;     // empty
/** get current value of isAbstract
 *  @see #setAbstract
 */
// -beg- preserve=no 374201A60122 get_head33EC13250140 "isAbstract"
boolean isAbstract()
// -end- 374201A60122 get_head33EC13250140 "isAbstract"
;     // empty
/** set current value of isAbstract
 *  @see #isAbstract
 */
// -beg- preserve=no 374201A60122 set_head33EC13250140 "isAbstract"
void setAbstract(boolean value1)
// -end- 374201A60122 set_head33EC13250140 "isAbstract"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33EC13250140 detail_end "Reception"

// -end- 33EC13250140 detail_end "Reception"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
