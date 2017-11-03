// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:16 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33CD73FB0168 package "ElementImport"
package ch.ehi.uml1_4.modelmanagement;
// -end- 33CD73FB0168 package "ElementImport"

<<<<<<< HEAD
// -beg- preserve=no 33CD73FB0168 autoimport "ElementImport"
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
import ch.ehi.basics.types.NlsString;
// -end- 33CD73FB0168 autoimport "ElementImport"
=======
import ch.ehi.basics.types.NlsString;
// -end- 33CD73FB0168 autoimport "ElementImport"
import ch.ehi.uml1_4.foundation.core.ModelElement;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33CD73FB0168 import "ElementImport"

// -end- 33CD73FB0168 import "ElementImport"

<<<<<<< HEAD
/** An element import defines the visibility and alias of a model element included in thenamespace within a package, as a result of the package importing another package.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:16 $
 */
public interface ElementImport extends java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33CD73FB0168 detail_begin "ElementImport"

  // -end- 33CD73FB0168 detail_begin "ElementImport"

  /** get current value of importedBy
   *  @see #setImportedBy
   */
  // -beg- preserve=no 33CD739B02DA link_get_head33CD73FB0168 "importedBy"
  public Package getImportedBy()
  // -end- 33CD739B02DA link_get_head33CD73FB0168 "importedBy"
    ; // empty
  /** set current value of importedBy
   *  @see #getImportedBy
   */
  // -beg- preserve=no 33CD739B02DA link_set_head33CD73FB0168 "importedBy"
  public void setImportedBy(Package value1)
  // -end- 33CD739B02DA link_set_head33CD73FB0168 "importedBy"
    ; // empty
  /** get current value of importedElement
   *  The namespace defined by a package is extended by modelelements in other, imported packages.
   *  @see #setImportedElement
   */
  // -beg- preserve=no 33CD739B0316 link_get_head33CD73FB0168 "importedElement"
  public ModelElement getImportedElement()
  // -end- 33CD739B0316 link_get_head33CD73FB0168 "importedElement"
    ; // empty
  /** set current value of importedElement
   *  @see #getImportedElement
   */
  // -beg- preserve=no 33CD739B0316 link_set_head33CD73FB0168 "importedElement"
  public void setImportedElement(ModelElement value1)
  // -end- 33CD739B0316 link_set_head33CD73FB0168 "importedElement"
    ; // empty
  /** get current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #setVisibility
   */
  // -beg- preserve=no 33CD741B0032 get_head33CD73FB0168 "visibility"
   int getVisibility()
  // -end- 33CD741B0032 get_head33CD73FB0168 "visibility"
    ; // empty
  /** set current value of visibility
   *  @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
   *  @see #getVisibility
   */
  // -beg- preserve=no 33CD741B0032 set_head33CD73FB0168 "visibility"
   void setVisibility(int value1)
  // -end- 33CD741B0032 set_head33CD73FB0168 "visibility"
    ; // empty
  /** get current value of alias
   *  @see #setAlias
   */
  // -beg- preserve=no 33CD74260168 get_head33CD73FB0168 "alias"
   NlsString getAlias()
  // -end- 33CD74260168 get_head33CD73FB0168 "alias"
    ; // empty
  /** set current value of alias
   *  @see #getAlias
   */
  // -beg- preserve=no 33CD74260168 set_head33CD73FB0168 "alias"
   void setAlias(NlsString value1)
  // -end- 33CD74260168 set_head33CD73FB0168 "alias"
    ; // empty
  /** get current value of isSpecification
   *  @see #setSpecification
   */
  // -beg- preserve=no 3A555D060399 get_head33CD73FB0168 "isSpecification"
   boolean isSpecification()
  // -end- 3A555D060399 get_head33CD73FB0168 "isSpecification"
    ; // empty
  /** set current value of isSpecification
   *  @see #isSpecification
   */
  // -beg- preserve=no 3A555D060399 set_head33CD73FB0168 "isSpecification"
   void setSpecification(boolean value1)
  // -end- 3A555D060399 set_head33CD73FB0168 "isSpecification"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33CD73FB0168 detail_end "ElementImport"

  // -end- 33CD73FB0168 detail_end "ElementImport"

}

