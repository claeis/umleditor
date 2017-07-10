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


          // -beg- preserve=no 3961FDB101A5 package "EnumRange"
package ch.ehi.interlis.graphicdescriptions;
          // -end- 3961FDB101A5 package "EnumRange"

          // -beg- preserve=no 3961FDB101A5 autoimport "EnumRange"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.domainsandconstants.basetypes.EnumerationConst;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3961FDB101A5 autoimport "EnumRange"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3961FDB101A5 import "EnumRange"

          // -end- 3961FDB101A5 import "EnumRange"

          /** Definiert eine Bereich innerhalb einer Aufzählung.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:51 $
           */
public class EnumRange extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3961FDB101A5 detail_begin "EnumRange"

            // -end- 3961FDB101A5 detail_begin "EnumRange"

            // -beg- preserve=no 3D4FA21900B4 head3961FDB101A5 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21900B4 head3961FDB101A5 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21900B4 throws3961FDB101A5 "unlinkAll"

              // -end- 3D4FA21900B4 throws3961FDB101A5 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21900B4 body3961FDB101A5 "unlinkAll"
              
              // Role EnumAssignment: EnumAssignment object(s) may point to this
              detachFrom();
              detachTo();
              super.unlinkAll();
              // -end- 3D4FA21900B4 body3961FDB101A5 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21900BD head3961FDB101A5 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21900BD head3961FDB101A5 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21900BD throws3961FDB101A5 "enumerateChildren"

              // -end- 3D4FA21900BD throws3961FDB101A5 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21900BD body3961FDB101A5 "enumerateChildren"
              java.util.Iterator it=null;
              if(containsFrom())visitor.visit(getFrom());
              if(containsTo())visitor.visit(getTo());
              super.enumerateChildren(visitor);
              // -end- 3D4FA21900BD body3961FDB101A5 "enumerateChildren"
              }

            // -beg- preserve=no 3961FE4103B5 code3961FDB101A5 "from"
            private EnumerationConst from;
            // -end- 3961FE4103B5 code3961FDB101A5 "from"

            /** attaches a From.
             *  
             *  @see #detachFrom
             *  @see #getFrom
             *  @see #containsFrom
             */
            // -beg- preserve=no 3961FE4103B5 attach_head3961FDB101A5 "EnumRange::attachFrom"
            public void attachFrom(EnumerationConst from1)
            // -end- 3961FE4103B5 attach_head3961FDB101A5 "EnumRange::attachFrom"
            {
              // -beg- preserve=no 3961FE4103B5 attach_body3961FDB101A5 "EnumRange::attachFrom"
              if(from!=null) {throw new java.lang.IllegalStateException("already a from attached");}
              if(from1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as from");}
              from = from1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachFrom"));
              return;
              // -end- 3961FE4103B5 attach_body3961FDB101A5 "EnumRange::attachFrom"
            }

            /** disconnect the currently attached From.
             *  @see #attachFrom
             */
            // -beg- preserve=no 3961FE4103B5 detach_head3961FDB101A5 "EnumRange::detachFrom"
            public EnumerationConst detachFrom()
            // -end- 3961FE4103B5 detach_head3961FDB101A5 "EnumRange::detachFrom"
            {
              // -beg- preserve=no 3961FE4103B5 detach_body3961FDB101A5 "EnumRange::detachFrom"
              EnumerationConst ret = null;
              ret = from;
              from = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachFrom"));
              return ret;
              // -end- 3961FE4103B5 detach_body3961FDB101A5 "EnumRange::detachFrom"
            }

            /** get the currently attached From.
             *  @see #attachFrom
             */
            // -beg- preserve=no 3961FE4103B5 get_head3961FDB101A5 "EnumRange::getFrom"
            public EnumerationConst getFrom()
            // -end- 3961FE4103B5 get_head3961FDB101A5 "EnumRange::getFrom"
            {
              // -beg- preserve=no 3961FE4103B5 get_body3961FDB101A5 "EnumRange::getFrom"
              if(from==null) {throw new java.lang.IllegalStateException("no from attached");}
              return from;
              // -end- 3961FE4103B5 get_body3961FDB101A5 "EnumRange::getFrom"
            }

            /** tests if there is a From attached.
             *  @see #attachFrom
             */
            // -beg- preserve=no 3961FE4103B5 test_head3961FDB101A5 "EnumRange::containsFrom"
            public boolean containsFrom()
            // -end- 3961FE4103B5 test_head3961FDB101A5 "EnumRange::containsFrom"
            {
              // -beg- preserve=no 3961FE4103B5 test_body3961FDB101A5 "EnumRange::containsFrom"
              return from!=null;
              // -end- 3961FE4103B5 test_body3961FDB101A5 "EnumRange::containsFrom"
            }

            // -beg- preserve=no 3961FE480314 code3961FDB101A5 "to"
            private EnumerationConst to;
            // -end- 3961FE480314 code3961FDB101A5 "to"

            /** attaches a To.
             *  
             *  @see #detachTo
             *  @see #getTo
             *  @see #containsTo
             */
            // -beg- preserve=no 3961FE480314 attach_head3961FDB101A5 "EnumRange::attachTo"
            public void attachTo(EnumerationConst to1)
            // -end- 3961FE480314 attach_head3961FDB101A5 "EnumRange::attachTo"
            {
              // -beg- preserve=no 3961FE480314 attach_body3961FDB101A5 "EnumRange::attachTo"
              if(to!=null) {throw new java.lang.IllegalStateException("already a to attached");}
              if(to1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as to");}
              to = to1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachTo"));
              return;
              // -end- 3961FE480314 attach_body3961FDB101A5 "EnumRange::attachTo"
            }

            /** disconnect the currently attached To.
             *  @see #attachTo
             */
            // -beg- preserve=no 3961FE480314 detach_head3961FDB101A5 "EnumRange::detachTo"
            public EnumerationConst detachTo()
            // -end- 3961FE480314 detach_head3961FDB101A5 "EnumRange::detachTo"
            {
              // -beg- preserve=no 3961FE480314 detach_body3961FDB101A5 "EnumRange::detachTo"
              EnumerationConst ret = null;
              ret = to;
              to = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachTo"));
              return ret;
              // -end- 3961FE480314 detach_body3961FDB101A5 "EnumRange::detachTo"
            }

            /** get the currently attached To.
             *  @see #attachTo
             */
            // -beg- preserve=no 3961FE480314 get_head3961FDB101A5 "EnumRange::getTo"
            public EnumerationConst getTo()
            // -end- 3961FE480314 get_head3961FDB101A5 "EnumRange::getTo"
            {
              // -beg- preserve=no 3961FE480314 get_body3961FDB101A5 "EnumRange::getTo"
              if(to==null) {throw new java.lang.IllegalStateException("no to attached");}
              return to;
              // -end- 3961FE480314 get_body3961FDB101A5 "EnumRange::getTo"
            }

            /** tests if there is a To attached.
             *  @see #attachTo
             */
            // -beg- preserve=no 3961FE480314 test_head3961FDB101A5 "EnumRange::containsTo"
            public boolean containsTo()
            // -end- 3961FE480314 test_head3961FDB101A5 "EnumRange::containsTo"
            {
              // -beg- preserve=no 3961FE480314 test_body3961FDB101A5 "EnumRange::containsTo"
              return to!=null;
              // -end- 3961FE480314 test_body3961FDB101A5 "EnumRange::containsTo"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3961FDB101A5 detail_end "EnumRange"

            // -end- 3961FDB101A5 detail_end "EnumRange"

          }

