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


          // -beg- preserve=no 3D47AB4300A6 package "PresentationAssocClass"
package ch.ehi.umleditor.umlpresentation;
          // -end- 3D47AB4300A6 package "PresentationAssocClass"

          // -beg- preserve=no 3D47AB4300A6 autoimport "PresentationAssocClass"
          import ch.ehi.umleditor.umlpresentation.PresentationAbstractClass;
          import ch.ehi.umleditor.umlpresentation.Association;
          import ch.ehi.basics.tools.AbstractVisitor;
          // -end- 3D47AB4300A6 autoimport "PresentationAssocClass"
import ch.ehi.basics.types.NlsString;

          // import declarations
          // please fill in/modify the following section
          // -beg- preserve=no 3D47AB4300A6 import "PresentationAssocClass"

          // -end- 3D47AB4300A6 import "PresentationAssocClass"

          /** only required if association contains attributes
           *  @author Claude Eisenhut
           *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:41:16 $
           */
public class PresentationAssocClass extends PresentationAbstractClass
          {
            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=no 3D47AB4300A6 detail_begin "PresentationAssocClass"

            // -end- 3D47AB4300A6 detail_begin "PresentationAssocClass"

            // -beg- preserve=no 3D4FA217034F head3D47AB4300A6 "unlinkAll"
            public void unlinkAll()
            // -end- 3D4FA217034F head3D47AB4300A6 "unlinkAll"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA217034F throws3D47AB4300A6 "unlinkAll"

              // -end- 3D4FA217034F throws3D47AB4300A6 "unlinkAll"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA217034F body3D47AB4300A6 "unlinkAll"
              
              detachAssociation();
              super.unlinkAll();
              // -end- 3D4FA217034F body3D47AB4300A6 "unlinkAll"
              }

            // -beg- preserve=no 3D4FA2170350 head3D47AB4300A6 "enumerateChildren"
            public void enumerateChildren(AbstractVisitor visitor)
            // -end- 3D4FA2170350 head3D47AB4300A6 "enumerateChildren"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170350 throws3D47AB4300A6 "enumerateChildren"

              // -end- 3D4FA2170350 throws3D47AB4300A6 "enumerateChildren"
              {
              // please fill in/modify the following section
              // -beg- preserve=no 3D4FA2170350 body3D47AB4300A6 "enumerateChildren"
              java.util.Iterator it=null;
              super.enumerateChildren(visitor);
              // -end- 3D4FA2170350 body3D47AB4300A6 "enumerateChildren"
              }

            // -beg- preserve=no 3D47ACA5002D head3D47AB4300A6 "isMoveable"
            public boolean isMoveable()
            // -end- 3D47ACA5002D head3D47AB4300A6 "isMoveable"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D47ACA5002D throws3D47AB4300A6 "isMoveable"

              // -end- 3D47ACA5002D throws3D47AB4300A6 "isMoveable"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D47ACA5002D body3D47AB4300A6 "isMoveable"
    return getAssociation().isLinkMoveable();
              // -end- 3D47ACA5002D body3D47AB4300A6 "isMoveable"
              }

            /** returns true if no class figure should be shown
             */
            // -beg- preserve=no 3D53E0DC0011 head3D47AB4300A6 "isLinkWithoutClass"
            public boolean isLinkWithoutClass()
            // -end- 3D53E0DC0011 head3D47AB4300A6 "isLinkWithoutClass"
              // declare any checked exceptions
              // please fill in/modify the following section
              // -beg- preserve=no 3D53E0DC0011 throws3D47AB4300A6 "isLinkWithoutClass"

              // -end- 3D53E0DC0011 throws3D47AB4300A6 "isLinkWithoutClass"
              {
              // please fill in/modify the following section
              // -beg- preserve=yes 3D53E0DC0011 body3D47AB4300A6 "isLinkWithoutClass"
    return !getAssociation().isAssocClassVisible();
              // -end- 3D53E0DC0011 body3D47AB4300A6 "isLinkWithoutClass"
              }

            // -beg- preserve=no 3D4658500348 code3D47AB4300A6 "association"
            private Association association;
            // -end- 3D4658500348 code3D47AB4300A6 "association"

            /** attaches a Association.
             *  
             *  @see #detachAssociation
             *  @see #getAssociation
             *  @see #containsAssociation
             */
            // -beg- preserve=no 3D4658500348 attach_head3D47AB4300A6 "PresentationAssocClass::attachAssociation"
            public void attachAssociation(Association association1)
            // -end- 3D4658500348 attach_head3D47AB4300A6 "PresentationAssocClass::attachAssociation"
            {
              // -beg- preserve=no 3D4658500348 attach_body3D47AB4300A6 "PresentationAssocClass::attachAssociation"
              if(association!=null) {throw new java.lang.IllegalStateException("already a association attached");}
              if(association1==null) {throw new java.lang.IllegalArgumentException("null may not be attached as association");}
              association = association1;
              association1._linkLinkPresentation(this);
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"attachAssociation"));
              return;
              // -end- 3D4658500348 attach_body3D47AB4300A6 "PresentationAssocClass::attachAssociation"
            }

            /** disconnect the currently attached Association.
             *  @see #attachAssociation
             */
            // -beg- preserve=no 3D4658500348 detach_head3D47AB4300A6 "PresentationAssocClass::detachAssociation"
            public Association detachAssociation()
            // -end- 3D4658500348 detach_head3D47AB4300A6 "PresentationAssocClass::detachAssociation"
            {
              // -beg- preserve=no 3D4658500348 detach_body3D47AB4300A6 "PresentationAssocClass::detachAssociation"
              Association ret = null;
              if(association!=null){
                association._unlinkLinkPresentation(this);
                ret = association;
                association = null;
              }
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"detachAssociation"));
              return ret;
              // -end- 3D4658500348 detach_body3D47AB4300A6 "PresentationAssocClass::detachAssociation"
            }

            /** get the currently attached Association.
             *  @see #attachAssociation
             */
            // -beg- preserve=no 3D4658500348 get_head3D47AB4300A6 "PresentationAssocClass::getAssociation"
            public Association getAssociation()
            // -end- 3D4658500348 get_head3D47AB4300A6 "PresentationAssocClass::getAssociation"
            {
              // -beg- preserve=no 3D4658500348 get_body3D47AB4300A6 "PresentationAssocClass::getAssociation"
              if(association==null) {throw new java.lang.IllegalStateException("no association attached");}
              return association;
              // -end- 3D4658500348 get_body3D47AB4300A6 "PresentationAssocClass::getAssociation"
            }

            /** tests if there is a Association attached.
             *  @see #attachAssociation
             */
            // -beg- preserve=no 3D4658500348 test_head3D47AB4300A6 "PresentationAssocClass::containsAssociation"
            public boolean containsAssociation()
            // -end- 3D4658500348 test_head3D47AB4300A6 "PresentationAssocClass::containsAssociation"
            {
              // -beg- preserve=no 3D4658500348 test_body3D47AB4300A6 "PresentationAssocClass::containsAssociation"
              return association!=null;
              // -end- 3D4658500348 test_body3D47AB4300A6 "PresentationAssocClass::containsAssociation"
            }

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3D4658500348 _link_body3D47AB4300A6 "PresentationAssocClass::_linkAssociation"
            public void _linkAssociation(Association association1)
            {
              association = association1;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_linkAssociation"));
              return;
            }
            // -end- 3D4658500348 _link_body3D47AB4300A6 "PresentationAssocClass::_linkAssociation"

            /** DONT USE; link management internal
             */
            // -beg- preserve=no 3D4658500348 _unlink_body3D47AB4300A6 "PresentationAssocClass::_unlinkAssociation"
            public void _unlinkAssociation(Association association1)
            {
              association = null;
              ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"_unlinkAssociation"));
              return;
            }
            // -end- 3D4658500348 _unlink_body3D47AB4300A6 "PresentationAssocClass::_unlinkAssociation"

            // -beg- preserve=no 3D53E03900D5 var3D47AB4300A6 "classAngle"
            private double classAngle;
            // -end- 3D53E03900D5 var3D47AB4300A6 "classAngle"

            /** get current value of classAngle
             *  together with classRadius the relative position of the class figure
             *  @see #setClassAngle
             */
            // -beg- preserve=no 3D53E03900D5 get_head3D47AB4300A6 "classAngle"
            public  double getClassAngle()
            // -end- 3D53E03900D5 get_head3D47AB4300A6 "classAngle"
            {
              // -beg- preserve=no 3D53E03900D5 get_body3D47AB4300A6 "classAngle"
              return classAngle;
              // -end- 3D53E03900D5 get_body3D47AB4300A6 "classAngle"
            }

            /** set current value of classAngle
             *  @see #getClassAngle
             */
            // -beg- preserve=no 3D53E03900D5 set_head3D47AB4300A6 "classAngle"
            public  void setClassAngle(double value1)
            // -end- 3D53E03900D5 set_head3D47AB4300A6 "classAngle"
            {
              // -beg- preserve=no 3D53E03900D5 set_body3D47AB4300A6 "classAngle"
              if(classAngle != value1){
                classAngle = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setClassAngle"));
              }
              // -end- 3D53E03900D5 set_body3D47AB4300A6 "classAngle"
            }

            // -beg- preserve=no 3D53E0420038 var3D47AB4300A6 "classRadius"
            private double classRadius;
            // -end- 3D53E0420038 var3D47AB4300A6 "classRadius"

            /** get current value of classRadius
             *  together with classAngle the relative position of the class figure
             *  @see #setClassRadius
             */
            // -beg- preserve=no 3D53E0420038 get_head3D47AB4300A6 "classRadius"
            public  double getClassRadius()
            // -end- 3D53E0420038 get_head3D47AB4300A6 "classRadius"
            {
              // -beg- preserve=no 3D53E0420038 get_body3D47AB4300A6 "classRadius"
              return classRadius;
              // -end- 3D53E0420038 get_body3D47AB4300A6 "classRadius"
            }

            /** set current value of classRadius
             *  @see #getClassRadius
             */
            // -beg- preserve=no 3D53E0420038 set_head3D47AB4300A6 "classRadius"
            public  void setClassRadius(double value1)
            // -end- 3D53E0420038 set_head3D47AB4300A6 "classRadius"
            {
              // -beg- preserve=no 3D53E0420038 set_body3D47AB4300A6 "classRadius"
              if(classRadius != value1){
                classRadius = value1;
                ch.ehi.uml1_4.changepropagation.MetaModel.getInstance().notifyChange(new ch.ehi.uml1_4.changepropagation.MetaModelChange(this,"setClassRadius"));
              }
              // -end- 3D53E0420038 set_body3D47AB4300A6 "classRadius"
            }

            // -beg- preserve=no 3D59081A01AF var3D47AB4300A6 "east"

            // -end- 3D59081A01AF var3D47AB4300A6 "east"

            /** get current value of east
             *  @see #setEast
             */
            // -beg- preserve=no 3D59081A01AF get_head3D47AB4300A6 "east"
            public  int getEast()
            // -end- 3D59081A01AF get_head3D47AB4300A6 "east"
            {
              // -beg- preserve=yes 3D59081A01AF get_body3D47AB4300A6 "east"
    if(isMoveable()){
      return super.getEast();
    }
    if(containsAssociation()){
      Association assoc=getAssociation();
      java.util.Iterator rolei=assoc.iteratorRolePresentation();
      if(!rolei.hasNext())return super.getEast();
      PresentationRole role1=(PresentationRole)rolei.next();
      if(!rolei.hasNext())return super.getEast();
      PresentationRole role2=(PresentationRole)rolei.next();
      java.awt.Rectangle start=getPoint(role1);
      if(start==null)return super.getEast();
      java.awt.Rectangle end=getPoint(role2);
      if(end==null)return super.getEast();
      java.awt.Point startCenter=getCenter(start);
      java.awt.Point endCenter=getCenter(end);
      int ret;
      /*
          ret=((int)startCenter.getX() + (int)endCenter.getX())/2;
          return ret;
      */
      if(startCenter.getX()==endCenter.getX()){
        ret=(int)startCenter.getX();
      }else{
          if(startCenter.getX()>endCenter.getX()){
            // swap start and end
            java.awt.Rectangle mr=start;
            start=end;
            end=mr;
            java.awt.Point mp=startCenter;
            startCenter=endCenter;
            endCenter=mp;
          }
          double m=(endCenter.getY()-startCenter.getY())/(endCenter.getX()-startCenter.getX());
          double startX;
          if(start.getWidth()==0){
            startX=start.getX();
          }else{
            double mStart=start.getHeight()/start.getWidth();
            if(Math.abs(m)>mStart){
              // connection crosses horziontal line of start class
              startX=startCenter.getX()+start.getHeight()/2/Math.abs(m);
            }else{
              // connection crosses vertical line of start class
              startX=start.getX()+start.getWidth();
            }
          }
          double endX;
          if(end.getWidth()==0){
            endX=end.getX();
          }else{
            double mEnd=end.getHeight()/end.getWidth();
            if(Math.abs(m)>mEnd){
              // connection crosses horziontal line of end class
              endX=endCenter.getX()-end.getHeight()/2/Math.abs(m);
            }else{
              // connection crosses vertical line of end class
              endX=end.getX();
            }
          }
          ret=((int)startX + (int)endX)/2;
      }
      //System.out.println("east "+ret);
      // keep calculated position, incase link toggles to moveable
      super.setEast(ret);
      return ret;
    }
    return super.getEast();
              // -end- 3D59081A01AF get_body3D47AB4300A6 "east"
            }

            /** set current value of east
             *  @see #getEast
             */
            // -beg- preserve=no 3D59081A01AF set_head3D47AB4300A6 "east"
            public  void setEast(int value1)
            // -end- 3D59081A01AF set_head3D47AB4300A6 "east"
            {
              // -beg- preserve=no 3D59081A01AF set_body3D47AB4300A6 "east"
              super.setEast(value1);
              // -end- 3D59081A01AF set_body3D47AB4300A6 "east"
            }

            // -beg- preserve=no 3D5908240236 var3D47AB4300A6 "south"

            // -end- 3D5908240236 var3D47AB4300A6 "south"

            /** get current value of south
             *  @see #setSouth
             */
            // -beg- preserve=no 3D5908240236 get_head3D47AB4300A6 "south"
            public  int getSouth()
            // -end- 3D5908240236 get_head3D47AB4300A6 "south"
            {
              // -beg- preserve=yes 3D5908240236 get_body3D47AB4300A6 "south"
    if(isMoveable()){
      return super.getSouth();
    }
    if(containsAssociation()){
      Association assoc=getAssociation();
      java.util.Iterator rolei=assoc.iteratorRolePresentation();
      if(!rolei.hasNext())return super.getSouth();
      PresentationRole role1=(PresentationRole)rolei.next();
      if(!rolei.hasNext())return super.getSouth();
      PresentationRole role2=(PresentationRole)rolei.next();
      java.awt.Rectangle start=getPoint(role1);
      if(start==null)return super.getSouth();
      java.awt.Rectangle end=getPoint(role2);
      if(end==null)return super.getSouth();
      java.awt.Point startCenter=getCenter(start);
      java.awt.Point endCenter=getCenter(end);
      int ret;
      /*
          ret=((int)startCenter.getY() + (int)endCenter.getY())/2;
          return ret;
      */
      if(startCenter.getY()==endCenter.getY()){
        ret=(int)startCenter.getY();
      }else{
          if(startCenter.getY()>endCenter.getY()){
            // swap start and end
            java.awt.Rectangle mr=start;
            start=end;
            end=mr;
            java.awt.Point mp=startCenter;
            startCenter=endCenter;
            endCenter=mp;
          }
          double m=(endCenter.getX()-startCenter.getX())/(endCenter.getY()-startCenter.getY());
          double startY;
          if(start.getHeight()==0){
            startY=start.getY();
          }else{
            double mStart=start.getWidth()/start.getHeight();
            if(Math.abs(m)>mStart){
              // connection crosses horziontal line of start class
              startY=startCenter.getY()+start.getWidth()/2/Math.abs(m);
            }else{
              // connection crosses vertical line of start class
              startY=start.getY()+start.getHeight();
            }
          }
          double endY;
          if(end.getHeight()==0){
            endY=end.getY();
          }else{
            double mEnd=end.getWidth()/end.getHeight();
            if(Math.abs(m)>mEnd){
              // connection crosses horziontal line of end class
              endY=endCenter.getY()-end.getWidth()/2/Math.abs(m);
            }else{
              // connection crosses vertical line of end class
              endY=end.getY();
            }
          }
          ret=((int)startY + (int)endY)/2;
      }
      // keep calculated position, incase link toggles to moveable
      super.setSouth(ret);
      return ret;
    }
    return super.getSouth();
              // -end- 3D5908240236 get_body3D47AB4300A6 "south"
            }

            /** set current value of south
             *  @see #getSouth
             */
            // -beg- preserve=no 3D5908240236 set_head3D47AB4300A6 "south"
            public  void setSouth(int value1)
            // -end- 3D5908240236 set_head3D47AB4300A6 "south"
            {
              // -beg- preserve=no 3D5908240236 set_body3D47AB4300A6 "south"
              super.setSouth(value1);
              // -end- 3D5908240236 set_body3D47AB4300A6 "south"
            }

            // declare/define something only in the code
            // please fill in/modify the following section
            // -beg- preserve=yes 3D47AB4300A6 detail_end "PresentationAssocClass"
  /** get end position (logical nearest by this) of the given role
   *
   */
  private java.awt.Rectangle getPoint(PresentationRole role)
  {
    PresentationNode node=null;
    java.util.Iterator ep=role.iteratorEndpoint();
    if(ep.hasNext()){
      node=(PresentationNode)ep.next();
      // endpoint attached to this (AssociationDef)
      if(node==this && ep.hasNext()){
        // find other endpoint
        node=(PresentationNode)ep.next();
        // has edge waypoints?
        if(role.sizeWayPoint()>0){
          // use first way point
          java.util.Iterator wpi=role.iteratorWayPoint();
          WayPoint wp=(WayPoint)wpi.next();
          return new java.awt.Rectangle(wp.getEast(),wp.getSouth(),0,0);
        }
      }else{
        // endpoint attached to Class (ClassDef)
        // has edge waypoints?
        if(role.sizeWayPoint()>0){
          // use last way point
          java.util.Iterator wpi=role.iteratorWayPoint();
          WayPoint wp=(WayPoint)wpi.next();
          while(wpi.hasNext()){
            wp=(WayPoint)wpi.next();
          }
          return new java.awt.Rectangle(wp.getEast(),wp.getSouth(),0,0);
        }
      }
    }
    if(node!=null){
      int nodeEast=node.getEast();
      int nodeSouth=node.getSouth();
      if(node instanceof PresentationAssocClass){
        nodeEast=(int)((PresentationAssocClass)node).getClassAngle();
        nodeSouth=(int)((PresentationAssocClass)node).getClassRadius();
      }
      return new java.awt.Rectangle(nodeEast,nodeSouth,node.getWidth(),node.getHeight());
    }
    return null;
  }
  /** get center of a rectangle
   *
   */
  private java.awt.Point getCenter(java.awt.Rectangle rect)
  {
    return new java.awt.Point((int)rect.getX()+(int)(rect.getWidth()/2.0),(int)rect.getY()+(int)(rect.getHeight()/2.0));
  }
            // -end- 3D47AB4300A6 detail_end "PresentationAssocClass"

@Override
public NlsString getDispName() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setDispName(NlsString value) {
	// TODO Auto-generated method stub
	
}

          }

