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
 * Global Tracer.
 * Design Pattern: Singleton
 *
 * This Tracer is meant to be a development tool,
 * to trace any Information while running an Application.
 * This Tool is not foreseen for NLS-Support.
 * @author: Peter Hirzel <i>soft</i>Environment
 */
public class Tracer {
	// Mode's
	public final static int SILENT = 1;
	public final static int NORMAL = 2;
	public final static int DEBUG = 3;
	public final static int TRACE_SQL = 4;
	public final static int ALL = 5;
	
	private static Tracer instance = null;
	private java.io.PrintStream outStream = null;
	private int mode = SILENT;
/**
 * Tracer constructor.
 * @see start(..)
 */
private Tracer() {
	super();
}
/**
 * Log a debug message.
 */
public void debug(Object obj, String methodName, String comment) {
	if ((mode == DEBUG) || (mode == ALL)) {
		log("Debug: ", obj, methodName, comment);
	}
}
/**
 * Log a debug message.
 */
public void debug(String comment) {
	if ((mode == DEBUG) || (mode == ALL)) {
		log("Debug: " + comment);
	}
}
/**
 * Log Developer Errors.
 */
public void developerError(Object obj, String methodName, String comment) {
	if ((mode == DEBUG) || (mode == ALL)) {
		log("Developer Error: ", obj, methodName, comment);
	}
}
/**
 * Log developer Warnings.
 */
public void developerWarning(Object obj, String methodName, String comment) {
	if ((mode == DEBUG) || (mode == ALL)) {
		log("Developer Warning: ", obj, methodName, comment);
	}
}
/**
 * @return console-out Stream
 */
public static java.io.OutputStream getConsoleOut() {
	return System.out;
}
/**
 * @return The Singleton Tracer.
 */
public static Tracer getInstance() {
	if (instance == null) {
		start(SILENT);
	}
	return instance;
}
/**
 * Trace Nasty codings.
 */
public void hack(Object obj, String methodName, String comment) {
	if (mode == ALL) {
		// for e.g. hack(..., ..., "recode this..");
		log("Hack:", obj, methodName, comment);
	}
}
/**
 * Print Log-Infos with leading Timestamp.
 */
private void log(String logMessage) {
	if (mode != SILENT) {
		outStream.println(NlsUtils.getEuropeanTimestampString() + ">" + logMessage);
	}
}
/**
 * Print Log-Infos.
 */
private void log(String errorType, Object obj, String methodName, String comment) {
	log(errorType + "->" + comment + " in <" + (obj == null ? "<null>" : obj.getClass().getName()) + "#" + methodName + ">");
}
/**
 * Keep Not Yet Implemented code references.
 */
public void nyi(Object obj, String methodName) {
	nyi(obj, methodName, null);
}
/**
 * Keep Not Yet Implemented code references.
 */
public void nyi(Object obj, String methodName, String comment) {
	if ((mode == DEBUG) || (mode == ALL)) {
		log("Not yet implemented:", obj, methodName, comment);
	}
}
/**
 * Keep temporary fixes references.
 */
public void patch(Object obj, String methodName, String comment) {
	if (mode == ALL) {
		log("Patch:", obj, methodName, comment);
	}
}
/**
 * Log Errors during runtime.
 */
public void runtimeError(Object obj, String methodName, String comment) {
	log("Runtime Error:", obj, methodName, comment);
}
/**
 * Log Warnings during runtime.
 */
public void runtimeInfo(String comment) {
	log("Info: " + comment);
}
/**
 * Log Warnings during runtime.
 */
public void runtimeWarning(Object obj, String methodName, String comment) {
	log("Runtime Warning:", obj, methodName, comment);
}
/**
 * Log an SQL-message.
 */
public void sql(Object obj, String methodName, String sqlString) {
	sql(sqlString);
}
/**
 * Log an SQL-message.
 */
public void sql(String sqlString) {
	if ((mode == TRACE_SQL) || (mode == ALL)) {
		log("SQL: " + sqlString);
	}
}
/**
 * Start Tracer and use ConsoleOut.
 * @param args Command line arguments ("-silent", "-trace" or "-debug")
 */
public static void start(java.lang.String[] args) {
	int mode = SILENT;	// default
	
	if (args != null) {
		int counter = 0;
		while (counter < args.length) {
			String option = args[counter++];
			if (option.equalsIgnoreCase("-debug")) {
				mode = DEBUG;
				break;
			} else if (option.equalsIgnoreCase("-trace")) {
				mode = NORMAL;
				break;
			} else if (option.equalsIgnoreCase("-traceSQL")) {
				mode = TRACE_SQL;
				break;
			} else if (option.equalsIgnoreCase("-all")) {
				mode = ALL;
				break;
			}
		}
	}
	start((java.io.PrintStream)getConsoleOut(), mode);
}
/**
 * Start Tracer and use ConsoleOut.
 */
public static void start(int mode) {
	start((java.io.PrintStream)getConsoleOut(), mode);
}
/**
 * Start Tracer.
 * @param stream Outstream for logging
 * @param traceOn (whether silent or not) 
 */
public static void start(java.io.PrintStream stream, int mode) {
	instance = new Tracer();
	instance.outStream = stream;
	instance.mode = mode;
	instance.debug("START Tracer");
	instance.debug("Java Version: " + System.getProperty("java.version"));
	instance.debug("Java VM Version: " + System.getProperty("java.vm.version"));
}
/**
 * Stop Tracer.
 */
public void stop() {
//	try {
		debug("STOP Tracer");
		outStream.close();
		instance = null;
/*	} catch(java.io.IOException e) {
		e.printStackTrace(System.out);
	}
*/
}
/**
 * Keep reference to tuning potential in code.
 */
public void tune(Object obj, String methodName, String comment) {
	if (mode == ALL) {
		// for e.g. tune(..., ..., "slow");
		log("Tune:", obj, methodName, comment);
	}
}
/**
 * Use this message to trace non-visually handled exceptions which
 * might be ignored during application run.
 */
public void uncaughtException(Object obj, String methodName, Throwable exception) {
	exception.printStackTrace(outStream);
	log("Uncaught Exception:", obj, methodName, exception.toString());
}
}
