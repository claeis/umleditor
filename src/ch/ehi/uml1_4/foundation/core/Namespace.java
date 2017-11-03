// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:38 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 32B69F3A0118 package "Namespace"
package ch.ehi.uml1_4.foundation.core;
// -end- 32B69F3A0118 package "Namespace"

// -beg- preserve=no 32B69F3A0118 autoimport "Namespace"
import ch.ehi.uml1_4.foundation.core.ModelElement;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
// -end- 32B69F3A0118 autoimport "Namespace"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 32B69F3A0118 import "Namespace"

// -end- 32B69F3A0118 import "Namespace"

/** A namespace is a part of a model that contains a set of ModelElements each of whose namesdesignates a unique element within the namespace.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:38 $
 */
<<<<<<< HEAD
public interface Namespace extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32B69F3A0118 detail_begin "Namespace"

  // -end- 32B69F3A0118 detail_begin "Namespace"

  /** return the list of valid owned elements for this namespace.
   */
  // -beg- preserve=no 3C47F49003BC head32B69F3A0118 "getValidOwnedElements"
  public String[] getValidOwnedElements()
  // -end- 3C47F49003BC head32B69F3A0118 "getValidOwnedElements"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3C47F49003BC throws32B69F3A0118 "getValidOwnedElements"

    // -end- 3C47F49003BC throws32B69F3A0118 "getValidOwnedElements"
    ; // empty

  /** disconnect the given element and all its subelements from this namespace
   */
  // -beg- preserve=no 3C8F94DE03A6 head32B69F3A0118 "deepDetachOwnedElement"
  public void deepDetachOwnedElement(ModelElement element)
  // -end- 3C8F94DE03A6 head32B69F3A0118 "deepDetachOwnedElement"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3C8F94DE03A6 throws32B69F3A0118 "deepDetachOwnedElement"

    // -end- 3C8F94DE03A6 throws32B69F3A0118 "deepDetachOwnedElement"
    ; // empty

  /** tests if this Namespace contains an ModelElement with the given name
   */
  // -beg- preserve=no 3C8F964B01C0 head32B69F3A0118 "containsOwnedElement"
  public boolean containsOwnedElement(String name)
  // -end- 3C8F964B01C0 head32B69F3A0118 "containsOwnedElement"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3C8F964B01C0 throws32B69F3A0118 "containsOwnedElement"

    // -end- 3C8F964B01C0 throws32B69F3A0118 "containsOwnedElement"
    ; // empty

  /** checks if a ModelElement exists in this Namespace and all its Sub-Namespaces
   */
  // -beg- preserve=no 3CC7B8D10067 head32B69F3A0118 "deepContainsOwnedElement"
  public boolean deepContainsOwnedElement(java.lang.Class aclass, String name)
  // -end- 3CC7B8D10067 head32B69F3A0118 "deepContainsOwnedElement"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CC7B8D10067 throws32B69F3A0118 "deepContainsOwnedElement"

    // -end- 3CC7B8D10067 throws32B69F3A0118 "deepContainsOwnedElement"
    ; // empty

  /** finds a ModelElement in this Namespace or all its Sub-Namespaces
   */
  // -beg- preserve=no 3CC7B8E5034B head32B69F3A0118 "deepGetOwnedElement"
  public ModelElement deepGetOwnedElement(java.lang.Class aclass, String name)
  // -end- 3CC7B8E5034B head32B69F3A0118 "deepGetOwnedElement"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CC7B8E5034B throws32B69F3A0118 "deepGetOwnedElement"

    // -end- 3CC7B8E5034B throws32B69F3A0118 "deepGetOwnedElement"
    ; // empty

  /** checks if a ModelElement exists in this Namespace and all its Sub-Namespaces
   */
  // -beg- preserve=no 3D789EFC0327 head32B69F3A0118 "deepContainsElementById"
  public boolean deepContainsElementById(String id)
  // -end- 3D789EFC0327 head32B69F3A0118 "deepContainsElementById"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D789EFC0327 throws32B69F3A0118 "deepContainsElementById"

    // -end- 3D789EFC0327 throws32B69F3A0118 "deepContainsElementById"
    ; // empty

  /** finds a ModelElement in this Namespace or all its Sub-Namespaces
   */
  // -beg- preserve=no 3D789F500346 head32B69F3A0118 "deepGetElementById"
  public AbstractEditorElement deepGetElementById(String id)
  // -end- 3D789F500346 head32B69F3A0118 "deepGetElementById"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D789F500346 throws32B69F3A0118 "deepGetElementById"

    // -end- 3D789F500346 throws32B69F3A0118 "deepGetElementById"
    ; // empty

  /** add a OwnedElement.
   *  A set of ModelElementsowned by the Namespace.
   *  @see #removeOwnedElement
   *  @see #containsOwnedElement
   *  @see #iteratorOwnedElement
   *  @see #clearOwnedElement
   *  @see #sizeOwnedElement
   *  @see #iteratorOwnedElementLink
   *  @see #createOwnedElementLink
   *  @see #findOwnedElementLink
   */
  // -beg- preserve=no 33598CAA030D add_head32B69F3A0118 "Namespace::addOwnedElement"
  public void addOwnedElement(ModelElement ownedElement1)
  // -end- 33598CAA030D add_head32B69F3A0118 "Namespace::addOwnedElement"
    ; // empty

  // -beg- preserve=no 33598CAA030D add2_head32B69F3A0118 "Namespace::add2OwnedElement"
  public void addOwnedElement(int index,ModelElement ownedElement1)
  // -end- 33598CAA030D add2_head32B69F3A0118 "Namespace::add2OwnedElement"
    ; // empty

  /** add a link to a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D addlink_head32B69F3A0118 "Namespace::addOwnedElementLink"
  public void addOwnedElementLink(ElementOwnership ownedElement1)
  // -end- 33598CAA030D addlink_head32B69F3A0118 "Namespace::addOwnedElementLink"
    ; // empty

  /** disconnect a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D remove_head32B69F3A0118 "Namespace::removeOwnedElement"
  public ModelElement removeOwnedElement(ModelElement ownedElement1)
  // -end- 33598CAA030D remove_head32B69F3A0118 "Namespace::removeOwnedElement"
    ; // empty

  /** disconnect a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D remove2_head32B69F3A0118 "Namespace::remove2OwnedElement"
  public ModelElement removeOwnedElement(int index)
  // -end- 33598CAA030D remove2_head32B69F3A0118 "Namespace::remove2OwnedElement"
    ; // empty

  /** change a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D set_head32B69F3A0118 "Namespace::setOwnedElement"
  public ModelElement setOwnedElement(int index,ModelElement ownedElement1)
  // -end- 33598CAA030D set_head32B69F3A0118 "Namespace::setOwnedElement"
    ; // empty

  /** tests if a given OwnedElement is connected.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D test_head32B69F3A0118 "Namespace::containsOwnedElement"
  public boolean containsOwnedElement(ModelElement ownedElement1)
  // -end- 33598CAA030D test_head32B69F3A0118 "Namespace::containsOwnedElement"
    ; // empty

  /** used to enumerate all connected OwnedElements.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D get_all_head32B69F3A0118 "Namespace::iteratorOwnedElement"
  public java.util.Iterator iteratorOwnedElement()
  // -end- 33598CAA030D get_all_head32B69F3A0118 "Namespace::iteratorOwnedElement"
    ; // empty

  /** disconnect all OwnedElements.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D remove_all_head32B69F3A0118 "Namespace::clearOwnedElement"
  public void clearOwnedElement()
  // -end- 33598CAA030D remove_all_head32B69F3A0118 "Namespace::clearOwnedElement"
    ; // empty

  /** returns the number of OwnedElements.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D size_head32B69F3A0118 "Namespace::sizeOwnedElement"
  public int sizeOwnedElement()
  // -end- 33598CAA030D size_head32B69F3A0118 "Namespace::sizeOwnedElement"
    ; // empty

  /** enumerate the link objects of currently connected OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D itlink_head32B69F3A0118 "Namespace::getOwnedElementLink"
  public java.util.Iterator iteratorOwnedElementLink()
  // -end- 33598CAA030D itlink_head32B69F3A0118 "Namespace::getOwnedElementLink"
    ; // empty

  /** create a link class for a new link to a OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D createlink_head32B69F3A0118 "Namespace::createOwnedElementLink"
  public ElementOwnership createOwnedElementLink()
  // -end- 33598CAA030D createlink_head32B69F3A0118 "Namespace::createOwnedElementLink"
    ; // empty

  /** find a link object for a given OwnedElement.
   *  @see #addOwnedElement
   */
  // -beg- preserve=no 33598CAA030D find_head32B69F3A0118 "Namespace::findOwnedElementLink"
  public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
  // -end- 33598CAA030D find_head32B69F3A0118 "Namespace::findOwnedElementLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030D _link_body32B69F3A0118 "Namespace::_linkOwnedElement"
  public void _linkOwnedElement(ElementOwnership ownedElement1);
  // -end- 33598CAA030D _link_body32B69F3A0118 "Namespace::_linkOwnedElement"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030D _unlink_body32B69F3A0118 "Namespace::_unlinkOwnedElement"
  public void _unlinkOwnedElement(ElementOwnership ownedElement1);
  // -end- 33598CAA030D _unlink_body32B69F3A0118 "Namespace::_unlinkOwnedElement"

  /** add a Diagram.
   *  
   *  @see #removeDiagram
   *  @see #containsDiagram
   *  @see #iteratorDiagram
   *  @see #clearDiagram
   *  @see #sizeDiagram
   */
  // -beg- preserve=no 3C2C4E4F0248 add_head32B69F3A0118 "Namespace::addDiagram"
  public void addDiagram(Diagram diagram1)
  // -end- 3C2C4E4F0248 add_head32B69F3A0118 "Namespace::addDiagram"
    ; // empty

  /** disconnect a Diagram.
   *  @see #addDiagram
   */
  // -beg- preserve=no 3C2C4E4F0248 remove_head32B69F3A0118 "Namespace::removeDiagram"
  public Diagram removeDiagram(Diagram diagram1)
  // -end- 3C2C4E4F0248 remove_head32B69F3A0118 "Namespace::removeDiagram"
    ; // empty

  /** tests if a given Diagram is connected.
   *  @see #addDiagram
   */
  // -beg- preserve=no 3C2C4E4F0248 test_head32B69F3A0118 "Namespace::containsDiagram"
  public boolean containsDiagram(Diagram diagram1)
  // -end- 3C2C4E4F0248 test_head32B69F3A0118 "Namespace::containsDiagram"
    ; // empty

  /** used to enumerate all connected Diagrams.
   *  @see #addDiagram
   */
  // -beg- preserve=no 3C2C4E4F0248 get_all_head32B69F3A0118 "Namespace::iteratorDiagram"
  public java.util.Iterator iteratorDiagram()
  // -end- 3C2C4E4F0248 get_all_head32B69F3A0118 "Namespace::iteratorDiagram"
    ; // empty

  /** disconnect all Diagrams.
   *  @see #addDiagram
   */
  // -beg- preserve=no 3C2C4E4F0248 remove_all_head32B69F3A0118 "Namespace::clearDiagram"
  public void clearDiagram()
  // -end- 3C2C4E4F0248 remove_all_head32B69F3A0118 "Namespace::clearDiagram"
    ; // empty

  /** returns the number of Diagrams.
   *  @see #addDiagram
   */
  // -beg- preserve=no 3C2C4E4F0248 size_head32B69F3A0118 "Namespace::sizeDiagram"
  public int sizeDiagram()
  // -end- 3C2C4E4F0248 size_head32B69F3A0118 "Namespace::sizeDiagram"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3C2C4E4F0248 _link_body32B69F3A0118 "Namespace::_linkDiagram"
  public void _linkDiagram(Diagram diagram1);
  // -end- 3C2C4E4F0248 _link_body32B69F3A0118 "Namespace::_linkDiagram"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3C2C4E4F0248 _unlink_body32B69F3A0118 "Namespace::_unlinkDiagram"
  public void _unlinkDiagram(Diagram diagram1);
  // -end- 3C2C4E4F0248 _unlink_body32B69F3A0118 "Namespace::_unlinkDiagram"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32B69F3A0118 detail_end "Namespace"

  // -end- 32B69F3A0118 detail_end "Namespace"

}

