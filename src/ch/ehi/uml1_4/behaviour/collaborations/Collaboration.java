// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:48 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 337A47290078 package "Collaboration"
package ch.ehi.uml1_4.behaviour.collaborations;
// -end- 337A47290078 package "Collaboration"

// -beg- preserve=no 337A47290078 autoimport "Collaboration"
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.behaviour.collaborations.Interaction;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.Operation;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
// -end- 337A47290078 autoimport "Collaboration"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 337A47290078 import "Collaboration"

// -end- 337A47290078 import "Collaboration"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:48 $
 */
public interface Collaboration extends GeneralizableElement, Namespace, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 337A47290078 detail_begin "Collaboration"

// -end- 337A47290078 detail_begin "Collaboration"

/** add a Interaction.
 *
 *  @see #removeInteraction
 *  @see #containsInteraction
 *  @see #iteratorInteraction
 *  @see #clearInteraction
 *  @see #sizeInteraction
 */
// -beg- preserve=no 3388DE790122 add_head337A47290078 "Collaboration::addInteraction"
public void addInteraction(Interaction interaction1)
// -end- 3388DE790122 add_head337A47290078 "Collaboration::addInteraction"
;     // empty

/** disconnect a Interaction.
 *  @see #addInteraction
 */
// -beg- preserve=no 3388DE790122 remove_head337A47290078 "Collaboration::removeInteraction"
public Interaction removeInteraction(Interaction interaction1)
// -end- 3388DE790122 remove_head337A47290078 "Collaboration::removeInteraction"
;     // empty

/** tests if a given Interaction is connected.
 *  @see #addInteraction
 */
// -beg- preserve=no 3388DE790122 test_head337A47290078 "Collaboration::containsInteraction"
public boolean containsInteraction(Interaction interaction1)
// -end- 3388DE790122 test_head337A47290078 "Collaboration::containsInteraction"
;     // empty

/** used to enumerate all connected Interactions.
 *  @see #addInteraction
 */
// -beg- preserve=no 3388DE790122 get_all_head337A47290078 "Collaboration::iteratorInteraction"
public java.util.Iterator iteratorInteraction()
// -end- 3388DE790122 get_all_head337A47290078 "Collaboration::iteratorInteraction"
;     // empty

/** disconnect all Interactions.
 *  @see #addInteraction
 */
// -beg- preserve=no 3388DE790122 remove_all_head337A47290078 "Collaboration::clearInteraction"
public void clearInteraction()
// -end- 3388DE790122 remove_all_head337A47290078 "Collaboration::clearInteraction"
;     // empty

/** returns the number of Interactions.
 *  @see #addInteraction
 */
// -beg- preserve=no 3388DE790122 size_head337A47290078 "Collaboration::sizeInteraction"
public int sizeInteraction()
// -end- 3388DE790122 size_head337A47290078 "Collaboration::sizeInteraction"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3388DE790122 _link_body337A47290078 "Collaboration::_linkInteraction"
public void _linkInteraction(Interaction interaction1);
// -end- 3388DE790122 _link_body337A47290078 "Collaboration::_linkInteraction"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3388DE790122 _unlink_body337A47290078 "Collaboration::_unlinkInteraction"
public void _unlinkInteraction(Interaction interaction1);
// -end- 3388DE790122 _unlink_body337A47290078 "Collaboration::_unlinkInteraction"

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
// -beg- preserve=no 33598CAA030D add_head337A47290078 "Namespace::addOwnedElement"
public void addOwnedElement(ModelElement ownedElement1)
// -end- 33598CAA030D add_head337A47290078 "Namespace::addOwnedElement"
;     // empty

// -beg- preserve=no 33598CAA030D add2_head337A47290078 "Namespace::add2OwnedElement"
public void addOwnedElement(int index,ModelElement ownedElement1)
// -end- 33598CAA030D add2_head337A47290078 "Namespace::add2OwnedElement"
;     // empty

