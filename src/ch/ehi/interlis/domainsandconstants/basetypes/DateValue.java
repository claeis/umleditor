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
// -beg- preserve=no 448986ED0318 package "DateValue"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 448986ED0318 package "DateValue"

// -beg- preserve=no 448986ED0318 autoimport "DateValue"

// -end- 448986ED0318 autoimport "DateValue"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 448986ED0318 import "DateValue"

// -end- 448986ED0318 import "DateValue"

<<<<<<< HEAD
/** @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class DateValue
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448986ED0318 detail_begin "DateValue"

  // -end- 448986ED0318 detail_begin "DateValue"

  // -beg- preserve=no 4489879A03CB var448986ED0318 "year"
  private int year;
  // -end- 4489879A03CB var448986ED0318 "year"

  /** get current value of year
   *  @see #setYear
   */
  // -beg- preserve=no 4489879A03CB get_head448986ED0318 "year"
  public  int getYear()
  // -end- 4489879A03CB get_head448986ED0318 "year"
  {
    // -beg- preserve=no 4489879A03CB get_body448986ED0318 "year"
    return year;
    // -end- 4489879A03CB get_body448986ED0318 "year"
  }

  /** set current value of year
   *  @see #getYear
   */
  // -beg- preserve=no 4489879A03CB set_head448986ED0318 "year"
  public  void setYear(int value1)
  // -end- 4489879A03CB set_head448986ED0318 "year"
  {
    // -beg- preserve=no 4489879A03CB set_body448986ED0318 "year"
    if(year != value1){
      year = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setYear"));
    }
    // -end- 4489879A03CB set_body448986ED0318 "year"
  }

  // -beg- preserve=no 448987910075 var448986ED0318 "month"
  private int month;
  // -end- 448987910075 var448986ED0318 "month"

  /** get current value of month
   *  @see #setMonth
   */
  // -beg- preserve=no 448987910075 get_head448986ED0318 "month"
  public  int getMonth()
  // -end- 448987910075 get_head448986ED0318 "month"
  {
    // -beg- preserve=no 448987910075 get_body448986ED0318 "month"
    return month;
    // -end- 448987910075 get_body448986ED0318 "month"
  }

  /** set current value of month
   *  @see #getMonth
   */
  // -beg- preserve=no 448987910075 set_head448986ED0318 "month"
  public  void setMonth(int value1)
  // -end- 448987910075 set_head448986ED0318 "month"
  {
    // -beg- preserve=no 448987910075 set_body448986ED0318 "month"
    if(month != value1){
      month = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMonth"));
    }
    // -end- 448987910075 set_body448986ED0318 "month"
  }

  // -beg- preserve=no 4489878C024F var448986ED0318 "day"
  private int day;
  // -end- 4489878C024F var448986ED0318 "day"

  /** get current value of day
   *  @see #setDay
   */
  // -beg- preserve=no 4489878C024F get_head448986ED0318 "day"
  public  int getDay()
  // -end- 4489878C024F get_head448986ED0318 "day"
  {
    // -beg- preserve=no 4489878C024F get_body448986ED0318 "day"
    return day;
    // -end- 4489878C024F get_body448986ED0318 "day"
  }

  /** set current value of day
   *  @see #getDay
   */
  // -beg- preserve=no 4489878C024F set_head448986ED0318 "day"
  public  void setDay(int value1)
  // -end- 4489878C024F set_head448986ED0318 "day"
  {
    // -beg- preserve=no 4489878C024F set_body448986ED0318 "day"
    if(day != value1){
      day = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDay"));
    }
    // -end- 4489878C024F set_body448986ED0318 "day"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448986ED0318 detail_end "DateValue"

  // -end- 448986ED0318 detail_end "DateValue"

}

=======
/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class DateValue {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448986ED0318 detail_begin "DateValue"

	// -end- 448986ED0318 detail_begin "DateValue"

	// -beg- preserve=no 4489879A03CB var448986ED0318 "year"
	private int year;
	// -end- 4489879A03CB var448986ED0318 "year"

	/**
	 * get current value of year
	 * 
	 * @see #setYear
	 */
	// -beg- preserve=no 4489879A03CB get_head448986ED0318 "year"
	public int getYear()
	// -end- 4489879A03CB get_head448986ED0318 "year"
	{
		// -beg- preserve=no 4489879A03CB get_body448986ED0318 "year"
		return year;
		// -end- 4489879A03CB get_body448986ED0318 "year"
	}

	/**
	 * set current value of year
	 * 
	 * @see #getYear
	 */
	// -beg- preserve=no 4489879A03CB set_head448986ED0318 "year"
	public void setYear(int value1)
	// -end- 4489879A03CB set_head448986ED0318 "year"
	{
		// -beg- preserve=no 4489879A03CB set_body448986ED0318 "year"
		if (year != value1) {
			year = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setYear"));
		}
		// -end- 4489879A03CB set_body448986ED0318 "year"
	}

	// -beg- preserve=no 448987910075 var448986ED0318 "month"
	private int month;
	// -end- 448987910075 var448986ED0318 "month"

	/**
	 * get current value of month
	 * 
	 * @see #setMonth
	 */
	// -beg- preserve=no 448987910075 get_head448986ED0318 "month"
	public int getMonth()
	// -end- 448987910075 get_head448986ED0318 "month"
	{
		// -beg- preserve=no 448987910075 get_body448986ED0318 "month"
		return month;
		// -end- 448987910075 get_body448986ED0318 "month"
	}

	/**
	 * set current value of month
	 * 
	 * @see #getMonth
	 */
	// -beg- preserve=no 448987910075 set_head448986ED0318 "month"
	public void setMonth(int value1)
	// -end- 448987910075 set_head448986ED0318 "month"
	{
		// -beg- preserve=no 448987910075 set_body448986ED0318 "month"
		if (month != value1) {
			month = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMonth"));
		}
		// -end- 448987910075 set_body448986ED0318 "month"
	}

	// -beg- preserve=no 4489878C024F var448986ED0318 "day"
	private int day;
	// -end- 4489878C024F var448986ED0318 "day"

	/**
	 * get current value of day
	 * 
	 * @see #setDay
	 */
	// -beg- preserve=no 4489878C024F get_head448986ED0318 "day"
	public int getDay()
	// -end- 4489878C024F get_head448986ED0318 "day"
	{
		// -beg- preserve=no 4489878C024F get_body448986ED0318 "day"
		return day;
		// -end- 4489878C024F get_body448986ED0318 "day"
	}

	/**
	 * set current value of day
	 * 
	 * @see #getDay
	 */
	// -beg- preserve=no 4489878C024F set_head448986ED0318 "day"
	public void setDay(int value1)
	// -end- 4489878C024F set_head448986ED0318 "day"
	{
		// -beg- preserve=no 4489878C024F set_body448986ED0318 "day"
		if (day != value1) {
			day = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setDay"));
		}
		// -end- 4489878C024F set_body448986ED0318 "day"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448986ED0318 detail_end "DateValue"

	// -end- 448986ED0318 detail_end "DateValue"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
