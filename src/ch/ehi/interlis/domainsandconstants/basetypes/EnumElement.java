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

              // -beg- preserve=no 358A69810091 package "EnumElement"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 358A69810091 package "EnumElement"

              // -beg- preserve=no 358A69810091 autoimport "EnumElement"
              import ch.ehi.uml1_4.foundation.core.ModelElement;
              import ch.ehi.uml1_4.implementation.AbstractModelElement;
              import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
              import ch.ehi.basics.types.NlsString;
              import ch.ehi.basics.tools.AbstractVisitor;
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
              import ch.ehi.uml1_4.foundation.core.PresentationElement;
              import ch.ehi.uml1_4.foundation.core.Component;
              import ch.ehi.uml1_4.foundation.core.ElementResidence;
              import ch.ehi.uml1_4.foundation.core.TemplateParameter;
              import ch.ehi.uml1_4.foundation.core.Flow;
              import ch.ehi.uml1_4.foundation.core.Comment;
              import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
              import ch.ehi.uml1_4.modelmanagement.Package;
              import ch.ehi.uml1_4.modelmanagement.ElementImport;
              // -end- 358A69810091 autoimport "EnumElement"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 358A69810091 import "EnumElement"

              // -end- 358A69810091 import "EnumElement"

              /** Definiert ein Element einer Aufzählung.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:18 $
               */
