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


          // -beg- preserve=no 3961FCE30307 package "EnumAssignment"
package ch.ehi.interlis.graphicdescriptions;
          // -end- 3961FCE30307 package "EnumAssignment"

          // -beg- preserve=no 3961FCE30307 autoimport "EnumAssignment"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.domainsandconstants.basetypes.Constant;
          import ch.ehi.interlis.graphicdescriptions.EnumRange;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3961FCE30307 autoimport "EnumAssignment"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3961FCE30307 import "EnumAssignment"

          // -end- 3961FCE30307 import "EnumAssignment"

          /** Definiert den Werte eines Signatur-Parameters basierend auf einer Aufzaehlung.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:50 $
           */
public class EnumAssignment extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3961FCE30307 detail_begin "EnumAssignment"

            // -end- 3961FCE30307 detail_begin "EnumAssignment"

            // -beg- preserve=no 3D4FA21900A9 head3961FCE30307 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21900A9 head3961FCE30307 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21900A9 throws3961FCE30307 "unlinkAll"

              // -end- 3D4FA21900A9 throws3961FCE30307 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21900A9 body3961FCE30307 "unlinkAll"
              
              // Role SigAssignment: SigAssignment object(s) may point to this
              detachConstant();
              detachEnumRange();
              super.unlinkAll();
              // -end- 3D4FA21900A9 body3961FCE30307 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21900AA head3961FCE30307 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21900AA head3961FCE30307 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21900AA throws3961FCE30307 "enumerateChildren"

              // -end- 3D4FA21900AA throws3961FCE30307 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21900AA body3961FCE30307 "enumerateChildren"
              java.util.Iterator it=null;
              if(containsConstant())visitor.visit(getConstant());
              if(containsEnumRange())visitor.visit(getEnumRange());
              super.enumerateChildren(visitor);
              // -end- 3D4FA21900AA body3961FCE30307 "enumerateChildren"
              }

            // -beg- preserve=no 3961FDC803D9 code3961FCE30307 "constant"
            private Constant constant;
            // -end- 3961FDC803D9 code3961FCE30307 "constant"

            /** attaches a Constant.
             *  
             *  @see #detachConstant
             *  @see #getConstant
             *  @see #containsConstant
             */
            // -beg- preserve=no 3961FDC803D9 attach_head3961FCE30307 "EnumAssignment::attachConstant"
            public void attachConstant(Constant constant1)
            // -end- 3961FDC803D9 attach_head3961FCE30307 "EnumAssignment::attachConstant"
            {
              // -beg- preserve=no 3961FDC803D9 attach_body3961FCE30307 "EnumAssignment::attachConstant"
              if(constant!=null) {throw new java.lang.IllegalStateException("already a constant attached");}
              if(constant1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as constant");}
              constant = constant1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachConstant"));
              return;
              // -end- 3961FDC803D9 attach_body3961FCE30307 "EnumAssignment::attachConstant"
            }

            /** disconnect the currently attached Constant.
             *  @see #attachConstant
             */
            // -beg- preserve=no 3961FDC803D9 detach_head3961FCE30307 "EnumAssignment::detachConstant"
            public Constant detachConstant()
            // -end- 3961FDC803D9 detach_head3961FCE30307 "EnumAssignment::detachConstant"
            {
              // -beg- preserve=no 3961FDC803D9 detach_body3961FCE30307 "EnumAssignment::detachConstant"
              Constant ret = null;
              ret = constant;
              constant = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachConstant"));
              return ret;
              // -end- 3961FDC803D9 detach_body3961FCE30307 "EnumAssignment::detachConstant"
            }

            /** get the currently attached Constant.
             *  @see #attachConstant
             */
            // -beg- preserve=no 3961FDC803D9 get_head3961FCE30307 "EnumAssignment::getConstant"
            public Constant getConstant()
            // -end- 3961FDC803D9 get_head3961FCE30307 "EnumAssignment::getConstant"
            {
              // -beg- preserve=no 3961FDC803D9 get_body3961FCE30307 "EnumAssignment::getConstant"
              if(constant==null) {throw new java.lang.IllegalStateException("no constant attached");}
              return constant;
              // -end- 3961FDC803D9 get_body3961FCE30307 "EnumAssignment::getConstant"
            }

            /** tests if there is a Constant attached.
             *  @see #attachConstant
             */
            // -beg- preserve=no 3961FDC803D9 test_head3961FCE30307 "EnumAssignment::containsConstant"
            public boolean containsConstant()
            // -end- 3961FDC803D9 test_head3961FCE30307 "EnumAssignment::containsConstant"
            {
              // -beg- preserve=no 3961FDC803D9 test_body3961FCE30307 "EnumAssignment::containsConstant"
              return constant!=null;
              // -end- 3961FDC803D9 test_body3961FCE30307 "EnumAssignment::containsConstant"
            }

            // -beg- preserve=no 3961FDCE0049 code3961FCE30307 "enumRange"
            private EnumRange enumRange;
            // -end- 3961FDCE0049 code3961FCE30307 "enumRange"

            /** attaches a EnumRange.
             *  
             *  @see #detachEnumRange
             *  @see #getEnumRange
             *  @see #containsEnumRange
             */
            // -beg- preserve=no 3961FDCE0049 attach_head3961FCE30307 "EnumAssignment::attachEnumRange"
            public void attachEnumRange(EnumRange enumRange1)
            // -end- 3961FDCE0049 attach_head3961FCE30307 "EnumAssignment::attachEnumRange"
            {
              // -beg- preserve=no 3961FDCE0049 attach_body3961FCE30307 "EnumAssignment::attachEnumRange"
              if(enumRange!=null) {throw new java.lang.IllegalStateException("already a enumRange attached");}
              if(enumRange1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as enumRange");}
              enumRange = enumRange1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachEnumRange"));
              return;
              // -end- 3961FDCE0049 attach_body3961FCE30307 "EnumAssignment::attachEnumRange"
            }

            /** disconnect the currently attached EnumRange.
             *  @see #attachEnumRange
             */
            // -beg- preserve=no 3961FDCE0049 detach_head3961FCE30307 "EnumAssignment::detachEnumRange"
            public EnumRange detachEnumRange()
            // -end- 3961FDCE0049 detach_head3961FCE30307 "EnumAssignment::detachEnumRange"
            {
              // -beg- preserve=no 3961FDCE0049 detach_body3961FCE30307 "EnumAssignment::detachEnumRange"
              EnumRange ret = null;
              ret = enumRange;
              enumRange = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachEnumRange"));
              return ret;
              // -end- 3961FDCE0049 detach_body3961FCE30307 "EnumAssignment::detachEnumRange"
            }

            /** get the currently attached EnumRange.
             *  @see #attachEnumRange
             */
            // -beg- preserve=no 3961FDCE0049 get_head3961FCE30307 "EnumAssignment::getEnumRange"
            public EnumRange getEnumRange()
            // -end- 3961FDCE0049 get_head3961FCE30307 "EnumAssignment::getEnumRange"
            {
              // -beg- preserve=no 3961FDCE0049 get_body3961FCE30307 "EnumAssignment::getEnumRange"
              if(enumRange==null) {throw new java.lang.IllegalStateException("no enumRange attached");}
              return enumRange;
              // -end- 3961FDCE0049 get_body3961FCE30307 "EnumAssignment::getEnumRange"
            }

            /** tests if there is a EnumRange attached.
             *  @see #attachEnumRange
             */
            // -beg- preserve=no 3961FDCE0049 test_head3961FCE30307 "EnumAssignment::containsEnumRange"
            public boolean containsEnumRange()
            // -end- 3961FDCE0049 test_head3961FCE30307 "EnumAssignment::containsEnumRange"
            {
              // -beg- preserve=no 3961FDCE0049 test_body3961FCE30307 "EnumAssignment::containsEnumRange"
              return enumRange!=null;
              // -end- 3961FDCE0049 test_body3961FCE30307 "EnumAssignment::containsEnumRange"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3961FCE30307 detail_end "EnumAssignment"

            // -end- 3961FCE30307 detail_end "EnumAssignment"

          }

