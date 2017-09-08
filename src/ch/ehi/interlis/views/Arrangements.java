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

// -beg- preserve=no 358A5FEA022C package "Arrangements"
package ch.ehi.interlis.views;
// -end- 358A5FEA022C package "Arrangements"

// -beg- preserve=no 358A5FEA022C autoimport "Arrangements"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A5FEA022C autoimport "Arrangements"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5FEA022C import "Arrangements"

// -end- 358A5FEA022C import "Arrangements"

/**
 * Diese Klasse ist nur in INTERLIS1 vorhanden und wird in der Regel nicht
 * implementiert.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:26 $
 */
public class Arrangements extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5FEA022C detail_begin "Arrangements"

	// -end- 358A5FEA022C detail_begin "Arrangements"

	private static final long serialVersionUID = -6440627736310782488L;

	// -beg- preserve=no 3D4FA21803B5 head358A5FEA022C "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21803B5 head358A5FEA022C "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21803B5 throws358A5FEA022C "unlinkAll"

	// -end- 3D4FA21803B5 throws358A5FEA022C "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21803B5 body358A5FEA022C "unlinkAll"

		detachINTERLIS2Def();
		super.unlinkAll();
		// -end- 3D4FA21803B5 body358A5FEA022C "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21803B6 head358A5FEA022C "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21803B6 head358A5FEA022C "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21803B6 throws358A5FEA022C "enumerateChildren"

	// -end- 3D4FA21803B6 throws358A5FEA022C "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21803B6 body358A5FEA022C "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21803B6 body358A5FEA022C "enumerateChildren"
	}

	// -beg- preserve=no 358A601D010D code358A5FEA022C "iNTERLIS2Def"
	private INTERLIS2Def iNTERLIS2Def;
	// -end- 358A601D010D code358A5FEA022C "iNTERLIS2Def"

	/**
	 * attaches a INTERLIS2Def.
	 *
	 * @see #detachINTERLIS2Def
	 * @see #getINTERLIS2Def
	 * @see #containsINTERLIS2Def
	 */
	// -beg- preserve=no 358A601D010D attach_head358A5FEA022C
	// "Arrangements::attachINTERLIS2Def"
	public void attachINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1)
	// -end- 358A601D010D attach_head358A5FEA022C
	// "Arrangements::attachINTERLIS2Def"
	{
		// -beg- preserve=no 358A601D010D attach_body358A5FEA022C
		// "Arrangements::attachINTERLIS2Def"
		if (iNTERLIS2Def != null) {
			throw new java.lang.IllegalStateException("already a iNTERLIS2Def attached");
		}
		if (iNTERLIS2Def1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as iNTERLIS2Def");
		}
		iNTERLIS2Def = iNTERLIS2Def1;
		iNTERLIS2Def1._linkArrangements(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachINTERLIS2Def"));
		return;
		// -end- 358A601D010D attach_body358A5FEA022C
		// "Arrangements::attachINTERLIS2Def"
	}

	/**
	 * disconnect the currently attached INTERLIS2Def.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A601D010D detach_head358A5FEA022C
	// "Arrangements::detachINTERLIS2Def"
	public INTERLIS2Def detachINTERLIS2Def()
	// -end- 358A601D010D detach_head358A5FEA022C
	// "Arrangements::detachINTERLIS2Def"
	{
		// -beg- preserve=no 358A601D010D detach_body358A5FEA022C
		// "Arrangements::detachINTERLIS2Def"
		INTERLIS2Def ret = null;
		if (iNTERLIS2Def != null) {
			iNTERLIS2Def._unlinkArrangements(this);
			ret = iNTERLIS2Def;
			iNTERLIS2Def = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachINTERLIS2Def"));
		return ret;
		// -end- 358A601D010D detach_body358A5FEA022C
		// "Arrangements::detachINTERLIS2Def"
	}

	/**
	 * get the currently attached INTERLIS2Def.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A601D010D get_head358A5FEA022C
	// "Arrangements::getINTERLIS2Def"
	public INTERLIS2Def getINTERLIS2Def()
	// -end- 358A601D010D get_head358A5FEA022C "Arrangements::getINTERLIS2Def"
	{
		// -beg- preserve=no 358A601D010D get_body358A5FEA022C
		// "Arrangements::getINTERLIS2Def"
		if (iNTERLIS2Def == null) {
			throw new java.lang.IllegalStateException("no iNTERLIS2Def attached");
		}
		return iNTERLIS2Def;
		// -end- 358A601D010D get_body358A5FEA022C
		// "Arrangements::getINTERLIS2Def"
	}

	/**
	 * tests if there is a INTERLIS2Def attached.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A601D010D test_head358A5FEA022C
	// "Arrangements::containsINTERLIS2Def"
	public boolean containsINTERLIS2Def()
	// -end- 358A601D010D test_head358A5FEA022C
	// "Arrangements::containsINTERLIS2Def"
	{
		// -beg- preserve=no 358A601D010D test_body358A5FEA022C
		// "Arrangements::containsINTERLIS2Def"
		return iNTERLIS2Def != null;
		// -end- 358A601D010D test_body358A5FEA022C
		// "Arrangements::containsINTERLIS2Def"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A601D010D _link_body358A5FEA022C
	// "Arrangements::_linkINTERLIS2Def"
	public void _linkINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1) {
		iNTERLIS2Def = iNTERLIS2Def1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkINTERLIS2Def"));
		return;
	}
	// -end- 358A601D010D _link_body358A5FEA022C
	// "Arrangements::_linkINTERLIS2Def"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A601D010D _unlink_body358A5FEA022C
	// "Arrangements::_unlinkINTERLIS2Def"
	public void _unlinkINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1) {
		iNTERLIS2Def = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkINTERLIS2Def"));
		return;
	}
	// -end- 358A601D010D _unlink_body358A5FEA022C
	// "Arrangements::_unlinkINTERLIS2Def"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5FEA022C detail_end "Arrangements"

	// -end- 358A5FEA022C detail_end "Arrangements"

}
