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


              // -beg- preserve=no 3C1EFD040126 package "TextConst"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 3C1EFD040126 package "TextConst"

              // -beg- preserve=no 3C1EFD040126 autoimport "TextConst"
              import ch.ehi.interlis.domainsandconstants.basetypes.Constant;
              import ch.ehi.basics.types.NlsString;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 3C1EFD040126 autoimport "TextConst"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3C1EFD040126 import "TextConst"

              // -end- 3C1EFD040126 import "TextConst"

              /** @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:34 $
               */
public class TextConst extends Constant implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1EFD040126 detail_begin "TextConst"

                // -end- 3C1EFD040126 detail_begin "TextConst"

                // -beg- preserve=no 3D4FA21B0283 head3C1EFD040126 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B0283 head3C1EFD040126 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0283 throws3C1EFD040126 "unlinkAll"

                  // -end- 3D4FA21B0283 throws3C1EFD040126 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0283 body3C1EFD040126 "unlinkAll"
                  
                  setText(null);
                  super.unlinkAll();
                  // -end- 3D4FA21B0283 body3C1EFD040126 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B0284 head3C1EFD040126 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B0284 head3C1EFD040126 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0284 throws3C1EFD040126 "enumerateChildren"

                  // -end- 3D4FA21B0284 throws3C1EFD040126 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0284 body3C1EFD040126 "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getText());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B0284 body3C1EFD040126 "enumerateChildren"
                  }

                // -beg- preserve=no 39488B0900C3 var3C1EFD040126 "text"
                private NlsString text = null;
                // -end- 39488B0900C3 var3C1EFD040126 "text"

                /** get current value of text
                 *  beinhaltet escape Zeichen aber keine Anfangs- und Endzeichen.
                 *  @see #setText
                 */
                // -beg- preserve=no 39488B0900C3 get_head3C1EFD040126 "text"
                public  NlsString getText()
                // -end- 39488B0900C3 get_head3C1EFD040126 "text"
                {
                  // -beg- preserve=no 39488B0900C3 get_body3C1EFD040126 "text"
                  return text;
                  // -end- 39488B0900C3 get_body3C1EFD040126 "text"
                }

                /** set current value of text
                 *  @see #getText
                 */
                // -beg- preserve=no 39488B0900C3 set_head3C1EFD040126 "text"
                public  void setText(NlsString value1)
                // -end- 39488B0900C3 set_head3C1EFD040126 "text"
                {
                  // -beg- preserve=no 39488B0900C3 set_body3C1EFD040126 "text"
                  if(text!=value1 && (text==null || !text.equals(value1))){
                    text = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setText"));
                  }
                  // -end- 39488B0900C3 set_body3C1EFD040126 "text"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1EFD040126 detail_end "TextConst"

                // -end- 3C1EFD040126 detail_end "TextConst"

              }

