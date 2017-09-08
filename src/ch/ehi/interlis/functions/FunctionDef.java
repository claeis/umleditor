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

// -beg- preserve=no 3960AFB50130 package "FunctionDef"
package ch.ehi.interlis.functions;
// -end- 3960AFB50130 package "FunctionDef"

// -beg- preserve=no 3960AFB50130 autoimport "FunctionDef"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.interlis.functions.ArgumentType;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
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
// -end- 3960AFB50130 autoimport "FunctionDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3960AFB50130 import "FunctionDef"

// -end- 3960AFB50130 import "FunctionDef"

/**
 * Definiert eine Funktion.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:48 $
 */
public class FunctionDef extends AbstractModelElement implements ModelElement, IliSyntax, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3960AFB50130 detail_begin "FunctionDef"

	// -end- 3960AFB50130 detail_begin "FunctionDef"

	// -beg- preserve=no 3D4FA21803C0 head3960AFB50130 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21803C0 head3960AFB50130 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21803C0 throws3960AFB50130 "unlinkAll"

	// -end- 3D4FA21803C0 throws3960AFB50130 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21803C0 body3960AFB50130 "unlinkAll"

		// Role FunctionCall: FunctionCall object(s) may point to this
		clearArgument();
		detachResult();
		detachNamespace();
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
		// -end- 3D4FA21803C0 body3960AFB50130 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21803C9 head3960AFB50130 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21803C9 head3960AFB50130 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21803C9 throws3960AFB50130 "enumerateChildren"

	// -end- 3D4FA21803C9 throws3960AFB50130 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21803C9 body3960AFB50130 "enumerateChildren"
		java.util.Iterator it = null;
		it = iteratorArgument();
		while (it.hasNext())
			visitor.visit(it.next());
		if (containsResult())
			visitor.visit(getResult());
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
		// -end- 3D4FA21803C9 body3960AFB50130 "enumerateChildren"
	}

	// -beg- preserve=no 3960B129038F code3960AFB50130 "argument"
	private java.util.Set argument = new java.util.HashSet();
	// -end- 3960B129038F code3960AFB50130 "argument"

	/**
	 * add a Argument.
	 *
	 * @see #removeArgument
	 * @see #containsArgument
	 * @see #iteratorArgument
	 * @see #clearArgument
	 * @see #sizeArgument
	 */
	// -beg- preserve=no 3960B129038F add_head3960AFB50130
	// "FunctionDef::addArgument"
	public void addArgument(ArgumentType argument1)
	// -end- 3960B129038F add_head3960AFB50130 "FunctionDef::addArgument"
	{
		// -beg- preserve=no 3960B129038F add_body3960AFB50130
		// "FunctionDef::addArgument"
		argument.add(argument1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addArgument"));
		return;
		// -end- 3960B129038F add_body3960AFB50130 "FunctionDef::addArgument"
	}

	/**
	 * disconnect a Argument.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960B129038F remove_head3960AFB50130
	// "FunctionDef::removeArgument"
	public ArgumentType removeArgument(ArgumentType argument1)
	// -end- 3960B129038F remove_head3960AFB50130 "FunctionDef::removeArgument"
	{
		// -beg- preserve=no 3960B129038F remove_body3960AFB50130
		// "FunctionDef::removeArgument"
		ArgumentType ret = null;
		if (argument1 == null || !argument.contains(argument1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = argument1;
		argument.remove(argument1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeArgument"));
		return ret;
		// -end- 3960B129038F remove_body3960AFB50130
		// "FunctionDef::removeArgument"
	}

	/**
	 * tests if a given Argument is connected.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960B129038F test_head3960AFB50130
	// "FunctionDef::containsArgument"
	public boolean containsArgument(ArgumentType argument1)
	// -end- 3960B129038F test_head3960AFB50130 "FunctionDef::containsArgument"
	{
		// -beg- preserve=no 3960B129038F test_body3960AFB50130
		// "FunctionDef::containsArgument"
		return argument.contains(argument1);
		// -end- 3960B129038F test_body3960AFB50130
		// "FunctionDef::containsArgument"
	}

	/**
	 * used to enumerate all connected Arguments.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960B129038F get_all_head3960AFB50130
	// "FunctionDef::iteratorArgument"
	public java.util.Iterator iteratorArgument()
	// -end- 3960B129038F get_all_head3960AFB50130
	// "FunctionDef::iteratorArgument"
	{
		// -beg- preserve=no 3960B129038F get_all_body3960AFB50130
		// "FunctionDef::iteratorArgument"
		return argument.iterator();
		// -end- 3960B129038F get_all_body3960AFB50130
		// "FunctionDef::iteratorArgument"
	}

	/**
	 * disconnect all Arguments.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960B129038F remove_all_head3960AFB50130
	// "FunctionDef::clearArgument"
	public void clearArgument()
	// -end- 3960B129038F remove_all_head3960AFB50130
	// "FunctionDef::clearArgument"
	{
		// -beg- preserve=no 3960B129038F remove_all_body3960AFB50130
		// "FunctionDef::clearArgument"
		if (sizeArgument() > 0) {
			argument.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearArgument"));
		}
		// -end- 3960B129038F remove_all_body3960AFB50130
		// "FunctionDef::clearArgument"
	}

	/**
	 * returns the number of Arguments.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960B129038F size_head3960AFB50130
	// "FunctionDef::sizeArgument"
	public int sizeArgument()
	// -end- 3960B129038F size_head3960AFB50130 "FunctionDef::sizeArgument"
	{
		// -beg- preserve=no 3960B129038F size_body3960AFB50130
		// "FunctionDef::sizeArgument"
		return argument.size();
		// -end- 3960B129038F size_body3960AFB50130 "FunctionDef::sizeArgument"
	}

	// -beg- preserve=no 3960B1A9014D code3960AFB50130 "result"
	private ArgumentType result;
	// -end- 3960B1A9014D code3960AFB50130 "result"

	/**
	 * attaches a Result.
	 *
	 * @see #detachResult
	 * @see #getResult
	 * @see #containsResult
	 */
	// -beg- preserve=no 3960B1A9014D attach_head3960AFB50130
	// "FunctionDef::attachResult"
	public void attachResult(ArgumentType result1)
	// -end- 3960B1A9014D attach_head3960AFB50130 "FunctionDef::attachResult"
	{
		// -beg- preserve=no 3960B1A9014D attach_body3960AFB50130
		// "FunctionDef::attachResult"
		if (result != null) {
			throw new java.lang.IllegalStateException("already a result attached");
		}
		if (result1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as result");
		}
		result = result1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachResult"));
		return;
		// -end- 3960B1A9014D attach_body3960AFB50130
		// "FunctionDef::attachResult"
	}

	/**
	 * disconnect the currently attached Result.
	 * 
	 * @see #attachResult
	 */
	// -beg- preserve=no 3960B1A9014D detach_head3960AFB50130
	// "FunctionDef::detachResult"
	public ArgumentType detachResult()
	// -end- 3960B1A9014D detach_head3960AFB50130 "FunctionDef::detachResult"
	{
		// -beg- preserve=no 3960B1A9014D detach_body3960AFB50130
		// "FunctionDef::detachResult"
		ArgumentType ret = null;
		ret = result;
		result = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachResult"));
		return ret;
		// -end- 3960B1A9014D detach_body3960AFB50130
		// "FunctionDef::detachResult"
	}

	/**
	 * get the currently attached Result.
	 * 
	 * @see #attachResult
	 */
	// -beg- preserve=no 3960B1A9014D get_head3960AFB50130
	// "FunctionDef::getResult"
	public ArgumentType getResult()
	// -end- 3960B1A9014D get_head3960AFB50130 "FunctionDef::getResult"
	{
		// -beg- preserve=no 3960B1A9014D get_body3960AFB50130
		// "FunctionDef::getResult"
		if (result == null) {
			throw new java.lang.IllegalStateException("no result attached");
		}
		return result;
		// -end- 3960B1A9014D get_body3960AFB50130 "FunctionDef::getResult"
	}

	/**
	 * tests if there is a Result attached.
	 * 
	 * @see #attachResult
	 */
	// -beg- preserve=no 3960B1A9014D test_head3960AFB50130
	// "FunctionDef::containsResult"
	public boolean containsResult()
	// -end- 3960B1A9014D test_head3960AFB50130 "FunctionDef::containsResult"
	{
		// -beg- preserve=no 3960B1A9014D test_body3960AFB50130
		// "FunctionDef::containsResult"
		return result != null;
		// -end- 3960B1A9014D test_body3960AFB50130
		// "FunctionDef::containsResult"
	}

	// -beg- preserve=no 33598CAA030E code3960AFB50130 "namespace"

	// -end- 33598CAA030E code3960AFB50130 "namespace"

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
	// -beg- preserve=no 33598CAA030E attach_head3960AFB50130
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head3960AFB50130
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body3960AFB50130
		// "ModelElement::attachNamespace"
		super.attachNamespace(namespace1);
		// -end- 33598CAA030E attach_body3960AFB50130
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head3960AFB50130
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head3960AFB50130
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body3960AFB50130
		// "ModelElement::attachNamespaceLink"
		super.attachNamespaceLink(namespace1);
		// -end- 33598CAA030E attachlink_body3960AFB50130
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head3960AFB50130
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head3960AFB50130
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body3960AFB50130
		// "ModelElement::detachNamespace"
		return super.detachNamespace();
		// -end- 33598CAA030E detach_body3960AFB50130
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head3960AFB50130
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head3960AFB50130 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body3960AFB50130
		// "ModelElement::getNamespace"
		return super.getNamespace();
		// -end- 33598CAA030E get_body3960AFB50130 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head3960AFB50130
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head3960AFB50130
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body3960AFB50130
		// "ModelElement::getNamespaceLink"
		return super.getNamespaceLink();
		// -end- 33598CAA030E getlink_body3960AFB50130
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head3960AFB50130
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head3960AFB50130
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body3960AFB50130
		// "ModelElement::createNamespaceLink"
		return super.createNamespaceLink();
		// -end- 33598CAA030E createlink_body3960AFB50130
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head3960AFB50130
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head3960AFB50130
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body3960AFB50130
		// "ModelElement::containsNamespace"
		return super.containsNamespace();
		// -end- 33598CAA030E test_body3960AFB50130
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body3960AFB50130
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		super._linkNamespace(namespace1);
	}
	// -end- 33598CAA030E _link_body3960AFB50130 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body3960AFB50130
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		super._unlinkNamespace(namespace1);
	}
	// -end- 33598CAA030E _unlink_body3960AFB50130
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 3960B04403DF var3960AFB50130 "name"

	// -end- 3960B04403DF var3960AFB50130 "name"

	/**
	 * get current value of name Name der Funktion.
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 3960B04403DF get_head3960AFB50130 "name"
	public NlsString getName()
	// -end- 3960B04403DF get_head3960AFB50130 "name"
	{
		// -beg- preserve=no 3960B04403DF get_body3960AFB50130 "name"
		return super.getName();
		// -end- 3960B04403DF get_body3960AFB50130 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 3960B04403DF set_head3960AFB50130 "name"
	public void setName(NlsString value1)
	// -end- 3960B04403DF set_head3960AFB50130 "name"
	{
		// -beg- preserve=no 3960B04403DF set_body3960AFB50130 "name"
		super.setName(value1);
		// -end- 3960B04403DF set_body3960AFB50130 "name"
	}

	// -beg- preserve=no 3960B21702D2 var3960AFB50130 "explanation"
	private NlsString explanation = null;
	// -end- 3960B21702D2 var3960AFB50130 "explanation"

	/**
	 * get current value of explanation Beschreibung der Funktion oder Code.
	 * 
	 * @see #setExplanation
	 */
	// -beg- preserve=no 3960B21702D2 get_head3960AFB50130 "explanation"
	public NlsString getExplanation()
	// -end- 3960B21702D2 get_head3960AFB50130 "explanation"
	{
		// -beg- preserve=no 3960B21702D2 get_body3960AFB50130 "explanation"
		return explanation;
		// -end- 3960B21702D2 get_body3960AFB50130 "explanation"
	}

	/**
	 * set current value of explanation
	 * 
	 * @see #getExplanation
	 */
	// -beg- preserve=no 3960B21702D2 set_head3960AFB50130 "explanation"
	public void setExplanation(NlsString value1)
	// -end- 3960B21702D2 set_head3960AFB50130 "explanation"
	{
		// -beg- preserve=no 3960B21702D2 set_body3960AFB50130 "explanation"
		if (explanation != value1 && (explanation == null || !explanation.equals(value1))) {
			explanation = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setExplanation"));
		}
		// -end- 3960B21702D2 set_body3960AFB50130 "explanation"
	}

	// -beg- preserve=no 3C8F5ABE022D var3960AFB50130 "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var3960AFB50130 "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head3960AFB50130 "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head3960AFB50130 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body3960AFB50130 "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body3960AFB50130 "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head3960AFB50130 "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head3960AFB50130 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body3960AFB50130 "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body3960AFB50130 "syntax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3960AFB50130 detail_end "FunctionDef"

	// -end- 3960AFB50130 detail_end "FunctionDef"

}
