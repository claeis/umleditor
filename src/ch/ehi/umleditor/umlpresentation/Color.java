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


// -beg- preserve=no 3C34369E0397 package "Color"
package ch.ehi.umleditor.umlpresentation;
// -end- 3C34369E0397 package "Color"

// -beg- preserve=no 3C34369E0397 autoimport "Color"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3C34369E0397 autoimport "Color"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C34369E0397 import "Color"

// -end- 3C34369E0397 import "Color"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:08 $
 */
public class Color extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C34369E0397 detail_begin "Color"

// -end- 3C34369E0397 detail_begin "Color"

// -beg- preserve=no 3D4FA21702D7 head3C34369E0397 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA21702D7 head3C34369E0397 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21702D7 throws3C34369E0397 "unlinkAll"

// -end- 3D4FA21702D7 throws3C34369E0397 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21702D7 body3C34369E0397 "unlinkAll"

        super.unlinkAll();
        // -end- 3D4FA21702D7 body3C34369E0397 "unlinkAll"
}

// -beg- preserve=no 3D4FA21702D8 head3C34369E0397 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA21702D8 head3C34369E0397 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA21702D8 throws3C34369E0397 "enumerateChildren"

// -end- 3D4FA21702D8 throws3C34369E0397 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA21702D8 body3C34369E0397 "enumerateChildren"
        java.util.Iterator it=null;
        super.enumerateChildren(visitor);
        // -end- 3D4FA21702D8 body3C34369E0397 "enumerateChildren"
}

// -beg- preserve=no 3C3436E7025B var3C34369E0397 "red"
private int red;
// -end- 3C3436E7025B var3C34369E0397 "red"

/** get current value of red
 *  @see #setRed
 */
// -beg- preserve=no 3C3436E7025B get_head3C34369E0397 "red"
public int getRed()
// -end- 3C3436E7025B get_head3C34369E0397 "red"
{
        // -beg- preserve=no 3C3436E7025B get_body3C34369E0397 "red"
        return red;
        // -end- 3C3436E7025B get_body3C34369E0397 "red"
}

/** set current value of red
 *  @see #getRed
 */
// -beg- preserve=no 3C3436E7025B set_head3C34369E0397 "red"
public void setRed(int value1)
// -end- 3C3436E7025B set_head3C34369E0397 "red"
{
        // -beg- preserve=no 3C3436E7025B set_body3C34369E0397 "red"
        if(red != value1) {
                red = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setRed"));
        }
        // -end- 3C3436E7025B set_body3C34369E0397 "red"
}

// -beg- preserve=no 3C3437030161 var3C34369E0397 "green"
private int green;
// -end- 3C3437030161 var3C34369E0397 "green"

/** get current value of green
 *  @see #setGreen
 */
// -beg- preserve=no 3C3437030161 get_head3C34369E0397 "green"
public int getGreen()
// -end- 3C3437030161 get_head3C34369E0397 "green"
{
        // -beg- preserve=no 3C3437030161 get_body3C34369E0397 "green"
        return green;
        // -end- 3C3437030161 get_body3C34369E0397 "green"
}

/** set current value of green
 *  @see #getGreen
 */
// -beg- preserve=no 3C3437030161 set_head3C34369E0397 "green"
public void setGreen(int value1)
// -end- 3C3437030161 set_head3C34369E0397 "green"
{
        // -beg- preserve=no 3C3437030161 set_body3C34369E0397 "green"
        if(green != value1) {
                green = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setGreen"));
        }
        // -end- 3C3437030161 set_body3C34369E0397 "green"
}

// -beg- preserve=no 3C34370A0193 var3C34369E0397 "blue"
private int blue;
// -end- 3C34370A0193 var3C34369E0397 "blue"

/** get current value of blue
 *  @see #setBlue
 */
// -beg- preserve=no 3C34370A0193 get_head3C34369E0397 "blue"
public int getBlue()
// -end- 3C34370A0193 get_head3C34369E0397 "blue"
{
        // -beg- preserve=no 3C34370A0193 get_body3C34369E0397 "blue"
        return blue;
        // -end- 3C34370A0193 get_body3C34369E0397 "blue"
}

/** set current value of blue
 *  @see #getBlue
 */
// -beg- preserve=no 3C34370A0193 set_head3C34369E0397 "blue"
public void setBlue(int value1)
// -end- 3C34370A0193 set_head3C34369E0397 "blue"
{
        // -beg- preserve=no 3C34370A0193 set_body3C34369E0397 "blue"
        if(blue != value1) {
                blue = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBlue"));
        }
        // -end- 3C34370A0193 set_body3C34369E0397 "blue"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C34369E0397 detail_end "Color"

// -end- 3C34369E0397 detail_end "Color"

}
