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

// -beg- preserve=no 358A65070007 package "LineType"
package ch.ehi.interlis.domainsandconstants.linetypes;
// -end- 358A65070007 package "LineType"

// -beg- preserve=no 358A65070007 autoimport "LineType"
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.domainsandconstants.linetypes.Ili1ControlPoints;
import ch.ehi.interlis.domainsandconstants.linetypes.IntersectionDef;
import ch.ehi.interlis.domainsandconstants.linetypes.LineForm;
import ch.ehi.interlis.domainsandconstants.DomainDef;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A65070007 autoimport "LineType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A65070007 import "LineType"

// -end- 358A65070007 import "LineType"

/**
 * Grundeigenschaften von linienorientierten Datentypen.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:44 $
 */
public abstract class LineType extends Type implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A65070007 detail_begin "LineType"

	// -end- 358A65070007 detail_begin "LineType"

	private static final long serialVersionUID = 5938632687112531417L;

	// -beg- preserve=no 3D4FA21B02D3 head358A65070007 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B02D3 head358A65070007 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B02D3 throws358A65070007 "unlinkAll"

	// -end- 3D4FA21B02D3 throws358A65070007 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B02D3 body358A65070007 "unlinkAll"

		detachIli1ControlPoints();
		detachIntersectionDef();
		detachLineForm();
		detachControlpoints();
		super.unlinkAll();
		// -end- 3D4FA21B02D3 body358A65070007 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B02D4 head358A65070007 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B02D4 head358A65070007 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B02D4 throws358A65070007 "enumerateChildren"

	// -end- 3D4FA21B02D4 throws358A65070007 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B02D4 body358A65070007 "enumerateChildren"
		Iterator<?> it = null;
		if (containsIli1ControlPoints())
			visitor.visit(getIli1ControlPoints());
		if (containsIntersectionDef())
			visitor.visit(getIntersectionDef());
		if (containsLineForm())
			visitor.visit(getLineForm());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B02D4 body358A65070007 "enumerateChildren"
	}

	// -beg- preserve=no 358A6CE902E4 code358A65070007 "ili1ControlPoints"
	private Ili1ControlPoints ili1ControlPoints;
	// -end- 358A6CE902E4 code358A65070007 "ili1ControlPoints"

	/**
	 * attaches a Ili1ControlPoints.
	 *
	 * @see #detachIli1ControlPoints
	 * @see #getIli1ControlPoints
	 * @see #containsIli1ControlPoints
	 */
	// -beg- preserve=no 358A6CE902E4 attach_head358A65070007
	// "LineType::attachIli1ControlPoints"
	public void attachIli1ControlPoints(Ili1ControlPoints ili1ControlPoints1)
	// -end- 358A6CE902E4 attach_head358A65070007
	// "LineType::attachIli1ControlPoints"
	{
		// -beg- preserve=no 358A6CE902E4 attach_body358A65070007
		// "LineType::attachIli1ControlPoints"
		if (ili1ControlPoints != null) {
			throw new java.lang.IllegalStateException("already a ili1ControlPoints attached");
		}
		if (ili1ControlPoints1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as ili1ControlPoints");
		}
		ili1ControlPoints = ili1ControlPoints1;
		ili1ControlPoints1._linkLineType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachIli1ControlPoints"));
		return;
		// -end- 358A6CE902E4 attach_body358A65070007
		// "LineType::attachIli1ControlPoints"
	}

	/**
	 * disconnect the currently attached Ili1ControlPoints.
	 * 
	 * @see #attachIli1ControlPoints
	 */
	// -beg- preserve=no 358A6CE902E4 detach_head358A65070007
	// "LineType::detachIli1ControlPoints"
	public Ili1ControlPoints detachIli1ControlPoints()
	// -end- 358A6CE902E4 detach_head358A65070007
	// "LineType::detachIli1ControlPoints"
	{
		// -beg- preserve=no 358A6CE902E4 detach_body358A65070007
		// "LineType::detachIli1ControlPoints"
		Ili1ControlPoints ret = null;
		if (ili1ControlPoints != null) {
			ili1ControlPoints._unlinkLineType(this);
			ret = ili1ControlPoints;
			ili1ControlPoints = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachIli1ControlPoints"));
		return ret;
		// -end- 358A6CE902E4 detach_body358A65070007
		// "LineType::detachIli1ControlPoints"
	}

	/**
	 * get the currently attached Ili1ControlPoints.
	 * 
	 * @see #attachIli1ControlPoints
	 */
	// -beg- preserve=no 358A6CE902E4 get_head358A65070007
	// "LineType::getIli1ControlPoints"
	public Ili1ControlPoints getIli1ControlPoints()
	// -end- 358A6CE902E4 get_head358A65070007 "LineType::getIli1ControlPoints"
	{
		// -beg- preserve=no 358A6CE902E4 get_body358A65070007
		// "LineType::getIli1ControlPoints"
		if (ili1ControlPoints == null) {
			throw new java.lang.IllegalStateException("no ili1ControlPoints attached");
		}
		return ili1ControlPoints;
		// -end- 358A6CE902E4 get_body358A65070007
		// "LineType::getIli1ControlPoints"
	}

	/**
	 * tests if there is a Ili1ControlPoints attached.
	 * 
	 * @see #attachIli1ControlPoints
	 */
	// -beg- preserve=no 358A6CE902E4 test_head358A65070007
	// "LineType::containsIli1ControlPoints"
	public boolean containsIli1ControlPoints()
	// -end- 358A6CE902E4 test_head358A65070007
	// "LineType::containsIli1ControlPoints"
	{
		// -beg- preserve=no 358A6CE902E4 test_body358A65070007
		// "LineType::containsIli1ControlPoints"
		return ili1ControlPoints != null;
		// -end- 358A6CE902E4 test_body358A65070007
		// "LineType::containsIli1ControlPoints"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A6CE902E4 _link_body358A65070007
	// "LineType::_linkIli1ControlPoints"
	public void _linkIli1ControlPoints(Ili1ControlPoints ili1ControlPoints1) {
		ili1ControlPoints = ili1ControlPoints1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkIli1ControlPoints"));
		return;
	}
	// -end- 358A6CE902E4 _link_body358A65070007
	// "LineType::_linkIli1ControlPoints"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A6CE902E4 _unlink_body358A65070007
	// "LineType::_unlinkIli1ControlPoints"
	public void _unlinkIli1ControlPoints(Ili1ControlPoints ili1ControlPoints1) {
		ili1ControlPoints = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkIli1ControlPoints"));
		return;
	}
	// -end- 358A6CE902E4 _unlink_body358A65070007
	// "LineType::_unlinkIli1ControlPoints"

	// -beg- preserve=no 35B8730B01B2 code358A65070007 "intersectionDef"
	private IntersectionDef intersectionDef;
	// -end- 35B8730B01B2 code358A65070007 "intersectionDef"

	/**
	 * attaches a IntersectionDef.
	 *
	 * @see #detachIntersectionDef
	 * @see #getIntersectionDef
	 * @see #containsIntersectionDef
	 */
	// -beg- preserve=no 35B8730B01B2 attach_head358A65070007
	// "LineType::attachIntersectionDef"
	public void attachIntersectionDef(IntersectionDef intersectionDef1)
	// -end- 35B8730B01B2 attach_head358A65070007
	// "LineType::attachIntersectionDef"
	{
		// -beg- preserve=no 35B8730B01B2 attach_body358A65070007
		// "LineType::attachIntersectionDef"
		if (intersectionDef != null) {
			throw new java.lang.IllegalStateException("already a intersectionDef attached");
		}
		if (intersectionDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as intersectionDef");
		}
		intersectionDef = intersectionDef1;
		intersectionDef1._linkLineType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachIntersectionDef"));
		return;
		// -end- 35B8730B01B2 attach_body358A65070007
		// "LineType::attachIntersectionDef"
	}

	/**
	 * disconnect the currently attached IntersectionDef.
	 * 
	 * @see #attachIntersectionDef
	 */
	// -beg- preserve=no 35B8730B01B2 detach_head358A65070007
	// "LineType::detachIntersectionDef"
	public IntersectionDef detachIntersectionDef()
	// -end- 35B8730B01B2 detach_head358A65070007
	// "LineType::detachIntersectionDef"
	{
		// -beg- preserve=no 35B8730B01B2 detach_body358A65070007
		// "LineType::detachIntersectionDef"
		IntersectionDef ret = null;
		if (intersectionDef != null) {
			intersectionDef._unlinkLineType(this);
			ret = intersectionDef;
			intersectionDef = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachIntersectionDef"));
		return ret;
		// -end- 35B8730B01B2 detach_body358A65070007
		// "LineType::detachIntersectionDef"
	}

	/**
	 * get the currently attached IntersectionDef.
	 * 
	 * @see #attachIntersectionDef
	 */
	// -beg- preserve=no 35B8730B01B2 get_head358A65070007
	// "LineType::getIntersectionDef"
	public IntersectionDef getIntersectionDef()
	// -end- 35B8730B01B2 get_head358A65070007 "LineType::getIntersectionDef"
	{
		// -beg- preserve=no 35B8730B01B2 get_body358A65070007
		// "LineType::getIntersectionDef"
		if (intersectionDef == null) {
			throw new java.lang.IllegalStateException("no intersectionDef attached");
		}
		return intersectionDef;
		// -end- 35B8730B01B2 get_body358A65070007
		// "LineType::getIntersectionDef"
	}

	/**
	 * tests if there is a IntersectionDef attached.
	 * 
	 * @see #attachIntersectionDef
	 */
	// -beg- preserve=no 35B8730B01B2 test_head358A65070007
	// "LineType::containsIntersectionDef"
	public boolean containsIntersectionDef()
	// -end- 35B8730B01B2 test_head358A65070007
	// "LineType::containsIntersectionDef"
	{
		// -beg- preserve=no 35B8730B01B2 test_body358A65070007
		// "LineType::containsIntersectionDef"
		return intersectionDef != null;
		// -end- 35B8730B01B2 test_body358A65070007
		// "LineType::containsIntersectionDef"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35B8730B01B2 _link_body358A65070007
	// "LineType::_linkIntersectionDef"
	public void _linkIntersectionDef(IntersectionDef intersectionDef1) {
		intersectionDef = intersectionDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkIntersectionDef"));
		return;
	}
	// -end- 35B8730B01B2 _link_body358A65070007
	// "LineType::_linkIntersectionDef"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35B8730B01B2 _unlink_body358A65070007
	// "LineType::_unlinkIntersectionDef"
	public void _unlinkIntersectionDef(IntersectionDef intersectionDef1) {
		intersectionDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkIntersectionDef"));
		return;
	}
	// -end- 35B8730B01B2 _unlink_body358A65070007
	// "LineType::_unlinkIntersectionDef"

	// -beg- preserve=no 35FB9EE500EA code358A65070007 "lineForm"
	private LineForm lineForm;
	// -end- 35FB9EE500EA code358A65070007 "lineForm"

	/**
	 * attaches a LineForm.
	 *
	 * @see #detachLineForm
	 * @see #getLineForm
	 * @see #containsLineForm
	 */
	// -beg- preserve=no 35FB9EE500EA attach_head358A65070007
	// "LineType::attachLineForm"
	public void attachLineForm(LineForm lineForm1)
	// -end- 35FB9EE500EA attach_head358A65070007 "LineType::attachLineForm"
	{
		// -beg- preserve=no 35FB9EE500EA attach_body358A65070007
		// "LineType::attachLineForm"
		if (lineForm != null) {
			throw new java.lang.IllegalStateException("already a lineForm attached");
		}
		if (lineForm1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as lineForm");
		}
		lineForm = lineForm1;
		lineForm1._linkLineType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachLineForm"));
		return;
		// -end- 35FB9EE500EA attach_body358A65070007 "LineType::attachLineForm"
	}

	/**
	 * disconnect the currently attached LineForm.
	 * 
	 * @see #attachLineForm
	 */
	// -beg- preserve=no 35FB9EE500EA detach_head358A65070007
	// "LineType::detachLineForm"
	public LineForm detachLineForm()
	// -end- 35FB9EE500EA detach_head358A65070007 "LineType::detachLineForm"
	{
		// -beg- preserve=no 35FB9EE500EA detach_body358A65070007
		// "LineType::detachLineForm"
		LineForm ret = null;
		if (lineForm != null) {
			lineForm._unlinkLineType(this);
			ret = lineForm;
			lineForm = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachLineForm"));
		return ret;
		// -end- 35FB9EE500EA detach_body358A65070007 "LineType::detachLineForm"
	}

	/**
	 * get the currently attached LineForm.
	 * 
	 * @see #attachLineForm
	 */
	// -beg- preserve=no 35FB9EE500EA get_head358A65070007
	// "LineType::getLineForm"
	public LineForm getLineForm()
	// -end- 35FB9EE500EA get_head358A65070007 "LineType::getLineForm"
	{
		// -beg- preserve=no 35FB9EE500EA get_body358A65070007
		// "LineType::getLineForm"
		if (lineForm == null) {
			throw new java.lang.IllegalStateException("no lineForm attached");
		}
		return lineForm;
		// -end- 35FB9EE500EA get_body358A65070007 "LineType::getLineForm"
	}

	/**
	 * tests if there is a LineForm attached.
	 * 
	 * @see #attachLineForm
	 */
	// -beg- preserve=no 35FB9EE500EA test_head358A65070007
	// "LineType::containsLineForm"
	public boolean containsLineForm()
	// -end- 35FB9EE500EA test_head358A65070007 "LineType::containsLineForm"
	{
		// -beg- preserve=no 35FB9EE500EA test_body358A65070007
		// "LineType::containsLineForm"
		return lineForm != null;
		// -end- 35FB9EE500EA test_body358A65070007 "LineType::containsLineForm"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FB9EE500EA _link_body358A65070007
	// "LineType::_linkLineForm"
	public void _linkLineForm(LineForm lineForm1) {
		lineForm = lineForm1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkLineForm"));
		return;
	}
	// -end- 35FB9EE500EA _link_body358A65070007 "LineType::_linkLineForm"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35FB9EE500EA _unlink_body358A65070007
	// "LineType::_unlinkLineForm"
	public void _unlinkLineForm(LineForm lineForm1) {
		lineForm = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkLineForm"));
		return;
	}
	// -end- 35FB9EE500EA _unlink_body358A65070007 "LineType::_unlinkLineForm"

	// -beg- preserve=no 3948F00C0231 code358A65070007 "controlpoints"
	private DomainDef controlpoints;
	// -end- 3948F00C0231 code358A65070007 "controlpoints"

	/**
	 * attaches a Controlpoints.
	 *
	 * @see #detachControlpoints
	 * @see #getControlpoints
	 * @see #containsControlpoints
	 */
	// -beg- preserve=no 3948F00C0231 attach_head358A65070007
	// "LineType::attachControlpoints"
	public void attachControlpoints(DomainDef controlpoints1)
	// -end- 3948F00C0231 attach_head358A65070007
	// "LineType::attachControlpoints"
	{
		// -beg- preserve=no 3948F00C0231 attach_body358A65070007
		// "LineType::attachControlpoints"
		if (controlpoints != null) {
			throw new java.lang.IllegalStateException("already a controlpoints attached");
		}
		if (controlpoints1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as controlpoints");
		}
		controlpoints = controlpoints1;
		controlpoints1._linkLineType(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachControlpoints"));
		return;
		// -end- 3948F00C0231 attach_body358A65070007
		// "LineType::attachControlpoints"
	}

	/**
	 * disconnect the currently attached Controlpoints.
	 * 
	 * @see #attachControlpoints
	 */
	// -beg- preserve=no 3948F00C0231 detach_head358A65070007
	// "LineType::detachControlpoints"
	public DomainDef detachControlpoints()
	// -end- 3948F00C0231 detach_head358A65070007
	// "LineType::detachControlpoints"
	{
		// -beg- preserve=no 3948F00C0231 detach_body358A65070007
		// "LineType::detachControlpoints"
		DomainDef ret = null;
		if (controlpoints != null) {
			controlpoints._unlinkLineType(this);
			ret = controlpoints;
			controlpoints = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachControlpoints"));
		return ret;
		// -end- 3948F00C0231 detach_body358A65070007
		// "LineType::detachControlpoints"
	}

	/**
	 * get the currently attached Controlpoints.
	 * 
	 * @see #attachControlpoints
	 */
	// -beg- preserve=no 3948F00C0231 get_head358A65070007
	// "LineType::getControlpoints"
	public DomainDef getControlpoints()
	// -end- 3948F00C0231 get_head358A65070007 "LineType::getControlpoints"
	{
		// -beg- preserve=no 3948F00C0231 get_body358A65070007
		// "LineType::getControlpoints"
		if (controlpoints == null) {
			throw new java.lang.IllegalStateException("no controlpoints attached");
		}
		return controlpoints;
		// -end- 3948F00C0231 get_body358A65070007 "LineType::getControlpoints"
	}

	/**
	 * tests if there is a Controlpoints attached.
	 * 
	 * @see #attachControlpoints
	 */
	// -beg- preserve=no 3948F00C0231 test_head358A65070007
	// "LineType::containsControlpoints"
	public boolean containsControlpoints()
	// -end- 3948F00C0231 test_head358A65070007
	// "LineType::containsControlpoints"
	{
		// -beg- preserve=no 3948F00C0231 test_body358A65070007
		// "LineType::containsControlpoints"
		return controlpoints != null;
		// -end- 3948F00C0231 test_body358A65070007
		// "LineType::containsControlpoints"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3948F00C0231 _link_body358A65070007
	// "LineType::_linkControlpoints"
	public void _linkControlpoints(DomainDef controlpoints1) {
		controlpoints = controlpoints1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkControlpoints"));
		return;
	}
	// -end- 3948F00C0231 _link_body358A65070007 "LineType::_linkControlpoints"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 3948F00C0231 _unlink_body358A65070007
	// "LineType::_unlinkControlpoints"
	public void _unlinkControlpoints(DomainDef controlpoints1) {
		controlpoints = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkControlpoints"));
		return;
	}
	// -end- 3948F00C0231 _unlink_body358A65070007
	// "LineType::_unlinkControlpoints"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A65070007 detail_end "LineType"

	// -end- 358A65070007 detail_end "LineType"

}
