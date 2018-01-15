package ch.ehi.umleditor.application;

import java.util.List;
import java.util.ResourceBundle;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
import ch.ehi.interlis.functions.FunctionDef;
import ch.ehi.interlis.graphicdescriptions.GraphicParameterDef;
import ch.ehi.interlis.metaobjects.MetaDataUseDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.tools.ModelElementUtility;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.umleditor.interlis.iliexport.TransferFromUmlMetamodel;

public class CompareInterlis2Def {
	static ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(CompareInterlis2Def.class);
	
	public INTERLIS2Def oldInterlis;
	public INTERLIS2Def newInterlis;
	
	public INTERLIS2Def getOldInterlis() {
		return oldInterlis;
	}

	public void setOldInterlis(INTERLIS2Def oldInterlis) {
		this.oldInterlis = oldInterlis;
	}

	public INTERLIS2Def getNewInterlis() {
		return newInterlis;
	}

	public void setNewInterlis(INTERLIS2Def newInterlis) {
		this.newInterlis = newInterlis;
	}

	public void compareINTERLIS() {
		// enumerate and sort all ModelDef
		TransferFromUmlMetamodel obj = new TransferFromUmlMetamodel();
		
		//List with sorted models from InterlisFile
		List listold = obj.sortIliDefs(ModelElementUtility.getChildElements(oldInterlis, ModelDef.class));
		List listnew = obj.sortIliDefs(ModelElementUtility.getChildElements(newInterlis, ModelDef.class));
		//oldInterlis.setName(newInterlis.getName()); <--------- something like this
		
		// visit all ModelDef
		System.out.println("Modelos viejos ----------------");
		for(int i=0;i<listold.size();i++){
			ModelDef modold = (ModelDef)listold.get(i);
		    System.out.println( modold.getName().getValue() );
		    
		    System.out.println("Modelos nuevos ............");
		    for(int j=0; j<listnew.size();j++) {
		    	ModelDef modnew = (ModelDef)listnew.get(j);
		    	System.out.println(modnew.getName().getValue());
			    //System.out.println(modnew.getName().getValue());
			    List newchilds = obj.sortIliDefs(ModelElementUtility.getChildElements(modnew, null)); //hijos del modelo nuevo
			    List oldchilds = obj.sortIliDefs(ModelElementUtility.getChildElements(modold, null)); // hijos del viejo modelo
			    
			    compareChilds(oldchilds, newchilds);
			   
		    } 
		} 
	}
	
