// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:39 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33F5989A02F8 package "Node"
package ch.ehi.uml1_4.foundation.core;
// -end- 33F5989A02F8 package "Node"

<<<<<<< HEAD
=======
import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -beg- preserve=no 33F5989A02F8 autoimport "Node"
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.Component;
// -end- 33F5989A02F8 autoimport "Node"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33F5989A02F8 import "Node"

// -end- 33F5989A02F8 import "Node"

/** A node is a run-time physical object that represents a computational resource, generally havingat least a memory and often processing capability as well, and upon which components may bedeployed.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:39 $
 */
<<<<<<< HEAD
public interface Node extends Classifier , PresentationElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33F5989A02F8 detail_begin "Node"

  // -end- 33F5989A02F8 detail_begin "Node"

  /** add a DeployedComponent.
   *  The set of Components deployed on the Node.
   *  @see #removeDeployedComponent
   *  @see #containsDeployedComponent
   *  @see #iteratorDeployedComponent
   *  @see #clearDeployedComponent
   *  @see #sizeDeployedComponent
   */
  // -beg- preserve=no 36240BF10398 add_head33F5989A02F8 "Node::addDeployedComponent"
  public void addDeployedComponent(Component deployedComponent1)
  // -end- 36240BF10398 add_head33F5989A02F8 "Node::addDeployedComponent"
    ; // empty

  /** disconnect a DeployedComponent.
   *  @see #addDeployedComponent
   */
  // -beg- preserve=no 36240BF10398 remove_head33F5989A02F8 "Node::removeDeployedComponent"
  public Component removeDeployedComponent(Component deployedComponent1)
  // -end- 36240BF10398 remove_head33F5989A02F8 "Node::removeDeployedComponent"
    ; // empty

  /** tests if a given DeployedComponent is connected.
   *  @see #addDeployedComponent
   */
  // -beg- preserve=no 36240BF10398 test_head33F5989A02F8 "Node::containsDeployedComponent"
  public boolean containsDeployedComponent(Component deployedComponent1)
  // -end- 36240BF10398 test_head33F5989A02F8 "Node::containsDeployedComponent"
    ; // empty

  /** used to enumerate all connected DeployedComponents.
   *  @see #addDeployedComponent
   */
  // -beg- preserve=no 36240BF10398 get_all_head33F5989A02F8 "Node::iteratorDeployedComponent"
  public java.util.Iterator iteratorDeployedComponent()
  // -end- 36240BF10398 get_all_head33F5989A02F8 "Node::iteratorDeployedComponent"
    ; // empty

  /** disconnect all DeployedComponents.
   *  @see #addDeployedComponent
   */
  // -beg- preserve=no 36240BF10398 remove_all_head33F5989A02F8 "Node::clearDeployedComponent"
  public void clearDeployedComponent()
  // -end- 36240BF10398 remove_all_head33F5989A02F8 "Node::clearDeployedComponent"
    ; // empty

  /** returns the number of DeployedComponents.
   *  @see #addDeployedComponent
   */
  // -beg- preserve=no 36240BF10398 size_head33F5989A02F8 "Node::sizeDeployedComponent"
  public int sizeDeployedComponent()
  // -end- 36240BF10398 size_head33F5989A02F8 "Node::sizeDeployedComponent"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36240BF10398 _link_body33F5989A02F8 "Node::_linkDeployedComponent"
  public void _linkDeployedComponent(Component deployedComponent1);
  // -end- 36240BF10398 _link_body33F5989A02F8 "Node::_linkDeployedComponent"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36240BF10398 _unlink_body33F5989A02F8 "Node::_unlinkDeployedComponent"
  public void _unlinkDeployedComponent(Component deployedComponent1);
  // -end- 36240BF10398 _unlink_body33F5989A02F8 "Node::_unlinkDeployedComponent"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33F5989A02F8 detail_end "Node"

  // -end- 33F5989A02F8 detail_end "Node"

}

=======
public interface Node extends Classifier, PresentationElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F5989A02F8 detail_begin "Node"

// -end- 33F5989A02F8 detail_begin "Node"

/** add a DeployedComponent.
 *  The set of Components deployed on the Node.
 *  @see #removeDeployedComponent
 *  @see #containsDeployedComponent
 *  @see #iteratorDeployedComponent
 *  @see #clearDeployedComponent
 *  @see #sizeDeployedComponent
 */
// -beg- preserve=no 36240BF10398 add_head33F5989A02F8 "Node::addDeployedComponent"
public void addDeployedComponent(Component deployedComponent1)
// -end- 36240BF10398 add_head33F5989A02F8 "Node::addDeployedComponent"
;     // empty

/** disconnect a DeployedComponent.
 *  @see #addDeployedComponent
 */
// -beg- preserve=no 36240BF10398 remove_head33F5989A02F8 "Node::removeDeployedComponent"
public Component removeDeployedComponent(Component deployedComponent1)
// -end- 36240BF10398 remove_head33F5989A02F8 "Node::removeDeployedComponent"
;     // empty

/** tests if a given DeployedComponent is connected.
 *  @see #addDeployedComponent
 */
// -beg- preserve=no 36240BF10398 test_head33F5989A02F8 "Node::containsDeployedComponent"
public boolean containsDeployedComponent(Component deployedComponent1)
// -end- 36240BF10398 test_head33F5989A02F8 "Node::containsDeployedComponent"
;     // empty

/** used to enumerate all connected DeployedComponents.
 *  @see #addDeployedComponent
 */
// -beg- preserve=no 36240BF10398 get_all_head33F5989A02F8 "Node::iteratorDeployedComponent"
public Iterator<?> iteratorDeployedComponent()
// -end- 36240BF10398 get_all_head33F5989A02F8 "Node::iteratorDeployedComponent"
;     // empty

/** disconnect all DeployedComponents.
 *  @see #addDeployedComponent
 */
// -beg- preserve=no 36240BF10398 remove_all_head33F5989A02F8 "Node::clearDeployedComponent"
public void clearDeployedComponent()
// -end- 36240BF10398 remove_all_head33F5989A02F8 "Node::clearDeployedComponent"
;     // empty

/** returns the number of DeployedComponents.
 *  @see #addDeployedComponent
 */
// -beg- preserve=no 36240BF10398 size_head33F5989A02F8 "Node::sizeDeployedComponent"
public int sizeDeployedComponent()
// -end- 36240BF10398 size_head33F5989A02F8 "Node::sizeDeployedComponent"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240BF10398 _link_body33F5989A02F8 "Node::_linkDeployedComponent"
public void _linkDeployedComponent(Component deployedComponent1);
// -end- 36240BF10398 _link_body33F5989A02F8 "Node::_linkDeployedComponent"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240BF10398 _unlink_body33F5989A02F8 "Node::_unlinkDeployedComponent"
public void _unlinkDeployedComponent(Component deployedComponent1);
// -end- 36240BF10398 _unlink_body33F5989A02F8 "Node::_unlinkDeployedComponent"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F5989A02F8 detail_end "Node"

// -end- 33F5989A02F8 detail_end "Node"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
