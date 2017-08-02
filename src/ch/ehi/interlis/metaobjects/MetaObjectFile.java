// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:35:19 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3D6248EA02E3 package "MetaObjectFile"
package ch.ehi.interlis.metaobjects;
// -end- 3D6248EA02E3 package "MetaObjectFile"

// -beg- preserve=no 3D6248EA02E3 autoimport "MetaObjectFile"
import ch.ehi.uml1_4.foundation.core.Artifact;
import ch.ehi.uml1_4.implementation.AbstractNamespace;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ElementOwnership;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
import ch.ehi.uml1_4.behaviour.activitygraphs.ObjectFlowState;
import ch.ehi.uml1_4.behaviour.activitygraphs.ClassifierInState;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.CreateAction;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Generalization;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.uml1_4.behaviour.statemachines.StateMachine;
import ch.ehi.uml1_4.behaviour.activitygraphs.Partition;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.foundation.core.Dependency;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.ElementResidence;
import ch.ehi.uml1_4.foundation.core.TemplateParameter;
import ch.ehi.uml1_4.foundation.core.Flow;
import ch.ehi.uml1_4.foundation.core.Comment;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3D6248EA02E3 autoimport "MetaObjectFile"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3D6248EA02E3 import "MetaObjectFile"

// -end- 3D6248EA02E3 import "MetaObjectFile"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:19 $
 */
public class MetaObjectFile extends AbstractNamespace implements Artifact {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3D6248EA02E3 detail_begin "MetaObjectFile"

	// -end- 3D6248EA02E3 detail_begin "MetaObjectFile"

	/**
	 * return the list of valid owned elements for this namespace.
	 */
	// -beg- preserve=no 3D624B32001C head3D6248EA02E3 "getValidOwnedElements"
	public String[] getValidOwnedElements()
	// -end- 3D624B32001C head3D6248EA02E3 "getValidOwnedElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D624B32001C throws3D6248EA02E3 "getValidOwnedElements"

