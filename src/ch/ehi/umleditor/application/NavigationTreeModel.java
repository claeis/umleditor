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
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;
import ch.ehi.uml1_4.foundation.core.Class;
import ch.ehi.uml1_4.foundation.core.Element;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.umleditor.umlpresentation.Diagram;
import ch.ehi.uml1_4.changepropagation.MetaModelChange;

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

    private java.util.Vector<TreeModelListener> treeModelListeners = new java.util.Vector<TreeModelListener>();
    private Namespace rootElement;
    private boolean showOnlyPackages;

    public NavigationTreeModel(Namespace root,boolean showOnlyPackages) {
        rootElement = root;
        this.showOnlyPackages=showOnlyPackages;
    }

    /** Invoked after a node (or a set of siblings) has changed in some way.
     */
    private void fireTreeNodesChanged(Element node){
        final TreePath path = getTreePath(node);
        if(path!=null) {
            int len = treeModelListeners.size();
            TreeModelEvent e=new TreeModelEvent(this,path);
            for (int i = 0; i < len; i++) {
                ((TreeModelListener)treeModelListeners.elementAt(i)).
                        treeNodesChanged(e);
            }
        }
    }


    /** Invoked after the tree has drastically changed structure from a given node down.
     */
    private void fireTreeStructureChanged(Element node) {
        final TreePath path = getTreePath(node);
        if (path != null) {
            int len = treeModelListeners.size();
            TreeModelEvent e = new TreeModelEvent(this, path);
            for (int i = 0; i < len; i++) {
                ((TreeModelListener) treeModelListeners.elementAt(i)).treeStructureChanged(e);
            }
        }
    }

    /**
     * Adds a listener for the TreeModelEvent posted after the tree changes.
     */
    @Override
    public void addTreeModelListener(TreeModelListener l) {
    	if (!treeModelListeners.contains(l)) {
    		treeModelListeners.addElement(l);
    	}
    }

    /**
     * Removes a listener previously added with addTreeModelListener().
     */
    @Override
    public void removeTreeModelListener(TreeModelListener l) {
    	if (treeModelListeners.contains(l)) {
    		treeModelListeners.removeElement(l);
    	}
    }


    /**
     * Returns the child of parent at index index in the parent's child array.
     */
    @Override
    public Object getChild(Object parent, int index) {
        List children=getChildren(parent);
        return children.get(index);
    }

    /**
     * Returns the number of children of parent.
     */
    @Override
    public int getChildCount(Object parent) {
        List children=getChildren(parent);
        return children.size();
    }

    /**
     * Returns the index of child in parent.
     */
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        List children=getChildren(parent);
        return children.indexOf(child);
    }

    /**
     * Returns the root of the tree.
     */
    @Override
    public Object getRoot() {
        return rootElement;
    }

    /**
     * Returns true if node must not have children.
     */
    @Override
    public boolean isLeaf(Object node) {
        if(node instanceof Namespace
            && !(node instanceof ch.ehi.interlis.domainsandconstants.DomainDef)){
          return false;
        }
        return true;
    }

    /**
     * Return whether TreeElement is a INTERLIS2Def or not
     */
     static public boolean isINTERLIS2Def(Object node) {
  		return node instanceof ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
    }

  /**
   * This method is called as a result of the user editing a value in
   * the tree.
   *
   * Triggered if JTree's attribute invokesStopCellEditing is set to true only.
   */
     @Override
  public void valueForPathChanged(TreePath path, Object newValue) {
  	/* Update the name of the element, but may be a diagramm (which is not en element) */
  	Object node = path.getLastPathComponent();
  	if(isINTERLIS2Def(node)) {
		ch.ehi.interlis.modeltopicclass.INTERLIS2Def obj = (ch.ehi.interlis.modeltopicclass.INTERLIS2Def) node;
		if(((String)newValue).endsWith(".ili")) {
			NavigationTreeNodeUtility.setName(node,(String)newValue);
		}else {
			NavigationTreeNodeUtility.setName(node,(String)newValue+".ili");
		}
  	} else {
        NavigationTreeNodeUtility.setName(node,(String)newValue);
  	}
  	// since we've changed how the data is to be displayed
  	// nodeChanged(node);
  }

  private List<Element> getChildren(Object parent){
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
   */
  @Override
  public void metaModelChanged(ch.ehi.uml1_4.changepropagation.MetaModelChange event) {
    Object source=event.getSource();
    String ops=event.getOperation();
    if(source instanceof Class){
      if(source instanceof Association){
        // RoleDefs owned by source
        if(MetaModelChange.isAttribute(ops,"Connection")){
            if (!ops.startsWith(MetaModelChange.OP_CLEAR) /*PH: prevents closing tree after AssocDef removal*/) {
                fireTreeStructureChanged((ModelElement)source);
            }
        }
      }
      // attributes owned by source 
      if(MetaModelChange.isAttribute(ops,"Feature")){
        fireTreeStructureChanged((ModelElement)source);
      }
      // associations where source is an end
      if(MetaModelChange.isAttribute(ops,"Association")){
          if (!ops.startsWith(MetaModelChange.OP_CLEAR) /*PH: prevents closing tree after ClassDef removal (if associated)*/) {
            fireTreeStructureChanged((ModelElement)source);
          }
      }
      // ParameterDefs
      if(source instanceof ch.ehi.interlis.modeltopicclass.ClassDef){
        if(MetaModelChange.isAttribute(ops,"ParameterDef")){
          fireTreeStructureChanged((ModelElement)source);
        }
      }
    }else if(source instanceof AssociationEnd){
      // update display in target class; owner is handled in
      // case ModelElement.Name, case Association.Connection or case Class.Association
      // track name changes
      if(MetaModelChange.isAttribute(ops,"Name")){
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
      if(MetaModelChange.isAttribute(ops,"Constraint")){
        fireTreeStructureChanged((ModelElement)source);
      }
    }
    if(source instanceof Namespace){
      if(MetaModelChange.isAttribute(ops,"OwnedElement")){
         fireTreeStructureChanged((ModelElement)source);
      }
      if(MetaModelChange.isAttribute(ops,"Diagram")){
        fireTreeStructureChanged((ModelElement)source);
      }
    }
    if(source instanceof ModelElement || source instanceof Diagram){
      if(MetaModelChange.isAttribute(ops,"Name")){
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
    java.util.ArrayList<Element> path = new java.util.ArrayList<Element>();
    path.add(node);
    Namespace next=getParent(node);
    if(next!=null){
      path.add(0,next);
      while(next.containsNamespace()){
        next=next.getNamespace();
        path.add(0,next);
      }
    }
    if(path.get(0)!=rootElement) {
        // node is no longer part of this tree model
        return null;
    }
    return new TreePath(path.toArray());
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

}
