package ch.ehi.umleditor.application;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultTreeModel;
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
                Element[].class.getName() +
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
        	System.out.println("NO SOPORTADO :::::::::::::::::::::::");
            return false;
        }
        support.setShowDropLocation(true);
        if(!support.isDataFlavorSupported(nodesFlavor)) {
            return false;
        }
        // Do not allow a drop on the drag source selections.
        JTree.DropLocation dl = (JTree.DropLocation)support.getDropLocation();
        JTree tree = (JTree)support.getComponent();
        int dropRow = tree.getRowForPath(dl.getPath());
        int[] selRows = tree.getSelectionRows();
        for(int i = 0; i < selRows.length; i++) {
            if(selRows[i] == dropRow) {
                return false;
            }
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
            List<Element> copies = new ArrayList<Element>();
            List<Element> toRemove = new ArrayList<Element>();
            Element node = (Element)paths[0].getLastPathComponent();
            Element copy = node;
            copies.add(copy);
            toRemove.add(node);
            for(int i = 1; i < paths.length; i++) {
            	Element next =
                    (Element)paths[i].getLastPathComponent();
            }
            Element[] nodes = copies.toArray(new Element[copies.size()]);
            nodesToRemove = toRemove.toArray(new Element[toRemove.size()]);
            return new NodesTransferable(nodes);
        }
        return null;
    }

   
    protected void exportDone(JComponent source, Transferable data, int action) {
        if((action & MOVE) == MOVE) {
            JTree tree = (JTree)source;
            //Element model = (Element)tree.getModel();
            Namespace apackage = (Namespace)tree.getSelectionPath().getLastPathComponent();
            
            //selected node
            TreePath selPath = tree.getSelectionPath();
            
            if(selPath != null) {
            	Element node = (Element) selPath.getLastPathComponent();
            	
            	// Remove nodes saved in nodesToRemove in createTransferable.
                if (node instanceof ModelElement) {
    				ModelElement ele = (ModelElement) node;
    				ele.detachNamespace();
    				ele.attachNamespace(apackage);
    			} else {
    				ch.ehi.umleditor.umlpresentation.Diagram diag = (ch.ehi.umleditor.umlpresentation.Diagram) node;
    				diag.detachNamespace();
    				diag.attachNamespace(apackage);
    			}
            }
            
            
        }
    }

    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }

    public boolean importData(TransferHandler.TransferSupport support) {
        if(!canImport(support)) {
            return false;
        }
        // Extract transfer data.
        Namespace[] nodes = null;
        try {
            Transferable t = support.getTransferable();
            nodes = (Namespace[])t.getTransferData(nodesFlavor);
        } catch(UnsupportedFlavorException ufe) {
            System.out.println("UnsupportedFlavor: " + ufe.getMessage());
        } catch(java.io.IOException ioe) {
            System.out.println("I/O error: " + ioe.getMessage());
        }
        // Get drop location info.
        JTree.DropLocation dl = (JTree.DropLocation)support.getDropLocation();
        int childIndex = dl.getChildIndex();
        TreePath dest = dl.getPath();
        Namespace parent = (Namespace)dest.getLastPathComponent();
        JTree tree = (JTree)support.getComponent();
        DefaultTreeModel model = (DefaultTreeModel)tree.getModel();
        // Configure for drop mode.
     // Configure for drop mode.
        Element elebase = parent;
        if(elebase != null) {
        	if (elebase instanceof ModelElement) {
				ModelElement ele = (ModelElement) elebase;
				ele.detachNamespace();
				ele.attachNamespace(parent);
			} else {
				ch.ehi.umleditor.umlpresentation.Diagram diag = (ch.ehi.umleditor.umlpresentation.Diagram) elebase;
				diag.detachNamespace();
				diag.attachNamespace(parent);
			}
        	return true;
        } else {
        	return false;
        }
    }

    public String toString() {
        return getClass().getName();
    }

    public class NodesTransferable implements Transferable {
        Element[] nodes;

        public NodesTransferable(Element[] nodes2) {
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
