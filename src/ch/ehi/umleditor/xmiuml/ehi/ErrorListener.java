// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-01 13:13:59 $
// $Revision: 1.2 $
//

package ch.ehi.umleditor.xmiuml.ehi;
import org.xml.sax.SAXParseException;
import org.xml.sax.SAXException;
import ch.softenvironment.util.Tracer;

public class ErrorListener implements org.xml.sax.ErrorHandler
{
public void error(SAXParseException err) throws SAXException
{
  Tracer.getInstance().debug("Parsing Error - Line: "+err.getLineNumber()+", URI: "+err.getSystemId()+", Message: "+err.getMessage());
	throw err;
}

public void fatalError(SAXParseException fatalErr) throws SAXException
{
	Tracer.getInstance().debug("Parsing FatalError - Line: "+fatalErr.getLineNumber()+", URI: "+fatalErr.getSystemId()+", Message: "+fatalErr.getMessage());
  throw fatalErr;
}

public void  warning (SAXParseException warning) throws SAXException
{
	Tracer.getInstance().debug("Parsing Warning - Line: "+warning.getLineNumber()+", URI: "+warning.getSystemId()+", Message: "+warning.getMessage());
}

}

