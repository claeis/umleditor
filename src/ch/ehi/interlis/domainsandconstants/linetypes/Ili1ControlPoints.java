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

// -beg- preserve=no 358A6CDF004B package "Ili1ControlPoints"
package ch.ehi.interlis.domainsandconstants.linetypes;
// -end- 358A6CDF004B package "Ili1ControlPoints"

// -beg- preserve=no 358A6CDF004B autoimport "Ili1ControlPoints"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.domainsandconstants.linetypes.LineType;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.basics.types.NlsString;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A6CDF004B autoimport "Ili1ControlPoints"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A6CDF004B import "Ili1ControlPoints"

// -end- 358A6CDF004B import "Ili1ControlPoints"

/**
 * Definiert den Wertebereich für die Stützpunkte der Linie.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:36 $
 */
public class Ili1ControlPoints extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A6CDF004B detail_begin "Ili1ControlPoints"

	// -end- 358A6CDF004B detail_begin "Ili1ControlPoints"

	private static final long serialVersionUID = -7793191168531002866L;

	// -beg- preserve=no 3D4FA21B0319 head358A6CDF004B "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B0319 head358A6CDF004B "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B0319 throws358A6CDF004B "unlinkAll"

	// -end- 3D4FA21B0319 throws358A6CDF004B "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B0319 body358A6CDF004B "unlinkAll"

		detachLineType();
		detachCoord();
		setConstraints(null);
		super.unlinkAll();
		// -end- 3D4FA21B0319 body358A6CDF004B "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B031A head358A6CDF004B "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B031A head358A6CDF004B "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B031A throws358A6CDF004B "enumerateChildren"

	// -end- 3D4FA21B031A throws358A6CDF004B "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B031A body358A6CDF004B "enumerateChildren"
		Iterator<?> it = null;
		if (containsCoord())
			visitor.visit(getCoord());
		visitor.visit(getConstraints());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B031A body358A6CDF004B "enumerateChildren"
	}

	// -beg- preserve=no 358A6CE902EE code358A6CDF004B "lineType"
	private LineType lineType;
	// -end- 358A6CE902EE code358A6CDF004B "lineType"

	/**
	 * attaches a LineType.
	 *
	 * @see #detachLineType
	 * @see #getLineType
	 * @see #containsLineType
	 */
	// -beg- preserve=no 358A6CE902EE attach_head358A6CDF004B
	// "Ili1ControlPoints::attachLineType"
	public void attachLineType(LineType lineType1)
	// -end- 358A6CE902EE attach_head358A6CDF004B
	// "Ili1ControlPoints::attachLineType"
	{
		// -beg- preserve=no 358A6CE902EE attach_body358A6CDF004B
		// "Ili1ControlPoints::attachLineType"
		if (lineType != null) {
			throw new java.lang.IllegalStateException("already a lineType attached");
		}
		if (lineType1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as lineType");
		}
		lineType = lineType1;
		lineType1._linkIli1ControlPoints(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachLineType"));
		return;
		// -end- 358A6CE902EE attach_body358A6CDF004B
		// "Ili1ControlPoints::attachLineType"
	}

	/**
	 * disconnect the currently attached LineType.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 358A6CE902EE detach_head358A6CDF004B
	// "Ili1ControlPoints::detachLineType"
	public LineType detachLineType()
	// -end- 358A6CE902EE detach_head358A6CDF004B
	// "Ili1ControlPoints::detachLineType"
	{
		// -beg- preserve=no 358A6CE902EE detach_body358A6CDF004B
		// "Ili1ControlPoints::detachLineType"
		LineType ret = null;
		if (lineType != null) {
			lineType._unlinkIli1ControlPoints(this);
			ret = lineType;
			lineType = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachLineType"));
		return ret;
		// -end- 358A6CE902EE detach_body358A6CDF004B
		// "Ili1ControlPoints::detachLineType"
	}

	/**
	 * get the currently attached LineType.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 358A6CE902EE get_head358A6CDF004B
	// "Ili1ControlPoints::getLineType"
	public LineType getLineType()
	// -end- 358A6CE902EE get_head358A6CDF004B "Ili1ControlPoints::getLineType"
	{
		// -beg- preserve=no 358A6CE902EE get_body358A6CDF004B
		// "Ili1ControlPoints::getLineType"
		if (lineType == null) {
			throw new java.lang.IllegalStateException("no lineType attached");
		}
		return lineType;
		// -end- 358A6CE902EE get_body358A6CDF004B
		// "Ili1ControlPoints::getLineType"
	}

	/**
	 * tests if there is a LineType attached.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 358A6CE902EE test_head358A6CDF004B
	// "Ili1ControlPoints::containsLineType"
	public boolean containsLineType()
	// -end- 358A6CE902EE test_head358A6CDF004B
	// "Ili1ControlPoints::containsLineType"
	{
		// -beg- preserve=no 358A6CE902EE test_body358A6CDF004B
		// "Ili1ControlPoints::containsLineType"
		return lineType != null;
		// -end- 358A6CE902EE test_body358A6CDF004B
		// "Ili1ControlPoints::containsLineType"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A6CE902EE _link_body358A6CDF004B
	// "Ili1ControlPoints::_linkLineType"
	public void _linkLineType(LineType lineType1) {
		lineType = lineType1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkLineType"));
		return;
	}
	// -end- 358A6CE902EE _link_body358A6CDF004B
	// "Ili1ControlPoints::_linkLineType"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 358A6CE902EE _unlink_body358A6CDF004B
	// "Ili1ControlPoints::_unlinkLineType"
	public void _unlinkLineType(LineType lineType1) {
		lineType = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkLineType"));
		return;
	}
	// -end- 358A6CE902EE _unlink_body358A6CDF004B
	// "Ili1ControlPoints::_unlinkLineType"

	// -beg- preserve=no 370E081E0090 code358A6CDF004B "coord"
	private DomainAttribute coord;
	// -end- 370E081E0090 code358A6CDF004B "coord"

	/**
	 * attaches a Coord.
	 *
	 * @see #detachCoord
	 * @see #getCoord
	 * @see #containsCoord
	 */
	// -beg- preserve=no 370E081E0090 attach_head358A6CDF004B
	// "Ili1ControlPoints::attachCoord"
	public void attachCoord(DomainAttribute coord1)
	// -end- 370E081E0090 attach_head358A6CDF004B
	// "Ili1ControlPoints::attachCoord"
	{
		// -beg- preserve=no 370E081E0090 attach_body358A6CDF004B
		// "Ili1ControlPoints::attachCoord"
		if (coord != null) {
			throw new java.lang.IllegalStateException("already a coord attached");
		}
		if (coord1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as coord");
		}
		coord = coord1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachCoord"));
		return;
		// -end- 370E081E0090 attach_body358A6CDF004B
		// "Ili1ControlPoints::attachCoord"
	}

	/**
	 * disconnect the currently attached Coord.
	 * 
	 * @see #attachCoord
	 */
	// -beg- preserve=no 370E081E0090 detach_head358A6CDF004B
	// "Ili1ControlPoints::detachCoord"
	public DomainAttribute detachCoord()
	// -end- 370E081E0090 detach_head358A6CDF004B
	// "Ili1ControlPoints::detachCoord"
	{
		// -beg- preserve=no 370E081E0090 detach_body358A6CDF004B
		// "Ili1ControlPoints::detachCoord"
		DomainAttribute ret = null;
		ret = coord;
		coord = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachCoord"));
		return ret;
		// -end- 370E081E0090 detach_body358A6CDF004B
		// "Ili1ControlPoints::detachCoord"
	}

	/**
	 * get the currently attached Coord.
	 * 
	 * @see #attachCoord
	 */
	// -beg- preserve=no 370E081E0090 get_head358A6CDF004B
	// "Ili1ControlPoints::getCoord"
	public DomainAttribute getCoord()
	// -end- 370E081E0090 get_head358A6CDF004B "Ili1ControlPoints::getCoord"
	{
		// -beg- preserve=no 370E081E0090 get_body358A6CDF004B
		// "Ili1ControlPoints::getCoord"
		if (coord == null) {
			throw new java.lang.IllegalStateException("no coord attached");
		}
		return coord;
		// -end- 370E081E0090 get_body358A6CDF004B "Ili1ControlPoints::getCoord"
	}

	/**
	 * tests if there is a Coord attached.
	 * 
	 * @see #attachCoord
	 */
	// -beg- preserve=no 370E081E0090 test_head358A6CDF004B
	// "Ili1ControlPoints::containsCoord"
	public boolean containsCoord()
	// -end- 370E081E0090 test_head358A6CDF004B
	// "Ili1ControlPoints::containsCoord"
	{
		// -beg- preserve=no 370E081E0090 test_body358A6CDF004B
		// "Ili1ControlPoints::containsCoord"
		return coord != null;
		// -end- 370E081E0090 test_body358A6CDF004B
		// "Ili1ControlPoints::containsCoord"
	}

	// -beg- preserve=no 358A6D1200C6 var358A6CDF004B "constraints"
	private NlsString constraints = null;
	// -end- 358A6D1200C6 var358A6CDF004B "constraints"

	/**
	 * get current value of constraints zusaetzliche Bedingung fuer die
	 * Stuetzpunkte.
	 * 
	 * @see #setConstraints
	 */
	// -beg- preserve=no 358A6D1200C6 get_head358A6CDF004B "constraints"
	public NlsString getConstraints()
	// -end- 358A6D1200C6 get_head358A6CDF004B "constraints"
	{
		// -beg- preserve=no 358A6D1200C6 get_body358A6CDF004B "constraints"
		return constraints;
		// -end- 358A6D1200C6 get_body358A6CDF004B "constraints"
	}

	/**
	 * set current value of constraints
	 * 
	 * @see #getConstraints
	 */
	// -beg- preserve=no 358A6D1200C6 set_head358A6CDF004B "constraints"
	public void setConstraints(NlsString value1)
	// -end- 358A6D1200C6 set_head358A6CDF004B "constraints"
	{
		// -beg- preserve=no 358A6D1200C6 set_body358A6CDF004B "constraints"
		if (constraints != value1 && (constraints == null || !constraints.equals(value1))) {
			constraints = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setConstraints"));
		}
		// -end- 358A6D1200C6 set_body358A6CDF004B "constraints"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A6CDF004B detail_end "Ili1ControlPoints"

	// -end- 358A6CDF004B detail_end "Ili1ControlPoints"

}
