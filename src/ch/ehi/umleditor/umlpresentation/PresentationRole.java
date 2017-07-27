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


          // -beg- preserve=no 3D4652270282 package "PresentationRole"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3D4652270282 package "PresentationRole"

          // -beg- preserve=no 3D4652270282 autoimport "PresentationRole"
          import ch.ehi.umleditor.umlpresentation.PresentationEdge;
          import ch.ehi.umleditor.umlpresentation.Association;
          import ch.ehi.uml1_4.foundation.core.ModelElement;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3D4652270282 autoimport "PresentationRole"
import ch.ehi.basics.types.NlsString;

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3D4652270282 import "PresentationRole"

          // -end- 3D4652270282 import "PresentationRole"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:27 $
           */
public class PresentationRole extends PresentationEdge
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D4652270282 detail_begin "PresentationRole"

            // -end- 3D4652270282 detail_begin "PresentationRole"

            // -beg- preserve=no 3D4FA2170327 head3D4652270282 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2170327 head3D4652270282 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170327 throws3D4652270282 "unlinkAll"

              // -end- 3D4FA2170327 throws3D4652270282 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170327 body3D4652270282 "unlinkAll"
              
              detachAssociation();
              clearSubject();
              super.unlinkAll();
              // -end- 3D4FA2170327 body3D4652270282 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2170331 head3D4652270282 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2170331 head3D4652270282 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170331 throws3D4652270282 "enumerateChildren"

              // -end- 3D4FA2170331 throws3D4652270282 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170331 body3D4652270282 "enumerateChildren"
              java.util.Iterator it=null;
              super.enumerateChildren(visitor);
              // -end- 3D4FA2170331 body3D4652270282 "enumerateChildren"
              }

            // -beg- preserve=no 3D46531B03C3 code3D4652270282 "association"
            private Association association;
            // -end- 3D46531B03C3 code3D4652270282 "association"

            /** attaches a Association.
             *  
             *  @see #detachAssociation
             *  @see #getAssociation
             *  @see #containsAssociation
             */
            // -beg- preserve=no 3D46531B03C3 attach_head3D4652270282 "PresentationRole::attachAssociation"
            public void attachAssociation(Association association1)
            // -end- 3D46531B03C3 attach_head3D4652270282 "PresentationRole::attachAssociation"
            {
              // -beg- preserve=no 3D46531B03C3 attach_body3D4652270282 "PresentationRole::attachAssociation"
              if(association!=null) {throw new java.lang.IllegalStateException("already a association attached");}
              if(association1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as association");}
              association = association1;
              association1._linkRolePresentation(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAssociation"));
              return;
              // -end- 3D46531B03C3 attach_body3D4652270282 "PresentationRole::attachAssociation"
            }

            /** disconnect the currently attached Association.
             *  @see #attachAssociation
             */
            // -beg- preserve=no 3D46531B03C3 detach_head3D4652270282 "PresentationRole::detachAssociation"
            public Association detachAssociation()
            // -end- 3D46531B03C3 detach_head3D4652270282 "PresentationRole::detachAssociation"
            {
              // -beg- preserve=no 3D46531B03C3 detach_body3D4652270282 "PresentationRole::detachAssociation"
              Association ret = null;
              if(association!=null){
                association._unlinkRolePresentation(this);
                ret = association;
                association = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAssociation"));
              return ret;
              // -end- 3D46531B03C3 detach_body3D4652270282 "PresentationRole::detachAssociation"
            }

            /** get the currently attached Association.
             *  @see #attachAssociation
             */
            // -beg- preserve=no 3D46531B03C3 get_head3D4652270282 "PresentationRole::getAssociation"
            public Association getAssociation()
            // -end- 3D46531B03C3 get_head3D4652270282 "PresentationRole::getAssociation"
            {
              // -beg- preserve=no 3D46531B03C3 get_body3D4652270282 "PresentationRole::getAssociation"
              if(association==null) {throw new java.lang.IllegalStateException("no association attached");}
              return association;
              // -end- 3D46531B03C3 get_body3D4652270282 "PresentationRole::getAssociation"
            }

            /** tests if there is a Association attached.
             *  @see #attachAssociation
             */
            // -beg- preserve=no 3D46531B03C3 test_head3D4652270282 "PresentationRole::containsAssociation"
            public boolean containsAssociation()
            // -end- 3D46531B03C3 test_head3D4652270282 "PresentationRole::containsAssociation"
            {
              // -beg- preserve=no 3D46531B03C3 test_body3D4652270282 "PresentationRole::containsAssociation"
              return association!=null;
              // -end- 3D46531B03C3 test_body3D4652270282 "PresentationRole::containsAssociation"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3D46531B03C3 _link_body3D4652270282 "PresentationRole::_linkAssociation"
            public void _linkAssociation(Association association1)
            {
              association = association1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAssociation"));
              return;
            }
            // -end- 3D46531B03C3 _link_body3D4652270282 "PresentationRole::_linkAssociation"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3D46531B03C3 _unlink_body3D4652270282 "PresentationRole::_unlinkAssociation"
            public void _unlinkAssociation(Association association1)
            {
              association = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAssociation"));
              return;
            }
            // -end- 3D46531B03C3 _unlink_body3D4652270282 "PresentationRole::_unlinkAssociation"

            // -beg- preserve=no 362409A803C0 code3D4652270282 "subject"

            // -end- 362409A803C0 code3D4652270282 "subject"

            /** add a Subject.
             *  
             *  @see #removeSubject
             *  @see #containsSubject
             *  @see #iteratorSubject
             *  @see #clearSubject
             *  @see #sizeSubject
             */
            // -beg- preserve=no 362409A803C0 add_head3D4652270282 "PresentationElement::addSubject"
            public void addSubject(ModelElement subject1)
            // -end- 362409A803C0 add_head3D4652270282 "PresentationElement::addSubject"
            {
              // -beg- preserve=no 362409A803C0 add_body3D4652270282 "PresentationElement::addSubject"
              super.addSubject(subject1);
              // -end- 362409A803C0 add_body3D4652270282 "PresentationElement::addSubject"
            }

            /** disconnect a Subject.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 remove_head3D4652270282 "PresentationElement::removeSubject"
            public ModelElement removeSubject(ModelElement subject1)
            // -end- 362409A803C0 remove_head3D4652270282 "PresentationElement::removeSubject"
            {
              // -beg- preserve=no 362409A803C0 remove_body3D4652270282 "PresentationElement::removeSubject"
              return super.removeSubject(subject1);
              // -end- 362409A803C0 remove_body3D4652270282 "PresentationElement::removeSubject"
            }

            /** tests if a given Subject is connected.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 test_head3D4652270282 "PresentationElement::containsSubject"
            public boolean containsSubject(ModelElement subject1)
            // -end- 362409A803C0 test_head3D4652270282 "PresentationElement::containsSubject"
            {
              // -beg- preserve=no 362409A803C0 test_body3D4652270282 "PresentationElement::containsSubject"
              return super.containsSubject(subject1);
              // -end- 362409A803C0 test_body3D4652270282 "PresentationElement::containsSubject"
            }

            /** used to enumerate all connected Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 get_all_head3D4652270282 "PresentationElement::iteratorSubject"
            public java.util.Iterator iteratorSubject()
            // -end- 362409A803C0 get_all_head3D4652270282 "PresentationElement::iteratorSubject"
            {
              // -beg- preserve=no 362409A803C0 get_all_body3D4652270282 "PresentationElement::iteratorSubject"
              return super.iteratorSubject();
              // -end- 362409A803C0 get_all_body3D4652270282 "PresentationElement::iteratorSubject"
            }

            /** disconnect all Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 remove_all_head3D4652270282 "PresentationElement::clearSubject"
            public void clearSubject()
            // -end- 362409A803C0 remove_all_head3D4652270282 "PresentationElement::clearSubject"
            {
              // -beg- preserve=no 362409A803C0 remove_all_body3D4652270282 "PresentationElement::clearSubject"
              super.clearSubject();
              // -end- 362409A803C0 remove_all_body3D4652270282 "PresentationElement::clearSubject"
            }

            /** returns the number of Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 size_head3D4652270282 "PresentationElement::sizeSubject"
            public int sizeSubject()
            // -end- 362409A803C0 size_head3D4652270282 "PresentationElement::sizeSubject"
            {
              // -beg- preserve=no 362409A803C0 size_body3D4652270282 "PresentationElement::sizeSubject"
              return super.sizeSubject();
              // -end- 362409A803C0 size_body3D4652270282 "PresentationElement::sizeSubject"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A803C0 _link_body3D4652270282 "PresentationElement::_linkSubject"
            public void _linkSubject(ModelElement subject1)
            {
              super._linkSubject(subject1);
            }
            // -end- 362409A803C0 _link_body3D4652270282 "PresentationElement::_linkSubject"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A803C0 _unlink_body3D4652270282 "PresentationElement::_unlinkSubject"
            public void _unlinkSubject(ModelElement subject1)
            {
              super._unlinkSubject(subject1);
            }
            // -end- 362409A803C0 _unlink_body3D4652270282 "PresentationElement::_unlinkSubject"

            // -beg- preserve=no 3D4654050289 var3D4652270282 "nameAngle"
            private double nameAngle;
            // -end- 3D4654050289 var3D4652270282 "nameAngle"

            /** get current value of nameAngle
             *  @see #setNameAngle
             */
            // -beg- preserve=no 3D4654050289 get_head3D4652270282 "nameAngle"
            public  double getNameAngle()
            // -end- 3D4654050289 get_head3D4652270282 "nameAngle"
            {
              // -beg- preserve=no 3D4654050289 get_body3D4652270282 "nameAngle"
              return nameAngle;
              // -end- 3D4654050289 get_body3D4652270282 "nameAngle"
            }

            /** set current value of nameAngle
             *  @see #getNameAngle
             */
            // -beg- preserve=no 3D4654050289 set_head3D4652270282 "nameAngle"
            public  void setNameAngle(double value1)
            // -end- 3D4654050289 set_head3D4652270282 "nameAngle"
            {
              // -beg- preserve=no 3D4654050289 set_body3D4652270282 "nameAngle"
              if(nameAngle != value1){
                nameAngle = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setNameAngle"));
              }
              // -end- 3D4654050289 set_body3D4652270282 "nameAngle"
            }

            // -beg- preserve=no 3D46546A0090 var3D4652270282 "nameRadius"
            private double nameRadius;
            // -end- 3D46546A0090 var3D4652270282 "nameRadius"

            /** get current value of nameRadius
             *  @see #setNameRadius
             */
            // -beg- preserve=no 3D46546A0090 get_head3D4652270282 "nameRadius"
            public  double getNameRadius()
            // -end- 3D46546A0090 get_head3D4652270282 "nameRadius"
            {
              // -beg- preserve=no 3D46546A0090 get_body3D4652270282 "nameRadius"
              return nameRadius;
              // -end- 3D46546A0090 get_body3D4652270282 "nameRadius"
            }

            /** set current value of nameRadius
             *  @see #getNameRadius
             */
            // -beg- preserve=no 3D46546A0090 set_head3D4652270282 "nameRadius"
            public  void setNameRadius(double value1)
            // -end- 3D46546A0090 set_head3D4652270282 "nameRadius"
            {
              // -beg- preserve=no 3D46546A0090 set_body3D4652270282 "nameRadius"
              if(nameRadius != value1){
                nameRadius = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setNameRadius"));
              }
              // -end- 3D46546A0090 set_body3D4652270282 "nameRadius"
            }

            // -beg- preserve=no 3D46547B0379 var3D4652270282 "multiplicityAngle"
            private double multiplicityAngle;
            // -end- 3D46547B0379 var3D4652270282 "multiplicityAngle"

            /** get current value of multiplicityAngle
             *  @see #setMultiplicityAngle
             */
            // -beg- preserve=no 3D46547B0379 get_head3D4652270282 "multiplicityAngle"
            public  double getMultiplicityAngle()
            // -end- 3D46547B0379 get_head3D4652270282 "multiplicityAngle"
            {
              // -beg- preserve=no 3D46547B0379 get_body3D4652270282 "multiplicityAngle"
              return multiplicityAngle;
              // -end- 3D46547B0379 get_body3D4652270282 "multiplicityAngle"
            }

            /** set current value of multiplicityAngle
             *  @see #getMultiplicityAngle
             */
            // -beg- preserve=no 3D46547B0379 set_head3D4652270282 "multiplicityAngle"
            public  void setMultiplicityAngle(double value1)
            // -end- 3D46547B0379 set_head3D4652270282 "multiplicityAngle"
            {
              // -beg- preserve=no 3D46547B0379 set_body3D4652270282 "multiplicityAngle"
              if(multiplicityAngle != value1){
                multiplicityAngle = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMultiplicityAngle"));
              }
              // -end- 3D46547B0379 set_body3D4652270282 "multiplicityAngle"
            }

            // -beg- preserve=no 3D465488030A var3D4652270282 "multiplicityRadius"
            private double multiplicityRadius;
            // -end- 3D465488030A var3D4652270282 "multiplicityRadius"

            /** get current value of multiplicityRadius
             *  @see #setMultiplicityRadius
             */
            // -beg- preserve=no 3D465488030A get_head3D4652270282 "multiplicityRadius"
            public  double getMultiplicityRadius()
            // -end- 3D465488030A get_head3D4652270282 "multiplicityRadius"
            {
              // -beg- preserve=no 3D465488030A get_body3D4652270282 "multiplicityRadius"
              return multiplicityRadius;
              // -end- 3D465488030A get_body3D4652270282 "multiplicityRadius"
            }

            /** set current value of multiplicityRadius
             *  @see #getMultiplicityRadius
             */
            // -beg- preserve=no 3D465488030A set_head3D4652270282 "multiplicityRadius"
            public  void setMultiplicityRadius(double value1)
            // -end- 3D465488030A set_head3D4652270282 "multiplicityRadius"
            {
              // -beg- preserve=no 3D465488030A set_body3D4652270282 "multiplicityRadius"
              if(multiplicityRadius != value1){
                multiplicityRadius = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMultiplicityRadius"));
              }
              // -end- 3D465488030A set_body3D4652270282 "multiplicityRadius"
            }

            // -beg- preserve=no 3D61FD3303D3 var3D4652270282 "nameVisible"
            private boolean nameVisible = true;
            // -end- 3D61FD3303D3 var3D4652270282 "nameVisible"

            /** get current value of nameVisible
             *  @see #setNameVisible
             */
            // -beg- preserve=no 3D61FD3303D3 get_head3D4652270282 "nameVisible"
            public  boolean isNameVisible()
            // -end- 3D61FD3303D3 get_head3D4652270282 "nameVisible"
            {
              // -beg- preserve=no 3D61FD3303D3 get_body3D4652270282 "nameVisible"
              return nameVisible;
              // -end- 3D61FD3303D3 get_body3D4652270282 "nameVisible"
            }

            /** set current value of nameVisible
             *  @see #isNameVisible
             */
            // -beg- preserve=no 3D61FD3303D3 set_head3D4652270282 "nameVisible"
            public  void setNameVisible(boolean value1)
            // -end- 3D61FD3303D3 set_head3D4652270282 "nameVisible"
            {
              // -beg- preserve=no 3D61FD3303D3 set_body3D4652270282 "nameVisible"
              if(nameVisible != value1){
                nameVisible = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setNameVisible"));
              }
              // -end- 3D61FD3303D3 set_body3D4652270282 "nameVisible"
            }

            // -beg- preserve=no 3D61FD7C01B1 var3D4652270282 "multiplicityVisible"
            private boolean multiplicityVisible = true;
            // -end- 3D61FD7C01B1 var3D4652270282 "multiplicityVisible"

            /** get current value of multiplicityVisible
             *  @see #setMultiplicityVisible
             */
            // -beg- preserve=no 3D61FD7C01B1 get_head3D4652270282 "multiplicityVisible"
            public  boolean isMultiplicityVisible()
            // -end- 3D61FD7C01B1 get_head3D4652270282 "multiplicityVisible"
            {
              // -beg- preserve=no 3D61FD7C01B1 get_body3D4652270282 "multiplicityVisible"
              return multiplicityVisible;
              // -end- 3D61FD7C01B1 get_body3D4652270282 "multiplicityVisible"
            }

            /** set current value of multiplicityVisible
             *  @see #isMultiplicityVisible
             */
            // -beg- preserve=no 3D61FD7C01B1 set_head3D4652270282 "multiplicityVisible"
            public  void setMultiplicityVisible(boolean value1)
            // -end- 3D61FD7C01B1 set_head3D4652270282 "multiplicityVisible"
            {
              // -beg- preserve=no 3D61FD7C01B1 set_body3D4652270282 "multiplicityVisible"
              if(multiplicityVisible != value1){
                multiplicityVisible = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMultiplicityVisible"));
              }
              // -end- 3D61FD7C01B1 set_body3D4652270282 "multiplicityVisible"
            }

			
			public NlsString getMetaAttrb() {
				return super.getMetaAttrb();
			}

			public void setMetaAttrb(NlsString value) {
				super.setMetaAttrb(value);	
			}

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D4652270282 detail_end "PresentationRole"

            // -end- 3D4652270282 detail_end "PresentationRole"

          }

