package ch.ehi.umleditor.application;

/* This file is part of the UML/INTERLIS-Editor.
 * For more information, please see <http://www.umleditor.org/>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
import ch.ehi.interlis.graphicdescriptions.*;
import ch.ehi.interlis.functions.*;
import ch.ehi.interlis.domainsandconstants.*;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.softenvironment.view.*;
import ch.ehi.uml1_4.implementation.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.interlis.attributes.*;
import ch.softenvironment.util.Tracer;
import ch.softenvironment.util.*;
/**
 * Utility Class for dealing with Element's.
 *
 * @author: Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.2 $ $Date: 2004-08-18 09:22:58 $
 */
public abstract class ElementUtils {
	// the concrete model presented by this TreeElement
	private static java.util.ResourceBundle resElementMapper = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/ElementUtils");
/**
 * Return errorMessage is Inheritance is ok otherwise null.
 */
public static String checkInheritance(GeneralizableElement parent, GeneralizableElement child) {
	// check inheritanceCycle
	if (child == parent) {
		return resElementMapper.getString("CESelfInheritance"); //$NON-NLS-1$
	}
/*
	// check cycle whether child is a parent of parent
	if (ch.ehi.uml1_4.tools.GeneralizableElementUtility.deepContainsGeneralizationParent(child, parent)) {
		return "Superklasse schon in der Hierarchy enthalten.";
	}
*/
	// check cycle whether child is a parent of parent
	if (ch.ehi.uml1_4.tools.GeneralizableElementUtility.deepContainsGeneralizationParent(parent, child)) {
		return resElementMapper.getString("CECyclicInheritance"); //$NON-NLS-1$
	}
	// INTERLIS allows only single Inheritance
	if (child.iteratorGeneralization().hasNext()) {
		return resElementMapper.getString("CEMultipleInheritance"); //$NON-NLS-1$
	}
	return null;
}
/**
 * Return the displayable name of a ModelElement:
 * Format: "ModelElementName (packageName)"
 * @param modelElement
 */
public static String formatWithPackageName(ModelElement modelElement) {
	return modelElement.getDefLangName() + " (" + ch.ehi.uml1_4.tools.ModelElementUtility.getUmlPath(modelElement, null) + ")";
}
/**
 * Return the default language String.
 */
public static String getDisplayName(Element element) {
	return getDisplayName(element.getClass());
}
/**
 * Return the default language String.
 */
public static String getDisplayName(java.lang.Class type) {
//	AttributeDef; INTERLIS2Def; MetaDataUseDef;
//	MetaObjectFile; RoleDef; UnitDef;
//	ClassExtends; TopicExtends	=> @see GeneralizationDialog
//	UmlUsage; TopicDepends		=> @see DependencyDialog

	if (type.equals(DomainDef.class)) {
		return resElementMapper.getString("CTDomainDef");
	}
	if (type.equals(ModelDef.class)) {
		return resElementMapper.getString("CTModelDef");
	}
	if (type.equals(ClassDef.class)) {
		return resElementMapper.getString("CTClassDef");
	}
	if (type.equals(AbstractClassDef.class)) {
		return resElementMapper.getString("CTAbstractClassDef");
	}
	if (type.equals(TopicDef.class)) {
		return resElementMapper.getString("CTTopicDef");
	}
	if (type.equals(FunctionDef.class)) {
		return resElementMapper.getString("CTFunctionDef");
	}
	if (type.equals(ch.ehi.interlis.graphicdescriptions.GraphicDef.class)) {
		return resElementMapper.getString("CTGraphicDef");
	}
	if (type.equals(GraphicParameterDef.class)) {
		return resElementMapper.getString("CTGraphicParameterDef");
	}
	if (type.equals(LineFormTypeDef.class)) {
		return resElementMapper.getString("CTLineFormTypeDef");
	}
	if (type.equals(UmlPackage.class)) {
		return resElementMapper.getString("CTUmlPackage");
	}
	if (type.equals(ch.ehi.interlis.views.ViewDef.class)) {
		return resElementMapper.getString("CTViewDef");
	}
	if (type.equals(ch.ehi.interlis.views.ViewProjectionDef.class)) {
		return resElementMapper.getString("CTViewProjectionDef");
	}
	if (type.equals(ch.ehi.interlis.modeltopicclass.Contract.class)) {
		return resElementMapper.getString("CTContract");
	}
	if (type.equals(ch.ehi.interlis.constraints.ConstraintDef.class)) {
		return resElementMapper.getString("CTConstraintDef");
	}

	// should never reach here
	Tracer.getInstance().developerError(ElementUtils.class, "getDisplayName(Class)", "No NLS-Property for type <" + type.getName() + ">");
	return StringUtils.getPureClassName(type);
}
/**
 * Return a new ModelElement Instance.
 * The ModelElements default name is set to "<ClassNameWithout ClassPath>".
 * @param className
 */
public static java.lang.Class getElementDialog(Element element) {
	if (element == null) {
		return null;
	} else {
		// Generic: check whether Dialog exists
		java.lang.Class dialogClass = null;
		try {
			if (element instanceof ch.ehi.uml1_4.foundation.core.Generalization) {
				return GeneralizationDialog.class;
			}
			if (element instanceof ch.ehi.uml1_4.foundation.core.Dependency) {
				return DependencyDialog.class;
			}
			String elementClass = StringUtils.getPureClassName(element);
			dialogClass = java.lang.Class.forName(StringUtils.getPackageName(ElementUtils.class) + "." + elementClass + "Dialog");//$NON-NLS-2$//$NON-NLS-1$
		} catch(ClassNotFoundException e) {
			// no specific dialog for this modelElement -> try generic dialog
			dialogClass = CommonSpecificationDialog.class;
		}
		return dialogClass;
	}
}
/**
 * Return the default language String.
 */
public static String mapNlsString(ch.ehi.basics.types.NlsString string) {
	if (string == null) {
		return null;
	} else {
	    return string.getValue();
	}
}
/**
 * @see trySetName(..)
 */
public static String mapNlsString(ch.ehi.basics.types.NlsString nlsString, String language) {
	if (nlsString == null) {
		return null;
	} else {
		return nlsString.getValue(language);
	}
}
/**
 * Set the ModelElement.name if there is no name-conflict.
 * Do not allow same name for different ModelElement's.
 */
public static boolean trySetName(ModelElement modelElement, String newName) {
	return trySetName(modelElement, newName, LauncherView.getSettings().getLanguage());
}
/**
 * Set the ModelElement.name if there is no name-conflict.
 * Do not allow same name for different ModelElement's.
 */
public static boolean trySetName(ModelElement modelElement, String newName, String language) {
//	if ((modelElement != null) && (!newName.equals(modelElement.getName().getValue(language)))) {
	if ((modelElement != null) && (!newName.equals(mapNlsString(modelElement.getName(), language)))) {
		String warningTitle = resElementMapper.getString("CTNameConflict"); //$NON-NLS-1$
		if (modelElement.containsNamespace()) {
			if (modelElement.getNamespace().containsOwnedElement(newName)) {
				new WarningDialog(LauncherView.getInstance(),
					warningTitle,
					resElementMapper.getString("CEDuplicatedName")); //$NON-NLS-1$
				return false;
			}
		} else {
			if (modelElement instanceof AttributeDef) {
				if (((AttributeDef)modelElement).getOwner().containsFeature(newName)) {
					new WarningDialog(LauncherView.getInstance(),
						warningTitle,
						resElementMapper.getString("CEDuplicatedAttribute")); //$NON-NLS-1$
					return false;
				}
			} else {
				Tracer.getInstance().developerWarning(ElementUtils.class, "trySetName()", "<" + modelElement.toString() + " cannot be not checked yet because of missing namespace");//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
			}
		}
		modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(), language, newName));
	}
	return true;
}
}
