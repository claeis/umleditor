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
 
import java.util.*;
import java.text.*;
/**
 * Set of reusable String Utilities.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public abstract class NlsUtils {
	public final static String DATE_EUROPE_PATTERN = "dd.MM.yyyy";
	public final static String TIME_24HOURS_PATTERN = "HH:mm:ss";	// 24 hours
/**
 * Bind a String with appropriate parameters.
 * For e.g. Pattern = "This are a {0} {1}"; tokens={new Integer(17),  "messages"}
 */
public static String formatMessage(String pattern, Object[] tokens) {
	MessageFormat msgFormatter = new MessageFormat(pattern);
	return MessageFormat.format(pattern, tokens);
}
/**
 * Bind a String with appropriate parameters.
 * For e.g. formatMessage("This is number {0}", 1)
 * @param pattern Complete String containing any Variables by {0}..{n}
 * @param arg0 int-value to be replaced in pattern
 */
public static String formatMessage(String pattern, int arg0) {
	Object[] tokens = { new Integer(arg0) };
	return formatMessage(pattern, tokens);
}
/**
 * Bind a String with appropriate parameters.
 * For e.g. Pattern = "This is an {0} message"; tokens={"english"}
 */
public static String formatMessage(String pattern, String arg0) {
	Object[] tokens = { arg0 };
	return formatMessage(pattern, tokens);
}
/**
 * Return a date in european format String.
 * @param date (GregorianCalendar now = new java.util.GregorianCalendar())
 */
public static String getEuropeanDateString(java.util.Date date) {
	java.text.SimpleDateFormat sf = new java.text.SimpleDateFormat(DATE_EUROPE_PATTERN); //"-HH:mm:ss"
	return sf.format(date);
}
/**
 * Return a date in european format String.
 * @param date (GregorianCalendar now = new java.util.GregorianCalendar())
 */
public static String getEuropeanDateString(GregorianCalendar date) {
	return getEuropeanDateString(date.getTime());
}
/**
 * Create a Timestamp in European Format.
 * @return String current Timestamp as String
 */
public static String getEuropeanTimestampString() {
	return getEuropeanTimestampString(new java.util.GregorianCalendar());
}
/**
 * Create a Timestamp in European Format.
 * @return String current Timestamp as String
 */
public static String getEuropeanTimestampString(java.util.Date date) {
	java.text.SimpleDateFormat sf = new java.text.SimpleDateFormat(DATE_EUROPE_PATTERN + " " + TIME_24HOURS_PATTERN);
	return sf.format(date);
}
/**
 * Create a Timestamp in European Format.
 * @return String current Timestamp as String
 */
public static String getEuropeanTimestampString(GregorianCalendar date) {
	return getEuropeanTimestampString(date.getTime());
}
/**
 * Return a date in localized format String.
 */
public static String getLocalizedDateString(GregorianCalendar date) {
	return DateFormat.getDateInstance().format(date.getTime());
}
/**
 * Return a Timestamp in localized format String.
 */
public static String getLocalizedTimestampString() {
	return getLocalizedTimestampString(new Date());
}
/**
 * Return a Timestamp in localized format String.
 */
public static String getLocalizedTimestampString(Date date) {
	return DateFormat.getDateTimeInstance().format(date);
}
/**
 * Return ClassName of an Instance without package path.
 */
public static String getPureClassName(Object object) {
	String className = object.getClass().getName();
	int index = className.lastIndexOf('.');
	return className.substring(index + 1, className.length());	
}
}
