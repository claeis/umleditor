// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:54 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3288E55B03DE package "ActionSequence"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 3288E55B03DE package "ActionSequence"

<<<<<<< HEAD
=======
import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -beg- preserve=no 3288E55B03DE autoimport "ActionSequence"
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
// -end- 3288E55B03DE autoimport "ActionSequence"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3288E55B03DE import "ActionSequence"

// -end- 3288E55B03DE import "ActionSequence"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:54 $
 */
<<<<<<< HEAD
public interface ActionSequence extends Action , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3288E55B03DE detail_begin "ActionSequence"

  // -end- 3288E55B03DE detail_begin "ActionSequence"

  /** add a Action.
   *  
   *  @see #removeAction
   *  @see #containsAction
   *  @see #iteratorAction
   *  @see #clearAction
   *  @see #sizeAction
   */
  // -beg- preserve=no 363555210064 add_head3288E55B03DE "ActionSequence::addAction"
  public void addAction(Action action1)
  // -end- 363555210064 add_head3288E55B03DE "ActionSequence::addAction"
    ; // empty

  // -beg- preserve=no 363555210064 add2_head3288E55B03DE "ActionSequence::add2Action"
  public void addAction(int index,Action action1)
  // -end- 363555210064 add2_head3288E55B03DE "ActionSequence::add2Action"
    ; // empty

  /** disconnect a Action.
   *  @see #addAction
   */
  // -beg- preserve=no 363555210064 remove_head3288E55B03DE "ActionSequence::removeAction"
  public Action removeAction(Action action1)
  // -end- 363555210064 remove_head3288E55B03DE "ActionSequence::removeAction"
    ; // empty

  /** disconnect a Action.
   *  @see #addAction
   */
  // -beg- preserve=no 363555210064 remove2_head3288E55B03DE "ActionSequence::remove2Action"
  public Action removeAction(int index)
  // -end- 363555210064 remove2_head3288E55B03DE "ActionSequence::remove2Action"
    ; // empty

  /** change a Action.
   *  @see #addAction
   */
  // -beg- preserve=no 363555210064 set_head3288E55B03DE "ActionSequence::setAction"
  public Action setAction(int index,Action action1)
  // -end- 363555210064 set_head3288E55B03DE "ActionSequence::setAction"
    ; // empty

  /** tests if a given Action is connected.
   *  @see #addAction
   */
  // -beg- preserve=no 363555210064 test_head3288E55B03DE "ActionSequence::containsAction"
  public boolean containsAction(Action action1)
  // -end- 363555210064 test_head3288E55B03DE "ActionSequence::containsAction"
    ; // empty

  /** used to enumerate all connected Actions.
   *  @see #addAction
   */
  // -beg- preserve=no 363555210064 get_all_head3288E55B03DE "ActionSequence::iteratorAction"
  public java.util.Iterator iteratorAction()
  // -end- 363555210064 get_all_head3288E55B03DE "ActionSequence::iteratorAction"
    ; // empty

  /** disconnect all Actions.
   *  @see #addAction
   */
  // -beg- preserve=no 363555210064 remove_all_head3288E55B03DE "ActionSequence::clearAction"
  public void clearAction()
  // -end- 363555210064 remove_all_head3288E55B03DE "ActionSequence::clearAction"
    ; // empty

  /** returns the number of Actions.
   *  @see #addAction
   */
  // -beg- preserve=no 363555210064 size_head3288E55B03DE "ActionSequence::sizeAction"
  public int sizeAction()
  // -end- 363555210064 size_head3288E55B03DE "ActionSequence::sizeAction"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 363555210064 _link_body3288E55B03DE "ActionSequence::_linkAction"
  public void _linkAction(Action action1);
  // -end- 363555210064 _link_body3288E55B03DE "ActionSequence::_linkAction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 363555210064 _unlink_body3288E55B03DE "ActionSequence::_unlinkAction"
  public void _unlinkAction(Action action1);
  // -end- 363555210064 _unlink_body3288E55B03DE "ActionSequence::_unlinkAction"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3288E55B03DE detail_end "ActionSequence"

  // -end- 3288E55B03DE detail_end "ActionSequence"

}

