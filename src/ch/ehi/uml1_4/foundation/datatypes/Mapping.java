// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:44 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 33FFFA1400A9 package "Mapping"
package ch.ehi.uml1_4.foundation.datatypes;
// -end- 33FFFA1400A9 package "Mapping"

// -beg- preserve=no 33FFFA1400A9 autoimport "Mapping"
import ch.ehi.basics.types.NlsString;
// -end- 33FFFA1400A9 autoimport "Mapping"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 33FFFA1400A9 import "Mapping"

// -end- 33FFFA1400A9 import "Mapping"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:44 $
 */
public interface Mapping extends java.io.Serializable
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33FFFA1400A9 detail_begin "Mapping"

  // -end- 33FFFA1400A9 detail_begin "Mapping"

  /** get current value of body
   *  @see #setBody
   */
  // -beg- preserve=no 3405756203DE get_head33FFFA1400A9 "body"
   NlsString getBody()
  // -end- 3405756203DE get_head33FFFA1400A9 "body"
    ; // empty
  /** set current value of body
   *  @see #getBody
   */
  // -beg- preserve=no 3405756203DE set_head33FFFA1400A9 "body"
   void setBody(NlsString value1)
  // -end- 3405756203DE set_head33FFFA1400A9 "body"
    ; // empty
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 33FFFA1400A9 detail_end "Mapping"

  // -end- 33FFFA1400A9 detail_end "Mapping"

}

