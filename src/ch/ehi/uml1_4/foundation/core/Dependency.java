// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:28 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327A646F00E6 package "Dependency"
package ch.ehi.uml1_4.foundation.core;
// -end- 327A646F00E6 package "Dependency"

// -beg- preserve=no 327A646F00E6 autoimport "Dependency"
import ch.ehi.uml1_4.foundation.core.Relationship;

import java.util.Iterator;

import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
// -end- 327A646F00E6 autoimport "Dependency"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327A646F00E6 import "Dependency"

// -end- 327A646F00E6 import "Dependency"

/** A term of convenience for a Relationship other than Association, Generalization, Flow, ormetarelationship (such as the relationship between a Classifier and one of its Instances).
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:28 $
 */
public interface Dependency extends Relationship, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A646F00E6 detail_begin "Dependency"

// -end- 327A646F00E6 detail_begin "Dependency"

// -beg- preserve=no 3E423DBE00A1 head327A646F00E6 "changeClient"
public void changeClient(ModelElement oldClient, ModelElement newClient)
// -end- 3E423DBE00A1 head327A646F00E6 "changeClient"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3E423DBE00A1 throws327A646F00E6 "changeClient"

// -end- 3E423DBE00A1 throws327A646F00E6 "changeClient"
;     // empty

// -beg- preserve=no 3E423DCA0134 head327A646F00E6 "changeSupplier"
public void changeSupplier(ModelElement oldSupplier, ModelElement newSupplier)
// -end- 3E423DCA0134 head327A646F00E6 "changeSupplier"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3E423DCA0134 throws327A646F00E6 "changeSupplier"

// -end- 3E423DCA0134 throws327A646F00E6 "changeSupplier"
;     // empty

/** add a Client.
 *
 *  @see #removeClient
 *  @see #containsClient
 *  @see #iteratorClient
 *  @see #clearClient
 *  @see #sizeClient
 */
// -beg- preserve=no 33FFE57B03B3 add_head327A646F00E6 "Dependency::addClient"
public void addClient(ModelElement client1)
// -end- 33FFE57B03B3 add_head327A646F00E6 "Dependency::addClient"
;     // empty

/** disconnect a Client.
 *  @see #addClient
 */
// -beg- preserve=no 33FFE57B03B3 remove_head327A646F00E6 "Dependency::removeClient"
public ModelElement removeClient(ModelElement client1)
// -end- 33FFE57B03B3 remove_head327A646F00E6 "Dependency::removeClient"
;     // empty

/** tests if a given Client is connected.
 *  @see #addClient
 */
// -beg- preserve=no 33FFE57B03B3 test_head327A646F00E6 "Dependency::containsClient"
public boolean containsClient(ModelElement client1)
// -end- 33FFE57B03B3 test_head327A646F00E6 "Dependency::containsClient"
;     // empty

/** used to enumerate all connected Clients.
 *  @see #addClient
 */
// -beg- preserve=no 33FFE57B03B3 get_all_head327A646F00E6 "Dependency::iteratorClient"
public Iterator<?> iteratorClient()
// -end- 33FFE57B03B3 get_all_head327A646F00E6 "Dependency::iteratorClient"
;     // empty

/** disconnect all Clients.
 *  @see #addClient
 */
// -beg- preserve=no 33FFE57B03B3 remove_all_head327A646F00E6 "Dependency::clearClient"
public void clearClient()
// -end- 33FFE57B03B3 remove_all_head327A646F00E6 "Dependency::clearClient"
;     // empty

/** returns the number of Clients.
 *  @see #addClient
 */
// -beg- preserve=no 33FFE57B03B3 size_head327A646F00E6 "Dependency::sizeClient"
public int sizeClient()
// -end- 33FFE57B03B3 size_head327A646F00E6 "Dependency::sizeClient"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FFE57B03B3 _link_body327A646F00E6 "Dependency::_linkClient"
public void _linkClient(ModelElement client1);
// -end- 33FFE57B03B3 _link_body327A646F00E6 "Dependency::_linkClient"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FFE57B03B3 _unlink_body327A646F00E6 "Dependency::_unlinkClient"
public void _unlinkClient(ModelElement client1);
// -end- 33FFE57B03B3 _unlink_body327A646F00E6 "Dependency::_unlinkClient"

/** add a Supplier.
 *
 *  @see #removeSupplier
 *  @see #containsSupplier
 *  @see #iteratorSupplier
 *  @see #clearSupplier
 *  @see #sizeSupplier
 */
// -beg- preserve=no 335C0D7A02E4 add_head327A646F00E6 "Dependency::addSupplier"
public void addSupplier(ModelElement supplier1)
// -end- 335C0D7A02E4 add_head327A646F00E6 "Dependency::addSupplier"
;     // empty

