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

// -beg- preserve=no 3E6037DF010F package "UnknownType"
package ch.ehi.interlis.domainsandconstants;
// -end- 3E6037DF010F package "UnknownType"

import java.util.Iterator;
// -beg- preserve=no 3E6037DF010F autoimport "UnknownType"
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.IliSyntax;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 3E6037DF010F autoimport "UnknownType"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3E6037DF010F import "UnknownType"

// -end- 3E6037DF010F import "UnknownType"

/**
 * used to represent unknown (with respect to the current version of the
 * umleditor) interlis compiler datatypes
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:07 $
 */
public class UnknownType extends Type implements IliSyntax {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3E6037DF010F detail_begin "UnknownType"

	// -end- 3E6037DF010F detail_begin "UnknownType"

	private static final long serialVersionUID = 6153422696337475753L;

	// -beg- preserve=no 3E6038280088 head3E6037DF010F "unlinkAll"
	public void unlinkAll()
	// -end- 3E6038280088 head3E6037DF010F "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E6038280088 throws3E6037DF010F "unlinkAll"

	// -end- 3E6038280088 throws3E6037DF010F "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3E6038280088 body3E6037DF010F "unlinkAll"

		setSyntax(null);
		super.unlinkAll();
		// -end- 3E6038280088 body3E6037DF010F "unlinkAll"
	}

	// -beg- preserve=no 3E60382B030D head3E6037DF010F "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3E60382B030D head3E6037DF010F "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E60382B030D throws3E6037DF010F "enumerateChildren"

	// -end- 3E60382B030D throws3E6037DF010F "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3E60382B030D body3E6037DF010F "enumerateChildren"
		Iterator it = null;
		visitor.visit(getSyntax());
		super.enumerateChildren(visitor);
		// -end- 3E60382B030D body3E6037DF010F "enumerateChildren"
	}

	// -beg- preserve=no 3C8F5ABE022D var3E6037DF010F "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var3E6037DF010F "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head3E6037DF010F "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head3E6037DF010F "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body3E6037DF010F "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body3E6037DF010F "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head3E6037DF010F "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head3E6037DF010F "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body3E6037DF010F "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body3E6037DF010F "syntax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3E6037DF010F detail_end "UnknownType"

	// -end- 3E6037DF010F detail_end "UnknownType"

}
