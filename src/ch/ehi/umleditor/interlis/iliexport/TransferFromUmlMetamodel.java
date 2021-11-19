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
package ch.ehi.umleditor.interlis.iliexport;

import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.IliImport;
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
import ch.ehi.interlis.associations.Participant;
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
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.types.NlsString;
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
import ch.ehi.interlis.tools.AbstractClassDefUtility;
import ch.ehi.interlis.tools.ModelElementUtility;
import ch.ehi.interlis.tools.RoleDefUtility;
import ch.ehi.uml1_4.foundation.core.Artifact;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.modelmanagement.Package;
import ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange;
import ch.ehi.uml1_4.foundation.datatypes.OrderingKind;
import ch.ehi.uml1_4.foundation.datatypes.AggregationKind;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.uml1_4.implementation.AbstractEditorElement;
import ch.ehi.uml1_4.implementation.AbstractModelElement;
import ch.ehi.umleditor.application.ElementUtils;
import ch.ehi.umleditor.interlis.iliimport.TransferFromIli2cMetamodel;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ch.ehi.basics.tools.TopoSort;
import ch.interlis.ili2c.config.Configuration;
import ch.interlis.ili2c.config.GenerateOutputKind;

public class TransferFromUmlMetamodel
{
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
  transient private boolean runIli2c=false;

  /** name of attribute in wrapper structure (that implements multi-value attributes)
   */
  public final static String VALUE_ATTR="value";
  
  private boolean useMultiValueStructAttrs=false;
  
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
   * This is only defined, if runIli2c==true.
   *  list<FileListEntry iliFile>
   */
  transient private java.util.List tempFiles=null;
  transient private FileListEntry currentFile=null;
  /** map from a modelname to a FileListEntry in tempFiles.
   * This is only defined, if runIli2c==true.
   * map<String modelName,FileListEntry file>
   */
  transient private java.util.Map model2file=null;
  transient private java.util.Set filedep=null;
  private class IliFileCond {
  	public String before;
  	public String after;
  	public IliFileCond(String before1,String after1){
  		before=before1;
  		after=after1;
  	}
  };

  /** last written ModelElement.
   * Used to supress superfluous DOMAIN keywords.
   */
  transient private ModelElement lastModelElement=null;

