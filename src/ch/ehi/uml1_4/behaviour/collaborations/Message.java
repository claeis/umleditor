// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:52 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33DBAE5E005A package "Message"
package ch.ehi.uml1_4.behaviour.collaborations;
// -end- 33DBAE5E005A package "Message"

// -beg- preserve=no 33DBAE5E005A autoimport "Message"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.collaborations.Interaction;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.behaviour.collaborations.AssociationRole;
import ch.ehi.uml1_4.behaviour.commonbehavior.Action;
import ch.ehi.uml1_4.behaviour.commonbehavior.Stimulus;
// -end- 33DBAE5E005A autoimport "Message"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33DBAE5E005A import "Message"

// -end- 33DBAE5E005A import "Message"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:52 $
 */
public interface Message extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33DBAE5E005A detail_begin "Message"

  // -end- 33DBAE5E005A detail_begin "Message"

  /** attaches a Interaction.
   *  
   *  @see #detachInteraction
   *  @see #getInteraction
   *  @see #containsInteraction
   */
  // -beg- preserve=no 3388DD5D0032 attach_head33DBAE5E005A "Message::attachInteraction"
  public void attachInteraction(Interaction interaction1)
  // -end- 3388DD5D0032 attach_head33DBAE5E005A "Message::attachInteraction"
    ; // empty

  /** disconnect the currently attached Interaction.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 3388DD5D0032 detach_head33DBAE5E005A "Message::detachInteraction"
  public Interaction detachInteraction()
  // -end- 3388DD5D0032 detach_head33DBAE5E005A "Message::detachInteraction"
    ; // empty

  /** get the currently attached Interaction.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 3388DD5D0032 get_head33DBAE5E005A "Message::getInteraction"
  public Interaction getInteraction()
  // -end- 3388DD5D0032 get_head33DBAE5E005A "Message::getInteraction"
    ; // empty

  /** tests if there is a Interaction attached.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 3388DD5D0032 test_head33DBAE5E005A "Message::containsInteraction"
  public boolean containsInteraction()
  // -end- 3388DD5D0032 test_head33DBAE5E005A "Message::containsInteraction"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3388DD5D0032 _link_body33DBAE5E005A "Message::_linkInteraction"
  public void _linkInteraction(Interaction interaction1);
  // -end- 3388DD5D0032 _link_body33DBAE5E005A "Message::_linkInteraction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3388DD5D0032 _unlink_body33DBAE5E005A "Message::_unlinkInteraction"
  public void _unlinkInteraction(Interaction interaction1);
  // -end- 3388DD5D0032 _unlink_body33DBAE5E005A "Message::_unlinkInteraction"

  /** attaches a Sender.
   *  
   *  @see #detachSender
   *  @see #getSender
   *  @see #containsSender
   */
  // -beg- preserve=no 33DBBB2B03DE attach_head33DBAE5E005A "Message::attachSender"
  public void attachSender(ClassifierRole sender1)
  // -end- 33DBBB2B03DE attach_head33DBAE5E005A "Message::attachSender"
    ; // empty

  /** disconnect the currently attached Sender.
   *  @see #attachSender
   */
  // -beg- preserve=no 33DBBB2B03DE detach_head33DBAE5E005A "Message::detachSender"
  public ClassifierRole detachSender()
  // -end- 33DBBB2B03DE detach_head33DBAE5E005A "Message::detachSender"
    ; // empty

  /** get the currently attached Sender.
   *  @see #attachSender
   */
  // -beg- preserve=no 33DBBB2B03DE get_head33DBAE5E005A "Message::getSender"
  public ClassifierRole getSender()
  // -end- 33DBBB2B03DE get_head33DBAE5E005A "Message::getSender"
    ; // empty

  /** tests if there is a Sender attached.
   *  @see #attachSender
   */
  // -beg- preserve=no 33DBBB2B03DE test_head33DBAE5E005A "Message::containsSender"
  public boolean containsSender()
  // -end- 33DBBB2B03DE test_head33DBAE5E005A "Message::containsSender"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBBB2B03DE _link_body33DBAE5E005A "Message::_linkSender"
  public void _linkSender(ClassifierRole sender1);
  // -end- 33DBBB2B03DE _link_body33DBAE5E005A "Message::_linkSender"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBBB2B03DE _unlink_body33DBAE5E005A "Message::_unlinkSender"
  public void _unlinkSender(ClassifierRole sender1);
  // -end- 33DBBB2B03DE _unlink_body33DBAE5E005A "Message::_unlinkSender"

  /** attaches a Receiver.
   *  
   *  @see #detachReceiver
   *  @see #getReceiver
   *  @see #containsReceiver
   */
  // -beg- preserve=no 33DBBB4B02A8 attach_head33DBAE5E005A "Message::attachReceiver"
  public void attachReceiver(ClassifierRole receiver1)
  // -end- 33DBBB4B02A8 attach_head33DBAE5E005A "Message::attachReceiver"
    ; // empty

  /** disconnect the currently attached Receiver.
   *  @see #attachReceiver
   */
  // -beg- preserve=no 33DBBB4B02A8 detach_head33DBAE5E005A "Message::detachReceiver"
  public ClassifierRole detachReceiver()
  // -end- 33DBBB4B02A8 detach_head33DBAE5E005A "Message::detachReceiver"
    ; // empty

  /** get the currently attached Receiver.
   *  @see #attachReceiver
   */
  // -beg- preserve=no 33DBBB4B02A8 get_head33DBAE5E005A "Message::getReceiver"
  public ClassifierRole getReceiver()
  // -end- 33DBBB4B02A8 get_head33DBAE5E005A "Message::getReceiver"
    ; // empty

  /** tests if there is a Receiver attached.
   *  @see #attachReceiver
   */
  // -beg- preserve=no 33DBBB4B02A8 test_head33DBAE5E005A "Message::containsReceiver"
  public boolean containsReceiver()
  // -end- 33DBBB4B02A8 test_head33DBAE5E005A "Message::containsReceiver"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBBB4B02A8 _link_body33DBAE5E005A "Message::_linkReceiver"
  public void _linkReceiver(ClassifierRole receiver1);
  // -end- 33DBBB4B02A8 _link_body33DBAE5E005A "Message::_linkReceiver"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33DBBB4B02A8 _unlink_body33DBAE5E005A "Message::_unlinkReceiver"
  public void _unlinkReceiver(ClassifierRole receiver1);
  // -end- 33DBBB4B02A8 _unlink_body33DBAE5E005A "Message::_unlinkReceiver"

  /** attaches a CommunicationConnection.
   *  
   *  @see #detachCommunicationConnection
   *  @see #getCommunicationConnection
   *  @see #containsCommunicationConnection
   */
  // -beg- preserve=no 35FEAB5F01C2 attach_head33DBAE5E005A "Message::attachCommunicationConnection"
  public void attachCommunicationConnection(AssociationRole communicationConnection1)
  // -end- 35FEAB5F01C2 attach_head33DBAE5E005A "Message::attachCommunicationConnection"
    ; // empty

  /** disconnect the currently attached CommunicationConnection.
   *  @see #attachCommunicationConnection
   */
  // -beg- preserve=no 35FEAB5F01C2 detach_head33DBAE5E005A "Message::detachCommunicationConnection"
  public AssociationRole detachCommunicationConnection()
  // -end- 35FEAB5F01C2 detach_head33DBAE5E005A "Message::detachCommunicationConnection"
    ; // empty

  /** get the currently attached CommunicationConnection.
   *  @see #attachCommunicationConnection
   */
  // -beg- preserve=no 35FEAB5F01C2 get_head33DBAE5E005A "Message::getCommunicationConnection"
  public AssociationRole getCommunicationConnection()
  // -end- 35FEAB5F01C2 get_head33DBAE5E005A "Message::getCommunicationConnection"
    ; // empty

  /** tests if there is a CommunicationConnection attached.
   *  @see #attachCommunicationConnection
   */
  // -beg- preserve=no 35FEAB5F01C2 test_head33DBAE5E005A "Message::containsCommunicationConnection"
  public boolean containsCommunicationConnection()
  // -end- 35FEAB5F01C2 test_head33DBAE5E005A "Message::containsCommunicationConnection"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FEAB5F01C2 _link_body33DBAE5E005A "Message::_linkCommunicationConnection"
  public void _linkCommunicationConnection(AssociationRole communicationConnection1);
  // -end- 35FEAB5F01C2 _link_body33DBAE5E005A "Message::_linkCommunicationConnection"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FEAB5F01C2 _unlink_body33DBAE5E005A "Message::_unlinkCommunicationConnection"
  public void _unlinkCommunicationConnection(AssociationRole communicationConnection1);
  // -end- 35FEAB5F01C2 _unlink_body33DBAE5E005A "Message::_unlinkCommunicationConnection"

  /** attaches a Action.
   *  
   *  @see #detachAction
   *  @see #getAction
   *  @see #containsAction
   */
  // -beg- preserve=no 36265CF90051 attach_head33DBAE5E005A "Message::attachAction"
  public void attachAction(Action action1)
  // -end- 36265CF90051 attach_head33DBAE5E005A "Message::attachAction"
    ; // empty

  /** disconnect the currently attached Action.
   *  @see #attachAction
   */
  // -beg- preserve=no 36265CF90051 detach_head33DBAE5E005A "Message::detachAction"
  public Action detachAction()
  // -end- 36265CF90051 detach_head33DBAE5E005A "Message::detachAction"
    ; // empty

  /** get the currently attached Action.
   *  @see #attachAction
   */
  // -beg- preserve=no 36265CF90051 get_head33DBAE5E005A "Message::getAction"
  public Action getAction()
  // -end- 36265CF90051 get_head33DBAE5E005A "Message::getAction"
    ; // empty

  /** tests if there is a Action attached.
   *  @see #attachAction
   */
  // -beg- preserve=no 36265CF90051 test_head33DBAE5E005A "Message::containsAction"
  public boolean containsAction()
  // -end- 36265CF90051 test_head33DBAE5E005A "Message::containsAction"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36265CF90051 _link_body33DBAE5E005A "Message::_linkAction"
  public void _linkAction(Action action1);
  // -end- 36265CF90051 _link_body33DBAE5E005A "Message::_linkAction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36265CF90051 _unlink_body33DBAE5E005A "Message::_unlinkAction"
  public void _unlinkAction(Action action1);
  // -end- 36265CF90051 _unlink_body33DBAE5E005A "Message::_unlinkAction"

  /** add a ConformingStimulus.
   *  
   *  @see #removeConformingStimulus
   *  @see #containsConformingStimulus
   *  @see #iteratorConformingStimulus
   *  @see #clearConformingStimulus
   *  @see #sizeConformingStimulus
   */
  // -beg- preserve=no 39E8FF690196 add_head33DBAE5E005A "Message::addConformingStimulus"
  public void addConformingStimulus(Stimulus conformingStimulus1)
  // -end- 39E8FF690196 add_head33DBAE5E005A "Message::addConformingStimulus"
    ; // empty

  /** disconnect a ConformingStimulus.
   *  @see #addConformingStimulus
   */
  // -beg- preserve=no 39E8FF690196 remove_head33DBAE5E005A "Message::removeConformingStimulus"
  public Stimulus removeConformingStimulus(Stimulus conformingStimulus1)
  // -end- 39E8FF690196 remove_head33DBAE5E005A "Message::removeConformingStimulus"
    ; // empty

  /** tests if a given ConformingStimulus is connected.
   *  @see #addConformingStimulus
   */
  // -beg- preserve=no 39E8FF690196 test_head33DBAE5E005A "Message::containsConformingStimulus"
  public boolean containsConformingStimulus(Stimulus conformingStimulus1)
  // -end- 39E8FF690196 test_head33DBAE5E005A "Message::containsConformingStimulus"
    ; // empty

  /** used to enumerate all connected ConformingStimuluss.
   *  @see #addConformingStimulus
   */
  // -beg- preserve=no 39E8FF690196 get_all_head33DBAE5E005A "Message::iteratorConformingStimulus"
  public java.util.Iterator iteratorConformingStimulus()
  // -end- 39E8FF690196 get_all_head33DBAE5E005A "Message::iteratorConformingStimulus"
    ; // empty

  /** disconnect all ConformingStimuluss.
   *  @see #addConformingStimulus
   */
  // -beg- preserve=no 39E8FF690196 remove_all_head33DBAE5E005A "Message::clearConformingStimulus"
  public void clearConformingStimulus()
  // -end- 39E8FF690196 remove_all_head33DBAE5E005A "Message::clearConformingStimulus"
    ; // empty

  /** returns the number of ConformingStimuluss.
   *  @see #addConformingStimulus
   */
  // -beg- preserve=no 39E8FF690196 size_head33DBAE5E005A "Message::sizeConformingStimulus"
  public int sizeConformingStimulus()
  // -end- 39E8FF690196 size_head33DBAE5E005A "Message::sizeConformingStimulus"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF690196 _link_body33DBAE5E005A "Message::_linkConformingStimulus"
  public void _linkConformingStimulus(Stimulus conformingStimulus1);
  // -end- 39E8FF690196 _link_body33DBAE5E005A "Message::_linkConformingStimulus"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF690196 _unlink_body33DBAE5E005A "Message::_unlinkConformingStimulus"
  public void _unlinkConformingStimulus(Stimulus conformingStimulus1);
  // -end- 39E8FF690196 _unlink_body33DBAE5E005A "Message::_unlinkConformingStimulus"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33DBAE5E005A detail_end "Message"

  // -end- 33DBAE5E005A detail_end "Message"

}

