// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:31 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327A810D03C0 package "GeneralizableElement"
package ch.ehi.uml1_4.foundation.core;
// -end- 327A810D03C0 package "GeneralizableElement"

// -beg- preserve=no 327A810D03C0 autoimport "GeneralizableElement"
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Generalization;
// -end- 327A810D03C0 autoimport "GeneralizableElement"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327A810D03C0 import "GeneralizableElement"

// -end- 327A810D03C0 import "GeneralizableElement"

/** A generalizable element is a model element that may participate in a generalizationrelationship.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:31 $
 */
public interface GeneralizableElement extends ModelElement , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327A810D03C0 detail_begin "GeneralizableElement"

  // -end- 327A810D03C0 detail_begin "GeneralizableElement"

  /** add a Generalization.
   *  
   *  @see #removeGeneralization
   *  @see #containsGeneralization
   *  @see #iteratorGeneralization
   *  @see #clearGeneralization
   *  @see #sizeGeneralization
   */
  // -beg- preserve=no 335C14A5019A add_head327A810D03C0 "GeneralizableElement::addGeneralization"
  public void addGeneralization(Generalization generalization1)
  // -end- 335C14A5019A add_head327A810D03C0 "GeneralizableElement::addGeneralization"
    ; // empty

  /** disconnect a Generalization.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_head327A810D03C0 "GeneralizableElement::removeGeneralization"
  public Generalization removeGeneralization(Generalization generalization1)
  // -end- 335C14A5019A remove_head327A810D03C0 "GeneralizableElement::removeGeneralization"
    ; // empty

  /** tests if a given Generalization is connected.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A test_head327A810D03C0 "GeneralizableElement::containsGeneralization"
  public boolean containsGeneralization(Generalization generalization1)
  // -end- 335C14A5019A test_head327A810D03C0 "GeneralizableElement::containsGeneralization"
    ; // empty

  /** used to enumerate all connected Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A get_all_head327A810D03C0 "GeneralizableElement::iteratorGeneralization"
  public java.util.Iterator iteratorGeneralization()
  // -end- 335C14A5019A get_all_head327A810D03C0 "GeneralizableElement::iteratorGeneralization"
    ; // empty

  /** disconnect all Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A remove_all_head327A810D03C0 "GeneralizableElement::clearGeneralization"
  public void clearGeneralization()
  // -end- 335C14A5019A remove_all_head327A810D03C0 "GeneralizableElement::clearGeneralization"
    ; // empty

  /** returns the number of Generalizations.
   *  @see #addGeneralization
   */
  // -beg- preserve=no 335C14A5019A size_head327A810D03C0 "GeneralizableElement::sizeGeneralization"
  public int sizeGeneralization()
  // -end- 335C14A5019A size_head327A810D03C0 "GeneralizableElement::sizeGeneralization"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _link_body327A810D03C0 "GeneralizableElement::_linkGeneralization"
  public void _linkGeneralization(Generalization generalization1);
  // -end- 335C14A5019A _link_body327A810D03C0 "GeneralizableElement::_linkGeneralization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C14A5019A _unlink_body327A810D03C0 "GeneralizableElement::_unlinkGeneralization"
  public void _unlinkGeneralization(Generalization generalization1);
  // -end- 335C14A5019A _unlink_body327A810D03C0 "GeneralizableElement::_unlinkGeneralization"

  /** add a Specialization.
   *  
   *  @see #removeSpecialization
   *  @see #containsSpecialization
   *  @see #iteratorSpecialization
   *  @see #clearSpecialization
   *  @see #sizeSpecialization
   */
  // -beg- preserve=no 335C146B01D6 add_head327A810D03C0 "GeneralizableElement::addSpecialization"
  public void addSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 add_head327A810D03C0 "GeneralizableElement::addSpecialization"
    ; // empty

  /** disconnect a Specialization.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_head327A810D03C0 "GeneralizableElement::removeSpecialization"
  public Generalization removeSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 remove_head327A810D03C0 "GeneralizableElement::removeSpecialization"
    ; // empty

  /** tests if a given Specialization is connected.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 test_head327A810D03C0 "GeneralizableElement::containsSpecialization"
  public boolean containsSpecialization(Generalization specialization1)
  // -end- 335C146B01D6 test_head327A810D03C0 "GeneralizableElement::containsSpecialization"
    ; // empty

  /** used to enumerate all connected Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 get_all_head327A810D03C0 "GeneralizableElement::iteratorSpecialization"
  public java.util.Iterator iteratorSpecialization()
  // -end- 335C146B01D6 get_all_head327A810D03C0 "GeneralizableElement::iteratorSpecialization"
    ; // empty

  /** disconnect all Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 remove_all_head327A810D03C0 "GeneralizableElement::clearSpecialization"
  public void clearSpecialization()
  // -end- 335C146B01D6 remove_all_head327A810D03C0 "GeneralizableElement::clearSpecialization"
    ; // empty

  /** returns the number of Specializations.
   *  @see #addSpecialization
   */
  // -beg- preserve=no 335C146B01D6 size_head327A810D03C0 "GeneralizableElement::sizeSpecialization"
  public int sizeSpecialization()
  // -end- 335C146B01D6 size_head327A810D03C0 "GeneralizableElement::sizeSpecialization"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _link_body327A810D03C0 "GeneralizableElement::_linkSpecialization"
  public void _linkSpecialization(Generalization specialization1);
  // -end- 335C146B01D6 _link_body327A810D03C0 "GeneralizableElement::_linkSpecialization"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 335C146B01D6 _unlink_body327A810D03C0 "GeneralizableElement::_unlinkSpecialization"
  public void _unlinkSpecialization(Generalization specialization1);
  // -end- 335C146B01D6 _unlink_body327A810D03C0 "GeneralizableElement::_unlinkSpecialization"

  /** get current value of isRoot
   *  @see #setRoot
   */
  // -beg- preserve=no 327A877801CC get_head327A810D03C0 "isRoot"
   boolean isRoot()
  // -end- 327A877801CC get_head327A810D03C0 "isRoot"
    ; // empty
  /** set current value of isRoot
   *  @see #isRoot
   */
  // -beg- preserve=no 327A877801CC set_head327A810D03C0 "isRoot"
   void setRoot(boolean value1)
  // -end- 327A877801CC set_head327A810D03C0 "isRoot"
    ; // empty
  /** get current value of isLeaf
   *  @see #setLeaf
   */
  // -beg- preserve=no 327A877E006E get_head327A810D03C0 "isLeaf"
   boolean isLeaf()
  // -end- 327A877E006E get_head327A810D03C0 "isLeaf"
    ; // empty
  /** set current value of isLeaf
   *  @see #isLeaf
   */
  // -beg- preserve=no 327A877E006E set_head327A810D03C0 "isLeaf"
   void setLeaf(boolean value1)
  // -end- 327A877E006E set_head327A810D03C0 "isLeaf"
    ; // empty
  /** get current value of isAbstract
   *  @see #setAbstract
   */
  // -beg- preserve=no 327A878400D2 get_head327A810D03C0 "isAbstract"
   boolean isAbstract()
  // -end- 327A878400D2 get_head327A810D03C0 "isAbstract"
    ; // empty
  /** set current value of isAbstract
   *  @see #isAbstract
   */
  // -beg- preserve=no 327A878400D2 set_head327A810D03C0 "isAbstract"
   void setAbstract(boolean value1)
  // -end- 327A878400D2 set_head327A810D03C0 "isAbstract"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327A810D03C0 detail_end "GeneralizableElement"

  // -end- 327A810D03C0 detail_end "GeneralizableElement"

}

