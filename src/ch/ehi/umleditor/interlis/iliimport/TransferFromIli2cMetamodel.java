package ch.ehi.umleditor.interlis.iliimport;

import ch.interlis.ili2c.metamodel.*;
import ch.interlis.ili2c.config.Configuration;
import ch.interlis.ili2c.generator.Interlis2Generator;

import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.constraints.ConstraintDef;
import ch.ehi.interlis.domainsandconstants.basetypes.DateTimeType;
import ch.ehi.interlis.domainsandconstants.basetypes.DateTimeValue;
import ch.ehi.interlis.domainsandconstants.basetypes.DateType;
import ch.ehi.interlis.domainsandconstants.basetypes.DateValue;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.InterlisDateTimeType;
import ch.ehi.interlis.domainsandconstants.basetypes.InterlisDateType;
import ch.ehi.interlis.domainsandconstants.basetypes.InterlisTimeType;
import ch.ehi.interlis.domainsandconstants.basetypes.TimeType;
import ch.ehi.interlis.domainsandconstants.basetypes.TimeValue;
import ch.ehi.interlis.metaobjects.ParameterDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.Translation;
import ch.ehi.basics.i18n.MessageFormat;
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.uml1_4.foundation.datatypes.OrderingKind;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.umleditor.interlis.iliexport.TransferFromUmlMetamodel;

import javax.xml.bind.DatatypeConverter;

public class TransferFromIli2cMetamodel
{
	public static final String TAGGEDVALUE_ILI_PREFIX="ili:";
	private final boolean unwrapMultiValueStructAttrs=true;
	private final boolean iliAttrsAsUmlAttrs=true;
	
	public TransferFromIli2cMetamodel(){
  }
  private java.util.ArrayList namespaceStack=new java.util.ArrayList();
  private void addNamespace(ch.ehi.uml1_4.foundation.core.Namespace ns)
  {
    namespaceStack.add(0,ns);
  }
  private ch.ehi.uml1_4.foundation.core.Namespace getNamespace()
  {
    return (ch.ehi.uml1_4.foundation.core.Namespace)namespaceStack.get(0);
  }
  private void removeNamespace()
  {
    namespaceStack.remove(0);
  }

  private java.util.HashMap<String,ch.ehi.interlis.modeltopicclass.INTERLIS2Def> fileMap=new java.util.HashMap<String,ch.ehi.interlis.modeltopicclass.INTERLIS2Def>();
  private ch.ehi.interlis.modeltopicclass.INTERLIS2Def visitINTERLIS2Def(String language,String filename, Model mdef)
  {
    Model translatedMdef=(Model)getElementInRootLanguage(mdef);
    if(fileMap.containsKey(mdef.getFileName())){
        // already seen file
        ch.ehi.interlis.modeltopicclass.INTERLIS2Def ili2Def= (ch.ehi.interlis.modeltopicclass.INTERLIS2Def)fileMap.get(mdef.getFileName());
        return ili2Def;
    }
    
    // ASSERT: not yet seen model
    
    if(translatedMdef!=null && fileMap.containsKey(translatedMdef.getFileName())) {
        // model in additional language
        // translated model in same file?
        if(mdef.getFileName().equals(translatedMdef.getFileName())) {
            // already seen file
            ch.ehi.interlis.modeltopicclass.INTERLIS2Def ili2Def= (ch.ehi.interlis.modeltopicclass.INTERLIS2Def)fileMap.get(translatedMdef.getFileName());
            return ili2Def;
        }else {
            // different file
            ch.ehi.interlis.modeltopicclass.INTERLIS2Def ili2Def= (ch.ehi.interlis.modeltopicclass.INTERLIS2Def)fileMap.get(translatedMdef.getFileName());
            ili2Def.setName(new NlsString(ili2Def.getName(),language,filename));
            fileMap.put(mdef.getFileName(),ili2Def);
            return ili2Def;
        }
    }
    
    // new file
    ch.ehi.interlis.modeltopicclass.INTERLIS2Def ili2Def=new ch.ehi.interlis.modeltopicclass.INTERLIS2Def();
    ili2Def.setVersion(new Double(mdef.getIliVersion()).doubleValue());
    ili2Def.setName(new NlsString(language,filename));
    fileMap.put(mdef.getFileName(),ili2Def);
    ili2modelset.addOwnedElement(ili2Def);
    return ili2Def;
  }

  private java.util.HashMap modelMap=new java.util.HashMap();
  private ch.ehi.interlis.modeltopicclass.ModelDef findModelDef(Model model)
  {
    if(modelMap.containsKey(model)){
      return (ch.ehi.interlis.modeltopicclass.ModelDef)modelMap.get(model);
    }
    ch.ehi.interlis.modeltopicclass.ModelDef modelDef=new ch.ehi.interlis.modeltopicclass.ModelDef();
    modelMap.put(model,modelDef);
    return modelDef;
  }
  private java.util.HashMap topicMap=new java.util.HashMap();
  private ch.ehi.interlis.modeltopicclass.TopicDef findTopicDef(Topic topic)
  {
    if(topicMap.containsKey(topic)){
      return (ch.ehi.interlis.modeltopicclass.TopicDef)topicMap.get(topic);
    }
    ch.ehi.interlis.modeltopicclass.TopicDef topicDef=new ch.ehi.interlis.modeltopicclass.TopicDef();
    topicMap.put(topic,topicDef);
    return topicDef;
  }

  private java.util.HashMap<GraphicParameterDef,ch.ehi.interlis.graphicdescriptions.GraphicParameterDef> gfxParamMap=new java.util.HashMap<GraphicParameterDef,ch.ehi.interlis.graphicdescriptions.GraphicParameterDef>();
  private ch.ehi.interlis.graphicdescriptions.GraphicParameterDef findGraphicParameterDef(GraphicParameterDef gfxParam)
  {
    if(gfxParamMap.containsKey(gfxParam)){
      return gfxParamMap.get(gfxParam);
    }
    ch.ehi.interlis.graphicdescriptions.GraphicParameterDef gfxParamDef=new ch.ehi.interlis.graphicdescriptions.GraphicParameterDef();
    gfxParamMap.put(gfxParam,gfxParamDef);
    return gfxParamDef;
  }

  private java.util.HashMap<MetaDataUseDef,ch.ehi.interlis.metaobjects.MetaDataUseDef> metaDataUseDefMap=new java.util.HashMap<MetaDataUseDef,ch.ehi.interlis.metaobjects.MetaDataUseDef>();
  private ch.ehi.interlis.metaobjects.MetaDataUseDef findMetaDataUseDef(MetaDataUseDef mu) {
      if(metaDataUseDefMap.containsKey(mu)){
          return metaDataUseDefMap.get(mu);
        }
      ch.ehi.interlis.metaobjects.MetaDataUseDef muDef=new ch.ehi.interlis.metaobjects.MetaDataUseDef();
        metaDataUseDefMap.put(mu,muDef);
        return muDef;
  }
  private java.util.HashMap viewableMap=new java.util.HashMap();
  private ch.ehi.uml1_4.foundation.core.Classifier findViewable(Viewable table)
  {
    if(viewableMap.containsKey(table)){
      return (ch.ehi.uml1_4.foundation.core.Classifier)viewableMap.get(table);
    }
    throw new IllegalStateException("this Viewbale not yet seen");
  }

  private ch.ehi.interlis.modeltopicclass.ClassDef findClassDef(Table table)
  {
    if(viewableMap.containsKey(table)){
      return (ch.ehi.interlis.modeltopicclass.ClassDef)viewableMap.get(table);
    }
    ch.ehi.interlis.modeltopicclass.ClassDef classDef=new ch.ehi.interlis.modeltopicclass.ClassDef();
    viewableMap.put(table,classDef);
    return classDef;
  }
  private java.util.Map<AttributeDef, ch.ehi.interlis.attributes.AttributeDef> attributeMap=new HashMap<AttributeDef, ch.ehi.interlis.attributes.AttributeDef>();
  private ch.ehi.interlis.attributes.AttributeDef findAttributeDef(AttributeDef attr) {
      if(attributeMap.containsKey(attr)){
          return attributeMap.get(attr);
        }
      ch.ehi.interlis.attributes.AttributeDef attrDef=new ch.ehi.interlis.attributes.AttributeDef();
        attributeMap.put(attr,attrDef);
        return attrDef;
  }
  private java.util.Map<RoleDef, ch.ehi.interlis.associations.RoleDef> roleMap=new HashMap<RoleDef, ch.ehi.interlis.associations.RoleDef>();
  private ch.ehi.interlis.associations.RoleDef findRoleDef(RoleDef role) {
      if(roleMap.containsKey(role)){
          return roleMap.get(role);
        }
      ch.ehi.interlis.associations.RoleDef roleDef=new ch.ehi.interlis.associations.RoleDef();
        roleMap.put(role,roleDef);
        return roleDef;
  }
  private java.util.Map<AttributeDef, ch.ehi.interlis.associations.RoleDef> attr2destRole=new HashMap<AttributeDef, ch.ehi.interlis.associations.RoleDef>();
  private ch.ehi.interlis.associations.RoleDef findDestRoleDef(AttributeDef attr) {
        if (attr2destRole.containsKey(attr)) {
            return attr2destRole.get(attr);
        }
        ch.ehi.interlis.associations.RoleDef roleDef = new ch.ehi.interlis.associations.RoleDef();
        attr2destRole.put(attr, roleDef);
        return roleDef;
    }
  private java.util.Map<AttributeDef, ch.ehi.interlis.associations.RoleDef> attr2srcRole=new HashMap<AttributeDef, ch.ehi.interlis.associations.RoleDef>();
  private ch.ehi.interlis.associations.RoleDef findSrcRoleDef(AttributeDef attr) {
        if (attr2srcRole.containsKey(attr)) {
            return attr2srcRole.get(attr);
        }
        ch.ehi.interlis.associations.RoleDef roleDef = new ch.ehi.interlis.associations.RoleDef();
        attr2srcRole.put(attr, roleDef);
        return roleDef;
    }
  private java.util.Map<AttributeDef, ch.ehi.interlis.associations.AssociationDef> attr2assoc=new HashMap<AttributeDef, ch.ehi.interlis.associations.AssociationDef>();
  private ch.ehi.interlis.associations.AssociationDef findAssociationDef(AttributeDef attr) {
      if (attr2assoc.containsKey(attr)) {
          return attr2assoc.get(attr);
      }
      ch.ehi.interlis.associations.AssociationDef assocDef = new ch.ehi.interlis.associations.AssociationDef();
      attr2assoc.put(attr, assocDef);
      return assocDef;
  }

  private ch.ehi.interlis.associations.AssociationDef findAssociationDef(AssociationDef assoc)
  {
    if(viewableMap.containsKey(assoc)){
      return (ch.ehi.interlis.associations.AssociationDef)viewableMap.get(assoc);
    }
    ch.ehi.interlis.associations.AssociationDef assocDef=new ch.ehi.interlis.associations.AssociationDef();
    viewableMap.put(assoc,assocDef);
    return assocDef;
  }

