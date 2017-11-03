// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2005-02-21 15:53:48 $
// $Revision: 1.5 $
//

// -beg- preserve=no 3CF1D26803CA package "MyHandler"
package ch.ehi.umleditor.xmiuml.ehi;
// -end- 3CF1D26803CA package "MyHandler"

// -beg- preserve=no 3CF1D26803CA autoimport "MyHandler"

// -end- 3CF1D26803CA autoimport "MyHandler"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CF1D26803CA import "MyHandler"
import org.xml.sax.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.softenvironment.util.Tracer;
import ch.ehi.basics.logging.EhiLogger;
// -end- 3CF1D26803CA import "MyHandler"

<<<<<<< HEAD
public class MyHandler implements org.xml.sax.ContentHandler
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3CF1D26803CA detail_begin "MyHandler"

  // -end- 3CF1D26803CA detail_begin "MyHandler"

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CF1D26803CA detail_end "MyHandler"

  private Locator currentLocation=null;
  private ErrorHandler eh=null;
  
  // map<String TID, Object obj>
  private java.util.Map objMap = new java.util.HashMap();
  private java.util.Set usedObjsTID = new java.util.HashSet();
  private java.util.Set missingObjsTID = new java.util.HashSet();
  private Object actualObject = null;
  private UmlModel umlModel = null;
  private String currentElementTag=null;
  private boolean secondPass=false;
  private boolean inNlsString=false;
  private String nlsStringID=null;

  // map<Class class,map<String attrName,Method setAddValueMethod>>
  private java.util.HashMap setValues=new java.util.HashMap();
  // map<Class class,map<String roleName,Method setAddObjectMethod>>
  private java.util.HashMap setObjects=new java.util.HashMap();
  // map<Class codelist,Constructor constructor>
  //private java.util.HashMap codelists=new java.util.HashMap();

  // map<String attrName,Method setAddValueMethod>
  private java.util.HashMap currentObjValueSets=null;
  // map<String roleName,Method setAddObjectMethod>
  private java.util.HashMap currentObjObjectAdds=null;

  private StringBuffer content=null;
  private int level=0;

  public void setDocumentLocator(Locator locator)
  {
  	currentLocation=locator;
  }

  public void startDocument() throws SAXException
  {
  }

  public void endDocument() throws SAXException
  {
  }

  public void characters(char [] text, int start, int length) throws SAXException
  {
    if(content!=null){
      content.append(text,start,length);
    }
  }

  public void ignorableWhitespace(char[] text, int start, int length)throws SAXException
  {
  }

  public void processingInstruction(String target, String data) throws SAXException
  {
  }
  public void setErrorHandler(ErrorHandler handler)
  {
  	eh=handler;
  }
  public void startElement(String namespaceURI, String localName, String rawName, Attributes atts) 
  	throws SAXException
  {
    Object attsObj = null;
    Class objClass = null;
    level++;
    if(level==1){
    	if(namespaceURI.equals("") && localName.equals("ch.ehi.umleditor.1")){
    		// ok
    	}else if(namespaceURI.equals("http://schemas.umleditor.org/umleditor/1.1") && localName.equals("ch.ehi.umleditor")){
    		// ok
    	}else{
        	if(localName.startsWith("ch.ehi.umleditor")){
        		EhiLogger.traceUnusualState("file from an unknown umleditor version; will try to read");
        	}else{
        		throw new SAXException("unexpected xml file");
        	}
    	}
    }
    currentElementTag = localName;
    if(level==3){
      content=new StringBuffer();
    }


    // bestimme Klassenname
    String qualifiedClassName=mapTag2Class(localName);
    if(atts.getLength() == 1)
    {
      String tid=atts.getValue(0);
      try
      {
        // Objekt noch unbekannt?
        if (!objMap.containsKey(tid))
        {
          // Objekt noch nicht erzeugt. neues Objekt erzeugen
          Class cls=Class.forName(qualifiedClassName);
            attsObj = cls.newInstance();
          // Abbildung der TID auf Objekt in Tabelle eintragen
          objMap.put(atts.getValue(0), attsObj);
          actualObject = attsObj;
          if(actualObject instanceof UmlModel){
          	umlModel=(UmlModel)actualObject;
          }
        }
        else
        {
          // Objekt mit Hilfe von Abbildungstabelle bestimmen
          actualObject=objMap.get(atts.getValue(0));
        }
        if(localName.equals("ch.ehi.basics.types.NlsString")){
          inNlsString=true;
          nlsStringID=atts.getValue(0);
        }else{
          analyseClass(actualObject.getClass());
          currentObjValueSets=(HashMap)setValues.get(actualObject.getClass());
          currentObjObjectAdds=(HashMap)setObjects.get(actualObject.getClass());
        }
      }catch(IllegalAccessException ex){
            ch.ehi.umleditor.application.LauncherView.getInstance().log("decode"
              ,"tid <"+tid+"> tag <"+localName+"> class <"+qualifiedClassName+">"+ex.getLocalizedMessage());
		EhiLogger.debug("Parsing Error - Line: "+currentLocation.getLineNumber()+", Message: "+ex.getMessage());
        throw new SAXException(ex);
      }catch(java.lang.InstantiationException ex){
			ch.ehi.umleditor.application.LauncherView.getInstance().log("decode"
			,"tid <"+tid+"> tag <"+localName+"> class <"+qualifiedClassName+">"+ex.getLocalizedMessage());
		EhiLogger.debug("Parsing Error - Line: "+currentLocation.getLineNumber()+", Message: "+ex.getMessage());
		throw new SAXException(ex);
      }catch(ClassNotFoundException ex){
            ch.ehi.umleditor.application.LauncherView.getInstance().log("decode"
              ,"tid <"+tid+"> tag <"+localName+"> class <"+qualifiedClassName+">"+ex.getLocalizedMessage());
		EhiLogger.debug("Parsing Error - Line: "+currentLocation.getLineNumber()+", Message: "+ex.getMessage());
		throw new SAXException(ex);
      }


    }
    else if(inNlsString && atts.getLength()==3){
      if(!secondPass){
        ch.ehi.basics.types.NlsString old=(ch.ehi.basics.types.NlsString)actualObject;
        ch.ehi.basics.types.NlsString newstr=new ch.ehi.basics.types.NlsString(old,atts.getValue(1),atts.getValue(2));
        actualObject=newstr;
        objMap.put(nlsStringID, newstr);
        //EhiLogger.debug("nlsString "+atts.getValue(1)+" "+atts.getValue(2));
      }
    }
    else if(atts.getLength()>1)
    {
      eh.error(new SAXParseException("You can't have more then 1 Attribute!",currentLocation));
    }

  }


  public void endElement(String namespaceURI, String localName, String rawName) throws SAXException
  {
    level--;
        if(localName.equals("ch.ehi.basics.types.NlsString")){
          inNlsString=false;
          nlsStringID=null;
        }else if(level==2 && !inNlsString){
          if(secondPass){
            try{
              String value = content.toString();
              if(actualObject instanceof ch.ehi.uml1_4.implementation.AbstractModelElement && currentElementTag.equals("DefLangName")){
            	  // skip derived property DefLangName
              }else if(currentObjObjectAdds.containsKey(currentElementTag)){
                // get object that this value references
                if(!objMap.containsKey(value)){
                  if(!missingObjsTID.contains(value)){
                    ch.ehi.umleditor.application.LauncherView.getInstance().log("decoder","Object <"+value+"> doestn't exist");
                    missingObjsTID.add(value);
                  }
                }else{
                  Object dest=objMap.get(value);
                  usedObjsTID.add(value);
                  // get addXX() method of current object
                  Method add=(Method)currentObjObjectAdds.get(currentElementTag);
                  // invoke addXX() method on current object to add reference
                  add.invoke(actualObject,new Object[]{dest});
                }
              }else if(currentObjValueSets.containsKey(currentElementTag)){
                // get setXX() method of current object
                Method set=(Method)currentObjValueSets.get(currentElementTag);
                Class parameterType=set.getParameterTypes()[0];
                Object valueObject=null;
                if(parameterType==Boolean.TYPE || parameterType==java.lang.Boolean.class){
                  valueObject = Boolean.valueOf(value);
                }else if(parameterType==Character.TYPE || parameterType==java.lang.Character.class){
                  valueObject = new Character(value.charAt(0));
                }else if(parameterType==Byte.TYPE || parameterType==java.lang.Byte.class){
                  valueObject = Byte.valueOf(value);
                }else if(parameterType==Short.TYPE || parameterType==java.lang.Short.class){
                  valueObject = Short.valueOf(value);
                }else if(parameterType==Integer.TYPE || parameterType==java.lang.Integer.class){
                  valueObject = Integer.valueOf(value);
                }else if(parameterType==Long.TYPE || parameterType==java.lang.Long.class){
                  valueObject = Long.valueOf(value);
                }else if(parameterType==Float.TYPE || parameterType==java.lang.Float.class){
                  valueObject = Float.valueOf(value);
                }else if(parameterType==Double.TYPE || parameterType==java.lang.Double.class){
                  valueObject = Double.valueOf(value);
                }else if(parameterType==java.lang.String.class){
                  valueObject = value;
                }
                // invoke setXX() method on current object to set value
                set.invoke(actualObject,new Object[]{valueObject});
              }else{
                eh.error(new SAXParseException("unexpected Element <"+currentElementTag+">",currentLocation));
              }
            }
			catch(IllegalArgumentException ex){
				EhiLogger.traceUnusualState("Parsing Error - Line: "+currentLocation.getLineNumber()+", Message: "+ex.getMessage());
				throw new SAXException(ex);
			}
            catch(IllegalAccessException ex){
				EhiLogger.traceUnusualState("Parsing Error - Line: "+currentLocation.getLineNumber()+", Message: "+ex.getMessage());
            	throw new SAXException(ex);
            }
			catch(InvocationTargetException ex){
				EhiLogger.traceUnusualState("Parsing Error - Line: "+currentLocation.getLineNumber()+", Message: "+ex.getMessage());
				throw new SAXException(ex);
			}
          }
        }
        content=null;
  }

  public void startPrefixMapping(String prefix, String uri)
   throws SAXException
  {
  }

  public void endPrefixMapping(String prefix) throws SAXException
  {
  }

  public void skippedEntity(String name) throws SAXException
  {
  }


  private String mapTag2Class(String qualifiedClassName)
  {
    return qualifiedClassName;
  }

  public Object getUmlModel()
  {
    return umlModel;
  }



  private void analyseClass(Class aclass)
  {
    // class already analyzed?
    if(setValues.containsKey(aclass))return;
    if(setObjects.containsKey(aclass))return;
    //if(codelists.containsKey(aclass))return;

    Class stringClass=new String().getClass();
    Map values = new HashMap(); // map<String attrName,Method setAddObjectMethod>
    Map objects = new HashMap(); // map<String roleName,Method setAddValueMethod>

    java.util.HashMap methodSet=new java.util.HashMap();
    Method[] methods = aclass.getMethods();
    for(int a = 0;a<methods.length;a++)
    {
      methodSet.put(methods[a].getName(),methods[a]);
    }

    for (int i = 0;i<methods.length;i++)
    {
      String methodName=methods[i].getName();
      if(methodName.startsWith("add") && methods[i].getReturnType()==void.class){
        String attrName=methodName.substring(3);
        if(methodSet.containsKey("add"+attrName+"Link")){
          continue;
        }
        String attrNameWoLink=attrName;
        if(attrName.endsWith("Link")){
          attrNameWoLink=attrName.substring(0,attrName.length()-4);
        }
        Class parameterTypes[] = methods[i].getParameterTypes();
        if(parameterTypes.length==1){
          if(parameterTypes[0].isPrimitive()
              || parameterTypes[0]==stringClass
              || isBuiltinClass(parameterTypes[0])
              ){
            values.put(attrName,methods[i]);
          }else{
            if(methodSet.containsKey("_link"+attrNameWoLink)){
              // use _linkXX()
              objects.put(attrName,methodSet.get("_link"+attrNameWoLink));
            }else{
              // use addXX()
              objects.put(attrName,methods[i]);
            }
          }
        }else{
          // ignore method
        }
      }else if(methodName.startsWith("attach") && methods[i].getReturnType()==void.class){
        String attrName=methodName.substring(6);
        if(methodSet.containsKey("attach"+attrName+"Link")){
          continue;
        }
        String attrNameWoLink=attrName;
        if(attrName.endsWith("Link")){
          attrNameWoLink=attrName.substring(0,attrName.length()-4);
        }
        Class parameterTypes[] = methods[i].getParameterTypes();
        if(parameterTypes.length==1){
          if(parameterTypes[0].isPrimitive()
              || isBuiltinClass(parameterTypes[0])
              || parameterTypes[0]==stringClass
              ){
            values.put(attrName,methods[i]);
          }else{
            if(methodSet.containsKey("_link"+attrNameWoLink)){
              // use _linkXX()
              objects.put(attrName,methodSet.get("_link"+attrNameWoLink));
            }else{
              // use attachXX()
              objects.put(attrName,methods[i]);
            }
          }
        }else{
          // ignore method
        }
      }else if(methodName.startsWith("set") && methods[i].getReturnType()==void.class){
        String attrName=methodName.substring(3);
        Class parameterTypes[] = methods[i].getParameterTypes();
        if(parameterTypes.length==1){
          if(parameterTypes[0].isPrimitive()
              || parameterTypes[0]==stringClass
              || isBuiltinClass(parameterTypes[0])
              ){
            values.put(attrName,methods[i]);
          }else{
            objects.put(attrName,methods[i]);
          }
        }else{
          // ignore method
        }
      }
    }
    setValues.put(aclass,values);
    setObjects.put(aclass,objects);
    return;
  }
  public void setSecondPass(boolean secondPass)
  {
    this.secondPass=secondPass;
  }

  public java.util.Map getUnreferencedObjects(){
    java.util.HashMap ret=new java.util.HashMap(objMap);
    java.util.Iterator it=new java.util.HashSet(ret.keySet()).iterator();
    while(it.hasNext()){
      String tid=(String)it.next();
      if(usedObjsTID.contains(tid)){
        ret.remove(tid);
      }
    }
    return ret;
  }
  public java.util.Set getMissingObjects(){
    return missingObjsTID;
  }
      private static boolean isBuiltinClass(Class aclass){
      String name=aclass.getName();
      if(name.equals("java.lang.Boolean")
          || name.equals("java.lang.Character")
          || name.equals("java.lang.Byte")
          || name.equals("java.lang.Short")
          || name.equals("java.lang.Integer")
          || name.equals("java.lang.Long")
          || name.equals("java.lang.Float")
          || name.equals("java.lang.Double")
          ){
        return true;
      }
      return false;
    }

  // -end- 3CF1D26803CA detail_end "MyHandler"

}

