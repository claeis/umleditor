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


          // -beg- preserve=no 3949E17C0356 package "ComposedUnit"
package ch.ehi.interlis.units;
          // -end- 3949E17C0356 package "ComposedUnit"

          // -beg- preserve=no 3949E17C0356 autoimport "ComposedUnit"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.units.ComposedUnitFactor;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3949E17C0356 autoimport "ComposedUnit"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3949E17C0356 import "ComposedUnit"

          // -end- 3949E17C0356 import "ComposedUnit"

          /** Definiert eine zusammengesetzte Einheit z.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:18 $
           */
public class ComposedUnit extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3949E17C0356 detail_begin "ComposedUnit"

            // -end- 3949E17C0356 detail_begin "ComposedUnit"

            // -beg- preserve=no 3D4FA2180103 head3949E17C0356 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2180103 head3949E17C0356 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180103 throws3949E17C0356 "unlinkAll"

              // -end- 3D4FA2180103 throws3949E17C0356 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180103 body3949E17C0356 "unlinkAll"
              
              // Role UnitDef: UnitDef object(s) may point to this
              clearComposedUnitFactor();
              super.unlinkAll();
              // -end- 3D4FA2180103 body3949E17C0356 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA218010C head3949E17C0356 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA218010C head3949E17C0356 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA218010C throws3949E17C0356 "enumerateChildren"

              // -end- 3D4FA218010C throws3949E17C0356 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA218010C body3949E17C0356 "enumerateChildren"
              java.util.Iterator it=null;
              it=iteratorComposedUnitFactor();while(it.hasNext())visitor.visit(it.next());
              super.enumerateChildren(visitor);
              // -end- 3D4FA218010C body3949E17C0356 "enumerateChildren"
              }

            // -beg- preserve=no 394A21150129 code3949E17C0356 "composedUnitFactor"
            private java.util.Set composedUnitFactor = new java.util.HashSet();
            // -end- 394A21150129 code3949E17C0356 "composedUnitFactor"

            /** add a ComposedUnitFactor.
             *  
             *  @see #removeComposedUnitFactor
             *  @see #containsComposedUnitFactor
             *  @see #iteratorComposedUnitFactor
             *  @see #clearComposedUnitFactor
             *  @see #sizeComposedUnitFactor
             */
            // -beg- preserve=no 394A21150129 add_head3949E17C0356 "ComposedUnit::addComposedUnitFactor"
            public void addComposedUnitFactor(ComposedUnitFactor composedUnitFactor1)
            // -end- 394A21150129 add_head3949E17C0356 "ComposedUnit::addComposedUnitFactor"
            {
              // -beg- preserve=no 394A21150129 add_body3949E17C0356 "ComposedUnit::addComposedUnitFactor"
              composedUnitFactor.add(composedUnitFactor1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addComposedUnitFactor"));
              return;
              // -end- 394A21150129 add_body3949E17C0356 "ComposedUnit::addComposedUnitFactor"
            }

            /** disconnect a ComposedUnitFactor.
             *  @see #addComposedUnitFactor
             */
            // -beg- preserve=no 394A21150129 remove_head3949E17C0356 "ComposedUnit::removeComposedUnitFactor"
            public ComposedUnitFactor removeComposedUnitFactor(ComposedUnitFactor composedUnitFactor1)
            // -end- 394A21150129 remove_head3949E17C0356 "ComposedUnit::removeComposedUnitFactor"
            {
              // -beg- preserve=no 394A21150129 remove_body3949E17C0356 "ComposedUnit::removeComposedUnitFactor"
              ComposedUnitFactor ret=null;
              if(composedUnitFactor1==null || !composedUnitFactor.contains(composedUnitFactor1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = composedUnitFactor1;
              composedUnitFactor.remove(composedUnitFactor1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeComposedUnitFactor"));
              return ret;
              // -end- 394A21150129 remove_body3949E17C0356 "ComposedUnit::removeComposedUnitFactor"
            }

            /** tests if a given ComposedUnitFactor is connected.
             *  @see #addComposedUnitFactor
             */
            // -beg- preserve=no 394A21150129 test_head3949E17C0356 "ComposedUnit::containsComposedUnitFactor"
            public boolean containsComposedUnitFactor(ComposedUnitFactor composedUnitFactor1)
            // -end- 394A21150129 test_head3949E17C0356 "ComposedUnit::containsComposedUnitFactor"
            {
              // -beg- preserve=no 394A21150129 test_body3949E17C0356 "ComposedUnit::containsComposedUnitFactor"
              return composedUnitFactor.contains(composedUnitFactor1);
              // -end- 394A21150129 test_body3949E17C0356 "ComposedUnit::containsComposedUnitFactor"
            }

            /** used to enumerate all connected ComposedUnitFactors.
             *  @see #addComposedUnitFactor
             */
            // -beg- preserve=no 394A21150129 get_all_head3949E17C0356 "ComposedUnit::iteratorComposedUnitFactor"
            public java.util.Iterator iteratorComposedUnitFactor()
            // -end- 394A21150129 get_all_head3949E17C0356 "ComposedUnit::iteratorComposedUnitFactor"
            {
              // -beg- preserve=no 394A21150129 get_all_body3949E17C0356 "ComposedUnit::iteratorComposedUnitFactor"
              return composedUnitFactor.iterator();
              // -end- 394A21150129 get_all_body3949E17C0356 "ComposedUnit::iteratorComposedUnitFactor"
            }

            /** disconnect all ComposedUnitFactors.
             *  @see #addComposedUnitFactor
             */
            // -beg- preserve=no 394A21150129 remove_all_head3949E17C0356 "ComposedUnit::clearComposedUnitFactor"
            public void clearComposedUnitFactor()
            // -end- 394A21150129 remove_all_head3949E17C0356 "ComposedUnit::clearComposedUnitFactor"
            {
              // -beg- preserve=no 394A21150129 remove_all_body3949E17C0356 "ComposedUnit::clearComposedUnitFactor"
              if(sizeComposedUnitFactor()>0){
                composedUnitFactor.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearComposedUnitFactor"));
              }
              // -end- 394A21150129 remove_all_body3949E17C0356 "ComposedUnit::clearComposedUnitFactor"
            }

            /** returns the number of ComposedUnitFactors.
             *  @see #addComposedUnitFactor
             */
            // -beg- preserve=no 394A21150129 size_head3949E17C0356 "ComposedUnit::sizeComposedUnitFactor"
            public int sizeComposedUnitFactor()
            // -end- 394A21150129 size_head3949E17C0356 "ComposedUnit::sizeComposedUnitFactor"
            {
              // -beg- preserve=no 394A21150129 size_body3949E17C0356 "ComposedUnit::sizeComposedUnitFactor"
              return composedUnitFactor.size();
              // -end- 394A21150129 size_body3949E17C0356 "ComposedUnit::sizeComposedUnitFactor"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3949E17C0356 detail_end "ComposedUnit"

            // -end- 3949E17C0356 detail_end "ComposedUnit"

          }