=======
public interface Namespace extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 32B69F3A0118 detail_begin "Namespace"

// -end- 32B69F3A0118 detail_begin "Namespace"

/** return the list of valid owned elements for this namespace.
 */
// -beg- preserve=no 3C47F49003BC head32B69F3A0118 "getValidOwnedElements"
public String[] getValidOwnedElements()
// -end- 3C47F49003BC head32B69F3A0118 "getValidOwnedElements"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C47F49003BC throws32B69F3A0118 "getValidOwnedElements"

// -end- 3C47F49003BC throws32B69F3A0118 "getValidOwnedElements"
;     // empty

/** disconnect the given element and all its subelements from this namespace
 */
// -beg- preserve=no 3C8F94DE03A6 head32B69F3A0118 "deepDetachOwnedElement"
public void deepDetachOwnedElement(ModelElement element)
// -end- 3C8F94DE03A6 head32B69F3A0118 "deepDetachOwnedElement"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C8F94DE03A6 throws32B69F3A0118 "deepDetachOwnedElement"

// -end- 3C8F94DE03A6 throws32B69F3A0118 "deepDetachOwnedElement"
;     // empty

/** tests if this Namespace contains an ModelElement with the given name
 */
// -beg- preserve=no 3C8F964B01C0 head32B69F3A0118 "containsOwnedElement"
public boolean containsOwnedElement(String name)
// -end- 3C8F964B01C0 head32B69F3A0118 "containsOwnedElement"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C8F964B01C0 throws32B69F3A0118 "containsOwnedElement"

