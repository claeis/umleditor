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


// -beg- preserve=no 3949E16F0308 package "DerivedUnit"
package ch.ehi.interlis.units;
// -end- 3949E16F0308 package "DerivedUnit"

// -beg- preserve=no 3949E16F0308 autoimport "DerivedUnit"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.units.DerivedUnitFactor;
import ch.ehi.interlis.units.DerivedUnitKind;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3949E16F0308 autoimport "DerivedUnit"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3949E16F0308 import "DerivedUnit"

// -end- 3949E16F0308 import "DerivedUnit"

/** Definiert eine abgeleitete Einheit.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:19 $
 */
public class DerivedUnit extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3949E16F0308 detail_begin "DerivedUnit"

// -end- 3949E16F0308 detail_begin "DerivedUnit"

// -beg- preserve=no 3D4FA21800B2 head3949E16F0308 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21800B2 head3949E16F0308 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21800B2 throws3949E16F0308 "unlinkAll"

// -end- 3D4FA21800B2 throws3949E16F0308 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21800B2 body3949E16F0308 "unlinkAll"

        // Role UnitDef: UnitDef object(s) may point to this
        clearDerivedUnitFactor();
        setFunction(null);
        super.unlinkAll();
        // -end- 3D4FA21800B2 body3949E16F0308 "unlinkAll"
}

// -beg- preserve=no 3D4FA21800B3 head3949E16F0308 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21800B3 head3949E16F0308 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21800B3 throws3949E16F0308 "enumerateChildren"

// -end- 3D4FA21800B3 throws3949E16F0308 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21800B3 body3949E16F0308 "enumerateChildren"
        java.util.Iterator it=null;
        it=iteratorDerivedUnitFactor(); while(it.hasNext()) visitor.visit(it.next());
        visitor.visit(getFunction());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21800B3 body3949E16F0308 "enumerateChildren"
}

// -beg- preserve=no 3949E7A200ED code3949E16F0308 "derivedUnitFactor"
private java.util.Set derivedUnitFactor = new java.util.HashSet();
// -end- 3949E7A200ED code3949E16F0308 "derivedUnitFactor"

/** add a DerivedUnitFactor.
 *
 *  @see #removeDerivedUnitFactor
 *  @see #containsDerivedUnitFactor
 *  @see #iteratorDerivedUnitFactor
 *  @see #clearDerivedUnitFactor
 *  @see #sizeDerivedUnitFactor
 */
