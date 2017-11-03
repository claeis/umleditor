// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:43 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 365EEE3B00B4 package "TemplateParameter"
package ch.ehi.uml1_4.foundation.core;
// -end- 365EEE3B00B4 package "TemplateParameter"

// -beg- preserve=no 365EEE3B00B4 autoimport "TemplateParameter"
import ch.ehi.uml1_4.foundation.core.ModelElement;
// -end- 365EEE3B00B4 autoimport "TemplateParameter"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 365EEE3B00B4 import "TemplateParameter"

// -end- 365EEE3B00B4 import "TemplateParameter"

/** Defines the relationship between a template (a ModelElement) and its parameter (aModelElement).
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:43 $
 */
public interface TemplateParameter extends java.io.Serializable
{
<<<<<<< HEAD
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 365EEE3B00B4 detail_begin "TemplateParameter"

  // -end- 365EEE3B00B4 detail_begin "TemplateParameter"

  /** attaches a Template.
   *  
   *  @see #detachTemplate
   *  @see #getTemplate
   *  @see #containsTemplate
   */
  // -beg- preserve=no 36240F3800BE attach_head365EEE3B00B4 "TemplateParameter::attachTemplate"
  public void attachTemplate(ModelElement template1)
  // -end- 36240F3800BE attach_head365EEE3B00B4 "TemplateParameter::attachTemplate"
    ; // empty

  /** disconnect the currently attached Template.
   *  @see #attachTemplate
   */
  // -beg- preserve=no 36240F3800BE detach_head365EEE3B00B4 "TemplateParameter::detachTemplate"
  public ModelElement detachTemplate()
  // -end- 36240F3800BE detach_head365EEE3B00B4 "TemplateParameter::detachTemplate"
    ; // empty

  /** get the currently attached Template.
   *  @see #attachTemplate
   */
  // -beg- preserve=no 36240F3800BE get_head365EEE3B00B4 "TemplateParameter::getTemplate"
  public ModelElement getTemplate()
  // -end- 36240F3800BE get_head365EEE3B00B4 "TemplateParameter::getTemplate"
    ; // empty

  /** tests if there is a Template attached.
   *  @see #attachTemplate
   */
  // -beg- preserve=no 36240F3800BE test_head365EEE3B00B4 "TemplateParameter::containsTemplate"
  public boolean containsTemplate()
  // -end- 36240F3800BE test_head365EEE3B00B4 "TemplateParameter::containsTemplate"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36240F3800BE _link_body365EEE3B00B4 "TemplateParameter::_linkTemplate"
  public void _linkTemplate(ModelElement template1);
  // -end- 36240F3800BE _link_body365EEE3B00B4 "TemplateParameter::_linkTemplate"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 36240F3800BE _unlink_body365EEE3B00B4 "TemplateParameter::_unlinkTemplate"
  public void _unlinkTemplate(ModelElement template1);
  // -end- 36240F3800BE _unlink_body365EEE3B00B4 "TemplateParameter::_unlinkTemplate"

  /** attaches a DefaultElement.
   *  
   *  @see #detachDefaultElement
   *  @see #getDefaultElement
   *  @see #containsDefaultElement
   */
  // -beg- preserve=no 365EEE830014 attach_head365EEE3B00B4 "TemplateParameter::attachDefaultElement"
  public void attachDefaultElement(ModelElement defaultElement1)
  // -end- 365EEE830014 attach_head365EEE3B00B4 "TemplateParameter::attachDefaultElement"
    ; // empty

  /** disconnect the currently attached DefaultElement.
   *  @see #attachDefaultElement
   */
  // -beg- preserve=no 365EEE830014 detach_head365EEE3B00B4 "TemplateParameter::detachDefaultElement"
  public ModelElement detachDefaultElement()
  // -end- 365EEE830014 detach_head365EEE3B00B4 "TemplateParameter::detachDefaultElement"
    ; // empty

  /** get the currently attached DefaultElement.
   *  @see #attachDefaultElement
   */
  // -beg- preserve=no 365EEE830014 get_head365EEE3B00B4 "TemplateParameter::getDefaultElement"
  public ModelElement getDefaultElement()
  // -end- 365EEE830014 get_head365EEE3B00B4 "TemplateParameter::getDefaultElement"
    ; // empty

