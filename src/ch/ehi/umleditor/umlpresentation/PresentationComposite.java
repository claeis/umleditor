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


          // -beg- preserve=no 3C346EED0276 package "PresentationComposite"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3C346EED0276 package "PresentationComposite"

          // -beg- preserve=no 3C346EED0276 autoimport "PresentationComposite"
          import ch.ehi.uml1_4.foundation.core.PresentationElement;
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.basics.tools.AbstractVisitor;
          import ch.ehi.uml1_4.foundation.core.ModelElement;
          import ch.ehi.umleditor.umlpresentation.Diagram;
          import ch.ehi.umleditor.umlpresentation.PresentationEdge;
          import ch.ehi.basics.types.NlsString;
          // -end- 3C346EED0276 autoimport "PresentationComposite"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=yes 3C346EED0276 import "PresentationComposite"
import ch.ehi.uml1_4.foundation.core.*;
          // -end- 3C346EED0276 import "PresentationComposite"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:19 $
           */
public abstract class PresentationComposite extends AbstractEditorElement implements PresentationElement , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C346EED0276 detail_begin "PresentationComposite"

            // -end- 3C346EED0276 detail_begin "PresentationComposite"

            // -beg- preserve=no 3D4FA21702E2 head3C346EED0276 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21702E2 head3C346EED0276 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21702E2 throws3C346EED0276 "unlinkAll"

              // -end- 3D4FA21702E2 throws3C346EED0276 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21702E2 body3C346EED0276 "unlinkAll"
              
              clearChild();
              clearSubject();
              detachDiagram();
              // Role PresentationComposite: PresentationComposite object(s) may point to this
              clearPresentationEdge();
              setMetaAttrb(null);
              setDocumentation(null);
              super.unlinkAll();
              // -end- 3D4FA21702E2 body3C346EED0276 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA21702EB head3C346EED0276 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA21702EB head3C346EED0276 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21702EB throws3C346EED0276 "enumerateChildren"

              // -end- 3D4FA21702EB throws3C346EED0276 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21702EB body3C346EED0276 "enumerateChildren"
              java.util.Iterator it=null;
              it=iteratorChild();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getDocumentation());
              super.enumerateChildren(visitor);
              // -end- 3D4FA21702EB body3C346EED0276 "enumerateChildren"
              }

            // -beg- preserve=no 3C346F0402C0 code3C346EED0276 "child"
            private java.util.Set child = new java.util.HashSet();
            // -end- 3C346F0402C0 code3C346EED0276 "child"

            /** add a Child.
             *  
             *  @see #removeChild
             *  @see #containsChild
             *  @see #iteratorChild
             *  @see #clearChild
             *  @see #sizeChild
             */
            // -beg- preserve=no 3C346F0402C0 add_head3C346EED0276 "PresentationComposite::addChild"
            public void addChild(PresentationElement child1)
            // -end- 3C346F0402C0 add_head3C346EED0276 "PresentationComposite::addChild"
            {
              // -beg- preserve=no 3C346F0402C0 add_body3C346EED0276 "PresentationComposite::addChild"
              child.add(child1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addChild"));
              return;
              // -end- 3C346F0402C0 add_body3C346EED0276 "PresentationComposite::addChild"
            }

            /** disconnect a Child.
             *  @see #addChild
             */
            // -beg- preserve=no 3C346F0402C0 remove_head3C346EED0276 "PresentationComposite::removeChild"
            public PresentationElement removeChild(PresentationElement child1)
            // -end- 3C346F0402C0 remove_head3C346EED0276 "PresentationComposite::removeChild"
            {
              // -beg- preserve=no 3C346F0402C0 remove_body3C346EED0276 "PresentationComposite::removeChild"
              PresentationElement ret=null;
              if(child1==null || !child.contains(child1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = child1;
              child.remove(child1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeChild"));
              return ret;
              // -end- 3C346F0402C0 remove_body3C346EED0276 "PresentationComposite::removeChild"
            }

            /** tests if a given Child is connected.
             *  @see #addChild
             */
            // -beg- preserve=no 3C346F0402C0 test_head3C346EED0276 "PresentationComposite::containsChild"
            public boolean containsChild(PresentationElement child1)
            // -end- 3C346F0402C0 test_head3C346EED0276 "PresentationComposite::containsChild"
            {
              // -beg- preserve=no 3C346F0402C0 test_body3C346EED0276 "PresentationComposite::containsChild"
              return child.contains(child1);
              // -end- 3C346F0402C0 test_body3C346EED0276 "PresentationComposite::containsChild"
            }

            /** used to enumerate all connected Childs.
             *  @see #addChild
             */
            // -beg- preserve=no 3C346F0402C0 get_all_head3C346EED0276 "PresentationComposite::iteratorChild"
            public java.util.Iterator iteratorChild()
            // -end- 3C346F0402C0 get_all_head3C346EED0276 "PresentationComposite::iteratorChild"
            {
              // -beg- preserve=no 3C346F0402C0 get_all_body3C346EED0276 "PresentationComposite::iteratorChild"
              return child.iterator();
              // -end- 3C346F0402C0 get_all_body3C346EED0276 "PresentationComposite::iteratorChild"
            }

            /** disconnect all Childs.
             *  @see #addChild
             */
            // -beg- preserve=no 3C346F0402C0 remove_all_head3C346EED0276 "PresentationComposite::clearChild"
            public void clearChild()
            // -end- 3C346F0402C0 remove_all_head3C346EED0276 "PresentationComposite::clearChild"
            {
              // -beg- preserve=no 3C346F0402C0 remove_all_body3C346EED0276 "PresentationComposite::clearChild"
              if(sizeChild()>0){
                child.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearChild"));
              }
              // -end- 3C346F0402C0 remove_all_body3C346EED0276 "PresentationComposite::clearChild"
            }

            /** returns the number of Childs.
             *  @see #addChild
             */
            // -beg- preserve=no 3C346F0402C0 size_head3C346EED0276 "PresentationComposite::sizeChild"
            public int sizeChild()
            // -end- 3C346F0402C0 size_head3C346EED0276 "PresentationComposite::sizeChild"
            {
              // -beg- preserve=no 3C346F0402C0 size_body3C346EED0276 "PresentationComposite::sizeChild"
              return child.size();
              // -end- 3C346F0402C0 size_body3C346EED0276 "PresentationComposite::sizeChild"
            }

            // -beg- preserve=no 362409A803C0 code3C346EED0276 "subject"
            private java.util.Set subject = new java.util.HashSet();
            // -end- 362409A803C0 code3C346EED0276 "subject"

            /** add a Subject.
             *  
             *  @see #removeSubject
             *  @see #containsSubject
             *  @see #iteratorSubject
             *  @see #clearSubject
             *  @see #sizeSubject
             */
            // -beg- preserve=no 362409A803C0 add_head3C346EED0276 "PresentationElement::addSubject"
            public void addSubject(ModelElement subject1)
            // -end- 362409A803C0 add_head3C346EED0276 "PresentationElement::addSubject"
            {
              // -beg- preserve=no 362409A803C0 add_body3C346EED0276 "PresentationElement::addSubject"
              subject.add(subject1);
              subject1._linkPresentation(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSubject"));
              return;
              // -end- 362409A803C0 add_body3C346EED0276 "PresentationElement::addSubject"
            }

            /** disconnect a Subject.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 remove_head3C346EED0276 "PresentationElement::removeSubject"
            public ModelElement removeSubject(ModelElement subject1)
            // -end- 362409A803C0 remove_head3C346EED0276 "PresentationElement::removeSubject"
            {
              // -beg- preserve=no 362409A803C0 remove_body3C346EED0276 "PresentationElement::removeSubject"
              ModelElement ret=null;
              if(subject1==null || !subject.contains(subject1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = subject1;
              subject.remove(subject1);
              subject1._unlinkPresentation(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSubject"));
              return ret;
              // -end- 362409A803C0 remove_body3C346EED0276 "PresentationElement::removeSubject"
            }

            /** tests if a given Subject is connected.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 test_head3C346EED0276 "PresentationElement::containsSubject"
            public boolean containsSubject(ModelElement subject1)
            // -end- 362409A803C0 test_head3C346EED0276 "PresentationElement::containsSubject"
            {
              // -beg- preserve=no 362409A803C0 test_body3C346EED0276 "PresentationElement::containsSubject"
              return subject.contains(subject1);
              // -end- 362409A803C0 test_body3C346EED0276 "PresentationElement::containsSubject"
            }

            /** used to enumerate all connected Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 get_all_head3C346EED0276 "PresentationElement::iteratorSubject"
            public java.util.Iterator iteratorSubject()
            // -end- 362409A803C0 get_all_head3C346EED0276 "PresentationElement::iteratorSubject"
            {
              // -beg- preserve=no 362409A803C0 get_all_body3C346EED0276 "PresentationElement::iteratorSubject"
              return subject.iterator();
              // -end- 362409A803C0 get_all_body3C346EED0276 "PresentationElement::iteratorSubject"
            }

            /** disconnect all Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 remove_all_head3C346EED0276 "PresentationElement::clearSubject"
            public void clearSubject()
            // -end- 362409A803C0 remove_all_head3C346EED0276 "PresentationElement::clearSubject"
            {
              // -beg- preserve=no 362409A803C0 remove_all_body3C346EED0276 "PresentationElement::clearSubject"
              if(sizeSubject()>0){
                for(java.util.Iterator p = subject.iterator(); p.hasNext();){
                  ((ModelElement)p.next())._unlinkPresentation(this);
                }
                subject.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSubject"));
              }
              // -end- 362409A803C0 remove_all_body3C346EED0276 "PresentationElement::clearSubject"
            }

            /** returns the number of Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 size_head3C346EED0276 "PresentationElement::sizeSubject"
            public int sizeSubject()
            // -end- 362409A803C0 size_head3C346EED0276 "PresentationElement::sizeSubject"
            {
              // -beg- preserve=no 362409A803C0 size_body3C346EED0276 "PresentationElement::sizeSubject"
              return subject.size();
              // -end- 362409A803C0 size_body3C346EED0276 "PresentationElement::sizeSubject"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A803C0 _link_body3C346EED0276 "PresentationElement::_linkSubject"
            public void _linkSubject(ModelElement subject1)
            {
              subject.add(subject1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSubject"));
              return;
            }
            // -end- 362409A803C0 _link_body3C346EED0276 "PresentationElement::_linkSubject"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A803C0 _unlink_body3C346EED0276 "PresentationElement::_unlinkSubject"
            public void _unlinkSubject(ModelElement subject1)
            {
              subject.remove(subject1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSubject"));
              return;
            }
            // -end- 362409A803C0 _unlink_body3C346EED0276 "PresentationElement::_unlinkSubject"

            // -beg- preserve=no 3C2C4C9F0169 code3C346EED0276 "diagram"
            private Diagram diagram;
            // -end- 3C2C4C9F0169 code3C346EED0276 "diagram"

            /** attaches a Diagram.
             *  
             *  @see #detachDiagram
             *  @see #getDiagram
             *  @see #containsDiagram
             */
            // -beg- preserve=no 3C2C4C9F0169 attach_head3C346EED0276 "PresentationElement::attachDiagram"
            public void attachDiagram(Diagram diagram1)
            // -end- 3C2C4C9F0169 attach_head3C346EED0276 "PresentationElement::attachDiagram"
            {
              // -beg- preserve=no 3C2C4C9F0169 attach_body3C346EED0276 "PresentationElement::attachDiagram"
              if(diagram!=null) {throw new java.lang.IllegalStateException("already a diagram attached");}
              if(diagram1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as diagram");}
              diagram = diagram1;
              diagram1._linkPresentationElement(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDiagram"));
              return;
              // -end- 3C2C4C9F0169 attach_body3C346EED0276 "PresentationElement::attachDiagram"
            }

            /** disconnect the currently attached Diagram.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C2C4C9F0169 detach_head3C346EED0276 "PresentationElement::detachDiagram"
            public Diagram detachDiagram()
            // -end- 3C2C4C9F0169 detach_head3C346EED0276 "PresentationElement::detachDiagram"
            {
              // -beg- preserve=no 3C2C4C9F0169 detach_body3C346EED0276 "PresentationElement::detachDiagram"
              Diagram ret = null;
              if(diagram!=null){
                diagram._unlinkPresentationElement(this);
                ret = diagram;
                diagram = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDiagram"));
              return ret;
              // -end- 3C2C4C9F0169 detach_body3C346EED0276 "PresentationElement::detachDiagram"
            }

            /** get the currently attached Diagram.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C2C4C9F0169 get_head3C346EED0276 "PresentationElement::getDiagram"
            public Diagram getDiagram()
            // -end- 3C2C4C9F0169 get_head3C346EED0276 "PresentationElement::getDiagram"
            {
              // -beg- preserve=no 3C2C4C9F0169 get_body3C346EED0276 "PresentationElement::getDiagram"
              if(diagram==null) {throw new java.lang.IllegalStateException("no diagram attached");}
              return diagram;
              // -end- 3C2C4C9F0169 get_body3C346EED0276 "PresentationElement::getDiagram"
            }

            /** tests if there is a Diagram attached.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C2C4C9F0169 test_head3C346EED0276 "PresentationElement::containsDiagram"
            public boolean containsDiagram()
            // -end- 3C2C4C9F0169 test_head3C346EED0276 "PresentationElement::containsDiagram"
            {
              // -beg- preserve=no 3C2C4C9F0169 test_body3C346EED0276 "PresentationElement::containsDiagram"
              return diagram!=null;
              // -end- 3C2C4C9F0169 test_body3C346EED0276 "PresentationElement::containsDiagram"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C4C9F0169 _link_body3C346EED0276 "PresentationElement::_linkDiagram"
            public void _linkDiagram(Diagram diagram1)
            {
              diagram = diagram1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDiagram"));
              return;
            }
            // -end- 3C2C4C9F0169 _link_body3C346EED0276 "PresentationElement::_linkDiagram"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C4C9F0169 _unlink_body3C346EED0276 "PresentationElement::_unlinkDiagram"
            public void _unlinkDiagram(Diagram diagram1)
            {
              diagram = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDiagram"));
              return;
            }
            // -end- 3C2C4C9F0169 _unlink_body3C346EED0276 "PresentationElement::_unlinkDiagram"

            // -beg- preserve=no 3C2C49E3019E code3C346EED0276 "presentationEdge"
            private java.util.Set presentationEdge = new java.util.HashSet();
            // -end- 3C2C49E3019E code3C346EED0276 "presentationEdge"

            /** add a PresentationEdge.
             *  
             *  @see #removePresentationEdge
             *  @see #containsPresentationEdge
             *  @see #iteratorPresentationEdge
             *  @see #clearPresentationEdge
             *  @see #sizePresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E add_head3C346EED0276 "PresentationElement::addPresentationEdge"
            public void addPresentationEdge(PresentationEdge presentationEdge1)
            // -end- 3C2C49E3019E add_head3C346EED0276 "PresentationElement::addPresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E add_body3C346EED0276 "PresentationElement::addPresentationEdge"
              presentationEdge.add(presentationEdge1);
              presentationEdge1._linkEndpoint(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPresentationEdge"));
              return;
              // -end- 3C2C49E3019E add_body3C346EED0276 "PresentationElement::addPresentationEdge"
            }

            /** disconnect a PresentationEdge.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E remove_head3C346EED0276 "PresentationElement::removePresentationEdge"
            public PresentationEdge removePresentationEdge(PresentationEdge presentationEdge1)
            // -end- 3C2C49E3019E remove_head3C346EED0276 "PresentationElement::removePresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E remove_body3C346EED0276 "PresentationElement::removePresentationEdge"
              PresentationEdge ret=null;
              if(presentationEdge1==null || !presentationEdge.contains(presentationEdge1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = presentationEdge1;
              presentationEdge.remove(presentationEdge1);
              presentationEdge1._unlinkEndpoint(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePresentationEdge"));
              return ret;
              // -end- 3C2C49E3019E remove_body3C346EED0276 "PresentationElement::removePresentationEdge"
            }

            /** tests if a given PresentationEdge is connected.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E test_head3C346EED0276 "PresentationElement::containsPresentationEdge"
            public boolean containsPresentationEdge(PresentationEdge presentationEdge1)
            // -end- 3C2C49E3019E test_head3C346EED0276 "PresentationElement::containsPresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E test_body3C346EED0276 "PresentationElement::containsPresentationEdge"
              return presentationEdge.contains(presentationEdge1);
              // -end- 3C2C49E3019E test_body3C346EED0276 "PresentationElement::containsPresentationEdge"
            }

            /** used to enumerate all connected PresentationEdges.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E get_all_head3C346EED0276 "PresentationElement::iteratorPresentationEdge"
            public java.util.Iterator iteratorPresentationEdge()
            // -end- 3C2C49E3019E get_all_head3C346EED0276 "PresentationElement::iteratorPresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E get_all_body3C346EED0276 "PresentationElement::iteratorPresentationEdge"
              return presentationEdge.iterator();
              // -end- 3C2C49E3019E get_all_body3C346EED0276 "PresentationElement::iteratorPresentationEdge"
            }

            /** disconnect all PresentationEdges.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E remove_all_head3C346EED0276 "PresentationElement::clearPresentationEdge"
            public void clearPresentationEdge()
            // -end- 3C2C49E3019E remove_all_head3C346EED0276 "PresentationElement::clearPresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E remove_all_body3C346EED0276 "PresentationElement::clearPresentationEdge"
              if(sizePresentationEdge()>0){
                for(java.util.Iterator p = presentationEdge.iterator(); p.hasNext();){
                  ((PresentationEdge)p.next())._unlinkEndpoint(this);
                }
                presentationEdge.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPresentationEdge"));
              }
              // -end- 3C2C49E3019E remove_all_body3C346EED0276 "PresentationElement::clearPresentationEdge"
            }

            /** returns the number of PresentationEdges.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E size_head3C346EED0276 "PresentationElement::sizePresentationEdge"
            public int sizePresentationEdge()
            // -end- 3C2C49E3019E size_head3C346EED0276 "PresentationElement::sizePresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E size_body3C346EED0276 "PresentationElement::sizePresentationEdge"
              return presentationEdge.size();
              // -end- 3C2C49E3019E size_body3C346EED0276 "PresentationElement::sizePresentationEdge"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C49E3019E _link_body3C346EED0276 "PresentationElement::_linkPresentationEdge"
            public void _linkPresentationEdge(PresentationEdge presentationEdge1)
            {
              presentationEdge.add(presentationEdge1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPresentationEdge"));
              return;
            }
            // -end- 3C2C49E3019E _link_body3C346EED0276 "PresentationElement::_linkPresentationEdge"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C49E3019E _unlink_body3C346EED0276 "PresentationElement::_unlinkPresentationEdge"
            public void _unlinkPresentationEdge(PresentationEdge presentationEdge1)
            {
              presentationEdge.remove(presentationEdge1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPresentationEdge"));
              return;
            }
            // -end- 3C2C49E3019E _unlink_body3C346EED0276 "PresentationElement::_unlinkPresentationEdge"

            // -beg- preserve=no 3C1DF92B0234 var3C346EED0276 "documentation"
            private NlsString documentation = null;
            // -end- 3C1DF92B0234 var3C346EED0276 "documentation"

            /** get current value of documentation
             *  @see #setDocumentation
             */
            // -beg- preserve=no 3C1DF92B0234 get_head3C346EED0276 "documentation"
            public  NlsString getDocumentation()
            // -end- 3C1DF92B0234 get_head3C346EED0276 "documentation"
            {
              // -beg- preserve=no 3C1DF92B0234 get_body3C346EED0276 "documentation"
              return documentation;
              // -end- 3C1DF92B0234 get_body3C346EED0276 "documentation"
            }

            /** set current value of documentation
             *  @see #getDocumentation
             */
            // -beg- preserve=no 3C1DF92B0234 set_head3C346EED0276 "documentation"
            public  void setDocumentation(NlsString value1)
            // -end- 3C1DF92B0234 set_head3C346EED0276 "documentation"
            {
              // -beg- preserve=no 3C1DF92B0234 set_body3C346EED0276 "documentation"
              if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
                documentation = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
              }
              // -end- 3C1DF92B0234 set_body3C346EED0276 "documentation"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C346EED0276 detail_end "PresentationComposite"

            // -end- 3C346EED0276 detail_end "PresentationComposite"
            
            private NlsString metaAttrb = null;
            public NlsString getMetaAttrb(){
            	return metaAttrb;
            }
            public void setMetaAttrb(NlsString value){
            	if(metaAttrb!=value && (metaAttrb==null || !metaAttrb.equals(value))){
            		metaAttrb = value;
                    ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setMetaAttrb"));
                  }
            }

          }