/** add a link to a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D addlink_head337A47290078 "Namespace::addOwnedElementLink"
public void addOwnedElementLink(ElementOwnership ownedElement1)
// -end- 33598CAA030D addlink_head337A47290078 "Namespace::addOwnedElementLink"
;     // empty

/** disconnect a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D remove_head337A47290078 "Namespace::removeOwnedElement"
public ModelElement removeOwnedElement(ModelElement ownedElement1)
// -end- 33598CAA030D remove_head337A47290078 "Namespace::removeOwnedElement"
;     // empty

/** disconnect a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D remove2_head337A47290078 "Namespace::remove2OwnedElement"
public ModelElement removeOwnedElement(int index)
// -end- 33598CAA030D remove2_head337A47290078 "Namespace::remove2OwnedElement"
;     // empty

/** change a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D set_head337A47290078 "Namespace::setOwnedElement"
public ModelElement setOwnedElement(int index,ModelElement ownedElement1)
// -end- 33598CAA030D set_head337A47290078 "Namespace::setOwnedElement"
;     // empty

/** tests if a given OwnedElement is connected.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D test_head337A47290078 "Namespace::containsOwnedElement"
public boolean containsOwnedElement(ModelElement ownedElement1)
// -end- 33598CAA030D test_head337A47290078 "Namespace::containsOwnedElement"
;     // empty

/** used to enumerate all connected OwnedElements.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D get_all_head337A47290078 "Namespace::iteratorOwnedElement"
public java.util.Iterator iteratorOwnedElement()
// -end- 33598CAA030D get_all_head337A47290078 "Namespace::iteratorOwnedElement"
;     // empty

/** disconnect all OwnedElements.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D remove_all_head337A47290078 "Namespace::clearOwnedElement"
public void clearOwnedElement()
// -end- 33598CAA030D remove_all_head337A47290078 "Namespace::clearOwnedElement"
;     // empty

/** returns the number of OwnedElements.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D size_head337A47290078 "Namespace::sizeOwnedElement"
public int sizeOwnedElement()
// -end- 33598CAA030D size_head337A47290078 "Namespace::sizeOwnedElement"
;     // empty

/** enumerate the link objects of currently connected OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D itlink_head337A47290078 "Namespace::getOwnedElementLink"
public java.util.Iterator iteratorOwnedElementLink()
// -end- 33598CAA030D itlink_head337A47290078 "Namespace::getOwnedElementLink"
;     // empty

/** create a link class for a new link to a OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D createlink_head337A47290078 "Namespace::createOwnedElementLink"
public ElementOwnership createOwnedElementLink()
// -end- 33598CAA030D createlink_head337A47290078 "Namespace::createOwnedElementLink"
;     // empty

/** find a link object for a given OwnedElement.
 *  @see #addOwnedElement
 */
// -beg- preserve=no 33598CAA030D find_head337A47290078 "Namespace::findOwnedElementLink"
public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
// -end- 33598CAA030D find_head337A47290078 "Namespace::findOwnedElementLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33598CAA030D _link_body337A47290078 "Namespace::_linkOwnedElement"
public void _linkOwnedElement(ElementOwnership ownedElement1);
// -end- 33598CAA030D _link_body337A47290078 "Namespace::_linkOwnedElement"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33598CAA030D _unlink_body337A47290078 "Namespace::_unlinkOwnedElement"
public void _unlinkOwnedElement(ElementOwnership ownedElement1);
// -end- 33598CAA030D _unlink_body337A47290078 "Namespace::_unlinkOwnedElement"

/** add a ConstrainingElement.
 *
 *  @see #removeConstrainingElement
 *  @see #containsConstrainingElement
 *  @see #iteratorConstrainingElement
 *  @see #clearConstrainingElement
 *  @see #sizeConstrainingElement
 */
// -beg- preserve=no 33D1394E029E add_head337A47290078 "Collaboration::addConstrainingElement"
public void addConstrainingElement(ModelElement constrainingElement1)
// -end- 33D1394E029E add_head337A47290078 "Collaboration::addConstrainingElement"
;     // empty

/** disconnect a ConstrainingElement.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 33D1394E029E remove_head337A47290078 "Collaboration::removeConstrainingElement"
public ModelElement removeConstrainingElement(ModelElement constrainingElement1)
// -end- 33D1394E029E remove_head337A47290078 "Collaboration::removeConstrainingElement"
;     // empty

/** tests if a given ConstrainingElement is connected.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 33D1394E029E test_head337A47290078 "Collaboration::containsConstrainingElement"
public boolean containsConstrainingElement(ModelElement constrainingElement1)
// -end- 33D1394E029E test_head337A47290078 "Collaboration::containsConstrainingElement"
;     // empty

/** used to enumerate all connected ConstrainingElements.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 33D1394E029E get_all_head337A47290078 "Collaboration::iteratorConstrainingElement"
public java.util.Iterator iteratorConstrainingElement()
// -end- 33D1394E029E get_all_head337A47290078 "Collaboration::iteratorConstrainingElement"
;     // empty

/** disconnect all ConstrainingElements.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 33D1394E029E remove_all_head337A47290078 "Collaboration::clearConstrainingElement"
public void clearConstrainingElement()
// -end- 33D1394E029E remove_all_head337A47290078 "Collaboration::clearConstrainingElement"
;     // empty

/** returns the number of ConstrainingElements.
 *  @see #addConstrainingElement
 */
