package ch.ehi.umleditor.application;

import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Class;
import ch.ehi.uml1_4.foundation.core.Element;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.umleditor.umlpresentation.Diagram;

import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeModelEvent;
import java.util.List;
import java.util.Iterator;


/**
 * Implements an adapter to
 * the metamodel as required by the NavigationView's JTree.
 *
 * @author ce
 */

public class NavigationTreeModel implements javax.swing.tree.TreeModel,ch.ehi.uml1_4.changepropagation.MetaModelListener {
    public static final String SORT_BY_KIND_NAME="SORT_BY_KIND_NAME";
    public static final String SORT_BY_NAME="SORT_BY_NAME";
    private String currentOrdering=SORT_BY_KIND_NAME;

    private java.util.Vector treeModelListeners = new java.util.Vector();
    private Namespace rootElement;
    private boolean showOnlyPackages;

    public NavigationTreeModel(Namespace root,boolean showOnlyPackages) {
        rootElement = root;
        this.showOnlyPackages=showOnlyPackages;
    }

    /** Invoked after a node (or a set of siblings) has changed in some way.
     */
    protected void fireTreeNodesChanged(Element node){
        int len = treeModelListeners.size();
        TreeModelEvent e;
        if(node instanceof UmlModel){
          e = new TreeModelEvent(this,getTreePath(node));
        }else{
          e = new TreeModelEvent(this,getTreePath(getParent(node)));
        }
        for (int i = 0; i < len; i++) {
            ((TreeModelListener)treeModelListeners.elementAt(i)).
                    treeNodesChanged(e);
        }
    }

    /** Invoked after nodes have been inserted into the tree.
     */
    protected void fireTreeNodesInserted(Element e){
    }

    /** Invoked after nodes have been removed from the tree.
     */
    protected void fireTreeNodesRemoved(Element e){
    }

    /** Invoked after the tree has drastically changed structure from a given node down.
     */
    protected void fireTreeStructureChanged(Element node) {
        int len = treeModelListeners.size();
        TreeModelEvent e = new TreeModelEvent(this,
                                              getTreePath(node));
        for (int i = 0; i < len; i++) {
            ((TreeModelListener)treeModelListeners.elementAt(i)).
                    treeStructureChanged(e);
        }
    }

    /**
     * Adds a listener for the TreeModelEvent posted after the tree changes.
     */
    public void addTreeModelListener(TreeModelListener l) {
        treeModelListeners.addElement(l);
    }

    /**
     * Removes a listener previously added with addTreeModelListener().
     */
    public void removeTreeModelListener(TreeModelListener l) {
        treeModelListeners.removeElement(l);
    }


    /**
     * Returns the child of parent at index index in the parent's child array.
     */
    public Object getChild(Object parent, int index) {
        List children=getChildren(parent);
        return children.get(index);
    }

    /**
     * Returns the number of children of parent.
     */
    public int getChildCount(Object parent) {
        List children=getChildren(parent);
        return children.size();
    }

    /**
     * Returns the index of child in parent.
     */
    public int getIndexOfChild(Object parent, Object child) {
        List children=getChildren(parent);
        return children.indexOf(child);
    }

    /**
     * Returns the root of the tree.
     */
    public Object getRoot() {
        return rootElement;
    }

    /**
     * Returns true if node must not have children.
     */
    public boolean isLeaf(Object node) {
        if(node instanceof Namespace
            && !(node instanceof ch.ehi.interlis.domainsandconstants.DomainDef)){
          return false;
        }
        return true;
    }


  /**
   * This method is called as a result of the user editing a value in
   * the tree.
   *
   * Triggered if JTree's attribute invokesStopCellEditing is set to true only.
   */
  public void valueForPathChanged(TreePath path, Object newValue) {
  	/* Update the name of the element, but may be a diagramm (which is not en element) */
  	Object node = path.getLastPathComponent();

        NavigationTreeNodeUtility.setName(node,(String)newValue);
  	// since we've changed how the data is to be displayed
  	// nodeChanged(node);
  }

