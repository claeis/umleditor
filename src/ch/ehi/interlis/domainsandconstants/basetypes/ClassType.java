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

// -beg- preserve=no 3FDC4924008E package "ClassType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 3FDC4924008E package "ClassType"

// -beg- preserve=no 3FDC4924008E autoimport "ClassType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.modeltopicclass.ClassDefKind;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3FDC4924008E autoimport "ClassType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3FDC4924008E import "ClassType"

// -end- 3FDC4924008E import "ClassType"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:12 $
 */
public class ClassType extends BaseType {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3FDC4924008E detail_begin "ClassType"

	// -end- 3FDC4924008E detail_begin "ClassType"

	private static final long serialVersionUID = 688007193073908818L;

	// -beg- preserve=no 3FDC4C300342 head3FDC4924008E "unlinkAll"
	public void unlinkAll()
	// -end- 3FDC4C300342 head3FDC4924008E "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3FDC4C300342 throws3FDC4924008E "unlinkAll"

	// -end- 3FDC4C300342 throws3FDC4924008E "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3FDC4C300342 body3FDC4924008E "unlinkAll"

		clearRestrictedTo();
		super.unlinkAll();
		// -end- 3FDC4C300342 body3FDC4924008E "unlinkAll"
	}

	// -beg- preserve=no 3FDC4C300356 head3FDC4924008E "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3FDC4C300356 head3FDC4924008E "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3FDC4C300356 throws3FDC4924008E "enumerateChildren"

	// -end- 3FDC4C300356 throws3FDC4924008E "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3FDC4C300356 body3FDC4924008E "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3FDC4C300356 body3FDC4924008E "enumerateChildren"
	}

	// -beg- preserve=no 3FDC4A7B0394 code3FDC4924008E "restrictedTo"
	private java.util.Set restrictedTo = new java.util.HashSet();
	// -end- 3FDC4A7B0394 code3FDC4924008E "restrictedTo"

	/**
	 * add a RestrictedTo.
	 *
	 * @see #removeRestrictedTo
	 * @see #containsRestrictedTo
	 * @see #iteratorRestrictedTo
	 * @see #clearRestrictedTo
	 * @see #sizeRestrictedTo
	 */
	// -beg- preserve=no 3FDC4A7B0394 add_head3FDC4924008E
	// "ClassType::addRestrictedTo"
	public void addRestrictedTo(AbstractClassDef restrictedTo1)
	// -end- 3FDC4A7B0394 add_head3FDC4924008E "ClassType::addRestrictedTo"
	{
		// -beg- preserve=no 3FDC4A7B0394 add_body3FDC4924008E
		// "ClassType::addRestrictedTo"
		restrictedTo.add(restrictedTo1);
		restrictedTo1._linkClassType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addRestrictedTo"));
		return;
		// -end- 3FDC4A7B0394 add_body3FDC4924008E "ClassType::addRestrictedTo"
	}

	/**
	 * disconnect a RestrictedTo.
	 * 
	 * @see #addRestrictedTo
	 */
	// -beg- preserve=no 3FDC4A7B0394 remove_head3FDC4924008E
	// "ClassType::removeRestrictedTo"
	public AbstractClassDef removeRestrictedTo(AbstractClassDef restrictedTo1)
	// -end- 3FDC4A7B0394 remove_head3FDC4924008E
	// "ClassType::removeRestrictedTo"
	{
		// -beg- preserve=no 3FDC4A7B0394 remove_body3FDC4924008E
		// "ClassType::removeRestrictedTo"
		AbstractClassDef ret = null;
		if (restrictedTo1 == null || !restrictedTo.contains(restrictedTo1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = restrictedTo1;
		restrictedTo.remove(restrictedTo1);
		restrictedTo1._unlinkClassType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeRestrictedTo"));
		return ret;
		// -end- 3FDC4A7B0394 remove_body3FDC4924008E
		// "ClassType::removeRestrictedTo"
	}

	/**
	 * tests if a given RestrictedTo is connected.
	 * 
	 * @see #addRestrictedTo
	 */
	// -beg- preserve=no 3FDC4A7B0394 test_head3FDC4924008E
	// "ClassType::containsRestrictedTo"
	public boolean containsRestrictedTo(AbstractClassDef restrictedTo1)
	// -end- 3FDC4A7B0394 test_head3FDC4924008E
	// "ClassType::containsRestrictedTo"
	{
		// -beg- preserve=no 3FDC4A7B0394 test_body3FDC4924008E
		// "ClassType::containsRestrictedTo"
		return restrictedTo.contains(restrictedTo1);
		// -end- 3FDC4A7B0394 test_body3FDC4924008E
		// "ClassType::containsRestrictedTo"
	}

	/**
	 * used to enumerate all connected RestrictedTos.
	 * 
	 * @see #addRestrictedTo
	 */
	// -beg- preserve=no 3FDC4A7B0394 get_all_head3FDC4924008E
	// "ClassType::iteratorRestrictedTo"
	public java.util.Iterator iteratorRestrictedTo()
	// -end- 3FDC4A7B0394 get_all_head3FDC4924008E
	// "ClassType::iteratorRestrictedTo"
	{
		// -beg- preserve=no 3FDC4A7B0394 get_all_body3FDC4924008E
		// "ClassType::iteratorRestrictedTo"
		return restrictedTo.iterator();
		// -end- 3FDC4A7B0394 get_all_body3FDC4924008E
		// "ClassType::iteratorRestrictedTo"
	}

	/**
	 * disconnect all RestrictedTos.
	 * 
	 * @see #addRestrictedTo
	 */
	// -beg- preserve=no 3FDC4A7B0394 remove_all_head3FDC4924008E
	// "ClassType::clearRestrictedTo"
	public void clearRestrictedTo()
	// -end- 3FDC4A7B0394 remove_all_head3FDC4924008E
	// "ClassType::clearRestrictedTo"
	{
		// -beg- preserve=no 3FDC4A7B0394 remove_all_body3FDC4924008E
		// "ClassType::clearRestrictedTo"
		if (sizeRestrictedTo() > 0) {
			for (java.util.Iterator p = restrictedTo.iterator(); p.hasNext();) {
				((AbstractClassDef) p.next())._unlinkClassType(this);
			}
			restrictedTo.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearRestrictedTo"));
		}
		// -end- 3FDC4A7B0394 remove_all_body3FDC4924008E
		// "ClassType::clearRestrictedTo"
	}

	/**
	 * returns the number of RestrictedTos.
	 * 
	 * @see #addRestrictedTo
	 */
	// -beg- preserve=no 3FDC4A7B0394 size_head3FDC4924008E
	// "ClassType::sizeRestrictedTo"
	public int sizeRestrictedTo()
	// -end- 3FDC4A7B0394 size_head3FDC4924008E "ClassType::sizeRestrictedTo"
	{
		// -beg- preserve=no 3FDC4A7B0394 size_body3FDC4924008E
		// "ClassType::sizeRestrictedTo"
		return restrictedTo.size();
		// -end- 3FDC4A7B0394 size_body3FDC4924008E
		// "ClassType::sizeRestrictedTo"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FDC4A7B0394 _link_body3FDC4924008E
	// "ClassType::_linkRestrictedTo"
	public void _linkRestrictedTo(AbstractClassDef restrictedTo1) {
		restrictedTo.add(restrictedTo1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkRestrictedTo"));
		return;
	}
	// -end- 3FDC4A7B0394 _link_body3FDC4924008E "ClassType::_linkRestrictedTo"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3FDC4A7B0394 _unlink_body3FDC4924008E
	// "ClassType::_unlinkRestrictedTo"
	public void _unlinkRestrictedTo(AbstractClassDef restrictedTo1) {
		restrictedTo.remove(restrictedTo1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkRestrictedTo"));
		return;
	}
	// -end- 3FDC4A7B0394 _unlink_body3FDC4924008E
	// "ClassType::_unlinkRestrictedTo"

	// -beg- preserve=no 3FDC499F0013 var3FDC4924008E "kind"
	private int kind = ClassDefKind.CLASS;
	// -end- 3FDC499F0013 var3FDC4924008E "kind"

	/**
	 * get current value of kind
	 * 
	 * @see ch.ehi.interlis.modeltopicclass.ClassDefKind
	 * @see #setKind
	 */
	// -beg- preserve=no 3FDC499F0013 get_head3FDC4924008E "kind"
	public int getKind()
	// -end- 3FDC499F0013 get_head3FDC4924008E "kind"
	{
		// -beg- preserve=no 3FDC499F0013 get_body3FDC4924008E "kind"
		return kind;
		// -end- 3FDC499F0013 get_body3FDC4924008E "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.modeltopicclass.ClassDefKind
	 * @see #getKind
	 */
	// -beg- preserve=no 3FDC499F0013 set_head3FDC4924008E "kind"
	public void setKind(int value1)
	// -end- 3FDC499F0013 set_head3FDC4924008E "kind"
	{
		// -beg- preserve=no 3FDC499F0013 set_body3FDC4924008E "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 3FDC499F0013 set_body3FDC4924008E "kind"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3FDC4924008E detail_end "ClassType"

	// -end- 3FDC4924008E detail_end "ClassType"

}
