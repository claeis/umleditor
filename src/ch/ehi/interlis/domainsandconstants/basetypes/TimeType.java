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

// -beg- preserve=no 448985E10132 package "TimeType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 448985E10132 package "TimeType"

// -beg- preserve=no 448985E10132 autoimport "TimeType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.domainsandconstants.basetypes.TimeValue;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 448985E10132 autoimport "TimeType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 448985E10132 import "TimeType"

// -end- 448985E10132 import "TimeType"

/**
 * ab INTERLIS 2.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class TimeType extends BaseType {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448985E10132 detail_begin "TimeType"

	// -end- 448985E10132 detail_begin "TimeType"

	// -beg- preserve=no 448E7B8A03E2 head448985E10132 "unlinkAll"
	public void unlinkAll()
	// -end- 448E7B8A03E2 head448985E10132 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448E7B8A03E2 throws448985E10132 "unlinkAll"

	// -end- 448E7B8A03E2 throws448985E10132 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448E7B8A03E2 body448985E10132 "unlinkAll"

		setMin(null);
		setMax(null);
		super.unlinkAll();
		// -end- 448E7B8A03E2 body448985E10132 "unlinkAll"
	}

	// -beg- preserve=no 448E7B8E00F8 head448985E10132 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 448E7B8E00F8 head448985E10132 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448E7B8E00F8 throws448985E10132 "enumerateChildren"

	// -end- 448E7B8E00F8 throws448985E10132 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448E7B8E00F8 body448985E10132 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getMin());
		visitor.visit(getMax());
		super.enumerateChildren(visitor);
		// -end- 448E7B8E00F8 body448985E10132 "enumerateChildren"
	}

	// -beg- preserve=no 448987630278 var448985E10132 "min"
	private TimeValue min = null;
	// -end- 448987630278 var448985E10132 "min"

	/**
	 * get current value of min
	 * 
	 * @see #setMin
	 */
	// -beg- preserve=no 448987630278 get_head448985E10132 "min"
	public TimeValue getMin()
	// -end- 448987630278 get_head448985E10132 "min"
	{
		// -beg- preserve=no 448987630278 get_body448985E10132 "min"
		return min;
		// -end- 448987630278 get_body448985E10132 "min"
	}

	/**
	 * set current value of min
	 * 
	 * @see #getMin
	 */
	// -beg- preserve=no 448987630278 set_head448985E10132 "min"
	public void setMin(TimeValue value1)
	// -end- 448987630278 set_head448985E10132 "min"
	{
		// -beg- preserve=no 448987630278 set_body448985E10132 "min"
		if (min != value1 && (min == null || !min.equals(value1))) {
			min = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMin"));
		}
		// -end- 448987630278 set_body448985E10132 "min"
	}

	// -beg- preserve=no 4489876D005F var448985E10132 "max"
	private TimeValue max = null;
	// -end- 4489876D005F var448985E10132 "max"

	/**
	 * get current value of max
	 * 
	 * @see #setMax
	 */
	// -beg- preserve=no 4489876D005F get_head448985E10132 "max"
	public TimeValue getMax()
	// -end- 4489876D005F get_head448985E10132 "max"
	{
		// -beg- preserve=no 4489876D005F get_body448985E10132 "max"
		return max;
		// -end- 4489876D005F get_body448985E10132 "max"
	}

	/**
	 * set current value of max
	 * 
	 * @see #getMax
	 */
	// -beg- preserve=no 4489876D005F set_head448985E10132 "max"
	public void setMax(TimeValue value1)
	// -end- 4489876D005F set_head448985E10132 "max"
	{
		// -beg- preserve=no 4489876D005F set_body448985E10132 "max"
		if (max != value1 && (max == null || !max.equals(value1))) {
			max = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMax"));
		}
		// -end- 4489876D005F set_body448985E10132 "max"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448985E10132 detail_end "TimeType"

	// -end- 448985E10132 detail_end "TimeType"

}
