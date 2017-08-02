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

// -beg- preserve=no 39488D6A0105 package "EnumerationConst"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 39488D6A0105 package "EnumerationConst"

// -beg- preserve=no 39488D6A0105 autoimport "EnumerationConst"
import ch.ehi.interlis.domainsandconstants.basetypes.Constant;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 39488D6A0105 autoimport "EnumerationConst"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39488D6A0105 import "EnumerationConst"

// -end- 39488D6A0105 import "EnumerationConst"

/**
 * Definiert eine Aufzählungskonstante.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:20 $
 */
public class EnumerationConst extends Constant implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39488D6A0105 detail_begin "EnumerationConst"

	// -end- 39488D6A0105 detail_begin "EnumerationConst"

	// -beg- preserve=no 3D4FA21B016B head39488D6A0105 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B016B head39488D6A0105 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B016B throws39488D6A0105 "unlinkAll"

	// -end- 3D4FA21B016B throws39488D6A0105 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B016B body39488D6A0105 "unlinkAll"

		// Role EnumRange: EnumRange object(s) may point to this
		setNameList(null);
		super.unlinkAll();
		// -end- 3D4FA21B016B body39488D6A0105 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B016C head39488D6A0105 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B016C head39488D6A0105 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B016C throws39488D6A0105 "enumerateChildren"

	// -end- 3D4FA21B016C throws39488D6A0105 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B016C body39488D6A0105 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getNameList());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B016C body39488D6A0105 "enumerateChildren"
	}

	// -beg- preserve=no 3948994A02FB var39488D6A0105 "nameList"
	private NlsString nameList = null;
	// -end- 3948994A02FB var39488D6A0105 "nameList"

	/**
	 * get current value of nameList Namesfolge der Knoten in einer Aufzählung
	 * von der Wurzel bis zum Blatt.
	 * 
	 * @see #setNameList
	 */
	// -beg- preserve=no 3948994A02FB get_head39488D6A0105 "nameList"
	public NlsString getNameList()
	// -end- 3948994A02FB get_head39488D6A0105 "nameList"
	{
		// -beg- preserve=no 3948994A02FB get_body39488D6A0105 "nameList"
		return nameList;
		// -end- 3948994A02FB get_body39488D6A0105 "nameList"
	}

	/**
	 * set current value of nameList
	 * 
	 * @see #getNameList
	 */
	// -beg- preserve=no 3948994A02FB set_head39488D6A0105 "nameList"
	public void setNameList(NlsString value1)
	// -end- 3948994A02FB set_head39488D6A0105 "nameList"
	{
		// -beg- preserve=no 3948994A02FB set_body39488D6A0105 "nameList"
		if (nameList != value1 && (nameList == null || !nameList.equals(value1))) {
			nameList = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setNameList"));
		}
		// -end- 3948994A02FB set_body39488D6A0105 "nameList"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39488D6A0105 detail_end "EnumerationConst"

	// -end- 39488D6A0105 detail_end "EnumerationConst"

}
