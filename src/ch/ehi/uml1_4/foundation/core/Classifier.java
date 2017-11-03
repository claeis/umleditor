// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:25 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 32989FB2023D package "Classifier"
package ch.ehi.uml1_4.foundation.core;
// -end- 32989FB2023D package "Classifier"

// -beg- preserve=no 32989FB2023D autoimport "Classifier"
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Generalization;
// -end- 32989FB2023D autoimport "Classifier"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 32989FB2023D import "Classifier"

// -end- 32989FB2023D import "Classifier"

/** A classifier is an element that describes behavioral and structural features; it comes in severalspecific forms, including class, data type, interface, component, artifact, and others that aredefined in other metamodel packages.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:25 $
 */
<<<<<<< HEAD
public interface Classifier extends GeneralizableElement , Namespace , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32989FB2023D detail_begin "Classifier"

  // -end- 32989FB2023D detail_begin "Classifier"

  /** tests if this Classifier contains a Feature with the given name
   */
  // -beg- preserve=no 3CB2C64E0374 head32989FB2023D "containsFeature"
  public boolean containsFeature(String name)
  // -end- 3CB2C64E0374 head32989FB2023D "containsFeature"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CB2C64E0374 throws32989FB2023D "containsFeature"

    // -end- 3CB2C64E0374 throws32989FB2023D "containsFeature"
    ; // empty

  /** add a ObjectFlowState.
   *  
   *  @see #removeObjectFlowState
   *  @see #containsObjectFlowState
   *  @see #iteratorObjectFlowState
   *  @see #clearObjectFlowState
   *  @see #sizeObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E add_head32989FB2023D "Classifier::addObjectFlowState"
  public void addObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E add_head32989FB2023D "Classifier::addObjectFlowState"
    ; // empty

  /** disconnect a ObjectFlowState.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E remove_head32989FB2023D "Classifier::removeObjectFlowState"
  public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E remove_head32989FB2023D "Classifier::removeObjectFlowState"
    ; // empty

  /** tests if a given ObjectFlowState is connected.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E test_head32989FB2023D "Classifier::containsObjectFlowState"
  public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E test_head32989FB2023D "Classifier::containsObjectFlowState"
    ; // empty

  /** used to enumerate all connected ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E get_all_head32989FB2023D "Classifier::iteratorObjectFlowState"
  public java.util.Iterator iteratorObjectFlowState()
  // -end- 33CF9EFC006E get_all_head32989FB2023D "Classifier::iteratorObjectFlowState"
    ; // empty

  /** disconnect all ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E remove_all_head32989FB2023D "Classifier::clearObjectFlowState"
  public void clearObjectFlowState()
  // -end- 33CF9EFC006E remove_all_head32989FB2023D "Classifier::clearObjectFlowState"
    ; // empty

  /** returns the number of ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E size_head32989FB2023D "Classifier::sizeObjectFlowState"
  public int sizeObjectFlowState()
  // -end- 33CF9EFC006E size_head32989FB2023D "Classifier::sizeObjectFlowState"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006E _link_body32989FB2023D "Classifier::_linkObjectFlowState"
  public void _linkObjectFlowState(ObjectFlowState objectFlowState1);
  // -end- 33CF9EFC006E _link_body32989FB2023D "Classifier::_linkObjectFlowState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006E _unlink_body32989FB2023D "Classifier::_unlinkObjectFlowState"
  public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1);
  // -end- 33CF9EFC006E _unlink_body32989FB2023D "Classifier::_unlinkObjectFlowState"

  /** add a ClassifierInState.
   *  
   *  @see #removeClassifierInState
   *  @see #containsClassifierInState
   *  @see #iteratorClassifierInState
   *  @see #clearClassifierInState
   *  @see #sizeClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC add_head32989FB2023D "Classifier::addClassifierInState"
  public void addClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC add_head32989FB2023D "Classifier::addClassifierInState"
    ; // empty

  /** disconnect a ClassifierInState.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC remove_head32989FB2023D "Classifier::removeClassifierInState"
  public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC remove_head32989FB2023D "Classifier::removeClassifierInState"
    ; // empty

  /** tests if a given ClassifierInState is connected.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC test_head32989FB2023D "Classifier::containsClassifierInState"
  public boolean containsClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC test_head32989FB2023D "Classifier::containsClassifierInState"
    ; // empty

  /** used to enumerate all connected ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC get_all_head32989FB2023D "Classifier::iteratorClassifierInState"
  public java.util.Iterator iteratorClassifierInState()
  // -end- 33CF9F1602BC get_all_head32989FB2023D "Classifier::iteratorClassifierInState"
    ; // empty

  /** disconnect all ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC remove_all_head32989FB2023D "Classifier::clearClassifierInState"
  public void clearClassifierInState()
  // -end- 33CF9F1602BC remove_all_head32989FB2023D "Classifier::clearClassifierInState"
    ; // empty

  /** returns the number of ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC size_head32989FB2023D "Classifier::sizeClassifierInState"
  public int sizeClassifierInState()
  // -end- 33CF9F1602BC size_head32989FB2023D "Classifier::sizeClassifierInState"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F1602BC _link_body32989FB2023D "Classifier::_linkClassifierInState"
  public void _linkClassifierInState(ClassifierInState classifierInState1);
  // -end- 33CF9F1602BC _link_body32989FB2023D "Classifier::_linkClassifierInState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F1602BC _unlink_body32989FB2023D "Classifier::_unlinkClassifierInState"
  public void _unlinkClassifierInState(ClassifierInState classifierInState1);
  // -end- 33CF9F1602BC _unlink_body32989FB2023D "Classifier::_unlinkClassifierInState"

  /** add a ClassifierRole.
   *  
   *  @see #removeClassifierRole
   *  @see #containsClassifierRole
   *  @see #iteratorClassifierRole
   *  @see #clearClassifierRole
   *  @see #sizeClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 add_head32989FB2023D "ModelElement::addClassifierRole"
  public void addClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 add_head32989FB2023D "ModelElement::addClassifierRole"
    ; // empty

  /** disconnect a ClassifierRole.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_head32989FB2023D "ModelElement::removeClassifierRole"
  public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 remove_head32989FB2023D "ModelElement::removeClassifierRole"
    ; // empty

  /** tests if a given ClassifierRole is connected.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 test_head32989FB2023D "ModelElement::containsClassifierRole"
  public boolean containsClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 test_head32989FB2023D "ModelElement::containsClassifierRole"
    ; // empty

  /** used to enumerate all connected ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 get_all_head32989FB2023D "ModelElement::iteratorClassifierRole"
  public java.util.Iterator iteratorClassifierRole()
  // -end- 36008FB700E7 get_all_head32989FB2023D "ModelElement::iteratorClassifierRole"
    ; // empty

  /** disconnect all ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_all_head32989FB2023D "ModelElement::clearClassifierRole"
  public void clearClassifierRole()
  // -end- 36008FB700E7 remove_all_head32989FB2023D "ModelElement::clearClassifierRole"
    ; // empty

  /** returns the number of ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 size_head32989FB2023D "ModelElement::sizeClassifierRole"
  public int sizeClassifierRole()
  // -end- 36008FB700E7 size_head32989FB2023D "ModelElement::sizeClassifierRole"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _link_body32989FB2023D "ModelElement::_linkClassifierRole"
  public void _linkClassifierRole(ClassifierRole classifierRole1);
  // -end- 36008FB700E7 _link_body32989FB2023D "ModelElement::_linkClassifierRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _unlink_body32989FB2023D "ModelElement::_unlinkClassifierRole"
  public void _unlinkClassifierRole(ClassifierRole classifierRole1);
  // -end- 36008FB700E7 _unlink_body32989FB2023D "ModelElement::_unlinkClassifierRole"

  /** add a Collaboration.
   *  
   *  @see #removeCollaboration
   *  @see #containsCollaboration
   *  @see #iteratorCollaboration
   *  @see #clearCollaboration
   *  @see #sizeCollaboration
   */
  // -beg- preserve=no 33D1394E029F add_head32989FB2023D "ModelElement::addCollaboration"
  public void addCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F add_head32989FB2023D "ModelElement::addCollaboration"
    ; // empty

  /** disconnect a Collaboration.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_head32989FB2023D "ModelElement::removeCollaboration"
  public Collaboration removeCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F remove_head32989FB2023D "ModelElement::removeCollaboration"
    ; // empty

  /** tests if a given Collaboration is connected.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F test_head32989FB2023D "ModelElement::containsCollaboration"
  public boolean containsCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F test_head32989FB2023D "ModelElement::containsCollaboration"
    ; // empty

  /** used to enumerate all connected Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F get_all_head32989FB2023D "ModelElement::iteratorCollaboration"
  public java.util.Iterator iteratorCollaboration()
  // -end- 33D1394E029F get_all_head32989FB2023D "ModelElement::iteratorCollaboration"
    ; // empty

  /** disconnect all Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_all_head32989FB2023D "ModelElement::clearCollaboration"
  public void clearCollaboration()
  // -end- 33D1394E029F remove_all_head32989FB2023D "ModelElement::clearCollaboration"
    ; // empty

  /** returns the number of Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F size_head32989FB2023D "ModelElement::sizeCollaboration"
  public int sizeCollaboration()
  // -end- 33D1394E029F size_head32989FB2023D "ModelElement::sizeCollaboration"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _link_body32989FB2023D "ModelElement::_linkCollaboration"
  public void _linkCollaboration(Collaboration collaboration1);
  // -end- 33D1394E029F _link_body32989FB2023D "ModelElement::_linkCollaboration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _unlink_body32989FB2023D "ModelElement::_unlinkCollaboration"
  public void _unlinkCollaboration(Collaboration collaboration1);
  // -end- 33D1394E029F _unlink_body32989FB2023D "ModelElement::_unlinkCollaboration"

  /** add a Instance.
   *  
   *  @see #removeInstance
   *  @see #containsInstance
   *  @see #iteratorInstance
   *  @see #clearInstance
   *  @see #sizeInstance
   */
  // -beg- preserve=no 33CAD7E900AB add_head32989FB2023D "Classifier::addInstance"
  public void addInstance(Instance instance1)
  // -end- 33CAD7E900AB add_head32989FB2023D "Classifier::addInstance"
    ; // empty

  /** disconnect a Instance.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB remove_head32989FB2023D "Classifier::removeInstance"
  public Instance removeInstance(Instance instance1)
  // -end- 33CAD7E900AB remove_head32989FB2023D "Classifier::removeInstance"
    ; // empty

  /** tests if a given Instance is connected.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB test_head32989FB2023D "Classifier::containsInstance"
  public boolean containsInstance(Instance instance1)
  // -end- 33CAD7E900AB test_head32989FB2023D "Classifier::containsInstance"
    ; // empty

  /** used to enumerate all connected Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB get_all_head32989FB2023D "Classifier::iteratorInstance"
  public java.util.Iterator iteratorInstance()
  // -end- 33CAD7E900AB get_all_head32989FB2023D "Classifier::iteratorInstance"
    ; // empty

  /** disconnect all Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB remove_all_head32989FB2023D "Classifier::clearInstance"
  public void clearInstance()
  // -end- 33CAD7E900AB remove_all_head32989FB2023D "Classifier::clearInstance"
    ; // empty

  /** returns the number of Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB size_head32989FB2023D "Classifier::sizeInstance"
  public int sizeInstance()
  // -end- 33CAD7E900AB size_head32989FB2023D "Classifier::sizeInstance"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AB _link_body32989FB2023D "Classifier::_linkInstance"
  public void _linkInstance(Instance instance1);
  // -end- 33CAD7E900AB _link_body32989FB2023D "Classifier::_linkInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AB _unlink_body32989FB2023D "Classifier::_unlinkInstance"
  public void _unlinkInstance(Instance instance1);
  // -end- 33CAD7E900AB _unlink_body32989FB2023D "Classifier::_unlinkInstance"

  /** add a CreateAction.
   *  
   *  @see #removeCreateAction
   *  @see #containsCreateAction
   *  @see #iteratorCreateAction
   *  @see #clearCreateAction
   *  @see #sizeCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 add_head32989FB2023D "Classifier::addCreateAction"
  public void addCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 add_head32989FB2023D "Classifier::addCreateAction"
    ; // empty

  /** disconnect a CreateAction.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 remove_head32989FB2023D "Classifier::removeCreateAction"
  public CreateAction removeCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 remove_head32989FB2023D "Classifier::removeCreateAction"
    ; // empty

  /** tests if a given CreateAction is connected.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 test_head32989FB2023D "Classifier::containsCreateAction"
  public boolean containsCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 test_head32989FB2023D "Classifier::containsCreateAction"
    ; // empty

  /** used to enumerate all connected CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 get_all_head32989FB2023D "Classifier::iteratorCreateAction"
  public java.util.Iterator iteratorCreateAction()
  // -end- 33CFD0A701A4 get_all_head32989FB2023D "Classifier::iteratorCreateAction"
    ; // empty

  /** disconnect all CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 remove_all_head32989FB2023D "Classifier::clearCreateAction"
  public void clearCreateAction()
  // -end- 33CFD0A701A4 remove_all_head32989FB2023D "Classifier::clearCreateAction"
    ; // empty

  /** returns the number of CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 size_head32989FB2023D "Classifier::sizeCreateAction"
  public int sizeCreateAction()
  // -end- 33CFD0A701A4 size_head32989FB2023D "Classifier::sizeCreateAction"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A701A4 _link_body32989FB2023D "Classifier::_linkCreateAction"
  public void _linkCreateAction(CreateAction createAction1);
  // -end- 33CFD0A701A4 _link_body32989FB2023D "Classifier::_linkCreateAction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A701A4 _unlink_body32989FB2023D "Classifier::_unlinkCreateAction"
  public void _unlinkCreateAction(CreateAction createAction1);
  // -end- 33CFD0A701A4 _unlink_body32989FB2023D "Classifier::_unlinkCreateAction"

  /** add a Feature.
   *  
   *  @see #removeFeature
   *  @see #containsFeature
   *  @see #iteratorFeature
   *  @see #clearFeature
   *  @see #sizeFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 add_head32989FB2023D "Classifier::addFeature"
  public void addFeature(Feature feature1)
  // -end- 32B5D7EF03D3 add_head32989FB2023D "Classifier::addFeature"
    ; // empty

  // -beg- preserve=no 32B5D7EF03D3 add2_head32989FB2023D "Classifier::add2Feature"
  public void addFeature(int index,Feature feature1)
  // -end- 32B5D7EF03D3 add2_head32989FB2023D "Classifier::add2Feature"
    ; // empty

  /** disconnect a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove_head32989FB2023D "Classifier::removeFeature"
  public Feature removeFeature(Feature feature1)
  // -end- 32B5D7EF03D3 remove_head32989FB2023D "Classifier::removeFeature"
    ; // empty

  /** disconnect a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove2_head32989FB2023D "Classifier::remove2Feature"
  public Feature removeFeature(int index)
  // -end- 32B5D7EF03D3 remove2_head32989FB2023D "Classifier::remove2Feature"
    ; // empty

  /** change a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 set_head32989FB2023D "Classifier::setFeature"
  public Feature setFeature(int index,Feature feature1)
  // -end- 32B5D7EF03D3 set_head32989FB2023D "Classifier::setFeature"
    ; // empty

  /** tests if a given Feature is connected.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 test_head32989FB2023D "Classifier::containsFeature"
  public boolean containsFeature(Feature feature1)
  // -end- 32B5D7EF03D3 test_head32989FB2023D "Classifier::containsFeature"
    ; // empty

  /** used to enumerate all connected Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 get_all_head32989FB2023D "Classifier::iteratorFeature"
  public java.util.Iterator iteratorFeature()
  // -end- 32B5D7EF03D3 get_all_head32989FB2023D "Classifier::iteratorFeature"
    ; // empty

  /** disconnect all Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove_all_head32989FB2023D "Classifier::clearFeature"
  public void clearFeature()
  // -end- 32B5D7EF03D3 remove_all_head32989FB2023D "Classifier::clearFeature"
    ; // empty

  /** returns the number of Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 size_head32989FB2023D "Classifier::sizeFeature"
  public int sizeFeature()
  // -end- 32B5D7EF03D3 size_head32989FB2023D "Classifier::sizeFeature"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03D3 _link_body32989FB2023D "Classifier::_linkFeature"
  public void _linkFeature(Feature feature1);
  // -end- 32B5D7EF03D3 _link_body32989FB2023D "Classifier::_linkFeature"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03D3 _unlink_body32989FB2023D "Classifier::_unlinkFeature"
  public void _unlinkFeature(Feature feature1);
  // -end- 32B5D7EF03D3 _unlink_body32989FB2023D "Classifier::_unlinkFeature"

  /** add a Association.
   *  
   *  @see #removeAssociation
   *  @see #containsAssociation
   *  @see #iteratorAssociation
   *  @see #clearAssociation
   *  @see #sizeAssociation
   */
  // -beg- preserve=no 33E265070353 add_head32989FB2023D "Classifier::addAssociation"
  public void addAssociation(AssociationEnd association1)
  // -end- 33E265070353 add_head32989FB2023D "Classifier::addAssociation"
    ; // empty

  /** disconnect a Association.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 remove_head32989FB2023D "Classifier::removeAssociation"
  public AssociationEnd removeAssociation(AssociationEnd association1)
  // -end- 33E265070353 remove_head32989FB2023D "Classifier::removeAssociation"
    ; // empty

  /** tests if a given Association is connected.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 test_head32989FB2023D "Classifier::containsAssociation"
  public boolean containsAssociation(AssociationEnd association1)
  // -end- 33E265070353 test_head32989FB2023D "Classifier::containsAssociation"
    ; // empty

  /** used to enumerate all connected Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 get_all_head32989FB2023D "Classifier::iteratorAssociation"
  public java.util.Iterator iteratorAssociation()
  // -end- 33E265070353 get_all_head32989FB2023D "Classifier::iteratorAssociation"
    ; // empty

  /** disconnect all Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 remove_all_head32989FB2023D "Classifier::clearAssociation"
  public void clearAssociation()
  // -end- 33E265070353 remove_all_head32989FB2023D "Classifier::clearAssociation"
    ; // empty

  /** returns the number of Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 size_head32989FB2023D "Classifier::sizeAssociation"
  public int sizeAssociation()
  // -end- 33E265070353 size_head32989FB2023D "Classifier::sizeAssociation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070353 _link_body32989FB2023D "Classifier::_linkAssociation"
  public void _linkAssociation(AssociationEnd association1);
  // -end- 33E265070353 _link_body32989FB2023D "Classifier::_linkAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070353 _unlink_body32989FB2023D "Classifier::_unlinkAssociation"
  public void _unlinkAssociation(AssociationEnd association1);
  // -end- 33E265070353 _unlink_body32989FB2023D "Classifier::_unlinkAssociation"

  /** add a SpecifiedEnd.
   *  
   *  @see #removeSpecifiedEnd
   *  @see #containsSpecifiedEnd
   *  @see #iteratorSpecifiedEnd
   *  @see #clearSpecifiedEnd
   *  @see #sizeSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB add_head32989FB2023D "Classifier::addSpecifiedEnd"
  public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB add_head32989FB2023D "Classifier::addSpecifiedEnd"
    ; // empty

  /** disconnect a SpecifiedEnd.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB remove_head32989FB2023D "Classifier::removeSpecifiedEnd"
  public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB remove_head32989FB2023D "Classifier::removeSpecifiedEnd"
    ; // empty

  /** tests if a given SpecifiedEnd is connected.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB test_head32989FB2023D "Classifier::containsSpecifiedEnd"
  public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB test_head32989FB2023D "Classifier::containsSpecifiedEnd"
    ; // empty

  /** used to enumerate all connected SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB get_all_head32989FB2023D "Classifier::iteratorSpecifiedEnd"
  public java.util.Iterator iteratorSpecifiedEnd()
  // -end- 33F0EFAD00AB get_all_head32989FB2023D "Classifier::iteratorSpecifiedEnd"
    ; // empty

  /** disconnect all SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB remove_all_head32989FB2023D "Classifier::clearSpecifiedEnd"
  public void clearSpecifiedEnd()
  // -end- 33F0EFAD00AB remove_all_head32989FB2023D "Classifier::clearSpecifiedEnd"
    ; // empty

  /** returns the number of SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB size_head32989FB2023D "Classifier::sizeSpecifiedEnd"
  public int sizeSpecifiedEnd()
  // -end- 33F0EFAD00AB size_head32989FB2023D "Classifier::sizeSpecifiedEnd"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AB _link_body32989FB2023D "Classifier::_linkSpecifiedEnd"
  public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1);
  // -end- 33F0EFAD00AB _link_body32989FB2023D "Classifier::_linkSpecifiedEnd"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AB _unlink_body32989FB2023D "Classifier::_unlinkSpecifiedEnd"
  public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1);
  // -end- 33F0EFAD00AB _unlink_body32989FB2023D "Classifier::_unlinkSpecifiedEnd"

  /** add a PowertypeRange.
   *  
   *  @see #removePowertypeRange
   *  @see #containsPowertypeRange
   *  @see #iteratorPowertypeRange
   *  @see #clearPowertypeRange
   *  @see #sizePowertypeRange
   */
  // -beg- preserve=no 36E96A87033E add_head32989FB2023D "Classifier::addPowertypeRange"
  public void addPowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E add_head32989FB2023D "Classifier::addPowertypeRange"
    ; // empty

  /** disconnect a PowertypeRange.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E remove_head32989FB2023D "Classifier::removePowertypeRange"
  public Generalization removePowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E remove_head32989FB2023D "Classifier::removePowertypeRange"
    ; // empty

  /** tests if a given PowertypeRange is connected.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E test_head32989FB2023D "Classifier::containsPowertypeRange"
  public boolean containsPowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E test_head32989FB2023D "Classifier::containsPowertypeRange"
    ; // empty

  /** used to enumerate all connected PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E get_all_head32989FB2023D "Classifier::iteratorPowertypeRange"
  public java.util.Iterator iteratorPowertypeRange()
  // -end- 36E96A87033E get_all_head32989FB2023D "Classifier::iteratorPowertypeRange"
    ; // empty

  /** disconnect all PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E remove_all_head32989FB2023D "Classifier::clearPowertypeRange"
  public void clearPowertypeRange()
  // -end- 36E96A87033E remove_all_head32989FB2023D "Classifier::clearPowertypeRange"
    ; // empty

  /** returns the number of PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E size_head32989FB2023D "Classifier::sizePowertypeRange"
  public int sizePowertypeRange()
  // -end- 36E96A87033E size_head32989FB2023D "Classifier::sizePowertypeRange"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36E96A87033E _link_body32989FB2023D "Classifier::_linkPowertypeRange"
  public void _linkPowertypeRange(Generalization powertypeRange1);
  // -end- 36E96A87033E _link_body32989FB2023D "Classifier::_linkPowertypeRange"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36E96A87033E _unlink_body32989FB2023D "Classifier::_unlinkPowertypeRange"
  public void _unlinkPowertypeRange(Generalization powertypeRange1);
  // -end- 36E96A87033E _unlink_body32989FB2023D "Classifier::_unlinkPowertypeRange"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32989FB2023D detail_end "Classifier"

  // -end- 32989FB2023D detail_end "Classifier"

}

=======
public interface Classifier extends GeneralizableElement, Namespace, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 32989FB2023D detail_begin "Classifier"

// -end- 32989FB2023D detail_begin "Classifier"

/** tests if this Classifier contains a Feature with the given name
 */
