// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2006-07-03 09:14:14 $
// $Revision: 1.6 $
//

// -beg- preserve=no 3CEB5BA003CF package "XMLInterlisDecoder"
package ch.ehi.umleditor.xmiuml.ehi;
// -end- 3CEB5BA003CF package "XMLInterlisDecoder"

// -beg- preserve=no 3CEB5BA003CF autoimport "XMLInterlisDecoder"

// -end- 3CEB5BA003CF autoimport "XMLInterlisDecoder"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CEB5BA003CF import "XMLInterlisDecoder"
import org.xml.sax.*;
import java.io.*;
import org.xml.sax.helpers.XMLReaderFactory;
import ch.ehi.basics.logging.EhiLogger;
// -end- 3CEB5BA003CF import "XMLInterlisDecoder"

<<<<<<< HEAD
public class XMLInterlisDecoder
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CEB5BA003CF detail_begin "XMLInterlisDecoder"

  String fileName;
  XMLReader parser; // It used to be Parser interface, which was deprecated in SAX 2.0!!
  boolean xmlParsed = true;
  InputSource inputSource = null;
  InputStream inputStream = null;

  // -end- 3CEB5BA003CF detail_begin "XMLInterlisDecoder"

  // -beg- preserve=no 3CEB5BC000C8 head3CEB5BA003CF "decode"
  public Object decode(String path)
  // -end- 3CEB5BC000C8 head3CEB5BA003CF "decode"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3CEB5BC000C8 throws3CEB5BA003CF "decode"
	throws IOException
    // -end- 3CEB5BC000C8 throws3CEB5BA003CF "decode"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CEB5BC000C8 body3CEB5BA003CF "decode"
      Object obj = parse(path);
      return obj;
    // -end- 3CEB5BC000C8 body3CEB5BA003CF "decode"
    }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CEB5BA003CF detail_end "XMLInterlisDecoder"

 private Object parse(String path)
 throws IOException
  {

    Object object = null;

    try
    {
      parser = XMLReaderFactory.createXMLReader();
      //parser.setFeature("http://xml.org/sax/features/validation",true);
    }

    catch(SAXException exSax)
    {
      throw new IOException("Unable to create the XML-Reader");
    }
    MyHandler myHandler = new MyHandler();
    ErrorListener errorListener = new ErrorListener();
    //register to Content Handler
    parser.setContentHandler(myHandler);

    //register to Error Handler
    parser.setErrorHandler(errorListener);
	myHandler.setErrorHandler(errorListener);




    //parser.setDocumentHandler(new MyHandler());

    try
    {
      inputStream = new FileInputStream(new File(path));
      inputSource = new InputSource(inputStream);
      //parser.parse("file:"+ new java.io.File(fileName).getAbsolutePath());

      parser.parse(inputSource);
      object = myHandler.getUmlModel();
      inputStream.close();
      if(object==null){
    	  return null;
      }
      inputStream = new FileInputStream(new File(path));
      inputSource = new InputSource(inputStream);
      myHandler.setSecondPass(true);
      parser.parse(inputSource);
      java.util.Map unref=myHandler.getUnreferencedObjects();
      if(unref.size()>0){
        java.util.Iterator it=unref.keySet().iterator();
        while(it.hasNext()){
          String tid=(String)it.next();
          ch.ehi.umleditor.application.LauncherView.getInstance().log("decoder","Object <"+tid+"> is never used");
        }
      }
	  EhiLogger.traceState("root-object: "+object);
      inputStream.close();
    }

    catch(SAXParseException exSax)
    {
		Exception  ex = exSax;
		if (exSax.getException() != null){
			ex = exSax.getException();
		}
		ch.ehi.umleditor.application.LauncherView.getInstance().log("decode","Err - Message: "+ex.getMessage()); //message
		ch.ehi.umleditor.application.LauncherView.getInstance().log("decode","System ID: "+exSax.getSystemId()); //system ID
		ch.ehi.umleditor.application.LauncherView.getInstance().log("decode","Err at line: "+exSax.getLineNumber()); //line Number
		EhiLogger.logError(ex);
		// TODO ex.printStackTrace();
      	throw new IOException(ex.getMessage());

    }
    catch(SAXException exSax)
    {
		Throwable  ex = exSax;
		if(ex instanceof java.lang.reflect.InvocationTargetException){
			java.lang.reflect.InvocationTargetException iex=(java.lang.reflect.InvocationTargetException)ex;
			ex=iex.getTargetException();
		}
        throw new IOException(ex.getLocalizedMessage());
    }
    return object;
  }
  // -end- 3CEB5BA003CF detail_end "XMLInterlisDecoder"

}

