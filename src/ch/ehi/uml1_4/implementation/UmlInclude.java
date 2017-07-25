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


// -beg- preserve=no 4551A7840119 package "UmlInclude"
package ch.ehi.uml1_4.implementation;
// -end- 4551A7840119 package "UmlInclude"

// -beg- preserve=no 4551A7840119 autoimport "UmlInclude"
import ch.ehi.uml1_4.behaviour.usecases.Include;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.usecases.UseCase;
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
import ch.ehi.basics.types.NlsString;
// -end- 4551A7840119 autoimport "UmlInclude"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4551A7840119 import "UmlInclude"

// -end- 4551A7840119 import "UmlInclude"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlInclude extends AbstractModelElement implements Include
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4551A7840119 detail_begin "UmlInclude"

  // -end- 4551A7840119 detail_begin "UmlInclude"

  // -beg- preserve=no 4551A8880145 head4551A7840119 "unlinkAll"
  public void unlinkAll()
  // -end- 4551A8880145 head4551A7840119 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551A8880145 throws4551A7840119 "unlinkAll"

    // -end- 4551A8880145 throws4551A7840119 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551A8880145 body4551A7840119 "unlinkAll"
    
    detachAddition();
    detachBase();
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
    setMetaAttrb(null);
    setDocumentation(null);
    super.unlinkAll();
    // -end- 4551A8880145 body4551A7840119 "unlinkAll"
    }

  // -beg- preserve=no 4551A88B03DE head4551A7840119 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 4551A88B03DE head4551A7840119 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551A88B03DE throws4551A7840119 "enumerateChildren"

    // -end- 4551A88B03DE throws4551A7840119 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551A88B03DE body4551A7840119 "enumerateChildren"
    java.util.Iterator it=null;
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    visitor.visit(getDocumentation());
    super.enumerateChildren(visitor);
    // -end- 4551A88B03DE body4551A7840119 "enumerateChildren"
    }

  // -beg- preserve=no 35FDD995038E code4551A7840119 "addition"
  private UseCase addition;
  // -end- 35FDD995038E code4551A7840119 "addition"

  /** attaches a Addition.
   *  
   *  @see #detachAddition
   *  @see #getAddition
   *  @see #containsAddition
   */
  // -beg- preserve=no 35FDD995038E attach_head4551A7840119 "Include::attachAddition"
  public void attachAddition(UseCase addition1)
  // -end- 35FDD995038E attach_head4551A7840119 "Include::attachAddition"
  {
    // -beg- preserve=no 35FDD995038E attach_body4551A7840119 "Include::attachAddition"
    if(addition!=null) {throw new java.lang.IllegalStateException("already a addition attached");}
    if(addition1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as addition");}
    addition = addition1;
    addition1._linkBaseInclude(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAddition"));
    return;
    // -end- 35FDD995038E attach_body4551A7840119 "Include::attachAddition"
  }

  /** disconnect the currently attached Addition.
   *  @see #attachAddition
   */
  // -beg- preserve=no 35FDD995038E detach_head4551A7840119 "Include::detachAddition"
  public UseCase detachAddition()
  // -end- 35FDD995038E detach_head4551A7840119 "Include::detachAddition"
  {
    // -beg- preserve=no 35FDD995038E detach_body4551A7840119 "Include::detachAddition"
    UseCase ret = null;
    if(addition!=null){
      addition._unlinkBaseInclude(this);
      ret = addition;
      addition = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAddition"));
    return ret;
    // -end- 35FDD995038E detach_body4551A7840119 "Include::detachAddition"
  }

  /** get the currently attached Addition.
   *  @see #attachAddition
   */
  // -beg- preserve=no 35FDD995038E get_head4551A7840119 "Include::getAddition"
  public UseCase getAddition()
  // -end- 35FDD995038E get_head4551A7840119 "Include::getAddition"
  {
    // -beg- preserve=no 35FDD995038E get_body4551A7840119 "Include::getAddition"
    if(addition==null) {throw new java.lang.IllegalStateException("no addition attached");}
    return addition;
    // -end- 35FDD995038E get_body4551A7840119 "Include::getAddition"
  }

  /** tests if there is a Addition attached.
   *  @see #attachAddition
   */
  // -beg- preserve=no 35FDD995038E test_head4551A7840119 "Include::containsAddition"
  public boolean containsAddition()
  // -end- 35FDD995038E test_head4551A7840119 "Include::containsAddition"
  {
    // -beg- preserve=no 35FDD995038E test_body4551A7840119 "Include::containsAddition"
    return addition!=null;
    // -end- 35FDD995038E test_body4551A7840119 "Include::containsAddition"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD995038E _link_body4551A7840119 "Include::_linkAddition"
  public void _linkAddition(UseCase addition1)
  {
    addition = addition1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAddition"));
    return;
  }
  // -end- 35FDD995038E _link_body4551A7840119 "Include::_linkAddition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD995038E _unlink_body4551A7840119 "Include::_unlinkAddition"
  public void _unlinkAddition(UseCase addition1)
  {
    addition = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAddition"));
    return;
  }
  // -end- 35FDD995038E _unlink_body4551A7840119 "Include::_unlinkAddition"

  // -beg- preserve=no 35FDD9A50046 code4551A7840119 "base"
  private UseCase base;
  // -end- 35FDD9A50046 code4551A7840119 "base"

  /** attaches a Base.
   *  
   *  @see #detachBase
   *  @see #getBase
   *  @see #containsBase
   */
  // -beg- preserve=no 35FDD9A50046 attach_head4551A7840119 "Include::attachBase"
  public void attachBase(UseCase base1)
  // -end- 35FDD9A50046 attach_head4551A7840119 "Include::attachBase"
  {
    // -beg- preserve=no 35FDD9A50046 attach_body4551A7840119 "Include::attachBase"
    if(base!=null) {throw new java.lang.IllegalStateException("already a base attached");}
    if(base1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as base");}
    base = base1;
    base1._linkAdditionInclude(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachBase"));
    return;
    // -end- 35FDD9A50046 attach_body4551A7840119 "Include::attachBase"
  }

  /** disconnect the currently attached Base.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD9A50046 detach_head4551A7840119 "Include::detachBase"
  public UseCase detachBase()
  // -end- 35FDD9A50046 detach_head4551A7840119 "Include::detachBase"
  {
    // -beg- preserve=no 35FDD9A50046 detach_body4551A7840119 "Include::detachBase"
    UseCase ret = null;
    if(base!=null){
      base._unlinkAdditionInclude(this);
      ret = base;
      base = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachBase"));
    return ret;
    // -end- 35FDD9A50046 detach_body4551A7840119 "Include::detachBase"
  }

  /** get the currently attached Base.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD9A50046 get_head4551A7840119 "Include::getBase"
  public UseCase getBase()
  // -end- 35FDD9A50046 get_head4551A7840119 "Include::getBase"
  {
    // -beg- preserve=no 35FDD9A50046 get_body4551A7840119 "Include::getBase"
    if(base==null) {throw new java.lang.IllegalStateException("no base attached");}
    return base;
    // -end- 35FDD9A50046 get_body4551A7840119 "Include::getBase"
  }

  /** tests if there is a Base attached.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD9A50046 test_head4551A7840119 "Include::containsBase"
  public boolean containsBase()
  // -end- 35FDD9A50046 test_head4551A7840119 "Include::containsBase"
  {
    // -beg- preserve=no 35FDD9A50046 test_body4551A7840119 "Include::containsBase"
    return base!=null;
    // -end- 35FDD9A50046 test_body4551A7840119 "Include::containsBase"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD9A50046 _link_body4551A7840119 "Include::_linkBase"
  public void _linkBase(UseCase base1)
  {
    base = base1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkBase"));
    return;
  }
  // -end- 35FDD9A50046 _link_body4551A7840119 "Include::_linkBase"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD9A50046 _unlink_body4551A7840119 "Include::_unlinkBase"
  public void _unlinkBase(UseCase base1)
  {
    base = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkBase"));
    return;
  }
  // -end- 35FDD9A50046 _unlink_body4551A7840119 "Include::_unlinkBase"

  public NlsString getMetaAttrb(){
	 return super.getMetaAttrb();
  }
  
  public void setMetaAttrb(NlsString value) {
	super.setMettaAttrb(value);
	
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4551A7840119 detail_end "UmlInclude"

  // -end- 4551A7840119 detail_end "UmlInclude"

}

