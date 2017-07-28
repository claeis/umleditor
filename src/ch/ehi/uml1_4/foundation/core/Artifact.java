// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:17 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3A018D9500DA package "Artifact"
package ch.ehi.uml1_4.foundation.core;
// -end- 3A018D9500DA package "Artifact"

// -beg- preserve=no 3A018D9500DA autoimport "Artifact"
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
// -end- 3A018D9500DA autoimport "Artifact"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3A018D9500DA import "Artifact"

// -end- 3A018D9500DA import "Artifact"

/** An Artifact represents a physical piece of information that is used or produced by a softwaredevelopment process.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:17 $
 */
public interface Artifact extends Classifier, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3A018D9500DA detail_begin "Artifact"

// -end- 3A018D9500DA detail_begin "Artifact"

/** add a ImplementationLocation.
 *  The deployable Component(s) that are implemented by this Artifact.
 *  @see #removeImplementationLocation
 *  @see #containsImplementationLocation
 *  @see #iteratorImplementationLocation
 *  @see #clearImplementationLocation
 *  @see #sizeImplementationLocation
 */
// -beg- preserve=no 3A018E150193 add_head3A018D9500DA "Artifact::addImplementationLocation"
public void addImplementationLocation(Component implementationLocation1)
// -end- 3A018E150193 add_head3A018D9500DA "Artifact::addImplementationLocation"
;     // empty

/** disconnect a ImplementationLocation.
 *  @see #addImplementationLocation
 */
// -beg- preserve=no 3A018E150193 remove_head3A018D9500DA "Artifact::removeImplementationLocation"
public Component removeImplementationLocation(Component implementationLocation1)
// -end- 3A018E150193 remove_head3A018D9500DA "Artifact::removeImplementationLocation"
;     // empty

/** tests if a given ImplementationLocation is connected.
 *  @see #addImplementationLocation
 */
// -beg- preserve=no 3A018E150193 test_head3A018D9500DA "Artifact::containsImplementationLocation"
public boolean containsImplementationLocation(Component implementationLocation1)
// -end- 3A018E150193 test_head3A018D9500DA "Artifact::containsImplementationLocation"
;     // empty

/** used to enumerate all connected ImplementationLocations.
 *  @see #addImplementationLocation
 */
// -beg- preserve=no 3A018E150193 get_all_head3A018D9500DA "Artifact::iteratorImplementationLocation"
public java.util.Iterator iteratorImplementationLocation()
// -end- 3A018E150193 get_all_head3A018D9500DA "Artifact::iteratorImplementationLocation"
;     // empty

/** disconnect all ImplementationLocations.
 *  @see #addImplementationLocation
 */
// -beg- preserve=no 3A018E150193 remove_all_head3A018D9500DA "Artifact::clearImplementationLocation"
public void clearImplementationLocation()
// -end- 3A018E150193 remove_all_head3A018D9500DA "Artifact::clearImplementationLocation"
;     // empty

/** returns the number of ImplementationLocations.
 *  @see #addImplementationLocation
 */
// -beg- preserve=no 3A018E150193 size_head3A018D9500DA "Artifact::sizeImplementationLocation"
public int sizeImplementationLocation()
// -end- 3A018E150193 size_head3A018D9500DA "Artifact::sizeImplementationLocation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3A018E150193 _link_body3A018D9500DA "Artifact::_linkImplementationLocation"
public void _linkImplementationLocation(Component implementationLocation1);
// -end- 3A018E150193 _link_body3A018D9500DA "Artifact::_linkImplementationLocation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3A018E150193 _unlink_body3A018D9500DA "Artifact::_unlinkImplementationLocation"
public void _unlinkImplementationLocation(Component implementationLocation1);
// -end- 3A018E150193 _unlink_body3A018D9500DA "Artifact::_unlinkImplementationLocation"

/** add a Presentation.
 *
 *  @see #removePresentation
 *  @see #containsPresentation
 *  @see #iteratorPresentation
 *  @see #clearPresentation
 *  @see #sizePresentation
 */
// -beg- preserve=no 362409A9000A add_head3A018D9500DA "ModelElement::addPresentation"
public void addPresentation(PresentationElement presentation1)
// -end- 362409A9000A add_head3A018D9500DA "ModelElement::addPresentation"
;     // empty

/** disconnect a Presentation.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_head3A018D9500DA "ModelElement::removePresentation"
public PresentationElement removePresentation(PresentationElement presentation1)
// -end- 362409A9000A remove_head3A018D9500DA "ModelElement::removePresentation"
;     // empty

/** tests if a given Presentation is connected.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A test_head3A018D9500DA "ModelElement::containsPresentation"
public boolean containsPresentation(PresentationElement presentation1)
// -end- 362409A9000A test_head3A018D9500DA "ModelElement::containsPresentation"
;     // empty

/** used to enumerate all connected Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A get_all_head3A018D9500DA "ModelElement::iteratorPresentation"
public java.util.Iterator iteratorPresentation()
// -end- 362409A9000A get_all_head3A018D9500DA "ModelElement::iteratorPresentation"
;     // empty

/** disconnect all Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_all_head3A018D9500DA "ModelElement::clearPresentation"
public void clearPresentation()
// -end- 362409A9000A remove_all_head3A018D9500DA "ModelElement::clearPresentation"
;     // empty

/** returns the number of Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A size_head3A018D9500DA "ModelElement::sizePresentation"
public int sizePresentation()
// -end- 362409A9000A size_head3A018D9500DA "ModelElement::sizePresentation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _link_body3A018D9500DA "ModelElement::_linkPresentation"
public void _linkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _link_body3A018D9500DA "ModelElement::_linkPresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _unlink_body3A018D9500DA "ModelElement::_unlinkPresentation"
public void _unlinkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _unlink_body3A018D9500DA "ModelElement::_unlinkPresentation"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3A018D9500DA detail_end "Artifact"

// -end- 3A018D9500DA detail_end "Artifact"

}
