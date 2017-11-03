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

// -beg- preserve=no 3C69420701C1 package "Note"
package ch.ehi.umleditor.umlpresentation;
// -end- 3C69420701C1 package "Note"

// -beg- preserve=no 3C69420701C1 autoimport "Note"
import ch.ehi.umleditor.umlpresentation.PresentationNode;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3C69420701C1 autoimport "Note"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C69420701C1 import "Note"

// -end- 3C69420701C1 import "Note"

/**
 * A note is a graphical symbol containing textual information (possibly
 * including embeddedimages).
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:13 $
 */
public class Note extends PresentationNode implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C69420701C1 detail_begin "Note"

	// -end- 3C69420701C1 detail_begin "Note"

	private static final long serialVersionUID = 8640941083704181573L;

	// -beg- preserve=no 3D4FA2170309 head3C69420701C1 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2170309 head3C69420701C1 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2170309 throws3C69420701C1 "unlinkAll"

	// -end- 3D4FA2170309 throws3C69420701C1 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2170309 body3C69420701C1 "unlinkAll"

		setContent(null);
		super.unlinkAll();
		// -end- 3D4FA2170309 body3C69420701C1 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2170313 head3C69420701C1 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2170313 head3C69420701C1 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2170313 throws3C69420701C1 "enumerateChildren"

	// -end- 3D4FA2170313 throws3C69420701C1 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2170313 body3C69420701C1 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getContent());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2170313 body3C69420701C1 "enumerateChildren"
	}

	// -beg- preserve=no 3C6CF3E50019 var3C69420701C1 "content"
	private NlsString content = null;
	// -end- 3C6CF3E50019 var3C69420701C1 "content"

	/**
	 * get current value of content
	 * 
	 * @see #setContent
	 */
	// -beg- preserve=no 3C6CF3E50019 get_head3C69420701C1 "content"
	public NlsString getContent()
	// -end- 3C6CF3E50019 get_head3C69420701C1 "content"
	{
		// -beg- preserve=no 3C6CF3E50019 get_body3C69420701C1 "content"
		return content;
		// -end- 3C6CF3E50019 get_body3C69420701C1 "content"
	}

	/**
	 * set current value of content
	 * 
	 * @see #getContent
	 */
	// -beg- preserve=no 3C6CF3E50019 set_head3C69420701C1 "content"
	public void setContent(NlsString value1)
	// -end- 3C6CF3E50019 set_head3C69420701C1 "content"
	{
		// -beg- preserve=no 3C6CF3E50019 set_body3C69420701C1 "content"
		if (content != value1 && (content == null || !content.equals(value1))) {
			content = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setContent"));
		}
		// -end- 3C6CF3E50019 set_body3C69420701C1 "content"
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
	// -beg- preserve=no 3C69420701C1 detail_end "Note"

	// -end- 3C69420701C1 detail_end "Note"

}
