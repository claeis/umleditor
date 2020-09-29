package ch.ehi.umleditor.application;

import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeModelEvent;
import java.util.List;
import java.util.Iterator;

import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
import ch.ehi.uml1_4.changepropagation.MetaModelChange;


/**
 * Implements an adapter to
 * the metamodel as required by the IliBaseTypeEnumPanel's JTree.
 *
 * @author ce
 */
public class EnumTreeModel implements TreeModel,ch.ehi.uml1_4.changepropagation.MetaModelListener {
    private java.util.Vector<TreeModelListener> treeModelListeners = new java.util.Vector<TreeModelListener>();
    private Enumeration root=new Enumeration();

  public EnumTreeModel() {
  }

    /**
     * Adds a listener for the TreeModelEvent posted after the tree changes.
     */
  @Override
    public void addTreeModelListener(TreeModelListener l) {
        treeModelListeners.addElement(l);
    }

    /**
     * Removes a listener previously added with addTreeModelListener().
     */
  @Override
    public void removeTreeModelListener(TreeModelListener l) {
        treeModelListeners.removeElement(l);
    }


  /**
   * This method is called as a result of the user editing a value in
   * the tree.
   *
   * Triggered if JTree's attribute invokesStopCellEditing is set to true only.
   */
  @Override
  public void valueForPathChanged(TreePath path, Object newValue) {
  	/* Update the user object. */
  	EnumElement node = (EnumElement)path.getLastPathComponent();

  	ElementUtils.trySetName(node, (String)newValue);
  }

    /**
     * Returns the child of parent at index index in the parent's child array.
     */
  @Override
    public Object getChild(Object parent, int index) {
        if(parent==root){
          return root.getEnumElementAt(index);
        }
        return ((EnumElement)parent).getChild().getEnumElementAt(index);
    }

    /**
     * Returns the number of children of parent.
     */
  @Override
    public int getChildCount(Object parent) {
        if(parent==root){
          return root.sizeEnumElement();
        }
        if(((EnumElement)parent).containsChild()){
          return ((EnumElement)parent).getChild().sizeEnumElement();
        }
        return 0;
    }

    /**
     * Returns the index of child in parent.
     */
  @Override
    public int getIndexOfChild(Object parent, Object child) {
        if(parent==root){
          return root.findEnumElement((EnumElement)child);
        }
        return ((EnumElement)parent).getChild().findEnumElement((EnumElement)child);
    }

    /**
     * Returns the root of the tree.
     */
  @Override
    public Object getRoot() {
        return root;
    }

    /**
     * Returns true if node must not have children.
     */
  @Override
    public boolean isLeaf(Object node) {
        // all EnumElements may have sub-elements
        return false;
    }

    /** Invoked after a node (or a set of siblings) has changed in some way.
     */
    private void fireTreeNodesChanged(EnumElement node){
        TreePath path=getTreePathOrNull(node);
        if(path==null){
          return;
        }
        int len = treeModelListeners.size();
        TreeModelEvent e= new TreeModelEvent(this,path);
        for (int i = 0; i < len; i++) {
            ((TreeModelListener)treeModelListeners.elementAt(i)).
                    treeNodesChanged(e);
        }
    }
    /** Invoked after the tree has drastically changed structure from a given node down.
     */
    private void fireTreeStructureChanged(Enumeration node) {
        TreePath path=getTreePathOrNull(node);
        if(path==null){
          return;
        }
        int len = treeModelListeners.size();
        TreeModelEvent e = new TreeModelEvent(this,path);
        for (int i = 0; i < len; i++) {
            ((TreeModelListener)treeModelListeners.elementAt(i)).
                    treeStructureChanged(e);
        }
    }



  /** adapts MetaModelChanges to TreeModelEvents.
   * see also getChildren() for a similar structure
   */
    @Override
  public void metaModelChanged(ch.ehi.uml1_4.changepropagation.MetaModelChange event) {
    Object source=event.getSource();
    String ops=event.getOperation();
    if(source instanceof EnumElement){
      if(MetaModelChange.isAttribute(ops,"Name")){
        fireTreeNodesChanged((EnumElement)source);
      }else if(MetaModelChange.isAttribute(ops,"Enumeration")){
          fireTreeNodesChanged((EnumElement)source);
        }
    }
    if(source instanceof Enumeration){
      if(MetaModelChange.isAttribute(ops,"EnumElement")){
        fireTreeStructureChanged((Enumeration)source);
      }
    }
  }

  protected TreePath getTreePath(Object node){
    java.util.ArrayList path = new java.util.ArrayList();
    if(node!=root && (node instanceof Enumeration)){
      node=((Enumeration)node).getParent();
    }
    // ASSERT: node==root || (node instanceof EnumElement)
    path.add(node);
    if(node!=root){
      Enumeration next=((EnumElement)node).getEnumeration();
      while(next!=root){
        path.add(0,next.getParent());
        next=next.getParent().getEnumeration();
      }
      // add root
      path.add(0,next);
    }
    return new TreePath(path.toArray());
  }
  private TreePath getTreePathOrNull(Object node){
    java.util.ArrayList path = new java.util.ArrayList();
    if(node!=root && (node instanceof Enumeration)){
      if(!((Enumeration)node).containsParent()){
        return null;
      }
      node=((Enumeration)node).getParent();
    }
    // ASSERT: node==root || (node instanceof EnumElement)
    path.add(node);
    if(node!=root){
      if(!((EnumElement)node).containsEnumeration()){
        return null;
      }
      Enumeration next=((EnumElement)node).getEnumeration();
      while(next!=root){
        if(!next.containsParent()){
          return null;
        }
        path.add(0,next.getParent());
      if(!next.getParent().containsEnumeration()){
        return null;
      }
        next=next.getParent().getEnumeration();
      }
      // add root
      path.add(0,next);
    }
    return new TreePath(path.toArray());
  }
  public void setRoot(Enumeration root1){
    root=root1;
    fireTreeStructureChanged(root);
  }
}
