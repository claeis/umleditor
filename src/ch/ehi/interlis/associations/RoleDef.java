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


              // -beg- preserve=no 3C1DAD070376 package "RoleDef"
package ch.ehi.interlis.associations;
              // -end- 3C1DAD070376 package "RoleDef"

              // -beg- preserve=no 3C1DAD070376 autoimport "RoleDef"
              import ch.ehi.uml1_4.foundation.core.AssociationEnd;
              import ch.ehi.uml1_4.implementation.AbstractModelElement;
              import ch.ehi.uml1_4.foundation.core.Classifier;
              import ch.ehi.interlis.associations.RoleDefDerived;
              import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
              import ch.ehi.basics.types.NlsString;
              import ch.ehi.uml1_4.foundation.datatypes.OrderingKind;
              import ch.ehi.uml1_4.foundation.datatypes.AggregationKind;
              import ch.ehi.interlis.associations.AssociationAsIliAttrKind;
              import ch.ehi.basics.tools.AbstractVisitor;
              import ch.ehi.uml1_4.behaviour.collaborations.AssociationEndRole;
              import ch.ehi.uml1_4.behaviour.commonbehavior.LinkEnd;
              import ch.ehi.uml1_4.foundation.core.Association;
              import ch.ehi.uml1_4.foundation.core.Attribute;
              import ch.ehi.uml1_4.foundation.core.PresentationElement;
              import ch.ehi.uml1_4.foundation.datatypes.ScopeKind;
              import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
              import ch.ehi.uml1_4.foundation.datatypes.ChangeableKind;
              import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
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
              // -end- 3C1DAD070376 autoimport "RoleDef"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3C1DAD070376 import "RoleDef"

              // -end- 3C1DAD070376 import "RoleDef"

              /** @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:39 $
               */
