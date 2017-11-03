// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:06 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3288D88401A4 package "CompositeState"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 3288D88401A4 package "CompositeState"

<<<<<<< HEAD
=======
import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -beg- preserve=no 3288D88401A4 autoimport "CompositeState"
import ch.ehi.uml1_4.behaviour.statemachines.State;
import ch.ehi.uml1_4.behaviour.statemachines.StateVertex;
// -end- 3288D88401A4 autoimport "CompositeState"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3288D88401A4 import "CompositeState"

// -end- 3288D88401A4 import "CompositeState"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:06 $
 */
<<<<<<< HEAD
public interface CompositeState extends State , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3288D88401A4 detail_begin "CompositeState"

  // -end- 3288D88401A4 detail_begin "CompositeState"

  /** add a Subvertex.
   *  
   *  @see #removeSubvertex
   *  @see #containsSubvertex
   *  @see #iteratorSubvertex
   *  @see #clearSubvertex
   *  @see #sizeSubvertex
   */
  // -beg- preserve=no 3288D8C70172 add_head3288D88401A4 "CompositeState::addSubvertex"
  public void addSubvertex(StateVertex subvertex1)
  // -end- 3288D8C70172 add_head3288D88401A4 "CompositeState::addSubvertex"
    ; // empty

  /** disconnect a Subvertex.
   *  @see #addSubvertex
   */
  // -beg- preserve=no 3288D8C70172 remove_head3288D88401A4 "CompositeState::removeSubvertex"
  public StateVertex removeSubvertex(StateVertex subvertex1)
  // -end- 3288D8C70172 remove_head3288D88401A4 "CompositeState::removeSubvertex"
    ; // empty

  /** tests if a given Subvertex is connected.
   *  @see #addSubvertex
   */
  // -beg- preserve=no 3288D8C70172 test_head3288D88401A4 "CompositeState::containsSubvertex"
  public boolean containsSubvertex(StateVertex subvertex1)
  // -end- 3288D8C70172 test_head3288D88401A4 "CompositeState::containsSubvertex"
    ; // empty

  /** used to enumerate all connected Subvertexs.
   *  @see #addSubvertex
   */
  // -beg- preserve=no 3288D8C70172 get_all_head3288D88401A4 "CompositeState::iteratorSubvertex"
  public java.util.Iterator iteratorSubvertex()
  // -end- 3288D8C70172 get_all_head3288D88401A4 "CompositeState::iteratorSubvertex"
    ; // empty

  /** disconnect all Subvertexs.
   *  @see #addSubvertex
   */
  // -beg- preserve=no 3288D8C70172 remove_all_head3288D88401A4 "CompositeState::clearSubvertex"
  public void clearSubvertex()
  // -end- 3288D8C70172 remove_all_head3288D88401A4 "CompositeState::clearSubvertex"
    ; // empty

  /** returns the number of Subvertexs.
   *  @see #addSubvertex
   */
  // -beg- preserve=no 3288D8C70172 size_head3288D88401A4 "CompositeState::sizeSubvertex"
  public int sizeSubvertex()
  // -end- 3288D8C70172 size_head3288D88401A4 "CompositeState::sizeSubvertex"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3288D8C70172 _link_body3288D88401A4 "CompositeState::_linkSubvertex"
  public void _linkSubvertex(StateVertex subvertex1);
  // -end- 3288D8C70172 _link_body3288D88401A4 "CompositeState::_linkSubvertex"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3288D8C70172 _unlink_body3288D88401A4 "CompositeState::_unlinkSubvertex"
  public void _unlinkSubvertex(StateVertex subvertex1);
  // -end- 3288D8C70172 _unlink_body3288D88401A4 "CompositeState::_unlinkSubvertex"

  /** get current value of isConcurrent
   *  @see #setConcurrent
   */
  // -beg- preserve=no 3288D8A001EA get_head3288D88401A4 "isConcurrent"
   boolean isConcurrent()
  // -end- 3288D8A001EA get_head3288D88401A4 "isConcurrent"
    ; // empty
  /** set current value of isConcurrent
   *  @see #isConcurrent
   */
  // -beg- preserve=no 3288D8A001EA set_head3288D88401A4 "isConcurrent"
   void setConcurrent(boolean value1)
  // -end- 3288D8A001EA set_head3288D88401A4 "isConcurrent"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3288D88401A4 detail_end "CompositeState"

  // -end- 3288D88401A4 detail_end "CompositeState"

}

