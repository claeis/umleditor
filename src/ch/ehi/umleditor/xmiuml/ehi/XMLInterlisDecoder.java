// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:41:30 $
// $Revision: 1.1.1.1 $
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
import org.xml.sax.helpers.DefaultHandler;
import org.apache.xerces.parsers.SAXParser;
import org.xml.sax.helpers.XMLReaderFactory;
// -end- 3CEB5BA003CF import "XMLInterlisDecoder"

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
  {

    Object object = null;

    try
    {
      parser = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
      //parser.setFeature("http://xml.org/sax/features/validation",true);
    }

    catch(SAXException saxExc)
    {
      System.out.println("Enable to create the Parser!");
    }
    MyHandler myHandler = new MyHandler();
    ErrorListener errorListener = new ErrorListener();
    //register to Content Handler
    parser.setContentHandler(myHandler);

    //register to Error Handler
    parser.setErrorHandler(errorListener);





    //parser.setDocumentHandler(new MyHandler());

    try
    {
      inputStream = new FileInputStream(new File(path));
      inputSource = new InputSource(inputStream);
      //parser.parse("file:"+ new java.io.File(fileName).getAbsolutePath());

      parser.parse(inputSource);
      object = myHandler.getActualObject();
      inputStream.close();
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
      System.out.println("Actual Object: "+object);
      inputStream.close();
    }

    catch(SAXParseException parseExc)
    {
      System.out.println("Err - Message: "+parseExc.getMessage()); //message
      System.out.println("System ID: "+parseExc.getSystemId()); //system ID
      System.out.println("Err at line: "+parseExc.getLineNumber()); //line Number
      return null;

    }

    catch(SAXException saxExc)
    {
      System.out.println("ErrorMessage :"+saxExc.getMessage()); //message
      return null;
    }

    catch(IOException ioExc)
    {
      ioExc.printStackTrace();
      return null;
    }

    return object;
  }
  // -end- 3CEB5BA003CF detail_end "XMLInterlisDecoder"

}

