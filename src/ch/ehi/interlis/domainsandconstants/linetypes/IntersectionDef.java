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

// -beg- preserve=no 35B872AB0146 package "IntersectionDef"
package ch.ehi.interlis.domainsandconstants.linetypes;
// -end- 35B872AB0146 package "IntersectionDef"

// -beg- preserve=no 35B872AB0146 autoimport "IntersectionDef"
import ch.ehi.uml1_4.foundation.core.Element;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.domainsandconstants.linetypes.LineType;
import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 35B872AB0146 autoimport "IntersectionDef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 35B872AB0146 import "IntersectionDef"

// -end- 35B872AB0146 import "IntersectionDef"

/**
 * maximal zulaessige Ueberschneidungen der Linien dieses Datentypes.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:37 $
 */
public class IntersectionDef extends AbstractEditorElement implements Element, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 35B872AB0146 detail_begin "IntersectionDef"

	// -end- 35B872AB0146 detail_begin "IntersectionDef"

	private static final long serialVersionUID = 4693490390228639838L;

	// -beg- preserve=no 3D4FA21B02FB head35B872AB0146 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B02FB head35B872AB0146 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B02FB throws35B872AB0146 "unlinkAll"

	// -end- 3D4FA21B02FB throws35B872AB0146 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B02FB body35B872AB0146 "unlinkAll"

		detachLineType();
		setMaxi(null);
		setMetaAttrb(null);
		setDocumentation(null);
		super.unlinkAll();
		// -end- 3D4FA21B02FB body35B872AB0146 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B02FC head35B872AB0146 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B02FC head35B872AB0146 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B02FC throws35B872AB0146 "enumerateChildren"

	// -end- 3D4FA21B02FC throws35B872AB0146 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B02FC body35B872AB0146 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getMaxi());
		visitor.visit(getMetaAttrb());
		visitor.visit(getDocumentation());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B02FC body35B872AB0146 "enumerateChildren"
	}

	// -beg- preserve=no 35B8730B01C6 code35B872AB0146 "lineType"
	private LineType lineType;
	// -end- 35B8730B01C6 code35B872AB0146 "lineType"

	/**
	 * attaches a LineType.
	 *
	 * @see #detachLineType
	 * @see #getLineType
	 * @see #containsLineType
	 */
	// -beg- preserve=no 35B8730B01C6 attach_head35B872AB0146
	// "IntersectionDef::attachLineType"
	public void attachLineType(LineType lineType1)
	// -end- 35B8730B01C6 attach_head35B872AB0146
	// "IntersectionDef::attachLineType"
	{
		// -beg- preserve=no 35B8730B01C6 attach_body35B872AB0146
		// "IntersectionDef::attachLineType"
		if (lineType != null) {
			throw new java.lang.IllegalStateException("already a lineType attached");
		}
		if (lineType1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as lineType");
		}
		lineType = lineType1;
		lineType1._linkIntersectionDef(this);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachLineType"));
		return;
		// -end- 35B8730B01C6 attach_body35B872AB0146
		// "IntersectionDef::attachLineType"
	}

	/**
	 * disconnect the currently attached LineType.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 35B8730B01C6 detach_head35B872AB0146
	// "IntersectionDef::detachLineType"
	public LineType detachLineType()
	// -end- 35B8730B01C6 detach_head35B872AB0146
	// "IntersectionDef::detachLineType"
	{
		// -beg- preserve=no 35B8730B01C6 detach_body35B872AB0146
		// "IntersectionDef::detachLineType"
		LineType ret = null;
		if (lineType != null) {
			lineType._unlinkIntersectionDef(this);
			ret = lineType;
			lineType = null;
		}
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachLineType"));
		return ret;
		// -end- 35B8730B01C6 detach_body35B872AB0146
		// "IntersectionDef::detachLineType"
	}

	/**
	 * get the currently attached LineType.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 35B8730B01C6 get_head35B872AB0146
	// "IntersectionDef::getLineType"
	public LineType getLineType()
	// -end- 35B8730B01C6 get_head35B872AB0146 "IntersectionDef::getLineType"
	{
		// -beg- preserve=no 35B8730B01C6 get_body35B872AB0146
		// "IntersectionDef::getLineType"
		if (lineType == null) {
			throw new java.lang.IllegalStateException("no lineType attached");
		}
		return lineType;
		// -end- 35B8730B01C6 get_body35B872AB0146
		// "IntersectionDef::getLineType"
	}

	/**
	 * tests if there is a LineType attached.
	 * 
	 * @see #attachLineType
	 */
	// -beg- preserve=no 35B8730B01C6 test_head35B872AB0146
	// "IntersectionDef::containsLineType"
	public boolean containsLineType()
	// -end- 35B8730B01C6 test_head35B872AB0146
	// "IntersectionDef::containsLineType"
	{
		// -beg- preserve=no 35B8730B01C6 test_body35B872AB0146
		// "IntersectionDef::containsLineType"
		return lineType != null;
		// -end- 35B8730B01C6 test_body35B872AB0146
		// "IntersectionDef::containsLineType"
	}

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35B8730B01C6 _link_body35B872AB0146
	// "IntersectionDef::_linkLineType"
	public void _linkLineType(LineType lineType1) {
		lineType = lineType1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_linkLineType"));
		return;
	}
	// -end- 35B8730B01C6 _link_body35B872AB0146
	// "IntersectionDef::_linkLineType"

	/**
	 * DONT USE; link management internal
	 */
	// -beg- preserve=no 35B8730B01C6 _unlink_body35B872AB0146
	// "IntersectionDef::_unlinkLineType"
	public void _unlinkLineType(LineType lineType1) {
		lineType = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "_unlinkLineType"));
		return;
	}
	// -end- 35B8730B01C6 _unlink_body35B872AB0146
	// "IntersectionDef::_unlinkLineType"

	// -beg- preserve=no 35B873200343 var35B872AB0146 "maxi"
	private IliDim maxi = null;
	// -end- 35B873200343 var35B872AB0146 "maxi"

	/**
	 * get current value of maxi Toleranzwert für Überschnneidungen
	 * 
	 * @see #setMaxi
	 */
	// -beg- preserve=no 35B873200343 get_head35B872AB0146 "maxi"
	public IliDim getMaxi()
	// -end- 35B873200343 get_head35B872AB0146 "maxi"
	{
		// -beg- preserve=no 35B873200343 get_body35B872AB0146 "maxi"
		return maxi;
		// -end- 35B873200343 get_body35B872AB0146 "maxi"
	}

	/**
	 * set current value of maxi
	 * 
	 * @see #getMaxi
	 */
	// -beg- preserve=no 35B873200343 set_head35B872AB0146 "maxi"
	public void setMaxi(IliDim value1)
	// -end- 35B873200343 set_head35B872AB0146 "maxi"
	{
		// -beg- preserve=no 35B873200343 set_body35B872AB0146 "maxi"
		if (maxi != value1 && (maxi == null || !maxi.equals(value1))) {
			maxi = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMaxi"));
		}
		// -end- 35B873200343 set_body35B872AB0146 "maxi"
	}

	// -beg- preserve=no 3C1DF92B0234 var35B872AB0146 "documentation"
	private NlsString documentation = null;
	// -end- 3C1DF92B0234 var35B872AB0146 "documentation"

	/**
	 * get current value of documentation
	 * 
	 * @see #setDocumentation
	 */
	// -beg- preserve=no 3C1DF92B0234 get_head35B872AB0146 "documentation"
	public NlsString getDocumentation()
	// -end- 3C1DF92B0234 get_head35B872AB0146 "documentation"
	{
		// -beg- preserve=no 3C1DF92B0234 get_body35B872AB0146 "documentation"
		return documentation;
		// -end- 3C1DF92B0234 get_body35B872AB0146 "documentation"
	}

	/**
	 * set current value of documentation
	 * 
	 * @see #getDocumentation
	 */
	// -beg- preserve=no 3C1DF92B0234 set_head35B872AB0146 "documentation"
	public void setDocumentation(NlsString value1)
	// -end- 3C1DF92B0234 set_head35B872AB0146 "documentation"
	{
		// -beg- preserve=no 3C1DF92B0234 set_body35B872AB0146 "documentation"
		if (documentation != value1 && (documentation == null || !documentation.equals(value1))) {
			documentation = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setDocumentation"));
		}
		// -end- 3C1DF92B0234 set_body35B872AB0146 "documentation"
	}

	private NlsString metaAttrb = null;

	public NlsString getMetaAttrb() {
		return metaAttrb;
	}

	public void setMetaAttrb(NlsString value) {
		if (metaAttrb != value && (metaAttrb == null || !metaAttrb.equals(value))) {
			metaAttrb = value;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaAttrb"));
		}
	}
	
	private NlsString metaName = null;

	public NlsString getMetaName() {
		return metaName;
	}

	public void setMetaName(NlsString value) {
		if (metaName != value && (metaName == null || !metaName.equals(value))) {
			metaName = value;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaName"));
		}
	}

	private NlsString metaMsg = null;

	public NlsString getMetaMsg() {
		return metaMsg;
	}

	public void setMetaMsg(NlsString value) {
		if (metaMsg != value && (metaMsg == null || !metaMsg.equals(value))) {
			metaMsg = value;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMetaMsg"));
		}
	}
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 35B872AB0146 detail_end "IntersectionDef"

	// -end- 35B872AB0146 detail_end "IntersectionDef"

}
