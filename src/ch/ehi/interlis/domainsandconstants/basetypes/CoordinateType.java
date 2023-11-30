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


              // -beg- preserve=no 394886B10363 package "CoordinateType"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 394886B10363 package "CoordinateType"

              // -beg- preserve=no 394886B10363 autoimport "CoordinateType"
              import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
              import ch.ehi.interlis.domainsandconstants.basetypes.RotationDef;
              import ch.ehi.interlis.domainsandconstants.basetypes.NumericalType;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 394886B10363 autoimport "CoordinateType"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 394886B10363 import "CoordinateType"

              // -end- 394886B10363 import "CoordinateType"

              /** Definiert einen Koordinatendatentyp.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:16 $
               */
public class CoordinateType extends BaseType implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 394886B10363 detail_begin "CoordinateType"

                // -end- 394886B10363 detail_begin "CoordinateType"

                // -beg- preserve=no 3D4FA21B0106 head394886B10363 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B0106 head394886B10363 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0106 throws394886B10363 "unlinkAll"

                  // -end- 3D4FA21B0106 throws394886B10363 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0106 body394886B10363 "unlinkAll"
                  
                  detachRotationDef();
                  clearDim();
                  super.unlinkAll();
                  // -end- 3D4FA21B0106 body394886B10363 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B0107 head394886B10363 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B0107 head394886B10363 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0107 throws394886B10363 "enumerateChildren"

                  // -end- 3D4FA21B0107 throws394886B10363 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0107 body394886B10363 "enumerateChildren"
                  java.util.Iterator it=null;
                  if(containsRotationDef())visitor.visit(getRotationDef());
                  it=iteratorDim();while(it.hasNext())visitor.visit(it.next());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B0107 body394886B10363 "enumerateChildren"
                  }

                // -beg- preserve=no 3948DEA400C1 code394886B10363 "rotationDef"
                private RotationDef rotationDef;
                // -end- 3948DEA400C1 code394886B10363 "rotationDef"

                /** attaches a RotationDef.
                 *  defines the anchor and the orientation of the coordinate data type
                 *  @see #detachRotationDef
                 *  @see #getRotationDef
                 *  @see #containsRotationDef
                 */
                // -beg- preserve=no 3948DEA400C1 attach_head394886B10363 "CoordinateType::attachRotationDef"
                public void attachRotationDef(RotationDef rotationDef1)
                // -end- 3948DEA400C1 attach_head394886B10363 "CoordinateType::attachRotationDef"
                {
                  // -beg- preserve=no 3948DEA400C1 attach_body394886B10363 "CoordinateType::attachRotationDef"
                  if(rotationDef!=null) {throw new java.lang.IllegalStateException("already a rotationDef attached");}
                  if(rotationDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as rotationDef");}
                  rotationDef = rotationDef1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachRotationDef"));
                  return;
                  // -end- 3948DEA400C1 attach_body394886B10363 "CoordinateType::attachRotationDef"
                }

                /** disconnect the currently attached RotationDef.
                 *  @see #attachRotationDef
                 */
                // -beg- preserve=no 3948DEA400C1 detach_head394886B10363 "CoordinateType::detachRotationDef"
                public RotationDef detachRotationDef()
                // -end- 3948DEA400C1 detach_head394886B10363 "CoordinateType::detachRotationDef"
                {
                  // -beg- preserve=no 3948DEA400C1 detach_body394886B10363 "CoordinateType::detachRotationDef"
                  RotationDef ret = null;
                  ret = rotationDef;
                  rotationDef = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachRotationDef"));
                  return ret;
                  // -end- 3948DEA400C1 detach_body394886B10363 "CoordinateType::detachRotationDef"
                }

                /** get the currently attached RotationDef.
                 *  @see #attachRotationDef
                 */
                // -beg- preserve=no 3948DEA400C1 get_head394886B10363 "CoordinateType::getRotationDef"
                public RotationDef getRotationDef()
                // -end- 3948DEA400C1 get_head394886B10363 "CoordinateType::getRotationDef"
                {
                  // -beg- preserve=no 3948DEA400C1 get_body394886B10363 "CoordinateType::getRotationDef"
                  if(rotationDef==null) {throw new java.lang.IllegalStateException("no rotationDef attached");}
                  return rotationDef;
                  // -end- 3948DEA400C1 get_body394886B10363 "CoordinateType::getRotationDef"
                }

                /** tests if there is a RotationDef attached.
                 *  @see #attachRotationDef
                 */
                // -beg- preserve=no 3948DEA400C1 test_head394886B10363 "CoordinateType::containsRotationDef"
                public boolean containsRotationDef()
                // -end- 3948DEA400C1 test_head394886B10363 "CoordinateType::containsRotationDef"
                {
                  // -beg- preserve=no 3948DEA400C1 test_body394886B10363 "CoordinateType::containsRotationDef"
                  return rotationDef!=null;
                  // -end- 3948DEA400C1 test_body394886B10363 "CoordinateType::containsRotationDef"
                }

                // -beg- preserve=no 39EEB6C10061 code394886B10363 "dim"
                private java.util.List dim = new java.util.ArrayList();
                // -end- 39EEB6C10061 code394886B10363 "dim"

                /** add a Dim.
                 *  the domain for each of the dimensions of the coordinate
                 *  @see #removeDim
                 *  @see #containsDim
                 *  @see #iteratorDim
                 *  @see #clearDim
                 *  @see #sizeDim
                 */
                // -beg- preserve=no 39EEB6C10061 add_head394886B10363 "CoordinateType::addDim"
                public void addDim(NumericalType dim1)
                // -end- 39EEB6C10061 add_head394886B10363 "CoordinateType::addDim"
                {
                  // -beg- preserve=no 39EEB6C10061 add_body394886B10363 "CoordinateType::addDim"
                  dim.add(dim1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDim"));
                  return;
                  // -end- 39EEB6C10061 add_body394886B10363 "CoordinateType::addDim"
                }

                // -beg- preserve=no 39EEB6C10061 add2_head394886B10363 "CoordinateType::add2Dim"
                public void addDim(int index,NumericalType dim1)
                // -end- 39EEB6C10061 add2_head394886B10363 "CoordinateType::add2Dim"
                {
                  // -beg- preserve=no 39EEB6C10061 add2_body394886B10363 "CoordinateType::add2Dim"
                  dim.add(index,dim1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addDim"));
                  return;
                  // -end- 39EEB6C10061 add2_body394886B10363 "CoordinateType::add2Dim"
                }

                /** disconnect a Dim.
                 *  @see #addDim
                 */
                // -beg- preserve=no 39EEB6C10061 remove_head394886B10363 "CoordinateType::removeDim"
                public NumericalType removeDim(NumericalType dim1)
                // -end- 39EEB6C10061 remove_head394886B10363 "CoordinateType::removeDim"
                {
                  // -beg- preserve=no 39EEB6C10061 remove_body394886B10363 "CoordinateType::removeDim"
                  NumericalType ret=null;
                  if(dim1==null || !dim.contains(dim1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = dim1;
                  dim.remove(dim1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDim"));
                  return ret;
                  // -end- 39EEB6C10061 remove_body394886B10363 "CoordinateType::removeDim"
                }

                /** disconnect a Dim.
                 *  @see #addDim
                 */
                // -beg- preserve=no 39EEB6C10061 remove2_head394886B10363 "CoordinateType::remove2Dim"
                public NumericalType removeDim(int index)
                // -end- 39EEB6C10061 remove2_head394886B10363 "CoordinateType::remove2Dim"
                {
                  // -beg- preserve=no 39EEB6C10061 remove2_body394886B10363 "CoordinateType::remove2Dim"
                  NumericalType ret=null;
                  ret = (NumericalType)dim.remove(index);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeDim"));
                  return ret;
                  // -end- 39EEB6C10061 remove2_body394886B10363 "CoordinateType::remove2Dim"
                }

                /** change a Dim.
                 *  @see #addDim
                 */
                // -beg- preserve=no 39EEB6C10061 set_head394886B10363 "CoordinateType::setDim"
                public NumericalType setDim(int index,NumericalType dim1)
                // -end- 39EEB6C10061 set_head394886B10363 "CoordinateType::setDim"
                {
                  // -beg- preserve=no 39EEB6C10061 set_body394886B10363 "CoordinateType::setDim"
                  NumericalType ret=null;
                  ret = (NumericalType)dim.set(index,dim1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDim"));
                  return ret;
                  // -end- 39EEB6C10061 set_body394886B10363 "CoordinateType::setDim"
                }

                /** tests if a given Dim is connected.
                 *  @see #addDim
                 */
                // -beg- preserve=no 39EEB6C10061 test_head394886B10363 "CoordinateType::containsDim"
                public boolean containsDim(NumericalType dim1)
                // -end- 39EEB6C10061 test_head394886B10363 "CoordinateType::containsDim"
                {
                  // -beg- preserve=no 39EEB6C10061 test_body394886B10363 "CoordinateType::containsDim"
                  return dim.contains(dim1);
                  // -end- 39EEB6C10061 test_body394886B10363 "CoordinateType::containsDim"
                }

                /** used to enumerate all connected Dims.
                 *  @see #addDim
                 */
                // -beg- preserve=no 39EEB6C10061 get_all_head394886B10363 "CoordinateType::iteratorDim"
                public java.util.Iterator iteratorDim()
                // -end- 39EEB6C10061 get_all_head394886B10363 "CoordinateType::iteratorDim"
                {
                  // -beg- preserve=no 39EEB6C10061 get_all_body394886B10363 "CoordinateType::iteratorDim"
                  return dim.iterator();
                  // -end- 39EEB6C10061 get_all_body394886B10363 "CoordinateType::iteratorDim"
                }

                /** disconnect all Dims.
                 *  @see #addDim
                 */
                // -beg- preserve=no 39EEB6C10061 remove_all_head394886B10363 "CoordinateType::clearDim"
                public void clearDim()
                // -end- 39EEB6C10061 remove_all_head394886B10363 "CoordinateType::clearDim"
                {
                  // -beg- preserve=no 39EEB6C10061 remove_all_body394886B10363 "CoordinateType::clearDim"
                  if(sizeDim()>0){
                    dim.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearDim"));
                  }
                  // -end- 39EEB6C10061 remove_all_body394886B10363 "CoordinateType::clearDim"
                }

                /** returns the number of Dims.
                 *  @see #addDim
                 */
                // -beg- preserve=no 39EEB6C10061 size_head394886B10363 "CoordinateType::sizeDim"
                public int sizeDim()
                // -end- 39EEB6C10061 size_head394886B10363 "CoordinateType::sizeDim"
                {
                  // -beg- preserve=no 39EEB6C10061 size_body394886B10363 "CoordinateType::sizeDim"
                  return dim.size();
                  // -end- 39EEB6C10061 size_body394886B10363 "CoordinateType::sizeDim"
                }


				// declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=yes 394886B10363 detail_end "CoordinateType"
                private boolean _generic=false;
                public boolean isGeneric() {
					return _generic;
				}

				public void setGeneric(boolean generic) {
					this._generic = generic;
				}
                
                // -end- 394886B10363 detail_end "CoordinateType"

                private boolean isMulti;

                public boolean isMulti() {
                  return isMulti;
                }

                public void setMulti(boolean value) {
                  if (isMulti != value) {
                    isMulti = value;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this, "setMulti"));
                  }
                }

              }

