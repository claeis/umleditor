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


// -beg- preserve=no 396197B2014A package "ProjectionAttributes"
package ch.ehi.interlis.views;
// -end- 396197B2014A package "ProjectionAttributes"

// -beg- preserve=no 396197B2014A autoimport "ProjectionAttributes"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.views.ProjectionAttribute;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 396197B2014A autoimport "ProjectionAttributes"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 396197B2014A import "ProjectionAttributes"

// -end- 396197B2014A import "ProjectionAttributes"

/** Definiert die Attribute, die in der Projektion verwendet werden sollen.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:31 $
 */
public class ProjectionAttributes extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 396197B2014A detail_begin "ProjectionAttributes"

// -end- 396197B2014A detail_begin "ProjectionAttributes"

// -beg- preserve=no 3D4FA2180329 head396197B2014A "unlinkAll"
public void unlinkAll()
// -end- 3D4FA2180329 head396197B2014A "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2180329 throws396197B2014A "unlinkAll"

// -end- 3D4FA2180329 throws396197B2014A "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2180329 body396197B2014A "unlinkAll"

        // Role ViewDef: ViewDef object(s) may point to this
        // Role ViewProjectionDef: ViewProjectionDef object(s) may point to this
        clearAttr();
        super.unlinkAll();
        // -end- 3D4FA2180329 body396197B2014A "unlinkAll"
}

// -beg- preserve=no 3D4FA2180333 head396197B2014A "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2180333 head396197B2014A "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2180333 throws396197B2014A "enumerateChildren"

// -end- 3D4FA2180333 throws396197B2014A "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2180333 body396197B2014A "enumerateChildren"
        java.util.Iterator it=null;
        it=iteratorAttr(); while(it.hasNext()) visitor.visit(it.next());
        super.enumerateChildren(visitor);
        // -end- 3D4FA2180333 body396197B2014A "enumerateChildren"
}

// -beg- preserve=no 3961A32E0008 code396197B2014A "attr"
private java.util.Set attr = new java.util.HashSet();
// -end- 3961A32E0008 code396197B2014A "attr"

/** add a Attr.
 *
 *  @see #removeAttr
 *  @see #containsAttr
 *  @see #iteratorAttr
 *  @see #clearAttr
 *  @see #sizeAttr
 */
// -beg- preserve=no 3961A32E0008 add_head396197B2014A "ProjectionAttributes::addAttr"
public void addAttr(ProjectionAttribute attr1)
// -end- 3961A32E0008 add_head396197B2014A "ProjectionAttributes::addAttr"
{
        // -beg- preserve=no 3961A32E0008 add_body396197B2014A "ProjectionAttributes::addAttr"
        attr.add(attr1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addAttr"));
        return;
        // -end- 3961A32E0008 add_body396197B2014A "ProjectionAttributes::addAttr"
}

/** disconnect a Attr.
 *  @see #addAttr
 */
// -beg- preserve=no 3961A32E0008 remove_head396197B2014A "ProjectionAttributes::removeAttr"
public ProjectionAttribute removeAttr(ProjectionAttribute attr1)
// -end- 3961A32E0008 remove_head396197B2014A "ProjectionAttributes::removeAttr"
{
        // -beg- preserve=no 3961A32E0008 remove_body396197B2014A "ProjectionAttributes::removeAttr"
        ProjectionAttribute ret=null;
        if(attr1==null || !attr.contains(attr1)) {
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
        }
        ret = attr1;
        attr.remove(attr1);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeAttr"));
        return ret;
        // -end- 3961A32E0008 remove_body396197B2014A "ProjectionAttributes::removeAttr"
}

/** tests if a given Attr is connected.
 *  @see #addAttr
 */
// -beg- preserve=no 3961A32E0008 test_head396197B2014A "ProjectionAttributes::containsAttr"
public boolean containsAttr(ProjectionAttribute attr1)
// -end- 3961A32E0008 test_head396197B2014A "ProjectionAttributes::containsAttr"
{
        // -beg- preserve=no 3961A32E0008 test_body396197B2014A "ProjectionAttributes::containsAttr"
        return attr.contains(attr1);
        // -end- 3961A32E0008 test_body396197B2014A "ProjectionAttributes::containsAttr"
}

/** used to enumerate all connected Attrs.
 *  @see #addAttr
 */
// -beg- preserve=no 3961A32E0008 get_all_head396197B2014A "ProjectionAttributes::iteratorAttr"
public java.util.Iterator iteratorAttr()
// -end- 3961A32E0008 get_all_head396197B2014A "ProjectionAttributes::iteratorAttr"
{
        // -beg- preserve=no 3961A32E0008 get_all_body396197B2014A "ProjectionAttributes::iteratorAttr"
        return attr.iterator();
        // -end- 3961A32E0008 get_all_body396197B2014A "ProjectionAttributes::iteratorAttr"
}

/** disconnect all Attrs.
 *  @see #addAttr
 */
// -beg- preserve=no 3961A32E0008 remove_all_head396197B2014A "ProjectionAttributes::clearAttr"
public void clearAttr()
// -end- 3961A32E0008 remove_all_head396197B2014A "ProjectionAttributes::clearAttr"
{
        // -beg- preserve=no 3961A32E0008 remove_all_body396197B2014A "ProjectionAttributes::clearAttr"
        if(sizeAttr()>0) {
                attr.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearAttr"));
        }
        // -end- 3961A32E0008 remove_all_body396197B2014A "ProjectionAttributes::clearAttr"
}

/** returns the number of Attrs.
 *  @see #addAttr
 */
// -beg- preserve=no 3961A32E0008 size_head396197B2014A "ProjectionAttributes::sizeAttr"
public int sizeAttr()
// -end- 3961A32E0008 size_head396197B2014A "ProjectionAttributes::sizeAttr"
{
        // -beg- preserve=no 3961A32E0008 size_body396197B2014A "ProjectionAttributes::sizeAttr"
        return attr.size();
        // -end- 3961A32E0008 size_body396197B2014A "ProjectionAttributes::sizeAttr"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 396197B2014A detail_end "ProjectionAttributes"

// -end- 396197B2014A detail_end "ProjectionAttributes"

}
