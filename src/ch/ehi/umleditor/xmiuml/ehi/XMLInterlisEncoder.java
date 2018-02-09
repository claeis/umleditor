// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-03-01 20:37:41 $
// $Revision: 1.3 $
//

// -beg- preserve=no 3CD8FE4D01CC package "XMLInterlisEncoder"
package ch.ehi.umleditor.xmiuml.ehi;
// -end- 3CD8FE4D01CC package "XMLInterlisEncoder"

// -beg- preserve=no 3CD8FE4D01CC autoimport "XMLInterlisEncoder"

// -end- 3CD8FE4D01CC autoimport "XMLInterlisEncoder"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CD8FE4D01CC import "XMLInterlisEncoder"
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.io.Writer;
// -end- 3CD8FE4D01CC import "XMLInterlisEncoder"

public class XMLInterlisEncoder {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3CD8FE4D01CC detail_begin "XMLInterlisEncoder"

	// -end- 3CD8FE4D01CC detail_begin "XMLInterlisEncoder"

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3CD8FE4D01CC detail_end "XMLInterlisEncoder"

	private class GetterEntry {
		public String name;
		public Method get;
		public Method contains;

		GetterEntry(String name, Method get, Method contains) {
			this.name = name;
			this.get = get;
			this.contains = contains;
		}
	};

	// map<Class class,list<GetterEntry>>
	private java.util.HashMap getters = new java.util.HashMap();
	// map<Class class,list<Method iteratorMethod>>
	private java.util.HashMap iterators = new java.util.HashMap();
	// map<Class codelist,Method getMethod>
	private java.util.HashMap codelists = new java.util.HashMap();

	private int objid = 0;

	private Map object2Id = new HashMap(); // map<Object obj,int id>
	private Set pendingObjects = new HashSet(); // set<Object obj>
	private Writer out;

