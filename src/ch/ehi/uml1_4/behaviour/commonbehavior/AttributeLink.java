// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:55 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33BEF3A603CA package "AttributeLink"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 33BEF3A603CA package "AttributeLink"

// -beg- preserve=no 33BEF3A603CA autoimport "AttributeLink"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Attribute;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.commonbehavior.LinkEnd;
// -end- 33BEF3A603CA autoimport "AttributeLink"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33BEF3A603CA import "AttributeLink"

// -end- 33BEF3A603CA import "AttributeLink"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:55 $
 */
public interface AttributeLink extends ModelElement, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33BEF3A603CA detail_begin "AttributeLink"

// -end- 33BEF3A603CA detail_begin "AttributeLink"

/** attaches a Attribute.
 *
 *  @see #detachAttribute
 *  @see #getAttribute
 *  @see #containsAttribute
 */
// -beg- preserve=no 33DBC16E02C6 attach_head33BEF3A603CA "AttributeLink::attachAttribute"
public void attachAttribute(Attribute attribute1)
// -end- 33DBC16E02C6 attach_head33BEF3A603CA "AttributeLink::attachAttribute"
;     // empty

/** disconnect the currently attached Attribute.
 *  @see #attachAttribute
 */
// -beg- preserve=no 33DBC16E02C6 detach_head33BEF3A603CA "AttributeLink::detachAttribute"
public Attribute detachAttribute()
// -end- 33DBC16E02C6 detach_head33BEF3A603CA "AttributeLink::detachAttribute"
;     // empty

/** get the currently attached Attribute.
 *  @see #attachAttribute
 */
// -beg- preserve=no 33DBC16E02C6 get_head33BEF3A603CA "AttributeLink::getAttribute"
public Attribute getAttribute()
// -end- 33DBC16E02C6 get_head33BEF3A603CA "AttributeLink::getAttribute"
;     // empty

/** tests if there is a Attribute attached.
 *  @see #attachAttribute
 */
// -beg- preserve=no 33DBC16E02C6 test_head33BEF3A603CA "AttributeLink::containsAttribute"
public boolean containsAttribute()
// -end- 33DBC16E02C6 test_head33BEF3A603CA "AttributeLink::containsAttribute"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBC16E02C6 _link_body33BEF3A603CA "AttributeLink::_linkAttribute"
public void _linkAttribute(Attribute attribute1);
// -end- 33DBC16E02C6 _link_body33BEF3A603CA "AttributeLink::_linkAttribute"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBC16E02C6 _unlink_body33BEF3A603CA "AttributeLink::_unlinkAttribute"
public void _unlinkAttribute(Attribute attribute1);
// -end- 33DBC16E02C6 _unlink_body33BEF3A603CA "AttributeLink::_unlinkAttribute"

/** attaches a Value.
 *
 *  @see #detachValue
 *  @see #getValue
 *  @see #containsValue
 */
// -beg- preserve=no 33DBC1A401EA attach_head33BEF3A603CA "AttributeLink::attachValue"
public void attachValue(Instance value1)
// -end- 33DBC1A401EA attach_head33BEF3A603CA "AttributeLink::attachValue"
;     // empty

/** disconnect the currently attached Value.
 *  @see #attachValue
 */
// -beg- preserve=no 33DBC1A401EA detach_head33BEF3A603CA "AttributeLink::detachValue"
public Instance detachValue()
// -end- 33DBC1A401EA detach_head33BEF3A603CA "AttributeLink::detachValue"
;     // empty

/** get the currently attached Value.
 *  @see #attachValue
 */
// -beg- preserve=no 33DBC1A401EA get_head33BEF3A603CA "AttributeLink::getValue"
public Instance getValue()
// -end- 33DBC1A401EA get_head33BEF3A603CA "AttributeLink::getValue"
;     // empty

/** tests if there is a Value attached.
 *  @see #attachValue
 */
// -beg- preserve=no 33DBC1A401EA test_head33BEF3A603CA "AttributeLink::containsValue"
public boolean containsValue()
// -end- 33DBC1A401EA test_head33BEF3A603CA "AttributeLink::containsValue"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBC1A401EA _link_body33BEF3A603CA "AttributeLink::_linkValue"
public void _linkValue(Instance value1);
// -end- 33DBC1A401EA _link_body33BEF3A603CA "AttributeLink::_linkValue"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33DBC1A401EA _unlink_body33BEF3A603CA "AttributeLink::_unlinkValue"
public void _unlinkValue(Instance value1);
// -end- 33DBC1A401EA _unlink_body33BEF3A603CA "AttributeLink::_unlinkValue"