=======
public class MyHandler implements org.xml.sax.ContentHandler {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CF1D26803CA detail_begin "MyHandler"

	// -end- 3CF1D26803CA detail_begin "MyHandler"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3CF1D26803CA detail_end "MyHandler"

	private Locator currentLocation = null;
	private ErrorHandler eh = null;

	// map<String TID, Object obj>
	private java.util.Map objMap = new java.util.HashMap();
	private java.util.Set usedObjsTID = new java.util.HashSet();
	private java.util.Set missingObjsTID = new java.util.HashSet();
	private Object actualObject = null;
	private UmlModel umlModel = null;
	private String currentElementTag = null;
	private boolean secondPass = false;
	private boolean inNlsString = false;
	private String nlsStringID = null;

	// map<Class class,map<String attrName,Method setAddValueMethod>>
	private java.util.HashMap setValues = new java.util.HashMap();
	// map<Class class,map<String roleName,Method setAddObjectMethod>>
	private java.util.HashMap setObjects = new java.util.HashMap();
	// map<Class codelist,Constructor constructor>
	// private java.util.HashMap codelists=new java.util.HashMap();

	// map<String attrName,Method setAddValueMethod>
	private java.util.HashMap currentObjValueSets = null;
	// map<String roleName,Method setAddObjectMethod>
	private java.util.HashMap currentObjObjectAdds = null;

