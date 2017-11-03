// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:57 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33CAD65D0370 package "CreateAction"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 33CAD65D0370 package "CreateAction"

// -beg- preserve=no 33CAD65D0370 autoimport "CreateAction"
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
import ch.ehi.uml1_4.foundation.core.Classifier;
// -end- 33CAD65D0370 autoimport "CreateAction"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33CAD65D0370 import "CreateAction"

// -end- 33CAD65D0370 import "CreateAction"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:57 $
 */
<<<<<<< HEAD
public interface CreateAction extends Action , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33CAD65D0370 detail_begin "CreateAction"

  // -end- 33CAD65D0370 detail_begin "CreateAction"

  /** attaches a Instantiation.
   *  
   *  @see #detachInstantiation
   *  @see #getInstantiation
   *  @see #containsInstantiation
   */
  // -beg- preserve=no 33CFD0A70168 attach_head33CAD65D0370 "CreateAction::attachInstantiation"
  public void attachInstantiation(Classifier instantiation1)
  // -end- 33CFD0A70168 attach_head33CAD65D0370 "CreateAction::attachInstantiation"
    ; // empty

  /** disconnect the currently attached Instantiation.
   *  @see #attachInstantiation
   */
  // -beg- preserve=no 33CFD0A70168 detach_head33CAD65D0370 "CreateAction::detachInstantiation"
  public Classifier detachInstantiation()
  // -end- 33CFD0A70168 detach_head33CAD65D0370 "CreateAction::detachInstantiation"
    ; // empty

  /** get the currently attached Instantiation.
   *  @see #attachInstantiation
   */
  // -beg- preserve=no 33CFD0A70168 get_head33CAD65D0370 "CreateAction::getInstantiation"
  public Classifier getInstantiation()
  // -end- 33CFD0A70168 get_head33CAD65D0370 "CreateAction::getInstantiation"
    ; // empty

  /** tests if there is a Instantiation attached.
   *  @see #attachInstantiation
   */
  // -beg- preserve=no 33CFD0A70168 test_head33CAD65D0370 "CreateAction::containsInstantiation"
  public boolean containsInstantiation()
  // -end- 33CFD0A70168 test_head33CAD65D0370 "CreateAction::containsInstantiation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A70168 _link_body33CAD65D0370 "CreateAction::_linkInstantiation"
  public void _linkInstantiation(Classifier instantiation1);
  // -end- 33CFD0A70168 _link_body33CAD65D0370 "CreateAction::_linkInstantiation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A70168 _unlink_body33CAD65D0370 "CreateAction::_unlinkInstantiation"
  public void _unlinkInstantiation(Classifier instantiation1);
  // -end- 33CFD0A70168 _unlink_body33CAD65D0370 "CreateAction::_unlinkInstantiation"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33CAD65D0370 detail_end "CreateAction"

  // -end- 33CAD65D0370 detail_end "CreateAction"

}

=======
public interface CreateAction extends Action, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33CAD65D0370 detail_begin "CreateAction"

// -end- 33CAD65D0370 detail_begin "CreateAction"

/** attaches a Instantiation.
 *
 *  @see #detachInstantiation
 *  @see #getInstantiation
 *  @see #containsInstantiation
 */
// -beg- preserve=no 33CFD0A70168 attach_head33CAD65D0370 "CreateAction::attachInstantiation"
public void attachInstantiation(Classifier instantiation1)
// -end- 33CFD0A70168 attach_head33CAD65D0370 "CreateAction::attachInstantiation"
;     // empty

/** disconnect the currently attached Instantiation.
 *  @see #attachInstantiation
 */
// -beg- preserve=no 33CFD0A70168 detach_head33CAD65D0370 "CreateAction::detachInstantiation"
public Classifier detachInstantiation()
// -end- 33CFD0A70168 detach_head33CAD65D0370 "CreateAction::detachInstantiation"
;     // empty

/** get the currently attached Instantiation.
 *  @see #attachInstantiation
 */
// -beg- preserve=no 33CFD0A70168 get_head33CAD65D0370 "CreateAction::getInstantiation"
public Classifier getInstantiation()
// -end- 33CFD0A70168 get_head33CAD65D0370 "CreateAction::getInstantiation"
;     // empty

/** tests if there is a Instantiation attached.
 *  @see #attachInstantiation
 */
// -beg- preserve=no 33CFD0A70168 test_head33CAD65D0370 "CreateAction::containsInstantiation"
public boolean containsInstantiation()
// -end- 33CFD0A70168 test_head33CAD65D0370 "CreateAction::containsInstantiation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CFD0A70168 _link_body33CAD65D0370 "CreateAction::_linkInstantiation"
public void _linkInstantiation(Classifier instantiation1);
// -end- 33CFD0A70168 _link_body33CAD65D0370 "CreateAction::_linkInstantiation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CFD0A70168 _unlink_body33CAD65D0370 "CreateAction::_unlinkInstantiation"
public void _unlinkInstantiation(Classifier instantiation1);
// -end- 33CFD0A70168 _unlink_body33CAD65D0370 "CreateAction::_unlinkInstantiation"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33CAD65D0370 detail_end "CreateAction"

// -end- 33CAD65D0370 detail_end "CreateAction"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
