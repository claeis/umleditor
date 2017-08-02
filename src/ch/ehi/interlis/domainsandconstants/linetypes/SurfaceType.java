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

// -beg- preserve=no 358A65100028 package "SurfaceType"
package ch.ehi.interlis.domainsandconstants.linetypes;
// -end- 358A65100028 package "SurfaceType"

// -beg- preserve=no 358A65100028 autoimport "SurfaceType"
import ch.ehi.interlis.domainsandconstants.linetypes.LineType;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A65100028 autoimport "SurfaceType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A65100028 import "SurfaceType"

// -end- 358A65100028 import "SurfaceType"

/**
 * Grundeigenschaften von flächenorientierten Datentypen.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:45 $
 */
public abstract class SurfaceType extends LineType implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A65100028 detail_begin "SurfaceType"

	// -end- 358A65100028 detail_begin "SurfaceType"

	// -beg- preserve=no 3D4FA21B02E7 head358A65100028 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B02E7 head358A65100028 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B02E7 throws358A65100028 "unlinkAll"

	// -end- 3D4FA21B02E7 throws358A65100028 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B02E7 body358A65100028 "unlinkAll"

		detachLinattrDef();
		detachLinAttrDef();
		super.unlinkAll();
		// -end- 3D4FA21B02E7 body358A65100028 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B02F1 head358A65100028 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B02F1 head358A65100028 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B02F1 throws358A65100028 "enumerateChildren"

	// -end- 3D4FA21B02F1 throws358A65100028 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B02F1 body358A65100028 "enumerateChildren"
		java.util.Iterator it = null;
		if (containsLinattrDef())
			visitor.visit(getLinattrDef());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B02F1 body358A65100028 "enumerateChildren"
	}

	// -beg- preserve=no 358A714E033C code358A65100028 "linattrDef"
	private AttributeDef linattrDef;
	// -end- 358A714E033C code358A65100028 "linattrDef"

	/**
	 * attaches a LinattrDef.
	 *
	 * @see #detachLinattrDef
	 * @see #getLinattrDef
	 * @see #containsLinattrDef
	 */
	// -beg- preserve=no 358A714E033C attach_head358A65100028
	// "SurfaceType::attachLinattrDef"
	public void attachLinattrDef(AttributeDef linattrDef1)
	// -end- 358A714E033C attach_head358A65100028
	// "SurfaceType::attachLinattrDef"
	{
		// -beg- preserve=no 358A714E033C attach_body358A65100028
		// "SurfaceType::attachLinattrDef"
		if (linattrDef != null) {
			throw new java.lang.IllegalStateException("already a linattrDef attached");
		}
		if (linattrDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as linattrDef");
		}
		linattrDef = linattrDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachLinattrDef"));
		return;
		// -end- 358A714E033C attach_body358A65100028
		// "SurfaceType::attachLinattrDef"
	}

	/**
	 * disconnect the currently attached LinattrDef.
	 * 
	 * @see #attachLinattrDef
	 */
	// -beg- preserve=no 358A714E033C detach_head358A65100028
	// "SurfaceType::detachLinattrDef"
	public AttributeDef detachLinattrDef()
	// -end- 358A714E033C detach_head358A65100028
	// "SurfaceType::detachLinattrDef"
	{
		// -beg- preserve=no 358A714E033C detach_body358A65100028
		// "SurfaceType::detachLinattrDef"
		AttributeDef ret = null;
		ret = linattrDef;
		linattrDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachLinattrDef"));
		return ret;
		// -end- 358A714E033C detach_body358A65100028
		// "SurfaceType::detachLinattrDef"
	}

	/**
	 * get the currently attached LinattrDef.
	 * 
	 * @see #attachLinattrDef
	 */
	// -beg- preserve=no 358A714E033C get_head358A65100028
	// "SurfaceType::getLinattrDef"
	public AttributeDef getLinattrDef()
	// -end- 358A714E033C get_head358A65100028 "SurfaceType::getLinattrDef"
	{
		// -beg- preserve=no 358A714E033C get_body358A65100028
		// "SurfaceType::getLinattrDef"
		if (linattrDef == null) {
			throw new java.lang.IllegalStateException("no linattrDef attached");
		}
		return linattrDef;
		// -end- 358A714E033C get_body358A65100028 "SurfaceType::getLinattrDef"
	}

	/**
	 * tests if there is a LinattrDef attached.
	 * 
	 * @see #attachLinattrDef
	 */
	// -beg- preserve=no 358A714E033C test_head358A65100028
	// "SurfaceType::containsLinattrDef"
	public boolean containsLinattrDef()
	// -end- 358A714E033C test_head358A65100028
	// "SurfaceType::containsLinattrDef"
	{
		// -beg- preserve=no 358A714E033C test_body358A65100028
		// "SurfaceType::containsLinattrDef"
		return linattrDef != null;
		// -end- 358A714E033C test_body358A65100028
		// "SurfaceType::containsLinattrDef"
	}

	// -beg- preserve=no 3948F2A001D7 code358A65100028 "linAttrDef"
	private ClassDef linAttrDef;
	// -end- 3948F2A001D7 code358A65100028 "linAttrDef"

	/**
	 * attaches a LinAttrDef.
	 *
	 * @see #detachLinAttrDef
	 * @see #getLinAttrDef
	 * @see #containsLinAttrDef
	 */
	// -beg- preserve=no 3948F2A001D7 attach_head358A65100028
	// "SurfaceType::attachLinAttrDef"
	public void attachLinAttrDef(ClassDef linAttrDef1)
	// -end- 3948F2A001D7 attach_head358A65100028
	// "SurfaceType::attachLinAttrDef"
	{
		// -beg- preserve=no 3948F2A001D7 attach_body358A65100028
		// "SurfaceType::attachLinAttrDef"
		if (linAttrDef != null) {
			throw new java.lang.IllegalStateException("already a linAttrDef attached");
		}
		if (linAttrDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as linAttrDef");
		}
		linAttrDef = linAttrDef1;
		linAttrDef1._linkSurfaceType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachLinAttrDef"));
		return;
		// -end- 3948F2A001D7 attach_body358A65100028
		// "SurfaceType::attachLinAttrDef"
	}

	/**
	 * disconnect the currently attached LinAttrDef.
	 * 
	 * @see #attachLinAttrDef
	 */
	// -beg- preserve=no 3948F2A001D7 detach_head358A65100028
	// "SurfaceType::detachLinAttrDef"
	public ClassDef detachLinAttrDef()
	// -end- 3948F2A001D7 detach_head358A65100028
	// "SurfaceType::detachLinAttrDef"
	{
		// -beg- preserve=no 3948F2A001D7 detach_body358A65100028
		// "SurfaceType::detachLinAttrDef"
		ClassDef ret = null;
		if (linAttrDef != null) {
			linAttrDef._unlinkSurfaceType(this);
			ret = linAttrDef;
			linAttrDef = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachLinAttrDef"));
		return ret;
		// -end- 3948F2A001D7 detach_body358A65100028
		// "SurfaceType::detachLinAttrDef"
	}

	/**
	 * get the currently attached LinAttrDef.
	 * 
	 * @see #attachLinAttrDef
	 */
	// -beg- preserve=no 3948F2A001D7 get_head358A65100028
	// "SurfaceType::getLinAttrDef"
	public ClassDef getLinAttrDef()
	// -end- 3948F2A001D7 get_head358A65100028 "SurfaceType::getLinAttrDef"
	{
		// -beg- preserve=no 3948F2A001D7 get_body358A65100028
		// "SurfaceType::getLinAttrDef"
		if (linAttrDef == null) {
			throw new java.lang.IllegalStateException("no linAttrDef attached");
		}
		return linAttrDef;
		// -end- 3948F2A001D7 get_body358A65100028 "SurfaceType::getLinAttrDef"
	}

	/**
	 * tests if there is a LinAttrDef attached.
	 * 
	 * @see #attachLinAttrDef
	 */
	// -beg- preserve=no 3948F2A001D7 test_head358A65100028
	// "SurfaceType::containsLinAttrDef"
	public boolean containsLinAttrDef()
	// -end- 3948F2A001D7 test_head358A65100028
	// "SurfaceType::containsLinAttrDef"
	{
		// -beg- preserve=no 3948F2A001D7 test_body358A65100028
		// "SurfaceType::containsLinAttrDef"
		return linAttrDef != null;
		// -end- 3948F2A001D7 test_body358A65100028
		// "SurfaceType::containsLinAttrDef"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3948F2A001D7 _link_body358A65100028
	// "SurfaceType::_linkLinAttrDef"
	public void _linkLinAttrDef(ClassDef linAttrDef1) {
		linAttrDef = linAttrDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkLinAttrDef"));
		return;
	}
	// -end- 3948F2A001D7 _link_body358A65100028 "SurfaceType::_linkLinAttrDef"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3948F2A001D7 _unlink_body358A65100028
	// "SurfaceType::_unlinkLinAttrDef"
	public void _unlinkLinAttrDef(ClassDef linAttrDef1) {
		linAttrDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkLinAttrDef"));
		return;
	}
	// -end- 3948F2A001D7 _unlink_body358A65100028
	// "SurfaceType::_unlinkLinAttrDef"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A65100028 detail_end "SurfaceType"

	// -end- 358A65100028 detail_end "SurfaceType"

}
