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

// -beg- preserve=no 39488BFE0396 package "StructDec"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 39488BFE0396 package "StructDec"

// -beg- preserve=no 39488BFE0396 autoimport "StructDec"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import java.lang.Integer;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 39488BFE0396 autoimport "StructDec"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39488BFE0396 import "StructDec"

// -end- 39488BFE0396 import "StructDec"

/**
 * Definiert eine strukturierte Zahl.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:31 $
 */
public class StructDec extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39488BFE0396 detail_begin "StructDec"

	// -end- 39488BFE0396 detail_begin "StructDec"

	private static final long serialVersionUID = -2505196302956071954L;

	// -beg- preserve=no 3CCBFEA203B7 head39488BFE0396 "toString"
	public String toString()
	// -end- 3CCBFEA203B7 head39488BFE0396 "toString"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CCBFEA203B7 throws39488BFE0396 "toString"

	// -end- 3CCBFEA203B7 throws39488BFE0396 "toString"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CCBFEA203B7 body39488BFE0396 "toString"
		// {NUMBER}(:{POSNUMBER})+(\.{POSNUMBER})?
		StringBuffer ret = new StringBuffer();
		ret.append(Long.toString(getFront()));
		java.util.Iterator subIt = iteratorSubPart();
		while (subIt.hasNext()) {
			ret.append(":");
			ret.append(((Integer) (subIt.next())).toString());
		}
		if (containsDecPart()) {
			ret.append(".");
			ret.append(getDecPart().toString());
		}
		return ret.toString();
		// -end- 3CCBFEA203B7 body39488BFE0396 "toString"
	}

	// -beg- preserve=no 3CCBFEAA0029 head39488BFE0396 "parseStructDec"
	public static StructDec parseStructDec(String value)
			// -end- 3CCBFEAA0029 head39488BFE0396 "parseStructDec"
			// declare any checked exceptions
			// please fill in/modify the following section
			// -beg- preserve=yes 3CCBFEAA0029 throws39488BFE0396
			// "parseStructDec"
			throws java.lang.NumberFormatException
	// -end- 3CCBFEAA0029 throws39488BFE0396 "parseStructDec"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CCBFEAA0029 body39488BFE0396 "parseStructDec"
		// Number (* ':' PosNumber *) [ '.' PosNumber ]
		final String syntaxRule = "Number (* ':' PosNumber *) [ '.' PosNumber ]";
		StructDec ret = new StructDec();
		int cp;
		cp = value.indexOf(':');
		if (cp == -1) {
			cp = value.indexOf('.');
		}
		if (cp > 0) {
			try {
				ret.setFront(Integer.parseInt(value.substring(0, cp)));
			} catch (java.lang.NumberFormatException ex) {
				throw new java.lang.NumberFormatException(
						value + " doesn't conform to syntax rule StructDec (" + syntaxRule + ")");
			}
		} else if (cp == 0) {
			throw new java.lang.NumberFormatException(
					value + " doesn't conform to syntax rule StructDec (" + syntaxRule + ")");
		} else {
			// cp<0
			try {
				ret.setFront(Integer.parseInt(value));
			} catch (java.lang.NumberFormatException ex) {
				throw new java.lang.NumberFormatException(
						value + " doesn't conform to syntax rule StructDec (" + syntaxRule + ")");
			}
			// not other parts
			return ret;
		}
		cp = value.indexOf(':');
		while (cp >= 0) {
			int end = value.indexOf(':', cp + 1);
			if (end == -1) {
				end = value.indexOf('.', cp + 1);
				if (end == -1) {
					end = value.length();
				}
			}
			int subPart;
			try {
				subPart = Integer.parseInt(value.substring(cp + 1, end));
			} catch (java.lang.NumberFormatException ex) {
				throw new java.lang.NumberFormatException(
						value + " doesn't conform to syntax rule StructDec (" + syntaxRule + ")");
			}
			ret.addSubPart(new Integer(subPart));
			cp = value.indexOf(':', cp + 1);
		}
		cp = value.indexOf('.');
		if (cp >= 0) {
			try {
				ret.attachDecPart(new Integer(Integer.parseInt(value.substring(cp + 1))));
			} catch (java.lang.NumberFormatException ex) {
				throw new java.lang.NumberFormatException(
						value + " doesn't conform to syntax rule StructDec (" + syntaxRule + ")");
			}
		}
		return ret;
		// -end- 3CCBFEAA0029 body39488BFE0396 "parseStructDec"
	}

	// -beg- preserve=no 3D4FA21B01BB head39488BFE0396 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B01BB head39488BFE0396 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B01BB throws39488BFE0396 "unlinkAll"

	// -end- 3D4FA21B01BB throws39488BFE0396 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B01BB body39488BFE0396 "unlinkAll"

		clearSubPart();
		detachDecPart();
		super.unlinkAll();
		// -end- 3D4FA21B01BB body39488BFE0396 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B01C5 head39488BFE0396 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B01C5 head39488BFE0396 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B01C5 throws39488BFE0396 "enumerateChildren"

	// -end- 3D4FA21B01C5 throws39488BFE0396 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B01C5 body39488BFE0396 "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B01C5 body39488BFE0396 "enumerateChildren"
	}

	// -beg- preserve=no 3CCBFE340228 code39488BFE0396 "subPart"
	private java.util.List subPart = new java.util.ArrayList();
	// -end- 3CCBFE340228 code39488BFE0396 "subPart"

	/**
	 * add a SubPart.
	 *
	 * @see #removeSubPart
	 * @see #containsSubPart
	 * @see #iteratorSubPart
	 * @see #clearSubPart
	 * @see #sizeSubPart
	 */
	// -beg- preserve=no 3CCBFE340228 add_head39488BFE0396
	// "StructDec::addSubPart"
	public void addSubPart(Integer subPart1)
	// -end- 3CCBFE340228 add_head39488BFE0396 "StructDec::addSubPart"
	{
		// -beg- preserve=no 3CCBFE340228 add_body39488BFE0396
		// "StructDec::addSubPart"
		subPart.add(subPart1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSubPart"));
		return;
		// -end- 3CCBFE340228 add_body39488BFE0396 "StructDec::addSubPart"
	}

	// -beg- preserve=no 3CCBFE340228 add2_head39488BFE0396
	// "StructDec::add2SubPart"
	public void addSubPart(int index, Integer subPart1)
	// -end- 3CCBFE340228 add2_head39488BFE0396 "StructDec::add2SubPart"
	{
		// -beg- preserve=no 3CCBFE340228 add2_body39488BFE0396
		// "StructDec::add2SubPart"
		subPart.add(index, subPart1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addSubPart"));
		return;
		// -end- 3CCBFE340228 add2_body39488BFE0396 "StructDec::add2SubPart"
	}

	/**
	 * disconnect a SubPart.
	 * 
	 * @see #addSubPart
	 */
	// -beg- preserve=no 3CCBFE340228 remove_head39488BFE0396
	// "StructDec::removeSubPart"
	public Integer removeSubPart(Integer subPart1)
	// -end- 3CCBFE340228 remove_head39488BFE0396 "StructDec::removeSubPart"
	{
		// -beg- preserve=no 3CCBFE340228 remove_body39488BFE0396
		// "StructDec::removeSubPart"
		Integer ret = null;
		if (subPart1 == null || !subPart.contains(subPart1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = subPart1;
		subPart.remove(subPart1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSubPart"));
		return ret;
		// -end- 3CCBFE340228 remove_body39488BFE0396 "StructDec::removeSubPart"
	}

	/**
	 * disconnect a SubPart.
	 * 
	 * @see #addSubPart
	 */
	// -beg- preserve=no 3CCBFE340228 remove2_head39488BFE0396
	// "StructDec::remove2SubPart"
	public Integer removeSubPart(int index)
	// -end- 3CCBFE340228 remove2_head39488BFE0396 "StructDec::remove2SubPart"
	{
		// -beg- preserve=no 3CCBFE340228 remove2_body39488BFE0396
		// "StructDec::remove2SubPart"
		Integer ret = null;
		ret = (Integer) subPart.remove(index);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeSubPart"));
		return ret;
		// -end- 3CCBFE340228 remove2_body39488BFE0396
		// "StructDec::remove2SubPart"
	}

	/**
	 * change a SubPart.
	 * 
	 * @see #addSubPart
	 */
	// -beg- preserve=no 3CCBFE340228 set_head39488BFE0396
	// "StructDec::setSubPart"
	public Integer setSubPart(int index, Integer subPart1)
	// -end- 3CCBFE340228 set_head39488BFE0396 "StructDec::setSubPart"
	{
		// -beg- preserve=no 3CCBFE340228 set_body39488BFE0396
		// "StructDec::setSubPart"
		Integer ret = null;
		ret = (Integer) subPart.set(index, subPart1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSubPart"));
		return ret;
		// -end- 3CCBFE340228 set_body39488BFE0396 "StructDec::setSubPart"
	}

	/**
	 * tests if a given SubPart is connected.
	 * 
	 * @see #addSubPart
	 */
	// -beg- preserve=no 3CCBFE340228 test_head39488BFE0396
	// "StructDec::containsSubPart"
	public boolean containsSubPart(Integer subPart1)
	// -end- 3CCBFE340228 test_head39488BFE0396 "StructDec::containsSubPart"
	{
		// -beg- preserve=no 3CCBFE340228 test_body39488BFE0396
		// "StructDec::containsSubPart"
		return subPart.contains(subPart1);
		// -end- 3CCBFE340228 test_body39488BFE0396 "StructDec::containsSubPart"
	}

	/**
	 * used to enumerate all connected SubParts.
	 * 
	 * @see #addSubPart
	 */
	// -beg- preserve=no 3CCBFE340228 get_all_head39488BFE0396
	// "StructDec::iteratorSubPart"
	public java.util.Iterator iteratorSubPart()
	// -end- 3CCBFE340228 get_all_head39488BFE0396 "StructDec::iteratorSubPart"
	{
		// -beg- preserve=no 3CCBFE340228 get_all_body39488BFE0396
		// "StructDec::iteratorSubPart"
		return subPart.iterator();
		// -end- 3CCBFE340228 get_all_body39488BFE0396
		// "StructDec::iteratorSubPart"
	}

	/**
	 * disconnect all SubParts.
	 * 
	 * @see #addSubPart
	 */
	// -beg- preserve=no 3CCBFE340228 remove_all_head39488BFE0396
	// "StructDec::clearSubPart"
	public void clearSubPart()
	// -end- 3CCBFE340228 remove_all_head39488BFE0396 "StructDec::clearSubPart"
	{
		// -beg- preserve=no 3CCBFE340228 remove_all_body39488BFE0396
		// "StructDec::clearSubPart"
		if (sizeSubPart() > 0) {
			subPart.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearSubPart"));
		}
		// -end- 3CCBFE340228 remove_all_body39488BFE0396
		// "StructDec::clearSubPart"
	}

	/**
	 * returns the number of SubParts.
	 * 
	 * @see #addSubPart
	 */
	// -beg- preserve=no 3CCBFE340228 size_head39488BFE0396
	// "StructDec::sizeSubPart"
	public int sizeSubPart()
	// -end- 3CCBFE340228 size_head39488BFE0396 "StructDec::sizeSubPart"
	{
		// -beg- preserve=no 3CCBFE340228 size_body39488BFE0396
		// "StructDec::sizeSubPart"
		return subPart.size();
		// -end- 3CCBFE340228 size_body39488BFE0396 "StructDec::sizeSubPart"
	}

	// -beg- preserve=no 3CCBFE380379 code39488BFE0396 "decPart"
	private Integer decPart;
	// -end- 3CCBFE380379 code39488BFE0396 "decPart"

	/**
	 * attaches a DecPart.
	 *
	 * @see #detachDecPart
	 * @see #getDecPart
	 * @see #containsDecPart
	 */
	// -beg- preserve=no 3CCBFE380379 attach_head39488BFE0396
	// "StructDec::attachDecPart"
	public void attachDecPart(Integer decPart1)
	// -end- 3CCBFE380379 attach_head39488BFE0396 "StructDec::attachDecPart"
	{
		// -beg- preserve=no 3CCBFE380379 attach_body39488BFE0396
		// "StructDec::attachDecPart"
		if (decPart != null) {
			throw new java.lang.IllegalStateException("already a decPart attached");
		}
		if (decPart1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as decPart");
		}
		decPart = decPart1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachDecPart"));
		return;
		// -end- 3CCBFE380379 attach_body39488BFE0396 "StructDec::attachDecPart"
	}

	/**
	 * disconnect the currently attached DecPart.
	 * 
	 * @see #attachDecPart
	 */
	// -beg- preserve=no 3CCBFE380379 detach_head39488BFE0396
	// "StructDec::detachDecPart"
	public Integer detachDecPart()
	// -end- 3CCBFE380379 detach_head39488BFE0396 "StructDec::detachDecPart"
	{
		// -beg- preserve=no 3CCBFE380379 detach_body39488BFE0396
		// "StructDec::detachDecPart"
		Integer ret = null;
		ret = decPart;
		decPart = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachDecPart"));
		return ret;
		// -end- 3CCBFE380379 detach_body39488BFE0396 "StructDec::detachDecPart"
	}

	/**
	 * get the currently attached DecPart.
	 * 
	 * @see #attachDecPart
	 */
	// -beg- preserve=no 3CCBFE380379 get_head39488BFE0396
	// "StructDec::getDecPart"
	public Integer getDecPart()
	// -end- 3CCBFE380379 get_head39488BFE0396 "StructDec::getDecPart"
	{
		// -beg- preserve=no 3CCBFE380379 get_body39488BFE0396
		// "StructDec::getDecPart"
		if (decPart == null) {
			throw new java.lang.IllegalStateException("no decPart attached");
		}
		return decPart;
		// -end- 3CCBFE380379 get_body39488BFE0396 "StructDec::getDecPart"
	}

	/**
	 * tests if there is a DecPart attached.
	 * 
	 * @see #attachDecPart
	 */
	// -beg- preserve=no 3CCBFE380379 test_head39488BFE0396
	// "StructDec::containsDecPart"
	public boolean containsDecPart()
	// -end- 3CCBFE380379 test_head39488BFE0396 "StructDec::containsDecPart"
	{
		// -beg- preserve=no 3CCBFE380379 test_body39488BFE0396
		// "StructDec::containsDecPart"
		return decPart != null;
		// -end- 3CCBFE380379 test_body39488BFE0396 "StructDec::containsDecPart"
	}

	// -beg- preserve=no 39659AC0000B var39488BFE0396 "front"
	private long front;
	// -end- 39659AC0000B var39488BFE0396 "front"

	/**
	 * get current value of front die erste Zahl
	 * 
	 * @see #setFront
	 */
	// -beg- preserve=no 39659AC0000B get_head39488BFE0396 "front"
	public long getFront()
	// -end- 39659AC0000B get_head39488BFE0396 "front"
	{
		// -beg- preserve=no 39659AC0000B get_body39488BFE0396 "front"
		return front;
		// -end- 39659AC0000B get_body39488BFE0396 "front"
	}

	/**
	 * set current value of front
	 * 
	 * @see #getFront
	 */
	// -beg- preserve=no 39659AC0000B set_head39488BFE0396 "front"
	public void setFront(long value1)
	// -end- 39659AC0000B set_head39488BFE0396 "front"
	{
		// -beg- preserve=no 39659AC0000B set_body39488BFE0396 "front"
		if (front != value1) {
			front = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setFront"));
		}
		// -end- 39659AC0000B set_body39488BFE0396 "front"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39488BFE0396 detail_end "StructDec"

	// -end- 39488BFE0396 detail_end "StructDec"

}
