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

import ch.ehi.interlis.constraints.*;
import ch.ehi.umleditor.umlpresentation.*;
import ch.ehi.interlis.metaobjects.*;
import ch.ehi.interlis.domainsandconstants.basetypes.*;
import ch.ehi.interlis.domainsandconstants.*;
import java.util.*;
import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.domainsandconstants.linetypes.*;
import ch.ehi.interlis.associations.*;
import ch.ehi.uml1_4.implementation.*;
import ch.ehi.interlis.modeltopicclass.*;
import ch.ehi.uml1_4.foundation.core.*;
import ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind;
import ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind;
import ch.ehi.uml1_4.foundation.datatypes.ScopeKind;
import ch.ehi.uml1_4.foundation.datatypes.VisibilityKind;
import ch.ehi.umleditor.umldrawingtools.*;
import ch.ehi.interlis.attributes.*;
import ch.softenvironment.util.*;
/**
 * Factory to create Default Element-Types (such as ClassDef and the like).
 *
 * @author Peter Hirzel <i>soft</i>Environment
 * @version $Revision: 1.13 $ $Date: 2007-12-19 09:20:23 $
 */
public abstract class ElementFactory {
// the concrete model presented by this TreeElement
private static java.util.ResourceBundle resElementMapper = java.util.ResourceBundle.getBundle("ch/ehi/umleditor/application/resources/ElementFactory");

// index counter of Elements to be created
private static int counter = 0;
/**
 * Return a default NumericalType Instance.
 */
private static NumericalType adaptNumericalType(NumericalType type) {
								type.setCircular(false);
								type.setDirection(RotationKind.UNDEFINED);

								return type;
}
/**
 * Create Composite without Edges.
 */
public static ch.ehi.umleditor.umlpresentation.Association createAssociationComposite(ch.ehi.uml1_4.foundation.core.Association associationDef, boolean showName) {
								// Create an Association Composite which connects 2 ClassFigure's as follows:
								//  ==> ClassFigure-Edge-Link-Edge-ClassFigure
								ch.ehi.umleditor.umlpresentation.Association associationComposite = (ch.ehi.umleditor.umlpresentation.Association)createObject(ch.ehi.umleditor.umlpresentation.Association.class);
								associationComposite.addSubject(associationDef);

								// introduce an artificial Link
								PresentationAssocClass linkView = (PresentationAssocClass)createObject(PresentationAssocClass.class);
								linkView.addSubject(associationDef);

								associationComposite.attachLinkPresentation(linkView);
								associationComposite.setShowName(showName);

								return associationComposite;
}
/**
 * Return a default AssociationDef Instance.
 * @see #createObject(..)
 * @deprecated
 */
protected static AssociationDef createAssociationDef(Element parent) {
								// generic initialization
								AssociationDef associationDef = (AssociationDef)createOwnedElement(AssociationDef.class, parent);

								return associationDef;
}
/**
 * Return a default AssociationDef link to two Roles Instances.
 * Convention: The Association is added as OwnedElement to FromParticipant's parent.
 * @see #createAssociationDef(Element)
 */
public static AssociationDef createAssociationDef(GeneralizableElement participantFrom, GeneralizableElement participantTo) {
								// generic initialization
								AssociationDef associationDef = createAssociationDef(((ModelElement)participantFrom).getNamespace());

								// create the AssociationEnd's
								createRoleDef(associationDef, (Classifier)participantFrom);
								createRoleDef(associationDef, (Classifier)participantTo);

								return associationDef;
}
/**
 * Return a default AttributeDef Instance.
 * AttributeDef are added as Feature to AbstractClassDef.
 * @see #createObject(..)
 */
public static AttributeDef createAttributeDef(AbstractClassDef abstractClassDef) {
								// generic initialization
								AttributeDef attributeDef = (AttributeDef)createObject(AttributeDef.class);

								// set defaults
								ch.ehi.uml1_4.implementation.UmlMultiplicityRange r=new ch.ehi.uml1_4.implementation.UmlMultiplicityRange();
								r.setLower(0);
								r.setUpper(1);
								ch.ehi.uml1_4.implementation.UmlMultiplicity m=new ch.ehi.uml1_4.implementation.UmlMultiplicity();
								m.addRange(r);
								attributeDef.setMultiplicity(m);

								// define default datatype (TEXT*20)
								ch.ehi.interlis.attributes.DomainAttribute attrtype = new ch.ehi.interlis.attributes.DomainAttribute();
								ch.ehi.interlis.domainsandconstants.basetypes.Text text = new ch.ehi.interlis.domainsandconstants.basetypes.Text();
								text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
								text.setMaxLength(20);
								attrtype.attachDirect(text);
								attributeDef.attachAttrType(attrtype);

								// aggregations
								abstractClassDef.addFeature(attributeDef);

								return attributeDef;
}
/**
 * Return a default UmlOperation Instance.
 * Operations are added as Feature to AbstractClassDef.
 * @see #createObject(..)
 */
public static UmlOperation createUmlOperation(AbstractClassDef abstractClassDef) {
								// generic initialization
								UmlOperation operation = (UmlOperation)createObject(UmlOperation.class);

								// set defaults
								operation.setAbstract(false);
								operation.setLeaf(false); // successors may overwrite this method
								operation.setRoot(false); // predecessor may have implemented this method
								operation.setOwnerScope(ScopeKind.INSTANCE);
								operation.setConcurrency(CallConcurrencyKind.SEQUENTIAL);
								operation.setVisibility(VisibilityKind.PUBLIC);

								//	Return Value
/*	UmlParameter returnValue = new UmlParameter();
   returnValue.setKind(ParameterDirectionKind.RETURN);
   operation.addParameter(returnValue);
 */
								// define default datatype (TEXT*20)
/*	ch.ehi.interlis.attributes.DomainAttribute attrtype = new ch.ehi.interlis.attributes.DomainAttribute();
   ch.ehi.interlis.domainsandconstants.basetypes.Text text = new ch.ehi.interlis.domainsandconstants.basetypes.Text();
   text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
   text.setMaxLength(20);
   attrtype.attachDirect(text);
   attributeDef.attachAttrType(attrtype);
 */
								// aggregations
								abstractClassDef.addFeature(operation);

								return operation;
}
/**
 * Return a default UmlParameter Instance.
 * Parameters are added as Parameter to Operations.
 * @see #createObject(..)
 */
public static UmlParameter createUmlParameter(UmlOperation operation) {
								// generic initialization
								UmlParameter parameter = (UmlParameter)createObject(UmlParameter.class);

								// set defaults
								parameter.setKind(ParameterDirectionKind.INOUT);

								// aggregations
								operation.addParameter(parameter);

								return parameter;
}
/**
 * Return a default NumericType Instance.
 */
public static BasketType createBasketType() /*throws ClassNotFoundException, InstantiationException, IllegalAccessException */ {
								BasketType type = new BasketType();
								type.setKind(BasketKind.UNDEFINED);

								return type;
}
/**
 * Return a default ClassDef Instance.
 * @see #createObject(..)
 */
public static ClassDef createClassDef(Element parent) {
								// generic initialization
								ClassDef classDef = (ClassDef)createOwnedElement(ClassDef.class, parent);

								// default initialization
								classDef.setKind(ClassDefKind.CLASS);

								return classDef;
}
/**
 * Return a default AttributeDef Instance.
 * @see #createObject(..)
 */
public static Contract createContract(ModelDef modelDef) {
								// generic initialization
								Contract contract = (Contract)createObject(Contract.class);

								// set defaults
								contract.setIssuer(new ch.ehi.basics.types.NlsString(resElementMapper.getString("CIContractIssuer"))); //$NON-NLS-1$
//	contract.setExplanation(new ch.ehi.basics.types.NlsString("<Explanation>"));

								// aggregations
								modelDef.addContract(contract);

								return contract;
}
/**
 * Defintion: A Dependency has only one Client and one Supplier even if
 *            modelled by an Iterator.
 * @see #createObject(..)
 */
public static ch.ehi.uml1_4.foundation.core.Dependency createDependency(java.lang.Class dependencyClass, ModelElement client, ModelElement supplier) {
								// generic initialization
								ch.ehi.uml1_4.foundation.core.Dependency dependency = (ch.ehi.uml1_4.foundation.core.Dependency)createObject(dependencyClass);

								// aggregations
								dependency.addClient(client);
								dependency.addSupplier(supplier);

								return dependency;
}
/**
 * Return a default ClassDef Instance.
 * @see #createObject(..)
 */
public static ch.ehi.umleditor.umlpresentation.Diagram createDiagram(Element parent) {
								// generic initialization
								ch.ehi.umleditor.umlpresentation.Diagram diagram = (ch.ehi.umleditor.umlpresentation.Diagram)createObject(ch.ehi.umleditor.umlpresentation.Diagram.class);
								((Namespace)parent).addDiagram(diagram);

								return diagram;
}
/**
 * Return a default DomainDef Instance.
 * @see #createObject(..)
 */
public static DomainDef createDomainDef(Element element) {
								// generic initialization
								DomainDef domainDef = (DomainDef)createOwnedElement(DomainDef.class, element);

								// define default datatype (TEXT*40)
								ch.ehi.interlis.domainsandconstants.basetypes.Text text = new ch.ehi.interlis.domainsandconstants.basetypes.Text();
								text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
								text.setMaxLength(40);
								domainDef.attachType(text);

								return domainDef;
}
/**
 * Return a default ClassDef Instance.
 * @see #createObject(..)
 */
public static EnumElement createEnumElement() {
								// generic initialization
								EnumElement enumElement = (EnumElement)createObject(EnumElement.class);

								// default initialization
								enumElement.setNameList(enumElement.getName());
								return enumElement;
}
/**
 * Create Generalization between given parent and child.
 * @see #createObject(..)
 */
public static ch.ehi.uml1_4.foundation.core.Generalization createGeneralization(GeneralizableElement parent, GeneralizableElement child) {
								ch.ehi.uml1_4.foundation.core.Generalization generalization = null;

								if ((child instanceof AssociationDef) || (child instanceof ClassDef) ) {
																generalization = (ch.ehi.uml1_4.foundation.core.Generalization)createObject(ClassExtends.class);
																((ClassExtends)generalization).setExtended(false);
								} else if (child instanceof TopicDef) {
																generalization = (ch.ehi.uml1_4.foundation.core.Generalization)createObject(TopicExtends.class);
								} else if (child instanceof DomainDef) {
																generalization = (ch.ehi.uml1_4.foundation.core.Generalization)createObject(DomainExtends.class);
								} else {
																throw new DeveloperException("undefined Generalization");//$NON-NLS-2$//$NON-NLS-1$
								}

								// create the ends of Edge
								generalization.attachParent(parent);
								generalization.attachChild(child);

								return generalization;
}
/**
 * Return a default INTERLIS2Def Instance.
 * @see #createObject(..)
 */
public static INTERLIS2Def createINTERLIS2Def(Element parent) {
								// generic initialization
								INTERLIS2Def interlis2Def = (INTERLIS2Def)createOwnedElement(INTERLIS2Def.class, parent);

								// default initialization
								interlis2Def.setVersion(2.3);

								return interlis2Def;
}
/**
 * Return a default LineFormTypeRef Instance.
 * @see #createObject(..)
 */
public static LineFormTypeDef createLineFormTypeDef(LineForm lineForm) {
								// generic initialization
								LineFormTypeDef lineFormTypeDef = (LineFormTypeDef)createObject(LineFormTypeDef.class);

								// set defaults
								lineForm.addLineFormTypeDef(lineFormTypeDef);

								return lineFormTypeDef;
}
/**
 * Return a default ClassDef Instance.
 * @see #createObject(..)
 */
public static MetaDataUseDef createMetaDataUseDef(Element parent) {
								// generic initialization
								MetaDataUseDef metaDataUseDef = (MetaDataUseDef)createOwnedElement(MetaDataUseDef.class, parent);

								// default initialization
								metaDataUseDef.setKind(MetaDataUseDefKind.SIGN);

								return metaDataUseDef;
}
/**
 * Return a default MetaObjectFile Instance.
 * @see #createOwnedElement(..)
 */
public static MetaObjectFile createMetaObjectFile(UmlModel parent) {
								return (MetaObjectFile)createOwnedElement(MetaObjectFile.class, parent);
}
/**
 * Return a default ModelDef Instance.
 * @see #createObject(..)
 */
public static ModelDef createModelDef(Element parent) {
								// generic initialization
								ModelDef modelDef = (ModelDef)createOwnedElement(ModelDef.class, parent);
								modelDef.setIssuerURI(new NlsString("mailto:"+System.getProperty("user.name")+"@localhost"));
								Calendar current=Calendar.getInstance();
								java.text.DecimalFormat digit4 = new java.text.DecimalFormat("0000");
								java.text.DecimalFormat digit2 = new java.text.DecimalFormat("00");
								String version=digit4.format(current.get(Calendar.YEAR))
																								+"-"+digit2.format(current.get(Calendar.MONTH)+1)
																								+"-"+digit2.format(current.get(Calendar.DAY_OF_MONTH));
								modelDef.setVersion(new NlsString(version));
								// default initialization
								modelDef.setKind(ModelDefKind.DATA);

								return modelDef;
}
/**
 * Return a default AttributeDef Instance.
 * @see #createObject(..)
 */
public static ch.ehi.umleditor.umlpresentation.Note createNote() {
//TODO NYI: uml.core.Comment would actually be the ModelElement
								//    ModelElement comment = (ModelElement)EditorTreeElement.createElement(Comment.class);

								// generic initialization
								ch.ehi.umleditor.umlpresentation.Note note = (ch.ehi.umleditor.umlpresentation.Note)createObject(ch.ehi.umleditor.umlpresentation.Note.class);

								// set defaults
								note.setContent(new ch.ehi.basics.types.NlsString(resElementMapper.getString("CINote"))); //$NON-NLS-1$

								return note;
}
/**
 * Return a default NumericType Instance.
 */
public static NumericType createNumericType() /*throws ClassNotFoundException, InstantiationException, IllegalAccessException */ {
								NumericType type = new NumericType();
								type.setRangeDefined(false);

								adaptNumericalType(type);

								return type;
}
/**
 * Return a default DateType Instance.
 */
public static DateType createDateType()
{
								DateType type = new DateType();

								return type;
}
/**
 * Return a default DateTimeType Instance.
 */
public static DateTimeType createDateTimeType()
{
								DateTimeType type = new DateTimeType();

								return type;
}
/**
 * Return a default TimeType Instance.
 */
public static TimeType createTimeType()
{
								TimeType type = new TimeType();

								return type;
}
/**
 * Create a generic Instance of given Class.
 * Create default name if possible like "<ClassNameWithout ClassPath>".
 * @param className
 */
public static Object createObject(java.lang.Class className) {
								Object object = null;
								try {
																object = className.newInstance();
								} catch (Throwable e) {
																//ClassNotFoundException InstantiationException, IllegalAccessException)
																throw new DeveloperException(resElementMapper.getString("CEInstantiationError"), null, e); //$NON-NLS-1$
								}

								// set default name
								String name = StringUtils.getPureClassName(className) + (++counter);
								if (object instanceof ch.ehi.umleditor.umlpresentation.Diagram) {
																((ch.ehi.umleditor.umlpresentation.Diagram)object).setName(new ch.ehi.basics.types.NlsString(name));
								} else if (object instanceof ModelElement) {
																// set default name
																((ModelElement) object).setName(new ch.ehi.basics.types.NlsString(name));
								}

								// set documentation
								if (object instanceof Element) {
																((Element)object).setDocumentation(new ch.ehi.basics.types.NlsString());
								}

								return object;
}
/**
 * Return a default OwnedElement Instance.
 * @see #createObject(..)
 */
public static ModelElement createOwnedElement(java.lang.Class aClass, Element parent) {
								// generic initialization
								ModelElement modelElement = (ModelElement)createObject(aClass);
								((Namespace)parent).addOwnedElement(modelElement);

								return modelElement;
}
/**
 * Return a default PresentationEdge.
 *
 * The idea is to separate 1 UML-Association into
 * 2 graphical edges which have an artifical link-node inbetween.
 * This link-Node may be transformed for any Association-kind:
 *  - binary connection (2 nodes and 1 Association)
 *  - n-ary Association between > 2 nodes
 *  - extended binary Associations
 *  - Associations with Attributes
 * @see #createObject(..)
 * @param classDiagram diagram where new role is to be shown
 * @associationComposite LinkNode's composite
 * @node the new Classifier/-Figure to be connected
 * @roleDef represented by node
 */
public static ch.ehi.umleditor.umlpresentation.PresentationRole createPresentationRole(ClassDiagramView classDiagram, ch.ehi.umleditor.umlpresentation.Association associationComposite, ch.ehi.umleditor.umlpresentation.PresentationNode node, ModelElement /*AssociationEnd || Participant*/ roleDef)  {
								ch.ehi.umleditor.umlpresentation.PresentationRole edge = (ch.ehi.umleditor.umlpresentation.PresentationRole)createObject(ch.ehi.umleditor.umlpresentation.PresentationRole.class);
								edge.addEndpoint(associationComposite.getLinkPresentation()); // first
								edge.addEndpoint(node); // second
								edge.addSubject(roleDef);

								edge.setNameAngle(0.0);
								edge.setNameRadius(0.0);
								edge.setMultiplicityAngle(0.0);
								edge.setMultiplicityRadius(0.0);

								edge.setForeground(ColorConverter.createColor(LauncherView.getSettings().getForegroundColor()));
								edge.setFont(LauncherView.getSettings().getFontString());

								if (classDiagram != null) {
																edge.setNameVisible(classDiagram.isShowAllRoles());
																edge.setMultiplicityVisible(classDiagram.isShowMultiplicities());
								} else {
																edge.setNameVisible(true);
																edge.setMultiplicityVisible(true);
								}

								associationComposite.addRolePresentation(edge);
								return edge;
}
/**
 * Return a default ClassDef Instance.
 * @see #createObject(..)
 */
public static RoleDef createRoleDef(ch.ehi.uml1_4.foundation.core.Association association, Classifier classifier) {
								// generic initialization
								RoleDef roleDef = (RoleDef)createObject(RoleDef.class);

								// default initialization
								roleDef.setNavigable(false);
								roleDef.setIliAttributeKind(AssociationAsIliAttrKind.ASSOCIATION);
								roleDef.setAggregation(ch.ehi.uml1_4.foundation.datatypes.AggregationKind.NONE);
								roleDef.setMultiplicity(MultiplicityConverter.get0toN());

								// Model-Links
								association.addConnection(roleDef);
								if (classifier != null) {
																roleDef.attachParticipant(classifier);
								}
								return roleDef;
}
/**
 * Create an XOR-Constraint between to AssociationEnd's.
 * If an existing role of an association gets an XOR-Constraint to another
 * Class (ClassDef) a Participant instance maps the XOR-Role-Constraint.
 *
 * Definition by the UML/INTERLIS-Editor:
 * - concerns the very same Association => no alternate Association for XOR-edge
 * @param existingRoleDef
 * @param targetClass
 */
public static Participant createParticipant(RoleDef existingRoleDef, AbstractClassDef targetClass) {
								Participant participant = new Participant();
								// define Role of an Association to be XORed
								participant.attachAssociation(existingRoleDef); //dialog.getXorParticipant().addXorParticipant(participant);
								// add the new XOR-target
								participant.attachParticipant(targetClass);

								// INTERLIS restriction to certain subtypes of targetClass
//  participant.addRestriction(subClass);

								return participant;
}
/**
 * Return a default StructuredUnitType Instance.
 */
public static StructuredUnitType createStructuredUnitType() /*throws ClassNotFoundException, InstantiationException, IllegalAccessException */ {
								StructuredUnitType type = new StructuredUnitType();

								adaptNumericalType(type);

								return type;
}
/**
 * Return a default ModelDef Instance.
 * @see #createObject(..)
 */
public static TopicDef createTopicDef(Element parent) {
								// generic initialization
								TopicDef topicDef = (TopicDef)createOwnedElement(TopicDef.class, parent);

								// default initialization
								topicDef.setKind(TopicDefKind.DATA);
								topicDef.setAbstract(false);
								topicDef.setPropFinal(false);

								return topicDef;
}
/**
 * Return a default Translation Instance.
 * @see #createObject(..)
 */
public static Translation createTranslation(ModelDef modelDef) {
								// generic initialization
								Translation translation = (Translation)createObject(Translation.class);

								// set defaults
								translation.setLanguage(resElementMapper.getString("CITranslationLanguage")); //$NON-NLS-1$
								translation.setBaseLanguage(resElementMapper.getString("CITranslationBaseLanguage")); //$NON-NLS-1$

								// aggregations
								modelDef.addTranslation(translation);

								return translation;
}
/**
 * Return a default AttributeDef Instance.
 * @see #createElement(..)
 */
public static void removeElement(Element element) {
/*
   if (element instanceof ch.ehi.uml1_4.foundation.core.Association) {
     ch.ehi.uml1_4.foundation.core.Association association = (ch.ehi.uml1_4.foundation.core.Association)element;

     // remove the parent
   Namespace parent = association.getNamespace();
   parent.removeOwnedElement(association);

     // remove both AssociationEnd's incl. their Participant's
   java.util.Iterator iterator = association.iteratorConnection();
     // from
     AssociationEnd associationEnd1 = (AssociationEnd)iterator.next();
     associationEnd1.detachParticipant();
     // to
     AssociationEnd associationEnd2 = (AssociationEnd)iterator.next();
     associationEnd2.detachParticipant();
   // remove roles
   association.removeConnection(associationEnd1);
   association.removeConnection(associationEnd2);
   } else
 */
								if ((element instanceof ModelElement) && ((ModelElement)element).containsNamespace()) {
																Namespace parent = ((ModelElement)element).getNamespace();
//		parent.removeOwnedElement((ModelElement)element);
																parent.deepDetachOwnedElement((ModelElement)element);
								} else if (element instanceof ch.ehi.uml1_4.foundation.core.Dependency) {
																// remove from iteratorClientDependency
																ModelElement client = (ModelElement)((ch.ehi.uml1_4.foundation.core.Dependency)element).iteratorClient().next();
																((ch.ehi.uml1_4.foundation.core.Dependency)element).clearSupplier();
																client.removeClientDependency((ch.ehi.uml1_4.foundation.core.Dependency)element);
								} else if (element instanceof ch.ehi.uml1_4.foundation.core.Generalization) {
																// remove Generalization from Child's parent
																ch.ehi.uml1_4.foundation.core.Generalization generalization = (ch.ehi.uml1_4.foundation.core.Generalization)element;
																generalization.detachChild();
																generalization.detachParent();
								} else if (element instanceof Feature) {
																// remove AttributeDef or UmlOperation
																((AbstractClassDef)(((Feature)element).getOwner())).removeFeature((Feature)element);
								} else if (element instanceof LineFormTypeDef) {
																LineForm lineForm = ((LineFormTypeDef)element).getLineForm();
																lineForm.removeLineFormTypeDef((LineFormTypeDef)element);
								} else if (element instanceof ch.ehi.umleditor.umlpresentation.Diagram) {
																ModelElement parent = ((ch.ehi.umleditor.umlpresentation.Diagram)element).getNamespace();
																LauncherView.getInstance().closeClassDiagram(element);
																((Namespace)parent).removeDiagram((ch.ehi.umleditor.umlpresentation.Diagram)element);
								} else if (element instanceof RoleDef) {
//		((RoleDef)element).getAssociation().removeConnection((RoleDef)element);
//		((RoleDef)element).detachParticipant();
																Tracer.getInstance().developerWarning("cast by Association-Interface at next Model-Release by CE");
																((AssociationDef)((RoleDef)element).getAssociation()).deepRemoveConnection((AssociationEnd)element);
								} else if (element instanceof Contract) {
																// remove from iteratorContract
																ModelDef parent = ((Contract)element).getModelDef();
																parent.removeContract((Contract)element);
								} else if (element instanceof Translation) {
																ModelDef parent = ((Translation)element).getModelDef();
																parent.removeTranslation((Translation)element);
								} else if (element instanceof ConstraintDef) {
																Iterator iterator = ((ConstraintDef)element).iteratorConstrainedElement();
																List owners = new ArrayList();
																while (iterator.hasNext()) {
																								owners.add(iterator.next());
																}
																iterator = owners.iterator();
																while (iterator.hasNext()) {
																								((ModelElement)iterator.next()).removeConstraint((Constraint)element);
																}
								} else if (element instanceof UmlParameter) {
																((UmlParameter)element).getBehavioralFeature().removeParameter((Parameter)element);
								} else if (element instanceof ParameterDef) {
																if (((ParameterDef)element).containsClassDef()) {
																								ClassDef owner = ((ParameterDef)element).getClassDef();
																								owner.removeParameterDef((ParameterDef)element);
																} else {
																								throw new DeveloperException("ParameterDef is not attached to a ClassDef -> no removing possible");
																}
								} else{
																throw new DeveloperException("element <" + element.toString() + "> NYI");//$NON-NLS-3$//$NON-NLS-2$//$NON-NLS-1$
								}
}
/**
 * Reset the Counter for Property Name.
 */
protected static void resetCounter() {
								// reset name-counter
								counter = 0;
}
}
