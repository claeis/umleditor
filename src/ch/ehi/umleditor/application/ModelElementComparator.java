package ch.ehi.umleditor.application;

/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.tools.ModelElementUtility;

/**
 * Compare two ModelElement's by name.
<<<<<<< HEAD
 * 
 * @author: Peter Hirzel <i>soft</i>Environment 
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:36 $
 */
public class ModelElementComparator implements java.util.Comparator {
/**
 * ModelElementComparator constructor comment.
 */
protected ModelElementComparator() {
	super();
}
/**
 * Compare by defaultLanguageName.
 */
public int compare(Object o1, Object o2) {
    if(o1==o2){
      // return equal only if it is the same object!!
      // otherwise the element may not find its way into the lists
      return 0;
    }

    int ret= ((ModelElement)o1).getDefLangName().compareTo(((ModelElement)o2).getDefLangName());
    if(ret!=0){
      return ret;
    }
    // compare path to elements
    return ModelElementUtility.getUmlPath((ModelElement)o1,null).compareTo(
        ModelElementUtility.getUmlPath((ModelElement)o2,null)
        );
}
=======
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:39:36 $
 */
public class ModelElementComparator implements java.util.Comparator {
	/**
	 * ModelElementComparator constructor comment.
	 */
	protected ModelElementComparator() {
		super();
	}

	/**
	 * Compare by defaultLanguageName.
	 */
	public int compare(Object o1, Object o2) {
		if (o1 == o2) {
			// return equal only if it is the same object!!
			// otherwise the element may not find its way into the lists
			return 0;
		}

		int ret = ((ModelElement) o1).getDefLangName().compareTo(((ModelElement) o2).getDefLangName());
		if (ret != 0) {
			return ret;
		}
		// compare path to elements
		return ModelElementUtility.getUmlPath((ModelElement) o1, null)
				.compareTo(ModelElementUtility.getUmlPath((ModelElement) o2, null));
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
