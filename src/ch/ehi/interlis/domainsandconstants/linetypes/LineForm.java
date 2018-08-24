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


              // -beg- preserve=no 35FB9EC803B9 package "LineForm"
package ch.ehi.interlis.domainsandconstants.linetypes;
              // -end- 35FB9EC803B9 package "LineForm"

              // -beg- preserve=no 35FB9EC803B9 autoimport "LineForm"
              import ch.ehi.uml1_4.implementation.AbstractEditorElement;
              import ch.ehi.interlis.domainsandconstants.linetypes.LineFormCmt;
              import ch.ehi.interlis.domainsandconstants.linetypes.LineType;
              import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
              import ch.ehi.basics.tools.AbstractVisitor;
              // -end- 35FB9EC803B9 autoimport "LineForm"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=no 35FB9EC803B9 import "LineForm"

              // -end- 35FB9EC803B9 import "LineForm"

              /** Definiert die Art der zulaessigen Verbindungsgeometrien.
               *  @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:34:40 $
               */
public class LineForm extends AbstractEditorElement implements java.io.Serializable
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 35FB9EC803B9 detail_begin "LineForm"

                // -end- 35FB9EC803B9 detail_begin "LineForm"

                // -beg- preserve=no 3D4FA21B0323 head35FB9EC803B9 "unlinkAll"
                public void unlinkAll()
                // -end- 3D4FA21B0323 head35FB9EC803B9 "unlinkAll"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0323 throws35FB9EC803B9 "unlinkAll"

                  // -end- 3D4FA21B0323 throws35FB9EC803B9 "unlinkAll"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B0323 body35FB9EC803B9 "unlinkAll"
                  
                  clearLineFormCmt();
                  detachLineType();
                  clearLineFormTypeDef();
                  super.unlinkAll();
                  // -end- 3D4FA21B0323 body35FB9EC803B9 "unlinkAll"
                  }

                // -beg- preserve=no 3D4FA21B032D head35FB9EC803B9 "enumerateChildren"
                public void enumerateChildren(AbstractVisitor visitor)
                // -end- 3D4FA21B032D head35FB9EC803B9 "enumerateChildren"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B032D throws35FB9EC803B9 "enumerateChildren"

                  // -end- 3D4FA21B032D throws35FB9EC803B9 "enumerateChildren"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D4FA21B032D body35FB9EC803B9 "enumerateChildren"
                  java.util.Iterator it=null;
                  it=iteratorLineFormCmt();while(it.hasNext())visitor.visit(it.next());
                  super.enumerateChildren(visitor);
                  // -end- 3D4FA21B032D body35FB9EC803B9 "enumerateChildren"
                  }

                // -beg- preserve=no 35B870CB0074 code35FB9EC803B9 "lineFormCmt"
                private java.util.Set lineFormCmt = new java.util.HashSet();
                // -end- 35B870CB0074 code35FB9EC803B9 "lineFormCmt"

                /** add a LineFormCmt.
                 *  
                 *  @see #removeLineFormCmt
                 *  @see #containsLineFormCmt
                 *  @see #iteratorLineFormCmt
                 *  @see #clearLineFormCmt
                 *  @see #sizeLineFormCmt
                 */
                // -beg- preserve=no 35B870CB0074 add_head35FB9EC803B9 "LineForm::addLineFormCmt"
                public void addLineFormCmt(LineFormCmt lineFormCmt1)
                // -end- 35B870CB0074 add_head35FB9EC803B9 "LineForm::addLineFormCmt"
                {
                  // -beg- preserve=no 35B870CB0074 add_body35FB9EC803B9 "LineForm::addLineFormCmt"
                  lineFormCmt.add(lineFormCmt1);
                  lineFormCmt1._linkLineForm(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addLineFormCmt"));
                  return;
                  // -end- 35B870CB0074 add_body35FB9EC803B9 "LineForm::addLineFormCmt"
                }

                /** disconnect a LineFormCmt.
                 *  @see #addLineFormCmt
                 */
                // -beg- preserve=no 35B870CB0074 remove_head35FB9EC803B9 "LineForm::removeLineFormCmt"
                public LineFormCmt removeLineFormCmt(LineFormCmt lineFormCmt1)
                // -end- 35B870CB0074 remove_head35FB9EC803B9 "LineForm::removeLineFormCmt"
                {
                  // -beg- preserve=no 35B870CB0074 remove_body35FB9EC803B9 "LineForm::removeLineFormCmt"
                  LineFormCmt ret=null;
                  if(lineFormCmt1==null || !lineFormCmt.contains(lineFormCmt1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = lineFormCmt1;
                  lineFormCmt.remove(lineFormCmt1);
                  lineFormCmt1._unlinkLineForm(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeLineFormCmt"));
                  return ret;
                  // -end- 35B870CB0074 remove_body35FB9EC803B9 "LineForm::removeLineFormCmt"
                }

                /** tests if a given LineFormCmt is connected.
                 *  @see #addLineFormCmt
                 */
                // -beg- preserve=no 35B870CB0074 test_head35FB9EC803B9 "LineForm::containsLineFormCmt"
                public boolean containsLineFormCmt(LineFormCmt lineFormCmt1)
                // -end- 35B870CB0074 test_head35FB9EC803B9 "LineForm::containsLineFormCmt"
                {
                  // -beg- preserve=no 35B870CB0074 test_body35FB9EC803B9 "LineForm::containsLineFormCmt"
                  return lineFormCmt.contains(lineFormCmt1);
                  // -end- 35B870CB0074 test_body35FB9EC803B9 "LineForm::containsLineFormCmt"
                }

                /** used to enumerate all connected LineFormCmts.
                 *  @see #addLineFormCmt
                 */
                // -beg- preserve=no 35B870CB0074 get_all_head35FB9EC803B9 "LineForm::iteratorLineFormCmt"
                public java.util.Iterator iteratorLineFormCmt()
                // -end- 35B870CB0074 get_all_head35FB9EC803B9 "LineForm::iteratorLineFormCmt"
                {
                  // -beg- preserve=no 35B870CB0074 get_all_body35FB9EC803B9 "LineForm::iteratorLineFormCmt"
                  return lineFormCmt.iterator();
                  // -end- 35B870CB0074 get_all_body35FB9EC803B9 "LineForm::iteratorLineFormCmt"
                }

                /** disconnect all LineFormCmts.
                 *  @see #addLineFormCmt
                 */
                // -beg- preserve=no 35B870CB0074 remove_all_head35FB9EC803B9 "LineForm::clearLineFormCmt"
                public void clearLineFormCmt()
                // -end- 35B870CB0074 remove_all_head35FB9EC803B9 "LineForm::clearLineFormCmt"
                {
                  // -beg- preserve=no 35B870CB0074 remove_all_body35FB9EC803B9 "LineForm::clearLineFormCmt"
                  if(sizeLineFormCmt()>0){
                    for(java.util.Iterator p = lineFormCmt.iterator(); p.hasNext();){
                      ((LineFormCmt)p.next())._unlinkLineForm(this);
                    }
                    lineFormCmt.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearLineFormCmt"));
                  }
                  // -end- 35B870CB0074 remove_all_body35FB9EC803B9 "LineForm::clearLineFormCmt"
                }

                /** returns the number of LineFormCmts.
                 *  @see #addLineFormCmt
                 */
                // -beg- preserve=no 35B870CB0074 size_head35FB9EC803B9 "LineForm::sizeLineFormCmt"
                public int sizeLineFormCmt()
                // -end- 35B870CB0074 size_head35FB9EC803B9 "LineForm::sizeLineFormCmt"
                {
                  // -beg- preserve=no 35B870CB0074 size_body35FB9EC803B9 "LineForm::sizeLineFormCmt"
                  return lineFormCmt.size();
                  // -end- 35B870CB0074 size_body35FB9EC803B9 "LineForm::sizeLineFormCmt"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 35B870CB0074 _link_body35FB9EC803B9 "LineForm::_linkLineFormCmt"
                public void _linkLineFormCmt(LineFormCmt lineFormCmt1)
                {
                  lineFormCmt.add(lineFormCmt1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkLineFormCmt"));
                  return;
                }
                // -end- 35B870CB0074 _link_body35FB9EC803B9 "LineForm::_linkLineFormCmt"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 35B870CB0074 _unlink_body35FB9EC803B9 "LineForm::_unlinkLineFormCmt"
                public void _unlinkLineFormCmt(LineFormCmt lineFormCmt1)
                {
                  lineFormCmt.remove(lineFormCmt1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkLineFormCmt"));
                  return;
                }
                // -end- 35B870CB0074 _unlink_body35FB9EC803B9 "LineForm::_unlinkLineFormCmt"

                // -beg- preserve=no 35FB9EE500F4 code35FB9EC803B9 "lineType"
                private LineType lineType;
                // -end- 35FB9EE500F4 code35FB9EC803B9 "lineType"

                /** attaches a LineType.
                 *  
                 *  @see #detachLineType
                 *  @see #getLineType
                 *  @see #containsLineType
                 */
                // -beg- preserve=no 35FB9EE500F4 attach_head35FB9EC803B9 "LineForm::attachLineType"
                public void attachLineType(LineType lineType1)
                // -end- 35FB9EE500F4 attach_head35FB9EC803B9 "LineForm::attachLineType"
                {
                  // -beg- preserve=no 35FB9EE500F4 attach_body35FB9EC803B9 "LineForm::attachLineType"
                  if(lineType!=null) {throw new java.lang.IllegalStateException("already a lineType attached");}
                  if(lineType1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as lineType");}
                  lineType = lineType1;
                  lineType1._linkLineForm(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachLineType"));
                  return;
                  // -end- 35FB9EE500F4 attach_body35FB9EC803B9 "LineForm::attachLineType"
                }

                /** disconnect the currently attached LineType.
                 *  @see #attachLineType
                 */
                // -beg- preserve=no 35FB9EE500F4 detach_head35FB9EC803B9 "LineForm::detachLineType"
                public LineType detachLineType()
                // -end- 35FB9EE500F4 detach_head35FB9EC803B9 "LineForm::detachLineType"
                {
                  // -beg- preserve=no 35FB9EE500F4 detach_body35FB9EC803B9 "LineForm::detachLineType"
                  LineType ret = null;
                  if(lineType!=null){
                    lineType._unlinkLineForm(this);
                    ret = lineType;
                    lineType = null;
                  }
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachLineType"));
                  return ret;
                  // -end- 35FB9EE500F4 detach_body35FB9EC803B9 "LineForm::detachLineType"
                }

                /** get the currently attached LineType.
                 *  @see #attachLineType
                 */
                // -beg- preserve=no 35FB9EE500F4 get_head35FB9EC803B9 "LineForm::getLineType"
                public LineType getLineType()
                // -end- 35FB9EE500F4 get_head35FB9EC803B9 "LineForm::getLineType"
                {
                  // -beg- preserve=no 35FB9EE500F4 get_body35FB9EC803B9 "LineForm::getLineType"
                  if(lineType==null) {throw new java.lang.IllegalStateException("no lineType attached");}
                  return lineType;
                  // -end- 35FB9EE500F4 get_body35FB9EC803B9 "LineForm::getLineType"
                }

                /** tests if there is a LineType attached.
                 *  @see #attachLineType
                 */
                // -beg- preserve=no 35FB9EE500F4 test_head35FB9EC803B9 "LineForm::containsLineType"
                public boolean containsLineType()
                // -end- 35FB9EE500F4 test_head35FB9EC803B9 "LineForm::containsLineType"
                {
                  // -beg- preserve=no 35FB9EE500F4 test_body35FB9EC803B9 "LineForm::containsLineType"
                  return lineType!=null;
                  // -end- 35FB9EE500F4 test_body35FB9EC803B9 "LineForm::containsLineType"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 35FB9EE500F4 _link_body35FB9EC803B9 "LineForm::_linkLineType"
                public void _linkLineType(LineType lineType1)
                {
                  lineType = lineType1;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkLineType"));
                  return;
                }
                // -end- 35FB9EE500F4 _link_body35FB9EC803B9 "LineForm::_linkLineType"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 35FB9EE500F4 _unlink_body35FB9EC803B9 "LineForm::_unlinkLineType"
                public void _unlinkLineType(LineType lineType1)
                {
                  lineType = null;
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkLineType"));
                  return;
                }
                // -end- 35FB9EE500F4 _unlink_body35FB9EC803B9 "LineForm::_unlinkLineType"

                // -beg- preserve=no 3948EB9801CF code35FB9EC803B9 "lineFormTypeDef"
                private java.util.Set lineFormTypeDef = new java.util.HashSet();
                // -end- 3948EB9801CF code35FB9EC803B9 "lineFormTypeDef"

                /** add a LineFormTypeDef.
                 *  
                 *  @see #removeLineFormTypeDef
                 *  @see #containsLineFormTypeDef
                 *  @see #iteratorLineFormTypeDef
                 *  @see #clearLineFormTypeDef
                 *  @see #sizeLineFormTypeDef
                 */
                // -beg- preserve=no 3948EB9801CF add_head35FB9EC803B9 "LineForm::addLineFormTypeDef"
                public void addLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
                // -end- 3948EB9801CF add_head35FB9EC803B9 "LineForm::addLineFormTypeDef"
                {
                  // -beg- preserve=no 3948EB9801CF add_body35FB9EC803B9 "LineForm::addLineFormTypeDef"
                  lineFormTypeDef.add(lineFormTypeDef1);
                  lineFormTypeDef1._linkLineForm(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addLineFormTypeDef"));
                  return;
                  // -end- 3948EB9801CF add_body35FB9EC803B9 "LineForm::addLineFormTypeDef"
                }

                /** disconnect a LineFormTypeDef.
                 *  @see #addLineFormTypeDef
                 */
                // -beg- preserve=no 3948EB9801CF remove_head35FB9EC803B9 "LineForm::removeLineFormTypeDef"
                public LineFormTypeDef removeLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
                // -end- 3948EB9801CF remove_head35FB9EC803B9 "LineForm::removeLineFormTypeDef"
                {
                  // -beg- preserve=no 3948EB9801CF remove_body35FB9EC803B9 "LineForm::removeLineFormTypeDef"
                  LineFormTypeDef ret=null;
                  if(lineFormTypeDef1==null || !lineFormTypeDef.contains(lineFormTypeDef1)){
                    throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
                  }
                  ret = lineFormTypeDef1;
                  lineFormTypeDef.remove(lineFormTypeDef1);
                  lineFormTypeDef1._unlinkLineForm(this);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeLineFormTypeDef"));
                  return ret;
                  // -end- 3948EB9801CF remove_body35FB9EC803B9 "LineForm::removeLineFormTypeDef"
                }

                /** tests if a given LineFormTypeDef is connected.
                 *  @see #addLineFormTypeDef
                 */
                // -beg- preserve=no 3948EB9801CF test_head35FB9EC803B9 "LineForm::containsLineFormTypeDef"
                public boolean containsLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
                // -end- 3948EB9801CF test_head35FB9EC803B9 "LineForm::containsLineFormTypeDef"
                {
                  // -beg- preserve=no 3948EB9801CF test_body35FB9EC803B9 "LineForm::containsLineFormTypeDef"
                  return lineFormTypeDef.contains(lineFormTypeDef1);
                  // -end- 3948EB9801CF test_body35FB9EC803B9 "LineForm::containsLineFormTypeDef"
                }

                /** used to enumerate all connected LineFormTypeDefs.
                 *  @see #addLineFormTypeDef
                 */
                // -beg- preserve=no 3948EB9801CF get_all_head35FB9EC803B9 "LineForm::iteratorLineFormTypeDef"
                public java.util.Iterator iteratorLineFormTypeDef()
                // -end- 3948EB9801CF get_all_head35FB9EC803B9 "LineForm::iteratorLineFormTypeDef"
                {
                  // -beg- preserve=no 3948EB9801CF get_all_body35FB9EC803B9 "LineForm::iteratorLineFormTypeDef"
                  return lineFormTypeDef.iterator();
                  // -end- 3948EB9801CF get_all_body35FB9EC803B9 "LineForm::iteratorLineFormTypeDef"
                }

                /** disconnect all LineFormTypeDefs.
                 *  @see #addLineFormTypeDef
                 */
                // -beg- preserve=no 3948EB9801CF remove_all_head35FB9EC803B9 "LineForm::clearLineFormTypeDef"
                public void clearLineFormTypeDef()
                // -end- 3948EB9801CF remove_all_head35FB9EC803B9 "LineForm::clearLineFormTypeDef"
                {
                  // -beg- preserve=no 3948EB9801CF remove_all_body35FB9EC803B9 "LineForm::clearLineFormTypeDef"
                  if(sizeLineFormTypeDef()>0){
                    for(java.util.Iterator p = lineFormTypeDef.iterator(); p.hasNext();){
                      ((LineFormTypeDef)p.next())._unlinkLineForm(this);
                    }
                    lineFormTypeDef.clear();
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearLineFormTypeDef"));
                  }
                  // -end- 3948EB9801CF remove_all_body35FB9EC803B9 "LineForm::clearLineFormTypeDef"
                }

                /** returns the number of LineFormTypeDefs.
                 *  @see #addLineFormTypeDef
                 */
                // -beg- preserve=no 3948EB9801CF size_head35FB9EC803B9 "LineForm::sizeLineFormTypeDef"
                public int sizeLineFormTypeDef()
                // -end- 3948EB9801CF size_head35FB9EC803B9 "LineForm::sizeLineFormTypeDef"
                {
                  // -beg- preserve=no 3948EB9801CF size_body35FB9EC803B9 "LineForm::sizeLineFormTypeDef"
                  return lineFormTypeDef.size();
                  // -end- 3948EB9801CF size_body35FB9EC803B9 "LineForm::sizeLineFormTypeDef"
                }

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3948EB9801CF _link_body35FB9EC803B9 "LineForm::_linkLineFormTypeDef"
                public void _linkLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
                {
                  lineFormTypeDef.add(lineFormTypeDef1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkLineFormTypeDef"));
                  return;
                }
                // -end- 3948EB9801CF _link_body35FB9EC803B9 "LineForm::_linkLineFormTypeDef"

                /** DONT USE; link management internal
                 */
                // -beg- preserve=no 3948EB9801CF _unlink_body35FB9EC803B9 "LineForm::_unlinkLineFormTypeDef"
                public void _unlinkLineFormTypeDef(LineFormTypeDef lineFormTypeDef1)
                {
                  lineFormTypeDef.remove(lineFormTypeDef1);
                  ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkLineFormTypeDef"));
                  return;
                }
                // -end- 3948EB9801CF _unlink_body35FB9EC803B9 "LineForm::_unlinkLineFormTypeDef"

                // -beg- preserve=no 3CCC22EB03B4 var35FB9EC803B9 "straights"
                private boolean straights = false;
                // -end- 3CCC22EB03B4 var35FB9EC803B9 "straights"

                /** get current value of straights
                 *  @see #setStraights
                 */
                // -beg- preserve=no 3CCC22EB03B4 get_head35FB9EC803B9 "straights"
                public  boolean isStraights()
                // -end- 3CCC22EB03B4 get_head35FB9EC803B9 "straights"
                {
                  // -beg- preserve=no 3CCC22EB03B4 get_body35FB9EC803B9 "straights"
                  return straights;
                  // -end- 3CCC22EB03B4 get_body35FB9EC803B9 "straights"
                }

                /** set current value of straights
                 *  @see #isStraights
                 */
                // -beg- preserve=no 3CCC22EB03B4 set_head35FB9EC803B9 "straights"
                public  void setStraights(boolean value1)
                // -end- 3CCC22EB03B4 set_head35FB9EC803B9 "straights"
                {
                  // -beg- preserve=no 3CCC22EB03B4 set_body35FB9EC803B9 "straights"
                  if(straights != value1){
                    straights = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setStraights"));
                  }
                  // -end- 3CCC22EB03B4 set_body35FB9EC803B9 "straights"
                }

                // -beg- preserve=no 3CCC22FD0283 var35FB9EC803B9 "arcs"
                private boolean arcs = false;
                // -end- 3CCC22FD0283 var35FB9EC803B9 "arcs"

                /** get current value of arcs
                 *  @see #setArcs
                 */
                // -beg- preserve=no 3CCC22FD0283 get_head35FB9EC803B9 "arcs"
                public  boolean isArcs()
                // -end- 3CCC22FD0283 get_head35FB9EC803B9 "arcs"
                {
                  // -beg- preserve=no 3CCC22FD0283 get_body35FB9EC803B9 "arcs"
                  return arcs;
                  // -end- 3CCC22FD0283 get_body35FB9EC803B9 "arcs"
                }

                /** set current value of arcs
                 *  @see #isArcs
                 */
                // -beg- preserve=no 3CCC22FD0283 set_head35FB9EC803B9 "arcs"
                public  void setArcs(boolean value1)
                // -end- 3CCC22FD0283 set_head35FB9EC803B9 "arcs"
                {
                  // -beg- preserve=no 3CCC22FD0283 set_body35FB9EC803B9 "arcs"
                  if(arcs != value1){
                    arcs = value1;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setArcs"));
                  }
                  // -end- 3CCC22FD0283 set_body35FB9EC803B9 "arcs"
                }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 35FB9EC803B9 detail_end "LineForm"

                // -end- 35FB9EC803B9 detail_end "LineForm"

              }

