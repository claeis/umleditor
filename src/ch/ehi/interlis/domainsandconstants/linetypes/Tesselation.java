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

              // -beg- preserve=no 36D5626603E5 package "Tesselation"
package ch.ehi.interlis.domainsandconstants.linetypes;
              // -end- 36D5626603E5 package "Tesselation"

              // -beg- preserve=no 36D5626603E5 autoimport "Tesselation"
              import ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 36D5626603E5 autoimport "Tesselation"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 36D5626603E5 import "Tesselation"

              // -end- 36D5626603E5 import "Tesselation"

              /** Definiert ein Flächenwertebereich ohne Überlappung.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:46 $
               */
public class Tesselation extends SurfaceType implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 36D5626603E5 detail_begin "Tesselation"

                // -end- 36D5626603E5 detail_begin "Tesselation"

                // -beg- preserve=no 3D4FA21B034C head36D5626603E5 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B034C head36D5626603E5 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B034C throws36D5626603E5 "unlinkAll"

                  // -end- 3D4FA21B034C throws36D5626603E5 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B034C body36D5626603E5 "unlinkAll"
                  
                  super.unlinkAll();
                  // -end- 3D4FA21B034C body36D5626603E5 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B0355 head36D5626603E5 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B0355 head36D5626603E5 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0355 throws36D5626603E5 "enumerateChildren"

                  // -end- 3D4FA21B0355 throws36D5626603E5 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0355 body36D5626603E5 "enumerateChildren"
                  java.util.Iterator it=null;
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B0355 body36D5626603E5 "enumerateChildren"
                  }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 36D5626603E5 detail_end "Tesselation"

                // -end- 36D5626603E5 detail_end "Tesselation"

              }

=======
// -beg- preserve=no 36D5626603E5 package "Tesselation"
package ch.ehi.interlis.domainsandconstants.linetypes;
// -end- 36D5626603E5 package "Tesselation"

// -beg- preserve=no 36D5626603E5 autoimport "Tesselation"
import ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 36D5626603E5 autoimport "Tesselation"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 36D5626603E5 import "Tesselation"

// -end- 36D5626603E5 import "Tesselation"

/**
 * Definiert ein FlÃ¤chenwertebereich ohne Ãœberlappung.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:46 $
 */
public class Tesselation extends SurfaceType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 36D5626603E5 detail_begin "Tesselation"

	// -end- 36D5626603E5 detail_begin "Tesselation"

	private static final long serialVersionUID = 7170026451373485272L;

	// -beg- preserve=no 3D4FA21B034C head36D5626603E5 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B034C head36D5626603E5 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B034C throws36D5626603E5 "unlinkAll"

	// -end- 3D4FA21B034C throws36D5626603E5 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B034C body36D5626603E5 "unlinkAll"

		super.unlinkAll();
		// -end- 3D4FA21B034C body36D5626603E5 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B0355 head36D5626603E5 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B0355 head36D5626603E5 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0355 throws36D5626603E5 "enumerateChildren"

	// -end- 3D4FA21B0355 throws36D5626603E5 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0355 body36D5626603E5 "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B0355 body36D5626603E5 "enumerateChildren"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 36D5626603E5 detail_end "Tesselation"

	// -end- 36D5626603E5 detail_end "Tesselation"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