// -end- 3C8F964B01C0 throws32B69F3A0118 "containsOwnedElement"
;     // empty

/** checks if a ModelElement exists in this Namespace and all its Sub-Namespaces
 */
// -beg- preserve=no 3CC7B8D10067 head32B69F3A0118 "deepContainsOwnedElement"
public boolean deepContainsOwnedElement(Class aclass, String name)
// -end- 3CC7B8D10067 head32B69F3A0118 "deepContainsOwnedElement"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CC7B8D10067 throws32B69F3A0118 "deepContainsOwnedElement"

// -end- 3CC7B8D10067 throws32B69F3A0118 "deepContainsOwnedElement"
;     // empty

/** finds a ModelElement in this Namespace or all its Sub-Namespaces
 */
// -beg- preserve=no 3CC7B8E5034B head32B69F3A0118 "deepGetOwnedElement"
public ModelElement deepGetOwnedElement(Class aclass, String name)
// -end- 3CC7B8E5034B head32B69F3A0118 "deepGetOwnedElement"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CC7B8E5034B throws32B69F3A0118 "deepGetOwnedElement"

// -end- 3CC7B8E5034B throws32B69F3A0118 "deepGetOwnedElement"
;     // empty

/** checks if a ModelElement exists in this Namespace and all its Sub-Namespaces
 */