  private ch.ehi.interlis.views.ViewDef findViewDef(View view)
  {
    if(viewableMap.containsKey(view)){
      return (ch.ehi.interlis.views.ViewDef)viewableMap.get(view);
    }
    ch.ehi.interlis.views.ViewDef viewDef=new ch.ehi.interlis.views.ViewDef();
    viewableMap.put(view,viewDef);
    return viewDef;
  }

  private ch.ehi.interlis.views.ViewProjectionDef findViewProjectionDef(Projection proj)
  {
    if(viewableMap.containsKey(proj)){
      return (ch.ehi.interlis.views.ViewProjectionDef)viewableMap.get(proj);
    }
    ch.ehi.interlis.views.ViewProjectionDef projDef=new ch.ehi.interlis.views.ViewProjectionDef();
    viewableMap.put(proj,projDef);
    return projDef;
  }

  private java.util.HashMap domainMap=new java.util.HashMap();
  private ch.ehi.interlis.domainsandconstants.DomainDef findDomainDef(Domain domain)
  {
    if(domainMap.containsKey(domain)){
      return (ch.ehi.interlis.domainsandconstants.DomainDef)domainMap.get(domain);
    }
    ch.ehi.interlis.domainsandconstants.DomainDef domainDef=new ch.ehi.interlis.domainsandconstants.DomainDef();
    domainMap.put(domain,domainDef);
    return domainDef;
  }
  private java.util.HashMap<Enumeration,ch.ehi.interlis.domainsandconstants.basetypes.Enumeration> enumMap=new java.util.HashMap<Enumeration,ch.ehi.interlis.domainsandconstants.basetypes.Enumeration>();
  private ch.ehi.interlis.domainsandconstants.basetypes.Enumeration findEnumeration(Enumeration enumIli) {
      if(enumMap.containsKey(enumIli)){
          return enumMap.get(enumIli);
        }
        ch.ehi.interlis.domainsandconstants.basetypes.Enumeration enumUml=new ch.ehi.interlis.domainsandconstants.basetypes.Enumeration();
        enumMap.put(enumIli,enumUml);
        return enumUml;
  }
  private java.util.HashMap<Enumeration.Element,ch.ehi.interlis.domainsandconstants.basetypes.EnumElement> enumEleMap=new java.util.HashMap<Enumeration.Element,ch.ehi.interlis.domainsandconstants.basetypes.EnumElement>();
  private ch.ehi.interlis.domainsandconstants.basetypes.EnumElement findEnumEle(Enumeration.Element eeIli) {
      if(enumEleMap.containsKey(eeIli)){
          return enumEleMap.get(eeIli);
        }
        ch.ehi.interlis.domainsandconstants.basetypes.EnumElement eeUml=new ch.ehi.interlis.domainsandconstants.basetypes.EnumElement();
        enumEleMap.put(eeIli,eeUml);
        return eeUml;
  }
  
  private java.util.HashMap<LineForm,ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef> lineFormTypeMap=new java.util.HashMap<LineForm,ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef>();
  private ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef findLineFormTypeDef(LineForm lineFormType)
  {
    if(lineFormTypeMap.containsKey(lineFormType)){
      return lineFormTypeMap.get(lineFormType);
    }
    ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef lineFormTypeDef=new ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef();
    lineFormTypeMap.put(lineFormType,lineFormTypeDef);
    return lineFormTypeDef;
  }
  private java.util.HashMap<Parameter,ParameterDef> paramMap=new java.util.HashMap<Parameter,ParameterDef>();
  private ParameterDef findParameterDef(Parameter par) {
      if(paramMap.containsKey(par)){
          return paramMap.get(par);
        }
        ParameterDef parDef=new ParameterDef();
        paramMap.put(par,parDef);
        return parDef;
  }
  
  private java.util.HashMap<Constraint,ConstraintDef> cnstrMap=new java.util.HashMap<Constraint,ConstraintDef>();
  private ConstraintDef findConstraintDef(Constraint constr) {
      if(cnstrMap.containsKey(constr)){
          return cnstrMap.get(constr);
        }
        ConstraintDef cDef=new ConstraintDef();
        cnstrMap.put(constr,cDef);
        return cDef;
  }
  private java.util.HashMap<Unit,ch.ehi.interlis.units.UnitDef> unitMap=new java.util.HashMap<Unit,ch.ehi.interlis.units.UnitDef>();
  private ch.ehi.interlis.units.UnitDef findUnitDef(Unit unit)
  {
    if(unitMap.containsKey(unit)){
      return unitMap.get(unit);
    }
    ch.ehi.interlis.units.UnitDef unitDef=new ch.ehi.interlis.units.UnitDef();
    unitMap.put(unit,unitDef);
    return unitDef;
  }
  private java.util.HashMap<Function,ch.ehi.interlis.functions.FunctionDef> functionMap=new java.util.HashMap<Function,ch.ehi.interlis.functions.FunctionDef>();
  private ch.ehi.interlis.functions.FunctionDef findFunctionDef(Function f)
  {
    if(functionMap.containsKey(f)){
      return functionMap.get(f);
    }
    ch.ehi.interlis.functions.FunctionDef funcDef=new ch.ehi.interlis.functions.FunctionDef();
    functionMap.put(f,funcDef);
    return funcDef;
  }
  private java.util.HashMap<Graphic,ch.ehi.interlis.graphicdescriptions.GraphicDef> gfxMap=new java.util.HashMap<Graphic,ch.ehi.interlis.graphicdescriptions.GraphicDef>();
  private ch.ehi.interlis.graphicdescriptions.GraphicDef findGraphicDef(Graphic g)
  {
    if(gfxMap.containsKey(g)){
      return gfxMap.get(g);
    }
    ch.ehi.interlis.graphicdescriptions.GraphicDef gfxDef=new ch.ehi.interlis.graphicdescriptions.GraphicDef();
    gfxMap.put(g,gfxDef);
    return gfxDef;
  }


  private ch.ehi.interlis.modeltopicclass.TopicDef visitTopicDef(Topic topic)
  {
    if (topic == null)
      return null;
    EhiLogger.traceState(topic.getScopedName());

    ch.ehi.interlis.modeltopicclass.TopicDef topicdef=null;
    
    Topic translatedTopic=(Topic)getElementInRootLanguage(topic);
    if(translatedTopic!=null) {
        topicdef=findTopicDef(translatedTopic);
    }else {
        topicdef=findTopicDef(topic);
    }
    
    topicdef.setName(new NlsString(topicdef.getName(),modelLanguage,topic.getName()));

	// documentation
	String ilidoc=topic.getDocumentation();
	if(ilidoc!=null){
		topicdef.setDocumentation(new NlsString(topicdef.getDocumentation(),modelLanguage,ilidoc));
	}
	
	if(translatedTopic==null) {
	    // meta values
	    visitMetaValues(topicdef,topic.getMetaValues());

	    topicdef.setAbstract(topic.isAbstract());
	    topicdef.setPropFinal(topic.isFinal());
	    if(topic.isViewTopic()){
	      topicdef.setKind(ch.ehi.interlis.modeltopicclass.TopicDefKind.VIEW);
	    }else{
	      topicdef.setKind(ch.ehi.interlis.modeltopicclass.TopicDefKind.DATA);
	    }

	    Topic extending = (Topic) topic.getExtending();
	    if (extending != null)
	    {
	      ch.ehi.interlis.modeltopicclass.TopicDef parent=findTopicDef((Topic)getElementInRootLanguageOrSame(extending));
	      ch.ehi.interlis.modeltopicclass.TopicExtends topicextends=new ch.ehi.interlis.modeltopicclass.TopicExtends();
	      topicextends.attachParent(parent);
	      topicextends.attachChild(topicdef);
	    }

	    if(topic.getOid()!=null){
	      topicdef.attachOiddomain(findDomainDef((Domain)getElementInRootLanguageOrSame(topic.getOid())));
	    }
        if(topic.getBasketOid()!=null){
            topicdef.attachBasketoid(findDomainDef((Domain)getElementInRootLanguageOrSame(topic.getBasketOid())));
        }

	    Iterator it = topic.getDependentOn();
	    while(it.hasNext())
	    {
	      Topic depends=(Topic) it.next();
	      ch.ehi.interlis.modeltopicclass.TopicDef supplier=findTopicDef((Topic)getElementInRootLanguageOrSame(depends));
	      ch.ehi.interlis.modeltopicclass.TopicDepends topicdepends=new ch.ehi.interlis.modeltopicclass.TopicDepends();
	      topicdepends.addSupplier(supplier);
	      topicdepends.addClient(topicdef);
	    }


	    getNamespace().addOwnedElement(topicdef);
	}

    addNamespace(topicdef);
    visitElements(topic);
    removeNamespace();

    if(translatedTopic==null) {
        CreateDiagramUtility.classes(topicdef);
    }
	return topicdef;
  }



  private ch.ehi.interlis.modeltopicclass.ClassDef visitClassDef(Table tdef)
  {
      EhiLogger.traceState(tdef.getScopedName());
      
    ch.ehi.interlis.modeltopicclass.ClassDef classdef=null;
    Table translatedTdef=(Table)getElementInRootLanguage(tdef);
    if(translatedTdef!=null) {
        classdef=findClassDef(translatedTdef);
    }else {
        classdef=findClassDef(tdef);
    }
    
    classdef.setName(new NlsString(classdef.getName(),modelLanguage,tdef.getName()));

	// documentation
	String ilidoc=tdef.getDocumentation();
	if(ilidoc!=null){
		classdef.setDocumentation(new NlsString(classdef.getDocumentation(),modelLanguage,ilidoc));
	}
	
	if(translatedTdef==null) {
	    // meta values
	    visitMetaValues(classdef,tdef.getMetaValues());

	    classdef.setAbstract(tdef.isAbstract());
	    classdef.setPropFinal(tdef.isFinal());
	    if (tdef.isIdentifiable()){
	      classdef.setKind(ch.ehi.interlis.modeltopicclass.ClassDefKind.CLASS);
	    }else{
	      classdef.setKind(ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE);
	    }

	    Table extending = (Table) tdef.getExtending();
	    if (extending != null)
	    {
	      ch.ehi.interlis.modeltopicclass.ClassDef parent=findClassDef((Table)getElementInRootLanguageOrSame(extending));
	      ch.ehi.interlis.modeltopicclass.ClassExtends classextends=new ch.ehi.interlis.modeltopicclass.ClassExtends();
	      classextends.attachParent(parent);
	      classextends.attachChild(classdef);
	      classextends.setExtended(tdef.isExtended());
	    }

        if(tdef.getDefinedOid()!=null){
            classdef.attachOiddomain(findDomainDef((Domain)getElementInRootLanguageOrSame(tdef.getDefinedOid())));
          }

	    getNamespace().addOwnedElement(classdef);
	}
    addNamespace(classdef);
    visitElements(tdef);
    removeNamespace();

	return classdef;
  }

