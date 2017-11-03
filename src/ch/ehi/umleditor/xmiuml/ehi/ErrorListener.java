// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2005-02-21 15:54:12 $
// $Revision: 1.4 $
//

package ch.ehi.umleditor.xmiuml.ehi;
<<<<<<< HEAD
=======

>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
import org.xml.sax.SAXParseException;
import org.xml.sax.SAXException;
import ch.softenvironment.util.Tracer;
import ch.ehi.basics.logging.EhiLogger;

<<<<<<< HEAD
public class ErrorListener implements org.xml.sax.ErrorHandler
{
public void error(SAXParseException err) throws SAXException
{
	EhiLogger.traceUnusualState("Parsing Error - Line: "+err.getLineNumber()+", URI: "+err.getSystemId()+", Message: "+err.getMessage());
}

public void fatalError(SAXParseException fatalErr) throws SAXException
{
	EhiLogger.traceUnusualState("Parsing FatalError - Line: "+fatalErr.getLineNumber()+", URI: "+fatalErr.getSystemId()+", Message: "+fatalErr.getMessage());
  throw fatalErr;
}

public void  warning (SAXParseException warning) throws SAXException
{
	EhiLogger.traceUnusualState("Parsing Warning - Line: "+warning.getLineNumber()+", URI: "+warning.getSystemId()+", Message: "+warning.getMessage());
}

}

=======
public class ErrorListener implements org.xml.sax.ErrorHandler {
	public void error(SAXParseException err) throws SAXException {
		EhiLogger.traceUnusualState("Parsing Error - Line: " + err.getLineNumber() + ", URI: " + err.getSystemId()
				+ ", Message: " + err.getMessage());
	}

	public void fatalError(SAXParseException fatalErr) throws SAXException {
		EhiLogger.traceUnusualState("Parsing FatalError - Line: " + fatalErr.getLineNumber() + ", URI: "
				+ fatalErr.getSystemId() + ", Message: " + fatalErr.getMessage());
		throw fatalErr;
	}

	public void warning(SAXParseException warning) throws SAXException {
		EhiLogger.traceUnusualState("Parsing Warning - Line: " + warning.getLineNumber() + ", URI: "
				+ warning.getSystemId() + ", Message: " + warning.getMessage());
	}

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
