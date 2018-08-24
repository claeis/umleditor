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


              // -beg- preserve=no 358A675900CA package "VertAlignment"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 358A675900CA package "VertAlignment"

              // -beg- preserve=no 358A675900CA autoimport "VertAlignment"
              import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 358A675900CA autoimport "VertAlignment"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 358A675900CA import "VertAlignment"

              // -end- 358A675900CA import "VertAlignment"

              /** Definiert einen Datentyp fuer die vertikale Textausrichtung.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:34 $
               */
public class VertAlignment extends BaseType implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A675900CA detail_begin "VertAlignment"

                // -end- 358A675900CA detail_begin "VertAlignment"

                // -beg- preserve=no 3D4FA21B008E head358A675900CA "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B008E head358A675900CA "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B008E throws358A675900CA "unlinkAll"

                  // -end- 3D4FA21B008E throws358A675900CA "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B008E body358A675900CA "unlinkAll"
                  
                  super.unlinkAll();
                  // -end- 3D4FA21B008E body358A675900CA "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B0098 head358A675900CA "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B0098 head358A675900CA "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0098 throws358A675900CA "enumerateChildren"

                  // -end- 3D4FA21B0098 throws358A675900CA "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0098 body358A675900CA "enumerateChildren"
                  java.util.Iterator it=null;
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B0098 body358A675900CA "enumerateChildren"
                  }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A675900CA detail_end "VertAlignment"

                // -end- 358A675900CA detail_end "VertAlignment"

              }

