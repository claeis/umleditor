// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:41 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33CF9AB00262 package "ClassifierInState"
package ch.ehi.uml1_4.behaviour.activitygraphs;
// -end- 33CF9AB00262 package "ClassifierInState"

// -beg- preserve=no 33CF9AB00262 autoimport "ClassifierInState"
import ch.ehi.uml1_4.foundation.core.Classifier;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.statemachines.State;
// -end- 33CF9AB00262 autoimport "ClassifierInState"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33CF9AB00262 import "ClassifierInState"

// -end- 33CF9AB00262 import "ClassifierInState"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:41 $
 */
<<<<<<< HEAD
public interface ClassifierInState extends Classifier , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33CF9AB00262 detail_begin "ClassifierInState"

  // -end- 33CF9AB00262 detail_begin "ClassifierInState"

  /** add a InState.
   *  
   *  @see #removeInState
   *  @see #containsInState
   *  @see #iteratorInState
   *  @see #clearInState
   *  @see #sizeInState
   */
  // -beg- preserve=no 33CF9AE0026C add_head33CF9AB00262 "ClassifierInState::addInState"
  public void addInState(State inState1)
  // -end- 33CF9AE0026C add_head33CF9AB00262 "ClassifierInState::addInState"
    ; // empty

  /** disconnect a InState.
   *  @see #addInState
   */
  // -beg- preserve=no 33CF9AE0026C remove_head33CF9AB00262 "ClassifierInState::removeInState"
  public State removeInState(State inState1)
  // -end- 33CF9AE0026C remove_head33CF9AB00262 "ClassifierInState::removeInState"
    ; // empty

  /** tests if a given InState is connected.
   *  @see #addInState
   */
  // -beg- preserve=no 33CF9AE0026C test_head33CF9AB00262 "ClassifierInState::containsInState"
  public boolean containsInState(State inState1)
  // -end- 33CF9AE0026C test_head33CF9AB00262 "ClassifierInState::containsInState"
    ; // empty

  /** used to enumerate all connected InStates.
   *  @see #addInState
   */
  // -beg- preserve=no 33CF9AE0026C get_all_head33CF9AB00262 "ClassifierInState::iteratorInState"
  public java.util.Iterator iteratorInState()
  // -end- 33CF9AE0026C get_all_head33CF9AB00262 "ClassifierInState::iteratorInState"
    ; // empty

  /** disconnect all InStates.
   *  @see #addInState
   */
  // -beg- preserve=no 33CF9AE0026C remove_all_head33CF9AB00262 "ClassifierInState::clearInState"
  public void clearInState()
  // -end- 33CF9AE0026C remove_all_head33CF9AB00262 "ClassifierInState::clearInState"
    ; // empty

  /** returns the number of InStates.
   *  @see #addInState
   */
  // -beg- preserve=no 33CF9AE0026C size_head33CF9AB00262 "ClassifierInState::sizeInState"
  public int sizeInState()
  // -end- 33CF9AE0026C size_head33CF9AB00262 "ClassifierInState::sizeInState"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9AE0026C _link_body33CF9AB00262 "ClassifierInState::_linkInState"
  public void _linkInState(State inState1);
  // -end- 33CF9AE0026C _link_body33CF9AB00262 "ClassifierInState::_linkInState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9AE0026C _unlink_body33CF9AB00262 "ClassifierInState::_unlinkInState"
  public void _unlinkInState(State inState1);
  // -end- 33CF9AE0026C _unlink_body33CF9AB00262 "ClassifierInState::_unlinkInState"

  /** attaches a Type.
   *  
   *  @see #detachType
   *  @see #getType
   *  @see #containsType
   */
  // -beg- preserve=no 33CF9F16035C attach_head33CF9AB00262 "ClassifierInState::attachType"
  public void attachType(Classifier type1)
  // -end- 33CF9F16035C attach_head33CF9AB00262 "ClassifierInState::attachType"
    ; // empty

  /** disconnect the currently attached Type.
   *  @see #attachType
   */
  // -beg- preserve=no 33CF9F16035C detach_head33CF9AB00262 "ClassifierInState::detachType"
  public Classifier detachType()
  // -end- 33CF9F16035C detach_head33CF9AB00262 "ClassifierInState::detachType"
    ; // empty

  /** get the currently attached Type.
   *  @see #attachType
   */
  // -beg- preserve=no 33CF9F16035C get_head33CF9AB00262 "ClassifierInState::getType"
  public Classifier getType()
  // -end- 33CF9F16035C get_head33CF9AB00262 "ClassifierInState::getType"
    ; // empty

  /** tests if there is a Type attached.
   *  @see #attachType
   */
  // -beg- preserve=no 33CF9F16035C test_head33CF9AB00262 "ClassifierInState::containsType"
  public boolean containsType()
  // -end- 33CF9F16035C test_head33CF9AB00262 "ClassifierInState::containsType"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F16035C _link_body33CF9AB00262 "ClassifierInState::_linkType"
  public void _linkType(Classifier type1);
  // -end- 33CF9F16035C _link_body33CF9AB00262 "ClassifierInState::_linkType"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F16035C _unlink_body33CF9AB00262 "ClassifierInState::_unlinkType"
  public void _unlinkType(Classifier type1);
  // -end- 33CF9F16035C _unlink_body33CF9AB00262 "ClassifierInState::_unlinkType"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33CF9AB00262 detail_end "ClassifierInState"

  // -end- 33CF9AB00262 detail_end "ClassifierInState"

}

