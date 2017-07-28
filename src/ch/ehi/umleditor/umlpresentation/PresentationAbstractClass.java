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


// -beg- preserve=no 3D47AB2F01F2 package "PresentationAbstractClass"
package ch.ehi.umleditor.umlpresentation;
// -end- 3D47AB2F01F2 package "PresentationAbstractClass"

// -beg- preserve=no 3D47AB2F01F2 autoimport "PresentationAbstractClass"
import ch.ehi.umleditor.umlpresentation.PresentationNode;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3D47AB2F01F2 autoimport "PresentationAbstractClass"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3D47AB2F01F2 import "PresentationAbstractClass"

// -end- 3D47AB2F01F2 import "PresentationAbstractClass"

/** @author Claude Eisenhut
 *  @version $Revision: 1.4 $ $Date: 2006-07-03 06:18:46 $
 */
public abstract class PresentationAbstractClass extends PresentationNode
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3D47AB2F01F2 detail_begin "PresentationAbstractClass"

// -end- 3D47AB2F01F2 detail_begin "PresentationAbstractClass"

// -beg- preserve=no 3D4FA217033B head3D47AB2F01F2 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA217033B head3D47AB2F01F2 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA217033B throws3D47AB2F01F2 "unlinkAll"

// -end- 3D4FA217033B throws3D47AB2F01F2 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA217033B body3D47AB2F01F2 "unlinkAll"

        super.unlinkAll();
        // -end- 3D4FA217033B body3D47AB2F01F2 "unlinkAll"
}

// -beg- preserve=no 3D4FA2170345 head3D47AB2F01F2 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2170345 head3D47AB2F01F2 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2170345 throws3D47AB2F01F2 "enumerateChildren"

// -end- 3D4FA2170345 throws3D47AB2F01F2 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2170345 body3D47AB2F01F2 "enumerateChildren"
        java.util.Iterator it=null;
        super.enumerateChildren(visitor);
        // -end- 3D4FA2170345 body3D47AB2F01F2 "enumerateChildren"
}

// -beg- preserve=no 3E41014D00E2 var3D47AB2F01F2 "suppressAttributes"
private boolean suppressAttributes = false;
// -end- 3E41014D00E2 var3D47AB2F01F2 "suppressAttributes"

/** get current value of suppressAttributes
 *  @see #setSuppressAttributes
 */
// -beg- preserve=no 3E41014D00E2 get_head3D47AB2F01F2 "suppressAttributes"
public boolean isSuppressAttributes()
// -end- 3E41014D00E2 get_head3D47AB2F01F2 "suppressAttributes"
{
        // -beg- preserve=no 3E41014D00E2 get_body3D47AB2F01F2 "suppressAttributes"
        return suppressAttributes;
        // -end- 3E41014D00E2 get_body3D47AB2F01F2 "suppressAttributes"
}

/** set current value of suppressAttributes
 *  @see #isSuppressAttributes
 */
// -beg- preserve=no 3E41014D00E2 set_head3D47AB2F01F2 "suppressAttributes"
public void setSuppressAttributes(boolean value1)
// -end- 3E41014D00E2 set_head3D47AB2F01F2 "suppressAttributes"
{
        // -beg- preserve=no 3E41014D00E2 set_body3D47AB2F01F2 "suppressAttributes"
        if(suppressAttributes != value1) {
                suppressAttributes = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSuppressAttributes"));
        }
        // -end- 3E41014D00E2 set_body3D47AB2F01F2 "suppressAttributes"
}

// -beg- preserve=no 3E4101AE0358 var3D47AB2F01F2 "showInheritedAttributes"
private boolean showInheritedAttributes = false;
// -end- 3E4101AE0358 var3D47AB2F01F2 "showInheritedAttributes"

/** get current value of showInheritedAttributes
 *  @see #setShowInheritedAttributes
 */
// -beg- preserve=no 3E4101AE0358 get_head3D47AB2F01F2 "showInheritedAttributes"
public boolean isShowInheritedAttributes()
// -end- 3E4101AE0358 get_head3D47AB2F01F2 "showInheritedAttributes"
{
        // -beg- preserve=no 3E4101AE0358 get_body3D47AB2F01F2 "showInheritedAttributes"
        return showInheritedAttributes;
        // -end- 3E4101AE0358 get_body3D47AB2F01F2 "showInheritedAttributes"
}

/** set current value of showInheritedAttributes
 *  @see #isShowInheritedAttributes
 */
// -beg- preserve=no 3E4101AE0358 set_head3D47AB2F01F2 "showInheritedAttributes"
public void setShowInheritedAttributes(boolean value1)
// -end- 3E4101AE0358 set_head3D47AB2F01F2 "showInheritedAttributes"
{
        // -beg- preserve=no 3E4101AE0358 set_body3D47AB2F01F2 "showInheritedAttributes"
        if(showInheritedAttributes != value1) {
                showInheritedAttributes = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowInheritedAttributes"));
        }
        // -end- 3E4101AE0358 set_body3D47AB2F01F2 "showInheritedAttributes"
}

// -beg- preserve=no 404B8FC30193 var3D47AB2F01F2 "suppressOperations"
private boolean suppressOperations = false;
// -end- 404B8FC30193 var3D47AB2F01F2 "suppressOperations"

/** get current value of suppressOperations
 *  @see #setSuppressOperations
 */
