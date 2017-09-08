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

// -beg- preserve=no 3940F1F903B2 package "GraphicDef"
package ch.ehi.interlis.graphicdescriptions;
// -end- 3940F1F903B2 package "GraphicDef"

// -beg- preserve=no 3940F1F903B2 autoimport "GraphicDef"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.interlis.views.ViewableDef;
import ch.ehi.interlis.logicalexpressions.Term;
import ch.ehi.interlis.graphicdescriptions.SignAttribute;
import ch.ehi.basics.types.NlsString;
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
// -end- 3940F1F903B2 autoimport "GraphicDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3940F1F903B2 import "GraphicDef"

// -end- 3940F1F903B2 import "GraphicDef"

/**
 * Definiert eine Grafikbeschreibung.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:54 $
 */
public class GraphicDef extends AbstractModelElement implements ModelElement, IliSyntax, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3940F1F903B2 detail_begin "GraphicDef"

	// -end- 3940F1F903B2 detail_begin "GraphicDef"

	private static final long serialVersionUID = -8190089131056234471L;

	// -beg- preserve=no 3D4FA219001D head3940F1F903B2 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA219001D head3940F1F903B2 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA219001D throws3940F1F903B2 "unlinkAll"

	// -end- 3D4FA219001D throws3940F1F903B2 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA219001D body3940F1F903B2 "unlinkAll"

		detachNamespace();
		// Role GraphicDef: GraphicDef object(s) may point to this
		detach_extends();
		detachBasedon();
		clearSelection();
		clearSignAttribute();
		detachExtended();
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
		// Role ParameterDefinition: TemplateParameter object(s) may point to
		// this
		clearStereotype();
		clearReferenceTag();
		clearImportedBy();
		// Role EditorTreeElement: EditorTreeElement object(s) may point to this
		setSyntax(null);
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA219001D body3940F1F903B2 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2190027 head3940F1F903B2 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2190027 head3940F1F903B2 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2190027 throws3940F1F903B2 "enumerateChildren"

	// -end- 3D4FA2190027 throws3940F1F903B2 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2190027 body3940F1F903B2 "enumerateChildren"
		java.util.Iterator it = null;
		if (contains_extends())
			visitor.visit(get_extends());
		if (containsBasedon())
			visitor.visit(getBasedon());
		it = iteratorSelection();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorSignAttribute();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getName());
		it = iteratorBehavior();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTaggedValue();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorTemplateParameter();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getSyntax());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2190027 body3940F1F903B2 "enumerateChildren"
	}

	// -beg- preserve=no 33598CAA030E code3940F1F903B2 "namespace"

	// -end- 33598CAA030E code3940F1F903B2 "namespace"

	/**
	 * attaches a Namespace. Designates the Namespace that contains the
	 * ModelElement.
	 * 
	 * @see #detachNamespace
	 * @see #getNamespace
	 * @see #containsNamespace
	 * @see #getNamespaceLink
	 * @see #createNamespaceLink
	 */
	// -beg- preserve=no 33598CAA030E attach_head3940F1F903B2
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head3940F1F903B2
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body3940F1F903B2
		// "ModelElement::attachNamespace"
		super.attachNamespace(namespace1);
		// -end- 33598CAA030E attach_body3940F1F903B2
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head3940F1F903B2
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head3940F1F903B2
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body3940F1F903B2
		// "ModelElement::attachNamespaceLink"
		super.attachNamespaceLink(namespace1);
		// -end- 33598CAA030E attachlink_body3940F1F903B2
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head3940F1F903B2
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head3940F1F903B2
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body3940F1F903B2
		// "ModelElement::detachNamespace"
		return super.detachNamespace();
		// -end- 33598CAA030E detach_body3940F1F903B2
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head3940F1F903B2
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head3940F1F903B2 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body3940F1F903B2
		// "ModelElement::getNamespace"
		return super.getNamespace();
		// -end- 33598CAA030E get_body3940F1F903B2 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head3940F1F903B2
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head3940F1F903B2
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body3940F1F903B2
		// "ModelElement::getNamespaceLink"
		return super.getNamespaceLink();
		// -end- 33598CAA030E getlink_body3940F1F903B2
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head3940F1F903B2
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head3940F1F903B2
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body3940F1F903B2
		// "ModelElement::createNamespaceLink"
		return super.createNamespaceLink();
		// -end- 33598CAA030E createlink_body3940F1F903B2
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head3940F1F903B2
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head3940F1F903B2
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body3940F1F903B2
		// "ModelElement::containsNamespace"
		return super.containsNamespace();
		// -end- 33598CAA030E test_body3940F1F903B2
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body3940F1F903B2
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		super._linkNamespace(namespace1);
	}
	// -end- 33598CAA030E _link_body3940F1F903B2 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body3940F1F903B2
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		super._unlinkNamespace(namespace1);
	}
	// -end- 33598CAA030E _unlink_body3940F1F903B2
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 3961F11D012E code3940F1F903B2 "_extends"
	private GraphicDef _extends;
	// -end- 3961F11D012E code3940F1F903B2 "_extends"

	/**
	 * attaches a _extends.
	 *
	 * @see #detach_extends
	 * @see #get_extends
	 * @see #contains_extends
	 */
	// -beg- preserve=no 3961F11D012E attach_head3940F1F903B2
	// "GraphicDef::attach_extends"
	public void attach_extends(GraphicDef _extends1)
	// -end- 3961F11D012E attach_head3940F1F903B2 "GraphicDef::attach_extends"
	{
		// -beg- preserve=no 3961F11D012E attach_body3940F1F903B2
		// "GraphicDef::attach_extends"
		if (_extends != null) {
			throw new java.lang.IllegalStateException("already a _extends attached");
		}
		if (_extends1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as _extends");
		}
		_extends = _extends1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attach_extends"));
		return;
		// -end- 3961F11D012E attach_body3940F1F903B2
		// "GraphicDef::attach_extends"
	}

	/**
	 * disconnect the currently attached _extends.
	 * 
	 * @see #attach_extends
	 */
	// -beg- preserve=no 3961F11D012E detach_head3940F1F903B2
	// "GraphicDef::detach_extends"
	public GraphicDef detach_extends()
	// -end- 3961F11D012E detach_head3940F1F903B2 "GraphicDef::detach_extends"
	{
		// -beg- preserve=no 3961F11D012E detach_body3940F1F903B2
		// "GraphicDef::detach_extends"
		GraphicDef ret = null;
		ret = _extends;
		_extends = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detach_extends"));
		return ret;
		// -end- 3961F11D012E detach_body3940F1F903B2
		// "GraphicDef::detach_extends"
	}

	/**
	 * get the currently attached _extends.
	 * 
	 * @see #attach_extends
	 */
	// -beg- preserve=no 3961F11D012E get_head3940F1F903B2
	// "GraphicDef::get_extends"
	public GraphicDef get_extends()
	// -end- 3961F11D012E get_head3940F1F903B2 "GraphicDef::get_extends"
	{
		// -beg- preserve=no 3961F11D012E get_body3940F1F903B2
		// "GraphicDef::get_extends"
		if (_extends == null) {
			throw new java.lang.IllegalStateException("no _extends attached");
		}
		return _extends;
		// -end- 3961F11D012E get_body3940F1F903B2 "GraphicDef::get_extends"
	}

	/**
	 * tests if there is a _extends attached.
	 * 
	 * @see #attach_extends
	 */
	// -beg- preserve=no 3961F11D012E test_head3940F1F903B2
	// "GraphicDef::contains_extends"
	public boolean contains_extends()
	// -end- 3961F11D012E test_head3940F1F903B2 "GraphicDef::contains_extends"
	{
		// -beg- preserve=no 3961F11D012E test_body3940F1F903B2
		// "GraphicDef::contains_extends"
		return _extends != null;
		// -end- 3961F11D012E test_body3940F1F903B2
		// "GraphicDef::contains_extends"
	}

	// -beg- preserve=no 3961F18902AE code3940F1F903B2 "basedon"
	private ViewableDef basedon;
	// -end- 3961F18902AE code3940F1F903B2 "basedon"

	/**
	 * attaches a Basedon.
	 *
	 * @see #detachBasedon
	 * @see #getBasedon
	 * @see #containsBasedon
	 */
	// -beg- preserve=no 3961F18902AE attach_head3940F1F903B2
	// "GraphicDef::attachBasedon"
	public void attachBasedon(ViewableDef basedon1)
	// -end- 3961F18902AE attach_head3940F1F903B2 "GraphicDef::attachBasedon"
	{
		// -beg- preserve=no 3961F18902AE attach_body3940F1F903B2
		// "GraphicDef::attachBasedon"
		if (basedon != null) {
			throw new java.lang.IllegalStateException("already a basedon attached");
		}
		if (basedon1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as basedon");
		}
		basedon = basedon1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachBasedon"));
		return;
		// -end- 3961F18902AE attach_body3940F1F903B2
		// "GraphicDef::attachBasedon"
	}

	/**
	 * disconnect the currently attached Basedon.
	 * 
	 * @see #attachBasedon
	 */
	// -beg- preserve=no 3961F18902AE detach_head3940F1F903B2
	// "GraphicDef::detachBasedon"
	public ViewableDef detachBasedon()
	// -end- 3961F18902AE detach_head3940F1F903B2 "GraphicDef::detachBasedon"
	{
		// -beg- preserve=no 3961F18902AE detach_body3940F1F903B2
		// "GraphicDef::detachBasedon"
		ViewableDef ret = null;
		ret = basedon;
		basedon = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachBasedon"));
		return ret;
		// -end- 3961F18902AE detach_body3940F1F903B2
		// "GraphicDef::detachBasedon"
	}

	/**
	 * get the currently attached Basedon.
	 * 
	 * @see #attachBasedon
	 */
	// -beg- preserve=no 3961F18902AE get_head3940F1F903B2
	// "GraphicDef::getBasedon"
	public ViewableDef getBasedon()
	// -end- 3961F18902AE get_head3940F1F903B2 "GraphicDef::getBasedon"
	{
		// -beg- preserve=no 3961F18902AE get_body3940F1F903B2
		// "GraphicDef::getBasedon"
		if (basedon == null) {
			throw new java.lang.IllegalStateException("no basedon attached");
		}
		return basedon;
		// -end- 3961F18902AE get_body3940F1F903B2 "GraphicDef::getBasedon"
	}

	/**
	 * tests if there is a Basedon attached.
	 * 
	 * @see #attachBasedon
	 */
	// -beg- preserve=no 3961F18902AE test_head3940F1F903B2
	// "GraphicDef::containsBasedon"
	public boolean containsBasedon()
	// -end- 3961F18902AE test_head3940F1F903B2 "GraphicDef::containsBasedon"
	{
		// -beg- preserve=no 3961F18902AE test_body3940F1F903B2
		// "GraphicDef::containsBasedon"
		return basedon != null;
		// -end- 3961F18902AE test_body3940F1F903B2
		// "GraphicDef::containsBasedon"
	}

	// -beg- preserve=no 3961F2380238 code3940F1F903B2 "selection"
	private java.util.Set selection = new java.util.HashSet();
	// -end- 3961F2380238 code3940F1F903B2 "selection"

	/**
	 * add a Selection.
	 *
	 * @see #removeSelection
	 * @see #containsSelection
	 * @see #iteratorSelection
	 * @see #clearSelection
	 * @see #sizeSelection
	 */
	// -beg- preserve=no 3961F2380238 add_head3940F1F903B2
	// "GraphicDef::addSelection"
	public void addSelection(Term selection1)
	// -end- 3961F2380238 add_head3940F1F903B2 "GraphicDef::addSelection"
	{
		// -beg- preserve=no 3961F2380238 add_body3940F1F903B2
		// "GraphicDef::addSelection"
		selection.add(selection1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSelection"));
		return;
		// -end- 3961F2380238 add_body3940F1F903B2 "GraphicDef::addSelection"
	}

	/**
	 * disconnect a Selection.
	 * 
	 * @see #addSelection
	 */
	// -beg- preserve=no 3961F2380238 remove_head3940F1F903B2
	// "GraphicDef::removeSelection"
	public Term removeSelection(Term selection1)
	// -end- 3961F2380238 remove_head3940F1F903B2 "GraphicDef::removeSelection"
	{
		// -beg- preserve=no 3961F2380238 remove_body3940F1F903B2
		// "GraphicDef::removeSelection"
		Term ret = null;
		if (selection1 == null || !selection.contains(selection1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = selection1;
		selection.remove(selection1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSelection"));
		return ret;
		// -end- 3961F2380238 remove_body3940F1F903B2
		// "GraphicDef::removeSelection"
	}

	/**
	 * tests if a given Selection is connected.
	 * 
	 * @see #addSelection
	 */
	// -beg- preserve=no 3961F2380238 test_head3940F1F903B2
	// "GraphicDef::containsSelection"
	public boolean containsSelection(Term selection1)
	// -end- 3961F2380238 test_head3940F1F903B2 "GraphicDef::containsSelection"
	{
		// -beg- preserve=no 3961F2380238 test_body3940F1F903B2
		// "GraphicDef::containsSelection"
		return selection.contains(selection1);
		// -end- 3961F2380238 test_body3940F1F903B2
		// "GraphicDef::containsSelection"
	}

	/**
	 * used to enumerate all connected Selections.
	 * 
	 * @see #addSelection
	 */
	// -beg- preserve=no 3961F2380238 get_all_head3940F1F903B2
	// "GraphicDef::iteratorSelection"
	public java.util.Iterator iteratorSelection()
	// -end- 3961F2380238 get_all_head3940F1F903B2
	// "GraphicDef::iteratorSelection"
	{
		// -beg- preserve=no 3961F2380238 get_all_body3940F1F903B2
		// "GraphicDef::iteratorSelection"
		return selection.iterator();
		// -end- 3961F2380238 get_all_body3940F1F903B2
		// "GraphicDef::iteratorSelection"
	}

	/**
	 * disconnect all Selections.
	 * 
	 * @see #addSelection
	 */
	// -beg- preserve=no 3961F2380238 remove_all_head3940F1F903B2
	// "GraphicDef::clearSelection"
	public void clearSelection()
	// -end- 3961F2380238 remove_all_head3940F1F903B2
	// "GraphicDef::clearSelection"
	{
		// -beg- preserve=no 3961F2380238 remove_all_body3940F1F903B2
		// "GraphicDef::clearSelection"
		if (sizeSelection() > 0) {
			selection.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSelection"));
		}
		// -end- 3961F2380238 remove_all_body3940F1F903B2
		// "GraphicDef::clearSelection"
	}

	/**
	 * returns the number of Selections.
	 * 
	 * @see #addSelection
	 */
	// -beg- preserve=no 3961F2380238 size_head3940F1F903B2
	// "GraphicDef::sizeSelection"
	public int sizeSelection()
	// -end- 3961F2380238 size_head3940F1F903B2 "GraphicDef::sizeSelection"
	{
		// -beg- preserve=no 3961F2380238 size_body3940F1F903B2
		// "GraphicDef::sizeSelection"
		return selection.size();
		// -end- 3961F2380238 size_body3940F1F903B2 "GraphicDef::sizeSelection"
	}

	// -beg- preserve=no 3961F2EC00ED code3940F1F903B2 "signAttribute"
	private java.util.Set signAttribute = new java.util.HashSet();
	// -end- 3961F2EC00ED code3940F1F903B2 "signAttribute"

	/**
	 * add a SignAttribute.
	 *
	 * @see #removeSignAttribute
	 * @see #containsSignAttribute
	 * @see #iteratorSignAttribute
	 * @see #clearSignAttribute
	 * @see #sizeSignAttribute
	 */
	// -beg- preserve=no 3961F2EC00ED add_head3940F1F903B2
	// "GraphicDef::addSignAttribute"
	public void addSignAttribute(SignAttribute signAttribute1)
	// -end- 3961F2EC00ED add_head3940F1F903B2 "GraphicDef::addSignAttribute"
	{
		// -beg- preserve=no 3961F2EC00ED add_body3940F1F903B2
		// "GraphicDef::addSignAttribute"
		signAttribute.add(signAttribute1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSignAttribute"));
		return;
		// -end- 3961F2EC00ED add_body3940F1F903B2
		// "GraphicDef::addSignAttribute"
	}

	/**
	 * disconnect a SignAttribute.
	 * 
	 * @see #addSignAttribute
	 */
	// -beg- preserve=no 3961F2EC00ED remove_head3940F1F903B2
	// "GraphicDef::removeSignAttribute"
	public SignAttribute removeSignAttribute(SignAttribute signAttribute1)
	// -end- 3961F2EC00ED remove_head3940F1F903B2
	// "GraphicDef::removeSignAttribute"
	{
		// -beg- preserve=no 3961F2EC00ED remove_body3940F1F903B2
		// "GraphicDef::removeSignAttribute"
		SignAttribute ret = null;
		if (signAttribute1 == null || !signAttribute.contains(signAttribute1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = signAttribute1;
		signAttribute.remove(signAttribute1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSignAttribute"));
		return ret;
		// -end- 3961F2EC00ED remove_body3940F1F903B2
		// "GraphicDef::removeSignAttribute"
	}

	/**
	 * tests if a given SignAttribute is connected.
	 * 
	 * @see #addSignAttribute
	 */
	// -beg- preserve=no 3961F2EC00ED test_head3940F1F903B2
	// "GraphicDef::containsSignAttribute"
	public boolean containsSignAttribute(SignAttribute signAttribute1)
	// -end- 3961F2EC00ED test_head3940F1F903B2
	// "GraphicDef::containsSignAttribute"
	{
		// -beg- preserve=no 3961F2EC00ED test_body3940F1F903B2
		// "GraphicDef::containsSignAttribute"
		return signAttribute.contains(signAttribute1);
		// -end- 3961F2EC00ED test_body3940F1F903B2
		// "GraphicDef::containsSignAttribute"
	}

	/**
	 * used to enumerate all connected SignAttributes.
	 * 
	 * @see #addSignAttribute
	 */
	// -beg- preserve=no 3961F2EC00ED get_all_head3940F1F903B2
	// "GraphicDef::iteratorSignAttribute"
	public java.util.Iterator iteratorSignAttribute()
	// -end- 3961F2EC00ED get_all_head3940F1F903B2
	// "GraphicDef::iteratorSignAttribute"
	{
		// -beg- preserve=no 3961F2EC00ED get_all_body3940F1F903B2
		// "GraphicDef::iteratorSignAttribute"
		return signAttribute.iterator();
		// -end- 3961F2EC00ED get_all_body3940F1F903B2
		// "GraphicDef::iteratorSignAttribute"
	}

	/**
	 * disconnect all SignAttributes.
	 * 
	 * @see #addSignAttribute
	 */
	// -beg- preserve=no 3961F2EC00ED remove_all_head3940F1F903B2
	// "GraphicDef::clearSignAttribute"
	public void clearSignAttribute()
	// -end- 3961F2EC00ED remove_all_head3940F1F903B2
	// "GraphicDef::clearSignAttribute"
	{
		// -beg- preserve=no 3961F2EC00ED remove_all_body3940F1F903B2
		// "GraphicDef::clearSignAttribute"
		if (sizeSignAttribute() > 0) {
			signAttribute.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSignAttribute"));
		}
		// -end- 3961F2EC00ED remove_all_body3940F1F903B2
		// "GraphicDef::clearSignAttribute"
	}

	/**
	 * returns the number of SignAttributes.
	 * 
	 * @see #addSignAttribute
	 */
	// -beg- preserve=no 3961F2EC00ED size_head3940F1F903B2
	// "GraphicDef::sizeSignAttribute"
	public int sizeSignAttribute()
	// -end- 3961F2EC00ED size_head3940F1F903B2 "GraphicDef::sizeSignAttribute"
	{
		// -beg- preserve=no 3961F2EC00ED size_body3940F1F903B2
		// "GraphicDef::sizeSignAttribute"
		return signAttribute.size();
		// -end- 3961F2EC00ED size_body3940F1F903B2
		// "GraphicDef::sizeSignAttribute"
	}

	// -beg- preserve=no 398033D5028C code3940F1F903B2 "extended"
	private GraphicDef extended;
	// -end- 398033D5028C code3940F1F903B2 "extended"

	/**
	 * attaches a Extended.
	 *
	 * @see #detachExtended
	 * @see #getExtended
	 * @see #containsExtended
	 */
	// -beg- preserve=no 398033D5028C attach_head3940F1F903B2
	// "GraphicDef::attachExtended"
	public void attachExtended(GraphicDef extended1)
	// -end- 398033D5028C attach_head3940F1F903B2 "GraphicDef::attachExtended"
	{
		// -beg- preserve=no 398033D5028C attach_body3940F1F903B2
		// "GraphicDef::attachExtended"
		if (extended != null) {
			throw new java.lang.IllegalStateException("already a extended attached");
		}
		if (extended1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as extended");
		}
		extended = extended1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachExtended"));
		return;
		// -end- 398033D5028C attach_body3940F1F903B2
		// "GraphicDef::attachExtended"
	}

	/**
	 * disconnect the currently attached Extended.
	 * 
	 * @see #attachExtended
	 */
	// -beg- preserve=no 398033D5028C detach_head3940F1F903B2
	// "GraphicDef::detachExtended"
	public GraphicDef detachExtended()
	// -end- 398033D5028C detach_head3940F1F903B2 "GraphicDef::detachExtended"
	{
		// -beg- preserve=no 398033D5028C detach_body3940F1F903B2
		// "GraphicDef::detachExtended"
		GraphicDef ret = null;
		ret = extended;
		extended = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachExtended"));
		return ret;
		// -end- 398033D5028C detach_body3940F1F903B2
		// "GraphicDef::detachExtended"
	}

	/**
	 * get the currently attached Extended.
	 * 
	 * @see #attachExtended
	 */
	// -beg- preserve=no 398033D5028C get_head3940F1F903B2
	// "GraphicDef::getExtended"
	public GraphicDef getExtended()
	// -end- 398033D5028C get_head3940F1F903B2 "GraphicDef::getExtended"
	{
		// -beg- preserve=no 398033D5028C get_body3940F1F903B2
		// "GraphicDef::getExtended"
		if (extended == null) {
			throw new java.lang.IllegalStateException("no extended attached");
		}
		return extended;
		// -end- 398033D5028C get_body3940F1F903B2 "GraphicDef::getExtended"
	}

	/**
	 * tests if there is a Extended attached.
	 * 
	 * @see #attachExtended
	 */
	// -beg- preserve=no 398033D5028C test_head3940F1F903B2
	// "GraphicDef::containsExtended"
	public boolean containsExtended()
	// -end- 398033D5028C test_head3940F1F903B2 "GraphicDef::containsExtended"
	{
		// -beg- preserve=no 398033D5028C test_body3940F1F903B2
		// "GraphicDef::containsExtended"
		return extended != null;
		// -end- 398033D5028C test_body3940F1F903B2
		// "GraphicDef::containsExtended"
	}

	// -beg- preserve=no 3961F0F702FF var3940F1F903B2 "name"

	// -end- 3961F0F702FF var3940F1F903B2 "name"

	/**
	 * get current value of name Name der Grafikbeschreibung.
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 3961F0F702FF get_head3940F1F903B2 "name"
	public NlsString getName()
	// -end- 3961F0F702FF get_head3940F1F903B2 "name"
	{
		// -beg- preserve=no 3961F0F702FF get_body3940F1F903B2 "name"
		return super.getName();
		// -end- 3961F0F702FF get_body3940F1F903B2 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 3961F0F702FF set_head3940F1F903B2 "name"
	public void setName(NlsString value1)
	// -end- 3961F0F702FF set_head3940F1F903B2 "name"
	{
		// -beg- preserve=no 3961F0F702FF set_body3940F1F903B2 "name"
		super.setName(value1);
		// -end- 3961F0F702FF set_body3940F1F903B2 "name"
	}

	// -beg- preserve=no 3961F0FB0278 var3940F1F903B2 "properties"
	private long properties;
	// -end- 3961F0FB0278 var3940F1F903B2 "properties"

	/**
	 * get current value of properties Vererbungseigenschaften.
	 * 
	 * @see #setProperties
	 */
	// -beg- preserve=no 3961F0FB0278 get_head3940F1F903B2 "properties"
	public long getProperties()
	// -end- 3961F0FB0278 get_head3940F1F903B2 "properties"
	{
		// -beg- preserve=no 3961F0FB0278 get_body3940F1F903B2 "properties"
		return properties;
		// -end- 3961F0FB0278 get_body3940F1F903B2 "properties"
	}

	/**
	 * set current value of properties
	 * 
	 * @see #getProperties
	 */
	// -beg- preserve=no 3961F0FB0278 set_head3940F1F903B2 "properties"
	public void setProperties(long value1)
	// -end- 3961F0FB0278 set_head3940F1F903B2 "properties"
	{
		// -beg- preserve=no 3961F0FB0278 set_body3940F1F903B2 "properties"
		if (properties != value1) {
			properties = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setProperties"));
		}
		// -end- 3961F0FB0278 set_body3940F1F903B2 "properties"
	}

	// -beg- preserve=no 3C8F5ABE022D var3940F1F903B2 "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var3940F1F903B2 "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head3940F1F903B2 "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head3940F1F903B2 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body3940F1F903B2 "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body3940F1F903B2 "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head3940F1F903B2 "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head3940F1F903B2 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body3940F1F903B2 "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body3940F1F903B2 "syntax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3940F1F903B2 detail_end "GraphicDef"

	// -end- 3940F1F903B2 detail_end "GraphicDef"

}
