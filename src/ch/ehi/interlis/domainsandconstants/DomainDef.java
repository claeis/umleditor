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
// -beg- preserve=no 358A5E2403D8 package "DomainDef"
package ch.ehi.interlis.domainsandconstants;
// -end- 358A5E2403D8 package "DomainDef"

// -beg- preserve=no 358A5E2403D8 autoimport "DomainDef"
import ch.ehi.uml1_4.foundation.core.DataType;
import ch.ehi.uml1_4.implementation.AbstractNamespace;
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumTreeValueType;
import ch.ehi.interlis.domainsandconstants.linetypes.LineType;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
<<<<<<< HEAD
=======
import ch.ehi.uml1_4.foundation.core.Class;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
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
// -end- 358A5E2403D8 autoimport "DomainDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5E2403D8 import "DomainDef"

// -end- 358A5E2403D8 import "DomainDef"

<<<<<<< HEAD
/** definiert einen Wertebereich.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.3 $ $Date: 2006-06-13 14:37:20 $
 */
public class DomainDef extends AbstractNamespace implements DataType , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 358A5E2403D8 detail_begin "DomainDef"

  // -end- 358A5E2403D8 detail_begin "DomainDef"

  /** return the list of valid owned elements for this namespace.
   */
  // -beg- preserve=no 3CE4FD4E02A5 head358A5E2403D8 "getValidOwnedElements"
  public String[] getValidOwnedElements()
  // -end- 3CE4FD4E02A5 head358A5E2403D8 "getValidOwnedElements"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE4FD4E02A5 throws358A5E2403D8 "getValidOwnedElements"

    // -end- 3CE4FD4E02A5 throws358A5E2403D8 "getValidOwnedElements"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3CE4FD4E02A5 body358A5E2403D8 "getValidOwnedElements"
    return null;
    // -end- 3CE4FD4E02A5 body358A5E2403D8 "getValidOwnedElements"
    }

  // -beg- preserve=no 3D4FA21A02F0 head358A5E2403D8 "unlinkAll"
  public void unlinkAll()
  // -end- 3D4FA21A02F0 head358A5E2403D8 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA21A02F0 throws358A5E2403D8 "unlinkAll"

    // -end- 3D4FA21A02F0 throws358A5E2403D8 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA21A02F0 body358A5E2403D8 "unlinkAll"
    
    detachType();
    clearDomainAttribute();
    detachNamespace();
    clearTopicDef();
    clearAbstractClassDef();
    clearGeneralization();
    clearSpecialization();
    // Role RefSys: RefSys object(s) may point to this
    clearEnumTreeValueType();
    detachLineType();
    setName(null);
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
    clearOwnedElement();
    clearDiagram();
    clearBehavior();
    clearPartition();
    clearCollaborationInstanceSet();
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
    setDocumentation(null);
    super.unlinkAll();
    // -end- 3D4FA21A02F0 body358A5E2403D8 "unlinkAll"
    }

  // -beg- preserve=no 3D4FA21A0322 head358A5E2403D8 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 3D4FA21A0322 head358A5E2403D8 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA21A0322 throws358A5E2403D8 "enumerateChildren"

    // -end- 3D4FA21A0322 throws358A5E2403D8 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA21A0322 body358A5E2403D8 "enumerateChildren"
    java.util.Iterator it=null;
    if(containsType())visitor.visit(getType());
    visitor.visit(getName());
    it=iteratorFeature();while(it.hasNext())visitor.visit(it.next());
    it=iteratorOwnedElement();while(it.hasNext())visitor.visit(it.next());
    it=iteratorDiagram();while(it.hasNext())visitor.visit(it.next());
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getDocumentation());
    super.enumerateChildren(visitor);
    // -end- 3D4FA21A0322 body358A5E2403D8 "enumerateChildren"
    }

  // -beg- preserve=no 358A746E033C code358A5E2403D8 "type"
  private Type type;
  // -end- 358A746E033C code358A5E2403D8 "type"

  /** attaches a Type.
   *  
   *  @see #detachType
   *  @see #getType
   *  @see #containsType
   */
  // -beg- preserve=no 358A746E033C attach_head358A5E2403D8 "DomainDef::attachType"
  public void attachType(Type type1)
  // -end- 358A746E033C attach_head358A5E2403D8 "DomainDef::attachType"
  {
    // -beg- preserve=no 358A746E033C attach_body358A5E2403D8 "DomainDef::attachType"
    if(type!=null) {throw new java.lang.IllegalStateException("already a type attached");}
    if(type1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as type");}
    type = type1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachType"));
    return;
    // -end- 358A746E033C attach_body358A5E2403D8 "DomainDef::attachType"
  }

  /** disconnect the currently attached Type.
   *  @see #attachType
   */
  // -beg- preserve=no 358A746E033C detach_head358A5E2403D8 "DomainDef::detachType"
  public Type detachType()
  // -end- 358A746E033C detach_head358A5E2403D8 "DomainDef::detachType"
  {
    // -beg- preserve=no 358A746E033C detach_body358A5E2403D8 "DomainDef::detachType"
    Type ret = null;
    ret = type;
    type = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachType"));
    return ret;
    // -end- 358A746E033C detach_body358A5E2403D8 "DomainDef::detachType"
  }

  /** get the currently attached Type.
   *  @see #attachType
   */
  // -beg- preserve=no 358A746E033C get_head358A5E2403D8 "DomainDef::getType"
  public Type getType()
  // -end- 358A746E033C get_head358A5E2403D8 "DomainDef::getType"
  {
    // -beg- preserve=no 358A746E033C get_body358A5E2403D8 "DomainDef::getType"
    if(type==null) {throw new java.lang.IllegalStateException("no type attached");}
    return type;
    // -end- 358A746E033C get_body358A5E2403D8 "DomainDef::getType"
  }

  /** tests if there is a Type attached.
   *  @see #attachType
   */
  // -beg- preserve=no 358A746E033C test_head358A5E2403D8 "DomainDef::containsType"
  public boolean containsType()
  // -end- 358A746E033C test_head358A5E2403D8 "DomainDef::containsType"
  {
    // -beg- preserve=no 358A746E033C test_body358A5E2403D8 "DomainDef::containsType"
    return type!=null;
    // -end- 358A746E033C test_body358A5E2403D8 "DomainDef::containsType"
  }

  // -beg- preserve=no 3947A41A0200 code358A5E2403D8 "domainAttribute"
  private java.util.Set domainAttribute = new java.util.HashSet();
  // -end- 3947A41A0200 code358A5E2403D8 "domainAttribute"

  /** add a DomainAttribute.
   *  
   *  @see #removeDomainAttribute
   *  @see #containsDomainAttribute
   *  @see #iteratorDomainAttribute
   *  @see #clearDomainAttribute
   *  @see #sizeDomainAttribute
   */
  // -beg- preserve=no 3947A41A0200 add_head358A5E2403D8 "DomainDef::addDomainAttribute"
  public void addDomainAttribute(DomainAttribute domainAttribute1)
  // -end- 3947A41A0200 add_head358A5E2403D8 "DomainDef::addDomainAttribute"
  {
    // -beg- preserve=no 3947A41A0200 add_body358A5E2403D8 "DomainDef::addDomainAttribute"
    domainAttribute.add(domainAttribute1);
    domainAttribute1._linkDomainDef(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDomainAttribute"));
    return;
    // -end- 3947A41A0200 add_body358A5E2403D8 "DomainDef::addDomainAttribute"
  }

  /** disconnect a DomainAttribute.
   *  @see #addDomainAttribute
   */
  // -beg- preserve=no 3947A41A0200 remove_head358A5E2403D8 "DomainDef::removeDomainAttribute"
  public DomainAttribute removeDomainAttribute(DomainAttribute domainAttribute1)
  // -end- 3947A41A0200 remove_head358A5E2403D8 "DomainDef::removeDomainAttribute"
  {
    // -beg- preserve=no 3947A41A0200 remove_body358A5E2403D8 "DomainDef::removeDomainAttribute"
    DomainAttribute ret=null;
    if(domainAttribute1==null || !domainAttribute.contains(domainAttribute1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = domainAttribute1;
    domainAttribute.remove(domainAttribute1);
    domainAttribute1._unlinkDomainDef(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDomainAttribute"));
    return ret;
    // -end- 3947A41A0200 remove_body358A5E2403D8 "DomainDef::removeDomainAttribute"
  }

  /** tests if a given DomainAttribute is connected.
   *  @see #addDomainAttribute
   */
  // -beg- preserve=no 3947A41A0200 test_head358A5E2403D8 "DomainDef::containsDomainAttribute"
  public boolean containsDomainAttribute(DomainAttribute domainAttribute1)
  // -end- 3947A41A0200 test_head358A5E2403D8 "DomainDef::containsDomainAttribute"
  {
    // -beg- preserve=no 3947A41A0200 test_body358A5E2403D8 "DomainDef::containsDomainAttribute"
    return domainAttribute.contains(domainAttribute1);
    // -end- 3947A41A0200 test_body358A5E2403D8 "DomainDef::containsDomainAttribute"
  }

  /** used to enumerate all connected DomainAttributes.
   *  @see #addDomainAttribute
   */
  // -beg- preserve=no 3947A41A0200 get_all_head358A5E2403D8 "DomainDef::iteratorDomainAttribute"
  public java.util.Iterator iteratorDomainAttribute()
  // -end- 3947A41A0200 get_all_head358A5E2403D8 "DomainDef::iteratorDomainAttribute"
  {
    // -beg- preserve=no 3947A41A0200 get_all_body358A5E2403D8 "DomainDef::iteratorDomainAttribute"
    return domainAttribute.iterator();
    // -end- 3947A41A0200 get_all_body358A5E2403D8 "DomainDef::iteratorDomainAttribute"
  }

  /** disconnect all DomainAttributes.
   *  @see #addDomainAttribute
   */
  // -beg- preserve=no 3947A41A0200 remove_all_head358A5E2403D8 "DomainDef::clearDomainAttribute"
  public void clearDomainAttribute()
  // -end- 3947A41A0200 remove_all_head358A5E2403D8 "DomainDef::clearDomainAttribute"
  {
    // -beg- preserve=no 3947A41A0200 remove_all_body358A5E2403D8 "DomainDef::clearDomainAttribute"
    if(sizeDomainAttribute()>0){
      for(java.util.Iterator p = domainAttribute.iterator(); p.hasNext();){
        ((DomainAttribute)p.next())._unlinkDomainDef(this);
      }
      domainAttribute.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDomainAttribute"));
    }
    // -end- 3947A41A0200 remove_all_body358A5E2403D8 "DomainDef::clearDomainAttribute"
  }

  /** returns the number of DomainAttributes.
   *  @see #addDomainAttribute
   */
  // -beg- preserve=no 3947A41A0200 size_head358A5E2403D8 "DomainDef::sizeDomainAttribute"
  public int sizeDomainAttribute()
  // -end- 3947A41A0200 size_head358A5E2403D8 "DomainDef::sizeDomainAttribute"
  {
    // -beg- preserve=no 3947A41A0200 size_body358A5E2403D8 "DomainDef::sizeDomainAttribute"
    return domainAttribute.size();
    // -end- 3947A41A0200 size_body358A5E2403D8 "DomainDef::sizeDomainAttribute"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3947A41A0200 _link_body358A5E2403D8 "DomainDef::_linkDomainAttribute"
  public void _linkDomainAttribute(DomainAttribute domainAttribute1)
  {
    domainAttribute.add(domainAttribute1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDomainAttribute"));
    return;
  }
  // -end- 3947A41A0200 _link_body358A5E2403D8 "DomainDef::_linkDomainAttribute"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3947A41A0200 _unlink_body358A5E2403D8 "DomainDef::_unlinkDomainAttribute"
  public void _unlinkDomainAttribute(DomainAttribute domainAttribute1)
  {
    domainAttribute.remove(domainAttribute1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDomainAttribute"));
    return;
  }
  // -end- 3947A41A0200 _unlink_body358A5E2403D8 "DomainDef::_unlinkDomainAttribute"

  // -beg- preserve=no 33598CAA030E code358A5E2403D8 "namespace"

  // -end- 33598CAA030E code358A5E2403D8 "namespace"

  /** attaches a Namespace.
   *  Designates the Namespace that contains the ModelElement.
   *  @see #detachNamespace
   *  @see #getNamespace
   *  @see #containsNamespace
   *  @see #getNamespaceLink
   *  @see #createNamespaceLink
   */
  // -beg- preserve=no 33598CAA030E attach_head358A5E2403D8 "ModelElement::attachNamespace"
  public void attachNamespace(Namespace namespace1)
  // -end- 33598CAA030E attach_head358A5E2403D8 "ModelElement::attachNamespace"
  {
    // -beg- preserve=no 33598CAA030E attach_body358A5E2403D8 "ModelElement::attachNamespace"
    super.attachNamespace(namespace1);
    // -end- 33598CAA030E attach_body358A5E2403D8 "ModelElement::attachNamespace"
  }

  /** attaches a link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E attachlink_head358A5E2403D8 "ModelElement::attachNamespaceLink"
  public void attachNamespaceLink(ElementOwnership namespace1)
  // -end- 33598CAA030E attachlink_head358A5E2403D8 "ModelElement::attachNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E attachlink_body358A5E2403D8 "ModelElement::attachNamespaceLink"
    super.attachNamespaceLink(namespace1);
    // -end- 33598CAA030E attachlink_body358A5E2403D8 "ModelElement::attachNamespaceLink"
  }

  /** disconnect the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E detach_head358A5E2403D8 "ModelElement::detachNamespace"
  public Namespace detachNamespace()
  // -end- 33598CAA030E detach_head358A5E2403D8 "ModelElement::detachNamespace"
  {
    // -beg- preserve=no 33598CAA030E detach_body358A5E2403D8 "ModelElement::detachNamespace"
    return super.detachNamespace();
    // -end- 33598CAA030E detach_body358A5E2403D8 "ModelElement::detachNamespace"
  }

  /** get the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E get_head358A5E2403D8 "ModelElement::getNamespace"
  public Namespace getNamespace()
  // -end- 33598CAA030E get_head358A5E2403D8 "ModelElement::getNamespace"
  {
    // -beg- preserve=no 33598CAA030E get_body358A5E2403D8 "ModelElement::getNamespace"
    return super.getNamespace();
    // -end- 33598CAA030E get_body358A5E2403D8 "ModelElement::getNamespace"
  }

  /** get the link class of currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E getlink_head358A5E2403D8 "ModelElement::getNamespaceLink"
  public ElementOwnership getNamespaceLink()
  // -end- 33598CAA030E getlink_head358A5E2403D8 "ModelElement::getNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E getlink_body358A5E2403D8 "ModelElement::getNamespaceLink"
    return super.getNamespaceLink();
    // -end- 33598CAA030E getlink_body358A5E2403D8 "ModelElement::getNamespaceLink"
  }

  /** create a link class for a new link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E createlink_head358A5E2403D8 "ModelElement::createNamespaceLink"
  public ElementOwnership createNamespaceLink()
  // -end- 33598CAA030E createlink_head358A5E2403D8 "ModelElement::createNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E createlink_body358A5E2403D8 "ModelElement::createNamespaceLink"
    return super.createNamespaceLink();
    // -end- 33598CAA030E createlink_body358A5E2403D8 "ModelElement::createNamespaceLink"
  }

  /** tests if there is a Namespace attached.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E test_head358A5E2403D8 "ModelElement::containsNamespace"
  public boolean containsNamespace()
  // -end- 33598CAA030E test_head358A5E2403D8 "ModelElement::containsNamespace"
  {
    // -beg- preserve=no 33598CAA030E test_body358A5E2403D8 "ModelElement::containsNamespace"
    return super.containsNamespace();
    // -end- 33598CAA030E test_body358A5E2403D8 "ModelElement::containsNamespace"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _link_body358A5E2403D8 "ModelElement::_linkNamespace"
  public void _linkNamespace(ElementOwnership namespace1)
  {
    super._linkNamespace(namespace1);
  }
  // -end- 33598CAA030E _link_body358A5E2403D8 "ModelElement::_linkNamespace"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _unlink_body358A5E2403D8 "ModelElement::_unlinkNamespace"
  public void _unlinkNamespace(ElementOwnership namespace1)
  {
    super._unlinkNamespace(namespace1);
  }
  // -end- 33598CAA030E _unlink_body358A5E2403D8 "ModelElement::_unlinkNamespace"

  // -beg- preserve=no 3FE86E5801B9 code358A5E2403D8 "topicDef"
  private java.util.Set topicDef = new java.util.HashSet();
  // -end- 3FE86E5801B9 code358A5E2403D8 "topicDef"

  /** add a TopicDef.
   *  
   *  @see #removeTopicDef
   *  @see #containsTopicDef
   *  @see #iteratorTopicDef
   *  @see #clearTopicDef
   *  @see #sizeTopicDef
   */
  // -beg- preserve=no 3FE86E5801B9 add_head358A5E2403D8 "DomainDef::addTopicDef"
  public void addTopicDef(TopicDef topicDef1)
  // -end- 3FE86E5801B9 add_head358A5E2403D8 "DomainDef::addTopicDef"
  {
    // -beg- preserve=no 3FE86E5801B9 add_body358A5E2403D8 "DomainDef::addTopicDef"
    topicDef.add(topicDef1);
    topicDef1._linkOiddomain(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTopicDef"));
    return;
    // -end- 3FE86E5801B9 add_body358A5E2403D8 "DomainDef::addTopicDef"
  }

  /** disconnect a TopicDef.
   *  @see #addTopicDef
   */
  // -beg- preserve=no 3FE86E5801B9 remove_head358A5E2403D8 "DomainDef::removeTopicDef"
  public TopicDef removeTopicDef(TopicDef topicDef1)
  // -end- 3FE86E5801B9 remove_head358A5E2403D8 "DomainDef::removeTopicDef"
  {
    // -beg- preserve=no 3FE86E5801B9 remove_body358A5E2403D8 "DomainDef::removeTopicDef"
    TopicDef ret=null;
    if(topicDef1==null || !topicDef.contains(topicDef1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = topicDef1;
    topicDef.remove(topicDef1);
    topicDef1._unlinkOiddomain(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTopicDef"));
    return ret;
    // -end- 3FE86E5801B9 remove_body358A5E2403D8 "DomainDef::removeTopicDef"
  }

  /** tests if a given TopicDef is connected.
   *  @see #addTopicDef
   */
  // -beg- preserve=no 3FE86E5801B9 test_head358A5E2403D8 "DomainDef::containsTopicDef"
  public boolean containsTopicDef(TopicDef topicDef1)
  // -end- 3FE86E5801B9 test_head358A5E2403D8 "DomainDef::containsTopicDef"
  {
    // -beg- preserve=no 3FE86E5801B9 test_body358A5E2403D8 "DomainDef::containsTopicDef"
    return topicDef.contains(topicDef1);
    // -end- 3FE86E5801B9 test_body358A5E2403D8 "DomainDef::containsTopicDef"
  }

  /** used to enumerate all connected TopicDefs.
   *  @see #addTopicDef
   */
  // -beg- preserve=no 3FE86E5801B9 get_all_head358A5E2403D8 "DomainDef::iteratorTopicDef"
  public java.util.Iterator iteratorTopicDef()
  // -end- 3FE86E5801B9 get_all_head358A5E2403D8 "DomainDef::iteratorTopicDef"
  {
    // -beg- preserve=no 3FE86E5801B9 get_all_body358A5E2403D8 "DomainDef::iteratorTopicDef"
    return topicDef.iterator();
    // -end- 3FE86E5801B9 get_all_body358A5E2403D8 "DomainDef::iteratorTopicDef"
  }

  /** disconnect all TopicDefs.
   *  @see #addTopicDef
   */
  // -beg- preserve=no 3FE86E5801B9 remove_all_head358A5E2403D8 "DomainDef::clearTopicDef"
  public void clearTopicDef()
  // -end- 3FE86E5801B9 remove_all_head358A5E2403D8 "DomainDef::clearTopicDef"
  {
    // -beg- preserve=no 3FE86E5801B9 remove_all_body358A5E2403D8 "DomainDef::clearTopicDef"
    if(sizeTopicDef()>0){
      for(java.util.Iterator p = topicDef.iterator(); p.hasNext();){
        ((TopicDef)p.next())._unlinkOiddomain(this);
      }
      topicDef.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTopicDef"));
    }
    // -end- 3FE86E5801B9 remove_all_body358A5E2403D8 "DomainDef::clearTopicDef"
  }

  /** returns the number of TopicDefs.
   *  @see #addTopicDef
   */
  // -beg- preserve=no 3FE86E5801B9 size_head358A5E2403D8 "DomainDef::sizeTopicDef"
  public int sizeTopicDef()
  // -end- 3FE86E5801B9 size_head358A5E2403D8 "DomainDef::sizeTopicDef"
  {
    // -beg- preserve=no 3FE86E5801B9 size_body358A5E2403D8 "DomainDef::sizeTopicDef"
    return topicDef.size();
    // -end- 3FE86E5801B9 size_body358A5E2403D8 "DomainDef::sizeTopicDef"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3FE86E5801B9 _link_body358A5E2403D8 "DomainDef::_linkTopicDef"
  public void _linkTopicDef(TopicDef topicDef1)
  {
    topicDef.add(topicDef1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTopicDef"));
    return;
  }
  // -end- 3FE86E5801B9 _link_body358A5E2403D8 "DomainDef::_linkTopicDef"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3FE86E5801B9 _unlink_body358A5E2403D8 "DomainDef::_unlinkTopicDef"
  public void _unlinkTopicDef(TopicDef topicDef1)
  {
    topicDef.remove(topicDef1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTopicDef"));
    return;
  }
  // -end- 3FE86E5801B9 _unlink_body358A5E2403D8 "DomainDef::_unlinkTopicDef"

  // -beg- preserve=no 448921B70173 code358A5E2403D8 "abstractClassDef"
  private java.util.Set abstractClassDef = new java.util.HashSet();
  // -end- 448921B70173 code358A5E2403D8 "abstractClassDef"

  /** add a AbstractClassDef.
   *  
   *  @see #removeAbstractClassDef
   *  @see #containsAbstractClassDef
   *  @see #iteratorAbstractClassDef
   *  @see #clearAbstractClassDef
   *  @see #sizeAbstractClassDef
   */
  // -beg- preserve=no 448921B70173 add_head358A5E2403D8 "DomainDef::addAbstractClassDef"
  public void addAbstractClassDef(AbstractClassDef abstractClassDef1)
  // -end- 448921B70173 add_head358A5E2403D8 "DomainDef::addAbstractClassDef"
  {
    // -beg- preserve=no 448921B70173 add_body358A5E2403D8 "DomainDef::addAbstractClassDef"
    abstractClassDef.add(abstractClassDef1);
    abstractClassDef1._linkOiddomain(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addAbstractClassDef"));
    return;
    // -end- 448921B70173 add_body358A5E2403D8 "DomainDef::addAbstractClassDef"
  }

  /** disconnect a AbstractClassDef.
   *  @see #addAbstractClassDef
   */
  // -beg- preserve=no 448921B70173 remove_head358A5E2403D8 "DomainDef::removeAbstractClassDef"
  public AbstractClassDef removeAbstractClassDef(AbstractClassDef abstractClassDef1)
  // -end- 448921B70173 remove_head358A5E2403D8 "DomainDef::removeAbstractClassDef"
  {
    // -beg- preserve=no 448921B70173 remove_body358A5E2403D8 "DomainDef::removeAbstractClassDef"
    AbstractClassDef ret=null;
    if(abstractClassDef1==null || !abstractClassDef.contains(abstractClassDef1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = abstractClassDef1;
    abstractClassDef.remove(abstractClassDef1);
    abstractClassDef1._unlinkOiddomain(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeAbstractClassDef"));
    return ret;
    // -end- 448921B70173 remove_body358A5E2403D8 "DomainDef::removeAbstractClassDef"
  }

  /** tests if a given AbstractClassDef is connected.
   *  @see #addAbstractClassDef
   */
  // -beg- preserve=no 448921B70173 test_head358A5E2403D8 "DomainDef::containsAbstractClassDef"
  public boolean containsAbstractClassDef(AbstractClassDef abstractClassDef1)
  // -end- 448921B70173 test_head358A5E2403D8 "DomainDef::containsAbstractClassDef"
  {
    // -beg- preserve=no 448921B70173 test_body358A5E2403D8 "DomainDef::containsAbstractClassDef"
    return abstractClassDef.contains(abstractClassDef1);
    // -end- 448921B70173 test_body358A5E2403D8 "DomainDef::containsAbstractClassDef"
  }

  /** used to enumerate all connected AbstractClassDefs.
   *  @see #addAbstractClassDef
   */
  // -beg- preserve=no 448921B70173 get_all_head358A5E2403D8 "DomainDef::iteratorAbstractClassDef"
  public java.util.Iterator iteratorAbstractClassDef()
  // -end- 448921B70173 get_all_head358A5E2403D8 "DomainDef::iteratorAbstractClassDef"
  {
    // -beg- preserve=no 448921B70173 get_all_body358A5E2403D8 "DomainDef::iteratorAbstractClassDef"
    return abstractClassDef.iterator();
    // -end- 448921B70173 get_all_body358A5E2403D8 "DomainDef::iteratorAbstractClassDef"
  }

  /** disconnect all AbstractClassDefs.
   *  @see #addAbstractClassDef
   */
  // -beg- preserve=no 448921B70173 remove_all_head358A5E2403D8 "DomainDef::clearAbstractClassDef"
  public void clearAbstractClassDef()
  // -end- 448921B70173 remove_all_head358A5E2403D8 "DomainDef::clearAbstractClassDef"
  {
    // -beg- preserve=no 448921B70173 remove_all_body358A5E2403D8 "DomainDef::clearAbstractClassDef"
    if(sizeAbstractClassDef()>0){
      for(java.util.Iterator p = abstractClassDef.iterator(); p.hasNext();){
        ((AbstractClassDef)p.next())._unlinkOiddomain(this);
      }
      abstractClassDef.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearAbstractClassDef"));
    }
    // -end- 448921B70173 remove_all_body358A5E2403D8 "DomainDef::clearAbstractClassDef"
  }

  /** returns the number of AbstractClassDefs.
   *  @see #addAbstractClassDef
   */
  // -beg- preserve=no 448921B70173 size_head358A5E2403D8 "DomainDef::sizeAbstractClassDef"
  public int sizeAbstractClassDef()
  // -end- 448921B70173 size_head358A5E2403D8 "DomainDef::sizeAbstractClassDef"
  {
    // -beg- preserve=no 448921B70173 size_body358A5E2403D8 "DomainDef::sizeAbstractClassDef"
    return abstractClassDef.size();
    // -end- 448921B70173 size_body358A5E2403D8 "DomainDef::sizeAbstractClassDef"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 448921B70173 _link_body358A5E2403D8 "DomainDef::_linkAbstractClassDef"
  public void _linkAbstractClassDef(AbstractClassDef abstractClassDef1)
  {
    abstractClassDef.add(abstractClassDef1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAbstractClassDef"));
    return;
  }
  // -end- 448921B70173 _link_body358A5E2403D8 "DomainDef::_linkAbstractClassDef"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 448921B70173 _unlink_body358A5E2403D8 "DomainDef::_unlinkAbstractClassDef"
  public void _unlinkAbstractClassDef(AbstractClassDef abstractClassDef1)
  {
    abstractClassDef.remove(abstractClassDef1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAbstractClassDef"));
    return;
  }
  // -end- 448921B70173 _unlink_body358A5E2403D8 "DomainDef::_unlinkAbstractClassDef"

  // -beg- preserve=no 335C14A5019A code358A5E2403D8 "generalization"
  private java.util.Set generalization = new java.util.HashSet();
  // -end- 335C14A5019A code358A5E2403D8 "generalization"

  /** add a Generalization.
   *  
   *  @see #removeGeneralization
   *  @see #containsGeneralization
   *  @see #iteratorGeneralization
   *  @see #clearGeneralization
   *  @see #sizeGeneralization
   */
  // -beg- preserve=no 335C14A5019A add_head358A5E2403D8 "GeneralizableElement::addGeneralization"
  public void addGeneralization(Generalization generalization1)
  // -end- 335C14A5019A add_head358A5E2403D8 "GeneralizableElement::addGeneralization"
  {
    // -beg- preserve=no 335C14A5019A add_body358A5E2403D8 "GeneralizableElement::addGeneralization"
    generalization.add(generalization1);
    generalization1._linkChild(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addGeneralization"));
    return;
    // -end- 335C14A5019A add_body358A5E2403D8 "GeneralizableElement::addGeneralization"
  }

  /** disconnect a Generalization.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_head358A5E2403D8 "GeneralizableElement::removeGeneralization"
  public Generalization removeGeneralization(Generalization generalization1)
  // -end- 335C14A5019A remove_head358A5E2403D8 "GeneralizableElement::removeGeneralization"
  {
    // -beg- preserve=no 335C14A5019A remove_body358A5E2403D8 "GeneralizableElement::removeGeneralization"
    Generalization ret=null;
    if(generalization1==null || !generalization.contains(generalization1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = generalization1;
    generalization.remove(generalization1);
    generalization1._unlinkChild(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeGeneralization"));
    return ret;
    // -end- 335C14A5019A remove_body358A5E2403D8 "GeneralizableElement::removeGeneralization"
  }

  /** tests if a given Generalization is connected.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A test_head358A5E2403D8 "GeneralizableElement::containsGeneralization"
  public boolean containsGeneralization(Generalization generalization1)
  // -end- 335C14A5019A test_head358A5E2403D8 "GeneralizableElement::containsGeneralization"
  {
    // -beg- preserve=no 335C14A5019A test_body358A5E2403D8 "GeneralizableElement::containsGeneralization"
    return generalization.contains(generalization1);
    // -end- 335C14A5019A test_body358A5E2403D8 "GeneralizableElement::containsGeneralization"
  }

  /** used to enumerate all connected Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A get_all_head358A5E2403D8 "GeneralizableElement::iteratorGeneralization"
  public java.util.Iterator iteratorGeneralization()
  // -end- 335C14A5019A get_all_head358A5E2403D8 "GeneralizableElement::iteratorGeneralization"
  {
    // -beg- preserve=no 335C14A5019A get_all_body358A5E2403D8 "GeneralizableElement::iteratorGeneralization"
    return generalization.iterator();
    // -end- 335C14A5019A get_all_body358A5E2403D8 "GeneralizableElement::iteratorGeneralization"
  }

  /** disconnect all Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_all_head358A5E2403D8 "GeneralizableElement::clearGeneralization"
  public void clearGeneralization()
  // -end- 335C14A5019A remove_all_head358A5E2403D8 "GeneralizableElement::clearGeneralization"
  {
    // -beg- preserve=no 335C14A5019A remove_all_body358A5E2403D8 "GeneralizableElement::clearGeneralization"
    if(sizeGeneralization()>0){
      for(java.util.Iterator p = generalization.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkChild(this);
      }
      generalization.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearGeneralization"));
    }
    // -end- 335C14A5019A remove_all_body358A5E2403D8 "GeneralizableElement::clearGeneralization"
  }

  /** returns the number of Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A size_head358A5E2403D8 "GeneralizableElement::sizeGeneralization"
  public int sizeGeneralization()
  // -end- 335C14A5019A size_head358A5E2403D8 "GeneralizableElement::sizeGeneralization"
  {
    // -beg- preserve=no 335C14A5019A size_body358A5E2403D8 "GeneralizableElement::sizeGeneralization"
    return generalization.size();
    // -end- 335C14A5019A size_body358A5E2403D8 "GeneralizableElement::sizeGeneralization"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _link_body358A5E2403D8 "GeneralizableElement::_linkGeneralization"
  public void _linkGeneralization(Generalization generalization1)
  {
    generalization.add(generalization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkGeneralization"));
    return;
  }
  // -end- 335C14A5019A _link_body358A5E2403D8 "GeneralizableElement::_linkGeneralization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _unlink_body358A5E2403D8 "GeneralizableElement::_unlinkGeneralization"
  public void _unlinkGeneralization(Generalization generalization1)
  {
    generalization.remove(generalization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkGeneralization"));
    return;
  }
  // -end- 335C14A5019A _unlink_body358A5E2403D8 "GeneralizableElement::_unlinkGeneralization"

  // -beg- preserve=no 335C146B01D6 code358A5E2403D8 "specialization"
  private java.util.Set specialization = new java.util.HashSet();
  // -end- 335C146B01D6 code358A5E2403D8 "specialization"

  /** add a Specialization.
   *  
   *  @see #removeSpecialization
   *  @see #containsSpecialization
   *  @see #iteratorSpecialization
   *  @see #clearSpecialization
   *  @see #sizeSpecialization
   */
  // -beg- preserve=no 335C146B01D6 add_head358A5E2403D8 "GeneralizableElement::addSpecialization"
  public void addSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 add_head358A5E2403D8 "GeneralizableElement::addSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 add_body358A5E2403D8 "GeneralizableElement::addSpecialization"
    specialization.add(specialization1);
    specialization1._linkParent(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecialization"));
    return;
    // -end- 335C146B01D6 add_body358A5E2403D8 "GeneralizableElement::addSpecialization"
  }

  /** disconnect a Specialization.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_head358A5E2403D8 "GeneralizableElement::removeSpecialization"
  public Generalization removeSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 remove_head358A5E2403D8 "GeneralizableElement::removeSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 remove_body358A5E2403D8 "GeneralizableElement::removeSpecialization"
    Generalization ret=null;
    if(specialization1==null || !specialization.contains(specialization1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = specialization1;
    specialization.remove(specialization1);
    specialization1._unlinkParent(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecialization"));
    return ret;
    // -end- 335C146B01D6 remove_body358A5E2403D8 "GeneralizableElement::removeSpecialization"
  }

  /** tests if a given Specialization is connected.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 test_head358A5E2403D8 "GeneralizableElement::containsSpecialization"
  public boolean containsSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 test_head358A5E2403D8 "GeneralizableElement::containsSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 test_body358A5E2403D8 "GeneralizableElement::containsSpecialization"
    return specialization.contains(specialization1);
    // -end- 335C146B01D6 test_body358A5E2403D8 "GeneralizableElement::containsSpecialization"
  }

  /** used to enumerate all connected Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 get_all_head358A5E2403D8 "GeneralizableElement::iteratorSpecialization"
  public java.util.Iterator iteratorSpecialization()
  // -end- 335C146B01D6 get_all_head358A5E2403D8 "GeneralizableElement::iteratorSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 get_all_body358A5E2403D8 "GeneralizableElement::iteratorSpecialization"
    return specialization.iterator();
    // -end- 335C146B01D6 get_all_body358A5E2403D8 "GeneralizableElement::iteratorSpecialization"
  }

  /** disconnect all Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_all_head358A5E2403D8 "GeneralizableElement::clearSpecialization"
  public void clearSpecialization()
  // -end- 335C146B01D6 remove_all_head358A5E2403D8 "GeneralizableElement::clearSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 remove_all_body358A5E2403D8 "GeneralizableElement::clearSpecialization"
    if(sizeSpecialization()>0){
      for(java.util.Iterator p = specialization.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkParent(this);
      }
      specialization.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecialization"));
    }
    // -end- 335C146B01D6 remove_all_body358A5E2403D8 "GeneralizableElement::clearSpecialization"
  }

  /** returns the number of Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 size_head358A5E2403D8 "GeneralizableElement::sizeSpecialization"
  public int sizeSpecialization()
  // -end- 335C146B01D6 size_head358A5E2403D8 "GeneralizableElement::sizeSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 size_body358A5E2403D8 "GeneralizableElement::sizeSpecialization"
    return specialization.size();
    // -end- 335C146B01D6 size_body358A5E2403D8 "GeneralizableElement::sizeSpecialization"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _link_body358A5E2403D8 "GeneralizableElement::_linkSpecialization"
  public void _linkSpecialization(Generalization specialization1)
  {
    specialization.add(specialization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecialization"));
    return;
  }
  // -end- 335C146B01D6 _link_body358A5E2403D8 "GeneralizableElement::_linkSpecialization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _unlink_body358A5E2403D8 "GeneralizableElement::_unlinkSpecialization"
  public void _unlinkSpecialization(Generalization specialization1)
  {
    specialization.remove(specialization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecialization"));
    return;
  }
  // -end- 335C146B01D6 _unlink_body358A5E2403D8 "GeneralizableElement::_unlinkSpecialization"

  // -beg- preserve=no 44897D730306 code358A5E2403D8 "enumTreeValueType"
  private java.util.Set enumTreeValueType = new java.util.HashSet();
  // -end- 44897D730306 code358A5E2403D8 "enumTreeValueType"

  /** add a EnumTreeValueType.
   *  
   *  @see #removeEnumTreeValueType
   *  @see #containsEnumTreeValueType
   *  @see #iteratorEnumTreeValueType
   *  @see #clearEnumTreeValueType
   *  @see #sizeEnumTreeValueType
   */
  // -beg- preserve=no 44897D730306 add_head358A5E2403D8 "DomainDef::addEnumTreeValueType"
  public void addEnumTreeValueType(EnumTreeValueType enumTreeValueType1)
  // -end- 44897D730306 add_head358A5E2403D8 "DomainDef::addEnumTreeValueType"
  {
    // -beg- preserve=no 44897D730306 add_body358A5E2403D8 "DomainDef::addEnumTreeValueType"
    enumTreeValueType.add(enumTreeValueType1);
    enumTreeValueType1._linkEnumBasedOn(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addEnumTreeValueType"));
    return;
    // -end- 44897D730306 add_body358A5E2403D8 "DomainDef::addEnumTreeValueType"
  }

  /** disconnect a EnumTreeValueType.
   *  @see #addEnumTreeValueType
   */
  // -beg- preserve=no 44897D730306 remove_head358A5E2403D8 "DomainDef::removeEnumTreeValueType"
  public EnumTreeValueType removeEnumTreeValueType(EnumTreeValueType enumTreeValueType1)
  // -end- 44897D730306 remove_head358A5E2403D8 "DomainDef::removeEnumTreeValueType"
  {
    // -beg- preserve=no 44897D730306 remove_body358A5E2403D8 "DomainDef::removeEnumTreeValueType"
    EnumTreeValueType ret=null;
    if(enumTreeValueType1==null || !enumTreeValueType.contains(enumTreeValueType1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = enumTreeValueType1;
    enumTreeValueType.remove(enumTreeValueType1);
    enumTreeValueType1._unlinkEnumBasedOn(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeEnumTreeValueType"));
    return ret;
    // -end- 44897D730306 remove_body358A5E2403D8 "DomainDef::removeEnumTreeValueType"
  }

  /** tests if a given EnumTreeValueType is connected.
   *  @see #addEnumTreeValueType
   */
  // -beg- preserve=no 44897D730306 test_head358A5E2403D8 "DomainDef::containsEnumTreeValueType"
  public boolean containsEnumTreeValueType(EnumTreeValueType enumTreeValueType1)
  // -end- 44897D730306 test_head358A5E2403D8 "DomainDef::containsEnumTreeValueType"
  {
    // -beg- preserve=no 44897D730306 test_body358A5E2403D8 "DomainDef::containsEnumTreeValueType"
    return enumTreeValueType.contains(enumTreeValueType1);
    // -end- 44897D730306 test_body358A5E2403D8 "DomainDef::containsEnumTreeValueType"
  }

  /** used to enumerate all connected EnumTreeValueTypes.
   *  @see #addEnumTreeValueType
   */
  // -beg- preserve=no 44897D730306 get_all_head358A5E2403D8 "DomainDef::iteratorEnumTreeValueType"
  public java.util.Iterator iteratorEnumTreeValueType()
  // -end- 44897D730306 get_all_head358A5E2403D8 "DomainDef::iteratorEnumTreeValueType"
  {
    // -beg- preserve=no 44897D730306 get_all_body358A5E2403D8 "DomainDef::iteratorEnumTreeValueType"
    return enumTreeValueType.iterator();
    // -end- 44897D730306 get_all_body358A5E2403D8 "DomainDef::iteratorEnumTreeValueType"
  }

  /** disconnect all EnumTreeValueTypes.
   *  @see #addEnumTreeValueType
   */
  // -beg- preserve=no 44897D730306 remove_all_head358A5E2403D8 "DomainDef::clearEnumTreeValueType"
  public void clearEnumTreeValueType()
  // -end- 44897D730306 remove_all_head358A5E2403D8 "DomainDef::clearEnumTreeValueType"
  {
    // -beg- preserve=no 44897D730306 remove_all_body358A5E2403D8 "DomainDef::clearEnumTreeValueType"
    if(sizeEnumTreeValueType()>0){
      for(java.util.Iterator p = enumTreeValueType.iterator(); p.hasNext();){
        ((EnumTreeValueType)p.next())._unlinkEnumBasedOn(this);
      }
      enumTreeValueType.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearEnumTreeValueType"));
    }
    // -end- 44897D730306 remove_all_body358A5E2403D8 "DomainDef::clearEnumTreeValueType"
  }

  /** returns the number of EnumTreeValueTypes.
   *  @see #addEnumTreeValueType
   */
  // -beg- preserve=no 44897D730306 size_head358A5E2403D8 "DomainDef::sizeEnumTreeValueType"
  public int sizeEnumTreeValueType()
  // -end- 44897D730306 size_head358A5E2403D8 "DomainDef::sizeEnumTreeValueType"
  {
    // -beg- preserve=no 44897D730306 size_body358A5E2403D8 "DomainDef::sizeEnumTreeValueType"
    return enumTreeValueType.size();
    // -end- 44897D730306 size_body358A5E2403D8 "DomainDef::sizeEnumTreeValueType"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 44897D730306 _link_body358A5E2403D8 "DomainDef::_linkEnumTreeValueType"
  public void _linkEnumTreeValueType(EnumTreeValueType enumTreeValueType1)
  {
    enumTreeValueType.add(enumTreeValueType1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkEnumTreeValueType"));
    return;
  }
  // -end- 44897D730306 _link_body358A5E2403D8 "DomainDef::_linkEnumTreeValueType"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 44897D730306 _unlink_body358A5E2403D8 "DomainDef::_unlinkEnumTreeValueType"
  public void _unlinkEnumTreeValueType(EnumTreeValueType enumTreeValueType1)
  {
    enumTreeValueType.remove(enumTreeValueType1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkEnumTreeValueType"));
    return;
  }
  // -end- 44897D730306 _unlink_body358A5E2403D8 "DomainDef::_unlinkEnumTreeValueType"

  // -beg- preserve=no 3948F00C0213 code358A5E2403D8 "lineType"
  private LineType lineType;
  // -end- 3948F00C0213 code358A5E2403D8 "lineType"

  /** attaches a LineType.
   *  
   *  @see #detachLineType
   *  @see #getLineType
   *  @see #containsLineType
   */
  // -beg- preserve=no 3948F00C0213 attach_head358A5E2403D8 "DomainDef::attachLineType"
  public void attachLineType(LineType lineType1)
  // -end- 3948F00C0213 attach_head358A5E2403D8 "DomainDef::attachLineType"
  {
    // -beg- preserve=no 3948F00C0213 attach_body358A5E2403D8 "DomainDef::attachLineType"
    if(lineType!=null) {throw new java.lang.IllegalStateException("already a lineType attached");}
    if(lineType1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as lineType");}
    lineType = lineType1;
    lineType1._linkControlpoints(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachLineType"));
    return;
    // -end- 3948F00C0213 attach_body358A5E2403D8 "DomainDef::attachLineType"
  }

  /** disconnect the currently attached LineType.
   *  @see #attachLineType
   */
  // -beg- preserve=no 3948F00C0213 detach_head358A5E2403D8 "DomainDef::detachLineType"
  public LineType detachLineType()
  // -end- 3948F00C0213 detach_head358A5E2403D8 "DomainDef::detachLineType"
  {
    // -beg- preserve=no 3948F00C0213 detach_body358A5E2403D8 "DomainDef::detachLineType"
    LineType ret = null;
    if(lineType!=null){
      lineType._unlinkControlpoints(this);
      ret = lineType;
      lineType = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachLineType"));
    return ret;
    // -end- 3948F00C0213 detach_body358A5E2403D8 "DomainDef::detachLineType"
  }

  /** get the currently attached LineType.
   *  @see #attachLineType
   */
  // -beg- preserve=no 3948F00C0213 get_head358A5E2403D8 "DomainDef::getLineType"
  public LineType getLineType()
  // -end- 3948F00C0213 get_head358A5E2403D8 "DomainDef::getLineType"
  {
    // -beg- preserve=no 3948F00C0213 get_body358A5E2403D8 "DomainDef::getLineType"
    if(lineType==null) {throw new java.lang.IllegalStateException("no lineType attached");}
    return lineType;
    // -end- 3948F00C0213 get_body358A5E2403D8 "DomainDef::getLineType"
  }

  /** tests if there is a LineType attached.
   *  @see #attachLineType
   */
  // -beg- preserve=no 3948F00C0213 test_head358A5E2403D8 "DomainDef::containsLineType"
  public boolean containsLineType()
  // -end- 3948F00C0213 test_head358A5E2403D8 "DomainDef::containsLineType"
  {
    // -beg- preserve=no 3948F00C0213 test_body358A5E2403D8 "DomainDef::containsLineType"
    return lineType!=null;
    // -end- 3948F00C0213 test_body358A5E2403D8 "DomainDef::containsLineType"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3948F00C0213 _link_body358A5E2403D8 "DomainDef::_linkLineType"
  public void _linkLineType(LineType lineType1)
  {
    lineType = lineType1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkLineType"));
    return;
  }
  // -end- 3948F00C0213 _link_body358A5E2403D8 "DomainDef::_linkLineType"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3948F00C0213 _unlink_body358A5E2403D8 "DomainDef::_unlinkLineType"
  public void _unlinkLineType(LineType lineType1)
  {
    lineType = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkLineType"));
    return;
  }
  // -end- 3948F00C0213 _unlink_body358A5E2403D8 "DomainDef::_unlinkLineType"

  // -beg- preserve=no 358A612E03B8 var358A5E2403D8 "name"

  // -end- 358A612E03B8 var358A5E2403D8 "name"

  /** get current value of name
   *  Name des Wertebereichs
   *  @see #setName
   */
  // -beg- preserve=no 358A612E03B8 get_head358A5E2403D8 "name"
  public  NlsString getName()
  // -end- 358A612E03B8 get_head358A5E2403D8 "name"
  {
    // -beg- preserve=no 358A612E03B8 get_body358A5E2403D8 "name"
    return super.getName();
    // -end- 358A612E03B8 get_body358A5E2403D8 "name"
  }

  /** set current value of name
   *  @see #getName
   */
  // -beg- preserve=no 358A612E03B8 set_head358A5E2403D8 "name"
  public  void setName(NlsString value1)
  // -end- 358A612E03B8 set_head358A5E2403D8 "name"
  {
    // -beg- preserve=no 358A612E03B8 set_body358A5E2403D8 "name"
    super.setName(value1);
    // -end- 358A612E03B8 set_body358A5E2403D8 "name"
  }

  // -beg- preserve=no 39479DD502F3 var358A5E2403D8 "mandatory"
  private boolean mandatory;
  // -end- 39479DD502F3 var358A5E2403D8 "mandatory"

  /** get current value of mandatory
   *  definiert ob der UNDEFINED Wert auch zum Wertebereich gehört.
   *  @see #setMandatory
   */
  // -beg- preserve=no 39479DD502F3 get_head358A5E2403D8 "mandatory"
  public  boolean isMandatory()
  // -end- 39479DD502F3 get_head358A5E2403D8 "mandatory"
  {
    // -beg- preserve=no 39479DD502F3 get_body358A5E2403D8 "mandatory"
    return mandatory;
    // -end- 39479DD502F3 get_body358A5E2403D8 "mandatory"
  }

  /** set current value of mandatory
   *  @see #isMandatory
   */
  // -beg- preserve=no 39479DD502F3 set_head358A5E2403D8 "mandatory"
  public  void setMandatory(boolean value1)
  // -end- 39479DD502F3 set_head358A5E2403D8 "mandatory"
  {
    // -beg- preserve=no 39479DD502F3 set_body358A5E2403D8 "mandatory"
    if(mandatory != value1){
      mandatory = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMandatory"));
    }
    // -end- 39479DD502F3 set_body358A5E2403D8 "mandatory"
  }

  // -beg- preserve=no 3C1DD56200F0 var358A5E2403D8 "isAbstract"
  private boolean isAbstract;
  // -end- 3C1DD56200F0 var358A5E2403D8 "isAbstract"

  /** get current value of isAbstract
   *  @see #setAbstract
   */
  // -beg- preserve=no 3C1DD56200F0 get_head358A5E2403D8 "isAbstract"
  public  boolean isAbstract()
  // -end- 3C1DD56200F0 get_head358A5E2403D8 "isAbstract"
  {
    // -beg- preserve=no 3C1DD56200F0 get_body358A5E2403D8 "isAbstract"
    return isAbstract;
    // -end- 3C1DD56200F0 get_body358A5E2403D8 "isAbstract"
  }

  /** set current value of isAbstract
   *  @see #isAbstract
   */
  // -beg- preserve=no 3C1DD56200F0 set_head358A5E2403D8 "isAbstract"
  public  void setAbstract(boolean value1)
  // -end- 3C1DD56200F0 set_head358A5E2403D8 "isAbstract"
  {
    // -beg- preserve=no 3C1DD56200F0 set_body358A5E2403D8 "isAbstract"
    if(isAbstract != value1){
      isAbstract = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
    }
    // -end- 3C1DD56200F0 set_body358A5E2403D8 "isAbstract"
  }

  // -beg- preserve=no 3C1DD56C023F var358A5E2403D8 "propFinal"
  private boolean propFinal;
  // -end- 3C1DD56C023F var358A5E2403D8 "propFinal"

  /** get current value of propFinal
   *  @see #setPropFinal
   */
  // -beg- preserve=no 3C1DD56C023F get_head358A5E2403D8 "propFinal"
  public  boolean isPropFinal()
  // -end- 3C1DD56C023F get_head358A5E2403D8 "propFinal"
  {
    // -beg- preserve=no 3C1DD56C023F get_body358A5E2403D8 "propFinal"
    return propFinal;
    // -end- 3C1DD56C023F get_body358A5E2403D8 "propFinal"
  }

  /** set current value of propFinal
   *  @see #isPropFinal
   */
  // -beg- preserve=no 3C1DD56C023F set_head358A5E2403D8 "propFinal"
  public  void setPropFinal(boolean value1)
  // -end- 3C1DD56C023F set_head358A5E2403D8 "propFinal"
  {
    // -beg- preserve=no 3C1DD56C023F set_body358A5E2403D8 "propFinal"
    if(propFinal != value1){
      propFinal = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPropFinal"));
    }
    // -end- 3C1DD56C023F set_body358A5E2403D8 "propFinal"
  }

  /** tests if this Classifier contains a Feature with the given name
   */
  // -beg- preserve=no 3CB2C64E0374 head358A5E2403D8 "containsFeature"
  public boolean containsFeature(String name)
  // -end- 3CB2C64E0374 head358A5E2403D8 "containsFeature"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CB2C64E0374 throws358A5E2403D8 "containsFeature"

    // -end- 3CB2C64E0374 throws358A5E2403D8 "containsFeature"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CB2C64E0374 body358A5E2403D8 "containsFeature"
    java.util.Iterator it=iteratorFeature();
    while(it.hasNext()){
      ModelElement ele=(ModelElement)it.next();
      if(ele.getName().equals(name)){
        return true;
      }
    }
    return false;
    // -end- 3CB2C64E0374 body358A5E2403D8 "containsFeature"
    }

  // -beg- preserve=no 33CF9EFC006E code358A5E2403D8 "objectFlowState"
  private java.util.Set objectFlowState = new java.util.HashSet();
  // -end- 33CF9EFC006E code358A5E2403D8 "objectFlowState"

  /** add a ObjectFlowState.
   *  
   *  @see #removeObjectFlowState
   *  @see #containsObjectFlowState
   *  @see #iteratorObjectFlowState
   *  @see #clearObjectFlowState
   *  @see #sizeObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E add_head358A5E2403D8 "Classifier::addObjectFlowState"
  public void addObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E add_head358A5E2403D8 "Classifier::addObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E add_body358A5E2403D8 "Classifier::addObjectFlowState"
    objectFlowState.add(objectFlowState1);
    objectFlowState1._linkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addObjectFlowState"));
    return;
    // -end- 33CF9EFC006E add_body358A5E2403D8 "Classifier::addObjectFlowState"
  }

  /** disconnect a ObjectFlowState.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E remove_head358A5E2403D8 "Classifier::removeObjectFlowState"
  public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E remove_head358A5E2403D8 "Classifier::removeObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E remove_body358A5E2403D8 "Classifier::removeObjectFlowState"
    ObjectFlowState ret=null;
    if(objectFlowState1==null || !objectFlowState.contains(objectFlowState1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = objectFlowState1;
    objectFlowState.remove(objectFlowState1);
    objectFlowState1._unlinkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeObjectFlowState"));
    return ret;
    // -end- 33CF9EFC006E remove_body358A5E2403D8 "Classifier::removeObjectFlowState"
  }

  /** tests if a given ObjectFlowState is connected.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E test_head358A5E2403D8 "Classifier::containsObjectFlowState"
  public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E test_head358A5E2403D8 "Classifier::containsObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E test_body358A5E2403D8 "Classifier::containsObjectFlowState"
    return objectFlowState.contains(objectFlowState1);
    // -end- 33CF9EFC006E test_body358A5E2403D8 "Classifier::containsObjectFlowState"
  }

  /** used to enumerate all connected ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E get_all_head358A5E2403D8 "Classifier::iteratorObjectFlowState"
  public java.util.Iterator iteratorObjectFlowState()
  // -end- 33CF9EFC006E get_all_head358A5E2403D8 "Classifier::iteratorObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E get_all_body358A5E2403D8 "Classifier::iteratorObjectFlowState"
    return objectFlowState.iterator();
    // -end- 33CF9EFC006E get_all_body358A5E2403D8 "Classifier::iteratorObjectFlowState"
  }

  /** disconnect all ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E remove_all_head358A5E2403D8 "Classifier::clearObjectFlowState"
  public void clearObjectFlowState()
  // -end- 33CF9EFC006E remove_all_head358A5E2403D8 "Classifier::clearObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E remove_all_body358A5E2403D8 "Classifier::clearObjectFlowState"
    if(sizeObjectFlowState()>0){
      for(java.util.Iterator p = objectFlowState.iterator(); p.hasNext();){
        ((ObjectFlowState)p.next())._unlinkType(this);
      }
      objectFlowState.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearObjectFlowState"));
    }
    // -end- 33CF9EFC006E remove_all_body358A5E2403D8 "Classifier::clearObjectFlowState"
  }

  /** returns the number of ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E size_head358A5E2403D8 "Classifier::sizeObjectFlowState"
  public int sizeObjectFlowState()
  // -end- 33CF9EFC006E size_head358A5E2403D8 "Classifier::sizeObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E size_body358A5E2403D8 "Classifier::sizeObjectFlowState"
    return objectFlowState.size();
    // -end- 33CF9EFC006E size_body358A5E2403D8 "Classifier::sizeObjectFlowState"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006E _link_body358A5E2403D8 "Classifier::_linkObjectFlowState"
  public void _linkObjectFlowState(ObjectFlowState objectFlowState1)
  {
    objectFlowState.add(objectFlowState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkObjectFlowState"));
    return;
  }
  // -end- 33CF9EFC006E _link_body358A5E2403D8 "Classifier::_linkObjectFlowState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006E _unlink_body358A5E2403D8 "Classifier::_unlinkObjectFlowState"
  public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1)
  {
    objectFlowState.remove(objectFlowState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkObjectFlowState"));
    return;
  }
  // -end- 33CF9EFC006E _unlink_body358A5E2403D8 "Classifier::_unlinkObjectFlowState"

  // -beg- preserve=no 33CF9F1602BC code358A5E2403D8 "classifierInState"
  private java.util.Set classifierInState = new java.util.HashSet();
  // -end- 33CF9F1602BC code358A5E2403D8 "classifierInState"

  /** add a ClassifierInState.
   *  
   *  @see #removeClassifierInState
   *  @see #containsClassifierInState
   *  @see #iteratorClassifierInState
   *  @see #clearClassifierInState
   *  @see #sizeClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC add_head358A5E2403D8 "Classifier::addClassifierInState"
  public void addClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC add_head358A5E2403D8 "Classifier::addClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC add_body358A5E2403D8 "Classifier::addClassifierInState"
    classifierInState.add(classifierInState1);
    classifierInState1._linkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClassifierInState"));
    return;
    // -end- 33CF9F1602BC add_body358A5E2403D8 "Classifier::addClassifierInState"
  }

  /** disconnect a ClassifierInState.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC remove_head358A5E2403D8 "Classifier::removeClassifierInState"
  public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC remove_head358A5E2403D8 "Classifier::removeClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC remove_body358A5E2403D8 "Classifier::removeClassifierInState"
    ClassifierInState ret=null;
    if(classifierInState1==null || !classifierInState.contains(classifierInState1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = classifierInState1;
    classifierInState.remove(classifierInState1);
    classifierInState1._unlinkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClassifierInState"));
    return ret;
    // -end- 33CF9F1602BC remove_body358A5E2403D8 "Classifier::removeClassifierInState"
  }

  /** tests if a given ClassifierInState is connected.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC test_head358A5E2403D8 "Classifier::containsClassifierInState"
  public boolean containsClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC test_head358A5E2403D8 "Classifier::containsClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC test_body358A5E2403D8 "Classifier::containsClassifierInState"
    return classifierInState.contains(classifierInState1);
    // -end- 33CF9F1602BC test_body358A5E2403D8 "Classifier::containsClassifierInState"
  }

  /** used to enumerate all connected ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC get_all_head358A5E2403D8 "Classifier::iteratorClassifierInState"
  public java.util.Iterator iteratorClassifierInState()
  // -end- 33CF9F1602BC get_all_head358A5E2403D8 "Classifier::iteratorClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC get_all_body358A5E2403D8 "Classifier::iteratorClassifierInState"
    return classifierInState.iterator();
    // -end- 33CF9F1602BC get_all_body358A5E2403D8 "Classifier::iteratorClassifierInState"
  }

  /** disconnect all ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC remove_all_head358A5E2403D8 "Classifier::clearClassifierInState"
  public void clearClassifierInState()
  // -end- 33CF9F1602BC remove_all_head358A5E2403D8 "Classifier::clearClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC remove_all_body358A5E2403D8 "Classifier::clearClassifierInState"
    if(sizeClassifierInState()>0){
      for(java.util.Iterator p = classifierInState.iterator(); p.hasNext();){
        ((ClassifierInState)p.next())._unlinkType(this);
      }
      classifierInState.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClassifierInState"));
    }
    // -end- 33CF9F1602BC remove_all_body358A5E2403D8 "Classifier::clearClassifierInState"
  }

  /** returns the number of ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC size_head358A5E2403D8 "Classifier::sizeClassifierInState"
  public int sizeClassifierInState()
  // -end- 33CF9F1602BC size_head358A5E2403D8 "Classifier::sizeClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC size_body358A5E2403D8 "Classifier::sizeClassifierInState"
    return classifierInState.size();
    // -end- 33CF9F1602BC size_body358A5E2403D8 "Classifier::sizeClassifierInState"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F1602BC _link_body358A5E2403D8 "Classifier::_linkClassifierInState"
  public void _linkClassifierInState(ClassifierInState classifierInState1)
  {
    classifierInState.add(classifierInState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassifierInState"));
    return;
  }
  // -end- 33CF9F1602BC _link_body358A5E2403D8 "Classifier::_linkClassifierInState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F1602BC _unlink_body358A5E2403D8 "Classifier::_unlinkClassifierInState"
  public void _unlinkClassifierInState(ClassifierInState classifierInState1)
  {
    classifierInState.remove(classifierInState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassifierInState"));
    return;
  }
  // -end- 33CF9F1602BC _unlink_body358A5E2403D8 "Classifier::_unlinkClassifierInState"

  // -beg- preserve=no 36008FB700E7 code358A5E2403D8 "classifierRole"

  // -end- 36008FB700E7 code358A5E2403D8 "classifierRole"

  /** add a ClassifierRole.
   *  
   *  @see #removeClassifierRole
   *  @see #containsClassifierRole
   *  @see #iteratorClassifierRole
   *  @see #clearClassifierRole
   *  @see #sizeClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 add_head358A5E2403D8 "ModelElement::addClassifierRole"
  public void addClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 add_head358A5E2403D8 "ModelElement::addClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 add_body358A5E2403D8 "ModelElement::addClassifierRole"
    super.addClassifierRole(classifierRole1);
    // -end- 36008FB700E7 add_body358A5E2403D8 "ModelElement::addClassifierRole"
  }

  /** disconnect a ClassifierRole.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_head358A5E2403D8 "ModelElement::removeClassifierRole"
  public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 remove_head358A5E2403D8 "ModelElement::removeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_body358A5E2403D8 "ModelElement::removeClassifierRole"
    return super.removeClassifierRole(classifierRole1);
    // -end- 36008FB700E7 remove_body358A5E2403D8 "ModelElement::removeClassifierRole"
  }

  /** tests if a given ClassifierRole is connected.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 test_head358A5E2403D8 "ModelElement::containsClassifierRole"
  public boolean containsClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 test_head358A5E2403D8 "ModelElement::containsClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 test_body358A5E2403D8 "ModelElement::containsClassifierRole"
    return super.containsClassifierRole(classifierRole1);
    // -end- 36008FB700E7 test_body358A5E2403D8 "ModelElement::containsClassifierRole"
  }

  /** used to enumerate all connected ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 get_all_head358A5E2403D8 "ModelElement::iteratorClassifierRole"
  public java.util.Iterator iteratorClassifierRole()
  // -end- 36008FB700E7 get_all_head358A5E2403D8 "ModelElement::iteratorClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 get_all_body358A5E2403D8 "ModelElement::iteratorClassifierRole"
    return super.iteratorClassifierRole();
    // -end- 36008FB700E7 get_all_body358A5E2403D8 "ModelElement::iteratorClassifierRole"
  }

  /** disconnect all ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_all_head358A5E2403D8 "ModelElement::clearClassifierRole"
  public void clearClassifierRole()
  // -end- 36008FB700E7 remove_all_head358A5E2403D8 "ModelElement::clearClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_all_body358A5E2403D8 "ModelElement::clearClassifierRole"
    super.clearClassifierRole();
    // -end- 36008FB700E7 remove_all_body358A5E2403D8 "ModelElement::clearClassifierRole"
  }

  /** returns the number of ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 size_head358A5E2403D8 "ModelElement::sizeClassifierRole"
  public int sizeClassifierRole()
  // -end- 36008FB700E7 size_head358A5E2403D8 "ModelElement::sizeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 size_body358A5E2403D8 "ModelElement::sizeClassifierRole"
    return super.sizeClassifierRole();
    // -end- 36008FB700E7 size_body358A5E2403D8 "ModelElement::sizeClassifierRole"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _link_body358A5E2403D8 "ModelElement::_linkClassifierRole"
  public void _linkClassifierRole(ClassifierRole classifierRole1)
  {
    super._linkClassifierRole(classifierRole1);
  }
  // -end- 36008FB700E7 _link_body358A5E2403D8 "ModelElement::_linkClassifierRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _unlink_body358A5E2403D8 "ModelElement::_unlinkClassifierRole"
  public void _unlinkClassifierRole(ClassifierRole classifierRole1)
  {
    super._unlinkClassifierRole(classifierRole1);
  }
  // -end- 36008FB700E7 _unlink_body358A5E2403D8 "ModelElement::_unlinkClassifierRole"

  // -beg- preserve=no 33D1394E029F code358A5E2403D8 "collaboration"

  // -end- 33D1394E029F code358A5E2403D8 "collaboration"

  /** add a Collaboration.
   *  
   *  @see #removeCollaboration
   *  @see #containsCollaboration
   *  @see #iteratorCollaboration
   *  @see #clearCollaboration
   *  @see #sizeCollaboration
   */
  // -beg- preserve=no 33D1394E029F add_head358A5E2403D8 "ModelElement::addCollaboration"
  public void addCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F add_head358A5E2403D8 "ModelElement::addCollaboration"
  {
    // -beg- preserve=no 33D1394E029F add_body358A5E2403D8 "ModelElement::addCollaboration"
    super.addCollaboration(collaboration1);
    // -end- 33D1394E029F add_body358A5E2403D8 "ModelElement::addCollaboration"
  }

  /** disconnect a Collaboration.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_head358A5E2403D8 "ModelElement::removeCollaboration"
  public Collaboration removeCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F remove_head358A5E2403D8 "ModelElement::removeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_body358A5E2403D8 "ModelElement::removeCollaboration"
    return super.removeCollaboration(collaboration1);
    // -end- 33D1394E029F remove_body358A5E2403D8 "ModelElement::removeCollaboration"
  }

  /** tests if a given Collaboration is connected.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F test_head358A5E2403D8 "ModelElement::containsCollaboration"
  public boolean containsCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F test_head358A5E2403D8 "ModelElement::containsCollaboration"
  {
    // -beg- preserve=no 33D1394E029F test_body358A5E2403D8 "ModelElement::containsCollaboration"
    return super.containsCollaboration(collaboration1);
    // -end- 33D1394E029F test_body358A5E2403D8 "ModelElement::containsCollaboration"
  }

  /** used to enumerate all connected Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F get_all_head358A5E2403D8 "ModelElement::iteratorCollaboration"
  public java.util.Iterator iteratorCollaboration()
  // -end- 33D1394E029F get_all_head358A5E2403D8 "ModelElement::iteratorCollaboration"
  {
    // -beg- preserve=no 33D1394E029F get_all_body358A5E2403D8 "ModelElement::iteratorCollaboration"
    return super.iteratorCollaboration();
    // -end- 33D1394E029F get_all_body358A5E2403D8 "ModelElement::iteratorCollaboration"
  }

  /** disconnect all Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_all_head358A5E2403D8 "ModelElement::clearCollaboration"
  public void clearCollaboration()
  // -end- 33D1394E029F remove_all_head358A5E2403D8 "ModelElement::clearCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_all_body358A5E2403D8 "ModelElement::clearCollaboration"
    super.clearCollaboration();
    // -end- 33D1394E029F remove_all_body358A5E2403D8 "ModelElement::clearCollaboration"
  }

  /** returns the number of Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F size_head358A5E2403D8 "ModelElement::sizeCollaboration"
  public int sizeCollaboration()
  // -end- 33D1394E029F size_head358A5E2403D8 "ModelElement::sizeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F size_body358A5E2403D8 "ModelElement::sizeCollaboration"
    return super.sizeCollaboration();
    // -end- 33D1394E029F size_body358A5E2403D8 "ModelElement::sizeCollaboration"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _link_body358A5E2403D8 "ModelElement::_linkCollaboration"
  public void _linkCollaboration(Collaboration collaboration1)
  {
    super._linkCollaboration(collaboration1);
  }
  // -end- 33D1394E029F _link_body358A5E2403D8 "ModelElement::_linkCollaboration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _unlink_body358A5E2403D8 "ModelElement::_unlinkCollaboration"
  public void _unlinkCollaboration(Collaboration collaboration1)
  {
    super._unlinkCollaboration(collaboration1);
  }
  // -end- 33D1394E029F _unlink_body358A5E2403D8 "ModelElement::_unlinkCollaboration"

  // -beg- preserve=no 33CAD7E900AB code358A5E2403D8 "instance"
  private java.util.Set instance = new java.util.HashSet();
  // -end- 33CAD7E900AB code358A5E2403D8 "instance"

  /** add a Instance.
   *  
   *  @see #removeInstance
   *  @see #containsInstance
   *  @see #iteratorInstance
   *  @see #clearInstance
   *  @see #sizeInstance
   */
  // -beg- preserve=no 33CAD7E900AB add_head358A5E2403D8 "Classifier::addInstance"
  public void addInstance(Instance instance1)
  // -end- 33CAD7E900AB add_head358A5E2403D8 "Classifier::addInstance"
  {
    // -beg- preserve=no 33CAD7E900AB add_body358A5E2403D8 "Classifier::addInstance"
    instance.add(instance1);
    instance1._linkClassifier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addInstance"));
    return;
    // -end- 33CAD7E900AB add_body358A5E2403D8 "Classifier::addInstance"
  }

  /** disconnect a Instance.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB remove_head358A5E2403D8 "Classifier::removeInstance"
  public Instance removeInstance(Instance instance1)
  // -end- 33CAD7E900AB remove_head358A5E2403D8 "Classifier::removeInstance"
  {
    // -beg- preserve=no 33CAD7E900AB remove_body358A5E2403D8 "Classifier::removeInstance"
    Instance ret=null;
    if(instance1==null || !instance.contains(instance1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = instance1;
    instance.remove(instance1);
    instance1._unlinkClassifier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeInstance"));
    return ret;
    // -end- 33CAD7E900AB remove_body358A5E2403D8 "Classifier::removeInstance"
  }

  /** tests if a given Instance is connected.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB test_head358A5E2403D8 "Classifier::containsInstance"
  public boolean containsInstance(Instance instance1)
  // -end- 33CAD7E900AB test_head358A5E2403D8 "Classifier::containsInstance"
  {
    // -beg- preserve=no 33CAD7E900AB test_body358A5E2403D8 "Classifier::containsInstance"
    return instance.contains(instance1);
    // -end- 33CAD7E900AB test_body358A5E2403D8 "Classifier::containsInstance"
  }

  /** used to enumerate all connected Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB get_all_head358A5E2403D8 "Classifier::iteratorInstance"
  public java.util.Iterator iteratorInstance()
  // -end- 33CAD7E900AB get_all_head358A5E2403D8 "Classifier::iteratorInstance"
  {
    // -beg- preserve=no 33CAD7E900AB get_all_body358A5E2403D8 "Classifier::iteratorInstance"
    return instance.iterator();
    // -end- 33CAD7E900AB get_all_body358A5E2403D8 "Classifier::iteratorInstance"
  }

  /** disconnect all Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB remove_all_head358A5E2403D8 "Classifier::clearInstance"
  public void clearInstance()
  // -end- 33CAD7E900AB remove_all_head358A5E2403D8 "Classifier::clearInstance"
  {
    // -beg- preserve=no 33CAD7E900AB remove_all_body358A5E2403D8 "Classifier::clearInstance"
    if(sizeInstance()>0){
      for(java.util.Iterator p = instance.iterator(); p.hasNext();){
        ((Instance)p.next())._unlinkClassifier(this);
      }
      instance.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearInstance"));
    }
    // -end- 33CAD7E900AB remove_all_body358A5E2403D8 "Classifier::clearInstance"
  }

  /** returns the number of Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB size_head358A5E2403D8 "Classifier::sizeInstance"
  public int sizeInstance()
  // -end- 33CAD7E900AB size_head358A5E2403D8 "Classifier::sizeInstance"
  {
    // -beg- preserve=no 33CAD7E900AB size_body358A5E2403D8 "Classifier::sizeInstance"
    return instance.size();
    // -end- 33CAD7E900AB size_body358A5E2403D8 "Classifier::sizeInstance"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AB _link_body358A5E2403D8 "Classifier::_linkInstance"
  public void _linkInstance(Instance instance1)
  {
    instance.add(instance1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkInstance"));
    return;
  }
  // -end- 33CAD7E900AB _link_body358A5E2403D8 "Classifier::_linkInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AB _unlink_body358A5E2403D8 "Classifier::_unlinkInstance"
  public void _unlinkInstance(Instance instance1)
  {
    instance.remove(instance1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkInstance"));
    return;
  }
  // -end- 33CAD7E900AB _unlink_body358A5E2403D8 "Classifier::_unlinkInstance"

  // -beg- preserve=no 33CFD0A701A4 code358A5E2403D8 "createAction"
  private java.util.Set createAction = new java.util.HashSet();
  // -end- 33CFD0A701A4 code358A5E2403D8 "createAction"

  /** add a CreateAction.
   *  
   *  @see #removeCreateAction
   *  @see #containsCreateAction
   *  @see #iteratorCreateAction
   *  @see #clearCreateAction
   *  @see #sizeCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 add_head358A5E2403D8 "Classifier::addCreateAction"
  public void addCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 add_head358A5E2403D8 "Classifier::addCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 add_body358A5E2403D8 "Classifier::addCreateAction"
    createAction.add(createAction1);
    createAction1._linkInstantiation(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCreateAction"));
    return;
    // -end- 33CFD0A701A4 add_body358A5E2403D8 "Classifier::addCreateAction"
  }

  /** disconnect a CreateAction.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 remove_head358A5E2403D8 "Classifier::removeCreateAction"
  public CreateAction removeCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 remove_head358A5E2403D8 "Classifier::removeCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 remove_body358A5E2403D8 "Classifier::removeCreateAction"
    CreateAction ret=null;
    if(createAction1==null || !createAction.contains(createAction1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = createAction1;
    createAction.remove(createAction1);
    createAction1._unlinkInstantiation(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCreateAction"));
    return ret;
    // -end- 33CFD0A701A4 remove_body358A5E2403D8 "Classifier::removeCreateAction"
  }

  /** tests if a given CreateAction is connected.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 test_head358A5E2403D8 "Classifier::containsCreateAction"
  public boolean containsCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 test_head358A5E2403D8 "Classifier::containsCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 test_body358A5E2403D8 "Classifier::containsCreateAction"
    return createAction.contains(createAction1);
    // -end- 33CFD0A701A4 test_body358A5E2403D8 "Classifier::containsCreateAction"
  }

  /** used to enumerate all connected CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 get_all_head358A5E2403D8 "Classifier::iteratorCreateAction"
  public java.util.Iterator iteratorCreateAction()
  // -end- 33CFD0A701A4 get_all_head358A5E2403D8 "Classifier::iteratorCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 get_all_body358A5E2403D8 "Classifier::iteratorCreateAction"
    return createAction.iterator();
    // -end- 33CFD0A701A4 get_all_body358A5E2403D8 "Classifier::iteratorCreateAction"
  }

  /** disconnect all CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 remove_all_head358A5E2403D8 "Classifier::clearCreateAction"
  public void clearCreateAction()
  // -end- 33CFD0A701A4 remove_all_head358A5E2403D8 "Classifier::clearCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 remove_all_body358A5E2403D8 "Classifier::clearCreateAction"
    if(sizeCreateAction()>0){
      for(java.util.Iterator p = createAction.iterator(); p.hasNext();){
        ((CreateAction)p.next())._unlinkInstantiation(this);
      }
      createAction.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCreateAction"));
    }
    // -end- 33CFD0A701A4 remove_all_body358A5E2403D8 "Classifier::clearCreateAction"
  }

  /** returns the number of CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 size_head358A5E2403D8 "Classifier::sizeCreateAction"
  public int sizeCreateAction()
  // -end- 33CFD0A701A4 size_head358A5E2403D8 "Classifier::sizeCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 size_body358A5E2403D8 "Classifier::sizeCreateAction"
    return createAction.size();
    // -end- 33CFD0A701A4 size_body358A5E2403D8 "Classifier::sizeCreateAction"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A701A4 _link_body358A5E2403D8 "Classifier::_linkCreateAction"
  public void _linkCreateAction(CreateAction createAction1)
  {
    createAction.add(createAction1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCreateAction"));
    return;
  }
  // -end- 33CFD0A701A4 _link_body358A5E2403D8 "Classifier::_linkCreateAction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A701A4 _unlink_body358A5E2403D8 "Classifier::_unlinkCreateAction"
  public void _unlinkCreateAction(CreateAction createAction1)
  {
    createAction.remove(createAction1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCreateAction"));
    return;
  }
  // -end- 33CFD0A701A4 _unlink_body358A5E2403D8 "Classifier::_unlinkCreateAction"

  // -beg- preserve=no 32B5D7EF03D3 code358A5E2403D8 "feature"
  private java.util.List feature = new java.util.ArrayList();
  // -end- 32B5D7EF03D3 code358A5E2403D8 "feature"

  /** add a Feature.
   *  
   *  @see #removeFeature
   *  @see #containsFeature
   *  @see #iteratorFeature
   *  @see #clearFeature
   *  @see #sizeFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 add_head358A5E2403D8 "Classifier::addFeature"
  public void addFeature(Feature feature1)
  // -end- 32B5D7EF03D3 add_head358A5E2403D8 "Classifier::addFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 add_body358A5E2403D8 "Classifier::addFeature"
    feature.add(feature1);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addFeature"));
    return;
    // -end- 32B5D7EF03D3 add_body358A5E2403D8 "Classifier::addFeature"
  }

  // -beg- preserve=no 32B5D7EF03D3 add2_head358A5E2403D8 "Classifier::add2Feature"
  public void addFeature(int index,Feature feature1)
  // -end- 32B5D7EF03D3 add2_head358A5E2403D8 "Classifier::add2Feature"
  {
    // -beg- preserve=no 32B5D7EF03D3 add2_body358A5E2403D8 "Classifier::add2Feature"
    feature.add(index,feature1);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addFeature"));
    return;
    // -end- 32B5D7EF03D3 add2_body358A5E2403D8 "Classifier::add2Feature"
  }

  /** disconnect a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove_head358A5E2403D8 "Classifier::removeFeature"
  public Feature removeFeature(Feature feature1)
  // -end- 32B5D7EF03D3 remove_head358A5E2403D8 "Classifier::removeFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove_body358A5E2403D8 "Classifier::removeFeature"
    Feature ret=null;
    if(feature1==null || !feature.contains(feature1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = feature1;
    feature.remove(feature1);
    feature1._unlinkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeFeature"));
    return ret;
    // -end- 32B5D7EF03D3 remove_body358A5E2403D8 "Classifier::removeFeature"
  }

  /** disconnect a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove2_head358A5E2403D8 "Classifier::remove2Feature"
  public Feature removeFeature(int index)
  // -end- 32B5D7EF03D3 remove2_head358A5E2403D8 "Classifier::remove2Feature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove2_body358A5E2403D8 "Classifier::remove2Feature"
    Feature ret=null;
    ret = (Feature)feature.remove(index);
    ret._unlinkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeFeature"));
    return ret;
    // -end- 32B5D7EF03D3 remove2_body358A5E2403D8 "Classifier::remove2Feature"
  }

  /** change a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 set_head358A5E2403D8 "Classifier::setFeature"
  public Feature setFeature(int index,Feature feature1)
  // -end- 32B5D7EF03D3 set_head358A5E2403D8 "Classifier::setFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 set_body358A5E2403D8 "Classifier::setFeature"
    Feature ret=null;
    ret = (Feature)feature.set(index,feature1);
    ret._unlinkOwner(this);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setFeature"));
    return ret;
    // -end- 32B5D7EF03D3 set_body358A5E2403D8 "Classifier::setFeature"
  }

  /** tests if a given Feature is connected.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 test_head358A5E2403D8 "Classifier::containsFeature"
  public boolean containsFeature(Feature feature1)
  // -end- 32B5D7EF03D3 test_head358A5E2403D8 "Classifier::containsFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 test_body358A5E2403D8 "Classifier::containsFeature"
    return feature.contains(feature1);
    // -end- 32B5D7EF03D3 test_body358A5E2403D8 "Classifier::containsFeature"
  }

  /** used to enumerate all connected Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 get_all_head358A5E2403D8 "Classifier::iteratorFeature"
  public java.util.Iterator iteratorFeature()
  // -end- 32B5D7EF03D3 get_all_head358A5E2403D8 "Classifier::iteratorFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 get_all_body358A5E2403D8 "Classifier::iteratorFeature"
    return feature.iterator();
    // -end- 32B5D7EF03D3 get_all_body358A5E2403D8 "Classifier::iteratorFeature"
  }

  /** disconnect all Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove_all_head358A5E2403D8 "Classifier::clearFeature"
  public void clearFeature()
  // -end- 32B5D7EF03D3 remove_all_head358A5E2403D8 "Classifier::clearFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove_all_body358A5E2403D8 "Classifier::clearFeature"
    if(sizeFeature()>0){
      for(java.util.Iterator p = feature.iterator(); p.hasNext();){
        ((Feature)p.next())._unlinkOwner(this);
      }
      feature.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearFeature"));
    }
    // -end- 32B5D7EF03D3 remove_all_body358A5E2403D8 "Classifier::clearFeature"
  }

  /** returns the number of Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 size_head358A5E2403D8 "Classifier::sizeFeature"
  public int sizeFeature()
  // -end- 32B5D7EF03D3 size_head358A5E2403D8 "Classifier::sizeFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 size_body358A5E2403D8 "Classifier::sizeFeature"
    return feature.size();
    // -end- 32B5D7EF03D3 size_body358A5E2403D8 "Classifier::sizeFeature"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03D3 _link_body358A5E2403D8 "Classifier::_linkFeature"
  public void _linkFeature(Feature feature1)
  {
    feature.add(feature1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkFeature"));
    return;
  }
  // -end- 32B5D7EF03D3 _link_body358A5E2403D8 "Classifier::_linkFeature"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03D3 _unlink_body358A5E2403D8 "Classifier::_unlinkFeature"
  public void _unlinkFeature(Feature feature1)
  {
    feature.remove(feature1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkFeature"));
    return;
  }
  // -end- 32B5D7EF03D3 _unlink_body358A5E2403D8 "Classifier::_unlinkFeature"

  // -beg- preserve=no 33E265070353 code358A5E2403D8 "association"
  private java.util.Set association = new java.util.HashSet();
  // -end- 33E265070353 code358A5E2403D8 "association"

  /** add a Association.
   *  
   *  @see #removeAssociation
   *  @see #containsAssociation
   *  @see #iteratorAssociation
   *  @see #clearAssociation
   *  @see #sizeAssociation
   */
  // -beg- preserve=no 33E265070353 add_head358A5E2403D8 "Classifier::addAssociation"
  public void addAssociation(AssociationEnd association1)
  // -end- 33E265070353 add_head358A5E2403D8 "Classifier::addAssociation"
  {
    // -beg- preserve=no 33E265070353 add_body358A5E2403D8 "Classifier::addAssociation"
    association.add(association1);
    association1._linkParticipant(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addAssociation"));
    return;
    // -end- 33E265070353 add_body358A5E2403D8 "Classifier::addAssociation"
  }

  /** disconnect a Association.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 remove_head358A5E2403D8 "Classifier::removeAssociation"
  public AssociationEnd removeAssociation(AssociationEnd association1)
  // -end- 33E265070353 remove_head358A5E2403D8 "Classifier::removeAssociation"
  {
    // -beg- preserve=no 33E265070353 remove_body358A5E2403D8 "Classifier::removeAssociation"
    AssociationEnd ret=null;
    if(association1==null || !association.contains(association1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = association1;
    association.remove(association1);
    association1._unlinkParticipant(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeAssociation"));
    return ret;
    // -end- 33E265070353 remove_body358A5E2403D8 "Classifier::removeAssociation"
  }

  /** tests if a given Association is connected.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 test_head358A5E2403D8 "Classifier::containsAssociation"
  public boolean containsAssociation(AssociationEnd association1)
  // -end- 33E265070353 test_head358A5E2403D8 "Classifier::containsAssociation"
  {
    // -beg- preserve=no 33E265070353 test_body358A5E2403D8 "Classifier::containsAssociation"
    return association.contains(association1);
    // -end- 33E265070353 test_body358A5E2403D8 "Classifier::containsAssociation"
  }

  /** used to enumerate all connected Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 get_all_head358A5E2403D8 "Classifier::iteratorAssociation"
  public java.util.Iterator iteratorAssociation()
  // -end- 33E265070353 get_all_head358A5E2403D8 "Classifier::iteratorAssociation"
  {
    // -beg- preserve=no 33E265070353 get_all_body358A5E2403D8 "Classifier::iteratorAssociation"
    return association.iterator();
    // -end- 33E265070353 get_all_body358A5E2403D8 "Classifier::iteratorAssociation"
  }

  /** disconnect all Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 remove_all_head358A5E2403D8 "Classifier::clearAssociation"
  public void clearAssociation()
  // -end- 33E265070353 remove_all_head358A5E2403D8 "Classifier::clearAssociation"
  {
    // -beg- preserve=no 33E265070353 remove_all_body358A5E2403D8 "Classifier::clearAssociation"
    if(sizeAssociation()>0){
      for(java.util.Iterator p = association.iterator(); p.hasNext();){
        ((AssociationEnd)p.next())._unlinkParticipant(this);
      }
      association.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearAssociation"));
    }
    // -end- 33E265070353 remove_all_body358A5E2403D8 "Classifier::clearAssociation"
  }

  /** returns the number of Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 size_head358A5E2403D8 "Classifier::sizeAssociation"
  public int sizeAssociation()
  // -end- 33E265070353 size_head358A5E2403D8 "Classifier::sizeAssociation"
  {
    // -beg- preserve=no 33E265070353 size_body358A5E2403D8 "Classifier::sizeAssociation"
    return association.size();
    // -end- 33E265070353 size_body358A5E2403D8 "Classifier::sizeAssociation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070353 _link_body358A5E2403D8 "Classifier::_linkAssociation"
  public void _linkAssociation(AssociationEnd association1)
  {
    association.add(association1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAssociation"));
    return;
  }
  // -end- 33E265070353 _link_body358A5E2403D8 "Classifier::_linkAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070353 _unlink_body358A5E2403D8 "Classifier::_unlinkAssociation"
  public void _unlinkAssociation(AssociationEnd association1)
  {
    association.remove(association1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAssociation"));
    return;
  }
  // -end- 33E265070353 _unlink_body358A5E2403D8 "Classifier::_unlinkAssociation"

  // -beg- preserve=no 33F0EFAD00AB code358A5E2403D8 "specifiedEnd"
  private java.util.Set specifiedEnd = new java.util.HashSet();
  // -end- 33F0EFAD00AB code358A5E2403D8 "specifiedEnd"

  /** add a SpecifiedEnd.
   *  
   *  @see #removeSpecifiedEnd
   *  @see #containsSpecifiedEnd
   *  @see #iteratorSpecifiedEnd
   *  @see #clearSpecifiedEnd
   *  @see #sizeSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB add_head358A5E2403D8 "Classifier::addSpecifiedEnd"
  public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB add_head358A5E2403D8 "Classifier::addSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB add_body358A5E2403D8 "Classifier::addSpecifiedEnd"
    specifiedEnd.add(specifiedEnd1);
    specifiedEnd1._linkSpecification(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecifiedEnd"));
    return;
    // -end- 33F0EFAD00AB add_body358A5E2403D8 "Classifier::addSpecifiedEnd"
  }

  /** disconnect a SpecifiedEnd.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB remove_head358A5E2403D8 "Classifier::removeSpecifiedEnd"
  public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB remove_head358A5E2403D8 "Classifier::removeSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB remove_body358A5E2403D8 "Classifier::removeSpecifiedEnd"
    AssociationEnd ret=null;
    if(specifiedEnd1==null || !specifiedEnd.contains(specifiedEnd1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = specifiedEnd1;
    specifiedEnd.remove(specifiedEnd1);
    specifiedEnd1._unlinkSpecification(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecifiedEnd"));
    return ret;
    // -end- 33F0EFAD00AB remove_body358A5E2403D8 "Classifier::removeSpecifiedEnd"
  }

  /** tests if a given SpecifiedEnd is connected.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB test_head358A5E2403D8 "Classifier::containsSpecifiedEnd"
  public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB test_head358A5E2403D8 "Classifier::containsSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB test_body358A5E2403D8 "Classifier::containsSpecifiedEnd"
    return specifiedEnd.contains(specifiedEnd1);
    // -end- 33F0EFAD00AB test_body358A5E2403D8 "Classifier::containsSpecifiedEnd"
  }

  /** used to enumerate all connected SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB get_all_head358A5E2403D8 "Classifier::iteratorSpecifiedEnd"
  public java.util.Iterator iteratorSpecifiedEnd()
  // -end- 33F0EFAD00AB get_all_head358A5E2403D8 "Classifier::iteratorSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB get_all_body358A5E2403D8 "Classifier::iteratorSpecifiedEnd"
    return specifiedEnd.iterator();
    // -end- 33F0EFAD00AB get_all_body358A5E2403D8 "Classifier::iteratorSpecifiedEnd"
  }

  /** disconnect all SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB remove_all_head358A5E2403D8 "Classifier::clearSpecifiedEnd"
  public void clearSpecifiedEnd()
  // -end- 33F0EFAD00AB remove_all_head358A5E2403D8 "Classifier::clearSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB remove_all_body358A5E2403D8 "Classifier::clearSpecifiedEnd"
    if(sizeSpecifiedEnd()>0){
      for(java.util.Iterator p = specifiedEnd.iterator(); p.hasNext();){
        ((AssociationEnd)p.next())._unlinkSpecification(this);
      }
      specifiedEnd.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecifiedEnd"));
    }
    // -end- 33F0EFAD00AB remove_all_body358A5E2403D8 "Classifier::clearSpecifiedEnd"
  }

  /** returns the number of SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB size_head358A5E2403D8 "Classifier::sizeSpecifiedEnd"
  public int sizeSpecifiedEnd()
  // -end- 33F0EFAD00AB size_head358A5E2403D8 "Classifier::sizeSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB size_body358A5E2403D8 "Classifier::sizeSpecifiedEnd"
    return specifiedEnd.size();
    // -end- 33F0EFAD00AB size_body358A5E2403D8 "Classifier::sizeSpecifiedEnd"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AB _link_body358A5E2403D8 "Classifier::_linkSpecifiedEnd"
  public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1)
  {
    specifiedEnd.add(specifiedEnd1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecifiedEnd"));
    return;
  }
  // -end- 33F0EFAD00AB _link_body358A5E2403D8 "Classifier::_linkSpecifiedEnd"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AB _unlink_body358A5E2403D8 "Classifier::_unlinkSpecifiedEnd"
  public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1)
  {
    specifiedEnd.remove(specifiedEnd1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecifiedEnd"));
    return;
  }
  // -end- 33F0EFAD00AB _unlink_body358A5E2403D8 "Classifier::_unlinkSpecifiedEnd"

  // -beg- preserve=no 36E96A87033E code358A5E2403D8 "powertypeRange"
  private java.util.Set powertypeRange = new java.util.HashSet();
  // -end- 36E96A87033E code358A5E2403D8 "powertypeRange"

  /** add a PowertypeRange.
   *  
   *  @see #removePowertypeRange
   *  @see #containsPowertypeRange
   *  @see #iteratorPowertypeRange
   *  @see #clearPowertypeRange
   *  @see #sizePowertypeRange
   */
  // -beg- preserve=no 36E96A87033E add_head358A5E2403D8 "Classifier::addPowertypeRange"
  public void addPowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E add_head358A5E2403D8 "Classifier::addPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E add_body358A5E2403D8 "Classifier::addPowertypeRange"
    powertypeRange.add(powertypeRange1);
    powertypeRange1._linkPowertype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPowertypeRange"));
    return;
    // -end- 36E96A87033E add_body358A5E2403D8 "Classifier::addPowertypeRange"
  }

  /** disconnect a PowertypeRange.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E remove_head358A5E2403D8 "Classifier::removePowertypeRange"
  public Generalization removePowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E remove_head358A5E2403D8 "Classifier::removePowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E remove_body358A5E2403D8 "Classifier::removePowertypeRange"
    Generalization ret=null;
    if(powertypeRange1==null || !powertypeRange.contains(powertypeRange1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = powertypeRange1;
    powertypeRange.remove(powertypeRange1);
    powertypeRange1._unlinkPowertype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePowertypeRange"));
    return ret;
    // -end- 36E96A87033E remove_body358A5E2403D8 "Classifier::removePowertypeRange"
  }

  /** tests if a given PowertypeRange is connected.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E test_head358A5E2403D8 "Classifier::containsPowertypeRange"
  public boolean containsPowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E test_head358A5E2403D8 "Classifier::containsPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E test_body358A5E2403D8 "Classifier::containsPowertypeRange"
    return powertypeRange.contains(powertypeRange1);
    // -end- 36E96A87033E test_body358A5E2403D8 "Classifier::containsPowertypeRange"
  }

  /** used to enumerate all connected PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E get_all_head358A5E2403D8 "Classifier::iteratorPowertypeRange"
  public java.util.Iterator iteratorPowertypeRange()
  // -end- 36E96A87033E get_all_head358A5E2403D8 "Classifier::iteratorPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E get_all_body358A5E2403D8 "Classifier::iteratorPowertypeRange"
    return powertypeRange.iterator();
    // -end- 36E96A87033E get_all_body358A5E2403D8 "Classifier::iteratorPowertypeRange"
  }

  /** disconnect all PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E remove_all_head358A5E2403D8 "Classifier::clearPowertypeRange"
  public void clearPowertypeRange()
  // -end- 36E96A87033E remove_all_head358A5E2403D8 "Classifier::clearPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E remove_all_body358A5E2403D8 "Classifier::clearPowertypeRange"
    if(sizePowertypeRange()>0){
      for(java.util.Iterator p = powertypeRange.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkPowertype(this);
      }
      powertypeRange.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPowertypeRange"));
    }
    // -end- 36E96A87033E remove_all_body358A5E2403D8 "Classifier::clearPowertypeRange"
  }

  /** returns the number of PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E size_head358A5E2403D8 "Classifier::sizePowertypeRange"
  public int sizePowertypeRange()
  // -end- 36E96A87033E size_head358A5E2403D8 "Classifier::sizePowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E size_body358A5E2403D8 "Classifier::sizePowertypeRange"
    return powertypeRange.size();
    // -end- 36E96A87033E size_body358A5E2403D8 "Classifier::sizePowertypeRange"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36E96A87033E _link_body358A5E2403D8 "Classifier::_linkPowertypeRange"
  public void _linkPowertypeRange(Generalization powertypeRange1)
  {
    powertypeRange.add(powertypeRange1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPowertypeRange"));
    return;
  }
  // -end- 36E96A87033E _link_body358A5E2403D8 "Classifier::_linkPowertypeRange"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36E96A87033E _unlink_body358A5E2403D8 "Classifier::_unlinkPowertypeRange"
  public void _unlinkPowertypeRange(Generalization powertypeRange1)
  {
    powertypeRange.remove(powertypeRange1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPowertypeRange"));
    return;
  }
  // -end- 36E96A87033E _unlink_body358A5E2403D8 "Classifier::_unlinkPowertypeRange"

  // -beg- preserve=no 327A877801CC var358A5E2403D8 "isRoot"
  private boolean isRoot;
  // -end- 327A877801CC var358A5E2403D8 "isRoot"

  /** get current value of isRoot
   *  @see #setRoot
   */
  // -beg- preserve=no 327A877801CC get_head358A5E2403D8 "isRoot"
  public  boolean isRoot()
  // -end- 327A877801CC get_head358A5E2403D8 "isRoot"
  {
    // -beg- preserve=no 327A877801CC get_body358A5E2403D8 "isRoot"
    return isRoot;
    // -end- 327A877801CC get_body358A5E2403D8 "isRoot"
  }

  /** set current value of isRoot
   *  @see #isRoot
   */
  // -beg- preserve=no 327A877801CC set_head358A5E2403D8 "isRoot"
  public  void setRoot(boolean value1)
  // -end- 327A877801CC set_head358A5E2403D8 "isRoot"
  {
    // -beg- preserve=no 327A877801CC set_body358A5E2403D8 "isRoot"
    if(isRoot != value1){
      isRoot = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRoot"));
    }
    // -end- 327A877801CC set_body358A5E2403D8 "isRoot"
  }

  // -beg- preserve=no 327A877E006E var358A5E2403D8 "isLeaf"
  private boolean isLeaf;
  // -end- 327A877E006E var358A5E2403D8 "isLeaf"

  /** get current value of isLeaf
   *  @see #setLeaf
   */
  // -beg- preserve=no 327A877E006E get_head358A5E2403D8 "isLeaf"
  public  boolean isLeaf()
  // -end- 327A877E006E get_head358A5E2403D8 "isLeaf"
  {
    // -beg- preserve=no 327A877E006E get_body358A5E2403D8 "isLeaf"
    return isLeaf;
    // -end- 327A877E006E get_body358A5E2403D8 "isLeaf"
  }

  /** set current value of isLeaf
   *  @see #isLeaf
   */
  // -beg- preserve=no 327A877E006E set_head358A5E2403D8 "isLeaf"
  public  void setLeaf(boolean value1)
  // -end- 327A877E006E set_head358A5E2403D8 "isLeaf"
  {
    // -beg- preserve=no 327A877E006E set_body358A5E2403D8 "isLeaf"
    if(isLeaf != value1){
      isLeaf = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLeaf"));
    }
    // -end- 327A877E006E set_body358A5E2403D8 "isLeaf"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 358A5E2403D8 detail_end "DomainDef"

  // -end- 358A5E2403D8 detail_end "DomainDef"

}

=======
/**
 * definiert einen Wertebereich.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.3 $ $Date: 2006-06-13 14:37:20 $
 */
public class DomainDef extends AbstractNamespace implements DataType, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5E2403D8 detail_begin "DomainDef"

	// -end- 358A5E2403D8 detail_begin "DomainDef"

	private static final long serialVersionUID = 4608040961542218631L;

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 3CE4FD4E02A5 head358A5E2403D8 "getValidOwnedElements"
	public String[] getValidOwnedElements()
	// -end- 3CE4FD4E02A5 head358A5E2403D8 "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CE4FD4E02A5 throws358A5E2403D8 "getValidOwnedElements"

	// -end- 3CE4FD4E02A5 throws358A5E2403D8 "getValidOwnedElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3CE4FD4E02A5 body358A5E2403D8
		// "getValidOwnedElements"
		return null;
		// -end- 3CE4FD4E02A5 body358A5E2403D8 "getValidOwnedElements"
	}

	// -beg- preserve=no 3D4FA21A02F0 head358A5E2403D8 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21A02F0 head358A5E2403D8 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A02F0 throws358A5E2403D8 "unlinkAll"

	// -end- 3D4FA21A02F0 throws358A5E2403D8 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A02F0 body358A5E2403D8 "unlinkAll"

		detachType();
		clearDomainAttribute();
		detachNamespace();
		clearTopicDef();
		clearAbstractClassDef();
		clearGeneralization();
		clearSpecialization();
		// Role RefSys: RefSys object(s) may point to this
		clearEnumTreeValueType();
		detachLineType();
		setName(null);
		setMetaAttrb(null);
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
		clearOwnedElement();
		clearDiagram();
		clearBehavior();
		clearPartition();
		clearCollaborationInstanceSet();
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
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA21A02F0 body358A5E2403D8 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21A0322 head358A5E2403D8 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21A0322 head358A5E2403D8 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A0322 throws358A5E2403D8 "enumerateChildren"

	// -end- 3D4FA21A0322 throws358A5E2403D8 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A0322 body358A5E2403D8 "enumerateChildren"
		java.util.Iterator it = null;
		if (containsType())
			visitor.visit(getType());
		visitor.visit(getName());
		visitor.visit(getMetaAttrb());
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
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21A0322 body358A5E2403D8 "enumerateChildren"
	}

	// -beg- preserve=no 358A746E033C code358A5E2403D8 "type"
	private Type type;
	// -end- 358A746E033C code358A5E2403D8 "type"

	/**
	 * attaches a Type.
	 *
	 * @see #detachType
	 * @see #getType
	 * @see #containsType
	 */
	// -beg- preserve=no 358A746E033C attach_head358A5E2403D8
	// "DomainDef::attachType"
	public void attachType(Type type1)
	// -end- 358A746E033C attach_head358A5E2403D8 "DomainDef::attachType"
	{
		// -beg- preserve=no 358A746E033C attach_body358A5E2403D8
		// "DomainDef::attachType"
		if (type != null) {
			throw new java.lang.IllegalStateException("already a type attached");
		}
		if (type1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as type");
		}
		type = type1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachType"));
		return;
		// -end- 358A746E033C attach_body358A5E2403D8 "DomainDef::attachType"
	}

	/**
	 * disconnect the currently attached Type.
	 * 
	 * @see #attachType
	 */
	// -beg- preserve=no 358A746E033C detach_head358A5E2403D8
	// "DomainDef::detachType"
	public Type detachType()
	// -end- 358A746E033C detach_head358A5E2403D8 "DomainDef::detachType"
	{
		// -beg- preserve=no 358A746E033C detach_body358A5E2403D8
		// "DomainDef::detachType"
		Type ret = null;
		ret = type;
		type = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachType"));
		return ret;
		// -end- 358A746E033C detach_body358A5E2403D8 "DomainDef::detachType"
	}

	/**
	 * get the currently attached Type.
	 * 
	 * @see #attachType
	 */
	// -beg- preserve=no 358A746E033C get_head358A5E2403D8 "DomainDef::getType"
	public Type getType()
	// -end- 358A746E033C get_head358A5E2403D8 "DomainDef::getType"
	{
		// -beg- preserve=no 358A746E033C get_body358A5E2403D8
		// "DomainDef::getType"
		if (type == null) {
			throw new java.lang.IllegalStateException("no type attached");
		}
		return type;
		// -end- 358A746E033C get_body358A5E2403D8 "DomainDef::getType"
	}

	/**
	 * tests if there is a Type attached.
	 * 
	 * @see #attachType
	 */
	// -beg- preserve=no 358A746E033C test_head358A5E2403D8
	// "DomainDef::containsType"
	public boolean containsType()
	// -end- 358A746E033C test_head358A5E2403D8 "DomainDef::containsType"
	{
		// -beg- preserve=no 358A746E033C test_body358A5E2403D8
		// "DomainDef::containsType"
		return type != null;
		// -end- 358A746E033C test_body358A5E2403D8 "DomainDef::containsType"
	}

	// -beg- preserve=no 3947A41A0200 code358A5E2403D8 "domainAttribute"
	private java.util.Set domainAttribute = new java.util.HashSet();
	// -end- 3947A41A0200 code358A5E2403D8 "domainAttribute"

	/**
	 * add a DomainAttribute.
	 *
	 * @see #removeDomainAttribute
	 * @see #containsDomainAttribute
	 * @see #iteratorDomainAttribute
	 * @see #clearDomainAttribute
	 * @see #sizeDomainAttribute
	 */
	// -beg- preserve=no 3947A41A0200 add_head358A5E2403D8
	// "DomainDef::addDomainAttribute"
	public void addDomainAttribute(DomainAttribute domainAttribute1)
	// -end- 3947A41A0200 add_head358A5E2403D8 "DomainDef::addDomainAttribute"
	{
		// -beg- preserve=no 3947A41A0200 add_body358A5E2403D8
		// "DomainDef::addDomainAttribute"
		domainAttribute.add(domainAttribute1);
		domainAttribute1._linkDomainDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addDomainAttribute"));
		return;
		// -end- 3947A41A0200 add_body358A5E2403D8
		// "DomainDef::addDomainAttribute"
	}

	/**
	 * disconnect a DomainAttribute.
	 * 
	 * @see #addDomainAttribute
	 */
	// -beg- preserve=no 3947A41A0200 remove_head358A5E2403D8
	// "DomainDef::removeDomainAttribute"
	public DomainAttribute removeDomainAttribute(DomainAttribute domainAttribute1)
	// -end- 3947A41A0200 remove_head358A5E2403D8
	// "DomainDef::removeDomainAttribute"
	{
		// -beg- preserve=no 3947A41A0200 remove_body358A5E2403D8
		// "DomainDef::removeDomainAttribute"
		DomainAttribute ret = null;
		if (domainAttribute1 == null || !domainAttribute.contains(domainAttribute1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = domainAttribute1;
		domainAttribute.remove(domainAttribute1);
		domainAttribute1._unlinkDomainDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeDomainAttribute"));
		return ret;
		// -end- 3947A41A0200 remove_body358A5E2403D8
		// "DomainDef::removeDomainAttribute"
	}

	/**
	 * tests if a given DomainAttribute is connected.
	 * 
	 * @see #addDomainAttribute
	 */
	// -beg- preserve=no 3947A41A0200 test_head358A5E2403D8
	// "DomainDef::containsDomainAttribute"
	public boolean containsDomainAttribute(DomainAttribute domainAttribute1)
	// -end- 3947A41A0200 test_head358A5E2403D8
	// "DomainDef::containsDomainAttribute"
	{
		// -beg- preserve=no 3947A41A0200 test_body358A5E2403D8
		// "DomainDef::containsDomainAttribute"
		return domainAttribute.contains(domainAttribute1);
		// -end- 3947A41A0200 test_body358A5E2403D8
		// "DomainDef::containsDomainAttribute"
	}

	/**
	 * used to enumerate all connected DomainAttributes.
	 * 
	 * @see #addDomainAttribute
	 */
	// -beg- preserve=no 3947A41A0200 get_all_head358A5E2403D8
	// "DomainDef::iteratorDomainAttribute"
	public java.util.Iterator iteratorDomainAttribute()
	// -end- 3947A41A0200 get_all_head358A5E2403D8
	// "DomainDef::iteratorDomainAttribute"
	{
		// -beg- preserve=no 3947A41A0200 get_all_body358A5E2403D8
		// "DomainDef::iteratorDomainAttribute"
		return domainAttribute.iterator();
		// -end- 3947A41A0200 get_all_body358A5E2403D8
		// "DomainDef::iteratorDomainAttribute"
	}

	/**
	 * disconnect all DomainAttributes.
	 * 
	 * @see #addDomainAttribute
	 */
	// -beg- preserve=no 3947A41A0200 remove_all_head358A5E2403D8
	// "DomainDef::clearDomainAttribute"
	public void clearDomainAttribute()
	// -end- 3947A41A0200 remove_all_head358A5E2403D8
	// "DomainDef::clearDomainAttribute"
	{
		// -beg- preserve=no 3947A41A0200 remove_all_body358A5E2403D8
		// "DomainDef::clearDomainAttribute"
		if (sizeDomainAttribute() > 0) {
			for (java.util.Iterator p = domainAttribute.iterator(); p.hasNext();) {
				((DomainAttribute) p.next())._unlinkDomainDef(this);
			}
			domainAttribute.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearDomainAttribute"));
		}
		// -end- 3947A41A0200 remove_all_body358A5E2403D8
		// "DomainDef::clearDomainAttribute"
	}

	/**
	 * returns the number of DomainAttributes.
	 * 
	 * @see #addDomainAttribute
	 */
	// -beg- preserve=no 3947A41A0200 size_head358A5E2403D8
	// "DomainDef::sizeDomainAttribute"
	public int sizeDomainAttribute()
	// -end- 3947A41A0200 size_head358A5E2403D8 "DomainDef::sizeDomainAttribute"
	{
		// -beg- preserve=no 3947A41A0200 size_body358A5E2403D8
		// "DomainDef::sizeDomainAttribute"
		return domainAttribute.size();
		// -end- 3947A41A0200 size_body358A5E2403D8
		// "DomainDef::sizeDomainAttribute"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3947A41A0200 _link_body358A5E2403D8
	// "DomainDef::_linkDomainAttribute"
	public void _linkDomainAttribute(DomainAttribute domainAttribute1) {
		domainAttribute.add(domainAttribute1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkDomainAttribute"));
		return;
	}
	// -end- 3947A41A0200 _link_body358A5E2403D8
	// "DomainDef::_linkDomainAttribute"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3947A41A0200 _unlink_body358A5E2403D8
	// "DomainDef::_unlinkDomainAttribute"
	public void _unlinkDomainAttribute(DomainAttribute domainAttribute1) {
		domainAttribute.remove(domainAttribute1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkDomainAttribute"));
		return;
	}
	// -end- 3947A41A0200 _unlink_body358A5E2403D8
	// "DomainDef::_unlinkDomainAttribute"

	// -beg- preserve=no 33598CAA030E code358A5E2403D8 "namespace"

	// -end- 33598CAA030E code358A5E2403D8 "namespace"

	/**
	 * attaches a Namespace. Designates the Namespace that contains the
	 * ModelElement.
	 * 
	 * @see #detachNamespace
	 * @see #getNamespace
	 * @see #containsNamespace
	 * @see #getNamespaceLink
	 * @see #createNamespaceLink
	 */
	// -beg- preserve=no 33598CAA030E attach_head358A5E2403D8
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head358A5E2403D8
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body358A5E2403D8
		// "ModelElement::attachNamespace"
		super.attachNamespace(namespace1);
		// -end- 33598CAA030E attach_body358A5E2403D8
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head358A5E2403D8
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head358A5E2403D8
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body358A5E2403D8
		// "ModelElement::attachNamespaceLink"
		super.attachNamespaceLink(namespace1);
		// -end- 33598CAA030E attachlink_body358A5E2403D8
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head358A5E2403D8
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head358A5E2403D8
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body358A5E2403D8
		// "ModelElement::detachNamespace"
		return super.detachNamespace();
		// -end- 33598CAA030E detach_body358A5E2403D8
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head358A5E2403D8
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head358A5E2403D8 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body358A5E2403D8
		// "ModelElement::getNamespace"
		return super.getNamespace();
		// -end- 33598CAA030E get_body358A5E2403D8 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head358A5E2403D8
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head358A5E2403D8
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body358A5E2403D8
		// "ModelElement::getNamespaceLink"
		return super.getNamespaceLink();
		// -end- 33598CAA030E getlink_body358A5E2403D8
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head358A5E2403D8
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head358A5E2403D8
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body358A5E2403D8
		// "ModelElement::createNamespaceLink"
		return super.createNamespaceLink();
		// -end- 33598CAA030E createlink_body358A5E2403D8
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head358A5E2403D8
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head358A5E2403D8
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body358A5E2403D8
		// "ModelElement::containsNamespace"
		return super.containsNamespace();
		// -end- 33598CAA030E test_body358A5E2403D8
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body358A5E2403D8
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		super._linkNamespace(namespace1);
	}
	// -end- 33598CAA030E _link_body358A5E2403D8 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body358A5E2403D8
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		super._unlinkNamespace(namespace1);
	}
	// -end- 33598CAA030E _unlink_body358A5E2403D8
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 3FE86E5801B9 code358A5E2403D8 "topicDef"
	private java.util.Set topicDef = new java.util.HashSet();
	// -end- 3FE86E5801B9 code358A5E2403D8 "topicDef"

	/**
	 * add a TopicDef.
	 *
	 * @see #removeTopicDef
	 * @see #containsTopicDef
	 * @see #iteratorTopicDef
	 * @see #clearTopicDef
	 * @see #sizeTopicDef
	 */
	// -beg- preserve=no 3FE86E5801B9 add_head358A5E2403D8
	// "DomainDef::addTopicDef"
	public void addTopicDef(TopicDef topicDef1)
	// -end- 3FE86E5801B9 add_head358A5E2403D8 "DomainDef::addTopicDef"
	{
		// -beg- preserve=no 3FE86E5801B9 add_body358A5E2403D8
		// "DomainDef::addTopicDef"
		topicDef.add(topicDef1);
		topicDef1._linkOiddomain(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addTopicDef"));
		return;
		// -end- 3FE86E5801B9 add_body358A5E2403D8 "DomainDef::addTopicDef"
	}

	/**
	 * disconnect a TopicDef.
	 * 
	 * @see #addTopicDef
	 */
	// -beg- preserve=no 3FE86E5801B9 remove_head358A5E2403D8
	// "DomainDef::removeTopicDef"
	public TopicDef removeTopicDef(TopicDef topicDef1)
	// -end- 3FE86E5801B9 remove_head358A5E2403D8 "DomainDef::removeTopicDef"
	{
		// -beg- preserve=no 3FE86E5801B9 remove_body358A5E2403D8
		// "DomainDef::removeTopicDef"
		TopicDef ret = null;
		if (topicDef1 == null || !topicDef.contains(topicDef1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = topicDef1;
		topicDef.remove(topicDef1);
		topicDef1._unlinkOiddomain(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeTopicDef"));
		return ret;
		// -end- 3FE86E5801B9 remove_body358A5E2403D8
		// "DomainDef::removeTopicDef"
	}

	/**
	 * tests if a given TopicDef is connected.
	 * 
	 * @see #addTopicDef
	 */
	// -beg- preserve=no 3FE86E5801B9 test_head358A5E2403D8
	// "DomainDef::containsTopicDef"
	public boolean containsTopicDef(TopicDef topicDef1)
	// -end- 3FE86E5801B9 test_head358A5E2403D8 "DomainDef::containsTopicDef"
	{
		// -beg- preserve=no 3FE86E5801B9 test_body358A5E2403D8
		// "DomainDef::containsTopicDef"
		return topicDef.contains(topicDef1);
		// -end- 3FE86E5801B9 test_body358A5E2403D8
		// "DomainDef::containsTopicDef"
	}

	/**
	 * used to enumerate all connected TopicDefs.
	 * 
	 * @see #addTopicDef
	 */
	// -beg- preserve=no 3FE86E5801B9 get_all_head358A5E2403D8
	// "DomainDef::iteratorTopicDef"
	public java.util.Iterator iteratorTopicDef()
	// -end- 3FE86E5801B9 get_all_head358A5E2403D8 "DomainDef::iteratorTopicDef"
	{
		// -beg- preserve=no 3FE86E5801B9 get_all_body358A5E2403D8
		// "DomainDef::iteratorTopicDef"
		return topicDef.iterator();
		// -end- 3FE86E5801B9 get_all_body358A5E2403D8
		// "DomainDef::iteratorTopicDef"
	}

	/**
	 * disconnect all TopicDefs.
	 * 
	 * @see #addTopicDef
	 */
	// -beg- preserve=no 3FE86E5801B9 remove_all_head358A5E2403D8
	// "DomainDef::clearTopicDef"
	public void clearTopicDef()
	// -end- 3FE86E5801B9 remove_all_head358A5E2403D8 "DomainDef::clearTopicDef"
	{
		// -beg- preserve=no 3FE86E5801B9 remove_all_body358A5E2403D8
		// "DomainDef::clearTopicDef"
		if (sizeTopicDef() > 0) {
			for (java.util.Iterator p = topicDef.iterator(); p.hasNext();) {
				((TopicDef) p.next())._unlinkOiddomain(this);
			}
			topicDef.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearTopicDef"));
		}
		// -end- 3FE86E5801B9 remove_all_body358A5E2403D8
		// "DomainDef::clearTopicDef"
	}

	/**
	 * returns the number of TopicDefs.
	 * 
	 * @see #addTopicDef
	 */
	// -beg- preserve=no 3FE86E5801B9 size_head358A5E2403D8
	// "DomainDef::sizeTopicDef"
	public int sizeTopicDef()
	// -end- 3FE86E5801B9 size_head358A5E2403D8 "DomainDef::sizeTopicDef"
	{
		// -beg- preserve=no 3FE86E5801B9 size_body358A5E2403D8
		// "DomainDef::sizeTopicDef"
		return topicDef.size();
		// -end- 3FE86E5801B9 size_body358A5E2403D8 "DomainDef::sizeTopicDef"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FE86E5801B9 _link_body358A5E2403D8
	// "DomainDef::_linkTopicDef"
	public void _linkTopicDef(TopicDef topicDef1) {
		topicDef.add(topicDef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkTopicDef"));
		return;
	}
	// -end- 3FE86E5801B9 _link_body358A5E2403D8 "DomainDef::_linkTopicDef"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FE86E5801B9 _unlink_body358A5E2403D8
	// "DomainDef::_unlinkTopicDef"
	public void _unlinkTopicDef(TopicDef topicDef1) {
		topicDef.remove(topicDef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkTopicDef"));
		return;
	}
	// -end- 3FE86E5801B9 _unlink_body358A5E2403D8 "DomainDef::_unlinkTopicDef"

	// -beg- preserve=no 448921B70173 code358A5E2403D8 "abstractClassDef"
	private java.util.Set abstractClassDef = new java.util.HashSet();
	// -end- 448921B70173 code358A5E2403D8 "abstractClassDef"

	/**
	 * add a AbstractClassDef.
	 *
	 * @see #removeAbstractClassDef
	 * @see #containsAbstractClassDef
	 * @see #iteratorAbstractClassDef
	 * @see #clearAbstractClassDef
	 * @see #sizeAbstractClassDef
	 */
	// -beg- preserve=no 448921B70173 add_head358A5E2403D8
	// "DomainDef::addAbstractClassDef"
	public void addAbstractClassDef(AbstractClassDef abstractClassDef1)
	// -end- 448921B70173 add_head358A5E2403D8 "DomainDef::addAbstractClassDef"
	{
		// -beg- preserve=no 448921B70173 add_body358A5E2403D8
		// "DomainDef::addAbstractClassDef"
		abstractClassDef.add(abstractClassDef1);
		abstractClassDef1._linkOiddomain(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAbstractClassDef"));
		return;
		// -end- 448921B70173 add_body358A5E2403D8
		// "DomainDef::addAbstractClassDef"
	}

	/**
	 * disconnect a AbstractClassDef.
	 * 
	 * @see #addAbstractClassDef
	 */
	// -beg- preserve=no 448921B70173 remove_head358A5E2403D8
	// "DomainDef::removeAbstractClassDef"
	public AbstractClassDef removeAbstractClassDef(AbstractClassDef abstractClassDef1)
	// -end- 448921B70173 remove_head358A5E2403D8
	// "DomainDef::removeAbstractClassDef"
	{
		// -beg- preserve=no 448921B70173 remove_body358A5E2403D8
		// "DomainDef::removeAbstractClassDef"
		AbstractClassDef ret = null;
		if (abstractClassDef1 == null || !abstractClassDef.contains(abstractClassDef1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = abstractClassDef1;
		abstractClassDef.remove(abstractClassDef1);
		abstractClassDef1._unlinkOiddomain(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAbstractClassDef"));
		return ret;
		// -end- 448921B70173 remove_body358A5E2403D8
		// "DomainDef::removeAbstractClassDef"
	}

	/**
	 * tests if a given AbstractClassDef is connected.
	 * 
	 * @see #addAbstractClassDef
	 */
	// -beg- preserve=no 448921B70173 test_head358A5E2403D8
	// "DomainDef::containsAbstractClassDef"
	public boolean containsAbstractClassDef(AbstractClassDef abstractClassDef1)
	// -end- 448921B70173 test_head358A5E2403D8
	// "DomainDef::containsAbstractClassDef"
	{
		// -beg- preserve=no 448921B70173 test_body358A5E2403D8
		// "DomainDef::containsAbstractClassDef"
		return abstractClassDef.contains(abstractClassDef1);
		// -end- 448921B70173 test_body358A5E2403D8
		// "DomainDef::containsAbstractClassDef"
	}

	/**
	 * used to enumerate all connected AbstractClassDefs.
	 * 
	 * @see #addAbstractClassDef
	 */
	// -beg- preserve=no 448921B70173 get_all_head358A5E2403D8
	// "DomainDef::iteratorAbstractClassDef"
	public java.util.Iterator iteratorAbstractClassDef()
	// -end- 448921B70173 get_all_head358A5E2403D8
	// "DomainDef::iteratorAbstractClassDef"
	{
		// -beg- preserve=no 448921B70173 get_all_body358A5E2403D8
		// "DomainDef::iteratorAbstractClassDef"
		return abstractClassDef.iterator();
		// -end- 448921B70173 get_all_body358A5E2403D8
		// "DomainDef::iteratorAbstractClassDef"
	}

	/**
	 * disconnect all AbstractClassDefs.
	 * 
	 * @see #addAbstractClassDef
	 */
	// -beg- preserve=no 448921B70173 remove_all_head358A5E2403D8
	// "DomainDef::clearAbstractClassDef"
	public void clearAbstractClassDef()
	// -end- 448921B70173 remove_all_head358A5E2403D8
	// "DomainDef::clearAbstractClassDef"
	{
		// -beg- preserve=no 448921B70173 remove_all_body358A5E2403D8
		// "DomainDef::clearAbstractClassDef"
		if (sizeAbstractClassDef() > 0) {
			for (java.util.Iterator p = abstractClassDef.iterator(); p.hasNext();) {
				((AbstractClassDef) p.next())._unlinkOiddomain(this);
			}
			abstractClassDef.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAbstractClassDef"));
		}
		// -end- 448921B70173 remove_all_body358A5E2403D8
		// "DomainDef::clearAbstractClassDef"
	}

	/**
	 * returns the number of AbstractClassDefs.
	 * 
	 * @see #addAbstractClassDef
	 */
	// -beg- preserve=no 448921B70173 size_head358A5E2403D8
	// "DomainDef::sizeAbstractClassDef"
	public int sizeAbstractClassDef()
	// -end- 448921B70173 size_head358A5E2403D8
	// "DomainDef::sizeAbstractClassDef"
	{
		// -beg- preserve=no 448921B70173 size_body358A5E2403D8
		// "DomainDef::sizeAbstractClassDef"
		return abstractClassDef.size();
		// -end- 448921B70173 size_body358A5E2403D8
		// "DomainDef::sizeAbstractClassDef"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 448921B70173 _link_body358A5E2403D8
	// "DomainDef::_linkAbstractClassDef"
	public void _linkAbstractClassDef(AbstractClassDef abstractClassDef1) {
		abstractClassDef.add(abstractClassDef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAbstractClassDef"));
		return;
	}
	// -end- 448921B70173 _link_body358A5E2403D8
	// "DomainDef::_linkAbstractClassDef"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 448921B70173 _unlink_body358A5E2403D8
	// "DomainDef::_unlinkAbstractClassDef"
	public void _unlinkAbstractClassDef(AbstractClassDef abstractClassDef1) {
		abstractClassDef.remove(abstractClassDef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAbstractClassDef"));
		return;
	}
	// -end- 448921B70173 _unlink_body358A5E2403D8
	// "DomainDef::_unlinkAbstractClassDef"

	// -beg- preserve=no 335C14A5019A code358A5E2403D8 "generalization"
	private java.util.Set generalization = new java.util.HashSet();
	// -end- 335C14A5019A code358A5E2403D8 "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head358A5E2403D8
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head358A5E2403D8
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body358A5E2403D8
		// "GeneralizableElement::addGeneralization"
		generalization.add(generalization1);
		generalization1._linkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addGeneralization"));
		return;
		// -end- 335C14A5019A add_body358A5E2403D8
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head358A5E2403D8
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head358A5E2403D8
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body358A5E2403D8
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
		// -end- 335C14A5019A remove_body358A5E2403D8
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head358A5E2403D8
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head358A5E2403D8
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body358A5E2403D8
		// "GeneralizableElement::containsGeneralization"
		return generalization.contains(generalization1);
		// -end- 335C14A5019A test_body358A5E2403D8
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head358A5E2403D8
	// "GeneralizableElement::iteratorGeneralization"
	public java.util.Iterator iteratorGeneralization()
	// -end- 335C14A5019A get_all_head358A5E2403D8
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body358A5E2403D8
		// "GeneralizableElement::iteratorGeneralization"
		return generalization.iterator();
		// -end- 335C14A5019A get_all_body358A5E2403D8
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head358A5E2403D8
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head358A5E2403D8
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body358A5E2403D8
		// "GeneralizableElement::clearGeneralization"
		if (sizeGeneralization() > 0) {
			for (java.util.Iterator p = generalization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkChild(this);
			}
			generalization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearGeneralization"));
		}
		// -end- 335C14A5019A remove_all_body358A5E2403D8
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head358A5E2403D8
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head358A5E2403D8
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body358A5E2403D8
		// "GeneralizableElement::sizeGeneralization"
		return generalization.size();
		// -end- 335C14A5019A size_body358A5E2403D8
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body358A5E2403D8
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		generalization.add(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _link_body358A5E2403D8
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body358A5E2403D8
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		generalization.remove(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _unlink_body358A5E2403D8
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code358A5E2403D8 "specialization"
	private java.util.Set specialization = new java.util.HashSet();
	// -end- 335C146B01D6 code358A5E2403D8 "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head358A5E2403D8
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head358A5E2403D8
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body358A5E2403D8
		// "GeneralizableElement::addSpecialization"
		specialization.add(specialization1);
		specialization1._linkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecialization"));
		return;
		// -end- 335C146B01D6 add_body358A5E2403D8
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head358A5E2403D8
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head358A5E2403D8
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body358A5E2403D8
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
		// -end- 335C146B01D6 remove_body358A5E2403D8
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head358A5E2403D8
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head358A5E2403D8
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body358A5E2403D8
		// "GeneralizableElement::containsSpecialization"
		return specialization.contains(specialization1);
		// -end- 335C146B01D6 test_body358A5E2403D8
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head358A5E2403D8
	// "GeneralizableElement::iteratorSpecialization"
	public java.util.Iterator iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head358A5E2403D8
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body358A5E2403D8
		// "GeneralizableElement::iteratorSpecialization"
		return specialization.iterator();
		// -end- 335C146B01D6 get_all_body358A5E2403D8
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head358A5E2403D8
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head358A5E2403D8
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body358A5E2403D8
		// "GeneralizableElement::clearSpecialization"
		if (sizeSpecialization() > 0) {
			for (java.util.Iterator p = specialization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkParent(this);
			}
			specialization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecialization"));
		}
		// -end- 335C146B01D6 remove_all_body358A5E2403D8
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head358A5E2403D8
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head358A5E2403D8
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body358A5E2403D8
		// "GeneralizableElement::sizeSpecialization"
		return specialization.size();
		// -end- 335C146B01D6 size_body358A5E2403D8
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body358A5E2403D8
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		specialization.add(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _link_body358A5E2403D8
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body358A5E2403D8
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		specialization.remove(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _unlink_body358A5E2403D8
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 44897D730306 code358A5E2403D8 "enumTreeValueType"
	private java.util.Set enumTreeValueType = new java.util.HashSet();
	// -end- 44897D730306 code358A5E2403D8 "enumTreeValueType"

	/**
	 * add a EnumTreeValueType.
	 *
	 * @see #removeEnumTreeValueType
	 * @see #containsEnumTreeValueType
	 * @see #iteratorEnumTreeValueType
	 * @see #clearEnumTreeValueType
	 * @see #sizeEnumTreeValueType
	 */
	// -beg- preserve=no 44897D730306 add_head358A5E2403D8
	// "DomainDef::addEnumTreeValueType"
	public void addEnumTreeValueType(EnumTreeValueType enumTreeValueType1)
	// -end- 44897D730306 add_head358A5E2403D8 "DomainDef::addEnumTreeValueType"
	{
		// -beg- preserve=no 44897D730306 add_body358A5E2403D8
		// "DomainDef::addEnumTreeValueType"
		enumTreeValueType.add(enumTreeValueType1);
		enumTreeValueType1._linkEnumBasedOn(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addEnumTreeValueType"));
		return;
		// -end- 44897D730306 add_body358A5E2403D8
		// "DomainDef::addEnumTreeValueType"
	}

	/**
	 * disconnect a EnumTreeValueType.
	 * 
	 * @see #addEnumTreeValueType
	 */
	// -beg- preserve=no 44897D730306 remove_head358A5E2403D8
	// "DomainDef::removeEnumTreeValueType"
	public EnumTreeValueType removeEnumTreeValueType(EnumTreeValueType enumTreeValueType1)
	// -end- 44897D730306 remove_head358A5E2403D8
	// "DomainDef::removeEnumTreeValueType"
	{
		// -beg- preserve=no 44897D730306 remove_body358A5E2403D8
		// "DomainDef::removeEnumTreeValueType"
		EnumTreeValueType ret = null;
		if (enumTreeValueType1 == null || !enumTreeValueType.contains(enumTreeValueType1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = enumTreeValueType1;
		enumTreeValueType.remove(enumTreeValueType1);
		enumTreeValueType1._unlinkEnumBasedOn(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeEnumTreeValueType"));
		return ret;
		// -end- 44897D730306 remove_body358A5E2403D8
		// "DomainDef::removeEnumTreeValueType"
	}

	/**
	 * tests if a given EnumTreeValueType is connected.
	 * 
	 * @see #addEnumTreeValueType
	 */
	// -beg- preserve=no 44897D730306 test_head358A5E2403D8
	// "DomainDef::containsEnumTreeValueType"
	public boolean containsEnumTreeValueType(EnumTreeValueType enumTreeValueType1)
	// -end- 44897D730306 test_head358A5E2403D8
	// "DomainDef::containsEnumTreeValueType"
	{
		// -beg- preserve=no 44897D730306 test_body358A5E2403D8
		// "DomainDef::containsEnumTreeValueType"
		return enumTreeValueType.contains(enumTreeValueType1);
		// -end- 44897D730306 test_body358A5E2403D8
		// "DomainDef::containsEnumTreeValueType"
	}

	/**
	 * used to enumerate all connected EnumTreeValueTypes.
	 * 
	 * @see #addEnumTreeValueType
	 */
	// -beg- preserve=no 44897D730306 get_all_head358A5E2403D8
	// "DomainDef::iteratorEnumTreeValueType"
	public java.util.Iterator iteratorEnumTreeValueType()
	// -end- 44897D730306 get_all_head358A5E2403D8
	// "DomainDef::iteratorEnumTreeValueType"
	{
		// -beg- preserve=no 44897D730306 get_all_body358A5E2403D8
		// "DomainDef::iteratorEnumTreeValueType"
		return enumTreeValueType.iterator();
		// -end- 44897D730306 get_all_body358A5E2403D8
		// "DomainDef::iteratorEnumTreeValueType"
	}

	/**
	 * disconnect all EnumTreeValueTypes.
	 * 
	 * @see #addEnumTreeValueType
	 */
	// -beg- preserve=no 44897D730306 remove_all_head358A5E2403D8
	// "DomainDef::clearEnumTreeValueType"
	public void clearEnumTreeValueType()
	// -end- 44897D730306 remove_all_head358A5E2403D8
	// "DomainDef::clearEnumTreeValueType"
	{
		// -beg- preserve=no 44897D730306 remove_all_body358A5E2403D8
		// "DomainDef::clearEnumTreeValueType"
		if (sizeEnumTreeValueType() > 0) {
			for (java.util.Iterator p = enumTreeValueType.iterator(); p.hasNext();) {
				((EnumTreeValueType) p.next())._unlinkEnumBasedOn(this);
			}
			enumTreeValueType.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearEnumTreeValueType"));
		}
		// -end- 44897D730306 remove_all_body358A5E2403D8
		// "DomainDef::clearEnumTreeValueType"
	}

	/**
	 * returns the number of EnumTreeValueTypes.
	 * 
	 * @see #addEnumTreeValueType
	 */
	// -beg- preserve=no 44897D730306 size_head358A5E2403D8
	// "DomainDef::sizeEnumTreeValueType"
	public int sizeEnumTreeValueType()
	// -end- 44897D730306 size_head358A5E2403D8
	// "DomainDef::sizeEnumTreeValueType"
	{
		// -beg- preserve=no 44897D730306 size_body358A5E2403D8
		// "DomainDef::sizeEnumTreeValueType"
		return enumTreeValueType.size();
		// -end- 44897D730306 size_body358A5E2403D8
		// "DomainDef::sizeEnumTreeValueType"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 44897D730306 _link_body358A5E2403D8
	// "DomainDef::_linkEnumTreeValueType"
	public void _linkEnumTreeValueType(EnumTreeValueType enumTreeValueType1) {
		enumTreeValueType.add(enumTreeValueType1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkEnumTreeValueType"));
		return;
	}
	// -end- 44897D730306 _link_body358A5E2403D8
	// "DomainDef::_linkEnumTreeValueType"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 44897D730306 _unlink_body358A5E2403D8
	// "DomainDef::_unlinkEnumTreeValueType"
	public void _unlinkEnumTreeValueType(EnumTreeValueType enumTreeValueType1) {
		enumTreeValueType.remove(enumTreeValueType1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkEnumTreeValueType"));
		return;
	}
	// -end- 44897D730306 _unlink_body358A5E2403D8
	// "DomainDef::_unlinkEnumTreeValueType"

	// -beg- preserve=no 3948F00C0213 code358A5E2403D8 "lineType"
	private LineType lineType;
	// -end- 3948F00C0213 code358A5E2403D8 "lineType"

	/**
	 * attaches a LineType.
	 *
	 * @see #detachLineType
	 * @see #getLineType
	 * @see #containsLineType
	 */
	// -beg- preserve=no 3948F00C0213 attach_head358A5E2403D8
	// "DomainDef::attachLineType"
	public void attachLineType(LineType lineType1)
	// -end- 3948F00C0213 attach_head358A5E2403D8 "DomainDef::attachLineType"
	{
		// -beg- preserve=no 3948F00C0213 attach_body358A5E2403D8
		// "DomainDef::attachLineType"
		if (lineType != null) {
			throw new java.lang.IllegalStateException("already a lineType attached");
		}
		if (lineType1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as lineType");
		}
		lineType = lineType1;
		lineType1._linkControlpoints(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachLineType"));
		return;
		// -end- 3948F00C0213 attach_body358A5E2403D8
		// "DomainDef::attachLineType"
	}

	/**
	 * disconnect the currently attached LineType.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 3948F00C0213 detach_head358A5E2403D8
	// "DomainDef::detachLineType"
	public LineType detachLineType()
	// -end- 3948F00C0213 detach_head358A5E2403D8 "DomainDef::detachLineType"
	{
		// -beg- preserve=no 3948F00C0213 detach_body358A5E2403D8
		// "DomainDef::detachLineType"
		LineType ret = null;
		if (lineType != null) {
			lineType._unlinkControlpoints(this);
			ret = lineType;
			lineType = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachLineType"));
		return ret;
		// -end- 3948F00C0213 detach_body358A5E2403D8
		// "DomainDef::detachLineType"
	}

	/**
	 * get the currently attached LineType.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 3948F00C0213 get_head358A5E2403D8
	// "DomainDef::getLineType"
	public LineType getLineType()
	// -end- 3948F00C0213 get_head358A5E2403D8 "DomainDef::getLineType"
	{
		// -beg- preserve=no 3948F00C0213 get_body358A5E2403D8
		// "DomainDef::getLineType"
		if (lineType == null) {
			throw new java.lang.IllegalStateException("no lineType attached");
		}
		return lineType;
		// -end- 3948F00C0213 get_body358A5E2403D8 "DomainDef::getLineType"
	}

	/**
	 * tests if there is a LineType attached.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 3948F00C0213 test_head358A5E2403D8
	// "DomainDef::containsLineType"
	public boolean containsLineType()
	// -end- 3948F00C0213 test_head358A5E2403D8 "DomainDef::containsLineType"
	{
		// -beg- preserve=no 3948F00C0213 test_body358A5E2403D8
		// "DomainDef::containsLineType"
		return lineType != null;
		// -end- 3948F00C0213 test_body358A5E2403D8
		// "DomainDef::containsLineType"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3948F00C0213 _link_body358A5E2403D8
	// "DomainDef::_linkLineType"
	public void _linkLineType(LineType lineType1) {
		lineType = lineType1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkLineType"));
		return;
	}
	// -end- 3948F00C0213 _link_body358A5E2403D8 "DomainDef::_linkLineType"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3948F00C0213 _unlink_body358A5E2403D8
	// "DomainDef::_unlinkLineType"
	public void _unlinkLineType(LineType lineType1) {
		lineType = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkLineType"));
		return;
	}
	// -end- 3948F00C0213 _unlink_body358A5E2403D8 "DomainDef::_unlinkLineType"

	// -beg- preserve=no 358A612E03B8 var358A5E2403D8 "name"

	// -end- 358A612E03B8 var358A5E2403D8 "name"

	/**
	 * get current value of name Name des Wertebereichs
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 358A612E03B8 get_head358A5E2403D8 "name"
	public NlsString getName()
	// -end- 358A612E03B8 get_head358A5E2403D8 "name"
	{
		// -beg- preserve=no 358A612E03B8 get_body358A5E2403D8 "name"
		return super.getName();
		// -end- 358A612E03B8 get_body358A5E2403D8 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 358A612E03B8 set_head358A5E2403D8 "name"
	public void setName(NlsString value1)
	// -end- 358A612E03B8 set_head358A5E2403D8 "name"
	{
		// -beg- preserve=no 358A612E03B8 set_body358A5E2403D8 "name"
		super.setName(value1);
		// -end- 358A612E03B8 set_body358A5E2403D8 "name"
	}

	// -beg- preserve=no 39479DD502F3 var358A5E2403D8 "mandatory"
	private boolean mandatory;
	// -end- 39479DD502F3 var358A5E2403D8 "mandatory"

	/**
	 * get current value of mandatory definiert ob der UNDEFINED Wert auch zum
	 * Wertebereich gehÃ¶rt.
	 * 
	 * @see #setMandatory
	 */
	// -beg- preserve=no 39479DD502F3 get_head358A5E2403D8 "mandatory"
	public boolean isMandatory()
	// -end- 39479DD502F3 get_head358A5E2403D8 "mandatory"
	{
		// -beg- preserve=no 39479DD502F3 get_body358A5E2403D8 "mandatory"
		return mandatory;
		// -end- 39479DD502F3 get_body358A5E2403D8 "mandatory"
	}

	/**
	 * set current value of mandatory
	 * 
	 * @see #isMandatory
	 */
	// -beg- preserve=no 39479DD502F3 set_head358A5E2403D8 "mandatory"
	public void setMandatory(boolean value1)
	// -end- 39479DD502F3 set_head358A5E2403D8 "mandatory"
	{
		// -beg- preserve=no 39479DD502F3 set_body358A5E2403D8 "mandatory"
		if (mandatory != value1) {
			mandatory = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMandatory"));
		}
		// -end- 39479DD502F3 set_body358A5E2403D8 "mandatory"
	}

	// -beg- preserve=no 3C1DD56200F0 var358A5E2403D8 "isAbstract"
	private boolean isAbstract;
	// -end- 3C1DD56200F0 var358A5E2403D8 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 3C1DD56200F0 get_head358A5E2403D8 "isAbstract"
	public boolean isAbstract()
	// -end- 3C1DD56200F0 get_head358A5E2403D8 "isAbstract"
	{
		// -beg- preserve=no 3C1DD56200F0 get_body358A5E2403D8 "isAbstract"
		return isAbstract;
		// -end- 3C1DD56200F0 get_body358A5E2403D8 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 3C1DD56200F0 set_head358A5E2403D8 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 3C1DD56200F0 set_head358A5E2403D8 "isAbstract"
	{
		// -beg- preserve=no 3C1DD56200F0 set_body358A5E2403D8 "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 3C1DD56200F0 set_body358A5E2403D8 "isAbstract"
	}

	// -beg- preserve=no 3C1DD56C023F var358A5E2403D8 "propFinal"
	private boolean propFinal;
	// -end- 3C1DD56C023F var358A5E2403D8 "propFinal"

	/**
	 * get current value of propFinal
	 * 
	 * @see #setPropFinal
	 */
	// -beg- preserve=no 3C1DD56C023F get_head358A5E2403D8 "propFinal"
	public boolean isPropFinal()
	// -end- 3C1DD56C023F get_head358A5E2403D8 "propFinal"
	{
		// -beg- preserve=no 3C1DD56C023F get_body358A5E2403D8 "propFinal"
		return propFinal;
		// -end- 3C1DD56C023F get_body358A5E2403D8 "propFinal"
	}

	/**
	 * set current value of propFinal
	 * 
	 * @see #isPropFinal
	 */
	// -beg- preserve=no 3C1DD56C023F set_head358A5E2403D8 "propFinal"
	public void setPropFinal(boolean value1)
	// -end- 3C1DD56C023F set_head358A5E2403D8 "propFinal"
	{
		// -beg- preserve=no 3C1DD56C023F set_body358A5E2403D8 "propFinal"
		if (propFinal != value1) {
			propFinal = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setPropFinal"));
		}
		// -end- 3C1DD56C023F set_body358A5E2403D8 "propFinal"
	}

	/**
	 * tests if this Classifier contains a Feature with the given name
	 */
	// -beg- preserve=no 3CB2C64E0374 head358A5E2403D8 "containsFeature"
	public boolean containsFeature(String name)
	// -end- 3CB2C64E0374 head358A5E2403D8 "containsFeature"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CB2C64E0374 throws358A5E2403D8 "containsFeature"

	// -end- 3CB2C64E0374 throws358A5E2403D8 "containsFeature"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CB2C64E0374 body358A5E2403D8 "containsFeature"
		java.util.Iterator it = iteratorFeature();
		while (it.hasNext()) {
			ModelElement ele = (ModelElement) it.next();
			if (ele.getName().equals(name)) {
				return true;
			}
		}
		return false;
		// -end- 3CB2C64E0374 body358A5E2403D8 "containsFeature"
	}

	// -beg- preserve=no 33CF9EFC006E code358A5E2403D8 "objectFlowState"
	private java.util.Set objectFlowState = new java.util.HashSet();
	// -end- 33CF9EFC006E code358A5E2403D8 "objectFlowState"

	/**
	 * add a ObjectFlowState.
	 *
	 * @see #removeObjectFlowState
	 * @see #containsObjectFlowState
	 * @see #iteratorObjectFlowState
	 * @see #clearObjectFlowState
	 * @see #sizeObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E add_head358A5E2403D8
	// "Classifier::addObjectFlowState"
	public void addObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E add_head358A5E2403D8 "Classifier::addObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E add_body358A5E2403D8
		// "Classifier::addObjectFlowState"
		objectFlowState.add(objectFlowState1);
		objectFlowState1._linkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addObjectFlowState"));
		return;
		// -end- 33CF9EFC006E add_body358A5E2403D8
		// "Classifier::addObjectFlowState"
	}

	/**
	 * disconnect a ObjectFlowState.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_head358A5E2403D8
	// "Classifier::removeObjectFlowState"
	public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E remove_head358A5E2403D8
	// "Classifier::removeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_body358A5E2403D8
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
		// -end- 33CF9EFC006E remove_body358A5E2403D8
		// "Classifier::removeObjectFlowState"
	}

	/**
	 * tests if a given ObjectFlowState is connected.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E test_head358A5E2403D8
	// "Classifier::containsObjectFlowState"
	public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E test_head358A5E2403D8
	// "Classifier::containsObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E test_body358A5E2403D8
		// "Classifier::containsObjectFlowState"
		return objectFlowState.contains(objectFlowState1);
		// -end- 33CF9EFC006E test_body358A5E2403D8
		// "Classifier::containsObjectFlowState"
	}

	/**
	 * used to enumerate all connected ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E get_all_head358A5E2403D8
	// "Classifier::iteratorObjectFlowState"
	public java.util.Iterator iteratorObjectFlowState()
	// -end- 33CF9EFC006E get_all_head358A5E2403D8
	// "Classifier::iteratorObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E get_all_body358A5E2403D8
		// "Classifier::iteratorObjectFlowState"
		return objectFlowState.iterator();
		// -end- 33CF9EFC006E get_all_body358A5E2403D8
		// "Classifier::iteratorObjectFlowState"
	}

	/**
	 * disconnect all ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_all_head358A5E2403D8
	// "Classifier::clearObjectFlowState"
	public void clearObjectFlowState()
	// -end- 33CF9EFC006E remove_all_head358A5E2403D8
	// "Classifier::clearObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_all_body358A5E2403D8
		// "Classifier::clearObjectFlowState"
		if (sizeObjectFlowState() > 0) {
			for (java.util.Iterator p = objectFlowState.iterator(); p.hasNext();) {
				((ObjectFlowState) p.next())._unlinkType(this);
			}
			objectFlowState.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearObjectFlowState"));
		}
		// -end- 33CF9EFC006E remove_all_body358A5E2403D8
		// "Classifier::clearObjectFlowState"
	}

	/**
	 * returns the number of ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E size_head358A5E2403D8
	// "Classifier::sizeObjectFlowState"
	public int sizeObjectFlowState()
	// -end- 33CF9EFC006E size_head358A5E2403D8
	// "Classifier::sizeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E size_body358A5E2403D8
		// "Classifier::sizeObjectFlowState"
		return objectFlowState.size();
		// -end- 33CF9EFC006E size_body358A5E2403D8
		// "Classifier::sizeObjectFlowState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _link_body358A5E2403D8
	// "Classifier::_linkObjectFlowState"
	public void _linkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.add(objectFlowState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkObjectFlowState"));
		return;
	}
	// -end- 33CF9EFC006E _link_body358A5E2403D8
	// "Classifier::_linkObjectFlowState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _unlink_body358A5E2403D8
	// "Classifier::_unlinkObjectFlowState"
	public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.remove(objectFlowState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkObjectFlowState"));
		return;
	}
	// -end- 33CF9EFC006E _unlink_body358A5E2403D8
	// "Classifier::_unlinkObjectFlowState"

	// -beg- preserve=no 33CF9F1602BC code358A5E2403D8 "classifierInState"
	private java.util.Set classifierInState = new java.util.HashSet();
	// -end- 33CF9F1602BC code358A5E2403D8 "classifierInState"

	/**
	 * add a ClassifierInState.
	 *
	 * @see #removeClassifierInState
	 * @see #containsClassifierInState
	 * @see #iteratorClassifierInState
	 * @see #clearClassifierInState
	 * @see #sizeClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC add_head358A5E2403D8
	// "Classifier::addClassifierInState"
	public void addClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC add_head358A5E2403D8
	// "Classifier::addClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC add_body358A5E2403D8
		// "Classifier::addClassifierInState"
		classifierInState.add(classifierInState1);
		classifierInState1._linkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addClassifierInState"));
		return;
		// -end- 33CF9F1602BC add_body358A5E2403D8
		// "Classifier::addClassifierInState"
	}

	/**
	 * disconnect a ClassifierInState.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_head358A5E2403D8
	// "Classifier::removeClassifierInState"
	public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC remove_head358A5E2403D8
	// "Classifier::removeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_body358A5E2403D8
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
		// -end- 33CF9F1602BC remove_body358A5E2403D8
		// "Classifier::removeClassifierInState"
	}

	/**
	 * tests if a given ClassifierInState is connected.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC test_head358A5E2403D8
	// "Classifier::containsClassifierInState"
	public boolean containsClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC test_head358A5E2403D8
	// "Classifier::containsClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC test_body358A5E2403D8
		// "Classifier::containsClassifierInState"
		return classifierInState.contains(classifierInState1);
		// -end- 33CF9F1602BC test_body358A5E2403D8
		// "Classifier::containsClassifierInState"
	}

	/**
	 * used to enumerate all connected ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC get_all_head358A5E2403D8
	// "Classifier::iteratorClassifierInState"
	public java.util.Iterator iteratorClassifierInState()
	// -end- 33CF9F1602BC get_all_head358A5E2403D8
	// "Classifier::iteratorClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC get_all_body358A5E2403D8
		// "Classifier::iteratorClassifierInState"
		return classifierInState.iterator();
		// -end- 33CF9F1602BC get_all_body358A5E2403D8
		// "Classifier::iteratorClassifierInState"
	}

	/**
	 * disconnect all ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_all_head358A5E2403D8
	// "Classifier::clearClassifierInState"
	public void clearClassifierInState()
	// -end- 33CF9F1602BC remove_all_head358A5E2403D8
	// "Classifier::clearClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_all_body358A5E2403D8
		// "Classifier::clearClassifierInState"
		if (sizeClassifierInState() > 0) {
			for (java.util.Iterator p = classifierInState.iterator(); p.hasNext();) {
				((ClassifierInState) p.next())._unlinkType(this);
			}
			classifierInState.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearClassifierInState"));
		}
		// -end- 33CF9F1602BC remove_all_body358A5E2403D8
		// "Classifier::clearClassifierInState"
	}

	/**
	 * returns the number of ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC size_head358A5E2403D8
	// "Classifier::sizeClassifierInState"
	public int sizeClassifierInState()
	// -end- 33CF9F1602BC size_head358A5E2403D8
	// "Classifier::sizeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC size_body358A5E2403D8
		// "Classifier::sizeClassifierInState"
		return classifierInState.size();
		// -end- 33CF9F1602BC size_body358A5E2403D8
		// "Classifier::sizeClassifierInState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _link_body358A5E2403D8
	// "Classifier::_linkClassifierInState"
	public void _linkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.add(classifierInState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkClassifierInState"));
		return;
	}
	// -end- 33CF9F1602BC _link_body358A5E2403D8
	// "Classifier::_linkClassifierInState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _unlink_body358A5E2403D8
	// "Classifier::_unlinkClassifierInState"
	public void _unlinkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.remove(classifierInState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkClassifierInState"));
		return;
	}
	// -end- 33CF9F1602BC _unlink_body358A5E2403D8
	// "Classifier::_unlinkClassifierInState"

	// -beg- preserve=no 36008FB700E7 code358A5E2403D8 "classifierRole"

	// -end- 36008FB700E7 code358A5E2403D8 "classifierRole"

	/**
	 * add a ClassifierRole.
	 *
	 * @see #removeClassifierRole
	 * @see #containsClassifierRole
	 * @see #iteratorClassifierRole
	 * @see #clearClassifierRole
	 * @see #sizeClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 add_head358A5E2403D8
	// "ModelElement::addClassifierRole"
	public void addClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 add_head358A5E2403D8 "ModelElement::addClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 add_body358A5E2403D8
		// "ModelElement::addClassifierRole"
		super.addClassifierRole(classifierRole1);
		// -end- 36008FB700E7 add_body358A5E2403D8
		// "ModelElement::addClassifierRole"
	}

	/**
	 * disconnect a ClassifierRole.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_head358A5E2403D8
	// "ModelElement::removeClassifierRole"
	public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 remove_head358A5E2403D8
	// "ModelElement::removeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_body358A5E2403D8
		// "ModelElement::removeClassifierRole"
		return super.removeClassifierRole(classifierRole1);
		// -end- 36008FB700E7 remove_body358A5E2403D8
		// "ModelElement::removeClassifierRole"
	}

	/**
	 * tests if a given ClassifierRole is connected.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 test_head358A5E2403D8
	// "ModelElement::containsClassifierRole"
	public boolean containsClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 test_head358A5E2403D8
	// "ModelElement::containsClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 test_body358A5E2403D8
		// "ModelElement::containsClassifierRole"
		return super.containsClassifierRole(classifierRole1);
		// -end- 36008FB700E7 test_body358A5E2403D8
		// "ModelElement::containsClassifierRole"
	}

	/**
	 * used to enumerate all connected ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 get_all_head358A5E2403D8
	// "ModelElement::iteratorClassifierRole"
	public java.util.Iterator iteratorClassifierRole()
	// -end- 36008FB700E7 get_all_head358A5E2403D8
	// "ModelElement::iteratorClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 get_all_body358A5E2403D8
		// "ModelElement::iteratorClassifierRole"
		return super.iteratorClassifierRole();
		// -end- 36008FB700E7 get_all_body358A5E2403D8
		// "ModelElement::iteratorClassifierRole"
	}

	/**
	 * disconnect all ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_all_head358A5E2403D8
	// "ModelElement::clearClassifierRole"
	public void clearClassifierRole()
	// -end- 36008FB700E7 remove_all_head358A5E2403D8
	// "ModelElement::clearClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_all_body358A5E2403D8
		// "ModelElement::clearClassifierRole"
		super.clearClassifierRole();
		// -end- 36008FB700E7 remove_all_body358A5E2403D8
		// "ModelElement::clearClassifierRole"
	}

	/**
	 * returns the number of ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 size_head358A5E2403D8
	// "ModelElement::sizeClassifierRole"
	public int sizeClassifierRole()
	// -end- 36008FB700E7 size_head358A5E2403D8
	// "ModelElement::sizeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 size_body358A5E2403D8
		// "ModelElement::sizeClassifierRole"
		return super.sizeClassifierRole();
		// -end- 36008FB700E7 size_body358A5E2403D8
		// "ModelElement::sizeClassifierRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _link_body358A5E2403D8
	// "ModelElement::_linkClassifierRole"
	public void _linkClassifierRole(ClassifierRole classifierRole1) {
		super._linkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _link_body358A5E2403D8
	// "ModelElement::_linkClassifierRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _unlink_body358A5E2403D8
	// "ModelElement::_unlinkClassifierRole"
	public void _unlinkClassifierRole(ClassifierRole classifierRole1) {
		super._unlinkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _unlink_body358A5E2403D8
	// "ModelElement::_unlinkClassifierRole"

	// -beg- preserve=no 33D1394E029F code358A5E2403D8 "collaboration"

	// -end- 33D1394E029F code358A5E2403D8 "collaboration"

	/**
	 * add a Collaboration.
	 *
	 * @see #removeCollaboration
	 * @see #containsCollaboration
	 * @see #iteratorCollaboration
	 * @see #clearCollaboration
	 * @see #sizeCollaboration
	 */
	// -beg- preserve=no 33D1394E029F add_head358A5E2403D8
	// "ModelElement::addCollaboration"
	public void addCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F add_head358A5E2403D8 "ModelElement::addCollaboration"
	{
		// -beg- preserve=no 33D1394E029F add_body358A5E2403D8
		// "ModelElement::addCollaboration"
		super.addCollaboration(collaboration1);
		// -end- 33D1394E029F add_body358A5E2403D8
		// "ModelElement::addCollaboration"
	}

	/**
	 * disconnect a Collaboration.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_head358A5E2403D8
	// "ModelElement::removeCollaboration"
	public Collaboration removeCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F remove_head358A5E2403D8
	// "ModelElement::removeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_body358A5E2403D8
		// "ModelElement::removeCollaboration"
		return super.removeCollaboration(collaboration1);
		// -end- 33D1394E029F remove_body358A5E2403D8
		// "ModelElement::removeCollaboration"
	}

	/**
	 * tests if a given Collaboration is connected.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F test_head358A5E2403D8
	// "ModelElement::containsCollaboration"
	public boolean containsCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F test_head358A5E2403D8
	// "ModelElement::containsCollaboration"
	{
		// -beg- preserve=no 33D1394E029F test_body358A5E2403D8
		// "ModelElement::containsCollaboration"
		return super.containsCollaboration(collaboration1);
		// -end- 33D1394E029F test_body358A5E2403D8
		// "ModelElement::containsCollaboration"
	}

	/**
	 * used to enumerate all connected Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F get_all_head358A5E2403D8
	// "ModelElement::iteratorCollaboration"
	public java.util.Iterator iteratorCollaboration()
	// -end- 33D1394E029F get_all_head358A5E2403D8
	// "ModelElement::iteratorCollaboration"
	{
		// -beg- preserve=no 33D1394E029F get_all_body358A5E2403D8
		// "ModelElement::iteratorCollaboration"
		return super.iteratorCollaboration();
		// -end- 33D1394E029F get_all_body358A5E2403D8
		// "ModelElement::iteratorCollaboration"
	}

	/**
	 * disconnect all Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_all_head358A5E2403D8
	// "ModelElement::clearCollaboration"
	public void clearCollaboration()
	// -end- 33D1394E029F remove_all_head358A5E2403D8
	// "ModelElement::clearCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_all_body358A5E2403D8
		// "ModelElement::clearCollaboration"
		super.clearCollaboration();
		// -end- 33D1394E029F remove_all_body358A5E2403D8
		// "ModelElement::clearCollaboration"
	}

	/**
	 * returns the number of Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F size_head358A5E2403D8
	// "ModelElement::sizeCollaboration"
	public int sizeCollaboration()
	// -end- 33D1394E029F size_head358A5E2403D8
	// "ModelElement::sizeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F size_body358A5E2403D8
		// "ModelElement::sizeCollaboration"
		return super.sizeCollaboration();
		// -end- 33D1394E029F size_body358A5E2403D8
		// "ModelElement::sizeCollaboration"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _link_body358A5E2403D8
	// "ModelElement::_linkCollaboration"
	public void _linkCollaboration(Collaboration collaboration1) {
		super._linkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _link_body358A5E2403D8
	// "ModelElement::_linkCollaboration"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _unlink_body358A5E2403D8
	// "ModelElement::_unlinkCollaboration"
	public void _unlinkCollaboration(Collaboration collaboration1) {
		super._unlinkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _unlink_body358A5E2403D8
	// "ModelElement::_unlinkCollaboration"

	// -beg- preserve=no 33CAD7E900AB code358A5E2403D8 "instance"
	private java.util.Set instance = new java.util.HashSet();
	// -end- 33CAD7E900AB code358A5E2403D8 "instance"

	/**
	 * add a Instance.
	 *
	 * @see #removeInstance
	 * @see #containsInstance
	 * @see #iteratorInstance
	 * @see #clearInstance
	 * @see #sizeInstance
	 */
	// -beg- preserve=no 33CAD7E900AB add_head358A5E2403D8
	// "Classifier::addInstance"
	public void addInstance(Instance instance1)
	// -end- 33CAD7E900AB add_head358A5E2403D8 "Classifier::addInstance"
	{
		// -beg- preserve=no 33CAD7E900AB add_body358A5E2403D8
		// "Classifier::addInstance"
		instance.add(instance1);
		instance1._linkClassifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addInstance"));
		return;
		// -end- 33CAD7E900AB add_body358A5E2403D8 "Classifier::addInstance"
	}

	/**
	 * disconnect a Instance.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_head358A5E2403D8
	// "Classifier::removeInstance"
	public Instance removeInstance(Instance instance1)
	// -end- 33CAD7E900AB remove_head358A5E2403D8 "Classifier::removeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_body358A5E2403D8
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
		// -end- 33CAD7E900AB remove_body358A5E2403D8
		// "Classifier::removeInstance"
	}

	/**
	 * tests if a given Instance is connected.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB test_head358A5E2403D8
	// "Classifier::containsInstance"
	public boolean containsInstance(Instance instance1)
	// -end- 33CAD7E900AB test_head358A5E2403D8 "Classifier::containsInstance"
	{
		// -beg- preserve=no 33CAD7E900AB test_body358A5E2403D8
		// "Classifier::containsInstance"
		return instance.contains(instance1);
		// -end- 33CAD7E900AB test_body358A5E2403D8
		// "Classifier::containsInstance"
	}

	/**
	 * used to enumerate all connected Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB get_all_head358A5E2403D8
	// "Classifier::iteratorInstance"
	public java.util.Iterator iteratorInstance()
	// -end- 33CAD7E900AB get_all_head358A5E2403D8
	// "Classifier::iteratorInstance"
	{
		// -beg- preserve=no 33CAD7E900AB get_all_body358A5E2403D8
		// "Classifier::iteratorInstance"
		return instance.iterator();
		// -end- 33CAD7E900AB get_all_body358A5E2403D8
		// "Classifier::iteratorInstance"
	}

	/**
	 * disconnect all Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_all_head358A5E2403D8
	// "Classifier::clearInstance"
	public void clearInstance()
	// -end- 33CAD7E900AB remove_all_head358A5E2403D8
	// "Classifier::clearInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_all_body358A5E2403D8
		// "Classifier::clearInstance"
		if (sizeInstance() > 0) {
			for (java.util.Iterator p = instance.iterator(); p.hasNext();) {
				((Instance) p.next())._unlinkClassifier(this);
			}
			instance.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearInstance"));
		}
		// -end- 33CAD7E900AB remove_all_body358A5E2403D8
		// "Classifier::clearInstance"
	}

	/**
	 * returns the number of Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB size_head358A5E2403D8
	// "Classifier::sizeInstance"
	public int sizeInstance()
	// -end- 33CAD7E900AB size_head358A5E2403D8 "Classifier::sizeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB size_body358A5E2403D8
		// "Classifier::sizeInstance"
		return instance.size();
		// -end- 33CAD7E900AB size_body358A5E2403D8 "Classifier::sizeInstance"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _link_body358A5E2403D8
	// "Classifier::_linkInstance"
	public void _linkInstance(Instance instance1) {
		instance.add(instance1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkInstance"));
		return;
	}
	// -end- 33CAD7E900AB _link_body358A5E2403D8 "Classifier::_linkInstance"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _unlink_body358A5E2403D8
	// "Classifier::_unlinkInstance"
	public void _unlinkInstance(Instance instance1) {
		instance.remove(instance1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkInstance"));
		return;
	}
	// -end- 33CAD7E900AB _unlink_body358A5E2403D8 "Classifier::_unlinkInstance"

	// -beg- preserve=no 33CFD0A701A4 code358A5E2403D8 "createAction"
	private java.util.Set createAction = new java.util.HashSet();
	// -end- 33CFD0A701A4 code358A5E2403D8 "createAction"

	/**
	 * add a CreateAction.
	 *
	 * @see #removeCreateAction
	 * @see #containsCreateAction
	 * @see #iteratorCreateAction
	 * @see #clearCreateAction
	 * @see #sizeCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 add_head358A5E2403D8
	// "Classifier::addCreateAction"
	public void addCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 add_head358A5E2403D8 "Classifier::addCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 add_body358A5E2403D8
		// "Classifier::addCreateAction"
		createAction.add(createAction1);
		createAction1._linkInstantiation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addCreateAction"));
		return;
		// -end- 33CFD0A701A4 add_body358A5E2403D8 "Classifier::addCreateAction"
	}

	/**
	 * disconnect a CreateAction.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_head358A5E2403D8
	// "Classifier::removeCreateAction"
	public CreateAction removeCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 remove_head358A5E2403D8
	// "Classifier::removeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_body358A5E2403D8
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
		// -end- 33CFD0A701A4 remove_body358A5E2403D8
		// "Classifier::removeCreateAction"
	}

	/**
	 * tests if a given CreateAction is connected.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 test_head358A5E2403D8
	// "Classifier::containsCreateAction"
	public boolean containsCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 test_head358A5E2403D8
	// "Classifier::containsCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 test_body358A5E2403D8
		// "Classifier::containsCreateAction"
		return createAction.contains(createAction1);
		// -end- 33CFD0A701A4 test_body358A5E2403D8
		// "Classifier::containsCreateAction"
	}

	/**
	 * used to enumerate all connected CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 get_all_head358A5E2403D8
	// "Classifier::iteratorCreateAction"
	public java.util.Iterator iteratorCreateAction()
	// -end- 33CFD0A701A4 get_all_head358A5E2403D8
	// "Classifier::iteratorCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 get_all_body358A5E2403D8
		// "Classifier::iteratorCreateAction"
		return createAction.iterator();
		// -end- 33CFD0A701A4 get_all_body358A5E2403D8
		// "Classifier::iteratorCreateAction"
	}

	/**
	 * disconnect all CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_all_head358A5E2403D8
	// "Classifier::clearCreateAction"
	public void clearCreateAction()
	// -end- 33CFD0A701A4 remove_all_head358A5E2403D8
	// "Classifier::clearCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_all_body358A5E2403D8
		// "Classifier::clearCreateAction"
		if (sizeCreateAction() > 0) {
			for (java.util.Iterator p = createAction.iterator(); p.hasNext();) {
				((CreateAction) p.next())._unlinkInstantiation(this);
			}
			createAction.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearCreateAction"));
		}
		// -end- 33CFD0A701A4 remove_all_body358A5E2403D8
		// "Classifier::clearCreateAction"
	}

	/**
	 * returns the number of CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 size_head358A5E2403D8
	// "Classifier::sizeCreateAction"
	public int sizeCreateAction()
	// -end- 33CFD0A701A4 size_head358A5E2403D8 "Classifier::sizeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 size_body358A5E2403D8
		// "Classifier::sizeCreateAction"
		return createAction.size();
		// -end- 33CFD0A701A4 size_body358A5E2403D8
		// "Classifier::sizeCreateAction"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _link_body358A5E2403D8
	// "Classifier::_linkCreateAction"
	public void _linkCreateAction(CreateAction createAction1) {
		createAction.add(createAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkCreateAction"));
		return;
	}
	// -end- 33CFD0A701A4 _link_body358A5E2403D8 "Classifier::_linkCreateAction"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _unlink_body358A5E2403D8
	// "Classifier::_unlinkCreateAction"
	public void _unlinkCreateAction(CreateAction createAction1) {
		createAction.remove(createAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkCreateAction"));
		return;
	}
	// -end- 33CFD0A701A4 _unlink_body358A5E2403D8
	// "Classifier::_unlinkCreateAction"

	// -beg- preserve=no 32B5D7EF03D3 code358A5E2403D8 "feature"
	private java.util.List feature = new java.util.ArrayList();
	// -end- 32B5D7EF03D3 code358A5E2403D8 "feature"

	/**
	 * add a Feature.
	 *
	 * @see #removeFeature
	 * @see #containsFeature
	 * @see #iteratorFeature
	 * @see #clearFeature
	 * @see #sizeFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 add_head358A5E2403D8
	// "Classifier::addFeature"
	public void addFeature(Feature feature1)
	// -end- 32B5D7EF03D3 add_head358A5E2403D8 "Classifier::addFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add_body358A5E2403D8
		// "Classifier::addFeature"
		feature.add(feature1);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addFeature"));
		return;
		// -end- 32B5D7EF03D3 add_body358A5E2403D8 "Classifier::addFeature"
	}

	// -beg- preserve=no 32B5D7EF03D3 add2_head358A5E2403D8
	// "Classifier::add2Feature"
	public void addFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 add2_head358A5E2403D8 "Classifier::add2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add2_body358A5E2403D8
		// "Classifier::add2Feature"
		feature.add(index, feature1);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addFeature"));
		return;
		// -end- 32B5D7EF03D3 add2_body358A5E2403D8 "Classifier::add2Feature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_head358A5E2403D8
	// "Classifier::removeFeature"
	public Feature removeFeature(Feature feature1)
	// -end- 32B5D7EF03D3 remove_head358A5E2403D8 "Classifier::removeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_body358A5E2403D8
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
		// -end- 32B5D7EF03D3 remove_body358A5E2403D8
		// "Classifier::removeFeature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove2_head358A5E2403D8
	// "Classifier::remove2Feature"
	public Feature removeFeature(int index)
	// -end- 32B5D7EF03D3 remove2_head358A5E2403D8 "Classifier::remove2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove2_body358A5E2403D8
		// "Classifier::remove2Feature"
		Feature ret = null;
		ret = (Feature) feature.remove(index);
		ret._unlinkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeFeature"));
		return ret;
		// -end- 32B5D7EF03D3 remove2_body358A5E2403D8
		// "Classifier::remove2Feature"
	}

	/**
	 * change a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 set_head358A5E2403D8
	// "Classifier::setFeature"
	public Feature setFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 set_head358A5E2403D8 "Classifier::setFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 set_body358A5E2403D8
		// "Classifier::setFeature"
		Feature ret = null;
		ret = (Feature) feature.set(index, feature1);
		ret._unlinkOwner(this);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setFeature"));
		return ret;
		// -end- 32B5D7EF03D3 set_body358A5E2403D8 "Classifier::setFeature"
	}

	/**
	 * tests if a given Feature is connected.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 test_head358A5E2403D8
	// "Classifier::containsFeature"
	public boolean containsFeature(Feature feature1)
	// -end- 32B5D7EF03D3 test_head358A5E2403D8 "Classifier::containsFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 test_body358A5E2403D8
		// "Classifier::containsFeature"
		return feature.contains(feature1);
		// -end- 32B5D7EF03D3 test_body358A5E2403D8
		// "Classifier::containsFeature"
	}

	/**
	 * used to enumerate all connected Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 get_all_head358A5E2403D8
	// "Classifier::iteratorFeature"
	public java.util.Iterator iteratorFeature()
	// -end- 32B5D7EF03D3 get_all_head358A5E2403D8 "Classifier::iteratorFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 get_all_body358A5E2403D8
		// "Classifier::iteratorFeature"
		return feature.iterator();
		// -end- 32B5D7EF03D3 get_all_body358A5E2403D8
		// "Classifier::iteratorFeature"
	}

	/**
	 * disconnect all Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_all_head358A5E2403D8
	// "Classifier::clearFeature"
	public void clearFeature()
	// -end- 32B5D7EF03D3 remove_all_head358A5E2403D8 "Classifier::clearFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_all_body358A5E2403D8
		// "Classifier::clearFeature"
		if (sizeFeature() > 0) {
			for (java.util.Iterator p = feature.iterator(); p.hasNext();) {
				((Feature) p.next())._unlinkOwner(this);
			}
			feature.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearFeature"));
		}
		// -end- 32B5D7EF03D3 remove_all_body358A5E2403D8
		// "Classifier::clearFeature"
	}

	/**
	 * returns the number of Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 size_head358A5E2403D8
	// "Classifier::sizeFeature"
	public int sizeFeature()
	// -end- 32B5D7EF03D3 size_head358A5E2403D8 "Classifier::sizeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 size_body358A5E2403D8
		// "Classifier::sizeFeature"
		return feature.size();
		// -end- 32B5D7EF03D3 size_body358A5E2403D8 "Classifier::sizeFeature"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _link_body358A5E2403D8
	// "Classifier::_linkFeature"
	public void _linkFeature(Feature feature1) {
		feature.add(feature1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkFeature"));
		return;
	}
	// -end- 32B5D7EF03D3 _link_body358A5E2403D8 "Classifier::_linkFeature"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _unlink_body358A5E2403D8
	// "Classifier::_unlinkFeature"
	public void _unlinkFeature(Feature feature1) {
		feature.remove(feature1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkFeature"));
		return;
	}
	// -end- 32B5D7EF03D3 _unlink_body358A5E2403D8 "Classifier::_unlinkFeature"

	// -beg- preserve=no 33E265070353 code358A5E2403D8 "association"
	private java.util.Set association = new java.util.HashSet();
	// -end- 33E265070353 code358A5E2403D8 "association"

	/**
	 * add a Association.
	 *
	 * @see #removeAssociation
	 * @see #containsAssociation
	 * @see #iteratorAssociation
	 * @see #clearAssociation
	 * @see #sizeAssociation
	 */
	// -beg- preserve=no 33E265070353 add_head358A5E2403D8
	// "Classifier::addAssociation"
	public void addAssociation(AssociationEnd association1)
	// -end- 33E265070353 add_head358A5E2403D8 "Classifier::addAssociation"
	{
		// -beg- preserve=no 33E265070353 add_body358A5E2403D8
		// "Classifier::addAssociation"
		association.add(association1);
		association1._linkParticipant(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAssociation"));
		return;
		// -end- 33E265070353 add_body358A5E2403D8 "Classifier::addAssociation"
	}

	/**
	 * disconnect a Association.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_head358A5E2403D8
	// "Classifier::removeAssociation"
	public AssociationEnd removeAssociation(AssociationEnd association1)
	// -end- 33E265070353 remove_head358A5E2403D8
	// "Classifier::removeAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_body358A5E2403D8
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
		// -end- 33E265070353 remove_body358A5E2403D8
		// "Classifier::removeAssociation"
	}

	/**
	 * tests if a given Association is connected.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 test_head358A5E2403D8
	// "Classifier::containsAssociation"
	public boolean containsAssociation(AssociationEnd association1)
	// -end- 33E265070353 test_head358A5E2403D8
	// "Classifier::containsAssociation"
	{
		// -beg- preserve=no 33E265070353 test_body358A5E2403D8
		// "Classifier::containsAssociation"
		return association.contains(association1);
		// -end- 33E265070353 test_body358A5E2403D8
		// "Classifier::containsAssociation"
	}

	/**
	 * used to enumerate all connected Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 get_all_head358A5E2403D8
	// "Classifier::iteratorAssociation"
	public java.util.Iterator iteratorAssociation()
	// -end- 33E265070353 get_all_head358A5E2403D8
	// "Classifier::iteratorAssociation"
	{
		// -beg- preserve=no 33E265070353 get_all_body358A5E2403D8
		// "Classifier::iteratorAssociation"
		return association.iterator();
		// -end- 33E265070353 get_all_body358A5E2403D8
		// "Classifier::iteratorAssociation"
	}

	/**
	 * disconnect all Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_all_head358A5E2403D8
	// "Classifier::clearAssociation"
	public void clearAssociation()
	// -end- 33E265070353 remove_all_head358A5E2403D8
	// "Classifier::clearAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_all_body358A5E2403D8
		// "Classifier::clearAssociation"
		if (sizeAssociation() > 0) {
			for (java.util.Iterator p = association.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkParticipant(this);
			}
			association.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAssociation"));
		}
		// -end- 33E265070353 remove_all_body358A5E2403D8
		// "Classifier::clearAssociation"
	}

	/**
	 * returns the number of Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 size_head358A5E2403D8
	// "Classifier::sizeAssociation"
	public int sizeAssociation()
	// -end- 33E265070353 size_head358A5E2403D8 "Classifier::sizeAssociation"
	{
		// -beg- preserve=no 33E265070353 size_body358A5E2403D8
		// "Classifier::sizeAssociation"
		return association.size();
		// -end- 33E265070353 size_body358A5E2403D8
		// "Classifier::sizeAssociation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _link_body358A5E2403D8
	// "Classifier::_linkAssociation"
	public void _linkAssociation(AssociationEnd association1) {
		association.add(association1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAssociation"));
		return;
	}
	// -end- 33E265070353 _link_body358A5E2403D8 "Classifier::_linkAssociation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _unlink_body358A5E2403D8
	// "Classifier::_unlinkAssociation"
	public void _unlinkAssociation(AssociationEnd association1) {
		association.remove(association1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAssociation"));
		return;
	}
	// -end- 33E265070353 _unlink_body358A5E2403D8
	// "Classifier::_unlinkAssociation"

	// -beg- preserve=no 33F0EFAD00AB code358A5E2403D8 "specifiedEnd"
	private java.util.Set specifiedEnd = new java.util.HashSet();
	// -end- 33F0EFAD00AB code358A5E2403D8 "specifiedEnd"

	/**
	 * add a SpecifiedEnd.
	 *
	 * @see #removeSpecifiedEnd
	 * @see #containsSpecifiedEnd
	 * @see #iteratorSpecifiedEnd
	 * @see #clearSpecifiedEnd
	 * @see #sizeSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB add_head358A5E2403D8
	// "Classifier::addSpecifiedEnd"
	public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB add_head358A5E2403D8 "Classifier::addSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB add_body358A5E2403D8
		// "Classifier::addSpecifiedEnd"
		specifiedEnd.add(specifiedEnd1);
		specifiedEnd1._linkSpecification(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecifiedEnd"));
		return;
		// -end- 33F0EFAD00AB add_body358A5E2403D8 "Classifier::addSpecifiedEnd"
	}

	/**
	 * disconnect a SpecifiedEnd.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_head358A5E2403D8
	// "Classifier::removeSpecifiedEnd"
	public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB remove_head358A5E2403D8
	// "Classifier::removeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_body358A5E2403D8
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
		// -end- 33F0EFAD00AB remove_body358A5E2403D8
		// "Classifier::removeSpecifiedEnd"
	}

	/**
	 * tests if a given SpecifiedEnd is connected.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB test_head358A5E2403D8
	// "Classifier::containsSpecifiedEnd"
	public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB test_head358A5E2403D8
	// "Classifier::containsSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB test_body358A5E2403D8
		// "Classifier::containsSpecifiedEnd"
		return specifiedEnd.contains(specifiedEnd1);
		// -end- 33F0EFAD00AB test_body358A5E2403D8
		// "Classifier::containsSpecifiedEnd"
	}

	/**
	 * used to enumerate all connected SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB get_all_head358A5E2403D8
	// "Classifier::iteratorSpecifiedEnd"
	public java.util.Iterator iteratorSpecifiedEnd()
	// -end- 33F0EFAD00AB get_all_head358A5E2403D8
	// "Classifier::iteratorSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB get_all_body358A5E2403D8
		// "Classifier::iteratorSpecifiedEnd"
		return specifiedEnd.iterator();
		// -end- 33F0EFAD00AB get_all_body358A5E2403D8
		// "Classifier::iteratorSpecifiedEnd"
	}

	/**
	 * disconnect all SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_all_head358A5E2403D8
	// "Classifier::clearSpecifiedEnd"
	public void clearSpecifiedEnd()
	// -end- 33F0EFAD00AB remove_all_head358A5E2403D8
	// "Classifier::clearSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_all_body358A5E2403D8
		// "Classifier::clearSpecifiedEnd"
		if (sizeSpecifiedEnd() > 0) {
			for (java.util.Iterator p = specifiedEnd.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkSpecification(this);
			}
			specifiedEnd.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecifiedEnd"));
		}
		// -end- 33F0EFAD00AB remove_all_body358A5E2403D8
		// "Classifier::clearSpecifiedEnd"
	}

	/**
	 * returns the number of SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB size_head358A5E2403D8
	// "Classifier::sizeSpecifiedEnd"
	public int sizeSpecifiedEnd()
	// -end- 33F0EFAD00AB size_head358A5E2403D8 "Classifier::sizeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB size_body358A5E2403D8
		// "Classifier::sizeSpecifiedEnd"
		return specifiedEnd.size();
		// -end- 33F0EFAD00AB size_body358A5E2403D8
		// "Classifier::sizeSpecifiedEnd"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _link_body358A5E2403D8
	// "Classifier::_linkSpecifiedEnd"
	public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.add(specifiedEnd1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecifiedEnd"));
		return;
	}
	// -end- 33F0EFAD00AB _link_body358A5E2403D8 "Classifier::_linkSpecifiedEnd"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _unlink_body358A5E2403D8
	// "Classifier::_unlinkSpecifiedEnd"
	public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.remove(specifiedEnd1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecifiedEnd"));
		return;
	}
	// -end- 33F0EFAD00AB _unlink_body358A5E2403D8
	// "Classifier::_unlinkSpecifiedEnd"

	// -beg- preserve=no 36E96A87033E code358A5E2403D8 "powertypeRange"
	private java.util.Set powertypeRange = new java.util.HashSet();
	// -end- 36E96A87033E code358A5E2403D8 "powertypeRange"

	/**
	 * add a PowertypeRange.
	 *
	 * @see #removePowertypeRange
	 * @see #containsPowertypeRange
	 * @see #iteratorPowertypeRange
	 * @see #clearPowertypeRange
	 * @see #sizePowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E add_head358A5E2403D8
	// "Classifier::addPowertypeRange"
	public void addPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E add_head358A5E2403D8 "Classifier::addPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E add_body358A5E2403D8
		// "Classifier::addPowertypeRange"
		powertypeRange.add(powertypeRange1);
		powertypeRange1._linkPowertype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addPowertypeRange"));
		return;
		// -end- 36E96A87033E add_body358A5E2403D8
		// "Classifier::addPowertypeRange"
	}

	/**
	 * disconnect a PowertypeRange.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_head358A5E2403D8
	// "Classifier::removePowertypeRange"
	public Generalization removePowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E remove_head358A5E2403D8
	// "Classifier::removePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_body358A5E2403D8
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
		// -end- 36E96A87033E remove_body358A5E2403D8
		// "Classifier::removePowertypeRange"
	}

	/**
	 * tests if a given PowertypeRange is connected.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E test_head358A5E2403D8
	// "Classifier::containsPowertypeRange"
	public boolean containsPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E test_head358A5E2403D8
	// "Classifier::containsPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E test_body358A5E2403D8
		// "Classifier::containsPowertypeRange"
		return powertypeRange.contains(powertypeRange1);
		// -end- 36E96A87033E test_body358A5E2403D8
		// "Classifier::containsPowertypeRange"
	}

	/**
	 * used to enumerate all connected PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E get_all_head358A5E2403D8
	// "Classifier::iteratorPowertypeRange"
	public java.util.Iterator iteratorPowertypeRange()
	// -end- 36E96A87033E get_all_head358A5E2403D8
	// "Classifier::iteratorPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E get_all_body358A5E2403D8
		// "Classifier::iteratorPowertypeRange"
		return powertypeRange.iterator();
		// -end- 36E96A87033E get_all_body358A5E2403D8
		// "Classifier::iteratorPowertypeRange"
	}

	/**
	 * disconnect all PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_all_head358A5E2403D8
	// "Classifier::clearPowertypeRange"
	public void clearPowertypeRange()
	// -end- 36E96A87033E remove_all_head358A5E2403D8
	// "Classifier::clearPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_all_body358A5E2403D8
		// "Classifier::clearPowertypeRange"
		if (sizePowertypeRange() > 0) {
			for (java.util.Iterator p = powertypeRange.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkPowertype(this);
			}
			powertypeRange.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearPowertypeRange"));
		}
		// -end- 36E96A87033E remove_all_body358A5E2403D8
		// "Classifier::clearPowertypeRange"
	}

	/**
	 * returns the number of PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E size_head358A5E2403D8
	// "Classifier::sizePowertypeRange"
	public int sizePowertypeRange()
	// -end- 36E96A87033E size_head358A5E2403D8 "Classifier::sizePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E size_body358A5E2403D8
		// "Classifier::sizePowertypeRange"
		return powertypeRange.size();
		// -end- 36E96A87033E size_body358A5E2403D8
		// "Classifier::sizePowertypeRange"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _link_body358A5E2403D8
	// "Classifier::_linkPowertypeRange"
	public void _linkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.add(powertypeRange1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkPowertypeRange"));
		return;
	}
	// -end- 36E96A87033E _link_body358A5E2403D8
	// "Classifier::_linkPowertypeRange"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _unlink_body358A5E2403D8
	// "Classifier::_unlinkPowertypeRange"
	public void _unlinkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.remove(powertypeRange1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkPowertypeRange"));
		return;
	}
	// -end- 36E96A87033E _unlink_body358A5E2403D8
	// "Classifier::_unlinkPowertypeRange"

	// -beg- preserve=no 327A877801CC var358A5E2403D8 "isRoot"
	private boolean isRoot;
	// -end- 327A877801CC var358A5E2403D8 "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head358A5E2403D8 "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head358A5E2403D8 "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body358A5E2403D8 "isRoot"
		return isRoot;
		// -end- 327A877801CC get_body358A5E2403D8 "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head358A5E2403D8 "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head358A5E2403D8 "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body358A5E2403D8 "isRoot"
		if (isRoot != value1) {
			isRoot = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRoot"));
		}
		// -end- 327A877801CC set_body358A5E2403D8 "isRoot"
	}

	// -beg- preserve=no 327A877E006E var358A5E2403D8 "isLeaf"
	private boolean isLeaf;
	// -end- 327A877E006E var358A5E2403D8 "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head358A5E2403D8 "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head358A5E2403D8 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body358A5E2403D8 "isLeaf"
		return isLeaf;
		// -end- 327A877E006E get_body358A5E2403D8 "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head358A5E2403D8 "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head358A5E2403D8 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body358A5E2403D8 "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLeaf"));
		}
		// -end- 327A877E006E set_body358A5E2403D8 "isLeaf"
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
	// -beg- preserve=no 358A5E2403D8 detail_end "DomainDef"

	// -end- 358A5E2403D8 detail_end "DomainDef"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