  private List getChildren(Object parent){
    List ret=new java.util.ArrayList();
    Iterator iterator;

    // see also metaModelChanged()
    if(showOnlyPackages){
      if(parent instanceof Namespace){
        // add ownedElements
  	iterator = ((Namespace)parent).iteratorOwnedElement();
  	while (iterator.hasNext()) {
          Object next=iterator.next();
          if(next instanceof ch.ehi.uml1_4.modelmanagement.Package || next instanceof ch.ehi.uml1_4.foundation.core.Artifact){
  		ret.add(next);
          }
  	}
        // sort according to user settings
        java.util.Collections.sort(ret,new Compare(currentOrdering));
      }
    }else{
      if(parent instanceof Class){
        if(parent instanceof Association){
          // add roles
  	iterator = ((Association)parent).iteratorConnection();
  	while (iterator.hasNext()) {
  		ret.add(iterator.next());
  	}
        }
        // add attributes
        iterator = ((Class)parent).iteratorFeature();
        while (iterator.hasNext()) {
  		ret.add(iterator.next());
        }
        // add associations
  	iterator = ((Class)parent).iteratorAssociation();
  	while (iterator.hasNext()) {
  		AssociationEnd ownRoleDef = (AssociationEnd)iterator.next();
  		Iterator iteratorRoles = ((Association)ownRoleDef.getAssociation()).iteratorConnection();
  		while (iteratorRoles.hasNext()) {
  			AssociationEnd otherRole = (AssociationEnd)iteratorRoles.next();
  			if (!otherRole.equals(ownRoleDef)) {
  				ret.add(otherRole);
  			}
  		}
  	}
        // add ParameterDefs
        if(parent instanceof ch.ehi.interlis.modeltopicclass.ClassDef){
          iterator = ((ch.ehi.interlis.modeltopicclass.ClassDef)parent).iteratorParameterDef();
          while (iterator.hasNext()) {
            ret.add(iterator.next());
          }
        }
      }else if(parent instanceof Namespace){
        // add ownedElements
  	iterator = ((Namespace)parent).iteratorOwnedElement();
  	while (iterator.hasNext()) {
  		ret.add(iterator.next());
  	}
        // add diagrams
  	iterator = ((Namespace)parent).iteratorDiagram();
  	while (iterator.hasNext()) {
  		ret.add(iterator.next());
  	}
        // sort according to user settings
        java.util.Collections.sort(ret,new Compare(currentOrdering));
      }else{
        // no children
      }
      // add constraints
      if (parent instanceof ModelElement) {
  	// show ConstraintDef
  	iterator = ((ModelElement)parent).iteratorConstraint();
  	while (iterator.hasNext()) {
  		ret.add(iterator.next());
  	}
      }
    }

    return ret;
  }
  class Compare implements java.util.Comparator
  {
    private String ordering;
    public Compare(String ordering){
      this.ordering=ordering;
    }
    public int compare(Object o1, Object o2)
    {
      if(o1 instanceof Diagram && !(o2 instanceof Diagram)){
        return -1;
      }else if(o2 instanceof Diagram && !(o1 instanceof Diagram)){
        return 1;
      }
      if(ordering.equals(NavigationTreeModel.SORT_BY_KIND_NAME)){
        int def=ch.ehi.interlis.tools.ModelElementUtility.compareDefinition(o1.getClass(),o2.getClass());
        if(def!=0){
          return def;
        }
        // ASSERT: same type
      }
      String name1=NavigationTreeNodeUtility.getName(o1);if(name1==null)name1="";
      String name2=NavigationTreeNodeUtility.getName(o2);if(name2==null)name2="";
      int compareName =  name1.compareToIgnoreCase(name2);
      return compareName;
    }
  }
  /** adapts MetaModelChanges to TreeModelEvents.
   * see also getChildren() for a similar structure
   */
  public void metaModelChanged(ch.ehi.uml1_4.changepropagation.MetaModelChange event) {
    Object source=event.getSource();
    String ops=event.getOperation();
    if(source instanceof Class){
      if(source instanceof Association){
        // roles
        if(isAttribute(ops,"Connection")){
          fireTreeStructureChanged((ModelElement)source);
        }
      }
      // attributes
      if(isAttribute(ops,"Feature")){
        fireTreeStructureChanged((ModelElement)source);
      }
      // associations
      if(isAttribute(ops,"Association")){
        fireTreeStructureChanged((ModelElement)source);
        //   track name changes in AssociationEnd events
      }
      // ParameterDefs
      if(source instanceof ch.ehi.interlis.modeltopicclass.ClassDef){
        if(isAttribute(ops,"ParameterDef")){
          fireTreeStructureChanged((ModelElement)source);
        }
      }
    }else if(source instanceof AssociationEnd){
      // update display in target class; owner is handled in
      // case ModelElement.Name, case Association.Connection or case Class.Association
      // track name changes
      if(isAttribute(ops,"Name")){
          // update list of association source classes
        AssociationEnd ownRoleDef = (AssociationEnd)source;
        // RoleDef may not be attached to an Asssociation during create
        if(ownRoleDef.containsAssociation()){
          Iterator iteratorRoles = ((Association)ownRoleDef.getAssociation()).iteratorConnection();
    	  while (iteratorRoles.hasNext()) {
    		AssociationEnd sourceRole = (AssociationEnd)iteratorRoles.next();
    		if (!sourceRole.equals(ownRoleDef)) {
                  // does role reference a class?
                  if(sourceRole.containsParticipant()){
                        // update referenced class
    			fireTreeStructureChanged(sourceRole.getParticipant());
                  }
    		}
    	  }
        }
      }
    }
    if (source instanceof ModelElement) {
      if(isAttribute(ops,"Constraint")){
        fireTreeStructureChanged((ModelElement)source);
      }
    }
    if(source instanceof Namespace){
      if(isAttribute(ops,"OwnedElement")){
        fireTreeStructureChanged((ModelElement)source);
      }
      if(isAttribute(ops,"Diagram")){
        fireTreeStructureChanged((ModelElement)source);
      }
    }
    if(source instanceof ModelElement || source instanceof Diagram){
      if(isAttribute(ops,"Name")){
        if(source instanceof UmlModel){
            fireTreeNodesChanged((UmlModel)source);
        }else{
          Namespace parent=getParent((Element)source);
          if(parent!=null){
            fireTreeStructureChanged(parent);
          }
        }
      }
    }
  }
  public Namespace getParent(Element node){
    Namespace next=null;
    if(node instanceof AssociationEnd){
      if(((AssociationEnd)node).containsAssociation()){
        next=(Namespace)((AssociationEnd)node).getAssociation();
      }
    }else if(node instanceof ch.ehi.uml1_4.foundation.core.Feature){
      if(((ch.ehi.uml1_4.foundation.core.Feature)node).containsOwner()){
        next=((ch.ehi.uml1_4.foundation.core.Feature)node).getOwner();
      }
    }else if(node instanceof Diagram){
      if(((Diagram)node).containsNamespace()){
        next=((Diagram)node).getNamespace();
      }
    }else if(node instanceof ch.ehi.interlis.metaobjects.ParameterDef){
      if(((ch.ehi.interlis.metaobjects.ParameterDef)node).containsClassDef()){
        next=((ch.ehi.interlis.metaobjects.ParameterDef)node).getClassDef();
      }
    }else if(node instanceof ch.ehi.uml1_4.foundation.core.Constraint){
      if(((ch.ehi.uml1_4.foundation.core.Constraint)node).iteratorConstrainedElement().hasNext()){
        next=(Namespace)((ch.ehi.uml1_4.foundation.core.Constraint)node).iteratorConstrainedElement().next();
      }
    }else if(node instanceof ModelElement){
      if(((ModelElement)node).containsNamespace()){
        next=((ModelElement)node).getNamespace();
      }
    }
    return next;
  }