  /** tests if there is a DefaultElement attached.
   *  @see #attachDefaultElement
   */
  // -beg- preserve=no 365EEE830014 test_head365EEE3B00B4 "TemplateParameter::containsDefaultElement"
  public boolean containsDefaultElement()
  // -end- 365EEE830014 test_head365EEE3B00B4 "TemplateParameter::containsDefaultElement"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 365EEE830014 _link_body365EEE3B00B4 "TemplateParameter::_linkDefaultElement"
  public void _linkDefaultElement(ModelElement defaultElement1);
  // -end- 365EEE830014 _link_body365EEE3B00B4 "TemplateParameter::_linkDefaultElement"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 365EEE830014 _unlink_body365EEE3B00B4 "TemplateParameter::_unlinkDefaultElement"
  public void _unlinkDefaultElement(ModelElement defaultElement1);
  // -end- 365EEE830014 _unlink_body365EEE3B00B4 "TemplateParameter::_unlinkDefaultElement"

  /** attaches a Parameter.
   *  
   *  @see #detachParameter
   *  @see #getParameter
   *  @see #containsParameter
   */
  // -beg- preserve=no 3C35CEAC02F1 attach_head365EEE3B00B4 "TemplateParameter::attachParameter"
  public void attachParameter(ModelElement parameter1)
  // -end- 3C35CEAC02F1 attach_head365EEE3B00B4 "TemplateParameter::attachParameter"
    ; // empty

  /** disconnect the currently attached Parameter.
   *  @see #attachParameter
   */
  // -beg- preserve=no 3C35CEAC02F1 detach_head365EEE3B00B4 "TemplateParameter::detachParameter"
  public ModelElement detachParameter()
  // -end- 3C35CEAC02F1 detach_head365EEE3B00B4 "TemplateParameter::detachParameter"
    ; // empty

  /** get the currently attached Parameter.
   *  @see #attachParameter
   */
  // -beg- preserve=no 3C35CEAC02F1 get_head365EEE3B00B4 "TemplateParameter::getParameter"
  public ModelElement getParameter()
  // -end- 3C35CEAC02F1 get_head365EEE3B00B4 "TemplateParameter::getParameter"
    ; // empty

  /** tests if there is a Parameter attached.
   *  @see #attachParameter
   */
  // -beg- preserve=no 3C35CEAC02F1 test_head365EEE3B00B4 "TemplateParameter::containsParameter"
  public boolean containsParameter()
  // -end- 3C35CEAC02F1 test_head365EEE3B00B4 "TemplateParameter::containsParameter"
    ; // empty

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 365EEE3B00B4 detail_end "TemplateParameter"

  // -end- 365EEE3B00B4 detail_end "TemplateParameter"

}

=======
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 365EEE3B00B4 detail_begin "TemplateParameter"

// -end- 365EEE3B00B4 detail_begin "TemplateParameter"

/** attaches a Template.
 *
 *  @see #detachTemplate
 *  @see #getTemplate
 *  @see #containsTemplate
 */
// -beg- preserve=no 36240F3800BE attach_head365EEE3B00B4 "TemplateParameter::attachTemplate"
public void attachTemplate(ModelElement template1)
// -end- 36240F3800BE attach_head365EEE3B00B4 "TemplateParameter::attachTemplate"
;     // empty

/** disconnect the currently attached Template.
 *  @see #attachTemplate
 */
// -beg- preserve=no 36240F3800BE detach_head365EEE3B00B4 "TemplateParameter::detachTemplate"
public ModelElement detachTemplate()
// -end- 36240F3800BE detach_head365EEE3B00B4 "TemplateParameter::detachTemplate"
;     // empty

/** get the currently attached Template.
 *  @see #attachTemplate
 */
// -beg- preserve=no 36240F3800BE get_head365EEE3B00B4 "TemplateParameter::getTemplate"
public ModelElement getTemplate()
// -end- 36240F3800BE get_head365EEE3B00B4 "TemplateParameter::getTemplate"
;     // empty

/** tests if there is a Template attached.
 *  @see #attachTemplate
 */
// -beg- preserve=no 36240F3800BE test_head365EEE3B00B4 "TemplateParameter::containsTemplate"
public boolean containsTemplate()
// -end- 36240F3800BE test_head365EEE3B00B4 "TemplateParameter::containsTemplate"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240F3800BE _link_body365EEE3B00B4 "TemplateParameter::_linkTemplate"
public void _linkTemplate(ModelElement template1);
// -end- 36240F3800BE _link_body365EEE3B00B4 "TemplateParameter::_linkTemplate"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36240F3800BE _unlink_body365EEE3B00B4 "TemplateParameter::_unlinkTemplate"
public void _unlinkTemplate(ModelElement template1);
// -end- 36240F3800BE _unlink_body365EEE3B00B4 "TemplateParameter::_unlinkTemplate"

