// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:56 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 364B657E03CA package "ComponentInstance"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 364B657E03CA package "ComponentInstance"

<<<<<<< HEAD
=======
import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -beg- preserve=no 364B657E03CA autoimport "ComponentInstance"
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.NodeInstance;
// -end- 364B657E03CA autoimport "ComponentInstance"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 364B657E03CA import "ComponentInstance"

// -end- 364B657E03CA import "ComponentInstance"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:56 $
 */
<<<<<<< HEAD
public interface ComponentInstance extends Instance , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 364B657E03CA detail_begin "ComponentInstance"

  // -end- 364B657E03CA detail_begin "ComponentInstance"

  /** attaches a NodeInstance.
   *  
   *  @see #detachNodeInstance
   *  @see #getNodeInstance
   *  @see #containsNodeInstance
   */
  // -beg- preserve=no 364B65E50122 attach_head364B657E03CA "ComponentInstance::attachNodeInstance"
  public void attachNodeInstance(NodeInstance nodeInstance1)
  // -end- 364B65E50122 attach_head364B657E03CA "ComponentInstance::attachNodeInstance"
    ; // empty

  /** disconnect the currently attached NodeInstance.
   *  @see #attachNodeInstance
   */
  // -beg- preserve=no 364B65E50122 detach_head364B657E03CA "ComponentInstance::detachNodeInstance"
  public NodeInstance detachNodeInstance()
  // -end- 364B65E50122 detach_head364B657E03CA "ComponentInstance::detachNodeInstance"
    ; // empty

  /** get the currently attached NodeInstance.
   *  @see #attachNodeInstance
   */
  // -beg- preserve=no 364B65E50122 get_head364B657E03CA "ComponentInstance::getNodeInstance"
  public NodeInstance getNodeInstance()
  // -end- 364B65E50122 get_head364B657E03CA "ComponentInstance::getNodeInstance"
    ; // empty

  /** tests if there is a NodeInstance attached.
   *  @see #attachNodeInstance
   */
  // -beg- preserve=no 364B65E50122 test_head364B657E03CA "ComponentInstance::containsNodeInstance"
  public boolean containsNodeInstance()
  // -end- 364B65E50122 test_head364B657E03CA "ComponentInstance::containsNodeInstance"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364B65E50122 _link_body364B657E03CA "ComponentInstance::_linkNodeInstance"
  public void _linkNodeInstance(NodeInstance nodeInstance1);
  // -end- 364B65E50122 _link_body364B657E03CA "ComponentInstance::_linkNodeInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364B65E50122 _unlink_body364B657E03CA "ComponentInstance::_unlinkNodeInstance"
  public void _unlinkNodeInstance(NodeInstance nodeInstance1);
  // -end- 364B65E50122 _unlink_body364B657E03CA "ComponentInstance::_unlinkNodeInstance"

  /** add a Resident.
   *  
   *  @see #removeResident
   *  @see #containsResident
   *  @see #iteratorResident
   *  @see #clearResident
   *  @see #sizeResident
   */
  // -beg- preserve=no 364B65EA0155 add_head364B657E03CA "ComponentInstance::addResident"
  public void addResident(Instance resident1)
  // -end- 364B65EA0155 add_head364B657E03CA "ComponentInstance::addResident"
    ; // empty

  /** disconnect a Resident.
   *  @see #addResident
   */
  // -beg- preserve=no 364B65EA0155 remove_head364B657E03CA "ComponentInstance::removeResident"
  public Instance removeResident(Instance resident1)
  // -end- 364B65EA0155 remove_head364B657E03CA "ComponentInstance::removeResident"
    ; // empty

  /** tests if a given Resident is connected.
   *  @see #addResident
   */
  // -beg- preserve=no 364B65EA0155 test_head364B657E03CA "ComponentInstance::containsResident"
  public boolean containsResident(Instance resident1)
  // -end- 364B65EA0155 test_head364B657E03CA "ComponentInstance::containsResident"
    ; // empty

  /** used to enumerate all connected Residents.
   *  @see #addResident
   */
  // -beg- preserve=no 364B65EA0155 get_all_head364B657E03CA "ComponentInstance::iteratorResident"
  public java.util.Iterator iteratorResident()
  // -end- 364B65EA0155 get_all_head364B657E03CA "ComponentInstance::iteratorResident"
    ; // empty

  /** disconnect all Residents.
   *  @see #addResident
   */
  // -beg- preserve=no 364B65EA0155 remove_all_head364B657E03CA "ComponentInstance::clearResident"
  public void clearResident()
  // -end- 364B65EA0155 remove_all_head364B657E03CA "ComponentInstance::clearResident"
    ; // empty

  /** returns the number of Residents.
   *  @see #addResident
   */
  // -beg- preserve=no 364B65EA0155 size_head364B657E03CA "ComponentInstance::sizeResident"
  public int sizeResident()
  // -end- 364B65EA0155 size_head364B657E03CA "ComponentInstance::sizeResident"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364B65EA0155 _link_body364B657E03CA "ComponentInstance::_linkResident"
  public void _linkResident(Instance resident1);
  // -end- 364B65EA0155 _link_body364B657E03CA "ComponentInstance::_linkResident"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 364B65EA0155 _unlink_body364B657E03CA "ComponentInstance::_unlinkResident"
  public void _unlinkResident(Instance resident1);
  // -end- 364B65EA0155 _unlink_body364B657E03CA "ComponentInstance::_unlinkResident"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 364B657E03CA detail_end "ComponentInstance"

  // -end- 364B657E03CA detail_end "ComponentInstance"

}

