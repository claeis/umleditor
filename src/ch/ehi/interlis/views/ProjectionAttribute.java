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


// -beg- preserve=no 3961A2D50316 package "ProjectionAttribute"
package ch.ehi.interlis.views;
// -end- 3961A2D50316 package "ProjectionAttribute"

// -beg- preserve=no 3961A2D50316 autoimport "ProjectionAttribute"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.views.ProjectionAttributeDef;
import ch.ehi.interlis.views.ProjectionAttributeKind;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3961A2D50316 autoimport "ProjectionAttribute"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3961A2D50316 import "ProjectionAttribute"

// -end- 3961A2D50316 import "ProjectionAttribute"

/** Definiert die Attribute der Basissicht, die in der Projektion verwendet werden sollen.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:28 $
 */
public class ProjectionAttribute extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3961A2D50316 detail_begin "ProjectionAttribute"

// -end- 3961A2D50316 detail_begin "ProjectionAttribute"

// -beg- preserve=no 3D4FA218036F head3961A2D50316 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA218036F head3961A2D50316 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA218036F throws3961A2D50316 "unlinkAll"

// -end- 3D4FA218036F throws3961A2D50316 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA218036F body3961A2D50316 "unlinkAll"

        detachAttrdef();
        // Role ProjectionAttributes: ProjectionAttributes object(s) may point to this
        setBaseName(null);
        super.unlinkAll();
        // -end- 3D4FA218036F body3961A2D50316 "unlinkAll"
}

// -beg- preserve=no 3D4FA2180370 head3961A2D50316 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2180370 head3961A2D50316 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2180370 throws3961A2D50316 "enumerateChildren"

// -end- 3D4FA2180370 throws3961A2D50316 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2180370 body3961A2D50316 "enumerateChildren"
        java.util.Iterator it=null;
        if(containsAttrdef()) visitor.visit(getAttrdef());
        visitor.visit(getBaseName());
        super.enumerateChildren(visitor);
        // -end- 3D4FA2180370 body3961A2D50316 "enumerateChildren"
}

// -beg- preserve=no 3961A32B0161 code3961A2D50316 "attrdef"
private ProjectionAttributeDef attrdef;
// -end- 3961A32B0161 code3961A2D50316 "attrdef"

/** attaches a Attrdef.
 *
 *  @see #detachAttrdef
 *  @see #getAttrdef
 *  @see #containsAttrdef
 */
