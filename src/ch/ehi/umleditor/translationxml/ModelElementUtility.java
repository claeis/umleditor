package ch.ehi.umleditor.translationxml;

import java.util.Iterator;

import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.interlis.constraints.ConstraintDef;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
import ch.ehi.interlis.metaobjects.ParameterDef;
import ch.ehi.interlis.modeltopicclass.AbstractClassDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.tools.AbstractClassDefUtility;
import ch.ehi.uml1_4.foundation.core.Association;
import ch.ehi.uml1_4.foundation.core.Classifier;
import ch.ehi.uml1_4.foundation.core.Constraint;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.modelmanagement.Model;

public class ModelElementUtility {

    private static java.util.Map<String, ModelElement> scopedName2element = null;
    private static String baselanguage = null;
    private static String enumScopedName = "";
    
    /**
     * it gets all Enumeration and SubEnumeration data and insert into Structure with language
     *  
     * @param scopedNamePrefix scope Name
     * @param enumeration Related Enumeration Elements
     */
    private static void getElementInEnumeration(String scopedNamePrefix, Enumeration enumeration) {
        Iterator<EnumElement> enumEle = enumeration.iteratorEnumElement();
        while (enumEle.hasNext()) {
            EnumElement enumElement = (EnumElement) enumEle.next();
            visitModelElements(enumElement);
            enumScopedName = scopedNamePrefix;

            if (enumElement.containsChild()) {
                enumScopedName = scopedNamePrefix + "." + enumElement.getName().getValue(baselanguage);
                getElementInEnumeration(scopedNamePrefix, enumElement.getChild());
            }
        }
    }

    /**
     * It search the Model Element scope name and Scope Name of XML Element. 
     * if find, then returns back with related Model Element
     * 
     * @param modelElement given Model Element
     */
    private static void visitModelElements(ModelElement modelElement) {
        String scopedName = "";
        if (enumScopedName.isEmpty()) {
            scopedName = getScopedName(modelElement);
        } else {
            scopedName = enumScopedName + "." + modelElement.getName().getValue(baselanguage);
        }

        if (!scopedName.isEmpty()) {
            scopedName2element.put(scopedName, modelElement);
        }

        // visit children
        if (modelElement instanceof AbstractClassDef) {
            Iterator childi = AbstractClassDefUtility.getIliAttributes((AbstractClassDef) modelElement).iterator();
            while (childi.hasNext()) {
                Object object = childi.next();
                if (object instanceof AttributeDef) {
                    AttributeDef attrDef = (AttributeDef) object;
                    visitModelElements(attrDef);
                }
            }

            if (modelElement instanceof ClassDef) {
                ClassDef classDef = (ClassDef) modelElement;
                Iterator iterator = classDef.iteratorParameterDef();
                while (iterator.hasNext()) {
                    ParameterDef next = (ParameterDef) iterator.next();
                    visitModelElements((ModelElement) next);
                }
            }

            if (modelElement instanceof AssociationDef) {
                Iterator assoDefI = ((AssociationDef) modelElement).iteratorConnection();
                while (assoDefI.hasNext()) {
                    RoleDef roleDef = (RoleDef) assoDefI.next();
                    visitModelElements(roleDef);
                }
            }

            Iterator contstraintI = modelElement.iteratorConstraint();
            while (contstraintI.hasNext()) {
                Constraint constraint = (Constraint) contstraintI.next();
                visitModelElements(constraint);
            }

        } else if (modelElement instanceof Namespace) {
            Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) modelElement, null)
                    .iterator();

            while (i.hasNext()) {
                ModelElement modelDef = (ModelElement) i.next();
                visitModelElements(modelDef);
            }

