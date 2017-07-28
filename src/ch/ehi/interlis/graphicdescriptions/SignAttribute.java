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


// -beg- preserve=no 3961F2DF02E2 package "SignAttribute"
package ch.ehi.interlis.graphicdescriptions;
// -end- 3961F2DF02E2 package "SignAttribute"

// -beg- preserve=no 3961F2DF02E2 autoimport "SignAttribute"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.graphicdescriptions.CondSigParamAss;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3961F2DF02E2 autoimport "SignAttribute"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3961F2DF02E2 import "SignAttribute"

// -end- 3961F2DF02E2 import "SignAttribute"

/** Definiert ein Signatur-Attribut.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:59 $
 */
public class SignAttribute extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3961F2DF02E2 detail_begin "SignAttribute"

// -end- 3961F2DF02E2 detail_begin "SignAttribute"

// -beg- preserve=no 3D4FA2190077 head3961F2DF02E2 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA2190077 head3961F2DF02E2 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2190077 throws3961F2DF02E2 "unlinkAll"

// -end- 3D4FA2190077 throws3961F2DF02E2 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2190077 body3961F2DF02E2 "unlinkAll"

        // Role GraphicDef: GraphicDef object(s) may point to this
        detachSign();
        clearCondSigParamAss();
        setName(null);
        super.unlinkAll();
        // -end- 3D4FA2190077 body3961F2DF02E2 "unlinkAll"
}

// -beg- preserve=no 3D4FA2190078 head3961F2DF02E2 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2190078 head3961F2DF02E2 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2190078 throws3961F2DF02E2 "enumerateChildren"

// -end- 3D4FA2190078 throws3961F2DF02E2 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2190078 body3961F2DF02E2 "enumerateChildren"
        java.util.Iterator it=null;
        if(containsSign()) visitor.visit(getSign());
        it=iteratorCondSigParamAss(); while(it.hasNext()) visitor.visit(it.next());
        visitor.visit(getName());
        super.enumerateChildren(visitor);
        // -end- 3D4FA2190078 body3961F2DF02E2 "enumerateChildren"
}

// -beg- preserve=no 3961F6D800D2 code3961F2DF02E2 "sign"
private AbstractClassDef sign;
// -end- 3961F6D800D2 code3961F2DF02E2 "sign"

/** attaches a Sign.
 *
 *  @see #detachSign
 *  @see #getSign
 *  @see #containsSign
 */