  private ch.ehi.interlis.associations.AssociationDef visitAssociationDef(AssociationDef assoc)
  {
      EhiLogger.traceState(assoc.getScopedName());
    ch.ehi.interlis.associations.AssociationDef assocdef=null;
    
    AssociationDef translatedAssoc=(AssociationDef)getElementInRootLanguage(assoc);
    if(translatedAssoc!=null) {
        assocdef=findAssociationDef(translatedAssoc);        
    }else {
        assocdef=findAssociationDef(assoc);
    }
    
    assocdef.setName(new NlsString(assocdef.getName(),modelLanguage,assoc.getName()));

	// documentation
	String ilidoc=assoc.getDocumentation();
	if(ilidoc!=null){
		assocdef.setDocumentation(new NlsString(assocdef.getDocumentation(),modelLanguage,ilidoc));
	}

	if(translatedAssoc==null) {
	    // meta values
	    visitMetaValues(assocdef,assoc.getMetaValues());
	    
	    assocdef.setAbstract(assoc.isAbstract());
	    assocdef.setPropFinal(assoc.isFinal());
	    //classdef.setKind(ch.ehi.interlis.modeltopicclass.ClassDefKind.CLASS);

	    AssociationDef extending = (AssociationDef) assoc.getExtending();
	    if (extending != null)
	    {
	      ch.ehi.interlis.associations.AssociationDef parent=findAssociationDef((AssociationDef)getElementInRootLanguageOrSame(extending));
	      ch.ehi.interlis.modeltopicclass.ClassExtends classextends=new ch.ehi.interlis.modeltopicclass.ClassExtends();
	      classextends.attachParent(parent);
	      classextends.attachChild(assocdef);
	      classextends.setExtended(assoc.isExtended());
	    }

	    // TODO handle DERIVED FROM in AssociationDef
	    //Viewable derived = (AssociationDef) assoc.getDerivedFrom();


	    getNamespace().addOwnedElement(assocdef);
	}
    addNamespace(assocdef);
    visitElements(assoc);
    removeNamespace();
	return assocdef;
  }


  private ch.ehi.interlis.views.ViewDef visitView (View view)
  {
    ch.ehi.interlis.views.ViewDef viewdef=null;
    View translatedView=(View)getElementInRootLanguage(view);
    if(translatedView!=null) {
        viewdef=findViewDef(translatedView);
    }else {
        viewdef=findViewDef(view);
    }
    
    viewdef.setName(new NlsString(viewdef.getName(),modelLanguage,view.getName()));
    
	// documentation
	String ilidoc=view.getDocumentation();
	if(ilidoc!=null){
		viewdef.setDocumentation(new NlsString(viewdef.getDocumentation(),modelLanguage,ilidoc));
	}

    makeSyntax.printView(view);
    viewdef.setSyntax(new NlsString(viewdef.getSyntax(),modelLanguage,getSyntax()));
    if(translatedView==null) {
        getNamespace().addOwnedElement(viewdef);
    }
    return viewdef;
  }



  private ch.ehi.interlis.graphicdescriptions.GraphicDef visitGraphic (Graphic graph)
  {
    ch.ehi.interlis.graphicdescriptions.GraphicDef gfxdef=null;
    Graphic translatedGraph=(Graphic)getElementInRootLanguage(graph);
    if(translatedGraph!=null) {
        gfxdef=findGraphicDef(translatedGraph);
    }else {
        gfxdef=findGraphicDef(graph);
    }

    
    gfxdef.setName(new NlsString(gfxdef.getName(),modelLanguage,graph.getName()));
    
	// documentation
	String ilidoc=graph.getDocumentation();
	if(ilidoc!=null){
		gfxdef.setDocumentation(new NlsString(gfxdef.getDocumentation(),modelLanguage,ilidoc));
	}

    makeSyntax.printGraphic(graph);
    gfxdef.setSyntax(new NlsString(gfxdef.getSyntax(),modelLanguage,getSyntax()));
    if(translatedGraph==null) {
        getNamespace().addOwnedElement(gfxdef);
    }
    return gfxdef;
  }





  private ch.ehi.interlis.units.UnitDef visitUnit (Unit u)
  {
    ch.ehi.interlis.units.UnitDef unitdef=null;
    
    Unit translatedU=(Unit)getElementInRootLanguage(u);
    if(translatedU!=null) {
        unitdef=findUnitDef(translatedU);
    }else {
        unitdef=findUnitDef(u);
    }
    
    
    unitdef.setName(new NlsString(unitdef.getName(),modelLanguage,u.getName()));
    
    if (!u.getDocName().equals(u.getName())) {
      unitdef.setDescName(new NlsString(unitdef.getDescName(),modelLanguage,u.getDocName()));
    }

	// documentation
	String ilidoc=u.getDocumentation();
	if(ilidoc!=null){
		unitdef.setDocumentation(new NlsString(unitdef.getDocumentation(),modelLanguage,ilidoc));
	}


    makeSyntax.printUnit(u.getContainer(),u);
    unitdef.setSyntax(new NlsString(unitdef.getSyntax(),modelLanguage,getSyntax()));
    if(translatedU==null) {
        getNamespace().addOwnedElement(unitdef);
    }
	return unitdef;

  }


