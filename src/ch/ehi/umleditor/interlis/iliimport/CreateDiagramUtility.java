// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:40:29 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3CD8E2DF0062 package "CreateDiagramUtility"
package ch.ehi.umleditor.interlis.iliimport;
// -end- 3CD8E2DF0062 package "CreateDiagramUtility"

// -beg- preserve=no 3CD8E2DF0062 autoimport "CreateDiagramUtility"
import ch.ehi.interlis.modeltopicclass.ModelDef;
// -end- 3CD8E2DF0062 autoimport "CreateDiagramUtility"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CD8E2DF0062 import "CreateDiagramUtility"
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.umleditor.format.Layout;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.basics.types.NlsString;
// -end- 3CD8E2DF0062 import "CreateDiagramUtility"

public class CreateDiagramUtility
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CD8E2DF0062 detail_begin "CreateDiagramUtility"
  static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(CreateDiagramUtility.class);

  // -end- 3CD8E2DF0062 detail_begin "CreateDiagramUtility"

  // -beg- preserve=no 3CD8E2F600DD head3CD8E2DF0062 "topicOverview"
  public static void topicOverview(ModelDef model)
  // -end- 3CD8E2F600DD head3CD8E2DF0062 "topicOverview"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CD8E2F600DD throws3CD8E2DF0062 "topicOverview"

    // -end- 3CD8E2F600DD throws3CD8E2DF0062 "topicOverview"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CD8E2F600DD body3CD8E2DF0062 "topicOverview"
    java.util.Vector edgev=new java.util.Vector(30);
    java.util.Vector nodev=new java.util.Vector(30);
    // create diagram
    Diagram diag=new Diagram();
    diag.setName(new NlsString(rsrc.getString("CTdiagTopics")));
    model.addDiagram(diag);
    // add topics to diagram
    int e=0;
    int s=0;
    java.util.Map topicv=new java.util.HashMap();
    java.util.Iterator topici=model.iteratorOwnedElement();
    while(topici.hasNext()){
      Object obj=topici.next();
      if(!(obj instanceof TopicDef)){
        continue;
      }
      TopicDef topic=(TopicDef)obj;
      ch.ehi.umleditor.umlpresentation.Package topicFig=new ch.ehi.umleditor.umlpresentation.Package();
      topicFig.setEast(e);e+=10;
      topicFig.setSouth(s);s+=10;
      //topicFig.setBackground(createDefaultBackground());
      //topicFig.setForeground(createDefaultForeground());
      topicFig.addSubject(topic);
      diag.addPresentationElement(topicFig);
      // add mapping entry from TopicDef to Figure
      topicv.put(topic,topicFig);
      nodev.add(topicFig);
    }
    // handle DEPENDS, EXTENDS
    topici=model.iteratorOwnedElement();
    while(topici.hasNext()){
      Object obj=topici.next();
      if(!(obj instanceof TopicDef)){
        continue;
      }
      TopicDef topic=(TopicDef)obj;
      java.util.Iterator dependsi=topic.iteratorClientDependency();
      while(dependsi.hasNext()){
        Object objD=dependsi.next();
        if(!(objD instanceof ch.ehi.interlis.modeltopicclass.TopicDepends)){
          continue;
        }
        ch.ehi.interlis.modeltopicclass.TopicDepends depends=(ch.ehi.interlis.modeltopicclass.TopicDepends)objD;
        java.util.Iterator supplieri=depends.iteratorSupplier();
        if(supplieri.hasNext()){
          TopicDef supplier=(TopicDef)supplieri.next();
          // supplier also on this Diagram?
          if(topicv.containsKey(supplier)){
            // add relationship
            ch.ehi.umleditor.umlpresentation.Dependency dependsFig=new ch.ehi.umleditor.umlpresentation.Dependency();
            dependsFig.addEndpoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(topic));
            dependsFig.addEndpoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(supplier));
            //dependsFig.setBackground(createDefaultBackground());
            //dependsFig.setForeground(createDefaultForeground());
            //dependsFig.addWayPoint(createWayPoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(topic)));
            //dependsFig.addWayPoint(createWayPoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(supplier)));

            dependsFig.addSubject(depends);
            diag.addPresentationElement(dependsFig);
            edgev.add(dependsFig);
          }
        }
      }
      java.util.Iterator extendsi=topic.iteratorGeneralization();
      while(extendsi.hasNext()){
        Object objD=extendsi.next();
        if(!(objD instanceof ch.ehi.interlis.modeltopicclass.TopicExtends)){
          continue;
        }
        ch.ehi.interlis.modeltopicclass.TopicExtends extend=(ch.ehi.interlis.modeltopicclass.TopicExtends)objD;
        if(extend.containsParent()){
          TopicDef supplier=(TopicDef)extend.getParent();
          // supplier also on this Diagram?
          if(topicv.containsKey(supplier)){
            // add relationship
            ch.ehi.umleditor.umlpresentation.Generalization genFig=new ch.ehi.umleditor.umlpresentation.Generalization();
            genFig.addEndpoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(topic));
            genFig.addEndpoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(supplier));
            //genFig.setBackground(createDefaultBackground());
            //genFig.setForeground(createDefaultForeground());
            //genFig.addWayPoint(createWayPoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(topic)));
            //genFig.addWayPoint(createWayPoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(supplier)));

            genFig.addSubject(extend);
            diag.addPresentationElement(genFig);
            edgev.add(genFig);
          }
        }
      }
    }
    // layout topics
    Layout.layout(nodev,edgev,0,0
          ,ch.ehi.umleditor.application.LauncherView.getInstance().getSettings().getDiagramWidth().intValue()
          ,ch.ehi.umleditor.application.LauncherView.getInstance().getSettings().getDiagramHeight().intValue()
      );
    return;
    // -end- 3CD8E2F600DD body3CD8E2DF0062 "topicOverview"
    }

  // -beg- preserve=no 3CDBB82502CB head3CD8E2DF0062 "classes"
  public static void classes(Package apackage)
  // -end- 3CDBB82502CB head3CD8E2DF0062 "classes"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CDBB82502CB throws3CD8E2DF0062 "classes"

    // -end- 3CDBB82502CB throws3CD8E2DF0062 "classes"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CDBB82502CB body3CD8E2DF0062 "classes"
    java.util.Vector edgev=new java.util.Vector(30);
    java.util.Vector nodev=new java.util.Vector(30);
    // create diagram
    Diagram diag=new Diagram();
    diag.setName(new NlsString(rsrc.getString("CTdiagClasses")));
    apackage.addDiagram(diag);
    //
    // add ClassDefs to diagram
    //
    int e=0;
    int s=0;
    java.util.Map classv=new java.util.HashMap();
    java.util.Iterator classi=apackage.iteratorOwnedElement();
    while(classi.hasNext()){
      Object obj=classi.next();
      if(!(obj instanceof ClassDef)){
        continue;
      }
      if(obj instanceof ch.ehi.uml1_4.foundation.core.Association){
        continue;
      }
      ClassDef aclass=(ClassDef)obj;
      ch.ehi.umleditor.umlpresentation.Class classFig=new ch.ehi.umleditor.umlpresentation.Class();
      classFig.setEast(e);e+=10;
      classFig.setSouth(s);s+=10;
      classFig.addSubject(aclass);
      diag.addPresentationElement(classFig);
      // add mapping entry from TopicDef to Figure
      classv.put(aclass,classFig);
      nodev.add(classFig);
    }
    // handle EXTENDS
    classi=apackage.iteratorOwnedElement();
    while(classi.hasNext()){
      Object obj=classi.next();
      if(!(obj instanceof ClassDef)){
        continue;
      }
      if(obj instanceof ch.ehi.uml1_4.foundation.core.Association){
        continue;
      }
      ClassDef aclass=(ClassDef)obj;
      java.util.Iterator extendsi=aclass.iteratorGeneralization();
      while(extendsi.hasNext()){
        Object objD=extendsi.next();
        if(!(objD instanceof ch.ehi.interlis.modeltopicclass.ClassExtends)){
          continue;
        }
        ch.ehi.interlis.modeltopicclass.ClassExtends extend=(ch.ehi.interlis.modeltopicclass.ClassExtends)objD;
        if(extend.containsParent()){
          ClassDef supplier=(ClassDef)extend.getParent();
          // supplier also on this Diagram?
          if(classv.containsKey(supplier)){
            // add relationship
            ch.ehi.umleditor.umlpresentation.Generalization genFig=new ch.ehi.umleditor.umlpresentation.Generalization();
            genFig.addEndpoint((ch.ehi.umleditor.umlpresentation.Class)classv.get(aclass));
            genFig.addEndpoint((ch.ehi.umleditor.umlpresentation.Class)classv.get(supplier));
            //genFig.setBackground(createDefaultBackground());
            //genFig.setForeground(createDefaultForeground());
            //genFig.addWayPoint(createWayPoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(topic)));
            //genFig.addWayPoint(createWayPoint((ch.ehi.umleditor.umlpresentation.Package)topicv.get(supplier)));

            genFig.addSubject(extend);
            diag.addPresentationElement(genFig);
            edgev.add(genFig);
          }
        }
      }
    }
    //
    // add AssociationDefs to diagram
    // (but add only associations that have all ends on this diagram)
    //
    classi=apackage.iteratorOwnedElement();
    ch.ehi.interlis.associations.RoleDef role;
    while(classi.hasNext()){
      Object obj=classi.next();
      if(!(obj instanceof AssociationDef)){
        continue;
      }
      AssociationDef assocdef=(AssociationDef)obj;

      // check if all ends are on this diagram
      java.util.Iterator rolei=assocdef.iteratorConnection();
      boolean skipAssoc=false; // true if not all ends on this diagram
      while(!skipAssoc && rolei.hasNext()){
        Object objD=rolei.next();
        if(!(objD instanceof ch.ehi.interlis.associations.RoleDef)){
          skipAssoc=true;
          continue;
        }
        role=(ch.ehi.interlis.associations.RoleDef)objD;
        if(!role.containsParticipant()){
          skipAssoc=true;
          continue;
        }
        AbstractClassDef end=(AbstractClassDef)role.getParticipant();
        if(!classv.containsKey(end)){
          skipAssoc=true;
          continue;
        }
      }

      // all ends on this diagram?
      if(!skipAssoc){

            // create composite
            ch.ehi.umleditor.umlpresentation.Association assocFig=new ch.ehi.umleditor.umlpresentation.Association();

            // create linkPresentation
            ch.ehi.umleditor.umlpresentation.PresentationAssocClass linkFig=new ch.ehi.umleditor.umlpresentation.PresentationAssocClass();
            linkFig.addSubject(assocdef);
            assocFig.attachLinkPresentation(linkFig);
            nodev.add(linkFig);

            // create rolePresentation's
            rolei=assocdef.iteratorConnection();
            while(rolei.hasNext()){
              role=(RoleDef)rolei.next();
              ClassDef end=(ClassDef)role.getParticipant();
              ch.ehi.umleditor.umlpresentation.PresentationRole roleFig=new ch.ehi.umleditor.umlpresentation.PresentationRole();
              roleFig.addEndpoint(linkFig);
              roleFig.addEndpoint((ch.ehi.umleditor.umlpresentation.Class)classv.get(end));
              roleFig.addSubject(role);
              assocFig.addRolePresentation(roleFig);
              edgev.add(roleFig);
            }

            assocFig.addSubject(assocdef);
            diag.addPresentationElement(assocFig);

      }
    }

    // layout diagram
    Layout.layout(nodev,edgev,0,0
          ,ch.ehi.umleditor.application.LauncherView.getInstance().getSettings().getDiagramWidth().intValue()
          ,ch.ehi.umleditor.application.LauncherView.getInstance().getSettings().getDiagramHeight().intValue()
      );
    return;
    // -end- 3CDBB82502CB body3CD8E2DF0062 "classes"
    }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CD8E2DF0062 detail_end "CreateDiagramUtility"
  static private ch.ehi.umleditor.umlpresentation.Color createDefaultForeground()
  {
    ch.ehi.umleditor.umlpresentation.Color c=new ch.ehi.umleditor.umlpresentation.Color();
    c.setRed(0);
    c.setGreen(0);
    c.setBlue(0);
    return c;
  }
  static private ch.ehi.umleditor.umlpresentation.Color createDefaultBackground()
  {
    ch.ehi.umleditor.umlpresentation.Color c=new ch.ehi.umleditor.umlpresentation.Color();
    c.setRed(255);
    c.setGreen(255);
    c.setBlue(255);
    return c;
  }
  static private ch.ehi.umleditor.umlpresentation.WayPoint createWayPoint(ch.ehi.umleditor.umlpresentation.Package p)
  {
    ch.ehi.umleditor.umlpresentation.WayPoint wp=new ch.ehi.umleditor.umlpresentation.WayPoint();
    wp.setEast(p.getEast());
    wp.setSouth(p.getSouth());
    return wp;
  }


  // -end- 3CD8E2DF0062 detail_end "CreateDiagramUtility"

}

