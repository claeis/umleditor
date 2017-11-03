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

          // -beg- preserve=no 3D4AB587020E package "NoteEdge"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3D4AB587020E package "NoteEdge"

          // -beg- preserve=no 3D4AB587020E autoimport "NoteEdge"
          import ch.ehi.umleditor.umlpresentation.PresentationEdge;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3D4AB587020E autoimport "NoteEdge"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3D4AB587020E import "NoteEdge"

          // -end- 3D4AB587020E import "NoteEdge"

          /** The line that links a Note to a PresentationElement.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:13 $
           */
public class NoteEdge extends PresentationEdge
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D4AB587020E detail_begin "NoteEdge"

            // -end- 3D4AB587020E detail_begin "NoteEdge"

            // -beg- preserve=no 3D4FA2170366 head3D4AB587020E "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2170366 head3D4AB587020E "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170366 throws3D4AB587020E "unlinkAll"

              // -end- 3D4FA2170366 throws3D4AB587020E "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170366 body3D4AB587020E "unlinkAll"
              
              super.unlinkAll();
              // -end- 3D4FA2170366 body3D4AB587020E "unlinkAll"
              }

            // -beg- preserve=no 3D4FA217036E head3D4AB587020E "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA217036E head3D4AB587020E "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA217036E throws3D4AB587020E "enumerateChildren"

              // -end- 3D4FA217036E throws3D4AB587020E "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA217036E body3D4AB587020E "enumerateChildren"
              java.util.Iterator it=null;
              super.enumerateChildren(visitor);
              // -end- 3D4FA217036E body3D4AB587020E "enumerateChildren"
              }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D4AB587020E detail_end "NoteEdge"

            // -end- 3D4AB587020E detail_end "NoteEdge"

          }

=======
// -beg- preserve=no 3D4AB587020E package "NoteEdge"
package ch.ehi.umleditor.umlpresentation;
// -end- 3D4AB587020E package "NoteEdge"

// -beg- preserve=no 3D4AB587020E autoimport "NoteEdge"
import ch.ehi.umleditor.umlpresentation.PresentationEdge;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3D4AB587020E autoimport "NoteEdge"
import ch.ehi.basics.types.NlsString;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3D4AB587020E import "NoteEdge"

// -end- 3D4AB587020E import "NoteEdge"

/**
 * The line that links a Note to a PresentationElement.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:13 $
 */
public class NoteEdge extends PresentationEdge {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3D4AB587020E detail_begin "NoteEdge"

	// -end- 3D4AB587020E detail_begin "NoteEdge"

	private static final long serialVersionUID = -4435579244417685885L;

	// -beg- preserve=no 3D4FA2170366 head3D4AB587020E "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2170366 head3D4AB587020E "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2170366 throws3D4AB587020E "unlinkAll"

	// -end- 3D4FA2170366 throws3D4AB587020E "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2170366 body3D4AB587020E "unlinkAll"

		super.unlinkAll();
		// -end- 3D4FA2170366 body3D4AB587020E "unlinkAll"
	}

	// -beg- preserve=no 3D4FA217036E head3D4AB587020E "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA217036E head3D4AB587020E "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA217036E throws3D4AB587020E "enumerateChildren"

	// -end- 3D4FA217036E throws3D4AB587020E "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA217036E body3D4AB587020E "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA217036E body3D4AB587020E "enumerateChildren"
	}

	@Override
	public NlsString getMetaName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMetaName(NlsString value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NlsString getMetaMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMetaMsg(NlsString value) {
		// TODO Auto-generated method stub
		
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3D4AB587020E detail_end "NoteEdge"

	// -end- 3D4AB587020E detail_end "NoteEdge"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
