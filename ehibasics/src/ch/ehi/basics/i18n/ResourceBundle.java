package ch.ehi.basics.i18n;

public class ResourceBundle {
	private final static String RESOURCES_DIRECTORY = "resources";
  private ResourceBundle() {
  }
  /** Get the appropriate ResourceBundle.
   * uses transformName to get the right bundle name.
   */
  public static java.util.ResourceBundle getBundle(Class baseClass){
    return java.util.ResourceBundle.getBundle(transformName(baseClass.getName()));
  }
  /** 
   * Get the appropriate ResourceBundle for a given Locale.
   * Uses transformName() to get the right bundle name.
   */
  public static java.util.ResourceBundle getBundle(java.lang.Class baseClass, java.util.Locale locale) {
    return java.util.ResourceBundle.getBundle(transformName(baseClass.getName()), locale);
  }
/**
 * Return an ImageIcon in a Package named "resources" relative to
 * the given Class' path.
 * @return ImageIcon
 */
public static javax.swing.ImageIcon getImageIcon(Class aClass, String imageFileName) {
	String className = aClass.getName();
	int index = className.lastIndexOf('.');
	String file = className.substring(0, index).replace('.', '/') + "/" + RESOURCES_DIRECTORY + "/" + imageFileName;	
	
	// var I) from IDE with relative FileSystem or compiled within Jar
	java.net.URL url = aClass.getResource("/" + file);

	// var II) from JAR with External FileSystem
	//	java.net.URL url = getClass().getResource(file);

	return new javax.swing.ImageIcon(url);
}
  /** transform a class name into a corresponding resource bundle name.
   * insert 'resources' into the given fully qualified classname.
   * @param 'ch.ehi.Text'
   * @returns 'ch.ehi.resources.Text'
   */
  public static String transformName(String className) {
    StringBuffer resourceName = new StringBuffer(className);
    resourceName.insert(className.lastIndexOf('.'), "." + RESOURCES_DIRECTORY);
    return resourceName.toString();
  }
}
