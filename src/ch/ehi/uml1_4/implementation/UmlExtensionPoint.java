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
// -beg- preserve=no 4551A7D50075 package "UmlExtensionPoint"
package ch.ehi.uml1_4.implementation;
// -end- 4551A7D50075 package "UmlExtensionPoint"

<<<<<<< HEAD
// -beg- preserve=no 4551A7D50075 autoimport "UmlExtensionPoint"
import ch.ehi.uml1_4.behaviour.usecases.ExtensionPoint;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.usecases.UseCase;
import ch.ehi.uml1_4.behaviour.usecases.Extend;
import ch.ehi.uml1_4.foundation.datatypes.LocationReference;
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
// -end- 4551A7D50075 autoimport "UmlExtensionPoint"
=======
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 4551A7D50075 autoimport "UmlExtensionPoint"
import ch.ehi.uml1_4.behaviour.usecases.Extend;
// -beg- preserve=no 4551A7D50075 autoimport "UmlExtensionPoint"
import ch.ehi.uml1_4.behaviour.usecases.ExtensionPoint;
import ch.ehi.uml1_4.behaviour.usecases.UseCase;
import ch.ehi.uml1_4.foundation.datatypes.LocationReference;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4551A7D50075 import "UmlExtensionPoint"

// -end- 4551A7D50075 import "UmlExtensionPoint"

