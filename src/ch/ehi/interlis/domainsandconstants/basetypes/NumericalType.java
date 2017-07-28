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


// -beg- preserve=no 3948DB550222 package "NumericalType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 3948DB550222 package "NumericalType"

// -beg- preserve=no 3948DB550222 autoimport "NumericalType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.domainsandconstants.basetypes.RefSys;
import ch.ehi.interlis.domainsandconstants.basetypes.RotationKind;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3948DB550222 autoimport "NumericalType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3948DB550222 import "NumericalType"

// -end- 3948DB550222 import "NumericalType"

/** Definiert Grundeigenschaften für numerische Datentypen.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:23 $
 */
public abstract class NumericalType extends BaseType implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3948DB550222 detail_begin "NumericalType"

// -end- 3948DB550222 detail_begin "NumericalType"

// -beg- preserve=no 3D4FA21B01E3 head3948DB550222 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21B01E3 head3948DB550222 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21B01E3 throws3948DB550222 "unlinkAll"

// -end- 3D4FA21B01E3 throws3948DB550222 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21B01E3 body3948DB550222 "unlinkAll"

        detachUnitDef();
        detachRefSys();
        // Role CoordinateType: CoordinateType object(s) may point to this
        super.unlinkAll();
        // -end- 3D4FA21B01E3 body3948DB550222 "unlinkAll"
}

// -beg- preserve=no 3D4FA21B01ED head3948DB550222 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21B01ED head3948DB550222 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21B01ED throws3948DB550222 "enumerateChildren"

// -end- 3D4FA21B01ED throws3948DB550222 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21B01ED body3948DB550222 "enumerateChildren"
        java.util.Iterator it=null;
        if(containsRefSys()) visitor.visit(getRefSys());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21B01ED body3948DB550222 "enumerateChildren"
}

// -beg- preserve=no 3948A0C1035E code3948DB550222 "unitDef"
private UnitDef unitDef;
// -end- 3948A0C1035E code3948DB550222 "unitDef"

/** attaches a UnitDef.
 *
 *  @see #detachUnitDef
 *  @see #getUnitDef
 *  @see #containsUnitDef
 */
