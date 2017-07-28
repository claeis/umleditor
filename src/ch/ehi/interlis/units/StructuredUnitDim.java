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


// -beg- preserve=no 394A241103A8 package "StructuredUnitDim"
package ch.ehi.interlis.units;
// -end- 394A241103A8 package "StructuredUnitDim"

// -beg- preserve=no 394A241103A8 autoimport "StructuredUnitDim"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 394A241103A8 autoimport "StructuredUnitDim"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394A241103A8 import "StructuredUnitDim"

// -end- 394A241103A8 import "StructuredUnitDim"

/** Definiert eine Dimension einer strukturierten Einheit.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:22 $
 */
public class StructuredUnitDim extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 394A241103A8 detail_begin "StructuredUnitDim"

// -end- 394A241103A8 detail_begin "StructuredUnitDim"

// -beg- preserve=no 3D4FA21800C6 head394A241103A8 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21800C6 head394A241103A8 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21800C6 throws394A241103A8 "unlinkAll"

// -end- 3D4FA21800C6 throws394A241103A8 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21800C6 body394A241103A8 "unlinkAll"

        // Role StructuredUnit: StructuredUnit object(s) may point to this
        detachUnitDef();
        setFrom(null);
        setTo(null);
        super.unlinkAll();
        // -end- 3D4FA21800C6 body394A241103A8 "unlinkAll"
}

// -beg- preserve=no 3D4FA21800C7 head394A241103A8 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21800C7 head394A241103A8 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21800C7 throws394A241103A8 "enumerateChildren"

// -end- 3D4FA21800C7 throws394A241103A8 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21800C7 body394A241103A8 "enumerateChildren"
        java.util.Iterator it=null;
        if(containsUnitDef()) visitor.visit(getUnitDef());
        visitor.visit(getFrom());
        visitor.visit(getTo());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21800C7 body394A241103A8 "enumerateChildren"
}

// -beg- preserve=no 394A243D01CA code394A241103A8 "unitDef"
private UnitDef unitDef;
// -end- 394A243D01CA code394A241103A8 "unitDef"

/** attaches a UnitDef.
 *
 *  @see #detachUnitDef
 *  @see #getUnitDef
 *  @see #containsUnitDef
 */
