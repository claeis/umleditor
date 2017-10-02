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

// -beg- preserve=no 358A674F007F package "HorizAlignment"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 358A674F007F package "HorizAlignment"

// -beg- preserve=no 358A674F007F autoimport "HorizAlignment"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A674F007F autoimport "HorizAlignment"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A674F007F import "HorizAlignment"

// -end- 358A674F007F import "HorizAlignment"

/**
 * Definiert einen Datentyp für die horizontalen Textausrichtung.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:20 $
 */
public class HorizAlignment extends BaseType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A674F007F detail_begin "HorizAlignment"

	// -end- 358A674F007F detail_begin "HorizAlignment"

	private static final long serialVersionUID = -1221748386928895005L;

	// -beg- preserve=no 3D4FA21B0084 head358A674F007F "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0084 head358A674F007F "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0084 throws358A674F007F "unlinkAll"

	// -end- 3D4FA21B0084 throws358A674F007F "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0084 body358A674F007F "unlinkAll"

		super.unlinkAll();
		// -end- 3D4FA21B0084 body358A674F007F "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B0085 head358A674F007F "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B0085 head358A674F007F "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0085 throws358A674F007F "enumerateChildren"

	// -end- 3D4FA21B0085 throws358A674F007F "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0085 body358A674F007F "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B0085 body358A674F007F "enumerateChildren"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A674F007F detail_end "HorizAlignment"

	// -end- 358A674F007F detail_end "HorizAlignment"

}
