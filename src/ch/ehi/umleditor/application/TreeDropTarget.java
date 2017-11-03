// TreeDropTarget.java
// A quick DropTarget that's looking for drops from draggable JTrees.
//
package ch.ehi.umleditor.application;

import java.awt.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;
import ch.ehi.uml1_4.foundation.core.Element;

public class TreeDropTarget implements DropTargetListener {

<<<<<<< HEAD
  DropTarget target;
  JTree targetTree;

  public TreeDropTarget(JTree tree) {
    targetTree = tree;
    target = new DropTarget(targetTree, this);
  }

  /*
   * Drop Event Handlers
   */
  private Element getNodeForEvent(DropTargetDragEvent dtde) {
    Point p = dtde.getLocation();
    DropTargetContext dtc = dtde.getDropTargetContext();
    JTree tree = (JTree)dtc.getComponent();
    TreePath path = tree.getClosestPathForLocation(p.x, p.y);
    return (Element)path.getLastPathComponent();
  }

  public void dragEnter(DropTargetDragEvent dtde) {
    Element node = getNodeForEvent(dtde);
    //if (node.isLeaf()) {
    //  dtde.rejectDrag();
    //}
    //else {
      // start by supporting move operations
      dtde.acceptDrag(DnDConstants.ACTION_MOVE);
      //dtde.acceptDrag(dtde.getDropAction());
    //}
  }

  public void dragOver(DropTargetDragEvent dtde) {
    Element node = getNodeForEvent(dtde);
    //if (node.isLeaf()) {
    //  dtde.rejectDrag();
    //}
    //else {
      // start by supporting move operations
      dtde.acceptDrag(DnDConstants.ACTION_MOVE);
      //dtde.acceptDrag(dtde.getDropAction());
    //}
  }

  public void dragExit(DropTargetEvent dte) { }
  public void dropActionChanged(DropTargetDragEvent dtde) { }

  public void drop(DropTargetDropEvent dtde) {
    Point pt = dtde.getLocation();
    DropTargetContext dtc = dtde.getDropTargetContext();
    JTree tree = (JTree)dtc.getComponent();
    TreePath parentpath = tree.getClosestPathForLocation(pt.x, pt.y);
    Element parent =
      (Element)parentpath.getLastPathComponent();
    //if (parent.isLeaf()) {
    //  dtde.rejectDrop();
    //  return;
    //}

    dtde.acceptDrop(DnDConstants.ACTION_MOVE);
    try {
      Transferable tr = dtde.getTransferable();
      DataFlavor[] flavors = tr.getTransferDataFlavors();
      for (int i = 0; i < flavors.length; i++) {
	if (tr.isDataFlavorSupported(flavors[i])) {
	  //dtde.acceptDrop(dtde.getDropAction());
	  TreePath p = (TreePath)tr.getTransferData(flavors[i]);
	  Element node =
	    (Element)p.getLastPathComponent();
          //System.out.println(node);
	  // model.insertNodeInto(node, parent, 0);
          ch.ehi.uml1_4.foundation.core.Element ele;
          ele=node;

          if(ele instanceof ch.ehi.interlis.attributes.AttributeDef){
            //System.out.println(ele);
            ch.ehi.interlis.attributes.AttributeDef attr=(ch.ehi.interlis.attributes.AttributeDef)ele;
            ele=(ch.ehi.uml1_4.foundation.core.Element)parent;
            //System.out.println(ele);
            ch.ehi.interlis.modeltopicclass.ClassDef aclass=(ch.ehi.interlis.modeltopicclass.ClassDef)ele;
            attr.detachOwner();
            aclass.addFeature(attr);
          }else if(ele instanceof ch.ehi.uml1_4.foundation.core.ModelElement){
            //System.out.println(ele);
            ch.ehi.uml1_4.foundation.core.ModelElement aclass=(ch.ehi.uml1_4.foundation.core.ModelElement)ele;
            ele=(ch.ehi.uml1_4.foundation.core.Element)parent;
            //System.out.println(ele);
            ch.ehi.uml1_4.modelmanagement.Package apackage=(ch.ehi.uml1_4.modelmanagement.Package)ele;
            aclass.detachNamespace();
            apackage.addOwnedElement(aclass);
          }
	  dtde.dropComplete(true);
	  return;
	}
      }
      dtde.rejectDrop();
    } catch (Exception e) {
      e.printStackTrace();
      dtde.rejectDrop();
    }
  }
=======
	DropTarget target;
	JTree targetTree;

