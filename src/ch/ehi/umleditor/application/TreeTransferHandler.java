package ch.ehi.umleditor.application;
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

/**
 * Handler to control the NavigationView Jtree.
 * @author Alejandro List
 *
 */
class TreeTransferHandler extends TransferHandler {
    
	private static final long serialVersionUID = -780714214950735708L;
	private static java.util.ResourceBundle resTreeTransferHandler = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/TreeTransferHandler");
	DataFlavor nodesFlavor;
    DataFlavor[] flavors = new DataFlavor[1];
    Element[] nodesToRemove;

    /**
     * Constructor, here I configure the type of Data (DataFlavor) that can be supported or dragged and dropped (Namespace)
     */
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

    /**
     * This method configures the nodes transferable, all elements inside the model inherit class Element
     */
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
        return COPY_OR_MOVE;
    }

    /*
     * Drop
     * @see javax.swing.TransferHandler#importData(javax.swing.TransferHandler.TransferSupport)
     */
    public boolean importData(TransferHandler.TransferSupport support) {
        if(!canImport(support)) {
        	System.out.println("No se puede importar el nodo");
            return false;
        }
       
        try {
        	 // Get drop location info.
            JTree.DropLocation dl = (JTree.DropLocation)support.getDropLocation();
            TreePath dest = dl.getPath();
            Namespace parent = (Namespace)dest.getLastPathComponent();
            //System.out.println("Nodo Destino ---------"+parent.toString());
            // Extract transfer data.
            Transferable t = support.getTransferable();
            Element[] node = null;
            node = (Element[]) t.getTransferData(nodesFlavor);
            //System.out.println("Nodo a mover ......"+node[0]);
            if(node[0] instanceof ModelElement) {
            	//Just move a InterlisModel inside a umlpackage
            	if(node[0] instanceof INTERLIS2Def && parent instanceof UmlPackage) {
            		INTERLIS2Def element = (INTERLIS2Def) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a ModelDef inside a InterlisModel
            	else if(node[0] instanceof ModelDef && parent instanceof INTERLIS2Def) {
            		ModelDef element = (ModelDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	} 
            	//Just move a ClassDef inside a ModelDef or TopicDef
            	else if(node[0] instanceof ClassDef && (parent instanceof ModelDef || parent instanceof TopicDef)){
            		ClassDef element = (ClassDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a UnitDef inside a ModelDef or TopicDef
            	else if(node[0] instanceof UnitDef && (parent instanceof ModelDef || parent instanceof TopicDef)){
            		UnitDef element = (UnitDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a Relationship(AssociationDef) inside a ModelDef or TopicDef
            	else if(node[0] instanceof AssociationDef && (parent instanceof ModelDef || parent instanceof TopicDef)){
            		AssociationDef element = (AssociationDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a DomainDef inside a ModelDef or TopicDef
            	else if(node[0] instanceof DomainDef && (parent instanceof ModelDef || parent instanceof TopicDef)){
            		DomainDef element = (DomainDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a FunctionDef inside a ModelDef
            	else if(node[0] instanceof FunctionDef && (parent instanceof ModelDef)){
            		FunctionDef element = (FunctionDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a Run time Parameter(GraphicParameterDef) inside a ModelDef
            	else if(node[0] instanceof GraphicParameterDef && (parent instanceof ModelDef)){
            		GraphicParameterDef element = (GraphicParameterDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a LineFormTypeDef inside a ModelDef or TopicDef
            	else if(node[0] instanceof LineFormTypeDef && (parent instanceof ModelDef || parent instanceof TopicDef)){
            		LineFormTypeDef element = (LineFormTypeDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a MetaDataUseDef inside a ModelDef or TopicDef
            	else if(node[0] instanceof MetaDataUseDef && (parent instanceof ModelDef || parent instanceof TopicDef)){
            		MetaDataUseDef element = (MetaDataUseDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a TopicDef inside a ModelDef or TopicDef
            	else if(node[0] instanceof TopicDef && parent instanceof ModelDef){
            		TopicDef element = (TopicDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	//Just move a ViewDef inside a ModelDef or TopicDef
            	else if(node[0] instanceof ViewDef && parent instanceof TopicDef){
            		ViewDef element = (ViewDef) node[0];
            		element.detachNamespace();
            		element.attachNamespace(parent);
            	}
            	else {
            		JOptionPane.showMessageDialog(null, resTreeTransferHandler.getString("JPMessage"), resTreeTransferHandler.getString("JPTittle"), JOptionPane.WARNING_MESSAGE);
            	}
			} else {
				ch.ehi.umleditor.umlpresentation.Diagram diag = (ch.ehi.umleditor.umlpresentation.Diagram) parent;
				diag.detachNamespace();
				diag.attachNamespace(parent);
			}
			return true;  
        } catch(UnsupportedFlavorException ufe) {
            System.out.println("UnsupportedFlavor: " + ufe.getMessage());
        } catch(java.io.IOException ioe) {
            System.out.println("I/O error: " + ioe.getMessage());
        }
        
        return false;
    }

    public String toString() {
        return getClass().getName();
    }

    /**
     * Configuration of nodes transferable
     * @author Alejandro List
     *
     */
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