package ch.softenvironment.view;

/**
 * Method-Set for a DetailView
 * @see ApplicationFrame (as a Parent-Class)
 * @author: Peter Hirzel (©2002)
 */
public interface DetailView {
/**
 * Save an DbEntityBean.
 * @see DbEntityBean save()
 * @exception Throwable Handled by this GUI-Method.
 */
void saveObject();
/**
 * Prepare the View with an Object to display.
 * @see Toolbar.getNext()
 * @see ApplicationFrame subclasses
 * @exception Throwable Handled by this GUI-Method.
 */
void setCurrentObject(Object currentObject);
/**
 * Undo the changes of a DbEntityBean.
 * @see DbEntityBean refresh()
 * @exception Throwable Handled by this GUI-Method.
 */
void undoObject();
}
