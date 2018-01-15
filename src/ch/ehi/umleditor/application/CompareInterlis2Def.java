package ch.ehi.umleditor.application;

import java.util.List;

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
					   System.out.println(i+"Clase nueva: "+clasenueva.getName().getValue());
					   System.out.println(i+"Clase vieja: "+clasevieja.getName().getValue());
					   if(clasenueva.getName().getValue().equals(clasevieja.getName().getValue())) {
						   System.out.println("Let's start to compare papu!");
						   clasevieja.setMetaAttrb(new NlsString("Probando cosas nuevas!"));
					   }
					   i++;
					   j++;
				   }
				   else if(newchilds.get(i) instanceof DomainDef && oldchilds.get(j) instanceof DomainDef) {
					   DomainDef dominionuevo = (DomainDef)newchilds.get(i);
					   DomainDef dominioviejo = (DomainDef)oldchilds.get(j);
					   
					   System.out.println(i+"Domino nuevo: "+dominionuevo.getName().getValue());
					   System.out.println(i+"Domino viejo: "+dominioviejo.getName().getValue());
					   i++;
					   j++;
				   }
				   else if(newchilds.get(i) instanceof FunctionDef && oldchilds.get(j) instanceof FunctionDef) {
					   FunctionDef fncnueva = (FunctionDef)newchilds.get(i);
					   FunctionDef fncvieja = (FunctionDef)oldchilds.get(j);
					   
					   System.out.println(i+"Funcion nuevo: "+fncnueva.getName().getValue());
					   System.out.println(i+"Funcion viejo: "+fncvieja.getName().getValue());
					   i++;
					   j++;
				   }
				   else if(newchilds.get(i) instanceof GraphicParameterDef && oldchilds.get(j) instanceof GraphicParameterDef) {
					   GraphicParameterDef gpdnueva = (GraphicParameterDef)newchilds.get(i);
					   GraphicParameterDef gpdvieja = (GraphicParameterDef)oldchilds.get(j);
					   
					   System.out.println(i+"grafica nuevo: "+gpdnueva.getName().getValue());
					   System.out.println(i+"grafica viejo: "+gpdvieja.getName().getValue());
					   i++;
					   j++;
				   }
				   else if(newchilds.get(i) instanceof LineFormTypeDef && oldchilds.get(j) instanceof LineFormTypeDef) {
					   LineFormTypeDef lftnueva = (LineFormTypeDef)newchilds.get(i);
					   LineFormTypeDef lftvieja = (LineFormTypeDef)oldchilds.get(j);
					   
					   System.out.println(i+"linea nuevo: "+lftnueva.getName().getValue());
					   System.out.println(i+"linea viejo: "+lftvieja.getName().getValue());
					   i++;
					   j++;
				   }
				   else if(newchilds.get(i) instanceof MetaDataUseDef && oldchilds.get(j) instanceof MetaDataUseDef) {
					   MetaDataUseDef lftnueva = (MetaDataUseDef)newchilds.get(i);
					   MetaDataUseDef lftvieja = (MetaDataUseDef)oldchilds.get(j);
					   
					   System.out.println(i+"metadata nuevo: "+lftnueva.getName().getValue());
					   System.out.println(i+"metadata viejo: "+lftvieja.getName().getValue());
					   i++;
					   j++;
				   }
				   else if(newchilds.get(i) instanceof TopicDef && oldchilds.get(j) instanceof TopicDef) {
					   TopicDef topicnueva = (TopicDef)newchilds.get(i);
					   TopicDef topicvieja = (TopicDef)oldchilds.get(j);
					   
					   System.out.println(i+"topic nuevo: "+topicnueva.getName().getValue());
					   System.out.println(i+"topic viejo: "+topicvieja.getName().getValue());
					   i++;
					   j++;
				   }
				   else if(newchilds.get(i) instanceof UnitDef && oldchilds.get(j) instanceof UnitDef) {
					   UnitDef unitnueva = (UnitDef)newchilds.get(i);
					   UnitDef unitvieja = (UnitDef)oldchilds.get(j);
					   
					   System.out.println(i+"unit nuevo: "+unitnueva.getName().getValue());
					   System.out.println(i+"unit viejo: "+unitvieja.getName().getValue());
					   i++;
					   j++;
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
