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
import java.io.*;
import ch.softenvironment.util.*;
/**
 * Manage the Application Settings for a single UserProfile.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2003-12-25 10:54:37 $
 */
public class UserSettings extends java.util.Properties implements ch.softenvironment.util.UserSettings {
	// values for Key-Values
	private final static String TRUE = "TRUE";
	private final static String FALSE = "FALSE";
	private final static String HOME_DIRECTORY = "user.home";
	// default Settings filename
	private final static String SETTINGS_FILE = System.getProperty(HOME_DIRECTORY) + "/.umleditor";

	// Property Keys (non-NLS)
	// @see getKeySet()
	private final static String LOOK_AND_FEEL = "LOOK_AND_FEEL";
	private final static String BACKGROUND_COLOR = "BACKGROUND_COLOR";
	private final static String DIAGRAM_HEIGHT = "DIAGRAM_HEIGHT";
	private final static String DIAGRAM_WIDTH = "DIAGRAM_WIDTH";
	private final static String FONT = "FONT";
	private final static String FOREGROUND_COLOR = "FOREGROUND_COLOR";
	private final static String IMPORT_DIRECTORY = "IMPORT_DIRECTORY";
	private final static String LANGUAGE = "LANGUAGE";
	private final static String COUNTRY = "COUNTRY";
	private final static String SHOW_LOG_VIEW = "SHOW_LOG_VIEW";
	private final static String SHOW_STATUS_BAR = "SHOW_STATUS_BAR";
	private final static String SHOW_TOOLBAR = "SHOW_TOOLBAR";
	private final static String WORKING_DIRECTORY = "WORKING_DIRECTORY";
	private final static String LAST_FILES = "LAST_FILES";
	private final static String QUERY_DELETION = "QUERY_DELETION";
	private final static String CONNECTOR_ZONE = "CONNECTOR_ZONE";
	private final static String NAVTREE_SORT = "NAVTREE_SORT";
	private final static String WINDOW_HEIGHT = "WINDOW_HEIGHT";
	private final static String WINDOW_WIDTH = "WINDOW_WIDTH";
	private final static String WINDOW_X = "WINDOW_X";
	private final static String WINDOW_Y = "WINDOW_Y";
//	private final static String NAVTREE_HEIGHT = "NAVTREE_HEIGHT";
//	private final static String NAVTREE_WIDTH = "NAVTREE_WIDTH";
	private final static String LOG_HEIGHT = "LOG_HEIGHT";
//	private final static String LOG_WIDTH = "LOG_WIDTH";
	private final static String DESCRIPTION_HEIGHT = "DESCRIPTION_HEIGHT";
	private final static String DESCRIPTION_WIDTH = "DESCRIPTION_WIDTH";
/**
 * UserSettings constructor comment.
 */
private UserSettings() {
	super();
}
/**
 * Instantiates and loads the UserSettings.
 * @see getKeySet()
 */
protected static UserSettings createDefault() {
	UserSettings userSettings = new UserSettings();
	int windowHeight = 570;

	userSettings.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
	userSettings.setBackgroundColor(java.awt.Color.white);
	userSettings.setDiagramHeight(new Integer(300));
	userSettings.setDiagramWidth(new Integer(450));
	userSettings.setFont("Monospaced-BOLD-9");
	userSettings.setForegroundColor(java.awt.Color.black);
	userSettings.setImportDirectory(System.getProperty(HOME_DIRECTORY));
	userSettings.setLanguage(java.util.Locale.GERMAN.getLanguage());
	userSettings.setCountry("CH");
	userSettings.setShowLogView(new Boolean(true));
	userSettings.setShowStatusBar(new Boolean(true));
	userSettings.setShowToolBar(new Boolean(true));
	userSettings.setWorkingDirectory(System.getProperty(HOME_DIRECTORY));
	userSettings.setLastFiles("");
	userSettings.setConnectorZone(new Integer(10));

	userSettings.setNavigationSort(NavigationTreeModel.SORT_BY_KIND_NAME);
	userSettings.setWindowHeight(new Integer(windowHeight));
	userSettings.setWindowWidth(new Integer(850));
	userSettings.setWindowX(new Integer(10));
	userSettings.setWindowY(new Integer(10));
//	userSettings.setNavigationHeight(new Integer(10));
//	userSettings.setNavigationWidth(new Integer(160));
	userSettings.setLogHeight(new Integer(160));
//	userSettings.setLogWidth(new Integer(10));
	userSettings.setDescriptionHeight(new Integer(270));
	userSettings.setDescriptionWidth(new Integer(200));

    return userSettings;
}
/**
 * Return whether the User is allowed to use Application or not.
 * @return boolean
 */
public boolean getActive() {
	return true;
}
/**
 * Return whether the User is the Administrator himself.
 * @return boolean
 */
public boolean getAdmin() {
	return false;
}
/**
 * Gets the backgroundColor property (java.awt.Color) value.
 * @return The backgroundColor property value.
 * @see #setBackgroundColor
 */
public java.awt.Color getBackgroundColor() {
	return new java.awt.Color(new Integer(getProperty(BACKGROUND_COLOR)).intValue());
}
/**
 *
 * @return Integer
 * @see #setConnectorZone
 */
public java.lang.Integer getConnectorZone() {
	return new Integer(getProperty(CONNECTOR_ZONE));
}
/**
 * Gets the Country property (java.lang.String) value.
 * @return The Country String
 * @see #setCountry
 */
public java.lang.String getCountry() {
	return getProperty(COUNTRY);
}
/**
 * Return property.
 */
public java.lang.Integer getDescriptionHeight() {
	return new Integer(getProperty(DESCRIPTION_HEIGHT));
}
/**
 * Return property.
 */
public java.lang.Integer getDescriptionWidth() {
	return new Integer(getProperty(DESCRIPTION_WIDTH));
}
/**
 * Gets the diagramHeight property (java.lang.Integer) value.
 * @return The diagramHeight property value.
 * @see #setDiagramHeight
 */
public java.lang.Integer getDiagramHeight() {
	return new Integer(getProperty(DIAGRAM_HEIGHT));
}
/**
 * Gets the diagramWidth property (java.lang.Integer) value.
 * @return The diagramWidth property value.
 * @see #setDiagramWidth
 */
public java.lang.Integer getDiagramWidth() {
	return new Integer(getProperty(DIAGRAM_WIDTH));
}
/**
 * Gets the font property (java.lang.String) value.
 * @return The font property value.
 * @see #setFont
 */
public String getFont() {
	return getProperty(FONT);
}
/**
 * Gets the foregroundColor property (java.awt.Color) value.
 * @return The foregroundColor property value.
 * @see #setForegroundColor
 */
public java.awt.Color getForegroundColor() {
	return new java.awt.Color(new Integer(getProperty(FOREGROUND_COLOR)).intValue());
}
/**
 * Gets the importDirectory property (java.lang.String) value.
 * @return The importDirectory property value.
 * @see #setImportDirectory
 */
public java.lang.String getImportDirectory() {
	return getProperty(IMPORT_DIRECTORY);
}
/**
 * @return all keys managed by Settings.
 * @see class definition
 * @see createDefault()
 */
private static java.util.Set getKeySet() {
	java.util.Set set = new java.util.HashSet();
	set.add(LOOK_AND_FEEL);
	set.add(BACKGROUND_COLOR);
	set.add(DIAGRAM_HEIGHT);
	set.add(DIAGRAM_WIDTH);
	set.add(FONT);
	set.add(FOREGROUND_COLOR);
	set.add(IMPORT_DIRECTORY);
	set.add(LANGUAGE);
	set.add(COUNTRY);
	set.add(SHOW_LOG_VIEW);
	set.add(SHOW_STATUS_BAR);
	set.add(SHOW_TOOLBAR);
	set.add(WORKING_DIRECTORY);
	set.add(LAST_FILES);
	set.add(QUERY_DELETION);
	set.add(CONNECTOR_ZONE);
	set.add(NAVTREE_SORT);
	set.add(WINDOW_HEIGHT);
	set.add(WINDOW_WIDTH);
	set.add(WINDOW_X);
	set.add(WINDOW_Y);
//	set.add(NAVTREE_HEIGHT);
//	set.add(NAVTREE_WIDTH);
	set.add(LOG_HEIGHT);
//	set.add(LOG_WIDTH);
	set.add(DESCRIPTION_HEIGHT);
	set.add(DESCRIPTION_WIDTH);

	return set;
}
/**
 * Gets the language property (java.lang.String) value.
 * @return The language property value.
 * @see #setLanguage
 */
public java.lang.String getLanguage() {
	return getProperty(LANGUAGE);
}
/**
 * Gets the lastFiles opened property (java.lang.String) value.
 * @see #setWorkingDirectory
 */
public java.lang.String getLastFiles() {
	return getProperty(LAST_FILES);
}
/**
 * Return property.
 */
public java.lang.Integer getLogHeight() {
	return new Integer(getProperty(LOG_HEIGHT));
}
/**
 * Gets the 'Look & Feel' property (java.lang.String) value.
 * @return The language property value.
 * @see #setLookAndFeel(String)
 */
public java.lang.String getLookAndFeel() {
	return getProperty(LOOK_AND_FEEL);
}
/**
 * Return property.
 */
public java.lang.String getNavigationSort() {
	return getProperty(NAVTREE_SORT);
}
/**
 * Return the e-Mail Provider host to send e-Mails.
 * @return java.lang.String (for e.g. "mail.bluewin.ch")
 */
public java.lang.String getProviderSMTP() {
	return null;
}
/**
 * Gets the showLogView property (java.lang.Boolean) value.
 * @return The showLogView property value.
 * @see #setShowLogView
 * @deprecated
 */
public java.lang.Boolean getShowLogView() {
//	return Boolean.valueOf(getProperty(SHOW_LOG_VIEW));
	return Boolean.TRUE;
}
/**
 * Gets the showStatusBar property (java.lang.Boolean) value.
 * @return The showStatusBar property value.
 * @see #setShowStatusBar
 */
public java.lang.Boolean getShowStatusBar() {
	return Boolean.valueOf(getProperty(SHOW_STATUS_BAR));
}
/**
 * Gets the showToolBar property (java.lang.Boolean) value.
 * @return The showToolBar property value.
 * @see #setShowToolBar
 */
public java.lang.Boolean getShowToolBar() {
	return Boolean.valueOf(getProperty(SHOW_TOOLBAR));
}
/**
 * Return the User's id, by means the login Id to the current application.
 * @return String (for e.g. "phirzel")
 * @see java.util.Locale
 */
public java.lang.String getUserId() {
	// there is no specific User or Login-Id
	return "<NONE>";
}
/**
 * Return property.
 */
public java.lang.Integer getWindowHeight() {
	return new Integer(getProperty(WINDOW_HEIGHT));
}
/**
 * Return property.
 */
public java.lang.Integer getWindowWidth() {
	return new Integer(getProperty(WINDOW_WIDTH));
}
/**
 * Return property.
 */
public java.lang.Integer getWindowX() {
	return new Integer(getProperty(WINDOW_X));
}
/**
 * Return property.
 */
public java.lang.Integer getWindowY() {
	return new Integer(getProperty(WINDOW_Y));
}
/**
 * Gets the workingDirectory property (java.lang.String) value.
 * @return The workingDirectory property value.
 * @see #setWorkingDirectory
 */
public java.lang.String getWorkingDirectory() {
	return getProperty(WORKING_DIRECTORY);
}
/**
 * Instantiates and loads the UserSettings.
 */
public static UserSettings load() /*throws FileNotFoundException, IOException, ClassNotFoundException*/ {

	UserSettings userSettings = createDefault();
	try {
	    FileInputStream inputStream = new FileInputStream(SETTINGS_FILE);
		UserSettings tmp = new UserSettings();
		tmp.load(inputStream);

		// try to reuse given keys
		// copy mechanism makes sure newer Versions of this Class
		// with additional keys cause no problems
		java.util.Iterator keys = getKeySet().iterator();
		while (keys.hasNext()) {
			String key = (String)keys.next();
			if (tmp.containsKey(key)) {
				userSettings.setProperty(key, tmp.getProperty(key));
			}
		}

		// set the Locale
                // doesn't belong to UserSettings
                // ce2003-03-06 don't change Locale!!!
		// java.util.Locale.setDefault(new java.util.Locale(tmp.getLanguage(), tmp.getCountry()));
		// Tracer.getInstance().runtimeInfo("Locale is: " + java.util.Locale.getDefault().toString());
	} catch(Throwable e) {
		Tracer.getInstance().runtimeWarning(UserSettings.class, "load()", "no UserSettings found -> default");
	}

    return userSettings;
}
/**
 * Saves the UserSettings.
 */
public void save() {
	try {
	    FileOutputStream outputStream = new FileOutputStream(SETTINGS_FILE);
	    super.store(outputStream, LauncherView.getApplicationName());
	} catch(IOException e) {
		LauncherView.getInstance().handleException(e);
	}
}
/**
 * Sets the backgroundColor property (java.awt.Color) value.
 * @param backgroundColor The new value for the property.
 * @see #getBackgroundColor
 */
public void setBackgroundColor(java.awt.Color backgroundColor) {
	setProperty(BACKGROUND_COLOR, (new Integer(backgroundColor.getRGB())).toString());
}
/**
 * Sets the sensitive Area length of Dragging an Edge to another Node,
 * by means Distance between Node-Connector and Edge.
 * @param int length of Square.
 * @see #getConnectorZone
 * @see DelegationSelectionTool#isWithinRange(Point, int, int)
 */
public void setConnectorZone(Integer squareSide) {
	setProperty(CONNECTOR_ZONE, squareSide.toString());
}
/**
 * Sets the Country property (java.lang.String) value.
 * @param language (for e.g. "CH"; "FR", etc)
 * @see #getCountry
 */
public void setCountry(java.lang.String country) {
	setProperty(COUNTRY, country);
}
/**
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setDescriptionHeight(java.lang.Integer value) {
	setProperty(DESCRIPTION_HEIGHT, value.toString());
}
/**
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setDescriptionWidth(java.lang.Integer value) {
	setProperty(DESCRIPTION_WIDTH, value.toString());
}
/**
 * Sets the diagramHeight property (java.lang.Integer) value.
 * @param diagramHeight The new value for the property.
 * @see #getDiagramHeight
 */
public void setDiagramHeight(java.lang.Integer diagramHeight) {
	setProperty(DIAGRAM_HEIGHT, diagramHeight.toString());
}
/**
 * Sets the diagramWidth property (java.lang.Integer) value.
 * @param diagramWidth The new value for the property.
 * @see #getDiagramWidth
 */
public void setDiagramWidth(java.lang.Integer diagramWidth) {
	setProperty(DIAGRAM_WIDTH, diagramWidth.toString());
}
/**
 * Sets the font property (java.lang.String) value.
 * This Font is used for graphical nodes and edges.
 * @param font The new value for the property.
 * @see #getFont
 */
public void setFont(String font) {
	setProperty(FONT, font);
}
/**
 * Sets the foregroundColor property (java.awt.Color) value.
 * @param foregroundColor The new value for the property.
 * @see #getForegroundColor
 */
public void setForegroundColor(java.awt.Color foregroundColor) {
	setProperty(FOREGROUND_COLOR, (new Integer(foregroundColor.getRGB())).toString());
}
/**
 * Sets the importDirectory property (java.lang.String) value.
 * @param importDirectory The new value for the property.
 * @see #getImportDirectory
 */
public void setImportDirectory(java.lang.String importDirectory) {
	setProperty(IMPORT_DIRECTORY, importDirectory);
}
/**
 * Sets the language property (java.lang.String) value.
 * @param language (for e.g. "de"; "fr", etc)
 * @see #getLanguage
 */
public void setLanguage(java.lang.String language) {
	setProperty(LANGUAGE, language);
}
/**
 * Sets the lastFiles opened property (java.lang.String) value.
 * @param 0..n Files separated by Semikolon ';'.
 * @see #getLastFiles
 */
public void setLastFiles(java.lang.String lastFiles) {
	setProperty(LAST_FILES, lastFiles);
}
/**
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setLogHeight(java.lang.Integer value) {
	setProperty(LOG_HEIGHT, value.toString());
}
/**
 * Sets the 'Look & Feel' property (java.lang.String) value.
 * This Font is used for graphical nodes and edges.
 * @param font The new value for the property.
 * @see #getLookAndFeel
 */
public void setLookAndFeel(String string) {
	setProperty(LOOK_AND_FEEL, string);
}
/**
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setNavigationSort(java.lang.String value) {
	setProperty(NAVTREE_SORT, value);
}
/**
 * Sets the showLogView property (java.lang.Boolean) value.
 * @param showLogView The new value for the property.
 * @see #getShowLogView
 * @deprecated
 */
public void setShowLogView(java.lang.Boolean showLogView) {
	setProperty(SHOW_LOG_VIEW, showLogView.toString());
}
/**
 * Sets the showStatusBar property (java.lang.Boolean) value.
 * @param showStatusBar The new value for the property.
 * @see #getShowStatusBar
 */
public void setShowStatusBar(java.lang.Boolean showStatusBar) {
	setProperty(SHOW_STATUS_BAR, showStatusBar.toString());
}
/**
 * Sets the showToolBar property (java.lang.Boolean) value.
 * @param showToolBar The new value for the property.
 * @see #getShowToolBar
 */
public void setShowToolBar(java.lang.Boolean showToolBar) {
	setProperty(SHOW_TOOLBAR, showToolBar.toString());
}
/**
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setWindowHeight(java.lang.Integer value) {
	setProperty(WINDOW_HEIGHT, value.toString());
}
/**
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setWindowWidth(java.lang.Integer value) {
	setProperty(WINDOW_WIDTH, value.toString());
}
/**
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setWindowX(java.lang.Integer value) {
	setProperty(WINDOW_X, value.toString());
}
/**
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setWindowY(java.lang.Integer value) {
	setProperty(WINDOW_Y, value.toString());
}
/**
 * Sets the workingDirectory property (java.lang.String) value.
 * @param workingDirectory The new value for the property.
 * @see #getWorkingDirectory
 */
public void setWorkingDirectory(java.lang.String workingDirectory) {
	setProperty(WORKING_DIRECTORY, workingDirectory);
}
}
