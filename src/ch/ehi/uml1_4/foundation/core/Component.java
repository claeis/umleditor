// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:26 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33F59891028A package "Component"
package ch.ehi.uml1_4.foundation.core;
// -end- 33F59891028A package "Component"

// -beg- preserve=no 33F59891028A autoimport "Component"
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.Node;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.foundation.core.Artifact;
// -end- 33F59891028A autoimport "Component"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33F59891028A import "Component"

// -end- 33F59891028A import "Component"

/** A component represents a modular, deployable, and replaceable part of a system thatencapsulates implementation and exposes a set of interfaces.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:26 $
 */
<<<<<<< HEAD
public interface Component extends Classifier , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33F59891028A detail_begin "Component"

  // -end- 33F59891028A detail_begin "Component"

  /** add a DeploymentLocation.
   *  The set of Nodes the Component is residing on.
   *  @see #removeDeploymentLocation
   *  @see #containsDeploymentLocation
   *  @see #iteratorDeploymentLocation
   *  @see #clearDeploymentLocation
   *  @see #sizeDeploymentLocation
   */
  // -beg- preserve=no 36240BF10399 add_head33F59891028A "Component::addDeploymentLocation"
  public void addDeploymentLocation(Node deploymentLocation1)
  // -end- 36240BF10399 add_head33F59891028A "Component::addDeploymentLocation"
    ; // empty

  /** disconnect a DeploymentLocation.
   *  @see #addDeploymentLocation
   */
  // -beg- preserve=no 36240BF10399 remove_head33F59891028A "Component::removeDeploymentLocation"
  public Node removeDeploymentLocation(Node deploymentLocation1)
  // -end- 36240BF10399 remove_head33F59891028A "Component::removeDeploymentLocation"
    ; // empty

  /** tests if a given DeploymentLocation is connected.
   *  @see #addDeploymentLocation
   */
  // -beg- preserve=no 36240BF10399 test_head33F59891028A "Component::containsDeploymentLocation"
  public boolean containsDeploymentLocation(Node deploymentLocation1)
  // -end- 36240BF10399 test_head33F59891028A "Component::containsDeploymentLocation"
    ; // empty

  /** used to enumerate all connected DeploymentLocations.
   *  @see #addDeploymentLocation
   */
  // -beg- preserve=no 36240BF10399 get_all_head33F59891028A "Component::iteratorDeploymentLocation"
  public java.util.Iterator iteratorDeploymentLocation()
  // -end- 36240BF10399 get_all_head33F59891028A "Component::iteratorDeploymentLocation"
    ; // empty

  /** disconnect all DeploymentLocations.
   *  @see #addDeploymentLocation
   */
  // -beg- preserve=no 36240BF10399 remove_all_head33F59891028A "Component::clearDeploymentLocation"
  public void clearDeploymentLocation()
  // -end- 36240BF10399 remove_all_head33F59891028A "Component::clearDeploymentLocation"
    ; // empty

  /** returns the number of DeploymentLocations.
   *  @see #addDeploymentLocation
   */
  // -beg- preserve=no 36240BF10399 size_head33F59891028A "Component::sizeDeploymentLocation"
  public int sizeDeploymentLocation()
  // -end- 36240BF10399 size_head33F59891028A "Component::sizeDeploymentLocation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36240BF10399 _link_body33F59891028A "Component::_linkDeploymentLocation"
  public void _linkDeploymentLocation(Node deploymentLocation1);
  // -end- 36240BF10399 _link_body33F59891028A "Component::_linkDeploymentLocation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36240BF10399 _unlink_body33F59891028A "Component::_unlinkDeploymentLocation"
  public void _unlinkDeploymentLocation(Node deploymentLocation1);
  // -end- 36240BF10399 _unlink_body33F59891028A "Component::_unlinkDeploymentLocation"

  /** add a Resident.
   *  
   *  @see #removeResident
   *  @see #containsResident
   *  @see #iteratorResident
   *  @see #clearResident
   *  @see #sizeResident
   *  @see #iteratorResidentLink
   *  @see #createResidentLink
   *  @see #findResidentLink
   */
  // -beg- preserve=no 36240CA40212 add_head33F59891028A "Component::addResident"
  public void addResident(ModelElement resident1)
  // -end- 36240CA40212 add_head33F59891028A "Component::addResident"
    ; // empty

  /** add a link to a Resident.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 addlink_head33F59891028A "Component::addResidentLink"
  public void addResidentLink(ElementResidence resident1)
  // -end- 36240CA40212 addlink_head33F59891028A "Component::addResidentLink"
    ; // empty

  /** disconnect a Resident.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 remove_head33F59891028A "Component::removeResident"
  public ModelElement removeResident(ModelElement resident1)
  // -end- 36240CA40212 remove_head33F59891028A "Component::removeResident"
    ; // empty

  /** tests if a given Resident is connected.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 test_head33F59891028A "Component::containsResident"
  public boolean containsResident(ModelElement resident1)
  // -end- 36240CA40212 test_head33F59891028A "Component::containsResident"
    ; // empty

  /** used to enumerate all connected Residents.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 get_all_head33F59891028A "Component::iteratorResident"
  public java.util.Iterator iteratorResident()
  // -end- 36240CA40212 get_all_head33F59891028A "Component::iteratorResident"
    ; // empty

  /** disconnect all Residents.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 remove_all_head33F59891028A "Component::clearResident"
  public void clearResident()
  // -end- 36240CA40212 remove_all_head33F59891028A "Component::clearResident"
    ; // empty

  /** returns the number of Residents.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 size_head33F59891028A "Component::sizeResident"
  public int sizeResident()
  // -end- 36240CA40212 size_head33F59891028A "Component::sizeResident"
    ; // empty

  /** enumerate the link objects of currently connected Resident.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 itlink_head33F59891028A "Component::getResidentLink"
  public java.util.Iterator iteratorResidentLink()
  // -end- 36240CA40212 itlink_head33F59891028A "Component::getResidentLink"
    ; // empty

  /** create a link class for a new link to a Resident.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 createlink_head33F59891028A "Component::createResidentLink"
  public ElementResidence createResidentLink()
  // -end- 36240CA40212 createlink_head33F59891028A "Component::createResidentLink"
    ; // empty

  /** find a link object for a given Resident.
   *  @see #addResident
   */
  // -beg- preserve=no 36240CA40212 find_head33F59891028A "Component::findResidentLink"
  public ElementResidence findResidentLink(ModelElement resident1)
  // -end- 36240CA40212 find_head33F59891028A "Component::findResidentLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36240CA40212 _link_body33F59891028A "Component::_linkResident"
  public void _linkResident(ElementResidence resident1);
  // -end- 36240CA40212 _link_body33F59891028A "Component::_linkResident"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36240CA40212 _unlink_body33F59891028A "Component::_unlinkResident"
  public void _unlinkResident(ElementResidence resident1);
  // -end- 36240CA40212 _unlink_body33F59891028A "Component::_unlinkResident"

  /** add a Implementation.
   *  The set of Artifacts that implement the Component.
   *  @see #removeImplementation
   *  @see #containsImplementation
   *  @see #iteratorImplementation
   *  @see #clearImplementation
   *  @see #sizeImplementation
   */
  // -beg- preserve=no 3A018E150194 add_head33F59891028A "Component::addImplementation"
  public void addImplementation(Artifact implementation1)
  // -end- 3A018E150194 add_head33F59891028A "Component::addImplementation"
    ; // empty

  /** disconnect a Implementation.
   *  @see #addImplementation
   */
  // -beg- preserve=no 3A018E150194 remove_head33F59891028A "Component::removeImplementation"
  public Artifact removeImplementation(Artifact implementation1)
  // -end- 3A018E150194 remove_head33F59891028A "Component::removeImplementation"
    ; // empty

  /** tests if a given Implementation is connected.
   *  @see #addImplementation
   */
  // -beg- preserve=no 3A018E150194 test_head33F59891028A "Component::containsImplementation"
  public boolean containsImplementation(Artifact implementation1)
  // -end- 3A018E150194 test_head33F59891028A "Component::containsImplementation"
    ; // empty

  /** used to enumerate all connected Implementations.
   *  @see #addImplementation
   */
  // -beg- preserve=no 3A018E150194 get_all_head33F59891028A "Component::iteratorImplementation"
  public java.util.Iterator iteratorImplementation()
  // -end- 3A018E150194 get_all_head33F59891028A "Component::iteratorImplementation"
    ; // empty

  /** disconnect all Implementations.
   *  @see #addImplementation
   */
  // -beg- preserve=no 3A018E150194 remove_all_head33F59891028A "Component::clearImplementation"
  public void clearImplementation()
  // -end- 3A018E150194 remove_all_head33F59891028A "Component::clearImplementation"
    ; // empty

  /** returns the number of Implementations.
   *  @see #addImplementation
   */
  // -beg- preserve=no 3A018E150194 size_head33F59891028A "Component::sizeImplementation"
  public int sizeImplementation()
  // -end- 3A018E150194 size_head33F59891028A "Component::sizeImplementation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3A018E150194 _link_body33F59891028A "Component::_linkImplementation"
  public void _linkImplementation(Artifact implementation1);
  // -end- 3A018E150194 _link_body33F59891028A "Component::_linkImplementation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3A018E150194 _unlink_body33F59891028A "Component::_unlinkImplementation"
  public void _unlinkImplementation(Artifact implementation1);
  // -end- 3A018E150194 _unlink_body33F59891028A "Component::_unlinkImplementation"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33F59891028A detail_end "Component"

  // -end- 33F59891028A detail_end "Component"

}