// -beg- preserve=no 3CB2C64E0374 head32989FB2023D "containsFeature"
public boolean containsFeature(String name)
// -end- 3CB2C64E0374 head32989FB2023D "containsFeature"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CB2C64E0374 throws32989FB2023D "containsFeature"

// -end- 3CB2C64E0374 throws32989FB2023D "containsFeature"
;     // empty

/** add a ObjectFlowState.
 *
 *  @see #removeObjectFlowState
 *  @see #containsObjectFlowState
 *  @see #iteratorObjectFlowState
 *  @see #clearObjectFlowState
 *  @see #sizeObjectFlowState
 */
// -beg- preserve=no 33CF9EFC006E add_head32989FB2023D "Classifier::addObjectFlowState"
public void addObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 33CF9EFC006E add_head32989FB2023D "Classifier::addObjectFlowState"
;     // empty

/** disconnect a ObjectFlowState.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 33CF9EFC006E remove_head32989FB2023D "Classifier::removeObjectFlowState"
public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 33CF9EFC006E remove_head32989FB2023D "Classifier::removeObjectFlowState"
;     // empty

/** tests if a given ObjectFlowState is connected.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 33CF9EFC006E test_head32989FB2023D "Classifier::containsObjectFlowState"
public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
// -end- 33CF9EFC006E test_head32989FB2023D "Classifier::containsObjectFlowState"
;     // empty

/** used to enumerate all connected ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 33CF9EFC006E get_all_head32989FB2023D "Classifier::iteratorObjectFlowState"
public Iterator<?> iteratorObjectFlowState()
// -end- 33CF9EFC006E get_all_head32989FB2023D "Classifier::iteratorObjectFlowState"
;     // empty

/** disconnect all ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 33CF9EFC006E remove_all_head32989FB2023D "Classifier::clearObjectFlowState"
public void clearObjectFlowState()
// -end- 33CF9EFC006E remove_all_head32989FB2023D "Classifier::clearObjectFlowState"
;     // empty

/** returns the number of ObjectFlowStates.
 *  @see #addObjectFlowState
 */
