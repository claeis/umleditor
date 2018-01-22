package ch.ehi.umleditor.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
import ch.ehi.interlis.functions.FunctionDef;
import ch.ehi.interlis.graphicdescriptions.GraphicDef;
import ch.ehi.interlis.graphicdescriptions.GraphicParameterDef;
import ch.ehi.interlis.metaobjects.MetaDataUseDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.modeltopicclass.Translation;
import ch.ehi.interlis.tools.AbstractClassDefUtility;
import ch.ehi.interlis.tools.ModelElementUtility;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.views.ViewDef;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.umleditor.interlis.iliexport.TransferFromUmlMetamodel;
import ch.ehi.umleditor.umlpresentation.Diagram;
/**
 * This class compare two interlis models and update a given model
 * @author alelizzt
 *
 */
public class CompareInterlis2Def {
	/**
	 * Resources from class 'CompareInterlis2Def'
	 */
	static ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle.getBundle(CompareInterlis2Def.class);

	/**
	 * INTERLIS model to update
	 */
	public INTERLIS2Def oldInterlis;
	/**
	 * INTERLIS model to check update
	 */
	public INTERLIS2Def newInterlis;

	/**
	 * Get the INTERLIS model value to update
	 * @return model to update
	 */
	public INTERLIS2Def getOldInterlis() {
		return oldInterlis;
	}

	/**
	 * Set the INTERLIS model value to update
	 * @param oldInterlis
	 */
	public void setOldInterlis(INTERLIS2Def oldInterlis) {
		this.oldInterlis = oldInterlis;
	}

	/**
	 * Get the INTERLIS model to check update
	 * @return model to check update
	 */
	public INTERLIS2Def getNewInterlis() {
		return newInterlis;
	}

	/**
	 * Set the INTERLIS model value to check update
	 * @param newInterlis
	 */
	public void setNewInterlis(INTERLIS2Def newInterlis) {
		this.newInterlis = newInterlis;
	}

