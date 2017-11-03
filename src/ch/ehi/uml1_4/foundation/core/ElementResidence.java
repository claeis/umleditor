// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:29 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3648B41E0082 package "ElementResidence"
package ch.ehi.uml1_4.foundation.core;
// -end- 3648B41E0082 package "ElementResidence"

<<<<<<< HEAD
// -beg- preserve=no 3648B41E0082 autoimport "ElementResidence"
import ch.ehi.uml1_4.foundation.core.Component;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
// -end- 3648B41E0082 autoimport "ElementResidence"

=======
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3648B41E0082 import "ElementResidence"

// -end- 3648B41E0082 import "ElementResidence"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:29 $
 */
public interface ElementResidence extends java.io.Serializable
{
<<<<<<< HEAD
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3648B41E0082 detail_begin "ElementResidence"

  // -end- 3648B41E0082 detail_begin "ElementResidence"

  /** get current value of container
   *  @see #setContainer
   */
  // -beg- preserve=no 36240CA40212 link_get_head3648B41E0082 "container"
  public Component getContainer()
  // -end- 36240CA40212 link_get_head3648B41E0082 "container"
    ; // empty
  /** set current value of container
   *  @see #getContainer
   */
  // -beg- preserve=no 36240CA40212 link_set_head3648B41E0082 "container"
  public void setContainer(Component value1)
  // -end- 36240CA40212 link_set_head3648B41E0082 "container"
    ; // empty
  /** get current value of resident
   *  @see #setResident
   */
  // -beg- preserve=no 36240CA4024E link_get_head3648B41E0082 "resident"
  public ModelElement getResident()
  // -end- 36240CA4024E link_get_head3648B41E0082 "resident"
    ; // empty
  /** set current value of resident
   *  @see #getResident
   */
  // -beg- preserve=no 36240CA4024E link_set_head3648B41E0082 "resident"
  public void setResident(ModelElement value1)
  // -end- 36240CA4024E link_set_head3648B41E0082 "resident"
    ; // empty
  /** get current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #setVisibility
   */
  // -beg- preserve=no 3648B44F01FE get_head3648B41E0082 "visibility"
   int getVisibility()
  // -end- 3648B44F01FE get_head3648B41E0082 "visibility"
    ; // empty
  /** set current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #getVisibility
   */
  // -beg- preserve=no 3648B44F01FE set_head3648B41E0082 "visibility"
   void setVisibility(int value1)
  // -end- 3648B44F01FE set_head3648B41E0082 "visibility"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3648B41E0082 detail_end "ElementResidence"

  // -end- 3648B41E0082 detail_end "ElementResidence"

}

=======
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3648B41E0082 detail_begin "ElementResidence"

// -end- 3648B41E0082 detail_begin "ElementResidence"

/** get current value of container
 *  @see #setContainer
 */
// -beg- preserve=no 36240CA40212 link_get_head3648B41E0082 "container"
public Component getContainer()
// -end- 36240CA40212 link_get_head3648B41E0082 "container"
;     // empty
/** set current value of container
 *  @see #getContainer
 */
// -beg- preserve=no 36240CA40212 link_set_head3648B41E0082 "container"
public void setContainer(Component value1)
// -end- 36240CA40212 link_set_head3648B41E0082 "container"
;     // empty
/** get current value of resident
 *  @see #setResident
 */
// -beg- preserve=no 36240CA4024E link_get_head3648B41E0082 "resident"
public ModelElement getResident()
// -end- 36240CA4024E link_get_head3648B41E0082 "resident"
;     // empty
/** set current value of resident
 *  @see #getResident
 */
// -beg- preserve=no 36240CA4024E link_set_head3648B41E0082 "resident"
public void setResident(ModelElement value1)
// -end- 36240CA4024E link_set_head3648B41E0082 "resident"
;     // empty
/** get current value of visibility
 *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
 *  @see #setVisibility
 */
// -beg- preserve=no 3648B44F01FE get_head3648B41E0082 "visibility"
int getVisibility()
// -end- 3648B44F01FE get_head3648B41E0082 "visibility"
;     // empty
/** set current value of visibility
 *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
 *  @see #getVisibility
 */
// -beg- preserve=no 3648B44F01FE set_head3648B41E0082 "visibility"
void setVisibility(int value1)
// -end- 3648B44F01FE set_head3648B41E0082 "visibility"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3648B41E0082 detail_end "ElementResidence"

// -end- 3648B41E0082 detail_end "ElementResidence"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
