// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:13 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 35FDD683021C package "Extend"
package ch.ehi.uml1_4.behaviour.usecases;
// -end- 35FDD683021C package "Extend"

// -beg- preserve=no 35FDD683021C autoimport "Extend"
import ch.ehi.uml1_4.foundation.core.Relationship;
import ch.ehi.uml1_4.behaviour.usecases.UseCase;
import ch.ehi.uml1_4.behaviour.usecases.ExtensionPoint;
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
// -end- 35FDD683021C autoimport "Extend"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 35FDD683021C import "Extend"

// -end- 35FDD683021C import "Extend"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:13 $
 */
public interface Extend extends Relationship , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 35FDD683021C detail_begin "Extend"

  // -end- 35FDD683021C detail_begin "Extend"

  /** attaches a Base.
   *  
   *  @see #detachBase
   *  @see #getBase
   *  @see #containsBase
   */
  // -beg- preserve=no 35FDD865000B attach_head35FDD683021C "Extend::attachBase"
  public void attachBase(UseCase base1)
  // -end- 35FDD865000B attach_head35FDD683021C "Extend::attachBase"
    ; // empty

  /** disconnect the currently attached Base.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD865000B detach_head35FDD683021C "Extend::detachBase"
  public UseCase detachBase()
  // -end- 35FDD865000B detach_head35FDD683021C "Extend::detachBase"
    ; // empty

  /** get the currently attached Base.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD865000B get_head35FDD683021C "Extend::getBase"
  public UseCase getBase()
  // -end- 35FDD865000B get_head35FDD683021C "Extend::getBase"
    ; // empty

  /** tests if there is a Base attached.
   *  @see #attachBase
   */
  // -beg- preserve=no 35FDD865000B test_head35FDD683021C "Extend::containsBase"
  public boolean containsBase()
  // -end- 35FDD865000B test_head35FDD683021C "Extend::containsBase"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD865000B _link_body35FDD683021C "Extend::_linkBase"
  public void _linkBase(UseCase base1);
  // -end- 35FDD865000B _link_body35FDD683021C "Extend::_linkBase"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD865000B _unlink_body35FDD683021C "Extend::_unlinkBase"
  public void _unlinkBase(UseCase base1);
  // -end- 35FDD865000B _unlink_body35FDD683021C "Extend::_unlinkBase"

  /** attaches a Extension.
   *  
   *  @see #detachExtension
   *  @see #getExtension
   *  @see #containsExtension
   */
  // -beg- preserve=no 35FDD86C0141 attach_head35FDD683021C "Extend::attachExtension"
  public void attachExtension(UseCase extension1)
  // -end- 35FDD86C0141 attach_head35FDD683021C "Extend::attachExtension"
    ; // empty

  /** disconnect the currently attached Extension.
   *  @see #attachExtension
   */
  // -beg- preserve=no 35FDD86C0141 detach_head35FDD683021C "Extend::detachExtension"
  public UseCase detachExtension()
  // -end- 35FDD86C0141 detach_head35FDD683021C "Extend::detachExtension"
    ; // empty

  /** get the currently attached Extension.
   *  @see #attachExtension
   */
  // -beg- preserve=no 35FDD86C0141 get_head35FDD683021C "Extend::getExtension"
  public UseCase getExtension()
  // -end- 35FDD86C0141 get_head35FDD683021C "Extend::getExtension"
    ; // empty

  /** tests if there is a Extension attached.
   *  @see #attachExtension
   */
  // -beg- preserve=no 35FDD86C0141 test_head35FDD683021C "Extend::containsExtension"
  public boolean containsExtension()
  // -end- 35FDD86C0141 test_head35FDD683021C "Extend::containsExtension"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD86C0141 _link_body35FDD683021C "Extend::_linkExtension"
  public void _linkExtension(UseCase extension1);
  // -end- 35FDD86C0141 _link_body35FDD683021C "Extend::_linkExtension"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 35FDD86C0141 _unlink_body35FDD683021C "Extend::_unlinkExtension"
  public void _unlinkExtension(UseCase extension1);
  // -end- 35FDD86C0141 _unlink_body35FDD683021C "Extend::_unlinkExtension"

  /** add a ExtensionPoint.
   *  
   *  @see #removeExtensionPoint
   *  @see #containsExtensionPoint
   *  @see #iteratorExtensionPoint
   *  @see #clearExtensionPoint
   *  @see #sizeExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF add_head35FDD683021C "Extend::addExtensionPoint"
  public void addExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF add_head35FDD683021C "Extend::addExtensionPoint"
    ; // empty

  // -beg- preserve=no 3626B0E203DF add2_head35FDD683021C "Extend::add2ExtensionPoint"
  public void addExtensionPoint(int index,ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF add2_head35FDD683021C "Extend::add2ExtensionPoint"
    ; // empty

  /** disconnect a ExtensionPoint.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF remove_head35FDD683021C "Extend::removeExtensionPoint"
  public ExtensionPoint removeExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF remove_head35FDD683021C "Extend::removeExtensionPoint"
    ; // empty

  /** disconnect a ExtensionPoint.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF remove2_head35FDD683021C "Extend::remove2ExtensionPoint"
  public ExtensionPoint removeExtensionPoint(int index)
  // -end- 3626B0E203DF remove2_head35FDD683021C "Extend::remove2ExtensionPoint"
    ; // empty

  /** change a ExtensionPoint.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF set_head35FDD683021C "Extend::setExtensionPoint"
  public ExtensionPoint setExtensionPoint(int index,ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF set_head35FDD683021C "Extend::setExtensionPoint"
    ; // empty

  /** tests if a given ExtensionPoint is connected.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF test_head35FDD683021C "Extend::containsExtensionPoint"
  public boolean containsExtensionPoint(ExtensionPoint extensionPoint1)
  // -end- 3626B0E203DF test_head35FDD683021C "Extend::containsExtensionPoint"
    ; // empty

  /** used to enumerate all connected ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF get_all_head35FDD683021C "Extend::iteratorExtensionPoint"
  public java.util.Iterator iteratorExtensionPoint()
  // -end- 3626B0E203DF get_all_head35FDD683021C "Extend::iteratorExtensionPoint"
    ; // empty

  /** disconnect all ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF remove_all_head35FDD683021C "Extend::clearExtensionPoint"
  public void clearExtensionPoint()
  // -end- 3626B0E203DF remove_all_head35FDD683021C "Extend::clearExtensionPoint"
    ; // empty

  /** returns the number of ExtensionPoints.
   *  @see #addExtensionPoint
   */
  // -beg- preserve=no 3626B0E203DF size_head35FDD683021C "Extend::sizeExtensionPoint"
  public int sizeExtensionPoint()
  // -end- 3626B0E203DF size_head35FDD683021C "Extend::sizeExtensionPoint"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3626B0E203DF _link_body35FDD683021C "Extend::_linkExtensionPoint"
  public void _linkExtensionPoint(ExtensionPoint extensionPoint1);
  // -end- 3626B0E203DF _link_body35FDD683021C "Extend::_linkExtensionPoint"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3626B0E203DF _unlink_body35FDD683021C "Extend::_unlinkExtensionPoint"
  public void _unlinkExtensionPoint(ExtensionPoint extensionPoint1);
  // -end- 3626B0E203DF _unlink_body35FDD683021C "Extend::_unlinkExtensionPoint"

  /** get current value of condition
   *  @see #setCondition
   */
  // -beg- preserve=no 35FDD71C026C get_head35FDD683021C "condition"
   BooleanExpression getCondition()
  // -end- 35FDD71C026C get_head35FDD683021C "condition"
    ; // empty
  /** set current value of condition
   *  @see #getCondition
   */
  // -beg- preserve=no 35FDD71C026C set_head35FDD683021C "condition"
   void setCondition(BooleanExpression value1)
  // -end- 35FDD71C026C set_head35FDD683021C "condition"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 35FDD683021C detail_end "Extend"

  // -end- 35FDD683021C detail_end "Extend"

}

