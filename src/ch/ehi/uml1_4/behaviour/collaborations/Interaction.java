// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:51 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 328830A500E6 package "Interaction"
package ch.ehi.uml1_4.behaviour.collaborations;
// -end- 328830A500E6 package "Interaction"

// -beg- preserve=no 328830A500E6 autoimport "Interaction"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.commonbehavior.Link;
import ch.ehi.uml1_4.behaviour.commonbehavior.Instance;
import ch.ehi.uml1_4.behaviour.collaborations.Message;
import ch.ehi.uml1_4.behaviour.collaborations.Collaboration;
import ch.ehi.uml1_4.behaviour.collaborations.InteractionInstanceSet;
// -end- 328830A500E6 autoimport "Interaction"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 328830A500E6 import "Interaction"

// -end- 328830A500E6 import "Interaction"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:51 $
 */
public interface Interaction extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 328830A500E6 detail_begin "Interaction"

  // -end- 328830A500E6 detail_begin "Interaction"

  /** add a Link.
   *  
   *  @see #removeLink
   *  @see #containsLink
   *  @see #iteratorLink
   *  @see #clearLink
   *  @see #sizeLink
   */
  // -beg- preserve=no 328A58B402F8 add_head328830A500E6 "Interaction::addLink"
  public void addLink(Link link1)
  // -end- 328A58B402F8 add_head328830A500E6 "Interaction::addLink"
    ; // empty

  /** disconnect a Link.
   *  @see #addLink
   */
  // -beg- preserve=no 328A58B402F8 remove_head328830A500E6 "Interaction::removeLink"
  public Link removeLink(Link link1)
  // -end- 328A58B402F8 remove_head328830A500E6 "Interaction::removeLink"
    ; // empty

  /** tests if a given Link is connected.
   *  @see #addLink
   */
  // -beg- preserve=no 328A58B402F8 test_head328830A500E6 "Interaction::containsLink"
  public boolean containsLink(Link link1)
  // -end- 328A58B402F8 test_head328830A500E6 "Interaction::containsLink"
    ; // empty

  /** used to enumerate all connected Links.
   *  @see #addLink
   */
  // -beg- preserve=no 328A58B402F8 get_all_head328830A500E6 "Interaction::iteratorLink"
  public java.util.Iterator iteratorLink()
  // -end- 328A58B402F8 get_all_head328830A500E6 "Interaction::iteratorLink"
    ; // empty

  /** disconnect all Links.
   *  @see #addLink
   */
  // -beg- preserve=no 328A58B402F8 remove_all_head328830A500E6 "Interaction::clearLink"
  public void clearLink()
  // -end- 328A58B402F8 remove_all_head328830A500E6 "Interaction::clearLink"
    ; // empty

  /** returns the number of Links.
   *  @see #addLink
   */
  // -beg- preserve=no 328A58B402F8 size_head328830A500E6 "Interaction::sizeLink"
  public int sizeLink()
  // -end- 328A58B402F8 size_head328830A500E6 "Interaction::sizeLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A58B402F8 _link_body328830A500E6 "Interaction::_linkLink"
  public void _linkLink(Link link1);
  // -end- 328A58B402F8 _link_body328830A500E6 "Interaction::_linkLink"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A58B402F8 _unlink_body328830A500E6 "Interaction::_unlinkLink"
  public void _unlinkLink(Link link1);
  // -end- 328A58B402F8 _unlink_body328830A500E6 "Interaction::_unlinkLink"

  /** add a Instance.
   *  
   *  @see #removeInstance
   *  @see #containsInstance
   *  @see #iteratorInstance
   *  @see #clearInstance
   *  @see #sizeInstance
   */
  // -beg- preserve=no 328A5B570050 add_head328830A500E6 "Interaction::addInstance"
  public void addInstance(Instance instance1)
  // -end- 328A5B570050 add_head328830A500E6 "Interaction::addInstance"
    ; // empty

  /** disconnect a Instance.
   *  @see #addInstance
   */
  // -beg- preserve=no 328A5B570050 remove_head328830A500E6 "Interaction::removeInstance"
  public Instance removeInstance(Instance instance1)
  // -end- 328A5B570050 remove_head328830A500E6 "Interaction::removeInstance"
    ; // empty

  /** tests if a given Instance is connected.
   *  @see #addInstance
   */
  // -beg- preserve=no 328A5B570050 test_head328830A500E6 "Interaction::containsInstance"
  public boolean containsInstance(Instance instance1)
  // -end- 328A5B570050 test_head328830A500E6 "Interaction::containsInstance"
    ; // empty

  /** used to enumerate all connected Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 328A5B570050 get_all_head328830A500E6 "Interaction::iteratorInstance"
  public java.util.Iterator iteratorInstance()
  // -end- 328A5B570050 get_all_head328830A500E6 "Interaction::iteratorInstance"
    ; // empty

  /** disconnect all Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 328A5B570050 remove_all_head328830A500E6 "Interaction::clearInstance"
  public void clearInstance()
  // -end- 328A5B570050 remove_all_head328830A500E6 "Interaction::clearInstance"
    ; // empty

  /** returns the number of Instances.
   *  @see #addInstance
   */
  // -beg- preserve=no 328A5B570050 size_head328830A500E6 "Interaction::sizeInstance"
  public int sizeInstance()
  // -end- 328A5B570050 size_head328830A500E6 "Interaction::sizeInstance"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5B570050 _link_body328830A500E6 "Interaction::_linkInstance"
  public void _linkInstance(Instance instance1);
  // -end- 328A5B570050 _link_body328830A500E6 "Interaction::_linkInstance"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 328A5B570050 _unlink_body328830A500E6 "Interaction::_unlinkInstance"
  public void _unlinkInstance(Instance instance1);
  // -end- 328A5B570050 _unlink_body328830A500E6 "Interaction::_unlinkInstance"

  /** add a Message.
   *  
   *  @see #removeMessage
   *  @see #containsMessage
   *  @see #iteratorMessage
   *  @see #clearMessage
   *  @see #sizeMessage
   */
  // -beg- preserve=no 3388DD5D0000 add_head328830A500E6 "Interaction::addMessage"
  public void addMessage(Message message1)
  // -end- 3388DD5D0000 add_head328830A500E6 "Interaction::addMessage"
    ; // empty

  /** disconnect a Message.
   *  @see #addMessage
   */
  // -beg- preserve=no 3388DD5D0000 remove_head328830A500E6 "Interaction::removeMessage"
  public Message removeMessage(Message message1)
  // -end- 3388DD5D0000 remove_head328830A500E6 "Interaction::removeMessage"
    ; // empty

  /** tests if a given Message is connected.
   *  @see #addMessage
   */
  // -beg- preserve=no 3388DD5D0000 test_head328830A500E6 "Interaction::containsMessage"
  public boolean containsMessage(Message message1)
  // -end- 3388DD5D0000 test_head328830A500E6 "Interaction::containsMessage"
    ; // empty

  /** used to enumerate all connected Messages.
   *  @see #addMessage
   */
  // -beg- preserve=no 3388DD5D0000 get_all_head328830A500E6 "Interaction::iteratorMessage"
  public java.util.Iterator iteratorMessage()
  // -end- 3388DD5D0000 get_all_head328830A500E6 "Interaction::iteratorMessage"
    ; // empty

  /** disconnect all Messages.
   *  @see #addMessage
   */
  // -beg- preserve=no 3388DD5D0000 remove_all_head328830A500E6 "Interaction::clearMessage"
  public void clearMessage()
  // -end- 3388DD5D0000 remove_all_head328830A500E6 "Interaction::clearMessage"
    ; // empty

  /** returns the number of Messages.
   *  @see #addMessage
   */
  // -beg- preserve=no 3388DD5D0000 size_head328830A500E6 "Interaction::sizeMessage"
  public int sizeMessage()
  // -end- 3388DD5D0000 size_head328830A500E6 "Interaction::sizeMessage"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3388DD5D0000 _link_body328830A500E6 "Interaction::_linkMessage"
  public void _linkMessage(Message message1);
  // -end- 3388DD5D0000 _link_body328830A500E6 "Interaction::_linkMessage"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3388DD5D0000 _unlink_body328830A500E6 "Interaction::_unlinkMessage"
  public void _unlinkMessage(Message message1);
  // -end- 3388DD5D0000 _unlink_body328830A500E6 "Interaction::_unlinkMessage"

  /** attaches a Context.
   *  
   *  @see #detachContext
   *  @see #getContext
   *  @see #containsContext
   */
  // -beg- preserve=no 3388DE790123 attach_head328830A500E6 "Interaction::attachContext"
  public void attachContext(Collaboration context1)
  // -end- 3388DE790123 attach_head328830A500E6 "Interaction::attachContext"
    ; // empty

  /** disconnect the currently attached Context.
   *  @see #attachContext
   */
  // -beg- preserve=no 3388DE790123 detach_head328830A500E6 "Interaction::detachContext"
  public Collaboration detachContext()
  // -end- 3388DE790123 detach_head328830A500E6 "Interaction::detachContext"
    ; // empty

  /** get the currently attached Context.
   *  @see #attachContext
   */
  // -beg- preserve=no 3388DE790123 get_head328830A500E6 "Interaction::getContext"
  public Collaboration getContext()
  // -end- 3388DE790123 get_head328830A500E6 "Interaction::getContext"
    ; // empty

  /** tests if there is a Context attached.
   *  @see #attachContext
   */
  // -beg- preserve=no 3388DE790123 test_head328830A500E6 "Interaction::containsContext"
  public boolean containsContext()
  // -end- 3388DE790123 test_head328830A500E6 "Interaction::containsContext"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3388DE790123 _link_body328830A500E6 "Interaction::_linkContext"
  public void _linkContext(Collaboration context1);
  // -end- 3388DE790123 _link_body328830A500E6 "Interaction::_linkContext"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3388DE790123 _unlink_body328830A500E6 "Interaction::_unlinkContext"
  public void _unlinkContext(Collaboration context1);
  // -end- 3388DE790123 _unlink_body328830A500E6 "Interaction::_unlinkContext"

  /** add a InteractionInstanceSet.
   *  
   *  @see #removeInteractionInstanceSet
   *  @see #containsInteractionInstanceSet
   *  @see #iteratorInteractionInstanceSet
   *  @see #clearInteractionInstanceSet
   *  @see #sizeInteractionInstanceSet
   */
  // -beg- preserve=no 39E8FF7600DA add_head328830A500E6 "Interaction::addInteractionInstanceSet"
  public void addInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1)
  // -end- 39E8FF7600DA add_head328830A500E6 "Interaction::addInteractionInstanceSet"
    ; // empty

  /** disconnect a InteractionInstanceSet.
   *  @see #addInteractionInstanceSet
   */
  // -beg- preserve=no 39E8FF7600DA remove_head328830A500E6 "Interaction::removeInteractionInstanceSet"
  public InteractionInstanceSet removeInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1)
  // -end- 39E8FF7600DA remove_head328830A500E6 "Interaction::removeInteractionInstanceSet"
    ; // empty

  /** tests if a given InteractionInstanceSet is connected.
   *  @see #addInteractionInstanceSet
   */
  // -beg- preserve=no 39E8FF7600DA test_head328830A500E6 "Interaction::containsInteractionInstanceSet"
  public boolean containsInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1)
  // -end- 39E8FF7600DA test_head328830A500E6 "Interaction::containsInteractionInstanceSet"
    ; // empty

  /** used to enumerate all connected InteractionInstanceSets.
   *  @see #addInteractionInstanceSet
   */
  // -beg- preserve=no 39E8FF7600DA get_all_head328830A500E6 "Interaction::iteratorInteractionInstanceSet"
  public java.util.Iterator iteratorInteractionInstanceSet()
  // -end- 39E8FF7600DA get_all_head328830A500E6 "Interaction::iteratorInteractionInstanceSet"
    ; // empty

  /** disconnect all InteractionInstanceSets.
   *  @see #addInteractionInstanceSet
   */
  // -beg- preserve=no 39E8FF7600DA remove_all_head328830A500E6 "Interaction::clearInteractionInstanceSet"
  public void clearInteractionInstanceSet()
  // -end- 39E8FF7600DA remove_all_head328830A500E6 "Interaction::clearInteractionInstanceSet"
    ; // empty

  /** returns the number of InteractionInstanceSets.
   *  @see #addInteractionInstanceSet
   */
  // -beg- preserve=no 39E8FF7600DA size_head328830A500E6 "Interaction::sizeInteractionInstanceSet"
  public int sizeInteractionInstanceSet()
  // -end- 39E8FF7600DA size_head328830A500E6 "Interaction::sizeInteractionInstanceSet"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF7600DA _link_body328830A500E6 "Interaction::_linkInteractionInstanceSet"
  public void _linkInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1);
  // -end- 39E8FF7600DA _link_body328830A500E6 "Interaction::_linkInteractionInstanceSet"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF7600DA _unlink_body328830A500E6 "Interaction::_unlinkInteractionInstanceSet"
  public void _unlinkInteractionInstanceSet(InteractionInstanceSet interactionInstanceSet1);
  // -end- 39E8FF7600DA _unlink_body328830A500E6 "Interaction::_unlinkInteractionInstanceSet"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 328830A500E6 detail_end "Interaction"

  // -end- 328830A500E6 detail_end "Interaction"

}

