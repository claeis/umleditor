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

// -beg- preserve=no 38F1E1320160 package "IliDim"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 38F1E1320160 package "IliDim"

// -beg- preserve=no 38F1E1320160 autoimport "IliDim"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 38F1E1320160 autoimport "IliDim"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 38F1E1320160 import "IliDim"

// -end- 38F1E1320160 import "IliDim"

/**
 * Ein nummerischer Wert inkl.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:21 $
 */
public class IliDim extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 38F1E1320160 detail_begin "IliDim"

	// -end- 38F1E1320160 detail_begin "IliDim"

	private static final long serialVersionUID = 2644951509040459442L;

	// -beg- preserve=no 3D4FA21B02A1 head38F1E1320160 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B02A1 head38F1E1320160 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B02A1 throws38F1E1320160 "unlinkAll"

	// -end- 3D4FA21B02A1 throws38F1E1320160 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B02A1 body38F1E1320160 "unlinkAll"

		super.unlinkAll();
		// -end- 3D4FA21B02A1 body38F1E1320160 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B02AB head38F1E1320160 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B02AB head38F1E1320160 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B02AB throws38F1E1320160 "enumerateChildren"

	// -end- 3D4FA21B02AB throws38F1E1320160 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B02AB body38F1E1320160 "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B02AB body38F1E1320160 "enumerateChildren"
	}

	// -beg- preserve=no 3D6F75D90168 head38F1E1320160 "toString"
	public String toString()
	// -end- 3D6F75D90168 head38F1E1320160 "toString"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D6F75D90168 throws38F1E1320160 "toString"

	// -end- 3D6F75D90168 throws38F1E1320160 "toString"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D6F75D90168 body38F1E1320160 "toString"
		String fmtPattern = "0";
		if (getAccuracy() > 0) {
			fmtPattern += "." + ch.ehi.basics.tools.StringUtility.STRING((int) getAccuracy(), '0');
		}
		double value = getValue();
		value /= Math.pow(10, getBase10shift());
		java.text.DecimalFormatSymbols symbols = new java.text.DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		symbols.setMinusSign('-');
		symbols.setZeroDigit('0');
		java.text.DecimalFormat fmt = new java.text.DecimalFormat(fmtPattern, symbols);
		String ret = fmt.format(value);
		return ret;
		// -end- 3D6F75D90168 body38F1E1320160 "toString"
	}

	// -beg- preserve=no 3D6F76B90106 head38F1E1320160 "parseIliDim"
	public static IliDim parseIliDim(String value)
			// -end- 3D6F76B90106 head38F1E1320160 "parseIliDim"
			// declare any checked exceptions
			// please fill in/modify the following section
			// -beg- preserve=yes 3D6F76B90106 throws38F1E1320160 "parseIliDim"
			throws java.lang.NumberFormatException

	// -end- 3D6F76B90106 throws38F1E1320160 "parseIliDim"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3D6F76B90106 body38F1E1320160 "parseIliDim"
		value = value.trim();
		IliDim ret = new IliDim();
		double val = Double.parseDouble(value);
		ret.setValue(val);
		int pp = value.indexOf('.');
		int pe = value.indexOf('e');
		if (pe == -1) {
			pe = value.indexOf('E');
		}
		if (pp >= 0) {
			if (pe >= 0) {
				ret.setAccuracy(pe - pp - 1);
			} else {
				ret.setAccuracy(value.length() - pp - 1);
			}
		}
		if (pe >= 0) {
			ret.setBase10shift(Long.parseLong(value.substring(pe + 1)));
		}
		return ret;
		// -end- 3D6F76B90106 body38F1E1320160 "parseIliDim"
	}

	// -beg- preserve=no 38F1E21C0116 var38F1E1320160 "value"
	private double value;
	// -end- 38F1E21C0116 var38F1E1320160 "value"

	/**
	 * get current value of value Wert
	 * 
	 * @see #setValue
	 */
	// -beg- preserve=no 38F1E21C0116 get_head38F1E1320160 "value"
	public double getValue()
	// -end- 38F1E21C0116 get_head38F1E1320160 "value"
	{
		// -beg- preserve=no 38F1E21C0116 get_body38F1E1320160 "value"
		return value;
		// -end- 38F1E21C0116 get_body38F1E1320160 "value"
	}

	/**
	 * set current value of value
	 * 
	 * @see #getValue
	 */
	// -beg- preserve=no 38F1E21C0116 set_head38F1E1320160 "value"
	public void setValue(double value1)
	// -end- 38F1E21C0116 set_head38F1E1320160 "value"
	{
		// -beg- preserve=no 38F1E21C0116 set_body38F1E1320160 "value"
		if (value != value1) {
			value = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setValue"));
		}
		// -end- 38F1E21C0116 set_body38F1E1320160 "value"
	}

	// -beg- preserve=no 38F1E22F0128 var38F1E1320160 "base10shift"
	private long base10shift;
	// -end- 38F1E22F0128 var38F1E1320160 "base10shift"

	/**
	 * get current value of base10shift Exponent
	 * 
	 * @see #setBase10shift
	 */
	// -beg- preserve=no 38F1E22F0128 get_head38F1E1320160 "base10shift"
	public long getBase10shift()
	// -end- 38F1E22F0128 get_head38F1E1320160 "base10shift"
	{
		// -beg- preserve=no 38F1E22F0128 get_body38F1E1320160 "base10shift"
		return base10shift;
		// -end- 38F1E22F0128 get_body38F1E1320160 "base10shift"
	}

	/**
	 * set current value of base10shift
	 * 
	 * @see #getBase10shift
	 */
	// -beg- preserve=no 38F1E22F0128 set_head38F1E1320160 "base10shift"
	public void setBase10shift(long value1)
	// -end- 38F1E22F0128 set_head38F1E1320160 "base10shift"
	{
		// -beg- preserve=no 38F1E22F0128 set_body38F1E1320160 "base10shift"
		if (base10shift != value1) {
			base10shift = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setBase10shift"));
		}
		// -end- 38F1E22F0128 set_body38F1E1320160 "base10shift"
	}

	// -beg- preserve=no 38F1E23C0108 var38F1E1320160 "accuracy"
	private long accuracy;
	// -end- 38F1E23C0108 var38F1E1320160 "accuracy"

	/**
	 * get current value of accuracy Genauigkeit in Anzahl Nachkommastellen
	 * 
	 * @see #setAccuracy
	 */
	// -beg- preserve=no 38F1E23C0108 get_head38F1E1320160 "accuracy"
	public long getAccuracy()
	// -end- 38F1E23C0108 get_head38F1E1320160 "accuracy"
	{
		// -beg- preserve=no 38F1E23C0108 get_body38F1E1320160 "accuracy"
		return accuracy;
		// -end- 38F1E23C0108 get_body38F1E1320160 "accuracy"
	}

	/**
	 * set current value of accuracy
	 * 
	 * @see #getAccuracy
	 */
	// -beg- preserve=no 38F1E23C0108 set_head38F1E1320160 "accuracy"
	public void setAccuracy(long value1)
	// -end- 38F1E23C0108 set_head38F1E1320160 "accuracy"
	{
		// -beg- preserve=no 38F1E23C0108 set_body38F1E1320160 "accuracy"
		if (accuracy != value1) {
			accuracy = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAccuracy"));
		}
		// -end- 38F1E23C0108 set_body38F1E1320160 "accuracy"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 38F1E1320160 detail_end "IliDim"

	// -end- 38F1E1320160 detail_end "IliDim"

}