=======
/**
 * An element import defines the visibility and alias of a model element
 * included in thenamespace within a package, as a result of the package
 * importing another package.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:16 $
 */
public interface ElementImport extends java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 33CD73FB0168 detail_begin "ElementImport"

	// -end- 33CD73FB0168 detail_begin "ElementImport"

	/**
	 * get current value of importedBy
	 * 
	 * @see #setImportedBy
	 */
	// -beg- preserve=no 33CD739B02DA link_get_head33CD73FB0168 "importedBy"
	public Package getImportedBy()
	// -end- 33CD739B02DA link_get_head33CD73FB0168 "importedBy"
	; // empty

	/**
	 * set current value of importedBy
	 * 
	 * @see #getImportedBy
	 */
	// -beg- preserve=no 33CD739B02DA link_set_head33CD73FB0168 "importedBy"
	public void setImportedBy(Package value1)
	// -end- 33CD739B02DA link_set_head33CD73FB0168 "importedBy"
	; // empty

	/**
	 * get current value of importedElement The namespace defined by a package
	 * is extended by modelelements in other, imported packages.
	 * 
	 * @see #setImportedElement
	 */
	// -beg- preserve=no 33CD739B0316 link_get_head33CD73FB0168
	// "importedElement"
	public ModelElement getImportedElement()
	// -end- 33CD739B0316 link_get_head33CD73FB0168 "importedElement"
	; // empty

	/**
	 * set current value of importedElement
	 * 
	 * @see #getImportedElement
	 */
	// -beg- preserve=no 33CD739B0316 link_set_head33CD73FB0168
	// "importedElement"
	public void setImportedElement(ModelElement value1)
	// -end- 33CD739B0316 link_set_head33CD73FB0168 "importedElement"
	; // empty

	/**
	 * get current value of visibility
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
	 * @see #setVisibility
	 */
	// -beg- preserve=no 33CD741B0032 get_head33CD73FB0168 "visibility"
	int getVisibility()
	// -end- 33CD741B0032 get_head33CD73FB0168 "visibility"
	; // empty

	/**
	 * set current value of visibility
	 * 
	 * @see ch.ehi.uml1_4.foundation.datatypes.VisibilityKind
	 * @see #getVisibility
	 */
	// -beg- preserve=no 33CD741B0032 set_head33CD73FB0168 "visibility"
	void setVisibility(int value1)
	// -end- 33CD741B0032 set_head33CD73FB0168 "visibility"
	; // empty

	/**
	 * get current value of alias
	 * 
	 * @see #setAlias
	 */
	// -beg- preserve=no 33CD74260168 get_head33CD73FB0168 "alias"
	NlsString getAlias()
	// -end- 33CD74260168 get_head33CD73FB0168 "alias"
	; // empty

	/**
	 * set current value of alias
	 * 
	 * @see #getAlias
	 */
	// -beg- preserve=no 33CD74260168 set_head33CD73FB0168 "alias"
	void setAlias(NlsString value1)
	// -end- 33CD74260168 set_head33CD73FB0168 "alias"
	; // empty

	/**
	 * get current value of isSpecification
	 * 
	 * @see #setSpecification
	 */
	// -beg- preserve=no 3A555D060399 get_head33CD73FB0168 "isSpecification"
	boolean isSpecification()
	// -end- 3A555D060399 get_head33CD73FB0168 "isSpecification"
	; // empty

	/**
	 * set current value of isSpecification
	 * 
	 * @see #isSpecification
	 */
	// -beg- preserve=no 3A555D060399 set_head33CD73FB0168 "isSpecification"
	void setSpecification(boolean value1)
	// -end- 3A555D060399 set_head33CD73FB0168 "isSpecification"
	; // empty
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 33CD73FB0168 detail_end "ElementImport"

	// -end- 33CD73FB0168 detail_end "ElementImport"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
