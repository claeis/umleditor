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


// -beg- preserve=no 358A5FF400A0 package "Coding"
package ch.ehi.interlis.modeltopicclass;
// -end- 358A5FF400A0 package "Coding"

// -beg- preserve=no 358A5FF400A0 autoimport "Coding"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.TransferID;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A5FF400A0 autoimport "Coding"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5FF400A0 import "Coding"

// -end- 358A5FF400A0 import "Coding"

/** Definition des Zeichensatzes und der Spezialzeichen in der Transferdatei.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:37 $
 */
public class Coding extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 358A5FF400A0 detail_begin "Coding"

// -end- 358A5FF400A0 detail_begin "Coding"

// -beg- preserve=no 3D4FA21A000C head358A5FF400A0 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21A000C head358A5FF400A0 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21A000C throws358A5FF400A0 "unlinkAll"

// -end- 3D4FA21A000C throws358A5FF400A0 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21A000C body358A5FF400A0 "unlinkAll"

        detachINTERLIS2Def();
        detachTransferID();
        super.unlinkAll();
        // -end- 3D4FA21A000C body358A5FF400A0 "unlinkAll"
}

// -beg- preserve=no 3D4FA21A000D head358A5FF400A0 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21A000D head358A5FF400A0 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21A000D throws358A5FF400A0 "enumerateChildren"

// -end- 3D4FA21A000D throws358A5FF400A0 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21A000D body358A5FF400A0 "enumerateChildren"
        java.util.Iterator it=null;
        if(containsTransferID()) visitor.visit(getTransferID());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21A000D body358A5FF400A0 "enumerateChildren"
}

// -beg- preserve=no 358A60230129 code358A5FF400A0 "iNTERLIS2Def"
private INTERLIS2Def iNTERLIS2Def;
// -end- 358A60230129 code358A5FF400A0 "iNTERLIS2Def"

/** attaches a INTERLIS2Def.
 *
 *  @see #detachINTERLIS2Def
 *  @see #getINTERLIS2Def
 *  @see #containsINTERLIS2Def
 */