public class RoleDef extends AbstractModelElement implements AssociationEnd , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1DAD070376 detail_begin "RoleDef"

                // -end- 3C1DAD070376 detail_begin "RoleDef"

                // -beg- preserve=no 3D4FA21C007C head3C1DAD070376 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21C007C head3C1DAD070376 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21C007C throws3C1DAD070376 "unlinkAll"

                  // -end- 3D4FA21C007C throws3C1DAD070376 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21C007C body3C1DAD070376 "unlinkAll"
                  
                  // Role Association: AssociationDef object(s) may point to this
                  detachParticipant();
                  detachRoleDefDerived();
                  clearRestriction();
                  setName(null);
                  clearAssociationEndRole();
                  clearLinkEnd();
                  detachAssociation();
                  clearQualifier();
                  clearSpecification();
                  clearPresentation();
                  setMultiplicity(null);
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
                  setDocumentation(null);
                  super.unlinkAll();
                  // -end- 3D4FA21C007C body3C1DAD070376 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21C0090 head3C1DAD070376 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21C0090 head3C1DAD070376 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21C0090 throws3C1DAD070376 "enumerateChildren"

                  // -end- 3D4FA21C0090 throws3C1DAD070376 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21C0090 body3C1DAD070376 "enumerateChildren"
                  java.util.Iterator it=null;
                  if(containsRoleDefDerived())visitor.visit(getRoleDefDerived());
                  visitor.visit(getName());
                  it=iteratorQualifier();while(it.hasNext())visitor.visit(it.next());
                  visitor.visit(getMultiplicity());
                  it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
                  visitor.visit(getDocumentation());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21C0090 body3C1DAD070376 "enumerateChildren"
                  }

                // -beg- preserve=no 3DC019B102A6 head3C1DAD070376 "changeParticipant"
                public Classifier changeParticipant(Classifier newParticipant)
                // -end- 3DC019B102A6 head3C1DAD070376 "changeParticipant"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3DC019B102A6 throws3C1DAD070376 "changeParticipant"

                  // -end- 3DC019B102A6 throws3C1DAD070376 "changeParticipant"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=yes 3DC019B102A6 body3C1DAD070376 "changeParticipant"
    if(participant==null) {throw new java.lang.IllegalStateException("no participant attached yet");}
    if(newParticipant==null) {throw new java.lang.IllegalArgumentException("null may not be attached as participant");}
    participant._unlinkAssociation(this);
    Classifier oldParticipant=participant;
    participant = newParticipant;
    participant._linkAssociation(this);

    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"changeParticipant"));
    return oldParticipant;
                  // -end- 3DC019B102A6 body3C1DAD070376 "changeParticipant"
                  }

                // -beg- preserve=no 33E265070354 code3C1DAD070376 "participant"
                private Classifier participant;
                // -end- 33E265070354 code3C1DAD070376 "participant"

                /** attaches a Participant.
                 *  
                 *  @see #detachParticipant
                 *  @see #getParticipant
                 *  @see #containsParticipant
                 */
                // -beg- preserve=no 33E265070354 attach_head3C1DAD070376 "AssociationEnd::attachParticipant"
                public void attachParticipant(Classifier participant1)
                // -end- 33E265070354 attach_head3C1DAD070376 "AssociationEnd::attachParticipant"
                {
                  // -beg- preserve=no 33E265070354 attach_body3C1DAD070376 "AssociationEnd::attachParticipant"
                  if(participant!=null) {throw new java.lang.IllegalStateException("already a participant attached");}
                  if(participant1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as participant");}
                  participant = participant1;
                  participant1._linkAssociation(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachParticipant"));
                  return;
                  // -end- 33E265070354 attach_body3C1DAD070376 "AssociationEnd::attachParticipant"
                }

                /** disconnect the currently attached Participant.
                 *  @see #attachParticipant
                 */
                // -beg- preserve=no 33E265070354 detach_head3C1DAD070376 "AssociationEnd::detachParticipant"
                public Classifier detachParticipant()
                // -end- 33E265070354 detach_head3C1DAD070376 "AssociationEnd::detachParticipant"
                {
                  // -beg- preserve=no 33E265070354 detach_body3C1DAD070376 "AssociationEnd::detachParticipant"
                  Classifier ret = null;
                  if(participant!=null){
                    participant._unlinkAssociation(this);
                    ret = participant;
                    participant = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachParticipant"));
                  return ret;
                  // -end- 33E265070354 detach_body3C1DAD070376 "AssociationEnd::detachParticipant"
                }

                /** get the currently attached Participant.
                 *  @see #attachParticipant
                 */
                // -beg- preserve=no 33E265070354 get_head3C1DAD070376 "AssociationEnd::getParticipant"
                public Classifier getParticipant()
                // -end- 33E265070354 get_head3C1DAD070376 "AssociationEnd::getParticipant"
                {
                  // -beg- preserve=no 33E265070354 get_body3C1DAD070376 "AssociationEnd::getParticipant"
                  if(participant==null) {throw new java.lang.IllegalStateException("no participant attached");}
                  return participant;
                  // -end- 33E265070354 get_body3C1DAD070376 "AssociationEnd::getParticipant"
                }

                /** tests if there is a Participant attached.
                 *  @see #attachParticipant
                 */
                // -beg- preserve=no 33E265070354 test_head3C1DAD070376 "AssociationEnd::containsParticipant"
                public boolean containsParticipant()
                // -end- 33E265070354 test_head3C1DAD070376 "AssociationEnd::containsParticipant"
                {
                  // -beg- preserve=no 33E265070354 test_body3C1DAD070376 "AssociationEnd::containsParticipant"
                  return participant!=null;
                  // -end- 33E265070354 test_body3C1DAD070376 "AssociationEnd::containsParticipant"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33E265070354 _link_body3C1DAD070376 "AssociationEnd::_linkParticipant"
                public void _linkParticipant(Classifier participant1)
                {
                  participant = participant1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkParticipant"));
                  return;
                }
                // -end- 33E265070354 _link_body3C1DAD070376 "AssociationEnd::_linkParticipant"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33E265070354 _unlink_body3C1DAD070376 "AssociationEnd::_unlinkParticipant"
                public void _unlinkParticipant(Classifier participant1)
                {
                  participant = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkParticipant"));
                  return;
                }
                // -end- 33E265070354 _unlink_body3C1DAD070376 "AssociationEnd::_unlinkParticipant"

                // -beg- preserve=no 3C1DB13D00FF code3C1DAD070376 "roleDefDerived"
                private RoleDefDerived roleDefDerived;
                // -end- 3C1DB13D00FF code3C1DAD070376 "roleDefDerived"

                /** attaches a RoleDefDerived.
                 *  
                 *  @see #detachRoleDefDerived
                 *  @see #getRoleDefDerived
                 *  @see #containsRoleDefDerived
                 */
                // -beg- preserve=no 3C1DB13D00FF attach_head3C1DAD070376 "RoleDef::attachRoleDefDerived"
                public void attachRoleDefDerived(RoleDefDerived roleDefDerived1)
                // -end- 3C1DB13D00FF attach_head3C1DAD070376 "RoleDef::attachRoleDefDerived"
                {
                  // -beg- preserve=no 3C1DB13D00FF attach_body3C1DAD070376 "RoleDef::attachRoleDefDerived"
                  if(roleDefDerived!=null) {throw new java.lang.IllegalStateException("already a roleDefDerived attached");}
                  if(roleDefDerived1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as roleDefDerived");}
                  roleDefDerived = roleDefDerived1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachRoleDefDerived"));
                  return;
                  // -end- 3C1DB13D00FF attach_body3C1DAD070376 "RoleDef::attachRoleDefDerived"
                }

                /** disconnect the currently attached RoleDefDerived.
                 *  @see #attachRoleDefDerived
                 */
                // -beg- preserve=no 3C1DB13D00FF detach_head3C1DAD070376 "RoleDef::detachRoleDefDerived"
                public RoleDefDerived detachRoleDefDerived()
                // -end- 3C1DB13D00FF detach_head3C1DAD070376 "RoleDef::detachRoleDefDerived"
                {
                  // -beg- preserve=no 3C1DB13D00FF detach_body3C1DAD070376 "RoleDef::detachRoleDefDerived"
                  RoleDefDerived ret = null;
                  ret = roleDefDerived;
                  roleDefDerived = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachRoleDefDerived"));
                  return ret;
                  // -end- 3C1DB13D00FF detach_body3C1DAD070376 "RoleDef::detachRoleDefDerived"
                }

                /** get the currently attached RoleDefDerived.
                 *  @see #attachRoleDefDerived
                 */
                // -beg- preserve=no 3C1DB13D00FF get_head3C1DAD070376 "RoleDef::getRoleDefDerived"
                public RoleDefDerived getRoleDefDerived()
                // -end- 3C1DB13D00FF get_head3C1DAD070376 "RoleDef::getRoleDefDerived"
                {
                  // -beg- preserve=no 3C1DB13D00FF get_body3C1DAD070376 "RoleDef::getRoleDefDerived"
                  if(roleDefDerived==null) {throw new java.lang.IllegalStateException("no roleDefDerived attached");}
                  return roleDefDerived;
                  // -end- 3C1DB13D00FF get_body3C1DAD070376 "RoleDef::getRoleDefDerived"
                }

                /** tests if there is a RoleDefDerived attached.
                 *  @see #attachRoleDefDerived
                 */
                // -beg- preserve=no 3C1DB13D00FF test_head3C1DAD070376 "RoleDef::containsRoleDefDerived"
                public boolean containsRoleDefDerived()
                // -end- 3C1DB13D00FF test_head3C1DAD070376 "RoleDef::containsRoleDefDerived"
                {
                  // -beg- preserve=no 3C1DB13D00FF test_body3C1DAD070376 "RoleDef::containsRoleDefDerived"
                  return roleDefDerived!=null;
                  // -end- 3C1DB13D00FF test_body3C1DAD070376 "RoleDef::containsRoleDefDerived"
                }

                // -beg- preserve=no 3D4A37EC02CC code3C1DAD070376 "restriction"
                private java.util.Set restriction = new java.util.HashSet();
                // -end- 3D4A37EC02CC code3C1DAD070376 "restriction"

                /** add a Restriction.
                 *  
                 *  @see #removeRestriction
                 *  @see #containsRestriction
                 *  @see #iteratorRestriction
                 *  @see #clearRestriction
                 *  @see #sizeRestriction
                 */
                // -beg- preserve=no 3D4A37EC02CC add_head3C1DAD070376 "RoleDef::addRestriction"
                public void addRestriction(AbstractClassDef restriction1)
                // -end- 3D4A37EC02CC add_head3C1DAD070376 "RoleDef::addRestriction"
                {
                  // -beg- preserve=no 3D4A37EC02CC add_body3C1DAD070376 "RoleDef::addRestriction"
                  restriction.add(restriction1);
                  restriction1._linkRestrictedAssociation(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addRestriction"));
                  return;
                  // -end- 3D4A37EC02CC add_body3C1DAD070376 "RoleDef::addRestriction"
                }

                /** disconnect a Restriction.
                 *  @see #addRestriction
                 */
                // -beg- preserve=no 3D4A37EC02CC remove_head3C1DAD070376 "RoleDef::removeRestriction"
                public AbstractClassDef removeRestriction(AbstractClassDef restriction1)
                // -end- 3D4A37EC02CC remove_head3C1DAD070376 "RoleDef::removeRestriction"
                {
                  // -beg- preserve=no 3D4A37EC02CC remove_body3C1DAD070376 "RoleDef::removeRestriction"
                  AbstractClassDef ret=null;
                  if(restriction1==null || !restriction.contains(restriction1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = restriction1;
                  restriction.remove(restriction1);
                  restriction1._unlinkRestrictedAssociation(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeRestriction"));
                  return ret;
                  // -end- 3D4A37EC02CC remove_body3C1DAD070376 "RoleDef::removeRestriction"
                }

                /** tests if a given Restriction is connected.
                 *  @see #addRestriction
                 */
                // -beg- preserve=no 3D4A37EC02CC test_head3C1DAD070376 "RoleDef::containsRestriction"
                public boolean containsRestriction(AbstractClassDef restriction1)
                // -end- 3D4A37EC02CC test_head3C1DAD070376 "RoleDef::containsRestriction"
                {
                  // -beg- preserve=no 3D4A37EC02CC test_body3C1DAD070376 "RoleDef::containsRestriction"
                  return restriction.contains(restriction1);
                  // -end- 3D4A37EC02CC test_body3C1DAD070376 "RoleDef::containsRestriction"
                }

                /** used to enumerate all connected Restrictions.
                 *  @see #addRestriction
                 */
                // -beg- preserve=no 3D4A37EC02CC get_all_head3C1DAD070376 "RoleDef::iteratorRestriction"
                public java.util.Iterator iteratorRestriction()
                // -end- 3D4A37EC02CC get_all_head3C1DAD070376 "RoleDef::iteratorRestriction"
                {
                  // -beg- preserve=no 3D4A37EC02CC get_all_body3C1DAD070376 "RoleDef::iteratorRestriction"
                  return restriction.iterator();
                  // -end- 3D4A37EC02CC get_all_body3C1DAD070376 "RoleDef::iteratorRestriction"
                }

                /** disconnect all Restrictions.
                 *  @see #addRestriction
                 */
                // -beg- preserve=no 3D4A37EC02CC remove_all_head3C1DAD070376 "RoleDef::clearRestriction"
                public void clearRestriction()
                // -end- 3D4A37EC02CC remove_all_head3C1DAD070376 "RoleDef::clearRestriction"
                {
                  // -beg- preserve=no 3D4A37EC02CC remove_all_body3C1DAD070376 "RoleDef::clearRestriction"
                  if(sizeRestriction()>0){
                    for(java.util.Iterator p = restriction.iterator(); p.hasNext();){
                      ((AbstractClassDef)p.next())._unlinkRestrictedAssociation(this);
                    }
                    restriction.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearRestriction"));
                  }
                  // -end- 3D4A37EC02CC remove_all_body3C1DAD070376 "RoleDef::clearRestriction"
                }

                /** returns the number of Restrictions.
                 *  @see #addRestriction
                 */
                // -beg- preserve=no 3D4A37EC02CC size_head3C1DAD070376 "RoleDef::sizeRestriction"
                public int sizeRestriction()
                // -end- 3D4A37EC02CC size_head3C1DAD070376 "RoleDef::sizeRestriction"
                {
                  // -beg- preserve=no 3D4A37EC02CC size_body3C1DAD070376 "RoleDef::sizeRestriction"
                  return restriction.size();
                  // -end- 3D4A37EC02CC size_body3C1DAD070376 "RoleDef::sizeRestriction"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3D4A37EC02CC _link_body3C1DAD070376 "RoleDef::_linkRestriction"
                public void _linkRestriction(AbstractClassDef restriction1)
                {
                  restriction.add(restriction1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkRestriction"));
                  return;
                }
                // -end- 3D4A37EC02CC _link_body3C1DAD070376 "RoleDef::_linkRestriction"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3D4A37EC02CC _unlink_body3C1DAD070376 "RoleDef::_unlinkRestriction"
                public void _unlinkRestriction(AbstractClassDef restriction1)
                {
                  restriction.remove(restriction1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkRestriction"));
                  return;
                }
                // -end- 3D4A37EC02CC _unlink_body3C1DAD070376 "RoleDef::_unlinkRestriction"

                // -beg- preserve=no 3C1DB2470332 var3C1DAD070376 "name"

                // -end- 3C1DB2470332 var3C1DAD070376 "name"

                /** get current value of name
                 *  @see #setName
                 */
                // -beg- preserve=no 3C1DB2470332 get_head3C1DAD070376 "name"
                public  NlsString getName()
                // -end- 3C1DB2470332 get_head3C1DAD070376 "name"
                {
                  // -beg- preserve=no 3C1DB2470332 get_body3C1DAD070376 "name"
                  return super.getName();
                  // -end- 3C1DB2470332 get_body3C1DAD070376 "name"
                }

                /** set current value of name
                 *  @see #getName
                 */
                // -beg- preserve=no 3C1DB2470332 set_head3C1DAD070376 "name"
                public  void setName(NlsString value1)
                // -end- 3C1DB2470332 set_head3C1DAD070376 "name"
                {
                  // -beg- preserve=no 3C1DB2470332 set_body3C1DAD070376 "name"
                  super.setName(value1);
                  // -end- 3C1DB2470332 set_body3C1DAD070376 "name"
                }

                // -beg- preserve=no 3C1DB278030A var3C1DAD070376 "isAbstract"
                private boolean isAbstract;
                // -end- 3C1DB278030A var3C1DAD070376 "isAbstract"

                /** get current value of isAbstract
                 *  @see #setAbstract
                 */
                // -beg- preserve=no 3C1DB278030A get_head3C1DAD070376 "isAbstract"
                public  boolean isAbstract()
                // -end- 3C1DB278030A get_head3C1DAD070376 "isAbstract"
                {
                  // -beg- preserve=no 3C1DB278030A get_body3C1DAD070376 "isAbstract"
                  return isAbstract;
                  // -end- 3C1DB278030A get_body3C1DAD070376 "isAbstract"
                }

                /** set current value of isAbstract
                 *  @see #isAbstract
                 */
                // -beg- preserve=no 3C1DB278030A set_head3C1DAD070376 "isAbstract"
                public  void setAbstract(boolean value1)
                // -end- 3C1DB278030A set_head3C1DAD070376 "isAbstract"
                {
                  // -beg- preserve=no 3C1DB278030A set_body3C1DAD070376 "isAbstract"
                  if(isAbstract != value1){
                    isAbstract = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAbstract"));
                  }
                  // -end- 3C1DB278030A set_body3C1DAD070376 "isAbstract"
                }

                // -beg- preserve=no 3C1DB2890265 var3C1DAD070376 "propExtended"
                private boolean propExtended;
                // -end- 3C1DB2890265 var3C1DAD070376 "propExtended"

                /** get current value of propExtended
                 *  @see #setPropExtended
                 */
                // -beg- preserve=no 3C1DB2890265 get_head3C1DAD070376 "propExtended"
                public  boolean isPropExtended()
                // -end- 3C1DB2890265 get_head3C1DAD070376 "propExtended"
                {
                  // -beg- preserve=no 3C1DB2890265 get_body3C1DAD070376 "propExtended"
                  return propExtended;
                  // -end- 3C1DB2890265 get_body3C1DAD070376 "propExtended"
                }

                /** set current value of propExtended
                 *  @see #isPropExtended
                 */
                // -beg- preserve=no 3C1DB2890265 set_head3C1DAD070376 "propExtended"
                public  void setPropExtended(boolean value1)
                // -end- 3C1DB2890265 set_head3C1DAD070376 "propExtended"
                {
                  // -beg- preserve=no 3C1DB2890265 set_body3C1DAD070376 "propExtended"
                  if(propExtended != value1){
                    propExtended = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPropExtended"));
                  }
                  // -end- 3C1DB2890265 set_body3C1DAD070376 "propExtended"
                }

                // -beg- preserve=no 3C1DB293002E var3C1DAD070376 "propFinal"
                private boolean propFinal;
                // -end- 3C1DB293002E var3C1DAD070376 "propFinal"

                /** get current value of propFinal
                 *  @see #setPropFinal
                 */
                // -beg- preserve=no 3C1DB293002E get_head3C1DAD070376 "propFinal"
                public  boolean isPropFinal()
                // -end- 3C1DB293002E get_head3C1DAD070376 "propFinal"
                {
                  // -beg- preserve=no 3C1DB293002E get_body3C1DAD070376 "propFinal"
                  return propFinal;
                  // -end- 3C1DB293002E get_body3C1DAD070376 "propFinal"
                }

                /** set current value of propFinal
                 *  @see #isPropFinal
                 */
                // -beg- preserve=no 3C1DB293002E set_head3C1DAD070376 "propFinal"
                public  void setPropFinal(boolean value1)
                // -end- 3C1DB293002E set_head3C1DAD070376 "propFinal"
                {
                  // -beg- preserve=no 3C1DB293002E set_body3C1DAD070376 "propFinal"
                  if(propFinal != value1){
                    propFinal = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPropFinal"));
                  }
                  // -end- 3C1DB293002E set_body3C1DAD070376 "propFinal"
                }

                // -beg- preserve=no 3C1DB29B0397 var3C1DAD070376 "ordering"
                private int ordering;
                // -end- 3C1DB29B0397 var3C1DAD070376 "ordering"

                /** get current value of ordering
                 *  @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
                 *  @see #setOrdering
                 */
                // -beg- preserve=no 3C1DB29B0397 get_head3C1DAD070376 "ordering"
                public  int getOrdering()
                // -end- 3C1DB29B0397 get_head3C1DAD070376 "ordering"
                {
                  // -beg- preserve=no 3C1DB29B0397 get_body3C1DAD070376 "ordering"
                  return ordering;
                  // -end- 3C1DB29B0397 get_body3C1DAD070376 "ordering"
                }

                /** set current value of ordering
                 *  @see ch.ehi.uml1_4.foundation.datatypes.OrderingKind
                 *  @see #getOrdering
                 */
                // -beg- preserve=no 3C1DB29B0397 set_head3C1DAD070376 "ordering"
                public  void setOrdering(int value1)
                // -end- 3C1DB29B0397 set_head3C1DAD070376 "ordering"
                {
                  // -beg- preserve=no 3C1DB29B0397 set_body3C1DAD070376 "ordering"
                  if(ordering != value1){
                    ordering = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setOrdering"));
                  }
                  // -end- 3C1DB29B0397 set_body3C1DAD070376 "ordering"
                }

                // -beg- preserve=no 3C1DB2CD0046 var3C1DAD070376 "aggregation"
                private int aggregation = AggregationKind.NONE;
                // -end- 3C1DB2CD0046 var3C1DAD070376 "aggregation"

                /** get current value of aggregation
                 *  @see ch.ehi.uml1_4.foundation.datatypes.AggregationKind
                 *  @see #setAggregation
                 */
                // -beg- preserve=no 3C1DB2CD0046 get_head3C1DAD070376 "aggregation"
                public  int getAggregation()
                // -end- 3C1DB2CD0046 get_head3C1DAD070376 "aggregation"
                {
                  // -beg- preserve=no 3C1DB2CD0046 get_body3C1DAD070376 "aggregation"
                  return aggregation;
                  // -end- 3C1DB2CD0046 get_body3C1DAD070376 "aggregation"
                }

                /** set current value of aggregation
                 *  @see ch.ehi.uml1_4.foundation.datatypes.AggregationKind
                 *  @see #getAggregation
                 */
                // -beg- preserve=no 3C1DB2CD0046 set_head3C1DAD070376 "aggregation"
                public  void setAggregation(int value1)
                // -end- 3C1DB2CD0046 set_head3C1DAD070376 "aggregation"
                {
                  // -beg- preserve=no 3C1DB2CD0046 set_body3C1DAD070376 "aggregation"
                  if(aggregation != value1){
                    aggregation = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAggregation"));
                  }
                  // -end- 3C1DB2CD0046 set_body3C1DAD070376 "aggregation"
                }

                // -beg- preserve=no 3D46C12B000A var3C1DAD070376 "iliAttributeKind"
                private int iliAttributeKind = AssociationAsIliAttrKind.ASSOCIATION;
                // -end- 3D46C12B000A var3C1DAD070376 "iliAttributeKind"

                /** get current value of iliAttributeKind
                 *  @see ch.ehi.interlis.associations.AssociationAsIliAttrKind
                 *  @see #setIliAttributeKind
                 */
                // -beg- preserve=no 3D46C12B000A get_head3C1DAD070376 "iliAttributeKind"
                public  int getIliAttributeKind()
                // -end- 3D46C12B000A get_head3C1DAD070376 "iliAttributeKind"
                {
                  // -beg- preserve=no 3D46C12B000A get_body3C1DAD070376 "iliAttributeKind"
                  return iliAttributeKind;
                  // -end- 3D46C12B000A get_body3C1DAD070376 "iliAttributeKind"
                }

                /** set current value of iliAttributeKind
                 *  @see ch.ehi.interlis.associations.AssociationAsIliAttrKind
                 *  @see #getIliAttributeKind
                 */
                // -beg- preserve=no 3D46C12B000A set_head3C1DAD070376 "iliAttributeKind"
                public  void setIliAttributeKind(int value1)
                // -end- 3D46C12B000A set_head3C1DAD070376 "iliAttributeKind"
                {
                  // -beg- preserve=no 3D46C12B000A set_body3C1DAD070376 "iliAttributeKind"
                  if(iliAttributeKind != value1){
                    iliAttributeKind = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setIliAttributeKind"));
                  }
                  // -end- 3D46C12B000A set_body3C1DAD070376 "iliAttributeKind"
                }

                // -beg- preserve=no 3D5D480B0238 var3C1DAD070376 "propExternal"
                private boolean propExternal = false;
                // -end- 3D5D480B0238 var3C1DAD070376 "propExternal"

                /** get current value of propExternal
                 *  @see #setPropExternal
                 */
                // -beg- preserve=no 3D5D480B0238 get_head3C1DAD070376 "propExternal"
                public  boolean isPropExternal()
                // -end- 3D5D480B0238 get_head3C1DAD070376 "propExternal"
                {
                  // -beg- preserve=no 3D5D480B0238 get_body3C1DAD070376 "propExternal"
                  return propExternal;
                  // -end- 3D5D480B0238 get_body3C1DAD070376 "propExternal"
                }

                /** set current value of propExternal
                 *  @see #isPropExternal
                 */
                // -beg- preserve=no 3D5D480B0238 set_head3C1DAD070376 "propExternal"
                public  void setPropExternal(boolean value1)
                // -end- 3D5D480B0238 set_head3C1DAD070376 "propExternal"
                {
                  // -beg- preserve=no 3D5D480B0238 set_body3C1DAD070376 "propExternal"
                  if(propExternal != value1){
                    propExternal = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPropExternal"));
                  }
                  // -end- 3D5D480B0238 set_body3C1DAD070376 "propExternal"
                }

                // -beg- preserve=no 33CD50F90302 code3C1DAD070376 "associationEndRole"
                private java.util.Set associationEndRole = new java.util.HashSet();
                // -end- 33CD50F90302 code3C1DAD070376 "associationEndRole"

                /** add a AssociationEndRole.
                 *  
                 *  @see #removeAssociationEndRole
                 *  @see #containsAssociationEndRole
                 *  @see #iteratorAssociationEndRole
                 *  @see #clearAssociationEndRole
                 *  @see #sizeAssociationEndRole
                 */
                // -beg- preserve=no 33CD50F90302 add_head3C1DAD070376 "AssociationEnd::addAssociationEndRole"
                public void addAssociationEndRole(AssociationEndRole associationEndRole1)
                // -end- 33CD50F90302 add_head3C1DAD070376 "AssociationEnd::addAssociationEndRole"
                {
                  // -beg- preserve=no 33CD50F90302 add_body3C1DAD070376 "AssociationEnd::addAssociationEndRole"
                  associationEndRole.add(associationEndRole1);
                  associationEndRole1._linkBase(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addAssociationEndRole"));
                  return;
                  // -end- 33CD50F90302 add_body3C1DAD070376 "AssociationEnd::addAssociationEndRole"
                }

                /** disconnect a AssociationEndRole.
                 *  @see #addAssociationEndRole
                 */
                // -beg- preserve=no 33CD50F90302 remove_head3C1DAD070376 "AssociationEnd::removeAssociationEndRole"
                public AssociationEndRole removeAssociationEndRole(AssociationEndRole associationEndRole1)
                // -end- 33CD50F90302 remove_head3C1DAD070376 "AssociationEnd::removeAssociationEndRole"
                {
                  // -beg- preserve=no 33CD50F90302 remove_body3C1DAD070376 "AssociationEnd::removeAssociationEndRole"
                  AssociationEndRole ret=null;
                  if(associationEndRole1==null || !associationEndRole.contains(associationEndRole1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = associationEndRole1;
                  associationEndRole.remove(associationEndRole1);
                  associationEndRole1._unlinkBase(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeAssociationEndRole"));
                  return ret;
                  // -end- 33CD50F90302 remove_body3C1DAD070376 "AssociationEnd::removeAssociationEndRole"
                }

                /** tests if a given AssociationEndRole is connected.
                 *  @see #addAssociationEndRole
                 */
                // -beg- preserve=no 33CD50F90302 test_head3C1DAD070376 "AssociationEnd::containsAssociationEndRole"
                public boolean containsAssociationEndRole(AssociationEndRole associationEndRole1)
                // -end- 33CD50F90302 test_head3C1DAD070376 "AssociationEnd::containsAssociationEndRole"
                {
                  // -beg- preserve=no 33CD50F90302 test_body3C1DAD070376 "AssociationEnd::containsAssociationEndRole"
                  return associationEndRole.contains(associationEndRole1);
                  // -end- 33CD50F90302 test_body3C1DAD070376 "AssociationEnd::containsAssociationEndRole"
                }

                /** used to enumerate all connected AssociationEndRoles.
                 *  @see #addAssociationEndRole
                 */
                // -beg- preserve=no 33CD50F90302 get_all_head3C1DAD070376 "AssociationEnd::iteratorAssociationEndRole"
                public java.util.Iterator iteratorAssociationEndRole()
                // -end- 33CD50F90302 get_all_head3C1DAD070376 "AssociationEnd::iteratorAssociationEndRole"
                {
                  // -beg- preserve=no 33CD50F90302 get_all_body3C1DAD070376 "AssociationEnd::iteratorAssociationEndRole"
                  return associationEndRole.iterator();
                  // -end- 33CD50F90302 get_all_body3C1DAD070376 "AssociationEnd::iteratorAssociationEndRole"
                }

                /** disconnect all AssociationEndRoles.
                 *  @see #addAssociationEndRole
                 */
                // -beg- preserve=no 33CD50F90302 remove_all_head3C1DAD070376 "AssociationEnd::clearAssociationEndRole"
                public void clearAssociationEndRole()
                // -end- 33CD50F90302 remove_all_head3C1DAD070376 "AssociationEnd::clearAssociationEndRole"
                {
                  // -beg- preserve=no 33CD50F90302 remove_all_body3C1DAD070376 "AssociationEnd::clearAssociationEndRole"
                  if(sizeAssociationEndRole()>0){
                    for(java.util.Iterator p = associationEndRole.iterator(); p.hasNext();){
                      ((AssociationEndRole)p.next())._unlinkBase(this);
                    }
                    associationEndRole.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearAssociationEndRole"));
                  }
                  // -end- 33CD50F90302 remove_all_body3C1DAD070376 "AssociationEnd::clearAssociationEndRole"
                }

                /** returns the number of AssociationEndRoles.
                 *  @see #addAssociationEndRole
                 */
                // -beg- preserve=no 33CD50F90302 size_head3C1DAD070376 "AssociationEnd::sizeAssociationEndRole"
                public int sizeAssociationEndRole()
                // -end- 33CD50F90302 size_head3C1DAD070376 "AssociationEnd::sizeAssociationEndRole"
                {
                  // -beg- preserve=no 33CD50F90302 size_body3C1DAD070376 "AssociationEnd::sizeAssociationEndRole"
                  return associationEndRole.size();
                  // -end- 33CD50F90302 size_body3C1DAD070376 "AssociationEnd::sizeAssociationEndRole"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33CD50F90302 _link_body3C1DAD070376 "AssociationEnd::_linkAssociationEndRole"
                public void _linkAssociationEndRole(AssociationEndRole associationEndRole1)
                {
                  associationEndRole.add(associationEndRole1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAssociationEndRole"));
                  return;
                }
                // -end- 33CD50F90302 _link_body3C1DAD070376 "AssociationEnd::_linkAssociationEndRole"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33CD50F90302 _unlink_body3C1DAD070376 "AssociationEnd::_unlinkAssociationEndRole"
                public void _unlinkAssociationEndRole(AssociationEndRole associationEndRole1)
                {
                  associationEndRole.remove(associationEndRole1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAssociationEndRole"));
                  return;
                }
                // -end- 33CD50F90302 _unlink_body3C1DAD070376 "AssociationEnd::_unlinkAssociationEndRole"

                // -beg- preserve=no 328A5C1F029E code3C1DAD070376 "linkEnd"
                private java.util.Set linkEnd = new java.util.HashSet();
                // -end- 328A5C1F029E code3C1DAD070376 "linkEnd"

                /** add a LinkEnd.
                 *  
                 *  @see #removeLinkEnd
                 *  @see #containsLinkEnd
                 *  @see #iteratorLinkEnd
                 *  @see #clearLinkEnd
                 *  @see #sizeLinkEnd
                 */
                // -beg- preserve=no 328A5C1F029E add_head3C1DAD070376 "AssociationEnd::addLinkEnd"
                public void addLinkEnd(LinkEnd linkEnd1)
                // -end- 328A5C1F029E add_head3C1DAD070376 "AssociationEnd::addLinkEnd"
                {
                  // -beg- preserve=no 328A5C1F029E add_body3C1DAD070376 "AssociationEnd::addLinkEnd"
                  linkEnd.add(linkEnd1);
                  linkEnd1._linkAssociationEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addLinkEnd"));
                  return;
                  // -end- 328A5C1F029E add_body3C1DAD070376 "AssociationEnd::addLinkEnd"
                }

                /** disconnect a LinkEnd.
                 *  @see #addLinkEnd
                 */
                // -beg- preserve=no 328A5C1F029E remove_head3C1DAD070376 "AssociationEnd::removeLinkEnd"
                public LinkEnd removeLinkEnd(LinkEnd linkEnd1)
                // -end- 328A5C1F029E remove_head3C1DAD070376 "AssociationEnd::removeLinkEnd"
                {
                  // -beg- preserve=no 328A5C1F029E remove_body3C1DAD070376 "AssociationEnd::removeLinkEnd"
                  LinkEnd ret=null;
                  if(linkEnd1==null || !linkEnd.contains(linkEnd1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = linkEnd1;
                  linkEnd.remove(linkEnd1);
                  linkEnd1._unlinkAssociationEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeLinkEnd"));
                  return ret;
                  // -end- 328A5C1F029E remove_body3C1DAD070376 "AssociationEnd::removeLinkEnd"
                }

                /** tests if a given LinkEnd is connected.
                 *  @see #addLinkEnd
                 */
                // -beg- preserve=no 328A5C1F029E test_head3C1DAD070376 "AssociationEnd::containsLinkEnd"
                public boolean containsLinkEnd(LinkEnd linkEnd1)
                // -end- 328A5C1F029E test_head3C1DAD070376 "AssociationEnd::containsLinkEnd"
                {
                  // -beg- preserve=no 328A5C1F029E test_body3C1DAD070376 "AssociationEnd::containsLinkEnd"
                  return linkEnd.contains(linkEnd1);
                  // -end- 328A5C1F029E test_body3C1DAD070376 "AssociationEnd::containsLinkEnd"
                }

                /** used to enumerate all connected LinkEnds.
                 *  @see #addLinkEnd
                 */
                // -beg- preserve=no 328A5C1F029E get_all_head3C1DAD070376 "AssociationEnd::iteratorLinkEnd"
                public java.util.Iterator iteratorLinkEnd()
                // -end- 328A5C1F029E get_all_head3C1DAD070376 "AssociationEnd::iteratorLinkEnd"
                {
                  // -beg- preserve=no 328A5C1F029E get_all_body3C1DAD070376 "AssociationEnd::iteratorLinkEnd"
                  return linkEnd.iterator();
                  // -end- 328A5C1F029E get_all_body3C1DAD070376 "AssociationEnd::iteratorLinkEnd"
                }

                /** disconnect all LinkEnds.
                 *  @see #addLinkEnd
                 */
                // -beg- preserve=no 328A5C1F029E remove_all_head3C1DAD070376 "AssociationEnd::clearLinkEnd"
                public void clearLinkEnd()
                // -end- 328A5C1F029E remove_all_head3C1DAD070376 "AssociationEnd::clearLinkEnd"
                {
                  // -beg- preserve=no 328A5C1F029E remove_all_body3C1DAD070376 "AssociationEnd::clearLinkEnd"
                  if(sizeLinkEnd()>0){
                    for(java.util.Iterator p = linkEnd.iterator(); p.hasNext();){
                      ((LinkEnd)p.next())._unlinkAssociationEnd(this);
                    }
                    linkEnd.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearLinkEnd"));
                  }
                  // -end- 328A5C1F029E remove_all_body3C1DAD070376 "AssociationEnd::clearLinkEnd"
                }

                /** returns the number of LinkEnds.
                 *  @see #addLinkEnd
                 */
                // -beg- preserve=no 328A5C1F029E size_head3C1DAD070376 "AssociationEnd::sizeLinkEnd"
                public int sizeLinkEnd()
                // -end- 328A5C1F029E size_head3C1DAD070376 "AssociationEnd::sizeLinkEnd"
                {
                  // -beg- preserve=no 328A5C1F029E size_body3C1DAD070376 "AssociationEnd::sizeLinkEnd"
                  return linkEnd.size();
                  // -end- 328A5C1F029E size_body3C1DAD070376 "AssociationEnd::sizeLinkEnd"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 328A5C1F029E _link_body3C1DAD070376 "AssociationEnd::_linkLinkEnd"
                public void _linkLinkEnd(LinkEnd linkEnd1)
                {
                  linkEnd.add(linkEnd1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkLinkEnd"));
                  return;
                }
                // -end- 328A5C1F029E _link_body3C1DAD070376 "AssociationEnd::_linkLinkEnd"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 328A5C1F029E _unlink_body3C1DAD070376 "AssociationEnd::_unlinkLinkEnd"
                public void _unlinkLinkEnd(LinkEnd linkEnd1)
                {
                  linkEnd.remove(linkEnd1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkLinkEnd"));
                  return;
                }
                // -end- 328A5C1F029E _unlink_body3C1DAD070376 "AssociationEnd::_unlinkLinkEnd"

                // -beg- preserve=no 32A2A510017B code3C1DAD070376 "association"
                private Association association;
                // -end- 32A2A510017B code3C1DAD070376 "association"

                /** attaches a Association.
                 *  
                 *  @see #detachAssociation
                 *  @see #getAssociation
                 *  @see #containsAssociation
                 */
                // -beg- preserve=no 32A2A510017B attach_head3C1DAD070376 "AssociationEnd::attachAssociation"
                public void attachAssociation(Association association1)
                // -end- 32A2A510017B attach_head3C1DAD070376 "AssociationEnd::attachAssociation"
                {
                  // -beg- preserve=no 32A2A510017B attach_body3C1DAD070376 "AssociationEnd::attachAssociation"
                  if(association!=null) {throw new java.lang.IllegalStateException("already a association attached");}
                  if(association1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as association");}
                  association = association1;
                  association1._linkConnection(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAssociation"));
                  return;
                  // -end- 32A2A510017B attach_body3C1DAD070376 "AssociationEnd::attachAssociation"
                }

                /** disconnect the currently attached Association.
                 *  @see #attachAssociation
                 */
                // -beg- preserve=no 32A2A510017B detach_head3C1DAD070376 "AssociationEnd::detachAssociation"
                public Association detachAssociation()
                // -end- 32A2A510017B detach_head3C1DAD070376 "AssociationEnd::detachAssociation"
                {
                  // -beg- preserve=no 32A2A510017B detach_body3C1DAD070376 "AssociationEnd::detachAssociation"
                  Association ret = null;
                  if(association!=null){
                    association._unlinkConnection(this);
                    ret = association;
                    association = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAssociation"));
                  return ret;
                  // -end- 32A2A510017B detach_body3C1DAD070376 "AssociationEnd::detachAssociation"
                }

                /** get the currently attached Association.
                 *  @see #attachAssociation
                 */
                // -beg- preserve=no 32A2A510017B get_head3C1DAD070376 "AssociationEnd::getAssociation"
                public Association getAssociation()
                // -end- 32A2A510017B get_head3C1DAD070376 "AssociationEnd::getAssociation"
                {
                  // -beg- preserve=no 32A2A510017B get_body3C1DAD070376 "AssociationEnd::getAssociation"
                  if(association==null) {throw new java.lang.IllegalStateException("no association attached");}
                  return association;
                  // -end- 32A2A510017B get_body3C1DAD070376 "AssociationEnd::getAssociation"
                }

                /** tests if there is a Association attached.
                 *  @see #attachAssociation
                 */
                // -beg- preserve=no 32A2A510017B test_head3C1DAD070376 "AssociationEnd::containsAssociation"
                public boolean containsAssociation()
                // -end- 32A2A510017B test_head3C1DAD070376 "AssociationEnd::containsAssociation"
                {
                  // -beg- preserve=no 32A2A510017B test_body3C1DAD070376 "AssociationEnd::containsAssociation"
                  return association!=null;
                  // -end- 32A2A510017B test_body3C1DAD070376 "AssociationEnd::containsAssociation"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 32A2A510017B _link_body3C1DAD070376 "AssociationEnd::_linkAssociation"
                public void _linkAssociation(Association association1)
                {
                  association = association1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAssociation"));
                  return;
                }
                // -end- 32A2A510017B _link_body3C1DAD070376 "AssociationEnd::_linkAssociation"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 32A2A510017B _unlink_body3C1DAD070376 "AssociationEnd::_unlinkAssociation"
                public void _unlinkAssociation(Association association1)
                {
                  association = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAssociation"));
                  return;
                }
                // -end- 32A2A510017B _unlink_body3C1DAD070376 "AssociationEnd::_unlinkAssociation"

                // -beg- preserve=no 33DBE50B001F code3C1DAD070376 "qualifier"
                private java.util.List qualifier = new java.util.ArrayList();
                // -end- 33DBE50B001F code3C1DAD070376 "qualifier"

                /** add a Qualifier.
                 *  
                 *  @see #removeQualifier
                 *  @see #containsQualifier
                 *  @see #iteratorQualifier
                 *  @see #clearQualifier
                 *  @see #sizeQualifier
                 */
                // -beg- preserve=no 33DBE50B001F add_head3C1DAD070376 "AssociationEnd::addQualifier"
                public void addQualifier(Attribute qualifier1)
                // -end- 33DBE50B001F add_head3C1DAD070376 "AssociationEnd::addQualifier"
                {
                  // -beg- preserve=no 33DBE50B001F add_body3C1DAD070376 "AssociationEnd::addQualifier"
                  qualifier.add(qualifier1);
                  qualifier1._linkAssociationEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addQualifier"));
                  return;
                  // -end- 33DBE50B001F add_body3C1DAD070376 "AssociationEnd::addQualifier"
                }

                // -beg- preserve=no 33DBE50B001F add2_head3C1DAD070376 "AssociationEnd::add2Qualifier"
                public void addQualifier(int index,Attribute qualifier1)
                // -end- 33DBE50B001F add2_head3C1DAD070376 "AssociationEnd::add2Qualifier"
                {
                  // -beg- preserve=no 33DBE50B001F add2_body3C1DAD070376 "AssociationEnd::add2Qualifier"
                  qualifier.add(index,qualifier1);
                  qualifier1._linkAssociationEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addQualifier"));
                  return;
                  // -end- 33DBE50B001F add2_body3C1DAD070376 "AssociationEnd::add2Qualifier"
                }

                /** disconnect a Qualifier.
                 *  @see #addQualifier
                 */
                // -beg- preserve=no 33DBE50B001F remove_head3C1DAD070376 "AssociationEnd::removeQualifier"
                public Attribute removeQualifier(Attribute qualifier1)
                // -end- 33DBE50B001F remove_head3C1DAD070376 "AssociationEnd::removeQualifier"
                {
                  // -beg- preserve=no 33DBE50B001F remove_body3C1DAD070376 "AssociationEnd::removeQualifier"
                  Attribute ret=null;
                  if(qualifier1==null || !qualifier.contains(qualifier1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = qualifier1;
                  qualifier.remove(qualifier1);
                  qualifier1._unlinkAssociationEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeQualifier"));
                  return ret;
                  // -end- 33DBE50B001F remove_body3C1DAD070376 "AssociationEnd::removeQualifier"
                }

                /** disconnect a Qualifier.
                 *  @see #addQualifier
                 */
                // -beg- preserve=no 33DBE50B001F remove2_head3C1DAD070376 "AssociationEnd::remove2Qualifier"
                public Attribute removeQualifier(int index)
                // -end- 33DBE50B001F remove2_head3C1DAD070376 "AssociationEnd::remove2Qualifier"
                {
                  // -beg- preserve=no 33DBE50B001F remove2_body3C1DAD070376 "AssociationEnd::remove2Qualifier"
                  Attribute ret=null;
                  ret = (Attribute)qualifier.remove(index);
                  ret._unlinkAssociationEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeQualifier"));
                  return ret;
                  // -end- 33DBE50B001F remove2_body3C1DAD070376 "AssociationEnd::remove2Qualifier"
                }

                /** change a Qualifier.
                 *  @see #addQualifier
                 */
                // -beg- preserve=no 33DBE50B001F set_head3C1DAD070376 "AssociationEnd::setQualifier"
                public Attribute setQualifier(int index,Attribute qualifier1)
                // -end- 33DBE50B001F set_head3C1DAD070376 "AssociationEnd::setQualifier"
                {
                  // -beg- preserve=no 33DBE50B001F set_body3C1DAD070376 "AssociationEnd::setQualifier"
                  Attribute ret=null;
                  ret = (Attribute)qualifier.set(index,qualifier1);
                  ret._unlinkAssociationEnd(this);
                  qualifier1._linkAssociationEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setQualifier"));
                  return ret;
                  // -end- 33DBE50B001F set_body3C1DAD070376 "AssociationEnd::setQualifier"
                }

                /** tests if a given Qualifier is connected.
                 *  @see #addQualifier
                 */
                // -beg- preserve=no 33DBE50B001F test_head3C1DAD070376 "AssociationEnd::containsQualifier"
                public boolean containsQualifier(Attribute qualifier1)
                // -end- 33DBE50B001F test_head3C1DAD070376 "AssociationEnd::containsQualifier"
                {
                  // -beg- preserve=no 33DBE50B001F test_body3C1DAD070376 "AssociationEnd::containsQualifier"
                  return qualifier.contains(qualifier1);
                  // -end- 33DBE50B001F test_body3C1DAD070376 "AssociationEnd::containsQualifier"
                }

                /** used to enumerate all connected Qualifiers.
                 *  @see #addQualifier
                 */
                // -beg- preserve=no 33DBE50B001F get_all_head3C1DAD070376 "AssociationEnd::iteratorQualifier"
                public java.util.Iterator iteratorQualifier()
                // -end- 33DBE50B001F get_all_head3C1DAD070376 "AssociationEnd::iteratorQualifier"
                {
                  // -beg- preserve=no 33DBE50B001F get_all_body3C1DAD070376 "AssociationEnd::iteratorQualifier"
                  return qualifier.iterator();
                  // -end- 33DBE50B001F get_all_body3C1DAD070376 "AssociationEnd::iteratorQualifier"
                }

                /** disconnect all Qualifiers.
                 *  @see #addQualifier
                 */
                // -beg- preserve=no 33DBE50B001F remove_all_head3C1DAD070376 "AssociationEnd::clearQualifier"
                public void clearQualifier()
                // -end- 33DBE50B001F remove_all_head3C1DAD070376 "AssociationEnd::clearQualifier"
                {
                  // -beg- preserve=no 33DBE50B001F remove_all_body3C1DAD070376 "AssociationEnd::clearQualifier"
                  if(sizeQualifier()>0){
                    for(java.util.Iterator p = qualifier.iterator(); p.hasNext();){
                      ((Attribute)p.next())._unlinkAssociationEnd(this);
                    }
                    qualifier.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearQualifier"));
                  }
                  // -end- 33DBE50B001F remove_all_body3C1DAD070376 "AssociationEnd::clearQualifier"
                }

                /** returns the number of Qualifiers.
                 *  @see #addQualifier
                 */
                // -beg- preserve=no 33DBE50B001F size_head3C1DAD070376 "AssociationEnd::sizeQualifier"
                public int sizeQualifier()
                // -end- 33DBE50B001F size_head3C1DAD070376 "AssociationEnd::sizeQualifier"
                {
                  // -beg- preserve=no 33DBE50B001F size_body3C1DAD070376 "AssociationEnd::sizeQualifier"
                  return qualifier.size();
                  // -end- 33DBE50B001F size_body3C1DAD070376 "AssociationEnd::sizeQualifier"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33DBE50B001F _link_body3C1DAD070376 "AssociationEnd::_linkQualifier"
                public void _linkQualifier(Attribute qualifier1)
                {
                  qualifier.add(qualifier1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkQualifier"));
                  return;
                }
                // -end- 33DBE50B001F _link_body3C1DAD070376 "AssociationEnd::_linkQualifier"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33DBE50B001F _unlink_body3C1DAD070376 "AssociationEnd::_unlinkQualifier"
                public void _unlinkQualifier(Attribute qualifier1)
                {
                  qualifier.remove(qualifier1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkQualifier"));
                  return;
                }
                // -end- 33DBE50B001F _unlink_body3C1DAD070376 "AssociationEnd::_unlinkQualifier"

                // -beg- preserve=no 33F0EFAD00AA code3C1DAD070376 "specification"
                private java.util.Set specification = new java.util.HashSet();
                // -end- 33F0EFAD00AA code3C1DAD070376 "specification"

                /** add a Specification.
                 *  
                 *  @see #removeSpecification
                 *  @see #containsSpecification
                 *  @see #iteratorSpecification
                 *  @see #clearSpecification
                 *  @see #sizeSpecification
                 */
                // -beg- preserve=no 33F0EFAD00AA add_head3C1DAD070376 "AssociationEnd::addSpecification"
                public void addSpecification(Classifier specification1)
                // -end- 33F0EFAD00AA add_head3C1DAD070376 "AssociationEnd::addSpecification"
                {
                  // -beg- preserve=no 33F0EFAD00AA add_body3C1DAD070376 "AssociationEnd::addSpecification"
                  specification.add(specification1);
                  specification1._linkSpecifiedEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSpecification"));
                  return;
                  // -end- 33F0EFAD00AA add_body3C1DAD070376 "AssociationEnd::addSpecification"
                }

                /** disconnect a Specification.
                 *  @see #addSpecification
                 */
                // -beg- preserve=no 33F0EFAD00AA remove_head3C1DAD070376 "AssociationEnd::removeSpecification"
                public Classifier removeSpecification(Classifier specification1)
                // -end- 33F0EFAD00AA remove_head3C1DAD070376 "AssociationEnd::removeSpecification"
                {
                  // -beg- preserve=no 33F0EFAD00AA remove_body3C1DAD070376 "AssociationEnd::removeSpecification"
                  Classifier ret=null;
                  if(specification1==null || !specification.contains(specification1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = specification1;
                  specification.remove(specification1);
                  specification1._unlinkSpecifiedEnd(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSpecification"));
                  return ret;
                  // -end- 33F0EFAD00AA remove_body3C1DAD070376 "AssociationEnd::removeSpecification"
                }

                /** tests if a given Specification is connected.
                 *  @see #addSpecification
                 */
                // -beg- preserve=no 33F0EFAD00AA test_head3C1DAD070376 "AssociationEnd::containsSpecification"
                public boolean containsSpecification(Classifier specification1)
                // -end- 33F0EFAD00AA test_head3C1DAD070376 "AssociationEnd::containsSpecification"
                {
                  // -beg- preserve=no 33F0EFAD00AA test_body3C1DAD070376 "AssociationEnd::containsSpecification"
                  return specification.contains(specification1);
                  // -end- 33F0EFAD00AA test_body3C1DAD070376 "AssociationEnd::containsSpecification"
                }

                /** used to enumerate all connected Specifications.
                 *  @see #addSpecification
                 */
                // -beg- preserve=no 33F0EFAD00AA get_all_head3C1DAD070376 "AssociationEnd::iteratorSpecification"
                public java.util.Iterator iteratorSpecification()
                // -end- 33F0EFAD00AA get_all_head3C1DAD070376 "AssociationEnd::iteratorSpecification"
                {
                  // -beg- preserve=no 33F0EFAD00AA get_all_body3C1DAD070376 "AssociationEnd::iteratorSpecification"
                  return specification.iterator();
                  // -end- 33F0EFAD00AA get_all_body3C1DAD070376 "AssociationEnd::iteratorSpecification"
                }

                /** disconnect all Specifications.
                 *  @see #addSpecification
                 */
                // -beg- preserve=no 33F0EFAD00AA remove_all_head3C1DAD070376 "AssociationEnd::clearSpecification"
                public void clearSpecification()
                // -end- 33F0EFAD00AA remove_all_head3C1DAD070376 "AssociationEnd::clearSpecification"
                {
                  // -beg- preserve=no 33F0EFAD00AA remove_all_body3C1DAD070376 "AssociationEnd::clearSpecification"
                  if(sizeSpecification()>0){
                    for(java.util.Iterator p = specification.iterator(); p.hasNext();){
                      ((Classifier)p.next())._unlinkSpecifiedEnd(this);
                    }
                    specification.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSpecification"));
                  }
                  // -end- 33F0EFAD00AA remove_all_body3C1DAD070376 "AssociationEnd::clearSpecification"
                }

                /** returns the number of Specifications.
                 *  @see #addSpecification
                 */
                // -beg- preserve=no 33F0EFAD00AA size_head3C1DAD070376 "AssociationEnd::sizeSpecification"
                public int sizeSpecification()
                // -end- 33F0EFAD00AA size_head3C1DAD070376 "AssociationEnd::sizeSpecification"
                {
                  // -beg- preserve=no 33F0EFAD00AA size_body3C1DAD070376 "AssociationEnd::sizeSpecification"
                  return specification.size();
                  // -end- 33F0EFAD00AA size_body3C1DAD070376 "AssociationEnd::sizeSpecification"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33F0EFAD00AA _link_body3C1DAD070376 "AssociationEnd::_linkSpecification"
                public void _linkSpecification(Classifier specification1)
                {
                  specification.add(specification1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSpecification"));
                  return;
                }
                // -end- 33F0EFAD00AA _link_body3C1DAD070376 "AssociationEnd::_linkSpecification"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 33F0EFAD00AA _unlink_body3C1DAD070376 "AssociationEnd::_unlinkSpecification"
                public void _unlinkSpecification(Classifier specification1)
                {
                  specification.remove(specification1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSpecification"));
                  return;
                }
                // -end- 33F0EFAD00AA _unlink_body3C1DAD070376 "AssociationEnd::_unlinkSpecification"

                // -beg- preserve=no 362409A9000A code3C1DAD070376 "presentation"

                // -end- 362409A9000A code3C1DAD070376 "presentation"

                /** add a Presentation.
                 *  
                 *  @see #removePresentation
                 *  @see #containsPresentation
                 *  @see #iteratorPresentation
                 *  @see #clearPresentation
                 *  @see #sizePresentation
                 */
                // -beg- preserve=no 362409A9000A add_head3C1DAD070376 "ModelElement::addPresentation"
                public void addPresentation(PresentationElement presentation1)
                // -end- 362409A9000A add_head3C1DAD070376 "ModelElement::addPresentation"
                {
                  // -beg- preserve=no 362409A9000A add_body3C1DAD070376 "ModelElement::addPresentation"
                  super.addPresentation(presentation1);
                  // -end- 362409A9000A add_body3C1DAD070376 "ModelElement::addPresentation"
                }

                /** disconnect a Presentation.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A remove_head3C1DAD070376 "ModelElement::removePresentation"
                public PresentationElement removePresentation(PresentationElement presentation1)
                // -end- 362409A9000A remove_head3C1DAD070376 "ModelElement::removePresentation"
                {
                  // -beg- preserve=no 362409A9000A remove_body3C1DAD070376 "ModelElement::removePresentation"
                  return super.removePresentation(presentation1);
                  // -end- 362409A9000A remove_body3C1DAD070376 "ModelElement::removePresentation"
                }

                /** tests if a given Presentation is connected.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A test_head3C1DAD070376 "ModelElement::containsPresentation"
                public boolean containsPresentation(PresentationElement presentation1)
                // -end- 362409A9000A test_head3C1DAD070376 "ModelElement::containsPresentation"
                {
                  // -beg- preserve=no 362409A9000A test_body3C1DAD070376 "ModelElement::containsPresentation"
                  return super.containsPresentation(presentation1);
                  // -end- 362409A9000A test_body3C1DAD070376 "ModelElement::containsPresentation"
                }

                /** used to enumerate all connected Presentations.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A get_all_head3C1DAD070376 "ModelElement::iteratorPresentation"
                public java.util.Iterator iteratorPresentation()
                // -end- 362409A9000A get_all_head3C1DAD070376 "ModelElement::iteratorPresentation"
                {
                  // -beg- preserve=no 362409A9000A get_all_body3C1DAD070376 "ModelElement::iteratorPresentation"
                  return super.iteratorPresentation();
                  // -end- 362409A9000A get_all_body3C1DAD070376 "ModelElement::iteratorPresentation"
                }

                /** disconnect all Presentations.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A remove_all_head3C1DAD070376 "ModelElement::clearPresentation"
                public void clearPresentation()
                // -end- 362409A9000A remove_all_head3C1DAD070376 "ModelElement::clearPresentation"
                {
                  // -beg- preserve=no 362409A9000A remove_all_body3C1DAD070376 "ModelElement::clearPresentation"
                  super.clearPresentation();
                  // -end- 362409A9000A remove_all_body3C1DAD070376 "ModelElement::clearPresentation"
                }

                /** returns the number of Presentations.
                 *  @see #addPresentation
                 */
                // -beg- preserve=no 362409A9000A size_head3C1DAD070376 "ModelElement::sizePresentation"
                public int sizePresentation()
                // -end- 362409A9000A size_head3C1DAD070376 "ModelElement::sizePresentation"
                {
                  // -beg- preserve=no 362409A9000A size_body3C1DAD070376 "ModelElement::sizePresentation"
                  return super.sizePresentation();
                  // -end- 362409A9000A size_body3C1DAD070376 "ModelElement::sizePresentation"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 362409A9000A _link_body3C1DAD070376 "ModelElement::_linkPresentation"
                public void _linkPresentation(PresentationElement presentation1)
                {
                  super._linkPresentation(presentation1);
                }
                // -end- 362409A9000A _link_body3C1DAD070376 "ModelElement::_linkPresentation"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 362409A9000A _unlink_body3C1DAD070376 "ModelElement::_unlinkPresentation"
                public void _unlinkPresentation(PresentationElement presentation1)
                {
                  super._unlinkPresentation(presentation1);
                }
                // -end- 362409A9000A _unlink_body3C1DAD070376 "ModelElement::_unlinkPresentation"

                // -beg- preserve=no 3163E041030C var3C1DAD070376 "isNavigable"
                private boolean isNavigable;
                // -end- 3163E041030C var3C1DAD070376 "isNavigable"

                /** get current value of isNavigable
                 *  @see #setNavigable
                 */
                // -beg- preserve=no 3163E041030C get_head3C1DAD070376 "isNavigable"
                public  boolean isNavigable()
                // -end- 3163E041030C get_head3C1DAD070376 "isNavigable"
                {
                  // -beg- preserve=no 3163E041030C get_body3C1DAD070376 "isNavigable"
                  return isNavigable;
                  // -end- 3163E041030C get_body3C1DAD070376 "isNavigable"
                }

                /** set current value of isNavigable
                 *  @see #isNavigable
                 */
                // -beg- preserve=no 3163E041030C set_head3C1DAD070376 "isNavigable"
                public  void setNavigable(boolean value1)
                // -end- 3163E041030C set_head3C1DAD070376 "isNavigable"
                {
                  // -beg- preserve=no 3163E041030C set_body3C1DAD070376 "isNavigable"
                  if(isNavigable != value1){
                    isNavigable = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setNavigable"));
                  }
                  // -end- 3163E041030C set_body3C1DAD070376 "isNavigable"
                }

                // -beg- preserve=no 33577C86023A var3C1DAD070376 "targetScope"
                private int targetScope;
                // -end- 33577C86023A var3C1DAD070376 "targetScope"

                /** get current value of targetScope
                 *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
                 *  @see #setTargetScope
                 */
                // -beg- preserve=no 33577C86023A get_head3C1DAD070376 "targetScope"
                public  int getTargetScope()
                // -end- 33577C86023A get_head3C1DAD070376 "targetScope"
                {
                  // -beg- preserve=no 33577C86023A get_body3C1DAD070376 "targetScope"
                  return targetScope;
                  // -end- 33577C86023A get_body3C1DAD070376 "targetScope"
                }

                /** set current value of targetScope
                 *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
                 *  @see #getTargetScope
                 */
                // -beg- preserve=no 33577C86023A set_head3C1DAD070376 "targetScope"
                public  void setTargetScope(int value1)
                // -end- 33577C86023A set_head3C1DAD070376 "targetScope"
                {
                  // -beg- preserve=no 33577C86023A set_body3C1DAD070376 "targetScope"
                  if(targetScope != value1){
                    targetScope = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setTargetScope"));
                  }
                  // -end- 33577C86023A set_body3C1DAD070376 "targetScope"
                }

                // -beg- preserve=no 33577DB30046 var3C1DAD070376 "multiplicity"
                private Multiplicity multiplicity = null;
                // -end- 33577DB30046 var3C1DAD070376 "multiplicity"

                /** get current value of multiplicity
                 *  @see #setMultiplicity
                 */
                // -beg- preserve=no 33577DB30046 get_head3C1DAD070376 "multiplicity"
                public  Multiplicity getMultiplicity()
                // -end- 33577DB30046 get_head3C1DAD070376 "multiplicity"
                {
                  // -beg- preserve=no 33577DB30046 get_body3C1DAD070376 "multiplicity"
                  return multiplicity;
                  // -end- 33577DB30046 get_body3C1DAD070376 "multiplicity"
                }

                /** set current value of multiplicity
                 *  @see #getMultiplicity
                 */
                // -beg- preserve=no 33577DB30046 set_head3C1DAD070376 "multiplicity"
                public  void setMultiplicity(Multiplicity value1)
                // -end- 33577DB30046 set_head3C1DAD070376 "multiplicity"
                {
                  // -beg- preserve=no 33577DB30046 set_body3C1DAD070376 "multiplicity"
                  if(multiplicity!=value1 && (multiplicity==null || !multiplicity.equals(value1))){
                    multiplicity = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMultiplicity"));
                  }
                  // -end- 33577DB30046 set_body3C1DAD070376 "multiplicity"
                }

                // -beg- preserve=no 33577DBA00D2 var3C1DAD070376 "changeability"
                private int changeability;
                // -end- 33577DBA00D2 var3C1DAD070376 "changeability"

                /** get current value of changeability
                 *  @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
                 *  @see #setChangeability
                 */
                // -beg- preserve=no 33577DBA00D2 get_head3C1DAD070376 "changeability"
                public  int getChangeability()
                // -end- 33577DBA00D2 get_head3C1DAD070376 "changeability"
                {
                  // -beg- preserve=no 33577DBA00D2 get_body3C1DAD070376 "changeability"
                  return changeability;
                  // -end- 33577DBA00D2 get_body3C1DAD070376 "changeability"
                }

                /** set current value of changeability
                 *  @see ch.ehi.uml1_4.foundation.datatypes.ChangeableKind
                 *  @see #getChangeability
                 */
                // -beg- preserve=no 33577DBA00D2 set_head3C1DAD070376 "changeability"
                public  void setChangeability(int value1)
                // -end- 33577DBA00D2 set_head3C1DAD070376 "changeability"
                {
                  // -beg- preserve=no 33577DBA00D2 set_body3C1DAD070376 "changeability"
                  if(changeability != value1){
                    changeability = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setChangeability"));
                  }
                  // -end- 33577DBA00D2 set_body3C1DAD070376 "changeability"
                }

                // -beg- preserve=no 3611BCE602DA var3C1DAD070376 "visibility"
                private int visibility;
                // -end- 3611BCE602DA var3C1DAD070376 "visibility"

                /** get current value of visibility
                 *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
                 *  @see #setVisibility
                 */
                // -beg- preserve=no 3611BCE602DA get_head3C1DAD070376 "visibility"
                public  int getVisibility()
                // -end- 3611BCE602DA get_head3C1DAD070376 "visibility"
                {
                  // -beg- preserve=no 3611BCE602DA get_body3C1DAD070376 "visibility"
                  return visibility;
                  // -end- 3611BCE602DA get_body3C1DAD070376 "visibility"
                }

                /** set current value of visibility
                 *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
                 *  @see #getVisibility
                 */
                // -beg- preserve=no 3611BCE602DA set_head3C1DAD070376 "visibility"
                public  void setVisibility(int value1)
                // -end- 3611BCE602DA set_head3C1DAD070376 "visibility"
                {
                  // -beg- preserve=no 3611BCE602DA set_body3C1DAD070376 "visibility"
                  if(visibility != value1){
                    visibility = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setVisibility"));
                  }
                  // -end- 3611BCE602DA set_body3C1DAD070376 "visibility"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1DAD070376 detail_end "RoleDef"

                // -end- 3C1DAD070376 detail_end "RoleDef"

              }

