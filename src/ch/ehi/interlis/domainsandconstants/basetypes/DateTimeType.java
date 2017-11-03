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

<<<<<<< HEAD

=======
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -beg- preserve=no 448985D7008E package "DateTimeType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 448985D7008E package "DateTimeType"

// -beg- preserve=no 448985D7008E autoimport "DateTimeType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.domainsandconstants.basetypes.DateTimeValue;
<<<<<<< HEAD
=======

import java.util.Iterator;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 448985D7008E autoimport "DateTimeType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 448985D7008E import "DateTimeType"

// -end- 448985D7008E import "DateTimeType"

<<<<<<< HEAD
/** ab INTERLIS 2.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class DateTimeType extends BaseType
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448985D7008E detail_begin "DateTimeType"

  // -end- 448985D7008E detail_begin "DateTimeType"

  // -beg- preserve=no 448E7BB201E0 head448985D7008E "unlinkAll"
  public void unlinkAll()
  // -end- 448E7BB201E0 head448985D7008E "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 448E7BB201E0 throws448985D7008E "unlinkAll"

    // -end- 448E7BB201E0 throws448985D7008E "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 448E7BB201E0 body448985D7008E "unlinkAll"
    
    setMin(null);
    setMax(null);
    super.unlinkAll();
    // -end- 448E7BB201E0 body448985D7008E "unlinkAll"
    }

  // -beg- preserve=no 448E7BB201F4 head448985D7008E "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 448E7BB201F4 head448985D7008E "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 448E7BB201F4 throws448985D7008E "enumerateChildren"

    // -end- 448E7BB201F4 throws448985D7008E "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 448E7BB201F4 body448985D7008E "enumerateChildren"
    java.util.Iterator it=null;
    visitor.visit(getMin());
    visitor.visit(getMax());
    super.enumerateChildren(visitor);
    // -end- 448E7BB201F4 body448985D7008E "enumerateChildren"
    }

  // -beg- preserve=no 4489874A0218 var448985D7008E "min"
  private DateTimeValue min = null;
  // -end- 4489874A0218 var448985D7008E "min"

  /** get current value of min
   *  @see #setMin
   */
  // -beg- preserve=no 4489874A0218 get_head448985D7008E "min"
  public  DateTimeValue getMin()
  // -end- 4489874A0218 get_head448985D7008E "min"
  {
    // -beg- preserve=no 4489874A0218 get_body448985D7008E "min"
    return min;
    // -end- 4489874A0218 get_body448985D7008E "min"
  }

  /** set current value of min
   *  @see #getMin
   */
  // -beg- preserve=no 4489874A0218 set_head448985D7008E "min"
  public  void setMin(DateTimeValue value1)
  // -end- 4489874A0218 set_head448985D7008E "min"
  {
    // -beg- preserve=no 4489874A0218 set_body448985D7008E "min"
    if(min!=value1 && (min==null || !min.equals(value1))){
      min = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMin"));
    }
    // -end- 4489874A0218 set_body448985D7008E "min"
  }

  // -beg- preserve=no 44898753004E var448985D7008E "max"
  private DateTimeValue max = null;
  // -end- 44898753004E var448985D7008E "max"

  /** get current value of max
   *  @see #setMax
   */
  // -beg- preserve=no 44898753004E get_head448985D7008E "max"
  public  DateTimeValue getMax()
  // -end- 44898753004E get_head448985D7008E "max"
  {
    // -beg- preserve=no 44898753004E get_body448985D7008E "max"
    return max;
    // -end- 44898753004E get_body448985D7008E "max"
  }

  /** set current value of max
   *  @see #getMax
   */
  // -beg- preserve=no 44898753004E set_head448985D7008E "max"
  public  void setMax(DateTimeValue value1)
  // -end- 44898753004E set_head448985D7008E "max"
  {
    // -beg- preserve=no 44898753004E set_body448985D7008E "max"
    if(max!=value1 && (max==null || !max.equals(value1))){
      max = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMax"));
    }
    // -end- 44898753004E set_body448985D7008E "max"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448985D7008E detail_end "DateTimeType"

  // -end- 448985D7008E detail_end "DateTimeType"

}

