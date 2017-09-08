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

// -beg- preserve=no 358A5F2B0354 package "IdentDef"
package ch.ehi.interlis.modeltopicclass;
// -end- 358A5F2B0354 package "IdentDef"

// -beg- preserve=no 358A5F2B0354 autoimport "IdentDef"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A5F2B0354 autoimport "IdentDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A5F2B0354 import "IdentDef"

// -end- 358A5F2B0354 import "IdentDef"

/**
 * Definiert eine Eindeutigkeitsbedinung.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:41 $
 */
public class IdentDef extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5F2B0354 detail_begin "IdentDef"

	// -end- 358A5F2B0354 detail_begin "IdentDef"

	private static final long serialVersionUID = 7529076831156601850L;

	// -beg- preserve=no 3D4FA2190370 head358A5F2B0354 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2190370 head358A5F2B0354 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2190370 throws358A5F2B0354 "unlinkAll"

	// -end- 3D4FA2190370 throws358A5F2B0354 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2190370 body358A5F2B0354 "unlinkAll"

		clearAttributeDef();
		super.unlinkAll();
		// -end- 3D4FA2190370 body358A5F2B0354 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2190371 head358A5F2B0354 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2190371 head358A5F2B0354 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2190371 throws358A5F2B0354 "enumerateChildren"

	// -end- 3D4FA2190371 throws358A5F2B0354 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2190371 body358A5F2B0354 "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA2190371 body358A5F2B0354 "enumerateChildren"
	}

	// -beg- preserve=no 358A62100395 code358A5F2B0354 "attributeDef"
	private java.util.List attributeDef = new java.util.ArrayList();
	// -end- 358A62100395 code358A5F2B0354 "attributeDef"

	/**
	 * add a AttributeDef.
	 *
	 * @see #removeAttributeDef
	 * @see #containsAttributeDef
	 * @see #iteratorAttributeDef
	 * @see #clearAttributeDef
	 * @see #sizeAttributeDef
	 */
	// -beg- preserve=no 358A62100395 add_head358A5F2B0354
	// "IdentDef::addAttributeDef"
	public void addAttributeDef(AttributeDef attributeDef1)
	// -end- 358A62100395 add_head358A5F2B0354 "IdentDef::addAttributeDef"
	{
		// -beg- preserve=no 358A62100395 add_body358A5F2B0354
		// "IdentDef::addAttributeDef"
		attributeDef.add(attributeDef1);
		attributeDef1._linkIdentDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAttributeDef"));
		return;
		// -end- 358A62100395 add_body358A5F2B0354 "IdentDef::addAttributeDef"
	}

	// -beg- preserve=no 358A62100395 add2_head358A5F2B0354
	// "IdentDef::add2AttributeDef"
	public void addAttributeDef(int index, AttributeDef attributeDef1)
	// -end- 358A62100395 add2_head358A5F2B0354 "IdentDef::add2AttributeDef"
	{
		// -beg- preserve=no 358A62100395 add2_body358A5F2B0354
		// "IdentDef::add2AttributeDef"
		attributeDef.add(index, attributeDef1);
		attributeDef1._linkIdentDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAttributeDef"));
		return;
		// -end- 358A62100395 add2_body358A5F2B0354 "IdentDef::add2AttributeDef"
	}

	/**
	 * disconnect a AttributeDef.
	 * 
	 * @see #addAttributeDef
	 */
	// -beg- preserve=no 358A62100395 remove_head358A5F2B0354
	// "IdentDef::removeAttributeDef"
	public AttributeDef removeAttributeDef(AttributeDef attributeDef1)
	// -end- 358A62100395 remove_head358A5F2B0354 "IdentDef::removeAttributeDef"
	{
		// -beg- preserve=no 358A62100395 remove_body358A5F2B0354
		// "IdentDef::removeAttributeDef"
		AttributeDef ret = null;
		if (attributeDef1 == null || !attributeDef.contains(attributeDef1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = attributeDef1;
		attributeDef.remove(attributeDef1);
		attributeDef1._unlinkIdentDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAttributeDef"));
		return ret;
		// -end- 358A62100395 remove_body358A5F2B0354
		// "IdentDef::removeAttributeDef"
	}

	/**
	 * disconnect a AttributeDef.
	 * 
	 * @see #addAttributeDef
	 */
	// -beg- preserve=no 358A62100395 remove2_head358A5F2B0354
	// "IdentDef::remove2AttributeDef"
	public AttributeDef removeAttributeDef(int index)
	// -end- 358A62100395 remove2_head358A5F2B0354
	// "IdentDef::remove2AttributeDef"
	{
		// -beg- preserve=no 358A62100395 remove2_body358A5F2B0354
		// "IdentDef::remove2AttributeDef"
		AttributeDef ret = null;
		ret = (AttributeDef) attributeDef.remove(index);
		ret._unlinkIdentDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAttributeDef"));
		return ret;
		// -end- 358A62100395 remove2_body358A5F2B0354
		// "IdentDef::remove2AttributeDef"
	}

	/**
	 * change a AttributeDef.
	 * 
	 * @see #addAttributeDef
	 */
	// -beg- preserve=no 358A62100395 set_head358A5F2B0354
	// "IdentDef::setAttributeDef"
	public AttributeDef setAttributeDef(int index, AttributeDef attributeDef1)
	// -end- 358A62100395 set_head358A5F2B0354 "IdentDef::setAttributeDef"
	{
		// -beg- preserve=no 358A62100395 set_body358A5F2B0354
		// "IdentDef::setAttributeDef"
		AttributeDef ret = null;
		ret = (AttributeDef) attributeDef.set(index, attributeDef1);
		ret._unlinkIdentDef(this);
		attributeDef1._linkIdentDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAttributeDef"));
		return ret;
		// -end- 358A62100395 set_body358A5F2B0354 "IdentDef::setAttributeDef"
	}

	/**
	 * tests if a given AttributeDef is connected.
	 * 
	 * @see #addAttributeDef
	 */
	// -beg- preserve=no 358A62100395 test_head358A5F2B0354
	// "IdentDef::containsAttributeDef"
	public boolean containsAttributeDef(AttributeDef attributeDef1)
	// -end- 358A62100395 test_head358A5F2B0354 "IdentDef::containsAttributeDef"
	{
		// -beg- preserve=no 358A62100395 test_body358A5F2B0354
		// "IdentDef::containsAttributeDef"
		return attributeDef.contains(attributeDef1);
		// -end- 358A62100395 test_body358A5F2B0354
		// "IdentDef::containsAttributeDef"
	}

	/**
	 * used to enumerate all connected AttributeDefs.
	 * 
	 * @see #addAttributeDef
	 */
	// -beg- preserve=no 358A62100395 get_all_head358A5F2B0354
	// "IdentDef::iteratorAttributeDef"
	public java.util.Iterator iteratorAttributeDef()
	// -end- 358A62100395 get_all_head358A5F2B0354
	// "IdentDef::iteratorAttributeDef"
	{
		// -beg- preserve=no 358A62100395 get_all_body358A5F2B0354
		// "IdentDef::iteratorAttributeDef"
		return attributeDef.iterator();
		// -end- 358A62100395 get_all_body358A5F2B0354
		// "IdentDef::iteratorAttributeDef"
	}

	/**
	 * disconnect all AttributeDefs.
	 * 
	 * @see #addAttributeDef
	 */
	// -beg- preserve=no 358A62100395 remove_all_head358A5F2B0354
	// "IdentDef::clearAttributeDef"
	public void clearAttributeDef()
	// -end- 358A62100395 remove_all_head358A5F2B0354
	// "IdentDef::clearAttributeDef"
	{
		// -beg- preserve=no 358A62100395 remove_all_body358A5F2B0354
		// "IdentDef::clearAttributeDef"
		if (sizeAttributeDef() > 0) {
			for (java.util.Iterator p = attributeDef.iterator(); p.hasNext();) {
				((AttributeDef) p.next())._unlinkIdentDef(this);
			}
			attributeDef.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAttributeDef"));
		}
		// -end- 358A62100395 remove_all_body358A5F2B0354
		// "IdentDef::clearAttributeDef"
	}

	/**
	 * returns the number of AttributeDefs.
	 * 
	 * @see #addAttributeDef
	 */
	// -beg- preserve=no 358A62100395 size_head358A5F2B0354
	// "IdentDef::sizeAttributeDef"
	public int sizeAttributeDef()
	// -end- 358A62100395 size_head358A5F2B0354 "IdentDef::sizeAttributeDef"
	{
		// -beg- preserve=no 358A62100395 size_body358A5F2B0354
		// "IdentDef::sizeAttributeDef"
		return attributeDef.size();
		// -end- 358A62100395 size_body358A5F2B0354 "IdentDef::sizeAttributeDef"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A62100395 _link_body358A5F2B0354
	// "IdentDef::_linkAttributeDef"
	public void _linkAttributeDef(AttributeDef attributeDef1) {
		attributeDef.add(attributeDef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkAttributeDef"));
		return;
	}
	// -end- 358A62100395 _link_body358A5F2B0354 "IdentDef::_linkAttributeDef"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A62100395 _unlink_body358A5F2B0354
	// "IdentDef::_unlinkAttributeDef"
	public void _unlinkAttributeDef(AttributeDef attributeDef1) {
		attributeDef.remove(attributeDef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkAttributeDef"));
		return;
	}
	// -end- 358A62100395 _unlink_body358A5F2B0354
	// "IdentDef::_unlinkAttributeDef"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A5F2B0354 detail_end "IdentDef"

	// -end- 358A5F2B0354 detail_end "IdentDef"

}
