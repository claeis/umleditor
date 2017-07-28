// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:40 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327BB68C0398 package "Operation"
package ch.ehi.uml1_4.foundation.core;
// -end- 327BB68C0398 package "Operation"

// -beg- preserve=no 327BB68C0398 autoimport "Operation"
import ch.ehi.uml1_4.foundation.core.BehavioralFeature;
import ch.ehi.uml1_4.behaviour.commonbehavior.CallAction;
import ch.ehi.uml1_4.behaviour.statemachines.CallEvent;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.foundation.core.Method;
import ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind;
import ch.ehi.basics.types.NlsString;
// -end- 327BB68C0398 autoimport "Operation"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327BB68C0398 import "Operation"

// -end- 327BB68C0398 import "Operation"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:40 $
 */
public interface Operation extends BehavioralFeature, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327BB68C0398 detail_begin "Operation"

// -end- 327BB68C0398 detail_begin "Operation"

/** add a CallAction.
 *
 *  @see #removeCallAction
 *  @see #containsCallAction
 *  @see #iteratorCallAction
 *  @see #clearCallAction
 *  @see #sizeCallAction
 */
// -beg- preserve=no 336991630064 add_head327BB68C0398 "Operation::addCallAction"
public void addCallAction(CallAction callAction1)
// -end- 336991630064 add_head327BB68C0398 "Operation::addCallAction"
;     // empty

/** disconnect a CallAction.
 *  @see #addCallAction
 */
// -beg- preserve=no 336991630064 remove_head327BB68C0398 "Operation::removeCallAction"
public CallAction removeCallAction(CallAction callAction1)
// -end- 336991630064 remove_head327BB68C0398 "Operation::removeCallAction"
;     // empty

/** tests if a given CallAction is connected.
 *  @see #addCallAction
 */
// -beg- preserve=no 336991630064 test_head327BB68C0398 "Operation::containsCallAction"
public boolean containsCallAction(CallAction callAction1)
// -end- 336991630064 test_head327BB68C0398 "Operation::containsCallAction"
;     // empty

/** used to enumerate all connected CallActions.
 *  @see #addCallAction
 */
// -beg- preserve=no 336991630064 get_all_head327BB68C0398 "Operation::iteratorCallAction"
public java.util.Iterator iteratorCallAction()
// -end- 336991630064 get_all_head327BB68C0398 "Operation::iteratorCallAction"
;     // empty

/** disconnect all CallActions.
 *  @see #addCallAction
 */
// -beg- preserve=no 336991630064 remove_all_head327BB68C0398 "Operation::clearCallAction"
public void clearCallAction()
// -end- 336991630064 remove_all_head327BB68C0398 "Operation::clearCallAction"
;     // empty

/** returns the number of CallActions.
 *  @see #addCallAction
 */
// -beg- preserve=no 336991630064 size_head327BB68C0398 "Operation::sizeCallAction"
public int sizeCallAction()
// -end- 336991630064 size_head327BB68C0398 "Operation::sizeCallAction"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 336991630064 _link_body327BB68C0398 "Operation::_linkCallAction"
public void _linkCallAction(CallAction callAction1);
// -end- 336991630064 _link_body327BB68C0398 "Operation::_linkCallAction"

/** DONT USE; link management internal
 */
// -beg- preserve=no 336991630064 _unlink_body327BB68C0398 "Operation::_unlinkCallAction"
public void _unlinkCallAction(CallAction callAction1);
// -end- 336991630064 _unlink_body327BB68C0398 "Operation::_unlinkCallAction"

/** add a Occurrence.
 *
 *  @see #removeOccurrence
 *  @see #containsOccurrence
 *  @see #iteratorOccurrence
 *  @see #clearOccurrence
 *  @see #sizeOccurrence
 */
// -beg- preserve=no 32B598450001 add_head327BB68C0398 "Operation::addOccurrence"
public void addOccurrence(CallEvent occurrence1)
// -end- 32B598450001 add_head327BB68C0398 "Operation::addOccurrence"
;     // empty

/** disconnect a Occurrence.
 *  @see #addOccurrence
 */
// -beg- preserve=no 32B598450001 remove_head327BB68C0398 "Operation::removeOccurrence"
public CallEvent removeOccurrence(CallEvent occurrence1)
// -end- 32B598450001 remove_head327BB68C0398 "Operation::removeOccurrence"
;     // empty

/** tests if a given Occurrence is connected.
 *  @see #addOccurrence
 */
