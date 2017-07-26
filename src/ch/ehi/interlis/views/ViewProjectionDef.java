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


          // -beg- preserve=no 3940F0250373 package "ViewProjectionDef"
package ch.ehi.interlis.views;
          // -end- 3940F0250373 package "ViewProjectionDef"

          // -beg- preserve=no 3940F0250373 autoimport "ViewProjectionDef"
          import ch.ehi.interlis.views.ViewableDef;
          import ch.ehi.interlis.IliSyntax;
          import ch.ehi.uml1_4.implementation.AbstractModelElement;
          import ch.ehi.uml1_4.foundation.core.Namespace;
          import ch.ehi.uml1_4.foundation.core.ElementOwnership;
          import ch.ehi.interlis.views.ProjectionAttributes;
          import ch.ehi.interlis.constraints.ConstraintDef;
          import ch.ehi.basics.types.NlsString;
          import ch.ehi.basics.tools.AbstractVisitor;
          import ch.ehi.uml1_4.foundation.core.Dependency;
          import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
          import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
          import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
          import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
          import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
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
          // -end- 3940F0250373 autoimport "ViewProjectionDef"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3940F0250373 import "ViewProjectionDef"

          // -end- 3940F0250373 import "ViewProjectionDef"

          /** Definiert eine Projektion.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:40 $
           */
