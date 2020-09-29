// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2004-01-04 10:54:05 $
// $Revision: 1.3 $
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
 *  @version $Revision: 1.3 $ $Date: 2004-01-04 10:54:05 $
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
  // -beg- preserve=yes 3C454DFD0284 detail_end "MetaModelChange"
  public static final String OP_ATTACH="attach";
  public static final String OP_DETACH="detach";
  public static final String OP_ADD="add";
  public static final String OP_REMOVE="remove";
  public static final String OP_SET="set";
  public static final String OP_CLEAR="clear";
  public static final String OP_CHANGE="change";
  public static final String OP_SWAP="swap";
  public static final String OP__LINK="_link";
  public static final String OP__UNLINK="_unlink";
  public static final String[] OPS={
    OP_ATTACH
    ,OP_DETACH
    ,OP_ADD
    ,OP_REMOVE
    ,OP_SET
    ,OP_CLEAR
    ,OP_CHANGE
    ,OP_SWAP
    ,OP__LINK
    ,OP__UNLINK
    };
  public String toString()
  {
  	return "source="+getSource().toString()+", operation="+getOperation();
  }
  public static boolean isAttribute(String ops,String attr){
    if(ops==null || ops.length()==0){
      return false;
    }
    for(int i=0;i<OPS.length;i++){
      if(ops.equals(OPS[i]+attr))return true;
    }
    return false;
  }

  // -end- 3C454DFD0284 detail_end "MetaModelChange"

}

