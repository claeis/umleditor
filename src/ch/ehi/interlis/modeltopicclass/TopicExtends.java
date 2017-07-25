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


              // -beg- preserve=no 3C17718D0099 package "TopicExtends"
package ch.ehi.interlis.modeltopicclass;
              // -end- 3C17718D0099 package "TopicExtends"

              // -beg- preserve=no 3C17718D0099 autoimport "TopicExtends"
              import ch.ehi.uml1_4.foundation.core.Generalization;
              import ch.ehi.uml1_4.implementation.AbstractGeneralization;
              import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
              import ch.ehi.basics.tools.AbstractVisitor;
              import ch.ehi.uml1_4.foundation.core.Classifier;
              import ch.ehi.uml1_4.foundation.core.PresentationElement;
              import ch.ehi.basics.types.NlsString;
              import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
              import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
              import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
              import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
              import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
              import ch.ehi.uml1_4.foundation.core.Namespace;
              import ch.ehi.uml1_4.foundation.core.ElementOwnership;
              import ch.ehi.uml1_4.foundation.core.Dependency;
              import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
              import ch.ehi.uml1_4.foundation.core.Constraint;
              import ch.ehi.uml1_4.foundation.core.Component;
              import ch.ehi.uml1_4.foundation.core.ElementResidence;
              import ch.ehi.uml1_4.foundation.core.TemplateParameter;
              import ch.ehi.uml1_4.foundation.core.Flow;
              import ch.ehi.uml1_4.foundation.core.Comment;
              import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
              import ch.ehi.uml1_4.modelmanagement.Package;
              import ch.ehi.uml1_4.modelmanagement.ElementImport;
              // -end- 3C17718D0099 autoimport "TopicExtends"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3C17718D0099 import "TopicExtends"

              // -end- 3C17718D0099 import "TopicExtends"

              /** @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:12 $
               */