	private StringBuffer content = null;
	private int level = 0;

	public void setDocumentLocator(Locator locator) {
		currentLocation = locator;
	}

	public void startDocument() throws SAXException {
	}

	public void endDocument() throws SAXException {
	}

	public void characters(char[] text, int start, int length) throws SAXException {
		if (content != null) {
			content.append(text, start, length);
		}
	}

	public void ignorableWhitespace(char[] text, int start, int length) throws SAXException {
	}

	public void processingInstruction(String target, String data) throws SAXException {
	}

	public void setErrorHandler(ErrorHandler handler) {
		eh = handler;
	}

	public void startElement(String namespaceURI, String localName, String rawName, Attributes atts)
			throws SAXException {
		Object attsObj = null;
		Class objClass = null;
		level++;
		if (level == 1) {
			if (namespaceURI.equals("") && localName.equals("ch.ehi.umleditor.1")) {
				// ok
			} else if (namespaceURI.equals("http://schemas.umleditor.org/umleditor/1.1")
					&& localName.equals("ch.ehi.umleditor")) {
				// ok
			} else {
				if (localName.startsWith("ch.ehi.umleditor")) {
					EhiLogger.traceUnusualState("file from an unknown umleditor version; will try to read");
				} else {
					throw new SAXException("unexpected xml file");
				}
			}
		}
		currentElementTag = localName;
		if (level == 3) {
			content = new StringBuffer();
		}

		// bestimme Klassenname
		String qualifiedClassName = mapTag2Class(localName);
		if (atts.getLength() == 1) {
			String tid = atts.getValue(0);
			try {
				// Objekt noch unbekannt?
				if (!objMap.containsKey(tid)) {
					// Objekt noch nicht erzeugt. neues Objekt erzeugen
					Class cls = Class.forName(qualifiedClassName);
					attsObj = cls.newInstance();
					// Abbildung der TID auf Objekt in Tabelle eintragen
					objMap.put(atts.getValue(0), attsObj);
					actualObject = attsObj;
					if (actualObject instanceof UmlModel) {
						umlModel = (UmlModel) actualObject;
					}
				} else {
					// Objekt mit Hilfe von Abbildungstabelle bestimmen
					actualObject = objMap.get(atts.getValue(0));
				}
				if (localName.equals("ch.ehi.basics.types.NlsString")) {
					inNlsString = true;
					nlsStringID = atts.getValue(0);
				} else {
					analyseClass(actualObject.getClass());
					currentObjValueSets = (HashMap) setValues.get(actualObject.getClass());
					currentObjObjectAdds = (HashMap) setObjects.get(actualObject.getClass());
				}
			} catch (IllegalAccessException ex) {
				ch.ehi.umleditor.application.LauncherView.getInstance().log("decode", "tid <" + tid + "> tag <"
						+ localName + "> class <" + qualifiedClassName + ">" + ex.getLocalizedMessage());
				EhiLogger.debug(
						"Parsing Error - Line: " + currentLocation.getLineNumber() + ", Message: " + ex.getMessage());
				throw new SAXException(ex);
			} catch (java.lang.InstantiationException ex) {
				ch.ehi.umleditor.application.LauncherView.getInstance().log("decode", "tid <" + tid + "> tag <"
						+ localName + "> class <" + qualifiedClassName + ">" + ex.getLocalizedMessage());
				EhiLogger.debug(
						"Parsing Error - Line: " + currentLocation.getLineNumber() + ", Message: " + ex.getMessage());
				throw new SAXException(ex);
			} catch (ClassNotFoundException ex) {
				ch.ehi.umleditor.application.LauncherView.getInstance().log("decode", "tid <" + tid + "> tag <"
						+ localName + "> class <" + qualifiedClassName + ">" + ex.getLocalizedMessage());
				EhiLogger.debug(
						"Parsing Error - Line: " + currentLocation.getLineNumber() + ", Message: " + ex.getMessage());
				throw new SAXException(ex);
			}

		} else if (inNlsString && atts.getLength() == 3) {
			if (!secondPass) {
				ch.ehi.basics.types.NlsString old = (ch.ehi.basics.types.NlsString) actualObject;
				ch.ehi.basics.types.NlsString newstr = new ch.ehi.basics.types.NlsString(old, atts.getValue(1),
						atts.getValue(2));
				actualObject = newstr;
				objMap.put(nlsStringID, newstr);
				// EhiLogger.debug("nlsString "+atts.getValue(1)+"
				// "+atts.getValue(2));
			}
		} else if (atts.getLength() > 1) {
			eh.error(new SAXParseException("You can't have more then 1 Attribute!", currentLocation));
		}

	}

