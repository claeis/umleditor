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


              // -beg- preserve=no 3C1DC4060258 package "Translation"
package ch.ehi.interlis.modeltopicclass;
              // -end- 3C1DC4060258 package "Translation"

              // -beg- preserve=no 3C1DC4060258 autoimport "Translation"
              import ch.ehi.uml1_4.foundation.core.Element;
              import ch.ehi.uml1_4.implementation.AbstractEditorElement;
              import ch.ehi.interlis.modeltopicclass.ModelDef;
              import ch.ehi.basics.tools.AbstractVisitor;
              import ch.ehi.basics.types.NlsString;
              // -end- 3C1DC4060258 autoimport "Translation"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3C1DC4060258 import "Translation"

              // -end- 3C1DC4060258 import "Translation"

              /** Defines a translation of a model
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:14 $
               */
public class Translation extends AbstractEditorElement implements Element , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1DC4060258 detail_begin "Translation"

                // -end- 3C1DC4060258 detail_begin "Translation"

                // -beg- preserve=no 3D4FA21A0110 head3C1DC4060258 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21A0110 head3C1DC4060258 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A0110 throws3C1DC4060258 "unlinkAll"

                  // -end- 3D4FA21A0110 throws3C1DC4060258 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A0110 body3C1DC4060258 "unlinkAll"
                  
                  detachModelDef();
                  setMetaAttrb(null);
                  setDocumentation(null);
                  super.unlinkAll();
                  // -end- 3D4FA21A0110 body3C1DC4060258 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21A012D head3C1DC4060258 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21A012D head3C1DC4060258 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A012D throws3C1DC4060258 "enumerateChildren"

                  // -end- 3D4FA21A012D throws3C1DC4060258 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21A012D body3C1DC4060258 "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getMetaAttrb());
                  visitor.visit(getDocumentation());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21A012D body3C1DC4060258 "enumerateChildren"
                  }

                // -beg- preserve=no 3C1DC4150214 code3C1DC4060258 "modelDef"
                private ModelDef modelDef;
                // -end- 3C1DC4150214 code3C1DC4060258 "modelDef"

                /** attaches a ModelDef.
                 *  
                 *  @see #detachModelDef
                 *  @see #getModelDef
                 *  @see #containsModelDef
                 */
                // -beg- preserve=no 3C1DC4150214 attach_head3C1DC4060258 "Translation::attachModelDef"
                public void attachModelDef(ModelDef modelDef1)
                // -end- 3C1DC4150214 attach_head3C1DC4060258 "Translation::attachModelDef"
                {
                  // -beg- preserve=no 3C1DC4150214 attach_body3C1DC4060258 "Translation::attachModelDef"
                  if(modelDef!=null) {throw new java.lang.IllegalStateException("already a modelDef attached");}
                  if(modelDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as modelDef");}
                  modelDef = modelDef1;
                  modelDef1._linkTranslation(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachModelDef"));
                  return;
                  // -end- 3C1DC4150214 attach_body3C1DC4060258 "Translation::attachModelDef"
                }

                /** disconnect the currently attached ModelDef.
                 *  @see #attachModelDef
                 */
                // -beg- preserve=no 3C1DC4150214 detach_head3C1DC4060258 "Translation::detachModelDef"
                public ModelDef detachModelDef()
                // -end- 3C1DC4150214 detach_head3C1DC4060258 "Translation::detachModelDef"
                {
                  // -beg- preserve=no 3C1DC4150214 detach_body3C1DC4060258 "Translation::detachModelDef"
                  ModelDef ret = null;
                  if(modelDef!=null){
                    modelDef._unlinkTranslation(this);
                    ret = modelDef;
                    modelDef = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachModelDef"));
                  return ret;
                  // -end- 3C1DC4150214 detach_body3C1DC4060258 "Translation::detachModelDef"
                }

                /** get the currently attached ModelDef.
                 *  @see #attachModelDef
                 */
                // -beg- preserve=no 3C1DC4150214 get_head3C1DC4060258 "Translation::getModelDef"
                public ModelDef getModelDef()
                // -end- 3C1DC4150214 get_head3C1DC4060258 "Translation::getModelDef"
                {
                  // -beg- preserve=no 3C1DC4150214 get_body3C1DC4060258 "Translation::getModelDef"
                  if(modelDef==null) {throw new java.lang.IllegalStateException("no modelDef attached");}
                  return modelDef;
                  // -end- 3C1DC4150214 get_body3C1DC4060258 "Translation::getModelDef"
                }

                /** tests if there is a ModelDef attached.
                 *  @see #attachModelDef
                 */
                // -beg- preserve=no 3C1DC4150214 test_head3C1DC4060258 "Translation::containsModelDef"
                public boolean containsModelDef()
                // -end- 3C1DC4150214 test_head3C1DC4060258 "Translation::containsModelDef"
                {
                  // -beg- preserve=no 3C1DC4150214 test_body3C1DC4060258 "Translation::containsModelDef"
                  return modelDef!=null;
                  // -end- 3C1DC4150214 test_body3C1DC4060258 "Translation::containsModelDef"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3C1DC4150214 _link_body3C1DC4060258 "Translation::_linkModelDef"
                public void _linkModelDef(ModelDef modelDef1)
                {
                  modelDef = modelDef1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkModelDef"));
                  return;
                }
                // -end- 3C1DC4150214 _link_body3C1DC4060258 "Translation::_linkModelDef"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3C1DC4150214 _unlink_body3C1DC4060258 "Translation::_unlinkModelDef"
                public void _unlinkModelDef(ModelDef modelDef1)
                {
                  modelDef = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkModelDef"));
                  return;
                }
                // -end- 3C1DC4150214 _unlink_body3C1DC4060258 "Translation::_unlinkModelDef"

                // -beg- preserve=no 3940A71F0074 var3C1DC4060258 "language"
                private String language;
                // -end- 3940A71F0074 var3C1DC4060258 "language"

                /** get current value of language
                 *  Defines the lanugage used for this translation.
                 *  @see #setLanguage
                 */
                // -beg- preserve=no 3940A71F0074 get_head3C1DC4060258 "language"
                public  String getLanguage()
                // -end- 3940A71F0074 get_head3C1DC4060258 "language"
                {
                  // -beg- preserve=no 3940A71F0074 get_body3C1DC4060258 "language"
                  return language;
                  // -end- 3940A71F0074 get_body3C1DC4060258 "language"
                }

                /** set current value of language
                 *  @see #getLanguage
                 */
                // -beg- preserve=no 3940A71F0074 set_head3C1DC4060258 "language"
                public  void setLanguage(String value1)
                // -end- 3940A71F0074 set_head3C1DC4060258 "language"
                {
                  // -beg- preserve=no 3940A71F0074 set_body3C1DC4060258 "language"
                  if(language != value1){
                    language = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setLanguage"));
                  }
                  // -end- 3940A71F0074 set_body3C1DC4060258 "language"
                }

                // -beg- preserve=no 3CFE1D76003C var3C1DC4060258 "baseLanguage"
                private String baseLanguage;
                // -end- 3CFE1D76003C var3C1DC4060258 "baseLanguage"

                /** get current value of baseLanguage
                 *  @see #setBaseLanguage
                 */
                // -beg- preserve=no 3CFE1D76003C get_head3C1DC4060258 "baseLanguage"
                public  String getBaseLanguage()
                // -end- 3CFE1D76003C get_head3C1DC4060258 "baseLanguage"
                {
                  // -beg- preserve=no 3CFE1D76003C get_body3C1DC4060258 "baseLanguage"
                  return baseLanguage;
                  // -end- 3CFE1D76003C get_body3C1DC4060258 "baseLanguage"
                }

                /** set current value of baseLanguage
                 *  @see #getBaseLanguage
                 */
                // -beg- preserve=no 3CFE1D76003C set_head3C1DC4060258 "baseLanguage"
                public  void setBaseLanguage(String value1)
                // -end- 3CFE1D76003C set_head3C1DC4060258 "baseLanguage"
                {
                  // -beg- preserve=no 3CFE1D76003C set_body3C1DC4060258 "baseLanguage"
                  if(baseLanguage != value1){
                    baseLanguage = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBaseLanguage"));
                  }
                  // -end- 3CFE1D76003C set_body3C1DC4060258 "baseLanguage"
                }

                // -beg- preserve=no 3C1DF92B0234 var3C1DC4060258 "documentation"
                private NlsString documentation = null;
                // -end- 3C1DF92B0234 var3C1DC4060258 "documentation"

                /** get current value of documentation
                 *  @see #setDocumentation
                 */
                // -beg- preserve=no 3C1DF92B0234 get_head3C1DC4060258 "documentation"
                public  NlsString getDocumentation()
                // -end- 3C1DF92B0234 get_head3C1DC4060258 "documentation"
                {
                  // -beg- preserve=no 3C1DF92B0234 get_body3C1DC4060258 "documentation"
                  return documentation;
                  // -end- 3C1DF92B0234 get_body3C1DC4060258 "documentation"
                }

                /** set current value of documentation
                 *  @see #getDocumentation
                 */
                // -beg- preserve=no 3C1DF92B0234 set_head3C1DC4060258 "documentation"
                public  void setDocumentation(NlsString value1)
                // -end- 3C1DF92B0234 set_head3C1DC4060258 "documentation"
                {
                  // -beg- preserve=no 3C1DF92B0234 set_body3C1DC4060258 "documentation"
                  if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
                    documentation = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
                  }
                  // -end- 3C1DF92B0234 set_body3C1DC4060258 "documentation"
                }
                
                private NlsString metaAttrb = null;

				public NlsString getMetaAttrb() {
					return metaAttrb;
				}

				public void setMetaAttrb(NlsString value) {
					if(metaAttrb!=value && (metaAttrb==null || !metaAttrb.equals(value))){
	                    metaAttrb = value;
	                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMetaAttrb"));
	                  }
				}

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3C1DC4060258 detail_end "Translation"

                // -end- 3C1DC4060258 detail_end "Translation"

              }

