// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:51 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 39E8FB5A005D package "InteractionInstanceSet"
package ch.ehi.uml1_4.behaviour.collaborations;
// -end- 39E8FB5A005D package "InteractionInstanceSet"

// -beg- preserve=no 39E8FB5A005D autoimport "InteractionInstanceSet"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.collaborations.CollaborationInstanceSet;
import ch.ehi.uml1_4.behaviour.commonbehavior.Stimulus;
import ch.ehi.uml1_4.behaviour.collaborations.Interaction;
// -end- 39E8FB5A005D autoimport "InteractionInstanceSet"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39E8FB5A005D import "InteractionInstanceSet"

// -end- 39E8FB5A005D import "InteractionInstanceSet"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:51 $
 */
public interface InteractionInstanceSet extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 39E8FB5A005D detail_begin "InteractionInstanceSet"

  // -end- 39E8FB5A005D detail_begin "InteractionInstanceSet"

  /** attaches a Context.
   *  
   *  @see #detachContext
   *  @see #getContext
   *  @see #containsContext
   */
  // -beg- preserve=no 39E8FB9602FE attach_head39E8FB5A005D "InteractionInstanceSet::attachContext"
  public void attachContext(CollaborationInstanceSet context1)
  // -end- 39E8FB9602FE attach_head39E8FB5A005D "InteractionInstanceSet::attachContext"
    ; // empty

  /** disconnect the currently attached Context.
   *  @see #attachContext
   */
  // -beg- preserve=no 39E8FB9602FE detach_head39E8FB5A005D "InteractionInstanceSet::detachContext"
  public CollaborationInstanceSet detachContext()
  // -end- 39E8FB9602FE detach_head39E8FB5A005D "InteractionInstanceSet::detachContext"
    ; // empty

  /** get the currently attached Context.
   *  @see #attachContext
   */
  // -beg- preserve=no 39E8FB9602FE get_head39E8FB5A005D "InteractionInstanceSet::getContext"
  public CollaborationInstanceSet getContext()
  // -end- 39E8FB9602FE get_head39E8FB5A005D "InteractionInstanceSet::getContext"
    ; // empty

  /** tests if there is a Context attached.
   *  @see #attachContext
   */
  // -beg- preserve=no 39E8FB9602FE test_head39E8FB5A005D "InteractionInstanceSet::containsContext"
  public boolean containsContext()
  // -end- 39E8FB9602FE test_head39E8FB5A005D "InteractionInstanceSet::containsContext"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FB9602FE _link_body39E8FB5A005D "InteractionInstanceSet::_linkContext"
  public void _linkContext(CollaborationInstanceSet context1);
  // -end- 39E8FB9602FE _link_body39E8FB5A005D "InteractionInstanceSet::_linkContext"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FB9602FE _unlink_body39E8FB5A005D "InteractionInstanceSet::_unlinkContext"
  public void _unlinkContext(CollaborationInstanceSet context1);
  // -end- 39E8FB9602FE _unlink_body39E8FB5A005D "InteractionInstanceSet::_unlinkContext"

  /** add a ParticipatingStimulus.
   *  
   *  @see #removeParticipatingStimulus
   *  @see #containsParticipatingStimulus
   *  @see #iteratorParticipatingStimulus
   *  @see #clearParticipatingStimulus
   *  @see #sizeParticipatingStimulus
   */
  // -beg- preserve=no 39E8FCBA03D8 add_head39E8FB5A005D "InteractionInstanceSet::addParticipatingStimulus"
  public void addParticipatingStimulus(Stimulus participatingStimulus1)
  // -end- 39E8FCBA03D8 add_head39E8FB5A005D "InteractionInstanceSet::addParticipatingStimulus"
    ; // empty

  /** disconnect a ParticipatingStimulus.
   *  @see #addParticipatingStimulus
   */
  // -beg- preserve=no 39E8FCBA03D8 remove_head39E8FB5A005D "InteractionInstanceSet::removeParticipatingStimulus"
  public Stimulus removeParticipatingStimulus(Stimulus participatingStimulus1)
  // -end- 39E8FCBA03D8 remove_head39E8FB5A005D "InteractionInstanceSet::removeParticipatingStimulus"
    ; // empty

  /** tests if a given ParticipatingStimulus is connected.
   *  @see #addParticipatingStimulus
   */
  // -beg- preserve=no 39E8FCBA03D8 test_head39E8FB5A005D "InteractionInstanceSet::containsParticipatingStimulus"
  public boolean containsParticipatingStimulus(Stimulus participatingStimulus1)
  // -end- 39E8FCBA03D8 test_head39E8FB5A005D "InteractionInstanceSet::containsParticipatingStimulus"
    ; // empty

  /** used to enumerate all connected ParticipatingStimuluss.
   *  @see #addParticipatingStimulus
   */
  // -beg- preserve=no 39E8FCBA03D8 get_all_head39E8FB5A005D "InteractionInstanceSet::iteratorParticipatingStimulus"
  public java.util.Iterator iteratorParticipatingStimulus()
  // -end- 39E8FCBA03D8 get_all_head39E8FB5A005D "InteractionInstanceSet::iteratorParticipatingStimulus"
    ; // empty

  /** disconnect all ParticipatingStimuluss.
   *  @see #addParticipatingStimulus
   */
  // -beg- preserve=no 39E8FCBA03D8 remove_all_head39E8FB5A005D "InteractionInstanceSet::clearParticipatingStimulus"
  public void clearParticipatingStimulus()
  // -end- 39E8FCBA03D8 remove_all_head39E8FB5A005D "InteractionInstanceSet::clearParticipatingStimulus"
    ; // empty

  /** returns the number of ParticipatingStimuluss.
   *  @see #addParticipatingStimulus
   */
  // -beg- preserve=no 39E8FCBA03D8 size_head39E8FB5A005D "InteractionInstanceSet::sizeParticipatingStimulus"
  public int sizeParticipatingStimulus()
  // -end- 39E8FCBA03D8 size_head39E8FB5A005D "InteractionInstanceSet::sizeParticipatingStimulus"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FCBA03D8 _link_body39E8FB5A005D "InteractionInstanceSet::_linkParticipatingStimulus"
  public void _linkParticipatingStimulus(Stimulus participatingStimulus1);
  // -end- 39E8FCBA03D8 _link_body39E8FB5A005D "InteractionInstanceSet::_linkParticipatingStimulus"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FCBA03D8 _unlink_body39E8FB5A005D "InteractionInstanceSet::_unlinkParticipatingStimulus"
  public void _unlinkParticipatingStimulus(Stimulus participatingStimulus1);
  // -end- 39E8FCBA03D8 _unlink_body39E8FB5A005D "InteractionInstanceSet::_unlinkParticipatingStimulus"

  /** attaches a Interaction.
   *  
   *  @see #detachInteraction
   *  @see #getInteraction
   *  @see #containsInteraction
   */
  // -beg- preserve=no 39E8FF7600DB attach_head39E8FB5A005D "InteractionInstanceSet::attachInteraction"
  public void attachInteraction(Interaction interaction1)
  // -end- 39E8FF7600DB attach_head39E8FB5A005D "InteractionInstanceSet::attachInteraction"
    ; // empty

  /** disconnect the currently attached Interaction.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 39E8FF7600DB detach_head39E8FB5A005D "InteractionInstanceSet::detachInteraction"
  public Interaction detachInteraction()
  // -end- 39E8FF7600DB detach_head39E8FB5A005D "InteractionInstanceSet::detachInteraction"
    ; // empty

  /** get the currently attached Interaction.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 39E8FF7600DB get_head39E8FB5A005D "InteractionInstanceSet::getInteraction"
  public Interaction getInteraction()
  // -end- 39E8FF7600DB get_head39E8FB5A005D "InteractionInstanceSet::getInteraction"
    ; // empty

  /** tests if there is a Interaction attached.
   *  @see #attachInteraction
   */
  // -beg- preserve=no 39E8FF7600DB test_head39E8FB5A005D "InteractionInstanceSet::containsInteraction"
  public boolean containsInteraction()
  // -end- 39E8FF7600DB test_head39E8FB5A005D "InteractionInstanceSet::containsInteraction"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF7600DB _link_body39E8FB5A005D "InteractionInstanceSet::_linkInteraction"
  public void _linkInteraction(Interaction interaction1);
  // -end- 39E8FF7600DB _link_body39E8FB5A005D "InteractionInstanceSet::_linkInteraction"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 39E8FF7600DB _unlink_body39E8FB5A005D "InteractionInstanceSet::_unlinkInteraction"
  public void _unlinkInteraction(Interaction interaction1);
  // -end- 39E8FF7600DB _unlink_body39E8FB5A005D "InteractionInstanceSet::_unlinkInteraction"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 39E8FB5A005D detail_end "InteractionInstanceSet"

  // -end- 39E8FB5A005D detail_end "InteractionInstanceSet"

}

