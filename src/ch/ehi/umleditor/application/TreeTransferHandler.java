package ch.ehi.umleditor.application;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.TreePath;
import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
import ch.ehi.interlis.functions.FunctionDef;
import ch.ehi.interlis.graphicdescriptions.GraphicParameterDef;
import ch.ehi.interlis.metaobjects.MetaDataUseDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.views.ViewDef;
import ch.ehi.uml1_4.foundation.core.Element;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.implementation.UmlPackage;

public class TreeTransferHandler extends TransferHandler {
	private static final long serialVersionUID = -780714214950735708L;
	private static java.util.ResourceBundle resTreeTransferHandler = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/TreeTransferHandler");
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
        	ch.ehi.umleditor.application.LauncherView.getInstance().log("ClassNotFound: " , e.getMessage());
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
            List<Element> copies = new ArrayList<Element>();
            List<Element> toRemove = new ArrayList<Element>();
            Element node = (Element)paths[0].getLastPathComponent();
            Element copy = node;
            copies.add(copy);
            toRemove.add(node);
            
            Element[] nodes = copies.toArray(new Element[copies.size()]);
            nodesToRemove = toRemove.toArray(new Element[toRemove.size()]);
            return new NodesTransferable(nodes);
        }
        return null;
    }

     public int getSourceActions(JComponent c) {
        return MOVE;
    }
     /*
      * Drop
      * @see javax.swing.TransferHandler#importData(javax.swing.TransferHandler.TransferSupport)
      */
     public boolean importData(TransferHandler.TransferSupport support) {
        if(!canImport(support)) {
        	ch.ehi.umleditor.application.LauncherView.getInstance().log("Can't import", "importData");
            return false;
        }
        
        try {
        	// Get drop location info.
            JTree.DropLocation dl = (JTree.DropLocation)support.getDropLocation();
            TreePath dest = dl.getPath();
            Namespace destParent = (Namespace)dest.getLastPathComponent();
            // Extract transfer data.
            Transferable t = support.getTransferable();
            Element[] node;
        	node = (Element[]) t.getTransferData(nodesFlavor);
           
               if(node[0] instanceof ModelElement) {
            	 //Just move a InterlisModel inside a umlpackage
            	   if(node[0] instanceof INTERLIS2Def && destParent instanceof UmlPackage) {
       				    INTERLIS2Def element = (INTERLIS2Def) node[0];
                        element.changeNamespace(destParent);
                   	}
            	 //Just move a ModelDef inside a InterlisModel
               	else if(node[0] instanceof ModelDef && destParent instanceof INTERLIS2Def) {
               		ModelDef element = (ModelDef) node[0];
                    element.changeNamespace(destParent);
               	} 
               	//Just move a ClassDef inside a ModelDef or TopicDef
               	else if(node[0] instanceof ClassDef && (destParent instanceof ModelDef || destParent instanceof TopicDef)){
               		ClassDef element = (ClassDef) node[0];
               		element.changeNamespace(destParent);
               	}
               	//Just move a UnitDef inside a ModelDef or TopicDef
               	else if(node[0] instanceof UnitDef && (destParent instanceof ModelDef || destParent instanceof TopicDef)){
               		UnitDef element = (UnitDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	//Just move a Relationship(AssociationDef) inside a ModelDef or TopicDef
               	else if(node[0] instanceof AssociationDef && (destParent instanceof ModelDef || destParent instanceof TopicDef)){
               		AssociationDef element = (AssociationDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	//Just move a DomainDef inside a ModelDef or TopicDef
               	else if(node[0] instanceof DomainDef && (destParent instanceof ModelDef || destParent instanceof TopicDef)){
               		DomainDef element = (DomainDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	//Just move a FunctionDef inside a ModelDef
               	else if(node[0] instanceof FunctionDef && (destParent instanceof ModelDef)){
               		FunctionDef element = (FunctionDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	//Just move a Run time Parameter(GraphicParameterDef) inside a ModelDef
               	else if(node[0] instanceof GraphicParameterDef && (destParent instanceof ModelDef)){
               		GraphicParameterDef element = (GraphicParameterDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	//Just move a LineFormTypeDef inside a ModelDef or TopicDef
               	else if(node[0] instanceof LineFormTypeDef && (destParent instanceof ModelDef || destParent instanceof TopicDef)){
               		LineFormTypeDef element = (LineFormTypeDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	//Just move a MetaDataUseDef inside a ModelDef or TopicDef
               	else if(node[0] instanceof MetaDataUseDef && (destParent instanceof ModelDef || destParent instanceof TopicDef)){
               		MetaDataUseDef element = (MetaDataUseDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	//Just move a TopicDef inside a ModelDef or TopicDef
               	else if(node[0] instanceof TopicDef && destParent instanceof ModelDef){
               		TopicDef element = (TopicDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	//Just move a ViewDef inside a ModelDef or TopicDef
               	else if(node[0] instanceof ViewDef && destParent instanceof TopicDef){
               		ViewDef element = (ViewDef) node[0];
                    element.changeNamespace(destParent);
               	}
               	else {
               		JOptionPane.showMessageDialog(null, resTreeTransferHandler.getString("JPMessage"), resTreeTransferHandler.getString("JPTittle"), JOptionPane.WARNING_MESSAGE);
               	}	   
               }else {
   				ch.ehi.umleditor.umlpresentation.Diagram diag = (ch.ehi.umleditor.umlpresentation.Diagram) destParent;
                diag.changeNamespace(destParent);
   			}
               return true;
            
        } catch(UnsupportedFlavorException ufe) {
        	ch.ehi.umleditor.application.LauncherView.getInstance().log("UnsupportedFlavor: ", ufe.getMessage());
        } catch(java.io.IOException ioe) {
        	ch.ehi.umleditor.application.LauncherView.getInstance().log("I/O error: ", ioe.getMessage());
        }
        return false;
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
