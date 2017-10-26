// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:37 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327A5C7301CC package "ModelElement"
package ch.ehi.uml1_4.foundation.core;
// -end- 327A5C7301CC package "ModelElement"

import java.util.Iterator;

import ch.ehi.basics.types.NlsString;
// -end- 327A5C7301CC autoimport "ModelElement"
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.uml1_4.modelmanagement.Package;

// -end- 327A5C7301CC import "ModelElement"

/** A model element is an element that is an abstraction drawn from the system being modeled.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:37 $
 */
public interface ModelElement extends Element, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A5C7301CC detail_begin "ModelElement"

// -end- 327A5C7301CC detail_begin "ModelElement"

// -beg- preserve=no 3CE2221702C6 head327A5C7301CC "getDefLangName"
public String getDefLangName()
// -end- 3CE2221702C6 head327A5C7301CC "getDefLangName"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CE2221702C6 throws327A5C7301CC "getDefLangName"

// -end- 3CE2221702C6 throws327A5C7301CC "getDefLangName"
;     // empty

// -beg- preserve=no 3CE222250149 head327A5C7301CC "setDefLangName"
public void setDefLangName(String name)
// -end- 3CE222250149 head327A5C7301CC "setDefLangName"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CE222250149 throws327A5C7301CC "setDefLangName"

// -end- 3CE222250149 throws327A5C7301CC "setDefLangName"
;     // empty

/** add a Behavior.
 *
 *  @see #removeBehavior
 *  @see #containsBehavior
 *  @see #iteratorBehavior
 *  @see #clearBehavior
 *  @see #sizeBehavior
 */
// -beg- preserve=no 33CF8BD500F1 add_head327A5C7301CC "ModelElement::addBehavior"
public void addBehavior(StateMachine behavior1)
// -end- 33CF8BD500F1 add_head327A5C7301CC "ModelElement::addBehavior"
;     // empty

/** disconnect a Behavior.
 *  @see #addBehavior
 */
// -beg- preserve=no 33CF8BD500F1 remove_head327A5C7301CC "ModelElement::removeBehavior"
public StateMachine removeBehavior(StateMachine behavior1)
// -end- 33CF8BD500F1 remove_head327A5C7301CC "ModelElement::removeBehavior"
;     // empty

/** tests if a given Behavior is connected.
 *  @see #addBehavior
 */
// -beg- preserve=no 33CF8BD500F1 test_head327A5C7301CC "ModelElement::containsBehavior"
public boolean containsBehavior(StateMachine behavior1)
// -end- 33CF8BD500F1 test_head327A5C7301CC "ModelElement::containsBehavior"
;     // empty

/** used to enumerate all connected Behaviors.
 *  @see #addBehavior
 */
// -beg- preserve=no 33CF8BD500F1 get_all_head327A5C7301CC "ModelElement::iteratorBehavior"
public Iterator<?> iteratorBehavior()
// -end- 33CF8BD500F1 get_all_head327A5C7301CC "ModelElement::iteratorBehavior"
;     // empty

/** disconnect all Behaviors.
 *  @see #addBehavior
 */
// -beg- preserve=no 33CF8BD500F1 remove_all_head327A5C7301CC "ModelElement::clearBehavior"
public void clearBehavior()
// -end- 33CF8BD500F1 remove_all_head327A5C7301CC "ModelElement::clearBehavior"
;     // empty

/** returns the number of Behaviors.
 *  @see #addBehavior
 */
// -beg- preserve=no 33CF8BD500F1 size_head327A5C7301CC "ModelElement::sizeBehavior"
public int sizeBehavior()
// -end- 33CF8BD500F1 size_head327A5C7301CC "ModelElement::sizeBehavior"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF8BD500F1 _link_body327A5C7301CC "ModelElement::_linkBehavior"
public void _linkBehavior(StateMachine behavior1);
// -end- 33CF8BD500F1 _link_body327A5C7301CC "ModelElement::_linkBehavior"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF8BD500F1 _unlink_body327A5C7301CC "ModelElement::_unlinkBehavior"
public void _unlinkBehavior(StateMachine behavior1);
// -end- 33CF8BD500F1 _unlink_body327A5C7301CC "ModelElement::_unlinkBehavior"

/** add a Partition.
 *
 *  @see #removePartition
 *  @see #containsPartition
 *  @see #iteratorPartition
 *  @see #clearPartition
 *  @see #sizePartition
 */
// -beg- preserve=no 33CF9A030140 add_head327A5C7301CC "ModelElement::addPartition"
public void addPartition(Partition partition1)
// -end- 33CF9A030140 add_head327A5C7301CC "ModelElement::addPartition"
;     // empty

/** disconnect a Partition.
 *  @see #addPartition
 */
// -beg- preserve=no 33CF9A030140 remove_head327A5C7301CC "ModelElement::removePartition"
public Partition removePartition(Partition partition1)
// -end- 33CF9A030140 remove_head327A5C7301CC "ModelElement::removePartition"
;     // empty

/** tests if a given Partition is connected.
 *  @see #addPartition
 */
// -beg- preserve=no 33CF9A030140 test_head327A5C7301CC "ModelElement::containsPartition"
public boolean containsPartition(Partition partition1)
// -end- 33CF9A030140 test_head327A5C7301CC "ModelElement::containsPartition"
;     // empty

/** used to enumerate all connected Partitions.
 *  @see #addPartition
 */
// -beg- preserve=no 33CF9A030140 get_all_head327A5C7301CC "ModelElement::iteratorPartition"
public Iterator<?> iteratorPartition()
// -end- 33CF9A030140 get_all_head327A5C7301CC "ModelElement::iteratorPartition"
;     // empty

/** disconnect all Partitions.
 *  @see #addPartition
 */
// -beg- preserve=no 33CF9A030140 remove_all_head327A5C7301CC "ModelElement::clearPartition"
public void clearPartition()
// -end- 33CF9A030140 remove_all_head327A5C7301CC "ModelElement::clearPartition"
;     // empty

/** returns the number of Partitions.
 *  @see #addPartition
 */
// -beg- preserve=no 33CF9A030140 size_head327A5C7301CC "ModelElement::sizePartition"
public int sizePartition()
// -end- 33CF9A030140 size_head327A5C7301CC "ModelElement::sizePartition"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9A030140 _link_body327A5C7301CC "ModelElement::_linkPartition"
public void _linkPartition(Partition partition1);
// -end- 33CF9A030140 _link_body327A5C7301CC "ModelElement::_linkPartition"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9A030140 _unlink_body327A5C7301CC "ModelElement::_unlinkPartition"
public void _unlinkPartition(Partition partition1);
// -end- 33CF9A030140 _unlink_body327A5C7301CC "ModelElement::_unlinkPartition"

/** add a Collaboration.
 *
 *  @see #removeCollaboration
 *  @see #containsCollaboration
 *  @see #iteratorCollaboration
 *  @see #clearCollaboration
 *  @see #sizeCollaboration
 */
// -beg- preserve=no 33D1394E029F add_head327A5C7301CC "ModelElement::addCollaboration"
public void addCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F add_head327A5C7301CC "ModelElement::addCollaboration"
;     // empty

