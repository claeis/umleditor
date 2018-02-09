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

// -beg- preserve=no 394744420142 package "FunctionCall"
package ch.ehi.interlis.logicalexpressions;
// -end- 394744420142 package "FunctionCall"

// -beg- preserve=no 394744420142 autoimport "FunctionCall"
import ch.ehi.interlis.IliSyntax;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.logicalexpressions.Term;
import ch.ehi.interlis.functions.FunctionDef;
import ch.ehi.basics.types.NlsString;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch.ehi.basics.tools.AbstractVisitor;
// -end- 394744420142 autoimport "FunctionCall"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394744420142 import "FunctionCall"

// -end- 394744420142 import "FunctionCall"

/**
 * Funktionsaufruf in einem logischen Ausdruck.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:06 $
 */
public class FunctionCall extends AbstractEditorElement implements IliSyntax, java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394744420142 detail_begin "FunctionCall"

	// -end- 394744420142 detail_begin "FunctionCall"

	private static final long serialVersionUID = 5285882786864949643L;

	// -beg- preserve=no 3D4FA218027F head394744420142 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA218027F head394744420142 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA218027F throws394744420142 "unlinkAll"

	// -end- 3D4FA218027F throws394744420142 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA218027F body394744420142 "unlinkAll"

		// Role AttributeDef: AttributeDef object(s) may point to this
		// Role FactElement: FactElement object(s) may point to this
		clearArgument();
		detachFunctionDef();
		// Role ProjectionAttributeDef: ProjectionAttributeDef object(s) may
		// point to this
		setModel(null);
		setFunction(null);
		setSyntax(null);
		super.unlinkAll();
		// -end- 3D4FA218027F body394744420142 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA2180289 head394744420142 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA2180289 head394744420142 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA2180289 throws394744420142 "enumerateChildren"

	// -end- 3D4FA2180289 throws394744420142 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA2180289 body394744420142 "enumerateChildren"
		Iterator<?> it = null;
		it = iteratorArgument();
		while (it.hasNext())
			visitor.visit(it.next());
		visitor.visit(getModel());
		visitor.visit(getFunction());
		visitor.visit(getSyntax());
		super.enumerateChildren(visitor);
		// -end- 3D4FA2180289 body394744420142 "enumerateChildren"
	}

	// -beg- preserve=no 3960AE5B0006 code394744420142 "argument"
	private Set<Term> argument = new HashSet<Term>();
	// -end- 3960AE5B0006 code394744420142 "argument"

	/**
	 * add a Argument.
	 *
	 * @see #removeArgument
	 * @see #containsArgument
	 * @see #iteratorArgument
	 * @see #clearArgument
	 * @see #sizeArgument
	 */
	// -beg- preserve=no 3960AE5B0006 add_head394744420142
	// "FunctionCall::addArgument"
	public void addArgument(Term argument1)
	// -end- 3960AE5B0006 add_head394744420142 "FunctionCall::addArgument"
	{
		// -beg- preserve=no 3960AE5B0006 add_body394744420142
		// "FunctionCall::addArgument"
		argument.add(argument1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addArgument"));
		return;
		// -end- 3960AE5B0006 add_body394744420142 "FunctionCall::addArgument"
	}

	/**
	 * disconnect a Argument.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960AE5B0006 remove_head394744420142
	// "FunctionCall::removeArgument"
	public Term removeArgument(Term argument1)
	// -end- 3960AE5B0006 remove_head394744420142 "FunctionCall::removeArgument"
	{
		// -beg- preserve=no 3960AE5B0006 remove_body394744420142
		// "FunctionCall::removeArgument"
		Term ret = null;
		if (argument1 == null || !argument.contains(argument1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = argument1;
		argument.remove(argument1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeArgument"));
		return ret;
		// -end- 3960AE5B0006 remove_body394744420142
		// "FunctionCall::removeArgument"
	}

	/**
	 * tests if a given Argument is connected.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960AE5B0006 test_head394744420142
	// "FunctionCall::containsArgument"
	public boolean containsArgument(Term argument1)
	// -end- 3960AE5B0006 test_head394744420142 "FunctionCall::containsArgument"
	{
		// -beg- preserve=no 3960AE5B0006 test_body394744420142
		// "FunctionCall::containsArgument"
		return argument.contains(argument1);
		// -end- 3960AE5B0006 test_body394744420142
		// "FunctionCall::containsArgument"
	}

	/**
	 * used to enumerate all connected Arguments.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960AE5B0006 get_all_head394744420142
	// "FunctionCall::iteratorArgument"
	public Iterator<Term> iteratorArgument()
	// -end- 3960AE5B0006 get_all_head394744420142
	// "FunctionCall::iteratorArgument"
	{
		// -beg- preserve=no 3960AE5B0006 get_all_body394744420142
		// "FunctionCall::iteratorArgument"
		return argument.iterator();
		// -end- 3960AE5B0006 get_all_body394744420142
		// "FunctionCall::iteratorArgument"
	}

	/**
	 * disconnect all Arguments.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960AE5B0006 remove_all_head394744420142
	// "FunctionCall::clearArgument"
	public void clearArgument()
	// -end- 3960AE5B0006 remove_all_head394744420142
	// "FunctionCall::clearArgument"
	{
		// -beg- preserve=no 3960AE5B0006 remove_all_body394744420142
		// "FunctionCall::clearArgument"
		if (sizeArgument() > 0) {
			argument.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearArgument"));
		}
		// -end- 3960AE5B0006 remove_all_body394744420142
		// "FunctionCall::clearArgument"
	}

	/**
	 * returns the number of Arguments.
	 * 
	 * @see #addArgument
	 */
	// -beg- preserve=no 3960AE5B0006 size_head394744420142
	// "FunctionCall::sizeArgument"
	public int sizeArgument()
	// -end- 3960AE5B0006 size_head394744420142 "FunctionCall::sizeArgument"
	{
		// -beg- preserve=no 3960AE5B0006 size_body394744420142
		// "FunctionCall::sizeArgument"
		return argument.size();
		// -end- 3960AE5B0006 size_body394744420142 "FunctionCall::sizeArgument"
	}

	// -beg- preserve=no 396C86B203B7 code394744420142 "functionDef"
	private FunctionDef functionDef;
	// -end- 396C86B203B7 code394744420142 "functionDef"

	/**
	 * attaches a FunctionDef.
	 *
	 * @see #detachFunctionDef
	 * @see #getFunctionDef
	 * @see #containsFunctionDef
	 */
	// -beg- preserve=no 396C86B203B7 attach_head394744420142
	// "FunctionCall::attachFunctionDef"
	public void attachFunctionDef(FunctionDef functionDef1)
	// -end- 396C86B203B7 attach_head394744420142
	// "FunctionCall::attachFunctionDef"
	{
		// -beg- preserve=no 396C86B203B7 attach_body394744420142
		// "FunctionCall::attachFunctionDef"
		if (functionDef != null) {
			throw new java.lang.IllegalStateException("already a functionDef attached");
		}
		if (functionDef1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as functionDef");
		}
		functionDef = functionDef1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachFunctionDef"));
		return;
		// -end- 396C86B203B7 attach_body394744420142
		// "FunctionCall::attachFunctionDef"
	}

	/**
	 * disconnect the currently attached FunctionDef.
	 * 
	 * @see #attachFunctionDef
	 */
	// -beg- preserve=no 396C86B203B7 detach_head394744420142
	// "FunctionCall::detachFunctionDef"
	public FunctionDef detachFunctionDef()
	// -end- 396C86B203B7 detach_head394744420142
	// "FunctionCall::detachFunctionDef"
	{
		// -beg- preserve=no 396C86B203B7 detach_body394744420142
		// "FunctionCall::detachFunctionDef"
		FunctionDef ret = null;
		ret = functionDef;
		functionDef = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachFunctionDef"));
		return ret;
		// -end- 396C86B203B7 detach_body394744420142
		// "FunctionCall::detachFunctionDef"
	}

	/**
	 * get the currently attached FunctionDef.
	 * 
	 * @see #attachFunctionDef
	 */
	// -beg- preserve=no 396C86B203B7 get_head394744420142
	// "FunctionCall::getFunctionDef"
	public FunctionDef getFunctionDef()
	// -end- 396C86B203B7 get_head394744420142 "FunctionCall::getFunctionDef"
	{
		// -beg- preserve=no 396C86B203B7 get_body394744420142
		// "FunctionCall::getFunctionDef"
		if (functionDef == null) {
			throw new java.lang.IllegalStateException("no functionDef attached");
		}
		return functionDef;
		// -end- 396C86B203B7 get_body394744420142
		// "FunctionCall::getFunctionDef"
	}

	/**
	 * tests if there is a FunctionDef attached.
	 * 
	 * @see #attachFunctionDef
	 */
	// -beg- preserve=no 396C86B203B7 test_head394744420142
	// "FunctionCall::containsFunctionDef"
	public boolean containsFunctionDef()
	// -end- 396C86B203B7 test_head394744420142
	// "FunctionCall::containsFunctionDef"
	{
		// -beg- preserve=no 396C86B203B7 test_body394744420142
		// "FunctionCall::containsFunctionDef"
		return functionDef != null;
		// -end- 396C86B203B7 test_body394744420142
		// "FunctionCall::containsFunctionDef"
	}

	// -beg- preserve=no 3960AE030186 var394744420142 "model"
	private NlsString model = null;
	// -end- 3960AE030186 var394744420142 "model"

	/**
	 * get current value of model Name des Modells in dem die Funktion definiert
	 * ist.
	 * 
	 * @see #setModel
	 */
	// -beg- preserve=no 3960AE030186 get_head394744420142 "model"
	public NlsString getModel()
	// -end- 3960AE030186 get_head394744420142 "model"
	{
		// -beg- preserve=no 3960AE030186 get_body394744420142 "model"
		return model;
		// -end- 3960AE030186 get_body394744420142 "model"
	}

	/**
	 * set current value of model
	 * 
	 * @see #getModel
	 */
	// -beg- preserve=no 3960AE030186 set_head394744420142 "model"
	public void setModel(NlsString value1)
	// -end- 3960AE030186 set_head394744420142 "model"
	{
		// -beg- preserve=no 3960AE030186 set_body394744420142 "model"
		if (model != value1 && (model == null || !model.equals(value1))) {
			model = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setModel"));
		}
		// -end- 3960AE030186 set_body394744420142 "model"
	}

	// -beg- preserve=no 3960AE0903A2 var394744420142 "function"
	private NlsString function = null;
	// -end- 3960AE0903A2 var394744420142 "function"

	/**
	 * get current value of function Name der Funktion.
	 * 
	 * @see #setFunction
	 */
	// -beg- preserve=no 3960AE0903A2 get_head394744420142 "function"
	public NlsString getFunction()
	// -end- 3960AE0903A2 get_head394744420142 "function"
	{
		// -beg- preserve=no 3960AE0903A2 get_body394744420142 "function"
		return function;
		// -end- 3960AE0903A2 get_body394744420142 "function"
	}

	/**
	 * set current value of function
	 * 
	 * @see #getFunction
	 */
	// -beg- preserve=no 3960AE0903A2 set_head394744420142 "function"
	public void setFunction(NlsString value1)
	// -end- 3960AE0903A2 set_head394744420142 "function"
	{
		// -beg- preserve=no 3960AE0903A2 set_body394744420142 "function"
		if (function != value1 && (function == null || !function.equals(value1))) {
			function = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setFunction"));
		}
		// -end- 3960AE0903A2 set_body394744420142 "function"
	}

	// -beg- preserve=no 3C8F5ABE022D var394744420142 "syntax"
	private NlsString syntax = null;
	// -end- 3C8F5ABE022D var394744420142 "syntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head394744420142 "syntax"
	public NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head394744420142 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D get_body394744420142 "syntax"
		return syntax;
		// -end- 3C8F5ABE022D get_body394744420142 "syntax"
	}

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head394744420142 "syntax"
	public void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head394744420142 "syntax"
	{
		// -beg- preserve=no 3C8F5ABE022D set_body394744420142 "syntax"
		if (syntax != value1 && (syntax == null || !syntax.equals(value1))) {
			syntax = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setSyntax"));
		}
		// -end- 3C8F5ABE022D set_body394744420142 "syntax"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394744420142 detail_end "FunctionCall"

	// -end- 394744420142 detail_end "FunctionCall"

}
