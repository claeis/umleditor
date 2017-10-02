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

// -beg- preserve=no 3961A82A0142 package "BaseAttributeRef"
package ch.ehi.interlis.views;
// -end- 3961A82A0142 package "BaseAttributeRef"

// -beg- preserve=no 3961A82A0142 autoimport "BaseAttributeRef"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.basics.types.NlsString;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 3961A82A0142 autoimport "BaseAttributeRef"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3961A82A0142 import "BaseAttributeRef"

// -end- 3961A82A0142 import "BaseAttributeRef"

/**
 * Verweist auf ein Attribut der Basissicht.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:27 $
 */
public class BaseAttributeRef extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3961A82A0142 detail_begin "BaseAttributeRef"

	// -end- 3961A82A0142 detail_begin "BaseAttributeRef"

	private static final long serialVersionUID = -4801895422615118656L;

	// -beg- preserve=no 3D4FA218038E head3961A82A0142 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA218038E head3961A82A0142 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA218038E throws3961A82A0142 "unlinkAll"

	// -end- 3D4FA218038E throws3961A82A0142 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA218038E body3961A82A0142 "unlinkAll"

		// Role ProjectionAttributeDef: ProjectionAttributeDef object(s) may
		// point to this
		setBaseName(null);
		setAttributes(null);
		super.unlinkAll();
		// -end- 3D4FA218038E body3961A82A0142 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180397 head3961A82A0142 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180397 head3961A82A0142 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180397 throws3961A82A0142 "enumerateChildren"

	// -end- 3D4FA2180397 throws3961A82A0142 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180397 body3961A82A0142 "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getBaseName());
		visitor.visit(getAttributes());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2180397 body3961A82A0142 "enumerateChildren"
	}

	// -beg- preserve=no 3961A9D900A2 var3961A82A0142 "baseName"
	private NlsString baseName = null;
	// -end- 3961A9D900A2 var3961A82A0142 "baseName"

	/**
	 * get current value of baseName Name der Basisklasse.
	 * 
	 * @see #setBaseName
	 */
	// -beg- preserve=no 3961A9D900A2 get_head3961A82A0142 "baseName"
	public NlsString getBaseName()
	// -end- 3961A9D900A2 get_head3961A82A0142 "baseName"
	{
		// -beg- preserve=no 3961A9D900A2 get_body3961A82A0142 "baseName"
		return baseName;
		// -end- 3961A9D900A2 get_body3961A82A0142 "baseName"
	}

	/**
	 * set current value of baseName
	 * 
	 * @see #getBaseName
	 */
	// -beg- preserve=no 3961A9D900A2 set_head3961A82A0142 "baseName"
	public void setBaseName(NlsString value1)
	// -end- 3961A9D900A2 set_head3961A82A0142 "baseName"
	{
		// -beg- preserve=no 3961A9D900A2 set_body3961A82A0142 "baseName"
		if (baseName != value1 && (baseName == null || !baseName.equals(value1))) {
			baseName = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setBaseName"));
		}
		// -end- 3961A9D900A2 set_body3961A82A0142 "baseName"
	}

	// -beg- preserve=no 3961A9DE0276 var3961A82A0142 "attributes"
	private NlsString attributes = null;
	// -end- 3961A9DE0276 var3961A82A0142 "attributes"

	/**
	 * get current value of attributes Liste der Attribut der Basisklasse die in
	 * der Projektion verwendet werden sollen.
	 * 
	 * @see #setAttributes
	 */
	// -beg- preserve=no 3961A9DE0276 get_head3961A82A0142 "attributes"
	public NlsString getAttributes()
	// -end- 3961A9DE0276 get_head3961A82A0142 "attributes"
	{
		// -beg- preserve=no 3961A9DE0276 get_body3961A82A0142 "attributes"
		return attributes;
		// -end- 3961A9DE0276 get_body3961A82A0142 "attributes"
	}

	/**
	 * set current value of attributes
	 * 
	 * @see #getAttributes
	 */
	// -beg- preserve=no 3961A9DE0276 set_head3961A82A0142 "attributes"
	public void setAttributes(NlsString value1)
	// -end- 3961A9DE0276 set_head3961A82A0142 "attributes"
	{
		// -beg- preserve=no 3961A9DE0276 set_body3961A82A0142 "attributes"
		if (attributes != value1 && (attributes == null || !attributes.equals(value1))) {
			attributes = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setAttributes"));
		}
		// -end- 3961A9DE0276 set_body3961A82A0142 "attributes"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3961A82A0142 detail_end "BaseAttributeRef"

	// -end- 3961A82A0142 detail_end "BaseAttributeRef"

}