// -beg- preserve=no 33CF9EFC006E size_head32989FB2023D "Classifier::sizeObjectFlowState"
public int sizeObjectFlowState()
// -end- 33CF9EFC006E size_head32989FB2023D "Classifier::sizeObjectFlowState"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9EFC006E _link_body32989FB2023D "Classifier::_linkObjectFlowState"
public void _linkObjectFlowState(ObjectFlowState objectFlowState1);
// -end- 33CF9EFC006E _link_body32989FB2023D "Classifier::_linkObjectFlowState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9EFC006E _unlink_body32989FB2023D "Classifier::_unlinkObjectFlowState"
public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1);
// -end- 33CF9EFC006E _unlink_body32989FB2023D "Classifier::_unlinkObjectFlowState"

/** add a ClassifierInState.
 *
 *  @see #removeClassifierInState
 *  @see #containsClassifierInState
 *  @see #iteratorClassifierInState
 *  @see #clearClassifierInState
 *  @see #sizeClassifierInState
 */
// -beg- preserve=no 33CF9F1602BC add_head32989FB2023D "Classifier::addClassifierInState"
public void addClassifierInState(ClassifierInState classifierInState1)
// -end- 33CF9F1602BC add_head32989FB2023D "Classifier::addClassifierInState"
;     // empty

