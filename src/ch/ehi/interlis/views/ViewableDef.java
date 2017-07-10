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


          // -beg- preserve=no 396ED2D20204 package "ViewableDef"
package ch.ehi.interlis.views;
          // -end- 396ED2D20204 package "ViewableDef"

          // -beg- preserve=no 396ED2D20204 autoimport "ViewableDef"
          import ch.ehi.uml1_4.foundation.core.ModelElement;
          import ch.ehi.uml1_4.foundation.core.Dependency;
          // -end- 396ED2D20204 autoimport "ViewableDef"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 396ED2D20204 import "ViewableDef"

          // -end- 396ED2D20204 import "ViewableDef"

          /** Diese Klasse ist nur in INTERLIS2 vorhanden.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:32 $
           */
public interface ViewableDef extends ModelElement , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 396ED2D20204 detail_begin "ViewableDef"

            // -end- 396ED2D20204 detail_begin "ViewableDef"

            /** add a SupplierDependency.
             *  
             *  @see #removeSupplierDependency
             *  @see #containsSupplierDependency
             *  @see #iteratorSupplierDependency
             *  @see #clearSupplierDependency
             *  @see #sizeSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 add_head396ED2D20204 "ModelElement::addSupplierDependency"
            public void addSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 add_head396ED2D20204 "ModelElement::addSupplierDependency"
              ; // empty

            /** disconnect a SupplierDependency.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 remove_head396ED2D20204 "ModelElement::removeSupplierDependency"
            public Dependency removeSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 remove_head396ED2D20204 "ModelElement::removeSupplierDependency"
              ; // empty

            /** tests if a given SupplierDependency is connected.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 test_head396ED2D20204 "ModelElement::containsSupplierDependency"
            public boolean containsSupplierDependency(Dependency supplierDependency1)
            // -end- 335C0D7A02A8 test_head396ED2D20204 "ModelElement::containsSupplierDependency"
              ; // empty

            /** used to enumerate all connected SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 get_all_head396ED2D20204 "ModelElement::iteratorSupplierDependency"
            public java.util.Iterator iteratorSupplierDependency()
            // -end- 335C0D7A02A8 get_all_head396ED2D20204 "ModelElement::iteratorSupplierDependency"
              ; // empty

            /** disconnect all SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 remove_all_head396ED2D20204 "ModelElement::clearSupplierDependency"
            public void clearSupplierDependency()
            // -end- 335C0D7A02A8 remove_all_head396ED2D20204 "ModelElement::clearSupplierDependency"
              ; // empty

            /** returns the number of SupplierDependencys.
             *  @see #addSupplierDependency
             */
            // -beg- preserve=no 335C0D7A02A8 size_head396ED2D20204 "ModelElement::sizeSupplierDependency"
            public int sizeSupplierDependency()
            // -end- 335C0D7A02A8 size_head396ED2D20204 "ModelElement::sizeSupplierDependency"
              ; // empty

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C0D7A02A8 _link_body396ED2D20204 "ModelElement::_linkSupplierDependency"
            public void _linkSupplierDependency(Dependency supplierDependency1);
            // -end- 335C0D7A02A8 _link_body396ED2D20204 "ModelElement::_linkSupplierDependency"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 335C0D7A02A8 _unlink_body396ED2D20204 "ModelElement::_unlinkSupplierDependency"
            public void _unlinkSupplierDependency(Dependency supplierDependency1);
            // -end- 335C0D7A02A8 _unlink_body396ED2D20204 "ModelElement::_unlinkSupplierDependency"

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 396ED2D20204 detail_end "ViewableDef"

            // -end- 396ED2D20204 detail_end "ViewableDef"

          }

