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


// -beg- preserve=no 448986F900C7 package "TimeValue"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 448986F900C7 package "TimeValue"

// -beg- preserve=no 448986F900C7 autoimport "TimeValue"

// -end- 448986F900C7 autoimport "TimeValue"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 448986F900C7 import "TimeValue"

// -end- 448986F900C7 import "TimeValue"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:17 $
 */
public class TimeValue
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448986F900C7 detail_begin "TimeValue"

  // -end- 448986F900C7 detail_begin "TimeValue"

  // -beg- preserve=no 448987C50110 var448986F900C7 "hours"
  private int hours;
  // -end- 448987C50110 var448986F900C7 "hours"

  /** get current value of hours
   *  @see #setHours
   */
  // -beg- preserve=no 448987C50110 get_head448986F900C7 "hours"
  public  int getHours()
  // -end- 448987C50110 get_head448986F900C7 "hours"
  {
    // -beg- preserve=no 448987C50110 get_body448986F900C7 "hours"
    return hours;
    // -end- 448987C50110 get_body448986F900C7 "hours"
  }

  /** set current value of hours
   *  @see #getHours
   */
  // -beg- preserve=no 448987C50110 set_head448986F900C7 "hours"
  public  void setHours(int value1)
  // -end- 448987C50110 set_head448986F900C7 "hours"
  {
    // -beg- preserve=no 448987C50110 set_body448986F900C7 "hours"
    if(hours != value1){
      hours = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setHours"));
    }
    // -end- 448987C50110 set_body448986F900C7 "hours"
  }

  // -beg- preserve=no 448987CF02EB var448986F900C7 "minutes"
  private int minutes;
  // -end- 448987CF02EB var448986F900C7 "minutes"

  /** get current value of minutes
   *  @see #setMinutes
   */
  // -beg- preserve=no 448987CF02EB get_head448986F900C7 "minutes"
  public  int getMinutes()
  // -end- 448987CF02EB get_head448986F900C7 "minutes"
  {
    // -beg- preserve=no 448987CF02EB get_body448986F900C7 "minutes"
    return minutes;
    // -end- 448987CF02EB get_body448986F900C7 "minutes"
  }

  /** set current value of minutes
   *  @see #getMinutes
   */
  // -beg- preserve=no 448987CF02EB set_head448986F900C7 "minutes"
  public  void setMinutes(int value1)
  // -end- 448987CF02EB set_head448986F900C7 "minutes"
  {
    // -beg- preserve=no 448987CF02EB set_body448986F900C7 "minutes"
    if(minutes != value1){
      minutes = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMinutes"));
    }
    // -end- 448987CF02EB set_body448986F900C7 "minutes"
  }

  // -beg- preserve=no 448987D701D4 var448986F900C7 "seconds"
  private float seconds;
  // -end- 448987D701D4 var448986F900C7 "seconds"

  /** get current value of seconds
   *  @see #setSeconds
   */
  // -beg- preserve=no 448987D701D4 get_head448986F900C7 "seconds"
  public  float getSeconds()
  // -end- 448987D701D4 get_head448986F900C7 "seconds"
  {
    // -beg- preserve=no 448987D701D4 get_body448986F900C7 "seconds"
    return seconds;
    // -end- 448987D701D4 get_body448986F900C7 "seconds"
  }

  /** set current value of seconds
   *  @see #getSeconds
   */
  // -beg- preserve=no 448987D701D4 set_head448986F900C7 "seconds"
  public  void setSeconds(float value1)
  // -end- 448987D701D4 set_head448986F900C7 "seconds"
  {
    // -beg- preserve=no 448987D701D4 set_body448986F900C7 "seconds"
    if(seconds != value1){
      seconds = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSeconds"));
    }
    // -end- 448987D701D4 set_body448986F900C7 "seconds"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448986F900C7 detail_end "TimeValue"

  // -end- 448986F900C7 detail_end "TimeValue"

}

