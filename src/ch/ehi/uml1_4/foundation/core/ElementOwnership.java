// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:28 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33D120EF019A package "ElementOwnership"
package ch.ehi.uml1_4.foundation.core;
// -end- 33D120EF019A package "ElementOwnership"

// -beg- preserve=no 33D120EF019A autoimport "ElementOwnership"
import java.io.Serializable;
<<<<<<< HEAD
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 33D120EF019A autoimport "ElementOwnership"
=======
import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 33D120EF019A autoimport "ElementOwnership"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33D120EF019A import "ElementOwnership"

// -end- 33D120EF019A import "ElementOwnership"

/** Element ownership defines the visibility of a ModelElement contained in a Namespace.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:28 $
 */
public class ElementOwnership extends AbstractEditorElement implements Serializable
{
<<<<<<< HEAD
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33D120EF019A detail_begin "ElementOwnership"

  // -end- 33D120EF019A detail_begin "ElementOwnership"

  // -beg- preserve=no 33598CAA030D link_var33D120EF019A "namespace"
  private Namespace namespace;
  // -end- 33598CAA030D link_var33D120EF019A "namespace"

  /** get current value of namespace
   *  Designates the Namespace that contains the ModelElement.
   *  @see #setNamespace
   */
  // -beg- preserve=no 33598CAA030D link_get_head33D120EF019A "namespace"
  public Namespace getNamespace()
  // -end- 33598CAA030D link_get_head33D120EF019A "namespace"
  {
    // -beg- preserve=no 33598CAA030D link_get_body33D120EF019A "namespace"
    return namespace;
    // -end- 33598CAA030D link_get_body33D120EF019A "namespace"
  }

  /** set current value of namespace
   *  @see #getNamespace
   */
  // -beg- preserve=no 33598CAA030D link_set_head33D120EF019A "namespace"
  public void setNamespace(Namespace value1)
  // -end- 33598CAA030D link_set_head33D120EF019A "namespace"
  {
    // -beg- preserve=no 33598CAA030D link_set_body33D120EF019A "namespace"
    namespace = value1;
    
    // -end- 33598CAA030D link_set_body33D120EF019A "namespace"
  }

  // -beg- preserve=no 33598CAA030E link_var33D120EF019A "ownedElement"
  private ModelElement ownedElement;
  // -end- 33598CAA030E link_var33D120EF019A "ownedElement"

  /** get current value of ownedElement
   *  A set of ModelElementsowned by the Namespace.
   *  @see #setOwnedElement
   */
  // -beg- preserve=no 33598CAA030E link_get_head33D120EF019A "ownedElement"
  public ModelElement getOwnedElement()
  // -end- 33598CAA030E link_get_head33D120EF019A "ownedElement"
  {
    // -beg- preserve=no 33598CAA030E link_get_body33D120EF019A "ownedElement"
    return ownedElement;
    // -end- 33598CAA030E link_get_body33D120EF019A "ownedElement"
  }

  /** set current value of ownedElement
   *  @see #getOwnedElement
   */
  // -beg- preserve=no 33598CAA030E link_set_head33D120EF019A "ownedElement"
  public void setOwnedElement(ModelElement value1)
  // -end- 33598CAA030E link_set_head33D120EF019A "ownedElement"
  {
    // -beg- preserve=no 33598CAA030E link_set_body33D120EF019A "ownedElement"
    ownedElement = value1;
    
    // -end- 33598CAA030E link_set_body33D120EF019A "ownedElement"
  }

  // -beg- preserve=no 3D4FA2170378 head33D120EF019A "unlinkAll"
  public void unlinkAll()
  // -end- 3D4FA2170378 head33D120EF019A "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA2170378 throws33D120EF019A "unlinkAll"

    // -end- 3D4FA2170378 throws33D120EF019A "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA2170378 body33D120EF019A "unlinkAll"
    
