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


          // -beg- preserve=no 3C2C37440059 package "Dependency"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3C2C37440059 package "Dependency"

          // -beg- preserve=no 3C2C37440059 autoimport "Dependency"
          import ch.ehi.umleditor.umlpresentation.PresentationEdge;
          import ch.ehi.uml1_4.foundation.core.ModelElement;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3C2C37440059 autoimport "Dependency"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3C2C37440059 import "Dependency"

          // -end- 3C2C37440059 import "Dependency"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:09 $
           */
public class Dependency extends PresentationEdge implements java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C2C37440059 detail_begin "Dependency"

            // -end- 3C2C37440059 detail_begin "Dependency"

            // -beg- preserve=no 3D4FA2170255 head3C2C37440059 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2170255 head3C2C37440059 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170255 throws3C2C37440059 "unlinkAll"

              // -end- 3D4FA2170255 throws3C2C37440059 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170255 body3C2C37440059 "unlinkAll"
              
              clearSubject();
              super.unlinkAll();
              // -end- 3D4FA2170255 body3C2C37440059 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2170256 head3C2C37440059 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2170256 head3C2C37440059 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170256 throws3C2C37440059 "enumerateChildren"

              // -end- 3D4FA2170256 throws3C2C37440059 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170256 body3C2C37440059 "enumerateChildren"
              java.util.Iterator it=null;
              super.enumerateChildren(visitor);
              // -end- 3D4FA2170256 body3C2C37440059 "enumerateChildren"
              }

            // -beg- preserve=no 362409A803C0 code3C2C37440059 "subject"

            // -end- 362409A803C0 code3C2C37440059 "subject"

            /** add a Subject.
             *  
             *  @see #removeSubject
             *  @see #containsSubject
             *  @see #iteratorSubject
             *  @see #clearSubject
             *  @see #sizeSubject
             */
            // -beg- preserve=no 362409A803C0 add_head3C2C37440059 "PresentationElement::addSubject"
            public void addSubject(ModelElement subject1)
            // -end- 362409A803C0 add_head3C2C37440059 "PresentationElement::addSubject"
            {
              // -beg- preserve=no 362409A803C0 add_body3C2C37440059 "PresentationElement::addSubject"
              super.addSubject(subject1);
              // -end- 362409A803C0 add_body3C2C37440059 "PresentationElement::addSubject"
            }

            /** disconnect a Subject.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 remove_head3C2C37440059 "PresentationElement::removeSubject"
            public ModelElement removeSubject(ModelElement subject1)
            // -end- 362409A803C0 remove_head3C2C37440059 "PresentationElement::removeSubject"
            {
              // -beg- preserve=no 362409A803C0 remove_body3C2C37440059 "PresentationElement::removeSubject"
              return super.removeSubject(subject1);
              // -end- 362409A803C0 remove_body3C2C37440059 "PresentationElement::removeSubject"
            }

            /** tests if a given Subject is connected.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 test_head3C2C37440059 "PresentationElement::containsSubject"
            public boolean containsSubject(ModelElement subject1)
            // -end- 362409A803C0 test_head3C2C37440059 "PresentationElement::containsSubject"
            {
              // -beg- preserve=no 362409A803C0 test_body3C2C37440059 "PresentationElement::containsSubject"
              return super.containsSubject(subject1);
              // -end- 362409A803C0 test_body3C2C37440059 "PresentationElement::containsSubject"
            }

            /** used to enumerate all connected Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 get_all_head3C2C37440059 "PresentationElement::iteratorSubject"
            public java.util.Iterator iteratorSubject()
            // -end- 362409A803C0 get_all_head3C2C37440059 "PresentationElement::iteratorSubject"
            {
              // -beg- preserve=no 362409A803C0 get_all_body3C2C37440059 "PresentationElement::iteratorSubject"
              return super.iteratorSubject();
              // -end- 362409A803C0 get_all_body3C2C37440059 "PresentationElement::iteratorSubject"
            }

            /** disconnect all Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 remove_all_head3C2C37440059 "PresentationElement::clearSubject"
            public void clearSubject()
            // -end- 362409A803C0 remove_all_head3C2C37440059 "PresentationElement::clearSubject"
            {
              // -beg- preserve=no 362409A803C0 remove_all_body3C2C37440059 "PresentationElement::clearSubject"
              super.clearSubject();
              // -end- 362409A803C0 remove_all_body3C2C37440059 "PresentationElement::clearSubject"
            }

            /** returns the number of Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 size_head3C2C37440059 "PresentationElement::sizeSubject"
            public int sizeSubject()
            // -end- 362409A803C0 size_head3C2C37440059 "PresentationElement::sizeSubject"
            {
              // -beg- preserve=no 362409A803C0 size_body3C2C37440059 "PresentationElement::sizeSubject"
              return super.sizeSubject();
              // -end- 362409A803C0 size_body3C2C37440059 "PresentationElement::sizeSubject"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A803C0 _link_body3C2C37440059 "PresentationElement::_linkSubject"
            public void _linkSubject(ModelElement subject1)
            {
              super._linkSubject(subject1);
            }
            // -end- 362409A803C0 _link_body3C2C37440059 "PresentationElement::_linkSubject"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A803C0 _unlink_body3C2C37440059 "PresentationElement::_unlinkSubject"
            public void _unlinkSubject(ModelElement subject1)
            {
              super._unlinkSubject(subject1);
            }
            // -end- 362409A803C0 _unlink_body3C2C37440059 "PresentationElement::_unlinkSubject"

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C2C37440059 detail_end "Dependency"

            // -end- 3C2C37440059 detail_end "Dependency"

          }

