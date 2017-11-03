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

          // -beg- preserve=no 3E4241810290 package "AbstractGeneralization"
package ch.ehi.uml1_4.implementation;
          // -end- 3E4241810290 package "AbstractGeneralization"

          // -beg- preserve=no 3E4241810290 autoimport "AbstractGeneralization"
          import ch.ehi.uml1_4.implementation.AbstractModelElement;
          import ch.ehi.uml1_4.foundation.core.Generalization;
          import ch.ehi.basics.tools.AbstractVisitor;
          import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
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
          // -end- 3E4241810290 autoimport "AbstractGeneralization"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3E4241810290 import "AbstractGeneralization"

          // -end- 3E4241810290 import "AbstractGeneralization"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:53 $
           */
public abstract class AbstractGeneralization extends AbstractModelElement implements Generalization
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3E4241810290 detail_begin "AbstractGeneralization"

            // -end- 3E4241810290 detail_begin "AbstractGeneralization"

            // -beg- preserve=no 3E4241A4007E head3E4241810290 "unlinkAll"
            public void unlinkAll()
            // -end- 3E4241A4007E head3E4241810290 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3E4241A4007E throws3E4241810290 "unlinkAll"

              // -end- 3E4241A4007E throws3E4241810290 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3E4241A4007E body3E4241810290 "unlinkAll"
              
              detachChild();
              detachParent();
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
              setDocumentation(null);
              super.unlinkAll();
              // -end- 3E4241A4007E body3E4241810290 "unlinkAll"
              }

            // -beg- preserve=no 3E4241A70295 head3E4241810290 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3E4241A70295 head3E4241810290 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3E4241A70295 throws3E4241810290 "enumerateChildren"

              // -end- 3E4241A70295 throws3E4241810290 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3E4241A70295 body3E4241810290 "enumerateChildren"
              java.util.Iterator it=null;
              visitor.visit(getDiscriminator());
              it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
              it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getName());
              visitor.visit(getDocumentation());
              super.enumerateChildren(visitor);
              // -end- 3E4241A70295 body3E4241810290 "enumerateChildren"
              }

            // -beg- preserve=no 3E4241B103D0 head3E4241810290 "changeChild"
            public GeneralizableElement changeChild(GeneralizableElement newchild)
            // -end- 3E4241B103D0 head3E4241810290 "changeChild"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3E4241B103D0 throws3E4241810290 "changeChild"

              // -end- 3E4241B103D0 throws3E4241810290 "changeChild"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3E4241B103D0 body3E4241810290 "changeChild"
    if(child==null) {throw new java.lang.IllegalStateException("no child attached yet");}
    if(newchild==null) {throw new java.lang.IllegalArgumentException("null may not be attached as child");}
    // no change?
    if(newchild==child){
      return child;
    }
    child._unlinkGeneralization(this);
    GeneralizableElement oldChild=child;
    child = newchild;
    child._linkGeneralization(this);

    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"changeChild"));
    return oldChild;
              // -end- 3E4241B103D0 body3E4241810290 "changeChild"
              }

            // -beg- preserve=no 3E4241B403D4 head3E4241810290 "changeParent"
            public GeneralizableElement changeParent(GeneralizableElement newparent)
            // -end- 3E4241B403D4 head3E4241810290 "changeParent"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3E4241B403D4 throws3E4241810290 "changeParent"

              // -end- 3E4241B403D4 throws3E4241810290 "changeParent"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3E4241B403D4 body3E4241810290 "changeParent"
    if(parent==null) {throw new java.lang.IllegalStateException("no parent attached yet");}
    if(newparent==null) {throw new java.lang.IllegalArgumentException("null may not be attached as parent");}
    // no change?
    if(newparent==parent){
      return parent;
    }
    parent._unlinkSpecialization(this);
    GeneralizableElement oldParent=parent;
    parent = newparent;
    parent._linkSpecialization(this);

    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"changeParent"));
    return oldParent;
              // -end- 3E4241B403D4 body3E4241810290 "changeParent"
              }

            // -beg- preserve=no 335C14A50352 code3E4241810290 "child"
            private GeneralizableElement child;
            // -end- 335C14A50352 code3E4241810290 "child"

            /** attaches a Child.
             *  
             *  @see #detachChild
             *  @see #getChild
             *  @see #containsChild
             */
            // -beg- preserve=no 335C14A50352 attach_head3E4241810290 "Generalization::attachChild"
            public void attachChild(GeneralizableElement child1)
            // -end- 335C14A50352 attach_head3E4241810290 "Generalization::attachChild"
            {
              // -beg- preserve=no 335C14A50352 attach_body3E4241810290 "Generalization::attachChild"
              if(child!=null) {throw new java.lang.IllegalStateException("already a child attached");}
              if(child1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as child");}
              child = child1;
              child1._linkGeneralization(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachChild"));
              return;
              // -end- 335C14A50352 attach_body3E4241810290 "Generalization::attachChild"
            }

            /** disconnect the currently attached Child.
             *  @see #attachChild
             */
            // -beg- preserve=no 335C14A50352 detach_head3E4241810290 "Generalization::detachChild"
            public GeneralizableElement detachChild()
            // -end- 335C14A50352 detach_head3E4241810290 "Generalization::detachChild"
            {
              // -beg- preserve=no 335C14A50352 detach_body3E4241810290 "Generalization::detachChild"
              GeneralizableElement ret = null;
              if(child!=null){
                child._unlinkGeneralization(this);
                ret = child;
                child = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachChild"));
              return ret;
              // -end- 335C14A50352 detach_body3E4241810290 "Generalization::detachChild"
            }

            /** get the currently attached Child.
             *  @see #attachChild
             */
            // -beg- preserve=no 335C14A50352 get_head3E4241810290 "Generalization::getChild"
            public GeneralizableElement getChild()
            // -end- 335C14A50352 get_head3E4241810290 "Generalization::getChild"
            {
              // -beg- preserve=no 335C14A50352 get_body3E4241810290 "Generalization::getChild"
              if(child==null) {throw new java.lang.IllegalStateException("no child attached");}
              return child;
              // -end- 335C14A50352 get_body3E4241810290 "Generalization::getChild"
            }

            /** tests if there is a Child attached.
             *  @see #attachChild
             */
            // -beg- preserve=no 335C14A50352 test_head3E4241810290 "Generalization::containsChild"
            public boolean containsChild()
            // -end- 335C14A50352 test_head3E4241810290 "Generalization::containsChild"
            {
              // -beg- preserve=no 335C14A50352 test_body3E4241810290 "Generalization::containsChild"
              return child!=null;
              // -end- 335C14A50352 test_body3E4241810290 "Generalization::containsChild"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C14A50352 _link_body3E4241810290 "Generalization::_linkChild"
            public void _linkChild(GeneralizableElement child1)
            {
              child = child1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkChild"));
              return;
            }
            // -end- 335C14A50352 _link_body3E4241810290 "Generalization::_linkChild"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C14A50352 _unlink_body3E4241810290 "Generalization::_unlinkChild"
            public void _unlinkChild(GeneralizableElement child1)
            {
              child = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkChild"));
              return;
            }
            // -end- 335C14A50352 _unlink_body3E4241810290 "Generalization::_unlinkChild"

            // -beg- preserve=no 335C146B0352 code3E4241810290 "parent"
            private GeneralizableElement parent;
            // -end- 335C146B0352 code3E4241810290 "parent"

            /** attaches a Parent.
             *  
             *  @see #detachParent
             *  @see #getParent
             *  @see #containsParent
             */
            // -beg- preserve=no 335C146B0352 attach_head3E4241810290 "Generalization::attachParent"
            public void attachParent(GeneralizableElement parent1)
            // -end- 335C146B0352 attach_head3E4241810290 "Generalization::attachParent"
            {
              // -beg- preserve=no 335C146B0352 attach_body3E4241810290 "Generalization::attachParent"
              if(parent!=null) {throw new java.lang.IllegalStateException("already a parent attached");}
              if(parent1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as parent");}
              parent = parent1;
              parent1._linkSpecialization(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachParent"));
              return;
              // -end- 335C146B0352 attach_body3E4241810290 "Generalization::attachParent"
            }

            /** disconnect the currently attached Parent.
             *  @see #attachParent
             */
            // -beg- preserve=no 335C146B0352 detach_head3E4241810290 "Generalization::detachParent"
            public GeneralizableElement detachParent()
            // -end- 335C146B0352 detach_head3E4241810290 "Generalization::detachParent"
            {
              // -beg- preserve=no 335C146B0352 detach_body3E4241810290 "Generalization::detachParent"
              GeneralizableElement ret = null;
              if(parent!=null){
                parent._unlinkSpecialization(this);
                ret = parent;
                parent = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachParent"));
              return ret;
              // -end- 335C146B0352 detach_body3E4241810290 "Generalization::detachParent"
            }

            /** get the currently attached Parent.
             *  @see #attachParent
             */
            // -beg- preserve=no 335C146B0352 get_head3E4241810290 "Generalization::getParent"
            public GeneralizableElement getParent()
            // -end- 335C146B0352 get_head3E4241810290 "Generalization::getParent"
            {
              // -beg- preserve=no 335C146B0352 get_body3E4241810290 "Generalization::getParent"
              if(parent==null) {throw new java.lang.IllegalStateException("no parent attached");}
              return parent;
              // -end- 335C146B0352 get_body3E4241810290 "Generalization::getParent"
            }

            /** tests if there is a Parent attached.
             *  @see #attachParent
             */
            // -beg- preserve=no 335C146B0352 test_head3E4241810290 "Generalization::containsParent"
            public boolean containsParent()
            // -end- 335C146B0352 test_head3E4241810290 "Generalization::containsParent"
            {
              // -beg- preserve=no 335C146B0352 test_body3E4241810290 "Generalization::containsParent"
              return parent!=null;
              // -end- 335C146B0352 test_body3E4241810290 "Generalization::containsParent"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C146B0352 _link_body3E4241810290 "Generalization::_linkParent"
            public void _linkParent(GeneralizableElement parent1)
            {
              parent = parent1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkParent"));
              return;
            }
            // -end- 335C146B0352 _link_body3E4241810290 "Generalization::_linkParent"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C146B0352 _unlink_body3E4241810290 "Generalization::_unlinkParent"
            public void _unlinkParent(GeneralizableElement parent1)
            {
              parent = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkParent"));
              return;
            }
            // -end- 335C146B0352 _unlink_body3E4241810290 "Generalization::_unlinkParent"

            // -beg- preserve=no 36E96A870370 code3E4241810290 "powertype"
            private Classifier powertype;
            // -end- 36E96A870370 code3E4241810290 "powertype"

            /** attaches a Powertype.
             *  
             *  @see #detachPowertype
             *  @see #getPowertype
             *  @see #containsPowertype
             */
            // -beg- preserve=no 36E96A870370 attach_head3E4241810290 "Generalization::attachPowertype"
            public void attachPowertype(Classifier powertype1)
            // -end- 36E96A870370 attach_head3E4241810290 "Generalization::attachPowertype"
            {
              // -beg- preserve=no 36E96A870370 attach_body3E4241810290 "Generalization::attachPowertype"
              if(powertype!=null) {throw new java.lang.IllegalStateException("already a powertype attached");}
              if(powertype1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as powertype");}
              powertype = powertype1;
              powertype1._linkPowertypeRange(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachPowertype"));
              return;
              // -end- 36E96A870370 attach_body3E4241810290 "Generalization::attachPowertype"
            }

            /** disconnect the currently attached Powertype.
             *  @see #attachPowertype
             */
            // -beg- preserve=no 36E96A870370 detach_head3E4241810290 "Generalization::detachPowertype"
            public Classifier detachPowertype()
            // -end- 36E96A870370 detach_head3E4241810290 "Generalization::detachPowertype"
            {
              // -beg- preserve=no 36E96A870370 detach_body3E4241810290 "Generalization::detachPowertype"
              Classifier ret = null;
              if(powertype!=null){
                powertype._unlinkPowertypeRange(this);
                ret = powertype;
                powertype = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachPowertype"));
              return ret;
              // -end- 36E96A870370 detach_body3E4241810290 "Generalization::detachPowertype"
            }

            /** get the currently attached Powertype.
             *  @see #attachPowertype
             */
            // -beg- preserve=no 36E96A870370 get_head3E4241810290 "Generalization::getPowertype"
            public Classifier getPowertype()
            // -end- 36E96A870370 get_head3E4241810290 "Generalization::getPowertype"
            {
              // -beg- preserve=no 36E96A870370 get_body3E4241810290 "Generalization::getPowertype"
              if(powertype==null) {throw new java.lang.IllegalStateException("no powertype attached");}
              return powertype;
              // -end- 36E96A870370 get_body3E4241810290 "Generalization::getPowertype"
            }

            /** tests if there is a Powertype attached.
             *  @see #attachPowertype
             */
            // -beg- preserve=no 36E96A870370 test_head3E4241810290 "Generalization::containsPowertype"
            public boolean containsPowertype()
            // -end- 36E96A870370 test_head3E4241810290 "Generalization::containsPowertype"
            {
              // -beg- preserve=no 36E96A870370 test_body3E4241810290 "Generalization::containsPowertype"
              return powertype!=null;
              // -end- 36E96A870370 test_body3E4241810290 "Generalization::containsPowertype"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 36E96A870370 _link_body3E4241810290 "Generalization::_linkPowertype"
            public void _linkPowertype(Classifier powertype1)
            {
              powertype = powertype1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPowertype"));
              return;
            }
            // -end- 36E96A870370 _link_body3E4241810290 "Generalization::_linkPowertype"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 36E96A870370 _unlink_body3E4241810290 "Generalization::_unlinkPowertype"
            public void _unlinkPowertype(Classifier powertype1)
            {
              powertype = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPowertype"));
              return;
            }
            // -end- 36E96A870370 _unlink_body3E4241810290 "Generalization::_unlinkPowertype"

            // -beg- preserve=no 362409A9000A code3E4241810290 "presentation"

            // -end- 362409A9000A code3E4241810290 "presentation"

            /** add a Presentation.
             *  
             *  @see #removePresentation
             *  @see #containsPresentation
             *  @see #iteratorPresentation
             *  @see #clearPresentation
             *  @see #sizePresentation
             */
            // -beg- preserve=no 362409A9000A add_head3E4241810290 "ModelElement::addPresentation"
            public void addPresentation(PresentationElement presentation1)
            // -end- 362409A9000A add_head3E4241810290 "ModelElement::addPresentation"
            {
              // -beg- preserve=no 362409A9000A add_body3E4241810290 "ModelElement::addPresentation"
              super.addPresentation(presentation1);
              // -end- 362409A9000A add_body3E4241810290 "ModelElement::addPresentation"
            }

            /** disconnect a Presentation.
             *  @see #addPresentation
             */
            // -beg- preserve=no 362409A9000A remove_head3E4241810290 "ModelElement::removePresentation"
            public PresentationElement removePresentation(PresentationElement presentation1)
            // -end- 362409A9000A remove_head3E4241810290 "ModelElement::removePresentation"
            {
              // -beg- preserve=no 362409A9000A remove_body3E4241810290 "ModelElement::removePresentation"
              return super.removePresentation(presentation1);
              // -end- 362409A9000A remove_body3E4241810290 "ModelElement::removePresentation"
            }

            /** tests if a given Presentation is connected.
             *  @see #addPresentation
             */
            // -beg- preserve=no 362409A9000A test_head3E4241810290 "ModelElement::containsPresentation"
            public boolean containsPresentation(PresentationElement presentation1)
            // -end- 362409A9000A test_head3E4241810290 "ModelElement::containsPresentation"
            {
              // -beg- preserve=no 362409A9000A test_body3E4241810290 "ModelElement::containsPresentation"
              return super.containsPresentation(presentation1);
              // -end- 362409A9000A test_body3E4241810290 "ModelElement::containsPresentation"
            }

            /** used to enumerate all connected Presentations.
             *  @see #addPresentation
             */
            // -beg- preserve=no 362409A9000A get_all_head3E4241810290 "ModelElement::iteratorPresentation"
            public java.util.Iterator iteratorPresentation()
            // -end- 362409A9000A get_all_head3E4241810290 "ModelElement::iteratorPresentation"
            {
              // -beg- preserve=no 362409A9000A get_all_body3E4241810290 "ModelElement::iteratorPresentation"
              return super.iteratorPresentation();
              // -end- 362409A9000A get_all_body3E4241810290 "ModelElement::iteratorPresentation"
            }

            /** disconnect all Presentations.
             *  @see #addPresentation
             */
            // -beg- preserve=no 362409A9000A remove_all_head3E4241810290 "ModelElement::clearPresentation"
            public void clearPresentation()
            // -end- 362409A9000A remove_all_head3E4241810290 "ModelElement::clearPresentation"
            {
              // -beg- preserve=no 362409A9000A remove_all_body3E4241810290 "ModelElement::clearPresentation"
              super.clearPresentation();
              // -end- 362409A9000A remove_all_body3E4241810290 "ModelElement::clearPresentation"
            }

            /** returns the number of Presentations.
             *  @see #addPresentation
             */
            // -beg- preserve=no 362409A9000A size_head3E4241810290 "ModelElement::sizePresentation"
            public int sizePresentation()
            // -end- 362409A9000A size_head3E4241810290 "ModelElement::sizePresentation"
            {
              // -beg- preserve=no 362409A9000A size_body3E4241810290 "ModelElement::sizePresentation"
              return super.sizePresentation();
              // -end- 362409A9000A size_body3E4241810290 "ModelElement::sizePresentation"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A9000A _link_body3E4241810290 "ModelElement::_linkPresentation"
            public void _linkPresentation(PresentationElement presentation1)
            {
              super._linkPresentation(presentation1);
            }
            // -end- 362409A9000A _link_body3E4241810290 "ModelElement::_linkPresentation"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A9000A _unlink_body3E4241810290 "ModelElement::_unlinkPresentation"
            public void _unlinkPresentation(PresentationElement presentation1)
            {
              super._unlinkPresentation(presentation1);
            }
            // -end- 362409A9000A _unlink_body3E4241810290 "ModelElement::_unlinkPresentation"

            // -beg- preserve=no 33E666CA01D6 var3E4241810290 "discriminator"
            private NlsString discriminator = null;
            // -end- 33E666CA01D6 var3E4241810290 "discriminator"

            /** get current value of discriminator
             *  @see #setDiscriminator
             */
            // -beg- preserve=no 33E666CA01D6 get_head3E4241810290 "discriminator"
            public  NlsString getDiscriminator()
            // -end- 33E666CA01D6 get_head3E4241810290 "discriminator"
            {
              // -beg- preserve=no 33E666CA01D6 get_body3E4241810290 "discriminator"
              return discriminator;
              // -end- 33E666CA01D6 get_body3E4241810290 "discriminator"
            }

            /** set current value of discriminator
             *  @see #getDiscriminator
             */
            // -beg- preserve=no 33E666CA01D6 set_head3E4241810290 "discriminator"
            public  void setDiscriminator(NlsString value1)
            // -end- 33E666CA01D6 set_head3E4241810290 "discriminator"
            {
              // -beg- preserve=no 33E666CA01D6 set_body3E4241810290 "discriminator"
              if(discriminator!=value1 && (discriminator==null || !discriminator.equals(value1))){
                discriminator = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDiscriminator"));
              }
              // -end- 33E666CA01D6 set_body3E4241810290 "discriminator"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3E4241810290 detail_end "AbstractGeneralization"

            // -end- 3E4241810290 detail_end "AbstractGeneralization"

          }

=======
// -beg- preserve=no 3E4241810290 package "AbstractGeneralization"
package ch.ehi.uml1_4.implementation;
// -end- 3E4241810290 package "AbstractGeneralization"

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.PresentationElement;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3E4241810290 import "AbstractGeneralization"

// -end- 3E4241810290 import "AbstractGeneralization"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:53 $
 */
public abstract class AbstractGeneralization extends AbstractModelElement implements Generalization {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3E4241810290 detail_begin "AbstractGeneralization"

	// -end- 3E4241810290 detail_begin "AbstractGeneralization"

	private static final long serialVersionUID = -8110826414876848582L;

	// -beg- preserve=no 3E4241A4007E head3E4241810290 "unlinkAll"
	public void unlinkAll()
	// -end- 3E4241A4007E head3E4241810290 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E4241A4007E throws3E4241810290 "unlinkAll"

	// -end- 3E4241A4007E throws3E4241810290 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3E4241A4007E body3E4241810290 "unlinkAll"

		detachChild();
		detachParent();
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
		// Role ParameterDefinition: TemplateParameter object(s) may point to
		// this
		clearStereotype();
		clearReferenceTag();
		clearImportedBy();
		// Role EditorTreeElement: EditorTreeElement object(s) may point to this
		setName(null);
		setMetaAttrb(null);
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3E4241A4007E body3E4241810290 "unlinkAll"
	}

	// -beg- preserve=no 3E4241A70295 head3E4241810290 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3E4241A70295 head3E4241810290 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E4241A70295 throws3E4241810290 "enumerateChildren"

	// -end- 3E4241A70295 throws3E4241810290 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3E4241A70295 body3E4241810290 "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getDiscriminator());
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
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3E4241A70295 body3E4241810290 "enumerateChildren"
	}

	// -beg- preserve=no 3E4241B103D0 head3E4241810290 "changeChild"
	public GeneralizableElement changeChild(GeneralizableElement newchild)
	// -end- 3E4241B103D0 head3E4241810290 "changeChild"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E4241B103D0 throws3E4241810290 "changeChild"

	// -end- 3E4241B103D0 throws3E4241810290 "changeChild"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E4241B103D0 body3E4241810290 "changeChild"
		if (child == null) {
			throw new java.lang.IllegalStateException("no child attached yet");
		}
		if (newchild == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as child");
		}
		// no change?
		if (newchild == child) {
			return child;
		}
		child._unlinkGeneralization(this);
		GeneralizableElement oldChild = child;
		child = newchild;
		child._linkGeneralization(this);

		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "changeChild"));
		return oldChild;
		// -end- 3E4241B103D0 body3E4241810290 "changeChild"
	}

	// -beg- preserve=no 3E4241B403D4 head3E4241810290 "changeParent"
	public GeneralizableElement changeParent(GeneralizableElement newparent)
	// -end- 3E4241B403D4 head3E4241810290 "changeParent"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E4241B403D4 throws3E4241810290 "changeParent"

	// -end- 3E4241B403D4 throws3E4241810290 "changeParent"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E4241B403D4 body3E4241810290 "changeParent"
		if (parent == null) {
			throw new java.lang.IllegalStateException("no parent attached yet");
		}
		if (newparent == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as parent");
		}
		// no change?
		if (newparent == parent) {
			return parent;
		}
		parent._unlinkSpecialization(this);
		GeneralizableElement oldParent = parent;
		parent = newparent;
		parent._linkSpecialization(this);

		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "changeParent"));
		return oldParent;
		// -end- 3E4241B403D4 body3E4241810290 "changeParent"
	}

	// -beg- preserve=no 335C14A50352 code3E4241810290 "child"
	private GeneralizableElement child;
	// -end- 335C14A50352 code3E4241810290 "child"

	/**
	 * attaches a Child.
	 *
	 * @see #detachChild
	 * @see #getChild
	 * @see #containsChild
	 */
	// -beg- preserve=no 335C14A50352 attach_head3E4241810290
	// "Generalization::attachChild"
	public void attachChild(GeneralizableElement child1)
	// -end- 335C14A50352 attach_head3E4241810290 "Generalization::attachChild"
	{
		// -beg- preserve=no 335C14A50352 attach_body3E4241810290
		// "Generalization::attachChild"
		if (child != null) {
			throw new java.lang.IllegalStateException("already a child attached");
		}
		if (child1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as child");
		}
		child = child1;
		child1._linkGeneralization(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachChild"));
		return;
		// -end- 335C14A50352 attach_body3E4241810290
		// "Generalization::attachChild"
	}

	/**
	 * disconnect the currently attached Child.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 335C14A50352 detach_head3E4241810290
	// "Generalization::detachChild"
	public GeneralizableElement detachChild()
	// -end- 335C14A50352 detach_head3E4241810290 "Generalization::detachChild"
	{
		// -beg- preserve=no 335C14A50352 detach_body3E4241810290
		// "Generalization::detachChild"
		GeneralizableElement ret = null;
		if (child != null) {
			child._unlinkGeneralization(this);
			ret = child;
			child = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachChild"));
		return ret;
		// -end- 335C14A50352 detach_body3E4241810290
		// "Generalization::detachChild"
	}

	/**
	 * get the currently attached Child.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 335C14A50352 get_head3E4241810290
	// "Generalization::getChild"
	public GeneralizableElement getChild()
	// -end- 335C14A50352 get_head3E4241810290 "Generalization::getChild"
	{
		// -beg- preserve=no 335C14A50352 get_body3E4241810290
		// "Generalization::getChild"
		if (child == null) {
			throw new java.lang.IllegalStateException("no child attached");
		}
		return child;
		// -end- 335C14A50352 get_body3E4241810290 "Generalization::getChild"
	}

	/**
	 * tests if there is a Child attached.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 335C14A50352 test_head3E4241810290
	// "Generalization::containsChild"
	public boolean containsChild()
	// -end- 335C14A50352 test_head3E4241810290 "Generalization::containsChild"
	{
		// -beg- preserve=no 335C14A50352 test_body3E4241810290
		// "Generalization::containsChild"
		return child != null;
		// -end- 335C14A50352 test_body3E4241810290
		// "Generalization::containsChild"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A50352 _link_body3E4241810290
	// "Generalization::_linkChild"
	public void _linkChild(GeneralizableElement child1) {
		child = child1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkChild"));
		return;
	}
	// -end- 335C14A50352 _link_body3E4241810290 "Generalization::_linkChild"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A50352 _unlink_body3E4241810290
	// "Generalization::_unlinkChild"
	public void _unlinkChild(GeneralizableElement child1) {
		child = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkChild"));
		return;
	}
	// -end- 335C14A50352 _unlink_body3E4241810290
	// "Generalization::_unlinkChild"

	// -beg- preserve=no 335C146B0352 code3E4241810290 "parent"
	private GeneralizableElement parent;
	// -end- 335C146B0352 code3E4241810290 "parent"

	/**
	 * attaches a Parent.
	 *
	 * @see #detachParent
	 * @see #getParent
	 * @see #containsParent
	 */
	// -beg- preserve=no 335C146B0352 attach_head3E4241810290
	// "Generalization::attachParent"
	public void attachParent(GeneralizableElement parent1)
	// -end- 335C146B0352 attach_head3E4241810290 "Generalization::attachParent"
	{
		// -beg- preserve=no 335C146B0352 attach_body3E4241810290
		// "Generalization::attachParent"
		if (parent != null) {
			throw new java.lang.IllegalStateException("already a parent attached");
		}
		if (parent1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as parent");
		}
		parent = parent1;
		parent1._linkSpecialization(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachParent"));
		return;
		// -end- 335C146B0352 attach_body3E4241810290
		// "Generalization::attachParent"
	}

	/**
	 * disconnect the currently attached Parent.
	 * 
	 * @see #attachParent
	 */
	// -beg- preserve=no 335C146B0352 detach_head3E4241810290
	// "Generalization::detachParent"
	public GeneralizableElement detachParent()
	// -end- 335C146B0352 detach_head3E4241810290 "Generalization::detachParent"
	{
		// -beg- preserve=no 335C146B0352 detach_body3E4241810290
		// "Generalization::detachParent"
		GeneralizableElement ret = null;
		if (parent != null) {
			parent._unlinkSpecialization(this);
			ret = parent;
			parent = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachParent"));
		return ret;
		// -end- 335C146B0352 detach_body3E4241810290
		// "Generalization::detachParent"
	}

	/**
	 * get the currently attached Parent.
	 * 
	 * @see #attachParent
	 */
	// -beg- preserve=no 335C146B0352 get_head3E4241810290
	// "Generalization::getParent"
	public GeneralizableElement getParent()
	// -end- 335C146B0352 get_head3E4241810290 "Generalization::getParent"
	{
		// -beg- preserve=no 335C146B0352 get_body3E4241810290
		// "Generalization::getParent"
		if (parent == null) {
			throw new java.lang.IllegalStateException("no parent attached");
		}
		return parent;
		// -end- 335C146B0352 get_body3E4241810290 "Generalization::getParent"
	}

	/**
	 * tests if there is a Parent attached.
	 * 
	 * @see #attachParent
	 */
	// -beg- preserve=no 335C146B0352 test_head3E4241810290
	// "Generalization::containsParent"
	public boolean containsParent()
	// -end- 335C146B0352 test_head3E4241810290 "Generalization::containsParent"
	{
		// -beg- preserve=no 335C146B0352 test_body3E4241810290
		// "Generalization::containsParent"
		return parent != null;
		// -end- 335C146B0352 test_body3E4241810290
		// "Generalization::containsParent"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B0352 _link_body3E4241810290
	// "Generalization::_linkParent"
	public void _linkParent(GeneralizableElement parent1) {
		parent = parent1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkParent"));
		return;
	}
	// -end- 335C146B0352 _link_body3E4241810290 "Generalization::_linkParent"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B0352 _unlink_body3E4241810290
	// "Generalization::_unlinkParent"
	public void _unlinkParent(GeneralizableElement parent1) {
		parent = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkParent"));
		return;
	}
	// -end- 335C146B0352 _unlink_body3E4241810290
	// "Generalization::_unlinkParent"

	// -beg- preserve=no 36E96A870370 code3E4241810290 "powertype"
	private Classifier powertype;
	// -end- 36E96A870370 code3E4241810290 "powertype"

	/**
	 * attaches a Powertype.
	 *
	 * @see #detachPowertype
	 * @see #getPowertype
	 * @see #containsPowertype
	 */
	// -beg- preserve=no 36E96A870370 attach_head3E4241810290
	// "Generalization::attachPowertype"
	public void attachPowertype(Classifier powertype1)
	// -end- 36E96A870370 attach_head3E4241810290
	// "Generalization::attachPowertype"
	{
		// -beg- preserve=no 36E96A870370 attach_body3E4241810290
		// "Generalization::attachPowertype"
		if (powertype != null) {
			throw new java.lang.IllegalStateException("already a powertype attached");
		}
		if (powertype1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as powertype");
		}
		powertype = powertype1;
		powertype1._linkPowertypeRange(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachPowertype"));
		return;
		// -end- 36E96A870370 attach_body3E4241810290
		// "Generalization::attachPowertype"
	}

	/**
	 * disconnect the currently attached Powertype.
	 * 
	 * @see #attachPowertype
	 */
	// -beg- preserve=no 36E96A870370 detach_head3E4241810290
	// "Generalization::detachPowertype"
	public Classifier detachPowertype()
	// -end- 36E96A870370 detach_head3E4241810290
	// "Generalization::detachPowertype"
	{
		// -beg- preserve=no 36E96A870370 detach_body3E4241810290
		// "Generalization::detachPowertype"
		Classifier ret = null;
		if (powertype != null) {
			powertype._unlinkPowertypeRange(this);
			ret = powertype;
			powertype = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachPowertype"));
		return ret;
		// -end- 36E96A870370 detach_body3E4241810290
		// "Generalization::detachPowertype"
	}

	/**
	 * get the currently attached Powertype.
	 * 
	 * @see #attachPowertype
	 */
	// -beg- preserve=no 36E96A870370 get_head3E4241810290
	// "Generalization::getPowertype"
	public Classifier getPowertype()
	// -end- 36E96A870370 get_head3E4241810290 "Generalization::getPowertype"
	{
		// -beg- preserve=no 36E96A870370 get_body3E4241810290
		// "Generalization::getPowertype"
		if (powertype == null) {
			throw new java.lang.IllegalStateException("no powertype attached");
		}
		return powertype;
		// -end- 36E96A870370 get_body3E4241810290
		// "Generalization::getPowertype"
	}

	/**
	 * tests if there is a Powertype attached.
	 * 
	 * @see #attachPowertype
	 */
	// -beg- preserve=no 36E96A870370 test_head3E4241810290
	// "Generalization::containsPowertype"
	public boolean containsPowertype()
	// -end- 36E96A870370 test_head3E4241810290
	// "Generalization::containsPowertype"
	{
		// -beg- preserve=no 36E96A870370 test_body3E4241810290
		// "Generalization::containsPowertype"
		return powertype != null;
		// -end- 36E96A870370 test_body3E4241810290
		// "Generalization::containsPowertype"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A870370 _link_body3E4241810290
	// "Generalization::_linkPowertype"
	public void _linkPowertype(Classifier powertype1) {
		powertype = powertype1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkPowertype"));
		return;
	}
	// -end- 36E96A870370 _link_body3E4241810290
	// "Generalization::_linkPowertype"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A870370 _unlink_body3E4241810290
	// "Generalization::_unlinkPowertype"
	public void _unlinkPowertype(Classifier powertype1) {
		powertype = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkPowertype"));
		return;
	}
	// -end- 36E96A870370 _unlink_body3E4241810290
	// "Generalization::_unlinkPowertype"

	// -beg- preserve=no 362409A9000A code3E4241810290 "presentation"

	// -end- 362409A9000A code3E4241810290 "presentation"

	/**
	 * add a Presentation.
	 *
	 * @see #removePresentation
	 * @see #containsPresentation
	 * @see #iteratorPresentation
	 * @see #clearPresentation
	 * @see #sizePresentation
	 */
	// -beg- preserve=no 362409A9000A add_head3E4241810290
	// "ModelElement::addPresentation"
	public void addPresentation(PresentationElement presentation1)
	// -end- 362409A9000A add_head3E4241810290 "ModelElement::addPresentation"
	{
		// -beg- preserve=no 362409A9000A add_body3E4241810290
		// "ModelElement::addPresentation"
		super.addPresentation(presentation1);
		// -end- 362409A9000A add_body3E4241810290
		// "ModelElement::addPresentation"
	}

	/**
	 * disconnect a Presentation.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_head3E4241810290
	// "ModelElement::removePresentation"
	public PresentationElement removePresentation(PresentationElement presentation1)
	// -end- 362409A9000A remove_head3E4241810290
	// "ModelElement::removePresentation"
	{
		// -beg- preserve=no 362409A9000A remove_body3E4241810290
		// "ModelElement::removePresentation"
		return super.removePresentation(presentation1);
		// -end- 362409A9000A remove_body3E4241810290
		// "ModelElement::removePresentation"
	}

	/**
	 * tests if a given Presentation is connected.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A test_head3E4241810290
	// "ModelElement::containsPresentation"
	public boolean containsPresentation(PresentationElement presentation1)
	// -end- 362409A9000A test_head3E4241810290
	// "ModelElement::containsPresentation"
	{
		// -beg- preserve=no 362409A9000A test_body3E4241810290
		// "ModelElement::containsPresentation"
		return super.containsPresentation(presentation1);
		// -end- 362409A9000A test_body3E4241810290
		// "ModelElement::containsPresentation"
	}

	/**
	 * used to enumerate all connected Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A get_all_head3E4241810290
	// "ModelElement::iteratorPresentation"
	public Iterator<?> iteratorPresentation()
	// -end- 362409A9000A get_all_head3E4241810290
	// "ModelElement::iteratorPresentation"
	{
		// -beg- preserve=no 362409A9000A get_all_body3E4241810290
		// "ModelElement::iteratorPresentation"
		return super.iteratorPresentation();
		// -end- 362409A9000A get_all_body3E4241810290
		// "ModelElement::iteratorPresentation"
	}

	/**
	 * disconnect all Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_all_head3E4241810290
	// "ModelElement::clearPresentation"
	public void clearPresentation()
	// -end- 362409A9000A remove_all_head3E4241810290
	// "ModelElement::clearPresentation"
	{
		// -beg- preserve=no 362409A9000A remove_all_body3E4241810290
		// "ModelElement::clearPresentation"
		super.clearPresentation();
		// -end- 362409A9000A remove_all_body3E4241810290
		// "ModelElement::clearPresentation"
	}

	/**
	 * returns the number of Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A size_head3E4241810290
	// "ModelElement::sizePresentation"
	public int sizePresentation()
	// -end- 362409A9000A size_head3E4241810290 "ModelElement::sizePresentation"
	{
		// -beg- preserve=no 362409A9000A size_body3E4241810290
		// "ModelElement::sizePresentation"
		return super.sizePresentation();
		// -end- 362409A9000A size_body3E4241810290
		// "ModelElement::sizePresentation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _link_body3E4241810290
	// "ModelElement::_linkPresentation"
	public void _linkPresentation(PresentationElement presentation1) {
		super._linkPresentation(presentation1);
	}
	// -end- 362409A9000A _link_body3E4241810290
	// "ModelElement::_linkPresentation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _unlink_body3E4241810290
	// "ModelElement::_unlinkPresentation"
	public void _unlinkPresentation(PresentationElement presentation1) {
		super._unlinkPresentation(presentation1);
	}
	// -end- 362409A9000A _unlink_body3E4241810290
	// "ModelElement::_unlinkPresentation"

	// -beg- preserve=no 33E666CA01D6 var3E4241810290 "discriminator"
	private NlsString discriminator = null;
	// -end- 33E666CA01D6 var3E4241810290 "discriminator"

	/**
	 * get current value of discriminator
	 * 
	 * @see #setDiscriminator
	 */
	// -beg- preserve=no 33E666CA01D6 get_head3E4241810290 "discriminator"
	public NlsString getDiscriminator()
	// -end- 33E666CA01D6 get_head3E4241810290 "discriminator"
	{
		// -beg- preserve=no 33E666CA01D6 get_body3E4241810290 "discriminator"
		return discriminator;
		// -end- 33E666CA01D6 get_body3E4241810290 "discriminator"
	}

	/**
	 * set current value of discriminator
	 * 
	 * @see #getDiscriminator
	 */
	// -beg- preserve=no 33E666CA01D6 set_head3E4241810290 "discriminator"
	public void setDiscriminator(NlsString value1)
	// -end- 33E666CA01D6 set_head3E4241810290 "discriminator"
	{
		// -beg- preserve=no 33E666CA01D6 set_body3E4241810290 "discriminator"
		if (discriminator != value1 && (discriminator == null || !discriminator.equals(value1))) {
			discriminator = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setDiscriminator"));
		}
		// -end- 33E666CA01D6 set_body3E4241810290 "discriminator"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3E4241810290 detail_end "AbstractGeneralization"

	// -end- 3E4241810290 detail_end "AbstractGeneralization"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
