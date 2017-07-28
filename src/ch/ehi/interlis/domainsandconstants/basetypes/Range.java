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


// -beg- preserve=no 358A670101A0 package "Range"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 358A670101A0 package "Range"

// -beg- preserve=no 358A670101A0 autoimport "Range"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A670101A0 autoimport "Range"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A670101A0 import "Range"

// -end- 358A670101A0 import "Range"

/** Wird nur in INTERLIS1 verwendet.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:26 $
 */
public class Range extends BaseType implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 358A670101A0 detail_begin "Range"

// -end- 358A670101A0 detail_begin "Range"

// -beg- preserve=no 3D4FA21B007A head358A670101A0 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21B007A head358A670101A0 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21B007A throws358A670101A0 "unlinkAll"

// -end- 3D4FA21B007A throws358A670101A0 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21B007A body358A670101A0 "unlinkAll"

        setMini(null);
        setMaxi(null);
        super.unlinkAll();
        // -end- 3D4FA21B007A body358A670101A0 "unlinkAll"
}

// -beg- preserve=no 3D4FA21B007B head358A670101A0 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21B007B head358A670101A0 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21B007B throws358A670101A0 "enumerateChildren"

// -end- 3D4FA21B007B throws358A670101A0 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21B007B body358A670101A0 "enumerateChildren"
        java.util.Iterator it=null;
        visitor.visit(getMini());
        visitor.visit(getMaxi());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21B007B body358A670101A0 "enumerateChildren"
}

// -beg- preserve=no 358A68BD0108 var358A670101A0 "mini"
private IliDim mini = null;
// -end- 358A68BD0108 var358A670101A0 "mini"

/** get current value of mini
 *  min Wert
 *  @see #setMini
 */
// -beg- preserve=no 358A68BD0108 get_head358A670101A0 "mini"
public IliDim getMini()
// -end- 358A68BD0108 get_head358A670101A0 "mini"
{
        // -beg- preserve=no 358A68BD0108 get_body358A670101A0 "mini"
        return mini;
        // -end- 358A68BD0108 get_body358A670101A0 "mini"
}

/** set current value of mini
 *  @see #getMini
 */
// -beg- preserve=no 358A68BD0108 set_head358A670101A0 "mini"
public void setMini(IliDim value1)
// -end- 358A68BD0108 set_head358A670101A0 "mini"
{
        // -beg- preserve=no 358A68BD0108 set_body358A670101A0 "mini"
        if(mini!=value1 && (mini==null || !mini.equals(value1))) {
                mini = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMini"));
        }
        // -end- 358A68BD0108 set_body358A670101A0 "mini"
}

// -beg- preserve=no 358A68C303D7 var358A670101A0 "maxi"
private IliDim maxi = null;
// -end- 358A68C303D7 var358A670101A0 "maxi"

/** get current value of maxi
 *  max Wert
 *  @see #setMaxi
 */
// -beg- preserve=no 358A68C303D7 get_head358A670101A0 "maxi"
public IliDim getMaxi()
// -end- 358A68C303D7 get_head358A670101A0 "maxi"
{
        // -beg- preserve=no 358A68C303D7 get_body358A670101A0 "maxi"
        return maxi;
        // -end- 358A68C303D7 get_body358A670101A0 "maxi"
}

/** set current value of maxi
 *  @see #getMaxi
 */
// -beg- preserve=no 358A68C303D7 set_head358A670101A0 "maxi"
public void setMaxi(IliDim value1)
// -end- 358A68C303D7 set_head358A670101A0 "maxi"
{
        // -beg- preserve=no 358A68C303D7 set_body358A670101A0 "maxi"
        if(maxi!=value1 && (maxi==null || !maxi.equals(value1))) {
                maxi = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMaxi"));
        }
        // -end- 358A68C303D7 set_body358A670101A0 "maxi"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 358A670101A0 detail_end "Range"

// -end- 358A670101A0 detail_end "Range"

}
