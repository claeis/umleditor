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


            // -beg- preserve=no 358A5E3B0132 package "TopicDef"
package ch.ehi.interlis.modeltopicclass;
            // -end- 358A5E3B0132 package "TopicDef"

            // -beg- preserve=no 358A5E3B0132 autoimport "TopicDef"
            import ch.ehi.uml1_4.modelmanagement.Package;
            import ch.ehi.interlis.DefinitionProxy;
            import ch.ehi.uml1_4.implementation.AbstractNamespace;
            import ch.ehi.uml1_4.foundation.core.Dependency;
            import ch.ehi.uml1_4.foundation.core.ModelElement;
            import ch.ehi.uml1_4.foundation.core.ElementOwnership;
            import ch.ehi.uml1_4.foundation.core.Generalization;
            import ch.ehi.uml1_4.foundation.core.Namespace;
            import ch.ehi.interlis.domainsandconstants.basetypes.BasketType;
            import ch.ehi.basics.types.NlsString;
            import ch.ehi.interlis.modeltopicclass.TopicDefKind;
            import ch.ehi.basics.tools.AbstractVisitor;
            import ch.ehi.uml1_4.modelmanagement.ElementImport;
            import ch.ehi.uml1_4.foundation.core.PresentationElement;
            import ch.ehi.uml1_4.implementation.AbstractEditorElement;
            import ch.ehi.umleditor.umlpresentation.Diagram;
            import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
            import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
            import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
            import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
            import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
            import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
            import ch.ehi.uml1_4.foundation.core.Constraint;
            import ch.ehi.uml1_4.foundation.core.Component;
            import ch.ehi.uml1_4.foundation.core.ElementResidence;
            import ch.ehi.uml1_4.foundation.core.TemplateParameter;
            import ch.ehi.uml1_4.foundation.core.Flow;
            import ch.ehi.uml1_4.foundation.core.Comment;
            import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
            // -end- 358A5E3B0132 autoimport "TopicDef"

            // import declarations
            // please fill in/modify the following section
            // -beg- preserve=no 358A5E3B0132 import "TopicDef"

            // -end- 358A5E3B0132 import "TopicDef"

            /** Definiert ein Thema.
             *  @author Claude Eisenhut
             *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:09 $
             */
