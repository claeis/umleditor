// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2006-11-08 15:30:40 $
// $Revision: 1.1 $
//

// -beg- preserve=no 4551E9FD0298 package "UmlBooleanExpression"
package ch.ehi.uml1_4.implementation;
// -end- 4551E9FD0298 package "UmlBooleanExpression"

// -beg- preserve=no 4551E9FD0298 autoimport "UmlBooleanExpression"
import ch.ehi.uml1_4.foundation.datatypes.BooleanExpression;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.basics.tools.AbstractVisitor;
import ch.ehi.basics.types.NlsString;
// -end- 4551E9FD0298 autoimport "UmlBooleanExpression"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 4551E9FD0298 import "UmlBooleanExpression"

// -end- 4551E9FD0298 import "UmlBooleanExpression"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1 $ $Date: 2006-11-08 15:30:40 $
 */
public class UmlBooleanExpression extends AbstractEditorElement implements BooleanExpression {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551E9FD0298 detail_begin "UmlBooleanExpression"

	// -end- 4551E9FD0298 detail_begin "UmlBooleanExpression"

	// -beg- preserve=no 4551EC7902F7 head4551E9FD0298 "unlinkAll"
	public void unlinkAll()
	// -end- 4551EC7902F7 head4551E9FD0298 "unlinkAll"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551EC7902F7 throws4551E9FD0298 "unlinkAll"

	// -end- 4551EC7902F7 throws4551E9FD0298 "unlinkAll"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551EC7902F7 body4551E9FD0298 "unlinkAll"

		setBody(null);
		super.unlinkAll();
		// -end- 4551EC7902F7 body4551E9FD0298 "unlinkAll"
	}

	// -beg- preserve=no 4551EC79030B head4551E9FD0298 "enumerateChildren"
	public void enumerateChildren(AbstractVisitor visitor)
	// -end- 4551EC79030B head4551E9FD0298 "enumerateChildren"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 4551EC79030B throws4551E9FD0298 "enumerateChildren"

	// -end- 4551EC79030B throws4551E9FD0298 "enumerateChildren"
	{
		// please fill in/modify the following section
		// -beg- preserve=no 4551EC79030B body4551E9FD0298 "enumerateChildren"
		java.util.Iterator it = null;
		visitor.visit(getBody());
		super.enumerateChildren(visitor);
		// -end- 4551EC79030B body4551E9FD0298 "enumerateChildren"
	}

	// -beg- preserve=no 33E12E5F01CA var4551E9FD0298 "language"
	private String language;
	// -end- 33E12E5F01CA var4551E9FD0298 "language"

	/**
	 * get current value of language
	 * 
	 * @see #setLanguage
	 */
	// -beg- preserve=no 33E12E5F01CA get_head4551E9FD0298 "language"
	public String getLanguage()
	// -end- 33E12E5F01CA get_head4551E9FD0298 "language"
	{
		// -beg- preserve=no 33E12E5F01CA get_body4551E9FD0298 "language"
		return language;
		// -end- 33E12E5F01CA get_body4551E9FD0298 "language"
	}

	/**
	 * set current value of language
	 * 
	 * @see #getLanguage
	 */
	// -beg- preserve=no 33E12E5F01CA set_head4551E9FD0298 "language"
	public void setLanguage(String value1)
	// -end- 33E12E5F01CA set_head4551E9FD0298 "language"
	{
		// -beg- preserve=no 33E12E5F01CA set_body4551E9FD0298 "language"
		if (language != value1) {
			language = value1;

		}
		// -end- 33E12E5F01CA set_body4551E9FD0298 "language"
	}

	// -beg- preserve=no 33E12E870203 var4551E9FD0298 "body"
	private NlsString body = null;
	// -end- 33E12E870203 var4551E9FD0298 "body"

	/**
	 * get current value of body
	 * 
	 * @see #setBody
	 */
	// -beg- preserve=no 33E12E870203 get_head4551E9FD0298 "body"
	public NlsString getBody()
	// -end- 33E12E870203 get_head4551E9FD0298 "body"
	{
		// -beg- preserve=no 33E12E870203 get_body4551E9FD0298 "body"
		return body;
		// -end- 33E12E870203 get_body4551E9FD0298 "body"
	}

	/**
	 * set current value of body
	 * 
	 * @see #getBody
	 */
	// -beg- preserve=no 33E12E870203 set_head4551E9FD0298 "body"
	public void setBody(NlsString value1)
	// -end- 33E12E870203 set_head4551E9FD0298 "body"
	{
		// -beg- preserve=no 33E12E870203 set_body4551E9FD0298 "body"
		if (body != value1 && (body == null || !body.equals(value1))) {
			body = value1;

		}
		// -end- 33E12E870203 set_body4551E9FD0298 "body"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 4551E9FD0298 detail_end "UmlBooleanExpression"

	// -end- 4551E9FD0298 detail_end "UmlBooleanExpression"

}
