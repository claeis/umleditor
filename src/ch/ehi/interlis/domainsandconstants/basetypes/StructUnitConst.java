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


              // -beg- preserve=no 3948D4320116 package "StructUnitConst"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 3948D4320116 package "StructUnitConst"

              // -beg- preserve=no 3948D4320116 autoimport "StructUnitConst"
              import ch.ehi.interlis.domainsandconstants.basetypes.Constant;
              import ch.ehi.interlis.units.UnitDef;
              import ch.ehi.interlis.domainsandconstants.basetypes.StructDec;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 3948D4320116 autoimport "StructUnitConst"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3948D4320116 import "StructUnitConst"

              // -end- 3948D4320116 import "StructUnitConst"

              /** Definiert eine Strukturierte-Zahl-Konstante.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:32 $
               */
public class StructUnitConst extends Constant implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3948D4320116 detail_begin "StructUnitConst"

                // -end- 3948D4320116 detail_begin "StructUnitConst"

                // -beg- preserve=no 3D4FA21B01CF head3948D4320116 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B01CF head3948D4320116 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B01CF throws3948D4320116 "unlinkAll"

                  // -end- 3D4FA21B01CF throws3948D4320116 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B01CF body3948D4320116 "unlinkAll"
                  
                  detachUnitDef();
                  setStructDec(null);
                  super.unlinkAll();
                  // -end- 3D4FA21B01CF body3948D4320116 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B01D9 head3948D4320116 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B01D9 head3948D4320116 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B01D9 throws3948D4320116 "enumerateChildren"

                  // -end- 3D4FA21B01D9 throws3948D4320116 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B01D9 body3948D4320116 "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getStructDec());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B01D9 body3948D4320116 "enumerateChildren"
                  }

                // -beg- preserve=no 3948D832026D code3948D4320116 "unitDef"
                private UnitDef unitDef;
                // -end- 3948D832026D code3948D4320116 "unitDef"

                /** attaches a UnitDef.
                 *  
                 *  @see #detachUnitDef
                 *  @see #getUnitDef
                 *  @see #containsUnitDef
                 */
                // -beg- preserve=no 3948D832026D attach_head3948D4320116 "StructUnitConst::attachUnitDef"
                public void attachUnitDef(UnitDef unitDef1)
                // -end- 3948D832026D attach_head3948D4320116 "StructUnitConst::attachUnitDef"
                {
                  // -beg- preserve=no 3948D832026D attach_body3948D4320116 "StructUnitConst::attachUnitDef"
                  if(unitDef!=null) {throw new java.lang.IllegalStateException("already a unitDef attached");}
                  if(unitDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as unitDef");}
                  unitDef = unitDef1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachUnitDef"));
                  return;
                  // -end- 3948D832026D attach_body3948D4320116 "StructUnitConst::attachUnitDef"
                }

                /** disconnect the currently attached UnitDef.
                 *  @see #attachUnitDef
                 */
                // -beg- preserve=no 3948D832026D detach_head3948D4320116 "StructUnitConst::detachUnitDef"
                public UnitDef detachUnitDef()
                // -end- 3948D832026D detach_head3948D4320116 "StructUnitConst::detachUnitDef"
                {
                  // -beg- preserve=no 3948D832026D detach_body3948D4320116 "StructUnitConst::detachUnitDef"
                  UnitDef ret = null;
                  ret = unitDef;
                  unitDef = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachUnitDef"));
                  return ret;
                  // -end- 3948D832026D detach_body3948D4320116 "StructUnitConst::detachUnitDef"
                }

                /** get the currently attached UnitDef.
                 *  @see #attachUnitDef
                 */
                // -beg- preserve=no 3948D832026D get_head3948D4320116 "StructUnitConst::getUnitDef"
                public UnitDef getUnitDef()
                // -end- 3948D832026D get_head3948D4320116 "StructUnitConst::getUnitDef"
                {
                  // -beg- preserve=no 3948D832026D get_body3948D4320116 "StructUnitConst::getUnitDef"
                  if(unitDef==null) {throw new java.lang.IllegalStateException("no unitDef attached");}
                  return unitDef;
                  // -end- 3948D832026D get_body3948D4320116 "StructUnitConst::getUnitDef"
                }

                /** tests if there is a UnitDef attached.
                 *  @see #attachUnitDef
                 */
                // -beg- preserve=no 3948D832026D test_head3948D4320116 "StructUnitConst::containsUnitDef"
                public boolean containsUnitDef()
                // -end- 3948D832026D test_head3948D4320116 "StructUnitConst::containsUnitDef"
                {
                  // -beg- preserve=no 3948D832026D test_body3948D4320116 "StructUnitConst::containsUnitDef"
                  return unitDef!=null;
                  // -end- 3948D832026D test_body3948D4320116 "StructUnitConst::containsUnitDef"
                }

                // -beg- preserve=no 3948D47B0270 var3948D4320116 "structDec"
                private StructDec structDec = null;
                // -end- 3948D47B0270 var3948D4320116 "structDec"

                /** get current value of structDec
                 *  Wert
                 *  @see #setStructDec
                 */
                // -beg- preserve=no 3948D47B0270 get_head3948D4320116 "structDec"
                public  StructDec getStructDec()
                // -end- 3948D47B0270 get_head3948D4320116 "structDec"
                {
                  // -beg- preserve=no 3948D47B0270 get_body3948D4320116 "structDec"
                  return structDec;
                  // -end- 3948D47B0270 get_body3948D4320116 "structDec"
                }

                /** set current value of structDec
                 *  @see #getStructDec
                 */
                // -beg- preserve=no 3948D47B0270 set_head3948D4320116 "structDec"
                public  void setStructDec(StructDec value1)
                // -end- 3948D47B0270 set_head3948D4320116 "structDec"
                {
                  // -beg- preserve=no 3948D47B0270 set_body3948D4320116 "structDec"
                  if(structDec!=value1 && (structDec==null || !structDec.equals(value1))){
                    structDec = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setStructDec"));
                  }
                  // -end- 3948D47B0270 set_body3948D4320116 "structDec"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3948D4320116 detail_end "StructUnitConst"

                // -end- 3948D4320116 detail_end "StructUnitConst"

              }

