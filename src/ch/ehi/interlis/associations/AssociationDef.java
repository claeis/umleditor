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

// -beg- preserve=no 3C178E4F0366 package "AssociationDef"
package ch.ehi.interlis.associations;
// -end- 3C178E4F0366 package "AssociationDef"

// -beg- preserve=no 3C178E4F0366 autoimport "AssociationDef"
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.uml1_4.foundation.core.AssociationClass;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.datatypes.Multiplicity;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.behaviour.collaborations.AssociationRole;
import ch.ehi.uml1_4.behaviour.commonbehavior.Link;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
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
import ch.ehi.basics.types.NlsString;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.umleditor.umlpresentation.Diagram;
// -end- 3C178E4F0366 autoimport "AssociationDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3C178E4F0366 import "AssociationDef"
import ch.ehi.interlis.tools.RoleDefUtility;
// -end- 3C178E4F0366 import "AssociationDef"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.3 $ $Date: 2006-06-13 14:24:14 $
 */
public class AssociationDef extends AbstractClassDef implements AssociationClass, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C178E4F0366 detail_begin "AssociationDef"

	// -end- 3C178E4F0366 detail_begin "AssociationDef"

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 3CE4FD180081 head3C178E4F0366 "getValidOwnedElements"
	public String[] getValidOwnedElements()
	// -end- 3CE4FD180081 head3C178E4F0366 "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CE4FD180081 throws3C178E4F0366 "getValidOwnedElements"

	// -end- 3CE4FD180081 throws3C178E4F0366 "getValidOwnedElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CE4FD180081 body3C178E4F0366
		// "getValidOwnedElements"
		String ret[] = { "ch.ehi.interlis.attributes.AttributeDef" };
		return ret;
		// -end- 3CE4FD180081 body3C178E4F0366 "getValidOwnedElements"
	}

	// -beg- preserve=no 3D4FA21C002C head3C178E4F0366 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21C002C head3C178E4F0366 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21C002C throws3C178E4F0366 "unlinkAll"

	// -end- 3D4FA21C002C throws3C178E4F0366 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21C002C body3C178E4F0366 "unlinkAll"

		detachNamespace();
		clearConnection();
		clearClientDependency();
		setMultiplicity(null);
		clearAssociationRole();
		clearLink();
		clearPresentation();
		clearGeneralization();
		clearSpecialization();
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
		clearBehavior();
		clearPartition();
		clearCollaborationInstanceSet();
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
		clearOwnedElement();
		clearDiagram();
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA21C002C body3C178E4F0366 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21C0040 head3C178E4F0366 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21C0040 head3C178E4F0366 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21C0040 throws3C178E4F0366 "enumerateChildren"

	// -end- 3D4FA21C0040 throws3C178E4F0366 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21C0040 body3C178E4F0366 "enumerateChildren"
		java.util.Iterator it = null;
		it = iteratorConnection();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getMultiplicity());
		it = iteratorFeature();
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
		it = iteratorOwnedElement();
		while (it.hasNext())
			visitor.visit(it.next());
		it = iteratorDiagram();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21C0040 body3C178E4F0366 "enumerateChildren"
	}

	/**
	 * tests if this association represents an Interlis structure attribute
	 */
	// -beg- preserve=no 3D6F993E0352 head3C178E4F0366 "isStructureAttribute"
	public boolean isStructureAttribute()
	// -end- 3D6F993E0352 head3C178E4F0366 "isStructureAttribute"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D6F993E0352 throws3C178E4F0366 "isStructureAttribute"

	// -end- 3D6F993E0352 throws3C178E4F0366 "isStructureAttribute"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D6F993E0352 body3C178E4F0366
		// "isStructureAttribute"
		java.util.Iterator rolei = iteratorConnection();
		while (rolei.hasNext()) {
			RoleDef role = (RoleDef) rolei.next();
			if (RoleDefUtility.isIliStructAttr(role)) {
				return true;
			}
		}
		return false;
		// -end- 3D6F993E0352 body3C178E4F0366 "isStructureAttribute"
	}

	/**
	 * tests if this association represents an Interlis refernce attribute
	 */
	// -beg- preserve=no 3D6F9951007E head3C178E4F0366 "isReferenceAttribute"
	public boolean isReferenceAttribute()
	// -end- 3D6F9951007E head3C178E4F0366 "isReferenceAttribute"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D6F9951007E throws3C178E4F0366 "isReferenceAttribute"

	// -end- 3D6F9951007E throws3C178E4F0366 "isReferenceAttribute"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D6F9951007E body3C178E4F0366
		// "isReferenceAttribute"
		java.util.Iterator rolei = iteratorConnection();
		while (rolei.hasNext()) {
			RoleDef role = (RoleDef) rolei.next();
			if (RoleDefUtility.isIliRefAttr(role)) {
				return true;
			}
		}
		return false;
		// -end- 3D6F9951007E body3C178E4F0366 "isReferenceAttribute"
	}

	// -beg- preserve=no 3E42921400A6 head3C178E4F0366 "deepRemoveConnection"
	public void deepRemoveConnection(AssociationEnd connection1)
	// -end- 3E42921400A6 head3C178E4F0366 "deepRemoveConnection"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E42921400A6 throws3C178E4F0366 "deepRemoveConnection"

	// -end- 3E42921400A6 throws3C178E4F0366 "deepRemoveConnection"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E42921400A6 body3C178E4F0366
		// "deepRemoveConnection"
		ch.ehi.interlis.tools.UnlinkAllChildren remover = new ch.ehi.interlis.tools.UnlinkAllChildren();
		remover.visit(connection1);
		remover.unlinkThem();
		// -end- 3E42921400A6 body3C178E4F0366 "deepRemoveConnection"
	}

	// -beg- preserve=no 33598CAA030E code3C178E4F0366 "namespace"

	// -end- 33598CAA030E code3C178E4F0366 "namespace"

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
	// -beg- preserve=no 33598CAA030E attach_head3C178E4F0366
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head3C178E4F0366
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body3C178E4F0366
		// "ModelElement::attachNamespace"
		super.attachNamespace(namespace1);
		// -end- 33598CAA030E attach_body3C178E4F0366
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head3C178E4F0366
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head3C178E4F0366
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body3C178E4F0366
		// "ModelElement::attachNamespaceLink"
		super.attachNamespaceLink(namespace1);
		// -end- 33598CAA030E attachlink_body3C178E4F0366
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head3C178E4F0366
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head3C178E4F0366
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body3C178E4F0366
		// "ModelElement::detachNamespace"
		return super.detachNamespace();
		// -end- 33598CAA030E detach_body3C178E4F0366
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head3C178E4F0366
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head3C178E4F0366 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body3C178E4F0366
		// "ModelElement::getNamespace"
		return super.getNamespace();
		// -end- 33598CAA030E get_body3C178E4F0366 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head3C178E4F0366
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head3C178E4F0366
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body3C178E4F0366
		// "ModelElement::getNamespaceLink"
		return super.getNamespaceLink();
		// -end- 33598CAA030E getlink_body3C178E4F0366
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head3C178E4F0366
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head3C178E4F0366
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body3C178E4F0366
		// "ModelElement::createNamespaceLink"
		return super.createNamespaceLink();
		// -end- 33598CAA030E createlink_body3C178E4F0366
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head3C178E4F0366
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head3C178E4F0366
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body3C178E4F0366
		// "ModelElement::containsNamespace"
		return super.containsNamespace();
		// -end- 33598CAA030E test_body3C178E4F0366
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body3C178E4F0366
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		super._linkNamespace(namespace1);
	}
	// -end- 33598CAA030E _link_body3C178E4F0366 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body3C178E4F0366
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		super._unlinkNamespace(namespace1);
	}
	// -end- 33598CAA030E _unlink_body3C178E4F0366
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 32A2A510017A code3C178E4F0366 "connection"
	private java.util.List connection = new java.util.ArrayList();
	// -end- 32A2A510017A code3C178E4F0366 "connection"

	/**
	 * add a Connection.
	 *
	 * @see #removeConnection
	 * @see #containsConnection
	 * @see #iteratorConnection
	 * @see #clearConnection
	 * @see #sizeConnection
	 */
	// -beg- preserve=no 32A2A510017A add_head3C178E4F0366
	// "Association::addConnection"
	public void addConnection(AssociationEnd connection1)
	// -end- 32A2A510017A add_head3C178E4F0366 "Association::addConnection"
	{
		// -beg- preserve=no 32A2A510017A add_body3C178E4F0366
		// "Association::addConnection"
		connection.add(connection1);
		connection1._linkAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addConnection"));
		return;
		// -end- 32A2A510017A add_body3C178E4F0366 "Association::addConnection"
	}

	// -beg- preserve=no 32A2A510017A add2_head3C178E4F0366
	// "Association::add2Connection"
	public void addConnection(int index, AssociationEnd connection1)
	// -end- 32A2A510017A add2_head3C178E4F0366 "Association::add2Connection"
	{
		// -beg- preserve=no 32A2A510017A add2_body3C178E4F0366
		// "Association::add2Connection"
		connection.add(index, connection1);
		connection1._linkAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addConnection"));
		return;
		// -end- 32A2A510017A add2_body3C178E4F0366
		// "Association::add2Connection"
	}

	/**
	 * disconnect a Connection.
	 * 
	 * @see #addConnection
	 */
	// -beg- preserve=no 32A2A510017A remove_head3C178E4F0366
	// "Association::removeConnection"
	public AssociationEnd removeConnection(AssociationEnd connection1)
	// -end- 32A2A510017A remove_head3C178E4F0366
	// "Association::removeConnection"
	{
		// -beg- preserve=no 32A2A510017A remove_body3C178E4F0366
		// "Association::removeConnection"
		AssociationEnd ret = null;
		if (connection1 == null || !connection.contains(connection1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = connection1;
		connection.remove(connection1);
		connection1._unlinkAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeConnection"));
		return ret;
		// -end- 32A2A510017A remove_body3C178E4F0366
		// "Association::removeConnection"
	}

	/**
	 * disconnect a Connection.
	 * 
	 * @see #addConnection
	 */
	// -beg- preserve=no 32A2A510017A remove2_head3C178E4F0366
	// "Association::remove2Connection"
	public AssociationEnd removeConnection(int index)
	// -end- 32A2A510017A remove2_head3C178E4F0366
	// "Association::remove2Connection"
	{
		// -beg- preserve=no 32A2A510017A remove2_body3C178E4F0366
		// "Association::remove2Connection"
		AssociationEnd ret = null;
		ret = (AssociationEnd) connection.remove(index);
		ret._unlinkAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeConnection"));
		return ret;
		// -end- 32A2A510017A remove2_body3C178E4F0366
		// "Association::remove2Connection"
	}

	/**
	 * change a Connection.
	 * 
	 * @see #addConnection
	 */
	// -beg- preserve=no 32A2A510017A set_head3C178E4F0366
	// "Association::setConnection"
	public AssociationEnd setConnection(int index, AssociationEnd connection1)
	// -end- 32A2A510017A set_head3C178E4F0366 "Association::setConnection"
	{
		// -beg- preserve=no 32A2A510017A set_body3C178E4F0366
		// "Association::setConnection"
		AssociationEnd ret = null;
		ret = (AssociationEnd) connection.set(index, connection1);
		ret._unlinkAssociation(this);
		connection1._linkAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setConnection"));
		return ret;
		// -end- 32A2A510017A set_body3C178E4F0366 "Association::setConnection"
	}

	/**
	 * tests if a given Connection is connected.
	 * 
	 * @see #addConnection
	 */
	// -beg- preserve=no 32A2A510017A test_head3C178E4F0366
	// "Association::containsConnection"
	public boolean containsConnection(AssociationEnd connection1)
	// -end- 32A2A510017A test_head3C178E4F0366
	// "Association::containsConnection"
	{
		// -beg- preserve=no 32A2A510017A test_body3C178E4F0366
		// "Association::containsConnection"
		return connection.contains(connection1);
		// -end- 32A2A510017A test_body3C178E4F0366
		// "Association::containsConnection"
	}

	/**
	 * used to enumerate all connected Connections.
	 * 
	 * @see #addConnection
	 */
	// -beg- preserve=no 32A2A510017A get_all_head3C178E4F0366
	// "Association::iteratorConnection"
	public java.util.Iterator iteratorConnection()
	// -end- 32A2A510017A get_all_head3C178E4F0366
	// "Association::iteratorConnection"
	{
		// -beg- preserve=no 32A2A510017A get_all_body3C178E4F0366
		// "Association::iteratorConnection"
		return connection.iterator();
		// -end- 32A2A510017A get_all_body3C178E4F0366
		// "Association::iteratorConnection"
	}

	/**
	 * disconnect all Connections.
	 * 
	 * @see #addConnection
	 */
	// -beg- preserve=no 32A2A510017A remove_all_head3C178E4F0366
	// "Association::clearConnection"
	public void clearConnection()
	// -end- 32A2A510017A remove_all_head3C178E4F0366
	// "Association::clearConnection"
	{
		// -beg- preserve=no 32A2A510017A remove_all_body3C178E4F0366
		// "Association::clearConnection"
		if (sizeConnection() > 0) {
			for (java.util.Iterator p = connection.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkAssociation(this);
			}
			connection.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearConnection"));
		}
		// -end- 32A2A510017A remove_all_body3C178E4F0366
		// "Association::clearConnection"
	}

	/**
	 * returns the number of Connections.
	 * 
	 * @see #addConnection
	 */
	// -beg- preserve=no 32A2A510017A size_head3C178E4F0366
	// "Association::sizeConnection"
	public int sizeConnection()
	// -end- 32A2A510017A size_head3C178E4F0366 "Association::sizeConnection"
	{
		// -beg- preserve=no 32A2A510017A size_body3C178E4F0366
		// "Association::sizeConnection"
		return connection.size();
		// -end- 32A2A510017A size_body3C178E4F0366
		// "Association::sizeConnection"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32A2A510017A _link_body3C178E4F0366
	// "Association::_linkConnection"
	public void _linkConnection(AssociationEnd connection1) {
		connection.add(connection1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkConnection"));
		return;
	}
	// -end- 32A2A510017A _link_body3C178E4F0366 "Association::_linkConnection"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32A2A510017A _unlink_body3C178E4F0366
	// "Association::_unlinkConnection"
	public void _unlinkConnection(AssociationEnd connection1) {
		connection.remove(connection1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkConnection"));
		return;
	}
	// -end- 32A2A510017A _unlink_body3C178E4F0366
	// "Association::_unlinkConnection"

	// -beg- preserve=no 33FFE57B0395 code3C178E4F0366 "clientDependency"

	// -end- 33FFE57B0395 code3C178E4F0366 "clientDependency"

	/**
	 * add a ClientDependency.
	 *
	 * @see #removeClientDependency
	 * @see #containsClientDependency
	 * @see #iteratorClientDependency
	 * @see #clearClientDependency
	 * @see #sizeClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 add_head3C178E4F0366
	// "ModelElement::addClientDependency"
	public void addClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 add_head3C178E4F0366
	// "ModelElement::addClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 add_body3C178E4F0366
		// "ModelElement::addClientDependency"
		super.addClientDependency(clientDependency1);
		// -end- 33FFE57B0395 add_body3C178E4F0366
		// "ModelElement::addClientDependency"
	}

	/**
	 * disconnect a ClientDependency.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 remove_head3C178E4F0366
	// "ModelElement::removeClientDependency"
	public Dependency removeClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 remove_head3C178E4F0366
	// "ModelElement::removeClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 remove_body3C178E4F0366
		// "ModelElement::removeClientDependency"
		return super.removeClientDependency(clientDependency1);
		// -end- 33FFE57B0395 remove_body3C178E4F0366
		// "ModelElement::removeClientDependency"
	}

	/**
	 * tests if a given ClientDependency is connected.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 test_head3C178E4F0366
	// "ModelElement::containsClientDependency"
	public boolean containsClientDependency(Dependency clientDependency1)
	// -end- 33FFE57B0395 test_head3C178E4F0366
	// "ModelElement::containsClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 test_body3C178E4F0366
		// "ModelElement::containsClientDependency"
		return super.containsClientDependency(clientDependency1);
		// -end- 33FFE57B0395 test_body3C178E4F0366
		// "ModelElement::containsClientDependency"
	}

	/**
	 * used to enumerate all connected ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 get_all_head3C178E4F0366
	// "ModelElement::iteratorClientDependency"
	public java.util.Iterator iteratorClientDependency()
	// -end- 33FFE57B0395 get_all_head3C178E4F0366
	// "ModelElement::iteratorClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 get_all_body3C178E4F0366
		// "ModelElement::iteratorClientDependency"
		return super.iteratorClientDependency();
		// -end- 33FFE57B0395 get_all_body3C178E4F0366
		// "ModelElement::iteratorClientDependency"
	}

	/**
	 * disconnect all ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 remove_all_head3C178E4F0366
	// "ModelElement::clearClientDependency"
	public void clearClientDependency()
	// -end- 33FFE57B0395 remove_all_head3C178E4F0366
	// "ModelElement::clearClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 remove_all_body3C178E4F0366
		// "ModelElement::clearClientDependency"
		super.clearClientDependency();
		// -end- 33FFE57B0395 remove_all_body3C178E4F0366
		// "ModelElement::clearClientDependency"
	}

	/**
	 * returns the number of ClientDependencys.
	 * 
	 * @see #addClientDependency
	 */
	// -beg- preserve=no 33FFE57B0395 size_head3C178E4F0366
	// "ModelElement::sizeClientDependency"
	public int sizeClientDependency()
	// -end- 33FFE57B0395 size_head3C178E4F0366
	// "ModelElement::sizeClientDependency"
	{
		// -beg- preserve=no 33FFE57B0395 size_body3C178E4F0366
		// "ModelElement::sizeClientDependency"
		return super.sizeClientDependency();
		// -end- 33FFE57B0395 size_body3C178E4F0366
		// "ModelElement::sizeClientDependency"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B0395 _link_body3C178E4F0366
	// "ModelElement::_linkClientDependency"
	public void _linkClientDependency(Dependency clientDependency1) {
		super._linkClientDependency(clientDependency1);
	}
	// -end- 33FFE57B0395 _link_body3C178E4F0366
	// "ModelElement::_linkClientDependency"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33FFE57B0395 _unlink_body3C178E4F0366
	// "ModelElement::_unlinkClientDependency"
	public void _unlinkClientDependency(Dependency clientDependency1) {
		super._unlinkClientDependency(clientDependency1);
	}
	// -end- 33FFE57B0395 _unlink_body3C178E4F0366
	// "ModelElement::_unlinkClientDependency"

	// -beg- preserve=no 4489319D0169 var3C178E4F0366 "propOid"
	private boolean propOid;
	// -end- 4489319D0169 var3C178E4F0366 "propOid"

	/**
	 * get current value of propOid
	 * 
	 * @see #setPropOid
	 */
	// -beg- preserve=no 4489319D0169 get_head3C178E4F0366 "propOid"
	public boolean isPropOid()
	// -end- 4489319D0169 get_head3C178E4F0366 "propOid"
	{
		// -beg- preserve=no 4489319D0169 get_body3C178E4F0366 "propOid"
		return propOid;
		// -end- 4489319D0169 get_body3C178E4F0366 "propOid"
	}

	/**
	 * set current value of propOid
	 * 
	 * @see #isPropOid
	 */
	// -beg- preserve=no 4489319D0169 set_head3C178E4F0366 "propOid"
	public void setPropOid(boolean value1)
	// -end- 4489319D0169 set_head3C178E4F0366 "propOid"
	{
		// -beg- preserve=no 4489319D0169 set_body3C178E4F0366 "propOid"
		if (propOid != value1) {
			propOid = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setPropOid"));
		}
		// -end- 4489319D0169 set_body3C178E4F0366 "propOid"
	}

	// -beg- preserve=no 4489325501C8 var3C178E4F0366 "multiplicity"
	private Multiplicity multiplicity = null;
	// -end- 4489325501C8 var3C178E4F0366 "multiplicity"

	/**
	 * get current value of multiplicity
	 * 
	 * @see #setMultiplicity
	 */
	// -beg- preserve=no 4489325501C8 get_head3C178E4F0366 "multiplicity"
	public Multiplicity getMultiplicity()
	// -end- 4489325501C8 get_head3C178E4F0366 "multiplicity"
	{
		// -beg- preserve=no 4489325501C8 get_body3C178E4F0366 "multiplicity"
		return multiplicity;
		// -end- 4489325501C8 get_body3C178E4F0366 "multiplicity"
	}

	/**
	 * set current value of multiplicity
	 * 
	 * @see #getMultiplicity
	 */
	// -beg- preserve=no 4489325501C8 set_head3C178E4F0366 "multiplicity"
	public void setMultiplicity(Multiplicity value1)
	// -end- 4489325501C8 set_head3C178E4F0366 "multiplicity"
	{
		// -beg- preserve=no 4489325501C8 set_body3C178E4F0366 "multiplicity"
		if (multiplicity != value1 && (multiplicity == null || !multiplicity.equals(value1))) {
			multiplicity = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMultiplicity"));
		}
		// -end- 4489325501C8 set_body3C178E4F0366 "multiplicity"
	}

	// -beg- preserve=no 33CD51170096 code3C178E4F0366 "associationRole"
	private java.util.Set associationRole = new java.util.HashSet();
	// -end- 33CD51170096 code3C178E4F0366 "associationRole"

	/**
	 * add a AssociationRole.
	 *
	 * @see #removeAssociationRole
	 * @see #containsAssociationRole
	 * @see #iteratorAssociationRole
	 * @see #clearAssociationRole
	 * @see #sizeAssociationRole
	 */
	// -beg- preserve=no 33CD51170096 add_head3C178E4F0366
	// "Association::addAssociationRole"
	public void addAssociationRole(AssociationRole associationRole1)
	// -end- 33CD51170096 add_head3C178E4F0366 "Association::addAssociationRole"
	{
		// -beg- preserve=no 33CD51170096 add_body3C178E4F0366
		// "Association::addAssociationRole"
		associationRole.add(associationRole1);
		associationRole1._linkBase(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAssociationRole"));
		return;
		// -end- 33CD51170096 add_body3C178E4F0366
		// "Association::addAssociationRole"
	}

	/**
	 * disconnect a AssociationRole.
	 * 
	 * @see #addAssociationRole
	 */
	// -beg- preserve=no 33CD51170096 remove_head3C178E4F0366
	// "Association::removeAssociationRole"
	public AssociationRole removeAssociationRole(AssociationRole associationRole1)
	// -end- 33CD51170096 remove_head3C178E4F0366
	// "Association::removeAssociationRole"
	{
		// -beg- preserve=no 33CD51170096 remove_body3C178E4F0366
		// "Association::removeAssociationRole"
		AssociationRole ret = null;
		if (associationRole1 == null || !associationRole.contains(associationRole1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = associationRole1;
		associationRole.remove(associationRole1);
		associationRole1._unlinkBase(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAssociationRole"));
		return ret;
		// -end- 33CD51170096 remove_body3C178E4F0366
		// "Association::removeAssociationRole"
	}

	/**
	 * tests if a given AssociationRole is connected.
	 * 
	 * @see #addAssociationRole
	 */
	// -beg- preserve=no 33CD51170096 test_head3C178E4F0366
	// "Association::containsAssociationRole"
	public boolean containsAssociationRole(AssociationRole associationRole1)
	// -end- 33CD51170096 test_head3C178E4F0366
	// "Association::containsAssociationRole"
	{
		// -beg- preserve=no 33CD51170096 test_body3C178E4F0366
		// "Association::containsAssociationRole"
		return associationRole.contains(associationRole1);
		// -end- 33CD51170096 test_body3C178E4F0366
		// "Association::containsAssociationRole"
	}

	/**
	 * used to enumerate all connected AssociationRoles.
	 * 
	 * @see #addAssociationRole
	 */
	// -beg- preserve=no 33CD51170096 get_all_head3C178E4F0366
	// "Association::iteratorAssociationRole"
	public java.util.Iterator iteratorAssociationRole()
	// -end- 33CD51170096 get_all_head3C178E4F0366
	// "Association::iteratorAssociationRole"
	{
		// -beg- preserve=no 33CD51170096 get_all_body3C178E4F0366
		// "Association::iteratorAssociationRole"
		return associationRole.iterator();
		// -end- 33CD51170096 get_all_body3C178E4F0366
		// "Association::iteratorAssociationRole"
	}

	/**
	 * disconnect all AssociationRoles.
	 * 
	 * @see #addAssociationRole
	 */
	// -beg- preserve=no 33CD51170096 remove_all_head3C178E4F0366
	// "Association::clearAssociationRole"
	public void clearAssociationRole()
	// -end- 33CD51170096 remove_all_head3C178E4F0366
	// "Association::clearAssociationRole"
	{
		// -beg- preserve=no 33CD51170096 remove_all_body3C178E4F0366
		// "Association::clearAssociationRole"
		if (sizeAssociationRole() > 0) {
			for (java.util.Iterator p = associationRole.iterator(); p.hasNext();) {
				((AssociationRole) p.next())._unlinkBase(this);
			}
			associationRole.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAssociationRole"));
		}
		// -end- 33CD51170096 remove_all_body3C178E4F0366
		// "Association::clearAssociationRole"
	}

	/**
	 * returns the number of AssociationRoles.
	 * 
	 * @see #addAssociationRole
	 */
	// -beg- preserve=no 33CD51170096 size_head3C178E4F0366
	// "Association::sizeAssociationRole"
	public int sizeAssociationRole()
	// -end- 33CD51170096 size_head3C178E4F0366
	// "Association::sizeAssociationRole"
	{
		// -beg- preserve=no 33CD51170096 size_body3C178E4F0366
		// "Association::sizeAssociationRole"
		return associationRole.size();
		// -end- 33CD51170096 size_body3C178E4F0366
		// "Association::sizeAssociationRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CD51170096 _link_body3C178E4F0366
	// "Association::_linkAssociationRole"
	public void _linkAssociationRole(AssociationRole associationRole1) {
		associationRole.add(associationRole1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAssociationRole"));
		return;
	}
	// -end- 33CD51170096 _link_body3C178E4F0366
	// "Association::_linkAssociationRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CD51170096 _unlink_body3C178E4F0366
	// "Association::_unlinkAssociationRole"
	public void _unlinkAssociationRole(AssociationRole associationRole1) {
		associationRole.remove(associationRole1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAssociationRole"));
		return;
	}
	// -end- 33CD51170096 _unlink_body3C178E4F0366
	// "Association::_unlinkAssociationRole"

	// -beg- preserve=no 328A5BB3023A code3C178E4F0366 "link"
	private java.util.Set link = new java.util.HashSet();
	// -end- 328A5BB3023A code3C178E4F0366 "link"

	/**
	 * add a Link.
	 *
	 * @see #removeLink
	 * @see #containsLink
	 * @see #iteratorLink
	 * @see #clearLink
	 * @see #sizeLink
	 */
	// -beg- preserve=no 328A5BB3023A add_head3C178E4F0366
	// "Association::addLink"
	public void addLink(Link link1)
	// -end- 328A5BB3023A add_head3C178E4F0366 "Association::addLink"
	{
		// -beg- preserve=no 328A5BB3023A add_body3C178E4F0366
		// "Association::addLink"
		link.add(link1);
		link1._linkAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addLink"));
		return;
		// -end- 328A5BB3023A add_body3C178E4F0366 "Association::addLink"
	}

	/**
	 * disconnect a Link.
	 * 
	 * @see #addLink
	 */
	// -beg- preserve=no 328A5BB3023A remove_head3C178E4F0366
	// "Association::removeLink"
	public Link removeLink(Link link1)
	// -end- 328A5BB3023A remove_head3C178E4F0366 "Association::removeLink"
	{
		// -beg- preserve=no 328A5BB3023A remove_body3C178E4F0366
		// "Association::removeLink"
		Link ret = null;
		if (link1 == null || !link.contains(link1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = link1;
		link.remove(link1);
		link1._unlinkAssociation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeLink"));
		return ret;
		// -end- 328A5BB3023A remove_body3C178E4F0366 "Association::removeLink"
	}

	/**
	 * tests if a given Link is connected.
	 * 
	 * @see #addLink
	 */
	// -beg- preserve=no 328A5BB3023A test_head3C178E4F0366
	// "Association::containsLink"
	public boolean containsLink(Link link1)
	// -end- 328A5BB3023A test_head3C178E4F0366 "Association::containsLink"
	{
		// -beg- preserve=no 328A5BB3023A test_body3C178E4F0366
		// "Association::containsLink"
		return link.contains(link1);
		// -end- 328A5BB3023A test_body3C178E4F0366 "Association::containsLink"
	}

	/**
	 * used to enumerate all connected Links.
	 * 
	 * @see #addLink
	 */
	// -beg- preserve=no 328A5BB3023A get_all_head3C178E4F0366
	// "Association::iteratorLink"
	public java.util.Iterator iteratorLink()
	// -end- 328A5BB3023A get_all_head3C178E4F0366 "Association::iteratorLink"
	{
		// -beg- preserve=no 328A5BB3023A get_all_body3C178E4F0366
		// "Association::iteratorLink"
		return link.iterator();
		// -end- 328A5BB3023A get_all_body3C178E4F0366
		// "Association::iteratorLink"
	}

	/**
	 * disconnect all Links.
	 * 
	 * @see #addLink
	 */
	// -beg- preserve=no 328A5BB3023A remove_all_head3C178E4F0366
	// "Association::clearLink"
	public void clearLink()
	// -end- 328A5BB3023A remove_all_head3C178E4F0366 "Association::clearLink"
	{
		// -beg- preserve=no 328A5BB3023A remove_all_body3C178E4F0366
		// "Association::clearLink"
		if (sizeLink() > 0) {
			for (java.util.Iterator p = link.iterator(); p.hasNext();) {
				((Link) p.next())._unlinkAssociation(this);
			}
			link.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearLink"));
		}
		// -end- 328A5BB3023A remove_all_body3C178E4F0366
		// "Association::clearLink"
	}

	/**
	 * returns the number of Links.
	 * 
	 * @see #addLink
	 */
	// -beg- preserve=no 328A5BB3023A size_head3C178E4F0366
	// "Association::sizeLink"
	public int sizeLink()
	// -end- 328A5BB3023A size_head3C178E4F0366 "Association::sizeLink"
	{
		// -beg- preserve=no 328A5BB3023A size_body3C178E4F0366
		// "Association::sizeLink"
		return link.size();
		// -end- 328A5BB3023A size_body3C178E4F0366 "Association::sizeLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 328A5BB3023A _link_body3C178E4F0366
	// "Association::_linkLink"
	public void _linkLink(Link link1) {
		link.add(link1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkLink"));
		return;
	}
	// -end- 328A5BB3023A _link_body3C178E4F0366 "Association::_linkLink"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 328A5BB3023A _unlink_body3C178E4F0366
	// "Association::_unlinkLink"
	public void _unlinkLink(Link link1) {
		link.remove(link1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkLink"));
		return;
	}
	// -end- 328A5BB3023A _unlink_body3C178E4F0366 "Association::_unlinkLink"

	// -beg- preserve=no 362409A9000A code3C178E4F0366 "presentation"

	// -end- 362409A9000A code3C178E4F0366 "presentation"

	/**
	 * add a Presentation.
	 *
	 * @see #removePresentation
	 * @see #containsPresentation
	 * @see #iteratorPresentation
	 * @see #clearPresentation
	 * @see #sizePresentation
	 */
	// -beg- preserve=no 362409A9000A add_head3C178E4F0366
	// "ModelElement::addPresentation"
	public void addPresentation(PresentationElement presentation1)
	// -end- 362409A9000A add_head3C178E4F0366 "ModelElement::addPresentation"
	{
		// -beg- preserve=no 362409A9000A add_body3C178E4F0366
		// "ModelElement::addPresentation"
		super.addPresentation(presentation1);
		// -end- 362409A9000A add_body3C178E4F0366
		// "ModelElement::addPresentation"
	}

	/**
	 * disconnect a Presentation.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_head3C178E4F0366
	// "ModelElement::removePresentation"
	public PresentationElement removePresentation(PresentationElement presentation1)
	// -end- 362409A9000A remove_head3C178E4F0366
	// "ModelElement::removePresentation"
	{
		// -beg- preserve=no 362409A9000A remove_body3C178E4F0366
		// "ModelElement::removePresentation"
		return super.removePresentation(presentation1);
		// -end- 362409A9000A remove_body3C178E4F0366
		// "ModelElement::removePresentation"
	}

	/**
	 * tests if a given Presentation is connected.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A test_head3C178E4F0366
	// "ModelElement::containsPresentation"
	public boolean containsPresentation(PresentationElement presentation1)
	// -end- 362409A9000A test_head3C178E4F0366
	// "ModelElement::containsPresentation"
	{
		// -beg- preserve=no 362409A9000A test_body3C178E4F0366
		// "ModelElement::containsPresentation"
		return super.containsPresentation(presentation1);
		// -end- 362409A9000A test_body3C178E4F0366
		// "ModelElement::containsPresentation"
	}

	/**
	 * used to enumerate all connected Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A get_all_head3C178E4F0366
	// "ModelElement::iteratorPresentation"
	public java.util.Iterator iteratorPresentation()
	// -end- 362409A9000A get_all_head3C178E4F0366
	// "ModelElement::iteratorPresentation"
	{
		// -beg- preserve=no 362409A9000A get_all_body3C178E4F0366
		// "ModelElement::iteratorPresentation"
		return super.iteratorPresentation();
		// -end- 362409A9000A get_all_body3C178E4F0366
		// "ModelElement::iteratorPresentation"
	}

	/**
	 * disconnect all Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_all_head3C178E4F0366
	// "ModelElement::clearPresentation"
	public void clearPresentation()
	// -end- 362409A9000A remove_all_head3C178E4F0366
	// "ModelElement::clearPresentation"
	{
		// -beg- preserve=no 362409A9000A remove_all_body3C178E4F0366
		// "ModelElement::clearPresentation"
		super.clearPresentation();
		// -end- 362409A9000A remove_all_body3C178E4F0366
		// "ModelElement::clearPresentation"
	}

	/**
	 * returns the number of Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A size_head3C178E4F0366
	// "ModelElement::sizePresentation"
	public int sizePresentation()
	// -end- 362409A9000A size_head3C178E4F0366 "ModelElement::sizePresentation"
	{
		// -beg- preserve=no 362409A9000A size_body3C178E4F0366
		// "ModelElement::sizePresentation"
		return super.sizePresentation();
		// -end- 362409A9000A size_body3C178E4F0366
		// "ModelElement::sizePresentation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _link_body3C178E4F0366
	// "ModelElement::_linkPresentation"
	public void _linkPresentation(PresentationElement presentation1) {
		super._linkPresentation(presentation1);
	}
	// -end- 362409A9000A _link_body3C178E4F0366
	// "ModelElement::_linkPresentation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _unlink_body3C178E4F0366
	// "ModelElement::_unlinkPresentation"
	public void _unlinkPresentation(PresentationElement presentation1) {
		super._unlinkPresentation(presentation1);
	}
	// -end- 362409A9000A _unlink_body3C178E4F0366
	// "ModelElement::_unlinkPresentation"

	// -beg- preserve=no 335C14A5019A code3C178E4F0366 "generalization"

	// -end- 335C14A5019A code3C178E4F0366 "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head3C178E4F0366
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head3C178E4F0366
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body3C178E4F0366
		// "GeneralizableElement::addGeneralization"
		super.addGeneralization(generalization1);
		// -end- 335C14A5019A add_body3C178E4F0366
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head3C178E4F0366
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head3C178E4F0366
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body3C178E4F0366
		// "GeneralizableElement::removeGeneralization"
		return super.removeGeneralization(generalization1);
		// -end- 335C14A5019A remove_body3C178E4F0366
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head3C178E4F0366
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head3C178E4F0366
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body3C178E4F0366
		// "GeneralizableElement::containsGeneralization"
		return super.containsGeneralization(generalization1);
		// -end- 335C14A5019A test_body3C178E4F0366
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head3C178E4F0366
	// "GeneralizableElement::iteratorGeneralization"
	public java.util.Iterator iteratorGeneralization()
	// -end- 335C14A5019A get_all_head3C178E4F0366
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body3C178E4F0366
		// "GeneralizableElement::iteratorGeneralization"
		return super.iteratorGeneralization();
		// -end- 335C14A5019A get_all_body3C178E4F0366
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head3C178E4F0366
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head3C178E4F0366
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body3C178E4F0366
		// "GeneralizableElement::clearGeneralization"
		super.clearGeneralization();
		// -end- 335C14A5019A remove_all_body3C178E4F0366
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head3C178E4F0366
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head3C178E4F0366
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body3C178E4F0366
		// "GeneralizableElement::sizeGeneralization"
		return super.sizeGeneralization();
		// -end- 335C14A5019A size_body3C178E4F0366
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body3C178E4F0366
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		super._linkGeneralization(generalization1);
	}
	// -end- 335C14A5019A _link_body3C178E4F0366
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body3C178E4F0366
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		super._unlinkGeneralization(generalization1);
	}
	// -end- 335C14A5019A _unlink_body3C178E4F0366
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code3C178E4F0366 "specialization"

	// -end- 335C146B01D6 code3C178E4F0366 "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head3C178E4F0366
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head3C178E4F0366
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body3C178E4F0366
		// "GeneralizableElement::addSpecialization"
		super.addSpecialization(specialization1);
		// -end- 335C146B01D6 add_body3C178E4F0366
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head3C178E4F0366
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head3C178E4F0366
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body3C178E4F0366
		// "GeneralizableElement::removeSpecialization"
		return super.removeSpecialization(specialization1);
		// -end- 335C146B01D6 remove_body3C178E4F0366
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head3C178E4F0366
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head3C178E4F0366
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body3C178E4F0366
		// "GeneralizableElement::containsSpecialization"
		return super.containsSpecialization(specialization1);
		// -end- 335C146B01D6 test_body3C178E4F0366
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head3C178E4F0366
	// "GeneralizableElement::iteratorSpecialization"
	public java.util.Iterator iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head3C178E4F0366
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body3C178E4F0366
		// "GeneralizableElement::iteratorSpecialization"
		return super.iteratorSpecialization();
		// -end- 335C146B01D6 get_all_body3C178E4F0366
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head3C178E4F0366
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head3C178E4F0366
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body3C178E4F0366
		// "GeneralizableElement::clearSpecialization"
		super.clearSpecialization();
		// -end- 335C146B01D6 remove_all_body3C178E4F0366
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head3C178E4F0366
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head3C178E4F0366
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body3C178E4F0366
		// "GeneralizableElement::sizeSpecialization"
		return super.sizeSpecialization();
		// -end- 335C146B01D6 size_body3C178E4F0366
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body3C178E4F0366
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		super._linkSpecialization(specialization1);
	}
	// -end- 335C146B01D6 _link_body3C178E4F0366
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body3C178E4F0366
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		super._unlinkSpecialization(specialization1);
	}
	// -end- 335C146B01D6 _unlink_body3C178E4F0366
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 327A877801CC var3C178E4F0366 "isRoot"

	// -end- 327A877801CC var3C178E4F0366 "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head3C178E4F0366 "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head3C178E4F0366 "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body3C178E4F0366 "isRoot"
		return super.isRoot();
		// -end- 327A877801CC get_body3C178E4F0366 "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head3C178E4F0366 "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head3C178E4F0366 "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body3C178E4F0366 "isRoot"
		super.setRoot(value1);
		// -end- 327A877801CC set_body3C178E4F0366 "isRoot"
	}

	// -beg- preserve=no 327A877E006E var3C178E4F0366 "isLeaf"

	// -end- 327A877E006E var3C178E4F0366 "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head3C178E4F0366 "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head3C178E4F0366 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body3C178E4F0366 "isLeaf"
		return super.isLeaf();
		// -end- 327A877E006E get_body3C178E4F0366 "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head3C178E4F0366 "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head3C178E4F0366 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body3C178E4F0366 "isLeaf"
		super.setLeaf(value1);
		// -end- 327A877E006E set_body3C178E4F0366 "isLeaf"
	}

	// -beg- preserve=no 327A878400D2 var3C178E4F0366 "isAbstract"

	// -end- 327A878400D2 var3C178E4F0366 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 327A878400D2 get_head3C178E4F0366 "isAbstract"
	public boolean isAbstract()
	// -end- 327A878400D2 get_head3C178E4F0366 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 get_body3C178E4F0366 "isAbstract"
		return super.isAbstract();
		// -end- 327A878400D2 get_body3C178E4F0366 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 327A878400D2 set_head3C178E4F0366 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 327A878400D2 set_head3C178E4F0366 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 set_body3C178E4F0366 "isAbstract"
		super.setAbstract(value1);
		// -end- 327A878400D2 set_body3C178E4F0366 "isAbstract"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3C178E4F0366 detail_end "AssociationDef"
	/**
	 * swap the placement of two Connections.
	 * 
	 * @see #addConnection
	 */
	public void swapConnection(AssociationEnd connection1, AssociationEnd connection2) {
		int i1 = connection.indexOf(connection1);
		int i2 = connection.indexOf(connection2);
		if (i1 == -1 || i2 == -1) {
			throw new java.lang.IllegalArgumentException("cannot locate unknown object");
		}
		connection.set(i2, connection1);
		connection.set(i1, connection2);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "swapConnection"));
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMettaAttrb(value);
	}

	// -end- 3C178E4F0366 detail_end "AssociationDef"

}
