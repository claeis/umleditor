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

// -beg- preserve=no 358A64F7038A package "BaseType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 358A64F7038A package "BaseType"

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A64F7038A autoimport "BaseType"
// -beg- preserve=no 358A64F7038A autoimport "BaseType"
import ch.ehi.interlis.domainsandconstants.Type;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A64F7038A import "BaseType"

// -end- 358A64F7038A import "BaseType"

/**
 * @see @text{syntaxBaseType}
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:09 $
 */
public abstract class BaseType extends Type implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A64F7038A detail_begin "BaseType"

	// -end- 358A64F7038A detail_begin "BaseType"

	private static final long serialVersionUID = 3167433454308701005L;

	// -beg- preserve=no 3D4FA21B0215 head358A64F7038A "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0215 head358A64F7038A "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0215 throws358A64F7038A "unlinkAll"

	// -end- 3D4FA21B0215 throws358A64F7038A "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0215 body358A64F7038A "unlinkAll"

		clearOidType();
		super.unlinkAll();
		// -end- 3D4FA21B0215 body358A64F7038A "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B021F head358A64F7038A "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B021F head358A64F7038A "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B021F throws358A64F7038A "enumerateChildren"

	// -end- 3D4FA21B021F throws358A64F7038A "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B021F body358A64F7038A "enumerateChildren"
		Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B021F body358A64F7038A "enumerateChildren"
	}

	// -beg- preserve=no 3FDC4BA900E5 code358A64F7038A "oidType"
	private Set<OidType> oidType = new HashSet<OidType>();
	// -end- 3FDC4BA900E5 code358A64F7038A "oidType"

	/**
	 * add a OidType.
	 *
	 * @see #removeOidType
	 * @see #containsOidType
	 * @see #iteratorOidType
	 * @see #clearOidType
	 * @see #sizeOidType
	 */
	// -beg- preserve=no 3FDC4BA900E5 add_head358A64F7038A
	// "BaseType::addOidType"
	public void addOidType(OidType oidType1)
	// -end- 3FDC4BA900E5 add_head358A64F7038A "BaseType::addOidType"
	{
		// -beg- preserve=no 3FDC4BA900E5 add_body358A64F7038A
		// "BaseType::addOidType"
		oidType.add(oidType1);
		oidType1._linkOiddomain(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addOidType"));
		return;
		// -end- 3FDC4BA900E5 add_body358A64F7038A "BaseType::addOidType"
	}

	/**
	 * disconnect a OidType.
	 * 
	 * @see #addOidType
	 */
	// -beg- preserve=no 3FDC4BA900E5 remove_head358A64F7038A
	// "BaseType::removeOidType"
	public OidType removeOidType(OidType oidType1)
	// -end- 3FDC4BA900E5 remove_head358A64F7038A "BaseType::removeOidType"
	{
		// -beg- preserve=no 3FDC4BA900E5 remove_body358A64F7038A
		// "BaseType::removeOidType"
		OidType ret = null;
		if (oidType1 == null || !oidType.contains(oidType1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = oidType1;
		oidType.remove(oidType1);
		oidType1._unlinkOiddomain(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeOidType"));
		return ret;
		// -end- 3FDC4BA900E5 remove_body358A64F7038A "BaseType::removeOidType"
	}

	/**
	 * tests if a given OidType is connected.
	 * 
	 * @see #addOidType
	 */
	// -beg- preserve=no 3FDC4BA900E5 test_head358A64F7038A
	// "BaseType::containsOidType"
	public boolean containsOidType(OidType oidType1)
	// -end- 3FDC4BA900E5 test_head358A64F7038A "BaseType::containsOidType"
	{
		// -beg- preserve=no 3FDC4BA900E5 test_body358A64F7038A
		// "BaseType::containsOidType"
		return oidType.contains(oidType1);
		// -end- 3FDC4BA900E5 test_body358A64F7038A "BaseType::containsOidType"
	}

	/**
	 * used to enumerate all connected OidTypes.
	 * 
	 * @see #addOidType
	 */
	// -beg- preserve=no 3FDC4BA900E5 get_all_head358A64F7038A
	// "BaseType::iteratorOidType"
	public Iterator<OidType> iteratorOidType()
	// -end- 3FDC4BA900E5 get_all_head358A64F7038A "BaseType::iteratorOidType"
	{
		// -beg- preserve=no 3FDC4BA900E5 get_all_body358A64F7038A
		// "BaseType::iteratorOidType"
		return oidType.iterator();
		// -end- 3FDC4BA900E5 get_all_body358A64F7038A
		// "BaseType::iteratorOidType"
	}

	/**
	 * disconnect all OidTypes.
	 * 
	 * @see #addOidType
	 */
	// -beg- preserve=no 3FDC4BA900E5 remove_all_head358A64F7038A
	// "BaseType::clearOidType"
	public void clearOidType()
	// -end- 3FDC4BA900E5 remove_all_head358A64F7038A "BaseType::clearOidType"
	{
		// -beg- preserve=no 3FDC4BA900E5 remove_all_body358A64F7038A
		// "BaseType::clearOidType"
		if (sizeOidType() > 0) {
			for (Iterator<OidType> p = oidType.iterator(); p.hasNext();) {
				((OidType) p.next())._unlinkOiddomain(this);
			}
			oidType.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearOidType"));
		}
		// -end- 3FDC4BA900E5 remove_all_body358A64F7038A
		// "BaseType::clearOidType"
	}

	/**
	 * returns the number of OidTypes.
	 * 
	 * @see #addOidType
	 */
	// -beg- preserve=no 3FDC4BA900E5 size_head358A64F7038A
	// "BaseType::sizeOidType"
	public int sizeOidType()
	// -end- 3FDC4BA900E5 size_head358A64F7038A "BaseType::sizeOidType"
	{
		// -beg- preserve=no 3FDC4BA900E5 size_body358A64F7038A
		// "BaseType::sizeOidType"
		return oidType.size();
		// -end- 3FDC4BA900E5 size_body358A64F7038A "BaseType::sizeOidType"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FDC4BA900E5 _link_body358A64F7038A
	// "BaseType::_linkOidType"
	public void _linkOidType(OidType oidType1) {
		oidType.add(oidType1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkOidType"));
		return;
	}
	// -end- 3FDC4BA900E5 _link_body358A64F7038A "BaseType::_linkOidType"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FDC4BA900E5 _unlink_body358A64F7038A
	// "BaseType::_unlinkOidType"
	public void _unlinkOidType(OidType oidType1) {
		oidType.remove(oidType1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkOidType"));
		return;
	}
	// -end- 3FDC4BA900E5 _unlink_body358A64F7038A "BaseType::_unlinkOidType"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A64F7038A detail_end "BaseType"

	// -end- 358A64F7038A detail_end "BaseType"

}
