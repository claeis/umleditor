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


              // -beg- preserve=no 358A670D0143 package "Text"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 358A670D0143 package "Text"

              // -beg- preserve=no 358A670D0143 autoimport "Text"
              import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
              import ch.ehi.interlis.domainsandconstants.basetypes.TextKind;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 358A670D0143 autoimport "Text"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 358A670D0143 import "Text"

              // -end- 358A670D0143 import "Text"

              /** Definiert einen Zeichenketten Datentyp.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:33 $
               */
public class Text extends BaseType implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A670D0143 detail_begin "Text"

                // -end- 358A670D0143 detail_begin "Text"

                // -beg- preserve=no 3D4FA21B0066 head358A670D0143 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B0066 head358A670D0143 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0066 throws358A670D0143 "unlinkAll"

                  // -end- 3D4FA21B0066 throws358A670D0143 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0066 body358A670D0143 "unlinkAll"
                  
                  super.unlinkAll();
                  // -end- 3D4FA21B0066 body358A670D0143 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B0067 head358A670D0143 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B0067 head358A670D0143 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0067 throws358A670D0143 "enumerateChildren"

                  // -end- 3D4FA21B0067 throws358A670D0143 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0067 body358A670D0143 "enumerateChildren"
                  java.util.Iterator it=null;
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B0067 body358A670D0143 "enumerateChildren"
                  }

                // -beg- preserve=no 358A68CE013E var358A670D0143 "maxLength"
                private long maxLength;
                // -end- 358A68CE013E var358A670D0143 "maxLength"

                /** get current value of maxLength
                 *  max Anzahl Zeichen in der Zeichenkette.
                 *  @see #setMaxLength
                 */
                // -beg- preserve=no 358A68CE013E get_head358A670D0143 "maxLength"
                public  long getMaxLength()
                // -end- 358A68CE013E get_head358A670D0143 "maxLength"
                {
                  // -beg- preserve=no 358A68CE013E get_body358A670D0143 "maxLength"
                  return maxLength;
                  // -end- 358A68CE013E get_body358A670D0143 "maxLength"
                }

                /** set current value of maxLength
                 *  @see #getMaxLength
                 */
                // -beg- preserve=no 358A68CE013E set_head358A670D0143 "maxLength"
                public  void setMaxLength(long value1)
                // -end- 358A68CE013E set_head358A670D0143 "maxLength"
                {
                  // -beg- preserve=no 358A68CE013E set_body358A670D0143 "maxLength"
                  if(maxLength != value1){
                    maxLength = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMaxLength"));
                  }
                  // -end- 358A68CE013E set_body358A670D0143 "maxLength"
                }

                // -beg- preserve=no 39488EF00123 var358A670D0143 "kind"
                private int kind = TextKind.UNDEFINED;
                // -end- 39488EF00123 var358A670D0143 "kind"

                /** get current value of kind
                 *  MAXLEN, ABSTRACT, NAME oder URI
                 *  @see ch.ehi.interlis.domainsandconstants.basetypes.TextKind
                 *  @see #setKind
                 */
                // -beg- preserve=no 39488EF00123 get_head358A670D0143 "kind"
                public  int getKind()
                // -end- 39488EF00123 get_head358A670D0143 "kind"
                {
                  // -beg- preserve=no 39488EF00123 get_body358A670D0143 "kind"
                  return kind;
                  // -end- 39488EF00123 get_body358A670D0143 "kind"
                }

                /** set current value of kind
                 *  @see ch.ehi.interlis.domainsandconstants.basetypes.TextKind
                 *  @see #getKind
                 */
                // -beg- preserve=no 39488EF00123 set_head358A670D0143 "kind"
                public  void setKind(int value1)
                // -end- 39488EF00123 set_head358A670D0143 "kind"
                {
                  // -beg- preserve=no 39488EF00123 set_body358A670D0143 "kind"
                  if(kind != value1){
                    kind = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
                  }
                  // -end- 39488EF00123 set_body358A670D0143 "kind"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A670D0143 detail_end "Text"

                // -end- 358A670D0143 detail_end "Text"

              }