=======
public interface CompositeState extends State, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3288D88401A4 detail_begin "CompositeState"

// -end- 3288D88401A4 detail_begin "CompositeState"

/** add a Subvertex.
 *
 *  @see #removeSubvertex
 *  @see #containsSubvertex
 *  @see #iteratorSubvertex
 *  @see #clearSubvertex
 *  @see #sizeSubvertex
 */
// -beg- preserve=no 3288D8C70172 add_head3288D88401A4 "CompositeState::addSubvertex"
public void addSubvertex(StateVertex subvertex1)
// -end- 3288D8C70172 add_head3288D88401A4 "CompositeState::addSubvertex"
;     // empty

/** disconnect a Subvertex.
 *  @see #addSubvertex
 */
// -beg- preserve=no 3288D8C70172 remove_head3288D88401A4 "CompositeState::removeSubvertex"
public StateVertex removeSubvertex(StateVertex subvertex1)
// -end- 3288D8C70172 remove_head3288D88401A4 "CompositeState::removeSubvertex"
;     // empty

/** tests if a given Subvertex is connected.
 *  @see #addSubvertex
 */
// -beg- preserve=no 3288D8C70172 test_head3288D88401A4 "CompositeState::containsSubvertex"
public boolean containsSubvertex(StateVertex subvertex1)
// -end- 3288D8C70172 test_head3288D88401A4 "CompositeState::containsSubvertex"
;     // empty

/** used to enumerate all connected Subvertexs.
 *  @see #addSubvertex
 */
// -beg- preserve=no 3288D8C70172 get_all_head3288D88401A4 "CompositeState::iteratorSubvertex"
public Iterator<?> iteratorSubvertex()
// -end- 3288D8C70172 get_all_head3288D88401A4 "CompositeState::iteratorSubvertex"
;     // empty

/** disconnect all Subvertexs.
 *  @see #addSubvertex
 */
// -beg- preserve=no 3288D8C70172 remove_all_head3288D88401A4 "CompositeState::clearSubvertex"
public void clearSubvertex()
// -end- 3288D8C70172 remove_all_head3288D88401A4 "CompositeState::clearSubvertex"
;     // empty

/** returns the number of Subvertexs.
 *  @see #addSubvertex
 */
// -beg- preserve=no 3288D8C70172 size_head3288D88401A4 "CompositeState::sizeSubvertex"
public int sizeSubvertex()
// -end- 3288D8C70172 size_head3288D88401A4 "CompositeState::sizeSubvertex"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288D8C70172 _link_body3288D88401A4 "CompositeState::_linkSubvertex"
public void _linkSubvertex(StateVertex subvertex1);
// -end- 3288D8C70172 _link_body3288D88401A4 "CompositeState::_linkSubvertex"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3288D8C70172 _unlink_body3288D88401A4 "CompositeState::_unlinkSubvertex"
public void _unlinkSubvertex(StateVertex subvertex1);
// -end- 3288D8C70172 _unlink_body3288D88401A4 "CompositeState::_unlinkSubvertex"

/** get current value of isConcurrent
 *  @see #setConcurrent
 */
// -beg- preserve=no 3288D8A001EA get_head3288D88401A4 "isConcurrent"
boolean isConcurrent()
// -end- 3288D8A001EA get_head3288D88401A4 "isConcurrent"
;     // empty
/** set current value of isConcurrent
 *  @see #isConcurrent
 */
// -beg- preserve=no 3288D8A001EA set_head3288D88401A4 "isConcurrent"
void setConcurrent(boolean value1)
// -end- 3288D8A001EA set_head3288D88401A4 "isConcurrent"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3288D88401A4 detail_end "CompositeState"

// -end- 3288D88401A4 detail_end "CompositeState"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
