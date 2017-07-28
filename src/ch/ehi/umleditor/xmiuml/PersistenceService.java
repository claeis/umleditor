// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:41:28 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3C3EBE350000 package "PersistenceService"
package ch.ehi.umleditor.xmiuml;
// -end- 3C3EBE350000 package "PersistenceService"

// -beg- preserve=no 3C3EBE350000 autoimport "PersistenceService"
import ch.ehi.uml1_4.modelmanagement.Model;
// -end- 3C3EBE350000 autoimport "PersistenceService"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3C3EBE350000 import "PersistenceService"
import java.io.*;
// -end- 3C3EBE350000 import "PersistenceService"

/** provides service to read and write an UML model from/to an XMI/UML File
 */
public class PersistenceService
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=yes 3C3EBE350000 detail_begin "PersistenceService"
static private final boolean xmlout=true;
// -end- 3C3EBE350000 detail_begin "PersistenceService"

// -beg- preserve=no 3C3EC1360331 head3C3EBE350000 "readFile"
public Model readFile(String fileName)
// -end- 3C3EC1360331 head3C3EBE350000 "readFile"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=yes 3C3EC1360331 throws3C3EBE350000 "readFile"
throws FileNotFoundException, IOException, ClassNotFoundException
// -end- 3C3EC1360331 throws3C3EBE350000 "readFile"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3C3EC1360331 body3C3EBE350000 "readFile"
        Model model;
        if(xmlout) {
                ch.ehi.umleditor.xmiuml.ehi.XMLInterlisDecoder decoder=new ch.ehi.umleditor.xmiuml.ehi.XMLInterlisDecoder();
                model=(Model)decoder.decode(fileName);
        }else{
                FileInputStream in = new FileInputStream(fileName);
                ObjectInputStream s = new ObjectInputStream(in);
                model = (Model)s.readObject();
                in.close();
        }
        return model;
        // -end- 3C3EC1360331 body3C3EBE350000 "readFile"
}

// -beg- preserve=no 3C3EC152038B head3C3EBE350000 "writeFile"
public void writeFile(String fileName, Model model)
// -end- 3C3EC152038B head3C3EBE350000 "writeFile"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=yes 3C3EC152038B throws3C3EBE350000 "writeFile"
throws IOException
// -end- 3C3EC152038B throws3C3EBE350000 "writeFile"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3C3EC152038B body3C3EBE350000 "writeFile"
        if(xmlout) {
                ch.ehi.umleditor.xmiuml.ehi.XMLInterlisEncoder encoder=new ch.ehi.umleditor.xmiuml.ehi.XMLInterlisEncoder();
                encoder.encode(model,fileName);
        }else{
                FileOutputStream out = new FileOutputStream(fileName);
                ObjectOutputStream s = new ObjectOutputStream(out);
                s.writeObject(model);
                s.flush();
                out.close();
        }
        return;
        // -end- 3C3EC152038B body3C3EBE350000 "writeFile"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3C3EBE350000 detail_end "PersistenceService"

// -end- 3C3EBE350000 detail_end "PersistenceService"

}