=======
public interface ActionSequence extends Action, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3288E55B03DE detail_begin "ActionSequence"

// -end- 3288E55B03DE detail_begin "ActionSequence"

/** add a Action.
 *
 *  @see #removeAction
 *  @see #containsAction
 *  @see #iteratorAction
 *  @see #clearAction
 *  @see #sizeAction
 */
// -beg- preserve=no 363555210064 add_head3288E55B03DE "ActionSequence::addAction"
public void addAction(Action action1)
// -end- 363555210064 add_head3288E55B03DE "ActionSequence::addAction"
;     // empty

// -beg- preserve=no 363555210064 add2_head3288E55B03DE "ActionSequence::add2Action"
public void addAction(int index,Action action1)
// -end- 363555210064 add2_head3288E55B03DE "ActionSequence::add2Action"
;     // empty

/** disconnect a Action.
 *  @see #addAction
 */
// -beg- preserve=no 363555210064 remove_head3288E55B03DE "ActionSequence::removeAction"
public Action removeAction(Action action1)
// -end- 363555210064 remove_head3288E55B03DE "ActionSequence::removeAction"
;     // empty

/** disconnect a Action.
 *  @see #addAction
 */
// -beg- preserve=no 363555210064 remove2_head3288E55B03DE "ActionSequence::remove2Action"
public Action removeAction(int index)
// -end- 363555210064 remove2_head3288E55B03DE "ActionSequence::remove2Action"
;     // empty

/** change a Action.
 *  @see #addAction
 */
// -beg- preserve=no 363555210064 set_head3288E55B03DE "ActionSequence::setAction"
public Action setAction(int index,Action action1)
// -end- 363555210064 set_head3288E55B03DE "ActionSequence::setAction"
;     // empty

/** tests if a given Action is connected.
 *  @see #addAction
 */
// -beg- preserve=no 363555210064 test_head3288E55B03DE "ActionSequence::containsAction"
public boolean containsAction(Action action1)
// -end- 363555210064 test_head3288E55B03DE "ActionSequence::containsAction"
;     // empty

/** used to enumerate all connected Actions.
 *  @see #addAction
 */
// -beg- preserve=no 363555210064 get_all_head3288E55B03DE "ActionSequence::iteratorAction"
public Iterator<?> iteratorAction()
// -end- 363555210064 get_all_head3288E55B03DE "ActionSequence::iteratorAction"
;     // empty

/** disconnect all Actions.
 *  @see #addAction
 */
// -beg- preserve=no 363555210064 remove_all_head3288E55B03DE "ActionSequence::clearAction"
public void clearAction()
// -end- 363555210064 remove_all_head3288E55B03DE "ActionSequence::clearAction"
;     // empty

/** returns the number of Actions.
 *  @see #addAction
 */
// -beg- preserve=no 363555210064 size_head3288E55B03DE "ActionSequence::sizeAction"
public int sizeAction()
// -end- 363555210064 size_head3288E55B03DE "ActionSequence::sizeAction"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 363555210064 _link_body3288E55B03DE "ActionSequence::_linkAction"
public void _linkAction(Action action1);
// -end- 363555210064 _link_body3288E55B03DE "ActionSequence::_linkAction"

/** DONT USE; link management internal
 */
// -beg- preserve=no 363555210064 _unlink_body3288E55B03DE "ActionSequence::_unlinkAction"
public void _unlinkAction(Action action1);
// -end- 363555210064 _unlink_body3288E55B03DE "ActionSequence::_unlinkAction"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3288E55B03DE detail_end "ActionSequence"

// -end- 3288E55B03DE detail_end "ActionSequence"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
