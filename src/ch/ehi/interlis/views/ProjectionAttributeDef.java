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

// -beg- preserve=no 3961A31B0231 package "ProjectionAttributeDef"
package ch.ehi.interlis.views;
// -end- 3961A31B0231 package "ProjectionAttributeDef"

// -beg- preserve=no 3961A31B0231 autoimport "ProjectionAttributeDef"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.interlis.logicalexpressions.FunctionCall;
import ch.ehi.interlis.views.BaseAttributeRef;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3961A31B0231 autoimport "ProjectionAttributeDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3961A31B0231 import "ProjectionAttributeDef"

// -end- 3961A31B0231 import "ProjectionAttributeDef"

/**
 * Definiert ein Attribut einer Projektion.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:30 $
 */
public class ProjectionAttributeDef extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3961A31B0231 detail_begin "ProjectionAttributeDef"

	// -end- 3961A31B0231 detail_begin "ProjectionAttributeDef"

	private static final long serialVersionUID = 5387784697455529008L;

	// -beg- preserve=no 3D4FA2180383 head3961A31B0231 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2180383 head3961A31B0231 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180383 throws3961A31B0231 "unlinkAll"

	// -end- 3D4FA2180383 throws3961A31B0231 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180383 body3961A31B0231 "unlinkAll"

		// Role ProjectionAttribute: ProjectionAttribute object(s) may point to
		// this
		detachDomainAttribute();
		detachFunctionCall();
		clearBaseAttributeRef();
		setName(null);
		super.unlinkAll();
		// -end- 3D4FA2180383 body3961A31B0231 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180384 head3961A31B0231 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180384 head3961A31B0231 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180384 throws3961A31B0231 "enumerateChildren"

	// -end- 3D4FA2180384 throws3961A31B0231 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180384 body3961A31B0231 "enumerateChildren"
		java.util.Iterator it = null;
		if (containsDomainAttribute())
			visitor.visit(getDomainAttribute());
		if (containsFunctionCall())
			visitor.visit(getFunctionCall());
		it = iteratorBaseAttributeRef();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getName());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2180384 body3961A31B0231 "enumerateChildren"
	}

	// -beg- preserve=no 3961A7830247 code3961A31B0231 "domainAttribute"
	private DomainAttribute domainAttribute;
	// -end- 3961A7830247 code3961A31B0231 "domainAttribute"

	/**
	 * attaches a DomainAttribute.
	 *
	 * @see #detachDomainAttribute
	 * @see #getDomainAttribute
	 * @see #containsDomainAttribute
	 */
	// -beg- preserve=no 3961A7830247 attach_head3961A31B0231
	// "ProjectionAttributeDef::attachDomainAttribute"
	public void attachDomainAttribute(DomainAttribute domainAttribute1)
	// -end- 3961A7830247 attach_head3961A31B0231
	// "ProjectionAttributeDef::attachDomainAttribute"
	{
		// -beg- preserve=no 3961A7830247 attach_body3961A31B0231
		// "ProjectionAttributeDef::attachDomainAttribute"
		if (domainAttribute != null) {
			throw new java.lang.IllegalStateException("already a domainAttribute attached");
		}
		if (domainAttribute1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as domainAttribute");
		}
		domainAttribute = domainAttribute1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachDomainAttribute"));
		return;
		// -end- 3961A7830247 attach_body3961A31B0231
		// "ProjectionAttributeDef::attachDomainAttribute"
	}

	/**
	 * disconnect the currently attached DomainAttribute.
	 * 
	 * @see #attachDomainAttribute
	 */
	// -beg- preserve=no 3961A7830247 detach_head3961A31B0231
	// "ProjectionAttributeDef::detachDomainAttribute"
	public DomainAttribute detachDomainAttribute()
	// -end- 3961A7830247 detach_head3961A31B0231
	// "ProjectionAttributeDef::detachDomainAttribute"
	{
		// -beg- preserve=no 3961A7830247 detach_body3961A31B0231
		// "ProjectionAttributeDef::detachDomainAttribute"
		DomainAttribute ret = null;
		ret = domainAttribute;
		domainAttribute = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachDomainAttribute"));
		return ret;
		// -end- 3961A7830247 detach_body3961A31B0231
		// "ProjectionAttributeDef::detachDomainAttribute"
	}

	/**
	 * get the currently attached DomainAttribute.
	 * 
	 * @see #attachDomainAttribute
	 */
	// -beg- preserve=no 3961A7830247 get_head3961A31B0231
	// "ProjectionAttributeDef::getDomainAttribute"
	public DomainAttribute getDomainAttribute()
	// -end- 3961A7830247 get_head3961A31B0231
	// "ProjectionAttributeDef::getDomainAttribute"
	{
		// -beg- preserve=no 3961A7830247 get_body3961A31B0231
		// "ProjectionAttributeDef::getDomainAttribute"
		if (domainAttribute == null) {
			throw new java.lang.IllegalStateException("no domainAttribute attached");
		}
		return domainAttribute;
		// -end- 3961A7830247 get_body3961A31B0231
		// "ProjectionAttributeDef::getDomainAttribute"
	}

	/**
	 * tests if there is a DomainAttribute attached.
	 * 
	 * @see #attachDomainAttribute
	 */
	// -beg- preserve=no 3961A7830247 test_head3961A31B0231
	// "ProjectionAttributeDef::containsDomainAttribute"
	public boolean containsDomainAttribute()
	// -end- 3961A7830247 test_head3961A31B0231
	// "ProjectionAttributeDef::containsDomainAttribute"
	{
		// -beg- preserve=no 3961A7830247 test_body3961A31B0231
		// "ProjectionAttributeDef::containsDomainAttribute"
		return domainAttribute != null;
		// -end- 3961A7830247 test_body3961A31B0231
		// "ProjectionAttributeDef::containsDomainAttribute"
	}

	// -beg- preserve=no 3961A80302E1 code3961A31B0231 "functionCall"
	private FunctionCall functionCall;
	// -end- 3961A80302E1 code3961A31B0231 "functionCall"

	/**
	 * attaches a FunctionCall.
	 *
	 * @see #detachFunctionCall
	 * @see #getFunctionCall
	 * @see #containsFunctionCall
	 */
	// -beg- preserve=no 3961A80302E1 attach_head3961A31B0231
	// "ProjectionAttributeDef::attachFunctionCall"
	public void attachFunctionCall(FunctionCall functionCall1)
	// -end- 3961A80302E1 attach_head3961A31B0231
	// "ProjectionAttributeDef::attachFunctionCall"
	{
		// -beg- preserve=no 3961A80302E1 attach_body3961A31B0231
		// "ProjectionAttributeDef::attachFunctionCall"
		if (functionCall != null) {
			throw new java.lang.IllegalStateException("already a functionCall attached");
		}
		if (functionCall1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as functionCall");
		}
		functionCall = functionCall1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachFunctionCall"));
		return;
		// -end- 3961A80302E1 attach_body3961A31B0231
		// "ProjectionAttributeDef::attachFunctionCall"
	}

	/**
	 * disconnect the currently attached FunctionCall.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 3961A80302E1 detach_head3961A31B0231
	// "ProjectionAttributeDef::detachFunctionCall"
	public FunctionCall detachFunctionCall()
	// -end- 3961A80302E1 detach_head3961A31B0231
	// "ProjectionAttributeDef::detachFunctionCall"
	{
		// -beg- preserve=no 3961A80302E1 detach_body3961A31B0231
		// "ProjectionAttributeDef::detachFunctionCall"
		FunctionCall ret = null;
		ret = functionCall;
		functionCall = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachFunctionCall"));
		return ret;
		// -end- 3961A80302E1 detach_body3961A31B0231
		// "ProjectionAttributeDef::detachFunctionCall"
	}

	/**
	 * get the currently attached FunctionCall.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 3961A80302E1 get_head3961A31B0231
	// "ProjectionAttributeDef::getFunctionCall"
	public FunctionCall getFunctionCall()
	// -end- 3961A80302E1 get_head3961A31B0231
	// "ProjectionAttributeDef::getFunctionCall"
	{
		// -beg- preserve=no 3961A80302E1 get_body3961A31B0231
		// "ProjectionAttributeDef::getFunctionCall"
		if (functionCall == null) {
			throw new java.lang.IllegalStateException("no functionCall attached");
		}
		return functionCall;
		// -end- 3961A80302E1 get_body3961A31B0231
		// "ProjectionAttributeDef::getFunctionCall"
	}

	/**
	 * tests if there is a FunctionCall attached.
	 * 
	 * @see #attachFunctionCall
	 */
	// -beg- preserve=no 3961A80302E1 test_head3961A31B0231
	// "ProjectionAttributeDef::containsFunctionCall"
	public boolean containsFunctionCall()
	// -end- 3961A80302E1 test_head3961A31B0231
	// "ProjectionAttributeDef::containsFunctionCall"
	{
		// -beg- preserve=no 3961A80302E1 test_body3961A31B0231
		// "ProjectionAttributeDef::containsFunctionCall"
		return functionCall != null;
		// -end- 3961A80302E1 test_body3961A31B0231
		// "ProjectionAttributeDef::containsFunctionCall"
	}

	// -beg- preserve=no 3961A83901A8 code3961A31B0231 "baseAttributeRef"
	private java.util.Set baseAttributeRef = new java.util.HashSet();
	// -end- 3961A83901A8 code3961A31B0231 "baseAttributeRef"

	/**
	 * add a BaseAttributeRef.
	 *
	 * @see #removeBaseAttributeRef
	 * @see #containsBaseAttributeRef
	 * @see #iteratorBaseAttributeRef
	 * @see #clearBaseAttributeRef
	 * @see #sizeBaseAttributeRef
	 */
	// -beg- preserve=no 3961A83901A8 add_head3961A31B0231
	// "ProjectionAttributeDef::addBaseAttributeRef"
	public void addBaseAttributeRef(BaseAttributeRef baseAttributeRef1)
	// -end- 3961A83901A8 add_head3961A31B0231
	// "ProjectionAttributeDef::addBaseAttributeRef"
	{
		// -beg- preserve=no 3961A83901A8 add_body3961A31B0231
		// "ProjectionAttributeDef::addBaseAttributeRef"
		baseAttributeRef.add(baseAttributeRef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addBaseAttributeRef"));
		return;
		// -end- 3961A83901A8 add_body3961A31B0231
		// "ProjectionAttributeDef::addBaseAttributeRef"
	}

	/**
	 * disconnect a BaseAttributeRef.
	 * 
	 * @see #addBaseAttributeRef
	 */
	// -beg- preserve=no 3961A83901A8 remove_head3961A31B0231
	// "ProjectionAttributeDef::removeBaseAttributeRef"
	public BaseAttributeRef removeBaseAttributeRef(BaseAttributeRef baseAttributeRef1)
	// -end- 3961A83901A8 remove_head3961A31B0231
	// "ProjectionAttributeDef::removeBaseAttributeRef"
	{
		// -beg- preserve=no 3961A83901A8 remove_body3961A31B0231
		// "ProjectionAttributeDef::removeBaseAttributeRef"
		BaseAttributeRef ret = null;
		if (baseAttributeRef1 == null || !baseAttributeRef.contains(baseAttributeRef1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = baseAttributeRef1;
		baseAttributeRef.remove(baseAttributeRef1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeBaseAttributeRef"));
		return ret;
		// -end- 3961A83901A8 remove_body3961A31B0231
		// "ProjectionAttributeDef::removeBaseAttributeRef"
	}

	/**
	 * tests if a given BaseAttributeRef is connected.
	 * 
	 * @see #addBaseAttributeRef
	 */
	// -beg- preserve=no 3961A83901A8 test_head3961A31B0231
	// "ProjectionAttributeDef::containsBaseAttributeRef"
	public boolean containsBaseAttributeRef(BaseAttributeRef baseAttributeRef1)
	// -end- 3961A83901A8 test_head3961A31B0231
	// "ProjectionAttributeDef::containsBaseAttributeRef"
	{
		// -beg- preserve=no 3961A83901A8 test_body3961A31B0231
		// "ProjectionAttributeDef::containsBaseAttributeRef"
		return baseAttributeRef.contains(baseAttributeRef1);
		// -end- 3961A83901A8 test_body3961A31B0231
		// "ProjectionAttributeDef::containsBaseAttributeRef"
	}

	/**
	 * used to enumerate all connected BaseAttributeRefs.
	 * 
	 * @see #addBaseAttributeRef
	 */
	// -beg- preserve=no 3961A83901A8 get_all_head3961A31B0231
	// "ProjectionAttributeDef::iteratorBaseAttributeRef"
	public java.util.Iterator iteratorBaseAttributeRef()
	// -end- 3961A83901A8 get_all_head3961A31B0231
	// "ProjectionAttributeDef::iteratorBaseAttributeRef"
	{
		// -beg- preserve=no 3961A83901A8 get_all_body3961A31B0231
		// "ProjectionAttributeDef::iteratorBaseAttributeRef"
		return baseAttributeRef.iterator();
		// -end- 3961A83901A8 get_all_body3961A31B0231
		// "ProjectionAttributeDef::iteratorBaseAttributeRef"
	}

	/**
	 * disconnect all BaseAttributeRefs.
	 * 
	 * @see #addBaseAttributeRef
	 */
	// -beg- preserve=no 3961A83901A8 remove_all_head3961A31B0231
	// "ProjectionAttributeDef::clearBaseAttributeRef"
	public void clearBaseAttributeRef()
	// -end- 3961A83901A8 remove_all_head3961A31B0231
	// "ProjectionAttributeDef::clearBaseAttributeRef"
	{
		// -beg- preserve=no 3961A83901A8 remove_all_body3961A31B0231
		// "ProjectionAttributeDef::clearBaseAttributeRef"
		if (sizeBaseAttributeRef() > 0) {
			baseAttributeRef.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearBaseAttributeRef"));
		}
		// -end- 3961A83901A8 remove_all_body3961A31B0231
		// "ProjectionAttributeDef::clearBaseAttributeRef"
	}

	/**
	 * returns the number of BaseAttributeRefs.
	 * 
	 * @see #addBaseAttributeRef
	 */
	// -beg- preserve=no 3961A83901A8 size_head3961A31B0231
	// "ProjectionAttributeDef::sizeBaseAttributeRef"
	public int sizeBaseAttributeRef()
	// -end- 3961A83901A8 size_head3961A31B0231
	// "ProjectionAttributeDef::sizeBaseAttributeRef"
	{
		// -beg- preserve=no 3961A83901A8 size_body3961A31B0231
		// "ProjectionAttributeDef::sizeBaseAttributeRef"
		return baseAttributeRef.size();
		// -end- 3961A83901A8 size_body3961A31B0231
		// "ProjectionAttributeDef::sizeBaseAttributeRef"
	}

	// -beg- preserve=no 3961A695023A var3961A31B0231 "name"
	private NlsString name = null;
	// -end- 3961A695023A var3961A31B0231 "name"

	/**
	 * get current value of name Name des Attributes in der Projektion.
	 * 
	 * @see #setName
	 */
	// -beg- preserve=no 3961A695023A get_head3961A31B0231 "name"
	public NlsString getName()
	// -end- 3961A695023A get_head3961A31B0231 "name"
	{
		// -beg- preserve=no 3961A695023A get_body3961A31B0231 "name"
		return name;
		// -end- 3961A695023A get_body3961A31B0231 "name"
	}

	/**
	 * set current value of name
	 * 
	 * @see #getName
	 */
	// -beg- preserve=no 3961A695023A set_head3961A31B0231 "name"
	public void setName(NlsString value1)
	// -end- 3961A695023A set_head3961A31B0231 "name"
	{
		// -beg- preserve=no 3961A695023A set_body3961A31B0231 "name"
		if (name != value1 && (name == null || !name.equals(value1))) {
			name = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setName"));
		}
		// -end- 3961A695023A set_body3961A31B0231 "name"
	}

	// -beg- preserve=no 3961A69A0300 var3961A31B0231 "properties"
	private long properties;
	// -end- 3961A69A0300 var3961A31B0231 "properties"

	/**
	 * get current value of properties Vererbungseigenschaften für dieses
	 * Attribut.
	 * 
	 * @see #setProperties
	 */
	// -beg- preserve=no 3961A69A0300 get_head3961A31B0231 "properties"
	public long getProperties()
	// -end- 3961A69A0300 get_head3961A31B0231 "properties"
	{
		// -beg- preserve=no 3961A69A0300 get_body3961A31B0231 "properties"
		return properties;
		// -end- 3961A69A0300 get_body3961A31B0231 "properties"
	}

	/**
	 * set current value of properties
	 * 
	 * @see #getProperties
	 */
	// -beg- preserve=no 3961A69A0300 set_head3961A31B0231 "properties"
	public void setProperties(long value1)
	// -end- 3961A69A0300 set_head3961A31B0231 "properties"
	{
		// -beg- preserve=no 3961A69A0300 set_body3961A31B0231 "properties"
		if (properties != value1) {
			properties = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setProperties"));
		}
		// -end- 3961A69A0300 set_body3961A31B0231 "properties"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3961A31B0231 detail_end "ProjectionAttributeDef"

	// -end- 3961A31B0231 detail_end "ProjectionAttributeDef"

}
