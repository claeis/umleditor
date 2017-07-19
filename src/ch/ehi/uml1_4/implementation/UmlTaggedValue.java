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


        // -beg- preserve=no 448D24F502DB package "UmlTaggedValue"
package ch.ehi.uml1_4.implementation;
        // -end- 448D24F502DB package "UmlTaggedValue"

        // -beg- preserve=no 448D24F502DB autoimport "UmlTaggedValue"
        import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
        import ch.ehi.basics.tools.AbstractVisitor;
        import ch.ehi.uml1_4.foundation.core.ModelElement;
        import ch.ehi.basics.types.NlsString;
        import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
        import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
        import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
        import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
        import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
        import ch.ehi.uml1_4.foundation.core.Namespace;
        import ch.ehi.uml1_4.foundation.core.ElementOwnership;
        import ch.ehi.uml1_4.foundation.core.Dependency;
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
        // -end- 448D24F502DB autoimport "UmlTaggedValue"

        // import declarations
        // please fill in/modify the following section
        // -beg- preserve=no 448D24F502DB import "UmlTaggedValue"

        // -end- 448D24F502DB import "UmlTaggedValue"

        /** @author Claude Eisenhut
         *  @version $Revision: 1.1 $ $Date: 2006-06-13 14:36:23 $
         */