	public TreeDropTarget(JTree tree) {
		targetTree = tree;
		target = new DropTarget(targetTree, this);
	}

	/*
	 * Drop Event Handlers
	 */
	private Element getNodeForEvent(DropTargetDragEvent dtde) {
		Point p = dtde.getLocation();
		DropTargetContext dtc = dtde.getDropTargetContext();
		JTree tree = (JTree) dtc.getComponent();
		TreePath path = tree.getClosestPathForLocation(p.x, p.y);
		return (Element) path.getLastPathComponent();
	}

	public void dragEnter(DropTargetDragEvent dtde) {
		Element node = getNodeForEvent(dtde);
		// if (node.isLeaf()) {
		// dtde.rejectDrag();
		// }
		// else {
		// start by supporting move operations
		dtde.acceptDrag(DnDConstants.ACTION_MOVE);
		// dtde.acceptDrag(dtde.getDropAction());
		// }
	}

	public void dragOver(DropTargetDragEvent dtde) {
		Element node = getNodeForEvent(dtde);
		// if (node.isLeaf()) {
		// dtde.rejectDrag();
		// }
		// else {
		// start by supporting move operations
		dtde.acceptDrag(DnDConstants.ACTION_MOVE);
		// dtde.acceptDrag(dtde.getDropAction());
		// }
	}

	public void dragExit(DropTargetEvent dte) {
	}

	public void dropActionChanged(DropTargetDragEvent dtde) {
	}

	public void drop(DropTargetDropEvent dtde) {
		Point pt = dtde.getLocation();
		DropTargetContext dtc = dtde.getDropTargetContext();
		JTree tree = (JTree) dtc.getComponent();
		TreePath parentpath = tree.getClosestPathForLocation(pt.x, pt.y);
		Element parent = (Element) parentpath.getLastPathComponent();
		// if (parent.isLeaf()) {
		// dtde.rejectDrop();
		// return;
		// }

		dtde.acceptDrop(DnDConstants.ACTION_MOVE);
		try {
			Transferable tr = dtde.getTransferable();
			DataFlavor[] flavors = tr.getTransferDataFlavors();
			for (int i = 0; i < flavors.length; i++) {
				if (tr.isDataFlavorSupported(flavors[i])) {
					// dtde.acceptDrop(dtde.getDropAction());
					TreePath p = (TreePath) tr.getTransferData(flavors[i]);
					Element node = (Element) p.getLastPathComponent();
					// System.out.println(node);
					// model.insertNodeInto(node, parent, 0);
					ch.ehi.uml1_4.foundation.core.Element ele;
					ele = node;

					if (ele instanceof ch.ehi.interlis.attributes.AttributeDef) {
						// System.out.println(ele);
						ch.ehi.interlis.attributes.AttributeDef attr = (ch.ehi.interlis.attributes.AttributeDef) ele;
						ele = (ch.ehi.uml1_4.foundation.core.Element) parent;
						// System.out.println(ele);
						ch.ehi.interlis.modeltopicclass.ClassDef aclass = (ch.ehi.interlis.modeltopicclass.ClassDef) ele;
						attr.detachOwner();
						aclass.addFeature(attr);
					} else if (ele instanceof ch.ehi.uml1_4.foundation.core.ModelElement) {
						// System.out.println(ele);
						ch.ehi.uml1_4.foundation.core.ModelElement aclass = (ch.ehi.uml1_4.foundation.core.ModelElement) ele;
						ele = (ch.ehi.uml1_4.foundation.core.Element) parent;
						// System.out.println(ele);
						ch.ehi.uml1_4.modelmanagement.Package apackage = (ch.ehi.uml1_4.modelmanagement.Package) ele;
						aclass.detachNamespace();
						apackage.addOwnedElement(aclass);
					}
					dtde.dropComplete(true);
					return;
				}
			}
			dtde.rejectDrop();
		} catch (Exception e) {
			e.printStackTrace();
			dtde.rejectDrop();
		}
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
}
