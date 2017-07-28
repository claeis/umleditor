// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:22 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3298A02900FE package "Class"
package ch.ehi.uml1_4.foundation.core;
// -end- 3298A02900FE package "Class"

// -beg- preserve=no 3298A02900FE autoimport "Class"
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
// -end- 3298A02900FE autoimport "Class"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3298A02900FE import "Class"

// -end- 3298A02900FE import "Class"

/** A class is a description of a set of objects that share the same attributes, operations, methods,relationships, and semantics.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:22 $
 */
public interface Class extends Classifier, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3298A02900FE detail_begin "Class"

// -end- 3298A02900FE detail_begin "Class"

/** add a Presentation.
 *
 *  @see #removePresentation
 *  @see #containsPresentation
 *  @see #iteratorPresentation
 *  @see #clearPresentation
 *  @see #sizePresentation
 */
// -beg- preserve=no 362409A9000A add_head3298A02900FE "ModelElement::addPresentation"
public void addPresentation(PresentationElement presentation1)
// -end- 362409A9000A add_head3298A02900FE "ModelElement::addPresentation"
;     // empty

/** disconnect a Presentation.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_head3298A02900FE "ModelElement::removePresentation"
public PresentationElement removePresentation(PresentationElement presentation1)
// -end- 362409A9000A remove_head3298A02900FE "ModelElement::removePresentation"
;     // empty

/** tests if a given Presentation is connected.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A test_head3298A02900FE "ModelElement::containsPresentation"
public boolean containsPresentation(PresentationElement presentation1)
// -end- 362409A9000A test_head3298A02900FE "ModelElement::containsPresentation"
;     // empty

/** used to enumerate all connected Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A get_all_head3298A02900FE "ModelElement::iteratorPresentation"
public java.util.Iterator iteratorPresentation()
// -end- 362409A9000A get_all_head3298A02900FE "ModelElement::iteratorPresentation"
;     // empty

/** disconnect all Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_all_head3298A02900FE "ModelElement::clearPresentation"
public void clearPresentation()
// -end- 362409A9000A remove_all_head3298A02900FE "ModelElement::clearPresentation"
;     // empty

/** returns the number of Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A size_head3298A02900FE "ModelElement::sizePresentation"
public int sizePresentation()
// -end- 362409A9000A size_head3298A02900FE "ModelElement::sizePresentation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _link_body3298A02900FE "ModelElement::_linkPresentation"
public void _linkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _link_body3298A02900FE "ModelElement::_linkPresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _unlink_body3298A02900FE "ModelElement::_unlinkPresentation"
public void _unlinkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _unlink_body3298A02900FE "ModelElement::_unlinkPresentation"

/** get current value of isActive
 *  @see #setActive
 */
// -beg- preserve=no 33F24B5A0190 get_head3298A02900FE "isActive"
boolean isActive()
// -end- 33F24B5A0190 get_head3298A02900FE "isActive"
;     // empty
/** set current value of isActive
 *  @see #isActive
 */
// -beg- preserve=no 33F24B5A0190 set_head3298A02900FE "isActive"
void setActive(boolean value1)
// -end- 33F24B5A0190 set_head3298A02900FE "isActive"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3298A02900FE detail_end "Class"

// -end- 3298A02900FE detail_end "Class"

}
