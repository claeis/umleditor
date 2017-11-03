// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:18 $
// $Revision: 1.1.1.1 $
//

<<<<<<< HEAD
          // -beg- preserve=no 3D78A46B00ED package "ChildFinderById"
package ch.ehi.uml1_4.tools;
          // -end- 3D78A46B00ED package "ChildFinderById"

          // -beg- preserve=no 3D78A46B00ED autoimport "ChildFinderById"
          import ch.ehi.basics.tools.AbstractVisitor;
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          // -end- 3D78A46B00ED autoimport "ChildFinderById"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3D78A46B00ED import "ChildFinderById"

          // -end- 3D78A46B00ED import "ChildFinderById"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:18 $
           */
public class ChildFinderById extends AbstractVisitor
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=yes 3D78A46B00ED detail_begin "ChildFinderById"
  String id;
  AbstractEditorElement found;
            // -end- 3D78A46B00ED detail_begin "ChildFinderById"

            // -beg- preserve=no 3D78A4BA037B head3D78A46B00ED "defaultVisit"
            public void defaultVisit(java.lang.Object object)
            // -end- 3D78A4BA037B head3D78A46B00ED "defaultVisit"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D78A4BA037B throws3D78A46B00ED "defaultVisit"

              // -end- 3D78A4BA037B throws3D78A46B00ED "defaultVisit"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D78A4BA037B body3D78A46B00ED "defaultVisit"
    if(object instanceof AbstractEditorElement){
      AbstractEditorElement ele=(AbstractEditorElement)object;
      if(ele.getOid().equals(id)){
        found=ele;
      }
    }
              // -end- 3D78A4BA037B body3D78A46B00ED "defaultVisit"
              }

            // -beg- preserve=no 3D78A4BD02DF head3D78A46B00ED "ChildFinderById"
            public ChildFinderById(String id)
            // -end- 3D78A4BD02DF head3D78A46B00ED "ChildFinderById"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D78A4BD02DF throws3D78A46B00ED "ChildFinderById"

              // -end- 3D78A4BD02DF throws3D78A46B00ED "ChildFinderById"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D78A4BD02DF body3D78A46B00ED "ChildFinderById"
    this.id=id;
    found=null;
              // -end- 3D78A4BD02DF body3D78A46B00ED "ChildFinderById"
              }

            // -beg- preserve=no 3D78A52900AA head3D78A46B00ED "containsElement"
            public boolean containsElement()
            // -end- 3D78A52900AA head3D78A46B00ED "containsElement"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D78A52900AA throws3D78A46B00ED "containsElement"

              // -end- 3D78A52900AA throws3D78A46B00ED "containsElement"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D78A52900AA body3D78A46B00ED "containsElement"
    return found!=null;
              // -end- 3D78A52900AA body3D78A46B00ED "containsElement"
              }

            // -beg- preserve=no 3D78A5460369 head3D78A46B00ED "getElement"
            public AbstractEditorElement getElement()
            // -end- 3D78A5460369 head3D78A46B00ED "getElement"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D78A5460369 throws3D78A46B00ED "getElement"

              // -end- 3D78A5460369 throws3D78A46B00ED "getElement"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D78A5460369 body3D78A46B00ED "getElement"
    if(found==null){
      throw new java.lang.IllegalStateException("no Element with given id");
    }
    return found;
              // -end- 3D78A5460369 body3D78A46B00ED "getElement"
              }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D78A46B00ED detail_end "ChildFinderById"

            // -end- 3D78A46B00ED detail_end "ChildFinderById"

          }

=======
// -beg- preserve=no 3D78A46B00ED package "ChildFinderById"
package ch.ehi.uml1_4.tools;
// -end- 3D78A46B00ED package "ChildFinderById"

// -beg- preserve=no 3D78A46B00ED autoimport "ChildFinderById"
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
// -end- 3D78A46B00ED autoimport "ChildFinderById"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3D78A46B00ED import "ChildFinderById"

// -end- 3D78A46B00ED import "ChildFinderById"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:18 $
 */
public class ChildFinderById extends AbstractVisitor {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3D78A46B00ED detail_begin "ChildFinderById"
	String id;
	AbstractEditorElement found;
	// -end- 3D78A46B00ED detail_begin "ChildFinderById"

	// -beg- preserve=no 3D78A4BA037B head3D78A46B00ED "defaultVisit"
	public void defaultVisit(java.lang.Object object)
	// -end- 3D78A4BA037B head3D78A46B00ED "defaultVisit"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D78A4BA037B throws3D78A46B00ED "defaultVisit"

	// -end- 3D78A4BA037B throws3D78A46B00ED "defaultVisit"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D78A4BA037B body3D78A46B00ED "defaultVisit"
		if (object instanceof AbstractEditorElement) {
			AbstractEditorElement ele = (AbstractEditorElement) object;
			if (ele.getOid().equals(id)) {
				found = ele;
			}
		}
		// -end- 3D78A4BA037B body3D78A46B00ED "defaultVisit"
	}

	// -beg- preserve=no 3D78A4BD02DF head3D78A46B00ED "ChildFinderById"
	public ChildFinderById(String id)
	// -end- 3D78A4BD02DF head3D78A46B00ED "ChildFinderById"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D78A4BD02DF throws3D78A46B00ED "ChildFinderById"

	// -end- 3D78A4BD02DF throws3D78A46B00ED "ChildFinderById"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D78A4BD02DF body3D78A46B00ED "ChildFinderById"
		this.id = id;
		found = null;
		// -end- 3D78A4BD02DF body3D78A46B00ED "ChildFinderById"
	}

	// -beg- preserve=no 3D78A52900AA head3D78A46B00ED "containsElement"
	public boolean containsElement()
	// -end- 3D78A52900AA head3D78A46B00ED "containsElement"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D78A52900AA throws3D78A46B00ED "containsElement"

	// -end- 3D78A52900AA throws3D78A46B00ED "containsElement"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D78A52900AA body3D78A46B00ED "containsElement"
		return found != null;
		// -end- 3D78A52900AA body3D78A46B00ED "containsElement"
	}

	// -beg- preserve=no 3D78A5460369 head3D78A46B00ED "getElement"
	public AbstractEditorElement getElement()
	// -end- 3D78A5460369 head3D78A46B00ED "getElement"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D78A5460369 throws3D78A46B00ED "getElement"

	// -end- 3D78A5460369 throws3D78A46B00ED "getElement"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D78A5460369 body3D78A46B00ED "getElement"
		if (found == null) {
			throw new java.lang.IllegalStateException("no Element with given id");
		}
		return found;
		// -end- 3D78A5460369 body3D78A46B00ED "getElement"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3D78A46B00ED detail_end "ChildFinderById"

	// -end- 3D78A46B00ED detail_end "ChildFinderById"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
