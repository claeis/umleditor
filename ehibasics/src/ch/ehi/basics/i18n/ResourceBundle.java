package ch.ehi.basics.i18n;

public class ResourceBundle {

  private ResourceBundle() {
  }

  /** transform a class name into a corresponding resource bundle name.
   * insert 'resources' into the given fully qualified classname.
   * @param 'ch.ehi.Text'
   * @returns 'ch.ehi.resources.Text'
   */
  public static String transformName(String className) {
    StringBuffer resourceName = new StringBuffer(className);
    resourceName.insert(className.lastIndexOf('.'),".resources");
    return resourceName.toString();
  }
  /** Get the appropriate ResourceBundle.
   * uses transformName to get the right bundle name.
   */
  public static java.util.ResourceBundle getBundle(Class aclass){
    return java.util.ResourceBundle.getBundle(transformName(aclass.getName()));
  }
}