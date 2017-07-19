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


              // -beg- preserve=no 3C1DC6BA03C6 package "MetaDataUseDef"
package ch.ehi.interlis.metaobjects;
              // -end- 3C1DC6BA03C6 package "MetaDataUseDef"

              // -beg- preserve=no 3C1DC6BA03C6 autoimport "MetaDataUseDef"
              import ch.ehi.uml1_4.foundation.core.ModelElement;
              import ch.ehi.interlis.IliSyntax;
              import ch.ehi.uml1_4.implementation.AbstractModelElement;
              import ch.ehi.uml1_4.foundation.core.Namespace;
              import ch.ehi.uml1_4.foundation.core.ElementOwnership;
              import ch.ehi.basics.types.NlsString;
              import ch.ehi.interlis.metaobjects.MetaDataUseDefKind;
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
              // -end- 3C1DC6BA03C6 autoimport "MetaDataUseDef"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3C1DC6BA03C6 import "MetaDataUseDef"

              // -end- 3C1DC6BA03C6 import "MetaDataUseDef"

              /** @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:10 $
               */
public class MetaDataUseDef extends AbstractModelElement implements ModelElement , IliSyntax , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1DC6BA03C6 detail_begin "MetaDataUseDef"

                // -end- 3C1DC6BA03C6 detail_begin "MetaDataUseDef"

                // -beg- preserve=no 3D4FA21B03BA head3C1DC6BA03C6 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B03BA head3C1DC6BA03C6 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B03BA throws3C1DC6BA03C6 "unlinkAll"

                  // -end- 3D4FA21B03BA throws3C1DC6BA03C6 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B03BA body3C1DC6BA03C6 "unlinkAll"
                  
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
                  // -end- 3D4FA21B03BA body3C1DC6BA03C6 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B03CD head3C1DC6BA03C6 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B03CD head3C1DC6BA03C6 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B03CD throws3C1DC6BA03C6 "enumerateChildren"

                  // -end- 3D4FA21B03CD throws3C1DC6BA03C6 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B03CD body3C1DC6BA03C6 "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getName());
                  it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
                  visitor.visit(getSyntax());
                  visitor.visit(getDocumentation());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B03CD body3C1DC6BA03C6 "enumerateChildren"
                  }

                // -beg- preserve=no 33598CAA030E code3C1DC6BA03C6 "namespace"

                // -end- 33598CAA030E code3C1DC6BA03C6 "namespace"

                /** attaches a Namespace.
                 *  Designates the Namespace that contains the ModelElement.
                 *  @see #detachNamespace
                 *  @see #getNamespace
                 *  @see #containsNamespace
                 *  @see #getNamespaceLink
                 *  @see #createNamespaceLink
                 */
                // -beg- preserve=no 33598CAA030E attach_head3C1DC6BA03C6 "ModelElement::attachNamespace"
                public void attachNamespace(Namespace namespace1)
                // -end- 33598CAA030E attach_head3C1DC6BA03C6 "ModelElement::attachNamespace"
                {
                  // -beg- preserve=no 33598CAA030E attach_body3C1DC6BA03C6 "ModelElement::attachNamespace"
                  super.attachNamespace(namespace1);
                  // -end- 33598CAA030E attach_body3C1DC6BA03C6 "ModelElement::attachNamespace"
                }

                /** attaches a link to a Namespace.
                 *  @see #attachNamespace
                 */
                // -beg- preserve=no 33598CAA030E attachlink_head3C1DC6BA03C6 "ModelElement::attachNamespaceLink"
                public void attachNamespaceLink(ElementOwnership namespace1)
                // -end- 33598CAA030E attachlink_head3C1DC6BA03C6 "ModelElement::attachNamespaceLink"
                {
                  // -beg- preserve=no 33598CAA030E attachlink_body3C1DC6BA03C6 "ModelElement::attachNamespaceLink"
                  super.attachNamespaceLink(namespace1);
                  // -end- 33598CAA030E attachlink_body3C1DC6BA03C6 "ModelElement::attachNamespaceLink"
                }

                /** disconnect the currently attached Namespace.
                 *  @see #attachNamespace
                 */
                // -beg- preserve=no 33598CAA030E detach_head3C1DC6BA03C6 "ModelElement::detachNamespace"
                public Namespace detachNamespace()
                // -end- 33598CAA030E detach_head3C1DC6BA03C6 "ModelElement::detachNamespace"
                {
                  // -beg- preserve=no 33598CAA030E detach_body3C1DC6BA03C6 "ModelElement::detachNamespace"
                  return super.detachNamespace();
                  // -end- 33598CAA030E detach_body3C1DC6BA03C6 "ModelElement::detachNamespace"
                }

                /** get the currently attached Namespace.
                 *  @see #attachNamespace
                 */
                // -beg- preserve=no 33598CAA030E get_head3C1DC6BA03C6 "ModelElement::getNamespace"
                public Namespace getNamespace()
                // -end- 33598CAA030E get_head3C1DC6BA03C6 "ModelElement::getNamespace"
                {
                  // -beg- preserve=no 33598CAA030E get_body3C1DC6BA03C6 "ModelElement::getNamespace"
                  return super.getNamespace();
                  // -end- 33598CAA030E get_body3C1DC6BA03C6 "ModelElement::getNamespace"
                }

                /** get the link class of currently attached Namespace.
                 *  @see #attachNamespace
                 */
                // -beg- preserve=no 33598CAA030E getlink_head3C1DC6BA03C6 "ModelElement::getNamespaceLink"
                public ElementOwnership getNamespaceLink()
                // -end- 33598CAA030E getlink_head3C1DC6BA03C6 "ModelElement::getNamespaceLink"
                {
                  // -beg- preserve=no 33598CAA030E getlink_body3C1DC6BA03C6 "ModelElement::getNamespaceLink"
                  return super.getNamespaceLink();
                  // -end- 33598CAA030E getlink_body3C1DC6BA03C6 "ModelElement::getNamespaceLink"
                }

                /** create a link class for a new link to a Namespace.
                 *  @see #attachNamespace
                 */
                // -beg- preserve=no 33598CAA030E createlink_head3C1DC6BA03C6 "ModelElement::createNamespaceLink"
                public ElementOwnership createNamespaceLink()
                // -end- 33598CAA030E createlink_head3C1DC6BA03C6 "ModelElement::createNamespaceLink"
                {
                  // -beg- preserve=no 33598CAA030E createlink_body3C1DC6BA03C6 "ModelElement::createNamespaceLink"
                  return super.createNamespaceLink();
                  // -end- 33598CAA030E createlink_body3C1DC6BA03C6 "ModelElement::createNamespaceLink"
                }

                /** tests if there is a Namespace attached.
                 *  @see #attachNamespace
                 */
                // -beg- preserve=no 33598CAA030E test_head3C1DC6BA03C6 "ModelElement::containsNamespace"
                public boolean containsNamespace()
                // -end- 33598CAA030E test_head3C1DC6BA03C6 "ModelElement::containsNamespace"
                {
                  // -beg- preserve=no 33598CAA030E test_body3C1DC6BA03C6 "ModelElement::containsNamespace"
                  return super.containsNamespace();
                  // -end- 33598CAA030E test_body3C1DC6BA03C6 "ModelElement::containsNamespace"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33598CAA030E _link_body3C1DC6BA03C6 "ModelElement::_linkNamespace"
                public void _linkNamespace(ElementOwnership namespace1)
                {
                  super._linkNamespace(namespace1);
                }
                // -end- 33598CAA030E _link_body3C1DC6BA03C6 "ModelElement::_linkNamespace"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33598CAA030E _unlink_body3C1DC6BA03C6 "ModelElement::_unlinkNamespace"
                public void _unlinkNamespace(ElementOwnership namespace1)
                {
                  super._unlinkNamespace(namespace1);
                }
                // -end- 33598CAA030E _unlink_body3C1DC6BA03C6 "ModelElement::_unlinkNamespace"

                // -beg- preserve=no 3C46E5D3037D var3C1DC6BA03C6 "name"

                // -end- 3C46E5D3037D var3C1DC6BA03C6 "name"

                /** get current value of name
                 *  @see #setName
                 */
                // -beg- preserve=no 3C46E5D3037D get_head3C1DC6BA03C6 "name"
                public  NlsString getName()
                // -end- 3C46E5D3037D get_head3C1DC6BA03C6 "name"
                {
                  // -beg- preserve=no 3C46E5D3037D get_body3C1DC6BA03C6 "name"
                  return super.getName();
                  // -end- 3C46E5D3037D get_body3C1DC6BA03C6 "name"
                }

                /** set current value of name
                 *  @see #getName
                 */
                // -beg- preserve=no 3C46E5D3037D set_head3C1DC6BA03C6 "name"
                public  void setName(NlsString value1)
                // -end- 3C46E5D3037D set_head3C1DC6BA03C6 "name"
                {
                  // -beg- preserve=no 3C46E5D3037D set_body3C1DC6BA03C6 "name"
                  super.setName(value1);
                  // -end- 3C46E5D3037D set_body3C1DC6BA03C6 "name"
                }

                // -beg- preserve=no 3CBDA53B0010 var3C1DC6BA03C6 "kind"
                private int kind;
                // -end- 3CBDA53B0010 var3C1DC6BA03C6 "kind"

                /** get current value of kind
                 *  @see ch.ehi.interlis.metaobjects.MetaDataUseDefKind
                 *  @see #setKind
                 */
                // -beg- preserve=no 3CBDA53B0010 get_head3C1DC6BA03C6 "kind"
                public  int getKind()
                // -end- 3CBDA53B0010 get_head3C1DC6BA03C6 "kind"
                {
                  // -beg- preserve=no 3CBDA53B0010 get_body3C1DC6BA03C6 "kind"
                  return kind;
                  // -end- 3CBDA53B0010 get_body3C1DC6BA03C6 "kind"
                }

                /** set current value of kind
                 *  @see ch.ehi.interlis.metaobjects.MetaDataUseDefKind
                 *  @see #getKind
                 */
                // -beg- preserve=no 3CBDA53B0010 set_head3C1DC6BA03C6 "kind"
                public  void setKind(int value1)
                // -end- 3CBDA53B0010 set_head3C1DC6BA03C6 "kind"
                {
                  // -beg- preserve=no 3CBDA53B0010 set_body3C1DC6BA03C6 "kind"
                  if(kind != value1){
                    kind = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
                  }
                  // -end- 3CBDA53B0010 set_body3C1DC6BA03C6 "kind"
                }

                // -beg- preserve=no 3D6247B7009D var3C1DC6BA03C6 "basketOid"
                private String basketOid;
                // -end- 3D6247B7009D var3C1DC6BA03C6 "basketOid"

                /** get current value of basketOid
                 *  @see #setBasketOid
                 */
                // -beg- preserve=no 3D6247B7009D get_head3C1DC6BA03C6 "basketOid"
                public  String getBasketOid()
                // -end- 3D6247B7009D get_head3C1DC6BA03C6 "basketOid"
                {
                  // -beg- preserve=no 3D6247B7009D get_body3C1DC6BA03C6 "basketOid"
                  return basketOid;
                  // -end- 3D6247B7009D get_body3C1DC6BA03C6 "basketOid"
                }

                /** set current value of basketOid
                 *  @see #getBasketOid
                 */
                // -beg- preserve=no 3D6247B7009D set_head3C1DC6BA03C6 "basketOid"
                public  void setBasketOid(String value1)
                // -end- 3D6247B7009D set_head3C1DC6BA03C6 "basketOid"
                {
                  // -beg- preserve=no 3D6247B7009D set_body3C1DC6BA03C6 "basketOid"
                  if(basketOid != value1){
                    basketOid = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBasketOid"));
                  }
                  // -end- 3D6247B7009D set_body3C1DC6BA03C6 "basketOid"
                }

                // -beg- preserve=no 3C8F5ABE022D var3C1DC6BA03C6 "syntax"
                private NlsString syntax = null;
                // -end- 3C8F5ABE022D var3C1DC6BA03C6 "syntax"

                /** get current value of syntax
                 *  the actual definition of the model element in valid INTERLIS syntax.
                 *  @see #setSyntax
                 */
                // -beg- preserve=no 3C8F5ABE022D get_head3C1DC6BA03C6 "syntax"
                public  NlsString getSyntax()
                // -end- 3C8F5ABE022D get_head3C1DC6BA03C6 "syntax"
                {
                  // -beg- preserve=no 3C8F5ABE022D get_body3C1DC6BA03C6 "syntax"
                  return syntax;
                  // -end- 3C8F5ABE022D get_body3C1DC6BA03C6 "syntax"
                }

                /** set current value of syntax
                 *  @see #getSyntax
                 */
                // -beg- preserve=no 3C8F5ABE022D set_head3C1DC6BA03C6 "syntax"
                public  void setSyntax(NlsString value1)
                // -end- 3C8F5ABE022D set_head3C1DC6BA03C6 "syntax"
                {
                  // -beg- preserve=no 3C8F5ABE022D set_body3C1DC6BA03C6 "syntax"
                  if(syntax!=value1 && (syntax==null || !syntax.equals(value1))){
                    syntax = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
                  }
                  // -end- 3C8F5ABE022D set_body3C1DC6BA03C6 "syntax"
                }

				@Override
				public void setMetaAttrb(NlsString value) {
					// TODO Auto-generated method stub
					
				}

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1DC6BA03C6 detail_end "MetaDataUseDef"

                // -end- 3C1DC6BA03C6 detail_end "MetaDataUseDef"

              }

