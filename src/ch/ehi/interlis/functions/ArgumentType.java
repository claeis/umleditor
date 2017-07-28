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


// -beg- preserve=no 3960B11E02DE package "ArgumentType"
package ch.ehi.interlis.functions;
// -end- 3960B11E02DE package "ArgumentType"

// -beg- preserve=no 3960B11E02DE autoimport "ArgumentType"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3960B11E02DE autoimport "ArgumentType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3960B11E02DE import "ArgumentType"

// -end- 3960B11E02DE import "ArgumentType"

/** Definiert einen formalen Parameter einer Funktion.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:46 $
 */
public class ArgumentType extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3960B11E02DE detail_begin "ArgumentType"

// -end- 3960B11E02DE detail_begin "ArgumentType"

// -beg- preserve=no 3D4FA2190009 head3960B11E02DE "unlinkAll"
public void unlinkAll()
// -end- 3D4FA2190009 head3960B11E02DE "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2190009 throws3960B11E02DE "unlinkAll"

// -end- 3D4FA2190009 throws3960B11E02DE "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2190009 body3960B11E02DE "unlinkAll"

        // Role FunctionDef: FunctionDef object(s) may point to this
        detachDomainAttribute();
        super.unlinkAll();
        // -end- 3D4FA2190009 body3960B11E02DE "unlinkAll"
}

// -beg- preserve=no 3D4FA219000A head3960B11E02DE "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA219000A head3960B11E02DE "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA219000A throws3960B11E02DE "enumerateChildren"

// -end- 3D4FA219000A throws3960B11E02DE "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA219000A body3960B11E02DE "enumerateChildren"
        java.util.Iterator it=null;
        if(containsDomainAttribute()) visitor.visit(getDomainAttribute());
        super.enumerateChildren(visitor);
        // -end- 3D4FA219000A body3960B11E02DE "enumerateChildren"
}

// -beg- preserve=no 3960B29A03DF code3960B11E02DE "domainAttribute"
private DomainAttribute domainAttribute;
// -end- 3960B29A03DF code3960B11E02DE "domainAttribute"

/** attaches a DomainAttribute.
 *
 *  @see #detachDomainAttribute
 *  @see #getDomainAttribute
 *  @see #containsDomainAttribute
 */
// -beg- preserve=no 3960B29A03DF attach_head3960B11E02DE "ArgumentType::attachDomainAttribute"
public void attachDomainAttribute(DomainAttribute domainAttribute1)
// -end- 3960B29A03DF attach_head3960B11E02DE "ArgumentType::attachDomainAttribute"
{
        // -beg- preserve=no 3960B29A03DF attach_body3960B11E02DE "ArgumentType::attachDomainAttribute"
        if(domainAttribute!=null) {throw new java.lang.IllegalStateException("already a domainAttribute attached");}
        if(domainAttribute1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as domainAttribute");}
        domainAttribute = domainAttribute1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDomainAttribute"));
        return;
        // -end- 3960B29A03DF attach_body3960B11E02DE "ArgumentType::attachDomainAttribute"
}

/** disconnect the currently attached DomainAttribute.
 *  @see #attachDomainAttribute
 */
// -beg- preserve=no 3960B29A03DF detach_head3960B11E02DE "ArgumentType::detachDomainAttribute"
public DomainAttribute detachDomainAttribute()
// -end- 3960B29A03DF detach_head3960B11E02DE "ArgumentType::detachDomainAttribute"
{
        // -beg- preserve=no 3960B29A03DF detach_body3960B11E02DE "ArgumentType::detachDomainAttribute"
        DomainAttribute ret = null;
        ret = domainAttribute;
        domainAttribute = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDomainAttribute"));
        return ret;
        // -end- 3960B29A03DF detach_body3960B11E02DE "ArgumentType::detachDomainAttribute"
}

/** get the currently attached DomainAttribute.
 *  @see #attachDomainAttribute
 */
// -beg- preserve=no 3960B29A03DF get_head3960B11E02DE "ArgumentType::getDomainAttribute"
public DomainAttribute getDomainAttribute()
// -end- 3960B29A03DF get_head3960B11E02DE "ArgumentType::getDomainAttribute"
{
        // -beg- preserve=no 3960B29A03DF get_body3960B11E02DE "ArgumentType::getDomainAttribute"
        if(domainAttribute==null) {throw new java.lang.IllegalStateException("no domainAttribute attached");}
        return domainAttribute;
        // -end- 3960B29A03DF get_body3960B11E02DE "ArgumentType::getDomainAttribute"
}

/** tests if there is a DomainAttribute attached.
 *  @see #attachDomainAttribute
 */
// -beg- preserve=no 3960B29A03DF test_head3960B11E02DE "ArgumentType::containsDomainAttribute"
public boolean containsDomainAttribute()
// -end- 3960B29A03DF test_head3960B11E02DE "ArgumentType::containsDomainAttribute"
{
        // -beg- preserve=no 3960B29A03DF test_body3960B11E02DE "ArgumentType::containsDomainAttribute"
        return domainAttribute!=null;
        // -end- 3960B29A03DF test_body3960B11E02DE "ArgumentType::containsDomainAttribute"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3960B11E02DE detail_end "ArgumentType"

// -end- 3960B11E02DE detail_end "ArgumentType"

}
