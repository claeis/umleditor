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


// -beg- preserve=no 394885320023 package "StructuredUnitType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 394885320023 package "StructuredUnitType"

// -beg- preserve=no 394885320023 autoimport "StructuredUnitType"
import ch.ehi.interlis.domainsandconstants.basetypes.NumericalType;
import ch.ehi.interlis.domainsandconstants.basetypes.StructDec;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 394885320023 autoimport "StructuredUnitType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394885320023 import "StructuredUnitType"

// -end- 394885320023 import "StructuredUnitType"

/** Definiert einen strukturierten Datentyp.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:33 $
 */
public class StructuredUnitType extends NumericalType implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 394885320023 detail_begin "StructuredUnitType"

// -end- 394885320023 detail_begin "StructuredUnitType"

// -beg- preserve=no 3D4FA21B00E8 head394885320023 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21B00E8 head394885320023 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21B00E8 throws394885320023 "unlinkAll"

// -end- 3D4FA21B00E8 throws394885320023 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21B00E8 body394885320023 "unlinkAll"

        setMinStruc(null);
        setMaxStruc(null);
        super.unlinkAll();
        // -end- 3D4FA21B00E8 body394885320023 "unlinkAll"
}

// -beg- preserve=no 3D4FA21B00E9 head394885320023 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21B00E9 head394885320023 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21B00E9 throws394885320023 "enumerateChildren"

// -end- 3D4FA21B00E9 throws394885320023 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21B00E9 body394885320023 "enumerateChildren"
        java.util.Iterator it=null;
        visitor.visit(getMinStruc());
        visitor.visit(getMaxStruc());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21B00E9 body394885320023 "enumerateChildren"
}

// -beg- preserve=no 3948D0830142 var394885320023 "minStruc"
private StructDec minStruc = null;
// -end- 3948D0830142 var394885320023 "minStruc"

/** get current value of minStruc
 *  min Wert
 *  @see #setMinStruc
 */
// -beg- preserve=no 3948D0830142 get_head394885320023 "minStruc"
public StructDec getMinStruc()
// -end- 3948D0830142 get_head394885320023 "minStruc"
{
        // -beg- preserve=no 3948D0830142 get_body394885320023 "minStruc"
        return minStruc;
        // -end- 3948D0830142 get_body394885320023 "minStruc"
}

/** set current value of minStruc
 *  @see #getMinStruc
 */
// -beg- preserve=no 3948D0830142 set_head394885320023 "minStruc"
public void setMinStruc(StructDec value1)
// -end- 3948D0830142 set_head394885320023 "minStruc"
{
        // -beg- preserve=no 3948D0830142 set_body394885320023 "minStruc"
        if(minStruc!=value1 && (minStruc==null || !minStruc.equals(value1))) {
                minStruc = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMinStruc"));
        }
        // -end- 3948D0830142 set_body394885320023 "minStruc"
}

// -beg- preserve=no 3948D08A039B var394885320023 "maxStruc"
private StructDec maxStruc = null;
// -end- 3948D08A039B var394885320023 "maxStruc"

/** get current value of maxStruc
 *  max Wert
 *  @see #setMaxStruc
 */
// -beg- preserve=no 3948D08A039B get_head394885320023 "maxStruc"
public StructDec getMaxStruc()
// -end- 3948D08A039B get_head394885320023 "maxStruc"
{
        // -beg- preserve=no 3948D08A039B get_body394885320023 "maxStruc"
        return maxStruc;
        // -end- 3948D08A039B get_body394885320023 "maxStruc"
}

/** set current value of maxStruc
 *  @see #getMaxStruc
 */
// -beg- preserve=no 3948D08A039B set_head394885320023 "maxStruc"
public void setMaxStruc(StructDec value1)
// -end- 3948D08A039B set_head394885320023 "maxStruc"
{
        // -beg- preserve=no 3948D08A039B set_body394885320023 "maxStruc"
        if(maxStruc!=value1 && (maxStruc==null || !maxStruc.equals(value1))) {
                maxStruc = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMaxStruc"));
        }
        // -end- 3948D08A039B set_body394885320023 "maxStruc"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 394885320023 detail_end "StructuredUnitType"

// -end- 394885320023 detail_end "StructuredUnitType"

}
