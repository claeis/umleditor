package ch.softenvironment.util;

/* 
 *This file is part of the UML/INTERLIS-Editor.
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
 */
 
/**
 * Interface for a minimal UserProfile resp. User-Settings for a specific Application.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public interface UserSettings {
	public static final String BLUEWIN = "mail.bluewin.ch";
/**
 * Return whether the User is allowed to use Application or not.
 * @return boolean 
 */
public boolean getActive();
/**
 * Return whether the User is the Administrator himself.
 * @return boolean 
 */
public boolean getAdmin();
/**
 * Return the User's Country.
 * @return String (for e.g. "CH", "FR", etc)
 * @see java.util.Locale
 */
public String getCountry();
/**
 * Return the User's working language with the Application.
 * @return java.lang.String (for e.g. "de", "fr" etc)
 * @see java.util.Locale
 */
public String getLanguage();
/**
 * Gets the 'Look & Feel' property (java.lang.String) value.
 * @return The language property value.
 * @see BaseFrame#setLookAndFeel(String)
 */
public java.lang.String getLookAndFeel();
/**
 * Return the e-Mail Provider host to send e-Mails.
 * @return java.lang.String (for e.g. "mail.bluewin.ch")
 */
public String getProviderSMTP();
/**
 * Return the User's id, by means the login Id to the current application.
 * @return String (for e.g. "phirzel")
 * @see java.util.Locale
 */
public String getUserId();
/**
 * Return the WorkingDirectory of the current application.
 * @return String (for e.g. "C:\\TEMP")
 * @see java.util.Locale
 */
public String getWorkingDirectory();
/**
 * Save the UserProfile.
 */
public void save() throws Throwable;
}
