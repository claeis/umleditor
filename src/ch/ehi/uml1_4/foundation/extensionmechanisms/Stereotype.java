// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:47 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3372549100E5 package "Stereotype"
package ch.ehi.uml1_4.foundation.extensionmechanisms;
// -end- 3372549100E5 package "Stereotype"

// -beg- preserve=no 3372549100E5 autoimport "Stereotype"
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TagDefinition;
import ch.ehi.uml1_4.foundation.core.ModelElement;

import java.util.Iterator;

import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.datatypes.Geometry;
// -end- 3372549100E5 autoimport "Stereotype"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3372549100E5 import "Stereotype"

// -end- 3372549100E5 import "Stereotype"

/**
 * The stereotype concept provides a way of branding (classifying) model
 * elements so that theybehave in some respects as if they were instances of new
 * virtual metamodel constructs.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:47 $
 */
public interface Stereotype extends GeneralizableElement, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3372549100E5 detail_begin "Stereotype"

	// -end- 3372549100E5 detail_begin "Stereotype"

	/**
	 * add a DefinedTag.
	 *
	 * @see #removeDefinedTag
	 * @see #containsDefinedTag
	 * @see #iteratorDefinedTag
	 * @see #clearDefinedTag
	 * @see #sizeDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 add_head3372549100E5
	// "Stereotype::addDefinedTag"
	public void addDefinedTag(TagDefinition definedTag1)
	// -end- 3386129C0040 add_head3372549100E5 "Stereotype::addDefinedTag"
	; // empty

	/**
	 * disconnect a DefinedTag.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 remove_head3372549100E5
	// "Stereotype::removeDefinedTag"
	public TagDefinition removeDefinedTag(TagDefinition definedTag1)
	// -end- 3386129C0040 remove_head3372549100E5 "Stereotype::removeDefinedTag"
	; // empty

	/**
	 * tests if a given DefinedTag is connected.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 test_head3372549100E5
	// "Stereotype::containsDefinedTag"
	public boolean containsDefinedTag(TagDefinition definedTag1)
	// -end- 3386129C0040 test_head3372549100E5 "Stereotype::containsDefinedTag"
	; // empty

	/**
	 * used to enumerate all connected DefinedTags.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 get_all_head3372549100E5
	// "Stereotype::iteratorDefinedTag"
	public Iterator<?> iteratorDefinedTag()
	// -end- 3386129C0040 get_all_head3372549100E5
	// "Stereotype::iteratorDefinedTag"
	; // empty

	/**
	 * disconnect all DefinedTags.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 remove_all_head3372549100E5
	// "Stereotype::clearDefinedTag"
	public void clearDefinedTag()
	// -end- 3386129C0040 remove_all_head3372549100E5
	// "Stereotype::clearDefinedTag"
	; // empty

	/**
	 * returns the number of DefinedTags.
	 * 
	 * @see #addDefinedTag
	 */
	// -beg- preserve=no 3386129C0040 size_head3372549100E5
	// "Stereotype::sizeDefinedTag"
	public int sizeDefinedTag()
	// -end- 3386129C0040 size_head3372549100E5 "Stereotype::sizeDefinedTag"
	; // empty

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3386129C0040 _link_body3372549100E5
	// "Stereotype::_linkDefinedTag"
	public void _linkDefinedTag(TagDefinition definedTag1);
	// -end- 3386129C0040 _link_body3372549100E5 "Stereotype::_linkDefinedTag"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3386129C0040 _unlink_body3372549100E5
	// "Stereotype::_unlinkDefinedTag"
	public void _unlinkDefinedTag(TagDefinition definedTag1);
	// -end- 3386129C0040 _unlink_body3372549100E5
	// "Stereotype::_unlinkDefinedTag"

	/**
	 * add a ExtendedElement.
	 *
	 * @see #removeExtendedElement
	 * @see #containsExtendedElement
	 * @see #iteratorExtendedElement
	 * @see #clearExtendedElement
	 * @see #sizeExtendedElement
	 */
	// -beg- preserve=no 338613A4007A add_head3372549100E5
	// "Stereotype::addExtendedElement"
	public void addExtendedElement(ModelElement extendedElement1)
	// -end- 338613A4007A add_head3372549100E5 "Stereotype::addExtendedElement"
	; // empty

	/**
	 * disconnect a ExtendedElement.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A remove_head3372549100E5
	// "Stereotype::removeExtendedElement"
	public ModelElement removeExtendedElement(ModelElement extendedElement1)
	// -end- 338613A4007A remove_head3372549100E5
	// "Stereotype::removeExtendedElement"
	; // empty

	/**
	 * tests if a given ExtendedElement is connected.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A test_head3372549100E5
	// "Stereotype::containsExtendedElement"
	public boolean containsExtendedElement(ModelElement extendedElement1)
	// -end- 338613A4007A test_head3372549100E5
	// "Stereotype::containsExtendedElement"
	; // empty

	/**
	 * used to enumerate all connected ExtendedElements.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A get_all_head3372549100E5
	// "Stereotype::iteratorExtendedElement"
	public Iterator<?> iteratorExtendedElement()
	// -end- 338613A4007A get_all_head3372549100E5
	// "Stereotype::iteratorExtendedElement"
	; // empty

	/**
	 * disconnect all ExtendedElements.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A remove_all_head3372549100E5
	// "Stereotype::clearExtendedElement"
	public void clearExtendedElement()
	// -end- 338613A4007A remove_all_head3372549100E5
	// "Stereotype::clearExtendedElement"
	; // empty

	/**
	 * returns the number of ExtendedElements.
	 * 
	 * @see #addExtendedElement
	 */
	// -beg- preserve=no 338613A4007A size_head3372549100E5
	// "Stereotype::sizeExtendedElement"
	public int sizeExtendedElement()
	// -end- 338613A4007A size_head3372549100E5
	// "Stereotype::sizeExtendedElement"
	; // empty

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 338613A4007A _link_body3372549100E5
	// "Stereotype::_linkExtendedElement"
	public void _linkExtendedElement(ModelElement extendedElement1);
	// -end- 338613A4007A _link_body3372549100E5
	// "Stereotype::_linkExtendedElement"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 338613A4007A _unlink_body3372549100E5
	// "Stereotype::_unlinkExtendedElement"
	public void _unlinkExtendedElement(ModelElement extendedElement1);
	// -end- 338613A4007A _unlink_body3372549100E5
	// "Stereotype::_unlinkExtendedElement"

	/**
	 * add a StereotypeConstraint.
	 *
	 * @see #removeStereotypeConstraint
	 * @see #containsStereotypeConstraint
	 * @see #iteratorStereotypeConstraint
	 * @see #clearStereotypeConstraint
	 * @see #sizeStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 add_head3372549100E5
	// "Stereotype::addStereotypeConstraint"
	public void addStereotypeConstraint(Constraint stereotypeConstraint1)
	// -end- 364B66900258 add_head3372549100E5
	// "Stereotype::addStereotypeConstraint"
	; // empty

	/**
	 * disconnect a StereotypeConstraint.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 remove_head3372549100E5
	// "Stereotype::removeStereotypeConstraint"
	public Constraint removeStereotypeConstraint(Constraint stereotypeConstraint1)
	// -end- 364B66900258 remove_head3372549100E5
	// "Stereotype::removeStereotypeConstraint"
	; // empty

	/**
	 * tests if a given StereotypeConstraint is connected.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 test_head3372549100E5
	// "Stereotype::containsStereotypeConstraint"
	public boolean containsStereotypeConstraint(Constraint stereotypeConstraint1)
	// -end- 364B66900258 test_head3372549100E5
	// "Stereotype::containsStereotypeConstraint"
	; // empty

	/**
	 * used to enumerate all connected StereotypeConstraints.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 get_all_head3372549100E5
	// "Stereotype::iteratorStereotypeConstraint"
	public Iterator<?> iteratorStereotypeConstraint()
	// -end- 364B66900258 get_all_head3372549100E5
	// "Stereotype::iteratorStereotypeConstraint"
	; // empty

	/**
	 * disconnect all StereotypeConstraints.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 remove_all_head3372549100E5
	// "Stereotype::clearStereotypeConstraint"
	public void clearStereotypeConstraint()
	// -end- 364B66900258 remove_all_head3372549100E5
	// "Stereotype::clearStereotypeConstraint"
	; // empty

	/**
	 * returns the number of StereotypeConstraints.
	 * 
	 * @see #addStereotypeConstraint
	 */
	// -beg- preserve=no 364B66900258 size_head3372549100E5
	// "Stereotype::sizeStereotypeConstraint"
	public int sizeStereotypeConstraint()
	// -end- 364B66900258 size_head3372549100E5
	// "Stereotype::sizeStereotypeConstraint"
	; // empty

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 364B66900258 _link_body3372549100E5
	// "Stereotype::_linkStereotypeConstraint"
	public void _linkStereotypeConstraint(Constraint stereotypeConstraint1);
	// -end- 364B66900258 _link_body3372549100E5
	// "Stereotype::_linkStereotypeConstraint"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 364B66900258 _unlink_body3372549100E5
	// "Stereotype::_unlinkStereotypeConstraint"
	public void _unlinkStereotypeConstraint(Constraint stereotypeConstraint1);
	// -end- 364B66900258 _unlink_body3372549100E5
	// "Stereotype::_unlinkStereotypeConstraint"

	/**
	 * get current value of icon The geometrical description for an icon to be
	 * used to present animage of a model element branded by the stereotype.
	 * 
	 * @see #setIcon
	 */
	// -beg- preserve=no 338614B602CD get_head3372549100E5 "icon"
	Geometry getIcon()
	// -end- 338614B602CD get_head3372549100E5 "icon"
	; // empty

	/**
	 * set current value of icon
	 * 
	 * @see #getIcon
	 */
	// -beg- preserve=no 338614B602CD set_head3372549100E5 "icon"
	void setIcon(Geometry value1)
	// -end- 338614B602CD set_head3372549100E5 "icon"
	; // empty

	/**
	 * get current value of baseClass Specifies the names of one or more UML
	 * modeling elements towhich the stereotype applies, such as Class,
	 * Association,Refinement, Constraint, etc.
	 * 
	 * @see #setBaseClass
	 */
	// -beg- preserve=no 340389C403C0 get_head3372549100E5 "baseClass"
	String getBaseClass()
	// -end- 340389C403C0 get_head3372549100E5 "baseClass"
	; // empty

	/**
	 * set current value of baseClass
	 * 
	 * @see #getBaseClass
	 */
	// -beg- preserve=no 340389C403C0 set_head3372549100E5 "baseClass"
	void setBaseClass(String value1)
	// -end- 340389C403C0 set_head3372549100E5 "baseClass"
	; // empty
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3372549100E5 detail_end "Stereotype"

	// -end- 3372549100E5 detail_end "Stereotype"

}
