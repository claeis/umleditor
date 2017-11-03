package ch.ehi.umleditor.application;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;
import java.awt.Component;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;

<<<<<<< HEAD

/**
 * TreeCellEditor for a ENUM panel tree node.
 * @author Claude Eisenhut
 */
public class EnumTreeCellEditor	extends javax.swing.tree.DefaultTreeCellEditor {
  public EnumTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
    super(tree, renderer);
  }
  public EnumTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer, TreeCellEditor editor) {
    super(tree, renderer, editor);
  }

  public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row){
    return super.getTreeCellEditorComponent(tree
        ,((EnumElement)value).getName().getValue(), isSelected, expanded, leaf, row);
  }
=======
/**
 * TreeCellEditor for a ENUM panel tree node.
 * 
 * @author Claude Eisenhut
 */
public class EnumTreeCellEditor extends javax.swing.tree.DefaultTreeCellEditor {
	public EnumTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
		super(tree, renderer);
	}

	public EnumTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer, TreeCellEditor editor) {
		super(tree, renderer, editor);
	}

	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded,
			boolean leaf, int row) {
		return super.getTreeCellEditorComponent(tree, ((EnumElement) value).getName().getValue(), isSelected, expanded,
				leaf, row);
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

}
