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

import ch.softenvironment.client.ApplicationOptions;
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
/**
 * Manage the Application Settings for a single UserProfile.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.5 $ $Date: 2005-02-03 14:31:37 $
 */
public class UserSettings extends ApplicationOptions implements ch.softenvironment.client.UserSettings {
<<<<<<< HEAD
=======
	
	private static final long serialVersionUID = -8354627375069216873L;
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	// Property Keys (non-NLS)
	// @see getKeySet()
	private final static String DIAGRAM_HEIGHT = "DIAGRAM_HEIGHT";
	private final static String DIAGRAM_WIDTH = "DIAGRAM_WIDTH";
	private final static String SHOW_LOG_VIEW = "SHOW_LOG_VIEW";
	private final static String WORKING_DIRECTORY = "WORKING_DIRECTORY";
	private final static String CONNECTOR_ZONE = "CONNECTOR_ZONE";
	private final static String NAVTREE_SORT = "NAVTREE_SORT";
<<<<<<< HEAD
//	private final static String NAVTREE_HEIGHT = "NAVTREE_HEIGHT";
//	private final static String NAVTREE_WIDTH = "NAVTREE_WIDTH";
	private final static String LOG_HEIGHT = "LOG_HEIGHT";
//	private final static String LOG_WIDTH = "LOG_WIDTH";
=======
	// private final static String NAVTREE_HEIGHT = "NAVTREE_HEIGHT";
	// private final static String NAVTREE_WIDTH = "NAVTREE_WIDTH";
	private final static String LOG_HEIGHT = "LOG_HEIGHT";
	// private final static String LOG_WIDTH = "LOG_WIDTH";
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
	private final static String DESCRIPTION_HEIGHT = "DESCRIPTION_HEIGHT";
	private final static String DESCRIPTION_WIDTH = "DESCRIPTION_WIDTH";
	public final static String ILIDIRS = ch.interlis.ili2c.gui.UserSettings.ILIDIRS;
	public final static String DEFAULT_ILIDIRS = "http://models.interlis.ch/";
	public final static String HTTP_PROXY_HOST = ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST;
	public final static String HTTP_PROXY_PORT = ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT;
<<<<<<< HEAD
	
/**
 * Create Default UserSettings.
 */
protected UserSettings() {
	super();
	
	int windowHeight = 570;

	setDiagramHeight(new Integer(300));
	setDiagramWidth(new Integer(450));
//	userSettings.setFont("Monospaced-BOLD-9");
//	userSettings.setImportDirectory(System.getProperty(HOME_DIRECTORY));
	// ce2004-06-23 should use system property as default
//	userSettings.setLanguage(java.util.Locale.GERMAN.getLanguage());
	// ce2004-06-23 should use system property as default
//	userSettings.setCountry("CH");
	setShowLogView(Boolean.TRUE);

	setConnectorZone(new Integer(10));

	setNavigationSort(NavigationTreeModel.SORT_BY_KIND_NAME);
	setWindowHeight(new Integer(windowHeight));
	setWindowWidth(new Integer(850));
//	userSettings.setNavigationHeight(new Integer(10));
//	userSettings.setNavigationWidth(new Integer(160));
	setLogHeight(new Integer(160));
//	userSettings.setLogWidth(new Integer(10));
	setDescriptionHeight(new Integer(270));
	setDescriptionWidth(new Integer(200));
	setIlidirs(DEFAULT_ILIDIRS);
}
public UserSettings(String filename) {
    super(filename, new UserSettings());
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
 * Return property.
 */
public java.lang.Integer getLogHeight() {
	return new Integer(getProperty(LOG_HEIGHT));
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
 * Sets a property (java.lang.String) value.
 * @param value
 */
public void setLogHeight(java.lang.Integer value) {
	setProperty(LOG_HEIGHT, value.toString());
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

public java.lang.String getIlidirs() {
	return getProperty(ILIDIRS);
}
public void setIlidirs(java.lang.String workingDirectory) {
	setProperty(ILIDIRS, workingDirectory);
}
public java.lang.String getHttpProxyHost() {
	return getProperty(HTTP_PROXY_HOST);
}
public void setHttpProxyHost(java.lang.String workingDirectory) {
	setProperty(HTTP_PROXY_HOST, workingDirectory);
}
public java.lang.String getHttpProxyPort() {
	return getProperty(HTTP_PROXY_PORT);
}
public void setHttpProxyPort(java.lang.String workingDirectory) {
	setProperty(HTTP_PROXY_PORT, workingDirectory);
}
=======

	/**
	 * Create Default UserSettings.
	 */
	protected UserSettings() {
		super();

		int windowHeight = 570;

		setDiagramHeight(new Integer(300));
		setDiagramWidth(new Integer(450));
		// userSettings.setFont("Monospaced-BOLD-9");
		// userSettings.setImportDirectory(System.getProperty(HOME_DIRECTORY));
		// ce2004-06-23 should use system property as default
		// userSettings.setLanguage(java.util.Locale.GERMAN.getLanguage());
		// ce2004-06-23 should use system property as default
		// userSettings.setCountry("CH");
		setShowLogView(Boolean.TRUE);

		setConnectorZone(new Integer(10));

		setNavigationSort(NavigationTreeModel.SORT_BY_KIND_NAME);
		setWindowHeight(new Integer(windowHeight));
		setWindowWidth(new Integer(850));
		// userSettings.setNavigationHeight(new Integer(10));
		// userSettings.setNavigationWidth(new Integer(160));
		setLogHeight(new Integer(160));
		// userSettings.setLogWidth(new Integer(10));
		setDescriptionHeight(new Integer(270));
		setDescriptionWidth(new Integer(200));
		setIlidirs(DEFAULT_ILIDIRS);
	}

	public UserSettings(String filename) {
		super(filename, new UserSettings());
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
	 * 
	 * @return The diagramHeight property value.
	 * @see #setDiagramHeight
	 */
	public java.lang.Integer getDiagramHeight() {
		return new Integer(getProperty(DIAGRAM_HEIGHT));
	}

	/**
	 * Gets the diagramWidth property (java.lang.Integer) value.
	 * 
	 * @return The diagramWidth property value.
	 * @see #setDiagramWidth
	 */
	public java.lang.Integer getDiagramWidth() {
		return new Integer(getProperty(DIAGRAM_WIDTH));
	}

	/**
	 * Return property.
	 */
	public java.lang.Integer getLogHeight() {
		return new Integer(getProperty(LOG_HEIGHT));
	}

	/**
	 * Return property.
	 */
	public java.lang.String getNavigationSort() {
		return getProperty(NAVTREE_SORT);
	}

	/**
	 * Return the e-Mail Provider host to send e-Mails.
	 * 
	 * @return java.lang.String (for e.g. "mail.bluewin.ch")
	 */
	public java.lang.String getProviderSMTP() {
		return null;
	}

	/**
	 * Gets the showLogView property (java.lang.Boolean) value.
	 * 
	 * @return The showLogView property value.
	 * @see #setShowLogView
	 * @deprecated
	 */
	public java.lang.Boolean getShowLogView() {
		// return Boolean.valueOf(getProperty(SHOW_LOG_VIEW));
		return Boolean.TRUE;
	}

	/**
	 * Sets the sensitive Area length of Dragging an Edge to another Node, by
	 * means Distance between Node-Connector and Edge.
	 * 
	 * @param int
	 *            length of Square.
	 * @see #getConnectorZone
	 * @see DelegationSelectionTool#isWithinRange(Point, int, int)
	 */
	public void setConnectorZone(Integer squareSide) {
		setProperty(CONNECTOR_ZONE, squareSide.toString());
	}

	/**
	 * Sets a property (java.lang.String) value.
	 * 
	 * @param value
	 */
	public void setDescriptionHeight(java.lang.Integer value) {
		setProperty(DESCRIPTION_HEIGHT, value.toString());
	}

	/**
	 * Sets a property (java.lang.String) value.
	 * 
	 * @param value
	 */
	public void setDescriptionWidth(java.lang.Integer value) {
		setProperty(DESCRIPTION_WIDTH, value.toString());
	}

	/**
	 * Sets the diagramHeight property (java.lang.Integer) value.
	 * 
	 * @param diagramHeight
	 *            The new value for the property.
	 * @see #getDiagramHeight
	 */
	public void setDiagramHeight(java.lang.Integer diagramHeight) {
		setProperty(DIAGRAM_HEIGHT, diagramHeight.toString());
	}

	/**
	 * Sets the diagramWidth property (java.lang.Integer) value.
	 * 
	 * @param diagramWidth
	 *            The new value for the property.
	 * @see #getDiagramWidth
	 */
	public void setDiagramWidth(java.lang.Integer diagramWidth) {
		setProperty(DIAGRAM_WIDTH, diagramWidth.toString());
	}

	/**
	 * Sets a property (java.lang.String) value.
	 * 
	 * @param value
	 */
	public void setLogHeight(java.lang.Integer value) {
		setProperty(LOG_HEIGHT, value.toString());
	}

	/**
	 * Sets a property (java.lang.String) value.
	 * 
	 * @param value
	 */
	public void setNavigationSort(java.lang.String value) {
		setProperty(NAVTREE_SORT, value);
	}

	/**
	 * Sets the showLogView property (java.lang.Boolean) value.
	 * 
	 * @param showLogView
	 *            The new value for the property.
	 * @see #getShowLogView
	 * @deprecated
	 */
	public void setShowLogView(java.lang.Boolean showLogView) {
		setProperty(SHOW_LOG_VIEW, showLogView.toString());
	}

	public java.lang.String getIlidirs() {
		return getProperty(ILIDIRS);
	}

	public void setIlidirs(java.lang.String workingDirectory) {
		setProperty(ILIDIRS, workingDirectory);
	}

	public java.lang.String getHttpProxyHost() {
		return getProperty(HTTP_PROXY_HOST);
	}

	public void setHttpProxyHost(java.lang.String workingDirectory) {
		setProperty(HTTP_PROXY_HOST, workingDirectory);
	}

	public java.lang.String getHttpProxyPort() {
		return getProperty(HTTP_PROXY_PORT);
	}

	public void setHttpProxyPort(java.lang.String workingDirectory) {
		setProperty(HTTP_PROXY_PORT, workingDirectory);
	}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9

}
