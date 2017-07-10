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


              // -beg- preserve=no 358A671C0162 package "Enumeration"
package ch.ehi.interlis.domainsandconstants.basetypes;
              // -end- 358A671C0162 package "Enumeration"

              // -beg- preserve=no 358A671C0162 autoimport "Enumeration"
              import ch.ehi.interlis.domainsandconstants.basetypes.BaseType;
              import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
              import ch.ehi.interlis.domainsandconstants.basetypes.EnumKind;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 358A671C0162 autoimport "Enumeration"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 358A671C0162 import "Enumeration"

              // -end- 358A671C0162 import "Enumeration"

              /** Definiert einen Aufzählungsdatentyp.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:19 $
               */
public class Enumeration extends BaseType implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 358A671C0162 detail_begin "Enumeration"

                // -end- 358A671C0162 detail_begin "Enumeration"

                // -beg- preserve=no 3D4FA21B00A2 head358A671C0162 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B00A2 head358A671C0162 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00A2 throws358A671C0162 "unlinkAll"

                  // -end- 3D4FA21B00A2 throws358A671C0162 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00A2 body358A671C0162 "unlinkAll"
                  
                  clearEnumElement();
                  detachParent();
                  super.unlinkAll();
                  // -end- 3D4FA21B00A2 body358A671C0162 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B00A3 head358A671C0162 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B00A3 head358A671C0162 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00A3 throws358A671C0162 "enumerateChildren"

                  // -end- 3D4FA21B00A3 throws358A671C0162 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B00A3 body358A671C0162 "enumerateChildren"
                  java.util.Iterator it=null;
                  it=iteratorEnumElement();while(it.hasNext())visitor.visit(it.next());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B00A3 body358A671C0162 "enumerateChildren"
                  }

                // -beg- preserve=no 358A699B028E code358A671C0162 "enumElement"
                private java.util.List enumElement = new java.util.ArrayList();
                // -end- 358A699B028E code358A671C0162 "enumElement"

                /** add a EnumElement.
                 *  
                 *  @see #removeEnumElement
                 *  @see #containsEnumElement
                 *  @see #iteratorEnumElement
                 *  @see #clearEnumElement
                 *  @see #sizeEnumElement
                 */
                // -beg- preserve=no 358A699B028E add_head358A671C0162 "Enumeration::addEnumElement"
                public void addEnumElement(EnumElement enumElement1)
                // -end- 358A699B028E add_head358A671C0162 "Enumeration::addEnumElement"
                {
                  // -beg- preserve=no 358A699B028E add_body358A671C0162 "Enumeration::addEnumElement"
                  enumElement.add(enumElement1);
                  enumElement1._linkEnumeration(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addEnumElement"));
                  return;
                  // -end- 358A699B028E add_body358A671C0162 "Enumeration::addEnumElement"
                }

                // -beg- preserve=no 358A699B028E add2_head358A671C0162 "Enumeration::add2EnumElement"
                public void addEnumElement(int index,EnumElement enumElement1)
                // -end- 358A699B028E add2_head358A671C0162 "Enumeration::add2EnumElement"
                {
                  // -beg- preserve=no 358A699B028E add2_body358A671C0162 "Enumeration::add2EnumElement"
                  enumElement.add(index,enumElement1);
                  enumElement1._linkEnumeration(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addEnumElement"));
                  return;
                  // -end- 358A699B028E add2_body358A671C0162 "Enumeration::add2EnumElement"
                }

                /** disconnect a EnumElement.
                 *  @see #addEnumElement
                 */
                // -beg- preserve=no 358A699B028E remove_head358A671C0162 "Enumeration::removeEnumElement"
                public EnumElement removeEnumElement(EnumElement enumElement1)
                // -end- 358A699B028E remove_head358A671C0162 "Enumeration::removeEnumElement"
                {
                  // -beg- preserve=no 358A699B028E remove_body358A671C0162 "Enumeration::removeEnumElement"
                  EnumElement ret=null;
                  if(enumElement1==null || !enumElement.contains(enumElement1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = enumElement1;
                  enumElement.remove(enumElement1);
                  enumElement1._unlinkEnumeration(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeEnumElement"));
                  return ret;
                  // -end- 358A699B028E remove_body358A671C0162 "Enumeration::removeEnumElement"
                }

                /** disconnect a EnumElement.
                 *  @see #addEnumElement
                 */
                // -beg- preserve=no 358A699B028E remove2_head358A671C0162 "Enumeration::remove2EnumElement"
                public EnumElement removeEnumElement(int index)
                // -end- 358A699B028E remove2_head358A671C0162 "Enumeration::remove2EnumElement"
                {
                  // -beg- preserve=no 358A699B028E remove2_body358A671C0162 "Enumeration::remove2EnumElement"
                  EnumElement ret=null;
                  ret = (EnumElement)enumElement.remove(index);
                  ret._unlinkEnumeration(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeEnumElement"));
                  return ret;
                  // -end- 358A699B028E remove2_body358A671C0162 "Enumeration::remove2EnumElement"
                }

                /** change a EnumElement.
                 *  @see #addEnumElement
                 */
                // -beg- preserve=no 358A699B028E set_head358A671C0162 "Enumeration::setEnumElement"
                public EnumElement setEnumElement(int index,EnumElement enumElement1)
                // -end- 358A699B028E set_head358A671C0162 "Enumeration::setEnumElement"
                {
                  // -beg- preserve=no 358A699B028E set_body358A671C0162 "Enumeration::setEnumElement"
                  EnumElement ret=null;
                  ret = (EnumElement)enumElement.set(index,enumElement1);
                  ret._unlinkEnumeration(this);
                  enumElement1._linkEnumeration(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setEnumElement"));
                  return ret;
                  // -end- 358A699B028E set_body358A671C0162 "Enumeration::setEnumElement"
                }

                /** tests if a given EnumElement is connected.
                 *  @see #addEnumElement
                 */
                // -beg- preserve=no 358A699B028E test_head358A671C0162 "Enumeration::containsEnumElement"
                public boolean containsEnumElement(EnumElement enumElement1)
                // -end- 358A699B028E test_head358A671C0162 "Enumeration::containsEnumElement"
                {
                  // -beg- preserve=no 358A699B028E test_body358A671C0162 "Enumeration::containsEnumElement"
                  return enumElement.contains(enumElement1);
                  // -end- 358A699B028E test_body358A671C0162 "Enumeration::containsEnumElement"
                }

                /** used to enumerate all connected EnumElements.
                 *  @see #addEnumElement
                 */
                // -beg- preserve=no 358A699B028E get_all_head358A671C0162 "Enumeration::iteratorEnumElement"
                public java.util.Iterator iteratorEnumElement()
                // -end- 358A699B028E get_all_head358A671C0162 "Enumeration::iteratorEnumElement"
                {
                  // -beg- preserve=no 358A699B028E get_all_body358A671C0162 "Enumeration::iteratorEnumElement"
                  return enumElement.iterator();
                  // -end- 358A699B028E get_all_body358A671C0162 "Enumeration::iteratorEnumElement"
                }

                /** disconnect all EnumElements.
                 *  @see #addEnumElement
                 */
                // -beg- preserve=no 358A699B028E remove_all_head358A671C0162 "Enumeration::clearEnumElement"
                public void clearEnumElement()
                // -end- 358A699B028E remove_all_head358A671C0162 "Enumeration::clearEnumElement"
                {
                  // -beg- preserve=no 358A699B028E remove_all_body358A671C0162 "Enumeration::clearEnumElement"
                  if(sizeEnumElement()>0){
                    for(java.util.Iterator p = enumElement.iterator(); p.hasNext();){
                      ((EnumElement)p.next())._unlinkEnumeration(this);
                    }
                    enumElement.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearEnumElement"));
                  }
                  // -end- 358A699B028E remove_all_body358A671C0162 "Enumeration::clearEnumElement"
                }

                /** returns the number of EnumElements.
                 *  @see #addEnumElement
                 */
                // -beg- preserve=no 358A699B028E size_head358A671C0162 "Enumeration::sizeEnumElement"
                public int sizeEnumElement()
                // -end- 358A699B028E size_head358A671C0162 "Enumeration::sizeEnumElement"
                {
                  // -beg- preserve=no 358A699B028E size_body358A671C0162 "Enumeration::sizeEnumElement"
                  return enumElement.size();
                  // -end- 358A699B028E size_body358A671C0162 "Enumeration::sizeEnumElement"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 358A699B028E _link_body358A671C0162 "Enumeration::_linkEnumElement"
                public void _linkEnumElement(EnumElement enumElement1)
                {
                  enumElement.add(enumElement1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkEnumElement"));
                  return;
                }
                // -end- 358A699B028E _link_body358A671C0162 "Enumeration::_linkEnumElement"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 358A699B028E _unlink_body358A671C0162 "Enumeration::_unlinkEnumElement"
                public void _unlinkEnumElement(EnumElement enumElement1)
                {
                  enumElement.remove(enumElement1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkEnumElement"));
                  return;
                }
                // -end- 358A699B028E _unlink_body358A671C0162 "Enumeration::_unlinkEnumElement"

                // -beg- preserve=no 358A69A40331 code358A671C0162 "parent"
                private EnumElement parent;
                // -end- 358A69A40331 code358A671C0162 "parent"

                /** attaches a Parent.
                 *  
                 *  @see #detachParent
                 *  @see #getParent
                 *  @see #containsParent
                 */
                // -beg- preserve=no 358A69A40331 attach_head358A671C0162 "Enumeration::attachParent"
                public void attachParent(EnumElement parent1)
                // -end- 358A69A40331 attach_head358A671C0162 "Enumeration::attachParent"
                {
                  // -beg- preserve=no 358A69A40331 attach_body358A671C0162 "Enumeration::attachParent"
                  if(parent!=null) {throw new java.lang.IllegalStateException("already a parent attached");}
                  if(parent1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as parent");}
                  parent = parent1;
                  parent1._linkChild(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachParent"));
                  return;
                  // -end- 358A69A40331 attach_body358A671C0162 "Enumeration::attachParent"
                }

                /** disconnect the currently attached Parent.
                 *  @see #attachParent
                 */
                // -beg- preserve=no 358A69A40331 detach_head358A671C0162 "Enumeration::detachParent"
                public EnumElement detachParent()
                // -end- 358A69A40331 detach_head358A671C0162 "Enumeration::detachParent"
                {
                  // -beg- preserve=no 358A69A40331 detach_body358A671C0162 "Enumeration::detachParent"
                  EnumElement ret = null;
                  if(parent!=null){
                    parent._unlinkChild(this);
                    ret = parent;
                    parent = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachParent"));
                  return ret;
                  // -end- 358A69A40331 detach_body358A671C0162 "Enumeration::detachParent"
                }

                /** get the currently attached Parent.
                 *  @see #attachParent
                 */
                // -beg- preserve=no 358A69A40331 get_head358A671C0162 "Enumeration::getParent"
                public EnumElement getParent()
                // -end- 358A69A40331 get_head358A671C0162 "Enumeration::getParent"
                {
                  // -beg- preserve=no 358A69A40331 get_body358A671C0162 "Enumeration::getParent"
                  if(parent==null) {throw new java.lang.IllegalStateException("no parent attached");}
                  return parent;
                  // -end- 358A69A40331 get_body358A671C0162 "Enumeration::getParent"
                }

                /** tests if there is a Parent attached.
                 *  @see #attachParent
                 */
                // -beg- preserve=no 358A69A40331 test_head358A671C0162 "Enumeration::containsParent"
                public boolean containsParent()
                // -end- 358A69A40331 test_head358A671C0162 "Enumeration::containsParent"
                {
                  // -beg- preserve=no 358A69A40331 test_body358A671C0162 "Enumeration::containsParent"
                  return parent!=null;
                  // -end- 358A69A40331 test_body358A671C0162 "Enumeration::containsParent"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 358A69A40331 _link_body358A671C0162 "Enumeration::_linkParent"
                public void _linkParent(EnumElement parent1)
                {
                  parent = parent1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkParent"));
                  return;
                }
                // -end- 358A69A40331 _link_body358A671C0162 "Enumeration::_linkParent"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 358A69A40331 _unlink_body358A671C0162 "Enumeration::_unlinkParent"
                public void _unlinkParent(EnumElement parent1)
                {
                  parent = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkParent"));
                  return;
                }
                // -end- 358A69A40331 _unlink_body358A671C0162 "Enumeration::_unlinkParent"

                // -beg- preserve=no 394891C000CF var358A671C0162 "kind"
                private int kind;
                // -end- 394891C000CF var358A671C0162 "kind"

                /** get current value of kind
                 *  UNDEFINED, ORDERED oder CIRCULAR
                 *  @see ch.ehi.interlis.domainsandconstants.basetypes.EnumKind
                 *  @see #setKind
                 */
                // -beg- preserve=no 394891C000CF get_head358A671C0162 "kind"
                public  int getKind()
                // -end- 394891C000CF get_head358A671C0162 "kind"
                {
                  // -beg- preserve=no 394891C000CF get_body358A671C0162 "kind"
                  return kind;
                  // -end- 394891C000CF get_body358A671C0162 "kind"
                }

                /** set current value of kind
                 *  @see ch.ehi.interlis.domainsandconstants.basetypes.EnumKind
                 *  @see #getKind
                 */
                // -beg- preserve=no 394891C000CF set_head358A671C0162 "kind"
                public  void setKind(int value1)
                // -end- 394891C000CF set_head358A671C0162 "kind"
                {
                  // -beg- preserve=no 394891C000CF set_body358A671C0162 "kind"
                  if(kind != value1){
                    kind = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setKind"));
                  }
                  // -end- 394891C000CF set_body358A671C0162 "kind"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=yes 358A671C0162 detail_end "Enumeration"
      public int findEnumElement(EnumElement enumElement1)
      {
        int ret=enumElement.indexOf(enumElement1);
        if(ret==-1){
          throw new java.lang.IllegalArgumentException("given EnumElement not found");
        }
        return ret;
      }
      public EnumElement getEnumElementAt(int index)
      {
        return (EnumElement)enumElement.get(index);
      }

                // -end- 358A671C0162 detail_end "Enumeration"

              }

