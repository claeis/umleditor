// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:16 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 32ABA35D0230 package "UseCase"
package ch.ehi.uml1_4.behaviour.usecases;
// -end- 32ABA35D0230 package "UseCase"

// -beg- preserve=no 32ABA35D0230 autoimport "UseCase"
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.behaviour.usecases.Extend;
import ch.ehi.uml1_4.behaviour.usecases.Include;
import ch.ehi.uml1_4.behaviour.usecases.ExtensionPoint;
// -end- 32ABA35D0230 autoimport "UseCase"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 32ABA35D0230 import "UseCase"

// -end- 32ABA35D0230 import "UseCase"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:16 $
 */
public interface UseCase extends Classifier , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32ABA35D0230 detail_begin "UseCase"

  // -end- 32ABA35D0230 detail_begin "UseCase"

  /** add a BaseExtend.
   *  
   *  @see #removeBaseExtend
   *  @see #containsBaseExtend
   *  @see #iteratorBaseExtend
   *  @see #clearBaseExtend
   *  @see #sizeBaseExtend
   */
  // -beg- preserve=no 35FDD865000A add_head32ABA35D0230 "UseCase::addBaseExtend"
  public void addBaseExtend(Extend baseExtend1)
  // -end- 35FDD865000A add_head32ABA35D0230 "UseCase::addBaseExtend"
    ; // empty

  /** disconnect a BaseExtend.
   *  @see #addBaseExtend
   */
  // -beg- preserve=no 35FDD865000A remove_head32ABA35D0230 "UseCase::removeBaseExtend"
  public Extend removeBaseExtend(Extend baseExtend1)
  // -end- 35FDD865000A remove_head32ABA35D0230 "UseCase::removeBaseExtend"
    ; // empty

  /** tests if a given BaseExtend is connected.
   *  @see #addBaseExtend
   */
  // -beg- preserve=no 35FDD865000A test_head32ABA35D0230 "UseCase::containsBaseExtend"
  public boolean containsBaseExtend(Extend baseExtend1)
  // -end- 35FDD865000A test_head32ABA35D0230 "UseCase::containsBaseExtend"
    ; // empty

  /** used to enumerate all connected BaseExtends.
   *  @see #addBaseExtend
   */
  // -beg- preserve=no 35FDD865000A get_all_head32ABA35D0230 "UseCase::iteratorBaseExtend"
  public java.util.Iterator iteratorBaseExtend()
  // -end- 35FDD865000A get_all_head32ABA35D0230 "UseCase::iteratorBaseExtend"
    ; // empty

  /** disconnect all BaseExtends.
   *  @see #addBaseExtend
   */
  // -beg- preserve=no 35FDD865000A remove_all_head32ABA35D0230 "UseCase::clearBaseExtend"
  public void clearBaseExtend()
  // -end- 35FDD865000A remove_all_head32ABA35D0230 "UseCase::clearBaseExtend"
    ; // empty

  /** returns the number of BaseExtends.
   *  @see #addBaseExtend
   */
  // -beg- preserve=no 35FDD865000A size_head32ABA35D0230 "UseCase::sizeBaseExtend"
  public int sizeBaseExtend()
  // -end- 35FDD865000A size_head32ABA35D0230 "UseCase::sizeBaseExtend"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD865000A _link_body32ABA35D0230 "UseCase::_linkBaseExtend"
  public void _linkBaseExtend(Extend baseExtend1);
  // -end- 35FDD865000A _link_body32ABA35D0230 "UseCase::_linkBaseExtend"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD865000A _unlink_body32ABA35D0230 "UseCase::_unlinkBaseExtend"
  public void _unlinkBaseExtend(Extend baseExtend1);
  // -end- 35FDD865000A _unlink_body32ABA35D0230 "UseCase::_unlinkBaseExtend"

  /** add a ExtensionExtend.
   *  
   *  @see #removeExtensionExtend
   *  @see #containsExtensionExtend
   *  @see #iteratorExtensionExtend
   *  @see #clearExtensionExtend
   *  @see #sizeExtensionExtend
   */
  // -beg- preserve=no 35FDD86C0140 add_head32ABA35D0230 "UseCase::addExtensionExtend"
  public void addExtensionExtend(Extend extensionExtend1)
  // -end- 35FDD86C0140 add_head32ABA35D0230 "UseCase::addExtensionExtend"
    ; // empty

  /** disconnect a ExtensionExtend.
   *  @see #addExtensionExtend
   */
  // -beg- preserve=no 35FDD86C0140 remove_head32ABA35D0230 "UseCase::removeExtensionExtend"
  public Extend removeExtensionExtend(Extend extensionExtend1)
  // -end- 35FDD86C0140 remove_head32ABA35D0230 "UseCase::removeExtensionExtend"
    ; // empty

  /** tests if a given ExtensionExtend is connected.
   *  @see #addExtensionExtend
   */
  // -beg- preserve=no 35FDD86C0140 test_head32ABA35D0230 "UseCase::containsExtensionExtend"
  public boolean containsExtensionExtend(Extend extensionExtend1)
  // -end- 35FDD86C0140 test_head32ABA35D0230 "UseCase::containsExtensionExtend"
    ; // empty

  /** used to enumerate all connected ExtensionExtends.
   *  @see #addExtensionExtend
   */
  // -beg- preserve=no 35FDD86C0140 get_all_head32ABA35D0230 "UseCase::iteratorExtensionExtend"
  public java.util.Iterator iteratorExtensionExtend()
  // -end- 35FDD86C0140 get_all_head32ABA35D0230 "UseCase::iteratorExtensionExtend"
    ; // empty

  /** disconnect all ExtensionExtends.
   *  @see #addExtensionExtend
   */
  // -beg- preserve=no 35FDD86C0140 remove_all_head32ABA35D0230 "UseCase::clearExtensionExtend"
  public void clearExtensionExtend()
  // -end- 35FDD86C0140 remove_all_head32ABA35D0230 "UseCase::clearExtensionExtend"
    ; // empty

  /** returns the number of ExtensionExtends.
   *  @see #addExtensionExtend
   */
  // -beg- preserve=no 35FDD86C0140 size_head32ABA35D0230 "UseCase::sizeExtensionExtend"
  public int sizeExtensionExtend()
  // -end- 35FDD86C0140 size_head32ABA35D0230 "UseCase::sizeExtensionExtend"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD86C0140 _link_body32ABA35D0230 "UseCase::_linkExtensionExtend"
  public void _linkExtensionExtend(Extend extensionExtend1);
  // -end- 35FDD86C0140 _link_body32ABA35D0230 "UseCase::_linkExtensionExtend"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD86C0140 _unlink_body32ABA35D0230 "UseCase::_unlinkExtensionExtend"
  public void _unlinkExtensionExtend(Extend extensionExtend1);
  // -end- 35FDD86C0140 _unlink_body32ABA35D0230 "UseCase::_unlinkExtensionExtend"

  /** add a BaseInclude.
   *  
   *  @see #removeBaseInclude
   *  @see #containsBaseInclude
   *  @see #iteratorBaseInclude
   *  @see #clearBaseInclude
   *  @see #sizeBaseInclude
   */
  // -beg- preserve=no 35FDD995038F add_head32ABA35D0230 "UseCase::addBaseInclude"
  public void addBaseInclude(Include baseInclude1)
  // -end- 35FDD995038F add_head32ABA35D0230 "UseCase::addBaseInclude"
    ; // empty

  /** disconnect a BaseInclude.
   *  @see #addBaseInclude
   */
  // -beg- preserve=no 35FDD995038F remove_head32ABA35D0230 "UseCase::removeBaseInclude"
  public Include removeBaseInclude(Include baseInclude1)
  // -end- 35FDD995038F remove_head32ABA35D0230 "UseCase::removeBaseInclude"
    ; // empty

  /** tests if a given BaseInclude is connected.
   *  @see #addBaseInclude
   */
  // -beg- preserve=no 35FDD995038F test_head32ABA35D0230 "UseCase::containsBaseInclude"
  public boolean containsBaseInclude(Include baseInclude1)
  // -end- 35FDD995038F test_head32ABA35D0230 "UseCase::containsBaseInclude"
    ; // empty

  /** used to enumerate all connected BaseIncludes.
   *  @see #addBaseInclude
   */
  // -beg- preserve=no 35FDD995038F get_all_head32ABA35D0230 "UseCase::iteratorBaseInclude"
  public java.util.Iterator iteratorBaseInclude()
  // -end- 35FDD995038F get_all_head32ABA35D0230 "UseCase::iteratorBaseInclude"
    ; // empty

  /** disconnect all BaseIncludes.
   *  @see #addBaseInclude
   */
  // -beg- preserve=no 35FDD995038F remove_all_head32ABA35D0230 "UseCase::clearBaseInclude"
  public void clearBaseInclude()
  // -end- 35FDD995038F remove_all_head32ABA35D0230 "UseCase::clearBaseInclude"
    ; // empty

  /** returns the number of BaseIncludes.
   *  @see #addBaseInclude
   */
  // -beg- preserve=no 35FDD995038F size_head32ABA35D0230 "UseCase::sizeBaseInclude"
  public int sizeBaseInclude()
  // -end- 35FDD995038F size_head32ABA35D0230 "UseCase::sizeBaseInclude"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD995038F _link_body32ABA35D0230 "UseCase::_linkBaseInclude"
  public void _linkBaseInclude(Include baseInclude1);
  // -end- 35FDD995038F _link_body32ABA35D0230 "UseCase::_linkBaseInclude"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD995038F _unlink_body32ABA35D0230 "UseCase::_unlinkBaseInclude"
  public void _unlinkBaseInclude(Include baseInclude1);
  // -end- 35FDD995038F _unlink_body32ABA35D0230 "UseCase::_unlinkBaseInclude"

  /** add a AdditionInclude.
   *  
   *  @see #removeAdditionInclude
   *  @see #containsAdditionInclude
   *  @see #iteratorAdditionInclude
   *  @see #clearAdditionInclude
   *  @see #sizeAdditionInclude
   */
  // -beg- preserve=no 35FDD9A50047 add_head32ABA35D0230 "UseCase::addAdditionInclude"
  public void addAdditionInclude(Include additionInclude1)
  // -end- 35FDD9A50047 add_head32ABA35D0230 "UseCase::addAdditionInclude"
    ; // empty

  /** disconnect a AdditionInclude.
   *  @see #addAdditionInclude
   */
  // -beg- preserve=no 35FDD9A50047 remove_head32ABA35D0230 "UseCase::removeAdditionInclude"
  public Include removeAdditionInclude(Include additionInclude1)
  // -end- 35FDD9A50047 remove_head32ABA35D0230 "UseCase::removeAdditionInclude"
    ; // empty

  /** tests if a given AdditionInclude is connected.
   *  @see #addAdditionInclude
   */
  // -beg- preserve=no 35FDD9A50047 test_head32ABA35D0230 "UseCase::containsAdditionInclude"
  public boolean containsAdditionInclude(Include additionInclude1)
  // -end- 35FDD9A50047 test_head32ABA35D0230 "UseCase::containsAdditionInclude"
    ; // empty

  /** used to enumerate all connected AdditionIncludes.
   *  @see #addAdditionInclude
   */
  // -beg- preserve=no 35FDD9A50047 get_all_head32ABA35D0230 "UseCase::iteratorAdditionInclude"
  public java.util.Iterator iteratorAdditionInclude()
  // -end- 35FDD9A50047 get_all_head32ABA35D0230 "UseCase::iteratorAdditionInclude"
    ; // empty

  /** disconnect all AdditionIncludes.
   *  @see #addAdditionInclude
   */
  // -beg- preserve=no 35FDD9A50047 remove_all_head32ABA35D0230 "UseCase::clearAdditionInclude"
  public void clearAdditionInclude()
  // -end- 35FDD9A50047 remove_all_head32ABA35D0230 "UseCase::clearAdditionInclude"
    ; // empty

  /** returns the number of AdditionIncludes.
   *  @see #addAdditionInclude
   */
  // -beg- preserve=no 35FDD9A50047 size_head32ABA35D0230 "UseCase::sizeAdditionInclude"
  public int sizeAdditionInclude()
  // -end- 35FDD9A50047 size_head32ABA35D0230 "UseCase::sizeAdditionInclude"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD9A50047 _link_body32ABA35D0230 "UseCase::_linkAdditionInclude"
  public void _linkAdditionInclude(Include additionInclude1);
  // -end- 35FDD9A50047 _link_body32ABA35D0230 "UseCase::_linkAdditionInclude"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD9A50047 _unlink_body32ABA35D0230 "UseCase::_unlinkAdditionInclude"
  public void _unlinkAdditionInclude(Include additionInclude1);
  // -end- 35FDD9A50047 _unlink_body32ABA35D0230 "UseCase::_unlinkAdditionInclude"

  /** add a ExtensionPoint.
   *  
   *  @see #removeExtensionPoint
   *  @see #containsExtensionPoint
   *  @see #iteratorExtensionPoint
   *  @see #clearExtensionPoint
   *  @see #sizeExtensionPoint
   */
  // -beg- preserve=no 362661DB015F add_head32ABA35D0230 "UseCase::addExtensionPoint"
  public void addExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 362661DB015F add_head32ABA35D0230 "UseCase::addExtensionPoint"
    ; // empty

  /** disconnect a ExtensionPoint.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 362661DB015F remove_head32ABA35D0230 "UseCase::removeExtensionPoint"
  public ExtensionPoint removeExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 362661DB015F remove_head32ABA35D0230 "UseCase::removeExtensionPoint"
    ; // empty

  /** tests if a given ExtensionPoint is connected.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 362661DB015F test_head32ABA35D0230 "UseCase::containsExtensionPoint"
  public boolean containsExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 362661DB015F test_head32ABA35D0230 "UseCase::containsExtensionPoint"
    ; // empty

  /** used to enumerate all connected ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 362661DB015F get_all_head32ABA35D0230 "UseCase::iteratorExtensionPoint"
  public java.util.Iterator iteratorExtensionPoint()
  // -end- 362661DB015F get_all_head32ABA35D0230 "UseCase::iteratorExtensionPoint"
    ; // empty

  /** disconnect all ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 362661DB015F remove_all_head32ABA35D0230 "UseCase::clearExtensionPoint"
  public void clearExtensionPoint()
  // -end- 362661DB015F remove_all_head32ABA35D0230 "UseCase::clearExtensionPoint"
    ; // empty

  /** returns the number of ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 362661DB015F size_head32ABA35D0230 "UseCase::sizeExtensionPoint"
  public int sizeExtensionPoint()
  // -end- 362661DB015F size_head32ABA35D0230 "UseCase::sizeExtensionPoint"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362661DB015F _link_body32ABA35D0230 "UseCase::_linkExtensionPoint"
  public void _linkExtensionPoint(ExtensionPoint extensionPoint1);
  // -end- 362661DB015F _link_body32ABA35D0230 "UseCase::_linkExtensionPoint"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362661DB015F _unlink_body32ABA35D0230 "UseCase::_unlinkExtensionPoint"
  public void _unlinkExtensionPoint(ExtensionPoint extensionPoint1);
  // -end- 362661DB015F _unlink_body32ABA35D0230 "UseCase::_unlinkExtensionPoint"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32ABA35D0230 detail_end "UseCase"

  // -end- 32ABA35D0230 detail_end "UseCase"

}

