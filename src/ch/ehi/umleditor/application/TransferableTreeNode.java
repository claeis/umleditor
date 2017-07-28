// TransferableTreeNode.java
// A Transferable TreePath to be used with Drag & Drop applications.
//
package ch.ehi.umleditor.application;

import java.io.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;
import javax.swing.tree.*;

public class TransferableTreeNode implements Transferable {

public static DataFlavor TREE_PATH_FLAVOR = new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType,
                                                           "Tree Path");
DataFlavor flavors[] = { TREE_PATH_FLAVOR };
TreePath path;

public TransferableTreeNode(TreePath tp) {
        path = tp;
}

public synchronized DataFlavor[] getTransferDataFlavors() {
        return flavors;
}

public boolean isDataFlavorSupported(DataFlavor flavor) {
        //return (flavor.getRepresentationClass() == TreePath.class);
        return true;
}

public synchronized Object getTransferData(DataFlavor flavor)
throws UnsupportedFlavorException, IOException {
        if (isDataFlavorSupported(flavor)) {
                return (Object)path;
        } else {
                throw new UnsupportedFlavorException(flavor);
        }
}
}
