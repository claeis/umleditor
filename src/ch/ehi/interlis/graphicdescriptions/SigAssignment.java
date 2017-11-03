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

// -beg- preserve=no 3961F95C036D package "SigAssignment"
package ch.ehi.interlis.graphicdescriptions;
// -end- 3961F95C036D package "SigAssignment"

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3961F95C036D autoimport "SigAssignment"
import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.domainsandconstants.basetypes.Constant;
import ch.ehi.interlis.logicalexpressions.AttributePath;
// -beg- preserve=no 3961F95C036D autoimport "SigAssignment"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3961F95C036D import "SigAssignment"

// -end- 3961F95C036D import "SigAssignment"

/**
 * Definiert eine Zuweisung für einen Signatur-Parameter.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:58 $
 */
public class SigAssignment extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3961F95C036D detail_begin "SigAssignment"

	// -end- 3961F95C036D detail_begin "SigAssignment"

	private static final long serialVersionUID = 1399965919171068475L;

	// -beg- preserve=no 3D4FA2190095 head3961F95C036D "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA2190095 head3961F95C036D "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2190095 throws3961F95C036D "unlinkAll"

	// -end- 3D4FA2190095 throws3961F95C036D "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2190095 body3961F95C036D "unlinkAll"

		// Role CondSigParamAss: CondSigParamAss object(s) may point to this
		detachConstant();
		clearEnumAssignment();
		detachAttributePath();
		setParameterName(null);
		super.unlinkAll();
		// -end- 3D4FA2190095 body3961F95C036D "unlinkAll"
	}

	// -beg- preserve=no 3D4FA219009F head3961F95C036D "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA219009F head3961F95C036D "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA219009F throws3961F95C036D "enumerateChildren"

	// -end- 3D4FA219009F throws3961F95C036D "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA219009F body3961F95C036D "enumerateChildren"
		Iterator<?> it = null;
		if (containsConstant())
			visitor.visit(getConstant());
		it = iteratorEnumAssignment();
		while (it.hasNext())
			visitor.visit(it.next());
		if (containsAttributePath())
			visitor.visit(getAttributePath());
		visitor.visit(getParameterName());
		super.enumerateChildren(visitor);
		// -end- 3D4FA219009F body3961F95C036D "enumerateChildren"
	}

	// -beg- preserve=no 3961FB4B010C code3961F95C036D "constant"
	private Constant constant;
	// -end- 3961FB4B010C code3961F95C036D "constant"

	/**
	 * attaches a Constant.
	 *
	 * @see #detachConstant
	 * @see #getConstant
	 * @see #containsConstant
	 */
	// -beg- preserve=no 3961FB4B010C attach_head3961F95C036D
	// "SigAssignment::attachConstant"
	public void attachConstant(Constant constant1)
	// -end- 3961FB4B010C attach_head3961F95C036D
	// "SigAssignment::attachConstant"
	{
		// -beg- preserve=no 3961FB4B010C attach_body3961F95C036D
		// "SigAssignment::attachConstant"
		if (constant != null) {
			throw new java.lang.IllegalStateException("already a constant attached");
		}
		if (constant1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as constant");
		}
		constant = constant1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachConstant"));
		return;
		// -end- 3961FB4B010C attach_body3961F95C036D
		// "SigAssignment::attachConstant"
	}

	/**
	 * disconnect the currently attached Constant.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3961FB4B010C detach_head3961F95C036D
	// "SigAssignment::detachConstant"
	public Constant detachConstant()
	// -end- 3961FB4B010C detach_head3961F95C036D
	// "SigAssignment::detachConstant"
	{
		// -beg- preserve=no 3961FB4B010C detach_body3961F95C036D
		// "SigAssignment::detachConstant"
		Constant ret = null;
		ret = constant;
		constant = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachConstant"));
		return ret;
		// -end- 3961FB4B010C detach_body3961F95C036D
		// "SigAssignment::detachConstant"
	}

	/**
	 * get the currently attached Constant.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3961FB4B010C get_head3961F95C036D
	// "SigAssignment::getConstant"
	public Constant getConstant()
	// -end- 3961FB4B010C get_head3961F95C036D "SigAssignment::getConstant"
	{
		// -beg- preserve=no 3961FB4B010C get_body3961F95C036D
		// "SigAssignment::getConstant"
		if (constant == null) {
			throw new java.lang.IllegalStateException("no constant attached");
		}
		return constant;
		// -end- 3961FB4B010C get_body3961F95C036D "SigAssignment::getConstant"
	}

	/**
	 * tests if there is a Constant attached.
	 * 
	 * @see #attachConstant
	 */
	// -beg- preserve=no 3961FB4B010C test_head3961F95C036D
	// "SigAssignment::containsConstant"
	public boolean containsConstant()
	// -end- 3961FB4B010C test_head3961F95C036D
	// "SigAssignment::containsConstant"
	{
		// -beg- preserve=no 3961FB4B010C test_body3961F95C036D
		// "SigAssignment::containsConstant"
		return constant != null;
		// -end- 3961FB4B010C test_body3961F95C036D
		// "SigAssignment::containsConstant"
	}

	// -beg- preserve=no 3961FCF30242 code3961F95C036D "enumAssignment"
	private Set<EnumAssignment> enumAssignment = new HashSet<EnumAssignment>();
	// -end- 3961FCF30242 code3961F95C036D "enumAssignment"

	/**
	 * add a EnumAssignment.
	 *
	 * @see #removeEnumAssignment
	 * @see #containsEnumAssignment
	 * @see #iteratorEnumAssignment
	 * @see #clearEnumAssignment
	 * @see #sizeEnumAssignment
	 */
	// -beg- preserve=no 3961FCF30242 add_head3961F95C036D
	// "SigAssignment::addEnumAssignment"
	public void addEnumAssignment(EnumAssignment enumAssignment1)
	// -end- 3961FCF30242 add_head3961F95C036D
	// "SigAssignment::addEnumAssignment"
	{
		// -beg- preserve=no 3961FCF30242 add_body3961F95C036D
		// "SigAssignment::addEnumAssignment"
		enumAssignment.add(enumAssignment1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addEnumAssignment"));
		return;
		// -end- 3961FCF30242 add_body3961F95C036D
		// "SigAssignment::addEnumAssignment"
	}

	/**
	 * disconnect a EnumAssignment.
	 * 
	 * @see #addEnumAssignment
	 */
	// -beg- preserve=no 3961FCF30242 remove_head3961F95C036D
	// "SigAssignment::removeEnumAssignment"
	public EnumAssignment removeEnumAssignment(EnumAssignment enumAssignment1)
	// -end- 3961FCF30242 remove_head3961F95C036D
	// "SigAssignment::removeEnumAssignment"
	{
		// -beg- preserve=no 3961FCF30242 remove_body3961F95C036D
		// "SigAssignment::removeEnumAssignment"
		EnumAssignment ret = null;
		if (enumAssignment1 == null || !enumAssignment.contains(enumAssignment1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = enumAssignment1;
		enumAssignment.remove(enumAssignment1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeEnumAssignment"));
		return ret;
		// -end- 3961FCF30242 remove_body3961F95C036D
		// "SigAssignment::removeEnumAssignment"
	}

	/**
	 * tests if a given EnumAssignment is connected.
	 * 
	 * @see #addEnumAssignment
	 */
	// -beg- preserve=no 3961FCF30242 test_head3961F95C036D
	// "SigAssignment::containsEnumAssignment"
	public boolean containsEnumAssignment(EnumAssignment enumAssignment1)
	// -end- 3961FCF30242 test_head3961F95C036D
	// "SigAssignment::containsEnumAssignment"
	{
		// -beg- preserve=no 3961FCF30242 test_body3961F95C036D
		// "SigAssignment::containsEnumAssignment"
		return enumAssignment.contains(enumAssignment1);
		// -end- 3961FCF30242 test_body3961F95C036D
		// "SigAssignment::containsEnumAssignment"
	}

	/**
	 * used to enumerate all connected EnumAssignments.
	 * 
	 * @see #addEnumAssignment
	 */
	// -beg- preserve=no 3961FCF30242 get_all_head3961F95C036D
	// "SigAssignment::iteratorEnumAssignment"
	public Iterator<?> iteratorEnumAssignment()
	// -end- 3961FCF30242 get_all_head3961F95C036D
	// "SigAssignment::iteratorEnumAssignment"
	{
		// -beg- preserve=no 3961FCF30242 get_all_body3961F95C036D
		// "SigAssignment::iteratorEnumAssignment"
		return enumAssignment.iterator();
		// -end- 3961FCF30242 get_all_body3961F95C036D
		// "SigAssignment::iteratorEnumAssignment"
	}

	/**
	 * disconnect all EnumAssignments.
	 * 
	 * @see #addEnumAssignment
	 */
	// -beg- preserve=no 3961FCF30242 remove_all_head3961F95C036D
	// "SigAssignment::clearEnumAssignment"
	public void clearEnumAssignment()
	// -end- 3961FCF30242 remove_all_head3961F95C036D
	// "SigAssignment::clearEnumAssignment"
	{
		// -beg- preserve=no 3961FCF30242 remove_all_body3961F95C036D
		// "SigAssignment::clearEnumAssignment"
		if (sizeEnumAssignment() > 0) {
			enumAssignment.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearEnumAssignment"));
		}
		// -end- 3961FCF30242 remove_all_body3961F95C036D
		// "SigAssignment::clearEnumAssignment"
	}

	/**
	 * returns the number of EnumAssignments.
	 * 
	 * @see #addEnumAssignment
	 */
	// -beg- preserve=no 3961FCF30242 size_head3961F95C036D
	// "SigAssignment::sizeEnumAssignment"
	public int sizeEnumAssignment()
	// -end- 3961FCF30242 size_head3961F95C036D
	// "SigAssignment::sizeEnumAssignment"
	{
		// -beg- preserve=no 3961FCF30242 size_body3961F95C036D
		// "SigAssignment::sizeEnumAssignment"
		return enumAssignment.size();
		// -end- 3961FCF30242 size_body3961F95C036D
		// "SigAssignment::sizeEnumAssignment"
	}

	// -beg- preserve=no 39620F180313 code3961F95C036D "attributePath"
	private AttributePath attributePath;
	// -end- 39620F180313 code3961F95C036D "attributePath"

	/**
	 * attaches a AttributePath.
	 *
	 * @see #detachAttributePath
	 * @see #getAttributePath
	 * @see #containsAttributePath
	 */
	// -beg- preserve=no 39620F180313 attach_head3961F95C036D
	// "SigAssignment::attachAttributePath"
	public void attachAttributePath(AttributePath attributePath1)
	// -end- 39620F180313 attach_head3961F95C036D
	// "SigAssignment::attachAttributePath"
	{
		// -beg- preserve=no 39620F180313 attach_body3961F95C036D
		// "SigAssignment::attachAttributePath"
		if (attributePath != null) {
			throw new java.lang.IllegalStateException("already a attributePath attached");
		}
		if (attributePath1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as attributePath");
		}
		attributePath = attributePath1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachAttributePath"));
		return;
		// -end- 39620F180313 attach_body3961F95C036D
		// "SigAssignment::attachAttributePath"
	}

	/**
	 * disconnect the currently attached AttributePath.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 39620F180313 detach_head3961F95C036D
	// "SigAssignment::detachAttributePath"
	public AttributePath detachAttributePath()
	// -end- 39620F180313 detach_head3961F95C036D
	// "SigAssignment::detachAttributePath"
	{
		// -beg- preserve=no 39620F180313 detach_body3961F95C036D
		// "SigAssignment::detachAttributePath"
		AttributePath ret = null;
		ret = attributePath;
		attributePath = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachAttributePath"));
		return ret;
		// -end- 39620F180313 detach_body3961F95C036D
		// "SigAssignment::detachAttributePath"
	}

	/**
	 * get the currently attached AttributePath.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 39620F180313 get_head3961F95C036D
	// "SigAssignment::getAttributePath"
	public AttributePath getAttributePath()
	// -end- 39620F180313 get_head3961F95C036D "SigAssignment::getAttributePath"
	{
		// -beg- preserve=no 39620F180313 get_body3961F95C036D
		// "SigAssignment::getAttributePath"
		if (attributePath == null) {
			throw new java.lang.IllegalStateException("no attributePath attached");
		}
		return attributePath;
		// -end- 39620F180313 get_body3961F95C036D
		// "SigAssignment::getAttributePath"
	}

	/**
	 * tests if there is a AttributePath attached.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 39620F180313 test_head3961F95C036D
	// "SigAssignment::containsAttributePath"
	public boolean containsAttributePath()
	// -end- 39620F180313 test_head3961F95C036D
	// "SigAssignment::containsAttributePath"
	{
		// -beg- preserve=no 39620F180313 test_body3961F95C036D
		// "SigAssignment::containsAttributePath"
		return attributePath != null;
		// -end- 39620F180313 test_body3961F95C036D
		// "SigAssignment::containsAttributePath"
	}

	// -beg- preserve=no 3961FA60015E var3961F95C036D "parameterName"
	private NlsString parameterName = null;
	// -end- 3961FA60015E var3961F95C036D "parameterName"

	/**
	 * get current value of parameterName Name des Signaturparameters.
	 * 
	 * @see #setParameterName
	 */
	// -beg- preserve=no 3961FA60015E get_head3961F95C036D "parameterName"
	public NlsString getParameterName()
	// -end- 3961FA60015E get_head3961F95C036D "parameterName"
	{
		// -beg- preserve=no 3961FA60015E get_body3961F95C036D "parameterName"
		return parameterName;
		// -end- 3961FA60015E get_body3961F95C036D "parameterName"
	}

	/**
	 * set current value of parameterName
	 * 
	 * @see #getParameterName
	 */
	// -beg- preserve=no 3961FA60015E set_head3961F95C036D "parameterName"
	public void setParameterName(NlsString value1)
	// -end- 3961FA60015E set_head3961F95C036D "parameterName"
	{
		// -beg- preserve=no 3961FA60015E set_body3961F95C036D "parameterName"
		if (parameterName != value1 && (parameterName == null || !parameterName.equals(value1))) {
			parameterName = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setParameterName"));
		}
		// -end- 3961FA60015E set_body3961F95C036D "parameterName"
	}

	// -beg- preserve=no 3961FC0401A8 var3961F95C036D "kind"
	private int kind;
	// -end- 3961FC0401A8 var3961F95C036D "kind"

	/**
	 * get current value of kind CONSTANT, ATTRIBUTE oder ENUM
	 * 
	 * @see ch.ehi.interlis.graphicdescriptions.SigAssignmentKind
	 * @see #setKind
	 */
	// -beg- preserve=no 3961FC0401A8 get_head3961F95C036D "kind"
	public int getKind()
	// -end- 3961FC0401A8 get_head3961F95C036D "kind"
	{
		// -beg- preserve=no 3961FC0401A8 get_body3961F95C036D "kind"
		return kind;
		// -end- 3961FC0401A8 get_body3961F95C036D "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.graphicdescriptions.SigAssignmentKind
	 * @see #getKind
	 */
	// -beg- preserve=no 3961FC0401A8 set_head3961F95C036D "kind"
	public void setKind(int value1)
	// -end- 3961FC0401A8 set_head3961F95C036D "kind"
	{
		// -beg- preserve=no 3961FC0401A8 set_body3961F95C036D "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 3961FC0401A8 set_body3961F95C036D "kind"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3961F95C036D detail_end "SigAssignment"

	// -end- 3961F95C036D detail_end "SigAssignment"

}
