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

// -beg- preserve=no 3948A1BC012D package "RefSys"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 3948A1BC012D package "RefSys"

// -beg- preserve=no 3948A1BC012D autoimport "RefSys"
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.basetypes.RefSysRef;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 3948A1BC012D autoimport "RefSys"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3948A1BC012D import "RefSys"

// -end- 3948A1BC012D import "RefSys"

/**
 * Definiert das Referenzsystem für Nummerische Werte.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:28 $
 */
public class RefSys extends AbstractEditorElement implements IliSyntax, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3948A1BC012D detail_begin "RefSys"

	// -end- 3948A1BC012D detail_begin "RefSys"

	private static final long serialVersionUID = -6955775453735259723L;

	// -beg- preserve=no 3D4FA21B019D head3948A1BC012D "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B019D head3948A1BC012D "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B019D throws3948A1BC012D "unlinkAll"

	// -end- 3D4FA21B019D throws3948A1BC012D "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B019D body3948A1BC012D "unlinkAll"

		// Role NumericalType: NumericalType object(s) may point to this
		detachDomainDef();
		detachRefSysRef();
		setSyntax(null);
		super.unlinkAll();
		// -end- 3D4FA21B019D body3948A1BC012D "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B01A7 head3948A1BC012D "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B01A7 head3948A1BC012D "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B01A7 throws3948A1BC012D "enumerateChildren"

	// -end- 3D4FA21B01A7 throws3948A1BC012D "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B01A7 body3948A1BC012D "enumerateChildren"
		Iterator<?> it = null;
		if (containsDomainDef())
			visitor.visit(getDomainDef());
		if (containsRefSysRef())
			visitor.visit(getRefSysRef());
		visitor.visit(getSyntax());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B01A7 body3948A1BC012D "enumerateChildren"
	}

	// -beg- preserve=no 3948CA6400A9 code3948A1BC012D "domainDef"
	private DomainDef domainDef;
	// -end- 3948CA6400A9 code3948A1BC012D "domainDef"

	/**
	 * attaches a DomainDef.
	 *
	 * @see #detachDomainDef
	 * @see #getDomainDef
	 * @see #containsDomainDef
	 */
	// -beg- preserve=no 3948CA6400A9 attach_head3948A1BC012D
	// "RefSys::attachDomainDef"
	public void attachDomainDef(DomainDef domainDef1)
	// -end- 3948CA6400A9 attach_head3948A1BC012D "RefSys::attachDomainDef"
	{
		// -beg- preserve=no 3948CA6400A9 attach_body3948A1BC012D
		// "RefSys::attachDomainDef"
		if (domainDef != null) {
			throw new java.lang.IllegalStateException("already a domainDef attached");
		}
		if (domainDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as domainDef");
		}
		domainDef = domainDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachDomainDef"));
		return;
		// -end- 3948CA6400A9 attach_body3948A1BC012D "RefSys::attachDomainDef"
	}

	/**
	 * disconnect the currently attached DomainDef.
	 * 
	 * @see #attachDomainDef
	 */
	// -beg- preserve=no 3948CA6400A9 detach_head3948A1BC012D
	// "RefSys::detachDomainDef"
	public DomainDef detachDomainDef()
	// -end- 3948CA6400A9 detach_head3948A1BC012D "RefSys::detachDomainDef"
	{
		// -beg- preserve=no 3948CA6400A9 detach_body3948A1BC012D
		// "RefSys::detachDomainDef"
		DomainDef ret = null;
		ret = domainDef;
		domainDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachDomainDef"));
		return ret;
		// -end- 3948CA6400A9 detach_body3948A1BC012D "RefSys::detachDomainDef"
	}

	/**
	 * get the currently attached DomainDef.
	 * 
	 * @see #attachDomainDef
	 */
	// -beg- preserve=no 3948CA6400A9 get_head3948A1BC012D
	// "RefSys::getDomainDef"
	public DomainDef getDomainDef()
	// -end- 3948CA6400A9 get_head3948A1BC012D "RefSys::getDomainDef"
	{
		// -beg- preserve=no 3948CA6400A9 get_body3948A1BC012D
		// "RefSys::getDomainDef"
		if (domainDef == null) {
			throw new java.lang.IllegalStateException("no domainDef attached");
		}
		return domainDef;
		// -end- 3948CA6400A9 get_body3948A1BC012D "RefSys::getDomainDef"
	}

	/**
	 * tests if there is a DomainDef attached.
	 * 
	 * @see #attachDomainDef
	 */
	// -beg- preserve=no 3948CA6400A9 test_head3948A1BC012D
	// "RefSys::containsDomainDef"
	public boolean containsDomainDef()
	// -end- 3948CA6400A9 test_head3948A1BC012D "RefSys::containsDomainDef"
	{
		// -beg- preserve=no 3948CA6400A9 test_body3948A1BC012D
		// "RefSys::containsDomainDef"
		return domainDef != null;
		// -end- 3948CA6400A9 test_body3948A1BC012D "RefSys::containsDomainDef"
	}

	// -beg- preserve=no 3948CA6701F8 code3948A1BC012D "refSysRef"
	private RefSysRef refSysRef;
	// -end- 3948CA6701F8 code3948A1BC012D "refSysRef"

	/**
	 * attaches a RefSysRef.
	 *
	 * @see #detachRefSysRef
	 * @see #getRefSysRef
	 * @see #containsRefSysRef
	 */
	// -beg- preserve=no 3948CA6701F8 attach_head3948A1BC012D
	// "RefSys::attachRefSysRef"
	public void attachRefSysRef(RefSysRef refSysRef1)
	// -end- 3948CA6701F8 attach_head3948A1BC012D "RefSys::attachRefSysRef"
	{
		// -beg- preserve=no 3948CA6701F8 attach_body3948A1BC012D
		// "RefSys::attachRefSysRef"
		if (refSysRef != null) {
			throw new java.lang.IllegalStateException("already a refSysRef attached");
		}
		if (refSysRef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as refSysRef");
		}
		refSysRef = refSysRef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachRefSysRef"));
		return;
		// -end- 3948CA6701F8 attach_body3948A1BC012D "RefSys::attachRefSysRef"
	}

	/**
	 * disconnect the currently attached RefSysRef.
	 * 
	 * @see #attachRefSysRef
	 */
	// -beg- preserve=no 3948CA6701F8 detach_head3948A1BC012D
	// "RefSys::detachRefSysRef"
	public RefSysRef detachRefSysRef()
	// -end- 3948CA6701F8 detach_head3948A1BC012D "RefSys::detachRefSysRef"
	{
		// -beg- preserve=no 3948CA6701F8 detach_body3948A1BC012D
		// "RefSys::detachRefSysRef"
		RefSysRef ret = null;
		ret = refSysRef;
		refSysRef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachRefSysRef"));
		return ret;
		// -end- 3948CA6701F8 detach_body3948A1BC012D "RefSys::detachRefSysRef"
	}

	/**
	 * get the currently attached RefSysRef.
	 * 
	 * @see #attachRefSysRef
	 */
	// -beg- preserve=no 3948CA6701F8 get_head3948A1BC012D
	// "RefSys::getRefSysRef"
	public RefSysRef getRefSysRef()
	// -end- 3948CA6701F8 get_head3948A1BC012D "RefSys::getRefSysRef"
	{
		// -beg- preserve=no 3948CA6701F8 get_body3948A1BC012D
		// "RefSys::getRefSysRef"
		if (refSysRef == null) {
			throw new java.lang.IllegalStateException("no refSysRef attached");
		}
		return refSysRef;
		// -end- 3948CA6701F8 get_body3948A1BC012D "RefSys::getRefSysRef"
	}

	/**
	 * tests if there is a RefSysRef attached.
	 * 
	 * @see #attachRefSysRef
	 */
	// -beg- preserve=no 3948CA6701F8 test_head3948A1BC012D
	// "RefSys::containsRefSysRef"
	public boolean containsRefSysRef()
	// -end- 3948CA6701F8 test_head3948A1BC012D "RefSys::containsRefSysRef"
	{
		// -beg- preserve=no 3948CA6701F8 test_body3948A1BC012D
		// "RefSys::containsRefSysRef"
		return refSysRef != null;
		// -end- 3948CA6701F8 test_body3948A1BC012D "RefSys::containsRefSysRef"
	}

	// -beg- preserve=no 3948CA85009C var3948A1BC012D "axis"
	private long axis;
	// -end- 3948CA85009C var3948A1BC012D "axis"

	/**
	 * get current value of axis Achsnummer
	 * 
	 * @see #setAxis
	 */
	// -beg- preserve=no 3948CA85009C get_head3948A1BC012D "axis"
	public long getAxis()
	// -end- 3948CA85009C get_head3948A1BC012D "axis"
	{
		// -beg- preserve=no 3948CA85009C get_body3948A1BC012D "axis"
		return axis;
		// -end- 3948CA85009C get_body3948A1BC012D "axis"
	}

	/**
	 * set current value of axis
	 * 
	 * @see #getAxis
	 */
	// -beg- preserve=no 3948CA85009C set_head3948A1BC012D "axis"
	public void setAxis(long value1)
	// -end- 3948CA85009C set_head3948A1BC012D "axis"
	{
		// -beg- preserve=no 3948CA85009C set_body3948A1BC012D "axis"
		if (axis != value1) {
			axis = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAxis"));
		}
		// -end- 3948CA85009C set_body3948A1BC012D "axis"
	}

	// -beg- preserve=no 3C8F5ABE022D var3948A1BC012D "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var3948A1BC012D "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head3948A1BC012D "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head3948A1BC012D "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body3948A1BC012D "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body3948A1BC012D "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head3948A1BC012D "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head3948A1BC012D "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body3948A1BC012D "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body3948A1BC012D "syntax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3948A1BC012D detail_end "RefSys"

	// -end- 3948A1BC012D detail_end "RefSys"

}