/** disconnect a ClassifierInState.
 *  @see #addClassifierInState
 */
// -beg- preserve=no 33CF9F1602BC remove_head32989FB2023D "Classifier::removeClassifierInState"
public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
// -end- 33CF9F1602BC remove_head32989FB2023D "Classifier::removeClassifierInState"
;     // empty

/** tests if a given ClassifierInState is connected.
 *  @see #addClassifierInState
 */
// -beg- preserve=no 33CF9F1602BC test_head32989FB2023D "Classifier::containsClassifierInState"
public boolean containsClassifierInState(ClassifierInState classifierInState1)
// -end- 33CF9F1602BC test_head32989FB2023D "Classifier::containsClassifierInState"
;     // empty

/** used to enumerate all connected ClassifierInStates.
 *  @see #addClassifierInState
 */
// -beg- preserve=no 33CF9F1602BC get_all_head32989FB2023D "Classifier::iteratorClassifierInState"
public Iterator<?> iteratorClassifierInState()
// -end- 33CF9F1602BC get_all_head32989FB2023D "Classifier::iteratorClassifierInState"
;     // empty

/** disconnect all ClassifierInStates.
 *  @see #addClassifierInState
 */
// -beg- preserve=no 33CF9F1602BC remove_all_head32989FB2023D "Classifier::clearClassifierInState"
public void clearClassifierInState()
// -end- 33CF9F1602BC remove_all_head32989FB2023D "Classifier::clearClassifierInState"
;     // empty

