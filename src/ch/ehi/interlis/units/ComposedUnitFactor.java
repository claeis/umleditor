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


          // -beg- preserve=no 394A20F3001B package "ComposedUnitFactor"
package ch.ehi.interlis.units;
          // -end- 394A20F3001B package "ComposedUnitFactor"

          // -beg- preserve=no 394A20F3001B autoimport "ComposedUnitFactor"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.units.UnitDef;
          import ch.ehi.interlis.units.UnitFactorKind;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 394A20F3001B autoimport "ComposedUnitFactor"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 394A20F3001B import "ComposedUnitFactor"

          // -end- 394A20F3001B import "ComposedUnitFactor"

          /** Definiert einen Faktor für die Umrechnung der Einheit.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:18 $
           */
public class ComposedUnitFactor extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 394A20F3001B detail_begin "ComposedUnitFactor"

            // -end- 394A20F3001B detail_begin "ComposedUnitFactor"

            // -beg- preserve=no 3D4FA21800D0 head394A20F3001B "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21800D0 head394A20F3001B "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800D0 throws394A20F3001B "unlinkAll"

              // -end- 3D4FA21800D0 throws394A20F3001B "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800D0 body394A20F3001B "unlinkAll"
              
              detachUnitDef();
              // Role ComposedUnit: ComposedUnit object(s) may point to this
              super.unlinkAll();
              // -end- 3D4FA21800D0 body394A20F3001B "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21800DA head394A20F3001B "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21800DA head394A20F3001B "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800DA throws394A20F3001B "enumerateChildren"

              // -end- 3D4FA21800DA throws394A20F3001B "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800DA body394A20F3001B "enumerateChildren"
              java.util.Iterator it=null;
              if(containsUnitDef())visitor.visit(getUnitDef());
              super.enumerateChildren(visitor);
              // -end- 3D4FA21800DA body394A20F3001B "enumerateChildren"
              }

            // -beg- preserve=no 394A208C03B6 code394A20F3001B "unitDef"
            private UnitDef unitDef;
            // -end- 394A208C03B6 code394A20F3001B "unitDef"

            /** attaches a UnitDef.
             *  
             *  @see #detachUnitDef
             *  @see #getUnitDef
             *  @see #containsUnitDef
             */
            // -beg- preserve=no 394A208C03B6 attach_head394A20F3001B "ComposedUnitFactor::attachUnitDef"
            public void attachUnitDef(UnitDef unitDef1)
            // -end- 394A208C03B6 attach_head394A20F3001B "ComposedUnitFactor::attachUnitDef"
            {
              // -beg- preserve=no 394A208C03B6 attach_body394A20F3001B "ComposedUnitFactor::attachUnitDef"
              if(unitDef!=null) {throw new java.lang.IllegalStateException("already a unitDef attached");}
              if(unitDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as unitDef");}
              unitDef = unitDef1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachUnitDef"));
              return;
              // -end- 394A208C03B6 attach_body394A20F3001B "ComposedUnitFactor::attachUnitDef"
            }

            /** disconnect the currently attached UnitDef.
             *  @see #attachUnitDef
             */
            // -beg- preserve=no 394A208C03B6 detach_head394A20F3001B "ComposedUnitFactor::detachUnitDef"
            public UnitDef detachUnitDef()
            // -end- 394A208C03B6 detach_head394A20F3001B "ComposedUnitFactor::detachUnitDef"
            {
              // -beg- preserve=no 394A208C03B6 detach_body394A20F3001B "ComposedUnitFactor::detachUnitDef"
              UnitDef ret = null;
              ret = unitDef;
              unitDef = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachUnitDef"));
              return ret;
              // -end- 394A208C03B6 detach_body394A20F3001B "ComposedUnitFactor::detachUnitDef"
            }

            /** get the currently attached UnitDef.
             *  @see #attachUnitDef
             */
            // -beg- preserve=no 394A208C03B6 get_head394A20F3001B "ComposedUnitFactor::getUnitDef"
            public UnitDef getUnitDef()
            // -end- 394A208C03B6 get_head394A20F3001B "ComposedUnitFactor::getUnitDef"
            {
              // -beg- preserve=no 394A208C03B6 get_body394A20F3001B "ComposedUnitFactor::getUnitDef"
              if(unitDef==null) {throw new java.lang.IllegalStateException("no unitDef attached");}
              return unitDef;
              // -end- 394A208C03B6 get_body394A20F3001B "ComposedUnitFactor::getUnitDef"
            }

            /** tests if there is a UnitDef attached.
             *  @see #attachUnitDef
             */
            // -beg- preserve=no 394A208C03B6 test_head394A20F3001B "ComposedUnitFactor::containsUnitDef"
            public boolean containsUnitDef()
            // -end- 394A208C03B6 test_head394A20F3001B "ComposedUnitFactor::containsUnitDef"
            {
              // -beg- preserve=no 394A208C03B6 test_body394A20F3001B "ComposedUnitFactor::containsUnitDef"
              return unitDef!=null;
              // -end- 394A208C03B6 test_body394A20F3001B "ComposedUnitFactor::containsUnitDef"
            }

            // -beg- preserve=no 394A216A00D0 var394A20F3001B "op"
            private int op;
            // -end- 394A216A00D0 var394A20F3001B "op"

            /** get current value of op
             *  NOOP, MULTIPLICATION oder DIVISION
             *  @see ch.ehi.interlis.units.UnitFactorKind
             *  @see #setOp
             */
            // -beg- preserve=no 394A216A00D0 get_head394A20F3001B "op"
            public  int getOp()
            // -end- 394A216A00D0 get_head394A20F3001B "op"
            {
              // -beg- preserve=no 394A216A00D0 get_body394A20F3001B "op"
              return op;
              // -end- 394A216A00D0 get_body394A20F3001B "op"
            }

            /** set current value of op
             *  @see ch.ehi.interlis.units.UnitFactorKind
             *  @see #getOp
             */
            // -beg- preserve=no 394A216A00D0 set_head394A20F3001B "op"
            public  void setOp(int value1)
            // -end- 394A216A00D0 set_head394A20F3001B "op"
            {
              // -beg- preserve=no 394A216A00D0 set_body394A20F3001B "op"
              if(op != value1){
                op = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setOp"));
              }
              // -end- 394A216A00D0 set_body394A20F3001B "op"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 394A20F3001B detail_end "ComposedUnitFactor"

            // -end- 394A20F3001B detail_end "ComposedUnitFactor"

          }

