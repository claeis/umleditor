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
 * Set of reusable String Utilities.
 * 2002  Peter Hirzel <i>soft</i>Environment
 */
public abstract class StringUtils {
/**
 * Return a String representation of a boolean.
 * @return X => true; <emptyString> => false
 */
public static String getBooleanString(boolean value) {
	if (value) {
		return "Ja";
	} else {
		return "Nein";
	}
}
/**
 * Return PackageName of given class.
 */
public static String getPackageName(java.lang.Class type) {
	String className = type.getName();
	int index = className.lastIndexOf('.');
	return className.substring(0, index);	
}
/**
 * Return PackageName of an Instance.
 */
public static String getPackageName(Object object) {
	return getPackageName(object.getClass());	
}
/**
 * Return ClassName of given class without package path.
 */
public static String getPureClassName(java.lang.Class type) {
	String className = type.getName();
	int index = className.lastIndexOf('.');
	return className.substring(index + 1, className.length());	
}
/**
 * Return ClassName of an Instance without package path.
 */
public static String getPureClassName(Object object) {
	return getPureClassName(object.getClass());
}
/**
 * Return whether String is null or contains nothing.
 * @return boolean
 */
public static String getString(String value) {
	return value == null ? new String() : value;
}
/**
 * Return whether String is null or contains nothing.
 * @return boolean
 */
public static boolean isNullOrEmpty(String value) {
	return ((value == null) || (value.length() == 0));
}
}
