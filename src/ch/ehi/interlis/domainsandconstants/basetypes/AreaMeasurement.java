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


              // -beg- preserve=no 358A66DF006A package "AreaMeasurement"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 358A66DF006A package "AreaMeasurement"

              // -beg- preserve=no 358A66DF006A autoimport "AreaMeasurement"
              import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
              import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 358A66DF006A autoimport "AreaMeasurement"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 358A66DF006A import "AreaMeasurement"

              // -end- 358A66DF006A import "AreaMeasurement"

              /** Wird nur in INTERLIS1 verwendet.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:08 $
               */
public class AreaMeasurement extends BaseType implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A66DF006A detail_begin "AreaMeasurement"

                // -end- 358A66DF006A detail_begin "AreaMeasurement"

                // -beg- preserve=no 3D4FA21B004A head358A66DF006A "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B004A head358A66DF006A "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B004A throws358A66DF006A "unlinkAll"

                  // -end- 3D4FA21B004A throws358A66DF006A "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B004A body358A66DF006A "unlinkAll"
                  
                  setMini(null);
                  setMaxi(null);
                  super.unlinkAll();
                  // -end- 3D4FA21B004A body358A66DF006A "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B004B head358A66DF006A "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B004B head358A66DF006A "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B004B throws358A66DF006A "enumerateChildren"

                  // -end- 3D4FA21B004B throws358A66DF006A "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B004B body358A66DF006A "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getMini());
                  visitor.visit(getMaxi());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B004B body358A66DF006A "enumerateChildren"
                  }

                // -beg- preserve=no 358A689901BA var358A66DF006A "mini"
                private IliDim mini = null;
                // -end- 358A689901BA var358A66DF006A "mini"

                /** get current value of mini
                 *  min Flächenmass
                 *  @see #setMini
                 */
                // -beg- preserve=no 358A689901BA get_head358A66DF006A "mini"
                public  IliDim getMini()
                // -end- 358A689901BA get_head358A66DF006A "mini"
                {
                  // -beg- preserve=no 358A689901BA get_body358A66DF006A "mini"
                  return mini;
                  // -end- 358A689901BA get_body358A66DF006A "mini"
                }

                /** set current value of mini
                 *  @see #getMini
                 */
                // -beg- preserve=no 358A689901BA set_head358A66DF006A "mini"
                public  void setMini(IliDim value1)
                // -end- 358A689901BA set_head358A66DF006A "mini"
                {
                  // -beg- preserve=no 358A689901BA set_body358A66DF006A "mini"
                  if(mini!=value1 && (mini==null || !mini.equals(value1))){
                    mini = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMini"));
                  }
                  // -end- 358A689901BA set_body358A66DF006A "mini"
                }

                // -beg- preserve=no 358A68A10252 var358A66DF006A "maxi"
                private IliDim maxi = null;
                // -end- 358A68A10252 var358A66DF006A "maxi"

                /** get current value of maxi
                 *  max Flächenmass
                 *  @see #setMaxi
                 */
                // -beg- preserve=no 358A68A10252 get_head358A66DF006A "maxi"
                public  IliDim getMaxi()
                // -end- 358A68A10252 get_head358A66DF006A "maxi"
                {
                  // -beg- preserve=no 358A68A10252 get_body358A66DF006A "maxi"
                  return maxi;
                  // -end- 358A68A10252 get_body358A66DF006A "maxi"
                }

                /** set current value of maxi
                 *  @see #getMaxi
                 */
                // -beg- preserve=no 358A68A10252 set_head358A66DF006A "maxi"
                public  void setMaxi(IliDim value1)
                // -end- 358A68A10252 set_head358A66DF006A "maxi"
                {
                  // -beg- preserve=no 358A68A10252 set_body358A66DF006A "maxi"
                  if(maxi!=value1 && (maxi==null || !maxi.equals(value1))){
                    maxi = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMaxi"));
                  }
                  // -end- 358A68A10252 set_body358A66DF006A "maxi"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A66DF006A detail_end "AreaMeasurement"

                // -end- 358A66DF006A detail_end "AreaMeasurement"

              }

