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


          // -beg- preserve=no 394A2D1100D0 package "UniquenessConstraint"
package ch.ehi.interlis.constraints;
          // -end- 394A2D1100D0 package "UniquenessConstraint"

          // -beg- preserve=no 394A2D1100D0 autoimport "UniquenessConstraint"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.basics.types.NlsString;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 394A2D1100D0 autoimport "UniquenessConstraint"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 394A2D1100D0 import "UniquenessConstraint"

          // -end- 394A2D1100D0 import "UniquenessConstraint"

          /** Definiert eine Eindeutigkeitsforderung.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:55 $
           */
public class UniquenessConstraint extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 394A2D1100D0 detail_begin "UniquenessConstraint"

            // -end- 394A2D1100D0 detail_begin "UniquenessConstraint"

            // -beg- preserve=no 3D4FA21801AC head394A2D1100D0 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21801AC head394A2D1100D0 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21801AC throws394A2D1100D0 "unlinkAll"

              // -end- 3D4FA21801AC throws394A2D1100D0 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21801AC body394A2D1100D0 "unlinkAll"
              
              // Role ConstraintExpression: ConstraintExpression object(s) may point to this
              setCompositionAttributes(null);
              setAttributes(null);
              super.unlinkAll();
              // -end- 3D4FA21801AC body394A2D1100D0 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21801AD head394A2D1100D0 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21801AD head394A2D1100D0 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21801AD throws394A2D1100D0 "enumerateChildren"

              // -end- 3D4FA21801AD throws394A2D1100D0 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21801AD body394A2D1100D0 "enumerateChildren"
              java.util.Iterator it=null;
              visitor.visit(getCompositionAttributes());
              visitor.visit(getAttributes());
              super.enumerateChildren(visitor);
              // -end- 3D4FA21801AD body394A2D1100D0 "enumerateChildren"
              }

            // -beg- preserve=no 394A364F0031 var394A2D1100D0 "compositionAttributes"
            private NlsString compositionAttributes = null;
            // -end- 394A364F0031 var394A2D1100D0 "compositionAttributes"

            /** get current value of compositionAttributes
             *  ??? std::list<CString>Kann leer sein.
             *  @see #setCompositionAttributes
             */
            // -beg- preserve=no 394A364F0031 get_head394A2D1100D0 "compositionAttributes"
            public  NlsString getCompositionAttributes()
            // -end- 394A364F0031 get_head394A2D1100D0 "compositionAttributes"
            {
              // -beg- preserve=no 394A364F0031 get_body394A2D1100D0 "compositionAttributes"
              return compositionAttributes;
              // -end- 394A364F0031 get_body394A2D1100D0 "compositionAttributes"
            }

            /** set current value of compositionAttributes
             *  @see #getCompositionAttributes
             */
            // -beg- preserve=no 394A364F0031 set_head394A2D1100D0 "compositionAttributes"
            public  void setCompositionAttributes(NlsString value1)
            // -end- 394A364F0031 set_head394A2D1100D0 "compositionAttributes"
            {
              // -beg- preserve=no 394A364F0031 set_body394A2D1100D0 "compositionAttributes"
              if(compositionAttributes!=value1 && (compositionAttributes==null || !compositionAttributes.equals(value1))){
                compositionAttributes = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setCompositionAttributes"));
              }
              // -end- 394A364F0031 set_body394A2D1100D0 "compositionAttributes"
            }

            // -beg- preserve=no 394A36580070 var394A2D1100D0 "attributes"
            private NlsString attributes = null;
            // -end- 394A36580070 var394A2D1100D0 "attributes"

            /** get current value of attributes
             *  Namen der Attribute die zusammen für jede Instanz der Klasse eindeutig sein müssen.
             *  @see #setAttributes
             */
            // -beg- preserve=no 394A36580070 get_head394A2D1100D0 "attributes"
            public  NlsString getAttributes()
            // -end- 394A36580070 get_head394A2D1100D0 "attributes"
            {
              // -beg- preserve=no 394A36580070 get_body394A2D1100D0 "attributes"
              return attributes;
              // -end- 394A36580070 get_body394A2D1100D0 "attributes"
            }

            /** set current value of attributes
             *  @see #getAttributes
             */
            // -beg- preserve=no 394A36580070 set_head394A2D1100D0 "attributes"
            public  void setAttributes(NlsString value1)
            // -end- 394A36580070 set_head394A2D1100D0 "attributes"
            {
              // -beg- preserve=no 394A36580070 set_body394A2D1100D0 "attributes"
              if(attributes!=value1 && (attributes==null || !attributes.equals(value1))){
                attributes = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setAttributes"));
              }
              // -end- 394A36580070 set_body394A2D1100D0 "attributes"
            }

            // -beg- preserve=no 394A36600112 var394A2D1100D0 "object"
            private boolean object;
            // -end- 394A36600112 var394A2D1100D0 "object"

            /** get current value of object
             *  ???
             *  @see #setObject
             */
            // -beg- preserve=no 394A36600112 get_head394A2D1100D0 "object"
            public  boolean isObject()
            // -end- 394A36600112 get_head394A2D1100D0 "object"
            {
              // -beg- preserve=no 394A36600112 get_body394A2D1100D0 "object"
              return object;
              // -end- 394A36600112 get_body394A2D1100D0 "object"
            }

            /** set current value of object
             *  @see #isObject
             */
            // -beg- preserve=no 394A36600112 set_head394A2D1100D0 "object"
            public  void setObject(boolean value1)
            // -end- 394A36600112 set_head394A2D1100D0 "object"
            {
              // -beg- preserve=no 394A36600112 set_body394A2D1100D0 "object"
              if(object != value1){
                object = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setObject"));
              }
              // -end- 394A36600112 set_body394A2D1100D0 "object"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 394A2D1100D0 detail_end "UniquenessConstraint"

            // -end- 394A2D1100D0 detail_end "UniquenessConstraint"

          }

