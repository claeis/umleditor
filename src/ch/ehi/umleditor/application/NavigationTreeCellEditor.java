package ch.ehi.umleditor.application;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;
import java.awt.Component;

/**
 * TreeCellEditor for a navigation tree node.
<<<<<<< HEAD
 * @author Claude Eisenhut
 */
public class NavigationTreeCellEditor	extends javax.swing.tree.DefaultTreeCellEditor {
  public NavigationTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
    super(tree, renderer);
  }
  public NavigationTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer, TreeCellEditor editor) {
    super(tree, renderer, editor);
  }

  public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row){
    return super.getTreeCellEditorComponent(tree
        ,NavigationTreeNodeUtility.getName(value), isSelected, expanded, leaf, row);
  }
=======
 * 
 * @author Claude Eisenhut
 */
public class NavigationTreeCellEditor extends javax.swing.tree.DefaultTreeCellEditor {
	public NavigationTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
		super(tree, renderer);
	}

	public NavigationTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer, TreeCellEditor editor) {
		super(tree, renderer, editor);
	}

	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded,
			boolean leaf, int row) {
		return super.getTreeCellEditorComponent(tree, NavigationTreeNodeUtility.getName(value), isSelected, expanded,
				leaf, row);
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

}
