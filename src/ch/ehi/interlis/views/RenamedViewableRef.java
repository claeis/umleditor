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


          // -beg- preserve=no 39619211022E package "RenamedViewableRef"
package ch.ehi.interlis.views;
          // -end- 39619211022E package "RenamedViewableRef"

          // -beg- preserve=no 39619211022E autoimport "RenamedViewableRef"
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.interlis.views.ViewableDef;
          import ch.ehi.basics.types.NlsString;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 39619211022E autoimport "RenamedViewableRef"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 39619211022E import "RenamedViewableRef"

          // -end- 39619211022E import "RenamedViewableRef"

          /** Definiert einen Namen fuer eine Sicht.
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:32 $
           */
public class RenamedViewableRef extends AbstractEditorElement implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 39619211022E detail_begin "RenamedViewableRef"

            // -end- 39619211022E detail_begin "RenamedViewableRef"

            // -beg- preserve=no 3D4FA218030B head39619211022E "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA218030B head39619211022E "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA218030B throws39619211022E "unlinkAll"

              // -end- 3D4FA218030B throws39619211022E "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA218030B body39619211022E "unlinkAll"
              
              // Role ViewDef: ViewDef object(s) may point to this
              detachViewableDef();
              setLocalBase(null);
              super.unlinkAll();
              // -end- 3D4FA218030B body39619211022E "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2180315 head39619211022E "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2180315 head39619211022E "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180315 throws39619211022E "enumerateChildren"

              // -end- 3D4FA2180315 throws39619211022E "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2180315 body39619211022E "enumerateChildren"
              java.util.Iterator it=null;
              if(containsViewableDef())visitor.visit(getViewableDef());
              visitor.visit(getLocalBase());
              super.enumerateChildren(visitor);
              // -end- 3D4FA2180315 body39619211022E "enumerateChildren"
              }

            // -beg- preserve=no 39619B7502A3 code39619211022E "viewableDef"
            private ViewableDef viewableDef;
            // -end- 39619B7502A3 code39619211022E "viewableDef"

            /** attaches a ViewableDef.
             *  
             *  @see #detachViewableDef
             *  @see #getViewableDef
             *  @see #containsViewableDef
             */
            // -beg- preserve=no 39619B7502A3 attach_head39619211022E "RenamedViewableRef::attachViewableDef"
            public void attachViewableDef(ViewableDef viewableDef1)
            // -end- 39619B7502A3 attach_head39619211022E "RenamedViewableRef::attachViewableDef"
            {
              // -beg- preserve=no 39619B7502A3 attach_body39619211022E "RenamedViewableRef::attachViewableDef"
              if(viewableDef!=null) {throw new java.lang.IllegalStateException("already a viewableDef attached");}
              if(viewableDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as viewableDef");}
              viewableDef = viewableDef1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachViewableDef"));
              return;
              // -end- 39619B7502A3 attach_body39619211022E "RenamedViewableRef::attachViewableDef"
            }

            /** disconnect the currently attached ViewableDef.
             *  @see #attachViewableDef
             */
            // -beg- preserve=no 39619B7502A3 detach_head39619211022E "RenamedViewableRef::detachViewableDef"
            public ViewableDef detachViewableDef()
            // -end- 39619B7502A3 detach_head39619211022E "RenamedViewableRef::detachViewableDef"
            {
              // -beg- preserve=no 39619B7502A3 detach_body39619211022E "RenamedViewableRef::detachViewableDef"
              ViewableDef ret = null;
              ret = viewableDef;
              viewableDef = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachViewableDef"));
              return ret;
              // -end- 39619B7502A3 detach_body39619211022E "RenamedViewableRef::detachViewableDef"
            }

            /** get the currently attached ViewableDef.
             *  @see #attachViewableDef
             */
            // -beg- preserve=no 39619B7502A3 get_head39619211022E "RenamedViewableRef::getViewableDef"
            public ViewableDef getViewableDef()
            // -end- 39619B7502A3 get_head39619211022E "RenamedViewableRef::getViewableDef"
            {
              // -beg- preserve=no 39619B7502A3 get_body39619211022E "RenamedViewableRef::getViewableDef"
              if(viewableDef==null) {throw new java.lang.IllegalStateException("no viewableDef attached");}
              return viewableDef;
              // -end- 39619B7502A3 get_body39619211022E "RenamedViewableRef::getViewableDef"
            }

            /** tests if there is a ViewableDef attached.
             *  @see #attachViewableDef
             */
            // -beg- preserve=no 39619B7502A3 test_head39619211022E "RenamedViewableRef::containsViewableDef"
            public boolean containsViewableDef()
            // -end- 39619B7502A3 test_head39619211022E "RenamedViewableRef::containsViewableDef"
            {
              // -beg- preserve=no 39619B7502A3 test_body39619211022E "RenamedViewableRef::containsViewableDef"
              return viewableDef!=null;
              // -end- 39619B7502A3 test_body39619211022E "RenamedViewableRef::containsViewableDef"
            }

            // -beg- preserve=no 39619B1A020C var39619211022E "localBase"
            private NlsString localBase = null;
            // -end- 39619B1A020C var39619211022E "localBase"

            /** get current value of localBase
             *  Lokal gueltiger Name fuer die referenzierte Klasse, Sicht oder Projektion.
             *  @see #setLocalBase
             */
            // -beg- preserve=no 39619B1A020C get_head39619211022E "localBase"
            public  NlsString getLocalBase()
            // -end- 39619B1A020C get_head39619211022E "localBase"
            {
              // -beg- preserve=no 39619B1A020C get_body39619211022E "localBase"
              return localBase;
              // -end- 39619B1A020C get_body39619211022E "localBase"
            }

            /** set current value of localBase
             *  @see #getLocalBase
             */
            // -beg- preserve=no 39619B1A020C set_head39619211022E "localBase"
            public  void setLocalBase(NlsString value1)
            // -end- 39619B1A020C set_head39619211022E "localBase"
            {
              // -beg- preserve=no 39619B1A020C set_body39619211022E "localBase"
              if(localBase!=value1 && (localBase==null || !localBase.equals(value1))){
                localBase = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLocalBase"));
              }
              // -end- 39619B1A020C set_body39619211022E "localBase"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 39619211022E detail_end "RenamedViewableRef"

            // -end- 39619211022E detail_end "RenamedViewableRef"

          }

