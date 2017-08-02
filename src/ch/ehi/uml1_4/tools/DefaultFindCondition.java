// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:19 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3E410507036E package "DefaultFindCondition"
package ch.ehi.uml1_4.tools;
// -end- 3E410507036E package "DefaultFindCondition"

// -beg- preserve=no 3E410507036E autoimport "DefaultFindCondition"
import ch.ehi.uml1_4.tools.FindCondition;
import ch.ehi.uml1_4.foundation.core.ModelElement;
// -end- 3E410507036E autoimport "DefaultFindCondition"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3E410507036E import "DefaultFindCondition"
import ch.ehi.basics.types.NlsString;

// -end- 3E410507036E import "DefaultFindCondition"

/**
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:19 $
 */
public class DefaultFindCondition implements FindCondition {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3E410507036E detail_begin "DefaultFindCondition"
	private String text_lc;
	// -end- 3E410507036E detail_begin "DefaultFindCondition"

	// -beg- preserve=no 3E410744017E head3E410507036E "testModelElement"
	public boolean testModelElement(ModelElement ele)
	// -end- 3E410744017E head3E410507036E "testModelElement"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E410744017E throws3E410507036E "testModelElement"

	// -end- 3E410744017E throws3E410507036E "testModelElement"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E410744017E body3E410507036E "testModelElement"
		if (isSearchInName()) {
			if (isIgnoreCase()) {
				String name_lc = nls2str(ele.getName()).toLowerCase();
				if (name_lc.indexOf(text_lc) >= 0) {
					return true;
				}
			} else {
				String name = nls2str(ele.getName());
				if (name.indexOf(text) >= 0) {
					return true;
				}
			}
		}
		if (isSearchInDocumentation()) {
			if (isIgnoreCase()) {
				String doc_lc = nls2str(ele.getDocumentation()).toLowerCase();
				if (doc_lc.indexOf(text_lc) >= 0) {
					return true;
				}
			} else {
				String doc = nls2str(ele.getDocumentation());
				if (doc.indexOf(text) >= 0) {
					return true;
				}
			}
		}
		return false;
		// -end- 3E410744017E body3E410507036E "testModelElement"
	}

	// -beg- preserve=no 3E410537009C var3E410507036E "ignoreCase"
	private boolean ignoreCase = true;
	// -end- 3E410537009C var3E410507036E "ignoreCase"

	/**
	 * get current value of ignoreCase
	 * 
	 * @see #setIgnoreCase
	 */
	// -beg- preserve=no 3E410537009C get_head3E410507036E "ignoreCase"
	public boolean isIgnoreCase()
	// -end- 3E410537009C get_head3E410507036E "ignoreCase"
	{
		// -beg- preserve=no 3E410537009C get_body3E410507036E "ignoreCase"
		return ignoreCase;
		// -end- 3E410537009C get_body3E410507036E "ignoreCase"
	}

	/**
	 * set current value of ignoreCase
	 * 
	 * @see #isIgnoreCase
	 */
	// -beg- preserve=no 3E410537009C set_head3E410507036E "ignoreCase"
	public void setIgnoreCase(boolean value1)
	// -end- 3E410537009C set_head3E410507036E "ignoreCase"
	{
		// -beg- preserve=no 3E410537009C set_body3E410507036E "ignoreCase"
		if (ignoreCase != value1) {
			ignoreCase = value1;

		}
		// -end- 3E410537009C set_body3E410507036E "ignoreCase"
	}

	// -beg- preserve=no 3E4105890036 var3E410507036E "searchInName"
	private boolean searchInName = true;
	// -end- 3E4105890036 var3E410507036E "searchInName"

	/**
	 * get current value of searchInName
	 * 
	 * @see #setSearchInName
	 */
	// -beg- preserve=no 3E4105890036 get_head3E410507036E "searchInName"
	public boolean isSearchInName()
	// -end- 3E4105890036 get_head3E410507036E "searchInName"
	{
		// -beg- preserve=no 3E4105890036 get_body3E410507036E "searchInName"
		return searchInName;
		// -end- 3E4105890036 get_body3E410507036E "searchInName"
	}

	/**
	 * set current value of searchInName
	 * 
	 * @see #isSearchInName
	 */
	// -beg- preserve=no 3E4105890036 set_head3E410507036E "searchInName"
	public void setSearchInName(boolean value1)
	// -end- 3E4105890036 set_head3E410507036E "searchInName"
	{
		// -beg- preserve=no 3E4105890036 set_body3E410507036E "searchInName"
		if (searchInName != value1) {
			searchInName = value1;

		}
		// -end- 3E4105890036 set_body3E410507036E "searchInName"
	}

	// -beg- preserve=no 3E41058D02EF var3E410507036E "searchInDocumentation"
	private boolean searchInDocumentation = false;
	// -end- 3E41058D02EF var3E410507036E "searchInDocumentation"

	/**
	 * get current value of searchInDocumentation
	 * 
	 * @see #setSearchInDocumentation
	 */
	// -beg- preserve=no 3E41058D02EF get_head3E410507036E
	// "searchInDocumentation"
	public boolean isSearchInDocumentation()
	// -end- 3E41058D02EF get_head3E410507036E "searchInDocumentation"
	{
		// -beg- preserve=no 3E41058D02EF get_body3E410507036E
		// "searchInDocumentation"
		return searchInDocumentation;
		// -end- 3E41058D02EF get_body3E410507036E "searchInDocumentation"
	}

	/**
	 * set current value of searchInDocumentation
	 * 
	 * @see #isSearchInDocumentation
	 */
	// -beg- preserve=no 3E41058D02EF set_head3E410507036E
	// "searchInDocumentation"
	public void setSearchInDocumentation(boolean value1)
	// -end- 3E41058D02EF set_head3E410507036E "searchInDocumentation"
	{
		// -beg- preserve=no 3E41058D02EF set_body3E410507036E
		// "searchInDocumentation"
		if (searchInDocumentation != value1) {
			searchInDocumentation = value1;

		}
		// -end- 3E41058D02EF set_body3E410507036E "searchInDocumentation"
	}

	// -beg- preserve=no 3E410BC90272 var3E410507036E "text"
	private String text;
	// -end- 3E410BC90272 var3E410507036E "text"

	/**
	 * get current value of text text to find
	 * 
	 * @see #setText
	 */
	// -beg- preserve=no 3E410BC90272 get_head3E410507036E "text"
	public String getText()
	// -end- 3E410BC90272 get_head3E410507036E "text"
	{
		// -beg- preserve=no 3E410BC90272 get_body3E410507036E "text"
		return text;
		// -end- 3E410BC90272 get_body3E410507036E "text"
	}

	/**
	 * set current value of text
	 * 
	 * @see #getText
	 */
	// -beg- preserve=no 3E410BC90272 set_head3E410507036E "text"
	public void setText(String value1)
	// -end- 3E410BC90272 set_head3E410507036E "text"
	{
		// -beg- preserve=yes 3E410BC90272 set_body3E410507036E "text"
		if (text != value1) {
			text = value1;
			text_lc = value1.toLowerCase();
		}
		// -end- 3E410BC90272 set_body3E410507036E "text"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3E410507036E detail_end "DefaultFindCondition"
	private static String nls2str(ch.ehi.basics.types.NlsString str) {
		if (str == null) {
			return "";
		} else {
			return str.getValue();
		}
	}

	// -end- 3E410507036E detail_end "DefaultFindCondition"

}