  private void visitParameter (Parameter par)
  {
    ch.ehi.interlis.metaobjects.ParameterDef paramdef=null;
    
    Parameter translatedPar=(Parameter)getElementInRootLanguage(par);
    if(translatedPar!=null) {
        paramdef=findParameterDef(translatedPar);
    }else {
        paramdef=findParameterDef(par);
    }
    
    paramdef.setName(new NlsString(paramdef.getName(),modelLanguage,par.getName()));
	// documentation
	String ilidoc=par.getDocumentation();
	if(ilidoc!=null){
		paramdef.setDocumentation(new NlsString(paramdef.getDocumentation(),modelLanguage,ilidoc));
	}

    makeSyntax.printParameter(par.getContainer(),par);
    paramdef.setSyntax(new NlsString(paramdef.getSyntax(),modelLanguage,getSyntax()));
    if(translatedPar==null) {
        ((ch.ehi.interlis.modeltopicclass.ClassDef)getNamespace()).addParameterDef(paramdef);
    }
  }

private ch.ehi.interlis.graphicdescriptions.GraphicParameterDef visitRuntimeParameterDef (GraphicParameterDef par)
  {
    ch.ehi.interlis.graphicdescriptions.GraphicParameterDef pdef=null;
    GraphicParameterDef translatedPar=(GraphicParameterDef)getElementInRootLanguage(par);
    if(translatedPar!=null) {
        pdef=findGraphicParameterDef(translatedPar);
    }else {
        pdef=findGraphicParameterDef(par);
    }

    pdef.setName(new NlsString(pdef.getName(),modelLanguage,par.getName()));

	// documentation
	String ilidoc=par.getDocumentation();
	if(ilidoc!=null){
		pdef.setDocumentation(new NlsString(pdef.getDocumentation(),modelLanguage,ilidoc));
	}

    makeSyntax.printGraphicParameterDef(par);
    pdef.setSyntax(new NlsString(pdef.getSyntax(),modelLanguage,getSyntax()));
    if(translatedPar==null) {
        getNamespace().addOwnedElement(pdef);
    }
    return pdef;
  }
  private ch.ehi.interlis.metaobjects.MetaDataUseDef visitMetaDataUseDef(MetaDataUseDef mu)
  {
    
    MetaDataUseDef translatedMu=(MetaDataUseDef)getElementInRootLanguage(mu);
    ch.ehi.interlis.metaobjects.MetaDataUseDef mdef=null;
    if(translatedMu!=null) {
        mdef=findMetaDataUseDef(translatedMu);
    }else {
        mdef=findMetaDataUseDef(mu);
    }
    
    mdef.setName(new NlsString(mdef.getName(),modelLanguage,mu.getName()));
    
	// documentation
	String ilidoc=mu.getDocumentation();
	if(ilidoc!=null){
		mdef.setDocumentation(new NlsString(mdef.getDocumentation(),modelLanguage,ilidoc));
	}

	if(translatedMu==null) {
	    TransferDescription td=(TransferDescription)mu.getContainer(TransferDescription.class);
	    DataContainer basket=td.getMetaDataContainer(mu.getScopedName(null));
	    if(basket!=null){
	      mdef.setBasketOid(basket.getBoid());
	    }
	}
    makeSyntax.printMetaDataUseDef(mu);
    mdef.setSyntax(new NlsString(mdef.getSyntax(),modelLanguage,getSyntax()));
    if(translatedMu==null) {
        getNamespace().addOwnedElement(mdef);
    }
    return mdef;
  }
private void visitConstraint(Constraint constr)
  {
    ch.ehi.interlis.constraints.ConstraintDef cdef=null;
    
    Constraint translatedConstr=(Constraint)getElementInRootLanguage(constr);
    if(translatedConstr!=null) {
        cdef=findConstraintDef(translatedConstr);
    }else {
        cdef=findConstraintDef(constr);
    }
    cdef.setName(new NlsString(cdef.getName(),modelLanguage,constr.getName()));
    
    ch.ehi.interlis.constraints.ConstraintExpression expr=null;
    makeSyntax.printConstraint(constr);
    if(translatedConstr==null) {
        expr=new ch.ehi.interlis.constraints.ConstraintExpression();
        cdef.setBody(expr);
    }else {
        expr=(ch.ehi.interlis.constraints.ConstraintExpression)cdef.getBody();
    }
    expr.setSyntax(new NlsString(expr.getSyntax(),modelLanguage,getSyntax()));

	// documentation
	String ilidoc=constr.getDocumentation();
	if(ilidoc!=null){
		cdef.setDocumentation(new NlsString(cdef.getDocumentation(),modelLanguage,ilidoc));
	}

	if(translatedConstr==null) {
	    getNamespace().addConstraint(cdef);
	}
  }


private ch.ehi.uml1_4.foundation.datatypes.Multiplicity visitCardinality(Cardinality card)
  {
    ch.ehi.uml1_4.implementation.UmlMultiplicityRange mr=new ch.ehi.uml1_4.implementation.UmlMultiplicityRange();
    mr.setLower(card.getMinimum());
    mr.setUpper(card.getMaximum()!=Cardinality.UNBOUND ? card.getMaximum(): ch.ehi.uml1_4.implementation.UmlMultiplicityRange.UNBOUND);
    ch.ehi.uml1_4.implementation.UmlMultiplicity m= new ch.ehi.uml1_4.implementation.UmlMultiplicity();
    m.addRange(mr);

    return m;
  }
  private void visitAttribute(AttributeDef attrib,int attrIdx)
  {
    EhiLogger.traceState(attrib.getScopedName());
    ch.ehi.interlis.modeltopicclass.ClassDef classdef=null;
    AttributeDef translatedAttrib=(AttributeDef)getElementInRootLanguage(attrib);
    
    Type btype=attrib.getDomain();
    boolean isMultiValueAttr=false;
    if(btype instanceof CompositionType){
        if(unwrapMultiValueStructAttrs && isMultiValueAttributeWrapper(btype)){
            // map as a UML attribute (see further down)
            isMultiValueAttr=true;
        }else{
            // StructureAttribute
            CompositionType type=(CompositionType)btype;
            if(iliAttrsAsUmlAttrs){
                // map as a UML attribute (see further down)
            }else{
                ch.ehi.interlis.associations.AssociationDef assoc=null;
                if(translatedAttrib!=null) {
                    assoc=findAssociationDef(translatedAttrib);
                }else {
                    assoc=findAssociationDef(attrib);
                }
                ch.ehi.interlis.modeltopicclass.ClassDef dest=findClassDef((Table)getElementInRootLanguageOrSame((Table)type.getComponentType()));
                ch.ehi.uml1_4.foundation.core.Class thisclass=(ch.ehi.uml1_4.foundation.core.Class)getNamespace();
                assoc.setName(new NlsString(assoc.getName(),modelLanguage,thisclass.getDefLangName()+dest.getDefLangName()));
                ch.ehi.interlis.associations.RoleDef destRole=null;
                ch.ehi.interlis.associations.RoleDef srcRole=null;
                if(translatedAttrib!=null) {
                    destRole=findDestRoleDef(translatedAttrib);
                    srcRole=findSrcRoleDef(translatedAttrib);
                }else {
                    destRole=findDestRoleDef(attrib);
                    srcRole=findSrcRoleDef(attrib);
                }
                destRole.setName(new NlsString(destRole.getName(),modelLanguage,attrib.getName()));
                srcRole.setName(new NlsString(srcRole.getName(),modelLanguage,attrib.getContainer().getName()));
                // documentation
                String ilidoc=attrib.getDocumentation();
                if(ilidoc!=null){
                    destRole.setDocumentation(new NlsString(destRole.getDocumentation(),modelLanguage,ilidoc));
                }
                if(translatedAttrib==null) {
                    // meta values
                    visitMetaValues(destRole,attrib.getMetaValues());
                    destRole.attachParticipant(dest);
                    destRole.setMultiplicity(visitCardinality(type.getCardinality()));
                    destRole.setOrdering(type.isOrdered()?ch.ehi.uml1_4.foundation.datatypes.OrderingKind.ORDERED:ch.ehi.uml1_4.foundation.datatypes.OrderingKind.UNORDERED);
                    destRole.setIliAttributeIdx(attrIdx);
                    destRole.setPropExtended(attrib.getExtending()!=null);
                    assoc.addConnection(destRole);
                    srcRole.attachParticipant(thisclass);
                    srcRole.setAggregation(ch.ehi.uml1_4.foundation.datatypes.AggregationKind.COMPOSITE);
                    srcRole.setIliAttributeKind(ch.ehi.interlis.associations.AssociationAsIliAttrKind.STRUCTURE);
                    ch.ehi.uml1_4.implementation.UmlMultiplicityRange r=new ch.ehi.uml1_4.implementation.UmlMultiplicityRange();
                    r.setLower(0);
                    r.setUpper(1);
                    ch.ehi.uml1_4.implementation.UmlMultiplicity m=new ch.ehi.uml1_4.implementation.UmlMultiplicity();
                    m.addRange(r);
                    srcRole.setMultiplicity(m);
                    assoc.addConnection(srcRole);
                    java.util.Iterator rIt=type.iteratorRestrictedTo();
                    while(rIt.hasNext()){
                      destRole.addRestriction(findClassDef((Table)getElementInRootLanguageOrSame((Table)rIt.next())));
                    }
                    // TODO FunctionCall
                    // TODO AttributeValueUsage
                    thisclass.getNamespace().addOwnedElement(assoc);
                }
                return;
            }
        }
    }else if(btype instanceof ReferenceType){
        // ReferenceAttribute
        ch.ehi.interlis.associations.AssociationDef assoc=null;
        if(translatedAttrib!=null) {
            assoc=findAssociationDef(translatedAttrib);
        }else {
            assoc=findAssociationDef(attrib);
        }
        ReferenceType type=(ReferenceType)btype;
        ch.ehi.interlis.modeltopicclass.ClassDef dest=findClassDef((Table)getElementInRootLanguageOrSame((Table)type.getReferred()));
        ch.ehi.uml1_4.foundation.core.Class thisclass=(ch.ehi.uml1_4.foundation.core.Class)getNamespace();
        assoc.setName(new NlsString(assoc.getName(),modelLanguage,dest.getDefLangName()+thisclass.getDefLangName()));
        ch.ehi.interlis.associations.RoleDef destRole=null;
        ch.ehi.interlis.associations.RoleDef srcRole=null;
        if(translatedAttrib!=null) {
            destRole=findDestRoleDef(translatedAttrib);
            srcRole=findSrcRoleDef(translatedAttrib);
        }else {
            destRole=findDestRoleDef(attrib);
            srcRole=findSrcRoleDef(attrib);
        }
        destRole.setName(new NlsString(destRole.getName(),modelLanguage,attrib.getName()));
        srcRole.setName(new NlsString(srcRole.getName(),modelLanguage,attrib.getContainer().getName()));
        // documentation
        String ilidoc=attrib.getDocumentation();
        if(ilidoc!=null){
            destRole.setDocumentation(new NlsString(destRole.getDocumentation(),modelLanguage,ilidoc));
        }
        if(translatedAttrib==null) {
            // meta values
            visitMetaValues(destRole,attrib.getMetaValues());
            destRole.attachParticipant(dest);
            destRole.setIliAttributeIdx(attrIdx);
            ch.ehi.uml1_4.implementation.UmlMultiplicityRange r=new ch.ehi.uml1_4.implementation.UmlMultiplicityRange();
            r.setLower( btype.isMandatory() ? 1 : 0);
            r.setUpper(1);
            ch.ehi.uml1_4.implementation.UmlMultiplicity m=new ch.ehi.uml1_4.implementation.UmlMultiplicity();
            m.addRange(r);
            destRole.setMultiplicity(m);
            destRole.setPropExtended(attrib.getExtending()!=null);
            destRole.setPropExternal(type.isExternal());
            assoc.addConnection(destRole);
            srcRole.attachParticipant(thisclass);
            srcRole.setIliAttributeKind(ch.ehi.interlis.associations.AssociationAsIliAttrKind.REFERENCE);
            assoc.addConnection(srcRole);
            java.util.Iterator rIt=type.iteratorRestrictedTo();
            while(rIt.hasNext()){
              destRole.addRestriction(findClassDef((Table)getElementInRootLanguageOrSame((Table)rIt.next())));
            }
            // TODO FunctionCall
            // TODO AttributeValueUsage
            thisclass.getNamespace().addOwnedElement(assoc);
        }
        return;
    }

    ch.ehi.interlis.attributes.AttributeDef attrdef=null;
    if(translatedAttrib!=null) {
        attrdef=findAttributeDef(translatedAttrib);
    }else {
        attrdef=findAttributeDef(attrib);
    }
    attrdef.setName(new NlsString(attrdef.getName(),modelLanguage,attrib.getName()));
    
    // documentation
    String ilidoc=attrib.getDocumentation();
    if(ilidoc!=null){
        attrdef.setDocumentation(new NlsString(attrdef.getDocumentation(),modelLanguage,ilidoc));
    }
    // TODO FunctionCall
    // TODO AttributeValueUsage
    // TODO Constant
    makeSyntax.printAttributeBasePath(attrib.getContainer(),attrib);
    String ilitxt=ch.ehi.basics.tools.StringUtility.purge(getSyntax());
    if(ilitxt!=null){
        ch.ehi.interlis.attributes.AttributeValueUsage value=null;
        if(attrdef.containsAttributeValueUsage()) {
            value=attrdef.getAttributeValueUsage();
        }else {
            value=new ch.ehi.interlis.attributes.AttributeValueUsage();
            attrdef.attachAttributeValueUsage(value);
        }
        value.setSyntax(new NlsString(value.getSyntax(),modelLanguage,ilitxt));
    }
    
    if(translatedAttrib==null) {
        attrdef.setAbstract(attrib.isAbstract());
        attrdef.setPropFinal(attrib.isFinal());
        attrdef.setPropExtended(attrib.getExtending()!=null);
        attrdef.setPropTransient(attrib.isTransient());
        
        // meta values
        visitMetaValues(attrdef,attrib.getMetaValues());
    }
    
    ch.ehi.interlis.attributes.AttrType battrtype=null;
    ch.ehi.uml1_4.foundation.datatypes.Multiplicity m=null;
    if(btype instanceof CompositionType){
        if(unwrapMultiValueStructAttrs && isMultiValueAttr){
            // normales ili Attribut in Wrapper
            // ASSERT isMultiValueAttributeWrapper(btype)
            ch.ehi.interlis.attributes.DomainAttribute attrtype=new ch.ehi.interlis.attributes.DomainAttribute();
            battrtype=attrtype;
            if(translatedAttrib==null) {
                CompositionType type=(CompositionType)btype;
                attrdef.setOrdering(type.isOrdered() ?  OrderingKind.ORDERED : OrderingKind.UNORDERED);
                m=visitCardinality(type.getCardinality());
                LocalAttribute wrappedValue=(LocalAttribute) type.getComponentType().getElement(LocalAttribute.class, TransferFromUmlMetamodel.VALUE_ATTR);
                TypeAlias wrappedValueType=(TypeAlias)wrappedValue.getDomain();  // Type vom value Attribut innerhalb der Struktur
                attrtype.attachDomainDef(findDomainDef((Domain)getElementInRootLanguageOrSame(wrappedValueType.getAliasing())));
            }
        }else if(iliAttrsAsUmlAttrs){
            CompositionType type=(CompositionType)btype;
            ch.ehi.interlis.attributes.DomainAttribute attrtype=new ch.ehi.interlis.attributes.DomainAttribute();
            battrtype=attrtype;
            if(translatedAttrib==null) {
                ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType structAttrType=new ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType();
                attrdef.setOrdering(type.isOrdered() ?  OrderingKind.ORDERED : OrderingKind.UNORDERED);
                if(type.getComponentType()!=ilibase.ANYSTRUCTURE){
                    structAttrType.attachParticipant(findClassDef((Table)getElementInRootLanguageOrSame(type.getComponentType())));
                }
                java.util.Iterator rIt=type.iteratorRestrictedTo();
                while(rIt.hasNext()){
                    structAttrType.addRestrictedTo(findClassDef((Table)getElementInRootLanguageOrSame((Table)rIt.next())));
                }
                attrtype.attachDirect(structAttrType);
                m=visitCardinality(type.getCardinality());
            }
        }
    }else{
        // normales ili Attribut
        if (attrib instanceof LocalAttribute){
            // DomainAttribute
            ch.ehi.interlis.attributes.DomainAttribute attrtype=new ch.ehi.interlis.attributes.DomainAttribute();
            battrtype=attrtype;
            // BOOLEAN, HALIGNMENT, VALIGNMENT, NAME, URI are represented as TypeAlias in ili2c
            // resolve them first
            if(btype instanceof TypeAlias){
              Domain predefinedBaseDomain=((TypeAlias) btype).getAliasing();
              if(predefinedBaseDomain==ilibase.BOOLEAN
                  || predefinedBaseDomain==ilibase.HALIGNMENT
                  || predefinedBaseDomain==ilibase.VALIGNMENT
                  || predefinedBaseDomain==ilibase.NAME
                  || predefinedBaseDomain==ilibase.URI
                  ){
                final ch.ehi.interlis.domainsandconstants.Type umlType = visitType(attrib.getContainer(),predefinedBaseDomain.getType());
                if(translatedAttrib==null) {
                    attrtype.attachDirect(umlType);
                }
              }else{
                  TypeAlias type=(TypeAlias)btype;
                  if(translatedAttrib==null) {
                      attrtype.attachDomainDef(findDomainDef((Domain)getElementInRootLanguageOrSame(type.getAliasing())));
                  }
              }
            }else{
              if(btype!=null){
                final ch.ehi.interlis.domainsandconstants.Type umlType = visitType(attrib.getContainer(),btype);
                if(translatedAttrib==null) {
                    attrtype.attachDirect(umlType);
                }
              }
            }
        }
        m = visitCardinality(btype.getCardinality());
        attrdef.setOrdering(btype.isOrdered() ?  OrderingKind.ORDERED : OrderingKind.UNORDERED);
    }
    
    if(translatedAttrib==null) {
        attrdef.setMultiplicity(m);
        attrdef.attachAttrType(battrtype);
        ((ch.ehi.uml1_4.foundation.core.Classifier)getNamespace()).addFeature(attrdef);
    }
  }

private boolean isMultiValueAttributeWrapper(Type btype) {
	if(!(btype instanceof CompositionType)){
		return false;
	}
	CompositionType type=(CompositionType)btype;
	Table table=type.getComponentType();
	// check that only one attribute named "value"
	Iterator<ViewableTransferElement> attrIter=table.getAttributesAndRoles2();
	if(!attrIter.hasNext()){
		// keine Attribute
		return false;
	}
	ViewableTransferElement attr=attrIter.next();
	if(attrIter.hasNext()){
		// mehr als ein Attribut
		return false;
	}
	if(!(attr.obj instanceof LocalAttribute)){
		// kein Attribut, sondern RoleDef
		return false;
	}
	LocalAttribute a=(LocalAttribute)attr.obj;
	if(!a.getName().equals(TransferFromUmlMetamodel.VALUE_ATTR)){
		// Attribut hat falschen Namen
		return false;
	}
	// check that type of attribute is a Domain
	if(!(a.getDomain() instanceof TypeAlias)){
		return false;
	}
	TypeAlias attrType=(TypeAlias)a.getDomain();
	// check that Domain name is derived from the structure name
	if(!table.getName().equals(attrType.getAliasing().getName()+"_")){
		return false;
	}
	return true;
}
private void visitRoleDef(RoleDef role)
  {
    EhiLogger.traceState(role.getScopedName());

    RoleDef translatedRole=(RoleDef)getElementInRootLanguage(role);
    ch.ehi.interlis.associations.RoleDef roledef=null;
    if(translatedRole!=null) {
        roledef=findRoleDef(translatedRole);
    }else {
        roledef=findRoleDef(role);
    }
    roledef.setName(new NlsString(roledef.getName(),modelLanguage,role.getName()));
    // documentation
    String ilidoc=role.getDocumentation();
    if(ilidoc!=null){
        roledef.setDocumentation(new NlsString(roledef.getDocumentation(),modelLanguage,ilidoc));
    }
    if(translatedRole==null) {
        
        // meta values
        visitMetaValues(roledef,role.getMetaValues());

        roledef.setAbstract(role.isAbstract());
        roledef.setPropFinal(role.isFinal());
        roledef.setPropExternal(role.isExternal());
        roledef.setPropExtended(role.getExtending()!=null);
        roledef.setOrdering(role.isOrdered()
          ? ch.ehi.uml1_4.foundation.datatypes.OrderingKind.ORDERED
          : ch.ehi.uml1_4.foundation.datatypes.OrderingKind.UNORDERED);
        switch(role.getKind()){
          case RoleDef.Kind.eASSOCIATE:
            roledef.setAggregation(ch.ehi.uml1_4.foundation.datatypes.AggregationKind.NONE);
            break;
          case RoleDef.Kind.eAGGREGATE:
            roledef.setAggregation(ch.ehi.uml1_4.foundation.datatypes.AggregationKind.AGGREGATE);
            break;
          case RoleDef.Kind.eCOMPOSITE:
            roledef.setAggregation(ch.ehi.uml1_4.foundation.datatypes.AggregationKind.COMPOSITE);
            break;
        }
        if(role.getCardinality()!=null){
          roledef.setMultiplicity(visitCardinality(role.getCardinality()));
        }
        Iterator ri=role.iteratorReference();
        if(ri.hasNext()){
            ReferenceType first=(ReferenceType)ri.next();
            roledef.attachParticipant(findViewable((Viewable)getElementInRootLanguageOrSame(first.getReferred())));
            Iterator resti=first.iteratorRestrictedTo();
            while(resti.hasNext()){
                AbstractClassDef rest=(AbstractClassDef)resti.next();
                roledef.addRestriction((ch.ehi.interlis.modeltopicclass.AbstractClassDef)findViewable((Viewable)getElementInRootLanguageOrSame(rest)));
            }
            while(ri.hasNext()){
                ReferenceType r=(ReferenceType)ri.next();
                ch.ehi.interlis.associations.Participant p=new ch.ehi.interlis.associations.Participant();
                roledef.addXorParticipant(p);
                p.attachParticipant((ch.ehi.interlis.modeltopicclass.AbstractClassDef)findViewable((Viewable)getElementInRootLanguageOrSame(r.getReferred())));
                resti=r.iteratorRestrictedTo();
                while(resti.hasNext()){
                    AbstractClassDef rest=(AbstractClassDef)resti.next();
                    p.addRestriction((ch.ehi.interlis.modeltopicclass.AbstractClassDef)findViewable((Viewable)getElementInRootLanguageOrSame(rest)));
                }
            }
        }
        // TODO handle derived from in RoleDef

        ((ch.ehi.uml1_4.foundation.core.Association)getNamespace()).addConnection(roledef);
    }
  }

private void updateMappingToPredefinedModel(ch.ehi.uml1_4.modelmanagement.Package root){
    // does ModelDef "INTERLIS" exist in repository?
    if(!ch.ehi.uml1_4.tools.NamespaceUtility.deepContainsOwnedElement(
        root,ch.ehi.interlis.modeltopicclass.ModelDef.class,ilibase.getName())){
        // no need to link ili2c modelelemts to corresponding elements in repository
        return;
    }
    
    // user may have moved ModelDef "INTERLIS" away from INTERLIS2Def "predefined",
    // therefore do not try to find INTERLIS2Def "predefined"
    // ch.ehi.interlis.modeltopicclass.INTERLIS2Def ili2Def=(ch.ehi.interlis.modeltopicclass.INTERLIS2Def)ch.ehi.uml1_4.tools.NamespaceUtility.deepGetOwnedElement(
    //    root,ch.ehi.interlis.modeltopicclass.INTERLIS2Def.class,getPredefinedName());
    // fileMap.put(getPredefinedName(),ili2Def);

    ch.ehi.interlis.modeltopicclass.ModelDef modelDef=(ch.ehi.interlis.modeltopicclass.ModelDef)ch.ehi.uml1_4.tools.NamespaceUtility.deepGetOwnedElement(
        root,ch.ehi.interlis.modeltopicclass.ModelDef.class,ilibase.getName());
    modelMap.put(ilibase,modelDef);
    Iterator it = ilibase.iterator();
    while (it.hasNext()) {
      ch.interlis.ili2c.metamodel.Element elt = (ch.interlis.ili2c.metamodel.Element) it.next();
      if (elt instanceof Unit)
      {
        ch.ehi.interlis.units.UnitDef unitDef=(ch.ehi.interlis.units.UnitDef)ch.ehi.uml1_4.tools.NamespaceUtility.deepGetOwnedElement(
          modelDef,ch.ehi.interlis.units.UnitDef.class,elt.getName());
        unitMap.put((Unit)elt,unitDef);
      }
      else if (elt instanceof Function)
      {
        ch.ehi.interlis.functions.FunctionDef funcDef=(ch.ehi.interlis.functions.FunctionDef)ch.ehi.uml1_4.tools.NamespaceUtility.deepGetOwnedElement(
          modelDef,ch.ehi.interlis.functions.FunctionDef.class,elt.getName());
        functionMap.put((Function)elt,funcDef);
      }
      else if (elt instanceof Domain)
      {
        ch.ehi.interlis.domainsandconstants.DomainDef domainDef=(ch.ehi.interlis.domainsandconstants.DomainDef)ch.ehi.uml1_4.tools.NamespaceUtility.deepGetOwnedElement(
          modelDef,ch.ehi.interlis.domainsandconstants.DomainDef.class,elt.getName());
        domainMap.put((Domain)elt,domainDef);
      }
      else if (elt instanceof Table)
      {
        if (!((Table) elt).isImplicit ())
        {
        ch.ehi.interlis.modeltopicclass.ClassDef classDef=(ch.ehi.interlis.modeltopicclass.ClassDef)ch.ehi.uml1_4.tools.NamespaceUtility.deepGetOwnedElement(
          modelDef,ch.ehi.interlis.modeltopicclass.ClassDef.class,elt.getName());
        viewableMap.put((Table)elt,classDef);
        }
      }

    }

  }

