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

// -beg- preserve=no 44897CE302B9 package "EnumTreeValueType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 44897CE302B9 package "EnumTreeValueType"

// -beg- preserve=no 44897CE302B9 autoimport "EnumTreeValueType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.domainsandconstants.DomainDef;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 44897CE302B9 autoimport "EnumTreeValueType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 44897CE302B9 import "EnumTreeValueType"

// -end- 44897CE302B9 import "EnumTreeValueType"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-06-13 14:26:18 $
 */
public class EnumTreeValueType extends BaseType {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 44897CE302B9 detail_begin "EnumTreeValueType"

	// -end- 44897CE302B9 detail_begin "EnumTreeValueType"

	private static final long serialVersionUID = -1498211426763351441L;

	// -beg- preserve=no 448D3D1F0023 head44897CE302B9 "unlinkAll"
	public void unlinkAll()
	// -end- 448D3D1F0023 head44897CE302B9 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448D3D1F0023 throws44897CE302B9 "unlinkAll"

	// -end- 448D3D1F0023 throws44897CE302B9 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448D3D1F0023 body44897CE302B9 "unlinkAll"

		detachEnumBasedOn();
		super.unlinkAll();
		// -end- 448D3D1F0023 body44897CE302B9 "unlinkAll"
	}

	// -beg- preserve=no 448D3D1F0037 head44897CE302B9 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 448D3D1F0037 head44897CE302B9 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 448D3D1F0037 throws44897CE302B9 "enumerateChildren"

	// -end- 448D3D1F0037 throws44897CE302B9 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 448D3D1F0037 body44897CE302B9 "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 448D3D1F0037 body44897CE302B9 "enumerateChildren"
	}

	// -beg- preserve=no 44897D73034C code44897CE302B9 "enumBasedOn"
	private DomainDef enumBasedOn;
	// -end- 44897D73034C code44897CE302B9 "enumBasedOn"

	/**
	 * attaches a EnumBasedOn.
	 *
	 * @see #detachEnumBasedOn
	 * @see #getEnumBasedOn
	 * @see #containsEnumBasedOn
	 */
	// -beg- preserve=no 44897D73034C attach_head44897CE302B9
	// "EnumTreeValueType::attachEnumBasedOn"
	public void attachEnumBasedOn(DomainDef enumBasedOn1)
	// -end- 44897D73034C attach_head44897CE302B9
	// "EnumTreeValueType::attachEnumBasedOn"
	{
		// -beg- preserve=no 44897D73034C attach_body44897CE302B9
		// "EnumTreeValueType::attachEnumBasedOn"
		if (enumBasedOn != null) {
			throw new java.lang.IllegalStateException("already a enumBasedOn attached");
		}
		if (enumBasedOn1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as enumBasedOn");
		}
		enumBasedOn = enumBasedOn1;
		enumBasedOn1._linkEnumTreeValueType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachEnumBasedOn"));
		return;
		// -end- 44897D73034C attach_body44897CE302B9
		// "EnumTreeValueType::attachEnumBasedOn"
	}

	/**
	 * disconnect the currently attached EnumBasedOn.
	 * 
	 * @see #attachEnumBasedOn
	 */
	// -beg- preserve=no 44897D73034C detach_head44897CE302B9
	// "EnumTreeValueType::detachEnumBasedOn"
	public DomainDef detachEnumBasedOn()
	// -end- 44897D73034C detach_head44897CE302B9
	// "EnumTreeValueType::detachEnumBasedOn"
	{
		// -beg- preserve=no 44897D73034C detach_body44897CE302B9
		// "EnumTreeValueType::detachEnumBasedOn"
		DomainDef ret = null;
		if (enumBasedOn != null) {
			enumBasedOn._unlinkEnumTreeValueType(this);
			ret = enumBasedOn;
			enumBasedOn = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachEnumBasedOn"));
		return ret;
		// -end- 44897D73034C detach_body44897CE302B9
		// "EnumTreeValueType::detachEnumBasedOn"
	}

	/**
	 * get the currently attached EnumBasedOn.
	 * 
	 * @see #attachEnumBasedOn
	 */
	// -beg- preserve=no 44897D73034C get_head44897CE302B9
	// "EnumTreeValueType::getEnumBasedOn"
	public DomainDef getEnumBasedOn()
	// -end- 44897D73034C get_head44897CE302B9
	// "EnumTreeValueType::getEnumBasedOn"
	{
		// -beg- preserve=no 44897D73034C get_body44897CE302B9
		// "EnumTreeValueType::getEnumBasedOn"
		if (enumBasedOn == null) {
			throw new java.lang.IllegalStateException("no enumBasedOn attached");
		}
		return enumBasedOn;
		// -end- 44897D73034C get_body44897CE302B9
		// "EnumTreeValueType::getEnumBasedOn"
	}

	/**
	 * tests if there is a EnumBasedOn attached.
	 * 
	 * @see #attachEnumBasedOn
	 */
	// -beg- preserve=no 44897D73034C test_head44897CE302B9
	// "EnumTreeValueType::containsEnumBasedOn"
	public boolean containsEnumBasedOn()
	// -end- 44897D73034C test_head44897CE302B9
	// "EnumTreeValueType::containsEnumBasedOn"
	{
		// -beg- preserve=no 44897D73034C test_body44897CE302B9
		// "EnumTreeValueType::containsEnumBasedOn"
		return enumBasedOn != null;
		// -end- 44897D73034C test_body44897CE302B9
		// "EnumTreeValueType::containsEnumBasedOn"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 44897D73034C _link_body44897CE302B9
	// "EnumTreeValueType::_linkEnumBasedOn"
	public void _linkEnumBasedOn(DomainDef enumBasedOn1) {
		enumBasedOn = enumBasedOn1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkEnumBasedOn"));
		return;
	}
	// -end- 44897D73034C _link_body44897CE302B9
	// "EnumTreeValueType::_linkEnumBasedOn"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 44897D73034C _unlink_body44897CE302B9
	// "EnumTreeValueType::_unlinkEnumBasedOn"
	public void _unlinkEnumBasedOn(DomainDef enumBasedOn1) {
		enumBasedOn = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkEnumBasedOn"));
		return;
	}
	// -end- 44897D73034C _unlink_body44897CE302B9
	// "EnumTreeValueType::_unlinkEnumBasedOn"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 44897CE302B9 detail_end "EnumTreeValueType"

	// -end- 44897CE302B9 detail_end "EnumTreeValueType"

}
