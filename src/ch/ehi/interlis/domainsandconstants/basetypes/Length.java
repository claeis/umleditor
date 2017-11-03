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

// -beg- preserve=no 358A66D90315 package "Length"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 358A66D90315 package "Length"

// -beg- preserve=no 358A66D90315 autoimport "Length"
import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A66D90315 autoimport "Length"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A66D90315 import "Length"

// -end- 358A66D90315 import "Length"

/**
 * Wird nur in INTERLIS1 verwendet.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:22 $
 */
public class Length extends BaseType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A66D90315 detail_begin "Length"

	// -end- 358A66D90315 detail_begin "Length"

	private static final long serialVersionUID = 7279310015588473320L;

	// -beg- preserve=no 3D4FA21B0040 head358A66D90315 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0040 head358A66D90315 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0040 throws358A66D90315 "unlinkAll"

	// -end- 3D4FA21B0040 throws358A66D90315 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0040 body358A66D90315 "unlinkAll"

		setMini(null);
		setMaxi(null);
		super.unlinkAll();
		// -end- 3D4FA21B0040 body358A66D90315 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B0048 head358A66D90315 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B0048 head358A66D90315 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0048 throws358A66D90315 "enumerateChildren"

	// -end- 3D4FA21B0048 throws358A66D90315 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0048 body358A66D90315 "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getMini());
		visitor.visit(getMaxi());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B0048 body358A66D90315 "enumerateChildren"
	}

	// -beg- preserve=no 358A688A037B var358A66D90315 "mini"
	private IliDim mini = null;
	// -end- 358A688A037B var358A66D90315 "mini"

	/**
	 * get current value of mini min Längenmass
	 * 
	 * @see #setMini
	 */
	// -beg- preserve=no 358A688A037B get_head358A66D90315 "mini"
	public IliDim getMini()
	// -end- 358A688A037B get_head358A66D90315 "mini"
	{
		// -beg- preserve=no 358A688A037B get_body358A66D90315 "mini"
		return mini;
		// -end- 358A688A037B get_body358A66D90315 "mini"
	}

	/**
	 * set current value of mini
	 * 
	 * @see #getMini
	 */
	// -beg- preserve=no 358A688A037B set_head358A66D90315 "mini"
	public void setMini(IliDim value1)
	// -end- 358A688A037B set_head358A66D90315 "mini"
	{
		// -beg- preserve=no 358A688A037B set_body358A66D90315 "mini"
		if (mini != value1 && (mini == null || !mini.equals(value1))) {
			mini = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMini"));
		}
		// -end- 358A688A037B set_body358A66D90315 "mini"
	}

	// -beg- preserve=no 358A68930310 var358A66D90315 "maxi"
	private IliDim maxi = null;
	// -end- 358A68930310 var358A66D90315 "maxi"

	/**
	 * get current value of maxi max Längenmass
	 * 
	 * @see #setMaxi
	 */
	// -beg- preserve=no 358A68930310 get_head358A66D90315 "maxi"
	public IliDim getMaxi()
	// -end- 358A68930310 get_head358A66D90315 "maxi"
	{
		// -beg- preserve=no 358A68930310 get_body358A66D90315 "maxi"
		return maxi;
		// -end- 358A68930310 get_body358A66D90315 "maxi"
	}

	/**
	 * set current value of maxi
	 * 
	 * @see #getMaxi
	 */
	// -beg- preserve=no 358A68930310 set_head358A66D90315 "maxi"
	public void setMaxi(IliDim value1)
	// -end- 358A68930310 set_head358A66D90315 "maxi"
	{
		// -beg- preserve=no 358A68930310 set_body358A66D90315 "maxi"
		if (maxi != value1 && (maxi == null || !maxi.equals(value1))) {
			maxi = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMaxi"));
		}
		// -end- 358A68930310 set_body358A66D90315 "maxi"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A66D90315 detail_end "Length"

	// -end- 358A66D90315 detail_end "Length"

}