public class ViewProjectionDef extends AbstractModelElement implements ViewableDef , IliSyntax , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3940F0250373 detail_begin "ViewProjectionDef"

            // -end- 3940F0250373 detail_begin "ViewProjectionDef"

            // -beg- preserve=no 3D4FA2180347 head3940F0250373 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2180347 head3940F0250373 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180347 throws3940F0250373 "unlinkAll"

              // -end- 3D4FA2180347 throws3940F0250373 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180347 body3940F0250373 "unlinkAll"
              
              detachNamespace();
              // Role ViewProjectionDef: ViewProjectionDef object(s) may point to this
              detach_extends();
              detachBasedon();
              detachProjectionAttributes();
              clearConstraintDef();
              setName(null);
              setMetaAttrb(null);
              // Role AttributePath: AttributePath object(s) may point to this
              // Role RenamedViewableRef: RenamedViewableRef object(s) may point to this
              // Role GraphicDef: GraphicDef object(s) may point to this
              clearSupplierDependency();
              setSyntax(null);
              clearBehavior();
              clearPartition();
              clearCollaboration();
              clearClassifierRole();
              clearCollaborationInstanceSet();
              clearClientDependency();
              clearTaggedValue();
              clearConstraint();
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
              // -end- 3D4FA2180347 body3940F0250373 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2180351 head3940F0250373 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2180351 head3940F0250373 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180351 throws3940F0250373 "enumerateChildren"

              // -end- 3D4FA2180351 throws3940F0250373 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180351 body3940F0250373 "enumerateChildren"
              java.util.Iterator it=null;
              if(contains_extends())visitor.visit(get_extends());
              if(containsBasedon())visitor.visit(getBasedon());
              if(containsProjectionAttributes())visitor.visit(getProjectionAttributes());
              it=iteratorConstraintDef();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getName());
              visitor.visit(getMetaAttrb());
              visitor.visit(getSyntax());
              it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getDocumentation());
              super.enumerateChildren(visitor);
              // -end- 3D4FA2180351 body3940F0250373 "enumerateChildren"
              }

            // -beg- preserve=no 33598CAA030E code3940F0250373 "namespace"

            // -end- 33598CAA030E code3940F0250373 "namespace"

            /** attaches a Namespace.
             *  Designates the Namespace that contains the ModelElement.
             *  @see #detachNamespace
             *  @see #getNamespace
             *  @see #containsNamespace
             *  @see #getNamespaceLink
             *  @see #createNamespaceLink
             */
            // -beg- preserve=no 33598CAA030E attach_head3940F0250373 "ModelElement::attachNamespace"
            public void attachNamespace(Namespace namespace1)
            // -end- 33598CAA030E attach_head3940F0250373 "ModelElement::attachNamespace"
            {
              // -beg- preserve=no 33598CAA030E attach_body3940F0250373 "ModelElement::attachNamespace"
              super.attachNamespace(namespace1);
              // -end- 33598CAA030E attach_body3940F0250373 "ModelElement::attachNamespace"
            }

            /** attaches a link to a Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E attachlink_head3940F0250373 "ModelElement::attachNamespaceLink"
            public void attachNamespaceLink(ElementOwnership namespace1)
            // -end- 33598CAA030E attachlink_head3940F0250373 "ModelElement::attachNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E attachlink_body3940F0250373 "ModelElement::attachNamespaceLink"
              super.attachNamespaceLink(namespace1);
              // -end- 33598CAA030E attachlink_body3940F0250373 "ModelElement::attachNamespaceLink"
            }

            /** disconnect the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E detach_head3940F0250373 "ModelElement::detachNamespace"
            public Namespace detachNamespace()
            // -end- 33598CAA030E detach_head3940F0250373 "ModelElement::detachNamespace"
            {
              // -beg- preserve=no 33598CAA030E detach_body3940F0250373 "ModelElement::detachNamespace"
              return super.detachNamespace();
              // -end- 33598CAA030E detach_body3940F0250373 "ModelElement::detachNamespace"
            }

            /** get the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E get_head3940F0250373 "ModelElement::getNamespace"
            public Namespace getNamespace()
            // -end- 33598CAA030E get_head3940F0250373 "ModelElement::getNamespace"
            {
              // -beg- preserve=no 33598CAA030E get_body3940F0250373 "ModelElement::getNamespace"
              return super.getNamespace();
              // -end- 33598CAA030E get_body3940F0250373 "ModelElement::getNamespace"
            }

            /** get the link class of currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E getlink_head3940F0250373 "ModelElement::getNamespaceLink"
            public ElementOwnership getNamespaceLink()
            // -end- 33598CAA030E getlink_head3940F0250373 "ModelElement::getNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E getlink_body3940F0250373 "ModelElement::getNamespaceLink"
              return super.getNamespaceLink();
              // -end- 33598CAA030E getlink_body3940F0250373 "ModelElement::getNamespaceLink"
            }

            /** create a link class for a new link to a Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E createlink_head3940F0250373 "ModelElement::createNamespaceLink"
            public ElementOwnership createNamespaceLink()
            // -end- 33598CAA030E createlink_head3940F0250373 "ModelElement::createNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E createlink_body3940F0250373 "ModelElement::createNamespaceLink"
              return super.createNamespaceLink();
              // -end- 33598CAA030E createlink_body3940F0250373 "ModelElement::createNamespaceLink"
            }

            /** tests if there is a Namespace attached.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E test_head3940F0250373 "ModelElement::containsNamespace"
            public boolean containsNamespace()
            // -end- 33598CAA030E test_head3940F0250373 "ModelElement::containsNamespace"
            {
              // -beg- preserve=no 33598CAA030E test_body3940F0250373 "ModelElement::containsNamespace"
              return super.containsNamespace();
              // -end- 33598CAA030E test_body3940F0250373 "ModelElement::containsNamespace"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 33598CAA030E _link_body3940F0250373 "ModelElement::_linkNamespace"
            public void _linkNamespace(ElementOwnership namespace1)
            {
              super._linkNamespace(namespace1);
            }
            // -end- 33598CAA030E _link_body3940F0250373 "ModelElement::_linkNamespace"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 33598CAA030E _unlink_body3940F0250373 "ModelElement::_unlinkNamespace"
            public void _unlinkNamespace(ElementOwnership namespace1)
            {
              super._unlinkNamespace(namespace1);
            }
            // -end- 33598CAA030E _unlink_body3940F0250373 "ModelElement::_unlinkNamespace"

            // -beg- preserve=no 39619F940033 code3940F0250373 "_extends"
            private ViewProjectionDef _extends;
            // -end- 39619F940033 code3940F0250373 "_extends"

            /** attaches a _extends.
             *  
             *  @see #detach_extends
             *  @see #get_extends
             *  @see #contains_extends
             */
            // -beg- preserve=no 39619F940033 attach_head3940F0250373 "ViewProjectionDef::attach_extends"
            public void attach_extends(ViewProjectionDef _extends1)
            // -end- 39619F940033 attach_head3940F0250373 "ViewProjectionDef::attach_extends"
            {
              // -beg- preserve=no 39619F940033 attach_body3940F0250373 "ViewProjectionDef::attach_extends"
              if(_extends!=null) {throw new java.lang.IllegalStateException("already a _extends attached");}
              if(_extends1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as _extends");}
              _extends = _extends1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attach_extends"));
              return;
              // -end- 39619F940033 attach_body3940F0250373 "ViewProjectionDef::attach_extends"
            }

            /** disconnect the currently attached _extends.
             *  @see #attach_extends
             */
            // -beg- preserve=no 39619F940033 detach_head3940F0250373 "ViewProjectionDef::detach_extends"
            public ViewProjectionDef detach_extends()
            // -end- 39619F940033 detach_head3940F0250373 "ViewProjectionDef::detach_extends"
            {
              // -beg- preserve=no 39619F940033 detach_body3940F0250373 "ViewProjectionDef::detach_extends"
              ViewProjectionDef ret = null;
              ret = _extends;
              _extends = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detach_extends"));
              return ret;
              // -end- 39619F940033 detach_body3940F0250373 "ViewProjectionDef::detach_extends"
            }

            /** get the currently attached _extends.
             *  @see #attach_extends
             */
            // -beg- preserve=no 39619F940033 get_head3940F0250373 "ViewProjectionDef::get_extends"
            public ViewProjectionDef get_extends()
            // -end- 39619F940033 get_head3940F0250373 "ViewProjectionDef::get_extends"
            {
              // -beg- preserve=no 39619F940033 get_body3940F0250373 "ViewProjectionDef::get_extends"
              if(_extends==null) {throw new java.lang.IllegalStateException("no _extends attached");}
              return _extends;
              // -end- 39619F940033 get_body3940F0250373 "ViewProjectionDef::get_extends"
            }

            /** tests if there is a _extends attached.
             *  @see #attach_extends
             */
            // -beg- preserve=no 39619F940033 test_head3940F0250373 "ViewProjectionDef::contains_extends"
            public boolean contains_extends()
            // -end- 39619F940033 test_head3940F0250373 "ViewProjectionDef::contains_extends"
            {
              // -beg- preserve=no 39619F940033 test_body3940F0250373 "ViewProjectionDef::contains_extends"
              return _extends!=null;
              // -end- 39619F940033 test_body3940F0250373 "ViewProjectionDef::contains_extends"
            }

            // -beg- preserve=no 39619FA50024 code3940F0250373 "basedon"
            private ViewableDef basedon;
            // -end- 39619FA50024 code3940F0250373 "basedon"

            /** attaches a Basedon.
             *  
             *  @see #detachBasedon
             *  @see #getBasedon
             *  @see #containsBasedon
             */
            // -beg- preserve=no 39619FA50024 attach_head3940F0250373 "ViewProjectionDef::attachBasedon"
            public void attachBasedon(ViewableDef basedon1)
            // -end- 39619FA50024 attach_head3940F0250373 "ViewProjectionDef::attachBasedon"
            {
              // -beg- preserve=no 39619FA50024 attach_body3940F0250373 "ViewProjectionDef::attachBasedon"
              if(basedon!=null) {throw new java.lang.IllegalStateException("already a basedon attached");}
              if(basedon1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as basedon");}
              basedon = basedon1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachBasedon"));
              return;
              // -end- 39619FA50024 attach_body3940F0250373 "ViewProjectionDef::attachBasedon"
            }

            /** disconnect the currently attached Basedon.
             *  @see #attachBasedon
             */
            // -beg- preserve=no 39619FA50024 detach_head3940F0250373 "ViewProjectionDef::detachBasedon"
            public ViewableDef detachBasedon()
            // -end- 39619FA50024 detach_head3940F0250373 "ViewProjectionDef::detachBasedon"
            {
              // -beg- preserve=no 39619FA50024 detach_body3940F0250373 "ViewProjectionDef::detachBasedon"
              ViewableDef ret = null;
              ret = basedon;
              basedon = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachBasedon"));
              return ret;
              // -end- 39619FA50024 detach_body3940F0250373 "ViewProjectionDef::detachBasedon"
            }

            /** get the currently attached Basedon.
             *  @see #attachBasedon
             */
            // -beg- preserve=no 39619FA50024 get_head3940F0250373 "ViewProjectionDef::getBasedon"
            public ViewableDef getBasedon()
            // -end- 39619FA50024 get_head3940F0250373 "ViewProjectionDef::getBasedon"
            {
              // -beg- preserve=no 39619FA50024 get_body3940F0250373 "ViewProjectionDef::getBasedon"
              if(basedon==null) {throw new java.lang.IllegalStateException("no basedon attached");}
              return basedon;
              // -end- 39619FA50024 get_body3940F0250373 "ViewProjectionDef::getBasedon"
            }

            /** tests if there is a Basedon attached.
             *  @see #attachBasedon
             */
            // -beg- preserve=no 39619FA50024 test_head3940F0250373 "ViewProjectionDef::containsBasedon"
            public boolean containsBasedon()
            // -end- 39619FA50024 test_head3940F0250373 "ViewProjectionDef::containsBasedon"
            {
              // -beg- preserve=no 39619FA50024 test_body3940F0250373 "ViewProjectionDef::containsBasedon"
              return basedon!=null;
              // -end- 39619FA50024 test_body3940F0250373 "ViewProjectionDef::containsBasedon"
            }

            // -beg- preserve=no 3961A08D005A code3940F0250373 "projectionAttributes"
            private ProjectionAttributes projectionAttributes;
            // -end- 3961A08D005A code3940F0250373 "projectionAttributes"

            /** attaches a ProjectionAttributes.
             *  
             *  @see #detachProjectionAttributes
             *  @see #getProjectionAttributes
             *  @see #containsProjectionAttributes
             */
            // -beg- preserve=no 3961A08D005A attach_head3940F0250373 "ViewProjectionDef::attachProjectionAttributes"
            public void attachProjectionAttributes(ProjectionAttributes projectionAttributes1)
            // -end- 3961A08D005A attach_head3940F0250373 "ViewProjectionDef::attachProjectionAttributes"
            {
              // -beg- preserve=no 3961A08D005A attach_body3940F0250373 "ViewProjectionDef::attachProjectionAttributes"
              if(projectionAttributes!=null) {throw new java.lang.IllegalStateException("already a projectionAttributes attached");}
              if(projectionAttributes1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as projectionAttributes");}
              projectionAttributes = projectionAttributes1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachProjectionAttributes"));
              return;
              // -end- 3961A08D005A attach_body3940F0250373 "ViewProjectionDef::attachProjectionAttributes"
            }

            /** disconnect the currently attached ProjectionAttributes.
             *  @see #attachProjectionAttributes
             */
            // -beg- preserve=no 3961A08D005A detach_head3940F0250373 "ViewProjectionDef::detachProjectionAttributes"
            public ProjectionAttributes detachProjectionAttributes()
            // -end- 3961A08D005A detach_head3940F0250373 "ViewProjectionDef::detachProjectionAttributes"
            {
              // -beg- preserve=no 3961A08D005A detach_body3940F0250373 "ViewProjectionDef::detachProjectionAttributes"
              ProjectionAttributes ret = null;
              ret = projectionAttributes;
              projectionAttributes = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachProjectionAttributes"));
              return ret;
              // -end- 3961A08D005A detach_body3940F0250373 "ViewProjectionDef::detachProjectionAttributes"
            }

            /** get the currently attached ProjectionAttributes.
             *  @see #attachProjectionAttributes
             */
            // -beg- preserve=no 3961A08D005A get_head3940F0250373 "ViewProjectionDef::getProjectionAttributes"
            public ProjectionAttributes getProjectionAttributes()
            // -end- 3961A08D005A get_head3940F0250373 "ViewProjectionDef::getProjectionAttributes"
            {
              // -beg- preserve=no 3961A08D005A get_body3940F0250373 "ViewProjectionDef::getProjectionAttributes"
              if(projectionAttributes==null) {throw new java.lang.IllegalStateException("no projectionAttributes attached");}
              return projectionAttributes;
              // -end- 3961A08D005A get_body3940F0250373 "ViewProjectionDef::getProjectionAttributes"
            }

            /** tests if there is a ProjectionAttributes attached.
             *  @see #attachProjectionAttributes
             */
            // -beg- preserve=no 3961A08D005A test_head3940F0250373 "ViewProjectionDef::containsProjectionAttributes"
            public boolean containsProjectionAttributes()
            // -end- 3961A08D005A test_head3940F0250373 "ViewProjectionDef::containsProjectionAttributes"
            {
              // -beg- preserve=no 3961A08D005A test_body3940F0250373 "ViewProjectionDef::containsProjectionAttributes"
              return projectionAttributes!=null;
              // -end- 3961A08D005A test_body3940F0250373 "ViewProjectionDef::containsProjectionAttributes"
            }

            // -beg- preserve=no 3961A09D0279 code3940F0250373 "constraintDef"
            private java.util.Set constraintDef = new java.util.HashSet();
            // -end- 3961A09D0279 code3940F0250373 "constraintDef"

            /** add a ConstraintDef.
             *  
             *  @see #removeConstraintDef
             *  @see #containsConstraintDef
             *  @see #iteratorConstraintDef
             *  @see #clearConstraintDef
             *  @see #sizeConstraintDef
             */
            // -beg- preserve=no 3961A09D0279 add_head3940F0250373 "ViewProjectionDef::addConstraintDef"
            public void addConstraintDef(ConstraintDef constraintDef1)
            // -end- 3961A09D0279 add_head3940F0250373 "ViewProjectionDef::addConstraintDef"
            {
              // -beg- preserve=no 3961A09D0279 add_body3940F0250373 "ViewProjectionDef::addConstraintDef"
              constraintDef.add(constraintDef1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addConstraintDef"));
              return;
              // -end- 3961A09D0279 add_body3940F0250373 "ViewProjectionDef::addConstraintDef"
            }

            /** disconnect a ConstraintDef.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961A09D0279 remove_head3940F0250373 "ViewProjectionDef::removeConstraintDef"
            public ConstraintDef removeConstraintDef(ConstraintDef constraintDef1)
            // -end- 3961A09D0279 remove_head3940F0250373 "ViewProjectionDef::removeConstraintDef"
            {
              // -beg- preserve=no 3961A09D0279 remove_body3940F0250373 "ViewProjectionDef::removeConstraintDef"
              ConstraintDef ret=null;
              if(constraintDef1==null || !constraintDef.contains(constraintDef1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = constraintDef1;
              constraintDef.remove(constraintDef1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeConstraintDef"));
              return ret;
              // -end- 3961A09D0279 remove_body3940F0250373 "ViewProjectionDef::removeConstraintDef"
            }

            /** tests if a given ConstraintDef is connected.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961A09D0279 test_head3940F0250373 "ViewProjectionDef::containsConstraintDef"
            public boolean containsConstraintDef(ConstraintDef constraintDef1)
            // -end- 3961A09D0279 test_head3940F0250373 "ViewProjectionDef::containsConstraintDef"
            {
              // -beg- preserve=no 3961A09D0279 test_body3940F0250373 "ViewProjectionDef::containsConstraintDef"
              return constraintDef.contains(constraintDef1);
              // -end- 3961A09D0279 test_body3940F0250373 "ViewProjectionDef::containsConstraintDef"
            }

            /** used to enumerate all connected ConstraintDefs.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961A09D0279 get_all_head3940F0250373 "ViewProjectionDef::iteratorConstraintDef"
            public java.util.Iterator iteratorConstraintDef()
            // -end- 3961A09D0279 get_all_head3940F0250373 "ViewProjectionDef::iteratorConstraintDef"
            {
              // -beg- preserve=no 3961A09D0279 get_all_body3940F0250373 "ViewProjectionDef::iteratorConstraintDef"
              return constraintDef.iterator();
              // -end- 3961A09D0279 get_all_body3940F0250373 "ViewProjectionDef::iteratorConstraintDef"
            }

            /** disconnect all ConstraintDefs.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961A09D0279 remove_all_head3940F0250373 "ViewProjectionDef::clearConstraintDef"
            public void clearConstraintDef()
            // -end- 3961A09D0279 remove_all_head3940F0250373 "ViewProjectionDef::clearConstraintDef"
            {
              // -beg- preserve=no 3961A09D0279 remove_all_body3940F0250373 "ViewProjectionDef::clearConstraintDef"
              if(sizeConstraintDef()>0){
                constraintDef.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearConstraintDef"));
              }
              // -end- 3961A09D0279 remove_all_body3940F0250373 "ViewProjectionDef::clearConstraintDef"
            }

            /** returns the number of ConstraintDefs.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961A09D0279 size_head3940F0250373 "ViewProjectionDef::sizeConstraintDef"
            public int sizeConstraintDef()
            // -end- 3961A09D0279 size_head3940F0250373 "ViewProjectionDef::sizeConstraintDef"
            {
              // -beg- preserve=no 3961A09D0279 size_body3940F0250373 "ViewProjectionDef::sizeConstraintDef"
              return constraintDef.size();
              // -end- 3961A09D0279 size_body3940F0250373 "ViewProjectionDef::sizeConstraintDef"
            }

            // -beg- preserve=no 39619EEE02C0 var3940F0250373 "name"

            // -end- 39619EEE02C0 var3940F0250373 "name"

            /** get current value of name
             *  Name der Projektion.
             *  @see #setName
             */
            // -beg- preserve=no 39619EEE02C0 get_head3940F0250373 "name"
            public  NlsString getName()
            // -end- 39619EEE02C0 get_head3940F0250373 "name"
            {
              // -beg- preserve=no 39619EEE02C0 get_body3940F0250373 "name"
              return super.getName();
              // -end- 39619EEE02C0 get_body3940F0250373 "name"
            }

            /** set current value of name
             *  @see #getName
             */
            // -beg- preserve=no 39619EEE02C0 set_head3940F0250373 "name"
            public  void setName(NlsString value1)
            // -end- 39619EEE02C0 set_head3940F0250373 "name"
            {
              // -beg- preserve=no 39619EEE02C0 set_body3940F0250373 "name"
              super.setName(value1);
              // -end- 39619EEE02C0 set_body3940F0250373 "name"
            }

            // -beg- preserve=no 39619EF200B3 var3940F0250373 "properties"
            private long properties;
            // -end- 39619EF200B3 var3940F0250373 "properties"

            /** get current value of properties
             *  Definiert die Erweiterungsmöglichkeiten der Projektion.
             *  @see #setProperties
             */
            // -beg- preserve=no 39619EF200B3 get_head3940F0250373 "properties"
            public  long getProperties()
            // -end- 39619EF200B3 get_head3940F0250373 "properties"
            {
              // -beg- preserve=no 39619EF200B3 get_body3940F0250373 "properties"
              return properties;
              // -end- 39619EF200B3 get_body3940F0250373 "properties"
            }

            /** set current value of properties
             *  @see #getProperties
             */
            // -beg- preserve=no 39619EF200B3 set_head3940F0250373 "properties"
            public  void setProperties(long value1)
            // -end- 39619EF200B3 set_head3940F0250373 "properties"
            {
              // -beg- preserve=no 39619EF200B3 set_body3940F0250373 "properties"
              if(properties != value1){
                properties = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setProperties"));
              }
              // -end- 39619EF200B3 set_body3940F0250373 "properties"
            }

            // -beg- preserve=no 335C0D7A02A8 code3940F0250373 "supplierDependency"

            // -end- 335C0D7A02A8 code3940F0250373 "supplierDependency"

            /** add a SupplierDependency.
             *  
             *  @see #removeSupplierDependency
             *  @see #containsSupplierDependency
             *  @see #iteratorSupplierDependency
             *  @see #clearSupplierDependency
             *  @see #sizeSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 add_head3940F0250373 "ModelElement::addSupplierDependency"
            public void addSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 add_head3940F0250373 "ModelElement::addSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 add_body3940F0250373 "ModelElement::addSupplierDependency"
              super.addSupplierDependency(supplierDependency1);
              // -end- 335C0D7A02A8 add_body3940F0250373 "ModelElement::addSupplierDependency"
            }

            /** disconnect a SupplierDependency.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 remove_head3940F0250373 "ModelElement::removeSupplierDependency"
            public Dependency removeSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 remove_head3940F0250373 "ModelElement::removeSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 remove_body3940F0250373 "ModelElement::removeSupplierDependency"
              return super.removeSupplierDependency(supplierDependency1);
              // -end- 335C0D7A02A8 remove_body3940F0250373 "ModelElement::removeSupplierDependency"
            }

            /** tests if a given SupplierDependency is connected.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 test_head3940F0250373 "ModelElement::containsSupplierDependency"
            public boolean containsSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 test_head3940F0250373 "ModelElement::containsSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 test_body3940F0250373 "ModelElement::containsSupplierDependency"
              return super.containsSupplierDependency(supplierDependency1);
              // -end- 335C0D7A02A8 test_body3940F0250373 "ModelElement::containsSupplierDependency"
            }

            /** used to enumerate all connected SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 get_all_head3940F0250373 "ModelElement::iteratorSupplierDependency"
            public java.util.Iterator iteratorSupplierDependency()
            // -end- 335C0D7A02A8 get_all_head3940F0250373 "ModelElement::iteratorSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 get_all_body3940F0250373 "ModelElement::iteratorSupplierDependency"
              return super.iteratorSupplierDependency();
              // -end- 335C0D7A02A8 get_all_body3940F0250373 "ModelElement::iteratorSupplierDependency"
            }

            /** disconnect all SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 remove_all_head3940F0250373 "ModelElement::clearSupplierDependency"
            public void clearSupplierDependency()
            // -end- 335C0D7A02A8 remove_all_head3940F0250373 "ModelElement::clearSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 remove_all_body3940F0250373 "ModelElement::clearSupplierDependency"
              super.clearSupplierDependency();
              // -end- 335C0D7A02A8 remove_all_body3940F0250373 "ModelElement::clearSupplierDependency"
            }

            /** returns the number of SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 size_head3940F0250373 "ModelElement::sizeSupplierDependency"
            public int sizeSupplierDependency()
            // -end- 335C0D7A02A8 size_head3940F0250373 "ModelElement::sizeSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 size_body3940F0250373 "ModelElement::sizeSupplierDependency"
              return super.sizeSupplierDependency();
              // -end- 335C0D7A02A8 size_body3940F0250373 "ModelElement::sizeSupplierDependency"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C0D7A02A8 _link_body3940F0250373 "ModelElement::_linkSupplierDependency"
            public void _linkSupplierDependency(Dependency supplierDependency1)
            {
              super._linkSupplierDependency(supplierDependency1);
            }
            // -end- 335C0D7A02A8 _link_body3940F0250373 "ModelElement::_linkSupplierDependency"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C0D7A02A8 _unlink_body3940F0250373 "ModelElement::_unlinkSupplierDependency"
            public void _unlinkSupplierDependency(Dependency supplierDependency1)
            {
              super._unlinkSupplierDependency(supplierDependency1);
            }
            // -end- 335C0D7A02A8 _unlink_body3940F0250373 "ModelElement::_unlinkSupplierDependency"

            // -beg- preserve=no 3C8F5ABE022D var3940F0250373 "syntax"
            private NlsString syntax = null;
            // -end- 3C8F5ABE022D var3940F0250373 "syntax"

            /** get current value of syntax
             *  the actual definition of the model element in valid INTERLIS syntax.
             *  @see #setSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D get_head3940F0250373 "syntax"
            public  NlsString getSyntax()
            // -end- 3C8F5ABE022D get_head3940F0250373 "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D get_body3940F0250373 "syntax"
              return syntax;
              // -end- 3C8F5ABE022D get_body3940F0250373 "syntax"
            }

            /** set current value of syntax
             *  @see #getSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D set_head3940F0250373 "syntax"
            public  void setSyntax(NlsString value1)
            // -end- 3C8F5ABE022D set_head3940F0250373 "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D set_body3940F0250373 "syntax"
              if(syntax!=value1 && (syntax==null || !syntax.equals(value1))){
                syntax = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
              }
              // -end- 3C8F5ABE022D set_body3940F0250373 "syntax"
            }

            public NlsString getMetaAttrb(){
            	return super.getMetaAttrb();
             }
             
             public void setMetaAttrb(NlsString value) {
            	 super.setMettaAttrb(value);	
             }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3940F0250373 detail_end "ViewProjectionDef"

            // -end- 3940F0250373 detail_end "ViewProjectionDef"

          }

