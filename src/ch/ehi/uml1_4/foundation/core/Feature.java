// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:30 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 32989F9700FE package "Feature"
package ch.ehi.uml1_4.foundation.core;
// -end- 32989F9700FE package "Feature"

// -beg- preserve=no 32989F9700FE autoimport "Feature"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.behaviour.collaborations.ClassifierRole;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.datatypes.ScopeKind;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
// -end- 32989F9700FE autoimport "Feature"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 32989F9700FE import "Feature"

// -end- 32989F9700FE import "Feature"

/** A feature is a property, like operation or attribute, which is encapsulated within a Classifier.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:30 $
 */
public interface Feature extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32989F9700FE detail_begin "Feature"

  // -end- 32989F9700FE detail_begin "Feature"

  /** add a ClassifierRole.
   *  
   *  @see #removeClassifierRole
   *  @see #containsClassifierRole
   *  @see #iteratorClassifierRole
   *  @see #clearClassifierRole
   *  @see #sizeClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 add_head32989F9700FE "ModelElement::addClassifierRole"
  public void addClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 add_head32989F9700FE "ModelElement::addClassifierRole"
    ; // empty

  /** disconnect a ClassifierRole.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_head32989F9700FE "ModelElement::removeClassifierRole"
  public ClassifierRole removeClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 remove_head32989F9700FE "ModelElement::removeClassifierRole"
    ; // empty

  /** tests if a given ClassifierRole is connected.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 test_head32989F9700FE "ModelElement::containsClassifierRole"
  public boolean containsClassifierRole(ClassifierRole classifierRole1)
  // -end- 36008FB700E7 test_head32989F9700FE "ModelElement::containsClassifierRole"
    ; // empty

  /** used to enumerate all connected ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 get_all_head32989F9700FE "ModelElement::iteratorClassifierRole"
  public java.util.Iterator iteratorClassifierRole()
  // -end- 36008FB700E7 get_all_head32989F9700FE "ModelElement::iteratorClassifierRole"
    ; // empty

  /** disconnect all ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 remove_all_head32989F9700FE "ModelElement::clearClassifierRole"
  public void clearClassifierRole()
  // -end- 36008FB700E7 remove_all_head32989F9700FE "ModelElement::clearClassifierRole"
    ; // empty

  /** returns the number of ClassifierRoles.
   *  @see #addClassifierRole
   */
  // -beg- preserve=no 36008FB700E7 size_head32989F9700FE "ModelElement::sizeClassifierRole"
  public int sizeClassifierRole()
  // -end- 36008FB700E7 size_head32989F9700FE "ModelElement::sizeClassifierRole"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _link_body32989F9700FE "ModelElement::_linkClassifierRole"
  public void _linkClassifierRole(ClassifierRole classifierRole1);
  // -end- 36008FB700E7 _link_body32989F9700FE "ModelElement::_linkClassifierRole"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36008FB700E7 _unlink_body32989F9700FE "ModelElement::_unlinkClassifierRole"
  public void _unlinkClassifierRole(ClassifierRole classifierRole1);
  // -end- 36008FB700E7 _unlink_body32989F9700FE "ModelElement::_unlinkClassifierRole"

  /** attaches a Owner.
   *  
   *  @see #detachOwner
   *  @see #getOwner
   *  @see #containsOwner
   */
  // -beg- preserve=no 32B5D7EF03DD attach_head32989F9700FE "Feature::attachOwner"
  public void attachOwner(Classifier owner1)
  // -end- 32B5D7EF03DD attach_head32989F9700FE "Feature::attachOwner"
    ; // empty

  /** disconnect the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 32B5D7EF03DD detach_head32989F9700FE "Feature::detachOwner"
  public Classifier detachOwner()
  // -end- 32B5D7EF03DD detach_head32989F9700FE "Feature::detachOwner"
    ; // empty

  /** get the currently attached Owner.
   *  @see #attachOwner
   */
  // -beg- preserve=no 32B5D7EF03DD get_head32989F9700FE "Feature::getOwner"
  public Classifier getOwner()
  // -end- 32B5D7EF03DD get_head32989F9700FE "Feature::getOwner"
    ; // empty

  /** tests if there is a Owner attached.
   *  @see #attachOwner
   */
  // -beg- preserve=no 32B5D7EF03DD test_head32989F9700FE "Feature::containsOwner"
  public boolean containsOwner()
  // -end- 32B5D7EF03DD test_head32989F9700FE "Feature::containsOwner"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03DD _link_body32989F9700FE "Feature::_linkOwner"
  public void _linkOwner(Classifier owner1);
  // -end- 32B5D7EF03DD _link_body32989F9700FE "Feature::_linkOwner"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 32B5D7EF03DD _unlink_body32989F9700FE "Feature::_unlinkOwner"
  public void _unlinkOwner(Classifier owner1);
  // -end- 32B5D7EF03DD _unlink_body32989F9700FE "Feature::_unlinkOwner"

  /** get current value of ownerScope
   *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
   *  @see #setOwnerScope
   */
  // -beg- preserve=no 31653E23032A get_head32989F9700FE "ownerScope"
   int getOwnerScope()
  // -end- 31653E23032A get_head32989F9700FE "ownerScope"
    ; // empty
  /** set current value of ownerScope
   *  @see ch.ehi.uml1_4.foundation.datatypes.ScopeKind
   *  @see #getOwnerScope
   */
  // -beg- preserve=no 31653E23032A set_head32989F9700FE "ownerScope"
   void setOwnerScope(int value1)
  // -end- 31653E23032A set_head32989F9700FE "ownerScope"
    ; // empty
  /** get current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #setVisibility
   */
  // -beg- preserve=no 33D1265902DA get_head32989F9700FE "visibility"
   int getVisibility()
  // -end- 33D1265902DA get_head32989F9700FE "visibility"
    ; // empty
  /** set current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #getVisibility
   */
  // -beg- preserve=no 33D1265902DA set_head32989F9700FE "visibility"
   void setVisibility(int value1)
  // -end- 33D1265902DA set_head32989F9700FE "visibility"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 32989F9700FE detail_end "Feature"

  // -end- 32989F9700FE detail_end "Feature"

}