// -beg- preserve=no 3949E7A200ED add_head3949E16F0308 "DerivedUnit::addDerivedUnitFactor"
public void addDerivedUnitFactor(DerivedUnitFactor derivedUnitFactor1)
// -end- 3949E7A200ED add_head3949E16F0308 "DerivedUnit::addDerivedUnitFactor"
{
        // -beg- preserve=no 3949E7A200ED add_body3949E16F0308 "DerivedUnit::addDerivedUnitFactor"
        derivedUnitFactor.add(derivedUnitFactor1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDerivedUnitFactor"));
        return;
        // -end- 3949E7A200ED add_body3949E16F0308 "DerivedUnit::addDerivedUnitFactor"
}

/** disconnect a DerivedUnitFactor.
 *  @see #addDerivedUnitFactor
 */
// -beg- preserve=no 3949E7A200ED remove_head3949E16F0308 "DerivedUnit::removeDerivedUnitFactor"
public DerivedUnitFactor removeDerivedUnitFactor(DerivedUnitFactor derivedUnitFactor1)
// -end- 3949E7A200ED remove_head3949E16F0308 "DerivedUnit::removeDerivedUnitFactor"
{
        // -beg- preserve=no 3949E7A200ED remove_body3949E16F0308 "DerivedUnit::removeDerivedUnitFactor"
        DerivedUnitFactor ret=null;
        if(derivedUnitFactor1==null || !derivedUnitFactor.contains(derivedUnitFactor1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = derivedUnitFactor1;
        derivedUnitFactor.remove(derivedUnitFactor1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDerivedUnitFactor"));
        return ret;
        // -end- 3949E7A200ED remove_body3949E16F0308 "DerivedUnit::removeDerivedUnitFactor"
}

/** tests if a given DerivedUnitFactor is connected.
 *  @see #addDerivedUnitFactor
 */
// -beg- preserve=no 3949E7A200ED test_head3949E16F0308 "DerivedUnit::containsDerivedUnitFactor"
public boolean containsDerivedUnitFactor(DerivedUnitFactor derivedUnitFactor1)
// -end- 3949E7A200ED test_head3949E16F0308 "DerivedUnit::containsDerivedUnitFactor"
{
        // -beg- preserve=no 3949E7A200ED test_body3949E16F0308 "DerivedUnit::containsDerivedUnitFactor"
        return derivedUnitFactor.contains(derivedUnitFactor1);
        // -end- 3949E7A200ED test_body3949E16F0308 "DerivedUnit::containsDerivedUnitFactor"
}

/** used to enumerate all connected DerivedUnitFactors.
 *  @see #addDerivedUnitFactor
 */
// -beg- preserve=no 3949E7A200ED get_all_head3949E16F0308 "DerivedUnit::iteratorDerivedUnitFactor"
public java.util.Iterator iteratorDerivedUnitFactor()
// -end- 3949E7A200ED get_all_head3949E16F0308 "DerivedUnit::iteratorDerivedUnitFactor"
{
        // -beg- preserve=no 3949E7A200ED get_all_body3949E16F0308 "DerivedUnit::iteratorDerivedUnitFactor"
        return derivedUnitFactor.iterator();
        // -end- 3949E7A200ED get_all_body3949E16F0308 "DerivedUnit::iteratorDerivedUnitFactor"
}

/** disconnect all DerivedUnitFactors.
 *  @see #addDerivedUnitFactor
 */
// -beg- preserve=no 3949E7A200ED remove_all_head3949E16F0308 "DerivedUnit::clearDerivedUnitFactor"
public void clearDerivedUnitFactor()
// -end- 3949E7A200ED remove_all_head3949E16F0308 "DerivedUnit::clearDerivedUnitFactor"
{
        // -beg- preserve=no 3949E7A200ED remove_all_body3949E16F0308 "DerivedUnit::clearDerivedUnitFactor"
        if(sizeDerivedUnitFactor()>0) {
                derivedUnitFactor.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDerivedUnitFactor"));
        }
        // -end- 3949E7A200ED remove_all_body3949E16F0308 "DerivedUnit::clearDerivedUnitFactor"
}

/** returns the number of DerivedUnitFactors.
 *  @see #addDerivedUnitFactor
 */
// -beg- preserve=no 3949E7A200ED size_head3949E16F0308 "DerivedUnit::sizeDerivedUnitFactor"
public int sizeDerivedUnitFactor()
// -end- 3949E7A200ED size_head3949E16F0308 "DerivedUnit::sizeDerivedUnitFactor"
{
        // -beg- preserve=no 3949E7A200ED size_body3949E16F0308 "DerivedUnit::sizeDerivedUnitFactor"
        return derivedUnitFactor.size();
        // -end- 3949E7A200ED size_body3949E16F0308 "DerivedUnit::sizeDerivedUnitFactor"
}

// -beg- preserve=no 3949E6C50117 var3949E16F0308 "kind"
private int kind;
// -end- 3949E6C50117 var3949E16F0308 "kind"

/** get current value of kind
 *  DIRECT, FACTOR oder FUNCTION
 *  @see ch.ehi.interlis.units.DerivedUnitKind
 *  @see #setKind
 */
// -beg- preserve=no 3949E6C50117 get_head3949E16F0308 "kind"
public int getKind()
// -end- 3949E6C50117 get_head3949E16F0308 "kind"
{
        // -beg- preserve=no 3949E6C50117 get_body3949E16F0308 "kind"
        return kind;
        // -end- 3949E6C50117 get_body3949E16F0308 "kind"
}

/** set current value of kind
 *  @see ch.ehi.interlis.units.DerivedUnitKind
 *  @see #getKind
 */
// -beg- preserve=no 3949E6C50117 set_head3949E16F0308 "kind"
public void setKind(int value1)
// -end- 3949E6C50117 set_head3949E16F0308 "kind"
{
        // -beg- preserve=no 3949E6C50117 set_body3949E16F0308 "kind"
        if(kind != value1) {
                kind = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
        }
        // -end- 3949E6C50117 set_body3949E16F0308 "kind"
}

// -beg- preserve=no 39620A72025E var3949E16F0308 "function"
private NlsString function = null;
// -end- 39620A72025E var3949E16F0308 "function"

/** get current value of function
 *  Erläuterung der Funktion die verwendet werden soll, um die Einheit abzuleiten.
 *  @see #setFunction
 */
// -beg- preserve=no 39620A72025E get_head3949E16F0308 "function"
public NlsString getFunction()
// -end- 39620A72025E get_head3949E16F0308 "function"
{
        // -beg- preserve=no 39620A72025E get_body3949E16F0308 "function"
        return function;
        // -end- 39620A72025E get_body3949E16F0308 "function"
}

/** set current value of function
 *  @see #getFunction
 */
// -beg- preserve=no 39620A72025E set_head3949E16F0308 "function"
public void setFunction(NlsString value1)
// -end- 39620A72025E set_head3949E16F0308 "function"
{
        // -beg- preserve=no 39620A72025E set_body3949E16F0308 "function"
        if(function!=value1 && (function==null || !function.equals(value1))) {
                function = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setFunction"));
        }
        // -end- 39620A72025E set_body3949E16F0308 "function"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3949E16F0308 detail_end "DerivedUnit"

// -end- 3949E16F0308 detail_end "DerivedUnit"

}
