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

<<<<<<< HEAD

              // -beg- preserve=no 394888E60120 package "Constant"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 394888E60120 package "Constant"

              // -beg- preserve=no 394888E60120 autoimport "Constant"
              import ch.ehi.interlis.IliSyntax;
              import ch.ehi.uml1_4.implementation.AbstractEditorElement;
              import ch.ehi.basics.tools.AbstractVisitor;
              import ch.ehi.basics.types.NlsString;
              // -end- 394888E60120 autoimport "Constant"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 394888E60120 import "Constant"

              // -end- 394888E60120 import "Constant"

              /** Definiert eine Konstante.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:12 $
               */
public class Constant extends AbstractEditorElement implements IliSyntax , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 394888E60120 detail_begin "Constant"

                // -end- 394888E60120 detail_begin "Constant"

                // -beg- preserve=no 3D4FA21B011B head394888E60120 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B011B head394888E60120 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B011B throws394888E60120 "unlinkAll"

                  // -end- 3D4FA21B011B throws394888E60120 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B011B body394888E60120 "unlinkAll"
                  
                  // Role FactElement: FactElement object(s) may point to this
                  // Role SigAssignment: SigAssignment object(s) may point to this
                  // Role EnumAssignment: EnumAssignment object(s) may point to this
                  // Role AttributeDef: AttributeDef object(s) may point to this
                  setSyntax(null);
                  super.unlinkAll();
                  // -end- 3D4FA21B011B body394888E60120 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B012E head394888E60120 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B012E head394888E60120 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B012E throws394888E60120 "enumerateChildren"

                  // -end- 3D4FA21B012E throws394888E60120 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B012E body394888E60120 "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getSyntax());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B012E body394888E60120 "enumerateChildren"
                  }

                // -beg- preserve=no 3C8F5ABE022D var394888E60120 "syntax"
                private NlsString syntax = null;
                // -end- 3C8F5ABE022D var394888E60120 "syntax"

                /** get current value of syntax
                 *  the actual definition of the model element in valid INTERLIS syntax.
                 *  @see #setSyntax
                 */
                // -beg- preserve=no 3C8F5ABE022D get_head394888E60120 "syntax"
                public  NlsString getSyntax()
                // -end- 3C8F5ABE022D get_head394888E60120 "syntax"
                {
                  // -beg- preserve=no 3C8F5ABE022D get_body394888E60120 "syntax"
                  return syntax;
                  // -end- 3C8F5ABE022D get_body394888E60120 "syntax"
                }

                /** set current value of syntax
                 *  @see #getSyntax
                 */
                // -beg- preserve=no 3C8F5ABE022D set_head394888E60120 "syntax"
                public  void setSyntax(NlsString value1)
                // -end- 3C8F5ABE022D set_head394888E60120 "syntax"
                {
                  // -beg- preserve=no 3C8F5ABE022D set_body394888E60120 "syntax"
                  if(syntax!=value1 && (syntax==null || !syntax.equals(value1))){
                    syntax = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
                  }
                  // -end- 3C8F5ABE022D set_body394888E60120 "syntax"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 394888E60120 detail_end "Constant"

                // -end- 394888E60120 detail_end "Constant"

              }

=======
// -beg- preserve=no 394888E60120 package "Constant"
package ch.ehi.interlis.domainsandconstants.basetypes;
// -end- 394888E60120 package "Constant"

// -beg- preserve=no 394888E60120 autoimport "Constant"
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;

import java.util.Iterator;

import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 394888E60120 autoimport "Constant"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394888E60120 import "Constant"

// -end- 394888E60120 import "Constant"

/**
 * Definiert eine Konstante.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:12 $
 */
public class Constant extends AbstractEditorElement implements IliSyntax, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394888E60120 detail_begin "Constant"

	// -end- 394888E60120 detail_begin "Constant"

	private static final long serialVersionUID = -1877629691011769365L;

	// -beg- preserve=no 3D4FA21B011B head394888E60120 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21B011B head394888E60120 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B011B throws394888E60120 "unlinkAll"

	// -end- 3D4FA21B011B throws394888E60120 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B011B body394888E60120 "unlinkAll"

		// Role FactElement: FactElement object(s) may point to this
		// Role SigAssignment: SigAssignment object(s) may point to this
		// Role EnumAssignment: EnumAssignment object(s) may point to this
		// Role AttributeDef: AttributeDef object(s) may point to this
		setSyntax(null);
		super.unlinkAll();
		// -end- 3D4FA21B011B body394888E60120 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21B012E head394888E60120 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21B012E head394888E60120 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21B012E throws394888E60120 "enumerateChildren"

	// -end- 3D4FA21B012E throws394888E60120 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21B012E body394888E60120 "enumerateChildren"
		Iterator<?> it = null;
		visitor.visit(getSyntax());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21B012E body394888E60120 "enumerateChildren"
	}

	// -beg- preserve=no 3C8F5ABE022D var394888E60120 "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var394888E60120 "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head394888E60120 "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head394888E60120 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body394888E60120 "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body394888E60120 "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head394888E60120 "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head394888E60120 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body394888E60120 "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body394888E60120 "syntax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394888E60120 detail_end "Constant"

	// -end- 394888E60120 detail_end "Constant"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
