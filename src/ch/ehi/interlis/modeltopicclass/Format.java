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

// -beg- preserve=no 358A5FEF0337 package "Format"
package ch.ehi.interlis.modeltopicclass;
// -end- 358A5FEF0337 package "Format"

// -beg- preserve=no 358A5FEF0337 autoimport "Format"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A5FEF0337 autoimport "Format"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5FEF0337 import "Format"

// -end- 358A5FEF0337 import "Format"

/**
 * Formatierung der Transferdatei.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:40 $
 */
public class Format extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5FEF0337 detail_begin "Format"

	// -end- 358A5FEF0337 detail_begin "Format"

	// -beg- preserve=no 3D4FA21A0001 head358A5FEF0337 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21A0001 head358A5FEF0337 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A0001 throws358A5FEF0337 "unlinkAll"

	// -end- 3D4FA21A0001 throws358A5FEF0337 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A0001 body358A5FEF0337 "unlinkAll"

		detachINTERLIS2Def();
		super.unlinkAll();
		// -end- 3D4FA21A0001 body358A5FEF0337 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21A0002 head358A5FEF0337 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21A0002 head358A5FEF0337 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A0002 throws358A5FEF0337 "enumerateChildren"

	// -end- 3D4FA21A0002 throws358A5FEF0337 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A0002 body358A5FEF0337 "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21A0002 body358A5FEF0337 "enumerateChildren"
	}

	// -beg- preserve=no 358A60200248 code358A5FEF0337 "iNTERLIS2Def"
	private INTERLIS2Def iNTERLIS2Def;
	// -end- 358A60200248 code358A5FEF0337 "iNTERLIS2Def"

	/**
	 * attaches a INTERLIS2Def.
	 *
	 * @see #detachINTERLIS2Def
	 * @see #getINTERLIS2Def
	 * @see #containsINTERLIS2Def
	 */
	// -beg- preserve=no 358A60200248 attach_head358A5FEF0337
	// "Format::attachINTERLIS2Def"
	public void attachINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1)
	// -end- 358A60200248 attach_head358A5FEF0337 "Format::attachINTERLIS2Def"
	{
		// -beg- preserve=no 358A60200248 attach_body358A5FEF0337
		// "Format::attachINTERLIS2Def"
		if (iNTERLIS2Def != null) {
			throw new java.lang.IllegalStateException("already a iNTERLIS2Def attached");
		}
		if (iNTERLIS2Def1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as iNTERLIS2Def");
		}
		iNTERLIS2Def = iNTERLIS2Def1;
		iNTERLIS2Def1._linkFormat(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachINTERLIS2Def"));
		return;
		// -end- 358A60200248 attach_body358A5FEF0337
		// "Format::attachINTERLIS2Def"
	}

	/**
	 * disconnect the currently attached INTERLIS2Def.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A60200248 detach_head358A5FEF0337
	// "Format::detachINTERLIS2Def"
	public INTERLIS2Def detachINTERLIS2Def()
	// -end- 358A60200248 detach_head358A5FEF0337 "Format::detachINTERLIS2Def"
	{
		// -beg- preserve=no 358A60200248 detach_body358A5FEF0337
		// "Format::detachINTERLIS2Def"
		INTERLIS2Def ret = null;
		if (iNTERLIS2Def != null) {
			iNTERLIS2Def._unlinkFormat(this);
			ret = iNTERLIS2Def;
			iNTERLIS2Def = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachINTERLIS2Def"));
		return ret;
		// -end- 358A60200248 detach_body358A5FEF0337
		// "Format::detachINTERLIS2Def"
	}

	/**
	 * get the currently attached INTERLIS2Def.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A60200248 get_head358A5FEF0337
	// "Format::getINTERLIS2Def"
	public INTERLIS2Def getINTERLIS2Def()
	// -end- 358A60200248 get_head358A5FEF0337 "Format::getINTERLIS2Def"
	{
		// -beg- preserve=no 358A60200248 get_body358A5FEF0337
		// "Format::getINTERLIS2Def"
		if (iNTERLIS2Def == null) {
			throw new java.lang.IllegalStateException("no iNTERLIS2Def attached");
		}
		return iNTERLIS2Def;
		// -end- 358A60200248 get_body358A5FEF0337 "Format::getINTERLIS2Def"
	}

	/**
	 * tests if there is a INTERLIS2Def attached.
	 * 
	 * @see #attachINTERLIS2Def
	 */
	// -beg- preserve=no 358A60200248 test_head358A5FEF0337
	// "Format::containsINTERLIS2Def"
	public boolean containsINTERLIS2Def()
	// -end- 358A60200248 test_head358A5FEF0337 "Format::containsINTERLIS2Def"
	{
		// -beg- preserve=no 358A60200248 test_body358A5FEF0337
		// "Format::containsINTERLIS2Def"
		return iNTERLIS2Def != null;
		// -end- 358A60200248 test_body358A5FEF0337
		// "Format::containsINTERLIS2Def"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A60200248 _link_body358A5FEF0337
	// "Format::_linkINTERLIS2Def"
	public void _linkINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1) {
		iNTERLIS2Def = iNTERLIS2Def1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkINTERLIS2Def"));
		return;
	}
	// -end- 358A60200248 _link_body358A5FEF0337 "Format::_linkINTERLIS2Def"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A60200248 _unlink_body358A5FEF0337
	// "Format::_unlinkINTERLIS2Def"
	public void _unlinkINTERLIS2Def(INTERLIS2Def iNTERLIS2Def1) {
		iNTERLIS2Def = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkINTERLIS2Def"));
		return;
	}
	// -end- 358A60200248 _unlink_body358A5FEF0337 "Format::_unlinkINTERLIS2Def"

	// -beg- preserve=no 358A739900AB var358A5FEF0337 "free"
	private boolean free;
	// -end- 358A739900AB var358A5FEF0337 "free"

	/**
	 * get current value of free Freies (=true) oder fixes Format
	 * 
	 * @see #setFree
	 */
	// -beg- preserve=no 358A739900AB get_head358A5FEF0337 "free"
	public boolean isFree()
	// -end- 358A739900AB get_head358A5FEF0337 "free"
	{
		// -beg- preserve=no 358A739900AB get_body358A5FEF0337 "free"
		return free;
		// -end- 358A739900AB get_body358A5FEF0337 "free"
	}

	/**
	 * set current value of free
	 * 
	 * @see #isFree
	 */
	// -beg- preserve=no 358A739900AB set_head358A5FEF0337 "free"
	public void setFree(boolean value1)
	// -end- 358A739900AB set_head358A5FEF0337 "free"
	{
		// -beg- preserve=no 358A739900AB set_body358A5FEF0337 "free"
		if (free != value1) {
			free = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setFree"));
		}
		// -end- 358A739900AB set_body358A5FEF0337 "free"
	}

	// -beg- preserve=no 358A73A30019 var358A5FEF0337 "linesize"
	private long linesize;
	// -end- 358A73A30019 var358A5FEF0337 "linesize"

	/**
	 * get current value of linesize Zeilenlänge
	 * 
	 * @see #setLinesize
	 */
	// -beg- preserve=no 358A73A30019 get_head358A5FEF0337 "linesize"
	public long getLinesize()
	// -end- 358A73A30019 get_head358A5FEF0337 "linesize"
	{
		// -beg- preserve=no 358A73A30019 get_body358A5FEF0337 "linesize"
		return linesize;
		// -end- 358A73A30019 get_body358A5FEF0337 "linesize"
	}

	/**
	 * set current value of linesize
	 * 
	 * @see #getLinesize
	 */
	// -beg- preserve=no 358A73A30019 set_head358A5FEF0337 "linesize"
	public void setLinesize(long value1)
	// -end- 358A73A30019 set_head358A5FEF0337 "linesize"
	{
		// -beg- preserve=no 358A73A30019 set_body358A5FEF0337 "linesize"
		if (linesize != value1) {
			linesize = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLinesize"));
		}
		// -end- 358A73A30019 set_body358A5FEF0337 "linesize"
	}

	// -beg- preserve=no 358A73AA000F var358A5FEF0337 "tidsize"
	private long tidsize;
	// -end- 358A73AA000F var358A5FEF0337 "tidsize"

	/**
	 * get current value of tidsize Länge der Objekt-Identifikationen
	 * 
	 * @see #setTidsize
	 */
	// -beg- preserve=no 358A73AA000F get_head358A5FEF0337 "tidsize"
	public long getTidsize()
	// -end- 358A73AA000F get_head358A5FEF0337 "tidsize"
	{
		// -beg- preserve=no 358A73AA000F get_body358A5FEF0337 "tidsize"
		return tidsize;
		// -end- 358A73AA000F get_body358A5FEF0337 "tidsize"
	}

	/**
	 * set current value of tidsize
	 * 
	 * @see #getTidsize
	 */
	// -beg- preserve=no 358A73AA000F set_head358A5FEF0337 "tidsize"
	public void setTidsize(long value1)
	// -end- 358A73AA000F set_head358A5FEF0337 "tidsize"
	{
		// -beg- preserve=no 358A73AA000F set_body358A5FEF0337 "tidsize"
		if (tidsize != value1) {
			tidsize = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setTidsize"));
		}
		// -end- 358A73AA000F set_body358A5FEF0337 "tidsize"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5FEF0337 detail_end "Format"

	// -end- 358A5FEF0337 detail_end "Format"

}
