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

// -beg- preserve=no 3FDC48C9003D package "OidType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 3FDC48C9003D package "OidType"

// -beg- preserve=no 3FDC48C9003D autoimport "OidType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.domainsandconstants.basetypes.OidKind;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3FDC48C9003D autoimport "OidType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3FDC48C9003D import "OidType"

// -end- 3FDC48C9003D import "OidType"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:26 $
 */
public class OidType extends BaseType {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3FDC48C9003D detail_begin "OidType"

	// -end- 3FDC48C9003D detail_begin "OidType"

	private static final long serialVersionUID = 1788648932573119010L;

	// -beg- preserve=no 3FDC4C1A0106 head3FDC48C9003D "unlinkAll"
	public void unlinkAll()
	// -end- 3FDC4C1A0106 head3FDC48C9003D "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3FDC4C1A0106 throws3FDC48C9003D "unlinkAll"

	// -end- 3FDC4C1A0106 throws3FDC48C9003D "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3FDC4C1A0106 body3FDC48C9003D "unlinkAll"

		detachOiddomain();
		super.unlinkAll();
		// -end- 3FDC4C1A0106 body3FDC48C9003D "unlinkAll"
	}

	// -beg- preserve=no 3FDC4C1A0138 head3FDC48C9003D "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3FDC4C1A0138 head3FDC48C9003D "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3FDC4C1A0138 throws3FDC48C9003D "enumerateChildren"

	// -end- 3FDC4C1A0138 throws3FDC48C9003D "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3FDC4C1A0138 body3FDC48C9003D "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3FDC4C1A0138 body3FDC48C9003D "enumerateChildren"
	}

	// -beg- preserve=no 3FDC4BA900F9 code3FDC48C9003D "oiddomain"
	private BaseType oiddomain;
	// -end- 3FDC4BA900F9 code3FDC48C9003D "oiddomain"

	/**
	 * attaches a Oiddomain.
	 *
	 * @see #detachOiddomain
	 * @see #getOiddomain
	 * @see #containsOiddomain
	 */
	// -beg- preserve=no 3FDC4BA900F9 attach_head3FDC48C9003D
	// "OidType::attachOiddomain"
	public void attachOiddomain(BaseType oiddomain1)
	// -end- 3FDC4BA900F9 attach_head3FDC48C9003D "OidType::attachOiddomain"
	{
		// -beg- preserve=no 3FDC4BA900F9 attach_body3FDC48C9003D
		// "OidType::attachOiddomain"
		if (oiddomain != null) {
			throw new java.lang.IllegalStateException("already a oiddomain attached");
		}
		if (oiddomain1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as oiddomain");
		}
		oiddomain = oiddomain1;
		oiddomain1._linkOidType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachOiddomain"));
		return;
		// -end- 3FDC4BA900F9 attach_body3FDC48C9003D "OidType::attachOiddomain"
	}

	/**
	 * disconnect the currently attached Oiddomain.
	 * 
	 * @see #attachOiddomain
	 */
	// -beg- preserve=no 3FDC4BA900F9 detach_head3FDC48C9003D
	// "OidType::detachOiddomain"
	public BaseType detachOiddomain()
	// -end- 3FDC4BA900F9 detach_head3FDC48C9003D "OidType::detachOiddomain"
	{
		// -beg- preserve=no 3FDC4BA900F9 detach_body3FDC48C9003D
		// "OidType::detachOiddomain"
		BaseType ret = null;
		if (oiddomain != null) {
			oiddomain._unlinkOidType(this);
			ret = oiddomain;
			oiddomain = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachOiddomain"));
		return ret;
		// -end- 3FDC4BA900F9 detach_body3FDC48C9003D "OidType::detachOiddomain"
	}

	/**
	 * get the currently attached Oiddomain.
	 * 
	 * @see #attachOiddomain
	 */
	// -beg- preserve=no 3FDC4BA900F9 get_head3FDC48C9003D
	// "OidType::getOiddomain"
	public BaseType getOiddomain()
	// -end- 3FDC4BA900F9 get_head3FDC48C9003D "OidType::getOiddomain"
	{
		// -beg- preserve=no 3FDC4BA900F9 get_body3FDC48C9003D
		// "OidType::getOiddomain"
		if (oiddomain == null) {
			throw new java.lang.IllegalStateException("no oiddomain attached");
		}
		return oiddomain;
		// -end- 3FDC4BA900F9 get_body3FDC48C9003D "OidType::getOiddomain"
	}

	/**
	 * tests if there is a Oiddomain attached.
	 * 
	 * @see #attachOiddomain
	 */
	// -beg- preserve=no 3FDC4BA900F9 test_head3FDC48C9003D
	// "OidType::containsOiddomain"
	public boolean containsOiddomain()
	// -end- 3FDC4BA900F9 test_head3FDC48C9003D "OidType::containsOiddomain"
	{
		// -beg- preserve=no 3FDC4BA900F9 test_body3FDC48C9003D
		// "OidType::containsOiddomain"
		return oiddomain != null;
		// -end- 3FDC4BA900F9 test_body3FDC48C9003D "OidType::containsOiddomain"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FDC4BA900F9 _link_body3FDC48C9003D
	// "OidType::_linkOiddomain"
	public void _linkOiddomain(BaseType oiddomain1) {
		oiddomain = oiddomain1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkOiddomain"));
		return;
	}
	// -end- 3FDC4BA900F9 _link_body3FDC48C9003D "OidType::_linkOiddomain"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FDC4BA900F9 _unlink_body3FDC48C9003D
	// "OidType::_unlinkOiddomain"
	public void _unlinkOiddomain(BaseType oiddomain1) {
		oiddomain = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkOiddomain"));
		return;
	}
	// -end- 3FDC4BA900F9 _unlink_body3FDC48C9003D "OidType::_unlinkOiddomain"

	// -beg- preserve=no 3FDC49A60207 var3FDC48C9003D "kind"
	private int kind = OidKind.ANY;
	// -end- 3FDC49A60207 var3FDC48C9003D "kind"

	/**
	 * get current value of kind
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.OidKind
	 * @see #setKind
	 */
	// -beg- preserve=no 3FDC49A60207 get_head3FDC48C9003D "kind"
	public int getKind()
	// -end- 3FDC49A60207 get_head3FDC48C9003D "kind"
	{
		// -beg- preserve=no 3FDC49A60207 get_body3FDC48C9003D "kind"
		return kind;
		// -end- 3FDC49A60207 get_body3FDC48C9003D "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.OidKind
	 * @see #getKind
	 */
	// -beg- preserve=no 3FDC49A60207 set_head3FDC48C9003D "kind"
	public void setKind(int value1)
	// -end- 3FDC49A60207 set_head3FDC48C9003D "kind"
	{
		// -beg- preserve=no 3FDC49A60207 set_body3FDC48C9003D "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 3FDC49A60207 set_body3FDC48C9003D "kind"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3FDC48C9003D detail_end "OidType"

	// -end- 3FDC48C9003D detail_end "OidType"

}