            if (modelElement instanceof DomainDef) {
                DomainDef domain = (DomainDef) modelElement;
                if (domain.containsType()) {
                    Type type = (Type) domain.getType();
                    if (type instanceof Enumeration) {
                        enumScopedName = getScopedName(domain);
                        Enumeration enumeration = (Enumeration) type;
                        getElementInEnumeration(enumScopedName, enumeration);
                        enumScopedName = "";
                    }

                }
            }

        } else if (modelElement instanceof AttributeDef) {
            AttributeDef def = (AttributeDef) modelElement;
            if (def.containsAttrType()) {
                DomainAttribute attrType = (DomainAttribute) def.getAttrType();
                if (attrType.containsDirect()) {
                    if (attrType.getDirect() instanceof Enumeration) {
                        enumScopedName = getScopedName(def);
                        Enumeration enumeration = (Enumeration) attrType.getDirect();
                        getElementInEnumeration(enumScopedName, enumeration);
                        enumScopedName = "";
                    }
                }
            }
        }
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

    public ModelElement findIliModelElementByScopedName(Model model, String scopedName) {
        if (scopedName2element == null) {
            scopedName2element = new java.util.HashMap<String, ModelElement>();
            setupMapping(model);
        }
        return scopedName2element.get(scopedName);
    }

    private void setupMapping(Model model) {
        Iterator modelI = model.iteratorOwnedElement();
        while (modelI.hasNext()) {
            Object obj = modelI.next();
            if (obj instanceof INTERLIS2Def) {
                modelElementHelper((INTERLIS2Def) obj);
            } else {
                Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) obj, null)
                        .iterator();

                while (i.hasNext()) {
                    Object objnew = i.next();
                    modelElementHelper((INTERLIS2Def) objnew);
                }
            }
        }

    }

    private void modelElementHelper(INTERLIS2Def obj) {
        if (!ModelElementUtility.isInternal((INTERLIS2Def) obj)) {
            if (obj instanceof INTERLIS2Def) {
                baselanguage = getBaseLanguages((INTERLIS2Def) obj);
                Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) obj, null)
                        .iterator();

                while (i.hasNext()) {
                    ModelElement modelElement = (ModelDef) i.next();
                    visitModelElements(modelElement);
                }
            }
        }
    }

    /**
     * it finds the all used languages in the Model Element
     * 
     * @param modelDef
     * @return it returns back the base Language from Model
     */
    public String getBaseLanguages(INTERLIS2Def modelDef) {
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
     * @param modelElement
     *            parameter to be concatenated Element
     * @return concatenated Scope Name
     */
    private static String getScopedName(ModelElement modelElement) {
        java.util.ArrayList<String> scopedName = new java.util.ArrayList<String>();
        String returnScopedName = "";
        Namespace namespace = null;
        if (modelElement.containsNamespace()) {
            scopedName.add(modelElement.getName().getValue(baselanguage));
            namespace = modelElement.getNamespace();

            while (!(namespace instanceof INTERLIS2Def)) {
                scopedName.add(0, namespace.getName().getValue(baselanguage));
                namespace = namespace.getNamespace();
            }
        } else {
            if (modelElement instanceof RoleDef) {
                RoleDef roleDef = (RoleDef) modelElement;
                Association association = roleDef.getAssociation();
                if (association.containsNamespace()) {
                    namespace = association.getNamespace();

                    while (!(namespace instanceof INTERLIS2Def)) {
                        scopedName.add(0, namespace.getName().getValue(baselanguage));
                        namespace = namespace.getNamespace();
                    }
                    scopedName.add(association.getName().getValue(baselanguage));
                    scopedName.add(roleDef.getName().getValue(baselanguage));
                }
            } else if (modelElement instanceof AttributeDef) {
                AttributeDef attrDef = (AttributeDef) modelElement;
                Classifier owner = attrDef.getOwner();
                if (owner.containsNamespace()) {
                    namespace = owner.getNamespace();

                    while (!(namespace instanceof INTERLIS2Def)) {
                        scopedName.add(0, namespace.getName().getValue(baselanguage));
                        namespace = namespace.getNamespace();
                    }
                    scopedName.add(owner.getName().getValue(baselanguage));
                    scopedName.add(attrDef.getName().getValue(baselanguage));
                }
            } else if (modelElement instanceof ParameterDef) {
                ClassDef classDef = ((ParameterDef) modelElement).getClassDef();
                if (classDef.containsNamespace()) {
                    namespace = classDef.getNamespace();

                    while (!(namespace instanceof INTERLIS2Def)) {
                        scopedName.add(0, namespace.getName().getValue(baselanguage));
                        namespace = namespace.getNamespace();
                    }
                    scopedName.add(classDef.getName().getValue(baselanguage));
                    scopedName.add(modelElement.getName().getValue(baselanguage));
                }
            } else if (modelElement instanceof ConstraintDef) {
                Iterator constrainedElement = ((ConstraintDef) modelElement).iteratorConstrainedElement();
                while (constrainedElement.hasNext()) {
                    Object next = constrainedElement.next();
                    if (next instanceof ClassDef) {
                        ClassDef classDef = (ClassDef) next;
                        if (classDef.containsNamespace()) {
                            namespace = classDef.getNamespace();

                            while (!(namespace instanceof INTERLIS2Def)) {
                                scopedName.add(0, namespace.getName().getValue(baselanguage));
                                namespace = namespace.getNamespace();
                            }
                            scopedName.add(classDef.getName().getValue(baselanguage));
                            scopedName.add(modelElement.getName().getValue(baselanguage));
                        }
                    }
                }
            }
        }
        for (int i = 0; i < scopedName.size(); i++) {
            if (i == 0) {
                returnScopedName = scopedName.get(i);
            } else {
                returnScopedName = returnScopedName + "." + scopedName.get(i);
            }
        }
        return returnScopedName;
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
