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


// -beg- preserve=no 394A2CF303A7 package "PlausibilityConstraint"
package ch.ehi.interlis.constraints;
// -end- 394A2CF303A7 package "PlausibilityConstraint"

// -beg- preserve=no 394A2CF303A7 autoimport "PlausibilityConstraint"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.interlis.logicalexpressions.Term;
import ch.ehi.interlis.constraints.PlausibilityKind;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 394A2CF303A7 autoimport "PlausibilityConstraint"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 394A2CF303A7 import "PlausibilityConstraint"

// -end- 394A2CF303A7 import "PlausibilityConstraint"

/** Definiert eine Konsistenzbedingung.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:54 $
 */
public class PlausibilityConstraint extends AbstractEditorElement implements java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 394A2CF303A7 detail_begin "PlausibilityConstraint"

// -end- 394A2CF303A7 detail_begin "PlausibilityConstraint"

// -beg- preserve=no 3D4FA2180198 head394A2CF303A7 "unlinkAll"
public void unlinkAll()
// -end- 3D4FA2180198 head394A2CF303A7 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2180198 throws394A2CF303A7 "unlinkAll"

// -end- 3D4FA2180198 throws394A2CF303A7 "unlinkAll"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2180198 body394A2CF303A7 "unlinkAll"

        // Role ConstraintExpression: ConstraintExpression object(s) may point to this
        detachExpression();
        super.unlinkAll();
        // -end- 3D4FA2180198 body394A2CF303A7 "unlinkAll"
}

// -beg- preserve=no 3D4FA2180199 head394A2CF303A7 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3D4FA2180199 head394A2CF303A7 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D4FA2180199 throws394A2CF303A7 "enumerateChildren"

// -end- 3D4FA2180199 throws394A2CF303A7 "enumerateChildren"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3D4FA2180199 body394A2CF303A7 "enumerateChildren"
        java.util.Iterator it=null;
        if(containsExpression()) visitor.visit(getExpression());
        super.enumerateChildren(visitor);
        // -end- 3D4FA2180199 body394A2CF303A7 "enumerateChildren"
}

// -beg- preserve=no 39620D660070 code394A2CF303A7 "expression"
private Term expression;
// -end- 39620D660070 code394A2CF303A7 "expression"

/** attaches a Expression.
 *
 *  @see #detachExpression
 *  @see #getExpression
 *  @see #containsExpression
 */
// -beg- preserve=no 39620D660070 attach_head394A2CF303A7 "PlausibilityConstraint::attachExpression"
public void attachExpression(Term expression1)
// -end- 39620D660070 attach_head394A2CF303A7 "PlausibilityConstraint::attachExpression"
{
        // -beg- preserve=no 39620D660070 attach_body394A2CF303A7 "PlausibilityConstraint::attachExpression"
        if(expression!=null) {throw new java.lang.IllegalStateException("already a expression attached");}
        if(expression1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as expression");}
        expression = expression1;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachExpression"));
        return;
        // -end- 39620D660070 attach_body394A2CF303A7 "PlausibilityConstraint::attachExpression"
}

/** disconnect the currently attached Expression.
 *  @see #attachExpression
 */
// -beg- preserve=no 39620D660070 detach_head394A2CF303A7 "PlausibilityConstraint::detachExpression"
public Term detachExpression()
// -end- 39620D660070 detach_head394A2CF303A7 "PlausibilityConstraint::detachExpression"
{
        // -beg- preserve=no 39620D660070 detach_body394A2CF303A7 "PlausibilityConstraint::detachExpression"
        Term ret = null;
        ret = expression;
        expression = null;
        ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachExpression"));
        return ret;
        // -end- 39620D660070 detach_body394A2CF303A7 "PlausibilityConstraint::detachExpression"
}

/** get the currently attached Expression.
 *  @see #attachExpression
 */
// -beg- preserve=no 39620D660070 get_head394A2CF303A7 "PlausibilityConstraint::getExpression"
public Term getExpression()
// -end- 39620D660070 get_head394A2CF303A7 "PlausibilityConstraint::getExpression"
{
        // -beg- preserve=no 39620D660070 get_body394A2CF303A7 "PlausibilityConstraint::getExpression"
        if(expression==null) {throw new java.lang.IllegalStateException("no expression attached");}
        return expression;
        // -end- 39620D660070 get_body394A2CF303A7 "PlausibilityConstraint::getExpression"
}

/** tests if there is a Expression attached.
 *  @see #attachExpression
 */
// -beg- preserve=no 39620D660070 test_head394A2CF303A7 "PlausibilityConstraint::containsExpression"
public boolean containsExpression()
// -end- 39620D660070 test_head394A2CF303A7 "PlausibilityConstraint::containsExpression"
{
        // -beg- preserve=no 39620D660070 test_body394A2CF303A7 "PlausibilityConstraint::containsExpression"
        return expression!=null;
        // -end- 39620D660070 test_body394A2CF303A7 "PlausibilityConstraint::containsExpression"
}

// -beg- preserve=no 394A305B033D var394A2CF303A7 "kind"
private int kind;
// -end- 394A305B033D var394A2CF303A7 "kind"

/** get current value of kind
 *  MANDATORY, LESSTHAN oder MORETHAN
 *  @see ch.ehi.interlis.constraints.PlausibilityKind
 *  @see #setKind
 */
// -beg- preserve=no 394A305B033D get_head394A2CF303A7 "kind"
public int getKind()
// -end- 394A305B033D get_head394A2CF303A7 "kind"
{
        // -beg- preserve=no 394A305B033D get_body394A2CF303A7 "kind"
        return kind;
        // -end- 394A305B033D get_body394A2CF303A7 "kind"
}

/** set current value of kind
 *  @see ch.ehi.interlis.constraints.PlausibilityKind
 *  @see #getKind
 */
// -beg- preserve=no 394A305B033D set_head394A2CF303A7 "kind"
public void setKind(int value1)
// -end- 394A305B033D set_head394A2CF303A7 "kind"
{
        // -beg- preserve=no 394A305B033D set_body394A2CF303A7 "kind"
        if(kind != value1) {
                kind = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
        }
        // -end- 394A305B033D set_body394A2CF303A7 "kind"
}

// -beg- preserve=no 394A3074018A var394A2CF303A7 "percentage"
private double percentage;
// -end- 394A3074018A var394A2CF303A7 "percentage"

/** get current value of percentage
 *  Prozentanteil der Instanzen der Klasse die die Bedingung erfüllen müssen
 *  @see #setPercentage
 */
// -beg- preserve=no 394A3074018A get_head394A2CF303A7 "percentage"
public double getPercentage()
// -end- 394A3074018A get_head394A2CF303A7 "percentage"
{
        // -beg- preserve=no 394A3074018A get_body394A2CF303A7 "percentage"
        return percentage;
        // -end- 394A3074018A get_body394A2CF303A7 "percentage"
}

/** set current value of percentage
 *  @see #getPercentage
 */
// -beg- preserve=no 394A3074018A set_head394A2CF303A7 "percentage"
public void setPercentage(double value1)
// -end- 394A3074018A set_head394A2CF303A7 "percentage"
{
        // -beg- preserve=no 394A3074018A set_body394A2CF303A7 "percentage"
        if(percentage != value1) {
                percentage = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setPercentage"));
        }
        // -end- 394A3074018A set_body394A2CF303A7 "percentage"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 394A2CF303A7 detail_end "PlausibilityConstraint"

// -end- 394A2CF303A7 detail_end "PlausibilityConstraint"

}
