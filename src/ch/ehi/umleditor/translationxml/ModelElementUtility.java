package ch.ehi.umleditor.translationxml;

import java.util.Iterator;
import java.util.Set;

import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.tools.AbstractClassDefUtility;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.modelmanagement.Model;

public class ModelElementUtility {

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
    private static ModelElement findElementInEnumeration(String scopedNamePrefix, String baselanguage,
            Enumeration enumeration, String scopedNameToFind) {
        Iterator<EnumElement> enumEle = enumeration.iteratorEnumElement();
        while (enumEle.hasNext()) {
            EnumElement enumElement = (EnumElement) enumEle.next();
            ModelElement ele = findIliModelElement_Helper(enumElement, scopedNamePrefix, baselanguage,
                    scopedNameToFind);
            if (ele != null) {
                return ele;
            }
            if (enumElement.containsChild()) {
                String scopedName = scopedNamePrefix + "." + enumElement.getName().getValue(baselanguage);
                ModelElement modelElement = findElementInEnumeration(scopedName, baselanguage, enumElement.getChild(),
                        scopedNameToFind);
                if (modelElement != null) {
                    return modelElement;
                }
            }

        }
        return null;
    }

    /**
     * It search the Model Element scope name and Scope Name of XML Element. if
     * find, then returns back with related Model Element
     * 
     * @param modelElement
     *            given Model Element
     * @param scopedNamePrefix
     *            Scope Name
     * @param baseLanguage
     *            Base Language in Model
     * @param scopedNameToFind
     *            Expected Scope Name
     * @return Modified model Element
     */
    private static ModelElement findIliModelElement_Helper(ModelElement modelElement, String scopedNamePrefix,
            String baseLanguage, String scopedNameToFind) {
        scopedNamePrefix = ModelElementUtility.getScopedName(scopedNamePrefix, modelElement, baseLanguage);

        if (scopedNameToFind.equals(scopedNamePrefix)) {
            return modelElement;
        }

        // visit children
        if (modelElement instanceof AbstractClassDef) {
            Iterator childi = AbstractClassDefUtility.getIliAttributes((AbstractClassDef) modelElement).iterator();
            while (childi.hasNext()) {
                Object object = childi.next();
                if (object instanceof AttributeDef) {
                    ModelElement modelEle = findIliModelElement_Helper((ModelElement) object, scopedNamePrefix,
                            baseLanguage, scopedNameToFind);
                    if (modelEle != null) {
                        return modelEle;
                    }
                }
            }

            if (modelElement instanceof AssociationDef) {
                Iterator assoDefI = ((AssociationDef) modelElement).iteratorConnection();
                while (assoDefI.hasNext()) {
                    RoleDef roleDef = (RoleDef) assoDefI.next();
                    ModelElement modelEle = findIliModelElement_Helper(roleDef, scopedNamePrefix, baseLanguage,
                            scopedNameToFind);
                    if (modelEle != null) {
                        return modelEle;
                    }
                }
            }

            Iterator contstraintI = modelElement.iteratorConstraint();
            while (contstraintI.hasNext()) {
                Constraint constraint = (Constraint) contstraintI.next();
                ModelElement modelEle = findIliModelElement_Helper(constraint, scopedNamePrefix, baseLanguage,
                        scopedNameToFind);
                if (modelEle != null) {
                    return modelEle;
                }
            }

        } else if (modelElement instanceof Namespace) {
            Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) modelElement, null)
                    .iterator();

            while (i.hasNext()) {
                ModelElement modelDef = (ModelElement) i.next();
                ModelElement modelEle = findIliModelElement_Helper(modelDef, scopedNamePrefix, baseLanguage,
                        scopedNameToFind);
                if (modelEle != null) {
                    return modelEle;
                }
            }

            if (modelElement instanceof DomainDef) {
                DomainDef domain = (DomainDef) modelElement;
                if (domain.containsType()) {
                    Type type = (Type) domain.getType();
                    if (type instanceof Enumeration) {
                        Enumeration enumeration = (Enumeration) type;
                        ModelElement ele = findElementInEnumeration(scopedNamePrefix, baseLanguage, enumeration,
                                scopedNameToFind);
                        if (ele != null) {
                            return ele;
                        }
                    }

                }
            }

        } else if (modelElement instanceof AttributeDef) {
            AttributeDef def = (AttributeDef) modelElement;
            if (def.containsAttrType()) {
                DomainAttribute attrType = (DomainAttribute) def.getAttrType();
                if (attrType.containsDirect()) { 
                    if (attrType.getDirect() instanceof Enumeration) {
                        Enumeration enumeration = (Enumeration) attrType.getDirect();
                        ModelElement ele = findElementInEnumeration(scopedNamePrefix, baseLanguage, enumeration,
                                scopedNameToFind);
                        if (ele != null) {
                            return ele;
                        }
                    }                    
                }
            }
        }
        return null;
    }

    /**
     * it returns related Model Element via Scope Name
     * 
     * @param model
     *            Model to be translated
     * @param scopedName
     *            Expected Scope Name
     * @return it returns related Model Element via scope Name
     */
    public static ModelElement findIliModelElementByScopedName(Model model, String scopedName) {
        Iterator modelI = model.iteratorOwnedElement();
        while (modelI.hasNext()) {
            Object obj = modelI.next();
            if (obj instanceof INTERLIS2Def) {
                return modelElementHelper(obj, scopedName);
            } else {
                Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) obj, null)
                        .iterator();

                while (i.hasNext()) {
                    Object objnew = i.next();
                    return modelElementHelper(objnew, scopedName);
                }
            }
        }
        return null;
    }

    private static ModelElement modelElementHelper(Object obj, String scopedName) {
        if (!ModelElementUtility.isInternal((INTERLIS2Def) obj)) {
            if (obj instanceof INTERLIS2Def) {
                String baselanguage = ModelElementUtility.findTheBaseLanguages((INTERLIS2Def) obj);
                Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) obj, null)
                        .iterator();

                while (i.hasNext()) {
                    ModelElement modelElement = (ModelElement) i.next();
                    modelElement = findIliModelElement_Helper(modelElement, null, baselanguage, scopedName);
                    if (modelElement != null) {
                        return modelElement;
                    }
                }
            }
        }
        return null;
    }

    /**
     * it finds the all used languages in the Model Element
     * 
     * @param modelDef
     * @return it returns back the base Language from Model
     */
    public static String findTheBaseLanguages(INTERLIS2Def modelDef) {
        java.util.Set set = ch.ehi.interlis.tools.ModelElementUtility.getChildElements(modelDef, ModelDef.class);
        java.util.Iterator iterator = set.iterator();

        String baseLanguage = "";
        while (iterator.hasNext()) {
            ModelDef modelDefLangu = (ModelDef) iterator.next();
            if (modelDefLangu.getBaseLanguage() != null) {
                baseLanguage = modelDefLangu.getBaseLanguage();
            }
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
    private static String getScopedName(String scopedNamePrefix, ModelElement modelElement, String language) {
        if (modelElement.getName() != null) {
            if (scopedNamePrefix == null) {
                scopedNamePrefix = modelElement.getName().getValue(language);
            } else {
                scopedNamePrefix += "." + modelElement.getName().getValue(language);
            }
            return scopedNamePrefix;            
        }
        return null;
    }

    /**
     * Check if an INTERLIS2Def is an internal one. An internal one is not exported.
     * 
     * @param obj
     * @return True if this is an internal INTERLIS2Def that should not be exported
     */
    public static boolean isInternal(INTERLIS2Def obj) {
        if (obj.getDefLangName().startsWith("<")) {
            return true;
        }
        return false;
    }

}