	// -end- 3D624B32001C throws3D6248EA02E3 "getValidOwnedElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D624B32001C body3D6248EA02E3
		// "getValidOwnedElements"
		return null;
		// -end- 3D624B32001C body3D6248EA02E3 "getValidOwnedElements"
	}

	// -beg- preserve=no 33598CAA030E code3D6248EA02E3 "namespace"

	// -end- 33598CAA030E code3D6248EA02E3 "namespace"

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
	// -beg- preserve=no 33598CAA030E attach_head3D6248EA02E3
	// "ModelElement::attachNamespace"
	public void attachNamespace(Namespace namespace1)
	// -end- 33598CAA030E attach_head3D6248EA02E3
	// "ModelElement::attachNamespace"
	{
		// -beg- preserve=no 33598CAA030E attach_body3D6248EA02E3
		// "ModelElement::attachNamespace"
		super.attachNamespace(namespace1);
		// -end- 33598CAA030E attach_body3D6248EA02E3
		// "ModelElement::attachNamespace"
	}

	/**
	 * attaches a link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E attachlink_head3D6248EA02E3
	// "ModelElement::attachNamespaceLink"
	public void attachNamespaceLink(ElementOwnership namespace1)
	// -end- 33598CAA030E attachlink_head3D6248EA02E3
	// "ModelElement::attachNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E attachlink_body3D6248EA02E3
		// "ModelElement::attachNamespaceLink"
		super.attachNamespaceLink(namespace1);
		// -end- 33598CAA030E attachlink_body3D6248EA02E3
		// "ModelElement::attachNamespaceLink"
	}

	/**
	 * disconnect the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E detach_head3D6248EA02E3
	// "ModelElement::detachNamespace"
	public Namespace detachNamespace()
	// -end- 33598CAA030E detach_head3D6248EA02E3
	// "ModelElement::detachNamespace"
	{
		// -beg- preserve=no 33598CAA030E detach_body3D6248EA02E3
		// "ModelElement::detachNamespace"
		return super.detachNamespace();
		// -end- 33598CAA030E detach_body3D6248EA02E3
		// "ModelElement::detachNamespace"
	}

	/**
	 * get the currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E get_head3D6248EA02E3
	// "ModelElement::getNamespace"
	public Namespace getNamespace()
	// -end- 33598CAA030E get_head3D6248EA02E3 "ModelElement::getNamespace"
	{
		// -beg- preserve=no 33598CAA030E get_body3D6248EA02E3
		// "ModelElement::getNamespace"
		return super.getNamespace();
		// -end- 33598CAA030E get_body3D6248EA02E3 "ModelElement::getNamespace"
	}

	/**
	 * get the link class of currently attached Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E getlink_head3D6248EA02E3
	// "ModelElement::getNamespaceLink"
	public ElementOwnership getNamespaceLink()
	// -end- 33598CAA030E getlink_head3D6248EA02E3
	// "ModelElement::getNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E getlink_body3D6248EA02E3
		// "ModelElement::getNamespaceLink"
		return super.getNamespaceLink();
		// -end- 33598CAA030E getlink_body3D6248EA02E3
		// "ModelElement::getNamespaceLink"
	}

	/**
	 * create a link class for a new link to a Namespace.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E createlink_head3D6248EA02E3
	// "ModelElement::createNamespaceLink"
	public ElementOwnership createNamespaceLink()
	// -end- 33598CAA030E createlink_head3D6248EA02E3
	// "ModelElement::createNamespaceLink"
	{
		// -beg- preserve=no 33598CAA030E createlink_body3D6248EA02E3
		// "ModelElement::createNamespaceLink"
		return super.createNamespaceLink();
		// -end- 33598CAA030E createlink_body3D6248EA02E3
		// "ModelElement::createNamespaceLink"
	}

	/**
	 * tests if there is a Namespace attached.
	 * 
	 * @see #attachNamespace
	 */
	// -beg- preserve=no 33598CAA030E test_head3D6248EA02E3
	// "ModelElement::containsNamespace"
	public boolean containsNamespace()
	// -end- 33598CAA030E test_head3D6248EA02E3
	// "ModelElement::containsNamespace"
	{
		// -beg- preserve=no 33598CAA030E test_body3D6248EA02E3
		// "ModelElement::containsNamespace"
		return super.containsNamespace();
		// -end- 33598CAA030E test_body3D6248EA02E3
		// "ModelElement::containsNamespace"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _link_body3D6248EA02E3
	// "ModelElement::_linkNamespace"
	public void _linkNamespace(ElementOwnership namespace1) {
		super._linkNamespace(namespace1);
	}
	// -end- 33598CAA030E _link_body3D6248EA02E3 "ModelElement::_linkNamespace"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33598CAA030E _unlink_body3D6248EA02E3
	// "ModelElement::_unlinkNamespace"
	public void _unlinkNamespace(ElementOwnership namespace1) {
		super._unlinkNamespace(namespace1);
	}
	// -end- 33598CAA030E _unlink_body3D6248EA02E3
	// "ModelElement::_unlinkNamespace"

	// -beg- preserve=no 3A018E150193 code3D6248EA02E3 "implementationLocation"
	private java.util.Set implementationLocation = new java.util.HashSet();
	// -end- 3A018E150193 code3D6248EA02E3 "implementationLocation"

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
	// -beg- preserve=no 3A018E150193 add_head3D6248EA02E3
	// "Artifact::addImplementationLocation"
	public void addImplementationLocation(Component implementationLocation1)
	// -end- 3A018E150193 add_head3D6248EA02E3
	// "Artifact::addImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 add_body3D6248EA02E3
		// "Artifact::addImplementationLocation"
		implementationLocation.add(implementationLocation1);
		implementationLocation1._linkImplementation(this);

		return;
		// -end- 3A018E150193 add_body3D6248EA02E3
		// "Artifact::addImplementationLocation"
	}

	/**
	 * disconnect a ImplementationLocation.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 remove_head3D6248EA02E3
	// "Artifact::removeImplementationLocation"
	public Component removeImplementationLocation(Component implementationLocation1)
	// -end- 3A018E150193 remove_head3D6248EA02E3
	// "Artifact::removeImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 remove_body3D6248EA02E3
		// "Artifact::removeImplementationLocation"
		Component ret = null;
		if (implementationLocation1 == null || !implementationLocation.contains(implementationLocation1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = implementationLocation1;
		implementationLocation.remove(implementationLocation1);
		implementationLocation1._unlinkImplementation(this);

		return ret;
		// -end- 3A018E150193 remove_body3D6248EA02E3
		// "Artifact::removeImplementationLocation"
	}

	/**
	 * tests if a given ImplementationLocation is connected.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 test_head3D6248EA02E3
	// "Artifact::containsImplementationLocation"
	public boolean containsImplementationLocation(Component implementationLocation1)
	// -end- 3A018E150193 test_head3D6248EA02E3
	// "Artifact::containsImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 test_body3D6248EA02E3
		// "Artifact::containsImplementationLocation"
		return implementationLocation.contains(implementationLocation1);
		// -end- 3A018E150193 test_body3D6248EA02E3
		// "Artifact::containsImplementationLocation"
	}

	/**
	 * used to enumerate all connected ImplementationLocations.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 get_all_head3D6248EA02E3
	// "Artifact::iteratorImplementationLocation"
	public java.util.Iterator iteratorImplementationLocation()
	// -end- 3A018E150193 get_all_head3D6248EA02E3
	// "Artifact::iteratorImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 get_all_body3D6248EA02E3
		// "Artifact::iteratorImplementationLocation"
		return implementationLocation.iterator();
		// -end- 3A018E150193 get_all_body3D6248EA02E3
		// "Artifact::iteratorImplementationLocation"
	}

	/**
	 * disconnect all ImplementationLocations.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 remove_all_head3D6248EA02E3
	// "Artifact::clearImplementationLocation"
	public void clearImplementationLocation()
	// -end- 3A018E150193 remove_all_head3D6248EA02E3
	// "Artifact::clearImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 remove_all_body3D6248EA02E3
		// "Artifact::clearImplementationLocation"
		if (sizeImplementationLocation() > 0) {
			for (java.util.Iterator p = implementationLocation.iterator(); p.hasNext();) {
				((Component) p.next())._unlinkImplementation(this);
			}
			implementationLocation.clear();

		}
		// -end- 3A018E150193 remove_all_body3D6248EA02E3
		// "Artifact::clearImplementationLocation"
	}

	/**
	 * returns the number of ImplementationLocations.
	 * 
	 * @see #addImplementationLocation
	 */
	// -beg- preserve=no 3A018E150193 size_head3D6248EA02E3
	// "Artifact::sizeImplementationLocation"
	public int sizeImplementationLocation()
	// -end- 3A018E150193 size_head3D6248EA02E3
	// "Artifact::sizeImplementationLocation"
	{
		// -beg- preserve=no 3A018E150193 size_body3D6248EA02E3
		// "Artifact::sizeImplementationLocation"
		return implementationLocation.size();
		// -end- 3A018E150193 size_body3D6248EA02E3
		// "Artifact::sizeImplementationLocation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3A018E150193 _link_body3D6248EA02E3
	// "Artifact::_linkImplementationLocation"
	public void _linkImplementationLocation(Component implementationLocation1) {
		implementationLocation.add(implementationLocation1);

		return;
	}
	// -end- 3A018E150193 _link_body3D6248EA02E3
	// "Artifact::_linkImplementationLocation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3A018E150193 _unlink_body3D6248EA02E3
	// "Artifact::_unlinkImplementationLocation"
	public void _unlinkImplementationLocation(Component implementationLocation1) {
		implementationLocation.remove(implementationLocation1);

		return;
	}
	// -end- 3A018E150193 _unlink_body3D6248EA02E3
	// "Artifact::_unlinkImplementationLocation"

	// -beg- preserve=no 362409A9000A code3D6248EA02E3 "presentation"

	// -end- 362409A9000A code3D6248EA02E3 "presentation"

	/**
	 * add a Presentation.
	 *
	 * @see #removePresentation
	 * @see #containsPresentation
	 * @see #iteratorPresentation
	 * @see #clearPresentation
	 * @see #sizePresentation
	 */
	// -beg- preserve=no 362409A9000A add_head3D6248EA02E3
	// "ModelElement::addPresentation"
	public void addPresentation(PresentationElement presentation1)
	// -end- 362409A9000A add_head3D6248EA02E3 "ModelElement::addPresentation"
	{
		// -beg- preserve=no 362409A9000A add_body3D6248EA02E3
		// "ModelElement::addPresentation"
		super.addPresentation(presentation1);
		// -end- 362409A9000A add_body3D6248EA02E3
		// "ModelElement::addPresentation"
	}

	/**
	 * disconnect a Presentation.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_head3D6248EA02E3
	// "ModelElement::removePresentation"
	public PresentationElement removePresentation(PresentationElement presentation1)
	// -end- 362409A9000A remove_head3D6248EA02E3
	// "ModelElement::removePresentation"
	{
		// -beg- preserve=no 362409A9000A remove_body3D6248EA02E3
		// "ModelElement::removePresentation"
		return super.removePresentation(presentation1);
		// -end- 362409A9000A remove_body3D6248EA02E3
		// "ModelElement::removePresentation"
	}

	/**
	 * tests if a given Presentation is connected.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A test_head3D6248EA02E3
	// "ModelElement::containsPresentation"
	public boolean containsPresentation(PresentationElement presentation1)
	// -end- 362409A9000A test_head3D6248EA02E3
	// "ModelElement::containsPresentation"
	{
		// -beg- preserve=no 362409A9000A test_body3D6248EA02E3
		// "ModelElement::containsPresentation"
		return super.containsPresentation(presentation1);
		// -end- 362409A9000A test_body3D6248EA02E3
		// "ModelElement::containsPresentation"
	}

	/**
	 * used to enumerate all connected Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A get_all_head3D6248EA02E3
	// "ModelElement::iteratorPresentation"
	public java.util.Iterator iteratorPresentation()
	// -end- 362409A9000A get_all_head3D6248EA02E3
	// "ModelElement::iteratorPresentation"
	{
		// -beg- preserve=no 362409A9000A get_all_body3D6248EA02E3
		// "ModelElement::iteratorPresentation"
		return super.iteratorPresentation();
		// -end- 362409A9000A get_all_body3D6248EA02E3
		// "ModelElement::iteratorPresentation"
	}

	/**
	 * disconnect all Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A remove_all_head3D6248EA02E3
	// "ModelElement::clearPresentation"
	public void clearPresentation()
	// -end- 362409A9000A remove_all_head3D6248EA02E3
	// "ModelElement::clearPresentation"
	{
		// -beg- preserve=no 362409A9000A remove_all_body3D6248EA02E3
		// "ModelElement::clearPresentation"
		super.clearPresentation();
		// -end- 362409A9000A remove_all_body3D6248EA02E3
		// "ModelElement::clearPresentation"
	}

	/**
	 * returns the number of Presentations.
	 * 
	 * @see #addPresentation
	 */
	// -beg- preserve=no 362409A9000A size_head3D6248EA02E3
	// "ModelElement::sizePresentation"
	public int sizePresentation()
	// -end- 362409A9000A size_head3D6248EA02E3 "ModelElement::sizePresentation"
	{
		// -beg- preserve=no 362409A9000A size_body3D6248EA02E3
		// "ModelElement::sizePresentation"
		return super.sizePresentation();
		// -end- 362409A9000A size_body3D6248EA02E3
		// "ModelElement::sizePresentation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _link_body3D6248EA02E3
	// "ModelElement::_linkPresentation"
	public void _linkPresentation(PresentationElement presentation1) {
		super._linkPresentation(presentation1);
	}
	// -end- 362409A9000A _link_body3D6248EA02E3
	// "ModelElement::_linkPresentation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A9000A _unlink_body3D6248EA02E3
	// "ModelElement::_unlinkPresentation"
	public void _unlinkPresentation(PresentationElement presentation1) {
		super._unlinkPresentation(presentation1);
	}
	// -end- 362409A9000A _unlink_body3D6248EA02E3
	// "ModelElement::_unlinkPresentation"

	/**
	 * tests if this Classifier contains a Feature with the given name
	 */
	// -beg- preserve=no 3CB2C64E0374 head3D6248EA02E3 "containsFeature"
	public boolean containsFeature(String name)
	// -end- 3CB2C64E0374 head3D6248EA02E3 "containsFeature"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CB2C64E0374 throws3D6248EA02E3 "containsFeature"

	// -end- 3CB2C64E0374 throws3D6248EA02E3 "containsFeature"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CB2C64E0374 body3D6248EA02E3 "containsFeature"
		return false;
		// -end- 3CB2C64E0374 body3D6248EA02E3 "containsFeature"
	}

	// -beg- preserve=no 33CF9EFC006E code3D6248EA02E3 "objectFlowState"
	private java.util.Set objectFlowState = new java.util.HashSet();
	// -end- 33CF9EFC006E code3D6248EA02E3 "objectFlowState"

	/**
	 * add a ObjectFlowState.
	 *
	 * @see #removeObjectFlowState
	 * @see #containsObjectFlowState
	 * @see #iteratorObjectFlowState
	 * @see #clearObjectFlowState
	 * @see #sizeObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E add_head3D6248EA02E3
	// "Classifier::addObjectFlowState"
	public void addObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E add_head3D6248EA02E3 "Classifier::addObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E add_body3D6248EA02E3
		// "Classifier::addObjectFlowState"
		objectFlowState.add(objectFlowState1);
		objectFlowState1._linkType(this);

		return;
		// -end- 33CF9EFC006E add_body3D6248EA02E3
		// "Classifier::addObjectFlowState"
	}

	/**
	 * disconnect a ObjectFlowState.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_head3D6248EA02E3
	// "Classifier::removeObjectFlowState"
	public ObjectFlowState removeObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E remove_head3D6248EA02E3
	// "Classifier::removeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_body3D6248EA02E3
		// "Classifier::removeObjectFlowState"
		ObjectFlowState ret = null;
		if (objectFlowState1 == null || !objectFlowState.contains(objectFlowState1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = objectFlowState1;
		objectFlowState.remove(objectFlowState1);
		objectFlowState1._unlinkType(this);

		return ret;
		// -end- 33CF9EFC006E remove_body3D6248EA02E3
		// "Classifier::removeObjectFlowState"
	}

	/**
	 * tests if a given ObjectFlowState is connected.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E test_head3D6248EA02E3
	// "Classifier::containsObjectFlowState"
	public boolean containsObjectFlowState(ObjectFlowState objectFlowState1)
	// -end- 33CF9EFC006E test_head3D6248EA02E3
	// "Classifier::containsObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E test_body3D6248EA02E3
		// "Classifier::containsObjectFlowState"
		return objectFlowState.contains(objectFlowState1);
		// -end- 33CF9EFC006E test_body3D6248EA02E3
		// "Classifier::containsObjectFlowState"
	}

	/**
	 * used to enumerate all connected ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E get_all_head3D6248EA02E3
	// "Classifier::iteratorObjectFlowState"
	public java.util.Iterator iteratorObjectFlowState()
	// -end- 33CF9EFC006E get_all_head3D6248EA02E3
	// "Classifier::iteratorObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E get_all_body3D6248EA02E3
		// "Classifier::iteratorObjectFlowState"
		return objectFlowState.iterator();
		// -end- 33CF9EFC006E get_all_body3D6248EA02E3
		// "Classifier::iteratorObjectFlowState"
	}

	/**
	 * disconnect all ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E remove_all_head3D6248EA02E3
	// "Classifier::clearObjectFlowState"
	public void clearObjectFlowState()
	// -end- 33CF9EFC006E remove_all_head3D6248EA02E3
	// "Classifier::clearObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E remove_all_body3D6248EA02E3
		// "Classifier::clearObjectFlowState"
		if (sizeObjectFlowState() > 0) {
			for (java.util.Iterator p = objectFlowState.iterator(); p.hasNext();) {
				((ObjectFlowState) p.next())._unlinkType(this);
			}
			objectFlowState.clear();

		}
		// -end- 33CF9EFC006E remove_all_body3D6248EA02E3
		// "Classifier::clearObjectFlowState"
	}

	/**
	 * returns the number of ObjectFlowStates.
	 * 
	 * @see #addObjectFlowState
	 */
	// -beg- preserve=no 33CF9EFC006E size_head3D6248EA02E3
	// "Classifier::sizeObjectFlowState"
	public int sizeObjectFlowState()
	// -end- 33CF9EFC006E size_head3D6248EA02E3
	// "Classifier::sizeObjectFlowState"
	{
		// -beg- preserve=no 33CF9EFC006E size_body3D6248EA02E3
		// "Classifier::sizeObjectFlowState"
		return objectFlowState.size();
		// -end- 33CF9EFC006E size_body3D6248EA02E3
		// "Classifier::sizeObjectFlowState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _link_body3D6248EA02E3
	// "Classifier::_linkObjectFlowState"
	public void _linkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.add(objectFlowState1);

		return;
	}
	// -end- 33CF9EFC006E _link_body3D6248EA02E3
	// "Classifier::_linkObjectFlowState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9EFC006E _unlink_body3D6248EA02E3
	// "Classifier::_unlinkObjectFlowState"
	public void _unlinkObjectFlowState(ObjectFlowState objectFlowState1) {
		objectFlowState.remove(objectFlowState1);

		return;
	}
	// -end- 33CF9EFC006E _unlink_body3D6248EA02E3
	// "Classifier::_unlinkObjectFlowState"

	// -beg- preserve=no 33CF9F1602BC code3D6248EA02E3 "classifierInState"
	private java.util.Set classifierInState = new java.util.HashSet();
	// -end- 33CF9F1602BC code3D6248EA02E3 "classifierInState"

	/**
	 * add a ClassifierInState.
	 *
	 * @see #removeClassifierInState
	 * @see #containsClassifierInState
	 * @see #iteratorClassifierInState
	 * @see #clearClassifierInState
	 * @see #sizeClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC add_head3D6248EA02E3
	// "Classifier::addClassifierInState"
	public void addClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC add_head3D6248EA02E3
	// "Classifier::addClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC add_body3D6248EA02E3
		// "Classifier::addClassifierInState"
		classifierInState.add(classifierInState1);
		classifierInState1._linkType(this);

		return;
		// -end- 33CF9F1602BC add_body3D6248EA02E3
		// "Classifier::addClassifierInState"
	}

	/**
	 * disconnect a ClassifierInState.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_head3D6248EA02E3
	// "Classifier::removeClassifierInState"
	public ClassifierInState removeClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC remove_head3D6248EA02E3
	// "Classifier::removeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_body3D6248EA02E3
		// "Classifier::removeClassifierInState"
		ClassifierInState ret = null;
		if (classifierInState1 == null || !classifierInState.contains(classifierInState1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = classifierInState1;
		classifierInState.remove(classifierInState1);
		classifierInState1._unlinkType(this);

		return ret;
		// -end- 33CF9F1602BC remove_body3D6248EA02E3
		// "Classifier::removeClassifierInState"
	}

	/**
	 * tests if a given ClassifierInState is connected.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC test_head3D6248EA02E3
	// "Classifier::containsClassifierInState"
	public boolean containsClassifierInState(ClassifierInState classifierInState1)
	// -end- 33CF9F1602BC test_head3D6248EA02E3
	// "Classifier::containsClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC test_body3D6248EA02E3
		// "Classifier::containsClassifierInState"
		return classifierInState.contains(classifierInState1);
		// -end- 33CF9F1602BC test_body3D6248EA02E3
		// "Classifier::containsClassifierInState"
	}

	/**
	 * used to enumerate all connected ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC get_all_head3D6248EA02E3
	// "Classifier::iteratorClassifierInState"
	public java.util.Iterator iteratorClassifierInState()
	// -end- 33CF9F1602BC get_all_head3D6248EA02E3
	// "Classifier::iteratorClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC get_all_body3D6248EA02E3
		// "Classifier::iteratorClassifierInState"
		return classifierInState.iterator();
		// -end- 33CF9F1602BC get_all_body3D6248EA02E3
		// "Classifier::iteratorClassifierInState"
	}

	/**
	 * disconnect all ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC remove_all_head3D6248EA02E3
	// "Classifier::clearClassifierInState"
	public void clearClassifierInState()
	// -end- 33CF9F1602BC remove_all_head3D6248EA02E3
	// "Classifier::clearClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC remove_all_body3D6248EA02E3
		// "Classifier::clearClassifierInState"
		if (sizeClassifierInState() > 0) {
			for (java.util.Iterator p = classifierInState.iterator(); p.hasNext();) {
				((ClassifierInState) p.next())._unlinkType(this);
			}
			classifierInState.clear();

		}
		// -end- 33CF9F1602BC remove_all_body3D6248EA02E3
		// "Classifier::clearClassifierInState"
	}

	/**
	 * returns the number of ClassifierInStates.
	 * 
	 * @see #addClassifierInState
	 */
	// -beg- preserve=no 33CF9F1602BC size_head3D6248EA02E3
	// "Classifier::sizeClassifierInState"
	public int sizeClassifierInState()
	// -end- 33CF9F1602BC size_head3D6248EA02E3
	// "Classifier::sizeClassifierInState"
	{
		// -beg- preserve=no 33CF9F1602BC size_body3D6248EA02E3
		// "Classifier::sizeClassifierInState"
		return classifierInState.size();
		// -end- 33CF9F1602BC size_body3D6248EA02E3
		// "Classifier::sizeClassifierInState"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _link_body3D6248EA02E3
	// "Classifier::_linkClassifierInState"
	public void _linkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.add(classifierInState1);

		return;
	}
	// -end- 33CF9F1602BC _link_body3D6248EA02E3
	// "Classifier::_linkClassifierInState"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CF9F1602BC _unlink_body3D6248EA02E3
	// "Classifier::_unlinkClassifierInState"
	public void _unlinkClassifierInState(ClassifierInState classifierInState1) {
		classifierInState.remove(classifierInState1);

		return;
	}
	// -end- 33CF9F1602BC _unlink_body3D6248EA02E3
	// "Classifier::_unlinkClassifierInState"

	// -beg- preserve=no 36008FB700E7 code3D6248EA02E3 "classifierRole"

	// -end- 36008FB700E7 code3D6248EA02E3 "classifierRole"

	/**
	 * add a ClassifierRole.
	 *
	 * @see #removeClassifierRole
	 * @see #containsClassifierRole
	 * @see #iteratorClassifierRole
	 * @see #clearClassifierRole
	 * @see #sizeClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 add_head3D6248EA02E3
	// "ModelElement::addClassifierRole"
	public void addClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 add_head3D6248EA02E3 "ModelElement::addClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 add_body3D6248EA02E3
		// "ModelElement::addClassifierRole"
		super.addClassifierRole(classifierRole1);
		// -end- 36008FB700E7 add_body3D6248EA02E3
		// "ModelElement::addClassifierRole"
	}

	/**
	 * disconnect a ClassifierRole.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_head3D6248EA02E3
	// "ModelElement::removeClassifierRole"
	public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 remove_head3D6248EA02E3
	// "ModelElement::removeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_body3D6248EA02E3
		// "ModelElement::removeClassifierRole"
		return super.removeClassifierRole(classifierRole1);
		// -end- 36008FB700E7 remove_body3D6248EA02E3
		// "ModelElement::removeClassifierRole"
	}

	/**
	 * tests if a given ClassifierRole is connected.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 test_head3D6248EA02E3
	// "ModelElement::containsClassifierRole"
	public boolean containsClassifierRole(ClassifierRole classifierRole1)
	// -end- 36008FB700E7 test_head3D6248EA02E3
	// "ModelElement::containsClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 test_body3D6248EA02E3
		// "ModelElement::containsClassifierRole"
		return super.containsClassifierRole(classifierRole1);
		// -end- 36008FB700E7 test_body3D6248EA02E3
		// "ModelElement::containsClassifierRole"
	}

	/**
	 * used to enumerate all connected ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 get_all_head3D6248EA02E3
	// "ModelElement::iteratorClassifierRole"
	public java.util.Iterator iteratorClassifierRole()
	// -end- 36008FB700E7 get_all_head3D6248EA02E3
	// "ModelElement::iteratorClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 get_all_body3D6248EA02E3
		// "ModelElement::iteratorClassifierRole"
		return super.iteratorClassifierRole();
		// -end- 36008FB700E7 get_all_body3D6248EA02E3
		// "ModelElement::iteratorClassifierRole"
	}

	/**
	 * disconnect all ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 remove_all_head3D6248EA02E3
	// "ModelElement::clearClassifierRole"
	public void clearClassifierRole()
	// -end- 36008FB700E7 remove_all_head3D6248EA02E3
	// "ModelElement::clearClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 remove_all_body3D6248EA02E3
		// "ModelElement::clearClassifierRole"
		super.clearClassifierRole();
		// -end- 36008FB700E7 remove_all_body3D6248EA02E3
		// "ModelElement::clearClassifierRole"
	}

	/**
	 * returns the number of ClassifierRoles.
	 * 
	 * @see #addClassifierRole
	 */
	// -beg- preserve=no 36008FB700E7 size_head3D6248EA02E3
	// "ModelElement::sizeClassifierRole"
	public int sizeClassifierRole()
	// -end- 36008FB700E7 size_head3D6248EA02E3
	// "ModelElement::sizeClassifierRole"
	{
		// -beg- preserve=no 36008FB700E7 size_body3D6248EA02E3
		// "ModelElement::sizeClassifierRole"
		return super.sizeClassifierRole();
		// -end- 36008FB700E7 size_body3D6248EA02E3
		// "ModelElement::sizeClassifierRole"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _link_body3D6248EA02E3
	// "ModelElement::_linkClassifierRole"
	public void _linkClassifierRole(ClassifierRole classifierRole1) {
		super._linkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _link_body3D6248EA02E3
	// "ModelElement::_linkClassifierRole"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36008FB700E7 _unlink_body3D6248EA02E3
	// "ModelElement::_unlinkClassifierRole"
	public void _unlinkClassifierRole(ClassifierRole classifierRole1) {
		super._unlinkClassifierRole(classifierRole1);
	}
	// -end- 36008FB700E7 _unlink_body3D6248EA02E3
	// "ModelElement::_unlinkClassifierRole"

	// -beg- preserve=no 33D1394E029F code3D6248EA02E3 "collaboration"

	// -end- 33D1394E029F code3D6248EA02E3 "collaboration"

	/**
	 * add a Collaboration.
	 *
	 * @see #removeCollaboration
	 * @see #containsCollaboration
	 * @see #iteratorCollaboration
	 * @see #clearCollaboration
	 * @see #sizeCollaboration
	 */
	// -beg- preserve=no 33D1394E029F add_head3D6248EA02E3
	// "ModelElement::addCollaboration"
	public void addCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F add_head3D6248EA02E3 "ModelElement::addCollaboration"
	{
		// -beg- preserve=no 33D1394E029F add_body3D6248EA02E3
		// "ModelElement::addCollaboration"
		super.addCollaboration(collaboration1);
		// -end- 33D1394E029F add_body3D6248EA02E3
		// "ModelElement::addCollaboration"
	}

	/**
	 * disconnect a Collaboration.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_head3D6248EA02E3
	// "ModelElement::removeCollaboration"
	public Collaboration removeCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F remove_head3D6248EA02E3
	// "ModelElement::removeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_body3D6248EA02E3
		// "ModelElement::removeCollaboration"
		return super.removeCollaboration(collaboration1);
		// -end- 33D1394E029F remove_body3D6248EA02E3
		// "ModelElement::removeCollaboration"
	}

	/**
	 * tests if a given Collaboration is connected.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F test_head3D6248EA02E3
	// "ModelElement::containsCollaboration"
	public boolean containsCollaboration(Collaboration collaboration1)
	// -end- 33D1394E029F test_head3D6248EA02E3
	// "ModelElement::containsCollaboration"
	{
		// -beg- preserve=no 33D1394E029F test_body3D6248EA02E3
		// "ModelElement::containsCollaboration"
		return super.containsCollaboration(collaboration1);
		// -end- 33D1394E029F test_body3D6248EA02E3
		// "ModelElement::containsCollaboration"
	}

	/**
	 * used to enumerate all connected Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F get_all_head3D6248EA02E3
	// "ModelElement::iteratorCollaboration"
	public java.util.Iterator iteratorCollaboration()
	// -end- 33D1394E029F get_all_head3D6248EA02E3
	// "ModelElement::iteratorCollaboration"
	{
		// -beg- preserve=no 33D1394E029F get_all_body3D6248EA02E3
		// "ModelElement::iteratorCollaboration"
		return super.iteratorCollaboration();
		// -end- 33D1394E029F get_all_body3D6248EA02E3
		// "ModelElement::iteratorCollaboration"
	}

	/**
	 * disconnect all Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F remove_all_head3D6248EA02E3
	// "ModelElement::clearCollaboration"
	public void clearCollaboration()
	// -end- 33D1394E029F remove_all_head3D6248EA02E3
	// "ModelElement::clearCollaboration"
	{
		// -beg- preserve=no 33D1394E029F remove_all_body3D6248EA02E3
		// "ModelElement::clearCollaboration"
		super.clearCollaboration();
		// -end- 33D1394E029F remove_all_body3D6248EA02E3
		// "ModelElement::clearCollaboration"
	}

	/**
	 * returns the number of Collaborations.
	 * 
	 * @see #addCollaboration
	 */
	// -beg- preserve=no 33D1394E029F size_head3D6248EA02E3
	// "ModelElement::sizeCollaboration"
	public int sizeCollaboration()
	// -end- 33D1394E029F size_head3D6248EA02E3
	// "ModelElement::sizeCollaboration"
	{
		// -beg- preserve=no 33D1394E029F size_body3D6248EA02E3
		// "ModelElement::sizeCollaboration"
		return super.sizeCollaboration();
		// -end- 33D1394E029F size_body3D6248EA02E3
		// "ModelElement::sizeCollaboration"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _link_body3D6248EA02E3
	// "ModelElement::_linkCollaboration"
	public void _linkCollaboration(Collaboration collaboration1) {
		super._linkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _link_body3D6248EA02E3
	// "ModelElement::_linkCollaboration"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33D1394E029F _unlink_body3D6248EA02E3
	// "ModelElement::_unlinkCollaboration"
	public void _unlinkCollaboration(Collaboration collaboration1) {
		super._unlinkCollaboration(collaboration1);
	}
	// -end- 33D1394E029F _unlink_body3D6248EA02E3
	// "ModelElement::_unlinkCollaboration"

	// -beg- preserve=no 33CAD7E900AB code3D6248EA02E3 "instance"
	private java.util.Set instance = new java.util.HashSet();
	// -end- 33CAD7E900AB code3D6248EA02E3 "instance"

	/**
	 * add a Instance.
	 *
	 * @see #removeInstance
	 * @see #containsInstance
	 * @see #iteratorInstance
	 * @see #clearInstance
	 * @see #sizeInstance
	 */
	// -beg- preserve=no 33CAD7E900AB add_head3D6248EA02E3
	// "Classifier::addInstance"
	public void addInstance(Instance instance1)
	// -end- 33CAD7E900AB add_head3D6248EA02E3 "Classifier::addInstance"
	{
		// -beg- preserve=no 33CAD7E900AB add_body3D6248EA02E3
		// "Classifier::addInstance"
		instance.add(instance1);
		instance1._linkClassifier(this);

		return;
		// -end- 33CAD7E900AB add_body3D6248EA02E3 "Classifier::addInstance"
	}

	/**
	 * disconnect a Instance.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_head3D6248EA02E3
	// "Classifier::removeInstance"
	public Instance removeInstance(Instance instance1)
	// -end- 33CAD7E900AB remove_head3D6248EA02E3 "Classifier::removeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_body3D6248EA02E3
		// "Classifier::removeInstance"
		Instance ret = null;
		if (instance1 == null || !instance.contains(instance1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = instance1;
		instance.remove(instance1);
		instance1._unlinkClassifier(this);

		return ret;
		// -end- 33CAD7E900AB remove_body3D6248EA02E3
		// "Classifier::removeInstance"
	}

	/**
	 * tests if a given Instance is connected.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB test_head3D6248EA02E3
	// "Classifier::containsInstance"
	public boolean containsInstance(Instance instance1)
	// -end- 33CAD7E900AB test_head3D6248EA02E3 "Classifier::containsInstance"
	{
		// -beg- preserve=no 33CAD7E900AB test_body3D6248EA02E3
		// "Classifier::containsInstance"
		return instance.contains(instance1);
		// -end- 33CAD7E900AB test_body3D6248EA02E3
		// "Classifier::containsInstance"
	}

	/**
	 * used to enumerate all connected Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB get_all_head3D6248EA02E3
	// "Classifier::iteratorInstance"
	public java.util.Iterator iteratorInstance()
	// -end- 33CAD7E900AB get_all_head3D6248EA02E3
	// "Classifier::iteratorInstance"
	{
		// -beg- preserve=no 33CAD7E900AB get_all_body3D6248EA02E3
		// "Classifier::iteratorInstance"
		return instance.iterator();
		// -end- 33CAD7E900AB get_all_body3D6248EA02E3
		// "Classifier::iteratorInstance"
	}

	/**
	 * disconnect all Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB remove_all_head3D6248EA02E3
	// "Classifier::clearInstance"
	public void clearInstance()
	// -end- 33CAD7E900AB remove_all_head3D6248EA02E3
	// "Classifier::clearInstance"
	{
		// -beg- preserve=no 33CAD7E900AB remove_all_body3D6248EA02E3
		// "Classifier::clearInstance"
		if (sizeInstance() > 0) {
			for (java.util.Iterator p = instance.iterator(); p.hasNext();) {
				((Instance) p.next())._unlinkClassifier(this);
			}
			instance.clear();

		}
		// -end- 33CAD7E900AB remove_all_body3D6248EA02E3
		// "Classifier::clearInstance"
	}

	/**
	 * returns the number of Instances.
	 * 
	 * @see #addInstance
	 */
	// -beg- preserve=no 33CAD7E900AB size_head3D6248EA02E3
	// "Classifier::sizeInstance"
	public int sizeInstance()
	// -end- 33CAD7E900AB size_head3D6248EA02E3 "Classifier::sizeInstance"
	{
		// -beg- preserve=no 33CAD7E900AB size_body3D6248EA02E3
		// "Classifier::sizeInstance"
		return instance.size();
		// -end- 33CAD7E900AB size_body3D6248EA02E3 "Classifier::sizeInstance"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _link_body3D6248EA02E3
	// "Classifier::_linkInstance"
	public void _linkInstance(Instance instance1) {
		instance.add(instance1);

		return;
	}
	// -end- 33CAD7E900AB _link_body3D6248EA02E3 "Classifier::_linkInstance"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CAD7E900AB _unlink_body3D6248EA02E3
	// "Classifier::_unlinkInstance"
	public void _unlinkInstance(Instance instance1) {
		instance.remove(instance1);

		return;
	}
	// -end- 33CAD7E900AB _unlink_body3D6248EA02E3 "Classifier::_unlinkInstance"

	// -beg- preserve=no 33CFD0A701A4 code3D6248EA02E3 "createAction"
	private java.util.Set createAction = new java.util.HashSet();
	// -end- 33CFD0A701A4 code3D6248EA02E3 "createAction"

	/**
	 * add a CreateAction.
	 *
	 * @see #removeCreateAction
	 * @see #containsCreateAction
	 * @see #iteratorCreateAction
	 * @see #clearCreateAction
	 * @see #sizeCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 add_head3D6248EA02E3
	// "Classifier::addCreateAction"
	public void addCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 add_head3D6248EA02E3 "Classifier::addCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 add_body3D6248EA02E3
		// "Classifier::addCreateAction"
		createAction.add(createAction1);
		createAction1._linkInstantiation(this);

		return;
		// -end- 33CFD0A701A4 add_body3D6248EA02E3 "Classifier::addCreateAction"
	}

	/**
	 * disconnect a CreateAction.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_head3D6248EA02E3
	// "Classifier::removeCreateAction"
	public CreateAction removeCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 remove_head3D6248EA02E3
	// "Classifier::removeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_body3D6248EA02E3
		// "Classifier::removeCreateAction"
		CreateAction ret = null;
		if (createAction1 == null || !createAction.contains(createAction1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = createAction1;
		createAction.remove(createAction1);
		createAction1._unlinkInstantiation(this);

		return ret;
		// -end- 33CFD0A701A4 remove_body3D6248EA02E3
		// "Classifier::removeCreateAction"
	}

	/**
	 * tests if a given CreateAction is connected.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 test_head3D6248EA02E3
	// "Classifier::containsCreateAction"
	public boolean containsCreateAction(CreateAction createAction1)
	// -end- 33CFD0A701A4 test_head3D6248EA02E3
	// "Classifier::containsCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 test_body3D6248EA02E3
		// "Classifier::containsCreateAction"
		return createAction.contains(createAction1);
		// -end- 33CFD0A701A4 test_body3D6248EA02E3
		// "Classifier::containsCreateAction"
	}

	/**
	 * used to enumerate all connected CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 get_all_head3D6248EA02E3
	// "Classifier::iteratorCreateAction"
	public java.util.Iterator iteratorCreateAction()
	// -end- 33CFD0A701A4 get_all_head3D6248EA02E3
	// "Classifier::iteratorCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 get_all_body3D6248EA02E3
		// "Classifier::iteratorCreateAction"
		return createAction.iterator();
		// -end- 33CFD0A701A4 get_all_body3D6248EA02E3
		// "Classifier::iteratorCreateAction"
	}

	/**
	 * disconnect all CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 remove_all_head3D6248EA02E3
	// "Classifier::clearCreateAction"
	public void clearCreateAction()
	// -end- 33CFD0A701A4 remove_all_head3D6248EA02E3
	// "Classifier::clearCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 remove_all_body3D6248EA02E3
		// "Classifier::clearCreateAction"
		if (sizeCreateAction() > 0) {
			for (java.util.Iterator p = createAction.iterator(); p.hasNext();) {
				((CreateAction) p.next())._unlinkInstantiation(this);
			}
			createAction.clear();

		}
		// -end- 33CFD0A701A4 remove_all_body3D6248EA02E3
		// "Classifier::clearCreateAction"
	}

	/**
	 * returns the number of CreateActions.
	 * 
	 * @see #addCreateAction
	 */
	// -beg- preserve=no 33CFD0A701A4 size_head3D6248EA02E3
	// "Classifier::sizeCreateAction"
	public int sizeCreateAction()
	// -end- 33CFD0A701A4 size_head3D6248EA02E3 "Classifier::sizeCreateAction"
	{
		// -beg- preserve=no 33CFD0A701A4 size_body3D6248EA02E3
		// "Classifier::sizeCreateAction"
		return createAction.size();
		// -end- 33CFD0A701A4 size_body3D6248EA02E3
		// "Classifier::sizeCreateAction"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _link_body3D6248EA02E3
	// "Classifier::_linkCreateAction"
	public void _linkCreateAction(CreateAction createAction1) {
		createAction.add(createAction1);

		return;
	}
	// -end- 33CFD0A701A4 _link_body3D6248EA02E3 "Classifier::_linkCreateAction"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33CFD0A701A4 _unlink_body3D6248EA02E3
	// "Classifier::_unlinkCreateAction"
	public void _unlinkCreateAction(CreateAction createAction1) {
		createAction.remove(createAction1);

		return;
	}
	// -end- 33CFD0A701A4 _unlink_body3D6248EA02E3
	// "Classifier::_unlinkCreateAction"

	// -beg- preserve=no 32B5D7EF03D3 code3D6248EA02E3 "feature"
	private java.util.List feature = new java.util.ArrayList();
	// -end- 32B5D7EF03D3 code3D6248EA02E3 "feature"

	/**
	 * add a Feature.
	 *
	 * @see #removeFeature
	 * @see #containsFeature
	 * @see #iteratorFeature
	 * @see #clearFeature
	 * @see #sizeFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 add_head3D6248EA02E3
	// "Classifier::addFeature"
	public void addFeature(Feature feature1)
	// -end- 32B5D7EF03D3 add_head3D6248EA02E3 "Classifier::addFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add_body3D6248EA02E3
		// "Classifier::addFeature"
		feature.add(feature1);
		feature1._linkOwner(this);

		return;
		// -end- 32B5D7EF03D3 add_body3D6248EA02E3 "Classifier::addFeature"
	}

	// -beg- preserve=no 32B5D7EF03D3 add2_head3D6248EA02E3
	// "Classifier::add2Feature"
	public void addFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 add2_head3D6248EA02E3 "Classifier::add2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 add2_body3D6248EA02E3
		// "Classifier::add2Feature"
		feature.add(index, feature1);
		feature1._linkOwner(this);

		return;
		// -end- 32B5D7EF03D3 add2_body3D6248EA02E3 "Classifier::add2Feature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_head3D6248EA02E3
	// "Classifier::removeFeature"
	public Feature removeFeature(Feature feature1)
	// -end- 32B5D7EF03D3 remove_head3D6248EA02E3 "Classifier::removeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_body3D6248EA02E3
		// "Classifier::removeFeature"
		Feature ret = null;
		if (feature1 == null || !feature.contains(feature1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = feature1;
		feature.remove(feature1);
		feature1._unlinkOwner(this);

		return ret;
		// -end- 32B5D7EF03D3 remove_body3D6248EA02E3
		// "Classifier::removeFeature"
	}

	/**
	 * disconnect a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove2_head3D6248EA02E3
	// "Classifier::remove2Feature"
	public Feature removeFeature(int index)
	// -end- 32B5D7EF03D3 remove2_head3D6248EA02E3 "Classifier::remove2Feature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove2_body3D6248EA02E3
		// "Classifier::remove2Feature"
		Feature ret = null;
		ret = (Feature) feature.remove(index);
		ret._unlinkOwner(this);

		return ret;
		// -end- 32B5D7EF03D3 remove2_body3D6248EA02E3
		// "Classifier::remove2Feature"
	}

	/**
	 * change a Feature.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 set_head3D6248EA02E3
	// "Classifier::setFeature"
	public Feature setFeature(int index, Feature feature1)
	// -end- 32B5D7EF03D3 set_head3D6248EA02E3 "Classifier::setFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 set_body3D6248EA02E3
		// "Classifier::setFeature"
		Feature ret = null;
		ret = (Feature) feature.set(index, feature1);
		ret._unlinkOwner(this);
		feature1._linkOwner(this);

		return ret;
		// -end- 32B5D7EF03D3 set_body3D6248EA02E3 "Classifier::setFeature"
	}

	/**
	 * tests if a given Feature is connected.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 test_head3D6248EA02E3
	// "Classifier::containsFeature"
	public boolean containsFeature(Feature feature1)
	// -end- 32B5D7EF03D3 test_head3D6248EA02E3 "Classifier::containsFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 test_body3D6248EA02E3
		// "Classifier::containsFeature"
		return feature.contains(feature1);
		// -end- 32B5D7EF03D3 test_body3D6248EA02E3
		// "Classifier::containsFeature"
	}

	/**
	 * used to enumerate all connected Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 get_all_head3D6248EA02E3
	// "Classifier::iteratorFeature"
	public java.util.Iterator iteratorFeature()
	// -end- 32B5D7EF03D3 get_all_head3D6248EA02E3 "Classifier::iteratorFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 get_all_body3D6248EA02E3
		// "Classifier::iteratorFeature"
		return feature.iterator();
		// -end- 32B5D7EF03D3 get_all_body3D6248EA02E3
		// "Classifier::iteratorFeature"
	}

	/**
	 * disconnect all Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 remove_all_head3D6248EA02E3
	// "Classifier::clearFeature"
	public void clearFeature()
	// -end- 32B5D7EF03D3 remove_all_head3D6248EA02E3 "Classifier::clearFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 remove_all_body3D6248EA02E3
		// "Classifier::clearFeature"
		if (sizeFeature() > 0) {
			for (java.util.Iterator p = feature.iterator(); p.hasNext();) {
				((Feature) p.next())._unlinkOwner(this);
			}
			feature.clear();

		}
		// -end- 32B5D7EF03D3 remove_all_body3D6248EA02E3
		// "Classifier::clearFeature"
	}

	/**
	 * returns the number of Features.
	 * 
	 * @see #addFeature
	 */
	// -beg- preserve=no 32B5D7EF03D3 size_head3D6248EA02E3
	// "Classifier::sizeFeature"
	public int sizeFeature()
	// -end- 32B5D7EF03D3 size_head3D6248EA02E3 "Classifier::sizeFeature"
	{
		// -beg- preserve=no 32B5D7EF03D3 size_body3D6248EA02E3
		// "Classifier::sizeFeature"
		return feature.size();
		// -end- 32B5D7EF03D3 size_body3D6248EA02E3 "Classifier::sizeFeature"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _link_body3D6248EA02E3
	// "Classifier::_linkFeature"
	public void _linkFeature(Feature feature1) {
		feature.add(feature1);

		return;
	}
	// -end- 32B5D7EF03D3 _link_body3D6248EA02E3 "Classifier::_linkFeature"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 32B5D7EF03D3 _unlink_body3D6248EA02E3
	// "Classifier::_unlinkFeature"
	public void _unlinkFeature(Feature feature1) {
		feature.remove(feature1);

		return;
	}
	// -end- 32B5D7EF03D3 _unlink_body3D6248EA02E3 "Classifier::_unlinkFeature"

	// -beg- preserve=no 33E265070353 code3D6248EA02E3 "association"
	private java.util.Set association = new java.util.HashSet();
	// -end- 33E265070353 code3D6248EA02E3 "association"

	/**
	 * add a Association.
	 *
	 * @see #removeAssociation
	 * @see #containsAssociation
	 * @see #iteratorAssociation
	 * @see #clearAssociation
	 * @see #sizeAssociation
	 */
	// -beg- preserve=no 33E265070353 add_head3D6248EA02E3
	// "Classifier::addAssociation"
	public void addAssociation(AssociationEnd association1)
	// -end- 33E265070353 add_head3D6248EA02E3 "Classifier::addAssociation"
	{
		// -beg- preserve=no 33E265070353 add_body3D6248EA02E3
		// "Classifier::addAssociation"
		association.add(association1);
		association1._linkParticipant(this);

		return;
		// -end- 33E265070353 add_body3D6248EA02E3 "Classifier::addAssociation"
	}

	/**
	 * disconnect a Association.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_head3D6248EA02E3
	// "Classifier::removeAssociation"
	public AssociationEnd removeAssociation(AssociationEnd association1)
	// -end- 33E265070353 remove_head3D6248EA02E3
	// "Classifier::removeAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_body3D6248EA02E3
		// "Classifier::removeAssociation"
		AssociationEnd ret = null;
		if (association1 == null || !association.contains(association1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = association1;
		association.remove(association1);
		association1._unlinkParticipant(this);

		return ret;
		// -end- 33E265070353 remove_body3D6248EA02E3
		// "Classifier::removeAssociation"
	}

	/**
	 * tests if a given Association is connected.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 test_head3D6248EA02E3
	// "Classifier::containsAssociation"
	public boolean containsAssociation(AssociationEnd association1)
	// -end- 33E265070353 test_head3D6248EA02E3
	// "Classifier::containsAssociation"
	{
		// -beg- preserve=no 33E265070353 test_body3D6248EA02E3
		// "Classifier::containsAssociation"
		return association.contains(association1);
		// -end- 33E265070353 test_body3D6248EA02E3
		// "Classifier::containsAssociation"
	}

	/**
	 * used to enumerate all connected Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 get_all_head3D6248EA02E3
	// "Classifier::iteratorAssociation"
	public java.util.Iterator iteratorAssociation()
	// -end- 33E265070353 get_all_head3D6248EA02E3
	// "Classifier::iteratorAssociation"
	{
		// -beg- preserve=no 33E265070353 get_all_body3D6248EA02E3
		// "Classifier::iteratorAssociation"
		return association.iterator();
		// -end- 33E265070353 get_all_body3D6248EA02E3
		// "Classifier::iteratorAssociation"
	}

	/**
	 * disconnect all Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 remove_all_head3D6248EA02E3
	// "Classifier::clearAssociation"
	public void clearAssociation()
	// -end- 33E265070353 remove_all_head3D6248EA02E3
	// "Classifier::clearAssociation"
	{
		// -beg- preserve=no 33E265070353 remove_all_body3D6248EA02E3
		// "Classifier::clearAssociation"
		if (sizeAssociation() > 0) {
			for (java.util.Iterator p = association.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkParticipant(this);
			}
			association.clear();

		}
		// -end- 33E265070353 remove_all_body3D6248EA02E3
		// "Classifier::clearAssociation"
	}

	/**
	 * returns the number of Associations.
	 * 
	 * @see #addAssociation
	 */
	// -beg- preserve=no 33E265070353 size_head3D6248EA02E3
	// "Classifier::sizeAssociation"
	public int sizeAssociation()
	// -end- 33E265070353 size_head3D6248EA02E3 "Classifier::sizeAssociation"
	{
		// -beg- preserve=no 33E265070353 size_body3D6248EA02E3
		// "Classifier::sizeAssociation"
		return association.size();
		// -end- 33E265070353 size_body3D6248EA02E3
		// "Classifier::sizeAssociation"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _link_body3D6248EA02E3
	// "Classifier::_linkAssociation"
	public void _linkAssociation(AssociationEnd association1) {
		association.add(association1);

		return;
	}
	// -end- 33E265070353 _link_body3D6248EA02E3 "Classifier::_linkAssociation"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33E265070353 _unlink_body3D6248EA02E3
	// "Classifier::_unlinkAssociation"
	public void _unlinkAssociation(AssociationEnd association1) {
		association.remove(association1);

		return;
	}
	// -end- 33E265070353 _unlink_body3D6248EA02E3
	// "Classifier::_unlinkAssociation"

	// -beg- preserve=no 33F0EFAD00AB code3D6248EA02E3 "specifiedEnd"
	private java.util.Set specifiedEnd = new java.util.HashSet();
	// -end- 33F0EFAD00AB code3D6248EA02E3 "specifiedEnd"

	/**
	 * add a SpecifiedEnd.
	 *
	 * @see #removeSpecifiedEnd
	 * @see #containsSpecifiedEnd
	 * @see #iteratorSpecifiedEnd
	 * @see #clearSpecifiedEnd
	 * @see #sizeSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB add_head3D6248EA02E3
	// "Classifier::addSpecifiedEnd"
	public void addSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB add_head3D6248EA02E3 "Classifier::addSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB add_body3D6248EA02E3
		// "Classifier::addSpecifiedEnd"
		specifiedEnd.add(specifiedEnd1);
		specifiedEnd1._linkSpecification(this);

		return;
		// -end- 33F0EFAD00AB add_body3D6248EA02E3 "Classifier::addSpecifiedEnd"
	}

	/**
	 * disconnect a SpecifiedEnd.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_head3D6248EA02E3
	// "Classifier::removeSpecifiedEnd"
	public AssociationEnd removeSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB remove_head3D6248EA02E3
	// "Classifier::removeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_body3D6248EA02E3
		// "Classifier::removeSpecifiedEnd"
		AssociationEnd ret = null;
		if (specifiedEnd1 == null || !specifiedEnd.contains(specifiedEnd1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = specifiedEnd1;
		specifiedEnd.remove(specifiedEnd1);
		specifiedEnd1._unlinkSpecification(this);

		return ret;
		// -end- 33F0EFAD00AB remove_body3D6248EA02E3
		// "Classifier::removeSpecifiedEnd"
	}

	/**
	 * tests if a given SpecifiedEnd is connected.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB test_head3D6248EA02E3
	// "Classifier::containsSpecifiedEnd"
	public boolean containsSpecifiedEnd(AssociationEnd specifiedEnd1)
	// -end- 33F0EFAD00AB test_head3D6248EA02E3
	// "Classifier::containsSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB test_body3D6248EA02E3
		// "Classifier::containsSpecifiedEnd"
		return specifiedEnd.contains(specifiedEnd1);
		// -end- 33F0EFAD00AB test_body3D6248EA02E3
		// "Classifier::containsSpecifiedEnd"
	}

	/**
	 * used to enumerate all connected SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB get_all_head3D6248EA02E3
	// "Classifier::iteratorSpecifiedEnd"
	public java.util.Iterator iteratorSpecifiedEnd()
	// -end- 33F0EFAD00AB get_all_head3D6248EA02E3
	// "Classifier::iteratorSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB get_all_body3D6248EA02E3
		// "Classifier::iteratorSpecifiedEnd"
		return specifiedEnd.iterator();
		// -end- 33F0EFAD00AB get_all_body3D6248EA02E3
		// "Classifier::iteratorSpecifiedEnd"
	}

	/**
	 * disconnect all SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB remove_all_head3D6248EA02E3
	// "Classifier::clearSpecifiedEnd"
	public void clearSpecifiedEnd()
	// -end- 33F0EFAD00AB remove_all_head3D6248EA02E3
	// "Classifier::clearSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB remove_all_body3D6248EA02E3
		// "Classifier::clearSpecifiedEnd"
		if (sizeSpecifiedEnd() > 0) {
			for (java.util.Iterator p = specifiedEnd.iterator(); p.hasNext();) {
				((AssociationEnd) p.next())._unlinkSpecification(this);
			}
			specifiedEnd.clear();

		}
		// -end- 33F0EFAD00AB remove_all_body3D6248EA02E3
		// "Classifier::clearSpecifiedEnd"
	}

	/**
	 * returns the number of SpecifiedEnds.
	 * 
	 * @see #addSpecifiedEnd
	 */
	// -beg- preserve=no 33F0EFAD00AB size_head3D6248EA02E3
	// "Classifier::sizeSpecifiedEnd"
	public int sizeSpecifiedEnd()
	// -end- 33F0EFAD00AB size_head3D6248EA02E3 "Classifier::sizeSpecifiedEnd"
	{
		// -beg- preserve=no 33F0EFAD00AB size_body3D6248EA02E3
		// "Classifier::sizeSpecifiedEnd"
		return specifiedEnd.size();
		// -end- 33F0EFAD00AB size_body3D6248EA02E3
		// "Classifier::sizeSpecifiedEnd"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _link_body3D6248EA02E3
	// "Classifier::_linkSpecifiedEnd"
	public void _linkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.add(specifiedEnd1);

		return;
	}
	// -end- 33F0EFAD00AB _link_body3D6248EA02E3 "Classifier::_linkSpecifiedEnd"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 33F0EFAD00AB _unlink_body3D6248EA02E3
	// "Classifier::_unlinkSpecifiedEnd"
	public void _unlinkSpecifiedEnd(AssociationEnd specifiedEnd1) {
		specifiedEnd.remove(specifiedEnd1);

		return;
	}
	// -end- 33F0EFAD00AB _unlink_body3D6248EA02E3
	// "Classifier::_unlinkSpecifiedEnd"

	// -beg- preserve=no 36E96A87033E code3D6248EA02E3 "powertypeRange"
	private java.util.Set powertypeRange = new java.util.HashSet();
	// -end- 36E96A87033E code3D6248EA02E3 "powertypeRange"

	/**
	 * add a PowertypeRange.
	 *
	 * @see #removePowertypeRange
	 * @see #containsPowertypeRange
	 * @see #iteratorPowertypeRange
	 * @see #clearPowertypeRange
	 * @see #sizePowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E add_head3D6248EA02E3
	// "Classifier::addPowertypeRange"
	public void addPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E add_head3D6248EA02E3 "Classifier::addPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E add_body3D6248EA02E3
		// "Classifier::addPowertypeRange"
		powertypeRange.add(powertypeRange1);
		powertypeRange1._linkPowertype(this);

		return;
		// -end- 36E96A87033E add_body3D6248EA02E3
		// "Classifier::addPowertypeRange"
	}

	/**
	 * disconnect a PowertypeRange.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_head3D6248EA02E3
	// "Classifier::removePowertypeRange"
	public Generalization removePowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E remove_head3D6248EA02E3
	// "Classifier::removePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_body3D6248EA02E3
		// "Classifier::removePowertypeRange"
		Generalization ret = null;
		if (powertypeRange1 == null || !powertypeRange.contains(powertypeRange1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = powertypeRange1;
		powertypeRange.remove(powertypeRange1);
		powertypeRange1._unlinkPowertype(this);

		return ret;
		// -end- 36E96A87033E remove_body3D6248EA02E3
		// "Classifier::removePowertypeRange"
	}

	/**
	 * tests if a given PowertypeRange is connected.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E test_head3D6248EA02E3
	// "Classifier::containsPowertypeRange"
	public boolean containsPowertypeRange(Generalization powertypeRange1)
	// -end- 36E96A87033E test_head3D6248EA02E3
	// "Classifier::containsPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E test_body3D6248EA02E3
		// "Classifier::containsPowertypeRange"
		return powertypeRange.contains(powertypeRange1);
		// -end- 36E96A87033E test_body3D6248EA02E3
		// "Classifier::containsPowertypeRange"
	}

	/**
	 * used to enumerate all connected PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E get_all_head3D6248EA02E3
	// "Classifier::iteratorPowertypeRange"
	public java.util.Iterator iteratorPowertypeRange()
	// -end- 36E96A87033E get_all_head3D6248EA02E3
	// "Classifier::iteratorPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E get_all_body3D6248EA02E3
		// "Classifier::iteratorPowertypeRange"
		return powertypeRange.iterator();
		// -end- 36E96A87033E get_all_body3D6248EA02E3
		// "Classifier::iteratorPowertypeRange"
	}

	/**
	 * disconnect all PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E remove_all_head3D6248EA02E3
	// "Classifier::clearPowertypeRange"
	public void clearPowertypeRange()
	// -end- 36E96A87033E remove_all_head3D6248EA02E3
	// "Classifier::clearPowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E remove_all_body3D6248EA02E3
		// "Classifier::clearPowertypeRange"
		if (sizePowertypeRange() > 0) {
			for (java.util.Iterator p = powertypeRange.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkPowertype(this);
			}
			powertypeRange.clear();

		}
		// -end- 36E96A87033E remove_all_body3D6248EA02E3
		// "Classifier::clearPowertypeRange"
	}

	/**
	 * returns the number of PowertypeRanges.
	 * 
	 * @see #addPowertypeRange
	 */
	// -beg- preserve=no 36E96A87033E size_head3D6248EA02E3
	// "Classifier::sizePowertypeRange"
	public int sizePowertypeRange()
	// -end- 36E96A87033E size_head3D6248EA02E3 "Classifier::sizePowertypeRange"
	{
		// -beg- preserve=no 36E96A87033E size_body3D6248EA02E3
		// "Classifier::sizePowertypeRange"
		return powertypeRange.size();
		// -end- 36E96A87033E size_body3D6248EA02E3
		// "Classifier::sizePowertypeRange"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _link_body3D6248EA02E3
	// "Classifier::_linkPowertypeRange"
	public void _linkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.add(powertypeRange1);

		return;
	}
	// -end- 36E96A87033E _link_body3D6248EA02E3
	// "Classifier::_linkPowertypeRange"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 36E96A87033E _unlink_body3D6248EA02E3
	// "Classifier::_unlinkPowertypeRange"
	public void _unlinkPowertypeRange(Generalization powertypeRange1) {
		powertypeRange.remove(powertypeRange1);

		return;
	}
	// -end- 36E96A87033E _unlink_body3D6248EA02E3
	// "Classifier::_unlinkPowertypeRange"

	// -beg- preserve=no 335C14A5019A code3D6248EA02E3 "generalization"
	private java.util.Set generalization = new java.util.HashSet();
	// -end- 335C14A5019A code3D6248EA02E3 "generalization"

	/**
	 * add a Generalization.
	 *
	 * @see #removeGeneralization
	 * @see #containsGeneralization
	 * @see #iteratorGeneralization
	 * @see #clearGeneralization
	 * @see #sizeGeneralization
	 */
	// -beg- preserve=no 335C14A5019A add_head3D6248EA02E3
	// "GeneralizableElement::addGeneralization"
	public void addGeneralization(Generalization generalization1)
	// -end- 335C14A5019A add_head3D6248EA02E3
	// "GeneralizableElement::addGeneralization"
	{
		// -beg- preserve=no 335C14A5019A add_body3D6248EA02E3
		// "GeneralizableElement::addGeneralization"
		generalization.add(generalization1);
		generalization1._linkChild(this);

		return;
		// -end- 335C14A5019A add_body3D6248EA02E3
		// "GeneralizableElement::addGeneralization"
	}

	/**
	 * disconnect a Generalization.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_head3D6248EA02E3
	// "GeneralizableElement::removeGeneralization"
	public Generalization removeGeneralization(Generalization generalization1)
	// -end- 335C14A5019A remove_head3D6248EA02E3
	// "GeneralizableElement::removeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_body3D6248EA02E3
		// "GeneralizableElement::removeGeneralization"
		Generalization ret = null;
		if (generalization1 == null || !generalization.contains(generalization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = generalization1;
		generalization.remove(generalization1);
		generalization1._unlinkChild(this);

		return ret;
		// -end- 335C14A5019A remove_body3D6248EA02E3
		// "GeneralizableElement::removeGeneralization"
	}

	/**
	 * tests if a given Generalization is connected.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A test_head3D6248EA02E3
	// "GeneralizableElement::containsGeneralization"
	public boolean containsGeneralization(Generalization generalization1)
	// -end- 335C14A5019A test_head3D6248EA02E3
	// "GeneralizableElement::containsGeneralization"
	{
		// -beg- preserve=no 335C14A5019A test_body3D6248EA02E3
		// "GeneralizableElement::containsGeneralization"
		return generalization.contains(generalization1);
		// -end- 335C14A5019A test_body3D6248EA02E3
		// "GeneralizableElement::containsGeneralization"
	}

	/**
	 * used to enumerate all connected Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A get_all_head3D6248EA02E3
	// "GeneralizableElement::iteratorGeneralization"
	public java.util.Iterator iteratorGeneralization()
	// -end- 335C14A5019A get_all_head3D6248EA02E3
	// "GeneralizableElement::iteratorGeneralization"
	{
		// -beg- preserve=no 335C14A5019A get_all_body3D6248EA02E3
		// "GeneralizableElement::iteratorGeneralization"
		return generalization.iterator();
		// -end- 335C14A5019A get_all_body3D6248EA02E3
		// "GeneralizableElement::iteratorGeneralization"
	}

	/**
	 * disconnect all Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A remove_all_head3D6248EA02E3
	// "GeneralizableElement::clearGeneralization"
	public void clearGeneralization()
	// -end- 335C14A5019A remove_all_head3D6248EA02E3
	// "GeneralizableElement::clearGeneralization"
	{
		// -beg- preserve=no 335C14A5019A remove_all_body3D6248EA02E3
		// "GeneralizableElement::clearGeneralization"
		if (sizeGeneralization() > 0) {
			for (java.util.Iterator p = generalization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkChild(this);
			}
			generalization.clear();

		}
		// -end- 335C14A5019A remove_all_body3D6248EA02E3
		// "GeneralizableElement::clearGeneralization"
	}

	/**
	 * returns the number of Generalizations.
	 * 
	 * @see #addGeneralization
	 */
	// -beg- preserve=no 335C14A5019A size_head3D6248EA02E3
	// "GeneralizableElement::sizeGeneralization"
	public int sizeGeneralization()
	// -end- 335C14A5019A size_head3D6248EA02E3
	// "GeneralizableElement::sizeGeneralization"
	{
		// -beg- preserve=no 335C14A5019A size_body3D6248EA02E3
		// "GeneralizableElement::sizeGeneralization"
		return generalization.size();
		// -end- 335C14A5019A size_body3D6248EA02E3
		// "GeneralizableElement::sizeGeneralization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _link_body3D6248EA02E3
	// "GeneralizableElement::_linkGeneralization"
	public void _linkGeneralization(Generalization generalization1) {
		generalization.add(generalization1);

		return;
	}
	// -end- 335C14A5019A _link_body3D6248EA02E3
	// "GeneralizableElement::_linkGeneralization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C14A5019A _unlink_body3D6248EA02E3
	// "GeneralizableElement::_unlinkGeneralization"
	public void _unlinkGeneralization(Generalization generalization1) {
		generalization.remove(generalization1);

		return;
	}
	// -end- 335C14A5019A _unlink_body3D6248EA02E3
	// "GeneralizableElement::_unlinkGeneralization"

	// -beg- preserve=no 335C146B01D6 code3D6248EA02E3 "specialization"
	private java.util.Set specialization = new java.util.HashSet();
	// -end- 335C146B01D6 code3D6248EA02E3 "specialization"

	/**
	 * add a Specialization.
	 *
	 * @see #removeSpecialization
	 * @see #containsSpecialization
	 * @see #iteratorSpecialization
	 * @see #clearSpecialization
	 * @see #sizeSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 add_head3D6248EA02E3
	// "GeneralizableElement::addSpecialization"
	public void addSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 add_head3D6248EA02E3
	// "GeneralizableElement::addSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 add_body3D6248EA02E3
		// "GeneralizableElement::addSpecialization"
		specialization.add(specialization1);
		specialization1._linkParent(this);

		return;
		// -end- 335C146B01D6 add_body3D6248EA02E3
		// "GeneralizableElement::addSpecialization"
	}

	/**
	 * disconnect a Specialization.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_head3D6248EA02E3
	// "GeneralizableElement::removeSpecialization"
	public Generalization removeSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 remove_head3D6248EA02E3
	// "GeneralizableElement::removeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_body3D6248EA02E3
		// "GeneralizableElement::removeSpecialization"
		Generalization ret = null;
		if (specialization1 == null || !specialization.contains(specialization1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = specialization1;
		specialization.remove(specialization1);
		specialization1._unlinkParent(this);

		return ret;
		// -end- 335C146B01D6 remove_body3D6248EA02E3
		// "GeneralizableElement::removeSpecialization"
	}

	/**
	 * tests if a given Specialization is connected.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 test_head3D6248EA02E3
	// "GeneralizableElement::containsSpecialization"
	public boolean containsSpecialization(Generalization specialization1)
	// -end- 335C146B01D6 test_head3D6248EA02E3
	// "GeneralizableElement::containsSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 test_body3D6248EA02E3
		// "GeneralizableElement::containsSpecialization"
		return specialization.contains(specialization1);
		// -end- 335C146B01D6 test_body3D6248EA02E3
		// "GeneralizableElement::containsSpecialization"
	}

	/**
	 * used to enumerate all connected Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 get_all_head3D6248EA02E3
	// "GeneralizableElement::iteratorSpecialization"
	public java.util.Iterator iteratorSpecialization()
	// -end- 335C146B01D6 get_all_head3D6248EA02E3
	// "GeneralizableElement::iteratorSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 get_all_body3D6248EA02E3
		// "GeneralizableElement::iteratorSpecialization"
		return specialization.iterator();
		// -end- 335C146B01D6 get_all_body3D6248EA02E3
		// "GeneralizableElement::iteratorSpecialization"
	}

	/**
	 * disconnect all Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 remove_all_head3D6248EA02E3
	// "GeneralizableElement::clearSpecialization"
	public void clearSpecialization()
	// -end- 335C146B01D6 remove_all_head3D6248EA02E3
	// "GeneralizableElement::clearSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 remove_all_body3D6248EA02E3
		// "GeneralizableElement::clearSpecialization"
		if (sizeSpecialization() > 0) {
			for (java.util.Iterator p = specialization.iterator(); p.hasNext();) {
				((Generalization) p.next())._unlinkParent(this);
			}
			specialization.clear();

		}
		// -end- 335C146B01D6 remove_all_body3D6248EA02E3
		// "GeneralizableElement::clearSpecialization"
	}

	/**
	 * returns the number of Specializations.
	 * 
	 * @see #addSpecialization
	 */
	// -beg- preserve=no 335C146B01D6 size_head3D6248EA02E3
	// "GeneralizableElement::sizeSpecialization"
	public int sizeSpecialization()
	// -end- 335C146B01D6 size_head3D6248EA02E3
	// "GeneralizableElement::sizeSpecialization"
	{
		// -beg- preserve=no 335C146B01D6 size_body3D6248EA02E3
		// "GeneralizableElement::sizeSpecialization"
		return specialization.size();
		// -end- 335C146B01D6 size_body3D6248EA02E3
		// "GeneralizableElement::sizeSpecialization"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _link_body3D6248EA02E3
	// "GeneralizableElement::_linkSpecialization"
	public void _linkSpecialization(Generalization specialization1) {
		specialization.add(specialization1);

		return;
	}
	// -end- 335C146B01D6 _link_body3D6248EA02E3
	// "GeneralizableElement::_linkSpecialization"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 335C146B01D6 _unlink_body3D6248EA02E3
	// "GeneralizableElement::_unlinkSpecialization"
	public void _unlinkSpecialization(Generalization specialization1) {
		specialization.remove(specialization1);

		return;
	}
	// -end- 335C146B01D6 _unlink_body3D6248EA02E3
	// "GeneralizableElement::_unlinkSpecialization"

	// -beg- preserve=no 327A877801CC var3D6248EA02E3 "isRoot"
	private boolean isRoot;
	// -end- 327A877801CC var3D6248EA02E3 "isRoot"

	/**
	 * get current value of isRoot
	 * 
	 * @see #setRoot
	 */
	// -beg- preserve=no 327A877801CC get_head3D6248EA02E3 "isRoot"
	public boolean isRoot()
	// -end- 327A877801CC get_head3D6248EA02E3 "isRoot"
	{
		// -beg- preserve=no 327A877801CC get_body3D6248EA02E3 "isRoot"
		return isRoot;
		// -end- 327A877801CC get_body3D6248EA02E3 "isRoot"
	}

	/**
	 * set current value of isRoot
	 * 
	 * @see #isRoot
	 */
	// -beg- preserve=no 327A877801CC set_head3D6248EA02E3 "isRoot"
	public void setRoot(boolean value1)
	// -end- 327A877801CC set_head3D6248EA02E3 "isRoot"
	{
		// -beg- preserve=no 327A877801CC set_body3D6248EA02E3 "isRoot"
		if (isRoot != value1) {
			isRoot = value1;

		}
		// -end- 327A877801CC set_body3D6248EA02E3 "isRoot"
	}

	// -beg- preserve=no 327A877E006E var3D6248EA02E3 "isLeaf"
	private boolean isLeaf;
	// -end- 327A877E006E var3D6248EA02E3 "isLeaf"

	/**
	 * get current value of isLeaf
	 * 
	 * @see #setLeaf
	 */
	// -beg- preserve=no 327A877E006E get_head3D6248EA02E3 "isLeaf"
	public boolean isLeaf()
	// -end- 327A877E006E get_head3D6248EA02E3 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E get_body3D6248EA02E3 "isLeaf"
		return isLeaf;
		// -end- 327A877E006E get_body3D6248EA02E3 "isLeaf"
	}

	/**
	 * set current value of isLeaf
	 * 
	 * @see #isLeaf
	 */
	// -beg- preserve=no 327A877E006E set_head3D6248EA02E3 "isLeaf"
	public void setLeaf(boolean value1)
	// -end- 327A877E006E set_head3D6248EA02E3 "isLeaf"
	{
		// -beg- preserve=no 327A877E006E set_body3D6248EA02E3 "isLeaf"
		if (isLeaf != value1) {
			isLeaf = value1;

		}
		// -end- 327A877E006E set_body3D6248EA02E3 "isLeaf"
	}

	// -beg- preserve=no 327A878400D2 var3D6248EA02E3 "isAbstract"
	private boolean isAbstract;
	// -end- 327A878400D2 var3D6248EA02E3 "isAbstract"

	/**
	 * get current value of isAbstract
	 * 
	 * @see #setAbstract
	 */
	// -beg- preserve=no 327A878400D2 get_head3D6248EA02E3 "isAbstract"
	public boolean isAbstract()
	// -end- 327A878400D2 get_head3D6248EA02E3 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 get_body3D6248EA02E3 "isAbstract"
		return isAbstract;
		// -end- 327A878400D2 get_body3D6248EA02E3 "isAbstract"
	}

	/**
	 * set current value of isAbstract
	 * 
	 * @see #isAbstract
	 */
	// -beg- preserve=no 327A878400D2 set_head3D6248EA02E3 "isAbstract"
	public void setAbstract(boolean value1)
	// -end- 327A878400D2 set_head3D6248EA02E3 "isAbstract"
	{
		// -beg- preserve=no 327A878400D2 set_body3D6248EA02E3 "isAbstract"
		if (isAbstract != value1) {
			isAbstract = value1;

		}
		// -end- 327A878400D2 set_body3D6248EA02E3 "isAbstract"
	}

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMettaAttrb(value);
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3D6248EA02E3 detail_end "MetaObjectFile"

	// -end- 3D6248EA02E3 detail_end "MetaObjectFile"

}
