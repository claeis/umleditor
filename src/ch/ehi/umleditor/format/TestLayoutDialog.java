// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2005-02-21 15:57:47 $
// $Revision: 1.2 $
//

// -beg- preserve=no 3C7395A70208 package "SubDialog"
package ch.ehi.umleditor.format;
// -end- 3C7395A70208 package "SubDialog"

// -beg- preserve=no 3C7395A70208 autoimport "SubDialog"
import javax.swing.JDialog;
// -end- 3C7395A70208 autoimport "SubDialog"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3C7395A70208 import "SubDialog"
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.*;
import ch.ehi.basics.logging.EhiLogger;
// -end- 3C7395A70208 import "SubDialog"

public class TestLayoutDialog extends JDialog
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=yes 3C7395A70208 detail_begin "SubDialog"
private TestLayoutPane view;
private JButton okBtn = null;
private JButton cancelBtn = null;
private Layout model=null;
// -end- 3C7395A70208 detail_begin "SubDialog"

// -beg- preserve=no 3C7396930058 head3C7395A70208 "SubDialog"
public TestLayoutDialog(Frame parent)
// -end- 3C7396930058 head3C7395A70208 "SubDialog"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C7396930058 throws3C7395A70208 "SubDialog"

// -end- 3C7396930058 throws3C7395A70208 "SubDialog"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3C7396930058 body3C7395A70208 "SubDialog"
        super(parent,true);

        JPanel pane=new JPanel();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        view=new TestLayoutPane();
        pane.add(view);

        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        buttonPane.add(Box.createHorizontalGlue());
        okBtn = new JButton("Layout");
        buttonPane.add(okBtn);
        okBtn.addActionListener(new java.awt.event.ActionListener(){
                        public void actionPerformed(java.awt.event.ActionEvent e){
                                onOk();
                        }
                });
        buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
        cancelBtn = new JButton("Close");
        buttonPane.add(cancelBtn);
        cancelBtn.addActionListener(new java.awt.event.ActionListener(){
                        public void actionPerformed(java.awt.event.ActionEvent e){
                                onCancel();
                        }
                });
        pane.add(buttonPane);

        java.awt.Container contentPane = getContentPane();
        contentPane.add(pane);
        return;
        // -end- 3C7396930058 body3C7395A70208 "SubDialog"
}

// -beg- preserve=no 3C73A0970312 head3C7395A70208 "showDialog"
public void showDialog()
// -end- 3C73A0970312 head3C7395A70208 "showDialog"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C73A0970312 throws3C7395A70208 "showDialog"

// -end- 3C73A0970312 throws3C7395A70208 "showDialog"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3C73A0970312 body3C7395A70208 "showDialog"
        model=new Layout();
        view.setModel(model);
        pack();
        show();
        // -end- 3C73A0970312 body3C7395A70208 "showDialog"
}

// -beg- preserve=no 3C74DD9D0359 head3C7395A70208 "onOk"
public void onOk()
// -end- 3C74DD9D0359 head3C7395A70208 "onOk"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C74DD9D0359 throws3C7395A70208 "onOk"

// -end- 3C74DD9D0359 throws3C7395A70208 "onOk"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3C74DD9D0359 body3C7395A70208 "onOk"
        view.updateModel();
        // run it
        java.util.Vector edgev=new java.util.Vector(30);
        java.util.Vector nodev=new java.util.Vector(30);
        // collect nodes and edges from current diagram
        ch.ehi.umleditor.umldrawingtools.ClassDiagramView diagView=ch.ehi.umleditor.application.LauncherView.getInstance().getCurrentClassDiagram();
        if(diagView!=null) {
                EhiLogger.traceState("current ClassDiagramView found");
                ch.ehi.umleditor.umlpresentation.Diagram diag=diagView.getDiagram();
                java.util.Iterator elei=diag.iteratorPresentationElement();
                while(elei.hasNext()) {
                        Object obj=elei.next();
                        if(obj instanceof ch.ehi.umleditor.umlpresentation.PresentationEdge) {
                                edgev.add(obj);
                        }else if(obj instanceof ch.ehi.umleditor.umlpresentation.PresentationNode) {
                                nodev.add(obj);
                        }
                }
                model.layout(nodev,edgev,0,0,800,800);
                diagView.refresh();
        }
        return;
        // -end- 3C74DD9D0359 body3C7395A70208 "onOk"
}

// -beg- preserve=no 3C74DDA203B0 head3C7395A70208 "onCancel"
public void onCancel()
// -end- 3C74DDA203B0 head3C7395A70208 "onCancel"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3C74DDA203B0 throws3C7395A70208 "onCancel"

// -end- 3C74DDA203B0 throws3C7395A70208 "onCancel"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3C74DDA203B0 body3C7395A70208 "onCancel"
        dispose();
        return;
        // -end- 3C74DDA203B0 body3C7395A70208 "onCancel"
}


// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C7395A70208 detail_end "SubDialog"

// -end- 3C7395A70208 detail_end "SubDialog"

}