// -beg- preserve=no 394A243D01CA attach_head394A241103A8 "StructuredUnitDim::attachUnitDef"
public void attachUnitDef(UnitDef unitDef1)
// -end- 394A243D01CA attach_head394A241103A8 "StructuredUnitDim::attachUnitDef"
{
        // -beg- preserve=no 394A243D01CA attach_body394A241103A8 "StructuredUnitDim::attachUnitDef"
        if(unitDef!=null) {throw new java.lang.IllegalStateException("already a unitDef attached");}
        if(unitDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as unitDef");}
        unitDef = unitDef1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachUnitDef"));
        return;
        // -end- 394A243D01CA attach_body394A241103A8 "StructuredUnitDim::attachUnitDef"
}

/** disconnect the currently attached UnitDef.
 *  @see #attachUnitDef
 */
// -beg- preserve=no 394A243D01CA detach_head394A241103A8 "StructuredUnitDim::detachUnitDef"
public UnitDef detachUnitDef()
// -end- 394A243D01CA detach_head394A241103A8 "StructuredUnitDim::detachUnitDef"
{
        // -beg- preserve=no 394A243D01CA detach_body394A241103A8 "StructuredUnitDim::detachUnitDef"
        UnitDef ret = null;
        ret = unitDef;
        unitDef = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachUnitDef"));
        return ret;
        // -end- 394A243D01CA detach_body394A241103A8 "StructuredUnitDim::detachUnitDef"
}

/** get the currently attached UnitDef.
 *  @see #attachUnitDef
 */
// -beg- preserve=no 394A243D01CA get_head394A241103A8 "StructuredUnitDim::getUnitDef"
public UnitDef getUnitDef()
// -end- 394A243D01CA get_head394A241103A8 "StructuredUnitDim::getUnitDef"
{
        // -beg- preserve=no 394A243D01CA get_body394A241103A8 "StructuredUnitDim::getUnitDef"
        if(unitDef==null) {throw new java.lang.IllegalStateException("no unitDef attached");}
        return unitDef;
        // -end- 394A243D01CA get_body394A241103A8 "StructuredUnitDim::getUnitDef"
}

/** tests if there is a UnitDef attached.
 *  @see #attachUnitDef
 */
// -beg- preserve=no 394A243D01CA test_head394A241103A8 "StructuredUnitDim::containsUnitDef"
public boolean containsUnitDef()
// -end- 394A243D01CA test_head394A241103A8 "StructuredUnitDim::containsUnitDef"
{
        // -beg- preserve=no 394A243D01CA test_body394A241103A8 "StructuredUnitDim::containsUnitDef"
        return unitDef!=null;
        // -end- 394A243D01CA test_body394A241103A8 "StructuredUnitDim::containsUnitDef"
}

// -beg- preserve=no 394A24400283 var394A241103A8 "range"
private boolean range;
// -end- 394A24400283 var394A241103A8 "range"

/** get current value of range
 *  from, to gesetzt?
 *  @see #setRange
 */
// -beg- preserve=no 394A24400283 get_head394A241103A8 "range"
public boolean isRange()
// -end- 394A24400283 get_head394A241103A8 "range"
{
        // -beg- preserve=no 394A24400283 get_body394A241103A8 "range"
        return range;
        // -end- 394A24400283 get_body394A241103A8 "range"
}

/** set current value of range
 *  @see #isRange
 */
// -beg- preserve=no 394A24400283 set_head394A241103A8 "range"
public void setRange(boolean value1)
// -end- 394A24400283 set_head394A241103A8 "range"
{
        // -beg- preserve=no 394A24400283 set_body394A241103A8 "range"
        if(range != value1) {
                range = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRange"));
        }
        // -end- 394A24400283 set_body394A241103A8 "range"
}

// -beg- preserve=no 394A2454021D var394A241103A8 "from"
private IliDim from = null;
// -end- 394A2454021D var394A241103A8 "from"

/** get current value of from
 *  Untere Grenze
 *  @see #setFrom
 */
// -beg- preserve=no 394A2454021D get_head394A241103A8 "from"
public IliDim getFrom()
// -end- 394A2454021D get_head394A241103A8 "from"
{
        // -beg- preserve=no 394A2454021D get_body394A241103A8 "from"
        return from;
        // -end- 394A2454021D get_body394A241103A8 "from"
}

/** set current value of from
 *  @see #getFrom
 */
// -beg- preserve=no 394A2454021D set_head394A241103A8 "from"
public void setFrom(IliDim value1)
// -end- 394A2454021D set_head394A241103A8 "from"
{
        // -beg- preserve=no 394A2454021D set_body394A241103A8 "from"
        if(from!=value1 && (from==null || !from.equals(value1))) {
                from = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setFrom"));
        }
        // -end- 394A2454021D set_body394A241103A8 "from"
}

// -beg- preserve=no 394A24580179 var394A241103A8 "to"
private IliDim to = null;
// -end- 394A24580179 var394A241103A8 "to"

/** get current value of to
 *  Obere Grenze
 *  @see #setTo
 */
// -beg- preserve=no 394A24580179 get_head394A241103A8 "to"
public IliDim getTo()
// -end- 394A24580179 get_head394A241103A8 "to"
{
        // -beg- preserve=no 394A24580179 get_body394A241103A8 "to"
        return to;
        // -end- 394A24580179 get_body394A241103A8 "to"
}

/** set current value of to
 *  @see #getTo
 */
// -beg- preserve=no 394A24580179 set_head394A241103A8 "to"
public void setTo(IliDim value1)
// -end- 394A24580179 set_head394A241103A8 "to"
{
        // -beg- preserve=no 394A24580179 set_body394A241103A8 "to"
        if(to!=value1 && (to==null || !to.equals(value1))) {
                to = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setTo"));
        }
        // -end- 394A24580179 set_body394A241103A8 "to"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 394A241103A8 detail_end "StructuredUnitDim"

// -end- 394A241103A8 detail_end "StructuredUnitDim"

}
