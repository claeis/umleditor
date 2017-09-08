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

// -beg- preserve=no 394887020189 package "BasketType"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 394887020189 package "BasketType"

// -beg- preserve=no 394887020189 autoimport "BasketType"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.domainsandconstants.basetypes.BasketKind;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 394887020189 autoimport "BasketType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394887020189 import "BasketType"

// -end- 394887020189 import "BasketType"

/**
 * Definiert einen Behälterdatentyp.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:10 $
 */
public class BasketType extends BaseType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394887020189 detail_begin "BasketType"

	// -end- 394887020189 detail_begin "BasketType"

	private static final long serialVersionUID = -591529193121633639L;

	// -beg- preserve=no 3D4FA21B0110 head394887020189 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0110 head394887020189 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0110 throws394887020189 "unlinkAll"

	// -end- 3D4FA21B0110 throws394887020189 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0110 body394887020189 "unlinkAll"

		detachBasketSchema();
		super.unlinkAll();
		// -end- 3D4FA21B0110 body394887020189 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B0111 head394887020189 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B0111 head394887020189 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0111 throws394887020189 "enumerateChildren"

	// -end- 3D4FA21B0111 throws394887020189 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0111 body394887020189 "enumerateChildren"
		java.util.Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B0111 body394887020189 "enumerateChildren"
	}

	// -beg- preserve=no 3CC001F302E9 code394887020189 "basketSchema"
	private TopicDef basketSchema;
	// -end- 3CC001F302E9 code394887020189 "basketSchema"

	/**
	 * attaches a BasketSchema.
	 *
	 * @see #detachBasketSchema
	 * @see #getBasketSchema
	 * @see #containsBasketSchema
	 */
	// -beg- preserve=no 3CC001F302E9 attach_head394887020189
	// "BasketType::attachBasketSchema"
	public void attachBasketSchema(TopicDef basketSchema1)
	// -end- 3CC001F302E9 attach_head394887020189
	// "BasketType::attachBasketSchema"
	{
		// -beg- preserve=no 3CC001F302E9 attach_body394887020189
		// "BasketType::attachBasketSchema"
		if (basketSchema != null) {
			throw new java.lang.IllegalStateException("already a basketSchema attached");
		}
		if (basketSchema1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as basketSchema");
		}
		basketSchema = basketSchema1;
		basketSchema1._linkBasketType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachBasketSchema"));
		return;
		// -end- 3CC001F302E9 attach_body394887020189
		// "BasketType::attachBasketSchema"
	}

	/**
	 * disconnect the currently attached BasketSchema.
	 * 
	 * @see #attachBasketSchema
	 */
	// -beg- preserve=no 3CC001F302E9 detach_head394887020189
	// "BasketType::detachBasketSchema"
	public TopicDef detachBasketSchema()
	// -end- 3CC001F302E9 detach_head394887020189
	// "BasketType::detachBasketSchema"
	{
		// -beg- preserve=no 3CC001F302E9 detach_body394887020189
		// "BasketType::detachBasketSchema"
		TopicDef ret = null;
		if (basketSchema != null) {
			basketSchema._unlinkBasketType(this);
			ret = basketSchema;
			basketSchema = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachBasketSchema"));
		return ret;
		// -end- 3CC001F302E9 detach_body394887020189
		// "BasketType::detachBasketSchema"
	}

	/**
	 * get the currently attached BasketSchema.
	 * 
	 * @see #attachBasketSchema
	 */
	// -beg- preserve=no 3CC001F302E9 get_head394887020189
	// "BasketType::getBasketSchema"
	public TopicDef getBasketSchema()
	// -end- 3CC001F302E9 get_head394887020189 "BasketType::getBasketSchema"
	{
		// -beg- preserve=no 3CC001F302E9 get_body394887020189
		// "BasketType::getBasketSchema"
		if (basketSchema == null) {
			throw new java.lang.IllegalStateException("no basketSchema attached");
		}
		return basketSchema;
		// -end- 3CC001F302E9 get_body394887020189 "BasketType::getBasketSchema"
	}

	/**
	 * tests if there is a BasketSchema attached.
	 * 
	 * @see #attachBasketSchema
	 */
	// -beg- preserve=no 3CC001F302E9 test_head394887020189
	// "BasketType::containsBasketSchema"
	public boolean containsBasketSchema()
	// -end- 3CC001F302E9 test_head394887020189
	// "BasketType::containsBasketSchema"
	{
		// -beg- preserve=no 3CC001F302E9 test_body394887020189
		// "BasketType::containsBasketSchema"
		return basketSchema != null;
		// -end- 3CC001F302E9 test_body394887020189
		// "BasketType::containsBasketSchema"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3CC001F302E9 _link_body394887020189
	// "BasketType::_linkBasketSchema"
	public void _linkBasketSchema(TopicDef basketSchema1) {
		basketSchema = basketSchema1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkBasketSchema"));
		return;
	}
	// -end- 3CC001F302E9 _link_body394887020189 "BasketType::_linkBasketSchema"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3CC001F302E9 _unlink_body394887020189
	// "BasketType::_unlinkBasketSchema"
	public void _unlinkBasketSchema(TopicDef basketSchema1) {
		basketSchema = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkBasketSchema"));
		return;
	}
	// -end- 3CC001F302E9 _unlink_body394887020189
	// "BasketType::_unlinkBasketSchema"

	// -beg- preserve=no 3CC0015F0296 var394887020189 "kind"
	private int kind;
	// -end- 3CC0015F0296 var394887020189 "kind"

	/**
	 * get current value of kind defines the kind of basket describted by this
	 * type.
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.BasketKind
	 * @see #setKind
	 */
	// -beg- preserve=no 3CC0015F0296 get_head394887020189 "kind"
	public int getKind()
	// -end- 3CC0015F0296 get_head394887020189 "kind"
	{
		// -beg- preserve=no 3CC0015F0296 get_body394887020189 "kind"
		return kind;
		// -end- 3CC0015F0296 get_body394887020189 "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.BasketKind
	 * @see #getKind
	 */
	// -beg- preserve=no 3CC0015F0296 set_head394887020189 "kind"
	public void setKind(int value1)
	// -end- 3CC0015F0296 set_head394887020189 "kind"
	{
		// -beg- preserve=no 3CC0015F0296 set_body394887020189 "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 3CC0015F0296 set_body394887020189 "kind"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394887020189 detail_end "BasketType"

	// -end- 394887020189 detail_end "BasketType"

}
