package ch.softenvironment.view;

/**
 * Method-Set for a SearchView
 * @see ApplicationFrame (as a Parent-Class)
 * @author: Peter Hirzel (©2002)
 */
public interface SearchView {
/**
 * Assign the selected Objects in a SearchTable.
 * @see DbSessionBeanTableModel
 * @exception Throwable Handled by this GUI-Method.
 */
public void assignObjects();
/**
 * Create a new DbEntityBean and open it in a corresponding View.
 * @see DbSessionBeanTableModel
 * @exception Throwable Handled by this GUI-Method.
 */
public void newObject();
/**
 * Open the selected Objects.
 * @see DbSessionBeanTableModel get()
 * @exception Throwable Handled by this GUI-Method.
 */
public void openObjects();
/**
 * Remove the selected DbPrimitiveObject's (for e.g. SessionBeans) from a SearchTable.
 * @see DbSessionBeanTableModel remove()
 * @exception Throwable Handled by this GUI-Method.
 */
void removeObjects();
/**
 * Reset all SearchArguments for a new "complete" Search.
 */
void resetSearchArguments();
/**
 * Search for Objects.
 * @see DbSessionBeanTableModel setQuery(..)
 * @exception Throwable Handled by this GUI-Method.
 */
public void searchObjects();
/**
 * Enable the correct PopupMenu-Buttons.
 * @see checkSelection(MouseEvent, JTable)
 */
public void setupPopupMenu(javax.swing.JTable table);
}