// -beg- preserve=no 3D789EFC0327 head32B69F3A0118 "deepContainsElementById"
public boolean deepContainsElementById(String id)
// -end- 3D789EFC0327 head32B69F3A0118 "deepContainsElementById"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D789EFC0327 throws32B69F3A0118 "deepContainsElementById"

// -end- 3D789EFC0327 throws32B69F3A0118 "deepContainsElementById"
;     // empty

/** finds a ModelElement in this Namespace or all its Sub-Namespaces
 */
// -beg- preserve=no 3D789F500346 head32B69F3A0118 "deepGetElementById"
public AbstractEditorElement deepGetElementById(String id)
// -end- 3D789F500346 head32B69F3A0118 "deepGetElementById"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D789F500346 throws32B69F3A0118 "deepGetElementById"

// -end- 3D789F500346 throws32B69F3A0118 "deepGetElementById"
;     // empty

/** add a OwnedElement.
 *  A set of ModelElementsowned by the Namespace.
 *  @see #removeOwnedElement
 *  @see #containsOwnedElement
 *  @see #iteratorOwnedElement
 *  @see #clearOwnedElement
 *  @see #sizeOwnedElement
 *  @see #iteratorOwnedElementLink
 *  @see #createOwnedElementLink
 *  @see #findOwnedElementLink
 */
