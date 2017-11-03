// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:14 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 35FDD6900154 package "Include"
package ch.ehi.uml1_4.behaviour.usecases;
// -end- 35FDD6900154 package "Include"

// -beg- preserve=no 35FDD6900154 autoimport "Include"
import ch.ehi.uml1_4.foundation.core.Relationship;
import ch.ehi.uml1_4.behaviour.usecases.UseCase;
// -end- 35FDD6900154 autoimport "Include"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 35FDD6900154 import "Include"

// -end- 35FDD6900154 import "Include"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:14 $
 */
<<<<<<< HEAD
public interface Include extends Relationship , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 35FDD6900154 detail_begin "Include"

  // -end- 35FDD6900154 detail_begin "Include"

  /** attaches a Addition.
   *  
   *  @see #detachAddition
   *  @see #getAddition
   *  @see #containsAddition
   */
  // -beg- preserve=no 35FDD995038E attach_head35FDD6900154 "Include::attachAddition"
  public void attachAddition(UseCase addition1)
  // -end- 35FDD995038E attach_head35FDD6900154 "Include::attachAddition"
    ; // empty

  /** disconnect the currently attached Addition.
   *  @see #attachAddition
   */
  // -beg- preserve=no 35FDD995038E detach_head35FDD6900154 "Include::detachAddition"
  public UseCase detachAddition()
  // -end- 35FDD995038E detach_head35FDD6900154 "Include::detachAddition"
    ; // empty

  /** get the currently attached Addition.
   *  @see #attachAddition
   */
  // -beg- preserve=no 35FDD995038E get_head35FDD6900154 "Include::getAddition"
  public UseCase getAddition()
  // -end- 35FDD995038E get_head35FDD6900154 "Include::getAddition"
    ; // empty

  /** tests if there is a Addition attached.
   *  @see #attachAddition
   */
  // -beg- preserve=no 35FDD995038E test_head35FDD6900154 "Include::containsAddition"
  public boolean containsAddition()
  // -end- 35FDD995038E test_head35FDD6900154 "Include::containsAddition"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD995038E _link_body35FDD6900154 "Include::_linkAddition"
  public void _linkAddition(UseCase addition1);
  // -end- 35FDD995038E _link_body35FDD6900154 "Include::_linkAddition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD995038E _unlink_body35FDD6900154 "Include::_unlinkAddition"
  public void _unlinkAddition(UseCase addition1);
  // -end- 35FDD995038E _unlink_body35FDD6900154 "Include::_unlinkAddition"

  /** attaches a Base.
   *  
   *  @see #detachBase
   *  @see #getBase
   *  @see #containsBase
   */
  // -beg- preserve=no 35FDD9A50046 attach_head35FDD6900154 "Include::attachBase"
  public void attachBase(UseCase base1)
  // -end- 35FDD9A50046 attach_head35FDD6900154 "Include::attachBase"
    ; // empty

  /** disconnect the currently attached Base.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD9A50046 detach_head35FDD6900154 "Include::detachBase"
  public UseCase detachBase()
  // -end- 35FDD9A50046 detach_head35FDD6900154 "Include::detachBase"
    ; // empty

  /** get the currently attached Base.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD9A50046 get_head35FDD6900154 "Include::getBase"
  public UseCase getBase()
  // -end- 35FDD9A50046 get_head35FDD6900154 "Include::getBase"
    ; // empty

  /** tests if there is a Base attached.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD9A50046 test_head35FDD6900154 "Include::containsBase"
  public boolean containsBase()
  // -end- 35FDD9A50046 test_head35FDD6900154 "Include::containsBase"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD9A50046 _link_body35FDD6900154 "Include::_linkBase"
  public void _linkBase(UseCase base1);
  // -end- 35FDD9A50046 _link_body35FDD6900154 "Include::_linkBase"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD9A50046 _unlink_body35FDD6900154 "Include::_unlinkBase"
  public void _unlinkBase(UseCase base1);
  // -end- 35FDD9A50046 _unlink_body35FDD6900154 "Include::_unlinkBase"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 35FDD6900154 detail_end "Include"

  // -end- 35FDD6900154 detail_end "Include"

}

=======
public interface Include extends Relationship, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 35FDD6900154 detail_begin "Include"

// -end- 35FDD6900154 detail_begin "Include"

/** attaches a Addition.
 *
 *  @see #detachAddition
 *  @see #getAddition
 *  @see #containsAddition
 */
