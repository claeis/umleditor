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


          // -beg- preserve=no 3949E75A01EE package "DerivedUnitFactor"
package ch.ehi.interlis.units;
          // -end- 3949E75A01EE package "DerivedUnitFactor"

          // -beg- preserve=no 3949E75A01EE autoimport "DerivedUnitFactor"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.units.UnitFactorKind;
          import ch.ehi.interlis.domainsandconstants.basetypes.BuiltinNumConst;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3949E75A01EE autoimport "DerivedUnitFactor"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3949E75A01EE import "DerivedUnitFactor"

          // -end- 3949E75A01EE import "DerivedUnitFactor"

          /** Definiert einen Faktor fuer die Umrechnung der Einheit.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:20 $
           */
public class DerivedUnitFactor extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3949E75A01EE detail_begin "DerivedUnitFactor"

            // -end- 3949E75A01EE detail_begin "DerivedUnitFactor"

            // -beg- preserve=no 3D4FA21800E4 head3949E75A01EE "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21800E4 head3949E75A01EE "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800E4 throws3949E75A01EE "unlinkAll"

              // -end- 3D4FA21800E4 throws3949E75A01EE "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800E4 body3949E75A01EE "unlinkAll"
              
              // Role DerivedUnit: DerivedUnit object(s) may point to this
              super.unlinkAll();
              // -end- 3D4FA21800E4 body3949E75A01EE "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21800EE head3949E75A01EE "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21800EE head3949E75A01EE "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800EE throws3949E75A01EE "enumerateChildren"

              // -end- 3D4FA21800EE throws3949E75A01EE "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21800EE body3949E75A01EE "enumerateChildren"
              java.util.Iterator it=null;
              super.enumerateChildren(visitor);
              // -end- 3D4FA21800EE body3949E75A01EE "enumerateChildren"
              }

            // -beg- preserve=no 3949E7B90208 var3949E75A01EE "op"
            private int op;
            // -end- 3949E7B90208 var3949E75A01EE "op"

            /** get current value of op
             *  NOOP, MULTIPLICATION oder DIVISION
             *  @see ch.ehi.interlis.units.UnitFactorKind
             *  @see #setOp
             */
            // -beg- preserve=no 3949E7B90208 get_head3949E75A01EE "op"
            public  int getOp()
            // -end- 3949E7B90208 get_head3949E75A01EE "op"
            {
              // -beg- preserve=no 3949E7B90208 get_body3949E75A01EE "op"
              return op;
              // -end- 3949E7B90208 get_body3949E75A01EE "op"
            }

            /** set current value of op
             *  @see ch.ehi.interlis.units.UnitFactorKind
             *  @see #getOp
             */
            // -beg- preserve=no 3949E7B90208 set_head3949E75A01EE "op"
            public  void setOp(int value1)
            // -end- 3949E7B90208 set_head3949E75A01EE "op"
            {
              // -beg- preserve=no 3949E7B90208 set_body3949E75A01EE "op"
              if(op != value1){
                op = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setOp"));
              }
              // -end- 3949E7B90208 set_body3949E75A01EE "op"
            }

            // -beg- preserve=no 394A1E9600CF var3949E75A01EE "builtin"
            private int builtin;
            // -end- 394A1E9600CF var3949E75A01EE "builtin"

            /** get current value of builtin
             *  USER oder PI
             *  @see ch.ehi.interlis.domainsandconstants.basetypes.BuiltinNumConst
             *  @see #setBuiltin
             */
            // -beg- preserve=no 394A1E9600CF get_head3949E75A01EE "builtin"
            public  int getBuiltin()
            // -end- 394A1E9600CF get_head3949E75A01EE "builtin"
            {
              // -beg- preserve=no 394A1E9600CF get_body3949E75A01EE "builtin"
              return builtin;
              // -end- 394A1E9600CF get_body3949E75A01EE "builtin"
            }

            /** set current value of builtin
             *  @see ch.ehi.interlis.domainsandconstants.basetypes.BuiltinNumConst
             *  @see #getBuiltin
             */
            // -beg- preserve=no 394A1E9600CF set_head3949E75A01EE "builtin"
            public  void setBuiltin(int value1)
            // -end- 394A1E9600CF set_head3949E75A01EE "builtin"
            {
              // -beg- preserve=no 394A1E9600CF set_body3949E75A01EE "builtin"
              if(builtin != value1){
                builtin = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBuiltin"));
              }
              // -end- 394A1E9600CF set_body3949E75A01EE "builtin"
            }

            // -beg- preserve=no 394A1EA80085 var3949E75A01EE "dec"
            private double dec;
            // -end- 394A1EA80085 var3949E75A01EE "dec"

            /** get current value of dec
             *  Der Wert des Faktors wenn builtin==USER
             *  @see #setDec
             */
            // -beg- preserve=no 394A1EA80085 get_head3949E75A01EE "dec"
            public  double getDec()
            // -end- 394A1EA80085 get_head3949E75A01EE "dec"
            {
              // -beg- preserve=no 394A1EA80085 get_body3949E75A01EE "dec"
              return dec;
              // -end- 394A1EA80085 get_body3949E75A01EE "dec"
            }

            /** set current value of dec
             *  @see #getDec
             */
            // -beg- preserve=no 394A1EA80085 set_head3949E75A01EE "dec"
            public  void setDec(double value1)
            // -end- 394A1EA80085 set_head3949E75A01EE "dec"
            {
              // -beg- preserve=no 394A1EA80085 set_body3949E75A01EE "dec"
              if(dec != value1){
                dec = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDec"));
              }
              // -end- 394A1EA80085 set_body3949E75A01EE "dec"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3949E75A01EE detail_end "DerivedUnitFactor"

            // -end- 3949E75A01EE detail_end "DerivedUnitFactor"

          }

