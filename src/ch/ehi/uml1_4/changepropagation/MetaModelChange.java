// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:37:16 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3C454DFD0284 package "MetaModelChange"
package ch.ehi.uml1_4.changepropagation;
// -end- 3C454DFD0284 package "MetaModelChange"

// -beg- preserve=no 3C454DFD0284 autoimport "MetaModelChange"
import java.util.EventObject;
// -end- 3C454DFD0284 autoimport "MetaModelChange"

// import declarations
// please fill in/modify the following section
// -beg- preserve=no 3C454DFD0284 import "MetaModelChange"

// -end- 3C454DFD0284 import "MetaModelChange"

/** This class captures the change that appeared to the meta model
 *  @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:37:16 $
 */
public class MetaModelChange extends EventObject
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3C454DFD0284 detail_begin "MetaModelChange"
  private String operation=null;

  // -end- 3C454DFD0284 detail_begin "MetaModelChange"

  // -beg- preserve=no 3C454FC50261 head3C454DFD0284 "MetaModelChange"
  public MetaModelChange(java.lang.Object source, String operation)
  // -end- 3C454FC50261 head3C454DFD0284 "MetaModelChange"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3C454FC50261 throws3C454DFD0284 "MetaModelChange"

    // -end- 3C454FC50261 throws3C454DFD0284 "MetaModelChange"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3C454FC50261 body3C454DFD0284 "MetaModelChange"
    super(source);
    this.operation=operation;
    return;
    // -end- 3C454FC50261 body3C454DFD0284 "MetaModelChange"
    }

  // -beg- preserve=no 3E63F7A2023E head3C454DFD0284 "getOperation"
  public String getOperation()
  // -end- 3E63F7A2023E head3C454DFD0284 "getOperation"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3E63F7A2023E throws3C454DFD0284 "getOperation"

    // -end- 3E63F7A2023E throws3C454DFD0284 "getOperation"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3E63F7A2023E body3C454DFD0284 "getOperation"
    return operation;
    // -end- 3E63F7A2023E body3C454DFD0284 "getOperation"
    }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3C454DFD0284 detail_end "MetaModelChange"

  // -end- 3C454DFD0284 detail_end "MetaModelChange"

}

