package ch.ehi.umleditor.application;

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
import ch.ehi.interlis.tools.AbstractClassDefUtility;
import ch.ehi.interlis.tools.ModelElementUtility;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.views.ViewDef;
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
					//list with sorted child from Model
					List newchild = obj.sortIliDefs(ModelElementUtility.getChildElements(modnew, null)); 
					List oldchild = obj.sortIliDefs(ModelElementUtility.getChildElements(modold, null)); 
					compareModelChild(oldchild, newchild);
				} else {
					//Create model
					System.out.println("Se supone que crearé el modelo " + modnew.getName().getValue());

				}

			}
		}
	}

	/**
	 * Compare child models between INTERLIS files
	 * @param oldchild 
	 * @param newchild
	 */
	public void compareModelChild(List oldchild, List newchild) {
		System.out.println("---> Comparando modelos <---");
		TransferFromUmlMetamodel obj = new TransferFromUmlMetamodel();
		int i = 0;
		int j = 0;
		while (i < newchild.size()) {
			if (j < oldchild.size() && i == j) {
				if (newchild.get(i) instanceof Diagram && oldchild.get(j) instanceof Diagram) {
					System.out.println("Diagram");
					i++;
					j++;
				}
				if (newchild.get(i) instanceof ClassDef && oldchild.get(j) instanceof ClassDef) {
					ClassDef newClass = (ClassDef) newchild.get(i);
					ClassDef oldClass = (ClassDef) oldchild.get(j);
					System.out.println("Clase nueva: "+newClass.getName().getValue());
					System.out.println("Clase vieja: "+oldClass.getName().getValue());

					if (newClass.getName().getValue().equals(oldClass.getName().getValue())) {
						updateClassDef(oldClass, newClass);
						compareClassChilds(oldClass, newClass); //see attributes
						i++;
						j++;
					} else {
						// maybe just can create a new class? or check next child? :/
						LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), rsrc.getString("CIFail"));
						break;
					}

				} else if (newchild.get(i) instanceof DomainDef && oldchild.get(j) instanceof DomainDef) {
					DomainDef newDom = (DomainDef) newchild.get(i);
					DomainDef oldDom = (DomainDef) oldchild.get(j);
					System.out.println("Dominio nuevo: "+newDom.getName().getValue());
					System.out.println("Dominio viejo: "+oldDom.getName().getValue());

					if (newDom.getName().getValue().equals(oldDom.getName().getValue())) {

						updateDomainDef(oldDom, newDom);
						i++;
						j++;

					} else {
						// maybe just can create a new domain? or check next child? :/
						LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), rsrc.getString("CIFail"));
						break;
					}
				} else if (newchild.get(i) instanceof FunctionDef && oldchild.get(j) instanceof FunctionDef) {
					FunctionDef newFnc = (FunctionDef) newchild.get(i);
					FunctionDef oldFnc = (FunctionDef) oldchild.get(j);
					System.out.println("Funcion nueva: "+newFnc.getName().getValue());
					System.out.println("Funcion vieja: "+oldFnc.getName().getValue());
					
					if (newFnc.getName().getValue().equals(oldFnc.getName().getValue())) {
						oldFnc.setDocumentation(newFnc.getDocumentation());
						System.out.println("Actualizando funcion: "+oldFnc.getName().getValue());
						// depends on cant access
						// text cant access

						i++;
						j++;
					} else {
						// maybe just can create a new domain? or check next child? :/
						LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), rsrc.getString("CIFail"));
						break;
					}

				} else if (newchild.get(i) instanceof GraphicParameterDef
						&& oldchild.get(j) instanceof GraphicParameterDef) {
					GraphicParameterDef newGpd = (GraphicParameterDef) newchild.get(i);
					GraphicParameterDef oldGpd = (GraphicParameterDef) oldchild.get(j);
					System.out.println("Parametro grafico nuevo: "+newGpd.getName().getValue());
					System.out.println("Parametro grafico viejo: "+oldGpd.getName().getValue());

					if (newGpd.getName().getValue().equals(oldGpd.getName().getValue())) {
						System.out.println("Actualizando parametro grafico: "+oldGpd.getName().getValue());
						oldGpd.setDocumentation(newGpd.getDocumentation());
						// depends on cant access
						// text cant access

						i++;
						j++;
					} else {
						// maybe just can create a new domain? or check next child? :/
						LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), rsrc.getString("CIFail"));
						break;
					}
				} else if (newchild.get(i) instanceof LineFormTypeDef && oldchild.get(j) instanceof LineFormTypeDef) {
					LineFormTypeDef newLft = (LineFormTypeDef) newchild.get(i);
					LineFormTypeDef oldLft = (LineFormTypeDef) oldchild.get(j);
					System.out.println("Linea nueva: "+newLft.getName().getValue());
					System.out.println("Linea vieja: "+oldLft.getName().getValue());

					if (newLft.getName().getValue().equals(oldLft.getName().getValue())) {
						System.out.println("Actualizando linea: "+oldLft.getName().getValue());
						oldLft.setDocumentation(newLft.getDocumentation());
						oldLft.setSyntax(newLft.getSyntax()); // structure?? check later
						i++;
						j++;
					} else {
						// maybe just can create a new domain? or check next child? :/
						LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), rsrc.getString("CIFail"));
						break;
					}

				} else if (newchild.get(i) instanceof MetaDataUseDef && oldchild.get(j) instanceof MetaDataUseDef) {
					MetaDataUseDef newMetadata = (MetaDataUseDef) newchild.get(i);
					MetaDataUseDef oldMetadata = (MetaDataUseDef) oldchild.get(j);
					System.out.println("Metadato nuevo: "+newMetadata.getName().getValue());
					System.out.println("Metadato viejo: "+oldMetadata.getName().getValue());
					if (newMetadata.getName().getValue().equals(oldMetadata.getName().getValue())) {
						
						updateMetaDataUseDef(oldMetadata, newMetadata);

						i++;
						j++;
					} else {
						// maybe just can create a new domain? or check next child? :/
						LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), rsrc.getString("CIFail"));
						break;
					}

				} else if (newchild.get(i) instanceof TopicDef && oldchild.get(j) instanceof TopicDef) {
					TopicDef newTopic = (TopicDef) newchild.get(i);
					TopicDef oldTopic = (TopicDef) oldchild.get(j);
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
						j++;

					} else {
						// maybe just can create a new domain? or check next child? :/
						LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), rsrc.getString("CIFail"));
						break;
					}
				} else if (newchild.get(i) instanceof UnitDef && oldchild.get(j) instanceof UnitDef) {
					UnitDef newUnit = (UnitDef) newchild.get(i);
					UnitDef oldUnit = (UnitDef) oldchild.get(j);
					System.out.println("Unidad nueva: "+newUnit.getName().getValue());
					System.out.println("Unidad vieja: "+oldUnit.getName().getValue());

					if (newUnit.getName().getValue().equals(oldUnit.getName().getValue())) {
						
						updateUnitDef(oldUnit, newUnit);
						i++;
						j++;
					} else {
						// maybe just can create a new domain? or check next child? :/
						LauncherView.getInstance().log(rsrc.getString("CIFuncDesc"), rsrc.getString("CIFail"));
						break;
					}

				} else {
					System.out.println(i + "Cosas no identificadas nuevo:" + newchild.getClass().getName());
					System.out.println(i + "Cosas no identificadas viejo:" + newchild.getClass().getName());
					i++;
					j++;
				}
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
