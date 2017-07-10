// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:30 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3624012E0352 package "Flow"
package ch.ehi.uml1_4.foundation.core;
// -end- 3624012E0352 package "Flow"

// -beg- preserve=no 3624012E0352 autoimport "Flow"
import ch.ehi.uml1_4.foundation.core.Relationship;
import ch.ehi.uml1_4.foundation.core.ModelElement;
// -end- 3624012E0352 autoimport "Flow"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3624012E0352 import "Flow"

// -end- 3624012E0352 import "Flow"

/** A flow is a relationship between two versions of an object or between an object and a copy ofit.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:30 $
 */
public interface Flow extends Relationship , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3624012E0352 detail_begin "Flow"

  // -end- 3624012E0352 detail_begin "Flow"

  /** add a Target.
   *  
   *  @see #removeTarget
   *  @see #containsTarget
   *  @see #iteratorTarget
   *  @see #clearTarget
   *  @see #sizeTarget
   */
  // -beg- preserve=no 3627D5E9010E add_head3624012E0352 "Flow::addTarget"
  public void addTarget(ModelElement target1)
  // -end- 3627D5E9010E add_head3624012E0352 "Flow::addTarget"
    ; // empty

  /** disconnect a Target.
   *  @see #addTarget
   */
  // -beg- preserve=no 3627D5E9010E remove_head3624012E0352 "Flow::removeTarget"
  public ModelElement removeTarget(ModelElement target1)
  // -end- 3627D5E9010E remove_head3624012E0352 "Flow::removeTarget"
    ; // empty

  /** tests if a given Target is connected.
   *  @see #addTarget
   */
  // -beg- preserve=no 3627D5E9010E test_head3624012E0352 "Flow::containsTarget"
  public boolean containsTarget(ModelElement target1)
  // -end- 3627D5E9010E test_head3624012E0352 "Flow::containsTarget"
    ; // empty

  /** used to enumerate all connected Targets.
   *  @see #addTarget
   */
  // -beg- preserve=no 3627D5E9010E get_all_head3624012E0352 "Flow::iteratorTarget"
  public java.util.Iterator iteratorTarget()
  // -end- 3627D5E9010E get_all_head3624012E0352 "Flow::iteratorTarget"
    ; // empty

  /** disconnect all Targets.
   *  @see #addTarget
   */
  // -beg- preserve=no 3627D5E9010E remove_all_head3624012E0352 "Flow::clearTarget"
  public void clearTarget()
  // -end- 3627D5E9010E remove_all_head3624012E0352 "Flow::clearTarget"
    ; // empty

  /** returns the number of Targets.
   *  @see #addTarget
   */
  // -beg- preserve=no 3627D5E9010E size_head3624012E0352 "Flow::sizeTarget"
  public int sizeTarget()
  // -end- 3627D5E9010E size_head3624012E0352 "Flow::sizeTarget"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3627D5E9010E _link_body3624012E0352 "Flow::_linkTarget"
  public void _linkTarget(ModelElement target1);
  // -end- 3627D5E9010E _link_body3624012E0352 "Flow::_linkTarget"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3627D5E9010E _unlink_body3624012E0352 "Flow::_unlinkTarget"
  public void _unlinkTarget(ModelElement target1);
  // -end- 3627D5E9010E _unlink_body3624012E0352 "Flow::_unlinkTarget"

  /** add a Source.
   *  
   *  @see #removeSource
   *  @see #containsSource
   *  @see #iteratorSource
   *  @see #clearSource
   *  @see #sizeSource
   */
  // -beg- preserve=no 3627D60F03DE add_head3624012E0352 "Flow::addSource"
  public void addSource(ModelElement source1)
  // -end- 3627D60F03DE add_head3624012E0352 "Flow::addSource"
    ; // empty

  /** disconnect a Source.
   *  @see #addSource
   */
  // -beg- preserve=no 3627D60F03DE remove_head3624012E0352 "Flow::removeSource"
  public ModelElement removeSource(ModelElement source1)
  // -end- 3627D60F03DE remove_head3624012E0352 "Flow::removeSource"
    ; // empty

  /** tests if a given Source is connected.
   *  @see #addSource
   */
  // -beg- preserve=no 3627D60F03DE test_head3624012E0352 "Flow::containsSource"
  public boolean containsSource(ModelElement source1)
  // -end- 3627D60F03DE test_head3624012E0352 "Flow::containsSource"
    ; // empty

  /** used to enumerate all connected Sources.
   *  @see #addSource
   */
  // -beg- preserve=no 3627D60F03DE get_all_head3624012E0352 "Flow::iteratorSource"
  public java.util.Iterator iteratorSource()
  // -end- 3627D60F03DE get_all_head3624012E0352 "Flow::iteratorSource"
    ; // empty

  /** disconnect all Sources.
   *  @see #addSource
   */
  // -beg- preserve=no 3627D60F03DE remove_all_head3624012E0352 "Flow::clearSource"
  public void clearSource()
  // -end- 3627D60F03DE remove_all_head3624012E0352 "Flow::clearSource"
    ; // empty

  /** returns the number of Sources.
   *  @see #addSource
   */
  // -beg- preserve=no 3627D60F03DE size_head3624012E0352 "Flow::sizeSource"
  public int sizeSource()
  // -end- 3627D60F03DE size_head3624012E0352 "Flow::sizeSource"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3627D60F03DE _link_body3624012E0352 "Flow::_linkSource"
  public void _linkSource(ModelElement source1);
  // -end- 3627D60F03DE _link_body3624012E0352 "Flow::_linkSource"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3627D60F03DE _unlink_body3624012E0352 "Flow::_unlinkSource"
  public void _unlinkSource(ModelElement source1);
  // -end- 3627D60F03DE _unlink_body3624012E0352 "Flow::_unlinkSource"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3624012E0352 detail_end "Flow"

  // -end- 3624012E0352 detail_end "Flow"

}

