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

// -beg- preserve=no 3940ECC60372 package "LineFormTypeDef"
package ch.ehi.interlis.domainsandconstants.linetypes;
// -end- 3940ECC60372 package "LineFormTypeDef"

// -beg- preserve=no 3940ECC60372 autoimport "LineFormTypeDef"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.interlis.domainsandconstants.linetypes.LineForm;
import ch.ehi.interlis.modeltopicclass.ClassDef;
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
// -end- 3940ECC60372 autoimport "LineFormTypeDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3940ECC60372 import "LineFormTypeDef"

// -end- 3940ECC60372 import "LineFormTypeDef"

/**
 * Definiert eine neue Verbindungsgeometrie.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:42 $
 */
public class LineFormTypeDef extends AbstractModelElement implements ModelElement, IliSyntax, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3940ECC60372 detail_begin "LineFormTypeDef"

	// -end- 3940ECC60372 detail_begin "LineFormTypeDef"

	// -beg- preserve=no 3D4FA21B0369 head3940ECC60372 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0369 head3940ECC60372 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0369 throws3940ECC60372 "unlinkAll"

	// -end- 3D4FA21B0369 throws3940ECC60372 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0369 body3940ECC60372 "unlinkAll"

		detachNamespace();
		detachLineForm();
		detachStructure();
		setName(null);
		setExplanation(null);
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
		// -end- 3D4FA21B0369 body3940ECC60372 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B036A head3940ECC60372 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B036A head3940ECC60372 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B036A throws3940ECC60372 "enumerateChildren"

	// -end- 3D4FA21B036A throws3940ECC60372 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B036A body3940ECC60372 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getName());
		visitor.visit(getExplanation());
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
		// -end- 3D4FA21B036A body3940ECC60372 "enumerateChildren"
	}

	// -beg- preserve=no 33598CAA030E code3940ECC60372 "namespace"

	// -end- 33598CAA030E code3940ECC60372 "namespace"

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
	// -beg- preserve=no 33598CAA030E attach_head3940ECC60372
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head3940ECC60372
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body3940ECC60372
		// "ModelElement::attachNamespace"
		super.attachNamespace(namespace1);
		// -end- 33598CAA030E attach_body3940ECC60372
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head3940ECC60372
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head3940ECC60372
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body3940ECC60372
		// "ModelElement::attachNamespaceLink"
		super.attachNamespaceLink(namespace1);
		// -end- 33598CAA030E attachlink_body3940ECC60372
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head3940ECC60372
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head3940ECC60372
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body3940ECC60372
		// "ModelElement::detachNamespace"
		return super.detachNamespace();
		// -end- 33598CAA030E detach_body3940ECC60372
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head3940ECC60372
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head3940ECC60372 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body3940ECC60372
		// "ModelElement::getNamespace"
		return super.getNamespace();
		// -end- 33598CAA030E get_body3940ECC60372 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head3940ECC60372
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head3940ECC60372
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body3940ECC60372
		// "ModelElement::getNamespaceLink"
		return super.getNamespaceLink();
		// -end- 33598CAA030E getlink_body3940ECC60372
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head3940ECC60372
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head3940ECC60372
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body3940ECC60372
		// "ModelElement::createNamespaceLink"
		return super.createNamespaceLink();
		// -end- 33598CAA030E createlink_body3940ECC60372
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head3940ECC60372
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head3940ECC60372
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body3940ECC60372
		// "ModelElement::containsNamespace"
		return super.containsNamespace();
		// -end- 33598CAA030E test_body3940ECC60372
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body3940ECC60372
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		super._linkNamespace(namespace1);
	}
	// -end- 33598CAA030E _link_body3940ECC60372 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body3940ECC60372
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		super._unlinkNamespace(namespace1);
	}
	// -end- 33598CAA030E _unlink_body3940ECC60372
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 3948EB9801CE code3940ECC60372 "lineForm"
	private LineForm lineForm;
	// -end- 3948EB9801CE code3940ECC60372 "lineForm"

	/**
	 * attaches a LineForm.
	 *
	 * @see #detachLineForm
	 * @see #getLineForm
	 * @see #containsLineForm
	 */
	// -beg- preserve=no 3948EB9801CE attach_head3940ECC60372
	// "LineFormTypeDef::attachLineForm"
	public void attachLineForm(LineForm lineForm1)
	// -end- 3948EB9801CE attach_head3940ECC60372
	// "LineFormTypeDef::attachLineForm"
	{
		// -beg- preserve=no 3948EB9801CE attach_body3940ECC60372
		// "LineFormTypeDef::attachLineForm"
		if (lineForm != null) {
			throw new java.lang.IllegalStateException("already a lineForm attached");
		}
		if (lineForm1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as lineForm");
		}
		lineForm = lineForm1;
		lineForm1._linkLineFormTypeDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachLineForm"));
		return;
		// -end- 3948EB9801CE attach_body3940ECC60372
		// "LineFormTypeDef::attachLineForm"
	}

	/**
	 * disconnect the currently attached LineForm.
	 * 
	 * @see #attachLineForm
	 */
	// -beg- preserve=no 3948EB9801CE detach_head3940ECC60372
	// "LineFormTypeDef::detachLineForm"
	public LineForm detachLineForm()
	// -end- 3948EB9801CE detach_head3940ECC60372
	// "LineFormTypeDef::detachLineForm"
	{
		// -beg- preserve=no 3948EB9801CE detach_body3940ECC60372
		// "LineFormTypeDef::detachLineForm"
		LineForm ret = null;
		if (lineForm != null) {
			lineForm._unlinkLineFormTypeDef(this);
			ret = lineForm;
			lineForm = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachLineForm"));
		return ret;
		// -end- 3948EB9801CE detach_body3940ECC60372
		// "LineFormTypeDef::detachLineForm"
	}

	/**
	 * get the currently attached LineForm.
	 * 
	 * @see #attachLineForm
	 */
	// -beg- preserve=no 3948EB9801CE get_head3940ECC60372
	// "LineFormTypeDef::getLineForm"
	public LineForm getLineForm()
	// -end- 3948EB9801CE get_head3940ECC60372 "LineFormTypeDef::getLineForm"
	{
		// -beg- preserve=no 3948EB9801CE get_body3940ECC60372
		// "LineFormTypeDef::getLineForm"
		if (lineForm == null) {
			throw new java.lang.IllegalStateException("no lineForm attached");
		}
		return lineForm;
		// -end- 3948EB9801CE get_body3940ECC60372
		// "LineFormTypeDef::getLineForm"
	}

	/**
	 * tests if there is a LineForm attached.
	 * 
	 * @see #attachLineForm
	 */
	// -beg- preserve=no 3948EB9801CE test_head3940ECC60372
	// "LineFormTypeDef::containsLineForm"
	public boolean containsLineForm()
	// -end- 3948EB9801CE test_head3940ECC60372
	// "LineFormTypeDef::containsLineForm"
	{
		// -beg- preserve=no 3948EB9801CE test_body3940ECC60372
		// "LineFormTypeDef::containsLineForm"
		return lineForm != null;
		// -end- 3948EB9801CE test_body3940ECC60372
		// "LineFormTypeDef::containsLineForm"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3948EB9801CE _link_body3940ECC60372
	// "LineFormTypeDef::_linkLineForm"
	public void _linkLineForm(LineForm lineForm1) {
		lineForm = lineForm1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkLineForm"));
		return;
	}
	// -end- 3948EB9801CE _link_body3940ECC60372
	// "LineFormTypeDef::_linkLineForm"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3948EB9801CE _unlink_body3940ECC60372
	// "LineFormTypeDef::_unlinkLineForm"
	public void _unlinkLineForm(LineForm lineForm1) {
		lineForm = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkLineForm"));
		return;
	}
	// -end- 3948EB9801CE _unlink_body3940ECC60372
	// "LineFormTypeDef::_unlinkLineForm"

	// -beg- preserve=no 3FE5C65E00C7 code3940ECC60372 "structure"
	private ClassDef structure;
	// -end- 3FE5C65E00C7 code3940ECC60372 "structure"

	/**
	 * attaches a Structure.
	 *
	 * @see #detachStructure
	 * @see #getStructure
	 * @see #containsStructure
	 */
	// -beg- preserve=no 3FE5C65E00C7 attach_head3940ECC60372
	// "LineFormTypeDef::attachStructure"
	public void attachStructure(ClassDef structure1)
	// -end- 3FE5C65E00C7 attach_head3940ECC60372
	// "LineFormTypeDef::attachStructure"
	{
		// -beg- preserve=no 3FE5C65E00C7 attach_body3940ECC60372
		// "LineFormTypeDef::attachStructure"
		if (structure != null) {
			throw new java.lang.IllegalStateException("already a structure attached");
		}
		if (structure1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as structure");
		}
		structure = structure1;
		structure1._linkLineFormTypeDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachStructure"));
		return;
		// -end- 3FE5C65E00C7 attach_body3940ECC60372
		// "LineFormTypeDef::attachStructure"
	}

	/**
	 * disconnect the currently attached Structure.
	 * 
	 * @see #attachStructure
	 */
	// -beg- preserve=no 3FE5C65E00C7 detach_head3940ECC60372
	// "LineFormTypeDef::detachStructure"
	public ClassDef detachStructure()
	// -end- 3FE5C65E00C7 detach_head3940ECC60372
	// "LineFormTypeDef::detachStructure"
	{
		// -beg- preserve=no 3FE5C65E00C7 detach_body3940ECC60372
		// "LineFormTypeDef::detachStructure"
		ClassDef ret = null;
		if (structure != null) {
			structure._unlinkLineFormTypeDef(this);
			ret = structure;
			structure = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachStructure"));
		return ret;
		// -end- 3FE5C65E00C7 detach_body3940ECC60372
		// "LineFormTypeDef::detachStructure"
	}

	/**
	 * get the currently attached Structure.
	 * 
	 * @see #attachStructure
	 */
	// -beg- preserve=no 3FE5C65E00C7 get_head3940ECC60372
	// "LineFormTypeDef::getStructure"
	public ClassDef getStructure()
	// -end- 3FE5C65E00C7 get_head3940ECC60372 "LineFormTypeDef::getStructure"
	{
		// -beg- preserve=no 3FE5C65E00C7 get_body3940ECC60372
		// "LineFormTypeDef::getStructure"
		if (structure == null) {
			throw new java.lang.IllegalStateException("no structure attached");
		}
		return structure;
		// -end- 3FE5C65E00C7 get_body3940ECC60372
		// "LineFormTypeDef::getStructure"
	}

	/**
	 * tests if there is a Structure attached.
	 * 
	 * @see #attachStructure
	 */
	// -beg- preserve=no 3FE5C65E00C7 test_head3940ECC60372
	// "LineFormTypeDef::containsStructure"
	public boolean containsStructure()
	// -end- 3FE5C65E00C7 test_head3940ECC60372
	// "LineFormTypeDef::containsStructure"
	{
		// -beg- preserve=no 3FE5C65E00C7 test_body3940ECC60372
		// "LineFormTypeDef::containsStructure"
		return structure != null;
		// -end- 3FE5C65E00C7 test_body3940ECC60372
		// "LineFormTypeDef::containsStructure"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FE5C65E00C7 _link_body3940ECC60372
	// "LineFormTypeDef::_linkStructure"
	public void _linkStructure(ClassDef structure1) {
		structure = structure1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkStructure"));
		return;
	}
	// -end- 3FE5C65E00C7 _link_body3940ECC60372
	// "LineFormTypeDef::_linkStructure"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FE5C65E00C7 _unlink_body3940ECC60372
	// "LineFormTypeDef::_unlinkStructure"
	public void _unlinkStructure(ClassDef structure1) {
		structure = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkStructure"));
		return;
	}
	// -end- 3FE5C65E00C7 _unlink_body3940ECC60372
	// "LineFormTypeDef::_unlinkStructure"

	// -beg- preserve=no 3949DD2502D7 var3940ECC60372 "name"

	// -end- 3949DD2502D7 var3940ECC60372 "name"

	/**
	 * get current value of name Name der Verbindungsgeometrie.
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 3949DD2502D7 get_head3940ECC60372 "name"
	public NlsString getName()
	// -end- 3949DD2502D7 get_head3940ECC60372 "name"
	{
		// -beg- preserve=no 3949DD2502D7 get_body3940ECC60372 "name"
		return super.getName();
		// -end- 3949DD2502D7 get_body3940ECC60372 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 3949DD2502D7 set_head3940ECC60372 "name"
	public void setName(NlsString value1)
	// -end- 3949DD2502D7 set_head3940ECC60372 "name"
	{
		// -beg- preserve=no 3949DD2502D7 set_body3940ECC60372 "name"
		super.setName(value1);
		// -end- 3949DD2502D7 set_body3940ECC60372 "name"
	}

	// -beg- preserve=no 3949DD3800F3 var3940ECC60372 "explanation"
	private NlsString explanation = null;
	// -end- 3949DD3800F3 var3940ECC60372 "explanation"

	/**
	 * get current value of explanation Erläuterung zu der Verbindungsgeometrie.
	 * 
	 * @see #setExplanation
	 */
	// -beg- preserve=no 3949DD3800F3 get_head3940ECC60372 "explanation"
	public NlsString getExplanation()
	// -end- 3949DD3800F3 get_head3940ECC60372 "explanation"
	{
		// -beg- preserve=no 3949DD3800F3 get_body3940ECC60372 "explanation"
		return explanation;
		// -end- 3949DD3800F3 get_body3940ECC60372 "explanation"
	}

	/**
	 * set current value of explanation
	 * 
	 * @see #getExplanation
	 */
	// -beg- preserve=no 3949DD3800F3 set_head3940ECC60372 "explanation"
	public void setExplanation(NlsString value1)
	// -end- 3949DD3800F3 set_head3940ECC60372 "explanation"
	{
		// -beg- preserve=no 3949DD3800F3 set_body3940ECC60372 "explanation"
		if (explanation != value1 && (explanation == null || !explanation.equals(value1))) {
			explanation = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setExplanation"));
		}
		// -end- 3949DD3800F3 set_body3940ECC60372 "explanation"
	}

	// -beg- preserve=no 3C8F5ABE022D var3940ECC60372 "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var3940ECC60372 "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head3940ECC60372 "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head3940ECC60372 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body3940ECC60372 "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body3940ECC60372 "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head3940ECC60372 "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head3940ECC60372 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body3940ECC60372 "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body3940ECC60372 "syntax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3940ECC60372 detail_end "LineFormTypeDef"

	// -end- 3940ECC60372 detail_end "LineFormTypeDef"

}