/** disconnect a Collaboration.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_head327A5C7301CC "ModelElement::removeCollaboration"
public Collaboration removeCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F remove_head327A5C7301CC "ModelElement::removeCollaboration"
;     // empty

/** tests if a given Collaboration is connected.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F test_head327A5C7301CC "ModelElement::containsCollaboration"
public boolean containsCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F test_head327A5C7301CC "ModelElement::containsCollaboration"
;     // empty

/** used to enumerate all connected Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F get_all_head327A5C7301CC "ModelElement::iteratorCollaboration"
public Iterator<?> iteratorCollaboration()
// -end- 33D1394E029F get_all_head327A5C7301CC "ModelElement::iteratorCollaboration"
;     // empty

/** disconnect all Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_all_head327A5C7301CC "ModelElement::clearCollaboration"
public void clearCollaboration()
// -end- 33D1394E029F remove_all_head327A5C7301CC "ModelElement::clearCollaboration"
;     // empty

/** returns the number of Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F size_head327A5C7301CC "ModelElement::sizeCollaboration"
public int sizeCollaboration()
// -end- 33D1394E029F size_head327A5C7301CC "ModelElement::sizeCollaboration"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _link_body327A5C7301CC "ModelElement::_linkCollaboration"
public void _linkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _link_body327A5C7301CC "ModelElement::_linkCollaboration"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _unlink_body327A5C7301CC "ModelElement::_unlinkCollaboration"
public void _unlinkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _unlink_body327A5C7301CC "ModelElement::_unlinkCollaboration"

/** add a ClassifierRole.
 *
 *  @see #removeClassifierRole
 *  @see #containsClassifierRole
 *  @see #iteratorClassifierRole
 *  @see #clearClassifierRole
 *  @see #sizeClassifierRole
 */
// -beg- preserve=no 36008FB700E7 add_head327A5C7301CC "ModelElement::addClassifierRole"
public void addClassifierRole(ClassifierRole classifierRole1)
// -end- 36008FB700E7 add_head327A5C7301CC "ModelElement::addClassifierRole"
;     // empty

/** disconnect a ClassifierRole.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 remove_head327A5C7301CC "ModelElement::removeClassifierRole"
public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
// -end- 36008FB700E7 remove_head327A5C7301CC "ModelElement::removeClassifierRole"
;     // empty

/** tests if a given ClassifierRole is connected.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 test_head327A5C7301CC "ModelElement::containsClassifierRole"
public boolean containsClassifierRole(ClassifierRole classifierRole1)
// -end- 36008FB700E7 test_head327A5C7301CC "ModelElement::containsClassifierRole"
;     // empty

/** used to enumerate all connected ClassifierRoles.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 get_all_head327A5C7301CC "ModelElement::iteratorClassifierRole"
public Iterator<?> iteratorClassifierRole()
// -end- 36008FB700E7 get_all_head327A5C7301CC "ModelElement::iteratorClassifierRole"
;     // empty

/** disconnect all ClassifierRoles.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 remove_all_head327A5C7301CC "ModelElement::clearClassifierRole"
public void clearClassifierRole()
// -end- 36008FB700E7 remove_all_head327A5C7301CC "ModelElement::clearClassifierRole"
;     // empty

/** returns the number of ClassifierRoles.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 size_head327A5C7301CC "ModelElement::sizeClassifierRole"
public int sizeClassifierRole()
// -end- 36008FB700E7 size_head327A5C7301CC "ModelElement::sizeClassifierRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36008FB700E7 _link_body327A5C7301CC "ModelElement::_linkClassifierRole"
public void _linkClassifierRole(ClassifierRole classifierRole1);
// -end- 36008FB700E7 _link_body327A5C7301CC "ModelElement::_linkClassifierRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36008FB700E7 _unlink_body327A5C7301CC "ModelElement::_unlinkClassifierRole"
public void _unlinkClassifierRole(ClassifierRole classifierRole1);
// -end- 36008FB700E7 _unlink_body327A5C7301CC "ModelElement::_unlinkClassifierRole"

/** add a CollaborationInstanceSet.
 *
 *  @see #removeCollaborationInstanceSet
 *  @see #containsCollaborationInstanceSet
 *  @see #iteratorCollaborationInstanceSet
 *  @see #clearCollaborationInstanceSet
 *  @see #sizeCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 add_head327A5C7301CC "ModelElement::addCollaborationInstanceSet"
public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 add_head327A5C7301CC "ModelElement::addCollaborationInstanceSet"
;     // empty

/** disconnect a CollaborationInstanceSet.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 remove_head327A5C7301CC "ModelElement::removeCollaborationInstanceSet"
public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 remove_head327A5C7301CC "ModelElement::removeCollaborationInstanceSet"
;     // empty

/** tests if a given CollaborationInstanceSet is connected.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 test_head327A5C7301CC "ModelElement::containsCollaborationInstanceSet"
public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
// -end- 39E9065C0186 test_head327A5C7301CC "ModelElement::containsCollaborationInstanceSet"
;     // empty

/** used to enumerate all connected CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 get_all_head327A5C7301CC "ModelElement::iteratorCollaborationInstanceSet"
public Iterator<?> iteratorCollaborationInstanceSet()
// -end- 39E9065C0186 get_all_head327A5C7301CC "ModelElement::iteratorCollaborationInstanceSet"
;     // empty

/** disconnect all CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 remove_all_head327A5C7301CC "ModelElement::clearCollaborationInstanceSet"
public void clearCollaborationInstanceSet()
// -end- 39E9065C0186 remove_all_head327A5C7301CC "ModelElement::clearCollaborationInstanceSet"
;     // empty

/** returns the number of CollaborationInstanceSets.
 *  @see #addCollaborationInstanceSet
 */
// -beg- preserve=no 39E9065C0186 size_head327A5C7301CC "ModelElement::sizeCollaborationInstanceSet"
public int sizeCollaborationInstanceSet()
// -end- 39E9065C0186 size_head327A5C7301CC "ModelElement::sizeCollaborationInstanceSet"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9065C0186 _link_body327A5C7301CC "ModelElement::_linkCollaborationInstanceSet"
public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
// -end- 39E9065C0186 _link_body327A5C7301CC "ModelElement::_linkCollaborationInstanceSet"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39E9065C0186 _unlink_body327A5C7301CC "ModelElement::_unlinkCollaborationInstanceSet"
public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1);
// -end- 39E9065C0186 _unlink_body327A5C7301CC "ModelElement::_unlinkCollaborationInstanceSet"

/** attaches a Namespace.
 *  Designates the Namespace that contains the ModelElement.
 *  @see #detachNamespace
 *  @see #getNamespace
 *  @see #containsNamespace
 *  @see #getNamespaceLink
 *  @see #createNamespaceLink
 */
// -beg- preserve=no 33598CAA030E attach_head327A5C7301CC "ModelElement::attachNamespace"
public void attachNamespace(Namespace namespace1)
// -end- 33598CAA030E attach_head327A5C7301CC "ModelElement::attachNamespace"
;     // empty

/** attaches a link to a Namespace.
 *  @see #attachNamespace
 */
// -beg- preserve=no 33598CAA030E attachlink_head327A5C7301CC "ModelElement::attachNamespaceLink"
public void attachNamespaceLink(ElementOwnership namespace1)
// -end- 33598CAA030E attachlink_head327A5C7301CC "ModelElement::attachNamespaceLink"
;     // empty

/** disconnect the currently attached Namespace.
 *  @see #attachNamespace
 */
// -beg- preserve=no 33598CAA030E detach_head327A5C7301CC "ModelElement::detachNamespace"
public Namespace detachNamespace()
// -end- 33598CAA030E detach_head327A5C7301CC "ModelElement::detachNamespace"
;     // empty

/** get the currently attached Namespace.
 *  @see #attachNamespace
 */
// -beg- preserve=no 33598CAA030E get_head327A5C7301CC "ModelElement::getNamespace"
public Namespace getNamespace()
// -end- 33598CAA030E get_head327A5C7301CC "ModelElement::getNamespace"
;     // empty

