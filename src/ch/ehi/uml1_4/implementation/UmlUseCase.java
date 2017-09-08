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

// -beg- preserve=no 4551A5AD02B6 package "UmlUseCase"
package ch.ehi.uml1_4.implementation;
// -end- 4551A5AD02B6 package "UmlUseCase"

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 4551A5AD02B6 autoimport "UmlUseCase"
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.usecases.Extend;
import ch.ehi.uml1_4.behaviour.usecases.ExtensionPoint;
import ch.ehi.uml1_4.behaviour.usecases.Include;
// -beg- preserve=no 4551A5AD02B6 autoimport "UmlUseCase"
import ch.ehi.uml1_4.behaviour.usecases.UseCase;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.ModelElement;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4551A5AD02B6 import "UmlUseCase"

// -end- 4551A5AD02B6 import "UmlUseCase"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:39 $
 */
public class UmlUseCase extends AbstractNamespace implements UseCase {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551A5AD02B6 detail_begin "UmlUseCase"

	// -end- 4551A5AD02B6 detail_begin "UmlUseCase"

	// -beg- preserve=no 4551A8750007 head4551A5AD02B6 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 4551A8750007 head4551A5AD02B6 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551A8750007 throws4551A5AD02B6 "enumerateChildren"

	// -end- 4551A8750007 throws4551A5AD02B6 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551A8750007 body4551A5AD02B6 "enumerateChildren"
		java.util.Iterator it = null;
		it = iteratorFeature();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorOwnedElement();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorDiagram();
		while (it.hasNext())
			visitor.visit(it.next());
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
		// -end- 4551A8750007 body4551A5AD02B6 "enumerateChildren"
	}

	// -beg- preserve=no 4551A87801CE head4551A5AD02B6 "unlinkAll"
	public void unlinkAll()
	// -end- 4551A87801CE head4551A5AD02B6 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551A87801CE throws4551A5AD02B6 "unlinkAll"

	// -end- 4551A87801CE throws4551A5AD02B6 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551A87801CE body4551A5AD02B6 "unlinkAll"

		clearBaseExtend();
		clearExtensionExtend();
		clearBaseInclude();
		clearAdditionInclude();
		clearExtensionPoint();
		clearObjectFlowState();
		clearClassifierInState();
		clearClassifierRole();
		clearCollaboration();
		clearInstance();
		clearCreateAction();
		clearFeature();
		// Role TypedFeature: StructuralFeature object(s) may point to this
		// Role TypedParameter: Parameter object(s) may point to this
		clearAssociation();
		clearSpecifiedEnd();
		clearPowertypeRange();
		clearGeneralization();
		clearSpecialization();
		clearOwnedElement();
		clearDiagram();
		clearBehavior();
		clearPartition();
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
		// -end- 4551A87801CE body4551A5AD02B6 "unlinkAll"
	}

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 4551F6C40332 head4551A5AD02B6 "getValidOwnedElements"
	public String[] getValidOwnedElements()
	// -end- 4551F6C40332 head4551A5AD02B6 "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551F6C40332 throws4551A5AD02B6 "getValidOwnedElements"

	// -end- 4551F6C40332 throws4551A5AD02B6 "getValidOwnedElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551F6C40332 body4551A5AD02B6
		// "getValidOwnedElements"
		return null;
		// -end- 4551F6C40332 body4551A5AD02B6 "getValidOwnedElements"
	}

	// -beg- preserve=no 35FDD865000A code4551A5AD02B6 "baseExtend"
	private java.util.Set baseExtend = new java.util.HashSet();
	// -end- 35FDD865000A code4551A5AD02B6 "baseExtend"

	/**
	 * add a BaseExtend.
	 *
	 * @see #removeBaseExtend
	 * @see #containsBaseExtend
	 * @see #iteratorBaseExtend
	 * @see #clearBaseExtend
	 * @see #sizeBaseExtend
	 */
	// -beg- preserve=no 35FDD865000A add_head4551A5AD02B6
	// "UseCase::addBaseExtend"
	public void addBaseExtend(Extend baseExtend1)
	// -end- 35FDD865000A add_head4551A5AD02B6 "UseCase::addBaseExtend"
	{
		// -beg- preserve=no 35FDD865000A add_body4551A5AD02B6
		// "UseCase::addBaseExtend"
		baseExtend.add(baseExtend1);
		baseExtend1._linkBase(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addBaseExtend"));
		return;
		// -end- 35FDD865000A add_body4551A5AD02B6 "UseCase::addBaseExtend"
	}

	/**
	 * disconnect a BaseExtend.
	 * 
	 * @see #addBaseExtend
	 */
	// -beg- preserve=no 35FDD865000A remove_head4551A5AD02B6
	// "UseCase::removeBaseExtend"
	public Extend removeBaseExtend(Extend baseExtend1)
	// -end- 35FDD865000A remove_head4551A5AD02B6 "UseCase::removeBaseExtend"
	{
		// -beg- preserve=no 35FDD865000A remove_body4551A5AD02B6
		// "UseCase::removeBaseExtend"
		Extend ret = null;
		if (baseExtend1 == null || !baseExtend.contains(baseExtend1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = baseExtend1;
		baseExtend.remove(baseExtend1);
		baseExtend1._unlinkBase(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeBaseExtend"));
		return ret;
		// -end- 35FDD865000A remove_body4551A5AD02B6
		// "UseCase::removeBaseExtend"
	}

	/**
	 * tests if a given BaseExtend is connected.
	 * 
	 * @see #addBaseExtend
	 */
	// -beg- preserve=no 35FDD865000A test_head4551A5AD02B6
	// "UseCase::containsBaseExtend"
	public boolean containsBaseExtend(Extend baseExtend1)
	// -end- 35FDD865000A test_head4551A5AD02B6 "UseCase::containsBaseExtend"
	{
		// -beg- preserve=no 35FDD865000A test_body4551A5AD02B6
		// "UseCase::containsBaseExtend"
		return baseExtend.contains(baseExtend1);
		// -end- 35FDD865000A test_body4551A5AD02B6
		// "UseCase::containsBaseExtend"
	}

	/**
	 * used to enumerate all connected BaseExtends.
	 * 
	 * @see #addBaseExtend
	 */
	// -beg- preserve=no 35FDD865000A get_all_head4551A5AD02B6
	// "UseCase::iteratorBaseExtend"
	public java.util.Iterator iteratorBaseExtend()
	// -end- 35FDD865000A get_all_head4551A5AD02B6 "UseCase::iteratorBaseExtend"
	{
		// -beg- preserve=no 35FDD865000A get_all_body4551A5AD02B6
		// "UseCase::iteratorBaseExtend"
		return baseExtend.iterator();
		// -end- 35FDD865000A get_all_body4551A5AD02B6
		// "UseCase::iteratorBaseExtend"
	}

	/**
	 * disconnect all BaseExtends.
	 * 
	 * @see #addBaseExtend
	 */
	// -beg- preserve=no 35FDD865000A remove_all_head4551A5AD02B6
	// "UseCase::clearBaseExtend"
	public void clearBaseExtend()
	// -end- 35FDD865000A remove_all_head4551A5AD02B6 "UseCase::clearBaseExtend"
	{
		// -beg- preserve=no 35FDD865000A remove_all_body4551A5AD02B6
		// "UseCase::clearBaseExtend"
		if (sizeBaseExtend() > 0) {
			for (java.util.Iterator p = baseExtend.iterator(); p.hasNext();) {
				((Extend) p.next())._unlinkBase(this);
			}
			baseExtend.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearBaseExtend"));
		}
		// -end- 35FDD865000A remove_all_body4551A5AD02B6
		// "UseCase::clearBaseExtend"
	}

	/**
	 * returns the number of BaseExtends.
	 * 
	 * @see #addBaseExtend
	 */
	// -beg- preserve=no 35FDD865000A size_head4551A5AD02B6
	// "UseCase::sizeBaseExtend"
	public int sizeBaseExtend()
	// -end- 35FDD865000A size_head4551A5AD02B6 "UseCase::sizeBaseExtend"
	{
		// -beg- preserve=no 35FDD865000A size_body4551A5AD02B6
		// "UseCase::sizeBaseExtend"
		return baseExtend.size();
		// -end- 35FDD865000A size_body4551A5AD02B6 "UseCase::sizeBaseExtend"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD865000A _link_body4551A5AD02B6
	// "UseCase::_linkBaseExtend"
	public void _linkBaseExtend(Extend baseExtend1) {
		baseExtend.add(baseExtend1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkBaseExtend"));
		return;
	}
	// -end- 35FDD865000A _link_body4551A5AD02B6 "UseCase::_linkBaseExtend"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD865000A _unlink_body4551A5AD02B6
	// "UseCase::_unlinkBaseExtend"
	public void _unlinkBaseExtend(Extend baseExtend1) {
		baseExtend.remove(baseExtend1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkBaseExtend"));
		return;
	}
	// -end- 35FDD865000A _unlink_body4551A5AD02B6 "UseCase::_unlinkBaseExtend"

	// -beg- preserve=no 35FDD86C0140 code4551A5AD02B6 "extensionExtend"
	private java.util.Set extensionExtend = new java.util.HashSet();
	// -end- 35FDD86C0140 code4551A5AD02B6 "extensionExtend"

	/**
	 * add a ExtensionExtend.
	 *
	 * @see #removeExtensionExtend
	 * @see #containsExtensionExtend
	 * @see #iteratorExtensionExtend
	 * @see #clearExtensionExtend
	 * @see #sizeExtensionExtend
	 */
	// -beg- preserve=no 35FDD86C0140 add_head4551A5AD02B6
	// "UseCase::addExtensionExtend"
	public void addExtensionExtend(Extend extensionExtend1)
	// -end- 35FDD86C0140 add_head4551A5AD02B6 "UseCase::addExtensionExtend"
	{
		// -beg- preserve=no 35FDD86C0140 add_body4551A5AD02B6
		// "UseCase::addExtensionExtend"
		extensionExtend.add(extensionExtend1);
		extensionExtend1._linkExtension(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addExtensionExtend"));
		return;
		// -end- 35FDD86C0140 add_body4551A5AD02B6 "UseCase::addExtensionExtend"
	}

	/**
	 * disconnect a ExtensionExtend.
	 * 
	 * @see #addExtensionExtend
	 */
	// -beg- preserve=no 35FDD86C0140 remove_head4551A5AD02B6
	// "UseCase::removeExtensionExtend"
	public Extend removeExtensionExtend(Extend extensionExtend1)
	// -end- 35FDD86C0140 remove_head4551A5AD02B6
	// "UseCase::removeExtensionExtend"
	{
		// -beg- preserve=no 35FDD86C0140 remove_body4551A5AD02B6
		// "UseCase::removeExtensionExtend"
		Extend ret = null;
		if (extensionExtend1 == null || !extensionExtend.contains(extensionExtend1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = extensionExtend1;
		extensionExtend.remove(extensionExtend1);
		extensionExtend1._unlinkExtension(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeExtensionExtend"));
		return ret;
		// -end- 35FDD86C0140 remove_body4551A5AD02B6
		// "UseCase::removeExtensionExtend"
	}

	/**
	 * tests if a given ExtensionExtend is connected.
	 * 
	 * @see #addExtensionExtend
	 */
	// -beg- preserve=no 35FDD86C0140 test_head4551A5AD02B6
	// "UseCase::containsExtensionExtend"
	public boolean containsExtensionExtend(Extend extensionExtend1)
	// -end- 35FDD86C0140 test_head4551A5AD02B6
	// "UseCase::containsExtensionExtend"
	{
		// -beg- preserve=no 35FDD86C0140 test_body4551A5AD02B6
		// "UseCase::containsExtensionExtend"
		return extensionExtend.contains(extensionExtend1);
		// -end- 35FDD86C0140 test_body4551A5AD02B6
		// "UseCase::containsExtensionExtend"
	}

	/**
	 * used to enumerate all connected ExtensionExtends.
	 * 
	 * @see #addExtensionExtend
	 */
	// -beg- preserve=no 35FDD86C0140 get_all_head4551A5AD02B6
	// "UseCase::iteratorExtensionExtend"
	public java.util.Iterator iteratorExtensionExtend()
	// -end- 35FDD86C0140 get_all_head4551A5AD02B6
	// "UseCase::iteratorExtensionExtend"
	{
		// -beg- preserve=no 35FDD86C0140 get_all_body4551A5AD02B6
		// "UseCase::iteratorExtensionExtend"
		return extensionExtend.iterator();
		// -end- 35FDD86C0140 get_all_body4551A5AD02B6
		// "UseCase::iteratorExtensionExtend"
	}

	/**
	 * disconnect all ExtensionExtends.
	 * 
	 * @see #addExtensionExtend
	 */
	// -beg- preserve=no 35FDD86C0140 remove_all_head4551A5AD02B6
	// "UseCase::clearExtensionExtend"
	public void clearExtensionExtend()
	// -end- 35FDD86C0140 remove_all_head4551A5AD02B6
	// "UseCase::clearExtensionExtend"
	{
		// -beg- preserve=no 35FDD86C0140 remove_all_body4551A5AD02B6
		// "UseCase::clearExtensionExtend"
		if (sizeExtensionExtend() > 0) {
			for (java.util.Iterator p = extensionExtend.iterator(); p.hasNext();) {
				((Extend) p.next())._unlinkExtension(this);
			}
			extensionExtend.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearExtensionExtend"));
		}
		// -end- 35FDD86C0140 remove_all_body4551A5AD02B6
		// "UseCase::clearExtensionExtend"
	}

	/**
	 * returns the number of ExtensionExtends.
	 * 
	 * @see #addExtensionExtend
	 */
	// -beg- preserve=no 35FDD86C0140 size_head4551A5AD02B6
	// "UseCase::sizeExtensionExtend"
	public int sizeExtensionExtend()
	// -end- 35FDD86C0140 size_head4551A5AD02B6 "UseCase::sizeExtensionExtend"
	{
		// -beg- preserve=no 35FDD86C0140 size_body4551A5AD02B6
		// "UseCase::sizeExtensionExtend"
		return extensionExtend.size();
		// -end- 35FDD86C0140 size_body4551A5AD02B6
		// "UseCase::sizeExtensionExtend"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD86C0140 _link_body4551A5AD02B6
	// "UseCase::_linkExtensionExtend"
	public void _linkExtensionExtend(Extend extensionExtend1) {
		extensionExtend.add(extensionExtend1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkExtensionExtend"));
		return;
	}
	// -end- 35FDD86C0140 _link_body4551A5AD02B6 "UseCase::_linkExtensionExtend"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD86C0140 _unlink_body4551A5AD02B6
	// "UseCase::_unlinkExtensionExtend"
	public void _unlinkExtensionExtend(Extend extensionExtend1) {
		extensionExtend.remove(extensionExtend1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkExtensionExtend"));
		return;
	}
	// -end- 35FDD86C0140 _unlink_body4551A5AD02B6
	// "UseCase::_unlinkExtensionExtend"

	// -beg- preserve=no 35FDD995038F code4551A5AD02B6 "baseInclude"
	private java.util.Set baseInclude = new java.util.HashSet();
	// -end- 35FDD995038F code4551A5AD02B6 "baseInclude"

	/**
	 * add a BaseInclude.
	 *
	 * @see #removeBaseInclude
	 * @see #containsBaseInclude
	 * @see #iteratorBaseInclude
	 * @see #clearBaseInclude
	 * @see #sizeBaseInclude
	 */
	// -beg- preserve=no 35FDD995038F add_head4551A5AD02B6
	// "UseCase::addBaseInclude"
	public void addBaseInclude(Include baseInclude1)
	// -end- 35FDD995038F add_head4551A5AD02B6 "UseCase::addBaseInclude"
	{
		// -beg- preserve=no 35FDD995038F add_body4551A5AD02B6
		// "UseCase::addBaseInclude"
		baseInclude.add(baseInclude1);
		baseInclude1._linkAddition(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addBaseInclude"));
		return;
		// -end- 35FDD995038F add_body4551A5AD02B6 "UseCase::addBaseInclude"
	}

	/**
	 * disconnect a BaseInclude.
	 * 
	 * @see #addBaseInclude
	 */
	// -beg- preserve=no 35FDD995038F remove_head4551A5AD02B6
	// "UseCase::removeBaseInclude"
	public Include removeBaseInclude(Include baseInclude1)
	// -end- 35FDD995038F remove_head4551A5AD02B6 "UseCase::removeBaseInclude"
	{
		// -beg- preserve=no 35FDD995038F remove_body4551A5AD02B6
		// "UseCase::removeBaseInclude"
		Include ret = null;
		if (baseInclude1 == null || !baseInclude.contains(baseInclude1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = baseInclude1;
		baseInclude.remove(baseInclude1);
		baseInclude1._unlinkAddition(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeBaseInclude"));
		return ret;
		// -end- 35FDD995038F remove_body4551A5AD02B6
		// "UseCase::removeBaseInclude"
	}

	/**
	 * tests if a given BaseInclude is connected.
	 * 
	 * @see #addBaseInclude
	 */
	// -beg- preserve=no 35FDD995038F test_head4551A5AD02B6
	// "UseCase::containsBaseInclude"
	public boolean containsBaseInclude(Include baseInclude1)
	// -end- 35FDD995038F test_head4551A5AD02B6 "UseCase::containsBaseInclude"
	{
		// -beg- preserve=no 35FDD995038F test_body4551A5AD02B6
		// "UseCase::containsBaseInclude"
		return baseInclude.contains(baseInclude1);
		// -end- 35FDD995038F test_body4551A5AD02B6
		// "UseCase::containsBaseInclude"
	}

	/**
	 * used to enumerate all connected BaseIncludes.
	 * 
	 * @see #addBaseInclude
	 */
	// -beg- preserve=no 35FDD995038F get_all_head4551A5AD02B6
	// "UseCase::iteratorBaseInclude"
	public java.util.Iterator iteratorBaseInclude()
	// -end- 35FDD995038F get_all_head4551A5AD02B6
	// "UseCase::iteratorBaseInclude"
	{
		// -beg- preserve=no 35FDD995038F get_all_body4551A5AD02B6
		// "UseCase::iteratorBaseInclude"
		return baseInclude.iterator();
		// -end- 35FDD995038F get_all_body4551A5AD02B6
		// "UseCase::iteratorBaseInclude"
	}

	/**
	 * disconnect all BaseIncludes.
	 * 
	 * @see #addBaseInclude
	 */
	// -beg- preserve=no 35FDD995038F remove_all_head4551A5AD02B6
	// "UseCase::clearBaseInclude"
	public void clearBaseInclude()
	// -end- 35FDD995038F remove_all_head4551A5AD02B6
	// "UseCase::clearBaseInclude"
	{
		// -beg- preserve=no 35FDD995038F remove_all_body4551A5AD02B6
		// "UseCase::clearBaseInclude"
		if (sizeBaseInclude() > 0) {
			for (java.util.Iterator p = baseInclude.iterator(); p.hasNext();) {
				((Include) p.next())._unlinkAddition(this);
			}
			baseInclude.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearBaseInclude"));
		}
		// -end- 35FDD995038F remove_all_body4551A5AD02B6
		// "UseCase::clearBaseInclude"
	}

	/**
	 * returns the number of BaseIncludes.
	 * 
	 * @see #addBaseInclude
	 */
	// -beg- preserve=no 35FDD995038F size_head4551A5AD02B6
	// "UseCase::sizeBaseInclude"
	public int sizeBaseInclude()
	// -end- 35FDD995038F size_head4551A5AD02B6 "UseCase::sizeBaseInclude"
	{
		// -beg- preserve=no 35FDD995038F size_body4551A5AD02B6
		// "UseCase::sizeBaseInclude"
		return baseInclude.size();
		// -end- 35FDD995038F size_body4551A5AD02B6 "UseCase::sizeBaseInclude"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD995038F _link_body4551A5AD02B6
	// "UseCase::_linkBaseInclude"
	public void _linkBaseInclude(Include baseInclude1) {
		baseInclude.add(baseInclude1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkBaseInclude"));
		return;
	}
	// -end- 35FDD995038F _link_body4551A5AD02B6 "UseCase::_linkBaseInclude"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD995038F _unlink_body4551A5AD02B6
	// "UseCase::_unlinkBaseInclude"
	public void _unlinkBaseInclude(Include baseInclude1) {
		baseInclude.remove(baseInclude1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkBaseInclude"));
		return;
	}
	// -end- 35FDD995038F _unlink_body4551A5AD02B6 "UseCase::_unlinkBaseInclude"

	// -beg- preserve=no 35FDD9A50047 code4551A5AD02B6 "additionInclude"
	private java.util.Set additionInclude = new java.util.HashSet();
	// -end- 35FDD9A50047 code4551A5AD02B6 "additionInclude"

	/**
	 * add a AdditionInclude.
	 *
	 * @see #removeAdditionInclude
	 * @see #containsAdditionInclude
	 * @see #iteratorAdditionInclude
	 * @see #clearAdditionInclude
	 * @see #sizeAdditionInclude
	 */
	// -beg- preserve=no 35FDD9A50047 add_head4551A5AD02B6
	// "UseCase::addAdditionInclude"
	public void addAdditionInclude(Include additionInclude1)
	// -end- 35FDD9A50047 add_head4551A5AD02B6 "UseCase::addAdditionInclude"
	{
		// -beg- preserve=no 35FDD9A50047 add_body4551A5AD02B6
		// "UseCase::addAdditionInclude"
		additionInclude.add(additionInclude1);
		additionInclude1._linkBase(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAdditionInclude"));
		return;
		// -end- 35FDD9A50047 add_body4551A5AD02B6 "UseCase::addAdditionInclude"
	}

	/**
	 * disconnect a AdditionInclude.
	 * 
	 * @see #addAdditionInclude
	 */
	// -beg- preserve=no 35FDD9A50047 remove_head4551A5AD02B6
	// "UseCase::removeAdditionInclude"
	public Include removeAdditionInclude(Include additionInclude1)
	// -end- 35FDD9A50047 remove_head4551A5AD02B6
	// "UseCase::removeAdditionInclude"
	{
		// -beg- preserve=no 35FDD9A50047 remove_body4551A5AD02B6
		// "UseCase::removeAdditionInclude"
		Include ret = null;
		if (additionInclude1 == null || !additionInclude.contains(additionInclude1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = additionInclude1;
		additionInclude.remove(additionInclude1);
		additionInclude1._unlinkBase(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAdditionInclude"));
		return ret;
		// -end- 35FDD9A50047 remove_body4551A5AD02B6
		// "UseCase::removeAdditionInclude"
	}

	/**
	 * tests if a given AdditionInclude is connected.
	 * 
	 * @see #addAdditionInclude
	 */
	// -beg- preserve=no 35FDD9A50047 test_head4551A5AD02B6
	// "UseCase::containsAdditionInclude"
	public boolean containsAdditionInclude(Include additionInclude1)
	// -end- 35FDD9A50047 test_head4551A5AD02B6
	// "UseCase::containsAdditionInclude"
	{
		// -beg- preserve=no 35FDD9A50047 test_body4551A5AD02B6
		// "UseCase::containsAdditionInclude"
		return additionInclude.contains(additionInclude1);
		// -end- 35FDD9A50047 test_body4551A5AD02B6
		// "UseCase::containsAdditionInclude"
	}

	/**
	 * used to enumerate all connected AdditionIncludes.
	 * 
	 * @see #addAdditionInclude
	 */
	// -beg- preserve=no 35FDD9A50047 get_all_head4551A5AD02B6
	// "UseCase::iteratorAdditionInclude"
	public java.util.Iterator iteratorAdditionInclude()
	// -end- 35FDD9A50047 get_all_head4551A5AD02B6
	// "UseCase::iteratorAdditionInclude"
	{
		// -beg- preserve=no 35FDD9A50047 get_all_body4551A5AD02B6
		// "UseCase::iteratorAdditionInclude"
		return additionInclude.iterator();
		// -end- 35FDD9A50047 get_all_body4551A5AD02B6
		// "UseCase::iteratorAdditionInclude"
	}

	/**
	 * disconnect all AdditionIncludes.
	 * 
	 * @see #addAdditionInclude
	 */
	// -beg- preserve=no 35FDD9A50047 remove_all_head4551A5AD02B6
	// "UseCase::clearAdditionInclude"
	public void clearAdditionInclude()
	// -end- 35FDD9A50047 remove_all_head4551A5AD02B6
	// "UseCase::clearAdditionInclude"
	{
		// -beg- preserve=no 35FDD9A50047 remove_all_body4551A5AD02B6
		// "UseCase::clearAdditionInclude"
		if (sizeAdditionInclude() > 0) {
			for (java.util.Iterator p = additionInclude.iterator(); p.hasNext();) {
				((Include) p.next())._unlinkBase(this);
			}
			additionInclude.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAdditionInclude"));
		}
		// -end- 35FDD9A50047 remove_all_body4551A5AD02B6
		// "UseCase::clearAdditionInclude"
	}

	/**
	 * returns the number of AdditionIncludes.
	 * 
	 * @see #addAdditionInclude
	 */
	// -beg- preserve=no 35FDD9A50047 size_head4551A5AD02B6
	// "UseCase::sizeAdditionInclude"
	public int sizeAdditionInclude()
	// -end- 35FDD9A50047 size_head4551A5AD02B6 "UseCase::sizeAdditionInclude"
	{
		// -beg- preserve=no 35FDD9A50047 size_body4551A5AD02B6
		// "UseCase::sizeAdditionInclude"
		return additionInclude.size();
		// -end- 35FDD9A50047 size_body4551A5AD02B6
		// "UseCase::sizeAdditionInclude"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD9A50047 _link_body4551A5AD02B6
	// "UseCase::_linkAdditionInclude"
	public void _linkAdditionInclude(Include additionInclude1) {
		additionInclude.add(additionInclude1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAdditionInclude"));
		return;
	}
	// -end- 35FDD9A50047 _link_body4551A5AD02B6 "UseCase::_linkAdditionInclude"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FDD9A50047 _unlink_body4551A5AD02B6
	// "UseCase::_unlinkAdditionInclude"
	public void _unlinkAdditionInclude(Include additionInclude1) {
		additionInclude.remove(additionInclude1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAdditionInclude"));
		return;
	}
	// -end- 35FDD9A50047 _unlink_body4551A5AD02B6
	// "UseCase::_unlinkAdditionInclude"

	// -beg- preserve=no 362661DB015F code4551A5AD02B6 "extensionPoint"
	private java.util.Set extensionPoint = new java.util.HashSet();
	// -end- 362661DB015F code4551A5AD02B6 "extensionPoint"

	/**
	 * add a ExtensionPoint.
	 *
	 * @see #removeExtensionPoint
	 * @see #containsExtensionPoint
	 * @see #iteratorExtensionPoint
	 * @see #clearExtensionPoint
	 * @see #sizeExtensionPoint
	 */
	// -beg- preserve=no 362661DB015F add_head4551A5AD02B6
	// "UseCase::addExtensionPoint"
	public void addExtensionPoint(ExtensionPoint extensionPoint1)
	// -end- 362661DB015F add_head4551A5AD02B6 "UseCase::addExtensionPoint"
	{
		// -beg- preserve=no 362661DB015F add_body4551A5AD02B6
		// "UseCase::addExtensionPoint"
		extensionPoint.add(extensionPoint1);
		extensionPoint1._linkUseCase(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addExtensionPoint"));
		return;
		// -end- 362661DB015F add_body4551A5AD02B6 "UseCase::addExtensionPoint"
	}

	/**
	 * disconnect a ExtensionPoint.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 362661DB015F remove_head4551A5AD02B6
	// "UseCase::removeExtensionPoint"
	public ExtensionPoint removeExtensionPoint(ExtensionPoint extensionPoint1)
	// -end- 362661DB015F remove_head4551A5AD02B6
	// "UseCase::removeExtensionPoint"
	{
		// -beg- preserve=no 362661DB015F remove_body4551A5AD02B6
		// "UseCase::removeExtensionPoint"
		ExtensionPoint ret = null;
		if (extensionPoint1 == null || !extensionPoint.contains(extensionPoint1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = extensionPoint1;
		extensionPoint.remove(extensionPoint1);
		extensionPoint1._unlinkUseCase(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeExtensionPoint"));
		return ret;
		// -end- 362661DB015F remove_body4551A5AD02B6
		// "UseCase::removeExtensionPoint"
	}

	/**
	 * tests if a given ExtensionPoint is connected.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 362661DB015F test_head4551A5AD02B6
	// "UseCase::containsExtensionPoint"
	public boolean containsExtensionPoint(ExtensionPoint extensionPoint1)
	// -end- 362661DB015F test_head4551A5AD02B6
	// "UseCase::containsExtensionPoint"
	{
		// -beg- preserve=no 362661DB015F test_body4551A5AD02B6
		// "UseCase::containsExtensionPoint"
		return extensionPoint.contains(extensionPoint1);
		// -end- 362661DB015F test_body4551A5AD02B6
		// "UseCase::containsExtensionPoint"
	}

	/**
	 * used to enumerate all connected ExtensionPoints.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 362661DB015F get_all_head4551A5AD02B6
	// "UseCase::iteratorExtensionPoint"
	public java.util.Iterator iteratorExtensionPoint()
	// -end- 362661DB015F get_all_head4551A5AD02B6
	// "UseCase::iteratorExtensionPoint"
	{
		// -beg- preserve=no 362661DB015F get_all_body4551A5AD02B6
		// "UseCase::iteratorExtensionPoint"
		return extensionPoint.iterator();
		// -end- 362661DB015F get_all_body4551A5AD02B6
		// "UseCase::iteratorExtensionPoint"
	}

	/**
	 * disconnect all ExtensionPoints.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 362661DB015F remove_all_head4551A5AD02B6
	// "UseCase::clearExtensionPoint"
	public void clearExtensionPoint()
	// -end- 362661DB015F remove_all_head4551A5AD02B6
	// "UseCase::clearExtensionPoint"
	{
		// -beg- preserve=no 362661DB015F remove_all_body4551A5AD02B6
		// "UseCase::clearExtensionPoint"
		if (sizeExtensionPoint() > 0) {
			for (java.util.Iterator p = extensionPoint.iterator(); p.hasNext();) {
				((ExtensionPoint) p.next())._unlinkUseCase(this);
			}
			extensionPoint.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearExtensionPoint"));
		}
		// -end- 362661DB015F remove_all_body4551A5AD02B6
		// "UseCase::clearExtensionPoint"
	}

	/**
	 * returns the number of ExtensionPoints.
	 * 
	 * @see #addExtensionPoint
	 */
	// -beg- preserve=no 362661DB015F size_head4551A5AD02B6
	// "UseCase::sizeExtensionPoint"
	public int sizeExtensionPoint()
	// -end- 362661DB015F size_head4551A5AD02B6 "UseCase::sizeExtensionPoint"
	{
		// -beg- preserve=no 362661DB015F size_body4551A5AD02B6
		// "UseCase::sizeExtensionPoint"
		return extensionPoint.size();
		// -end- 362661DB015F size_body4551A5AD02B6
		// "UseCase::sizeExtensionPoint"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362661DB015F _link_body4551A5AD02B6
	// "UseCase::_linkExtensionPoint"
	public void _linkExtensionPoint(ExtensionPoint extensionPoint1) {
		extensionPoint.add(extensionPoint1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkExtensionPoint"));
		return;
	}
	// -end- 362661DB015F _link_body4551A5AD02B6 "UseCase::_linkExtensionPoint"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362661DB015F _unlink_body4551A5AD02B6
	// "UseCase::_unlinkExtensionPoint"
	public void _unlinkExtensionPoint(ExtensionPoint extensionPoint1) {
		extensionPoint.remove(extensionPoint1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkExtensionPoint"));
		return;
	}
	// -end- 362661DB015F _unlink_body4551A5AD02B6
	// "UseCase::_unlinkExtensionPoint"

	/**
	 * tests if this Classifier contains a Feature with the given name
	 */
	// -beg- preserve=no 3CB2C64E0374 head4551A5AD02B6 "containsFeature"
	public boolean containsFeature(String name)
	// -end- 3CB2C64E0374 head4551A5AD02B6 "containsFeature"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CB2C64E0374 throws4551A5AD02B6 "containsFeature"

	// -end- 3CB2C64E0374 throws4551A5AD02B6 "containsFeature"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CB2C64E0374 body4551A5AD02B6 "containsFeature"
		java.util.Iterator it = iteratorFeature();
		while (it.hasNext()) {
			ModelElement ele = (ModelElement) it.next();
			if (ele.getDefLangName().equals(name)) {
				return true;
			}
		}
		return false;
		// -end- 3CB2C64E0374 body4551A5AD02B6 "containsFeature"
	}

	// -beg- preserve=no 33CF9EFC006E code4551A5AD02B6 "objectFlowState"
	private java.util.Set objectFlowState = new java.util.HashSet();
	// -end- 33CF9EFC006E code4551A5AD02B6 "objectFlowState"

	/**
	 * add a ObjectFlowState.
	 *
	 * @see #removeObjectFlowState
	 * @see #containsObjectFlowState
	 * @see #iteratorObjectFlowState
	 * @see #clearObjectFlowState
	 * @see #sizeObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E add_head4551A5AD02B6
	// "Classifier::addObjectFlowState"
	public void addObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E add_head4551A5AD02B6 "Classifier::addObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E add_body4551A5AD02B6
		// "Classifier::addObjectFlowState"
		objectFlowState.add(objectFlowState1);
		objectFlowState1._linkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addObjectFlowState"));
		return;
		// -end- 33CF9EFC006E add_body4551A5AD02B6
		// "Classifier::addObjectFlowState"
	}

	/**
	 * disconnect a ObjectFlowState.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_head4551A5AD02B6
	// "Classifier::removeObjectFlowState"
	public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E remove_head4551A5AD02B6
	// "Classifier::removeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_body4551A5AD02B6
		// "Classifier::removeObjectFlowState"
		ObjectFlowState ret = null;
		if (objectFlowState1 == null || !objectFlowState.contains(objectFlowState1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = objectFlowState1;
		objectFlowState.remove(objectFlowState1);
		objectFlowState1._unlinkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeObjectFlowState"));
		return ret;
		// -end- 33CF9EFC006E remove_body4551A5AD02B6
		// "Classifier::removeObjectFlowState"
	}

	/**
	 * tests if a given ObjectFlowState is connected.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E test_head4551A5AD02B6
	// "Classifier::containsObjectFlowState"
	public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E test_head4551A5AD02B6
	// "Classifier::containsObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E test_body4551A5AD02B6
		// "Classifier::containsObjectFlowState"
		return objectFlowState.contains(objectFlowState1);
		// -end- 33CF9EFC006E test_body4551A5AD02B6
		// "Classifier::containsObjectFlowState"
	}

	/**
	 * used to enumerate all connected ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E get_all_head4551A5AD02B6
	// "Classifier::iteratorObjectFlowState"
	public java.util.Iterator iteratorObjectFlowState()
	// -end- 33CF9EFC006E get_all_head4551A5AD02B6
	// "Classifier::iteratorObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E get_all_body4551A5AD02B6
		// "Classifier::iteratorObjectFlowState"
		return objectFlowState.iterator();
		// -end- 33CF9EFC006E get_all_body4551A5AD02B6
		// "Classifier::iteratorObjectFlowState"
	}

	/**
	 * disconnect all ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_all_head4551A5AD02B6
	// "Classifier::clearObjectFlowState"
	public void clearObjectFlowState()
	// -end- 33CF9EFC006E remove_all_head4551A5AD02B6
	// "Classifier::clearObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_all_body4551A5AD02B6
		// "Classifier::clearObjectFlowState"
		if (sizeObjectFlowState() > 0) {
			for (java.util.Iterator p = objectFlowState.iterator(); p.hasNext();) {
				((ObjectFlowState) p.next())._unlinkType(this);
			}
			objectFlowState.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearObjectFlowState"));
		}
		// -end- 33CF9EFC006E remove_all_body4551A5AD02B6
		// "Classifier::clearObjectFlowState"
	}

	/**
	 * returns the number of ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E size_head4551A5AD02B6
	// "Classifier::sizeObjectFlowState"
	public int sizeObjectFlowState()
	// -end- 33CF9EFC006E size_head4551A5AD02B6
	// "Classifier::sizeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E size_body4551A5AD02B6
		// "Classifier::sizeObjectFlowState"
		return objectFlowState.size();
		// -end- 33CF9EFC006E size_body4551A5AD02B6
		// "Classifier::sizeObjectFlowState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _link_body4551A5AD02B6
	// "Classifier::_linkObjectFlowState"
	public void _linkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.add(objectFlowState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkObjectFlowState"));
		return;
	}
	// -end- 33CF9EFC006E _link_body4551A5AD02B6
	// "Classifier::_linkObjectFlowState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _unlink_body4551A5AD02B6
	// "Classifier::_unlinkObjectFlowState"
	public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.remove(objectFlowState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkObjectFlowState"));
		return;
	}
	// -end- 33CF9EFC006E _unlink_body4551A5AD02B6
	// "Classifier::_unlinkObjectFlowState"

	// -beg- preserve=no 33CF9F1602BC code4551A5AD02B6 "classifierInState"
	private java.util.Set classifierInState = new java.util.HashSet();
	// -end- 33CF9F1602BC code4551A5AD02B6 "classifierInState"

	/**
	 * add a ClassifierInState.
	 *
	 * @see #removeClassifierInState
	 * @see #containsClassifierInState
	 * @see #iteratorClassifierInState
	 * @see #clearClassifierInState
	 * @see #sizeClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC add_head4551A5AD02B6
	// "Classifier::addClassifierInState"
	public void addClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC add_head4551A5AD02B6
	// "Classifier::addClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC add_body4551A5AD02B6
		// "Classifier::addClassifierInState"
		classifierInState.add(classifierInState1);
		classifierInState1._linkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addClassifierInState"));
		return;
		// -end- 33CF9F1602BC add_body4551A5AD02B6
		// "Classifier::addClassifierInState"
	}

	/**
	 * disconnect a ClassifierInState.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_head4551A5AD02B6
	// "Classifier::removeClassifierInState"
	public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC remove_head4551A5AD02B6
	// "Classifier::removeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_body4551A5AD02B6
		// "Classifier::removeClassifierInState"
		ClassifierInState ret = null;
		if (classifierInState1 == null || !classifierInState.contains(classifierInState1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = classifierInState1;
		classifierInState.remove(classifierInState1);
		classifierInState1._unlinkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeClassifierInState"));
		return ret;
		// -end- 33CF9F1602BC remove_body4551A5AD02B6
		// "Classifier::removeClassifierInState"
	}

	/**
	 * tests if a given ClassifierInState is connected.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC test_head4551A5AD02B6
	// "Classifier::containsClassifierInState"
	public boolean containsClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC test_head4551A5AD02B6
	// "Classifier::containsClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC test_body4551A5AD02B6
		// "Classifier::containsClassifierInState"
		return classifierInState.contains(classifierInState1);
		// -end- 33CF9F1602BC test_body4551A5AD02B6
		// "Classifier::containsClassifierInState"
	}

	/**
	 * used to enumerate all connected ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC get_all_head4551A5AD02B6
	// "Classifier::iteratorClassifierInState"
	public java.util.Iterator iteratorClassifierInState()
	// -end- 33CF9F1602BC get_all_head4551A5AD02B6
	// "Classifier::iteratorClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC get_all_body4551A5AD02B6
		// "Classifier::iteratorClassifierInState"
		return classifierInState.iterator();
		// -end- 33CF9F1602BC get_all_body4551A5AD02B6
		// "Classifier::iteratorClassifierInState"
	}

	/**
	 * disconnect all ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_all_head4551A5AD02B6
	// "Classifier::clearClassifierInState"
	public void clearClassifierInState()
	// -end- 33CF9F1602BC remove_all_head4551A5AD02B6
	// "Classifier::clearClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_all_body4551A5AD02B6
		// "Classifier::clearClassifierInState"
		if (sizeClassifierInState() > 0) {
			for (java.util.Iterator p = classifierInState.iterator(); p.hasNext();) {
				((ClassifierInState) p.next())._unlinkType(this);
			}
			classifierInState.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearClassifierInState"));
		}
		// -end- 33CF9F1602BC remove_all_body4551A5AD02B6
		// "Classifier::clearClassifierInState"
	}

	/**
	 * returns the number of ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC size_head4551A5AD02B6
	// "Classifier::sizeClassifierInState"
	public int sizeClassifierInState()
	// -end- 33CF9F1602BC size_head4551A5AD02B6
	// "Classifier::sizeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC size_body4551A5AD02B6
		// "Classifier::sizeClassifierInState"
		return classifierInState.size();
		// -end- 33CF9F1602BC size_body4551A5AD02B6
		// "Classifier::sizeClassifierInState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _link_body4551A5AD02B6
	// "Classifier::_linkClassifierInState"
	public void _linkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.add(classifierInState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkClassifierInState"));
		return;
	}
	// -end- 33CF9F1602BC _link_body4551A5AD02B6
	// "Classifier::_linkClassifierInState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _unlink_body4551A5AD02B6
	// "Classifier::_unlinkClassifierInState"
	public void _unlinkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.remove(classifierInState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkClassifierInState"));
		return;
	}
	// -end- 33CF9F1602BC _unlink_body4551A5AD02B6
	// "Classifier::_unlinkClassifierInState"

	// -beg- preserve=no 36008FB700E7 code4551A5AD02B6 "classifierRole"

	// -end- 36008FB700E7 code4551A5AD02B6 "classifierRole"

	/**
	 * add a ClassifierRole.
	 *
	 * @see #removeClassifierRole
	 * @see #containsClassifierRole
	 * @see #iteratorClassifierRole
	 * @see #clearClassifierRole
	 * @see #sizeClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 add_head4551A5AD02B6
	// "ModelElement::addClassifierRole"
	public void addClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 add_head4551A5AD02B6 "ModelElement::addClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 add_body4551A5AD02B6
		// "ModelElement::addClassifierRole"
		super.addClassifierRole(classifierRole1);
		// -end- 36008FB700E7 add_body4551A5AD02B6
		// "ModelElement::addClassifierRole"
	}

	/**
	 * disconnect a ClassifierRole.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_head4551A5AD02B6
	// "ModelElement::removeClassifierRole"
	public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 remove_head4551A5AD02B6
	// "ModelElement::removeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_body4551A5AD02B6
		// "ModelElement::removeClassifierRole"
		return super.removeClassifierRole(classifierRole1);
		// -end- 36008FB700E7 remove_body4551A5AD02B6
		// "ModelElement::removeClassifierRole"
	}

	/**
	 * tests if a given ClassifierRole is connected.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 test_head4551A5AD02B6
	// "ModelElement::containsClassifierRole"
	public boolean containsClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 test_head4551A5AD02B6
	// "ModelElement::containsClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 test_body4551A5AD02B6
		// "ModelElement::containsClassifierRole"
		return super.containsClassifierRole(classifierRole1);
		// -end- 36008FB700E7 test_body4551A5AD02B6
		// "ModelElement::containsClassifierRole"
	}

	/**
	 * used to enumerate all connected ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 get_all_head4551A5AD02B6
	// "ModelElement::iteratorClassifierRole"
	public java.util.Iterator iteratorClassifierRole()
	// -end- 36008FB700E7 get_all_head4551A5AD02B6
	// "ModelElement::iteratorClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 get_all_body4551A5AD02B6
		// "ModelElement::iteratorClassifierRole"
		return super.iteratorClassifierRole();
		// -end- 36008FB700E7 get_all_body4551A5AD02B6
		// "ModelElement::iteratorClassifierRole"
	}

	/**
	 * disconnect all ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_all_head4551A5AD02B6
	// "ModelElement::clearClassifierRole"
	public void clearClassifierRole()
	// -end- 36008FB700E7 remove_all_head4551A5AD02B6
	// "ModelElement::clearClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_all_body4551A5AD02B6
		// "ModelElement::clearClassifierRole"
		super.clearClassifierRole();
		// -end- 36008FB700E7 remove_all_body4551A5AD02B6
		// "ModelElement::clearClassifierRole"
	}

	/**
	 * returns the number of ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 size_head4551A5AD02B6
	// "ModelElement::sizeClassifierRole"
	public int sizeClassifierRole()
	// -end- 36008FB700E7 size_head4551A5AD02B6
	// "ModelElement::sizeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 size_body4551A5AD02B6
		// "ModelElement::sizeClassifierRole"
		return super.sizeClassifierRole();
		// -end- 36008FB700E7 size_body4551A5AD02B6
		// "ModelElement::sizeClassifierRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _link_body4551A5AD02B6
	// "ModelElement::_linkClassifierRole"
	public void _linkClassifierRole(ClassifierRole classifierRole1) {
		super._linkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _link_body4551A5AD02B6
	// "ModelElement::_linkClassifierRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _unlink_body4551A5AD02B6
	// "ModelElement::_unlinkClassifierRole"
	public void _unlinkClassifierRole(ClassifierRole classifierRole1) {
		super._unlinkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _unlink_body4551A5AD02B6
	// "ModelElement::_unlinkClassifierRole"

	// -beg- preserve=no 33D1394E029F code4551A5AD02B6 "collaboration"

	// -end- 33D1394E029F code4551A5AD02B6 "collaboration"

	/**
	 * add a Collaboration.
	 *
	 * @see #removeCollaboration
	 * @see #containsCollaboration
	 * @see #iteratorCollaboration
	 * @see #clearCollaboration
	 * @see #sizeCollaboration
	 */
	// -beg- preserve=no 33D1394E029F add_head4551A5AD02B6
	// "ModelElement::addCollaboration"
	public void addCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F add_head4551A5AD02B6 "ModelElement::addCollaboration"
	{
		// -beg- preserve=no 33D1394E029F add_body4551A5AD02B6
		// "ModelElement::addCollaboration"
		super.addCollaboration(collaboration1);
		// -end- 33D1394E029F add_body4551A5AD02B6
		// "ModelElement::addCollaboration"
	}

	/**
	 * disconnect a Collaboration.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_head4551A5AD02B6
	// "ModelElement::removeCollaboration"
	public Collaboration removeCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F remove_head4551A5AD02B6
	// "ModelElement::removeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_body4551A5AD02B6
		// "ModelElement::removeCollaboration"
		return super.removeCollaboration(collaboration1);
		// -end- 33D1394E029F remove_body4551A5AD02B6
		// "ModelElement::removeCollaboration"
	}

	/**
	 * tests if a given Collaboration is connected.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F test_head4551A5AD02B6
	// "ModelElement::containsCollaboration"
	public boolean containsCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F test_head4551A5AD02B6
	// "ModelElement::containsCollaboration"
	{
		// -beg- preserve=no 33D1394E029F test_body4551A5AD02B6
		// "ModelElement::containsCollaboration"
		return super.containsCollaboration(collaboration1);
		// -end- 33D1394E029F test_body4551A5AD02B6
		// "ModelElement::containsCollaboration"
	}

	/**
	 * used to enumerate all connected Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F get_all_head4551A5AD02B6
	// "ModelElement::iteratorCollaboration"
	public java.util.Iterator iteratorCollaboration()
	// -end- 33D1394E029F get_all_head4551A5AD02B6
	// "ModelElement::iteratorCollaboration"
	{
		// -beg- preserve=no 33D1394E029F get_all_body4551A5AD02B6
		// "ModelElement::iteratorCollaboration"
		return super.iteratorCollaboration();
		// -end- 33D1394E029F get_all_body4551A5AD02B6
		// "ModelElement::iteratorCollaboration"
	}

	/**
	 * disconnect all Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_all_head4551A5AD02B6
	// "ModelElement::clearCollaboration"
	public void clearCollaboration()
	// -end- 33D1394E029F remove_all_head4551A5AD02B6
	// "ModelElement::clearCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_all_body4551A5AD02B6
		// "ModelElement::clearCollaboration"
		super.clearCollaboration();
		// -end- 33D1394E029F remove_all_body4551A5AD02B6
		// "ModelElement::clearCollaboration"
	}

	/**
	 * returns the number of Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F size_head4551A5AD02B6
	// "ModelElement::sizeCollaboration"
	public int sizeCollaboration()
	// -end- 33D1394E029F size_head4551A5AD02B6
	// "ModelElement::sizeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F size_body4551A5AD02B6
		// "ModelElement::sizeCollaboration"
		return super.sizeCollaboration();
		// -end- 33D1394E029F size_body4551A5AD02B6
		// "ModelElement::sizeCollaboration"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _link_body4551A5AD02B6
	// "ModelElement::_linkCollaboration"
	public void _linkCollaboration(Collaboration collaboration1) {
		super._linkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _link_body4551A5AD02B6
	// "ModelElement::_linkCollaboration"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _unlink_body4551A5AD02B6
	// "ModelElement::_unlinkCollaboration"
	public void _unlinkCollaboration(Collaboration collaboration1) {
		super._unlinkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _unlink_body4551A5AD02B6
	// "ModelElement::_unlinkCollaboration"

	// -beg- preserve=no 33CAD7E900AB code4551A5AD02B6 "instance"
	private java.util.Set instance = new java.util.HashSet();
	// -end- 33CAD7E900AB code4551A5AD02B6 "instance"

	/**
	 * add a Instance.
	 *
	 * @see #removeInstance
	 * @see #containsInstance
	 * @see #iteratorInstance
	 * @see #clearInstance
	 * @see #sizeInstance
	 */
	// -beg- preserve=no 33CAD7E900AB add_head4551A5AD02B6
	// "Classifier::addInstance"
	public void addInstance(Instance instance1)
	// -end- 33CAD7E900AB add_head4551A5AD02B6 "Classifier::addInstance"
	{
		// -beg- preserve=no 33CAD7E900AB add_body4551A5AD02B6
		// "Classifier::addInstance"
		instance.add(instance1);
		instance1._linkClassifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addInstance"));
		return;
		// -end- 33CAD7E900AB add_body4551A5AD02B6 "Classifier::addInstance"
	}

	/**
	 * disconnect a Instance.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_head4551A5AD02B6
	// "Classifier::removeInstance"
	public Instance removeInstance(Instance instance1)
	// -end- 33CAD7E900AB remove_head4551A5AD02B6 "Classifier::removeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_body4551A5AD02B6
		// "Classifier::removeInstance"
		Instance ret = null;
		if (instance1 == null || !instance.contains(instance1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = instance1;
		instance.remove(instance1);
		instance1._unlinkClassifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeInstance"));
		return ret;
		// -end- 33CAD7E900AB remove_body4551A5AD02B6
		// "Classifier::removeInstance"
	}

	/**
	 * tests if a given Instance is connected.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB test_head4551A5AD02B6
	// "Classifier::containsInstance"
	public boolean containsInstance(Instance instance1)
	// -end- 33CAD7E900AB test_head4551A5AD02B6 "Classifier::containsInstance"
	{
		// -beg- preserve=no 33CAD7E900AB test_body4551A5AD02B6
		// "Classifier::containsInstance"
		return instance.contains(instance1);
		// -end- 33CAD7E900AB test_body4551A5AD02B6
		// "Classifier::containsInstance"
	}

	/**
	 * used to enumerate all connected Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB get_all_head4551A5AD02B6
	// "Classifier::iteratorInstance"
	public java.util.Iterator iteratorInstance()
	// -end- 33CAD7E900AB get_all_head4551A5AD02B6
	// "Classifier::iteratorInstance"
	{
		// -beg- preserve=no 33CAD7E900AB get_all_body4551A5AD02B6
		// "Classifier::iteratorInstance"
		return instance.iterator();
		// -end- 33CAD7E900AB get_all_body4551A5AD02B6
		// "Classifier::iteratorInstance"
	}

	/**
	 * disconnect all Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_all_head4551A5AD02B6
	// "Classifier::clearInstance"
	public void clearInstance()
	// -end- 33CAD7E900AB remove_all_head4551A5AD02B6
	// "Classifier::clearInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_all_body4551A5AD02B6
		// "Classifier::clearInstance"
		if (sizeInstance() > 0) {
			for (java.util.Iterator p = instance.iterator(); p.hasNext();) {
				((Instance) p.next())._unlinkClassifier(this);
			}
			instance.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearInstance"));
		}
		// -end- 33CAD7E900AB remove_all_body4551A5AD02B6
		// "Classifier::clearInstance"
	}

	/**
	 * returns the number of Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB size_head4551A5AD02B6
	// "Classifier::sizeInstance"
	public int sizeInstance()
	// -end- 33CAD7E900AB size_head4551A5AD02B6 "Classifier::sizeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB size_body4551A5AD02B6
		// "Classifier::sizeInstance"
		return instance.size();
		// -end- 33CAD7E900AB size_body4551A5AD02B6 "Classifier::sizeInstance"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _link_body4551A5AD02B6
	// "Classifier::_linkInstance"
	public void _linkInstance(Instance instance1) {
		instance.add(instance1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkInstance"));
		return;
	}
	// -end- 33CAD7E900AB _link_body4551A5AD02B6 "Classifier::_linkInstance"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _unlink_body4551A5AD02B6
	// "Classifier::_unlinkInstance"
	public void _unlinkInstance(Instance instance1) {
		instance.remove(instance1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkInstance"));
		return;
	}
	// -end- 33CAD7E900AB _unlink_body4551A5AD02B6 "Classifier::_unlinkInstance"

	// -beg- preserve=no 33CFD0A701A4 code4551A5AD02B6 "createAction"
	private java.util.Set createAction = new java.util.HashSet();
	// -end- 33CFD0A701A4 code4551A5AD02B6 "createAction"

	/**
	 * add a CreateAction.
	 *
	 * @see #removeCreateAction
	 * @see #containsCreateAction
	 * @see #iteratorCreateAction
	 * @see #clearCreateAction
	 * @see #sizeCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 add_head4551A5AD02B6
	// "Classifier::addCreateAction"
	public void addCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 add_head4551A5AD02B6 "Classifier::addCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 add_body4551A5AD02B6
		// "Classifier::addCreateAction"
		createAction.add(createAction1);
		createAction1._linkInstantiation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addCreateAction"));
		return;
		// -end- 33CFD0A701A4 add_body4551A5AD02B6 "Classifier::addCreateAction"
	}

	/**
	 * disconnect a CreateAction.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_head4551A5AD02B6
	// "Classifier::removeCreateAction"
	public CreateAction removeCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 remove_head4551A5AD02B6
	// "Classifier::removeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_body4551A5AD02B6
		// "Classifier::removeCreateAction"
		CreateAction ret = null;
		if (createAction1 == null || !createAction.contains(createAction1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = createAction1;
		createAction.remove(createAction1);
		createAction1._unlinkInstantiation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeCreateAction"));
		return ret;
		// -end- 33CFD0A701A4 remove_body4551A5AD02B6
		// "Classifier::removeCreateAction"
	}

	/**
	 * tests if a given CreateAction is connected.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 test_head4551A5AD02B6
	// "Classifier::containsCreateAction"
	public boolean containsCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 test_head4551A5AD02B6
	// "Classifier::containsCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 test_body4551A5AD02B6
		// "Classifier::containsCreateAction"
		return createAction.contains(createAction1);
		// -end- 33CFD0A701A4 test_body4551A5AD02B6
		// "Classifier::containsCreateAction"
	}

	/**
	 * used to enumerate all connected CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 get_all_head4551A5AD02B6
	// "Classifier::iteratorCreateAction"
	public java.util.Iterator iteratorCreateAction()
	// -end- 33CFD0A701A4 get_all_head4551A5AD02B6
	// "Classifier::iteratorCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 get_all_body4551A5AD02B6
		// "Classifier::iteratorCreateAction"
		return createAction.iterator();
		// -end- 33CFD0A701A4 get_all_body4551A5AD02B6
		// "Classifier::iteratorCreateAction"
	}

	/**
	 * disconnect all CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_all_head4551A5AD02B6
	// "Classifier::clearCreateAction"
	public void clearCreateAction()
	// -end- 33CFD0A701A4 remove_all_head4551A5AD02B6
	// "Classifier::clearCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_all_body4551A5AD02B6
		// "Classifier::clearCreateAction"
		if (sizeCreateAction() > 0) {
			for (java.util.Iterator p = createAction.iterator(); p.hasNext();) {
				((CreateAction) p.next())._unlinkInstantiation(this);
			}
			createAction.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearCreateAction"));
		}
		// -end- 33CFD0A701A4 remove_all_body4551A5AD02B6
		// "Classifier::clearCreateAction"
	}

	/**
	 * returns the number of CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 size_head4551A5AD02B6
	// "Classifier::sizeCreateAction"
	public int sizeCreateAction()
	// -end- 33CFD0A701A4 size_head4551A5AD02B6 "Classifier::sizeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 size_body4551A5AD02B6
		// "Classifier::sizeCreateAction"
		return createAction.size();
		// -end- 33CFD0A701A4 size_body4551A5AD02B6
		// "Classifier::sizeCreateAction"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _link_body4551A5AD02B6
	// "Classifier::_linkCreateAction"
	public void _linkCreateAction(CreateAction createAction1) {
		createAction.add(createAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkCreateAction"));
		return;
	}
	// -end- 33CFD0A701A4 _link_body4551A5AD02B6 "Classifier::_linkCreateAction"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _unlink_body4551A5AD02B6
	// "Classifier::_unlinkCreateAction"
	public void _unlinkCreateAction(CreateAction createAction1) {
		createAction.remove(createAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkCreateAction"));
		return;
	}
	// -end- 33CFD0A701A4 _unlink_body4551A5AD02B6
	// "Classifier::_unlinkCreateAction"

	// -beg- preserve=no 32B5D7EF03D3 code4551A5AD02B6 "feature"
	private java.util.List feature = new java.util.ArrayList();
	// -end- 32B5D7EF03D3 code4551A5AD02B6 "feature"

	/**
	 * add a Feature.
	 *
	 * @see #removeFeature
	 * @see #containsFeature
	 * @see #iteratorFeature
	 * @see #clearFeature
	 * @see #sizeFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 add_head4551A5AD02B6
	// "Classifier::addFeature"
	public void addFeature(Feature feature1)
	// -end- 32B5D7EF03D3 add_head4551A5AD02B6 "Classifier::addFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add_body4551A5AD02B6
		// "Classifier::addFeature"
		feature.add(feature1);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addFeature"));
		return;
		// -end- 32B5D7EF03D3 add_body4551A5AD02B6 "Classifier::addFeature"
	}

	// -beg- preserve=no 32B5D7EF03D3 add2_head4551A5AD02B6
	// "Classifier::add2Feature"
	public void addFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 add2_head4551A5AD02B6 "Classifier::add2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add2_body4551A5AD02B6
		// "Classifier::add2Feature"
		feature.add(index, feature1);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addFeature"));
		return;
		// -end- 32B5D7EF03D3 add2_body4551A5AD02B6 "Classifier::add2Feature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_head4551A5AD02B6
	// "Classifier::removeFeature"
	public Feature removeFeature(Feature feature1)
	// -end- 32B5D7EF03D3 remove_head4551A5AD02B6 "Classifier::removeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_body4551A5AD02B6
		// "Classifier::removeFeature"
		Feature ret = null;
		if (feature1 == null || !feature.contains(feature1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = feature1;
		feature.remove(feature1);
		feature1._unlinkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeFeature"));
		return ret;
		// -end- 32B5D7EF03D3 remove_body4551A5AD02B6
		// "Classifier::removeFeature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove2_head4551A5AD02B6
	// "Classifier::remove2Feature"
	public Feature removeFeature(int index)
	// -end- 32B5D7EF03D3 remove2_head4551A5AD02B6 "Classifier::remove2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove2_body4551A5AD02B6
		// "Classifier::remove2Feature"
		Feature ret = null;
		ret = (Feature) feature.remove(index);
		ret._unlinkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeFeature"));
		return ret;
		// -end- 32B5D7EF03D3 remove2_body4551A5AD02B6
		// "Classifier::remove2Feature"
	}

	/**
	 * change a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 set_head4551A5AD02B6
	// "Classifier::setFeature"
	public Feature setFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 set_head4551A5AD02B6 "Classifier::setFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 set_body4551A5AD02B6
		// "Classifier::setFeature"
		Feature ret = null;
		ret = (Feature) feature.set(index, feature1);
		ret._unlinkOwner(this);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setFeature"));
		return ret;
		// -end- 32B5D7EF03D3 set_body4551A5AD02B6 "Classifier::setFeature"
	}

	/**
	 * tests if a given Feature is connected.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 test_head4551A5AD02B6
	// "Classifier::containsFeature"
	public boolean containsFeature(Feature feature1)
	// -end- 32B5D7EF03D3 test_head4551A5AD02B6 "Classifier::containsFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 test_body4551A5AD02B6
		// "Classifier::containsFeature"
		return feature.contains(feature1);
		// -end- 32B5D7EF03D3 test_body4551A5AD02B6
		// "Classifier::containsFeature"
	}

	/**
	 * used to enumerate all connected Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 get_all_head4551A5AD02B6
	// "Classifier::iteratorFeature"
	public java.util.Iterator iteratorFeature()
	// -end- 32B5D7EF03D3 get_all_head4551A5AD02B6 "Classifier::iteratorFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 get_all_body4551A5AD02B6
		// "Classifier::iteratorFeature"
		return feature.iterator();
		// -end- 32B5D7EF03D3 get_all_body4551A5AD02B6
		// "Classifier::iteratorFeature"
	}

	/**
	 * disconnect all Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_all_head4551A5AD02B6
	// "Classifier::clearFeature"
	public void clearFeature()
	// -end- 32B5D7EF03D3 remove_all_head4551A5AD02B6 "Classifier::clearFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_all_body4551A5AD02B6
		// "Classifier::clearFeature"
		if (sizeFeature() > 0) {
			for (java.util.Iterator p = feature.iterator(); p.hasNext();) {
				((Feature) p.next())._unlinkOwner(this);
			}
			feature.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearFeature"));
		}
		// -end- 32B5D7EF03D3 remove_all_body4551A5AD02B6
		// "Classifier::clearFeature"
	}

	/**
	 * returns the number of Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 size_head4551A5AD02B6
	// "Classifier::sizeFeature"
	public int sizeFeature()
	// -end- 32B5D7EF03D3 size_head4551A5AD02B6 "Classifier::sizeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 size_body4551A5AD02B6
		// "Classifier::sizeFeature"
		return feature.size();
		// -end- 32B5D7EF03D3 size_body4551A5AD02B6 "Classifier::sizeFeature"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _link_body4551A5AD02B6
	// "Classifier::_linkFeature"
	public void _linkFeature(Feature feature1) {
		feature.add(feature1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkFeature"));
		return;
	}
	// -end- 32B5D7EF03D3 _link_body4551A5AD02B6 "Classifier::_linkFeature"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _unlink_body4551A5AD02B6
	// "Classifier::_unlinkFeature"
	public void _unlinkFeature(Feature feature1) {
		feature.remove(feature1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkFeature"));
		return;
	}
	// -end- 32B5D7EF03D3 _unlink_body4551A5AD02B6 "Classifier::_unlinkFeature"

	// -beg- preserve=no 33E265070353 code4551A5AD02B6 "association"
	private java.util.Set association = new java.util.HashSet();
	// -end- 33E265070353 code4551A5AD02B6 "association"

	/**
	 * add a Association.
	 *
	 * @see #removeAssociation
	 * @see #containsAssociation
	 * @see #iteratorAssociation
	 * @see #clearAssociation
	 * @see #sizeAssociation
	 */
	// -beg- preserve=no 33E265070353 add_head4551A5AD02B6
	// "Classifier::addAssociation"
	public void addAssociation(AssociationEnd association1)
	// -end- 33E265070353 add_head4551A5AD02B6 "Classifier::addAssociation"
	{
		// -beg- preserve=no 33E265070353 add_body4551A5AD02B6
		// "Classifier::addAssociation"
		association.add(association1);
		association1._linkParticipant(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAssociation"));
		return;
		// -end- 33E265070353 add_body4551A5AD02B6 "Classifier::addAssociation"
	}

	/**
	 * disconnect a Association.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_head4551A5AD02B6
	// "Classifier::removeAssociation"
	public AssociationEnd removeAssociation(AssociationEnd association1)
	// -end- 33E265070353 remove_head4551A5AD02B6
	// "Classifier::removeAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_body4551A5AD02B6
		// "Classifier::removeAssociation"
		AssociationEnd ret = null;
		if (association1 == null || !association.contains(association1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = association1;
		association.remove(association1);
		association1._unlinkParticipant(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAssociation"));
		return ret;
		// -end- 33E265070353 remove_body4551A5AD02B6
		// "Classifier::removeAssociation"
	}

	/**
	 * tests if a given Association is connected.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 test_head4551A5AD02B6
	// "Classifier::containsAssociation"
	public boolean containsAssociation(AssociationEnd association1)
	// -end- 33E265070353 test_head4551A5AD02B6
	// "Classifier::containsAssociation"
	{
		// -beg- preserve=no 33E265070353 test_body4551A5AD02B6
		// "Classifier::containsAssociation"
		return association.contains(association1);
		// -end- 33E265070353 test_body4551A5AD02B6
		// "Classifier::containsAssociation"
	}

	/**
	 * used to enumerate all connected Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 get_all_head4551A5AD02B6
	// "Classifier::iteratorAssociation"
	public java.util.Iterator iteratorAssociation()
	// -end- 33E265070353 get_all_head4551A5AD02B6
	// "Classifier::iteratorAssociation"
	{
		// -beg- preserve=no 33E265070353 get_all_body4551A5AD02B6
		// "Classifier::iteratorAssociation"
		return association.iterator();
		// -end- 33E265070353 get_all_body4551A5AD02B6
		// "Classifier::iteratorAssociation"
	}

	/**
	 * disconnect all Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_all_head4551A5AD02B6
	// "Classifier::clearAssociation"
	public void clearAssociation()
	// -end- 33E265070353 remove_all_head4551A5AD02B6
	// "Classifier::clearAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_all_body4551A5AD02B6
		// "Classifier::clearAssociation"
		if (sizeAssociation() > 0) {
			for (java.util.Iterator p = association.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkParticipant(this);
			}
			association.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAssociation"));
		}
		// -end- 33E265070353 remove_all_body4551A5AD02B6
		// "Classifier::clearAssociation"
	}

	/**
	 * returns the number of Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 size_head4551A5AD02B6
	// "Classifier::sizeAssociation"
	public int sizeAssociation()
	// -end- 33E265070353 size_head4551A5AD02B6 "Classifier::sizeAssociation"
	{
		// -beg- preserve=no 33E265070353 size_body4551A5AD02B6
		// "Classifier::sizeAssociation"
		return association.size();
		// -end- 33E265070353 size_body4551A5AD02B6
		// "Classifier::sizeAssociation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _link_body4551A5AD02B6
	// "Classifier::_linkAssociation"
	public void _linkAssociation(AssociationEnd association1) {
		association.add(association1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAssociation"));
		return;
	}
	// -end- 33E265070353 _link_body4551A5AD02B6 "Classifier::_linkAssociation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _unlink_body4551A5AD02B6
	// "Classifier::_unlinkAssociation"
	public void _unlinkAssociation(AssociationEnd association1) {
		association.remove(association1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAssociation"));
		return;
	}
	// -end- 33E265070353 _unlink_body4551A5AD02B6
	// "Classifier::_unlinkAssociation"

	// -beg- preserve=no 33F0EFAD00AB code4551A5AD02B6 "specifiedEnd"
	private java.util.Set specifiedEnd = new java.util.HashSet();
	// -end- 33F0EFAD00AB code4551A5AD02B6 "specifiedEnd"

	/**
	 * add a SpecifiedEnd.
	 *
	 * @see #removeSpecifiedEnd
	 * @see #containsSpecifiedEnd
	 * @see #iteratorSpecifiedEnd
	 * @see #clearSpecifiedEnd
	 * @see #sizeSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB add_head4551A5AD02B6
	// "Classifier::addSpecifiedEnd"
	public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB add_head4551A5AD02B6 "Classifier::addSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB add_body4551A5AD02B6
		// "Classifier::addSpecifiedEnd"
		specifiedEnd.add(specifiedEnd1);
		specifiedEnd1._linkSpecification(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecifiedEnd"));
		return;
		// -end- 33F0EFAD00AB add_body4551A5AD02B6 "Classifier::addSpecifiedEnd"
	}

	/**
	 * disconnect a SpecifiedEnd.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_head4551A5AD02B6
	// "Classifier::removeSpecifiedEnd"
	public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB remove_head4551A5AD02B6
	// "Classifier::removeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_body4551A5AD02B6
		// "Classifier::removeSpecifiedEnd"
		AssociationEnd ret = null;
		if (specifiedEnd1 == null || !specifiedEnd.contains(specifiedEnd1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = specifiedEnd1;
		specifiedEnd.remove(specifiedEnd1);
		specifiedEnd1._unlinkSpecification(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSpecifiedEnd"));
		return ret;
		// -end- 33F0EFAD00AB remove_body4551A5AD02B6
		// "Classifier::removeSpecifiedEnd"
	}

	/**
	 * tests if a given SpecifiedEnd is connected.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB test_head4551A5AD02B6
	// "Classifier::containsSpecifiedEnd"
	public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB test_head4551A5AD02B6
	// "Classifier::containsSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB test_body4551A5AD02B6
		// "Classifier::containsSpecifiedEnd"
		return specifiedEnd.contains(specifiedEnd1);
		// -end- 33F0EFAD00AB test_body4551A5AD02B6
		// "Classifier::containsSpecifiedEnd"
	}

	/**
	 * used to enumerate all connected SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB get_all_head4551A5AD02B6
	// "Classifier::iteratorSpecifiedEnd"
	public java.util.Iterator iteratorSpecifiedEnd()
	// -end- 33F0EFAD00AB get_all_head4551A5AD02B6
	// "Classifier::iteratorSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB get_all_body4551A5AD02B6
		// "Classifier::iteratorSpecifiedEnd"
		return specifiedEnd.iterator();
		// -end- 33F0EFAD00AB get_all_body4551A5AD02B6
		// "Classifier::iteratorSpecifiedEnd"
	}

	/**
	 * disconnect all SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_all_head4551A5AD02B6
	// "Classifier::clearSpecifiedEnd"
	public void clearSpecifiedEnd()
	// -end- 33F0EFAD00AB remove_all_head4551A5AD02B6
	// "Classifier::clearSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_all_body4551A5AD02B6
		// "Classifier::clearSpecifiedEnd"
		if (sizeSpecifiedEnd() > 0) {
			for (java.util.Iterator p = specifiedEnd.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkSpecification(this);
			}
			specifiedEnd.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecifiedEnd"));
		}
		// -end- 33F0EFAD00AB remove_all_body4551A5AD02B6
		// "Classifier::clearSpecifiedEnd"
	}

	/**
	 * returns the number of SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB size_head4551A5AD02B6
	// "Classifier::sizeSpecifiedEnd"
	public int sizeSpecifiedEnd()
	// -end- 33F0EFAD00AB size_head4551A5AD02B6 "Classifier::sizeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB size_body4551A5AD02B6
		// "Classifier::sizeSpecifiedEnd"
		return specifiedEnd.size();
		// -end- 33F0EFAD00AB size_body4551A5AD02B6
		// "Classifier::sizeSpecifiedEnd"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _link_body4551A5AD02B6
	// "Classifier::_linkSpecifiedEnd"
	public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.add(specifiedEnd1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecifiedEnd"));
		return;
	}
	// -end- 33F0EFAD00AB _link_body4551A5AD02B6 "Classifier::_linkSpecifiedEnd"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _unlink_body4551A5AD02B6
	// "Classifier::_unlinkSpecifiedEnd"
	public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.remove(specifiedEnd1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecifiedEnd"));
		return;
	}
	// -end- 33F0EFAD00AB _unlink_body4551A5AD02B6
	// "Classifier::_unlinkSpecifiedEnd"

	// -beg- preserve=no 36E96A87033E code4551A5AD02B6 "powertypeRange"
	private java.util.Set powertypeRange = new java.util.HashSet();
	// -end- 36E96A87033E code4551A5AD02B6 "powertypeRange"

	/**
	 * add a PowertypeRange.
	 *
	 * @see #removePowertypeRange
	 * @see #containsPowertypeRange
	 * @see #iteratorPowertypeRange
	 * @see #clearPowertypeRange
	 * @see #sizePowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E add_head4551A5AD02B6
	// "Classifier::addPowertypeRange"
	public void addPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E add_head4551A5AD02B6 "Classifier::addPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E add_body4551A5AD02B6
		// "Classifier::addPowertypeRange"
		powertypeRange.add(powertypeRange1);
		powertypeRange1._linkPowertype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addPowertypeRange"));
		return;
		// -end- 36E96A87033E add_body4551A5AD02B6
		// "Classifier::addPowertypeRange"
	}

	/**
	 * disconnect a PowertypeRange.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_head4551A5AD02B6
	// "Classifier::removePowertypeRange"
	public Generalization removePowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E remove_head4551A5AD02B6
	// "Classifier::removePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_body4551A5AD02B6
		// "Classifier::removePowertypeRange"
		Generalization ret = null;
		if (powertypeRange1 == null || !powertypeRange.contains(powertypeRange1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = powertypeRange1;
		powertypeRange.remove(powertypeRange1);
		powertypeRange1._unlinkPowertype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removePowertypeRange"));
		return ret;
		// -end- 36E96A87033E remove_body4551A5AD02B6
		// "Classifier::removePowertypeRange"
	}

	/**
	 * tests if a given PowertypeRange is connected.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E test_head4551A5AD02B6
	// "Classifier::containsPowertypeRange"
	public boolean containsPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E test_head4551A5AD02B6
	// "Classifier::containsPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E test_body4551A5AD02B6
		// "Classifier::containsPowertypeRange"
		return powertypeRange.contains(powertypeRange1);
		// -end- 36E96A87033E test_body4551A5AD02B6
		// "Classifier::containsPowertypeRange"
	}

	/**
	 * used to enumerate all connected PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E get_all_head4551A5AD02B6
	// "Classifier::iteratorPowertypeRange"
	public java.util.Iterator iteratorPowertypeRange()
	// -end- 36E96A87033E get_all_head4551A5AD02B6
	// "Classifier::iteratorPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E get_all_body4551A5AD02B6
		// "Classifier::iteratorPowertypeRange"
		return powertypeRange.iterator();
		// -end- 36E96A87033E get_all_body4551A5AD02B6
		// "Classifier::iteratorPowertypeRange"
	}

	/**
	 * disconnect all PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_all_head4551A5AD02B6
	// "Classifier::clearPowertypeRange"
	public void clearPowertypeRange()
	// -end- 36E96A87033E remove_all_head4551A5AD02B6
	// "Classifier::clearPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_all_body4551A5AD02B6
		// "Classifier::clearPowertypeRange"
		if (sizePowertypeRange() > 0) {
			for (java.util.Iterator p = powertypeRange.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkPowertype(this);
			}
			powertypeRange.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearPowertypeRange"));
		}
		// -end- 36E96A87033E remove_all_body4551A5AD02B6
		// "Classifier::clearPowertypeRange"
	}

	/**
	 * returns the number of PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E size_head4551A5AD02B6
	// "Classifier::sizePowertypeRange"
	public int sizePowertypeRange()
	// -end- 36E96A87033E size_head4551A5AD02B6 "Classifier::sizePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E size_body4551A5AD02B6
		// "Classifier::sizePowertypeRange"
		return powertypeRange.size();
		// -end- 36E96A87033E size_body4551A5AD02B6
		// "Classifier::sizePowertypeRange"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _link_body4551A5AD02B6
	// "Classifier::_linkPowertypeRange"
	public void _linkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.add(powertypeRange1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkPowertypeRange"));
		return;
	}
	// -end- 36E96A87033E _link_body4551A5AD02B6
	// "Classifier::_linkPowertypeRange"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _unlink_body4551A5AD02B6
	// "Classifier::_unlinkPowertypeRange"
	public void _unlinkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.remove(powertypeRange1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkPowertypeRange"));
		return;
	}
	// -end- 36E96A87033E _unlink_body4551A5AD02B6
	// "Classifier::_unlinkPowertypeRange"

	// -beg- preserve=no 335C14A5019A code4551A5AD02B6 "generalization"
	private java.util.Set generalization = new java.util.HashSet();
	// -end- 335C14A5019A code4551A5AD02B6 "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head4551A5AD02B6
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head4551A5AD02B6
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body4551A5AD02B6
		// "GeneralizableElement::addGeneralization"
		generalization.add(generalization1);
		generalization1._linkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addGeneralization"));
		return;
		// -end- 335C14A5019A add_body4551A5AD02B6
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head4551A5AD02B6
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head4551A5AD02B6
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body4551A5AD02B6
		// "GeneralizableElement::removeGeneralization"
		Generalization ret = null;
		if (generalization1 == null || !generalization.contains(generalization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = generalization1;
		generalization.remove(generalization1);
		generalization1._unlinkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeGeneralization"));
		return ret;
		// -end- 335C14A5019A remove_body4551A5AD02B6
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head4551A5AD02B6
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head4551A5AD02B6
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body4551A5AD02B6
		// "GeneralizableElement::containsGeneralization"
		return generalization.contains(generalization1);
		// -end- 335C14A5019A test_body4551A5AD02B6
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head4551A5AD02B6
	// "GeneralizableElement::iteratorGeneralization"
	public java.util.Iterator iteratorGeneralization()
	// -end- 335C14A5019A get_all_head4551A5AD02B6
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body4551A5AD02B6
		// "GeneralizableElement::iteratorGeneralization"
		return generalization.iterator();
		// -end- 335C14A5019A get_all_body4551A5AD02B6
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head4551A5AD02B6
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head4551A5AD02B6
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body4551A5AD02B6
		// "GeneralizableElement::clearGeneralization"
		if (sizeGeneralization() > 0) {
			for (java.util.Iterator p = generalization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkChild(this);
			}
			generalization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearGeneralization"));
		}
		// -end- 335C14A5019A remove_all_body4551A5AD02B6
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head4551A5AD02B6
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head4551A5AD02B6
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body4551A5AD02B6
		// "GeneralizableElement::sizeGeneralization"
		return generalization.size();
		// -end- 335C14A5019A size_body4551A5AD02B6
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body4551A5AD02B6
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		generalization.add(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _link_body4551A5AD02B6
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body4551A5AD02B6
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		generalization.remove(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _unlink_body4551A5AD02B6
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code4551A5AD02B6 "specialization"
	private java.util.Set specialization = new java.util.HashSet();
	// -end- 335C146B01D6 code4551A5AD02B6 "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head4551A5AD02B6
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head4551A5AD02B6
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body4551A5AD02B6
		// "GeneralizableElement::addSpecialization"
		specialization.add(specialization1);
		specialization1._linkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecialization"));
		return;
		// -end- 335C146B01D6 add_body4551A5AD02B6
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head4551A5AD02B6
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head4551A5AD02B6
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body4551A5AD02B6
		// "GeneralizableElement::removeSpecialization"
		Generalization ret = null;
		if (specialization1 == null || !specialization.contains(specialization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = specialization1;
		specialization.remove(specialization1);
		specialization1._unlinkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSpecialization"));
		return ret;
		// -end- 335C146B01D6 remove_body4551A5AD02B6
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head4551A5AD02B6
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head4551A5AD02B6
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body4551A5AD02B6
		// "GeneralizableElement::containsSpecialization"
		return specialization.contains(specialization1);
		// -end- 335C146B01D6 test_body4551A5AD02B6
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head4551A5AD02B6
	// "GeneralizableElement::iteratorSpecialization"
	public java.util.Iterator iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head4551A5AD02B6
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body4551A5AD02B6
		// "GeneralizableElement::iteratorSpecialization"
		return specialization.iterator();
		// -end- 335C146B01D6 get_all_body4551A5AD02B6
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head4551A5AD02B6
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head4551A5AD02B6
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body4551A5AD02B6
		// "GeneralizableElement::clearSpecialization"
		if (sizeSpecialization() > 0) {
			for (java.util.Iterator p = specialization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkParent(this);
			}
			specialization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecialization"));
		}
		// -end- 335C146B01D6 remove_all_body4551A5AD02B6
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head4551A5AD02B6
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head4551A5AD02B6
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body4551A5AD02B6
		// "GeneralizableElement::sizeSpecialization"
		return specialization.size();
		// -end- 335C146B01D6 size_body4551A5AD02B6
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body4551A5AD02B6
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		specialization.add(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _link_body4551A5AD02B6
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body4551A5AD02B6
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		specialization.remove(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _unlink_body4551A5AD02B6
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 327A877801CC var4551A5AD02B6 "isRoot"
	private boolean isRoot;
	// -end- 327A877801CC var4551A5AD02B6 "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head4551A5AD02B6 "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head4551A5AD02B6 "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body4551A5AD02B6 "isRoot"
		return isRoot;
		// -end- 327A877801CC get_body4551A5AD02B6 "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head4551A5AD02B6 "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head4551A5AD02B6 "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body4551A5AD02B6 "isRoot"
		if (isRoot != value1) {
			isRoot = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRoot"));
		}
		// -end- 327A877801CC set_body4551A5AD02B6 "isRoot"
	}

	// -beg- preserve=no 327A877E006E var4551A5AD02B6 "isLeaf"
	private boolean isLeaf;
	// -end- 327A877E006E var4551A5AD02B6 "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head4551A5AD02B6 "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head4551A5AD02B6 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body4551A5AD02B6 "isLeaf"
		return isLeaf;
		// -end- 327A877E006E get_body4551A5AD02B6 "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head4551A5AD02B6 "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head4551A5AD02B6 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body4551A5AD02B6 "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLeaf"));
		}
		// -end- 327A877E006E set_body4551A5AD02B6 "isLeaf"
	}

	// -beg- preserve=no 327A878400D2 var4551A5AD02B6 "isAbstract"
	private boolean isAbstract;
	// -end- 327A878400D2 var4551A5AD02B6 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 327A878400D2 get_head4551A5AD02B6 "isAbstract"
	public boolean isAbstract()
	// -end- 327A878400D2 get_head4551A5AD02B6 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 get_body4551A5AD02B6 "isAbstract"
		return isAbstract;
		// -end- 327A878400D2 get_body4551A5AD02B6 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 327A878400D2 set_head4551A5AD02B6 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 327A878400D2 set_head4551A5AD02B6 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 set_body4551A5AD02B6 "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 327A878400D2 set_body4551A5AD02B6 "isAbstract"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMetaAttrb(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551A5AD02B6 detail_end "UmlUseCase"

	// -end- 4551A5AD02B6 detail_end "UmlUseCase"

}
