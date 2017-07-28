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


// -beg- preserve=no 3C2C36BE03A0 package "Package"
package ch.ehi.umleditor.umlpresentation;
// -end- 3C2C36BE03A0 package "Package"

// -beg- preserve=no 3C2C36BE03A0 autoimport "Package"
import ch.ehi.umleditor.umlpresentation.PresentationNode;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3C2C36BE03A0 autoimport "Package"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C2C36BE03A0 import "Package"

// -end- 3C2C36BE03A0 import "Package"

/** @author Claude Eisenhut
 *  @version $Revision: 1.2 $ $Date: 2006-06-13 14:32:01 $
 */
public class Package extends PresentationNode implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C2C36BE03A0 detail_begin "Package"

// -end- 3C2C36BE03A0 detail_begin "Package"

// -beg- preserve=no 3D4FA2170223 head3C2C36BE03A0 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA2170223 head3C2C36BE03A0 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2170223 throws3C2C36BE03A0 "unlinkAll"

// -end- 3D4FA2170223 throws3C2C36BE03A0 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2170223 body3C2C36BE03A0 "unlinkAll"

        clearSubject();
        super.unlinkAll();
        // -end- 3D4FA2170223 body3C2C36BE03A0 "unlinkAll"
}

// -beg- preserve=no 3D4FA217022D head3C2C36BE03A0 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA217022D head3C2C36BE03A0 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA217022D throws3C2C36BE03A0 "enumerateChildren"

// -end- 3D4FA217022D throws3C2C36BE03A0 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA217022D body3C2C36BE03A0 "enumerateChildren"
        java.util.Iterator it=null;
        super.enumerateChildren(visitor);
        // -end- 3D4FA217022D body3C2C36BE03A0 "enumerateChildren"
}

// -beg- preserve=no 362409A803C0 code3C2C36BE03A0 "subject"

// -end- 362409A803C0 code3C2C36BE03A0 "subject"

/** add a Subject.
 *
 *  @see #removeSubject
 *  @see #containsSubject
 *  @see #iteratorSubject
 *  @see #clearSubject
 *  @see #sizeSubject
 */
// -beg- preserve=no 362409A803C0 add_head3C2C36BE03A0 "PresentationElement::addSubject"
public void addSubject(ModelElement subject1)
// -end- 362409A803C0 add_head3C2C36BE03A0 "PresentationElement::addSubject"
{
        // -beg- preserve=no 362409A803C0 add_body3C2C36BE03A0 "PresentationElement::addSubject"
        super.addSubject(subject1);
        // -end- 362409A803C0 add_body3C2C36BE03A0 "PresentationElement::addSubject"
}

/** disconnect a Subject.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 remove_head3C2C36BE03A0 "PresentationElement::removeSubject"
public ModelElement removeSubject(ModelElement subject1)
// -end- 362409A803C0 remove_head3C2C36BE03A0 "PresentationElement::removeSubject"
{
        // -beg- preserve=no 362409A803C0 remove_body3C2C36BE03A0 "PresentationElement::removeSubject"
        return super.removeSubject(subject1);
        // -end- 362409A803C0 remove_body3C2C36BE03A0 "PresentationElement::removeSubject"
}

/** tests if a given Subject is connected.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 test_head3C2C36BE03A0 "PresentationElement::containsSubject"
public boolean containsSubject(ModelElement subject1)
// -end- 362409A803C0 test_head3C2C36BE03A0 "PresentationElement::containsSubject"
{
        // -beg- preserve=no 362409A803C0 test_body3C2C36BE03A0 "PresentationElement::containsSubject"
        return super.containsSubject(subject1);
        // -end- 362409A803C0 test_body3C2C36BE03A0 "PresentationElement::containsSubject"
}

/** used to enumerate all connected Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 get_all_head3C2C36BE03A0 "PresentationElement::iteratorSubject"
public java.util.Iterator iteratorSubject()
// -end- 362409A803C0 get_all_head3C2C36BE03A0 "PresentationElement::iteratorSubject"
{
        // -beg- preserve=no 362409A803C0 get_all_body3C2C36BE03A0 "PresentationElement::iteratorSubject"
        return super.iteratorSubject();
        // -end- 362409A803C0 get_all_body3C2C36BE03A0 "PresentationElement::iteratorSubject"
}

/** disconnect all Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 remove_all_head3C2C36BE03A0 "PresentationElement::clearSubject"
public void clearSubject()
// -end- 362409A803C0 remove_all_head3C2C36BE03A0 "PresentationElement::clearSubject"
{
        // -beg- preserve=no 362409A803C0 remove_all_body3C2C36BE03A0 "PresentationElement::clearSubject"
        super.clearSubject();
        // -end- 362409A803C0 remove_all_body3C2C36BE03A0 "PresentationElement::clearSubject"
}

/** returns the number of Subjects.
 *  @see #addSubject
 */
// -beg- preserve=no 362409A803C0 size_head3C2C36BE03A0 "PresentationElement::sizeSubject"
public int sizeSubject()
// -end- 362409A803C0 size_head3C2C36BE03A0 "PresentationElement::sizeSubject"
{
        // -beg- preserve=no 362409A803C0 size_body3C2C36BE03A0 "PresentationElement::sizeSubject"
        return super.sizeSubject();
        // -end- 362409A803C0 size_body3C2C36BE03A0 "PresentationElement::sizeSubject"
}

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A803C0 _link_body3C2C36BE03A0 "PresentationElement::_linkSubject"
public void _linkSubject(ModelElement subject1)
{
        super._linkSubject(subject1);
}
// -end- 362409A803C0 _link_body3C2C36BE03A0 "PresentationElement::_linkSubject"

/** DONT USE; link management internal
 */
// -beg- preserve=no 362409A803C0 _unlink_body3C2C36BE03A0 "PresentationElement::_unlinkSubject"
public void _unlinkSubject(ModelElement subject1)
{
        super._unlinkSubject(subject1);
}
// -end- 362409A803C0 _unlink_body3C2C36BE03A0 "PresentationElement::_unlinkSubject"

// -beg- preserve=no 448D2E13010A var3C2C36BE03A0 "showNamePrefix"
private int showNamePrefix = ShowNamePrefixKind.HIDE;
// -end- 448D2E13010A var3C2C36BE03A0 "showNamePrefix"

/** get current value of showNamePrefix
 *  @see #setShowNamePrefix
 */
// -beg- preserve=no 448D2E13010A get_head3C2C36BE03A0 "showNamePrefix"
public int getShowNamePrefix()
// -end- 448D2E13010A get_head3C2C36BE03A0 "showNamePrefix"
{
        // -beg- preserve=no 448D2E13010A get_body3C2C36BE03A0 "showNamePrefix"
        return showNamePrefix;
        // -end- 448D2E13010A get_body3C2C36BE03A0 "showNamePrefix"
}

/** set current value of showNamePrefix
 *  @see #getShowNamePrefix
 */
// -beg- preserve=no 448D2E13010A set_head3C2C36BE03A0 "showNamePrefix"
public void setShowNamePrefix(int value1)
// -end- 448D2E13010A set_head3C2C36BE03A0 "showNamePrefix"
{
        // -beg- preserve=no 448D2E13010A set_body3C2C36BE03A0 "showNamePrefix"
        if(showNamePrefix != value1) {
                showNamePrefix = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowNamePrefix"));
        }
        // -end- 448D2E13010A set_body3C2C36BE03A0 "showNamePrefix"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C2C36BE03A0 detail_end "Package"

// -end- 3C2C36BE03A0 detail_end "Package"

}
