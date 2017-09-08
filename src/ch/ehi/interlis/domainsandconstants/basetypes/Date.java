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

// -beg- preserve=no 358A671700BB package "Date"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 358A671700BB package "Date"

// -beg- preserve=no 358A671700BB autoimport "Date"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A671700BB autoimport "Date"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A671700BB import "Date"

// -end- 358A671700BB import "Date"

/**
 * Wird nur in INTERLIS1 verwendet.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:16 $
 */
public class Date extends BaseType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A671700BB detail_begin "Date"

	// -end- 358A671700BB detail_begin "Date"

	private static final long serialVersionUID = -9061886475044563880L;

	// -beg- preserve=no 3D4FA21B00B6 head358A671700BB "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B00B6 head358A671700BB "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B00B6 throws358A671700BB "unlinkAll"

	// -end- 3D4FA21B00B6 throws358A671700BB "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B00B6 body358A671700BB "unlinkAll"

		super.unlinkAll();
		// -end- 3D4FA21B00B6 body358A671700BB "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B00B7 head358A671700BB "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B00B7 head358A671700BB "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B00B7 throws358A671700BB "enumerateChildren"

	// -end- 3D4FA21B00B7 throws358A671700BB "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B00B7 body358A671700BB "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B00B7 body358A671700BB "enumerateChildren"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A671700BB detail_end "Date"

	// -end- 358A671700BB detail_end "Date"

}
