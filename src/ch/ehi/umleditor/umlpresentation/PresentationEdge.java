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


          // -beg- preserve=no 3C2C47C7009D package "PresentationEdge"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3C2C47C7009D package "PresentationEdge"

          // -beg- preserve=no 3C2C47C7009D autoimport "PresentationEdge"
          import ch.ehi.uml1_4.foundation.core.PresentationElement;
          import ch.ehi.uml1_4.implementation.AbstractEditorElement;
          import ch.ehi.umleditor.umlpresentation.WayPoint;
          import ch.ehi.basics.tools.AbstractVisitor;
          import ch.ehi.uml1_4.foundation.core.ModelElement;
          import ch.ehi.umleditor.umlpresentation.Diagram;
          import ch.ehi.basics.types.NlsString;
          // -end- 3C2C47C7009D autoimport "PresentationEdge"

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=yes 3C2C47C7009D import "PresentationEdge"
import ch.ehi.uml1_4.foundation.core.*;

          // -end- 3C2C47C7009D import "PresentationEdge"

          /** The root of line-style presentations
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:23 $
           */
public abstract class PresentationEdge extends AbstractEditorElement implements PresentationElement , java.io.Serializable
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C2C47C7009D detail_begin "PresentationEdge"

            // -end- 3C2C47C7009D detail_begin "PresentationEdge"

            // -beg- preserve=no 3D4FA2170074 head3C2C47C7009D "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA2170074 head3C2C47C7009D "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170074 throws3C2C47C7009D "unlinkAll"

              // -end- 3D4FA2170074 throws3C2C47C7009D "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170074 body3C2C47C7009D "unlinkAll"
              
              clearEndpoint();
              clearWayPoint();
              // Role EdgeFigure: EdgeFigure object(s) may point to this
              setForeground(null);
              setBackground(null);
              clearSubject();
              detachDiagram();
              // Role PresentationComposite: PresentationComposite object(s) may point to this
              clearPresentationEdge();
              setMetaAttrb(null);
              setDocumentation(null);
              super.unlinkAll();
              // -end- 3D4FA2170074 body3C2C47C7009D "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2170092 head3C2C47C7009D "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2170092 head3C2C47C7009D "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170092 throws3C2C47C7009D "enumerateChildren"

              // -end- 3D4FA2170092 throws3C2C47C7009D "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170092 body3C2C47C7009D "enumerateChildren"
              java.util.Iterator it=null;
              it=iteratorWayPoint();while(it.hasNext())visitor.visit(it.next());
              visitor.visit(getForeground());
              visitor.visit(getBackground());
              visitor.visit(getMetaAttrb());
              visitor.visit(getDocumentation());
              super.enumerateChildren(visitor);
              // -end- 3D4FA2170092 body3C2C47C7009D "enumerateChildren"
              }

            // -beg- preserve=no 3C2C49E3018A code3C2C47C7009D "endpoint"
            private java.util.List endpoint = new java.util.ArrayList();
            // -end- 3C2C49E3018A code3C2C47C7009D "endpoint"

            /** add a Endpoint.
             *  
             *  @see #removeEndpoint
             *  @see #containsEndpoint
             *  @see #iteratorEndpoint
             *  @see #clearEndpoint
             *  @see #sizeEndpoint
             */
            // -beg- preserve=no 3C2C49E3018A add_head3C2C47C7009D "PresentationEdge::addEndpoint"
            public void addEndpoint(PresentationElement endpoint1)
            // -end- 3C2C49E3018A add_head3C2C47C7009D "PresentationEdge::addEndpoint"
            {
              // -beg- preserve=no 3C2C49E3018A add_body3C2C47C7009D "PresentationEdge::addEndpoint"
              endpoint.add(endpoint1);
              endpoint1._linkPresentationEdge(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addEndpoint"));
              return;
              // -end- 3C2C49E3018A add_body3C2C47C7009D "PresentationEdge::addEndpoint"
            }

            // -beg- preserve=no 3C2C49E3018A add2_head3C2C47C7009D "PresentationEdge::add2Endpoint"
            public void addEndpoint(int index,PresentationElement endpoint1)
            // -end- 3C2C49E3018A add2_head3C2C47C7009D "PresentationEdge::add2Endpoint"
            {
              // -beg- preserve=no 3C2C49E3018A add2_body3C2C47C7009D "PresentationEdge::add2Endpoint"
              endpoint.add(index,endpoint1);
              endpoint1._linkPresentationEdge(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addEndpoint"));
              return;
              // -end- 3C2C49E3018A add2_body3C2C47C7009D "PresentationEdge::add2Endpoint"
            }

            /** disconnect a Endpoint.
             *  @see #addEndpoint
             */
            // -beg- preserve=no 3C2C49E3018A remove_head3C2C47C7009D "PresentationEdge::removeEndpoint"
            public PresentationElement removeEndpoint(PresentationElement endpoint1)
            // -end- 3C2C49E3018A remove_head3C2C47C7009D "PresentationEdge::removeEndpoint"
            {
              // -beg- preserve=no 3C2C49E3018A remove_body3C2C47C7009D "PresentationEdge::removeEndpoint"
              PresentationElement ret=null;
              if(endpoint1==null || !endpoint.contains(endpoint1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = endpoint1;
              endpoint.remove(endpoint1);
              endpoint1._unlinkPresentationEdge(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeEndpoint"));
              return ret;
              // -end- 3C2C49E3018A remove_body3C2C47C7009D "PresentationEdge::removeEndpoint"
            }

            /** disconnect a Endpoint.
             *  @see #addEndpoint
             */
            // -beg- preserve=no 3C2C49E3018A remove2_head3C2C47C7009D "PresentationEdge::remove2Endpoint"
            public PresentationElement removeEndpoint(int index)
            // -end- 3C2C49E3018A remove2_head3C2C47C7009D "PresentationEdge::remove2Endpoint"
            {
              // -beg- preserve=no 3C2C49E3018A remove2_body3C2C47C7009D "PresentationEdge::remove2Endpoint"
              PresentationElement ret=null;
              ret = (PresentationElement)endpoint.remove(index);
              ret._unlinkPresentationEdge(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeEndpoint"));
              return ret;
              // -end- 3C2C49E3018A remove2_body3C2C47C7009D "PresentationEdge::remove2Endpoint"
            }

            /** change a Endpoint.
             *  @see #addEndpoint
             */
            // -beg- preserve=no 3C2C49E3018A set_head3C2C47C7009D "PresentationEdge::setEndpoint"
            public PresentationElement setEndpoint(int index,PresentationElement endpoint1)
            // -end- 3C2C49E3018A set_head3C2C47C7009D "PresentationEdge::setEndpoint"
            {
              // -beg- preserve=no 3C2C49E3018A set_body3C2C47C7009D "PresentationEdge::setEndpoint"
              PresentationElement ret=null;
              ret = (PresentationElement)endpoint.set(index,endpoint1);
              ret._unlinkPresentationEdge(this);
              endpoint1._linkPresentationEdge(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setEndpoint"));
              return ret;
              // -end- 3C2C49E3018A set_body3C2C47C7009D "PresentationEdge::setEndpoint"
            }

            /** tests if a given Endpoint is connected.
             *  @see #addEndpoint
             */
            // -beg- preserve=no 3C2C49E3018A test_head3C2C47C7009D "PresentationEdge::containsEndpoint"
            public boolean containsEndpoint(PresentationElement endpoint1)
            // -end- 3C2C49E3018A test_head3C2C47C7009D "PresentationEdge::containsEndpoint"
            {
              // -beg- preserve=no 3C2C49E3018A test_body3C2C47C7009D "PresentationEdge::containsEndpoint"
              return endpoint.contains(endpoint1);
              // -end- 3C2C49E3018A test_body3C2C47C7009D "PresentationEdge::containsEndpoint"
            }

            /** used to enumerate all connected Endpoints.
             *  @see #addEndpoint
             */
            // -beg- preserve=no 3C2C49E3018A get_all_head3C2C47C7009D "PresentationEdge::iteratorEndpoint"
            public java.util.Iterator iteratorEndpoint()
            // -end- 3C2C49E3018A get_all_head3C2C47C7009D "PresentationEdge::iteratorEndpoint"
            {
              // -beg- preserve=no 3C2C49E3018A get_all_body3C2C47C7009D "PresentationEdge::iteratorEndpoint"
              return endpoint.iterator();
              // -end- 3C2C49E3018A get_all_body3C2C47C7009D "PresentationEdge::iteratorEndpoint"
            }

            /** disconnect all Endpoints.
             *  @see #addEndpoint
             */
            // -beg- preserve=no 3C2C49E3018A remove_all_head3C2C47C7009D "PresentationEdge::clearEndpoint"
            public void clearEndpoint()
            // -end- 3C2C49E3018A remove_all_head3C2C47C7009D "PresentationEdge::clearEndpoint"
            {
              // -beg- preserve=no 3C2C49E3018A remove_all_body3C2C47C7009D "PresentationEdge::clearEndpoint"
              if(sizeEndpoint()>0){
                for(java.util.Iterator p = endpoint.iterator(); p.hasNext();){
                  ((PresentationElement)p.next())._unlinkPresentationEdge(this);
                }
                endpoint.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearEndpoint"));
              }
              // -end- 3C2C49E3018A remove_all_body3C2C47C7009D "PresentationEdge::clearEndpoint"
            }

            /** returns the number of Endpoints.
             *  @see #addEndpoint
             */
            // -beg- preserve=no 3C2C49E3018A size_head3C2C47C7009D "PresentationEdge::sizeEndpoint"
            public int sizeEndpoint()
            // -end- 3C2C49E3018A size_head3C2C47C7009D "PresentationEdge::sizeEndpoint"
            {
              // -beg- preserve=no 3C2C49E3018A size_body3C2C47C7009D "PresentationEdge::sizeEndpoint"
              return endpoint.size();
              // -end- 3C2C49E3018A size_body3C2C47C7009D "PresentationEdge::sizeEndpoint"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C49E3018A _link_body3C2C47C7009D "PresentationEdge::_linkEndpoint"
            public void _linkEndpoint(PresentationElement endpoint1)
            {
              endpoint.add(endpoint1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkEndpoint"));
              return;
            }
            // -end- 3C2C49E3018A _link_body3C2C47C7009D "PresentationEdge::_linkEndpoint"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C49E3018A _unlink_body3C2C47C7009D "PresentationEdge::_unlinkEndpoint"
            public void _unlinkEndpoint(PresentationElement endpoint1)
            {
              endpoint.remove(endpoint1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkEndpoint"));
              return;
            }
            // -end- 3C2C49E3018A _unlink_body3C2C47C7009D "PresentationEdge::_unlinkEndpoint"

            // -beg- preserve=no 3C2C4A570368 code3C2C47C7009D "wayPoint"
            private java.util.List wayPoint = new java.util.ArrayList();
            // -end- 3C2C4A570368 code3C2C47C7009D "wayPoint"

            /** add a WayPoint.
             *  
             *  @see #removeWayPoint
             *  @see #containsWayPoint
             *  @see #iteratorWayPoint
             *  @see #clearWayPoint
             *  @see #sizeWayPoint
             */
            // -beg- preserve=no 3C2C4A570368 add_head3C2C47C7009D "PresentationEdge::addWayPoint"
            public void addWayPoint(WayPoint wayPoint1)
            // -end- 3C2C4A570368 add_head3C2C47C7009D "PresentationEdge::addWayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 add_body3C2C47C7009D "PresentationEdge::addWayPoint"
              wayPoint.add(wayPoint1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addWayPoint"));
              return;
              // -end- 3C2C4A570368 add_body3C2C47C7009D "PresentationEdge::addWayPoint"
            }

            // -beg- preserve=no 3C2C4A570368 add2_head3C2C47C7009D "PresentationEdge::add2WayPoint"
            public void addWayPoint(int index,WayPoint wayPoint1)
            // -end- 3C2C4A570368 add2_head3C2C47C7009D "PresentationEdge::add2WayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 add2_body3C2C47C7009D "PresentationEdge::add2WayPoint"
              wayPoint.add(index,wayPoint1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addWayPoint"));
              return;
              // -end- 3C2C4A570368 add2_body3C2C47C7009D "PresentationEdge::add2WayPoint"
            }

            /** disconnect a WayPoint.
             *  @see #addWayPoint
             */
            // -beg- preserve=no 3C2C4A570368 remove_head3C2C47C7009D "PresentationEdge::removeWayPoint"
            public WayPoint removeWayPoint(WayPoint wayPoint1)
            // -end- 3C2C4A570368 remove_head3C2C47C7009D "PresentationEdge::removeWayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 remove_body3C2C47C7009D "PresentationEdge::removeWayPoint"
              WayPoint ret=null;
              if(wayPoint1==null || !wayPoint.contains(wayPoint1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = wayPoint1;
              wayPoint.remove(wayPoint1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeWayPoint"));
              return ret;
              // -end- 3C2C4A570368 remove_body3C2C47C7009D "PresentationEdge::removeWayPoint"
            }

            /** disconnect a WayPoint.
             *  @see #addWayPoint
             */
            // -beg- preserve=no 3C2C4A570368 remove2_head3C2C47C7009D "PresentationEdge::remove2WayPoint"
            public WayPoint removeWayPoint(int index)
            // -end- 3C2C4A570368 remove2_head3C2C47C7009D "PresentationEdge::remove2WayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 remove2_body3C2C47C7009D "PresentationEdge::remove2WayPoint"
              WayPoint ret=null;
              ret = (WayPoint)wayPoint.remove(index);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeWayPoint"));
              return ret;
              // -end- 3C2C4A570368 remove2_body3C2C47C7009D "PresentationEdge::remove2WayPoint"
            }

            /** change a WayPoint.
             *  @see #addWayPoint
             */
            // -beg- preserve=no 3C2C4A570368 set_head3C2C47C7009D "PresentationEdge::setWayPoint"
            public WayPoint setWayPoint(int index,WayPoint wayPoint1)
            // -end- 3C2C4A570368 set_head3C2C47C7009D "PresentationEdge::setWayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 set_body3C2C47C7009D "PresentationEdge::setWayPoint"
              WayPoint ret=null;
              ret = (WayPoint)wayPoint.set(index,wayPoint1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setWayPoint"));
              return ret;
              // -end- 3C2C4A570368 set_body3C2C47C7009D "PresentationEdge::setWayPoint"
            }

            /** tests if a given WayPoint is connected.
             *  @see #addWayPoint
             */
            // -beg- preserve=no 3C2C4A570368 test_head3C2C47C7009D "PresentationEdge::containsWayPoint"
            public boolean containsWayPoint(WayPoint wayPoint1)
            // -end- 3C2C4A570368 test_head3C2C47C7009D "PresentationEdge::containsWayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 test_body3C2C47C7009D "PresentationEdge::containsWayPoint"
              return wayPoint.contains(wayPoint1);
              // -end- 3C2C4A570368 test_body3C2C47C7009D "PresentationEdge::containsWayPoint"
            }

            /** used to enumerate all connected WayPoints.
             *  @see #addWayPoint
             */
            // -beg- preserve=no 3C2C4A570368 get_all_head3C2C47C7009D "PresentationEdge::iteratorWayPoint"
            public java.util.Iterator iteratorWayPoint()
            // -end- 3C2C4A570368 get_all_head3C2C47C7009D "PresentationEdge::iteratorWayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 get_all_body3C2C47C7009D "PresentationEdge::iteratorWayPoint"
              return wayPoint.iterator();
              // -end- 3C2C4A570368 get_all_body3C2C47C7009D "PresentationEdge::iteratorWayPoint"
            }

            /** disconnect all WayPoints.
             *  @see #addWayPoint
             */
            // -beg- preserve=no 3C2C4A570368 remove_all_head3C2C47C7009D "PresentationEdge::clearWayPoint"
            public void clearWayPoint()
            // -end- 3C2C4A570368 remove_all_head3C2C47C7009D "PresentationEdge::clearWayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 remove_all_body3C2C47C7009D "PresentationEdge::clearWayPoint"
              if(sizeWayPoint()>0){
                wayPoint.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearWayPoint"));
              }
              // -end- 3C2C4A570368 remove_all_body3C2C47C7009D "PresentationEdge::clearWayPoint"
            }

            /** returns the number of WayPoints.
             *  @see #addWayPoint
             */
            // -beg- preserve=no 3C2C4A570368 size_head3C2C47C7009D "PresentationEdge::sizeWayPoint"
            public int sizeWayPoint()
            // -end- 3C2C4A570368 size_head3C2C47C7009D "PresentationEdge::sizeWayPoint"
            {
              // -beg- preserve=no 3C2C4A570368 size_body3C2C47C7009D "PresentationEdge::sizeWayPoint"
              return wayPoint.size();
              // -end- 3C2C4A570368 size_body3C2C47C7009D "PresentationEdge::sizeWayPoint"
            }

            // -beg- preserve=no 3C2C4A9F032F var3C2C47C7009D "orthogonal"
            private boolean orthogonal;
            // -end- 3C2C4A9F032F var3C2C47C7009D "orthogonal"

            /** get current value of orthogonal
             *  The geometry of the actual presentation of this Edge should be with right angles
             *  @see #setOrthogonal
             */
            // -beg- preserve=no 3C2C4A9F032F get_head3C2C47C7009D "orthogonal"
            public  boolean isOrthogonal()
            // -end- 3C2C4A9F032F get_head3C2C47C7009D "orthogonal"
            {
              // -beg- preserve=no 3C2C4A9F032F get_body3C2C47C7009D "orthogonal"
              return orthogonal;
              // -end- 3C2C4A9F032F get_body3C2C47C7009D "orthogonal"
            }

            /** set current value of orthogonal
             *  @see #isOrthogonal
             */
            // -beg- preserve=no 3C2C4A9F032F set_head3C2C47C7009D "orthogonal"
            public  void setOrthogonal(boolean value1)
            // -end- 3C2C4A9F032F set_head3C2C47C7009D "orthogonal"
            {
              // -beg- preserve=no 3C2C4A9F032F set_body3C2C47C7009D "orthogonal"
              if(orthogonal != value1){
                orthogonal = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setOrthogonal"));
              }
              // -end- 3C2C4A9F032F set_body3C2C47C7009D "orthogonal"
            }

            // -beg- preserve=no 3C34385C008B var3C2C47C7009D "foreground"
            private Color foreground = null;
            // -end- 3C34385C008B var3C2C47C7009D "foreground"

            /** get current value of foreground
             *  @see #setForeground
             */
            // -beg- preserve=no 3C34385C008B get_head3C2C47C7009D "foreground"
            public  Color getForeground()
            // -end- 3C34385C008B get_head3C2C47C7009D "foreground"
            {
              // -beg- preserve=no 3C34385C008B get_body3C2C47C7009D "foreground"
              return foreground;
              // -end- 3C34385C008B get_body3C2C47C7009D "foreground"
            }

            /** set current value of foreground
             *  @see #getForeground
             */
            // -beg- preserve=no 3C34385C008B set_head3C2C47C7009D "foreground"
            public  void setForeground(Color value1)
            // -end- 3C34385C008B set_head3C2C47C7009D "foreground"
            {
              // -beg- preserve=no 3C34385C008B set_body3C2C47C7009D "foreground"
              if(foreground!=value1 && (foreground==null || !foreground.equals(value1))){
                foreground = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setForeground"));
              }
              // -end- 3C34385C008B set_body3C2C47C7009D "foreground"
            }

            // -beg- preserve=no 3C34385E00A2 var3C2C47C7009D "background"
            private Color background = null;
            // -end- 3C34385E00A2 var3C2C47C7009D "background"

            /** get current value of background
             *  @see #setBackground
             */
            // -beg- preserve=no 3C34385E00A2 get_head3C2C47C7009D "background"
            public  Color getBackground()
            // -end- 3C34385E00A2 get_head3C2C47C7009D "background"
            {
              // -beg- preserve=no 3C34385E00A2 get_body3C2C47C7009D "background"
              return background;
              // -end- 3C34385E00A2 get_body3C2C47C7009D "background"
            }

            /** set current value of background
             *  @see #getBackground
             */
            // -beg- preserve=no 3C34385E00A2 set_head3C2C47C7009D "background"
            public  void setBackground(Color value1)
            // -end- 3C34385E00A2 set_head3C2C47C7009D "background"
            {
              // -beg- preserve=no 3C34385E00A2 set_body3C2C47C7009D "background"
              if(background!=value1 && (background==null || !background.equals(value1))){
                background = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setBackground"));
              }
              // -end- 3C34385E00A2 set_body3C2C47C7009D "background"
            }

            // -beg- preserve=no 3C34389B03DF var3C2C47C7009D "font"
            private String font;
            // -end- 3C34389B03DF var3C2C47C7009D "font"

            /** get current value of font
             *  @see #setFont
             */
            // -beg- preserve=no 3C34389B03DF get_head3C2C47C7009D "font"
            public  String getFont()
            // -end- 3C34389B03DF get_head3C2C47C7009D "font"
            {
              // -beg- preserve=no 3C34389B03DF get_body3C2C47C7009D "font"
              return font;
              // -end- 3C34389B03DF get_body3C2C47C7009D "font"
            }

            /** set current value of font
             *  @see #getFont
             */
            // -beg- preserve=no 3C34389B03DF set_head3C2C47C7009D "font"
            public  void setFont(String value1)
            // -end- 3C34389B03DF set_head3C2C47C7009D "font"
            {
              // -beg- preserve=no 3C34389B03DF set_body3C2C47C7009D "font"
              if(font != value1){
                font = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setFont"));
              }
              // -end- 3C34389B03DF set_body3C2C47C7009D "font"
            }

            // -beg- preserve=no 362409A803C0 code3C2C47C7009D "subject"
            private java.util.Set subject = new java.util.HashSet();
            // -end- 362409A803C0 code3C2C47C7009D "subject"

            /** add a Subject.
             *  
             *  @see #removeSubject
             *  @see #containsSubject
             *  @see #iteratorSubject
             *  @see #clearSubject
             *  @see #sizeSubject
             */
            // -beg- preserve=no 362409A803C0 add_head3C2C47C7009D "PresentationElement::addSubject"
            public void addSubject(ModelElement subject1)
            // -end- 362409A803C0 add_head3C2C47C7009D "PresentationElement::addSubject"
            {
              // -beg- preserve=no 362409A803C0 add_body3C2C47C7009D "PresentationElement::addSubject"
              subject.add(subject1);
              subject1._linkPresentation(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addSubject"));
              return;
              // -end- 362409A803C0 add_body3C2C47C7009D "PresentationElement::addSubject"
            }

            /** disconnect a Subject.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 remove_head3C2C47C7009D "PresentationElement::removeSubject"
            public ModelElement removeSubject(ModelElement subject1)
            // -end- 362409A803C0 remove_head3C2C47C7009D "PresentationElement::removeSubject"
            {
              // -beg- preserve=no 362409A803C0 remove_body3C2C47C7009D "PresentationElement::removeSubject"
              ModelElement ret=null;
              if(subject1==null || !subject.contains(subject1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = subject1;
              subject.remove(subject1);
              subject1._unlinkPresentation(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removeSubject"));
              return ret;
              // -end- 362409A803C0 remove_body3C2C47C7009D "PresentationElement::removeSubject"
            }

            /** tests if a given Subject is connected.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 test_head3C2C47C7009D "PresentationElement::containsSubject"
            public boolean containsSubject(ModelElement subject1)
            // -end- 362409A803C0 test_head3C2C47C7009D "PresentationElement::containsSubject"
            {
              // -beg- preserve=no 362409A803C0 test_body3C2C47C7009D "PresentationElement::containsSubject"
              return subject.contains(subject1);
              // -end- 362409A803C0 test_body3C2C47C7009D "PresentationElement::containsSubject"
            }

            /** used to enumerate all connected Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 get_all_head3C2C47C7009D "PresentationElement::iteratorSubject"
            public java.util.Iterator iteratorSubject()
            // -end- 362409A803C0 get_all_head3C2C47C7009D "PresentationElement::iteratorSubject"
            {
              // -beg- preserve=no 362409A803C0 get_all_body3C2C47C7009D "PresentationElement::iteratorSubject"
              return subject.iterator();
              // -end- 362409A803C0 get_all_body3C2C47C7009D "PresentationElement::iteratorSubject"
            }

            /** disconnect all Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 remove_all_head3C2C47C7009D "PresentationElement::clearSubject"
            public void clearSubject()
            // -end- 362409A803C0 remove_all_head3C2C47C7009D "PresentationElement::clearSubject"
            {
              // -beg- preserve=no 362409A803C0 remove_all_body3C2C47C7009D "PresentationElement::clearSubject"
              if(sizeSubject()>0){
                for(java.util.Iterator p = subject.iterator(); p.hasNext();){
                  ((ModelElement)p.next())._unlinkPresentation(this);
                }
                subject.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearSubject"));
              }
              // -end- 362409A803C0 remove_all_body3C2C47C7009D "PresentationElement::clearSubject"
            }

            /** returns the number of Subjects.
             *  @see #addSubject
             */
            // -beg- preserve=no 362409A803C0 size_head3C2C47C7009D "PresentationElement::sizeSubject"
            public int sizeSubject()
            // -end- 362409A803C0 size_head3C2C47C7009D "PresentationElement::sizeSubject"
            {
              // -beg- preserve=no 362409A803C0 size_body3C2C47C7009D "PresentationElement::sizeSubject"
              return subject.size();
              // -end- 362409A803C0 size_body3C2C47C7009D "PresentationElement::sizeSubject"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A803C0 _link_body3C2C47C7009D "PresentationElement::_linkSubject"
            public void _linkSubject(ModelElement subject1)
            {
              subject.add(subject1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkSubject"));
              return;
            }
            // -end- 362409A803C0 _link_body3C2C47C7009D "PresentationElement::_linkSubject"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 362409A803C0 _unlink_body3C2C47C7009D "PresentationElement::_unlinkSubject"
            public void _unlinkSubject(ModelElement subject1)
            {
              subject.remove(subject1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkSubject"));
              return;
            }
            // -end- 362409A803C0 _unlink_body3C2C47C7009D "PresentationElement::_unlinkSubject"

            // -beg- preserve=no 3C2C4C9F0169 code3C2C47C7009D "diagram"
            private Diagram diagram;
            // -end- 3C2C4C9F0169 code3C2C47C7009D "diagram"

            /** attaches a Diagram.
             *  
             *  @see #detachDiagram
             *  @see #getDiagram
             *  @see #containsDiagram
             */
            // -beg- preserve=no 3C2C4C9F0169 attach_head3C2C47C7009D "PresentationElement::attachDiagram"
            public void attachDiagram(Diagram diagram1)
            // -end- 3C2C4C9F0169 attach_head3C2C47C7009D "PresentationElement::attachDiagram"
            {
              // -beg- preserve=no 3C2C4C9F0169 attach_body3C2C47C7009D "PresentationElement::attachDiagram"
              if(diagram!=null) {throw new java.lang.IllegalStateException("already a diagram attached");}
              if(diagram1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as diagram");}
              diagram = diagram1;
              diagram1._linkPresentationElement(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachDiagram"));
              return;
              // -end- 3C2C4C9F0169 attach_body3C2C47C7009D "PresentationElement::attachDiagram"
            }

            /** disconnect the currently attached Diagram.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C2C4C9F0169 detach_head3C2C47C7009D "PresentationElement::detachDiagram"
            public Diagram detachDiagram()
            // -end- 3C2C4C9F0169 detach_head3C2C47C7009D "PresentationElement::detachDiagram"
            {
              // -beg- preserve=no 3C2C4C9F0169 detach_body3C2C47C7009D "PresentationElement::detachDiagram"
              Diagram ret = null;
              if(diagram!=null){
                diagram._unlinkPresentationElement(this);
                ret = diagram;
                diagram = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachDiagram"));
              return ret;
              // -end- 3C2C4C9F0169 detach_body3C2C47C7009D "PresentationElement::detachDiagram"
            }

            /** get the currently attached Diagram.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C2C4C9F0169 get_head3C2C47C7009D "PresentationElement::getDiagram"
            public Diagram getDiagram()
            // -end- 3C2C4C9F0169 get_head3C2C47C7009D "PresentationElement::getDiagram"
            {
              // -beg- preserve=no 3C2C4C9F0169 get_body3C2C47C7009D "PresentationElement::getDiagram"
              if(diagram==null) {throw new java.lang.IllegalStateException("no diagram attached");}
              return diagram;
              // -end- 3C2C4C9F0169 get_body3C2C47C7009D "PresentationElement::getDiagram"
            }

            /** tests if there is a Diagram attached.
             *  @see #attachDiagram
             */
            // -beg- preserve=no 3C2C4C9F0169 test_head3C2C47C7009D "PresentationElement::containsDiagram"
            public boolean containsDiagram()
            // -end- 3C2C4C9F0169 test_head3C2C47C7009D "PresentationElement::containsDiagram"
            {
              // -beg- preserve=no 3C2C4C9F0169 test_body3C2C47C7009D "PresentationElement::containsDiagram"
              return diagram!=null;
              // -end- 3C2C4C9F0169 test_body3C2C47C7009D "PresentationElement::containsDiagram"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C4C9F0169 _link_body3C2C47C7009D "PresentationElement::_linkDiagram"
            public void _linkDiagram(Diagram diagram1)
            {
              diagram = diagram1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkDiagram"));
              return;
            }
            // -end- 3C2C4C9F0169 _link_body3C2C47C7009D "PresentationElement::_linkDiagram"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C4C9F0169 _unlink_body3C2C47C7009D "PresentationElement::_unlinkDiagram"
            public void _unlinkDiagram(Diagram diagram1)
            {
              diagram = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkDiagram"));
              return;
            }
            // -end- 3C2C4C9F0169 _unlink_body3C2C47C7009D "PresentationElement::_unlinkDiagram"

            // -beg- preserve=no 3C2C49E3019E code3C2C47C7009D "presentationEdge"
            private java.util.Set presentationEdge = new java.util.HashSet();
            // -end- 3C2C49E3019E code3C2C47C7009D "presentationEdge"

            /** add a PresentationEdge.
             *  
             *  @see #removePresentationEdge
             *  @see #containsPresentationEdge
             *  @see #iteratorPresentationEdge
             *  @see #clearPresentationEdge
             *  @see #sizePresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E add_head3C2C47C7009D "PresentationElement::addPresentationEdge"
            public void addPresentationEdge(PresentationEdge presentationEdge1)
            // -end- 3C2C49E3019E add_head3C2C47C7009D "PresentationElement::addPresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E add_body3C2C47C7009D "PresentationElement::addPresentationEdge"
              presentationEdge.add(presentationEdge1);
              presentationEdge1._linkEndpoint(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"addPresentationEdge"));
              return;
              // -end- 3C2C49E3019E add_body3C2C47C7009D "PresentationElement::addPresentationEdge"
            }

            /** disconnect a PresentationEdge.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E remove_head3C2C47C7009D "PresentationElement::removePresentationEdge"
            public PresentationEdge removePresentationEdge(PresentationEdge presentationEdge1)
            // -end- 3C2C49E3019E remove_head3C2C47C7009D "PresentationElement::removePresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E remove_body3C2C47C7009D "PresentationElement::removePresentationEdge"
              PresentationEdge ret=null;
              if(presentationEdge1==null || !presentationEdge.contains(presentationEdge1)){
                throw new java.lang.IllegalArgumentException("cannot remove null or unknown object");
              }
              ret = presentationEdge1;
              presentationEdge.remove(presentationEdge1);
              presentationEdge1._unlinkEndpoint(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"removePresentationEdge"));
              return ret;
              // -end- 3C2C49E3019E remove_body3C2C47C7009D "PresentationElement::removePresentationEdge"
            }

            /** tests if a given PresentationEdge is connected.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E test_head3C2C47C7009D "PresentationElement::containsPresentationEdge"
            public boolean containsPresentationEdge(PresentationEdge presentationEdge1)
            // -end- 3C2C49E3019E test_head3C2C47C7009D "PresentationElement::containsPresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E test_body3C2C47C7009D "PresentationElement::containsPresentationEdge"
              return presentationEdge.contains(presentationEdge1);
              // -end- 3C2C49E3019E test_body3C2C47C7009D "PresentationElement::containsPresentationEdge"
            }

            /** used to enumerate all connected PresentationEdges.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E get_all_head3C2C47C7009D "PresentationElement::iteratorPresentationEdge"
            public java.util.Iterator iteratorPresentationEdge()
            // -end- 3C2C49E3019E get_all_head3C2C47C7009D "PresentationElement::iteratorPresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E get_all_body3C2C47C7009D "PresentationElement::iteratorPresentationEdge"
              return presentationEdge.iterator();
              // -end- 3C2C49E3019E get_all_body3C2C47C7009D "PresentationElement::iteratorPresentationEdge"
            }

            /** disconnect all PresentationEdges.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E remove_all_head3C2C47C7009D "PresentationElement::clearPresentationEdge"
            public void clearPresentationEdge()
            // -end- 3C2C49E3019E remove_all_head3C2C47C7009D "PresentationElement::clearPresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E remove_all_body3C2C47C7009D "PresentationElement::clearPresentationEdge"
              if(sizePresentationEdge()>0){
                for(java.util.Iterator p = presentationEdge.iterator(); p.hasNext();){
                  ((PresentationEdge)p.next())._unlinkEndpoint(this);
                }
                presentationEdge.clear();
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"clearPresentationEdge"));
              }
              // -end- 3C2C49E3019E remove_all_body3C2C47C7009D "PresentationElement::clearPresentationEdge"
            }

            /** returns the number of PresentationEdges.
             *  @see #addPresentationEdge
             */
            // -beg- preserve=no 3C2C49E3019E size_head3C2C47C7009D "PresentationElement::sizePresentationEdge"
            public int sizePresentationEdge()
            // -end- 3C2C49E3019E size_head3C2C47C7009D "PresentationElement::sizePresentationEdge"
            {
              // -beg- preserve=no 3C2C49E3019E size_body3C2C47C7009D "PresentationElement::sizePresentationEdge"
              return presentationEdge.size();
              // -end- 3C2C49E3019E size_body3C2C47C7009D "PresentationElement::sizePresentationEdge"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C49E3019E _link_body3C2C47C7009D "PresentationElement::_linkPresentationEdge"
            public void _linkPresentationEdge(PresentationEdge presentationEdge1)
            {
              presentationEdge.add(presentationEdge1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkPresentationEdge"));
              return;
            }
            // -end- 3C2C49E3019E _link_body3C2C47C7009D "PresentationElement::_linkPresentationEdge"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3C2C49E3019E _unlink_body3C2C47C7009D "PresentationElement::_unlinkPresentationEdge"
            public void _unlinkPresentationEdge(PresentationEdge presentationEdge1)
            {
              presentationEdge.remove(presentationEdge1);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkPresentationEdge"));
              return;
            }
            // -end- 3C2C49E3019E _unlink_body3C2C47C7009D "PresentationElement::_unlinkPresentationEdge"

            // -beg- preserve=no 3C1DF92B0234 var3C2C47C7009D "documentation"
            private NlsString documentation = null;
            // -end- 3C1DF92B0234 var3C2C47C7009D "documentation"

            /** get current value of documentation
             *  @see #setDocumentation
             */
            // -beg- preserve=no 3C1DF92B0234 get_head3C2C47C7009D "documentation"
            public  NlsString getDocumentation()
            // -end- 3C1DF92B0234 get_head3C2C47C7009D "documentation"
            {
              // -beg- preserve=no 3C1DF92B0234 get_body3C2C47C7009D "documentation"
              return documentation;
              // -end- 3C1DF92B0234 get_body3C2C47C7009D "documentation"
            }

            /** set current value of documentation
             *  @see #getDocumentation
             */
            // -beg- preserve=no 3C1DF92B0234 set_head3C2C47C7009D "documentation"
            public  void setDocumentation(NlsString value1)
            // -end- 3C1DF92B0234 set_head3C2C47C7009D "documentation"
            {
              // -beg- preserve=no 3C1DF92B0234 set_body3C2C47C7009D "documentation"
              if(documentation!=value1 && (documentation==null || !documentation.equals(value1))){
                documentation = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setDocumentation"));
              }
              // -end- 3C1DF92B0234 set_body3C2C47C7009D "documentation"
            }
            
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

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3C2C47C7009D detail_end "PresentationEdge"

            // -end- 3C2C47C7009D detail_end "PresentationEdge"

          }

