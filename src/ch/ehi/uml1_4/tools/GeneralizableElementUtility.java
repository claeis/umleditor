// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:19 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3CC03F43036B package "GeneralizableElementUtility"
package ch.ehi.uml1_4.tools;
// -end- 3CC03F43036B package "GeneralizableElementUtility"

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// -beg- preserve=no 3CC03F43036B autoimport "GeneralizableElementUtility"
import ch.ehi.uml1_4.foundation.core.GeneralizableElement;
// -end- 3CC03F43036B autoimport "GeneralizableElementUtility"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CC03F43036B import "GeneralizableElementUtility"
import ch.ehi.uml1_4.foundation.core.Generalization;
// -end- 3CC03F43036B import "GeneralizableElementUtility"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:19 $
 */
public class GeneralizableElementUtility {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CC03F43036B detail_begin "GeneralizableElementUtility"

	// -end- 3CC03F43036B detail_begin "GeneralizableElementUtility"

	/**
	 * checks if there is a Generalization relationship accros multiple levels
	 * between the given child and parent
	 */
	// -beg- preserve=no 3CC03F830345 head3CC03F43036B
	// "deepContainsGeneralizationParent"
	public static boolean deepContainsGeneralizationParent(GeneralizableElement child, GeneralizableElement parent)
	// -end- 3CC03F830345 head3CC03F43036B "deepContainsGeneralizationParent"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CC03F830345 throws3CC03F43036B
	// "deepContainsGeneralizationParent"

	// -end- 3CC03F830345 throws3CC03F43036B "deepContainsGeneralizationParent"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CC03F830345 body3CC03F43036B
		// "deepContainsGeneralizationParent"
		HashSet<GeneralizableElement> parents = new HashSet<GeneralizableElement>(); 
																// collection of
																// all parents
																// visited so
																// far
		ArrayList<GeneralizableElement> todo = new ArrayList<GeneralizableElement>(); 
																// collection of
																// parents not
																// yet visited
		// add give child to todo-list; so it is processed as a first element
		todo.add(child);
		while (!todo.isEmpty()) {
			GeneralizableElement current = (GeneralizableElement) todo.get(0);
			Iterator relIt = current.iteratorGeneralization();
			while (relIt.hasNext()) {
				Generalization rel = (Generalization) relIt.next();
				if (rel.containsParent()) {
					GeneralizableElement next = rel.getParent();
					if (next == parent) {
						// parent found
						return true;
					}
					if (parents.add(next)) {
						// next is a not yet known parent
						// add it to todo-list
						todo.add(next);
					}
				}
			}
			// remove current from todo-list
			todo.remove(0);
		}
		// parent has no Generalization relationship to child
		return false;
		// -end- 3CC03F830345 body3CC03F43036B
		// "deepContainsGeneralizationParent"
	}

	/**
	 * get the next base element of the given node or null.
	 */
	// -beg- preserve=no 3F8CFC370371 head3CC03F43036B "getBase"
	public static GeneralizableElement getBase(GeneralizableElement node)
	// -end- 3F8CFC370371 head3CC03F43036B "getBase"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3F8CFC370371 throws3CC03F43036B "getBase"

	// -end- 3F8CFC370371 throws3CC03F43036B "getBase"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3F8CFC370371 body3CC03F43036B "getBase"
		Iterator extendsi = node.iteratorGeneralization();
		while (extendsi.hasNext()) {
			Generalization obj = (Generalization) extendsi.next();
			if (obj.containsParent()) {
				return obj.getParent();
			}
		}
		return null;
		// -end- 3F8CFC370371 body3CC03F43036B "getBase"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CC03F43036B detail_end "GeneralizableElementUtility"

	// -end- 3CC03F43036B detail_end "GeneralizableElementUtility"

}
