// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:07 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3288E51203DE package "Event"
package ch.ehi.uml1_4.behaviour.statemachines;
// -end- 3288E51203DE package "Event"

// -beg- preserve=no 3288E51203DE autoimport "Event"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Parameter;
import ch.ehi.uml1_4.behaviour.statemachines.State;
import ch.ehi.uml1_4.behaviour.statemachines.Transition;
// -end- 3288E51203DE autoimport "Event"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3288E51203DE import "Event"

// -end- 3288E51203DE import "Event"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:07 $
 */
public interface Event extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3288E51203DE detail_begin "Event"

  // -end- 3288E51203DE detail_begin "Event"

  /** add a Parameter.
   *  
   *  @see #removeParameter
   *  @see #containsParameter
   *  @see #iteratorParameter
   *  @see #clearParameter
   *  @see #sizeParameter
   */
  // -beg- preserve=no 3337AF9D028A add_head3288E51203DE "Event::addParameter"
  public void addParameter(Parameter parameter1)
  // -end- 3337AF9D028A add_head3288E51203DE "Event::addParameter"
    ; // empty

  // -beg- preserve=no 3337AF9D028A add2_head3288E51203DE "Event::add2Parameter"
  public void addParameter(int index,Parameter parameter1)
  // -end- 3337AF9D028A add2_head3288E51203DE "Event::add2Parameter"
    ; // empty

  /** disconnect a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 3337AF9D028A remove_head3288E51203DE "Event::removeParameter"
  public Parameter removeParameter(Parameter parameter1)
  // -end- 3337AF9D028A remove_head3288E51203DE "Event::removeParameter"
    ; // empty

  /** disconnect a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 3337AF9D028A remove2_head3288E51203DE "Event::remove2Parameter"
  public Parameter removeParameter(int index)
  // -end- 3337AF9D028A remove2_head3288E51203DE "Event::remove2Parameter"
    ; // empty

  /** change a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 3337AF9D028A set_head3288E51203DE "Event::setParameter"
  public Parameter setParameter(int index,Parameter parameter1)
  // -end- 3337AF9D028A set_head3288E51203DE "Event::setParameter"
    ; // empty

  /** tests if a given Parameter is connected.
   *  @see #addParameter
   */
  // -beg- preserve=no 3337AF9D028A test_head3288E51203DE "Event::containsParameter"
  public boolean containsParameter(Parameter parameter1)
  // -end- 3337AF9D028A test_head3288E51203DE "Event::containsParameter"
    ; // empty

  /** used to enumerate all connected Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 3337AF9D028A get_all_head3288E51203DE "Event::iteratorParameter"
  public java.util.Iterator iteratorParameter()
  // -end- 3337AF9D028A get_all_head3288E51203DE "Event::iteratorParameter"
    ; // empty

  /** disconnect all Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 3337AF9D028A remove_all_head3288E51203DE "Event::clearParameter"
  public void clearParameter()
  // -end- 3337AF9D028A remove_all_head3288E51203DE "Event::clearParameter"
    ; // empty

  /** returns the number of Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 3337AF9D028A size_head3288E51203DE "Event::sizeParameter"
  public int sizeParameter()
  // -end- 3337AF9D028A size_head3288E51203DE "Event::sizeParameter"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3337AF9D028A _link_body3288E51203DE "Event::_linkParameter"
  public void _linkParameter(Parameter parameter1);
  // -end- 3337AF9D028A _link_body3288E51203DE "Event::_linkParameter"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3337AF9D028A _unlink_body3288E51203DE "Event::_unlinkParameter"
  public void _unlinkParameter(Parameter parameter1);
  // -end- 3337AF9D028A _unlink_body3288E51203DE "Event::_unlinkParameter"

  /** add a State.
   *  
   *  @see #removeState
   *  @see #containsState
   *  @see #iteratorState
   *  @see #clearState
   *  @see #sizeState
   */
  // -beg- preserve=no 33FA3AC2001E add_head3288E51203DE "Event::addState"
  public void addState(State state1)
  // -end- 33FA3AC2001E add_head3288E51203DE "Event::addState"
    ; // empty

  /** disconnect a State.
   *  @see #addState
   */
  // -beg- preserve=no 33FA3AC2001E remove_head3288E51203DE "Event::removeState"
  public State removeState(State state1)
  // -end- 33FA3AC2001E remove_head3288E51203DE "Event::removeState"
    ; // empty

  /** tests if a given State is connected.
   *  @see #addState
   */
  // -beg- preserve=no 33FA3AC2001E test_head3288E51203DE "Event::containsState"
  public boolean containsState(State state1)
  // -end- 33FA3AC2001E test_head3288E51203DE "Event::containsState"
    ; // empty

  /** used to enumerate all connected States.
   *  @see #addState
   */
  // -beg- preserve=no 33FA3AC2001E get_all_head3288E51203DE "Event::iteratorState"
  public java.util.Iterator iteratorState()
  // -end- 33FA3AC2001E get_all_head3288E51203DE "Event::iteratorState"
    ; // empty

  /** disconnect all States.
   *  @see #addState
   */
  // -beg- preserve=no 33FA3AC2001E remove_all_head3288E51203DE "Event::clearState"
  public void clearState()
  // -end- 33FA3AC2001E remove_all_head3288E51203DE "Event::clearState"
    ; // empty

  /** returns the number of States.
   *  @see #addState
   */
  // -beg- preserve=no 33FA3AC2001E size_head3288E51203DE "Event::sizeState"
  public int sizeState()
  // -end- 33FA3AC2001E size_head3288E51203DE "Event::sizeState"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FA3AC2001E _link_body3288E51203DE "Event::_linkState"
  public void _linkState(State state1);
  // -end- 33FA3AC2001E _link_body3288E51203DE "Event::_linkState"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33FA3AC2001E _unlink_body3288E51203DE "Event::_unlinkState"
  public void _unlinkState(State state1);
  // -end- 33FA3AC2001E _unlink_body3288E51203DE "Event::_unlinkState"

  /** add a Transition.
   *  
   *  @see #removeTransition
   *  @see #containsTransition
   *  @see #iteratorTransition
   *  @see #clearTransition
   *  @see #sizeTransition
   */
  // -beg- preserve=no 3288E53A0172 add_head3288E51203DE "Event::addTransition"
  public void addTransition(Transition transition1)
  // -end- 3288E53A0172 add_head3288E51203DE "Event::addTransition"
    ; // empty

  /** disconnect a Transition.
   *  @see #addTransition
   */
  // -beg- preserve=no 3288E53A0172 remove_head3288E51203DE "Event::removeTransition"
  public Transition removeTransition(Transition transition1)
  // -end- 3288E53A0172 remove_head3288E51203DE "Event::removeTransition"
    ; // empty

  /** tests if a given Transition is connected.
   *  @see #addTransition
   */
  // -beg- preserve=no 3288E53A0172 test_head3288E51203DE "Event::containsTransition"
  public boolean containsTransition(Transition transition1)
  // -end- 3288E53A0172 test_head3288E51203DE "Event::containsTransition"
    ; // empty

  /** used to enumerate all connected Transitions.
   *  @see #addTransition
   */
  // -beg- preserve=no 3288E53A0172 get_all_head3288E51203DE "Event::iteratorTransition"
  public java.util.Iterator iteratorTransition()
  // -end- 3288E53A0172 get_all_head3288E51203DE "Event::iteratorTransition"
    ; // empty

  /** disconnect all Transitions.
   *  @see #addTransition
   */
  // -beg- preserve=no 3288E53A0172 remove_all_head3288E51203DE "Event::clearTransition"
  public void clearTransition()
  // -end- 3288E53A0172 remove_all_head3288E51203DE "Event::clearTransition"
    ; // empty

  /** returns the number of Transitions.
   *  @see #addTransition
   */
  // -beg- preserve=no 3288E53A0172 size_head3288E51203DE "Event::sizeTransition"
  public int sizeTransition()
  // -end- 3288E53A0172 size_head3288E51203DE "Event::sizeTransition"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3288E53A0172 _link_body3288E51203DE "Event::_linkTransition"
  public void _linkTransition(Transition transition1);
  // -end- 3288E53A0172 _link_body3288E51203DE "Event::_linkTransition"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3288E53A0172 _unlink_body3288E51203DE "Event::_unlinkTransition"
  public void _unlinkTransition(Transition transition1);
  // -end- 3288E53A0172 _unlink_body3288E51203DE "Event::_unlinkTransition"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3288E51203DE detail_end "Event"

  // -end- 3288E51203DE detail_end "Event"

}