=======
public interface Component extends Classifier, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F59891028A detail_begin "Component"

// -end- 33F59891028A detail_begin "Component"

/** add a DeploymentLocation.
 *  The set of Nodes the Component is residing on.
 *  @see #removeDeploymentLocation
 *  @see #containsDeploymentLocation
 *  @see #iteratorDeploymentLocation
 *  @see #clearDeploymentLocation
 *  @see #sizeDeploymentLocation
 */
// -beg- preserve=no 36240BF10399 add_head33F59891028A "Component::addDeploymentLocation"
public void addDeploymentLocation(Node deploymentLocation1)
// -end- 36240BF10399 add_head33F59891028A "Component::addDeploymentLocation"
;     // empty

/** disconnect a DeploymentLocation.
 *  @see #addDeploymentLocation
 */
// -beg- preserve=no 36240BF10399 remove_head33F59891028A "Component::removeDeploymentLocation"
public Node removeDeploymentLocation(Node deploymentLocation1)
// -end- 36240BF10399 remove_head33F59891028A "Component::removeDeploymentLocation"
;     // empty

/** tests if a given DeploymentLocation is connected.
 *  @see #addDeploymentLocation
 */
// -beg- preserve=no 36240BF10399 test_head33F59891028A "Component::containsDeploymentLocation"
public boolean containsDeploymentLocation(Node deploymentLocation1)
// -end- 36240BF10399 test_head33F59891028A "Component::containsDeploymentLocation"
;     // empty