  private void visitNamespace(Namespace ns,Configuration config,ch.ehi.basics.settings.Settings settings)
    throws java.io.IOException
    {
    if(runIli2c){
      tempFiles=new java.util.ArrayList();
      model2file=new java.util.HashMap();
      filedep=new java.util.HashSet();
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
    if(errc==0 && runIli2c){
      //MyErrorListener el=new MyErrorListener();
      // build compiler config file
      	config.clearBoidEntry();
      	config.clearFileEntry();
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
        sortIliFiles();
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

                //try{
                //  ch.interlis.ili2c.config.PersistenceService.writeConfig("g:\\tmp\\metaobj\\ce.ilc",config);
                //}catch(FileNotFoundException ex){
                //  el.error(new ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent(ex,null,0,ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent.SEVERITY_ERROR));
                //}catch(IOException ex){
                //  el.error(new ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent(ex,null,0,ch.interlis.ili2c.metamodel.ErrorListener.ErrorEvent.SEVERITY_ERROR));
                //}

      // run compiler
      try{
		ch.ehi.umleditor.application.LauncherView.getInstance().getLogListener().setCompilerMsgMapper(new MyErrorListener());
		ch.interlis.ili2c.Main.runCompiler(config,settings);
      }finally{
		ch.ehi.umleditor.application.LauncherView.getInstance().getLogListener().setCompilerMsgMapper(null);
      }
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
    }

  public void setup(java.io.Writer out, String language)
    {
    this.out=out;
    this.language=language;
    }

  public void visitINTERLIS2Def(INTERLIS2Def def)
        throws java.io.IOException
    {
    if(def.getDefLangName().startsWith("<")){
      return;
    }
    java.util.HashSet done=new java.util.HashSet(); // collection of visited languages
    // enumerate all languages
	List<String> languages = new ArrayList<String>();
    {
    	java.util.Set set = ch.ehi.interlis.tools.ModelElementUtility.getChildElements(def, ModelDef.class);
    	java.util.Iterator iterator = set.iterator();

    	// get the languages
    	while (iterator.hasNext()) {
    		ModelDef modelDef = (ModelDef)iterator.next();
    		// 1) get the BaseLanguage
    		final String baseLanguage = modelDef.getBaseLanguage();
            if (baseLanguage != null && !languages.contains(baseLanguage)) {
    			 languages.add(baseLanguage);
    		}
    		// 2) get the ValidSecondLanguages
    		final List<String> validSecondLanguages = modelDef.getValidSecondLanguages();
    		for(String secondLang:validSecondLanguages) {
                if (!languages.contains(secondLang)) {
                    languages.add(secondLang);
               }
    		}
    	}
    }
    java.util.Iterator languagei=languages.iterator();
    while(languagei.hasNext()){
      String language=(String)languagei.next();
      if(done.contains(language)){
        continue;
      }
      File file=null;
      String filename=(String)def.getName().getValue(language);
      // if checkmode
      if(runIli2c){
        // create temporary file
    	//File umleditordir=new File(System.getProperty("java.io.tmpdir"),"umleditor");
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
		try{
	      if(!createFileList){
	        // open
	        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
	        lineNumber=1;
	        // write
	        defineLinkToModelElement(def);
	        out.write("INTERLIS "+def.getVersion()+";");newline();
	        if(Double.toString(def.getVersion()).equals("2.3")){
	        	useMultiValueStructAttrs=true;
	        }else{
	        	useMultiValueStructAttrs=false;
	        }
	        visitINTERLIS2Def(def,language);
	      }
	      done.add(language);
	      java.util.Iterator otheri=languages.iterator();
	      // while other langugae with same name
	      while(otheri.hasNext()){
	        String otherLanguage=(String)otheri.next();
	        // language already done?
	        if(done.contains(otherLanguage)){
	          continue;
	        }
	        // another filename?
	        if(!filename.equals(def.getName().getValue(otherLanguage))){
	          continue;
	        }
	        // write otherLanguage to same file
	        if(!createFileList){
	          visitINTERLIS2Def(def,otherLanguage);
	        }
	        done.add(otherLanguage);
	      }
		}finally{
			// close
			if(!createFileList){
				if(out!=null){
					  out.close();
					  out=null;
				}
			}
		}
      if(!runIli2c){
        if(!createFileList){
          ch.ehi.umleditor.application.LauncherView.getInstance().log(getFuncDesc()
            ,ch.ehi.basics.i18n.MessageFormat.format(rsrc,"CIilifilewritten",file.getAbsolutePath()));
        }
      }
    }

    return;
    }
  public void visitINTERLIS2Def(INTERLIS2Def def, String language)
    throws java.io.IOException
    {
    this.language=language;
    
    // enumerate and sort all ModelDef
    java.util.List todo=sortIliDefs(ch.ehi.interlis.tools.ModelElementUtility.getChildElements(def, ModelDef.class));
    // visit all ModelDef
    for(Object current : todo){
        newline();
        visitModelDef((ModelDef)current);
    }
    return;
    }
  public void visitTaggedValues(ModelElement def)
  throws java.io.IOException
  {
		TaggedValue umlTag=null;
		Iterator defLangIt=def.iteratorTaggedValue();
		while(defLangIt.hasNext()){
			umlTag=(TaggedValue)defLangIt.next();
			String name=umlTag.getName().getValue(TaggedValue.TAGGEDVALUE_LANG);
			if(name.startsWith(TransferFromIli2cMetamodel.TAGGEDVALUE_ILI_PREFIX)){
				String value=umlTag.getDataValue();
                out.write(getIndent());
                out.write("!!@ ");
                out.write(name.substring(TransferFromIli2cMetamodel.TAGGEDVALUE_ILI_PREFIX.length()));
                out.write("=");
                if(value.indexOf(' ')!=-1 || value.indexOf('=')!=-1 || value.indexOf(';')!=-1 || value.indexOf(',')!=-1 || value.indexOf('"')!=-1 || value.indexOf('\\')!=-1){
                    out.write("\""+value+"\"");newline();
                }else{
                    out.write(value);newline();
                }   
			}
		}
  }
  public void visitModelDef(ModelDef def)
    throws java.io.IOException
    {
    // check if ModelDef defines current language
	String baseLanguage=def.getBaseLanguage();
    if(!((baseLanguage!=null && baseLanguage.equals(language)) || def.getValidSecondLanguages().contains(language))){
        // current language is not defined by this ModelDef
        return;
      }
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitTaggedValues(def);
    if(def.isContracted()){
		out.write("CONTRACTED ");
    }
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
    String modelName=def.getName().getValue(language);
    if(runIli2c){
    	model2file.put(modelName,currentFile);
    }
    out.write("MODEL "+visitIliName(def,modelName)+" ("+language+")");
    // issuerURI
    newline();
    String issuerURI=mapNls(def.getIssuerURI());
    if(issuerURI!=null){
		out.write("AT \""+issuerURI+"\"");
    }else{
		logErrorMsg(def,"ModelDef "+modelName+" requires an issuer URI");
    }
    // version
	newline();
	String version=mapNls(def.getVersion());
	if(version!=null){
		out.write("VERSION \""+version+"\" ");
	}else{
		logErrorMsg(def,"ModelDef "+modelName+" requires a version");
	}
	visitExplanation(def.getVersionComment());
    // if this is a modeldef in a translated language?
    if(def.getBaseLanguage()!=null && !def.getBaseLanguage().equals(language)){
      Iterator translationi=def.iteratorTranslation();
      while(translationi.hasNext()){
        Translation translation=(Translation)translationi.next();
        if(translation.getLanguage().equals(language)){
          newline();
          String trslModelName=def.getName().getValue(translation.getBaseLanguage());
          out.write("TRANSLATION OF "+trslModelName+" [\""+version+"\"]");
          if(runIli2c){
			filedep.add(new IliFileCond(trslModelName,modelName));
          }
        }
      }
    }
    out.write(" =");newline();
    inc_ind();


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
          String supplierLang=iliimport.getSupplierLanguage(language);
          String impModelName=supplier.getName().getValue(supplierLang);
          out.write(sep+impModelName);
          if(runIli2c){
			filedep.add(new IliFileCond(impModelName,modelName));
          }
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
    }
    private String mapNls(NlsString str)
    {
    	if(str!=null){
    		return str.getValue(language);
    	}
    	return null;
    }
  public void visitTopicDef(TopicDef def)
    throws java.io.IOException
    {

    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitTaggedValues(def);
    out.write(getIndent());
    if(def.getKind()==ch.ehi.interlis.modeltopicclass.TopicDefKind.VIEW){
      out.write("VIEW ");
    }
    out.write("TOPIC "+visitIliName(def,def.getName().getValue(language)));

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
      out.write(getIndent()+"OID AS "+domainRef(def,def.getOiddomain()));out.write(";");newline();
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
      }else{
      	// ignore other kind of Dependency
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
    }

  public void visitMetaDataUseDef(MetaDataUseDef def)
        throws java.io.IOException

    {
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    }

  public void visitUnitDef(UnitDef def)
        throws java.io.IOException

    {
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
    }

  public void visitFunctionDef(FunctionDef def)
        throws java.io.IOException

    {
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    }

  public void visitLineFormTypeDef(LineFormTypeDef def)
        throws java.io.IOException

    {
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
      out.write(visitIliName(def,def.getName().getValue(language)));
      out.write(" : ");
      out.write(classRef(def,def.getStructure()));
      out.write(";");newline();
    dec_ind();
    return;
    }

  public void visitDomainDef(DomainDef def)
    throws java.io.IOException
    {
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
    visitTaggedValues(def);
    String name=def.getName().getValue(language);
    out.write(getIndent()+visitIliName(def,name));

    int propc=0;
    if(def.isAbstract()){
      out.write((propc==0?" (":",")+"ABSTRACT");
      propc++;
    }
    if(def.isPropFinal()){
      out.write((propc==0?" (":",")+"FINAL");
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
    out.write(" = ");
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
    }

  public void visitGraphicParameterDef(GraphicParameterDef def)
        throws java.io.IOException
    {
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    }

  public void visitClassDef(ClassDef def)
        throws java.io.IOException
    {
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitTaggedValues(def);
    out.write(getIndent());
    if(def.getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE){
      out.write("STRUCTURE ");
    }else{
      out.write("CLASS ");
    }
    out.write(visitIliName(def,def.getName().getValue(language)));

    int propc=0;
    if(def.isAbstract()){
      out.write((propc==0?" (":",")+"ABSTRACT");
      propc++;
    }
    if(def.isPropFinal()){
      out.write((propc==0?" (":",")+"FINAL");
      propc++;
    }
    Iterator extendsi=def.iteratorGeneralization();
    while(extendsi.hasNext()){
      Object obj=extendsi.next();
      if(obj instanceof ch.ehi.interlis.modeltopicclass.ClassExtends){
        ch.ehi.interlis.modeltopicclass.ClassExtends extend=(ch.ehi.interlis.modeltopicclass.ClassExtends)obj;
        if(extend.containsParent() && extend.isExtended()){
          out.write((propc==0?" (":",")+"EXTENDED");
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
    java.util.Iterator childi=AbstractClassDefUtility.getIliAttributes(def).iterator();
	while(childi.hasNext()){
	   Object obj=childi.next();
	   if(obj instanceof AttributeDef){
		visitAttributeDef((AttributeDef)obj);
	   }else if(obj instanceof RoleDef){
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
    }

  public void visitAssociationDef(AssociationDef def)
        throws java.io.IOException
    {
    if(def.isStructureAttribute() || def.isReferenceAttribute()){
      return;
    }
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitTaggedValues(def);
    out.write(getIndent());
    out.write("ASSOCIATION ");
    out.write(visitIliName(def,def.getName().getValue(language)));

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
	// generate INTERLIS structure and reference attributes
    childi=AbstractClassDefUtility.getIliAttributes(def).iterator();
    while(childi.hasNext()){
       Object obj=childi.next();
       if(obj instanceof AttributeDef){
        visitAttributeDef((AttributeDef)obj);
       }else if(obj instanceof RoleDef){
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
    }

  public void visitConstraintDef(ConstraintDef def)
        throws java.io.IOException
    {
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax((ch.ehi.interlis.constraints.ConstraintExpression)def.getBody());
    return;
    }

  public void visitViewDef(ViewDef def)
        throws java.io.IOException
    {
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    }

  public void visitViewProjectionDef(ViewProjectionDef def)
        throws java.io.IOException
    {
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    }

  public void visitGraphicDef(GraphicDef def)
        throws java.io.IOException
    {
    newline();
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitIliSyntax(def);
    return;
    }

  public String topicRef(ModelElement source, TopicDef ref)
    {
    StringBuffer ret=new StringBuffer();
    Namespace parent=ref.getNamespace();
    while(!(parent instanceof ModelDef)){
      parent=parent.getNamespace();
    }
    ret.append(parent.getName().getValue(language));
    ret.append(".");
    ret.append(ref.getName().getValue(language));
    return ret.toString();
    }
  public void visitIliSyntax(IliSyntax element)
        throws java.io.IOException
    {
    NlsString defNls=element.getSyntax();
    String def = defNls!=null ? defNls.getValue(language) : "";
    if(def==null || def.length()==0){
    	return;
    }
    // for each line
	java.io.LineNumberReader lines=new java.io.LineNumberReader(new java.io.StringReader(def));
	String line;
	try{
		while((line=lines.readLine())!=null){
			out.write(getIndent()+line);newline();
		}
	}catch(java.io.IOException ex){
		ch.ehi.basics.logging.EhiLogger.logError(ex);
	}    
    }
  public String classRef(ModelElement source, AbstractClassDef ref)
    {
    if("ANYCLASS".equals(ref.getDefLangName())){
    	return "ANYCLASS";
    }
	if("ANYSTRUCTURE".equals(ref.getDefLangName())){
		return "ANYSTRUCTURE";
	}
    return modelElementRef(source,ref,null);
    }

  public void visitAttributeDef(AttributeDef def)
      throws java.io.IOException
    {
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitTaggedValues(def);
    out.write(getIndent());
    out.write(visitIliName(def,def.getName().getValue(language))+" ");
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
    if(def.isPropTransient()){
        out.write((propc==0?"(":",")+"TRANSIENT");
        propc++;
      }
    if(propc>0){
      out.write(") ");
    }

    out.write(": ");

    boolean isMultiValue=false;
    boolean isMandatory=false;
      ch.ehi.uml1_4.foundation.datatypes.Multiplicity m=def.getMultiplicity();
      ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange mr=null;
      if(m!=null){
        mr=(ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange)m.iteratorRange().next();
        if(mr.getUpper()>1){
          isMultiValue=true;
        }
        if(mr.getLower()==1){
          isMandatory=true;
        }
      }

    if(def.containsAttrType()){
      DomainAttribute attrType=(DomainAttribute)def.getAttrType();
      if(attrType.containsDomainDef()){
          if(isMultiValue){
        	if(def.getOrdering()==OrderingKind.ORDERED){
                out.write("LIST ");
        	}else{
                out.write("BAG ");
        	}
            out.write(visitCardinality(mr)+" OF ");
          }else if(isMandatory){
            out.write("MANDATORY ");
          }
          out.write(domainRef(def.getOwner(),attrType.getDomainDef()));
          if(isMultiValue  && useMultiValueStructAttrs){
            // reference to STRUCTURE and not DomainDef
            out.write("_");
          }
      }else if(attrType.containsDirect()){
    	if(!(attrType.getDirect() instanceof ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType)){
            if(isMandatory){
                out.write("MANDATORY ");
              }
    	}
        visitType(def,attrType.getDirect());
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
    }

  public String domainRef(ModelElement source, DomainDef ref)
    {
    return modelElementRef(source,ref,null);
    }

  public void visitAttributeDef(RoleDef oppend)
      throws java.io.IOException
    {
    RoleDef def=ModelElementUtility.getOppEnd(oppend);
    if(RoleDefUtility.isIliStructAttr(def)){

      defineLinkToModelElement(oppend);
      visitDocumentation(oppend.getDocumentation());
      visitTaggedValues(def);
      out.write(getIndent());
      out.write(visitIliName(oppend,oppend.getName().getValue(language))+" ");

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
	  if(def.getMultiplicity()!=null){
		MultiplicityRange card=(MultiplicityRange)(def.getMultiplicity().iteratorRange().next());
		if(card.getUpper()>1){
			logErrorMsg(def,rsrc.getString("CEmaxCardGtOne"));
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
          out.write(sep+classRef(def.getParticipant(),restr));
          sep=", ";
        }
      }

      // TODO [':=' Factor { ',' Factor } ]

      out.write(";");newline();
    }else{
      // TODO check that exactly two roles
      // if(assoc.sizeConnection()!=2){ log error}

      defineLinkToModelElement(oppend);
      visitDocumentation(oppend.getDocumentation());
      visitTaggedValues(def);
      out.write(getIndent());
      out.write(visitIliName(oppend,oppend.getName().getValue(language))+" ");

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
		if(card.getUpper()>1){
			logErrorMsg(oppend,rsrc.getString("CEmaxCardGtOne"));
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
          out.write(sep+classRef(def.getParticipant(),restr));
          sep=", ";
        }
      }

      // TODO [':=' Factor { ',' Factor } ]

      out.write(";");newline();
    }

    return;
    }

  public void visitType(AbstractModelElement owner, Type def)
      throws java.io.IOException
    {
    if(def instanceof Text){
      Text text=(Text)def;
      switch(text.getKind()){
        case TextKind.UNDEFINED:
			String typeTag="TEXT";
			if(text.isMultiline()){
				typeTag="MTEXT";
			}
			out.write(typeTag);
          break;
        case TextKind.MAXLEN:
        	typeTag="TEXT";
			if(text.isMultiline()){
				typeTag="MTEXT";
			}
          out.write(typeTag+"*"+Long.toString(text.getMaxLength()));
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
	}else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.BasketType){
	  ch.ehi.interlis.domainsandconstants.basetypes.BasketType basketType=(ch.ehi.interlis.domainsandconstants.basetypes.BasketType)def;
	  out.write("BASKET");
	  int kind=basketType.getKind();
	  // TODO: export BasketKind; requires change in metamodel, should be a set of values
	  if(kind==ch.ehi.interlis.domainsandconstants.basetypes.BasketKind.DATA){
		out.write(" (DATA)");
	  }else if(kind==ch.ehi.interlis.domainsandconstants.basetypes.BasketKind.VIEW){
		out.write(" (VIEW)");
	  }else if(kind==ch.ehi.interlis.domainsandconstants.basetypes.BasketKind.BASE){
		out.write(" (BASE)");
	  }else if(kind==ch.ehi.interlis.domainsandconstants.basetypes.BasketKind.GRAPHIC){
		out.write(" (GRAPHIC)");
	  }
	  if(basketType.containsBasketSchema()){
		TopicDef schema=basketType.getBasketSchema();
		out.write(" OF "+topicRef(owner,schema));
	  }
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.ClassType){
      ch.ehi.interlis.domainsandconstants.basetypes.ClassType classtype=(ch.ehi.interlis.domainsandconstants.basetypes.ClassType)def;
      if(classtype.getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.CLASS){
        out.write("CLASS");
      }else if(classtype.getKind()==ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE){
        out.write("STRUCTURE");
      }
      Iterator restrictioni=classtype.iteratorRestrictedTo();
      if(restrictioni.hasNext()){
          String sep=" RESTRICTION ( ";
          while(restrictioni.hasNext()){
              out.write(sep+classRef(owner,(AbstractClassDef)restrictioni.next()));
              sep="; ";
          }
          out.write(" )");
      }
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType){
			boolean useStruct = false;
			boolean isMandatory = false;
			ch.ehi.uml1_4.foundation.datatypes.Multiplicity m = ((AttributeDef) owner)
					.getMultiplicity();
			ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange mr = null;
			if (m != null) {
				mr = (ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange) m
						.iteratorRange().next();
				if (mr.getUpper() > 1) {
					useStruct = true;
				}
				if (mr.getLower() == 1) {
					isMandatory = true;
				}
			}

			if (useStruct) {
	        	if(((AttributeDef) owner).getOrdering()==OrderingKind.ORDERED){
	                out.write("LIST ");
	        	}else{
	                out.write("BAG ");
	        	}
				out.write(visitCardinality(mr) + " OF ");
			} else if (isMandatory) {
				out.write("MANDATORY ");
			}
        ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType structattrtype=(ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType)def;
        if(structattrtype.containsParticipant()){
          out.write(classRef(owner,structattrtype.getParticipant()));
        }else{
          out.write("ANYSTRUCTURE");
        }
        Iterator restrictioni=structattrtype.iteratorRestrictedTo();
        if(restrictioni.hasNext()){
            String sep=" RESTRICTION ( ";
            while(restrictioni.hasNext()){
                out.write(sep+classRef(owner,(AbstractClassDef)restrictioni.next()));
                sep="; ";
            }
            out.write(" )");
        }
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.RefAttrType){
        ch.ehi.interlis.domainsandconstants.basetypes.RefAttrType structattrtype=(ch.ehi.interlis.domainsandconstants.basetypes.RefAttrType)def;
        out.write("REFERENCE TO ");
        if(structattrtype.isPropExternal()){
            out.write("(EXTERNAL) ");
        }
        if(structattrtype.containsParticipant()){
          out.write(classRef(owner,structattrtype.getParticipant()));
        }else{
          out.write("ANYCLASS");
        }
        Iterator restrictioni=structattrtype.iteratorRestrictedTo();
        if(restrictioni.hasNext()){
            String sep=" RESTRICTION ( ";
            while(restrictioni.hasNext()){
                out.write(sep+classRef(owner,(AbstractClassDef)restrictioni.next()));
                sep="; ";
            }
            out.write(" )");
        }
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.Enumeration){
        visitEnumeration(owner,(ch.ehi.interlis.domainsandconstants.basetypes.Enumeration)def);
    }else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericalType){
        visitNumericalType(owner,(ch.ehi.interlis.domainsandconstants.basetypes.NumericalType)def);
	}else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.DateType){
		ch.ehi.interlis.domainsandconstants.basetypes.DateType type=(ch.ehi.interlis.domainsandconstants.basetypes.DateType)def;
		out.write("FORMAT INTERLIS.XMLDate ");
      	if(isDateNull(type.getMin())){
			logErrorMsg(owner,rsrc.getString("CEminvalRequired"));
      	}else{
    		out.write(visitDate(type.getMin()));
      	}
		out.write(" .. ");
      	if(isDateNull(type.getMax())){
			logErrorMsg(owner,rsrc.getString("CEmaxvalRequired"));
      	}else{
    		out.write(visitDate(type.getMax()));
      	}
	}else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.DateTimeType){
		ch.ehi.interlis.domainsandconstants.basetypes.DateTimeType type=(ch.ehi.interlis.domainsandconstants.basetypes.DateTimeType)def;
		// XMLDateTime "2000-01-01T00:00:00.000" .. "2005-12-31T23:59:59.999"
		out.write("FORMAT INTERLIS.XMLDateTime ");
      	if(isDateTimeNull(type.getMin())){
			logErrorMsg(owner,rsrc.getString("CEminvalRequired"));
      	}else{
    		out.write(visitDateTime(type.getMin()));
      	}
		out.write(" .. ");
      	if(isDateTimeNull(type.getMax())){
			logErrorMsg(owner,rsrc.getString("CEmaxvalRequired"));
      	}else{
    		out.write(visitDateTime(type.getMax()));
      	}
	}else if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.TimeType){
		ch.ehi.interlis.domainsandconstants.basetypes.TimeType type=(ch.ehi.interlis.domainsandconstants.basetypes.TimeType)def;
		out.write("FORMAT INTERLIS.XMLTime ");
      	if(isTimeNull(type.getMin())){
			logErrorMsg(owner,rsrc.getString("CEminvalRequired"));
      	}else{
      		out.write(visitTime(type.getMin()));
      	}
		out.write(" .. ");
      	if(isTimeNull(type.getMax())){
			logErrorMsg(owner,rsrc.getString("CEmaxvalRequired"));
      	}else{
      		out.write(visitTime(type.getMax()));
      	}
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
    }

  public String unitRef(ModelElement source, UnitDef ref)
    {
    return modelElementRef(source,ref,null);
    }

  public void visitEnumeration(AbstractModelElement owner,Enumeration def)
      throws java.io.IOException
    {
    out.write("("); newline();
    inc_ind();
    java.util.Iterator eleIt=def.iteratorEnumElement();
    while(eleIt.hasNext()){
      EnumElement ele=(EnumElement)eleIt.next();
      visitDocumentation(ele.getDocumentation());
      visitTaggedValues(ele);
      out.write(getIndent()+visitIliName(owner,ele.getName().getValue(language)));
      if(ele.containsChild()){
        visitEnumeration(owner,ele.getChild());
      }
      if(eleIt.hasNext()){
		out.write(",");
      }
      newline();
    }
    dec_ind();
    out.write(getIndent()+")");
    return;
    }

  public void visitNumericalType(AbstractModelElement owner, NumericalType def)
      throws java.io.IOException
    {
    if(def instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericType){
      ch.ehi.interlis.domainsandconstants.basetypes.NumericType ntype=(ch.ehi.interlis.domainsandconstants.basetypes.NumericType)def;
      if(ntype.isRangeDefined()){
      	if(ntype.getMinDec()==null){
			logErrorMsg(owner,rsrc.getString("CEmindecRequired"));
      	}else{
			out.write(visitIliDim(ntype.getMinDec()));
      	}
        out.write(" .. ");
		if(ntype.getMaxDec()==null){
			logErrorMsg(owner,rsrc.getString("CEmaxdecRequired"));
		}else{
	        out.write(visitIliDim(ntype.getMaxDec()));
		}
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
    }

	public String visitDate(ch.ehi.interlis.domainsandconstants.basetypes.DateValue def)
	{
		StringBuffer ret=new StringBuffer();
		ret.append("\"");
		ret.append(Integer.toString(def.getYear()));
		ret.append("-");
		ret.append(Integer.toString(def.getMonth()));
		ret.append("-");
		ret.append(Integer.toString(def.getDay()));
		ret.append("\"");
		return ret.toString();
	}
	public boolean isDateNull(ch.ehi.interlis.domainsandconstants.basetypes.DateValue def)
	{
		if(def!=null) return false;
		return true;
	}
	public String visitDateTime(ch.ehi.interlis.domainsandconstants.basetypes.DateTimeValue def)
	{
		StringBuffer ret=new StringBuffer();
		ret.append("\"");
		ret.append(Integer.toString(def.getYear()));
		ret.append("-");
		ret.append(Integer.toString(def.getMonth()));
		ret.append("-");
		ret.append(Integer.toString(def.getDay()));
		ret.append("T");
		ret.append(Integer.toString(def.getHours()));
		ret.append(":");
		ret.append(Integer.toString(def.getMinutes()));
		ret.append(":");
		ret.append(Float.toString(def.getSeconds()));
		ret.append("\"");
		return ret.toString();
	}
	public boolean isDateTimeNull(ch.ehi.interlis.domainsandconstants.basetypes.DateTimeValue def)
	{
		if(def!=null) return false;
		return true;
	}
	public String visitTime(ch.ehi.interlis.domainsandconstants.basetypes.TimeValue def)
	{
		StringBuffer ret=new StringBuffer();
		ret.append("\"");
		ret.append(Integer.toString(def.getHours()));
		ret.append(":");
		ret.append(Integer.toString(def.getMinutes()));
		ret.append(":");
		ret.append(Float.toString(def.getSeconds()));
		ret.append("\"");
		return ret.toString();
	}
	public boolean isTimeNull(ch.ehi.interlis.domainsandconstants.basetypes.TimeValue def)
	{
		if(def!=null) return false;
		return true;
	}
  public String visitIliDim(IliDim def)
    {
    return def.toString();
    }

  public String visitStructDec(StructDec def)
    {
    return def.toString();
    }

  public String lineFormTypeRef(ModelElement source, LineFormTypeDef ref)
    {
    return modelElementRef(source,ref,null);
    }

  public void visitRoleDef(RoleDef def)
        throws java.io.IOException
    {
    defineLinkToModelElement(def);
    visitDocumentation(def.getDocumentation());
    visitTaggedValues(def);
    out.write(getIndent());
    out.write(visitIliName(def,def.getName().getValue(language))+" ");

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
	if(def.isPropExternal()){
	  out.write((propc==0?"(":",")+"EXTERNAL");
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
    
    // first participant
    {
        if(def.containsParticipant()){
            out.write(classRef(def.getAssociation(),(AbstractClassDef)def.getParticipant()));
          }else{
            logErrorMsg(def,rsrc.getString("CEnoParticipant"));
          }

          String sep=" RESTRICTION ( ";
          Iterator restrictioni=def.iteratorRestriction();
          if(restrictioni.hasNext()){
      		while(restrictioni.hasNext()){
      		  out.write(sep+classRef(def.getAssociation(),(AbstractClassDef)restrictioni.next()));
      		  sep="; ";
      		}
      		out.write(")");
          }
    }
    // more (XOR) participants?
    Iterator xori=def.iteratorXorParticipant();
    if(xori.hasNext()){
    	inc_ind();
        while(xori.hasNext()){
        	Participant xor=(Participant)xori.next();
        	newline();
        	out.write(getIndent()+" OR ");
            if(xor.containsParticipant()){
                out.write(classRef(def.getAssociation(),(AbstractClassDef)xor.getParticipant()));
            }else{
                logErrorMsg(def,rsrc.getString("CEnoParticipant"));
            }
            String sep=" RESTRICTION ( ";
            Iterator restrictioni=xor.iteratorRestriction();
            if(restrictioni.hasNext()){
        		while(restrictioni.hasNext()){
        		  out.write(sep+classRef(def.getAssociation(),(AbstractClassDef)restrictioni.next()));
        		  sep="; ";
        		}
        		out.write(")");
            }
        	
        }
    	dec_ind();
        newline();
		out.write(getIndent());
    }
    
    // ':=' Factor
    if (def.containsRoleDefDerived()) {
	visitIliSyntaxLine(def.getRoleDefDerived());
    }


    out.write(";");newline();
    return;
    }

  public String visitCardinality(MultiplicityRange def)
    {
    String ret;
      if(def.getUpper()==MultiplicityRange.UNBOUND){
        ret="{"+Long.toString(def.getLower())+"..*}";
      }else if(def.getLower()==def.getUpper()){
        ret="{"+Long.toString(def.getLower())+"}";
      }else{
        ret="{"+Long.toString(def.getLower())+".."+Long.toString(def.getUpper())+"}";
      }
    return ret;
    }

	private void sortIliFiles(){
	  ch.ehi.basics.tools.TopoSort ts=new ch.ehi.basics.tools.TopoSort();
	  for(java.util.Iterator i=tempFiles.iterator();i.hasNext();){
		FileListEntry f=(FileListEntry)i.next();
		//System.err.println("file "+f.file.getName());
		ts.add(f);
	  }
	  for(java.util.Iterator i=filedep.iterator();i.hasNext();){
		IliFileCond cond=(IliFileCond)i.next();
		FileListEntry before=(FileListEntry)model2file.get(cond.before);
		FileListEntry after=(FileListEntry)model2file.get(cond.after);
		if(before==after){
			continue;
		}
		// nor file? (e.g. model INTERLIS)
		if(before==null || after==null){
			//System.err.println("cond "+cond.before+" < "+cond.after);
			continue;
		}
		//System.err.println("cond "+cond.before+"("+before.file.getName()+") < "+cond.after+"("+after.file.getName()+")");
		ts.addcond(before,after);
	  }
	  if(ts.sort()){
	  	tempFiles=ts.getResult();
	  	return;
	  }
	  StringBuffer loopele=new StringBuffer();
	  Iterator resi=ts.getResult().iterator();
	  String sep="";
	  while(resi.hasNext()){
		FileListEntry res=(FileListEntry)resi.next();
		loopele.append(sep);
		loopele.append(res.file.getName());
		sep="->";
	  }
	  logErrorMsg("loop in ili-files: "+loopele.toString());
	}
  private java.util.List sortIliDefs(java.util.Set children)
    {
    ch.ehi.basics.tools.TopoSort ts=new ch.ehi.basics.tools.TopoSort();
    Iterator defi=children.iterator();
    while(defi.hasNext()){
      ModelElement def=(ModelElement)defi.next();
      ts.add(def);
      {
      Iterator i;

      // elements inside of a topic may reference elements which are peer to the topic
      if(def instanceof TopicDef){
    	  TopicDef topicDef=(TopicDef)def;
          i=ch.ehi.interlis.tools.ModelElementUtility.getChildElements(topicDef,null).iterator();
          while(i.hasNext()){
            ModelElement child=(ModelElement)i.next();
            if(child!=def && !(child instanceof TopicDef)){
                addSimpleEleCond(children, ts, topicDef,child);
            }
          }
      }
      
      // elements may reference elements inside a topic
      if(def instanceof TopicDef){
          i=children.iterator();
          while(i.hasNext()){
            ModelElement child=(ModelElement)i.next();
            if(child!=def && !(child instanceof TopicDef)){
            	if(isDependentOnTopic(child, (TopicDef)def)){
            		// child depends on a element inside of topic def
                    ts.addcond(def,child);
            	}
            }
          }
      }
      }
      
      addSimpleEleCond(children, ts, def,def);

    }
    if(ts.sort()){
      // sort result according to level, type, name
      // build list of pairs (level,object)
      java.util.List pairv=new java.util.ArrayList();
      int[] levv=ts.getLevel();
      java.util.List objv=ts.getResult();
      Iterator obji=objv.iterator();
      for(int i=0;obji.hasNext();i++){
      	pairv.add(new Pair(levv[i],obji.next()));
      }
      // sort list of pairs
      java.util.Collections.sort(pairv, new java.util.Comparator(){
		public int compare(Object o_1, Object o_2)
		{
			Pair p1=(Pair)o_1;
			Pair p2=(Pair)o_2;
			// compare level
			if(p1.level<p2.level){
				return -1;
			}else if(p2.level<p1.level){
				return 1;
			}
			// ASSERT: same level
			// compare type
			int def=ch.ehi.interlis.tools.ModelElementUtility.compareDefinition(p1.object.getClass(),p2.object.getClass());
			if(def!=0){
			  return def;
			}
			// ASSERT: same type
			// compare name
		  String name1=getName4sorting(p1.object);
		  String name2=getName4sorting(p2.object);
		  int compareName =  name1.compareToIgnoreCase(name2);
		  return compareName;
		}
      });
      // copy objects from list of pairs back to result list
	  objv=new java.util.ArrayList();
	  for(Iterator pairi=pairv.iterator();pairi.hasNext();){
	  		objv.add(((Pair)pairi.next()).object);
	  }
      return objv;
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
    }

private void addSimpleEleCond(java.util.Set children,
		ch.ehi.basics.tools.TopoSort ts, ModelElement defDef, ModelElement defEle) {
	// consider explicit dependencies
      Iterator i=defEle.iteratorClientDependency();
      while(i.hasNext()){
        ch.ehi.uml1_4.foundation.core.Dependency dep=(ch.ehi.uml1_4.foundation.core.Dependency)i.next();
        Iterator j=dep.iteratorSupplier();
        while(j.hasNext()){
          ModelElement supplier=(ModelElement)j.next();
          if(children.contains(supplier)){
            ts.addcond(supplier,defDef);
          }
        }
      }

      // consider generalisation
      if(defEle instanceof ch.ehi.uml1_4.foundation.core.GeneralizableElement){
        i=((ch.ehi.uml1_4.foundation.core.GeneralizableElement)defEle).iteratorGeneralization();
        while(i.hasNext()){
          ch.ehi.uml1_4.foundation.core.Generalization gen=(ch.ehi.uml1_4.foundation.core.Generalization)i.next();
          if(gen.containsParent()){
            ModelElement supplier=gen.getParent();
            if(children.contains(supplier)){
              ts.addcond(supplier,defDef);
            }
          }
        }
      }

      // consider classrefs in reference/structure attributes
      if(defEle instanceof AbstractClassDef){
        i=((AbstractClassDef)defEle).iteratorAssociation();
        while(i.hasNext()){
           Object obj=i.next();
           if(obj instanceof RoleDef){
            RoleDef role=(RoleDef)obj;
            if(role.getAssociation().sizeConnection()>2){
            	continue;
            }
            if(RoleDefUtility.isIliAttr(role)){
              RoleDef oppend=ModelElementUtility.getOppEnd(role);
              if(oppend.containsParticipant()){
                ch.ehi.uml1_4.foundation.core.Classifier supplierc=oppend.getParticipant();
                AbstractClassDef supplier=(AbstractClassDef)oppend.getParticipant();
                if(children.contains(supplier)){
                  ts.addcond(supplier,defDef);
                }
              }

              if(oppend.sizeRestriction()>0){
                Iterator restri=oppend.iteratorRestriction();
                while(restri.hasNext()){
                  AbstractClassDef supplier=(AbstractClassDef)restri.next();
                  if(children.contains(supplier)){
                    ts.addcond(supplier,defDef);
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
      if((defEle instanceof AssociationDef)
          && !((AssociationDef)defEle).isStructureAttribute() && !((AssociationDef)defEle).isReferenceAttribute()){
        i=((AssociationDef)defEle).iteratorConnection();
        while(i.hasNext()){
           Object obj=i.next();
           if(obj instanceof RoleDef){
            RoleDef role=(RoleDef)obj;
            if(role.containsParticipant()){
              AbstractClassDef supplier=(AbstractClassDef)role.getParticipant();
              if(children.contains(supplier)){
                ts.addcond(supplier,defDef);
              }
            }
            Iterator restrictioni=role.iteratorRestriction();
            while(restrictioni.hasNext()){
              AbstractClassDef supplier=(AbstractClassDef)restrictioni.next();
              if(children.contains(supplier)){
                ts.addcond(supplier,defDef);
              }
            }
           }else{
            // ignore others; should not have others
           }
        }
      }

      // consider domainrefs in attributes
      if(defEle instanceof AbstractClassDef){
        i=((AbstractClassDef)defEle).iteratorFeature();
        while(i.hasNext()){
           Object obj=i.next();
           if(obj instanceof AttributeDef){
            AttributeDef attr=(AttributeDef)obj;
            if(attr.containsAttrType()){
              DomainAttribute attrType=(DomainAttribute)attr.getAttrType();
              if(attrType.containsDomainDef()){
                  ModelElement supplier=attrType.getDomainDef();
                  if(children.contains(supplier)){
                    ts.addcond(supplier,defDef);
                  }
              }
              if(attrType.containsDirect()){
                // consider type in attributes
                addTypeCondition(children,ts,defDef,attrType.getDirect());
              }
            }

           }else{
            // ignore others; should not have others
           }
        }
      }

      // consider type in domaindefs
      if(defEle instanceof DomainDef){
        DomainDef domain=(DomainDef)defEle;
        if(domain.containsType()){
          addTypeCondition(children,ts,defDef,domain.getType());
        }
      }
}
  
  /** checks if a client element references an element in a supplying Topic.
   */
  private boolean isDependentOnTopic(ModelElement client,TopicDef supplierTopic)
  {

		Iterator i;

		// consider classrefs in reference/structure attributes
		if (client instanceof AbstractClassDef) {
			i = ((AbstractClassDef) client).iteratorAssociation();
			while (i.hasNext()) {
				Object obj = i.next();
				if (obj instanceof RoleDef) {
					RoleDef role = (RoleDef) obj;
					if (role.getAssociation().sizeConnection() > 2) {
						continue;
					}
					if (RoleDefUtility.isIliAttr(role)) {
						RoleDef oppend = ModelElementUtility.getOppEnd(role);
						if (oppend.containsParticipant()) {
							ch.ehi.uml1_4.foundation.core.Classifier supplierc = oppend
									.getParticipant();
							AbstractClassDef supplier = (AbstractClassDef) oppend
									.getParticipant();
							if (supplier.containsParentTopicDef() && supplier.getParentTopicDef().equals(supplierTopic)) {
								return true;
							}
						}

						if (oppend.sizeRestriction() > 0) {
							Iterator restri = oppend.iteratorRestriction();
							while (restri.hasNext()) {
								AbstractClassDef supplier = (AbstractClassDef) restri
										.next();
								if (supplier.containsParentTopicDef() && supplier.getParentTopicDef().equals(supplierTopic)) {
									return true;
								}
							}
						}
					}

				} else {
					// ignore others; should not have others
				}
			}
		}
		return false;
  }
	private static String getName4sorting(Object ele)
	{
		String name1=ch.ehi.umleditor.application.NavigationTreeNodeUtility.getName(ele);
		if(name1==null)name1="";
		if(name1.equals("") && ele instanceof AssociationDef){
		  Iterator ri=((AssociationDef)ele).iteratorConnection();
		  StringBuffer nb=new StringBuffer();
		  while(ri.hasNext()){
			 Object obj=ri.next();
			 if(obj instanceof RoleDef){
			  RoleDef role=(RoleDef)obj;
			  String n=role.getDefLangName();
			  if(n!=null){
			  	nb.append(n);
			  }
			 }
		  }
		  name1=nb.toString();
		}
		return name1;
	}
  private void addTypeCondition(java.util.Set children, TopoSort ts, ModelElement def, Type type)
    {
    if(type instanceof ch.ehi.interlis.domainsandconstants.basetypes.NumericalType){
        addNumericalTypeCondition(children,ts,def,(ch.ehi.interlis.domainsandconstants.basetypes.NumericalType)type);
    }else if(type instanceof ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType){
      ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType ctype=(ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType)type;
      java.util.Iterator dimi=ctype.iteratorDim();
      while(dimi.hasNext()){
        addNumericalTypeCondition(children,ts,def,(NumericalType)dimi.next());
      }
    }else if(type instanceof ch.ehi.interlis.domainsandconstants.basetypes.ClassType){
        ch.ehi.interlis.domainsandconstants.basetypes.ClassType classtype=(ch.ehi.interlis.domainsandconstants.basetypes.ClassType)type;
        Iterator restrictioni=classtype.iteratorRestrictedTo();
        if(restrictioni.hasNext()){
            while(restrictioni.hasNext()){
            	AbstractClassDef supplier=(AbstractClassDef)restrictioni.next();
                if(children.contains(supplier)){
                    ts.addcond(supplier,def);
                }
            }
        }
    	
    }else if(type instanceof ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType){
        ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType structattrtype=(ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType)type;
        if(structattrtype.containsParticipant()){
        	AbstractClassDef supplier=structattrtype.getParticipant();
            if(children.contains(supplier)){
                ts.addcond(supplier,def);
            }
        }
        Iterator restrictioni=structattrtype.iteratorRestrictedTo();
        if(restrictioni.hasNext()){
            while(restrictioni.hasNext()){
            	AbstractClassDef supplier=(AbstractClassDef)restrictioni.next();
                if(children.contains(supplier)){
                    ts.addcond(supplier,def);
                }
            }
        }
    }else if(type instanceof ch.ehi.interlis.domainsandconstants.basetypes.RefAttrType){
        ch.ehi.interlis.domainsandconstants.basetypes.RefAttrType refattrtype=(ch.ehi.interlis.domainsandconstants.basetypes.RefAttrType)type;
        if(refattrtype.containsParticipant()){
        	AbstractClassDef supplier=refattrtype.getParticipant();
            if(children.contains(supplier)){
                ts.addcond(supplier,def);
            }
        }
        Iterator restrictioni=refattrtype.iteratorRestrictedTo();
        if(restrictioni.hasNext()){
            while(restrictioni.hasNext()){
            	AbstractClassDef supplier=(AbstractClassDef)restrictioni.next();
                if(children.contains(supplier)){
                    ts.addcond(supplier,def);
                }
            }
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
    }

  private void addNumericalTypeCondition(java.util.Set children, TopoSort ts, ModelElement def, NumericalType type)
    {
      if(type.containsUnitDef()){
        UnitDef supplier=type.getUnitDef();
        if(children.contains(supplier)){
          ts.addcond(supplier,def);
        }
      }
    }

  public String modelElementRef(ModelElement source, ModelElement ref, String language)
    {
    if(language==null){
      language=this.language;
    }
    ModelDef modelOfSource=null;
    ModelDef modelOfRef=null;
    modelOfSource=ModelElementUtility.getModel(source);
    modelOfRef=ModelElementUtility.getModel(ref);
    if(!modelOfRef.equals(modelOfSource)) {
        final IliImport iliImp = modelOfSource.getImport(modelOfRef);
        if(iliImp!=null) {
            language=iliImp.getSupplierLanguage(language);
        }
    }
    return ch.ehi.interlis.tools.ModelElementUtility.getIliQualifiedName(source,ref,language);
    }

  public void visitDocumentation(NlsString nlsdoc)
    throws java.io.IOException
    {
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
    }

  public void visitExplanation(NlsString nlsdoc)
    throws java.io.IOException
    {
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
    }

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

  private int errc=0;

  /** logs an error message for a given element
   *
   */
  private void logErrorMsg(AbstractModelElement def,String msg){
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
  class MyErrorListener implements ch.ehi.umleditor.application.LogListenerCompilerMsgMapper {
    /** called by the LogListener for every ili2c error message
     *
     */
    public String getId(ch.interlis.ili2c.CompilerLogEvent evt) {
        // translate filename and linenumber to element id
        int line=evt.getLine();
        String filename=evt.getFilename();
        String id=null;
        id=findElementId(filename,line);
        if(id!=null){
          return id;
        }
        return null;
    }
    public String getTitle()
    {
    	return getFuncDesc();
    }
  }

  /** get description of current export mode
   *
   */
   public String getFuncDesc()
   {
    if(runIli2c){
      return rsrc.getString("CIcheckmodel");
    }
    return rsrc.getString("CIexportinterlis");
   }
   public void runCompiler(Namespace ns,Configuration config,ch.ehi.basics.settings.Settings settings)
	 throws java.io.IOException
	 {
	 	runIli2c=true;
		visitNamespace(ns,config,settings);
	 }
   public void writeIliFile(INTERLIS2Def ili) throws java.io.IOException {
		visitINTERLIS2Def(ili);
	}
	public void writeIliFiles(Namespace ns)
	  throws java.io.IOException
	  {
	  	visitNamespace(ns,null,null);
	  }
   private boolean createFileList=false;
   private java.util.List fileList=null;
   public java.util.List getFileList(Namespace ns)
   throws java.io.IOException
   {
	try{
		createFileList=true;
		fileList=new java.util.ArrayList();
		visitNamespace(ns,null,null);
	}
	finally{
		createFileList=false;
	}
    return fileList;
   }

   private java.util.ArrayList flushedDomainStructs=new java.util.ArrayList();
   private java.util.ArrayList domainStructs=new java.util.ArrayList();
   private void flushDomainStructs()
    throws java.io.IOException
   {
	   if(useMultiValueStructAttrs){
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
		          out.write("= "+VALUE_ATTR+" "+(extended?"(EXTENDED)":"")+": MANDATORY "+name+"; END "+name+"_;");newline();
		    }
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
    class Pair{
    	public int level;
    	public Object object;
    	Pair(int level, Object object){
    		this.level=level;
    		this.object=object;
    	}
    }
    private String visitIliName(AbstractModelElement def,String name)
    throws java.io.IOException
    {
    	if(!name.matches("[a-zA-Z][a-zA-Z_0-9]*")){
    		logErrorMsg(def,ch.ehi.basics.i18n.MessageFormat.format(rsrc,"CEillegalIliName",name));
    	}
    	return name;
    }

}

