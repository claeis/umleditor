// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:40:33 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3CDA447803C0 package "CheckModel"
package ch.ehi.umleditor.interlis.modelcheck;
// -end- 3CDA447803C0 package "CheckModel"

// -beg- preserve=no 3CDA447803C0 autoimport "CheckModel"

// -end- 3CDA447803C0 autoimport "CheckModel"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CDA447803C0 import "CheckModel"
import ch.ehi.umleditor.interlis.iliexport.TransferFromUmlMetamodel;
// -end- 3CDA447803C0 import "CheckModel"

public class CheckModel
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3CDA447803C0 detail_begin "CheckModel"

  // -end- 3CDA447803C0 detail_begin "CheckModel"

  // -beg- preserve=no 3CDA448E01A5 head3CDA447803C0 "checkAll"
  public static void checkAll()
  // -end- 3CDA448E01A5 head3CDA447803C0 "checkAll"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CDA448E01A5 throws3CDA447803C0 "checkAll"

    // -end- 3CDA448E01A5 throws3CDA447803C0 "checkAll"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CDA448E01A5 body3CDA447803C0 "checkAll"
    TransferFromUmlMetamodel writer=new TransferFromUmlMetamodel();
    try{
       writer.setCheckModel(true);
       writer.visitNamespace(ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
    }catch(java.io.IOException ex){
      ch.ehi.umleditor.application.LauncherView.getInstance().log(writer.getFuncDesc(),ex.getLocalizedMessage());
    }
    return;
    // -end- 3CDA448E01A5 body3CDA447803C0 "checkAll"
    }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=no 3CDA447803C0 detail_end "CheckModel"

  // -end- 3CDA447803C0 detail_end "CheckModel"

}