  private String getPredefinedName(){
    return "<"+rsrc.getString("CTpredefinedModel")+">";
  }

  private String modelLanguage="";
  private ch.ehi.interlis.modeltopicclass.ModelDef visitModel (Model mdef)
  {
    Iterator it;
    if(mdef==ilibase && modelMap.containsKey(mdef)){
    	return null;
    }
    EhiLogger.traceState(mdef.getScopedName());
    
    Model translatedModel=(Model)getElementInRootLanguage(mdef);
    ch.ehi.interlis.modeltopicclass.ModelDef model=null;
    if(translatedModel!=null) {
        model=findModelDef(translatedModel);
    }else {
        model=findModelDef(mdef);
    }

    // language
    modelLanguage="";
    if(mdef.getLanguage()!=null){
        modelLanguage=mdef.getLanguage();
    }
    if(translatedModel==null) {
        model.setBaseLanguage(modelLanguage);
    }else {
        Translation translation=new Translation();
        translation.setBaseLanguage(translatedModel.getLanguage());
        translation.setLanguage(mdef.getLanguage());
        model.addTranslation(translation);
    }

    model.setName(new NlsString(model.getName(),modelLanguage,mdef.getName()));
	
	// documentation
	String ilidoc=mdef.getDocumentation();
	if(ilidoc!=null){
		model.setDocumentation(new NlsString(model.getDocumentation(),modelLanguage,ilidoc));
	}
	
	// meta values
    if(translatedModel==null) {
        visitMetaValues(model,mdef.getMetaValues());
    }
	
    // kind
    if(translatedModel==null) {
        if(mdef instanceof DataModel){
            model.setKind(ch.ehi.interlis.modeltopicclass.ModelDefKind.DATA);
          }else if(mdef instanceof TypeModel){
            model.setKind(ch.ehi.interlis.modeltopicclass.ModelDefKind.TYPE);
          }else if(mdef instanceof RefSystemModel){
            model.setKind(ch.ehi.interlis.modeltopicclass.ModelDefKind.REFSYSTEM);
          }else if(mdef instanceof SymbologyModel){
            model.setKind(ch.ehi.interlis.modeltopicclass.ModelDefKind.SYMBOLOGY);
          }
    }

	// version
	model.setVersion(new NlsString(model.getVersion(),modelLanguage,mdef.getModelVersion()));
	String verCmt=mdef.getModelVersionExpl();
	if(verCmt!=null){
		model.setVersionComment(new NlsString(model.getVersionComment(),modelLanguage,verCmt));
	}
	
	// issuer
	model.setIssuerURI(new NlsString(model.getIssuerURI(),modelLanguage,mdef.getIssuer()));
	
    // contracts
    if(translatedModel==null) {
        model.setContracted(mdef.isContracted());
    }

    // imports
    if(false){
        // pre 3.8.0
        if(translatedModel==null) {
            Importable[] imported = mdef.getImporting ();
            if (imported.length > 0)
            {
              for (int i = 0; i < imported.length; i++)
              {
                Model curImport = (Model) imported[i];
                if(curImport!=ilibase){
                    ch.ehi.interlis.modeltopicclass.ModelDef supplier=findModelDef((Model)getElementInRootLanguageOrSame(curImport));
                    ch.ehi.interlis.modeltopicclass.IliImport iliimport=new ch.ehi.interlis.modeltopicclass.IliImport();
                    iliimport.addSupplier(supplier);
                    iliimport.addClient(model);
                    if(curImport.getLanguage()!=null) {
                        iliimport.setLanguage(curImport.getLanguage());
                    }
                }
              }
            }
        }else {
            // TODO update IliImport's with supplierLanguage+clientLanguage
        }
    }else{
        Importable[] imported = mdef.getImporting ();
        if (imported.length > 0)
        {
          for (int i = 0; i < imported.length; i++)
          {
            Model curImport = (Model) imported[i];
            if(curImport!=ilibase){
                if(translatedModel==null) {
                    ch.ehi.interlis.modeltopicclass.ModelDef supplier=findModelDef((Model)getElementInRootLanguageOrSame(curImport));
                    ch.ehi.interlis.modeltopicclass.IliImport iliimport=new ch.ehi.interlis.modeltopicclass.IliImport();
                    iliimport.addSupplier(supplier);
                    iliimport.addClient(model);
                    iliimport.addImportLanguage(mdef.getLanguage(),curImport.getLanguage());
                }else {
                    ch.ehi.interlis.modeltopicclass.ModelDef supplier=findModelDef((Model)getElementInRootLanguageOrSame(curImport));
                    ch.ehi.interlis.modeltopicclass.IliImport iliimport=model.getImport(supplier);
                    iliimport.addImportLanguage(mdef.getLanguage(),curImport.getLanguage());
                }
            }
          }
        }
    }

    ch.ehi.interlis.modeltopicclass.INTERLIS2Def ili2def=null;
    if(mdef==ilibase){
      ili2def=visitINTERLIS2Def(modelLanguage,getPredefinedName(),mdef);
    }else{
     File cache=new File(System.getProperty("user.home"),".ilicache");
     File ilifile=new File(mdef.getFileName());
     String iliFileName=ilifile.getName();
     if(ilifile.getAbsoluteFile().getParent().startsWith(cache.getAbsolutePath())){
         iliFileName="<"+iliFileName+">";
     }
      ili2def=visitINTERLIS2Def(modelLanguage,iliFileName,mdef);
    }
    
    if(translatedModel==null) {
        ili2def.addOwnedElement(model);
    }
    addNamespace(model);
    visitElements (mdef);
    if(translatedModel==null) {
        CreateDiagramUtility.topicOverview(model);
    }
    removeNamespace();
	return model;
  }
  private static Element getElementInRootLanguage(Element ele) {
      Element baseLanguageElement = ele.getTranslationOf();
      if (baseLanguageElement == null) {
          return null;
      }
      while (baseLanguageElement != null) {
          ele = baseLanguageElement;
          baseLanguageElement = ele.getTranslationOf();
      }
      return ele;
  }
  private static Element getElementInRootLanguageOrSame(Element ele) {
      Element baseLanguageElement = ele.getTranslationOf();
      if (baseLanguageElement == null) {
          return ele;
      }
      while (baseLanguageElement != null) {
          ele = baseLanguageElement;
          baseLanguageElement = ele.getTranslationOf();
      }
      return ele;
  }
  private Enumeration.Element getElementInRootLanguage(Enumeration.Element ele) {
      Enumeration.Element baseLanguageElement = ele.getTranslationOf();
      if (baseLanguageElement == null) {
          return null;
      }
      while (baseLanguageElement != null) {
          ele = baseLanguageElement;
          baseLanguageElement = ele.getTranslationOf();
      }
      return ele;
  }