// -beg- preserve=no 33598CAA030D add_head32B69F3A0118 "Namespace::addOwnedElement"
public void addOwnedElement(ModelElement ownedElement1)
// -end- 33598CAA030D add_head32B69F3A0118 "Namespace::addOwnedElement"
;     // empty

// -beg- preserve=no 33598CAA030D add2_head32B69F3A0118 "Namespace::add2OwnedElement"
public void addOwnedElement(int index,ModelElement ownedElement1)
// -end- 33598CAA030D add2_head32B69F3A0118 "Namespace::add2OwnedElement"
;     // empty

/** add a link to a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D addlink_head32B69F3A0118 "Namespace::addOwnedElementLink"
public void addOwnedElementLink(ElementOwnership ownedElement1)
// -end- 33598CAA030D addlink_head32B69F3A0118 "Namespace::addOwnedElementLink"
;     // empty

/** disconnect a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D remove_head32B69F3A0118 "Namespace::removeOwnedElement"
public ModelElement removeOwnedElement(ModelElement ownedElement1)
// -end- 33598CAA030D remove_head32B69F3A0118 "Namespace::removeOwnedElement"
;     // empty

/** disconnect a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D remove2_head32B69F3A0118 "Namespace::remove2OwnedElement"
public ModelElement removeOwnedElement(int index)
// -end- 33598CAA030D remove2_head32B69F3A0118 "Namespace::remove2OwnedElement"
;     // empty

/** change a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D set_head32B69F3A0118 "Namespace::setOwnedElement"
public ModelElement setOwnedElement(int index,ModelElement ownedElement1)
// -end- 33598CAA030D set_head32B69F3A0118 "Namespace::setOwnedElement"
;     // empty

/** tests if a given OwnedElement is connected.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D test_head32B69F3A0118 "Namespace::containsOwnedElement"
public boolean containsOwnedElement(ModelElement ownedElement1)
// -end- 33598CAA030D test_head32B69F3A0118 "Namespace::containsOwnedElement"
;     // empty

/** used to enumerate all connected OwnedElements.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D get_all_head32B69F3A0118 "Namespace::iteratorOwnedElement"
public Iterator<?> iteratorOwnedElement()
// -end- 33598CAA030D get_all_head32B69F3A0118 "Namespace::iteratorOwnedElement"
;     // empty

/** disconnect all OwnedElements.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D remove_all_head32B69F3A0118 "Namespace::clearOwnedElement"
public void clearOwnedElement()
// -end- 33598CAA030D remove_all_head32B69F3A0118 "Namespace::clearOwnedElement"
;     // empty

/** returns the number of OwnedElements.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D size_head32B69F3A0118 "Namespace::sizeOwnedElement"
public int sizeOwnedElement()
// -end- 33598CAA030D size_head32B69F3A0118 "Namespace::sizeOwnedElement"
;     // empty

/** enumerate the link objects of currently connected OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D itlink_head32B69F3A0118 "Namespace::getOwnedElementLink"
public Iterator<?> iteratorOwnedElementLink()
// -end- 33598CAA030D itlink_head32B69F3A0118 "Namespace::getOwnedElementLink"
;     // empty

/** create a link class for a new link to a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D createlink_head32B69F3A0118 "Namespace::createOwnedElementLink"
public ElementOwnership createOwnedElementLink()
// -end- 33598CAA030D createlink_head32B69F3A0118 "Namespace::createOwnedElementLink"
;     // empty

/** find a link object for a given OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D find_head32B69F3A0118 "Namespace::findOwnedElementLink"
public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
// -end- 33598CAA030D find_head32B69F3A0118 "Namespace::findOwnedElementLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33598CAA030D _link_body32B69F3A0118 "Namespace::_linkOwnedElement"
public void _linkOwnedElement(ElementOwnership ownedElement1);
// -end- 33598CAA030D _link_body32B69F3A0118 "Namespace::_linkOwnedElement"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33598CAA030D _unlink_body32B69F3A0118 "Namespace::_unlinkOwnedElement"
public void _unlinkOwnedElement(ElementOwnership ownedElement1);
// -end- 33598CAA030D _unlink_body32B69F3A0118 "Namespace::_unlinkOwnedElement"

/** add a Diagram.
 *
 *  @see #removeDiagram
 *  @see #containsDiagram
 *  @see #iteratorDiagram
 *  @see #clearDiagram
 *  @see #sizeDiagram
 */
