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


// -beg- preserve=no 3D21C62B03BA package "ClassDef"
package ch.ehi.interlis.modeltopicclass;
// -end- 3D21C62B03BA package "ClassDef"

// -beg- preserve=no 3D21C62B03BA autoimport "ClassDef"
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.metaobjects.ParameterDef;
import ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType;
import ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType;
import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
import ch.ehi.interlis.modeltopicclass.ClassDefKind;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3D21C62B03BA autoimport "ClassDef"
import ch.ehi.basics.types.NlsString;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3D21C62B03BA import "ClassDef"

// -end- 3D21C62B03BA import "ClassDef"

/** @author Claude Eisenhut
 *  @version $Revision: 1.19 $ $Date: 2003/12/21 16:25:30 $
 */
public class ClassDef extends AbstractClassDef
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3D21C62B03BA detail_begin "ClassDef"

// -end- 3D21C62B03BA detail_begin "ClassDef"

// -beg- preserve=no 3D4FA21A01B9 head3D21C62B03BA "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21A01B9 head3D21C62B03BA "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21A01B9 throws3D21C62B03BA "unlinkAll"

// -end- 3D4FA21A01B9 throws3D21C62B03BA "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21A01B9 body3D21C62B03BA "unlinkAll"

        clearParameterDef();
        clearRestrictedStructAttrType();
        clearStructAttrType();
        detachSurfaceType();
        clearLineFormTypeDef();
        super.unlinkAll();
        // -end- 3D4FA21A01B9 body3D21C62B03BA "unlinkAll"
}

// -beg- preserve=no 3D4FA21A01BA head3D21C62B03BA "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21A01BA head3D21C62B03BA "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21A01BA throws3D21C62B03BA "enumerateChildren"

// -end- 3D4FA21A01BA throws3D21C62B03BA "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21A01BA body3D21C62B03BA "enumerateChildren"
        java.util.Iterator it=null;
        it=iteratorParameterDef(); while(it.hasNext()) visitor.visit(it.next());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21A01BA body3D21C62B03BA "enumerateChildren"
}

// -beg- preserve=no 3941016100B0 code3D21C62B03BA "parameterDef"
private java.util.List parameterDef = new java.util.ArrayList();
// -end- 3941016100B0 code3D21C62B03BA "parameterDef"

/** add a ParameterDef.
 *
 *  @see #removeParameterDef
 *  @see #containsParameterDef
 *  @see #iteratorParameterDef
 *  @see #clearParameterDef
 *  @see #sizeParameterDef
 */
