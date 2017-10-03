// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:32 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327A8080035C package "Generalization"
package ch.ehi.uml1_4.foundation.core;
// -end- 327A8080035C package "Generalization"

// -beg- preserve=no 327A8080035C autoimport "Generalization"
import ch.ehi.uml1_4.foundation.core.Relationship;
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.PresentationElement;

import java.util.Iterator;

import ch.ehi.basics.types.NlsString;
// -end- 327A8080035C autoimport "Generalization"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327A8080035C import "Generalization"

// -end- 327A8080035C import "Generalization"

/** A generalization is a taxonomic relationship between a more general element and a morespecific element.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:32 $
 */
public interface Generalization extends Relationship, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A8080035C detail_begin "Generalization"

// -end- 327A8080035C detail_begin "Generalization"

// -beg- preserve=no 3E423BFA02AA head327A8080035C "changeChild"
public GeneralizableElement changeChild(GeneralizableElement newchild)
// -end- 3E423BFA02AA head327A8080035C "changeChild"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3E423BFA02AA throws327A8080035C "changeChild"

// -end- 3E423BFA02AA throws327A8080035C "changeChild"
;     // empty

// -beg- preserve=no 3E423C090016 head327A8080035C "changeParent"
public GeneralizableElement changeParent(GeneralizableElement newparent)
// -end- 3E423C090016 head327A8080035C "changeParent"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3E423C090016 throws327A8080035C "changeParent"

// -end- 3E423C090016 throws327A8080035C "changeParent"
;     // empty

/** attaches a Child.
 *
 *  @see #detachChild
 *  @see #getChild
 *  @see #containsChild
 */
// -beg- preserve=no 335C14A50352 attach_head327A8080035C "Generalization::attachChild"
public void attachChild(GeneralizableElement child1)
// -end- 335C14A50352 attach_head327A8080035C "Generalization::attachChild"
;     // empty

/** disconnect the currently attached Child.
 *  @see #attachChild
 */
// -beg- preserve=no 335C14A50352 detach_head327A8080035C "Generalization::detachChild"
public GeneralizableElement detachChild()
// -end- 335C14A50352 detach_head327A8080035C "Generalization::detachChild"
;     // empty

/** get the currently attached Child.
 *  @see #attachChild
 */
// -beg- preserve=no 335C14A50352 get_head327A8080035C "Generalization::getChild"
public GeneralizableElement getChild()
// -end- 335C14A50352 get_head327A8080035C "Generalization::getChild"
;     // empty

/** tests if there is a Child attached.
 *  @see #attachChild
 */
// -beg- preserve=no 335C14A50352 test_head327A8080035C "Generalization::containsChild"
public boolean containsChild()
// -end- 335C14A50352 test_head327A8080035C "Generalization::containsChild"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 335C14A50352 _link_body327A8080035C "Generalization::_linkChild"
public void _linkChild(GeneralizableElement child1);
// -end- 335C14A50352 _link_body327A8080035C "Generalization::_linkChild"

/** DONT USE; link management internal
 */
// -beg- preserve=no 335C14A50352 _unlink_body327A8080035C "Generalization::_unlinkChild"
public void _unlinkChild(GeneralizableElement child1);
// -end- 335C14A50352 _unlink_body327A8080035C "Generalization::_unlinkChild"

/** attaches a Parent.
 *
 *  @see #detachParent
 *  @see #getParent
 *  @see #containsParent
 */
// -beg- preserve=no 335C146B0352 attach_head327A8080035C "Generalization::attachParent"
public void attachParent(GeneralizableElement parent1)
// -end- 335C146B0352 attach_head327A8080035C "Generalization::attachParent"
;     // empty

/** disconnect the currently attached Parent.
 *  @see #attachParent
 */
// -beg- preserve=no 335C146B0352 detach_head327A8080035C "Generalization::detachParent"
public GeneralizableElement detachParent()
// -end- 335C146B0352 detach_head327A8080035C "Generalization::detachParent"
;     // empty

/** get the currently attached Parent.
 *  @see #attachParent
 */
// -beg- preserve=no 335C146B0352 get_head327A8080035C "Generalization::getParent"
public GeneralizableElement getParent()
// -end- 335C146B0352 get_head327A8080035C "Generalization::getParent"
;     // empty

/** tests if there is a Parent attached.
 *  @see #attachParent
 */
// -beg- preserve=no 335C146B0352 test_head327A8080035C "Generalization::containsParent"
public boolean containsParent()
// -end- 335C146B0352 test_head327A8080035C "Generalization::containsParent"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 335C146B0352 _link_body327A8080035C "Generalization::_linkParent"
public void _linkParent(GeneralizableElement parent1);
// -end- 335C146B0352 _link_body327A8080035C "Generalization::_linkParent"

/** DONT USE; link management internal
 */
