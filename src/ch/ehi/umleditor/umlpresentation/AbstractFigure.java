// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:41:04 $
// $Revision: 1.1.1.1 $
//

          // -beg- preserve=no 3C69463602B2 package "AbstractFigure"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3C69463602B2 package "AbstractFigure"

          // -beg- preserve=no 3C69463602B2 autoimport "AbstractFigure"
          import ch.ehi.umleditor.umlpresentation.Diagram;
          // -end- 3C69463602B2 autoimport "AbstractFigure"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3C69463602B2 import "AbstractFigure"

          // -end- 3C69463602B2 import "AbstractFigure"

          /** @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:04 $
           */
public interface AbstractFigure extends java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C69463602B2 detail_begin "AbstractFigure"

            // -end- 3C69463602B2 detail_begin "AbstractFigure"

            /** attaches a Diagram.
             *  
             *  @see #detachDiagram
             *  @see #getDiagram
             *  @see #containsDiagram
             */
            // -beg- preserve=no 3C694644033E attach_head3C69463602B2 "AbstractFigure::attachDiagram"
            public void attachDiagram(Diagram diagram1)
            // -end- 3C694644033E attach_head3C69463602B2 "AbstractFigure::attachDiagram"
              ; // empty

            /** disconnect the currently attached Diagram.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C694644033E detach_head3C69463602B2 "AbstractFigure::detachDiagram"
            public Diagram detachDiagram()
            // -end- 3C694644033E detach_head3C69463602B2 "AbstractFigure::detachDiagram"
              ; // empty

            /** get the currently attached Diagram.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C694644033E get_head3C69463602B2 "AbstractFigure::getDiagram"
            public Diagram getDiagram()
            // -end- 3C694644033E get_head3C69463602B2 "AbstractFigure::getDiagram"
              ; // empty

            /** tests if there is a Diagram attached.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C694644033E test_head3C69463602B2 "AbstractFigure::containsDiagram"
            public boolean containsDiagram()
            // -end- 3C694644033E test_head3C69463602B2 "AbstractFigure::containsDiagram"
              ; // empty

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C694644033E _link_body3C69463602B2 "AbstractFigure::_linkDiagram"
            public void _linkDiagram(Diagram diagram1);
            // -end- 3C694644033E _link_body3C69463602B2 "AbstractFigure::_linkDiagram"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C694644033E _unlink_body3C69463602B2 "AbstractFigure::_unlinkDiagram"
            public void _unlinkDiagram(Diagram diagram1);
            // -end- 3C694644033E _unlink_body3C69463602B2 "AbstractFigure::_unlinkDiagram"

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C69463602B2 detail_end "AbstractFigure"

            // -end- 3C69463602B2 detail_end "AbstractFigure"

          }

