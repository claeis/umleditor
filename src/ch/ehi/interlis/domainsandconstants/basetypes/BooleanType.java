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

              // -beg- preserve=no 39488609013A package "BooleanType"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 39488609013A package "BooleanType"

              // -beg- preserve=no 39488609013A autoimport "BooleanType"
              import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 39488609013A autoimport "BooleanType"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 39488609013A import "BooleanType"

              // -end- 39488609013A import "BooleanType"

              /** Definiert einen booleschen Datentyp.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:11 $
               */
public class BooleanType extends BaseType implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 39488609013A detail_begin "BooleanType"

                // -end- 39488609013A detail_begin "BooleanType"

                // -beg- preserve=no 3D4FA21B00FC head39488609013A "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B00FC head39488609013A "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00FC throws39488609013A "unlinkAll"

                  // -end- 3D4FA21B00FC throws39488609013A "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00FC body39488609013A "unlinkAll"
                  
                  super.unlinkAll();
                  // -end- 3D4FA21B00FC body39488609013A "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B00FD head39488609013A "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B00FD head39488609013A "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00FD throws39488609013A "enumerateChildren"

                  // -end- 3D4FA21B00FD throws39488609013A "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00FD body39488609013A "enumerateChildren"
                  java.util.Iterator it=null;
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B00FD body39488609013A "enumerateChildren"
                  }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 39488609013A detail_end "BooleanType"

                // -end- 39488609013A detail_end "BooleanType"

              }

=======
// -beg- preserve=no 39488609013A package "BooleanType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 39488609013A package "BooleanType"

// -beg- preserve=no 39488609013A autoimport "BooleanType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 39488609013A autoimport "BooleanType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39488609013A import "BooleanType"

// -end- 39488609013A import "BooleanType"

/**
 * Definiert einen booleschen Datentyp.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:11 $
 */
public class BooleanType extends BaseType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39488609013A detail_begin "BooleanType"

	// -end- 39488609013A detail_begin "BooleanType"

	private static final long serialVersionUID = -4876795509575607499L;

	// -beg- preserve=no 3D4FA21B00FC head39488609013A "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B00FC head39488609013A "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B00FC throws39488609013A "unlinkAll"

	// -end- 3D4FA21B00FC throws39488609013A "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B00FC body39488609013A "unlinkAll"

		super.unlinkAll();
		// -end- 3D4FA21B00FC body39488609013A "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B00FD head39488609013A "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B00FD head39488609013A "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B00FD throws39488609013A "enumerateChildren"

	// -end- 3D4FA21B00FD throws39488609013A "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B00FD body39488609013A "enumerateChildren"
		Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B00FD body39488609013A "enumerateChildren"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39488609013A detail_end "BooleanType"

	// -end- 39488609013A detail_end "BooleanType"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
