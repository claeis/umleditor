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


// -beg- preserve=no 358A641F019E package "DomainAttribute"
package ch.ehi.interlis.attributes;
// -end- 358A641F019E package "DomainAttribute"

// -beg- preserve=no 358A641F019E autoimport "DomainAttribute"
import ch.ehi.interlis.attributes.AttrType;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A641F019E autoimport "DomainAttribute"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A641F019E import "DomainAttribute"

// -end- 358A641F019E import "DomainAttribute"

/** Definiert ein einfaches Attribut.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:50 $
 */
public class DomainAttribute extends AttrType implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 358A641F019E detail_begin "DomainAttribute"

// -end- 358A641F019E detail_begin "DomainAttribute"

// -beg- preserve=no 3D4FA21A01C4 head358A641F019E "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21A01C4 head358A641F019E "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21A01C4 throws358A641F019E "unlinkAll"

// -end- 3D4FA21A01C4 throws358A641F019E "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21A01C4 body358A641F019E "unlinkAll"

        detachDomainDef();
        // Role ProjectionAttributeDef: ProjectionAttributeDef object(s) may point to this
        // Role ArgumentType: ArgumentType object(s) may point to this
        // Role GraphicParameterDef: GraphicParameterDef object(s) may point to this
        detachDirect();
        // Role Ili1ControlPoints: Ili1ControlPoints object(s) may point to this
        super.unlinkAll();
        // -end- 3D4FA21A01C4 body358A641F019E "unlinkAll"
}

// -beg- preserve=no 3D4FA21A01D7 head358A641F019E "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21A01D7 head358A641F019E "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21A01D7 throws358A641F019E "enumerateChildren"

// -end- 3D4FA21A01D7 throws358A641F019E "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21A01D7 body358A641F019E "enumerateChildren"
        java.util.Iterator it=null;
        if(containsDirect()) visitor.visit(getDirect());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21A01D7 body358A641F019E "enumerateChildren"
}

// -beg- preserve=no 3947A41A020A code358A641F019E "domainDef"
private DomainDef domainDef;
// -end- 3947A41A020A code358A641F019E "domainDef"

/** attaches a DomainDef.
 *
 *  @see #detachDomainDef
 *  @see #getDomainDef
 *  @see #containsDomainDef
 */