// -beg- preserve=no 3948A0C1035E attach_head3948DB550222 "NumericalType::attachUnitDef"
public void attachUnitDef(UnitDef unitDef1)
// -end- 3948A0C1035E attach_head3948DB550222 "NumericalType::attachUnitDef"
{
        // -beg- preserve=no 3948A0C1035E attach_body3948DB550222 "NumericalType::attachUnitDef"
        if(unitDef!=null) {throw new java.lang.IllegalStateException("already a unitDef attached");}
        if(unitDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as unitDef");}
        unitDef = unitDef1;
        unitDef1._linkNumericalType(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachUnitDef"));
        return;
        // -end- 3948A0C1035E attach_body3948DB550222 "NumericalType::attachUnitDef"
}

/** disconnect the currently attached UnitDef.
 *  @see #attachUnitDef
 */
// -beg- preserve=no 3948A0C1035E detach_head3948DB550222 "NumericalType::detachUnitDef"
public UnitDef detachUnitDef()
// -end- 3948A0C1035E detach_head3948DB550222 "NumericalType::detachUnitDef"
{
        // -beg- preserve=no 3948A0C1035E detach_body3948DB550222 "NumericalType::detachUnitDef"
        UnitDef ret = null;
        if(unitDef!=null) {
                unitDef._unlinkNumericalType(this);
                ret = unitDef;
                unitDef = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachUnitDef"));
        return ret;
        // -end- 3948A0C1035E detach_body3948DB550222 "NumericalType::detachUnitDef"
}

/** get the currently attached UnitDef.
 *  @see #attachUnitDef
 */
// -beg- preserve=no 3948A0C1035E get_head3948DB550222 "NumericalType::getUnitDef"
public UnitDef getUnitDef()
// -end- 3948A0C1035E get_head3948DB550222 "NumericalType::getUnitDef"
{
        // -beg- preserve=no 3948A0C1035E get_body3948DB550222 "NumericalType::getUnitDef"
        if(unitDef==null) {throw new java.lang.IllegalStateException("no unitDef attached");}
        return unitDef;
        // -end- 3948A0C1035E get_body3948DB550222 "NumericalType::getUnitDef"
}

/** tests if there is a UnitDef attached.
 *  @see #attachUnitDef
 */
// -beg- preserve=no 3948A0C1035E test_head3948DB550222 "NumericalType::containsUnitDef"
public boolean containsUnitDef()
// -end- 3948A0C1035E test_head3948DB550222 "NumericalType::containsUnitDef"
{
        // -beg- preserve=no 3948A0C1035E test_body3948DB550222 "NumericalType::containsUnitDef"
        return unitDef!=null;
        // -end- 3948A0C1035E test_body3948DB550222 "NumericalType::containsUnitDef"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3948A0C1035E _link_body3948DB550222 "NumericalType::_linkUnitDef"
public void _linkUnitDef(UnitDef unitDef1)
{
        unitDef = unitDef1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkUnitDef"));
        return;
}
// -end- 3948A0C1035E _link_body3948DB550222 "NumericalType::_linkUnitDef"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3948A0C1035E _unlink_body3948DB550222 "NumericalType::_unlinkUnitDef"
public void _unlinkUnitDef(UnitDef unitDef1)
{
        unitDef = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkUnitDef"));
        return;
}
// -end- 3948A0C1035E _unlink_body3948DB550222 "NumericalType::_unlinkUnitDef"

// -beg- preserve=no 3948A1D70212 code3948DB550222 "refSys"
private RefSys refSys;
// -end- 3948A1D70212 code3948DB550222 "refSys"

/** attaches a RefSys.
 *
 *  @see #detachRefSys
 *  @see #getRefSys
 *  @see #containsRefSys
 */
// -beg- preserve=no 3948A1D70212 attach_head3948DB550222 "NumericalType::attachRefSys"
public void attachRefSys(RefSys refSys1)
// -end- 3948A1D70212 attach_head3948DB550222 "NumericalType::attachRefSys"
{
        // -beg- preserve=no 3948A1D70212 attach_body3948DB550222 "NumericalType::attachRefSys"
        if(refSys!=null) {throw new java.lang.IllegalStateException("already a refSys attached");}
        if(refSys1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as refSys");}
        refSys = refSys1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachRefSys"));
        return;
        // -end- 3948A1D70212 attach_body3948DB550222 "NumericalType::attachRefSys"
}

/** disconnect the currently attached RefSys.
 *  @see #attachRefSys
 */
// -beg- preserve=no 3948A1D70212 detach_head3948DB550222 "NumericalType::detachRefSys"
public RefSys detachRefSys()
// -end- 3948A1D70212 detach_head3948DB550222 "NumericalType::detachRefSys"
{
        // -beg- preserve=no 3948A1D70212 detach_body3948DB550222 "NumericalType::detachRefSys"
        RefSys ret = null;
        ret = refSys;
        refSys = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachRefSys"));
        return ret;
        // -end- 3948A1D70212 detach_body3948DB550222 "NumericalType::detachRefSys"
}

/** get the currently attached RefSys.
 *  @see #attachRefSys
 */
// -beg- preserve=no 3948A1D70212 get_head3948DB550222 "NumericalType::getRefSys"
public RefSys getRefSys()
// -end- 3948A1D70212 get_head3948DB550222 "NumericalType::getRefSys"
{
        // -beg- preserve=no 3948A1D70212 get_body3948DB550222 "NumericalType::getRefSys"
        if(refSys==null) {throw new java.lang.IllegalStateException("no refSys attached");}
        return refSys;
        // -end- 3948A1D70212 get_body3948DB550222 "NumericalType::getRefSys"
}

/** tests if there is a RefSys attached.
 *  @see #attachRefSys
 */
// -beg- preserve=no 3948A1D70212 test_head3948DB550222 "NumericalType::containsRefSys"
public boolean containsRefSys()
// -end- 3948A1D70212 test_head3948DB550222 "NumericalType::containsRefSys"
{
        // -beg- preserve=no 3948A1D70212 test_body3948DB550222 "NumericalType::containsRefSys"
        return refSys!=null;
        // -end- 3948A1D70212 test_body3948DB550222 "NumericalType::containsRefSys"
}

// -beg- preserve=no 3948D09F000C var3948DB550222 "circular"
private boolean circular;
// -end- 3948D09F000C var3948DB550222 "circular"

/** get current value of circular
 *  Ist der Wereberich zirkulär.
 *  @see #setCircular
 */
// -beg- preserve=no 3948D09F000C get_head3948DB550222 "circular"
public boolean isCircular()
// -end- 3948D09F000C get_head3948DB550222 "circular"
{
        // -beg- preserve=no 3948D09F000C get_body3948DB550222 "circular"
        return circular;
        // -end- 3948D09F000C get_body3948DB550222 "circular"
}

/** set current value of circular
 *  @see #isCircular
 */
// -beg- preserve=no 3948D09F000C set_head3948DB550222 "circular"
public void setCircular(boolean value1)
// -end- 3948D09F000C set_head3948DB550222 "circular"
{
        // -beg- preserve=no 3948D09F000C set_body3948DB550222 "circular"
        if(circular != value1) {
                circular = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setCircular"));
        }
        // -end- 3948D09F000C set_body3948DB550222 "circular"
}

// -beg- preserve=no 3948D14202C4 var3948DB550222 "direction"
private int direction = RotationKind.UNDEFINED;
// -end- 3948D14202C4 var3948DB550222 "direction"

/** get current value of direction
 *  UNDEFINED, CLOCKWISE oder COUNTERCLOCKWISE
 *  @see ch.ehi.interlis.domainsandconstants.basetypes.RotationKind
 *  @see #setDirection
 */
// -beg- preserve=no 3948D14202C4 get_head3948DB550222 "direction"
public int getDirection()
// -end- 3948D14202C4 get_head3948DB550222 "direction"
{
        // -beg- preserve=no 3948D14202C4 get_body3948DB550222 "direction"
        return direction;
        // -end- 3948D14202C4 get_body3948DB550222 "direction"
}

/** set current value of direction
 *  @see ch.ehi.interlis.domainsandconstants.basetypes.RotationKind
 *  @see #getDirection
 */
// -beg- preserve=no 3948D14202C4 set_head3948DB550222 "direction"
public void setDirection(int value1)
// -end- 3948D14202C4 set_head3948DB550222 "direction"
{
        // -beg- preserve=no 3948D14202C4 set_body3948DB550222 "direction"
        if(direction != value1) {
                direction = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDirection"));
        }
        // -end- 3948D14202C4 set_body3948DB550222 "direction"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3948DB550222 detail_end "NumericalType"

// -end- 3948DB550222 detail_end "NumericalType"

}
