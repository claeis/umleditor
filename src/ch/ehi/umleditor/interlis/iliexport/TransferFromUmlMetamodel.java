/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

// -beg- preserve=no 3CFE050F004D package "TransferFromUmlMetamodel"
package ch.ehi.umleditor.interlis.iliexport;
// -end- 3CFE050F004D package "TransferFromUmlMetamodel"

// -beg- preserve=no 3CFE050F004D autoimport "TransferFromUmlMetamodel"
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.metaobjects.MetaDataUseDef;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.functions.FunctionDef;
import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.graphicdescriptions.GraphicParameterDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.constraints.ConstraintDef;
import ch.ehi.interlis.views.ViewDef;
import ch.ehi.interlis.views.ViewProjectionDef;
import ch.ehi.interlis.graphicdescriptions.GraphicDef;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.interlis.IliSyntax;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.domainsandconstants.basetypes.NumericalType;
import ch.ehi.interlis.domainsandconstants.basetypes.IliDim;
import ch.ehi.interlis.domainsandconstants.basetypes.StructDec;
import ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange;
import ch.ehi.basics.types.NlsString;
// -end- 3CFE050F004D autoimport "TransferFromUmlMetamodel"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3CFE050F004D import "TransferFromUmlMetamodel"
import ch.ehi.interlis.modeltopicclass.ModelDefKind;
import ch.ehi.interlis.modeltopicclass.Translation;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.modeltopicclass.Contract;
import ch.ehi.interlis.metaobjects.ParameterDef;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.interlis.domainsandconstants.basetypes.Text;
import ch.ehi.interlis.domainsandconstants.basetypes.TextKind;
import ch.ehi.interlis.domainsandconstants.basetypes.BooleanType;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.RotationKind;
import ch.ehi.interlis.associations.AssociationAsIliAttrKind;
import ch.ehi.interlis.views.ViewableDef;
import ch.ehi.uml1_4.foundation.core.Artifact;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange;
import ch.ehi.uml1_4.foundation.datatypes.OrderingKind;
import ch.ehi.uml1_4.foundation.datatypes.AggregationKind;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import java.io.*;
import java.util.Iterator;
import ch.ehi.basics.tools.TopoSort;
// -end- 3CFE050F004D import "TransferFromUmlMetamodel"

public class TransferFromUmlMetamodel
{
  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CFE050F004D detail_begin "TransferFromUmlMetamodel"

  static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(TransferFromUmlMetamodel.class);

  /** current output stream
   *
   */
  transient private java.io.Writer out=null;

  /** current INTERLIS file language
   * e.g. de
   */
  transient private String language=null;

  /** true, if this export is only used for model checking.
   * The difference is mainly, what/where files are created.
   */
  transient private boolean onlyChecking=false;

  class ModelElementEntry {
    public ModelElementEntry(int line,AbstractEditorElement def)
    {
      this.line=line;
      this.def=def;
    }
    public int line;
    public AbstractEditorElement def;
  };
  class FileListEntry {
    public FileListEntry(File file)
    {
      this.file=file;
      modelElements=new java.util.ArrayList();
    }
    public void add(int linenumber,AbstractEditorElement def)
    {
      modelElements.add(new ModelElementEntry(linenumber,def));
    }
    public File file;
    // list<ModelElementEntry>
    public java.util.List modelElements;
  };
  /** list of files, that where generated.
   * This is only defined, if we are in checking mode.
   *  list<FileListEntry iliFile>
   */
  transient private java.util.List tempFiles=null;
  transient private FileListEntry currentFile=null;

  /** last written ModelElement.
   * Used to supress superfluous DOMAIN keywords.
   */
  transient private ModelElement lastModelElement=null;

  // -end- 3CFE050F004D detail_begin "TransferFromUmlMetamodel"

  // -beg- preserve=no 3CFE054D00ED head3CFE050F004D "visitNamespace"
  public void visitNamespace(Namespace ns)
  // -end- 3CFE054D00ED head3CFE050F004D "visitNamespace"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE054D00ED throws3CFE050F004D "visitNamespace"
    throws java.io.IOException