// -beg- preserve=no 3947A41A020A attach_head358A641F019E "DomainAttribute::attachDomainDef"
public void attachDomainDef(DomainDef domainDef1)
// -end- 3947A41A020A attach_head358A641F019E "DomainAttribute::attachDomainDef"
{
        // -beg- preserve=no 3947A41A020A attach_body358A641F019E "DomainAttribute::attachDomainDef"
        if(domainDef!=null) {throw new java.lang.IllegalStateException("already a domainDef attached");}
        if(domainDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as domainDef");}
        domainDef = domainDef1;
        domainDef1._linkDomainAttribute(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDomainDef"));
        return;
        // -end- 3947A41A020A attach_body358A641F019E "DomainAttribute::attachDomainDef"
}

/** disconnect the currently attached DomainDef.
 *  @see #attachDomainDef
 */
// -beg- preserve=no 3947A41A020A detach_head358A641F019E "DomainAttribute::detachDomainDef"
public DomainDef detachDomainDef()
// -end- 3947A41A020A detach_head358A641F019E "DomainAttribute::detachDomainDef"
{
        // -beg- preserve=no 3947A41A020A detach_body358A641F019E "DomainAttribute::detachDomainDef"
        DomainDef ret = null;
        if(domainDef!=null) {
                domainDef._unlinkDomainAttribute(this);
                ret = domainDef;
                domainDef = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDomainDef"));
        return ret;
        // -end- 3947A41A020A detach_body358A641F019E "DomainAttribute::detachDomainDef"
}

/** get the currently attached DomainDef.
 *  @see #attachDomainDef
 */
// -beg- preserve=no 3947A41A020A get_head358A641F019E "DomainAttribute::getDomainDef"
public DomainDef getDomainDef()
// -end- 3947A41A020A get_head358A641F019E "DomainAttribute::getDomainDef"
{
        // -beg- preserve=no 3947A41A020A get_body358A641F019E "DomainAttribute::getDomainDef"
        if(domainDef==null) {throw new java.lang.IllegalStateException("no domainDef attached");}
        return domainDef;
        // -end- 3947A41A020A get_body358A641F019E "DomainAttribute::getDomainDef"
}

/** tests if there is a DomainDef attached.
 *  @see #attachDomainDef
 */
// -beg- preserve=no 3947A41A020A test_head358A641F019E "DomainAttribute::containsDomainDef"
public boolean containsDomainDef()
// -end- 3947A41A020A test_head358A641F019E "DomainAttribute::containsDomainDef"
{
        // -beg- preserve=no 3947A41A020A test_body358A641F019E "DomainAttribute::containsDomainDef"
        return domainDef!=null;
        // -end- 3947A41A020A test_body358A641F019E "DomainAttribute::containsDomainDef"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 3947A41A020A _link_body358A641F019E "DomainAttribute::_linkDomainDef"
public void _linkDomainDef(DomainDef domainDef1)
{
        domainDef = domainDef1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDomainDef"));
        return;
}
// -end- 3947A41A020A _link_body358A641F019E "DomainAttribute::_linkDomainDef"

/** DONT USE; link management internal
 */
// -beg- preserve=no 3947A41A020A _unlink_body358A641F019E "DomainAttribute::_unlinkDomainDef"
public void _unlinkDomainDef(DomainDef domainDef1)
{
        domainDef = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDomainDef"));
        return;
}
// -end- 3947A41A020A _unlink_body358A641F019E "DomainAttribute::_unlinkDomainDef"

// -beg- preserve=no 3708B22F01CA code358A641F019E "direct"
private Type direct;
// -end- 3708B22F01CA code358A641F019E "direct"

/** attaches a Direct.
 *
 *  @see #detachDirect
 *  @see #getDirect
 *  @see #containsDirect
 */
// -beg- preserve=no 3708B22F01CA attach_head358A641F019E "DomainAttribute::attachDirect"
public void attachDirect(Type direct1)
// -end- 3708B22F01CA attach_head358A641F019E "DomainAttribute::attachDirect"
{
        // -beg- preserve=no 3708B22F01CA attach_body358A641F019E "DomainAttribute::attachDirect"
        if(direct!=null) {throw new java.lang.IllegalStateException("already a direct attached");}
        if(direct1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as direct");}
        direct = direct1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDirect"));
        return;
        // -end- 3708B22F01CA attach_body358A641F019E "DomainAttribute::attachDirect"
}

/** disconnect the currently attached Direct.
 *  @see #attachDirect
 */
// -beg- preserve=no 3708B22F01CA detach_head358A641F019E "DomainAttribute::detachDirect"
public Type detachDirect()
// -end- 3708B22F01CA detach_head358A641F019E "DomainAttribute::detachDirect"
{
        // -beg- preserve=no 3708B22F01CA detach_body358A641F019E "DomainAttribute::detachDirect"
        Type ret = null;
        ret = direct;
        direct = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDirect"));
        return ret;
        // -end- 3708B22F01CA detach_body358A641F019E "DomainAttribute::detachDirect"
}

/** get the currently attached Direct.
 *  @see #attachDirect
 */
// -beg- preserve=no 3708B22F01CA get_head358A641F019E "DomainAttribute::getDirect"
public Type getDirect()
// -end- 3708B22F01CA get_head358A641F019E "DomainAttribute::getDirect"
{
        // -beg- preserve=no 3708B22F01CA get_body358A641F019E "DomainAttribute::getDirect"
        if(direct==null) {throw new java.lang.IllegalStateException("no direct attached");}
        return direct;
        // -end- 3708B22F01CA get_body358A641F019E "DomainAttribute::getDirect"
}

/** tests if there is a Direct attached.
 *  @see #attachDirect
 */
// -beg- preserve=no 3708B22F01CA test_head358A641F019E "DomainAttribute::containsDirect"
public boolean containsDirect()
// -end- 3708B22F01CA test_head358A641F019E "DomainAttribute::containsDirect"
{
        // -beg- preserve=no 3708B22F01CA test_body358A641F019E "DomainAttribute::containsDirect"
        return direct!=null;
        // -end- 3708B22F01CA test_body358A641F019E "DomainAttribute::containsDirect"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 358A641F019E detail_end "DomainAttribute"

// -end- 358A641F019E detail_end "DomainAttribute"

}