=======
public interface ComponentInstance extends Instance, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 364B657E03CA detail_begin "ComponentInstance"

// -end- 364B657E03CA detail_begin "ComponentInstance"

/** attaches a NodeInstance.
 *
 *  @see #detachNodeInstance
 *  @see #getNodeInstance
 *  @see #containsNodeInstance
 */
// -beg- preserve=no 364B65E50122 attach_head364B657E03CA "ComponentInstance::attachNodeInstance"
public void attachNodeInstance(NodeInstance nodeInstance1)
// -end- 364B65E50122 attach_head364B657E03CA "ComponentInstance::attachNodeInstance"
;     // empty

/** disconnect the currently attached NodeInstance.
 *  @see #attachNodeInstance
 */
// -beg- preserve=no 364B65E50122 detach_head364B657E03CA "ComponentInstance::detachNodeInstance"
public NodeInstance detachNodeInstance()
// -end- 364B65E50122 detach_head364B657E03CA "ComponentInstance::detachNodeInstance"
;     // empty

/** get the currently attached NodeInstance.
 *  @see #attachNodeInstance
 */
// -beg- preserve=no 364B65E50122 get_head364B657E03CA "ComponentInstance::getNodeInstance"
public NodeInstance getNodeInstance()
// -end- 364B65E50122 get_head364B657E03CA "ComponentInstance::getNodeInstance"
;     // empty

/** tests if there is a NodeInstance attached.
 *  @see #attachNodeInstance
 */
// -beg- preserve=no 364B65E50122 test_head364B657E03CA "ComponentInstance::containsNodeInstance"
public boolean containsNodeInstance()
// -end- 364B65E50122 test_head364B657E03CA "ComponentInstance::containsNodeInstance"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 364B65E50122 _link_body364B657E03CA "ComponentInstance::_linkNodeInstance"
public void _linkNodeInstance(NodeInstance nodeInstance1);
// -end- 364B65E50122 _link_body364B657E03CA "ComponentInstance::_linkNodeInstance"

/** DONT USE; link management internal
 */
// -beg- preserve=no 364B65E50122 _unlink_body364B657E03CA "ComponentInstance::_unlinkNodeInstance"
public void _unlinkNodeInstance(NodeInstance nodeInstance1);
// -end- 364B65E50122 _unlink_body364B657E03CA "ComponentInstance::_unlinkNodeInstance"

/** add a Resident.
 *
 *  @see #removeResident
 *  @see #containsResident
 *  @see #iteratorResident
 *  @see #clearResident
 *  @see #sizeResident
 */
// -beg- preserve=no 364B65EA0155 add_head364B657E03CA "ComponentInstance::addResident"
public void addResident(Instance resident1)
// -end- 364B65EA0155 add_head364B657E03CA "ComponentInstance::addResident"
;     // empty

/** disconnect a Resident.
 *  @see #addResident
 */
// -beg- preserve=no 364B65EA0155 remove_head364B657E03CA "ComponentInstance::removeResident"
public Instance removeResident(Instance resident1)
// -end- 364B65EA0155 remove_head364B657E03CA "ComponentInstance::removeResident"
;     // empty

/** tests if a given Resident is connected.
 *  @see #addResident
 */
// -beg- preserve=no 364B65EA0155 test_head364B657E03CA "ComponentInstance::containsResident"
public boolean containsResident(Instance resident1)
// -end- 364B65EA0155 test_head364B657E03CA "ComponentInstance::containsResident"
;     // empty

/** used to enumerate all connected Residents.
 *  @see #addResident
 */
// -beg- preserve=no 364B65EA0155 get_all_head364B657E03CA "ComponentInstance::iteratorResident"
public Iterator<?> iteratorResident()
// -end- 364B65EA0155 get_all_head364B657E03CA "ComponentInstance::iteratorResident"
;     // empty

/** disconnect all Residents.
 *  @see #addResident
 */
// -beg- preserve=no 364B65EA0155 remove_all_head364B657E03CA "ComponentInstance::clearResident"
public void clearResident()
// -end- 364B65EA0155 remove_all_head364B657E03CA "ComponentInstance::clearResident"
;     // empty

/** returns the number of Residents.
 *  @see #addResident
 */
// -beg- preserve=no 364B65EA0155 size_head364B657E03CA "ComponentInstance::sizeResident"
public int sizeResident()
// -end- 364B65EA0155 size_head364B657E03CA "ComponentInstance::sizeResident"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 364B65EA0155 _link_body364B657E03CA "ComponentInstance::_linkResident"
public void _linkResident(Instance resident1);
// -end- 364B65EA0155 _link_body364B657E03CA "ComponentInstance::_linkResident"

/** DONT USE; link management internal
 */
// -beg- preserve=no 364B65EA0155 _unlink_body364B657E03CA "ComponentInstance::_unlinkResident"
public void _unlinkResident(Instance resident1);
// -end- 364B65EA0155 _unlink_body364B657E03CA "ComponentInstance::_unlinkResident"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 364B657E03CA detail_end "ComponentInstance"

// -end- 364B657E03CA detail_end "ComponentInstance"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
