// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:44 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33CFA00203A2 package "Expression"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33CFA00203A2 package "Expression"

// -beg- preserve=no 33CFA00203A2 autoimport "Expression"
import ch.ehi.basics.types.NlsString;
// -end- 33CFA00203A2 autoimport "Expression"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33CFA00203A2 import "Expression"

// -end- 33CFA00203A2 import "Expression"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:44 $
 */
public interface Expression extends java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33CFA00203A2 detail_begin "Expression"

  // -end- 33CFA00203A2 detail_begin "Expression"

  /** get current value of language
   *  @see #setLanguage
   */
  // -beg- preserve=no 33E12E5F01CA get_head33CFA00203A2 "language"
   String getLanguage()
  // -end- 33E12E5F01CA get_head33CFA00203A2 "language"
    ; // empty
  /** set current value of language
   *  @see #getLanguage
   */
  // -beg- preserve=no 33E12E5F01CA set_head33CFA00203A2 "language"
   void setLanguage(String value1)
  // -end- 33E12E5F01CA set_head33CFA00203A2 "language"
    ; // empty
  /** get current value of body
   *  @see #setBody
   */
  // -beg- preserve=no 33E12E870203 get_head33CFA00203A2 "body"
   NlsString getBody()
  // -end- 33E12E870203 get_head33CFA00203A2 "body"
    ; // empty
  /** set current value of body
   *  @see #getBody
   */
  // -beg- preserve=no 33E12E870203 set_head33CFA00203A2 "body"
   void setBody(NlsString value1)
  // -end- 33E12E870203 set_head33CFA00203A2 "body"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33CFA00203A2 detail_end "Expression"

  // -end- 33CFA00203A2 detail_end "Expression"

}

