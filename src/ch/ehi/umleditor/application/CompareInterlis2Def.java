package ch.ehi.umleditor.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

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
import ch.ehi.interlis.modeltopicclass.Contract;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.IliImport;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.modeltopicclass.Translation;
import ch.ehi.interlis.tools.AbstractClassDefUtility;
import ch.ehi.interlis.tools.ModelElementUtility;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.views.ViewDef;
import ch.ehi.uml1_4.foundation.core.Generalization;
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

	TransferFromUmlMetamodel obj = new TransferFromUmlMetamodel();
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

		// Update attributes of InterlisDef
		updateINTERLIS2Def(oldInterlis, newInterlis);
		
		// List with sorted models from InterlisFile
		List listold = obj.sortIliDefs(ModelElementUtility.getChildElements(oldInterlis, ModelDef.class));
		List listnew = obj.sortIliDefs(ModelElementUtility.getChildElements(newInterlis, ModelDef.class));
		
		// recorrer interlisDef nuevo si hay modelos nuevos, se copian en el interlisDef viejo
		addNewModels(oldInterlis, listold, listnew);
		
		removeAndUpdateOldModels(newInterlis, listold, listnew);
		
		// visit all ModelDef
		for (int i = 0; i < listold.size(); i++) {
			ModelDef modold = (ModelDef) listold.get(i);
			String oldName = modold.getName().getValue();		
			int newIndex = findIndexInListByName(oldName, listnew);
			if (newIndex == -1) {
				System.out.println("No encontre actualización del elemento en el nuevo modelo, debería elminar?");
				oldInterlis.removeOwnedElement(modold);
			} else {
				ModelDef modnew = (ModelDef) listold.get(newIndex);
				System.out.println("Modelo viejo: " + modold.getName().getValue());
				System.out.println("Modelo nuevo: " + modnew.getName().getValue());
				Iterator<?> it = modnew.iteratorOwnedElement();
			    while(it.hasNext()) {
			    	Object ownedEle = it.next();
			    	System.out.println(ownedEle);
			    	if(ownedEle instanceof ch.ehi.interlis.modeltopicclass.TopicDef) {
			    		TopicDef newTopic = (TopicDef) ownedEle;
			    		String topicName = newTopic.getName().getValue();
			    		TopicDef oldTopic = (TopicDef)findOwnedElementByName(topicName, modold);
			    		if(oldTopic != null) {
			    			System.out.println("oldTopic:" + oldTopic.getName().getValue());
				    		System.out.println("newTopic:" + newTopic.getName().getValue());
				    		updateTopicDef(oldTopic, newTopic); // actualiza topic, REVISAR hijos luego
			    		}
			    		else {
			    			System.out.println("Debería crear un nuevo topic");
			    			newInterlis.addOwnedElement(newTopic);
			    		}
			    		
			    	} else if(ownedEle instanceof ch.ehi.interlis.domainsandconstants.DomainDef){
			    		DomainDef newDomain = (DomainDef) ownedEle;
			    		String domainName = newDomain.getName().getValue();
			    		DomainDef oldDomain = (DomainDef)findOwnedElementByName(domainName, modold);
			    		System.out.println("oldDomain:" + oldDomain.getName().getValue());
			    		System.out.println("newDomain:" + oldDomain.getName().getValue());
			    		updateDomainDef(oldDomain, newDomain);
			    	} else if(ownedEle instanceof ClassDef){
			    		ClassDef newClass = (ClassDef) ownedEle;
			    		String className = newClass.getName().getValue();
			    		ClassDef oldClass = (ClassDef)findOwnedElementByName(className, modold);
			    		System.out.println("oldClass:" + oldClass.getName().getValue());
			    		System.out.println("newClass:" + newClass.getName().getValue());
			    		updateClassDef(oldClass, newClass);
			    	} else if(ownedEle instanceof GraphicParameterDef){
			    		GraphicParameterDef newGraphic = (GraphicParameterDef) ownedEle;
			    		String genName = newGraphic.getName().getValue();
			    		GraphicParameterDef oldGraphic = (GraphicParameterDef)findOwnedElementByName(genName, modold);
			    		System.out.println("oldGraphic:" + oldGraphic.getName().getValue());
			    		System.out.println("newGraphic:" + newGraphic.getName().getValue());
			    		updateGraphicParameterDef(oldGraphic, newGraphic);
			    	} else if(ownedEle instanceof MetaDataUseDef){
			    		MetaDataUseDef newMetadata = (MetaDataUseDef) ownedEle;
			    		String metadataName = newMetadata.getName().getValue();
			    		MetaDataUseDef oldMetadata = (MetaDataUseDef)findOwnedElementByName(metadataName, modold);
			    		System.out.println("oldMetadata:" + oldMetadata.getName().getValue());
			    		System.out.println("newMetadata:" + newMetadata.getName().getValue());
			    		updateMetadataUseDef(oldMetadata, newMetadata);
			    	}  else if(ownedEle instanceof FunctionDef){
			    		FunctionDef newFunction = (FunctionDef) ownedEle;
			    		String functionName = newFunction.getName().getValue();
			    		FunctionDef oldFunction = (FunctionDef)findOwnedElementByName(functionName, modold);
			    		System.out.println("oldFunction:" + oldFunction.getName().getValue());
			    		System.out.println("newFunction:" + newFunction.getName().getValue());
			    		updateFunctionDef(oldFunction, newFunction);
			    	} else {
			    		System.out.println(ownedEle.getClass());
			    	}
			    }
			    System.out.println("bye");
				
			}			
		}
		LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), oldInterlis.getName().getValue()+" Updated!");
	}
	
	private void updateMetadataUseDef(MetaDataUseDef oldMetadata, MetaDataUseDef newMetadata) {
		oldMetadata.setBasketOid(newMetadata.getBasketOid());
		oldMetadata.setKind(newMetadata.getKind());
		oldMetadata.setDocumentation(newMetadata.getDocumentation());
		//
		oldMetadata.setSyntax(newMetadata.getSyntax());
		
	}

	private void updateGraphicParameterDef(GraphicParameterDef oldGraphic, GraphicParameterDef newGraphic) {
		oldGraphic.setDocumentation(newGraphic.getDocumentation());
		//depends on missed
		oldGraphic.setSyntax(newGraphic.getSyntax());
		
	}

	private void updateFunctionDef(FunctionDef oldFunction, FunctionDef newFunction) {
		oldFunction.setDocumentation(newFunction.getDocumentation());
		//depends on missed
		oldFunction.setSyntax(newFunction.getSyntax());
		
	}

	private void updateTopicDef(TopicDef oldTopic, TopicDef newTopic) {
		oldTopic.setKind(newTopic.getKind());
		oldTopic.setDocumentation(newTopic.getDocumentation());
		oldTopic.setAbstract(newTopic.isAbstract());
		oldTopic.setPropFinal(newTopic.isPropFinal());
		// Extends
		// Oid
		// Dependency
		//updateChildTopic(oldTopic, newTopic);
	}

	public int findIndexInListByName(String oldName, List listnew) {
		for (int i = 0; i < listnew.size(); i++) {
			String newName = "";
			if (listnew.get(i) instanceof ModelDef) {
				ModelDef modnew = (ModelDef) listnew.get(i);
				newName = modnew.getName().getValue();		
			}
			else if(listnew.get(i) instanceof DomainDef) {
				DomainDef domnew = (DomainDef) listnew.get(i);
				newName = domnew.getName().getValue();
			}
			else if(listnew.get(i) instanceof TopicDef) {
				TopicDef topicnew = (TopicDef) listnew.get(i);
				newName = topicnew.getName().getValue();
			}
			// compara los nombres encontrados
			if (newName.equals(oldName)) {
				return i;
			}
			
		}
		return -1;
	}
	
	public Object findOwnedElementByName(String findname, ModelDef model) {
		Iterator<?> it = model.iteratorOwnedElement();
	    while(it.hasNext()) {
	    	Object ownedEle = it.next();
	    	System.out.println(ownedEle);
	    	String name = "";
	    	if(ownedEle instanceof ch.ehi.interlis.modeltopicclass.TopicDef) {
	    		TopicDef topic = (TopicDef) ownedEle;
	    		name = topic.getName().getValue();
	    	} else if(ownedEle instanceof ch.ehi.interlis.domainsandconstants.DomainDef){
	    		DomainDef domain = (DomainDef) ownedEle;
	    		name = domain.getName().getValue();
	    	} else if(ownedEle instanceof ClassDef){
	    		ClassDef classd = (ClassDef) ownedEle;
	    		name = classd.getName().getValue();
	    	} else if(ownedEle instanceof GraphicParameterDef){
	    		GraphicParameterDef graphic = (GraphicParameterDef) ownedEle;
	    		name = graphic.getName().getValue();
	    	} else if(ownedEle instanceof MetaDataUseDef){
	    		MetaDataUseDef metadata = (MetaDataUseDef) ownedEle;
	    		name = metadata.getName().getValue();
	    	} else if(ownedEle instanceof FunctionDef){
	    		FunctionDef function = (FunctionDef) ownedEle;
	    		name = function.getName().getValue();
	    	}
	    	if (name.equals(findname)) {
	    		return ownedEle;
	    	}
	    }
		return null;
	}
	
	public void addNewModels(INTERLIS2Def oldInterlis, List listold, List listnew) {
		
		for (int i = 0; i < listnew.size(); i++) {
			ModelDef modnew = (ModelDef) listnew.get(i);
			String newName = modnew.getName().getValue();		
			int oldIndex = findIndexInListByName(newName, listold);
			if (oldIndex == -1) {
				System.out.println("No encontre el modelo " + newName + " en la lista vieja.");
				if (modnew instanceof ModelDef) {
					oldInterlis.addOwnedElement(modnew);
				} 
				
			} else {
			
			}
		}
	}
	
	public void updateINTERLIS2Def(INTERLIS2Def oldInterlis, INTERLIS2Def newInterlis) {
		oldInterlis.setVersion(newInterlis.getVersion());
		oldInterlis.setDocumentation(newInterlis.getDocumentation());
	}
	
	public void removeAndUpdateOldModels(INTERLIS2Def newInterlis, List listold, List listnew) {
		
		for (int i = 0; i < listold.size(); i++) {
			ModelDef modold = (ModelDef) listold.get(i);
			String oldName = modold.getName().getValue();		
			int newIndex = findIndexInListByName(oldName, listnew);
			if (newIndex == -1) {
				System.out.println("No encontre el modelo " + oldName + " en la lista nueva.");
				if (modold instanceof ModelDef) {
					oldInterlis.removeOwnedElement(modold);
				} else {
					System.out.println("Agrega un caso para eliminar la clase no registrada:");
					System.out.println(modold.getClass());
				}
				
			} else {
				// como se que ya existe el modelo en ambas listas, voy a actualizar
				ModelDef modnew = (ModelDef) listnew.get(newIndex);
				updateModelDef(modold, modnew);
			}
		}
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
	public void updateModelDef(ModelDef modold, ModelDef modnew) {
		updateAtributesOfModelDef(modold, modnew);
		updateImportsOfModelDef(modold, modnew);
		//updateTranslationsOfModelDef(modold, modnew);
		
		// hijos del modelo 
		List newChildModel = obj.sortIliDefs(ModelElementUtility.getChildElements(modnew, null)); 
		List oldChildModel = obj.sortIliDefs(ModelElementUtility.getChildElements(modold, null)); 
		
		// recorrer modelDef nuevo si hay hijos de modelo nuevos, se copian en el modelDef viejo
		addNewChildModels(modold, oldChildModel, newChildModel);
		removeAndUpdateOldChildModelDef(modold, oldChildModel, newChildModel);
	}

	private void removeAndUpdateOldChildModelDef(ModelDef modold, List oldChildModel, List newChildModel) {
		for (int i = 0; i < oldChildModel.size(); i++) {
			ModelElement modElementOld = (ModelElement) oldChildModel.get(i);
			String oldName = modElementOld.getName().getValue();		
			int newIndex = findIndexInListByName(oldName, newChildModel);
			if (newIndex == -1) {
				System.out.println("No encontre el elemento " + oldName + " en la lista nueva.");
				if (modElementOld instanceof ClassDef) {
					System.out.println("Eliminando " +oldName);
					modold.removeOwnedElement(modElementOld);
				} 
				else if(modElementOld instanceof DomainDef) {
					System.out.println("Eliminando " +oldName);
					modold.removeOwnedElement(modElementOld);					
				}
				else if(modElementOld instanceof FunctionDef) {
					System.out.println("Eliminando " +oldName);
					modold.removeOwnedElement(modElementOld);					
				}
				else if(modElementOld instanceof GraphicParameterDef) {
					System.out.println("Eliminando " +oldName);
					modold.removeOwnedElement(modElementOld);
				}
				else if(modElementOld instanceof MetaDataUseDef) {
					System.out.println("Eliminando " +oldName);
					modold.removeOwnedElement(modElementOld);
				}
				else if(modElementOld instanceof TopicDef) {
					System.out.println("Eliminando " +oldName);
					modold.removeOwnedElement(modElementOld);
				}
				else {
					System.out.println("Agrega un caso para eliminar la clase no registrada:");
					System.out.println(modold.getClass());
				}
				
			} else {
				// como se que ya existe el elemento en ambos modelos, voy a actualizar
				if (modElementOld instanceof ClassDef) {
					ClassDef clsNew = (ClassDef) newChildModel.get(newIndex);
					ClassDef clsOld = (ClassDef) modElementOld;
					updateClassDef(clsOld, clsNew);
				} 
				else if(modElementOld instanceof DomainDef) {
					DomainDef newDomain = (DomainDef) newChildModel.get(newIndex);
					DomainDef oldDomain = (DomainDef) modElementOld;
					updateDomainDef(oldDomain, newDomain); 					
				}
				else if(modElementOld instanceof FunctionDef) {
					FunctionDef newFunction = (FunctionDef) newChildModel.get(newIndex);
					FunctionDef oldFunction = (FunctionDef) modElementOld;
					updateFunctionDef(oldFunction, newFunction);
				}
				else if(modElementOld instanceof GraphicParameterDef) {
					GraphicParameterDef newGraphic = (GraphicParameterDef) newChildModel.get(newIndex);
					GraphicParameterDef oldGraphic = (GraphicParameterDef) modElementOld;
					updateGraphicParameterDef(oldGraphic, newGraphic);
				}
				else if(modElementOld instanceof MetaDataUseDef) {
					MetaDataUseDef mtdNew = (MetaDataUseDef) newChildModel.get(newIndex);
					MetaDataUseDef mtdOld = (MetaDataUseDef) modElementOld;
					updateMetaDataUseDef(mtdOld, mtdNew);
				}
				else if(modElementOld instanceof TopicDef) {
					TopicDef newTopic = (TopicDef) newChildModel.get(newIndex);
					TopicDef oldTopic = (TopicDef) modElementOld;
					updateTopicDef(oldTopic, newTopic); // actualiza topic, REVISAR hijos luego
				}
				
			}
		}
		
	}

	private void addNewChildModels(ModelDef modold, List oldChildModel, List newChildModel) {
		for (int i = 0; i < newChildModel.size(); i++) {
			ModelElement modElementNew = (ModelElement) newChildModel.get(i);
			String newName = modElementNew.getName().getValue();		
			int oldIndex = findIndexInListByName(newName, oldChildModel);
			if (oldIndex == -1) { // si no esta en la lista vieja se agrega
				System.out.println("No encontre el elemento " + newName + " en la lista vieja.");
				if (modElementNew instanceof ModelDef) {
					oldInterlis.addOwnedElement(modElementNew);
				}
				else if(modElementNew instanceof DomainDef) {
					System.out.println("Agregando "+modElementNew.getName().getValue());
					modold.addOwnedElement(modElementNew);
				}
				else if(modElementNew instanceof ClassDef) {
					System.out.println("Agregando "+modElementNew.getName().getValue());
					modold.addOwnedElement(modElementNew);
				}
				else if(modElementNew instanceof FunctionDef) {
					System.out.println("Agregando "+modElementNew.getName().getValue());
					modold.addOwnedElement(modElementNew);
				}
				else if(modElementNew instanceof ch.interlis.ili2c.metamodel.GraphicParameterDef) {
					System.out.println("Agregando "+modElementNew.getName().getValue());
					modold.addOwnedElement(modElementNew);
				}
				else if(modElementNew instanceof MetaDataUseDef) {
					System.out.println("Agregando "+modElementNew.getName().getValue());
					modold.addOwnedElement(modElementNew);
				}
				else if(modElementNew instanceof TopicDef) {
					System.out.println("Agregando Topic: "+modElementNew.getName().getValue());
					modold.addOwnedElement(modElementNew);
				}
				else {
					System.out.println("Clases por agregar:");
					System.out.println(modElementNew.getClass());
				}
				
			} else {
				
			}
		}
		
	}

	private void updateImportsOfModelDef(ModelDef modold, ModelDef modnew) {
		Iterator oldimportsi = modold.iteratorIliImport();
		while (oldimportsi.hasNext()) {
			Object obj = oldimportsi.next();
			ch.ehi.interlis.modeltopicclass.IliImport oldimport = (ch.ehi.interlis.modeltopicclass.IliImport) obj;
			System.out.println("Size supplier: " + oldimport.sizeSupplier());
			// POR FAVOR, validar el supplier
			if(oldimport.sizeSupplier() != 0) {
				ModelElement supplier = (ModelElement)oldimport.iteratorSupplier().next();
				String oldName = supplier.getName().getValue();
				IliImport newimport = findImportByName(oldName, modnew);
				if (newimport == null) {
					// si el import viejo no existe en la nueva lista lo elimina
					modold.removeClientDependency(oldimport);
				} else {
					//si ya existe, déjelo
					//modold.removeClientDependency(oldimport);
					//modold.addClientDependency(newimport);
					}
			}//si no tiene nada el viejo se añade uno nuevo? 
			
			
		}
		
		Iterator newimportsi = modnew.iteratorIliImport();
		while (newimportsi.hasNext()) {
			Object obj = newimportsi.next();
			ch.ehi.interlis.modeltopicclass.IliImport newimport = (ch.ehi.interlis.modeltopicclass.IliImport) obj;
			System.out.println("Size supplier: " + newimport.sizeSupplier());
			ModelElement supplier = (ModelElement)newimport.iteratorSupplier().next();
			String newName = supplier.getName().getValue();
			IliImport oldimport = findImportByName(newName, modold);
			if (oldimport == null) {
				// si no existe lo agrega
				modold.addClientDependency(newimport);
			} else {
				// si existe
			}
		}
	}

	private IliImport findImportByName(String findname, ModelDef modnew) {
		Iterator it = modnew.iteratorClientDependency();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof ch.ehi.interlis.modeltopicclass.IliImport) {				
				ch.ehi.interlis.modeltopicclass.IliImport _import = (ch.ehi.interlis.modeltopicclass.IliImport) obj;
				System.out.println("Size supplier: " + _import.sizeSupplier());
				if (_import.sizeSupplier() != 0) {
					ModelElement supplier = (ModelElement)_import.iteratorSupplier().next();
					String name = supplier.getName().getValue();				
					if (name.equals(findname)) {
						return _import;
					}
				}
				else {
					return null; // no hay supplier
				}
				
			} else {
				// do something with class
			}
		}
		return null;
	}

	private void updateAtributesOfModelDef(ModelDef modold, ModelDef modnew) {
		modold.setKind(modnew.getKind()); // tipo
		modold.setDocumentation(modnew.getDocumentation()); // description
		modold.setIssuerURI(modnew.getIssuerURI()); // issuer URI
		modold.setVersion(modnew.getVersion());
		modold.setVersionComment(modnew.getVersionComment());
		modold.setContracted(modnew.isContracted());
		modold.setBaseLanguage(modnew.getBaseLanguage()); // Languaje
		
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
		 * - see later attributes y esas cosas
		 */
	}

	public void updateDomainDef(DomainDef oldDomain, DomainDef newDomain) {
		System.out.println("Actualizando dominio: "+oldDomain.getName().getValue());
		oldDomain.setMetaAttrb(newDomain.getMetaAttrb());
		// can't access to type of domain (to do later) ¿newDomain.getType()?
		oldDomain.setDocumentation(newDomain.getDocumentation());
		oldDomain.setAbstract(newDomain.isAbstract());
		oldDomain.setPropFinal(newDomain.isPropFinal());
		oldDomain.setMandatory(newDomain.isMandatory());
		// can't access to Specialized (to do later)
		// can't access to kind (to do)

	}
	
	public void updateMetaDataUseDef(MetaDataUseDef mtdOld, MetaDataUseDef mtdNew) {
		System.out.println("Actualizando metadato: "+mtdOld.getName().getValue());
		mtdOld.setBasketOid(mtdNew.getBasketOid());
		mtdOld.setKind(mtdNew.getKind());
		mtdOld.setDocumentation(mtdNew.getDocumentation());
		mtdOld.setSyntax(mtdNew.getSyntax()); // Definition?? check later
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
