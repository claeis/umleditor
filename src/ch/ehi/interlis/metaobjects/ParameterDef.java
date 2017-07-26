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


              // -beg- preserve=no 3940EE310270 package "ParameterDef"
package ch.ehi.interlis.metaobjects;
              // -end- 3940EE310270 package "ParameterDef"

              // -beg- preserve=no 3940EE310270 autoimport "ParameterDef"
              import ch.ehi.interlis.IliSyntax;
              import ch.ehi.uml1_4.implementation.AbstractModelElement;
              import ch.ehi.interlis.modeltopicclass.ClassDef;
              import ch.ehi.interlis.metaobjects.Metaobject;
              import ch.ehi.interlis.attributes.AttrType;
              import ch.ehi.basics.types.NlsString;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 3940EE310270 autoimport "ParameterDef"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3940EE310270 import "ParameterDef"

              // -end- 3940EE310270 import "ParameterDef"

              /** Definiert einen Parameter in einer Klasse.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:21 $
               */
public class ParameterDef extends AbstractModelElement implements IliSyntax , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3940EE310270 detail_begin "ParameterDef"

                // -end- 3940EE310270 detail_begin "ParameterDef"

                // -beg- preserve=no 3D4FA21B0391 head3940EE310270 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B0391 head3940EE310270 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0391 throws3940EE310270 "unlinkAll"

                  // -end- 3D4FA21B0391 throws3940EE310270 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0391 body3940EE310270 "unlinkAll"
                  
                  detachClassDef();
                  detachMetaobject();
                  detachAttrType();
                  setName(null);
                  setMetaAttrb(null);
                  setSyntax(null);
                  super.unlinkAll();
                  // -end- 3D4FA21B0391 body3940EE310270 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B0392 head3940EE310270 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B0392 head3940EE310270 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0392 throws3940EE310270 "enumerateChildren"

                  // -end- 3D4FA21B0392 throws3940EE310270 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0392 body3940EE310270 "enumerateChildren"
                  java.util.Iterator it=null;
                  if(containsMetaobject())visitor.visit(getMetaobject());
                  if(containsAttrType())visitor.visit(getAttrType());
                  visitor.visit(getName());
                  visitor.visit(getMetaAttrb());
                  visitor.visit(getSyntax());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B0392 body3940EE310270 "enumerateChildren"
                  }

                // -beg- preserve=no 3941016100A6 code3940EE310270 "classDef"
                private ClassDef classDef;
                // -end- 3941016100A6 code3940EE310270 "classDef"

                /** attaches a ClassDef.
                 *  
                 *  @see #detachClassDef
                 *  @see #getClassDef
                 *  @see #containsClassDef
                 */
                // -beg- preserve=no 3941016100A6 attach_head3940EE310270 "ParameterDef::attachClassDef"
                public void attachClassDef(ClassDef classDef1)
                // -end- 3941016100A6 attach_head3940EE310270 "ParameterDef::attachClassDef"
                {
                  // -beg- preserve=no 3941016100A6 attach_body3940EE310270 "ParameterDef::attachClassDef"
                  if(classDef!=null) {throw new java.lang.IllegalStateException("already a classDef attached");}
                  if(classDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as classDef");}
                  classDef = classDef1;
                  classDef1._linkParameterDef(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachClassDef"));
                  return;
                  // -end- 3941016100A6 attach_body3940EE310270 "ParameterDef::attachClassDef"
                }

                /** disconnect the currently attached ClassDef.
                 *  @see #attachClassDef
                 */
                // -beg- preserve=no 3941016100A6 detach_head3940EE310270 "ParameterDef::detachClassDef"
                public ClassDef detachClassDef()
                // -end- 3941016100A6 detach_head3940EE310270 "ParameterDef::detachClassDef"
                {
                  // -beg- preserve=no 3941016100A6 detach_body3940EE310270 "ParameterDef::detachClassDef"
                  ClassDef ret = null;
                  if(classDef!=null){
                    classDef._unlinkParameterDef(this);
                    ret = classDef;
                    classDef = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachClassDef"));
                  return ret;
                  // -end- 3941016100A6 detach_body3940EE310270 "ParameterDef::detachClassDef"
                }

                /** get the currently attached ClassDef.
                 *  @see #attachClassDef
                 */
                // -beg- preserve=no 3941016100A6 get_head3940EE310270 "ParameterDef::getClassDef"
                public ClassDef getClassDef()
                // -end- 3941016100A6 get_head3940EE310270 "ParameterDef::getClassDef"
                {
                  // -beg- preserve=no 3941016100A6 get_body3940EE310270 "ParameterDef::getClassDef"
                  if(classDef==null) {throw new java.lang.IllegalStateException("no classDef attached");}
                  return classDef;
                  // -end- 3941016100A6 get_body3940EE310270 "ParameterDef::getClassDef"
                }

                /** tests if there is a ClassDef attached.
                 *  @see #attachClassDef
                 */
                // -beg- preserve=no 3941016100A6 test_head3940EE310270 "ParameterDef::containsClassDef"
                public boolean containsClassDef()
                // -end- 3941016100A6 test_head3940EE310270 "ParameterDef::containsClassDef"
                {
                  // -beg- preserve=no 3941016100A6 test_body3940EE310270 "ParameterDef::containsClassDef"
                  return classDef!=null;
                  // -end- 3941016100A6 test_body3940EE310270 "ParameterDef::containsClassDef"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3941016100A6 _link_body3940EE310270 "ParameterDef::_linkClassDef"
                public void _linkClassDef(ClassDef classDef1)
                {
                  classDef = classDef1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkClassDef"));
                  return;
                }
                // -end- 3941016100A6 _link_body3940EE310270 "ParameterDef::_linkClassDef"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3941016100A6 _unlink_body3940EE310270 "ParameterDef::_unlinkClassDef"
                public void _unlinkClassDef(ClassDef classDef1)
                {
                  classDef = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkClassDef"));
                  return;
                }
                // -end- 3941016100A6 _unlink_body3940EE310270 "ParameterDef::_unlinkClassDef"

                // -beg- preserve=no 394748950003 code3940EE310270 "metaobject"
                private Metaobject metaobject;
                // -end- 394748950003 code3940EE310270 "metaobject"

                /** attaches a Metaobject.
                 *  
                 *  @see #detachMetaobject
                 *  @see #getMetaobject
                 *  @see #containsMetaobject
                 */
                // -beg- preserve=no 394748950003 attach_head3940EE310270 "ParameterDef::attachMetaobject"
                public void attachMetaobject(Metaobject metaobject1)
                // -end- 394748950003 attach_head3940EE310270 "ParameterDef::attachMetaobject"
                {
                  // -beg- preserve=no 394748950003 attach_body3940EE310270 "ParameterDef::attachMetaobject"
                  if(metaobject!=null) {throw new java.lang.IllegalStateException("already a metaobject attached");}
                  if(metaobject1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as metaobject");}
                  metaobject = metaobject1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachMetaobject"));
                  return;
                  // -end- 394748950003 attach_body3940EE310270 "ParameterDef::attachMetaobject"
                }

                /** disconnect the currently attached Metaobject.
                 *  @see #attachMetaobject
                 */
                // -beg- preserve=no 394748950003 detach_head3940EE310270 "ParameterDef::detachMetaobject"
                public Metaobject detachMetaobject()
                // -end- 394748950003 detach_head3940EE310270 "ParameterDef::detachMetaobject"
                {
                  // -beg- preserve=no 394748950003 detach_body3940EE310270 "ParameterDef::detachMetaobject"
                  Metaobject ret = null;
                  ret = metaobject;
                  metaobject = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachMetaobject"));
                  return ret;
                  // -end- 394748950003 detach_body3940EE310270 "ParameterDef::detachMetaobject"
                }

                /** get the currently attached Metaobject.
                 *  @see #attachMetaobject
                 */
                // -beg- preserve=no 394748950003 get_head3940EE310270 "ParameterDef::getMetaobject"
                public Metaobject getMetaobject()
                // -end- 394748950003 get_head3940EE310270 "ParameterDef::getMetaobject"
                {
                  // -beg- preserve=no 394748950003 get_body3940EE310270 "ParameterDef::getMetaobject"
                  if(metaobject==null) {throw new java.lang.IllegalStateException("no metaobject attached");}
                  return metaobject;
                  // -end- 394748950003 get_body3940EE310270 "ParameterDef::getMetaobject"
                }

                /** tests if there is a Metaobject attached.
                 *  @see #attachMetaobject
                 */
                // -beg- preserve=no 394748950003 test_head3940EE310270 "ParameterDef::containsMetaobject"
                public boolean containsMetaobject()
                // -end- 394748950003 test_head3940EE310270 "ParameterDef::containsMetaobject"
                {
                  // -beg- preserve=no 394748950003 test_body3940EE310270 "ParameterDef::containsMetaobject"
                  return metaobject!=null;
                  // -end- 394748950003 test_body3940EE310270 "ParameterDef::containsMetaobject"
                }

                // -beg- preserve=no 3947491E0303 code3940EE310270 "attrType"
                private AttrType attrType;
                // -end- 3947491E0303 code3940EE310270 "attrType"

                /** attaches a AttrType.
                 *  
                 *  @see #detachAttrType
                 *  @see #getAttrType
                 *  @see #containsAttrType
                 */
                // -beg- preserve=no 3947491E0303 attach_head3940EE310270 "ParameterDef::attachAttrType"
                public void attachAttrType(AttrType attrType1)
                // -end- 3947491E0303 attach_head3940EE310270 "ParameterDef::attachAttrType"
                {
                  // -beg- preserve=no 3947491E0303 attach_body3940EE310270 "ParameterDef::attachAttrType"
                  if(attrType!=null) {throw new java.lang.IllegalStateException("already a attrType attached");}
                  if(attrType1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as attrType");}
                  attrType = attrType1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAttrType"));
                  return;
                  // -end- 3947491E0303 attach_body3940EE310270 "ParameterDef::attachAttrType"
                }

                /** disconnect the currently attached AttrType.
                 *  @see #attachAttrType
                 */
                // -beg- preserve=no 3947491E0303 detach_head3940EE310270 "ParameterDef::detachAttrType"
                public AttrType detachAttrType()
                // -end- 3947491E0303 detach_head3940EE310270 "ParameterDef::detachAttrType"
                {
                  // -beg- preserve=no 3947491E0303 detach_body3940EE310270 "ParameterDef::detachAttrType"
                  AttrType ret = null;
                  ret = attrType;
                  attrType = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAttrType"));
                  return ret;
                  // -end- 3947491E0303 detach_body3940EE310270 "ParameterDef::detachAttrType"
                }

                /** get the currently attached AttrType.
                 *  @see #attachAttrType
                 */
                // -beg- preserve=no 3947491E0303 get_head3940EE310270 "ParameterDef::getAttrType"
                public AttrType getAttrType()
                // -end- 3947491E0303 get_head3940EE310270 "ParameterDef::getAttrType"
                {
                  // -beg- preserve=no 3947491E0303 get_body3940EE310270 "ParameterDef::getAttrType"
                  if(attrType==null) {throw new java.lang.IllegalStateException("no attrType attached");}
                  return attrType;
                  // -end- 3947491E0303 get_body3940EE310270 "ParameterDef::getAttrType"
                }

                /** tests if there is a AttrType attached.
                 *  @see #attachAttrType
                 */
                // -beg- preserve=no 3947491E0303 test_head3940EE310270 "ParameterDef::containsAttrType"
                public boolean containsAttrType()
                // -end- 3947491E0303 test_head3940EE310270 "ParameterDef::containsAttrType"
                {
                  // -beg- preserve=no 3947491E0303 test_body3940EE310270 "ParameterDef::containsAttrType"
                  return attrType!=null;
                  // -end- 3947491E0303 test_body3940EE310270 "ParameterDef::containsAttrType"
                }

                // -beg- preserve=no 394746900032 var3940EE310270 "name"

                // -end- 394746900032 var3940EE310270 "name"

                /** get current value of name
                 *  Name des Parameters
                 *  @see #setName
                 */
                // -beg- preserve=no 394746900032 get_head3940EE310270 "name"
                public  NlsString getName()
                // -end- 394746900032 get_head3940EE310270 "name"
                {
                  // -beg- preserve=no 394746900032 get_body3940EE310270 "name"
                  return super.getName();
                  // -end- 394746900032 get_body3940EE310270 "name"
                }

                /** set current value of name
                 *  @see #getName
                 */
                // -beg- preserve=no 394746900032 set_head3940EE310270 "name"
                public  void setName(NlsString value1)
                // -end- 394746900032 set_head3940EE310270 "name"
                {
                  // -beg- preserve=no 394746900032 set_body3940EE310270 "name"
                  super.setName(value1);
                  // -end- 394746900032 set_body3940EE310270 "name"
                }

                // -beg- preserve=no 394746C20200 var3940EE310270 "properties"
                private long properties;
                // -end- 394746C20200 var3940EE310270 "properties"

                /** get current value of properties
                 *  Vererbungseigenschaften
                 *  @see #setProperties
                 */
                // -beg- preserve=no 394746C20200 get_head3940EE310270 "properties"
                public  long getProperties()
                // -end- 394746C20200 get_head3940EE310270 "properties"
                {
                  // -beg- preserve=no 394746C20200 get_body3940EE310270 "properties"
                  return properties;
                  // -end- 394746C20200 get_body3940EE310270 "properties"
                }

                /** set current value of properties
                 *  @see #getProperties
                 */
                // -beg- preserve=no 394746C20200 set_head3940EE310270 "properties"
                public  void setProperties(long value1)
                // -end- 394746C20200 set_head3940EE310270 "properties"
                {
                  // -beg- preserve=no 394746C20200 set_body3940EE310270 "properties"
                  if(properties != value1){
                    properties = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setProperties"));
                  }
                  // -end- 394746C20200 set_body3940EE310270 "properties"
                }

                // -beg- preserve=no 3C8F5ABE022D var3940EE310270 "syntax"
                private NlsString syntax = null;
                // -end- 3C8F5ABE022D var3940EE310270 "syntax"

                /** get current value of syntax
                 *  the actual definition of the model element in valid INTERLIS syntax.
                 *  @see #setSyntax
                 */
                // -beg- preserve=no 3C8F5ABE022D get_head3940EE310270 "syntax"
                public  NlsString getSyntax()
                // -end- 3C8F5ABE022D get_head3940EE310270 "syntax"
                {
                  // -beg- preserve=no 3C8F5ABE022D get_body3940EE310270 "syntax"
                  return syntax;
                  // -end- 3C8F5ABE022D get_body3940EE310270 "syntax"
                }

                /** set current value of syntax
                 *  @see #getSyntax
                 */
                // -beg- preserve=no 3C8F5ABE022D set_head3940EE310270 "syntax"
                public  void setSyntax(NlsString value1)
                // -end- 3C8F5ABE022D set_head3940EE310270 "syntax"
                {
                  // -beg- preserve=no 3C8F5ABE022D set_body3940EE310270 "syntax"
                  if(syntax!=value1 && (syntax==null || !syntax.equals(value1))){
                    syntax = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setSyntax"));
                  }
                  // -end- 3C8F5ABE022D set_body3940EE310270 "syntax"
                }

                public NlsString getMetaAttrb(){
                	return super.getMetaAttrb();
                 }
                 
                 public void setMetaAttrb(NlsString value) {
                	 super.setMettaAttrb(value);	
                 }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3940EE310270 detail_end "ParameterDef"

                // -end- 3940EE310270 detail_end "ParameterDef"

              }