/** get the link class of currently attached Namespace.
 *  @see #attachNamespace
 */
// -beg- preserve=no 33598CAA030E getlink_head327A5C7301CC "ModelElement::getNamespaceLink"
public ElementOwnership getNamespaceLink()
// -end- 33598CAA030E getlink_head327A5C7301CC "ModelElement::getNamespaceLink"
;     // empty

/** create a link class for a new link to a Namespace.
 *  @see #attachNamespace
 */
// -beg- preserve=no 33598CAA030E createlink_head327A5C7301CC "ModelElement::createNamespaceLink"
public ElementOwnership createNamespaceLink()
// -end- 33598CAA030E createlink_head327A5C7301CC "ModelElement::createNamespaceLink"
;     // empty

/** tests if there is a Namespace attached.
 *  @see #attachNamespace
 */
// -beg- preserve=no 33598CAA030E test_head327A5C7301CC "ModelElement::containsNamespace"
public boolean containsNamespace()
// -end- 33598CAA030E test_head327A5C7301CC "ModelElement::containsNamespace"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33598CAA030E _link_body327A5C7301CC "ModelElement::_linkNamespace"
public void _linkNamespace(ElementOwnership namespace1);
// -end- 33598CAA030E _link_body327A5C7301CC "ModelElement::_linkNamespace"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33598CAA030E _unlink_body327A5C7301CC "ModelElement::_unlinkNamespace"
public void _unlinkNamespace(ElementOwnership namespace1);
// -end- 33598CAA030E _unlink_body327A5C7301CC "ModelElement::_unlinkNamespace"

/** add a ClientDependency.
 *
 *  @see #removeClientDependency
 *  @see #containsClientDependency
 *  @see #iteratorClientDependency
 *  @see #clearClientDependency
 *  @see #sizeClientDependency
 */
// -beg- preserve=no 33FFE57B0395 add_head327A5C7301CC "ModelElement::addClientDependency"
public void addClientDependency(Dependency clientDependency1)
// -end- 33FFE57B0395 add_head327A5C7301CC "ModelElement::addClientDependency"
;     // empty

/** disconnect a ClientDependency.
 *  @see #addClientDependency
 */
// -beg- preserve=no 33FFE57B0395 remove_head327A5C7301CC "ModelElement::removeClientDependency"
public Dependency removeClientDependency(Dependency clientDependency1)
// -end- 33FFE57B0395 remove_head327A5C7301CC "ModelElement::removeClientDependency"
;     // empty

/** tests if a given ClientDependency is connected.
 *  @see #addClientDependency
 */
// -beg- preserve=no 33FFE57B0395 test_head327A5C7301CC "ModelElement::containsClientDependency"
public boolean containsClientDependency(Dependency clientDependency1)
// -end- 33FFE57B0395 test_head327A5C7301CC "ModelElement::containsClientDependency"
;     // empty

/** used to enumerate all connected ClientDependencys.
 *  @see #addClientDependency
 */
// -beg- preserve=no 33FFE57B0395 get_all_head327A5C7301CC "ModelElement::iteratorClientDependency"
public Iterator<?> iteratorClientDependency()
// -end- 33FFE57B0395 get_all_head327A5C7301CC "ModelElement::iteratorClientDependency"
;     // empty

/** disconnect all ClientDependencys.
 *  @see #addClientDependency
 */
// -beg- preserve=no 33FFE57B0395 remove_all_head327A5C7301CC "ModelElement::clearClientDependency"
public void clearClientDependency()
// -end- 33FFE57B0395 remove_all_head327A5C7301CC "ModelElement::clearClientDependency"
;     // empty

/** returns the number of ClientDependencys.
 *  @see #addClientDependency
 */
// -beg- preserve=no 33FFE57B0395 size_head327A5C7301CC "ModelElement::sizeClientDependency"
public int sizeClientDependency()
// -end- 33FFE57B0395 size_head327A5C7301CC "ModelElement::sizeClientDependency"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FFE57B0395 _link_body327A5C7301CC "ModelElement::_linkClientDependency"
public void _linkClientDependency(Dependency clientDependency1);
// -end- 33FFE57B0395 _link_body327A5C7301CC "ModelElement::_linkClientDependency"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FFE57B0395 _unlink_body327A5C7301CC "ModelElement::_unlinkClientDependency"
public void _unlinkClientDependency(Dependency clientDependency1);
// -end- 33FFE57B0395 _unlink_body327A5C7301CC "ModelElement::_unlinkClientDependency"

/** add a TaggedValue.
 *
 *  @see #removeTaggedValue
 *  @see #containsTaggedValue
 *  @see #iteratorTaggedValue
 *  @see #clearTaggedValue
 *  @see #sizeTaggedValue
 */
// -beg- preserve=no 33E901E003D4 add_head327A5C7301CC "ModelElement::addTaggedValue"
public void addTaggedValue(TaggedValue taggedValue1)
// -end- 33E901E003D4 add_head327A5C7301CC "ModelElement::addTaggedValue"
;     // empty

/** disconnect a TaggedValue.
 *  @see #addTaggedValue
 */
// -beg- preserve=no 33E901E003D4 remove_head327A5C7301CC "ModelElement::removeTaggedValue"
public TaggedValue removeTaggedValue(TaggedValue taggedValue1)
// -end- 33E901E003D4 remove_head327A5C7301CC "ModelElement::removeTaggedValue"
;     // empty

/** tests if a given TaggedValue is connected.
 *  @see #addTaggedValue
 */
// -beg- preserve=no 33E901E003D4 test_head327A5C7301CC "ModelElement::containsTaggedValue"
public boolean containsTaggedValue(TaggedValue taggedValue1)
// -end- 33E901E003D4 test_head327A5C7301CC "ModelElement::containsTaggedValue"
;     // empty

/** used to enumerate all connected TaggedValues.
 *  @see #addTaggedValue
 */
// -beg- preserve=no 33E901E003D4 get_all_head327A5C7301CC "ModelElement::iteratorTaggedValue"
public Iterator<?> iteratorTaggedValue()
// -end- 33E901E003D4 get_all_head327A5C7301CC "ModelElement::iteratorTaggedValue"
;     // empty

/** disconnect all TaggedValues.
 *  @see #addTaggedValue
 */
// -beg- preserve=no 33E901E003D4 remove_all_head327A5C7301CC "ModelElement::clearTaggedValue"
public void clearTaggedValue()
// -end- 33E901E003D4 remove_all_head327A5C7301CC "ModelElement::clearTaggedValue"
;     // empty

/** returns the number of TaggedValues.
 *  @see #addTaggedValue
 */
// -beg- preserve=no 33E901E003D4 size_head327A5C7301CC "ModelElement::sizeTaggedValue"
public int sizeTaggedValue()
// -end- 33E901E003D4 size_head327A5C7301CC "ModelElement::sizeTaggedValue"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33E901E003D4 _link_body327A5C7301CC "ModelElement::_linkTaggedValue"
public void _linkTaggedValue(TaggedValue taggedValue1);
// -end- 33E901E003D4 _link_body327A5C7301CC "ModelElement::_linkTaggedValue"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33E901E003D4 _unlink_body327A5C7301CC "ModelElement::_unlinkTaggedValue"
public void _unlinkTaggedValue(TaggedValue taggedValue1);
// -end- 33E901E003D4 _unlink_body327A5C7301CC "ModelElement::_unlinkTaggedValue"

