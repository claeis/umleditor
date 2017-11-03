// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:14 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 362661700208 package "ExtensionPoint"
package ch.ehi.uml1_4.behaviour.usecases;
// -end- 362661700208 package "ExtensionPoint"

// -beg- preserve=no 362661700208 autoimport "ExtensionPoint"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.usecases.UseCase;

import java.util.Iterator;

import ch.ehi.uml1_4.behaviour.usecases.Extend;
import ch.ehi.uml1_4.foundation.datatypes.LocationReference;
// -end- 362661700208 autoimport "ExtensionPoint"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 362661700208 import "ExtensionPoint"

// -end- 362661700208 import "ExtensionPoint"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:14 $
 */
public interface ExtensionPoint extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 362661700208 detail_begin "ExtensionPoint"

// -end- 362661700208 detail_begin "ExtensionPoint"

/** attaches a UseCase.
 *
 *  @see #detachUseCase
 *  @see #getUseCase
 *  @see #containsUseCase
 */
// -beg- preserve=no 362661DB015E attach_head362661700208 "ExtensionPoint::attachUseCase"
public void attachUseCase(UseCase useCase1)
// -end- 362661DB015E attach_head362661700208 "ExtensionPoint::attachUseCase"
;     // empty

/** disconnect the currently attached UseCase.
 *  @see #attachUseCase
 */
// -beg- preserve=no 362661DB015E detach_head362661700208 "ExtensionPoint::detachUseCase"
public UseCase detachUseCase()
// -end- 362661DB015E detach_head362661700208 "ExtensionPoint::detachUseCase"
;     // empty

/** get the currently attached UseCase.
 *  @see #attachUseCase
 */
// -beg- preserve=no 362661DB015E get_head362661700208 "ExtensionPoint::getUseCase"
public UseCase getUseCase()
// -end- 362661DB015E get_head362661700208 "ExtensionPoint::getUseCase"
;     // empty

/** tests if there is a UseCase attached.
 *  @see #attachUseCase
 */
// -beg- preserve=no 362661DB015E test_head362661700208 "ExtensionPoint::containsUseCase"
public boolean containsUseCase()
// -end- 362661DB015E test_head362661700208 "ExtensionPoint::containsUseCase"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 362661DB015E _link_body362661700208 "ExtensionPoint::_linkUseCase"
public void _linkUseCase(UseCase useCase1);
// -end- 362661DB015E _link_body362661700208 "ExtensionPoint::_linkUseCase"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362661DB015E _unlink_body362661700208 "ExtensionPoint::_unlinkUseCase"
public void _unlinkUseCase(UseCase useCase1);
// -end- 362661DB015E _unlink_body362661700208 "ExtensionPoint::_unlinkUseCase"

/** add a Extend.
 *
 *  @see #removeExtend
 *  @see #containsExtend
 *  @see #iteratorExtend
 *  @see #clearExtend
 *  @see #sizeExtend
 */
// -beg- preserve=no 3626B0E203DE add_head362661700208 "ExtensionPoint::addExtend"
public void addExtend(Extend extend1)
// -end- 3626B0E203DE add_head362661700208 "ExtensionPoint::addExtend"
;     // empty

/** disconnect a Extend.
 *  @see #addExtend
 */
// -beg- preserve=no 3626B0E203DE remove_head362661700208 "ExtensionPoint::removeExtend"
public Extend removeExtend(Extend extend1)
// -end- 3626B0E203DE remove_head362661700208 "ExtensionPoint::removeExtend"
;     // empty

/** tests if a given Extend is connected.
 *  @see #addExtend
 */
// -beg- preserve=no 3626B0E203DE test_head362661700208 "ExtensionPoint::containsExtend"
public boolean containsExtend(Extend extend1)
// -end- 3626B0E203DE test_head362661700208 "ExtensionPoint::containsExtend"
;     // empty

/** used to enumerate all connected Extends.
 *  @see #addExtend
 */
// -beg- preserve=no 3626B0E203DE get_all_head362661700208 "ExtensionPoint::iteratorExtend"
public Iterator<?> iteratorExtend()
// -end- 3626B0E203DE get_all_head362661700208 "ExtensionPoint::iteratorExtend"
;     // empty

/** disconnect all Extends.
 *  @see #addExtend
 */
// -beg- preserve=no 3626B0E203DE remove_all_head362661700208 "ExtensionPoint::clearExtend"
public void clearExtend()
// -end- 3626B0E203DE remove_all_head362661700208 "ExtensionPoint::clearExtend"
;     // empty

/** returns the number of Extends.
 *  @see #addExtend
 */
// -beg- preserve=no 3626B0E203DE size_head362661700208 "ExtensionPoint::sizeExtend"
public int sizeExtend()
// -end- 3626B0E203DE size_head362661700208 "ExtensionPoint::sizeExtend"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3626B0E203DE _link_body362661700208 "ExtensionPoint::_linkExtend"
public void _linkExtend(Extend extend1);
// -end- 3626B0E203DE _link_body362661700208 "ExtensionPoint::_linkExtend"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3626B0E203DE _unlink_body362661700208 "ExtensionPoint::_unlinkExtend"
public void _unlinkExtend(Extend extend1);
// -end- 3626B0E203DE _unlink_body362661700208 "ExtensionPoint::_unlinkExtend"

/** get current value of location
 *  @see #setLocation
 */
// -beg- preserve=no 3634E53A00DC get_head362661700208 "location"
LocationReference getLocation()
// -end- 3634E53A00DC get_head362661700208 "location"
;     // empty
/** set current value of location
 *  @see #getLocation
 */
// -beg- preserve=no 3634E53A00DC set_head362661700208 "location"
void setLocation(LocationReference value1)
// -end- 3634E53A00DC set_head362661700208 "location"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 362661700208 detail_end "ExtensionPoint"

// -end- 362661700208 detail_end "ExtensionPoint"

}
