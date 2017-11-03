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
import java.util.Iterator;

import javax.swing.JTextField;

import ch.ehi.interlis.graphicdescriptions.*;
import ch.ehi.interlis.functions.*;
import ch.ehi.interlis.domainsandconstants.*;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.softenvironment.view.*;
import ch.ehi.uml1_4.implementation.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.uml1_4.foundation.extensionmechanisms.TaggedValue;
import ch.ehi.umleditor.interlis.iliimport.TransferFromIli2cMetamodel;
import ch.ehi.interlis.associations.Participant;
import ch.ehi.interlis.attributes.*;
import ch.softenvironment.util.*;
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.tools.StringUtility;
import ch.ehi.basics.types.NlsString;

/**
 * Utility Class for dealing with Element's.
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.7 $ $Date: 2007-03-27 14:07:11 $
 */
public abstract class ElementUtils {
	// the concrete model presented by this TreeElement
	private static java.util.ResourceBundle resElementMapper = java.util.ResourceBundle
			.getBundle("ch/ehi/umleditor/application/resources/ElementUtils");

	/**
	 * Return errorMessage is Inheritance is ok otherwise null.
	 */
	public static String checkInheritance(GeneralizableElement parent, GeneralizableElement child) {
		// check inheritanceCycle
		if (child == parent) {
			return resElementMapper.getString("CESelfInheritance"); //$NON-NLS-1$
		}
		/*
		 * // check cycle whether child is a parent of parent if
		 * (ch.ehi.uml1_4.tools.GeneralizableElementUtility.
		 * deepContainsGeneralizationParent(child, parent)) { return
		 * "Superklasse schon in der Hierarchy enthalten."; }
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
	 * Return the displayable name of a ModelElement: Format: "ModelElementName
	 * (packageName)"
	 * 
	 * @param modelElement
	 */
	public static String formatWithPackageName(ModelElement modelElement) {
		return modelElement.getDefLangName() + " ("
				+ ch.ehi.uml1_4.tools.ModelElementUtility.getUmlPath(modelElement, null) + ")";
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
		// AttributeDef; INTERLIS2Def; MetaDataUseDef;
		// MetaObjectFile; RoleDef; UnitDef;
		// ClassExtends; TopicExtends => @see GeneralizationDialog
		// UmlUsage; TopicDepends => @see DependencyDialog

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
		Tracer.getInstance().developerError("No NLS-Property for type <" + type.getName() + ">");
		return StringUtils.getPureClassName(type);
	}

	/**
	 * Set the ModelElement.metaAttrb
	 */
	public static Boolean trySetMetaAttrb(ModelElement modelElement, String newMetaAttrb) {
		String language = ch.ehi.basics.types.NlsString.getDefaultLanguage();
		if ((modelElement != null) && (!newMetaAttrb.equals(mapNlsString(modelElement.getMetaAttrb(), language)))) {
			modelElement.setMetaAttrb(
					new ch.ehi.basics.types.NlsString(modelElement.getMetaAttrb(), language, newMetaAttrb));
		}

		return true;
	}

	/**
	 * Return a new ModelElement Instance. The ModelElements default name is set
	 * to "<ClassNameWithout ClassPath>".
	 * 
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
				dialogClass = java.lang.Class
						.forName(StringUtils.getPackageName(ElementUtils.class) + "." + elementClass + "Dialog");//$NON-NLS-2$//$NON-NLS-1$
			} catch (ClassNotFoundException e) {
				// no specific dialog for this modelElement -> try generic
				// dialog
				dialogClass = CommonSpecificationDialog.class;
			}
			return dialogClass;
		}
	}

	/**
	 * change an existing nls value by cloning it or creating a new one.
	 * 
	 * @param oldString
	 * @param newValueInDefaultLanguage
	 * @return new string
	 */
	public static ch.ehi.basics.types.NlsString changeNlsString(ch.ehi.basics.types.NlsString oldString,
			String newValueInDefaultLanguage) {
		if (oldString == null) {
			return new ch.ehi.basics.types.NlsString(newValueInDefaultLanguage);
		} else {
			return new ch.ehi.basics.types.NlsString(oldString, newValueInDefaultLanguage);
		}
	}

	/**
	 * change an existing nls value by cloning it or creating a new one.
	 * 
	 * @param oldString
	 * @param newValue
	 * @param language
	 * @return new string
	 */
	public static ch.ehi.basics.types.NlsString changeNlsString(ch.ehi.basics.types.NlsString oldString,
			String newValue, String language) {
		if (oldString == null) {
			return new ch.ehi.basics.types.NlsString(language, newValue);
		} else {
			return new ch.ehi.basics.types.NlsString(oldString, language, newValue);
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
	 * Set the ModelElement.name if there is no name-conflict. Do not allow same
	 * name for different ModelElement's.
	 */
	public static boolean trySetName(ModelElement modelElement, String newName) {
		return trySetName(modelElement, newName, ch.ehi.basics.types.NlsString.getDefaultLanguage());
	}

	/**
	 * Set the ModelElement.name if there is no name-conflict. Do not allow same
	 * name for different ModelElement's.
	 */
	public static boolean trySetName(ModelElement modelElement, String newName, String language) {
		// if ((modelElement != null) &&
		// (!newName.equals(modelElement.getName().getValue(language)))) {
		if ((modelElement != null) && (!newName.equals(mapNlsString(modelElement.getName(), language)))) {
			String warningTitle = resElementMapper.getString("CTNameConflict"); //$NON-NLS-1$
			if (modelElement.containsNamespace()) {
				if (modelElement.getNamespace().containsOwnedElement(newName)) {
					BaseDialog.showWarning((java.awt.Component) LauncherView.getInstance(), warningTitle,
							resElementMapper.getString("CEDuplicatedName")); //$NON-NLS-1$
					return false;
				}
			} else {
				if (modelElement instanceof AttributeDef) {
					if (((AttributeDef) modelElement).getOwner().containsFeature(newName)) {
						BaseDialog.showWarning((java.awt.Component) LauncherView.getInstance(), warningTitle,
								resElementMapper.getString("CEDuplicatedAttribute")); //$NON-NLS-1$
						return false;
					}
				} else if (modelElement instanceof Participant) {
					// XOR updates real RoleDef name
					((Participant) modelElement).getAssociation()
							.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(), language, newName));
					return true;
				} else {
					Tracer.getInstance().developerWarning(
							"<" + modelElement.toString() + " cannot be not checked yet because of missing namespace");// $NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
				}
			}
			newName = newName.trim();
			if (!(modelElement instanceof ch.ehi.interlis.associations.AssociationDef)) {
				if (newName.length() == 0) {
					BaseDialog.showWarning((java.awt.Component) LauncherView.getInstance(), warningTitle,
							"name should not be empty"); //$NON-NLS-1$
					return false;
				}
			}
			modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(), language, newName));
		}
		return true;
	}

	public static UnknownType convertType(ch.ehi.interlis.domainsandconstants.Type type) {
		java.io.StringWriter iliout = new java.io.StringWriter();
		ch.ehi.umleditor.interlis.iliexport.TransferFromUmlMetamodel toili = new ch.ehi.umleditor.interlis.iliexport.TransferFromUmlMetamodel();
		toili.setup(iliout, ch.ehi.basics.types.NlsString.getDefaultLanguage());
		try {
			toili.visitType(null, type);
		} catch (java.io.IOException ex) {
			EhiLogger.logError("failed to convert type", ex);
		}
		String ret = iliout.toString();
		UnknownType convertedType = new UnknownType();
		convertedType.setSyntax(new ch.ehi.basics.types.NlsString(ret));
		return convertedType;
	}

	public static String getIliTaggedValue(ModelDef def, String tagName) {
		TaggedValue umlTag = null;
		Iterator defLangIt = def.iteratorTaggedValue();
		while (defLangIt.hasNext()) {
			umlTag = (TaggedValue) defLangIt.next();
			String name = umlTag.getName().getValue(TaggedValue.TAGGEDVALUE_LANG);
			if (name.equals(TransferFromIli2cMetamodel.TAGGEDVALUE_ILI_PREFIX + tagName)) {
				String value = umlTag.getDataValue();
				return value;
			}
		}
		return null;
	}

	public static void setIliTaggedValue(ModelDef def, String iliTagName, String tagValue) {
		tagValue = StringUtility.purge(tagValue);
		TaggedValue umlTag = null;
		Iterator defLangIt = def.iteratorTaggedValue();
		String umlTagName = TransferFromIli2cMetamodel.TAGGEDVALUE_ILI_PREFIX + iliTagName;
		while (defLangIt.hasNext()) {
			umlTag = (TaggedValue) defLangIt.next();
			String name = umlTag.getName().getValue(TaggedValue.TAGGEDVALUE_LANG);
			if (name.equals(umlTagName)) {
				if (tagValue == null) {
					def.removeTaggedValue(umlTag);
				} else {
					umlTag.setDataValue(tagValue);
				}
				return;
			}
		}
		if (tagValue != null) {
			umlTag = (TaggedValue) ch.ehi.umleditor.application.ElementFactory
					.createObject(ch.ehi.uml1_4.implementation.UmlTaggedValue.class);
			umlTag.setName(new NlsString(TaggedValue.TAGGEDVALUE_LANG, umlTagName));
			umlTag.setDataValue(tagValue);
			def.addTaggedValue(umlTag);

		}
	}

}