	// benötigte Methoden werden hier in eine List gespeichert
	private void analyzeClass(Class aclass) {
		// class already analyzed?
		if (getters.containsKey(aclass))
			return;
		if (iterators.containsKey(aclass))
			return;
		if (codelists.containsKey(aclass))
			return;
		if (aclass.getName().equals("java.lang.String"))
			return;
		if (isBuiltinClass(aclass))
			return;
		if (aclass.isPrimitive())
			return;

		// Map<method.getName, method>
		java.util.HashMap methodSet = new java.util.HashMap();
		Method[] methods = aclass.getMethods();
		for (int a = 0; a < methods.length; a++) {
			methodSet.put(methods[a].getName(), methods[a]);
		}

		List getterList = new ArrayList(); // List<GetterEntry>
		List iteratorList = new ArrayList(); // List<Methods>
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith("get")) {
				String attrName = methods[i].getName().substring(3);
				// ist es im HashSet enthalten?
				if (methodSet.containsKey("attach" + attrName)) {
					if (!methodSet.containsKey("attach" + attrName + "Link")) {
						if (attrName.endsWith("Link")) {
							getterList.add(new GetterEntry(attrName, methods[i],
									(Method) methodSet.get("contains" + attrName.substring(0, attrName.length() - 4))));
						} else {
							getterList.add(new GetterEntry(attrName, methods[i],
									(Method) methodSet.get("contains" + attrName)));
						}
					}
				} else if (methodSet.containsKey("set" + attrName)) {
					getterList.add(new GetterEntry(attrName, methods[i], null));
				} else if (methodSet.containsKey("getList") && methodSet.containsKey("createBuiltin")
						&& methods[i].getName().endsWith("Code")) {
					codelists.put(aclass, methods[i]);
					return;
				}
			} else if (methods[i].getName().startsWith("iterator")) {
				String attrName = methods[i].getName().substring(8);
				if (methodSet.containsKey("add" + attrName)) {
					if (!methodSet.containsKey("iterator" + attrName + "Link")) {
						iteratorList.add(methods[i]);
					}
				}
			} else if (methods[i].getName().startsWith("is") && methods[i].getReturnType() == Boolean.TYPE) {
				String attrName = methods[i].getName().substring(2);
				if (methodSet.containsKey("set" + attrName)) {
					getterList.add(new GetterEntry(attrName, methods[i], null));
				}
			}
		}
		getters.put(aclass, getterList);
		iterators.put(aclass, iteratorList);
		return;
	}

	// Hier werden die Werte geholt und geschrieben

	private void visitObject(Object obj) throws IOException, IllegalAccessException, InvocationTargetException {

		int thisobjid = ((Integer) object2Id.get(obj)).intValue();

		if (obj instanceof ch.ehi.basics.types.NlsString) {
			return;
		}
		analyzeClass(obj.getClass());
		if (isCodeList(obj.getClass()))
			return;

		List getterList = (List) getters.get(obj.getClass());
		List iteratorList = (List) iterators.get(obj.getClass());
		Method method;
		Object value = null;
		String bufferedValue = null;
		String methodName = null;
		String bufferedIterator = null;
		HashMap containsMap = new HashMap();
		boolean contains = false;
		Boolean bContains = null;
		Object containsObj = null;
		String subString;
		Object codeValue = null;
		boolean code = false;

		/*
		 ** 1. alle Objekte schreiben die von diesem Objekt referenziert werden
		 */
		String linkedObject = null;
		Iterator it;

		it = getterList.iterator();
		while (it.hasNext()) {
			GetterEntry getter = (GetterEntry) it.next();
			method = getter.get;
			// kein PrimitivDatentyp?
			if (!method.getReturnType().isPrimitive() && method.getReturnType() != java.lang.String.class
					&& !isBuiltinClass(method.getReturnType()) && !isReturnTypeCodeList(method)) {
				// Wert definiert?
				if (getter.contains != null && !executeContains(obj, getter.contains)) {
					// kein Wert definiert; nichts schreiben
				} else {
					// Wert bestimmen (getXX() ausfuehren)
					value = method.invoke(obj, null);
					if (value != null && !object2Id.containsKey(value)) {
						addPendingObject(value);
					}
				}

			}
		}

		it = iteratorList.iterator();
		while (it.hasNext()) {
			method = (Method) it.next();
			value = method.invoke(obj, null);
			Iterator thisit = (Iterator) value;
			while (thisit.hasNext()) {
				value = (Object) thisit.next();
				// prüft ob die Klasse vom Typ primitiv sei
				if (isBuiltinClass(value.getClass())) {
				} else if (value.getClass() == java.lang.String.class) {
				} else if (isCodeList(value.getClass())) {
				} else {
					if (!object2Id.containsKey(value)) {
						addPendingObject(value);
					}
				}

			}
		}
	}

	private void writeObject(Object obj) throws IOException, IllegalAccessException, InvocationTargetException {

		int thisobjid = ((Integer) object2Id.get(obj)).intValue();

		if (obj instanceof ch.ehi.basics.types.NlsString) {
			out.write("<" + obj.getClass().getName() + " TID=" + '"' + thisobjid + '"' + ">");
			newline();
			ch.ehi.basics.types.NlsString nlsString = (ch.ehi.basics.types.NlsString) obj;
			Map allValues = nlsString.getAllValues();
			Iterator it = allValues.keySet().iterator();
			while (it.hasNext()) {
				String language = (String) it.next();
				String value = (String) allValues.get(language);
				out.write("<Entry TID=\"" + objid++ + "\" language=\"" + encodeString(language) + "\" translation=\""
						+ encodeString(value) + "\"/>");
				newline();

			}
			out.write("</" + obj.getClass().getName() + ">");
			newline();
			return;
		}
		List getterList = (List) getters.get(obj.getClass());
		List iteratorList = (List) iterators.get(obj.getClass());
		Method method;
		Object value = null;
		Iterator it;
		/*
		 ** 2. Objekt selbst schreiben
		 */
		out.write("<" + obj.getClass().getName() + " TID=" + '"' + thisobjid + '"' + ">");
		newline();

		it = getterList.iterator();
		while (it.hasNext()) {
			GetterEntry getter = (GetterEntry) it.next();
			method = getter.get;
			// Wert definiert?
			if (getter.contains != null && !executeContains(obj, getter.contains)) {
				// kein Wert definiert; nichts schreiben
			} else {
				// Wert bestimmen (getXX() ausfuehren)
				value = method.invoke(obj, null);
				if (value != null) {
					// Wert schreiben
					if (isReturnTypeCodeList(method)) {
						out.write("<" + getter.name + ">" + getCodeListValue(value) + "</" + getter.name + ">");
						newline();
					} else if (method.getReturnType().isPrimitive() || method.getReturnType() == java.lang.String.class
							|| isBuiltinClass(method.getReturnType())) {
						out.write("<" + getter.name + ">" + encodeString(value.toString()) + "</" + getter.name + ">");
						newline();
					} else {
						// Objekt vorhanden; Referenz schreiben
						out.write("<" + getter.name + ">" + object2Id.get(value) + "</" + getter.name + ">");
						newline();
					}
				}
			}
		}

		it = iteratorList.iterator();
		while (it.hasNext()) {
			method = (Method) it.next();
			value = method.invoke(obj, null);
			Iterator thisit = (Iterator) value;
			while (thisit.hasNext()) {
				value = (Object) thisit.next();

				// prüft ob die Klasse vom Typ primitiv sei
				if (isBuiltinClass(value.getClass())) {
					out.write("<" + method.getName().substring(8) + ">" + value + "</" + method.getName().substring(8)
							+ ">");
					newline();
				}

				// prüfen nach der Klasse vom Typ String
				else if (value.getClass() == java.lang.String.class) {
					out.write("<" + method.getName().substring(8) + ">" + value + "</" + method.getName().substring(8)
							+ ">");
					newline();
				}

				// prüfen ob CodeList
				else if (isCodeList(value.getClass())) {
					out.write("<" + method.getName().substring(8) + ">" + getCodeListValue(value) + "</"
							+ method.getName().substring(8) + ">");
					newline();
				}

				else {
					out.write("<" + method.getName().substring(8) + ">" + object2Id.get(value) + "</"
							+ method.getName().substring(8) + ">");
					newline();
				}
			}
		}

		out.write("</" + obj.getClass().getName() + ">");
		newline();

	}

	private static String getClassNameOnly(Class aclass) {
		StringBuffer className = new StringBuffer(aclass.getName());
		className.delete(0, aclass.getName().lastIndexOf('.') + 1);
		return className.toString();
	}

	public void encode(Object rootObj, Writer out, String version) throws IOException {
		this.out = out;
		out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
		newline();
		if (version.equals("1.0")) {
			out.write("<ch.ehi.umleditor.1>");
			newline();
		} else {
			out.write("<ch.ehi.umleditor xmlns=\"http://schemas.umleditor.org/umleditor/1.1\">");
			newline();
		}
		try {
			addPendingObject(rootObj);
			while (pendingObjects.size() > 0) {
				Object next = pendingObjects.iterator().next();
				visitObject(next);
				if (next != rootObj) {
					writeObject(next);
				}
				pendingObjects.remove(next);
			}
			// rootObj should be the last written object
			writeObject(rootObj);
			if (version.equals("1.0")) {
				out.write("</ch.ehi.umleditor.1>");
				newline();
			} else {
				out.write("</ch.ehi.umleditor>");
				newline();
			}
		} catch (IllegalAccessException ex) {
			throw new IOException(ex.getLocalizedMessage());
		} catch (InvocationTargetException ex) {
			throw new IOException(ex.getTargetException().getLocalizedMessage());
		}
	}

	// man braucht diese Methode zum "kodieren"
	public void encode(Object obj, String path) throws IOException {
		Writer out;
		out = new BufferedWriter(new FileWriter(path));
		encode(obj, out, path.endsWith("-uml1.uml") ? "1.0" : "1.1");
		out.close();
	}

	static private boolean isBuiltinClass(Class aclass) {
		String name = aclass.getName();
		if (name.equals("java.lang.Boolean") || name.equals("java.lang.Character") || name.equals("java.lang.Byte")
				|| name.equals("java.lang.Short") || name.equals("java.lang.Integer") || name.equals("java.lang.Long")
				|| name.equals("java.lang.Float") || name.equals("java.lang.Double")) {
			return true;
		}
		return false;
	}

	/**
	 * prueft ob der Rueckgabewert einer Funktion eine Klasse der Art CodeList
	 * ist
	 * 
	 * @param method
	 *            Methode die geprueft wird
	 */
	private boolean isReturnTypeCodeList(Method method) {
		return isCodeList(method.getReturnType());
	}

	// checkt, ob es eine Code Liste ist!
	private boolean isCodeList(Class aclass) {
		return codelists.containsKey(aclass);
	}

	private void addPendingObject(Object obj) {
		// object already seen?
		if (pendingObjects.contains(obj)) {
			return;
		}
		// object not yet seen
		// give object an id
		if (obj.getClass() == java.lang.String.class) {
			return;
		}
		int thisobjid = objid++;
		object2Id.put(obj, new Integer(thisobjid));
		pendingObjects.add(obj);

	}

	// holt den Wert aus dieser CodeListe
	private Object getCodeListValue(Object obj) throws InvocationTargetException, IllegalAccessException {
		Method method = (Method) codelists.get(obj.getClass());
		Object codeValue = method.invoke(obj, null);
		return codeValue;
	}

	/**
	 * containsXX() methode ausführen Hier wird geprüft, ob die contains -
	 * Methoden TRUE sind, d.h. ob Objekte hinzugefügt worde sind oder nicht
	 * 
	 * @param obj
	 *            Objekt auf dem die containsXX() Methode ausgeführt werden soll
	 * @param method
	 *            getXX()
	 */
	private boolean executeContains(Object obj, Method containsMethod)
			throws IllegalAccessException, InvocationTargetException {
		// containsXX() ausfuehren
		Object containsValue = containsMethod.invoke(obj, null);
		if (containsValue.toString() == "true") {
			return true;
		} else {
			return false;
		}

	}

	private static String encodeString(String s) {
		StringBuffer str = new StringBuffer();

		int len = (s != null) ? s.length() : 0;
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (ch == '<') {
				str.append("&lt;");
			} else if (ch == '>') {
				str.append("&gt;");
			} else if (ch == '&') {
				str.append("&amp;");
			} else if (ch == '\'') {
				str.append("&apos;");
			} else if (ch == '"') {
				str.append("&quot;");
			} else if (ch >= 0x80 || ch == '\r' || ch == '\n') {
				str.append("&#");
				str.append(Integer.toString(ch));
				str.append(';');
			} else {
				str.append(ch);
			}
		}

		return str.toString();

	}

	/**
	 * current line seperator
	 *
	 */
	static private String nl = null;

	/**
	 * current line number
	 *
	 */
	private int lineNumber;

	/**
	 * write a line seperator
	 *
	 */
	private void newline() throws java.io.IOException {
		if (nl == null)
			nl = System.getProperty("line.separator");
		out.write(nl);
		lineNumber++;
	}

	// -end- 3CD8FE4D01CC detail_end "XMLInterlisEncoder"

}
