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

// -beg- preserve=no 4489813700A9 package "BlackboxType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 4489813700A9 package "BlackboxType"

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 4489813700A9 autoimport "BlackboxType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4489813700A9 import "BlackboxType"

// -end- 4489813700A9 import "BlackboxType"

/**
 * ab INTERLIS 2.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class BlackboxType extends BaseType {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4489813700A9 detail_begin "BlackboxType"

	// -end- 4489813700A9 detail_begin "BlackboxType"

	private static final long serialVersionUID = -5458999423495980283L;

	// -beg- preserve=no 448D3D1201FB head4489813700A9 "unlinkAll"
	public void unlinkAll()
	// -end- 448D3D1201FB head4489813700A9 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448D3D1201FB throws4489813700A9 "unlinkAll"

	// -end- 448D3D1201FB throws4489813700A9 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448D3D1201FB body4489813700A9 "unlinkAll"

		super.unlinkAll();
		// -end- 448D3D1201FB body4489813700A9 "unlinkAll"
	}

	// -beg- preserve=no 448D3D120219 head4489813700A9 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 448D3D120219 head4489813700A9 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448D3D120219 throws4489813700A9 "enumerateChildren"

	// -end- 448D3D120219 throws4489813700A9 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448D3D120219 body4489813700A9 "enumerateChildren"
		Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 448D3D120219 body4489813700A9 "enumerateChildren"
	}

	// -beg- preserve=no 4489821102E7 var4489813700A9 "kind"
	private int kind;
	// -end- 4489821102E7 var4489813700A9 "kind"

	/**
	 * get current value of kind
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.BlackboxKind
	 * @see #setKind
	 */
	// -beg- preserve=no 4489821102E7 get_head4489813700A9 "kind"
	public int getKind()
	// -end- 4489821102E7 get_head4489813700A9 "kind"
	{
		// -beg- preserve=no 4489821102E7 get_body4489813700A9 "kind"
		return kind;
		// -end- 4489821102E7 get_body4489813700A9 "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.BlackboxKind
	 * @see #getKind
	 */
	// -beg- preserve=no 4489821102E7 set_head4489813700A9 "kind"
	public void setKind(int value1)
	// -end- 4489821102E7 set_head4489813700A9 "kind"
	{
		// -beg- preserve=no 4489821102E7 set_body4489813700A9 "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 4489821102E7 set_body4489813700A9 "kind"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4489813700A9 detail_end "BlackboxType"

	// -end- 4489813700A9 detail_end "BlackboxType"

}