// -beg- preserve=no 35FDD995038E attach_head35FDD6900154 "Include::attachAddition"
public void attachAddition(UseCase addition1)
// -end- 35FDD995038E attach_head35FDD6900154 "Include::attachAddition"
;     // empty

/** disconnect the currently attached Addition.
 *  @see #attachAddition
 */
// -beg- preserve=no 35FDD995038E detach_head35FDD6900154 "Include::detachAddition"
public UseCase detachAddition()
// -end- 35FDD995038E detach_head35FDD6900154 "Include::detachAddition"
;     // empty

/** get the currently attached Addition.
 *  @see #attachAddition
 */
// -beg- preserve=no 35FDD995038E get_head35FDD6900154 "Include::getAddition"
public UseCase getAddition()
// -end- 35FDD995038E get_head35FDD6900154 "Include::getAddition"
;     // empty

/** tests if there is a Addition attached.
 *  @see #attachAddition
 */
// -beg- preserve=no 35FDD995038E test_head35FDD6900154 "Include::containsAddition"
public boolean containsAddition()
// -end- 35FDD995038E test_head35FDD6900154 "Include::containsAddition"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 35FDD995038E _link_body35FDD6900154 "Include::_linkAddition"
public void _linkAddition(UseCase addition1);
// -end- 35FDD995038E _link_body35FDD6900154 "Include::_linkAddition"

/** DONT USE; link management internal
 */
// -beg- preserve=no 35FDD995038E _unlink_body35FDD6900154 "Include::_unlinkAddition"
public void _unlinkAddition(UseCase addition1);
// -end- 35FDD995038E _unlink_body35FDD6900154 "Include::_unlinkAddition"

/** attaches a Base.
 *
 *  @see #detachBase
 *  @see #getBase
 *  @see #containsBase
 */
// -beg- preserve=no 35FDD9A50046 attach_head35FDD6900154 "Include::attachBase"
public void attachBase(UseCase base1)
// -end- 35FDD9A50046 attach_head35FDD6900154 "Include::attachBase"
;     // empty

/** disconnect the currently attached Base.
 *  @see #attachBase
 */
// -beg- preserve=no 35FDD9A50046 detach_head35FDD6900154 "Include::detachBase"
public UseCase detachBase()
// -end- 35FDD9A50046 detach_head35FDD6900154 "Include::detachBase"
;     // empty

/** get the currently attached Base.
 *  @see #attachBase
 */
// -beg- preserve=no 35FDD9A50046 get_head35FDD6900154 "Include::getBase"
public UseCase getBase()
// -end- 35FDD9A50046 get_head35FDD6900154 "Include::getBase"
;     // empty

/** tests if there is a Base attached.
 *  @see #attachBase
 */
// -beg- preserve=no 35FDD9A50046 test_head35FDD6900154 "Include::containsBase"
public boolean containsBase()
// -end- 35FDD9A50046 test_head35FDD6900154 "Include::containsBase"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 35FDD9A50046 _link_body35FDD6900154 "Include::_linkBase"
public void _linkBase(UseCase base1);
// -end- 35FDD9A50046 _link_body35FDD6900154 "Include::_linkBase"

/** DONT USE; link management internal
 */
// -beg- preserve=no 35FDD9A50046 _unlink_body35FDD6900154 "Include::_unlinkBase"
public void _unlinkBase(UseCase base1);
// -end- 35FDD9A50046 _unlink_body35FDD6900154 "Include::_unlinkBase"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 35FDD6900154 detail_end "Include"

// -end- 35FDD6900154 detail_end "Include"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