public class TopicExtends extends AbstractGeneralization implements Generalization , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C17718D0099 detail_begin "TopicExtends"

                // -end- 3C17718D0099 detail_begin "TopicExtends"

                // -beg- preserve=no 3D4FA21A0051 head3C17718D0099 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21A0051 head3C17718D0099 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A0051 throws3C17718D0099 "unlinkAll"

                  // -end- 3D4FA21A0051 throws3C17718D0099 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A0051 body3C17718D0099 "unlinkAll"
                  
                  detachParent();
                  detachChild();
                  detachPowertype();
                  clearPresentation();
                  setDiscriminator(null);
                  clearBehavior();
                  clearPartition();
                  clearCollaboration();
                  clearClassifierRole();
                  clearCollaborationInstanceSet();
                  detachNamespace();
                  clearClientDependency();
                  clearTaggedValue();
                  clearConstraint();
                  clearSupplierDependency();
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
                  setMetaAttrb(null);
                  setDocumentation(null);
                  super.unlinkAll();
                  // -end- 3D4FA21A0051 body3C17718D0099 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21A0052 head3C17718D0099 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21A0052 head3C17718D0099 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A0052 throws3C17718D0099 "enumerateChildren"

                  // -end- 3D4FA21A0052 throws3C17718D0099 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A0052 body3C17718D0099 "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getDiscriminator());
                  it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
                  visitor.visit(getName());
                  visitor.visit(getDocumentation());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21A0052 body3C17718D0099 "enumerateChildren"
                  }

                // -beg- preserve=no 335C146B0352 code3C17718D0099 "parent"

                // -end- 335C146B0352 code3C17718D0099 "parent"

                /** attaches a Parent.
                 *  
                 *  @see #detachParent
                 *  @see #getParent
                 *  @see #containsParent
                 */
                // -beg- preserve=no 335C146B0352 attach_head3C17718D0099 "Generalization::attachParent"
                public void attachParent(GeneralizableElement parent1)
                // -end- 335C146B0352 attach_head3C17718D0099 "Generalization::attachParent"
                {
                  // -beg- preserve=no 335C146B0352 attach_body3C17718D0099 "Generalization::attachParent"
                  super.attachParent(parent1);
                  // -end- 335C146B0352 attach_body3C17718D0099 "Generalization::attachParent"
                }

                /** disconnect the currently attached Parent.
                 *  @see #attachParent
                 */
                // -beg- preserve=no 335C146B0352 detach_head3C17718D0099 "Generalization::detachParent"
                public GeneralizableElement detachParent()
                // -end- 335C146B0352 detach_head3C17718D0099 "Generalization::detachParent"
                {
                  // -beg- preserve=no 335C146B0352 detach_body3C17718D0099 "Generalization::detachParent"
                  return super.detachParent();
                  // -end- 335C146B0352 detach_body3C17718D0099 "Generalization::detachParent"
                }

                /** get the currently attached Parent.
                 *  @see #attachParent
                 */
                // -beg- preserve=no 335C146B0352 get_head3C17718D0099 "Generalization::getParent"
                public GeneralizableElement getParent()
                // -end- 335C146B0352 get_head3C17718D0099 "Generalization::getParent"
                {
                  // -beg- preserve=no 335C146B0352 get_body3C17718D0099 "Generalization::getParent"
                  return super.getParent();
                  // -end- 335C146B0352 get_body3C17718D0099 "Generalization::getParent"
                }

                /** tests if there is a Parent attached.
                 *  @see #attachParent
                 */
                // -beg- preserve=no 335C146B0352 test_head3C17718D0099 "Generalization::containsParent"
                public boolean containsParent()
                // -end- 335C146B0352 test_head3C17718D0099 "Generalization::containsParent"
                {
                  // -beg- preserve=no 335C146B0352 test_body3C17718D0099 "Generalization::containsParent"
                  return super.containsParent();
                  // -end- 335C146B0352 test_body3C17718D0099 "Generalization::containsParent"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 335C146B0352 _link_body3C17718D0099 "Generalization::_linkParent"
                public void _linkParent(GeneralizableElement parent1)
                {
                  super._linkParent(parent1);
                }
                // -end- 335C146B0352 _link_body3C17718D0099 "Generalization::_linkParent"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 335C146B0352 _unlink_body3C17718D0099 "Generalization::_unlinkParent"
                public void _unlinkParent(GeneralizableElement parent1)
                {
                  super._unlinkParent(parent1);
                }
                // -end- 335C146B0352 _unlink_body3C17718D0099 "Generalization::_unlinkParent"

                // -beg- preserve=no 335C14A50352 code3C17718D0099 "child"

                // -end- 335C14A50352 code3C17718D0099 "child"

                /** attaches a Child.
                 *  
                 *  @see #detachChild
                 *  @see #getChild
                 *  @see #containsChild
                 */
                // -beg- preserve=no 335C14A50352 attach_head3C17718D0099 "Generalization::attachChild"
                public void attachChild(GeneralizableElement child1)
                // -end- 335C14A50352 attach_head3C17718D0099 "Generalization::attachChild"
                {
                  // -beg- preserve=no 335C14A50352 attach_body3C17718D0099 "Generalization::attachChild"
                  super.attachChild(child1);
                  // -end- 335C14A50352 attach_body3C17718D0099 "Generalization::attachChild"
                }

                /** disconnect the currently attached Child.
                 *  @see #attachChild
                 */
                // -beg- preserve=no 335C14A50352 detach_head3C17718D0099 "Generalization::detachChild"
                public GeneralizableElement detachChild()
                // -end- 335C14A50352 detach_head3C17718D0099 "Generalization::detachChild"
                {
                  // -beg- preserve=no 335C14A50352 detach_body3C17718D0099 "Generalization::detachChild"
                  return super.detachChild();
                  // -end- 335C14A50352 detach_body3C17718D0099 "Generalization::detachChild"
                }

                /** get the currently attached Child.
                 *  @see #attachChild
                 */
                // -beg- preserve=no 335C14A50352 get_head3C17718D0099 "Generalization::getChild"
                public GeneralizableElement getChild()
                // -end- 335C14A50352 get_head3C17718D0099 "Generalization::getChild"
                {
                  // -beg- preserve=no 335C14A50352 get_body3C17718D0099 "Generalization::getChild"
                  return super.getChild();
                  // -end- 335C14A50352 get_body3C17718D0099 "Generalization::getChild"
                }

                /** tests if there is a Child attached.
                 *  @see #attachChild
                 */
                // -beg- preserve=no 335C14A50352 test_head3C17718D0099 "Generalization::containsChild"
                public boolean containsChild()
                // -end- 335C14A50352 test_head3C17718D0099 "Generalization::containsChild"
                {
                  // -beg- preserve=no 335C14A50352 test_body3C17718D0099 "Generalization::containsChild"
                  return super.containsChild();
                  // -end- 335C14A50352 test_body3C17718D0099 "Generalization::containsChild"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 335C14A50352 _link_body3C17718D0099 "Generalization::_linkChild"
                public void _linkChild(GeneralizableElement child1)
                {
                  super._linkChild(child1);
                }
                // -end- 335C14A50352 _link_body3C17718D0099 "Generalization::_linkChild"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 335C14A50352 _unlink_body3C17718D0099 "Generalization::_unlinkChild"
                public void _unlinkChild(GeneralizableElement child1)
                {
                  super._unlinkChild(child1);
                }
                // -end- 335C14A50352 _unlink_body3C17718D0099 "Generalization::_unlinkChild"

                public NlsString getMetaAttrb(){
               	 return super.getMetaAttrb();
                 }
                 
                 public void setMetaAttrb(NlsString value) {
               	super.setMettaAttrb(value);
               	
                 }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C17718D0099 detail_end "TopicExtends"

                // -end- 3C17718D0099 detail_end "TopicExtends"

              }