=======
public interface ClassifierInState extends Classifier, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33CF9AB00262 detail_begin "ClassifierInState"

// -end- 33CF9AB00262 detail_begin "ClassifierInState"

/** add a InState.
 *
 *  @see #removeInState
 *  @see #containsInState
 *  @see #iteratorInState
 *  @see #clearInState
 *  @see #sizeInState
 */
// -beg- preserve=no 33CF9AE0026C add_head33CF9AB00262 "ClassifierInState::addInState"
public void addInState(State inState1)
// -end- 33CF9AE0026C add_head33CF9AB00262 "ClassifierInState::addInState"
;     // empty

/** disconnect a InState.
 *  @see #addInState
 */
// -beg- preserve=no 33CF9AE0026C remove_head33CF9AB00262 "ClassifierInState::removeInState"
public State removeInState(State inState1)
// -end- 33CF9AE0026C remove_head33CF9AB00262 "ClassifierInState::removeInState"
;     // empty

/** tests if a given InState is connected.
 *  @see #addInState
 */
// -beg- preserve=no 33CF9AE0026C test_head33CF9AB00262 "ClassifierInState::containsInState"
public boolean containsInState(State inState1)
// -end- 33CF9AE0026C test_head33CF9AB00262 "ClassifierInState::containsInState"
;     // empty

/** used to enumerate all connected InStates.
 *  @see #addInState
 */
// -beg- preserve=no 33CF9AE0026C get_all_head33CF9AB00262 "ClassifierInState::iteratorInState"
public Iterator<?> iteratorInState()
// -end- 33CF9AE0026C get_all_head33CF9AB00262 "ClassifierInState::iteratorInState"
;     // empty

/** disconnect all InStates.
 *  @see #addInState
 */
// -beg- preserve=no 33CF9AE0026C remove_all_head33CF9AB00262 "ClassifierInState::clearInState"
public void clearInState()
// -end- 33CF9AE0026C remove_all_head33CF9AB00262 "ClassifierInState::clearInState"
;     // empty

/** returns the number of InStates.
 *  @see #addInState
 */
// -beg- preserve=no 33CF9AE0026C size_head33CF9AB00262 "ClassifierInState::sizeInState"
public int sizeInState()
// -end- 33CF9AE0026C size_head33CF9AB00262 "ClassifierInState::sizeInState"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9AE0026C _link_body33CF9AB00262 "ClassifierInState::_linkInState"
public void _linkInState(State inState1);
// -end- 33CF9AE0026C _link_body33CF9AB00262 "ClassifierInState::_linkInState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9AE0026C _unlink_body33CF9AB00262 "ClassifierInState::_unlinkInState"
public void _unlinkInState(State inState1);
// -end- 33CF9AE0026C _unlink_body33CF9AB00262 "ClassifierInState::_unlinkInState"

/** attaches a Type.
 *
 *  @see #detachType
 *  @see #getType
 *  @see #containsType
 */
// -beg- preserve=no 33CF9F16035C attach_head33CF9AB00262 "ClassifierInState::attachType"
public void attachType(Classifier type1)
// -end- 33CF9F16035C attach_head33CF9AB00262 "ClassifierInState::attachType"
;     // empty

/** disconnect the currently attached Type.
 *  @see #attachType
 */
// -beg- preserve=no 33CF9F16035C detach_head33CF9AB00262 "ClassifierInState::detachType"
public Classifier detachType()
// -end- 33CF9F16035C detach_head33CF9AB00262 "ClassifierInState::detachType"
;     // empty

/** get the currently attached Type.
 *  @see #attachType
 */
// -beg- preserve=no 33CF9F16035C get_head33CF9AB00262 "ClassifierInState::getType"
public Classifier getType()
// -end- 33CF9F16035C get_head33CF9AB00262 "ClassifierInState::getType"
;     // empty

/** tests if there is a Type attached.
 *  @see #attachType
 */
// -beg- preserve=no 33CF9F16035C test_head33CF9AB00262 "ClassifierInState::containsType"
public boolean containsType()
// -end- 33CF9F16035C test_head33CF9AB00262 "ClassifierInState::containsType"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9F16035C _link_body33CF9AB00262 "ClassifierInState::_linkType"
public void _linkType(Classifier type1);
// -end- 33CF9F16035C _link_body33CF9AB00262 "ClassifierInState::_linkType"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9F16035C _unlink_body33CF9AB00262 "ClassifierInState::_unlinkType"
public void _unlinkType(Classifier type1);
// -end- 33CF9F16035C _unlink_body33CF9AB00262 "ClassifierInState::_unlinkType"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33CF9AB00262 detail_end "ClassifierInState"

// -end- 33CF9AB00262 detail_end "ClassifierInState"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
