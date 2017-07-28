// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:04 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3389030B00E6 package "Signal"
package ch.ehi.uml1_4.behaviour.commonbehavior;
// -end- 3389030B00E6 package "Signal"

// -beg- preserve=no 3389030B00E6 autoimport "Signal"
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.behaviour.commonbehavior.SendAction;
import ch.ehi.uml1_4.behaviour.statemachines.SignalEvent;
import ch.ehi.uml1_4.behaviour.commonbehavior.Reception;
import ch.ehi.uml1_4.foundation.core.BehavioralFeature;
// -end- 3389030B00E6 autoimport "Signal"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3389030B00E6 import "Signal"

// -end- 3389030B00E6 import "Signal"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:04 $
 */
public interface Signal extends Classifier, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3389030B00E6 detail_begin "Signal"

// -end- 3389030B00E6 detail_begin "Signal"

/** add a SendAction.
 *
 *  @see #removeSendAction
 *  @see #containsSendAction
 *  @see #iteratorSendAction
 *  @see #clearSendAction
 *  @see #sizeSendAction
 */
// -beg- preserve=no 33699121012C add_head3389030B00E6 "Signal::addSendAction"
public void addSendAction(SendAction sendAction1)
// -end- 33699121012C add_head3389030B00E6 "Signal::addSendAction"
;     // empty

/** disconnect a SendAction.
 *  @see #addSendAction
 */
// -beg- preserve=no 33699121012C remove_head3389030B00E6 "Signal::removeSendAction"
public SendAction removeSendAction(SendAction sendAction1)
// -end- 33699121012C remove_head3389030B00E6 "Signal::removeSendAction"
;     // empty

/** tests if a given SendAction is connected.
 *  @see #addSendAction
 */
// -beg- preserve=no 33699121012C test_head3389030B00E6 "Signal::containsSendAction"
public boolean containsSendAction(SendAction sendAction1)
// -end- 33699121012C test_head3389030B00E6 "Signal::containsSendAction"
;     // empty

/** used to enumerate all connected SendActions.
 *  @see #addSendAction
 */
// -beg- preserve=no 33699121012C get_all_head3389030B00E6 "Signal::iteratorSendAction"
public java.util.Iterator iteratorSendAction()
// -end- 33699121012C get_all_head3389030B00E6 "Signal::iteratorSendAction"
;     // empty

/** disconnect all SendActions.
 *  @see #addSendAction
 */
// -beg- preserve=no 33699121012C remove_all_head3389030B00E6 "Signal::clearSendAction"
public void clearSendAction()
// -end- 33699121012C remove_all_head3389030B00E6 "Signal::clearSendAction"
;     // empty

/** returns the number of SendActions.
 *  @see #addSendAction
 */
// -beg- preserve=no 33699121012C size_head3389030B00E6 "Signal::sizeSendAction"
public int sizeSendAction()
// -end- 33699121012C size_head3389030B00E6 "Signal::sizeSendAction"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33699121012C _link_body3389030B00E6 "Signal::_linkSendAction"
public void _linkSendAction(SendAction sendAction1);
// -end- 33699121012C _link_body3389030B00E6 "Signal::_linkSendAction"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33699121012C _unlink_body3389030B00E6 "Signal::_unlinkSendAction"
public void _unlinkSendAction(SendAction sendAction1);
// -end- 33699121012C _unlink_body3389030B00E6 "Signal::_unlinkSendAction"

/** add a Occurrence.
 *
 *  @see #removeOccurrence
 *  @see #containsOccurrence
 *  @see #iteratorOccurrence
 *  @see #clearOccurrence
 *  @see #sizeOccurrence
 */
// -beg- preserve=no 336A39BE038E add_head3389030B00E6 "Signal::addOccurrence"
public void addOccurrence(SignalEvent occurrence1)
// -end- 336A39BE038E add_head3389030B00E6 "Signal::addOccurrence"
;     // empty

/** disconnect a Occurrence.
 *  @see #addOccurrence
 */
// -beg- preserve=no 336A39BE038E remove_head3389030B00E6 "Signal::removeOccurrence"
public SignalEvent removeOccurrence(SignalEvent occurrence1)
// -end- 336A39BE038E remove_head3389030B00E6 "Signal::removeOccurrence"
;     // empty

/** tests if a given Occurrence is connected.
 *  @see #addOccurrence
 */
// -beg- preserve=no 336A39BE038E test_head3389030B00E6 "Signal::containsOccurrence"
public boolean containsOccurrence(SignalEvent occurrence1)
// -end- 336A39BE038E test_head3389030B00E6 "Signal::containsOccurrence"
;     // empty

/** used to enumerate all connected Occurrences.
 *  @see #addOccurrence
 */
// -beg- preserve=no 336A39BE038E get_all_head3389030B00E6 "Signal::iteratorOccurrence"
public java.util.Iterator iteratorOccurrence()
// -end- 336A39BE038E get_all_head3389030B00E6 "Signal::iteratorOccurrence"
;     // empty

/** disconnect all Occurrences.
 *  @see #addOccurrence
 */
// -beg- preserve=no 336A39BE038E remove_all_head3389030B00E6 "Signal::clearOccurrence"
public void clearOccurrence()
// -end- 336A39BE038E remove_all_head3389030B00E6 "Signal::clearOccurrence"
;     // empty

/** returns the number of Occurrences.
 *  @see #addOccurrence
 */
// -beg- preserve=no 336A39BE038E size_head3389030B00E6 "Signal::sizeOccurrence"
public int sizeOccurrence()
// -end- 336A39BE038E size_head3389030B00E6 "Signal::sizeOccurrence"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 336A39BE038E _link_body3389030B00E6 "Signal::_linkOccurrence"
public void _linkOccurrence(SignalEvent occurrence1);
// -end- 336A39BE038E _link_body3389030B00E6 "Signal::_linkOccurrence"