// -beg- preserve=no 32B598450001 test_head327BB68C0398 "Operation::containsOccurrence"
public boolean containsOccurrence(CallEvent occurrence1)
// -end- 32B598450001 test_head327BB68C0398 "Operation::containsOccurrence"
;     // empty

/** used to enumerate all connected Occurrences.
 *  @see #addOccurrence
 */
// -beg- preserve=no 32B598450001 get_all_head327BB68C0398 "Operation::iteratorOccurrence"
public java.util.Iterator iteratorOccurrence()
// -end- 32B598450001 get_all_head327BB68C0398 "Operation::iteratorOccurrence"
;     // empty

/** disconnect all Occurrences.
 *  @see #addOccurrence
 */
// -beg- preserve=no 32B598450001 remove_all_head327BB68C0398 "Operation::clearOccurrence"
public void clearOccurrence()
// -end- 32B598450001 remove_all_head327BB68C0398 "Operation::clearOccurrence"
;     // empty

/** returns the number of Occurrences.
 *  @see #addOccurrence
 */
// -beg- preserve=no 32B598450001 size_head327BB68C0398 "Operation::sizeOccurrence"
public int sizeOccurrence()
// -end- 32B598450001 size_head327BB68C0398 "Operation::sizeOccurrence"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B598450001 _link_body327BB68C0398 "Operation::_linkOccurrence"
public void _linkOccurrence(CallEvent occurrence1);
// -end- 32B598450001 _link_body327BB68C0398 "Operation::_linkOccurrence"

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B598450001 _unlink_body327BB68C0398 "Operation::_unlinkOccurrence"
public void _unlinkOccurrence(CallEvent occurrence1);
// -end- 32B598450001 _unlink_body327BB68C0398 "Operation::_unlinkOccurrence"

/** add a Collaboration.
 *
 *  @see #removeCollaboration
 *  @see #containsCollaboration
 *  @see #iteratorCollaboration
 *  @see #clearCollaboration
 *  @see #sizeCollaboration
 */
// -beg- preserve=no 33D1394E029F add_head327BB68C0398 "ModelElement::addCollaboration"
public void addCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F add_head327BB68C0398 "ModelElement::addCollaboration"
;     // empty

/** disconnect a Collaboration.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_head327BB68C0398 "ModelElement::removeCollaboration"
public Collaboration removeCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F remove_head327BB68C0398 "ModelElement::removeCollaboration"
;     // empty

/** tests if a given Collaboration is connected.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F test_head327BB68C0398 "ModelElement::containsCollaboration"
public boolean containsCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F test_head327BB68C0398 "ModelElement::containsCollaboration"
;     // empty

/** used to enumerate all connected Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F get_all_head327BB68C0398 "ModelElement::iteratorCollaboration"
public java.util.Iterator iteratorCollaboration()
// -end- 33D1394E029F get_all_head327BB68C0398 "ModelElement::iteratorCollaboration"
;     // empty

/** disconnect all Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_all_head327BB68C0398 "ModelElement::clearCollaboration"
public void clearCollaboration()
// -end- 33D1394E029F remove_all_head327BB68C0398 "ModelElement::clearCollaboration"
;     // empty

/** returns the number of Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F size_head327BB68C0398 "ModelElement::sizeCollaboration"
public int sizeCollaboration()
// -end- 33D1394E029F size_head327BB68C0398 "ModelElement::sizeCollaboration"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _link_body327BB68C0398 "ModelElement::_linkCollaboration"
public void _linkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _link_body327BB68C0398 "ModelElement::_linkCollaboration"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _unlink_body327BB68C0398 "ModelElement::_unlinkCollaboration"
public void _unlinkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _unlink_body327BB68C0398 "ModelElement::_unlinkCollaboration"

/** add a Method.
 *
 *  @see #removeMethod
 *  @see #containsMethod
 *  @see #iteratorMethod
 *  @see #clearMethod
 *  @see #sizeMethod
 */
// -beg- preserve=no 32B6D9BE00C8 add_head327BB68C0398 "Operation::addMethod"
public void addMethod(Method method1)
// -end- 32B6D9BE00C8 add_head327BB68C0398 "Operation::addMethod"
;     // empty

/** disconnect a Method.
 *  @see #addMethod
 */
// -beg- preserve=no 32B6D9BE00C8 remove_head327BB68C0398 "Operation::removeMethod"
public Method removeMethod(Method method1)
// -end- 32B6D9BE00C8 remove_head327BB68C0398 "Operation::removeMethod"
;     // empty

/** tests if a given Method is connected.
 *  @see #addMethod
 */
// -beg- preserve=no 32B6D9BE00C8 test_head327BB68C0398 "Operation::containsMethod"
public boolean containsMethod(Method method1)
// -end- 32B6D9BE00C8 test_head327BB68C0398 "Operation::containsMethod"
;     // empty