=======
public class XMLInterlisDecoder {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3CEB5BA003CF detail_begin "XMLInterlisDecoder"

	String fileName;
	XMLReader parser; // It used to be Parser interface, which was deprecated in
						// SAX 2.0!!
	boolean xmlParsed = true;
	InputSource inputSource = null;
	InputStream inputStream = null;

	// -end- 3CEB5BA003CF detail_begin "XMLInterlisDecoder"

	// -beg- preserve=no 3CEB5BC000C8 head3CEB5BA003CF "decode"
	public Object decode(String path)
			// -end- 3CEB5BC000C8 head3CEB5BA003CF "decode"
			// declare any checked exceptions
			// please fill in/modify the following section
			// -beg- preserve=yes 3CEB5BC000C8 throws3CEB5BA003CF "decode"
			throws IOException
	// -end- 3CEB5BC000C8 throws3CEB5BA003CF "decode"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3CEB5BC000C8 body3CEB5BA003CF "decode"
		Object obj = parse(path);
		return obj;
		// -end- 3CEB5BC000C8 body3CEB5BA003CF "decode"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3CEB5BA003CF detail_end "XMLInterlisDecoder"

	private Object parse(String path) throws IOException {

		Object object = null;

		try {
			parser = XMLReaderFactory.createXMLReader();
			// parser.setFeature("http://xml.org/sax/features/validation",true);
		}

		catch (SAXException exSax) {
			throw new IOException("Unable to create the XML-Reader");
		}
		MyHandler myHandler = new MyHandler();
		ErrorListener errorListener = new ErrorListener();
		// register to Content Handler
		parser.setContentHandler(myHandler);

		// register to Error Handler
		parser.setErrorHandler(errorListener);
		myHandler.setErrorHandler(errorListener);

		// parser.setDocumentHandler(new MyHandler());

		try {
			inputStream = new FileInputStream(new File(path));
			inputSource = new InputSource(inputStream);
			// parser.parse("file:"+ new
			// java.io.File(fileName).getAbsolutePath());

			parser.parse(inputSource);
			object = myHandler.getUmlModel();
			inputStream.close();
			if (object == null) {
				return null;
			}
			inputStream = new FileInputStream(new File(path));
			inputSource = new InputSource(inputStream);
			myHandler.setSecondPass(true);
			parser.parse(inputSource);
			java.util.Map unref = myHandler.getUnreferencedObjects();
			if (unref.size() > 0) {
				java.util.Iterator it = unref.keySet().iterator();
				while (it.hasNext()) {
					String tid = (String) it.next();
					ch.ehi.umleditor.application.LauncherView.getInstance().log("decoder",
							"Object <" + tid + "> is never used");
				}
			}
			EhiLogger.traceState("root-object: " + object);
			inputStream.close();
		}

		catch (SAXParseException exSax) {
			Exception ex = exSax;
			if (exSax.getException() != null) {
				ex = exSax.getException();
			}
			ch.ehi.umleditor.application.LauncherView.getInstance().log("decode", "Err - Message: " + ex.getMessage()); // message
			ch.ehi.umleditor.application.LauncherView.getInstance().log("decode", "System ID: " + exSax.getSystemId()); // system
																														// ID
			ch.ehi.umleditor.application.LauncherView.getInstance().log("decode",
					"Err at line: " + exSax.getLineNumber()); // line Number
			EhiLogger.logError(ex);
			// TODO ex.printStackTrace();
			throw new IOException(ex.getMessage());

		} catch (SAXException exSax) {
			Throwable ex = exSax;
			if (ex instanceof java.lang.reflect.InvocationTargetException) {
				java.lang.reflect.InvocationTargetException iex = (java.lang.reflect.InvocationTargetException) ex;
				ex = iex.getTargetException();
			}
			throw new IOException(ex.getLocalizedMessage());
		}
		return object;
	}
	// -end- 3CEB5BA003CF detail_end "XMLInterlisDecoder"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
