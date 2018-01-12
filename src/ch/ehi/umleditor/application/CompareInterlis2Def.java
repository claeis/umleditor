package ch.ehi.umleditor.application;

import java.util.List;

import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.tools.ModelElementUtility;
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
