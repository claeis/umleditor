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

// -beg- preserve=no 358A66E4034C package "Angle"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 358A66E4034C package "Angle"

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A66E4034C autoimport "Angle"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A66E4034C import "Angle"

// -end- 358A66E4034C import "Angle"

/**
 * Wird nur in INTERLIS1 verwendet.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:08 $
 */
public class Angle extends BaseType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A66E4034C detail_begin "Angle"

	// -end- 358A66E4034C detail_begin "Angle"

	private static final long serialVersionUID = 7247894787746309411L;

	// -beg- preserve=no 3D4FA21B0053 head358A66E4034C "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0053 head358A66E4034C "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0053 throws358A66E4034C "unlinkAll"

	// -end- 3D4FA21B0053 throws358A66E4034C "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0053 body358A66E4034C "unlinkAll"

		setMini(null);
		setMaxi(null);
		super.unlinkAll();
		// -end- 3D4FA21B0053 body358A66E4034C "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B0054 head358A66E4034C "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B0054 head358A66E4034C "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0054 throws358A66E4034C "enumerateChildren"

	// -end- 3D4FA21B0054 throws358A66E4034C "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0054 body358A66E4034C "enumerateChildren"
		Iterator it = null;
		visitor.visit(getMini());
		visitor.visit(getMaxi());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B0054 body358A66E4034C "enumerateChildren"
	}

	// -beg- preserve=no 358A68AF032E var358A66E4034C "kind"
	private int kind;
	// -end- 358A68AF032E var358A66E4034C "kind"

	/**
	 * get current value of kind RADIANS, GRADS oder DEGREES
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.AngleKind
	 * @see #setKind
	 */
	// -beg- preserve=no 358A68AF032E get_head358A66E4034C "kind"
	public int getKind()
	// -end- 358A68AF032E get_head358A66E4034C "kind"
	{
		// -beg- preserve=no 358A68AF032E get_body358A66E4034C "kind"
		return kind;
		// -end- 358A68AF032E get_body358A66E4034C "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.domainsandconstants.basetypes.AngleKind
	 * @see #getKind
	 */
	// -beg- preserve=no 358A68AF032E set_head358A66E4034C "kind"
	public void setKind(int value1)
	// -end- 358A68AF032E set_head358A66E4034C "kind"
	{
		// -beg- preserve=no 358A68AF032E set_body358A66E4034C "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 358A68AF032E set_body358A66E4034C "kind"
	}

	// -beg- preserve=no 358A68B40354 var358A66E4034C "mini"
	private IliDim mini = null;
	// -end- 358A68B40354 var358A66E4034C "mini"

	/**
	 * get current value of mini min Winkelmass
	 * 
	 * @see #setMini
	 */
	// -beg- preserve=no 358A68B40354 get_head358A66E4034C "mini"
	public IliDim getMini()
	// -end- 358A68B40354 get_head358A66E4034C "mini"
	{
		// -beg- preserve=no 358A68B40354 get_body358A66E4034C "mini"
		return mini;
		// -end- 358A68B40354 get_body358A66E4034C "mini"
	}

	/**
	 * set current value of mini
	 * 
	 * @see #getMini
	 */
	// -beg- preserve=no 358A68B40354 set_head358A66E4034C "mini"
	public void setMini(IliDim value1)
	// -end- 358A68B40354 set_head358A66E4034C "mini"
	{
		// -beg- preserve=no 358A68B40354 set_body358A66E4034C "mini"
		if (mini != value1 && (mini == null || !mini.equals(value1))) {
			mini = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMini"));
		}
		// -end- 358A68B40354 set_body358A66E4034C "mini"
	}

	// -beg- preserve=no 358A68B803B4 var358A66E4034C "maxi"
	private IliDim maxi = null;
	// -end- 358A68B803B4 var358A66E4034C "maxi"

	/**
	 * get current value of maxi max Winkelmass
	 * 
	 * @see #setMaxi
	 */
	// -beg- preserve=no 358A68B803B4 get_head358A66E4034C "maxi"
	public IliDim getMaxi()
	// -end- 358A68B803B4 get_head358A66E4034C "maxi"
	{
		// -beg- preserve=no 358A68B803B4 get_body358A66E4034C "maxi"
		return maxi;
		// -end- 358A68B803B4 get_body358A66E4034C "maxi"
	}

	/**
	 * set current value of maxi
	 * 
	 * @see #getMaxi
	 */
	// -beg- preserve=no 358A68B803B4 set_head358A66E4034C "maxi"
	public void setMaxi(IliDim value1)
	// -end- 358A68B803B4 set_head358A66E4034C "maxi"
	{
		// -beg- preserve=no 358A68B803B4 set_body358A66E4034C "maxi"
		if (maxi != value1 && (maxi == null || !maxi.equals(value1))) {
			maxi = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMaxi"));
		}
		// -end- 358A68B803B4 set_body358A66E4034C "maxi"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A66E4034C detail_end "Angle"

	// -end- 358A66E4034C detail_end "Angle"

}
