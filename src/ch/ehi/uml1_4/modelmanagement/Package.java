// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:17 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327A5D19033E package "Package"
package ch.ehi.uml1_4.modelmanagement;
// -end- 327A5D19033E package "Package"

// -beg- preserve=no 327A5D19033E autoimport "Package"
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.modelmanagement.ElementImport;
import ch.ehi.uml1_4.foundation.core.PresentationElement;
// -end- 327A5D19033E autoimport "Package"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327A5D19033E import "Package"

// -end- 327A5D19033E import "Package"

/** A package is a grouping of model elements.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:17 $
 */
public interface Package extends GeneralizableElement , Namespace , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327A5D19033E detail_begin "Package"

  // -end- 327A5D19033E detail_begin "Package"

  /** add a ImportedElement.
   *  The namespace defined by a package is extended by modelelements in other, imported packages.
   *  @see #removeImportedElement
   *  @see #containsImportedElement
   *  @see #iteratorImportedElement
   *  @see #clearImportedElement
   *  @see #sizeImportedElement
   *  @see #iteratorImportedElementLink
   *  @see #createImportedElementLink
   *  @see #findImportedElementLink
   */
  // -beg- preserve=no 33CD739B02DA add_head327A5D19033E "Package::addImportedElement"
  public void addImportedElement(ModelElement importedElement1)
  // -end- 33CD739B02DA add_head327A5D19033E "Package::addImportedElement"
    ; // empty

  /** add a link to a ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA addlink_head327A5D19033E "Package::addImportedElementLink"
  public void addImportedElementLink(ElementImport importedElement1)
  // -end- 33CD739B02DA addlink_head327A5D19033E "Package::addImportedElementLink"
    ; // empty

  /** disconnect a ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA remove_head327A5D19033E "Package::removeImportedElement"
  public ModelElement removeImportedElement(ModelElement importedElement1)
  // -end- 33CD739B02DA remove_head327A5D19033E "Package::removeImportedElement"
    ; // empty

  /** tests if a given ImportedElement is connected.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA test_head327A5D19033E "Package::containsImportedElement"
  public boolean containsImportedElement(ModelElement importedElement1)
  // -end- 33CD739B02DA test_head327A5D19033E "Package::containsImportedElement"
    ; // empty

  /** used to enumerate all connected ImportedElements.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA get_all_head327A5D19033E "Package::iteratorImportedElement"
  public java.util.Iterator iteratorImportedElement()
  // -end- 33CD739B02DA get_all_head327A5D19033E "Package::iteratorImportedElement"
    ; // empty

  /** disconnect all ImportedElements.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA remove_all_head327A5D19033E "Package::clearImportedElement"
  public void clearImportedElement()
  // -end- 33CD739B02DA remove_all_head327A5D19033E "Package::clearImportedElement"
    ; // empty

  /** returns the number of ImportedElements.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA size_head327A5D19033E "Package::sizeImportedElement"
  public int sizeImportedElement()
  // -end- 33CD739B02DA size_head327A5D19033E "Package::sizeImportedElement"
    ; // empty

  /** enumerate the link objects of currently connected ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA itlink_head327A5D19033E "Package::getImportedElementLink"
  public java.util.Iterator iteratorImportedElementLink()
  // -end- 33CD739B02DA itlink_head327A5D19033E "Package::getImportedElementLink"
    ; // empty

  /** create a link class for a new link to a ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA createlink_head327A5D19033E "Package::createImportedElementLink"
  public ElementImport createImportedElementLink()
  // -end- 33CD739B02DA createlink_head327A5D19033E "Package::createImportedElementLink"
    ; // empty

  /** find a link object for a given ImportedElement.
   *  @see #addImportedElement
   */
  // -beg- preserve=no 33CD739B02DA find_head327A5D19033E "Package::findImportedElementLink"
  public ElementImport findImportedElementLink(ModelElement importedElement1)
  // -end- 33CD739B02DA find_head327A5D19033E "Package::findImportedElementLink"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD739B02DA _link_body327A5D19033E "Package::_linkImportedElement"
  public void _linkImportedElement(ElementImport importedElement1);
  // -end- 33CD739B02DA _link_body327A5D19033E "Package::_linkImportedElement"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 33CD739B02DA _unlink_body327A5D19033E "Package::_unlinkImportedElement"
  public void _unlinkImportedElement(ElementImport importedElement1);
  // -end- 33CD739B02DA _unlink_body327A5D19033E "Package::_unlinkImportedElement"

  /** add a Presentation.
   *  
   *  @see #removePresentation
   *  @see #containsPresentation
   *  @see #iteratorPresentation
   *  @see #clearPresentation
   *  @see #sizePresentation
   */
  // -beg- preserve=no 362409A9000A add_head327A5D19033E "ModelElement::addPresentation"
  public void addPresentation(PresentationElement presentation1)
  // -end- 362409A9000A add_head327A5D19033E "ModelElement::addPresentation"
    ; // empty

  /** disconnect a Presentation.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_head327A5D19033E "ModelElement::removePresentation"
  public PresentationElement removePresentation(PresentationElement presentation1)
  // -end- 362409A9000A remove_head327A5D19033E "ModelElement::removePresentation"
    ; // empty

  /** tests if a given Presentation is connected.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A test_head327A5D19033E "ModelElement::containsPresentation"
  public boolean containsPresentation(PresentationElement presentation1)
  // -end- 362409A9000A test_head327A5D19033E "ModelElement::containsPresentation"
    ; // empty

  /** used to enumerate all connected Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A get_all_head327A5D19033E "ModelElement::iteratorPresentation"
  public java.util.Iterator iteratorPresentation()
  // -end- 362409A9000A get_all_head327A5D19033E "ModelElement::iteratorPresentation"
    ; // empty

  /** disconnect all Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A remove_all_head327A5D19033E "ModelElement::clearPresentation"
  public void clearPresentation()
  // -end- 362409A9000A remove_all_head327A5D19033E "ModelElement::clearPresentation"
    ; // empty

  /** returns the number of Presentations.
   *  @see #addPresentation
   */
  // -beg- preserve=no 362409A9000A size_head327A5D19033E "ModelElement::sizePresentation"
  public int sizePresentation()
  // -end- 362409A9000A size_head327A5D19033E "ModelElement::sizePresentation"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _link_body327A5D19033E "ModelElement::_linkPresentation"
  public void _linkPresentation(PresentationElement presentation1);
  // -end- 362409A9000A _link_body327A5D19033E "ModelElement::_linkPresentation"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A9000A _unlink_body327A5D19033E "ModelElement::_unlinkPresentation"
  public void _unlinkPresentation(PresentationElement presentation1);
  // -end- 362409A9000A _unlink_body327A5D19033E "ModelElement::_unlinkPresentation"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327A5D19033E detail_end "Package"

  // -end- 327A5D19033E detail_end "Package"

}

