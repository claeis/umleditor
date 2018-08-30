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
import ch.ehi.uml1_4.implementation.UmlPackage;
import ch.ehi.uml1_4.modelmanagement.Model;

public class ModelElementUtility {

    private java.util.Map<String, ModelElement> scopedName2element = null;

    /**
     * it gets all Enumeration and SubEnumeration data and insert into Structure
     * with language
     * 
     * @param scopedNamePrefix
     *            scope Name
     * @param enumeration
     *            Related Enumeration Elements
     */
    private void visitEnumerationElement(String scopedNamePrefix, Enumeration enumeration, String baseLanguage) {
        Iterator<EnumElement> enumEle = enumeration.iteratorEnumElement();
        while (enumEle.hasNext()) {
            EnumElement enumElement = (EnumElement) enumEle.next();
            String scopedName = scopedNamePrefix + "." + enumElement.getName().getValue(baseLanguage);
            scopedName2element.put(scopedName, enumElement);

            if (enumElement.containsChild()) {
                visitEnumerationElement(scopedName, enumElement.getChild(), baseLanguage);
            }
        }
    }

    /**
     * It search the Model Element scope name and Scope Name of XML Element if find,
     * then returns back with related Model Element
     * 
     * @param modelElement
     *            given Model Element
     */
    private void visitModelElement(ModelElement modelElement) {
        if ((modelElement instanceof INTERLIS2Def) && isInternal((INTERLIS2Def) modelElement)) {
            return;
        }
        String scopedName = null;
        scopedName = getScopedName(modelElement);
        if (scopedName != null) {
            scopedName2element.put(scopedName, modelElement);
        }

        // visit children
        if (modelElement instanceof AbstractClassDef) {
            Iterator childi = AbstractClassDefUtility.getIliAttributes((AbstractClassDef) modelElement).iterator();
            while (childi.hasNext()) {
                Object object = childi.next();
                if (object instanceof AttributeDef) {
                    AttributeDef attrDef = (AttributeDef) object;
                    visitModelElement(attrDef);
                }
            }

            if (modelElement instanceof ClassDef) {
                ClassDef classDef = (ClassDef) modelElement;
                Iterator iterator = classDef.iteratorParameterDef();
                while (iterator.hasNext()) {
                    ParameterDef next = (ParameterDef) iterator.next();
                    visitModelElement((ModelElement) next);
                }
            }

            if (modelElement instanceof AssociationDef) {
                Iterator assoDefI = ((AssociationDef) modelElement).iteratorConnection();
                while (assoDefI.hasNext()) {
                    RoleDef roleDef = (RoleDef) assoDefI.next();
                    visitModelElement(roleDef);
                }
            }

            Iterator contstraintI = modelElement.iteratorConstraint();
            int idx = 1;
            while (contstraintI.hasNext()) {
                Constraint constraint = (Constraint) contstraintI.next();
                String name = constraint.getDefLangName();
                if (name == null) {
                    constraint.setDefLangName("Constraint" + idx);
                    idx++;
                }
                visitModelElement(constraint);
            }

        } else if (modelElement instanceof Namespace) {
            Iterator i = ch.ehi.interlis.tools.ModelElementUtility.getChildElements((Namespace) modelElement, null)
                    .iterator();

            while (i.hasNext()) {
                ModelElement modelDef = (ModelElement) i.next();
                visitModelElement(modelDef);
            }

            if (modelElement instanceof DomainDef) {
                DomainDef domain = (DomainDef) modelElement;
                if (domain.containsType()) {
                    Type type = (Type) domain.getType();
                    if (type instanceof Enumeration) {
                        String scopedNamePrefix = getScopedName(domain).toString();
                        Enumeration enumeration = (Enumeration) type;
                        visitEnumerationElement(scopedNamePrefix, enumeration, getBaseLanguage(domain));
                    }
                }
            }

        } else if (modelElement instanceof AttributeDef) {
            AttributeDef def = (AttributeDef) modelElement;
            if (def.containsAttrType()) {
                DomainAttribute attrType = (DomainAttribute) def.getAttrType();
                if (attrType.containsDirect()) {
                    if (attrType.getDirect() instanceof Enumeration) {
                        String scopedNamePrefix = getScopedName(def).toString();
                        Enumeration enumeration = (Enumeration) attrType.getDirect();
                        visitEnumerationElement(scopedNamePrefix, enumeration, getBaseLanguage(def.getOwner()));
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
        visitModelElement(model);
    }

    /**
     * it finds the all used languages in the Model Element
     * 
     * @param modelDef
     * @return it returns back the base Language from Model
     */
    private String getBaseLanguage(ModelElement modelElement) {
        return getModelDef(modelElement).getBaseLanguage();
    }

    private ModelDef getModelDef(ModelElement modelElement) {
        while (!(modelElement instanceof ModelDef)) {
            modelElement = modelElement.getNamespace();
        }
        return (ModelDef) modelElement;
    }

    /**
     * it concatenates the Scope Name of the given Model Element as a parameter.
     * 
     * @param modelElement
     *            parameter to be concatenated Element
     * @return concatenated Scope Name
     */
    private String getScopedName(ModelElement modelElement) {

        java.util.ArrayList<ModelElement> path = new java.util.ArrayList<ModelElement>();

        String baseLanguage = null;
        while (!(modelElement instanceof ModelDef)) {
            path.add(0, modelElement);
            if (modelElement instanceof RoleDef) {
                RoleDef roleDef = (RoleDef) modelElement;
                Association association = roleDef.getAssociation();
                modelElement = association;
            } else if (modelElement instanceof AttributeDef) {
                AttributeDef attrDef = (AttributeDef) modelElement;
                Classifier owner = attrDef.getOwner();
                modelElement = owner;
            } else if (modelElement instanceof ParameterDef) {
                ClassDef classDef = ((ParameterDef) modelElement).getClassDef();
                modelElement = classDef;
            } else if (modelElement instanceof ConstraintDef) {
                if (((ConstraintDef) modelElement).sizeConstrainedElement() != 1) {
                    throw new IllegalStateException("no owner of constraint");
                }
                Iterator constrainedElement = ((ConstraintDef) modelElement).iteratorConstrainedElement();
                modelElement = (ModelElement) constrainedElement.next();
            } else {
                if (!modelElement.containsNamespace()) {
                    break;
                }
                modelElement = modelElement.getNamespace();
            }
        }
        if (modelElement instanceof ModelDef) {
            baseLanguage = getBaseLanguage((ModelDef) modelElement);
        } else {
            return null;
        }
        path.add(0, modelElement);
        // 2. aus dem Pfad der ModelElement den scopedName bestimmen
        StringBuilder scopedName = new StringBuilder();
        String sep = "";
        for (ModelElement ele : path) {
            if (ele instanceof UmlPackage) {
                ; // skip it
            } else {
                scopedName.append(sep);
                scopedName.append(ele.getName().getValue(baseLanguage));
                sep = ".";
            }
        }
        return scopedName.toString();
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
