// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-01 12:44:28 $
// $Revision: 1.1 $
//

// -beg- preserve=no 40432AE50263 package "UmlOperation"
package ch.ehi.uml1_4.implementation;
// -end- 40432AE50263 package "UmlOperation"

// -beg- preserve=no 40432AE50263 autoimport "UmlOperation"
import ch.ehi.uml1_4.foundation.core.Operation;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.commonbehavior.CallAction;
import ch.ehi.uml1_4.behaviour.statemachines.CallEvent;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.foundation.core.Method;
import ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind;
import ch.ehi.basics.types.NlsString;
import ch.ehi.uml1_4.behaviour.commonbehavior.Signal;
import ch.ehi.uml1_4.foundation.core.Parameter;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.datatypes.ScopeKind;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
// -end- 40432AE50263 autoimport "UmlOperation"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 40432AE50263 import "UmlOperation"

// -end- 40432AE50263 import "UmlOperation"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2004-03-01 12:44:28 $
 */
public class UmlOperation implements Operation
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 40432AE50263 detail_begin "UmlOperation"

  // -end- 40432AE50263 detail_begin "UmlOperation"

  // -beg- preserve=no 40432E3302E2 head40432AE50263 "unlinkAll"
  public void unlinkAll()
  // -end- 40432E3302E2 head40432AE50263 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 40432E3302E2 throws40432AE50263 "unlinkAll"

    // -end- 40432E3302E2 throws40432AE50263 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 40432E3302E2 body40432AE50263 "unlinkAll"
    
    clearCallAction();
    clearOccurrence();
    clearCollaboration();
    clearMethod();
    setSpecification(null);
    clearRaisedSignal();
    clearParameter();
    clearClassifierRole();
    detachOwner();
    clearBehavior();
    clearPartition();
    clearCollaborationInstanceSet();
    detachNamespace();
    clearClientDependency();
    clearTaggedValue();
    clearConstraint();
    clearSupplierDependency();
    clearPresentation();
    clearContainer();
    clearTemplateParameter();
    clearTargetFlow();
    clearSourceFlow();
    clearDefaultParameter();
    clearComment();
    // Role TemplateArgument: TemplateArgument object(s) may point to this
    // Role ParameterDefinition: TemplateParameter object(s) may point to this
    clearStereotype();
    clearReferenceTag();
    clearImportedBy();
    // Role EditorTreeElement: EditorTreeElement object(s) may point to this
    setName(null);
    setDocumentation(null);
    
    // -end- 40432E3302E2 body40432AE50263 "unlinkAll"
    }

  // -beg- preserve=no 40432E380194 head40432AE50263 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 40432E380194 head40432AE50263 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 40432E380194 throws40432AE50263 "enumerateChildren"

    // -end- 40432E380194 throws40432AE50263 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 40432E380194 body40432AE50263 "enumerateChildren"
    java.util.Iterator it=null;
    visitor.visit(getSpecification());
    it=iteratorParameter();while(it.hasNext())visitor.visit(it.next());
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    visitor.visit(getDocumentation());
    
    // -end- 40432E380194 body40432AE50263 "enumerateChildren"
    }

  // -beg- preserve=no 336991630064 code40432AE50263 "callAction"
  private java.util.Set callAction = new java.util.HashSet();
  // -end- 336991630064 code40432AE50263 "callAction"

  /** add a CallAction.
   *  
   *  @see #removeCallAction
   *  @see #containsCallAction
   *  @see #iteratorCallAction
   *  @see #clearCallAction
   *  @see #sizeCallAction
   */
  // -beg- preserve=no 336991630064 add_head40432AE50263 "Operation::addCallAction"
  public void addCallAction(CallAction callAction1)
  // -end- 336991630064 add_head40432AE50263 "Operation::addCallAction"
  {
    // -beg- preserve=no 336991630064 add_body40432AE50263 "Operation::addCallAction"
    callAction.add(callAction1);
    callAction1._linkCalled(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCallAction"));
    return;
    // -end- 336991630064 add_body40432AE50263 "Operation::addCallAction"
  }

  /** disconnect a CallAction.
   *  @see #addCallAction
   */
  // -beg- preserve=no 336991630064 remove_head40432AE50263 "Operation::removeCallAction"
  public CallAction removeCallAction(CallAction callAction1)
  // -end- 336991630064 remove_head40432AE50263 "Operation::removeCallAction"
  {
    // -beg- preserve=no 336991630064 remove_body40432AE50263 "Operation::removeCallAction"
    CallAction ret=null;
    if(callAction1==null || !callAction.contains(callAction1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = callAction1;
    callAction.remove(callAction1);
    callAction1._unlinkCalled(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCallAction"));
    return ret;
    // -end- 336991630064 remove_body40432AE50263 "Operation::removeCallAction"
  }

  /** tests if a given CallAction is connected.
   *  @see #addCallAction
   */
  // -beg- preserve=no 336991630064 test_head40432AE50263 "Operation::containsCallAction"
  public boolean containsCallAction(CallAction callAction1)
  // -end- 336991630064 test_head40432AE50263 "Operation::containsCallAction"
  {
    // -beg- preserve=no 336991630064 test_body40432AE50263 "Operation::containsCallAction"
    return callAction.contains(callAction1);
    // -end- 336991630064 test_body40432AE50263 "Operation::containsCallAction"
  }

  /** used to enumerate all connected CallActions.
   *  @see #addCallAction
   */
  // -beg- preserve=no 336991630064 get_all_head40432AE50263 "Operation::iteratorCallAction"
  public java.util.Iterator iteratorCallAction()
  // -end- 336991630064 get_all_head40432AE50263 "Operation::iteratorCallAction"
  {
    // -beg- preserve=no 336991630064 get_all_body40432AE50263 "Operation::iteratorCallAction"
    return callAction.iterator();
    // -end- 336991630064 get_all_body40432AE50263 "Operation::iteratorCallAction"
  }

  /** disconnect all CallActions.
   *  @see #addCallAction
   */
  // -beg- preserve=no 336991630064 remove_all_head40432AE50263 "Operation::clearCallAction"
  public void clearCallAction()
  // -end- 336991630064 remove_all_head40432AE50263 "Operation::clearCallAction"
  {
    // -beg- preserve=no 336991630064 remove_all_body40432AE50263 "Operation::clearCallAction"
    if(sizeCallAction()>0){
      for(java.util.Iterator p = callAction.iterator(); p.hasNext();){
        ((CallAction)p.next())._unlinkCalled(this);
      }
      callAction.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCallAction"));
    }
    // -end- 336991630064 remove_all_body40432AE50263 "Operation::clearCallAction"
  }

  /** returns the number of CallActions.
   *  @see #addCallAction
   */
  // -beg- preserve=no 336991630064 size_head40432AE50263 "Operation::sizeCallAction"
  public int sizeCallAction()
  // -end- 336991630064 size_head40432AE50263 "Operation::sizeCallAction"
  {
    // -beg- preserve=no 336991630064 size_body40432AE50263 "Operation::sizeCallAction"
    return callAction.size();
    // -end- 336991630064 size_body40432AE50263 "Operation::sizeCallAction"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 336991630064 _link_body40432AE50263 "Operation::_linkCallAction"
  public void _linkCallAction(CallAction callAction1)
  {
    callAction.add(callAction1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCallAction"));
    return;
  }
  // -end- 336991630064 _link_body40432AE50263 "Operation::_linkCallAction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 336991630064 _unlink_body40432AE50263 "Operation::_unlinkCallAction"
  public void _unlinkCallAction(CallAction callAction1)
  {
    callAction.remove(callAction1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCallAction"));
    return;
  }
  // -end- 336991630064 _unlink_body40432AE50263 "Operation::_unlinkCallAction"

  // -beg- preserve=no 32B598450001 code40432AE50263 "occurrence"
  private java.util.Set occurrence = new java.util.HashSet();
  // -end- 32B598450001 code40432AE50263 "occurrence"

  /** add a Occurrence.
   *  
   *  @see #removeOccurrence
   *  @see #containsOccurrence
   *  @see #iteratorOccurrence
   *  @see #clearOccurrence
   *  @see #sizeOccurrence
   */
  // -beg- preserve=no 32B598450001 add_head40432AE50263 "Operation::addOccurrence"
  public void addOccurrence(CallEvent occurrence1)
  // -end- 32B598450001 add_head40432AE50263 "Operation::addOccurrence"
  {
    // -beg- preserve=no 32B598450001 add_body40432AE50263 "Operation::addOccurrence"
    occurrence.add(occurrence1);
    occurrence1._linkOperation(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addOccurrence"));
    return;
    // -end- 32B598450001 add_body40432AE50263 "Operation::addOccurrence"
  }

  /** disconnect a Occurrence.
   *  @see #addOccurrence
   */
  // -beg- preserve=no 32B598450001 remove_head40432AE50263 "Operation::removeOccurrence"
  public CallEvent removeOccurrence(CallEvent occurrence1)
  // -end- 32B598450001 remove_head40432AE50263 "Operation::removeOccurrence"
  {
    // -beg- preserve=no 32B598450001 remove_body40432AE50263 "Operation::removeOccurrence"
    CallEvent ret=null;
    if(occurrence1==null || !occurrence.contains(occurrence1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = occurrence1;
    occurrence.remove(occurrence1);
    occurrence1._unlinkOperation(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeOccurrence"));
    return ret;
    // -end- 32B598450001 remove_body40432AE50263 "Operation::removeOccurrence"
  }

  /** tests if a given Occurrence is connected.
   *  @see #addOccurrence
   */
  // -beg- preserve=no 32B598450001 test_head40432AE50263 "Operation::containsOccurrence"
  public boolean containsOccurrence(CallEvent occurrence1)
  // -end- 32B598450001 test_head40432AE50263 "Operation::containsOccurrence"
  {
    // -beg- preserve=no 32B598450001 test_body40432AE50263 "Operation::containsOccurrence"
    return occurrence.contains(occurrence1);
    // -end- 32B598450001 test_body40432AE50263 "Operation::containsOccurrence"
  }

  /** used to enumerate all connected Occurrences.
   *  @see #addOccurrence
   */
  // -beg- preserve=no 32B598450001 get_all_head40432AE50263 "Operation::iteratorOccurrence"
  public java.util.Iterator iteratorOccurrence()
  // -end- 32B598450001 get_all_head40432AE50263 "Operation::iteratorOccurrence"
  {
    // -beg- preserve=no 32B598450001 get_all_body40432AE50263 "Operation::iteratorOccurrence"
    return occurrence.iterator();
    // -end- 32B598450001 get_all_body40432AE50263 "Operation::iteratorOccurrence"
  }

  /** disconnect all Occurrences.
   *  @see #addOccurrence
   */
  // -beg- preserve=no 32B598450001 remove_all_head40432AE50263 "Operation::clearOccurrence"
  public void clearOccurrence()
  // -end- 32B598450001 remove_all_head40432AE50263 "Operation::clearOccurrence"
  {
    // -beg- preserve=no 32B598450001 remove_all_body40432AE50263 "Operation::clearOccurrence"
    if(sizeOccurrence()>0){
      for(java.util.Iterator p = occurrence.iterator(); p.hasNext();){
        ((CallEvent)p.next())._unlinkOperation(this);
      }
      occurrence.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearOccurrence"));
    }
    // -end- 32B598450001 remove_all_body40432AE50263 "Operation::clearOccurrence"
  }

  /** returns the number of Occurrences.
   *  @see #addOccurrence
   */
  // -beg- preserve=no 32B598450001 size_head40432AE50263 "Operation::sizeOccurrence"
  public int sizeOccurrence()
  // -end- 32B598450001 size_head40432AE50263 "Operation::sizeOccurrence"
  {
    // -beg- preserve=no 32B598450001 size_body40432AE50263 "Operation::sizeOccurrence"
    return occurrence.size();
    // -end- 32B598450001 size_body40432AE50263 "Operation::sizeOccurrence"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B598450001 _link_body40432AE50263 "Operation::_linkOccurrence"
  public void _linkOccurrence(CallEvent occurrence1)
  {
    occurrence.add(occurrence1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkOccurrence"));
    return;
  }
  // -end- 32B598450001 _link_body40432AE50263 "Operation::_linkOccurrence"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B598450001 _unlink_body40432AE50263 "Operation::_unlinkOccurrence"
  public void _unlinkOccurrence(CallEvent occurrence1)
  {
    occurrence.remove(occurrence1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkOccurrence"));
    return;
  }
  // -end- 32B598450001 _unlink_body40432AE50263 "Operation::_unlinkOccurrence"

  // -beg- preserve=no 33D1394E029F code40432AE50263 "collaboration"
  private java.util.Set collaboration = new java.util.HashSet();
  // -end- 33D1394E029F code40432AE50263 "collaboration"

  /** add a Collaboration.
   *  
   *  @see #removeCollaboration
   *  @see #containsCollaboration
   *  @see #iteratorCollaboration
   *  @see #clearCollaboration
   *  @see #sizeCollaboration
   */
  // -beg- preserve=no 33D1394E029F add_head40432AE50263 "ModelElement::addCollaboration"
  public void addCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F add_head40432AE50263 "ModelElement::addCollaboration"
  {
    // -beg- preserve=no 33D1394E029F add_body40432AE50263 "ModelElement::addCollaboration"
    collaboration.add(collaboration1);
    collaboration1._linkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCollaboration"));
    return;
    // -end- 33D1394E029F add_body40432AE50263 "ModelElement::addCollaboration"
  }

  /** disconnect a Collaboration.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_head40432AE50263 "ModelElement::removeCollaboration"
  public Collaboration removeCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F remove_head40432AE50263 "ModelElement::removeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_body40432AE50263 "ModelElement::removeCollaboration"
    Collaboration ret=null;
    if(collaboration1==null || !collaboration.contains(collaboration1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = collaboration1;
    collaboration.remove(collaboration1);
    collaboration1._unlinkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCollaboration"));
    return ret;
    // -end- 33D1394E029F remove_body40432AE50263 "ModelElement::removeCollaboration"
  }

  /** tests if a given Collaboration is connected.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F test_head40432AE50263 "ModelElement::containsCollaboration"
  public boolean containsCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F test_head40432AE50263 "ModelElement::containsCollaboration"
  {
    // -beg- preserve=no 33D1394E029F test_body40432AE50263 "ModelElement::containsCollaboration"
    return collaboration.contains(collaboration1);
    // -end- 33D1394E029F test_body40432AE50263 "ModelElement::containsCollaboration"
  }

  /** used to enumerate all connected Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F get_all_head40432AE50263 "ModelElement::iteratorCollaboration"
  public java.util.Iterator iteratorCollaboration()
  // -end- 33D1394E029F get_all_head40432AE50263 "ModelElement::iteratorCollaboration"
  {
    // -beg- preserve=no 33D1394E029F get_all_body40432AE50263 "ModelElement::iteratorCollaboration"
    return collaboration.iterator();
    // -end- 33D1394E029F get_all_body40432AE50263 "ModelElement::iteratorCollaboration"
  }

  /** disconnect all Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_all_head40432AE50263 "ModelElement::clearCollaboration"
  public void clearCollaboration()
  // -end- 33D1394E029F remove_all_head40432AE50263 "ModelElement::clearCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_all_body40432AE50263 "ModelElement::clearCollaboration"
    if(sizeCollaboration()>0){
      for(java.util.Iterator p = collaboration.iterator(); p.hasNext();){
        ((Collaboration)p.next())._unlinkConstrainingElement(this);
      }
      collaboration.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCollaboration"));
    }
    // -end- 33D1394E029F remove_all_body40432AE50263 "ModelElement::clearCollaboration"
  }

  /** returns the number of Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F size_head40432AE50263 "ModelElement::sizeCollaboration"
  public int sizeCollaboration()
  // -end- 33D1394E029F size_head40432AE50263 "ModelElement::sizeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F size_body40432AE50263 "ModelElement::sizeCollaboration"
    return collaboration.size();
    // -end- 33D1394E029F size_body40432AE50263 "ModelElement::sizeCollaboration"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _link_body40432AE50263 "ModelElement::_linkCollaboration"
  public void _linkCollaboration(Collaboration collaboration1)
  {
    collaboration.add(collaboration1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCollaboration"));
    return;
  }
  // -end- 33D1394E029F _link_body40432AE50263 "ModelElement::_linkCollaboration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _unlink_body40432AE50263 "ModelElement::_unlinkCollaboration"
  public void _unlinkCollaboration(Collaboration collaboration1)
  {
    collaboration.remove(collaboration1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCollaboration"));
    return;
  }
  // -end- 33D1394E029F _unlink_body40432AE50263 "ModelElement::_unlinkCollaboration"

  // -beg- preserve=no 32B6D9BE00C8 code40432AE50263 "method"
  private java.util.Set method = new java.util.HashSet();
  // -end- 32B6D9BE00C8 code40432AE50263 "method"

  /** add a Method.
   *  
   *  @see #removeMethod
   *  @see #containsMethod
   *  @see #iteratorMethod
   *  @see #clearMethod
   *  @see #sizeMethod
   */
  // -beg- preserve=no 32B6D9BE00C8 add_head40432AE50263 "Operation::addMethod"
  public void addMethod(Method method1)
  // -end- 32B6D9BE00C8 add_head40432AE50263 "Operation::addMethod"
  {
    // -beg- preserve=no 32B6D9BE00C8 add_body40432AE50263 "Operation::addMethod"
    method.add(method1);
    method1._linkSpecification(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addMethod"));
    return;
    // -end- 32B6D9BE00C8 add_body40432AE50263 "Operation::addMethod"
  }

  /** disconnect a Method.
   *  @see #addMethod
   */
  // -beg- preserve=no 32B6D9BE00C8 remove_head40432AE50263 "Operation::removeMethod"
  public Method removeMethod(Method method1)
  // -end- 32B6D9BE00C8 remove_head40432AE50263 "Operation::removeMethod"
  {
    // -beg- preserve=no 32B6D9BE00C8 remove_body40432AE50263 "Operation::removeMethod"
    Method ret=null;
    if(method1==null || !method.contains(method1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = method1;
    method.remove(method1);
    method1._unlinkSpecification(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeMethod"));
    return ret;
    // -end- 32B6D9BE00C8 remove_body40432AE50263 "Operation::removeMethod"
  }

  /** tests if a given Method is connected.
   *  @see #addMethod
   */
  // -beg- preserve=no 32B6D9BE00C8 test_head40432AE50263 "Operation::containsMethod"
  public boolean containsMethod(Method method1)
  // -end- 32B6D9BE00C8 test_head40432AE50263 "Operation::containsMethod"
  {
    // -beg- preserve=no 32B6D9BE00C8 test_body40432AE50263 "Operation::containsMethod"
    return method.contains(method1);
    // -end- 32B6D9BE00C8 test_body40432AE50263 "Operation::containsMethod"
  }

  /** used to enumerate all connected Methods.
   *  @see #addMethod
   */
  // -beg- preserve=no 32B6D9BE00C8 get_all_head40432AE50263 "Operation::iteratorMethod"
  public java.util.Iterator iteratorMethod()
  // -end- 32B6D9BE00C8 get_all_head40432AE50263 "Operation::iteratorMethod"
  {
    // -beg- preserve=no 32B6D9BE00C8 get_all_body40432AE50263 "Operation::iteratorMethod"
    return method.iterator();
    // -end- 32B6D9BE00C8 get_all_body40432AE50263 "Operation::iteratorMethod"
  }

  /** disconnect all Methods.
   *  @see #addMethod
   */
  // -beg- preserve=no 32B6D9BE00C8 remove_all_head40432AE50263 "Operation::clearMethod"
  public void clearMethod()
  // -end- 32B6D9BE00C8 remove_all_head40432AE50263 "Operation::clearMethod"
  {
    // -beg- preserve=no 32B6D9BE00C8 remove_all_body40432AE50263 "Operation::clearMethod"
    if(sizeMethod()>0){
      for(java.util.Iterator p = method.iterator(); p.hasNext();){
        ((Method)p.next())._unlinkSpecification(this);
      }
      method.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearMethod"));
    }
    // -end- 32B6D9BE00C8 remove_all_body40432AE50263 "Operation::clearMethod"
  }

  /** returns the number of Methods.
   *  @see #addMethod
   */
  // -beg- preserve=no 32B6D9BE00C8 size_head40432AE50263 "Operation::sizeMethod"
  public int sizeMethod()
  // -end- 32B6D9BE00C8 size_head40432AE50263 "Operation::sizeMethod"
  {
    // -beg- preserve=no 32B6D9BE00C8 size_body40432AE50263 "Operation::sizeMethod"
    return method.size();
    // -end- 32B6D9BE00C8 size_body40432AE50263 "Operation::sizeMethod"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B6D9BE00C8 _link_body40432AE50263 "Operation::_linkMethod"
  public void _linkMethod(Method method1)
  {
    method.add(method1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkMethod"));
    return;
  }
  // -end- 32B6D9BE00C8 _link_body40432AE50263 "Operation::_linkMethod"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B6D9BE00C8 _unlink_body40432AE50263 "Operation::_unlinkMethod"
  public void _unlinkMethod(Method method1)
  {
    method.remove(method1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkMethod"));
    return;
  }
  // -end- 32B6D9BE00C8 _unlink_body40432AE50263 "Operation::_unlinkMethod"

  // -beg- preserve=no 33F0E99F0230 var40432AE50263 "concurrency"
  private int concurrency;
  // -end- 33F0E99F0230 var40432AE50263 "concurrency"

  /** get current value of concurrency
   *  @see ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind
   *  @see #setConcurrency
   */
  // -beg- preserve=no 33F0E99F0230 get_head40432AE50263 "concurrency"
  public  int getConcurrency()
  // -end- 33F0E99F0230 get_head40432AE50263 "concurrency"
  {
    // -beg- preserve=no 33F0E99F0230 get_body40432AE50263 "concurrency"
    return concurrency;
    // -end- 33F0E99F0230 get_body40432AE50263 "concurrency"
  }

  /** set current value of concurrency
   *  @see ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind
   *  @see #getConcurrency
   */
  // -beg- preserve=no 33F0E99F0230 set_head40432AE50263 "concurrency"
  public  void setConcurrency(int value1)
  // -end- 33F0E99F0230 set_head40432AE50263 "concurrency"
  {
    // -beg- preserve=no 33F0E99F0230 set_body40432AE50263 "concurrency"
    if(concurrency != value1){
      concurrency = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setConcurrency"));
    }
    // -end- 33F0E99F0230 set_body40432AE50263 "concurrency"
  }

  // -beg- preserve=no 3627CF1A035C var40432AE50263 "isRoot"
  private boolean isRoot;
  // -end- 3627CF1A035C var40432AE50263 "isRoot"

  /** get current value of isRoot
   *  @see #setRoot
   */
  // -beg- preserve=no 3627CF1A035C get_head40432AE50263 "isRoot"
  public  boolean isRoot()
  // -end- 3627CF1A035C get_head40432AE50263 "isRoot"
  {
    // -beg- preserve=no 3627CF1A035C get_body40432AE50263 "isRoot"
    return isRoot;
    // -end- 3627CF1A035C get_body40432AE50263 "isRoot"
  }

  /** set current value of isRoot
   *  @see #isRoot
   */
  // -beg- preserve=no 3627CF1A035C set_head40432AE50263 "isRoot"
  public  void setRoot(boolean value1)
  // -end- 3627CF1A035C set_head40432AE50263 "isRoot"
  {
    // -beg- preserve=no 3627CF1A035C set_body40432AE50263 "isRoot"
    if(isRoot != value1){
      isRoot = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRoot"));
    }
    // -end- 3627CF1A035C set_body40432AE50263 "isRoot"
  }

  // -beg- preserve=no 3627CF2301AE var40432AE50263 "isLeaf"
  private boolean isLeaf;
  // -end- 3627CF2301AE var40432AE50263 "isLeaf"

  /** get current value of isLeaf
   *  @see #setLeaf
   */
  // -beg- preserve=no 3627CF2301AE get_head40432AE50263 "isLeaf"
  public  boolean isLeaf()
  // -end- 3627CF2301AE get_head40432AE50263 "isLeaf"
  {
    // -beg- preserve=no 3627CF2301AE get_body40432AE50263 "isLeaf"
    return isLeaf;
    // -end- 3627CF2301AE get_body40432AE50263 "isLeaf"
  }

  /** set current value of isLeaf
   *  @see #isLeaf
   */
  // -beg- preserve=no 3627CF2301AE set_head40432AE50263 "isLeaf"
  public  void setLeaf(boolean value1)
  // -end- 3627CF2301AE set_head40432AE50263 "isLeaf"
  {
    // -beg- preserve=no 3627CF2301AE set_body40432AE50263 "isLeaf"
    if(isLeaf != value1){
      isLeaf = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLeaf"));
    }
    // -end- 3627CF2301AE set_body40432AE50263 "isLeaf"
  }

  // -beg- preserve=no 3627CF2B030C var40432AE50263 "isAbstract"
  private boolean isAbstract;
  // -end- 3627CF2B030C var40432AE50263 "isAbstract"

  /** get current value of isAbstract
   *  @see #setAbstract
   */
  // -beg- preserve=no 3627CF2B030C get_head40432AE50263 "isAbstract"
  public  boolean isAbstract()
  // -end- 3627CF2B030C get_head40432AE50263 "isAbstract"
  {
    // -beg- preserve=no 3627CF2B030C get_body40432AE50263 "isAbstract"
    return isAbstract;
    // -end- 3627CF2B030C get_body40432AE50263 "isAbstract"
  }

  /** set current value of isAbstract
   *  @see #isAbstract
   */
  // -beg- preserve=no 3627CF2B030C set_head40432AE50263 "isAbstract"
  public  void setAbstract(boolean value1)
  // -end- 3627CF2B030C set_head40432AE50263 "isAbstract"
  {
    // -beg- preserve=no 3627CF2B030C set_body40432AE50263 "isAbstract"
    if(isAbstract != value1){
      isAbstract = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
    }
    // -end- 3627CF2B030C set_body40432AE50263 "isAbstract"
  }

  // -beg- preserve=no 33EC14D000FA var40432AE50263 "specification"
  private NlsString specification = null;
  // -end- 33EC14D000FA var40432AE50263 "specification"

  /** get current value of specification
   *  @see #setSpecification
   */
  // -beg- preserve=no 33EC14D000FA get_head40432AE50263 "specification"
  public  NlsString getSpecification()
  // -end- 33EC14D000FA get_head40432AE50263 "specification"
  {
    // -beg- preserve=no 33EC14D000FA get_body40432AE50263 "specification"
    return specification;
    // -end- 33EC14D000FA get_body40432AE50263 "specification"
  }

  /** set current value of specification
   *  @see #getSpecification
   */
  // -beg- preserve=no 33EC14D000FA set_head40432AE50263 "specification"
  public  void setSpecification(NlsString value1)
  // -end- 33EC14D000FA set_head40432AE50263 "specification"
  {
    // -beg- preserve=no 33EC14D000FA set_body40432AE50263 "specification"
    if(specification!=value1 && (specification==null || !specification.equals(value1))){
      specification = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSpecification"));
    }
    // -end- 33EC14D000FA set_body40432AE50263 "specification"
  }

  // -beg- preserve=no 33FFD98400B6 code40432AE50263 "raisedSignal"
  private java.util.Set raisedSignal = new java.util.HashSet();
  // -end- 33FFD98400B6 code40432AE50263 "raisedSignal"

  /** add a RaisedSignal.
   *  
   *  @see #removeRaisedSignal
   *  @see #containsRaisedSignal
   *  @see #iteratorRaisedSignal
   *  @see #clearRaisedSignal
   *  @see #sizeRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 add_head40432AE50263 "BehavioralFeature::addRaisedSignal"
  public void addRaisedSignal(Signal raisedSignal1)
  // -end- 33FFD98400B6 add_head40432AE50263 "BehavioralFeature::addRaisedSignal"
  {
    // -beg- preserve=no 33FFD98400B6 add_body40432AE50263 "BehavioralFeature::addRaisedSignal"
    raisedSignal.add(raisedSignal1);
    raisedSignal1._linkContext(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addRaisedSignal"));
    return;
    // -end- 33FFD98400B6 add_body40432AE50263 "BehavioralFeature::addRaisedSignal"
  }

  /** disconnect a RaisedSignal.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 remove_head40432AE50263 "BehavioralFeature::removeRaisedSignal"
  public Signal removeRaisedSignal(Signal raisedSignal1)
  // -end- 33FFD98400B6 remove_head40432AE50263 "BehavioralFeature::removeRaisedSignal"
  {
    // -beg- preserve=no 33FFD98400B6 remove_body40432AE50263 "BehavioralFeature::removeRaisedSignal"
    Signal ret=null;
    if(raisedSignal1==null || !raisedSignal.contains(raisedSignal1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = raisedSignal1;
    raisedSignal.remove(raisedSignal1);
    raisedSignal1._unlinkContext(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeRaisedSignal"));
    return ret;
    // -end- 33FFD98400B6 remove_body40432AE50263 "BehavioralFeature::removeRaisedSignal"
  }

  /** tests if a given RaisedSignal is connected.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 test_head40432AE50263 "BehavioralFeature::containsRaisedSignal"
  public boolean containsRaisedSignal(Signal raisedSignal1)
  // -end- 33FFD98400B6 test_head40432AE50263 "BehavioralFeature::containsRaisedSignal"
  {
    // -beg- preserve=no 33FFD98400B6 test_body40432AE50263 "BehavioralFeature::containsRaisedSignal"
    return raisedSignal.contains(raisedSignal1);
    // -end- 33FFD98400B6 test_body40432AE50263 "BehavioralFeature::containsRaisedSignal"
  }

  /** used to enumerate all connected RaisedSignals.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 get_all_head40432AE50263 "BehavioralFeature::iteratorRaisedSignal"
  public java.util.Iterator iteratorRaisedSignal()
  // -end- 33FFD98400B6 get_all_head40432AE50263 "BehavioralFeature::iteratorRaisedSignal"
  {
    // -beg- preserve=no 33FFD98400B6 get_all_body40432AE50263 "BehavioralFeature::iteratorRaisedSignal"
    return raisedSignal.iterator();
    // -end- 33FFD98400B6 get_all_body40432AE50263 "BehavioralFeature::iteratorRaisedSignal"
  }

  /** disconnect all RaisedSignals.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 remove_all_head40432AE50263 "BehavioralFeature::clearRaisedSignal"
  public void clearRaisedSignal()
  // -end- 33FFD98400B6 remove_all_head40432AE50263 "BehavioralFeature::clearRaisedSignal"
  {
    // -beg- preserve=no 33FFD98400B6 remove_all_body40432AE50263 "BehavioralFeature::clearRaisedSignal"
    if(sizeRaisedSignal()>0){
      for(java.util.Iterator p = raisedSignal.iterator(); p.hasNext();){
        ((Signal)p.next())._unlinkContext(this);
      }
      raisedSignal.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearRaisedSignal"));
    }
    // -end- 33FFD98400B6 remove_all_body40432AE50263 "BehavioralFeature::clearRaisedSignal"
  }

  /** returns the number of RaisedSignals.
   *  @see #addRaisedSignal
   */
  // -beg- preserve=no 33FFD98400B6 size_head40432AE50263 "BehavioralFeature::sizeRaisedSignal"
  public int sizeRaisedSignal()
  // -end- 33FFD98400B6 size_head40432AE50263 "BehavioralFeature::sizeRaisedSignal"
  {
    // -beg- preserve=no 33FFD98400B6 size_body40432AE50263 "BehavioralFeature::sizeRaisedSignal"
    return raisedSignal.size();
    // -end- 33FFD98400B6 size_body40432AE50263 "BehavioralFeature::sizeRaisedSignal"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFD98400B6 _link_body40432AE50263 "BehavioralFeature::_linkRaisedSignal"
  public void _linkRaisedSignal(Signal raisedSignal1)
  {
    raisedSignal.add(raisedSignal1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkRaisedSignal"));
    return;
  }
  // -end- 33FFD98400B6 _link_body40432AE50263 "BehavioralFeature::_linkRaisedSignal"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFD98400B6 _unlink_body40432AE50263 "BehavioralFeature::_unlinkRaisedSignal"
  public void _unlinkRaisedSignal(Signal raisedSignal1)
  {
    raisedSignal.remove(raisedSignal1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkRaisedSignal"));
    return;
  }
  // -end- 33FFD98400B6 _unlink_body40432AE50263 "BehavioralFeature::_unlinkRaisedSignal"

  // -beg- preserve=no 33599464017C code40432AE50263 "parameter"
  private java.util.List parameter = new java.util.ArrayList();
  // -end- 33599464017C code40432AE50263 "parameter"

  /** add a Parameter.
   *  
   *  @see #removeParameter
   *  @see #containsParameter
   *  @see #iteratorParameter
   *  @see #clearParameter
   *  @see #sizeParameter
   */
  // -beg- preserve=no 33599464017C add_head40432AE50263 "BehavioralFeature::addParameter"
  public void addParameter(Parameter parameter1)
  // -end- 33599464017C add_head40432AE50263 "BehavioralFeature::addParameter"
  {
    // -beg- preserve=no 33599464017C add_body40432AE50263 "BehavioralFeature::addParameter"
    parameter.add(parameter1);
    parameter1._linkBehavioralFeature(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addParameter"));
    return;
    // -end- 33599464017C add_body40432AE50263 "BehavioralFeature::addParameter"
  }

  // -beg- preserve=no 33599464017C add2_head40432AE50263 "BehavioralFeature::add2Parameter"
  public void addParameter(int index,Parameter parameter1)
  // -end- 33599464017C add2_head40432AE50263 "BehavioralFeature::add2Parameter"
  {
    // -beg- preserve=no 33599464017C add2_body40432AE50263 "BehavioralFeature::add2Parameter"
    parameter.add(index,parameter1);
    parameter1._linkBehavioralFeature(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addParameter"));
    return;
    // -end- 33599464017C add2_body40432AE50263 "BehavioralFeature::add2Parameter"
  }

  /** disconnect a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C remove_head40432AE50263 "BehavioralFeature::removeParameter"
  public Parameter removeParameter(Parameter parameter1)
  // -end- 33599464017C remove_head40432AE50263 "BehavioralFeature::removeParameter"
  {
    // -beg- preserve=no 33599464017C remove_body40432AE50263 "BehavioralFeature::removeParameter"
    Parameter ret=null;
    if(parameter1==null || !parameter.contains(parameter1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = parameter1;
    parameter.remove(parameter1);
    parameter1._unlinkBehavioralFeature(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeParameter"));
    return ret;
    // -end- 33599464017C remove_body40432AE50263 "BehavioralFeature::removeParameter"
  }

  /** disconnect a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C remove2_head40432AE50263 "BehavioralFeature::remove2Parameter"
  public Parameter removeParameter(int index)
  // -end- 33599464017C remove2_head40432AE50263 "BehavioralFeature::remove2Parameter"
  {
    // -beg- preserve=no 33599464017C remove2_body40432AE50263 "BehavioralFeature::remove2Parameter"
    Parameter ret=null;
    ret = (Parameter)parameter.remove(index);
    ret._unlinkBehavioralFeature(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeParameter"));
    return ret;
    // -end- 33599464017C remove2_body40432AE50263 "BehavioralFeature::remove2Parameter"
  }

  /** change a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C set_head40432AE50263 "BehavioralFeature::setParameter"
  public Parameter setParameter(int index,Parameter parameter1)
  // -end- 33599464017C set_head40432AE50263 "BehavioralFeature::setParameter"
  {
    // -beg- preserve=no 33599464017C set_body40432AE50263 "BehavioralFeature::setParameter"
    Parameter ret=null;
    ret = (Parameter)parameter.set(index,parameter1);
    ret._unlinkBehavioralFeature(this);
    parameter1._linkBehavioralFeature(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setParameter"));
    return ret;
    // -end- 33599464017C set_body40432AE50263 "BehavioralFeature::setParameter"
  }

  /** tests if a given Parameter is connected.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C test_head40432AE50263 "BehavioralFeature::containsParameter"
  public boolean containsParameter(Parameter parameter1)
  // -end- 33599464017C test_head40432AE50263 "BehavioralFeature::containsParameter"
  {
    // -beg- preserve=no 33599464017C test_body40432AE50263 "BehavioralFeature::containsParameter"
    return parameter.contains(parameter1);
    // -end- 33599464017C test_body40432AE50263 "BehavioralFeature::containsParameter"
  }

  /** used to enumerate all connected Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C get_all_head40432AE50263 "BehavioralFeature::iteratorParameter"
  public java.util.Iterator iteratorParameter()
  // -end- 33599464017C get_all_head40432AE50263 "BehavioralFeature::iteratorParameter"
  {
    // -beg- preserve=no 33599464017C get_all_body40432AE50263 "BehavioralFeature::iteratorParameter"
    return parameter.iterator();
    // -end- 33599464017C get_all_body40432AE50263 "BehavioralFeature::iteratorParameter"
  }

  /** disconnect all Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C remove_all_head40432AE50263 "BehavioralFeature::clearParameter"
  public void clearParameter()
  // -end- 33599464017C remove_all_head40432AE50263 "BehavioralFeature::clearParameter"
  {
    // -beg- preserve=no 33599464017C remove_all_body40432AE50263 "BehavioralFeature::clearParameter"
    if(sizeParameter()>0){
      for(java.util.Iterator p = parameter.iterator(); p.hasNext();){
        ((Parameter)p.next())._unlinkBehavioralFeature(this);
      }
      parameter.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearParameter"));
    }
    // -end- 33599464017C remove_all_body40432AE50263 "BehavioralFeature::clearParameter"
  }

  /** returns the number of Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 33599464017C size_head40432AE50263 "BehavioralFeature::sizeParameter"
  public int sizeParameter()
  // -end- 33599464017C size_head40432AE50263 "BehavioralFeature::sizeParameter"
  {
    // -beg- preserve=no 33599464017C size_body40432AE50263 "BehavioralFeature::sizeParameter"
    return parameter.size();
    // -end- 33599464017C size_body40432AE50263 "BehavioralFeature::sizeParameter"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33599464017C _link_body40432AE50263 "BehavioralFeature::_linkParameter"
  public void _linkParameter(Parameter parameter1)
  {
    parameter.add(parameter1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkParameter"));
    return;
  }
  // -end- 33599464017C _link_body40432AE50263 "BehavioralFeature::_linkParameter"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33599464017C _unlink_body40432AE50263 "BehavioralFeature::_unlinkParameter"
  public void _unlinkParameter(Parameter parameter1)
  {
    parameter.remove(parameter1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkParameter"));
    return;
  }
  // -end- 33599464017C _unlink_body40432AE50263 "BehavioralFeature::_unlinkParameter"

  // -beg- preserve=no 335A34A3012C var40432AE50263 "isQuery"
  private boolean isQuery;
  // -end- 335A34A3012C var40432AE50263 "isQuery"

  /** get current value of isQuery
   *  @see #setQuery
   */
  // -beg- preserve=no 335A34A3012C get_head40432AE50263 "isQuery"
  public  boolean isQuery()
  // -end- 335A34A3012C get_head40432AE50263 "isQuery"
  {
    // -beg- preserve=no 335A34A3012C get_body40432AE50263 "isQuery"
    return isQuery;
    // -end- 335A34A3012C get_body40432AE50263 "isQuery"
  }

  /** set current value of isQuery
   *  @see #isQuery
   */
  // -beg- preserve=no 335A34A3012C set_head40432AE50263 "isQuery"
  public  void setQuery(boolean value1)
  // -end- 335A34A3012C set_head40432AE50263 "isQuery"
  {
    // -beg- preserve=no 335A34A3012C set_body40432AE50263 "isQuery"
    if(isQuery != value1){
      isQuery = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setQuery"));
    }
    // -end- 335A34A3012C set_body40432AE50263 "isQuery"
  }

  // -beg- preserve=no 36008FB700E7 code40432AE50263 "classifierRole"
  private java.util.Set classifierRole = new java.util.HashSet();
  // -end- 36008FB700E7 code40432AE50263 "classifierRole"

  /** add a ClassifierRole.
   *  
   *  @see #removeClassifierRole
   *  @see #containsClassifierRole
   *  @see #iteratorClassifierRole
   *  @see #clearClassifierRole
   *  @see #sizeClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 add_head40432AE50263 "ModelElement::addClassifierRole"
  public void addClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 add_head40432AE50263 "ModelElement::addClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 add_body40432AE50263 "ModelElement::addClassifierRole"
    classifierRole.add(classifierRole1);
    classifierRole1._linkAvailableContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClassifierRole"));
    return;
    // -end- 36008FB700E7 add_body40432AE50263 "ModelElement::addClassifierRole"
  }

  /** disconnect a ClassifierRole.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_head40432AE50263 "ModelElement::removeClassifierRole"
  public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 remove_head40432AE50263 "ModelElement::removeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_body40432AE50263 "ModelElement::removeClassifierRole"
    ClassifierRole ret=null;
    if(classifierRole1==null || !classifierRole.contains(classifierRole1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = classifierRole1;
    classifierRole.remove(classifierRole1);
    classifierRole1._unlinkAvailableContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClassifierRole"));
    return ret;
    // -end- 36008FB700E7 remove_body40432AE50263 "ModelElement::removeClassifierRole"
  }

  /** tests if a given ClassifierRole is connected.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 test_head40432AE50263 "ModelElement::containsClassifierRole"
  public boolean containsClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 test_head40432AE50263 "ModelElement::containsClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 test_body40432AE50263 "ModelElement::containsClassifierRole"
    return classifierRole.contains(classifierRole1);
    // -end- 36008FB700E7 test_body40432AE50263 "ModelElement::containsClassifierRole"
  }

  /** used to enumerate all connected ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 get_all_head40432AE50263 "ModelElement::iteratorClassifierRole"
  public java.util.Iterator iteratorClassifierRole()
  // -end- 36008FB700E7 get_all_head40432AE50263 "ModelElement::iteratorClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 get_all_body40432AE50263 "ModelElement::iteratorClassifierRole"
    return classifierRole.iterator();
    // -end- 36008FB700E7 get_all_body40432AE50263 "ModelElement::iteratorClassifierRole"
  }

  /** disconnect all ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_all_head40432AE50263 "ModelElement::clearClassifierRole"
  public void clearClassifierRole()
  // -end- 36008FB700E7 remove_all_head40432AE50263 "ModelElement::clearClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_all_body40432AE50263 "ModelElement::clearClassifierRole"
    if(sizeClassifierRole()>0){
      for(java.util.Iterator p = classifierRole.iterator(); p.hasNext();){
        ((ClassifierRole)p.next())._unlinkAvailableContents(this);
      }
      classifierRole.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClassifierRole"));
    }
    // -end- 36008FB700E7 remove_all_body40432AE50263 "ModelElement::clearClassifierRole"
  }

  /** returns the number of ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 size_head40432AE50263 "ModelElement::sizeClassifierRole"
  public int sizeClassifierRole()
  // -end- 36008FB700E7 size_head40432AE50263 "ModelElement::sizeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 size_body40432AE50263 "ModelElement::sizeClassifierRole"
    return classifierRole.size();
    // -end- 36008FB700E7 size_body40432AE50263 "ModelElement::sizeClassifierRole"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _link_body40432AE50263 "ModelElement::_linkClassifierRole"
  public void _linkClassifierRole(ClassifierRole classifierRole1)
  {
    classifierRole.add(classifierRole1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassifierRole"));
    return;
  }
  // -end- 36008FB700E7 _link_body40432AE50263 "ModelElement::_linkClassifierRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _unlink_body40432AE50263 "ModelElement::_unlinkClassifierRole"
  public void _unlinkClassifierRole(ClassifierRole classifierRole1)
  {
    classifierRole.remove(classifierRole1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassifierRole"));
    return;
  }
  // -end- 36008FB700E7 _unlink_body40432AE50263 "ModelElement::_unlinkClassifierRole"

  // -beg- preserve=no 32B5D7EF03DD code40432AE50263 "owner"
  private Classifier owner;
  // -end- 32B5D7EF03DD code40432AE50263 "owner"

  /** attaches a Owner.
   *  
   *  @see #detachOwner
   *  @see #getOwner
   *  @see #containsOwner
   */
  // -beg- preserve=no 32B5D7EF03DD attach_head40432AE50263 "Feature::attachOwner"
  public void attachOwner(Classifier owner1)
  // -end- 32B5D7EF03DD attach_head40432AE50263 "Feature::attachOwner"
  {
    // -beg- preserve=no 32B5D7EF03DD attach_body40432AE50263 "Feature::attachOwner"
    if(owner!=null) {throw new java.lang.IllegalStateException("already a owner attached");}
    if(owner1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as owner");}
    owner = owner1;
    owner1._linkFeature(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachOwner"));
    return;
    // -end- 32B5D7EF03DD attach_body40432AE50263 "Feature::attachOwner"
  }

  /** disconnect the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 32B5D7EF03DD detach_head40432AE50263 "Feature::detachOwner"
  public Classifier detachOwner()
  // -end- 32B5D7EF03DD detach_head40432AE50263 "Feature::detachOwner"
  {
    // -beg- preserve=no 32B5D7EF03DD detach_body40432AE50263 "Feature::detachOwner"
    Classifier ret = null;
    if(owner!=null){
      owner._unlinkFeature(this);
      ret = owner;
      owner = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachOwner"));
    return ret;
    // -end- 32B5D7EF03DD detach_body40432AE50263 "Feature::detachOwner"
  }

  /** get the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 32B5D7EF03DD get_head40432AE50263 "Feature::getOwner"
  public Classifier getOwner()
  // -end- 32B5D7EF03DD get_head40432AE50263 "Feature::getOwner"
  {
    // -beg- preserve=no 32B5D7EF03DD get_body40432AE50263 "Feature::getOwner"
    if(owner==null) {throw new java.lang.IllegalStateException("no owner attached");}
    return owner;
    // -end- 32B5D7EF03DD get_body40432AE50263 "Feature::getOwner"
  }

  /** tests if there is a Owner attached.
   *  @see #attachOwner
   */
  // -beg- preserve=no 32B5D7EF03DD test_head40432AE50263 "Feature::containsOwner"
  public boolean containsOwner()
  // -end- 32B5D7EF03DD test_head40432AE50263 "Feature::containsOwner"
  {
    // -beg- preserve=no 32B5D7EF03DD test_body40432AE50263 "Feature::containsOwner"
    return owner!=null;
    // -end- 32B5D7EF03DD test_body40432AE50263 "Feature::containsOwner"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03DD _link_body40432AE50263 "Feature::_linkOwner"
  public void _linkOwner(Classifier owner1)
  {
    owner = owner1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkOwner"));
    return;
  }
  // -end- 32B5D7EF03DD _link_body40432AE50263 "Feature::_linkOwner"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03DD _unlink_body40432AE50263 "Feature::_unlinkOwner"
  public void _unlinkOwner(Classifier owner1)
  {
    owner = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkOwner"));
    return;
  }
  // -end- 32B5D7EF03DD _unlink_body40432AE50263 "Feature::_unlinkOwner"

  // -beg- preserve=no 31653E23032A var40432AE50263 "ownerScope"
  private int ownerScope;
  // -end- 31653E23032A var40432AE50263 "ownerScope"

  /** get current value of ownerScope
   *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
   *  @see #setOwnerScope
   */
  // -beg- preserve=no 31653E23032A get_head40432AE50263 "ownerScope"
  public  int getOwnerScope()
  // -end- 31653E23032A get_head40432AE50263 "ownerScope"
  {
    // -beg- preserve=no 31653E23032A get_body40432AE50263 "ownerScope"
    return ownerScope;
    // -end- 31653E23032A get_body40432AE50263 "ownerScope"
  }

  /** set current value of ownerScope
   *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
   *  @see #getOwnerScope
   */
  // -beg- preserve=no 31653E23032A set_head40432AE50263 "ownerScope"
  public  void setOwnerScope(int value1)
  // -end- 31653E23032A set_head40432AE50263 "ownerScope"
  {
    // -beg- preserve=no 31653E23032A set_body40432AE50263 "ownerScope"
    if(ownerScope != value1){
      ownerScope = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setOwnerScope"));
    }
    // -end- 31653E23032A set_body40432AE50263 "ownerScope"
  }

  // -beg- preserve=no 33D1265902DA var40432AE50263 "visibility"
  private int visibility;
  // -end- 33D1265902DA var40432AE50263 "visibility"

  /** get current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #setVisibility
   */
  // -beg- preserve=no 33D1265902DA get_head40432AE50263 "visibility"
  public  int getVisibility()
  // -end- 33D1265902DA get_head40432AE50263 "visibility"
  {
    // -beg- preserve=no 33D1265902DA get_body40432AE50263 "visibility"
    return visibility;
    // -end- 33D1265902DA get_body40432AE50263 "visibility"
  }

  /** set current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #getVisibility
   */
  // -beg- preserve=no 33D1265902DA set_head40432AE50263 "visibility"
  public  void setVisibility(int value1)
  // -end- 33D1265902DA set_head40432AE50263 "visibility"
  {
    // -beg- preserve=no 33D1265902DA set_body40432AE50263 "visibility"
    if(visibility != value1){
      visibility = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setVisibility"));
    }
    // -end- 33D1265902DA set_body40432AE50263 "visibility"
  }

  // -beg- preserve=no 3CE2221702C6 head40432AE50263 "getDefLangName"
  public String getDefLangName()
  // -end- 3CE2221702C6 head40432AE50263 "getDefLangName"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE2221702C6 throws40432AE50263 "getDefLangName"

    // -end- 3CE2221702C6 throws40432AE50263 "getDefLangName"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3CE2221702C6 body40432AE50263 "getDefLangName"
    return null;
    // -end- 3CE2221702C6 body40432AE50263 "getDefLangName"
    }

  // -beg- preserve=no 3CE222250149 head40432AE50263 "setDefLangName"
  public void setDefLangName(String name)
  // -end- 3CE222250149 head40432AE50263 "setDefLangName"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE222250149 throws40432AE50263 "setDefLangName"

    // -end- 3CE222250149 throws40432AE50263 "setDefLangName"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3CE222250149 body40432AE50263 "setDefLangName"
    return;
    // -end- 3CE222250149 body40432AE50263 "setDefLangName"
    }

  // -beg- preserve=no 33CF8BD500F1 code40432AE50263 "behavior"
  private java.util.Set behavior = new java.util.HashSet();
  // -end- 33CF8BD500F1 code40432AE50263 "behavior"

  /** add a Behavior.
   *  
   *  @see #removeBehavior
   *  @see #containsBehavior
   *  @see #iteratorBehavior
   *  @see #clearBehavior
   *  @see #sizeBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 add_head40432AE50263 "ModelElement::addBehavior"
  public void addBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 add_head40432AE50263 "ModelElement::addBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 add_body40432AE50263 "ModelElement::addBehavior"
    behavior.add(behavior1);
    behavior1._linkContext(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addBehavior"));
    return;
    // -end- 33CF8BD500F1 add_body40432AE50263 "ModelElement::addBehavior"
  }

  /** disconnect a Behavior.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 remove_head40432AE50263 "ModelElement::removeBehavior"
  public StateMachine removeBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 remove_head40432AE50263 "ModelElement::removeBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 remove_body40432AE50263 "ModelElement::removeBehavior"
    StateMachine ret=null;
    if(behavior1==null || !behavior.contains(behavior1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = behavior1;
    behavior.remove(behavior1);
    behavior1._unlinkContext(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeBehavior"));
    return ret;
    // -end- 33CF8BD500F1 remove_body40432AE50263 "ModelElement::removeBehavior"
  }

  /** tests if a given Behavior is connected.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 test_head40432AE50263 "ModelElement::containsBehavior"
  public boolean containsBehavior(StateMachine behavior1)
  // -end- 33CF8BD500F1 test_head40432AE50263 "ModelElement::containsBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 test_body40432AE50263 "ModelElement::containsBehavior"
    return behavior.contains(behavior1);
    // -end- 33CF8BD500F1 test_body40432AE50263 "ModelElement::containsBehavior"
  }

  /** used to enumerate all connected Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 get_all_head40432AE50263 "ModelElement::iteratorBehavior"
  public java.util.Iterator iteratorBehavior()
  // -end- 33CF8BD500F1 get_all_head40432AE50263 "ModelElement::iteratorBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 get_all_body40432AE50263 "ModelElement::iteratorBehavior"
    return behavior.iterator();
    // -end- 33CF8BD500F1 get_all_body40432AE50263 "ModelElement::iteratorBehavior"
  }

  /** disconnect all Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 remove_all_head40432AE50263 "ModelElement::clearBehavior"
  public void clearBehavior()
  // -end- 33CF8BD500F1 remove_all_head40432AE50263 "ModelElement::clearBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 remove_all_body40432AE50263 "ModelElement::clearBehavior"
    if(sizeBehavior()>0){
      for(java.util.Iterator p = behavior.iterator(); p.hasNext();){
        ((StateMachine)p.next())._unlinkContext(this);
      }
      behavior.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearBehavior"));
    }
    // -end- 33CF8BD500F1 remove_all_body40432AE50263 "ModelElement::clearBehavior"
  }

  /** returns the number of Behaviors.
   *  @see #addBehavior
   */
  // -beg- preserve=no 33CF8BD500F1 size_head40432AE50263 "ModelElement::sizeBehavior"
  public int sizeBehavior()
  // -end- 33CF8BD500F1 size_head40432AE50263 "ModelElement::sizeBehavior"
  {
    // -beg- preserve=no 33CF8BD500F1 size_body40432AE50263 "ModelElement::sizeBehavior"
    return behavior.size();
    // -end- 33CF8BD500F1 size_body40432AE50263 "ModelElement::sizeBehavior"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF8BD500F1 _link_body40432AE50263 "ModelElement::_linkBehavior"
  public void _linkBehavior(StateMachine behavior1)
  {
    behavior.add(behavior1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkBehavior"));
    return;
  }
  // -end- 33CF8BD500F1 _link_body40432AE50263 "ModelElement::_linkBehavior"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF8BD500F1 _unlink_body40432AE50263 "ModelElement::_unlinkBehavior"
  public void _unlinkBehavior(StateMachine behavior1)
  {
    behavior.remove(behavior1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkBehavior"));
    return;
  }
  // -end- 33CF8BD500F1 _unlink_body40432AE50263 "ModelElement::_unlinkBehavior"

  // -beg- preserve=no 33CF9A030140 code40432AE50263 "partition"
  private java.util.Set partition = new java.util.HashSet();
  // -end- 33CF9A030140 code40432AE50263 "partition"

  /** add a Partition.
   *  
   *  @see #removePartition
   *  @see #containsPartition
   *  @see #iteratorPartition
   *  @see #clearPartition
   *  @see #sizePartition
   */
  // -beg- preserve=no 33CF9A030140 add_head40432AE50263 "ModelElement::addPartition"
  public void addPartition(Partition partition1)
  // -end- 33CF9A030140 add_head40432AE50263 "ModelElement::addPartition"
  {
    // -beg- preserve=no 33CF9A030140 add_body40432AE50263 "ModelElement::addPartition"
    partition.add(partition1);
    partition1._linkContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPartition"));
    return;
    // -end- 33CF9A030140 add_body40432AE50263 "ModelElement::addPartition"
  }

  /** disconnect a Partition.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 remove_head40432AE50263 "ModelElement::removePartition"
  public Partition removePartition(Partition partition1)
  // -end- 33CF9A030140 remove_head40432AE50263 "ModelElement::removePartition"
  {
    // -beg- preserve=no 33CF9A030140 remove_body40432AE50263 "ModelElement::removePartition"
    Partition ret=null;
    if(partition1==null || !partition.contains(partition1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = partition1;
    partition.remove(partition1);
    partition1._unlinkContents(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePartition"));
    return ret;
    // -end- 33CF9A030140 remove_body40432AE50263 "ModelElement::removePartition"
  }

  /** tests if a given Partition is connected.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 test_head40432AE50263 "ModelElement::containsPartition"
  public boolean containsPartition(Partition partition1)
  // -end- 33CF9A030140 test_head40432AE50263 "ModelElement::containsPartition"
  {
    // -beg- preserve=no 33CF9A030140 test_body40432AE50263 "ModelElement::containsPartition"
    return partition.contains(partition1);
    // -end- 33CF9A030140 test_body40432AE50263 "ModelElement::containsPartition"
  }

  /** used to enumerate all connected Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 get_all_head40432AE50263 "ModelElement::iteratorPartition"
  public java.util.Iterator iteratorPartition()
  // -end- 33CF9A030140 get_all_head40432AE50263 "ModelElement::iteratorPartition"
  {
    // -beg- preserve=no 33CF9A030140 get_all_body40432AE50263 "ModelElement::iteratorPartition"
    return partition.iterator();
    // -end- 33CF9A030140 get_all_body40432AE50263 "ModelElement::iteratorPartition"
  }

  /** disconnect all Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 remove_all_head40432AE50263 "ModelElement::clearPartition"
  public void clearPartition()
  // -end- 33CF9A030140 remove_all_head40432AE50263 "ModelElement::clearPartition"
  {
    // -beg- preserve=no 33CF9A030140 remove_all_body40432AE50263 "ModelElement::clearPartition"
    if(sizePartition()>0){
      for(java.util.Iterator p = partition.iterator(); p.hasNext();){
        ((Partition)p.next())._unlinkContents(this);
      }
      partition.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPartition"));
    }
    // -end- 33CF9A030140 remove_all_body40432AE50263 "ModelElement::clearPartition"
  }

  /** returns the number of Partitions.
   *  @see #addPartition
   */
  // -beg- preserve=no 33CF9A030140 size_head40432AE50263 "ModelElement::sizePartition"
  public int sizePartition()
  // -end- 33CF9A030140 size_head40432AE50263 "ModelElement::sizePartition"
  {
    // -beg- preserve=no 33CF9A030140 size_body40432AE50263 "ModelElement::sizePartition"
    return partition.size();
    // -end- 33CF9A030140 size_body40432AE50263 "ModelElement::sizePartition"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9A030140 _link_body40432AE50263 "ModelElement::_linkPartition"
  public void _linkPartition(Partition partition1)
  {
    partition.add(partition1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPartition"));
    return;
  }
  // -end- 33CF9A030140 _link_body40432AE50263 "ModelElement::_linkPartition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9A030140 _unlink_body40432AE50263 "ModelElement::_unlinkPartition"
  public void _unlinkPartition(Partition partition1)
  {
    partition.remove(partition1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPartition"));
    return;
  }
  // -end- 33CF9A030140 _unlink_body40432AE50263 "ModelElement::_unlinkPartition"

  // -beg- preserve=no 39E9065C0186 code40432AE50263 "collaborationInstanceSet"
  private java.util.Set collaborationInstanceSet = new java.util.HashSet();
  // -end- 39E9065C0186 code40432AE50263 "collaborationInstanceSet"

  /** add a CollaborationInstanceSet.
   *  
   *  @see #removeCollaborationInstanceSet
   *  @see #containsCollaborationInstanceSet
   *  @see #iteratorCollaborationInstanceSet
   *  @see #clearCollaborationInstanceSet
   *  @see #sizeCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 add_head40432AE50263 "ModelElement::addCollaborationInstanceSet"
  public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 add_head40432AE50263 "ModelElement::addCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 add_body40432AE50263 "ModelElement::addCollaborationInstanceSet"
    collaborationInstanceSet.add(collaborationInstanceSet1);
    collaborationInstanceSet1._linkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCollaborationInstanceSet"));
    return;
    // -end- 39E9065C0186 add_body40432AE50263 "ModelElement::addCollaborationInstanceSet"
  }

  /** disconnect a CollaborationInstanceSet.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_head40432AE50263 "ModelElement::removeCollaborationInstanceSet"
  public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 remove_head40432AE50263 "ModelElement::removeCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 remove_body40432AE50263 "ModelElement::removeCollaborationInstanceSet"
    CollaborationInstanceSet ret=null;
    if(collaborationInstanceSet1==null || !collaborationInstanceSet.contains(collaborationInstanceSet1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = collaborationInstanceSet1;
    collaborationInstanceSet.remove(collaborationInstanceSet1);
    collaborationInstanceSet1._unlinkConstrainingElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCollaborationInstanceSet"));
    return ret;
    // -end- 39E9065C0186 remove_body40432AE50263 "ModelElement::removeCollaborationInstanceSet"
  }

  /** tests if a given CollaborationInstanceSet is connected.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 test_head40432AE50263 "ModelElement::containsCollaborationInstanceSet"
  public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  // -end- 39E9065C0186 test_head40432AE50263 "ModelElement::containsCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 test_body40432AE50263 "ModelElement::containsCollaborationInstanceSet"
    return collaborationInstanceSet.contains(collaborationInstanceSet1);
    // -end- 39E9065C0186 test_body40432AE50263 "ModelElement::containsCollaborationInstanceSet"
  }

  /** used to enumerate all connected CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 get_all_head40432AE50263 "ModelElement::iteratorCollaborationInstanceSet"
  public java.util.Iterator iteratorCollaborationInstanceSet()
  // -end- 39E9065C0186 get_all_head40432AE50263 "ModelElement::iteratorCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 get_all_body40432AE50263 "ModelElement::iteratorCollaborationInstanceSet"
    return collaborationInstanceSet.iterator();
    // -end- 39E9065C0186 get_all_body40432AE50263 "ModelElement::iteratorCollaborationInstanceSet"
  }

  /** disconnect all CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 remove_all_head40432AE50263 "ModelElement::clearCollaborationInstanceSet"
  public void clearCollaborationInstanceSet()
  // -end- 39E9065C0186 remove_all_head40432AE50263 "ModelElement::clearCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 remove_all_body40432AE50263 "ModelElement::clearCollaborationInstanceSet"
    if(sizeCollaborationInstanceSet()>0){
      for(java.util.Iterator p = collaborationInstanceSet.iterator(); p.hasNext();){
        ((CollaborationInstanceSet)p.next())._unlinkConstrainingElement(this);
      }
      collaborationInstanceSet.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCollaborationInstanceSet"));
    }
    // -end- 39E9065C0186 remove_all_body40432AE50263 "ModelElement::clearCollaborationInstanceSet"
  }

  /** returns the number of CollaborationInstanceSets.
   *  @see #addCollaborationInstanceSet
   */
  // -beg- preserve=no 39E9065C0186 size_head40432AE50263 "ModelElement::sizeCollaborationInstanceSet"
  public int sizeCollaborationInstanceSet()
  // -end- 39E9065C0186 size_head40432AE50263 "ModelElement::sizeCollaborationInstanceSet"
  {
    // -beg- preserve=no 39E9065C0186 size_body40432AE50263 "ModelElement::sizeCollaborationInstanceSet"
    return collaborationInstanceSet.size();
    // -end- 39E9065C0186 size_body40432AE50263 "ModelElement::sizeCollaborationInstanceSet"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _link_body40432AE50263 "ModelElement::_linkCollaborationInstanceSet"
  public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  {
    collaborationInstanceSet.add(collaborationInstanceSet1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCollaborationInstanceSet"));
    return;
  }
  // -end- 39E9065C0186 _link_body40432AE50263 "ModelElement::_linkCollaborationInstanceSet"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E9065C0186 _unlink_body40432AE50263 "ModelElement::_unlinkCollaborationInstanceSet"
  public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
  {
    collaborationInstanceSet.remove(collaborationInstanceSet1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCollaborationInstanceSet"));
    return;
  }
  // -end- 39E9065C0186 _unlink_body40432AE50263 "ModelElement::_unlinkCollaborationInstanceSet"

  // -beg- preserve=no 33598CAA030E code40432AE50263 "namespace"
  private ElementOwnership namespace;
  // -end- 33598CAA030E code40432AE50263 "namespace"

  /** attaches a Namespace.
   *  Designates the Namespace that contains the ModelElement.
   *  @see #detachNamespace
   *  @see #getNamespace
   *  @see #containsNamespace
   *  @see #getNamespaceLink
   *  @see #createNamespaceLink
   */
  // -beg- preserve=no 33598CAA030E attach_head40432AE50263 "ModelElement::attachNamespace"
  public void attachNamespace(Namespace namespace1)
  // -end- 33598CAA030E attach_head40432AE50263 "ModelElement::attachNamespace"
  {
    // -beg- preserve=no 33598CAA030E attach_body40432AE50263 "ModelElement::attachNamespace"
    if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
    if(namespace1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as namespace");}
    namespace = createNamespaceLink();
    namespace.setNamespace(namespace1);
    namespace.setOwnedElement(this);
    namespace1._linkOwnedElement(namespace);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespace"));
    return;
    // -end- 33598CAA030E attach_body40432AE50263 "ModelElement::attachNamespace"
  }

  /** attaches a link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E attachlink_head40432AE50263 "ModelElement::attachNamespaceLink"
  public void attachNamespaceLink(ElementOwnership namespace1)
  // -end- 33598CAA030E attachlink_head40432AE50263 "ModelElement::attachNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E attachlink_body40432AE50263 "ModelElement::attachNamespaceLink"
    if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
    namespace = namespace1;
    namespace.setOwnedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespaceLink"));
    return;
    // -end- 33598CAA030E attachlink_body40432AE50263 "ModelElement::attachNamespaceLink"
  }

  /** disconnect the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E detach_head40432AE50263 "ModelElement::detachNamespace"
  public Namespace detachNamespace()
  // -end- 33598CAA030E detach_head40432AE50263 "ModelElement::detachNamespace"
  {
    // -beg- preserve=no 33598CAA030E detach_body40432AE50263 "ModelElement::detachNamespace"
    Namespace ret = null;
    if(namespace!=null){
      ret = namespace.getNamespace();
      ret._unlinkOwnedElement(namespace);
      namespace = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachNamespace"));
    return ret;
    // -end- 33598CAA030E detach_body40432AE50263 "ModelElement::detachNamespace"
  }

  /** get the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E get_head40432AE50263 "ModelElement::getNamespace"
  public Namespace getNamespace()
  // -end- 33598CAA030E get_head40432AE50263 "ModelElement::getNamespace"
  {
    // -beg- preserve=no 33598CAA030E get_body40432AE50263 "ModelElement::getNamespace"
    if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
    return namespace.getNamespace();
    // -end- 33598CAA030E get_body40432AE50263 "ModelElement::getNamespace"
  }

  /** get the link class of currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E getlink_head40432AE50263 "ModelElement::getNamespaceLink"
  public ElementOwnership getNamespaceLink()
  // -end- 33598CAA030E getlink_head40432AE50263 "ModelElement::getNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E getlink_body40432AE50263 "ModelElement::getNamespaceLink"
    if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
    return namespace;
    // -end- 33598CAA030E getlink_body40432AE50263 "ModelElement::getNamespaceLink"
  }

  /** create a link class for a new link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E createlink_head40432AE50263 "ModelElement::createNamespaceLink"
  public ElementOwnership createNamespaceLink()
  // -end- 33598CAA030E createlink_head40432AE50263 "ModelElement::createNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E createlink_body40432AE50263 "ModelElement::createNamespaceLink"
    return new ElementOwnership();
    // -end- 33598CAA030E createlink_body40432AE50263 "ModelElement::createNamespaceLink"
  }

  /** tests if there is a Namespace attached.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E test_head40432AE50263 "ModelElement::containsNamespace"
  public boolean containsNamespace()
  // -end- 33598CAA030E test_head40432AE50263 "ModelElement::containsNamespace"
  {
    // -beg- preserve=no 33598CAA030E test_body40432AE50263 "ModelElement::containsNamespace"
    return namespace!=null;
    // -end- 33598CAA030E test_body40432AE50263 "ModelElement::containsNamespace"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _link_body40432AE50263 "ModelElement::_linkNamespace"
  public void _linkNamespace(ElementOwnership namespace1)
  {
    namespace = namespace1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkNamespace"));
    return;
  }
  // -end- 33598CAA030E _link_body40432AE50263 "ModelElement::_linkNamespace"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _unlink_body40432AE50263 "ModelElement::_unlinkNamespace"
  public void _unlinkNamespace(ElementOwnership namespace1)
  {
    namespace = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkNamespace"));
    return;
  }
  // -end- 33598CAA030E _unlink_body40432AE50263 "ModelElement::_unlinkNamespace"

  // -beg- preserve=no 33FFE57B0395 code40432AE50263 "clientDependency"
  private java.util.Set clientDependency = new java.util.HashSet();
  // -end- 33FFE57B0395 code40432AE50263 "clientDependency"

  /** add a ClientDependency.
   *  
   *  @see #removeClientDependency
   *  @see #containsClientDependency
   *  @see #iteratorClientDependency
   *  @see #clearClientDependency
   *  @see #sizeClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 add_head40432AE50263 "ModelElement::addClientDependency"
  public void addClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 add_head40432AE50263 "ModelElement::addClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 add_body40432AE50263 "ModelElement::addClientDependency"
    clientDependency.add(clientDependency1);
    clientDependency1._linkClient(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClientDependency"));
    return;
    // -end- 33FFE57B0395 add_body40432AE50263 "ModelElement::addClientDependency"
  }

  /** disconnect a ClientDependency.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 remove_head40432AE50263 "ModelElement::removeClientDependency"
  public Dependency removeClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 remove_head40432AE50263 "ModelElement::removeClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 remove_body40432AE50263 "ModelElement::removeClientDependency"
    Dependency ret=null;
    if(clientDependency1==null || !clientDependency.contains(clientDependency1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = clientDependency1;
    clientDependency.remove(clientDependency1);
    clientDependency1._unlinkClient(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClientDependency"));
    return ret;
    // -end- 33FFE57B0395 remove_body40432AE50263 "ModelElement::removeClientDependency"
  }

  /** tests if a given ClientDependency is connected.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 test_head40432AE50263 "ModelElement::containsClientDependency"
  public boolean containsClientDependency(Dependency clientDependency1)
  // -end- 33FFE57B0395 test_head40432AE50263 "ModelElement::containsClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 test_body40432AE50263 "ModelElement::containsClientDependency"
    return clientDependency.contains(clientDependency1);
    // -end- 33FFE57B0395 test_body40432AE50263 "ModelElement::containsClientDependency"
  }

  /** used to enumerate all connected ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 get_all_head40432AE50263 "ModelElement::iteratorClientDependency"
  public java.util.Iterator iteratorClientDependency()
  // -end- 33FFE57B0395 get_all_head40432AE50263 "ModelElement::iteratorClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 get_all_body40432AE50263 "ModelElement::iteratorClientDependency"
    return clientDependency.iterator();
    // -end- 33FFE57B0395 get_all_body40432AE50263 "ModelElement::iteratorClientDependency"
  }

  /** disconnect all ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 remove_all_head40432AE50263 "ModelElement::clearClientDependency"
  public void clearClientDependency()
  // -end- 33FFE57B0395 remove_all_head40432AE50263 "ModelElement::clearClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 remove_all_body40432AE50263 "ModelElement::clearClientDependency"
    if(sizeClientDependency()>0){
      for(java.util.Iterator p = clientDependency.iterator(); p.hasNext();){
        ((Dependency)p.next())._unlinkClient(this);
      }
      clientDependency.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClientDependency"));
    }
    // -end- 33FFE57B0395 remove_all_body40432AE50263 "ModelElement::clearClientDependency"
  }

  /** returns the number of ClientDependencys.
   *  @see #addClientDependency
   */
  // -beg- preserve=no 33FFE57B0395 size_head40432AE50263 "ModelElement::sizeClientDependency"
  public int sizeClientDependency()
  // -end- 33FFE57B0395 size_head40432AE50263 "ModelElement::sizeClientDependency"
  {
    // -beg- preserve=no 33FFE57B0395 size_body40432AE50263 "ModelElement::sizeClientDependency"
    return clientDependency.size();
    // -end- 33FFE57B0395 size_body40432AE50263 "ModelElement::sizeClientDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFE57B0395 _link_body40432AE50263 "ModelElement::_linkClientDependency"
  public void _linkClientDependency(Dependency clientDependency1)
  {
    clientDependency.add(clientDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClientDependency"));
    return;
  }
  // -end- 33FFE57B0395 _link_body40432AE50263 "ModelElement::_linkClientDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FFE57B0395 _unlink_body40432AE50263 "ModelElement::_unlinkClientDependency"
  public void _unlinkClientDependency(Dependency clientDependency1)
  {
    clientDependency.remove(clientDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClientDependency"));
    return;
  }
  // -end- 33FFE57B0395 _unlink_body40432AE50263 "ModelElement::_unlinkClientDependency"

  // -beg- preserve=no 33E901E003D4 code40432AE50263 "taggedValue"
  private java.util.Set taggedValue = new java.util.HashSet();
  // -end- 33E901E003D4 code40432AE50263 "taggedValue"

  /** add a TaggedValue.
   *  
   *  @see #removeTaggedValue
   *  @see #containsTaggedValue
   *  @see #iteratorTaggedValue
   *  @see #clearTaggedValue
   *  @see #sizeTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 add_head40432AE50263 "ModelElement::addTaggedValue"
  public void addTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 add_head40432AE50263 "ModelElement::addTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 add_body40432AE50263 "ModelElement::addTaggedValue"
    taggedValue.add(taggedValue1);
    taggedValue1._linkModelElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTaggedValue"));
    return;
    // -end- 33E901E003D4 add_body40432AE50263 "ModelElement::addTaggedValue"
  }

  /** disconnect a TaggedValue.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 remove_head40432AE50263 "ModelElement::removeTaggedValue"
  public TaggedValue removeTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 remove_head40432AE50263 "ModelElement::removeTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 remove_body40432AE50263 "ModelElement::removeTaggedValue"
    TaggedValue ret=null;
    if(taggedValue1==null || !taggedValue.contains(taggedValue1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = taggedValue1;
    taggedValue.remove(taggedValue1);
    taggedValue1._unlinkModelElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTaggedValue"));
    return ret;
    // -end- 33E901E003D4 remove_body40432AE50263 "ModelElement::removeTaggedValue"
  }

  /** tests if a given TaggedValue is connected.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 test_head40432AE50263 "ModelElement::containsTaggedValue"
  public boolean containsTaggedValue(TaggedValue taggedValue1)
  // -end- 33E901E003D4 test_head40432AE50263 "ModelElement::containsTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 test_body40432AE50263 "ModelElement::containsTaggedValue"
    return taggedValue.contains(taggedValue1);
    // -end- 33E901E003D4 test_body40432AE50263 "ModelElement::containsTaggedValue"
  }

  /** used to enumerate all connected TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 get_all_head40432AE50263 "ModelElement::iteratorTaggedValue"
  public java.util.Iterator iteratorTaggedValue()
  // -end- 33E901E003D4 get_all_head40432AE50263 "ModelElement::iteratorTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 get_all_body40432AE50263 "ModelElement::iteratorTaggedValue"
    return taggedValue.iterator();
    // -end- 33E901E003D4 get_all_body40432AE50263 "ModelElement::iteratorTaggedValue"
  }

  /** disconnect all TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 remove_all_head40432AE50263 "ModelElement::clearTaggedValue"
  public void clearTaggedValue()
  // -end- 33E901E003D4 remove_all_head40432AE50263 "ModelElement::clearTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 remove_all_body40432AE50263 "ModelElement::clearTaggedValue"
    if(sizeTaggedValue()>0){
      for(java.util.Iterator p = taggedValue.iterator(); p.hasNext();){
        ((TaggedValue)p.next())._unlinkModelElement(this);
      }
      taggedValue.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTaggedValue"));
    }
    // -end- 33E901E003D4 remove_all_body40432AE50263 "ModelElement::clearTaggedValue"
  }

  /** returns the number of TaggedValues.
   *  @see #addTaggedValue
   */
  // -beg- preserve=no 33E901E003D4 size_head40432AE50263 "ModelElement::sizeTaggedValue"
  public int sizeTaggedValue()
  // -end- 33E901E003D4 size_head40432AE50263 "ModelElement::sizeTaggedValue"
  {
    // -beg- preserve=no 33E901E003D4 size_body40432AE50263 "ModelElement::sizeTaggedValue"
    return taggedValue.size();
    // -end- 33E901E003D4 size_body40432AE50263 "ModelElement::sizeTaggedValue"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E901E003D4 _link_body40432AE50263 "ModelElement::_linkTaggedValue"
  public void _linkTaggedValue(TaggedValue taggedValue1)
  {
    taggedValue.add(taggedValue1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTaggedValue"));
    return;
  }
  // -end- 33E901E003D4 _link_body40432AE50263 "ModelElement::_linkTaggedValue"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E901E003D4 _unlink_body40432AE50263 "ModelElement::_unlinkTaggedValue"
  public void _unlinkTaggedValue(TaggedValue taggedValue1)
  {
    taggedValue.remove(taggedValue1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTaggedValue"));
    return;
  }
  // -end- 33E901E003D4 _unlink_body40432AE50263 "ModelElement::_unlinkTaggedValue"

  // -beg- preserve=no 33EA67BB010E code40432AE50263 "constraint"
  private java.util.Set constraint = new java.util.HashSet();
  // -end- 33EA67BB010E code40432AE50263 "constraint"

  /** add a Constraint.
   *  
   *  @see #removeConstraint
   *  @see #containsConstraint
   *  @see #iteratorConstraint
   *  @see #clearConstraint
   *  @see #sizeConstraint
   */
  // -beg- preserve=no 33EA67BB010E add_head40432AE50263 "ModelElement::addConstraint"
  public void addConstraint(Constraint constraint1)
  // -end- 33EA67BB010E add_head40432AE50263 "ModelElement::addConstraint"
  {
    // -beg- preserve=no 33EA67BB010E add_body40432AE50263 "ModelElement::addConstraint"
    constraint.add(constraint1);
    constraint1._linkConstrainedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addConstraint"));
    return;
    // -end- 33EA67BB010E add_body40432AE50263 "ModelElement::addConstraint"
  }

  /** disconnect a Constraint.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E remove_head40432AE50263 "ModelElement::removeConstraint"
  public Constraint removeConstraint(Constraint constraint1)
  // -end- 33EA67BB010E remove_head40432AE50263 "ModelElement::removeConstraint"
  {
    // -beg- preserve=no 33EA67BB010E remove_body40432AE50263 "ModelElement::removeConstraint"
    Constraint ret=null;
    if(constraint1==null || !constraint.contains(constraint1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = constraint1;
    constraint.remove(constraint1);
    constraint1._unlinkConstrainedElement(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeConstraint"));
    return ret;
    // -end- 33EA67BB010E remove_body40432AE50263 "ModelElement::removeConstraint"
  }

  /** tests if a given Constraint is connected.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E test_head40432AE50263 "ModelElement::containsConstraint"
  public boolean containsConstraint(Constraint constraint1)
  // -end- 33EA67BB010E test_head40432AE50263 "ModelElement::containsConstraint"
  {
    // -beg- preserve=no 33EA67BB010E test_body40432AE50263 "ModelElement::containsConstraint"
    return constraint.contains(constraint1);
    // -end- 33EA67BB010E test_body40432AE50263 "ModelElement::containsConstraint"
  }

  /** used to enumerate all connected Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E get_all_head40432AE50263 "ModelElement::iteratorConstraint"
  public java.util.Iterator iteratorConstraint()
  // -end- 33EA67BB010E get_all_head40432AE50263 "ModelElement::iteratorConstraint"
  {
    // -beg- preserve=no 33EA67BB010E get_all_body40432AE50263 "ModelElement::iteratorConstraint"
    return constraint.iterator();
    // -end- 33EA67BB010E get_all_body40432AE50263 "ModelElement::iteratorConstraint"
  }

  /** disconnect all Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E remove_all_head40432AE50263 "ModelElement::clearConstraint"
  public void clearConstraint()
  // -end- 33EA67BB010E remove_all_head40432AE50263 "ModelElement::clearConstraint"
  {
    // -beg- preserve=no 33EA67BB010E remove_all_body40432AE50263 "ModelElement::clearConstraint"
    if(sizeConstraint()>0){
      for(java.util.Iterator p = constraint.iterator(); p.hasNext();){
        ((Constraint)p.next())._unlinkConstrainedElement(this);
      }
      constraint.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearConstraint"));
    }
    // -end- 33EA67BB010E remove_all_body40432AE50263 "ModelElement::clearConstraint"
  }

  /** returns the number of Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E size_head40432AE50263 "ModelElement::sizeConstraint"
  public int sizeConstraint()
  // -end- 33EA67BB010E size_head40432AE50263 "ModelElement::sizeConstraint"
  {
    // -beg- preserve=no 33EA67BB010E size_body40432AE50263 "ModelElement::sizeConstraint"
    return constraint.size();
    // -end- 33EA67BB010E size_body40432AE50263 "ModelElement::sizeConstraint"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EA67BB010E _link_body40432AE50263 "ModelElement::_linkConstraint"
  public void _linkConstraint(Constraint constraint1)
  {
    constraint.add(constraint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkConstraint"));
    return;
  }
  // -end- 33EA67BB010E _link_body40432AE50263 "ModelElement::_linkConstraint"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EA67BB010E _unlink_body40432AE50263 "ModelElement::_unlinkConstraint"
  public void _unlinkConstraint(Constraint constraint1)
  {
    constraint.remove(constraint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkConstraint"));
    return;
  }
  // -end- 33EA67BB010E _unlink_body40432AE50263 "ModelElement::_unlinkConstraint"

  // -beg- preserve=no 335C0D7A02A8 code40432AE50263 "supplierDependency"
  private java.util.Set supplierDependency = new java.util.HashSet();
  // -end- 335C0D7A02A8 code40432AE50263 "supplierDependency"

  /** add a SupplierDependency.
   *  
   *  @see #removeSupplierDependency
   *  @see #containsSupplierDependency
   *  @see #iteratorSupplierDependency
   *  @see #clearSupplierDependency
   *  @see #sizeSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 add_head40432AE50263 "ModelElement::addSupplierDependency"
  public void addSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 add_head40432AE50263 "ModelElement::addSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 add_body40432AE50263 "ModelElement::addSupplierDependency"
    supplierDependency.add(supplierDependency1);
    supplierDependency1._linkSupplier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSupplierDependency"));
    return;
    // -end- 335C0D7A02A8 add_body40432AE50263 "ModelElement::addSupplierDependency"
  }

  /** disconnect a SupplierDependency.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_head40432AE50263 "ModelElement::removeSupplierDependency"
  public Dependency removeSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 remove_head40432AE50263 "ModelElement::removeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_body40432AE50263 "ModelElement::removeSupplierDependency"
    Dependency ret=null;
    if(supplierDependency1==null || !supplierDependency.contains(supplierDependency1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = supplierDependency1;
    supplierDependency.remove(supplierDependency1);
    supplierDependency1._unlinkSupplier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSupplierDependency"));
    return ret;
    // -end- 335C0D7A02A8 remove_body40432AE50263 "ModelElement::removeSupplierDependency"
  }

  /** tests if a given SupplierDependency is connected.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 test_head40432AE50263 "ModelElement::containsSupplierDependency"
  public boolean containsSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 test_head40432AE50263 "ModelElement::containsSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 test_body40432AE50263 "ModelElement::containsSupplierDependency"
    return supplierDependency.contains(supplierDependency1);
    // -end- 335C0D7A02A8 test_body40432AE50263 "ModelElement::containsSupplierDependency"
  }

  /** used to enumerate all connected SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 get_all_head40432AE50263 "ModelElement::iteratorSupplierDependency"
  public java.util.Iterator iteratorSupplierDependency()
  // -end- 335C0D7A02A8 get_all_head40432AE50263 "ModelElement::iteratorSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 get_all_body40432AE50263 "ModelElement::iteratorSupplierDependency"
    return supplierDependency.iterator();
    // -end- 335C0D7A02A8 get_all_body40432AE50263 "ModelElement::iteratorSupplierDependency"
  }

  /** disconnect all SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_all_head40432AE50263 "ModelElement::clearSupplierDependency"
  public void clearSupplierDependency()
  // -end- 335C0D7A02A8 remove_all_head40432AE50263 "ModelElement::clearSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_all_body40432AE50263 "ModelElement::clearSupplierDependency"
    if(sizeSupplierDependency()>0){
      for(java.util.Iterator p = supplierDependency.iterator(); p.hasNext();){
        ((Dependency)p.next())._unlinkSupplier(this);
      }
      supplierDependency.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSupplierDependency"));
    }
    // -end- 335C0D7A02A8 remove_all_body40432AE50263 "ModelElement::clearSupplierDependency"
  }

  /** returns the number of SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 size_head40432AE50263 "ModelElement::sizeSupplierDependency"
  public int sizeSupplierDependency()
  // -end- 335C0D7A02A8 size_head40432AE50263 "ModelElement::sizeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 size_body40432AE50263 "ModelElement::sizeSupplierDependency"
    return supplierDependency.size();
    // -end- 335C0D7A02A8 size_body40432AE50263 "ModelElement::sizeSupplierDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _link_body40432AE50263 "ModelElement::_linkSupplierDependency"
  public void _linkSupplierDependency(Dependency supplierDependency1)
  {
    supplierDependency.add(supplierDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSupplierDependency"));
    return;
  }
  // -end- 335C0D7A02A8 _link_body40432AE50263 "ModelElement::_linkSupplierDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _unlink_body40432AE50263 "ModelElement::_unlinkSupplierDependency"
  public void _unlinkSupplierDependency(Dependency supplierDependency1)
  {
    supplierDependency.remove(supplierDependency1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSupplierDependency"));
    return;
  }
  // -end- 335C0D7A02A8 _unlink_body40432AE50263 "ModelElement::_unlinkSupplierDependency"

  // -beg- preserve=no 362409A9000A code40432AE50263 "presentation"
  private java.util.Set presentation = new java.util.HashSet();
  // -end- 362409A9000A code40432AE50263 "presentation"

  /** add a Presentation.
   *  
   *  @see #removePresentation
   *  @see #containsPresentation
   *  @see #iteratorPresentation
   *  @see #clearPresentation
   *  @see #sizePresentation
   */
  // -beg- preserve=no 362409A9000A add_head40432AE50263 "ModelElement::addPresentation"
  public void addPresentation(PresentationElement presentation1)
  // -end- 362409A9000A add_head40432AE50263 "ModelElement::addPresentation"
  {
    // -beg- preserve=no 362409A9000A add_body40432AE50263 "ModelElement::addPresentation"
    presentation.add(presentation1);
    presentation1._linkSubject(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPresentation"));
    return;
    // -end- 362409A9000A add_body40432AE50263 "ModelElement::addPresentation"
  }

  /** disconnect a Presentation.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_head40432AE50263 "ModelElement::removePresentation"
  public PresentationElement removePresentation(PresentationElement presentation1)
  // -end- 362409A9000A remove_head40432AE50263 "ModelElement::removePresentation"
  {
    // -beg- preserve=no 362409A9000A remove_body40432AE50263 "ModelElement::removePresentation"
    PresentationElement ret=null;
    if(presentation1==null || !presentation.contains(presentation1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = presentation1;
    presentation.remove(presentation1);
    presentation1._unlinkSubject(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePresentation"));
    return ret;
    // -end- 362409A9000A remove_body40432AE50263 "ModelElement::removePresentation"
  }

  /** tests if a given Presentation is connected.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A test_head40432AE50263 "ModelElement::containsPresentation"
  public boolean containsPresentation(PresentationElement presentation1)
  // -end- 362409A9000A test_head40432AE50263 "ModelElement::containsPresentation"
  {
    // -beg- preserve=no 362409A9000A test_body40432AE50263 "ModelElement::containsPresentation"
    return presentation.contains(presentation1);
    // -end- 362409A9000A test_body40432AE50263 "ModelElement::containsPresentation"
  }

  /** used to enumerate all connected Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A get_all_head40432AE50263 "ModelElement::iteratorPresentation"
  public java.util.Iterator iteratorPresentation()
  // -end- 362409A9000A get_all_head40432AE50263 "ModelElement::iteratorPresentation"
  {
    // -beg- preserve=no 362409A9000A get_all_body40432AE50263 "ModelElement::iteratorPresentation"
    return presentation.iterator();
    // -end- 362409A9000A get_all_body40432AE50263 "ModelElement::iteratorPresentation"
  }

  /** disconnect all Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_all_head40432AE50263 "ModelElement::clearPresentation"
  public void clearPresentation()
  // -end- 362409A9000A remove_all_head40432AE50263 "ModelElement::clearPresentation"
  {
    // -beg- preserve=no 362409A9000A remove_all_body40432AE50263 "ModelElement::clearPresentation"
    if(sizePresentation()>0){
      for(java.util.Iterator p = presentation.iterator(); p.hasNext();){
        ((PresentationElement)p.next())._unlinkSubject(this);
      }
      presentation.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPresentation"));
    }
    // -end- 362409A9000A remove_all_body40432AE50263 "ModelElement::clearPresentation"
  }

  /** returns the number of Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A size_head40432AE50263 "ModelElement::sizePresentation"
  public int sizePresentation()
  // -end- 362409A9000A size_head40432AE50263 "ModelElement::sizePresentation"
  {
    // -beg- preserve=no 362409A9000A size_body40432AE50263 "ModelElement::sizePresentation"
    return presentation.size();
    // -end- 362409A9000A size_body40432AE50263 "ModelElement::sizePresentation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _link_body40432AE50263 "ModelElement::_linkPresentation"
  public void _linkPresentation(PresentationElement presentation1)
  {
    presentation.add(presentation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPresentation"));
    return;
  }
  // -end- 362409A9000A _link_body40432AE50263 "ModelElement::_linkPresentation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _unlink_body40432AE50263 "ModelElement::_unlinkPresentation"
  public void _unlinkPresentation(PresentationElement presentation1)
  {
    presentation.remove(presentation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPresentation"));
    return;
  }
  // -end- 362409A9000A _unlink_body40432AE50263 "ModelElement::_unlinkPresentation"

  // -beg- preserve=no 36240CA4024E code40432AE50263 "container"
  private java.util.Set container = new java.util.HashSet();
  // -end- 36240CA4024E code40432AE50263 "container"

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
  // -beg- preserve=no 36240CA4024E add_head40432AE50263 "ModelElement::addContainer"
  public void addContainer(Component container1)
  // -end- 36240CA4024E add_head40432AE50263 "ModelElement::addContainer"
  {
    // -beg- preserve=no 36240CA4024E add_body40432AE50263 "ModelElement::addContainer"
    ElementResidence linkobj=createContainerLink();
    linkobj.setContainer(container1);
    linkobj.setResident(this);
    container.add(linkobj);
    container1._linkResident(linkobj);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContainer"));
    return;
    // -end- 36240CA4024E add_body40432AE50263 "ModelElement::addContainer"
  }

  /** add a link to a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E addlink_head40432AE50263 "ModelElement::addContainerLink"
  public void addContainerLink(ElementResidence container1)
  // -end- 36240CA4024E addlink_head40432AE50263 "ModelElement::addContainerLink"
  {
    // -beg- preserve=no 36240CA4024E addlink_body40432AE50263 "ModelElement::addContainerLink"
    container1.setResident(this);
    container.add(container1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContainerLink"));
    return;
    // -end- 36240CA4024E addlink_body40432AE50263 "ModelElement::addContainerLink"
  }

  /** disconnect a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E remove_head40432AE50263 "ModelElement::removeContainer"
  public Component removeContainer(Component container1)
  // -end- 36240CA4024E remove_head40432AE50263 "ModelElement::removeContainer"
  {
    // -beg- preserve=no 36240CA4024E remove_body40432AE50263 "ModelElement::removeContainer"
    Component ret=null;
    ElementResidence linkobj=findContainerLink(container1);
    if(container1==null || linkobj==null){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = linkobj.getContainer();
    container.remove(linkobj);
    ret._unlinkResident(linkobj);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeContainer"));
    return ret;
    // -end- 36240CA4024E remove_body40432AE50263 "ModelElement::removeContainer"
  }

  /** tests if a given Container is connected.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E test_head40432AE50263 "ModelElement::containsContainer"
  public boolean containsContainer(Component container1)
  // -end- 36240CA4024E test_head40432AE50263 "ModelElement::containsContainer"
  {
    // -beg- preserve=no 36240CA4024E test_body40432AE50263 "ModelElement::containsContainer"
    return container.contains(findContainerLink(container1));
    // -end- 36240CA4024E test_body40432AE50263 "ModelElement::containsContainer"
  }

  /** used to enumerate all connected Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E get_all_head40432AE50263 "ModelElement::iteratorContainer"
  public java.util.Iterator iteratorContainer()
  // -end- 36240CA4024E get_all_head40432AE50263 "ModelElement::iteratorContainer"
  {
    // -beg- preserve=no 36240CA4024E get_all_body40432AE50263 "ModelElement::iteratorContainer"
    return new java.util.Iterator(){
      private java.util.Iterator i=container.iterator();
      public boolean hasNext(){
        return i.hasNext();
      }
      public Object next(){
        ElementResidence next=(ElementResidence)i.next();
        return next.getContainer();
      }
      public void remove(){
        i.remove();
      }
    };
    // -end- 36240CA4024E get_all_body40432AE50263 "ModelElement::iteratorContainer"
  }

  /** disconnect all Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E remove_all_head40432AE50263 "ModelElement::clearContainer"
  public void clearContainer()
  // -end- 36240CA4024E remove_all_head40432AE50263 "ModelElement::clearContainer"
  {
    // -beg- preserve=no 36240CA4024E remove_all_body40432AE50263 "ModelElement::clearContainer"
    if(sizeContainer()>0){
      for(java.util.Iterator p = container.iterator(); p.hasNext();){
        ElementResidence linkobj=(ElementResidence)p.next();
        linkobj.getContainer()._unlinkResident(linkobj);
      }
      container.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearContainer"));
    }
    // -end- 36240CA4024E remove_all_body40432AE50263 "ModelElement::clearContainer"
  }

  /** returns the number of Containers.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E size_head40432AE50263 "ModelElement::sizeContainer"
  public int sizeContainer()
  // -end- 36240CA4024E size_head40432AE50263 "ModelElement::sizeContainer"
  {
    // -beg- preserve=no 36240CA4024E size_body40432AE50263 "ModelElement::sizeContainer"
    return container.size();
    // -end- 36240CA4024E size_body40432AE50263 "ModelElement::sizeContainer"
  }

  /** enumerate the link objects of currently connected Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E itlink_head40432AE50263 "ModelElement::getContainerLink"
  public java.util.Iterator iteratorContainerLink()
  // -end- 36240CA4024E itlink_head40432AE50263 "ModelElement::getContainerLink"
  {
    // -beg- preserve=no 36240CA4024E itlink_body40432AE50263 "ModelElement::getContainerLink"
    return container.iterator();
    // -end- 36240CA4024E itlink_body40432AE50263 "ModelElement::getContainerLink"
  }

  /** create a link class for a new link to a Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E createlink_head40432AE50263 "ModelElement::createContainerLink"
  public ElementResidence createContainerLink()
  // -end- 36240CA4024E createlink_head40432AE50263 "ModelElement::createContainerLink"
  {
    // -beg- preserve=no 36240CA4024E createlink_body40432AE50263 "ModelElement::createContainerLink"
    // return new ElementResidence();
    throw new java.lang.UnsupportedOperationException();
    // -end- 36240CA4024E createlink_body40432AE50263 "ModelElement::createContainerLink"
  }

  /** find a link object for a given Container.
   *  @see #addContainer
   */
  // -beg- preserve=no 36240CA4024E find_head40432AE50263 "ModelElement::findContainerLink"
  public ElementResidence findContainerLink(Component container1)
  // -end- 36240CA4024E find_head40432AE50263 "ModelElement::findContainerLink"
  {
      // -beg- preserve=no 36240CA4024E find_body40432AE50263 "ModelElement::findContainerLink"
      if(container1==null) return null;
      for(java.util.Iterator p = container.iterator(); p.hasNext();){
        ElementResidence linkobj=(ElementResidence)p.next();
        if(linkobj.getContainer()==container1) return linkobj;
      }
      return null;
      // -end- 36240CA4024E find_body40432AE50263 "ModelElement::findContainerLink"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240CA4024E _link_body40432AE50263 "ModelElement::_linkContainer"
    public void _linkContainer(ElementResidence container1)
    {
      container.add(container1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkContainer"));
      return;
    }
    // -end- 36240CA4024E _link_body40432AE50263 "ModelElement::_linkContainer"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240CA4024E _unlink_body40432AE50263 "ModelElement::_unlinkContainer"
    public void _unlinkContainer(ElementResidence container1)
    {
      container.remove(container1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkContainer"));
      return;
    }
    // -end- 36240CA4024E _unlink_body40432AE50263 "ModelElement::_unlinkContainer"

    // -beg- preserve=no 36240F380050 code40432AE50263 "templateParameter"
    private java.util.List templateParameter = new java.util.ArrayList();
    // -end- 36240F380050 code40432AE50263 "templateParameter"

    /** add a TemplateParameter.
     *  
     *  @see #removeTemplateParameter
     *  @see #containsTemplateParameter
     *  @see #iteratorTemplateParameter
     *  @see #clearTemplateParameter
     *  @see #sizeTemplateParameter
     */
    // -beg- preserve=no 36240F380050 add_head40432AE50263 "ModelElement::addTemplateParameter"
    public void addTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 add_head40432AE50263 "ModelElement::addTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 add_body40432AE50263 "ModelElement::addTemplateParameter"
      templateParameter.add(templateParameter1);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTemplateParameter"));
      return;
      // -end- 36240F380050 add_body40432AE50263 "ModelElement::addTemplateParameter"
    }

    // -beg- preserve=no 36240F380050 add2_head40432AE50263 "ModelElement::add2TemplateParameter"
    public void addTemplateParameter(int index,TemplateParameter templateParameter1)
    // -end- 36240F380050 add2_head40432AE50263 "ModelElement::add2TemplateParameter"
    {
      // -beg- preserve=no 36240F380050 add2_body40432AE50263 "ModelElement::add2TemplateParameter"
      templateParameter.add(index,templateParameter1);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTemplateParameter"));
      return;
      // -end- 36240F380050 add2_body40432AE50263 "ModelElement::add2TemplateParameter"
    }

    /** disconnect a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove_head40432AE50263 "ModelElement::removeTemplateParameter"
    public TemplateParameter removeTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 remove_head40432AE50263 "ModelElement::removeTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove_body40432AE50263 "ModelElement::removeTemplateParameter"
      TemplateParameter ret=null;
      if(templateParameter1==null || !templateParameter.contains(templateParameter1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = templateParameter1;
      templateParameter.remove(templateParameter1);
      templateParameter1._unlinkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTemplateParameter"));
      return ret;
      // -end- 36240F380050 remove_body40432AE50263 "ModelElement::removeTemplateParameter"
    }

    /** disconnect a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove2_head40432AE50263 "ModelElement::remove2TemplateParameter"
    public TemplateParameter removeTemplateParameter(int index)
    // -end- 36240F380050 remove2_head40432AE50263 "ModelElement::remove2TemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove2_body40432AE50263 "ModelElement::remove2TemplateParameter"
      TemplateParameter ret=null;
      ret = (TemplateParameter)templateParameter.remove(index);
      ret._unlinkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTemplateParameter"));
      return ret;
      // -end- 36240F380050 remove2_body40432AE50263 "ModelElement::remove2TemplateParameter"
    }

    /** change a TemplateParameter.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 set_head40432AE50263 "ModelElement::setTemplateParameter"
    public TemplateParameter setTemplateParameter(int index,TemplateParameter templateParameter1)
    // -end- 36240F380050 set_head40432AE50263 "ModelElement::setTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 set_body40432AE50263 "ModelElement::setTemplateParameter"
      TemplateParameter ret=null;
      ret = (TemplateParameter)templateParameter.set(index,templateParameter1);
      ret._unlinkTemplate(this);
      templateParameter1._linkTemplate(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setTemplateParameter"));
      return ret;
      // -end- 36240F380050 set_body40432AE50263 "ModelElement::setTemplateParameter"
    }

    /** tests if a given TemplateParameter is connected.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 test_head40432AE50263 "ModelElement::containsTemplateParameter"
    public boolean containsTemplateParameter(TemplateParameter templateParameter1)
    // -end- 36240F380050 test_head40432AE50263 "ModelElement::containsTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 test_body40432AE50263 "ModelElement::containsTemplateParameter"
      return templateParameter.contains(templateParameter1);
      // -end- 36240F380050 test_body40432AE50263 "ModelElement::containsTemplateParameter"
    }

    /** used to enumerate all connected TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 get_all_head40432AE50263 "ModelElement::iteratorTemplateParameter"
    public java.util.Iterator iteratorTemplateParameter()
    // -end- 36240F380050 get_all_head40432AE50263 "ModelElement::iteratorTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 get_all_body40432AE50263 "ModelElement::iteratorTemplateParameter"
      return templateParameter.iterator();
      // -end- 36240F380050 get_all_body40432AE50263 "ModelElement::iteratorTemplateParameter"
    }

    /** disconnect all TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 remove_all_head40432AE50263 "ModelElement::clearTemplateParameter"
    public void clearTemplateParameter()
    // -end- 36240F380050 remove_all_head40432AE50263 "ModelElement::clearTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 remove_all_body40432AE50263 "ModelElement::clearTemplateParameter"
      if(sizeTemplateParameter()>0){
        for(java.util.Iterator p = templateParameter.iterator(); p.hasNext();){
          ((TemplateParameter)p.next())._unlinkTemplate(this);
        }
        templateParameter.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTemplateParameter"));
      }
      // -end- 36240F380050 remove_all_body40432AE50263 "ModelElement::clearTemplateParameter"
    }

    /** returns the number of TemplateParameters.
     *  @see #addTemplateParameter
     */
    // -beg- preserve=no 36240F380050 size_head40432AE50263 "ModelElement::sizeTemplateParameter"
    public int sizeTemplateParameter()
    // -end- 36240F380050 size_head40432AE50263 "ModelElement::sizeTemplateParameter"
    {
      // -beg- preserve=no 36240F380050 size_body40432AE50263 "ModelElement::sizeTemplateParameter"
      return templateParameter.size();
      // -end- 36240F380050 size_body40432AE50263 "ModelElement::sizeTemplateParameter"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240F380050 _link_body40432AE50263 "ModelElement::_linkTemplateParameter"
    public void _linkTemplateParameter(TemplateParameter templateParameter1)
    {
      templateParameter.add(templateParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTemplateParameter"));
      return;
    }
    // -end- 36240F380050 _link_body40432AE50263 "ModelElement::_linkTemplateParameter"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 36240F380050 _unlink_body40432AE50263 "ModelElement::_unlinkTemplateParameter"
    public void _unlinkTemplateParameter(TemplateParameter templateParameter1)
    {
      templateParameter.remove(templateParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTemplateParameter"));
      return;
    }
    // -end- 36240F380050 _unlink_body40432AE50263 "ModelElement::_unlinkTemplateParameter"

    // -beg- preserve=no 3627D5E9010F code40432AE50263 "targetFlow"
    private java.util.Set targetFlow = new java.util.HashSet();
    // -end- 3627D5E9010F code40432AE50263 "targetFlow"

    /** add a TargetFlow.
     *  
     *  @see #removeTargetFlow
     *  @see #containsTargetFlow
     *  @see #iteratorTargetFlow
     *  @see #clearTargetFlow
     *  @see #sizeTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F add_head40432AE50263 "ModelElement::addTargetFlow"
    public void addTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F add_head40432AE50263 "ModelElement::addTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F add_body40432AE50263 "ModelElement::addTargetFlow"
      targetFlow.add(targetFlow1);
      targetFlow1._linkTarget(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTargetFlow"));
      return;
      // -end- 3627D5E9010F add_body40432AE50263 "ModelElement::addTargetFlow"
    }

    /** disconnect a TargetFlow.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F remove_head40432AE50263 "ModelElement::removeTargetFlow"
    public Flow removeTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F remove_head40432AE50263 "ModelElement::removeTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F remove_body40432AE50263 "ModelElement::removeTargetFlow"
      Flow ret=null;
      if(targetFlow1==null || !targetFlow.contains(targetFlow1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = targetFlow1;
      targetFlow.remove(targetFlow1);
      targetFlow1._unlinkTarget(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTargetFlow"));
      return ret;
      // -end- 3627D5E9010F remove_body40432AE50263 "ModelElement::removeTargetFlow"
    }

    /** tests if a given TargetFlow is connected.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F test_head40432AE50263 "ModelElement::containsTargetFlow"
    public boolean containsTargetFlow(Flow targetFlow1)
    // -end- 3627D5E9010F test_head40432AE50263 "ModelElement::containsTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F test_body40432AE50263 "ModelElement::containsTargetFlow"
      return targetFlow.contains(targetFlow1);
      // -end- 3627D5E9010F test_body40432AE50263 "ModelElement::containsTargetFlow"
    }

    /** used to enumerate all connected TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F get_all_head40432AE50263 "ModelElement::iteratorTargetFlow"
    public java.util.Iterator iteratorTargetFlow()
    // -end- 3627D5E9010F get_all_head40432AE50263 "ModelElement::iteratorTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F get_all_body40432AE50263 "ModelElement::iteratorTargetFlow"
      return targetFlow.iterator();
      // -end- 3627D5E9010F get_all_body40432AE50263 "ModelElement::iteratorTargetFlow"
    }

    /** disconnect all TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F remove_all_head40432AE50263 "ModelElement::clearTargetFlow"
    public void clearTargetFlow()
    // -end- 3627D5E9010F remove_all_head40432AE50263 "ModelElement::clearTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F remove_all_body40432AE50263 "ModelElement::clearTargetFlow"
      if(sizeTargetFlow()>0){
        for(java.util.Iterator p = targetFlow.iterator(); p.hasNext();){
          ((Flow)p.next())._unlinkTarget(this);
        }
        targetFlow.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTargetFlow"));
      }
      // -end- 3627D5E9010F remove_all_body40432AE50263 "ModelElement::clearTargetFlow"
    }

    /** returns the number of TargetFlows.
     *  @see #addTargetFlow
     */
    // -beg- preserve=no 3627D5E9010F size_head40432AE50263 "ModelElement::sizeTargetFlow"
    public int sizeTargetFlow()
    // -end- 3627D5E9010F size_head40432AE50263 "ModelElement::sizeTargetFlow"
    {
      // -beg- preserve=no 3627D5E9010F size_body40432AE50263 "ModelElement::sizeTargetFlow"
      return targetFlow.size();
      // -end- 3627D5E9010F size_body40432AE50263 "ModelElement::sizeTargetFlow"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D5E9010F _link_body40432AE50263 "ModelElement::_linkTargetFlow"
    public void _linkTargetFlow(Flow targetFlow1)
    {
      targetFlow.add(targetFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTargetFlow"));
      return;
    }
    // -end- 3627D5E9010F _link_body40432AE50263 "ModelElement::_linkTargetFlow"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D5E9010F _unlink_body40432AE50263 "ModelElement::_unlinkTargetFlow"
    public void _unlinkTargetFlow(Flow targetFlow1)
    {
      targetFlow.remove(targetFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTargetFlow"));
      return;
    }
    // -end- 3627D5E9010F _unlink_body40432AE50263 "ModelElement::_unlinkTargetFlow"

    // -beg- preserve=no 3627D60F03DF code40432AE50263 "sourceFlow"
    private java.util.Set sourceFlow = new java.util.HashSet();
    // -end- 3627D60F03DF code40432AE50263 "sourceFlow"

    /** add a SourceFlow.
     *  
     *  @see #removeSourceFlow
     *  @see #containsSourceFlow
     *  @see #iteratorSourceFlow
     *  @see #clearSourceFlow
     *  @see #sizeSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF add_head40432AE50263 "ModelElement::addSourceFlow"
    public void addSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF add_head40432AE50263 "ModelElement::addSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF add_body40432AE50263 "ModelElement::addSourceFlow"
      sourceFlow.add(sourceFlow1);
      sourceFlow1._linkSource(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSourceFlow"));
      return;
      // -end- 3627D60F03DF add_body40432AE50263 "ModelElement::addSourceFlow"
    }

    /** disconnect a SourceFlow.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF remove_head40432AE50263 "ModelElement::removeSourceFlow"
    public Flow removeSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF remove_head40432AE50263 "ModelElement::removeSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF remove_body40432AE50263 "ModelElement::removeSourceFlow"
      Flow ret=null;
      if(sourceFlow1==null || !sourceFlow.contains(sourceFlow1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = sourceFlow1;
      sourceFlow.remove(sourceFlow1);
      sourceFlow1._unlinkSource(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSourceFlow"));
      return ret;
      // -end- 3627D60F03DF remove_body40432AE50263 "ModelElement::removeSourceFlow"
    }

    /** tests if a given SourceFlow is connected.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF test_head40432AE50263 "ModelElement::containsSourceFlow"
    public boolean containsSourceFlow(Flow sourceFlow1)
    // -end- 3627D60F03DF test_head40432AE50263 "ModelElement::containsSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF test_body40432AE50263 "ModelElement::containsSourceFlow"
      return sourceFlow.contains(sourceFlow1);
      // -end- 3627D60F03DF test_body40432AE50263 "ModelElement::containsSourceFlow"
    }

    /** used to enumerate all connected SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF get_all_head40432AE50263 "ModelElement::iteratorSourceFlow"
    public java.util.Iterator iteratorSourceFlow()
    // -end- 3627D60F03DF get_all_head40432AE50263 "ModelElement::iteratorSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF get_all_body40432AE50263 "ModelElement::iteratorSourceFlow"
      return sourceFlow.iterator();
      // -end- 3627D60F03DF get_all_body40432AE50263 "ModelElement::iteratorSourceFlow"
    }

    /** disconnect all SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF remove_all_head40432AE50263 "ModelElement::clearSourceFlow"
    public void clearSourceFlow()
    // -end- 3627D60F03DF remove_all_head40432AE50263 "ModelElement::clearSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF remove_all_body40432AE50263 "ModelElement::clearSourceFlow"
      if(sizeSourceFlow()>0){
        for(java.util.Iterator p = sourceFlow.iterator(); p.hasNext();){
          ((Flow)p.next())._unlinkSource(this);
        }
        sourceFlow.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSourceFlow"));
      }
      // -end- 3627D60F03DF remove_all_body40432AE50263 "ModelElement::clearSourceFlow"
    }

    /** returns the number of SourceFlows.
     *  @see #addSourceFlow
     */
    // -beg- preserve=no 3627D60F03DF size_head40432AE50263 "ModelElement::sizeSourceFlow"
    public int sizeSourceFlow()
    // -end- 3627D60F03DF size_head40432AE50263 "ModelElement::sizeSourceFlow"
    {
      // -beg- preserve=no 3627D60F03DF size_body40432AE50263 "ModelElement::sizeSourceFlow"
      return sourceFlow.size();
      // -end- 3627D60F03DF size_body40432AE50263 "ModelElement::sizeSourceFlow"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D60F03DF _link_body40432AE50263 "ModelElement::_linkSourceFlow"
    public void _linkSourceFlow(Flow sourceFlow1)
    {
      sourceFlow.add(sourceFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSourceFlow"));
      return;
    }
    // -end- 3627D60F03DF _link_body40432AE50263 "ModelElement::_linkSourceFlow"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 3627D60F03DF _unlink_body40432AE50263 "ModelElement::_unlinkSourceFlow"
    public void _unlinkSourceFlow(Flow sourceFlow1)
    {
      sourceFlow.remove(sourceFlow1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSourceFlow"));
      return;
    }
    // -end- 3627D60F03DF _unlink_body40432AE50263 "ModelElement::_unlinkSourceFlow"

    // -beg- preserve=no 365EEE82035C code40432AE50263 "defaultParameter"
    private java.util.Set defaultParameter = new java.util.HashSet();
    // -end- 365EEE82035C code40432AE50263 "defaultParameter"

    /** add a DefaultParameter.
     *  
     *  @see #removeDefaultParameter
     *  @see #containsDefaultParameter
     *  @see #iteratorDefaultParameter
     *  @see #clearDefaultParameter
     *  @see #sizeDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C add_head40432AE50263 "ModelElement::addDefaultParameter"
    public void addDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C add_head40432AE50263 "ModelElement::addDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C add_body40432AE50263 "ModelElement::addDefaultParameter"
      defaultParameter.add(defaultParameter1);
      defaultParameter1._linkDefaultElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDefaultParameter"));
      return;
      // -end- 365EEE82035C add_body40432AE50263 "ModelElement::addDefaultParameter"
    }

    /** disconnect a DefaultParameter.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C remove_head40432AE50263 "ModelElement::removeDefaultParameter"
    public TemplateParameter removeDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C remove_head40432AE50263 "ModelElement::removeDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C remove_body40432AE50263 "ModelElement::removeDefaultParameter"
      TemplateParameter ret=null;
      if(defaultParameter1==null || !defaultParameter.contains(defaultParameter1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = defaultParameter1;
      defaultParameter.remove(defaultParameter1);
      defaultParameter1._unlinkDefaultElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDefaultParameter"));
      return ret;
      // -end- 365EEE82035C remove_body40432AE50263 "ModelElement::removeDefaultParameter"
    }

    /** tests if a given DefaultParameter is connected.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C test_head40432AE50263 "ModelElement::containsDefaultParameter"
    public boolean containsDefaultParameter(TemplateParameter defaultParameter1)
    // -end- 365EEE82035C test_head40432AE50263 "ModelElement::containsDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C test_body40432AE50263 "ModelElement::containsDefaultParameter"
      return defaultParameter.contains(defaultParameter1);
      // -end- 365EEE82035C test_body40432AE50263 "ModelElement::containsDefaultParameter"
    }

    /** used to enumerate all connected DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C get_all_head40432AE50263 "ModelElement::iteratorDefaultParameter"
    public java.util.Iterator iteratorDefaultParameter()
    // -end- 365EEE82035C get_all_head40432AE50263 "ModelElement::iteratorDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C get_all_body40432AE50263 "ModelElement::iteratorDefaultParameter"
      return defaultParameter.iterator();
      // -end- 365EEE82035C get_all_body40432AE50263 "ModelElement::iteratorDefaultParameter"
    }

    /** disconnect all DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C remove_all_head40432AE50263 "ModelElement::clearDefaultParameter"
    public void clearDefaultParameter()
    // -end- 365EEE82035C remove_all_head40432AE50263 "ModelElement::clearDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C remove_all_body40432AE50263 "ModelElement::clearDefaultParameter"
      if(sizeDefaultParameter()>0){
        for(java.util.Iterator p = defaultParameter.iterator(); p.hasNext();){
          ((TemplateParameter)p.next())._unlinkDefaultElement(this);
        }
        defaultParameter.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDefaultParameter"));
      }
      // -end- 365EEE82035C remove_all_body40432AE50263 "ModelElement::clearDefaultParameter"
    }

    /** returns the number of DefaultParameters.
     *  @see #addDefaultParameter
     */
    // -beg- preserve=no 365EEE82035C size_head40432AE50263 "ModelElement::sizeDefaultParameter"
    public int sizeDefaultParameter()
    // -end- 365EEE82035C size_head40432AE50263 "ModelElement::sizeDefaultParameter"
    {
      // -beg- preserve=no 365EEE82035C size_body40432AE50263 "ModelElement::sizeDefaultParameter"
      return defaultParameter.size();
      // -end- 365EEE82035C size_body40432AE50263 "ModelElement::sizeDefaultParameter"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 365EEE82035C _link_body40432AE50263 "ModelElement::_linkDefaultParameter"
    public void _linkDefaultParameter(TemplateParameter defaultParameter1)
    {
      defaultParameter.add(defaultParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDefaultParameter"));
      return;
    }
    // -end- 365EEE82035C _link_body40432AE50263 "ModelElement::_linkDefaultParameter"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 365EEE82035C _unlink_body40432AE50263 "ModelElement::_unlinkDefaultParameter"
    public void _unlinkDefaultParameter(TemplateParameter defaultParameter1)
    {
      defaultParameter.remove(defaultParameter1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDefaultParameter"));
      return;
    }
    // -end- 365EEE82035C _unlink_body40432AE50263 "ModelElement::_unlinkDefaultParameter"

    // -beg- preserve=no 370E7E3C02DE code40432AE50263 "comment"
    private java.util.Set comment = new java.util.HashSet();
    // -end- 370E7E3C02DE code40432AE50263 "comment"

    /** add a Comment.
     *  
     *  @see #removeComment
     *  @see #containsComment
     *  @see #iteratorComment
     *  @see #clearComment
     *  @see #sizeComment
     */
    // -beg- preserve=no 370E7E3C02DE add_head40432AE50263 "ModelElement::addComment"
    public void addComment(Comment comment1)
    // -end- 370E7E3C02DE add_head40432AE50263 "ModelElement::addComment"
    {
      // -beg- preserve=no 370E7E3C02DE add_body40432AE50263 "ModelElement::addComment"
      comment.add(comment1);
      comment1._linkAnnotatedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addComment"));
      return;
      // -end- 370E7E3C02DE add_body40432AE50263 "ModelElement::addComment"
    }

    /** disconnect a Comment.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE remove_head40432AE50263 "ModelElement::removeComment"
    public Comment removeComment(Comment comment1)
    // -end- 370E7E3C02DE remove_head40432AE50263 "ModelElement::removeComment"
    {
      // -beg- preserve=no 370E7E3C02DE remove_body40432AE50263 "ModelElement::removeComment"
      Comment ret=null;
      if(comment1==null || !comment.contains(comment1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = comment1;
      comment.remove(comment1);
      comment1._unlinkAnnotatedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeComment"));
      return ret;
      // -end- 370E7E3C02DE remove_body40432AE50263 "ModelElement::removeComment"
    }

    /** tests if a given Comment is connected.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE test_head40432AE50263 "ModelElement::containsComment"
    public boolean containsComment(Comment comment1)
    // -end- 370E7E3C02DE test_head40432AE50263 "ModelElement::containsComment"
    {
      // -beg- preserve=no 370E7E3C02DE test_body40432AE50263 "ModelElement::containsComment"
      return comment.contains(comment1);
      // -end- 370E7E3C02DE test_body40432AE50263 "ModelElement::containsComment"
    }

    /** used to enumerate all connected Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE get_all_head40432AE50263 "ModelElement::iteratorComment"
    public java.util.Iterator iteratorComment()
    // -end- 370E7E3C02DE get_all_head40432AE50263 "ModelElement::iteratorComment"
    {
      // -beg- preserve=no 370E7E3C02DE get_all_body40432AE50263 "ModelElement::iteratorComment"
      return comment.iterator();
      // -end- 370E7E3C02DE get_all_body40432AE50263 "ModelElement::iteratorComment"
    }

    /** disconnect all Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE remove_all_head40432AE50263 "ModelElement::clearComment"
    public void clearComment()
    // -end- 370E7E3C02DE remove_all_head40432AE50263 "ModelElement::clearComment"
    {
      // -beg- preserve=no 370E7E3C02DE remove_all_body40432AE50263 "ModelElement::clearComment"
      if(sizeComment()>0){
        for(java.util.Iterator p = comment.iterator(); p.hasNext();){
          ((Comment)p.next())._unlinkAnnotatedElement(this);
        }
        comment.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearComment"));
      }
      // -end- 370E7E3C02DE remove_all_body40432AE50263 "ModelElement::clearComment"
    }

    /** returns the number of Comments.
     *  @see #addComment
     */
    // -beg- preserve=no 370E7E3C02DE size_head40432AE50263 "ModelElement::sizeComment"
    public int sizeComment()
    // -end- 370E7E3C02DE size_head40432AE50263 "ModelElement::sizeComment"
    {
      // -beg- preserve=no 370E7E3C02DE size_body40432AE50263 "ModelElement::sizeComment"
      return comment.size();
      // -end- 370E7E3C02DE size_body40432AE50263 "ModelElement::sizeComment"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 370E7E3C02DE _link_body40432AE50263 "ModelElement::_linkComment"
    public void _linkComment(Comment comment1)
    {
      comment.add(comment1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkComment"));
      return;
    }
    // -end- 370E7E3C02DE _link_body40432AE50263 "ModelElement::_linkComment"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 370E7E3C02DE _unlink_body40432AE50263 "ModelElement::_unlinkComment"
    public void _unlinkComment(Comment comment1)
    {
      comment.remove(comment1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkComment"));
      return;
    }
    // -end- 370E7E3C02DE _unlink_body40432AE50263 "ModelElement::_unlinkComment"

    // -beg- preserve=no 338613A4007B code40432AE50263 "stereotype"
    private java.util.Set stereotype = new java.util.HashSet();
    // -end- 338613A4007B code40432AE50263 "stereotype"

    /** add a Stereotype.
     *  
     *  @see #removeStereotype
     *  @see #containsStereotype
     *  @see #iteratorStereotype
     *  @see #clearStereotype
     *  @see #sizeStereotype
     */
    // -beg- preserve=no 338613A4007B add_head40432AE50263 "ModelElement::addStereotype"
    public void addStereotype(Stereotype stereotype1)
    // -end- 338613A4007B add_head40432AE50263 "ModelElement::addStereotype"
    {
      // -beg- preserve=no 338613A4007B add_body40432AE50263 "ModelElement::addStereotype"
      stereotype.add(stereotype1);
      stereotype1._linkExtendedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addStereotype"));
      return;
      // -end- 338613A4007B add_body40432AE50263 "ModelElement::addStereotype"
    }

    /** disconnect a Stereotype.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B remove_head40432AE50263 "ModelElement::removeStereotype"
    public Stereotype removeStereotype(Stereotype stereotype1)
    // -end- 338613A4007B remove_head40432AE50263 "ModelElement::removeStereotype"
    {
      // -beg- preserve=no 338613A4007B remove_body40432AE50263 "ModelElement::removeStereotype"
      Stereotype ret=null;
      if(stereotype1==null || !stereotype.contains(stereotype1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = stereotype1;
      stereotype.remove(stereotype1);
      stereotype1._unlinkExtendedElement(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeStereotype"));
      return ret;
      // -end- 338613A4007B remove_body40432AE50263 "ModelElement::removeStereotype"
    }

    /** tests if a given Stereotype is connected.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B test_head40432AE50263 "ModelElement::containsStereotype"
    public boolean containsStereotype(Stereotype stereotype1)
    // -end- 338613A4007B test_head40432AE50263 "ModelElement::containsStereotype"
    {
      // -beg- preserve=no 338613A4007B test_body40432AE50263 "ModelElement::containsStereotype"
      return stereotype.contains(stereotype1);
      // -end- 338613A4007B test_body40432AE50263 "ModelElement::containsStereotype"
    }

    /** used to enumerate all connected Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B get_all_head40432AE50263 "ModelElement::iteratorStereotype"
    public java.util.Iterator iteratorStereotype()
    // -end- 338613A4007B get_all_head40432AE50263 "ModelElement::iteratorStereotype"
    {
      // -beg- preserve=no 338613A4007B get_all_body40432AE50263 "ModelElement::iteratorStereotype"
      return stereotype.iterator();
      // -end- 338613A4007B get_all_body40432AE50263 "ModelElement::iteratorStereotype"
    }

    /** disconnect all Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B remove_all_head40432AE50263 "ModelElement::clearStereotype"
    public void clearStereotype()
    // -end- 338613A4007B remove_all_head40432AE50263 "ModelElement::clearStereotype"
    {
      // -beg- preserve=no 338613A4007B remove_all_body40432AE50263 "ModelElement::clearStereotype"
      if(sizeStereotype()>0){
        for(java.util.Iterator p = stereotype.iterator(); p.hasNext();){
          ((Stereotype)p.next())._unlinkExtendedElement(this);
        }
        stereotype.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearStereotype"));
      }
      // -end- 338613A4007B remove_all_body40432AE50263 "ModelElement::clearStereotype"
    }

    /** returns the number of Stereotypes.
     *  @see #addStereotype
     */
    // -beg- preserve=no 338613A4007B size_head40432AE50263 "ModelElement::sizeStereotype"
    public int sizeStereotype()
    // -end- 338613A4007B size_head40432AE50263 "ModelElement::sizeStereotype"
    {
      // -beg- preserve=no 338613A4007B size_body40432AE50263 "ModelElement::sizeStereotype"
      return stereotype.size();
      // -end- 338613A4007B size_body40432AE50263 "ModelElement::sizeStereotype"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 338613A4007B _link_body40432AE50263 "ModelElement::_linkStereotype"
    public void _linkStereotype(Stereotype stereotype1)
    {
      stereotype.add(stereotype1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkStereotype"));
      return;
    }
    // -end- 338613A4007B _link_body40432AE50263 "ModelElement::_linkStereotype"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 338613A4007B _unlink_body40432AE50263 "ModelElement::_unlinkStereotype"
    public void _unlinkStereotype(Stereotype stereotype1)
    {
      stereotype.remove(stereotype1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkStereotype"));
      return;
    }
    // -end- 338613A4007B _unlink_body40432AE50263 "ModelElement::_unlinkStereotype"

    // -beg- preserve=no 39B9B0F703C8 code40432AE50263 "referenceTag"
    private java.util.Set referenceTag = new java.util.HashSet();
    // -end- 39B9B0F703C8 code40432AE50263 "referenceTag"

    /** add a ReferenceTag.
     *  
     *  @see #removeReferenceTag
     *  @see #containsReferenceTag
     *  @see #iteratorReferenceTag
     *  @see #clearReferenceTag
     *  @see #sizeReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 add_head40432AE50263 "ModelElement::addReferenceTag"
    public void addReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 add_head40432AE50263 "ModelElement::addReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 add_body40432AE50263 "ModelElement::addReferenceTag"
      referenceTag.add(referenceTag1);
      referenceTag1._linkReferenceValue(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addReferenceTag"));
      return;
      // -end- 39B9B0F703C8 add_body40432AE50263 "ModelElement::addReferenceTag"
    }

    /** disconnect a ReferenceTag.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 remove_head40432AE50263 "ModelElement::removeReferenceTag"
    public TaggedValue removeReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 remove_head40432AE50263 "ModelElement::removeReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 remove_body40432AE50263 "ModelElement::removeReferenceTag"
      TaggedValue ret=null;
      if(referenceTag1==null || !referenceTag.contains(referenceTag1)){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = referenceTag1;
      referenceTag.remove(referenceTag1);
      referenceTag1._unlinkReferenceValue(this);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeReferenceTag"));
      return ret;
      // -end- 39B9B0F703C8 remove_body40432AE50263 "ModelElement::removeReferenceTag"
    }

    /** tests if a given ReferenceTag is connected.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 test_head40432AE50263 "ModelElement::containsReferenceTag"
    public boolean containsReferenceTag(TaggedValue referenceTag1)
    // -end- 39B9B0F703C8 test_head40432AE50263 "ModelElement::containsReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 test_body40432AE50263 "ModelElement::containsReferenceTag"
      return referenceTag.contains(referenceTag1);
      // -end- 39B9B0F703C8 test_body40432AE50263 "ModelElement::containsReferenceTag"
    }

    /** used to enumerate all connected ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 get_all_head40432AE50263 "ModelElement::iteratorReferenceTag"
    public java.util.Iterator iteratorReferenceTag()
    // -end- 39B9B0F703C8 get_all_head40432AE50263 "ModelElement::iteratorReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 get_all_body40432AE50263 "ModelElement::iteratorReferenceTag"
      return referenceTag.iterator();
      // -end- 39B9B0F703C8 get_all_body40432AE50263 "ModelElement::iteratorReferenceTag"
    }

    /** disconnect all ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 remove_all_head40432AE50263 "ModelElement::clearReferenceTag"
    public void clearReferenceTag()
    // -end- 39B9B0F703C8 remove_all_head40432AE50263 "ModelElement::clearReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 remove_all_body40432AE50263 "ModelElement::clearReferenceTag"
      if(sizeReferenceTag()>0){
        for(java.util.Iterator p = referenceTag.iterator(); p.hasNext();){
          ((TaggedValue)p.next())._unlinkReferenceValue(this);
        }
        referenceTag.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearReferenceTag"));
      }
      // -end- 39B9B0F703C8 remove_all_body40432AE50263 "ModelElement::clearReferenceTag"
    }

    /** returns the number of ReferenceTags.
     *  @see #addReferenceTag
     */
    // -beg- preserve=no 39B9B0F703C8 size_head40432AE50263 "ModelElement::sizeReferenceTag"
    public int sizeReferenceTag()
    // -end- 39B9B0F703C8 size_head40432AE50263 "ModelElement::sizeReferenceTag"
    {
      // -beg- preserve=no 39B9B0F703C8 size_body40432AE50263 "ModelElement::sizeReferenceTag"
      return referenceTag.size();
      // -end- 39B9B0F703C8 size_body40432AE50263 "ModelElement::sizeReferenceTag"
    }

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 39B9B0F703C8 _link_body40432AE50263 "ModelElement::_linkReferenceTag"
    public void _linkReferenceTag(TaggedValue referenceTag1)
    {
      referenceTag.add(referenceTag1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkReferenceTag"));
      return;
    }
    // -end- 39B9B0F703C8 _link_body40432AE50263 "ModelElement::_linkReferenceTag"

    /** DONT USE; link management internal
     */
    // -beg- preserve=no 39B9B0F703C8 _unlink_body40432AE50263 "ModelElement::_unlinkReferenceTag"
    public void _unlinkReferenceTag(TaggedValue referenceTag1)
    {
      referenceTag.remove(referenceTag1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkReferenceTag"));
      return;
    }
    // -end- 39B9B0F703C8 _unlink_body40432AE50263 "ModelElement::_unlinkReferenceTag"

    // -beg- preserve=no 33CD739B0316 code40432AE50263 "importedBy"
    private java.util.Set importedBy = new java.util.HashSet();
    // -end- 33CD739B0316 code40432AE50263 "importedBy"

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
    // -beg- preserve=no 33CD739B0316 add_head40432AE50263 "ModelElement::addImportedBy"
    public void addImportedBy(Package importedBy1)
    // -end- 33CD739B0316 add_head40432AE50263 "ModelElement::addImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 add_body40432AE50263 "ModelElement::addImportedBy"
      ElementImport linkobj=createImportedByLink();
      linkobj.setImportedBy(importedBy1);
      linkobj.setImportedElement(this);
      importedBy.add(linkobj);
      importedBy1._linkImportedElement(linkobj);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedBy"));
      return;
      // -end- 33CD739B0316 add_body40432AE50263 "ModelElement::addImportedBy"
    }

    /** add a link to a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 addlink_head40432AE50263 "ModelElement::addImportedByLink"
    public void addImportedByLink(ElementImport importedBy1)
    // -end- 33CD739B0316 addlink_head40432AE50263 "ModelElement::addImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 addlink_body40432AE50263 "ModelElement::addImportedByLink"
      importedBy1.setImportedElement(this);
      importedBy.add(importedBy1);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedByLink"));
      return;
      // -end- 33CD739B0316 addlink_body40432AE50263 "ModelElement::addImportedByLink"
    }

    /** disconnect a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 remove_head40432AE50263 "ModelElement::removeImportedBy"
    public Package removeImportedBy(Package importedBy1)
    // -end- 33CD739B0316 remove_head40432AE50263 "ModelElement::removeImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 remove_body40432AE50263 "ModelElement::removeImportedBy"
      Package ret=null;
      ElementImport linkobj=findImportedByLink(importedBy1);
      if(importedBy1==null || linkobj==null){
        throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
      }
      ret = linkobj.getImportedBy();
      importedBy.remove(linkobj);
      ret._unlinkImportedElement(linkobj);
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeImportedBy"));
      return ret;
      // -end- 33CD739B0316 remove_body40432AE50263 "ModelElement::removeImportedBy"
    }

    /** tests if a given ImportedBy is connected.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 test_head40432AE50263 "ModelElement::containsImportedBy"
    public boolean containsImportedBy(Package importedBy1)
    // -end- 33CD739B0316 test_head40432AE50263 "ModelElement::containsImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 test_body40432AE50263 "ModelElement::containsImportedBy"
      return importedBy.contains(findImportedByLink(importedBy1));
      // -end- 33CD739B0316 test_body40432AE50263 "ModelElement::containsImportedBy"
    }

    /** used to enumerate all connected ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 get_all_head40432AE50263 "ModelElement::iteratorImportedBy"
    public java.util.Iterator iteratorImportedBy()
    // -end- 33CD739B0316 get_all_head40432AE50263 "ModelElement::iteratorImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 get_all_body40432AE50263 "ModelElement::iteratorImportedBy"
      return new java.util.Iterator(){
        private java.util.Iterator i=importedBy.iterator();
        public boolean hasNext(){
          return i.hasNext();
        }
        public Object next(){
          ElementImport next=(ElementImport)i.next();
          return next.getImportedBy();
        }
        public void remove(){
          i.remove();
        }
      };
      // -end- 33CD739B0316 get_all_body40432AE50263 "ModelElement::iteratorImportedBy"
    }

    /** disconnect all ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 remove_all_head40432AE50263 "ModelElement::clearImportedBy"
    public void clearImportedBy()
    // -end- 33CD739B0316 remove_all_head40432AE50263 "ModelElement::clearImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 remove_all_body40432AE50263 "ModelElement::clearImportedBy"
      if(sizeImportedBy()>0){
        for(java.util.Iterator p = importedBy.iterator(); p.hasNext();){
          ElementImport linkobj=(ElementImport)p.next();
          linkobj.getImportedBy()._unlinkImportedElement(linkobj);
        }
        importedBy.clear();
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearImportedBy"));
      }
      // -end- 33CD739B0316 remove_all_body40432AE50263 "ModelElement::clearImportedBy"
    }

    /** returns the number of ImportedBys.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 size_head40432AE50263 "ModelElement::sizeImportedBy"
    public int sizeImportedBy()
    // -end- 33CD739B0316 size_head40432AE50263 "ModelElement::sizeImportedBy"
    {
      // -beg- preserve=no 33CD739B0316 size_body40432AE50263 "ModelElement::sizeImportedBy"
      return importedBy.size();
      // -end- 33CD739B0316 size_body40432AE50263 "ModelElement::sizeImportedBy"
    }

    /** enumerate the link objects of currently connected ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 itlink_head40432AE50263 "ModelElement::getImportedByLink"
    public java.util.Iterator iteratorImportedByLink()
    // -end- 33CD739B0316 itlink_head40432AE50263 "ModelElement::getImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 itlink_body40432AE50263 "ModelElement::getImportedByLink"
      return importedBy.iterator();
      // -end- 33CD739B0316 itlink_body40432AE50263 "ModelElement::getImportedByLink"
    }

    /** create a link class for a new link to a ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 createlink_head40432AE50263 "ModelElement::createImportedByLink"
    public ElementImport createImportedByLink()
    // -end- 33CD739B0316 createlink_head40432AE50263 "ModelElement::createImportedByLink"
    {
      // -beg- preserve=no 33CD739B0316 createlink_body40432AE50263 "ModelElement::createImportedByLink"
      // return new ElementImport();
      throw new java.lang.UnsupportedOperationException();
      // -end- 33CD739B0316 createlink_body40432AE50263 "ModelElement::createImportedByLink"
    }

    /** find a link object for a given ImportedBy.
     *  @see #addImportedBy
     */
    // -beg- preserve=no 33CD739B0316 find_head40432AE50263 "ModelElement::findImportedByLink"
    public ElementImport findImportedByLink(Package importedBy1)
    // -end- 33CD739B0316 find_head40432AE50263 "ModelElement::findImportedByLink"
    {
        // -beg- preserve=no 33CD739B0316 find_body40432AE50263 "ModelElement::findImportedByLink"
        if(importedBy1==null) return null;
        for(java.util.Iterator p = importedBy.iterator(); p.hasNext();){
          ElementImport linkobj=(ElementImport)p.next();
          if(linkobj.getImportedBy()==importedBy1) return linkobj;
        }
        return null;
        // -end- 33CD739B0316 find_body40432AE50263 "ModelElement::findImportedByLink"
      }

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 33CD739B0316 _link_body40432AE50263 "ModelElement::_linkImportedBy"
      public void _linkImportedBy(ElementImport importedBy1)
      {
        importedBy.add(importedBy1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkImportedBy"));
        return;
      }
      // -end- 33CD739B0316 _link_body40432AE50263 "ModelElement::_linkImportedBy"

      /** DONT USE; link management internal
       */
      // -beg- preserve=no 33CD739B0316 _unlink_body40432AE50263 "ModelElement::_unlinkImportedBy"
      public void _unlinkImportedBy(ElementImport importedBy1)
      {
        importedBy.remove(importedBy1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkImportedBy"));
        return;
      }
      // -end- 33CD739B0316 _unlink_body40432AE50263 "ModelElement::_unlinkImportedBy"

      // -beg- preserve=no 335D4BA70064 var40432AE50263 "name"
      private NlsString name = null;
      // -end- 335D4BA70064 var40432AE50263 "name"

      /** get current value of name
       *  @see #setName
       */
      // -beg- preserve=no 335D4BA70064 get_head40432AE50263 "name"
      public  NlsString getName()
      // -end- 335D4BA70064 get_head40432AE50263 "name"
      {
        // -beg- preserve=no 335D4BA70064 get_body40432AE50263 "name"
        return name;
        // -end- 335D4BA70064 get_body40432AE50263 "name"
      }

      /** set current value of name
       *  @see #getName
       */
      // -beg- preserve=no 335D4BA70064 set_head40432AE50263 "name"
      public  void setName(NlsString value1)
      // -end- 335D4BA70064 set_head40432AE50263 "name"
      {
        // -beg- preserve=no 335D4BA70064 set_body40432AE50263 "name"
        if(name!=value1 && (name==null || !name.equals(value1))){
          name = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setName"));
        }
        // -end- 335D4BA70064 set_body40432AE50263 "name"
      }

      // -beg- preserve=no 3C1DF92B0234 var40432AE50263 "documentation"
      private NlsString documentation = null;
      // -end- 3C1DF92B0234 var40432AE50263 "documentation"

      /** get current value of documentation
       *  @see #setDocumentation
       */
      // -beg- preserve=no 3C1DF92B0234 get_head40432AE50263 "documentation"
      public  NlsString getDocumentation()
      // -end- 3C1DF92B0234 get_head40432AE50263 "documentation"
      {
        // -beg- preserve=no 3C1DF92B0234 get_body40432AE50263 "documentation"
        return documentation;
        // -end- 3C1DF92B0234 get_body40432AE50263 "documentation"
      }

      /** set current value of documentation
       *  @see #getDocumentation
       */
      // -beg- preserve=no 3C1DF92B0234 set_head40432AE50263 "documentation"
      public  void setDocumentation(NlsString value1)
      // -end- 3C1DF92B0234 set_head40432AE50263 "documentation"
      {
        // -beg- preserve=no 3C1DF92B0234 set_body40432AE50263 "documentation"
        if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
          documentation = value1;
          ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
        }
        // -end- 3C1DF92B0234 set_body40432AE50263 "documentation"
      }

      // declare/define something only in the code
      // please fill in/modify the following section
      // -beg- preserve=no 40432AE50263 detail_end "UmlOperation"

      // -end- 40432AE50263 detail_end "UmlOperation"

    }

