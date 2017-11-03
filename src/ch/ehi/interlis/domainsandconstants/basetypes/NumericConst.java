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

// -beg- preserve=no 39488ABC022B package "NumericConst"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 39488ABC022B package "NumericConst"

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 39488ABC022B autoimport "NumericConst"
import ch.ehi.interlis.units.UnitDef;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39488ABC022B import "NumericConst"

// -end- 39488ABC022B import "NumericConst"

/**
 * Definiert eine numerische Konstante.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:24 $
 */
public class NumericConst extends Constant implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39488ABC022B detail_begin "NumericConst"

	// -end- 39488ABC022B detail_begin "NumericConst"

	private static final long serialVersionUID = -700903317400965608L;

	// -beg- preserve=no 3D4FA21B0156 head39488ABC022B "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0156 head39488ABC022B "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0156 throws39488ABC022B "unlinkAll"

	// -end- 3D4FA21B0156 throws39488ABC022B "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0156 body39488ABC022B "unlinkAll"

		detachUnitDef();
		super.unlinkAll();
		// -end- 3D4FA21B0156 body39488ABC022B "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B0157 head39488ABC022B "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B0157 head39488ABC022B "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0157 throws39488ABC022B "enumerateChildren"

	// -end- 3D4FA21B0157 throws39488ABC022B "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0157 body39488ABC022B "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B0157 body39488ABC022B "enumerateChildren"
	}

	// -beg- preserve=no 3948CD5B03DF code39488ABC022B "unitDef"
	private UnitDef unitDef;
	// -end- 3948CD5B03DF code39488ABC022B "unitDef"

	/**
	 * attaches a UnitDef.
	 *
	 * @see #detachUnitDef
	 * @see #getUnitDef
	 * @see #containsUnitDef
	 */
	// -beg- preserve=no 3948CD5B03DF attach_head39488ABC022B
	// "NumericConst::attachUnitDef"
	public void attachUnitDef(UnitDef unitDef1)
	// -end- 3948CD5B03DF attach_head39488ABC022B "NumericConst::attachUnitDef"
	{
		// -beg- preserve=no 3948CD5B03DF attach_body39488ABC022B
		// "NumericConst::attachUnitDef"
		if (unitDef != null) {
			throw new java.lang.IllegalStateException("already a unitDef attached");
		}
		if (unitDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as unitDef");
		}
		unitDef = unitDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachUnitDef"));
		return;
		// -end- 3948CD5B03DF attach_body39488ABC022B
		// "NumericConst::attachUnitDef"
	}

	/**
	 * disconnect the currently attached UnitDef.
	 * 
	 * @see #attachUnitDef
	 */
	// -beg- preserve=no 3948CD5B03DF detach_head39488ABC022B
	// "NumericConst::detachUnitDef"
	public UnitDef detachUnitDef()
	// -end- 3948CD5B03DF detach_head39488ABC022B "NumericConst::detachUnitDef"
	{
		// -beg- preserve=no 3948CD5B03DF detach_body39488ABC022B
		// "NumericConst::detachUnitDef"
		UnitDef ret = null;
		ret = unitDef;
		unitDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachUnitDef"));
		return ret;
		// -end- 3948CD5B03DF detach_body39488ABC022B
		// "NumericConst::detachUnitDef"
	}

	/**
	 * get the currently attached UnitDef.
	 * 
	 * @see #attachUnitDef
	 */
	// -beg- preserve=no 3948CD5B03DF get_head39488ABC022B
	// "NumericConst::getUnitDef"
	public UnitDef getUnitDef()
	// -end- 3948CD5B03DF get_head39488ABC022B "NumericConst::getUnitDef"
	{
		// -beg- preserve=no 3948CD5B03DF get_body39488ABC022B
		// "NumericConst::getUnitDef"
		if (unitDef == null) {
			throw new java.lang.IllegalStateException("no unitDef attached");
		}
		return unitDef;
		// -end- 3948CD5B03DF get_body39488ABC022B "NumericConst::getUnitDef"
	}

	/**
	 * tests if there is a UnitDef attached.
	 * 
	 * @see #attachUnitDef
	 */
	// -beg- preserve=no 3948CD5B03DF test_head39488ABC022B
	// "NumericConst::containsUnitDef"
	public boolean containsUnitDef()
	// -end- 3948CD5B03DF test_head39488ABC022B "NumericConst::containsUnitDef"
	{
		// -beg- preserve=no 3948CD5B03DF test_body39488ABC022B
		// "NumericConst::containsUnitDef"
		return unitDef != null;
		// -end- 3948CD5B03DF test_body39488ABC022B
		// "NumericConst::containsUnitDef"
	}

	// -beg- preserve=no 3948CD6D0060 var39488ABC022B "dec"
	private double dec;
	// -end- 3948CD6D0060 var39488ABC022B "dec"

	/**
	 * get current value of dec Wert
	 * 
	 * @see #setDec
	 */
	// -beg- preserve=no 3948CD6D0060 get_head39488ABC022B "dec"
	public double getDec()
	// -end- 3948CD6D0060 get_head39488ABC022B "dec"
	{
		// -beg- preserve=no 3948CD6D0060 get_body39488ABC022B "dec"
		return dec;
		// -end- 3948CD6D0060 get_body39488ABC022B "dec"
	}

	/**
	 * set current value of dec
	 * 
	 * @see #getDec
	 */
	// -beg- preserve=no 3948CD6D0060 set_head39488ABC022B "dec"
	public void setDec(double value1)
	// -end- 3948CD6D0060 set_head39488ABC022B "dec"
	{
		// -beg- preserve=no 3948CD6D0060 set_body39488ABC022B "dec"
		if (dec != value1) {
			dec = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setDec"));
		}
		// -end- 3948CD6D0060 set_body39488ABC022B "dec"
	}

	// -beg- preserve=no 3948CD9701BF var39488ABC022B "builtin"
	private int builtin;
	// -end- 3948CD9701BF var39488ABC022B "builtin"

	/**
	 * get current value of builtin
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.BuiltinNumConst
	 * @see #setBuiltin
	 */
	// -beg- preserve=no 3948CD9701BF get_head39488ABC022B "builtin"
	public int getBuiltin()
	// -end- 3948CD9701BF get_head39488ABC022B "builtin"
	{
		// -beg- preserve=no 3948CD9701BF get_body39488ABC022B "builtin"
		return builtin;
		// -end- 3948CD9701BF get_body39488ABC022B "builtin"
	}

	/**
	 * set current value of builtin
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.BuiltinNumConst
	 * @see #getBuiltin
	 */
	// -beg- preserve=no 3948CD9701BF set_head39488ABC022B "builtin"
	public void setBuiltin(int value1)
	// -end- 3948CD9701BF set_head39488ABC022B "builtin"
	{
		// -beg- preserve=no 3948CD9701BF set_body39488ABC022B "builtin"
		if (builtin != value1) {
			builtin = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setBuiltin"));
		}
		// -end- 3948CD9701BF set_body39488ABC022B "builtin"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39488ABC022B detail_end "NumericConst"

	// -end- 39488ABC022B detail_end "NumericConst"

}
