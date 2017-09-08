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

// -beg- preserve=no 358A66CE00D4 package "Coord2"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 358A66CE00D4 package "Coord2"

// -beg- preserve=no 358A66CE00D4 autoimport "Coord2"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A66CE00D4 autoimport "Coord2"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A66CE00D4 import "Coord2"

// -end- 358A66CE00D4 import "Coord2"

/**
 * Wird nur in INTERLIS1 verwendet.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:13 $
 */
public class Coord2 extends BaseType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A66CE00D4 detail_begin "Coord2"

	// -end- 358A66CE00D4 detail_begin "Coord2"

	private static final long serialVersionUID = -8458670763061050922L;

	// -beg- preserve=no 3D4FA21B0034 head358A66CE00D4 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0034 head358A66CE00D4 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0034 throws358A66CE00D4 "unlinkAll"

	// -end- 3D4FA21B0034 throws358A66CE00D4 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0034 body358A66CE00D4 "unlinkAll"

		setEmin(null);
		setEmax(null);
		setNmin(null);
		setNmax(null);
		super.unlinkAll();
		// -end- 3D4FA21B0034 body358A66CE00D4 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B0035 head358A66CE00D4 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B0035 head358A66CE00D4 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0035 throws358A66CE00D4 "enumerateChildren"

	// -end- 3D4FA21B0035 throws358A66CE00D4 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0035 body358A66CE00D4 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getEmin());
		visitor.visit(getEmax());
		visitor.visit(getNmin());
		visitor.visit(getNmax());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B0035 body358A66CE00D4 "enumerateChildren"
	}

	// -beg- preserve=no 358A68380305 var358A66CE00D4 "emin"
	private IliDim emin = null;
	// -end- 358A68380305 var358A66CE00D4 "emin"

	/**
	 * get current value of emin min Ostwert
	 * 
	 * @see #setEmin
	 */
	// -beg- preserve=no 358A68380305 get_head358A66CE00D4 "emin"
	public IliDim getEmin()
	// -end- 358A68380305 get_head358A66CE00D4 "emin"
	{
		// -beg- preserve=no 358A68380305 get_body358A66CE00D4 "emin"
		return emin;
		// -end- 358A68380305 get_body358A66CE00D4 "emin"
	}

	/**
	 * set current value of emin
	 * 
	 * @see #getEmin
	 */
	// -beg- preserve=no 358A68380305 set_head358A66CE00D4 "emin"
	public void setEmin(IliDim value1)
	// -end- 358A68380305 set_head358A66CE00D4 "emin"
	{
		// -beg- preserve=no 358A68380305 set_body358A66CE00D4 "emin"
		if (emin != value1 && (emin == null || !emin.equals(value1))) {
			emin = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setEmin"));
		}
		// -end- 358A68380305 set_body358A66CE00D4 "emin"
	}

	// -beg- preserve=no 358A68420378 var358A66CE00D4 "emax"
	private IliDim emax = null;
	// -end- 358A68420378 var358A66CE00D4 "emax"

	/**
	 * get current value of emax max Ostwert
	 * 
	 * @see #setEmax
	 */
	// -beg- preserve=no 358A68420378 get_head358A66CE00D4 "emax"
	public IliDim getEmax()
	// -end- 358A68420378 get_head358A66CE00D4 "emax"
	{
		// -beg- preserve=no 358A68420378 get_body358A66CE00D4 "emax"
		return emax;
		// -end- 358A68420378 get_body358A66CE00D4 "emax"
	}

	/**
	 * set current value of emax
	 * 
	 * @see #getEmax
	 */
	// -beg- preserve=no 358A68420378 set_head358A66CE00D4 "emax"
	public void setEmax(IliDim value1)
	// -end- 358A68420378 set_head358A66CE00D4 "emax"
	{
		// -beg- preserve=no 358A68420378 set_body358A66CE00D4 "emax"
		if (emax != value1 && (emax == null || !emax.equals(value1))) {
			emax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setEmax"));
		}
		// -end- 358A68420378 set_body358A66CE00D4 "emax"
	}

	// -beg- preserve=no 358A684803DB var358A66CE00D4 "nmin"
	private IliDim nmin = null;
	// -end- 358A684803DB var358A66CE00D4 "nmin"

	/**
	 * get current value of nmin min Nordwert
	 * 
	 * @see #setNmin
	 */
	// -beg- preserve=no 358A684803DB get_head358A66CE00D4 "nmin"
	public IliDim getNmin()
	// -end- 358A684803DB get_head358A66CE00D4 "nmin"
	{
		// -beg- preserve=no 358A684803DB get_body358A66CE00D4 "nmin"
		return nmin;
		// -end- 358A684803DB get_body358A66CE00D4 "nmin"
	}

	/**
	 * set current value of nmin
	 * 
	 * @see #getNmin
	 */
	// -beg- preserve=no 358A684803DB set_head358A66CE00D4 "nmin"
	public void setNmin(IliDim value1)
	// -end- 358A684803DB set_head358A66CE00D4 "nmin"
	{
		// -beg- preserve=no 358A684803DB set_body358A66CE00D4 "nmin"
		if (nmin != value1 && (nmin == null || !nmin.equals(value1))) {
			nmin = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setNmin"));
		}
		// -end- 358A684803DB set_body358A66CE00D4 "nmin"
	}

	// -beg- preserve=no 358A68530296 var358A66CE00D4 "nmax"
	private IliDim nmax = null;
	// -end- 358A68530296 var358A66CE00D4 "nmax"

	/**
	 * get current value of nmax max Nordwert
	 * 
	 * @see #setNmax
	 */
	// -beg- preserve=no 358A68530296 get_head358A66CE00D4 "nmax"
	public IliDim getNmax()
	// -end- 358A68530296 get_head358A66CE00D4 "nmax"
	{
		// -beg- preserve=no 358A68530296 get_body358A66CE00D4 "nmax"
		return nmax;
		// -end- 358A68530296 get_body358A66CE00D4 "nmax"
	}

	/**
	 * set current value of nmax
	 * 
	 * @see #getNmax
	 */
	// -beg- preserve=no 358A68530296 set_head358A66CE00D4 "nmax"
	public void setNmax(IliDim value1)
	// -end- 358A68530296 set_head358A66CE00D4 "nmax"
	{
		// -beg- preserve=no 358A68530296 set_body358A66CE00D4 "nmax"
		if (nmax != value1 && (nmax == null || !nmax.equals(value1))) {
			nmax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setNmax"));
		}
		// -end- 358A68530296 set_body358A66CE00D4 "nmax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A66CE00D4 detail_end "Coord2"

	// -end- 358A66CE00D4 detail_end "Coord2"

}