// -beg- preserve=no 3941016100B0 add_head3D21C62B03BA "ClassDef::addParameterDef"
public void addParameterDef(ParameterDef parameterDef1)
// -end- 3941016100B0 add_head3D21C62B03BA "ClassDef::addParameterDef"
{
        // -beg- preserve=no 3941016100B0 add_body3D21C62B03BA "ClassDef::addParameterDef"
        parameterDef.add(parameterDef1);
        parameterDef1._linkClassDef(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addParameterDef"));
        return;
        // -end- 3941016100B0 add_body3D21C62B03BA "ClassDef::addParameterDef"
}

// -beg- preserve=no 3941016100B0 add2_head3D21C62B03BA "ClassDef::add2ParameterDef"
public void addParameterDef(int index,ParameterDef parameterDef1)
// -end- 3941016100B0 add2_head3D21C62B03BA "ClassDef::add2ParameterDef"
{
        // -beg- preserve=no 3941016100B0 add2_body3D21C62B03BA "ClassDef::add2ParameterDef"
        parameterDef.add(index,parameterDef1);
        parameterDef1._linkClassDef(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addParameterDef"));
        return;
        // -end- 3941016100B0 add2_body3D21C62B03BA "ClassDef::add2ParameterDef"
}

/** disconnect a ParameterDef.
 *  @see #addParameterDef
 */
// -beg- preserve=no 3941016100B0 remove_head3D21C62B03BA "ClassDef::removeParameterDef"
public ParameterDef removeParameterDef(ParameterDef parameterDef1)
// -end- 3941016100B0 remove_head3D21C62B03BA "ClassDef::removeParameterDef"
{
        // -beg- preserve=no 3941016100B0 remove_body3D21C62B03BA "ClassDef::removeParameterDef"
        ParameterDef ret=null;
        if(parameterDef1==null || !parameterDef.contains(parameterDef1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = parameterDef1;
        parameterDef.remove(parameterDef1);
        parameterDef1._unlinkClassDef(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeParameterDef"));
        return ret;
        // -end- 3941016100B0 remove_body3D21C62B03BA "ClassDef::removeParameterDef"
}

/** disconnect a ParameterDef.
 *  @see #addParameterDef
 */
// -beg- preserve=no 3941016100B0 remove2_head3D21C62B03BA "ClassDef::remove2ParameterDef"
public ParameterDef removeParameterDef(int index)
// -end- 3941016100B0 remove2_head3D21C62B03BA "ClassDef::remove2ParameterDef"
{
        // -beg- preserve=no 3941016100B0 remove2_body3D21C62B03BA "ClassDef::remove2ParameterDef"
        ParameterDef ret=null;
        ret = (ParameterDef)parameterDef.remove(index);
        ret._unlinkClassDef(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeParameterDef"));
        return ret;
        // -end- 3941016100B0 remove2_body3D21C62B03BA "ClassDef::remove2ParameterDef"
}

/** change a ParameterDef.
 *  @see #addParameterDef
 */
// -beg- preserve=no 3941016100B0 set_head3D21C62B03BA "ClassDef::setParameterDef"
public ParameterDef setParameterDef(int index,ParameterDef parameterDef1)
// -end- 3941016100B0 set_head3D21C62B03BA "ClassDef::setParameterDef"
{
        // -beg- preserve=no 3941016100B0 set_body3D21C62B03BA "ClassDef::setParameterDef"
        ParameterDef ret=null;
        ret = (ParameterDef)parameterDef.set(index,parameterDef1);
        ret._unlinkClassDef(this);
        parameterDef1._linkClassDef(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setParameterDef"));
        return ret;
        // -end- 3941016100B0 set_body3D21C62B03BA "ClassDef::setParameterDef"
}

/** tests if a given ParameterDef is connected.
 *  @see #addParameterDef
 */
// -beg- preserve=no 3941016100B0 test_head3D21C62B03BA "ClassDef::containsParameterDef"
public boolean containsParameterDef(ParameterDef parameterDef1)
// -end- 3941016100B0 test_head3D21C62B03BA "ClassDef::containsParameterDef"
{
        // -beg- preserve=no 3941016100B0 test_body3D21C62B03BA "ClassDef::containsParameterDef"
        return parameterDef.contains(parameterDef1);
        // -end- 3941016100B0 test_body3D21C62B03BA "ClassDef::containsParameterDef"
}

/** used to enumerate all connected ParameterDefs.
 *  @see #addParameterDef
 */
// -beg- preserve=no 3941016100B0 get_all_head3D21C62B03BA "ClassDef::iteratorParameterDef"
public java.util.Iterator iteratorParameterDef()
// -end- 3941016100B0 get_all_head3D21C62B03BA "ClassDef::iteratorParameterDef"
{
        // -beg- preserve=no 3941016100B0 get_all_body3D21C62B03BA "ClassDef::iteratorParameterDef"
        return parameterDef.iterator();
        // -end- 3941016100B0 get_all_body3D21C62B03BA "ClassDef::iteratorParameterDef"
}

/** disconnect all ParameterDefs.
 *  @see #addParameterDef
 */
// -beg- preserve=no 3941016100B0 remove_all_head3D21C62B03BA "ClassDef::clearParameterDef"
public void clearParameterDef()
// -end- 3941016100B0 remove_all_head3D21C62B03BA "ClassDef::clearParameterDef"
{
        // -beg- preserve=no 3941016100B0 remove_all_body3D21C62B03BA "ClassDef::clearParameterDef"
        if(sizeParameterDef()>0) {
                for(java.util.Iterator p = parameterDef.iterator(); p.hasNext(); ) {
                        ((ParameterDef)p.next())._unlinkClassDef(this);
                }
                parameterDef.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearParameterDef"));
        }
        // -end- 3941016100B0 remove_all_body3D21C62B03BA "ClassDef::clearParameterDef"
}

/** returns the number of ParameterDefs.
 *  @see #addParameterDef
 */
// -beg- preserve=no 3941016100B0 size_head3D21C62B03BA "ClassDef::sizeParameterDef"
public int sizeParameterDef()
// -end- 3941016100B0 size_head3D21C62B03BA "ClassDef::sizeParameterDef"
{
        // -beg- preserve=no 3941016100B0 size_body3D21C62B03BA "ClassDef::sizeParameterDef"
        return parameterDef.size();
        // -end- 3941016100B0 size_body3D21C62B03BA "ClassDef::sizeParameterDef"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3941016100B0 _link_body3D21C62B03BA "ClassDef::_linkParameterDef"
public void _linkParameterDef(ParameterDef parameterDef1)
{
        parameterDef.add(parameterDef1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkParameterDef"));
        return;
}
// -end- 3941016100B0 _link_body3D21C62B03BA "ClassDef::_linkParameterDef"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3941016100B0 _unlink_body3D21C62B03BA "ClassDef::_unlinkParameterDef"
public void _unlinkParameterDef(ParameterDef parameterDef1)
{
        parameterDef.remove(parameterDef1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkParameterDef"));
        return;
}
// -end- 3941016100B0 _unlink_body3D21C62B03BA "ClassDef::_unlinkParameterDef"

// -beg- preserve=no 4EF99B6B02E9 code3D21C62B03BA "restrictedStructAttrType"
private java.util.Set restrictedStructAttrType = new java.util.HashSet();
// -end- 4EF99B6B02E9 code3D21C62B03BA "restrictedStructAttrType"

/** add a RestrictedStructAttrType.
 *
 *  @see #removeRestrictedStructAttrType
 *  @see #containsRestrictedStructAttrType
 *  @see #iteratorRestrictedStructAttrType
 *  @see #clearRestrictedStructAttrType
 *  @see #sizeRestrictedStructAttrType
 */
// -beg- preserve=no 4EF99B6B02E9 add_head3D21C62B03BA "ClassDef::addRestrictedStructAttrType"
public void addRestrictedStructAttrType(StructAttrType restrictedStructAttrType1)
// -end- 4EF99B6B02E9 add_head3D21C62B03BA "ClassDef::addRestrictedStructAttrType"
{
        // -beg- preserve=no 4EF99B6B02E9 add_body3D21C62B03BA "ClassDef::addRestrictedStructAttrType"
        restrictedStructAttrType.add(restrictedStructAttrType1);
        restrictedStructAttrType1._linkRestrictedTo(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addRestrictedStructAttrType"));
        return;
        // -end- 4EF99B6B02E9 add_body3D21C62B03BA "ClassDef::addRestrictedStructAttrType"
}

/** disconnect a RestrictedStructAttrType.
 *  @see #addRestrictedStructAttrType
 */
// -beg- preserve=no 4EF99B6B02E9 remove_head3D21C62B03BA "ClassDef::removeRestrictedStructAttrType"
public StructAttrType removeRestrictedStructAttrType(StructAttrType restrictedStructAttrType1)
// -end- 4EF99B6B02E9 remove_head3D21C62B03BA "ClassDef::removeRestrictedStructAttrType"
{
        // -beg- preserve=no 4EF99B6B02E9 remove_body3D21C62B03BA "ClassDef::removeRestrictedStructAttrType"
        StructAttrType ret=null;
        if(restrictedStructAttrType1==null || !restrictedStructAttrType.contains(restrictedStructAttrType1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = restrictedStructAttrType1;
        restrictedStructAttrType.remove(restrictedStructAttrType1);
        restrictedStructAttrType1._unlinkRestrictedTo(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeRestrictedStructAttrType"));
        return ret;
        // -end- 4EF99B6B02E9 remove_body3D21C62B03BA "ClassDef::removeRestrictedStructAttrType"
}

/** tests if a given RestrictedStructAttrType is connected.
 *  @see #addRestrictedStructAttrType
 */
// -beg- preserve=no 4EF99B6B02E9 test_head3D21C62B03BA "ClassDef::containsRestrictedStructAttrType"
public boolean containsRestrictedStructAttrType(StructAttrType restrictedStructAttrType1)
// -end- 4EF99B6B02E9 test_head3D21C62B03BA "ClassDef::containsRestrictedStructAttrType"
{
        // -beg- preserve=no 4EF99B6B02E9 test_body3D21C62B03BA "ClassDef::containsRestrictedStructAttrType"
        return restrictedStructAttrType.contains(restrictedStructAttrType1);
        // -end- 4EF99B6B02E9 test_body3D21C62B03BA "ClassDef::containsRestrictedStructAttrType"
}

/** used to enumerate all connected RestrictedStructAttrTypes.
 *  @see #addRestrictedStructAttrType
 */
// -beg- preserve=no 4EF99B6B02E9 get_all_head3D21C62B03BA "ClassDef::iteratorRestrictedStructAttrType"
public java.util.Iterator iteratorRestrictedStructAttrType()
// -end- 4EF99B6B02E9 get_all_head3D21C62B03BA "ClassDef::iteratorRestrictedStructAttrType"
{
        // -beg- preserve=no 4EF99B6B02E9 get_all_body3D21C62B03BA "ClassDef::iteratorRestrictedStructAttrType"
        return restrictedStructAttrType.iterator();
        // -end- 4EF99B6B02E9 get_all_body3D21C62B03BA "ClassDef::iteratorRestrictedStructAttrType"
}

/** disconnect all RestrictedStructAttrTypes.
 *  @see #addRestrictedStructAttrType
 */
// -beg- preserve=no 4EF99B6B02E9 remove_all_head3D21C62B03BA "ClassDef::clearRestrictedStructAttrType"
public void clearRestrictedStructAttrType()
// -end- 4EF99B6B02E9 remove_all_head3D21C62B03BA "ClassDef::clearRestrictedStructAttrType"
{
        // -beg- preserve=no 4EF99B6B02E9 remove_all_body3D21C62B03BA "ClassDef::clearRestrictedStructAttrType"
        if(sizeRestrictedStructAttrType()>0) {
                for(java.util.Iterator p = restrictedStructAttrType.iterator(); p.hasNext(); ) {
                        ((StructAttrType)p.next())._unlinkRestrictedTo(this);
                }
                restrictedStructAttrType.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearRestrictedStructAttrType"));
        }
        // -end- 4EF99B6B02E9 remove_all_body3D21C62B03BA "ClassDef::clearRestrictedStructAttrType"
}

/** returns the number of RestrictedStructAttrTypes.
 *  @see #addRestrictedStructAttrType
 */
// -beg- preserve=no 4EF99B6B02E9 size_head3D21C62B03BA "ClassDef::sizeRestrictedStructAttrType"
public int sizeRestrictedStructAttrType()
// -end- 4EF99B6B02E9 size_head3D21C62B03BA "ClassDef::sizeRestrictedStructAttrType"
{
        // -beg- preserve=no 4EF99B6B02E9 size_body3D21C62B03BA "ClassDef::sizeRestrictedStructAttrType"
        return restrictedStructAttrType.size();
        // -end- 4EF99B6B02E9 size_body3D21C62B03BA "ClassDef::sizeRestrictedStructAttrType"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 4EF99B6B02E9 _link_body3D21C62B03BA "ClassDef::_linkRestrictedStructAttrType"
public void _linkRestrictedStructAttrType(StructAttrType restrictedStructAttrType1)
{
        restrictedStructAttrType.add(restrictedStructAttrType1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkRestrictedStructAttrType"));
        return;
}
// -end- 4EF99B6B02E9 _link_body3D21C62B03BA "ClassDef::_linkRestrictedStructAttrType"

/** DONT USE; link management internal
 */
// -beg- preserve=no 4EF99B6B02E9 _unlink_body3D21C62B03BA "ClassDef::_unlinkRestrictedStructAttrType"
public void _unlinkRestrictedStructAttrType(StructAttrType restrictedStructAttrType1)
{
        restrictedStructAttrType.remove(restrictedStructAttrType1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkRestrictedStructAttrType"));
        return;
}
// -end- 4EF99B6B02E9 _unlink_body3D21C62B03BA "ClassDef::_unlinkRestrictedStructAttrType"

// -beg- preserve=no 4EF99B7901BD code3D21C62B03BA "structAttrType"
private java.util.Set structAttrType = new java.util.HashSet();
// -end- 4EF99B7901BD code3D21C62B03BA "structAttrType"

/** add a StructAttrType.
 *
 *  @see #removeStructAttrType
 *  @see #containsStructAttrType
 *  @see #iteratorStructAttrType
 *  @see #clearStructAttrType
 *  @see #sizeStructAttrType
 */
// -beg- preserve=no 4EF99B7901BD add_head3D21C62B03BA "ClassDef::addStructAttrType"
public void addStructAttrType(StructAttrType structAttrType1)
// -end- 4EF99B7901BD add_head3D21C62B03BA "ClassDef::addStructAttrType"
{
        // -beg- preserve=no 4EF99B7901BD add_body3D21C62B03BA "ClassDef::addStructAttrType"
        structAttrType.add(structAttrType1);
        structAttrType1._linkParticipant(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addStructAttrType"));
        return;
        // -end- 4EF99B7901BD add_body3D21C62B03BA "ClassDef::addStructAttrType"
}

/** disconnect a StructAttrType.
 *  @see #addStructAttrType
 */
// -beg- preserve=no 4EF99B7901BD remove_head3D21C62B03BA "ClassDef::removeStructAttrType"
public StructAttrType removeStructAttrType(StructAttrType structAttrType1)
// -end- 4EF99B7901BD remove_head3D21C62B03BA "ClassDef::removeStructAttrType"
{
        // -beg- preserve=no 4EF99B7901BD remove_body3D21C62B03BA "ClassDef::removeStructAttrType"
        StructAttrType ret=null;
        if(structAttrType1==null || !structAttrType.contains(structAttrType1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = structAttrType1;
        structAttrType.remove(structAttrType1);
        structAttrType1._unlinkParticipant(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeStructAttrType"));
        return ret;
        // -end- 4EF99B7901BD remove_body3D21C62B03BA "ClassDef::removeStructAttrType"
}

/** tests if a given StructAttrType is connected.
 *  @see #addStructAttrType
 */
// -beg- preserve=no 4EF99B7901BD test_head3D21C62B03BA "ClassDef::containsStructAttrType"
public boolean containsStructAttrType(StructAttrType structAttrType1)
// -end- 4EF99B7901BD test_head3D21C62B03BA "ClassDef::containsStructAttrType"
{
        // -beg- preserve=no 4EF99B7901BD test_body3D21C62B03BA "ClassDef::containsStructAttrType"
        return structAttrType.contains(structAttrType1);
        // -end- 4EF99B7901BD test_body3D21C62B03BA "ClassDef::containsStructAttrType"
}

/** used to enumerate all connected StructAttrTypes.
 *  @see #addStructAttrType
 */
// -beg- preserve=no 4EF99B7901BD get_all_head3D21C62B03BA "ClassDef::iteratorStructAttrType"
public java.util.Iterator iteratorStructAttrType()
// -end- 4EF99B7901BD get_all_head3D21C62B03BA "ClassDef::iteratorStructAttrType"
{
        // -beg- preserve=no 4EF99B7901BD get_all_body3D21C62B03BA "ClassDef::iteratorStructAttrType"
        return structAttrType.iterator();
        // -end- 4EF99B7901BD get_all_body3D21C62B03BA "ClassDef::iteratorStructAttrType"
}

/** disconnect all StructAttrTypes.
 *  @see #addStructAttrType
 */
// -beg- preserve=no 4EF99B7901BD remove_all_head3D21C62B03BA "ClassDef::clearStructAttrType"
public void clearStructAttrType()
// -end- 4EF99B7901BD remove_all_head3D21C62B03BA "ClassDef::clearStructAttrType"
{
        // -beg- preserve=no 4EF99B7901BD remove_all_body3D21C62B03BA "ClassDef::clearStructAttrType"
        if(sizeStructAttrType()>0) {
                for(java.util.Iterator p = structAttrType.iterator(); p.hasNext(); ) {
                        ((StructAttrType)p.next())._unlinkParticipant(this);
                }
                structAttrType.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearStructAttrType"));
        }
        // -end- 4EF99B7901BD remove_all_body3D21C62B03BA "ClassDef::clearStructAttrType"
}

/** returns the number of StructAttrTypes.
 *  @see #addStructAttrType
 */
// -beg- preserve=no 4EF99B7901BD size_head3D21C62B03BA "ClassDef::sizeStructAttrType"
public int sizeStructAttrType()
// -end- 4EF99B7901BD size_head3D21C62B03BA "ClassDef::sizeStructAttrType"
{
        // -beg- preserve=no 4EF99B7901BD size_body3D21C62B03BA "ClassDef::sizeStructAttrType"
        return structAttrType.size();
        // -end- 4EF99B7901BD size_body3D21C62B03BA "ClassDef::sizeStructAttrType"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 4EF99B7901BD _link_body3D21C62B03BA "ClassDef::_linkStructAttrType"
public void _linkStructAttrType(StructAttrType structAttrType1)
{
        structAttrType.add(structAttrType1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkStructAttrType"));
        return;
}
// -end- 4EF99B7901BD _link_body3D21C62B03BA "ClassDef::_linkStructAttrType"

/** DONT USE; link management internal
 */
// -beg- preserve=no 4EF99B7901BD _unlink_body3D21C62B03BA "ClassDef::_unlinkStructAttrType"
public void _unlinkStructAttrType(StructAttrType structAttrType1)
{
        structAttrType.remove(structAttrType1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkStructAttrType"));
        return;
}
// -end- 4EF99B7901BD _unlink_body3D21C62B03BA "ClassDef::_unlinkStructAttrType"

// -beg- preserve=no 3948F2A001D6 code3D21C62B03BA "surfaceType"
private SurfaceType surfaceType;
// -end- 3948F2A001D6 code3D21C62B03BA "surfaceType"

/** attaches a SurfaceType.
 *
 *  @see #detachSurfaceType
 *  @see #getSurfaceType
 *  @see #containsSurfaceType
 */
// -beg- preserve=no 3948F2A001D6 attach_head3D21C62B03BA "ClassDef::attachSurfaceType"
public void attachSurfaceType(SurfaceType surfaceType1)
// -end- 3948F2A001D6 attach_head3D21C62B03BA "ClassDef::attachSurfaceType"
{
        // -beg- preserve=no 3948F2A001D6 attach_body3D21C62B03BA "ClassDef::attachSurfaceType"
        if(surfaceType!=null) {throw new java.lang.IllegalStateException("already a surfaceType attached");}
        if(surfaceType1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as surfaceType");}
        surfaceType = surfaceType1;
        surfaceType1._linkLinAttrDef(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachSurfaceType"));
        return;
        // -end- 3948F2A001D6 attach_body3D21C62B03BA "ClassDef::attachSurfaceType"
}

/** disconnect the currently attached SurfaceType.
 *  @see #attachSurfaceType
 */
// -beg- preserve=no 3948F2A001D6 detach_head3D21C62B03BA "ClassDef::detachSurfaceType"
public SurfaceType detachSurfaceType()
// -end- 3948F2A001D6 detach_head3D21C62B03BA "ClassDef::detachSurfaceType"
{
        // -beg- preserve=no 3948F2A001D6 detach_body3D21C62B03BA "ClassDef::detachSurfaceType"
        SurfaceType ret = null;
        if(surfaceType!=null) {
                surfaceType._unlinkLinAttrDef(this);
                ret = surfaceType;
                surfaceType = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachSurfaceType"));
        return ret;
        // -end- 3948F2A001D6 detach_body3D21C62B03BA "ClassDef::detachSurfaceType"
}

/** get the currently attached SurfaceType.
 *  @see #attachSurfaceType
 */
// -beg- preserve=no 3948F2A001D6 get_head3D21C62B03BA "ClassDef::getSurfaceType"
public SurfaceType getSurfaceType()
// -end- 3948F2A001D6 get_head3D21C62B03BA "ClassDef::getSurfaceType"
{
        // -beg- preserve=no 3948F2A001D6 get_body3D21C62B03BA "ClassDef::getSurfaceType"
        if(surfaceType==null) {throw new java.lang.IllegalStateException("no surfaceType attached");}
        return surfaceType;
        // -end- 3948F2A001D6 get_body3D21C62B03BA "ClassDef::getSurfaceType"
}

/** tests if there is a SurfaceType attached.
 *  @see #attachSurfaceType
 */
// -beg- preserve=no 3948F2A001D6 test_head3D21C62B03BA "ClassDef::containsSurfaceType"
public boolean containsSurfaceType()
// -end- 3948F2A001D6 test_head3D21C62B03BA "ClassDef::containsSurfaceType"
{
        // -beg- preserve=no 3948F2A001D6 test_body3D21C62B03BA "ClassDef::containsSurfaceType"
        return surfaceType!=null;
        // -end- 3948F2A001D6 test_body3D21C62B03BA "ClassDef::containsSurfaceType"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3948F2A001D6 _link_body3D21C62B03BA "ClassDef::_linkSurfaceType"
public void _linkSurfaceType(SurfaceType surfaceType1)
{
        surfaceType = surfaceType1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSurfaceType"));
        return;
}
// -end- 3948F2A001D6 _link_body3D21C62B03BA "ClassDef::_linkSurfaceType"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3948F2A001D6 _unlink_body3D21C62B03BA "ClassDef::_unlinkSurfaceType"
public void _unlinkSurfaceType(SurfaceType surfaceType1)
{
        surfaceType = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSurfaceType"));
        return;
}
// -end- 3948F2A001D6 _unlink_body3D21C62B03BA "ClassDef::_unlinkSurfaceType"

// -beg- preserve=no 3FE5C65E00BD code3D21C62B03BA "lineFormTypeDef"
private java.util.Set lineFormTypeDef = new java.util.HashSet();
// -end- 3FE5C65E00BD code3D21C62B03BA "lineFormTypeDef"

/** add a LineFormTypeDef.
 *
 *  @see #removeLineFormTypeDef
 *  @see #containsLineFormTypeDef
 *  @see #iteratorLineFormTypeDef
 *  @see #clearLineFormTypeDef
 *  @see #sizeLineFormTypeDef
 */
// -beg- preserve=no 3FE5C65E00BD add_head3D21C62B03BA "ClassDef::addLineFormTypeDef"
public void addLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
// -end- 3FE5C65E00BD add_head3D21C62B03BA "ClassDef::addLineFormTypeDef"
{
        // -beg- preserve=no 3FE5C65E00BD add_body3D21C62B03BA "ClassDef::addLineFormTypeDef"
        lineFormTypeDef.add(lineFormTypeDef1);
        lineFormTypeDef1._linkStructure(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addLineFormTypeDef"));
        return;
        // -end- 3FE5C65E00BD add_body3D21C62B03BA "ClassDef::addLineFormTypeDef"
}

/** disconnect a LineFormTypeDef.
 *  @see #addLineFormTypeDef
 */
// -beg- preserve=no 3FE5C65E00BD remove_head3D21C62B03BA "ClassDef::removeLineFormTypeDef"
public LineFormTypeDef removeLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
// -end- 3FE5C65E00BD remove_head3D21C62B03BA "ClassDef::removeLineFormTypeDef"
{
        // -beg- preserve=no 3FE5C65E00BD remove_body3D21C62B03BA "ClassDef::removeLineFormTypeDef"
        LineFormTypeDef ret=null;
        if(lineFormTypeDef1==null || !lineFormTypeDef.contains(lineFormTypeDef1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = lineFormTypeDef1;
        lineFormTypeDef.remove(lineFormTypeDef1);
        lineFormTypeDef1._unlinkStructure(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeLineFormTypeDef"));
        return ret;
        // -end- 3FE5C65E00BD remove_body3D21C62B03BA "ClassDef::removeLineFormTypeDef"
}

/** tests if a given LineFormTypeDef is connected.
 *  @see #addLineFormTypeDef
 */
// -beg- preserve=no 3FE5C65E00BD test_head3D21C62B03BA "ClassDef::containsLineFormTypeDef"
public boolean containsLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
// -end- 3FE5C65E00BD test_head3D21C62B03BA "ClassDef::containsLineFormTypeDef"
{
        // -beg- preserve=no 3FE5C65E00BD test_body3D21C62B03BA "ClassDef::containsLineFormTypeDef"
        return lineFormTypeDef.contains(lineFormTypeDef1);
        // -end- 3FE5C65E00BD test_body3D21C62B03BA "ClassDef::containsLineFormTypeDef"
}

/** used to enumerate all connected LineFormTypeDefs.
 *  @see #addLineFormTypeDef
 */
// -beg- preserve=no 3FE5C65E00BD get_all_head3D21C62B03BA "ClassDef::iteratorLineFormTypeDef"
public java.util.Iterator iteratorLineFormTypeDef()
// -end- 3FE5C65E00BD get_all_head3D21C62B03BA "ClassDef::iteratorLineFormTypeDef"
{
        // -beg- preserve=no 3FE5C65E00BD get_all_body3D21C62B03BA "ClassDef::iteratorLineFormTypeDef"
        return lineFormTypeDef.iterator();
        // -end- 3FE5C65E00BD get_all_body3D21C62B03BA "ClassDef::iteratorLineFormTypeDef"
}

/** disconnect all LineFormTypeDefs.
 *  @see #addLineFormTypeDef
 */
// -beg- preserve=no 3FE5C65E00BD remove_all_head3D21C62B03BA "ClassDef::clearLineFormTypeDef"
public void clearLineFormTypeDef()
// -end- 3FE5C65E00BD remove_all_head3D21C62B03BA "ClassDef::clearLineFormTypeDef"
{
        // -beg- preserve=no 3FE5C65E00BD remove_all_body3D21C62B03BA "ClassDef::clearLineFormTypeDef"
        if(sizeLineFormTypeDef()>0) {
                for(java.util.Iterator p = lineFormTypeDef.iterator(); p.hasNext(); ) {
                        ((LineFormTypeDef)p.next())._unlinkStructure(this);
                }
                lineFormTypeDef.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearLineFormTypeDef"));
        }
        // -end- 3FE5C65E00BD remove_all_body3D21C62B03BA "ClassDef::clearLineFormTypeDef"
}

/** returns the number of LineFormTypeDefs.
 *  @see #addLineFormTypeDef
 */
// -beg- preserve=no 3FE5C65E00BD size_head3D21C62B03BA "ClassDef::sizeLineFormTypeDef"
public int sizeLineFormTypeDef()
// -end- 3FE5C65E00BD size_head3D21C62B03BA "ClassDef::sizeLineFormTypeDef"
{
        // -beg- preserve=no 3FE5C65E00BD size_body3D21C62B03BA "ClassDef::sizeLineFormTypeDef"
        return lineFormTypeDef.size();
        // -end- 3FE5C65E00BD size_body3D21C62B03BA "ClassDef::sizeLineFormTypeDef"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3FE5C65E00BD _link_body3D21C62B03BA "ClassDef::_linkLineFormTypeDef"
public void _linkLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
{
        lineFormTypeDef.add(lineFormTypeDef1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkLineFormTypeDef"));
        return;
}
// -end- 3FE5C65E00BD _link_body3D21C62B03BA "ClassDef::_linkLineFormTypeDef"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3FE5C65E00BD _unlink_body3D21C62B03BA "ClassDef::_unlinkLineFormTypeDef"
public void _unlinkLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
{
        lineFormTypeDef.remove(lineFormTypeDef1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkLineFormTypeDef"));
        return;
}
// -end- 3FE5C65E00BD _unlink_body3D21C62B03BA "ClassDef::_unlinkLineFormTypeDef"

// -beg- preserve=no 3940FA6701DE var3D21C62B03BA "kind"
private int kind;
// -end- 3940FA6701DE var3D21C62B03BA "kind"

/** get current value of kind
 *  CLASS oder STRUCTURE
 *  @see ch.ehi.interlis.modeltopicclass.ClassDefKind
 *  @see #setKind
 */
// -beg- preserve=no 3940FA6701DE get_head3D21C62B03BA "kind"
public int getKind()
// -end- 3940FA6701DE get_head3D21C62B03BA "kind"
{
        // -beg- preserve=no 3940FA6701DE get_body3D21C62B03BA "kind"
        return kind;
        // -end- 3940FA6701DE get_body3D21C62B03BA "kind"
}

/** set current value of kind
 *  @see ch.ehi.interlis.modeltopicclass.ClassDefKind
 *  @see #getKind
 */
// -beg- preserve=no 3940FA6701DE set_head3D21C62B03BA "kind"
public void setKind(int value1)
// -end- 3940FA6701DE set_head3D21C62B03BA "kind"
{
        // -beg- preserve=no 3940FA6701DE set_body3D21C62B03BA "kind"
        if(kind != value1) {
                kind = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
        }
        // -end- 3940FA6701DE set_body3D21C62B03BA "kind"
}

public NlsString getMetaAttrb(){
        return super.getMetaAttrb();
}

public void setMetaAttrb(NlsString value) {
        super.setMettaAttrb(value);

}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3D21C62B03BA detail_end "ClassDef"

// -end- 3D21C62B03BA detail_end "ClassDef"

}
