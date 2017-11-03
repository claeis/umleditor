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

// -beg- preserve=no 3C1641110379 package "DefinitionProxy"
package ch.ehi.interlis;
// -end- 3C1641110379 package "DefinitionProxy"

// -beg- preserve=no 3C1641110379 autoimport "DefinitionProxy"

// -end- 3C1641110379 autoimport "DefinitionProxy"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C1641110379 import "DefinitionProxy"

// -end- 3C1641110379 import "DefinitionProxy"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:24 $
 */
public interface DefinitionProxy extends java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1641110379 detail_begin "DefinitionProxy"

	// -end- 3C1641110379 detail_begin "DefinitionProxy"

	/**
	 * get current value of isProxy true if this is not an actual definition,
	 * but a placeholder, so that references can point to something
	 * 
	 * @see #setProxy
	 */
	// -beg- preserve=no 3C16416801D0 get_head3C1641110379 "isProxy"
	boolean isProxy()
	// -end- 3C16416801D0 get_head3C1641110379 "isProxy"
	; // empty

	/**
	 * set current value of isProxy
	 * 
	 * @see #isProxy
	 */
	// -beg- preserve=no 3C16416801D0 set_head3C1641110379 "isProxy"
	void setProxy(boolean value1)
	// -end- 3C16416801D0 set_head3C1641110379 "isProxy"
	; // empty
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1641110379 detail_end "DefinitionProxy"

	// -end- 3C1641110379 detail_end "DefinitionProxy"

}
