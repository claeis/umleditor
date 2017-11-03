/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

<<<<<<< HEAD

=======
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -beg- preserve=no 4551A5A200BB package "UmlActor"
package ch.ehi.uml1_4.implementation;
// -end- 4551A5A200BB package "UmlActor"

<<<<<<< HEAD
// -beg- preserve=no 4551A5A200BB autoimport "UmlActor"
import ch.ehi.uml1_4.behaviour.usecases.Actor;
import ch.ehi.uml1_4.implementation.AbstractNamespace;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Namespace;
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
import ch.ehi.basics.types.NlsString;
// -end- 4551A5A200BB autoimport "UmlActor"
=======
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 4551A5A200BB autoimport "UmlActor"
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
// -beg- preserve=no 4551A5A200BB autoimport "UmlActor"
import ch.ehi.uml1_4.behaviour.usecases.Actor;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Class;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.ModelElement;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4551A5A200BB import "UmlActor"

// -end- 4551A5A200BB import "UmlActor"

<<<<<<< HEAD
/** @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlActor extends AbstractNamespace implements Actor
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4551A5A200BB detail_begin "UmlActor"

  // -end- 4551A5A200BB detail_begin "UmlActor"

  // -beg- preserve=no 4551A85800F6 head4551A5A200BB "unlinkAll"
  public void unlinkAll()
  // -end- 4551A85800F6 head4551A5A200BB "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551A85800F6 throws4551A5A200BB "unlinkAll"

    // -end- 4551A85800F6 throws4551A5A200BB "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551A85800F6 body4551A5A200BB "unlinkAll"
    
    clearObjectFlowState();
    clearClassifierInState();
    clearClassifierRole();
    clearCollaboration();
    clearInstance();
    clearCreateAction();
    clearFeature();
    // Role TypedFeature: StructuralFeature object(s) may point to this
    // Role TypedParameter: Parameter object(s) may point to this
    clearAssociation();
    clearSpecifiedEnd();
    clearPowertypeRange();
    clearGeneralization();
    clearSpecialization();
    clearOwnedElement();
    clearDiagram();
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
    super.unlinkAll();
    // -end- 4551A85800F6 body4551A5A200BB "unlinkAll"
    }

  // -beg- preserve=no 4551A85C008D head4551A5A200BB "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 4551A85C008D head4551A5A200BB "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551A85C008D throws4551A5A200BB "enumerateChildren"

    // -end- 4551A85C008D throws4551A5A200BB "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551A85C008D body4551A5A200BB "enumerateChildren"
    java.util.Iterator it=null;
    it=iteratorFeature();while(it.hasNext())visitor.visit(it.next());
    it=iteratorOwnedElement();while(it.hasNext())visitor.visit(it.next());
    it=iteratorDiagram();while(it.hasNext())visitor.visit(it.next());
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    visitor.visit(getDocumentation());
    super.enumerateChildren(visitor);
    // -end- 4551A85C008D body4551A5A200BB "enumerateChildren"
    }

  /** return the list of valid owned elements for this namespace.
   */
  // -beg- preserve=no 4551F6E703A0 head4551A5A200BB "getValidOwnedElements"
  public String[] getValidOwnedElements()
  // -end- 4551F6E703A0 head4551A5A200BB "getValidOwnedElements"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551F6E703A0 throws4551A5A200BB "getValidOwnedElements"

    // -end- 4551F6E703A0 throws4551A5A200BB "getValidOwnedElements"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551F6E703A0 body4551A5A200BB "getValidOwnedElements"
    return null;
    // -end- 4551F6E703A0 body4551A5A200BB "getValidOwnedElements"
    }

  /** tests if this Classifier contains a Feature with the given name
   */
  // -beg- preserve=no 3CB2C64E0374 head4551A5A200BB "containsFeature"
  public boolean containsFeature(String name)
  // -end- 3CB2C64E0374 head4551A5A200BB "containsFeature"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CB2C64E0374 throws4551A5A200BB "containsFeature"

    // -end- 3CB2C64E0374 throws4551A5A200BB "containsFeature"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CB2C64E0374 body4551A5A200BB "containsFeature"
	java.util.Iterator it=iteratorFeature();
	while(it.hasNext()){
	  ModelElement ele=(ModelElement)it.next();
	  if(ele.getDefLangName().equals(name)){
		return true;
	  }
	}
	return false;
    // -end- 3CB2C64E0374 body4551A5A200BB "containsFeature"
    }

  // -beg- preserve=no 33CF9EFC006E code4551A5A200BB "objectFlowState"
  private java.util.Set objectFlowState = new java.util.HashSet();
  // -end- 33CF9EFC006E code4551A5A200BB "objectFlowState"

  /** add a ObjectFlowState.
   *  
   *  @see #removeObjectFlowState
   *  @see #containsObjectFlowState
   *  @see #iteratorObjectFlowState
   *  @see #clearObjectFlowState
   *  @see #sizeObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E add_head4551A5A200BB "Classifier::addObjectFlowState"
  public void addObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E add_head4551A5A200BB "Classifier::addObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E add_body4551A5A200BB "Classifier::addObjectFlowState"
    objectFlowState.add(objectFlowState1);
    objectFlowState1._linkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addObjectFlowState"));
    return;
    // -end- 33CF9EFC006E add_body4551A5A200BB "Classifier::addObjectFlowState"
  }

  /** disconnect a ObjectFlowState.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E remove_head4551A5A200BB "Classifier::removeObjectFlowState"
  public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E remove_head4551A5A200BB "Classifier::removeObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E remove_body4551A5A200BB "Classifier::removeObjectFlowState"
    ObjectFlowState ret=null;
    if(objectFlowState1==null || !objectFlowState.contains(objectFlowState1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = objectFlowState1;
    objectFlowState.remove(objectFlowState1);
    objectFlowState1._unlinkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeObjectFlowState"));
    return ret;
    // -end- 33CF9EFC006E remove_body4551A5A200BB "Classifier::removeObjectFlowState"
  }

  /** tests if a given ObjectFlowState is connected.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E test_head4551A5A200BB "Classifier::containsObjectFlowState"
  public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E test_head4551A5A200BB "Classifier::containsObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E test_body4551A5A200BB "Classifier::containsObjectFlowState"
    return objectFlowState.contains(objectFlowState1);
    // -end- 33CF9EFC006E test_body4551A5A200BB "Classifier::containsObjectFlowState"
  }

  /** used to enumerate all connected ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E get_all_head4551A5A200BB "Classifier::iteratorObjectFlowState"
  public java.util.Iterator iteratorObjectFlowState()
  // -end- 33CF9EFC006E get_all_head4551A5A200BB "Classifier::iteratorObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E get_all_body4551A5A200BB "Classifier::iteratorObjectFlowState"
    return objectFlowState.iterator();
    // -end- 33CF9EFC006E get_all_body4551A5A200BB "Classifier::iteratorObjectFlowState"
  }

  /** disconnect all ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E remove_all_head4551A5A200BB "Classifier::clearObjectFlowState"
  public void clearObjectFlowState()
  // -end- 33CF9EFC006E remove_all_head4551A5A200BB "Classifier::clearObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E remove_all_body4551A5A200BB "Classifier::clearObjectFlowState"
    if(sizeObjectFlowState()>0){
      for(java.util.Iterator p = objectFlowState.iterator(); p.hasNext();){
        ((ObjectFlowState)p.next())._unlinkType(this);
      }
      objectFlowState.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearObjectFlowState"));
    }
    // -end- 33CF9EFC006E remove_all_body4551A5A200BB "Classifier::clearObjectFlowState"
  }

  /** returns the number of ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E size_head4551A5A200BB "Classifier::sizeObjectFlowState"
  public int sizeObjectFlowState()
  // -end- 33CF9EFC006E size_head4551A5A200BB "Classifier::sizeObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E size_body4551A5A200BB "Classifier::sizeObjectFlowState"
    return objectFlowState.size();
    // -end- 33CF9EFC006E size_body4551A5A200BB "Classifier::sizeObjectFlowState"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006E _link_body4551A5A200BB "Classifier::_linkObjectFlowState"
  public void _linkObjectFlowState(ObjectFlowState objectFlowState1)
  {
    objectFlowState.add(objectFlowState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkObjectFlowState"));
    return;
  }
  // -end- 33CF9EFC006E _link_body4551A5A200BB "Classifier::_linkObjectFlowState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006E _unlink_body4551A5A200BB "Classifier::_unlinkObjectFlowState"
  public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1)
  {
    objectFlowState.remove(objectFlowState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkObjectFlowState"));
    return;
  }
  // -end- 33CF9EFC006E _unlink_body4551A5A200BB "Classifier::_unlinkObjectFlowState"

  // -beg- preserve=no 33CF9F1602BC code4551A5A200BB "classifierInState"
  private java.util.Set classifierInState = new java.util.HashSet();
  // -end- 33CF9F1602BC code4551A5A200BB "classifierInState"

  /** add a ClassifierInState.
   *  
   *  @see #removeClassifierInState
   *  @see #containsClassifierInState
   *  @see #iteratorClassifierInState
   *  @see #clearClassifierInState
   *  @see #sizeClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC add_head4551A5A200BB "Classifier::addClassifierInState"
  public void addClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC add_head4551A5A200BB "Classifier::addClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC add_body4551A5A200BB "Classifier::addClassifierInState"
    classifierInState.add(classifierInState1);
    classifierInState1._linkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClassifierInState"));
    return;
    // -end- 33CF9F1602BC add_body4551A5A200BB "Classifier::addClassifierInState"
  }

  /** disconnect a ClassifierInState.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC remove_head4551A5A200BB "Classifier::removeClassifierInState"
  public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC remove_head4551A5A200BB "Classifier::removeClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC remove_body4551A5A200BB "Classifier::removeClassifierInState"
    ClassifierInState ret=null;
    if(classifierInState1==null || !classifierInState.contains(classifierInState1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = classifierInState1;
    classifierInState.remove(classifierInState1);
    classifierInState1._unlinkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClassifierInState"));
    return ret;
    // -end- 33CF9F1602BC remove_body4551A5A200BB "Classifier::removeClassifierInState"
  }

  /** tests if a given ClassifierInState is connected.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC test_head4551A5A200BB "Classifier::containsClassifierInState"
  public boolean containsClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC test_head4551A5A200BB "Classifier::containsClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC test_body4551A5A200BB "Classifier::containsClassifierInState"
    return classifierInState.contains(classifierInState1);
    // -end- 33CF9F1602BC test_body4551A5A200BB "Classifier::containsClassifierInState"
  }

  /** used to enumerate all connected ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC get_all_head4551A5A200BB "Classifier::iteratorClassifierInState"
  public java.util.Iterator iteratorClassifierInState()
  // -end- 33CF9F1602BC get_all_head4551A5A200BB "Classifier::iteratorClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC get_all_body4551A5A200BB "Classifier::iteratorClassifierInState"
    return classifierInState.iterator();
    // -end- 33CF9F1602BC get_all_body4551A5A200BB "Classifier::iteratorClassifierInState"
  }

  /** disconnect all ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC remove_all_head4551A5A200BB "Classifier::clearClassifierInState"
  public void clearClassifierInState()
  // -end- 33CF9F1602BC remove_all_head4551A5A200BB "Classifier::clearClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC remove_all_body4551A5A200BB "Classifier::clearClassifierInState"
    if(sizeClassifierInState()>0){
      for(java.util.Iterator p = classifierInState.iterator(); p.hasNext();){
        ((ClassifierInState)p.next())._unlinkType(this);
      }
      classifierInState.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClassifierInState"));
    }
    // -end- 33CF9F1602BC remove_all_body4551A5A200BB "Classifier::clearClassifierInState"
  }

  /** returns the number of ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC size_head4551A5A200BB "Classifier::sizeClassifierInState"
  public int sizeClassifierInState()
  // -end- 33CF9F1602BC size_head4551A5A200BB "Classifier::sizeClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC size_body4551A5A200BB "Classifier::sizeClassifierInState"
    return classifierInState.size();
    // -end- 33CF9F1602BC size_body4551A5A200BB "Classifier::sizeClassifierInState"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F1602BC _link_body4551A5A200BB "Classifier::_linkClassifierInState"
  public void _linkClassifierInState(ClassifierInState classifierInState1)
  {
    classifierInState.add(classifierInState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassifierInState"));
    return;
  }
  // -end- 33CF9F1602BC _link_body4551A5A200BB "Classifier::_linkClassifierInState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F1602BC _unlink_body4551A5A200BB "Classifier::_unlinkClassifierInState"
  public void _unlinkClassifierInState(ClassifierInState classifierInState1)
  {
    classifierInState.remove(classifierInState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassifierInState"));
    return;
  }
  // -end- 33CF9F1602BC _unlink_body4551A5A200BB "Classifier::_unlinkClassifierInState"

  // -beg- preserve=no 36008FB700E7 code4551A5A200BB "classifierRole"

  // -end- 36008FB700E7 code4551A5A200BB "classifierRole"

  /** add a ClassifierRole.
   *  
   *  @see #removeClassifierRole
   *  @see #containsClassifierRole
   *  @see #iteratorClassifierRole
   *  @see #clearClassifierRole
   *  @see #sizeClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 add_head4551A5A200BB "ModelElement::addClassifierRole"
  public void addClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 add_head4551A5A200BB "ModelElement::addClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 add_body4551A5A200BB "ModelElement::addClassifierRole"
    super.addClassifierRole(classifierRole1);
    // -end- 36008FB700E7 add_body4551A5A200BB "ModelElement::addClassifierRole"
  }

  /** disconnect a ClassifierRole.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_head4551A5A200BB "ModelElement::removeClassifierRole"
  public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 remove_head4551A5A200BB "ModelElement::removeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_body4551A5A200BB "ModelElement::removeClassifierRole"
    return super.removeClassifierRole(classifierRole1);
    // -end- 36008FB700E7 remove_body4551A5A200BB "ModelElement::removeClassifierRole"
  }

  /** tests if a given ClassifierRole is connected.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 test_head4551A5A200BB "ModelElement::containsClassifierRole"
  public boolean containsClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 test_head4551A5A200BB "ModelElement::containsClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 test_body4551A5A200BB "ModelElement::containsClassifierRole"
    return super.containsClassifierRole(classifierRole1);
    // -end- 36008FB700E7 test_body4551A5A200BB "ModelElement::containsClassifierRole"
  }

  /** used to enumerate all connected ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 get_all_head4551A5A200BB "ModelElement::iteratorClassifierRole"
  public java.util.Iterator iteratorClassifierRole()
  // -end- 36008FB700E7 get_all_head4551A5A200BB "ModelElement::iteratorClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 get_all_body4551A5A200BB "ModelElement::iteratorClassifierRole"
    return super.iteratorClassifierRole();
    // -end- 36008FB700E7 get_all_body4551A5A200BB "ModelElement::iteratorClassifierRole"
  }

  /** disconnect all ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_all_head4551A5A200BB "ModelElement::clearClassifierRole"
  public void clearClassifierRole()
  // -end- 36008FB700E7 remove_all_head4551A5A200BB "ModelElement::clearClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_all_body4551A5A200BB "ModelElement::clearClassifierRole"
    super.clearClassifierRole();
    // -end- 36008FB700E7 remove_all_body4551A5A200BB "ModelElement::clearClassifierRole"
  }

  /** returns the number of ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 size_head4551A5A200BB "ModelElement::sizeClassifierRole"
  public int sizeClassifierRole()
  // -end- 36008FB700E7 size_head4551A5A200BB "ModelElement::sizeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 size_body4551A5A200BB "ModelElement::sizeClassifierRole"
    return super.sizeClassifierRole();
    // -end- 36008FB700E7 size_body4551A5A200BB "ModelElement::sizeClassifierRole"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _link_body4551A5A200BB "ModelElement::_linkClassifierRole"
  public void _linkClassifierRole(ClassifierRole classifierRole1)
  {
    super._linkClassifierRole(classifierRole1);
  }
  // -end- 36008FB700E7 _link_body4551A5A200BB "ModelElement::_linkClassifierRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _unlink_body4551A5A200BB "ModelElement::_unlinkClassifierRole"
  public void _unlinkClassifierRole(ClassifierRole classifierRole1)
  {
    super._unlinkClassifierRole(classifierRole1);
  }
  // -end- 36008FB700E7 _unlink_body4551A5A200BB "ModelElement::_unlinkClassifierRole"

  // -beg- preserve=no 33D1394E029F code4551A5A200BB "collaboration"

  // -end- 33D1394E029F code4551A5A200BB "collaboration"

  /** add a Collaboration.
   *  
   *  @see #removeCollaboration
   *  @see #containsCollaboration
   *  @see #iteratorCollaboration
   *  @see #clearCollaboration
   *  @see #sizeCollaboration
   */
  // -beg- preserve=no 33D1394E029F add_head4551A5A200BB "ModelElement::addCollaboration"
  public void addCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F add_head4551A5A200BB "ModelElement::addCollaboration"
  {
    // -beg- preserve=no 33D1394E029F add_body4551A5A200BB "ModelElement::addCollaboration"
    super.addCollaboration(collaboration1);
    // -end- 33D1394E029F add_body4551A5A200BB "ModelElement::addCollaboration"
  }

  /** disconnect a Collaboration.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_head4551A5A200BB "ModelElement::removeCollaboration"
  public Collaboration removeCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F remove_head4551A5A200BB "ModelElement::removeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_body4551A5A200BB "ModelElement::removeCollaboration"
    return super.removeCollaboration(collaboration1);
    // -end- 33D1394E029F remove_body4551A5A200BB "ModelElement::removeCollaboration"
  }

  /** tests if a given Collaboration is connected.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F test_head4551A5A200BB "ModelElement::containsCollaboration"
  public boolean containsCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F test_head4551A5A200BB "ModelElement::containsCollaboration"
  {
    // -beg- preserve=no 33D1394E029F test_body4551A5A200BB "ModelElement::containsCollaboration"
    return super.containsCollaboration(collaboration1);
    // -end- 33D1394E029F test_body4551A5A200BB "ModelElement::containsCollaboration"
  }

  /** used to enumerate all connected Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F get_all_head4551A5A200BB "ModelElement::iteratorCollaboration"
  public java.util.Iterator iteratorCollaboration()
  // -end- 33D1394E029F get_all_head4551A5A200BB "ModelElement::iteratorCollaboration"
  {
    // -beg- preserve=no 33D1394E029F get_all_body4551A5A200BB "ModelElement::iteratorCollaboration"
    return super.iteratorCollaboration();
    // -end- 33D1394E029F get_all_body4551A5A200BB "ModelElement::iteratorCollaboration"
  }

  /** disconnect all Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_all_head4551A5A200BB "ModelElement::clearCollaboration"
  public void clearCollaboration()
  // -end- 33D1394E029F remove_all_head4551A5A200BB "ModelElement::clearCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_all_body4551A5A200BB "ModelElement::clearCollaboration"
    super.clearCollaboration();
    // -end- 33D1394E029F remove_all_body4551A5A200BB "ModelElement::clearCollaboration"
  }

  /** returns the number of Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F size_head4551A5A200BB "ModelElement::sizeCollaboration"
  public int sizeCollaboration()
  // -end- 33D1394E029F size_head4551A5A200BB "ModelElement::sizeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F size_body4551A5A200BB "ModelElement::sizeCollaboration"
    return super.sizeCollaboration();
    // -end- 33D1394E029F size_body4551A5A200BB "ModelElement::sizeCollaboration"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _link_body4551A5A200BB "ModelElement::_linkCollaboration"
  public void _linkCollaboration(Collaboration collaboration1)
  {
    super._linkCollaboration(collaboration1);
  }
  // -end- 33D1394E029F _link_body4551A5A200BB "ModelElement::_linkCollaboration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _unlink_body4551A5A200BB "ModelElement::_unlinkCollaboration"
  public void _unlinkCollaboration(Collaboration collaboration1)
  {
    super._unlinkCollaboration(collaboration1);
  }
  // -end- 33D1394E029F _unlink_body4551A5A200BB "ModelElement::_unlinkCollaboration"

  // -beg- preserve=no 33CAD7E900AB code4551A5A200BB "instance"
  private java.util.Set instance = new java.util.HashSet();
  // -end- 33CAD7E900AB code4551A5A200BB "instance"

  /** add a Instance.
   *  
   *  @see #removeInstance
   *  @see #containsInstance
   *  @see #iteratorInstance
   *  @see #clearInstance
   *  @see #sizeInstance
   */
  // -beg- preserve=no 33CAD7E900AB add_head4551A5A200BB "Classifier::addInstance"
  public void addInstance(Instance instance1)
  // -end- 33CAD7E900AB add_head4551A5A200BB "Classifier::addInstance"
  {
    // -beg- preserve=no 33CAD7E900AB add_body4551A5A200BB "Classifier::addInstance"
    instance.add(instance1);
    instance1._linkClassifier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addInstance"));
    return;
    // -end- 33CAD7E900AB add_body4551A5A200BB "Classifier::addInstance"
  }

  /** disconnect a Instance.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB remove_head4551A5A200BB "Classifier::removeInstance"
  public Instance removeInstance(Instance instance1)
  // -end- 33CAD7E900AB remove_head4551A5A200BB "Classifier::removeInstance"
  {
    // -beg- preserve=no 33CAD7E900AB remove_body4551A5A200BB "Classifier::removeInstance"
    Instance ret=null;
    if(instance1==null || !instance.contains(instance1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = instance1;
    instance.remove(instance1);
    instance1._unlinkClassifier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeInstance"));
    return ret;
    // -end- 33CAD7E900AB remove_body4551A5A200BB "Classifier::removeInstance"
  }

  /** tests if a given Instance is connected.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB test_head4551A5A200BB "Classifier::containsInstance"
  public boolean containsInstance(Instance instance1)
  // -end- 33CAD7E900AB test_head4551A5A200BB "Classifier::containsInstance"
  {
    // -beg- preserve=no 33CAD7E900AB test_body4551A5A200BB "Classifier::containsInstance"
    return instance.contains(instance1);
    // -end- 33CAD7E900AB test_body4551A5A200BB "Classifier::containsInstance"
  }

  /** used to enumerate all connected Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB get_all_head4551A5A200BB "Classifier::iteratorInstance"
  public java.util.Iterator iteratorInstance()
  // -end- 33CAD7E900AB get_all_head4551A5A200BB "Classifier::iteratorInstance"
  {
    // -beg- preserve=no 33CAD7E900AB get_all_body4551A5A200BB "Classifier::iteratorInstance"
    return instance.iterator();
    // -end- 33CAD7E900AB get_all_body4551A5A200BB "Classifier::iteratorInstance"
  }

  /** disconnect all Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB remove_all_head4551A5A200BB "Classifier::clearInstance"
  public void clearInstance()
  // -end- 33CAD7E900AB remove_all_head4551A5A200BB "Classifier::clearInstance"
  {
    // -beg- preserve=no 33CAD7E900AB remove_all_body4551A5A200BB "Classifier::clearInstance"
    if(sizeInstance()>0){
      for(java.util.Iterator p = instance.iterator(); p.hasNext();){
        ((Instance)p.next())._unlinkClassifier(this);
      }
      instance.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearInstance"));
    }
    // -end- 33CAD7E900AB remove_all_body4551A5A200BB "Classifier::clearInstance"
  }

  /** returns the number of Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB size_head4551A5A200BB "Classifier::sizeInstance"
  public int sizeInstance()
  // -end- 33CAD7E900AB size_head4551A5A200BB "Classifier::sizeInstance"
  {
    // -beg- preserve=no 33CAD7E900AB size_body4551A5A200BB "Classifier::sizeInstance"
    return instance.size();
    // -end- 33CAD7E900AB size_body4551A5A200BB "Classifier::sizeInstance"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AB _link_body4551A5A200BB "Classifier::_linkInstance"
  public void _linkInstance(Instance instance1)
  {
    instance.add(instance1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkInstance"));
    return;
  }
  // -end- 33CAD7E900AB _link_body4551A5A200BB "Classifier::_linkInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AB _unlink_body4551A5A200BB "Classifier::_unlinkInstance"
  public void _unlinkInstance(Instance instance1)
  {
    instance.remove(instance1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkInstance"));
    return;
  }
  // -end- 33CAD7E900AB _unlink_body4551A5A200BB "Classifier::_unlinkInstance"

  // -beg- preserve=no 33CFD0A701A4 code4551A5A200BB "createAction"
  private java.util.Set createAction = new java.util.HashSet();
  // -end- 33CFD0A701A4 code4551A5A200BB "createAction"

  /** add a CreateAction.
   *  
   *  @see #removeCreateAction
   *  @see #containsCreateAction
   *  @see #iteratorCreateAction
   *  @see #clearCreateAction
   *  @see #sizeCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 add_head4551A5A200BB "Classifier::addCreateAction"
  public void addCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 add_head4551A5A200BB "Classifier::addCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 add_body4551A5A200BB "Classifier::addCreateAction"
    createAction.add(createAction1);
    createAction1._linkInstantiation(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCreateAction"));
    return;
    // -end- 33CFD0A701A4 add_body4551A5A200BB "Classifier::addCreateAction"
  }

  /** disconnect a CreateAction.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 remove_head4551A5A200BB "Classifier::removeCreateAction"
  public CreateAction removeCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 remove_head4551A5A200BB "Classifier::removeCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 remove_body4551A5A200BB "Classifier::removeCreateAction"
    CreateAction ret=null;
    if(createAction1==null || !createAction.contains(createAction1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = createAction1;
    createAction.remove(createAction1);
    createAction1._unlinkInstantiation(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCreateAction"));
    return ret;
    // -end- 33CFD0A701A4 remove_body4551A5A200BB "Classifier::removeCreateAction"
  }

  /** tests if a given CreateAction is connected.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 test_head4551A5A200BB "Classifier::containsCreateAction"
  public boolean containsCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 test_head4551A5A200BB "Classifier::containsCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 test_body4551A5A200BB "Classifier::containsCreateAction"
    return createAction.contains(createAction1);
    // -end- 33CFD0A701A4 test_body4551A5A200BB "Classifier::containsCreateAction"
  }

  /** used to enumerate all connected CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 get_all_head4551A5A200BB "Classifier::iteratorCreateAction"
  public java.util.Iterator iteratorCreateAction()
  // -end- 33CFD0A701A4 get_all_head4551A5A200BB "Classifier::iteratorCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 get_all_body4551A5A200BB "Classifier::iteratorCreateAction"
    return createAction.iterator();
    // -end- 33CFD0A701A4 get_all_body4551A5A200BB "Classifier::iteratorCreateAction"
  }

  /** disconnect all CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 remove_all_head4551A5A200BB "Classifier::clearCreateAction"
  public void clearCreateAction()
  // -end- 33CFD0A701A4 remove_all_head4551A5A200BB "Classifier::clearCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 remove_all_body4551A5A200BB "Classifier::clearCreateAction"
    if(sizeCreateAction()>0){
      for(java.util.Iterator p = createAction.iterator(); p.hasNext();){
        ((CreateAction)p.next())._unlinkInstantiation(this);
      }
      createAction.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCreateAction"));
    }
    // -end- 33CFD0A701A4 remove_all_body4551A5A200BB "Classifier::clearCreateAction"
  }

  /** returns the number of CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 size_head4551A5A200BB "Classifier::sizeCreateAction"
  public int sizeCreateAction()
  // -end- 33CFD0A701A4 size_head4551A5A200BB "Classifier::sizeCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 size_body4551A5A200BB "Classifier::sizeCreateAction"
    return createAction.size();
    // -end- 33CFD0A701A4 size_body4551A5A200BB "Classifier::sizeCreateAction"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A701A4 _link_body4551A5A200BB "Classifier::_linkCreateAction"
  public void _linkCreateAction(CreateAction createAction1)
  {
    createAction.add(createAction1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCreateAction"));
    return;
  }
  // -end- 33CFD0A701A4 _link_body4551A5A200BB "Classifier::_linkCreateAction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A701A4 _unlink_body4551A5A200BB "Classifier::_unlinkCreateAction"
  public void _unlinkCreateAction(CreateAction createAction1)
  {
    createAction.remove(createAction1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCreateAction"));
    return;
  }
  // -end- 33CFD0A701A4 _unlink_body4551A5A200BB "Classifier::_unlinkCreateAction"

  // -beg- preserve=no 32B5D7EF03D3 code4551A5A200BB "feature"
  private java.util.List feature = new java.util.ArrayList();
  // -end- 32B5D7EF03D3 code4551A5A200BB "feature"

  /** add a Feature.
   *  
   *  @see #removeFeature
   *  @see #containsFeature
   *  @see #iteratorFeature
   *  @see #clearFeature
   *  @see #sizeFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 add_head4551A5A200BB "Classifier::addFeature"
  public void addFeature(Feature feature1)
  // -end- 32B5D7EF03D3 add_head4551A5A200BB "Classifier::addFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 add_body4551A5A200BB "Classifier::addFeature"
    feature.add(feature1);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addFeature"));
    return;
    // -end- 32B5D7EF03D3 add_body4551A5A200BB "Classifier::addFeature"
  }

  // -beg- preserve=no 32B5D7EF03D3 add2_head4551A5A200BB "Classifier::add2Feature"
  public void addFeature(int index,Feature feature1)
  // -end- 32B5D7EF03D3 add2_head4551A5A200BB "Classifier::add2Feature"
  {
    // -beg- preserve=no 32B5D7EF03D3 add2_body4551A5A200BB "Classifier::add2Feature"
    feature.add(index,feature1);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addFeature"));
    return;
    // -end- 32B5D7EF03D3 add2_body4551A5A200BB "Classifier::add2Feature"
  }

  /** disconnect a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove_head4551A5A200BB "Classifier::removeFeature"
  public Feature removeFeature(Feature feature1)
  // -end- 32B5D7EF03D3 remove_head4551A5A200BB "Classifier::removeFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove_body4551A5A200BB "Classifier::removeFeature"
    Feature ret=null;
    if(feature1==null || !feature.contains(feature1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = feature1;
    feature.remove(feature1);
    feature1._unlinkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeFeature"));
    return ret;
    // -end- 32B5D7EF03D3 remove_body4551A5A200BB "Classifier::removeFeature"
  }

  /** disconnect a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove2_head4551A5A200BB "Classifier::remove2Feature"
  public Feature removeFeature(int index)
  // -end- 32B5D7EF03D3 remove2_head4551A5A200BB "Classifier::remove2Feature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove2_body4551A5A200BB "Classifier::remove2Feature"
    Feature ret=null;
    ret = (Feature)feature.remove(index);
    ret._unlinkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeFeature"));
    return ret;
    // -end- 32B5D7EF03D3 remove2_body4551A5A200BB "Classifier::remove2Feature"
  }

  /** change a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 set_head4551A5A200BB "Classifier::setFeature"
  public Feature setFeature(int index,Feature feature1)
  // -end- 32B5D7EF03D3 set_head4551A5A200BB "Classifier::setFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 set_body4551A5A200BB "Classifier::setFeature"
    Feature ret=null;
    ret = (Feature)feature.set(index,feature1);
    ret._unlinkOwner(this);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setFeature"));
    return ret;
    // -end- 32B5D7EF03D3 set_body4551A5A200BB "Classifier::setFeature"
  }

  /** tests if a given Feature is connected.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 test_head4551A5A200BB "Classifier::containsFeature"
  public boolean containsFeature(Feature feature1)
  // -end- 32B5D7EF03D3 test_head4551A5A200BB "Classifier::containsFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 test_body4551A5A200BB "Classifier::containsFeature"
    return feature.contains(feature1);
    // -end- 32B5D7EF03D3 test_body4551A5A200BB "Classifier::containsFeature"
  }

  /** used to enumerate all connected Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 get_all_head4551A5A200BB "Classifier::iteratorFeature"
  public java.util.Iterator iteratorFeature()
  // -end- 32B5D7EF03D3 get_all_head4551A5A200BB "Classifier::iteratorFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 get_all_body4551A5A200BB "Classifier::iteratorFeature"
    return feature.iterator();
    // -end- 32B5D7EF03D3 get_all_body4551A5A200BB "Classifier::iteratorFeature"
  }

  /** disconnect all Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove_all_head4551A5A200BB "Classifier::clearFeature"
  public void clearFeature()
  // -end- 32B5D7EF03D3 remove_all_head4551A5A200BB "Classifier::clearFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove_all_body4551A5A200BB "Classifier::clearFeature"
    if(sizeFeature()>0){
      for(java.util.Iterator p = feature.iterator(); p.hasNext();){
        ((Feature)p.next())._unlinkOwner(this);
      }
      feature.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearFeature"));
    }
    // -end- 32B5D7EF03D3 remove_all_body4551A5A200BB "Classifier::clearFeature"
  }

  /** returns the number of Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 size_head4551A5A200BB "Classifier::sizeFeature"
  public int sizeFeature()
  // -end- 32B5D7EF03D3 size_head4551A5A200BB "Classifier::sizeFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 size_body4551A5A200BB "Classifier::sizeFeature"
    return feature.size();
    // -end- 32B5D7EF03D3 size_body4551A5A200BB "Classifier::sizeFeature"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03D3 _link_body4551A5A200BB "Classifier::_linkFeature"
  public void _linkFeature(Feature feature1)
  {
    feature.add(feature1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkFeature"));
    return;
  }
  // -end- 32B5D7EF03D3 _link_body4551A5A200BB "Classifier::_linkFeature"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03D3 _unlink_body4551A5A200BB "Classifier::_unlinkFeature"
  public void _unlinkFeature(Feature feature1)
  {
    feature.remove(feature1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkFeature"));
    return;
  }
  // -end- 32B5D7EF03D3 _unlink_body4551A5A200BB "Classifier::_unlinkFeature"

  // -beg- preserve=no 33E265070353 code4551A5A200BB "association"
  private java.util.Set association = new java.util.HashSet();
  // -end- 33E265070353 code4551A5A200BB "association"

  /** add a Association.
   *  
   *  @see #removeAssociation
   *  @see #containsAssociation
   *  @see #iteratorAssociation
   *  @see #clearAssociation
   *  @see #sizeAssociation
   */
  // -beg- preserve=no 33E265070353 add_head4551A5A200BB "Classifier::addAssociation"
  public void addAssociation(AssociationEnd association1)
  // -end- 33E265070353 add_head4551A5A200BB "Classifier::addAssociation"
  {
    // -beg- preserve=no 33E265070353 add_body4551A5A200BB "Classifier::addAssociation"
    association.add(association1);
    association1._linkParticipant(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addAssociation"));
    return;
    // -end- 33E265070353 add_body4551A5A200BB "Classifier::addAssociation"
  }

  /** disconnect a Association.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 remove_head4551A5A200BB "Classifier::removeAssociation"
  public AssociationEnd removeAssociation(AssociationEnd association1)
  // -end- 33E265070353 remove_head4551A5A200BB "Classifier::removeAssociation"
  {
    // -beg- preserve=no 33E265070353 remove_body4551A5A200BB "Classifier::removeAssociation"
    AssociationEnd ret=null;
    if(association1==null || !association.contains(association1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = association1;
    association.remove(association1);
    association1._unlinkParticipant(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeAssociation"));
    return ret;
    // -end- 33E265070353 remove_body4551A5A200BB "Classifier::removeAssociation"
  }

  /** tests if a given Association is connected.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 test_head4551A5A200BB "Classifier::containsAssociation"
  public boolean containsAssociation(AssociationEnd association1)
  // -end- 33E265070353 test_head4551A5A200BB "Classifier::containsAssociation"
  {
    // -beg- preserve=no 33E265070353 test_body4551A5A200BB "Classifier::containsAssociation"
    return association.contains(association1);
    // -end- 33E265070353 test_body4551A5A200BB "Classifier::containsAssociation"
  }

  /** used to enumerate all connected Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 get_all_head4551A5A200BB "Classifier::iteratorAssociation"
  public java.util.Iterator iteratorAssociation()
  // -end- 33E265070353 get_all_head4551A5A200BB "Classifier::iteratorAssociation"
  {
    // -beg- preserve=no 33E265070353 get_all_body4551A5A200BB "Classifier::iteratorAssociation"
    return association.iterator();
    // -end- 33E265070353 get_all_body4551A5A200BB "Classifier::iteratorAssociation"
  }

  /** disconnect all Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 remove_all_head4551A5A200BB "Classifier::clearAssociation"
  public void clearAssociation()
  // -end- 33E265070353 remove_all_head4551A5A200BB "Classifier::clearAssociation"
  {
    // -beg- preserve=no 33E265070353 remove_all_body4551A5A200BB "Classifier::clearAssociation"
    if(sizeAssociation()>0){
      for(java.util.Iterator p = association.iterator(); p.hasNext();){
        ((AssociationEnd)p.next())._unlinkParticipant(this);
      }
      association.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearAssociation"));
    }
    // -end- 33E265070353 remove_all_body4551A5A200BB "Classifier::clearAssociation"
  }

  /** returns the number of Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 size_head4551A5A200BB "Classifier::sizeAssociation"
  public int sizeAssociation()
  // -end- 33E265070353 size_head4551A5A200BB "Classifier::sizeAssociation"
  {
    // -beg- preserve=no 33E265070353 size_body4551A5A200BB "Classifier::sizeAssociation"
    return association.size();
    // -end- 33E265070353 size_body4551A5A200BB "Classifier::sizeAssociation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070353 _link_body4551A5A200BB "Classifier::_linkAssociation"
  public void _linkAssociation(AssociationEnd association1)
  {
    association.add(association1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAssociation"));
    return;
  }
  // -end- 33E265070353 _link_body4551A5A200BB "Classifier::_linkAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070353 _unlink_body4551A5A200BB "Classifier::_unlinkAssociation"
  public void _unlinkAssociation(AssociationEnd association1)
  {
    association.remove(association1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAssociation"));
    return;
  }
  // -end- 33E265070353 _unlink_body4551A5A200BB "Classifier::_unlinkAssociation"

  // -beg- preserve=no 33F0EFAD00AB code4551A5A200BB "specifiedEnd"
  private java.util.Set specifiedEnd = new java.util.HashSet();
  // -end- 33F0EFAD00AB code4551A5A200BB "specifiedEnd"

  /** add a SpecifiedEnd.
   *  
   *  @see #removeSpecifiedEnd
   *  @see #containsSpecifiedEnd
   *  @see #iteratorSpecifiedEnd
   *  @see #clearSpecifiedEnd
   *  @see #sizeSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB add_head4551A5A200BB "Classifier::addSpecifiedEnd"
  public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB add_head4551A5A200BB "Classifier::addSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB add_body4551A5A200BB "Classifier::addSpecifiedEnd"
    specifiedEnd.add(specifiedEnd1);
    specifiedEnd1._linkSpecification(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecifiedEnd"));
    return;
    // -end- 33F0EFAD00AB add_body4551A5A200BB "Classifier::addSpecifiedEnd"
  }

  /** disconnect a SpecifiedEnd.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB remove_head4551A5A200BB "Classifier::removeSpecifiedEnd"
  public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB remove_head4551A5A200BB "Classifier::removeSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB remove_body4551A5A200BB "Classifier::removeSpecifiedEnd"
    AssociationEnd ret=null;
    if(specifiedEnd1==null || !specifiedEnd.contains(specifiedEnd1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = specifiedEnd1;
    specifiedEnd.remove(specifiedEnd1);
    specifiedEnd1._unlinkSpecification(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecifiedEnd"));
    return ret;
    // -end- 33F0EFAD00AB remove_body4551A5A200BB "Classifier::removeSpecifiedEnd"
  }

  /** tests if a given SpecifiedEnd is connected.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB test_head4551A5A200BB "Classifier::containsSpecifiedEnd"
  public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB test_head4551A5A200BB "Classifier::containsSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB test_body4551A5A200BB "Classifier::containsSpecifiedEnd"
    return specifiedEnd.contains(specifiedEnd1);
    // -end- 33F0EFAD00AB test_body4551A5A200BB "Classifier::containsSpecifiedEnd"
  }

  /** used to enumerate all connected SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB get_all_head4551A5A200BB "Classifier::iteratorSpecifiedEnd"
  public java.util.Iterator iteratorSpecifiedEnd()
  // -end- 33F0EFAD00AB get_all_head4551A5A200BB "Classifier::iteratorSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB get_all_body4551A5A200BB "Classifier::iteratorSpecifiedEnd"
    return specifiedEnd.iterator();
    // -end- 33F0EFAD00AB get_all_body4551A5A200BB "Classifier::iteratorSpecifiedEnd"
  }

  /** disconnect all SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB remove_all_head4551A5A200BB "Classifier::clearSpecifiedEnd"
  public void clearSpecifiedEnd()
  // -end- 33F0EFAD00AB remove_all_head4551A5A200BB "Classifier::clearSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB remove_all_body4551A5A200BB "Classifier::clearSpecifiedEnd"
    if(sizeSpecifiedEnd()>0){
      for(java.util.Iterator p = specifiedEnd.iterator(); p.hasNext();){
        ((AssociationEnd)p.next())._unlinkSpecification(this);
      }
      specifiedEnd.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecifiedEnd"));
    }
    // -end- 33F0EFAD00AB remove_all_body4551A5A200BB "Classifier::clearSpecifiedEnd"
  }

  /** returns the number of SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB size_head4551A5A200BB "Classifier::sizeSpecifiedEnd"
  public int sizeSpecifiedEnd()
  // -end- 33F0EFAD00AB size_head4551A5A200BB "Classifier::sizeSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB size_body4551A5A200BB "Classifier::sizeSpecifiedEnd"
    return specifiedEnd.size();
    // -end- 33F0EFAD00AB size_body4551A5A200BB "Classifier::sizeSpecifiedEnd"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AB _link_body4551A5A200BB "Classifier::_linkSpecifiedEnd"
  public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1)
  {
    specifiedEnd.add(specifiedEnd1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecifiedEnd"));
    return;
  }
  // -end- 33F0EFAD00AB _link_body4551A5A200BB "Classifier::_linkSpecifiedEnd"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AB _unlink_body4551A5A200BB "Classifier::_unlinkSpecifiedEnd"
  public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1)
  {
    specifiedEnd.remove(specifiedEnd1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecifiedEnd"));
    return;
  }
  // -end- 33F0EFAD00AB _unlink_body4551A5A200BB "Classifier::_unlinkSpecifiedEnd"

  // -beg- preserve=no 36E96A87033E code4551A5A200BB "powertypeRange"
  private java.util.Set powertypeRange = new java.util.HashSet();
  // -end- 36E96A87033E code4551A5A200BB "powertypeRange"

  /** add a PowertypeRange.
   *  
   *  @see #removePowertypeRange
   *  @see #containsPowertypeRange
   *  @see #iteratorPowertypeRange
   *  @see #clearPowertypeRange
   *  @see #sizePowertypeRange
   */
  // -beg- preserve=no 36E96A87033E add_head4551A5A200BB "Classifier::addPowertypeRange"
  public void addPowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E add_head4551A5A200BB "Classifier::addPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E add_body4551A5A200BB "Classifier::addPowertypeRange"
    powertypeRange.add(powertypeRange1);
    powertypeRange1._linkPowertype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPowertypeRange"));
    return;
    // -end- 36E96A87033E add_body4551A5A200BB "Classifier::addPowertypeRange"
  }

  /** disconnect a PowertypeRange.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E remove_head4551A5A200BB "Classifier::removePowertypeRange"
  public Generalization removePowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E remove_head4551A5A200BB "Classifier::removePowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E remove_body4551A5A200BB "Classifier::removePowertypeRange"
    Generalization ret=null;
    if(powertypeRange1==null || !powertypeRange.contains(powertypeRange1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = powertypeRange1;
    powertypeRange.remove(powertypeRange1);
    powertypeRange1._unlinkPowertype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePowertypeRange"));
    return ret;
    // -end- 36E96A87033E remove_body4551A5A200BB "Classifier::removePowertypeRange"
  }

  /** tests if a given PowertypeRange is connected.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E test_head4551A5A200BB "Classifier::containsPowertypeRange"
  public boolean containsPowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E test_head4551A5A200BB "Classifier::containsPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E test_body4551A5A200BB "Classifier::containsPowertypeRange"
    return powertypeRange.contains(powertypeRange1);
    // -end- 36E96A87033E test_body4551A5A200BB "Classifier::containsPowertypeRange"
  }

  /** used to enumerate all connected PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E get_all_head4551A5A200BB "Classifier::iteratorPowertypeRange"
  public java.util.Iterator iteratorPowertypeRange()
  // -end- 36E96A87033E get_all_head4551A5A200BB "Classifier::iteratorPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E get_all_body4551A5A200BB "Classifier::iteratorPowertypeRange"
    return powertypeRange.iterator();
    // -end- 36E96A87033E get_all_body4551A5A200BB "Classifier::iteratorPowertypeRange"
  }

  /** disconnect all PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E remove_all_head4551A5A200BB "Classifier::clearPowertypeRange"
  public void clearPowertypeRange()
  // -end- 36E96A87033E remove_all_head4551A5A200BB "Classifier::clearPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E remove_all_body4551A5A200BB "Classifier::clearPowertypeRange"
    if(sizePowertypeRange()>0){
      for(java.util.Iterator p = powertypeRange.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkPowertype(this);
      }
      powertypeRange.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPowertypeRange"));
    }
    // -end- 36E96A87033E remove_all_body4551A5A200BB "Classifier::clearPowertypeRange"
  }

  /** returns the number of PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E size_head4551A5A200BB "Classifier::sizePowertypeRange"
  public int sizePowertypeRange()
  // -end- 36E96A87033E size_head4551A5A200BB "Classifier::sizePowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E size_body4551A5A200BB "Classifier::sizePowertypeRange"
    return powertypeRange.size();
    // -end- 36E96A87033E size_body4551A5A200BB "Classifier::sizePowertypeRange"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36E96A87033E _link_body4551A5A200BB "Classifier::_linkPowertypeRange"
  public void _linkPowertypeRange(Generalization powertypeRange1)
  {
    powertypeRange.add(powertypeRange1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPowertypeRange"));
    return;
  }
  // -end- 36E96A87033E _link_body4551A5A200BB "Classifier::_linkPowertypeRange"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36E96A87033E _unlink_body4551A5A200BB "Classifier::_unlinkPowertypeRange"
  public void _unlinkPowertypeRange(Generalization powertypeRange1)
  {
    powertypeRange.remove(powertypeRange1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPowertypeRange"));
    return;
  }
  // -end- 36E96A87033E _unlink_body4551A5A200BB "Classifier::_unlinkPowertypeRange"

  // -beg- preserve=no 335C14A5019A code4551A5A200BB "generalization"
  private java.util.Set generalization = new java.util.HashSet();
  // -end- 335C14A5019A code4551A5A200BB "generalization"

  /** add a Generalization.
   *  
   *  @see #removeGeneralization
   *  @see #containsGeneralization
   *  @see #iteratorGeneralization
   *  @see #clearGeneralization
   *  @see #sizeGeneralization
   */
  // -beg- preserve=no 335C14A5019A add_head4551A5A200BB "GeneralizableElement::addGeneralization"
  public void addGeneralization(Generalization generalization1)
  // -end- 335C14A5019A add_head4551A5A200BB "GeneralizableElement::addGeneralization"
  {
    // -beg- preserve=no 335C14A5019A add_body4551A5A200BB "GeneralizableElement::addGeneralization"
    generalization.add(generalization1);
    generalization1._linkChild(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addGeneralization"));
    return;
    // -end- 335C14A5019A add_body4551A5A200BB "GeneralizableElement::addGeneralization"
  }

  /** disconnect a Generalization.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_head4551A5A200BB "GeneralizableElement::removeGeneralization"
  public Generalization removeGeneralization(Generalization generalization1)
  // -end- 335C14A5019A remove_head4551A5A200BB "GeneralizableElement::removeGeneralization"
  {
    // -beg- preserve=no 335C14A5019A remove_body4551A5A200BB "GeneralizableElement::removeGeneralization"
    Generalization ret=null;
    if(generalization1==null || !generalization.contains(generalization1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = generalization1;
    generalization.remove(generalization1);
    generalization1._unlinkChild(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeGeneralization"));
    return ret;
    // -end- 335C14A5019A remove_body4551A5A200BB "GeneralizableElement::removeGeneralization"
  }

  /** tests if a given Generalization is connected.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A test_head4551A5A200BB "GeneralizableElement::containsGeneralization"
  public boolean containsGeneralization(Generalization generalization1)
  // -end- 335C14A5019A test_head4551A5A200BB "GeneralizableElement::containsGeneralization"
  {
    // -beg- preserve=no 335C14A5019A test_body4551A5A200BB "GeneralizableElement::containsGeneralization"
    return generalization.contains(generalization1);
    // -end- 335C14A5019A test_body4551A5A200BB "GeneralizableElement::containsGeneralization"
  }

  /** used to enumerate all connected Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A get_all_head4551A5A200BB "GeneralizableElement::iteratorGeneralization"
  public java.util.Iterator iteratorGeneralization()
  // -end- 335C14A5019A get_all_head4551A5A200BB "GeneralizableElement::iteratorGeneralization"
  {
    // -beg- preserve=no 335C14A5019A get_all_body4551A5A200BB "GeneralizableElement::iteratorGeneralization"
    return generalization.iterator();
    // -end- 335C14A5019A get_all_body4551A5A200BB "GeneralizableElement::iteratorGeneralization"
  }

  /** disconnect all Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_all_head4551A5A200BB "GeneralizableElement::clearGeneralization"
  public void clearGeneralization()
  // -end- 335C14A5019A remove_all_head4551A5A200BB "GeneralizableElement::clearGeneralization"
  {
    // -beg- preserve=no 335C14A5019A remove_all_body4551A5A200BB "GeneralizableElement::clearGeneralization"
    if(sizeGeneralization()>0){
      for(java.util.Iterator p = generalization.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkChild(this);
      }
      generalization.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearGeneralization"));
    }
    // -end- 335C14A5019A remove_all_body4551A5A200BB "GeneralizableElement::clearGeneralization"
  }

  /** returns the number of Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A size_head4551A5A200BB "GeneralizableElement::sizeGeneralization"
  public int sizeGeneralization()
  // -end- 335C14A5019A size_head4551A5A200BB "GeneralizableElement::sizeGeneralization"
  {
    // -beg- preserve=no 335C14A5019A size_body4551A5A200BB "GeneralizableElement::sizeGeneralization"
    return generalization.size();
    // -end- 335C14A5019A size_body4551A5A200BB "GeneralizableElement::sizeGeneralization"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _link_body4551A5A200BB "GeneralizableElement::_linkGeneralization"
  public void _linkGeneralization(Generalization generalization1)
  {
    generalization.add(generalization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkGeneralization"));
    return;
  }
  // -end- 335C14A5019A _link_body4551A5A200BB "GeneralizableElement::_linkGeneralization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _unlink_body4551A5A200BB "GeneralizableElement::_unlinkGeneralization"
  public void _unlinkGeneralization(Generalization generalization1)
  {
    generalization.remove(generalization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkGeneralization"));
    return;
  }
  // -end- 335C14A5019A _unlink_body4551A5A200BB "GeneralizableElement::_unlinkGeneralization"

  // -beg- preserve=no 335C146B01D6 code4551A5A200BB "specialization"
  private java.util.Set specialization = new java.util.HashSet();
  // -end- 335C146B01D6 code4551A5A200BB "specialization"

  /** add a Specialization.
   *  
   *  @see #removeSpecialization
   *  @see #containsSpecialization
   *  @see #iteratorSpecialization
   *  @see #clearSpecialization
   *  @see #sizeSpecialization
   */
  // -beg- preserve=no 335C146B01D6 add_head4551A5A200BB "GeneralizableElement::addSpecialization"
  public void addSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 add_head4551A5A200BB "GeneralizableElement::addSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 add_body4551A5A200BB "GeneralizableElement::addSpecialization"
    specialization.add(specialization1);
    specialization1._linkParent(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecialization"));
    return;
    // -end- 335C146B01D6 add_body4551A5A200BB "GeneralizableElement::addSpecialization"
  }

  /** disconnect a Specialization.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_head4551A5A200BB "GeneralizableElement::removeSpecialization"
  public Generalization removeSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 remove_head4551A5A200BB "GeneralizableElement::removeSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 remove_body4551A5A200BB "GeneralizableElement::removeSpecialization"
    Generalization ret=null;
    if(specialization1==null || !specialization.contains(specialization1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = specialization1;
    specialization.remove(specialization1);
    specialization1._unlinkParent(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecialization"));
    return ret;
    // -end- 335C146B01D6 remove_body4551A5A200BB "GeneralizableElement::removeSpecialization"
  }

  /** tests if a given Specialization is connected.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 test_head4551A5A200BB "GeneralizableElement::containsSpecialization"
  public boolean containsSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 test_head4551A5A200BB "GeneralizableElement::containsSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 test_body4551A5A200BB "GeneralizableElement::containsSpecialization"
    return specialization.contains(specialization1);
    // -end- 335C146B01D6 test_body4551A5A200BB "GeneralizableElement::containsSpecialization"
  }

  /** used to enumerate all connected Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 get_all_head4551A5A200BB "GeneralizableElement::iteratorSpecialization"
  public java.util.Iterator iteratorSpecialization()
  // -end- 335C146B01D6 get_all_head4551A5A200BB "GeneralizableElement::iteratorSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 get_all_body4551A5A200BB "GeneralizableElement::iteratorSpecialization"
    return specialization.iterator();
    // -end- 335C146B01D6 get_all_body4551A5A200BB "GeneralizableElement::iteratorSpecialization"
  }

  /** disconnect all Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_all_head4551A5A200BB "GeneralizableElement::clearSpecialization"
  public void clearSpecialization()
  // -end- 335C146B01D6 remove_all_head4551A5A200BB "GeneralizableElement::clearSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 remove_all_body4551A5A200BB "GeneralizableElement::clearSpecialization"
    if(sizeSpecialization()>0){
      for(java.util.Iterator p = specialization.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkParent(this);
      }
      specialization.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecialization"));
    }
    // -end- 335C146B01D6 remove_all_body4551A5A200BB "GeneralizableElement::clearSpecialization"
  }

  /** returns the number of Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 size_head4551A5A200BB "GeneralizableElement::sizeSpecialization"
  public int sizeSpecialization()
  // -end- 335C146B01D6 size_head4551A5A200BB "GeneralizableElement::sizeSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 size_body4551A5A200BB "GeneralizableElement::sizeSpecialization"
    return specialization.size();
    // -end- 335C146B01D6 size_body4551A5A200BB "GeneralizableElement::sizeSpecialization"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _link_body4551A5A200BB "GeneralizableElement::_linkSpecialization"
  public void _linkSpecialization(Generalization specialization1)
  {
    specialization.add(specialization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecialization"));
    return;
  }
  // -end- 335C146B01D6 _link_body4551A5A200BB "GeneralizableElement::_linkSpecialization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _unlink_body4551A5A200BB "GeneralizableElement::_unlinkSpecialization"
  public void _unlinkSpecialization(Generalization specialization1)
  {
    specialization.remove(specialization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecialization"));
    return;
  }
  // -end- 335C146B01D6 _unlink_body4551A5A200BB "GeneralizableElement::_unlinkSpecialization"

  // -beg- preserve=no 327A877801CC var4551A5A200BB "isRoot"
  private boolean isRoot;
  // -end- 327A877801CC var4551A5A200BB "isRoot"

  /** get current value of isRoot
   *  @see #setRoot
   */
  // -beg- preserve=no 327A877801CC get_head4551A5A200BB "isRoot"
  public  boolean isRoot()
  // -end- 327A877801CC get_head4551A5A200BB "isRoot"
  {
    // -beg- preserve=no 327A877801CC get_body4551A5A200BB "isRoot"
    return isRoot;
    // -end- 327A877801CC get_body4551A5A200BB "isRoot"
  }

  /** set current value of isRoot
   *  @see #isRoot
   */
  // -beg- preserve=no 327A877801CC set_head4551A5A200BB "isRoot"
  public  void setRoot(boolean value1)
  // -end- 327A877801CC set_head4551A5A200BB "isRoot"
  {
    // -beg- preserve=no 327A877801CC set_body4551A5A200BB "isRoot"
    if(isRoot != value1){
      isRoot = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRoot"));
    }
    // -end- 327A877801CC set_body4551A5A200BB "isRoot"
  }

  // -beg- preserve=no 327A877E006E var4551A5A200BB "isLeaf"
  private boolean isLeaf;
  // -end- 327A877E006E var4551A5A200BB "isLeaf"

  /** get current value of isLeaf
   *  @see #setLeaf
   */
  // -beg- preserve=no 327A877E006E get_head4551A5A200BB "isLeaf"
  public  boolean isLeaf()
  // -end- 327A877E006E get_head4551A5A200BB "isLeaf"
  {
    // -beg- preserve=no 327A877E006E get_body4551A5A200BB "isLeaf"
    return isLeaf;
    // -end- 327A877E006E get_body4551A5A200BB "isLeaf"
  }

  /** set current value of isLeaf
   *  @see #isLeaf
   */
  // -beg- preserve=no 327A877E006E set_head4551A5A200BB "isLeaf"
  public  void setLeaf(boolean value1)
  // -end- 327A877E006E set_head4551A5A200BB "isLeaf"
  {
    // -beg- preserve=no 327A877E006E set_body4551A5A200BB "isLeaf"
    if(isLeaf != value1){
      isLeaf = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLeaf"));
    }
    // -end- 327A877E006E set_body4551A5A200BB "isLeaf"
  }

  // -beg- preserve=no 327A878400D2 var4551A5A200BB "isAbstract"
  private boolean isAbstract;
  // -end- 327A878400D2 var4551A5A200BB "isAbstract"

  /** get current value of isAbstract
   *  @see #setAbstract
   */
  // -beg- preserve=no 327A878400D2 get_head4551A5A200BB "isAbstract"
  public  boolean isAbstract()
  // -end- 327A878400D2 get_head4551A5A200BB "isAbstract"
  {
    // -beg- preserve=no 327A878400D2 get_body4551A5A200BB "isAbstract"
    return isAbstract;
    // -end- 327A878400D2 get_body4551A5A200BB "isAbstract"
  }

  /** set current value of isAbstract
   *  @see #isAbstract
   */
  // -beg- preserve=no 327A878400D2 set_head4551A5A200BB "isAbstract"
  public  void setAbstract(boolean value1)
  // -end- 327A878400D2 set_head4551A5A200BB "isAbstract"
  {
    // -beg- preserve=no 327A878400D2 set_body4551A5A200BB "isAbstract"
    if(isAbstract != value1){
      isAbstract = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
    }
    // -end- 327A878400D2 set_body4551A5A200BB "isAbstract"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4551A5A200BB detail_end "UmlActor"

  // -end- 4551A5A200BB detail_end "UmlActor"

}

=======
/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlActor extends AbstractNamespace implements Actor {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551A5A200BB detail_begin "UmlActor"

	// -end- 4551A5A200BB detail_begin "UmlActor"

	private static final long serialVersionUID = -4119387238425414775L;

	// -beg- preserve=no 4551A85800F6 head4551A5A200BB "unlinkAll"
	public void unlinkAll()
	// -end- 4551A85800F6 head4551A5A200BB "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551A85800F6 throws4551A5A200BB "unlinkAll"

	// -end- 4551A85800F6 throws4551A5A200BB "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551A85800F6 body4551A5A200BB "unlinkAll"

		clearObjectFlowState();
		clearClassifierInState();
		clearClassifierRole();
		clearCollaboration();
		clearInstance();
		clearCreateAction();
		clearFeature();
		// Role TypedFeature: StructuralFeature object(s) may point to this
		// Role TypedParameter: Parameter object(s) may point to this
		clearAssociation();
		clearSpecifiedEnd();
		clearPowertypeRange();
		clearGeneralization();
		clearSpecialization();
		clearOwnedElement();
		clearDiagram();
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
		// Role ParameterDefinition: TemplateParameter object(s) may point to
		// this
		clearStereotype();
		clearReferenceTag();
		clearImportedBy();
		// Role EditorTreeElement: EditorTreeElement object(s) may point to this
		setName(null);
		setMetaAttrb(null);
		setMetaName(null);
		setMetaMsg(null);
		setDocumentation(null);
		super.unlinkAll();
		// -end- 4551A85800F6 body4551A5A200BB "unlinkAll"
	}

	// -beg- preserve=no 4551A85C008D head4551A5A200BB "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 4551A85C008D head4551A5A200BB "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551A85C008D throws4551A5A200BB "enumerateChildren"

	// -end- 4551A85C008D throws4551A5A200BB "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551A85C008D body4551A5A200BB "enumerateChildren"
		Iterator<?> it = null;
		it = iteratorFeature();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorOwnedElement();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorDiagram();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorBehavior();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTaggedValue();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTemplateParameter();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getName());
		visitor.visit(getMetaAttrb());
		visitor.visit(getMetaName());
		visitor.visit(getMetaMsg());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 4551A85C008D body4551A5A200BB "enumerateChildren"
	}

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 4551F6E703A0 head4551A5A200BB "getValidOwnedElements"
	public String[] getValidOwnedElements()
	// -end- 4551F6E703A0 head4551A5A200BB "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551F6E703A0 throws4551A5A200BB "getValidOwnedElements"

	// -end- 4551F6E703A0 throws4551A5A200BB "getValidOwnedElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551F6E703A0 body4551A5A200BB
		// "getValidOwnedElements"
		return null;
		// -end- 4551F6E703A0 body4551A5A200BB "getValidOwnedElements"
	}

	/**
	 * tests if this Classifier contains a Feature with the given name
	 */
	// -beg- preserve=no 3CB2C64E0374 head4551A5A200BB "containsFeature"
	public boolean containsFeature(String name)
	// -end- 3CB2C64E0374 head4551A5A200BB "containsFeature"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CB2C64E0374 throws4551A5A200BB "containsFeature"

	// -end- 3CB2C64E0374 throws4551A5A200BB "containsFeature"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CB2C64E0374 body4551A5A200BB "containsFeature"
		Iterator<?> it = iteratorFeature();
		while (it.hasNext()) {
			ModelElement ele = (ModelElement) it.next();
			if (ele.getDefLangName().equals(name)) {
				return true;
			}
		}
		return false;
		// -end- 3CB2C64E0374 body4551A5A200BB "containsFeature"
	}

	// -beg- preserve=no 33CF9EFC006E code4551A5A200BB "objectFlowState"
	private Set<ObjectFlowState> objectFlowState = new HashSet<ObjectFlowState>();
	// -end- 33CF9EFC006E code4551A5A200BB "objectFlowState"

	/**
	 * add a ObjectFlowState.
	 *
	 * @see #removeObjectFlowState
	 * @see #containsObjectFlowState
	 * @see #iteratorObjectFlowState
	 * @see #clearObjectFlowState
	 * @see #sizeObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E add_head4551A5A200BB
	// "Classifier::addObjectFlowState"
	public void addObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E add_head4551A5A200BB "Classifier::addObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E add_body4551A5A200BB
		// "Classifier::addObjectFlowState"
		objectFlowState.add(objectFlowState1);
		objectFlowState1._linkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addObjectFlowState"));
		return;
		// -end- 33CF9EFC006E add_body4551A5A200BB
		// "Classifier::addObjectFlowState"
	}

	/**
	 * disconnect a ObjectFlowState.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_head4551A5A200BB
	// "Classifier::removeObjectFlowState"
	public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E remove_head4551A5A200BB
	// "Classifier::removeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_body4551A5A200BB
		// "Classifier::removeObjectFlowState"
		ObjectFlowState ret = null;
		if (objectFlowState1 == null || !objectFlowState.contains(objectFlowState1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = objectFlowState1;
		objectFlowState.remove(objectFlowState1);
		objectFlowState1._unlinkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeObjectFlowState"));
		return ret;
		// -end- 33CF9EFC006E remove_body4551A5A200BB
		// "Classifier::removeObjectFlowState"
	}

	/**
	 * tests if a given ObjectFlowState is connected.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E test_head4551A5A200BB
	// "Classifier::containsObjectFlowState"
	public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E test_head4551A5A200BB
	// "Classifier::containsObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E test_body4551A5A200BB
		// "Classifier::containsObjectFlowState"
		return objectFlowState.contains(objectFlowState1);
		// -end- 33CF9EFC006E test_body4551A5A200BB
		// "Classifier::containsObjectFlowState"
	}

	/**
	 * used to enumerate all connected ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E get_all_head4551A5A200BB
	// "Classifier::iteratorObjectFlowState"
	public Iterator<?> iteratorObjectFlowState()
	// -end- 33CF9EFC006E get_all_head4551A5A200BB
	// "Classifier::iteratorObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E get_all_body4551A5A200BB
		// "Classifier::iteratorObjectFlowState"
		return objectFlowState.iterator();
		// -end- 33CF9EFC006E get_all_body4551A5A200BB
		// "Classifier::iteratorObjectFlowState"
	}

	/**
	 * disconnect all ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_all_head4551A5A200BB
	// "Classifier::clearObjectFlowState"
	public void clearObjectFlowState()
	// -end- 33CF9EFC006E remove_all_head4551A5A200BB
	// "Classifier::clearObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_all_body4551A5A200BB
		// "Classifier::clearObjectFlowState"
		if (sizeObjectFlowState() > 0) {
			for (Iterator<?> p = objectFlowState.iterator(); p.hasNext();) {
				((ObjectFlowState) p.next())._unlinkType(this);
			}
			objectFlowState.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearObjectFlowState"));
		}
		// -end- 33CF9EFC006E remove_all_body4551A5A200BB
		// "Classifier::clearObjectFlowState"
	}

	/**
	 * returns the number of ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E size_head4551A5A200BB
	// "Classifier::sizeObjectFlowState"
	public int sizeObjectFlowState()
	// -end- 33CF9EFC006E size_head4551A5A200BB
	// "Classifier::sizeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E size_body4551A5A200BB
		// "Classifier::sizeObjectFlowState"
		return objectFlowState.size();
		// -end- 33CF9EFC006E size_body4551A5A200BB
		// "Classifier::sizeObjectFlowState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _link_body4551A5A200BB
	// "Classifier::_linkObjectFlowState"
	public void _linkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.add(objectFlowState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkObjectFlowState"));
		return;
	}
	// -end- 33CF9EFC006E _link_body4551A5A200BB
	// "Classifier::_linkObjectFlowState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _unlink_body4551A5A200BB
	// "Classifier::_unlinkObjectFlowState"
	public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.remove(objectFlowState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkObjectFlowState"));
		return;
	}
	// -end- 33CF9EFC006E _unlink_body4551A5A200BB
	// "Classifier::_unlinkObjectFlowState"

	// -beg- preserve=no 33CF9F1602BC code4551A5A200BB "classifierInState"
	private Set<ClassifierInState> classifierInState = new HashSet<ClassifierInState>();
	// -end- 33CF9F1602BC code4551A5A200BB "classifierInState"

	/**
	 * add a ClassifierInState.
	 *
	 * @see #removeClassifierInState
	 * @see #containsClassifierInState
	 * @see #iteratorClassifierInState
	 * @see #clearClassifierInState
	 * @see #sizeClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC add_head4551A5A200BB
	// "Classifier::addClassifierInState"
	public void addClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC add_head4551A5A200BB
	// "Classifier::addClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC add_body4551A5A200BB
		// "Classifier::addClassifierInState"
		classifierInState.add(classifierInState1);
		classifierInState1._linkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addClassifierInState"));
		return;
		// -end- 33CF9F1602BC add_body4551A5A200BB
		// "Classifier::addClassifierInState"
	}

	/**
	 * disconnect a ClassifierInState.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_head4551A5A200BB
	// "Classifier::removeClassifierInState"
	public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC remove_head4551A5A200BB
	// "Classifier::removeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_body4551A5A200BB
		// "Classifier::removeClassifierInState"
		ClassifierInState ret = null;
		if (classifierInState1 == null || !classifierInState.contains(classifierInState1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = classifierInState1;
		classifierInState.remove(classifierInState1);
		classifierInState1._unlinkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeClassifierInState"));
		return ret;
		// -end- 33CF9F1602BC remove_body4551A5A200BB
		// "Classifier::removeClassifierInState"
	}

	/**
	 * tests if a given ClassifierInState is connected.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC test_head4551A5A200BB
	// "Classifier::containsClassifierInState"
	public boolean containsClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC test_head4551A5A200BB
	// "Classifier::containsClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC test_body4551A5A200BB
		// "Classifier::containsClassifierInState"
		return classifierInState.contains(classifierInState1);
		// -end- 33CF9F1602BC test_body4551A5A200BB
		// "Classifier::containsClassifierInState"
	}

	/**
	 * used to enumerate all connected ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC get_all_head4551A5A200BB
	// "Classifier::iteratorClassifierInState"
	public Iterator<?> iteratorClassifierInState()
	// -end- 33CF9F1602BC get_all_head4551A5A200BB
	// "Classifier::iteratorClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC get_all_body4551A5A200BB
		// "Classifier::iteratorClassifierInState"
		return classifierInState.iterator();
		// -end- 33CF9F1602BC get_all_body4551A5A200BB
		// "Classifier::iteratorClassifierInState"
	}

	/**
	 * disconnect all ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_all_head4551A5A200BB
	// "Classifier::clearClassifierInState"
	public void clearClassifierInState()
	// -end- 33CF9F1602BC remove_all_head4551A5A200BB
	// "Classifier::clearClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_all_body4551A5A200BB
		// "Classifier::clearClassifierInState"
		if (sizeClassifierInState() > 0) {
			for (Iterator<?> p = classifierInState.iterator(); p.hasNext();) {
				((ClassifierInState) p.next())._unlinkType(this);
			}
			classifierInState.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearClassifierInState"));
		}
		// -end- 33CF9F1602BC remove_all_body4551A5A200BB
		// "Classifier::clearClassifierInState"
	}

	/**
	 * returns the number of ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC size_head4551A5A200BB
	// "Classifier::sizeClassifierInState"
	public int sizeClassifierInState()
	// -end- 33CF9F1602BC size_head4551A5A200BB
	// "Classifier::sizeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC size_body4551A5A200BB
		// "Classifier::sizeClassifierInState"
		return classifierInState.size();
		// -end- 33CF9F1602BC size_body4551A5A200BB
		// "Classifier::sizeClassifierInState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _link_body4551A5A200BB
	// "Classifier::_linkClassifierInState"
	public void _linkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.add(classifierInState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkClassifierInState"));
		return;
	}
	// -end- 33CF9F1602BC _link_body4551A5A200BB
	// "Classifier::_linkClassifierInState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _unlink_body4551A5A200BB
	// "Classifier::_unlinkClassifierInState"
	public void _unlinkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.remove(classifierInState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkClassifierInState"));
		return;
	}
	// -end- 33CF9F1602BC _unlink_body4551A5A200BB
	// "Classifier::_unlinkClassifierInState"

	// -beg- preserve=no 36008FB700E7 code4551A5A200BB "classifierRole"

	// -end- 36008FB700E7 code4551A5A200BB "classifierRole"

	/**
	 * add a ClassifierRole.
	 *
	 * @see #removeClassifierRole
	 * @see #containsClassifierRole
	 * @see #iteratorClassifierRole
	 * @see #clearClassifierRole
	 * @see #sizeClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 add_head4551A5A200BB
	// "ModelElement::addClassifierRole"
	public void addClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 add_head4551A5A200BB "ModelElement::addClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 add_body4551A5A200BB
		// "ModelElement::addClassifierRole"
		super.addClassifierRole(classifierRole1);
		// -end- 36008FB700E7 add_body4551A5A200BB
		// "ModelElement::addClassifierRole"
	}

	/**
	 * disconnect a ClassifierRole.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_head4551A5A200BB
	// "ModelElement::removeClassifierRole"
	public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 remove_head4551A5A200BB
	// "ModelElement::removeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_body4551A5A200BB
		// "ModelElement::removeClassifierRole"
		return super.removeClassifierRole(classifierRole1);
		// -end- 36008FB700E7 remove_body4551A5A200BB
		// "ModelElement::removeClassifierRole"
	}

	/**
	 * tests if a given ClassifierRole is connected.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 test_head4551A5A200BB
	// "ModelElement::containsClassifierRole"
	public boolean containsClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 test_head4551A5A200BB
	// "ModelElement::containsClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 test_body4551A5A200BB
		// "ModelElement::containsClassifierRole"
		return super.containsClassifierRole(classifierRole1);
		// -end- 36008FB700E7 test_body4551A5A200BB
		// "ModelElement::containsClassifierRole"
	}

	/**
	 * used to enumerate all connected ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 get_all_head4551A5A200BB
	// "ModelElement::iteratorClassifierRole"
	public Iterator iteratorClassifierRole()
	// -end- 36008FB700E7 get_all_head4551A5A200BB
	// "ModelElement::iteratorClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 get_all_body4551A5A200BB
		// "ModelElement::iteratorClassifierRole"
		return super.iteratorClassifierRole();
		// -end- 36008FB700E7 get_all_body4551A5A200BB
		// "ModelElement::iteratorClassifierRole"
	}

	/**
	 * disconnect all ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_all_head4551A5A200BB
	// "ModelElement::clearClassifierRole"
	public void clearClassifierRole()
	// -end- 36008FB700E7 remove_all_head4551A5A200BB
	// "ModelElement::clearClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_all_body4551A5A200BB
		// "ModelElement::clearClassifierRole"
		super.clearClassifierRole();
		// -end- 36008FB700E7 remove_all_body4551A5A200BB
		// "ModelElement::clearClassifierRole"
	}

	/**
	 * returns the number of ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 size_head4551A5A200BB
	// "ModelElement::sizeClassifierRole"
	public int sizeClassifierRole()
	// -end- 36008FB700E7 size_head4551A5A200BB
	// "ModelElement::sizeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 size_body4551A5A200BB
		// "ModelElement::sizeClassifierRole"
		return super.sizeClassifierRole();
		// -end- 36008FB700E7 size_body4551A5A200BB
		// "ModelElement::sizeClassifierRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _link_body4551A5A200BB
	// "ModelElement::_linkClassifierRole"
	public void _linkClassifierRole(ClassifierRole classifierRole1) {
		super._linkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _link_body4551A5A200BB
	// "ModelElement::_linkClassifierRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _unlink_body4551A5A200BB
	// "ModelElement::_unlinkClassifierRole"
	public void _unlinkClassifierRole(ClassifierRole classifierRole1) {
		super._unlinkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _unlink_body4551A5A200BB
	// "ModelElement::_unlinkClassifierRole"

	// -beg- preserve=no 33D1394E029F code4551A5A200BB "collaboration"

	// -end- 33D1394E029F code4551A5A200BB "collaboration"

	/**
	 * add a Collaboration.
	 *
	 * @see #removeCollaboration
	 * @see #containsCollaboration
	 * @see #iteratorCollaboration
	 * @see #clearCollaboration
	 * @see #sizeCollaboration
	 */
	// -beg- preserve=no 33D1394E029F add_head4551A5A200BB
	// "ModelElement::addCollaboration"
	public void addCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F add_head4551A5A200BB "ModelElement::addCollaboration"
	{
		// -beg- preserve=no 33D1394E029F add_body4551A5A200BB
		// "ModelElement::addCollaboration"
		super.addCollaboration(collaboration1);
		// -end- 33D1394E029F add_body4551A5A200BB
		// "ModelElement::addCollaboration"
	}

	/**
	 * disconnect a Collaboration.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_head4551A5A200BB
	// "ModelElement::removeCollaboration"
	public Collaboration removeCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F remove_head4551A5A200BB
	// "ModelElement::removeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_body4551A5A200BB
		// "ModelElement::removeCollaboration"
		return super.removeCollaboration(collaboration1);
		// -end- 33D1394E029F remove_body4551A5A200BB
		// "ModelElement::removeCollaboration"
	}

	/**
	 * tests if a given Collaboration is connected.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F test_head4551A5A200BB
	// "ModelElement::containsCollaboration"
	public boolean containsCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F test_head4551A5A200BB
	// "ModelElement::containsCollaboration"
	{
		// -beg- preserve=no 33D1394E029F test_body4551A5A200BB
		// "ModelElement::containsCollaboration"
		return super.containsCollaboration(collaboration1);
		// -end- 33D1394E029F test_body4551A5A200BB
		// "ModelElement::containsCollaboration"
	}

	/**
	 * used to enumerate all connected Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F get_all_head4551A5A200BB
	// "ModelElement::iteratorCollaboration"
	
	public Iterator iteratorCollaboration()
	// -end- 33D1394E029F get_all_head4551A5A200BB
	// "ModelElement::iteratorCollaboration"
	{
		// -beg- preserve=no 33D1394E029F get_all_body4551A5A200BB
		// "ModelElement::iteratorCollaboration"
		return super.iteratorCollaboration();
		// -end- 33D1394E029F get_all_body4551A5A200BB
		// "ModelElement::iteratorCollaboration"
	}

	/**
	 * disconnect all Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_all_head4551A5A200BB
	// "ModelElement::clearCollaboration"
	public void clearCollaboration()
	// -end- 33D1394E029F remove_all_head4551A5A200BB
	// "ModelElement::clearCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_all_body4551A5A200BB
		// "ModelElement::clearCollaboration"
		super.clearCollaboration();
		// -end- 33D1394E029F remove_all_body4551A5A200BB
		// "ModelElement::clearCollaboration"
	}

	/**
	 * returns the number of Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F size_head4551A5A200BB
	// "ModelElement::sizeCollaboration"
	public int sizeCollaboration()
	// -end- 33D1394E029F size_head4551A5A200BB
	// "ModelElement::sizeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F size_body4551A5A200BB
		// "ModelElement::sizeCollaboration"
		return super.sizeCollaboration();
		// -end- 33D1394E029F size_body4551A5A200BB
		// "ModelElement::sizeCollaboration"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _link_body4551A5A200BB
	// "ModelElement::_linkCollaboration"
	public void _linkCollaboration(Collaboration collaboration1) {
		super._linkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _link_body4551A5A200BB
	// "ModelElement::_linkCollaboration"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _unlink_body4551A5A200BB
	// "ModelElement::_unlinkCollaboration"
	public void _unlinkCollaboration(Collaboration collaboration1) {
		super._unlinkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _unlink_body4551A5A200BB
	// "ModelElement::_unlinkCollaboration"

	// -beg- preserve=no 33CAD7E900AB code4551A5A200BB "instance"
	private Set<Instance> instance = new HashSet<Instance>();
	// -end- 33CAD7E900AB code4551A5A200BB "instance"

	/**
	 * add a Instance.
	 *
	 * @see #removeInstance
	 * @see #containsInstance
	 * @see #iteratorInstance
	 * @see #clearInstance
	 * @see #sizeInstance
	 */
	// -beg- preserve=no 33CAD7E900AB add_head4551A5A200BB
	// "Classifier::addInstance"
	public void addInstance(Instance instance1)
	// -end- 33CAD7E900AB add_head4551A5A200BB "Classifier::addInstance"
	{
		// -beg- preserve=no 33CAD7E900AB add_body4551A5A200BB
		// "Classifier::addInstance"
		instance.add(instance1);
		instance1._linkClassifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addInstance"));
		return;
		// -end- 33CAD7E900AB add_body4551A5A200BB "Classifier::addInstance"
	}

	/**
	 * disconnect a Instance.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_head4551A5A200BB
	// "Classifier::removeInstance"
	public Instance removeInstance(Instance instance1)
	// -end- 33CAD7E900AB remove_head4551A5A200BB "Classifier::removeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_body4551A5A200BB
		// "Classifier::removeInstance"
		Instance ret = null;
		if (instance1 == null || !instance.contains(instance1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = instance1;
		instance.remove(instance1);
		instance1._unlinkClassifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeInstance"));
		return ret;
		// -end- 33CAD7E900AB remove_body4551A5A200BB
		// "Classifier::removeInstance"
	}

	/**
	 * tests if a given Instance is connected.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB test_head4551A5A200BB
	// "Classifier::containsInstance"
	public boolean containsInstance(Instance instance1)
	// -end- 33CAD7E900AB test_head4551A5A200BB "Classifier::containsInstance"
	{
		// -beg- preserve=no 33CAD7E900AB test_body4551A5A200BB
		// "Classifier::containsInstance"
		return instance.contains(instance1);
		// -end- 33CAD7E900AB test_body4551A5A200BB
		// "Classifier::containsInstance"
	}

	/**
	 * used to enumerate all connected Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB get_all_head4551A5A200BB
	// "Classifier::iteratorInstance"
	public Iterator<?> iteratorInstance()
	// -end- 33CAD7E900AB get_all_head4551A5A200BB
	// "Classifier::iteratorInstance"
	{
		// -beg- preserve=no 33CAD7E900AB get_all_body4551A5A200BB
		// "Classifier::iteratorInstance"
		return instance.iterator();
		// -end- 33CAD7E900AB get_all_body4551A5A200BB
		// "Classifier::iteratorInstance"
	}

	/**
	 * disconnect all Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_all_head4551A5A200BB
	// "Classifier::clearInstance"
	public void clearInstance()
	// -end- 33CAD7E900AB remove_all_head4551A5A200BB
	// "Classifier::clearInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_all_body4551A5A200BB
		// "Classifier::clearInstance"
		if (sizeInstance() > 0) {
			for (Iterator<?> p = instance.iterator(); p.hasNext();) {
				((Instance) p.next())._unlinkClassifier(this);
			}
			instance.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearInstance"));
		}
		// -end- 33CAD7E900AB remove_all_body4551A5A200BB
		// "Classifier::clearInstance"
	}

	/**
	 * returns the number of Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB size_head4551A5A200BB
	// "Classifier::sizeInstance"
	public int sizeInstance()
	// -end- 33CAD7E900AB size_head4551A5A200BB "Classifier::sizeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB size_body4551A5A200BB
		// "Classifier::sizeInstance"
		return instance.size();
		// -end- 33CAD7E900AB size_body4551A5A200BB "Classifier::sizeInstance"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _link_body4551A5A200BB
	// "Classifier::_linkInstance"
	public void _linkInstance(Instance instance1) {
		instance.add(instance1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkInstance"));
		return;
	}
	// -end- 33CAD7E900AB _link_body4551A5A200BB "Classifier::_linkInstance"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _unlink_body4551A5A200BB
	// "Classifier::_unlinkInstance"
	public void _unlinkInstance(Instance instance1) {
		instance.remove(instance1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkInstance"));
		return;
	}
	// -end- 33CAD7E900AB _unlink_body4551A5A200BB "Classifier::_unlinkInstance"

	// -beg- preserve=no 33CFD0A701A4 code4551A5A200BB "createAction"
	private Set<CreateAction> createAction = new HashSet<CreateAction>();
	// -end- 33CFD0A701A4 code4551A5A200BB "createAction"

	/**
	 * add a CreateAction.
	 *
	 * @see #removeCreateAction
	 * @see #containsCreateAction
	 * @see #iteratorCreateAction
	 * @see #clearCreateAction
	 * @see #sizeCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 add_head4551A5A200BB
	// "Classifier::addCreateAction"
	public void addCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 add_head4551A5A200BB "Classifier::addCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 add_body4551A5A200BB
		// "Classifier::addCreateAction"
		createAction.add(createAction1);
		createAction1._linkInstantiation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addCreateAction"));
		return;
		// -end- 33CFD0A701A4 add_body4551A5A200BB "Classifier::addCreateAction"
	}

	/**
	 * disconnect a CreateAction.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_head4551A5A200BB
	// "Classifier::removeCreateAction"
	public CreateAction removeCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 remove_head4551A5A200BB
	// "Classifier::removeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_body4551A5A200BB
		// "Classifier::removeCreateAction"
		CreateAction ret = null;
		if (createAction1 == null || !createAction.contains(createAction1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = createAction1;
		createAction.remove(createAction1);
		createAction1._unlinkInstantiation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeCreateAction"));
		return ret;
		// -end- 33CFD0A701A4 remove_body4551A5A200BB
		// "Classifier::removeCreateAction"
	}

	/**
	 * tests if a given CreateAction is connected.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 test_head4551A5A200BB
	// "Classifier::containsCreateAction"
	public boolean containsCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 test_head4551A5A200BB
	// "Classifier::containsCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 test_body4551A5A200BB
		// "Classifier::containsCreateAction"
		return createAction.contains(createAction1);
		// -end- 33CFD0A701A4 test_body4551A5A200BB
		// "Classifier::containsCreateAction"
	}

	/**
	 * used to enumerate all connected CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 get_all_head4551A5A200BB
	// "Classifier::iteratorCreateAction"
	public Iterator<?> iteratorCreateAction()
	// -end- 33CFD0A701A4 get_all_head4551A5A200BB
	// "Classifier::iteratorCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 get_all_body4551A5A200BB
		// "Classifier::iteratorCreateAction"
		return createAction.iterator();
		// -end- 33CFD0A701A4 get_all_body4551A5A200BB
		// "Classifier::iteratorCreateAction"
	}

	/**
	 * disconnect all CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_all_head4551A5A200BB
	// "Classifier::clearCreateAction"
	public void clearCreateAction()
	// -end- 33CFD0A701A4 remove_all_head4551A5A200BB
	// "Classifier::clearCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_all_body4551A5A200BB
		// "Classifier::clearCreateAction"
		if (sizeCreateAction() > 0) {
			for (Iterator<?> p = createAction.iterator(); p.hasNext();) {
				((CreateAction) p.next())._unlinkInstantiation(this);
			}
			createAction.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearCreateAction"));
		}
		// -end- 33CFD0A701A4 remove_all_body4551A5A200BB
		// "Classifier::clearCreateAction"
	}

	/**
	 * returns the number of CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 size_head4551A5A200BB
	// "Classifier::sizeCreateAction"
	public int sizeCreateAction()
	// -end- 33CFD0A701A4 size_head4551A5A200BB "Classifier::sizeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 size_body4551A5A200BB
		// "Classifier::sizeCreateAction"
		return createAction.size();
		// -end- 33CFD0A701A4 size_body4551A5A200BB
		// "Classifier::sizeCreateAction"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _link_body4551A5A200BB
	// "Classifier::_linkCreateAction"
	public void _linkCreateAction(CreateAction createAction1) {
		createAction.add(createAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkCreateAction"));
		return;
	}
	// -end- 33CFD0A701A4 _link_body4551A5A200BB "Classifier::_linkCreateAction"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _unlink_body4551A5A200BB
	// "Classifier::_unlinkCreateAction"
	public void _unlinkCreateAction(CreateAction createAction1) {
		createAction.remove(createAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkCreateAction"));
		return;
	}
	// -end- 33CFD0A701A4 _unlink_body4551A5A200BB
	// "Classifier::_unlinkCreateAction"

	// -beg- preserve=no 32B5D7EF03D3 code4551A5A200BB "feature"
	private List<Feature> feature = new ArrayList<Feature>();
	// -end- 32B5D7EF03D3 code4551A5A200BB "feature"

	/**
	 * add a Feature.
	 *
	 * @see #removeFeature
	 * @see #containsFeature
	 * @see #iteratorFeature
	 * @see #clearFeature
	 * @see #sizeFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 add_head4551A5A200BB
	// "Classifier::addFeature"
	public void addFeature(Feature feature1)
	// -end- 32B5D7EF03D3 add_head4551A5A200BB "Classifier::addFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add_body4551A5A200BB
		// "Classifier::addFeature"
		feature.add(feature1);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addFeature"));
		return;
		// -end- 32B5D7EF03D3 add_body4551A5A200BB "Classifier::addFeature"
	}

	// -beg- preserve=no 32B5D7EF03D3 add2_head4551A5A200BB
	// "Classifier::add2Feature"
	public void addFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 add2_head4551A5A200BB "Classifier::add2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add2_body4551A5A200BB
		// "Classifier::add2Feature"
		feature.add(index, feature1);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addFeature"));
		return;
		// -end- 32B5D7EF03D3 add2_body4551A5A200BB "Classifier::add2Feature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_head4551A5A200BB
	// "Classifier::removeFeature"
	public Feature removeFeature(Feature feature1)
	// -end- 32B5D7EF03D3 remove_head4551A5A200BB "Classifier::removeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_body4551A5A200BB
		// "Classifier::removeFeature"
		Feature ret = null;
		if (feature1 == null || !feature.contains(feature1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = feature1;
		feature.remove(feature1);
		feature1._unlinkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeFeature"));
		return ret;
		// -end- 32B5D7EF03D3 remove_body4551A5A200BB
		// "Classifier::removeFeature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove2_head4551A5A200BB
	// "Classifier::remove2Feature"
	public Feature removeFeature(int index)
	// -end- 32B5D7EF03D3 remove2_head4551A5A200BB "Classifier::remove2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove2_body4551A5A200BB
		// "Classifier::remove2Feature"
		Feature ret = null;
		ret = (Feature) feature.remove(index);
		ret._unlinkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeFeature"));
		return ret;
		// -end- 32B5D7EF03D3 remove2_body4551A5A200BB
		// "Classifier::remove2Feature"
	}

	/**
	 * change a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 set_head4551A5A200BB
	// "Classifier::setFeature"
	public Feature setFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 set_head4551A5A200BB "Classifier::setFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 set_body4551A5A200BB
		// "Classifier::setFeature"
		Feature ret = null;
		ret = (Feature) feature.set(index, feature1);
		ret._unlinkOwner(this);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setFeature"));
		return ret;
		// -end- 32B5D7EF03D3 set_body4551A5A200BB "Classifier::setFeature"
	}

	/**
	 * tests if a given Feature is connected.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 test_head4551A5A200BB
	// "Classifier::containsFeature"
	public boolean containsFeature(Feature feature1)
	// -end- 32B5D7EF03D3 test_head4551A5A200BB "Classifier::containsFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 test_body4551A5A200BB
		// "Classifier::containsFeature"
		return feature.contains(feature1);
		// -end- 32B5D7EF03D3 test_body4551A5A200BB
		// "Classifier::containsFeature"
	}

	/**
	 * used to enumerate all connected Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 get_all_head4551A5A200BB
	// "Classifier::iteratorFeature"
	public Iterator<?> iteratorFeature()
	// -end- 32B5D7EF03D3 get_all_head4551A5A200BB "Classifier::iteratorFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 get_all_body4551A5A200BB
		// "Classifier::iteratorFeature"
		return feature.iterator();
		// -end- 32B5D7EF03D3 get_all_body4551A5A200BB
		// "Classifier::iteratorFeature"
	}

	/**
	 * disconnect all Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_all_head4551A5A200BB
	// "Classifier::clearFeature"
	public void clearFeature()
	// -end- 32B5D7EF03D3 remove_all_head4551A5A200BB "Classifier::clearFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_all_body4551A5A200BB
		// "Classifier::clearFeature"
		if (sizeFeature() > 0) {
			for (Iterator<?> p = feature.iterator(); p.hasNext();) {
				((Feature) p.next())._unlinkOwner(this);
			}
			feature.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearFeature"));
		}
		// -end- 32B5D7EF03D3 remove_all_body4551A5A200BB
		// "Classifier::clearFeature"
	}

	/**
	 * returns the number of Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 size_head4551A5A200BB
	// "Classifier::sizeFeature"
	public int sizeFeature()
	// -end- 32B5D7EF03D3 size_head4551A5A200BB "Classifier::sizeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 size_body4551A5A200BB
		// "Classifier::sizeFeature"
		return feature.size();
		// -end- 32B5D7EF03D3 size_body4551A5A200BB "Classifier::sizeFeature"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _link_body4551A5A200BB
	// "Classifier::_linkFeature"
	public void _linkFeature(Feature feature1) {
		feature.add(feature1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkFeature"));
		return;
	}
	// -end- 32B5D7EF03D3 _link_body4551A5A200BB "Classifier::_linkFeature"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _unlink_body4551A5A200BB
	// "Classifier::_unlinkFeature"
	public void _unlinkFeature(Feature feature1) {
		feature.remove(feature1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkFeature"));
		return;
	}
	// -end- 32B5D7EF03D3 _unlink_body4551A5A200BB "Classifier::_unlinkFeature"

	// -beg- preserve=no 33E265070353 code4551A5A200BB "association"
	private Set<AssociationEnd> association = new HashSet<AssociationEnd>();
	// -end- 33E265070353 code4551A5A200BB "association"

	/**
	 * add a Association.
	 *
	 * @see #removeAssociation
	 * @see #containsAssociation
	 * @see #iteratorAssociation
	 * @see #clearAssociation
	 * @see #sizeAssociation
	 */
	// -beg- preserve=no 33E265070353 add_head4551A5A200BB
	// "Classifier::addAssociation"
	public void addAssociation(AssociationEnd association1)
	// -end- 33E265070353 add_head4551A5A200BB "Classifier::addAssociation"
	{
		// -beg- preserve=no 33E265070353 add_body4551A5A200BB
		// "Classifier::addAssociation"
		association.add(association1);
		association1._linkParticipant(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAssociation"));
		return;
		// -end- 33E265070353 add_body4551A5A200BB "Classifier::addAssociation"
	}

	/**
	 * disconnect a Association.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_head4551A5A200BB
	// "Classifier::removeAssociation"
	public AssociationEnd removeAssociation(AssociationEnd association1)
	// -end- 33E265070353 remove_head4551A5A200BB
	// "Classifier::removeAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_body4551A5A200BB
		// "Classifier::removeAssociation"
		AssociationEnd ret = null;
		if (association1 == null || !association.contains(association1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = association1;
		association.remove(association1);
		association1._unlinkParticipant(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAssociation"));
		return ret;
		// -end- 33E265070353 remove_body4551A5A200BB
		// "Classifier::removeAssociation"
	}

	/**
	 * tests if a given Association is connected.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 test_head4551A5A200BB
	// "Classifier::containsAssociation"
	public boolean containsAssociation(AssociationEnd association1)
	// -end- 33E265070353 test_head4551A5A200BB
	// "Classifier::containsAssociation"
	{
		// -beg- preserve=no 33E265070353 test_body4551A5A200BB
		// "Classifier::containsAssociation"
		return association.contains(association1);
		// -end- 33E265070353 test_body4551A5A200BB
		// "Classifier::containsAssociation"
	}

	/**
	 * used to enumerate all connected Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 get_all_head4551A5A200BB
	// "Classifier::iteratorAssociation"
	public Iterator<?> iteratorAssociation()
	// -end- 33E265070353 get_all_head4551A5A200BB
	// "Classifier::iteratorAssociation"
	{
		// -beg- preserve=no 33E265070353 get_all_body4551A5A200BB
		// "Classifier::iteratorAssociation"
		return association.iterator();
		// -end- 33E265070353 get_all_body4551A5A200BB
		// "Classifier::iteratorAssociation"
	}

	/**
	 * disconnect all Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_all_head4551A5A200BB
	// "Classifier::clearAssociation"
	public void clearAssociation()
	// -end- 33E265070353 remove_all_head4551A5A200BB
	// "Classifier::clearAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_all_body4551A5A200BB
		// "Classifier::clearAssociation"
		if (sizeAssociation() > 0) {
			for (Iterator<?> p = association.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkParticipant(this);
			}
			association.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAssociation"));
		}
		// -end- 33E265070353 remove_all_body4551A5A200BB
		// "Classifier::clearAssociation"
	}

	/**
	 * returns the number of Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 size_head4551A5A200BB
	// "Classifier::sizeAssociation"
	public int sizeAssociation()
	// -end- 33E265070353 size_head4551A5A200BB "Classifier::sizeAssociation"
	{
		// -beg- preserve=no 33E265070353 size_body4551A5A200BB
		// "Classifier::sizeAssociation"
		return association.size();
		// -end- 33E265070353 size_body4551A5A200BB
		// "Classifier::sizeAssociation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _link_body4551A5A200BB
	// "Classifier::_linkAssociation"
	public void _linkAssociation(AssociationEnd association1) {
		association.add(association1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAssociation"));
		return;
	}
	// -end- 33E265070353 _link_body4551A5A200BB "Classifier::_linkAssociation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _unlink_body4551A5A200BB
	// "Classifier::_unlinkAssociation"
	public void _unlinkAssociation(AssociationEnd association1) {
		association.remove(association1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAssociation"));
		return;
	}
	// -end- 33E265070353 _unlink_body4551A5A200BB
	// "Classifier::_unlinkAssociation"

	// -beg- preserve=no 33F0EFAD00AB code4551A5A200BB "specifiedEnd"
	private Set<AssociationEnd> specifiedEnd = new HashSet<AssociationEnd>();
	// -end- 33F0EFAD00AB code4551A5A200BB "specifiedEnd"

	/**
	 * add a SpecifiedEnd.
	 *
	 * @see #removeSpecifiedEnd
	 * @see #containsSpecifiedEnd
	 * @see #iteratorSpecifiedEnd
	 * @see #clearSpecifiedEnd
	 * @see #sizeSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB add_head4551A5A200BB
	// "Classifier::addSpecifiedEnd"
	public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB add_head4551A5A200BB "Classifier::addSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB add_body4551A5A200BB
		// "Classifier::addSpecifiedEnd"
		specifiedEnd.add(specifiedEnd1);
		specifiedEnd1._linkSpecification(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecifiedEnd"));
		return;
		// -end- 33F0EFAD00AB add_body4551A5A200BB "Classifier::addSpecifiedEnd"
	}

	/**
	 * disconnect a SpecifiedEnd.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_head4551A5A200BB
	// "Classifier::removeSpecifiedEnd"
	public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB remove_head4551A5A200BB
	// "Classifier::removeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_body4551A5A200BB
		// "Classifier::removeSpecifiedEnd"
		AssociationEnd ret = null;
		if (specifiedEnd1 == null || !specifiedEnd.contains(specifiedEnd1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = specifiedEnd1;
		specifiedEnd.remove(specifiedEnd1);
		specifiedEnd1._unlinkSpecification(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSpecifiedEnd"));
		return ret;
		// -end- 33F0EFAD00AB remove_body4551A5A200BB
		// "Classifier::removeSpecifiedEnd"
	}

	/**
	 * tests if a given SpecifiedEnd is connected.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB test_head4551A5A200BB
	// "Classifier::containsSpecifiedEnd"
	public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB test_head4551A5A200BB
	// "Classifier::containsSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB test_body4551A5A200BB
		// "Classifier::containsSpecifiedEnd"
		return specifiedEnd.contains(specifiedEnd1);
		// -end- 33F0EFAD00AB test_body4551A5A200BB
		// "Classifier::containsSpecifiedEnd"
	}

	/**
	 * used to enumerate all connected SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB get_all_head4551A5A200BB
	// "Classifier::iteratorSpecifiedEnd"
	public Iterator<?> iteratorSpecifiedEnd()
	// -end- 33F0EFAD00AB get_all_head4551A5A200BB
	// "Classifier::iteratorSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB get_all_body4551A5A200BB
		// "Classifier::iteratorSpecifiedEnd"
		return specifiedEnd.iterator();
		// -end- 33F0EFAD00AB get_all_body4551A5A200BB
		// "Classifier::iteratorSpecifiedEnd"
	}

	/**
	 * disconnect all SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_all_head4551A5A200BB
	// "Classifier::clearSpecifiedEnd"
	public void clearSpecifiedEnd()
	// -end- 33F0EFAD00AB remove_all_head4551A5A200BB
	// "Classifier::clearSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_all_body4551A5A200BB
		// "Classifier::clearSpecifiedEnd"
		if (sizeSpecifiedEnd() > 0) {
			for (Iterator<?> p = specifiedEnd.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkSpecification(this);
			}
			specifiedEnd.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecifiedEnd"));
		}
		// -end- 33F0EFAD00AB remove_all_body4551A5A200BB
		// "Classifier::clearSpecifiedEnd"
	}

	/**
	 * returns the number of SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB size_head4551A5A200BB
	// "Classifier::sizeSpecifiedEnd"
	public int sizeSpecifiedEnd()
	// -end- 33F0EFAD00AB size_head4551A5A200BB "Classifier::sizeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB size_body4551A5A200BB
		// "Classifier::sizeSpecifiedEnd"
		return specifiedEnd.size();
		// -end- 33F0EFAD00AB size_body4551A5A200BB
		// "Classifier::sizeSpecifiedEnd"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _link_body4551A5A200BB
	// "Classifier::_linkSpecifiedEnd"
	public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.add(specifiedEnd1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecifiedEnd"));
		return;
	}
	// -end- 33F0EFAD00AB _link_body4551A5A200BB "Classifier::_linkSpecifiedEnd"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _unlink_body4551A5A200BB
	// "Classifier::_unlinkSpecifiedEnd"
	public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.remove(specifiedEnd1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecifiedEnd"));
		return;
	}
	// -end- 33F0EFAD00AB _unlink_body4551A5A200BB
	// "Classifier::_unlinkSpecifiedEnd"

	// -beg- preserve=no 36E96A87033E code4551A5A200BB "powertypeRange"
	private Set<Generalization> powertypeRange = new HashSet<Generalization>();
	// -end- 36E96A87033E code4551A5A200BB "powertypeRange"

	/**
	 * add a PowertypeRange.
	 *
	 * @see #removePowertypeRange
	 * @see #containsPowertypeRange
	 * @see #iteratorPowertypeRange
	 * @see #clearPowertypeRange
	 * @see #sizePowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E add_head4551A5A200BB
	// "Classifier::addPowertypeRange"
	public void addPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E add_head4551A5A200BB "Classifier::addPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E add_body4551A5A200BB
		// "Classifier::addPowertypeRange"
		powertypeRange.add(powertypeRange1);
		powertypeRange1._linkPowertype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addPowertypeRange"));
		return;
		// -end- 36E96A87033E add_body4551A5A200BB
		// "Classifier::addPowertypeRange"
	}

	/**
	 * disconnect a PowertypeRange.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_head4551A5A200BB
	// "Classifier::removePowertypeRange"
	public Generalization removePowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E remove_head4551A5A200BB
	// "Classifier::removePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_body4551A5A200BB
		// "Classifier::removePowertypeRange"
		Generalization ret = null;
		if (powertypeRange1 == null || !powertypeRange.contains(powertypeRange1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = powertypeRange1;
		powertypeRange.remove(powertypeRange1);
		powertypeRange1._unlinkPowertype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removePowertypeRange"));
		return ret;
		// -end- 36E96A87033E remove_body4551A5A200BB
		// "Classifier::removePowertypeRange"
	}

	/**
	 * tests if a given PowertypeRange is connected.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E test_head4551A5A200BB
	// "Classifier::containsPowertypeRange"
	public boolean containsPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E test_head4551A5A200BB
	// "Classifier::containsPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E test_body4551A5A200BB
		// "Classifier::containsPowertypeRange"
		return powertypeRange.contains(powertypeRange1);
		// -end- 36E96A87033E test_body4551A5A200BB
		// "Classifier::containsPowertypeRange"
	}

	/**
	 * used to enumerate all connected PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E get_all_head4551A5A200BB
	// "Classifier::iteratorPowertypeRange"
	public Iterator<?> iteratorPowertypeRange()
	// -end- 36E96A87033E get_all_head4551A5A200BB
	// "Classifier::iteratorPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E get_all_body4551A5A200BB
		// "Classifier::iteratorPowertypeRange"
		return powertypeRange.iterator();
		// -end- 36E96A87033E get_all_body4551A5A200BB
		// "Classifier::iteratorPowertypeRange"
	}

	/**
	 * disconnect all PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_all_head4551A5A200BB
	// "Classifier::clearPowertypeRange"
	public void clearPowertypeRange()
	// -end- 36E96A87033E remove_all_head4551A5A200BB
	// "Classifier::clearPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_all_body4551A5A200BB
		// "Classifier::clearPowertypeRange"
		if (sizePowertypeRange() > 0) {
			for (Iterator<?> p = powertypeRange.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkPowertype(this);
			}
			powertypeRange.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearPowertypeRange"));
		}
		// -end- 36E96A87033E remove_all_body4551A5A200BB
		// "Classifier::clearPowertypeRange"
	}

	/**
	 * returns the number of PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E size_head4551A5A200BB
	// "Classifier::sizePowertypeRange"
	public int sizePowertypeRange()
	// -end- 36E96A87033E size_head4551A5A200BB "Classifier::sizePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E size_body4551A5A200BB
		// "Classifier::sizePowertypeRange"
		return powertypeRange.size();
		// -end- 36E96A87033E size_body4551A5A200BB
		// "Classifier::sizePowertypeRange"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _link_body4551A5A200BB
	// "Classifier::_linkPowertypeRange"
	public void _linkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.add(powertypeRange1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkPowertypeRange"));
		return;
	}
	// -end- 36E96A87033E _link_body4551A5A200BB
	// "Classifier::_linkPowertypeRange"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _unlink_body4551A5A200BB
	// "Classifier::_unlinkPowertypeRange"
	public void _unlinkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.remove(powertypeRange1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkPowertypeRange"));
		return;
	}
	// -end- 36E96A87033E _unlink_body4551A5A200BB
	// "Classifier::_unlinkPowertypeRange"

	// -beg- preserve=no 335C14A5019A code4551A5A200BB "generalization"
	private Set<Generalization> generalization = new HashSet<Generalization>();
	// -end- 335C14A5019A code4551A5A200BB "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head4551A5A200BB
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head4551A5A200BB
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body4551A5A200BB
		// "GeneralizableElement::addGeneralization"
		generalization.add(generalization1);
		generalization1._linkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addGeneralization"));
		return;
		// -end- 335C14A5019A add_body4551A5A200BB
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head4551A5A200BB
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head4551A5A200BB
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body4551A5A200BB
		// "GeneralizableElement::removeGeneralization"
		Generalization ret = null;
		if (generalization1 == null || !generalization.contains(generalization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = generalization1;
		generalization.remove(generalization1);
		generalization1._unlinkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeGeneralization"));
		return ret;
		// -end- 335C14A5019A remove_body4551A5A200BB
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head4551A5A200BB
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head4551A5A200BB
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body4551A5A200BB
		// "GeneralizableElement::containsGeneralization"
		return generalization.contains(generalization1);
		// -end- 335C14A5019A test_body4551A5A200BB
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head4551A5A200BB
	// "GeneralizableElement::iteratorGeneralization"
	public Iterator<?> iteratorGeneralization()
	// -end- 335C14A5019A get_all_head4551A5A200BB
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body4551A5A200BB
		// "GeneralizableElement::iteratorGeneralization"
		return generalization.iterator();
		// -end- 335C14A5019A get_all_body4551A5A200BB
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head4551A5A200BB
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head4551A5A200BB
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body4551A5A200BB
		// "GeneralizableElement::clearGeneralization"
		if (sizeGeneralization() > 0) {
			for (Iterator<?> p = generalization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkChild(this);
			}
			generalization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearGeneralization"));
		}
		// -end- 335C14A5019A remove_all_body4551A5A200BB
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head4551A5A200BB
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head4551A5A200BB
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body4551A5A200BB
		// "GeneralizableElement::sizeGeneralization"
		return generalization.size();
		// -end- 335C14A5019A size_body4551A5A200BB
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body4551A5A200BB
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		generalization.add(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _link_body4551A5A200BB
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body4551A5A200BB
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		generalization.remove(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _unlink_body4551A5A200BB
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code4551A5A200BB "specialization"
	private Set<Generalization> specialization = new HashSet<Generalization>();
	// -end- 335C146B01D6 code4551A5A200BB "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head4551A5A200BB
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head4551A5A200BB
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body4551A5A200BB
		// "GeneralizableElement::addSpecialization"
		specialization.add(specialization1);
		specialization1._linkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecialization"));
		return;
		// -end- 335C146B01D6 add_body4551A5A200BB
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head4551A5A200BB
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head4551A5A200BB
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body4551A5A200BB
		// "GeneralizableElement::removeSpecialization"
		Generalization ret = null;
		if (specialization1 == null || !specialization.contains(specialization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = specialization1;
		specialization.remove(specialization1);
		specialization1._unlinkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSpecialization"));
		return ret;
		// -end- 335C146B01D6 remove_body4551A5A200BB
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head4551A5A200BB
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head4551A5A200BB
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body4551A5A200BB
		// "GeneralizableElement::containsSpecialization"
		return specialization.contains(specialization1);
		// -end- 335C146B01D6 test_body4551A5A200BB
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head4551A5A200BB
	// "GeneralizableElement::iteratorSpecialization"
	public Iterator<?> iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head4551A5A200BB
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body4551A5A200BB
		// "GeneralizableElement::iteratorSpecialization"
		return specialization.iterator();
		// -end- 335C146B01D6 get_all_body4551A5A200BB
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head4551A5A200BB
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head4551A5A200BB
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body4551A5A200BB
		// "GeneralizableElement::clearSpecialization"
		if (sizeSpecialization() > 0) {
			for (Iterator<Generalization> p = specialization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkParent(this);
			}
			specialization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecialization"));
		}
		// -end- 335C146B01D6 remove_all_body4551A5A200BB
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head4551A5A200BB
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head4551A5A200BB
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body4551A5A200BB
		// "GeneralizableElement::sizeSpecialization"
		return specialization.size();
		// -end- 335C146B01D6 size_body4551A5A200BB
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body4551A5A200BB
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		specialization.add(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _link_body4551A5A200BB
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body4551A5A200BB
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		specialization.remove(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _unlink_body4551A5A200BB
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 327A877801CC var4551A5A200BB "isRoot"
	private boolean isRoot;
	// -end- 327A877801CC var4551A5A200BB "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head4551A5A200BB "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head4551A5A200BB "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body4551A5A200BB "isRoot"
		return isRoot;
		// -end- 327A877801CC get_body4551A5A200BB "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head4551A5A200BB "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head4551A5A200BB "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body4551A5A200BB "isRoot"
		if (isRoot != value1) {
			isRoot = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRoot"));
		}
		// -end- 327A877801CC set_body4551A5A200BB "isRoot"
	}

	// -beg- preserve=no 327A877E006E var4551A5A200BB "isLeaf"
	private boolean isLeaf;
	// -end- 327A877E006E var4551A5A200BB "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head4551A5A200BB "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head4551A5A200BB "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body4551A5A200BB "isLeaf"
		return isLeaf;
		// -end- 327A877E006E get_body4551A5A200BB "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head4551A5A200BB "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head4551A5A200BB "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body4551A5A200BB "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLeaf"));
		}
		// -end- 327A877E006E set_body4551A5A200BB "isLeaf"
	}

	// -beg- preserve=no 327A878400D2 var4551A5A200BB "isAbstract"
	private boolean isAbstract;
	// -end- 327A878400D2 var4551A5A200BB "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 327A878400D2 get_head4551A5A200BB "isAbstract"
	public boolean isAbstract()
	// -end- 327A878400D2 get_head4551A5A200BB "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 get_body4551A5A200BB "isAbstract"
		return isAbstract;
		// -end- 327A878400D2 get_body4551A5A200BB "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 327A878400D2 set_head4551A5A200BB "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 327A878400D2 set_head4551A5A200BB "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 set_body4551A5A200BB "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 327A878400D2 set_body4551A5A200BB "isAbstract"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMetaAttrb(value);
	}

	public NlsString getMetaName() {
		return super.getMetaName();
	}

	public void setMetaName(NlsString value) {
		super.setMetaName(value);
	}

	public NlsString getMetaMsg() {
		return super.getMetaMsg();
	}
	
	public void setMetaMsg(NlsString value) {
		super.setMetaMsg(value);
	}

	@Override
	public boolean deepContainsOwnedElement(Class aclass, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ModelElement deepGetOwnedElement(Class aclass, String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551A5A200BB detail_end "UmlActor"

	// -end- 4551A5A200BB detail_end "UmlActor"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