/** add a Constraint.
 *
 *  @see #removeConstraint
 *  @see #containsConstraint
 *  @see #iteratorConstraint
 *  @see #clearConstraint
 *  @see #sizeConstraint
 */
// -beg- preserve=no 33EA67BB010E add_head327A5C7301CC "ModelElement::addConstraint"
public void addConstraint(Constraint constraint1)
// -end- 33EA67BB010E add_head327A5C7301CC "ModelElement::addConstraint"
;     // empty

/** disconnect a Constraint.
 *  @see #addConstraint
 */
// -beg- preserve=no 33EA67BB010E remove_head327A5C7301CC "ModelElement::removeConstraint"
public Constraint removeConstraint(Constraint constraint1)
// -end- 33EA67BB010E remove_head327A5C7301CC "ModelElement::removeConstraint"
;     // empty

/** tests if a given Constraint is connected.
 *  @see #addConstraint
 */
// -beg- preserve=no 33EA67BB010E test_head327A5C7301CC "ModelElement::containsConstraint"
public boolean containsConstraint(Constraint constraint1)
// -end- 33EA67BB010E test_head327A5C7301CC "ModelElement::containsConstraint"
;     // empty

/** used to enumerate all connected Constraints.
 *  @see #addConstraint
 */
// -beg- preserve=no 33EA67BB010E get_all_head327A5C7301CC "ModelElement::iteratorConstraint"
public Iterator<?> iteratorConstraint()
// -end- 33EA67BB010E get_all_head327A5C7301CC "ModelElement::iteratorConstraint"
;     // empty

/** disconnect all Constraints.
 *  @see #addConstraint
 */
// -beg- preserve=no 33EA67BB010E remove_all_head327A5C7301CC "ModelElement::clearConstraint"
public void clearConstraint()
// -end- 33EA67BB010E remove_all_head327A5C7301CC "ModelElement::clearConstraint"
;     // empty

/** returns the number of Constraints.
 *  @see #addConstraint
 */
// -beg- preserve=no 33EA67BB010E size_head327A5C7301CC "ModelElement::sizeConstraint"
public int sizeConstraint()
// -end- 33EA67BB010E size_head327A5C7301CC "ModelElement::sizeConstraint"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33EA67BB010E _link_body327A5C7301CC "ModelElement::_linkConstraint"
public void _linkConstraint(Constraint constraint1);
// -end- 33EA67BB010E _link_body327A5C7301CC "ModelElement::_linkConstraint"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33EA67BB010E _unlink_body327A5C7301CC "ModelElement::_unlinkConstraint"
public void _unlinkConstraint(Constraint constraint1);
// -end- 33EA67BB010E _unlink_body327A5C7301CC "ModelElement::_unlinkConstraint"

/** add a SupplierDependency.
 *
 *  @see #removeSupplierDependency
 *  @see #containsSupplierDependency
 *  @see #iteratorSupplierDependency
 *  @see #clearSupplierDependency
 *  @see #sizeSupplierDependency
 */
// -beg- preserve=no 335C0D7A02A8 add_head327A5C7301CC "ModelElement::addSupplierDependency"
public void addSupplierDependency(Dependency supplierDependency1)
// -end- 335C0D7A02A8 add_head327A5C7301CC "ModelElement::addSupplierDependency"
;     // empty

/** disconnect a SupplierDependency.
 *  @see #addSupplierDependency
 */
// -beg- preserve=no 335C0D7A02A8 remove_head327A5C7301CC "ModelElement::removeSupplierDependency"
public Dependency removeSupplierDependency(Dependency supplierDependency1)
// -end- 335C0D7A02A8 remove_head327A5C7301CC "ModelElement::removeSupplierDependency"
;     // empty

/** tests if a given SupplierDependency is connected.
 *  @see #addSupplierDependency
 */
// -beg- preserve=no 335C0D7A02A8 test_head327A5C7301CC "ModelElement::containsSupplierDependency"
public boolean containsSupplierDependency(Dependency supplierDependency1)
// -end- 335C0D7A02A8 test_head327A5C7301CC "ModelElement::containsSupplierDependency"
;     // empty

/** used to enumerate all connected SupplierDependencys.
 *  @see #addSupplierDependency
 */
// -beg- preserve=no 335C0D7A02A8 get_all_head327A5C7301CC "ModelElement::iteratorSupplierDependency"
public Iterator<?> iteratorSupplierDependency()
// -end- 335C0D7A02A8 get_all_head327A5C7301CC "ModelElement::iteratorSupplierDependency"
;     // empty

/** disconnect all SupplierDependencys.
 *  @see #addSupplierDependency
 */
// -beg- preserve=no 335C0D7A02A8 remove_all_head327A5C7301CC "ModelElement::clearSupplierDependency"
public void clearSupplierDependency()
// -end- 335C0D7A02A8 remove_all_head327A5C7301CC "ModelElement::clearSupplierDependency"
;     // empty

/** returns the number of SupplierDependencys.
 *  @see #addSupplierDependency
 */
// -beg- preserve=no 335C0D7A02A8 size_head327A5C7301CC "ModelElement::sizeSupplierDependency"
public int sizeSupplierDependency()
// -end- 335C0D7A02A8 size_head327A5C7301CC "ModelElement::sizeSupplierDependency"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 335C0D7A02A8 _link_body327A5C7301CC "ModelElement::_linkSupplierDependency"
public void _linkSupplierDependency(Dependency supplierDependency1);
// -end- 335C0D7A02A8 _link_body327A5C7301CC "ModelElement::_linkSupplierDependency"

/** DONT USE; link management internal
 */
// -beg- preserve=no 335C0D7A02A8 _unlink_body327A5C7301CC "ModelElement::_unlinkSupplierDependency"
public void _unlinkSupplierDependency(Dependency supplierDependency1);
// -end- 335C0D7A02A8 _unlink_body327A5C7301CC "ModelElement::_unlinkSupplierDependency"

/** add a Presentation.
 *
 *  @see #removePresentation
 *  @see #containsPresentation
 *  @see #iteratorPresentation
 *  @see #clearPresentation
 *  @see #sizePresentation
 */
// -beg- preserve=no 362409A9000A add_head327A5C7301CC "ModelElement::addPresentation"
public void addPresentation(PresentationElement presentation1)
// -end- 362409A9000A add_head327A5C7301CC "ModelElement::addPresentation"
;     // empty

/** disconnect a Presentation.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_head327A5C7301CC "ModelElement::removePresentation"
public PresentationElement removePresentation(PresentationElement presentation1)
// -end- 362409A9000A remove_head327A5C7301CC "ModelElement::removePresentation"
;     // empty

/** tests if a given Presentation is connected.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A test_head327A5C7301CC "ModelElement::containsPresentation"
public boolean containsPresentation(PresentationElement presentation1)
// -end- 362409A9000A test_head327A5C7301CC "ModelElement::containsPresentation"
;     // empty

/** used to enumerate all connected Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A get_all_head327A5C7301CC "ModelElement::iteratorPresentation"
public Iterator<?> iteratorPresentation()
// -end- 362409A9000A get_all_head327A5C7301CC "ModelElement::iteratorPresentation"
;     // empty

/** disconnect all Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_all_head327A5C7301CC "ModelElement::clearPresentation"
public void clearPresentation()
// -end- 362409A9000A remove_all_head327A5C7301CC "ModelElement::clearPresentation"
;     // empty

/** returns the number of Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A size_head327A5C7301CC "ModelElement::sizePresentation"
public int sizePresentation()
// -end- 362409A9000A size_head327A5C7301CC "ModelElement::sizePresentation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _link_body327A5C7301CC "ModelElement::_linkPresentation"
public void _linkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _link_body327A5C7301CC "ModelElement::_linkPresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _unlink_body327A5C7301CC "ModelElement::_unlinkPresentation"
public void _unlinkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _unlink_body327A5C7301CC "ModelElement::_unlinkPresentation"

/** add a Container.
 *
 *  @see #removeContainer
 *  @see #containsContainer
 *  @see #iteratorContainer
 *  @see #clearContainer
 *  @see #sizeContainer
 *  @see #iteratorContainerLink
 *  @see #createContainerLink
 *  @see #findContainerLink
 */