// -beg- preserve=no 335C146B0352 _unlink_body327A8080035C "Generalization::_unlinkParent"
public void _unlinkParent(GeneralizableElement parent1);
// -end- 335C146B0352 _unlink_body327A8080035C "Generalization::_unlinkParent"

/** attaches a Powertype.
 *
 *  @see #detachPowertype
 *  @see #getPowertype
 *  @see #containsPowertype
 */
// -beg- preserve=no 36E96A870370 attach_head327A8080035C "Generalization::attachPowertype"
public void attachPowertype(Classifier powertype1)
// -end- 36E96A870370 attach_head327A8080035C "Generalization::attachPowertype"
;     // empty

/** disconnect the currently attached Powertype.
 *  @see #attachPowertype
 */
// -beg- preserve=no 36E96A870370 detach_head327A8080035C "Generalization::detachPowertype"
public Classifier detachPowertype()
// -end- 36E96A870370 detach_head327A8080035C "Generalization::detachPowertype"
;     // empty

/** get the currently attached Powertype.
 *  @see #attachPowertype
 */
// -beg- preserve=no 36E96A870370 get_head327A8080035C "Generalization::getPowertype"
public Classifier getPowertype()
// -end- 36E96A870370 get_head327A8080035C "Generalization::getPowertype"
;     // empty

/** tests if there is a Powertype attached.
 *  @see #attachPowertype
 */
// -beg- preserve=no 36E96A870370 test_head327A8080035C "Generalization::containsPowertype"
public boolean containsPowertype()
// -end- 36E96A870370 test_head327A8080035C "Generalization::containsPowertype"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36E96A870370 _link_body327A8080035C "Generalization::_linkPowertype"
public void _linkPowertype(Classifier powertype1);
// -end- 36E96A870370 _link_body327A8080035C "Generalization::_linkPowertype"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36E96A870370 _unlink_body327A8080035C "Generalization::_unlinkPowertype"
public void _unlinkPowertype(Classifier powertype1);
// -end- 36E96A870370 _unlink_body327A8080035C "Generalization::_unlinkPowertype"

/** add a Presentation.
 *
 *  @see #removePresentation
 *  @see #containsPresentation
 *  @see #iteratorPresentation
 *  @see #clearPresentation
 *  @see #sizePresentation
 */
// -beg- preserve=no 362409A9000A add_head327A8080035C "ModelElement::addPresentation"
public void addPresentation(PresentationElement presentation1)
// -end- 362409A9000A add_head327A8080035C "ModelElement::addPresentation"
;     // empty

/** disconnect a Presentation.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_head327A8080035C "ModelElement::removePresentation"
public PresentationElement removePresentation(PresentationElement presentation1)
// -end- 362409A9000A remove_head327A8080035C "ModelElement::removePresentation"
;     // empty

/** tests if a given Presentation is connected.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A test_head327A8080035C "ModelElement::containsPresentation"
public boolean containsPresentation(PresentationElement presentation1)
// -end- 362409A9000A test_head327A8080035C "ModelElement::containsPresentation"
;     // empty

/** used to enumerate all connected Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A get_all_head327A8080035C "ModelElement::iteratorPresentation"
public Iterator<?> iteratorPresentation()
// -end- 362409A9000A get_all_head327A8080035C "ModelElement::iteratorPresentation"
;     // empty

/** disconnect all Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A remove_all_head327A8080035C "ModelElement::clearPresentation"
public void clearPresentation()
// -end- 362409A9000A remove_all_head327A8080035C "ModelElement::clearPresentation"
;     // empty

/** returns the number of Presentations.
 *  @see #addPresentation
 */
// -beg- preserve=no 362409A9000A size_head327A8080035C "ModelElement::sizePresentation"
public int sizePresentation()
// -end- 362409A9000A size_head327A8080035C "ModelElement::sizePresentation"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _link_body327A8080035C "ModelElement::_linkPresentation"
public void _linkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _link_body327A8080035C "ModelElement::_linkPresentation"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A9000A _unlink_body327A8080035C "ModelElement::_unlinkPresentation"
public void _unlinkPresentation(PresentationElement presentation1);
// -end- 362409A9000A _unlink_body327A8080035C "ModelElement::_unlinkPresentation"

/** get current value of discriminator
 *  @see #setDiscriminator
 */
// -beg- preserve=no 33E666CA01D6 get_head327A8080035C "discriminator"
NlsString getDiscriminator()
// -end- 33E666CA01D6 get_head327A8080035C "discriminator"
;     // empty
/** set current value of discriminator
 *  @see #getDiscriminator
 */
// -beg- preserve=no 33E666CA01D6 set_head327A8080035C "discriminator"
void setDiscriminator(NlsString value1)
// -end- 33E666CA01D6 set_head327A8080035C "discriminator"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A8080035C detail_end "Generalization"

// -end- 327A8080035C detail_end "Generalization"

}
