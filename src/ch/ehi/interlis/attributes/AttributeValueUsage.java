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

// -beg- preserve=no 3C1DD2F70046 package "AttributeValueUsage"
package ch.ehi.interlis.attributes;
// -end- 3C1DD2F70046 package "AttributeValueUsage"

// -beg- preserve=no 3C1DD2F70046 autoimport "AttributeValueUsage"
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.logicalexpressions.AttributePath;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 3C1DD2F70046 autoimport "AttributeValueUsage"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C1DD2F70046 import "AttributeValueUsage"

// -end- 3C1DD2F70046 import "AttributeValueUsage"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:48 $
 */
public class AttributeValueUsage extends AbstractEditorElement implements IliSyntax, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1DD2F70046 detail_begin "AttributeValueUsage"

	// -end- 3C1DD2F70046 detail_begin "AttributeValueUsage"

	// -beg- preserve=no 3D4FA21A02DC head3C1DD2F70046 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21A02DC head3C1DD2F70046 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A02DC throws3C1DD2F70046 "unlinkAll"

	// -end- 3D4FA21A02DC throws3C1DD2F70046 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A02DC body3C1DD2F70046 "unlinkAll"

		detachAttributePath();
		// Role AttributeDef: AttributeDef object(s) may point to this
		setSyntax(null);
		super.unlinkAll();
		// -end- 3D4FA21A02DC body3C1DD2F70046 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21A02E6 head3C1DD2F70046 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21A02E6 head3C1DD2F70046 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21A02E6 throws3C1DD2F70046 "enumerateChildren"

	// -end- 3D4FA21A02E6 throws3C1DD2F70046 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21A02E6 body3C1DD2F70046 "enumerateChildren"
		java.util.Iterator it = null;
		if (containsAttributePath())
			visitor.visit(getAttributePath());
		visitor.visit(getSyntax());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21A02E6 body3C1DD2F70046 "enumerateChildren"
	}

	// -beg- preserve=no 3C1DD3010393 code3C1DD2F70046 "attributePath"
	private AttributePath attributePath;
	// -end- 3C1DD3010393 code3C1DD2F70046 "attributePath"

	/**
	 * attaches a AttributePath.
	 *
	 * @see #detachAttributePath
	 * @see #getAttributePath
	 * @see #containsAttributePath
	 */
	// -beg- preserve=no 3C1DD3010393 attach_head3C1DD2F70046
	// "AttributeValueUsage::attachAttributePath"
	public void attachAttributePath(AttributePath attributePath1)
	// -end- 3C1DD3010393 attach_head3C1DD2F70046
	// "AttributeValueUsage::attachAttributePath"
	{
		// -beg- preserve=no 3C1DD3010393 attach_body3C1DD2F70046
		// "AttributeValueUsage::attachAttributePath"
		if (attributePath != null) {
			throw new java.lang.IllegalStateException("already a attributePath attached");
		}
		if (attributePath1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as attributePath");
		}
		attributePath = attributePath1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachAttributePath"));
		return;
		// -end- 3C1DD3010393 attach_body3C1DD2F70046
		// "AttributeValueUsage::attachAttributePath"
	}

	/**
	 * disconnect the currently attached AttributePath.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 3C1DD3010393 detach_head3C1DD2F70046
	// "AttributeValueUsage::detachAttributePath"
	public AttributePath detachAttributePath()
	// -end- 3C1DD3010393 detach_head3C1DD2F70046
	// "AttributeValueUsage::detachAttributePath"
	{
		// -beg- preserve=no 3C1DD3010393 detach_body3C1DD2F70046
		// "AttributeValueUsage::detachAttributePath"
		AttributePath ret = null;
		ret = attributePath;
		attributePath = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachAttributePath"));
		return ret;
		// -end- 3C1DD3010393 detach_body3C1DD2F70046
		// "AttributeValueUsage::detachAttributePath"
	}

	/**
	 * get the currently attached AttributePath.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 3C1DD3010393 get_head3C1DD2F70046
	// "AttributeValueUsage::getAttributePath"
	public AttributePath getAttributePath()
	// -end- 3C1DD3010393 get_head3C1DD2F70046
	// "AttributeValueUsage::getAttributePath"
	{
		// -beg- preserve=no 3C1DD3010393 get_body3C1DD2F70046
		// "AttributeValueUsage::getAttributePath"
		if (attributePath == null) {
			throw new java.lang.IllegalStateException("no attributePath attached");
		}
		return attributePath;
		// -end- 3C1DD3010393 get_body3C1DD2F70046
		// "AttributeValueUsage::getAttributePath"
	}

	/**
	 * tests if there is a AttributePath attached.
	 * 
	 * @see #attachAttributePath
	 */
	// -beg- preserve=no 3C1DD3010393 test_head3C1DD2F70046
	// "AttributeValueUsage::containsAttributePath"
	public boolean containsAttributePath()
	// -end- 3C1DD3010393 test_head3C1DD2F70046
	// "AttributeValueUsage::containsAttributePath"
	{
		// -beg- preserve=no 3C1DD3010393 test_body3C1DD2F70046
		// "AttributeValueUsage::containsAttributePath"
		return attributePath != null;
		// -end- 3C1DD3010393 test_body3C1DD2F70046
		// "AttributeValueUsage::containsAttributePath"
	}

	// -beg- preserve=no 3C8F5ABE022D var3C1DD2F70046 "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var3C1DD2F70046 "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head3C1DD2F70046 "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head3C1DD2F70046 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body3C1DD2F70046 "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body3C1DD2F70046 "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head3C1DD2F70046 "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head3C1DD2F70046 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body3C1DD2F70046 "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body3C1DD2F70046 "syntax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C1DD2F70046 detail_end "AttributeValueUsage"

	// -end- 3C1DD2F70046 detail_end "AttributeValueUsage"

}
