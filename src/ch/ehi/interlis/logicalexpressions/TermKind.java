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


          // -beg- preserve=no 3C3F10BC0191 package "TermKind"
package ch.ehi.interlis.logicalexpressions;
          // -end- 3C3F10BC0191 package "TermKind"

          // -beg- preserve=no 3C3F10BC0191 autoimport "TermKind"

          // -end- 3C3F10BC0191 autoimport "TermKind"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3C3F10BC0191 import "TermKind"

          // -end- 3C3F10BC0191 import "TermKind"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:08 $
           */
public interface TermKind extends java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C3F10BC0191 detail_begin "TermKind"

            // -end- 3C3F10BC0191 detail_begin "TermKind"

            // -beg- preserve=no 3C40434B008A var3C3F10BC0191 "NOOP"
            public static final int NOOP = 1;
            // -end- 3C40434B008A var3C3F10BC0191 "NOOP"

            // -beg- preserve=no 3C40436B0311 var3C3F10BC0191 "FACTOR"
            public static final int FACTOR = 2;
            // -end- 3C40436B0311 var3C3F10BC0191 "FACTOR"

            // -beg- preserve=no 3C40437500DB var3C3F10BC0191 "OR"
            public static final int OR = 3;
            // -end- 3C40437500DB var3C3F10BC0191 "OR"

            // -beg- preserve=no 3C40437C029E var3C3F10BC0191 "AND"
            public static final int AND = 4;
            // -end- 3C40437C029E var3C3F10BC0191 "AND"

            // -beg- preserve=no 3C404385034B var3C3F10BC0191 "IMPL"
            public static final int IMPL = 5;
            // -end- 3C404385034B var3C3F10BC0191 "IMPL"

            // -beg- preserve=no 3C40438C02C9 var3C3F10BC0191 "NOT"
            public static final int NOT = 6;
            // -end- 3C40438C02C9 var3C3F10BC0191 "NOT"

            // -beg- preserve=no 3C4043930188 var3C3F10BC0191 "EQ"
            public static final int EQ = 7;
            // -end- 3C4043930188 var3C3F10BC0191 "EQ"

            // -beg- preserve=no 3C40439C0109 var3C3F10BC0191 "NEQ"
            public static final int NEQ = 8;
            // -end- 3C40439C0109 var3C3F10BC0191 "NEQ"

            // -beg- preserve=no 3C4043A30019 var3C3F10BC0191 "GLT"
            public static final int GLT = 9;
            // -end- 3C4043A30019 var3C3F10BC0191 "GLT"

            // -beg- preserve=no 3C4043AB0291 var3C3F10BC0191 "LEQ"
            public static final int LEQ = 10;
            // -end- 3C4043AB0291 var3C3F10BC0191 "LEQ"

            // -beg- preserve=no 3C4043B50390 var3C3F10BC0191 "GEQ"
            public static final int GEQ = 11;
            // -end- 3C4043B50390 var3C3F10BC0191 "GEQ"

            // -beg- preserve=no 3C4043BF007D var3C3F10BC0191 "LT"
            public static final int LT = 12;
            // -end- 3C4043BF007D var3C3F10BC0191 "LT"

            // -beg- preserve=no 3C4043C6007D var3C3F10BC0191 "GT"
            public static final int GT = 13;
            // -end- 3C4043C6007D var3C3F10BC0191 "GT"

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C3F10BC0191 detail_end "TermKind"

            // -end- 3C3F10BC0191 detail_end "TermKind"

          }

