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

// -beg- preserve=no 3960A740025A package "AttributeRef"
package ch.ehi.interlis.logicalexpressions;
// -end- 3960A740025A package "AttributeRef"

// -beg- preserve=no 3960A740025A autoimport "AttributeRef"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.logicalexpressions.AttributeRefKind;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3960A740025A autoimport "AttributeRef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3960A740025A import "AttributeRef"

// -end- 3960A740025A import "AttributeRef"

/**
 * Verweist auf ein Attribut.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:01 $
 */
public class AttributeRef extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3960A740025A detail_begin "AttributeRef"

	// -end- 3960A740025A detail_begin "AttributeRef"

	private static final long serialVersionUID = 1954208701386047379L;

	// -beg- preserve=no 3D4FA21802BB head3960A740025A "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21802BB head3960A740025A "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21802BB throws3960A740025A "unlinkAll"

	// -end- 3D4FA21802BB throws3960A740025A "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21802BB body3960A740025A "unlinkAll"

		// Role AttributePath: AttributePath object(s) may point to this
		setAttribute(null);
		super.unlinkAll();
		// -end- 3D4FA21802BB body3960A740025A "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21802BC head3960A740025A "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21802BC head3960A740025A "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21802BC throws3960A740025A "enumerateChildren"

	// -end- 3D4FA21802BC throws3960A740025A "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21802BC body3960A740025A "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getAttribute());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21802BC body3960A740025A "enumerateChildren"
	}

	// -beg- preserve=no 3960ACA10123 var3960A740025A "kind"
	private int kind;
	// -end- 3960ACA10123 var3960A740025A "kind"

	/**
	 * get current value of kind ATTRNAME, THISAREA, THATAREA, OBJECT, PARENT
	 * oder AXIS
	 * 
	 * @see ch.ehi.interlis.logicalexpressions.AttributeRefKind
	 * @see #setKind
	 */
	// -beg- preserve=no 3960ACA10123 get_head3960A740025A "kind"
	public int getKind()
	// -end- 3960ACA10123 get_head3960A740025A "kind"
	{
		// -beg- preserve=no 3960ACA10123 get_body3960A740025A "kind"
		return kind;
		// -end- 3960ACA10123 get_body3960A740025A "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.logicalexpressions.AttributeRefKind
	 * @see #getKind
	 */
	// -beg- preserve=no 3960ACA10123 set_head3960A740025A "kind"
	public void setKind(int value1)
	// -end- 3960ACA10123 set_head3960A740025A "kind"
	{
		// -beg- preserve=no 3960ACA10123 set_body3960A740025A "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 3960ACA10123 set_body3960A740025A "kind"
	}

	// -beg- preserve=no 3960ACA900C1 var3960A740025A "attribute"
	private NlsString attribute = null;
	// -end- 3960ACA900C1 var3960A740025A "attribute"

	/**
	 * get current value of attribute Name des Attributs wenn kind==ATTRNAME
	 * 
	 * @see #setAttribute
	 */
	// -beg- preserve=no 3960ACA900C1 get_head3960A740025A "attribute"
	public NlsString getAttribute()
	// -end- 3960ACA900C1 get_head3960A740025A "attribute"
	{
		// -beg- preserve=no 3960ACA900C1 get_body3960A740025A "attribute"
		return attribute;
		// -end- 3960ACA900C1 get_body3960A740025A "attribute"
	}

	/**
	 * set current value of attribute
	 * 
	 * @see #getAttribute
	 */
	// -beg- preserve=no 3960ACA900C1 set_head3960A740025A "attribute"
	public void setAttribute(NlsString value1)
	// -end- 3960ACA900C1 set_head3960A740025A "attribute"
	{
		// -beg- preserve=no 3960ACA900C1 set_body3960A740025A "attribute"
		if (attribute != value1 && (attribute == null || !attribute.equals(value1))) {
			attribute = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAttribute"));
		}
		// -end- 3960ACA900C1 set_body3960A740025A "attribute"
	}

	// -beg- preserve=no 3960ACAF02E6 var3960A740025A "axis"
	private long axis;
	// -end- 3960ACAF02E6 var3960A740025A "axis"

	/**
	 * get current value of axis Nummer der Achse wenn kind==AXIS
	 * 
	 * @see #setAxis
	 */
	// -beg- preserve=no 3960ACAF02E6 get_head3960A740025A "axis"
	public long getAxis()
	// -end- 3960ACAF02E6 get_head3960A740025A "axis"
	{
		// -beg- preserve=no 3960ACAF02E6 get_body3960A740025A "axis"
		return axis;
		// -end- 3960ACAF02E6 get_body3960A740025A "axis"
	}

	/**
	 * set current value of axis
	 * 
	 * @see #getAxis
	 */
	// -beg- preserve=no 3960ACAF02E6 set_head3960A740025A "axis"
	public void setAxis(long value1)
	// -end- 3960ACAF02E6 set_head3960A740025A "axis"
	{
		// -beg- preserve=no 3960ACAF02E6 set_body3960A740025A "axis"
		if (axis != value1) {
			axis = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAxis"));
		}
		// -end- 3960ACAF02E6 set_body3960A740025A "axis"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3960A740025A detail_end "AttributeRef"

	// -end- 3960A740025A detail_end "AttributeRef"

}
