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

// -beg- preserve=no 394A41E30033 package "Factor"
package ch.ehi.interlis.logicalexpressions;
// -end- 394A41E30033 package "Factor"

// -beg- preserve=no 394A41E30033 autoimport "Factor"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.logicalexpressions.FactElement;
import ch.ehi.interlis.logicalexpressions.Term;
import ch.ehi.interlis.logicalexpressions.AttributePath;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.logicalexpressions.FactorKind;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 394A41E30033 autoimport "Factor"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394A41E30033 import "Factor"

// -end- 394A41E30033 import "Factor"

/**
 * Definiert einen Faktor eines Terms.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:05 $
 */
public class Factor extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394A41E30033 detail_begin "Factor"

	// -end- 394A41E30033 detail_begin "Factor"

	// -beg- preserve=no 3D4FA218021A head394A41E30033 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA218021A head394A41E30033 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA218021A throws394A41E30033 "unlinkAll"

	// -end- 3D4FA218021A throws394A41E30033 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA218021A body394A41E30033 "unlinkAll"

		// Role Term: Term object(s) may point to this
		detachElement();
		detachSubterm();
		clearExistsin();
		detachRestrictedto();
		setLocalBase(null);
		super.unlinkAll();
		// -end- 3D4FA218021A body394A41E30033 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180224 head394A41E30033 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180224 head394A41E30033 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180224 throws394A41E30033 "enumerateChildren"

	// -end- 3D4FA2180224 throws394A41E30033 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180224 body394A41E30033 "enumerateChildren"
		java.util.Iterator it = null;
		if (containsElement())
			visitor.visit(getElement());
		if (containsSubterm())
			visitor.visit(getSubterm());
		it = iteratorExistsin();
		while (it.hasNext())
			visitor.visit(it.next());
		if (containsRestrictedto())
			visitor.visit(getRestrictedto());
		visitor.visit(getLocalBase());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2180224 body394A41E30033 "enumerateChildren"
	}

	// -beg- preserve=no 39609BB50111 code394A41E30033 "element"
	private FactElement element;
	// -end- 39609BB50111 code394A41E30033 "element"

	/**
	 * attaches a Element.
	 *
	 * @see #detachElement
	 * @see #getElement
	 * @see #containsElement
	 */
	// -beg- preserve=no 39609BB50111 attach_head394A41E30033
	// "Factor::attachElement"
	public void attachElement(FactElement element1)
	// -end- 39609BB50111 attach_head394A41E30033 "Factor::attachElement"
	{
		// -beg- preserve=no 39609BB50111 attach_body394A41E30033
		// "Factor::attachElement"
		if (element != null) {
			throw new java.lang.IllegalStateException("already a element attached");
		}
		if (element1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as element");
		}
		element = element1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachElement"));
		return;
		// -end- 39609BB50111 attach_body394A41E30033 "Factor::attachElement"
	}

	/**
	 * disconnect the currently attached Element.
	 * 
	 * @see #attachElement
	 */
	// -beg- preserve=no 39609BB50111 detach_head394A41E30033
	// "Factor::detachElement"
	public FactElement detachElement()
	// -end- 39609BB50111 detach_head394A41E30033 "Factor::detachElement"
	{
		// -beg- preserve=no 39609BB50111 detach_body394A41E30033
		// "Factor::detachElement"
		FactElement ret = null;
		ret = element;
		element = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachElement"));
		return ret;
		// -end- 39609BB50111 detach_body394A41E30033 "Factor::detachElement"
	}

	/**
	 * get the currently attached Element.
	 * 
	 * @see #attachElement
	 */
	// -beg- preserve=no 39609BB50111 get_head394A41E30033 "Factor::getElement"
	public FactElement getElement()
	// -end- 39609BB50111 get_head394A41E30033 "Factor::getElement"
	{
		// -beg- preserve=no 39609BB50111 get_body394A41E30033
		// "Factor::getElement"
		if (element == null) {
			throw new java.lang.IllegalStateException("no element attached");
		}
		return element;
		// -end- 39609BB50111 get_body394A41E30033 "Factor::getElement"
	}

	/**
	 * tests if there is a Element attached.
	 * 
	 * @see #attachElement
	 */
	// -beg- preserve=no 39609BB50111 test_head394A41E30033
	// "Factor::containsElement"
	public boolean containsElement()
	// -end- 39609BB50111 test_head394A41E30033 "Factor::containsElement"
	{
		// -beg- preserve=no 39609BB50111 test_body394A41E30033
		// "Factor::containsElement"
		return element != null;
		// -end- 39609BB50111 test_body394A41E30033 "Factor::containsElement"
	}

	// -beg- preserve=no 39609BD20325 code394A41E30033 "subterm"
	private Term subterm;
	// -end- 39609BD20325 code394A41E30033 "subterm"

	/**
	 * attaches a Subterm.
	 *
	 * @see #detachSubterm
	 * @see #getSubterm
	 * @see #containsSubterm
	 */
	// -beg- preserve=no 39609BD20325 attach_head394A41E30033
	// "Factor::attachSubterm"
	public void attachSubterm(Term subterm1)
	// -end- 39609BD20325 attach_head394A41E30033 "Factor::attachSubterm"
	{
		// -beg- preserve=no 39609BD20325 attach_body394A41E30033
		// "Factor::attachSubterm"
		if (subterm != null) {
			throw new java.lang.IllegalStateException("already a subterm attached");
		}
		if (subterm1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as subterm");
		}
		subterm = subterm1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachSubterm"));
		return;
		// -end- 39609BD20325 attach_body394A41E30033 "Factor::attachSubterm"
	}

	/**
	 * disconnect the currently attached Subterm.
	 * 
	 * @see #attachSubterm
	 */
	// -beg- preserve=no 39609BD20325 detach_head394A41E30033
	// "Factor::detachSubterm"
	public Term detachSubterm()
	// -end- 39609BD20325 detach_head394A41E30033 "Factor::detachSubterm"
	{
		// -beg- preserve=no 39609BD20325 detach_body394A41E30033
		// "Factor::detachSubterm"
		Term ret = null;
		ret = subterm;
		subterm = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachSubterm"));
		return ret;
		// -end- 39609BD20325 detach_body394A41E30033 "Factor::detachSubterm"
	}

	/**
	 * get the currently attached Subterm.
	 * 
	 * @see #attachSubterm
	 */
	// -beg- preserve=no 39609BD20325 get_head394A41E30033 "Factor::getSubterm"
	public Term getSubterm()
	// -end- 39609BD20325 get_head394A41E30033 "Factor::getSubterm"
	{
		// -beg- preserve=no 39609BD20325 get_body394A41E30033
		// "Factor::getSubterm"
		if (subterm == null) {
			throw new java.lang.IllegalStateException("no subterm attached");
		}
		return subterm;
		// -end- 39609BD20325 get_body394A41E30033 "Factor::getSubterm"
	}

	/**
	 * tests if there is a Subterm attached.
	 * 
	 * @see #attachSubterm
	 */
	// -beg- preserve=no 39609BD20325 test_head394A41E30033
	// "Factor::containsSubterm"
	public boolean containsSubterm()
	// -end- 39609BD20325 test_head394A41E30033 "Factor::containsSubterm"
	{
		// -beg- preserve=no 39609BD20325 test_body394A41E30033
		// "Factor::containsSubterm"
		return subterm != null;
		// -end- 39609BD20325 test_body394A41E30033 "Factor::containsSubterm"
	}

	// -beg- preserve=no 39609C040364 code394A41E30033 "existsin"
	private java.util.Set existsin = new java.util.HashSet();
	// -end- 39609C040364 code394A41E30033 "existsin"

	/**
	 * add a Existsin.
	 *
	 * @see #removeExistsin
	 * @see #containsExistsin
	 * @see #iteratorExistsin
	 * @see #clearExistsin
	 * @see #sizeExistsin
	 */
	// -beg- preserve=no 39609C040364 add_head394A41E30033 "Factor::addExistsin"
	public void addExistsin(AttributePath existsin1)
	// -end- 39609C040364 add_head394A41E30033 "Factor::addExistsin"
	{
		// -beg- preserve=no 39609C040364 add_body394A41E30033
		// "Factor::addExistsin"
		existsin.add(existsin1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addExistsin"));
		return;
		// -end- 39609C040364 add_body394A41E30033 "Factor::addExistsin"
	}

	/**
	 * disconnect a Existsin.
	 * 
	 * @see #addExistsin
	 */
	// -beg- preserve=no 39609C040364 remove_head394A41E30033
	// "Factor::removeExistsin"
	public AttributePath removeExistsin(AttributePath existsin1)
	// -end- 39609C040364 remove_head394A41E30033 "Factor::removeExistsin"
	{
		// -beg- preserve=no 39609C040364 remove_body394A41E30033
		// "Factor::removeExistsin"
		AttributePath ret = null;
		if (existsin1 == null || !existsin.contains(existsin1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = existsin1;
		existsin.remove(existsin1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeExistsin"));
		return ret;
		// -end- 39609C040364 remove_body394A41E30033 "Factor::removeExistsin"
	}

	/**
	 * tests if a given Existsin is connected.
	 * 
	 * @see #addExistsin
	 */
	// -beg- preserve=no 39609C040364 test_head394A41E30033
	// "Factor::containsExistsin"
	public boolean containsExistsin(AttributePath existsin1)
	// -end- 39609C040364 test_head394A41E30033 "Factor::containsExistsin"
	{
		// -beg- preserve=no 39609C040364 test_body394A41E30033
		// "Factor::containsExistsin"
		return existsin.contains(existsin1);
		// -end- 39609C040364 test_body394A41E30033 "Factor::containsExistsin"
	}

	/**
	 * used to enumerate all connected Existsins.
	 * 
	 * @see #addExistsin
	 */
	// -beg- preserve=no 39609C040364 get_all_head394A41E30033
	// "Factor::iteratorExistsin"
	public java.util.Iterator iteratorExistsin()
	// -end- 39609C040364 get_all_head394A41E30033 "Factor::iteratorExistsin"
	{
		// -beg- preserve=no 39609C040364 get_all_body394A41E30033
		// "Factor::iteratorExistsin"
		return existsin.iterator();
		// -end- 39609C040364 get_all_body394A41E30033
		// "Factor::iteratorExistsin"
	}

	/**
	 * disconnect all Existsins.
	 * 
	 * @see #addExistsin
	 */
	// -beg- preserve=no 39609C040364 remove_all_head394A41E30033
	// "Factor::clearExistsin"
	public void clearExistsin()
	// -end- 39609C040364 remove_all_head394A41E30033 "Factor::clearExistsin"
	{
		// -beg- preserve=no 39609C040364 remove_all_body394A41E30033
		// "Factor::clearExistsin"
		if (sizeExistsin() > 0) {
			existsin.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearExistsin"));
		}
		// -end- 39609C040364 remove_all_body394A41E30033
		// "Factor::clearExistsin"
	}

	/**
	 * returns the number of Existsins.
	 * 
	 * @see #addExistsin
	 */
	// -beg- preserve=no 39609C040364 size_head394A41E30033
	// "Factor::sizeExistsin"
	public int sizeExistsin()
	// -end- 39609C040364 size_head394A41E30033 "Factor::sizeExistsin"
	{
		// -beg- preserve=no 39609C040364 size_body394A41E30033
		// "Factor::sizeExistsin"
		return existsin.size();
		// -end- 39609C040364 size_body394A41E30033 "Factor::sizeExistsin"
	}

	// -beg- preserve=no 39609D370061 code394A41E30033 "restrictedto"
	private AbstractClassDef restrictedto;
	// -end- 39609D370061 code394A41E30033 "restrictedto"

	/**
	 * attaches a Restrictedto.
	 *
	 * @see #detachRestrictedto
	 * @see #getRestrictedto
	 * @see #containsRestrictedto
	 */
	// -beg- preserve=no 39609D370061 attach_head394A41E30033
	// "Factor::attachRestrictedto"
	public void attachRestrictedto(AbstractClassDef restrictedto1)
	// -end- 39609D370061 attach_head394A41E30033 "Factor::attachRestrictedto"
	{
		// -beg- preserve=no 39609D370061 attach_body394A41E30033
		// "Factor::attachRestrictedto"
		if (restrictedto != null) {
			throw new java.lang.IllegalStateException("already a restrictedto attached");
		}
		if (restrictedto1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as restrictedto");
		}
		restrictedto = restrictedto1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachRestrictedto"));
		return;
		// -end- 39609D370061 attach_body394A41E30033
		// "Factor::attachRestrictedto"
	}

	/**
	 * disconnect the currently attached Restrictedto.
	 * 
	 * @see #attachRestrictedto
	 */
	// -beg- preserve=no 39609D370061 detach_head394A41E30033
	// "Factor::detachRestrictedto"
	public AbstractClassDef detachRestrictedto()
	// -end- 39609D370061 detach_head394A41E30033 "Factor::detachRestrictedto"
	{
		// -beg- preserve=no 39609D370061 detach_body394A41E30033
		// "Factor::detachRestrictedto"
		AbstractClassDef ret = null;
		ret = restrictedto;
		restrictedto = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachRestrictedto"));
		return ret;
		// -end- 39609D370061 detach_body394A41E30033
		// "Factor::detachRestrictedto"
	}

	/**
	 * get the currently attached Restrictedto.
	 * 
	 * @see #attachRestrictedto
	 */
	// -beg- preserve=no 39609D370061 get_head394A41E30033
	// "Factor::getRestrictedto"
	public AbstractClassDef getRestrictedto()
	// -end- 39609D370061 get_head394A41E30033 "Factor::getRestrictedto"
	{
		// -beg- preserve=no 39609D370061 get_body394A41E30033
		// "Factor::getRestrictedto"
		if (restrictedto == null) {
			throw new java.lang.IllegalStateException("no restrictedto attached");
		}
		return restrictedto;
		// -end- 39609D370061 get_body394A41E30033 "Factor::getRestrictedto"
	}

	/**
	 * tests if there is a Restrictedto attached.
	 * 
	 * @see #attachRestrictedto
	 */
	// -beg- preserve=no 39609D370061 test_head394A41E30033
	// "Factor::containsRestrictedto"
	public boolean containsRestrictedto()
	// -end- 39609D370061 test_head394A41E30033 "Factor::containsRestrictedto"
	{
		// -beg- preserve=no 39609D370061 test_body394A41E30033
		// "Factor::containsRestrictedto"
		return restrictedto != null;
		// -end- 39609D370061 test_body394A41E30033
		// "Factor::containsRestrictedto"
	}

	// -beg- preserve=no 39609AD202FE var394A41E30033 "kind"
	private int kind;
	// -end- 39609AD202FE var394A41E30033 "kind"

	/**
	 * get current value of kind ELEMENT, EXISTSIN, SUBTERM, DEFINED oder
	 * RESTRICTED
	 * 
	 * @see ch.ehi.interlis.logicalexpressions.FactorKind
	 * @see #setKind
	 */
	// -beg- preserve=no 39609AD202FE get_head394A41E30033 "kind"
	public int getKind()
	// -end- 39609AD202FE get_head394A41E30033 "kind"
	{
		// -beg- preserve=no 39609AD202FE get_body394A41E30033 "kind"
		return kind;
		// -end- 39609AD202FE get_body394A41E30033 "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.logicalexpressions.FactorKind
	 * @see #getKind
	 */
	// -beg- preserve=no 39609AD202FE set_head394A41E30033 "kind"
	public void setKind(int value1)
	// -end- 39609AD202FE set_head394A41E30033 "kind"
	{
		// -beg- preserve=no 39609AD202FE set_body394A41E30033 "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 39609AD202FE set_body394A41E30033 "kind"
	}

	// -beg- preserve=no 39609ADF0221 var394A41E30033 "localBase"
	private NlsString localBase = null;
	// -end- 39609ADF0221 var394A41E30033 "localBase"

	/**
	 * get current value of localBase nur definiert wenn
	 * kind==RESTRICTEDstd::list<CString>
	 * 
	 * @see #setLocalBase
	 */
	// -beg- preserve=no 39609ADF0221 get_head394A41E30033 "localBase"
	public NlsString getLocalBase()
	// -end- 39609ADF0221 get_head394A41E30033 "localBase"
	{
		// -beg- preserve=no 39609ADF0221 get_body394A41E30033 "localBase"
		return localBase;
		// -end- 39609ADF0221 get_body394A41E30033 "localBase"
	}

	/**
	 * set current value of localBase
	 * 
	 * @see #getLocalBase
	 */
	// -beg- preserve=no 39609ADF0221 set_head394A41E30033 "localBase"
	public void setLocalBase(NlsString value1)
	// -end- 39609ADF0221 set_head394A41E30033 "localBase"
	{
		// -beg- preserve=no 39609ADF0221 set_body394A41E30033 "localBase"
		if (localBase != value1 && (localBase == null || !localBase.equals(value1))) {
			localBase = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setLocalBase"));
		}
		// -end- 39609ADF0221 set_body394A41E30033 "localBase"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394A41E30033 detail_end "Factor"

	// -end- 394A41E30033 detail_end "Factor"

}