// -beg- preserve=no 33D1394E029E size_head337A47290078 "Collaboration::sizeConstrainingElement"
public int sizeConstrainingElement()
// -end- 33D1394E029E size_head337A47290078 "Collaboration::sizeConstrainingElement"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029E _link_body337A47290078 "Collaboration::_linkConstrainingElement"
public void _linkConstrainingElement(ModelElement constrainingElement1);
// -end- 33D1394E029E _link_body337A47290078 "Collaboration::_linkConstrainingElement"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029E _unlink_body337A47290078 "Collaboration::_unlinkConstrainingElement"
public void _unlinkConstrainingElement(ModelElement constrainingElement1);
// -end- 33D1394E029E _unlink_body337A47290078 "Collaboration::_unlinkConstrainingElement"

/** attaches a RepresentedClassifier.
 *
 *  @see #detachRepresentedClassifier
 *  @see #getRepresentedClassifier
 *  @see #containsRepresentedClassifier
 */
// -beg- preserve=no 33D1470E01CC attach_head337A47290078 "Collaboration::attachRepresentedClassifier"
public void attachRepresentedClassifier(Classifier representedClassifier1)
// -end- 33D1470E01CC attach_head337A47290078 "Collaboration::attachRepresentedClassifier"
;     // empty

/** disconnect the currently attached RepresentedClassifier.
 *  @see #attachRepresentedClassifier
 */
// -beg- preserve=no 33D1470E01CC detach_head337A47290078 "Collaboration::detachRepresentedClassifier"
public Classifier detachRepresentedClassifier()
// -end- 33D1470E01CC detach_head337A47290078 "Collaboration::detachRepresentedClassifier"
;     // empty

/** get the currently attached RepresentedClassifier.
 *  @see #attachRepresentedClassifier
 */
// -beg- preserve=no 33D1470E01CC get_head337A47290078 "Collaboration::getRepresentedClassifier"
public Classifier getRepresentedClassifier()
// -end- 33D1470E01CC get_head337A47290078 "Collaboration::getRepresentedClassifier"
;     // empty

/** tests if there is a RepresentedClassifier attached.
 *  @see #attachRepresentedClassifier
 */
// -beg- preserve=no 33D1470E01CC test_head337A47290078 "Collaboration::containsRepresentedClassifier"
public boolean containsRepresentedClassifier()
// -end- 33D1470E01CC test_head337A47290078 "Collaboration::containsRepresentedClassifier"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1470E01CC _link_body337A47290078 "Collaboration::_linkRepresentedClassifier"
public void _linkRepresentedClassifier(Classifier representedClassifier1);
// -end- 33D1470E01CC _link_body337A47290078 "Collaboration::_linkRepresentedClassifier"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1470E01CC _unlink_body337A47290078 "Collaboration::_unlinkRepresentedClassifier"
public void _unlinkRepresentedClassifier(Classifier representedClassifier1);
// -end- 33D1470E01CC _unlink_body337A47290078 "Collaboration::_unlinkRepresentedClassifier"

/** attaches a RepresentedOperation.
 *
 *  @see #detachRepresentedOperation
 *  @see #getRepresentedOperation
 *  @see #containsRepresentedOperation
 */
// -beg- preserve=no 33D1471102F8 attach_head337A47290078 "Collaboration::attachRepresentedOperation"
public void attachRepresentedOperation(Operation representedOperation1)
// -end- 33D1471102F8 attach_head337A47290078 "Collaboration::attachRepresentedOperation"
;     // empty

/** disconnect the currently attached RepresentedOperation.
 *  @see #attachRepresentedOperation
 */
// -beg- preserve=no 33D1471102F8 detach_head337A47290078 "Collaboration::detachRepresentedOperation"
public Operation detachRepresentedOperation()
// -end- 33D1471102F8 detach_head337A47290078 "Collaboration::detachRepresentedOperation"
;     // empty

/** get the currently attached RepresentedOperation.
 *  @see #attachRepresentedOperation
 */
// -beg- preserve=no 33D1471102F8 get_head337A47290078 "Collaboration::getRepresentedOperation"
public Operation getRepresentedOperation()
// -end- 33D1471102F8 get_head337A47290078 "Collaboration::getRepresentedOperation"
;     // empty

/** tests if there is a RepresentedOperation attached.
 *  @see #attachRepresentedOperation
 */