    // -end- 3CFE054D00ED throws3CFE050F004D "visitNamespace"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE054D00ED body3CFE050F004D "visitNamespace"
    if(onlyChecking){
      tempFiles=new java.util.ArrayList();
    }
    // clear error counter
    errc=0;
    // enumerate all INTERLIS2Def
    java.util.ArrayList todo=new java.util.ArrayList(); // collection of packages not yet visited
    // add root package to todo-list; so it is processed as a first element
    todo.add(ns);
    while(!todo.isEmpty()){
      Namespace current=(Namespace)todo.get(0);
      if(current instanceof INTERLIS2Def){
        visitINTERLIS2Def((INTERLIS2Def)current);
      }else{
        // add child packages to end of todo list; so we walk the tree by level
        java.util.Iterator childi=current.iteratorOwnedElement();
        while(childi.hasNext()){
          Object obj=childi.next();
          if(obj instanceof Package || obj instanceof Artifact){
            todo.add(obj);
          }
        }
      }
      // remove current from todo-list
      todo.remove(0);
    }
    if(onlyChecking){
      MyErrorListener el=new MyErrorListener();
      // build compiler config file
      ch.interlis.ili2c.config.Configuration config=new ch.interlis.ili2c.config.Configuration();
        // add metadata files
        for(java.util.Iterator i=ch.ehi.interlis.tools.ModelElementUtility.getChildElements(ns,ch.ehi.interlis.metaobjects.MetaObjectFile.class).iterator()
            ;i.hasNext();){
          ch.ehi.interlis.metaobjects.MetaObjectFile f=(ch.ehi.interlis.metaobjects.MetaObjectFile)i.next();
          // use absolute path to file
          String xmlFilename=f.getName().getValue("");
          File xmlFile=new File(xmlFilename);
          // if relative filename
          if(!(xmlFile).isAbsolute()){
            // add path to model file
            File parent=ch.ehi.umleditor.application.LauncherView.getInstance().getCurrentFile();
            if(parent!=null){
              xmlFile=new File(parent.getParent(),xmlFilename);
            }
          }
          config.addFileEntry(new ch.interlis.ili2c.config.FileEntry(
              xmlFile.getAbsolutePath(),ch.interlis.ili2c.config.FileEntryKind.METADATAFILE));
        }
        // add generated files
        for(java.util.Iterator i=tempFiles.iterator();i.hasNext();){
          File f=((FileListEntry)i.next()).file;
          config.addFileEntry(new ch.interlis.ili2c.config.FileEntry(
              f.getAbsolutePath(),ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));
        }
        // add MetaDataUseRef to BOID mappings
        ch.ehi.uml1_4.tools.ChildFinderByClass finder=new ch.ehi.uml1_4.tools.ChildFinderByClass(ch.ehi.interlis.metaobjects.MetaDataUseDef.class);
        finder.visit(ns);
        for(java.util.Iterator i=finder.getElements().iterator();i.hasNext();){
          ch.ehi.interlis.metaobjects.MetaDataUseDef mdUse=(ch.ehi.interlis.metaobjects.MetaDataUseDef)i.next();
          config.addBoidEntry(new ch.interlis.ili2c.config.BoidEntry(modelElementRef(null,mdUse,null),mdUse.getBasketOid()));
        }
      if(xsdFile!=null){
        config.setOutputKind(ch.interlis.ili2c.config.GenerateOutputKind.XMLSCHEMA );
        config.setOutputFile(xsdFile);
      }else{
        // we need no output (except error messages)
        config.setOutputKind(ch.interlis.ili2c.config.GenerateOutputKind.NOOUTPUT );
      }

                //try{
                //  ch.interlis.ili2c.config.PersistenceService.writeConfig("g:\\tmp\\metaobj\\ce.ilc",config);
                //}catch(FileNotFoundException ex){
                //  el.error(new ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent(ex,null,0,ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent.SEVERITY_ERROR));
                //}catch(IOException ex){
                //  el.error(new ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent(ex,null,0,ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent.SEVERITY_ERROR));
                //}

      // run compiler
      ch.interlis.ili2c.Main.runCompiler(config,el);
      // remove temporary files
      for(java.util.Iterator i=tempFiles.iterator();i.hasNext();){
        File f=((FileListEntry)i.next()).file;
        f.delete();
      }
    }
    if(!createFileList){
      ch.ehi.umleditor.application.LauncherView.getInstance().log(getFuncDesc(),rsrc.getString("CIdone"));
    }
    return;
    // -end- 3CFE054D00ED body3CFE050F004D "visitNamespace"
    }

  // -beg- preserve=no 3CFE058601FD head3CFE050F004D "setup"
  public void setup(java.io.Writer out, String language)
  // -end- 3CFE058601FD head3CFE050F004D "setup"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3CFE058601FD throws3CFE050F004D "setup"

    // -end- 3CFE058601FD throws3CFE050F004D "setup"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE058601FD body3CFE050F004D "setup"
    this.out=out;
    this.language=language;
    // -end- 3CFE058601FD body3CFE050F004D "setup"
    }

  // -beg- preserve=no 3CFE08ED005B head3CFE050F004D "visitINTERLIS2Def"
  public void visitINTERLIS2Def(INTERLIS2Def def)
  // -end- 3CFE08ED005B head3CFE050F004D "visitINTERLIS2Def"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE08ED005B throws3CFE050F004D "visitINTERLIS2Def"
        throws java.io.IOException

    // -end- 3CFE08ED005B throws3CFE050F004D "visitINTERLIS2Def"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE08ED005B body3CFE050F004D "visitINTERLIS2Def"
    if(def.getDefLangName().startsWith("<")){
      return;
    }
    java.util.HashSet done=new java.util.HashSet(); // collection of visited languages
    // enumerate all languages
    java.util.Map languages=def.getName().getAllValues();
    java.util.Iterator languagei=languages.keySet().iterator();
    while(languagei.hasNext()){
      String language=(String)languagei.next();
      if(done.contains(language)){
        continue;
      }
      File file=null;
      String filename=(String)languages.get(language);
      // if checkmode
      if(onlyChecking){
        // create temporary file
        file=File.createTempFile("umleditor",".ili");
        currentFile=new FileListEntry(file);
        tempFiles.add(currentFile);
      }else{
        file=new File(filename);
        // if relative filename
        if(!(file).isAbsolute()){
          // add path to model file
          File parent=ch.ehi.umleditor.application.LauncherView.getInstance().getCurrentFile();
          if(parent!=null){
            file=new File(parent.getParent(),filename);
          }
        }
        if(createFileList){
          fileList.add(file);
        }
        currentFile=null;
      }
      if(!createFileList){
        // open
        out = new BufferedWriter(new FileWriter(file));
        lineNumber=1;
        // write
        defineLinkToModelElement(def);
        out.write("INTERLIS 2.2;");newline();
        visitINTERLIS2Def(def,language);
      }
      done.add(language);
      java.util.Iterator otheri=languages.keySet().iterator();
      // while other langugae with same name
      while(otheri.hasNext()){
        String otherLanguage=(String)otheri.next();
        // language already done?
        if(done.contains(otherLanguage)){
          continue;
        }
        // another filename?
        if(!filename.equals(languages.get(otherLanguage))){
          continue;
        }
        // write otherLanguage to same file
        if(!createFileList){
          visitINTERLIS2Def(def,otherLanguage);
        }
        done.add(otherLanguage);
      }
      // close
      if(!createFileList){
        out.close();
        out=null;
      }
      if(!onlyChecking){
        if(!createFileList){
          ch.ehi.umleditor.application.LauncherView.getInstance().log(getFuncDesc()
            ,ch.ehi.basics.i18n.MessageFormat.format(rsrc,"CIilifilewritten",file.getAbsolutePath()));
        }
      }
    }

    return;
    // -end- 3CFE08ED005B body3CFE050F004D "visitINTERLIS2Def"
    }

  // -beg- preserve=no 3CFE13AC0346 head3CFE050F004D "visitINTERLIS2Def"
  public void visitINTERLIS2Def(INTERLIS2Def def, String language)
  // -end- 3CFE13AC0346 head3CFE050F004D "visitINTERLIS2Def"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE13AC0346 throws3CFE050F004D "visitINTERLIS2Def"
    throws java.io.IOException

    // -end- 3CFE13AC0346 throws3CFE050F004D "visitINTERLIS2Def"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE13AC0346 body3CFE050F004D "visitINTERLIS2Def"
    this.language=language;
    // enumerate all ModelDef
    java.util.ArrayList todo=new java.util.ArrayList(); // collection of packages not yet visited
    // add root package to todo-list; so it is processed as a first element
    todo.add(def);
    while(!todo.isEmpty()){
      Namespace current=(Namespace)todo.get(0);
      if(current instanceof ModelDef){
        newline();
        visitModelDef((ModelDef)current);
      }else{
        // add child packages to end of todo list; so we walk the tree by level
        java.util.Iterator childi=current.iteratorOwnedElement();
        while(childi.hasNext()){
          Object obj=childi.next();
          if(obj instanceof Package){
            todo.add(obj);
          }
        }
      }
      // remove current from todo-list
      todo.remove(0);
    }
    return;
    // -end- 3CFE13AC0346 body3CFE050F004D "visitINTERLIS2Def"
    }

  // -beg- preserve=no 3CFE196B00FC head3CFE050F004D "visitModelDef"
  public void visitModelDef(ModelDef def)
  // -end- 3CFE196B00FC head3CFE050F004D "visitModelDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE196B00FC throws3CFE050F004D "visitModelDef"
    throws java.io.IOException

    // -end- 3CFE196B00FC throws3CFE050F004D "visitModelDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3CFE196B00FC body3CFE050F004D "visitModelDef"
    // check if ModelDef defines current language
    if(!def.getName().getAllValues().containsKey(language)){
      // current language is not defined by this ModelDef
      return;
    }
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    switch(def.getKind()){
      case ModelDefKind.REFSYSTEM:
        out.write("REFSYSTEM ");
        break;
      case ModelDefKind.SYMBOLOGY:
        out.write("SYMBOLOGY ");
        break;
      case ModelDefKind.TYPE:
        out.write("TYPE ");
        break;
      default:
    }
    out.write("MODEL "+def.getName().getValue(language)+" ("+language+")");
    // if this is a modeldef in a translated language?
    if(def.getBaseLanguage()!=null && !def.getBaseLanguage().equals(language)){
      Iterator translationi=def.iteratorTranslation();
      while(translationi.hasNext()){
        Translation translation=(Translation)translationi.next();
        if(translation.getLanguage().equals(language)){
          newline();
          out.write("TRANSLATION OF "+def.getName().getValue(translation.getBaseLanguage()));
        }
      }
    }
    out.write(" =");newline();
    inc_ind();

    // CONTRACTs
    Iterator contracti=def.iteratorContract();
    while(contracti.hasNext()){
      Contract contract=(Contract)contracti.next();
      out.write(getIndent());
      out.write("CONTRACT ISSUED BY ");
      out.write(contract.getIssuer().getValue(language));
      visitExplanation(contract.getDocumentation());
      out.write(";");newline();
    }

    // IMPORTs
    int impc=0;
    String sep=getIndent()+"IMPORTS ";
    Iterator importsi=def.iteratorClientDependency();
    while(importsi.hasNext()){
      Object obj=importsi.next();
      if(obj instanceof ch.ehi.interlis.modeltopicclass.IliImport){
        ch.ehi.interlis.modeltopicclass.IliImport iliimport=(ch.ehi.interlis.modeltopicclass.IliImport)obj;
        Iterator supplieri=iliimport.iteratorSupplier();
        if(supplieri.hasNext()){
          ModelDef supplier=(ModelDef)supplieri.next();
          out.write(sep+modelElementRef(def,supplier,iliimport.getLanguage()));
          sep=",";
          impc++;
        }
      }
    }
    if(impc>0){
      out.write(";");newline();
    }

    lastModelElement=def;

    // sort children
    java.util.List children=sortIliDefs(ch.ehi.interlis.tools.ModelElementUtility.getChildElements(def,null));

    // visit children
    java.util.Iterator childi=children.iterator();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(domainStructs.size()>0 && !(obj instanceof DomainDef)){
        flushDomainStructs();
       }
       if(obj instanceof MetaDataUseDef){
        visitMetaDataUseDef((MetaDataUseDef)obj);
       }else if(obj instanceof UnitDef){
        visitUnitDef((UnitDef)obj);
       }else if(obj instanceof FunctionDef){
        visitFunctionDef((FunctionDef)obj);
       }else if(obj instanceof LineFormTypeDef){
        visitLineFormTypeDef((LineFormTypeDef)obj);
       }else if(obj instanceof DomainDef){
        visitDomainDef((DomainDef)obj);
       }else if(obj instanceof GraphicParameterDef){
        visitGraphicParameterDef((GraphicParameterDef)obj);
       }else if(obj instanceof ClassDef){
        visitClassDef((ClassDef)obj);
       }else if(obj instanceof AssociationDef){
        AssociationDef assoc=(AssociationDef)obj;
        if(!assoc.isStructureAttribute() && !assoc.isReferenceAttribute()){
          logErrorMsg(assoc,rsrc.getString("CEassocOutsideTopic"));
        }
       }else if(obj instanceof TopicDef){
        visitTopicDef((TopicDef)obj);
       }else{
        // ignore others; should not have others
       }
       lastModelElement=(ModelElement)obj;
    }
       if(domainStructs.size()>0){
        flushDomainStructs();
       }
    lastModelElement=def;
    dec_ind();

    newline();
    out.write("END "+def.getName().getValue(language)+".");newline();
    return;
    // -end- 3CFE196B00FC body3CFE050F004D "visitModelDef"
    }

  // -beg- preserve=no 3D0615C20286 head3CFE050F004D "visitTopicDef"
  public void visitTopicDef(TopicDef def)
  // -end- 3D0615C20286 head3CFE050F004D "visitTopicDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615C20286 throws3CFE050F004D "visitTopicDef"
    throws java.io.IOException

    // -end- 3D0615C20286 throws3CFE050F004D "visitTopicDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615C20286 body3CFE050F004D "visitTopicDef"

    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    out.write(getIndent());
    if(def.getKind()==ch.ehi.interlis.modeltopicclass.TopicDefKind.VIEW){
      out.write("VIEW ");
    }
    out.write("TOPIC "+def.getName().getValue(language));

    int propc=0;
    if(def.isAbstract()){
      out.write((propc==0?"(":",")+"ABSTRACT");
      propc++;
    }
    if(def.isPropFinal()){
      out.write((propc==0?"(":",")+"FINAL");
      propc++;
    }
    if(propc>0){
      out.write(")");
    }

    Iterator extendsi=def.iteratorGeneralization();
    while(extendsi.hasNext()){
      Object obj=extendsi.next();
      if(obj instanceof ch.ehi.interlis.modeltopicclass.TopicExtends){
        ch.ehi.interlis.modeltopicclass.TopicExtends extend=(ch.ehi.interlis.modeltopicclass.TopicExtends)obj;
        if(extend.containsParent()){
          TopicDef supplier=(TopicDef)extend.getParent();
          newline();
          out.write(getIndent()+"EXTENDS "+topicRef(def,supplier));
          break;
        }
      }
    }

    out.write(" =");newline();

    inc_ind();

    if(def.containsOiddomain()){
      out.write(getIndent()+"OID AS "+domainRef(def,def.getOiddomain()));newline();
    }

    int depc=0;
    String sep=getIndent()+"DEPENDS ON ";
    Iterator dependsi=def.iteratorClientDependency();
    while(dependsi.hasNext()){
      Object obj=dependsi.next();
      if(obj instanceof ch.ehi.interlis.modeltopicclass.TopicDepends){
        ch.ehi.interlis.modeltopicclass.TopicDepends depends=(ch.ehi.interlis.modeltopicclass.TopicDepends)obj;
        Iterator supplieri=depends.iteratorSupplier();
        if(supplieri.hasNext()){
          TopicDef supplier=(TopicDef)supplieri.next();
          out.write(sep+topicRef(def,supplier));
          sep=",";
          depc++;
        }
      }
    }
    if(depc>0){
      out.write(";");newline();
    }

    // enumerate elements
    // sort children
    java.util.List children=sortIliDefs(ch.ehi.interlis.tools.ModelElementUtility.getChildElements(def,null));

    lastModelElement=def;

    // visit children
    java.util.Iterator childi=children.iterator();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(domainStructs.size()>0 && !(obj instanceof DomainDef)){
        flushDomainStructs();
       }
       if(obj instanceof MetaDataUseDef){
        visitMetaDataUseDef((MetaDataUseDef)obj);
       }else if(obj instanceof UnitDef){
        visitUnitDef((UnitDef)obj);
       }else if(obj instanceof DomainDef){
        visitDomainDef((DomainDef)obj);
       }else if(obj instanceof ClassDef && !(obj instanceof AssociationDef)){
        visitClassDef((ClassDef)obj);
       }else if(obj instanceof AssociationDef){
        visitAssociationDef((AssociationDef)obj);
       }else if(obj instanceof ViewDef){
        visitViewDef((ViewDef)obj);
       }else if(obj instanceof ViewProjectionDef){
        visitViewProjectionDef((ViewProjectionDef)obj);
       }else if(obj instanceof GraphicDef){
        visitGraphicDef((GraphicDef)obj);
       }else{
        // ignore others; should not have others
       }
       lastModelElement=(ModelElement)obj;
    }
       if(domainStructs.size()>0){
        flushDomainStructs();
       }

    dec_ind();

    newline();
    out.write(getIndent());
    out.write("END "+def.getName().getValue(language)+";");newline();
    return;
    // -end- 3D0615C20286 body3CFE050F004D "visitTopicDef"
    }

  // -beg- preserve=no 3D0615DA01B8 head3CFE050F004D "visitMetaDataUseDef"
  public void visitMetaDataUseDef(MetaDataUseDef def)
  // -end- 3D0615DA01B8 head3CFE050F004D "visitMetaDataUseDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615DA01B8 throws3CFE050F004D "visitMetaDataUseDef"
        throws java.io.IOException

    // -end- 3D0615DA01B8 throws3CFE050F004D "visitMetaDataUseDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615DA01B8 body3CFE050F004D "visitMetaDataUseDef"
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    // -end- 3D0615DA01B8 body3CFE050F004D "visitMetaDataUseDef"
    }

  // -beg- preserve=no 3D0615E801B9 head3CFE050F004D "visitUnitDef"
  public void visitUnitDef(UnitDef def)
  // -end- 3D0615E801B9 head3CFE050F004D "visitUnitDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615E801B9 throws3CFE050F004D "visitUnitDef"
        throws java.io.IOException

    // -end- 3D0615E801B9 throws3CFE050F004D "visitUnitDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615E801B9 body3CFE050F004D "visitUnitDef"
    newline();
    if(!(lastModelElement instanceof UnitDef)){
      out.write(getIndent()+"UNIT");
      newline();
      newline();
      inc_ind();
    }else{
      inc_ind();
    }
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    dec_ind();
    return;
    // -end- 3D0615E801B9 body3CFE050F004D "visitUnitDef"
    }

  // -beg- preserve=no 3D0615F20086 head3CFE050F004D "visitFunctionDef"
  public void visitFunctionDef(FunctionDef def)
  // -end- 3D0615F20086 head3CFE050F004D "visitFunctionDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615F20086 throws3CFE050F004D "visitFunctionDef"
        throws java.io.IOException

    // -end- 3D0615F20086 throws3CFE050F004D "visitFunctionDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615F20086 body3CFE050F004D "visitFunctionDef"
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    // -end- 3D0615F20086 body3CFE050F004D "visitFunctionDef"
    }

  // -beg- preserve=no 3D0615FC00D1 head3CFE050F004D "visitLineFormTypeDef"
  public void visitLineFormTypeDef(LineFormTypeDef def)
  // -end- 3D0615FC00D1 head3CFE050F004D "visitLineFormTypeDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615FC00D1 throws3CFE050F004D "visitLineFormTypeDef"
        throws java.io.IOException

    // -end- 3D0615FC00D1 throws3CFE050F004D "visitLineFormTypeDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0615FC00D1 body3CFE050F004D "visitLineFormTypeDef"
    newline();
    if(!(lastModelElement instanceof LineFormTypeDef)){
      out.write(getIndent()+"LINE FORM");
      newline();
      newline();
      inc_ind();
    }else{
      inc_ind();
    }
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
      out.write(getIndent());
      out.write(def.getName().getValue(language));
      out.write(" : ");
      out.write(classRef(def,def.getStructure()));
      out.write(";");newline();
    dec_ind();
    return;
    // -end- 3D0615FC00D1 body3CFE050F004D "visitLineFormTypeDef"
    }

  // -beg- preserve=no 3D06160B0281 head3CFE050F004D "visitDomainDef"
  public void visitDomainDef(DomainDef def)
  // -end- 3D06160B0281 head3CFE050F004D "visitDomainDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D06160B0281 throws3CFE050F004D "visitDomainDef"
        throws java.io.IOException

    // -end- 3D06160B0281 throws3CFE050F004D "visitDomainDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D06160B0281 body3CFE050F004D "visitDomainDef"
    newline();
    if(!(lastModelElement instanceof DomainDef)){
      out.write(getIndent()+"DOMAIN");
      newline();
      newline();
      inc_ind();
    }else{
      inc_ind();
    }
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    String name=def.getName().getValue(language);
    out.write(getIndent()+name);

    int propc=0;
    if(def.isAbstract()){
      out.write((propc==0?"(":",")+"ABSTRACT");
      propc++;
    }
    if(def.isPropFinal()){
      out.write((propc==0?"(":",")+"FINAL");
      propc++;
    }
    if(propc>0){
      out.write(")");
    }

    Iterator extendsi=def.iteratorGeneralization();
    while(extendsi.hasNext()){
      Object obj=extendsi.next();
      if(obj instanceof ch.ehi.interlis.domainsandconstants.DomainExtends){
        ch.ehi.interlis.domainsandconstants.DomainExtends extend=(ch.ehi.interlis.domainsandconstants.DomainExtends)obj;
        if(extend.containsParent()){
          DomainDef supplier=(DomainDef)extend.getParent();
          newline();
          out.write(getIndent()+"EXTENDS "+domainRef(def,supplier));
          break;
        }
      }
    }
    out.write("= ");
    if(def.isMandatory()){
      out.write("MANDATORY ");
    }
    if(def.containsType()){
      visitType(def,def.getType());
    }
    out.write(";");newline();
    // if one of this DomainDef's use has multiplicity > 1, issue also a
    // STRUCTURE with a similar name
    boolean createStruct=false;
    java.util.Set superfluousDAs=new java.util.HashSet();
    Iterator usei=def.iteratorDomainAttribute();
    while(usei.hasNext()){
      ch.ehi.interlis.attributes.DomainAttribute da=(ch.ehi.interlis.attributes.DomainAttribute)usei.next();
      if(!da.containsAttributeDef()){
          // fixup corrupt metamodel
          superfluousDAs.add(da);
      }else{
        AttributeDef use=da.getAttributeDef();
        ch.ehi.uml1_4.foundation.datatypes.Multiplicity m=use.getMultiplicity();
        Iterator mri=m.iteratorRange();
        while(mri.hasNext()){
          ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange mr=(ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange)mri.next();
          if(mr.getUpper()>1){
            createStruct=true;
          }
        }
      }
    }
    if(createStruct){
      domainStructs.add(def);
    }
    if(superfluousDAs.size()>0){
          Iterator dai=superfluousDAs.iterator();
          while(dai.hasNext()){
            logErrorMsg("metamodel fixed. DomainRef ("+name+") without an AttributeDef removed.");
            ch.ehi.interlis.tools.UnlinkAllChildren remover=new ch.ehi.interlis.tools.UnlinkAllChildren();
            remover.visit(dai.next());
            remover.unlinkThem();
          }
    }
    dec_ind();
    return;
    // -end- 3D06160B0281 body3CFE050F004D "visitDomainDef"
    }

  // -beg- preserve=no 3D06161602EB head3CFE050F004D "visitGraphicParameterDef"
  public void visitGraphicParameterDef(GraphicParameterDef def)
  // -end- 3D06161602EB head3CFE050F004D "visitGraphicParameterDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D06161602EB throws3CFE050F004D "visitGraphicParameterDef"
        throws java.io.IOException

    // -end- 3D06161602EB throws3CFE050F004D "visitGraphicParameterDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D06161602EB body3CFE050F004D "visitGraphicParameterDef"
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    // -end- 3D06161602EB body3CFE050F004D "visitGraphicParameterDef"
    }

  // -beg- preserve=no 3D0616270029 head3CFE050F004D "visitClassDef"
  public void visitClassDef(ClassDef def)
  // -end- 3D0616270029 head3CFE050F004D "visitClassDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0616270029 throws3CFE050F004D "visitClassDef"
        throws java.io.IOException

    // -end- 3D0616270029 throws3CFE050F004D "visitClassDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0616270029 body3CFE050F004D "visitClassDef"

    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    out.write(getIndent());
    if(def.getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE){
      out.write("STRUCTURE ");
    }else{
      out.write("CLASS ");
    }
    out.write(def.getName().getValue(language));

    int propc=0;
    if(def.isAbstract()){
      out.write((propc==0?"(":",")+"ABSTRACT");
      propc++;
    }
    if(def.isPropFinal()){
      out.write((propc==0?"(":",")+"FINAL");
      propc++;
    }
    Iterator extendsi=def.iteratorGeneralization();
    while(extendsi.hasNext()){
      Object obj=extendsi.next();
      if(obj instanceof ch.ehi.interlis.modeltopicclass.ClassExtends){
        ch.ehi.interlis.modeltopicclass.ClassExtends extend=(ch.ehi.interlis.modeltopicclass.ClassExtends)obj;
        if(extend.containsParent() && extend.isExtended()){
          out.write((propc==0?"(":",")+"EXTENDED");
          propc++;
        }
      }
    }
    if(propc>0){
      out.write(")");
    }

    extendsi=def.iteratorGeneralization();
    while(extendsi.hasNext()){
      Object obj=extendsi.next();
      if(obj instanceof ch.ehi.interlis.modeltopicclass.ClassExtends){
        ch.ehi.interlis.modeltopicclass.ClassExtends extend=(ch.ehi.interlis.modeltopicclass.ClassExtends)obj;
        if(extend.containsParent() && !extend.isExtended()){
          ClassDef supplier=(ClassDef)extend.getParent();
          newline();
          out.write(getIndent()+"EXTENDS "+classRef(def,supplier));
          break;
        }
      }
    }

    out.write(" =");newline();
    inc_ind();

    // {AttributeDef}
    java.util.Iterator childi=def.iteratorFeature();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(obj instanceof AttributeDef){
        visitAttributeDef((AttributeDef)obj);
       }else{
        // ignore others; should not have others
       }
    }
    // generate INTERLIS structure and reference attributes
    childi=def.iteratorAssociation();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(obj instanceof RoleDef){
        visitAttributeDef((RoleDef)obj);
       }else{
        // ignore others; should not have others
       }
    }

    // {ConstraintDef}
    childi=def.iteratorConstraint();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(obj instanceof ConstraintDef){
        visitConstraintDef((ConstraintDef)obj);
       }else{
        // ignore others; should not have others
       }
    }

    // ['PARAMETER' {ParameterDef}]
    if(def.sizeParameterDef()>0){
      out.write(getIndent());
      out.write("PARAMETER");newline();
      inc_ind();
      childi=def.iteratorParameterDef();
      while(childi.hasNext()){
         Object obj=childi.next();
         if(obj instanceof ParameterDef){
          visitIliSyntax((ParameterDef)obj);
         }else{
          // ignore others; should not have others
         }
      }
      dec_ind();
    }

    dec_ind();
    out.write(getIndent());
    out.write("END "+def.getName().getValue(language)+";");newline();

    return;
    // -end- 3D0616270029 body3CFE050F004D "visitClassDef"
    }

  // -beg- preserve=no 3D0619D10294 head3CFE050F004D "visitAssociationDef"
  public void visitAssociationDef(AssociationDef def)
  // -end- 3D0619D10294 head3CFE050F004D "visitAssociationDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0619D10294 throws3CFE050F004D "visitAssociationDef"
        throws java.io.IOException

    // -end- 3D0619D10294 throws3CFE050F004D "visitAssociationDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0619D10294 body3CFE050F004D "visitAssociationDef"
    if(def.isStructureAttribute() || def.isReferenceAttribute()){
      return;
    }
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    out.write(getIndent());
    out.write("ASSOCIATION ");
    out.write(def.getName().getValue(language));

    int propc=0;
    if(def.isAbstract()){
      out.write((propc==0?"(":",")+"ABSTRACT");
      propc++;
    }
    if(def.isPropFinal()){
      out.write((propc==0?"(":",")+"FINAL");
      propc++;
    }
    Iterator extendsi=def.iteratorGeneralization();
    while(extendsi.hasNext()){
      Object obj=extendsi.next();
      if(obj instanceof ch.ehi.interlis.modeltopicclass.ClassExtends){
        ch.ehi.interlis.modeltopicclass.ClassExtends extend=(ch.ehi.interlis.modeltopicclass.ClassExtends)obj;
        if(extend.containsParent() && extend.isExtended()){
          out.write((propc==0?"(":",")+"EXTENDED");
          propc++;
        }
      }
    }
    if(propc>0){
      out.write(")");
    }

    extendsi=def.iteratorGeneralization();
    while(extendsi.hasNext()){
      Object obj=extendsi.next();
      if(obj instanceof ch.ehi.interlis.modeltopicclass.ClassExtends){
        ch.ehi.interlis.modeltopicclass.ClassExtends extend=(ch.ehi.interlis.modeltopicclass.ClassExtends)obj;
        if(extend.containsParent() && !extend.isExtended()){
          AbstractClassDef supplier=(AbstractClassDef)extend.getParent();
          newline();
          out.write(getIndent()+"EXTENDS "+modelElementRef(def,supplier,null));
          break;
        }
      }
    }

    // DERIVED FROM
    Iterator derivedi=def.iteratorClientDependency();
    while(derivedi.hasNext()){
      Object obj=derivedi.next();
      if(obj instanceof ch.ehi.interlis.associations.AssociationDefDerived){
        ch.ehi.interlis.associations.AssociationDefDerived derived=(ch.ehi.interlis.associations.AssociationDefDerived)obj;
        if(derived.sizeSupplier()>0){
          ViewableDef supplier=(ViewableDef)derived.iteratorSupplier().next();
          newline();
          out.write(getIndent()+"DERIVED FROM "+modelElementRef(def,supplier,null));
          break;
        }
      }
    }


    out.write(" =");newline();
    inc_ind();

    // {RoleDef}
    java.util.Iterator childi=def.iteratorConnection();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(obj instanceof RoleDef){
        visitRoleDef((RoleDef)obj);
       }else{
        // ignore others; should not have others
       }
    }

    // {AttributeDef}
    childi=def.iteratorFeature();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(obj instanceof AttributeDef){
        visitAttributeDef((AttributeDef)obj);
       }else{
        // ignore others; should not have others
       }
    }
    // generate INTERLIS structure and reference attributes
    childi=def.iteratorAssociation();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(obj instanceof RoleDef){
        visitAttributeDef((RoleDef)obj);
       }else{
        // ignore others; should not have others
       }
    }

    // {ConstraintDef}
    childi=def.iteratorConstraint();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(obj instanceof ConstraintDef){
        visitConstraintDef((ConstraintDef)obj);
       }else{
        // ignore others; should not have others
       }
    }

    dec_ind();
    out.write(getIndent());
    out.write("END "+def.getName().getValue(language)+";");newline();

    return;
    // -end- 3D0619D10294 body3CFE050F004D "visitAssociationDef"
    }

  // -beg- preserve=no 3D061A010289 head3CFE050F004D "visitConstraintDef"
  public void visitConstraintDef(ConstraintDef def)
  // -end- 3D061A010289 head3CFE050F004D "visitConstraintDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D061A010289 throws3CFE050F004D "visitConstraintDef"
        throws java.io.IOException

    // -end- 3D061A010289 throws3CFE050F004D "visitConstraintDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D061A010289 body3CFE050F004D "visitConstraintDef"
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax((ch.ehi.interlis.constraints.ConstraintExpression)def.getBody());
    return;
    // -end- 3D061A010289 body3CFE050F004D "visitConstraintDef"
    }

  // -beg- preserve=no 3D061A11023C head3CFE050F004D "visitViewDef"
  public void visitViewDef(ViewDef def)
  // -end- 3D061A11023C head3CFE050F004D "visitViewDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D061A11023C throws3CFE050F004D "visitViewDef"
        throws java.io.IOException

    // -end- 3D061A11023C throws3CFE050F004D "visitViewDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D061A11023C body3CFE050F004D "visitViewDef"
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    // -end- 3D061A11023C body3CFE050F004D "visitViewDef"
    }

  // -beg- preserve=no 3D061A1B0060 head3CFE050F004D "visitViewProjectionDef"
  public void visitViewProjectionDef(ViewProjectionDef def)
  // -end- 3D061A1B0060 head3CFE050F004D "visitViewProjectionDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D061A1B0060 throws3CFE050F004D "visitViewProjectionDef"
        throws java.io.IOException

    // -end- 3D061A1B0060 throws3CFE050F004D "visitViewProjectionDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D061A1B0060 body3CFE050F004D "visitViewProjectionDef"
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    // -end- 3D061A1B0060 body3CFE050F004D "visitViewProjectionDef"
    }

  // -beg- preserve=no 3D061A2C03D6 head3CFE050F004D "visitGraphicDef"
  public void visitGraphicDef(GraphicDef def)
  // -end- 3D061A2C03D6 head3CFE050F004D "visitGraphicDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D061A2C03D6 throws3CFE050F004D "visitGraphicDef"
        throws java.io.IOException

    // -end- 3D061A2C03D6 throws3CFE050F004D "visitGraphicDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D061A2C03D6 body3CFE050F004D "visitGraphicDef"
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    // -end- 3D061A2C03D6 body3CFE050F004D "visitGraphicDef"
    }

  // -beg- preserve=no 3D0622300213 head3CFE050F004D "topicRef"
  public String topicRef(ModelElement source, TopicDef ref)
  // -end- 3D0622300213 head3CFE050F004D "topicRef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D0622300213 throws3CFE050F004D "topicRef"

    // -end- 3D0622300213 throws3CFE050F004D "topicRef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D0622300213 body3CFE050F004D "topicRef"
    StringBuffer ret=new StringBuffer();
    Namespace parent=ref.getNamespace();
    while(!(parent instanceof ModelDef)){
      parent=parent.getNamespace();
    }
    ret.append(parent.getName().getValue(language));
    ret.append(".");
    ret.append(ref.getName().getValue(language));
    return ret.toString();
    // -end- 3D0622300213 body3CFE050F004D "topicRef"
    }

  // -beg- preserve=no 3D5CD3D4035C head3CFE050F004D "visitIliSyntax"
  public void visitIliSyntax(IliSyntax element)
  // -end- 3D5CD3D4035C head3CFE050F004D "visitIliSyntax"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5CD3D4035C throws3CFE050F004D "visitIliSyntax"
        throws java.io.IOException

    // -end- 3D5CD3D4035C throws3CFE050F004D "visitIliSyntax"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5CD3D4035C body3CFE050F004D "visitIliSyntax"
    NlsString defNls=element.getSyntax();
    String def = defNls!=null ? defNls.getValue(language) : "";
    // for each line
    int last=0;
    int next=def.indexOf("\n",last);
    while(next>-1){
      String line=def.substring(last,next);
      out.write(getIndent()+line);newline();
      last=next+1;
      next=def.indexOf("\n",last);
    }
      String line=def.substring(last);
      out.write(getIndent()+line);newline();
    // -end- 3D5CD3D4035C body3CFE050F004D "visitIliSyntax"
    }

  // -beg- preserve=no 3D5D3A3D033B head3CFE050F004D "classRef"
  public String classRef(ModelElement source, AbstractClassDef ref)
  // -end- 3D5D3A3D033B head3CFE050F004D "classRef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D5D3A3D033B throws3CFE050F004D "classRef"

    // -end- 3D5D3A3D033B throws3CFE050F004D "classRef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5D3A3D033B body3CFE050F004D "classRef"
    return modelElementRef(source,ref,null);
    // -end- 3D5D3A3D033B body3CFE050F004D "classRef"
    }

  // -beg- preserve=no 3D5D3E3D017B head3CFE050F004D "visitAttributeDef"
  public void visitAttributeDef(AttributeDef def)
  // -end- 3D5D3E3D017B head3CFE050F004D "visitAttributeDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5D3E3D017B throws3CFE050F004D "visitAttributeDef"
      throws java.io.IOException

    // -end- 3D5D3E3D017B throws3CFE050F004D "visitAttributeDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5D3E3D017B body3CFE050F004D "visitAttributeDef"
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    out.write(getIndent());
    out.write(def.getName().getValue(language)+" ");

    int propc=0;
    if(def.isAbstract()){
      out.write((propc==0?"(":",")+"ABSTRACT");
      propc++;
    }
    if(def.isPropFinal()){
      out.write((propc==0?"(":",")+"FINAL");
      propc++;
    }
    if(def.isPropExtended()){
      out.write((propc==0?"(":",")+"EXTENDED");
      propc++;
    }
    if(propc>0){
      out.write(") ");
    }

    out.write(": ");

    boolean useStruct=false;
    boolean isMandatory=false;
      ch.ehi.uml1_4.foundation.datatypes.Multiplicity m=def.getMultiplicity();
      ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange mr=null;
      if(m!=null){
        mr=(ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange)m.iteratorRange().next();
        if(mr.getUpper()>1){
          useStruct=true;
        }
        if(mr.getLower()==1){
          isMandatory=true;
        }
      }

    if(def.containsAttrType()){
      DomainAttribute attrType=(DomainAttribute)def.getAttrType();
      if(attrType.containsDomainDef()){
          if(useStruct){
            out.write("BAG "+visitCardinality(mr)+" OF ");
          }else if(isMandatory){
            out.write("MANDATORY ");
          }
          out.write(domainRef(def.getOwner(),attrType.getDomainDef()));
          if(useStruct){
            // reference to STRUCTURE and not DomainDef
            out.write("_");
          }
      }else if(attrType.containsDirect()){
        if(isMandatory){
          out.write("MANDATORY ");
        }
        visitType(def.getOwner(),attrType.getDirect());
      }
    }else{
        if(isMandatory){
          out.write("MANDATORY ");
        }
    }

    // [':=' Factor { ',' Factor } ]
    if(def.containsAttributeValueUsage()) {
      visitIliSyntaxLine(def.getAttributeValueUsage());
    }
    out.write(";");newline();

    return;
    // -end- 3D5D3E3D017B body3CFE050F004D "visitAttributeDef"
    }

  // -beg- preserve=no 3D5D427D014D head3CFE050F004D "domainRef"
  public String domainRef(ModelElement source, DomainDef ref)
  // -end- 3D5D427D014D head3CFE050F004D "domainRef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D5D427D014D throws3CFE050F004D "domainRef"

    // -end- 3D5D427D014D throws3CFE050F004D "domainRef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5D427D014D body3CFE050F004D "domainRef"
    return modelElementRef(source,ref,null);
    // -end- 3D5D427D014D body3CFE050F004D "domainRef"
    }

  // -beg- preserve=no 3D5D429A0380 head3CFE050F004D "visitAttributeDef"
  public void visitAttributeDef(RoleDef def)
  // -end- 3D5D429A0380 head3CFE050F004D "visitAttributeDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5D429A0380 throws3CFE050F004D "visitAttributeDef"
      throws java.io.IOException

    // -end- 3D5D429A0380 throws3CFE050F004D "visitAttributeDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5D429A0380 body3CFE050F004D "visitAttributeDef"
    if(def.getIliAttributeKind()==AssociationAsIliAttrKind.STRUCTURE){
      // TODO check that exactly two roles
      // if(assoc.sizeConnection()!=2){ log error}
      RoleDef oppend=getOppEnd(def);

      defineLinkToModelElement(oppend);
      visitDocumentation(oppend.getDocumentation());
      out.write(getIndent());
      out.write(oppend.getName().getValue(language)+" ");

      int propc=0;
      if(oppend.isAbstract()){
        out.write((propc==0?"(":",")+"ABSTRACT");
        propc++;
      }
      if(oppend.isPropFinal()){
        out.write((propc==0?"(":",")+"FINAL");
        propc++;
      }
      if(oppend.isPropExtended()){
        out.write((propc==0?"(":",")+"EXTENDED");
        propc++;
      }
      if(propc>0){
        out.write(") ");
      }

      out.write(": ");

      if(oppend.getMultiplicity()!=null){
        MultiplicityRange card=(MultiplicityRange)(oppend.getMultiplicity().iteratorRange().next());
        if(card.getUpper()==1){
          if(card.getLower()==1){
            out.write("MANDATORY ");
          }
        }else if(card.getUpper()>1){
          if(oppend.getOrdering()==OrderingKind.ORDERED){
            out.write("LIST ");
          }else{
            out.write("BAG ");
          }
          out.write(visitCardinality(card));
          out.write(" OF ");
        }
      }else{
          if(oppend.getOrdering()==OrderingKind.ORDERED){
            out.write("LIST OF ");
          }else{
            out.write("BAG OF ");
          }
      }

      String external="";
      if(oppend.isPropExternal()){
        external="(EXTERNAL) ";
      }
      out.write(external+classRef(def.getParticipant(),(ClassDef)oppend.getParticipant()));
      if(oppend.sizeRestriction()>0){
        Iterator restri=oppend.iteratorRestriction();
        out.write("RESTRICTED TO ");
        String sep="";
        while(restri.hasNext()){
          ClassDef restr=(ClassDef)restri.next();
          out.write(sep+classRef(def,restr));
          sep=", ";
        }
      }

      // TODO [':=' Factor { ',' Factor } ]

      out.write(";");newline();
    }else if(def.getIliAttributeKind()==AssociationAsIliAttrKind.REFERENCE){
      // TODO check that exactly two roles
      // if(assoc.sizeConnection()!=2){ log error}
      RoleDef oppend=getOppEnd(def);

      defineLinkToModelElement(oppend);
      visitDocumentation(oppend.getDocumentation());
      out.write(getIndent());
      out.write(oppend.getName().getValue(language)+" ");

      int propc=0;
      if(oppend.isAbstract()){
        out.write((propc==0?"(":",")+"ABSTRACT");
        propc++;
      }
      if(oppend.isPropFinal()){
        out.write((propc==0?"(":",")+"FINAL");
        propc++;
      }
      if(oppend.isPropExtended()){
        out.write((propc==0?"(":",")+"EXTENDED");
        propc++;
      }
      if(propc>0){
        out.write(") ");
      }

      out.write(": ");

      if(oppend.getMultiplicity()!=null){
        MultiplicityRange card=(MultiplicityRange)(oppend.getMultiplicity().iteratorRange().next());
        if(card.getLower()==1 && card.getUpper()==1){
          out.write("MANDATORY ");
        }
      }

      String external="";
      if(oppend.isPropExternal()){
        external="(EXTERNAL) ";
      }
      out.write("REFERENCE TO "+external+classRef(def.getParticipant(),(ClassDef)oppend.getParticipant()));
      if(oppend.sizeRestriction()>0){
        Iterator restri=oppend.iteratorRestriction();
        out.write("RESTRICTED TO ");
        String sep="";
        while(restri.hasNext()){
          ClassDef restr=(ClassDef)restri.next();
          out.write(sep+classRef(def,restr));
          sep=", ";
        }
      }

      // TODO [':=' Factor { ',' Factor } ]

      out.write(";");newline();
    }

    return;
    // -end- 3D5D429A0380 body3CFE050F004D "visitAttributeDef"
    }

  // -beg- preserve=no 3D5D42AF011D head3CFE050F004D "visitType"
  public void visitType(ModelElement owner, Type def)
  // -end- 3D5D42AF011D head3CFE050F004D "visitType"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5D42AF011D throws3CFE050F004D "visitType"
      throws java.io.IOException

    // -end- 3D5D42AF011D throws3CFE050F004D "visitType"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D5D42AF011D body3CFE050F004D "visitType"
    if(def instanceof Text){
      Text text=(Text)def;
      switch(text.getKind()){
        case TextKind.UNDEFINED:
          out.write("TEXT");
          break;
        case TextKind.MAXLEN:
          out.write("TEXT*"+Long.toString(text.getMaxLength()));
          break;
        case TextKind.NAME:
          out.write("NAME");
          break;
        case TextKind.URI:
          out.write("URI");
          break;
      }
    }else if(def instanceof BooleanType){
      out.write("BOOLEAN");
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.HorizAlignment){
      out.write("HALIGNMENT");
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.VertAlignment){
      out.write("VALIGNMENT");
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.UnknownType){
      ch.ehi.interlis.domainsandconstants.UnknownType unknown=(ch.ehi.interlis.domainsandconstants.UnknownType)def;
      out.write(unknown.getSyntax().getValue(language));
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.OidType){
      ch.ehi.interlis.domainsandconstants.basetypes.OidType oid=(ch.ehi.interlis.domainsandconstants.basetypes.OidType)def;
      out.write("OID ");
      if(oid.getKind()==ch.ehi.interlis.domainsandconstants.basetypes.OidKind.ANY){
        out.write("ANY");
      }else if(oid.getKind()==ch.ehi.interlis.domainsandconstants.basetypes.OidKind.NUMERIC
          || oid.getKind()==ch.ehi.interlis.domainsandconstants.basetypes.OidKind.TEXT){
        visitType(owner,oid.getOiddomain());
      }
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.ClassType){
      ch.ehi.interlis.domainsandconstants.basetypes.ClassType classtype=(ch.ehi.interlis.domainsandconstants.basetypes.ClassType)def;
      if(classtype.getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.CLASS){
        out.write("CLASS");
      }else if(classtype.getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE){
        out.write("STRUCTURE");
      }
      String sep=" RESTRICTED TO ";
      Iterator restrictioni=classtype.iteratorRestrictedTo();
      while(restrictioni.hasNext()){
        out.write(sep+classRef(owner,(AbstractClassDef)restrictioni.next()));
        sep=", ";
      }
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration){
        visitEnumeration((ch.ehi.interlis.domainsandconstants.basetypes.Enumeration)def);
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericalType){
        visitNumericalType(owner,(ch.ehi.interlis.domainsandconstants.basetypes.NumericalType)def);
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType){
      ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType type=(ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType)def;
      out.write("COORD");
      java.util.Iterator dimi=type.iteratorDim();
      String sep=" ";
      while(dimi.hasNext()){
        out.write(sep);
        visitNumericalType(owner,(NumericalType)dimi.next());
        sep=", ";
      }
      if(type.containsRotationDef()){
        ch.ehi.interlis.domainsandconstants.basetypes.RotationDef rot=type.getRotationDef();
        out.write(" ,ROTATION ");
        out.write(Long.toString(rot.getNullAxis()));
        out.write(" -> ");
        out.write(Long.toString(rot.getPihalfAxis()));
      }
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.linetypes.LineType){
      if(def instanceof ch.ehi.interlis.domainsandconstants.linetypes.IndividualSurface){
        out.write("SURFACE");
      }else if(def instanceof ch.ehi.interlis.domainsandconstants.linetypes.Tesselation){
        out.write("AREA");
      }else if(def instanceof ch.ehi.interlis.domainsandconstants.linetypes.IliPolyline){
        if(((ch.ehi.interlis.domainsandconstants.linetypes.IliPolyline)def).isDirected()){
          out.write("DIRECTED POLYLINE");
        }else{
          out.write("POLYLINE");
        }
      }
      ch.ehi.interlis.domainsandconstants.linetypes.LineType type=(ch.ehi.interlis.domainsandconstants.linetypes.LineType)def;
      if(type.containsLineForm()){
        ch.ehi.interlis.domainsandconstants.linetypes.LineForm form=type.getLineForm();
        out.write(" WITH (");
        String sep="";
        if(form.isArcs()){
          out.write(sep+"ARCS");
          sep=",";
        }
        if(form.isStraights()){
          out.write(sep+"STRAIGHTS");
          sep=",";
        }
        java.util.Iterator lfIt=form.iteratorLineFormTypeDef();
        while(lfIt.hasNext()){
          out.write(sep+lineFormTypeRef(owner,(LineFormTypeDef)lfIt.next()));
          sep=",";
        }
        out.write(")");
      }
      if(type.containsControlpoints()){
        out.write(" VERTEX "+domainRef(owner,type.getControlpoints()));
      }
      if(type.containsIntersectionDef()){
        out.write(" WITHOUT OVERLAPS>"+visitIliDim(type.getIntersectionDef().getMaxi()));
      }
      if((type instanceof ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType) && ((ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType)type).containsLinAttrDef()){
        out.write(" LINE ATTRIBUTES "+classRef(owner,((ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType)type).getLinAttrDef()));
      }
    }
    return;
    // -end- 3D5D42AF011D body3CFE050F004D "visitType"
    }

  // -beg- preserve=no 3D6C97FA0064 head3CFE050F004D "unitRef"
  public String unitRef(ModelElement source, UnitDef ref)
  // -end- 3D6C97FA0064 head3CFE050F004D "unitRef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D6C97FA0064 throws3CFE050F004D "unitRef"

    // -end- 3D6C97FA0064 throws3CFE050F004D "unitRef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6C97FA0064 body3CFE050F004D "unitRef"
    return modelElementRef(source,ref,null);
    // -end- 3D6C97FA0064 body3CFE050F004D "unitRef"
    }

  // -beg- preserve=no 3D6C98220274 head3CFE050F004D "visitEnumeration"
  public void visitEnumeration(Enumeration def)
  // -end- 3D6C98220274 head3CFE050F004D "visitEnumeration"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6C98220274 throws3CFE050F004D "visitEnumeration"
      throws java.io.IOException

    // -end- 3D6C98220274 throws3CFE050F004D "visitEnumeration"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6C98220274 body3CFE050F004D "visitEnumeration"
    out.write("("); newline();
    String sep="";
    inc_ind();
    java.util.Iterator eleIt=def.iteratorEnumElement();
    while(eleIt.hasNext()){
      EnumElement ele=(EnumElement)eleIt.next();
      visitDocumentation(ele.getDocumentation());
      out.write(getIndent()+sep+ele.getName().getValue(language));
      if(ele.containsChild()){
        visitEnumeration(ele.getChild());
      }
      newline();
      sep=",";
    }
    dec_ind();
    out.write(getIndent()+")");
    return;
    // -end- 3D6C98220274 body3CFE050F004D "visitEnumeration"
    }

  // -beg- preserve=no 3D6C985C01A5 head3CFE050F004D "visitNumericalType"
  public void visitNumericalType(ModelElement owner, NumericalType def)
  // -end- 3D6C985C01A5 head3CFE050F004D "visitNumericalType"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6C985C01A5 throws3CFE050F004D "visitNumericalType"
      throws java.io.IOException

    // -end- 3D6C985C01A5 throws3CFE050F004D "visitNumericalType"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6C985C01A5 body3CFE050F004D "visitNumericalType"
    if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericType){
      ch.ehi.interlis.domainsandconstants.basetypes.NumericType ntype=(ch.ehi.interlis.domainsandconstants.basetypes.NumericType)def;
      if(ntype.isRangeDefined()){
        out.write(visitIliDim(ntype.getMinDec()));
        out.write("..");
        out.write(visitIliDim(ntype.getMaxDec()));
      }else{
        out.write("NUMERIC");
      }
      if(ntype.isCircular()){
        out.write(" CIRCULAR");
      }
      if(ntype.containsUnitDef()){
        out.write(" [");
        out.write(unitRef(owner,ntype.getUnitDef()));
        out.write("]");
      }
      if(ntype.containsRefSys()){
        out.write(ntype.getRefSys().getSyntax().getValue(language));
      }else if(ntype.getDirection()==RotationKind.CLOCKWISE){
        out.write(" CLOCKWISE");
      }else if(ntype.getDirection()==RotationKind.COUNTERCLOCKWISE){
        out.write(" COUNTERCLOCKWISE");
      }
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.StructuredUnitType){
      ch.ehi.interlis.domainsandconstants.basetypes.StructuredUnitType ntype=(ch.ehi.interlis.domainsandconstants.basetypes.StructuredUnitType)def;
      out.write(visitStructDec(ntype.getMinStruc()));
      out.write(" .. "); // added spaces to workaround compiler bug
      out.write(visitStructDec(ntype.getMaxStruc()));
      if(ntype.isCircular()){
        out.write(" CIRCULAR");
      }
      if(ntype.containsUnitDef()){
        out.write(" [");
        out.write(unitRef(owner,ntype.getUnitDef()));
        out.write("]");
      }
      if(ntype.getDirection()==RotationKind.CLOCKWISE){
        out.write(" CLOCKWISE");
      }else if(ntype.getDirection()==RotationKind.COUNTERCLOCKWISE){
        out.write(" COUNTERCLOCKWISE");
      }
      if(ntype.containsRefSys()){
        out.write(ntype.getRefSys().getSyntax().getValue(language));
      }
    }
    return;
    // -end- 3D6C985C01A5 body3CFE050F004D "visitNumericalType"
    }

  // -beg- preserve=no 3D6C98F201A1 head3CFE050F004D "visitIliDim"
  public String visitIliDim(IliDim def)
  // -end- 3D6C98F201A1 head3CFE050F004D "visitIliDim"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D6C98F201A1 throws3CFE050F004D "visitIliDim"

    // -end- 3D6C98F201A1 throws3CFE050F004D "visitIliDim"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6C98F201A1 body3CFE050F004D "visitIliDim"
    return def.toString();
    // -end- 3D6C98F201A1 body3CFE050F004D "visitIliDim"
    }

  // -beg- preserve=no 3D6C9CC2010E head3CFE050F004D "visitStructDec"
  public String visitStructDec(StructDec def)
  // -end- 3D6C9CC2010E head3CFE050F004D "visitStructDec"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D6C9CC2010E throws3CFE050F004D "visitStructDec"

    // -end- 3D6C9CC2010E throws3CFE050F004D "visitStructDec"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6C9CC2010E body3CFE050F004D "visitStructDec"
    return def.toString();
    // -end- 3D6C9CC2010E body3CFE050F004D "visitStructDec"
    }

  // -beg- preserve=no 3D6F4ECE016B head3CFE050F004D "lineFormTypeRef"
  public String lineFormTypeRef(ModelElement source, LineFormTypeDef ref)
  // -end- 3D6F4ECE016B head3CFE050F004D "lineFormTypeRef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D6F4ECE016B throws3CFE050F004D "lineFormTypeRef"

    // -end- 3D6F4ECE016B throws3CFE050F004D "lineFormTypeRef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6F4ECE016B body3CFE050F004D "lineFormTypeRef"
    return modelElementRef(source,ref,null);
    // -end- 3D6F4ECE016B body3CFE050F004D "lineFormTypeRef"
    }

  // -beg- preserve=no 3D6F86550379 head3CFE050F004D "visitRoleDef"
  public void visitRoleDef(RoleDef def)
  // -end- 3D6F86550379 head3CFE050F004D "visitRoleDef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6F86550379 throws3CFE050F004D "visitRoleDef"
        throws java.io.IOException

    // -end- 3D6F86550379 throws3CFE050F004D "visitRoleDef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6F86550379 body3CFE050F004D "visitRoleDef"
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    out.write(getIndent());
    out.write(def.getName().getValue(language)+" ");

    int propc=0;
    if(def.isAbstract()){
      out.write((propc==0?"(":",")+"ABSTRACT");
      propc++;
    }
    if(def.isPropFinal()){
      out.write((propc==0?"(":",")+"FINAL");
      propc++;
    }
    if(def.isPropExtended()){
      out.write((propc==0?"(":",")+"EXTENDED");
      propc++;
    }
    if(def.getOrdering()==OrderingKind.ORDERED){
      out.write((propc==0?"(":",")+"ORDERED");
      propc++;
    }
    if(propc>0){
      out.write(") ");
    }

    switch(def.getAggregation()){
      case AggregationKind.NONE:
        out.write("-- ");
        break;
      case AggregationKind.AGGREGATE:
        out.write("-<> ");
        break;
      case AggregationKind.COMPOSITE:
        out.write("-<#> ");
        break;
    }

    if(def.getMultiplicity()!=null){
      MultiplicityRange card=(MultiplicityRange)(def.getMultiplicity().iteratorRange().next());
      out.write(visitCardinality(card)+" ");
    }

    if(def.containsParticipant()){
      out.write(classRef(def.getAssociation(),(AbstractClassDef)def.getParticipant()));
    }else{
      logErrorMsg(def,rsrc.getString("CEnoParticipant"));
    }

    String sep=" RESTRICTED TO ";
    Iterator restrictioni=def.iteratorRestriction();
    while(restrictioni.hasNext()){
      out.write(sep+classRef(def.getAssociation(),(AbstractClassDef)restrictioni.next()));
      sep=", ";
    }
    // ':=' Factor
    if (def.containsRoleDefDerived()) {
	visitIliSyntaxLine(def.getRoleDefDerived());
    }


    out.write(";");newline();
    return;
    // -end- 3D6F86550379 body3CFE050F004D "visitRoleDef"
    }

  // -beg- preserve=no 3D6F9C4B00D4 head3CFE050F004D "visitCardinality"
  public String visitCardinality(MultiplicityRange def)
  // -end- 3D6F9C4B00D4 head3CFE050F004D "visitCardinality"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D6F9C4B00D4 throws3CFE050F004D "visitCardinality"

    // -end- 3D6F9C4B00D4 throws3CFE050F004D "visitCardinality"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D6F9C4B00D4 body3CFE050F004D "visitCardinality"
    String ret;
      if(def.getUpper()==MultiplicityRange.UNBOUND){
        ret="{"+Long.toString(def.getLower())+"..*}";
      }else if(def.getLower()==def.getUpper()){
        ret="{"+Long.toString(def.getLower())+"}";
      }else{
        ret="{"+Long.toString(def.getLower())+".."+Long.toString(def.getUpper())+"}";
      }
    return ret;
    // -end- 3D6F9C4B00D4 body3CFE050F004D "visitCardinality"
    }

  // -beg- preserve=no 3D7862770006 head3CFE050F004D "sortIliDefs"
  private java.util.List sortIliDefs(java.util.Set children)
  // -end- 3D7862770006 head3CFE050F004D "sortIliDefs"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D7862770006 throws3CFE050F004D "sortIliDefs"

    // -end- 3D7862770006 throws3CFE050F004D "sortIliDefs"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D7862770006 body3CFE050F004D "sortIliDefs"
    ch.ehi.basics.tools.TopoSort ts=new ch.ehi.basics.tools.TopoSort();
    Iterator defi=children.iterator();
    while(defi.hasNext()){
      ModelElement def=(ModelElement)defi.next();
      ts.add(def);

      Iterator i;

      // topics may contain elements that reference elements which are peer to the topic
      // therfore all non-topics should come before the topics
      if(def instanceof TopicDef){
        i=children.iterator();
        while(i.hasNext()){
          ModelElement supplier=(ModelElement)i.next();
          if(supplier!=def && !(supplier instanceof TopicDef)){
              // force non-topic to be in front of topic
              ts.addcond(supplier,def);
          }
        }
      }

      // consider explicit dependencies
      i=def.iteratorClientDependency();
      while(i.hasNext()){
        ch.ehi.uml1_4.foundation.core.Dependency dep=(ch.ehi.uml1_4.foundation.core.Dependency)i.next();
        Iterator j=dep.iteratorSupplier();
        while(j.hasNext()){
          ModelElement supplier=(ModelElement)j.next();
          if(children.contains(supplier)){
            ts.addcond(supplier,def);
          }
        }
      }

      // consider generalisation
      if(def instanceof ch.ehi.uml1_4.foundation.core.GeneralizableElement){
        i=((ch.ehi.uml1_4.foundation.core.GeneralizableElement)def).iteratorGeneralization();
        while(i.hasNext()){
          ch.ehi.uml1_4.foundation.core.Generalization gen=(ch.ehi.uml1_4.foundation.core.Generalization)i.next();
          if(gen.containsParent()){
            ModelElement supplier=gen.getParent();
            if(children.contains(supplier)){
              ts.addcond(supplier,def);
            }
          }
        }
      }

      // consider classrefs in reference/structure attributes
      if(def instanceof ClassDef){
        i=((ClassDef)def).iteratorAssociation();
        while(i.hasNext()){
           Object obj=i.next();
           if(obj instanceof RoleDef){
            RoleDef role=(RoleDef)obj;
            if(role.getIliAttributeKind()==AssociationAsIliAttrKind.STRUCTURE
                || role.getIliAttributeKind()==AssociationAsIliAttrKind.REFERENCE){
              RoleDef oppend=getOppEnd(role);
              if(oppend.containsParticipant()){
                ch.ehi.uml1_4.foundation.core.Classifier supplierc=oppend.getParticipant();
                ClassDef supplier=(ClassDef)oppend.getParticipant();
                if(children.contains(supplier)){
                  ts.addcond(supplier,def);
                }
              }

              if(oppend.sizeRestriction()>0){
                Iterator restri=oppend.iteratorRestriction();
                while(restri.hasNext()){
                  ClassDef supplier=(ClassDef)restri.next();
                  if(children.contains(supplier)){
                    ts.addcond(supplier,def);
                  }
                }
              }
            }

           }else{
            // ignore others; should not have others
           }
        }
      }

      // consider classrefs in roledefs
      if((def instanceof AssociationDef)
          && !((AssociationDef)def).isStructureAttribute() && !((AssociationDef)def).isReferenceAttribute()){
        i=((AssociationDef)def).iteratorConnection();
        while(i.hasNext()){
           Object obj=i.next();
           if(obj instanceof RoleDef){
            RoleDef role=(RoleDef)obj;
            if(role.containsParticipant()){
              AbstractClassDef supplier=(AbstractClassDef)role.getParticipant();
              if(children.contains(supplier)){
                ts.addcond(supplier,def);
              }
            }
            Iterator restrictioni=role.iteratorRestriction();
            while(restrictioni.hasNext()){
              AbstractClassDef supplier=(AbstractClassDef)restrictioni.next();
              if(children.contains(supplier)){
                ts.addcond(supplier,def);
              }
            }
           }else{
            // ignore others; should not have others
           }
        }
      }

      // consider domainrefs in attributes
      if(def instanceof AbstractClassDef){
        i=((AbstractClassDef)def).iteratorFeature();
        while(i.hasNext()){
           Object obj=i.next();
           if(obj instanceof AttributeDef){
            AttributeDef attr=(AttributeDef)obj;
            if(attr.containsAttrType()){
              DomainAttribute attrType=(DomainAttribute)attr.getAttrType();
              if(attrType.containsDomainDef()){
                  ModelElement supplier=attrType.getDomainDef();
                  if(children.contains(supplier)){
                    ts.addcond(supplier,def);
                  }
              }
              if(attrType.containsDirect()){
                // consider type in attributes
                addTypeCondition(children,ts,def,attrType.getDirect());
              }
            }

           }else{
            // ignore others; should not have others
           }
        }
      }

      // consider type in domaindefs
      if(def instanceof DomainDef){
        DomainDef domain=(DomainDef)def;
        if(domain.containsType()){
          addTypeCondition(children,ts,def,domain.getType());
        }
      }

    }
    if(ts.sort()){
      return ts.getResult();
    }
    StringBuffer loopele=new StringBuffer();
    Iterator resi=ts.getResult().iterator();
    String sep="";
    while(resi.hasNext()){
      ModelElement res=(ModelElement)resi.next();
      loopele.append(sep);
      loopele.append(res.getName().getValue(language));
      sep="->";
    }
    logErrorMsg("loop in definitions: "+loopele.toString());
    return new java.util.LinkedList(children);
    // -end- 3D7862770006 body3CFE050F004D "sortIliDefs"
    }

  // -beg- preserve=no 3D7862CC038E head3CFE050F004D "addTypeCondition"
  private void addTypeCondition(java.util.Set children, TopoSort ts, ModelElement def, Type type)
  // -end- 3D7862CC038E head3CFE050F004D "addTypeCondition"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D7862CC038E throws3CFE050F004D "addTypeCondition"

    // -end- 3D7862CC038E throws3CFE050F004D "addTypeCondition"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D7862CC038E body3CFE050F004D "addTypeCondition"
    if(type instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericalType){
        addNumericalTypeCondition(children,ts,def,(ch.ehi.interlis.domainsandconstants.basetypes.NumericalType)type);
    }else if(type instanceof ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType){
      ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType ctype=(ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType)type;
      java.util.Iterator dimi=ctype.iteratorDim();
      while(dimi.hasNext()){
        addNumericalTypeCondition(children,ts,def,(NumericalType)dimi.next());
      }
    }else if(type instanceof ch.ehi.interlis.domainsandconstants.linetypes.LineType){
      ch.ehi.interlis.domainsandconstants.linetypes.LineType ltype=(ch.ehi.interlis.domainsandconstants.linetypes.LineType)type;
      if(ltype.containsLineForm()){
        ch.ehi.interlis.domainsandconstants.linetypes.LineForm form=ltype.getLineForm();
        java.util.Iterator lfIt=form.iteratorLineFormTypeDef();
        while(lfIt.hasNext()){
          LineFormTypeDef supplier=(LineFormTypeDef)lfIt.next();
          if(children.contains(supplier)){
            ts.addcond(supplier,def);
          }
        }
      }
      if(ltype.containsControlpoints()){
        DomainDef supplier=ltype.getControlpoints();
        if(children.contains(supplier)){
          ts.addcond(supplier,def);
        }
      }
      if((type instanceof ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType) && ((ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType)type).containsLinAttrDef()){
        ClassDef supplier=((ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType)type).getLinAttrDef();
        if(children.contains(supplier)){
          ts.addcond(supplier,def);
        }
      }

    }
    // -end- 3D7862CC038E body3CFE050F004D "addTypeCondition"
    }

  // -beg- preserve=no 3D7864380142 head3CFE050F004D "addNumericalTypeCondition"
  private void addNumericalTypeCondition(java.util.Set children, TopoSort ts, ModelElement def, NumericalType type)
  // -end- 3D7864380142 head3CFE050F004D "addNumericalTypeCondition"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D7864380142 throws3CFE050F004D "addNumericalTypeCondition"

    // -end- 3D7864380142 throws3CFE050F004D "addNumericalTypeCondition"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D7864380142 body3CFE050F004D "addNumericalTypeCondition"
      if(type.containsUnitDef()){
        UnitDef supplier=type.getUnitDef();
        if(children.contains(supplier)){
          ts.addcond(supplier,def);
        }
      }
    // -end- 3D7864380142 body3CFE050F004D "addNumericalTypeCondition"
    }

  // -beg- preserve=no 3D7864DB018D head3CFE050F004D "modelElementRef"
  public String modelElementRef(ModelElement source, ModelElement ref, String language)
  // -end- 3D7864DB018D head3CFE050F004D "modelElementRef"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D7864DB018D throws3CFE050F004D "modelElementRef"

    // -end- 3D7864DB018D throws3CFE050F004D "modelElementRef"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D7864DB018D body3CFE050F004D "modelElementRef"
    if(language==null){
      language=this.language;
    }
    return ch.ehi.interlis.tools.ModelElementUtility.getIliQualifiedName(source,ref,language);
    // -end- 3D7864DB018D body3CFE050F004D "modelElementRef"
    }

  // -beg- preserve=no 3D786522033D head3CFE050F004D "setCheckModel"
  public void setCheckModel(boolean doCheck)
  // -end- 3D786522033D head3CFE050F004D "setCheckModel"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=no 3D786522033D throws3CFE050F004D "setCheckModel"

    // -end- 3D786522033D throws3CFE050F004D "setCheckModel"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D786522033D body3CFE050F004D "setCheckModel"
    onlyChecking=doCheck;
    // -end- 3D786522033D body3CFE050F004D "setCheckModel"
    }

  // -beg- preserve=no 3D786553033E head3CFE050F004D "visitDocumentation"
  public void visitDocumentation(NlsString nlsdoc)
  // -end- 3D786553033E head3CFE050F004D "visitDocumentation"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D786553033E throws3CFE050F004D "visitDocumentation"
    throws java.io.IOException

    // -end- 3D786553033E throws3CFE050F004D "visitDocumentation"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D786553033E body3CFE050F004D "visitDocumentation"
    if(nlsdoc==null)return;
    String doc=nlsdoc.getValue(language).trim();
    if(doc.length()==0)return;
    String beg="/** ";
    // for each line
    int last=0;
    int next=doc.indexOf("\n",last);
    while(next>-1){
      String line=doc.substring(last,next);
      out.write(getIndent()+beg+line);newline();
      beg=" * ";
      last=next+1;
      next=doc.indexOf("\n",last);
    }
      String line=doc.substring(last);
      out.write(getIndent()+beg+line);newline();
      out.write(getIndent()+" */");newline();
    // -end- 3D786553033E body3CFE050F004D "visitDocumentation"
    }

  // -beg- preserve=no 3D9B17BD0368 head3CFE050F004D "visitExplanation"
  public void visitExplanation(NlsString nlsdoc)
  // -end- 3D9B17BD0368 head3CFE050F004D "visitExplanation"
    // declare any checked exceptions
    // please fill in/modify the following section
    // -beg- preserve=yes 3D9B17BD0368 throws3CFE050F004D "visitExplanation"
    throws java.io.IOException

    // -end- 3D9B17BD0368 throws3CFE050F004D "visitExplanation"
    {
    // please fill in/modify the following section
    // -beg- preserve=yes 3D9B17BD0368 body3CFE050F004D "visitExplanation"
    if(nlsdoc==null)return;
    String doc=nlsdoc.getValue(language).trim();
    if(doc.length()==0)return;
    String beg="// ";
    boolean multiline=false;
    // for each line
    int last=0;
    int next=doc.indexOf("\n",last);
    if(next>-1){
      multiline=true;
      newline();
      inc_ind();
    }
    while(next>-1){
      String line=doc.substring(last,next);
      out.write(getIndent()+beg+line);newline();
      beg="   ";
      last=next+1;
      next=doc.indexOf("\n",last);
    }
      String line=doc.substring(last);
      if(multiline){
        out.write(getIndent());
      }else{
        out.write(" ");
      }
      out.write(beg+line);
      if(multiline){
        newline();
      }
      out.write(getIndent()+" //");
      if(multiline){
        dec_ind();
      }
    // -end- 3D9B17BD0368 body3CFE050F004D "visitExplanation"
    }

  // declare/define something only in the code
  // please fill in/modify the following section
  // -beg- preserve=yes 3CFE050F004D detail_end "TransferFromUmlMetamodel"

  /** current line seperator
   *
   */
  static private String nl=null;

  /** current line number
   *
   */
  private int lineNumber;

  /** write a line seperator
   *
   */
  private void newline()
    throws java.io.IOException
  {
    if(nl==null)nl=System.getProperty("line.separator");
    out.write(nl);lineNumber++;
  }

  /** current indentation level
   *
   */
  private int ind=0;

  /** get indent characters
   * @return indentation characters
   */
  private String getIndent()
  {
    return ch.ehi.basics.tools.StringUtility.STRING(ind*2,' ');
  }

  /** increment indentation level
   *
   */
  private void inc_ind()
  {
	ind=ind+1;
  }

  /** decrement indentation level
   *
   */
  private void dec_ind()
  {
	ind=ind-1;
  }

  /** get other end of a bidrectional association
   *
   */
  static private RoleDef getOppEnd(RoleDef athis)
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

  private int errc=0;

  /** logs an error message for a given element
   *
   */
  private void logErrorMsg(AbstractEditorElement def,String msg){
    ch.ehi.umleditor.application.LauncherView.getInstance().log(def.getOid(),getFuncDesc(),msg);
    errc++;
  }

  /** logs an error message
   *
   */
  private void logErrorMsg(String msg){
    ch.ehi.umleditor.application.LauncherView.getInstance().log(getFuncDesc(),msg);
    errc++;
  }

  /** defines an entry that links the current file position to the given model element.
   * This is required to map compiler error messages that consists of a line numer
   * back to the correct model element.
   */
  private void defineLinkToModelElement(AbstractEditorElement def)
  {
    // are we in checking mode?
    if(currentFile!=null){
      currentFile.add(lineNumber,def);
    }
  }

  /** maps a filename and a linenumber to the id of the model element
   * that was generated at this file position
   */
  private String findElementId(String filename,int line)
  {
    if(filename==null || line==0)return null;

      for(java.util.Iterator i=tempFiles.iterator();i.hasNext();){
        FileListEntry f=(FileListEntry)i.next();
        if(f.file.getAbsolutePath().equals(filename)){
          String id=null;
          for(java.util.Iterator j=f.modelElements.iterator();j.hasNext();){
            ModelElementEntry m=(ModelElementEntry)j.next();
            if(m.line<=line){
              id=m.def.getOid();
            }else{
              break;
            }
          }
          return id;
        }
      }
    return null;
  }

  /** adapts error messages of the compiler to the umleditor
   *
   */
  class MyErrorListener implements ch.interlis.ili2c.metamodel.ErrorListener {
    private ch.ehi.umleditor.application.LauncherView app=null;
    /** called by the compiler for every error message
     *
     */
    public void error(ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent evt) {
      if(app==null){
        app=ch.ehi.umleditor.application.LauncherView.getInstance();
      }
      if(app!=null){
        errc++;
        String msg=evt.getMessage();
        // translate filename and linenumber to element id
        int line=evt.getLine();
        String filename=evt.getFileName();
        String id=null;
        id=findElementId(filename,line);
        if(id!=null){
          app.log(id,getFuncDesc(),msg);
        }else{
          app.log(getFuncDesc(),msg);
        }
          //errOutput.append(evt.toString ());
          //errOutput.append("\n");
        }
    }
  }

  /** get description of current export mode
   *
   */
   public String getFuncDesc()
   {
    if(onlyChecking){
      if(xsdFile!=null){
        return "XSD export";
      }
      return rsrc.getString("CIcheckmodel");
    }
    return rsrc.getString("CIexportinterlis");
   }
   private String xsdFile=null;
   public void setXsdFile(String path){
    xsdFile=path;
   }
   private boolean createFileList=false;
   private java.util.List fileList=null;
   public void setCreateFileList(boolean create){
    createFileList=create;
    if(createFileList){
      fileList=new java.util.ArrayList();
    }else{
      fileList=null;
    }
   }
   public java.util.List getFileList(){
    return fileList;
   }

   private java.util.ArrayList flushedDomainStructs=new java.util.ArrayList();
   private java.util.ArrayList domainStructs=new java.util.ArrayList();
   private void flushDomainStructs()
    throws java.io.IOException
   {
    Iterator defi=domainStructs.iterator();
    while(defi.hasNext()){
      DomainDef def=(DomainDef)defi.next();
      String name=def.getName().getValue(language);
      out.write(getIndent()+"STRUCTURE "+name+"_ ");
          // if base and base in list of domainstructs?
            // generate EXTENDS
          boolean extended=false;
          Iterator extendsi=def.iteratorGeneralization();
          while(extendsi.hasNext()){
            Object obj=extendsi.next();
            if(obj instanceof ch.ehi.interlis.domainsandconstants.DomainExtends){
              ch.ehi.interlis.domainsandconstants.DomainExtends extend=(ch.ehi.interlis.domainsandconstants.DomainExtends)obj;
              if(extend.containsParent()){
                DomainDef supplier=(DomainDef)extend.getParent();
                if(flushedDomainStructs.contains(supplier)){
                  out.write("EXTENDS "+domainRef(def,supplier)+"_ ");
                  extended=true;
                }
                break;
              }
            }
          }
          out.write("= value "+(extended?"(EXTENDED)":"")+": MANDATORY "+name+"; END "+name+"_;");newline();
    }
    flushedDomainStructs.addAll(domainStructs);
    domainStructs.clear();
   }
  public void visitIliSyntaxLine(IliSyntax element)
        throws java.io.IOException
    {
    NlsString defNls=element.getSyntax();
    String def = defNls!=null ? defNls.getValue(language) : "";
    // for each line
    int last=0;
    int next=def.indexOf("\n",last);
    String nextIndent="";
    while(next>-1){
      String line=def.substring(last,next);
      out.write(nextIndent+line);newline();
      last=next+1;
      next=def.indexOf("\n",last);
      nextIndent=getIndent();
    }
      String line=def.substring(last);
      out.write(nextIndent+line);
    }
  // -end- 3CFE050F004D detail_end "TransferFromUmlMetamodel"

}