// -beg- preserve=no 3961A32B0161 attach_head3961A2D50316 "ProjectionAttribute::attachAttrdef"
public void attachAttrdef(ProjectionAttributeDef attrdef1)
// -end- 3961A32B0161 attach_head3961A2D50316 "ProjectionAttribute::attachAttrdef"
{
        // -beg- preserve=no 3961A32B0161 attach_body3961A2D50316 "ProjectionAttribute::attachAttrdef"
        if(attrdef!=null) {throw new java.lang.IllegalStateException("already a attrdef attached");}
        if(attrdef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as attrdef");}
        attrdef = attrdef1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAttrdef"));
        return;
        // -end- 3961A32B0161 attach_body3961A2D50316 "ProjectionAttribute::attachAttrdef"
}

/** disconnect the currently attached Attrdef.
 *  @see #attachAttrdef
 */
// -beg- preserve=no 3961A32B0161 detach_head3961A2D50316 "ProjectionAttribute::detachAttrdef"
public ProjectionAttributeDef detachAttrdef()
// -end- 3961A32B0161 detach_head3961A2D50316 "ProjectionAttribute::detachAttrdef"
{
        // -beg- preserve=no 3961A32B0161 detach_body3961A2D50316 "ProjectionAttribute::detachAttrdef"
        ProjectionAttributeDef ret = null;
        ret = attrdef;
        attrdef = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAttrdef"));
        return ret;
        // -end- 3961A32B0161 detach_body3961A2D50316 "ProjectionAttribute::detachAttrdef"
}

/** get the currently attached Attrdef.
 *  @see #attachAttrdef
 */
// -beg- preserve=no 3961A32B0161 get_head3961A2D50316 "ProjectionAttribute::getAttrdef"
public ProjectionAttributeDef getAttrdef()
// -end- 3961A32B0161 get_head3961A2D50316 "ProjectionAttribute::getAttrdef"
{
        // -beg- preserve=no 3961A32B0161 get_body3961A2D50316 "ProjectionAttribute::getAttrdef"
        if(attrdef==null) {throw new java.lang.IllegalStateException("no attrdef attached");}
        return attrdef;
        // -end- 3961A32B0161 get_body3961A2D50316 "ProjectionAttribute::getAttrdef"
}

/** tests if there is a Attrdef attached.
 *  @see #attachAttrdef
 */
// -beg- preserve=no 3961A32B0161 test_head3961A2D50316 "ProjectionAttribute::containsAttrdef"
public boolean containsAttrdef()
// -end- 3961A32B0161 test_head3961A2D50316 "ProjectionAttribute::containsAttrdef"
{
        // -beg- preserve=no 3961A32B0161 test_body3961A2D50316 "ProjectionAttribute::containsAttrdef"
        return attrdef!=null;
        // -end- 3961A32B0161 test_body3961A2D50316 "ProjectionAttribute::containsAttrdef"
}

// -beg- preserve=no 3961A2EA0226 var3961A2D50316 "kind"
private int kind;
// -end- 3961A2EA0226 var3961A2D50316 "kind"

/** get current value of kind
 *  ALLOF oder ATTRDEF
 *  @see ch.ehi.interlis.views.ProjectionAttributeKind
 *  @see #setKind
 */
// -beg- preserve=no 3961A2EA0226 get_head3961A2D50316 "kind"
public int getKind()
// -end- 3961A2EA0226 get_head3961A2D50316 "kind"
{
        // -beg- preserve=no 3961A2EA0226 get_body3961A2D50316 "kind"
        return kind;
        // -end- 3961A2EA0226 get_body3961A2D50316 "kind"
}

/** set current value of kind
 *  @see ch.ehi.interlis.views.ProjectionAttributeKind
 *  @see #getKind
 */
// -beg- preserve=no 3961A2EA0226 set_head3961A2D50316 "kind"
public void setKind(int value1)
// -end- 3961A2EA0226 set_head3961A2D50316 "kind"
{
        // -beg- preserve=no 3961A2EA0226 set_body3961A2D50316 "kind"
        if(kind != value1) {
                kind = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
        }
        // -end- 3961A2EA0226 set_body3961A2D50316 "kind"
}

// -beg- preserve=no 3961A2FE0121 var3961A2D50316 "baseName"
private NlsString baseName = null;
// -end- 3961A2FE0121 var3961A2D50316 "baseName"

/** get current value of baseName
 *  Name der Basisklasse von der alle Attribute in der Projektion verwendet werden sollen.
 *  @see #setBaseName
 */
// -beg- preserve=no 3961A2FE0121 get_head3961A2D50316 "baseName"
public NlsString getBaseName()
// -end- 3961A2FE0121 get_head3961A2D50316 "baseName"
{
        // -beg- preserve=no 3961A2FE0121 get_body3961A2D50316 "baseName"
        return baseName;
        // -end- 3961A2FE0121 get_body3961A2D50316 "baseName"
}

/** set current value of baseName
 *  @see #getBaseName
 */
// -beg- preserve=no 3961A2FE0121 set_head3961A2D50316 "baseName"
public void setBaseName(NlsString value1)
// -end- 3961A2FE0121 set_head3961A2D50316 "baseName"
{
        // -beg- preserve=no 3961A2FE0121 set_body3961A2D50316 "baseName"
        if(baseName!=value1 && (baseName==null || !baseName.equals(value1))) {
                baseName = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBaseName"));
        }
        // -end- 3961A2FE0121 set_body3961A2D50316 "baseName"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3961A2D50316 detail_end "ProjectionAttribute"

// -end- 3961A2D50316 detail_end "ProjectionAttribute"

}
