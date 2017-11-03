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

// -beg- preserve=no 358A5FCC0283 package "Evaluations"
package ch.ehi.interlis.views;
// -end- 358A5FCC0283 package "Evaluations"

// -beg- preserve=no 358A5FCC0283 autoimport "Evaluations"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A5FCC0283 autoimport "Evaluations"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5FCC0283 import "Evaluations"

// -end- 358A5FCC0283 import "Evaluations"

/**
 * Diese Klasse ist nur in INTERLIS1 vorhanden und wird in der Regel nicht
 * implementiert.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:27 $
 */
public class Evaluations extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5FCC0283 detail_begin "Evaluations"

	// -end- 358A5FCC0283 detail_begin "Evaluations"

	private static final long serialVersionUID = 4177607637386860231L;

	// -beg- preserve=no 3D4FA21803A1 head358A5FCC0283 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21803A1 head358A5FCC0283 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21803A1 throws358A5FCC0283 "unlinkAll"

	// -end- 3D4FA21803A1 throws358A5FCC0283 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21803A1 body358A5FCC0283 "unlinkAll"

		detachINTERLIS2Def();
		super.unlinkAll();
		// -end- 3D4FA21803A1 body358A5FCC0283 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21803A2 head358A5FCC0283 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21803A2 head358A5FCC0283 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21803A2 throws358A5FCC0283 "enumerateChildren"

	// -end- 3D4FA21803A2 throws358A5FCC0283 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21803A2 body358A5FCC0283 "enumerateChildren"
		Iterator<?> it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21803A2 body358A5FCC0283 "enumerateChildren"
	}

	// -beg- preserve=no 358A5FD70062 code358A5FCC0283 "iNTERLIS2Def"
	private INTERLIS2Def iNTERLIS2Def;
	// -end- 358A5FD70062 code358A5FCC0283 "iNTERLIS2Def"

	/**
	 * attaches a INTERLIS2Def.
	 *
	 * @see #detachINTERLIS2Def
	 * @see #getINTERLIS2Def
	 * @see #containsINTERLIS2Def
	 */
	// -beg- preserve=no 358A5FD70062 attach_head358A5FCC0283
	// "Evaluations::attachINTERLIS2Def"
	public void attachINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1)
	// -end- 358A5FD70062 attach_head358A5FCC0283
	// "Evaluations::attachINTERLIS2Def"
	{
		// -beg- preserve=no 358A5FD70062 attach_body358A5FCC0283
		// "Evaluations::attachINTERLIS2Def"
		if (iNTERLIS2Def != null) {
			throw new java.lang.IllegalStateException("already a iNTERLIS2Def attached");
		}
		if (iNTERLIS2Def1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as iNTERLIS2Def");
		}
		iNTERLIS2Def = iNTERLIS2Def1;
		iNTERLIS2Def1._linkEvaluations(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachINTERLIS2Def"));
		return;
		// -end- 358A5FD70062 attach_body358A5FCC0283
		// "Evaluations::attachINTERLIS2Def"
	}

	/**
	 * disconnect the currently attached INTERLIS2Def.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A5FD70062 detach_head358A5FCC0283
	// "Evaluations::detachINTERLIS2Def"
	public INTERLIS2Def detachINTERLIS2Def()
	// -end- 358A5FD70062 detach_head358A5FCC0283
	// "Evaluations::detachINTERLIS2Def"
	{
		// -beg- preserve=no 358A5FD70062 detach_body358A5FCC0283
		// "Evaluations::detachINTERLIS2Def"
		INTERLIS2Def ret = null;
		if (iNTERLIS2Def != null) {
			iNTERLIS2Def._unlinkEvaluations(this);
			ret = iNTERLIS2Def;
			iNTERLIS2Def = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachINTERLIS2Def"));
		return ret;
		// -end- 358A5FD70062 detach_body358A5FCC0283
		// "Evaluations::detachINTERLIS2Def"
	}

	/**
	 * get the currently attached INTERLIS2Def.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A5FD70062 get_head358A5FCC0283
	// "Evaluations::getINTERLIS2Def"
	public INTERLIS2Def getINTERLIS2Def()
	// -end- 358A5FD70062 get_head358A5FCC0283 "Evaluations::getINTERLIS2Def"
	{
		// -beg- preserve=no 358A5FD70062 get_body358A5FCC0283
		// "Evaluations::getINTERLIS2Def"
		if (iNTERLIS2Def == null) {
			throw new java.lang.IllegalStateException("no iNTERLIS2Def attached");
		}
		return iNTERLIS2Def;
		// -end- 358A5FD70062 get_body358A5FCC0283
		// "Evaluations::getINTERLIS2Def"
	}

	/**
	 * tests if there is a INTERLIS2Def attached.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A5FD70062 test_head358A5FCC0283
	// "Evaluations::containsINTERLIS2Def"
	public boolean containsINTERLIS2Def()
	// -end- 358A5FD70062 test_head358A5FCC0283
	// "Evaluations::containsINTERLIS2Def"
	{
		// -beg- preserve=no 358A5FD70062 test_body358A5FCC0283
		// "Evaluations::containsINTERLIS2Def"
		return iNTERLIS2Def != null;
		// -end- 358A5FD70062 test_body358A5FCC0283
		// "Evaluations::containsINTERLIS2Def"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A5FD70062 _link_body358A5FCC0283
	// "Evaluations::_linkINTERLIS2Def"
	public void _linkINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1) {
		iNTERLIS2Def = iNTERLIS2Def1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkINTERLIS2Def"));
		return;
	}
	// -end- 358A5FD70062 _link_body358A5FCC0283
	// "Evaluations::_linkINTERLIS2Def"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A5FD70062 _unlink_body358A5FCC0283
	// "Evaluations::_unlinkINTERLIS2Def"
	public void _unlinkINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1) {
		iNTERLIS2Def = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkINTERLIS2Def"));
		return;
	}
	// -end- 358A5FD70062 _unlink_body358A5FCC0283
	// "Evaluations::_unlinkINTERLIS2Def"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5FCC0283 detail_end "Evaluations"

	// -end- 358A5FCC0283 detail_end "Evaluations"

}
