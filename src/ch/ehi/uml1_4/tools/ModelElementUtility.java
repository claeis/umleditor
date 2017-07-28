// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:19 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3E4F65A100D1 package "ModelElementUtility"
package ch.ehi.uml1_4.tools;
// -end- 3E4F65A100D1 package "ModelElementUtility"

// -beg- preserve=no 3E4F65A100D1 autoimport "ModelElementUtility"
import ch.ehi.uml1_4.foundation.core.ModelElement;
// -end- 3E4F65A100D1 autoimport "ModelElementUtility"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3E4F65A100D1 import "ModelElementUtility"
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;

// -end- 3E4F65A100D1 import "ModelElementUtility"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:19 $
 */
public class ModelElementUtility
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3E4F65A100D1 detail_begin "ModelElementUtility"

// -end- 3E4F65A100D1 detail_begin "ModelElementUtility"

// -beg- preserve=no 3E4F66080364 head3E4F65A100D1 "ModelElementUtility"
private ModelElementUtility()
// -end- 3E4F66080364 head3E4F65A100D1 "ModelElementUtility"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3E4F66080364 throws3E4F65A100D1 "ModelElementUtility"

// -end- 3E4F66080364 throws3E4F65A100D1 "ModelElementUtility"
{
        // please fill in/modify the following section
        // -beg- preserve=no 3E4F66080364 body3E4F65A100D1 "ModelElementUtility"
        return;
        // -end- 3E4F66080364 body3E4F65A100D1 "ModelElementUtility"
}

// -beg- preserve=no 3E4F661401BD head3E4F65A100D1 "getUmlPath"
public static String getUmlPath(ModelElement element, String language)
// -end- 3E4F661401BD head3E4F65A100D1 "getUmlPath"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3E4F661401BD throws3E4F65A100D1 "getUmlPath"

// -end- 3E4F661401BD throws3E4F65A100D1 "getUmlPath"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3E4F661401BD body3E4F65A100D1 "getUmlPath"

        // setup language
        if(language==null) {
                language=ch.ehi.basics.types.NlsString.getDefaultLanguage();
        }

        ch.ehi.uml1_4.foundation.core.Namespace parent=null;
        if(element instanceof Feature) {
                if(!((Feature)element).containsOwner()) {
                        throw new IllegalStateException(element.getDefLangName()+" not inside an Owner");
                }
                parent=((Feature)element).getOwner();
        }else if(element instanceof AssociationEnd) {
                if(!((AssociationEnd)element).containsAssociation()) {
                        throw new IllegalStateException(element.getDefLangName()+" not inside an Association");
                }
                return getUmlPath(((AssociationEnd)element).getAssociation(),language);
        }else{
                if(!element.containsNamespace()) {
                        throw new IllegalStateException(element.getDefLangName()+" not inside a Namespace");
                }
                parent=element.getNamespace();
        }

        if(parent instanceof ch.ehi.uml1_4.implementation.UmlModel) {
                return "";
        }
        StringBuffer ret=new StringBuffer(parent.getName().getValue(language));
        while(parent.containsNamespace()) {
                parent=parent.getNamespace();
                if(parent instanceof ch.ehi.uml1_4.implementation.UmlModel) {
                        break;
                }
                ret.insert(0,parent.getName().getValue(language)+".");
        }

        return ret.toString();
        // -end- 3E4F661401BD body3E4F65A100D1 "getUmlPath"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3E4F65A100D1 detail_end "ModelElementUtility"

// -end- 3E4F65A100D1 detail_end "ModelElementUtility"

}