    super.unlinkAll();
    // -end- 3D4FA2170378 body33D120EF019A "unlinkAll"
    }

  // -beg- preserve=no 3D4FA2170382 head33D120EF019A "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 3D4FA2170382 head33D120EF019A "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA2170382 throws33D120EF019A "enumerateChildren"

    // -end- 3D4FA2170382 throws33D120EF019A "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 3D4FA2170382 body33D120EF019A "enumerateChildren"
    java.util.Iterator it=null;
    super.enumerateChildren(visitor);
    // -end- 3D4FA2170382 body33D120EF019A "enumerateChildren"
    }

  // -beg- preserve=no 33D12106005A var33D120EF019A "visibility"
  private int visibility;
  // -end- 33D12106005A var33D120EF019A "visibility"

  /** get current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #setVisibility
   */
  // -beg- preserve=no 33D12106005A get_head33D120EF019A "visibility"
  public  int getVisibility()
  // -end- 33D12106005A get_head33D120EF019A "visibility"
  {
    // -beg- preserve=no 33D12106005A get_body33D120EF019A "visibility"
    return visibility;
    // -end- 33D12106005A get_body33D120EF019A "visibility"
  }

  /** set current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #getVisibility
   */
  // -beg- preserve=no 33D12106005A set_head33D120EF019A "visibility"
  public  void setVisibility(int value1)
  // -end- 33D12106005A set_head33D120EF019A "visibility"
  {
    // -beg- preserve=no 33D12106005A set_body33D120EF019A "visibility"
    if(visibility != value1){
      visibility = value1;
      
    }
    // -end- 33D12106005A set_body33D120EF019A "visibility"
  }

  // -beg- preserve=no 36F204960000 var33D120EF019A "isSpecification"
  private boolean isSpecification;
  // -end- 36F204960000 var33D120EF019A "isSpecification"

  /** get current value of isSpecification
   *  @see #setSpecification
   */
  // -beg- preserve=no 36F204960000 get_head33D120EF019A "isSpecification"
  public  boolean isSpecification()
  // -end- 36F204960000 get_head33D120EF019A "isSpecification"
  {
    // -beg- preserve=no 36F204960000 get_body33D120EF019A "isSpecification"
    return isSpecification;
    // -end- 36F204960000 get_body33D120EF019A "isSpecification"
  }

  /** set current value of isSpecification
   *  @see #isSpecification
   */
  // -beg- preserve=no 36F204960000 set_head33D120EF019A "isSpecification"
  public  void setSpecification(boolean value1)
  // -end- 36F204960000 set_head33D120EF019A "isSpecification"
  {
    // -beg- preserve=no 36F204960000 set_body33D120EF019A "isSpecification"
    if(isSpecification != value1){
      isSpecification = value1;
      
    }
    // -end- 36F204960000 set_body33D120EF019A "isSpecification"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33D120EF019A detail_end "ElementOwnership"

  // -end- 33D120EF019A detail_end "ElementOwnership"

}

=======
	private static final long serialVersionUID = 5681315811383362785L;
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33D120EF019A detail_begin "ElementOwnership"

// -end- 33D120EF019A detail_begin "ElementOwnership"

// -beg- preserve=no 33598CAA030D link_var33D120EF019A "namespace"
private Namespace namespace;
// -end- 33598CAA030D link_var33D120EF019A "namespace"

/** get current value of namespace
 *  Designates the Namespace that contains the ModelElement.
 *  @see #setNamespace
 */
// -beg- preserve=no 33598CAA030D link_get_head33D120EF019A "namespace"
public Namespace getNamespace()
// -end- 33598CAA030D link_get_head33D120EF019A "namespace"
{
        // -beg- preserve=no 33598CAA030D link_get_body33D120EF019A "namespace"
        return namespace;
        // -end- 33598CAA030D link_get_body33D120EF019A "namespace"
}

/** set current value of namespace
 *  @see #getNamespace
 */
// -beg- preserve=no 33598CAA030D link_set_head33D120EF019A "namespace"
public void setNamespace(Namespace value1)
// -end- 33598CAA030D link_set_head33D120EF019A "namespace"
{
        // -beg- preserve=no 33598CAA030D link_set_body33D120EF019A "namespace"
        namespace = value1;

        // -end- 33598CAA030D link_set_body33D120EF019A "namespace"
}

// -beg- preserve=no 33598CAA030E link_var33D120EF019A "ownedElement"
private ModelElement ownedElement;
// -end- 33598CAA030E link_var33D120EF019A "ownedElement"

/** get current value of ownedElement
 *  A set of ModelElementsowned by the Namespace.
 *  @see #setOwnedElement
 */
