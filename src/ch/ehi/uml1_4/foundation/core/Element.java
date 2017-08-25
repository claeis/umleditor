// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:28 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 327A5C330208 package "Element"
package ch.ehi.uml1_4.foundation.core;
// -end- 327A5C330208 package "Element"

// -beg- preserve=no 327A5C330208 autoimport "Element"
import ch.ehi.basics.tools.Visitable;
import ch.ehi.basics.types.NlsString;
import ch.ehi.basics.tools.AbstractVisitor;
// -end- 327A5C330208 autoimport "Element"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 327A5C330208 import "Element"

// -end- 327A5C330208 import "Element"

/** An element is an atomic constituent of a model.
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:28 $
 */
public interface Element extends Visitable, java.io.Serializable
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A5C330208 detail_begin "Element"

// -end- 327A5C330208 detail_begin "Element"

// -beg- preserve=no 3CAD8A350188 head327A5C330208 "unlinkAll"
public void unlinkAll()
// -end- 3CAD8A350188 head327A5C330208 "unlinkAll"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CAD8A350188 throws327A5C330208 "unlinkAll"

// -end- 3CAD8A350188 throws327A5C330208 "unlinkAll"
;     // empty

/** process any children by calling visitor.
 */
// -beg- preserve=no 3CBD80C80077 head327A5C330208 "enumerateChildren"
public void enumerateChildren(AbstractVisitor visitor)
// -end- 3CBD80C80077 head327A5C330208 "enumerateChildren"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CBD80C80077 throws327A5C330208 "enumerateChildren"

// -end- 3CBD80C80077 throws327A5C330208 "enumerateChildren"
;     // empty

/** get current value of documentation
 *  @see #setDocumentation
 */
// -beg- preserve=no 3C1DF92B0234 get_head327A5C330208 "documentation"
NlsString getDocumentation()
// -end- 3C1DF92B0234 get_head327A5C330208 "documentation"
;     // empty
/** set current value of documentation
 *  @see #getDocumentation
 */
// -beg- preserve=no 3C1DF92B0234 set_head327A5C330208 "documentation"
void setDocumentation(NlsString value1)
// -end- 3C1DF92B0234 set_head327A5C330208 "documentation"
;     // empty
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 327A5C330208 detail_end "Element"

// -end- 327A5C330208 detail_end "Element"
public NlsString getMetaAttrb();
public void setMetaAttrb(NlsString value);

public NlsString getMetaName();
public void setMetaName(NlsString value);

public NlsString getMetaMsg();
public void setMetaMsg(NlsString value);
}
