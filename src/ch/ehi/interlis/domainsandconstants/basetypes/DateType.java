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


// -beg- preserve=no 448984AA00C7 package "DateType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 448984AA00C7 package "DateType"

// -beg- preserve=no 448984AA00C7 autoimport "DateType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.domainsandconstants.basetypes.DateValue;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 448984AA00C7 autoimport "DateType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 448984AA00C7 import "DateType"

// -end- 448984AA00C7 import "DateType"

/** ab INTERLIS 2.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class DateType extends BaseType
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448984AA00C7 detail_begin "DateType"

  // -end- 448984AA00C7 detail_begin "DateType"

  // -beg- preserve=no 448E7BF60102 head448984AA00C7 "unlinkAll"
  public void unlinkAll()
  // -end- 448E7BF60102 head448984AA00C7 "unlinkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 448E7BF60102 throws448984AA00C7 "unlinkAll"

    // -end- 448E7BF60102 throws448984AA00C7 "unlinkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 448E7BF60102 body448984AA00C7 "unlinkAll"
    
    setMin(null);
    setMax(null);
    super.unlinkAll();
    // -end- 448E7BF60102 body448984AA00C7 "unlinkAll"
    }

  // -beg- preserve=no 448E7BF60116 head448984AA00C7 "enumerateChildren"
  public void enumerateChildren(AbstractVisitor visitor)
  // -end- 448E7BF60116 head448984AA00C7 "enumerateChildren"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 448E7BF60116 throws448984AA00C7 "enumerateChildren"

    // -end- 448E7BF60116 throws448984AA00C7 "enumerateChildren"
    {
    // please fill in/modify the following section
    // -beg- preserve=no 448E7BF60116 body448984AA00C7 "enumerateChildren"
    java.util.Iterator it=null;
    visitor.visit(getMin());
    visitor.visit(getMax());
    super.enumerateChildren(visitor);
    // -end- 448E7BF60116 body448984AA00C7 "enumerateChildren"
    }

  // -beg- preserve=no 448987770186 var448984AA00C7 "min"
  private DateValue min = null;
  // -end- 448987770186 var448984AA00C7 "min"

  /** get current value of min
   *  @see #setMin
   */
  // -beg- preserve=no 448987770186 get_head448984AA00C7 "min"
  public  DateValue getMin()
  // -end- 448987770186 get_head448984AA00C7 "min"
  {
    // -beg- preserve=no 448987770186 get_body448984AA00C7 "min"
    return min;
    // -end- 448987770186 get_body448984AA00C7 "min"
  }

  /** set current value of min
   *  @see #getMin
   */
  // -beg- preserve=no 448987770186 set_head448984AA00C7 "min"
  public  void setMin(DateValue value1)
  // -end- 448987770186 set_head448984AA00C7 "min"
  {
    // -beg- preserve=no 448987770186 set_body448984AA00C7 "min"
    if(min!=value1 && (min==null || !min.equals(value1))){
      min = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMin"));
    }
    // -end- 448987770186 set_body448984AA00C7 "min"
  }

  // -beg- preserve=no 4489877D003A var448984AA00C7 "max"
  private DateValue max = null;
  // -end- 4489877D003A var448984AA00C7 "max"

  /** get current value of max
   *  @see #setMax
   */
  // -beg- preserve=no 4489877D003A get_head448984AA00C7 "max"
  public  DateValue getMax()
  // -end- 4489877D003A get_head448984AA00C7 "max"
  {
    // -beg- preserve=no 4489877D003A get_body448984AA00C7 "max"
    return max;
    // -end- 4489877D003A get_body448984AA00C7 "max"
  }

  /** set current value of max
   *  @see #getMax
   */
  // -beg- preserve=no 4489877D003A set_head448984AA00C7 "max"
  public  void setMax(DateValue value1)
  // -end- 4489877D003A set_head448984AA00C7 "max"
  {
    // -beg- preserve=no 4489877D003A set_body448984AA00C7 "max"
    if(max!=value1 && (max==null || !max.equals(value1))){
      max = value1;
      ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMax"));
    }
    // -end- 4489877D003A set_body448984AA00C7 "max"
  }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 448984AA00C7 detail_end "DateType"

  // -end- 448984AA00C7 detail_end "DateType"

}

