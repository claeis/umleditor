// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:42 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 337D8F5A01EA package "ObjectFlowState"
package ch.ehi.uml1_4.behaviour.activitygraphs;
// -end- 337D8F5A01EA package "ObjectFlowState"

// -beg- preserve=no 337D8F5A01EA autoimport "ObjectFlowState"
import ch.ehi.uml1_4.behaviour.statemachines.SimpleState;
import ch.ehi.uml1_4.foundation.core.Parameter;
import ch.ehi.uml1_4.foundation.core.Classifier;
// -end- 337D8F5A01EA autoimport "ObjectFlowState"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 337D8F5A01EA import "ObjectFlowState"

// -end- 337D8F5A01EA import "ObjectFlowState"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:42 $
 */
public interface ObjectFlowState extends SimpleState , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 337D8F5A01EA detail_begin "ObjectFlowState"

  // -end- 337D8F5A01EA detail_begin "ObjectFlowState"

  /** attaches a Available.
   *  
   *  @see #detachAvailable
   *  @see #getAvailable
   *  @see #containsAvailable
   */
  // -beg- preserve=no 337D935E0212 attach_head337D8F5A01EA "ObjectFlowState::attachAvailable"
  public void attachAvailable(Parameter available1)
  // -end- 337D935E0212 attach_head337D8F5A01EA "ObjectFlowState::attachAvailable"
    ; // empty

  /** disconnect the currently attached Available.
   *  @see #attachAvailable
   */
  // -beg- preserve=no 337D935E0212 detach_head337D8F5A01EA "ObjectFlowState::detachAvailable"
  public Parameter detachAvailable()
  // -end- 337D935E0212 detach_head337D8F5A01EA "ObjectFlowState::detachAvailable"
    ; // empty

  /** get the currently attached Available.
   *  @see #attachAvailable
   */
  // -beg- preserve=no 337D935E0212 get_head337D8F5A01EA "ObjectFlowState::getAvailable"
  public Parameter getAvailable()
  // -end- 337D935E0212 get_head337D8F5A01EA "ObjectFlowState::getAvailable"
    ; // empty

  /** tests if there is a Available attached.
   *  @see #attachAvailable
   */
  // -beg- preserve=no 337D935E0212 test_head337D8F5A01EA "ObjectFlowState::containsAvailable"
  public boolean containsAvailable()
  // -end- 337D935E0212 test_head337D8F5A01EA "ObjectFlowState::containsAvailable"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 337D935E0212 _link_body337D8F5A01EA "ObjectFlowState::_linkAvailable"
  public void _linkAvailable(Parameter available1);
  // -end- 337D935E0212 _link_body337D8F5A01EA "ObjectFlowState::_linkAvailable"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 337D935E0212 _unlink_body337D8F5A01EA "ObjectFlowState::_unlinkAvailable"
  public void _unlinkAvailable(Parameter available1);
  // -end- 337D935E0212 _unlink_body337D8F5A01EA "ObjectFlowState::_unlinkAvailable"

  /** attaches a Type.
   *  
   *  @see #detachType
   *  @see #getType
   *  @see #containsType
   */
  // -beg- preserve=no 33CF9EFC006F attach_head337D8F5A01EA "ObjectFlowState::attachType"
  public void attachType(Classifier type1)
  // -end- 33CF9EFC006F attach_head337D8F5A01EA "ObjectFlowState::attachType"
    ; // empty

  /** disconnect the currently attached Type.
   *  @see #attachType
   */
  // -beg- preserve=no 33CF9EFC006F detach_head337D8F5A01EA "ObjectFlowState::detachType"
  public Classifier detachType()
  // -end- 33CF9EFC006F detach_head337D8F5A01EA "ObjectFlowState::detachType"
    ; // empty

  /** get the currently attached Type.
   *  @see #attachType
   */
  // -beg- preserve=no 33CF9EFC006F get_head337D8F5A01EA "ObjectFlowState::getType"
  public Classifier getType()
  // -end- 33CF9EFC006F get_head337D8F5A01EA "ObjectFlowState::getType"
    ; // empty

  /** tests if there is a Type attached.
   *  @see #attachType
   */
  // -beg- preserve=no 33CF9EFC006F test_head337D8F5A01EA "ObjectFlowState::containsType"
  public boolean containsType()
  // -end- 33CF9EFC006F test_head337D8F5A01EA "ObjectFlowState::containsType"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006F _link_body337D8F5A01EA "ObjectFlowState::_linkType"
  public void _linkType(Classifier type1);
  // -end- 33CF9EFC006F _link_body337D8F5A01EA "ObjectFlowState::_linkType"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CF9EFC006F _unlink_body337D8F5A01EA "ObjectFlowState::_unlinkType"
  public void _unlinkType(Classifier type1);
  // -end- 33CF9EFC006F _unlink_body337D8F5A01EA "ObjectFlowState::_unlinkType"

  /** add a Parameter.
   *  
   *  @see #removeParameter
   *  @see #containsParameter
   *  @see #iteratorParameter
   *  @see #clearParameter
   *  @see #sizeParameter
   */
  // -beg- preserve=no 36462DDF008D add_head337D8F5A01EA "ObjectFlowState::addParameter"
  public void addParameter(Parameter parameter1)
  // -end- 36462DDF008D add_head337D8F5A01EA "ObjectFlowState::addParameter"
    ; // empty

  /** disconnect a Parameter.
   *  @see #addParameter
   */
  // -beg- preserve=no 36462DDF008D remove_head337D8F5A01EA "ObjectFlowState::removeParameter"
  public Parameter removeParameter(Parameter parameter1)
  // -end- 36462DDF008D remove_head337D8F5A01EA "ObjectFlowState::removeParameter"
    ; // empty

  /** tests if a given Parameter is connected.
   *  @see #addParameter
   */
  // -beg- preserve=no 36462DDF008D test_head337D8F5A01EA "ObjectFlowState::containsParameter"
  public boolean containsParameter(Parameter parameter1)
  // -end- 36462DDF008D test_head337D8F5A01EA "ObjectFlowState::containsParameter"
    ; // empty

  /** used to enumerate all connected Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 36462DDF008D get_all_head337D8F5A01EA "ObjectFlowState::iteratorParameter"
  public java.util.Iterator iteratorParameter()
  // -end- 36462DDF008D get_all_head337D8F5A01EA "ObjectFlowState::iteratorParameter"
    ; // empty

  /** disconnect all Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 36462DDF008D remove_all_head337D8F5A01EA "ObjectFlowState::clearParameter"
  public void clearParameter()
  // -end- 36462DDF008D remove_all_head337D8F5A01EA "ObjectFlowState::clearParameter"
    ; // empty

  /** returns the number of Parameters.
   *  @see #addParameter
   */
  // -beg- preserve=no 36462DDF008D size_head337D8F5A01EA "ObjectFlowState::sizeParameter"
  public int sizeParameter()
  // -end- 36462DDF008D size_head337D8F5A01EA "ObjectFlowState::sizeParameter"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36462DDF008D _link_body337D8F5A01EA "ObjectFlowState::_linkParameter"
  public void _linkParameter(Parameter parameter1);
  // -end- 36462DDF008D _link_body337D8F5A01EA "ObjectFlowState::_linkParameter"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36462DDF008D _unlink_body337D8F5A01EA "ObjectFlowState::_unlinkParameter"
  public void _unlinkParameter(Parameter parameter1);
  // -end- 36462DDF008D _unlink_body337D8F5A01EA "ObjectFlowState::_unlinkParameter"

  /** get current value of isSynch
   *  @see #setSynch
   */
  // -beg- preserve=no 3611D06602E4 get_head337D8F5A01EA "isSynch"
   boolean isSynch()
  // -end- 3611D06602E4 get_head337D8F5A01EA "isSynch"
    ; // empty
  /** set current value of isSynch
   *  @see #isSynch
   */
  // -beg- preserve=no 3611D06602E4 set_head337D8F5A01EA "isSynch"
   void setSynch(boolean value1)
  // -end- 3611D06602E4 set_head337D8F5A01EA "isSynch"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 337D8F5A01EA detail_end "ObjectFlowState"

  // -end- 337D8F5A01EA detail_end "ObjectFlowState"

}

