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


          // -beg- preserve=no 3C2C4C8D0362 package "Diagram"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3C2C4C8D0362 package "Diagram"

          // -beg- preserve=no 3C2C4C8D0362 autoimport "Diagram"
          import ch.ehi.uml1_4.foundation.core.Element;
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.uml1_4.foundation.core.PresentationElement;
          import ch.ehi.uml1_4.foundation.core.Namespace;
          import ch.ehi.umleditor.umlpresentation.AbstractFigure;
          import ch.ehi.basics.types.NlsString;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3C2C4C8D0362 autoimport "Diagram"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3C2C4C8D0362 import "Diagram"

          // -end- 3C2C4C8D0362 import "Diagram"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:12 $
           */
public class Diagram extends AbstractEditorElement implements Element , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C2C4C8D0362 detail_begin "Diagram"

            // -end- 3C2C4C8D0362 detail_begin "Diagram"

            // -beg- preserve=no 3D4FA21700F7 head3C2C4C8D0362 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA21700F7 head3C2C4C8D0362 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21700F7 throws3C2C4C8D0362 "unlinkAll"

              // -end- 3D4FA21700F7 throws3C2C4C8D0362 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA21700F7 body3C2C4C8D0362 "unlinkAll"
              
              clearPresentationElement();
              detachNamespace();
              clearPureVisual();
              // Role ClassDiagramView: ClassDiagramView object(s) may point to this
              setName(null);
              setDocumentation(null);
              super.unlinkAll();
              // -end- 3D4FA21700F7 body3C2C4C8D0362 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA217010B head3C2C4C8D0362 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA217010B head3C2C4C8D0362 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA217010B throws3C2C4C8D0362 "enumerateChildren"

              // -end- 3D4FA217010B throws3C2C4C8D0362 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA217010B body3C2C4C8D0362 "enumerateChildren"
              java.util.Iterator it=null;
              it=iteratorPresentationElement();while(it.hasNext())visitor.visit(it.next());
              it=iteratorPureVisual();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getName());
              visitor.visit(getDocumentation());
              super.enumerateChildren(visitor);
              // -end- 3D4FA217010B body3C2C4C8D0362 "enumerateChildren"
              }

            // -beg- preserve=no 3C2C4C9F017D code3C2C4C8D0362 "presentationElement"
            private java.util.Set presentationElement = new java.util.HashSet();
            // -end- 3C2C4C9F017D code3C2C4C8D0362 "presentationElement"

            /** add a PresentationElement.
             *  
             *  @see #removePresentationElement
             *  @see #containsPresentationElement
             *  @see #iteratorPresentationElement
             *  @see #clearPresentationElement
             *  @see #sizePresentationElement
             */
            // -beg- preserve=no 3C2C4C9F017D add_head3C2C4C8D0362 "Diagram::addPresentationElement"
            public void addPresentationElement(PresentationElement presentationElement1)
            // -end- 3C2C4C9F017D add_head3C2C4C8D0362 "Diagram::addPresentationElement"
            {
              // -beg- preserve=no 3C2C4C9F017D add_body3C2C4C8D0362 "Diagram::addPresentationElement"
              presentationElement.add(presentationElement1);
              presentationElement1._linkDiagram(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPresentationElement"));
              return;
              // -end- 3C2C4C9F017D add_body3C2C4C8D0362 "Diagram::addPresentationElement"
            }

            /** disconnect a PresentationElement.
             *  @see #addPresentationElement
             */
            // -beg- preserve=no 3C2C4C9F017D remove_head3C2C4C8D0362 "Diagram::removePresentationElement"
            public PresentationElement removePresentationElement(PresentationElement presentationElement1)
            // -end- 3C2C4C9F017D remove_head3C2C4C8D0362 "Diagram::removePresentationElement"
            {
              // -beg- preserve=no 3C2C4C9F017D remove_body3C2C4C8D0362 "Diagram::removePresentationElement"
              PresentationElement ret=null;
              if(presentationElement1==null || !presentationElement.contains(presentationElement1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = presentationElement1;
              presentationElement.remove(presentationElement1);
              presentationElement1._unlinkDiagram(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePresentationElement"));
              return ret;
              // -end- 3C2C4C9F017D remove_body3C2C4C8D0362 "Diagram::removePresentationElement"
            }

            /** tests if a given PresentationElement is connected.
             *  @see #addPresentationElement
             */
            // -beg- preserve=no 3C2C4C9F017D test_head3C2C4C8D0362 "Diagram::containsPresentationElement"
            public boolean containsPresentationElement(PresentationElement presentationElement1)
            // -end- 3C2C4C9F017D test_head3C2C4C8D0362 "Diagram::containsPresentationElement"
            {
              // -beg- preserve=no 3C2C4C9F017D test_body3C2C4C8D0362 "Diagram::containsPresentationElement"
              return presentationElement.contains(presentationElement1);
              // -end- 3C2C4C9F017D test_body3C2C4C8D0362 "Diagram::containsPresentationElement"
            }

            /** used to enumerate all connected PresentationElements.
             *  @see #addPresentationElement
             */
            // -beg- preserve=no 3C2C4C9F017D get_all_head3C2C4C8D0362 "Diagram::iteratorPresentationElement"
            public java.util.Iterator iteratorPresentationElement()
            // -end- 3C2C4C9F017D get_all_head3C2C4C8D0362 "Diagram::iteratorPresentationElement"
            {
              // -beg- preserve=no 3C2C4C9F017D get_all_body3C2C4C8D0362 "Diagram::iteratorPresentationElement"
              return presentationElement.iterator();
              // -end- 3C2C4C9F017D get_all_body3C2C4C8D0362 "Diagram::iteratorPresentationElement"
            }

            /** disconnect all PresentationElements.
             *  @see #addPresentationElement
             */
            // -beg- preserve=no 3C2C4C9F017D remove_all_head3C2C4C8D0362 "Diagram::clearPresentationElement"
            public void clearPresentationElement()
            // -end- 3C2C4C9F017D remove_all_head3C2C4C8D0362 "Diagram::clearPresentationElement"
            {
              // -beg- preserve=no 3C2C4C9F017D remove_all_body3C2C4C8D0362 "Diagram::clearPresentationElement"
              if(sizePresentationElement()>0){
                for(java.util.Iterator p = presentationElement.iterator(); p.hasNext();){
                  ((PresentationElement)p.next())._unlinkDiagram(this);
                }
                presentationElement.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPresentationElement"));
              }
              // -end- 3C2C4C9F017D remove_all_body3C2C4C8D0362 "Diagram::clearPresentationElement"
            }

            /** returns the number of PresentationElements.
             *  @see #addPresentationElement
             */
            // -beg- preserve=no 3C2C4C9F017D size_head3C2C4C8D0362 "Diagram::sizePresentationElement"
            public int sizePresentationElement()
            // -end- 3C2C4C9F017D size_head3C2C4C8D0362 "Diagram::sizePresentationElement"
            {
              // -beg- preserve=no 3C2C4C9F017D size_body3C2C4C8D0362 "Diagram::sizePresentationElement"
              return presentationElement.size();
              // -end- 3C2C4C9F017D size_body3C2C4C8D0362 "Diagram::sizePresentationElement"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C4C9F017D _link_body3C2C4C8D0362 "Diagram::_linkPresentationElement"
            public void _linkPresentationElement(PresentationElement presentationElement1)
            {
              presentationElement.add(presentationElement1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPresentationElement"));
              return;
            }
            // -end- 3C2C4C9F017D _link_body3C2C4C8D0362 "Diagram::_linkPresentationElement"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C4C9F017D _unlink_body3C2C4C8D0362 "Diagram::_unlinkPresentationElement"
            public void _unlinkPresentationElement(PresentationElement presentationElement1)
            {
              presentationElement.remove(presentationElement1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPresentationElement"));
              return;
            }
            // -end- 3C2C4C9F017D _unlink_body3C2C4C8D0362 "Diagram::_unlinkPresentationElement"

            // -beg- preserve=no 3C2C4E4F0246 code3C2C4C8D0362 "namespace"
            private Namespace namespace;
            // -end- 3C2C4E4F0246 code3C2C4C8D0362 "namespace"

            /** attaches a Namespace.
             *  
             *  @see #detachNamespace
             *  @see #getNamespace
             *  @see #containsNamespace
             */
            // -beg- preserve=no 3C2C4E4F0246 attach_head3C2C4C8D0362 "Diagram::attachNamespace"
            public void attachNamespace(Namespace namespace1)
            // -end- 3C2C4E4F0246 attach_head3C2C4C8D0362 "Diagram::attachNamespace"
            {
              // -beg- preserve=no 3C2C4E4F0246 attach_body3C2C4C8D0362 "Diagram::attachNamespace"
              if(namespace!=null) {throw new java.lang.IllegalStateException("already a namespace attached");}
              if(namespace1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as namespace");}
              namespace = namespace1;
              namespace1._linkDiagram(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachNamespace"));
              return;
              // -end- 3C2C4E4F0246 attach_body3C2C4C8D0362 "Diagram::attachNamespace"
            }

            /** disconnect the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 3C2C4E4F0246 detach_head3C2C4C8D0362 "Diagram::detachNamespace"
            public Namespace detachNamespace()
            // -end- 3C2C4E4F0246 detach_head3C2C4C8D0362 "Diagram::detachNamespace"
            {
              // -beg- preserve=no 3C2C4E4F0246 detach_body3C2C4C8D0362 "Diagram::detachNamespace"
              Namespace ret = null;
              if(namespace!=null){
                namespace._unlinkDiagram(this);
                ret = namespace;
                namespace = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachNamespace"));
              return ret;
              // -end- 3C2C4E4F0246 detach_body3C2C4C8D0362 "Diagram::detachNamespace"
            }

            /** get the currently attached Namespace.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 3C2C4E4F0246 get_head3C2C4C8D0362 "Diagram::getNamespace"
            public Namespace getNamespace()
            // -end- 3C2C4E4F0246 get_head3C2C4C8D0362 "Diagram::getNamespace"
            {
              // -beg- preserve=no 3C2C4E4F0246 get_body3C2C4C8D0362 "Diagram::getNamespace"
              if(namespace==null) {throw new java.lang.IllegalStateException("no namespace attached");}
              return namespace;
              // -end- 3C2C4E4F0246 get_body3C2C4C8D0362 "Diagram::getNamespace"
            }

            /** tests if there is a Namespace attached.
             *  @see #attachNamespace
             */
            // -beg- preserve=no 3C2C4E4F0246 test_head3C2C4C8D0362 "Diagram::containsNamespace"
            public boolean containsNamespace()
            // -end- 3C2C4E4F0246 test_head3C2C4C8D0362 "Diagram::containsNamespace"
            {
              // -beg- preserve=no 3C2C4E4F0246 test_body3C2C4C8D0362 "Diagram::containsNamespace"
              return namespace!=null;
              // -end- 3C2C4E4F0246 test_body3C2C4C8D0362 "Diagram::containsNamespace"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C4E4F0246 _link_body3C2C4C8D0362 "Diagram::_linkNamespace"
            public void _linkNamespace(Namespace namespace1)
            {
              namespace = namespace1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkNamespace"));
              return;
            }
            // -end- 3C2C4E4F0246 _link_body3C2C4C8D0362 "Diagram::_linkNamespace"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C4E4F0246 _unlink_body3C2C4C8D0362 "Diagram::_unlinkNamespace"
            public void _unlinkNamespace(Namespace namespace1)
            {
              namespace = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkNamespace"));
              return;
            }
            // -end- 3C2C4E4F0246 _unlink_body3C2C4C8D0362 "Diagram::_unlinkNamespace"

            // -beg- preserve=no 3C6946440349 code3C2C4C8D0362 "pureVisual"
            private java.util.Set pureVisual = new java.util.HashSet();
            // -end- 3C6946440349 code3C2C4C8D0362 "pureVisual"

            /** add a PureVisual.
             *  additional figures, purely visual and not related to any model element
             *  @see #removePureVisual
             *  @see #containsPureVisual
             *  @see #iteratorPureVisual
             *  @see #clearPureVisual
             *  @see #sizePureVisual
             */
            // -beg- preserve=no 3C6946440349 add_head3C2C4C8D0362 "Diagram::addPureVisual"
            public void addPureVisual(AbstractFigure pureVisual1)
            // -end- 3C6946440349 add_head3C2C4C8D0362 "Diagram::addPureVisual"
            {
              // -beg- preserve=no 3C6946440349 add_body3C2C4C8D0362 "Diagram::addPureVisual"
              pureVisual.add(pureVisual1);
              pureVisual1._linkDiagram(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPureVisual"));
              return;
              // -end- 3C6946440349 add_body3C2C4C8D0362 "Diagram::addPureVisual"
            }

            /** disconnect a PureVisual.
             *  @see #addPureVisual
             */
            // -beg- preserve=no 3C6946440349 remove_head3C2C4C8D0362 "Diagram::removePureVisual"
            public AbstractFigure removePureVisual(AbstractFigure pureVisual1)
            // -end- 3C6946440349 remove_head3C2C4C8D0362 "Diagram::removePureVisual"
            {
              // -beg- preserve=no 3C6946440349 remove_body3C2C4C8D0362 "Diagram::removePureVisual"
              AbstractFigure ret=null;
              if(pureVisual1==null || !pureVisual.contains(pureVisual1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = pureVisual1;
              pureVisual.remove(pureVisual1);
              pureVisual1._unlinkDiagram(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePureVisual"));
              return ret;
              // -end- 3C6946440349 remove_body3C2C4C8D0362 "Diagram::removePureVisual"
            }

            /** tests if a given PureVisual is connected.
             *  @see #addPureVisual
             */
            // -beg- preserve=no 3C6946440349 test_head3C2C4C8D0362 "Diagram::containsPureVisual"
            public boolean containsPureVisual(AbstractFigure pureVisual1)
            // -end- 3C6946440349 test_head3C2C4C8D0362 "Diagram::containsPureVisual"
            {
              // -beg- preserve=no 3C6946440349 test_body3C2C4C8D0362 "Diagram::containsPureVisual"
              return pureVisual.contains(pureVisual1);
              // -end- 3C6946440349 test_body3C2C4C8D0362 "Diagram::containsPureVisual"
            }

            /** used to enumerate all connected PureVisuals.
             *  @see #addPureVisual
             */
            // -beg- preserve=no 3C6946440349 get_all_head3C2C4C8D0362 "Diagram::iteratorPureVisual"
            public java.util.Iterator iteratorPureVisual()
            // -end- 3C6946440349 get_all_head3C2C4C8D0362 "Diagram::iteratorPureVisual"
            {
              // -beg- preserve=no 3C6946440349 get_all_body3C2C4C8D0362 "Diagram::iteratorPureVisual"
              return pureVisual.iterator();
              // -end- 3C6946440349 get_all_body3C2C4C8D0362 "Diagram::iteratorPureVisual"
            }

            /** disconnect all PureVisuals.
             *  @see #addPureVisual
             */
            // -beg- preserve=no 3C6946440349 remove_all_head3C2C4C8D0362 "Diagram::clearPureVisual"
            public void clearPureVisual()
            // -end- 3C6946440349 remove_all_head3C2C4C8D0362 "Diagram::clearPureVisual"
            {
              // -beg- preserve=no 3C6946440349 remove_all_body3C2C4C8D0362 "Diagram::clearPureVisual"
              if(sizePureVisual()>0){
                for(java.util.Iterator p = pureVisual.iterator(); p.hasNext();){
                  ((AbstractFigure)p.next())._unlinkDiagram(this);
                }
                pureVisual.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPureVisual"));
              }
              // -end- 3C6946440349 remove_all_body3C2C4C8D0362 "Diagram::clearPureVisual"
            }

            /** returns the number of PureVisuals.
             *  @see #addPureVisual
             */
            // -beg- preserve=no 3C6946440349 size_head3C2C4C8D0362 "Diagram::sizePureVisual"
            public int sizePureVisual()
            // -end- 3C6946440349 size_head3C2C4C8D0362 "Diagram::sizePureVisual"
            {
              // -beg- preserve=no 3C6946440349 size_body3C2C4C8D0362 "Diagram::sizePureVisual"
              return pureVisual.size();
              // -end- 3C6946440349 size_body3C2C4C8D0362 "Diagram::sizePureVisual"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C6946440349 _link_body3C2C4C8D0362 "Diagram::_linkPureVisual"
            public void _linkPureVisual(AbstractFigure pureVisual1)
            {
              pureVisual.add(pureVisual1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPureVisual"));
              return;
            }
            // -end- 3C6946440349 _link_body3C2C4C8D0362 "Diagram::_linkPureVisual"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C6946440349 _unlink_body3C2C4C8D0362 "Diagram::_unlinkPureVisual"
            public void _unlinkPureVisual(AbstractFigure pureVisual1)
            {
              pureVisual.remove(pureVisual1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPureVisual"));
              return;
            }
            // -end- 3C6946440349 _unlink_body3C2C4C8D0362 "Diagram::_unlinkPureVisual"

            // -beg- preserve=no 3C2C4DFA0348 var3C2C4C8D0362 "name"
            private NlsString name = null;
            // -end- 3C2C4DFA0348 var3C2C4C8D0362 "name"

            /** get current value of name
             *  @see #setName
             */
            // -beg- preserve=no 3C2C4DFA0348 get_head3C2C4C8D0362 "name"
            public  NlsString getName()
            // -end- 3C2C4DFA0348 get_head3C2C4C8D0362 "name"
            {
              // -beg- preserve=no 3C2C4DFA0348 get_body3C2C4C8D0362 "name"
              return name;
              // -end- 3C2C4DFA0348 get_body3C2C4C8D0362 "name"
            }

            /** set current value of name
             *  @see #getName
             */
            // -beg- preserve=no 3C2C4DFA0348 set_head3C2C4C8D0362 "name"
            public  void setName(NlsString value1)
            // -end- 3C2C4DFA0348 set_head3C2C4C8D0362 "name"
            {
              // -beg- preserve=no 3C2C4DFA0348 set_body3C2C4C8D0362 "name"
              if(name!=value1 && (name==null || !name.equals(value1))){
                name = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setName"));
              }
              // -end- 3C2C4DFA0348 set_body3C2C4C8D0362 "name"
            }

            // -beg- preserve=no 3E4118B201D4 var3C2C4C8D0362 "showAttributeType"
            private boolean showAttributeType = false;
            // -end- 3E4118B201D4 var3C2C4C8D0362 "showAttributeType"

            /** get current value of showAttributeType
             *  @see #setShowAttributeType
             */
            // -beg- preserve=no 3E4118B201D4 get_head3C2C4C8D0362 "showAttributeType"
            public  boolean isShowAttributeType()
            // -end- 3E4118B201D4 get_head3C2C4C8D0362 "showAttributeType"
            {
              // -beg- preserve=no 3E4118B201D4 get_body3C2C4C8D0362 "showAttributeType"
              return showAttributeType;
              // -end- 3E4118B201D4 get_body3C2C4C8D0362 "showAttributeType"
            }

            /** set current value of showAttributeType
             *  @see #isShowAttributeType
             */
            // -beg- preserve=no 3E4118B201D4 set_head3C2C4C8D0362 "showAttributeType"
            public  void setShowAttributeType(boolean value1)
            // -end- 3E4118B201D4 set_head3C2C4C8D0362 "showAttributeType"
            {
              // -beg- preserve=no 3E4118B201D4 set_body3C2C4C8D0362 "showAttributeType"
              if(showAttributeType != value1){
                showAttributeType = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowAttributeType"));
              }
              // -end- 3E4118B201D4 set_body3C2C4C8D0362 "showAttributeType"
            }

            // -beg- preserve=no 3E4118CB01A8 var3C2C4C8D0362 "showAttributeMultiplicity"
            private boolean showAttributeMultiplicity = false;
            // -end- 3E4118CB01A8 var3C2C4C8D0362 "showAttributeMultiplicity"

            /** get current value of showAttributeMultiplicity
             *  @see #setShowAttributeMultiplicity
             */
            // -beg- preserve=no 3E4118CB01A8 get_head3C2C4C8D0362 "showAttributeMultiplicity"
            public  boolean isShowAttributeMultiplicity()
            // -end- 3E4118CB01A8 get_head3C2C4C8D0362 "showAttributeMultiplicity"
            {
              // -beg- preserve=no 3E4118CB01A8 get_body3C2C4C8D0362 "showAttributeMultiplicity"
              return showAttributeMultiplicity;
              // -end- 3E4118CB01A8 get_body3C2C4C8D0362 "showAttributeMultiplicity"
            }

            /** set current value of showAttributeMultiplicity
             *  @see #isShowAttributeMultiplicity
             */
            // -beg- preserve=no 3E4118CB01A8 set_head3C2C4C8D0362 "showAttributeMultiplicity"
            public  void setShowAttributeMultiplicity(boolean value1)
            // -end- 3E4118CB01A8 set_head3C2C4C8D0362 "showAttributeMultiplicity"
            {
              // -beg- preserve=no 3E4118CB01A8 set_body3C2C4C8D0362 "showAttributeMultiplicity"
              if(showAttributeMultiplicity != value1){
                showAttributeMultiplicity = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setShowAttributeMultiplicity"));
              }
              // -end- 3E4118CB01A8 set_body3C2C4C8D0362 "showAttributeMultiplicity"
            }

            // -beg- preserve=no 3C1DF92B0234 var3C2C4C8D0362 "documentation"
            private NlsString documentation = null;
            // -end- 3C1DF92B0234 var3C2C4C8D0362 "documentation"

            /** get current value of documentation
             *  @see #setDocumentation
             */
            // -beg- preserve=no 3C1DF92B0234 get_head3C2C4C8D0362 "documentation"
            public  NlsString getDocumentation()
            // -end- 3C1DF92B0234 get_head3C2C4C8D0362 "documentation"
            {
              // -beg- preserve=no 3C1DF92B0234 get_body3C2C4C8D0362 "documentation"
              return documentation;
              // -end- 3C1DF92B0234 get_body3C2C4C8D0362 "documentation"
            }

            /** set current value of documentation
             *  @see #getDocumentation
             */
            // -beg- preserve=no 3C1DF92B0234 set_head3C2C4C8D0362 "documentation"
            public  void setDocumentation(NlsString value1)
            // -end- 3C1DF92B0234 set_head3C2C4C8D0362 "documentation"
            {
              // -beg- preserve=no 3C1DF92B0234 set_body3C2C4C8D0362 "documentation"
              if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
                documentation = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
              }
              // -end- 3C1DF92B0234 set_body3C2C4C8D0362 "documentation"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C2C4C8D0362 detail_end "Diagram"

            // -end- 3C2C4C8D0362 detail_end "Diagram"

          }