// -beg- preserve=no 404B8FC30193 get_head3D47AB2F01F2 "suppressOperations"
public boolean isSuppressOperations()
// -end- 404B8FC30193 get_head3D47AB2F01F2 "suppressOperations"
{
        // -beg- preserve=no 404B8FC30193 get_body3D47AB2F01F2 "suppressOperations"
        return suppressOperations;
        // -end- 404B8FC30193 get_body3D47AB2F01F2 "suppressOperations"
}

/** set current value of suppressOperations
 *  @see #isSuppressOperations
 */
// -beg- preserve=no 404B8FC30193 set_head3D47AB2F01F2 "suppressOperations"
public void setSuppressOperations(boolean value1)
// -end- 404B8FC30193 set_head3D47AB2F01F2 "suppressOperations"
{
        // -beg- preserve=no 404B8FC30193 set_body3D47AB2F01F2 "suppressOperations"
        if(suppressOperations != value1) {
                suppressOperations = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSuppressOperations"));
        }
        // -end- 404B8FC30193 set_body3D47AB2F01F2 "suppressOperations"
}

// -beg- preserve=no 404B904201B3 var3D47AB2F01F2 "showOperationSignatures"
private boolean showOperationSignatures = false;
// -end- 404B904201B3 var3D47AB2F01F2 "showOperationSignatures"

/** get current value of showOperationSignatures
 *  @see #setShowOperationSignatures
 */
// -beg- preserve=no 404B904201B3 get_head3D47AB2F01F2 "showOperationSignatures"
public boolean isShowOperationSignatures()
// -end- 404B904201B3 get_head3D47AB2F01F2 "showOperationSignatures"
{
        // -beg- preserve=no 404B904201B3 get_body3D47AB2F01F2 "showOperationSignatures"
        return showOperationSignatures;
        // -end- 404B904201B3 get_body3D47AB2F01F2 "showOperationSignatures"
}

/** set current value of showOperationSignatures
 *  @see #isShowOperationSignatures
 */
// -beg- preserve=no 404B904201B3 set_head3D47AB2F01F2 "showOperationSignatures"
public void setShowOperationSignatures(boolean value1)
// -end- 404B904201B3 set_head3D47AB2F01F2 "showOperationSignatures"
{
        // -beg- preserve=no 404B904201B3 set_body3D47AB2F01F2 "showOperationSignatures"
        if(showOperationSignatures != value1) {
                showOperationSignatures = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowOperationSignatures"));
        }
        // -end- 404B904201B3 set_body3D47AB2F01F2 "showOperationSignatures"
}

// -beg- preserve=no 448D2E2D0234 var3D47AB2F01F2 "showNamePrefix"
private int showNamePrefix = ShowNamePrefixKind.HIDE;
// -end- 448D2E2D0234 var3D47AB2F01F2 "showNamePrefix"

/** get current value of showNamePrefix
 *  @see #setShowNamePrefix
 */
// -beg- preserve=no 448D2E2D0234 get_head3D47AB2F01F2 "showNamePrefix"
public int getShowNamePrefix()
// -end- 448D2E2D0234 get_head3D47AB2F01F2 "showNamePrefix"
{
        // -beg- preserve=no 448D2E2D0234 get_body3D47AB2F01F2 "showNamePrefix"
        return showNamePrefix;
        // -end- 448D2E2D0234 get_body3D47AB2F01F2 "showNamePrefix"
}

/** set current value of showNamePrefix
 *  @see #getShowNamePrefix
 */
// -beg- preserve=no 448D2E2D0234 set_head3D47AB2F01F2 "showNamePrefix"
public void setShowNamePrefix(int value1)
// -end- 448D2E2D0234 set_head3D47AB2F01F2 "showNamePrefix"
{
        // -beg- preserve=no 448D2E2D0234 set_body3D47AB2F01F2 "showNamePrefix"
        if(showNamePrefix != value1) {
                showNamePrefix = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowNamePrefix"));
        }
        // -end- 448D2E2D0234 set_body3D47AB2F01F2 "showNamePrefix"
}

// -beg- preserve=no 44A8B25B03E6 var3D47AB2F01F2 "showConstraints"
private int showConstraints = ShowConstraintsKind.HIDE;
// -end- 44A8B25B03E6 var3D47AB2F01F2 "showConstraints"

/** get current value of showConstraints
 *  @see #setShowConstraints
 */
// -beg- preserve=no 44A8B25B03E6 get_head3D47AB2F01F2 "showConstraints"
public int getShowConstraints()
// -end- 44A8B25B03E6 get_head3D47AB2F01F2 "showConstraints"
{
        // -beg- preserve=no 44A8B25B03E6 get_body3D47AB2F01F2 "showConstraints"
        return showConstraints;
        // -end- 44A8B25B03E6 get_body3D47AB2F01F2 "showConstraints"
}

/** set current value of showConstraints
 *  @see #getShowConstraints
 */
// -beg- preserve=no 44A8B25B03E6 set_head3D47AB2F01F2 "showConstraints"
public void setShowConstraints(int value1)
// -end- 44A8B25B03E6 set_head3D47AB2F01F2 "showConstraints"
{
        // -beg- preserve=no 44A8B25B03E6 set_body3D47AB2F01F2 "showConstraints"
        if(showConstraints != value1) {
                showConstraints = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowConstraints"));
        }
        // -end- 44A8B25B03E6 set_body3D47AB2F01F2 "showConstraints"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3D47AB2F01F2 detail_end "PresentationAbstractClass"

// -end- 3D47AB2F01F2 detail_end "PresentationAbstractClass"

}