	public void compareChilds(List oldchilds, List newchilds) {

	    //empezamos a comparar
	    int i=0;
	    int j=0;
	    while(i<newchilds.size()) {
	    	if(j<oldchilds.size() && i==j) {
	    		if (newchilds.get(i) instanceof ClassDef && oldchilds.get(j) instanceof ClassDef) {
					   ClassDef clasenueva = (ClassDef)newchilds.get(i);
					   ClassDef clasevieja = (ClassDef)oldchilds.get(j);
					   if(clasenueva.getName().getValue().equals(clasevieja.getName().getValue())) {
						   clasevieja.setMetaAttrb(clasenueva.getMetaAttrb());
						   clasevieja.setDocumentation(clasenueva.getDocumentation());
						   clasevieja.setAbstract(clasenueva.isAbstract());
						   clasevieja.setPropFinal(clasenueva.isPropFinal());
						   //value extended omitted (to discuss)
						   clasevieja.setKind(clasenueva.getKind());
						   clasevieja.setMetaMapping(clasenueva.getMetaMapping());
						   /*******************
						    * - see how to add attributes
						    * - by now parameter and constraints can't be uploaded
						    * */
						   i++;
						   j++;
					   } else {
						   // maybe just can create a new class? or check next child? :/
						   LauncherView.getInstance().log(rsrc.getString("IFuncDesc"), rsrc.getString("CIFail"));
						   break;
					   }
					   
				   }
				   else if(newchilds.get(i) instanceof DomainDef && oldchilds.get(j) instanceof DomainDef) {
					   DomainDef dominionuevo = (DomainDef)newchilds.get(i);
					   DomainDef dominioviejo = (DomainDef)oldchilds.get(j);
					   					   
					   if(dominionuevo.getName().getValue().equals(dominioviejo.getName().getValue())){
						   dominioviejo.setMetaAttrb(dominionuevo.getMetaAttrb());
						   //can't access to type of domain (to do later)
						   dominioviejo.setDocumentation(dominionuevo.getDocumentation());
						   dominioviejo.setAbstract(dominionuevo.isAbstract());
						   dominioviejo.setPropFinal(dominionuevo.isPropFinal());
						   dominioviejo.setMandatory(dominionuevo.isMandatory());
						   //can't access to Specialized (to do later)
						   //can't access to kind (to do)
						   i++;
						   j++;
						   
					   } else {
						   // maybe just can create a new domain? or check next child? :/
						   LauncherView.getInstance().log(rsrc.getString("IFuncDesc"), rsrc.getString("CIFail"));
						   break;
					   }
				   }
				   else if(newchilds.get(i) instanceof FunctionDef && oldchilds.get(j) instanceof FunctionDef) {
					   FunctionDef fncnueva = (FunctionDef)newchilds.get(i);
					   FunctionDef fncvieja = (FunctionDef)oldchilds.get(j);
					   
					   System.out.println(i+"Funcion nuevo: "+fncnueva.getName().getValue());
					   System.out.println(i+"Funcion viejo: "+fncvieja.getName().getValue());
					   
					   if(fncnueva.getName().getValue().equals(fncvieja.getName().getValue())) {
						   fncvieja.setDocumentation(fncnueva.getDocumentation());
						   // depends on cant access
						   // text cant access

						   i++;
						   j++;
					   } else {
						   // maybe just can create a new domain? or check next child? :/
						   LauncherView.getInstance().log(rsrc.getString("IFuncDesc"), rsrc.getString("CIFail"));
						   break;
					   }
					   
				   }
				   else if(newchilds.get(i) instanceof GraphicParameterDef && oldchilds.get(j) instanceof GraphicParameterDef) {
					   GraphicParameterDef gpdnueva = (GraphicParameterDef)newchilds.get(i);
					   GraphicParameterDef gpdvieja = (GraphicParameterDef)oldchilds.get(j);
					   
					   if(gpdnueva.getName().getValue().equals(gpdvieja.getName().getValue())) {
						   gpdvieja.setDocumentation(gpdnueva.getDocumentation());
						   // depends on cant access
						   // text cant access

						   i++;
						   j++;
					   } else {
						   // maybe just can create a new domain? or check next child? :/
						   LauncherView.getInstance().log(rsrc.getString("IFuncDesc"), rsrc.getString("CIFail"));
						   break;
					   }
				   }
				   else if(newchilds.get(i) instanceof LineFormTypeDef && oldchilds.get(j) instanceof LineFormTypeDef) {
					   LineFormTypeDef lftnueva = (LineFormTypeDef)newchilds.get(i);
					   LineFormTypeDef lftvieja = (LineFormTypeDef)oldchilds.get(j);
					   
					   if(lftnueva.getName().getValue().equals(lftvieja.getName().getValue())) {
						   lftvieja.setDocumentation(lftnueva.getDocumentation());
						   lftvieja.setSyntax(lftnueva.getSyntax()); //structure?? check later
						   i++;
						   j++;
					   } else {
						   // maybe just can create a new domain? or check next child? :/
						   LauncherView.getInstance().log(rsrc.getString("IFuncDesc"), rsrc.getString("CIFail"));
						   break;
					   }
					   
				   }
				   else if(newchilds.get(i) instanceof MetaDataUseDef && oldchilds.get(j) instanceof MetaDataUseDef) {
					   MetaDataUseDef metadatanueva = (MetaDataUseDef)newchilds.get(i);
					   MetaDataUseDef metadatavieja = (MetaDataUseDef)oldchilds.get(j);
					   if(metadatanueva.getName().getValue().equals(metadatavieja.getName().getValue())) {
						   metadatavieja.setBasketOid(metadatavieja.getBasketOid());
						   metadatavieja.setKind(metadatanueva.getKind());
						   metadatavieja.setDocumentation(metadatanueva.getDocumentation());
						   metadatavieja.setSyntax(metadatanueva.getSyntax()); //Definition?? check later
						   
						   i++;
						   j++;
					   } else {
						   // maybe just can create a new domain? or check next child? :/
						   LauncherView.getInstance().log(rsrc.getString("IFuncDesc"), rsrc.getString("CIFail"));
						   break;
					   }
					   
				   }
				   else if(newchilds.get(i) instanceof TopicDef && oldchilds.get(j) instanceof TopicDef) {
					   TopicDef topicnueva = (TopicDef)newchilds.get(i);
					   TopicDef topicvieja = (TopicDef)oldchilds.get(j);
					   
					   if(topicnueva.getName().getValue().equals(topicvieja.getName().getValue())) {
						   
						   //cant access to type 
						   topicvieja.setDocumentation(topicnueva.getDocumentation());
						   topicvieja.setAbstract(topicnueva.isAbstract());
						   topicvieja.setPropFinal(topicnueva.isPropFinal());
						   topicvieja._setOid(topicnueva.getOid());
						   //extends cant be access
						   //see later how to add dependencies
						   
						   i++;
						   j++;
						   
					   } else {
						   // maybe just can create a new domain? or check next child? :/
						   LauncherView.getInstance().log(rsrc.getString("IFuncDesc"), rsrc.getString("CIFail"));
						   break;
					   }
				   }
				   else if(newchilds.get(i) instanceof UnitDef && oldchilds.get(j) instanceof UnitDef) {
					   UnitDef unitnueva = (UnitDef)newchilds.get(i);
					   UnitDef unitvieja = (UnitDef)oldchilds.get(j);
					   
					   if(unitnueva.getName().getValue().equals(unitvieja.getName().getValue())) {
						   unitvieja.setDescName(unitnueva.getDescName());
						   unitvieja.setDocumentation(unitnueva.getDocumentation());
						   unitvieja.setSyntax(unitnueva.getSyntax());
						   //cant access to depend on
						   i++;
						   j++;
					   } else {
						   // maybe just can create a new domain? or check next child? :/
						   LauncherView.getInstance().log(rsrc.getString("IFuncDesc"), rsrc.getString("CIFail"));
						   break;
					   }
					   
				   }
				   else {
					   System.out.println(i+"Cosas no identificadas nuevo:"+ newchilds.getClass().getName());
					   System.out.println(i+"Cosas no identificadas viejo:"+ newchilds.getClass().getName() );
					   i++;
					   j++;
				   }
	    	}
	    	 
	    }
	}
	
}
