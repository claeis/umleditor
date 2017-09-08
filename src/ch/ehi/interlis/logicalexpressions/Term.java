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

// -beg- preserve=no 394A41DB0213 package "Term"
package ch.ehi.interlis.logicalexpressions;
// -end- 394A41DB0213 package "Term"

// -beg- preserve=no 394A41DB0213 autoimport "Term"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.logicalexpressions.Factor;
import ch.ehi.interlis.logicalexpressions.TermKind;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 394A41DB0213 autoimport "Term"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394A41DB0213 import "Term"

// -end- 394A41DB0213 import "Term"

/**
 * Definiert einen Term innerhalb eines logischen Ausdruckes.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:08 $
 */
public class Term extends AbstractEditorElement implements java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394A41DB0213 detail_begin "Term"

	// -end- 394A41DB0213 detail_begin "Term"

	private static final long serialVersionUID = -6749949094647976038L;

	// -beg- preserve=no 3D4FA21801CA head394A41DB0213 "unlinkAll"
	public void unlinkAll()
	// -end- 3D4FA21801CA head394A41DB0213 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21801CA throws394A41DB0213 "unlinkAll"

	// -end- 3D4FA21801CA throws394A41DB0213 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21801CA body394A41DB0213 "unlinkAll"

		// Role PlausibilityConstraint: PlausibilityConstraint object(s) may
		// point to this
		// Role Parent: Term object(s) may point to this
		clearRight();
		detachFactor();
		detachLeft();
		// Role FunctionCall: FunctionCall object(s) may point to this
		// Role ViewDef: ViewDef object(s) may point to this
		// Role GraphicDef: GraphicDef object(s) may point to this
		// Role CondSigParamAss: CondSigParamAss object(s) may point to this
		super.unlinkAll();
		// -end- 3D4FA21801CA body394A41DB0213 "unlinkAll"
	}

	// -beg- preserve=no 3D4FA21801DE head394A41DB0213 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 3D4FA21801DE head394A41DB0213 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3D4FA21801DE throws394A41DB0213 "enumerateChildren"

	// -end- 3D4FA21801DE throws394A41DB0213 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 3D4FA21801DE body394A41DB0213 "enumerateChildren"
		java.util.Iterator it = null;
		it = iteratorRight();
		while (it.hasNext())
			visitor.visit(it.next());
		if (containsFactor())
			visitor.visit(getFactor());
		if (containsLeft())
			visitor.visit(getLeft());
		super.enumerateChildren(visitor);
		// -end- 3D4FA21801DE body394A41DB0213 "enumerateChildren"
	}

	// -beg- preserve=no 394A4203015D code394A41DB0213 "right"
	private java.util.Set right = new java.util.HashSet();
	// -end- 394A4203015D code394A41DB0213 "right"

	/**
	 * add a Right.
	 *
	 * @see #removeRight
	 * @see #containsRight
	 * @see #iteratorRight
	 * @see #clearRight
	 * @see #sizeRight
	 */
	// -beg- preserve=no 394A4203015D add_head394A41DB0213 "Term::addRight"
	public void addRight(Term right1)
	// -end- 394A4203015D add_head394A41DB0213 "Term::addRight"
	{
		// -beg- preserve=no 394A4203015D add_body394A41DB0213 "Term::addRight"
		right.add(right1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "addRight"));
		return;
		// -end- 394A4203015D add_body394A41DB0213 "Term::addRight"
	}

	/**
	 * disconnect a Right.
	 * 
	 * @see #addRight
	 */
	// -beg- preserve=no 394A4203015D remove_head394A41DB0213
	// "Term::removeRight"
	public Term removeRight(Term right1)
	// -end- 394A4203015D remove_head394A41DB0213 "Term::removeRight"
	{
		// -beg- preserve=no 394A4203015D remove_body394A41DB0213
		// "Term::removeRight"
		Term ret = null;
		if (right1 == null || !right.contains(right1)) {
			throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
		}
		ret = right1;
		right.remove(right1);
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "removeRight"));
		return ret;
		// -end- 394A4203015D remove_body394A41DB0213 "Term::removeRight"
	}

	/**
	 * tests if a given Right is connected.
	 * 
	 * @see #addRight
	 */
	// -beg- preserve=no 394A4203015D test_head394A41DB0213
	// "Term::containsRight"
	public boolean containsRight(Term right1)
	// -end- 394A4203015D test_head394A41DB0213 "Term::containsRight"
	{
		// -beg- preserve=no 394A4203015D test_body394A41DB0213
		// "Term::containsRight"
		return right.contains(right1);
		// -end- 394A4203015D test_body394A41DB0213 "Term::containsRight"
	}

	/**
	 * used to enumerate all connected Rights.
	 * 
	 * @see #addRight
	 */
	// -beg- preserve=no 394A4203015D get_all_head394A41DB0213
	// "Term::iteratorRight"
	public java.util.Iterator iteratorRight()
	// -end- 394A4203015D get_all_head394A41DB0213 "Term::iteratorRight"
	{
		// -beg- preserve=no 394A4203015D get_all_body394A41DB0213
		// "Term::iteratorRight"
		return right.iterator();
		// -end- 394A4203015D get_all_body394A41DB0213 "Term::iteratorRight"
	}

	/**
	 * disconnect all Rights.
	 * 
	 * @see #addRight
	 */
	// -beg- preserve=no 394A4203015D remove_all_head394A41DB0213
	// "Term::clearRight"
	public void clearRight()
	// -end- 394A4203015D remove_all_head394A41DB0213 "Term::clearRight"
	{
		// -beg- preserve=no 394A4203015D remove_all_body394A41DB0213
		// "Term::clearRight"
		if (sizeRight() > 0) {
			right.clear();
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "clearRight"));
		}
		// -end- 394A4203015D remove_all_body394A41DB0213 "Term::clearRight"
	}

	/**
	 * returns the number of Rights.
	 * 
	 * @see #addRight
	 */
	// -beg- preserve=no 394A4203015D size_head394A41DB0213 "Term::sizeRight"
	public int sizeRight()
	// -end- 394A4203015D size_head394A41DB0213 "Term::sizeRight"
	{
		// -beg- preserve=no 394A4203015D size_body394A41DB0213
		// "Term::sizeRight"
		return right.size();
		// -end- 394A4203015D size_body394A41DB0213 "Term::sizeRight"
	}

	// -beg- preserve=no 394A4207003F code394A41DB0213 "factor"
	private Factor factor;
	// -end- 394A4207003F code394A41DB0213 "factor"

	/**
	 * attaches a Factor.
	 *
	 * @see #detachFactor
	 * @see #getFactor
	 * @see #containsFactor
	 */
	// -beg- preserve=no 394A4207003F attach_head394A41DB0213
	// "Term::attachFactor"
	public void attachFactor(Factor factor1)
	// -end- 394A4207003F attach_head394A41DB0213 "Term::attachFactor"
	{
		// -beg- preserve=no 394A4207003F attach_body394A41DB0213
		// "Term::attachFactor"
		if (factor != null) {
			throw new java.lang.IllegalStateException("already a factor attached");
		}
		if (factor1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as factor");
		}
		factor = factor1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachFactor"));
		return;
		// -end- 394A4207003F attach_body394A41DB0213 "Term::attachFactor"
	}

	/**
	 * disconnect the currently attached Factor.
	 * 
	 * @see #attachFactor
	 */
	// -beg- preserve=no 394A4207003F detach_head394A41DB0213
	// "Term::detachFactor"
	public Factor detachFactor()
	// -end- 394A4207003F detach_head394A41DB0213 "Term::detachFactor"
	{
		// -beg- preserve=no 394A4207003F detach_body394A41DB0213
		// "Term::detachFactor"
		Factor ret = null;
		ret = factor;
		factor = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachFactor"));
		return ret;
		// -end- 394A4207003F detach_body394A41DB0213 "Term::detachFactor"
	}

	/**
	 * get the currently attached Factor.
	 * 
	 * @see #attachFactor
	 */
	// -beg- preserve=no 394A4207003F get_head394A41DB0213 "Term::getFactor"
	public Factor getFactor()
	// -end- 394A4207003F get_head394A41DB0213 "Term::getFactor"
	{
		// -beg- preserve=no 394A4207003F get_body394A41DB0213 "Term::getFactor"
		if (factor == null) {
			throw new java.lang.IllegalStateException("no factor attached");
		}
		return factor;
		// -end- 394A4207003F get_body394A41DB0213 "Term::getFactor"
	}

	/**
	 * tests if there is a Factor attached.
	 * 
	 * @see #attachFactor
	 */
	// -beg- preserve=no 394A4207003F test_head394A41DB0213
	// "Term::containsFactor"
	public boolean containsFactor()
	// -end- 394A4207003F test_head394A41DB0213 "Term::containsFactor"
	{
		// -beg- preserve=no 394A4207003F test_body394A41DB0213
		// "Term::containsFactor"
		return factor != null;
		// -end- 394A4207003F test_body394A41DB0213 "Term::containsFactor"
	}

	// -beg- preserve=no 394A421102BB code394A41DB0213 "left"
	private Term left;
	// -end- 394A421102BB code394A41DB0213 "left"

	/**
	 * attaches a Left.
	 *
	 * @see #detachLeft
	 * @see #getLeft
	 * @see #containsLeft
	 */
	// -beg- preserve=no 394A421102BB attach_head394A41DB0213 "Term::attachLeft"
	public void attachLeft(Term left1)
	// -end- 394A421102BB attach_head394A41DB0213 "Term::attachLeft"
	{
		// -beg- preserve=no 394A421102BB attach_body394A41DB0213
		// "Term::attachLeft"
		if (left != null) {
			throw new java.lang.IllegalStateException("already a left attached");
		}
		if (left1 == null) {
			throw new java.lang.IllegalArgumentException("null may not be attached as left");
		}
		left = left1;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "attachLeft"));
		return;
		// -end- 394A421102BB attach_body394A41DB0213 "Term::attachLeft"
	}

	/**
	 * disconnect the currently attached Left.
	 * 
	 * @see #attachLeft
	 */
	// -beg- preserve=no 394A421102BB detach_head394A41DB0213 "Term::detachLeft"
	public Term detachLeft()
	// -end- 394A421102BB detach_head394A41DB0213 "Term::detachLeft"
	{
		// -beg- preserve=no 394A421102BB detach_body394A41DB0213
		// "Term::detachLeft"
		Term ret = null;
		ret = left;
		left = null;
		ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
				.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "detachLeft"));
		return ret;
		// -end- 394A421102BB detach_body394A41DB0213 "Term::detachLeft"
	}

	/**
	 * get the currently attached Left.
	 * 
	 * @see #attachLeft
	 */
	// -beg- preserve=no 394A421102BB get_head394A41DB0213 "Term::getLeft"
	public Term getLeft()
	// -end- 394A421102BB get_head394A41DB0213 "Term::getLeft"
	{
		// -beg- preserve=no 394A421102BB get_body394A41DB0213 "Term::getLeft"
		if (left == null) {
			throw new java.lang.IllegalStateException("no left attached");
		}
		return left;
		// -end- 394A421102BB get_body394A41DB0213 "Term::getLeft"
	}

	/**
	 * tests if there is a Left attached.
	 * 
	 * @see #attachLeft
	 */
	// -beg- preserve=no 394A421102BB test_head394A41DB0213 "Term::containsLeft"
	public boolean containsLeft()
	// -end- 394A421102BB test_head394A41DB0213 "Term::containsLeft"
	{
		// -beg- preserve=no 394A421102BB test_body394A41DB0213
		// "Term::containsLeft"
		return left != null;
		// -end- 394A421102BB test_body394A41DB0213 "Term::containsLeft"
	}

	// -beg- preserve=no 394A442602E9 var394A41DB0213 "kind"
	private int kind = TermKind.NOOP;
	// -end- 394A442602E9 var394A41DB0213 "kind"

	/**
	 * get current value of kind NOOP, FACTOR, OR, AND, IMPL, NOT, EQ, NEQ, GLT,
	 * LEQ, GEQ, LT oder GT
	 * 
	 * @see ch.ehi.interlis.logicalexpressions.TermKind
	 * @see #setKind
	 */
	// -beg- preserve=no 394A442602E9 get_head394A41DB0213 "kind"
	public int getKind()
	// -end- 394A442602E9 get_head394A41DB0213 "kind"
	{
		// -beg- preserve=no 394A442602E9 get_body394A41DB0213 "kind"
		return kind;
		// -end- 394A442602E9 get_body394A41DB0213 "kind"
	}

	/**
	 * set current value of kind
	 * 
	 * @see ch.ehi.interlis.logicalexpressions.TermKind
	 * @see #getKind
	 */
	// -beg- preserve=no 394A442602E9 set_head394A41DB0213 "kind"
	public void setKind(int value1)
	// -end- 394A442602E9 set_head394A41DB0213 "kind"
	{
		// -beg- preserve=no 394A442602E9 set_body394A41DB0213 "kind"
		if (kind != value1) {
			kind = value1;
			ch.ehi.uml1_4.changepropagation.MetaModel.getInstance()
					.notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setKind"));
		}
		// -end- 394A442602E9 set_body394A41DB0213 "kind"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 394A41DB0213 detail_end "Term"

	// -end- 394A41DB0213 detail_end "Term"

}
