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


// -beg- preserve=no 394882EB009D package "NumericType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 394882EB009D package "NumericType"

// -beg- preserve=no 394882EB009D autoimport "NumericType"
import ch.ehi.interlis.domainsandconstants.basetypes.NumericalType;
import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 394882EB009D autoimport "NumericType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394882EB009D import "NumericType"

// -end- 394882EB009D import "NumericType"

/** Definiert einen numerischen Datentyp.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:25 $
 */
public class NumericType extends NumericalType implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 394882EB009D detail_begin "NumericType"

// -end- 394882EB009D detail_begin "NumericType"

// -beg- preserve=no 3D4FA21B00D4 head394882EB009D "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21B00D4 head394882EB009D "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21B00D4 throws394882EB009D "unlinkAll"

// -end- 3D4FA21B00D4 throws394882EB009D "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21B00D4 body394882EB009D "unlinkAll"

        setMinDec(null);
        setMaxDec(null);
        super.unlinkAll();
        // -end- 3D4FA21B00D4 body394882EB009D "unlinkAll"
}

// -beg- preserve=no 3D4FA21B00DE head394882EB009D "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21B00DE head394882EB009D "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21B00DE throws394882EB009D "enumerateChildren"

// -end- 3D4FA21B00DE throws394882EB009D "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21B00DE body394882EB009D "enumerateChildren"
        java.util.Iterator it=null;
        visitor.visit(getMinDec());
        visitor.visit(getMaxDec());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21B00DE body394882EB009D "enumerateChildren"
}

// -beg- preserve=no 39489FB30336 var394882EB009D "rangeDefined"
private boolean rangeDefined;
// -end- 39489FB30336 var394882EB009D "rangeDefined"

/** get current value of rangeDefined
 *  sind minDec und maxDec definiert
 *  @see #setRangeDefined
 */
// -beg- preserve=no 39489FB30336 get_head394882EB009D "rangeDefined"
public boolean isRangeDefined()
// -end- 39489FB30336 get_head394882EB009D "rangeDefined"
{
        // -beg- preserve=no 39489FB30336 get_body394882EB009D "rangeDefined"
        return rangeDefined;
        // -end- 39489FB30336 get_body394882EB009D "rangeDefined"
}

/** set current value of rangeDefined
 *  @see #isRangeDefined
 */
// -beg- preserve=no 39489FB30336 set_head394882EB009D "rangeDefined"
public void setRangeDefined(boolean value1)
// -end- 39489FB30336 set_head394882EB009D "rangeDefined"
{
        // -beg- preserve=no 39489FB30336 set_body394882EB009D "rangeDefined"
        if(rangeDefined != value1) {
                rangeDefined = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRangeDefined"));
        }
        // -end- 39489FB30336 set_body394882EB009D "rangeDefined"
}

// -beg- preserve=no 39489FCF012E var394882EB009D "minDec"
private IliDim minDec = null;
// -end- 39489FCF012E var394882EB009D "minDec"

/** get current value of minDec
 *  min Wert
 *  @see #setMinDec
 */
// -beg- preserve=no 39489FCF012E get_head394882EB009D "minDec"
public IliDim getMinDec()
// -end- 39489FCF012E get_head394882EB009D "minDec"
{
        // -beg- preserve=no 39489FCF012E get_body394882EB009D "minDec"
        return minDec;
        // -end- 39489FCF012E get_body394882EB009D "minDec"
}

/** set current value of minDec
 *  @see #getMinDec
 */
// -beg- preserve=no 39489FCF012E set_head394882EB009D "minDec"
public void setMinDec(IliDim value1)
// -end- 39489FCF012E set_head394882EB009D "minDec"
{
        // -beg- preserve=no 39489FCF012E set_body394882EB009D "minDec"
        if(minDec!=value1 && (minDec==null || !minDec.equals(value1))) {
                minDec = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMinDec"));
        }
        // -end- 39489FCF012E set_body394882EB009D "minDec"
}

// -beg- preserve=no 39489FD70298 var394882EB009D "maxDec"
private IliDim maxDec = null;
// -end- 39489FD70298 var394882EB009D "maxDec"

/** get current value of maxDec
 *  max Wert
 *  @see #setMaxDec
 */
// -beg- preserve=no 39489FD70298 get_head394882EB009D "maxDec"
public IliDim getMaxDec()
// -end- 39489FD70298 get_head394882EB009D "maxDec"
{
        // -beg- preserve=no 39489FD70298 get_body394882EB009D "maxDec"
        return maxDec;
        // -end- 39489FD70298 get_body394882EB009D "maxDec"
}

/** set current value of maxDec
 *  @see #getMaxDec
 */
// -beg- preserve=no 39489FD70298 set_head394882EB009D "maxDec"
public void setMaxDec(IliDim value1)
// -end- 39489FD70298 set_head394882EB009D "maxDec"
{
        // -beg- preserve=no 39489FD70298 set_body394882EB009D "maxDec"
        if(maxDec!=value1 && (maxDec==null || !maxDec.equals(value1))) {
                maxDec = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMaxDec"));
        }
        // -end- 39489FD70298 set_body394882EB009D "maxDec"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 394882EB009D detail_end "NumericType"

// -end- 394882EB009D detail_end "NumericType"

}
