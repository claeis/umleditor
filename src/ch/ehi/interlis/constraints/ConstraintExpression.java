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


          // -beg- preserve=no 3C178A0A03B5 package "ConstraintExpression"
package ch.ehi.interlis.constraints;
          // -end- 3C178A0A03B5 package "ConstraintExpression"

          // -beg- preserve=no 3C178A0A03B5 autoimport "ConstraintExpression"
          import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
          import ch.ehi.interlis.IliSyntax;
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.constraints.PlausibilityConstraint;
          import ch.ehi.interlis.constraints.UniquenessConstraint;
          import ch.ehi.basics.tools.AbstractVisitor;
          import ch.ehi.basics.types.NlsString;
          // -end- 3C178A0A03B5 autoimport "ConstraintExpression"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3C178A0A03B5 import "ConstraintExpression"

          // -end- 3C178A0A03B5 import "ConstraintExpression"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:53 $
           */
public class ConstraintExpression extends AbstractEditorElement implements BooleanExpression , IliSyntax , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C178A0A03B5 detail_begin "ConstraintExpression"

            // -end- 3C178A0A03B5 detail_begin "ConstraintExpression"

            // -beg- preserve=no 3D4FA21801C0 head3C178A0A03B5 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21801C0 head3C178A0A03B5 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21801C0 throws3C178A0A03B5 "unlinkAll"

              // -end- 3D4FA21801C0 throws3C178A0A03B5 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21801C0 body3C178A0A03B5 "unlinkAll"
              
              detachPlausibility();
              detachUniqueness();
              setSyntax(null);
              setBody(null);
              super.unlinkAll();
              // -end- 3D4FA21801C0 body3C178A0A03B5 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21801C1 head3C178A0A03B5 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21801C1 head3C178A0A03B5 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21801C1 throws3C178A0A03B5 "enumerateChildren"

              // -end- 3D4FA21801C1 throws3C178A0A03B5 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21801C1 body3C178A0A03B5 "enumerateChildren"
              java.util.Iterator it=null;
              if(containsPlausibility())visitor.visit(getPlausibility());
              if(containsUniqueness())visitor.visit(getUniqueness());
              visitor.visit(getSyntax());
              visitor.visit(getBody());
              super.enumerateChildren(visitor);
              // -end- 3D4FA21801C1 body3C178A0A03B5 "enumerateChildren"
              }

            // -beg- preserve=no 394A2E3C01FD code3C178A0A03B5 "plausibility"
            private PlausibilityConstraint plausibility;
            // -end- 394A2E3C01FD code3C178A0A03B5 "plausibility"

            /** attaches a Plausibility.
             *  
             *  @see #detachPlausibility
             *  @see #getPlausibility
             *  @see #containsPlausibility
             */
            // -beg- preserve=no 394A2E3C01FD attach_head3C178A0A03B5 "ConstraintExpression::attachPlausibility"
            public void attachPlausibility(PlausibilityConstraint plausibility1)
            // -end- 394A2E3C01FD attach_head3C178A0A03B5 "ConstraintExpression::attachPlausibility"
            {
              // -beg- preserve=no 394A2E3C01FD attach_body3C178A0A03B5 "ConstraintExpression::attachPlausibility"
              if(plausibility!=null) {throw new java.lang.IllegalStateException("already a plausibility attached");}
              if(plausibility1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as plausibility");}
              plausibility = plausibility1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachPlausibility"));
              return;
              // -end- 394A2E3C01FD attach_body3C178A0A03B5 "ConstraintExpression::attachPlausibility"
            }

            /** disconnect the currently attached Plausibility.
             *  @see #attachPlausibility
             */
            // -beg- preserve=no 394A2E3C01FD detach_head3C178A0A03B5 "ConstraintExpression::detachPlausibility"
            public PlausibilityConstraint detachPlausibility()
            // -end- 394A2E3C01FD detach_head3C178A0A03B5 "ConstraintExpression::detachPlausibility"
            {
              // -beg- preserve=no 394A2E3C01FD detach_body3C178A0A03B5 "ConstraintExpression::detachPlausibility"
              PlausibilityConstraint ret = null;
              ret = plausibility;
              plausibility = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachPlausibility"));
              return ret;
              // -end- 394A2E3C01FD detach_body3C178A0A03B5 "ConstraintExpression::detachPlausibility"
            }

            /** get the currently attached Plausibility.
             *  @see #attachPlausibility
             */
            // -beg- preserve=no 394A2E3C01FD get_head3C178A0A03B5 "ConstraintExpression::getPlausibility"
            public PlausibilityConstraint getPlausibility()
            // -end- 394A2E3C01FD get_head3C178A0A03B5 "ConstraintExpression::getPlausibility"
            {
              // -beg- preserve=no 394A2E3C01FD get_body3C178A0A03B5 "ConstraintExpression::getPlausibility"
              if(plausibility==null) {throw new java.lang.IllegalStateException("no plausibility attached");}
              return plausibility;
              // -end- 394A2E3C01FD get_body3C178A0A03B5 "ConstraintExpression::getPlausibility"
            }

            /** tests if there is a Plausibility attached.
             *  @see #attachPlausibility
             */
            // -beg- preserve=no 394A2E3C01FD test_head3C178A0A03B5 "ConstraintExpression::containsPlausibility"
            public boolean containsPlausibility()
            // -end- 394A2E3C01FD test_head3C178A0A03B5 "ConstraintExpression::containsPlausibility"
            {
              // -beg- preserve=no 394A2E3C01FD test_body3C178A0A03B5 "ConstraintExpression::containsPlausibility"
              return plausibility!=null;
              // -end- 394A2E3C01FD test_body3C178A0A03B5 "ConstraintExpression::containsPlausibility"
            }

            // -beg- preserve=no 394A2E3E03C2 code3C178A0A03B5 "uniqueness"
            private UniquenessConstraint uniqueness;
            // -end- 394A2E3E03C2 code3C178A0A03B5 "uniqueness"

            /** attaches a Uniqueness.
             *  
             *  @see #detachUniqueness
             *  @see #getUniqueness
             *  @see #containsUniqueness
             */
            // -beg- preserve=no 394A2E3E03C2 attach_head3C178A0A03B5 "ConstraintExpression::attachUniqueness"
            public void attachUniqueness(UniquenessConstraint uniqueness1)
            // -end- 394A2E3E03C2 attach_head3C178A0A03B5 "ConstraintExpression::attachUniqueness"
            {
              // -beg- preserve=no 394A2E3E03C2 attach_body3C178A0A03B5 "ConstraintExpression::attachUniqueness"
              if(uniqueness!=null) {throw new java.lang.IllegalStateException("already a uniqueness attached");}
              if(uniqueness1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as uniqueness");}
              uniqueness = uniqueness1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachUniqueness"));
              return;
              // -end- 394A2E3E03C2 attach_body3C178A0A03B5 "ConstraintExpression::attachUniqueness"
            }

            /** disconnect the currently attached Uniqueness.
             *  @see #attachUniqueness
             */
            // -beg- preserve=no 394A2E3E03C2 detach_head3C178A0A03B5 "ConstraintExpression::detachUniqueness"
            public UniquenessConstraint detachUniqueness()
            // -end- 394A2E3E03C2 detach_head3C178A0A03B5 "ConstraintExpression::detachUniqueness"
            {
              // -beg- preserve=no 394A2E3E03C2 detach_body3C178A0A03B5 "ConstraintExpression::detachUniqueness"
              UniquenessConstraint ret = null;
              ret = uniqueness;
              uniqueness = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachUniqueness"));
              return ret;
              // -end- 394A2E3E03C2 detach_body3C178A0A03B5 "ConstraintExpression::detachUniqueness"
            }

            /** get the currently attached Uniqueness.
             *  @see #attachUniqueness
             */
            // -beg- preserve=no 394A2E3E03C2 get_head3C178A0A03B5 "ConstraintExpression::getUniqueness"
            public UniquenessConstraint getUniqueness()
            // -end- 394A2E3E03C2 get_head3C178A0A03B5 "ConstraintExpression::getUniqueness"
            {
              // -beg- preserve=no 394A2E3E03C2 get_body3C178A0A03B5 "ConstraintExpression::getUniqueness"
              if(uniqueness==null) {throw new java.lang.IllegalStateException("no uniqueness attached");}
              return uniqueness;
              // -end- 394A2E3E03C2 get_body3C178A0A03B5 "ConstraintExpression::getUniqueness"
            }

            /** tests if there is a Uniqueness attached.
             *  @see #attachUniqueness
             */
            // -beg- preserve=no 394A2E3E03C2 test_head3C178A0A03B5 "ConstraintExpression::containsUniqueness"
            public boolean containsUniqueness()
            // -end- 394A2E3E03C2 test_head3C178A0A03B5 "ConstraintExpression::containsUniqueness"
            {
              // -beg- preserve=no 394A2E3E03C2 test_body3C178A0A03B5 "ConstraintExpression::containsUniqueness"
              return uniqueness!=null;
              // -end- 394A2E3E03C2 test_body3C178A0A03B5 "ConstraintExpression::containsUniqueness"
            }

            // -beg- preserve=no 3C8F5ABE022D var3C178A0A03B5 "syntax"
            private NlsString syntax = null;
            // -end- 3C8F5ABE022D var3C178A0A03B5 "syntax"

            /** get current value of syntax
             *  the actual definition of the model element in valid INTERLIS syntax.
             *  @see #setSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D get_head3C178A0A03B5 "syntax"
            public  NlsString getSyntax()
            // -end- 3C8F5ABE022D get_head3C178A0A03B5 "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D get_body3C178A0A03B5 "syntax"
              return syntax;
              // -end- 3C8F5ABE022D get_body3C178A0A03B5 "syntax"
            }

            /** set current value of syntax
             *  @see #getSyntax
             */
            // -beg- preserve=no 3C8F5ABE022D set_head3C178A0A03B5 "syntax"
            public  void setSyntax(NlsString value1)
            // -end- 3C8F5ABE022D set_head3C178A0A03B5 "syntax"
            {
              // -beg- preserve=no 3C8F5ABE022D set_body3C178A0A03B5 "syntax"
              if(syntax!=value1 && (syntax==null || !syntax.equals(value1))){
                syntax = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
              }
              // -end- 3C8F5ABE022D set_body3C178A0A03B5 "syntax"
            }

            // -beg- preserve=no 33E12E5F01CA var3C178A0A03B5 "language"
            private String language;
            // -end- 33E12E5F01CA var3C178A0A03B5 "language"

            /** get current value of language
             *  @see #setLanguage
             */
            // -beg- preserve=no 33E12E5F01CA get_head3C178A0A03B5 "language"
            public  String getLanguage()
            // -end- 33E12E5F01CA get_head3C178A0A03B5 "language"
            {
              // -beg- preserve=no 33E12E5F01CA get_body3C178A0A03B5 "language"
              return language;
              // -end- 33E12E5F01CA get_body3C178A0A03B5 "language"
            }

            /** set current value of language
             *  @see #getLanguage
             */
            // -beg- preserve=no 33E12E5F01CA set_head3C178A0A03B5 "language"
            public  void setLanguage(String value1)
            // -end- 33E12E5F01CA set_head3C178A0A03B5 "language"
            {
              // -beg- preserve=no 33E12E5F01CA set_body3C178A0A03B5 "language"
              if(language != value1){
                language = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLanguage"));
              }
              // -end- 33E12E5F01CA set_body3C178A0A03B5 "language"
            }

            // -beg- preserve=no 33E12E870203 var3C178A0A03B5 "body"
            private NlsString body = null;
            // -end- 33E12E870203 var3C178A0A03B5 "body"

            /** get current value of body
             *  @see #setBody
             */
            // -beg- preserve=no 33E12E870203 get_head3C178A0A03B5 "body"
            public  NlsString getBody()
            // -end- 33E12E870203 get_head3C178A0A03B5 "body"
            {
              // -beg- preserve=no 33E12E870203 get_body3C178A0A03B5 "body"
              return body;
              // -end- 33E12E870203 get_body3C178A0A03B5 "body"
            }

            /** set current value of body
             *  @see #getBody
             */
            // -beg- preserve=no 33E12E870203 set_head3C178A0A03B5 "body"
            public  void setBody(NlsString value1)
            // -end- 33E12E870203 set_head3C178A0A03B5 "body"
            {
              // -beg- preserve=no 33E12E870203 set_body3C178A0A03B5 "body"
              if(body!=value1 && (body==null || !body.equals(value1))){
                body = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBody"));
              }
              // -end- 33E12E870203 set_body3C178A0A03B5 "body"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C178A0A03B5 detail_end "ConstraintExpression"

            // -end- 3C178A0A03B5 detail_end "ConstraintExpression"

          }