/** returns the number of ClassifierInStates.
 *  @see #addClassifierInState
 */
// -beg- preserve=no 33CF9F1602BC size_head32989FB2023D "Classifier::sizeClassifierInState"
public int sizeClassifierInState()
// -end- 33CF9F1602BC size_head32989FB2023D "Classifier::sizeClassifierInState"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9F1602BC _link_body32989FB2023D "Classifier::_linkClassifierInState"
public void _linkClassifierInState(ClassifierInState classifierInState1);
// -end- 33CF9F1602BC _link_body32989FB2023D "Classifier::_linkClassifierInState"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CF9F1602BC _unlink_body32989FB2023D "Classifier::_unlinkClassifierInState"
public void _unlinkClassifierInState(ClassifierInState classifierInState1);
// -end- 33CF9F1602BC _unlink_body32989FB2023D "Classifier::_unlinkClassifierInState"

/** add a ClassifierRole.
 *
 *  @see #removeClassifierRole
 *  @see #containsClassifierRole
 *  @see #iteratorClassifierRole
 *  @see #clearClassifierRole
 *  @see #sizeClassifierRole
 */
// -beg- preserve=no 36008FB700E7 add_head32989FB2023D "ModelElement::addClassifierRole"
public void addClassifierRole(ClassifierRole classifierRole1)
// -end- 36008FB700E7 add_head32989FB2023D "ModelElement::addClassifierRole"
;     // empty

/** disconnect a ClassifierRole.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 remove_head32989FB2023D "ModelElement::removeClassifierRole"
public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
// -end- 36008FB700E7 remove_head32989FB2023D "ModelElement::removeClassifierRole"
;     // empty

/** tests if a given ClassifierRole is connected.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 test_head32989FB2023D "ModelElement::containsClassifierRole"
public boolean containsClassifierRole(ClassifierRole classifierRole1)
// -end- 36008FB700E7 test_head32989FB2023D "ModelElement::containsClassifierRole"
;     // empty

/** used to enumerate all connected ClassifierRoles.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 get_all_head32989FB2023D "ModelElement::iteratorClassifierRole"
public Iterator<?> iteratorClassifierRole()
// -end- 36008FB700E7 get_all_head32989FB2023D "ModelElement::iteratorClassifierRole"
;     // empty

/** disconnect all ClassifierRoles.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 remove_all_head32989FB2023D "ModelElement::clearClassifierRole"
public void clearClassifierRole()
// -end- 36008FB700E7 remove_all_head32989FB2023D "ModelElement::clearClassifierRole"
;     // empty

/** returns the number of ClassifierRoles.
 *  @see #addClassifierRole
 */
// -beg- preserve=no 36008FB700E7 size_head32989FB2023D "ModelElement::sizeClassifierRole"
public int sizeClassifierRole()
// -end- 36008FB700E7 size_head32989FB2023D "ModelElement::sizeClassifierRole"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36008FB700E7 _link_body32989FB2023D "ModelElement::_linkClassifierRole"
public void _linkClassifierRole(ClassifierRole classifierRole1);
// -end- 36008FB700E7 _link_body32989FB2023D "ModelElement::_linkClassifierRole"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36008FB700E7 _unlink_body32989FB2023D "ModelElement::_unlinkClassifierRole"
public void _unlinkClassifierRole(ClassifierRole classifierRole1);
// -end- 36008FB700E7 _unlink_body32989FB2023D "ModelElement::_unlinkClassifierRole"

/** add a Collaboration.
 *
 *  @see #removeCollaboration
 *  @see #containsCollaboration
 *  @see #iteratorCollaboration
 *  @see #clearCollaboration
 *  @see #sizeCollaboration
 */
