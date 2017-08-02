// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:15 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3CAD862601FC package "ChildCollector"
package ch.ehi.interlis.tools;
// -end- 3CAD862601FC package "ChildCollector"

// -beg- preserve=no 3CAD862601FC autoimport "ChildCollector"
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3CAD862601FC autoimport "ChildCollector"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3CAD862601FC import "ChildCollector"

// -end- 3CAD862601FC import "ChildCollector"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:15 $
 */
public class ChildCollector extends AbstractVisitor {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3CAD862601FC detail_begin "ChildCollector"
	private transient java.util.List children = null;
	// -end- 3CAD862601FC detail_begin "ChildCollector"

	// -beg- preserve=no 3CAD89ED03DE head3CAD862601FC "getChildren"
	public java.util.List getChildren()
	// -end- 3CAD89ED03DE head3CAD862601FC "getChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CAD89ED03DE throws3CAD862601FC "getChildren"

	// -end- 3CAD89ED03DE throws3CAD862601FC "getChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CAD89ED03DE body3CAD862601FC "getChildren"
		return children;
		// -end- 3CAD89ED03DE body3CAD862601FC "getChildren"
	}

	// -beg- preserve=no 3CC00D170087 head3CAD862601FC "ChildCollector"
	public ChildCollector()
	// -end- 3CC00D170087 head3CAD862601FC "ChildCollector"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC00D170087 throws3CAD862601FC "ChildCollector"

	// -end- 3CC00D170087 throws3CAD862601FC "ChildCollector"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC00D170087 body3CAD862601FC "ChildCollector"
		children = new java.util.ArrayList();
		// -end- 3CC00D170087 body3CAD862601FC "ChildCollector"
	}

	// -beg- preserve=no 3CC00DA6030E head3CAD862601FC "defaultVisit"
	public void defaultVisit(java.lang.Object object)
	// -end- 3CC00DA6030E head3CAD862601FC "defaultVisit"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC00DA6030E throws3CAD862601FC "defaultVisit"

	// -end- 3CC00DA6030E throws3CAD862601FC "defaultVisit"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC00DA6030E body3CAD862601FC "defaultVisit"
		if (!children.contains(object)) {
			children.add(object);
		}
		// -end- 3CC00DA6030E body3CAD862601FC "defaultVisit"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CAD862601FC detail_end "ChildCollector"

	// -end- 3CAD862601FC detail_end "ChildCollector"

}
