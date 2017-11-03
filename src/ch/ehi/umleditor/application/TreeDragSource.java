// TreeDragSource.java
// A drag source wrapper for a JTree.  This class can be used to make
// a rearrangeable DnD tree with the TransferableTreeNode class as the
// transfer data type.
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

<<<<<<< HEAD
public class TreeDragSource
implements DragSourceListener, DragGestureListener {

  DragSource source;
  DragGestureRecognizer recognizer;
  TransferableTreeNode transferable;
  Object oldNode;
  JTree sourceTree;

  public TreeDragSource(JTree tree, int actions) {
    sourceTree = tree;
    source = new DragSource();
    recognizer = source.createDefaultDragGestureRecognizer(
		 sourceTree, actions, this);
  }

  /*
   * Drag Gesture Handler
   */
  public void dragGestureRecognized(DragGestureEvent dge) {
    TreePath path = sourceTree.getSelectionPath();
    if ((path == null) || (path.getPathCount() <= 1)) {
      // We can't move the root node or an empty selection
      return;
    }
    oldNode = path.getLastPathComponent();
    transferable = new TransferableTreeNode(path);
    source.startDrag(dge, DragSource.DefaultMoveNoDrop, transferable, this);

    // If you support dropping the node anywhere, you should probably
    // start with a valid move cursor:
    //source.startDrag(dge, DragSource.DefaultMoveDrop, transferable, this);
  }

  /*
   * Drag Event Handlers
   */
  public void dragEnter(DragSourceDragEvent dsde) { }
  public void dragExit(DragSourceEvent dse) { }
  public void dragOver(DragSourceDragEvent dsde) { }
  public void dropActionChanged(DragSourceDragEvent dsde) {
    System.out.println("Action: " + dsde.getDropAction());
    System.out.println("Target Action: " + dsde.getTargetActions());
    System.out.println("User Action: " + dsde.getUserAction());
  }
  public void dragDropEnd(DragSourceDropEvent dsde) {
    /*
     * to support move or copy, we have to check which occurred:
    System.out.println("Drop Action: " + dsde.getDropAction());
    if (dsde.getDropSuccess() &&
        (dsde.getDropAction() == DnDConstants.ACTION_MOVE)) {
      ((DefaultTreeModel)sourceTree.getModel()).removeNodeFromParent(oldNode);
    }
     */

    /*
     * to support move only...
    */
    if (dsde.getDropSuccess()) {
      //((DefaultTreeModel)sourceTree.getModel()).removeNodeFromParent(oldNode);
      // already moved
    }
  }
}

=======
public class TreeDragSource implements DragSourceListener, DragGestureListener {

	DragSource source;
	DragGestureRecognizer recognizer;
	TransferableTreeNode transferable;
	Object oldNode;
	JTree sourceTree;

	public TreeDragSource(JTree tree, int actions) {
		sourceTree = tree;
		source = new DragSource();
		recognizer = source.createDefaultDragGestureRecognizer(sourceTree, actions, this);
	}

	/*
	 * Drag Gesture Handler
	 */
	public void dragGestureRecognized(DragGestureEvent dge) {
		TreePath path = sourceTree.getSelectionPath();
		if ((path == null) || (path.getPathCount() <= 1)) {
			// We can't move the root node or an empty selection
			return;
		}
		oldNode = path.getLastPathComponent();
		transferable = new TransferableTreeNode(path);
		source.startDrag(dge, DragSource.DefaultMoveNoDrop, transferable, this);

		// If you support dropping the node anywhere, you should probably
		// start with a valid move cursor:
		// source.startDrag(dge, DragSource.DefaultMoveDrop, transferable,
		// this);
	}

	/*
	 * Drag Event Handlers
	 */
	public void dragEnter(DragSourceDragEvent dsde) {
	}

	public void dragExit(DragSourceEvent dse) {
	}

	public void dragOver(DragSourceDragEvent dsde) {
	}

	public void dropActionChanged(DragSourceDragEvent dsde) {
		System.out.println("Action: " + dsde.getDropAction());
		System.out.println("Target Action: " + dsde.getTargetActions());
		System.out.println("User Action: " + dsde.getUserAction());
	}

	public void dragDropEnd(DragSourceDropEvent dsde) {
		/*
		 * to support move or copy, we have to check which occurred:
		 * System.out.println("Drop Action: " + dsde.getDropAction()); if
		 * (dsde.getDropSuccess() && (dsde.getDropAction() ==
		 * DnDConstants.ACTION_MOVE)) {
		 * ((DefaultTreeModel)sourceTree.getModel()).removeNodeFromParent(
		 * oldNode); }
		 */

		/*
		 * to support move only...
		 */
		if (dsde.getDropSuccess()) {
			// ((DefaultTreeModel)sourceTree.getModel()).removeNodeFromParent(oldNode);
			// already moved
		}
	}
}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