/** used to enumerate all connected DeploymentLocations.
 *  @see #addDeploymentLocation
 */
// -beg- preserve=no 36240BF10399 get_all_head33F59891028A "Component::iteratorDeploymentLocation"
public Iterator<?> iteratorDeploymentLocation()
// -end- 36240BF10399 get_all_head33F59891028A "Component::iteratorDeploymentLocation"
;     // empty

/** disconnect all DeploymentLocations.
 *  @see #addDeploymentLocation
 */
// -beg- preserve=no 36240BF10399 remove_all_head33F59891028A "Component::clearDeploymentLocation"
public void clearDeploymentLocation()
// -end- 36240BF10399 remove_all_head33F59891028A "Component::clearDeploymentLocation"
;     // empty

/** returns the number of DeploymentLocations.
 *  @see #addDeploymentLocation
 */
// -beg- preserve=no 36240BF10399 size_head33F59891028A "Component::sizeDeploymentLocation"
public int sizeDeploymentLocation()
// -end- 36240BF10399 size_head33F59891028A "Component::sizeDeploymentLocation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240BF10399 _link_body33F59891028A "Component::_linkDeploymentLocation"
public void _linkDeploymentLocation(Node deploymentLocation1);
// -end- 36240BF10399 _link_body33F59891028A "Component::_linkDeploymentLocation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240BF10399 _unlink_body33F59891028A "Component::_unlinkDeploymentLocation"
public void _unlinkDeploymentLocation(Node deploymentLocation1);
// -end- 36240BF10399 _unlink_body33F59891028A "Component::_unlinkDeploymentLocation"

/** add a Resident.
 *
 *  @see #removeResident
 *  @see #containsResident
 *  @see #iteratorResident
 *  @see #clearResident
 *  @see #sizeResident
 *  @see #iteratorResidentLink
 *  @see #createResidentLink
 *  @see #findResidentLink
 */
// -beg- preserve=no 36240CA40212 add_head33F59891028A "Component::addResident"
public void addResident(ModelElement resident1)
// -end- 36240CA40212 add_head33F59891028A "Component::addResident"
;     // empty