public class TopicDef extends AbstractNamespace implements Package , DefinitionProxy , java.io.Serializable
            {
              // declare/define something only in the code
              // please fill in/modify the following section
              // -beg- preserve=no 358A5E3B0132 detail_begin "TopicDef"

              // -end- 358A5E3B0132 detail_begin "TopicDef"

              // -beg- preserve=no 3CC7B10A01C3 head358A5E3B0132 "getBaseTopicDef"
              public TopicDef getBaseTopicDef()
              // -end- 3CC7B10A01C3 head358A5E3B0132 "getBaseTopicDef"
                // declare any checked exceptions
                // please fill in/modify the following section
                // -beg- preserve=no 3CC7B10A01C3 throws358A5E3B0132 "getBaseTopicDef"

                // -end- 3CC7B10A01C3 throws358A5E3B0132 "getBaseTopicDef"
                {
                // please fill in/modify the following section
                // -beg- preserve=yes 3CC7B10A01C3 body358A5E3B0132 "getBaseTopicDef"
    java.util.Iterator it=iteratorGeneralization();
    while(it.hasNext()){
      Object topicextends=it.next();
      if(topicextends instanceof TopicExtends){
        return (TopicDef)((TopicExtends)topicextends).getParent();
      }
    }
    throw new java.lang.IllegalStateException("no base TopicDef attached");
                // -end- 3CC7B10A01C3 body358A5E3B0132 "getBaseTopicDef"
                }

              // -beg- preserve=no 3CC7B11801CD head358A5E3B0132 "containsBaseTopicDef"
              public boolean containsBaseTopicDef()
              // -end- 3CC7B11801CD head358A5E3B0132 "containsBaseTopicDef"
                // declare any checked exceptions
                // please fill in/modify the following section
                // -beg- preserve=no 3CC7B11801CD throws358A5E3B0132 "containsBaseTopicDef"

                // -end- 3CC7B11801CD throws358A5E3B0132 "containsBaseTopicDef"
                {
                // please fill in/modify the following section
                // -beg- preserve=yes 3CC7B11801CD body358A5E3B0132 "containsBaseTopicDef"
    java.util.Iterator it=iteratorGeneralization();
    while(it.hasNext()){
      Object topicextends=it.next();
      if(topicextends instanceof TopicExtends){
        if(((TopicExtends)topicextends).containsParent()){
          return true;
        }
      }
    }
    return false;
                // -end- 3CC7B11801CD body358A5E3B0132 "containsBaseTopicDef"
                }

              /** return the list of valid owned elements for this namespace.
               */
              // -beg- preserve=no 3CE4FC3202C5 head358A5E3B0132 "getValidOwnedElements"
              public String[] getValidOwnedElements()
              // -end- 3CE4FC3202C5 head358A5E3B0132 "getValidOwnedElements"
                // declare any checked exceptions
                // please fill in/modify the following section
                // -beg- preserve=no 3CE4FC3202C5 throws358A5E3B0132 "getValidOwnedElements"

                // -end- 3CE4FC3202C5 throws358A5E3B0132 "getValidOwnedElements"
                {
                // please fill in/modify the following section
                // -beg- preserve=yes 3CE4FC3202C5 body358A5E3B0132 "getValidOwnedElements"
    String ret[]={
      "ch.ehi.interlis.metaobjects.MetaDataUseDef"
      ,"ch.ehi.interlis.units.UnitDef"
      ,"ch.ehi.interlis.domainsandconstants.DomainDef"
      ,"ch.ehi.interlis.modeltopicclass.ClassDef"
      ,"ch.ehi.interlis.associations.AssociationDef"
      ,"ch.ehi.interlis.views.ViewDef"
      ,"ch.ehi.interlis.views.ViewProjectionDef"
      ,"ch.ehi.interlis.graphicdescriptions.GraphicDef"
      ,"ch.ehi.uml1_4.implementation.UmlPackage"
      };
    return ret;
                // -end- 3CE4FC3202C5 body358A5E3B0132 "getValidOwnedElements"
                }

              // -beg- preserve=no 3D4FA21902B2 head358A5E3B0132 "unlinkAll"
              public void unlinkAll()
              // -end- 3D4FA21902B2 head358A5E3B0132 "unlinkAll"
                // declare any checked exceptions
                // please fill in/modify the following section
                // -beg- preserve=no 3D4FA21902B2 throws358A5E3B0132 "unlinkAll"

                // -end- 3D4FA21902B2 throws358A5E3B0132 "unlinkAll"
                {
                // please fill in/modify the following section
                // -beg- preserve=no 3D4FA21902B2 body358A5E3B0132 "unlinkAll"
                
                clearClientDependency();
                clearOwnedElement();
                clearSpecialization();
                detachNamespace();
                clearSupplierDependency();
                clearGeneralization();
                clearBasketType();
                setName(null);
                clearImportedElement();
                clearPresentation();
                clearDiagram();
                clearBehavior();
                clearPartition();
                clearCollaboration();
                clearClassifierRole();
                clearCollaborationInstanceSet();
                clearTaggedValue();
                clearConstraint();
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
                // -end- 3D4FA21902B2 body358A5E3B0132 "unlinkAll"
                }

              // -beg- preserve=no 3D4FA21902DA head358A5E3B0132 "enumerateChildren"
              public void enumerateChildren(AbstractVisitor visitor)
              // -end- 3D4FA21902DA head358A5E3B0132 "enumerateChildren"
                // declare any checked exceptions
                // please fill in/modify the following section
                // -beg- preserve=no 3D4FA21902DA throws358A5E3B0132 "enumerateChildren"

                // -end- 3D4FA21902DA throws358A5E3B0132 "enumerateChildren"
                {
                // please fill in/modify the following section
                // -beg- preserve=no 3D4FA21902DA body358A5E3B0132 "enumerateChildren"
                java.util.Iterator it=null;
                it=iteratorOwnedElement();while(it.hasNext())visitor.visit(it.next());
                visitor.visit(getName());
                it=iteratorImportedElement();while(it.hasNext())visitor.visit(it.next());
                it=iteratorDiagram();while(it.hasNext())visitor.visit(it.next());
                it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
                it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
                it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
                visitor.visit(getDocumentation());
                super.enumerateChildren(visitor);
                // -end- 3D4FA21902DA body358A5E3B0132 "enumerateChildren"
                }

              // -beg- preserve=no 33FFE57B0395 code358A5E3B0132 "clientDependency"

              // -end- 33FFE57B0395 code358A5E3B0132 "clientDependency"

              /** add a ClientDependency.
               *  
               *  @see #removeClientDependency
               *  @see #containsClientDependency
               *  @see #iteratorClientDependency
               *  @see #clearClientDependency
               *  @see #sizeClientDependency
               */
              // -beg- preserve=no 33FFE57B0395 add_head358A5E3B0132 "ModelElement::addClientDependency"
              public void addClientDependency(Dependency clientDependency1)
              // -end- 33FFE57B0395 add_head358A5E3B0132 "ModelElement::addClientDependency"
              {
                // -beg- preserve=no 33FFE57B0395 add_body358A5E3B0132 "ModelElement::addClientDependency"
                super.addClientDependency(clientDependency1);
                // -end- 33FFE57B0395 add_body358A5E3B0132 "ModelElement::addClientDependency"
              }

              /** disconnect a ClientDependency.
               *  @see #addClientDependency
               */
              // -beg- preserve=no 33FFE57B0395 remove_head358A5E3B0132 "ModelElement::removeClientDependency"
              public Dependency removeClientDependency(Dependency clientDependency1)
              // -end- 33FFE57B0395 remove_head358A5E3B0132 "ModelElement::removeClientDependency"
              {
                // -beg- preserve=no 33FFE57B0395 remove_body358A5E3B0132 "ModelElement::removeClientDependency"
                return super.removeClientDependency(clientDependency1);
                // -end- 33FFE57B0395 remove_body358A5E3B0132 "ModelElement::removeClientDependency"
              }

              /** tests if a given ClientDependency is connected.
               *  @see #addClientDependency
               */
              // -beg- preserve=no 33FFE57B0395 test_head358A5E3B0132 "ModelElement::containsClientDependency"
              public boolean containsClientDependency(Dependency clientDependency1)
              // -end- 33FFE57B0395 test_head358A5E3B0132 "ModelElement::containsClientDependency"
              {
                // -beg- preserve=no 33FFE57B0395 test_body358A5E3B0132 "ModelElement::containsClientDependency"
                return super.containsClientDependency(clientDependency1);
                // -end- 33FFE57B0395 test_body358A5E3B0132 "ModelElement::containsClientDependency"
              }

              /** used to enumerate all connected ClientDependencys.
               *  @see #addClientDependency
               */
              // -beg- preserve=no 33FFE57B0395 get_all_head358A5E3B0132 "ModelElement::iteratorClientDependency"
              public java.util.Iterator iteratorClientDependency()
              // -end- 33FFE57B0395 get_all_head358A5E3B0132 "ModelElement::iteratorClientDependency"
              {
                // -beg- preserve=no 33FFE57B0395 get_all_body358A5E3B0132 "ModelElement::iteratorClientDependency"
                return super.iteratorClientDependency();
                // -end- 33FFE57B0395 get_all_body358A5E3B0132 "ModelElement::iteratorClientDependency"
              }

              /** disconnect all ClientDependencys.
               *  @see #addClientDependency
               */
              // -beg- preserve=no 33FFE57B0395 remove_all_head358A5E3B0132 "ModelElement::clearClientDependency"
              public void clearClientDependency()
              // -end- 33FFE57B0395 remove_all_head358A5E3B0132 "ModelElement::clearClientDependency"
              {
                // -beg- preserve=no 33FFE57B0395 remove_all_body358A5E3B0132 "ModelElement::clearClientDependency"
                super.clearClientDependency();
                // -end- 33FFE57B0395 remove_all_body358A5E3B0132 "ModelElement::clearClientDependency"
              }

              /** returns the number of ClientDependencys.
               *  @see #addClientDependency
               */
              // -beg- preserve=no 33FFE57B0395 size_head358A5E3B0132 "ModelElement::sizeClientDependency"
              public int sizeClientDependency()
              // -end- 33FFE57B0395 size_head358A5E3B0132 "ModelElement::sizeClientDependency"
              {
                // -beg- preserve=no 33FFE57B0395 size_body358A5E3B0132 "ModelElement::sizeClientDependency"
                return super.sizeClientDependency();
                // -end- 33FFE57B0395 size_body358A5E3B0132 "ModelElement::sizeClientDependency"
              }

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 33FFE57B0395 _link_body358A5E3B0132 "ModelElement::_linkClientDependency"
              public void _linkClientDependency(Dependency clientDependency1)
              {
                super._linkClientDependency(clientDependency1);
              }
              // -end- 33FFE57B0395 _link_body358A5E3B0132 "ModelElement::_linkClientDependency"

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 33FFE57B0395 _unlink_body358A5E3B0132 "ModelElement::_unlinkClientDependency"
              public void _unlinkClientDependency(Dependency clientDependency1)
              {
                super._unlinkClientDependency(clientDependency1);
              }
              // -end- 33FFE57B0395 _unlink_body358A5E3B0132 "ModelElement::_unlinkClientDependency"

              // -beg- preserve=no 33598CAA030D code358A5E3B0132 "ownedElement"

              // -end- 33598CAA030D code358A5E3B0132 "ownedElement"

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
              // -beg- preserve=no 33598CAA030D add_head358A5E3B0132 "Namespace::addOwnedElement"
              public void addOwnedElement(ModelElement ownedElement1)
              // -end- 33598CAA030D add_head358A5E3B0132 "Namespace::addOwnedElement"
              {
                // -beg- preserve=no 33598CAA030D add_body358A5E3B0132 "Namespace::addOwnedElement"
                super.addOwnedElement(ownedElement1);
                // -end- 33598CAA030D add_body358A5E3B0132 "Namespace::addOwnedElement"
              }

              // -beg- preserve=no 33598CAA030D add2_head358A5E3B0132 "Namespace::add2OwnedElement"
              public void addOwnedElement(int index,ModelElement ownedElement1)
              // -end- 33598CAA030D add2_head358A5E3B0132 "Namespace::add2OwnedElement"
              {
                // -beg- preserve=no 33598CAA030D add2_body358A5E3B0132 "Namespace::add2OwnedElement"
                super.addOwnedElement(index,ownedElement1);
                // -end- 33598CAA030D add2_body358A5E3B0132 "Namespace::add2OwnedElement"
              }

              /** add a link to a OwnedElement.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D addlink_head358A5E3B0132 "Namespace::addOwnedElementLink"
              public void addOwnedElementLink(ElementOwnership ownedElement1)
              // -end- 33598CAA030D addlink_head358A5E3B0132 "Namespace::addOwnedElementLink"
              {
                // -beg- preserve=no 33598CAA030D addlink_body358A5E3B0132 "Namespace::addOwnedElementLink"
                super.addOwnedElementLink(ownedElement1);
                // -end- 33598CAA030D addlink_body358A5E3B0132 "Namespace::addOwnedElementLink"
              }

              /** disconnect a OwnedElement.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D remove_head358A5E3B0132 "Namespace::removeOwnedElement"
              public ModelElement removeOwnedElement(ModelElement ownedElement1)
              // -end- 33598CAA030D remove_head358A5E3B0132 "Namespace::removeOwnedElement"
              {
                // -beg- preserve=no 33598CAA030D remove_body358A5E3B0132 "Namespace::removeOwnedElement"
                return super.removeOwnedElement(ownedElement1);
                // -end- 33598CAA030D remove_body358A5E3B0132 "Namespace::removeOwnedElement"
              }

              /** disconnect a OwnedElement.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D remove2_head358A5E3B0132 "Namespace::remove2OwnedElement"
              public ModelElement removeOwnedElement(int index)
              // -end- 33598CAA030D remove2_head358A5E3B0132 "Namespace::remove2OwnedElement"
              {
                // -beg- preserve=no 33598CAA030D remove2_body358A5E3B0132 "Namespace::remove2OwnedElement"
                return super.removeOwnedElement(index);
                // -end- 33598CAA030D remove2_body358A5E3B0132 "Namespace::remove2OwnedElement"
              }

              /** change a OwnedElement.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D set_head358A5E3B0132 "Namespace::setOwnedElement"
              public ModelElement setOwnedElement(int index,ModelElement ownedElement1)
              // -end- 33598CAA030D set_head358A5E3B0132 "Namespace::setOwnedElement"
              {
                // -beg- preserve=no 33598CAA030D set_body358A5E3B0132 "Namespace::setOwnedElement"
                return super.setOwnedElement(index,ownedElement1);
                // -end- 33598CAA030D set_body358A5E3B0132 "Namespace::setOwnedElement"
              }

              /** tests if a given OwnedElement is connected.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D test_head358A5E3B0132 "Namespace::containsOwnedElement"
              public boolean containsOwnedElement(ModelElement ownedElement1)
              // -end- 33598CAA030D test_head358A5E3B0132 "Namespace::containsOwnedElement"
              {
                // -beg- preserve=no 33598CAA030D test_body358A5E3B0132 "Namespace::containsOwnedElement"
                return super.containsOwnedElement(ownedElement1);
                // -end- 33598CAA030D test_body358A5E3B0132 "Namespace::containsOwnedElement"
              }

              /** used to enumerate all connected OwnedElements.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D get_all_head358A5E3B0132 "Namespace::iteratorOwnedElement"
              public java.util.Iterator iteratorOwnedElement()
              // -end- 33598CAA030D get_all_head358A5E3B0132 "Namespace::iteratorOwnedElement"
              {
                // -beg- preserve=no 33598CAA030D get_all_body358A5E3B0132 "Namespace::iteratorOwnedElement"
                return super.iteratorOwnedElement();
                // -end- 33598CAA030D get_all_body358A5E3B0132 "Namespace::iteratorOwnedElement"
              }

              /** disconnect all OwnedElements.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D remove_all_head358A5E3B0132 "Namespace::clearOwnedElement"
              public void clearOwnedElement()
              // -end- 33598CAA030D remove_all_head358A5E3B0132 "Namespace::clearOwnedElement"
              {
                // -beg- preserve=no 33598CAA030D remove_all_body358A5E3B0132 "Namespace::clearOwnedElement"
                super.clearOwnedElement();
                // -end- 33598CAA030D remove_all_body358A5E3B0132 "Namespace::clearOwnedElement"
              }

              /** returns the number of OwnedElements.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D size_head358A5E3B0132 "Namespace::sizeOwnedElement"
              public int sizeOwnedElement()
              // -end- 33598CAA030D size_head358A5E3B0132 "Namespace::sizeOwnedElement"
              {
                // -beg- preserve=no 33598CAA030D size_body358A5E3B0132 "Namespace::sizeOwnedElement"
                return super.sizeOwnedElement();
                // -end- 33598CAA030D size_body358A5E3B0132 "Namespace::sizeOwnedElement"
              }

              /** enumerate the link objects of currently connected OwnedElement.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D itlink_head358A5E3B0132 "Namespace::getOwnedElementLink"
              public java.util.Iterator iteratorOwnedElementLink()
              // -end- 33598CAA030D itlink_head358A5E3B0132 "Namespace::getOwnedElementLink"
              {
                // -beg- preserve=no 33598CAA030D itlink_body358A5E3B0132 "Namespace::getOwnedElementLink"
                return super.iteratorOwnedElementLink();
                // -end- 33598CAA030D itlink_body358A5E3B0132 "Namespace::getOwnedElementLink"
              }

              /** create a link class for a new link to a OwnedElement.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D createlink_head358A5E3B0132 "Namespace::createOwnedElementLink"
              public ElementOwnership createOwnedElementLink()
              // -end- 33598CAA030D createlink_head358A5E3B0132 "Namespace::createOwnedElementLink"
              {
                // -beg- preserve=no 33598CAA030D createlink_body358A5E3B0132 "Namespace::createOwnedElementLink"
                return super.createOwnedElementLink();
                // -end- 33598CAA030D createlink_body358A5E3B0132 "Namespace::createOwnedElementLink"
              }

              /** find a link object for a given OwnedElement.
               *  @see #addOwnedElement
               */
              // -beg- preserve=no 33598CAA030D find_head358A5E3B0132 "Namespace::findOwnedElementLink"
              public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
              // -end- 33598CAA030D find_head358A5E3B0132 "Namespace::findOwnedElementLink"
              {
                // -beg- preserve=no 33598CAA030D find_body358A5E3B0132 "Namespace::findOwnedElementLink"
                return super.findOwnedElementLink(ownedElement1);
                // -end- 33598CAA030D find_body358A5E3B0132 "Namespace::findOwnedElementLink"
              }

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 33598CAA030D _link_body358A5E3B0132 "Namespace::_linkOwnedElement"
              public void _linkOwnedElement(ElementOwnership ownedElement1)
              {
                super._linkOwnedElement(ownedElement1);
              }
              // -end- 33598CAA030D _link_body358A5E3B0132 "Namespace::_linkOwnedElement"

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 33598CAA030D _unlink_body358A5E3B0132 "Namespace::_unlinkOwnedElement"
              public void _unlinkOwnedElement(ElementOwnership ownedElement1)
              {
                super._unlinkOwnedElement(ownedElement1);
              }
              // -end- 33598CAA030D _unlink_body358A5E3B0132 "Namespace::_unlinkOwnedElement"

              // -beg- preserve=no 335C146B01D6 code358A5E3B0132 "specialization"
              private java.util.Set specialization = new java.util.HashSet();
              // -end- 335C146B01D6 code358A5E3B0132 "specialization"

              /** add a Specialization.
               *  
               *  @see #removeSpecialization
               *  @see #containsSpecialization
               *  @see #iteratorSpecialization
               *  @see #clearSpecialization
               *  @see #sizeSpecialization
               */
              // -beg- preserve=no 335C146B01D6 add_head358A5E3B0132 "GeneralizableElement::addSpecialization"
              public void addSpecialization(Generalization specialization1)
              // -end- 335C146B01D6 add_head358A5E3B0132 "GeneralizableElement::addSpecialization"
              {
                // -beg- preserve=no 335C146B01D6 add_body358A5E3B0132 "GeneralizableElement::addSpecialization"
                specialization.add(specialization1);
                specialization1._linkParent(this);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecialization"));
                return;
                // -end- 335C146B01D6 add_body358A5E3B0132 "GeneralizableElement::addSpecialization"
              }

              /** disconnect a Specialization.
               *  @see #addSpecialization
               */
              // -beg- preserve=no 335C146B01D6 remove_head358A5E3B0132 "GeneralizableElement::removeSpecialization"
              public Generalization removeSpecialization(Generalization specialization1)
              // -end- 335C146B01D6 remove_head358A5E3B0132 "GeneralizableElement::removeSpecialization"
              {
                // -beg- preserve=no 335C146B01D6 remove_body358A5E3B0132 "GeneralizableElement::removeSpecialization"
                Generalization ret=null;
                if(specialization1==null || !specialization.contains(specialization1)){
                  throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                }
                ret = specialization1;
                specialization.remove(specialization1);
                specialization1._unlinkParent(this);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecialization"));
                return ret;
                // -end- 335C146B01D6 remove_body358A5E3B0132 "GeneralizableElement::removeSpecialization"
              }

              /** tests if a given Specialization is connected.
               *  @see #addSpecialization
               */
              // -beg- preserve=no 335C146B01D6 test_head358A5E3B0132 "GeneralizableElement::containsSpecialization"
              public boolean containsSpecialization(Generalization specialization1)
              // -end- 335C146B01D6 test_head358A5E3B0132 "GeneralizableElement::containsSpecialization"
              {
                // -beg- preserve=no 335C146B01D6 test_body358A5E3B0132 "GeneralizableElement::containsSpecialization"
                return specialization.contains(specialization1);
                // -end- 335C146B01D6 test_body358A5E3B0132 "GeneralizableElement::containsSpecialization"
              }

              /** used to enumerate all connected Specializations.
               *  @see #addSpecialization
               */
              // -beg- preserve=no 335C146B01D6 get_all_head358A5E3B0132 "GeneralizableElement::iteratorSpecialization"
              public java.util.Iterator iteratorSpecialization()
              // -end- 335C146B01D6 get_all_head358A5E3B0132 "GeneralizableElement::iteratorSpecialization"
              {
                // -beg- preserve=no 335C146B01D6 get_all_body358A5E3B0132 "GeneralizableElement::iteratorSpecialization"
                return specialization.iterator();
                // -end- 335C146B01D6 get_all_body358A5E3B0132 "GeneralizableElement::iteratorSpecialization"
              }

              /** disconnect all Specializations.
               *  @see #addSpecialization
               */
              // -beg- preserve=no 335C146B01D6 remove_all_head358A5E3B0132 "GeneralizableElement::clearSpecialization"
              public void clearSpecialization()
              // -end- 335C146B01D6 remove_all_head358A5E3B0132 "GeneralizableElement::clearSpecialization"
              {
                // -beg- preserve=no 335C146B01D6 remove_all_body358A5E3B0132 "GeneralizableElement::clearSpecialization"
                if(sizeSpecialization()>0){
                  for(java.util.Iterator p = specialization.iterator(); p.hasNext();){
                    ((Generalization)p.next())._unlinkParent(this);
                  }
                  specialization.clear();
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecialization"));
                }
                // -end- 335C146B01D6 remove_all_body358A5E3B0132 "GeneralizableElement::clearSpecialization"
              }

              /** returns the number of Specializations.
               *  @see #addSpecialization
               */
              // -beg- preserve=no 335C146B01D6 size_head358A5E3B0132 "GeneralizableElement::sizeSpecialization"
              public int sizeSpecialization()
              // -end- 335C146B01D6 size_head358A5E3B0132 "GeneralizableElement::sizeSpecialization"
              {
                // -beg- preserve=no 335C146B01D6 size_body358A5E3B0132 "GeneralizableElement::sizeSpecialization"
                return specialization.size();
                // -end- 335C146B01D6 size_body358A5E3B0132 "GeneralizableElement::sizeSpecialization"
              }

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 335C146B01D6 _link_body358A5E3B0132 "GeneralizableElement::_linkSpecialization"
              public void _linkSpecialization(Generalization specialization1)
              {
                specialization.add(specialization1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecialization"));
                return;
              }
              // -end- 335C146B01D6 _link_body358A5E3B0132 "GeneralizableElement::_linkSpecialization"

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 335C146B01D6 _unlink_body358A5E3B0132 "GeneralizableElement::_unlinkSpecialization"
              public void _unlinkSpecialization(Generalization specialization1)
              {
                specialization.remove(specialization1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecialization"));
                return;
              }
              // -end- 335C146B01D6 _unlink_body358A5E3B0132 "GeneralizableElement::_unlinkSpecialization"

              // -beg- preserve=no 33598CAA030E code358A5E3B0132 "namespace"

              // -end- 33598CAA030E code358A5E3B0132 "namespace"

              /** attaches a Namespace.
               *  Designates the Namespace that contains the ModelElement.
               *  @see #detachNamespace
               *  @see #getNamespace
               *  @see #containsNamespace
               *  @see #getNamespaceLink
               *  @see #createNamespaceLink
               */
              // -beg- preserve=no 33598CAA030E attach_head358A5E3B0132 "ModelElement::attachNamespace"
              public void attachNamespace(Namespace namespace1)
              // -end- 33598CAA030E attach_head358A5E3B0132 "ModelElement::attachNamespace"
              {
                // -beg- preserve=no 33598CAA030E attach_body358A5E3B0132 "ModelElement::attachNamespace"
                super.attachNamespace(namespace1);
                // -end- 33598CAA030E attach_body358A5E3B0132 "ModelElement::attachNamespace"
              }

              /** attaches a link to a Namespace.
               *  @see #attachNamespace
               */
              // -beg- preserve=no 33598CAA030E attachlink_head358A5E3B0132 "ModelElement::attachNamespaceLink"
              public void attachNamespaceLink(ElementOwnership namespace1)
              // -end- 33598CAA030E attachlink_head358A5E3B0132 "ModelElement::attachNamespaceLink"
              {
                // -beg- preserve=no 33598CAA030E attachlink_body358A5E3B0132 "ModelElement::attachNamespaceLink"
                super.attachNamespaceLink(namespace1);
                // -end- 33598CAA030E attachlink_body358A5E3B0132 "ModelElement::attachNamespaceLink"
              }

              /** disconnect the currently attached Namespace.
               *  @see #attachNamespace
               */
              // -beg- preserve=no 33598CAA030E detach_head358A5E3B0132 "ModelElement::detachNamespace"
              public Namespace detachNamespace()
              // -end- 33598CAA030E detach_head358A5E3B0132 "ModelElement::detachNamespace"
              {
                // -beg- preserve=no 33598CAA030E detach_body358A5E3B0132 "ModelElement::detachNamespace"
                return super.detachNamespace();
                // -end- 33598CAA030E detach_body358A5E3B0132 "ModelElement::detachNamespace"
              }

              /** get the currently attached Namespace.
               *  @see #attachNamespace
               */
              // -beg- preserve=no 33598CAA030E get_head358A5E3B0132 "ModelElement::getNamespace"
              public Namespace getNamespace()
              // -end- 33598CAA030E get_head358A5E3B0132 "ModelElement::getNamespace"
              {
                // -beg- preserve=no 33598CAA030E get_body358A5E3B0132 "ModelElement::getNamespace"
                return super.getNamespace();
                // -end- 33598CAA030E get_body358A5E3B0132 "ModelElement::getNamespace"
              }

              /** get the link class of currently attached Namespace.
               *  @see #attachNamespace
               */
              // -beg- preserve=no 33598CAA030E getlink_head358A5E3B0132 "ModelElement::getNamespaceLink"
              public ElementOwnership getNamespaceLink()
              // -end- 33598CAA030E getlink_head358A5E3B0132 "ModelElement::getNamespaceLink"
              {
                // -beg- preserve=no 33598CAA030E getlink_body358A5E3B0132 "ModelElement::getNamespaceLink"
                return super.getNamespaceLink();
                // -end- 33598CAA030E getlink_body358A5E3B0132 "ModelElement::getNamespaceLink"
              }

              /** create a link class for a new link to a Namespace.
               *  @see #attachNamespace
               */
              // -beg- preserve=no 33598CAA030E createlink_head358A5E3B0132 "ModelElement::createNamespaceLink"
              public ElementOwnership createNamespaceLink()
              // -end- 33598CAA030E createlink_head358A5E3B0132 "ModelElement::createNamespaceLink"
              {
                // -beg- preserve=no 33598CAA030E createlink_body358A5E3B0132 "ModelElement::createNamespaceLink"
                return super.createNamespaceLink();
                // -end- 33598CAA030E createlink_body358A5E3B0132 "ModelElement::createNamespaceLink"
              }

              /** tests if there is a Namespace attached.
               *  @see #attachNamespace
               */
              // -beg- preserve=no 33598CAA030E test_head358A5E3B0132 "ModelElement::containsNamespace"
              public boolean containsNamespace()
              // -end- 33598CAA030E test_head358A5E3B0132 "ModelElement::containsNamespace"
              {
                // -beg- preserve=no 33598CAA030E test_body358A5E3B0132 "ModelElement::containsNamespace"
                return super.containsNamespace();
                // -end- 33598CAA030E test_body358A5E3B0132 "ModelElement::containsNamespace"
              }

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 33598CAA030E _link_body358A5E3B0132 "ModelElement::_linkNamespace"
              public void _linkNamespace(ElementOwnership namespace1)
              {
                super._linkNamespace(namespace1);
              }
              // -end- 33598CAA030E _link_body358A5E3B0132 "ModelElement::_linkNamespace"

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 33598CAA030E _unlink_body358A5E3B0132 "ModelElement::_unlinkNamespace"
              public void _unlinkNamespace(ElementOwnership namespace1)
              {
                super._unlinkNamespace(namespace1);
              }
              // -end- 33598CAA030E _unlink_body358A5E3B0132 "ModelElement::_unlinkNamespace"

              // -beg- preserve=no 335C0D7A02A8 code358A5E3B0132 "supplierDependency"

              // -end- 335C0D7A02A8 code358A5E3B0132 "supplierDependency"

              /** add a SupplierDependency.
               *  
               *  @see #removeSupplierDependency
               *  @see #containsSupplierDependency
               *  @see #iteratorSupplierDependency
               *  @see #clearSupplierDependency
               *  @see #sizeSupplierDependency
               */
              // -beg- preserve=no 335C0D7A02A8 add_head358A5E3B0132 "ModelElement::addSupplierDependency"
              public void addSupplierDependency(Dependency supplierDependency1)
              // -end- 335C0D7A02A8 add_head358A5E3B0132 "ModelElement::addSupplierDependency"
              {
                // -beg- preserve=no 335C0D7A02A8 add_body358A5E3B0132 "ModelElement::addSupplierDependency"
                super.addSupplierDependency(supplierDependency1);
                // -end- 335C0D7A02A8 add_body358A5E3B0132 "ModelElement::addSupplierDependency"
              }

              /** disconnect a SupplierDependency.
               *  @see #addSupplierDependency
               */
              // -beg- preserve=no 335C0D7A02A8 remove_head358A5E3B0132 "ModelElement::removeSupplierDependency"
              public Dependency removeSupplierDependency(Dependency supplierDependency1)
              // -end- 335C0D7A02A8 remove_head358A5E3B0132 "ModelElement::removeSupplierDependency"
              {
                // -beg- preserve=no 335C0D7A02A8 remove_body358A5E3B0132 "ModelElement::removeSupplierDependency"
                return super.removeSupplierDependency(supplierDependency1);
                // -end- 335C0D7A02A8 remove_body358A5E3B0132 "ModelElement::removeSupplierDependency"
              }

              /** tests if a given SupplierDependency is connected.
               *  @see #addSupplierDependency
               */
              // -beg- preserve=no 335C0D7A02A8 test_head358A5E3B0132 "ModelElement::containsSupplierDependency"
              public boolean containsSupplierDependency(Dependency supplierDependency1)
              // -end- 335C0D7A02A8 test_head358A5E3B0132 "ModelElement::containsSupplierDependency"
              {
                // -beg- preserve=no 335C0D7A02A8 test_body358A5E3B0132 "ModelElement::containsSupplierDependency"
                return super.containsSupplierDependency(supplierDependency1);
                // -end- 335C0D7A02A8 test_body358A5E3B0132 "ModelElement::containsSupplierDependency"
              }

              /** used to enumerate all connected SupplierDependencys.
               *  @see #addSupplierDependency
               */
              // -beg- preserve=no 335C0D7A02A8 get_all_head358A5E3B0132 "ModelElement::iteratorSupplierDependency"
              public java.util.Iterator iteratorSupplierDependency()
              // -end- 335C0D7A02A8 get_all_head358A5E3B0132 "ModelElement::iteratorSupplierDependency"
              {
                // -beg- preserve=no 335C0D7A02A8 get_all_body358A5E3B0132 "ModelElement::iteratorSupplierDependency"
                return super.iteratorSupplierDependency();
                // -end- 335C0D7A02A8 get_all_body358A5E3B0132 "ModelElement::iteratorSupplierDependency"
              }

              /** disconnect all SupplierDependencys.
               *  @see #addSupplierDependency
               */
              // -beg- preserve=no 335C0D7A02A8 remove_all_head358A5E3B0132 "ModelElement::clearSupplierDependency"
              public void clearSupplierDependency()
              // -end- 335C0D7A02A8 remove_all_head358A5E3B0132 "ModelElement::clearSupplierDependency"
              {
                // -beg- preserve=no 335C0D7A02A8 remove_all_body358A5E3B0132 "ModelElement::clearSupplierDependency"
                super.clearSupplierDependency();
                // -end- 335C0D7A02A8 remove_all_body358A5E3B0132 "ModelElement::clearSupplierDependency"
              }

              /** returns the number of SupplierDependencys.
               *  @see #addSupplierDependency
               */
              // -beg- preserve=no 335C0D7A02A8 size_head358A5E3B0132 "ModelElement::sizeSupplierDependency"
              public int sizeSupplierDependency()
              // -end- 335C0D7A02A8 size_head358A5E3B0132 "ModelElement::sizeSupplierDependency"
              {
                // -beg- preserve=no 335C0D7A02A8 size_body358A5E3B0132 "ModelElement::sizeSupplierDependency"
                return super.sizeSupplierDependency();
                // -end- 335C0D7A02A8 size_body358A5E3B0132 "ModelElement::sizeSupplierDependency"
              }

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 335C0D7A02A8 _link_body358A5E3B0132 "ModelElement::_linkSupplierDependency"
              public void _linkSupplierDependency(Dependency supplierDependency1)
              {
                super._linkSupplierDependency(supplierDependency1);
              }
              // -end- 335C0D7A02A8 _link_body358A5E3B0132 "ModelElement::_linkSupplierDependency"

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 335C0D7A02A8 _unlink_body358A5E3B0132 "ModelElement::_unlinkSupplierDependency"
              public void _unlinkSupplierDependency(Dependency supplierDependency1)
              {
                super._unlinkSupplierDependency(supplierDependency1);
              }
              // -end- 335C0D7A02A8 _unlink_body358A5E3B0132 "ModelElement::_unlinkSupplierDependency"

              // -beg- preserve=no 335C14A5019A code358A5E3B0132 "generalization"
              private java.util.Set generalization = new java.util.HashSet();
              // -end- 335C14A5019A code358A5E3B0132 "generalization"

              /** add a Generalization.
               *  
               *  @see #removeGeneralization
               *  @see #containsGeneralization
               *  @see #iteratorGeneralization
               *  @see #clearGeneralization
               *  @see #sizeGeneralization
               */
              // -beg- preserve=no 335C14A5019A add_head358A5E3B0132 "GeneralizableElement::addGeneralization"
              public void addGeneralization(Generalization generalization1)
              // -end- 335C14A5019A add_head358A5E3B0132 "GeneralizableElement::addGeneralization"
              {
                // -beg- preserve=no 335C14A5019A add_body358A5E3B0132 "GeneralizableElement::addGeneralization"
                generalization.add(generalization1);
                generalization1._linkChild(this);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addGeneralization"));
                return;
                // -end- 335C14A5019A add_body358A5E3B0132 "GeneralizableElement::addGeneralization"
              }

              /** disconnect a Generalization.
               *  @see #addGeneralization
               */
              // -beg- preserve=no 335C14A5019A remove_head358A5E3B0132 "GeneralizableElement::removeGeneralization"
              public Generalization removeGeneralization(Generalization generalization1)
              // -end- 335C14A5019A remove_head358A5E3B0132 "GeneralizableElement::removeGeneralization"
              {
                // -beg- preserve=no 335C14A5019A remove_body358A5E3B0132 "GeneralizableElement::removeGeneralization"
                Generalization ret=null;
                if(generalization1==null || !generalization.contains(generalization1)){
                  throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                }
                ret = generalization1;
                generalization.remove(generalization1);
                generalization1._unlinkChild(this);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeGeneralization"));
                return ret;
                // -end- 335C14A5019A remove_body358A5E3B0132 "GeneralizableElement::removeGeneralization"
              }

              /** tests if a given Generalization is connected.
               *  @see #addGeneralization
               */
              // -beg- preserve=no 335C14A5019A test_head358A5E3B0132 "GeneralizableElement::containsGeneralization"
              public boolean containsGeneralization(Generalization generalization1)
              // -end- 335C14A5019A test_head358A5E3B0132 "GeneralizableElement::containsGeneralization"
              {
                // -beg- preserve=no 335C14A5019A test_body358A5E3B0132 "GeneralizableElement::containsGeneralization"
                return generalization.contains(generalization1);
                // -end- 335C14A5019A test_body358A5E3B0132 "GeneralizableElement::containsGeneralization"
              }

              /** used to enumerate all connected Generalizations.
               *  @see #addGeneralization
               */
              // -beg- preserve=no 335C14A5019A get_all_head358A5E3B0132 "GeneralizableElement::iteratorGeneralization"
              public java.util.Iterator iteratorGeneralization()
              // -end- 335C14A5019A get_all_head358A5E3B0132 "GeneralizableElement::iteratorGeneralization"
              {
                // -beg- preserve=no 335C14A5019A get_all_body358A5E3B0132 "GeneralizableElement::iteratorGeneralization"
                return generalization.iterator();
                // -end- 335C14A5019A get_all_body358A5E3B0132 "GeneralizableElement::iteratorGeneralization"
              }

              /** disconnect all Generalizations.
               *  @see #addGeneralization
               */
              // -beg- preserve=no 335C14A5019A remove_all_head358A5E3B0132 "GeneralizableElement::clearGeneralization"
              public void clearGeneralization()
              // -end- 335C14A5019A remove_all_head358A5E3B0132 "GeneralizableElement::clearGeneralization"
              {
                // -beg- preserve=no 335C14A5019A remove_all_body358A5E3B0132 "GeneralizableElement::clearGeneralization"
                if(sizeGeneralization()>0){
                  for(java.util.Iterator p = generalization.iterator(); p.hasNext();){
                    ((Generalization)p.next())._unlinkChild(this);
                  }
                  generalization.clear();
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearGeneralization"));
                }
                // -end- 335C14A5019A remove_all_body358A5E3B0132 "GeneralizableElement::clearGeneralization"
              }

              /** returns the number of Generalizations.
               *  @see #addGeneralization
               */
              // -beg- preserve=no 335C14A5019A size_head358A5E3B0132 "GeneralizableElement::sizeGeneralization"
              public int sizeGeneralization()
              // -end- 335C14A5019A size_head358A5E3B0132 "GeneralizableElement::sizeGeneralization"
              {
                // -beg- preserve=no 335C14A5019A size_body358A5E3B0132 "GeneralizableElement::sizeGeneralization"
                return generalization.size();
                // -end- 335C14A5019A size_body358A5E3B0132 "GeneralizableElement::sizeGeneralization"
              }

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 335C14A5019A _link_body358A5E3B0132 "GeneralizableElement::_linkGeneralization"
              public void _linkGeneralization(Generalization generalization1)
              {
                generalization.add(generalization1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkGeneralization"));
                return;
              }
              // -end- 335C14A5019A _link_body358A5E3B0132 "GeneralizableElement::_linkGeneralization"

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 335C14A5019A _unlink_body358A5E3B0132 "GeneralizableElement::_unlinkGeneralization"
              public void _unlinkGeneralization(Generalization generalization1)
              {
                generalization.remove(generalization1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkGeneralization"));
                return;
              }
              // -end- 335C14A5019A _unlink_body358A5E3B0132 "GeneralizableElement::_unlinkGeneralization"

              // -beg- preserve=no 3CC001F302B7 code358A5E3B0132 "basketType"
              private java.util.Set basketType = new java.util.HashSet();
              // -end- 3CC001F302B7 code358A5E3B0132 "basketType"

              /** add a BasketType.
               *  
               *  @see #removeBasketType
               *  @see #containsBasketType
               *  @see #iteratorBasketType
               *  @see #clearBasketType
               *  @see #sizeBasketType
               */
              // -beg- preserve=no 3CC001F302B7 add_head358A5E3B0132 "TopicDef::addBasketType"
              public void addBasketType(BasketType basketType1)
              // -end- 3CC001F302B7 add_head358A5E3B0132 "TopicDef::addBasketType"
              {
                // -beg- preserve=no 3CC001F302B7 add_body358A5E3B0132 "TopicDef::addBasketType"
                basketType.add(basketType1);
                basketType1._linkBasketSchema(this);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addBasketType"));
                return;
                // -end- 3CC001F302B7 add_body358A5E3B0132 "TopicDef::addBasketType"
              }

              /** disconnect a BasketType.
               *  @see #addBasketType
               */
              // -beg- preserve=no 3CC001F302B7 remove_head358A5E3B0132 "TopicDef::removeBasketType"
              public BasketType removeBasketType(BasketType basketType1)
              // -end- 3CC001F302B7 remove_head358A5E3B0132 "TopicDef::removeBasketType"
              {
                // -beg- preserve=no 3CC001F302B7 remove_body358A5E3B0132 "TopicDef::removeBasketType"
                BasketType ret=null;
                if(basketType1==null || !basketType.contains(basketType1)){
                  throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                }
                ret = basketType1;
                basketType.remove(basketType1);
                basketType1._unlinkBasketSchema(this);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeBasketType"));
                return ret;
                // -end- 3CC001F302B7 remove_body358A5E3B0132 "TopicDef::removeBasketType"
              }

              /** tests if a given BasketType is connected.
               *  @see #addBasketType
               */
              // -beg- preserve=no 3CC001F302B7 test_head358A5E3B0132 "TopicDef::containsBasketType"
              public boolean containsBasketType(BasketType basketType1)
              // -end- 3CC001F302B7 test_head358A5E3B0132 "TopicDef::containsBasketType"
              {
                // -beg- preserve=no 3CC001F302B7 test_body358A5E3B0132 "TopicDef::containsBasketType"
                return basketType.contains(basketType1);
                // -end- 3CC001F302B7 test_body358A5E3B0132 "TopicDef::containsBasketType"
              }

              /** used to enumerate all connected BasketTypes.
               *  @see #addBasketType
               */
              // -beg- preserve=no 3CC001F302B7 get_all_head358A5E3B0132 "TopicDef::iteratorBasketType"
              public java.util.Iterator iteratorBasketType()
              // -end- 3CC001F302B7 get_all_head358A5E3B0132 "TopicDef::iteratorBasketType"
              {
                // -beg- preserve=no 3CC001F302B7 get_all_body358A5E3B0132 "TopicDef::iteratorBasketType"
                return basketType.iterator();
                // -end- 3CC001F302B7 get_all_body358A5E3B0132 "TopicDef::iteratorBasketType"
              }

              /** disconnect all BasketTypes.
               *  @see #addBasketType
               */
              // -beg- preserve=no 3CC001F302B7 remove_all_head358A5E3B0132 "TopicDef::clearBasketType"
              public void clearBasketType()
              // -end- 3CC001F302B7 remove_all_head358A5E3B0132 "TopicDef::clearBasketType"
              {
                // -beg- preserve=no 3CC001F302B7 remove_all_body358A5E3B0132 "TopicDef::clearBasketType"
                if(sizeBasketType()>0){
                  for(java.util.Iterator p = basketType.iterator(); p.hasNext();){
                    ((BasketType)p.next())._unlinkBasketSchema(this);
                  }
                  basketType.clear();
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearBasketType"));
                }
                // -end- 3CC001F302B7 remove_all_body358A5E3B0132 "TopicDef::clearBasketType"
              }

              /** returns the number of BasketTypes.
               *  @see #addBasketType
               */
              // -beg- preserve=no 3CC001F302B7 size_head358A5E3B0132 "TopicDef::sizeBasketType"
              public int sizeBasketType()
              // -end- 3CC001F302B7 size_head358A5E3B0132 "TopicDef::sizeBasketType"
              {
                // -beg- preserve=no 3CC001F302B7 size_body358A5E3B0132 "TopicDef::sizeBasketType"
                return basketType.size();
                // -end- 3CC001F302B7 size_body358A5E3B0132 "TopicDef::sizeBasketType"
              }

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 3CC001F302B7 _link_body358A5E3B0132 "TopicDef::_linkBasketType"
              public void _linkBasketType(BasketType basketType1)
              {
                basketType.add(basketType1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkBasketType"));
                return;
              }
              // -end- 3CC001F302B7 _link_body358A5E3B0132 "TopicDef::_linkBasketType"

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 3CC001F302B7 _unlink_body358A5E3B0132 "TopicDef::_unlinkBasketType"
              public void _unlinkBasketType(BasketType basketType1)
              {
                basketType.remove(basketType1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkBasketType"));
                return;
              }
              // -end- 3CC001F302B7 _unlink_body358A5E3B0132 "TopicDef::_unlinkBasketType"

              // -beg- preserve=no 358A618100F1 var358A5E3B0132 "name"

              // -end- 358A618100F1 var358A5E3B0132 "name"

              /** get current value of name
               *  Name des Themas
               *  @see #setName
               */
              // -beg- preserve=no 358A618100F1 get_head358A5E3B0132 "name"
              public  NlsString getName()
              // -end- 358A618100F1 get_head358A5E3B0132 "name"
              {
                // -beg- preserve=no 358A618100F1 get_body358A5E3B0132 "name"
                return super.getName();
                // -end- 358A618100F1 get_body358A5E3B0132 "name"
              }

              /** set current value of name
               *  @see #getName
               */
              // -beg- preserve=no 358A618100F1 set_head358A5E3B0132 "name"
              public  void setName(NlsString value1)
              // -end- 358A618100F1 set_head358A5E3B0132 "name"
              {
                // -beg- preserve=no 358A618100F1 set_body358A5E3B0132 "name"
                super.setName(value1);
                // -end- 358A618100F1 set_body358A5E3B0132 "name"
              }

              // -beg- preserve=no 3C1DBB8D010F var358A5E3B0132 "isAbstract"
              private boolean isAbstract;
              // -end- 3C1DBB8D010F var358A5E3B0132 "isAbstract"

              /** get current value of isAbstract
               *  @see #setAbstract
               */
              // -beg- preserve=no 3C1DBB8D010F get_head358A5E3B0132 "isAbstract"
              public  boolean isAbstract()
              // -end- 3C1DBB8D010F get_head358A5E3B0132 "isAbstract"
              {
                // -beg- preserve=no 3C1DBB8D010F get_body358A5E3B0132 "isAbstract"
                return isAbstract;
                // -end- 3C1DBB8D010F get_body358A5E3B0132 "isAbstract"
              }

              /** set current value of isAbstract
               *  @see #isAbstract
               */
              // -beg- preserve=no 3C1DBB8D010F set_head358A5E3B0132 "isAbstract"
              public  void setAbstract(boolean value1)
              // -end- 3C1DBB8D010F set_head358A5E3B0132 "isAbstract"
              {
                // -beg- preserve=no 3C1DBB8D010F set_body358A5E3B0132 "isAbstract"
                if(isAbstract != value1){
                  isAbstract = value1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
                }
                // -end- 3C1DBB8D010F set_body358A5E3B0132 "isAbstract"
              }

              // -beg- preserve=no 3C1DBB9E0326 var358A5E3B0132 "propFinal"
              private boolean propFinal;
              // -end- 3C1DBB9E0326 var358A5E3B0132 "propFinal"

              /** get current value of propFinal
               *  @see #setPropFinal
               */
              // -beg- preserve=no 3C1DBB9E0326 get_head358A5E3B0132 "propFinal"
              public  boolean isPropFinal()
              // -end- 3C1DBB9E0326 get_head358A5E3B0132 "propFinal"
              {
                // -beg- preserve=no 3C1DBB9E0326 get_body358A5E3B0132 "propFinal"
                return propFinal;
                // -end- 3C1DBB9E0326 get_body358A5E3B0132 "propFinal"
              }

              /** set current value of propFinal
               *  @see #isPropFinal
               */
              // -beg- preserve=no 3C1DBB9E0326 set_head358A5E3B0132 "propFinal"
              public  void setPropFinal(boolean value1)
              // -end- 3C1DBB9E0326 set_head358A5E3B0132 "propFinal"
              {
                // -beg- preserve=no 3C1DBB9E0326 set_body358A5E3B0132 "propFinal"
                if(propFinal != value1){
                  propFinal = value1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPropFinal"));
                }
                // -end- 3C1DBB9E0326 set_body358A5E3B0132 "propFinal"
              }

              // -beg- preserve=no 3C1DBBEE03C1 var358A5E3B0132 "kind"
              private int kind;
              // -end- 3C1DBBEE03C1 var358A5E3B0132 "kind"

              /** get current value of kind
               *  @see ch.ehi.interlis.modeltopicclass.TopicDefKind
               *  @see #setKind
               */
              // -beg- preserve=no 3C1DBBEE03C1 get_head358A5E3B0132 "kind"
              public  int getKind()
              // -end- 3C1DBBEE03C1 get_head358A5E3B0132 "kind"
              {
                // -beg- preserve=no 3C1DBBEE03C1 get_body358A5E3B0132 "kind"
                return kind;
                // -end- 3C1DBBEE03C1 get_body358A5E3B0132 "kind"
              }

              /** set current value of kind
               *  @see ch.ehi.interlis.modeltopicclass.TopicDefKind
               *  @see #getKind
               */
              // -beg- preserve=no 3C1DBBEE03C1 set_head358A5E3B0132 "kind"
              public  void setKind(int value1)
              // -end- 3C1DBBEE03C1 set_head358A5E3B0132 "kind"
              {
                // -beg- preserve=no 3C1DBBEE03C1 set_body358A5E3B0132 "kind"
                if(kind != value1){
                  kind = value1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
                }
                // -end- 3C1DBBEE03C1 set_body358A5E3B0132 "kind"
              }

              // -beg- preserve=no 33CD739B02DA code358A5E3B0132 "importedElement"
              private java.util.Set importedElement = new java.util.HashSet();
              // -end- 33CD739B02DA code358A5E3B0132 "importedElement"

              /** add a ImportedElement.
               *  The namespace defined by a package is extended by modelelements in other, imported packages.
               *  @see #removeImportedElement
               *  @see #containsImportedElement
               *  @see #iteratorImportedElement
               *  @see #clearImportedElement
               *  @see #sizeImportedElement
               *  @see #iteratorImportedElementLink
               *  @see #createImportedElementLink
               *  @see #findImportedElementLink
               */
              // -beg- preserve=no 33CD739B02DA add_head358A5E3B0132 "Package::addImportedElement"
              public void addImportedElement(ModelElement importedElement1)
              // -end- 33CD739B02DA add_head358A5E3B0132 "Package::addImportedElement"
              {
                // -beg- preserve=no 33CD739B02DA add_body358A5E3B0132 "Package::addImportedElement"
                ElementImport linkobj=createImportedElementLink();
                linkobj.setImportedElement(importedElement1);
                linkobj.setImportedBy(this);
                importedElement.add(linkobj);
                importedElement1._linkImportedBy(linkobj);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedElement"));
                return;
                // -end- 33CD739B02DA add_body358A5E3B0132 "Package::addImportedElement"
              }

              /** add a link to a ImportedElement.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA addlink_head358A5E3B0132 "Package::addImportedElementLink"
              public void addImportedElementLink(ElementImport importedElement1)
              // -end- 33CD739B02DA addlink_head358A5E3B0132 "Package::addImportedElementLink"
              {
                // -beg- preserve=no 33CD739B02DA addlink_body358A5E3B0132 "Package::addImportedElementLink"
                importedElement1.setImportedBy(this);
                importedElement.add(importedElement1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedElementLink"));
                return;
                // -end- 33CD739B02DA addlink_body358A5E3B0132 "Package::addImportedElementLink"
              }

              /** disconnect a ImportedElement.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA remove_head358A5E3B0132 "Package::removeImportedElement"
              public ModelElement removeImportedElement(ModelElement importedElement1)
              // -end- 33CD739B02DA remove_head358A5E3B0132 "Package::removeImportedElement"
              {
                // -beg- preserve=no 33CD739B02DA remove_body358A5E3B0132 "Package::removeImportedElement"
                ModelElement ret=null;
                ElementImport linkobj=findImportedElementLink(importedElement1);
                if(importedElement1==null || linkobj==null){
                  throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                }
                ret = linkobj.getImportedElement();
                importedElement.remove(linkobj);
                ret._unlinkImportedBy(linkobj);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeImportedElement"));
                return ret;
                // -end- 33CD739B02DA remove_body358A5E3B0132 "Package::removeImportedElement"
              }

              /** tests if a given ImportedElement is connected.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA test_head358A5E3B0132 "Package::containsImportedElement"
              public boolean containsImportedElement(ModelElement importedElement1)
              // -end- 33CD739B02DA test_head358A5E3B0132 "Package::containsImportedElement"
              {
                // -beg- preserve=no 33CD739B02DA test_body358A5E3B0132 "Package::containsImportedElement"
                return importedElement.contains(findImportedElementLink(importedElement1));
                // -end- 33CD739B02DA test_body358A5E3B0132 "Package::containsImportedElement"
              }

              /** used to enumerate all connected ImportedElements.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA get_all_head358A5E3B0132 "Package::iteratorImportedElement"
              public java.util.Iterator iteratorImportedElement()
              // -end- 33CD739B02DA get_all_head358A5E3B0132 "Package::iteratorImportedElement"
              {
                // -beg- preserve=no 33CD739B02DA get_all_body358A5E3B0132 "Package::iteratorImportedElement"
                return new java.util.Iterator(){
                  private java.util.Iterator i=importedElement.iterator();
                  public boolean hasNext(){
                    return i.hasNext();
                  }
                  public Object next(){
                    ElementImport next=(ElementImport)i.next();
                    return next.getImportedElement();
                  }
                  public void remove(){
                    i.remove();
                  }
                };
                // -end- 33CD739B02DA get_all_body358A5E3B0132 "Package::iteratorImportedElement"
              }

              /** disconnect all ImportedElements.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA remove_all_head358A5E3B0132 "Package::clearImportedElement"
              public void clearImportedElement()
              // -end- 33CD739B02DA remove_all_head358A5E3B0132 "Package::clearImportedElement"
              {
                // -beg- preserve=no 33CD739B02DA remove_all_body358A5E3B0132 "Package::clearImportedElement"
                if(sizeImportedElement()>0){
                  for(java.util.Iterator p = importedElement.iterator(); p.hasNext();){
                    ElementImport linkobj=(ElementImport)p.next();
                    linkobj.getImportedElement()._unlinkImportedBy(linkobj);
                  }
                  importedElement.clear();
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearImportedElement"));
                }
                // -end- 33CD739B02DA remove_all_body358A5E3B0132 "Package::clearImportedElement"
              }

              /** returns the number of ImportedElements.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA size_head358A5E3B0132 "Package::sizeImportedElement"
              public int sizeImportedElement()
              // -end- 33CD739B02DA size_head358A5E3B0132 "Package::sizeImportedElement"
              {
                // -beg- preserve=no 33CD739B02DA size_body358A5E3B0132 "Package::sizeImportedElement"
                return importedElement.size();
                // -end- 33CD739B02DA size_body358A5E3B0132 "Package::sizeImportedElement"
              }

              /** enumerate the link objects of currently connected ImportedElement.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA itlink_head358A5E3B0132 "Package::getImportedElementLink"
              public java.util.Iterator iteratorImportedElementLink()
              // -end- 33CD739B02DA itlink_head358A5E3B0132 "Package::getImportedElementLink"
              {
                // -beg- preserve=no 33CD739B02DA itlink_body358A5E3B0132 "Package::getImportedElementLink"
                return importedElement.iterator();
                // -end- 33CD739B02DA itlink_body358A5E3B0132 "Package::getImportedElementLink"
              }

              /** create a link class for a new link to a ImportedElement.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA createlink_head358A5E3B0132 "Package::createImportedElementLink"
              public ElementImport createImportedElementLink()
              // -end- 33CD739B02DA createlink_head358A5E3B0132 "Package::createImportedElementLink"
              {
                // -beg- preserve=no 33CD739B02DA createlink_body358A5E3B0132 "Package::createImportedElementLink"
                // return new ElementImport();
                throw new java.lang.UnsupportedOperationException();
                // -end- 33CD739B02DA createlink_body358A5E3B0132 "Package::createImportedElementLink"
              }

              /** find a link object for a given ImportedElement.
               *  @see #addImportedElement
               */
              // -beg- preserve=no 33CD739B02DA find_head358A5E3B0132 "Package::findImportedElementLink"
              public ElementImport findImportedElementLink(ModelElement importedElement1)
              // -end- 33CD739B02DA find_head358A5E3B0132 "Package::findImportedElementLink"
              {
                  // -beg- preserve=no 33CD739B02DA find_body358A5E3B0132 "Package::findImportedElementLink"
                  if(importedElement1==null) return null;
                  for(java.util.Iterator p = importedElement.iterator(); p.hasNext();){
                    ElementImport linkobj=(ElementImport)p.next();
                    if(linkobj.getImportedElement()==importedElement1) return linkobj;
                  }
                  return null;
                  // -end- 33CD739B02DA find_body358A5E3B0132 "Package::findImportedElementLink"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33CD739B02DA _link_body358A5E3B0132 "Package::_linkImportedElement"
                public void _linkImportedElement(ElementImport importedElement1)
                {
                  importedElement.add(importedElement1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkImportedElement"));
                  return;
                }
                // -end- 33CD739B02DA _link_body358A5E3B0132 "Package::_linkImportedElement"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33CD739B02DA _unlink_body358A5E3B0132 "Package::_unlinkImportedElement"
                public void _unlinkImportedElement(ElementImport importedElement1)
                {
                  importedElement.remove(importedElement1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkImportedElement"));
                  return;
                }
                // -end- 33CD739B02DA _unlink_body358A5E3B0132 "Package::_unlinkImportedElement"

                // -beg- preserve=no 362409A9000A code358A5E3B0132 "presentation"

                // -end- 362409A9000A code358A5E3B0132 "presentation"

                /** add a Presentation.
                 *  
                 *  @see #removePresentation
                 *  @see #containsPresentation
                 *  @see #iteratorPresentation
                 *  @see #clearPresentation
                 *  @see #sizePresentation
                 */
                // -beg- preserve=no 362409A9000A add_head358A5E3B0132 "ModelElement::addPresentation"
                public void addPresentation(PresentationElement presentation1)
                // -end- 362409A9000A add_head358A5E3B0132 "ModelElement::addPresentation"
                {
                  // -beg- preserve=no 362409A9000A add_body358A5E3B0132 "ModelElement::addPresentation"
                  super.addPresentation(presentation1);
                  // -end- 362409A9000A add_body358A5E3B0132 "ModelElement::addPresentation"
                }

                /** disconnect a Presentation.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A remove_head358A5E3B0132 "ModelElement::removePresentation"
                public PresentationElement removePresentation(PresentationElement presentation1)
                // -end- 362409A9000A remove_head358A5E3B0132 "ModelElement::removePresentation"
                {
                  // -beg- preserve=no 362409A9000A remove_body358A5E3B0132 "ModelElement::removePresentation"
                  return super.removePresentation(presentation1);
                  // -end- 362409A9000A remove_body358A5E3B0132 "ModelElement::removePresentation"
                }

                /** tests if a given Presentation is connected.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A test_head358A5E3B0132 "ModelElement::containsPresentation"
                public boolean containsPresentation(PresentationElement presentation1)
                // -end- 362409A9000A test_head358A5E3B0132 "ModelElement::containsPresentation"
                {
                  // -beg- preserve=no 362409A9000A test_body358A5E3B0132 "ModelElement::containsPresentation"
                  return super.containsPresentation(presentation1);
                  // -end- 362409A9000A test_body358A5E3B0132 "ModelElement::containsPresentation"
                }

                /** used to enumerate all connected Presentations.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A get_all_head358A5E3B0132 "ModelElement::iteratorPresentation"
                public java.util.Iterator iteratorPresentation()
                // -end- 362409A9000A get_all_head358A5E3B0132 "ModelElement::iteratorPresentation"
                {
                  // -beg- preserve=no 362409A9000A get_all_body358A5E3B0132 "ModelElement::iteratorPresentation"
                  return super.iteratorPresentation();
                  // -end- 362409A9000A get_all_body358A5E3B0132 "ModelElement::iteratorPresentation"
                }

                /** disconnect all Presentations.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A remove_all_head358A5E3B0132 "ModelElement::clearPresentation"
                public void clearPresentation()
                // -end- 362409A9000A remove_all_head358A5E3B0132 "ModelElement::clearPresentation"
                {
                  // -beg- preserve=no 362409A9000A remove_all_body358A5E3B0132 "ModelElement::clearPresentation"
                  super.clearPresentation();
                  // -end- 362409A9000A remove_all_body358A5E3B0132 "ModelElement::clearPresentation"
                }

                /** returns the number of Presentations.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A size_head358A5E3B0132 "ModelElement::sizePresentation"
                public int sizePresentation()
                // -end- 362409A9000A size_head358A5E3B0132 "ModelElement::sizePresentation"
                {
                  // -beg- preserve=no 362409A9000A size_body358A5E3B0132 "ModelElement::sizePresentation"
                  return super.sizePresentation();
                  // -end- 362409A9000A size_body358A5E3B0132 "ModelElement::sizePresentation"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 362409A9000A _link_body358A5E3B0132 "ModelElement::_linkPresentation"
                public void _linkPresentation(PresentationElement presentation1)
                {
                  super._linkPresentation(presentation1);
                }
                // -end- 362409A9000A _link_body358A5E3B0132 "ModelElement::_linkPresentation"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 362409A9000A _unlink_body358A5E3B0132 "ModelElement::_unlinkPresentation"
                public void _unlinkPresentation(PresentationElement presentation1)
                {
                  super._unlinkPresentation(presentation1);
                }
                // -end- 362409A9000A _unlink_body358A5E3B0132 "ModelElement::_unlinkPresentation"

                // -beg- preserve=no 3C16416801D0 var358A5E3B0132 "isProxy"
                private boolean isProxy;
                // -end- 3C16416801D0 var358A5E3B0132 "isProxy"

                /** get current value of isProxy
                 *  true if this is not an actual definition, but a placeholder, so that references can point to something
                 *  @see #setProxy
                 */
                // -beg- preserve=no 3C16416801D0 get_head358A5E3B0132 "isProxy"
                public  boolean isProxy()
                // -end- 3C16416801D0 get_head358A5E3B0132 "isProxy"
                {
                  // -beg- preserve=no 3C16416801D0 get_body358A5E3B0132 "isProxy"
                  return isProxy;
                  // -end- 3C16416801D0 get_body358A5E3B0132 "isProxy"
                }

                /** set current value of isProxy
                 *  @see #isProxy
                 */
                // -beg- preserve=no 3C16416801D0 set_head358A5E3B0132 "isProxy"
                public  void setProxy(boolean value1)
                // -end- 3C16416801D0 set_head358A5E3B0132 "isProxy"
                {
                  // -beg- preserve=no 3C16416801D0 set_body358A5E3B0132 "isProxy"
                  if(isProxy != value1){
                    isProxy = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setProxy"));
                  }
                  // -end- 3C16416801D0 set_body358A5E3B0132 "isProxy"
                }

                // -beg- preserve=no 327A877801CC var358A5E3B0132 "isRoot"
                private boolean isRoot;
                // -end- 327A877801CC var358A5E3B0132 "isRoot"

                /** get current value of isRoot
                 *  @see #setRoot
                 */
                // -beg- preserve=no 327A877801CC get_head358A5E3B0132 "isRoot"
                public  boolean isRoot()
                // -end- 327A877801CC get_head358A5E3B0132 "isRoot"
                {
                  // -beg- preserve=no 327A877801CC get_body358A5E3B0132 "isRoot"
                  return isRoot;
                  // -end- 327A877801CC get_body358A5E3B0132 "isRoot"
                }

                /** set current value of isRoot
                 *  @see #isRoot
                 */
                // -beg- preserve=no 327A877801CC set_head358A5E3B0132 "isRoot"
                public  void setRoot(boolean value1)
                // -end- 327A877801CC set_head358A5E3B0132 "isRoot"
                {
                  // -beg- preserve=no 327A877801CC set_body358A5E3B0132 "isRoot"
                  if(isRoot != value1){
                    isRoot = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRoot"));
                  }
                  // -end- 327A877801CC set_body358A5E3B0132 "isRoot"
                }

                // -beg- preserve=no 327A877E006E var358A5E3B0132 "isLeaf"
                private boolean isLeaf;
                // -end- 327A877E006E var358A5E3B0132 "isLeaf"

                /** get current value of isLeaf
                 *  @see #setLeaf
                 */
                // -beg- preserve=no 327A877E006E get_head358A5E3B0132 "isLeaf"
                public  boolean isLeaf()
                // -end- 327A877E006E get_head358A5E3B0132 "isLeaf"
                {
                  // -beg- preserve=no 327A877E006E get_body358A5E3B0132 "isLeaf"
                  return isLeaf;
                  // -end- 327A877E006E get_body358A5E3B0132 "isLeaf"
                }

                /** set current value of isLeaf
                 *  @see #isLeaf
                 */
                // -beg- preserve=no 327A877E006E set_head358A5E3B0132 "isLeaf"
                public  void setLeaf(boolean value1)
                // -end- 327A877E006E set_head358A5E3B0132 "isLeaf"
                {
                  // -beg- preserve=no 327A877E006E set_body358A5E3B0132 "isLeaf"
                  if(isLeaf != value1){
                    isLeaf = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLeaf"));
                  }
                  // -end- 327A877E006E set_body358A5E3B0132 "isLeaf"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A5E3B0132 detail_end "TopicDef"

                // -end- 358A5E3B0132 detail_end "TopicDef"

              }

