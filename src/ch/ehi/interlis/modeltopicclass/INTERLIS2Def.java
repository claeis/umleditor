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

// -beg- preserve=no 358A5F0B0113 package "INTERLIS2Def"
package ch.ehi.interlis.modeltopicclass;
// -end- 358A5F0B0113 package "INTERLIS2Def"

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.views.Arrangements;
import ch.ehi.interlis.views.Evaluations;
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
// -beg- preserve=no 358A5F0B0113 autoimport "INTERLIS2Def"
import ch.ehi.uml1_4.foundation.core.Artifact;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.implementation.AbstractNamespace;
// -end- 358A5F0B0113 autoimport "INTERLIS2Def"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5F0B0113 import "INTERLIS2Def"

// -end- 358A5F0B0113 import "INTERLIS2Def"

/**
 * Inhalt einer INTERLIS-Datei (ili)
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:55 $
 */
public class INTERLIS2Def extends AbstractNamespace implements Artifact, java.io.Serializable {
	
	private static final long serialVersionUID = -629940655283639682L;
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5F0B0113 detail_begin "INTERLIS2Def"

	// -end- 358A5F0B0113 detail_begin "INTERLIS2Def"

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 3CE4FB1A02A4 head358A5F0B0113 "getValidOwnedElements"
	public String[] getValidOwnedElements()
	// -end- 3CE4FB1A02A4 head358A5F0B0113 "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CE4FB1A02A4 throws358A5F0B0113 "getValidOwnedElements"