/** add a link to a Resident.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 addlink_head33F59891028A "Component::addResidentLink"
public void addResidentLink(ElementResidence resident1)
// -end- 36240CA40212 addlink_head33F59891028A "Component::addResidentLink"
;     // empty

/** disconnect a Resident.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 remove_head33F59891028A "Component::removeResident"
public ModelElement removeResident(ModelElement resident1)
// -end- 36240CA40212 remove_head33F59891028A "Component::removeResident"
;     // empty

/** tests if a given Resident is connected.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 test_head33F59891028A "Component::containsResident"
public boolean containsResident(ModelElement resident1)
// -end- 36240CA40212 test_head33F59891028A "Component::containsResident"
;     // empty

/** used to enumerate all connected Residents.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 get_all_head33F59891028A "Component::iteratorResident"
public Iterator<?> iteratorResident()
// -end- 36240CA40212 get_all_head33F59891028A "Component::iteratorResident"
;     // empty

/** disconnect all Residents.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 remove_all_head33F59891028A "Component::clearResident"
public void clearResident()
// -end- 36240CA40212 remove_all_head33F59891028A "Component::clearResident"
;     // empty

/** returns the number of Residents.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 size_head33F59891028A "Component::sizeResident"
public int sizeResident()
// -end- 36240CA40212 size_head33F59891028A "Component::sizeResident"
;     // empty

/** enumerate the link objects of currently connected Resident.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 itlink_head33F59891028A "Component::getResidentLink"
public Iterator<?> iteratorResidentLink()
// -end- 36240CA40212 itlink_head33F59891028A "Component::getResidentLink"
;     // empty

/** create a link class for a new link to a Resident.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 createlink_head33F59891028A "Component::createResidentLink"
public ElementResidence createResidentLink()
// -end- 36240CA40212 createlink_head33F59891028A "Component::createResidentLink"
;     // empty

/** find a link object for a given Resident.
 *  @see #addResident
 */
// -beg- preserve=no 36240CA40212 find_head33F59891028A "Component::findResidentLink"
public ElementResidence findResidentLink(ModelElement resident1)
// -end- 36240CA40212 find_head33F59891028A "Component::findResidentLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240CA40212 _link_body33F59891028A "Component::_linkResident"
public void _linkResident(ElementResidence resident1);
// -end- 36240CA40212 _link_body33F59891028A "Component::_linkResident"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240CA40212 _unlink_body33F59891028A "Component::_unlinkResident"
public void _unlinkResident(ElementResidence resident1);
// -end- 36240CA40212 _unlink_body33F59891028A "Component::_unlinkResident"

/** add a Implementation.
 *  The set of Artifacts that implement the Component.
 *  @see #removeImplementation
 *  @see #containsImplementation
 *  @see #iteratorImplementation
 *  @see #clearImplementation
 *  @see #sizeImplementation
 */
// -beg- preserve=no 3A018E150194 add_head33F59891028A "Component::addImplementation"
public void addImplementation(Artifact implementation1)
// -end- 3A018E150194 add_head33F59891028A "Component::addImplementation"
;     // empty

/** disconnect a Implementation.
 *  @see #addImplementation
 */
// -beg- preserve=no 3A018E150194 remove_head33F59891028A "Component::removeImplementation"
public Artifact removeImplementation(Artifact implementation1)
// -end- 3A018E150194 remove_head33F59891028A "Component::removeImplementation"
;     // empty

/** tests if a given Implementation is connected.
 *  @see #addImplementation
 */
// -beg- preserve=no 3A018E150194 test_head33F59891028A "Component::containsImplementation"
public boolean containsImplementation(Artifact implementation1)
// -end- 3A018E150194 test_head33F59891028A "Component::containsImplementation"
;     // empty

/** used to enumerate all connected Implementations.
 *  @see #addImplementation
 */
// -beg- preserve=no 3A018E150194 get_all_head33F59891028A "Component::iteratorImplementation"
public Iterator<?> iteratorImplementation()
// -end- 3A018E150194 get_all_head33F59891028A "Component::iteratorImplementation"
;     // empty

/** disconnect all Implementations.
 *  @see #addImplementation
 */
// -beg- preserve=no 3A018E150194 remove_all_head33F59891028A "Component::clearImplementation"
public void clearImplementation()
// -end- 3A018E150194 remove_all_head33F59891028A "Component::clearImplementation"
;     // empty

/** returns the number of Implementations.
 *  @see #addImplementation
 */
// -beg- preserve=no 3A018E150194 size_head33F59891028A "Component::sizeImplementation"
public int sizeImplementation()
// -end- 3A018E150194 size_head33F59891028A "Component::sizeImplementation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3A018E150194 _link_body33F59891028A "Component::_linkImplementation"
public void _linkImplementation(Artifact implementation1);
// -end- 3A018E150194 _link_body33F59891028A "Component::_linkImplementation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3A018E150194 _unlink_body33F59891028A "Component::_unlinkImplementation"
public void _unlinkImplementation(Artifact implementation1);
// -end- 3A018E150194 _unlink_body33F59891028A "Component::_unlinkImplementation"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F59891028A detail_end "Component"

// -end- 33F59891028A detail_end "Component"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
