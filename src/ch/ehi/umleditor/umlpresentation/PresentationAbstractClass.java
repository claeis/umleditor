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


          // -beg- preserve=no 3D47AB2F01F2 package "PresentationAbstractClass"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3D47AB2F01F2 package "PresentationAbstractClass"

          // -beg- preserve=no 3D47AB2F01F2 autoimport "PresentationAbstractClass"
          import ch.ehi.umleditor.umlpresentation.PresentationNode;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3D47AB2F01F2 autoimport "PresentationAbstractClass"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3D47AB2F01F2 import "PresentationAbstractClass"

          // -end- 3D47AB2F01F2 import "PresentationAbstractClass"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:15 $
           */
public abstract class PresentationAbstractClass extends PresentationNode
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D47AB2F01F2 detail_begin "PresentationAbstractClass"

            // -end- 3D47AB2F01F2 detail_begin "PresentationAbstractClass"

            // -beg- preserve=no 3D4FA217033B head3D47AB2F01F2 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA217033B head3D47AB2F01F2 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA217033B throws3D47AB2F01F2 "unlinkAll"

              // -end- 3D4FA217033B throws3D47AB2F01F2 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA217033B body3D47AB2F01F2 "unlinkAll"
              
              super.unlinkAll();
              // -end- 3D4FA217033B body3D47AB2F01F2 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2170345 head3D47AB2F01F2 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2170345 head3D47AB2F01F2 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170345 throws3D47AB2F01F2 "enumerateChildren"

              // -end- 3D4FA2170345 throws3D47AB2F01F2 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170345 body3D47AB2F01F2 "enumerateChildren"
              java.util.Iterator it=null;
              super.enumerateChildren(visitor);
              // -end- 3D4FA2170345 body3D47AB2F01F2 "enumerateChildren"
              }

            // -beg- preserve=no 3E41014D00E2 var3D47AB2F01F2 "suppressAttributes"
            private boolean suppressAttributes = false;
            // -end- 3E41014D00E2 var3D47AB2F01F2 "suppressAttributes"

            /** get current value of suppressAttributes
             *  @see #setSuppressAttributes
             */
            // -beg- preserve=no 3E41014D00E2 get_head3D47AB2F01F2 "suppressAttributes"
            public  boolean isSuppressAttributes()
            // -end- 3E41014D00E2 get_head3D47AB2F01F2 "suppressAttributes"
            {
              // -beg- preserve=no 3E41014D00E2 get_body3D47AB2F01F2 "suppressAttributes"
              return suppressAttributes;
              // -end- 3E41014D00E2 get_body3D47AB2F01F2 "suppressAttributes"
            }

            /** set current value of suppressAttributes
             *  @see #isSuppressAttributes
             */
            // -beg- preserve=no 3E41014D00E2 set_head3D47AB2F01F2 "suppressAttributes"
            public  void setSuppressAttributes(boolean value1)
            // -end- 3E41014D00E2 set_head3D47AB2F01F2 "suppressAttributes"
            {
              // -beg- preserve=no 3E41014D00E2 set_body3D47AB2F01F2 "suppressAttributes"
              if(suppressAttributes != value1){
                suppressAttributes = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSuppressAttributes"));
              }
              // -end- 3E41014D00E2 set_body3D47AB2F01F2 "suppressAttributes"
            }

            // -beg- preserve=no 3E4101AE0358 var3D47AB2F01F2 "showInheritedAttributes"
            private boolean showInheritedAttributes = false;
            // -end- 3E4101AE0358 var3D47AB2F01F2 "showInheritedAttributes"

            /** get current value of showInheritedAttributes
             *  @see #setShowInheritedAttributes
             */
            // -beg- preserve=no 3E4101AE0358 get_head3D47AB2F01F2 "showInheritedAttributes"
            public  boolean isShowInheritedAttributes()
            // -end- 3E4101AE0358 get_head3D47AB2F01F2 "showInheritedAttributes"
            {
              // -beg- preserve=no 3E4101AE0358 get_body3D47AB2F01F2 "showInheritedAttributes"
              return showInheritedAttributes;
              // -end- 3E4101AE0358 get_body3D47AB2F01F2 "showInheritedAttributes"
            }

            /** set current value of showInheritedAttributes
             *  @see #isShowInheritedAttributes
             */
            // -beg- preserve=no 3E4101AE0358 set_head3D47AB2F01F2 "showInheritedAttributes"
            public  void setShowInheritedAttributes(boolean value1)
            // -end- 3E4101AE0358 set_head3D47AB2F01F2 "showInheritedAttributes"
            {
              // -beg- preserve=no 3E4101AE0358 set_body3D47AB2F01F2 "showInheritedAttributes"
              if(showInheritedAttributes != value1){
                showInheritedAttributes = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowInheritedAttributes"));
              }
              // -end- 3E4101AE0358 set_body3D47AB2F01F2 "showInheritedAttributes"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D47AB2F01F2 detail_end "PresentationAbstractClass"

            // -end- 3D47AB2F01F2 detail_end "PresentationAbstractClass"

          }

