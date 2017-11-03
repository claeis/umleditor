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

// -beg- preserve=no 3C2C4A39022E package "WayPoint"
package ch.ehi.umleditor.umlpresentation;
// -end- 3C2C4A39022E package "WayPoint"

// -beg- preserve=no 3C2C4A39022E autoimport "WayPoint"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3C2C4A39022E autoimport "WayPoint"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C2C4A39022E import "WayPoint"

// -end- 3C2C4A39022E import "WayPoint"

/**
 * A WayPoint is a constraint on the geometry of the actual presentation of this
 * Edge
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:28 $
 */
public class WayPoint extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C2C4A39022E detail_begin "WayPoint"

	// -end- 3C2C4A39022E detail_begin "WayPoint"

	private static final long serialVersionUID = -7064309195143602886L;

	// -beg- preserve=no 3D4FA2170287 head3C2C4A39022E "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2170287 head3C2C4A39022E "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2170287 throws3C2C4A39022E "unlinkAll"

	// -end- 3D4FA2170287 throws3C2C4A39022E "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2170287 body3C2C4A39022E "unlinkAll"

		// Role PresentationEdge: PresentationEdge object(s) may point to this
		super.unlinkAll();
		// -end- 3D4FA2170287 body3C2C4A39022E "unlinkAll"
	}

	// -beg- preserve=no 3D4FA217029B head3C2C4A39022E "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA217029B head3C2C4A39022E "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA217029B throws3C2C4A39022E "enumerateChildren"

	// -end- 3D4FA217029B throws3C2C4A39022E "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA217029B body3C2C4A39022E "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA217029B body3C2C4A39022E "enumerateChildren"
	}

	// -beg- preserve=no 3C2C4A4C02CC var3C2C4A39022E "east"
	private int east;
	// -end- 3C2C4A4C02CC var3C2C4A39022E "east"

	/**
	 * get current value of east
	 * 
	 * @see #setEast
	 */
	// -beg- preserve=no 3C2C4A4C02CC get_head3C2C4A39022E "east"
	public int getEast()
	// -end- 3C2C4A4C02CC get_head3C2C4A39022E "east"
	{
		// -beg- preserve=no 3C2C4A4C02CC get_body3C2C4A39022E "east"
		return east;
		// -end- 3C2C4A4C02CC get_body3C2C4A39022E "east"
	}

	/**
	 * set current value of east
	 * 
	 * @see #getEast
	 */
	// -beg- preserve=no 3C2C4A4C02CC set_head3C2C4A39022E "east"
	public void setEast(int value1)
	// -end- 3C2C4A4C02CC set_head3C2C4A39022E "east"
	{
		// -beg- preserve=no 3C2C4A4C02CC set_body3C2C4A39022E "east"
		if (east != value1) {
			east = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setEast"));
		}
		// -end- 3C2C4A4C02CC set_body3C2C4A39022E "east"
	}

	// -beg- preserve=no 3C2C4A4F0208 var3C2C4A39022E "south"
	private int south;
	// -end- 3C2C4A4F0208 var3C2C4A39022E "south"

	/**
	 * get current value of south
	 * 
	 * @see #setSouth
	 */
	// -beg- preserve=no 3C2C4A4F0208 get_head3C2C4A39022E "south"
	public int getSouth()
	// -end- 3C2C4A4F0208 get_head3C2C4A39022E "south"
	{
		// -beg- preserve=no 3C2C4A4F0208 get_body3C2C4A39022E "south"
		return south;
		// -end- 3C2C4A4F0208 get_body3C2C4A39022E "south"
	}

	/**
	 * set current value of south
	 * 
	 * @see #getSouth
	 */
	// -beg- preserve=no 3C2C4A4F0208 set_head3C2C4A39022E "south"
	public void setSouth(int value1)
	// -end- 3C2C4A4F0208 set_head3C2C4A39022E "south"
	{
		// -beg- preserve=no 3C2C4A4F0208 set_body3C2C4A39022E "south"
		if (south != value1) {
			south = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSouth"));
		}
		// -end- 3C2C4A4F0208 set_body3C2C4A39022E "south"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C2C4A39022E detail_end "WayPoint"

	// -end- 3C2C4A39022E detail_end "WayPoint"

}