// -beg- preserve=no 36240CA4024E add_head327A5C7301CC "ModelElement::addContainer"
public void addContainer(Component container1)
// -end- 36240CA4024E add_head327A5C7301CC "ModelElement::addContainer"
;     // empty

/** add a link to a Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E addlink_head327A5C7301CC "ModelElement::addContainerLink"
public void addContainerLink(ElementResidence container1)
// -end- 36240CA4024E addlink_head327A5C7301CC "ModelElement::addContainerLink"
;     // empty

/** disconnect a Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E remove_head327A5C7301CC "ModelElement::removeContainer"
public Component removeContainer(Component container1)
// -end- 36240CA4024E remove_head327A5C7301CC "ModelElement::removeContainer"
;     // empty

/** tests if a given Container is connected.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E test_head327A5C7301CC "ModelElement::containsContainer"
public boolean containsContainer(Component container1)
// -end- 36240CA4024E test_head327A5C7301CC "ModelElement::containsContainer"
;     // empty

/** used to enumerate all connected Containers.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E get_all_head327A5C7301CC "ModelElement::iteratorContainer"
public Iterator<?> iteratorContainer()
// -end- 36240CA4024E get_all_head327A5C7301CC "ModelElement::iteratorContainer"
;     // empty

/** disconnect all Containers.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E remove_all_head327A5C7301CC "ModelElement::clearContainer"
public void clearContainer()
// -end- 36240CA4024E remove_all_head327A5C7301CC "ModelElement::clearContainer"
;     // empty

/** returns the number of Containers.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E size_head327A5C7301CC "ModelElement::sizeContainer"
public int sizeContainer()
// -end- 36240CA4024E size_head327A5C7301CC "ModelElement::sizeContainer"
;     // empty

/** enumerate the link objects of currently connected Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E itlink_head327A5C7301CC "ModelElement::getContainerLink"
public Iterator<?> iteratorContainerLink()
// -end- 36240CA4024E itlink_head327A5C7301CC "ModelElement::getContainerLink"
;     // empty

/** create a link class for a new link to a Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E createlink_head327A5C7301CC "ModelElement::createContainerLink"
public ElementResidence createContainerLink()
// -end- 36240CA4024E createlink_head327A5C7301CC "ModelElement::createContainerLink"
;     // empty

/** find a link object for a given Container.
 *  @see #addContainer
 */
// -beg- preserve=no 36240CA4024E find_head327A5C7301CC "ModelElement::findContainerLink"
public ElementResidence findContainerLink(Component container1)
// -end- 36240CA4024E find_head327A5C7301CC "ModelElement::findContainerLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240CA4024E _link_body327A5C7301CC "ModelElement::_linkContainer"
public void _linkContainer(ElementResidence container1);
// -end- 36240CA4024E _link_body327A5C7301CC "ModelElement::_linkContainer"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240CA4024E _unlink_body327A5C7301CC "ModelElement::_unlinkContainer"
public void _unlinkContainer(ElementResidence container1);
// -end- 36240CA4024E _unlink_body327A5C7301CC "ModelElement::_unlinkContainer"

/** add a TemplateParameter.
 *
 *  @see #removeTemplateParameter
 *  @see #containsTemplateParameter
 *  @see #iteratorTemplateParameter
 *  @see #clearTemplateParameter
 *  @see #sizeTemplateParameter
 */
// -beg- preserve=no 36240F380050 add_head327A5C7301CC "ModelElement::addTemplateParameter"
public void addTemplateParameter(TemplateParameter templateParameter1)
// -end- 36240F380050 add_head327A5C7301CC "ModelElement::addTemplateParameter"
;     // empty

// -beg- preserve=no 36240F380050 add2_head327A5C7301CC "ModelElement::add2TemplateParameter"
public void addTemplateParameter(int index,TemplateParameter templateParameter1)
// -end- 36240F380050 add2_head327A5C7301CC "ModelElement::add2TemplateParameter"
;     // empty

/** disconnect a TemplateParameter.
 *  @see #addTemplateParameter
 */
// -beg- preserve=no 36240F380050 remove_head327A5C7301CC "ModelElement::removeTemplateParameter"
public TemplateParameter removeTemplateParameter(TemplateParameter templateParameter1)
// -end- 36240F380050 remove_head327A5C7301CC "ModelElement::removeTemplateParameter"
;     // empty

/** disconnect a TemplateParameter.
 *  @see #addTemplateParameter
 */
// -beg- preserve=no 36240F380050 remove2_head327A5C7301CC "ModelElement::remove2TemplateParameter"
public TemplateParameter removeTemplateParameter(int index)
// -end- 36240F380050 remove2_head327A5C7301CC "ModelElement::remove2TemplateParameter"
;     // empty

/** change a TemplateParameter.
 *  @see #addTemplateParameter
 */
// -beg- preserve=no 36240F380050 set_head327A5C7301CC "ModelElement::setTemplateParameter"
public TemplateParameter setTemplateParameter(int index,TemplateParameter templateParameter1)
// -end- 36240F380050 set_head327A5C7301CC "ModelElement::setTemplateParameter"
;     // empty

/** tests if a given TemplateParameter is connected.
 *  @see #addTemplateParameter
 */
// -beg- preserve=no 36240F380050 test_head327A5C7301CC "ModelElement::containsTemplateParameter"
public boolean containsTemplateParameter(TemplateParameter templateParameter1)
// -end- 36240F380050 test_head327A5C7301CC "ModelElement::containsTemplateParameter"
;     // empty

/** used to enumerate all connected TemplateParameters.
 *  @see #addTemplateParameter
 */
// -beg- preserve=no 36240F380050 get_all_head327A5C7301CC "ModelElement::iteratorTemplateParameter"
public Iterator<?> iteratorTemplateParameter()
// -end- 36240F380050 get_all_head327A5C7301CC "ModelElement::iteratorTemplateParameter"
;     // empty

/** disconnect all TemplateParameters.
 *  @see #addTemplateParameter
 */
// -beg- preserve=no 36240F380050 remove_all_head327A5C7301CC "ModelElement::clearTemplateParameter"
public void clearTemplateParameter()
// -end- 36240F380050 remove_all_head327A5C7301CC "ModelElement::clearTemplateParameter"
;     // empty

/** returns the number of TemplateParameters.
 *  @see #addTemplateParameter
 */
// -beg- preserve=no 36240F380050 size_head327A5C7301CC "ModelElement::sizeTemplateParameter"
public int sizeTemplateParameter()
// -end- 36240F380050 size_head327A5C7301CC "ModelElement::sizeTemplateParameter"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240F380050 _link_body327A5C7301CC "ModelElement::_linkTemplateParameter"
public void _linkTemplateParameter(TemplateParameter templateParameter1);
// -end- 36240F380050 _link_body327A5C7301CC "ModelElement::_linkTemplateParameter"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240F380050 _unlink_body327A5C7301CC "ModelElement::_unlinkTemplateParameter"
public void _unlinkTemplateParameter(TemplateParameter templateParameter1);
// -end- 36240F380050 _unlink_body327A5C7301CC "ModelElement::_unlinkTemplateParameter"