// -beg- preserve=no 33D1471102F8 test_head337A47290078 "Collaboration::containsRepresentedOperation"
public boolean containsRepresentedOperation()
// -end- 33D1471102F8 test_head337A47290078 "Collaboration::containsRepresentedOperation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1471102F8 _link_body337A47290078 "Collaboration::_linkRepresentedOperation"
public void _linkRepresentedOperation(Operation representedOperation1);
// -end- 33D1471102F8 _link_body337A47290078 "Collaboration::_linkRepresentedOperation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1471102F8 _unlink_body337A47290078 "Collaboration::_unlinkRepresentedOperation"
public void _unlinkRepresentedOperation(Operation representedOperation1);
// -end- 33D1471102F8 _unlink_body337A47290078 "Collaboration::_unlinkRepresentedOperation"

/** add a CollaborationInstanceSet.
 *
 *  @see #removeCollaborationInstanceSet
 *  @see #containsCollaborationInstanceSet
 *  @see #iteratorCollaborationInstanceSet
 *  @see #clearCollaborationInstanceSet
 *  @see #sizeCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 add_head337A47290078 "ModelElement::addCollaborationInstanceSet"
public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 add_head337A47290078 "ModelElement::addCollaborationInstanceSet"
;     // empty

/** disconnect a CollaborationInstanceSet.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 remove_head337A47290078 "ModelElement::removeCollaborationInstanceSet"
public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 remove_head337A47290078 "ModelElement::removeCollaborationInstanceSet"
;     // empty

/** tests if a given CollaborationInstanceSet is connected.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 test_head337A47290078 "ModelElement::containsCollaborationInstanceSet"
public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 test_head337A47290078 "ModelElement::containsCollaborationInstanceSet"
;     // empty

/** used to enumerate all connected CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 get_all_head337A47290078 "ModelElement::iteratorCollaborationInstanceSet"
public java.util.Iterator iteratorCollaborationInstanceSet()
// -end- 39E9065C0186 get_all_head337A47290078 "ModelElement::iteratorCollaborationInstanceSet"
;     // empty

/** disconnect all CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 remove_all_head337A47290078 "ModelElement::clearCollaborationInstanceSet"
public void clearCollaborationInstanceSet()
// -end- 39E9065C0186 remove_all_head337A47290078 "ModelElement::clearCollaborationInstanceSet"
;     // empty

/** returns the number of CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 size_head337A47290078 "ModelElement::sizeCollaborationInstanceSet"
public int sizeCollaborationInstanceSet()
// -end- 39E9065C0186 size_head337A47290078 "ModelElement::sizeCollaborationInstanceSet"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9065C0186 _link_body337A47290078 "ModelElement::_linkCollaborationInstanceSet"
public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
// -end- 39E9065C0186 _link_body337A47290078 "ModelElement::_linkCollaborationInstanceSet"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9065C0186 _unlink_body337A47290078 "ModelElement::_unlinkCollaborationInstanceSet"
public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
// -end- 39E9065C0186 _unlink_body337A47290078 "ModelElement::_unlinkCollaborationInstanceSet"

/** add a Collaboration.
 *
 *  @see #removeCollaboration
 *  @see #containsCollaboration
 *  @see #iteratorCollaboration
 *  @see #clearCollaboration
 *  @see #sizeCollaboration
 */
// -beg- preserve=no 33D1394E029F add_head337A47290078 "ModelElement::addCollaboration"
public void addCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F add_head337A47290078 "ModelElement::addCollaboration"
;     // empty

/** disconnect a Collaboration.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_head337A47290078 "ModelElement::removeCollaboration"
public Collaboration removeCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F remove_head337A47290078 "ModelElement::removeCollaboration"
;     // empty

/** tests if a given Collaboration is connected.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F test_head337A47290078 "ModelElement::containsCollaboration"
public boolean containsCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F test_head337A47290078 "ModelElement::containsCollaboration"
;     // empty

/** used to enumerate all connected Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F get_all_head337A47290078 "ModelElement::iteratorCollaboration"
public java.util.Iterator iteratorCollaboration()
// -end- 33D1394E029F get_all_head337A47290078 "ModelElement::iteratorCollaboration"
;     // empty

/** disconnect all Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_all_head337A47290078 "ModelElement::clearCollaboration"
public void clearCollaboration()
// -end- 33D1394E029F remove_all_head337A47290078 "ModelElement::clearCollaboration"
;     // empty

/** returns the number of Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F size_head337A47290078 "ModelElement::sizeCollaboration"
public int sizeCollaboration()
// -end- 33D1394E029F size_head337A47290078 "ModelElement::sizeCollaboration"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _link_body337A47290078 "ModelElement::_linkCollaboration"
public void _linkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _link_body337A47290078 "ModelElement::_linkCollaboration"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _unlink_body337A47290078 "ModelElement::_unlinkCollaboration"
public void _unlinkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _unlink_body337A47290078 "ModelElement::_unlinkCollaboration"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 337A47290078 detail_end "Collaboration"

// -end- 337A47290078 detail_end "Collaboration"

}