// -beg- preserve=no 33D1394E029F add_head32989FB2023D "ModelElement::addCollaboration"
public void addCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F add_head32989FB2023D "ModelElement::addCollaboration"
;     // empty

/** disconnect a Collaboration.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_head32989FB2023D "ModelElement::removeCollaboration"
public Collaboration removeCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F remove_head32989FB2023D "ModelElement::removeCollaboration"
;     // empty

/** tests if a given Collaboration is connected.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F test_head32989FB2023D "ModelElement::containsCollaboration"
public boolean containsCollaboration(Collaboration collaboration1)
// -end- 33D1394E029F test_head32989FB2023D "ModelElement::containsCollaboration"
;     // empty

/** used to enumerate all connected Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F get_all_head32989FB2023D "ModelElement::iteratorCollaboration"
public Iterator<?> iteratorCollaboration()
// -end- 33D1394E029F get_all_head32989FB2023D "ModelElement::iteratorCollaboration"
;     // empty

/** disconnect all Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F remove_all_head32989FB2023D "ModelElement::clearCollaboration"
public void clearCollaboration()
// -end- 33D1394E029F remove_all_head32989FB2023D "ModelElement::clearCollaboration"
;     // empty

/** returns the number of Collaborations.
 *  @see #addCollaboration
 */
// -beg- preserve=no 33D1394E029F size_head32989FB2023D "ModelElement::sizeCollaboration"
public int sizeCollaboration()
// -end- 33D1394E029F size_head32989FB2023D "ModelElement::sizeCollaboration"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _link_body32989FB2023D "ModelElement::_linkCollaboration"
public void _linkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _link_body32989FB2023D "ModelElement::_linkCollaboration"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33D1394E029F _unlink_body32989FB2023D "ModelElement::_unlinkCollaboration"
public void _unlinkCollaboration(Collaboration collaboration1);
// -end- 33D1394E029F _unlink_body32989FB2023D "ModelElement::_unlinkCollaboration"

/** add a Instance.
 *
 *  @see #removeInstance
 *  @see #containsInstance
 *  @see #iteratorInstance
 *  @see #clearInstance
 *  @see #sizeInstance
 */
// -beg- preserve=no 33CAD7E900AB add_head32989FB2023D "Classifier::addInstance"
public void addInstance(Instance instance1)
// -end- 33CAD7E900AB add_head32989FB2023D "Classifier::addInstance"
;     // empty

/** disconnect a Instance.
 *  @see #addInstance
 */
// -beg- preserve=no 33CAD7E900AB remove_head32989FB2023D "Classifier::removeInstance"
public Instance removeInstance(Instance instance1)
// -end- 33CAD7E900AB remove_head32989FB2023D "Classifier::removeInstance"
;     // empty

/** tests if a given Instance is connected.
 *  @see #addInstance
 */
// -beg- preserve=no 33CAD7E900AB test_head32989FB2023D "Classifier::containsInstance"
public boolean containsInstance(Instance instance1)
// -end- 33CAD7E900AB test_head32989FB2023D "Classifier::containsInstance"
;     // empty

/** used to enumerate all connected Instances.
 *  @see #addInstance
 */
// -beg- preserve=no 33CAD7E900AB get_all_head32989FB2023D "Classifier::iteratorInstance"
public Iterator<?> iteratorInstance()
// -end- 33CAD7E900AB get_all_head32989FB2023D "Classifier::iteratorInstance"
;     // empty

/** disconnect all Instances.
 *  @see #addInstance
 */
// -beg- preserve=no 33CAD7E900AB remove_all_head32989FB2023D "Classifier::clearInstance"
public void clearInstance()
// -end- 33CAD7E900AB remove_all_head32989FB2023D "Classifier::clearInstance"
;     // empty

/** returns the number of Instances.
 *  @see #addInstance
 */
// -beg- preserve=no 33CAD7E900AB size_head32989FB2023D "Classifier::sizeInstance"
public int sizeInstance()
// -end- 33CAD7E900AB size_head32989FB2023D "Classifier::sizeInstance"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CAD7E900AB _link_body32989FB2023D "Classifier::_linkInstance"
public void _linkInstance(Instance instance1);
// -end- 33CAD7E900AB _link_body32989FB2023D "Classifier::_linkInstance"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CAD7E900AB _unlink_body32989FB2023D "Classifier::_unlinkInstance"
public void _unlinkInstance(Instance instance1);
// -end- 33CAD7E900AB _unlink_body32989FB2023D "Classifier::_unlinkInstance"

/** add a CreateAction.
 *
 *  @see #removeCreateAction
 *  @see #containsCreateAction
 *  @see #iteratorCreateAction
 *  @see #clearCreateAction
 *  @see #sizeCreateAction
 */
// -beg- preserve=no 33CFD0A701A4 add_head32989FB2023D "Classifier::addCreateAction"
public void addCreateAction(CreateAction createAction1)
// -end- 33CFD0A701A4 add_head32989FB2023D "Classifier::addCreateAction"
;     // empty

/** disconnect a CreateAction.
 *  @see #addCreateAction
 */
// -beg- preserve=no 33CFD0A701A4 remove_head32989FB2023D "Classifier::removeCreateAction"
public CreateAction removeCreateAction(CreateAction createAction1)
// -end- 33CFD0A701A4 remove_head32989FB2023D "Classifier::removeCreateAction"
;     // empty

/** tests if a given CreateAction is connected.
 *  @see #addCreateAction
 */
// -beg- preserve=no 33CFD0A701A4 test_head32989FB2023D "Classifier::containsCreateAction"
public boolean containsCreateAction(CreateAction createAction1)
// -end- 33CFD0A701A4 test_head32989FB2023D "Classifier::containsCreateAction"
;     // empty

/** used to enumerate all connected CreateActions.
 *  @see #addCreateAction
 */
// -beg- preserve=no 33CFD0A701A4 get_all_head32989FB2023D "Classifier::iteratorCreateAction"
public Iterator<?> iteratorCreateAction()
// -end- 33CFD0A701A4 get_all_head32989FB2023D "Classifier::iteratorCreateAction"
;     // empty

/** disconnect all CreateActions.
 *  @see #addCreateAction
 */
// -beg- preserve=no 33CFD0A701A4 remove_all_head32989FB2023D "Classifier::clearCreateAction"
public void clearCreateAction()
// -end- 33CFD0A701A4 remove_all_head32989FB2023D "Classifier::clearCreateAction"
;     // empty

