// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:41:28 $
// $Revision: 1.1.1.1 $
//

package ch.ehi.umleditor.xmiuml.ehi;
import org.xml.sax.SAXParseException;
import org.xml.sax.SAXException;

public class ErrorListener implements org.xml.sax.ErrorHandler
{
public void error(SAXParseException err) throws SAXException
{
  System.out.println("Parsing Error - Line: "+err.getLineNumber()+", URI: "+err.getSystemId()+", Message: "+err.getMessage());

}

public void fatalError(SAXParseException fatalErr) throws SAXException
{
  System.out.println("Parsing FatalError - Line: "+fatalErr.getLineNumber()+", URI: "+fatalErr.getSystemId()+", Message: "+fatalErr.getMessage());
  throw new SAXException("Fatal Error encountered");
}

public void  warning (SAXParseException warning) throws SAXException
{
  System.out.println("Parsing Warning - Line: "+warning.getLineNumber()+", URI: "+warning.getSystemId()+", Message: "+warning.getMessage());
  throw new SAXException("Warning encountered");
}

}

