// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:27 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327A649B000A package "Constraint"
package ch.ehi.uml1_4.foundation.core;
// -end- 327A649B000A package "Constraint"

import java.util.Iterator;

// -beg- preserve=no 327A649B000A autoimport "Constraint"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.extensionmechanisms.Stereotype;
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
// -end- 327A649B000A autoimport "Constraint"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327A649B000A import "Constraint"

// -end- 327A649B000A import "Constraint"

/** A constraint is a semantic condition or restriction expressed in text.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:27 $
 */
public interface Constraint extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A649B000A detail_begin "Constraint"

// -end- 327A649B000A detail_begin "Constraint"

/** add a ConstrainedElement.
 *
 *  @see #removeConstrainedElement
 *  @see #containsConstrainedElement
 *  @see #iteratorConstrainedElement
 *  @see #clearConstrainedElement
 *  @see #sizeConstrainedElement
 */
// -beg- preserve=no 33EA67BB010F add_head327A649B000A "Constraint::addConstrainedElement"
public void addConstrainedElement(ModelElement constrainedElement1)
// -end- 33EA67BB010F add_head327A649B000A "Constraint::addConstrainedElement"
;     // empty

// -beg- preserve=no 33EA67BB010F add2_head327A649B000A "Constraint::add2ConstrainedElement"
public void addConstrainedElement(int index,ModelElement constrainedElement1)
// -end- 33EA67BB010F add2_head327A649B000A "Constraint::add2ConstrainedElement"
;     // empty

/** disconnect a ConstrainedElement.
 *  @see #addConstrainedElement
 */
// -beg- preserve=no 33EA67BB010F remove_head327A649B000A "Constraint::removeConstrainedElement"
public ModelElement removeConstrainedElement(ModelElement constrainedElement1)
// -end- 33EA67BB010F remove_head327A649B000A "Constraint::removeConstrainedElement"
;     // empty

/** disconnect a ConstrainedElement.
 *  @see #addConstrainedElement
 */
// -beg- preserve=no 33EA67BB010F remove2_head327A649B000A "Constraint::remove2ConstrainedElement"
public ModelElement removeConstrainedElement(int index)
// -end- 33EA67BB010F remove2_head327A649B000A "Constraint::remove2ConstrainedElement"
;     // empty

/** change a ConstrainedElement.
 *  @see #addConstrainedElement
 */
// -beg- preserve=no 33EA67BB010F set_head327A649B000A "Constraint::setConstrainedElement"
public ModelElement setConstrainedElement(int index,ModelElement constrainedElement1)
// -end- 33EA67BB010F set_head327A649B000A "Constraint::setConstrainedElement"
;     // empty

/** tests if a given ConstrainedElement is connected.
 *  @see #addConstrainedElement
 */
// -beg- preserve=no 33EA67BB010F test_head327A649B000A "Constraint::containsConstrainedElement"
public boolean containsConstrainedElement(ModelElement constrainedElement1)
// -end- 33EA67BB010F test_head327A649B000A "Constraint::containsConstrainedElement"
;     // empty

/** used to enumerate all connected ConstrainedElements.
 *  @see #addConstrainedElement
 */
// -beg- preserve=no 33EA67BB010F get_all_head327A649B000A "Constraint::iteratorConstrainedElement"
public Iterator<?> iteratorConstrainedElement()
// -end- 33EA67BB010F get_all_head327A649B000A "Constraint::iteratorConstrainedElement"
;     // empty

/** disconnect all ConstrainedElements.
 *  @see #addConstrainedElement
 */
// -beg- preserve=no 33EA67BB010F remove_all_head327A649B000A "Constraint::clearConstrainedElement"
public void clearConstrainedElement()
// -end- 33EA67BB010F remove_all_head327A649B000A "Constraint::clearConstrainedElement"
;     // empty

/** returns the number of ConstrainedElements.
 *  @see #addConstrainedElement
 */
// -beg- preserve=no 33EA67BB010F size_head327A649B000A "Constraint::sizeConstrainedElement"
public int sizeConstrainedElement()
// -end- 33EA67BB010F size_head327A649B000A "Constraint::sizeConstrainedElement"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33EA67BB010F _link_body327A649B000A "Constraint::_linkConstrainedElement"
public void _linkConstrainedElement(ModelElement constrainedElement1);
// -end- 33EA67BB010F _link_body327A649B000A "Constraint::_linkConstrainedElement"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33EA67BB010F _unlink_body327A649B000A "Constraint::_unlinkConstrainedElement"
public void _unlinkConstrainedElement(ModelElement constrainedElement1);
// -end- 33EA67BB010F _unlink_body327A649B000A "Constraint::_unlinkConstrainedElement"

/** attaches a ConstrainedStereotype.
 *
 *  @see #detachConstrainedStereotype
 *  @see #getConstrainedStereotype
 *  @see #containsConstrainedStereotype
 */
// -beg- preserve=no 364B66900259 attach_head327A649B000A "Constraint::attachConstrainedStereotype"
public void attachConstrainedStereotype(Stereotype constrainedStereotype1)
// -end- 364B66900259 attach_head327A649B000A "Constraint::attachConstrainedStereotype"
;     // empty

/** disconnect the currently attached ConstrainedStereotype.
 *  @see #attachConstrainedStereotype
 */
// -beg- preserve=no 364B66900259 detach_head327A649B000A "Constraint::detachConstrainedStereotype"
public Stereotype detachConstrainedStereotype()
// -end- 364B66900259 detach_head327A649B000A "Constraint::detachConstrainedStereotype"
;     // empty

/** get the currently attached ConstrainedStereotype.
 *  @see #attachConstrainedStereotype
 */
// -beg- preserve=no 364B66900259 get_head327A649B000A "Constraint::getConstrainedStereotype"
public Stereotype getConstrainedStereotype()
// -end- 364B66900259 get_head327A649B000A "Constraint::getConstrainedStereotype"
;     // empty

/** tests if there is a ConstrainedStereotype attached.
 *  @see #attachConstrainedStereotype
 */
// -beg- preserve=no 364B66900259 test_head327A649B000A "Constraint::containsConstrainedStereotype"
public boolean containsConstrainedStereotype()
// -end- 364B66900259 test_head327A649B000A "Constraint::containsConstrainedStereotype"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 364B66900259 _link_body327A649B000A "Constraint::_linkConstrainedStereotype"
public void _linkConstrainedStereotype(Stereotype constrainedStereotype1);
// -end- 364B66900259 _link_body327A649B000A "Constraint::_linkConstrainedStereotype"

/** DONT USE; link management internal
 */
// -beg- preserve=no 364B66900259 _unlink_body327A649B000A "Constraint::_unlinkConstrainedStereotype"
public void _unlinkConstrainedStereotype(Stereotype constrainedStereotype1);
// -end- 364B66900259 _unlink_body327A649B000A "Constraint::_unlinkConstrainedStereotype"

/** get current value of body
 *  @see #setBody
 */
// -beg- preserve=no 32866F630244 get_head327A649B000A "body"
BooleanExpression getBody()
// -end- 32866F630244 get_head327A649B000A "body"
;     // empty
/** set current value of body
 *  @see #getBody
 */
// -beg- preserve=no 32866F630244 set_head327A649B000A "body"
void setBody(BooleanExpression value1)
// -end- 32866F630244 set_head327A649B000A "body"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A649B000A detail_end "Constraint"

// -end- 327A649B000A detail_end "Constraint"

}