public class EnumElement extends AbstractModelElement implements ModelElement , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A69810091 detail_begin "EnumElement"

                // -end- 358A69810091 detail_begin "EnumElement"

                // -beg- preserve=no 3D4FA21B00C0 head358A69810091 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B00C0 head358A69810091 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00C0 throws358A69810091 "unlinkAll"

                  // -end- 3D4FA21B00C0 throws358A69810091 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00C0 body358A69810091 "unlinkAll"
                  
                  detachEnumeration();
                  detachChild();
                  setName(null);
                  setNameList(null);
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
                  setDocumentation(null);
                  super.unlinkAll();
                  // -end- 3D4FA21B00C0 body358A69810091 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B00C1 head358A69810091 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B00C1 head358A69810091 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00C1 throws358A69810091 "enumerateChildren"

                  // -end- 3D4FA21B00C1 throws358A69810091 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00C1 body358A69810091 "enumerateChildren"
                  java.util.Iterator it=null;
                  if(containsChild())visitor.visit(getChild());
                  visitor.visit(getName());
                  visitor.visit(getNameList());
                  it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
                  it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
                  visitor.visit(getDocumentation());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B00C1 body358A69810091 "enumerateChildren"
                  }

                // -beg- preserve=no 358A699B02AC code358A69810091 "enumeration"
                private Enumeration enumeration;
                // -end- 358A699B02AC code358A69810091 "enumeration"

                /** attaches a Enumeration.
                 *  
                 *  @see #detachEnumeration
                 *  @see #getEnumeration
                 *  @see #containsEnumeration
                 */
                // -beg- preserve=no 358A699B02AC attach_head358A69810091 "EnumElement::attachEnumeration"
                public void attachEnumeration(Enumeration enumeration1)
                // -end- 358A699B02AC attach_head358A69810091 "EnumElement::attachEnumeration"
                {
                  // -beg- preserve=no 358A699B02AC attach_body358A69810091 "EnumElement::attachEnumeration"
                  if(enumeration!=null) {throw new java.lang.IllegalStateException("already a enumeration attached");}
                  if(enumeration1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as enumeration");}
                  enumeration = enumeration1;
                  enumeration1._linkEnumElement(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachEnumeration"));
                  return;
                  // -end- 358A699B02AC attach_body358A69810091 "EnumElement::attachEnumeration"
                }

                /** disconnect the currently attached Enumeration.
                 *  @see #attachEnumeration
                 */
                // -beg- preserve=no 358A699B02AC detach_head358A69810091 "EnumElement::detachEnumeration"
                public Enumeration detachEnumeration()
                // -end- 358A699B02AC detach_head358A69810091 "EnumElement::detachEnumeration"
                {
                  // -beg- preserve=no 358A699B02AC detach_body358A69810091 "EnumElement::detachEnumeration"
                  Enumeration ret = null;
                  if(enumeration!=null){
                    enumeration._unlinkEnumElement(this);
                    ret = enumeration;
                    enumeration = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachEnumeration"));
                  return ret;
                  // -end- 358A699B02AC detach_body358A69810091 "EnumElement::detachEnumeration"
                }

                /** get the currently attached Enumeration.
                 *  @see #attachEnumeration
                 */
                // -beg- preserve=no 358A699B02AC get_head358A69810091 "EnumElement::getEnumeration"
                public Enumeration getEnumeration()
                // -end- 358A699B02AC get_head358A69810091 "EnumElement::getEnumeration"
                {
                  // -beg- preserve=no 358A699B02AC get_body358A69810091 "EnumElement::getEnumeration"
                  if(enumeration==null) {throw new java.lang.IllegalStateException("no enumeration attached");}
                  return enumeration;
                  // -end- 358A699B02AC get_body358A69810091 "EnumElement::getEnumeration"
                }

                /** tests if there is a Enumeration attached.
                 *  @see #attachEnumeration
                 */
                // -beg- preserve=no 358A699B02AC test_head358A69810091 "EnumElement::containsEnumeration"
                public boolean containsEnumeration()
                // -end- 358A699B02AC test_head358A69810091 "EnumElement::containsEnumeration"
                {
                  // -beg- preserve=no 358A699B02AC test_body358A69810091 "EnumElement::containsEnumeration"
                  return enumeration!=null;
                  // -end- 358A699B02AC test_body358A69810091 "EnumElement::containsEnumeration"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 358A699B02AC _link_body358A69810091 "EnumElement::_linkEnumeration"
                public void _linkEnumeration(Enumeration enumeration1)
                {
                  enumeration = enumeration1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkEnumeration"));
                  return;
                }
                // -end- 358A699B02AC _link_body358A69810091 "EnumElement::_linkEnumeration"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 358A699B02AC _unlink_body358A69810091 "EnumElement::_unlinkEnumeration"
                public void _unlinkEnumeration(Enumeration enumeration1)
                {
                  enumeration = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkEnumeration"));
                  return;
                }
                // -end- 358A699B02AC _unlink_body358A69810091 "EnumElement::_unlinkEnumeration"

                // -beg- preserve=no 358A69A40313 code358A69810091 "child"
                private Enumeration child;
                // -end- 358A69A40313 code358A69810091 "child"

                /** attaches a Child.
                 *  
                 *  @see #detachChild
                 *  @see #getChild
                 *  @see #containsChild
                 */
                // -beg- preserve=no 358A69A40313 attach_head358A69810091 "EnumElement::attachChild"
                public void attachChild(Enumeration child1)
                // -end- 358A69A40313 attach_head358A69810091 "EnumElement::attachChild"
                {
                  // -beg- preserve=no 358A69A40313 attach_body358A69810091 "EnumElement::attachChild"
                  if(child!=null) {throw new java.lang.IllegalStateException("already a child attached");}
                  if(child1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as child");}
                  child = child1;
                  child1._linkParent(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachChild"));
                  return;
                  // -end- 358A69A40313 attach_body358A69810091 "EnumElement::attachChild"
                }

                /** disconnect the currently attached Child.
                 *  @see #attachChild
                 */
                // -beg- preserve=no 358A69A40313 detach_head358A69810091 "EnumElement::detachChild"
                public Enumeration detachChild()
                // -end- 358A69A40313 detach_head358A69810091 "EnumElement::detachChild"
                {
                  // -beg- preserve=no 358A69A40313 detach_body358A69810091 "EnumElement::detachChild"
                  Enumeration ret = null;
                  if(child!=null){
                    child._unlinkParent(this);
                    ret = child;
                    child = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachChild"));
                  return ret;
                  // -end- 358A69A40313 detach_body358A69810091 "EnumElement::detachChild"
                }

                /** get the currently attached Child.
                 *  @see #attachChild
                 */
                // -beg- preserve=no 358A69A40313 get_head358A69810091 "EnumElement::getChild"
                public Enumeration getChild()
                // -end- 358A69A40313 get_head358A69810091 "EnumElement::getChild"
                {
                  // -beg- preserve=no 358A69A40313 get_body358A69810091 "EnumElement::getChild"
                  if(child==null) {throw new java.lang.IllegalStateException("no child attached");}
                  return child;
                  // -end- 358A69A40313 get_body358A69810091 "EnumElement::getChild"
                }

                /** tests if there is a Child attached.
                 *  @see #attachChild
                 */
                // -beg- preserve=no 358A69A40313 test_head358A69810091 "EnumElement::containsChild"
                public boolean containsChild()
                // -end- 358A69A40313 test_head358A69810091 "EnumElement::containsChild"
                {
                  // -beg- preserve=no 358A69A40313 test_body358A69810091 "EnumElement::containsChild"
                  return child!=null;
                  // -end- 358A69A40313 test_body358A69810091 "EnumElement::containsChild"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 358A69A40313 _link_body358A69810091 "EnumElement::_linkChild"
                public void _linkChild(Enumeration child1)
                {
                  child = child1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkChild"));
                  return;
                }
                // -end- 358A69A40313 _link_body358A69810091 "EnumElement::_linkChild"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 358A69A40313 _unlink_body358A69810091 "EnumElement::_unlinkChild"
                public void _unlinkChild(Enumeration child1)
                {
                  child = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkChild"));
                  return;
                }
                // -end- 358A69A40313 _unlink_body358A69810091 "EnumElement::_unlinkChild"

                // -beg- preserve=no 358A698702DF var358A69810091 "name"

                // -end- 358A698702DF var358A69810091 "name"

                /** get current value of name
                 *  Bezeichnung des Elementes
                 *  @see #setName
                 */
                // -beg- preserve=no 358A698702DF get_head358A69810091 "name"
                public  NlsString getName()
                // -end- 358A698702DF get_head358A69810091 "name"
                {
                  // -beg- preserve=no 358A698702DF get_body358A69810091 "name"
                  return super.getName();
                  // -end- 358A698702DF get_body358A69810091 "name"
                }

                /** set current value of name
                 *  @see #getName
                 */
                // -beg- preserve=no 358A698702DF set_head358A69810091 "name"
                public  void setName(NlsString value1)
                // -end- 358A698702DF set_head358A69810091 "name"
                {
                  // -beg- preserve=no 358A698702DF set_body358A69810091 "name"
                  super.setName(value1);
                  // -end- 358A698702DF set_body358A69810091 "name"
                }

                // -beg- preserve=no 394895E40137 var358A69810091 "nameList"
                private NlsString nameList = null;
                // -end- 394895E40137 var358A69810091 "nameList"

                /** get current value of nameList
                 *  Weitere Namen, um bei einer Erweiterung das Element das erweitert wird zu identifizieren.
                 *  @see #setNameList
                 */
                // -beg- preserve=no 394895E40137 get_head358A69810091 "nameList"
                public  NlsString getNameList()
                // -end- 394895E40137 get_head358A69810091 "nameList"
                {
                  // -beg- preserve=no 394895E40137 get_body358A69810091 "nameList"
                  return nameList;
                  // -end- 394895E40137 get_body358A69810091 "nameList"
                }

                /** set current value of nameList
                 *  @see #getNameList
                 */
                // -beg- preserve=no 394895E40137 set_head358A69810091 "nameList"
                public  void setNameList(NlsString value1)
                // -end- 394895E40137 set_head358A69810091 "nameList"
                {
                  // -beg- preserve=no 394895E40137 set_body358A69810091 "nameList"
                  if(nameList!=value1 && (nameList==null || !nameList.equals(value1))){
                    nameList = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setNameList"));
                  }
                  // -end- 394895E40137 set_body358A69810091 "nameList"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A69810091 detail_end "EnumElement"

                // -end- 358A69810091 detail_end "EnumElement"

              }

=======
// -beg- preserve=no 358A69810091 package "EnumElement"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 358A69810091 package "EnumElement"

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -beg- preserve=no 358A69810091 autoimport "EnumElement"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractModelElement;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A69810091 import "EnumElement"

// -end- 358A69810091 import "EnumElement"

/**
 * Definiert ein Element einer AufzÃ¤hlung.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:18 $
 */
public class EnumElement extends AbstractModelElement implements ModelElement, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A69810091 detail_begin "EnumElement"

	// -end- 358A69810091 detail_begin "EnumElement"

	private static final long serialVersionUID = 6879932099811682238L;

	// -beg- preserve=no 3D4FA21B00C0 head358A69810091 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B00C0 head358A69810091 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B00C0 throws358A69810091 "unlinkAll"

	// -end- 3D4FA21B00C0 throws358A69810091 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B00C0 body358A69810091 "unlinkAll"

		detachEnumeration();
		detachChild();
		setName(null);
		setMetaAttrb(null);
		setNameList(null);
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
		// Role ParameterDefinition: TemplateParameter object(s) may point to
		// this
		clearStereotype();
		clearReferenceTag();
		clearImportedBy();
		// Role EditorTreeElement: EditorTreeElement object(s) may point to this
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA21B00C0 body358A69810091 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B00C1 head358A69810091 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B00C1 head358A69810091 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B00C1 throws358A69810091 "enumerateChildren"

	// -end- 3D4FA21B00C1 throws358A69810091 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B00C1 body358A69810091 "enumerateChildren"
		Iterator<?> it = null;
		if (containsChild())
			visitor.visit(getChild());
		visitor.visit(getName());
		visitor.visit(getMetaAttrb());
		visitor.visit(getNameList());
		it = iteratorBehavior();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTaggedValue();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTemplateParameter();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B00C1 body358A69810091 "enumerateChildren"
	}

	// -beg- preserve=no 358A699B02AC code358A69810091 "enumeration"
	private Enumeration enumeration;
	// -end- 358A699B02AC code358A69810091 "enumeration"

	/**
	 * attaches a Enumeration.
	 *
	 * @see #detachEnumeration
	 * @see #getEnumeration
	 * @see #containsEnumeration
	 */
	// -beg- preserve=no 358A699B02AC attach_head358A69810091
	// "EnumElement::attachEnumeration"
	public void attachEnumeration(Enumeration enumeration1)
	// -end- 358A699B02AC attach_head358A69810091
	// "EnumElement::attachEnumeration"
	{
		// -beg- preserve=no 358A699B02AC attach_body358A69810091
		// "EnumElement::attachEnumeration"
		if (enumeration != null) {
			throw new java.lang.IllegalStateException("already a enumeration attached");
		}
		if (enumeration1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as enumeration");
		}
		enumeration = enumeration1;
		enumeration1._linkEnumElement(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachEnumeration"));
		return;
		// -end- 358A699B02AC attach_body358A69810091
		// "EnumElement::attachEnumeration"
	}

	/**
	 * disconnect the currently attached Enumeration.
	 * 
	 * @see #attachEnumeration
	 */
	// -beg- preserve=no 358A699B02AC detach_head358A69810091
	// "EnumElement::detachEnumeration"
	public Enumeration detachEnumeration()
	// -end- 358A699B02AC detach_head358A69810091
	// "EnumElement::detachEnumeration"
	{
		// -beg- preserve=no 358A699B02AC detach_body358A69810091
		// "EnumElement::detachEnumeration"
		Enumeration ret = null;
		if (enumeration != null) {
			enumeration._unlinkEnumElement(this);
			ret = enumeration;
			enumeration = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachEnumeration"));
		return ret;
		// -end- 358A699B02AC detach_body358A69810091
		// "EnumElement::detachEnumeration"
	}

	/**
	 * get the currently attached Enumeration.
	 * 
	 * @see #attachEnumeration
	 */
	// -beg- preserve=no 358A699B02AC get_head358A69810091
	// "EnumElement::getEnumeration"
	public Enumeration getEnumeration()
	// -end- 358A699B02AC get_head358A69810091 "EnumElement::getEnumeration"
	{
		// -beg- preserve=no 358A699B02AC get_body358A69810091
		// "EnumElement::getEnumeration"
		if (enumeration == null) {
			throw new java.lang.IllegalStateException("no enumeration attached");
		}
		return enumeration;
		// -end- 358A699B02AC get_body358A69810091 "EnumElement::getEnumeration"
	}

	/**
	 * tests if there is a Enumeration attached.
	 * 
	 * @see #attachEnumeration
	 */
	// -beg- preserve=no 358A699B02AC test_head358A69810091
	// "EnumElement::containsEnumeration"
	public boolean containsEnumeration()
	// -end- 358A699B02AC test_head358A69810091
	// "EnumElement::containsEnumeration"
	{
		// -beg- preserve=no 358A699B02AC test_body358A69810091
		// "EnumElement::containsEnumeration"
		return enumeration != null;
		// -end- 358A699B02AC test_body358A69810091
		// "EnumElement::containsEnumeration"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A699B02AC _link_body358A69810091
	// "EnumElement::_linkEnumeration"
	public void _linkEnumeration(Enumeration enumeration1) {
		enumeration = enumeration1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkEnumeration"));
		return;
	}
	// -end- 358A699B02AC _link_body358A69810091 "EnumElement::_linkEnumeration"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A699B02AC _unlink_body358A69810091
	// "EnumElement::_unlinkEnumeration"
	public void _unlinkEnumeration(Enumeration enumeration1) {
		enumeration = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkEnumeration"));
		return;
	}
	// -end- 358A699B02AC _unlink_body358A69810091
	// "EnumElement::_unlinkEnumeration"

	// -beg- preserve=no 358A69A40313 code358A69810091 "child"
	private Enumeration child;
	// -end- 358A69A40313 code358A69810091 "child"

	/**
	 * attaches a Child.
	 *
	 * @see #detachChild
	 * @see #getChild
	 * @see #containsChild
	 */
	// -beg- preserve=no 358A69A40313 attach_head358A69810091
	// "EnumElement::attachChild"
	public void attachChild(Enumeration child1)
	// -end- 358A69A40313 attach_head358A69810091 "EnumElement::attachChild"
	{
		// -beg- preserve=no 358A69A40313 attach_body358A69810091
		// "EnumElement::attachChild"
		if (child != null) {
			throw new java.lang.IllegalStateException("already a child attached");
		}
		if (child1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as child");
		}
		child = child1;
		child1._linkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachChild"));
		return;
		// -end- 358A69A40313 attach_body358A69810091 "EnumElement::attachChild"
	}

	/**
	 * disconnect the currently attached Child.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 358A69A40313 detach_head358A69810091
	// "EnumElement::detachChild"
	public Enumeration detachChild()
	// -end- 358A69A40313 detach_head358A69810091 "EnumElement::detachChild"
	{
		// -beg- preserve=no 358A69A40313 detach_body358A69810091
		// "EnumElement::detachChild"
		Enumeration ret = null;
		if (child != null) {
			child._unlinkParent(this);
			ret = child;
			child = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachChild"));
		return ret;
		// -end- 358A69A40313 detach_body358A69810091 "EnumElement::detachChild"
	}

	/**
	 * get the currently attached Child.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 358A69A40313 get_head358A69810091
	// "EnumElement::getChild"
	public Enumeration getChild()
	// -end- 358A69A40313 get_head358A69810091 "EnumElement::getChild"
	{
		// -beg- preserve=no 358A69A40313 get_body358A69810091
		// "EnumElement::getChild"
		if (child == null) {
			throw new java.lang.IllegalStateException("no child attached");
		}
		return child;
		// -end- 358A69A40313 get_body358A69810091 "EnumElement::getChild"
	}

	/**
	 * tests if there is a Child attached.
	 * 
	 * @see #attachChild
	 */
	// -beg- preserve=no 358A69A40313 test_head358A69810091
	// "EnumElement::containsChild"
	public boolean containsChild()
	// -end- 358A69A40313 test_head358A69810091 "EnumElement::containsChild"
	{
		// -beg- preserve=no 358A69A40313 test_body358A69810091
		// "EnumElement::containsChild"
		return child != null;
		// -end- 358A69A40313 test_body358A69810091 "EnumElement::containsChild"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A69A40313 _link_body358A69810091
	// "EnumElement::_linkChild"
	public void _linkChild(Enumeration child1) {
		child = child1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkChild"));
		return;
	}
	// -end- 358A69A40313 _link_body358A69810091 "EnumElement::_linkChild"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A69A40313 _unlink_body358A69810091
	// "EnumElement::_unlinkChild"
	public void _unlinkChild(Enumeration child1) {
		child = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkChild"));
		return;
	}
	// -end- 358A69A40313 _unlink_body358A69810091 "EnumElement::_unlinkChild"

	// -beg- preserve=no 358A698702DF var358A69810091 "name"

	// -end- 358A698702DF var358A69810091 "name"

	/**
	 * get current value of name Bezeichnung des Elementes
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 358A698702DF get_head358A69810091 "name"
	public NlsString getName()
	// -end- 358A698702DF get_head358A69810091 "name"
	{
		// -beg- preserve=no 358A698702DF get_body358A69810091 "name"
		return super.getName();
		// -end- 358A698702DF get_body358A69810091 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 358A698702DF set_head358A69810091 "name"
	public void setName(NlsString value1)
	// -end- 358A698702DF set_head358A69810091 "name"
	{
		// -beg- preserve=no 358A698702DF set_body358A69810091 "name"
		super.setName(value1);
		// -end- 358A698702DF set_body358A69810091 "name"
	}

	// -beg- preserve=no 394895E40137 var358A69810091 "nameList"
	private NlsString nameList = null;
	// -end- 394895E40137 var358A69810091 "nameList"

	/**
	 * get current value of nameList Weitere Namen, um bei einer Erweiterung das
	 * Element das erweitert wird zu identifizieren.
	 * 
	 * @see #setNameList
	 */
	// -beg- preserve=no 394895E40137 get_head358A69810091 "nameList"
	public NlsString getNameList()
	// -end- 394895E40137 get_head358A69810091 "nameList"
	{
		// -beg- preserve=no 394895E40137 get_body358A69810091 "nameList"
		return nameList;
		// -end- 394895E40137 get_body358A69810091 "nameList"
	}

	/**
	 * set current value of nameList
	 * 
	 * @see #getNameList
	 */
	// -beg- preserve=no 394895E40137 set_head358A69810091 "nameList"
	public void setNameList(NlsString value1)
	// -end- 394895E40137 set_head358A69810091 "nameList"
	{
		// -beg- preserve=no 394895E40137 set_body358A69810091 "nameList"
		if (nameList != value1 && (nameList == null || !nameList.equals(value1))) {
			nameList = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setNameList"));
		}
		// -end- 394895E40137 set_body358A69810091 "nameList"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMetaAttrb(value);
	}
	public NlsString getMetaName() {
		return super.getMetaName();
	}

	public void setMetaName(NlsString value) {
		super.setMetaName(value);
	}
	public NlsString getMetaMsg() {
		return super.getMetaMsg();
	}

	public void setMetaMsg(NlsString value) {
		super.setMetaMsg(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A69810091 detail_end "EnumElement"

	// -end- 358A69810091 detail_end "EnumElement"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
