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
 * Show Developer failures.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public class DeveloperException extends RuntimeException {
	private static java.util.ResourceBundle resDeveloperException = java.util.ResourceBundle.getBundle("ch/softenvironment/nls/DeveloperException");  //$NON-NLS-1$
	private String message = null;
	private String title = null;
	private String errorObject = null;
	private String errorMethod = null;

	public static final String DEVELOPER_ERROR = resDeveloperException.getString("CTDevelopmentError"); //$NON-NLS-1$
/**
 * Construct a DeveloperException.
 */
public DeveloperException(Class aClass, String method, String message) {
	this(aClass, method, message, DEVELOPER_ERROR);
}
/**
 * Construct a DeveloperException.
 * @param aClass (Class where error happened)
 * @param method (producing the error)
 * @param title (Title for ErrorDialog)
 * @param message (Message for ErrorDialog)
 */
public DeveloperException(Class aClass, String method, String message, String title) {
	this(aClass, method, message, title, null);
}
/**
 * Construct a DeveloperException.
 * @param aClass Class where error happened
 * @param method producing the error
 * @param title Title for ErrorDialog
 * @param message Message for ErrorDialog
 * @param e Original Exception happened
 */
public DeveloperException(Class aClass, String method, String message, String title, Throwable e) {
	super();

	String msg = message;
	if (e != null) {
		msg = msg + "[Original fault: " + e.getMessage() + "]";
	}
	Tracer.getInstance().developerError(aClass, method, msg);
	this.errorObject = aClass.getName();
	this.errorMethod = method;
	this.message = msg;
	if (title == null) {
		this.title = DEVELOPER_ERROR;
	} else {
		this.title = title;
	}
}
/**
 * Construct a DeveloperException.
 */
public DeveloperException(Object object, String method, String message) {
	this(object, method, message, DEVELOPER_ERROR);
}
/**
 * Construct a DeveloperException.
 * @param title (Title for ErrorDialog)
 * @param message (Message for ErrorDialog)
 */
public DeveloperException(Object errorObject, String errorMethod, String message, String title) {
	this(errorObject, errorMethod, message, title, null);
}
/**
 * Construct a DeveloperException.
 * @param title (Title for ErrorDialog)
 * @param message (Message for ErrorDialog)
 */
public DeveloperException(Object errorObject, String errorMethod, String message, String title, Throwable e) {
	this(errorObject.getClass(), errorMethod, message, title, e);
}
public String getMessage() {
	return message + "\n" + resDeveloperException.getString("CISource") + errorObject + "." + errorMethod;//$NON-NLS-3$ //$NON-NLS-2$//$NON-NLS-1$
}
public String getTitle() {
	return title;
}
public String toString() {
    String s = getClass().getName();
    return (message != null) ? (s + ": " + message) : s;//$NON-NLS-1$
}
}
