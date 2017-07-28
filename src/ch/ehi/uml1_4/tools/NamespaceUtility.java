// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:38:20 $
// $Revision: 1.1.1.1 $
//

// -beg- preserve=no 3CC7BC920362 package "NamespaceUtility"
package ch.ehi.uml1_4.tools;
// -end- 3CC7BC920362 package "NamespaceUtility"

// -beg- preserve=no 3CC7BC920362 autoimport "NamespaceUtility"
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.uml1_4.tools.FindCondition;
// -end- 3CC7BC920362 autoimport "NamespaceUtility"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CC7BC920362 import "NamespaceUtility"
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.uml1_4.foundation.core.AssociationEnd;

// -end- 3CC7BC920362 import "NamespaceUtility"

/** @author Claude Eisenhut
 *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:38:20 $
 */
public class NamespaceUtility
{
// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3CC7BC920362 detail_begin "NamespaceUtility"

// -end- 3CC7BC920362 detail_begin "NamespaceUtility"

/** checks if a ModelElement exists in this Namespace and all its Sub-Namespaces
 */
// -beg- preserve=no 3CC7BCC002FA head3CC7BC920362 "deepContainsOwnedElement"
public static boolean deepContainsOwnedElement(Namespace namespace, java.lang.Class aclass, String name)
// -end- 3CC7BCC002FA head3CC7BC920362 "deepContainsOwnedElement"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CC7BCC002FA throws3CC7BC920362 "deepContainsOwnedElement"

// -end- 3CC7BCC002FA throws3CC7BC920362 "deepContainsOwnedElement"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3CC7BCC002FA body3CC7BC920362 "deepContainsOwnedElement"
        java.util.ArrayList todo=new java.util.ArrayList(); // collection of containers not yet visited
        // add root namespace to todo-list; so it is processed as a first element
        todo.add(namespace);
        // process todo-list
        while(!todo.isEmpty()) {
                Namespace current=(Namespace)todo.get(0);
                java.util.Iterator it = current.iteratorOwnedElement();
                while (it.hasNext()) {
                        ModelElement ele=(ModelElement)it.next();
                        if(name.equals(ele.getDefLangName()) && aclass.isAssignableFrom(ele.getClass())) {
                                return true;
                        }
                        if(ele instanceof Namespace) {
                                // ele is itself a container
                                // add it to todo-list
                                todo.add(ele);
                        }
                }
                // remove current from todo-list
                todo.remove(0);
        }
        return false;
        // -end- 3CC7BCC002FA body3CC7BC920362 "deepContainsOwnedElement"
}

/** finds a ModelElement in this Namespace or all its Sub-Namespaces
 */
// -beg- preserve=no 3CC7BCC30114 head3CC7BC920362 "deepGetOwnedElement"
public static ModelElement deepGetOwnedElement(Namespace namespace, java.lang.Class aclass, String name)
// -end- 3CC7BCC30114 head3CC7BC920362 "deepGetOwnedElement"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3CC7BCC30114 throws3CC7BC920362 "deepGetOwnedElement"

// -end- 3CC7BCC30114 throws3CC7BC920362 "deepGetOwnedElement"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3CC7BCC30114 body3CC7BC920362 "deepGetOwnedElement"

        java.util.ArrayList todo=new java.util.ArrayList(); // collection of containers not yet visited
        // add root namespace to todo-list; so it is processed as a first element
        todo.add(namespace);
        // process todo-list
        while(!todo.isEmpty()) {
                Namespace current=(Namespace)todo.get(0);
                java.util.Iterator it = current.iteratorOwnedElement();
                while (it.hasNext()) {
                        ModelElement ele=(ModelElement)it.next();
                        if(name.equals(ele.getDefLangName()) && aclass.isAssignableFrom(ele.getClass())) {
                                return ele;
                        }
                        if(ele instanceof Namespace) {
                                // ele is itself a container
                                // add it to todo-list
                                todo.add(ele);
                        }
                }
                // remove current from todo-list
                todo.remove(0);
        }


        throw new java.lang.IllegalStateException("no ownedElement with given name <"+name+">");
        // -end- 3CC7BCC30114 body3CC7BC920362 "deepGetOwnedElement"
}