// -beg- preserve=no 3961F6D800D2 attach_head3961F2DF02E2 "SignAttribute::attachSign"
public void attachSign(AbstractClassDef sign1)
// -end- 3961F6D800D2 attach_head3961F2DF02E2 "SignAttribute::attachSign"
{
        // -beg- preserve=no 3961F6D800D2 attach_body3961F2DF02E2 "SignAttribute::attachSign"
        if(sign!=null) {throw new java.lang.IllegalStateException("already a sign attached");}
        if(sign1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as sign");}
        sign = sign1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachSign"));
        return;
        // -end- 3961F6D800D2 attach_body3961F2DF02E2 "SignAttribute::attachSign"
}

/** disconnect the currently attached Sign.
 *  @see #attachSign
 */
// -beg- preserve=no 3961F6D800D2 detach_head3961F2DF02E2 "SignAttribute::detachSign"
public AbstractClassDef detachSign()
// -end- 3961F6D800D2 detach_head3961F2DF02E2 "SignAttribute::detachSign"
{
        // -beg- preserve=no 3961F6D800D2 detach_body3961F2DF02E2 "SignAttribute::detachSign"
        AbstractClassDef ret = null;
        ret = sign;
        sign = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachSign"));
        return ret;
        // -end- 3961F6D800D2 detach_body3961F2DF02E2 "SignAttribute::detachSign"
}

/** get the currently attached Sign.
 *  @see #attachSign
 */
// -beg- preserve=no 3961F6D800D2 get_head3961F2DF02E2 "SignAttribute::getSign"
public AbstractClassDef getSign()
// -end- 3961F6D800D2 get_head3961F2DF02E2 "SignAttribute::getSign"
{
        // -beg- preserve=no 3961F6D800D2 get_body3961F2DF02E2 "SignAttribute::getSign"
        if(sign==null) {throw new java.lang.IllegalStateException("no sign attached");}
        return sign;
        // -end- 3961F6D800D2 get_body3961F2DF02E2 "SignAttribute::getSign"
}

/** tests if there is a Sign attached.
 *  @see #attachSign
 */
// -beg- preserve=no 3961F6D800D2 test_head3961F2DF02E2 "SignAttribute::containsSign"
public boolean containsSign()
// -end- 3961F6D800D2 test_head3961F2DF02E2 "SignAttribute::containsSign"
{
        // -beg- preserve=no 3961F6D800D2 test_body3961F2DF02E2 "SignAttribute::containsSign"
        return sign!=null;
        // -end- 3961F6D800D2 test_body3961F2DF02E2 "SignAttribute::containsSign"
}

// -beg- preserve=no 3961F7E8020A code3961F2DF02E2 "condSigParamAss"
private java.util.Set condSigParamAss = new java.util.HashSet();
// -end- 3961F7E8020A code3961F2DF02E2 "condSigParamAss"

/** add a CondSigParamAss.
 *
 *  @see #removeCondSigParamAss
 *  @see #containsCondSigParamAss
 *  @see #iteratorCondSigParamAss
 *  @see #clearCondSigParamAss
 *  @see #sizeCondSigParamAss
 */
// -beg- preserve=no 3961F7E8020A add_head3961F2DF02E2 "SignAttribute::addCondSigParamAss"
public void addCondSigParamAss(CondSigParamAss condSigParamAss1)
// -end- 3961F7E8020A add_head3961F2DF02E2 "SignAttribute::addCondSigParamAss"
{
        // -beg- preserve=no 3961F7E8020A add_body3961F2DF02E2 "SignAttribute::addCondSigParamAss"
        condSigParamAss.add(condSigParamAss1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addCondSigParamAss"));
        return;
        // -end- 3961F7E8020A add_body3961F2DF02E2 "SignAttribute::addCondSigParamAss"
}

/** disconnect a CondSigParamAss.
 *  @see #addCondSigParamAss
 */
// -beg- preserve=no 3961F7E8020A remove_head3961F2DF02E2 "SignAttribute::removeCondSigParamAss"
public CondSigParamAss removeCondSigParamAss(CondSigParamAss condSigParamAss1)
// -end- 3961F7E8020A remove_head3961F2DF02E2 "SignAttribute::removeCondSigParamAss"
{
        // -beg- preserve=no 3961F7E8020A remove_body3961F2DF02E2 "SignAttribute::removeCondSigParamAss"
        CondSigParamAss ret=null;
        if(condSigParamAss1==null || !condSigParamAss.contains(condSigParamAss1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = condSigParamAss1;
        condSigParamAss.remove(condSigParamAss1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeCondSigParamAss"));
        return ret;
        // -end- 3961F7E8020A remove_body3961F2DF02E2 "SignAttribute::removeCondSigParamAss"
}

/** tests if a given CondSigParamAss is connected.
 *  @see #addCondSigParamAss
 */
// -beg- preserve=no 3961F7E8020A test_head3961F2DF02E2 "SignAttribute::containsCondSigParamAss"
public boolean containsCondSigParamAss(CondSigParamAss condSigParamAss1)
// -end- 3961F7E8020A test_head3961F2DF02E2 "SignAttribute::containsCondSigParamAss"
{
        // -beg- preserve=no 3961F7E8020A test_body3961F2DF02E2 "SignAttribute::containsCondSigParamAss"
        return condSigParamAss.contains(condSigParamAss1);
        // -end- 3961F7E8020A test_body3961F2DF02E2 "SignAttribute::containsCondSigParamAss"
}

/** used to enumerate all connected CondSigParamAsss.
 *  @see #addCondSigParamAss
 */
// -beg- preserve=no 3961F7E8020A get_all_head3961F2DF02E2 "SignAttribute::iteratorCondSigParamAss"
public java.util.Iterator iteratorCondSigParamAss()
// -end- 3961F7E8020A get_all_head3961F2DF02E2 "SignAttribute::iteratorCondSigParamAss"
{
        // -beg- preserve=no 3961F7E8020A get_all_body3961F2DF02E2 "SignAttribute::iteratorCondSigParamAss"
        return condSigParamAss.iterator();
        // -end- 3961F7E8020A get_all_body3961F2DF02E2 "SignAttribute::iteratorCondSigParamAss"
}

/** disconnect all CondSigParamAsss.
 *  @see #addCondSigParamAss
 */
// -beg- preserve=no 3961F7E8020A remove_all_head3961F2DF02E2 "SignAttribute::clearCondSigParamAss"
public void clearCondSigParamAss()
// -end- 3961F7E8020A remove_all_head3961F2DF02E2 "SignAttribute::clearCondSigParamAss"
{
        // -beg- preserve=no 3961F7E8020A remove_all_body3961F2DF02E2 "SignAttribute::clearCondSigParamAss"
        if(sizeCondSigParamAss()>0) {
                condSigParamAss.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearCondSigParamAss"));
        }
        // -end- 3961F7E8020A remove_all_body3961F2DF02E2 "SignAttribute::clearCondSigParamAss"
}

/** returns the number of CondSigParamAsss.
 *  @see #addCondSigParamAss
 */
// -beg- preserve=no 3961F7E8020A size_head3961F2DF02E2 "SignAttribute::sizeCondSigParamAss"
public int sizeCondSigParamAss()
// -end- 3961F7E8020A size_head3961F2DF02E2 "SignAttribute::sizeCondSigParamAss"
{
        // -beg- preserve=no 3961F7E8020A size_body3961F2DF02E2 "SignAttribute::sizeCondSigParamAss"
        return condSigParamAss.size();
        // -end- 3961F7E8020A size_body3961F2DF02E2 "SignAttribute::sizeCondSigParamAss"
}

// -beg- preserve=no 3961F5870159 var3961F2DF02E2 "name"
private NlsString name = null;
// -end- 3961F5870159 var3961F2DF02E2 "name"

/** get current value of name
 *  Name des Attributes
 *  @see #setName
 */
// -beg- preserve=no 3961F5870159 get_head3961F2DF02E2 "name"
public NlsString getName()
// -end- 3961F5870159 get_head3961F2DF02E2 "name"
{
        // -beg- preserve=no 3961F5870159 get_body3961F2DF02E2 "name"
        return name;
        // -end- 3961F5870159 get_body3961F2DF02E2 "name"
}

/** set current value of name
 *  @see #getName
 */
// -beg- preserve=no 3961F5870159 set_head3961F2DF02E2 "name"
public void setName(NlsString value1)
// -end- 3961F5870159 set_head3961F2DF02E2 "name"
{
        // -beg- preserve=no 3961F5870159 set_body3961F2DF02E2 "name"
        if(name!=value1 && (name==null || !name.equals(value1))) {
                name = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setName"));
        }
        // -end- 3961F5870159 set_body3961F2DF02E2 "name"
}

// -beg- preserve=no 3961F58B021D var3961F2DF02E2 "properties"
private long properties;
// -end- 3961F58B021D var3961F2DF02E2 "properties"

/** get current value of properties
 *  Vererbungseigenschaften
 *  @see #setProperties
 */
// -beg- preserve=no 3961F58B021D get_head3961F2DF02E2 "properties"
public long getProperties()
// -end- 3961F58B021D get_head3961F2DF02E2 "properties"
{
        // -beg- preserve=no 3961F58B021D get_body3961F2DF02E2 "properties"
        return properties;
        // -end- 3961F58B021D get_body3961F2DF02E2 "properties"
}

/** set current value of properties
 *  @see #getProperties
 */
// -beg- preserve=no 3961F58B021D set_head3961F2DF02E2 "properties"
public void setProperties(long value1)
// -end- 3961F58B021D set_head3961F2DF02E2 "properties"
{
        // -beg- preserve=no 3961F58B021D set_body3961F2DF02E2 "properties"
        if(properties != value1) {
                properties = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setProperties"));
        }
        // -end- 3961F58B021D set_body3961F2DF02E2 "properties"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3961F2DF02E2 detail_end "SignAttribute"

// -end- 3961F2DF02E2 detail_end "SignAttribute"

}
