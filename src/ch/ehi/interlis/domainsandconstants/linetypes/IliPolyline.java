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

// -beg- preserve=no 3948E1A4012A package "IliPolyline"
package ch.ehi.interlis.domainsandconstants.linetypes;
// -end- 3948E1A4012A package "IliPolyline"

// -beg- preserve=no 3948E1A4012A autoimport "IliPolyline"
import ch.ehi.interlis.domainsandconstants.linetypes.LineType;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3948E1A4012A autoimport "IliPolyline"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3948E1A4012A import "IliPolyline"

// -end- 3948E1A4012A import "IliPolyline"

/**
 * Definiert ein Linienzug Datentyp.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:36 $
 */
public class IliPolyline extends LineType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3948E1A4012A detail_begin "IliPolyline"

	// -end- 3948E1A4012A detail_begin "IliPolyline"

	private static final long serialVersionUID = 1241601844835397918L;

	// -beg- preserve=no 3D4FA21B0306 head3948E1A4012A "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0306 head3948E1A4012A "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0306 throws3948E1A4012A "unlinkAll"

	// -end- 3D4FA21B0306 throws3948E1A4012A "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0306 body3948E1A4012A "unlinkAll"

		super.unlinkAll();
		// -end- 3D4FA21B0306 body3948E1A4012A "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B030F head3948E1A4012A "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B030F head3948E1A4012A "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B030F throws3948E1A4012A "enumerateChildren"

	// -end- 3D4FA21B030F throws3948E1A4012A "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B030F body3948E1A4012A "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B030F body3948E1A4012A "enumerateChildren"
	}

	// -beg- preserve=no 3948E2250111 var3948E1A4012A "directed"
	private boolean directed;
	// -end- 3948E2250111 var3948E1A4012A "directed"

	/**
	 * get current value of directed Sind die Linien gerichtet.
	 * 
	 * @see #setDirected
	 */
	// -beg- preserve=no 3948E2250111 get_head3948E1A4012A "directed"
	public boolean isDirected()
	// -end- 3948E2250111 get_head3948E1A4012A "directed"
	{
		// -beg- preserve=no 3948E2250111 get_body3948E1A4012A "directed"
		return directed;
		// -end- 3948E2250111 get_body3948E1A4012A "directed"
	}

	/**
	 * set current value of directed
	 * 
	 * @see #isDirected
	 */
	// -beg- preserve=no 3948E2250111 set_head3948E1A4012A "directed"
	public void setDirected(boolean value1)
	// -end- 3948E2250111 set_head3948E1A4012A "directed"
	{
		// -beg- preserve=no 3948E2250111 set_body3948E1A4012A "directed"
		if (directed != value1) {
			directed = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setDirected"));
		}
		// -end- 3948E2250111 set_body3948E1A4012A "directed"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3948E1A4012A detail_end "IliPolyline"

	// -end- 3948E1A4012A detail_end "IliPolyline"

}
