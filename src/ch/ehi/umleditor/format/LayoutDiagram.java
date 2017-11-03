// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:40:10 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3CDA3DA10173 package "LayoutDiagram"
package ch.ehi.umleditor.format;
<<<<<<< HEAD
=======

import java.util.Iterator;
import java.util.Vector;

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
// -end- 3CDA3DA10173 package "LayoutDiagram"

// -beg- preserve=no 3CDA3DA10173 autoimport "LayoutDiagram"

// -end- 3CDA3DA10173 autoimport "LayoutDiagram"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3CDA3DA10173 import "LayoutDiagram"

// -end- 3CDA3DA10173 import "LayoutDiagram"

<<<<<<< HEAD
public class LayoutDiagram
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CDA3DA10173 detail_begin "LayoutDiagram"
  static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(LayoutDiagram.class);

  // -end- 3CDA3DA10173 detail_begin "LayoutDiagram"

  // -beg- preserve=no 3CDA3DB3002F head3CDA3DA10173 "layoutCurrentDiagram"
  public static void layoutCurrentDiagram()
  // -end- 3CDA3DB3002F head3CDA3DA10173 "layoutCurrentDiagram"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CDA3DB3002F throws3CDA3DA10173 "layoutCurrentDiagram"

    // -end- 3CDA3DB3002F throws3CDA3DA10173 "layoutCurrentDiagram"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CDA3DB3002F body3CDA3DA10173 "layoutCurrentDiagram"
    //TestLayoutDialog dlg=new TestLayoutDialog(ch.ehi.umleditor.application.LauncherView.getInstance());
    //dlg.showDialog();
    // run it
    java.util.Vector edgev=new java.util.Vector(30);
    java.util.Vector nodev=new java.util.Vector(30);
    // collect nodes and edges from current diagram
    ch.ehi.umleditor.umldrawingtools.ClassDiagramView diagView=ch.ehi.umleditor.application.LauncherView.getInstance().getCurrentClassDiagram();
    if(diagView!=null){
      //ch.softenvironment.util.Tracer.getInstance().debug("current ClassDiagramView found");
      diagView.ignoreMetaModelChanges(true);
      ch.ehi.umleditor.umlpresentation.Diagram diag=diagView.getDiagram();
      java.util.Iterator elei=diag.iteratorPresentationElement();
      while(elei.hasNext()){
        Object obj=elei.next();
        if(obj instanceof ch.ehi.umleditor.umlpresentation.PresentationEdge){
          edgev.add(obj);
        }else if(obj instanceof ch.ehi.umleditor.umlpresentation.PresentationNode){
          nodev.add(obj);
        }
      }
      Layout model=new Layout();
      // ch.ehi.umleditor.application.LauncherView.getInstance().log("layout diagram","H "+diagView.getMaximumSize().getHeight()+", W"+diagView.getMaximumSize().getWidth());
      model.layout(nodev,edgev,0,0
          ,ch.ehi.umleditor.application.LauncherView.getInstance().getSettings().getDiagramWidth().intValue()
          ,ch.ehi.umleditor.application.LauncherView.getInstance().getSettings().getDiagramHeight().intValue()
          );
      diagView.ignoreMetaModelChanges(false);
      diagView.refresh();
    }else{
      ch.ehi.umleditor.application.LauncherView.getInstance().log(rsrc.getString("CIfuncDesc"),rsrc.getString("CEnoDiagramActive"));
    }
    return;
    // -end- 3CDA3DB3002F body3CDA3DA10173 "layoutCurrentDiagram"
    }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3CDA3DA10173 detail_end "LayoutDiagram"

  // -end- 3CDA3DA10173 detail_end "LayoutDiagram"

}

=======
public class LayoutDiagram {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3CDA3DA10173 detail_begin "LayoutDiagram"
	static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(LayoutDiagram.class);

	// -end- 3CDA3DA10173 detail_begin "LayoutDiagram"

	// -beg- preserve=no 3CDA3DB3002F head3CDA3DA10173 "layoutCurrentDiagram"
	public static void layoutCurrentDiagram()
	// -end- 3CDA3DB3002F head3CDA3DA10173 "layoutCurrentDiagram"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3CDA3DB3002F throws3CDA3DA10173 "layoutCurrentDiagram"

	// -end- 3CDA3DB3002F throws3CDA3DA10173 "layoutCurrentDiagram"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CDA3DB3002F body3CDA3DA10173
		// "layoutCurrentDiagram"
		// TestLayoutDialog dlg=new
		// TestLayoutDialog(ch.ehi.umleditor.application.LauncherView.getInstance());
		// dlg.showDialog();
		// run it
		Vector<Object> edgev = new Vector<Object>(30);
		Vector<Object> nodev = new Vector<Object>(30);
		// collect nodes and edges from current diagram
		ch.ehi.umleditor.umldrawingtools.ClassDiagramView diagView = ch.ehi.umleditor.application.LauncherView
				.getInstance().getCurrentClassDiagram();
		if (diagView != null) {
			// ch.softenvironment.util.Tracer.getInstance().debug("current
			// ClassDiagramView found");
			diagView.ignoreMetaModelChanges(true);
			ch.ehi.umleditor.umlpresentation.Diagram diag = diagView.getDiagram();
			Iterator elei = diag.iteratorPresentationElement();
			while (elei.hasNext()) {
				Object obj = elei.next();
				if (obj instanceof ch.ehi.umleditor.umlpresentation.PresentationEdge) {
					edgev.add(obj);
				} else if (obj instanceof ch.ehi.umleditor.umlpresentation.PresentationNode) {
					nodev.add(obj);
				}
			}
			Layout model = new Layout();
			// ch.ehi.umleditor.application.LauncherView.getInstance().log("layout
			// diagram","H "+diagView.getMaximumSize().getHeight()+",
			// W"+diagView.getMaximumSize().getWidth());
			model.layout(nodev, edgev, 0, 0,
					ch.ehi.umleditor.application.LauncherView.getInstance().getSettings().getDiagramWidth().intValue(),
					ch.ehi.umleditor.application.LauncherView.getInstance().getSettings().getDiagramHeight()
							.intValue());
			diagView.ignoreMetaModelChanges(false);
			diagView.refresh();
		} else {
			ch.ehi.umleditor.application.LauncherView.getInstance().log(rsrc.getString("CIfuncDesc"),
					rsrc.getString("CEnoDiagramActive"));
		}
		return;
		// -end- 3CDA3DB3002F body3CDA3DA10173 "layoutCurrentDiagram"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CDA3DA10173 detail_end "LayoutDiagram"

	// -end- 3CDA3DA10173 detail_end "LayoutDiagram"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
