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


// -beg- preserve=no 36026D4200D1 package "TransferID"
package ch.ehi.interlis.modeltopicclass;
// -end- 36026D4200D1 package "TransferID"

// -beg- preserve=no 36026D4200D1 autoimport "TransferID"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.modeltopicclass.Coding;
import ch.ehi.interlis.modeltopicclass.TransferIdKind;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 36026D4200D1 autoimport "TransferID"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 36026D4200D1 import "TransferID"

// -end- 36026D4200D1 import "TransferID"

/** Definition der Objektidentifikation in der Transferdatei.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:13 $
 */
public class TransferID extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 36026D4200D1 detail_begin "TransferID"

// -end- 36026D4200D1 detail_begin "TransferID"

// -beg- preserve=no 3D4FA21A0016 head36026D4200D1 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21A0016 head36026D4200D1 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21A0016 throws36026D4200D1 "unlinkAll"

// -end- 3D4FA21A0016 throws36026D4200D1 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21A0016 body36026D4200D1 "unlinkAll"

        detachCoding();
        setExplanation(null);
        super.unlinkAll();
        // -end- 3D4FA21A0016 body36026D4200D1 "unlinkAll"
}

// -beg- preserve=no 3D4FA21A001F head36026D4200D1 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21A001F head36026D4200D1 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21A001F throws36026D4200D1 "enumerateChildren"

// -end- 3D4FA21A001F throws36026D4200D1 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21A001F body36026D4200D1 "enumerateChildren"
        java.util.Iterator it=null;
        visitor.visit(getExplanation());
        super.enumerateChildren(visitor);
        // -end- 3D4FA21A001F body36026D4200D1 "enumerateChildren"
}

// -beg- preserve=no 36026DB900B4 code36026D4200D1 "coding"
private Coding coding;
// -end- 36026DB900B4 code36026D4200D1 "coding"

/** attaches a Coding.
 *
 *  @see #detachCoding
 *  @see #getCoding
 *  @see #containsCoding
 */
