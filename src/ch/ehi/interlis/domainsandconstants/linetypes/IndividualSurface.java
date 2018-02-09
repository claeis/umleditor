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

// -beg- preserve=no 36D5626F01E9 package "IndividualSurface"
package ch.ehi.interlis.domainsandconstants.linetypes;
// -end- 36D5626F01E9 package "IndividualSurface"

// -beg- preserve=no 36D5626F01E9 autoimport "IndividualSurface"
import ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 36D5626F01E9 autoimport "IndividualSurface"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 36D5626F01E9 import "IndividualSurface"

// -end- 36D5626F01E9 import "IndividualSurface"

/**
 * Definiert ein Flächenwertebereich mit Überlappung.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:36 $
 */
public class IndividualSurface extends SurfaceType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 36D5626F01E9 detail_begin "IndividualSurface"

	// -end- 36D5626F01E9 detail_begin "IndividualSurface"

	private static final long serialVersionUID = -1153634459539997006L;

	// -beg- preserve=no 3D4FA21B0357 head36D5626F01E9 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0357 head36D5626F01E9 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0357 throws36D5626F01E9 "unlinkAll"

	// -end- 3D4FA21B0357 throws36D5626F01E9 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0357 body36D5626F01E9 "unlinkAll"

		super.unlinkAll();
		// -end- 3D4FA21B0357 body36D5626F01E9 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B035F head36D5626F01E9 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B035F head36D5626F01E9 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B035F throws36D5626F01E9 "enumerateChildren"

	// -end- 3D4FA21B035F throws36D5626F01E9 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B035F body36D5626F01E9 "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B035F body36D5626F01E9 "enumerateChildren"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 36D5626F01E9 detail_end "IndividualSurface"

	// -end- 36D5626F01E9 detail_end "IndividualSurface"

}
