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


              // -beg- preserve=no 3C17874F0020 package "Metaobject"
package ch.ehi.interlis.metaobjects;
              // -end- 3C17874F0020 package "Metaobject"

              // -beg- preserve=no 3C17874F0020 autoimport "Metaobject"
              import ch.ehi.uml1_4.implementation.AbstractEditorElement;
              import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 3C17874F0020 autoimport "Metaobject"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3C17874F0020 import "Metaobject"

              // -end- 3C17874F0020 import "Metaobject"

              /** @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:11 $
               */
public class Metaobject extends AbstractEditorElement implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C17874F0020 detail_begin "Metaobject"

                // -end- 3C17874F0020 detail_begin "Metaobject"

                // -beg- preserve=no 3D4FA21B03AF head3C17874F0020 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B03AF head3C17874F0020 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B03AF throws3C17874F0020 "unlinkAll"

                  // -end- 3D4FA21B03AF throws3C17874F0020 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B03AF body3C17874F0020 "unlinkAll"
                  
                  // Role ParameterDef: ParameterDef object(s) may point to this
                  detachAbstractClassDef();
                  super.unlinkAll();
                  // -end- 3D4FA21B03AF body3C17874F0020 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B03B0 head3C17874F0020 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B03B0 head3C17874F0020 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B03B0 throws3C17874F0020 "enumerateChildren"

                  // -end- 3D4FA21B03B0 throws3C17874F0020 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B03B0 body3C17874F0020 "enumerateChildren"
                  java.util.Iterator it=null;
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B03B0 body3C17874F0020 "enumerateChildren"
                  }

                // -beg- preserve=no 3C1787A9025B code3C17874F0020 "abstractClassDef"
                private AbstractClassDef abstractClassDef;
                // -end- 3C1787A9025B code3C17874F0020 "abstractClassDef"

                /** attaches a AbstractClassDef.
                 *  
                 *  @see #detachAbstractClassDef
                 *  @see #getAbstractClassDef
                 *  @see #containsAbstractClassDef
                 */
                // -beg- preserve=no 3C1787A9025B attach_head3C17874F0020 "Metaobject::attachAbstractClassDef"
                public void attachAbstractClassDef(AbstractClassDef abstractClassDef1)
                // -end- 3C1787A9025B attach_head3C17874F0020 "Metaobject::attachAbstractClassDef"
                {
                  // -beg- preserve=no 3C1787A9025B attach_body3C17874F0020 "Metaobject::attachAbstractClassDef"
                  if(abstractClassDef!=null) {throw new java.lang.IllegalStateException("already a abstractClassDef attached");}
                  if(abstractClassDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as abstractClassDef");}
                  abstractClassDef = abstractClassDef1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAbstractClassDef"));
                  return;
                  // -end- 3C1787A9025B attach_body3C17874F0020 "Metaobject::attachAbstractClassDef"
                }

                /** disconnect the currently attached AbstractClassDef.
                 *  @see #attachAbstractClassDef
                 */
                // -beg- preserve=no 3C1787A9025B detach_head3C17874F0020 "Metaobject::detachAbstractClassDef"
                public AbstractClassDef detachAbstractClassDef()
                // -end- 3C1787A9025B detach_head3C17874F0020 "Metaobject::detachAbstractClassDef"
                {
                  // -beg- preserve=no 3C1787A9025B detach_body3C17874F0020 "Metaobject::detachAbstractClassDef"
                  AbstractClassDef ret = null;
                  ret = abstractClassDef;
                  abstractClassDef = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAbstractClassDef"));
                  return ret;
                  // -end- 3C1787A9025B detach_body3C17874F0020 "Metaobject::detachAbstractClassDef"
                }

                /** get the currently attached AbstractClassDef.
                 *  @see #attachAbstractClassDef
                 */
                // -beg- preserve=no 3C1787A9025B get_head3C17874F0020 "Metaobject::getAbstractClassDef"
                public AbstractClassDef getAbstractClassDef()
                // -end- 3C1787A9025B get_head3C17874F0020 "Metaobject::getAbstractClassDef"
                {
                  // -beg- preserve=no 3C1787A9025B get_body3C17874F0020 "Metaobject::getAbstractClassDef"
                  if(abstractClassDef==null) {throw new java.lang.IllegalStateException("no abstractClassDef attached");}
                  return abstractClassDef;
                  // -end- 3C1787A9025B get_body3C17874F0020 "Metaobject::getAbstractClassDef"
                }

                /** tests if there is a AbstractClassDef attached.
                 *  @see #attachAbstractClassDef
                 */
                // -beg- preserve=no 3C1787A9025B test_head3C17874F0020 "Metaobject::containsAbstractClassDef"
                public boolean containsAbstractClassDef()
                // -end- 3C1787A9025B test_head3C17874F0020 "Metaobject::containsAbstractClassDef"
                {
                  // -beg- preserve=no 3C1787A9025B test_body3C17874F0020 "Metaobject::containsAbstractClassDef"
                  return abstractClassDef!=null;
                  // -end- 3C1787A9025B test_body3C17874F0020 "Metaobject::containsAbstractClassDef"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C17874F0020 detail_end "Metaobject"

                // -end- 3C17874F0020 detail_end "Metaobject"

              }

