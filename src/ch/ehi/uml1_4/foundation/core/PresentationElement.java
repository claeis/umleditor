// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:41 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327A5C8800A0 package "PresentationElement"
package ch.ehi.uml1_4.foundation.core;
// -end- 327A5C8800A0 package "PresentationElement"

// -beg- preserve=no 327A5C8800A0 autoimport "PresentationElement"
import ch.ehi.uml1_4.foundation.core.Element;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.umleditor.umlpresentation.PresentationEdge;
// -end- 327A5C8800A0 autoimport "PresentationElement"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327A5C8800A0 import "PresentationElement"

// -end- 327A5C8800A0 import "PresentationElement"

/** A presentation element is a textual or graphical presentation of one or more model elements.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:41 $
 */
public interface PresentationElement extends Element , java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327A5C8800A0 detail_begin "PresentationElement"

  // -end- 327A5C8800A0 detail_begin "PresentationElement"

  /** add a Subject.
   *  
   *  @see #removeSubject
   *  @see #containsSubject
   *  @see #iteratorSubject
   *  @see #clearSubject
   *  @see #sizeSubject
   */
  // -beg- preserve=no 362409A803C0 add_head327A5C8800A0 "PresentationElement::addSubject"
  public void addSubject(ModelElement subject1)
  // -end- 362409A803C0 add_head327A5C8800A0 "PresentationElement::addSubject"
    ; // empty

  /** disconnect a Subject.
   *  @see #addSubject
   */
  // -beg- preserve=no 362409A803C0 remove_head327A5C8800A0 "PresentationElement::removeSubject"
  public ModelElement removeSubject(ModelElement subject1)
  // -end- 362409A803C0 remove_head327A5C8800A0 "PresentationElement::removeSubject"
    ; // empty

  /** tests if a given Subject is connected.
   *  @see #addSubject
   */
  // -beg- preserve=no 362409A803C0 test_head327A5C8800A0 "PresentationElement::containsSubject"
  public boolean containsSubject(ModelElement subject1)
  // -end- 362409A803C0 test_head327A5C8800A0 "PresentationElement::containsSubject"
    ; // empty

  /** used to enumerate all connected Subjects.
   *  @see #addSubject
   */
  // -beg- preserve=no 362409A803C0 get_all_head327A5C8800A0 "PresentationElement::iteratorSubject"
  public java.util.Iterator iteratorSubject()
  // -end- 362409A803C0 get_all_head327A5C8800A0 "PresentationElement::iteratorSubject"
    ; // empty

  /** disconnect all Subjects.
   *  @see #addSubject
   */
  // -beg- preserve=no 362409A803C0 remove_all_head327A5C8800A0 "PresentationElement::clearSubject"
  public void clearSubject()
  // -end- 362409A803C0 remove_all_head327A5C8800A0 "PresentationElement::clearSubject"
    ; // empty

  /** returns the number of Subjects.
   *  @see #addSubject
   */
  // -beg- preserve=no 362409A803C0 size_head327A5C8800A0 "PresentationElement::sizeSubject"
  public int sizeSubject()
  // -end- 362409A803C0 size_head327A5C8800A0 "PresentationElement::sizeSubject"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A803C0 _link_body327A5C8800A0 "PresentationElement::_linkSubject"
  public void _linkSubject(ModelElement subject1);
  // -end- 362409A803C0 _link_body327A5C8800A0 "PresentationElement::_linkSubject"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 362409A803C0 _unlink_body327A5C8800A0 "PresentationElement::_unlinkSubject"
  public void _unlinkSubject(ModelElement subject1);
  // -end- 362409A803C0 _unlink_body327A5C8800A0 "PresentationElement::_unlinkSubject"

  /** attaches a Diagram.
   *  
   *  @see #detachDiagram
   *  @see #getDiagram
   *  @see #containsDiagram
   */
  // -beg- preserve=no 3C2C4C9F0169 attach_head327A5C8800A0 "PresentationElement::attachDiagram"
  public void attachDiagram(Diagram diagram1)
  // -end- 3C2C4C9F0169 attach_head327A5C8800A0 "PresentationElement::attachDiagram"
    ; // empty

  /** disconnect the currently attached Diagram.
   *  @see #attachDiagram
   */
  // -beg- preserve=no 3C2C4C9F0169 detach_head327A5C8800A0 "PresentationElement::detachDiagram"
  public Diagram detachDiagram()
  // -end- 3C2C4C9F0169 detach_head327A5C8800A0 "PresentationElement::detachDiagram"
    ; // empty

  /** get the currently attached Diagram.
   *  @see #attachDiagram
   */
  // -beg- preserve=no 3C2C4C9F0169 get_head327A5C8800A0 "PresentationElement::getDiagram"
  public Diagram getDiagram()
  // -end- 3C2C4C9F0169 get_head327A5C8800A0 "PresentationElement::getDiagram"
    ; // empty

  /** tests if there is a Diagram attached.
   *  @see #attachDiagram
   */
  // -beg- preserve=no 3C2C4C9F0169 test_head327A5C8800A0 "PresentationElement::containsDiagram"
  public boolean containsDiagram()
  // -end- 3C2C4C9F0169 test_head327A5C8800A0 "PresentationElement::containsDiagram"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3C2C4C9F0169 _link_body327A5C8800A0 "PresentationElement::_linkDiagram"
  public void _linkDiagram(Diagram diagram1);
  // -end- 3C2C4C9F0169 _link_body327A5C8800A0 "PresentationElement::_linkDiagram"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3C2C4C9F0169 _unlink_body327A5C8800A0 "PresentationElement::_unlinkDiagram"
  public void _unlinkDiagram(Diagram diagram1);
  // -end- 3C2C4C9F0169 _unlink_body327A5C8800A0 "PresentationElement::_unlinkDiagram"

  /** add a PresentationEdge.
   *  
   *  @see #removePresentationEdge
   *  @see #containsPresentationEdge
   *  @see #iteratorPresentationEdge
   *  @see #clearPresentationEdge
   *  @see #sizePresentationEdge
   */
  // -beg- preserve=no 3C2C49E3019E add_head327A5C8800A0 "PresentationElement::addPresentationEdge"
  public void addPresentationEdge(PresentationEdge presentationEdge1)
  // -end- 3C2C49E3019E add_head327A5C8800A0 "PresentationElement::addPresentationEdge"
    ; // empty

  /** disconnect a PresentationEdge.
   *  @see #addPresentationEdge
   */
  // -beg- preserve=no 3C2C49E3019E remove_head327A5C8800A0 "PresentationElement::removePresentationEdge"
  public PresentationEdge removePresentationEdge(PresentationEdge presentationEdge1)
  // -end- 3C2C49E3019E remove_head327A5C8800A0 "PresentationElement::removePresentationEdge"
    ; // empty

  /** tests if a given PresentationEdge is connected.
   *  @see #addPresentationEdge
   */
  // -beg- preserve=no 3C2C49E3019E test_head327A5C8800A0 "PresentationElement::containsPresentationEdge"
  public boolean containsPresentationEdge(PresentationEdge presentationEdge1)
  // -end- 3C2C49E3019E test_head327A5C8800A0 "PresentationElement::containsPresentationEdge"
    ; // empty

  /** used to enumerate all connected PresentationEdges.
   *  @see #addPresentationEdge
   */
  // -beg- preserve=no 3C2C49E3019E get_all_head327A5C8800A0 "PresentationElement::iteratorPresentationEdge"
  public java.util.Iterator iteratorPresentationEdge()
  // -end- 3C2C49E3019E get_all_head327A5C8800A0 "PresentationElement::iteratorPresentationEdge"
    ; // empty

  /** disconnect all PresentationEdges.
   *  @see #addPresentationEdge
   */
  // -beg- preserve=no 3C2C49E3019E remove_all_head327A5C8800A0 "PresentationElement::clearPresentationEdge"
  public void clearPresentationEdge()
  // -end- 3C2C49E3019E remove_all_head327A5C8800A0 "PresentationElement::clearPresentationEdge"
    ; // empty

  /** returns the number of PresentationEdges.
   *  @see #addPresentationEdge
   */
  // -beg- preserve=no 3C2C49E3019E size_head327A5C8800A0 "PresentationElement::sizePresentationEdge"
  public int sizePresentationEdge()
  // -end- 3C2C49E3019E size_head327A5C8800A0 "PresentationElement::sizePresentationEdge"
    ; // empty

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3C2C49E3019E _link_body327A5C8800A0 "PresentationElement::_linkPresentationEdge"
  public void _linkPresentationEdge(PresentationEdge presentationEdge1);
  // -end- 3C2C49E3019E _link_body327A5C8800A0 "PresentationElement::_linkPresentationEdge"

  /** DONT USE; link management internal
   */
  // -beg- preserve=no 3C2C49E3019E _unlink_body327A5C8800A0 "PresentationElement::_unlinkPresentationEdge"
  public void _unlinkPresentationEdge(PresentationEdge presentationEdge1);
  // -end- 3C2C49E3019E _unlink_body327A5C8800A0 "PresentationElement::_unlinkPresentationEdge"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 327A5C8800A0 detail_end "PresentationElement"

  // -end- 327A5C8800A0 detail_end "PresentationElement"

}