=======
/**
 * ab INTERLIS 2.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class DateTimeType extends BaseType {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448985D7008E detail_begin "DateTimeType"

	// -end- 448985D7008E detail_begin "DateTimeType"

	private static final long serialVersionUID = -537012496578251582L;

	// -beg- preserve=no 448E7BB201E0 head448985D7008E "unlinkAll"
	public void unlinkAll()
	// -end- 448E7BB201E0 head448985D7008E "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448E7BB201E0 throws448985D7008E "unlinkAll"

	// -end- 448E7BB201E0 throws448985D7008E "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448E7BB201E0 body448985D7008E "unlinkAll"

		setMin(null);
		setMax(null);
		super.unlinkAll();
		// -end- 448E7BB201E0 body448985D7008E "unlinkAll"
	}

	// -beg- preserve=no 448E7BB201F4 head448985D7008E "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 448E7BB201F4 head448985D7008E "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448E7BB201F4 throws448985D7008E "enumerateChildren"

	// -end- 448E7BB201F4 throws448985D7008E "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448E7BB201F4 body448985D7008E "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getMin());
		visitor.visit(getMax());
		super.enumerateChildren(visitor);
		// -end- 448E7BB201F4 body448985D7008E "enumerateChildren"
	}

	// -beg- preserve=no 4489874A0218 var448985D7008E "min"
	private DateTimeValue min = null;
	// -end- 4489874A0218 var448985D7008E "min"

	/**
	 * get current value of min
	 * 
	 * @see #setMin
	 */
	// -beg- preserve=no 4489874A0218 get_head448985D7008E "min"
	public DateTimeValue getMin()
	// -end- 4489874A0218 get_head448985D7008E "min"
	{
		// -beg- preserve=no 4489874A0218 get_body448985D7008E "min"
		return min;
		// -end- 4489874A0218 get_body448985D7008E "min"
	}

	/**
	 * set current value of min
	 * 
	 * @see #getMin
	 */
	// -beg- preserve=no 4489874A0218 set_head448985D7008E "min"
	public void setMin(DateTimeValue value1)
	// -end- 4489874A0218 set_head448985D7008E "min"
	{
		// -beg- preserve=no 4489874A0218 set_body448985D7008E "min"
		if (min != value1 && (min == null || !min.equals(value1))) {
			min = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMin"));
		}
		// -end- 4489874A0218 set_body448985D7008E "min"
	}

	// -beg- preserve=no 44898753004E var448985D7008E "max"
	private DateTimeValue max = null;
	// -end- 44898753004E var448985D7008E "max"

	/**
	 * get current value of max
	 * 
	 * @see #setMax
	 */
	// -beg- preserve=no 44898753004E get_head448985D7008E "max"
	public DateTimeValue getMax()
	// -end- 44898753004E get_head448985D7008E "max"
	{
		// -beg- preserve=no 44898753004E get_body448985D7008E "max"
		return max;
		// -end- 44898753004E get_body448985D7008E "max"
	}

	/**
	 * set current value of max
	 * 
	 * @see #getMax
	 */
	// -beg- preserve=no 44898753004E set_head448985D7008E "max"
	public void setMax(DateTimeValue value1)
	// -end- 44898753004E set_head448985D7008E "max"
	{
		// -beg- preserve=no 44898753004E set_body448985D7008E "max"
		if (max != value1 && (max == null || !max.equals(value1))) {
			max = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMax"));
		}
		// -end- 44898753004E set_body448985D7008E "max"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448985D7008E detail_end "DateTimeType"

	// -end- 448985D7008E detail_end "DateTimeType"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