/** add a TargetFlow.
 *
 *  @see #removeTargetFlow
 *  @see #containsTargetFlow
 *  @see #iteratorTargetFlow
 *  @see #clearTargetFlow
 *  @see #sizeTargetFlow
 */
// -beg- preserve=no 3627D5E9010F add_head327A5C7301CC "ModelElement::addTargetFlow"
public void addTargetFlow(Flow targetFlow1)
// -end- 3627D5E9010F add_head327A5C7301CC "ModelElement::addTargetFlow"
;     // empty

/** disconnect a TargetFlow.
 *  @see #addTargetFlow
 */
// -beg- preserve=no 3627D5E9010F remove_head327A5C7301CC "ModelElement::removeTargetFlow"
public Flow removeTargetFlow(Flow targetFlow1)
// -end- 3627D5E9010F remove_head327A5C7301CC "ModelElement::removeTargetFlow"
;     // empty

/** tests if a given TargetFlow is connected.
 *  @see #addTargetFlow
 */
// -beg- preserve=no 3627D5E9010F test_head327A5C7301CC "ModelElement::containsTargetFlow"
public boolean containsTargetFlow(Flow targetFlow1)
// -end- 3627D5E9010F test_head327A5C7301CC "ModelElement::containsTargetFlow"
;     // empty

/** used to enumerate all connected TargetFlows.
 *  @see #addTargetFlow
 */
// -beg- preserve=no 3627D5E9010F get_all_head327A5C7301CC "ModelElement::iteratorTargetFlow"
public Iterator<?> iteratorTargetFlow()
// -end- 3627D5E9010F get_all_head327A5C7301CC "ModelElement::iteratorTargetFlow"
;     // empty

/** disconnect all TargetFlows.
 *  @see #addTargetFlow
 */
// -beg- preserve=no 3627D5E9010F remove_all_head327A5C7301CC "ModelElement::clearTargetFlow"
public void clearTargetFlow()
// -end- 3627D5E9010F remove_all_head327A5C7301CC "ModelElement::clearTargetFlow"
;     // empty

/** returns the number of TargetFlows.
 *  @see #addTargetFlow
 */
// -beg- preserve=no 3627D5E9010F size_head327A5C7301CC "ModelElement::sizeTargetFlow"
public int sizeTargetFlow()
// -end- 3627D5E9010F size_head327A5C7301CC "ModelElement::sizeTargetFlow"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3627D5E9010F _link_body327A5C7301CC "ModelElement::_linkTargetFlow"
public void _linkTargetFlow(Flow targetFlow1);
// -end- 3627D5E9010F _link_body327A5C7301CC "ModelElement::_linkTargetFlow"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3627D5E9010F _unlink_body327A5C7301CC "ModelElement::_unlinkTargetFlow"
public void _unlinkTargetFlow(Flow targetFlow1);
// -end- 3627D5E9010F _unlink_body327A5C7301CC "ModelElement::_unlinkTargetFlow"

/** add a SourceFlow.
 *
 *  @see #removeSourceFlow
 *  @see #containsSourceFlow
 *  @see #iteratorSourceFlow
 *  @see #clearSourceFlow
 *  @see #sizeSourceFlow
 */
// -beg- preserve=no 3627D60F03DF add_head327A5C7301CC "ModelElement::addSourceFlow"
public void addSourceFlow(Flow sourceFlow1)
// -end- 3627D60F03DF add_head327A5C7301CC "ModelElement::addSourceFlow"
;     // empty

/** disconnect a SourceFlow.
 *  @see #addSourceFlow
 */
// -beg- preserve=no 3627D60F03DF remove_head327A5C7301CC "ModelElement::removeSourceFlow"
public Flow removeSourceFlow(Flow sourceFlow1)
// -end- 3627D60F03DF remove_head327A5C7301CC "ModelElement::removeSourceFlow"
;     // empty

/** tests if a given SourceFlow is connected.
 *  @see #addSourceFlow
 */
// -beg- preserve=no 3627D60F03DF test_head327A5C7301CC "ModelElement::containsSourceFlow"
public boolean containsSourceFlow(Flow sourceFlow1)
// -end- 3627D60F03DF test_head327A5C7301CC "ModelElement::containsSourceFlow"
;     // empty

/** used to enumerate all connected SourceFlows.
 *  @see #addSourceFlow
 */
// -beg- preserve=no 3627D60F03DF get_all_head327A5C7301CC "ModelElement::iteratorSourceFlow"
public Iterator<?> iteratorSourceFlow()
// -end- 3627D60F03DF get_all_head327A5C7301CC "ModelElement::iteratorSourceFlow"
;     // empty

/** disconnect all SourceFlows.
 *  @see #addSourceFlow
 */
// -beg- preserve=no 3627D60F03DF remove_all_head327A5C7301CC "ModelElement::clearSourceFlow"
public void clearSourceFlow()
// -end- 3627D60F03DF remove_all_head327A5C7301CC "ModelElement::clearSourceFlow"
;     // empty

/** returns the number of SourceFlows.
 *  @see #addSourceFlow
 */
// -beg- preserve=no 3627D60F03DF size_head327A5C7301CC "ModelElement::sizeSourceFlow"
public int sizeSourceFlow()
// -end- 3627D60F03DF size_head327A5C7301CC "ModelElement::sizeSourceFlow"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3627D60F03DF _link_body327A5C7301CC "ModelElement::_linkSourceFlow"
public void _linkSourceFlow(Flow sourceFlow1);
// -end- 3627D60F03DF _link_body327A5C7301CC "ModelElement::_linkSourceFlow"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3627D60F03DF _unlink_body327A5C7301CC "ModelElement::_unlinkSourceFlow"
public void _unlinkSourceFlow(Flow sourceFlow1);
// -end- 3627D60F03DF _unlink_body327A5C7301CC "ModelElement::_unlinkSourceFlow"

/** add a DefaultParameter.
 *
 *  @see #removeDefaultParameter
 *  @see #containsDefaultParameter
 *  @see #iteratorDefaultParameter
 *  @see #clearDefaultParameter
 *  @see #sizeDefaultParameter
 */
// -beg- preserve=no 365EEE82035C add_head327A5C7301CC "ModelElement::addDefaultParameter"
public void addDefaultParameter(TemplateParameter defaultParameter1)
// -end- 365EEE82035C add_head327A5C7301CC "ModelElement::addDefaultParameter"
;     // empty

/** disconnect a DefaultParameter.
 *  @see #addDefaultParameter
 */
// -beg- preserve=no 365EEE82035C remove_head327A5C7301CC "ModelElement::removeDefaultParameter"
public TemplateParameter removeDefaultParameter(TemplateParameter defaultParameter1)
// -end- 365EEE82035C remove_head327A5C7301CC "ModelElement::removeDefaultParameter"
;     // empty

/** tests if a given DefaultParameter is connected.
 *  @see #addDefaultParameter
 */
// -beg- preserve=no 365EEE82035C test_head327A5C7301CC "ModelElement::containsDefaultParameter"
public boolean containsDefaultParameter(TemplateParameter defaultParameter1)
// -end- 365EEE82035C test_head327A5C7301CC "ModelElement::containsDefaultParameter"
;     // empty

/** used to enumerate all connected DefaultParameters.
 *  @see #addDefaultParameter
 */