// -beg- preserve=no 3C2C4E4F0248 add_head32B69F3A0118 "Namespace::addDiagram"
public void addDiagram(Diagram diagram1)
// -end- 3C2C4E4F0248 add_head32B69F3A0118 "Namespace::addDiagram"
;     // empty

/** disconnect a Diagram.
 *  @see #addDiagram
 */
// -beg- preserve=no 3C2C4E4F0248 remove_head32B69F3A0118 "Namespace::removeDiagram"
public Diagram removeDiagram(Diagram diagram1)
// -end- 3C2C4E4F0248 remove_head32B69F3A0118 "Namespace::removeDiagram"
;     // empty

/** tests if a given Diagram is connected.
 *  @see #addDiagram
 */
// -beg- preserve=no 3C2C4E4F0248 test_head32B69F3A0118 "Namespace::containsDiagram"
public boolean containsDiagram(Diagram diagram1)
// -end- 3C2C4E4F0248 test_head32B69F3A0118 "Namespace::containsDiagram"
;     // empty

/** used to enumerate all connected Diagrams.
 *  @see #addDiagram
 */
// -beg- preserve=no 3C2C4E4F0248 get_all_head32B69F3A0118 "Namespace::iteratorDiagram"
public Iterator<?> iteratorDiagram()
// -end- 3C2C4E4F0248 get_all_head32B69F3A0118 "Namespace::iteratorDiagram"
;     // empty

/** disconnect all Diagrams.
 *  @see #addDiagram
 */
// -beg- preserve=no 3C2C4E4F0248 remove_all_head32B69F3A0118 "Namespace::clearDiagram"
public void clearDiagram()
// -end- 3C2C4E4F0248 remove_all_head32B69F3A0118 "Namespace::clearDiagram"
;     // empty

/** returns the number of Diagrams.
 *  @see #addDiagram
 */
// -beg- preserve=no 3C2C4E4F0248 size_head32B69F3A0118 "Namespace::sizeDiagram"
public int sizeDiagram()
// -end- 3C2C4E4F0248 size_head32B69F3A0118 "Namespace::sizeDiagram"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3C2C4E4F0248 _link_body32B69F3A0118 "Namespace::_linkDiagram"
public void _linkDiagram(Diagram diagram1);
// -end- 3C2C4E4F0248 _link_body32B69F3A0118 "Namespace::_linkDiagram"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3C2C4E4F0248 _unlink_body32B69F3A0118 "Namespace::_unlinkDiagram"
public void _unlinkDiagram(Diagram diagram1);
// -end- 3C2C4E4F0248 _unlink_body32B69F3A0118 "Namespace::_unlinkDiagram"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 32B69F3A0118 detail_end "Namespace"

// -end- 32B69F3A0118 detail_end "Namespace"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