/** checks if a Element exists in this Namespace and all its Sub-Namespaces
 */
// -beg- preserve=no 3D78A03A0194 head3CC7BC920362 "deepContainsElementById"
public static boolean deepContainsElementById(Namespace namespace, String id)
// -end- 3D78A03A0194 head3CC7BC920362 "deepContainsElementById"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D78A03A0194 throws3CC7BC920362 "deepContainsElementById"

// -end- 3D78A03A0194 throws3CC7BC920362 "deepContainsElementById"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3D78A03A0194 body3CC7BC920362 "deepContainsElementById"
        ChildFinderById finder=new ChildFinderById(id);
        finder.visit(namespace);
        return finder.containsElement();
        // -end- 3D78A03A0194 body3CC7BC920362 "deepContainsElementById"
}

/** finds a ModelElement in this Namespace or all its Sub-Namespaces
 */
// -beg- preserve=no 3D78A05D000E head3CC7BC920362 "deepGetElementById"
public static AbstractEditorElement deepGetElementById(Namespace namespace, String id)
// -end- 3D78A05D000E head3CC7BC920362 "deepGetElementById"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3D78A05D000E throws3CC7BC920362 "deepGetElementById"

// -end- 3D78A05D000E throws3CC7BC920362 "deepGetElementById"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3D78A05D000E body3CC7BC920362 "deepGetElementById"
        ChildFinderById finder=new ChildFinderById(id);
        finder.visit(namespace);
        return finder.getElement();
        // -end- 3D78A05D000E body3CC7BC920362 "deepGetElementById"
}

/** finds all ModelElement in this Namespace or all its Sub-Namespaces
 */
// -beg- preserve=no 3E4104730235 head3CC7BC920362 "deepFindOwnedElements"
public static java.util.Set deepFindOwnedElements(Namespace namespace, FindCondition condition)
// -end- 3E4104730235 head3CC7BC920362 "deepFindOwnedElements"
// declare any checked exceptions
// please fill in/modify the following section
// -beg- preserve=no 3E4104730235 throws3CC7BC920362 "deepFindOwnedElements"

// -end- 3E4104730235 throws3CC7BC920362 "deepFindOwnedElements"
{
        // please fill in/modify the following section
        // -beg- preserve=yes 3E4104730235 body3CC7BC920362 "deepFindOwnedElements"
        java.util.Set foundElements=new java.util.HashSet();
        java.util.ArrayList todo=new java.util.ArrayList(); // collection of containers not yet visited
        // add root namespace to todo-list; so it is processed as a first element
        todo.add(namespace);
        // process todo-list
        while(!todo.isEmpty()) {
                Namespace current=(Namespace)todo.get(0);
                java.util.Iterator it = current.iteratorOwnedElement();
                while (it.hasNext()) {
                        ModelElement ele=(ModelElement)it.next();
                        if(condition.testModelElement(ele)) {
                                foundElements.add(ele);
                        }
                        if(ele instanceof Namespace) {
                                // ele is itself a container
                                // add it to todo-list
                                todo.add(ele);
                        }
                }
                if(current instanceof Classifier) {
                        it = ((Classifier)current).iteratorFeature();
                        while (it.hasNext()) {
                                Feature ele=(Feature)it.next();
                                if(condition.testModelElement(ele)) {
                                        foundElements.add(ele);
                                }
                        }
                }
                if(current instanceof Association) {
                        it = ((Association)current).iteratorConnection();
                        while (it.hasNext()) {
                                AssociationEnd ele=(AssociationEnd)it.next();
                                if(condition.testModelElement(ele)) {
                                        foundElements.add(ele);
                                }
                        }
                }
                // remove current from todo-list
                todo.remove(0);
        }
        return foundElements;
        // -end- 3E4104730235 body3CC7BC920362 "deepFindOwnedElements"
}

// declare/define something only in the code
// please fill in/modify the following section
// -beg- preserve=no 3CC7BC920362 detail_end "NamespaceUtility"

// -end- 3CC7BC920362 detail_end "NamespaceUtility"

}
