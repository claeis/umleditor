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

// -beg- preserve=no 39609BF90168 package "AttributePath"
package ch.ehi.interlis.logicalexpressions;
// -end- 39609BF90168 package "AttributePath"

// -beg- preserve=no 39609BF90168 autoimport "AttributePath"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.views.ViewableDef;
import ch.ehi.interlis.logicalexpressions.AttributeRef;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 39609BF90168 autoimport "AttributePath"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39609BF90168 import "AttributePath"

// -end- 39609BF90168 import "AttributePath"

/**
 * Verweist auf eine Reihe von Attributen.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:00 $
 */
public class AttributePath extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39609BF90168 detail_begin "AttributePath"

	// -end- 39609BF90168 detail_begin "AttributePath"

	private static final long serialVersionUID = 7913010795662679808L;

	// -beg- preserve=no 3D4FA2180257 head39609BF90168 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2180257 head39609BF90168 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180257 throws39609BF90168 "unlinkAll"

	// -end- 3D4FA2180257 throws39609BF90168 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180257 body39609BF90168 "unlinkAll"

		// Role Factor: Factor object(s) may point to this
		// Role FactElement: FactElement object(s) may point to this
		detachViewableDef();
		clearAttributeRef();
		// Role SigAssignment: SigAssignment object(s) may point to this
		// Role AttributeValueUsage: AttributeValueUsage object(s) may point to
		// this
		super.unlinkAll();
		// -end- 3D4FA2180257 body39609BF90168 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180261 head39609BF90168 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180261 head39609BF90168 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180261 throws39609BF90168 "enumerateChildren"

	// -end- 3D4FA2180261 throws39609BF90168 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180261 body39609BF90168 "enumerateChildren"
		Iterator<?> it = null;
		if (containsViewableDef())
			visitor.visit(getViewableDef());
		it = iteratorAttributeRef();
		while (it.hasNext())
			visitor.visit(it.next());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2180261 body39609BF90168 "enumerateChildren"
	}

	// -beg- preserve=no 3960A72D02A3 code39609BF90168 "viewableDef"
	private ViewableDef viewableDef;
	// -end- 3960A72D02A3 code39609BF90168 "viewableDef"

	/**
	 * attaches a ViewableDef.
	 *
	 * @see #detachViewableDef
	 * @see #getViewableDef
	 * @see #containsViewableDef
	 */
	// -beg- preserve=no 3960A72D02A3 attach_head39609BF90168
	// "AttributePath::attachViewableDef"
	public void attachViewableDef(ViewableDef viewableDef1)
	// -end- 3960A72D02A3 attach_head39609BF90168
	// "AttributePath::attachViewableDef"
	{
		// -beg- preserve=no 3960A72D02A3 attach_body39609BF90168
		// "AttributePath::attachViewableDef"
		if (viewableDef != null) {
			throw new java.lang.IllegalStateException("already a viewableDef attached");
		}
		if (viewableDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as viewableDef");
		}
		viewableDef = viewableDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachViewableDef"));
		return;
		// -end- 3960A72D02A3 attach_body39609BF90168
		// "AttributePath::attachViewableDef"
	}

	/**
	 * disconnect the currently attached ViewableDef.
	 * 
	 * @see #attachViewableDef
	 */
	// -beg- preserve=no 3960A72D02A3 detach_head39609BF90168
	// "AttributePath::detachViewableDef"
	public ViewableDef detachViewableDef()
	// -end- 3960A72D02A3 detach_head39609BF90168
	// "AttributePath::detachViewableDef"
	{
		// -beg- preserve=no 3960A72D02A3 detach_body39609BF90168
		// "AttributePath::detachViewableDef"
		ViewableDef ret = null;
		ret = viewableDef;
		viewableDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachViewableDef"));
		return ret;
		// -end- 3960A72D02A3 detach_body39609BF90168
		// "AttributePath::detachViewableDef"
	}

	/**
	 * get the currently attached ViewableDef.
	 * 
	 * @see #attachViewableDef
	 */
	// -beg- preserve=no 3960A72D02A3 get_head39609BF90168
	// "AttributePath::getViewableDef"
	public ViewableDef getViewableDef()
	// -end- 3960A72D02A3 get_head39609BF90168 "AttributePath::getViewableDef"
	{
		// -beg- preserve=no 3960A72D02A3 get_body39609BF90168
		// "AttributePath::getViewableDef"
		if (viewableDef == null) {
			throw new java.lang.IllegalStateException("no viewableDef attached");
		}
		return viewableDef;
		// -end- 3960A72D02A3 get_body39609BF90168
		// "AttributePath::getViewableDef"
	}

	/**
	 * tests if there is a ViewableDef attached.
	 * 
	 * @see #attachViewableDef
	 */
	// -beg- preserve=no 3960A72D02A3 test_head39609BF90168
	// "AttributePath::containsViewableDef"
	public boolean containsViewableDef()
	// -end- 3960A72D02A3 test_head39609BF90168
	// "AttributePath::containsViewableDef"
	{
		// -beg- preserve=no 3960A72D02A3 test_body39609BF90168
		// "AttributePath::containsViewableDef"
		return viewableDef != null;
		// -end- 3960A72D02A3 test_body39609BF90168
		// "AttributePath::containsViewableDef"
	}

	// -beg- preserve=no 3960A74B0378 code39609BF90168 "attributeRef"
	private Set<AttributeRef> attributeRef = new HashSet<AttributeRef>();
	// -end- 3960A74B0378 code39609BF90168 "attributeRef"

	/**
	 * add a AttributeRef.
	 *
	 * @see #removeAttributeRef
	 * @see #containsAttributeRef
	 * @see #iteratorAttributeRef
	 * @see #clearAttributeRef
	 * @see #sizeAttributeRef
	 */
	// -beg- preserve=no 3960A74B0378 add_head39609BF90168
	// "AttributePath::addAttributeRef"
	public void addAttributeRef(AttributeRef attributeRef1)
	// -end- 3960A74B0378 add_head39609BF90168 "AttributePath::addAttributeRef"
	{
		// -beg- preserve=no 3960A74B0378 add_body39609BF90168
		// "AttributePath::addAttributeRef"
		attributeRef.add(attributeRef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addAttributeRef"));
		return;
		// -end- 3960A74B0378 add_body39609BF90168
		// "AttributePath::addAttributeRef"
	}

	/**
	 * disconnect a AttributeRef.
	 * 
	 * @see #addAttributeRef
	 */
	// -beg- preserve=no 3960A74B0378 remove_head39609BF90168
	// "AttributePath::removeAttributeRef"
	public AttributeRef removeAttributeRef(AttributeRef attributeRef1)
	// -end- 3960A74B0378 remove_head39609BF90168
	// "AttributePath::removeAttributeRef"
	{
		// -beg- preserve=no 3960A74B0378 remove_body39609BF90168
		// "AttributePath::removeAttributeRef"
		AttributeRef ret = null;
		if (attributeRef1 == null || !attributeRef.contains(attributeRef1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = attributeRef1;
		attributeRef.remove(attributeRef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeAttributeRef"));
		return ret;
		// -end- 3960A74B0378 remove_body39609BF90168
		// "AttributePath::removeAttributeRef"
	}

	/**
	 * tests if a given AttributeRef is connected.
	 * 
	 * @see #addAttributeRef
	 */
	// -beg- preserve=no 3960A74B0378 test_head39609BF90168
	// "AttributePath::containsAttributeRef"
	public boolean containsAttributeRef(AttributeRef attributeRef1)
	// -end- 3960A74B0378 test_head39609BF90168
	// "AttributePath::containsAttributeRef"
	{
		// -beg- preserve=no 3960A74B0378 test_body39609BF90168
		// "AttributePath::containsAttributeRef"
		return attributeRef.contains(attributeRef1);
		// -end- 3960A74B0378 test_body39609BF90168
		// "AttributePath::containsAttributeRef"
	}

	/**
	 * used to enumerate all connected AttributeRefs.
	 * 
	 * @see #addAttributeRef
	 */
	// -beg- preserve=no 3960A74B0378 get_all_head39609BF90168
	// "AttributePath::iteratorAttributeRef"
	public Iterator<AttributeRef> iteratorAttributeRef()
	// -end- 3960A74B0378 get_all_head39609BF90168
	// "AttributePath::iteratorAttributeRef"
	{
		// -beg- preserve=no 3960A74B0378 get_all_body39609BF90168
		// "AttributePath::iteratorAttributeRef"
		return attributeRef.iterator();
		// -end- 3960A74B0378 get_all_body39609BF90168
		// "AttributePath::iteratorAttributeRef"
	}

	/**
	 * disconnect all AttributeRefs.
	 * 
	 * @see #addAttributeRef
	 */
	// -beg- preserve=no 3960A74B0378 remove_all_head39609BF90168
	// "AttributePath::clearAttributeRef"
	public void clearAttributeRef()
	// -end- 3960A74B0378 remove_all_head39609BF90168
	// "AttributePath::clearAttributeRef"
	{
		// -beg- preserve=no 3960A74B0378 remove_all_body39609BF90168
		// "AttributePath::clearAttributeRef"
		if (sizeAttributeRef() > 0) {
			attributeRef.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearAttributeRef"));
		}
		// -end- 3960A74B0378 remove_all_body39609BF90168
		// "AttributePath::clearAttributeRef"
	}

	/**
	 * returns the number of AttributeRefs.
	 * 
	 * @see #addAttributeRef
	 */
	// -beg- preserve=no 3960A74B0378 size_head39609BF90168
	// "AttributePath::sizeAttributeRef"
	public int sizeAttributeRef()
	// -end- 3960A74B0378 size_head39609BF90168
	// "AttributePath::sizeAttributeRef"
	{
		// -beg- preserve=no 3960A74B0378 size_body39609BF90168
		// "AttributePath::sizeAttributeRef"
		return attributeRef.size();
		// -end- 3960A74B0378 size_body39609BF90168
		// "AttributePath::sizeAttributeRef"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39609BF90168 detail_end "AttributePath"

	// -end- 39609BF90168 detail_end "AttributePath"

}
