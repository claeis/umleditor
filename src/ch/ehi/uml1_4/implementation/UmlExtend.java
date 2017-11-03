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

=======
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -beg- preserve=no 4551A78D0108 package "UmlExtend"
package ch.ehi.uml1_4.implementation;
// -end- 4551A78D0108 package "UmlExtend"

<<<<<<< HEAD
// -beg- preserve=no 4551A78D0108 autoimport "UmlExtend"
import ch.ehi.uml1_4.behaviour.usecases.Extend;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.usecases.UseCase;
import ch.ehi.uml1_4.behaviour.usecases.ExtensionPoint;
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
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
// -end- 4551A78D0108 autoimport "UmlExtend"
=======
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 4551A78D0108 autoimport "UmlExtend"
// -beg- preserve=no 4551A78D0108 autoimport "UmlExtend"
import ch.ehi.uml1_4.behaviour.usecases.Extend;
import ch.ehi.uml1_4.behaviour.usecases.ExtensionPoint;
import ch.ehi.uml1_4.behaviour.usecases.UseCase;
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4551A78D0108 import "UmlExtend"

// -end- 4551A78D0108 import "UmlExtend"

<<<<<<< HEAD
/** @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlExtend extends AbstractModelElement implements Extend
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4551A78D0108 detail_begin "UmlExtend"

  // -end- 4551A78D0108 detail_begin "UmlExtend"

  // -beg- preserve=no 4551A89A0367 head4551A78D0108 "unlinkAll"
  public void unlinkAll()
  // -end- 4551A89A0367 head4551A78D0108 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551A89A0367 throws4551A78D0108 "unlinkAll"

    // -end- 4551A89A0367 throws4551A78D0108 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551A89A0367 body4551A78D0108 "unlinkAll"
    
    detachBase();
    detachExtension();
    clearExtensionPoint();
    setCondition(null);
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
    setDocumentation(null);
    super.unlinkAll();
    // -end- 4551A89A0367 body4551A78D0108 "unlinkAll"
    }

  // -beg- preserve=no 4551A89D027B head4551A78D0108 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 4551A89D027B head4551A78D0108 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551A89D027B throws4551A78D0108 "enumerateChildren"

    // -end- 4551A89D027B throws4551A78D0108 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551A89D027B body4551A78D0108 "enumerateChildren"
    java.util.Iterator it=null;
    visitor.visit(getCondition());
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    visitor.visit(getDocumentation());
    super.enumerateChildren(visitor);
    // -end- 4551A89D027B body4551A78D0108 "enumerateChildren"
    }

  // -beg- preserve=no 35FDD865000B code4551A78D0108 "base"
  private UseCase base;
  // -end- 35FDD865000B code4551A78D0108 "base"

  /** attaches a Base.
   *  
   *  @see #detachBase
   *  @see #getBase
   *  @see #containsBase
   */
  // -beg- preserve=no 35FDD865000B attach_head4551A78D0108 "Extend::attachBase"
  public void attachBase(UseCase base1)
  // -end- 35FDD865000B attach_head4551A78D0108 "Extend::attachBase"
  {
    // -beg- preserve=no 35FDD865000B attach_body4551A78D0108 "Extend::attachBase"
    if(base!=null) {throw new java.lang.IllegalStateException("already a base attached");}
    if(base1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as base");}
    base = base1;
    base1._linkBaseExtend(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachBase"));
    return;
    // -end- 35FDD865000B attach_body4551A78D0108 "Extend::attachBase"
  }

  /** disconnect the currently attached Base.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD865000B detach_head4551A78D0108 "Extend::detachBase"
  public UseCase detachBase()
  // -end- 35FDD865000B detach_head4551A78D0108 "Extend::detachBase"
  {
    // -beg- preserve=no 35FDD865000B detach_body4551A78D0108 "Extend::detachBase"
    UseCase ret = null;
    if(base!=null){
      base._unlinkBaseExtend(this);
      ret = base;
      base = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachBase"));
    return ret;
    // -end- 35FDD865000B detach_body4551A78D0108 "Extend::detachBase"
  }

  /** get the currently attached Base.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD865000B get_head4551A78D0108 "Extend::getBase"
  public UseCase getBase()
  // -end- 35FDD865000B get_head4551A78D0108 "Extend::getBase"
  {
    // -beg- preserve=no 35FDD865000B get_body4551A78D0108 "Extend::getBase"
    if(base==null) {throw new java.lang.IllegalStateException("no base attached");}
    return base;
    // -end- 35FDD865000B get_body4551A78D0108 "Extend::getBase"
  }

  /** tests if there is a Base attached.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD865000B test_head4551A78D0108 "Extend::containsBase"
  public boolean containsBase()
  // -end- 35FDD865000B test_head4551A78D0108 "Extend::containsBase"
  {
    // -beg- preserve=no 35FDD865000B test_body4551A78D0108 "Extend::containsBase"
    return base!=null;
    // -end- 35FDD865000B test_body4551A78D0108 "Extend::containsBase"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD865000B _link_body4551A78D0108 "Extend::_linkBase"
  public void _linkBase(UseCase base1)
  {
    base = base1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkBase"));
    return;
  }
  // -end- 35FDD865000B _link_body4551A78D0108 "Extend::_linkBase"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD865000B _unlink_body4551A78D0108 "Extend::_unlinkBase"
  public void _unlinkBase(UseCase base1)
  {
    base = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkBase"));
    return;
  }
  // -end- 35FDD865000B _unlink_body4551A78D0108 "Extend::_unlinkBase"

  // -beg- preserve=no 35FDD86C0141 code4551A78D0108 "extension"
  private UseCase extension;
  // -end- 35FDD86C0141 code4551A78D0108 "extension"

  /** attaches a Extension.
   *  
   *  @see #detachExtension
   *  @see #getExtension
   *  @see #containsExtension
   */
  // -beg- preserve=no 35FDD86C0141 attach_head4551A78D0108 "Extend::attachExtension"
  public void attachExtension(UseCase extension1)
  // -end- 35FDD86C0141 attach_head4551A78D0108 "Extend::attachExtension"
  {
    // -beg- preserve=no 35FDD86C0141 attach_body4551A78D0108 "Extend::attachExtension"
    if(extension!=null) {throw new java.lang.IllegalStateException("already a extension attached");}
    if(extension1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as extension");}
    extension = extension1;
    extension1._linkExtensionExtend(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachExtension"));
    return;
    // -end- 35FDD86C0141 attach_body4551A78D0108 "Extend::attachExtension"
  }

  /** disconnect the currently attached Extension.
   *  @see #attachExtension
   */
  // -beg- preserve=no 35FDD86C0141 detach_head4551A78D0108 "Extend::detachExtension"
  public UseCase detachExtension()
  // -end- 35FDD86C0141 detach_head4551A78D0108 "Extend::detachExtension"
  {
    // -beg- preserve=no 35FDD86C0141 detach_body4551A78D0108 "Extend::detachExtension"
    UseCase ret = null;
    if(extension!=null){
      extension._unlinkExtensionExtend(this);
      ret = extension;
      extension = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachExtension"));
    return ret;
    // -end- 35FDD86C0141 detach_body4551A78D0108 "Extend::detachExtension"
  }

  /** get the currently attached Extension.
   *  @see #attachExtension
   */
  // -beg- preserve=no 35FDD86C0141 get_head4551A78D0108 "Extend::getExtension"
  public UseCase getExtension()
  // -end- 35FDD86C0141 get_head4551A78D0108 "Extend::getExtension"
  {
    // -beg- preserve=no 35FDD86C0141 get_body4551A78D0108 "Extend::getExtension"
    if(extension==null) {throw new java.lang.IllegalStateException("no extension attached");}
    return extension;
    // -end- 35FDD86C0141 get_body4551A78D0108 "Extend::getExtension"
  }

  /** tests if there is a Extension attached.
   *  @see #attachExtension
   */
  // -beg- preserve=no 35FDD86C0141 test_head4551A78D0108 "Extend::containsExtension"
  public boolean containsExtension()
  // -end- 35FDD86C0141 test_head4551A78D0108 "Extend::containsExtension"
  {
    // -beg- preserve=no 35FDD86C0141 test_body4551A78D0108 "Extend::containsExtension"
    return extension!=null;
    // -end- 35FDD86C0141 test_body4551A78D0108 "Extend::containsExtension"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD86C0141 _link_body4551A78D0108 "Extend::_linkExtension"
  public void _linkExtension(UseCase extension1)
  {
    extension = extension1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkExtension"));
    return;
  }
  // -end- 35FDD86C0141 _link_body4551A78D0108 "Extend::_linkExtension"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD86C0141 _unlink_body4551A78D0108 "Extend::_unlinkExtension"
  public void _unlinkExtension(UseCase extension1)
  {
    extension = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkExtension"));
    return;
  }
  // -end- 35FDD86C0141 _unlink_body4551A78D0108 "Extend::_unlinkExtension"

  // -beg- preserve=no 3626B0E203DF code4551A78D0108 "extensionPoint"
  private java.util.List extensionPoint = new java.util.ArrayList();
  // -end- 3626B0E203DF code4551A78D0108 "extensionPoint"

  /** add a ExtensionPoint.
   *  
   *  @see #removeExtensionPoint
   *  @see #containsExtensionPoint
   *  @see #iteratorExtensionPoint
   *  @see #clearExtensionPoint
   *  @see #sizeExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF add_head4551A78D0108 "Extend::addExtensionPoint"
  public void addExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF add_head4551A78D0108 "Extend::addExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF add_body4551A78D0108 "Extend::addExtensionPoint"
    extensionPoint.add(extensionPoint1);
    extensionPoint1._linkExtend(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addExtensionPoint"));
    return;
    // -end- 3626B0E203DF add_body4551A78D0108 "Extend::addExtensionPoint"
  }

  // -beg- preserve=no 3626B0E203DF add2_head4551A78D0108 "Extend::add2ExtensionPoint"
  public void addExtensionPoint(int index,ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF add2_head4551A78D0108 "Extend::add2ExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF add2_body4551A78D0108 "Extend::add2ExtensionPoint"
    extensionPoint.add(index,extensionPoint1);
    extensionPoint1._linkExtend(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addExtensionPoint"));
    return;
    // -end- 3626B0E203DF add2_body4551A78D0108 "Extend::add2ExtensionPoint"
  }

  /** disconnect a ExtensionPoint.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF remove_head4551A78D0108 "Extend::removeExtensionPoint"
  public ExtensionPoint removeExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF remove_head4551A78D0108 "Extend::removeExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF remove_body4551A78D0108 "Extend::removeExtensionPoint"
    ExtensionPoint ret=null;
    if(extensionPoint1==null || !extensionPoint.contains(extensionPoint1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = extensionPoint1;
    extensionPoint.remove(extensionPoint1);
    extensionPoint1._unlinkExtend(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeExtensionPoint"));
    return ret;
    // -end- 3626B0E203DF remove_body4551A78D0108 "Extend::removeExtensionPoint"
  }

  /** disconnect a ExtensionPoint.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF remove2_head4551A78D0108 "Extend::remove2ExtensionPoint"
  public ExtensionPoint removeExtensionPoint(int index)
  // -end- 3626B0E203DF remove2_head4551A78D0108 "Extend::remove2ExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF remove2_body4551A78D0108 "Extend::remove2ExtensionPoint"
    ExtensionPoint ret=null;
    ret = (ExtensionPoint)extensionPoint.remove(index);
    ret._unlinkExtend(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeExtensionPoint"));
    return ret;
    // -end- 3626B0E203DF remove2_body4551A78D0108 "Extend::remove2ExtensionPoint"
  }

  /** change a ExtensionPoint.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF set_head4551A78D0108 "Extend::setExtensionPoint"
  public ExtensionPoint setExtensionPoint(int index,ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF set_head4551A78D0108 "Extend::setExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF set_body4551A78D0108 "Extend::setExtensionPoint"
    ExtensionPoint ret=null;
    ret = (ExtensionPoint)extensionPoint.set(index,extensionPoint1);
    ret._unlinkExtend(this);
    extensionPoint1._linkExtend(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setExtensionPoint"));
    return ret;
    // -end- 3626B0E203DF set_body4551A78D0108 "Extend::setExtensionPoint"
  }

  /** tests if a given ExtensionPoint is connected.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF test_head4551A78D0108 "Extend::containsExtensionPoint"
  public boolean containsExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF test_head4551A78D0108 "Extend::containsExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF test_body4551A78D0108 "Extend::containsExtensionPoint"
    return extensionPoint.contains(extensionPoint1);
    // -end- 3626B0E203DF test_body4551A78D0108 "Extend::containsExtensionPoint"
  }

  /** used to enumerate all connected ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF get_all_head4551A78D0108 "Extend::iteratorExtensionPoint"
  public java.util.Iterator iteratorExtensionPoint()
  // -end- 3626B0E203DF get_all_head4551A78D0108 "Extend::iteratorExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF get_all_body4551A78D0108 "Extend::iteratorExtensionPoint"
    return extensionPoint.iterator();
    // -end- 3626B0E203DF get_all_body4551A78D0108 "Extend::iteratorExtensionPoint"
  }

  /** disconnect all ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF remove_all_head4551A78D0108 "Extend::clearExtensionPoint"
  public void clearExtensionPoint()
  // -end- 3626B0E203DF remove_all_head4551A78D0108 "Extend::clearExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF remove_all_body4551A78D0108 "Extend::clearExtensionPoint"
    if(sizeExtensionPoint()>0){
      for(java.util.Iterator p = extensionPoint.iterator(); p.hasNext();){
        ((ExtensionPoint)p.next())._unlinkExtend(this);
      }
      extensionPoint.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearExtensionPoint"));
    }
    // -end- 3626B0E203DF remove_all_body4551A78D0108 "Extend::clearExtensionPoint"
  }

  /** returns the number of ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF size_head4551A78D0108 "Extend::sizeExtensionPoint"
  public int sizeExtensionPoint()
  // -end- 3626B0E203DF size_head4551A78D0108 "Extend::sizeExtensionPoint"
  {
    // -beg- preserve=no 3626B0E203DF size_body4551A78D0108 "Extend::sizeExtensionPoint"
    return extensionPoint.size();
    // -end- 3626B0E203DF size_body4551A78D0108 "Extend::sizeExtensionPoint"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3626B0E203DF _link_body4551A78D0108 "Extend::_linkExtensionPoint"
  public void _linkExtensionPoint(ExtensionPoint extensionPoint1)
  {
    extensionPoint.add(extensionPoint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkExtensionPoint"));
    return;
  }
  // -end- 3626B0E203DF _link_body4551A78D0108 "Extend::_linkExtensionPoint"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3626B0E203DF _unlink_body4551A78D0108 "Extend::_unlinkExtensionPoint"
  public void _unlinkExtensionPoint(ExtensionPoint extensionPoint1)
  {
    extensionPoint.remove(extensionPoint1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkExtensionPoint"));
    return;
  }
  // -end- 3626B0E203DF _unlink_body4551A78D0108 "Extend::_unlinkExtensionPoint"

  // -beg- preserve=no 35FDD71C026C var4551A78D0108 "condition"
  private BooleanExpression condition = null;
  // -end- 35FDD71C026C var4551A78D0108 "condition"

  /** get current value of condition
   *  @see #setCondition
   */
  // -beg- preserve=no 35FDD71C026C get_head4551A78D0108 "condition"
  public  BooleanExpression getCondition()
  // -end- 35FDD71C026C get_head4551A78D0108 "condition"
  {
    // -beg- preserve=no 35FDD71C026C get_body4551A78D0108 "condition"
    return condition;
    // -end- 35FDD71C026C get_body4551A78D0108 "condition"
  }

  /** set current value of condition
   *  @see #getCondition
   */
  // -beg- preserve=no 35FDD71C026C set_head4551A78D0108 "condition"
  public  void setCondition(BooleanExpression value1)
  // -end- 35FDD71C026C set_head4551A78D0108 "condition"
  {
    // -beg- preserve=no 35FDD71C026C set_body4551A78D0108 "condition"
    if(condition!=value1 && (condition==null || !condition.equals(value1))){
      condition = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setCondition"));
    }
    // -end- 35FDD71C026C set_body4551A78D0108 "condition"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4551A78D0108 detail_end "UmlExtend"

  // -end- 4551A78D0108 detail_end "UmlExtend"

}

=======
/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlExtend extends AbstractModelElement implements Extend {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551A78D0108 detail_begin "UmlExtend"

	// -end- 4551A78D0108 detail_begin "UmlExtend"

	private static final long serialVersionUID = 7750219903278800224L;

	// -beg- preserve=no 4551A89A0367 head4551A78D0108 "unlinkAll"
	public void unlinkAll()
	// -end- 4551A89A0367 head4551A78D0108 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551A89A0367 throws4551A78D0108 "unlinkAll"

	// -end- 4551A89A0367 throws4551A78D0108 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551A89A0367 body4551A78D0108 "unlinkAll"

		detachBase();
		detachExtension();
		clearExtensionPoint();
		setCondition(null);
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
		setName(null);
		setMetaAttrb(null);
		setDocumentation(null);
		super.unlinkAll();
		// -end- 4551A89A0367 body4551A78D0108 "unlinkAll"
	}

	// -beg- preserve=no 4551A89D027B head4551A78D0108 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 4551A89D027B head4551A78D0108 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551A89D027B throws4551A78D0108 "enumerateChildren"

	// -end- 4551A89D027B throws4551A78D0108 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551A89D027B body4551A78D0108 "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getCondition());
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
		// -end- 4551A89D027B body4551A78D0108 "enumerateChildren"
	}

	// -beg- preserve=no 35FDD865000B code4551A78D0108 "base"
	private UseCase base;
	// -end- 35FDD865000B code4551A78D0108 "base"

	/**
	 * attaches a Base.
	 *
	 * @see #detachBase
	 * @see #getBase
	 * @see #containsBase
	 */
	// -beg- preserve=no 35FDD865000B attach_head4551A78D0108
	// "Extend::attachBase"
	public void attachBase(UseCase base1)
	// -end- 35FDD865000B attach_head4551A78D0108 "Extend::attachBase"
	{
		// -beg- preserve=no 35FDD865000B attach_body4551A78D0108
		// "Extend::attachBase"
		if (base != null) {
			throw new java.lang.IllegalStateException("already a base attached");
		}
		if (base1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as base");
		}
		base = base1;
		base1._linkBaseExtend(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachBase"));
		return;
		// -end- 35FDD865000B attach_body4551A78D0108 "Extend::attachBase"
	}

	/**
	 * disconnect the currently attached Base.
	 * 
	 * @see #attachBase
	 */
	// -beg- preserve=no 35FDD865000B detach_head4551A78D0108
	// "Extend::detachBase"
	public UseCase detachBase()
	// -end- 35FDD865000B detach_head4551A78D0108 "Extend::detachBase"
	{
		// -beg- preserve=no 35FDD865000B detach_body4551A78D0108
		// "Extend::detachBase"
		UseCase ret = null;
		if (base != null) {
			base._unlinkBaseExtend(this);
			ret = base;
			base = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachBase"));
		return ret;
		// -end- 35FDD865000B detach_body4551A78D0108 "Extend::detachBase"
	}

	/**
	 * get the currently attached Base.
	 * 
	 * @see #attachBase
	 */
	// -beg- preserve=no 35FDD865000B get_head4551A78D0108 "Extend::getBase"
	public UseCase getBase()
	// -end- 35FDD865000B get_head4551A78D0108 "Extend::getBase"
	{
		// -beg- preserve=no 35FDD865000B get_body4551A78D0108 "Extend::getBase"
		if (base == null) {
			throw new java.lang.IllegalStateException("no base attached");
		}
		return base;
		// -end- 35FDD865000B get_body4551A78D0108 "Extend::getBase"
	}

	/**
	 * tests if there is a Base attached.
	 * 
	 * @see #attachBase
	 */
	// -beg- preserve=no 35FDD865000B test_head4551A78D0108
	// "Extend::containsBase"
	public boolean containsBase()
	// -end- 35FDD865000B test_head4551A78D0108 "Extend::containsBase"
	{
		// -beg- preserve=no 35FDD865000B test_body4551A78D0108
		// "Extend::containsBase"
		return base != null;
		// -end- 35FDD865000B test_body4551A78D0108 "Extend::containsBase"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD865000B _link_body4551A78D0108 "Extend::_linkBase"
	public void _linkBase(UseCase base1) {
		base = base1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkBase"));
		return;
	}
	// -end- 35FDD865000B _link_body4551A78D0108 "Extend::_linkBase"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD865000B _unlink_body4551A78D0108
	// "Extend::_unlinkBase"
	public void _unlinkBase(UseCase base1) {
		base = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkBase"));
		return;
	}
	// -end- 35FDD865000B _unlink_body4551A78D0108 "Extend::_unlinkBase"

	// -beg- preserve=no 35FDD86C0141 code4551A78D0108 "extension"
	private UseCase extension;
	// -end- 35FDD86C0141 code4551A78D0108 "extension"

	/**
	 * attaches a Extension.
	 *
	 * @see #detachExtension
	 * @see #getExtension
	 * @see #containsExtension
	 */
	// -beg- preserve=no 35FDD86C0141 attach_head4551A78D0108
	// "Extend::attachExtension"
	public void attachExtension(UseCase extension1)
	// -end- 35FDD86C0141 attach_head4551A78D0108 "Extend::attachExtension"
	{
		// -beg- preserve=no 35FDD86C0141 attach_body4551A78D0108
		// "Extend::attachExtension"
		if (extension != null) {
			throw new java.lang.IllegalStateException("already a extension attached");
		}
		if (extension1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as extension");
		}
		extension = extension1;
		extension1._linkExtensionExtend(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachExtension"));
		return;
		// -end- 35FDD86C0141 attach_body4551A78D0108 "Extend::attachExtension"
	}

	/**
	 * disconnect the currently attached Extension.
	 * 
	 * @see #attachExtension
	 */
	// -beg- preserve=no 35FDD86C0141 detach_head4551A78D0108
	// "Extend::detachExtension"
	public UseCase detachExtension()
	// -end- 35FDD86C0141 detach_head4551A78D0108 "Extend::detachExtension"
	{
		// -beg- preserve=no 35FDD86C0141 detach_body4551A78D0108
		// "Extend::detachExtension"
		UseCase ret = null;
		if (extension != null) {
			extension._unlinkExtensionExtend(this);
			ret = extension;
			extension = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachExtension"));
		return ret;
		// -end- 35FDD86C0141 detach_body4551A78D0108 "Extend::detachExtension"
	}

	/**
	 * get the currently attached Extension.
	 * 
	 * @see #attachExtension
	 */
	// -beg- preserve=no 35FDD86C0141 get_head4551A78D0108
	// "Extend::getExtension"
	public UseCase getExtension()
	// -end- 35FDD86C0141 get_head4551A78D0108 "Extend::getExtension"
	{
		// -beg- preserve=no 35FDD86C0141 get_body4551A78D0108
		// "Extend::getExtension"
		if (extension == null) {
			throw new java.lang.IllegalStateException("no extension attached");
		}
		return extension;
		// -end- 35FDD86C0141 get_body4551A78D0108 "Extend::getExtension"
	}

	/**
	 * tests if there is a Extension attached.
	 * 
	 * @see #attachExtension
	 */
	// -beg- preserve=no 35FDD86C0141 test_head4551A78D0108
	// "Extend::containsExtension"
	public boolean containsExtension()
	// -end- 35FDD86C0141 test_head4551A78D0108 "Extend::containsExtension"
	{
		// -beg- preserve=no 35FDD86C0141 test_body4551A78D0108
		// "Extend::containsExtension"
		return extension != null;
		// -end- 35FDD86C0141 test_body4551A78D0108 "Extend::containsExtension"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD86C0141 _link_body4551A78D0108
	// "Extend::_linkExtension"
	public void _linkExtension(UseCase extension1) {
		extension = extension1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkExtension"));
		return;
	}
	// -end- 35FDD86C0141 _link_body4551A78D0108 "Extend::_linkExtension"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD86C0141 _unlink_body4551A78D0108
	// "Extend::_unlinkExtension"
	public void _unlinkExtension(UseCase extension1) {
		extension = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkExtension"));
		return;
	}
	// -end- 35FDD86C0141 _unlink_body4551A78D0108 "Extend::_unlinkExtension"

	// -beg- preserve=no 3626B0E203DF code4551A78D0108 "extensionPoint"
	private List<ExtensionPoint> extensionPoint = new ArrayList<ExtensionPoint>();
	// -end- 3626B0E203DF code4551A78D0108 "extensionPoint"

	/**
	 * add a ExtensionPoint.
	 *
	 * @see #removeExtensionPoint
	 * @see #containsExtensionPoint
	 * @see #iteratorExtensionPoint
	 * @see #clearExtensionPoint
	 * @see #sizeExtensionPoint
	 */
	// -beg- preserve=no 3626B0E203DF add_head4551A78D0108
	// "Extend::addExtensionPoint"
	public void addExtensionPoint(ExtensionPoint extensionPoint1)
	// -end- 3626B0E203DF add_head4551A78D0108 "Extend::addExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF add_body4551A78D0108
		// "Extend::addExtensionPoint"
		extensionPoint.add(extensionPoint1);
		extensionPoint1._linkExtend(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addExtensionPoint"));
		return;
		// -end- 3626B0E203DF add_body4551A78D0108 "Extend::addExtensionPoint"
	}

	// -beg- preserve=no 3626B0E203DF add2_head4551A78D0108
	// "Extend::add2ExtensionPoint"
	public void addExtensionPoint(int index, ExtensionPoint extensionPoint1)
	// -end- 3626B0E203DF add2_head4551A78D0108 "Extend::add2ExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF add2_body4551A78D0108
		// "Extend::add2ExtensionPoint"
		extensionPoint.add(index, extensionPoint1);
		extensionPoint1._linkExtend(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addExtensionPoint"));
		return;
		// -end- 3626B0E203DF add2_body4551A78D0108 "Extend::add2ExtensionPoint"
	}

	/**
	 * disconnect a ExtensionPoint.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 3626B0E203DF remove_head4551A78D0108
	// "Extend::removeExtensionPoint"
	public ExtensionPoint removeExtensionPoint(ExtensionPoint extensionPoint1)
	// -end- 3626B0E203DF remove_head4551A78D0108 "Extend::removeExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF remove_body4551A78D0108
		// "Extend::removeExtensionPoint"
		ExtensionPoint ret = null;
		if (extensionPoint1 == null || !extensionPoint.contains(extensionPoint1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = extensionPoint1;
		extensionPoint.remove(extensionPoint1);
		extensionPoint1._unlinkExtend(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeExtensionPoint"));
		return ret;
		// -end- 3626B0E203DF remove_body4551A78D0108
		// "Extend::removeExtensionPoint"
	}

	/**
	 * disconnect a ExtensionPoint.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 3626B0E203DF remove2_head4551A78D0108
	// "Extend::remove2ExtensionPoint"
	public ExtensionPoint removeExtensionPoint(int index)
	// -end- 3626B0E203DF remove2_head4551A78D0108
	// "Extend::remove2ExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF remove2_body4551A78D0108
		// "Extend::remove2ExtensionPoint"
		ExtensionPoint ret = null;
		ret = (ExtensionPoint) extensionPoint.remove(index);
		ret._unlinkExtend(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeExtensionPoint"));
		return ret;
		// -end- 3626B0E203DF remove2_body4551A78D0108
		// "Extend::remove2ExtensionPoint"
	}

	/**
	 * change a ExtensionPoint.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 3626B0E203DF set_head4551A78D0108
	// "Extend::setExtensionPoint"
	public ExtensionPoint setExtensionPoint(int index, ExtensionPoint extensionPoint1)
	// -end- 3626B0E203DF set_head4551A78D0108 "Extend::setExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF set_body4551A78D0108
		// "Extend::setExtensionPoint"
		ExtensionPoint ret = null;
		ret = (ExtensionPoint) extensionPoint.set(index, extensionPoint1);
		ret._unlinkExtend(this);
		extensionPoint1._linkExtend(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setExtensionPoint"));
		return ret;
		// -end- 3626B0E203DF set_body4551A78D0108 "Extend::setExtensionPoint"
	}

	/**
	 * tests if a given ExtensionPoint is connected.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 3626B0E203DF test_head4551A78D0108
	// "Extend::containsExtensionPoint"
	public boolean containsExtensionPoint(ExtensionPoint extensionPoint1)
	// -end- 3626B0E203DF test_head4551A78D0108 "Extend::containsExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF test_body4551A78D0108
		// "Extend::containsExtensionPoint"
		return extensionPoint.contains(extensionPoint1);
		// -end- 3626B0E203DF test_body4551A78D0108
		// "Extend::containsExtensionPoint"
	}

	/**
	 * used to enumerate all connected ExtensionPoints.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 3626B0E203DF get_all_head4551A78D0108
	// "Extend::iteratorExtensionPoint"
	public Iterator<?> iteratorExtensionPoint()
	// -end- 3626B0E203DF get_all_head4551A78D0108
	// "Extend::iteratorExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF get_all_body4551A78D0108
		// "Extend::iteratorExtensionPoint"
		return extensionPoint.iterator();
		// -end- 3626B0E203DF get_all_body4551A78D0108
		// "Extend::iteratorExtensionPoint"
	}

	/**
	 * disconnect all ExtensionPoints.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 3626B0E203DF remove_all_head4551A78D0108
	// "Extend::clearExtensionPoint"
	public void clearExtensionPoint()
	// -end- 3626B0E203DF remove_all_head4551A78D0108
	// "Extend::clearExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF remove_all_body4551A78D0108
		// "Extend::clearExtensionPoint"
		if (sizeExtensionPoint() > 0) {
			for (Iterator<?> p = extensionPoint.iterator(); p.hasNext();) {
				((ExtensionPoint) p.next())._unlinkExtend(this);
			}
			extensionPoint.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearExtensionPoint"));
		}
		// -end- 3626B0E203DF remove_all_body4551A78D0108
		// "Extend::clearExtensionPoint"
	}

	/**
	 * returns the number of ExtensionPoints.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 3626B0E203DF size_head4551A78D0108
	// "Extend::sizeExtensionPoint"
	public int sizeExtensionPoint()
	// -end- 3626B0E203DF size_head4551A78D0108 "Extend::sizeExtensionPoint"
	{
		// -beg- preserve=no 3626B0E203DF size_body4551A78D0108
		// "Extend::sizeExtensionPoint"
		return extensionPoint.size();
		// -end- 3626B0E203DF size_body4551A78D0108 "Extend::sizeExtensionPoint"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3626B0E203DF _link_body4551A78D0108
	// "Extend::_linkExtensionPoint"
	public void _linkExtensionPoint(ExtensionPoint extensionPoint1) {
		extensionPoint.add(extensionPoint1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkExtensionPoint"));
		return;
	}
	// -end- 3626B0E203DF _link_body4551A78D0108 "Extend::_linkExtensionPoint"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3626B0E203DF _unlink_body4551A78D0108
	// "Extend::_unlinkExtensionPoint"
	public void _unlinkExtensionPoint(ExtensionPoint extensionPoint1) {
		extensionPoint.remove(extensionPoint1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkExtensionPoint"));
		return;
	}
	// -end- 3626B0E203DF _unlink_body4551A78D0108
	// "Extend::_unlinkExtensionPoint"

	// -beg- preserve=no 35FDD71C026C var4551A78D0108 "condition"
	private BooleanExpression condition = null;
	// -end- 35FDD71C026C var4551A78D0108 "condition"

	/**
	 * get current value of condition
	 * 
	 * @see #setCondition
	 */
	// -beg- preserve=no 35FDD71C026C get_head4551A78D0108 "condition"
	public BooleanExpression getCondition()
	// -end- 35FDD71C026C get_head4551A78D0108 "condition"
	{
		// -beg- preserve=no 35FDD71C026C get_body4551A78D0108 "condition"
		return condition;
		// -end- 35FDD71C026C get_body4551A78D0108 "condition"
	}

	/**
	 * set current value of condition
	 * 
	 * @see #getCondition
	 */
	// -beg- preserve=no 35FDD71C026C set_head4551A78D0108 "condition"
	public void setCondition(BooleanExpression value1)
	// -end- 35FDD71C026C set_head4551A78D0108 "condition"
	{
		// -beg- preserve=no 35FDD71C026C set_body4551A78D0108 "condition"
		if (condition != value1 && (condition == null || !condition.equals(value1))) {
			condition = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setCondition"));
		}
		// -end- 35FDD71C026C set_body4551A78D0108 "condition"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMetaAttrb(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551A78D0108 detail_end "UmlExtend"

	// -end- 4551A78D0108 detail_end "UmlExtend"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
