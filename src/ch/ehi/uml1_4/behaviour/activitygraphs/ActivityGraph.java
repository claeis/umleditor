// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:40 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 337D8EF301C2 package "ActivityGraph"
package ch.ehi.uml1_4.behaviour.activitygraphs;
// -end- 337D8EF301C2 package "ActivityGraph"

// -beg- preserve=no 337D8EF301C2 autoimport "ActivityGraph"
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
// -end- 337D8EF301C2 autoimport "ActivityGraph"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 337D8EF301C2 import "ActivityGraph"

// -end- 337D8EF301C2 import "ActivityGraph"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:40 $
 */
public interface ActivityGraph extends StateMachine , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 337D8EF301C2 detail_begin "ActivityGraph"

  // -end- 337D8EF301C2 detail_begin "ActivityGraph"

  /** add a Partition.
   *  
   *  @see #removePartition
   *  @see #containsPartition
   *  @see #iteratorPartition
   *  @see #clearPartition
   *  @see #sizePartition
   */
  // -beg- preserve=no 337DA56101D6 add_head337D8EF301C2 "ActivityGraph::addPartition"
  public void addPartition(Partition partition1)
  // -end- 337DA56101D6 add_head337D8EF301C2 "ActivityGraph::addPartition"
    ; // empty

  /** disconnect a Partition.
   *  @see #addPartition
   */
  // -beg- preserve=no 337DA56101D6 remove_head337D8EF301C2 "ActivityGraph::removePartition"
  public Partition removePartition(Partition partition1)
  // -end- 337DA56101D6 remove_head337D8EF301C2 "ActivityGraph::removePartition"
    ; // empty

  /** tests if a given Partition is connected.
   *  @see #addPartition
   */
  // -beg- preserve=no 337DA56101D6 test_head337D8EF301C2 "ActivityGraph::containsPartition"
  public boolean containsPartition(Partition partition1)
  // -end- 337DA56101D6 test_head337D8EF301C2 "ActivityGraph::containsPartition"
    ; // empty

  /** used to enumerate all connected Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 337DA56101D6 get_all_head337D8EF301C2 "ActivityGraph::iteratorPartition"
  public java.util.Iterator iteratorPartition()
  // -end- 337DA56101D6 get_all_head337D8EF301C2 "ActivityGraph::iteratorPartition"
    ; // empty

  /** disconnect all Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 337DA56101D6 remove_all_head337D8EF301C2 "ActivityGraph::clearPartition"
  public void clearPartition()
  // -end- 337DA56101D6 remove_all_head337D8EF301C2 "ActivityGraph::clearPartition"
    ; // empty

  /** returns the number of Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 337DA56101D6 size_head337D8EF301C2 "ActivityGraph::sizePartition"
  public int sizePartition()
  // -end- 337DA56101D6 size_head337D8EF301C2 "ActivityGraph::sizePartition"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 337DA56101D6 _link_body337D8EF301C2 "ActivityGraph::_linkPartition"
  public void _linkPartition(Partition partition1);
  // -end- 337DA56101D6 _link_body337D8EF301C2 "ActivityGraph::_linkPartition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 337DA56101D6 _unlink_body337D8EF301C2 "ActivityGraph::_unlinkPartition"
  public void _unlinkPartition(Partition partition1);
  // -end- 337DA56101D6 _unlink_body337D8EF301C2 "ActivityGraph::_unlinkPartition"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 337D8EF301C2 detail_end "ActivityGraph"

  // -end- 337D8EF301C2 detail_end "ActivityGraph"

}

