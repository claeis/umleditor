// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-08-30 07:56:42 $
// $Revision: 1.3 $
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