// -beg- preserve=no 365EEE82035C get_all_head327A5C7301CC "ModelElement::iteratorDefaultParameter"
public Iterator<?> iteratorDefaultParameter()
// -end- 365EEE82035C get_all_head327A5C7301CC "ModelElement::iteratorDefaultParameter"
;     // empty

/** disconnect all DefaultParameters.
 *  @see #addDefaultParameter
 */
// -beg- preserve=no 365EEE82035C remove_all_head327A5C7301CC "ModelElement::clearDefaultParameter"
public void clearDefaultParameter()
// -end- 365EEE82035C remove_all_head327A5C7301CC "ModelElement::clearDefaultParameter"
;     // empty

/** returns the number of DefaultParameters.
 *  @see #addDefaultParameter
 */
// -beg- preserve=no 365EEE82035C size_head327A5C7301CC "ModelElement::sizeDefaultParameter"
public int sizeDefaultParameter()
// -end- 365EEE82035C size_head327A5C7301CC "ModelElement::sizeDefaultParameter"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 365EEE82035C _link_body327A5C7301CC "ModelElement::_linkDefaultParameter"
public void _linkDefaultParameter(TemplateParameter defaultParameter1);
// -end- 365EEE82035C _link_body327A5C7301CC "ModelElement::_linkDefaultParameter"

/** DONT USE; link management internal
 */
// -beg- preserve=no 365EEE82035C _unlink_body327A5C7301CC "ModelElement::_unlinkDefaultParameter"
public void _unlinkDefaultParameter(TemplateParameter defaultParameter1);
// -end- 365EEE82035C _unlink_body327A5C7301CC "ModelElement::_unlinkDefaultParameter"

/** add a Comment.
 *
 *  @see #removeComment
 *  @see #containsComment
 *  @see #iteratorComment
 *  @see #clearComment
 *  @see #sizeComment
 */
// -beg- preserve=no 370E7E3C02DE add_head327A5C7301CC "ModelElement::addComment"
public void addComment(Comment comment1)
// -end- 370E7E3C02DE add_head327A5C7301CC "ModelElement::addComment"
;     // empty

/** disconnect a Comment.
 *  @see #addComment
 */
// -beg- preserve=no 370E7E3C02DE remove_head327A5C7301CC "ModelElement::removeComment"
public Comment removeComment(Comment comment1)
// -end- 370E7E3C02DE remove_head327A5C7301CC "ModelElement::removeComment"
;     // empty

/** tests if a given Comment is connected.
 *  @see #addComment
 */
// -beg- preserve=no 370E7E3C02DE test_head327A5C7301CC "ModelElement::containsComment"
public boolean containsComment(Comment comment1)
// -end- 370E7E3C02DE test_head327A5C7301CC "ModelElement::containsComment"
;     // empty

/** used to enumerate all connected Comments.
 *  @see #addComment
 */
// -beg- preserve=no 370E7E3C02DE get_all_head327A5C7301CC "ModelElement::iteratorComment"
public Iterator<?> iteratorComment()
// -end- 370E7E3C02DE get_all_head327A5C7301CC "ModelElement::iteratorComment"
;     // empty

/** disconnect all Comments.
 *  @see #addComment
 */
// -beg- preserve=no 370E7E3C02DE remove_all_head327A5C7301CC "ModelElement::clearComment"
public void clearComment()
// -end- 370E7E3C02DE remove_all_head327A5C7301CC "ModelElement::clearComment"
;     // empty

/** returns the number of Comments.
 *  @see #addComment
 */
// -beg- preserve=no 370E7E3C02DE size_head327A5C7301CC "ModelElement::sizeComment"
public int sizeComment()
// -end- 370E7E3C02DE size_head327A5C7301CC "ModelElement::sizeComment"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 370E7E3C02DE _link_body327A5C7301CC "ModelElement::_linkComment"
public void _linkComment(Comment comment1);
// -end- 370E7E3C02DE _link_body327A5C7301CC "ModelElement::_linkComment"

/** DONT USE; link management internal
 */
// -beg- preserve=no 370E7E3C02DE _unlink_body327A5C7301CC "ModelElement::_unlinkComment"
public void _unlinkComment(Comment comment1);
// -end- 370E7E3C02DE _unlink_body327A5C7301CC "ModelElement::_unlinkComment"

/** add a Stereotype.
 *
 *  @see #removeStereotype
 *  @see #containsStereotype
 *  @see #iteratorStereotype
 *  @see #clearStereotype
 *  @see #sizeStereotype
 */
// -beg- preserve=no 338613A4007B add_head327A5C7301CC "ModelElement::addStereotype"
public void addStereotype(Stereotype stereotype1)
// -end- 338613A4007B add_head327A5C7301CC "ModelElement::addStereotype"
;     // empty

/** disconnect a Stereotype.
 *  @see #addStereotype
 */
// -beg- preserve=no 338613A4007B remove_head327A5C7301CC "ModelElement::removeStereotype"
public Stereotype removeStereotype(Stereotype stereotype1)
// -end- 338613A4007B remove_head327A5C7301CC "ModelElement::removeStereotype"
;     // empty

/** tests if a given Stereotype is connected.
 *  @see #addStereotype
 */
// -beg- preserve=no 338613A4007B test_head327A5C7301CC "ModelElement::containsStereotype"
public boolean containsStereotype(Stereotype stereotype1)
// -end- 338613A4007B test_head327A5C7301CC "ModelElement::containsStereotype"
;     // empty

/** used to enumerate all connected Stereotypes.
 *  @see #addStereotype
 */
// -beg- preserve=no 338613A4007B get_all_head327A5C7301CC "ModelElement::iteratorStereotype"
public Iterator<?> iteratorStereotype()
// -end- 338613A4007B get_all_head327A5C7301CC "ModelElement::iteratorStereotype"
;     // empty

/** disconnect all Stereotypes.
 *  @see #addStereotype
 */
// -beg- preserve=no 338613A4007B remove_all_head327A5C7301CC "ModelElement::clearStereotype"
public void clearStereotype()
// -end- 338613A4007B remove_all_head327A5C7301CC "ModelElement::clearStereotype"
;     // empty

/** returns the number of Stereotypes.
 *  @see #addStereotype
 */
// -beg- preserve=no 338613A4007B size_head327A5C7301CC "ModelElement::sizeStereotype"
public int sizeStereotype()
// -end- 338613A4007B size_head327A5C7301CC "ModelElement::sizeStereotype"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 338613A4007B _link_body327A5C7301CC "ModelElement::_linkStereotype"
public void _linkStereotype(Stereotype stereotype1);
// -end- 338613A4007B _link_body327A5C7301CC "ModelElement::_linkStereotype"

/** DONT USE; link management internal
 */
// -beg- preserve=no 338613A4007B _unlink_body327A5C7301CC "ModelElement::_unlinkStereotype"
public void _unlinkStereotype(Stereotype stereotype1);
// -end- 338613A4007B _unlink_body327A5C7301CC "ModelElement::_unlinkStereotype"

/** add a ReferenceTag.
 *
 *  @see #removeReferenceTag
 *  @see #containsReferenceTag
 *  @see #iteratorReferenceTag
 *  @see #clearReferenceTag
 *  @see #sizeReferenceTag
 */
// -beg- preserve=no 39B9B0F703C8 add_head327A5C7301CC "ModelElement::addReferenceTag"
public void addReferenceTag(TaggedValue referenceTag1)
// -end- 39B9B0F703C8 add_head327A5C7301CC "ModelElement::addReferenceTag"
;     // empty

/** disconnect a ReferenceTag.
 *  @see #addReferenceTag
 */
