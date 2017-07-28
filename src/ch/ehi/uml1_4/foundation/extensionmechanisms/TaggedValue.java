// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:48 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 337A4EF7002C package "TaggedValue"
package ch.ehi.uml1_4.foundation.extensionmechanisms;
// -end- 337A4EF7002C package "TaggedValue"

// -beg- preserve=no 337A4EF7002C autoimport "TaggedValue"
import ch.ehi.uml1_4.foundation.core.Element;
import ch.ehi.uml1_4.foundation.core.ModelElement;
// -end- 337A4EF7002C autoimport "TaggedValue"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 337A4EF7002C import "TaggedValue"

// -end- 337A4EF7002C import "TaggedValue"

/** A tagged value allows information to be attached to any model element in conformance with itstag definition.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:48 $
 */
public interface TaggedValue extends Element, ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=yes 337A4EF7002C detail_begin "TaggedValue"
public static final String TAGGEDVALUE_LANG="";
// -end- 337A4EF7002C detail_begin "TaggedValue"

/** attaches a ModelElement.
 *
 *  @see #detachModelElement
 *  @see #getModelElement
 *  @see #containsModelElement
 */
// -beg- preserve=no 33E901E10028 attach_head337A4EF7002C "TaggedValue::attachModelElement"
public void attachModelElement(ModelElement modelElement1)
// -end- 33E901E10028 attach_head337A4EF7002C "TaggedValue::attachModelElement"
;     // empty

/** disconnect the currently attached ModelElement.
 *  @see #attachModelElement
 */
// -beg- preserve=no 33E901E10028 detach_head337A4EF7002C "TaggedValue::detachModelElement"
public ModelElement detachModelElement()
// -end- 33E901E10028 detach_head337A4EF7002C "TaggedValue::detachModelElement"
;     // empty

/** get the currently attached ModelElement.
 *  @see #attachModelElement
 */
// -beg- preserve=no 33E901E10028 get_head337A4EF7002C "TaggedValue::getModelElement"
public ModelElement getModelElement()
// -end- 33E901E10028 get_head337A4EF7002C "TaggedValue::getModelElement"
;     // empty

/** tests if there is a ModelElement attached.
 *  @see #attachModelElement
 */
// -beg- preserve=no 33E901E10028 test_head337A4EF7002C "TaggedValue::containsModelElement"
public boolean containsModelElement()
// -end- 33E901E10028 test_head337A4EF7002C "TaggedValue::containsModelElement"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33E901E10028 _link_body337A4EF7002C "TaggedValue::_linkModelElement"
public void _linkModelElement(ModelElement modelElement1);
// -end- 33E901E10028 _link_body337A4EF7002C "TaggedValue::_linkModelElement"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33E901E10028 _unlink_body337A4EF7002C "TaggedValue::_unlinkModelElement"
public void _unlinkModelElement(ModelElement modelElement1);
// -end- 33E901E10028 _unlink_body337A4EF7002C "TaggedValue::_unlinkModelElement"

/** add a ReferenceValue.
 *
 *  @see #removeReferenceValue
 *  @see #containsReferenceValue
 *  @see #iteratorReferenceValue
 *  @see #clearReferenceValue
 *  @see #sizeReferenceValue
 */
// -beg- preserve=no 39B9B0F80000 add_head337A4EF7002C "TaggedValue::addReferenceValue"
public void addReferenceValue(ModelElement referenceValue1)
// -end- 39B9B0F80000 add_head337A4EF7002C "TaggedValue::addReferenceValue"
;     // empty

/** disconnect a ReferenceValue.
 *  @see #addReferenceValue
 */
// -beg- preserve=no 39B9B0F80000 remove_head337A4EF7002C "TaggedValue::removeReferenceValue"
public ModelElement removeReferenceValue(ModelElement referenceValue1)
// -end- 39B9B0F80000 remove_head337A4EF7002C "TaggedValue::removeReferenceValue"
;     // empty

/** tests if a given ReferenceValue is connected.
 *  @see #addReferenceValue
 */
// -beg- preserve=no 39B9B0F80000 test_head337A4EF7002C "TaggedValue::containsReferenceValue"
public boolean containsReferenceValue(ModelElement referenceValue1)
// -end- 39B9B0F80000 test_head337A4EF7002C "TaggedValue::containsReferenceValue"
;     // empty

/** used to enumerate all connected ReferenceValues.
 *  @see #addReferenceValue
 */
// -beg- preserve=no 39B9B0F80000 get_all_head337A4EF7002C "TaggedValue::iteratorReferenceValue"
public java.util.Iterator iteratorReferenceValue()
// -end- 39B9B0F80000 get_all_head337A4EF7002C "TaggedValue::iteratorReferenceValue"
;     // empty

/** disconnect all ReferenceValues.
 *  @see #addReferenceValue
 */
// -beg- preserve=no 39B9B0F80000 remove_all_head337A4EF7002C "TaggedValue::clearReferenceValue"
public void clearReferenceValue()
// -end- 39B9B0F80000 remove_all_head337A4EF7002C "TaggedValue::clearReferenceValue"
;     // empty

/** returns the number of ReferenceValues.
 *  @see #addReferenceValue
 */
// -beg- preserve=no 39B9B0F80000 size_head337A4EF7002C "TaggedValue::sizeReferenceValue"
public int sizeReferenceValue()
// -end- 39B9B0F80000 size_head337A4EF7002C "TaggedValue::sizeReferenceValue"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 39B9B0F80000 _link_body337A4EF7002C "TaggedValue::_linkReferenceValue"
public void _linkReferenceValue(ModelElement referenceValue1);
// -end- 39B9B0F80000 _link_body337A4EF7002C "TaggedValue::_linkReferenceValue"

/** DONT USE; link management internal
 */
// -beg- preserve=no 39B9B0F80000 _unlink_body337A4EF7002C "TaggedValue::_unlinkReferenceValue"
public void _unlinkReferenceValue(ModelElement referenceValue1);
// -end- 39B9B0F80000 _unlink_body337A4EF7002C "TaggedValue::_unlinkReferenceValue"

/** get current value of dataValue
 *  Specifies the set of values that are part of the tagged value.
 *  @see #setDataValue
 */
// -beg- preserve=no 337A50700273 get_head337A4EF7002C "dataValue"
String getDataValue()
// -end- 337A50700273 get_head337A4EF7002C "dataValue"
;     // empty
/** set current value of dataValue
 *  @see #getDataValue
 */
// -beg- preserve=no 337A50700273 set_head337A4EF7002C "dataValue"
void setDataValue(String value1)
// -end- 337A50700273 set_head337A4EF7002C "dataValue"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 337A4EF7002C detail_end "TaggedValue"

// -end- 337A4EF7002C detail_end "TaggedValue"

}