  private void visitMetaValues(ch.ehi.uml1_4.foundation.core.ModelElement ele,ch.ehi.basics.settings.Settings values)
  {
		if (values != null) {
			for (Iterator valuei = values.getValuesIterator(); valuei
					.hasNext();) {
				String name = (String) valuei.next();
				String value = values.getValue(name);
				ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue umlTag;
				umlTag = (ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue) ch.ehi.umleditor.application.ElementFactory
						.createObject(ch.ehi.uml1_4.implementation.UmlTaggedValue.class);
				umlTag.setName(new NlsString(TaggedValue.TAGGEDVALUE_LANG, TAGGEDVALUE_ILI_PREFIX
						+ name));
				umlTag.setDataValue(value);
				ele.addTaggedValue(umlTag);

			}
		}
  }
  private ch.ehi.interlis.domainsandconstants.DomainDef visitDomainDef (Domain dd)
  {
      EhiLogger.traceState(dd.getScopedName());
      
    ch.ehi.interlis.domainsandconstants.DomainDef domaindef=null;
    Domain translatedDd=(Domain)getElementInRootLanguage(dd);
    if(translatedDd!=null) {
        domaindef=findDomainDef(translatedDd);
    }else {
        domaindef=findDomainDef(dd);
    }
    
    
    domaindef.setName(new NlsString(domaindef.getName(),modelLanguage,dd.getName()));

	// documentation
	String ilidoc=dd.getDocumentation();
	if(ilidoc!=null){
		domaindef.setDocumentation(new NlsString(domaindef.getDocumentation(),modelLanguage,ilidoc));
	}
	
	if(translatedDd==null) {
	    // meta values
	    visitMetaValues(domaindef,dd.getMetaValues());
	    
	    domaindef.setAbstract(dd.isAbstract());
	    domaindef.setPropFinal(dd.isFinal());
	    // TODO handle MANDATORY DomainDef
	    //domaindef.setMandatory();

	    Domain extending = dd.getExtending();
	    if (extending != null)
	    {
	      ch.ehi.interlis.domainsandconstants.DomainDef parent=findDomainDef((Domain)getElementInRootLanguageOrSame(extending));
	      ch.ehi.interlis.domainsandconstants.DomainExtends domainextends=new ch.ehi.interlis.domainsandconstants.DomainExtends();
	      domainextends.attachParent(parent);
	      domainextends.attachChild(domaindef);
	    }

	}
	
    // BOOLEAN, HALIGNMENT, VALIGNMENT, NAME, URI are represented as TypeAlias in ili2c
    // resolve them first
    Type btype=dd.getType();
    if(btype instanceof TypeAlias){
      Type predefinedBaseType=btype.resolveAliases();
      if(predefinedBaseType==ilibase.BOOLEAN.getType()
          || predefinedBaseType==ilibase.HALIGNMENT.getType()
          || predefinedBaseType==ilibase.VALIGNMENT.getType()
          || predefinedBaseType==ilibase.NAME.getType()
          || predefinedBaseType==ilibase.URI.getType()
          ){
        btype=predefinedBaseType;
      }
    }
    ch.ehi.interlis.domainsandconstants.Type type=visitType(dd.getContainer(),btype);
    
    if(translatedDd==null) {
        domaindef.attachType(type);
        getNamespace().addOwnedElement(domaindef);
    }

    // visit the constraints defined on this domain
    addNamespace(domaindef);
    visitElements(dd);
    removeNamespace();

    return domaindef;
  }

