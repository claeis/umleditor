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

<<<<<<< HEAD

          // -beg- preserve=no 3C1DB12E01F8 package "ObjectPath"
package ch.ehi.interlis.logicalexpressions;
          // -end- 3C1DB12E01F8 package "ObjectPath"

          // -beg- preserve=no 3C1DB12E01F8 autoimport "ObjectPath"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3C1DB12E01F8 autoimport "ObjectPath"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3C1DB12E01F8 import "ObjectPath"

          // -end- 3C1DB12E01F8 import "ObjectPath"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:07 $
           */
public class ObjectPath extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C1DB12E01F8 detail_begin "ObjectPath"

            // -end- 3C1DB12E01F8 detail_begin "ObjectPath"

            // -beg- preserve=no 3D4FA21802C6 head3C1DB12E01F8 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21802C6 head3C1DB12E01F8 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21802C6 throws3C1DB12E01F8 "unlinkAll"

              // -end- 3D4FA21802C6 throws3C1DB12E01F8 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21802C6 body3C1DB12E01F8 "unlinkAll"
              
              // Role RoleDefDerived: RoleDefDerived object(s) may point to this
              super.unlinkAll();
              // -end- 3D4FA21802C6 body3C1DB12E01F8 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21802CF head3C1DB12E01F8 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21802CF head3C1DB12E01F8 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21802CF throws3C1DB12E01F8 "enumerateChildren"

              // -end- 3D4FA21802CF throws3C1DB12E01F8 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21802CF body3C1DB12E01F8 "enumerateChildren"
              java.util.Iterator it=null;
              super.enumerateChildren(visitor);
              // -end- 3D4FA21802CF body3C1DB12E01F8 "enumerateChildren"
              }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C1DB12E01F8 detail_end "ObjectPath"

            // -end- 3C1DB12E01F8 detail_end "ObjectPath"

          }

=======
// -beg- preserve=no 3C1DB12E01F8 package "ObjectPath"
package ch.ehi.interlis.logicalexpressions;
// -end- 3C1DB12E01F8 package "ObjectPath"

// -beg- preserve=no 3C1DB12E01F8 autoimport "ObjectPath"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3C1DB12E01F8 autoimport "ObjectPath"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C1DB12E01F8 import "ObjectPath"

// -end- 3C1DB12E01F8 import "ObjectPath"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:07 $
 */
public class ObjectPath extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1DB12E01F8 detail_begin "ObjectPath"

	// -end- 3C1DB12E01F8 detail_begin "ObjectPath"

	private static final long serialVersionUID = 2183975390331043217L;

	// -beg- preserve=no 3D4FA21802C6 head3C1DB12E01F8 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21802C6 head3C1DB12E01F8 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21802C6 throws3C1DB12E01F8 "unlinkAll"

	// -end- 3D4FA21802C6 throws3C1DB12E01F8 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21802C6 body3C1DB12E01F8 "unlinkAll"

		// Role RoleDefDerived: RoleDefDerived object(s) may point to this
		super.unlinkAll();
		// -end- 3D4FA21802C6 body3C1DB12E01F8 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21802CF head3C1DB12E01F8 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21802CF head3C1DB12E01F8 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21802CF throws3C1DB12E01F8 "enumerateChildren"

	// -end- 3D4FA21802CF throws3C1DB12E01F8 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21802CF body3C1DB12E01F8 "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21802CF body3C1DB12E01F8 "enumerateChildren"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1DB12E01F8 detail_end "ObjectPath"

	// -end- 3C1DB12E01F8 detail_end "ObjectPath"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
