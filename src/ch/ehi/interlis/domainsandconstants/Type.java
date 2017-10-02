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

// -beg- preserve=no 358A651D03B6 package "Type"
package ch.ehi.interlis.domainsandconstants;
// -end- 358A651D03B6 package "Type"

import java.util.Iterator;
// -beg- preserve=no 358A651D03B6 autoimport "Type"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 358A651D03B6 autoimport "Type"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 358A651D03B6 import "Type"

// -end- 358A651D03B6 import "Type"

/**
 * Ein Wertebereich.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:06 $
 */
public abstract class Type extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A651D03B6 detail_begin "Type"

	// -end- 358A651D03B6 detail_begin "Type"

	private static final long serialVersionUID = 5284714366879273536L;

	// -beg- preserve=no 3D4FA21A03B8 head358A651D03B6 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21A03B8 head358A651D03B6 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A03B8 throws358A651D03B6 "unlinkAll"

	// -end- 3D4FA21A03B8 throws358A651D03B6 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A03B8 body358A651D03B6 "unlinkAll"

		// Role DomainDef: DomainDef object(s) may point to this
		// Role DomainAttribute: DomainAttribute object(s) may point to this
		super.unlinkAll();
		// -end- 3D4FA21A03B8 body358A651D03B6 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21A03CC head358A651D03B6 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21A03CC head358A651D03B6 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A03CC throws358A651D03B6 "enumerateChildren"

	// -end- 3D4FA21A03CC throws358A651D03B6 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A03CC body358A651D03B6 "enumerateChildren"
		Iterator it = null;
		super.enumerateChildren(visitor);
		// -end- 3D4FA21A03CC body358A651D03B6 "enumerateChildren"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 358A651D03B6 detail_end "Type"

	// -end- 358A651D03B6 detail_end "Type"

}