<<<<<<< HEAD
/** @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlExtensionPoint extends AbstractModelElement implements ExtensionPoint
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4551A7D50075 detail_begin "UmlExtensionPoint"

  // -end- 4551A7D50075 detail_begin "UmlExtensionPoint"

  // -beg- preserve=no 4551A8B0030F head4551A7D50075 "unlinkAll"
  public void unlinkAll()
  // -end- 4551A8B0030F head4551A7D50075 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551A8B0030F throws4551A7D50075 "unlinkAll"

    // -end- 4551A8B0030F throws4551A7D50075 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551A8B0030F body4551A7D50075 "unlinkAll"
    
    detachUseCase();
    clearExtend();
    setLocation(null);
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
    // -end- 4551A8B0030F body4551A7D50075 "unlinkAll"
    }

  // -beg- preserve=no 4551A8B302E1 head4551A7D50075 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 4551A8B302E1 head4551A7D50075 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 4551A8B302E1 throws4551A7D50075 "enumerateChildren"

    // -end- 4551A8B302E1 throws4551A7D50075 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 4551A8B302E1 body4551A7D50075 "enumerateChildren"
    java.util.Iterator it=null;
    visitor.visit(getLocation());
    it=iteratorBehavior();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTaggedValue();while(it.hasNext())visitor.visit(it.next());
    it=iteratorTemplateParameter();while(it.hasNext())visitor.visit(it.next());
    visitor.visit(getName());
    visitor.visit(getDocumentation());
    super.enumerateChildren(visitor);
    // -end- 4551A8B302E1 body4551A7D50075 "enumerateChildren"
    }

  // -beg- preserve=no 362661DB015E code4551A7D50075 "useCase"
  private UseCase useCase;
  // -end- 362661DB015E code4551A7D50075 "useCase"

  /** attaches a UseCase.
   *  
   *  @see #detachUseCase
   *  @see #getUseCase
   *  @see #containsUseCase
   */
  // -beg- preserve=no 362661DB015E attach_head4551A7D50075 "ExtensionPoint::attachUseCase"
  public void attachUseCase(UseCase useCase1)
  // -end- 362661DB015E attach_head4551A7D50075 "ExtensionPoint::attachUseCase"
  {
    // -beg- preserve=no 362661DB015E attach_body4551A7D50075 "ExtensionPoint::attachUseCase"
    if(useCase!=null) {throw new java.lang.IllegalStateException("already a useCase attached");}
    if(useCase1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as useCase");}
    useCase = useCase1;
    useCase1._linkExtensionPoint(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachUseCase"));
    return;
    // -end- 362661DB015E attach_body4551A7D50075 "ExtensionPoint::attachUseCase"
  }

  /** disconnect the currently attached UseCase.
   *  @see #attachUseCase
   */
  // -beg- preserve=no 362661DB015E detach_head4551A7D50075 "ExtensionPoint::detachUseCase"
  public UseCase detachUseCase()
  // -end- 362661DB015E detach_head4551A7D50075 "ExtensionPoint::detachUseCase"
  {
    // -beg- preserve=no 362661DB015E detach_body4551A7D50075 "ExtensionPoint::detachUseCase"
    UseCase ret = null;
    if(useCase!=null){
      useCase._unlinkExtensionPoint(this);
      ret = useCase;
      useCase = null;
    }
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachUseCase"));
    return ret;
    // -end- 362661DB015E detach_body4551A7D50075 "ExtensionPoint::detachUseCase"
  }

  /** get the currently attached UseCase.
   *  @see #attachUseCase
   */
  // -beg- preserve=no 362661DB015E get_head4551A7D50075 "ExtensionPoint::getUseCase"
  public UseCase getUseCase()
  // -end- 362661DB015E get_head4551A7D50075 "ExtensionPoint::getUseCase"
  {
    // -beg- preserve=no 362661DB015E get_body4551A7D50075 "ExtensionPoint::getUseCase"
    if(useCase==null) {throw new java.lang.IllegalStateException("no useCase attached");}
    return useCase;
    // -end- 362661DB015E get_body4551A7D50075 "ExtensionPoint::getUseCase"
  }

  /** tests if there is a UseCase attached.
   *  @see #attachUseCase
   */
  // -beg- preserve=no 362661DB015E test_head4551A7D50075 "ExtensionPoint::containsUseCase"
  public boolean containsUseCase()
  // -end- 362661DB015E test_head4551A7D50075 "ExtensionPoint::containsUseCase"
  {
    // -beg- preserve=no 362661DB015E test_body4551A7D50075 "ExtensionPoint::containsUseCase"
    return useCase!=null;
    // -end- 362661DB015E test_body4551A7D50075 "ExtensionPoint::containsUseCase"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362661DB015E _link_body4551A7D50075 "ExtensionPoint::_linkUseCase"
  public void _linkUseCase(UseCase useCase1)
  {
    useCase = useCase1;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkUseCase"));
    return;
  }
  // -end- 362661DB015E _link_body4551A7D50075 "ExtensionPoint::_linkUseCase"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362661DB015E _unlink_body4551A7D50075 "ExtensionPoint::_unlinkUseCase"
  public void _unlinkUseCase(UseCase useCase1)
  {
    useCase = null;
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkUseCase"));
    return;
  }
  // -end- 362661DB015E _unlink_body4551A7D50075 "ExtensionPoint::_unlinkUseCase"

  // -beg- preserve=no 3626B0E203DE code4551A7D50075 "extend"
  private java.util.Set extend = new java.util.HashSet();
  // -end- 3626B0E203DE code4551A7D50075 "extend"

  /** add a Extend.
   *  
   *  @see #removeExtend
   *  @see #containsExtend
   *  @see #iteratorExtend
   *  @see #clearExtend
   *  @see #sizeExtend
   */
  // -beg- preserve=no 3626B0E203DE add_head4551A7D50075 "ExtensionPoint::addExtend"
  public void addExtend(Extend extend1)
  // -end- 3626B0E203DE add_head4551A7D50075 "ExtensionPoint::addExtend"
  {
    // -beg- preserve=no 3626B0E203DE add_body4551A7D50075 "ExtensionPoint::addExtend"
    extend.add(extend1);
    extend1._linkExtensionPoint(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addExtend"));
    return;
    // -end- 3626B0E203DE add_body4551A7D50075 "ExtensionPoint::addExtend"
  }

  /** disconnect a Extend.
   *  @see #addExtend
   */
  // -beg- preserve=no 3626B0E203DE remove_head4551A7D50075 "ExtensionPoint::removeExtend"
  public Extend removeExtend(Extend extend1)
  // -end- 3626B0E203DE remove_head4551A7D50075 "ExtensionPoint::removeExtend"
  {
    // -beg- preserve=no 3626B0E203DE remove_body4551A7D50075 "ExtensionPoint::removeExtend"
    Extend ret=null;
    if(extend1==null || !extend.contains(extend1)){
      throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
    }
    ret = extend1;
    extend.remove(extend1);
    extend1._unlinkExtensionPoint(this);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeExtend"));
    return ret;
    // -end- 3626B0E203DE remove_body4551A7D50075 "ExtensionPoint::removeExtend"
  }

  /** tests if a given Extend is connected.
   *  @see #addExtend
   */
  // -beg- preserve=no 3626B0E203DE test_head4551A7D50075 "ExtensionPoint::containsExtend"
  public boolean containsExtend(Extend extend1)
  // -end- 3626B0E203DE test_head4551A7D50075 "ExtensionPoint::containsExtend"
  {
    // -beg- preserve=no 3626B0E203DE test_body4551A7D50075 "ExtensionPoint::containsExtend"
    return extend.contains(extend1);
    // -end- 3626B0E203DE test_body4551A7D50075 "ExtensionPoint::containsExtend"
  }

  /** used to enumerate all connected Extends.
   *  @see #addExtend
   */
  // -beg- preserve=no 3626B0E203DE get_all_head4551A7D50075 "ExtensionPoint::iteratorExtend"
  public java.util.Iterator iteratorExtend()
  // -end- 3626B0E203DE get_all_head4551A7D50075 "ExtensionPoint::iteratorExtend"
  {
    // -beg- preserve=no 3626B0E203DE get_all_body4551A7D50075 "ExtensionPoint::iteratorExtend"
    return extend.iterator();
    // -end- 3626B0E203DE get_all_body4551A7D50075 "ExtensionPoint::iteratorExtend"
  }

  /** disconnect all Extends.
   *  @see #addExtend
   */
  // -beg- preserve=no 3626B0E203DE remove_all_head4551A7D50075 "ExtensionPoint::clearExtend"
  public void clearExtend()
  // -end- 3626B0E203DE remove_all_head4551A7D50075 "ExtensionPoint::clearExtend"
  {
    // -beg- preserve=no 3626B0E203DE remove_all_body4551A7D50075 "ExtensionPoint::clearExtend"
    if(sizeExtend()>0){
      for(java.util.Iterator p = extend.iterator(); p.hasNext();){
        ((Extend)p.next())._unlinkExtensionPoint(this);
      }
      extend.clear();
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearExtend"));
    }
    // -end- 3626B0E203DE remove_all_body4551A7D50075 "ExtensionPoint::clearExtend"
  }

  /** returns the number of Extends.
   *  @see #addExtend
   */
  // -beg- preserve=no 3626B0E203DE size_head4551A7D50075 "ExtensionPoint::sizeExtend"
  public int sizeExtend()
  // -end- 3626B0E203DE size_head4551A7D50075 "ExtensionPoint::sizeExtend"
  {
    // -beg- preserve=no 3626B0E203DE size_body4551A7D50075 "ExtensionPoint::sizeExtend"
    return extend.size();
    // -end- 3626B0E203DE size_body4551A7D50075 "ExtensionPoint::sizeExtend"
  }

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3626B0E203DE _link_body4551A7D50075 "ExtensionPoint::_linkExtend"
  public void _linkExtend(Extend extend1)
  {
    extend.add(extend1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkExtend"));
    return;
  }
  // -end- 3626B0E203DE _link_body4551A7D50075 "ExtensionPoint::_linkExtend"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3626B0E203DE _unlink_body4551A7D50075 "ExtensionPoint::_unlinkExtend"
  public void _unlinkExtend(Extend extend1)
  {
    extend.remove(extend1);
    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkExtend"));
    return;
  }
  // -end- 3626B0E203DE _unlink_body4551A7D50075 "ExtensionPoint::_unlinkExtend"

  // -beg- preserve=no 3634E53A00DC var4551A7D50075 "location"
  private LocationReference location = null;
  // -end- 3634E53A00DC var4551A7D50075 "location"

  /** get current value of location
   *  @see #setLocation
   */
  // -beg- preserve=no 3634E53A00DC get_head4551A7D50075 "location"
  public  LocationReference getLocation()
  // -end- 3634E53A00DC get_head4551A7D50075 "location"
  {
    // -beg- preserve=no 3634E53A00DC get_body4551A7D50075 "location"
    return location;
    // -end- 3634E53A00DC get_body4551A7D50075 "location"
  }

  /** set current value of location
   *  @see #getLocation
   */
  // -beg- preserve=no 3634E53A00DC set_head4551A7D50075 "location"
  public  void setLocation(LocationReference value1)
  // -end- 3634E53A00DC set_head4551A7D50075 "location"
  {
    // -beg- preserve=no 3634E53A00DC set_body4551A7D50075 "location"
    if(location!=value1 && (location==null || !location.equals(value1))){
      location = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLocation"));
    }
    // -end- 3634E53A00DC set_body4551A7D50075 "location"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 4551A7D50075 detail_end "UmlExtensionPoint"

  // -end- 4551A7D50075 detail_end "UmlExtensionPoint"

}

=======
/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlExtensionPoint extends AbstractModelElement implements ExtensionPoint {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551A7D50075 detail_begin "UmlExtensionPoint"

	// -end- 4551A7D50075 detail_begin "UmlExtensionPoint"

	private static final long serialVersionUID = -3049497002357298368L;

	// -beg- preserve=no 4551A8B0030F head4551A7D50075 "unlinkAll"
	public void unlinkAll()
	// -end- 4551A8B0030F head4551A7D50075 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551A8B0030F throws4551A7D50075 "unlinkAll"

	// -end- 4551A8B0030F throws4551A7D50075 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551A8B0030F body4551A7D50075 "unlinkAll"

		detachUseCase();
		clearExtend();
		setLocation(null);
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
		// -end- 4551A8B0030F body4551A7D50075 "unlinkAll"
	}

	// -beg- preserve=no 4551A8B302E1 head4551A7D50075 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 4551A8B302E1 head4551A7D50075 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551A8B302E1 throws4551A7D50075 "enumerateChildren"

	// -end- 4551A8B302E1 throws4551A7D50075 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551A8B302E1 body4551A7D50075 "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getLocation());
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
		// -end- 4551A8B302E1 body4551A7D50075 "enumerateChildren"
	}

	// -beg- preserve=no 362661DB015E code4551A7D50075 "useCase"
	private UseCase useCase;
	// -end- 362661DB015E code4551A7D50075 "useCase"

	/**
	 * attaches a UseCase.
	 *
	 * @see #detachUseCase
	 * @see #getUseCase
	 * @see #containsUseCase
	 */
	// -beg- preserve=no 362661DB015E attach_head4551A7D50075
	// "ExtensionPoint::attachUseCase"
	public void attachUseCase(UseCase useCase1)
	// -end- 362661DB015E attach_head4551A7D50075
	// "ExtensionPoint::attachUseCase"
	{
		// -beg- preserve=no 362661DB015E attach_body4551A7D50075
		// "ExtensionPoint::attachUseCase"
		if (useCase != null) {
			throw new java.lang.IllegalStateException("already a useCase attached");
		}
		if (useCase1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as useCase");
		}
		useCase = useCase1;
		useCase1._linkExtensionPoint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachUseCase"));
		return;
		// -end- 362661DB015E attach_body4551A7D50075
		// "ExtensionPoint::attachUseCase"
	}

	/**
	 * disconnect the currently attached UseCase.
	 * 
	 * @see #attachUseCase
	 */
	// -beg- preserve=no 362661DB015E detach_head4551A7D50075
	// "ExtensionPoint::detachUseCase"
	public UseCase detachUseCase()
	// -end- 362661DB015E detach_head4551A7D50075
	// "ExtensionPoint::detachUseCase"
	{
		// -beg- preserve=no 362661DB015E detach_body4551A7D50075
		// "ExtensionPoint::detachUseCase"
		UseCase ret = null;
		if (useCase != null) {
			useCase._unlinkExtensionPoint(this);
			ret = useCase;
			useCase = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachUseCase"));
		return ret;
		// -end- 362661DB015E detach_body4551A7D50075
		// "ExtensionPoint::detachUseCase"
	}

	/**
	 * get the currently attached UseCase.
	 * 
	 * @see #attachUseCase
	 */
	// -beg- preserve=no 362661DB015E get_head4551A7D50075
	// "ExtensionPoint::getUseCase"
	public UseCase getUseCase()
	// -end- 362661DB015E get_head4551A7D50075 "ExtensionPoint::getUseCase"
	{
		// -beg- preserve=no 362661DB015E get_body4551A7D50075
		// "ExtensionPoint::getUseCase"
		if (useCase == null) {
			throw new java.lang.IllegalStateException("no useCase attached");
		}
		return useCase;
		// -end- 362661DB015E get_body4551A7D50075 "ExtensionPoint::getUseCase"
	}

	/**
	 * tests if there is a UseCase attached.
	 * 
	 * @see #attachUseCase
	 */
	// -beg- preserve=no 362661DB015E test_head4551A7D50075
	// "ExtensionPoint::containsUseCase"
	public boolean containsUseCase()
	// -end- 362661DB015E test_head4551A7D50075
	// "ExtensionPoint::containsUseCase"
	{
		// -beg- preserve=no 362661DB015E test_body4551A7D50075
		// "ExtensionPoint::containsUseCase"
		return useCase != null;
		// -end- 362661DB015E test_body4551A7D50075
		// "ExtensionPoint::containsUseCase"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362661DB015E _link_body4551A7D50075
	// "ExtensionPoint::_linkUseCase"
	public void _linkUseCase(UseCase useCase1) {
		useCase = useCase1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkUseCase"));
		return;
	}
	// -end- 362661DB015E _link_body4551A7D50075 "ExtensionPoint::_linkUseCase"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362661DB015E _unlink_body4551A7D50075
	// "ExtensionPoint::_unlinkUseCase"
	public void _unlinkUseCase(UseCase useCase1) {
		useCase = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkUseCase"));
		return;
	}
	// -end- 362661DB015E _unlink_body4551A7D50075
	// "ExtensionPoint::_unlinkUseCase"

	// -beg- preserve=no 3626B0E203DE code4551A7D50075 "extend"
	private Set<Extend> extend = new HashSet<Extend>();
	// -end- 3626B0E203DE code4551A7D50075 "extend"

	/**
	 * add a Extend.
	 *
	 * @see #removeExtend
	 * @see #containsExtend
	 * @see #iteratorExtend
	 * @see #clearExtend
	 * @see #sizeExtend
	 */
	// -beg- preserve=no 3626B0E203DE add_head4551A7D50075
	// "ExtensionPoint::addExtend"
	public void addExtend(Extend extend1)
	// -end- 3626B0E203DE add_head4551A7D50075 "ExtensionPoint::addExtend"
	{
		// -beg- preserve=no 3626B0E203DE add_body4551A7D50075
		// "ExtensionPoint::addExtend"
		extend.add(extend1);
		extend1._linkExtensionPoint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addExtend"));
		return;
		// -end- 3626B0E203DE add_body4551A7D50075 "ExtensionPoint::addExtend"
	}

	/**
	 * disconnect a Extend.
	 * 
	 * @see #addExtend
	 */
	// -beg- preserve=no 3626B0E203DE remove_head4551A7D50075
	// "ExtensionPoint::removeExtend"
	public Extend removeExtend(Extend extend1)
	// -end- 3626B0E203DE remove_head4551A7D50075 "ExtensionPoint::removeExtend"
	{
		// -beg- preserve=no 3626B0E203DE remove_body4551A7D50075
		// "ExtensionPoint::removeExtend"
		Extend ret = null;
		if (extend1 == null || !extend.contains(extend1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = extend1;
		extend.remove(extend1);
		extend1._unlinkExtensionPoint(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeExtend"));
		return ret;
		// -end- 3626B0E203DE remove_body4551A7D50075
		// "ExtensionPoint::removeExtend"
	}

	/**
	 * tests if a given Extend is connected.
	 * 
	 * @see #addExtend
	 */
	// -beg- preserve=no 3626B0E203DE test_head4551A7D50075
	// "ExtensionPoint::containsExtend"
	public boolean containsExtend(Extend extend1)
	// -end- 3626B0E203DE test_head4551A7D50075 "ExtensionPoint::containsExtend"
	{
		// -beg- preserve=no 3626B0E203DE test_body4551A7D50075
		// "ExtensionPoint::containsExtend"
		return extend.contains(extend1);
		// -end- 3626B0E203DE test_body4551A7D50075
		// "ExtensionPoint::containsExtend"
	}

	/**
	 * used to enumerate all connected Extends.
	 * 
	 * @see #addExtend
	 */
	// -beg- preserve=no 3626B0E203DE get_all_head4551A7D50075
	// "ExtensionPoint::iteratorExtend"
	public Iterator<?> iteratorExtend()
	// -end- 3626B0E203DE get_all_head4551A7D50075
	// "ExtensionPoint::iteratorExtend"
	{
		// -beg- preserve=no 3626B0E203DE get_all_body4551A7D50075
		// "ExtensionPoint::iteratorExtend"
		return extend.iterator();
		// -end- 3626B0E203DE get_all_body4551A7D50075
		// "ExtensionPoint::iteratorExtend"
	}

	/**
	 * disconnect all Extends.
	 * 
	 * @see #addExtend
	 */
	// -beg- preserve=no 3626B0E203DE remove_all_head4551A7D50075
	// "ExtensionPoint::clearExtend"
	public void clearExtend()
	// -end- 3626B0E203DE remove_all_head4551A7D50075
	// "ExtensionPoint::clearExtend"
	{
		// -beg- preserve=no 3626B0E203DE remove_all_body4551A7D50075
		// "ExtensionPoint::clearExtend"
		if (sizeExtend() > 0) {
			for (Iterator<?> p = extend.iterator(); p.hasNext();) {
				((Extend) p.next())._unlinkExtensionPoint(this);
			}
			extend.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearExtend"));
		}
		// -end- 3626B0E203DE remove_all_body4551A7D50075
		// "ExtensionPoint::clearExtend"
	}

	/**
	 * returns the number of Extends.
	 * 
	 * @see #addExtend
	 */
	// -beg- preserve=no 3626B0E203DE size_head4551A7D50075
	// "ExtensionPoint::sizeExtend"
	public int sizeExtend()
	// -end- 3626B0E203DE size_head4551A7D50075 "ExtensionPoint::sizeExtend"
	{
		// -beg- preserve=no 3626B0E203DE size_body4551A7D50075
		// "ExtensionPoint::sizeExtend"
		return extend.size();
		// -end- 3626B0E203DE size_body4551A7D50075 "ExtensionPoint::sizeExtend"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3626B0E203DE _link_body4551A7D50075
	// "ExtensionPoint::_linkExtend"
	public void _linkExtend(Extend extend1) {
		extend.add(extend1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkExtend"));
		return;
	}
	// -end- 3626B0E203DE _link_body4551A7D50075 "ExtensionPoint::_linkExtend"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3626B0E203DE _unlink_body4551A7D50075
	// "ExtensionPoint::_unlinkExtend"
	public void _unlinkExtend(Extend extend1) {
		extend.remove(extend1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkExtend"));
		return;
	}
	// -end- 3626B0E203DE _unlink_body4551A7D50075
	// "ExtensionPoint::_unlinkExtend"

	// -beg- preserve=no 3634E53A00DC var4551A7D50075 "location"
	private LocationReference location = null;
	// -end- 3634E53A00DC var4551A7D50075 "location"

	/**
	 * get current value of location
	 * 
	 * @see #setLocation
	 */
	// -beg- preserve=no 3634E53A00DC get_head4551A7D50075 "location"
	public LocationReference getLocation()
	// -end- 3634E53A00DC get_head4551A7D50075 "location"
	{
		// -beg- preserve=no 3634E53A00DC get_body4551A7D50075 "location"
		return location;
		// -end- 3634E53A00DC get_body4551A7D50075 "location"
	}

	/**
	 * set current value of location
	 * 
	 * @see #getLocation
	 */
	// -beg- preserve=no 3634E53A00DC set_head4551A7D50075 "location"
	public void setLocation(LocationReference value1)
	// -end- 3634E53A00DC set_head4551A7D50075 "location"
	{
		// -beg- preserve=no 3634E53A00DC set_body4551A7D50075 "location"
		if (location != value1 && (location == null || !location.equals(value1))) {
			location = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLocation"));
		}
		// -end- 3634E53A00DC set_body4551A7D50075 "location"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMetaAttrb(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551A7D50075 detail_end "UmlExtensionPoint"

	// -end- 4551A7D50075 detail_end "UmlExtensionPoint"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