/** attaches a DefaultElement.
 *
 *  @see #detachDefaultElement
 *  @see #getDefaultElement
 *  @see #containsDefaultElement
 */
// -beg- preserve=no 365EEE830014 attach_head365EEE3B00B4 "TemplateParameter::attachDefaultElement"
public void attachDefaultElement(ModelElement defaultElement1)
// -end- 365EEE830014 attach_head365EEE3B00B4 "TemplateParameter::attachDefaultElement"
;     // empty

/** disconnect the currently attached DefaultElement.
 *  @see #attachDefaultElement
 */
// -beg- preserve=no 365EEE830014 detach_head365EEE3B00B4 "TemplateParameter::detachDefaultElement"
public ModelElement detachDefaultElement()
// -end- 365EEE830014 detach_head365EEE3B00B4 "TemplateParameter::detachDefaultElement"
;     // empty

/** get the currently attached DefaultElement.
 *  @see #attachDefaultElement
 */
// -beg- preserve=no 365EEE830014 get_head365EEE3B00B4 "TemplateParameter::getDefaultElement"
public ModelElement getDefaultElement()
// -end- 365EEE830014 get_head365EEE3B00B4 "TemplateParameter::getDefaultElement"
;     // empty

/** tests if there is a DefaultElement attached.
 *  @see #attachDefaultElement
 */
// -beg- preserve=no 365EEE830014 test_head365EEE3B00B4 "TemplateParameter::containsDefaultElement"
public boolean containsDefaultElement()
// -end- 365EEE830014 test_head365EEE3B00B4 "TemplateParameter::containsDefaultElement"
;     // empty

/** DONT USE; link management internal
 */
// -beg- preserve=no 365EEE830014 _link_body365EEE3B00B4 "TemplateParameter::_linkDefaultElement"
public void _linkDefaultElement(ModelElement defaultElement1);
// -end- 365EEE830014 _link_body365EEE3B00B4 "TemplateParameter::_linkDefaultElement"

/** DONT USE; link management internal
 */
// -beg- preserve=no 365EEE830014 _unlink_body365EEE3B00B4 "TemplateParameter::_unlinkDefaultElement"
public void _unlinkDefaultElement(ModelElement defaultElement1);
// -end- 365EEE830014 _unlink_body365EEE3B00B4 "TemplateParameter::_unlinkDefaultElement"

/** attaches a Parameter.
 *
 *  @see #detachParameter
 *  @see #getParameter
 *  @see #containsParameter
 */
// -beg- preserve=no 3C35CEAC02F1 attach_head365EEE3B00B4 "TemplateParameter::attachParameter"
public void attachParameter(ModelElement parameter1)
// -end- 3C35CEAC02F1 attach_head365EEE3B00B4 "TemplateParameter::attachParameter"
;     // empty

/** disconnect the currently attached Parameter.
 *  @see #attachParameter
 */
// -beg- preserve=no 3C35CEAC02F1 detach_head365EEE3B00B4 "TemplateParameter::detachParameter"
public ModelElement detachParameter()
// -end- 3C35CEAC02F1 detach_head365EEE3B00B4 "TemplateParameter::detachParameter"
;     // empty

/** get the currently attached Parameter.
 *  @see #attachParameter
 */
// -beg- preserve=no 3C35CEAC02F1 get_head365EEE3B00B4 "TemplateParameter::getParameter"
public ModelElement getParameter()
// -end- 3C35CEAC02F1 get_head365EEE3B00B4 "TemplateParameter::getParameter"
;     // empty

/** tests if there is a Parameter attached.
 *  @see #attachParameter
 */
// -beg- preserve=no 3C35CEAC02F1 test_head365EEE3B00B4 "TemplateParameter::containsParameter"
public boolean containsParameter()
// -end- 3C35CEAC02F1 test_head365EEE3B00B4 "TemplateParameter::containsParameter"
;     // empty

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 365EEE3B00B4 detail_end "TemplateParameter"

// -end- 365EEE3B00B4 detail_end "TemplateParameter"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
