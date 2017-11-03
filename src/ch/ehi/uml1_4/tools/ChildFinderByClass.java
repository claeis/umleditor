// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:17 $
// $Revision: 1.1.1.1 $
//

<<<<<<< HEAD
          // -beg- preserve=no 3D9D5EA30035 package "ChildFinderByClass"
package ch.ehi.uml1_4.tools;
          // -end- 3D9D5EA30035 package "ChildFinderByClass"

          // -beg- preserve=no 3D9D5EA30035 autoimport "ChildFinderByClass"
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3D9D5EA30035 autoimport "ChildFinderByClass"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3D9D5EA30035 import "ChildFinderByClass"

          // -end- 3D9D5EA30035 import "ChildFinderByClass"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:17 $
           */
public class ChildFinderByClass extends AbstractVisitor
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=yes 3D9D5EA30035 detail_begin "ChildFinderByClass"
  Class aclass=null;
  java.util.Set foundElements=new java.util.HashSet();

            // -end- 3D9D5EA30035 detail_begin "ChildFinderByClass"

            // -beg- preserve=no 3D9D5EC90089 head3D9D5EA30035 "defaultVisit"
            public void defaultVisit(java.lang.Object object)
            // -end- 3D9D5EC90089 head3D9D5EA30035 "defaultVisit"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D9D5EC90089 throws3D9D5EA30035 "defaultVisit"

              // -end- 3D9D5EC90089 throws3D9D5EA30035 "defaultVisit"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D9D5EC90089 body3D9D5EA30035 "defaultVisit"
    if(aclass.isAssignableFrom(object.getClass())){
      foundElements.add(object);
    }
    return;
              // -end- 3D9D5EC90089 body3D9D5EA30035 "defaultVisit"
              }

            // -beg- preserve=no 3D9D5ECB00BE head3D9D5EA30035 "ChildFinderByClass"
            public ChildFinderByClass(java.lang.Class aclass)
            // -end- 3D9D5ECB00BE head3D9D5EA30035 "ChildFinderByClass"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D9D5ECB00BE throws3D9D5EA30035 "ChildFinderByClass"

              // -end- 3D9D5ECB00BE throws3D9D5EA30035 "ChildFinderByClass"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D9D5ECB00BE body3D9D5EA30035 "ChildFinderByClass"
    this.aclass=aclass;
    return;
              // -end- 3D9D5ECB00BE body3D9D5EA30035 "ChildFinderByClass"
              }

            // -beg- preserve=no 3D9D5ED502AD head3D9D5EA30035 "getElements"
            public java.util.Set getElements()
            // -end- 3D9D5ED502AD head3D9D5EA30035 "getElements"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D9D5ED502AD throws3D9D5EA30035 "getElements"

              // -end- 3D9D5ED502AD throws3D9D5EA30035 "getElements"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D9D5ED502AD body3D9D5EA30035 "getElements"
    return foundElements;
              // -end- 3D9D5ED502AD body3D9D5EA30035 "getElements"
              }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D9D5EA30035 detail_end "ChildFinderByClass"

            // -end- 3D9D5EA30035 detail_end "ChildFinderByClass"

          }

=======
// -beg- preserve=no 3D9D5EA30035 package "ChildFinderByClass"
package ch.ehi.uml1_4.tools;
// -end- 3D9D5EA30035 package "ChildFinderByClass"

import java.util.HashSet;
import java.util.Set;

// -beg- preserve=no 3D9D5EA30035 autoimport "ChildFinderByClass"
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3D9D5EA30035 autoimport "ChildFinderByClass"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3D9D5EA30035 import "ChildFinderByClass"

// -end- 3D9D5EA30035 import "ChildFinderByClass"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:17 $
 */
public class ChildFinderByClass extends AbstractVisitor {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3D9D5EA30035 detail_begin "ChildFinderByClass"
	Class aclass = null;
	Set<Object> foundElements = new HashSet<Object>();

	// -end- 3D9D5EA30035 detail_begin "ChildFinderByClass"

	// -beg- preserve=no 3D9D5EC90089 head3D9D5EA30035 "defaultVisit"
	public void defaultVisit(java.lang.Object object)
	// -end- 3D9D5EC90089 head3D9D5EA30035 "defaultVisit"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D9D5EC90089 throws3D9D5EA30035 "defaultVisit"

	// -end- 3D9D5EC90089 throws3D9D5EA30035 "defaultVisit"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D9D5EC90089 body3D9D5EA30035 "defaultVisit"
		if (aclass.isAssignableFrom(object.getClass())) {
			foundElements.add(object);
		}
		return;
		// -end- 3D9D5EC90089 body3D9D5EA30035 "defaultVisit"
	}

	// -beg- preserve=no 3D9D5ECB00BE head3D9D5EA30035 "ChildFinderByClass"
	public ChildFinderByClass(Class aclass)
	// -end- 3D9D5ECB00BE head3D9D5EA30035 "ChildFinderByClass"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D9D5ECB00BE throws3D9D5EA30035 "ChildFinderByClass"

	// -end- 3D9D5ECB00BE throws3D9D5EA30035 "ChildFinderByClass"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D9D5ECB00BE body3D9D5EA30035 "ChildFinderByClass"
		this.aclass = aclass;
		return;
		// -end- 3D9D5ECB00BE body3D9D5EA30035 "ChildFinderByClass"
	}

	// -beg- preserve=no 3D9D5ED502AD head3D9D5EA30035 "getElements"
	public Set<Object> getElements()
	// -end- 3D9D5ED502AD head3D9D5EA30035 "getElements"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D9D5ED502AD throws3D9D5EA30035 "getElements"

	// -end- 3D9D5ED502AD throws3D9D5EA30035 "getElements"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D9D5ED502AD body3D9D5EA30035 "getElements"
		return foundElements;
		// -end- 3D9D5ED502AD body3D9D5EA30035 "getElements"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3D9D5EA30035 detail_end "ChildFinderByClass"

	// -end- 3D9D5EA30035 detail_end "ChildFinderByClass"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