/** returns the number of CreateActions.
 *  @see #addCreateAction
 */
// -beg- preserve=no 33CFD0A701A4 size_head32989FB2023D "Classifier::sizeCreateAction"
public int sizeCreateAction()
// -end- 33CFD0A701A4 size_head32989FB2023D "Classifier::sizeCreateAction"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CFD0A701A4 _link_body32989FB2023D "Classifier::_linkCreateAction"
public void _linkCreateAction(CreateAction createAction1);
// -end- 33CFD0A701A4 _link_body32989FB2023D "Classifier::_linkCreateAction"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33CFD0A701A4 _unlink_body32989FB2023D "Classifier::_unlinkCreateAction"
public void _unlinkCreateAction(CreateAction createAction1);
// -end- 33CFD0A701A4 _unlink_body32989FB2023D "Classifier::_unlinkCreateAction"

/** add a Feature.
 *
 *  @see #removeFeature
 *  @see #containsFeature
 *  @see #iteratorFeature
 *  @see #clearFeature
 *  @see #sizeFeature
 */
// -beg- preserve=no 32B5D7EF03D3 add_head32989FB2023D "Classifier::addFeature"
public void addFeature(Feature feature1)
// -end- 32B5D7EF03D3 add_head32989FB2023D "Classifier::addFeature"
;     // empty

// -beg- preserve=no 32B5D7EF03D3 add2_head32989FB2023D "Classifier::add2Feature"
public void addFeature(int index,Feature feature1)
// -end- 32B5D7EF03D3 add2_head32989FB2023D "Classifier::add2Feature"
;     // empty

/** disconnect a Feature.
 *  @see #addFeature
 */
// -beg- preserve=no 32B5D7EF03D3 remove_head32989FB2023D "Classifier::removeFeature"
public Feature removeFeature(Feature feature1)
// -end- 32B5D7EF03D3 remove_head32989FB2023D "Classifier::removeFeature"
;     // empty

/** disconnect a Feature.
 *  @see #addFeature
 */
// -beg- preserve=no 32B5D7EF03D3 remove2_head32989FB2023D "Classifier::remove2Feature"
public Feature removeFeature(int index)
// -end- 32B5D7EF03D3 remove2_head32989FB2023D "Classifier::remove2Feature"
;     // empty

/** change a Feature.
 *  @see #addFeature
 */
// -beg- preserve=no 32B5D7EF03D3 set_head32989FB2023D "Classifier::setFeature"
public Feature setFeature(int index,Feature feature1)
// -end- 32B5D7EF03D3 set_head32989FB2023D "Classifier::setFeature"
;     // empty

/** tests if a given Feature is connected.
 *  @see #addFeature
 */
// -beg- preserve=no 32B5D7EF03D3 test_head32989FB2023D "Classifier::containsFeature"
public boolean containsFeature(Feature feature1)
// -end- 32B5D7EF03D3 test_head32989FB2023D "Classifier::containsFeature"
;     // empty

/** used to enumerate all connected Features.
 *  @see #addFeature
 */
// -beg- preserve=no 32B5D7EF03D3 get_all_head32989FB2023D "Classifier::iteratorFeature"
public Iterator<?> iteratorFeature()
// -end- 32B5D7EF03D3 get_all_head32989FB2023D "Classifier::iteratorFeature"
;     // empty

/** disconnect all Features.
 *  @see #addFeature
 */
// -beg- preserve=no 32B5D7EF03D3 remove_all_head32989FB2023D "Classifier::clearFeature"
public void clearFeature()
// -end- 32B5D7EF03D3 remove_all_head32989FB2023D "Classifier::clearFeature"
;     // empty

/** returns the number of Features.
 *  @see #addFeature
 */
// -beg- preserve=no 32B5D7EF03D3 size_head32989FB2023D "Classifier::sizeFeature"
public int sizeFeature()
// -end- 32B5D7EF03D3 size_head32989FB2023D "Classifier::sizeFeature"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B5D7EF03D3 _link_body32989FB2023D "Classifier::_linkFeature"
public void _linkFeature(Feature feature1);
// -end- 32B5D7EF03D3 _link_body32989FB2023D "Classifier::_linkFeature"

/** DONT USE; link management internal
 */
// -beg- preserve=no 32B5D7EF03D3 _unlink_body32989FB2023D "Classifier::_unlinkFeature"
public void _unlinkFeature(Feature feature1);
// -end- 32B5D7EF03D3 _unlink_body32989FB2023D "Classifier::_unlinkFeature"

/** add a Association.
 *
 *  @see #removeAssociation
 *  @see #containsAssociation
 *  @see #iteratorAssociation
 *  @see #clearAssociation
 *  @see #sizeAssociation
 */
// -beg- preserve=no 33E265070353 add_head32989FB2023D "Classifier::addAssociation"
public void addAssociation(AssociationEnd association1)
// -end- 33E265070353 add_head32989FB2023D "Classifier::addAssociation"
;     // empty

/** disconnect a Association.
 *  @see #addAssociation
 */
// -beg- preserve=no 33E265070353 remove_head32989FB2023D "Classifier::removeAssociation"
public AssociationEnd removeAssociation(AssociationEnd association1)
// -end- 33E265070353 remove_head32989FB2023D "Classifier::removeAssociation"
;     // empty

/** tests if a given Association is connected.
 *  @see #addAssociation
 */
// -beg- preserve=no 33E265070353 test_head32989FB2023D "Classifier::containsAssociation"
public boolean containsAssociation(AssociationEnd association1)
// -end- 33E265070353 test_head32989FB2023D "Classifier::containsAssociation"
;     // empty

/** used to enumerate all connected Associations.
 *  @see #addAssociation
 */
// -beg- preserve=no 33E265070353 get_all_head32989FB2023D "Classifier::iteratorAssociation"
public Iterator<?> iteratorAssociation()
// -end- 33E265070353 get_all_head32989FB2023D "Classifier::iteratorAssociation"
;     // empty

/** disconnect all Associations.
 *  @see #addAssociation
 */
// -beg- preserve=no 33E265070353 remove_all_head32989FB2023D "Classifier::clearAssociation"
public void clearAssociation()
// -end- 33E265070353 remove_all_head32989FB2023D "Classifier::clearAssociation"
;     // empty

/** returns the number of Associations.
 *  @see #addAssociation
 */