// -beg- preserve=no 39B9B0F703C8 remove_head327A5C7301CC "ModelElement::removeReferenceTag"
public TaggedValue removeReferenceTag(TaggedValue referenceTag1)
// -end- 39B9B0F703C8 remove_head327A5C7301CC "ModelElement::removeReferenceTag"
;     // empty

/** tests if a given ReferenceTag is connected.
 *  @see #addReferenceTag
 */
// -beg- preserve=no 39B9B0F703C8 test_head327A5C7301CC "ModelElement::containsReferenceTag"
public boolean containsReferenceTag(TaggedValue referenceTag1)
// -end- 39B9B0F703C8 test_head327A5C7301CC "ModelElement::containsReferenceTag"
;     // empty

/** used to enumerate all connected ReferenceTags.
 *  @see #addReferenceTag
 */
// -beg- preserve=no 39B9B0F703C8 get_all_head327A5C7301CC "ModelElement::iteratorReferenceTag"
public Iterator<?> iteratorReferenceTag()
// -end- 39B9B0F703C8 get_all_head327A5C7301CC "ModelElement::iteratorReferenceTag"
;     // empty

/** disconnect all ReferenceTags.
 *  @see #addReferenceTag
 */
// -beg- preserve=no 39B9B0F703C8 remove_all_head327A5C7301CC "ModelElement::clearReferenceTag"
public void clearReferenceTag()
// -end- 39B9B0F703C8 remove_all_head327A5C7301CC "ModelElement::clearReferenceTag"
;     // empty

/** returns the number of ReferenceTags.
 *  @see #addReferenceTag
 */
// -beg- preserve=no 39B9B0F703C8 size_head327A5C7301CC "ModelElement::sizeReferenceTag"
public int sizeReferenceTag()
// -end- 39B9B0F703C8 size_head327A5C7301CC "ModelElement::sizeReferenceTag"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39B9B0F703C8 _link_body327A5C7301CC "ModelElement::_linkReferenceTag"
public void _linkReferenceTag(TaggedValue referenceTag1);
// -end- 39B9B0F703C8 _link_body327A5C7301CC "ModelElement::_linkReferenceTag"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39B9B0F703C8 _unlink_body327A5C7301CC "ModelElement::_unlinkReferenceTag"
public void _unlinkReferenceTag(TaggedValue referenceTag1);
// -end- 39B9B0F703C8 _unlink_body327A5C7301CC "ModelElement::_unlinkReferenceTag"

/** add a ImportedBy.
 *
 *  @see #removeImportedBy
 *  @see #containsImportedBy
 *  @see #iteratorImportedBy
 *  @see #clearImportedBy
 *  @see #sizeImportedBy
 *  @see #iteratorImportedByLink
 *  @see #createImportedByLink
 *  @see #findImportedByLink
 */
// -beg- preserve=no 33CD739B0316 add_head327A5C7301CC "ModelElement::addImportedBy"
public void addImportedBy(Package importedBy1)
// -end- 33CD739B0316 add_head327A5C7301CC "ModelElement::addImportedBy"
;     // empty

/** add a link to a ImportedBy.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 addlink_head327A5C7301CC "ModelElement::addImportedByLink"
public void addImportedByLink(ElementImport importedBy1)
// -end- 33CD739B0316 addlink_head327A5C7301CC "ModelElement::addImportedByLink"
;     // empty

/** disconnect a ImportedBy.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 remove_head327A5C7301CC "ModelElement::removeImportedBy"
public Package removeImportedBy(Package importedBy1)
// -end- 33CD739B0316 remove_head327A5C7301CC "ModelElement::removeImportedBy"
;     // empty

/** tests if a given ImportedBy is connected.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 test_head327A5C7301CC "ModelElement::containsImportedBy"
public boolean containsImportedBy(Package importedBy1)
// -end- 33CD739B0316 test_head327A5C7301CC "ModelElement::containsImportedBy"
;     // empty

/** used to enumerate all connected ImportedBys.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 get_all_head327A5C7301CC "ModelElement::iteratorImportedBy"
public Iterator<?> iteratorImportedBy()
// -end- 33CD739B0316 get_all_head327A5C7301CC "ModelElement::iteratorImportedBy"
;     // empty

/** disconnect all ImportedBys.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 remove_all_head327A5C7301CC "ModelElement::clearImportedBy"
public void clearImportedBy()
// -end- 33CD739B0316 remove_all_head327A5C7301CC "ModelElement::clearImportedBy"
;     // empty

/** returns the number of ImportedBys.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 size_head327A5C7301CC "ModelElement::sizeImportedBy"
public int sizeImportedBy()
// -end- 33CD739B0316 size_head327A5C7301CC "ModelElement::sizeImportedBy"
;     // empty

/** enumerate the link objects of currently connected ImportedBy.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 itlink_head327A5C7301CC "ModelElement::getImportedByLink"
public Iterator<?> iteratorImportedByLink()
// -end- 33CD739B0316 itlink_head327A5C7301CC "ModelElement::getImportedByLink"
;     // empty

/** create a link class for a new link to a ImportedBy.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 createlink_head327A5C7301CC "ModelElement::createImportedByLink"
public ElementImport createImportedByLink()
// -end- 33CD739B0316 createlink_head327A5C7301CC "ModelElement::createImportedByLink"
;     // empty

/** find a link object for a given ImportedBy.
 *  @see #addImportedBy
 */
// -beg- preserve=no 33CD739B0316 find_head327A5C7301CC "ModelElement::findImportedByLink"
public ElementImport findImportedByLink(Package importedBy1)
// -end- 33CD739B0316 find_head327A5C7301CC "ModelElement::findImportedByLink"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD739B0316 _link_body327A5C7301CC "ModelElement::_linkImportedBy"
public void _linkImportedBy(ElementImport importedBy1);
// -end- 33CD739B0316 _link_body327A5C7301CC "ModelElement::_linkImportedBy"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CD739B0316 _unlink_body327A5C7301CC "ModelElement::_unlinkImportedBy"
public void _unlinkImportedBy(ElementImport importedBy1);
// -end- 33CD739B0316 _unlink_body327A5C7301CC "ModelElement::_unlinkImportedBy"

/** get current value of name
 *  @see #setName
 */
// -beg- preserve=no 335D4BA70064 get_head327A5C7301CC "name"
NlsString getName()
// -end- 335D4BA70064 get_head327A5C7301CC "name"
;     // empty
/** set current value of name
 *  @see #getName
 */
// -beg- preserve=no 335D4BA70064 set_head327A5C7301CC "name"
void setName(NlsString value1)
// -end- 335D4BA70064 set_head327A5C7301CC "name"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A5C7301CC detail_end "ModelElement"

// -end- 327A5C7301CC detail_end "ModelElement"

/**
 * get current value of meta attribute
 * @see #setMetaAttrb()
 */
NlsString getMetaAttrb();
/**
 * set current value of meta attrubute
 * @see #getMetaAttrb()
 */
void setMetaAttrb(NlsString value);

/**
 * get current value of meta mapping
 * @see #setMetaMapping()
 */
NlsString getMetaMapping();
/**
 * set current value of meta mapping
 * @see #getMetaAttrb()
 */
void setMetaMapping(NlsString value);



/**
 * get current value of meta name
 * @see #setMetaName()
 */
NlsString getMetaName();

/**
 * set current value of meta name
 * @see #getMetaName()
 */
void setMetaName(NlsString value);

/**
 * get current value of meta message
 * @see #setMetaMsg()
 */
NlsString getMetaMsg();

/**
 * set current value of meta message
 * @see #getMetaMsg()
 */
void setMetaMsg(NlsString value);
}
