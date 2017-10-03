// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:25 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33F675820370 package "Comment"
package ch.ehi.uml1_4.foundation.core;
// -end- 33F675820370 package "Comment"

// -beg- preserve=no 33F675820370 autoimport "Comment"
import ch.ehi.uml1_4.foundation.core.ModelElement;

import java.util.Iterator;

import ch.ehi.basics.types.NlsString;
// -end- 33F675820370 autoimport "Comment"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33F675820370 import "Comment"

// -end- 33F675820370 import "Comment"

/** A comment is an annotation attached to a model element or a set of model elements.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:25 $
 */
public interface Comment extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F675820370 detail_begin "Comment"

// -end- 33F675820370 detail_begin "Comment"

/** add a AnnotatedElement.
 *
 *  @see #removeAnnotatedElement
 *  @see #containsAnnotatedElement
 *  @see #iteratorAnnotatedElement
 *  @see #clearAnnotatedElement
 *  @see #sizeAnnotatedElement
 */
// -beg- preserve=no 370E7E3C02CE add_head33F675820370 "Comment::addAnnotatedElement"
public void addAnnotatedElement(ModelElement annotatedElement1)
// -end- 370E7E3C02CE add_head33F675820370 "Comment::addAnnotatedElement"
;     // empty

/** disconnect a AnnotatedElement.
 *  @see #addAnnotatedElement
 */
// -beg- preserve=no 370E7E3C02CE remove_head33F675820370 "Comment::removeAnnotatedElement"
public ModelElement removeAnnotatedElement(ModelElement annotatedElement1)
// -end- 370E7E3C02CE remove_head33F675820370 "Comment::removeAnnotatedElement"
;     // empty

/** tests if a given AnnotatedElement is connected.
 *  @see #addAnnotatedElement
 */
// -beg- preserve=no 370E7E3C02CE test_head33F675820370 "Comment::containsAnnotatedElement"
public boolean containsAnnotatedElement(ModelElement annotatedElement1)
// -end- 370E7E3C02CE test_head33F675820370 "Comment::containsAnnotatedElement"
;     // empty

/** used to enumerate all connected AnnotatedElements.
 *  @see #addAnnotatedElement
 */
// -beg- preserve=no 370E7E3C02CE get_all_head33F675820370 "Comment::iteratorAnnotatedElement"
public Iterator<?> iteratorAnnotatedElement()
// -end- 370E7E3C02CE get_all_head33F675820370 "Comment::iteratorAnnotatedElement"
;     // empty

/** disconnect all AnnotatedElements.
 *  @see #addAnnotatedElement
 */
// -beg- preserve=no 370E7E3C02CE remove_all_head33F675820370 "Comment::clearAnnotatedElement"
public void clearAnnotatedElement()
// -end- 370E7E3C02CE remove_all_head33F675820370 "Comment::clearAnnotatedElement"
;     // empty

/** returns the number of AnnotatedElements.
 *  @see #addAnnotatedElement
 */
// -beg- preserve=no 370E7E3C02CE size_head33F675820370 "Comment::sizeAnnotatedElement"
public int sizeAnnotatedElement()
// -end- 370E7E3C02CE size_head33F675820370 "Comment::sizeAnnotatedElement"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 370E7E3C02CE _link_body33F675820370 "Comment::_linkAnnotatedElement"
public void _linkAnnotatedElement(ModelElement annotatedElement1);
// -end- 370E7E3C02CE _link_body33F675820370 "Comment::_linkAnnotatedElement"

/** DONT USE; link management internal
 */
// -beg- preserve=no 370E7E3C02CE _unlink_body33F675820370 "Comment::_unlinkAnnotatedElement"
public void _unlinkAnnotatedElement(ModelElement annotatedElement1);
// -end- 370E7E3C02CE _unlink_body33F675820370 "Comment::_unlinkAnnotatedElement"

/** get current value of body
 *  @see #setBody
 */
// -beg- preserve=no 3A555A8100EA get_head33F675820370 "body"
NlsString getBody()
// -end- 3A555A8100EA get_head33F675820370 "body"
;     // empty
/** set current value of body
 *  @see #getBody
 */
// -beg- preserve=no 3A555A8100EA set_head33F675820370 "body"
void setBody(NlsString value1)
// -end- 3A555A8100EA set_head33F675820370 "body"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33F675820370 detail_end "Comment"

// -end- 33F675820370 detail_end "Comment"

}