// -beg- preserve=no 358A60230129 attach_head358A5FF400A0 "Coding::attachINTERLIS2Def"
public void attachINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1)
// -end- 358A60230129 attach_head358A5FF400A0 "Coding::attachINTERLIS2Def"
{
        // -beg- preserve=no 358A60230129 attach_body358A5FF400A0 "Coding::attachINTERLIS2Def"
        if(iNTERLIS2Def!=null) {throw new java.lang.IllegalStateException("already a iNTERLIS2Def attached");}
        if(iNTERLIS2Def1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as iNTERLIS2Def");}
        iNTERLIS2Def = iNTERLIS2Def1;
        iNTERLIS2Def1._linkCoding(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachINTERLIS2Def"));
        return;
        // -end- 358A60230129 attach_body358A5FF400A0 "Coding::attachINTERLIS2Def"
}

/** disconnect the currently attached INTERLIS2Def.
 *  @see #attachINTERLIS2Def
 */
// -beg- preserve=no 358A60230129 detach_head358A5FF400A0 "Coding::detachINTERLIS2Def"
public INTERLIS2Def detachINTERLIS2Def()
// -end- 358A60230129 detach_head358A5FF400A0 "Coding::detachINTERLIS2Def"
{
        // -beg- preserve=no 358A60230129 detach_body358A5FF400A0 "Coding::detachINTERLIS2Def"
        INTERLIS2Def ret = null;
        if(iNTERLIS2Def!=null) {
                iNTERLIS2Def._unlinkCoding(this);
                ret = iNTERLIS2Def;
                iNTERLIS2Def = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachINTERLIS2Def"));
        return ret;
        // -end- 358A60230129 detach_body358A5FF400A0 "Coding::detachINTERLIS2Def"
}

/** get the currently attached INTERLIS2Def.
 *  @see #attachINTERLIS2Def
 */
// -beg- preserve=no 358A60230129 get_head358A5FF400A0 "Coding::getINTERLIS2Def"
public INTERLIS2Def getINTERLIS2Def()
// -end- 358A60230129 get_head358A5FF400A0 "Coding::getINTERLIS2Def"
{
        // -beg- preserve=no 358A60230129 get_body358A5FF400A0 "Coding::getINTERLIS2Def"
        if(iNTERLIS2Def==null) {throw new java.lang.IllegalStateException("no iNTERLIS2Def attached");}
        return iNTERLIS2Def;
        // -end- 358A60230129 get_body358A5FF400A0 "Coding::getINTERLIS2Def"
}

/** tests if there is a INTERLIS2Def attached.
 *  @see #attachINTERLIS2Def
 */
// -beg- preserve=no 358A60230129 test_head358A5FF400A0 "Coding::containsINTERLIS2Def"
public boolean containsINTERLIS2Def()
// -end- 358A60230129 test_head358A5FF400A0 "Coding::containsINTERLIS2Def"
{
        // -beg- preserve=no 358A60230129 test_body358A5FF400A0 "Coding::containsINTERLIS2Def"
        return iNTERLIS2Def!=null;
        // -end- 358A60230129 test_body358A5FF400A0 "Coding::containsINTERLIS2Def"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 358A60230129 _link_body358A5FF400A0 "Coding::_linkINTERLIS2Def"
public void _linkINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1)
{
        iNTERLIS2Def = iNTERLIS2Def1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkINTERLIS2Def"));
        return;
}
// -end- 358A60230129 _link_body358A5FF400A0 "Coding::_linkINTERLIS2Def"

/** DONT USE; link management internal
 */
// -beg- preserve=no 358A60230129 _unlink_body358A5FF400A0 "Coding::_unlinkINTERLIS2Def"
public void _unlinkINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1)
{
        iNTERLIS2Def = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkINTERLIS2Def"));
        return;
}
// -end- 358A60230129 _unlink_body358A5FF400A0 "Coding::_unlinkINTERLIS2Def"

// -beg- preserve=no 36026DB90096 code358A5FF400A0 "transferID"
private TransferID transferID;
// -end- 36026DB90096 code358A5FF400A0 "transferID"

/** attaches a TransferID.
 *
 *  @see #detachTransferID
 *  @see #getTransferID
 *  @see #containsTransferID
 */
// -beg- preserve=no 36026DB90096 attach_head358A5FF400A0 "Coding::attachTransferID"
public void attachTransferID(TransferID transferID1)
// -end- 36026DB90096 attach_head358A5FF400A0 "Coding::attachTransferID"
{
        // -beg- preserve=no 36026DB90096 attach_body358A5FF400A0 "Coding::attachTransferID"
        if(transferID!=null) {throw new java.lang.IllegalStateException("already a transferID attached");}
        if(transferID1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as transferID");}
        transferID = transferID1;
        transferID1._linkCoding(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachTransferID"));
        return;
        // -end- 36026DB90096 attach_body358A5FF400A0 "Coding::attachTransferID"
}

/** disconnect the currently attached TransferID.
 *  @see #attachTransferID
 */
// -beg- preserve=no 36026DB90096 detach_head358A5FF400A0 "Coding::detachTransferID"
public TransferID detachTransferID()
// -end- 36026DB90096 detach_head358A5FF400A0 "Coding::detachTransferID"
{
        // -beg- preserve=no 36026DB90096 detach_body358A5FF400A0 "Coding::detachTransferID"
        TransferID ret = null;
        if(transferID!=null) {
                transferID._unlinkCoding(this);
                ret = transferID;
                transferID = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachTransferID"));
        return ret;
        // -end- 36026DB90096 detach_body358A5FF400A0 "Coding::detachTransferID"
}

/** get the currently attached TransferID.
 *  @see #attachTransferID
 */
// -beg- preserve=no 36026DB90096 get_head358A5FF400A0 "Coding::getTransferID"
public TransferID getTransferID()
// -end- 36026DB90096 get_head358A5FF400A0 "Coding::getTransferID"
{
        // -beg- preserve=no 36026DB90096 get_body358A5FF400A0 "Coding::getTransferID"
        if(transferID==null) {throw new java.lang.IllegalStateException("no transferID attached");}
        return transferID;
        // -end- 36026DB90096 get_body358A5FF400A0 "Coding::getTransferID"
}

/** tests if there is a TransferID attached.
 *  @see #attachTransferID
 */
// -beg- preserve=no 36026DB90096 test_head358A5FF400A0 "Coding::containsTransferID"
public boolean containsTransferID()
// -end- 36026DB90096 test_head358A5FF400A0 "Coding::containsTransferID"
{
        // -beg- preserve=no 36026DB90096 test_body358A5FF400A0 "Coding::containsTransferID"
        return transferID!=null;
        // -end- 36026DB90096 test_body358A5FF400A0 "Coding::containsTransferID"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 36026DB90096 _link_body358A5FF400A0 "Coding::_linkTransferID"
public void _linkTransferID(TransferID transferID1)
{
        transferID = transferID1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkTransferID"));
        return;
}
// -end- 36026DB90096 _link_body358A5FF400A0 "Coding::_linkTransferID"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36026DB90096 _unlink_body358A5FF400A0 "Coding::_unlinkTransferID"
public void _unlinkTransferID(TransferID transferID1)
{
        transferID = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkTransferID"));
        return;
}
// -end- 36026DB90096 _unlink_body358A5FF400A0 "Coding::_unlinkTransferID"

// -beg- preserve=no 358A73CF03C0 var358A5FF400A0 "font"
private String font;
// -end- 358A73CF03C0 var358A5FF400A0 "font"

/** get current value of font
 *  Zeichensatz z.
 *  @see #setFont
 */
// -beg- preserve=no 358A73CF03C0 get_head358A5FF400A0 "font"
public String getFont()
// -end- 358A73CF03C0 get_head358A5FF400A0 "font"
{
        // -beg- preserve=no 358A73CF03C0 get_body358A5FF400A0 "font"
        return font;
        // -end- 358A73CF03C0 get_body358A5FF400A0 "font"
}

/** set current value of font
 *  @see #getFont
 */
// -beg- preserve=no 358A73CF03C0 set_head358A5FF400A0 "font"
public void setFont(String value1)
// -end- 358A73CF03C0 set_head358A5FF400A0 "font"
{
        // -beg- preserve=no 358A73CF03C0 set_body358A5FF400A0 "font"
        if(font != value1) {
                font = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setFont"));
        }
        // -end- 358A73CF03C0 set_body358A5FF400A0 "font"
}

// -beg- preserve=no 358A73D70385 var358A5FF400A0 "blank"
private long blank;
// -end- 358A73D70385 var358A5FF400A0 "blank"

/** get current value of blank
 *  Ersatzzeichen fuer Leerzeichen innerhalb von Textattributen
 *  @see #setBlank
 */
// -beg- preserve=no 358A73D70385 get_head358A5FF400A0 "blank"
public long getBlank()
// -end- 358A73D70385 get_head358A5FF400A0 "blank"
{
        // -beg- preserve=no 358A73D70385 get_body358A5FF400A0 "blank"
        return blank;
        // -end- 358A73D70385 get_body358A5FF400A0 "blank"
}

/** set current value of blank
 *  @see #getBlank
 */
// -beg- preserve=no 358A73D70385 set_head358A5FF400A0 "blank"
public void setBlank(long value1)
// -end- 358A73D70385 set_head358A5FF400A0 "blank"
{
        // -beg- preserve=no 358A73D70385 set_body358A5FF400A0 "blank"
        if(blank != value1) {
                blank = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBlank"));
        }
        // -end- 358A73D70385 set_body358A5FF400A0 "blank"
}

// -beg- preserve=no 358A73E2034F var358A5FF400A0 "undefined"
private long undefined;
// -end- 358A73E2034F var358A5FF400A0 "undefined"

/** get current value of undefined
 *  Zeichen fuer NULL bei optionalen Attributen
 *  @see #setUndefined
 */
// -beg- preserve=no 358A73E2034F get_head358A5FF400A0 "undefined"
public long getUndefined()
// -end- 358A73E2034F get_head358A5FF400A0 "undefined"
{
        // -beg- preserve=no 358A73E2034F get_body358A5FF400A0 "undefined"
        return undefined;
        // -end- 358A73E2034F get_body358A5FF400A0 "undefined"
}

/** set current value of undefined
 *  @see #getUndefined
 */
// -beg- preserve=no 358A73E2034F set_head358A5FF400A0 "undefined"
public void setUndefined(long value1)
// -end- 358A73E2034F set_head358A5FF400A0 "undefined"
{
        // -beg- preserve=no 358A73E2034F set_body358A5FF400A0 "undefined"
        if(undefined != value1) {
                undefined = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setUndefined"));
        }
        // -end- 358A73E2034F set_body358A5FF400A0 "undefined"
}

// -beg- preserve=no 358A73EC01CD var358A5FF400A0 "continu"
private long continu;
// -end- 358A73EC01CD var358A5FF400A0 "continu"

/** get current value of continu
 *  Fortsetzungszeichen wenn ein Record in mehreren Zeilen ausgegeben wird
 *  @see #setContinu
 */
// -beg- preserve=no 358A73EC01CD get_head358A5FF400A0 "continu"
public long getContinu()
// -end- 358A73EC01CD get_head358A5FF400A0 "continu"
{
        // -beg- preserve=no 358A73EC01CD get_body358A5FF400A0 "continu"
        return continu;
        // -end- 358A73EC01CD get_body358A5FF400A0 "continu"
}

/** set current value of continu
 *  @see #getContinu
 */
// -beg- preserve=no 358A73EC01CD set_head358A5FF400A0 "continu"
public void setContinu(long value1)
// -end- 358A73EC01CD set_head358A5FF400A0 "continu"
{
        // -beg- preserve=no 358A73EC01CD set_body358A5FF400A0 "continu"
        if(continu != value1) {
                continu = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setContinu"));
        }
        // -end- 358A73EC01CD set_body358A5FF400A0 "continu"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 358A5FF400A0 detail_end "Coding"

// -end- 358A5FF400A0 detail_end "Coding"

}
