// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:42 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 337DA4DE0212 package "Partition"
package ch.ehi.uml1_4.behaviour.activitygraphs;
// -end- 337DA4DE0212 package "Partition"

// -beg- preserve=no 337DA4DE0212 autoimport "Partition"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.activitygraphs.ActivityGraph;
// -end- 337DA4DE0212 autoimport "Partition"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 337DA4DE0212 import "Partition"

// -end- 337DA4DE0212 import "Partition"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:42 $
 */
public interface Partition extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 337DA4DE0212 detail_begin "Partition"

  // -end- 337DA4DE0212 detail_begin "Partition"

  /** attaches a ActivityGraph.
   *  
   *  @see #detachActivityGraph
   *  @see #getActivityGraph
   *  @see #containsActivityGraph
   */
  // -beg- preserve=no 337DA56101D7 attach_head337DA4DE0212 "Partition::attachActivityGraph"
  public void attachActivityGraph(ActivityGraph activityGraph1)
  // -end- 337DA56101D7 attach_head337DA4DE0212 "Partition::attachActivityGraph"
    ; // empty

  /** disconnect the currently attached ActivityGraph.
   *  @see #attachActivityGraph
   */
  // -beg- preserve=no 337DA56101D7 detach_head337DA4DE0212 "Partition::detachActivityGraph"
  public ActivityGraph detachActivityGraph()
  // -end- 337DA56101D7 detach_head337DA4DE0212 "Partition::detachActivityGraph"
    ; // empty

  /** get the currently attached ActivityGraph.
   *  @see #attachActivityGraph
   */
  // -beg- preserve=no 337DA56101D7 get_head337DA4DE0212 "Partition::getActivityGraph"
  public ActivityGraph getActivityGraph()
  // -end- 337DA56101D7 get_head337DA4DE0212 "Partition::getActivityGraph"
    ; // empty

  /** tests if there is a ActivityGraph attached.
   *  @see #attachActivityGraph
   */
  // -beg- preserve=no 337DA56101D7 test_head337DA4DE0212 "Partition::containsActivityGraph"
  public boolean containsActivityGraph()
  // -end- 337DA56101D7 test_head337DA4DE0212 "Partition::containsActivityGraph"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 337DA56101D7 _link_body337DA4DE0212 "Partition::_linkActivityGraph"
  public void _linkActivityGraph(ActivityGraph activityGraph1);
  // -end- 337DA56101D7 _link_body337DA4DE0212 "Partition::_linkActivityGraph"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 337DA56101D7 _unlink_body337DA4DE0212 "Partition::_unlinkActivityGraph"
  public void _unlinkActivityGraph(ActivityGraph activityGraph1);
  // -end- 337DA56101D7 _unlink_body337DA4DE0212 "Partition::_unlinkActivityGraph"

  /** add a Contents.
   *  
   *  @see #removeContents
   *  @see #containsContents
   *  @see #iteratorContents
   *  @see #clearContents
   *  @see #sizeContents
   */
  // -beg- preserve=no 33CF9A030258 add_head337DA4DE0212 "Partition::addContents"
  public void addContents(ModelElement contents1)
  // -end- 33CF9A030258 add_head337DA4DE0212 "Partition::addContents"
    ; // empty

  /** disconnect a Contents.
   *  @see #addContents
   */
  // -beg- preserve=no 33CF9A030258 remove_head337DA4DE0212 "Partition::removeContents"
  public ModelElement removeContents(ModelElement contents1)
  // -end- 33CF9A030258 remove_head337DA4DE0212 "Partition::removeContents"
    ; // empty

  /** tests if a given Contents is connected.
   *  @see #addContents
   */
  // -beg- preserve=no 33CF9A030258 test_head337DA4DE0212 "Partition::containsContents"
  public boolean containsContents(ModelElement contents1)
  // -end- 33CF9A030258 test_head337DA4DE0212 "Partition::containsContents"
    ; // empty

  /** used to enumerate all connected Contentss.
   *  @see #addContents
   */
  // -beg- preserve=no 33CF9A030258 get_all_head337DA4DE0212 "Partition::iteratorContents"
  public java.util.Iterator iteratorContents()
  // -end- 33CF9A030258 get_all_head337DA4DE0212 "Partition::iteratorContents"
    ; // empty

  /** disconnect all Contentss.
   *  @see #addContents
   */
  // -beg- preserve=no 33CF9A030258 remove_all_head337DA4DE0212 "Partition::clearContents"
  public void clearContents()
  // -end- 33CF9A030258 remove_all_head337DA4DE0212 "Partition::clearContents"
    ; // empty

  /** returns the number of Contentss.
   *  @see #addContents
   */
  // -beg- preserve=no 33CF9A030258 size_head337DA4DE0212 "Partition::sizeContents"
  public int sizeContents()
  // -end- 33CF9A030258 size_head337DA4DE0212 "Partition::sizeContents"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9A030258 _link_body337DA4DE0212 "Partition::_linkContents"
  public void _linkContents(ModelElement contents1);
  // -end- 33CF9A030258 _link_body337DA4DE0212 "Partition::_linkContents"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9A030258 _unlink_body337DA4DE0212 "Partition::_unlinkContents"
  public void _unlinkContents(ModelElement contents1);
  // -end- 33CF9A030258 _unlink_body337DA4DE0212 "Partition::_unlinkContents"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 337DA4DE0212 detail_end "Partition"

  // -end- 337DA4DE0212 detail_end "Partition"

}

