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


              // -beg- preserve=no 358A66D40000 package "Coord3"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 358A66D40000 package "Coord3"

              // -beg- preserve=no 358A66D40000 autoimport "Coord3"
              import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
              import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 358A66D40000 autoimport "Coord3"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 358A66D40000 import "Coord3"

              // -end- 358A66D40000 import "Coord3"

              /** Wird nur in INTERLIS1 verwendet.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:14 $
               */
public class Coord3 extends BaseType implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A66D40000 detail_begin "Coord3"

                // -end- 358A66D40000 detail_begin "Coord3"

                // -beg- preserve=no 3D4FA21B0037 head358A66D40000 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B0037 head358A66D40000 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0037 throws358A66D40000 "unlinkAll"

                  // -end- 3D4FA21B0037 throws358A66D40000 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0037 body358A66D40000 "unlinkAll"
                  
                  setEmin(null);
                  setEmax(null);
                  setNmin(null);
                  setNmax(null);
                  setHmin(null);
                  setHmax(null);
                  super.unlinkAll();
                  // -end- 3D4FA21B0037 body358A66D40000 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B003E head358A66D40000 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B003E head358A66D40000 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B003E throws358A66D40000 "enumerateChildren"

                  // -end- 3D4FA21B003E throws358A66D40000 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B003E body358A66D40000 "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getEmin());
                  visitor.visit(getEmax());
                  visitor.visit(getNmin());
                  visitor.visit(getNmax());
                  visitor.visit(getHmin());
                  visitor.visit(getHmax());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B003E body358A66D40000 "enumerateChildren"
                  }

                // -beg- preserve=no 358A6860017C var358A66D40000 "emin"
                private IliDim emin = null;
                // -end- 358A6860017C var358A66D40000 "emin"

                /** get current value of emin
                 *  min Ostwert
                 *  @see #setEmin
                 */
                // -beg- preserve=no 358A6860017C get_head358A66D40000 "emin"
                public  IliDim getEmin()
                // -end- 358A6860017C get_head358A66D40000 "emin"
                {
                  // -beg- preserve=no 358A6860017C get_body358A66D40000 "emin"
                  return emin;
                  // -end- 358A6860017C get_body358A66D40000 "emin"
                }

                /** set current value of emin
                 *  @see #getEmin
                 */
                // -beg- preserve=no 358A6860017C set_head358A66D40000 "emin"
                public  void setEmin(IliDim value1)
                // -end- 358A6860017C set_head358A66D40000 "emin"
                {
                  // -beg- preserve=no 358A6860017C set_body358A66D40000 "emin"
                  if(emin!=value1 && (emin==null || !emin.equals(value1))){
                    emin = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setEmin"));
                  }
                  // -end- 358A6860017C set_body358A66D40000 "emin"
                }

                // -beg- preserve=no 358A686500C5 var358A66D40000 "emax"
                private IliDim emax = null;
                // -end- 358A686500C5 var358A66D40000 "emax"

                /** get current value of emax
                 *  max Ostwert
                 *  @see #setEmax
                 */
                // -beg- preserve=no 358A686500C5 get_head358A66D40000 "emax"
                public  IliDim getEmax()
                // -end- 358A686500C5 get_head358A66D40000 "emax"
                {
                  // -beg- preserve=no 358A686500C5 get_body358A66D40000 "emax"
                  return emax;
                  // -end- 358A686500C5 get_body358A66D40000 "emax"
                }

                /** set current value of emax
                 *  @see #getEmax
                 */
                // -beg- preserve=no 358A686500C5 set_head358A66D40000 "emax"
                public  void setEmax(IliDim value1)
                // -end- 358A686500C5 set_head358A66D40000 "emax"
                {
                  // -beg- preserve=no 358A686500C5 set_body358A66D40000 "emax"
                  if(emax!=value1 && (emax==null || !emax.equals(value1))){
                    emax = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setEmax"));
                  }
                  // -end- 358A686500C5 set_body358A66D40000 "emax"
                }

                // -beg- preserve=no 358A686901C5 var358A66D40000 "nmin"
                private IliDim nmin = null;
                // -end- 358A686901C5 var358A66D40000 "nmin"

                /** get current value of nmin
                 *  min Nordwert
                 *  @see #setNmin
                 */
                // -beg- preserve=no 358A686901C5 get_head358A66D40000 "nmin"
                public  IliDim getNmin()
                // -end- 358A686901C5 get_head358A66D40000 "nmin"
                {
                  // -beg- preserve=no 358A686901C5 get_body358A66D40000 "nmin"
                  return nmin;
                  // -end- 358A686901C5 get_body358A66D40000 "nmin"
                }

                /** set current value of nmin
                 *  @see #getNmin
                 */
                // -beg- preserve=no 358A686901C5 set_head358A66D40000 "nmin"
                public  void setNmin(IliDim value1)
                // -end- 358A686901C5 set_head358A66D40000 "nmin"
                {
                  // -beg- preserve=no 358A686901C5 set_body358A66D40000 "nmin"
                  if(nmin!=value1 && (nmin==null || !nmin.equals(value1))){
                    nmin = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setNmin"));
                  }
                  // -end- 358A686901C5 set_body358A66D40000 "nmin"
                }

                // -beg- preserve=no 358A686F00A1 var358A66D40000 "nmax"
                private IliDim nmax = null;
                // -end- 358A686F00A1 var358A66D40000 "nmax"

                /** get current value of nmax
                 *  max Nordwert
                 *  @see #setNmax
                 */
                // -beg- preserve=no 358A686F00A1 get_head358A66D40000 "nmax"
                public  IliDim getNmax()
                // -end- 358A686F00A1 get_head358A66D40000 "nmax"
                {
                  // -beg- preserve=no 358A686F00A1 get_body358A66D40000 "nmax"
                  return nmax;
                  // -end- 358A686F00A1 get_body358A66D40000 "nmax"
                }

                /** set current value of nmax
                 *  @see #getNmax
                 */
                // -beg- preserve=no 358A686F00A1 set_head358A66D40000 "nmax"
                public  void setNmax(IliDim value1)
                // -end- 358A686F00A1 set_head358A66D40000 "nmax"
                {
                  // -beg- preserve=no 358A686F00A1 set_body358A66D40000 "nmax"
                  if(nmax!=value1 && (nmax==null || !nmax.equals(value1))){
                    nmax = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setNmax"));
                  }
                  // -end- 358A686F00A1 set_body358A66D40000 "nmax"
                }

                // -beg- preserve=no 362741A0016F var358A66D40000 "hmin"
                private IliDim hmin = null;
                // -end- 362741A0016F var358A66D40000 "hmin"

                /** get current value of hmin
                 *  min Höhenwert
                 *  @see #setHmin
                 */
                // -beg- preserve=no 362741A0016F get_head358A66D40000 "hmin"
                public  IliDim getHmin()
                // -end- 362741A0016F get_head358A66D40000 "hmin"
                {
                  // -beg- preserve=no 362741A0016F get_body358A66D40000 "hmin"
                  return hmin;
                  // -end- 362741A0016F get_body358A66D40000 "hmin"
                }

                /** set current value of hmin
                 *  @see #getHmin
                 */
                // -beg- preserve=no 362741A0016F set_head358A66D40000 "hmin"
                public  void setHmin(IliDim value1)
                // -end- 362741A0016F set_head358A66D40000 "hmin"
                {
                  // -beg- preserve=no 362741A0016F set_body358A66D40000 "hmin"
                  if(hmin!=value1 && (hmin==null || !hmin.equals(value1))){
                    hmin = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setHmin"));
                  }
                  // -end- 362741A0016F set_body358A66D40000 "hmin"
                }

                // -beg- preserve=no 362741BC0269 var358A66D40000 "hmax"
                private IliDim hmax = null;
                // -end- 362741BC0269 var358A66D40000 "hmax"

                /** get current value of hmax
                 *  max Höhenwert
                 *  @see #setHmax
                 */
                // -beg- preserve=no 362741BC0269 get_head358A66D40000 "hmax"
                public  IliDim getHmax()
                // -end- 362741BC0269 get_head358A66D40000 "hmax"
                {
                  // -beg- preserve=no 362741BC0269 get_body358A66D40000 "hmax"
                  return hmax;
                  // -end- 362741BC0269 get_body358A66D40000 "hmax"
                }

                /** set current value of hmax
                 *  @see #getHmax
                 */
                // -beg- preserve=no 362741BC0269 set_head358A66D40000 "hmax"
                public  void setHmax(IliDim value1)
                // -end- 362741BC0269 set_head358A66D40000 "hmax"
                {
                  // -beg- preserve=no 362741BC0269 set_body358A66D40000 "hmax"
                  if(hmax!=value1 && (hmax==null || !hmax.equals(value1))){
                    hmax = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setHmax"));
                  }
                  // -end- 362741BC0269 set_body358A66D40000 "hmax"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A66D40000 detail_end "Coord3"

                // -end- 358A66D40000 detail_end "Coord3"

              }

