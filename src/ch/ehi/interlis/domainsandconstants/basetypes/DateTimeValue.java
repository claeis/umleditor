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

// -beg- preserve=no 448986FF02C4 package "DateTimeValue"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 448986FF02C4 package "DateTimeValue"

// -beg- preserve=no 448986FF02C4 autoimport "DateTimeValue"

// -end- 448986FF02C4 autoimport "DateTimeValue"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 448986FF02C4 import "DateTimeValue"

// -end- 448986FF02C4 import "DateTimeValue"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class DateTimeValue {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448986FF02C4 detail_begin "DateTimeValue"

	// -end- 448986FF02C4 detail_begin "DateTimeValue"

	// -beg- preserve=no 448988110192 var448986FF02C4 "year"
	private int year;
	// -end- 448988110192 var448986FF02C4 "year"

	/**
	 * get current value of year
	 * 
	 * @see #setYear
	 */
	// -beg- preserve=no 448988110192 get_head448986FF02C4 "year"
	public int getYear()
	// -end- 448988110192 get_head448986FF02C4 "year"
	{
		// -beg- preserve=no 448988110192 get_body448986FF02C4 "year"
		return year;
		// -end- 448988110192 get_body448986FF02C4 "year"
	}

	/**
	 * set current value of year
	 * 
	 * @see #getYear
	 */
	// -beg- preserve=no 448988110192 set_head448986FF02C4 "year"
	public void setYear(int value1)
	// -end- 448988110192 set_head448986FF02C4 "year"
	{
		// -beg- preserve=no 448988110192 set_body448986FF02C4 "year"
		if (year != value1) {
			year = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setYear"));
		}
		// -end- 448988110192 set_body448986FF02C4 "year"
	}

	// -beg- preserve=no 448988180246 var448986FF02C4 "month"
	private int month;
	// -end- 448988180246 var448986FF02C4 "month"

	/**
	 * get current value of month
	 * 
	 * @see #setMonth
	 */
	// -beg- preserve=no 448988180246 get_head448986FF02C4 "month"
	public int getMonth()
	// -end- 448988180246 get_head448986FF02C4 "month"
	{
		// -beg- preserve=no 448988180246 get_body448986FF02C4 "month"
		return month;
		// -end- 448988180246 get_body448986FF02C4 "month"
	}

	/**
	 * set current value of month
	 * 
	 * @see #getMonth
	 */
	// -beg- preserve=no 448988180246 set_head448986FF02C4 "month"
	public void setMonth(int value1)
	// -end- 448988180246 set_head448986FF02C4 "month"
	{
		// -beg- preserve=no 448988180246 set_body448986FF02C4 "month"
		if (month != value1) {
			month = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMonth"));
		}
		// -end- 448988180246 set_body448986FF02C4 "month"
	}

	// -beg- preserve=no 4489881B039F var448986FF02C4 "day"
	private int day;
	// -end- 4489881B039F var448986FF02C4 "day"

	/**
	 * get current value of day
	 * 
	 * @see #setDay
	 */
	// -beg- preserve=no 4489881B039F get_head448986FF02C4 "day"
	public int getDay()
	// -end- 4489881B039F get_head448986FF02C4 "day"
	{
		// -beg- preserve=no 4489881B039F get_body448986FF02C4 "day"
		return day;
		// -end- 4489881B039F get_body448986FF02C4 "day"
	}

	/**
	 * set current value of day
	 * 
	 * @see #getDay
	 */
	// -beg- preserve=no 4489881B039F set_head448986FF02C4 "day"
	public void setDay(int value1)
	// -end- 4489881B039F set_head448986FF02C4 "day"
	{
		// -beg- preserve=no 4489881B039F set_body448986FF02C4 "day"
		if (day != value1) {
			day = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setDay"));
		}
		// -end- 4489881B039F set_body448986FF02C4 "day"
	}

	// -beg- preserve=no 4489882702AC var448986FF02C4 "hours"
	private int hours;
	// -end- 4489882702AC var448986FF02C4 "hours"

	/**
	 * get current value of hours
	 * 
	 * @see #setHours
	 */
	// -beg- preserve=no 4489882702AC get_head448986FF02C4 "hours"
	public int getHours()
	// -end- 4489882702AC get_head448986FF02C4 "hours"
	{
		// -beg- preserve=no 4489882702AC get_body448986FF02C4 "hours"
		return hours;
		// -end- 4489882702AC get_body448986FF02C4 "hours"
	}

	/**
	 * set current value of hours
	 * 
	 * @see #getHours
	 */
	// -beg- preserve=no 4489882702AC set_head448986FF02C4 "hours"
	public void setHours(int value1)
	// -end- 4489882702AC set_head448986FF02C4 "hours"
	{
		// -beg- preserve=no 4489882702AC set_body448986FF02C4 "hours"
		if (hours != value1) {
			hours = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setHours"));
		}
		// -end- 4489882702AC set_body448986FF02C4 "hours"
	}

	// -beg- preserve=no 4489882B0026 var448986FF02C4 "minutes"
	private int minutes;
	// -end- 4489882B0026 var448986FF02C4 "minutes"

	/**
	 * get current value of minutes
	 * 
	 * @see #setMinutes
	 */
	// -beg- preserve=no 4489882B0026 get_head448986FF02C4 "minutes"
	public int getMinutes()
	// -end- 4489882B0026 get_head448986FF02C4 "minutes"
	{
		// -beg- preserve=no 4489882B0026 get_body448986FF02C4 "minutes"
		return minutes;
		// -end- 4489882B0026 get_body448986FF02C4 "minutes"
	}

	/**
	 * set current value of minutes
	 * 
	 * @see #getMinutes
	 */
	// -beg- preserve=no 4489882B0026 set_head448986FF02C4 "minutes"
	public void setMinutes(int value1)
	// -end- 4489882B0026 set_head448986FF02C4 "minutes"
	{
		// -beg- preserve=no 4489882B0026 set_body448986FF02C4 "minutes"
		if (minutes != value1) {
			minutes = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMinutes"));
		}
		// -end- 4489882B0026 set_body448986FF02C4 "minutes"
	}

	// -beg- preserve=no 4489882E0085 var448986FF02C4 "seconds"
	private float seconds;
	// -end- 4489882E0085 var448986FF02C4 "seconds"

	/**
	 * get current value of seconds
	 * 
	 * @see #setSeconds
	 */
	// -beg- preserve=no 4489882E0085 get_head448986FF02C4 "seconds"
	public float getSeconds()
	// -end- 4489882E0085 get_head448986FF02C4 "seconds"
	{
		// -beg- preserve=no 4489882E0085 get_body448986FF02C4 "seconds"
		return seconds;
		// -end- 4489882E0085 get_body448986FF02C4 "seconds"
	}

	/**
	 * set current value of seconds
	 * 
	 * @see #getSeconds
	 */
	// -beg- preserve=no 4489882E0085 set_head448986FF02C4 "seconds"
	public void setSeconds(float value1)
	// -end- 4489882E0085 set_head448986FF02C4 "seconds"
	{
		// -beg- preserve=no 4489882E0085 set_body448986FF02C4 "seconds"
		if (seconds != value1) {
			seconds = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSeconds"));
		}
		// -end- 4489882E0085 set_body448986FF02C4 "seconds"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 448986FF02C4 detail_end "DateTimeValue"

	// -end- 448986FF02C4 detail_end "DateTimeValue"

}