  public TreePath getTreePath(Element node){
    return findElementDefinitionNode(node);
  }
  public TreePath findElementDefinitionNode(Element node){
    // RoleDef's are represented by multiple nodes. This function returns their
    // definition
    java.util.ArrayList path = new java.util.ArrayList();
    path.add(node);
    Namespace next=getParent(node);
    if(next!=null){
      path.add(0,next);
      while(next.containsNamespace()){
        next=next.getNamespace();
        path.add(0,next);
      }
    }
    return new TreePath(path.toArray());
  }

  private static boolean isAttribute(String ops,String attr){
    if(ops==null || ops.length()==0){
      return false;
    }
    if(ops.equals("attach"+attr))return true;
    if(ops.equals("detach"+attr))return true;
    if(ops.equals("set"+attr))return true;
    if(ops.equals("add"+attr))return true;
    if(ops.equals("remove"+attr))return true;
    if(ops.equals("set"+attr))return true;
    if(ops.equals("clear"+attr))return true;
    if(ops.equals("change"+attr))return true;
    if(ops.equals("swap"+attr))return true;
    if(ops.equals("_link"+attr))return true;
    if(ops.equals("_unlink"+attr))return true;
    return false;
  }
  public String getOrdering(){
    return currentOrdering;
  }
  /** doesn't fire a refresh event; should be done by caller. That way, the caller
   * may keep nodes expanded.
   */
  public void setOrdering(String ordering){
    currentOrdering=ordering;
  }
  public void refresh(){
    fireTreeStructureChanged(rootElement);
  }

/**
 * Update the given TreeNode to display the changedElement in NavigationTree.
 * @param node (Node in tree whose Element has changed)
 * @param changedElement (Element value of node)
 * @see EditorTreeModel#valueForPathChanged(TreePath, Object)
 */
/*
private synchronized void updateNode(MutableTreeNode node, Element changedElement) {
	//	Rename should be done by UI-refresh automatically
	if (getTreNavigation().getSelectionPath() != null) {
Tracer.getInstance().patch(this, "updateNode(..)", "Bug fix: forces redraw after renaming");
		getTreNavigation().expandPath(getTreNavigation().getSelectionPath());
		getTreNavigation().repaint();
	}

	if (changedElement instanceof Namespace) {
		// update ModelElement children as well
		//  -> build list of all elementChildren-Types displayed as TreeNode
		java.util.ArrayList elementChildren = getNonOwnedChildren(changedElement);
		java.util.Iterator iterator = ((Namespace)changedElement).iteratorOwnedElement();
		while (iterator.hasNext()) {
			elementChildren.add(iterator.next());
		}

		updateChildren(node, elementChildren);
	} else {
		Tracer.getInstance().nyi(this, "updateNode(..)", "changedElements not of type Namespace are not updated yet");//$NON-NLS-2$//$NON-NLS-1$
	}
}
*/
/**
 * Check whether an elementChild was inserted (ADD) oder deleted (REMOVE) in the model and
 * refresh their displayment.
 * IMPORTANT:
 * - The list of elementChildren might contain unchanged, new or deleted siblings at once.
 *
 * @param parentNode (Node in tree whoose children might have changed)
 * @param elementChildren (list containing 0..n Element's changed or unchanged)
 */
 /*
private void updateChildren(MutableTreeNode parentNode, java.util.ArrayList elementChildren) {
	// build a map where nodeChild-Index points to elementChild
	java.util.HashMap parentNodeChildren = new java.util.HashMap(parentNode.getChildCount());
	for (int i=0; i<parentNode.getChildCount(); i++) {
		parentNodeChildren.put(new Integer(i), null);
	}

	// try find an elementChild in each displayed TreeNode
	java.util.Iterator iterator = elementChildren.iterator();
	while (iterator.hasNext()) {
		Element elementChild = (Element)iterator.next();
		boolean found = false;
		for (int i=0; i<parentNode.getChildCount(); i++) {
			Element childNode = ((NavigationTreeNode)parentNode.getChildAt(i)).getElement();
			if (childNode.equals(elementChild)) {
				parentNodeChildren.put(new Integer(i), elementChild);
				found = true;
				break;				// for efficiency reasons
			}
		}
		if (!found) {
			// case NEW child -> display additional node
			insertNode(parentNode, new NavigationTreeNode(elementChild));
			getTreNavigation().repaint();
			// newly inserted nodes must not be compared for deletion (s. below)
		}
	}

	// try search deleted elements
	for (int i=0; i<parentNodeChildren.size(); i++) {
		if (parentNodeChildren.get(new Integer(i)) == null) {
			// case DELETED child -> remove displaying node
			getTreeModel().removeNodeFromParent((MutableTreeNode)parentNode.getChildAt(i));
			getTreNavigation().repaint();
		}
	}
}
*/
/**
 * Wrap the the given ModelElement into an ElementMapper to
 * represent as NavigationTree.
 * The ModelElement's parent-child dependency is already considered
 * in the given namespace.
 *
 * This is a recursive BuildTree Algorithm.
 * @param namespace (Model to add to parent)
 * @param parent (given parent-Node)
 */
 /*
private void walkTree(Namespace namespace, MutableTreeNode parent) {
	MutableTreeNode currentNode = null;

	// child model-Element
	currentNode = insertNode(parent, new NavigationTreeNode(namespace));
	updateChildren(currentNode, getNonOwnedChildren(namespace));

	// treat the ModelElement's
	java.util.Iterator iterator = namespace.iteratorOwnedElement();
	while (iterator.hasNext()) {
		ModelElement modelElement = (ModelElement)iterator.next();
		if (modelElement instanceof Namespace) {
			// package might contain subtree
			walkTree((Namespace)modelElement, currentNode);
		} else {
			// add leaf
			insertNode(currentNode,	new NavigationTreeNode(modelElement));
		}
	}
}
*/
}
