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

// -beg- preserve=no 39489AFF0050 package "RefSysRef"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 39489AFF0050 package "RefSysRef"

// -beg- preserve=no 39489AFF0050 autoimport "RefSysRef"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 39489AFF0050 autoimport "RefSysRef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 39489AFF0050 import "RefSysRef"

// -end- 39489AFF0050 import "RefSysRef"

/**
 * Verweist auf eine Koordinatenreferenzsystem-Definition.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:29 $
 */
public class RefSysRef extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39489AFF0050 detail_begin "RefSysRef"

	// -end- 39489AFF0050 detail_begin "RefSysRef"

	// -beg- preserve=no 3D4FA21B0189 head39489AFF0050 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0189 head39489AFF0050 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0189 throws39489AFF0050 "unlinkAll"

	// -end- 3D4FA21B0189 throws39489AFF0050 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0189 body39489AFF0050 "unlinkAll"

		// Role RefSys: RefSys object(s) may point to this
		detachDefinition();
		setModelName(null);
		setTopicName(null);
		setClassName(null);
		setRefsysName(null);
		super.unlinkAll();
		// -end- 3D4FA21B0189 body39489AFF0050 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B0193 head39489AFF0050 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B0193 head39489AFF0050 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0193 throws39489AFF0050 "enumerateChildren"

	// -end- 3D4FA21B0193 throws39489AFF0050 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0193 body39489AFF0050 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getModelName());
		visitor.visit(getTopicName());
		visitor.visit(getClassName());
		visitor.visit(getRefsysName());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B0193 body39489AFF0050 "enumerateChildren"
	}

	// -beg- preserve=no 397D982202B2 code39489AFF0050 "definition"
	private AbstractClassDef definition;
	// -end- 397D982202B2 code39489AFF0050 "definition"

	/**
	 * attaches a Definition.
	 *
	 * @see #detachDefinition
	 * @see #getDefinition
	 * @see #containsDefinition
	 */
	// -beg- preserve=no 397D982202B2 attach_head39489AFF0050
	// "RefSysRef::attachDefinition"
	public void attachDefinition(AbstractClassDef definition1)
	// -end- 397D982202B2 attach_head39489AFF0050 "RefSysRef::attachDefinition"
	{
		// -beg- preserve=no 397D982202B2 attach_body39489AFF0050
		// "RefSysRef::attachDefinition"
		if (definition != null) {
			throw new java.lang.IllegalStateException("already a definition attached");
		}
		if (definition1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as definition");
		}
		definition = definition1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachDefinition"));
		return;
		// -end- 397D982202B2 attach_body39489AFF0050
		// "RefSysRef::attachDefinition"
	}

	/**
	 * disconnect the currently attached Definition.
	 * 
	 * @see #attachDefinition
	 */
	// -beg- preserve=no 397D982202B2 detach_head39489AFF0050
	// "RefSysRef::detachDefinition"
	public AbstractClassDef detachDefinition()
	// -end- 397D982202B2 detach_head39489AFF0050 "RefSysRef::detachDefinition"
	{
		// -beg- preserve=no 397D982202B2 detach_body39489AFF0050
		// "RefSysRef::detachDefinition"
		AbstractClassDef ret = null;
		ret = definition;
		definition = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachDefinition"));
		return ret;
		// -end- 397D982202B2 detach_body39489AFF0050
		// "RefSysRef::detachDefinition"
	}

	/**
	 * get the currently attached Definition.
	 * 
	 * @see #attachDefinition
	 */
	// -beg- preserve=no 397D982202B2 get_head39489AFF0050
	// "RefSysRef::getDefinition"
	public AbstractClassDef getDefinition()
	// -end- 397D982202B2 get_head39489AFF0050 "RefSysRef::getDefinition"
	{
		// -beg- preserve=no 397D982202B2 get_body39489AFF0050
		// "RefSysRef::getDefinition"
		if (definition == null) {
			throw new java.lang.IllegalStateException("no definition attached");
		}
		return definition;
		// -end- 397D982202B2 get_body39489AFF0050 "RefSysRef::getDefinition"
	}

	/**
	 * tests if there is a Definition attached.
	 * 
	 * @see #attachDefinition
	 */
	// -beg- preserve=no 397D982202B2 test_head39489AFF0050
	// "RefSysRef::containsDefinition"
	public boolean containsDefinition()
	// -end- 397D982202B2 test_head39489AFF0050 "RefSysRef::containsDefinition"
	{
		// -beg- preserve=no 397D982202B2 test_body39489AFF0050
		// "RefSysRef::containsDefinition"
		return definition != null;
		// -end- 397D982202B2 test_body39489AFF0050
		// "RefSysRef::containsDefinition"
	}

	// -beg- preserve=no 39489C8D0143 var39489AFF0050 "modelName"
	private NlsString modelName = null;
	// -end- 39489C8D0143 var39489AFF0050 "modelName"

	/**
	 * get current value of modelName Name des Modells das die Definition
	 * enthält.
	 * 
	 * @see #setModelName
	 */
	// -beg- preserve=no 39489C8D0143 get_head39489AFF0050 "modelName"
	private NlsString getModelName()
	// -end- 39489C8D0143 get_head39489AFF0050 "modelName"
	{
		// -beg- preserve=no 39489C8D0143 get_body39489AFF0050 "modelName"
		return modelName;
		// -end- 39489C8D0143 get_body39489AFF0050 "modelName"
	}

	/**
	 * set current value of modelName
	 * 
	 * @see #getModelName
	 */
	// -beg- preserve=no 39489C8D0143 set_head39489AFF0050 "modelName"
	private void setModelName(NlsString value1)
	// -end- 39489C8D0143 set_head39489AFF0050 "modelName"
	{
		// -beg- preserve=no 39489C8D0143 set_body39489AFF0050 "modelName"
		if (modelName != value1 && (modelName == null || !modelName.equals(value1))) {
			modelName = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setModelName"));
		}
		// -end- 39489C8D0143 set_body39489AFF0050 "modelName"
	}

	// -beg- preserve=no 39489C970147 var39489AFF0050 "topicName"
	private NlsString topicName = null;
	// -end- 39489C970147 var39489AFF0050 "topicName"

	/**
	 * get current value of topicName Name des Themas das die Definition
	 * enthält.
	 * 
	 * @see #setTopicName
	 */
	// -beg- preserve=no 39489C970147 get_head39489AFF0050 "topicName"
	private NlsString getTopicName()
	// -end- 39489C970147 get_head39489AFF0050 "topicName"
	{
		// -beg- preserve=no 39489C970147 get_body39489AFF0050 "topicName"
		return topicName;
		// -end- 39489C970147 get_body39489AFF0050 "topicName"
	}

	/**
	 * set current value of topicName
	 * 
	 * @see #getTopicName
	 */
	// -beg- preserve=no 39489C970147 set_head39489AFF0050 "topicName"
	private void setTopicName(NlsString value1)
	// -end- 39489C970147 set_head39489AFF0050 "topicName"
	{
		// -beg- preserve=no 39489C970147 set_body39489AFF0050 "topicName"
		if (topicName != value1 && (topicName == null || !topicName.equals(value1))) {
			topicName = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setTopicName"));
		}
		// -end- 39489C970147 set_body39489AFF0050 "topicName"
	}

	// -beg- preserve=no 39489C9D0362 var39489AFF0050 "className"
	private NlsString className = null;
	// -end- 39489C9D0362 var39489AFF0050 "className"

	/**
	 * get current value of className Name der Klasse
	 * 
	 * @see #setClassName
	 */
	// -beg- preserve=no 39489C9D0362 get_head39489AFF0050 "className"
	private NlsString getClassName()
	// -end- 39489C9D0362 get_head39489AFF0050 "className"
	{
		// -beg- preserve=no 39489C9D0362 get_body39489AFF0050 "className"
		return className;
		// -end- 39489C9D0362 get_body39489AFF0050 "className"
	}

	/**
	 * set current value of className
	 * 
	 * @see #getClassName
	 */
	// -beg- preserve=no 39489C9D0362 set_head39489AFF0050 "className"
	private void setClassName(NlsString value1)
	// -end- 39489C9D0362 set_head39489AFF0050 "className"
	{
		// -beg- preserve=no 39489C9D0362 set_body39489AFF0050 "className"
		if (className != value1 && (className == null || !className.equals(value1))) {
			className = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setClassName"));
		}
		// -end- 39489C9D0362 set_body39489AFF0050 "className"
	}

	// -beg- preserve=no 39489CA4015A var39489AFF0050 "refsysName"
	private NlsString refsysName = null;
	// -end- 39489CA4015A var39489AFF0050 "refsysName"

	/**
	 * get current value of refsysName Name des Referenzsystem-Objektes in der
	 * Transferdatei
	 * 
	 * @see #setRefsysName
	 */
	// -beg- preserve=no 39489CA4015A get_head39489AFF0050 "refsysName"
	public NlsString getRefsysName()
	// -end- 39489CA4015A get_head39489AFF0050 "refsysName"
	{
		// -beg- preserve=no 39489CA4015A get_body39489AFF0050 "refsysName"
		return refsysName;
		// -end- 39489CA4015A get_body39489AFF0050 "refsysName"
	}

	/**
	 * set current value of refsysName
	 * 
	 * @see #getRefsysName
	 */
	// -beg- preserve=no 39489CA4015A set_head39489AFF0050 "refsysName"
	public void setRefsysName(NlsString value1)
	// -end- 39489CA4015A set_head39489AFF0050 "refsysName"
	{
		// -beg- preserve=no 39489CA4015A set_body39489AFF0050 "refsysName"
		if (refsysName != value1 && (refsysName == null || !refsysName.equals(value1))) {
			refsysName = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setRefsysName"));
		}
		// -end- 39489CA4015A set_body39489AFF0050 "refsysName"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 39489AFF0050 detail_end "RefSysRef"

	// -end- 39489AFF0050 detail_end "RefSysRef"

}