  private ch.ehi.interlis.domainsandconstants.Type visitType(Container scope,Type dd)
  {
    ch.ehi.interlis.domainsandconstants.Type ret=null;

    // BOOLEAN, HALIGNMENT, VALIGNMENT, NAME, URI are represented as TypeAlias in ili2c
    if(dd==ilibase.BOOLEAN.getType()){
      ret=new ch.ehi.interlis.domainsandconstants.basetypes.BooleanType();
    }else if(dd==ilibase.HALIGNMENT.getType()){
      ret=new ch.ehi.interlis.domainsandconstants.basetypes.HorizAlignment();
    }else if(dd==ilibase.VALIGNMENT.getType()){
      ret=new ch.ehi.interlis.domainsandconstants.basetypes.VertAlignment();
    }else if(dd==ilibase.NAME.getType()){
      ch.ehi.interlis.domainsandconstants.basetypes.Text text=new ch.ehi.interlis.domainsandconstants.basetypes.Text();
      ret=text;
      text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.NAME);
    }else if(dd==ilibase.URI.getType()){
      ch.ehi.interlis.domainsandconstants.basetypes.Text text=new ch.ehi.interlis.domainsandconstants.basetypes.Text();
      ret=text;
      text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.URI);
    }else if (dd instanceof NumericType){
      return visitNumericalType (scope,(NumericType) dd);
    }else if (dd instanceof TextType){
      int len = ((TextType) dd).getMaxLength();
      ch.ehi.interlis.domainsandconstants.basetypes.Text text=new ch.ehi.interlis.domainsandconstants.basetypes.Text();
      ret=text;
      if (len != -1) {
        text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
        text.setMaxLength(len);
      }else{
        text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.UNDEFINED);
      }
		text.setMultiline(!((TextType) dd).isNormalized());
      // URI and NAME are represented as TypeAlias in ili2c

    }else if (dd instanceof EnumerationType){
      ch.ehi.interlis.domainsandconstants.basetypes.Enumeration enumeration;
      EnumerationType et = (EnumerationType) dd;
      EnumerationType translatedEt=(EnumerationType)getElementInRootLanguage(et);
      Enumeration translatedE=null;
      if(translatedEt!=null) {
          translatedE=translatedEt.getEnumeration();
      }
      enumeration=visitEnumeration(translatedE,et.getEnumeration());
      ret=enumeration;
      if (et.isCircular()){
    	  enumeration.setKind(ch.ehi.interlis.domainsandconstants.basetypes.EnumKind.CIRCULAR);
      }else if (et.isOrdered()){
    	  enumeration.setKind(ch.ehi.interlis.domainsandconstants.basetypes.EnumKind.ORDERED);
      }else{
    	  enumeration.setKind(ch.ehi.interlis.domainsandconstants.basetypes.EnumKind.UNDEFINED);
      }
    }else if (dd instanceof CoordType)
    {
      ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType coord=new ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType();
      ret=coord;
      coord.setGeneric(((CoordType) dd).isGeneric());
      NumericalType[] nts = ((CoordType) dd).getDimensions();
      for (int i = 0; i < nts.length; i++)
      {
        coord.addDim(visitNumericalType(scope,nts[i]));
      }

      int nullAxis = ((CoordType) dd).getNullAxis();
      int piHalfAxis = ((CoordType) dd).getPiHalfAxis();
      if (nullAxis != 0)
      {
        ch.ehi.interlis.domainsandconstants.basetypes.RotationDef rot=new ch.ehi.interlis.domainsandconstants.basetypes.RotationDef();
        rot.setNullAxis(nullAxis);
        rot.setPihalfAxis(piHalfAxis);
        coord.attachRotationDef(rot);
      }
    }
    else if (dd instanceof LineType)
    {
      LineType lt = (LineType) dd;
      ch.ehi.interlis.domainsandconstants.linetypes.LineType line=null;
      if (lt instanceof PolylineType){
        line=new ch.ehi.interlis.domainsandconstants.linetypes.IliPolyline();
        ((ch.ehi.interlis.domainsandconstants.linetypes.IliPolyline)line).setDirected(((PolylineType) lt).isDirected());
      } else if (lt instanceof MultiPolylineType) {
        line = new ch.ehi.interlis.domainsandconstants.linetypes.IliPolyline();
        ((ch.ehi.interlis.domainsandconstants.linetypes.IliPolyline) line).setDirected(((MultiPolylineType) lt).isDirected());
      } else if (lt instanceof SurfaceType || lt instanceof MultiSurfaceType) {
        line = new ch.ehi.interlis.domainsandconstants.linetypes.IndividualSurface();
      } else if (lt instanceof AreaType || lt instanceof MultiAreaType) {
        line = new ch.ehi.interlis.domainsandconstants.linetypes.Tesselation();
      }
      if (line != null) {
        line.setMulti(lt instanceof MultiSurfaceType || lt instanceof MultiAreaType || lt instanceof MultiPolylineType);
      }

      ret=line;


      LineForm[] lineForms = lt.getLineForms ();
      PrecisionDecimal maxOverlap = lt.getMaxOverlap ();
      Domain controlPointDomain = lt.getControlPointDomain ();
      Table lineAttributeStructure = null;


      if (lt instanceof SurfaceOrAreaType){
        lineAttributeStructure = ((SurfaceOrAreaType) lt).getLineAttributeStructure ();
      }

      if (lineForms.length > 0)
      {
        ch.ehi.interlis.domainsandconstants.linetypes.LineForm lf=new ch.ehi.interlis.domainsandconstants.linetypes.LineForm();
        line.attachLineForm(lf);
        for (int i = 0; i < lineForms.length; i++)
        {
          if(lineForms[i]==ilibase.ARCS){
            lf.setArcs(true);
          }else if(lineForms[i]==ilibase.STRAIGHTS){
            lf.setStraights(true);
          }else{
            lf.addLineFormTypeDef(findLineFormTypeDef((LineForm)getElementInRootLanguageOrSame(lineForms[i])));
          }
        }
      }


      if (controlPointDomain != null)
      {
        line.attachControlpoints(findDomainDef((Domain)getElementInRootLanguageOrSame(controlPointDomain)));
      }


      if (maxOverlap != null)
      {
        ch.ehi.interlis.domainsandconstants.linetypes.IntersectionDef is=new ch.ehi.interlis.domainsandconstants.linetypes.IntersectionDef();
        is.setMaxi(visitIliDim(maxOverlap));
        line.attachIntersectionDef(is);
      }



      if (lineAttributeStructure != null)
      {
        ((ch.ehi.interlis.domainsandconstants.linetypes.SurfaceType)line).attachLinAttrDef(findClassDef((Table)getElementInRootLanguageOrSame(lineAttributeStructure)));
      }
    }else if (dd instanceof OIDType){
      ch.ehi.interlis.domainsandconstants.basetypes.OidType oid=new ch.ehi.interlis.domainsandconstants.basetypes.OidType();
      ret=oid;
      if(dd instanceof AnyOIDType){
        oid.setKind(ch.ehi.interlis.domainsandconstants.basetypes.OidKind.ANY);
      }else if(dd instanceof TextOIDType){
        oid.setKind(ch.ehi.interlis.domainsandconstants.basetypes.OidKind.TEXT);
        Type textOidType=((OIDType)dd).getOIDType();
        if(textOidType instanceof TypeAlias) {
            textOidType=((TypeAlias)textOidType).resolveAliases();
        }
        oid.attachOiddomain((ch.ehi.interlis.domainsandconstants.basetypes.BaseType)visitType(scope,textOidType));
      }else if(dd instanceof NumericOIDType){
        oid.setKind(ch.ehi.interlis.domainsandconstants.basetypes.OidKind.NUMERIC);
        oid.attachOiddomain((ch.ehi.interlis.domainsandconstants.basetypes.BaseType)visitType(scope,((OIDType)dd).getOIDType()));
      }
    }else if (dd instanceof ClassType){
      ch.ehi.interlis.domainsandconstants.basetypes.ClassType classtype=new ch.ehi.interlis.domainsandconstants.basetypes.ClassType();
      ret=classtype;
      ClassType ct = (ClassType) dd;
      if(ct.isStructure()){
        classtype.setKind(ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE);
      }else{
        classtype.setKind(ch.ehi.interlis.modeltopicclass.ClassDefKind.CLASS);
      }
      Iterator ri=ct.iteratorRestrictedTo();
      while(ri.hasNext()){
        Table r=(Table)ri.next();
        classtype.addRestrictedTo(findClassDef((Table)getElementInRootLanguageOrSame(r)));
      }
    } else if (dd instanceof FormattedType && isDateOrTime((FormattedType) dd)) {
        FormattedType formattedType = (FormattedType) dd;
        if (formattedType.getDefinedBaseDomain() == PredefinedModel.getInstance().XmlDate) {
            DateType dateType = new DateType();
            dateType.setMin(parseDateValue(formattedType.getDefinedMinimum()));
            dateType.setMax(parseDateValue(formattedType.getDefinedMaximum()));
            ret = dateType;
        } else if (formattedType.getDefinedBaseDomain() == PredefinedModel.getInstance().XmlDateTime) {
            DateTimeType dateTimeType = new DateTimeType();
            dateTimeType.setMin(parseDateTimeValue(formattedType.getDefinedMinimum()));
            dateTimeType.setMax(parseDateTimeValue(formattedType.getDefinedMaximum()));
            ret = dateTimeType;
        } else if (formattedType.getDefinedBaseDomain() == PredefinedModel.getInstance().XmlTime) {
            TimeType timeType = new TimeType();
            timeType.setMin(parseTimeValue(formattedType.getDefinedMinimum()));
            timeType.setMax(parseTimeValue(formattedType.getDefinedMaximum()));
            ret = timeType;
        }
    }else{
        if (dd instanceof TypeAlias) {
            Domain domain = ((TypeAlias) dd).getAliasing();
            if (domain == PredefinedModel.getInstance().XmlDate) {
                return new InterlisDateType();
            }
            if (domain == PredefinedModel.getInstance().XmlDateTime) {
                return new InterlisDateTimeType();
            }
            if (domain == PredefinedModel.getInstance().XmlTime) {
                return new InterlisTimeType();
            }
        }

      // handle unknown types in a generic way
      ch.ehi.interlis.domainsandconstants.UnknownType ukn=new ch.ehi.interlis.domainsandconstants.UnknownType();
      ret=ukn;
      makeSyntax.printType(scope,dd,false);
      ukn.setSyntax(new NlsString(modelLanguage,getSyntax()));
    }
    return ret;
  }

    private static boolean isDateOrTime(FormattedType formattedType) {
        Domain baseDomain = formattedType.getDefinedBaseDomain();
        return baseDomain == PredefinedModel.getInstance().XmlDate
                || baseDomain == PredefinedModel.getInstance().XmlDateTime
                || baseDomain == PredefinedModel.getInstance().XmlTime;
    }

    private static DateValue parseDateValue(String xmlDateValue) {
        if (xmlDateValue == null) {
            return null;
        }
        Calendar parsedDate;
        try {
            parsedDate = DatatypeConverter.parseDate(xmlDateValue);
        } catch (IllegalArgumentException e) {
            return null;
        }

        DateValue dateValue = new DateValue();
        dateValue.setYear(parsedDate.get(Calendar.YEAR));
        dateValue.setMonth(parsedDate.get(Calendar.MONTH) + 1); // Java calendar months start with January = 0
        dateValue.setDay(parsedDate.get(Calendar.DAY_OF_MONTH));
        return dateValue;
    }

    private static DateTimeValue parseDateTimeValue(String xmlDateTimeValue) {
        if (xmlDateTimeValue == null) {
            return null;
        }
        Calendar parsedDateTime;
        try {
            parsedDateTime = DatatypeConverter.parseDate(xmlDateTimeValue);
        } catch (IllegalArgumentException e) {
            return null;
        }

        DateTimeValue dateTimeValue = new DateTimeValue();
        dateTimeValue.setYear(parsedDateTime.get(Calendar.YEAR));
        dateTimeValue.setMonth(parsedDateTime.get(Calendar.MONTH) + 1); // Java calendar months start with January = 0
        dateTimeValue.setDay(parsedDateTime.get(Calendar.DAY_OF_MONTH));
        dateTimeValue.setHours(parsedDateTime.get(Calendar.HOUR_OF_DAY));
        dateTimeValue.setMinutes(parsedDateTime.get(Calendar.MINUTE));
        dateTimeValue.setSeconds(parsedDateTime.get(Calendar.SECOND));
        return dateTimeValue;
    }

    private static TimeValue parseTimeValue(String xmlTimeValue) {
        if (xmlTimeValue == null) {
            return null;
        }
        Calendar parsedTime;
        try {
            parsedTime = DatatypeConverter.parseTime(xmlTimeValue);
        } catch (IllegalArgumentException e) {
            return null;
        }

        TimeValue timeValue = new TimeValue();
        timeValue.setHours(parsedTime.get(Calendar.HOUR_OF_DAY));
        timeValue.setMinutes(parsedTime.get(Calendar.MINUTE));
        timeValue.setSeconds(parsedTime.get(Calendar.SECOND));
        return timeValue;
    }

  private ch.ehi.interlis.domainsandconstants.basetypes.NumericalType visitNumericalType(Container scope,NumericalType btype)
  {

    ch.ehi.interlis.domainsandconstants.basetypes.NumericalType ret=null;

    if (btype instanceof NumericType)
    {
      NumericType type = (NumericType) btype;
      PrecisionDecimal min = type.getMinimum();
      PrecisionDecimal max = type.getMaximum();
      ch.ehi.interlis.domainsandconstants.basetypes.NumericType umlType=new ch.ehi.interlis.domainsandconstants.basetypes.NumericType();
      ret=umlType;
      if (min == null){
        umlType.setRangeDefined(false);
      }else{
        umlType.setRangeDefined(true);
        umlType.setMinDec(visitIliDim(min));
        umlType.setMaxDec(visitIliDim(max));
      }
    }
    else if (btype instanceof StructuredUnitType)
    {
      ch.ehi.interlis.domainsandconstants.basetypes.StructuredUnitType umlType=new ch.ehi.interlis.domainsandconstants.basetypes.StructuredUnitType();
      ret=umlType;
      umlType.setMinStruc(visitStructDec(((StructuredUnitType) btype).getMinimum()));
      umlType.setMaxStruc(visitStructDec(((StructuredUnitType) btype).getMaximum()));
    }


    ret.setCircular(btype.isCircular());


    if (btype.getUnit() != null)
    {
      ret.attachUnitDef(findUnitDef((Unit)getElementInRootLanguageOrSame(btype.getUnit())));
    }


    switch (btype.getRotation())
    {
    case NumericType.ROTATION_COUNTERCLOCKWISE:
      ret.setDirection(ch.ehi.interlis.domainsandconstants.basetypes.RotationKind.COUNTERCLOCKWISE);
      break;
    case NumericType.ROTATION_CLOCKWISE:
      ret.setDirection(ch.ehi.interlis.domainsandconstants.basetypes.RotationKind.CLOCKWISE);
      break;
    case NumericType.ROTATION_NONE:
      ret.setDirection(ch.ehi.interlis.domainsandconstants.basetypes.RotationKind.UNDEFINED);
      break;
    }

    // RefSys
    if (btype.getReferenceSystem() != null)
    {
      makeSyntax.printReferenceSysRef (scope, btype.getReferenceSystem ());
      ch.ehi.interlis.domainsandconstants.basetypes.RefSys refsys=new ch.ehi.interlis.domainsandconstants.basetypes.RefSys();
      refsys.setSyntax(new NlsString(modelLanguage,getSyntax()));
      ret.attachRefSys(refsys);
    }

    return ret;
  }
  private ch.ehi.interlis.domainsandconstants.basetypes.StructDec visitStructDec(Constant.Structured val)
  {
    return ch.ehi.interlis.domainsandconstants.basetypes.StructDec.parseStructDec(val.toString());
  }
  private ch.ehi.interlis.domainsandconstants.basetypes.IliDim visitIliDim(PrecisionDecimal val)
  {
    ch.ehi.interlis.domainsandconstants.basetypes.IliDim ret=new ch.ehi.interlis.domainsandconstants.basetypes.IliDim();
    ret.setValue(val.doubleValue());
    ret.setBase10shift(val.getExponent());
    ret.setAccuracy(val.getAccuracy());
    return ret;
  }

  private ch.ehi.interlis.domainsandconstants.basetypes.Enumeration visitEnumeration (Enumeration translatedEnumer, Enumeration enumer)
  {
    ch.ehi.interlis.domainsandconstants.basetypes.Enumeration ret=null;
    
    if(translatedEnumer!=null) {
        ret=findEnumeration(translatedEnumer);
    }else {
        ret=findEnumeration(enumer);
    }
    
    Iterator iter = enumer.getElements();
    while (iter.hasNext()) {
      final EnumElement enumElement = visitEnumerationElement((ch.interlis.ili2c.metamodel.Enumeration.Element) iter.next());
      if(translatedEnumer==null) {
          ret.addEnumElement(enumElement);
      }
    }
    return ret;
  }

