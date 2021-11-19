// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2003-12-23 10:36:16 $
// $Revision: 1.1.1.1 $
//

              // -beg- preserve=no 3CC66649011E package "ModelElementUtility"
package ch.ehi.interlis.tools;
              // -end- 3CC66649011E package "ModelElementUtility"

              // -beg- preserve=no 3CC66649011E autoimport "ModelElementUtility"
              import ch.ehi.uml1_4.foundation.core.ModelElement;
              import ch.ehi.uml1_4.foundation.core.Namespace;
              // -end- 3CC66649011E autoimport "ModelElementUtility"

              // import declarations
              // please fill in/modify the following section
              // -beg- preserve=yes 3CC66649011E import "ModelElementUtility"
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.uml1_4.implementation.UmlPackage;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;

import java.util.Iterator;

import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.modeltopicclass.IliImport;
              // -end- 3CC66649011E import "ModelElementUtility"

              /** @author Claude Eisenhut
               *  @version $Revision: 1.1.1.1 $ $Date: 2003-12-23 10:36:16 $
               */
public class ModelElementUtility
              {
                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=yes 3CC66649011E detail_begin "ModelElementUtility"
  static private java.util.ArrayList ordering=null;

                // -end- 3CC66649011E detail_begin "ModelElementUtility"

                /** returns the set of referencable Elements.
                 */
                // -beg- preserve=no 3CB2F1BB01F2 head3CC66649011E "getReferencableElements"
                public static java.util.Set getReferencableElements(ModelElement athis, java.lang.Class aclass)
                // -end- 3CB2F1BB01F2 head3CC66649011E "getReferencableElements"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3CB2F1BB01F2 throws3CC66649011E "getReferencableElements"

                  // -end- 3CB2F1BB01F2 throws3CC66649011E "getReferencableElements"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=yes 3CB2F1BB01F2 body3CC66649011E "getReferencableElements"
    // find ModelDef
    Namespace root=athis.getNamespace();
    while(!(root instanceof ModelDef) && root.containsNamespace()){
      root=root.getNamespace();
    }
    java.util.HashSet referencables = new java.util.HashSet();
    java.util.ArrayList todo=new java.util.ArrayList(); // collection of containers not yet visited
    // Is athis inside a ModelDef?
    if(root instanceof ModelDef){
      // collect referencables in ModelDef
      // add root to todo-list; so it is processed as a first element
      todo.add(root);
      // add imported models also to todo-list
      java.util.Iterator impRelIt=root.iteratorClientDependency();
      while(impRelIt.hasNext()){
        Object obj=impRelIt.next();
        if(obj instanceof IliImport){
          IliImport impRel=(IliImport)obj;
          java.util.Iterator supplierIt=impRel.iteratorSupplier();
          while(supplierIt.hasNext()){
            ModelDef supplier=(ModelDef)supplierIt.next();
            todo.add(supplier);
          }
        }
      }
      // add model 'INTERLIS' also to todo-list
      // find root Namespace
      Namespace umlmodel=athis.getNamespace();
      while(umlmodel.containsNamespace()){
        umlmodel=umlmodel.getNamespace();
      }

      if(ch.ehi.uml1_4.tools.NamespaceUtility.deepContainsOwnedElement(
        umlmodel,ModelDef.class,"INTERLIS")){
        ModelDef interlisModel=(ModelDef)ch.ehi.uml1_4.tools.NamespaceUtility.deepGetOwnedElement(
          umlmodel,ModelDef.class,"INTERLIS");
        todo.add(interlisModel);
      }
    }else{
      // athis is not inside a ModelDef
      // find root Namespace
      root=athis.getNamespace();
      while(root.containsNamespace()){
        root=root.getNamespace();
      }
      todo.add(root);
    }

    // process todo-list
    while(!todo.isEmpty()){
      Namespace current=(Namespace)todo.get(0);
      java.util.Iterator iterator = current.iteratorOwnedElement();
      while (iterator.hasNext()) {
	  Object obj = iterator.next();
          if(obj!=athis && aclass.isAssignableFrom(obj.getClass())){
	    referencables.add(obj);
	  }
          if(obj instanceof Namespace){
            // obj is itself a container
            // add it to todo-list
            todo.add(obj);
          }
      }
      // remove current from todo-list
      todo.remove(0);
    }

    return referencables;
                  // -end- 3CB2F1BB01F2 body3CC66649011E "getReferencableElements"
                  }

                // -beg- preserve=no 3D58C7000325 head3CC66649011E "ModelElementUtility"
                private ModelElementUtility()
                // -end- 3D58C7000325 head3CC66649011E "ModelElementUtility"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D58C7000325 throws3CC66649011E "ModelElementUtility"

                  // -end- 3D58C7000325 throws3CC66649011E "ModelElementUtility"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D58C7000325 body3CC66649011E "ModelElementUtility"
                  return;
                  // -end- 3D58C7000325 body3CC66649011E "ModelElementUtility"
                  }

                /** returns the set of Interlis peer elements.
                 */
                // -beg- preserve=no 3D58C7300021 head3CC66649011E "getPeerElements"
                public static java.util.Set getPeerElements(ModelElement athis, java.lang.Class aclass)
                // -end- 3D58C7300021 head3CC66649011E "getPeerElements"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D58C7300021 throws3CC66649011E "getPeerElements"

                  // -end- 3D58C7300021 throws3CC66649011E "getPeerElements"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=yes 3D58C7300021 body3CC66649011E "getPeerElements"
    // find container (UmlModel or ModelDef or TopicDef)
    Namespace root=athis.getNamespace();
    while(!(root instanceof UmlModel || root instanceof ModelDef || root instanceof TopicDef) && root.containsNamespace()){
      root=root.getNamespace();
    }
    java.util.Set peers=getChildElements(root,aclass);
    peers.remove(athis);
    return peers;
                  // -end- 3D58C7300021 body3CC66649011E "getPeerElements"
                  }

                /** returns the set of Interlis children.
                 */
                // -beg- preserve=no 3D59359D019F head3CC66649011E "getChildElements"
                public static java.util.Set getChildElements(Namespace container, java.lang.Class aclass)
                // -end- 3D59359D019F head3CC66649011E "getChildElements"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D59359D019F throws3CC66649011E "getChildElements"

                  // -end- 3D59359D019F throws3CC66649011E "getChildElements"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=yes 3D59359D019F body3CC66649011E "getChildElements"
    java.util.HashSet children = new java.util.HashSet();
    java.util.ArrayList todo=new java.util.ArrayList(); // collection of containers not yet visited
    // no container given?
    if(container==null) return children;

    // add container to todo-list; so it is processed as a first element
    todo.add(container);

    // process todo-list
    while(!todo.isEmpty()){
      Namespace current=(Namespace)todo.get(0);
      java.util.Iterator iterator = current.iteratorOwnedElement();
      while (iterator.hasNext()) {
	  Object obj = iterator.next();
          if(aclass==null || aclass.isAssignableFrom(obj.getClass())){
            if(obj instanceof UmlPackage){
              // UmlPackages are not Interlis elements; therefore skip them
            }else{
              children.add(obj);
            }
	  }
          if(obj instanceof UmlPackage){
            // obj is itself a container
            // add it to todo-list
            todo.add(obj);
          }
      }
      // remove current from todo-list
      todo.remove(0);
    }

    return children;
                  // -end- 3D59359D019F body3CC66649011E "getChildElements"
                  }

                // -beg- preserve=no 3D7F153B01F8 head3CC66649011E "getIliQualifiedName"
                public static String getIliQualifiedName(ModelElement source, ModelElement ref, String language)
                // -end- 3D7F153B01F8 head3CC66649011E "getIliQualifiedName"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3D7F153B01F8 throws3CC66649011E "getIliQualifiedName"

                  // -end- 3D7F153B01F8 throws3CC66649011E "getIliQualifiedName"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=yes 3D7F153B01F8 body3CC66649011E "getIliQualifiedName"
    StringBuffer ret=new StringBuffer();
    Namespace parent=null;
    Namespace sourceScope=null;

    // setup language
    if(language==null){
      language=ch.ehi.basics.types.NlsString.getDefaultLanguage();
    }
    // ModelDefs can not have a qualified name, because they are the
    // interlis-toplevel-elements
    if(ref instanceof ModelDef){
        // return unqualified name
        ret.append(ref.getName().getValue(language));
        return ret.toString();
    }
    
    // get Model or Topic of source
    if(source!=null && source.containsNamespace()){
      parent=source.getNamespace();
      while(parent.containsNamespace() && !(parent instanceof TopicDef) && !(parent instanceof ModelDef)){
        parent=parent.getNamespace();
      }
      sourceScope=parent;
    }

    // get Model or Topic of ref
    if(ref.containsNamespace()){
      parent=ref.getNamespace();
      while(parent.containsNamespace() && !(parent instanceof TopicDef) && !(parent instanceof ModelDef)){
        parent=parent.getNamespace();
      }
    }
    // ref not inside a topic or topic not inside a model?
    if(parent==null || (!(parent instanceof TopicDef) && !(parent instanceof ModelDef))){
      // error according to interlis rules
      if(parent!=null){
        parent=ref.getNamespace();
        while(parent.containsNamespace()){
          ret.insert(0,parent.getName().getValue(language)+".");
          parent=parent.getNamespace();
        }
      }
      ret.append(ref.getName().getValue(language));
      throw new IllegalStateException(ret.toString()+" not inside a ModelDef/TopicDef");
    }
    TopicDef topic=null;
    // ref ModelElement inside a topic?
    if(parent instanceof TopicDef){
      topic=(TopicDef)parent;
      // source and ref in same topic?
      if(topic==sourceScope){
        // return unqualified name
        ret.append(ref.getName().getValue(language));
        return ret.toString();
      }
      // ASSERT: source and ref not in same topic
      // return qualified name
      
      // find model of ref
      while(!(parent instanceof ModelDef)){
        parent=parent.getNamespace();
      }
    }else{
    	// ref at modellevel
        // source and ref in same model?
        if(parent==sourceScope){
          // return unqualified name
          ret.append(ref.getName().getValue(language));
          return ret.toString();
        }
    }


    // return qualified name
    ret.append(parent.getName().getValue(language));
    ret.append(".");
    // ref inside a topic?
    if(topic!=null){
      ret.append(topic.getName().getValue(language));
      ret.append(".");
    }
    ret.append(ref.getName().getValue(language));
    return ret.toString();
                  // -end- 3D7F153B01F8 body3CC66649011E "getIliQualifiedName"
                  }

                /** defines the standard ordering of INTERLIS definitions.
                 */
                // -beg- preserve=no 3E64146D02FB head3CC66649011E "compareDefinition"
                public static int compareDefinition(java.lang.Class c1, java.lang.Class c2)
                // -end- 3E64146D02FB head3CC66649011E "compareDefinition"
                  // declare any checked exceptions
                  // please fill in/modify the following section
                  // -beg- preserve=no 3E64146D02FB throws3CC66649011E "compareDefinition"

                  // -end- 3E64146D02FB throws3CC66649011E "compareDefinition"
                  {
                  // please fill in/modify the following section
                  // -beg- preserve=yes 3E64146D02FB body3CC66649011E "compareDefinition"
    /*
      1. MetaDataUseDef
      2. UnitDef
      3. FunctionDef
      4. LineFormTypeDef
      5. DomainDef
      6. RunTimeParameterDef
      7. ClassDef
      8. AssociationDef
      9. ViewDef
      10. GraphicDef
      11. UmlPackage
      12. TopicDef
      13. ModelDef
      14. INTERLIS2Def
    */
    if(ordering==null){
      ordering=new java.util.ArrayList();
      ordering.add(ch.ehi.interlis.metaobjects.MetaDataUseDef.class);
      ordering.add(ch.ehi.interlis.units.UnitDef.class);
      ordering.add(ch.ehi.interlis.functions.FunctionDef.class);
      ordering.add(ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef.class);
      ordering.add(ch.ehi.interlis.domainsandconstants.DomainDef.class);
      ordering.add(ch.ehi.interlis.graphicdescriptions.GraphicParameterDef.class);
      ordering.add(ch.ehi.interlis.modeltopicclass.ClassDef.class);
      ordering.add(ch.ehi.interlis.associations.AssociationDef.class);
      ordering.add(ch.ehi.interlis.views.ViewDef.class);
      ordering.add(ch.ehi.uml1_4.implementation.UmlPackage.class);
      ordering.add(ch.ehi.interlis.modeltopicclass.TopicDef.class);
      ordering.add(ch.ehi.interlis.modeltopicclass.ModelDef.class);
      ordering.add(ch.ehi.interlis.modeltopicclass.INTERLIS2Def.class);
    }
    int i1=ordering.indexOf(c1);
    int i2=ordering.indexOf(c2);
    if(i1<i2)return -1;
    if(i2<i1)return 1;
    return 0;
                  // -end- 3E64146D02FB body3CC66649011E "compareDefinition"
                  }

                public static ModelDef getModel(ModelElement source)
                  {
                        ModelElement parent = source;
                        if (source instanceof AttributeDef) {
                            parent = ((AttributeDef) source).getOwner();
                        }
                        while (!(parent instanceof ModelDef)) {
                            parent = parent.getNamespace();
                        }
                        return (ModelDef) parent;
                    }

                /** get other end of a bidrectional association
                   *
                   */
                  static public RoleDef getOppEnd(RoleDef athis)
                  {
                    AssociationDef assoc=(AssociationDef)athis.getAssociation();
                    java.util.Iterator rolei=assoc.iteratorConnection();
                    while(rolei.hasNext()){
                      RoleDef obj=(RoleDef)rolei.next();
                      if(obj!=athis){
                        return obj;
                      }
                    }
                    return null;
                  }

                // declare/define something only in the code
                // please fill in/modify the following section
                // -beg- preserve=no 3CC66649011E detail_end "ModelElementUtility"

                // -end- 3CC66649011E detail_end "ModelElementUtility"

              }

