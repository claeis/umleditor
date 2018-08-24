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


              // -beg- preserve=no 35B870B60005 package "LineFormCmt"
package ch.ehi.interlis.domainsandconstants.linetypes;
              // -end- 35B870B60005 package "LineFormCmt"

              // -beg- preserve=no 35B870B60005 autoimport "LineFormCmt"
              import ch.ehi.uml1_4.implementation.AbstractEditorElement;
              import ch.ehi.interlis.domainsandconstants.linetypes.LineForm;
              import ch.ehi.basics.types.NlsString;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 35B870B60005 autoimport "LineFormCmt"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 35B870B60005 import "LineFormCmt"

              // -end- 35B870B60005 import "LineFormCmt"

              /** Erlaeuterungen der Verbindungsgeometrie.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:40 $
               */
public class LineFormCmt extends AbstractEditorElement implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 35B870B60005 detail_begin "LineFormCmt"

                // -end- 35B870B60005 detail_begin "LineFormCmt"

                // -beg- preserve=no 3D4FA21B0341 head35B870B60005 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B0341 head35B870B60005 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0341 throws35B870B60005 "unlinkAll"

                  // -end- 3D4FA21B0341 throws35B870B60005 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0341 body35B870B60005 "unlinkAll"
                  
                  detachLineForm();
                  setExplanation(null);
                  super.unlinkAll();
                  // -end- 3D4FA21B0341 body35B870B60005 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B0342 head35B870B60005 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B0342 head35B870B60005 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0342 throws35B870B60005 "enumerateChildren"

                  // -end- 3D4FA21B0342 throws35B870B60005 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0342 body35B870B60005 "enumerateChildren"
                  java.util.Iterator it=null;
                  visitor.visit(getExplanation());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B0342 body35B870B60005 "enumerateChildren"
                  }

                // -beg- preserve=no 35B870CB0088 code35B870B60005 "lineForm"
                private LineForm lineForm;
                // -end- 35B870CB0088 code35B870B60005 "lineForm"

                /** attaches a LineForm.
                 *  
                 *  @see #detachLineForm
                 *  @see #getLineForm
                 *  @see #containsLineForm
                 */
                // -beg- preserve=no 35B870CB0088 attach_head35B870B60005 "LineFormCmt::attachLineForm"
                public void attachLineForm(LineForm lineForm1)
                // -end- 35B870CB0088 attach_head35B870B60005 "LineFormCmt::attachLineForm"
                {
                  // -beg- preserve=no 35B870CB0088 attach_body35B870B60005 "LineFormCmt::attachLineForm"
                  if(lineForm!=null) {throw new java.lang.IllegalStateException("already a lineForm attached");}
                  if(lineForm1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as lineForm");}
                  lineForm = lineForm1;
                  lineForm1._linkLineFormCmt(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachLineForm"));
                  return;
                  // -end- 35B870CB0088 attach_body35B870B60005 "LineFormCmt::attachLineForm"
                }

                /** disconnect the currently attached LineForm.
                 *  @see #attachLineForm
                 */
                // -beg- preserve=no 35B870CB0088 detach_head35B870B60005 "LineFormCmt::detachLineForm"
                public LineForm detachLineForm()
                // -end- 35B870CB0088 detach_head35B870B60005 "LineFormCmt::detachLineForm"
                {
                  // -beg- preserve=no 35B870CB0088 detach_body35B870B60005 "LineFormCmt::detachLineForm"
                  LineForm ret = null;
                  if(lineForm!=null){
                    lineForm._unlinkLineFormCmt(this);
                    ret = lineForm;
                    lineForm = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachLineForm"));
                  return ret;
                  // -end- 35B870CB0088 detach_body35B870B60005 "LineFormCmt::detachLineForm"
                }

                /** get the currently attached LineForm.
                 *  @see #attachLineForm
                 */
                // -beg- preserve=no 35B870CB0088 get_head35B870B60005 "LineFormCmt::getLineForm"
                public LineForm getLineForm()
                // -end- 35B870CB0088 get_head35B870B60005 "LineFormCmt::getLineForm"
                {
                  // -beg- preserve=no 35B870CB0088 get_body35B870B60005 "LineFormCmt::getLineForm"
                  if(lineForm==null) {throw new java.lang.IllegalStateException("no lineForm attached");}
                  return lineForm;
                  // -end- 35B870CB0088 get_body35B870B60005 "LineFormCmt::getLineForm"
                }

                /** tests if there is a LineForm attached.
                 *  @see #attachLineForm
                 */
                // -beg- preserve=no 35B870CB0088 test_head35B870B60005 "LineFormCmt::containsLineForm"
                public boolean containsLineForm()
                // -end- 35B870CB0088 test_head35B870B60005 "LineFormCmt::containsLineForm"
                {
                  // -beg- preserve=no 35B870CB0088 test_body35B870B60005 "LineFormCmt::containsLineForm"
                  return lineForm!=null;
                  // -end- 35B870CB0088 test_body35B870B60005 "LineFormCmt::containsLineForm"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 35B870CB0088 _link_body35B870B60005 "LineFormCmt::_linkLineForm"
                public void _linkLineForm(LineForm lineForm1)
                {
                  lineForm = lineForm1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkLineForm"));
                  return;
                }
                // -end- 35B870CB0088 _link_body35B870B60005 "LineFormCmt::_linkLineForm"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 35B870CB0088 _unlink_body35B870B60005 "LineFormCmt::_unlinkLineForm"
                public void _unlinkLineForm(LineForm lineForm1)
                {
                  lineForm = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkLineForm"));
                  return;
                }
                // -end- 35B870CB0088 _unlink_body35B870B60005 "LineFormCmt::_unlinkLineForm"

                // -beg- preserve=no 35B870D802CB var35B870B60005 "explanation"
                private NlsString explanation = null;
                // -end- 35B870D802CB var35B870B60005 "explanation"

                /** get current value of explanation
                 *  Erlaeuterung der Verbindungsgeometrie.
                 *  @see #setExplanation
                 */
                // -beg- preserve=no 35B870D802CB get_head35B870B60005 "explanation"
                public  NlsString getExplanation()
                // -end- 35B870D802CB get_head35B870B60005 "explanation"
                {
                  // -beg- preserve=no 35B870D802CB get_body35B870B60005 "explanation"
                  return explanation;
                  // -end- 35B870D802CB get_body35B870B60005 "explanation"
                }

                /** set current value of explanation
                 *  @see #getExplanation
                 */
                // -beg- preserve=no 35B870D802CB set_head35B870B60005 "explanation"
                public  void setExplanation(NlsString value1)
                // -end- 35B870D802CB set_head35B870B60005 "explanation"
                {
                  // -beg- preserve=no 35B870D802CB set_body35B870B60005 "explanation"
                  if(explanation!=value1 && (explanation==null || !explanation.equals(value1))){
                    explanation = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setExplanation"));
                  }
                  // -end- 35B870D802CB set_body35B870B60005 "explanation"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 35B870B60005 detail_end "LineFormCmt"

                // -end- 35B870B60005 detail_end "LineFormCmt"

              }