// -beg- preserve=no 33598CAA030E link_get_head33D120EF019A "ownedElement"
public ModelElement getOwnedElement()
// -end- 33598CAA030E link_get_head33D120EF019A "ownedElement"
{
        // -beg- preserve=no 33598CAA030E link_get_body33D120EF019A "ownedElement"
        return ownedElement;
        // -end- 33598CAA030E link_get_body33D120EF019A "ownedElement"
}

/** set current value of ownedElement
 *  @see #getOwnedElement
 */
// -beg- preserve=no 33598CAA030E link_set_head33D120EF019A "ownedElement"
public void setOwnedElement(ModelElement value1)
// -end- 33598CAA030E link_set_head33D120EF019A "ownedElement"
{
        // -beg- preserve=no 33598CAA030E link_set_body33D120EF019A "ownedElement"
        ownedElement = value1;

        // -end- 33598CAA030E link_set_body33D120EF019A "ownedElement"
}

// -beg- preserve=no 3D4FA2170378 head33D120EF019A "unlinkAll"
public void unlinkAll()
// -end- 3D4FA2170378 head33D120EF019A "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2170378 throws33D120EF019A "unlinkAll"

// -end- 3D4FA2170378 throws33D120EF019A "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2170378 body33D120EF019A "unlinkAll"

        super.unlinkAll();
        // -end- 3D4FA2170378 body33D120EF019A "unlinkAll"
}

// -beg- preserve=no 3D4FA2170382 head33D120EF019A "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2170382 head33D120EF019A "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2170382 throws33D120EF019A "enumerateChildren"

// -end- 3D4FA2170382 throws33D120EF019A "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2170382 body33D120EF019A "enumerateChildren"
        Iterator<?> it=null;
        super.enumerateChildren(visitor);
        // -end- 3D4FA2170382 body33D120EF019A "enumerateChildren"
}

// -beg- preserve=no 33D12106005A var33D120EF019A "visibility"
private int visibility;
// -end- 33D12106005A var33D120EF019A "visibility"

/** get current value of visibility
 *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
 *  @see #setVisibility
 */
// -beg- preserve=no 33D12106005A get_head33D120EF019A "visibility"
public int getVisibility()
// -end- 33D12106005A get_head33D120EF019A "visibility"
{
        // -beg- preserve=no 33D12106005A get_body33D120EF019A "visibility"
        return visibility;
        // -end- 33D12106005A get_body33D120EF019A "visibility"
}

/** set current value of visibility
 *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
 *  @see #getVisibility
 */
// -beg- preserve=no 33D12106005A set_head33D120EF019A "visibility"
public void setVisibility(int value1)
// -end- 33D12106005A set_head33D120EF019A "visibility"
{
        // -beg- preserve=no 33D12106005A set_body33D120EF019A "visibility"
        if(visibility != value1) {
                visibility = value1;

        }
        // -end- 33D12106005A set_body33D120EF019A "visibility"
}

// -beg- preserve=no 36F204960000 var33D120EF019A "isSpecification"
private boolean isSpecification;
// -end- 36F204960000 var33D120EF019A "isSpecification"

/** get current value of isSpecification
 *  @see #setSpecification
 */
// -beg- preserve=no 36F204960000 get_head33D120EF019A "isSpecification"
public boolean isSpecification()
// -end- 36F204960000 get_head33D120EF019A "isSpecification"
{
        // -beg- preserve=no 36F204960000 get_body33D120EF019A "isSpecification"
        return isSpecification;
        // -end- 36F204960000 get_body33D120EF019A "isSpecification"
}

/** set current value of isSpecification
 *  @see #isSpecification
 */
// -beg- preserve=no 36F204960000 set_head33D120EF019A "isSpecification"
public void setSpecification(boolean value1)
// -end- 36F204960000 set_head33D120EF019A "isSpecification"
{
        // -beg- preserve=no 36F204960000 set_body33D120EF019A "isSpecification"
        if(isSpecification != value1) {
                isSpecification = value1;

        }
        // -end- 36F204960000 set_body33D120EF019A "isSpecification"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 33D120EF019A detail_end "ElementOwnership"

// -end- 33D120EF019A detail_end "ElementOwnership"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
