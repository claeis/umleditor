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


              // -beg- preserve=no 3940AD20009C package "Contract"
package ch.ehi.interlis.modeltopicclass;
              // -end- 3940AD20009C package "Contract"

              // -beg- preserve=no 3940AD20009C autoimport "Contract"
              import ch.ehi.uml1_4.foundation.core.Element;
              import ch.ehi.uml1_4.implementation.AbstractEditorElement;
              import ch.ehi.interlis.modeltopicclass.ModelDef;
              import ch.ehi.basics.types.NlsString;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 3940AD20009C autoimport "Contract"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 3940AD20009C import "Contract"

              // -end- 3940AD20009C import "Contract"

              /** Definiert einen Kontrakt zu einem Modell.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:35:38 $
               */
public class Contract extends AbstractEditorElement implements Element , java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3940AD20009C detail_begin "Contract"

                // -end- 3940AD20009C detail_begin "Contract"

                // -beg- preserve=no 3D4FA2190352 head3940AD20009C "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA2190352 head3940AD20009C "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA2190352 throws3940AD20009C "unlinkAll"

                  // -end- 3D4FA2190352 throws3940AD20009C "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA2190352 body3940AD20009C "unlinkAll"
                  
                  detachModelDef();
                  setIssuer(null);
                  setDocumentation(null);
                  super.unlinkAll();
                  // -end- 3D4FA2190352 body3940AD20009C "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA219035C head3940AD20009C "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA219035C head3940AD20009C "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA219035C throws3940AD20009C "enumerateChildren"

                  // -end- 3D4FA219035C throws3940AD20009C "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA219035C body3940AD20009C "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getIssuer());
                  visitor.visit(getDocumentation());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA219035C body3940AD20009C "enumerateChildren"
                  }

                // -beg- preserve=no 3940AD300136 code3940AD20009C "modelDef"
                private ModelDef modelDef;
                // -end- 3940AD300136 code3940AD20009C "modelDef"

                /** attaches a ModelDef.
                 *  
                 *  @see #detachModelDef
                 *  @see #getModelDef
                 *  @see #containsModelDef
                 */
                // -beg- preserve=no 3940AD300136 attach_head3940AD20009C "Contract::attachModelDef"
                public void attachModelDef(ModelDef modelDef1)
                // -end- 3940AD300136 attach_head3940AD20009C "Contract::attachModelDef"
                {
                  // -beg- preserve=no 3940AD300136 attach_body3940AD20009C "Contract::attachModelDef"
                  if(modelDef!=null) {throw new java.lang.IllegalStateException("already a modelDef attached");}
                  if(modelDef1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as modelDef");}
                  modelDef = modelDef1;
                  modelDef1._linkContract(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachModelDef"));
                  return;
                  // -end- 3940AD300136 attach_body3940AD20009C "Contract::attachModelDef"
                }

                /** disconnect the currently attached ModelDef.
                 *  @see #attachModelDef
                 */
                // -beg- preserve=no 3940AD300136 detach_head3940AD20009C "Contract::detachModelDef"
                public ModelDef detachModelDef()
                // -end- 3940AD300136 detach_head3940AD20009C "Contract::detachModelDef"
                {
                  // -beg- preserve=no 3940AD300136 detach_body3940AD20009C "Contract::detachModelDef"
                  ModelDef ret = null;
                  if(modelDef!=null){
                    modelDef._unlinkContract(this);
                    ret = modelDef;
                    modelDef = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachModelDef"));
                  return ret;
                  // -end- 3940AD300136 detach_body3940AD20009C "Contract::detachModelDef"
                }

                /** get the currently attached ModelDef.
                 *  @see #attachModelDef
                 */
                // -beg- preserve=no 3940AD300136 get_head3940AD20009C "Contract::getModelDef"
                public ModelDef getModelDef()
                // -end- 3940AD300136 get_head3940AD20009C "Contract::getModelDef"
                {
                  // -beg- preserve=no 3940AD300136 get_body3940AD20009C "Contract::getModelDef"
                  if(modelDef==null) {throw new java.lang.IllegalStateException("no modelDef attached");}
                  return modelDef;
                  // -end- 3940AD300136 get_body3940AD20009C "Contract::getModelDef"
                }

                /** tests if there is a ModelDef attached.
                 *  @see #attachModelDef
                 */
                // -beg- preserve=no 3940AD300136 test_head3940AD20009C "Contract::containsModelDef"
                public boolean containsModelDef()
                // -end- 3940AD300136 test_head3940AD20009C "Contract::containsModelDef"
                {
                  // -beg- preserve=no 3940AD300136 test_body3940AD20009C "Contract::containsModelDef"
                  return modelDef!=null;
                  // -end- 3940AD300136 test_body3940AD20009C "Contract::containsModelDef"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3940AD300136 _link_body3940AD20009C "Contract::_linkModelDef"
                public void _linkModelDef(ModelDef modelDef1)
                {
                  modelDef = modelDef1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkModelDef"));
                  return;
                }
                // -end- 3940AD300136 _link_body3940AD20009C "Contract::_linkModelDef"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3940AD300136 _unlink_body3940AD20009C "Contract::_unlinkModelDef"
                public void _unlinkModelDef(ModelDef modelDef1)
                {
                  modelDef = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkModelDef"));
                  return;
                }
                // -end- 3940AD300136 _unlink_body3940AD20009C "Contract::_unlinkModelDef"

                // -beg- preserve=no 3940AD80036B var3940AD20009C "issuer"
                private NlsString issuer = null;
                // -end- 3940AD80036B var3940AD20009C "issuer"

                /** get current value of issuer
                 *  Name des Herausgebers des Kontraktes
                 *  @see #setIssuer
                 */
                // -beg- preserve=no 3940AD80036B get_head3940AD20009C "issuer"
                public  NlsString getIssuer()
                // -end- 3940AD80036B get_head3940AD20009C "issuer"
                {
                  // -beg- preserve=no 3940AD80036B get_body3940AD20009C "issuer"
                  return issuer;
                  // -end- 3940AD80036B get_body3940AD20009C "issuer"
                }

                /** set current value of issuer
                 *  @see #getIssuer
                 */
                // -beg- preserve=no 3940AD80036B set_head3940AD20009C "issuer"
                public  void setIssuer(NlsString value1)
                // -end- 3940AD80036B set_head3940AD20009C "issuer"
                {
                  // -beg- preserve=no 3940AD80036B set_body3940AD20009C "issuer"
                  if(issuer!=value1 && (issuer==null || !issuer.equals(value1))){
                    issuer = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setIssuer"));
                  }
                  // -end- 3940AD80036B set_body3940AD20009C "issuer"
                }

                // -beg- preserve=no 3C1DF92B0234 var3940AD20009C "documentation"
                private NlsString documentation = null;
                // -end- 3C1DF92B0234 var3940AD20009C "documentation"

                /** get current value of documentation
                 *  @see #setDocumentation
                 */
                // -beg- preserve=no 3C1DF92B0234 get_head3940AD20009C "documentation"
                public  NlsString getDocumentation()
                // -end- 3C1DF92B0234 get_head3940AD20009C "documentation"
                {
                  // -beg- preserve=no 3C1DF92B0234 get_body3940AD20009C "documentation"
                  return documentation;
                  // -end- 3C1DF92B0234 get_body3940AD20009C "documentation"
                }

                /** set current value of documentation
                 *  @see #getDocumentation
                 */
                // -beg- preserve=no 3C1DF92B0234 set_head3940AD20009C "documentation"
                public  void setDocumentation(NlsString value1)
                // -end- 3C1DF92B0234 set_head3940AD20009C "documentation"
                {
                  // -beg- preserve=no 3C1DF92B0234 set_body3940AD20009C "documentation"
                  if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
                    documentation = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
                  }
                  // -end- 3C1DF92B0234 set_body3940AD20009C "documentation"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3940AD20009C detail_end "Contract"

                // -end- 3940AD20009C detail_end "Contract"

              }

