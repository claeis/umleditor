package ch.ehi.umleditor.translationxml;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.interlis.constraints.ConstraintDef;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
import ch.ehi.interlis.domainsandconstants.basetypes.StructAttrType;
import ch.ehi.interlis.domainsandconstants.linetypes.LineFormTypeDef;
import ch.ehi.interlis.functions.FunctionDef;
import ch.ehi.interlis.graphicdescriptions.GraphicParameterDef;
import ch.ehi.interlis.metaobjects.MetaDataUseDef;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.tools.AbstractClassDefUtility;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.interlis.views.ViewDef;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.modelmanagement.Model;
import ch.interlis.ili2c.generator.nls.ElementType;
import ch.interlis.ili2c.generator.nls.Ili2TranslationXml;
import ch.interlis.ili2c.generator.nls.ModelElements;
import ch.interlis.ili2c.generator.nls.TranslationElement;

public class TransferToXml {

	private ModelElements modelElement = new ModelElements();

	/**
	 * All models are read in this method
	 * 
	 * @param model
	 *            Source Data
	 * @param xmlfile
	 *            path of the Destination file
	 * @return all collected elements are returned
	 * @throws Exception
	 *             Exception
	 */
	public ModelElements export(Model model, java.io.File xmlfile) throws Exception {
		Iterator modelI = model.iteratorOwnedElement();
		while (modelI.hasNext()) {
			Object obj = modelI.next();
			if (obj instanceof INTERLIS2Def) {
				if (willItContinue((INTERLIS2Def) obj)) {
					if (obj instanceof INTERLIS2Def) {
						String scopedNamePrefix = null;
						boolean showAllFields = true;
						Set<String> languages = new HashSet<String>();
						String baselanguage = findTheLanguages((INTERLIS2Def) obj, languages);
						Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) obj, null)
								.iterator();

						while (i.hasNext()) {
							ModelElement modelElement = (ModelElement) i.next();
							visitModelElement(modelElement, scopedNamePrefix, baselanguage, languages, showAllFields);
							showAllFields = false;
						}
					}
				}
			}
		}
		Ili2TranslationXml.writeModelElementsAsXML(modelElement, xmlfile);
		return modelElement;
	}

	/**
	 * It is determined whether loop will continue or not.
	 * 
	 * @param obj
	 * @return True : Continue, False : skip this Object
	 */
	private boolean willItContinue(INTERLIS2Def obj) {
		if (obj.getDefLangName().startsWith("<")) {
			return false;
		}
		return true;
	}

	/**
	 * Fills the XML structure with the entries in the Model Element.
	 * 
	 * @param modelDef
	 *            given Model Element
	 * @param scopedNamePrefix
	 *            Scope Name
	 * @param baselanguage
	 *            Base Language in Model
	 * @param languages
	 *            Valid second languages
	 * @param showAllFields
	 *            it sets empty all field of Structure
	 */
	private void visitModelElement(ModelElement modelDef, String scopedNamePrefix, String baselanguage, Set languages,
			boolean showAllFields) {

		TranslationElement translationElement = new TranslationElement();
		if (showAllFields == true) {
			allFieldsMakeEmpty(translationElement);
		}

		translationElement.setElementType(getElementType(modelDef));
		scopedNamePrefix = setScopedName(scopedNamePrefix, modelDef, baselanguage);
		translationElement.setScopedName(scopedNamePrefix);

		Map name = modelDef.getName().getAllValues();
		Map documentation = modelDef.getDocumentation().getAllValues();
		java.util.Iterator languagei = languages.iterator();
		while (languagei.hasNext()) {
			String language = (String) languagei.next();

			setName((String) name.get(language), translationElement, language);
			if (modelDef.getDocumentation() != null) {
				setDocumentation((String) documentation.get(language), translationElement, language);
			}
		}

		modelElement.add(translationElement);

		// visit children
		if (modelDef instanceof AbstractClassDef) {
			Iterator childi = AbstractClassDefUtility.getIliAttributes((AbstractClassDef) modelDef).iterator();
			while (childi.hasNext()) {
				Object object = childi.next();
				if (object instanceof AttributeDef) {
					visitModelElement((ModelElement) object, scopedNamePrefix, baselanguage, languages, false);
				}
			}

			if(modelDef instanceof AssociationDef) {
				visitAssociationDef((AssociationDef)modelDef, scopedNamePrefix, baselanguage, languages);
			}
			
			Iterator contstraintI = modelDef.iteratorConstraint();
			while(contstraintI.hasNext()) {
				Constraint constraint = (Constraint) contstraintI.next();
				visitModelElement(constraint, scopedNamePrefix, baselanguage, languages, false);
			}

		} else if (modelDef instanceof Namespace) {
			Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) modelDef, null)
					.iterator();

			while (i.hasNext()) {
				ModelElement modelElement = (ModelElement) i.next();
				visitModelElement(modelElement, scopedNamePrefix, baselanguage, languages, false);
			}


			if (modelDef instanceof DomainDef) {
				DomainDef domain = (DomainDef) modelDef;
				if (domain.containsType()) {
					Type type = (Type) domain.getType();
					if (type instanceof Enumeration) {
						Enumeration enumeration = (Enumeration) type;
						printAllEnumeration(scopedNamePrefix, baselanguage, languages, enumeration);
					}

				}
			}

		} else if (modelDef instanceof AttributeDef) {
			AttributeDef def = (AttributeDef) modelDef;
			if (def.containsAttrType()) {
				DomainAttribute attrType = (DomainAttribute) def.getAttrType();
				if (attrType.getDirect() instanceof Enumeration) {
					Enumeration enumeration = (Enumeration) attrType.getDirect();
					printAllEnumeration(scopedNamePrefix, baselanguage, languages, enumeration);
				}
			}
		}
	}

	private void visitAssociationDef(AssociationDef assoDef, String scopedNamePrefix, String baselanguage,
			Set languages) {
		Iterator assoDefI = assoDef.iteratorConnection();
		while (assoDefI.hasNext()) {
			RoleDef roleDef = (RoleDef) assoDefI.next();
			visitModelElement(roleDef, scopedNamePrefix, baselanguage, languages, false);

		}
	}

	/**
	 * it gets all Enumeration and SubEnumeration data and insert into Structure
	 * with language
	 * 
	 * @param ScopedNamePrefix
	 *            Scope Name
	 * @param baselanguage
	 *            Base Language
	 * @param languages
	 *            Valid Second languages
	 * @param enumeration
	 *            Related Enumeration Elements
	 */
	private void printAllEnumeration(String scopedNamePrefix, String baselanguage, Set languages,
			Enumeration enumeration) {
		Iterator<EnumElement> enumEle = enumeration.iteratorEnumElement();
		while (enumEle.hasNext()) {
			EnumElement enumElement = (EnumElement) enumEle.next();
			visitModelElement(enumElement, scopedNamePrefix, baselanguage, languages, false);
			if (enumElement.containsChild()) {
				String scopeName = scopedNamePrefix + "." + enumElement.getName().getValue(baselanguage);
				printAllEnumeration(scopeName, baselanguage, languages, enumElement.getChild());
			}

		}
	}

	/**
	 * in the beginning, it makes null all fields of the Structure
	 * 
	 * @param translationElement
	 */
	private void allFieldsMakeEmpty(TranslationElement translationElement) {
		translationElement.setDocumentation_de("");
		translationElement.setDocumentation_en("");
		translationElement.setDocumentation_fr("");
		translationElement.setDocumentation_it("");

		translationElement.setName_de("");
		translationElement.setName_en("");
		translationElement.setName_fr("");
		translationElement.setName_it("");

		translationElement.setScopedName("");
	}

	/**
	 * Fill document field in Structure by language
	 * 
	 * @param documentation
	 *            value of the documentation field
	 * @param translationElement
	 *            Structure of the XML
	 * @param language
	 *            Expected Document language
	 */
	private void setDocumentation(String documentation, TranslationElement translationElement, String language) {
		if (language.equalsIgnoreCase(Ili2TranslationXml.DE)) {
			translationElement.setDocumentation_de(documentation);
		} else if (language.equalsIgnoreCase(Ili2TranslationXml.EN)) {
			translationElement.setDocumentation_en(documentation);
		} else if (language.equalsIgnoreCase(Ili2TranslationXml.FR)) {
			translationElement.setDocumentation_fr(documentation);
		} else if (language.equalsIgnoreCase(Ili2TranslationXml.IT)) {
			translationElement.setDocumentation_it(documentation);
		}
	}

	/**
	 * Fill Name field in Structure by language
	 * 
	 * @param name
	 *            Value of the Name field
	 * @param translationElement
	 *            Structure of the XML
	 * @param language
	 *            Expected Name language
	 */
	private void setName(String name, TranslationElement translationElement, String language) {
		if (language.equalsIgnoreCase(Ili2TranslationXml.DE)) {
			translationElement.setName_de(name);
		} else if (language.equalsIgnoreCase(Ili2TranslationXml.FR)) {
			translationElement.setName_fr(name);
		} else if (language.equalsIgnoreCase(Ili2TranslationXml.IT)) {
			translationElement.setName_it(name);
		} else if (language.equalsIgnoreCase(Ili2TranslationXml.EN)) {
			translationElement.setName_en(name);
		}
	}

	/**
	 * it finds the all used languages in the Model Element
	 * 
	 * @param modelDef
	 * @param languages
	 *            if exists, it gives back the Valid second languages
	 * @return it returns back the base Language from Model
	 */
	private String findTheLanguages(INTERLIS2Def modelDef, Set languages) {
		java.util.Set set = ch.ehi.interlis.tools.ModelElementUtility.getChildElements(modelDef, ModelDef.class);
		java.util.Iterator iterator = set.iterator();

		String baseLanguage = "";
		while (iterator.hasNext()) {
			ModelDef modelDefLangu = (ModelDef) iterator.next();
			// 1) get the BaseLanguage
			if (modelDefLangu.getBaseLanguage() != null) {
				baseLanguage = modelDefLangu.getBaseLanguage();
				languages.add(modelDefLangu.getBaseLanguage());
			}
			languages.addAll(((ModelDef) modelDefLangu).getValidSecondLanguages());
		}
		return baseLanguage;
	}

	/**
	 * it concatenates the Scope Name of the given Model Element as a parameter.
	 * 
	 * @param scopedNamePrefix
	 *            Full Scope Name
	 * @param modelElement
	 *            parameter to be concatenated Element
	 * @param language
	 *            it gets Related Element Name as parameter language
	 * @return concatenated Scope Name
	 */
	private String setScopedName(String scopedNamePrefix, ModelElement modelElement, String language) {
		if (scopedNamePrefix == null) {
			scopedNamePrefix = modelElement.getName().getValue(language);
		} else {
			scopedNamePrefix += "." + modelElement.getName().getValue(language);
		}
		return scopedNamePrefix;
	}

	/**
	 * it returns the Element name of the given object as a parameter.
	 * 
	 * @param obj
	 *            Element Type
	 * @return Name of the Element Type
	 */
	private String getElementType(Object obj) {
		if (obj instanceof MetaDataUseDef) {
			return ElementType.META_DATA_BASKET;
		} else if (obj instanceof ViewDef) {
			return ElementType.VIEW;
		} else if (obj instanceof UnitDef) {
			return ElementType.UNIT;
		} else if (obj instanceof FunctionDef) {
			return ElementType.FUNCTION;
		} else if (obj instanceof LineFormTypeDef) {
			return ElementType.LINE_FORM;
		} else if (obj instanceof ConstraintDef) {
			return ElementType.CONSTRAINT;
		} else if (obj instanceof AttributeDef) {
			return ElementType.ATTRIBUTE;
		} else if (obj instanceof RoleDef) {
			return ElementType.ROLE;
		} else if (obj instanceof AbstractClassDef) {
			return findElementType(obj);
		} else if (obj instanceof DomainDef) {
			return ElementType.DOMAIN;
		} else if (obj instanceof GraphicParameterDef) {
			return ElementType.GRAPHIC;
		} else if (obj instanceof ClassDef) {
			return ElementType.CLASS;
		} else if (obj instanceof AssociationDef) {
			return ElementType.ASSOCIATION;
		} else if (obj instanceof ModelDef) {
			return ElementType.MODEL;
		} else if (obj instanceof Constraint) { 
			return ElementType.CONSTRAINT;
		} else if (obj instanceof EnumElement) {
			return ElementType.ENUMERATION_ELEMENT;
		} else if (obj instanceof TopicDef) {
			return ElementType.TOPIC;
		} else {
			return null;
		}
	}

	/**
	 * it gives as a return parameter the Name of the Element type
	 * 
	 * @param model
	 *            related model Element
	 * @return it returns name of the related matches Element as a String
	 */
	private String findElementType(Object obj) {
		AbstractClassDef abstractClassDefiniton = (AbstractClassDef) obj;
		if (abstractClassDefiniton instanceof AssociationDef) {
			return ElementType.ASSOCIATION;
		} else {
			return ElementType.CLASS;		
		}
	}
}