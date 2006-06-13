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


// -beg- preserve=no 358A5E62016A package "AbstractClassDef"
package ch.ehi.interlis.modeltopicclass;
// -end- 358A5E62016A package "AbstractClassDef"

// -beg- preserve=no 358A5E62016A autoimport "AbstractClassDef"
import ch.ehi.interlis.views.ViewableDef;
import ch.ehi.interlis.DefinitionProxy;
import ch.ehi.uml1_4.foundation.core.Class;
import ch.ehi.uml1_4.implementation.AbstractNamespace;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.basetypes.ClassType;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.associations.Participant;
import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.umleditor.umlpresentation.Diagram;
// -end- 358A5E62016A autoimport "AbstractClassDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5E62016A import "AbstractClassDef"

// -end- 358A5E62016A import "AbstractClassDef"

/** Definiert eine Klasse.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.2 $ $Date: 2006-06-13 14:22:01 $
 */
public abstract class AbstractClassDef extends AbstractNamespace implements ViewableDef , DefinitionProxy , Class , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 358A5E62016A detail_begin "AbstractClassDef"

  // -end- 358A5E62016A detail_begin "AbstractClassDef"

  // -beg- preserve=no 3CC7AFEE037D head358A5E62016A "getParentTopicDef"
  public TopicDef getParentTopicDef()
  // -end- 3CC7AFEE037D head358A5E62016A "getParentTopicDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CC7AFEE037D throws358A5E62016A "getParentTopicDef"

    // -end- 3CC7AFEE037D throws358A5E62016A "getParentTopicDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CC7AFEE037D body358A5E62016A "getParentTopicDef"
    Namespace parent=getNamespace();
    while(parent!=null){
      if(parent instanceof TopicDef){
        return (TopicDef)parent;
      }
      parent=parent.getNamespace();
    }
    throw new java.lang.IllegalStateException("ClassDef not part of a TopicDef");
    // -end- 3CC7AFEE037D body358A5E62016A "getParentTopicDef"
    }

  // -beg- preserve=no 3CC7B05A0346 head358A5E62016A "containsParentTopicDef"
  public boolean containsParentTopicDef()
  // -end- 3CC7B05A0346 head358A5E62016A "containsParentTopicDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CC7B05A0346 throws358A5E62016A "containsParentTopicDef"

    // -end- 3CC7B05A0346 throws358A5E62016A "containsParentTopicDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CC7B05A0346 body358A5E62016A "containsParentTopicDef"
    Namespace parent=this;
    while(parent.containsNamespace()){
      parent=parent.getNamespace();
      if(parent instanceof TopicDef){
        return true;
      }
    }
    return false;
    // -end- 3CC7B05A0346 body358A5E62016A "containsParentTopicDef"
    }

  /** return the list of valid owned elements for this namespace.
   */
  // -beg- preserve=no 3CE4FCA000D8 head358A5E62016A "getValidOwnedElements"
  public String[] getValidOwnedElements()
  // -end- 3CE4FCA000D8 head358A5E62016A "getValidOwnedElements"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CE4FCA000D8 throws358A5E62016A "getValidOwnedElements"

    // -end- 3CE4FCA000D8 throws358A5E62016A "getValidOwnedElements"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CE4FCA000D8 body358A5E62016A "getValidOwnedElements"
    String ret[]={"ch.ehi.interlis.attributes.AttributeDef"};
    return ret;
    // -end- 3CE4FCA000D8 body358A5E62016A "getValidOwnedElements"
    }

  // -beg- preserve=no 3D4FA21900C7 head358A5E62016A "unlinkAll"
  public void unlinkAll()
  // -end- 3D4FA21900C7 head358A5E62016A "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA21900C7 throws358A5E62016A "unlinkAll"

    // -end- 3D4FA21900C7 throws358A5E62016A "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA21900C7 body358A5E62016A "unlinkAll"
    
    clearConstraint();
    detachNamespace();
    // Role Factor: Factor object(s) may point to this
    // Role SignAttribute: SignAttribute object(s) may point to this
    clearFeature();
    clearGeneralization();
    clearSpecialization();
    detachOiddomain();
    // Role RefSysRef: RefSysRef object(s) may point to this
    clearClassType();
    // Role Metaobject: Metaobject object(s) may point to this
    clearAssociation();
    clearRestrictedAssociation();
    clearXorAssociation();
    clearXorRestrictedAssociation();
    setName(null);
    // Role AttributePath: AttributePath object(s) may point to this
    // Role RenamedViewableRef: RenamedViewableRef object(s) may point to this
    // Role ViewProjectionDef: ViewProjectionDef object(s) may point to this
    // Role GraphicDef: GraphicDef object(s) may point to this
    clearSupplierDependency();
    clearPresentation();
    clearBehavior();
    clearPartition();
    clearCollaboration();
    clearClassifierRole();
    clearCollaborationInstanceSet();
    clearClientDependency();
    clearTaggedValue();
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
    clearObjectFlowState();
    clearClassifierInState();
    clearInstance();
    clearCreateAction();
    // Role TypedFeature: StructuralFeature object(s) may point to this
    // Role TypedParameter: Parameter object(s) may point to this
    clearSpecifiedEnd();
    clearPowertypeRange();
    setDocumentation(null);
    clearOwnedElement();
    clearDiagram();
    super.unlinkAll();
    // -end- 3D4FA21900C7 body358A5E62016A "unlinkAll"
    }

  // -beg- preserve=no 3D4FA2190118 head358A5E62016A "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 3D4FA2190118 head358A5E62016A "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA2190118 throws358A5E62016A "enumerateChildren"

    // -end- 3D4FA2190118 throws358A5E62016A "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA2190118 body358A5E62016A "enumerateChildren"
    java.util.Iterator it=null;
    it=iteratorFeature();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getDocumentation());
    it=iteratorOwnedElement();while(it.hasNext())visitor.visit(it.next());
    it=iteratorDiagram();while(it.hasNext())visitor.visit(it.next());
    super.enumerateChildren(visitor);
    // -end- 3D4FA2190118 body358A5E62016A "enumerateChildren"
    }

  /** get a list of all attributes including the inherited ones.
   */
  // -beg- preserve=no 3E410E720307 head358A5E62016A "getConsolidatedAttributes"
  public java.util.List getConsolidatedAttributes()
  // -end- 3E410E720307 head358A5E62016A "getConsolidatedAttributes"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3E410E720307 throws358A5E62016A "getConsolidatedAttributes"

    // -end- 3E410E720307 throws358A5E62016A "getConsolidatedAttributes"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3E410E720307 body358A5E62016A "getConsolidatedAttributes"
    // TODO correct ordering of returned elements
	    java.util.List result = new java.util.LinkedList ();
            java.util.Set attrNameSet=new java.util.HashSet();
            AbstractClassDef currentClass=this;
            while(currentClass!=null){
              java.util.Iterator attri=currentClass.iteratorFeature();
              while(attri.hasNext()){
                ch.ehi.interlis.attributes.AttributeDef attr=(ch.ehi.interlis.attributes.AttributeDef)attri.next();
                if(!attrNameSet.contains(attr.getDefLangName())){
                  attrNameSet.add(attr.getDefLangName());
                  result.add(0,attr);
                }
              }
              // get base class if any
              java.util.Iterator geni=currentClass.iteratorGeneralization();
              currentClass=null;
              if(geni.hasNext()){
                Generalization gen=(Generalization)geni.next();
                currentClass=(AbstractClassDef)gen.getParent();
              }
            }
	    return result;
    // -end- 3E410E720307 body358A5E62016A "getConsolidatedAttributes"
    }

  // -beg- preserve=no 33EA67BB010E code358A5E62016A "constraint"

  // -end- 33EA67BB010E code358A5E62016A "constraint"

  /** add a Constraint.
   *  
   *  @see #removeConstraint
   *  @see #containsConstraint
   *  @see #iteratorConstraint
   *  @see #clearConstraint
   *  @see #sizeConstraint
   */
  // -beg- preserve=no 33EA67BB010E add_head358A5E62016A "ModelElement::addConstraint"
  public void addConstraint(Constraint constraint1)
  // -end- 33EA67BB010E add_head358A5E62016A "ModelElement::addConstraint"
  {
    // -beg- preserve=no 33EA67BB010E add_body358A5E62016A "ModelElement::addConstraint"
    super.addConstraint(constraint1);
    // -end- 33EA67BB010E add_body358A5E62016A "ModelElement::addConstraint"
  }

  /** disconnect a Constraint.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E remove_head358A5E62016A "ModelElement::removeConstraint"
  public Constraint removeConstraint(Constraint constraint1)
  // -end- 33EA67BB010E remove_head358A5E62016A "ModelElement::removeConstraint"
  {
    // -beg- preserve=no 33EA67BB010E remove_body358A5E62016A "ModelElement::removeConstraint"
    return super.removeConstraint(constraint1);
    // -end- 33EA67BB010E remove_body358A5E62016A "ModelElement::removeConstraint"
  }

  /** tests if a given Constraint is connected.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E test_head358A5E62016A "ModelElement::containsConstraint"
  public boolean containsConstraint(Constraint constraint1)
  // -end- 33EA67BB010E test_head358A5E62016A "ModelElement::containsConstraint"
  {
    // -beg- preserve=no 33EA67BB010E test_body358A5E62016A "ModelElement::containsConstraint"
    return super.containsConstraint(constraint1);
    // -end- 33EA67BB010E test_body358A5E62016A "ModelElement::containsConstraint"
  }

  /** used to enumerate all connected Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E get_all_head358A5E62016A "ModelElement::iteratorConstraint"
  public java.util.Iterator iteratorConstraint()
  // -end- 33EA67BB010E get_all_head358A5E62016A "ModelElement::iteratorConstraint"
  {
    // -beg- preserve=no 33EA67BB010E get_all_body358A5E62016A "ModelElement::iteratorConstraint"
    return super.iteratorConstraint();
    // -end- 33EA67BB010E get_all_body358A5E62016A "ModelElement::iteratorConstraint"
  }

  /** disconnect all Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E remove_all_head358A5E62016A "ModelElement::clearConstraint"
  public void clearConstraint()
  // -end- 33EA67BB010E remove_all_head358A5E62016A "ModelElement::clearConstraint"
  {
    // -beg- preserve=no 33EA67BB010E remove_all_body358A5E62016A "ModelElement::clearConstraint"
    super.clearConstraint();
    // -end- 33EA67BB010E remove_all_body358A5E62016A "ModelElement::clearConstraint"
  }

  /** returns the number of Constraints.
   *  @see #addConstraint
   */
  // -beg- preserve=no 33EA67BB010E size_head358A5E62016A "ModelElement::sizeConstraint"
  public int sizeConstraint()
  // -end- 33EA67BB010E size_head358A5E62016A "ModelElement::sizeConstraint"
  {
    // -beg- preserve=no 33EA67BB010E size_body358A5E62016A "ModelElement::sizeConstraint"
    return super.sizeConstraint();
    // -end- 33EA67BB010E size_body358A5E62016A "ModelElement::sizeConstraint"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EA67BB010E _link_body358A5E62016A "ModelElement::_linkConstraint"
  public void _linkConstraint(Constraint constraint1)
  {
    super._linkConstraint(constraint1);
  }
  // -end- 33EA67BB010E _link_body358A5E62016A "ModelElement::_linkConstraint"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33EA67BB010E _unlink_body358A5E62016A "ModelElement::_unlinkConstraint"
  public void _unlinkConstraint(Constraint constraint1)
  {
    super._unlinkConstraint(constraint1);
  }
  // -end- 33EA67BB010E _unlink_body358A5E62016A "ModelElement::_unlinkConstraint"

  // -beg- preserve=no 33598CAA030E code358A5E62016A "namespace"

  // -end- 33598CAA030E code358A5E62016A "namespace"

  /** attaches a Namespace.
   *  Designates the Namespace that contains the ModelElement.
   *  @see #detachNamespace
   *  @see #getNamespace
   *  @see #containsNamespace
   *  @see #getNamespaceLink
   *  @see #createNamespaceLink
   */
  // -beg- preserve=no 33598CAA030E attach_head358A5E62016A "ModelElement::attachNamespace"
  public void attachNamespace(Namespace namespace1)
  // -end- 33598CAA030E attach_head358A5E62016A "ModelElement::attachNamespace"
  {
    // -beg- preserve=no 33598CAA030E attach_body358A5E62016A "ModelElement::attachNamespace"
    super.attachNamespace(namespace1);
    // -end- 33598CAA030E attach_body358A5E62016A "ModelElement::attachNamespace"
  }

  /** attaches a link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E attachlink_head358A5E62016A "ModelElement::attachNamespaceLink"
  public void attachNamespaceLink(ElementOwnership namespace1)
  // -end- 33598CAA030E attachlink_head358A5E62016A "ModelElement::attachNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E attachlink_body358A5E62016A "ModelElement::attachNamespaceLink"
    super.attachNamespaceLink(namespace1);
    // -end- 33598CAA030E attachlink_body358A5E62016A "ModelElement::attachNamespaceLink"
  }

  /** disconnect the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E detach_head358A5E62016A "ModelElement::detachNamespace"
  public Namespace detachNamespace()
  // -end- 33598CAA030E detach_head358A5E62016A "ModelElement::detachNamespace"
  {
    // -beg- preserve=no 33598CAA030E detach_body358A5E62016A "ModelElement::detachNamespace"
    return super.detachNamespace();
    // -end- 33598CAA030E detach_body358A5E62016A "ModelElement::detachNamespace"
  }

  /** get the currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E get_head358A5E62016A "ModelElement::getNamespace"
  public Namespace getNamespace()
  // -end- 33598CAA030E get_head358A5E62016A "ModelElement::getNamespace"
  {
    // -beg- preserve=no 33598CAA030E get_body358A5E62016A "ModelElement::getNamespace"
    return super.getNamespace();
    // -end- 33598CAA030E get_body358A5E62016A "ModelElement::getNamespace"
  }

  /** get the link class of currently attached Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E getlink_head358A5E62016A "ModelElement::getNamespaceLink"
  public ElementOwnership getNamespaceLink()
  // -end- 33598CAA030E getlink_head358A5E62016A "ModelElement::getNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E getlink_body358A5E62016A "ModelElement::getNamespaceLink"
    return super.getNamespaceLink();
    // -end- 33598CAA030E getlink_body358A5E62016A "ModelElement::getNamespaceLink"
  }

  /** create a link class for a new link to a Namespace.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E createlink_head358A5E62016A "ModelElement::createNamespaceLink"
  public ElementOwnership createNamespaceLink()
  // -end- 33598CAA030E createlink_head358A5E62016A "ModelElement::createNamespaceLink"
  {
    // -beg- preserve=no 33598CAA030E createlink_body358A5E62016A "ModelElement::createNamespaceLink"
    return super.createNamespaceLink();
    // -end- 33598CAA030E createlink_body358A5E62016A "ModelElement::createNamespaceLink"
  }

  /** tests if there is a Namespace attached.
   *  @see #attachNamespace
   */
  // -beg- preserve=no 33598CAA030E test_head358A5E62016A "ModelElement::containsNamespace"
  public boolean containsNamespace()
  // -end- 33598CAA030E test_head358A5E62016A "ModelElement::containsNamespace"
  {
    // -beg- preserve=no 33598CAA030E test_body358A5E62016A "ModelElement::containsNamespace"
    return super.containsNamespace();
    // -end- 33598CAA030E test_body358A5E62016A "ModelElement::containsNamespace"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _link_body358A5E62016A "ModelElement::_linkNamespace"
  public void _linkNamespace(ElementOwnership namespace1)
  {
    super._linkNamespace(namespace1);
  }
  // -end- 33598CAA030E _link_body358A5E62016A "ModelElement::_linkNamespace"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33598CAA030E _unlink_body358A5E62016A "ModelElement::_unlinkNamespace"
  public void _unlinkNamespace(ElementOwnership namespace1)
  {
    super._unlinkNamespace(namespace1);
  }
  // -end- 33598CAA030E _unlink_body358A5E62016A "ModelElement::_unlinkNamespace"

  // -beg- preserve=no 32B5D7EF03D3 code358A5E62016A "feature"
  private java.util.List feature = new java.util.ArrayList();
  // -end- 32B5D7EF03D3 code358A5E62016A "feature"

  /** add a Feature.
   *  
   *  @see #removeFeature
   *  @see #containsFeature
   *  @see #iteratorFeature
   *  @see #clearFeature
   *  @see #sizeFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 add_head358A5E62016A "Classifier::addFeature"
  public void addFeature(Feature feature1)
  // -end- 32B5D7EF03D3 add_head358A5E62016A "Classifier::addFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 add_body358A5E62016A "Classifier::addFeature"
    feature.add(feature1);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addFeature"));
    return;
    // -end- 32B5D7EF03D3 add_body358A5E62016A "Classifier::addFeature"
  }

  // -beg- preserve=no 32B5D7EF03D3 add2_head358A5E62016A "Classifier::add2Feature"
  public void addFeature(int index,Feature feature1)
  // -end- 32B5D7EF03D3 add2_head358A5E62016A "Classifier::add2Feature"
  {
    // -beg- preserve=no 32B5D7EF03D3 add2_body358A5E62016A "Classifier::add2Feature"
    feature.add(index,feature1);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addFeature"));
    return;
    // -end- 32B5D7EF03D3 add2_body358A5E62016A "Classifier::add2Feature"
  }

  /** disconnect a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove_head358A5E62016A "Classifier::removeFeature"
  public Feature removeFeature(Feature feature1)
  // -end- 32B5D7EF03D3 remove_head358A5E62016A "Classifier::removeFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove_body358A5E62016A "Classifier::removeFeature"
    Feature ret=null;
    if(feature1==null || !feature.contains(feature1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = feature1;
    feature.remove(feature1);
    feature1._unlinkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeFeature"));
    return ret;
    // -end- 32B5D7EF03D3 remove_body358A5E62016A "Classifier::removeFeature"
  }

  /** disconnect a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove2_head358A5E62016A "Classifier::remove2Feature"
  public Feature removeFeature(int index)
  // -end- 32B5D7EF03D3 remove2_head358A5E62016A "Classifier::remove2Feature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove2_body358A5E62016A "Classifier::remove2Feature"
    Feature ret=null;
    ret = (Feature)feature.remove(index);
    ret._unlinkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeFeature"));
    return ret;
    // -end- 32B5D7EF03D3 remove2_body358A5E62016A "Classifier::remove2Feature"
  }

  /** change a Feature.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 set_head358A5E62016A "Classifier::setFeature"
  public Feature setFeature(int index,Feature feature1)
  // -end- 32B5D7EF03D3 set_head358A5E62016A "Classifier::setFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 set_body358A5E62016A "Classifier::setFeature"
    Feature ret=null;
    ret = (Feature)feature.set(index,feature1);
    ret._unlinkOwner(this);
    feature1._linkOwner(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setFeature"));
    return ret;
    // -end- 32B5D7EF03D3 set_body358A5E62016A "Classifier::setFeature"
  }

  /** tests if a given Feature is connected.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 test_head358A5E62016A "Classifier::containsFeature"
  public boolean containsFeature(Feature feature1)
  // -end- 32B5D7EF03D3 test_head358A5E62016A "Classifier::containsFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 test_body358A5E62016A "Classifier::containsFeature"
    return feature.contains(feature1);
    // -end- 32B5D7EF03D3 test_body358A5E62016A "Classifier::containsFeature"
  }

  /** used to enumerate all connected Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 get_all_head358A5E62016A "Classifier::iteratorFeature"
  public java.util.Iterator iteratorFeature()
  // -end- 32B5D7EF03D3 get_all_head358A5E62016A "Classifier::iteratorFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 get_all_body358A5E62016A "Classifier::iteratorFeature"
    return feature.iterator();
    // -end- 32B5D7EF03D3 get_all_body358A5E62016A "Classifier::iteratorFeature"
  }

  /** disconnect all Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 remove_all_head358A5E62016A "Classifier::clearFeature"
  public void clearFeature()
  // -end- 32B5D7EF03D3 remove_all_head358A5E62016A "Classifier::clearFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 remove_all_body358A5E62016A "Classifier::clearFeature"
    if(sizeFeature()>0){
      for(java.util.Iterator p = feature.iterator(); p.hasNext();){
        ((Feature)p.next())._unlinkOwner(this);
      }
      feature.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearFeature"));
    }
    // -end- 32B5D7EF03D3 remove_all_body358A5E62016A "Classifier::clearFeature"
  }

  /** returns the number of Features.
   *  @see #addFeature
   */
  // -beg- preserve=no 32B5D7EF03D3 size_head358A5E62016A "Classifier::sizeFeature"
  public int sizeFeature()
  // -end- 32B5D7EF03D3 size_head358A5E62016A "Classifier::sizeFeature"
  {
    // -beg- preserve=no 32B5D7EF03D3 size_body358A5E62016A "Classifier::sizeFeature"
    return feature.size();
    // -end- 32B5D7EF03D3 size_body358A5E62016A "Classifier::sizeFeature"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03D3 _link_body358A5E62016A "Classifier::_linkFeature"
  public void _linkFeature(Feature feature1)
  {
    feature.add(feature1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkFeature"));
    return;
  }
  // -end- 32B5D7EF03D3 _link_body358A5E62016A "Classifier::_linkFeature"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03D3 _unlink_body358A5E62016A "Classifier::_unlinkFeature"
  public void _unlinkFeature(Feature feature1)
  {
    feature.remove(feature1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkFeature"));
    return;
  }
  // -end- 32B5D7EF03D3 _unlink_body358A5E62016A "Classifier::_unlinkFeature"

  // -beg- preserve=no 335C14A5019A code358A5E62016A "generalization"
  private java.util.Set generalization = new java.util.HashSet();
  // -end- 335C14A5019A code358A5E62016A "generalization"

  /** add a Generalization.
   *  
   *  @see #removeGeneralization
   *  @see #containsGeneralization
   *  @see #iteratorGeneralization
   *  @see #clearGeneralization
   *  @see #sizeGeneralization
   */
  // -beg- preserve=no 335C14A5019A add_head358A5E62016A "GeneralizableElement::addGeneralization"
  public void addGeneralization(Generalization generalization1)
  // -end- 335C14A5019A add_head358A5E62016A "GeneralizableElement::addGeneralization"
  {
    // -beg- preserve=no 335C14A5019A add_body358A5E62016A "GeneralizableElement::addGeneralization"
    generalization.add(generalization1);
    generalization1._linkChild(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addGeneralization"));
    return;
    // -end- 335C14A5019A add_body358A5E62016A "GeneralizableElement::addGeneralization"
  }

  /** disconnect a Generalization.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_head358A5E62016A "GeneralizableElement::removeGeneralization"
  public Generalization removeGeneralization(Generalization generalization1)
  // -end- 335C14A5019A remove_head358A5E62016A "GeneralizableElement::removeGeneralization"
  {
    // -beg- preserve=no 335C14A5019A remove_body358A5E62016A "GeneralizableElement::removeGeneralization"
    Generalization ret=null;
    if(generalization1==null || !generalization.contains(generalization1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = generalization1;
    generalization.remove(generalization1);
    generalization1._unlinkChild(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeGeneralization"));
    return ret;
    // -end- 335C14A5019A remove_body358A5E62016A "GeneralizableElement::removeGeneralization"
  }

  /** tests if a given Generalization is connected.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A test_head358A5E62016A "GeneralizableElement::containsGeneralization"
  public boolean containsGeneralization(Generalization generalization1)
  // -end- 335C14A5019A test_head358A5E62016A "GeneralizableElement::containsGeneralization"
  {
    // -beg- preserve=no 335C14A5019A test_body358A5E62016A "GeneralizableElement::containsGeneralization"
    return generalization.contains(generalization1);
    // -end- 335C14A5019A test_body358A5E62016A "GeneralizableElement::containsGeneralization"
  }

  /** used to enumerate all connected Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A get_all_head358A5E62016A "GeneralizableElement::iteratorGeneralization"
  public java.util.Iterator iteratorGeneralization()
  // -end- 335C14A5019A get_all_head358A5E62016A "GeneralizableElement::iteratorGeneralization"
  {
    // -beg- preserve=no 335C14A5019A get_all_body358A5E62016A "GeneralizableElement::iteratorGeneralization"
    return generalization.iterator();
    // -end- 335C14A5019A get_all_body358A5E62016A "GeneralizableElement::iteratorGeneralization"
  }

  /** disconnect all Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_all_head358A5E62016A "GeneralizableElement::clearGeneralization"
  public void clearGeneralization()
  // -end- 335C14A5019A remove_all_head358A5E62016A "GeneralizableElement::clearGeneralization"
  {
    // -beg- preserve=no 335C14A5019A remove_all_body358A5E62016A "GeneralizableElement::clearGeneralization"
    if(sizeGeneralization()>0){
      for(java.util.Iterator p = generalization.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkChild(this);
      }
      generalization.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearGeneralization"));
    }
    // -end- 335C14A5019A remove_all_body358A5E62016A "GeneralizableElement::clearGeneralization"
  }

  /** returns the number of Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A size_head358A5E62016A "GeneralizableElement::sizeGeneralization"
  public int sizeGeneralization()
  // -end- 335C14A5019A size_head358A5E62016A "GeneralizableElement::sizeGeneralization"
  {
    // -beg- preserve=no 335C14A5019A size_body358A5E62016A "GeneralizableElement::sizeGeneralization"
    return generalization.size();
    // -end- 335C14A5019A size_body358A5E62016A "GeneralizableElement::sizeGeneralization"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _link_body358A5E62016A "GeneralizableElement::_linkGeneralization"
  public void _linkGeneralization(Generalization generalization1)
  {
    generalization.add(generalization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkGeneralization"));
    return;
  }
  // -end- 335C14A5019A _link_body358A5E62016A "GeneralizableElement::_linkGeneralization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _unlink_body358A5E62016A "GeneralizableElement::_unlinkGeneralization"
  public void _unlinkGeneralization(Generalization generalization1)
  {
    generalization.remove(generalization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkGeneralization"));
    return;
  }
  // -end- 335C14A5019A _unlink_body358A5E62016A "GeneralizableElement::_unlinkGeneralization"

  // -beg- preserve=no 335C146B01D6 code358A5E62016A "specialization"
  private java.util.Set specialization = new java.util.HashSet();
  // -end- 335C146B01D6 code358A5E62016A "specialization"

  /** add a Specialization.
   *  
   *  @see #removeSpecialization
   *  @see #containsSpecialization
   *  @see #iteratorSpecialization
   *  @see #clearSpecialization
   *  @see #sizeSpecialization
   */
  // -beg- preserve=no 335C146B01D6 add_head358A5E62016A "GeneralizableElement::addSpecialization"
  public void addSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 add_head358A5E62016A "GeneralizableElement::addSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 add_body358A5E62016A "GeneralizableElement::addSpecialization"
    specialization.add(specialization1);
    specialization1._linkParent(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecialization"));
    return;
    // -end- 335C146B01D6 add_body358A5E62016A "GeneralizableElement::addSpecialization"
  }

  /** disconnect a Specialization.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_head358A5E62016A "GeneralizableElement::removeSpecialization"
  public Generalization removeSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 remove_head358A5E62016A "GeneralizableElement::removeSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 remove_body358A5E62016A "GeneralizableElement::removeSpecialization"
    Generalization ret=null;
    if(specialization1==null || !specialization.contains(specialization1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = specialization1;
    specialization.remove(specialization1);
    specialization1._unlinkParent(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecialization"));
    return ret;
    // -end- 335C146B01D6 remove_body358A5E62016A "GeneralizableElement::removeSpecialization"
  }

  /** tests if a given Specialization is connected.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 test_head358A5E62016A "GeneralizableElement::containsSpecialization"
  public boolean containsSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 test_head358A5E62016A "GeneralizableElement::containsSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 test_body358A5E62016A "GeneralizableElement::containsSpecialization"
    return specialization.contains(specialization1);
    // -end- 335C146B01D6 test_body358A5E62016A "GeneralizableElement::containsSpecialization"
  }

  /** used to enumerate all connected Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 get_all_head358A5E62016A "GeneralizableElement::iteratorSpecialization"
  public java.util.Iterator iteratorSpecialization()
  // -end- 335C146B01D6 get_all_head358A5E62016A "GeneralizableElement::iteratorSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 get_all_body358A5E62016A "GeneralizableElement::iteratorSpecialization"
    return specialization.iterator();
    // -end- 335C146B01D6 get_all_body358A5E62016A "GeneralizableElement::iteratorSpecialization"
  }

  /** disconnect all Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_all_head358A5E62016A "GeneralizableElement::clearSpecialization"
  public void clearSpecialization()
  // -end- 335C146B01D6 remove_all_head358A5E62016A "GeneralizableElement::clearSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 remove_all_body358A5E62016A "GeneralizableElement::clearSpecialization"
    if(sizeSpecialization()>0){
      for(java.util.Iterator p = specialization.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkParent(this);
      }
      specialization.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecialization"));
    }
    // -end- 335C146B01D6 remove_all_body358A5E62016A "GeneralizableElement::clearSpecialization"
  }

  /** returns the number of Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 size_head358A5E62016A "GeneralizableElement::sizeSpecialization"
  public int sizeSpecialization()
  // -end- 335C146B01D6 size_head358A5E62016A "GeneralizableElement::sizeSpecialization"
  {
    // -beg- preserve=no 335C146B01D6 size_body358A5E62016A "GeneralizableElement::sizeSpecialization"
    return specialization.size();
    // -end- 335C146B01D6 size_body358A5E62016A "GeneralizableElement::sizeSpecialization"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _link_body358A5E62016A "GeneralizableElement::_linkSpecialization"
  public void _linkSpecialization(Generalization specialization1)
  {
    specialization.add(specialization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecialization"));
    return;
  }
  // -end- 335C146B01D6 _link_body358A5E62016A "GeneralizableElement::_linkSpecialization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _unlink_body358A5E62016A "GeneralizableElement::_unlinkSpecialization"
  public void _unlinkSpecialization(Generalization specialization1)
  {
    specialization.remove(specialization1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecialization"));
    return;
  }
  // -end- 335C146B01D6 _unlink_body358A5E62016A "GeneralizableElement::_unlinkSpecialization"

  // -beg- preserve=no 448921B701AF code358A5E62016A "oiddomain"
  private DomainDef oiddomain;
  // -end- 448921B701AF code358A5E62016A "oiddomain"

  /** attaches a Oiddomain.
   *  
   *  @see #detachOiddomain
   *  @see #getOiddomain
   *  @see #containsOiddomain
   */
  // -beg- preserve=no 448921B701AF attach_head358A5E62016A "AbstractClassDef::attachOiddomain"
  public void attachOiddomain(DomainDef oiddomain1)
  // -end- 448921B701AF attach_head358A5E62016A "AbstractClassDef::attachOiddomain"
  {
    // -beg- preserve=no 448921B701AF attach_body358A5E62016A "AbstractClassDef::attachOiddomain"
    if(oiddomain!=null) {throw new java.lang.IllegalStateException("already a oiddomain attached");}
    if(oiddomain1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as oiddomain");}
    oiddomain = oiddomain1;
    oiddomain1._linkAbstractClassDef(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachOiddomain"));
    return;
    // -end- 448921B701AF attach_body358A5E62016A "AbstractClassDef::attachOiddomain"
  }

  /** disconnect the currently attached Oiddomain.
   *  @see #attachOiddomain
   */
  // -beg- preserve=no 448921B701AF detach_head358A5E62016A "AbstractClassDef::detachOiddomain"
  public DomainDef detachOiddomain()
  // -end- 448921B701AF detach_head358A5E62016A "AbstractClassDef::detachOiddomain"
  {
    // -beg- preserve=no 448921B701AF detach_body358A5E62016A "AbstractClassDef::detachOiddomain"
    DomainDef ret = null;
    if(oiddomain!=null){
      oiddomain._unlinkAbstractClassDef(this);
      ret = oiddomain;
      oiddomain = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachOiddomain"));
    return ret;
    // -end- 448921B701AF detach_body358A5E62016A "AbstractClassDef::detachOiddomain"
  }

  /** get the currently attached Oiddomain.
   *  @see #attachOiddomain
   */
  // -beg- preserve=no 448921B701AF get_head358A5E62016A "AbstractClassDef::getOiddomain"
  public DomainDef getOiddomain()
  // -end- 448921B701AF get_head358A5E62016A "AbstractClassDef::getOiddomain"
  {
    // -beg- preserve=no 448921B701AF get_body358A5E62016A "AbstractClassDef::getOiddomain"
    if(oiddomain==null) {throw new java.lang.IllegalStateException("no oiddomain attached");}
    return oiddomain;
    // -end- 448921B701AF get_body358A5E62016A "AbstractClassDef::getOiddomain"
  }

  /** tests if there is a Oiddomain attached.
   *  @see #attachOiddomain
   */
  // -beg- preserve=no 448921B701AF test_head358A5E62016A "AbstractClassDef::containsOiddomain"
  public boolean containsOiddomain()
  // -end- 448921B701AF test_head358A5E62016A "AbstractClassDef::containsOiddomain"
  {
    // -beg- preserve=no 448921B701AF test_body358A5E62016A "AbstractClassDef::containsOiddomain"
    return oiddomain!=null;
    // -end- 448921B701AF test_body358A5E62016A "AbstractClassDef::containsOiddomain"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 448921B701AF _link_body358A5E62016A "AbstractClassDef::_linkOiddomain"
  public void _linkOiddomain(DomainDef oiddomain1)
  {
    oiddomain = oiddomain1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkOiddomain"));
    return;
  }
  // -end- 448921B701AF _link_body358A5E62016A "AbstractClassDef::_linkOiddomain"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 448921B701AF _unlink_body358A5E62016A "AbstractClassDef::_unlinkOiddomain"
  public void _unlinkOiddomain(DomainDef oiddomain1)
  {
    oiddomain = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkOiddomain"));
    return;
  }
  // -end- 448921B701AF _unlink_body358A5E62016A "AbstractClassDef::_unlinkOiddomain"

  // -beg- preserve=no 3FDC4A7B0396 code358A5E62016A "classType"
  private java.util.Set classType = new java.util.HashSet();
  // -end- 3FDC4A7B0396 code358A5E62016A "classType"

  /** add a ClassType.
   *  
   *  @see #removeClassType
   *  @see #containsClassType
   *  @see #iteratorClassType
   *  @see #clearClassType
   *  @see #sizeClassType
   */
  // -beg- preserve=no 3FDC4A7B0396 add_head358A5E62016A "AbstractClassDef::addClassType"
  public void addClassType(ClassType classType1)
  // -end- 3FDC4A7B0396 add_head358A5E62016A "AbstractClassDef::addClassType"
  {
    // -beg- preserve=no 3FDC4A7B0396 add_body358A5E62016A "AbstractClassDef::addClassType"
    classType.add(classType1);
    classType1._linkRestrictedTo(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClassType"));
    return;
    // -end- 3FDC4A7B0396 add_body358A5E62016A "AbstractClassDef::addClassType"
  }

  /** disconnect a ClassType.
   *  @see #addClassType
   */
  // -beg- preserve=no 3FDC4A7B0396 remove_head358A5E62016A "AbstractClassDef::removeClassType"
  public ClassType removeClassType(ClassType classType1)
  // -end- 3FDC4A7B0396 remove_head358A5E62016A "AbstractClassDef::removeClassType"
  {
    // -beg- preserve=no 3FDC4A7B0396 remove_body358A5E62016A "AbstractClassDef::removeClassType"
    ClassType ret=null;
    if(classType1==null || !classType.contains(classType1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = classType1;
    classType.remove(classType1);
    classType1._unlinkRestrictedTo(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClassType"));
    return ret;
    // -end- 3FDC4A7B0396 remove_body358A5E62016A "AbstractClassDef::removeClassType"
  }

  /** tests if a given ClassType is connected.
   *  @see #addClassType
   */
  // -beg- preserve=no 3FDC4A7B0396 test_head358A5E62016A "AbstractClassDef::containsClassType"
  public boolean containsClassType(ClassType classType1)
  // -end- 3FDC4A7B0396 test_head358A5E62016A "AbstractClassDef::containsClassType"
  {
    // -beg- preserve=no 3FDC4A7B0396 test_body358A5E62016A "AbstractClassDef::containsClassType"
    return classType.contains(classType1);
    // -end- 3FDC4A7B0396 test_body358A5E62016A "AbstractClassDef::containsClassType"
  }

  /** used to enumerate all connected ClassTypes.
   *  @see #addClassType
   */
  // -beg- preserve=no 3FDC4A7B0396 get_all_head358A5E62016A "AbstractClassDef::iteratorClassType"
  public java.util.Iterator iteratorClassType()
  // -end- 3FDC4A7B0396 get_all_head358A5E62016A "AbstractClassDef::iteratorClassType"
  {
    // -beg- preserve=no 3FDC4A7B0396 get_all_body358A5E62016A "AbstractClassDef::iteratorClassType"
    return classType.iterator();
    // -end- 3FDC4A7B0396 get_all_body358A5E62016A "AbstractClassDef::iteratorClassType"
  }

  /** disconnect all ClassTypes.
   *  @see #addClassType
   */
  // -beg- preserve=no 3FDC4A7B0396 remove_all_head358A5E62016A "AbstractClassDef::clearClassType"
  public void clearClassType()
  // -end- 3FDC4A7B0396 remove_all_head358A5E62016A "AbstractClassDef::clearClassType"
  {
    // -beg- preserve=no 3FDC4A7B0396 remove_all_body358A5E62016A "AbstractClassDef::clearClassType"
    if(sizeClassType()>0){
      for(java.util.Iterator p = classType.iterator(); p.hasNext();){
        ((ClassType)p.next())._unlinkRestrictedTo(this);
      }
      classType.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClassType"));
    }
    // -end- 3FDC4A7B0396 remove_all_body358A5E62016A "AbstractClassDef::clearClassType"
  }

  /** returns the number of ClassTypes.
   *  @see #addClassType
   */
  // -beg- preserve=no 3FDC4A7B0396 size_head358A5E62016A "AbstractClassDef::sizeClassType"
  public int sizeClassType()
  // -end- 3FDC4A7B0396 size_head358A5E62016A "AbstractClassDef::sizeClassType"
  {
    // -beg- preserve=no 3FDC4A7B0396 size_body358A5E62016A "AbstractClassDef::sizeClassType"
    return classType.size();
    // -end- 3FDC4A7B0396 size_body358A5E62016A "AbstractClassDef::sizeClassType"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3FDC4A7B0396 _link_body358A5E62016A "AbstractClassDef::_linkClassType"
  public void _linkClassType(ClassType classType1)
  {
    classType.add(classType1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassType"));
    return;
  }
  // -end- 3FDC4A7B0396 _link_body358A5E62016A "AbstractClassDef::_linkClassType"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3FDC4A7B0396 _unlink_body358A5E62016A "AbstractClassDef::_unlinkClassType"
  public void _unlinkClassType(ClassType classType1)
  {
    classType.remove(classType1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassType"));
    return;
  }
  // -end- 3FDC4A7B0396 _unlink_body358A5E62016A "AbstractClassDef::_unlinkClassType"

  // -beg- preserve=no 33E265070353 code358A5E62016A "association"
  private java.util.Set association = new java.util.HashSet();
  // -end- 33E265070353 code358A5E62016A "association"

  /** add a Association.
   *  
   *  @see #removeAssociation
   *  @see #containsAssociation
   *  @see #iteratorAssociation
   *  @see #clearAssociation
   *  @see #sizeAssociation
   */
  // -beg- preserve=no 33E265070353 add_head358A5E62016A "Classifier::addAssociation"
  public void addAssociation(AssociationEnd association1)
  // -end- 33E265070353 add_head358A5E62016A "Classifier::addAssociation"
  {
    // -beg- preserve=no 33E265070353 add_body358A5E62016A "Classifier::addAssociation"
    association.add(association1);
    association1._linkParticipant(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addAssociation"));
    return;
    // -end- 33E265070353 add_body358A5E62016A "Classifier::addAssociation"
  }

  /** disconnect a Association.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 remove_head358A5E62016A "Classifier::removeAssociation"
  public AssociationEnd removeAssociation(AssociationEnd association1)
  // -end- 33E265070353 remove_head358A5E62016A "Classifier::removeAssociation"
  {
    // -beg- preserve=no 33E265070353 remove_body358A5E62016A "Classifier::removeAssociation"
    AssociationEnd ret=null;
    if(association1==null || !association.contains(association1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = association1;
    association.remove(association1);
    association1._unlinkParticipant(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeAssociation"));
    return ret;
    // -end- 33E265070353 remove_body358A5E62016A "Classifier::removeAssociation"
  }

  /** tests if a given Association is connected.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 test_head358A5E62016A "Classifier::containsAssociation"
  public boolean containsAssociation(AssociationEnd association1)
  // -end- 33E265070353 test_head358A5E62016A "Classifier::containsAssociation"
  {
    // -beg- preserve=no 33E265070353 test_body358A5E62016A "Classifier::containsAssociation"
    return association.contains(association1);
    // -end- 33E265070353 test_body358A5E62016A "Classifier::containsAssociation"
  }

  /** used to enumerate all connected Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 get_all_head358A5E62016A "Classifier::iteratorAssociation"
  public java.util.Iterator iteratorAssociation()
  // -end- 33E265070353 get_all_head358A5E62016A "Classifier::iteratorAssociation"
  {
    // -beg- preserve=no 33E265070353 get_all_body358A5E62016A "Classifier::iteratorAssociation"
    return association.iterator();
    // -end- 33E265070353 get_all_body358A5E62016A "Classifier::iteratorAssociation"
  }

  /** disconnect all Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 remove_all_head358A5E62016A "Classifier::clearAssociation"
  public void clearAssociation()
  // -end- 33E265070353 remove_all_head358A5E62016A "Classifier::clearAssociation"
  {
    // -beg- preserve=no 33E265070353 remove_all_body358A5E62016A "Classifier::clearAssociation"
    if(sizeAssociation()>0){
      for(java.util.Iterator p = association.iterator(); p.hasNext();){
        ((AssociationEnd)p.next())._unlinkParticipant(this);
      }
      association.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearAssociation"));
    }
    // -end- 33E265070353 remove_all_body358A5E62016A "Classifier::clearAssociation"
  }

  /** returns the number of Associations.
   *  @see #addAssociation
   */
  // -beg- preserve=no 33E265070353 size_head358A5E62016A "Classifier::sizeAssociation"
  public int sizeAssociation()
  // -end- 33E265070353 size_head358A5E62016A "Classifier::sizeAssociation"
  {
    // -beg- preserve=no 33E265070353 size_body358A5E62016A "Classifier::sizeAssociation"
    return association.size();
    // -end- 33E265070353 size_body358A5E62016A "Classifier::sizeAssociation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070353 _link_body358A5E62016A "Classifier::_linkAssociation"
  public void _linkAssociation(AssociationEnd association1)
  {
    association.add(association1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAssociation"));
    return;
  }
  // -end- 33E265070353 _link_body358A5E62016A "Classifier::_linkAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33E265070353 _unlink_body358A5E62016A "Classifier::_unlinkAssociation"
  public void _unlinkAssociation(AssociationEnd association1)
  {
    association.remove(association1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAssociation"));
    return;
  }
  // -end- 33E265070353 _unlink_body358A5E62016A "Classifier::_unlinkAssociation"

  // -beg- preserve=no 3D4A37EC0272 code358A5E62016A "restrictedAssociation"
  private java.util.Set restrictedAssociation = new java.util.HashSet();
  // -end- 3D4A37EC0272 code358A5E62016A "restrictedAssociation"

  /** add a RestrictedAssociation.
   *  
   *  @see #removeRestrictedAssociation
   *  @see #containsRestrictedAssociation
   *  @see #iteratorRestrictedAssociation
   *  @see #clearRestrictedAssociation
   *  @see #sizeRestrictedAssociation
   */
  // -beg- preserve=no 3D4A37EC0272 add_head358A5E62016A "AbstractClassDef::addRestrictedAssociation"
  public void addRestrictedAssociation(RoleDef restrictedAssociation1)
  // -end- 3D4A37EC0272 add_head358A5E62016A "AbstractClassDef::addRestrictedAssociation"
  {
    // -beg- preserve=no 3D4A37EC0272 add_body358A5E62016A "AbstractClassDef::addRestrictedAssociation"
    restrictedAssociation.add(restrictedAssociation1);
    restrictedAssociation1._linkRestriction(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addRestrictedAssociation"));
    return;
    // -end- 3D4A37EC0272 add_body358A5E62016A "AbstractClassDef::addRestrictedAssociation"
  }

  /** disconnect a RestrictedAssociation.
   *  @see #addRestrictedAssociation
   */
  // -beg- preserve=no 3D4A37EC0272 remove_head358A5E62016A "AbstractClassDef::removeRestrictedAssociation"
  public RoleDef removeRestrictedAssociation(RoleDef restrictedAssociation1)
  // -end- 3D4A37EC0272 remove_head358A5E62016A "AbstractClassDef::removeRestrictedAssociation"
  {
    // -beg- preserve=no 3D4A37EC0272 remove_body358A5E62016A "AbstractClassDef::removeRestrictedAssociation"
    RoleDef ret=null;
    if(restrictedAssociation1==null || !restrictedAssociation.contains(restrictedAssociation1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = restrictedAssociation1;
    restrictedAssociation.remove(restrictedAssociation1);
    restrictedAssociation1._unlinkRestriction(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeRestrictedAssociation"));
    return ret;
    // -end- 3D4A37EC0272 remove_body358A5E62016A "AbstractClassDef::removeRestrictedAssociation"
  }

  /** tests if a given RestrictedAssociation is connected.
   *  @see #addRestrictedAssociation
   */
  // -beg- preserve=no 3D4A37EC0272 test_head358A5E62016A "AbstractClassDef::containsRestrictedAssociation"
  public boolean containsRestrictedAssociation(RoleDef restrictedAssociation1)
  // -end- 3D4A37EC0272 test_head358A5E62016A "AbstractClassDef::containsRestrictedAssociation"
  {
    // -beg- preserve=no 3D4A37EC0272 test_body358A5E62016A "AbstractClassDef::containsRestrictedAssociation"
    return restrictedAssociation.contains(restrictedAssociation1);
    // -end- 3D4A37EC0272 test_body358A5E62016A "AbstractClassDef::containsRestrictedAssociation"
  }

  /** used to enumerate all connected RestrictedAssociations.
   *  @see #addRestrictedAssociation
   */
  // -beg- preserve=no 3D4A37EC0272 get_all_head358A5E62016A "AbstractClassDef::iteratorRestrictedAssociation"
  public java.util.Iterator iteratorRestrictedAssociation()
  // -end- 3D4A37EC0272 get_all_head358A5E62016A "AbstractClassDef::iteratorRestrictedAssociation"
  {
    // -beg- preserve=no 3D4A37EC0272 get_all_body358A5E62016A "AbstractClassDef::iteratorRestrictedAssociation"
    return restrictedAssociation.iterator();
    // -end- 3D4A37EC0272 get_all_body358A5E62016A "AbstractClassDef::iteratorRestrictedAssociation"
  }

  /** disconnect all RestrictedAssociations.
   *  @see #addRestrictedAssociation
   */
  // -beg- preserve=no 3D4A37EC0272 remove_all_head358A5E62016A "AbstractClassDef::clearRestrictedAssociation"
  public void clearRestrictedAssociation()
  // -end- 3D4A37EC0272 remove_all_head358A5E62016A "AbstractClassDef::clearRestrictedAssociation"
  {
    // -beg- preserve=no 3D4A37EC0272 remove_all_body358A5E62016A "AbstractClassDef::clearRestrictedAssociation"
    if(sizeRestrictedAssociation()>0){
      for(java.util.Iterator p = restrictedAssociation.iterator(); p.hasNext();){
        ((RoleDef)p.next())._unlinkRestriction(this);
      }
      restrictedAssociation.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearRestrictedAssociation"));
    }
    // -end- 3D4A37EC0272 remove_all_body358A5E62016A "AbstractClassDef::clearRestrictedAssociation"
  }

  /** returns the number of RestrictedAssociations.
   *  @see #addRestrictedAssociation
   */
  // -beg- preserve=no 3D4A37EC0272 size_head358A5E62016A "AbstractClassDef::sizeRestrictedAssociation"
  public int sizeRestrictedAssociation()
  // -end- 3D4A37EC0272 size_head358A5E62016A "AbstractClassDef::sizeRestrictedAssociation"
  {
    // -beg- preserve=no 3D4A37EC0272 size_body358A5E62016A "AbstractClassDef::sizeRestrictedAssociation"
    return restrictedAssociation.size();
    // -end- 3D4A37EC0272 size_body358A5E62016A "AbstractClassDef::sizeRestrictedAssociation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3D4A37EC0272 _link_body358A5E62016A "AbstractClassDef::_linkRestrictedAssociation"
  public void _linkRestrictedAssociation(RoleDef restrictedAssociation1)
  {
    restrictedAssociation.add(restrictedAssociation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkRestrictedAssociation"));
    return;
  }
  // -end- 3D4A37EC0272 _link_body358A5E62016A "AbstractClassDef::_linkRestrictedAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3D4A37EC0272 _unlink_body358A5E62016A "AbstractClassDef::_unlinkRestrictedAssociation"
  public void _unlinkRestrictedAssociation(RoleDef restrictedAssociation1)
  {
    restrictedAssociation.remove(restrictedAssociation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkRestrictedAssociation"));
    return;
  }
  // -end- 3D4A37EC0272 _unlink_body358A5E62016A "AbstractClassDef::_unlinkRestrictedAssociation"

  // -beg- preserve=no 4489350902DB code358A5E62016A "xorAssociation"
  private java.util.Set xorAssociation = new java.util.HashSet();
  // -end- 4489350902DB code358A5E62016A "xorAssociation"

  /** add a XorAssociation.
   *  
   *  @see #removeXorAssociation
   *  @see #containsXorAssociation
   *  @see #iteratorXorAssociation
   *  @see #clearXorAssociation
   *  @see #sizeXorAssociation
   */
  // -beg- preserve=no 4489350902DB add_head358A5E62016A "AbstractClassDef::addXorAssociation"
  public void addXorAssociation(Participant xorAssociation1)
  // -end- 4489350902DB add_head358A5E62016A "AbstractClassDef::addXorAssociation"
  {
    // -beg- preserve=no 4489350902DB add_body358A5E62016A "AbstractClassDef::addXorAssociation"
    xorAssociation.add(xorAssociation1);
    xorAssociation1._linkParticipant(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addXorAssociation"));
    return;
    // -end- 4489350902DB add_body358A5E62016A "AbstractClassDef::addXorAssociation"
  }

  /** disconnect a XorAssociation.
   *  @see #addXorAssociation
   */
  // -beg- preserve=no 4489350902DB remove_head358A5E62016A "AbstractClassDef::removeXorAssociation"
  public Participant removeXorAssociation(Participant xorAssociation1)
  // -end- 4489350902DB remove_head358A5E62016A "AbstractClassDef::removeXorAssociation"
  {
    // -beg- preserve=no 4489350902DB remove_body358A5E62016A "AbstractClassDef::removeXorAssociation"
    Participant ret=null;
    if(xorAssociation1==null || !xorAssociation.contains(xorAssociation1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = xorAssociation1;
    xorAssociation.remove(xorAssociation1);
    xorAssociation1._unlinkParticipant(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeXorAssociation"));
    return ret;
    // -end- 4489350902DB remove_body358A5E62016A "AbstractClassDef::removeXorAssociation"
  }

  /** tests if a given XorAssociation is connected.
   *  @see #addXorAssociation
   */
  // -beg- preserve=no 4489350902DB test_head358A5E62016A "AbstractClassDef::containsXorAssociation"
  public boolean containsXorAssociation(Participant xorAssociation1)
  // -end- 4489350902DB test_head358A5E62016A "AbstractClassDef::containsXorAssociation"
  {
    // -beg- preserve=no 4489350902DB test_body358A5E62016A "AbstractClassDef::containsXorAssociation"
    return xorAssociation.contains(xorAssociation1);
    // -end- 4489350902DB test_body358A5E62016A "AbstractClassDef::containsXorAssociation"
  }

  /** used to enumerate all connected XorAssociations.
   *  @see #addXorAssociation
   */
  // -beg- preserve=no 4489350902DB get_all_head358A5E62016A "AbstractClassDef::iteratorXorAssociation"
  public java.util.Iterator iteratorXorAssociation()
  // -end- 4489350902DB get_all_head358A5E62016A "AbstractClassDef::iteratorXorAssociation"
  {
    // -beg- preserve=no 4489350902DB get_all_body358A5E62016A "AbstractClassDef::iteratorXorAssociation"
    return xorAssociation.iterator();
    // -end- 4489350902DB get_all_body358A5E62016A "AbstractClassDef::iteratorXorAssociation"
  }

  /** disconnect all XorAssociations.
   *  @see #addXorAssociation
   */
  // -beg- preserve=no 4489350902DB remove_all_head358A5E62016A "AbstractClassDef::clearXorAssociation"
  public void clearXorAssociation()
  // -end- 4489350902DB remove_all_head358A5E62016A "AbstractClassDef::clearXorAssociation"
  {
    // -beg- preserve=no 4489350902DB remove_all_body358A5E62016A "AbstractClassDef::clearXorAssociation"
    if(sizeXorAssociation()>0){
      for(java.util.Iterator p = xorAssociation.iterator(); p.hasNext();){
        ((Participant)p.next())._unlinkParticipant(this);
      }
      xorAssociation.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearXorAssociation"));
    }
    // -end- 4489350902DB remove_all_body358A5E62016A "AbstractClassDef::clearXorAssociation"
  }

  /** returns the number of XorAssociations.
   *  @see #addXorAssociation
   */
  // -beg- preserve=no 4489350902DB size_head358A5E62016A "AbstractClassDef::sizeXorAssociation"
  public int sizeXorAssociation()
  // -end- 4489350902DB size_head358A5E62016A "AbstractClassDef::sizeXorAssociation"
  {
    // -beg- preserve=no 4489350902DB size_body358A5E62016A "AbstractClassDef::sizeXorAssociation"
    return xorAssociation.size();
    // -end- 4489350902DB size_body358A5E62016A "AbstractClassDef::sizeXorAssociation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4489350902DB _link_body358A5E62016A "AbstractClassDef::_linkXorAssociation"
  public void _linkXorAssociation(Participant xorAssociation1)
  {
    xorAssociation.add(xorAssociation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkXorAssociation"));
    return;
  }
  // -end- 4489350902DB _link_body358A5E62016A "AbstractClassDef::_linkXorAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4489350902DB _unlink_body358A5E62016A "AbstractClassDef::_unlinkXorAssociation"
  public void _unlinkXorAssociation(Participant xorAssociation1)
  {
    xorAssociation.remove(xorAssociation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkXorAssociation"));
    return;
  }
  // -end- 4489350902DB _unlink_body358A5E62016A "AbstractClassDef::_unlinkXorAssociation"

  // -beg- preserve=no 4489358A007E code358A5E62016A "xorRestrictedAssociation"
  private java.util.Set xorRestrictedAssociation = new java.util.HashSet();
  // -end- 4489358A007E code358A5E62016A "xorRestrictedAssociation"

  /** add a XorRestrictedAssociation.
   *  
   *  @see #removeXorRestrictedAssociation
   *  @see #containsXorRestrictedAssociation
   *  @see #iteratorXorRestrictedAssociation
   *  @see #clearXorRestrictedAssociation
   *  @see #sizeXorRestrictedAssociation
   */
  // -beg- preserve=no 4489358A007E add_head358A5E62016A "AbstractClassDef::addXorRestrictedAssociation"
  public void addXorRestrictedAssociation(Participant xorRestrictedAssociation1)
  // -end- 4489358A007E add_head358A5E62016A "AbstractClassDef::addXorRestrictedAssociation"
  {
    // -beg- preserve=no 4489358A007E add_body358A5E62016A "AbstractClassDef::addXorRestrictedAssociation"
    xorRestrictedAssociation.add(xorRestrictedAssociation1);
    xorRestrictedAssociation1._linkRestriction(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addXorRestrictedAssociation"));
    return;
    // -end- 4489358A007E add_body358A5E62016A "AbstractClassDef::addXorRestrictedAssociation"
  }

  /** disconnect a XorRestrictedAssociation.
   *  @see #addXorRestrictedAssociation
   */
  // -beg- preserve=no 4489358A007E remove_head358A5E62016A "AbstractClassDef::removeXorRestrictedAssociation"
  public Participant removeXorRestrictedAssociation(Participant xorRestrictedAssociation1)
  // -end- 4489358A007E remove_head358A5E62016A "AbstractClassDef::removeXorRestrictedAssociation"
  {
    // -beg- preserve=no 4489358A007E remove_body358A5E62016A "AbstractClassDef::removeXorRestrictedAssociation"
    Participant ret=null;
    if(xorRestrictedAssociation1==null || !xorRestrictedAssociation.contains(xorRestrictedAssociation1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = xorRestrictedAssociation1;
    xorRestrictedAssociation.remove(xorRestrictedAssociation1);
    xorRestrictedAssociation1._unlinkRestriction(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeXorRestrictedAssociation"));
    return ret;
    // -end- 4489358A007E remove_body358A5E62016A "AbstractClassDef::removeXorRestrictedAssociation"
  }

  /** tests if a given XorRestrictedAssociation is connected.
   *  @see #addXorRestrictedAssociation
   */
  // -beg- preserve=no 4489358A007E test_head358A5E62016A "AbstractClassDef::containsXorRestrictedAssociation"
  public boolean containsXorRestrictedAssociation(Participant xorRestrictedAssociation1)
  // -end- 4489358A007E test_head358A5E62016A "AbstractClassDef::containsXorRestrictedAssociation"
  {
    // -beg- preserve=no 4489358A007E test_body358A5E62016A "AbstractClassDef::containsXorRestrictedAssociation"
    return xorRestrictedAssociation.contains(xorRestrictedAssociation1);
    // -end- 4489358A007E test_body358A5E62016A "AbstractClassDef::containsXorRestrictedAssociation"
  }

  /** used to enumerate all connected XorRestrictedAssociations.
   *  @see #addXorRestrictedAssociation
   */
  // -beg- preserve=no 4489358A007E get_all_head358A5E62016A "AbstractClassDef::iteratorXorRestrictedAssociation"
  public java.util.Iterator iteratorXorRestrictedAssociation()
  // -end- 4489358A007E get_all_head358A5E62016A "AbstractClassDef::iteratorXorRestrictedAssociation"
  {
    // -beg- preserve=no 4489358A007E get_all_body358A5E62016A "AbstractClassDef::iteratorXorRestrictedAssociation"
    return xorRestrictedAssociation.iterator();
    // -end- 4489358A007E get_all_body358A5E62016A "AbstractClassDef::iteratorXorRestrictedAssociation"
  }

  /** disconnect all XorRestrictedAssociations.
   *  @see #addXorRestrictedAssociation
   */
  // -beg- preserve=no 4489358A007E remove_all_head358A5E62016A "AbstractClassDef::clearXorRestrictedAssociation"
  public void clearXorRestrictedAssociation()
  // -end- 4489358A007E remove_all_head358A5E62016A "AbstractClassDef::clearXorRestrictedAssociation"
  {
    // -beg- preserve=no 4489358A007E remove_all_body358A5E62016A "AbstractClassDef::clearXorRestrictedAssociation"
    if(sizeXorRestrictedAssociation()>0){
      for(java.util.Iterator p = xorRestrictedAssociation.iterator(); p.hasNext();){
        ((Participant)p.next())._unlinkRestriction(this);
      }
      xorRestrictedAssociation.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearXorRestrictedAssociation"));
    }
    // -end- 4489358A007E remove_all_body358A5E62016A "AbstractClassDef::clearXorRestrictedAssociation"
  }

  /** returns the number of XorRestrictedAssociations.
   *  @see #addXorRestrictedAssociation
   */
  // -beg- preserve=no 4489358A007E size_head358A5E62016A "AbstractClassDef::sizeXorRestrictedAssociation"
  public int sizeXorRestrictedAssociation()
  // -end- 4489358A007E size_head358A5E62016A "AbstractClassDef::sizeXorRestrictedAssociation"
  {
    // -beg- preserve=no 4489358A007E size_body358A5E62016A "AbstractClassDef::sizeXorRestrictedAssociation"
    return xorRestrictedAssociation.size();
    // -end- 4489358A007E size_body358A5E62016A "AbstractClassDef::sizeXorRestrictedAssociation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4489358A007E _link_body358A5E62016A "AbstractClassDef::_linkXorRestrictedAssociation"
  public void _linkXorRestrictedAssociation(Participant xorRestrictedAssociation1)
  {
    xorRestrictedAssociation.add(xorRestrictedAssociation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkXorRestrictedAssociation"));
    return;
  }
  // -end- 4489358A007E _link_body358A5E62016A "AbstractClassDef::_linkXorRestrictedAssociation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 4489358A007E _unlink_body358A5E62016A "AbstractClassDef::_unlinkXorRestrictedAssociation"
  public void _unlinkXorRestrictedAssociation(Participant xorRestrictedAssociation1)
  {
    xorRestrictedAssociation.remove(xorRestrictedAssociation1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkXorRestrictedAssociation"));
    return;
  }
  // -end- 4489358A007E _unlink_body358A5E62016A "AbstractClassDef::_unlinkXorRestrictedAssociation"

  // -beg- preserve=no 358A61920218 var358A5E62016A "name"

  // -end- 358A61920218 var358A5E62016A "name"

  /** get current value of name
   *  Name der Klasse
   *  @see #setName
   */
  // -beg- preserve=no 358A61920218 get_head358A5E62016A "name"
  public  NlsString getName()
  // -end- 358A61920218 get_head358A5E62016A "name"
  {
    // -beg- preserve=no 358A61920218 get_body358A5E62016A "name"
    return super.getName();
    // -end- 358A61920218 get_body358A5E62016A "name"
  }

  /** set current value of name
   *  @see #getName
   */
  // -beg- preserve=no 358A61920218 set_head358A5E62016A "name"
  public  void setName(NlsString value1)
  // -end- 358A61920218 set_head358A5E62016A "name"
  {
    // -beg- preserve=no 358A61920218 set_body358A5E62016A "name"
    super.setName(value1);
    // -end- 358A61920218 set_body358A5E62016A "name"
  }

  // -beg- preserve=no 358A62690267 var358A5E62016A "optional"
  private boolean optional;
  // -end- 358A62690267 var358A5E62016A "optional"

  /** get current value of optional
   *  Nur in INTERLIS1 vorhanden.
   *  @see #setOptional
   */
  // -beg- preserve=no 358A62690267 get_head358A5E62016A "optional"
  public  boolean isOptional()
  // -end- 358A62690267 get_head358A5E62016A "optional"
  {
    // -beg- preserve=no 358A62690267 get_body358A5E62016A "optional"
    return optional;
    // -end- 358A62690267 get_body358A5E62016A "optional"
  }

  /** set current value of optional
   *  @see #isOptional
   */
  // -beg- preserve=no 358A62690267 set_head358A5E62016A "optional"
  public  void setOptional(boolean value1)
  // -end- 358A62690267 set_head358A5E62016A "optional"
  {
    // -beg- preserve=no 358A62690267 set_body358A5E62016A "optional"
    if(optional != value1){
      optional = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setOptional"));
    }
    // -end- 358A62690267 set_body358A5E62016A "optional"
  }

  // -beg- preserve=no 3C1DBB1A022C var358A5E62016A "isAbstract"
  private boolean isAbstract;
  // -end- 3C1DBB1A022C var358A5E62016A "isAbstract"

  /** get current value of isAbstract
   *  @see #setAbstract
   */
  // -beg- preserve=no 3C1DBB1A022C get_head358A5E62016A "isAbstract"
  public  boolean isAbstract()
  // -end- 3C1DBB1A022C get_head358A5E62016A "isAbstract"
  {
    // -beg- preserve=no 3C1DBB1A022C get_body358A5E62016A "isAbstract"
    return isAbstract;
    // -end- 3C1DBB1A022C get_body358A5E62016A "isAbstract"
  }

  /** set current value of isAbstract
   *  @see #isAbstract
   */
  // -beg- preserve=no 3C1DBB1A022C set_head358A5E62016A "isAbstract"
  public  void setAbstract(boolean value1)
  // -end- 3C1DBB1A022C set_head358A5E62016A "isAbstract"
  {
    // -beg- preserve=no 3C1DBB1A022C set_body358A5E62016A "isAbstract"
    if(isAbstract != value1){
      isAbstract = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
    }
    // -end- 3C1DBB1A022C set_body358A5E62016A "isAbstract"
  }

  // -beg- preserve=no 3C1DBB2C026E var358A5E62016A "propFinal"
  private boolean propFinal;
  // -end- 3C1DBB2C026E var358A5E62016A "propFinal"

  /** get current value of propFinal
   *  @see #setPropFinal
   */
  // -beg- preserve=no 3C1DBB2C026E get_head358A5E62016A "propFinal"
  public  boolean isPropFinal()
  // -end- 3C1DBB2C026E get_head358A5E62016A "propFinal"
  {
    // -beg- preserve=no 3C1DBB2C026E get_body358A5E62016A "propFinal"
    return propFinal;
    // -end- 3C1DBB2C026E get_body358A5E62016A "propFinal"
  }

  /** set current value of propFinal
   *  @see #isPropFinal
   */
  // -beg- preserve=no 3C1DBB2C026E set_head358A5E62016A "propFinal"
  public  void setPropFinal(boolean value1)
  // -end- 3C1DBB2C026E set_head358A5E62016A "propFinal"
  {
    // -beg- preserve=no 3C1DBB2C026E set_body358A5E62016A "propFinal"
    if(propFinal != value1){
      propFinal = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPropFinal"));
    }
    // -end- 3C1DBB2C026E set_body358A5E62016A "propFinal"
  }

  // -beg- preserve=no 448921FB0329 var358A5E62016A "hasNoStableOid"
  private boolean hasNoStableOid;
  // -end- 448921FB0329 var358A5E62016A "hasNoStableOid"

  /** get current value of hasNoStableOid
   *  @see #setHasNoStableOid
   */
  // -beg- preserve=no 448921FB0329 get_head358A5E62016A "hasNoStableOid"
  public  boolean isHasNoStableOid()
  // -end- 448921FB0329 get_head358A5E62016A "hasNoStableOid"
  {
    // -beg- preserve=no 448921FB0329 get_body358A5E62016A "hasNoStableOid"
    return hasNoStableOid;
    // -end- 448921FB0329 get_body358A5E62016A "hasNoStableOid"
  }

  /** set current value of hasNoStableOid
   *  @see #isHasNoStableOid
   */
  // -beg- preserve=no 448921FB0329 set_head358A5E62016A "hasNoStableOid"
  public  void setHasNoStableOid(boolean value1)
  // -end- 448921FB0329 set_head358A5E62016A "hasNoStableOid"
  {
    // -beg- preserve=no 448921FB0329 set_body358A5E62016A "hasNoStableOid"
    if(hasNoStableOid != value1){
      hasNoStableOid = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setHasNoStableOid"));
    }
    // -end- 448921FB0329 set_body358A5E62016A "hasNoStableOid"
  }

  // -beg- preserve=no 335C0D7A02A8 code358A5E62016A "supplierDependency"

  // -end- 335C0D7A02A8 code358A5E62016A "supplierDependency"

  /** add a SupplierDependency.
   *  
   *  @see #removeSupplierDependency
   *  @see #containsSupplierDependency
   *  @see #iteratorSupplierDependency
   *  @see #clearSupplierDependency
   *  @see #sizeSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 add_head358A5E62016A "ModelElement::addSupplierDependency"
  public void addSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 add_head358A5E62016A "ModelElement::addSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 add_body358A5E62016A "ModelElement::addSupplierDependency"
    super.addSupplierDependency(supplierDependency1);
    // -end- 335C0D7A02A8 add_body358A5E62016A "ModelElement::addSupplierDependency"
  }

  /** disconnect a SupplierDependency.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_head358A5E62016A "ModelElement::removeSupplierDependency"
  public Dependency removeSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 remove_head358A5E62016A "ModelElement::removeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_body358A5E62016A "ModelElement::removeSupplierDependency"
    return super.removeSupplierDependency(supplierDependency1);
    // -end- 335C0D7A02A8 remove_body358A5E62016A "ModelElement::removeSupplierDependency"
  }

  /** tests if a given SupplierDependency is connected.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 test_head358A5E62016A "ModelElement::containsSupplierDependency"
  public boolean containsSupplierDependency(Dependency supplierDependency1)
  // -end- 335C0D7A02A8 test_head358A5E62016A "ModelElement::containsSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 test_body358A5E62016A "ModelElement::containsSupplierDependency"
    return super.containsSupplierDependency(supplierDependency1);
    // -end- 335C0D7A02A8 test_body358A5E62016A "ModelElement::containsSupplierDependency"
  }

  /** used to enumerate all connected SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 get_all_head358A5E62016A "ModelElement::iteratorSupplierDependency"
  public java.util.Iterator iteratorSupplierDependency()
  // -end- 335C0D7A02A8 get_all_head358A5E62016A "ModelElement::iteratorSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 get_all_body358A5E62016A "ModelElement::iteratorSupplierDependency"
    return super.iteratorSupplierDependency();
    // -end- 335C0D7A02A8 get_all_body358A5E62016A "ModelElement::iteratorSupplierDependency"
  }

  /** disconnect all SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 remove_all_head358A5E62016A "ModelElement::clearSupplierDependency"
  public void clearSupplierDependency()
  // -end- 335C0D7A02A8 remove_all_head358A5E62016A "ModelElement::clearSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 remove_all_body358A5E62016A "ModelElement::clearSupplierDependency"
    super.clearSupplierDependency();
    // -end- 335C0D7A02A8 remove_all_body358A5E62016A "ModelElement::clearSupplierDependency"
  }

  /** returns the number of SupplierDependencys.
   *  @see #addSupplierDependency
   */
  // -beg- preserve=no 335C0D7A02A8 size_head358A5E62016A "ModelElement::sizeSupplierDependency"
  public int sizeSupplierDependency()
  // -end- 335C0D7A02A8 size_head358A5E62016A "ModelElement::sizeSupplierDependency"
  {
    // -beg- preserve=no 335C0D7A02A8 size_body358A5E62016A "ModelElement::sizeSupplierDependency"
    return super.sizeSupplierDependency();
    // -end- 335C0D7A02A8 size_body358A5E62016A "ModelElement::sizeSupplierDependency"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _link_body358A5E62016A "ModelElement::_linkSupplierDependency"
  public void _linkSupplierDependency(Dependency supplierDependency1)
  {
    super._linkSupplierDependency(supplierDependency1);
  }
  // -end- 335C0D7A02A8 _link_body358A5E62016A "ModelElement::_linkSupplierDependency"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C0D7A02A8 _unlink_body358A5E62016A "ModelElement::_unlinkSupplierDependency"
  public void _unlinkSupplierDependency(Dependency supplierDependency1)
  {
    super._unlinkSupplierDependency(supplierDependency1);
  }
  // -end- 335C0D7A02A8 _unlink_body358A5E62016A "ModelElement::_unlinkSupplierDependency"

  // -beg- preserve=no 3C16416801D0 var358A5E62016A "isProxy"
  private boolean isProxy;
  // -end- 3C16416801D0 var358A5E62016A "isProxy"

  /** get current value of isProxy
   *  true if this is not an actual definition, but a placeholder, so that references can point to something
   *  @see #setProxy
   */
  // -beg- preserve=no 3C16416801D0 get_head358A5E62016A "isProxy"
  public  boolean isProxy()
  // -end- 3C16416801D0 get_head358A5E62016A "isProxy"
  {
    // -beg- preserve=no 3C16416801D0 get_body358A5E62016A "isProxy"
    return isProxy;
    // -end- 3C16416801D0 get_body358A5E62016A "isProxy"
  }

  /** set current value of isProxy
   *  @see #isProxy
   */
  // -beg- preserve=no 3C16416801D0 set_head358A5E62016A "isProxy"
  public  void setProxy(boolean value1)
  // -end- 3C16416801D0 set_head358A5E62016A "isProxy"
  {
    // -beg- preserve=no 3C16416801D0 set_body358A5E62016A "isProxy"
    if(isProxy != value1){
      isProxy = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setProxy"));
    }
    // -end- 3C16416801D0 set_body358A5E62016A "isProxy"
  }

  // -beg- preserve=no 362409A9000A code358A5E62016A "presentation"

  // -end- 362409A9000A code358A5E62016A "presentation"

  /** add a Presentation.
   *  
   *  @see #removePresentation
   *  @see #containsPresentation
   *  @see #iteratorPresentation
   *  @see #clearPresentation
   *  @see #sizePresentation
   */
  // -beg- preserve=no 362409A9000A add_head358A5E62016A "ModelElement::addPresentation"
  public void addPresentation(PresentationElement presentation1)
  // -end- 362409A9000A add_head358A5E62016A "ModelElement::addPresentation"
  {
    // -beg- preserve=no 362409A9000A add_body358A5E62016A "ModelElement::addPresentation"
    super.addPresentation(presentation1);
    // -end- 362409A9000A add_body358A5E62016A "ModelElement::addPresentation"
  }

  /** disconnect a Presentation.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_head358A5E62016A "ModelElement::removePresentation"
  public PresentationElement removePresentation(PresentationElement presentation1)
  // -end- 362409A9000A remove_head358A5E62016A "ModelElement::removePresentation"
  {
    // -beg- preserve=no 362409A9000A remove_body358A5E62016A "ModelElement::removePresentation"
    return super.removePresentation(presentation1);
    // -end- 362409A9000A remove_body358A5E62016A "ModelElement::removePresentation"
  }

  /** tests if a given Presentation is connected.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A test_head358A5E62016A "ModelElement::containsPresentation"
  public boolean containsPresentation(PresentationElement presentation1)
  // -end- 362409A9000A test_head358A5E62016A "ModelElement::containsPresentation"
  {
    // -beg- preserve=no 362409A9000A test_body358A5E62016A "ModelElement::containsPresentation"
    return super.containsPresentation(presentation1);
    // -end- 362409A9000A test_body358A5E62016A "ModelElement::containsPresentation"
  }

  /** used to enumerate all connected Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A get_all_head358A5E62016A "ModelElement::iteratorPresentation"
  public java.util.Iterator iteratorPresentation()
  // -end- 362409A9000A get_all_head358A5E62016A "ModelElement::iteratorPresentation"
  {
    // -beg- preserve=no 362409A9000A get_all_body358A5E62016A "ModelElement::iteratorPresentation"
    return super.iteratorPresentation();
    // -end- 362409A9000A get_all_body358A5E62016A "ModelElement::iteratorPresentation"
  }

  /** disconnect all Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_all_head358A5E62016A "ModelElement::clearPresentation"
  public void clearPresentation()
  // -end- 362409A9000A remove_all_head358A5E62016A "ModelElement::clearPresentation"
  {
    // -beg- preserve=no 362409A9000A remove_all_body358A5E62016A "ModelElement::clearPresentation"
    super.clearPresentation();
    // -end- 362409A9000A remove_all_body358A5E62016A "ModelElement::clearPresentation"
  }

  /** returns the number of Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A size_head358A5E62016A "ModelElement::sizePresentation"
  public int sizePresentation()
  // -end- 362409A9000A size_head358A5E62016A "ModelElement::sizePresentation"
  {
    // -beg- preserve=no 362409A9000A size_body358A5E62016A "ModelElement::sizePresentation"
    return super.sizePresentation();
    // -end- 362409A9000A size_body358A5E62016A "ModelElement::sizePresentation"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _link_body358A5E62016A "ModelElement::_linkPresentation"
  public void _linkPresentation(PresentationElement presentation1)
  {
    super._linkPresentation(presentation1);
  }
  // -end- 362409A9000A _link_body358A5E62016A "ModelElement::_linkPresentation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _unlink_body358A5E62016A "ModelElement::_unlinkPresentation"
  public void _unlinkPresentation(PresentationElement presentation1)
  {
    super._unlinkPresentation(presentation1);
  }
  // -end- 362409A9000A _unlink_body358A5E62016A "ModelElement::_unlinkPresentation"

  // -beg- preserve=no 33F24B5A0190 var358A5E62016A "isActive"
  private boolean isActive;
  // -end- 33F24B5A0190 var358A5E62016A "isActive"

  /** get current value of isActive
   *  @see #setActive
   */
  // -beg- preserve=no 33F24B5A0190 get_head358A5E62016A "isActive"
  public  boolean isActive()
  // -end- 33F24B5A0190 get_head358A5E62016A "isActive"
  {
    // -beg- preserve=no 33F24B5A0190 get_body358A5E62016A "isActive"
    return isActive;
    // -end- 33F24B5A0190 get_body358A5E62016A "isActive"
  }

  /** set current value of isActive
   *  @see #isActive
   */
  // -beg- preserve=no 33F24B5A0190 set_head358A5E62016A "isActive"
  public  void setActive(boolean value1)
  // -end- 33F24B5A0190 set_head358A5E62016A "isActive"
  {
    // -beg- preserve=no 33F24B5A0190 set_body358A5E62016A "isActive"
    if(isActive != value1){
      isActive = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setActive"));
    }
    // -end- 33F24B5A0190 set_body358A5E62016A "isActive"
  }

  /** tests if this Classifier contains a Feature with the given name
   */
  // -beg- preserve=no 3CB2C64E0374 head358A5E62016A "containsFeature"
  public boolean containsFeature(String name)
  // -end- 3CB2C64E0374 head358A5E62016A "containsFeature"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CB2C64E0374 throws358A5E62016A "containsFeature"

    // -end- 3CB2C64E0374 throws358A5E62016A "containsFeature"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CB2C64E0374 body358A5E62016A "containsFeature"
    java.util.Iterator it=iteratorFeature();
    while(it.hasNext()){
      ModelElement ele=(ModelElement)it.next();
      if(ele.getDefLangName().equals(name)){
        return true;
      }
    }
    return false;
    // -end- 3CB2C64E0374 body358A5E62016A "containsFeature"
    }

  // -beg- preserve=no 33CF9EFC006E code358A5E62016A "objectFlowState"
  private java.util.Set objectFlowState = new java.util.HashSet();
  // -end- 33CF9EFC006E code358A5E62016A "objectFlowState"

  /** add a ObjectFlowState.
   *  
   *  @see #removeObjectFlowState
   *  @see #containsObjectFlowState
   *  @see #iteratorObjectFlowState
   *  @see #clearObjectFlowState
   *  @see #sizeObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E add_head358A5E62016A "Classifier::addObjectFlowState"
  public void addObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E add_head358A5E62016A "Classifier::addObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E add_body358A5E62016A "Classifier::addObjectFlowState"
    objectFlowState.add(objectFlowState1);
    objectFlowState1._linkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addObjectFlowState"));
    return;
    // -end- 33CF9EFC006E add_body358A5E62016A "Classifier::addObjectFlowState"
  }

  /** disconnect a ObjectFlowState.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E remove_head358A5E62016A "Classifier::removeObjectFlowState"
  public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E remove_head358A5E62016A "Classifier::removeObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E remove_body358A5E62016A "Classifier::removeObjectFlowState"
    ObjectFlowState ret=null;
    if(objectFlowState1==null || !objectFlowState.contains(objectFlowState1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = objectFlowState1;
    objectFlowState.remove(objectFlowState1);
    objectFlowState1._unlinkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeObjectFlowState"));
    return ret;
    // -end- 33CF9EFC006E remove_body358A5E62016A "Classifier::removeObjectFlowState"
  }

  /** tests if a given ObjectFlowState is connected.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E test_head358A5E62016A "Classifier::containsObjectFlowState"
  public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
  // -end- 33CF9EFC006E test_head358A5E62016A "Classifier::containsObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E test_body358A5E62016A "Classifier::containsObjectFlowState"
    return objectFlowState.contains(objectFlowState1);
    // -end- 33CF9EFC006E test_body358A5E62016A "Classifier::containsObjectFlowState"
  }

  /** used to enumerate all connected ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E get_all_head358A5E62016A "Classifier::iteratorObjectFlowState"
  public java.util.Iterator iteratorObjectFlowState()
  // -end- 33CF9EFC006E get_all_head358A5E62016A "Classifier::iteratorObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E get_all_body358A5E62016A "Classifier::iteratorObjectFlowState"
    return objectFlowState.iterator();
    // -end- 33CF9EFC006E get_all_body358A5E62016A "Classifier::iteratorObjectFlowState"
  }

  /** disconnect all ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E remove_all_head358A5E62016A "Classifier::clearObjectFlowState"
  public void clearObjectFlowState()
  // -end- 33CF9EFC006E remove_all_head358A5E62016A "Classifier::clearObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E remove_all_body358A5E62016A "Classifier::clearObjectFlowState"
    if(sizeObjectFlowState()>0){
      for(java.util.Iterator p = objectFlowState.iterator(); p.hasNext();){
        ((ObjectFlowState)p.next())._unlinkType(this);
      }
      objectFlowState.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearObjectFlowState"));
    }
    // -end- 33CF9EFC006E remove_all_body358A5E62016A "Classifier::clearObjectFlowState"
  }

  /** returns the number of ObjectFlowStates.
   *  @see #addObjectFlowState
   */
  // -beg- preserve=no 33CF9EFC006E size_head358A5E62016A "Classifier::sizeObjectFlowState"
  public int sizeObjectFlowState()
  // -end- 33CF9EFC006E size_head358A5E62016A "Classifier::sizeObjectFlowState"
  {
    // -beg- preserve=no 33CF9EFC006E size_body358A5E62016A "Classifier::sizeObjectFlowState"
    return objectFlowState.size();
    // -end- 33CF9EFC006E size_body358A5E62016A "Classifier::sizeObjectFlowState"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006E _link_body358A5E62016A "Classifier::_linkObjectFlowState"
  public void _linkObjectFlowState(ObjectFlowState objectFlowState1)
  {
    objectFlowState.add(objectFlowState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkObjectFlowState"));
    return;
  }
  // -end- 33CF9EFC006E _link_body358A5E62016A "Classifier::_linkObjectFlowState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006E _unlink_body358A5E62016A "Classifier::_unlinkObjectFlowState"
  public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1)
  {
    objectFlowState.remove(objectFlowState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkObjectFlowState"));
    return;
  }
  // -end- 33CF9EFC006E _unlink_body358A5E62016A "Classifier::_unlinkObjectFlowState"

  // -beg- preserve=no 33CF9F1602BC code358A5E62016A "classifierInState"
  private java.util.Set classifierInState = new java.util.HashSet();
  // -end- 33CF9F1602BC code358A5E62016A "classifierInState"

  /** add a ClassifierInState.
   *  
   *  @see #removeClassifierInState
   *  @see #containsClassifierInState
   *  @see #iteratorClassifierInState
   *  @see #clearClassifierInState
   *  @see #sizeClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC add_head358A5E62016A "Classifier::addClassifierInState"
  public void addClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC add_head358A5E62016A "Classifier::addClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC add_body358A5E62016A "Classifier::addClassifierInState"
    classifierInState.add(classifierInState1);
    classifierInState1._linkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClassifierInState"));
    return;
    // -end- 33CF9F1602BC add_body358A5E62016A "Classifier::addClassifierInState"
  }

  /** disconnect a ClassifierInState.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC remove_head358A5E62016A "Classifier::removeClassifierInState"
  public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC remove_head358A5E62016A "Classifier::removeClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC remove_body358A5E62016A "Classifier::removeClassifierInState"
    ClassifierInState ret=null;
    if(classifierInState1==null || !classifierInState.contains(classifierInState1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = classifierInState1;
    classifierInState.remove(classifierInState1);
    classifierInState1._unlinkType(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClassifierInState"));
    return ret;
    // -end- 33CF9F1602BC remove_body358A5E62016A "Classifier::removeClassifierInState"
  }

  /** tests if a given ClassifierInState is connected.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC test_head358A5E62016A "Classifier::containsClassifierInState"
  public boolean containsClassifierInState(ClassifierInState classifierInState1)
  // -end- 33CF9F1602BC test_head358A5E62016A "Classifier::containsClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC test_body358A5E62016A "Classifier::containsClassifierInState"
    return classifierInState.contains(classifierInState1);
    // -end- 33CF9F1602BC test_body358A5E62016A "Classifier::containsClassifierInState"
  }

  /** used to enumerate all connected ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC get_all_head358A5E62016A "Classifier::iteratorClassifierInState"
  public java.util.Iterator iteratorClassifierInState()
  // -end- 33CF9F1602BC get_all_head358A5E62016A "Classifier::iteratorClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC get_all_body358A5E62016A "Classifier::iteratorClassifierInState"
    return classifierInState.iterator();
    // -end- 33CF9F1602BC get_all_body358A5E62016A "Classifier::iteratorClassifierInState"
  }

  /** disconnect all ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC remove_all_head358A5E62016A "Classifier::clearClassifierInState"
  public void clearClassifierInState()
  // -end- 33CF9F1602BC remove_all_head358A5E62016A "Classifier::clearClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC remove_all_body358A5E62016A "Classifier::clearClassifierInState"
    if(sizeClassifierInState()>0){
      for(java.util.Iterator p = classifierInState.iterator(); p.hasNext();){
        ((ClassifierInState)p.next())._unlinkType(this);
      }
      classifierInState.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClassifierInState"));
    }
    // -end- 33CF9F1602BC remove_all_body358A5E62016A "Classifier::clearClassifierInState"
  }

  /** returns the number of ClassifierInStates.
   *  @see #addClassifierInState
   */
  // -beg- preserve=no 33CF9F1602BC size_head358A5E62016A "Classifier::sizeClassifierInState"
  public int sizeClassifierInState()
  // -end- 33CF9F1602BC size_head358A5E62016A "Classifier::sizeClassifierInState"
  {
    // -beg- preserve=no 33CF9F1602BC size_body358A5E62016A "Classifier::sizeClassifierInState"
    return classifierInState.size();
    // -end- 33CF9F1602BC size_body358A5E62016A "Classifier::sizeClassifierInState"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F1602BC _link_body358A5E62016A "Classifier::_linkClassifierInState"
  public void _linkClassifierInState(ClassifierInState classifierInState1)
  {
    classifierInState.add(classifierInState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassifierInState"));
    return;
  }
  // -end- 33CF9F1602BC _link_body358A5E62016A "Classifier::_linkClassifierInState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9F1602BC _unlink_body358A5E62016A "Classifier::_unlinkClassifierInState"
  public void _unlinkClassifierInState(ClassifierInState classifierInState1)
  {
    classifierInState.remove(classifierInState1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassifierInState"));
    return;
  }
  // -end- 33CF9F1602BC _unlink_body358A5E62016A "Classifier::_unlinkClassifierInState"

  // -beg- preserve=no 36008FB700E7 code358A5E62016A "classifierRole"

  // -end- 36008FB700E7 code358A5E62016A "classifierRole"

  /** add a ClassifierRole.
   *  
   *  @see #removeClassifierRole
   *  @see #containsClassifierRole
   *  @see #iteratorClassifierRole
   *  @see #clearClassifierRole
   *  @see #sizeClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 add_head358A5E62016A "ModelElement::addClassifierRole"
  public void addClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 add_head358A5E62016A "ModelElement::addClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 add_body358A5E62016A "ModelElement::addClassifierRole"
    super.addClassifierRole(classifierRole1);
    // -end- 36008FB700E7 add_body358A5E62016A "ModelElement::addClassifierRole"
  }

  /** disconnect a ClassifierRole.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_head358A5E62016A "ModelElement::removeClassifierRole"
  public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 remove_head358A5E62016A "ModelElement::removeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_body358A5E62016A "ModelElement::removeClassifierRole"
    return super.removeClassifierRole(classifierRole1);
    // -end- 36008FB700E7 remove_body358A5E62016A "ModelElement::removeClassifierRole"
  }

  /** tests if a given ClassifierRole is connected.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 test_head358A5E62016A "ModelElement::containsClassifierRole"
  public boolean containsClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 test_head358A5E62016A "ModelElement::containsClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 test_body358A5E62016A "ModelElement::containsClassifierRole"
    return super.containsClassifierRole(classifierRole1);
    // -end- 36008FB700E7 test_body358A5E62016A "ModelElement::containsClassifierRole"
  }

  /** used to enumerate all connected ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 get_all_head358A5E62016A "ModelElement::iteratorClassifierRole"
  public java.util.Iterator iteratorClassifierRole()
  // -end- 36008FB700E7 get_all_head358A5E62016A "ModelElement::iteratorClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 get_all_body358A5E62016A "ModelElement::iteratorClassifierRole"
    return super.iteratorClassifierRole();
    // -end- 36008FB700E7 get_all_body358A5E62016A "ModelElement::iteratorClassifierRole"
  }

  /** disconnect all ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_all_head358A5E62016A "ModelElement::clearClassifierRole"
  public void clearClassifierRole()
  // -end- 36008FB700E7 remove_all_head358A5E62016A "ModelElement::clearClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 remove_all_body358A5E62016A "ModelElement::clearClassifierRole"
    super.clearClassifierRole();
    // -end- 36008FB700E7 remove_all_body358A5E62016A "ModelElement::clearClassifierRole"
  }

  /** returns the number of ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 size_head358A5E62016A "ModelElement::sizeClassifierRole"
  public int sizeClassifierRole()
  // -end- 36008FB700E7 size_head358A5E62016A "ModelElement::sizeClassifierRole"
  {
    // -beg- preserve=no 36008FB700E7 size_body358A5E62016A "ModelElement::sizeClassifierRole"
    return super.sizeClassifierRole();
    // -end- 36008FB700E7 size_body358A5E62016A "ModelElement::sizeClassifierRole"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _link_body358A5E62016A "ModelElement::_linkClassifierRole"
  public void _linkClassifierRole(ClassifierRole classifierRole1)
  {
    super._linkClassifierRole(classifierRole1);
  }
  // -end- 36008FB700E7 _link_body358A5E62016A "ModelElement::_linkClassifierRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _unlink_body358A5E62016A "ModelElement::_unlinkClassifierRole"
  public void _unlinkClassifierRole(ClassifierRole classifierRole1)
  {
    super._unlinkClassifierRole(classifierRole1);
  }
  // -end- 36008FB700E7 _unlink_body358A5E62016A "ModelElement::_unlinkClassifierRole"

  // -beg- preserve=no 33D1394E029F code358A5E62016A "collaboration"

  // -end- 33D1394E029F code358A5E62016A "collaboration"

  /** add a Collaboration.
   *  
   *  @see #removeCollaboration
   *  @see #containsCollaboration
   *  @see #iteratorCollaboration
   *  @see #clearCollaboration
   *  @see #sizeCollaboration
   */
  // -beg- preserve=no 33D1394E029F add_head358A5E62016A "ModelElement::addCollaboration"
  public void addCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F add_head358A5E62016A "ModelElement::addCollaboration"
  {
    // -beg- preserve=no 33D1394E029F add_body358A5E62016A "ModelElement::addCollaboration"
    super.addCollaboration(collaboration1);
    // -end- 33D1394E029F add_body358A5E62016A "ModelElement::addCollaboration"
  }

  /** disconnect a Collaboration.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_head358A5E62016A "ModelElement::removeCollaboration"
  public Collaboration removeCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F remove_head358A5E62016A "ModelElement::removeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_body358A5E62016A "ModelElement::removeCollaboration"
    return super.removeCollaboration(collaboration1);
    // -end- 33D1394E029F remove_body358A5E62016A "ModelElement::removeCollaboration"
  }

  /** tests if a given Collaboration is connected.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F test_head358A5E62016A "ModelElement::containsCollaboration"
  public boolean containsCollaboration(Collaboration collaboration1)
  // -end- 33D1394E029F test_head358A5E62016A "ModelElement::containsCollaboration"
  {
    // -beg- preserve=no 33D1394E029F test_body358A5E62016A "ModelElement::containsCollaboration"
    return super.containsCollaboration(collaboration1);
    // -end- 33D1394E029F test_body358A5E62016A "ModelElement::containsCollaboration"
  }

  /** used to enumerate all connected Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F get_all_head358A5E62016A "ModelElement::iteratorCollaboration"
  public java.util.Iterator iteratorCollaboration()
  // -end- 33D1394E029F get_all_head358A5E62016A "ModelElement::iteratorCollaboration"
  {
    // -beg- preserve=no 33D1394E029F get_all_body358A5E62016A "ModelElement::iteratorCollaboration"
    return super.iteratorCollaboration();
    // -end- 33D1394E029F get_all_body358A5E62016A "ModelElement::iteratorCollaboration"
  }

  /** disconnect all Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F remove_all_head358A5E62016A "ModelElement::clearCollaboration"
  public void clearCollaboration()
  // -end- 33D1394E029F remove_all_head358A5E62016A "ModelElement::clearCollaboration"
  {
    // -beg- preserve=no 33D1394E029F remove_all_body358A5E62016A "ModelElement::clearCollaboration"
    super.clearCollaboration();
    // -end- 33D1394E029F remove_all_body358A5E62016A "ModelElement::clearCollaboration"
  }

  /** returns the number of Collaborations.
   *  @see #addCollaboration
   */
  // -beg- preserve=no 33D1394E029F size_head358A5E62016A "ModelElement::sizeCollaboration"
  public int sizeCollaboration()
  // -end- 33D1394E029F size_head358A5E62016A "ModelElement::sizeCollaboration"
  {
    // -beg- preserve=no 33D1394E029F size_body358A5E62016A "ModelElement::sizeCollaboration"
    return super.sizeCollaboration();
    // -end- 33D1394E029F size_body358A5E62016A "ModelElement::sizeCollaboration"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _link_body358A5E62016A "ModelElement::_linkCollaboration"
  public void _linkCollaboration(Collaboration collaboration1)
  {
    super._linkCollaboration(collaboration1);
  }
  // -end- 33D1394E029F _link_body358A5E62016A "ModelElement::_linkCollaboration"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33D1394E029F _unlink_body358A5E62016A "ModelElement::_unlinkCollaboration"
  public void _unlinkCollaboration(Collaboration collaboration1)
  {
    super._unlinkCollaboration(collaboration1);
  }
  // -end- 33D1394E029F _unlink_body358A5E62016A "ModelElement::_unlinkCollaboration"

  // -beg- preserve=no 33CAD7E900AB code358A5E62016A "instance"
  private java.util.Set instance = new java.util.HashSet();
  // -end- 33CAD7E900AB code358A5E62016A "instance"

  /** add a Instance.
   *  
   *  @see #removeInstance
   *  @see #containsInstance
   *  @see #iteratorInstance
   *  @see #clearInstance
   *  @see #sizeInstance
   */
  // -beg- preserve=no 33CAD7E900AB add_head358A5E62016A "Classifier::addInstance"
  public void addInstance(Instance instance1)
  // -end- 33CAD7E900AB add_head358A5E62016A "Classifier::addInstance"
  {
    // -beg- preserve=no 33CAD7E900AB add_body358A5E62016A "Classifier::addInstance"
    instance.add(instance1);
    instance1._linkClassifier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addInstance"));
    return;
    // -end- 33CAD7E900AB add_body358A5E62016A "Classifier::addInstance"
  }

  /** disconnect a Instance.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB remove_head358A5E62016A "Classifier::removeInstance"
  public Instance removeInstance(Instance instance1)
  // -end- 33CAD7E900AB remove_head358A5E62016A "Classifier::removeInstance"
  {
    // -beg- preserve=no 33CAD7E900AB remove_body358A5E62016A "Classifier::removeInstance"
    Instance ret=null;
    if(instance1==null || !instance.contains(instance1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = instance1;
    instance.remove(instance1);
    instance1._unlinkClassifier(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeInstance"));
    return ret;
    // -end- 33CAD7E900AB remove_body358A5E62016A "Classifier::removeInstance"
  }

  /** tests if a given Instance is connected.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB test_head358A5E62016A "Classifier::containsInstance"
  public boolean containsInstance(Instance instance1)
  // -end- 33CAD7E900AB test_head358A5E62016A "Classifier::containsInstance"
  {
    // -beg- preserve=no 33CAD7E900AB test_body358A5E62016A "Classifier::containsInstance"
    return instance.contains(instance1);
    // -end- 33CAD7E900AB test_body358A5E62016A "Classifier::containsInstance"
  }

  /** used to enumerate all connected Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB get_all_head358A5E62016A "Classifier::iteratorInstance"
  public java.util.Iterator iteratorInstance()
  // -end- 33CAD7E900AB get_all_head358A5E62016A "Classifier::iteratorInstance"
  {
    // -beg- preserve=no 33CAD7E900AB get_all_body358A5E62016A "Classifier::iteratorInstance"
    return instance.iterator();
    // -end- 33CAD7E900AB get_all_body358A5E62016A "Classifier::iteratorInstance"
  }

  /** disconnect all Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB remove_all_head358A5E62016A "Classifier::clearInstance"
  public void clearInstance()
  // -end- 33CAD7E900AB remove_all_head358A5E62016A "Classifier::clearInstance"
  {
    // -beg- preserve=no 33CAD7E900AB remove_all_body358A5E62016A "Classifier::clearInstance"
    if(sizeInstance()>0){
      for(java.util.Iterator p = instance.iterator(); p.hasNext();){
        ((Instance)p.next())._unlinkClassifier(this);
      }
      instance.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearInstance"));
    }
    // -end- 33CAD7E900AB remove_all_body358A5E62016A "Classifier::clearInstance"
  }

  /** returns the number of Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 33CAD7E900AB size_head358A5E62016A "Classifier::sizeInstance"
  public int sizeInstance()
  // -end- 33CAD7E900AB size_head358A5E62016A "Classifier::sizeInstance"
  {
    // -beg- preserve=no 33CAD7E900AB size_body358A5E62016A "Classifier::sizeInstance"
    return instance.size();
    // -end- 33CAD7E900AB size_body358A5E62016A "Classifier::sizeInstance"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AB _link_body358A5E62016A "Classifier::_linkInstance"
  public void _linkInstance(Instance instance1)
  {
    instance.add(instance1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkInstance"));
    return;
  }
  // -end- 33CAD7E900AB _link_body358A5E62016A "Classifier::_linkInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CAD7E900AB _unlink_body358A5E62016A "Classifier::_unlinkInstance"
  public void _unlinkInstance(Instance instance1)
  {
    instance.remove(instance1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkInstance"));
    return;
  }
  // -end- 33CAD7E900AB _unlink_body358A5E62016A "Classifier::_unlinkInstance"

  // -beg- preserve=no 33CFD0A701A4 code358A5E62016A "createAction"
  private java.util.Set createAction = new java.util.HashSet();
  // -end- 33CFD0A701A4 code358A5E62016A "createAction"

  /** add a CreateAction.
   *  
   *  @see #removeCreateAction
   *  @see #containsCreateAction
   *  @see #iteratorCreateAction
   *  @see #clearCreateAction
   *  @see #sizeCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 add_head358A5E62016A "Classifier::addCreateAction"
  public void addCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 add_head358A5E62016A "Classifier::addCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 add_body358A5E62016A "Classifier::addCreateAction"
    createAction.add(createAction1);
    createAction1._linkInstantiation(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCreateAction"));
    return;
    // -end- 33CFD0A701A4 add_body358A5E62016A "Classifier::addCreateAction"
  }

  /** disconnect a CreateAction.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 remove_head358A5E62016A "Classifier::removeCreateAction"
  public CreateAction removeCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 remove_head358A5E62016A "Classifier::removeCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 remove_body358A5E62016A "Classifier::removeCreateAction"
    CreateAction ret=null;
    if(createAction1==null || !createAction.contains(createAction1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = createAction1;
    createAction.remove(createAction1);
    createAction1._unlinkInstantiation(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCreateAction"));
    return ret;
    // -end- 33CFD0A701A4 remove_body358A5E62016A "Classifier::removeCreateAction"
  }

  /** tests if a given CreateAction is connected.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 test_head358A5E62016A "Classifier::containsCreateAction"
  public boolean containsCreateAction(CreateAction createAction1)
  // -end- 33CFD0A701A4 test_head358A5E62016A "Classifier::containsCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 test_body358A5E62016A "Classifier::containsCreateAction"
    return createAction.contains(createAction1);
    // -end- 33CFD0A701A4 test_body358A5E62016A "Classifier::containsCreateAction"
  }

  /** used to enumerate all connected CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 get_all_head358A5E62016A "Classifier::iteratorCreateAction"
  public java.util.Iterator iteratorCreateAction()
  // -end- 33CFD0A701A4 get_all_head358A5E62016A "Classifier::iteratorCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 get_all_body358A5E62016A "Classifier::iteratorCreateAction"
    return createAction.iterator();
    // -end- 33CFD0A701A4 get_all_body358A5E62016A "Classifier::iteratorCreateAction"
  }

  /** disconnect all CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 remove_all_head358A5E62016A "Classifier::clearCreateAction"
  public void clearCreateAction()
  // -end- 33CFD0A701A4 remove_all_head358A5E62016A "Classifier::clearCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 remove_all_body358A5E62016A "Classifier::clearCreateAction"
    if(sizeCreateAction()>0){
      for(java.util.Iterator p = createAction.iterator(); p.hasNext();){
        ((CreateAction)p.next())._unlinkInstantiation(this);
      }
      createAction.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCreateAction"));
    }
    // -end- 33CFD0A701A4 remove_all_body358A5E62016A "Classifier::clearCreateAction"
  }

  /** returns the number of CreateActions.
   *  @see #addCreateAction
   */
  // -beg- preserve=no 33CFD0A701A4 size_head358A5E62016A "Classifier::sizeCreateAction"
  public int sizeCreateAction()
  // -end- 33CFD0A701A4 size_head358A5E62016A "Classifier::sizeCreateAction"
  {
    // -beg- preserve=no 33CFD0A701A4 size_body358A5E62016A "Classifier::sizeCreateAction"
    return createAction.size();
    // -end- 33CFD0A701A4 size_body358A5E62016A "Classifier::sizeCreateAction"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A701A4 _link_body358A5E62016A "Classifier::_linkCreateAction"
  public void _linkCreateAction(CreateAction createAction1)
  {
    createAction.add(createAction1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCreateAction"));
    return;
  }
  // -end- 33CFD0A701A4 _link_body358A5E62016A "Classifier::_linkCreateAction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CFD0A701A4 _unlink_body358A5E62016A "Classifier::_unlinkCreateAction"
  public void _unlinkCreateAction(CreateAction createAction1)
  {
    createAction.remove(createAction1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCreateAction"));
    return;
  }
  // -end- 33CFD0A701A4 _unlink_body358A5E62016A "Classifier::_unlinkCreateAction"

  // -beg- preserve=no 33F0EFAD00AB code358A5E62016A "specifiedEnd"
  private java.util.Set specifiedEnd = new java.util.HashSet();
  // -end- 33F0EFAD00AB code358A5E62016A "specifiedEnd"

  /** add a SpecifiedEnd.
   *  
   *  @see #removeSpecifiedEnd
   *  @see #containsSpecifiedEnd
   *  @see #iteratorSpecifiedEnd
   *  @see #clearSpecifiedEnd
   *  @see #sizeSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB add_head358A5E62016A "Classifier::addSpecifiedEnd"
  public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB add_head358A5E62016A "Classifier::addSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB add_body358A5E62016A "Classifier::addSpecifiedEnd"
    specifiedEnd.add(specifiedEnd1);
    specifiedEnd1._linkSpecification(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecifiedEnd"));
    return;
    // -end- 33F0EFAD00AB add_body358A5E62016A "Classifier::addSpecifiedEnd"
  }

  /** disconnect a SpecifiedEnd.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB remove_head358A5E62016A "Classifier::removeSpecifiedEnd"
  public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB remove_head358A5E62016A "Classifier::removeSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB remove_body358A5E62016A "Classifier::removeSpecifiedEnd"
    AssociationEnd ret=null;
    if(specifiedEnd1==null || !specifiedEnd.contains(specifiedEnd1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = specifiedEnd1;
    specifiedEnd.remove(specifiedEnd1);
    specifiedEnd1._unlinkSpecification(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecifiedEnd"));
    return ret;
    // -end- 33F0EFAD00AB remove_body358A5E62016A "Classifier::removeSpecifiedEnd"
  }

  /** tests if a given SpecifiedEnd is connected.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB test_head358A5E62016A "Classifier::containsSpecifiedEnd"
  public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
  // -end- 33F0EFAD00AB test_head358A5E62016A "Classifier::containsSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB test_body358A5E62016A "Classifier::containsSpecifiedEnd"
    return specifiedEnd.contains(specifiedEnd1);
    // -end- 33F0EFAD00AB test_body358A5E62016A "Classifier::containsSpecifiedEnd"
  }

  /** used to enumerate all connected SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB get_all_head358A5E62016A "Classifier::iteratorSpecifiedEnd"
  public java.util.Iterator iteratorSpecifiedEnd()
  // -end- 33F0EFAD00AB get_all_head358A5E62016A "Classifier::iteratorSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB get_all_body358A5E62016A "Classifier::iteratorSpecifiedEnd"
    return specifiedEnd.iterator();
    // -end- 33F0EFAD00AB get_all_body358A5E62016A "Classifier::iteratorSpecifiedEnd"
  }

  /** disconnect all SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB remove_all_head358A5E62016A "Classifier::clearSpecifiedEnd"
  public void clearSpecifiedEnd()
  // -end- 33F0EFAD00AB remove_all_head358A5E62016A "Classifier::clearSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB remove_all_body358A5E62016A "Classifier::clearSpecifiedEnd"
    if(sizeSpecifiedEnd()>0){
      for(java.util.Iterator p = specifiedEnd.iterator(); p.hasNext();){
        ((AssociationEnd)p.next())._unlinkSpecification(this);
      }
      specifiedEnd.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecifiedEnd"));
    }
    // -end- 33F0EFAD00AB remove_all_body358A5E62016A "Classifier::clearSpecifiedEnd"
  }

  /** returns the number of SpecifiedEnds.
   *  @see #addSpecifiedEnd
   */
  // -beg- preserve=no 33F0EFAD00AB size_head358A5E62016A "Classifier::sizeSpecifiedEnd"
  public int sizeSpecifiedEnd()
  // -end- 33F0EFAD00AB size_head358A5E62016A "Classifier::sizeSpecifiedEnd"
  {
    // -beg- preserve=no 33F0EFAD00AB size_body358A5E62016A "Classifier::sizeSpecifiedEnd"
    return specifiedEnd.size();
    // -end- 33F0EFAD00AB size_body358A5E62016A "Classifier::sizeSpecifiedEnd"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AB _link_body358A5E62016A "Classifier::_linkSpecifiedEnd"
  public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1)
  {
    specifiedEnd.add(specifiedEnd1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecifiedEnd"));
    return;
  }
  // -end- 33F0EFAD00AB _link_body358A5E62016A "Classifier::_linkSpecifiedEnd"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33F0EFAD00AB _unlink_body358A5E62016A "Classifier::_unlinkSpecifiedEnd"
  public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1)
  {
    specifiedEnd.remove(specifiedEnd1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecifiedEnd"));
    return;
  }
  // -end- 33F0EFAD00AB _unlink_body358A5E62016A "Classifier::_unlinkSpecifiedEnd"

  // -beg- preserve=no 36E96A87033E code358A5E62016A "powertypeRange"
  private java.util.Set powertypeRange = new java.util.HashSet();
  // -end- 36E96A87033E code358A5E62016A "powertypeRange"

  /** add a PowertypeRange.
   *  
   *  @see #removePowertypeRange
   *  @see #containsPowertypeRange
   *  @see #iteratorPowertypeRange
   *  @see #clearPowertypeRange
   *  @see #sizePowertypeRange
   */
  // -beg- preserve=no 36E96A87033E add_head358A5E62016A "Classifier::addPowertypeRange"
  public void addPowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E add_head358A5E62016A "Classifier::addPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E add_body358A5E62016A "Classifier::addPowertypeRange"
    powertypeRange.add(powertypeRange1);
    powertypeRange1._linkPowertype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPowertypeRange"));
    return;
    // -end- 36E96A87033E add_body358A5E62016A "Classifier::addPowertypeRange"
  }

  /** disconnect a PowertypeRange.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E remove_head358A5E62016A "Classifier::removePowertypeRange"
  public Generalization removePowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E remove_head358A5E62016A "Classifier::removePowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E remove_body358A5E62016A "Classifier::removePowertypeRange"
    Generalization ret=null;
    if(powertypeRange1==null || !powertypeRange.contains(powertypeRange1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = powertypeRange1;
    powertypeRange.remove(powertypeRange1);
    powertypeRange1._unlinkPowertype(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePowertypeRange"));
    return ret;
    // -end- 36E96A87033E remove_body358A5E62016A "Classifier::removePowertypeRange"
  }

  /** tests if a given PowertypeRange is connected.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E test_head358A5E62016A "Classifier::containsPowertypeRange"
  public boolean containsPowertypeRange(Generalization powertypeRange1)
  // -end- 36E96A87033E test_head358A5E62016A "Classifier::containsPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E test_body358A5E62016A "Classifier::containsPowertypeRange"
    return powertypeRange.contains(powertypeRange1);
    // -end- 36E96A87033E test_body358A5E62016A "Classifier::containsPowertypeRange"
  }

  /** used to enumerate all connected PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E get_all_head358A5E62016A "Classifier::iteratorPowertypeRange"
  public java.util.Iterator iteratorPowertypeRange()
  // -end- 36E96A87033E get_all_head358A5E62016A "Classifier::iteratorPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E get_all_body358A5E62016A "Classifier::iteratorPowertypeRange"
    return powertypeRange.iterator();
    // -end- 36E96A87033E get_all_body358A5E62016A "Classifier::iteratorPowertypeRange"
  }

  /** disconnect all PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E remove_all_head358A5E62016A "Classifier::clearPowertypeRange"
  public void clearPowertypeRange()
  // -end- 36E96A87033E remove_all_head358A5E62016A "Classifier::clearPowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E remove_all_body358A5E62016A "Classifier::clearPowertypeRange"
    if(sizePowertypeRange()>0){
      for(java.util.Iterator p = powertypeRange.iterator(); p.hasNext();){
        ((Generalization)p.next())._unlinkPowertype(this);
      }
      powertypeRange.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPowertypeRange"));
    }
    // -end- 36E96A87033E remove_all_body358A5E62016A "Classifier::clearPowertypeRange"
  }

  /** returns the number of PowertypeRanges.
   *  @see #addPowertypeRange
   */
  // -beg- preserve=no 36E96A87033E size_head358A5E62016A "Classifier::sizePowertypeRange"
  public int sizePowertypeRange()
  // -end- 36E96A87033E size_head358A5E62016A "Classifier::sizePowertypeRange"
  {
    // -beg- preserve=no 36E96A87033E size_body358A5E62016A "Classifier::sizePowertypeRange"
    return powertypeRange.size();
    // -end- 36E96A87033E size_body358A5E62016A "Classifier::sizePowertypeRange"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36E96A87033E _link_body358A5E62016A "Classifier::_linkPowertypeRange"
  public void _linkPowertypeRange(Generalization powertypeRange1)
  {
    powertypeRange.add(powertypeRange1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPowertypeRange"));
    return;
  }
  // -end- 36E96A87033E _link_body358A5E62016A "Classifier::_linkPowertypeRange"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36E96A87033E _unlink_body358A5E62016A "Classifier::_unlinkPowertypeRange"
  public void _unlinkPowertypeRange(Generalization powertypeRange1)
  {
    powertypeRange.remove(powertypeRange1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPowertypeRange"));
    return;
  }
  // -end- 36E96A87033E _unlink_body358A5E62016A "Classifier::_unlinkPowertypeRange"

  // -beg- preserve=no 327A877801CC var358A5E62016A "isRoot"
  private boolean isRoot;
  // -end- 327A877801CC var358A5E62016A "isRoot"

  /** get current value of isRoot
   *  @see #setRoot
   */
  // -beg- preserve=no 327A877801CC get_head358A5E62016A "isRoot"
  public  boolean isRoot()
  // -end- 327A877801CC get_head358A5E62016A "isRoot"
  {
    // -beg- preserve=no 327A877801CC get_body358A5E62016A "isRoot"
    return isRoot;
    // -end- 327A877801CC get_body358A5E62016A "isRoot"
  }

  /** set current value of isRoot
   *  @see #isRoot
   */
  // -beg- preserve=no 327A877801CC set_head358A5E62016A "isRoot"
  public  void setRoot(boolean value1)
  // -end- 327A877801CC set_head358A5E62016A "isRoot"
  {
    // -beg- preserve=no 327A877801CC set_body358A5E62016A "isRoot"
    if(isRoot != value1){
      isRoot = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRoot"));
    }
    // -end- 327A877801CC set_body358A5E62016A "isRoot"
  }

  // -beg- preserve=no 327A877E006E var358A5E62016A "isLeaf"
  private boolean isLeaf;
  // -end- 327A877E006E var358A5E62016A "isLeaf"

  /** get current value of isLeaf
   *  @see #setLeaf
   */
  // -beg- preserve=no 327A877E006E get_head358A5E62016A "isLeaf"
  public  boolean isLeaf()
  // -end- 327A877E006E get_head358A5E62016A "isLeaf"
  {
    // -beg- preserve=no 327A877E006E get_body358A5E62016A "isLeaf"
    return isLeaf;
    // -end- 327A877E006E get_body358A5E62016A "isLeaf"
  }

  /** set current value of isLeaf
   *  @see #isLeaf
   */
  // -beg- preserve=no 327A877E006E set_head358A5E62016A "isLeaf"
  public  void setLeaf(boolean value1)
  // -end- 327A877E006E set_head358A5E62016A "isLeaf"
  {
    // -beg- preserve=no 327A877E006E set_body358A5E62016A "isLeaf"
    if(isLeaf != value1){
      isLeaf = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLeaf"));
    }
    // -end- 327A877E006E set_body358A5E62016A "isLeaf"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 358A5E62016A detail_end "AbstractClassDef"
      /** swap the placement of two Features.
       *  @see #addFeature
       */
      public void swapFeature(Feature feature1,Feature feature2)
      {
        int i1 = feature.indexOf(feature1);
        int i2 = feature.indexOf(feature2);
        if(i1==-1 || i2==-1){
          throw new java.lang.IllegalArgumentException("cannot locate unknown object");
        }
        feature.set(i2,feature1);
        feature.set(i1,feature2);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"swapFeature"));
      }

  // -end- 358A5E62016A detail_end "AbstractClassDef"

}

