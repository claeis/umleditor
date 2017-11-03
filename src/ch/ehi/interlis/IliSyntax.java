// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:33:24 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3C8F5A9801D9 package "IliSyntax"
package ch.ehi.interlis;
// -end- 3C8F5A9801D9 package "IliSyntax"

// -beg- preserve=no 3C8F5A9801D9 autoimport "IliSyntax"
import ch.ehi.basics.types.NlsString;
// -end- 3C8F5A9801D9 autoimport "IliSyntax"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C8F5A9801D9 import "IliSyntax"

// -end- 3C8F5A9801D9 import "IliSyntax"

/**
 * Contains the definition of an INTERIS model element that has not yet an
 * associated GUI or is not yet modelled in the metamodel.
 * 
 * @author Claude Eisenhut
 * @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:33:24 $
 */
public interface IliSyntax extends java.io.Serializable {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C8F5A9801D9 detail_begin "IliSyntax"

	// -end- 3C8F5A9801D9 detail_begin "IliSyntax"

	/**
	 * get current value of syntax the actual definition of the model element in
	 * valid INTERLIS syntax.
	 * 
	 * @see #setSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D get_head3C8F5A9801D9 "syntax"
	NlsString getSyntax()
	// -end- 3C8F5ABE022D get_head3C8F5A9801D9 "syntax"
	; // empty

	/**
	 * set current value of syntax
	 * 
	 * @see #getSyntax
	 */
	// -beg- preserve=no 3C8F5ABE022D set_head3C8F5A9801D9 "syntax"
	void setSyntax(NlsString value1)
	// -end- 3C8F5ABE022D set_head3C8F5A9801D9 "syntax"
	; // empty
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=no 3C8F5A9801D9 detail_end "IliSyntax"

	// -end- 3C8F5A9801D9 detail_end "IliSyntax"

}