/** attaches a Instance.
 *
 *  @see #detachInstance
 *  @see #getInstance
 *  @see #containsInstance
 */
// -beg- preserve=no 33FF4EFA0136 attach_head33BEF3A603CA "AttributeLink::attachInstance"
public void attachInstance(Instance instance1)
// -end- 33FF4EFA0136 attach_head33BEF3A603CA "AttributeLink::attachInstance"
;     // empty

/** disconnect the currently attached Instance.
 *  @see #attachInstance
 */
// -beg- preserve=no 33FF4EFA0136 detach_head33BEF3A603CA "AttributeLink::detachInstance"
public Instance detachInstance()
// -end- 33FF4EFA0136 detach_head33BEF3A603CA "AttributeLink::detachInstance"
;     // empty

/** get the currently attached Instance.
 *  @see #attachInstance
 */
// -beg- preserve=no 33FF4EFA0136 get_head33BEF3A603CA "AttributeLink::getInstance"
public Instance getInstance()
// -end- 33FF4EFA0136 get_head33BEF3A603CA "AttributeLink::getInstance"
;     // empty

/** tests if there is a Instance attached.
 *  @see #attachInstance
 */
// -beg- preserve=no 33FF4EFA0136 test_head33BEF3A603CA "AttributeLink::containsInstance"
public boolean containsInstance()
// -end- 33FF4EFA0136 test_head33BEF3A603CA "AttributeLink::containsInstance"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF4EFA0136 _link_body33BEF3A603CA "AttributeLink::_linkInstance"
public void _linkInstance(Instance instance1);
// -end- 33FF4EFA0136 _link_body33BEF3A603CA "AttributeLink::_linkInstance"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FF4EFA0136 _unlink_body33BEF3A603CA "AttributeLink::_unlinkInstance"
public void _unlinkInstance(Instance instance1);
// -end- 33FF4EFA0136 _unlink_body33BEF3A603CA "AttributeLink::_unlinkInstance"

/** attaches a LinkEnd.
 *
 *  @see #detachLinkEnd
 *  @see #getLinkEnd
 *  @see #containsLinkEnd
 */
// -beg- preserve=no 3742033D0230 attach_head33BEF3A603CA "AttributeLink::attachLinkEnd"
public void attachLinkEnd(LinkEnd linkEnd1)
// -end- 3742033D0230 attach_head33BEF3A603CA "AttributeLink::attachLinkEnd"
;     // empty

/** disconnect the currently attached LinkEnd.
 *  @see #attachLinkEnd
 */
// -beg- preserve=no 3742033D0230 detach_head33BEF3A603CA "AttributeLink::detachLinkEnd"
public LinkEnd detachLinkEnd()
// -end- 3742033D0230 detach_head33BEF3A603CA "AttributeLink::detachLinkEnd"
;     // empty

/** get the currently attached LinkEnd.
 *  @see #attachLinkEnd
 */
// -beg- preserve=no 3742033D0230 get_head33BEF3A603CA "AttributeLink::getLinkEnd"
public LinkEnd getLinkEnd()
// -end- 3742033D0230 get_head33BEF3A603CA "AttributeLink::getLinkEnd"
;     // empty

/** tests if there is a LinkEnd attached.
 *  @see #attachLinkEnd
 */
// -beg- preserve=no 3742033D0230 test_head33BEF3A603CA "AttributeLink::containsLinkEnd"
public boolean containsLinkEnd()
// -end- 3742033D0230 test_head33BEF3A603CA "AttributeLink::containsLinkEnd"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 3742033D0230 _link_body33BEF3A603CA "AttributeLink::_linkLinkEnd"
public void _linkLinkEnd(LinkEnd linkEnd1);
// -end- 3742033D0230 _link_body33BEF3A603CA "AttributeLink::_linkLinkEnd"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3742033D0230 _unlink_body33BEF3A603CA "AttributeLink::_unlinkLinkEnd"
public void _unlinkLinkEnd(LinkEnd linkEnd1);
// -end- 3742033D0230 _unlink_body33BEF3A603CA "AttributeLink::_unlinkLinkEnd"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33BEF3A603CA detail_end "AttributeLink"

// -end- 33BEF3A603CA detail_end "AttributeLink"

}