public class UmlTaggedValue implements TaggedValue
        {
          // declare/define something only in the code
          // please fill in/modify the following section
          // -beg- preserve=no 448D24F502DB detail_begin "UmlTaggedValue"

          // -end- 448D24F502DB detail_begin "UmlTaggedValue"

          // -beg- preserve=no 448D366F02B6 head448D24F502DB "unlinkAll"
          public void unlinkAll()
          // -end- 448D366F02B6 head448D24F502DB "unlinkAll"
            // declare any checked exceptions
            // please fill in/modify the following section
            // -beg- preserve=no 448D366F02B6 throws448D24F502DB "unlinkAll"

            // -end- 448D366F02B6 throws448D24F502DB "unlinkAll"
            {
            // please fill in/modify the following section
            // -beg- preserve=no 448D366F02B6 body448D24F502DB "unlinkAll"
            
            detachModelElement();
            // Role Type: TagDefinition object(s) may point to this
            clearReferenceValue();
            setDocumentation(null);
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
            setName(null);
            
            // -end- 448D366F02B6 body448D24F502DB "unlinkAll"
            }

          // -beg- preserve=no 448D366F02C0 head448D24F502DB "enumerateChildren"
          public void enumerateChildren(AbstractVisitor visitor)
          // -end- 448D366F02C0 head448D24F502DB "enumerateChildren"
            // declare any checked exceptions
            // please fill in/modify the following section
            // -beg- preserve=no 448D366F02C0 throws448D24F502DB "enumerateChildren"

            // -end- 448D366F02C0 throws448D24F502DB "enumerateChildren"
            {
            // please fill in/modify the following section
            // -beg- preserve=no 448D366F02C0 body448D24F502DB "enumerateChildren"
            java.util.Iterator it=null;
            visitor.visit(getDocumentation());
            it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
            it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
            it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
            visitor.visit(getName());
            
            // -end- 448D366F02C0 body448D24F502DB "enumerateChildren"
            }

          // -beg- preserve=no 33E901E10028 code448D24F502DB "modelElement"
          private ModelElement modelElement;
          // -end- 33E901E10028 code448D24F502DB "modelElement"

          /** attaches a ModelElement.
           *  
           *  @see #detachModelElement
           *  @see #getModelElement
           *  @see #containsModelElement
           */
          // -beg- preserve=no 33E901E10028 attach_head448D24F502DB "TaggedValue::attachModelElement"
          public void attachModelElement(ModelElement modelElement1)
          // -end- 33E901E10028 attach_head448D24F502DB "TaggedValue::attachModelElement"
          {
            // -beg- preserve=no 33E901E10028 attach_body448D24F502DB "TaggedValue::attachModelElement"
            if(modelElement!=null) {throw new java.lang.IllegalStateException("already a modelElement attached");}
            if(modelElement1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as modelElement");}
            modelElement = modelElement1;
            modelElement1._linkTaggedValue(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachModelElement"));
            return;
            // -end- 33E901E10028 attach_body448D24F502DB "TaggedValue::attachModelElement"
          }

          /** disconnect the currently attached ModelElement.
           *  @see #attachModelElement
           */
          // -beg- preserve=no 33E901E10028 detach_head448D24F502DB "TaggedValue::detachModelElement"
          public ModelElement detachModelElement()
          // -end- 33E901E10028 detach_head448D24F502DB "TaggedValue::detachModelElement"
          {
            // -beg- preserve=no 33E901E10028 detach_body448D24F502DB "TaggedValue::detachModelElement"
            ModelElement ret = null;
            if(modelElement!=null){
              modelElement._unlinkTaggedValue(this);
              ret = modelElement;
              modelElement = null;
            }
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachModelElement"));
            return ret;
            // -end- 33E901E10028 detach_body448D24F502DB "TaggedValue::detachModelElement"
          }

          /** get the currently attached ModelElement.
           *  @see #attachModelElement
           */
          // -beg- preserve=no 33E901E10028 get_head448D24F502DB "TaggedValue::getModelElement"
          public ModelElement getModelElement()
          // -end- 33E901E10028 get_head448D24F502DB "TaggedValue::getModelElement"
          {
            // -beg- preserve=no 33E901E10028 get_body448D24F502DB "TaggedValue::getModelElement"
            if(modelElement==null) {throw new java.lang.IllegalStateException("no modelElement attached");}
            return modelElement;
            // -end- 33E901E10028 get_body448D24F502DB "TaggedValue::getModelElement"
          }

          /** tests if there is a ModelElement attached.
           *  @see #attachModelElement
           */
          // -beg- preserve=no 33E901E10028 test_head448D24F502DB "TaggedValue::containsModelElement"
          public boolean containsModelElement()
          // -end- 33E901E10028 test_head448D24F502DB "TaggedValue::containsModelElement"
          {
            // -beg- preserve=no 33E901E10028 test_body448D24F502DB "TaggedValue::containsModelElement"
            return modelElement!=null;
            // -end- 33E901E10028 test_body448D24F502DB "TaggedValue::containsModelElement"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33E901E10028 _link_body448D24F502DB "TaggedValue::_linkModelElement"
          public void _linkModelElement(ModelElement modelElement1)
          {
            modelElement = modelElement1;
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkModelElement"));
            return;
          }
          // -end- 33E901E10028 _link_body448D24F502DB "TaggedValue::_linkModelElement"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33E901E10028 _unlink_body448D24F502DB "TaggedValue::_unlinkModelElement"
          public void _unlinkModelElement(ModelElement modelElement1)
          {
            modelElement = null;
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkModelElement"));
            return;
          }
          // -end- 33E901E10028 _unlink_body448D24F502DB "TaggedValue::_unlinkModelElement"

          // -beg- preserve=no 39B9B0F80000 code448D24F502DB "referenceValue"
          private java.util.Set referenceValue = new java.util.HashSet();
          // -end- 39B9B0F80000 code448D24F502DB "referenceValue"

          /** add a ReferenceValue.
           *  
           *  @see #removeReferenceValue
           *  @see #containsReferenceValue
           *  @see #iteratorReferenceValue
           *  @see #clearReferenceValue
           *  @see #sizeReferenceValue
           */
          // -beg- preserve=no 39B9B0F80000 add_head448D24F502DB "TaggedValue::addReferenceValue"
          public void addReferenceValue(ModelElement referenceValue1)
          // -end- 39B9B0F80000 add_head448D24F502DB "TaggedValue::addReferenceValue"
          {
            // -beg- preserve=no 39B9B0F80000 add_body448D24F502DB "TaggedValue::addReferenceValue"
            referenceValue.add(referenceValue1);
            referenceValue1._linkReferenceTag(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addReferenceValue"));
            return;
            // -end- 39B9B0F80000 add_body448D24F502DB "TaggedValue::addReferenceValue"
          }

          /** disconnect a ReferenceValue.
           *  @see #addReferenceValue
           */
          // -beg- preserve=no 39B9B0F80000 remove_head448D24F502DB "TaggedValue::removeReferenceValue"
          public ModelElement removeReferenceValue(ModelElement referenceValue1)
          // -end- 39B9B0F80000 remove_head448D24F502DB "TaggedValue::removeReferenceValue"
          {
            // -beg- preserve=no 39B9B0F80000 remove_body448D24F502DB "TaggedValue::removeReferenceValue"
            ModelElement ret=null;
            if(referenceValue1==null || !referenceValue.contains(referenceValue1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = referenceValue1;
            referenceValue.remove(referenceValue1);
            referenceValue1._unlinkReferenceTag(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeReferenceValue"));
            return ret;
            // -end- 39B9B0F80000 remove_body448D24F502DB "TaggedValue::removeReferenceValue"
          }

          /** tests if a given ReferenceValue is connected.
           *  @see #addReferenceValue
           */
          // -beg- preserve=no 39B9B0F80000 test_head448D24F502DB "TaggedValue::containsReferenceValue"
          public boolean containsReferenceValue(ModelElement referenceValue1)
          // -end- 39B9B0F80000 test_head448D24F502DB "TaggedValue::containsReferenceValue"
          {
            // -beg- preserve=no 39B9B0F80000 test_body448D24F502DB "TaggedValue::containsReferenceValue"
            return referenceValue.contains(referenceValue1);
            // -end- 39B9B0F80000 test_body448D24F502DB "TaggedValue::containsReferenceValue"
          }

          /** used to enumerate all connected ReferenceValues.
           *  @see #addReferenceValue
           */
          // -beg- preserve=no 39B9B0F80000 get_all_head448D24F502DB "TaggedValue::iteratorReferenceValue"
          public java.util.Iterator iteratorReferenceValue()
          // -end- 39B9B0F80000 get_all_head448D24F502DB "TaggedValue::iteratorReferenceValue"
          {
            // -beg- preserve=no 39B9B0F80000 get_all_body448D24F502DB "TaggedValue::iteratorReferenceValue"
            return referenceValue.iterator();
            // -end- 39B9B0F80000 get_all_body448D24F502DB "TaggedValue::iteratorReferenceValue"
          }

          /** disconnect all ReferenceValues.
           *  @see #addReferenceValue
           */
          // -beg- preserve=no 39B9B0F80000 remove_all_head448D24F502DB "TaggedValue::clearReferenceValue"
          public void clearReferenceValue()
          // -end- 39B9B0F80000 remove_all_head448D24F502DB "TaggedValue::clearReferenceValue"
          {
            // -beg- preserve=no 39B9B0F80000 remove_all_body448D24F502DB "TaggedValue::clearReferenceValue"
            if(sizeReferenceValue()>0){
              for(java.util.Iterator p = referenceValue.iterator(); p.hasNext();){
                ((ModelElement)p.next())._unlinkReferenceTag(this);
              }
              referenceValue.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearReferenceValue"));
            }
            // -end- 39B9B0F80000 remove_all_body448D24F502DB "TaggedValue::clearReferenceValue"
          }

          /** returns the number of ReferenceValues.
           *  @see #addReferenceValue
           */
          // -beg- preserve=no 39B9B0F80000 size_head448D24F502DB "TaggedValue::sizeReferenceValue"
          public int sizeReferenceValue()
          // -end- 39B9B0F80000 size_head448D24F502DB "TaggedValue::sizeReferenceValue"
          {
            // -beg- preserve=no 39B9B0F80000 size_body448D24F502DB "TaggedValue::sizeReferenceValue"
            return referenceValue.size();
            // -end- 39B9B0F80000 size_body448D24F502DB "TaggedValue::sizeReferenceValue"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 39B9B0F80000 _link_body448D24F502DB "TaggedValue::_linkReferenceValue"
          public void _linkReferenceValue(ModelElement referenceValue1)
          {
            referenceValue.add(referenceValue1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkReferenceValue"));
            return;
          }
          // -end- 39B9B0F80000 _link_body448D24F502DB "TaggedValue::_linkReferenceValue"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 39B9B0F80000 _unlink_body448D24F502DB "TaggedValue::_unlinkReferenceValue"
          public void _unlinkReferenceValue(ModelElement referenceValue1)
          {
            referenceValue.remove(referenceValue1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkReferenceValue"));
            return;
          }
          // -end- 39B9B0F80000 _unlink_body448D24F502DB "TaggedValue::_unlinkReferenceValue"

          // -beg- preserve=no 337A50700273 var448D24F502DB "dataValue"
          private String dataValue;
          // -end- 337A50700273 var448D24F502DB "dataValue"

          /** get current value of dataValue
           *  Specifies the set of values that are part of the tagged value.
           *  @see #setDataValue
           */
          // -beg- preserve=no 337A50700273 get_head448D24F502DB "dataValue"
          public  String getDataValue()
          // -end- 337A50700273 get_head448D24F502DB "dataValue"
          {
            // -beg- preserve=no 337A50700273 get_body448D24F502DB "dataValue"
            return dataValue;
            // -end- 337A50700273 get_body448D24F502DB "dataValue"
          }

          /** set current value of dataValue
           *  @see #getDataValue
           */
          // -beg- preserve=no 337A50700273 set_head448D24F502DB "dataValue"
          public  void setDataValue(String value1)
          // -end- 337A50700273 set_head448D24F502DB "dataValue"
          {
            // -beg- preserve=no 337A50700273 set_body448D24F502DB "dataValue"
            if(dataValue != value1){
              dataValue = value1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDataValue"));
            }
            // -end- 337A50700273 set_body448D24F502DB "dataValue"
          }

          // -beg- preserve=no 3C1DF92B0234 var448D24F502DB "documentation"
          private NlsString documentation = null;
          // -end- 3C1DF92B0234 var448D24F502DB "documentation"

          /** get current value of documentation
           *  @see #setDocumentation
           */
          // -beg- preserve=no 3C1DF92B0234 get_head448D24F502DB "documentation"
          public  NlsString getDocumentation()
          // -end- 3C1DF92B0234 get_head448D24F502DB "documentation"
          {
            // -beg- preserve=no 3C1DF92B0234 get_body448D24F502DB "documentation"
            return documentation;
            // -end- 3C1DF92B0234 get_body448D24F502DB "documentation"
          }

          /** set current value of documentation
           *  @see #getDocumentation
           */
          // -beg- preserve=no 3C1DF92B0234 set_head448D24F502DB "documentation"
          public  void setDocumentation(NlsString value1)
          // -end- 3C1DF92B0234 set_head448D24F502DB "documentation"
          {
            // -beg- preserve=no 3C1DF92B0234 set_body448D24F502DB "documentation"
            if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
              documentation = value1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
            }
            // -end- 3C1DF92B0234 set_body448D24F502DB "documentation"
          }

          // -beg- preserve=no 3CE2221702C6 head448D24F502DB "getDefLangName"
          public String getDefLangName()
          // -end- 3CE2221702C6 head448D24F502DB "getDefLangName"
            // declare any checked exceptions
            // please fill in/modify the following section
            // -beg- preserve=no 3CE2221702C6 throws448D24F502DB "getDefLangName"

            // -end- 3CE2221702C6 throws448D24F502DB "getDefLangName"
            {
            // please fill in/modify the following section
            // -beg- preserve=no 3CE2221702C6 body448D24F502DB "getDefLangName"
            return null;
            // -end- 3CE2221702C6 body448D24F502DB "getDefLangName"
            }

          // -beg- preserve=no 3CE222250149 head448D24F502DB "setDefLangName"
          public void setDefLangName(String name)
          // -end- 3CE222250149 head448D24F502DB "setDefLangName"
            // declare any checked exceptions
            // please fill in/modify the following section
            // -beg- preserve=no 3CE222250149 throws448D24F502DB "setDefLangName"

            // -end- 3CE222250149 throws448D24F502DB "setDefLangName"
            {
            // please fill in/modify the following section
            // -beg- preserve=no 3CE222250149 body448D24F502DB "setDefLangName"
            return;
            // -end- 3CE222250149 body448D24F502DB "setDefLangName"
            }

          // -beg- preserve=no 33CF8BD500F1 code448D24F502DB "behavior"
          private java.util.Set behavior = new java.util.HashSet();
          // -end- 33CF8BD500F1 code448D24F502DB "behavior"

          /** add a Behavior.
           *  
           *  @see #removeBehavior
           *  @see #containsBehavior
           *  @see #iteratorBehavior
           *  @see #clearBehavior
           *  @see #sizeBehavior
           */
          // -beg- preserve=no 33CF8BD500F1 add_head448D24F502DB "ModelElement::addBehavior"
          public void addBehavior(StateMachine behavior1)
          // -end- 33CF8BD500F1 add_head448D24F502DB "ModelElement::addBehavior"
          {
            // -beg- preserve=no 33CF8BD500F1 add_body448D24F502DB "ModelElement::addBehavior"
            behavior.add(behavior1);
            behavior1._linkContext(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addBehavior"));
            return;
            // -end- 33CF8BD500F1 add_body448D24F502DB "ModelElement::addBehavior"
          }

          /** disconnect a Behavior.
           *  @see #addBehavior
           */
          // -beg- preserve=no 33CF8BD500F1 remove_head448D24F502DB "ModelElement::removeBehavior"
          public StateMachine removeBehavior(StateMachine behavior1)
          // -end- 33CF8BD500F1 remove_head448D24F502DB "ModelElement::removeBehavior"
          {
            // -beg- preserve=no 33CF8BD500F1 remove_body448D24F502DB "ModelElement::removeBehavior"
            StateMachine ret=null;
            if(behavior1==null || !behavior.contains(behavior1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = behavior1;
            behavior.remove(behavior1);
            behavior1._unlinkContext(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeBehavior"));
            return ret;
            // -end- 33CF8BD500F1 remove_body448D24F502DB "ModelElement::removeBehavior"
          }

          /** tests if a given Behavior is connected.
           *  @see #addBehavior
           */
          // -beg- preserve=no 33CF8BD500F1 test_head448D24F502DB "ModelElement::containsBehavior"
          public boolean containsBehavior(StateMachine behavior1)
          // -end- 33CF8BD500F1 test_head448D24F502DB "ModelElement::containsBehavior"
          {
            // -beg- preserve=no 33CF8BD500F1 test_body448D24F502DB "ModelElement::containsBehavior"
            return behavior.contains(behavior1);
            // -end- 33CF8BD500F1 test_body448D24F502DB "ModelElement::containsBehavior"
          }

          /** used to enumerate all connected Behaviors.
           *  @see #addBehavior
           */
          // -beg- preserve=no 33CF8BD500F1 get_all_head448D24F502DB "ModelElement::iteratorBehavior"
          public java.util.Iterator iteratorBehavior()
          // -end- 33CF8BD500F1 get_all_head448D24F502DB "ModelElement::iteratorBehavior"
          {
            // -beg- preserve=no 33CF8BD500F1 get_all_body448D24F502DB "ModelElement::iteratorBehavior"
            return behavior.iterator();
            // -end- 33CF8BD500F1 get_all_body448D24F502DB "ModelElement::iteratorBehavior"
          }

          /** disconnect all Behaviors.
           *  @see #addBehavior
           */
          // -beg- preserve=no 33CF8BD500F1 remove_all_head448D24F502DB "ModelElement::clearBehavior"
          public void clearBehavior()
          // -end- 33CF8BD500F1 remove_all_head448D24F502DB "ModelElement::clearBehavior"
          {
            // -beg- preserve=no 33CF8BD500F1 remove_all_body448D24F502DB "ModelElement::clearBehavior"
            if(sizeBehavior()>0){
              for(java.util.Iterator p = behavior.iterator(); p.hasNext();){
                ((StateMachine)p.next())._unlinkContext(this);
              }
              behavior.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearBehavior"));
            }
            // -end- 33CF8BD500F1 remove_all_body448D24F502DB "ModelElement::clearBehavior"
          }

          /** returns the number of Behaviors.
           *  @see #addBehavior
           */
          // -beg- preserve=no 33CF8BD500F1 size_head448D24F502DB "ModelElement::sizeBehavior"
          public int sizeBehavior()
          // -end- 33CF8BD500F1 size_head448D24F502DB "ModelElement::sizeBehavior"
          {
            // -beg- preserve=no 33CF8BD500F1 size_body448D24F502DB "ModelElement::sizeBehavior"
            return behavior.size();
            // -end- 33CF8BD500F1 size_body448D24F502DB "ModelElement::sizeBehavior"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33CF8BD500F1 _link_body448D24F502DB "ModelElement::_linkBehavior"
          public void _linkBehavior(StateMachine behavior1)
          {
            behavior.add(behavior1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkBehavior"));
            return;
          }
          // -end- 33CF8BD500F1 _link_body448D24F502DB "ModelElement::_linkBehavior"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33CF8BD500F1 _unlink_body448D24F502DB "ModelElement::_unlinkBehavior"
          public void _unlinkBehavior(StateMachine behavior1)
          {
            behavior.remove(behavior1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkBehavior"));
            return;
          }
          // -end- 33CF8BD500F1 _unlink_body448D24F502DB "ModelElement::_unlinkBehavior"

          // -beg- preserve=no 33CF9A030140 code448D24F502DB "partition"
          private java.util.Set partition = new java.util.HashSet();
          // -end- 33CF9A030140 code448D24F502DB "partition"

          /** add a Partition.
           *  
           *  @see #removePartition
           *  @see #containsPartition
           *  @see #iteratorPartition
           *  @see #clearPartition
           *  @see #sizePartition
           */
          // -beg- preserve=no 33CF9A030140 add_head448D24F502DB "ModelElement::addPartition"
          public void addPartition(Partition partition1)
          // -end- 33CF9A030140 add_head448D24F502DB "ModelElement::addPartition"
          {
            // -beg- preserve=no 33CF9A030140 add_body448D24F502DB "ModelElement::addPartition"
            partition.add(partition1);
            partition1._linkContents(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPartition"));
            return;
            // -end- 33CF9A030140 add_body448D24F502DB "ModelElement::addPartition"
          }

          /** disconnect a Partition.
           *  @see #addPartition
           */
          // -beg- preserve=no 33CF9A030140 remove_head448D24F502DB "ModelElement::removePartition"
          public Partition removePartition(Partition partition1)
          // -end- 33CF9A030140 remove_head448D24F502DB "ModelElement::removePartition"
          {
            // -beg- preserve=no 33CF9A030140 remove_body448D24F502DB "ModelElement::removePartition"
            Partition ret=null;
            if(partition1==null || !partition.contains(partition1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = partition1;
            partition.remove(partition1);
            partition1._unlinkContents(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePartition"));
            return ret;
            // -end- 33CF9A030140 remove_body448D24F502DB "ModelElement::removePartition"
          }

          /** tests if a given Partition is connected.
           *  @see #addPartition
           */
          // -beg- preserve=no 33CF9A030140 test_head448D24F502DB "ModelElement::containsPartition"
          public boolean containsPartition(Partition partition1)
          // -end- 33CF9A030140 test_head448D24F502DB "ModelElement::containsPartition"
          {
            // -beg- preserve=no 33CF9A030140 test_body448D24F502DB "ModelElement::containsPartition"
            return partition.contains(partition1);
            // -end- 33CF9A030140 test_body448D24F502DB "ModelElement::containsPartition"
          }

          /** used to enumerate all connected Partitions.
           *  @see #addPartition
           */
          // -beg- preserve=no 33CF9A030140 get_all_head448D24F502DB "ModelElement::iteratorPartition"
          public java.util.Iterator iteratorPartition()
          // -end- 33CF9A030140 get_all_head448D24F502DB "ModelElement::iteratorPartition"
          {
            // -beg- preserve=no 33CF9A030140 get_all_body448D24F502DB "ModelElement::iteratorPartition"
            return partition.iterator();
            // -end- 33CF9A030140 get_all_body448D24F502DB "ModelElement::iteratorPartition"
          }

          /** disconnect all Partitions.
           *  @see #addPartition
           */
          // -beg- preserve=no 33CF9A030140 remove_all_head448D24F502DB "ModelElement::clearPartition"
          public void clearPartition()
          // -end- 33CF9A030140 remove_all_head448D24F502DB "ModelElement::clearPartition"
          {
            // -beg- preserve=no 33CF9A030140 remove_all_body448D24F502DB "ModelElement::clearPartition"
            if(sizePartition()>0){
              for(java.util.Iterator p = partition.iterator(); p.hasNext();){
                ((Partition)p.next())._unlinkContents(this);
              }
              partition.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPartition"));
            }
            // -end- 33CF9A030140 remove_all_body448D24F502DB "ModelElement::clearPartition"
          }

          /** returns the number of Partitions.
           *  @see #addPartition
           */
          // -beg- preserve=no 33CF9A030140 size_head448D24F502DB "ModelElement::sizePartition"
          public int sizePartition()
          // -end- 33CF9A030140 size_head448D24F502DB "ModelElement::sizePartition"
          {
            // -beg- preserve=no 33CF9A030140 size_body448D24F502DB "ModelElement::sizePartition"
            return partition.size();
            // -end- 33CF9A030140 size_body448D24F502DB "ModelElement::sizePartition"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33CF9A030140 _link_body448D24F502DB "ModelElement::_linkPartition"
          public void _linkPartition(Partition partition1)
          {
            partition.add(partition1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPartition"));
            return;
          }
          // -end- 33CF9A030140 _link_body448D24F502DB "ModelElement::_linkPartition"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33CF9A030140 _unlink_body448D24F502DB "ModelElement::_unlinkPartition"
          public void _unlinkPartition(Partition partition1)
          {
            partition.remove(partition1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPartition"));
            return;
          }
          // -end- 33CF9A030140 _unlink_body448D24F502DB "ModelElement::_unlinkPartition"

          // -beg- preserve=no 33D1394E029F code448D24F502DB "collaboration"
          private java.util.Set collaboration = new java.util.HashSet();
          // -end- 33D1394E029F code448D24F502DB "collaboration"

          /** add a Collaboration.
           *  
           *  @see #removeCollaboration
           *  @see #containsCollaboration
           *  @see #iteratorCollaboration
           *  @see #clearCollaboration
           *  @see #sizeCollaboration
           */
          // -beg- preserve=no 33D1394E029F add_head448D24F502DB "ModelElement::addCollaboration"
          public void addCollaboration(Collaboration collaboration1)
          // -end- 33D1394E029F add_head448D24F502DB "ModelElement::addCollaboration"
          {
            // -beg- preserve=no 33D1394E029F add_body448D24F502DB "ModelElement::addCollaboration"
            collaboration.add(collaboration1);
            collaboration1._linkConstrainingElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCollaboration"));
            return;
            // -end- 33D1394E029F add_body448D24F502DB "ModelElement::addCollaboration"
          }

          /** disconnect a Collaboration.
           *  @see #addCollaboration
           */
          // -beg- preserve=no 33D1394E029F remove_head448D24F502DB "ModelElement::removeCollaboration"
          public Collaboration removeCollaboration(Collaboration collaboration1)
          // -end- 33D1394E029F remove_head448D24F502DB "ModelElement::removeCollaboration"
          {
            // -beg- preserve=no 33D1394E029F remove_body448D24F502DB "ModelElement::removeCollaboration"
            Collaboration ret=null;
            if(collaboration1==null || !collaboration.contains(collaboration1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = collaboration1;
            collaboration.remove(collaboration1);
            collaboration1._unlinkConstrainingElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCollaboration"));
            return ret;
            // -end- 33D1394E029F remove_body448D24F502DB "ModelElement::removeCollaboration"
          }

          /** tests if a given Collaboration is connected.
           *  @see #addCollaboration
           */
          // -beg- preserve=no 33D1394E029F test_head448D24F502DB "ModelElement::containsCollaboration"
          public boolean containsCollaboration(Collaboration collaboration1)
          // -end- 33D1394E029F test_head448D24F502DB "ModelElement::containsCollaboration"
          {
            // -beg- preserve=no 33D1394E029F test_body448D24F502DB "ModelElement::containsCollaboration"
            return collaboration.contains(collaboration1);
            // -end- 33D1394E029F test_body448D24F502DB "ModelElement::containsCollaboration"
          }

          /** used to enumerate all connected Collaborations.
           *  @see #addCollaboration
           */
          // -beg- preserve=no 33D1394E029F get_all_head448D24F502DB "ModelElement::iteratorCollaboration"
          public java.util.Iterator iteratorCollaboration()
          // -end- 33D1394E029F get_all_head448D24F502DB "ModelElement::iteratorCollaboration"
          {
            // -beg- preserve=no 33D1394E029F get_all_body448D24F502DB "ModelElement::iteratorCollaboration"
            return collaboration.iterator();
            // -end- 33D1394E029F get_all_body448D24F502DB "ModelElement::iteratorCollaboration"
          }

          /** disconnect all Collaborations.
           *  @see #addCollaboration
           */
          // -beg- preserve=no 33D1394E029F remove_all_head448D24F502DB "ModelElement::clearCollaboration"
          public void clearCollaboration()
          // -end- 33D1394E029F remove_all_head448D24F502DB "ModelElement::clearCollaboration"
          {
            // -beg- preserve=no 33D1394E029F remove_all_body448D24F502DB "ModelElement::clearCollaboration"
            if(sizeCollaboration()>0){
              for(java.util.Iterator p = collaboration.iterator(); p.hasNext();){
                ((Collaboration)p.next())._unlinkConstrainingElement(this);
              }
              collaboration.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCollaboration"));
            }
            // -end- 33D1394E029F remove_all_body448D24F502DB "ModelElement::clearCollaboration"
          }

          /** returns the number of Collaborations.
           *  @see #addCollaboration
           */
          // -beg- preserve=no 33D1394E029F size_head448D24F502DB "ModelElement::sizeCollaboration"
          public int sizeCollaboration()
          // -end- 33D1394E029F size_head448D24F502DB "ModelElement::sizeCollaboration"
          {
            // -beg- preserve=no 33D1394E029F size_body448D24F502DB "ModelElement::sizeCollaboration"
            return collaboration.size();
            // -end- 33D1394E029F size_body448D24F502DB "ModelElement::sizeCollaboration"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33D1394E029F _link_body448D24F502DB "ModelElement::_linkCollaboration"
          public void _linkCollaboration(Collaboration collaboration1)
          {
            collaboration.add(collaboration1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCollaboration"));
            return;
          }
          // -end- 33D1394E029F _link_body448D24F502DB "ModelElement::_linkCollaboration"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33D1394E029F _unlink_body448D24F502DB "ModelElement::_unlinkCollaboration"
          public void _unlinkCollaboration(Collaboration collaboration1)
          {
            collaboration.remove(collaboration1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCollaboration"));
            return;
          }
          // -end- 33D1394E029F _unlink_body448D24F502DB "ModelElement::_unlinkCollaboration"

          // -beg- preserve=no 36008FB700E7 code448D24F502DB "classifierRole"
          private java.util.Set classifierRole = new java.util.HashSet();
          // -end- 36008FB700E7 code448D24F502DB "classifierRole"

          /** add a ClassifierRole.
           *  
           *  @see #removeClassifierRole
           *  @see #containsClassifierRole
           *  @see #iteratorClassifierRole
           *  @see #clearClassifierRole
           *  @see #sizeClassifierRole
           */
          // -beg- preserve=no 36008FB700E7 add_head448D24F502DB "ModelElement::addClassifierRole"
          public void addClassifierRole(ClassifierRole classifierRole1)
          // -end- 36008FB700E7 add_head448D24F502DB "ModelElement::addClassifierRole"
          {
            // -beg- preserve=no 36008FB700E7 add_body448D24F502DB "ModelElement::addClassifierRole"
            classifierRole.add(classifierRole1);
            classifierRole1._linkAvailableContents(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClassifierRole"));
            return;
            // -end- 36008FB700E7 add_body448D24F502DB "ModelElement::addClassifierRole"
          }

          /** disconnect a ClassifierRole.
           *  @see #addClassifierRole
           */
          // -beg- preserve=no 36008FB700E7 remove_head448D24F502DB "ModelElement::removeClassifierRole"
          public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
          // -end- 36008FB700E7 remove_head448D24F502DB "ModelElement::removeClassifierRole"
          {
            // -beg- preserve=no 36008FB700E7 remove_body448D24F502DB "ModelElement::removeClassifierRole"
            ClassifierRole ret=null;
            if(classifierRole1==null || !classifierRole.contains(classifierRole1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = classifierRole1;
            classifierRole.remove(classifierRole1);
            classifierRole1._unlinkAvailableContents(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClassifierRole"));
            return ret;
            // -end- 36008FB700E7 remove_body448D24F502DB "ModelElement::removeClassifierRole"
          }

          /** tests if a given ClassifierRole is connected.
           *  @see #addClassifierRole
           */
          // -beg- preserve=no 36008FB700E7 test_head448D24F502DB "ModelElement::containsClassifierRole"
          public boolean containsClassifierRole(ClassifierRole classifierRole1)
          // -end- 36008FB700E7 test_head448D24F502DB "ModelElement::containsClassifierRole"
          {
            // -beg- preserve=no 36008FB700E7 test_body448D24F502DB "ModelElement::containsClassifierRole"
            return classifierRole.contains(classifierRole1);
            // -end- 36008FB700E7 test_body448D24F502DB "ModelElement::containsClassifierRole"
          }

          /** used to enumerate all connected ClassifierRoles.
           *  @see #addClassifierRole
           */
          // -beg- preserve=no 36008FB700E7 get_all_head448D24F502DB "ModelElement::iteratorClassifierRole"
          public java.util.Iterator iteratorClassifierRole()
          // -end- 36008FB700E7 get_all_head448D24F502DB "ModelElement::iteratorClassifierRole"
          {
            // -beg- preserve=no 36008FB700E7 get_all_body448D24F502DB "ModelElement::iteratorClassifierRole"
            return classifierRole.iterator();
            // -end- 36008FB700E7 get_all_body448D24F502DB "ModelElement::iteratorClassifierRole"
          }

          /** disconnect all ClassifierRoles.
           *  @see #addClassifierRole
           */
          // -beg- preserve=no 36008FB700E7 remove_all_head448D24F502DB "ModelElement::clearClassifierRole"
          public void clearClassifierRole()
          // -end- 36008FB700E7 remove_all_head448D24F502DB "ModelElement::clearClassifierRole"
          {
            // -beg- preserve=no 36008FB700E7 remove_all_body448D24F502DB "ModelElement::clearClassifierRole"
            if(sizeClassifierRole()>0){
              for(java.util.Iterator p = classifierRole.iterator(); p.hasNext();){
                ((ClassifierRole)p.next())._unlinkAvailableContents(this);
              }
              classifierRole.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClassifierRole"));
            }
            // -end- 36008FB700E7 remove_all_body448D24F502DB "ModelElement::clearClassifierRole"
          }

          /** returns the number of ClassifierRoles.
           *  @see #addClassifierRole
           */
          // -beg- preserve=no 36008FB700E7 size_head448D24F502DB "ModelElement::sizeClassifierRole"
          public int sizeClassifierRole()
          // -end- 36008FB700E7 size_head448D24F502DB "ModelElement::sizeClassifierRole"
          {
            // -beg- preserve=no 36008FB700E7 size_body448D24F502DB "ModelElement::sizeClassifierRole"
            return classifierRole.size();
            // -end- 36008FB700E7 size_body448D24F502DB "ModelElement::sizeClassifierRole"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 36008FB700E7 _link_body448D24F502DB "ModelElement::_linkClassifierRole"
          public void _linkClassifierRole(ClassifierRole classifierRole1)
          {
            classifierRole.add(classifierRole1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassifierRole"));
            return;
          }
          // -end- 36008FB700E7 _link_body448D24F502DB "ModelElement::_linkClassifierRole"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 36008FB700E7 _unlink_body448D24F502DB "ModelElement::_unlinkClassifierRole"
          public void _unlinkClassifierRole(ClassifierRole classifierRole1)
          {
            classifierRole.remove(classifierRole1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassifierRole"));
            return;
          }
          // -end- 36008FB700E7 _unlink_body448D24F502DB "ModelElement::_unlinkClassifierRole"

          // -beg- preserve=no 39E9065C0186 code448D24F502DB "collaborationInstanceSet"
          private java.util.Set collaborationInstanceSet = new java.util.HashSet();
          // -end- 39E9065C0186 code448D24F502DB "collaborationInstanceSet"

          /** add a CollaborationInstanceSet.
           *  
           *  @see #removeCollaborationInstanceSet
           *  @see #containsCollaborationInstanceSet
           *  @see #iteratorCollaborationInstanceSet
           *  @see #clearCollaborationInstanceSet
           *  @see #sizeCollaborationInstanceSet
           */
          // -beg- preserve=no 39E9065C0186 add_head448D24F502DB "ModelElement::addCollaborationInstanceSet"
          public void addCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
          // -end- 39E9065C0186 add_head448D24F502DB "ModelElement::addCollaborationInstanceSet"
          {
            // -beg- preserve=no 39E9065C0186 add_body448D24F502DB "ModelElement::addCollaborationInstanceSet"
            collaborationInstanceSet.add(collaborationInstanceSet1);
            collaborationInstanceSet1._linkConstrainingElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCollaborationInstanceSet"));
            return;
            // -end- 39E9065C0186 add_body448D24F502DB "ModelElement::addCollaborationInstanceSet"
          }

          /** disconnect a CollaborationInstanceSet.
           *  @see #addCollaborationInstanceSet
           */
          // -beg- preserve=no 39E9065C0186 remove_head448D24F502DB "ModelElement::removeCollaborationInstanceSet"
          public CollaborationInstanceSet removeCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
          // -end- 39E9065C0186 remove_head448D24F502DB "ModelElement::removeCollaborationInstanceSet"
          {
            // -beg- preserve=no 39E9065C0186 remove_body448D24F502DB "ModelElement::removeCollaborationInstanceSet"
            CollaborationInstanceSet ret=null;
            if(collaborationInstanceSet1==null || !collaborationInstanceSet.contains(collaborationInstanceSet1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = collaborationInstanceSet1;
            collaborationInstanceSet.remove(collaborationInstanceSet1);
            collaborationInstanceSet1._unlinkConstrainingElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCollaborationInstanceSet"));
            return ret;
            // -end- 39E9065C0186 remove_body448D24F502DB "ModelElement::removeCollaborationInstanceSet"
          }

          /** tests if a given CollaborationInstanceSet is connected.
           *  @see #addCollaborationInstanceSet
           */
          // -beg- preserve=no 39E9065C0186 test_head448D24F502DB "ModelElement::containsCollaborationInstanceSet"
          public boolean containsCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
          // -end- 39E9065C0186 test_head448D24F502DB "ModelElement::containsCollaborationInstanceSet"
          {
            // -beg- preserve=no 39E9065C0186 test_body448D24F502DB "ModelElement::containsCollaborationInstanceSet"
            return collaborationInstanceSet.contains(collaborationInstanceSet1);
            // -end- 39E9065C0186 test_body448D24F502DB "ModelElement::containsCollaborationInstanceSet"
          }

          /** used to enumerate all connected CollaborationInstanceSets.
           *  @see #addCollaborationInstanceSet
           */
          // -beg- preserve=no 39E9065C0186 get_all_head448D24F502DB "ModelElement::iteratorCollaborationInstanceSet"
          public java.util.Iterator iteratorCollaborationInstanceSet()
          // -end- 39E9065C0186 get_all_head448D24F502DB "ModelElement::iteratorCollaborationInstanceSet"
          {
            // -beg- preserve=no 39E9065C0186 get_all_body448D24F502DB "ModelElement::iteratorCollaborationInstanceSet"
            return collaborationInstanceSet.iterator();
            // -end- 39E9065C0186 get_all_body448D24F502DB "ModelElement::iteratorCollaborationInstanceSet"
          }

          /** disconnect all CollaborationInstanceSets.
           *  @see #addCollaborationInstanceSet
           */
          // -beg- preserve=no 39E9065C0186 remove_all_head448D24F502DB "ModelElement::clearCollaborationInstanceSet"
          public void clearCollaborationInstanceSet()
          // -end- 39E9065C0186 remove_all_head448D24F502DB "ModelElement::clearCollaborationInstanceSet"
          {
            // -beg- preserve=no 39E9065C0186 remove_all_body448D24F502DB "ModelElement::clearCollaborationInstanceSet"
            if(sizeCollaborationInstanceSet()>0){
              for(java.util.Iterator p = collaborationInstanceSet.iterator(); p.hasNext();){
                ((CollaborationInstanceSet)p.next())._unlinkConstrainingElement(this);
              }
              collaborationInstanceSet.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCollaborationInstanceSet"));
            }
            // -end- 39E9065C0186 remove_all_body448D24F502DB "ModelElement::clearCollaborationInstanceSet"
          }

          /** returns the number of CollaborationInstanceSets.
           *  @see #addCollaborationInstanceSet
           */
          // -beg- preserve=no 39E9065C0186 size_head448D24F502DB "ModelElement::sizeCollaborationInstanceSet"
          public int sizeCollaborationInstanceSet()
          // -end- 39E9065C0186 size_head448D24F502DB "ModelElement::sizeCollaborationInstanceSet"
          {
            // -beg- preserve=no 39E9065C0186 size_body448D24F502DB "ModelElement::sizeCollaborationInstanceSet"
            return collaborationInstanceSet.size();
            // -end- 39E9065C0186 size_body448D24F502DB "ModelElement::sizeCollaborationInstanceSet"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 39E9065C0186 _link_body448D24F502DB "ModelElement::_linkCollaborationInstanceSet"
          public void _linkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
          {
            collaborationInstanceSet.add(collaborationInstanceSet1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCollaborationInstanceSet"));
            return;
          }
          // -end- 39E9065C0186 _link_body448D24F502DB "ModelElement::_linkCollaborationInstanceSet"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 39E9065C0186 _unlink_body448D24F502DB "ModelElement::_unlinkCollaborationInstanceSet"
          public void _unlinkCollaborationInstanceSet(CollaborationInstanceSet collaborationInstanceSet1)
          {
            collaborationInstanceSet.remove(collaborationInstanceSet1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCollaborationInstanceSet"));
            return;
          }
          // -end- 39E9065C0186 _unlink_body448D24F502DB "ModelElement::_unlinkCollaborationInstanceSet"

          // -beg- preserve=no 33598CAA030E code448D24F502DB "namespace"
          private ElementOwnership namespace;
          // -end- 33598CAA030E code448D24F502DB "namespace"

          /** attaches a Namespace.
           *  Designates the Namespace that contains the ModelElement.
           *  @see #detachNamespace
           *  @see #getNamespace
           *  @see #containsNamespace
           *  @see #getNamespaceLink
           *  @see #createNamespaceLink
           */
          // -beg- preserve=no 33598CAA030E attach_head448D24F502DB "ModelElement::attachNamespace"
          public void attachNamespace(Namespace namespace1)
          // -end- 33598CAA030E attach_head448D24F502DB "ModelElement::attachNamespace"
          {
            // -beg- preserve=no 33598CAA030E attach_body448D24F502DB "ModelElement::attachNamespace"
            if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
            if(namespace1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as namespace");}
            namespace = createNamespaceLink();
            namespace.setNamespace(namespace1);
            namespace.setOwnedElement(this);
            namespace1._linkOwnedElement(namespace);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespace"));
            return;
            // -end- 33598CAA030E attach_body448D24F502DB "ModelElement::attachNamespace"
          }

          /** attaches a link to a Namespace.
           *  @see #attachNamespace
           */
          // -beg- preserve=no 33598CAA030E attachlink_head448D24F502DB "ModelElement::attachNamespaceLink"
          public void attachNamespaceLink(ElementOwnership namespace1)
          // -end- 33598CAA030E attachlink_head448D24F502DB "ModelElement::attachNamespaceLink"
          {
            // -beg- preserve=no 33598CAA030E attachlink_body448D24F502DB "ModelElement::attachNamespaceLink"
            if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
            namespace = namespace1;
            namespace.setOwnedElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespaceLink"));
            return;
            // -end- 33598CAA030E attachlink_body448D24F502DB "ModelElement::attachNamespaceLink"
          }

          /** disconnect the currently attached Namespace.
           *  @see #attachNamespace
           */
          // -beg- preserve=no 33598CAA030E detach_head448D24F502DB "ModelElement::detachNamespace"
          public Namespace detachNamespace()
          // -end- 33598CAA030E detach_head448D24F502DB "ModelElement::detachNamespace"
          {
            // -beg- preserve=no 33598CAA030E detach_body448D24F502DB "ModelElement::detachNamespace"
            Namespace ret = null;
            if(namespace!=null){
              ret = namespace.getNamespace();
              ret._unlinkOwnedElement(namespace);
              namespace = null;
            }
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachNamespace"));
            return ret;
            // -end- 33598CAA030E detach_body448D24F502DB "ModelElement::detachNamespace"
          }

          /** get the currently attached Namespace.
           *  @see #attachNamespace
           */
          // -beg- preserve=no 33598CAA030E get_head448D24F502DB "ModelElement::getNamespace"
          public Namespace getNamespace()
          // -end- 33598CAA030E get_head448D24F502DB "ModelElement::getNamespace"
          {
            // -beg- preserve=no 33598CAA030E get_body448D24F502DB "ModelElement::getNamespace"
            if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
            return namespace.getNamespace();
            // -end- 33598CAA030E get_body448D24F502DB "ModelElement::getNamespace"
          }

          /** get the link class of currently attached Namespace.
           *  @see #attachNamespace
           */
          // -beg- preserve=no 33598CAA030E getlink_head448D24F502DB "ModelElement::getNamespaceLink"
          public ElementOwnership getNamespaceLink()
          // -end- 33598CAA030E getlink_head448D24F502DB "ModelElement::getNamespaceLink"
          {
            // -beg- preserve=no 33598CAA030E getlink_body448D24F502DB "ModelElement::getNamespaceLink"
            if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
            return namespace;
            // -end- 33598CAA030E getlink_body448D24F502DB "ModelElement::getNamespaceLink"
          }

          /** create a link class for a new link to a Namespace.
           *  @see #attachNamespace
           */
          // -beg- preserve=no 33598CAA030E createlink_head448D24F502DB "ModelElement::createNamespaceLink"
          public ElementOwnership createNamespaceLink()
          // -end- 33598CAA030E createlink_head448D24F502DB "ModelElement::createNamespaceLink"
          {
            // -beg- preserve=no 33598CAA030E createlink_body448D24F502DB "ModelElement::createNamespaceLink"
            return new ElementOwnership();
            // -end- 33598CAA030E createlink_body448D24F502DB "ModelElement::createNamespaceLink"
          }

          /** tests if there is a Namespace attached.
           *  @see #attachNamespace
           */
          // -beg- preserve=no 33598CAA030E test_head448D24F502DB "ModelElement::containsNamespace"
          public boolean containsNamespace()
          // -end- 33598CAA030E test_head448D24F502DB "ModelElement::containsNamespace"
          {
            // -beg- preserve=no 33598CAA030E test_body448D24F502DB "ModelElement::containsNamespace"
            return namespace!=null;
            // -end- 33598CAA030E test_body448D24F502DB "ModelElement::containsNamespace"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33598CAA030E _link_body448D24F502DB "ModelElement::_linkNamespace"
          public void _linkNamespace(ElementOwnership namespace1)
          {
            namespace = namespace1;
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkNamespace"));
            return;
          }
          // -end- 33598CAA030E _link_body448D24F502DB "ModelElement::_linkNamespace"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33598CAA030E _unlink_body448D24F502DB "ModelElement::_unlinkNamespace"
          public void _unlinkNamespace(ElementOwnership namespace1)
          {
            namespace = null;
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkNamespace"));
            return;
          }
          // -end- 33598CAA030E _unlink_body448D24F502DB "ModelElement::_unlinkNamespace"

          // -beg- preserve=no 33FFE57B0395 code448D24F502DB "clientDependency"
          private java.util.Set clientDependency = new java.util.HashSet();
          // -end- 33FFE57B0395 code448D24F502DB "clientDependency"

          /** add a ClientDependency.
           *  
           *  @see #removeClientDependency
           *  @see #containsClientDependency
           *  @see #iteratorClientDependency
           *  @see #clearClientDependency
           *  @see #sizeClientDependency
           */
          // -beg- preserve=no 33FFE57B0395 add_head448D24F502DB "ModelElement::addClientDependency"
          public void addClientDependency(Dependency clientDependency1)
          // -end- 33FFE57B0395 add_head448D24F502DB "ModelElement::addClientDependency"
          {
            // -beg- preserve=no 33FFE57B0395 add_body448D24F502DB "ModelElement::addClientDependency"
            clientDependency.add(clientDependency1);
            clientDependency1._linkClient(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addClientDependency"));
            return;
            // -end- 33FFE57B0395 add_body448D24F502DB "ModelElement::addClientDependency"
          }

          /** disconnect a ClientDependency.
           *  @see #addClientDependency
           */
          // -beg- preserve=no 33FFE57B0395 remove_head448D24F502DB "ModelElement::removeClientDependency"
          public Dependency removeClientDependency(Dependency clientDependency1)
          // -end- 33FFE57B0395 remove_head448D24F502DB "ModelElement::removeClientDependency"
          {
            // -beg- preserve=no 33FFE57B0395 remove_body448D24F502DB "ModelElement::removeClientDependency"
            Dependency ret=null;
            if(clientDependency1==null || !clientDependency.contains(clientDependency1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = clientDependency1;
            clientDependency.remove(clientDependency1);
            clientDependency1._unlinkClient(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeClientDependency"));
            return ret;
            // -end- 33FFE57B0395 remove_body448D24F502DB "ModelElement::removeClientDependency"
          }

          /** tests if a given ClientDependency is connected.
           *  @see #addClientDependency
           */
          // -beg- preserve=no 33FFE57B0395 test_head448D24F502DB "ModelElement::containsClientDependency"
          public boolean containsClientDependency(Dependency clientDependency1)
          // -end- 33FFE57B0395 test_head448D24F502DB "ModelElement::containsClientDependency"
          {
            // -beg- preserve=no 33FFE57B0395 test_body448D24F502DB "ModelElement::containsClientDependency"
            return clientDependency.contains(clientDependency1);
            // -end- 33FFE57B0395 test_body448D24F502DB "ModelElement::containsClientDependency"
          }

          /** used to enumerate all connected ClientDependencys.
           *  @see #addClientDependency
           */
          // -beg- preserve=no 33FFE57B0395 get_all_head448D24F502DB "ModelElement::iteratorClientDependency"
          public java.util.Iterator iteratorClientDependency()
          // -end- 33FFE57B0395 get_all_head448D24F502DB "ModelElement::iteratorClientDependency"
          {
            // -beg- preserve=no 33FFE57B0395 get_all_body448D24F502DB "ModelElement::iteratorClientDependency"
            return clientDependency.iterator();
            // -end- 33FFE57B0395 get_all_body448D24F502DB "ModelElement::iteratorClientDependency"
          }

          /** disconnect all ClientDependencys.
           *  @see #addClientDependency
           */
          // -beg- preserve=no 33FFE57B0395 remove_all_head448D24F502DB "ModelElement::clearClientDependency"
          public void clearClientDependency()
          // -end- 33FFE57B0395 remove_all_head448D24F502DB "ModelElement::clearClientDependency"
          {
            // -beg- preserve=no 33FFE57B0395 remove_all_body448D24F502DB "ModelElement::clearClientDependency"
            if(sizeClientDependency()>0){
              for(java.util.Iterator p = clientDependency.iterator(); p.hasNext();){
                ((Dependency)p.next())._unlinkClient(this);
              }
              clientDependency.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearClientDependency"));
            }
            // -end- 33FFE57B0395 remove_all_body448D24F502DB "ModelElement::clearClientDependency"
          }

          /** returns the number of ClientDependencys.
           *  @see #addClientDependency
           */
          // -beg- preserve=no 33FFE57B0395 size_head448D24F502DB "ModelElement::sizeClientDependency"
          public int sizeClientDependency()
          // -end- 33FFE57B0395 size_head448D24F502DB "ModelElement::sizeClientDependency"
          {
            // -beg- preserve=no 33FFE57B0395 size_body448D24F502DB "ModelElement::sizeClientDependency"
            return clientDependency.size();
            // -end- 33FFE57B0395 size_body448D24F502DB "ModelElement::sizeClientDependency"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33FFE57B0395 _link_body448D24F502DB "ModelElement::_linkClientDependency"
          public void _linkClientDependency(Dependency clientDependency1)
          {
            clientDependency.add(clientDependency1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClientDependency"));
            return;
          }
          // -end- 33FFE57B0395 _link_body448D24F502DB "ModelElement::_linkClientDependency"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33FFE57B0395 _unlink_body448D24F502DB "ModelElement::_unlinkClientDependency"
          public void _unlinkClientDependency(Dependency clientDependency1)
          {
            clientDependency.remove(clientDependency1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClientDependency"));
            return;
          }
          // -end- 33FFE57B0395 _unlink_body448D24F502DB "ModelElement::_unlinkClientDependency"

          // -beg- preserve=no 33E901E003D4 code448D24F502DB "taggedValue"
          private java.util.Set taggedValue = new java.util.HashSet();
          // -end- 33E901E003D4 code448D24F502DB "taggedValue"

          /** add a TaggedValue.
           *  
           *  @see #removeTaggedValue
           *  @see #containsTaggedValue
           *  @see #iteratorTaggedValue
           *  @see #clearTaggedValue
           *  @see #sizeTaggedValue
           */
          // -beg- preserve=no 33E901E003D4 add_head448D24F502DB "ModelElement::addTaggedValue"
          public void addTaggedValue(TaggedValue taggedValue1)
          // -end- 33E901E003D4 add_head448D24F502DB "ModelElement::addTaggedValue"
          {
            // -beg- preserve=no 33E901E003D4 add_body448D24F502DB "ModelElement::addTaggedValue"
            taggedValue.add(taggedValue1);
            taggedValue1._linkModelElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTaggedValue"));
            return;
            // -end- 33E901E003D4 add_body448D24F502DB "ModelElement::addTaggedValue"
          }

          /** disconnect a TaggedValue.
           *  @see #addTaggedValue
           */
          // -beg- preserve=no 33E901E003D4 remove_head448D24F502DB "ModelElement::removeTaggedValue"
          public TaggedValue removeTaggedValue(TaggedValue taggedValue1)
          // -end- 33E901E003D4 remove_head448D24F502DB "ModelElement::removeTaggedValue"
          {
            // -beg- preserve=no 33E901E003D4 remove_body448D24F502DB "ModelElement::removeTaggedValue"
            TaggedValue ret=null;
            if(taggedValue1==null || !taggedValue.contains(taggedValue1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = taggedValue1;
            taggedValue.remove(taggedValue1);
            taggedValue1._unlinkModelElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTaggedValue"));
            return ret;
            // -end- 33E901E003D4 remove_body448D24F502DB "ModelElement::removeTaggedValue"
          }

          /** tests if a given TaggedValue is connected.
           *  @see #addTaggedValue
           */
          // -beg- preserve=no 33E901E003D4 test_head448D24F502DB "ModelElement::containsTaggedValue"
          public boolean containsTaggedValue(TaggedValue taggedValue1)
          // -end- 33E901E003D4 test_head448D24F502DB "ModelElement::containsTaggedValue"
          {
            // -beg- preserve=no 33E901E003D4 test_body448D24F502DB "ModelElement::containsTaggedValue"
            return taggedValue.contains(taggedValue1);
            // -end- 33E901E003D4 test_body448D24F502DB "ModelElement::containsTaggedValue"
          }

          /** used to enumerate all connected TaggedValues.
           *  @see #addTaggedValue
           */
          // -beg- preserve=no 33E901E003D4 get_all_head448D24F502DB "ModelElement::iteratorTaggedValue"
          public java.util.Iterator iteratorTaggedValue()
          // -end- 33E901E003D4 get_all_head448D24F502DB "ModelElement::iteratorTaggedValue"
          {
            // -beg- preserve=no 33E901E003D4 get_all_body448D24F502DB "ModelElement::iteratorTaggedValue"
            return taggedValue.iterator();
            // -end- 33E901E003D4 get_all_body448D24F502DB "ModelElement::iteratorTaggedValue"
          }

          /** disconnect all TaggedValues.
           *  @see #addTaggedValue
           */
          // -beg- preserve=no 33E901E003D4 remove_all_head448D24F502DB "ModelElement::clearTaggedValue"
          public void clearTaggedValue()
          // -end- 33E901E003D4 remove_all_head448D24F502DB "ModelElement::clearTaggedValue"
          {
            // -beg- preserve=no 33E901E003D4 remove_all_body448D24F502DB "ModelElement::clearTaggedValue"
            if(sizeTaggedValue()>0){
              for(java.util.Iterator p = taggedValue.iterator(); p.hasNext();){
                ((TaggedValue)p.next())._unlinkModelElement(this);
              }
              taggedValue.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTaggedValue"));
            }
            // -end- 33E901E003D4 remove_all_body448D24F502DB "ModelElement::clearTaggedValue"
          }

          /** returns the number of TaggedValues.
           *  @see #addTaggedValue
           */
          // -beg- preserve=no 33E901E003D4 size_head448D24F502DB "ModelElement::sizeTaggedValue"
          public int sizeTaggedValue()
          // -end- 33E901E003D4 size_head448D24F502DB "ModelElement::sizeTaggedValue"
          {
            // -beg- preserve=no 33E901E003D4 size_body448D24F502DB "ModelElement::sizeTaggedValue"
            return taggedValue.size();
            // -end- 33E901E003D4 size_body448D24F502DB "ModelElement::sizeTaggedValue"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33E901E003D4 _link_body448D24F502DB "ModelElement::_linkTaggedValue"
          public void _linkTaggedValue(TaggedValue taggedValue1)
          {
            taggedValue.add(taggedValue1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTaggedValue"));
            return;
          }
          // -end- 33E901E003D4 _link_body448D24F502DB "ModelElement::_linkTaggedValue"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33E901E003D4 _unlink_body448D24F502DB "ModelElement::_unlinkTaggedValue"
          public void _unlinkTaggedValue(TaggedValue taggedValue1)
          {
            taggedValue.remove(taggedValue1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTaggedValue"));
            return;
          }
          // -end- 33E901E003D4 _unlink_body448D24F502DB "ModelElement::_unlinkTaggedValue"

          // -beg- preserve=no 33EA67BB010E code448D24F502DB "constraint"
          private java.util.Set constraint = new java.util.HashSet();
          // -end- 33EA67BB010E code448D24F502DB "constraint"

          /** add a Constraint.
           *  
           *  @see #removeConstraint
           *  @see #containsConstraint
           *  @see #iteratorConstraint
           *  @see #clearConstraint
           *  @see #sizeConstraint
           */
          // -beg- preserve=no 33EA67BB010E add_head448D24F502DB "ModelElement::addConstraint"
          public void addConstraint(Constraint constraint1)
          // -end- 33EA67BB010E add_head448D24F502DB "ModelElement::addConstraint"
          {
            // -beg- preserve=no 33EA67BB010E add_body448D24F502DB "ModelElement::addConstraint"
            constraint.add(constraint1);
            constraint1._linkConstrainedElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addConstraint"));
            return;
            // -end- 33EA67BB010E add_body448D24F502DB "ModelElement::addConstraint"
          }

          /** disconnect a Constraint.
           *  @see #addConstraint
           */
          // -beg- preserve=no 33EA67BB010E remove_head448D24F502DB "ModelElement::removeConstraint"
          public Constraint removeConstraint(Constraint constraint1)
          // -end- 33EA67BB010E remove_head448D24F502DB "ModelElement::removeConstraint"
          {
            // -beg- preserve=no 33EA67BB010E remove_body448D24F502DB "ModelElement::removeConstraint"
            Constraint ret=null;
            if(constraint1==null || !constraint.contains(constraint1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = constraint1;
            constraint.remove(constraint1);
            constraint1._unlinkConstrainedElement(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeConstraint"));
            return ret;
            // -end- 33EA67BB010E remove_body448D24F502DB "ModelElement::removeConstraint"
          }

          /** tests if a given Constraint is connected.
           *  @see #addConstraint
           */
          // -beg- preserve=no 33EA67BB010E test_head448D24F502DB "ModelElement::containsConstraint"
          public boolean containsConstraint(Constraint constraint1)
          // -end- 33EA67BB010E test_head448D24F502DB "ModelElement::containsConstraint"
          {
            // -beg- preserve=no 33EA67BB010E test_body448D24F502DB "ModelElement::containsConstraint"
            return constraint.contains(constraint1);
            // -end- 33EA67BB010E test_body448D24F502DB "ModelElement::containsConstraint"
          }

          /** used to enumerate all connected Constraints.
           *  @see #addConstraint
           */
          // -beg- preserve=no 33EA67BB010E get_all_head448D24F502DB "ModelElement::iteratorConstraint"
          public java.util.Iterator iteratorConstraint()
          // -end- 33EA67BB010E get_all_head448D24F502DB "ModelElement::iteratorConstraint"
          {
            // -beg- preserve=no 33EA67BB010E get_all_body448D24F502DB "ModelElement::iteratorConstraint"
            return constraint.iterator();
            // -end- 33EA67BB010E get_all_body448D24F502DB "ModelElement::iteratorConstraint"
          }

          /** disconnect all Constraints.
           *  @see #addConstraint
           */
          // -beg- preserve=no 33EA67BB010E remove_all_head448D24F502DB "ModelElement::clearConstraint"
          public void clearConstraint()
          // -end- 33EA67BB010E remove_all_head448D24F502DB "ModelElement::clearConstraint"
          {
            // -beg- preserve=no 33EA67BB010E remove_all_body448D24F502DB "ModelElement::clearConstraint"
            if(sizeConstraint()>0){
              for(java.util.Iterator p = constraint.iterator(); p.hasNext();){
                ((Constraint)p.next())._unlinkConstrainedElement(this);
              }
              constraint.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearConstraint"));
            }
            // -end- 33EA67BB010E remove_all_body448D24F502DB "ModelElement::clearConstraint"
          }

          /** returns the number of Constraints.
           *  @see #addConstraint
           */
          // -beg- preserve=no 33EA67BB010E size_head448D24F502DB "ModelElement::sizeConstraint"
          public int sizeConstraint()
          // -end- 33EA67BB010E size_head448D24F502DB "ModelElement::sizeConstraint"
          {
            // -beg- preserve=no 33EA67BB010E size_body448D24F502DB "ModelElement::sizeConstraint"
            return constraint.size();
            // -end- 33EA67BB010E size_body448D24F502DB "ModelElement::sizeConstraint"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33EA67BB010E _link_body448D24F502DB "ModelElement::_linkConstraint"
          public void _linkConstraint(Constraint constraint1)
          {
            constraint.add(constraint1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkConstraint"));
            return;
          }
          // -end- 33EA67BB010E _link_body448D24F502DB "ModelElement::_linkConstraint"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 33EA67BB010E _unlink_body448D24F502DB "ModelElement::_unlinkConstraint"
          public void _unlinkConstraint(Constraint constraint1)
          {
            constraint.remove(constraint1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkConstraint"));
            return;
          }
          // -end- 33EA67BB010E _unlink_body448D24F502DB "ModelElement::_unlinkConstraint"

          // -beg- preserve=no 335C0D7A02A8 code448D24F502DB "supplierDependency"
          private java.util.Set supplierDependency = new java.util.HashSet();
          // -end- 335C0D7A02A8 code448D24F502DB "supplierDependency"

          /** add a SupplierDependency.
           *  
           *  @see #removeSupplierDependency
           *  @see #containsSupplierDependency
           *  @see #iteratorSupplierDependency
           *  @see #clearSupplierDependency
           *  @see #sizeSupplierDependency
           */
          // -beg- preserve=no 335C0D7A02A8 add_head448D24F502DB "ModelElement::addSupplierDependency"
          public void addSupplierDependency(Dependency supplierDependency1)
          // -end- 335C0D7A02A8 add_head448D24F502DB "ModelElement::addSupplierDependency"
          {
            // -beg- preserve=no 335C0D7A02A8 add_body448D24F502DB "ModelElement::addSupplierDependency"
            supplierDependency.add(supplierDependency1);
            supplierDependency1._linkSupplier(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSupplierDependency"));
            return;
            // -end- 335C0D7A02A8 add_body448D24F502DB "ModelElement::addSupplierDependency"
          }

          /** disconnect a SupplierDependency.
           *  @see #addSupplierDependency
           */
          // -beg- preserve=no 335C0D7A02A8 remove_head448D24F502DB "ModelElement::removeSupplierDependency"
          public Dependency removeSupplierDependency(Dependency supplierDependency1)
          // -end- 335C0D7A02A8 remove_head448D24F502DB "ModelElement::removeSupplierDependency"
          {
            // -beg- preserve=no 335C0D7A02A8 remove_body448D24F502DB "ModelElement::removeSupplierDependency"
            Dependency ret=null;
            if(supplierDependency1==null || !supplierDependency.contains(supplierDependency1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = supplierDependency1;
            supplierDependency.remove(supplierDependency1);
            supplierDependency1._unlinkSupplier(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSupplierDependency"));
            return ret;
            // -end- 335C0D7A02A8 remove_body448D24F502DB "ModelElement::removeSupplierDependency"
          }

          /** tests if a given SupplierDependency is connected.
           *  @see #addSupplierDependency
           */
          // -beg- preserve=no 335C0D7A02A8 test_head448D24F502DB "ModelElement::containsSupplierDependency"
          public boolean containsSupplierDependency(Dependency supplierDependency1)
          // -end- 335C0D7A02A8 test_head448D24F502DB "ModelElement::containsSupplierDependency"
          {
            // -beg- preserve=no 335C0D7A02A8 test_body448D24F502DB "ModelElement::containsSupplierDependency"
            return supplierDependency.contains(supplierDependency1);
            // -end- 335C0D7A02A8 test_body448D24F502DB "ModelElement::containsSupplierDependency"
          }

          /** used to enumerate all connected SupplierDependencys.
           *  @see #addSupplierDependency
           */
          // -beg- preserve=no 335C0D7A02A8 get_all_head448D24F502DB "ModelElement::iteratorSupplierDependency"
          public java.util.Iterator iteratorSupplierDependency()
          // -end- 335C0D7A02A8 get_all_head448D24F502DB "ModelElement::iteratorSupplierDependency"
          {
            // -beg- preserve=no 335C0D7A02A8 get_all_body448D24F502DB "ModelElement::iteratorSupplierDependency"
            return supplierDependency.iterator();
            // -end- 335C0D7A02A8 get_all_body448D24F502DB "ModelElement::iteratorSupplierDependency"
          }

          /** disconnect all SupplierDependencys.
           *  @see #addSupplierDependency
           */
          // -beg- preserve=no 335C0D7A02A8 remove_all_head448D24F502DB "ModelElement::clearSupplierDependency"
          public void clearSupplierDependency()
          // -end- 335C0D7A02A8 remove_all_head448D24F502DB "ModelElement::clearSupplierDependency"
          {
            // -beg- preserve=no 335C0D7A02A8 remove_all_body448D24F502DB "ModelElement::clearSupplierDependency"
            if(sizeSupplierDependency()>0){
              for(java.util.Iterator p = supplierDependency.iterator(); p.hasNext();){
                ((Dependency)p.next())._unlinkSupplier(this);
              }
              supplierDependency.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSupplierDependency"));
            }
            // -end- 335C0D7A02A8 remove_all_body448D24F502DB "ModelElement::clearSupplierDependency"
          }

          /** returns the number of SupplierDependencys.
           *  @see #addSupplierDependency
           */
          // -beg- preserve=no 335C0D7A02A8 size_head448D24F502DB "ModelElement::sizeSupplierDependency"
          public int sizeSupplierDependency()
          // -end- 335C0D7A02A8 size_head448D24F502DB "ModelElement::sizeSupplierDependency"
          {
            // -beg- preserve=no 335C0D7A02A8 size_body448D24F502DB "ModelElement::sizeSupplierDependency"
            return supplierDependency.size();
            // -end- 335C0D7A02A8 size_body448D24F502DB "ModelElement::sizeSupplierDependency"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 335C0D7A02A8 _link_body448D24F502DB "ModelElement::_linkSupplierDependency"
          public void _linkSupplierDependency(Dependency supplierDependency1)
          {
            supplierDependency.add(supplierDependency1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSupplierDependency"));
            return;
          }
          // -end- 335C0D7A02A8 _link_body448D24F502DB "ModelElement::_linkSupplierDependency"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 335C0D7A02A8 _unlink_body448D24F502DB "ModelElement::_unlinkSupplierDependency"
          public void _unlinkSupplierDependency(Dependency supplierDependency1)
          {
            supplierDependency.remove(supplierDependency1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSupplierDependency"));
            return;
          }
          // -end- 335C0D7A02A8 _unlink_body448D24F502DB "ModelElement::_unlinkSupplierDependency"

          // -beg- preserve=no 362409A9000A code448D24F502DB "presentation"
          private java.util.Set presentation = new java.util.HashSet();
          // -end- 362409A9000A code448D24F502DB "presentation"

          /** add a Presentation.
           *  
           *  @see #removePresentation
           *  @see #containsPresentation
           *  @see #iteratorPresentation
           *  @see #clearPresentation
           *  @see #sizePresentation
           */
          // -beg- preserve=no 362409A9000A add_head448D24F502DB "ModelElement::addPresentation"
          public void addPresentation(PresentationElement presentation1)
          // -end- 362409A9000A add_head448D24F502DB "ModelElement::addPresentation"
          {
            // -beg- preserve=no 362409A9000A add_body448D24F502DB "ModelElement::addPresentation"
            presentation.add(presentation1);
            presentation1._linkSubject(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPresentation"));
            return;
            // -end- 362409A9000A add_body448D24F502DB "ModelElement::addPresentation"
          }

          /** disconnect a Presentation.
           *  @see #addPresentation
           */
          // -beg- preserve=no 362409A9000A remove_head448D24F502DB "ModelElement::removePresentation"
          public PresentationElement removePresentation(PresentationElement presentation1)
          // -end- 362409A9000A remove_head448D24F502DB "ModelElement::removePresentation"
          {
            // -beg- preserve=no 362409A9000A remove_body448D24F502DB "ModelElement::removePresentation"
            PresentationElement ret=null;
            if(presentation1==null || !presentation.contains(presentation1)){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = presentation1;
            presentation.remove(presentation1);
            presentation1._unlinkSubject(this);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePresentation"));
            return ret;
            // -end- 362409A9000A remove_body448D24F502DB "ModelElement::removePresentation"
          }

          /** tests if a given Presentation is connected.
           *  @see #addPresentation
           */
          // -beg- preserve=no 362409A9000A test_head448D24F502DB "ModelElement::containsPresentation"
          public boolean containsPresentation(PresentationElement presentation1)
          // -end- 362409A9000A test_head448D24F502DB "ModelElement::containsPresentation"
          {
            // -beg- preserve=no 362409A9000A test_body448D24F502DB "ModelElement::containsPresentation"
            return presentation.contains(presentation1);
            // -end- 362409A9000A test_body448D24F502DB "ModelElement::containsPresentation"
          }

          /** used to enumerate all connected Presentations.
           *  @see #addPresentation
           */
          // -beg- preserve=no 362409A9000A get_all_head448D24F502DB "ModelElement::iteratorPresentation"
          public java.util.Iterator iteratorPresentation()
          // -end- 362409A9000A get_all_head448D24F502DB "ModelElement::iteratorPresentation"
          {
            // -beg- preserve=no 362409A9000A get_all_body448D24F502DB "ModelElement::iteratorPresentation"
            return presentation.iterator();
            // -end- 362409A9000A get_all_body448D24F502DB "ModelElement::iteratorPresentation"
          }

          /** disconnect all Presentations.
           *  @see #addPresentation
           */
          // -beg- preserve=no 362409A9000A remove_all_head448D24F502DB "ModelElement::clearPresentation"
          public void clearPresentation()
          // -end- 362409A9000A remove_all_head448D24F502DB "ModelElement::clearPresentation"
          {
            // -beg- preserve=no 362409A9000A remove_all_body448D24F502DB "ModelElement::clearPresentation"
            if(sizePresentation()>0){
              for(java.util.Iterator p = presentation.iterator(); p.hasNext();){
                ((PresentationElement)p.next())._unlinkSubject(this);
              }
              presentation.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPresentation"));
            }
            // -end- 362409A9000A remove_all_body448D24F502DB "ModelElement::clearPresentation"
          }

          /** returns the number of Presentations.
           *  @see #addPresentation
           */
          // -beg- preserve=no 362409A9000A size_head448D24F502DB "ModelElement::sizePresentation"
          public int sizePresentation()
          // -end- 362409A9000A size_head448D24F502DB "ModelElement::sizePresentation"
          {
            // -beg- preserve=no 362409A9000A size_body448D24F502DB "ModelElement::sizePresentation"
            return presentation.size();
            // -end- 362409A9000A size_body448D24F502DB "ModelElement::sizePresentation"
          }

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 362409A9000A _link_body448D24F502DB "ModelElement::_linkPresentation"
          public void _linkPresentation(PresentationElement presentation1)
          {
            presentation.add(presentation1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPresentation"));
            return;
          }
          // -end- 362409A9000A _link_body448D24F502DB "ModelElement::_linkPresentation"

          /** DONT USE; link management internal
           */
          // -beg- preserve=no 362409A9000A _unlink_body448D24F502DB "ModelElement::_unlinkPresentation"
          public void _unlinkPresentation(PresentationElement presentation1)
          {
            presentation.remove(presentation1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPresentation"));
            return;
          }
          // -end- 362409A9000A _unlink_body448D24F502DB "ModelElement::_unlinkPresentation"

          // -beg- preserve=no 36240CA4024E code448D24F502DB "container"
          private java.util.Set container = new java.util.HashSet();
          // -end- 36240CA4024E code448D24F502DB "container"

          /** add a Container.
           *  
           *  @see #removeContainer
           *  @see #containsContainer
           *  @see #iteratorContainer
           *  @see #clearContainer
           *  @see #sizeContainer
           *  @see #iteratorContainerLink
           *  @see #createContainerLink
           *  @see #findContainerLink
           */
          // -beg- preserve=no 36240CA4024E add_head448D24F502DB "ModelElement::addContainer"
          public void addContainer(Component container1)
          // -end- 36240CA4024E add_head448D24F502DB "ModelElement::addContainer"
          {
            // -beg- preserve=no 36240CA4024E add_body448D24F502DB "ModelElement::addContainer"
            ElementResidence linkobj=createContainerLink();
            linkobj.setContainer(container1);
            linkobj.setResident(this);
            container.add(linkobj);
            container1._linkResident(linkobj);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContainer"));
            return;
            // -end- 36240CA4024E add_body448D24F502DB "ModelElement::addContainer"
          }

          /** add a link to a Container.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E addlink_head448D24F502DB "ModelElement::addContainerLink"
          public void addContainerLink(ElementResidence container1)
          // -end- 36240CA4024E addlink_head448D24F502DB "ModelElement::addContainerLink"
          {
            // -beg- preserve=no 36240CA4024E addlink_body448D24F502DB "ModelElement::addContainerLink"
            container1.setResident(this);
            container.add(container1);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addContainerLink"));
            return;
            // -end- 36240CA4024E addlink_body448D24F502DB "ModelElement::addContainerLink"
          }

          /** disconnect a Container.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E remove_head448D24F502DB "ModelElement::removeContainer"
          public Component removeContainer(Component container1)
          // -end- 36240CA4024E remove_head448D24F502DB "ModelElement::removeContainer"
          {
            // -beg- preserve=no 36240CA4024E remove_body448D24F502DB "ModelElement::removeContainer"
            Component ret=null;
            ElementResidence linkobj=findContainerLink(container1);
            if(container1==null || linkobj==null){
              throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
            }
            ret = linkobj.getContainer();
            container.remove(linkobj);
            ret._unlinkResident(linkobj);
            ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeContainer"));
            return ret;
            // -end- 36240CA4024E remove_body448D24F502DB "ModelElement::removeContainer"
          }

          /** tests if a given Container is connected.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E test_head448D24F502DB "ModelElement::containsContainer"
          public boolean containsContainer(Component container1)
          // -end- 36240CA4024E test_head448D24F502DB "ModelElement::containsContainer"
          {
            // -beg- preserve=no 36240CA4024E test_body448D24F502DB "ModelElement::containsContainer"
            return container.contains(findContainerLink(container1));
            // -end- 36240CA4024E test_body448D24F502DB "ModelElement::containsContainer"
          }

          /** used to enumerate all connected Containers.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E get_all_head448D24F502DB "ModelElement::iteratorContainer"
          public java.util.Iterator iteratorContainer()
          // -end- 36240CA4024E get_all_head448D24F502DB "ModelElement::iteratorContainer"
          {
            // -beg- preserve=no 36240CA4024E get_all_body448D24F502DB "ModelElement::iteratorContainer"
            return new java.util.Iterator(){
              private java.util.Iterator i=container.iterator();
              public boolean hasNext(){
                return i.hasNext();
              }
              public Object next(){
                ElementResidence next=(ElementResidence)i.next();
                return next.getContainer();
              }
              public void remove(){
                i.remove();
              }
            };
            // -end- 36240CA4024E get_all_body448D24F502DB "ModelElement::iteratorContainer"
          }

          /** disconnect all Containers.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E remove_all_head448D24F502DB "ModelElement::clearContainer"
          public void clearContainer()
          // -end- 36240CA4024E remove_all_head448D24F502DB "ModelElement::clearContainer"
          {
            // -beg- preserve=no 36240CA4024E remove_all_body448D24F502DB "ModelElement::clearContainer"
            if(sizeContainer()>0){
              for(java.util.Iterator p = container.iterator(); p.hasNext();){
                ElementResidence linkobj=(ElementResidence)p.next();
                linkobj.getContainer()._unlinkResident(linkobj);
              }
              container.clear();
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearContainer"));
            }
            // -end- 36240CA4024E remove_all_body448D24F502DB "ModelElement::clearContainer"
          }

          /** returns the number of Containers.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E size_head448D24F502DB "ModelElement::sizeContainer"
          public int sizeContainer()
          // -end- 36240CA4024E size_head448D24F502DB "ModelElement::sizeContainer"
          {
            // -beg- preserve=no 36240CA4024E size_body448D24F502DB "ModelElement::sizeContainer"
            return container.size();
            // -end- 36240CA4024E size_body448D24F502DB "ModelElement::sizeContainer"
          }

          /** enumerate the link objects of currently connected Container.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E itlink_head448D24F502DB "ModelElement::getContainerLink"
          public java.util.Iterator iteratorContainerLink()
          // -end- 36240CA4024E itlink_head448D24F502DB "ModelElement::getContainerLink"
          {
            // -beg- preserve=no 36240CA4024E itlink_body448D24F502DB "ModelElement::getContainerLink"
            return container.iterator();
            // -end- 36240CA4024E itlink_body448D24F502DB "ModelElement::getContainerLink"
          }

          /** create a link class for a new link to a Container.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E createlink_head448D24F502DB "ModelElement::createContainerLink"
          public ElementResidence createContainerLink()
          // -end- 36240CA4024E createlink_head448D24F502DB "ModelElement::createContainerLink"
          {
            // -beg- preserve=no 36240CA4024E createlink_body448D24F502DB "ModelElement::createContainerLink"
            // return new ElementResidence();
            throw new java.lang.UnsupportedOperationException();
            // -end- 36240CA4024E createlink_body448D24F502DB "ModelElement::createContainerLink"
          }

          /** find a link object for a given Container.
           *  @see #addContainer
           */
          // -beg- preserve=no 36240CA4024E find_head448D24F502DB "ModelElement::findContainerLink"
          public ElementResidence findContainerLink(Component container1)
          // -end- 36240CA4024E find_head448D24F502DB "ModelElement::findContainerLink"
          {
              // -beg- preserve=no 36240CA4024E find_body448D24F502DB "ModelElement::findContainerLink"
              if(container1==null) return null;
              for(java.util.Iterator p = container.iterator(); p.hasNext();){
                ElementResidence linkobj=(ElementResidence)p.next();
                if(linkobj.getContainer()==container1) return linkobj;
              }
              return null;
              // -end- 36240CA4024E find_body448D24F502DB "ModelElement::findContainerLink"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 36240CA4024E _link_body448D24F502DB "ModelElement::_linkContainer"
            public void _linkContainer(ElementResidence container1)
            {
              container.add(container1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkContainer"));
              return;
            }
            // -end- 36240CA4024E _link_body448D24F502DB "ModelElement::_linkContainer"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 36240CA4024E _unlink_body448D24F502DB "ModelElement::_unlinkContainer"
            public void _unlinkContainer(ElementResidence container1)
            {
              container.remove(container1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkContainer"));
              return;
            }
            // -end- 36240CA4024E _unlink_body448D24F502DB "ModelElement::_unlinkContainer"

            // -beg- preserve=no 36240F380050 code448D24F502DB "templateParameter"
            private java.util.List templateParameter = new java.util.ArrayList();
            // -end- 36240F380050 code448D24F502DB "templateParameter"

            /** add a TemplateParameter.
             *  
             *  @see #removeTemplateParameter
             *  @see #containsTemplateParameter
             *  @see #iteratorTemplateParameter
             *  @see #clearTemplateParameter
             *  @see #sizeTemplateParameter
             */
            // -beg- preserve=no 36240F380050 add_head448D24F502DB "ModelElement::addTemplateParameter"
            public void addTemplateParameter(TemplateParameter templateParameter1)
            // -end- 36240F380050 add_head448D24F502DB "ModelElement::addTemplateParameter"
            {
              // -beg- preserve=no 36240F380050 add_body448D24F502DB "ModelElement::addTemplateParameter"
              templateParameter.add(templateParameter1);
              templateParameter1._linkTemplate(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTemplateParameter"));
              return;
              // -end- 36240F380050 add_body448D24F502DB "ModelElement::addTemplateParameter"
            }

            // -beg- preserve=no 36240F380050 add2_head448D24F502DB "ModelElement::add2TemplateParameter"
            public void addTemplateParameter(int index,TemplateParameter templateParameter1)
            // -end- 36240F380050 add2_head448D24F502DB "ModelElement::add2TemplateParameter"
            {
              // -beg- preserve=no 36240F380050 add2_body448D24F502DB "ModelElement::add2TemplateParameter"
              templateParameter.add(index,templateParameter1);
              templateParameter1._linkTemplate(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTemplateParameter"));
              return;
              // -end- 36240F380050 add2_body448D24F502DB "ModelElement::add2TemplateParameter"
            }

            /** disconnect a TemplateParameter.
             *  @see #addTemplateParameter
             */
            // -beg- preserve=no 36240F380050 remove_head448D24F502DB "ModelElement::removeTemplateParameter"
            public TemplateParameter removeTemplateParameter(TemplateParameter templateParameter1)
            // -end- 36240F380050 remove_head448D24F502DB "ModelElement::removeTemplateParameter"
            {
              // -beg- preserve=no 36240F380050 remove_body448D24F502DB "ModelElement::removeTemplateParameter"
              TemplateParameter ret=null;
              if(templateParameter1==null || !templateParameter.contains(templateParameter1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = templateParameter1;
              templateParameter.remove(templateParameter1);
              templateParameter1._unlinkTemplate(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTemplateParameter"));
              return ret;
              // -end- 36240F380050 remove_body448D24F502DB "ModelElement::removeTemplateParameter"
            }

            /** disconnect a TemplateParameter.
             *  @see #addTemplateParameter
             */
            // -beg- preserve=no 36240F380050 remove2_head448D24F502DB "ModelElement::remove2TemplateParameter"
            public TemplateParameter removeTemplateParameter(int index)
            // -end- 36240F380050 remove2_head448D24F502DB "ModelElement::remove2TemplateParameter"
            {
              // -beg- preserve=no 36240F380050 remove2_body448D24F502DB "ModelElement::remove2TemplateParameter"
              TemplateParameter ret=null;
              ret = (TemplateParameter)templateParameter.remove(index);
              ret._unlinkTemplate(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTemplateParameter"));
              return ret;
              // -end- 36240F380050 remove2_body448D24F502DB "ModelElement::remove2TemplateParameter"
            }

            /** change a TemplateParameter.
             *  @see #addTemplateParameter
             */
            // -beg- preserve=no 36240F380050 set_head448D24F502DB "ModelElement::setTemplateParameter"
            public TemplateParameter setTemplateParameter(int index,TemplateParameter templateParameter1)
            // -end- 36240F380050 set_head448D24F502DB "ModelElement::setTemplateParameter"
            {
              // -beg- preserve=no 36240F380050 set_body448D24F502DB "ModelElement::setTemplateParameter"
              TemplateParameter ret=null;
              ret = (TemplateParameter)templateParameter.set(index,templateParameter1);
              ret._unlinkTemplate(this);
              templateParameter1._linkTemplate(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setTemplateParameter"));
              return ret;
              // -end- 36240F380050 set_body448D24F502DB "ModelElement::setTemplateParameter"
            }

            /** tests if a given TemplateParameter is connected.
             *  @see #addTemplateParameter
             */
            // -beg- preserve=no 36240F380050 test_head448D24F502DB "ModelElement::containsTemplateParameter"
            public boolean containsTemplateParameter(TemplateParameter templateParameter1)
            // -end- 36240F380050 test_head448D24F502DB "ModelElement::containsTemplateParameter"
            {
              // -beg- preserve=no 36240F380050 test_body448D24F502DB "ModelElement::containsTemplateParameter"
              return templateParameter.contains(templateParameter1);
              // -end- 36240F380050 test_body448D24F502DB "ModelElement::containsTemplateParameter"
            }

            /** used to enumerate all connected TemplateParameters.
             *  @see #addTemplateParameter
             */
            // -beg- preserve=no 36240F380050 get_all_head448D24F502DB "ModelElement::iteratorTemplateParameter"
            public java.util.Iterator iteratorTemplateParameter()
            // -end- 36240F380050 get_all_head448D24F502DB "ModelElement::iteratorTemplateParameter"
            {
              // -beg- preserve=no 36240F380050 get_all_body448D24F502DB "ModelElement::iteratorTemplateParameter"
              return templateParameter.iterator();
              // -end- 36240F380050 get_all_body448D24F502DB "ModelElement::iteratorTemplateParameter"
            }

            /** disconnect all TemplateParameters.
             *  @see #addTemplateParameter
             */
            // -beg- preserve=no 36240F380050 remove_all_head448D24F502DB "ModelElement::clearTemplateParameter"
            public void clearTemplateParameter()
            // -end- 36240F380050 remove_all_head448D24F502DB "ModelElement::clearTemplateParameter"
            {
              // -beg- preserve=no 36240F380050 remove_all_body448D24F502DB "ModelElement::clearTemplateParameter"
              if(sizeTemplateParameter()>0){
                for(java.util.Iterator p = templateParameter.iterator(); p.hasNext();){
                  ((TemplateParameter)p.next())._unlinkTemplate(this);
                }
                templateParameter.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTemplateParameter"));
              }
              // -end- 36240F380050 remove_all_body448D24F502DB "ModelElement::clearTemplateParameter"
            }

            /** returns the number of TemplateParameters.
             *  @see #addTemplateParameter
             */
            // -beg- preserve=no 36240F380050 size_head448D24F502DB "ModelElement::sizeTemplateParameter"
            public int sizeTemplateParameter()
            // -end- 36240F380050 size_head448D24F502DB "ModelElement::sizeTemplateParameter"
            {
              // -beg- preserve=no 36240F380050 size_body448D24F502DB "ModelElement::sizeTemplateParameter"
              return templateParameter.size();
              // -end- 36240F380050 size_body448D24F502DB "ModelElement::sizeTemplateParameter"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 36240F380050 _link_body448D24F502DB "ModelElement::_linkTemplateParameter"
            public void _linkTemplateParameter(TemplateParameter templateParameter1)
            {
              templateParameter.add(templateParameter1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTemplateParameter"));
              return;
            }
            // -end- 36240F380050 _link_body448D24F502DB "ModelElement::_linkTemplateParameter"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 36240F380050 _unlink_body448D24F502DB "ModelElement::_unlinkTemplateParameter"
            public void _unlinkTemplateParameter(TemplateParameter templateParameter1)
            {
              templateParameter.remove(templateParameter1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTemplateParameter"));
              return;
            }
            // -end- 36240F380050 _unlink_body448D24F502DB "ModelElement::_unlinkTemplateParameter"

            // -beg- preserve=no 3627D5E9010F code448D24F502DB "targetFlow"
            private java.util.Set targetFlow = new java.util.HashSet();
            // -end- 3627D5E9010F code448D24F502DB "targetFlow"

            /** add a TargetFlow.
             *  
             *  @see #removeTargetFlow
             *  @see #containsTargetFlow
             *  @see #iteratorTargetFlow
             *  @see #clearTargetFlow
             *  @see #sizeTargetFlow
             */
            // -beg- preserve=no 3627D5E9010F add_head448D24F502DB "ModelElement::addTargetFlow"
            public void addTargetFlow(Flow targetFlow1)
            // -end- 3627D5E9010F add_head448D24F502DB "ModelElement::addTargetFlow"
            {
              // -beg- preserve=no 3627D5E9010F add_body448D24F502DB "ModelElement::addTargetFlow"
              targetFlow.add(targetFlow1);
              targetFlow1._linkTarget(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addTargetFlow"));
              return;
              // -end- 3627D5E9010F add_body448D24F502DB "ModelElement::addTargetFlow"
            }

            /** disconnect a TargetFlow.
             *  @see #addTargetFlow
             */
            // -beg- preserve=no 3627D5E9010F remove_head448D24F502DB "ModelElement::removeTargetFlow"
            public Flow removeTargetFlow(Flow targetFlow1)
            // -end- 3627D5E9010F remove_head448D24F502DB "ModelElement::removeTargetFlow"
            {
              // -beg- preserve=no 3627D5E9010F remove_body448D24F502DB "ModelElement::removeTargetFlow"
              Flow ret=null;
              if(targetFlow1==null || !targetFlow.contains(targetFlow1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = targetFlow1;
              targetFlow.remove(targetFlow1);
              targetFlow1._unlinkTarget(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeTargetFlow"));
              return ret;
              // -end- 3627D5E9010F remove_body448D24F502DB "ModelElement::removeTargetFlow"
            }

            /** tests if a given TargetFlow is connected.
             *  @see #addTargetFlow
             */
            // -beg- preserve=no 3627D5E9010F test_head448D24F502DB "ModelElement::containsTargetFlow"
            public boolean containsTargetFlow(Flow targetFlow1)
            // -end- 3627D5E9010F test_head448D24F502DB "ModelElement::containsTargetFlow"
            {
              // -beg- preserve=no 3627D5E9010F test_body448D24F502DB "ModelElement::containsTargetFlow"
              return targetFlow.contains(targetFlow1);
              // -end- 3627D5E9010F test_body448D24F502DB "ModelElement::containsTargetFlow"
            }

            /** used to enumerate all connected TargetFlows.
             *  @see #addTargetFlow
             */
            // -beg- preserve=no 3627D5E9010F get_all_head448D24F502DB "ModelElement::iteratorTargetFlow"
            public java.util.Iterator iteratorTargetFlow()
            // -end- 3627D5E9010F get_all_head448D24F502DB "ModelElement::iteratorTargetFlow"
            {
              // -beg- preserve=no 3627D5E9010F get_all_body448D24F502DB "ModelElement::iteratorTargetFlow"
              return targetFlow.iterator();
              // -end- 3627D5E9010F get_all_body448D24F502DB "ModelElement::iteratorTargetFlow"
            }

            /** disconnect all TargetFlows.
             *  @see #addTargetFlow
             */
            // -beg- preserve=no 3627D5E9010F remove_all_head448D24F502DB "ModelElement::clearTargetFlow"
            public void clearTargetFlow()
            // -end- 3627D5E9010F remove_all_head448D24F502DB "ModelElement::clearTargetFlow"
            {
              // -beg- preserve=no 3627D5E9010F remove_all_body448D24F502DB "ModelElement::clearTargetFlow"
              if(sizeTargetFlow()>0){
                for(java.util.Iterator p = targetFlow.iterator(); p.hasNext();){
                  ((Flow)p.next())._unlinkTarget(this);
                }
                targetFlow.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearTargetFlow"));
              }
              // -end- 3627D5E9010F remove_all_body448D24F502DB "ModelElement::clearTargetFlow"
            }

            /** returns the number of TargetFlows.
             *  @see #addTargetFlow
             */
            // -beg- preserve=no 3627D5E9010F size_head448D24F502DB "ModelElement::sizeTargetFlow"
            public int sizeTargetFlow()
            // -end- 3627D5E9010F size_head448D24F502DB "ModelElement::sizeTargetFlow"
            {
              // -beg- preserve=no 3627D5E9010F size_body448D24F502DB "ModelElement::sizeTargetFlow"
              return targetFlow.size();
              // -end- 3627D5E9010F size_body448D24F502DB "ModelElement::sizeTargetFlow"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3627D5E9010F _link_body448D24F502DB "ModelElement::_linkTargetFlow"
            public void _linkTargetFlow(Flow targetFlow1)
            {
              targetFlow.add(targetFlow1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTargetFlow"));
              return;
            }
            // -end- 3627D5E9010F _link_body448D24F502DB "ModelElement::_linkTargetFlow"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3627D5E9010F _unlink_body448D24F502DB "ModelElement::_unlinkTargetFlow"
            public void _unlinkTargetFlow(Flow targetFlow1)
            {
              targetFlow.remove(targetFlow1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTargetFlow"));
              return;
            }
            // -end- 3627D5E9010F _unlink_body448D24F502DB "ModelElement::_unlinkTargetFlow"

            // -beg- preserve=no 3627D60F03DF code448D24F502DB "sourceFlow"
            private java.util.Set sourceFlow = new java.util.HashSet();
            // -end- 3627D60F03DF code448D24F502DB "sourceFlow"

            /** add a SourceFlow.
             *  
             *  @see #removeSourceFlow
             *  @see #containsSourceFlow
             *  @see #iteratorSourceFlow
             *  @see #clearSourceFlow
             *  @see #sizeSourceFlow
             */
            // -beg- preserve=no 3627D60F03DF add_head448D24F502DB "ModelElement::addSourceFlow"
            public void addSourceFlow(Flow sourceFlow1)
            // -end- 3627D60F03DF add_head448D24F502DB "ModelElement::addSourceFlow"
            {
              // -beg- preserve=no 3627D60F03DF add_body448D24F502DB "ModelElement::addSourceFlow"
              sourceFlow.add(sourceFlow1);
              sourceFlow1._linkSource(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSourceFlow"));
              return;
              // -end- 3627D60F03DF add_body448D24F502DB "ModelElement::addSourceFlow"
            }

            /** disconnect a SourceFlow.
             *  @see #addSourceFlow
             */
            // -beg- preserve=no 3627D60F03DF remove_head448D24F502DB "ModelElement::removeSourceFlow"
            public Flow removeSourceFlow(Flow sourceFlow1)
            // -end- 3627D60F03DF remove_head448D24F502DB "ModelElement::removeSourceFlow"
            {
              // -beg- preserve=no 3627D60F03DF remove_body448D24F502DB "ModelElement::removeSourceFlow"
              Flow ret=null;
              if(sourceFlow1==null || !sourceFlow.contains(sourceFlow1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = sourceFlow1;
              sourceFlow.remove(sourceFlow1);
              sourceFlow1._unlinkSource(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSourceFlow"));
              return ret;
              // -end- 3627D60F03DF remove_body448D24F502DB "ModelElement::removeSourceFlow"
            }

            /** tests if a given SourceFlow is connected.
             *  @see #addSourceFlow
             */
            // -beg- preserve=no 3627D60F03DF test_head448D24F502DB "ModelElement::containsSourceFlow"
            public boolean containsSourceFlow(Flow sourceFlow1)
            // -end- 3627D60F03DF test_head448D24F502DB "ModelElement::containsSourceFlow"
            {
              // -beg- preserve=no 3627D60F03DF test_body448D24F502DB "ModelElement::containsSourceFlow"
              return sourceFlow.contains(sourceFlow1);
              // -end- 3627D60F03DF test_body448D24F502DB "ModelElement::containsSourceFlow"
            }

            /** used to enumerate all connected SourceFlows.
             *  @see #addSourceFlow
             */
            // -beg- preserve=no 3627D60F03DF get_all_head448D24F502DB "ModelElement::iteratorSourceFlow"
            public java.util.Iterator iteratorSourceFlow()
            // -end- 3627D60F03DF get_all_head448D24F502DB "ModelElement::iteratorSourceFlow"
            {
              // -beg- preserve=no 3627D60F03DF get_all_body448D24F502DB "ModelElement::iteratorSourceFlow"
              return sourceFlow.iterator();
              // -end- 3627D60F03DF get_all_body448D24F502DB "ModelElement::iteratorSourceFlow"
            }

            /** disconnect all SourceFlows.
             *  @see #addSourceFlow
             */
            // -beg- preserve=no 3627D60F03DF remove_all_head448D24F502DB "ModelElement::clearSourceFlow"
            public void clearSourceFlow()
            // -end- 3627D60F03DF remove_all_head448D24F502DB "ModelElement::clearSourceFlow"
            {
              // -beg- preserve=no 3627D60F03DF remove_all_body448D24F502DB "ModelElement::clearSourceFlow"
              if(sizeSourceFlow()>0){
                for(java.util.Iterator p = sourceFlow.iterator(); p.hasNext();){
                  ((Flow)p.next())._unlinkSource(this);
                }
                sourceFlow.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSourceFlow"));
              }
              // -end- 3627D60F03DF remove_all_body448D24F502DB "ModelElement::clearSourceFlow"
            }

            /** returns the number of SourceFlows.
             *  @see #addSourceFlow
             */
            // -beg- preserve=no 3627D60F03DF size_head448D24F502DB "ModelElement::sizeSourceFlow"
            public int sizeSourceFlow()
            // -end- 3627D60F03DF size_head448D24F502DB "ModelElement::sizeSourceFlow"
            {
              // -beg- preserve=no 3627D60F03DF size_body448D24F502DB "ModelElement::sizeSourceFlow"
              return sourceFlow.size();
              // -end- 3627D60F03DF size_body448D24F502DB "ModelElement::sizeSourceFlow"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3627D60F03DF _link_body448D24F502DB "ModelElement::_linkSourceFlow"
            public void _linkSourceFlow(Flow sourceFlow1)
            {
              sourceFlow.add(sourceFlow1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSourceFlow"));
              return;
            }
            // -end- 3627D60F03DF _link_body448D24F502DB "ModelElement::_linkSourceFlow"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3627D60F03DF _unlink_body448D24F502DB "ModelElement::_unlinkSourceFlow"
            public void _unlinkSourceFlow(Flow sourceFlow1)
            {
              sourceFlow.remove(sourceFlow1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSourceFlow"));
              return;
            }
            // -end- 3627D60F03DF _unlink_body448D24F502DB "ModelElement::_unlinkSourceFlow"

            // -beg- preserve=no 365EEE82035C code448D24F502DB "defaultParameter"
            private java.util.Set defaultParameter = new java.util.HashSet();
            // -end- 365EEE82035C code448D24F502DB "defaultParameter"

            /** add a DefaultParameter.
             *  
             *  @see #removeDefaultParameter
             *  @see #containsDefaultParameter
             *  @see #iteratorDefaultParameter
             *  @see #clearDefaultParameter
             *  @see #sizeDefaultParameter
             */
            // -beg- preserve=no 365EEE82035C add_head448D24F502DB "ModelElement::addDefaultParameter"
            public void addDefaultParameter(TemplateParameter defaultParameter1)
            // -end- 365EEE82035C add_head448D24F502DB "ModelElement::addDefaultParameter"
            {
              // -beg- preserve=no 365EEE82035C add_body448D24F502DB "ModelElement::addDefaultParameter"
              defaultParameter.add(defaultParameter1);
              defaultParameter1._linkDefaultElement(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDefaultParameter"));
              return;
              // -end- 365EEE82035C add_body448D24F502DB "ModelElement::addDefaultParameter"
            }

            /** disconnect a DefaultParameter.
             *  @see #addDefaultParameter
             */
            // -beg- preserve=no 365EEE82035C remove_head448D24F502DB "ModelElement::removeDefaultParameter"
            public TemplateParameter removeDefaultParameter(TemplateParameter defaultParameter1)
            // -end- 365EEE82035C remove_head448D24F502DB "ModelElement::removeDefaultParameter"
            {
              // -beg- preserve=no 365EEE82035C remove_body448D24F502DB "ModelElement::removeDefaultParameter"
              TemplateParameter ret=null;
              if(defaultParameter1==null || !defaultParameter.contains(defaultParameter1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = defaultParameter1;
              defaultParameter.remove(defaultParameter1);
              defaultParameter1._unlinkDefaultElement(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDefaultParameter"));
              return ret;
              // -end- 365EEE82035C remove_body448D24F502DB "ModelElement::removeDefaultParameter"
            }

            /** tests if a given DefaultParameter is connected.
             *  @see #addDefaultParameter
             */
            // -beg- preserve=no 365EEE82035C test_head448D24F502DB "ModelElement::containsDefaultParameter"
            public boolean containsDefaultParameter(TemplateParameter defaultParameter1)
            // -end- 365EEE82035C test_head448D24F502DB "ModelElement::containsDefaultParameter"
            {
              // -beg- preserve=no 365EEE82035C test_body448D24F502DB "ModelElement::containsDefaultParameter"
              return defaultParameter.contains(defaultParameter1);
              // -end- 365EEE82035C test_body448D24F502DB "ModelElement::containsDefaultParameter"
            }

            /** used to enumerate all connected DefaultParameters.
             *  @see #addDefaultParameter
             */
            // -beg- preserve=no 365EEE82035C get_all_head448D24F502DB "ModelElement::iteratorDefaultParameter"
            public java.util.Iterator iteratorDefaultParameter()
            // -end- 365EEE82035C get_all_head448D24F502DB "ModelElement::iteratorDefaultParameter"
            {
              // -beg- preserve=no 365EEE82035C get_all_body448D24F502DB "ModelElement::iteratorDefaultParameter"
              return defaultParameter.iterator();
              // -end- 365EEE82035C get_all_body448D24F502DB "ModelElement::iteratorDefaultParameter"
            }

            /** disconnect all DefaultParameters.
             *  @see #addDefaultParameter
             */
            // -beg- preserve=no 365EEE82035C remove_all_head448D24F502DB "ModelElement::clearDefaultParameter"
            public void clearDefaultParameter()
            // -end- 365EEE82035C remove_all_head448D24F502DB "ModelElement::clearDefaultParameter"
            {
              // -beg- preserve=no 365EEE82035C remove_all_body448D24F502DB "ModelElement::clearDefaultParameter"
              if(sizeDefaultParameter()>0){
                for(java.util.Iterator p = defaultParameter.iterator(); p.hasNext();){
                  ((TemplateParameter)p.next())._unlinkDefaultElement(this);
                }
                defaultParameter.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDefaultParameter"));
              }
              // -end- 365EEE82035C remove_all_body448D24F502DB "ModelElement::clearDefaultParameter"
            }

            /** returns the number of DefaultParameters.
             *  @see #addDefaultParameter
             */
            // -beg- preserve=no 365EEE82035C size_head448D24F502DB "ModelElement::sizeDefaultParameter"
            public int sizeDefaultParameter()
            // -end- 365EEE82035C size_head448D24F502DB "ModelElement::sizeDefaultParameter"
            {
              // -beg- preserve=no 365EEE82035C size_body448D24F502DB "ModelElement::sizeDefaultParameter"
              return defaultParameter.size();
              // -end- 365EEE82035C size_body448D24F502DB "ModelElement::sizeDefaultParameter"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 365EEE82035C _link_body448D24F502DB "ModelElement::_linkDefaultParameter"
            public void _linkDefaultParameter(TemplateParameter defaultParameter1)
            {
              defaultParameter.add(defaultParameter1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDefaultParameter"));
              return;
            }
            // -end- 365EEE82035C _link_body448D24F502DB "ModelElement::_linkDefaultParameter"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 365EEE82035C _unlink_body448D24F502DB "ModelElement::_unlinkDefaultParameter"
            public void _unlinkDefaultParameter(TemplateParameter defaultParameter1)
            {
              defaultParameter.remove(defaultParameter1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDefaultParameter"));
              return;
            }
            // -end- 365EEE82035C _unlink_body448D24F502DB "ModelElement::_unlinkDefaultParameter"

            // -beg- preserve=no 370E7E3C02DE code448D24F502DB "comment"
            private java.util.Set comment = new java.util.HashSet();
            // -end- 370E7E3C02DE code448D24F502DB "comment"

            /** add a Comment.
             *  
             *  @see #removeComment
             *  @see #containsComment
             *  @see #iteratorComment
             *  @see #clearComment
             *  @see #sizeComment
             */
            // -beg- preserve=no 370E7E3C02DE add_head448D24F502DB "ModelElement::addComment"
            public void addComment(Comment comment1)
            // -end- 370E7E3C02DE add_head448D24F502DB "ModelElement::addComment"
            {
              // -beg- preserve=no 370E7E3C02DE add_body448D24F502DB "ModelElement::addComment"
              comment.add(comment1);
              comment1._linkAnnotatedElement(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addComment"));
              return;
              // -end- 370E7E3C02DE add_body448D24F502DB "ModelElement::addComment"
            }

            /** disconnect a Comment.
             *  @see #addComment
             */
            // -beg- preserve=no 370E7E3C02DE remove_head448D24F502DB "ModelElement::removeComment"
            public Comment removeComment(Comment comment1)
            // -end- 370E7E3C02DE remove_head448D24F502DB "ModelElement::removeComment"
            {
              // -beg- preserve=no 370E7E3C02DE remove_body448D24F502DB "ModelElement::removeComment"
              Comment ret=null;
              if(comment1==null || !comment.contains(comment1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = comment1;
              comment.remove(comment1);
              comment1._unlinkAnnotatedElement(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeComment"));
              return ret;
              // -end- 370E7E3C02DE remove_body448D24F502DB "ModelElement::removeComment"
            }

            /** tests if a given Comment is connected.
             *  @see #addComment
             */
            // -beg- preserve=no 370E7E3C02DE test_head448D24F502DB "ModelElement::containsComment"
            public boolean containsComment(Comment comment1)
            // -end- 370E7E3C02DE test_head448D24F502DB "ModelElement::containsComment"
            {
              // -beg- preserve=no 370E7E3C02DE test_body448D24F502DB "ModelElement::containsComment"
              return comment.contains(comment1);
              // -end- 370E7E3C02DE test_body448D24F502DB "ModelElement::containsComment"
            }

            /** used to enumerate all connected Comments.
             *  @see #addComment
             */
            // -beg- preserve=no 370E7E3C02DE get_all_head448D24F502DB "ModelElement::iteratorComment"
            public java.util.Iterator iteratorComment()
            // -end- 370E7E3C02DE get_all_head448D24F502DB "ModelElement::iteratorComment"
            {
              // -beg- preserve=no 370E7E3C02DE get_all_body448D24F502DB "ModelElement::iteratorComment"
              return comment.iterator();
              // -end- 370E7E3C02DE get_all_body448D24F502DB "ModelElement::iteratorComment"
            }

            /** disconnect all Comments.
             *  @see #addComment
             */
            // -beg- preserve=no 370E7E3C02DE remove_all_head448D24F502DB "ModelElement::clearComment"
            public void clearComment()
            // -end- 370E7E3C02DE remove_all_head448D24F502DB "ModelElement::clearComment"
            {
              // -beg- preserve=no 370E7E3C02DE remove_all_body448D24F502DB "ModelElement::clearComment"
              if(sizeComment()>0){
                for(java.util.Iterator p = comment.iterator(); p.hasNext();){
                  ((Comment)p.next())._unlinkAnnotatedElement(this);
                }
                comment.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearComment"));
              }
              // -end- 370E7E3C02DE remove_all_body448D24F502DB "ModelElement::clearComment"
            }

            /** returns the number of Comments.
             *  @see #addComment
             */
            // -beg- preserve=no 370E7E3C02DE size_head448D24F502DB "ModelElement::sizeComment"
            public int sizeComment()
            // -end- 370E7E3C02DE size_head448D24F502DB "ModelElement::sizeComment"
            {
              // -beg- preserve=no 370E7E3C02DE size_body448D24F502DB "ModelElement::sizeComment"
              return comment.size();
              // -end- 370E7E3C02DE size_body448D24F502DB "ModelElement::sizeComment"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 370E7E3C02DE _link_body448D24F502DB "ModelElement::_linkComment"
            public void _linkComment(Comment comment1)
            {
              comment.add(comment1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkComment"));
              return;
            }
            // -end- 370E7E3C02DE _link_body448D24F502DB "ModelElement::_linkComment"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 370E7E3C02DE _unlink_body448D24F502DB "ModelElement::_unlinkComment"
            public void _unlinkComment(Comment comment1)
            {
              comment.remove(comment1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkComment"));
              return;
            }
            // -end- 370E7E3C02DE _unlink_body448D24F502DB "ModelElement::_unlinkComment"

            // -beg- preserve=no 338613A4007B code448D24F502DB "stereotype"
            private java.util.Set stereotype = new java.util.HashSet();
            // -end- 338613A4007B code448D24F502DB "stereotype"

            /** add a Stereotype.
             *  
             *  @see #removeStereotype
             *  @see #containsStereotype
             *  @see #iteratorStereotype
             *  @see #clearStereotype
             *  @see #sizeStereotype
             */
            // -beg- preserve=no 338613A4007B add_head448D24F502DB "ModelElement::addStereotype"
            public void addStereotype(Stereotype stereotype1)
            // -end- 338613A4007B add_head448D24F502DB "ModelElement::addStereotype"
            {
              // -beg- preserve=no 338613A4007B add_body448D24F502DB "ModelElement::addStereotype"
              stereotype.add(stereotype1);
              stereotype1._linkExtendedElement(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addStereotype"));
              return;
              // -end- 338613A4007B add_body448D24F502DB "ModelElement::addStereotype"
            }

            /** disconnect a Stereotype.
             *  @see #addStereotype
             */
            // -beg- preserve=no 338613A4007B remove_head448D24F502DB "ModelElement::removeStereotype"
            public Stereotype removeStereotype(Stereotype stereotype1)
            // -end- 338613A4007B remove_head448D24F502DB "ModelElement::removeStereotype"
            {
              // -beg- preserve=no 338613A4007B remove_body448D24F502DB "ModelElement::removeStereotype"
              Stereotype ret=null;
              if(stereotype1==null || !stereotype.contains(stereotype1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = stereotype1;
              stereotype.remove(stereotype1);
              stereotype1._unlinkExtendedElement(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeStereotype"));
              return ret;
              // -end- 338613A4007B remove_body448D24F502DB "ModelElement::removeStereotype"
            }

            /** tests if a given Stereotype is connected.
             *  @see #addStereotype
             */
            // -beg- preserve=no 338613A4007B test_head448D24F502DB "ModelElement::containsStereotype"
            public boolean containsStereotype(Stereotype stereotype1)
            // -end- 338613A4007B test_head448D24F502DB "ModelElement::containsStereotype"
            {
              // -beg- preserve=no 338613A4007B test_body448D24F502DB "ModelElement::containsStereotype"
              return stereotype.contains(stereotype1);
              // -end- 338613A4007B test_body448D24F502DB "ModelElement::containsStereotype"
            }

            /** used to enumerate all connected Stereotypes.
             *  @see #addStereotype
             */
            // -beg- preserve=no 338613A4007B get_all_head448D24F502DB "ModelElement::iteratorStereotype"
            public java.util.Iterator iteratorStereotype()
            // -end- 338613A4007B get_all_head448D24F502DB "ModelElement::iteratorStereotype"
            {
              // -beg- preserve=no 338613A4007B get_all_body448D24F502DB "ModelElement::iteratorStereotype"
              return stereotype.iterator();
              // -end- 338613A4007B get_all_body448D24F502DB "ModelElement::iteratorStereotype"
            }

            /** disconnect all Stereotypes.
             *  @see #addStereotype
             */
            // -beg- preserve=no 338613A4007B remove_all_head448D24F502DB "ModelElement::clearStereotype"
            public void clearStereotype()
            // -end- 338613A4007B remove_all_head448D24F502DB "ModelElement::clearStereotype"
            {
              // -beg- preserve=no 338613A4007B remove_all_body448D24F502DB "ModelElement::clearStereotype"
              if(sizeStereotype()>0){
                for(java.util.Iterator p = stereotype.iterator(); p.hasNext();){
                  ((Stereotype)p.next())._unlinkExtendedElement(this);
                }
                stereotype.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearStereotype"));
              }
              // -end- 338613A4007B remove_all_body448D24F502DB "ModelElement::clearStereotype"
            }

            /** returns the number of Stereotypes.
             *  @see #addStereotype
             */
            // -beg- preserve=no 338613A4007B size_head448D24F502DB "ModelElement::sizeStereotype"
            public int sizeStereotype()
            // -end- 338613A4007B size_head448D24F502DB "ModelElement::sizeStereotype"
            {
              // -beg- preserve=no 338613A4007B size_body448D24F502DB "ModelElement::sizeStereotype"
              return stereotype.size();
              // -end- 338613A4007B size_body448D24F502DB "ModelElement::sizeStereotype"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 338613A4007B _link_body448D24F502DB "ModelElement::_linkStereotype"
            public void _linkStereotype(Stereotype stereotype1)
            {
              stereotype.add(stereotype1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkStereotype"));
              return;
            }
            // -end- 338613A4007B _link_body448D24F502DB "ModelElement::_linkStereotype"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 338613A4007B _unlink_body448D24F502DB "ModelElement::_unlinkStereotype"
            public void _unlinkStereotype(Stereotype stereotype1)
            {
              stereotype.remove(stereotype1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkStereotype"));
              return;
            }
            // -end- 338613A4007B _unlink_body448D24F502DB "ModelElement::_unlinkStereotype"

            // -beg- preserve=no 39B9B0F703C8 code448D24F502DB "referenceTag"
            private java.util.Set referenceTag = new java.util.HashSet();
            // -end- 39B9B0F703C8 code448D24F502DB "referenceTag"

            /** add a ReferenceTag.
             *  
             *  @see #removeReferenceTag
             *  @see #containsReferenceTag
             *  @see #iteratorReferenceTag
             *  @see #clearReferenceTag
             *  @see #sizeReferenceTag
             */
            // -beg- preserve=no 39B9B0F703C8 add_head448D24F502DB "ModelElement::addReferenceTag"
            public void addReferenceTag(TaggedValue referenceTag1)
            // -end- 39B9B0F703C8 add_head448D24F502DB "ModelElement::addReferenceTag"
            {
              // -beg- preserve=no 39B9B0F703C8 add_body448D24F502DB "ModelElement::addReferenceTag"
              referenceTag.add(referenceTag1);
              referenceTag1._linkReferenceValue(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addReferenceTag"));
              return;
              // -end- 39B9B0F703C8 add_body448D24F502DB "ModelElement::addReferenceTag"
            }

            /** disconnect a ReferenceTag.
             *  @see #addReferenceTag
             */
            // -beg- preserve=no 39B9B0F703C8 remove_head448D24F502DB "ModelElement::removeReferenceTag"
            public TaggedValue removeReferenceTag(TaggedValue referenceTag1)
            // -end- 39B9B0F703C8 remove_head448D24F502DB "ModelElement::removeReferenceTag"
            {
              // -beg- preserve=no 39B9B0F703C8 remove_body448D24F502DB "ModelElement::removeReferenceTag"
              TaggedValue ret=null;
              if(referenceTag1==null || !referenceTag.contains(referenceTag1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = referenceTag1;
              referenceTag.remove(referenceTag1);
              referenceTag1._unlinkReferenceValue(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeReferenceTag"));
              return ret;
              // -end- 39B9B0F703C8 remove_body448D24F502DB "ModelElement::removeReferenceTag"
            }

            /** tests if a given ReferenceTag is connected.
             *  @see #addReferenceTag
             */
            // -beg- preserve=no 39B9B0F703C8 test_head448D24F502DB "ModelElement::containsReferenceTag"
            public boolean containsReferenceTag(TaggedValue referenceTag1)
            // -end- 39B9B0F703C8 test_head448D24F502DB "ModelElement::containsReferenceTag"
            {
              // -beg- preserve=no 39B9B0F703C8 test_body448D24F502DB "ModelElement::containsReferenceTag"
              return referenceTag.contains(referenceTag1);
              // -end- 39B9B0F703C8 test_body448D24F502DB "ModelElement::containsReferenceTag"
            }

            /** used to enumerate all connected ReferenceTags.
             *  @see #addReferenceTag
             */
            // -beg- preserve=no 39B9B0F703C8 get_all_head448D24F502DB "ModelElement::iteratorReferenceTag"
            public java.util.Iterator iteratorReferenceTag()
            // -end- 39B9B0F703C8 get_all_head448D24F502DB "ModelElement::iteratorReferenceTag"
            {
              // -beg- preserve=no 39B9B0F703C8 get_all_body448D24F502DB "ModelElement::iteratorReferenceTag"
              return referenceTag.iterator();
              // -end- 39B9B0F703C8 get_all_body448D24F502DB "ModelElement::iteratorReferenceTag"
            }

            /** disconnect all ReferenceTags.
             *  @see #addReferenceTag
             */
            // -beg- preserve=no 39B9B0F703C8 remove_all_head448D24F502DB "ModelElement::clearReferenceTag"
            public void clearReferenceTag()
            // -end- 39B9B0F703C8 remove_all_head448D24F502DB "ModelElement::clearReferenceTag"
            {
              // -beg- preserve=no 39B9B0F703C8 remove_all_body448D24F502DB "ModelElement::clearReferenceTag"
              if(sizeReferenceTag()>0){
                for(java.util.Iterator p = referenceTag.iterator(); p.hasNext();){
                  ((TaggedValue)p.next())._unlinkReferenceValue(this);
                }
                referenceTag.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearReferenceTag"));
              }
              // -end- 39B9B0F703C8 remove_all_body448D24F502DB "ModelElement::clearReferenceTag"
            }

            /** returns the number of ReferenceTags.
             *  @see #addReferenceTag
             */
            // -beg- preserve=no 39B9B0F703C8 size_head448D24F502DB "ModelElement::sizeReferenceTag"
            public int sizeReferenceTag()
            // -end- 39B9B0F703C8 size_head448D24F502DB "ModelElement::sizeReferenceTag"
            {
              // -beg- preserve=no 39B9B0F703C8 size_body448D24F502DB "ModelElement::sizeReferenceTag"
              return referenceTag.size();
              // -end- 39B9B0F703C8 size_body448D24F502DB "ModelElement::sizeReferenceTag"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 39B9B0F703C8 _link_body448D24F502DB "ModelElement::_linkReferenceTag"
            public void _linkReferenceTag(TaggedValue referenceTag1)
            {
              referenceTag.add(referenceTag1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkReferenceTag"));
              return;
            }
            // -end- 39B9B0F703C8 _link_body448D24F502DB "ModelElement::_linkReferenceTag"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 39B9B0F703C8 _unlink_body448D24F502DB "ModelElement::_unlinkReferenceTag"
            public void _unlinkReferenceTag(TaggedValue referenceTag1)
            {
              referenceTag.remove(referenceTag1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkReferenceTag"));
              return;
            }
            // -end- 39B9B0F703C8 _unlink_body448D24F502DB "ModelElement::_unlinkReferenceTag"

            // -beg- preserve=no 33CD739B0316 code448D24F502DB "importedBy"
            private java.util.Set importedBy = new java.util.HashSet();
            // -end- 33CD739B0316 code448D24F502DB "importedBy"

            /** add a ImportedBy.
             *  
             *  @see #removeImportedBy
             *  @see #containsImportedBy
             *  @see #iteratorImportedBy
             *  @see #clearImportedBy
             *  @see #sizeImportedBy
             *  @see #iteratorImportedByLink
             *  @see #createImportedByLink
             *  @see #findImportedByLink
             */
            // -beg- preserve=no 33CD739B0316 add_head448D24F502DB "ModelElement::addImportedBy"
            public void addImportedBy(Package importedBy1)
            // -end- 33CD739B0316 add_head448D24F502DB "ModelElement::addImportedBy"
            {
              // -beg- preserve=no 33CD739B0316 add_body448D24F502DB "ModelElement::addImportedBy"
              ElementImport linkobj=createImportedByLink();
              linkobj.setImportedBy(importedBy1);
              linkobj.setImportedElement(this);
              importedBy.add(linkobj);
              importedBy1._linkImportedElement(linkobj);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedBy"));
              return;
              // -end- 33CD739B0316 add_body448D24F502DB "ModelElement::addImportedBy"
            }

            /** add a link to a ImportedBy.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 addlink_head448D24F502DB "ModelElement::addImportedByLink"
            public void addImportedByLink(ElementImport importedBy1)
            // -end- 33CD739B0316 addlink_head448D24F502DB "ModelElement::addImportedByLink"
            {
              // -beg- preserve=no 33CD739B0316 addlink_body448D24F502DB "ModelElement::addImportedByLink"
              importedBy1.setImportedElement(this);
              importedBy.add(importedBy1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addImportedByLink"));
              return;
              // -end- 33CD739B0316 addlink_body448D24F502DB "ModelElement::addImportedByLink"
            }

            /** disconnect a ImportedBy.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 remove_head448D24F502DB "ModelElement::removeImportedBy"
            public Package removeImportedBy(Package importedBy1)
            // -end- 33CD739B0316 remove_head448D24F502DB "ModelElement::removeImportedBy"
            {
              // -beg- preserve=no 33CD739B0316 remove_body448D24F502DB "ModelElement::removeImportedBy"
              Package ret=null;
              ElementImport linkobj=findImportedByLink(importedBy1);
              if(importedBy1==null || linkobj==null){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = linkobj.getImportedBy();
              importedBy.remove(linkobj);
              ret._unlinkImportedElement(linkobj);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeImportedBy"));
              return ret;
              // -end- 33CD739B0316 remove_body448D24F502DB "ModelElement::removeImportedBy"
            }

            /** tests if a given ImportedBy is connected.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 test_head448D24F502DB "ModelElement::containsImportedBy"
            public boolean containsImportedBy(Package importedBy1)
            // -end- 33CD739B0316 test_head448D24F502DB "ModelElement::containsImportedBy"
            {
              // -beg- preserve=no 33CD739B0316 test_body448D24F502DB "ModelElement::containsImportedBy"
              return importedBy.contains(findImportedByLink(importedBy1));
              // -end- 33CD739B0316 test_body448D24F502DB "ModelElement::containsImportedBy"
            }

            /** used to enumerate all connected ImportedBys.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 get_all_head448D24F502DB "ModelElement::iteratorImportedBy"
            public java.util.Iterator iteratorImportedBy()
            // -end- 33CD739B0316 get_all_head448D24F502DB "ModelElement::iteratorImportedBy"
            {
              // -beg- preserve=no 33CD739B0316 get_all_body448D24F502DB "ModelElement::iteratorImportedBy"
              return new java.util.Iterator(){
                private java.util.Iterator i=importedBy.iterator();
                public boolean hasNext(){
                  return i.hasNext();
                }
                public Object next(){
                  ElementImport next=(ElementImport)i.next();
                  return next.getImportedBy();
                }
                public void remove(){
                  i.remove();
                }
              };
              // -end- 33CD739B0316 get_all_body448D24F502DB "ModelElement::iteratorImportedBy"
            }

            /** disconnect all ImportedBys.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 remove_all_head448D24F502DB "ModelElement::clearImportedBy"
            public void clearImportedBy()
            // -end- 33CD739B0316 remove_all_head448D24F502DB "ModelElement::clearImportedBy"
            {
              // -beg- preserve=no 33CD739B0316 remove_all_body448D24F502DB "ModelElement::clearImportedBy"
              if(sizeImportedBy()>0){
                for(java.util.Iterator p = importedBy.iterator(); p.hasNext();){
                  ElementImport linkobj=(ElementImport)p.next();
                  linkobj.getImportedBy()._unlinkImportedElement(linkobj);
                }
                importedBy.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearImportedBy"));
              }
              // -end- 33CD739B0316 remove_all_body448D24F502DB "ModelElement::clearImportedBy"
            }

            /** returns the number of ImportedBys.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 size_head448D24F502DB "ModelElement::sizeImportedBy"
            public int sizeImportedBy()
            // -end- 33CD739B0316 size_head448D24F502DB "ModelElement::sizeImportedBy"
            {
              // -beg- preserve=no 33CD739B0316 size_body448D24F502DB "ModelElement::sizeImportedBy"
              return importedBy.size();
              // -end- 33CD739B0316 size_body448D24F502DB "ModelElement::sizeImportedBy"
            }

            /** enumerate the link objects of currently connected ImportedBy.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 itlink_head448D24F502DB "ModelElement::getImportedByLink"
            public java.util.Iterator iteratorImportedByLink()
            // -end- 33CD739B0316 itlink_head448D24F502DB "ModelElement::getImportedByLink"
            {
              // -beg- preserve=no 33CD739B0316 itlink_body448D24F502DB "ModelElement::getImportedByLink"
              return importedBy.iterator();
              // -end- 33CD739B0316 itlink_body448D24F502DB "ModelElement::getImportedByLink"
            }

            /** create a link class for a new link to a ImportedBy.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 createlink_head448D24F502DB "ModelElement::createImportedByLink"
            public ElementImport createImportedByLink()
            // -end- 33CD739B0316 createlink_head448D24F502DB "ModelElement::createImportedByLink"
            {
              // -beg- preserve=no 33CD739B0316 createlink_body448D24F502DB "ModelElement::createImportedByLink"
              // return new ElementImport();
              throw new java.lang.UnsupportedOperationException();
              // -end- 33CD739B0316 createlink_body448D24F502DB "ModelElement::createImportedByLink"
            }

            /** find a link object for a given ImportedBy.
             *  @see #addImportedBy
             */
            // -beg- preserve=no 33CD739B0316 find_head448D24F502DB "ModelElement::findImportedByLink"
            public ElementImport findImportedByLink(Package importedBy1)
            // -end- 33CD739B0316 find_head448D24F502DB "ModelElement::findImportedByLink"
            {
                // -beg- preserve=no 33CD739B0316 find_body448D24F502DB "ModelElement::findImportedByLink"
                if(importedBy1==null) return null;
                for(java.util.Iterator p = importedBy.iterator(); p.hasNext();){
                  ElementImport linkobj=(ElementImport)p.next();
                  if(linkobj.getImportedBy()==importedBy1) return linkobj;
                }
                return null;
                // -end- 33CD739B0316 find_body448D24F502DB "ModelElement::findImportedByLink"
              }

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 33CD739B0316 _link_body448D24F502DB "ModelElement::_linkImportedBy"
              public void _linkImportedBy(ElementImport importedBy1)
              {
                importedBy.add(importedBy1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkImportedBy"));
                return;
              }
              // -end- 33CD739B0316 _link_body448D24F502DB "ModelElement::_linkImportedBy"

              /** DONT USE; link management internal
               */
              // -beg- preserve=no 33CD739B0316 _unlink_body448D24F502DB "ModelElement::_unlinkImportedBy"
              public void _unlinkImportedBy(ElementImport importedBy1)
              {
                importedBy.remove(importedBy1);
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkImportedBy"));
                return;
              }
              // -end- 33CD739B0316 _unlink_body448D24F502DB "ModelElement::_unlinkImportedBy"

              // -beg- preserve=no 335D4BA70064 var448D24F502DB "name"
              private NlsString name = null;
              // -end- 335D4BA70064 var448D24F502DB "name"

              /** get current value of name
               *  @see #setName
               */
              // -beg- preserve=no 335D4BA70064 get_head448D24F502DB "name"
              public  NlsString getName()
              // -end- 335D4BA70064 get_head448D24F502DB "name"
              {
                // -beg- preserve=no 335D4BA70064 get_body448D24F502DB "name"
                return name;
                // -end- 335D4BA70064 get_body448D24F502DB "name"
              }

              /** set current value of name
               *  @see #getName
               */
              // -beg- preserve=no 335D4BA70064 set_head448D24F502DB "name"
              public  void setName(NlsString value1)
              // -end- 335D4BA70064 set_head448D24F502DB "name"
              {
                // -beg- preserve=no 335D4BA70064 set_body448D24F502DB "name"
                if(name!=value1 && (name==null || !name.equals(value1))){
                  name = value1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setName"));
                }
                // -end- 335D4BA70064 set_body448D24F502DB "name"
              }

			@Override
			public NlsString getMetaAttrb() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setMetaAttrb(NlsString value) {
				// TODO Auto-generated method stub
				
			}

              // declare/define something only in the code
              // please fill in/modify the following section
              // -beg- preserve=no 448D24F502DB detail_end "UmlTaggedValue"

              // -end- 448D24F502DB detail_end "UmlTaggedValue"

            }