	public void endElement(String namespaceURI, String localName, String rawName) throws SAXException {
		level--;
		if (localName.equals("ch.ehi.basics.types.NlsString")) {
			inNlsString = false;
			nlsStringID = null;
		} else if (level == 2 && !inNlsString) {
			if (secondPass) {
				try {
					String value = content.toString();
					if (actualObject instanceof ch.ehi.uml1_4.implementation.AbstractModelElement
							&& currentElementTag.equals("DefLangName")) {
						// skip derived property DefLangName
					} else if(actualObject instanceof ch.ehi.uml1_4.implementation.AbstractModelElement
							&& currentElementTag.equals("DefLangMetaAttrb")){
						// skip derived property DefLangMetaAttrb
					} else if(actualObject instanceof ch.ehi.uml1_4.implementation.AbstractModelElement
							&& currentElementTag.equals("DefLangMetaName")){
						// skip derived property DefLangMetaName
					} else if(actualObject instanceof ch.ehi.uml1_4.implementation.AbstractModelElement
							&& currentElementTag.equals("DefLangMetaMsg")){
						// skip derived property DefLangMetaDefLangMetaMsg
					} else if (currentObjObjectAdds.containsKey(currentElementTag)) {
						// get object that this value references
						if (!objMap.containsKey(value)) {
							if (!missingObjsTID.contains(value)) {
								ch.ehi.umleditor.application.LauncherView.getInstance().log("decoder",
										"Object <" + value + "> doestn't exist");
								missingObjsTID.add(value);
							}
						} else {
							Object dest = objMap.get(value);
							usedObjsTID.add(value);
							// get addXX() method of current object
							Method add = (Method) currentObjObjectAdds.get(currentElementTag);
							// invoke addXX() method on current object to add
							// reference
							add.invoke(actualObject, new Object[] { dest });
						}
					} else if (currentObjValueSets.containsKey(currentElementTag)) {
						// get setXX() method of current object
						Method set = (Method) currentObjValueSets.get(currentElementTag);
						Class parameterType = set.getParameterTypes()[0];
						Object valueObject = null;
						if (parameterType == Boolean.TYPE || parameterType == java.lang.Boolean.class) {
							valueObject = Boolean.valueOf(value);
						} else if (parameterType == Character.TYPE || parameterType == java.lang.Character.class) {
							valueObject = new Character(value.charAt(0));
						} else if (parameterType == Byte.TYPE || parameterType == java.lang.Byte.class) {
							valueObject = Byte.valueOf(value);
						} else if (parameterType == Short.TYPE || parameterType == java.lang.Short.class) {
							valueObject = Short.valueOf(value);
						} else if (parameterType == Integer.TYPE || parameterType == java.lang.Integer.class) {
							valueObject = Integer.valueOf(value);
						} else if (parameterType == Long.TYPE || parameterType == java.lang.Long.class) {
							valueObject = Long.valueOf(value);
						} else if (parameterType == Float.TYPE || parameterType == java.lang.Float.class) {
							valueObject = Float.valueOf(value);
						} else if (parameterType == Double.TYPE || parameterType == java.lang.Double.class) {
							valueObject = Double.valueOf(value);
						} else if (parameterType == java.lang.String.class) {
							valueObject = value;
						}
						// invoke setXX() method on current object to set value
						set.invoke(actualObject, new Object[] { valueObject });
					} else {
						eh.error(new SAXParseException("unexpected Element <" + currentElementTag + ">",
								currentLocation));
					}
				} catch (IllegalArgumentException ex) {
					EhiLogger.traceUnusualState("Parsing Error - Line: " + currentLocation.getLineNumber()
							+ ", Message: " + ex.getMessage());
					throw new SAXException(ex);
				} catch (IllegalAccessException ex) {
					EhiLogger.traceUnusualState("Parsing Error - Line: " + currentLocation.getLineNumber()
							+ ", Message: " + ex.getMessage());
					throw new SAXException(ex);
				} catch (InvocationTargetException ex) {
					EhiLogger.traceUnusualState("Parsing Error - Line: " + currentLocation.getLineNumber()
							+ ", Message: " + ex.getMessage());
					throw new SAXException(ex);
				}
			}
		}
		content = null;
	}