// -beg- preserve=no 36026DB900B4 attach_head36026D4200D1 "TransferID::attachCoding"
public void attachCoding(Coding coding1)
// -end- 36026DB900B4 attach_head36026D4200D1 "TransferID::attachCoding"
{
        // -beg- preserve=no 36026DB900B4 attach_body36026D4200D1 "TransferID::attachCoding"
        if(coding!=null) {throw new java.lang.IllegalStateException("already a coding attached");}
        if(coding1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as coding");}
        coding = coding1;
        coding1._linkTransferID(this);
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachCoding"));
        return;
        // -end- 36026DB900B4 attach_body36026D4200D1 "TransferID::attachCoding"
}

/** disconnect the currently attached Coding.
 *  @see #attachCoding
 */
// -beg- preserve=no 36026DB900B4 detach_head36026D4200D1 "TransferID::detachCoding"
public Coding detachCoding()
// -end- 36026DB900B4 detach_head36026D4200D1 "TransferID::detachCoding"
{
        // -beg- preserve=no 36026DB900B4 detach_body36026D4200D1 "TransferID::detachCoding"
        Coding ret = null;
        if(coding!=null) {
                coding._unlinkTransferID(this);
                ret = coding;
                coding = null;
        }
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachCoding"));
        return ret;
        // -end- 36026DB900B4 detach_body36026D4200D1 "TransferID::detachCoding"
}

/** get the currently attached Coding.
 *  @see #attachCoding
 */
// -beg- preserve=no 36026DB900B4 get_head36026D4200D1 "TransferID::getCoding"
public Coding getCoding()
// -end- 36026DB900B4 get_head36026D4200D1 "TransferID::getCoding"
{
        // -beg- preserve=no 36026DB900B4 get_body36026D4200D1 "TransferID::getCoding"
        if(coding==null) {throw new java.lang.IllegalStateException("no coding attached");}
        return coding;
        // -end- 36026DB900B4 get_body36026D4200D1 "TransferID::getCoding"
}

/** tests if there is a Coding attached.
 *  @see #attachCoding
 */
// -beg- preserve=no 36026DB900B4 test_head36026D4200D1 "TransferID::containsCoding"
public boolean containsCoding()
// -end- 36026DB900B4 test_head36026D4200D1 "TransferID::containsCoding"
{
        // -beg- preserve=no 36026DB900B4 test_body36026D4200D1 "TransferID::containsCoding"
        return coding!=null;
        // -end- 36026DB900B4 test_body36026D4200D1 "TransferID::containsCoding"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 36026DB900B4 _link_body36026D4200D1 "TransferID::_linkCoding"
public void _linkCoding(Coding coding1)
{
        coding = coding1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkCoding"));
        return;
}
// -end- 36026DB900B4 _link_body36026D4200D1 "TransferID::_linkCoding"

/** DONT USE; link management internal
 */
// -beg- preserve=no 36026DB900B4 _unlink_body36026D4200D1 "TransferID::_unlinkCoding"
public void _unlinkCoding(Coding coding1)
{
        coding = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkCoding"));
        return;
}
// -end- 36026DB900B4 _unlink_body36026D4200D1 "TransferID::_unlinkCoding"

// -beg- preserve=no 36026D5803A4 var36026D4200D1 "kind"
private int kind;
// -end- 36026D5803A4 var36026D4200D1 "kind"

/** get current value of kind
 *  I16, I32, ANY oder EXPLANATION
 *  @see ch.ehi.interlis.modeltopicclass.TransferIdKind
 *  @see #setKind
 */
// -beg- preserve=no 36026D5803A4 get_head36026D4200D1 "kind"
public int getKind()
// -end- 36026D5803A4 get_head36026D4200D1 "kind"
{
        // -beg- preserve=no 36026D5803A4 get_body36026D4200D1 "kind"
        return kind;
        // -end- 36026D5803A4 get_body36026D4200D1 "kind"
}

/** set current value of kind
 *  @see ch.ehi.interlis.modeltopicclass.TransferIdKind
 *  @see #getKind
 */
// -beg- preserve=no 36026D5803A4 set_head36026D4200D1 "kind"
public void setKind(int value1)
// -end- 36026D5803A4 set_head36026D4200D1 "kind"
{
        // -beg- preserve=no 36026D5803A4 set_body36026D4200D1 "kind"
        if(kind != value1) {
                kind = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
        }
        // -end- 36026D5803A4 set_body36026D4200D1 "kind"
}

// -beg- preserve=no 36026D630291 var36026D4200D1 "explanation"
private NlsString explanation = null;
// -end- 36026D630291 var36026D4200D1 "explanation"

/** get current value of explanation
 *  Definition TransferID in Prosa
 *  @see #setExplanation
 */
// -beg- preserve=no 36026D630291 get_head36026D4200D1 "explanation"
public NlsString getExplanation()
// -end- 36026D630291 get_head36026D4200D1 "explanation"
{
        // -beg- preserve=no 36026D630291 get_body36026D4200D1 "explanation"
        return explanation;
        // -end- 36026D630291 get_body36026D4200D1 "explanation"
}

/** set current value of explanation
 *  @see #getExplanation
 */
// -beg- preserve=no 36026D630291 set_head36026D4200D1 "explanation"
public void setExplanation(NlsString value1)
// -end- 36026D630291 set_head36026D4200D1 "explanation"
{
        // -beg- preserve=no 36026D630291 set_body36026D4200D1 "explanation"
        if(explanation!=value1 && (explanation==null || !explanation.equals(value1))) {
                explanation = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setExplanation"));
        }
        // -end- 36026D630291 set_body36026D4200D1 "explanation"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 36026D4200D1 detail_end "TransferID"

// -end- 36026D4200D1 detail_end "TransferID"

}