// -beg- preserve=no 33E265070353 size_head32989FB2023D "Classifier::sizeAssociation"
public int sizeAssociation()
// -end- 33E265070353 size_head32989FB2023D "Classifier::sizeAssociation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33E265070353 _link_body32989FB2023D "Classifier::_linkAssociation"
public void _linkAssociation(AssociationEnd association1);
// -end- 33E265070353 _link_body32989FB2023D "Classifier::_linkAssociation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33E265070353 _unlink_body32989FB2023D "Classifier::_unlinkAssociation"
public void _unlinkAssociation(AssociationEnd association1);
// -end- 33E265070353 _unlink_body32989FB2023D "Classifier::_unlinkAssociation"

/** add a SpecifiedEnd.
 *
 *  @see #removeSpecifiedEnd
 *  @see #containsSpecifiedEnd
 *  @see #iteratorSpecifiedEnd
 *  @see #clearSpecifiedEnd
 *  @see #sizeSpecifiedEnd
 */
// -beg- preserve=no 33F0EFAD00AB add_head32989FB2023D "Classifier::addSpecifiedEnd"
public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
// -end- 33F0EFAD00AB add_head32989FB2023D "Classifier::addSpecifiedEnd"
;     // empty

/** disconnect a SpecifiedEnd.
 *  @see #addSpecifiedEnd
 */
// -beg- preserve=no 33F0EFAD00AB remove_head32989FB2023D "Classifier::removeSpecifiedEnd"
public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
// -end- 33F0EFAD00AB remove_head32989FB2023D "Classifier::removeSpecifiedEnd"
;     // empty

/** tests if a given SpecifiedEnd is connected.
 *  @see #addSpecifiedEnd
 */
// -beg- preserve=no 33F0EFAD00AB test_head32989FB2023D "Classifier::containsSpecifiedEnd"
public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
// -end- 33F0EFAD00AB test_head32989FB2023D "Classifier::containsSpecifiedEnd"
;     // empty

/** used to enumerate all connected SpecifiedEnds.
 *  @see #addSpecifiedEnd
 */
// -beg- preserve=no 33F0EFAD00AB get_all_head32989FB2023D "Classifier::iteratorSpecifiedEnd"
public Iterator<?> iteratorSpecifiedEnd()
// -end- 33F0EFAD00AB get_all_head32989FB2023D "Classifier::iteratorSpecifiedEnd"
;     // empty

/** disconnect all SpecifiedEnds.
 *  @see #addSpecifiedEnd
 */
// -beg- preserve=no 33F0EFAD00AB remove_all_head32989FB2023D "Classifier::clearSpecifiedEnd"
public void clearSpecifiedEnd()
// -end- 33F0EFAD00AB remove_all_head32989FB2023D "Classifier::clearSpecifiedEnd"
;     // empty

/** returns the number of SpecifiedEnds.
 *  @see #addSpecifiedEnd
 */
// -beg- preserve=no 33F0EFAD00AB size_head32989FB2023D "Classifier::sizeSpecifiedEnd"
public int sizeSpecifiedEnd()
// -end- 33F0EFAD00AB size_head32989FB2023D "Classifier::sizeSpecifiedEnd"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33F0EFAD00AB _link_body32989FB2023D "Classifier::_linkSpecifiedEnd"
public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1);
// -end- 33F0EFAD00AB _link_body32989FB2023D "Classifier::_linkSpecifiedEnd"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33F0EFAD00AB _unlink_body32989FB2023D "Classifier::_unlinkSpecifiedEnd"
public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1);
// -end- 33F0EFAD00AB _unlink_body32989FB2023D "Classifier::_unlinkSpecifiedEnd"

/** add a PowertypeRange.
 *
 *  @see #removePowertypeRange
 *  @see #containsPowertypeRange
 *  @see #iteratorPowertypeRange
 *  @see #clearPowertypeRange
 *  @see #sizePowertypeRange
 */
// -beg- preserve=no 36E96A87033E add_head32989FB2023D "Classifier::addPowertypeRange"
public void addPowertypeRange(Generalization powertypeRange1)
// -end- 36E96A87033E add_head32989FB2023D "Classifier::addPowertypeRange"
;     // empty

/** disconnect a PowertypeRange.
 *  @see #addPowertypeRange
 */
// -beg- preserve=no 36E96A87033E remove_head32989FB2023D "Classifier::removePowertypeRange"
public Generalization removePowertypeRange(Generalization powertypeRange1)
// -end- 36E96A87033E remove_head32989FB2023D "Classifier::removePowertypeRange"
;     // empty

/** tests if a given PowertypeRange is connected.
 *  @see #addPowertypeRange
 */
// -beg- preserve=no 36E96A87033E test_head32989FB2023D "Classifier::containsPowertypeRange"
public boolean containsPowertypeRange(Generalization powertypeRange1)
// -end- 36E96A87033E test_head32989FB2023D "Classifier::containsPowertypeRange"
;     // empty

/** used to enumerate all connected PowertypeRanges.
 *  @see #addPowertypeRange
 */
// -beg- preserve=no 36E96A87033E get_all_head32989FB2023D "Classifier::iteratorPowertypeRange"
public Iterator<?> iteratorPowertypeRange()
// -end- 36E96A87033E get_all_head32989FB2023D "Classifier::iteratorPowertypeRange"
;     // empty

/** disconnect all PowertypeRanges.
 *  @see #addPowertypeRange
 */
// -beg- preserve=no 36E96A87033E remove_all_head32989FB2023D "Classifier::clearPowertypeRange"
public void clearPowertypeRange()
// -end- 36E96A87033E remove_all_head32989FB2023D "Classifier::clearPowertypeRange"
;     // empty

/** returns the number of PowertypeRanges.
 *  @see #addPowertypeRange
 */
// -beg- preserve=no 36E96A87033E size_head32989FB2023D "Classifier::sizePowertypeRange"
public int sizePowertypeRange()
// -end- 36E96A87033E size_head32989FB2023D "Classifier::sizePowertypeRange"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36E96A87033E _link_body32989FB2023D "Classifier::_linkPowertypeRange"
public void _linkPowertypeRange(Generalization powertypeRange1);
// -end- 36E96A87033E _link_body32989FB2023D "Classifier::_linkPowertypeRange"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36E96A87033E _unlink_body32989FB2023D "Classifier::_unlinkPowertypeRange"
public void _unlinkPowertypeRange(Generalization powertypeRange1);
// -end- 36E96A87033E _unlink_body32989FB2023D "Classifier::_unlinkPowertypeRange"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 32989FB2023D detail_end "Classifier"

// -end- 32989FB2023D detail_end "Classifier"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