/** used to enumerate all connected Methods.
 *  @see #addMethod
 */
// -beg- preserve=no 32B6D9BE00C8 get_all_head327BB68C0398 "Operation::iteratorMethod"
public java.util.Iterator iteratorMethod()
// -end- 32B6D9BE00C8 get_all_head327BB68C0398 "Operation::iteratorMethod"
;     // empty

/** disconnect all Methods.
 *  @see #addMethod
 */
// -beg- preserve=no 32B6D9BE00C8 remove_all_head327BB68C0398 "Operation::clearMethod"
public void clearMethod()
// -end- 32B6D9BE00C8 remove_all_head327BB68C0398 "Operation::clearMethod"
;     // empty

/** returns the number of Methods.
 *  @see #addMethod
 */
// -beg- preserve=no 32B6D9BE00C8 size_head327BB68C0398 "Operation::sizeMethod"
public int sizeMethod()
// -end- 32B6D9BE00C8 size_head327BB68C0398 "Operation::sizeMethod"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B6D9BE00C8 _link_body327BB68C0398 "Operation::_linkMethod"
public void _linkMethod(Method method1);
// -end- 32B6D9BE00C8 _link_body327BB68C0398 "Operation::_linkMethod"

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B6D9BE00C8 _unlink_body327BB68C0398 "Operation::_unlinkMethod"
public void _unlinkMethod(Method method1);
// -end- 32B6D9BE00C8 _unlink_body327BB68C0398 "Operation::_unlinkMethod"

/** get current value of concurrency
 *  @see ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind
 *  @see #setConcurrency
 */
// -beg- preserve=no 33F0E99F0230 get_head327BB68C0398 "concurrency"
int getConcurrency()
// -end- 33F0E99F0230 get_head327BB68C0398 "concurrency"
;     // empty
/** set current value of concurrency
 *  @see ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind
 *  @see #getConcurrency
 */
// -beg- preserve=no 33F0E99F0230 set_head327BB68C0398 "concurrency"
void setConcurrency(int value1)
// -end- 33F0E99F0230 set_head327BB68C0398 "concurrency"
;     // empty
/** get current value of isRoot
 *  @see #setRoot
 */
// -beg- preserve=no 3627CF1A035C get_head327BB68C0398 "isRoot"
boolean isRoot()
// -end- 3627CF1A035C get_head327BB68C0398 "isRoot"
;     // empty
/** set current value of isRoot
 *  @see #isRoot
 */
// -beg- preserve=no 3627CF1A035C set_head327BB68C0398 "isRoot"
void setRoot(boolean value1)
// -end- 3627CF1A035C set_head327BB68C0398 "isRoot"
;     // empty
/** get current value of isLeaf
 *  @see #setLeaf
 */
// -beg- preserve=no 3627CF2301AE get_head327BB68C0398 "isLeaf"
boolean isLeaf()
// -end- 3627CF2301AE get_head327BB68C0398 "isLeaf"
;     // empty
/** set current value of isLeaf
 *  @see #isLeaf
 */
// -beg- preserve=no 3627CF2301AE set_head327BB68C0398 "isLeaf"
void setLeaf(boolean value1)
// -end- 3627CF2301AE set_head327BB68C0398 "isLeaf"
;     // empty
/** get current value of isAbstract
 *  @see #setAbstract
 */
// -beg- preserve=no 3627CF2B030C get_head327BB68C0398 "isAbstract"
boolean isAbstract()
// -end- 3627CF2B030C get_head327BB68C0398 "isAbstract"
;     // empty
/** set current value of isAbstract
 *  @see #isAbstract
 */
// -beg- preserve=no 3627CF2B030C set_head327BB68C0398 "isAbstract"
void setAbstract(boolean value1)
// -end- 3627CF2B030C set_head327BB68C0398 "isAbstract"
;     // empty
/** get current value of specification
 *  @see #setSpecification
 */
// -beg- preserve=no 33EC14D000FA get_head327BB68C0398 "specification"
NlsString getSpecification()
// -end- 33EC14D000FA get_head327BB68C0398 "specification"
;     // empty
/** set current value of specification
 *  @see #getSpecification
 */
// -beg- preserve=no 33EC14D000FA set_head327BB68C0398 "specification"
void setSpecification(NlsString value1)
// -end- 33EC14D000FA set_head327BB68C0398 "specification"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327BB68C0398 detail_end "Operation"

// -end- 327BB68C0398 detail_end "Operation"

}