	/**
	 * Compare INTERLIS models to update
	 */
	public void compareINTERLIS() {
		// enumerate and sort all ModelDef
		TransferFromUmlMetamodel obj = new TransferFromUmlMetamodel();

		// List with sorted models from InterlisFile
		List listold = obj.sortIliDefs(ModelElementUtility.getChildElements(oldInterlis, ModelDef.class));
		List listnew = obj.sortIliDefs(ModelElementUtility.getChildElements(newInterlis, ModelDef.class));
		// visit all ModelDef
		for (int i = 0; i < listold.size(); i++) {
			ModelDef modold = (ModelDef) listold.get(i);
			for (int j = 0; j < listnew.size(); j++) {
				ModelDef modnew = (ModelDef) listnew.get(j);
				System.out.println("Modelo nuevo: "+modnew.getName().getValue());
				System.out.println("Modelo viejo: "+modold.getName().getValue());
				if (modnew.getName().getValue().equals(modold.getName().getValue())) {
					updateModelDef(modold,modnew);
					//list with sorted child from Model
					List newchild = obj.sortIliDefs(ModelElementUtility.getChildElements(modnew, null)); 
					List oldchild = obj.sortIliDefs(ModelElementUtility.getChildElements(modold, null)); 
					
					System.out.println("actualizando "+modold.getName().getValue());
					cleanOldchild(oldchild, newchild); //actualiza elementos y elimina los que no encuentra
					
				} else {
					//Create model
					System.out.println("Se supone que crearé el modelo " + modnew.getName().getValue());

				}

			}
		}
		LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), oldInterlis.getName().getValue()+" Updated!");
	}

	public void cleanOldchild(List oldChild, List newChild) {
		List<String> check = new ArrayList();
		int i=0;
		
		while(i < oldChild.size()) {
			//search
			ModelElement oldElement = (ModelElement) oldChild.get(i);
			int ind = searchIn(oldElement, newChild); //search old element in new list
			System.out.println("--> "+ind);
			if (ind == -1) { // remove element
				System.out.println("Eliminando "+oldElement.getName().getValue());
				//ElementFactory.removeElement((Element) newChild.get(i));
				i++;
				
			} 
			else { // update element

				ModelElement newElement =(ModelElement) newChild.get(ind);
				check.add(newElement.getName().getValue());
				
				if(oldElement instanceof Diagram && newElement instanceof Diagram) {
					//nothing to do :/
					System.out.println("Diagram");
					i++;
				}
				else if (oldElement instanceof ClassDef && newElement instanceof ClassDef) {
					ClassDef newClass = (ClassDef) newElement;
					ClassDef oldClass = (ClassDef) oldElement;
					System.out.println("Clase nueva: "+newClass.getName().getValue());
					System.out.println("Clase vieja: "+oldClass.getName().getValue());

					if (newClass.getName().getValue().equals(oldClass.getName().getValue())) {
						updateClassDef(oldClass, newClass);
						compareClassChilds(oldClass, newClass); //see attributes
						i++;
					} 

				}
				else if (oldElement instanceof DomainDef && newElement instanceof DomainDef) {
					DomainDef newDom = (DomainDef) newElement;
					DomainDef oldDom = (DomainDef) oldElement;
					System.out.println("Dominio nuevo: "+newDom.getName().getValue());
					System.out.println("Dominio viejo: "+oldDom.getName().getValue());

					if (newDom.getName().getValue().equals(oldDom.getName().getValue())) {

						updateDomainDef(oldDom, newDom);
						i++;

					} 
				} else if (oldElement instanceof FunctionDef && newElement instanceof FunctionDef) {
					FunctionDef newFnc = (FunctionDef) newElement;
					FunctionDef oldFnc = (FunctionDef) oldElement;
					System.out.println("Funcion nueva: "+newFnc.getName().getValue());
					System.out.println("Funcion vieja: "+oldFnc.getName().getValue());
					
					if (newFnc.getName().getValue().equals(oldFnc.getName().getValue())) {
						oldFnc.setDocumentation(newFnc.getDocumentation());
						System.out.println("Actualizando funcion: "+oldFnc.getName().getValue());
						// depends on cant access
						// text cant access
						i++;
					} 

				} else if (oldElement instanceof GraphicParameterDef
						&& newElement instanceof GraphicParameterDef) {
					GraphicParameterDef newGpd = (GraphicParameterDef) newElement;
					GraphicParameterDef oldGpd = (GraphicParameterDef) oldElement;
					System.out.println("Parametro grafico nuevo: "+newGpd.getName().getValue());
					System.out.println("Parametro grafico viejo: "+oldGpd.getName().getValue());

					if (newGpd.getName().getValue().equals(oldGpd.getName().getValue())) {
						System.out.println("Actualizando parametro grafico: "+oldGpd.getName().getValue());
						oldGpd.setDocumentation(newGpd.getDocumentation());
						// depends on cant access
						// text cant access
						i++;

					} 
				} else if (oldElement instanceof LineFormTypeDef && newElement instanceof LineFormTypeDef) {
					LineFormTypeDef newLft = (LineFormTypeDef) newElement;
					LineFormTypeDef oldLft = (LineFormTypeDef) oldElement;
					System.out.println("Linea nueva: "+newLft.getName().getValue());
					System.out.println("Linea vieja: "+oldLft.getName().getValue());

					if (newLft.getName().getValue().equals(oldLft.getName().getValue())) {
						System.out.println("Actualizando linea: "+oldLft.getName().getValue());
						oldLft.setDocumentation(newLft.getDocumentation());
						oldLft.setSyntax(newLft.getSyntax()); // structure?? check later
						i++;
					} 

				} else if (oldElement instanceof MetaDataUseDef && newElement instanceof MetaDataUseDef) {
					MetaDataUseDef newMetadata = (MetaDataUseDef) newElement;
					MetaDataUseDef oldMetadata = (MetaDataUseDef) oldElement;
					System.out.println("Metadato nuevo: "+newMetadata.getName().getValue());
					System.out.println("Metadato viejo: "+oldMetadata.getName().getValue());
					if (newMetadata.getName().getValue().equals(oldMetadata.getName().getValue())) {
						
						updateMetaDataUseDef(oldMetadata, newMetadata);
						i++;
					} 

				} else if (oldElement instanceof TopicDef && newElement instanceof TopicDef) {
					TopicDef newTopic = (TopicDef) newElement;
					TopicDef oldTopic = (TopicDef) oldElement;
					System.out.println("Tema nuevo: "+newTopic.getName().getValue());
					System.out.println("Tema viejo: "+oldTopic.getName().getValue());

					if (newTopic.getName().getValue().equals(oldTopic.getName().getValue())) {
						System.out.println("Actualizando tema: "+oldTopic.getName().getValue());
						// cant access to type
						oldTopic.setDocumentation(newTopic.getDocumentation());
						oldTopic.setAbstract(newTopic.isAbstract());
						oldTopic.setPropFinal(newTopic.isPropFinal());
						oldTopic._setOid(newTopic.getOid());
						// extends cant be access
						// see later how to add dependencies

						compareTopicChilds(oldTopic, newTopic);
						i++;

					} 
				} else if (oldElement instanceof UnitDef && newElement instanceof UnitDef) {
					UnitDef newUnit = (UnitDef) newElement;
					UnitDef oldUnit = (UnitDef) oldElement;
					System.out.println("Unidad nueva: "+newUnit.getName().getValue());
					System.out.println("Unidad vieja: "+oldUnit.getName().getValue());

					if (newUnit.getName().getValue().equals(oldUnit.getName().getValue())) {
						
						updateUnitDef(oldUnit, newUnit);
						i++;
					} 

				}
			}
		}
		addNewChild(check,oldChild,newChild);
	}
	
	public int searchIn(ModelElement elementToSearch, List placeToSearch) {
		int i=0;
		while(i<placeToSearch.size()) {
			ModelElement actual = (ModelElement) placeToSearch.get(i);
						
			if(actual.getName().getValue().equals(elementToSearch.getName().getValue())) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public void addNewChild(List oldModelclean,List modold,List newchild) {
		int i =0;
		while(i < newchild.size()) {
			ModelElement newElement = (ModelElement) newchild.get(i);
			if(oldModelclean.contains(newElement.getName().getValue())) {
				i++; //nothing to do has been updated
			} else {
				//create element :)
				System.out.println("se supone que crearé "+newElement.getName().getValue());
				i++;
			}
		}
	}


	public void compareClassChilds(ClassDef classOld, ClassDef classNew) {
		// empezamos a comparar
		System.out.println("---> Comparando atributos <---");

		// {AttributeDef}
		Iterator childAttrNew = AbstractClassDefUtility.getIliAttributes(classNew).iterator();
		Iterator childAttrOld = AbstractClassDefUtility.getIliAttributes(classOld).iterator();

		while (childAttrNew.hasNext()) {

			while (childAttrOld.hasNext()) {
				Object objOld = childAttrOld.next();
				Object objNew = childAttrNew.next();
				if (objNew instanceof AttributeDef && objOld instanceof AttributeDef) {
					AttributeDef atrbnew = (AttributeDef) objNew;
					AttributeDef atrbold = (AttributeDef) objOld;
					System.out.println("Atributo nuevo :"+atrbnew.getName().getValue());
					System.out.println("Atributo viejo :"+atrbold.getName().getValue());
					if (atrbnew.getName().getValue().equals(atrbold.getName().getValue())) {
						System.out.println("Actualizando atributo: "+atrbold.getName().getValue());
						atrbold.setMetaAttrb(atrbnew.getMetaAttrb());
						// Type cant access
						atrbold.setDocumentation(atrbnew.getDocumentation());
						atrbold.setAbstract(atrbnew.isAbstract());
						atrbold.setPropFinal(atrbnew.isPropFinal());
						// Cant access to specialized
						atrbold.setPropTransient(atrbnew.isPropTransient());
						// Cant access to ordered
						// Cant access to cardinality
					}
				} else if (objNew instanceof RoleDef) {
					// see later
				} else {
					// ignore others; should not have others
				}
			}

			// {ConstraintDef}
		}
	}

	public void compareTopicChilds(TopicDef oldtopic, TopicDef newtopic) {
		System.out.println("Comparando topics");
		TransferFromUmlMetamodel obj = new TransferFromUmlMetamodel();
		// sort children
		List oldtopchildren = obj
				.sortIliDefs(ch.ehi.interlis.tools.ModelElementUtility.getChildElements(oldtopic, null));
		List newtopchildren = obj
				.sortIliDefs(ch.ehi.interlis.tools.ModelElementUtility.getChildElements(newtopic, null));

		// visit children
		Iterator oldchildi = oldtopchildren.iterator();
		Iterator newchildi = newtopchildren.iterator();
		while (newchildi.hasNext()) {
			while (oldchildi.hasNext()) {
				Object objOld = oldchildi.next();
				Object objNew = newchildi.next();

				if (objNew instanceof MetaDataUseDef && objOld instanceof MetaDataUseDef) {
					updateMetaDataUseDef((MetaDataUseDef) objOld, (MetaDataUseDef) objNew);
				} else if (objNew instanceof UnitDef && objOld instanceof UnitDef) {
					updateUnitDef((UnitDef) objOld, (UnitDef) objNew);
				} else if (objNew instanceof DomainDef && objOld instanceof DomainDef) {
					updateDomainDef((DomainDef) objOld, (DomainDef) objNew);
				} else if ((objNew instanceof ClassDef && !(objNew instanceof AssociationDef))
						&& (objOld instanceof ClassDef && !(objOld instanceof AssociationDef))) {
					updateClassDef((ClassDef) objOld, (ClassDef) objNew);
				} else if (objNew instanceof AssociationDef) {
					updateAssociationDef((AssociationDef) objOld, (AssociationDef) objNew);
				} else if (objNew instanceof ViewDef && objOld instanceof ViewDef) {
					updateViewDef((ViewDef) objOld, (ViewDef) objNew);
				} else if (objNew instanceof GraphicDef && objOld instanceof GraphicDef) {
					updateGraphicDef((GraphicDef) objOld, (GraphicDef) objNew);
				} else {
					// ignore others; should not have others
				}
			}
		}
	}
	
	// Update model
	public void updateModelDef(ModelDef mdlold, ModelDef mdlnew) {
		mdlold.setKind(mdlnew.getKind());
		mdlold.setDocumentation(mdlnew.getDocumentation());
		mdlold.setIssuerURI(mdlnew.getIssuerURI());
		mdlold.setVersion(mdlnew.getVersion());
		mdlold.setVersionComment(mdlnew.getVersionComment());
		mdlold.setContracted(mdlnew.isContracted());
		mdlold.setBaseLanguage(mdlnew.getBaseLanguage());
		
		// Translations
		Iterator oldtranslationi = mdlold.iteratorTranslation();
		Iterator newtranslationi = mdlnew.iteratorTranslation();
		
		while (newtranslationi.hasNext()) {
			Translation oldtranslation = (Translation) oldtranslationi.next();
			Translation newtranslation = (Translation) newtranslationi.next();
			
			oldtranslation.setLanguage(newtranslation.getLanguage());
		}
		
		// Imports
		Iterator oldimportsi = mdlold.iteratorClientDependency();
		while (oldimportsi.hasNext()) {
			Object obj = oldimportsi.next();
			if (obj instanceof ch.ehi.interlis.modeltopicclass.IliImport) {
				ch.ehi.interlis.modeltopicclass.IliImport oldiliimport = (ch.ehi.interlis.modeltopicclass.IliImport) obj;
				Iterator oldsupplieri = oldiliimport.iteratorSupplier();
			}
		}
		
	}

	// Update elements
	public void updateClassDef(ClassDef clsOld, ClassDef clsNew) {
		System.out.println("Actualizando clase: "+clsOld.getName().getValue());
		clsOld.setMetaAttrb(clsNew.getMetaAttrb());
		clsOld.setDocumentation(clsNew.getDocumentation());
		clsOld.setAbstract(clsNew.isAbstract());
		clsOld.setPropFinal(clsNew.isPropFinal());
		// value extended omitted (to discuss)
		clsOld.setKind(clsNew.getKind());
		clsOld.setMetaMapping(clsNew.getMetaMapping());
		/*******************
		 * - by now parameter and constraints can't be uploaded
		 */
	}

	public void updateDomainDef(DomainDef domOld, DomainDef domNew) {
		System.out.println("Actualizando dominio: "+domOld.getName().getValue());
		domOld.setMetaAttrb(domNew.getMetaAttrb());
		// can't access to type of domain (to do later)
		domOld.setDocumentation(domNew.getDocumentation());
		domOld.setAbstract(domNew.isAbstract());
		domOld.setPropFinal(domNew.isPropFinal());
		domOld.setMandatory(domNew.isMandatory());
		// can't access to Specialized (to do later)
		// can't access to kind (to do)

	}
	
	public void updateMetaDataUseDef(MetaDataUseDef mtdOld, MetaDataUseDef mdtNew) {
		System.out.println("Actualizando metadato: "+mtdOld.getName().getValue());
		mtdOld.setBasketOid(mdtNew.getBasketOid());
		mtdOld.setKind(mdtNew.getKind());
		mtdOld.setDocumentation(mdtNew.getDocumentation());
		mtdOld.setSyntax(mdtNew.getSyntax()); // Definition?? check later
	}
	
	public void updateUnitDef(UnitDef untOld, UnitDef untNew) {
		System.out.println("Actualizando unidad: "+untOld.getName().getValue());
		untOld.setDescName(untNew.getDescName());
		untOld.setDocumentation(untNew.getDocumentation());
		untOld.setSyntax(untNew.getSyntax());
		// cant access to depend on
	}

	public void updateAssociationDef(AssociationDef asoOld, AssociationDef asoNew) {
		System.out.println("Actualizando asociacion: "+asoOld.getName().getValue());
		asoOld.setDocumentation(asoNew.getDocumentation());
		asoOld.setAbstract(asoNew.isAbstract());
		asoOld.setPropFinal(asoNew.isPropFinal());
		//extended
		//specialized
		//detived from
		/*
		 * Check attributes from associationdef
		 */
		/*
		 * Check roles from associationdef
		 */
		// restrictions
	}
	
	public void updateViewDef(ViewDef viewOld, ViewDef viewNew) {
		System.out.println("Actualizando vista: "+viewOld.getName().getValue());
		viewOld.setDocumentation(viewNew.getDocumentation());
		viewOld.setSyntax(viewNew.getSyntax());
		// Depends on 
	}
	
	
	public void updateGraphicDef(GraphicDef graphOld, GraphicDef graphNew){
		System.out.println("Actualizando grafico: "+graphOld.getName().getValue());
		graphOld.setDocumentation(graphNew.getDocumentation());
		graphOld.setSyntax(graphNew.getSyntax());
		// Depends on 
	}
	/**
	 * Called whenever the part throws an exception.
	 * 
	 * @param exception
	 *            java.lang.Throwable
	 */
	protected void handleException(java.lang.Throwable exception) {
		LauncherView.getInstance().handleException(exception);
	}

}