/** DONT USE; link management internal
 */
// -beg- preserve=no 336A39BE038E _unlink_body3389030B00E6 "Signal::_unlinkOccurrence"
public void _unlinkOccurrence(SignalEvent occurrence1);
// -end- 336A39BE038E _unlink_body3389030B00E6 "Signal::_unlinkOccurrence"

/** add a Reception.
 *
 *  @see #removeReception
 *  @see #containsReception
 *  @see #iteratorReception
 *  @see #clearReception
 *  @see #sizeReception
 */
// -beg- preserve=no 33FA370702F8 add_head3389030B00E6 "Signal::addReception"
public void addReception(Reception reception1)
// -end- 33FA370702F8 add_head3389030B00E6 "Signal::addReception"
;     // empty

/** disconnect a Reception.
 *  @see #addReception
 */
// -beg- preserve=no 33FA370702F8 remove_head3389030B00E6 "Signal::removeReception"
public Reception removeReception(Reception reception1)
// -end- 33FA370702F8 remove_head3389030B00E6 "Signal::removeReception"
;     // empty

/** tests if a given Reception is connected.
 *  @see #addReception
 */
// -beg- preserve=no 33FA370702F8 test_head3389030B00E6 "Signal::containsReception"
public boolean containsReception(Reception reception1)
// -end- 33FA370702F8 test_head3389030B00E6 "Signal::containsReception"
;     // empty

/** used to enumerate all connected Receptions.
 *  @see #addReception
 */
// -beg- preserve=no 33FA370702F8 get_all_head3389030B00E6 "Signal::iteratorReception"
public java.util.Iterator iteratorReception()
// -end- 33FA370702F8 get_all_head3389030B00E6 "Signal::iteratorReception"
;     // empty

/** disconnect all Receptions.
 *  @see #addReception
 */
// -beg- preserve=no 33FA370702F8 remove_all_head3389030B00E6 "Signal::clearReception"
public void clearReception()
// -end- 33FA370702F8 remove_all_head3389030B00E6 "Signal::clearReception"
;     // empty

/** returns the number of Receptions.
 *  @see #addReception
 */
// -beg- preserve=no 33FA370702F8 size_head3389030B00E6 "Signal::sizeReception"
public int sizeReception()
// -end- 33FA370702F8 size_head3389030B00E6 "Signal::sizeReception"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FA370702F8 _link_body3389030B00E6 "Signal::_linkReception"
public void _linkReception(Reception reception1);
// -end- 33FA370702F8 _link_body3389030B00E6 "Signal::_linkReception"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FA370702F8 _unlink_body3389030B00E6 "Signal::_unlinkReception"
public void _unlinkReception(Reception reception1);
// -end- 33FA370702F8 _unlink_body3389030B00E6 "Signal::_unlinkReception"

/** add a Context.
 *
 *  @see #removeContext
 *  @see #containsContext
 *  @see #iteratorContext
 *  @see #clearContext
 *  @see #sizeContext
 */
// -beg- preserve=no 33FFD98400B7 add_head3389030B00E6 "Signal::addContext"
public void addContext(BehavioralFeature context1)
// -end- 33FFD98400B7 add_head3389030B00E6 "Signal::addContext"
;     // empty

/** disconnect a Context.
 *  @see #addContext
 */
// -beg- preserve=no 33FFD98400B7 remove_head3389030B00E6 "Signal::removeContext"
public BehavioralFeature removeContext(BehavioralFeature context1)
// -end- 33FFD98400B7 remove_head3389030B00E6 "Signal::removeContext"
;     // empty

/** tests if a given Context is connected.
 *  @see #addContext
 */
// -beg- preserve=no 33FFD98400B7 test_head3389030B00E6 "Signal::containsContext"
public boolean containsContext(BehavioralFeature context1)
// -end- 33FFD98400B7 test_head3389030B00E6 "Signal::containsContext"
;     // empty

/** used to enumerate all connected Contexts.
 *  @see #addContext
 */
// -beg- preserve=no 33FFD98400B7 get_all_head3389030B00E6 "Signal::iteratorContext"
public java.util.Iterator iteratorContext()
// -end- 33FFD98400B7 get_all_head3389030B00E6 "Signal::iteratorContext"
;     // empty

/** disconnect all Contexts.
 *  @see #addContext
 */
// -beg- preserve=no 33FFD98400B7 remove_all_head3389030B00E6 "Signal::clearContext"
public void clearContext()
// -end- 33FFD98400B7 remove_all_head3389030B00E6 "Signal::clearContext"
;     // empty

/** returns the number of Contexts.
 *  @see #addContext
 */
// -beg- preserve=no 33FFD98400B7 size_head3389030B00E6 "Signal::sizeContext"
public int sizeContext()
// -end- 33FFD98400B7 size_head3389030B00E6 "Signal::sizeContext"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FFD98400B7 _link_body3389030B00E6 "Signal::_linkContext"
public void _linkContext(BehavioralFeature context1);
// -end- 33FFD98400B7 _link_body3389030B00E6 "Signal::_linkContext"

/** DONT USE; link management internal
 */
// -beg- preserve=no 33FFD98400B7 _unlink_body3389030B00E6 "Signal::_unlinkContext"
public void _unlinkContext(BehavioralFeature context1);
// -end- 33FFD98400B7 _unlink_body3389030B00E6 "Signal::_unlinkContext"

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3389030B00E6 detail_end "Signal"

// -end- 3389030B00E6 detail_end "Signal"

}