	// -end- 3CE4FB1A02A4 throws358A5F0B0113 "getValidOwnedElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CE4FB1A02A4 body358A5F0B0113
		// "getValidOwnedElements"
		String ret[] = { "ch.ehi.interlis.modeltopicclass.ModelDef", "ch.ehi.interlis.domainsandconstants.DomainDef",
				"ch.ehi.uml1_4.implementation.UmlPackage" };
		return ret;
		// -end- 3CE4FB1A02A4 body358A5F0B0113 "getValidOwnedElements"
	}

	// -beg- preserve=no 3D4FA2190398 head358A5F0B0113 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2190398 head358A5F0B0113 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2190398 throws358A5F0B0113 "unlinkAll"

	// -end- 3D4FA2190398 throws358A5F0B0113 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2190398 body358A5F0B0113 "unlinkAll"

		clearOwnedElement();
		detachEvaluations();
		detachArrangements();
		detachFormat();
		detachCoding();
		detachNamespace();
		setTransferName(null);
		clearImplementationLocation();
		clearPresentation();
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
		clearDiagram();
		clearBehavior();
		clearPartition();
		clearCollaborationInstanceSet();
		clearClientDependency();
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
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA2190398 body358A5F0B0113 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21903AC head358A5F0B0113 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21903AC head358A5F0B0113 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21903AC throws358A5F0B0113 "enumerateChildren"

	// -end- 3D4FA21903AC throws358A5F0B0113 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21903AC body358A5F0B0113 "enumerateChildren"
		java.util.Iterator it = null;
		it = iteratorOwnedElement();
		while (it.hasNext())
			visitor.visit(it.next());
		if (containsEvaluations())
			visitor.visit(getEvaluations());
		if (containsArrangements())
			visitor.visit(getArrangements());
		if (containsFormat())
			visitor.visit(getFormat());
		if (containsCoding())
			visitor.visit(getCoding());
		visitor.visit(getTransferName());
		it = iteratorFeature();
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
		// -end- 3D4FA21903AC body358A5F0B0113 "enumerateChildren"
	}

	// -beg- preserve=no 33598CAA030D code358A5F0B0113 "ownedElement"

	// -end- 33598CAA030D code358A5F0B0113 "ownedElement"

	/**
	 * add a OwnedElement. A set of ModelElementsowned by the Namespace.
	 * 
	 * @see #removeOwnedElement
	 * @see #containsOwnedElement
	 * @see #iteratorOwnedElement
	 * @see #clearOwnedElement
	 * @see #sizeOwnedElement
	 * @see #iteratorOwnedElementLink
	 * @see #createOwnedElementLink
	 * @see #findOwnedElementLink
	 */
	// -beg- preserve=no 33598CAA030D add_head358A5F0B0113
	// "Namespace::addOwnedElement"
	public void addOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D add_head358A5F0B0113 "Namespace::addOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D add_body358A5F0B0113
		// "Namespace::addOwnedElement"
		super.addOwnedElement(ownedElement1);
		// -end- 33598CAA030D add_body358A5F0B0113 "Namespace::addOwnedElement"
	}

	// -beg- preserve=no 33598CAA030D add2_head358A5F0B0113
	// "Namespace::add2OwnedElement"
	public void addOwnedElement(int index, ModelElement ownedElement1)
	// -end- 33598CAA030D add2_head358A5F0B0113 "Namespace::add2OwnedElement"
	{
		// -beg- preserve=no 33598CAA030D add2_body358A5F0B0113
		// "Namespace::add2OwnedElement"
		super.addOwnedElement(index, ownedElement1);
		// -end- 33598CAA030D add2_body358A5F0B0113
		// "Namespace::add2OwnedElement"
	}

	/**
	 * add a link to a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D addlink_head358A5F0B0113
	// "Namespace::addOwnedElementLink"
	public void addOwnedElementLink(ElementOwnership ownedElement1)
	// -end- 33598CAA030D addlink_head358A5F0B0113
	// "Namespace::addOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D addlink_body358A5F0B0113
		// "Namespace::addOwnedElementLink"
		super.addOwnedElementLink(ownedElement1);
		// -end- 33598CAA030D addlink_body358A5F0B0113
		// "Namespace::addOwnedElementLink"
	}

	/**
	 * disconnect a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove_head358A5F0B0113
	// "Namespace::removeOwnedElement"
	public ModelElement removeOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D remove_head358A5F0B0113
	// "Namespace::removeOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove_body358A5F0B0113
		// "Namespace::removeOwnedElement"
		return super.removeOwnedElement(ownedElement1);
		// -end- 33598CAA030D remove_body358A5F0B0113
		// "Namespace::removeOwnedElement"
	}

	/**
	 * disconnect a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove2_head358A5F0B0113
	// "Namespace::remove2OwnedElement"
	public ModelElement removeOwnedElement(int index)
	// -end- 33598CAA030D remove2_head358A5F0B0113
	// "Namespace::remove2OwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove2_body358A5F0B0113
		// "Namespace::remove2OwnedElement"
		return super.removeOwnedElement(index);
		// -end- 33598CAA030D remove2_body358A5F0B0113
		// "Namespace::remove2OwnedElement"
	}

	/**
	 * change a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D set_head358A5F0B0113
	// "Namespace::setOwnedElement"
	public ModelElement setOwnedElement(int index, ModelElement ownedElement1)
	// -end- 33598CAA030D set_head358A5F0B0113 "Namespace::setOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D set_body358A5F0B0113
		// "Namespace::setOwnedElement"
		return super.setOwnedElement(index, ownedElement1);
		// -end- 33598CAA030D set_body358A5F0B0113 "Namespace::setOwnedElement"
	}

	/**
	 * tests if a given OwnedElement is connected.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D test_head358A5F0B0113
	// "Namespace::containsOwnedElement"
	public boolean containsOwnedElement(ModelElement ownedElement1)
	// -end- 33598CAA030D test_head358A5F0B0113
	// "Namespace::containsOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D test_body358A5F0B0113
		// "Namespace::containsOwnedElement"
		return super.containsOwnedElement(ownedElement1);
		// -end- 33598CAA030D test_body358A5F0B0113
		// "Namespace::containsOwnedElement"
	}

	/**
	 * used to enumerate all connected OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D get_all_head358A5F0B0113
	// "Namespace::iteratorOwnedElement"
	public java.util.Iterator iteratorOwnedElement()
	// -end- 33598CAA030D get_all_head358A5F0B0113
	// "Namespace::iteratorOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D get_all_body358A5F0B0113
		// "Namespace::iteratorOwnedElement"
		return super.iteratorOwnedElement();
		// -end- 33598CAA030D get_all_body358A5F0B0113
		// "Namespace::iteratorOwnedElement"
	}

	/**
	 * disconnect all OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D remove_all_head358A5F0B0113
	// "Namespace::clearOwnedElement"
	public void clearOwnedElement()
	// -end- 33598CAA030D remove_all_head358A5F0B0113
	// "Namespace::clearOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D remove_all_body358A5F0B0113
		// "Namespace::clearOwnedElement"
		super.clearOwnedElement();
		// -end- 33598CAA030D remove_all_body358A5F0B0113
		// "Namespace::clearOwnedElement"
	}

	/**
	 * returns the number of OwnedElements.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D size_head358A5F0B0113
	// "Namespace::sizeOwnedElement"
	public int sizeOwnedElement()
	// -end- 33598CAA030D size_head358A5F0B0113 "Namespace::sizeOwnedElement"
	{
		// -beg- preserve=no 33598CAA030D size_body358A5F0B0113
		// "Namespace::sizeOwnedElement"
		return super.sizeOwnedElement();
		// -end- 33598CAA030D size_body358A5F0B0113
		// "Namespace::sizeOwnedElement"
	}

	/**
	 * enumerate the link objects of currently connected OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D itlink_head358A5F0B0113
	// "Namespace::getOwnedElementLink"
	public java.util.Iterator iteratorOwnedElementLink()
	// -end- 33598CAA030D itlink_head358A5F0B0113
	// "Namespace::getOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D itlink_body358A5F0B0113
		// "Namespace::getOwnedElementLink"
		return super.iteratorOwnedElementLink();
		// -end- 33598CAA030D itlink_body358A5F0B0113
		// "Namespace::getOwnedElementLink"
	}

	/**
	 * create a link class for a new link to a OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D createlink_head358A5F0B0113
	// "Namespace::createOwnedElementLink"
	public ElementOwnership createOwnedElementLink()
	// -end- 33598CAA030D createlink_head358A5F0B0113
	// "Namespace::createOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D createlink_body358A5F0B0113
		// "Namespace::createOwnedElementLink"
		return super.createOwnedElementLink();
		// -end- 33598CAA030D createlink_body358A5F0B0113
		// "Namespace::createOwnedElementLink"
	}

	/**
	 * find a link object for a given OwnedElement.
	 * 
	 * @see #addOwnedElement
	 */
	// -beg- preserve=no 33598CAA030D find_head358A5F0B0113
	// "Namespace::findOwnedElementLink"
	public ElementOwnership findOwnedElementLink(ModelElement ownedElement1)
	// -end- 33598CAA030D find_head358A5F0B0113
	// "Namespace::findOwnedElementLink"
	{
		// -beg- preserve=no 33598CAA030D find_body358A5F0B0113
		// "Namespace::findOwnedElementLink"
		return super.findOwnedElementLink(ownedElement1);
		// -end- 33598CAA030D find_body358A5F0B0113
		// "Namespace::findOwnedElementLink"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030D _link_body358A5F0B0113
	// "Namespace::_linkOwnedElement"
	public void _linkOwnedElement(ElementOwnership ownedElement1) {
		super._linkOwnedElement(ownedElement1);
	}
	// -end- 33598CAA030D _link_body358A5F0B0113 "Namespace::_linkOwnedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030D _unlink_body358A5F0B0113
	// "Namespace::_unlinkOwnedElement"
	public void _unlinkOwnedElement(ElementOwnership ownedElement1) {
		super._unlinkOwnedElement(ownedElement1);
	}
	// -end- 33598CAA030D _unlink_body358A5F0B0113
	// "Namespace::_unlinkOwnedElement"

	// -beg- preserve=no 358A5FD7004E code358A5F0B0113 "evaluations"
	private Evaluations evaluations;
	// -end- 358A5FD7004E code358A5F0B0113 "evaluations"

	/**
	 * attaches a Evaluations.
	 *
	 * @see #detachEvaluations
	 * @see #getEvaluations
	 * @see #containsEvaluations
	 */
	// -beg- preserve=no 358A5FD7004E attach_head358A5F0B0113
	// "INTERLIS2Def::attachEvaluations"
	public void attachEvaluations(Evaluations evaluations1)
	// -end- 358A5FD7004E attach_head358A5F0B0113
	// "INTERLIS2Def::attachEvaluations"
	{
		// -beg- preserve=no 358A5FD7004E attach_body358A5F0B0113
		// "INTERLIS2Def::attachEvaluations"
		if (evaluations != null) {
			throw new java.lang.IllegalStateException("already a evaluations attached");
		}
		if (evaluations1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as evaluations");
		}
		evaluations = evaluations1;
		evaluations1._linkINTERLIS2Def(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachEvaluations"));
		return;
		// -end- 358A5FD7004E attach_body358A5F0B0113
		// "INTERLIS2Def::attachEvaluations"
	}

	/**
	 * disconnect the currently attached Evaluations.
	 * 
	 * @see #attachEvaluations
	 */
	// -beg- preserve=no 358A5FD7004E detach_head358A5F0B0113
	// "INTERLIS2Def::detachEvaluations"
	public Evaluations detachEvaluations()
	// -end- 358A5FD7004E detach_head358A5F0B0113
	// "INTERLIS2Def::detachEvaluations"
	{
		// -beg- preserve=no 358A5FD7004E detach_body358A5F0B0113
		// "INTERLIS2Def::detachEvaluations"
		Evaluations ret = null;
		if (evaluations != null) {
			evaluations._unlinkINTERLIS2Def(this);
			ret = evaluations;
			evaluations = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachEvaluations"));
		return ret;
		// -end- 358A5FD7004E detach_body358A5F0B0113
		// "INTERLIS2Def::detachEvaluations"
	}

	/**
	 * get the currently attached Evaluations.
	 * 
	 * @see #attachEvaluations
	 */
	// -beg- preserve=no 358A5FD7004E get_head358A5F0B0113
	// "INTERLIS2Def::getEvaluations"
	public Evaluations getEvaluations()
	// -end- 358A5FD7004E get_head358A5F0B0113 "INTERLIS2Def::getEvaluations"
	{
		// -beg- preserve=no 358A5FD7004E get_body358A5F0B0113
		// "INTERLIS2Def::getEvaluations"
		if (evaluations == null) {
			throw new java.lang.IllegalStateException("no evaluations attached");
		}
		return evaluations;
		// -end- 358A5FD7004E get_body358A5F0B0113
		// "INTERLIS2Def::getEvaluations"
	}

	/**
	 * tests if there is a Evaluations attached.
	 * 
	 * @see #attachEvaluations
	 */
	// -beg- preserve=no 358A5FD7004E test_head358A5F0B0113
	// "INTERLIS2Def::containsEvaluations"
	public boolean containsEvaluations()
	// -end- 358A5FD7004E test_head358A5F0B0113
	// "INTERLIS2Def::containsEvaluations"
	{
		// -beg- preserve=no 358A5FD7004E test_body358A5F0B0113
		// "INTERLIS2Def::containsEvaluations"
		return evaluations != null;
		// -end- 358A5FD7004E test_body358A5F0B0113
		// "INTERLIS2Def::containsEvaluations"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A5FD7004E _link_body358A5F0B0113
	// "INTERLIS2Def::_linkEvaluations"
	public void _linkEvaluations(Evaluations evaluations1) {
		evaluations = evaluations1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkEvaluations"));
		return;
	}
	// -end- 358A5FD7004E _link_body358A5F0B0113
	// "INTERLIS2Def::_linkEvaluations"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A5FD7004E _unlink_body358A5F0B0113
	// "INTERLIS2Def::_unlinkEvaluations"
	public void _unlinkEvaluations(Evaluations evaluations1) {
		evaluations = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkEvaluations"));
		return;
	}
	// -end- 358A5FD7004E _unlink_body358A5F0B0113
	// "INTERLIS2Def::_unlinkEvaluations"

	// -beg- preserve=no 358A601D00F9 code358A5F0B0113 "arrangements"
	private Arrangements arrangements;
	// -end- 358A601D00F9 code358A5F0B0113 "arrangements"

	/**
	 * attaches a Arrangements.
	 *
	 * @see #detachArrangements
	 * @see #getArrangements
	 * @see #containsArrangements
	 */
	// -beg- preserve=no 358A601D00F9 attach_head358A5F0B0113
	// "INTERLIS2Def::attachArrangements"
	public void attachArrangements(Arrangements arrangements1)
	// -end- 358A601D00F9 attach_head358A5F0B0113
	// "INTERLIS2Def::attachArrangements"
	{
		// -beg- preserve=no 358A601D00F9 attach_body358A5F0B0113
		// "INTERLIS2Def::attachArrangements"
		if (arrangements != null) {
			throw new java.lang.IllegalStateException("already a arrangements attached");
		}
		if (arrangements1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as arrangements");
		}
		arrangements = arrangements1;
		arrangements1._linkINTERLIS2Def(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachArrangements"));
		return;
		// -end- 358A601D00F9 attach_body358A5F0B0113
		// "INTERLIS2Def::attachArrangements"
	}

	/**
	 * disconnect the currently attached Arrangements.
	 * 
	 * @see #attachArrangements
	 */
	// -beg- preserve=no 358A601D00F9 detach_head358A5F0B0113
	// "INTERLIS2Def::detachArrangements"
	public Arrangements detachArrangements()
	// -end- 358A601D00F9 detach_head358A5F0B0113
	// "INTERLIS2Def::detachArrangements"
	{
		// -beg- preserve=no 358A601D00F9 detach_body358A5F0B0113
		// "INTERLIS2Def::detachArrangements"
		Arrangements ret = null;
		if (arrangements != null) {
			arrangements._unlinkINTERLIS2Def(this);
			ret = arrangements;
			arrangements = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachArrangements"));
		return ret;
		// -end- 358A601D00F9 detach_body358A5F0B0113
		// "INTERLIS2Def::detachArrangements"
	}

	/**
	 * get the currently attached Arrangements.
	 * 
	 * @see #attachArrangements
	 */
	// -beg- preserve=no 358A601D00F9 get_head358A5F0B0113
	// "INTERLIS2Def::getArrangements"
	public Arrangements getArrangements()
	// -end- 358A601D00F9 get_head358A5F0B0113 "INTERLIS2Def::getArrangements"
	{
		// -beg- preserve=no 358A601D00F9 get_body358A5F0B0113
		// "INTERLIS2Def::getArrangements"
		if (arrangements == null) {
			throw new java.lang.IllegalStateException("no arrangements attached");
		}
		return arrangements;
		// -end- 358A601D00F9 get_body358A5F0B0113
		// "INTERLIS2Def::getArrangements"
	}

	/**
	 * tests if there is a Arrangements attached.
	 * 
	 * @see #attachArrangements
	 */
	// -beg- preserve=no 358A601D00F9 test_head358A5F0B0113
	// "INTERLIS2Def::containsArrangements"
	public boolean containsArrangements()
	// -end- 358A601D00F9 test_head358A5F0B0113
	// "INTERLIS2Def::containsArrangements"
	{
		// -beg- preserve=no 358A601D00F9 test_body358A5F0B0113
		// "INTERLIS2Def::containsArrangements"
		return arrangements != null;
		// -end- 358A601D00F9 test_body358A5F0B0113
		// "INTERLIS2Def::containsArrangements"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A601D00F9 _link_body358A5F0B0113
	// "INTERLIS2Def::_linkArrangements"
	public void _linkArrangements(Arrangements arrangements1) {
		arrangements = arrangements1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkArrangements"));
		return;
	}
	// -end- 358A601D00F9 _link_body358A5F0B0113
	// "INTERLIS2Def::_linkArrangements"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A601D00F9 _unlink_body358A5F0B0113
	// "INTERLIS2Def::_unlinkArrangements"
	public void _unlinkArrangements(Arrangements arrangements1) {
		arrangements = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkArrangements"));
		return;
	}
	// -end- 358A601D00F9 _unlink_body358A5F0B0113
	// "INTERLIS2Def::_unlinkArrangements"

	// -beg- preserve=no 358A6020023E code358A5F0B0113 "format"
	private Format format;
	// -end- 358A6020023E code358A5F0B0113 "format"

	/**
	 * attaches a Format.
	 *
	 * @see #detachFormat
	 * @see #getFormat
	 * @see #containsFormat
	 */
	// -beg- preserve=no 358A6020023E attach_head358A5F0B0113
	// "INTERLIS2Def::attachFormat"
	public void attachFormat(Format format1)
	// -end- 358A6020023E attach_head358A5F0B0113 "INTERLIS2Def::attachFormat"
	{
		// -beg- preserve=no 358A6020023E attach_body358A5F0B0113
		// "INTERLIS2Def::attachFormat"
		if (format != null) {
			throw new java.lang.IllegalStateException("already a format attached");
		}
		if (format1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as format");
		}
		format = format1;
		format1._linkINTERLIS2Def(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachFormat"));
		return;
		// -end- 358A6020023E attach_body358A5F0B0113
		// "INTERLIS2Def::attachFormat"
	}

	/**
	 * disconnect the currently attached Format.
	 * 
	 * @see #attachFormat
	 */
	// -beg- preserve=no 358A6020023E detach_head358A5F0B0113
	// "INTERLIS2Def::detachFormat"
	public Format detachFormat()
	// -end- 358A6020023E detach_head358A5F0B0113 "INTERLIS2Def::detachFormat"
	{
		// -beg- preserve=no 358A6020023E detach_body358A5F0B0113
		// "INTERLIS2Def::detachFormat"
		Format ret = null;
		if (format != null) {
			format._unlinkINTERLIS2Def(this);
			ret = format;
			format = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachFormat"));
		return ret;
		// -end- 358A6020023E detach_body358A5F0B0113
		// "INTERLIS2Def::detachFormat"
	}

	/**
	 * get the currently attached Format.
	 * 
	 * @see #attachFormat
	 */
	// -beg- preserve=no 358A6020023E get_head358A5F0B0113
	// "INTERLIS2Def::getFormat"
	public Format getFormat()
	// -end- 358A6020023E get_head358A5F0B0113 "INTERLIS2Def::getFormat"
	{
		// -beg- preserve=no 358A6020023E get_body358A5F0B0113
		// "INTERLIS2Def::getFormat"
		if (format == null) {
			throw new java.lang.IllegalStateException("no format attached");
		}
		return format;
		// -end- 358A6020023E get_body358A5F0B0113 "INTERLIS2Def::getFormat"
	}

	/**
	 * tests if there is a Format attached.
	 * 
	 * @see #attachFormat
	 */
	// -beg- preserve=no 358A6020023E test_head358A5F0B0113
	// "INTERLIS2Def::containsFormat"
	public boolean containsFormat()
	// -end- 358A6020023E test_head358A5F0B0113 "INTERLIS2Def::containsFormat"
	{
		// -beg- preserve=no 358A6020023E test_body358A5F0B0113
		// "INTERLIS2Def::containsFormat"
		return format != null;
		// -end- 358A6020023E test_body358A5F0B0113
		// "INTERLIS2Def::containsFormat"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A6020023E _link_body358A5F0B0113
	// "INTERLIS2Def::_linkFormat"
	public void _linkFormat(Format format1) {
		format = format1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkFormat"));
		return;
	}
	// -end- 358A6020023E _link_body358A5F0B0113 "INTERLIS2Def::_linkFormat"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A6020023E _unlink_body358A5F0B0113
	// "INTERLIS2Def::_unlinkFormat"
	public void _unlinkFormat(Format format1) {
		format = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkFormat"));
		return;
	}
	// -end- 358A6020023E _unlink_body358A5F0B0113 "INTERLIS2Def::_unlinkFormat"

	// -beg- preserve=no 358A6023011F code358A5F0B0113 "coding"
	private Coding coding;
	// -end- 358A6023011F code358A5F0B0113 "coding"

	/**
	 * attaches a Coding.
	 *
	 * @see #detachCoding
	 * @see #getCoding
	 * @see #containsCoding
	 */
	// -beg- preserve=no 358A6023011F attach_head358A5F0B0113
	// "INTERLIS2Def::attachCoding"
	public void attachCoding(Coding coding1)
	// -end- 358A6023011F attach_head358A5F0B0113 "INTERLIS2Def::attachCoding"
	{
		// -beg- preserve=no 358A6023011F attach_body358A5F0B0113
		// "INTERLIS2Def::attachCoding"
		if (coding != null) {
			throw new java.lang.IllegalStateException("already a coding attached");
		}
		if (coding1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as coding");
		}
		coding = coding1;
		coding1._linkINTERLIS2Def(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachCoding"));
		return;
		// -end- 358A6023011F attach_body358A5F0B0113
		// "INTERLIS2Def::attachCoding"
	}

	/**
	 * disconnect the currently attached Coding.
	 * 
	 * @see #attachCoding
	 */
	// -beg- preserve=no 358A6023011F detach_head358A5F0B0113
	// "INTERLIS2Def::detachCoding"
	public Coding detachCoding()
	// -end- 358A6023011F detach_head358A5F0B0113 "INTERLIS2Def::detachCoding"
	{
		// -beg- preserve=no 358A6023011F detach_body358A5F0B0113
		// "INTERLIS2Def::detachCoding"
		Coding ret = null;
		if (coding != null) {
			coding._unlinkINTERLIS2Def(this);
			ret = coding;
			coding = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachCoding"));
		return ret;
		// -end- 358A6023011F detach_body358A5F0B0113
		// "INTERLIS2Def::detachCoding"
	}

	/**
	 * get the currently attached Coding.
	 * 
	 * @see #attachCoding
	 */
	// -beg- preserve=no 358A6023011F get_head358A5F0B0113
	// "INTERLIS2Def::getCoding"
	public Coding getCoding()
	// -end- 358A6023011F get_head358A5F0B0113 "INTERLIS2Def::getCoding"
	{
		// -beg- preserve=no 358A6023011F get_body358A5F0B0113
		// "INTERLIS2Def::getCoding"
		if (coding == null) {
			throw new java.lang.IllegalStateException("no coding attached");
		}
		return coding;
		// -end- 358A6023011F get_body358A5F0B0113 "INTERLIS2Def::getCoding"
	}

	/**
	 * tests if there is a Coding attached.
	 * 
	 * @see #attachCoding
	 */
	// -beg- preserve=no 358A6023011F test_head358A5F0B0113
	// "INTERLIS2Def::containsCoding"
	public boolean containsCoding()
	// -end- 358A6023011F test_head358A5F0B0113 "INTERLIS2Def::containsCoding"
	{
		// -beg- preserve=no 358A6023011F test_body358A5F0B0113
		// "INTERLIS2Def::containsCoding"
		return coding != null;
		// -end- 358A6023011F test_body358A5F0B0113
		// "INTERLIS2Def::containsCoding"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A6023011F _link_body358A5F0B0113
	// "INTERLIS2Def::_linkCoding"
	public void _linkCoding(Coding coding1) {
		coding = coding1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkCoding"));
		return;
	}
	// -end- 358A6023011F _link_body358A5F0B0113 "INTERLIS2Def::_linkCoding"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A6023011F _unlink_body358A5F0B0113
	// "INTERLIS2Def::_unlinkCoding"
	public void _unlinkCoding(Coding coding1) {
		coding = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkCoding"));
		return;
	}
	// -end- 358A6023011F _unlink_body358A5F0B0113 "INTERLIS2Def::_unlinkCoding"

	// -beg- preserve=no 33598CAA030E code358A5F0B0113 "namespace"

	// -end- 33598CAA030E code358A5F0B0113 "namespace"

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
	// -beg- preserve=no 33598CAA030E attach_head358A5F0B0113
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head358A5F0B0113
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body358A5F0B0113
		// "ModelElement::attachNamespace"
		super.attachNamespace(namespace1);
		// -end- 33598CAA030E attach_body358A5F0B0113
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head358A5F0B0113
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head358A5F0B0113
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body358A5F0B0113
		// "ModelElement::attachNamespaceLink"
		super.attachNamespaceLink(namespace1);
		// -end- 33598CAA030E attachlink_body358A5F0B0113
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head358A5F0B0113
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head358A5F0B0113
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body358A5F0B0113
		// "ModelElement::detachNamespace"
		return super.detachNamespace();
		// -end- 33598CAA030E detach_body358A5F0B0113
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head358A5F0B0113
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head358A5F0B0113 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body358A5F0B0113
		// "ModelElement::getNamespace"
		return super.getNamespace();
		// -end- 33598CAA030E get_body358A5F0B0113 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head358A5F0B0113
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head358A5F0B0113
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body358A5F0B0113
		// "ModelElement::getNamespaceLink"
		return super.getNamespaceLink();
		// -end- 33598CAA030E getlink_body358A5F0B0113
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head358A5F0B0113
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head358A5F0B0113
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body358A5F0B0113
		// "ModelElement::createNamespaceLink"
		return super.createNamespaceLink();
		// -end- 33598CAA030E createlink_body358A5F0B0113
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head358A5F0B0113
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head358A5F0B0113
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body358A5F0B0113
		// "ModelElement::containsNamespace"
		return super.containsNamespace();
		// -end- 33598CAA030E test_body358A5F0B0113
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body358A5F0B0113
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		super._linkNamespace(namespace1);
	}
	// -end- 33598CAA030E _link_body358A5F0B0113 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body358A5F0B0113
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		super._unlinkNamespace(namespace1);
	}
	// -end- 33598CAA030E _unlink_body358A5F0B0113
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 358A6082025D var358A5F0B0113 "fileName"
	private String fileName;
	// -end- 358A6082025D var358A5F0B0113 "fileName"

	/**
	 * get current value of fileName Name der INTERLIS-Modelldatei.
	 * 
	 * @see #setFileName
	 */
	// -beg- preserve=no 358A6082025D get_head358A5F0B0113 "fileName"
	private String getFileName()
	// -end- 358A6082025D get_head358A5F0B0113 "fileName"
	{
		// -beg- preserve=no 358A6082025D get_body358A5F0B0113 "fileName"
		return fileName;
		// -end- 358A6082025D get_body358A5F0B0113 "fileName"
	}

	/**
	 * set current value of fileName
	 * 
	 * @see #getFileName
	 */
	// -beg- preserve=no 358A6082025D set_head358A5F0B0113 "fileName"
	private void setFileName(String value1)
	// -end- 358A6082025D set_head358A5F0B0113 "fileName"
	{
		// -beg- preserve=no 358A6082025D set_body358A5F0B0113 "fileName"
		if (fileName != value1) {
			fileName = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setFileName"));
		}
		// -end- 358A6082025D set_body358A5F0B0113 "fileName"
	}

	// -beg- preserve=no 3940A7190365 var358A5F0B0113 "version"
	private double version;
	// -end- 3940A7190365 var358A5F0B0113 "version"

	/**
	 * get current value of version Definiert die Version der INTERLIS-Sprache
	 * die in der Modelldatei verwendet wurde.
	 * 
	 * @see #setVersion
	 */
	// -beg- preserve=no 3940A7190365 get_head358A5F0B0113 "version"
	public double getVersion()
	// -end- 3940A7190365 get_head358A5F0B0113 "version"
	{
		// -beg- preserve=no 3940A7190365 get_body358A5F0B0113 "version"
		return version;
		// -end- 3940A7190365 get_body358A5F0B0113 "version"
	}

	/**
	 * set current value of version
	 * 
	 * @see #getVersion
	 */
	// -beg- preserve=no 3940A7190365 set_head358A5F0B0113 "version"
	public void setVersion(double value1)
	// -end- 3940A7190365 set_head358A5F0B0113 "version"
	{
		// -beg- preserve=no 3940A7190365 set_body358A5F0B0113 "version"
		if (version != value1) {
			version = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setVersion"));
		}
		// -end- 3940A7190365 set_body358A5F0B0113 "version"
	}

	// -beg- preserve=no 3975790100E5 var358A5F0B0113 "transferName"
	private NlsString transferName = null;
	// -end- 3975790100E5 var358A5F0B0113 "transferName"

	/**
	 * get current value of transferName Name des Transfers.
	 * 
	 * @see #setTransferName
	 */
	// -beg- preserve=no 3975790100E5 get_head358A5F0B0113 "transferName"
	private NlsString getTransferName()
	// -end- 3975790100E5 get_head358A5F0B0113 "transferName"
	{
		// -beg- preserve=no 3975790100E5 get_body358A5F0B0113 "transferName"
		return transferName;
		// -end- 3975790100E5 get_body358A5F0B0113 "transferName"
	}

	/**
	 * set current value of transferName
	 * 
	 * @see #getTransferName
	 */
	// -beg- preserve=no 3975790100E5 set_head358A5F0B0113 "transferName"
	private void setTransferName(NlsString value1)
	// -end- 3975790100E5 set_head358A5F0B0113 "transferName"
	{
		// -beg- preserve=no 3975790100E5 set_body358A5F0B0113 "transferName"
		if (transferName != value1 && (transferName == null || !transferName.equals(value1))) {
			transferName = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setTransferName"));
		}
		// -end- 3975790100E5 set_body358A5F0B0113 "transferName"
	}

	// -beg- preserve=no 3A018E150193 code358A5F0B0113 "implementationLocation"
	private java.util.Set implementationLocation = new java.util.HashSet();
	// -end- 3A018E150193 code358A5F0B0113 "implementationLocation"

	/**
	 * add a ImplementationLocation. The deployable Component(s) that are
	 * implemented by this Artifact.
	 * 
	 * @see #removeImplementationLocation
	 * @see #containsImplementationLocation
	 * @see #iteratorImplementationLocation
	 * @see #clearImplementationLocation
	 * @see #sizeImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 add_head358A5F0B0113
	// "Artifact::addImplementationLocation"
	public void addImplementationLocation(Component implementationLocation1)
	// -end- 3A018E150193 add_head358A5F0B0113
	// "Artifact::addImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 add_body358A5F0B0113
		// "Artifact::addImplementationLocation"
		implementationLocation.add(implementationLocation1);
		implementationLocation1._linkImplementation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addImplementationLocation"));
		return;
		// -end- 3A018E150193 add_body358A5F0B0113
		// "Artifact::addImplementationLocation"
	}

	/**
	 * disconnect a ImplementationLocation.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 remove_head358A5F0B0113
	// "Artifact::removeImplementationLocation"
	public Component removeImplementationLocation(Component implementationLocation1)
	// -end- 3A018E150193 remove_head358A5F0B0113
	// "Artifact::removeImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 remove_body358A5F0B0113
		// "Artifact::removeImplementationLocation"
		Component ret = null;
		if (implementationLocation1 == null || !implementationLocation.contains(implementationLocation1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = implementationLocation1;
		implementationLocation.remove(implementationLocation1);
		implementationLocation1._unlinkImplementation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
				new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeImplementationLocation"));
		return ret;
		// -end- 3A018E150193 remove_body358A5F0B0113
		// "Artifact::removeImplementationLocation"
	}

	/**
	 * tests if a given ImplementationLocation is connected.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 test_head358A5F0B0113
	// "Artifact::containsImplementationLocation"
	public boolean containsImplementationLocation(Component implementationLocation1)
	// -end- 3A018E150193 test_head358A5F0B0113
	// "Artifact::containsImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 test_body358A5F0B0113
		// "Artifact::containsImplementationLocation"
		return implementationLocation.contains(implementationLocation1);
		// -end- 3A018E150193 test_body358A5F0B0113
		// "Artifact::containsImplementationLocation"
	}

	/**
	 * used to enumerate all connected ImplementationLocations.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 get_all_head358A5F0B0113
	// "Artifact::iteratorImplementationLocation"
	public java.util.Iterator iteratorImplementationLocation()
	// -end- 3A018E150193 get_all_head358A5F0B0113
	// "Artifact::iteratorImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 get_all_body358A5F0B0113
		// "Artifact::iteratorImplementationLocation"
		return implementationLocation.iterator();
		// -end- 3A018E150193 get_all_body358A5F0B0113
		// "Artifact::iteratorImplementationLocation"
	}

	/**
	 * disconnect all ImplementationLocations.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 remove_all_head358A5F0B0113
	// "Artifact::clearImplementationLocation"
	public void clearImplementationLocation()
	// -end- 3A018E150193 remove_all_head358A5F0B0113
	// "Artifact::clearImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 remove_all_body358A5F0B0113
		// "Artifact::clearImplementationLocation"
		if (sizeImplementationLocation() > 0) {
			for (java.util.Iterator p = implementationLocation.iterator(); p.hasNext();) {
				((Component) p.next())._unlinkImplementation(this);
			}
			implementationLocation.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
					new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearImplementationLocation"));
		}
		// -end- 3A018E150193 remove_all_body358A5F0B0113
		// "Artifact::clearImplementationLocation"
	}

	/**
	 * returns the number of ImplementationLocations.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 size_head358A5F0B0113
	// "Artifact::sizeImplementationLocation"
	public int sizeImplementationLocation()
	// -end- 3A018E150193 size_head358A5F0B0113
	// "Artifact::sizeImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 size_body358A5F0B0113
		// "Artifact::sizeImplementationLocation"
		return implementationLocation.size();
		// -end- 3A018E150193 size_body358A5F0B0113
		// "Artifact::sizeImplementationLocation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3A018E150193 _link_body358A5F0B0113
	// "Artifact::_linkImplementationLocation"
	public void _linkImplementationLocation(Component implementationLocation1) {
		implementationLocation.add(implementationLocation1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkImplementationLocation"));
		return;
	}
	// -end- 3A018E150193 _link_body358A5F0B0113
	// "Artifact::_linkImplementationLocation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3A018E150193 _unlink_body358A5F0B0113
	// "Artifact::_unlinkImplementationLocation"
	public void _unlinkImplementationLocation(Component implementationLocation1) {
		implementationLocation.remove(implementationLocation1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(
				new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkImplementationLocation"));
		return;
	}
	// -end- 3A018E150193 _unlink_body358A5F0B0113
	// "Artifact::_unlinkImplementationLocation"

	// -beg- preserve=no 362409A9000A code358A5F0B0113 "presentation"

	// -end- 362409A9000A code358A5F0B0113 "presentation"

	/**
	 * add a Presentation.
	 *
	 * @see #removePresentation
	 * @see #containsPresentation
	 * @see #iteratorPresentation
	 * @see #clearPresentation
	 * @see #sizePresentation
	 */
	// -beg- preserve=no 362409A9000A add_head358A5F0B0113
	// "ModelElement::addPresentation"
	public void addPresentation(PresentationElement presentation1)
	// -end- 362409A9000A add_head358A5F0B0113 "ModelElement::addPresentation"
	{
		// -beg- preserve=no 362409A9000A add_body358A5F0B0113
		// "ModelElement::addPresentation"
		super.addPresentation(presentation1);
		// -end- 362409A9000A add_body358A5F0B0113
		// "ModelElement::addPresentation"
	}

	/**
	 * disconnect a Presentation.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_head358A5F0B0113
	// "ModelElement::removePresentation"
	public PresentationElement removePresentation(PresentationElement presentation1)
	// -end- 362409A9000A remove_head358A5F0B0113
	// "ModelElement::removePresentation"
	{
		// -beg- preserve=no 362409A9000A remove_body358A5F0B0113
		// "ModelElement::removePresentation"
		return super.removePresentation(presentation1);
		// -end- 362409A9000A remove_body358A5F0B0113
		// "ModelElement::removePresentation"
	}

	/**
	 * tests if a given Presentation is connected.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A test_head358A5F0B0113
	// "ModelElement::containsPresentation"
	public boolean containsPresentation(PresentationElement presentation1)
	// -end- 362409A9000A test_head358A5F0B0113
	// "ModelElement::containsPresentation"
	{
		// -beg- preserve=no 362409A9000A test_body358A5F0B0113
		// "ModelElement::containsPresentation"
		return super.containsPresentation(presentation1);
		// -end- 362409A9000A test_body358A5F0B0113
		// "ModelElement::containsPresentation"
	}

	/**
	 * used to enumerate all connected Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A get_all_head358A5F0B0113
	// "ModelElement::iteratorPresentation"
	public java.util.Iterator iteratorPresentation()
	// -end- 362409A9000A get_all_head358A5F0B0113
	// "ModelElement::iteratorPresentation"
	{
		// -beg- preserve=no 362409A9000A get_all_body358A5F0B0113
		// "ModelElement::iteratorPresentation"
		return super.iteratorPresentation();
		// -end- 362409A9000A get_all_body358A5F0B0113
		// "ModelElement::iteratorPresentation"
	}

	/**
	 * disconnect all Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_all_head358A5F0B0113
	// "ModelElement::clearPresentation"
	public void clearPresentation()
	// -end- 362409A9000A remove_all_head358A5F0B0113
	// "ModelElement::clearPresentation"
	{
		// -beg- preserve=no 362409A9000A remove_all_body358A5F0B0113
		// "ModelElement::clearPresentation"
		super.clearPresentation();
		// -end- 362409A9000A remove_all_body358A5F0B0113
		// "ModelElement::clearPresentation"
	}

	/**
	 * returns the number of Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A size_head358A5F0B0113
	// "ModelElement::sizePresentation"
	public int sizePresentation()
	// -end- 362409A9000A size_head358A5F0B0113 "ModelElement::sizePresentation"
	{
		// -beg- preserve=no 362409A9000A size_body358A5F0B0113
		// "ModelElement::sizePresentation"
		return super.sizePresentation();
		// -end- 362409A9000A size_body358A5F0B0113
		// "ModelElement::sizePresentation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _link_body358A5F0B0113
	// "ModelElement::_linkPresentation"
	public void _linkPresentation(PresentationElement presentation1) {
		super._linkPresentation(presentation1);
	}
	// -end- 362409A9000A _link_body358A5F0B0113
	// "ModelElement::_linkPresentation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _unlink_body358A5F0B0113
	// "ModelElement::_unlinkPresentation"
	public void _unlinkPresentation(PresentationElement presentation1) {
		super._unlinkPresentation(presentation1);
	}
	// -end- 362409A9000A _unlink_body358A5F0B0113
	// "ModelElement::_unlinkPresentation"

	/**
	 * tests if this Classifier contains a Feature with the given name
	 */
	// -beg- preserve=no 3CB2C64E0374 head358A5F0B0113 "containsFeature"
	public boolean containsFeature(String name)
	// -end- 3CB2C64E0374 head358A5F0B0113 "containsFeature"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CB2C64E0374 throws358A5F0B0113 "containsFeature"

	// -end- 3CB2C64E0374 throws358A5F0B0113 "containsFeature"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CB2C64E0374 body358A5F0B0113 "containsFeature"
		java.util.Iterator it = iteratorFeature();
		while (it.hasNext()) {
			ModelElement ele = (ModelElement) it.next();
			if (ele.getName().equals(name)) {
				return true;
			}
		}
		return false;
		// -end- 3CB2C64E0374 body358A5F0B0113 "containsFeature"
	}

	// -beg- preserve=no 33CF9EFC006E code358A5F0B0113 "objectFlowState"
	private java.util.Set objectFlowState = new java.util.HashSet();
	// -end- 33CF9EFC006E code358A5F0B0113 "objectFlowState"

	/**
	 * add a ObjectFlowState.
	 *
	 * @see #removeObjectFlowState
	 * @see #containsObjectFlowState
	 * @see #iteratorObjectFlowState
	 * @see #clearObjectFlowState
	 * @see #sizeObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E add_head358A5F0B0113
	// "Classifier::addObjectFlowState"
	public void addObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E add_head358A5F0B0113 "Classifier::addObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E add_body358A5F0B0113
		// "Classifier::addObjectFlowState"
		objectFlowState.add(objectFlowState1);
		objectFlowState1._linkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addObjectFlowState"));
		return;
		// -end- 33CF9EFC006E add_body358A5F0B0113
		// "Classifier::addObjectFlowState"
	}

	/**
	 * disconnect a ObjectFlowState.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_head358A5F0B0113
	// "Classifier::removeObjectFlowState"
	public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E remove_head358A5F0B0113
	// "Classifier::removeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_body358A5F0B0113
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
		// -end- 33CF9EFC006E remove_body358A5F0B0113
		// "Classifier::removeObjectFlowState"
	}

	/**
	 * tests if a given ObjectFlowState is connected.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E test_head358A5F0B0113
	// "Classifier::containsObjectFlowState"
	public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E test_head358A5F0B0113
	// "Classifier::containsObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E test_body358A5F0B0113
		// "Classifier::containsObjectFlowState"
		return objectFlowState.contains(objectFlowState1);
		// -end- 33CF9EFC006E test_body358A5F0B0113
		// "Classifier::containsObjectFlowState"
	}

	/**
	 * used to enumerate all connected ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E get_all_head358A5F0B0113
	// "Classifier::iteratorObjectFlowState"
	public java.util.Iterator iteratorObjectFlowState()
	// -end- 33CF9EFC006E get_all_head358A5F0B0113
	// "Classifier::iteratorObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E get_all_body358A5F0B0113
		// "Classifier::iteratorObjectFlowState"
		return objectFlowState.iterator();
		// -end- 33CF9EFC006E get_all_body358A5F0B0113
		// "Classifier::iteratorObjectFlowState"
	}

	/**
	 * disconnect all ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_all_head358A5F0B0113
	// "Classifier::clearObjectFlowState"
	public void clearObjectFlowState()
	// -end- 33CF9EFC006E remove_all_head358A5F0B0113
	// "Classifier::clearObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_all_body358A5F0B0113
		// "Classifier::clearObjectFlowState"
		if (sizeObjectFlowState() > 0) {
			for (java.util.Iterator p = objectFlowState.iterator(); p.hasNext();) {
				((ObjectFlowState) p.next())._unlinkType(this);
			}
			objectFlowState.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearObjectFlowState"));
		}
		// -end- 33CF9EFC006E remove_all_body358A5F0B0113
		// "Classifier::clearObjectFlowState"
	}

	/**
	 * returns the number of ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E size_head358A5F0B0113
	// "Classifier::sizeObjectFlowState"
	public int sizeObjectFlowState()
	// -end- 33CF9EFC006E size_head358A5F0B0113
	// "Classifier::sizeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E size_body358A5F0B0113
		// "Classifier::sizeObjectFlowState"
		return objectFlowState.size();
		// -end- 33CF9EFC006E size_body358A5F0B0113
		// "Classifier::sizeObjectFlowState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _link_body358A5F0B0113
	// "Classifier::_linkObjectFlowState"
	public void _linkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.add(objectFlowState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkObjectFlowState"));
		return;
	}
	// -end- 33CF9EFC006E _link_body358A5F0B0113
	// "Classifier::_linkObjectFlowState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _unlink_body358A5F0B0113
	// "Classifier::_unlinkObjectFlowState"
	public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.remove(objectFlowState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkObjectFlowState"));
		return;
	}
	// -end- 33CF9EFC006E _unlink_body358A5F0B0113
	// "Classifier::_unlinkObjectFlowState"

	// -beg- preserve=no 33CF9F1602BC code358A5F0B0113 "classifierInState"
	private java.util.Set classifierInState = new java.util.HashSet();
	// -end- 33CF9F1602BC code358A5F0B0113 "classifierInState"

	/**
	 * add a ClassifierInState.
	 *
	 * @see #removeClassifierInState
	 * @see #containsClassifierInState
	 * @see #iteratorClassifierInState
	 * @see #clearClassifierInState
	 * @see #sizeClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC add_head358A5F0B0113
	// "Classifier::addClassifierInState"
	public void addClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC add_head358A5F0B0113
	// "Classifier::addClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC add_body358A5F0B0113
		// "Classifier::addClassifierInState"
		classifierInState.add(classifierInState1);
		classifierInState1._linkType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addClassifierInState"));
		return;
		// -end- 33CF9F1602BC add_body358A5F0B0113
		// "Classifier::addClassifierInState"
	}

	/**
	 * disconnect a ClassifierInState.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_head358A5F0B0113
	// "Classifier::removeClassifierInState"
	public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC remove_head358A5F0B0113
	// "Classifier::removeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_body358A5F0B0113
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
		// -end- 33CF9F1602BC remove_body358A5F0B0113
		// "Classifier::removeClassifierInState"
	}

	/**
	 * tests if a given ClassifierInState is connected.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC test_head358A5F0B0113
	// "Classifier::containsClassifierInState"
	public boolean containsClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC test_head358A5F0B0113
	// "Classifier::containsClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC test_body358A5F0B0113
		// "Classifier::containsClassifierInState"
		return classifierInState.contains(classifierInState1);
		// -end- 33CF9F1602BC test_body358A5F0B0113
		// "Classifier::containsClassifierInState"
	}

	/**
	 * used to enumerate all connected ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC get_all_head358A5F0B0113
	// "Classifier::iteratorClassifierInState"
	public java.util.Iterator iteratorClassifierInState()
	// -end- 33CF9F1602BC get_all_head358A5F0B0113
	// "Classifier::iteratorClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC get_all_body358A5F0B0113
		// "Classifier::iteratorClassifierInState"
		return classifierInState.iterator();
		// -end- 33CF9F1602BC get_all_body358A5F0B0113
		// "Classifier::iteratorClassifierInState"
	}

	/**
	 * disconnect all ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_all_head358A5F0B0113
	// "Classifier::clearClassifierInState"
	public void clearClassifierInState()
	// -end- 33CF9F1602BC remove_all_head358A5F0B0113
	// "Classifier::clearClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_all_body358A5F0B0113
		// "Classifier::clearClassifierInState"
		if (sizeClassifierInState() > 0) {
			for (java.util.Iterator p = classifierInState.iterator(); p.hasNext();) {
				((ClassifierInState) p.next())._unlinkType(this);
			}
			classifierInState.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearClassifierInState"));
		}
		// -end- 33CF9F1602BC remove_all_body358A5F0B0113
		// "Classifier::clearClassifierInState"
	}

	/**
	 * returns the number of ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC size_head358A5F0B0113
	// "Classifier::sizeClassifierInState"
	public int sizeClassifierInState()
	// -end- 33CF9F1602BC size_head358A5F0B0113
	// "Classifier::sizeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC size_body358A5F0B0113
		// "Classifier::sizeClassifierInState"
		return classifierInState.size();
		// -end- 33CF9F1602BC size_body358A5F0B0113
		// "Classifier::sizeClassifierInState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _link_body358A5F0B0113
	// "Classifier::_linkClassifierInState"
	public void _linkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.add(classifierInState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkClassifierInState"));
		return;
	}
	// -end- 33CF9F1602BC _link_body358A5F0B0113
	// "Classifier::_linkClassifierInState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _unlink_body358A5F0B0113
	// "Classifier::_unlinkClassifierInState"
	public void _unlinkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.remove(classifierInState1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkClassifierInState"));
		return;
	}
	// -end- 33CF9F1602BC _unlink_body358A5F0B0113
	// "Classifier::_unlinkClassifierInState"

	// -beg- preserve=no 36008FB700E7 code358A5F0B0113 "classifierRole"

	// -end- 36008FB700E7 code358A5F0B0113 "classifierRole"

	/**
	 * add a ClassifierRole.
	 *
	 * @see #removeClassifierRole
	 * @see #containsClassifierRole
	 * @see #iteratorClassifierRole
	 * @see #clearClassifierRole
	 * @see #sizeClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 add_head358A5F0B0113
	// "ModelElement::addClassifierRole"
	public void addClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 add_head358A5F0B0113 "ModelElement::addClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 add_body358A5F0B0113
		// "ModelElement::addClassifierRole"
		super.addClassifierRole(classifierRole1);
		// -end- 36008FB700E7 add_body358A5F0B0113
		// "ModelElement::addClassifierRole"
	}

	/**
	 * disconnect a ClassifierRole.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_head358A5F0B0113
	// "ModelElement::removeClassifierRole"
	public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 remove_head358A5F0B0113
	// "ModelElement::removeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_body358A5F0B0113
		// "ModelElement::removeClassifierRole"
		return super.removeClassifierRole(classifierRole1);
		// -end- 36008FB700E7 remove_body358A5F0B0113
		// "ModelElement::removeClassifierRole"
	}

	/**
	 * tests if a given ClassifierRole is connected.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 test_head358A5F0B0113
	// "ModelElement::containsClassifierRole"
	public boolean containsClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 test_head358A5F0B0113
	// "ModelElement::containsClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 test_body358A5F0B0113
		// "ModelElement::containsClassifierRole"
		return super.containsClassifierRole(classifierRole1);
		// -end- 36008FB700E7 test_body358A5F0B0113
		// "ModelElement::containsClassifierRole"
	}

	/**
	 * used to enumerate all connected ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 get_all_head358A5F0B0113
	// "ModelElement::iteratorClassifierRole"
	public java.util.Iterator iteratorClassifierRole()
	// -end- 36008FB700E7 get_all_head358A5F0B0113
	// "ModelElement::iteratorClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 get_all_body358A5F0B0113
		// "ModelElement::iteratorClassifierRole"
		return super.iteratorClassifierRole();
		// -end- 36008FB700E7 get_all_body358A5F0B0113
		// "ModelElement::iteratorClassifierRole"
	}

	/**
	 * disconnect all ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_all_head358A5F0B0113
	// "ModelElement::clearClassifierRole"
	public void clearClassifierRole()
	// -end- 36008FB700E7 remove_all_head358A5F0B0113
	// "ModelElement::clearClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_all_body358A5F0B0113
		// "ModelElement::clearClassifierRole"
		super.clearClassifierRole();
		// -end- 36008FB700E7 remove_all_body358A5F0B0113
		// "ModelElement::clearClassifierRole"
	}

	/**
	 * returns the number of ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 size_head358A5F0B0113
	// "ModelElement::sizeClassifierRole"
	public int sizeClassifierRole()
	// -end- 36008FB700E7 size_head358A5F0B0113
	// "ModelElement::sizeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 size_body358A5F0B0113
		// "ModelElement::sizeClassifierRole"
		return super.sizeClassifierRole();
		// -end- 36008FB700E7 size_body358A5F0B0113
		// "ModelElement::sizeClassifierRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _link_body358A5F0B0113
	// "ModelElement::_linkClassifierRole"
	public void _linkClassifierRole(ClassifierRole classifierRole1) {
		super._linkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _link_body358A5F0B0113
	// "ModelElement::_linkClassifierRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _unlink_body358A5F0B0113
	// "ModelElement::_unlinkClassifierRole"
	public void _unlinkClassifierRole(ClassifierRole classifierRole1) {
		super._unlinkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _unlink_body358A5F0B0113
	// "ModelElement::_unlinkClassifierRole"

	// -beg- preserve=no 33D1394E029F code358A5F0B0113 "collaboration"

	// -end- 33D1394E029F code358A5F0B0113 "collaboration"

	/**
	 * add a Collaboration.
	 *
	 * @see #removeCollaboration
	 * @see #containsCollaboration
	 * @see #iteratorCollaboration
	 * @see #clearCollaboration
	 * @see #sizeCollaboration
	 */
	// -beg- preserve=no 33D1394E029F add_head358A5F0B0113
	// "ModelElement::addCollaboration"
	public void addCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F add_head358A5F0B0113 "ModelElement::addCollaboration"
	{
		// -beg- preserve=no 33D1394E029F add_body358A5F0B0113
		// "ModelElement::addCollaboration"
		super.addCollaboration(collaboration1);
		// -end- 33D1394E029F add_body358A5F0B0113
		// "ModelElement::addCollaboration"
	}

	/**
	 * disconnect a Collaboration.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_head358A5F0B0113
	// "ModelElement::removeCollaboration"
	public Collaboration removeCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F remove_head358A5F0B0113
	// "ModelElement::removeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_body358A5F0B0113
		// "ModelElement::removeCollaboration"
		return super.removeCollaboration(collaboration1);
		// -end- 33D1394E029F remove_body358A5F0B0113
		// "ModelElement::removeCollaboration"
	}

	/**
	 * tests if a given Collaboration is connected.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F test_head358A5F0B0113
	// "ModelElement::containsCollaboration"
	public boolean containsCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F test_head358A5F0B0113
	// "ModelElement::containsCollaboration"
	{
		// -beg- preserve=no 33D1394E029F test_body358A5F0B0113
		// "ModelElement::containsCollaboration"
		return super.containsCollaboration(collaboration1);
		// -end- 33D1394E029F test_body358A5F0B0113
		// "ModelElement::containsCollaboration"
	}

	/**
	 * used to enumerate all connected Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F get_all_head358A5F0B0113
	// "ModelElement::iteratorCollaboration"
	public java.util.Iterator iteratorCollaboration()
	// -end- 33D1394E029F get_all_head358A5F0B0113
	// "ModelElement::iteratorCollaboration"
	{
		// -beg- preserve=no 33D1394E029F get_all_body358A5F0B0113
		// "ModelElement::iteratorCollaboration"
		return super.iteratorCollaboration();
		// -end- 33D1394E029F get_all_body358A5F0B0113
		// "ModelElement::iteratorCollaboration"
	}

	/**
	 * disconnect all Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_all_head358A5F0B0113
	// "ModelElement::clearCollaboration"
	public void clearCollaboration()
	// -end- 33D1394E029F remove_all_head358A5F0B0113
	// "ModelElement::clearCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_all_body358A5F0B0113
		// "ModelElement::clearCollaboration"
		super.clearCollaboration();
		// -end- 33D1394E029F remove_all_body358A5F0B0113
		// "ModelElement::clearCollaboration"
	}

	/**
	 * returns the number of Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F size_head358A5F0B0113
	// "ModelElement::sizeCollaboration"
	public int sizeCollaboration()
	// -end- 33D1394E029F size_head358A5F0B0113
	// "ModelElement::sizeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F size_body358A5F0B0113
		// "ModelElement::sizeCollaboration"
		return super.sizeCollaboration();
		// -end- 33D1394E029F size_body358A5F0B0113
		// "ModelElement::sizeCollaboration"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _link_body358A5F0B0113
	// "ModelElement::_linkCollaboration"
	public void _linkCollaboration(Collaboration collaboration1) {
		super._linkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _link_body358A5F0B0113
	// "ModelElement::_linkCollaboration"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _unlink_body358A5F0B0113
	// "ModelElement::_unlinkCollaboration"
	public void _unlinkCollaboration(Collaboration collaboration1) {
		super._unlinkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _unlink_body358A5F0B0113
	// "ModelElement::_unlinkCollaboration"

	// -beg- preserve=no 33CAD7E900AB code358A5F0B0113 "instance"
	private java.util.Set instance = new java.util.HashSet();
	// -end- 33CAD7E900AB code358A5F0B0113 "instance"

	/**
	 * add a Instance.
	 *
	 * @see #removeInstance
	 * @see #containsInstance
	 * @see #iteratorInstance
	 * @see #clearInstance
	 * @see #sizeInstance
	 */
	// -beg- preserve=no 33CAD7E900AB add_head358A5F0B0113
	// "Classifier::addInstance"
	public void addInstance(Instance instance1)
	// -end- 33CAD7E900AB add_head358A5F0B0113 "Classifier::addInstance"
	{
		// -beg- preserve=no 33CAD7E900AB add_body358A5F0B0113
		// "Classifier::addInstance"
		instance.add(instance1);
		instance1._linkClassifier(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addInstance"));
		return;
		// -end- 33CAD7E900AB add_body358A5F0B0113 "Classifier::addInstance"
	}

	/**
	 * disconnect a Instance.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_head358A5F0B0113
	// "Classifier::removeInstance"
	public Instance removeInstance(Instance instance1)
	// -end- 33CAD7E900AB remove_head358A5F0B0113 "Classifier::removeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_body358A5F0B0113
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
		// -end- 33CAD7E900AB remove_body358A5F0B0113
		// "Classifier::removeInstance"
	}

	/**
	 * tests if a given Instance is connected.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB test_head358A5F0B0113
	// "Classifier::containsInstance"
	public boolean containsInstance(Instance instance1)
	// -end- 33CAD7E900AB test_head358A5F0B0113 "Classifier::containsInstance"
	{
		// -beg- preserve=no 33CAD7E900AB test_body358A5F0B0113
		// "Classifier::containsInstance"
		return instance.contains(instance1);
		// -end- 33CAD7E900AB test_body358A5F0B0113
		// "Classifier::containsInstance"
	}

	/**
	 * used to enumerate all connected Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB get_all_head358A5F0B0113
	// "Classifier::iteratorInstance"
	public java.util.Iterator iteratorInstance()
	// -end- 33CAD7E900AB get_all_head358A5F0B0113
	// "Classifier::iteratorInstance"
	{
		// -beg- preserve=no 33CAD7E900AB get_all_body358A5F0B0113
		// "Classifier::iteratorInstance"
		return instance.iterator();
		// -end- 33CAD7E900AB get_all_body358A5F0B0113
		// "Classifier::iteratorInstance"
	}

	/**
	 * disconnect all Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_all_head358A5F0B0113
	// "Classifier::clearInstance"
	public void clearInstance()
	// -end- 33CAD7E900AB remove_all_head358A5F0B0113
	// "Classifier::clearInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_all_body358A5F0B0113
		// "Classifier::clearInstance"
		if (sizeInstance() > 0) {
			for (java.util.Iterator p = instance.iterator(); p.hasNext();) {
				((Instance) p.next())._unlinkClassifier(this);
			}
			instance.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearInstance"));
		}
		// -end- 33CAD7E900AB remove_all_body358A5F0B0113
		// "Classifier::clearInstance"
	}

	/**
	 * returns the number of Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB size_head358A5F0B0113
	// "Classifier::sizeInstance"
	public int sizeInstance()
	// -end- 33CAD7E900AB size_head358A5F0B0113 "Classifier::sizeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB size_body358A5F0B0113
		// "Classifier::sizeInstance"
		return instance.size();
		// -end- 33CAD7E900AB size_body358A5F0B0113 "Classifier::sizeInstance"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _link_body358A5F0B0113
	// "Classifier::_linkInstance"
	public void _linkInstance(Instance instance1) {
		instance.add(instance1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkInstance"));
		return;
	}
	// -end- 33CAD7E900AB _link_body358A5F0B0113 "Classifier::_linkInstance"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _unlink_body358A5F0B0113
	// "Classifier::_unlinkInstance"
	public void _unlinkInstance(Instance instance1) {
		instance.remove(instance1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkInstance"));
		return;
	}
	// -end- 33CAD7E900AB _unlink_body358A5F0B0113 "Classifier::_unlinkInstance"

	// -beg- preserve=no 33CFD0A701A4 code358A5F0B0113 "createAction"
	private java.util.Set createAction = new java.util.HashSet();
	// -end- 33CFD0A701A4 code358A5F0B0113 "createAction"

	/**
	 * add a CreateAction.
	 *
	 * @see #removeCreateAction
	 * @see #containsCreateAction
	 * @see #iteratorCreateAction
	 * @see #clearCreateAction
	 * @see #sizeCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 add_head358A5F0B0113
	// "Classifier::addCreateAction"
	public void addCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 add_head358A5F0B0113 "Classifier::addCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 add_body358A5F0B0113
		// "Classifier::addCreateAction"
		createAction.add(createAction1);
		createAction1._linkInstantiation(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addCreateAction"));
		return;
		// -end- 33CFD0A701A4 add_body358A5F0B0113 "Classifier::addCreateAction"
	}

	/**
	 * disconnect a CreateAction.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_head358A5F0B0113
	// "Classifier::removeCreateAction"
	public CreateAction removeCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 remove_head358A5F0B0113
	// "Classifier::removeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_body358A5F0B0113
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
		// -end- 33CFD0A701A4 remove_body358A5F0B0113
		// "Classifier::removeCreateAction"
	}

	/**
	 * tests if a given CreateAction is connected.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 test_head358A5F0B0113
	// "Classifier::containsCreateAction"
	public boolean containsCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 test_head358A5F0B0113
	// "Classifier::containsCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 test_body358A5F0B0113
		// "Classifier::containsCreateAction"
		return createAction.contains(createAction1);
		// -end- 33CFD0A701A4 test_body358A5F0B0113
		// "Classifier::containsCreateAction"
	}

	/**
	 * used to enumerate all connected CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 get_all_head358A5F0B0113
	// "Classifier::iteratorCreateAction"
	public java.util.Iterator iteratorCreateAction()
	// -end- 33CFD0A701A4 get_all_head358A5F0B0113
	// "Classifier::iteratorCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 get_all_body358A5F0B0113
		// "Classifier::iteratorCreateAction"
		return createAction.iterator();
		// -end- 33CFD0A701A4 get_all_body358A5F0B0113
		// "Classifier::iteratorCreateAction"
	}

	/**
	 * disconnect all CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_all_head358A5F0B0113
	// "Classifier::clearCreateAction"
	public void clearCreateAction()
	// -end- 33CFD0A701A4 remove_all_head358A5F0B0113
	// "Classifier::clearCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_all_body358A5F0B0113
		// "Classifier::clearCreateAction"
		if (sizeCreateAction() > 0) {
			for (java.util.Iterator p = createAction.iterator(); p.hasNext();) {
				((CreateAction) p.next())._unlinkInstantiation(this);
			}
			createAction.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearCreateAction"));
		}
		// -end- 33CFD0A701A4 remove_all_body358A5F0B0113
		// "Classifier::clearCreateAction"
	}

	/**
	 * returns the number of CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 size_head358A5F0B0113
	// "Classifier::sizeCreateAction"
	public int sizeCreateAction()
	// -end- 33CFD0A701A4 size_head358A5F0B0113 "Classifier::sizeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 size_body358A5F0B0113
		// "Classifier::sizeCreateAction"
		return createAction.size();
		// -end- 33CFD0A701A4 size_body358A5F0B0113
		// "Classifier::sizeCreateAction"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _link_body358A5F0B0113
	// "Classifier::_linkCreateAction"
	public void _linkCreateAction(CreateAction createAction1) {
		createAction.add(createAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkCreateAction"));
		return;
	}
	// -end- 33CFD0A701A4 _link_body358A5F0B0113 "Classifier::_linkCreateAction"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _unlink_body358A5F0B0113
	// "Classifier::_unlinkCreateAction"
	public void _unlinkCreateAction(CreateAction createAction1) {
		createAction.remove(createAction1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkCreateAction"));
		return;
	}
	// -end- 33CFD0A701A4 _unlink_body358A5F0B0113
	// "Classifier::_unlinkCreateAction"

	// -beg- preserve=no 32B5D7EF03D3 code358A5F0B0113 "feature"
	private java.util.List feature = new java.util.ArrayList();
	// -end- 32B5D7EF03D3 code358A5F0B0113 "feature"

	/**
	 * add a Feature.
	 *
	 * @see #removeFeature
	 * @see #containsFeature
	 * @see #iteratorFeature
	 * @see #clearFeature
	 * @see #sizeFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 add_head358A5F0B0113
	// "Classifier::addFeature"
	public void addFeature(Feature feature1)
	// -end- 32B5D7EF03D3 add_head358A5F0B0113 "Classifier::addFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add_body358A5F0B0113
		// "Classifier::addFeature"
		feature.add(feature1);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addFeature"));
		return;
		// -end- 32B5D7EF03D3 add_body358A5F0B0113 "Classifier::addFeature"
	}

	// -beg- preserve=no 32B5D7EF03D3 add2_head358A5F0B0113
	// "Classifier::add2Feature"
	public void addFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 add2_head358A5F0B0113 "Classifier::add2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add2_body358A5F0B0113
		// "Classifier::add2Feature"
		feature.add(index, feature1);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addFeature"));
		return;
		// -end- 32B5D7EF03D3 add2_body358A5F0B0113 "Classifier::add2Feature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_head358A5F0B0113
	// "Classifier::removeFeature"
	public Feature removeFeature(Feature feature1)
	// -end- 32B5D7EF03D3 remove_head358A5F0B0113 "Classifier::removeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_body358A5F0B0113
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
		// -end- 32B5D7EF03D3 remove_body358A5F0B0113
		// "Classifier::removeFeature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove2_head358A5F0B0113
	// "Classifier::remove2Feature"
	public Feature removeFeature(int index)
	// -end- 32B5D7EF03D3 remove2_head358A5F0B0113 "Classifier::remove2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove2_body358A5F0B0113
		// "Classifier::remove2Feature"
		Feature ret = null;
		ret = (Feature) feature.remove(index);
		ret._unlinkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeFeature"));
		return ret;
		// -end- 32B5D7EF03D3 remove2_body358A5F0B0113
		// "Classifier::remove2Feature"
	}

	/**
	 * change a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 set_head358A5F0B0113
	// "Classifier::setFeature"
	public Feature setFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 set_head358A5F0B0113 "Classifier::setFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 set_body358A5F0B0113
		// "Classifier::setFeature"
		Feature ret = null;
		ret = (Feature) feature.set(index, feature1);
		ret._unlinkOwner(this);
		feature1._linkOwner(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setFeature"));
		return ret;
		// -end- 32B5D7EF03D3 set_body358A5F0B0113 "Classifier::setFeature"
	}

	/**
	 * tests if a given Feature is connected.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 test_head358A5F0B0113
	// "Classifier::containsFeature"
	public boolean containsFeature(Feature feature1)
	// -end- 32B5D7EF03D3 test_head358A5F0B0113 "Classifier::containsFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 test_body358A5F0B0113
		// "Classifier::containsFeature"
		return feature.contains(feature1);
		// -end- 32B5D7EF03D3 test_body358A5F0B0113
		// "Classifier::containsFeature"
	}

	/**
	 * used to enumerate all connected Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 get_all_head358A5F0B0113
	// "Classifier::iteratorFeature"
	public java.util.Iterator iteratorFeature()
	// -end- 32B5D7EF03D3 get_all_head358A5F0B0113 "Classifier::iteratorFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 get_all_body358A5F0B0113
		// "Classifier::iteratorFeature"
		return feature.iterator();
		// -end- 32B5D7EF03D3 get_all_body358A5F0B0113
		// "Classifier::iteratorFeature"
	}

	/**
	 * disconnect all Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_all_head358A5F0B0113
	// "Classifier::clearFeature"
	public void clearFeature()
	// -end- 32B5D7EF03D3 remove_all_head358A5F0B0113 "Classifier::clearFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_all_body358A5F0B0113
		// "Classifier::clearFeature"
		if (sizeFeature() > 0) {
			for (java.util.Iterator p = feature.iterator(); p.hasNext();) {
				((Feature) p.next())._unlinkOwner(this);
			}
			feature.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearFeature"));
		}
		// -end- 32B5D7EF03D3 remove_all_body358A5F0B0113
		// "Classifier::clearFeature"
	}

	/**
	 * returns the number of Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 size_head358A5F0B0113
	// "Classifier::sizeFeature"
	public int sizeFeature()
	// -end- 32B5D7EF03D3 size_head358A5F0B0113 "Classifier::sizeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 size_body358A5F0B0113
		// "Classifier::sizeFeature"
		return feature.size();
		// -end- 32B5D7EF03D3 size_body358A5F0B0113 "Classifier::sizeFeature"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _link_body358A5F0B0113
	// "Classifier::_linkFeature"
	public void _linkFeature(Feature feature1) {
		feature.add(feature1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkFeature"));
		return;
	}
	// -end- 32B5D7EF03D3 _link_body358A5F0B0113 "Classifier::_linkFeature"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _unlink_body358A5F0B0113
	// "Classifier::_unlinkFeature"
	public void _unlinkFeature(Feature feature1) {
		feature.remove(feature1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkFeature"));
		return;
	}
	// -end- 32B5D7EF03D3 _unlink_body358A5F0B0113 "Classifier::_unlinkFeature"

	// -beg- preserve=no 33E265070353 code358A5F0B0113 "association"
	private java.util.Set association = new java.util.HashSet();
	// -end- 33E265070353 code358A5F0B0113 "association"

	/**
	 * add a Association.
	 *
	 * @see #removeAssociation
	 * @see #containsAssociation
	 * @see #iteratorAssociation
	 * @see #clearAssociation
	 * @see #sizeAssociation
	 */
	// -beg- preserve=no 33E265070353 add_head358A5F0B0113
	// "Classifier::addAssociation"
	public void addAssociation(AssociationEnd association1)
	// -end- 33E265070353 add_head358A5F0B0113 "Classifier::addAssociation"
	{
		// -beg- preserve=no 33E265070353 add_body358A5F0B0113
		// "Classifier::addAssociation"
		association.add(association1);
		association1._linkParticipant(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAssociation"));
		return;
		// -end- 33E265070353 add_body358A5F0B0113 "Classifier::addAssociation"
	}

	/**
	 * disconnect a Association.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_head358A5F0B0113
	// "Classifier::removeAssociation"
	public AssociationEnd removeAssociation(AssociationEnd association1)
	// -end- 33E265070353 remove_head358A5F0B0113
	// "Classifier::removeAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_body358A5F0B0113
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
		// -end- 33E265070353 remove_body358A5F0B0113
		// "Classifier::removeAssociation"
	}

	/**
	 * tests if a given Association is connected.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 test_head358A5F0B0113
	// "Classifier::containsAssociation"
	public boolean containsAssociation(AssociationEnd association1)
	// -end- 33E265070353 test_head358A5F0B0113
	// "Classifier::containsAssociation"
	{
		// -beg- preserve=no 33E265070353 test_body358A5F0B0113
		// "Classifier::containsAssociation"
		return association.contains(association1);
		// -end- 33E265070353 test_body358A5F0B0113
		// "Classifier::containsAssociation"
	}

	/**
	 * used to enumerate all connected Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 get_all_head358A5F0B0113
	// "Classifier::iteratorAssociation"
	public java.util.Iterator iteratorAssociation()
	// -end- 33E265070353 get_all_head358A5F0B0113
	// "Classifier::iteratorAssociation"
	{
		// -beg- preserve=no 33E265070353 get_all_body358A5F0B0113
		// "Classifier::iteratorAssociation"
		return association.iterator();
		// -end- 33E265070353 get_all_body358A5F0B0113
		// "Classifier::iteratorAssociation"
	}

	/**
	 * disconnect all Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_all_head358A5F0B0113
	// "Classifier::clearAssociation"
	public void clearAssociation()
	// -end- 33E265070353 remove_all_head358A5F0B0113
	// "Classifier::clearAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_all_body358A5F0B0113
		// "Classifier::clearAssociation"
		if (sizeAssociation() > 0) {
			for (java.util.Iterator p = association.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkParticipant(this);
			}
			association.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAssociation"));
		}
		// -end- 33E265070353 remove_all_body358A5F0B0113
		// "Classifier::clearAssociation"
	}

	/**
	 * returns the number of Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 size_head358A5F0B0113
	// "Classifier::sizeAssociation"
	public int sizeAssociation()
	// -end- 33E265070353 size_head358A5F0B0113 "Classifier::sizeAssociation"
	{
		// -beg- preserve=no 33E265070353 size_body358A5F0B0113
		// "Classifier::sizeAssociation"
		return association.size();
		// -end- 33E265070353 size_body358A5F0B0113
		// "Classifier::sizeAssociation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _link_body358A5F0B0113
	// "Classifier::_linkAssociation"
	public void _linkAssociation(AssociationEnd association1) {
		association.add(association1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAssociation"));
		return;
	}
	// -end- 33E265070353 _link_body358A5F0B0113 "Classifier::_linkAssociation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _unlink_body358A5F0B0113
	// "Classifier::_unlinkAssociation"
	public void _unlinkAssociation(AssociationEnd association1) {
		association.remove(association1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAssociation"));
		return;
	}
	// -end- 33E265070353 _unlink_body358A5F0B0113
	// "Classifier::_unlinkAssociation"

	// -beg- preserve=no 33F0EFAD00AB code358A5F0B0113 "specifiedEnd"
	private java.util.Set specifiedEnd = new java.util.HashSet();
	// -end- 33F0EFAD00AB code358A5F0B0113 "specifiedEnd"

	/**
	 * add a SpecifiedEnd.
	 *
	 * @see #removeSpecifiedEnd
	 * @see #containsSpecifiedEnd
	 * @see #iteratorSpecifiedEnd
	 * @see #clearSpecifiedEnd
	 * @see #sizeSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB add_head358A5F0B0113
	// "Classifier::addSpecifiedEnd"
	public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB add_head358A5F0B0113 "Classifier::addSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB add_body358A5F0B0113
		// "Classifier::addSpecifiedEnd"
		specifiedEnd.add(specifiedEnd1);
		specifiedEnd1._linkSpecification(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecifiedEnd"));
		return;
		// -end- 33F0EFAD00AB add_body358A5F0B0113 "Classifier::addSpecifiedEnd"
	}

	/**
	 * disconnect a SpecifiedEnd.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_head358A5F0B0113
	// "Classifier::removeSpecifiedEnd"
	public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB remove_head358A5F0B0113
	// "Classifier::removeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_body358A5F0B0113
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
		// -end- 33F0EFAD00AB remove_body358A5F0B0113
		// "Classifier::removeSpecifiedEnd"
	}

	/**
	 * tests if a given SpecifiedEnd is connected.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB test_head358A5F0B0113
	// "Classifier::containsSpecifiedEnd"
	public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB test_head358A5F0B0113
	// "Classifier::containsSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB test_body358A5F0B0113
		// "Classifier::containsSpecifiedEnd"
		return specifiedEnd.contains(specifiedEnd1);
		// -end- 33F0EFAD00AB test_body358A5F0B0113
		// "Classifier::containsSpecifiedEnd"
	}

	/**
	 * used to enumerate all connected SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB get_all_head358A5F0B0113
	// "Classifier::iteratorSpecifiedEnd"
	public java.util.Iterator iteratorSpecifiedEnd()
	// -end- 33F0EFAD00AB get_all_head358A5F0B0113
	// "Classifier::iteratorSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB get_all_body358A5F0B0113
		// "Classifier::iteratorSpecifiedEnd"
		return specifiedEnd.iterator();
		// -end- 33F0EFAD00AB get_all_body358A5F0B0113
		// "Classifier::iteratorSpecifiedEnd"
	}

	/**
	 * disconnect all SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_all_head358A5F0B0113
	// "Classifier::clearSpecifiedEnd"
	public void clearSpecifiedEnd()
	// -end- 33F0EFAD00AB remove_all_head358A5F0B0113
	// "Classifier::clearSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_all_body358A5F0B0113
		// "Classifier::clearSpecifiedEnd"
		if (sizeSpecifiedEnd() > 0) {
			for (java.util.Iterator p = specifiedEnd.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkSpecification(this);
			}
			specifiedEnd.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecifiedEnd"));
		}
		// -end- 33F0EFAD00AB remove_all_body358A5F0B0113
		// "Classifier::clearSpecifiedEnd"
	}

	/**
	 * returns the number of SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB size_head358A5F0B0113
	// "Classifier::sizeSpecifiedEnd"
	public int sizeSpecifiedEnd()
	// -end- 33F0EFAD00AB size_head358A5F0B0113 "Classifier::sizeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB size_body358A5F0B0113
		// "Classifier::sizeSpecifiedEnd"
		return specifiedEnd.size();
		// -end- 33F0EFAD00AB size_body358A5F0B0113
		// "Classifier::sizeSpecifiedEnd"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _link_body358A5F0B0113
	// "Classifier::_linkSpecifiedEnd"
	public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.add(specifiedEnd1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecifiedEnd"));
		return;
	}
	// -end- 33F0EFAD00AB _link_body358A5F0B0113 "Classifier::_linkSpecifiedEnd"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _unlink_body358A5F0B0113
	// "Classifier::_unlinkSpecifiedEnd"
	public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.remove(specifiedEnd1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecifiedEnd"));
		return;
	}
	// -end- 33F0EFAD00AB _unlink_body358A5F0B0113
	// "Classifier::_unlinkSpecifiedEnd"

	// -beg- preserve=no 36E96A87033E code358A5F0B0113 "powertypeRange"
	private java.util.Set powertypeRange = new java.util.HashSet();
	// -end- 36E96A87033E code358A5F0B0113 "powertypeRange"

	/**
	 * add a PowertypeRange.
	 *
	 * @see #removePowertypeRange
	 * @see #containsPowertypeRange
	 * @see #iteratorPowertypeRange
	 * @see #clearPowertypeRange
	 * @see #sizePowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E add_head358A5F0B0113
	// "Classifier::addPowertypeRange"
	public void addPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E add_head358A5F0B0113 "Classifier::addPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E add_body358A5F0B0113
		// "Classifier::addPowertypeRange"
		powertypeRange.add(powertypeRange1);
		powertypeRange1._linkPowertype(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addPowertypeRange"));
		return;
		// -end- 36E96A87033E add_body358A5F0B0113
		// "Classifier::addPowertypeRange"
	}

	/**
	 * disconnect a PowertypeRange.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_head358A5F0B0113
	// "Classifier::removePowertypeRange"
	public Generalization removePowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E remove_head358A5F0B0113
	// "Classifier::removePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_body358A5F0B0113
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
		// -end- 36E96A87033E remove_body358A5F0B0113
		// "Classifier::removePowertypeRange"
	}

	/**
	 * tests if a given PowertypeRange is connected.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E test_head358A5F0B0113
	// "Classifier::containsPowertypeRange"
	public boolean containsPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E test_head358A5F0B0113
	// "Classifier::containsPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E test_body358A5F0B0113
		// "Classifier::containsPowertypeRange"
		return powertypeRange.contains(powertypeRange1);
		// -end- 36E96A87033E test_body358A5F0B0113
		// "Classifier::containsPowertypeRange"
	}

	/**
	 * used to enumerate all connected PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E get_all_head358A5F0B0113
	// "Classifier::iteratorPowertypeRange"
	public java.util.Iterator iteratorPowertypeRange()
	// -end- 36E96A87033E get_all_head358A5F0B0113
	// "Classifier::iteratorPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E get_all_body358A5F0B0113
		// "Classifier::iteratorPowertypeRange"
		return powertypeRange.iterator();
		// -end- 36E96A87033E get_all_body358A5F0B0113
		// "Classifier::iteratorPowertypeRange"
	}

	/**
	 * disconnect all PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_all_head358A5F0B0113
	// "Classifier::clearPowertypeRange"
	public void clearPowertypeRange()
	// -end- 36E96A87033E remove_all_head358A5F0B0113
	// "Classifier::clearPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_all_body358A5F0B0113
		// "Classifier::clearPowertypeRange"
		if (sizePowertypeRange() > 0) {
			for (java.util.Iterator p = powertypeRange.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkPowertype(this);
			}
			powertypeRange.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearPowertypeRange"));
		}
		// -end- 36E96A87033E remove_all_body358A5F0B0113
		// "Classifier::clearPowertypeRange"
	}

	/**
	 * returns the number of PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E size_head358A5F0B0113
	// "Classifier::sizePowertypeRange"
	public int sizePowertypeRange()
	// -end- 36E96A87033E size_head358A5F0B0113 "Classifier::sizePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E size_body358A5F0B0113
		// "Classifier::sizePowertypeRange"
		return powertypeRange.size();
		// -end- 36E96A87033E size_body358A5F0B0113
		// "Classifier::sizePowertypeRange"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _link_body358A5F0B0113
	// "Classifier::_linkPowertypeRange"
	public void _linkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.add(powertypeRange1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkPowertypeRange"));
		return;
	}
	// -end- 36E96A87033E _link_body358A5F0B0113
	// "Classifier::_linkPowertypeRange"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _unlink_body358A5F0B0113
	// "Classifier::_unlinkPowertypeRange"
	public void _unlinkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.remove(powertypeRange1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkPowertypeRange"));
		return;
	}
	// -end- 36E96A87033E _unlink_body358A5F0B0113
	// "Classifier::_unlinkPowertypeRange"

	// -beg- preserve=no 335C14A5019A code358A5F0B0113 "generalization"
	private java.util.Set generalization = new java.util.HashSet();
	// -end- 335C14A5019A code358A5F0B0113 "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head358A5F0B0113
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head358A5F0B0113
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body358A5F0B0113
		// "GeneralizableElement::addGeneralization"
		generalization.add(generalization1);
		generalization1._linkChild(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addGeneralization"));
		return;
		// -end- 335C14A5019A add_body358A5F0B0113
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head358A5F0B0113
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head358A5F0B0113
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body358A5F0B0113
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
		// -end- 335C14A5019A remove_body358A5F0B0113
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head358A5F0B0113
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head358A5F0B0113
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body358A5F0B0113
		// "GeneralizableElement::containsGeneralization"
		return generalization.contains(generalization1);
		// -end- 335C14A5019A test_body358A5F0B0113
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head358A5F0B0113
	// "GeneralizableElement::iteratorGeneralization"
	public java.util.Iterator iteratorGeneralization()
	// -end- 335C14A5019A get_all_head358A5F0B0113
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body358A5F0B0113
		// "GeneralizableElement::iteratorGeneralization"
		return generalization.iterator();
		// -end- 335C14A5019A get_all_body358A5F0B0113
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head358A5F0B0113
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head358A5F0B0113
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body358A5F0B0113
		// "GeneralizableElement::clearGeneralization"
		if (sizeGeneralization() > 0) {
			for (java.util.Iterator p = generalization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkChild(this);
			}
			generalization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearGeneralization"));
		}
		// -end- 335C14A5019A remove_all_body358A5F0B0113
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head358A5F0B0113
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head358A5F0B0113
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body358A5F0B0113
		// "GeneralizableElement::sizeGeneralization"
		return generalization.size();
		// -end- 335C14A5019A size_body358A5F0B0113
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body358A5F0B0113
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		generalization.add(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _link_body358A5F0B0113
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body358A5F0B0113
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		generalization.remove(generalization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkGeneralization"));
		return;
	}
	// -end- 335C14A5019A _unlink_body358A5F0B0113
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code358A5F0B0113 "specialization"
	private java.util.Set specialization = new java.util.HashSet();
	// -end- 335C146B01D6 code358A5F0B0113 "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head358A5F0B0113
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head358A5F0B0113
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body358A5F0B0113
		// "GeneralizableElement::addSpecialization"
		specialization.add(specialization1);
		specialization1._linkParent(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSpecialization"));
		return;
		// -end- 335C146B01D6 add_body358A5F0B0113
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head358A5F0B0113
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head358A5F0B0113
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body358A5F0B0113
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
		// -end- 335C146B01D6 remove_body358A5F0B0113
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head358A5F0B0113
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head358A5F0B0113
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body358A5F0B0113
		// "GeneralizableElement::containsSpecialization"
		return specialization.contains(specialization1);
		// -end- 335C146B01D6 test_body358A5F0B0113
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head358A5F0B0113
	// "GeneralizableElement::iteratorSpecialization"
	public java.util.Iterator iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head358A5F0B0113
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body358A5F0B0113
		// "GeneralizableElement::iteratorSpecialization"
		return specialization.iterator();
		// -end- 335C146B01D6 get_all_body358A5F0B0113
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head358A5F0B0113
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head358A5F0B0113
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body358A5F0B0113
		// "GeneralizableElement::clearSpecialization"
		if (sizeSpecialization() > 0) {
			for (java.util.Iterator p = specialization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkParent(this);
			}
			specialization.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSpecialization"));
		}
		// -end- 335C146B01D6 remove_all_body358A5F0B0113
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head358A5F0B0113
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head358A5F0B0113
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body358A5F0B0113
		// "GeneralizableElement::sizeSpecialization"
		return specialization.size();
		// -end- 335C146B01D6 size_body358A5F0B0113
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body358A5F0B0113
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		specialization.add(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _link_body358A5F0B0113
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body358A5F0B0113
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		specialization.remove(specialization1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkSpecialization"));
		return;
	}
	// -end- 335C146B01D6 _unlink_body358A5F0B0113
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 327A877801CC var358A5F0B0113 "isRoot"
	private boolean isRoot;
	// -end- 327A877801CC var358A5F0B0113 "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head358A5F0B0113 "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head358A5F0B0113 "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body358A5F0B0113 "isRoot"
		return isRoot;
		// -end- 327A877801CC get_body358A5F0B0113 "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head358A5F0B0113 "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head358A5F0B0113 "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body358A5F0B0113 "isRoot"
		if (isRoot != value1) {
			isRoot = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRoot"));
		}
		// -end- 327A877801CC set_body358A5F0B0113 "isRoot"
	}

	// -beg- preserve=no 327A877E006E var358A5F0B0113 "isLeaf"
	private boolean isLeaf;
	// -end- 327A877E006E var358A5F0B0113 "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head358A5F0B0113 "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head358A5F0B0113 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body358A5F0B0113 "isLeaf"
		return isLeaf;
		// -end- 327A877E006E get_body358A5F0B0113 "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head358A5F0B0113 "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head358A5F0B0113 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body358A5F0B0113 "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLeaf"));
		}
		// -end- 327A877E006E set_body358A5F0B0113 "isLeaf"
	}

	// -beg- preserve=no 327A878400D2 var358A5F0B0113 "isAbstract"
	private boolean isAbstract;
	// -end- 327A878400D2 var358A5F0B0113 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 327A878400D2 get_head358A5F0B0113 "isAbstract"
	public boolean isAbstract()
	// -end- 327A878400D2 get_head358A5F0B0113 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 get_body358A5F0B0113 "isAbstract"
		return isAbstract;
		// -end- 327A878400D2 get_body358A5F0B0113 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 327A878400D2 set_head358A5F0B0113 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 327A878400D2 set_head358A5F0B0113 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 set_body358A5F0B0113 "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAbstract"));
		}
		// -end- 327A878400D2 set_body358A5F0B0113 "isAbstract"
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
	// -beg- preserve=no 358A5F0B0113 detail_end "INTERLIS2Def"

	// -end- 358A5F0B0113 detail_end "INTERLIS2Def"

}
