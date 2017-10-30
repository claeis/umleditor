package ch.ehi.umleditor.application;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.TreePath;

import ch.ehi.uml1_4.foundation.core.Element;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;

class TreeTransferHandler extends TransferHandler {
    
	private static final long serialVersionUID = -780714214950735708L;
	DataFlavor nodesFlavor;
    DataFlavor[] flavors = new DataFlavor[1];
    Element[] nodesToRemove;

    public TreeTransferHandler() {
        try {
            String mimeType = DataFlavor.javaJVMLocalObjectMimeType +
                              ";class=\"" +
                Namespace.class.getName() +
                              "\"";
            nodesFlavor = new DataFlavor(mimeType);
            flavors[0] = nodesFlavor;
        } catch(ClassNotFoundException e) {
            System.out.println("ClassNotFound: " + e.getMessage());
        }
    }

    /**
     *  Drag only nodes of Jtree
     */
    public boolean canImport(TransferHandler.TransferSupport support) {
        if(!support.isDrop()) {
            return false;
        }
        support.setShowDropLocation(true);
        if(!support.isDataFlavorSupported(nodesFlavor)) {
            return false;
        }
        return true;
    }


    protected Transferable createTransferable(JComponent c) {
        JTree tree = (JTree)c;
        TreePath[] paths = tree.getSelectionPaths();
        if(paths != null) {
            // Make up a node array of copies for transfer and
            // another for/of the nodes that will be removed in
            // exportDone after a successful drop.
            List<Namespace> copies = new ArrayList<Namespace>();
            List<Namespace> toRemove = new ArrayList<Namespace>();
            Namespace node = (Namespace)paths[0].getLastPathComponent();
            Namespace copy = node;
            copies.add(copy);
            toRemove.add(node);
           
            Namespace[] nodes = copies.toArray(new Namespace[copies.size()]);
            nodesToRemove = toRemove.toArray(new Namespace[toRemove.size()]);
            return new NodesTransferable(nodes);
        }
        return null;
    }


    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }

    /*
     * Drop
     * @see javax.swing.TransferHandler#importData(javax.swing.TransferHandler.TransferSupport)
     */
    public boolean importData(TransferHandler.TransferSupport support) {
        if(!canImport(support)) {
            return false;
        }
        // Get drop location info.
        JTree.DropLocation dl = (JTree.DropLocation)support.getDropLocation();
        TreePath dest = dl.getPath();
        Namespace parent = (Namespace)dest.getLastPathComponent();
        
        // Extract transfer data.
        Transferable t = support.getTransferable();
        Namespace node;
        try {
           
            node = (Namespace) t.getTransferData(nodesFlavor);

            if (parent != null) {
                if(node instanceof ModelElement) {
                	ModelElement ele = (ModelElement) node;
    				ele.detachNamespace();
    				ele.attachNamespace(parent);
                }else {
    				ch.ehi.umleditor.umlpresentation.Diagram diag = (ch.ehi.umleditor.umlpresentation.Diagram) parent;
    				diag.detachNamespace();
    				diag.attachNamespace(parent);
    			}
                return true;
            } else {
            	return false;
            }  
        } catch(UnsupportedFlavorException ufe) {
            System.out.println("UnsupportedFlavor: " + ufe.getMessage());
        } catch(java.io.IOException ioe) {
            System.out.println("I/O error: " + ioe.getMessage());
        }
		return false;
        
        //Namespace[] values = node.
          
    }

    public String toString() {
        return getClass().getName();
    }

    public class NodesTransferable implements Transferable {
        Namespace[] nodes;

        public NodesTransferable(Namespace[] nodes2) {
            this.nodes = nodes2;
         }

        public Object getTransferData(DataFlavor flavor)
                                 throws UnsupportedFlavorException {
            if(!isDataFlavorSupported(flavor))
                throw new UnsupportedFlavorException(flavor);
            return nodes;
        }

        public DataFlavor[] getTransferDataFlavors() {
            return flavors;
        }

        public boolean isDataFlavorSupported(DataFlavor flavor) {
            return nodesFlavor.equals(flavor);
        }
    }
}