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


          // -beg- preserve=no 3947A91501AA package "GraphicParameterDef"
package ch.ehi.interlis.graphicdescriptions;
          // -end- 3947A91501AA package "GraphicParameterDef"

          // -beg- preserve=no 3947A91501AA autoimport "GraphicParameterDef"
          import ch.ehi.uml1_4.foundation.core.ModelElement;
          import ch.ehi.interlis.IliSyntax;
          import ch.ehi.uml1_4.implementation.AbstractModelElement;
          import ch.ehi.interlis.attributes.DomainAttribute;
          import ch.ehi.uml1_4.foundation.core.Namespace;
          import ch.ehi.uml1_4.foundation.core.ElementOwnership;
          import ch.ehi.basics.types.NlsString;
          import ch.ehi.basics.tools.AbstractVisitor;
          import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
          import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
          import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
          import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
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
          // -end- 3947A91501AA autoimport "GraphicParameterDef"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3947A91501AA import "GraphicParameterDef"

          // -end- 3947A91501AA import "GraphicParameterDef"

          /** Definiert einen Parameter fuer eine grafische Darstellung.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:56 $
           */
public class GraphicParameterDef extends AbstractModelElement implements ModelElement , IliSyntax , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3947A91501AA detail_begin "GraphicParameterDef"

            // -end- 3947A91501AA detail_begin "GraphicParameterDef"

            // -beg- preserve=no 3D4FA219004F head3947A91501AA "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA219004F head3947A91501AA "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA219004F throws3947A91501AA "unlinkAll"

              // -end- 3D4FA219004F throws3947A91501AA "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA219004F body3947A91501AA "unlinkAll"
              
              // Role FactElement: FactElement object(s) may point to this
              detachDomainAttribute();
              detachNamespace();
              setName(null);
              clearBehavior();
              clearPartition();
              clearCollaboration();
              clearClassifierRole();
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
              setSyntax(null);
              setDocumentation(null);
              super.unlinkAll();
              // -end- 3D4FA219004F body3947A91501AA "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2190059 head3947A91501AA "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2190059 head3947A91501AA "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2190059 throws3947A91501AA "enumerateChildren"

              // -end- 3D4FA2190059 throws3947A91501AA "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2190059 body3947A91501AA "enumerateChildren"
              java.util.Iterator it=null;
              if(containsDomainAttribute())visitor.visit(getDomainAttribute());
              visitor.visit(getName());
              it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getSyntax());
              visitor.visit(getDocumentation());
              super.enumerateChildren(visitor);
              // -end- 3D4FA2190059 body3947A91501AA "enumerateChildren"
              }

            // -beg- preserve=no 396202860334 code3947A91501AA "domainAttribute"
            private DomainAttribute domainAttribute;
            // -end- 396202860334 code3947A91501AA "domainAttribute"

            /** attaches a DomainAttribute.
             *  
             *  @see #detachDomainAttribute
             *  @see #getDomainAttribute
             *  @see #containsDomainAttribute
             */
            // -beg- preserve=no 396202860334 attach_head3947A91501AA "GraphicParameterDef::attachDomainAttribute"
            public void attachDomainAttribute(DomainAttribute domainAttribute1)
            // -end- 396202860334 attach_head3947A91501AA "GraphicParameterDef::attachDomainAttribute"
            {
              // -beg- preserve=no 396202860334 attach_body3947A91501AA "GraphicParameterDef::attachDomainAttribute"
              if(domainAttribute!=null) {throw new java.lang.IllegalStateException("already a domainAttribute attached");}
              if(domainAttribute1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as domainAttribute");}
              domainAttribute = domainAttribute1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDomainAttribute"));
              return;
              // -end- 396202860334 attach_body3947A91501AA "GraphicParameterDef::attachDomainAttribute"
            }

            /** disconnect the currently attached DomainAttribute.
             *  @see #attachDomainAttribute
             */
            // -beg- preserve=no 396202860334 detach_head3947A91501AA "GraphicParameterDef::detachDomainAttribute"
            public DomainAttribute detachDomainAttribute()
            // -end- 396202860334 detach_head3947A91501AA "GraphicParameterDef::detachDomainAttribute"
            {
              // -beg- preserve=no 396202860334 detach_body3947A91501AA "GraphicParameterDef::detachDomainAttribute"
              DomainAttribute ret = null;
              ret = domainAttribute;
              domainAttribute = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDomainAttribute"));
              return ret;
              // -end- 396202860334 detach_body3947A91501AA "GraphicParameterDef::detachDomainAttribute"
            }

            /** get the currently attached DomainAttribute.
             *  @see #attachDomainAttribute
             */
            // -beg- preserve=no 396202860334 get_head3947A91501AA "GraphicParameterDef::getDomainAttribute"
            public DomainAttribute getDomainAttribute()
            // -end- 396202860334 get_head3947A91501AA "GraphicParameterDef::getDomainAttribute"
            {
              // -beg- preserve=no 396202860334 get_body3947A91501AA "GraphicParameterDef::getDomainAttribute"
              if(domainAttribute==null) {throw new java.lang.IllegalStateException("no domainAttribute attached");}
              return domainAttribute;
              // -end- 396202860334 get_body3947A91501AA "GraphicParameterDef::getDomainAttribute"
            }

            /** tests if there is a DomainAttribute attached.
             *  @see #attachDomainAttribute
             */
            // -beg- preserve=no 396202860334 test_head3947A91501AA "GraphicParameterDef::containsDomainAttribute"
            public boolean containsDomainAttribute()
            // -end- 396202860334 test_head3947A91501AA "GraphicParameterDef::containsDomainAttribute"
            {
              // -beg- preserve=no 396202860334 test_body3947A91501AA "GraphicParameterDef::containsDomainAttribute"
              return domainAttribute!=null;
              // -end- 396202860334 test_body3947A91501AA "GraphicParameterDef::containsDomainAttribute"
            }

            // -beg- preserve=no 33598CAA030E code3947A91501AA "namespace"

            // -end- 33598CAA030E code3947A91501AA "namespace"

            /** attaches a Namespace.
             *  Designates the Namespace that contains the ModelElement.
             *  @see #detachNamespace
             *  @see #getNamespace
             *  @see #containsNamespace
             *  @see #getNamespaceLink
             *  @see #createNamespaceLink
             */
            // -beg- preserve=no 33598CAA030E attach_head3947A91501AA "ModelElement::attachNamespace"
            public void attachNamespace(Namespace namespace1)
            // -end- 33598CAA030E attach_head3947A91501AA "ModelElement::attachNamespace"
            {
              // -beg- preserve=no 33598CAA030E attach_body3947A91501AA "ModelElement::attachNamespace"
              super.attachNamespace(namespace1);
              // -end- 33598CAA030E attach_body3947A91501AA "ModelElement::attachNamespace"
            }

            /** attaches a link to a Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E attachlink_head3947A91501AA "ModelElement::attachNamespaceLink"
            public void attachNamespaceLink(ElementOwnership namespace1)
            // -end- 33598CAA030E attachlink_head3947A91501AA "ModelElement::attachNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E attachlink_body3947A91501AA "ModelElement::attachNamespaceLink"
              super.attachNamespaceLink(namespace1);
              // -end- 33598CAA030E attachlink_body3947A91501AA "ModelElement::attachNamespaceLink"
            }

            /** disconnect the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E detach_head3947A91501AA "ModelElement::detachNamespace"
            public Namespace detachNamespace()
            // -end- 33598CAA030E detach_head3947A91501AA "ModelElement::detachNamespace"
            {
              // -beg- preserve=no 33598CAA030E detach_body3947A91501AA "ModelElement::detachNamespace"
              return super.detachNamespace();
              // -end- 33598CAA030E detach_body3947A91501AA "ModelElement::detachNamespace"
            }

            /** get the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E get_head3947A91501AA "ModelElement::getNamespace"
            public Namespace getNamespace()
            // -end- 33598CAA030E get_head3947A91501AA "ModelElement::getNamespace"
            {
              // -beg- preserve=no 33598CAA030E get_body3947A91501AA "ModelElement::getNamespace"
              return super.getNamespace();
              // -end- 33598CAA030E get_body3947A91501AA "ModelElement::getNamespace"
            }

            /** get the link class of currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E getlink_head3947A91501AA "ModelElement::getNamespaceLink"
            public ElementOwnership getNamespaceLink()
            // -end- 33598CAA030E getlink_head3947A91501AA "ModelElement::getNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E getlink_body3947A91501AA "ModelElement::getNamespaceLink"
              return super.getNamespaceLink();
              // -end- 33598CAA030E getlink_body3947A91501AA "ModelElement::getNamespaceLink"
            }

            /** create a link class for a new link to a Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E createlink_head3947A91501AA "ModelElement::createNamespaceLink"
            public ElementOwnership createNamespaceLink()
            // -end- 33598CAA030E createlink_head3947A91501AA "ModelElement::createNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E createlink_body3947A91501AA "ModelElement::createNamespaceLink"
              return super.createNamespaceLink();
              // -end- 33598CAA030E createlink_body3947A91501AA "ModelElement::createNamespaceLink"
            }

            /** tests if there is a Namespace attached.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E test_head3947A91501AA "ModelElement::containsNamespace"
            public boolean containsNamespace()
            // -end- 33598CAA030E test_head3947A91501AA "ModelElement::containsNamespace"
            {
              // -beg- preserve=no 33598CAA030E test_body3947A91501AA "ModelElement::containsNamespace"
              return super.containsNamespace();
              // -end- 33598CAA030E test_body3947A91501AA "ModelElement::containsNamespace"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 33598CAA030E _link_body3947A91501AA "ModelElement::_linkNamespace"
            public void _linkNamespace(ElementOwnership namespace1)
            {
              super._linkNamespace(namespace1);
            }
            // -end- 33598CAA030E _link_body3947A91501AA "ModelElement::_linkNamespace"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 33598CAA030E _unlink_body3947A91501AA "ModelElement::_unlinkNamespace"
            public void _unlinkNamespace(ElementOwnership namespace1)
            {
              super._unlinkNamespace(namespace1);
            }
            // -end- 33598CAA030E _unlink_body3947A91501AA "ModelElement::_unlinkNamespace"

            // -beg- preserve=no 39620268010A var3947A91501AA "name"

            // -end- 39620268010A var3947A91501AA "name"

            /** get current value of name
             *  Name des Grafikparameters.
             *  @see #setName
             */
            // -beg- preserve=no 39620268010A get_head3947A91501AA "name"
            public  NlsString getName()
            // -end- 39620268010A get_head3947A91501AA "name"
            {
              // -beg- preserve=no 39620268010A get_body3947A91501AA "name"
              return super.getName();
              // -end- 39620268010A get_body3947A91501AA "name"
            }

            /** set current value of name
             *  @see #getName
             */
            // -beg- preserve=no 39620268010A set_head3947A91501AA "name"
            public  void setName(NlsString value1)
            // -end- 39620268010A set_head3947A91501AA "name"
            {
              // -beg- preserve=no 39620268010A set_body3947A91501AA "name"
              super.setName(value1);
              // -end- 39620268010A set_body3947A91501AA "name"
            }

            // -beg- preserve=no 3C8F5ABE022D var3947A91501AA "syntax"
            private NlsString syntax = null;
            // -end- 3C8F5ABE022D var3947A91501AA "syntax"

            /** get current value of syntax
             *  the actual definition of the model element in valid INTERLIS syntax.
             *  @see #setSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D get_head3947A91501AA "syntax"
            public  NlsString getSyntax()
            // -end- 3C8F5ABE022D get_head3947A91501AA "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D get_body3947A91501AA "syntax"
              return syntax;
              // -end- 3C8F5ABE022D get_body3947A91501AA "syntax"
            }

            /** set current value of syntax
             *  @see #getSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D set_head3947A91501AA "syntax"
            public  void setSyntax(NlsString value1)
            // -end- 3C8F5ABE022D set_head3947A91501AA "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D set_body3947A91501AA "syntax"
              if(syntax!=value1 && (syntax==null || !syntax.equals(value1))){
                syntax = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
              }
              // -end- 3C8F5ABE022D set_body3947A91501AA "syntax"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3947A91501AA detail_end "GraphicParameterDef"

            // -end- 3947A91501AA detail_end "GraphicParameterDef"

          }

