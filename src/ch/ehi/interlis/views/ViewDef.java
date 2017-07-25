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


          // -beg- preserve=no 3940EF380079 package "ViewDef"
package ch.ehi.interlis.views;
          // -end- 3940EF380079 package "ViewDef"

          // -beg- preserve=no 3940EF380079 autoimport "ViewDef"
          import ch.ehi.interlis.views.ViewableDef;
          import ch.ehi.interlis.IliSyntax;
          import ch.ehi.uml1_4.implementation.AbstractModelElement;
          import ch.ehi.uml1_4.foundation.core.Namespace;
          import ch.ehi.uml1_4.foundation.core.ElementOwnership;
          import ch.ehi.interlis.views.RenamedViewableRef;
          import ch.ehi.interlis.logicalexpressions.Term;
          import ch.ehi.interlis.views.ProjectionAttributes;
          import ch.ehi.interlis.constraints.ConstraintDef;
          import ch.ehi.basics.types.NlsString;
          import ch.ehi.interlis.views.ViewDefKind;
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
          // -end- 3940EF380079 autoimport "ViewDef"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3940EF380079 import "ViewDef"

          // -end- 3940EF380079 import "ViewDef"

          /** Definiert eine Sicht.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:36 $
           */
public class ViewDef extends AbstractModelElement implements ViewableDef , IliSyntax , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3940EF380079 detail_begin "ViewDef"

            // -end- 3940EF380079 detail_begin "ViewDef"

            // -beg- preserve=no 3D4FA21802D9 head3940EF380079 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21802D9 head3940EF380079 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21802D9 throws3940EF380079 "unlinkAll"

              // -end- 3D4FA21802D9 throws3940EF380079 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21802D9 body3940EF380079 "unlinkAll"
              
              detachNamespace();
              detachSelectionview();
              clearJoin();
              clearIliunion();
              detachDecomposition();
              clearSelection();
              detachProjectionAttributes();
              clearConstraintDef();
              setName(null);
              setMetaAttrb(null);
              setCompositionAttr(null);
              // Role AttributePath: AttributePath object(s) may point to this
              // Role RenamedViewableRef: RenamedViewableRef object(s) may point to this
              // Role ViewProjectionDef: ViewProjectionDef object(s) may point to this
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
              // -end- 3D4FA21802D9 body3940EF380079 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21802E3 head3940EF380079 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21802E3 head3940EF380079 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21802E3 throws3940EF380079 "enumerateChildren"

              // -end- 3D4FA21802E3 throws3940EF380079 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21802E3 body3940EF380079 "enumerateChildren"
              java.util.Iterator it=null;
              if(containsSelectionview())visitor.visit(getSelectionview());
              it=iteratorJoin();while(it.hasNext())visitor.visit(it.next());
              it=iteratorIliunion();while(it.hasNext())visitor.visit(it.next());
              if(containsDecomposition())visitor.visit(getDecomposition());
              it=iteratorSelection();while(it.hasNext())visitor.visit(it.next());
              if(containsProjectionAttributes())visitor.visit(getProjectionAttributes());
              it=iteratorConstraintDef();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getName());
              visitor.visit(getCompositionAttr());
              visitor.visit(getSyntax());
              it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getDocumentation());
              super.enumerateChildren(visitor);
              // -end- 3D4FA21802E3 body3940EF380079 "enumerateChildren"
              }

            // -beg- preserve=no 33598CAA030E code3940EF380079 "namespace"

            // -end- 33598CAA030E code3940EF380079 "namespace"

            /** attaches a Namespace.
             *  Designates the Namespace that contains the ModelElement.
             *  @see #detachNamespace
             *  @see #getNamespace
             *  @see #containsNamespace
             *  @see #getNamespaceLink
             *  @see #createNamespaceLink
             */
            // -beg- preserve=no 33598CAA030E attach_head3940EF380079 "ModelElement::attachNamespace"
            public void attachNamespace(Namespace namespace1)
            // -end- 33598CAA030E attach_head3940EF380079 "ModelElement::attachNamespace"
            {
              // -beg- preserve=no 33598CAA030E attach_body3940EF380079 "ModelElement::attachNamespace"
              super.attachNamespace(namespace1);
              // -end- 33598CAA030E attach_body3940EF380079 "ModelElement::attachNamespace"
            }

            /** attaches a link to a Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E attachlink_head3940EF380079 "ModelElement::attachNamespaceLink"
            public void attachNamespaceLink(ElementOwnership namespace1)
            // -end- 33598CAA030E attachlink_head3940EF380079 "ModelElement::attachNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E attachlink_body3940EF380079 "ModelElement::attachNamespaceLink"
              super.attachNamespaceLink(namespace1);
              // -end- 33598CAA030E attachlink_body3940EF380079 "ModelElement::attachNamespaceLink"
            }

            /** disconnect the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E detach_head3940EF380079 "ModelElement::detachNamespace"
            public Namespace detachNamespace()
            // -end- 33598CAA030E detach_head3940EF380079 "ModelElement::detachNamespace"
            {
              // -beg- preserve=no 33598CAA030E detach_body3940EF380079 "ModelElement::detachNamespace"
              return super.detachNamespace();
              // -end- 33598CAA030E detach_body3940EF380079 "ModelElement::detachNamespace"
            }

            /** get the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E get_head3940EF380079 "ModelElement::getNamespace"
            public Namespace getNamespace()
            // -end- 33598CAA030E get_head3940EF380079 "ModelElement::getNamespace"
            {
              // -beg- preserve=no 33598CAA030E get_body3940EF380079 "ModelElement::getNamespace"
              return super.getNamespace();
              // -end- 33598CAA030E get_body3940EF380079 "ModelElement::getNamespace"
            }

            /** get the link class of currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E getlink_head3940EF380079 "ModelElement::getNamespaceLink"
            public ElementOwnership getNamespaceLink()
            // -end- 33598CAA030E getlink_head3940EF380079 "ModelElement::getNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E getlink_body3940EF380079 "ModelElement::getNamespaceLink"
              return super.getNamespaceLink();
              // -end- 33598CAA030E getlink_body3940EF380079 "ModelElement::getNamespaceLink"
            }

            /** create a link class for a new link to a Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E createlink_head3940EF380079 "ModelElement::createNamespaceLink"
            public ElementOwnership createNamespaceLink()
            // -end- 33598CAA030E createlink_head3940EF380079 "ModelElement::createNamespaceLink"
            {
              // -beg- preserve=no 33598CAA030E createlink_body3940EF380079 "ModelElement::createNamespaceLink"
              return super.createNamespaceLink();
              // -end- 33598CAA030E createlink_body3940EF380079 "ModelElement::createNamespaceLink"
            }

            /** tests if there is a Namespace attached.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 33598CAA030E test_head3940EF380079 "ModelElement::containsNamespace"
            public boolean containsNamespace()
            // -end- 33598CAA030E test_head3940EF380079 "ModelElement::containsNamespace"
            {
              // -beg- preserve=no 33598CAA030E test_body3940EF380079 "ModelElement::containsNamespace"
              return super.containsNamespace();
              // -end- 33598CAA030E test_body3940EF380079 "ModelElement::containsNamespace"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 33598CAA030E _link_body3940EF380079 "ModelElement::_linkNamespace"
            public void _linkNamespace(ElementOwnership namespace1)
            {
              super._linkNamespace(namespace1);
            }
            // -end- 33598CAA030E _link_body3940EF380079 "ModelElement::_linkNamespace"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 33598CAA030E _unlink_body3940EF380079 "ModelElement::_unlinkNamespace"
            public void _unlinkNamespace(ElementOwnership namespace1)
            {
              super._unlinkNamespace(namespace1);
            }
            // -end- 33598CAA030E _unlink_body3940EF380079 "ModelElement::_unlinkNamespace"

            // -beg- preserve=no 396192690203 code3940EF380079 "selectionview"
            private RenamedViewableRef selectionview;
            // -end- 396192690203 code3940EF380079 "selectionview"

            /** attaches a Selectionview.
             *  
             *  @see #detachSelectionview
             *  @see #getSelectionview
             *  @see #containsSelectionview
             */
            // -beg- preserve=no 396192690203 attach_head3940EF380079 "ViewDef::attachSelectionview"
            public void attachSelectionview(RenamedViewableRef selectionview1)
            // -end- 396192690203 attach_head3940EF380079 "ViewDef::attachSelectionview"
            {
              // -beg- preserve=no 396192690203 attach_body3940EF380079 "ViewDef::attachSelectionview"
              if(selectionview!=null) {throw new java.lang.IllegalStateException("already a selectionview attached");}
              if(selectionview1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as selectionview");}
              selectionview = selectionview1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachSelectionview"));
              return;
              // -end- 396192690203 attach_body3940EF380079 "ViewDef::attachSelectionview"
            }

            /** disconnect the currently attached Selectionview.
             *  @see #attachSelectionview
             */
            // -beg- preserve=no 396192690203 detach_head3940EF380079 "ViewDef::detachSelectionview"
            public RenamedViewableRef detachSelectionview()
            // -end- 396192690203 detach_head3940EF380079 "ViewDef::detachSelectionview"
            {
              // -beg- preserve=no 396192690203 detach_body3940EF380079 "ViewDef::detachSelectionview"
              RenamedViewableRef ret = null;
              ret = selectionview;
              selectionview = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachSelectionview"));
              return ret;
              // -end- 396192690203 detach_body3940EF380079 "ViewDef::detachSelectionview"
            }

            /** get the currently attached Selectionview.
             *  @see #attachSelectionview
             */
            // -beg- preserve=no 396192690203 get_head3940EF380079 "ViewDef::getSelectionview"
            public RenamedViewableRef getSelectionview()
            // -end- 396192690203 get_head3940EF380079 "ViewDef::getSelectionview"
            {
              // -beg- preserve=no 396192690203 get_body3940EF380079 "ViewDef::getSelectionview"
              if(selectionview==null) {throw new java.lang.IllegalStateException("no selectionview attached");}
              return selectionview;
              // -end- 396192690203 get_body3940EF380079 "ViewDef::getSelectionview"
            }

            /** tests if there is a Selectionview attached.
             *  @see #attachSelectionview
             */
            // -beg- preserve=no 396192690203 test_head3940EF380079 "ViewDef::containsSelectionview"
            public boolean containsSelectionview()
            // -end- 396192690203 test_head3940EF380079 "ViewDef::containsSelectionview"
            {
              // -beg- preserve=no 396192690203 test_body3940EF380079 "ViewDef::containsSelectionview"
              return selectionview!=null;
              // -end- 396192690203 test_body3940EF380079 "ViewDef::containsSelectionview"
            }

            // -beg- preserve=no 396193160049 code3940EF380079 "join"
            private java.util.Set join = new java.util.HashSet();
            // -end- 396193160049 code3940EF380079 "join"

            /** add a Join.
             *  
             *  @see #removeJoin
             *  @see #containsJoin
             *  @see #iteratorJoin
             *  @see #clearJoin
             *  @see #sizeJoin
             */
            // -beg- preserve=no 396193160049 add_head3940EF380079 "ViewDef::addJoin"
            public void addJoin(RenamedViewableRef join1)
            // -end- 396193160049 add_head3940EF380079 "ViewDef::addJoin"
            {
              // -beg- preserve=no 396193160049 add_body3940EF380079 "ViewDef::addJoin"
              join.add(join1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addJoin"));
              return;
              // -end- 396193160049 add_body3940EF380079 "ViewDef::addJoin"
            }

            /** disconnect a Join.
             *  @see #addJoin
             */
            // -beg- preserve=no 396193160049 remove_head3940EF380079 "ViewDef::removeJoin"
            public RenamedViewableRef removeJoin(RenamedViewableRef join1)
            // -end- 396193160049 remove_head3940EF380079 "ViewDef::removeJoin"
            {
              // -beg- preserve=no 396193160049 remove_body3940EF380079 "ViewDef::removeJoin"
              RenamedViewableRef ret=null;
              if(join1==null || !join.contains(join1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = join1;
              join.remove(join1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeJoin"));
              return ret;
              // -end- 396193160049 remove_body3940EF380079 "ViewDef::removeJoin"
            }

            /** tests if a given Join is connected.
             *  @see #addJoin
             */
            // -beg- preserve=no 396193160049 test_head3940EF380079 "ViewDef::containsJoin"
            public boolean containsJoin(RenamedViewableRef join1)
            // -end- 396193160049 test_head3940EF380079 "ViewDef::containsJoin"
            {
              // -beg- preserve=no 396193160049 test_body3940EF380079 "ViewDef::containsJoin"
              return join.contains(join1);
              // -end- 396193160049 test_body3940EF380079 "ViewDef::containsJoin"
            }

            /** used to enumerate all connected Joins.
             *  @see #addJoin
             */
            // -beg- preserve=no 396193160049 get_all_head3940EF380079 "ViewDef::iteratorJoin"
            public java.util.Iterator iteratorJoin()
            // -end- 396193160049 get_all_head3940EF380079 "ViewDef::iteratorJoin"
            {
              // -beg- preserve=no 396193160049 get_all_body3940EF380079 "ViewDef::iteratorJoin"
              return join.iterator();
              // -end- 396193160049 get_all_body3940EF380079 "ViewDef::iteratorJoin"
            }

            /** disconnect all Joins.
             *  @see #addJoin
             */
            // -beg- preserve=no 396193160049 remove_all_head3940EF380079 "ViewDef::clearJoin"
            public void clearJoin()
            // -end- 396193160049 remove_all_head3940EF380079 "ViewDef::clearJoin"
            {
              // -beg- preserve=no 396193160049 remove_all_body3940EF380079 "ViewDef::clearJoin"
              if(sizeJoin()>0){
                join.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearJoin"));
              }
              // -end- 396193160049 remove_all_body3940EF380079 "ViewDef::clearJoin"
            }

            /** returns the number of Joins.
             *  @see #addJoin
             */
            // -beg- preserve=no 396193160049 size_head3940EF380079 "ViewDef::sizeJoin"
            public int sizeJoin()
            // -end- 396193160049 size_head3940EF380079 "ViewDef::sizeJoin"
            {
              // -beg- preserve=no 396193160049 size_body3940EF380079 "ViewDef::sizeJoin"
              return join.size();
              // -end- 396193160049 size_body3940EF380079 "ViewDef::sizeJoin"
            }

            // -beg- preserve=no 3961937303DC code3940EF380079 "iliunion"
            private java.util.Set iliunion = new java.util.HashSet();
            // -end- 3961937303DC code3940EF380079 "iliunion"

            /** add a Iliunion.
             *  
             *  @see #removeIliunion
             *  @see #containsIliunion
             *  @see #iteratorIliunion
             *  @see #clearIliunion
             *  @see #sizeIliunion
             */
            // -beg- preserve=no 3961937303DC add_head3940EF380079 "ViewDef::addIliunion"
            public void addIliunion(RenamedViewableRef iliunion1)
            // -end- 3961937303DC add_head3940EF380079 "ViewDef::addIliunion"
            {
              // -beg- preserve=no 3961937303DC add_body3940EF380079 "ViewDef::addIliunion"
              iliunion.add(iliunion1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addIliunion"));
              return;
              // -end- 3961937303DC add_body3940EF380079 "ViewDef::addIliunion"
            }

            /** disconnect a Iliunion.
             *  @see #addIliunion
             */
            // -beg- preserve=no 3961937303DC remove_head3940EF380079 "ViewDef::removeIliunion"
            public RenamedViewableRef removeIliunion(RenamedViewableRef iliunion1)
            // -end- 3961937303DC remove_head3940EF380079 "ViewDef::removeIliunion"
            {
              // -beg- preserve=no 3961937303DC remove_body3940EF380079 "ViewDef::removeIliunion"
              RenamedViewableRef ret=null;
              if(iliunion1==null || !iliunion.contains(iliunion1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = iliunion1;
              iliunion.remove(iliunion1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeIliunion"));
              return ret;
              // -end- 3961937303DC remove_body3940EF380079 "ViewDef::removeIliunion"
            }

            /** tests if a given Iliunion is connected.
             *  @see #addIliunion
             */
            // -beg- preserve=no 3961937303DC test_head3940EF380079 "ViewDef::containsIliunion"
            public boolean containsIliunion(RenamedViewableRef iliunion1)
            // -end- 3961937303DC test_head3940EF380079 "ViewDef::containsIliunion"
            {
              // -beg- preserve=no 3961937303DC test_body3940EF380079 "ViewDef::containsIliunion"
              return iliunion.contains(iliunion1);
              // -end- 3961937303DC test_body3940EF380079 "ViewDef::containsIliunion"
            }

            /** used to enumerate all connected Iliunions.
             *  @see #addIliunion
             */
            // -beg- preserve=no 3961937303DC get_all_head3940EF380079 "ViewDef::iteratorIliunion"
            public java.util.Iterator iteratorIliunion()
            // -end- 3961937303DC get_all_head3940EF380079 "ViewDef::iteratorIliunion"
            {
              // -beg- preserve=no 3961937303DC get_all_body3940EF380079 "ViewDef::iteratorIliunion"
              return iliunion.iterator();
              // -end- 3961937303DC get_all_body3940EF380079 "ViewDef::iteratorIliunion"
            }

            /** disconnect all Iliunions.
             *  @see #addIliunion
             */
            // -beg- preserve=no 3961937303DC remove_all_head3940EF380079 "ViewDef::clearIliunion"
            public void clearIliunion()
            // -end- 3961937303DC remove_all_head3940EF380079 "ViewDef::clearIliunion"
            {
              // -beg- preserve=no 3961937303DC remove_all_body3940EF380079 "ViewDef::clearIliunion"
              if(sizeIliunion()>0){
                iliunion.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearIliunion"));
              }
              // -end- 3961937303DC remove_all_body3940EF380079 "ViewDef::clearIliunion"
            }

            /** returns the number of Iliunions.
             *  @see #addIliunion
             */
            // -beg- preserve=no 3961937303DC size_head3940EF380079 "ViewDef::sizeIliunion"
            public int sizeIliunion()
            // -end- 3961937303DC size_head3940EF380079 "ViewDef::sizeIliunion"
            {
              // -beg- preserve=no 3961937303DC size_body3940EF380079 "ViewDef::sizeIliunion"
              return iliunion.size();
              // -end- 3961937303DC size_body3940EF380079 "ViewDef::sizeIliunion"
            }

            // -beg- preserve=no 396194AC03AA code3940EF380079 "decomposition"
            private RenamedViewableRef decomposition;
            // -end- 396194AC03AA code3940EF380079 "decomposition"

            /** attaches a Decomposition.
             *  
             *  @see #detachDecomposition
             *  @see #getDecomposition
             *  @see #containsDecomposition
             */
            // -beg- preserve=no 396194AC03AA attach_head3940EF380079 "ViewDef::attachDecomposition"
            public void attachDecomposition(RenamedViewableRef decomposition1)
            // -end- 396194AC03AA attach_head3940EF380079 "ViewDef::attachDecomposition"
            {
              // -beg- preserve=no 396194AC03AA attach_body3940EF380079 "ViewDef::attachDecomposition"
              if(decomposition!=null) {throw new java.lang.IllegalStateException("already a decomposition attached");}
              if(decomposition1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as decomposition");}
              decomposition = decomposition1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDecomposition"));
              return;
              // -end- 396194AC03AA attach_body3940EF380079 "ViewDef::attachDecomposition"
            }

            /** disconnect the currently attached Decomposition.
             *  @see #attachDecomposition
             */
            // -beg- preserve=no 396194AC03AA detach_head3940EF380079 "ViewDef::detachDecomposition"
            public RenamedViewableRef detachDecomposition()
            // -end- 396194AC03AA detach_head3940EF380079 "ViewDef::detachDecomposition"
            {
              // -beg- preserve=no 396194AC03AA detach_body3940EF380079 "ViewDef::detachDecomposition"
              RenamedViewableRef ret = null;
              ret = decomposition;
              decomposition = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDecomposition"));
              return ret;
              // -end- 396194AC03AA detach_body3940EF380079 "ViewDef::detachDecomposition"
            }

            /** get the currently attached Decomposition.
             *  @see #attachDecomposition
             */
            // -beg- preserve=no 396194AC03AA get_head3940EF380079 "ViewDef::getDecomposition"
            public RenamedViewableRef getDecomposition()
            // -end- 396194AC03AA get_head3940EF380079 "ViewDef::getDecomposition"
            {
              // -beg- preserve=no 396194AC03AA get_body3940EF380079 "ViewDef::getDecomposition"
              if(decomposition==null) {throw new java.lang.IllegalStateException("no decomposition attached");}
              return decomposition;
              // -end- 396194AC03AA get_body3940EF380079 "ViewDef::getDecomposition"
            }

            /** tests if there is a Decomposition attached.
             *  @see #attachDecomposition
             */
            // -beg- preserve=no 396194AC03AA test_head3940EF380079 "ViewDef::containsDecomposition"
            public boolean containsDecomposition()
            // -end- 396194AC03AA test_head3940EF380079 "ViewDef::containsDecomposition"
            {
              // -beg- preserve=no 396194AC03AA test_body3940EF380079 "ViewDef::containsDecomposition"
              return decomposition!=null;
              // -end- 396194AC03AA test_body3940EF380079 "ViewDef::containsDecomposition"
            }

            // -beg- preserve=no 3961971202BD code3940EF380079 "selection"
            private java.util.Set selection = new java.util.HashSet();
            // -end- 3961971202BD code3940EF380079 "selection"

            /** add a Selection.
             *  
             *  @see #removeSelection
             *  @see #containsSelection
             *  @see #iteratorSelection
             *  @see #clearSelection
             *  @see #sizeSelection
             */
            // -beg- preserve=no 3961971202BD add_head3940EF380079 "ViewDef::addSelection"
            public void addSelection(Term selection1)
            // -end- 3961971202BD add_head3940EF380079 "ViewDef::addSelection"
            {
              // -beg- preserve=no 3961971202BD add_body3940EF380079 "ViewDef::addSelection"
              selection.add(selection1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSelection"));
              return;
              // -end- 3961971202BD add_body3940EF380079 "ViewDef::addSelection"
            }

            /** disconnect a Selection.
             *  @see #addSelection
             */
            // -beg- preserve=no 3961971202BD remove_head3940EF380079 "ViewDef::removeSelection"
            public Term removeSelection(Term selection1)
            // -end- 3961971202BD remove_head3940EF380079 "ViewDef::removeSelection"
            {
              // -beg- preserve=no 3961971202BD remove_body3940EF380079 "ViewDef::removeSelection"
              Term ret=null;
              if(selection1==null || !selection.contains(selection1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = selection1;
              selection.remove(selection1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSelection"));
              return ret;
              // -end- 3961971202BD remove_body3940EF380079 "ViewDef::removeSelection"
            }

            /** tests if a given Selection is connected.
             *  @see #addSelection
             */
            // -beg- preserve=no 3961971202BD test_head3940EF380079 "ViewDef::containsSelection"
            public boolean containsSelection(Term selection1)
            // -end- 3961971202BD test_head3940EF380079 "ViewDef::containsSelection"
            {
              // -beg- preserve=no 3961971202BD test_body3940EF380079 "ViewDef::containsSelection"
              return selection.contains(selection1);
              // -end- 3961971202BD test_body3940EF380079 "ViewDef::containsSelection"
            }

            /** used to enumerate all connected Selections.
             *  @see #addSelection
             */
            // -beg- preserve=no 3961971202BD get_all_head3940EF380079 "ViewDef::iteratorSelection"
            public java.util.Iterator iteratorSelection()
            // -end- 3961971202BD get_all_head3940EF380079 "ViewDef::iteratorSelection"
            {
              // -beg- preserve=no 3961971202BD get_all_body3940EF380079 "ViewDef::iteratorSelection"
              return selection.iterator();
              // -end- 3961971202BD get_all_body3940EF380079 "ViewDef::iteratorSelection"
            }

            /** disconnect all Selections.
             *  @see #addSelection
             */
            // -beg- preserve=no 3961971202BD remove_all_head3940EF380079 "ViewDef::clearSelection"
            public void clearSelection()
            // -end- 3961971202BD remove_all_head3940EF380079 "ViewDef::clearSelection"
            {
              // -beg- preserve=no 3961971202BD remove_all_body3940EF380079 "ViewDef::clearSelection"
              if(sizeSelection()>0){
                selection.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSelection"));
              }
              // -end- 3961971202BD remove_all_body3940EF380079 "ViewDef::clearSelection"
            }

            /** returns the number of Selections.
             *  @see #addSelection
             */
            // -beg- preserve=no 3961971202BD size_head3940EF380079 "ViewDef::sizeSelection"
            public int sizeSelection()
            // -end- 3961971202BD size_head3940EF380079 "ViewDef::sizeSelection"
            {
              // -beg- preserve=no 3961971202BD size_body3940EF380079 "ViewDef::sizeSelection"
              return selection.size();
              // -end- 3961971202BD size_body3940EF380079 "ViewDef::sizeSelection"
            }

            // -beg- preserve=no 396197D200ED code3940EF380079 "projectionAttributes"
            private ProjectionAttributes projectionAttributes;
            // -end- 396197D200ED code3940EF380079 "projectionAttributes"

            /** attaches a ProjectionAttributes.
             *  
             *  @see #detachProjectionAttributes
             *  @see #getProjectionAttributes
             *  @see #containsProjectionAttributes
             */
            // -beg- preserve=no 396197D200ED attach_head3940EF380079 "ViewDef::attachProjectionAttributes"
            public void attachProjectionAttributes(ProjectionAttributes projectionAttributes1)
            // -end- 396197D200ED attach_head3940EF380079 "ViewDef::attachProjectionAttributes"
            {
              // -beg- preserve=no 396197D200ED attach_body3940EF380079 "ViewDef::attachProjectionAttributes"
              if(projectionAttributes!=null) {throw new java.lang.IllegalStateException("already a projectionAttributes attached");}
              if(projectionAttributes1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as projectionAttributes");}
              projectionAttributes = projectionAttributes1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachProjectionAttributes"));
              return;
              // -end- 396197D200ED attach_body3940EF380079 "ViewDef::attachProjectionAttributes"
            }

            /** disconnect the currently attached ProjectionAttributes.
             *  @see #attachProjectionAttributes
             */
            // -beg- preserve=no 396197D200ED detach_head3940EF380079 "ViewDef::detachProjectionAttributes"
            public ProjectionAttributes detachProjectionAttributes()
            // -end- 396197D200ED detach_head3940EF380079 "ViewDef::detachProjectionAttributes"
            {
              // -beg- preserve=no 396197D200ED detach_body3940EF380079 "ViewDef::detachProjectionAttributes"
              ProjectionAttributes ret = null;
              ret = projectionAttributes;
              projectionAttributes = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachProjectionAttributes"));
              return ret;
              // -end- 396197D200ED detach_body3940EF380079 "ViewDef::detachProjectionAttributes"
            }

            /** get the currently attached ProjectionAttributes.
             *  @see #attachProjectionAttributes
             */
            // -beg- preserve=no 396197D200ED get_head3940EF380079 "ViewDef::getProjectionAttributes"
            public ProjectionAttributes getProjectionAttributes()
            // -end- 396197D200ED get_head3940EF380079 "ViewDef::getProjectionAttributes"
            {
              // -beg- preserve=no 396197D200ED get_body3940EF380079 "ViewDef::getProjectionAttributes"
              if(projectionAttributes==null) {throw new java.lang.IllegalStateException("no projectionAttributes attached");}
              return projectionAttributes;
              // -end- 396197D200ED get_body3940EF380079 "ViewDef::getProjectionAttributes"
            }

            /** tests if there is a ProjectionAttributes attached.
             *  @see #attachProjectionAttributes
             */
            // -beg- preserve=no 396197D200ED test_head3940EF380079 "ViewDef::containsProjectionAttributes"
            public boolean containsProjectionAttributes()
            // -end- 396197D200ED test_head3940EF380079 "ViewDef::containsProjectionAttributes"
            {
              // -beg- preserve=no 396197D200ED test_body3940EF380079 "ViewDef::containsProjectionAttributes"
              return projectionAttributes!=null;
              // -end- 396197D200ED test_body3940EF380079 "ViewDef::containsProjectionAttributes"
            }

            // -beg- preserve=no 3961986F0304 code3940EF380079 "constraintDef"
            private java.util.Set constraintDef = new java.util.HashSet();
            // -end- 3961986F0304 code3940EF380079 "constraintDef"

            /** add a ConstraintDef.
             *  
             *  @see #removeConstraintDef
             *  @see #containsConstraintDef
             *  @see #iteratorConstraintDef
             *  @see #clearConstraintDef
             *  @see #sizeConstraintDef
             */
            // -beg- preserve=no 3961986F0304 add_head3940EF380079 "ViewDef::addConstraintDef"
            public void addConstraintDef(ConstraintDef constraintDef1)
            // -end- 3961986F0304 add_head3940EF380079 "ViewDef::addConstraintDef"
            {
              // -beg- preserve=no 3961986F0304 add_body3940EF380079 "ViewDef::addConstraintDef"
              constraintDef.add(constraintDef1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addConstraintDef"));
              return;
              // -end- 3961986F0304 add_body3940EF380079 "ViewDef::addConstraintDef"
            }

            /** disconnect a ConstraintDef.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961986F0304 remove_head3940EF380079 "ViewDef::removeConstraintDef"
            public ConstraintDef removeConstraintDef(ConstraintDef constraintDef1)
            // -end- 3961986F0304 remove_head3940EF380079 "ViewDef::removeConstraintDef"
            {
              // -beg- preserve=no 3961986F0304 remove_body3940EF380079 "ViewDef::removeConstraintDef"
              ConstraintDef ret=null;
              if(constraintDef1==null || !constraintDef.contains(constraintDef1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = constraintDef1;
              constraintDef.remove(constraintDef1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeConstraintDef"));
              return ret;
              // -end- 3961986F0304 remove_body3940EF380079 "ViewDef::removeConstraintDef"
            }

            /** tests if a given ConstraintDef is connected.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961986F0304 test_head3940EF380079 "ViewDef::containsConstraintDef"
            public boolean containsConstraintDef(ConstraintDef constraintDef1)
            // -end- 3961986F0304 test_head3940EF380079 "ViewDef::containsConstraintDef"
            {
              // -beg- preserve=no 3961986F0304 test_body3940EF380079 "ViewDef::containsConstraintDef"
              return constraintDef.contains(constraintDef1);
              // -end- 3961986F0304 test_body3940EF380079 "ViewDef::containsConstraintDef"
            }

            /** used to enumerate all connected ConstraintDefs.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961986F0304 get_all_head3940EF380079 "ViewDef::iteratorConstraintDef"
            public java.util.Iterator iteratorConstraintDef()
            // -end- 3961986F0304 get_all_head3940EF380079 "ViewDef::iteratorConstraintDef"
            {
              // -beg- preserve=no 3961986F0304 get_all_body3940EF380079 "ViewDef::iteratorConstraintDef"
              return constraintDef.iterator();
              // -end- 3961986F0304 get_all_body3940EF380079 "ViewDef::iteratorConstraintDef"
            }

            /** disconnect all ConstraintDefs.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961986F0304 remove_all_head3940EF380079 "ViewDef::clearConstraintDef"
            public void clearConstraintDef()
            // -end- 3961986F0304 remove_all_head3940EF380079 "ViewDef::clearConstraintDef"
            {
              // -beg- preserve=no 3961986F0304 remove_all_body3940EF380079 "ViewDef::clearConstraintDef"
              if(sizeConstraintDef()>0){
                constraintDef.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearConstraintDef"));
              }
              // -end- 3961986F0304 remove_all_body3940EF380079 "ViewDef::clearConstraintDef"
            }

            /** returns the number of ConstraintDefs.
             *  @see #addConstraintDef
             */
            // -beg- preserve=no 3961986F0304 size_head3940EF380079 "ViewDef::sizeConstraintDef"
            public int sizeConstraintDef()
            // -end- 3961986F0304 size_head3940EF380079 "ViewDef::sizeConstraintDef"
            {
              // -beg- preserve=no 3961986F0304 size_body3940EF380079 "ViewDef::sizeConstraintDef"
              return constraintDef.size();
              // -end- 3961986F0304 size_body3940EF380079 "ViewDef::sizeConstraintDef"
            }

            // -beg- preserve=no 396191E502FD var3940EF380079 "name"

            // -end- 396191E502FD var3940EF380079 "name"

            /** get current value of name
             *  Name der Sicht.
             *  @see #setName
             */
            // -beg- preserve=no 396191E502FD get_head3940EF380079 "name"
            public  NlsString getName()
            // -end- 396191E502FD get_head3940EF380079 "name"
            {
              // -beg- preserve=no 396191E502FD get_body3940EF380079 "name"
              return super.getName();
              // -end- 396191E502FD get_body3940EF380079 "name"
            }

            /** set current value of name
             *  @see #getName
             */
            // -beg- preserve=no 396191E502FD set_head3940EF380079 "name"
            public  void setName(NlsString value1)
            // -end- 396191E502FD set_head3940EF380079 "name"
            {
              // -beg- preserve=no 396191E502FD set_body3940EF380079 "name"
              super.setName(value1);
              // -end- 396191E502FD set_body3940EF380079 "name"
            }

            // -beg- preserve=no 396191E903C1 var3940EF380079 "kind"
            private int kind;
            // -end- 396191E903C1 var3940EF380079 "kind"

            /** get current value of kind
             *  SELECTION, JOIN, UNION, DECOMPOSITION oder AREADECOMPOSITION
             *  @see ch.ehi.interlis.views.ViewDefKind
             *  @see #setKind
             */
            // -beg- preserve=no 396191E903C1 get_head3940EF380079 "kind"
            public  int getKind()
            // -end- 396191E903C1 get_head3940EF380079 "kind"
            {
              // -beg- preserve=no 396191E903C1 get_body3940EF380079 "kind"
              return kind;
              // -end- 396191E903C1 get_body3940EF380079 "kind"
            }

            /** set current value of kind
             *  @see ch.ehi.interlis.views.ViewDefKind
             *  @see #getKind
             */
            // -beg- preserve=no 396191E903C1 set_head3940EF380079 "kind"
            public  void setKind(int value1)
            // -end- 396191E903C1 set_head3940EF380079 "kind"
            {
              // -beg- preserve=no 396191E903C1 set_body3940EF380079 "kind"
              if(kind != value1){
                kind = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
              }
              // -end- 396191E903C1 set_body3940EF380079 "kind"
            }

            // -beg- preserve=no 396194CA032B var3940EF380079 "compositionAttr"
            private NlsString compositionAttr = null;
            // -end- 396194CA032B var3940EF380079 "compositionAttr"

            /** get current value of compositionAttr
             *  Namen der Attribute der Komposition die in der DECOMPOSITION erscheinen sollen.
             *  @see #setCompositionAttr
             */
            // -beg- preserve=no 396194CA032B get_head3940EF380079 "compositionAttr"
            public  NlsString getCompositionAttr()
            // -end- 396194CA032B get_head3940EF380079 "compositionAttr"
            {
              // -beg- preserve=no 396194CA032B get_body3940EF380079 "compositionAttr"
              return compositionAttr;
              // -end- 396194CA032B get_body3940EF380079 "compositionAttr"
            }

            /** set current value of compositionAttr
             *  @see #getCompositionAttr
             */
            // -beg- preserve=no 396194CA032B set_head3940EF380079 "compositionAttr"
            public  void setCompositionAttr(NlsString value1)
            // -end- 396194CA032B set_head3940EF380079 "compositionAttr"
            {
              // -beg- preserve=no 396194CA032B set_body3940EF380079 "compositionAttr"
              if(compositionAttr!=value1 && (compositionAttr==null || !compositionAttr.equals(value1))){
                compositionAttr = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setCompositionAttr"));
              }
              // -end- 396194CA032B set_body3940EF380079 "compositionAttr"
            }

            // -beg- preserve=no 335C0D7A02A8 code3940EF380079 "supplierDependency"

            // -end- 335C0D7A02A8 code3940EF380079 "supplierDependency"

            /** add a SupplierDependency.
             *  
             *  @see #removeSupplierDependency
             *  @see #containsSupplierDependency
             *  @see #iteratorSupplierDependency
             *  @see #clearSupplierDependency
             *  @see #sizeSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 add_head3940EF380079 "ModelElement::addSupplierDependency"
            public void addSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 add_head3940EF380079 "ModelElement::addSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 add_body3940EF380079 "ModelElement::addSupplierDependency"
              super.addSupplierDependency(supplierDependency1);
              // -end- 335C0D7A02A8 add_body3940EF380079 "ModelElement::addSupplierDependency"
            }

            /** disconnect a SupplierDependency.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 remove_head3940EF380079 "ModelElement::removeSupplierDependency"
            public Dependency removeSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 remove_head3940EF380079 "ModelElement::removeSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 remove_body3940EF380079 "ModelElement::removeSupplierDependency"
              return super.removeSupplierDependency(supplierDependency1);
              // -end- 335C0D7A02A8 remove_body3940EF380079 "ModelElement::removeSupplierDependency"
            }

            /** tests if a given SupplierDependency is connected.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 test_head3940EF380079 "ModelElement::containsSupplierDependency"
            public boolean containsSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 test_head3940EF380079 "ModelElement::containsSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 test_body3940EF380079 "ModelElement::containsSupplierDependency"
              return super.containsSupplierDependency(supplierDependency1);
              // -end- 335C0D7A02A8 test_body3940EF380079 "ModelElement::containsSupplierDependency"
            }

            /** used to enumerate all connected SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 get_all_head3940EF380079 "ModelElement::iteratorSupplierDependency"
            public java.util.Iterator iteratorSupplierDependency()
            // -end- 335C0D7A02A8 get_all_head3940EF380079 "ModelElement::iteratorSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 get_all_body3940EF380079 "ModelElement::iteratorSupplierDependency"
              return super.iteratorSupplierDependency();
              // -end- 335C0D7A02A8 get_all_body3940EF380079 "ModelElement::iteratorSupplierDependency"
            }

            /** disconnect all SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 remove_all_head3940EF380079 "ModelElement::clearSupplierDependency"
            public void clearSupplierDependency()
            // -end- 335C0D7A02A8 remove_all_head3940EF380079 "ModelElement::clearSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 remove_all_body3940EF380079 "ModelElement::clearSupplierDependency"
              super.clearSupplierDependency();
              // -end- 335C0D7A02A8 remove_all_body3940EF380079 "ModelElement::clearSupplierDependency"
            }

            /** returns the number of SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 size_head3940EF380079 "ModelElement::sizeSupplierDependency"
            public int sizeSupplierDependency()
            // -end- 335C0D7A02A8 size_head3940EF380079 "ModelElement::sizeSupplierDependency"
            {
              // -beg- preserve=no 335C0D7A02A8 size_body3940EF380079 "ModelElement::sizeSupplierDependency"
              return super.sizeSupplierDependency();
              // -end- 335C0D7A02A8 size_body3940EF380079 "ModelElement::sizeSupplierDependency"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C0D7A02A8 _link_body3940EF380079 "ModelElement::_linkSupplierDependency"
            public void _linkSupplierDependency(Dependency supplierDependency1)
            {
              super._linkSupplierDependency(supplierDependency1);
            }
            // -end- 335C0D7A02A8 _link_body3940EF380079 "ModelElement::_linkSupplierDependency"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C0D7A02A8 _unlink_body3940EF380079 "ModelElement::_unlinkSupplierDependency"
            public void _unlinkSupplierDependency(Dependency supplierDependency1)
            {
              super._unlinkSupplierDependency(supplierDependency1);
            }
            // -end- 335C0D7A02A8 _unlink_body3940EF380079 "ModelElement::_unlinkSupplierDependency"

            // -beg- preserve=no 3C8F5ABE022D var3940EF380079 "syntax"
            private NlsString syntax = null;
            // -end- 3C8F5ABE022D var3940EF380079 "syntax"

            /** get current value of syntax
             *  the actual definition of the model element in valid INTERLIS syntax.
             *  @see #setSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D get_head3940EF380079 "syntax"
            public  NlsString getSyntax()
            // -end- 3C8F5ABE022D get_head3940EF380079 "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D get_body3940EF380079 "syntax"
              return syntax;
              // -end- 3C8F5ABE022D get_body3940EF380079 "syntax"
            }

            /** set current value of syntax
             *  @see #getSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D set_head3940EF380079 "syntax"
            public  void setSyntax(NlsString value1)
            // -end- 3C8F5ABE022D set_head3940EF380079 "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D set_body3940EF380079 "syntax"
              if(syntax!=value1 && (syntax==null || !syntax.equals(value1))){
                syntax = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
              }
              // -end- 3C8F5ABE022D set_body3940EF380079 "syntax"
            }

            public NlsString getMetaAttrb(){
            	return super.getMetaAttrb();
            }
       	  
         public void setMetaAttrb(NlsString value) {
        	 super.setMettaAttrb(value);	
         }



            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3940EF380079 detail_end "ViewDef"

            // -end- 3940EF380079 detail_end "ViewDef"

          }