private ch.ehi.interlis.domainsandconstants.basetypes.EnumElement visitEnumerationElement (Enumeration.Element ee)
  {
    ch.ehi.interlis.domainsandconstants.basetypes.EnumElement ret=null;
    
    Enumeration.Element translatedEe=getElementInRootLanguage(ee);
    if(translatedEe!=null) {
        ret=findEnumEle(translatedEe);
    }else {
        ret=findEnumEle(ee);
    }
    
    ret.setName(new NlsString(ret.getName(),modelLanguage,ee.getName()));

	// documentation
	String ilidoc=ee.getDocumentation();
	if(ilidoc!=null){
		ret.setDocumentation(new NlsString(ret.getDocumentation(),modelLanguage,ilidoc));
	}

    if(translatedEe==null) {
        // meta values
        visitMetaValues(ret,ee.getMetaValues());
    }

    Enumeration subEnum = ee.getSubEnumeration();
    Enumeration translatedSubEnum = null;
    if(translatedEe!=null) {
        translatedSubEnum = translatedEe.getSubEnumeration();
    }
    if (subEnum != null)
    {
        final ch.ehi.interlis.domainsandconstants.basetypes.Enumeration enumeration = visitEnumeration(translatedSubEnum,subEnum);
        if(translatedEe==null) {
            ret.attachChild(enumeration);
        }
    }
    return ret;
  }


private ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef visitLineFormTypeDef (LineForm lf)
  {
    ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef lfdef=null;
    
    
    LineForm translatedLf=(LineForm)getElementInRootLanguage(lf);
    if(translatedLf!=null) {
        lfdef=findLineFormTypeDef(translatedLf);
    }else {
        lfdef=findLineFormTypeDef(lf);
    }
    
    
    lfdef.setName(new NlsString(lfdef.getName(),modelLanguage,lf.getName()));
    
	// documentation
	String ilidoc=lf.getDocumentation();
	if(ilidoc!=null){
		lfdef.setDocumentation(new NlsString(lfdef.getDocumentation(),modelLanguage,ilidoc));
	}

	if(translatedLf==null) {
	    Table struct=lf.getSegmentStructure();
	    if(struct!=null){
	      lfdef.attachStructure(findClassDef((Table)getElementInRootLanguageOrSame(struct)));
	    }
	    getNamespace().addOwnedElement(lfdef);
	}
    return lfdef;

  }



  private ch.ehi.interlis.functions.FunctionDef visitFunctionDeclaration(Function f)
  {
    ch.ehi.interlis.functions.FunctionDef funcdef=null;
    
    Function translatedF=(Function)getElementInRootLanguage(f);
    if(translatedF!=null) {
        funcdef=findFunctionDef(translatedF);
    }else {
        funcdef=findFunctionDef(f);
    }
    
    
    funcdef.setName(new NlsString(funcdef.getName(),modelLanguage,f.getName()));

	// documentation
	String ilidoc=f.getDocumentation();
	if(ilidoc!=null){
		funcdef.setDocumentation(new NlsString(funcdef.getDocumentation(),modelLanguage,ilidoc));
	}

    makeSyntax.printFunctionDeclaration(f.getContainer(),f);
    funcdef.setSyntax(new NlsString(funcdef.getSyntax(),modelLanguage,getSyntax()));
    if(translatedF==null) {
        getNamespace().addOwnedElement(funcdef);
    }
    return funcdef;
  }

  private void visitElements (Container container)
  {
    ch.ehi.uml1_4.foundation.core.ModelElement lastUmlEle = null;
	ch.ehi.uml1_4.foundation.core.ModelElement nextUmlEle = null;

	int attrIdx=0;
    Iterator it = container.iterator();
    while (it.hasNext()) {
      ch.interlis.ili2c.metamodel.Element elt = (ch.interlis.ili2c.metamodel.Element) it.next();

      if (elt instanceof Model)
      {
        nextUmlEle=visitModel((Model) elt);
      }

      else if (elt instanceof MetaDataUseDef)
      {
		nextUmlEle=visitMetaDataUseDef((MetaDataUseDef) elt);
      }
      else if (elt instanceof Unit)
      {
		nextUmlEle=visitUnit((Unit) elt);
      }
      else if (elt instanceof Function)
      {
		nextUmlEle=visitFunctionDeclaration ((Function) elt);
      }
      else if (elt instanceof LineForm)
      {
		nextUmlEle=visitLineFormTypeDef ((LineForm) elt);
      }
      else if (elt instanceof Domain)
      {
		nextUmlEle=visitDomainDef ((Domain) elt); // TODO
      }
      else if (elt instanceof GraphicParameterDef)
      {
		nextUmlEle=visitRuntimeParameterDef((GraphicParameterDef) elt);
      }
      else if (elt instanceof Topic)
      {
		nextUmlEle=visitTopicDef((Topic) elt); // TODO
      }

      else if (elt instanceof AssociationDef)
      {
		nextUmlEle=visitAssociationDef((AssociationDef) elt); // TODO
      }
      else if (elt instanceof Table)
      {
        /* Only explicit tables are printed out.
           Line attribute tables, for example,
           are not printed out.
        */
        if (!((Table) elt).isImplicit ())
        {
			nextUmlEle=visitClassDef((Table) elt); // TODO
        }
      }
      else if (elt instanceof View)
      {
		nextUmlEle=visitView((View) elt);
      }
      else if (elt instanceof Graphic)
      {
		nextUmlEle=visitGraphic ((Graphic) elt);
      }

      else if (elt instanceof AttributeDef)
      {
        visitAttribute ((AttributeDef) elt,attrIdx); // TODO
        attrIdx++;
      }
      if (elt instanceof RoleDef)
      {
        visitRoleDef((RoleDef) elt); // TODO
      }
      else if (elt instanceof Parameter)
      {
        visitParameter ((Parameter) elt);
      }
      else if (elt instanceof Constraint)
      {
        visitConstraint((Constraint) elt);
      }
      
      if(getElementInRootLanguage(elt)==null) {
          if(nextUmlEle!=null && lastUmlEle!=null){
              // add dependency to keep ordering the same as in ili-file
              ch.ehi.umleditor.application.ElementFactory.createDependency(ch.ehi.uml1_4.implementation.UmlUsage.class, nextUmlEle, lastUmlEle);
            }
      }
      if(nextUmlEle!=null){
		lastUmlEle=nextUmlEle;
		nextUmlEle=null;
      }
    }
  }

  private void visitMetaDataFiles(ch.ehi.uml1_4.modelmanagement.Model model,Configuration config)
  {
    Iterator it=config.iteratorFileEntry();
    while(it.hasNext()){
      ch.interlis.ili2c.config.FileEntry fileIli=(ch.interlis.ili2c.config.FileEntry)it.next();
      if(fileIli.getKind()==ch.interlis.ili2c.config.FileEntryKind.METADATAFILE){
        ch.ehi.interlis.metaobjects.MetaObjectFile fileUml=new ch.ehi.interlis.metaobjects.MetaObjectFile();
        fileUml.setName(new NlsString("",getBasename(fileIli.getFilename())));
        model.addOwnedElement(fileUml);
      }
    }
  }

  Interlis2Generator makeSyntax=null;
  java.io.StringWriter syntaxBuffer=null;
  private String getSyntax()
  {
    String syntax=syntaxBuffer.toString();
    syntaxBuffer.getBuffer().setLength(0);
    return syntax;
  }

  private PredefinedModel ilibase;
  private ch.ehi.uml1_4.modelmanagement.Package ili2modelset;
  private static int uniqueName=1;
  public void visitTransferDescription (ch.ehi.uml1_4.modelmanagement.Model umlModel,
    TransferDescription   td,String configFilename,Configuration config)
  {
    syntaxBuffer=new java.io.StringWriter();
    makeSyntax=Interlis2Generator.generateElements(syntaxBuffer,td);
    ilibase=td.INTERLIS;
    updateMappingToPredefinedModel(umlModel);
    ili2modelset=new ch.ehi.uml1_4.implementation.UmlPackage();
    if(configFilename!=null){
      ili2modelset.setName(new NlsString("",getBasename(configFilename)));
    }else{
      ili2modelset.setName(new NlsString(rsrc.getString("CTunnamedModelsetName")+Integer.toString(uniqueName)));
      uniqueName+=1;
    }
    // add model contents
    visitElements(td);
    // conversion done; add model to editor
    umlModel.addOwnedElement(ili2modelset);
    // add metadata files
    visitMetaDataFiles(umlModel,config);
  }
  public void loadPredefinedIli2cModel(ch.ehi.uml1_4.modelmanagement.Package root)
  {
    TransferDescription td=new TransferDescription();
    syntaxBuffer=new java.io.StringWriter();
    makeSyntax=Interlis2Generator.generateElements(syntaxBuffer,td);
    ilibase=td.INTERLIS;
    ili2modelset=root;
    // add model contents
    visitElements(td);
  }


  private static String getBasename(String filename)
  {
    return new java.io.File(filename).getName();
  }
  static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(TransferFromIli2cMetamodel.class);

  public String getFuncDesc(){
    return rsrc.getString("CIiliimport");
  }
}
