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

// -beg- preserve=no 3C2C37AA03E5 package "Artifact"
package ch.ehi.umleditor.umlpresentation;
// -end- 3C2C37AA03E5 package "Artifact"

// -beg- preserve=no 3C2C37AA03E5 autoimport "Artifact"
import ch.ehi.umleditor.umlpresentation.PresentationNode;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3C2C37AA03E5 autoimport "Artifact"
import ch.ehi.basics.types.NlsString;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C2C37AA03E5 import "Artifact"

// -end- 3C2C37AA03E5 import "Artifact"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:05 $
 */
public class Artifact extends PresentationNode implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C2C37AA03E5 detail_begin "Artifact"

	// -end- 3C2C37AA03E5 detail_begin "Artifact"

	// -beg- preserve=no 3D4FA2170006 head3C2C37AA03E5 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2170006 head3C2C37AA03E5 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2170006 throws3C2C37AA03E5 "unlinkAll"

	// -end- 3D4FA2170006 throws3C2C37AA03E5 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2170006 body3C2C37AA03E5 "unlinkAll"

		clearSubject();
		super.unlinkAll();
		// -end- 3D4FA2170006 body3C2C37AA03E5 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2170007 head3C2C37AA03E5 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2170007 head3C2C37AA03E5 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2170007 throws3C2C37AA03E5 "enumerateChildren"

	// -end- 3D4FA2170007 throws3C2C37AA03E5 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2170007 body3C2C37AA03E5 "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA2170007 body3C2C37AA03E5 "enumerateChildren"
	}

	// -beg- preserve=no 362409A803C0 code3C2C37AA03E5 "subject"

	// -end- 362409A803C0 code3C2C37AA03E5 "subject"

	/**
	 * add a Subject.
	 *
	 * @see #removeSubject
	 * @see #containsSubject
	 * @see #iteratorSubject
	 * @see #clearSubject
	 * @see #sizeSubject
	 */
	// -beg- preserve=no 362409A803C0 add_head3C2C37AA03E5
	// "PresentationElement::addSubject"
	public void addSubject(ModelElement subject1)
	// -end- 362409A803C0 add_head3C2C37AA03E5 "PresentationElement::addSubject"
	{
		// -beg- preserve=no 362409A803C0 add_body3C2C37AA03E5
		// "PresentationElement::addSubject"
		super.addSubject(subject1);
		// -end- 362409A803C0 add_body3C2C37AA03E5
		// "PresentationElement::addSubject"
	}

	/**
	 * disconnect a Subject.
	 * 
	 * @see #addSubject
	 */
	// -beg- preserve=no 362409A803C0 remove_head3C2C37AA03E5
	// "PresentationElement::removeSubject"
	public ModelElement removeSubject(ModelElement subject1)
	// -end- 362409A803C0 remove_head3C2C37AA03E5
	// "PresentationElement::removeSubject"
	{
		// -beg- preserve=no 362409A803C0 remove_body3C2C37AA03E5
		// "PresentationElement::removeSubject"
		return super.removeSubject(subject1);
		// -end- 362409A803C0 remove_body3C2C37AA03E5
		// "PresentationElement::removeSubject"
	}

	/**
	 * tests if a given Subject is connected.
	 * 
	 * @see #addSubject
	 */
	// -beg- preserve=no 362409A803C0 test_head3C2C37AA03E5
	// "PresentationElement::containsSubject"
	public boolean containsSubject(ModelElement subject1)
	// -end- 362409A803C0 test_head3C2C37AA03E5
	// "PresentationElement::containsSubject"
	{
		// -beg- preserve=no 362409A803C0 test_body3C2C37AA03E5
		// "PresentationElement::containsSubject"
		return super.containsSubject(subject1);
		// -end- 362409A803C0 test_body3C2C37AA03E5
		// "PresentationElement::containsSubject"
	}

	/**
	 * used to enumerate all connected Subjects.
	 * 
	 * @see #addSubject
	 */
	// -beg- preserve=no 362409A803C0 get_all_head3C2C37AA03E5
	// "PresentationElement::iteratorSubject"
	public java.util.Iterator iteratorSubject()
	// -end- 362409A803C0 get_all_head3C2C37AA03E5
	// "PresentationElement::iteratorSubject"
	{
		// -beg- preserve=no 362409A803C0 get_all_body3C2C37AA03E5
		// "PresentationElement::iteratorSubject"
		return super.iteratorSubject();
		// -end- 362409A803C0 get_all_body3C2C37AA03E5
		// "PresentationElement::iteratorSubject"
	}

	/**
	 * disconnect all Subjects.
	 * 
	 * @see #addSubject
	 */
	// -beg- preserve=no 362409A803C0 remove_all_head3C2C37AA03E5
	// "PresentationElement::clearSubject"
	public void clearSubject()
	// -end- 362409A803C0 remove_all_head3C2C37AA03E5
	// "PresentationElement::clearSubject"
	{
		// -beg- preserve=no 362409A803C0 remove_all_body3C2C37AA03E5
		// "PresentationElement::clearSubject"
		super.clearSubject();
		// -end- 362409A803C0 remove_all_body3C2C37AA03E5
		// "PresentationElement::clearSubject"
	}

	/**
	 * returns the number of Subjects.
	 * 
	 * @see #addSubject
	 */
	// -beg- preserve=no 362409A803C0 size_head3C2C37AA03E5
	// "PresentationElement::sizeSubject"
	public int sizeSubject()
	// -end- 362409A803C0 size_head3C2C37AA03E5
	// "PresentationElement::sizeSubject"
	{
		// -beg- preserve=no 362409A803C0 size_body3C2C37AA03E5
		// "PresentationElement::sizeSubject"
		return super.sizeSubject();
		// -end- 362409A803C0 size_body3C2C37AA03E5
		// "PresentationElement::sizeSubject"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A803C0 _link_body3C2C37AA03E5
	// "PresentationElement::_linkSubject"
	public void _linkSubject(ModelElement subject1) {
		super._linkSubject(subject1);
	}
	// -end- 362409A803C0 _link_body3C2C37AA03E5
	// "PresentationElement::_linkSubject"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 362409A803C0 _unlink_body3C2C37AA03E5
	// "PresentationElement::_unlinkSubject"
	public void _unlinkSubject(ModelElement subject1) {
		super._unlinkSubject(subject1);
	}
	// -end- 362409A803C0 _unlink_body3C2C37AA03E5
	// "PresentationElement::_unlinkSubject"

	public NlsString getMetaAttrb() {
		return super.getMetaAttrb();
	}

	public void setMetaAttrb(NlsString value) {
		super.setMetaAttrb(value);
	}

	@Override
	public NlsString getMetaName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMetaName(NlsString value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NlsString getMetaMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMetaMsg(NlsString value) {
		// TODO Auto-generated method stub
		
	}
	

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C2C37AA03E5 detail_end "Artifact"

	// -end- 3C2C37AA03E5 detail_end "Artifact"

}