	public void startPrefixMapping(String prefix, String uri) throws SAXException {
	}

	public void endPrefixMapping(String prefix) throws SAXException {
	}

	public void skippedEntity(String name) throws SAXException {
	}

	private String mapTag2Class(String qualifiedClassName) {
		return qualifiedClassName;
	}

	public Object getUmlModel() {
		return umlModel;
	}

	private void analyseClass(Class aclass) {
		// class already analyzed?
		if (setValues.containsKey(aclass))
			return;
		if (setObjects.containsKey(aclass))
			return;
		// if(codelists.containsKey(aclass))return;

		Class stringClass = new String().getClass();
		Map values = new HashMap(); // map<String attrName,Method
									// setAddObjectMethod>
		Map objects = new HashMap(); // map<String roleName,Method
										// setAddValueMethod>

		java.util.HashMap methodSet = new java.util.HashMap();
		Method[] methods = aclass.getMethods();
		for (int a = 0; a < methods.length; a++) {
			methodSet.put(methods[a].getName(), methods[a]);
		}

		for (int i = 0; i < methods.length; i++) {
			String methodName = methods[i].getName();
			if (methodName.startsWith("add") && methods[i].getReturnType() == void.class) {
				String attrName = methodName.substring(3);
				if (methodSet.containsKey("add" + attrName + "Link")) {
					continue;
				}
				String attrNameWoLink = attrName;
				if (attrName.endsWith("Link")) {
					attrNameWoLink = attrName.substring(0, attrName.length() - 4);
				}
				Class parameterTypes[] = methods[i].getParameterTypes();
				if (parameterTypes.length == 1) {
					if (parameterTypes[0].isPrimitive() || parameterTypes[0] == stringClass
							|| isBuiltinClass(parameterTypes[0])) {
						values.put(attrName, methods[i]);
					} else {
						if (methodSet.containsKey("_link" + attrNameWoLink)) {
							// use _linkXX()
							objects.put(attrName, methodSet.get("_link" + attrNameWoLink));
						} else {
							// use addXX()
							objects.put(attrName, methods[i]);
						}
					}
				} else {
					// ignore method
				}
			} else if (methodName.startsWith("attach") && methods[i].getReturnType() == void.class) {
				String attrName = methodName.substring(6);
				if (methodSet.containsKey("attach" + attrName + "Link")) {
					continue;
				}
				String attrNameWoLink = attrName;
				if (attrName.endsWith("Link")) {
					attrNameWoLink = attrName.substring(0, attrName.length() - 4);
				}
				Class parameterTypes[] = methods[i].getParameterTypes();
				if (parameterTypes.length == 1) {
					if (parameterTypes[0].isPrimitive() || isBuiltinClass(parameterTypes[0])
							|| parameterTypes[0] == stringClass) {
						values.put(attrName, methods[i]);
					} else {
						if (methodSet.containsKey("_link" + attrNameWoLink)) {
							// use _linkXX()
							objects.put(attrName, methodSet.get("_link" + attrNameWoLink));
						} else {
							// use attachXX()
							objects.put(attrName, methods[i]);
						}
					}
				} else {
					// ignore method
				}
			} else if (methodName.startsWith("set") && methods[i].getReturnType() == void.class) {
				String attrName = methodName.substring(3);
				Class parameterTypes[] = methods[i].getParameterTypes();
				if (parameterTypes.length == 1) {
					if (parameterTypes[0].isPrimitive() || parameterTypes[0] == stringClass
							|| isBuiltinClass(parameterTypes[0])) {
						values.put(attrName, methods[i]);
					} else {
						objects.put(attrName, methods[i]);
					}
				} else {
					// ignore method
				}
			}
		}
		setValues.put(aclass, values);
		setObjects.put(aclass, objects);
		return;
	}

	public void setSecondPass(boolean secondPass) {
		this.secondPass = secondPass;
	}

	public java.util.Map getUnreferencedObjects() {
		java.util.HashMap ret = new java.util.HashMap(objMap);
		java.util.Iterator it = new java.util.HashSet(ret.keySet()).iterator();
		while (it.hasNext()) {
			String tid = (String) it.next();
			if (usedObjsTID.contains(tid)) {
				ret.remove(tid);
			}
		}
		return ret;
	}

	public java.util.Set getMissingObjects() {
		return missingObjsTID;
	}

	private static boolean isBuiltinClass(Class aclass) {
		String name = aclass.getName();
		if (name.equals("java.lang.Boolean") || name.equals("java.lang.Character") || name.equals("java.lang.Byte")
				|| name.equals("java.lang.Short") || name.equals("java.lang.Integer") || name.equals("java.lang.Long")
				|| name.equals("java.lang.Float") || name.equals("java.lang.Double")) {
			return true;
		}
		return false;
	}

	// -end- 3CF1D26803CA detail_end "MyHandler"

}
>>>>>>> 803fe805af2eebe1581931014fa25d7f5559e1e9