/** disconnect a Supplier.
 *  @see #addSupplier
 */
// -beg- preserve=no 335C0D7A02E4 remove_head327A646F00E6 "Dependency::removeSupplier"
public ModelElement removeSupplier(ModelElement supplier1)
// -end- 335C0D7A02E4 remove_head327A646F00E6 "Dependency::removeSupplier"
;     // empty

/** tests if a given Supplier is connected.
 *  @see #addSupplier
 */
// -beg- preserve=no 335C0D7A02E4 test_head327A646F00E6 "Dependency::containsSupplier"
public boolean containsSupplier(ModelElement supplier1)
// -end- 335C0D7A02E4 test_head327A646F00E6 "Dependency::containsSupplier"
;     // empty

/** used to enumerate all connected Suppliers.
 *  @see #addSupplier
 */
// -beg- preserve=no 335C0D7A02E4 get_all_head327A646F00E6 "Dependency::iteratorSupplier"
public Iterator<?> iteratorSupplier()
// -end- 335C0D7A02E4 get_all_head327A646F00E6 "Dependency::iteratorSupplier"
;     // empty

/** disconnect all Suppliers.
 *  @see #addSupplier
 */
// -beg- preserve=no 335C0D7A02E4 remove_all_head327A646F00E6 "Dependency::clearSupplier"
public void clearSupplier()
// -end- 335C0D7A02E4 remove_all_head327A646F00E6 "Dependency::clearSupplier"
;     // empty

/** returns the number of Suppliers.
 *  @see #addSupplier
 */
// -beg- preserve=no 335C0D7A02E4 size_head327A646F00E6 "Dependency::sizeSupplier"
public int sizeSupplier()
// -end- 335C0D7A02E4 size_head327A646F00E6 "Dependency::sizeSupplier"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 335C0D7A02E4 _link_body327A646F00E6 "Dependency::_linkSupplier"
public void _linkSupplier(ModelElement supplier1);
// -end- 335C0D7A02E4 _link_body327A646F00E6 "Dependency::_linkSupplier"

/** DONT USE; link management internal
 */
// -beg- preserve=no 335C0D7A02E4 _unlink_body327A646F00E6 "Dependency::_unlinkSupplier"
public void _unlinkSupplier(ModelElement supplier1);
// -end- 335C0D7A02E4 _unlink_body327A646F00E6 "Dependency::_unlinkSupplier"

/** add a Presentation.
 *
 *  @see #removePresentation
 *  @see #containsPresentation
 *  @see #iteratorPresentation
 *  @see #clearPresentation
 *  @see #sizePresentation
 */
// -beg- preserve=no 362409A9000A add_head327A646F00E6 "ModelElement::addPresentation"
public void addPresentation(PresentationElement presentation1)
// -end- 362409A9000A add_head327A646F00E6 "ModelElement::addPresentation"
;     // empty

/** disconnect a Presentation.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_head327A646F00E6 "ModelElement::removePresentation"
public PresentationElement removePresentation(PresentationElement presentation1)
// -end- 362409A9000A remove_head327A646F00E6 "ModelElement::removePresentation"
;     // empty

/** tests if a given Presentation is connected.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A test_head327A646F00E6 "ModelElement::containsPresentation"
public boolean containsPresentation(PresentationElement presentation1)
// -end- 362409A9000A test_head327A646F00E6 "ModelElement::containsPresentation"
;     // empty

/** used to enumerate all connected Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A get_all_head327A646F00E6 "ModelElement::iteratorPresentation"
public Iterator<?> iteratorPresentation()
// -end- 362409A9000A get_all_head327A646F00E6 "ModelElement::iteratorPresentation"
;     // empty

/** disconnect all Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_all_head327A646F00E6 "ModelElement::clearPresentation"
public void clearPresentation()
// -end- 362409A9000A remove_all_head327A646F00E6 "ModelElement::clearPresentation"
;     // empty

/** returns the number of Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A size_head327A646F00E6 "ModelElement::sizePresentation"
public int sizePresentation()
// -end- 362409A9000A size_head327A646F00E6 "ModelElement::sizePresentation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _link_body327A646F00E6 "ModelElement::_linkPresentation"
public void _linkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _link_body327A646F00E6 "ModelElement::_linkPresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _unlink_body327A646F00E6 "ModelElement::_unlinkPresentation"
public void _unlinkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _unlink_body327A646F00E6 "ModelElement::_unlinkPresentation"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A646F00E6 detail_end "Dependency"

// -end- 327A646F00E6 detail_end "Dependency"

}
