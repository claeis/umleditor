// Copyright (c) 2002, Eisenhut Informatik
// All rights reserved.
// $Date: 2008-01-27 22:10:29 $
// $Revision: 1.4 $
//

// -beg- preserve=no 3E0DB0710357 package "TransferFromXmiRoseMetamodel"
package ch.ehi.umleditor.rose;
// -end- 3E0DB0710357 package "TransferFromXmiRoseMetamodel"

// -beg- preserve=no 3E0DB0710357 autoimport "TransferFromXmiRoseMetamodel"

// -end- 3E0DB0710357 autoimport "TransferFromXmiRoseMetamodel"

// import declarations
// please fill in/modify the following section
// -beg- preserve=yes 3E0DB0710357 import "TransferFromXmiRoseMetamodel"
import com.ibm.xmi.framework.*;
import java.util.*;
import ch.ehi.basics.types.NlsString;
// -end- 3E0DB0710357 import "TransferFromXmiRoseMetamodel"

public class TransferFromXmiRoseMetamodel {
	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3E0DB0710357 detail_begin
	// "TransferFromXmiRoseMetamodel"
	static java.util.ResourceBundle rsrc = ch.ehi.basics.i18n.ResourceBundle
			.getBundle(TransferFromXmiRoseMetamodel.class);
	private XMIContainer cont = null;
	private int pass = 0;
	private HashMap xmi2imp = null;
	private HashMap id2xmiobj = null;
	private HashMap domain2struct = null;
	// -end- 3E0DB0710357 detail_begin "TransferFromXmiRoseMetamodel"

	// -beg- preserve=no 3E0F4ADC007D head3E0DB0710357 "findStereotype"
	public String findStereotype(String id)
	// -end- 3E0F4ADC007D head3E0DB0710357 "findStereotype"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4ADC007D throws3E0DB0710357 "findStereotype"

	// -end- 3E0F4ADC007D throws3E0DB0710357 "findStereotype"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4ADC007D body3E0DB0710357 "findStereotype"
		Collection topv = cont.getData("UML:Stereotype");
		Iterator topi = topv.iterator();
		while (topi.hasNext()) {
			XMIObject obj = (XMIObject) topi.next();
			// list of id's seperated by spaces
			String elev = (String) obj.getXMIValueOfValue("extendedElement");
			int start = 0;
			int pos = elev.indexOf(' ');
			while (pos > 0) {
				String value = elev.substring(start, pos).trim();
				if (value.equals(id)) {
					return (String) obj.getXMIValueOfValue("name");
				}
				start = pos + 1;
				pos = elev.indexOf(' ', start);
			}
			if (elev.substring(start).trim().equals(id)) {
				return (String) obj.getXMIValueOfValue("name");
			}
		}
		return null;
		// -end- 3E0F4ADC007D body3E0DB0710357 "findStereotype"
	}

	// -beg- preserve=no 3E0F4B22025F head3E0DB0710357 "findTaggedValue"
	public String findTaggedValue(String id, String tag)
	// -end- 3E0F4B22025F head3E0DB0710357 "findTaggedValue"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4B22025F throws3E0DB0710357 "findTaggedValue"

	// -end- 3E0F4B22025F throws3E0DB0710357 "findTaggedValue"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4B22025F body3E0DB0710357 "findTaggedValue"
		Collection topv = cont.getData("UML:TaggedValue");
		Iterator topi = topv.iterator();
		while (topi.hasNext()) {
			XMIObject obj = (XMIObject) topi.next();
			if (obj.getXMIValueOfValue("modelElement").equals(id) && obj.getXMIValueOfValue("tag").equals(tag)) {
				return (String) obj.getXMIValueOfValue("value");
			}
		}
		return null;
		// -end- 3E0F4B22025F body3E0DB0710357 "findTaggedValue"
	}

	// -beg- preserve=no 3E0F4B74007C head3E0DB0710357 "visitValue"
	public java.lang.Object visitValue(java.lang.Object obj, java.lang.Object arg)
	// -end- 3E0F4B74007C head3E0DB0710357 "visitValue"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4B74007C throws3E0DB0710357 "visitValue"
	// -end- 3E0F4B74007C throws3E0DB0710357 "visitValue"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4B74007C body3E0DB0710357 "visitValue"
		if (obj == null) {
			return null;
		}
		if (obj instanceof XMIObject) {
			XMIObject oneobj = (XMIObject) obj;
			try {
				if (oneobj.getXMIName().equals("UML:Class")) {
					return visitAbstractClass(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:Association")) {
					return visitAbstractClass(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:AssociationClass")) {
					return visitAbstractClass(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:Package")) {
					return visitPackage(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:DataType")) {
					return visitDatatype(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:Generalization")) {
					return visitGeneralization(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:AssociationEnd")) {
					return visitAssociationEnd(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:Multiplicity")) {
					return visitMultiplicity(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:MultiplicityRange")) {
					return visitMultiplicityRange(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:Diagram")) {
					return visitDiagram(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:Attribute")) {
					return visitAttribute(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:Operation")) {
					return visitOperation(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:Parameter")) {
					return visitParameter(oneobj, arg);
				} else if (oneobj.getXMIName().equals("UML:DiagramElement")) {
					return visitDiagramElement(oneobj, arg);
				}
			} catch (java.lang.RuntimeException ex) {
				System.err.println("Id " + oneobj.getXMIId() + " :" + ex.getCause());
				// ex.printStackTrace();
				throw ex;
			}
		} else if (obj instanceof Collection) {
			// System.out.println(obj);
			Collection elev = (Collection) obj;
			Iterator elei = elev.iterator();
			while (elei.hasNext()) {
				XMIObject oneobj = (XMIObject) elei.next();
				visitValue(oneobj, arg);
			}
		}
		return null;
		// -end- 3E0F4B74007C body3E0DB0710357 "visitValue"
	}

	// -beg- preserve=no 3E0F4BBE021D head3E0DB0710357 "visitAttribute"
	public java.lang.Object visitAttribute(XMIObject attr, java.lang.Object arg)
	// -end- 3E0F4BBE021D head3E0DB0710357 "visitAttribute"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4BBE021D throws3E0DB0710357 "visitAttribute"

	// -end- 3E0F4BBE021D throws3E0DB0710357 "visitAttribute"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4BBE021D body3E0DB0710357 "visitAttribute"
		if (arg instanceof ch.ehi.interlis.modeltopicclass.AbstractClassDef) {
			if (pass == 2) {
				String typeId = (String) attr.getXMIValueOfValue("type");
				XMIObject type = (XMIObject) id2xmiobj.get(typeId);
				if (type.getXMIName().equals("UML:DataType")
						|| (type.getXMIName().equals("UML:Class") && "enumeration".equals(findStereotype(typeId)))) {
					ch.ehi.interlis.attributes.AttributeDef impattr = new ch.ehi.interlis.attributes.AttributeDef();
					impattr.setDefLangName((String) attr.getXMIValueOfValue("name"));
					String docu = findTaggedValue(attr.getXMIId(), "documentation");
					if (docu != null) {
						impattr.setDocumentation(new NlsString(docu));
					}
					// attrimp.setAbstract(attrib.isAbstract());
					// attrimp.setPropFinal(attrib.isFinal());
					// attrimp.setPropExtended(attrib.getExtending()!=null);
					ch.ehi.interlis.attributes.DomainAttribute attrtype = new ch.ehi.interlis.attributes.DomainAttribute();
					attrtype.attachDomainDef((ch.ehi.interlis.domainsandconstants.DomainDef) xmi2imp.get(type));
					Object obj = attr.getXMIValueOfValue("UML:StructuralFeature.multiplicity");
					visitValue(obj, impattr);

					impattr.attachAttrType(attrtype);
					((ch.ehi.uml1_4.foundation.core.Classifier) arg).addFeature(impattr);
				} else if (type.getXMIName().equals("UML:Class")) {
					ch.ehi.interlis.modeltopicclass.ClassDef dest = null;
					dest = (ch.ehi.interlis.modeltopicclass.ClassDef) xmi2imp.get(type);
					ch.ehi.interlis.associations.AssociationDef assoc = new ch.ehi.interlis.associations.AssociationDef();
					ch.ehi.uml1_4.foundation.core.Class thisclass = (ch.ehi.uml1_4.foundation.core.Class) arg;
					String name = (String) attr.getXMIValueOfValue("name");
					assoc.setDefLangName(thisclass.getDefLangName() + name);
					ch.ehi.interlis.associations.RoleDef destRole = new ch.ehi.interlis.associations.RoleDef();
					assoc.addConnection(destRole);
					destRole.setDefLangName(name);
					String docu = findTaggedValue(attr.getXMIId(), "documentation");
					if (docu != null) {
						destRole.setDocumentation(new NlsString(docu));
					}
					destRole.attachParticipant(dest);
					Object obj = attr.getXMIValueOfValue("UML:StructuralFeature.multiplicity");
					visitValue(obj, destRole);
					// destRole.setOrdering(type.isOrdered()?ch.ehi.uml1_4.foundation.datatypes.OrderingKind.ORDERED:ch.ehi.uml1_4.foundation.datatypes.OrderingKind.UNORDERED);
					ch.ehi.interlis.associations.RoleDef srcRole = new ch.ehi.interlis.associations.RoleDef();
					assoc.addConnection(srcRole);
					srcRole.attachParticipant(thisclass);
					srcRole.setName(thisclass.getName());
					srcRole.setAggregation(ch.ehi.uml1_4.foundation.datatypes.AggregationKind.COMPOSITE);
					if (dest.getKind() == ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE) {
						srcRole.setIliAttributeKind(ch.ehi.interlis.associations.AssociationAsIliAttrKind.STRUCTURE);
					}
					thisclass.getNamespace().addOwnedElement(assoc);
				} else {
					log(rsrc.getString("CIerrAttrIgnored"));
				}
			}
		} else if (arg instanceof ch.ehi.interlis.domainsandconstants.DomainDef) {
			if (pass == 1) {
				ch.ehi.interlis.domainsandconstants.DomainDef imptype = (ch.ehi.interlis.domainsandconstants.DomainDef) arg;
				ch.ehi.interlis.domainsandconstants.basetypes.Enumeration enumeration = (ch.ehi.interlis.domainsandconstants.basetypes.Enumeration) imptype
						.getType();
				ch.ehi.interlis.domainsandconstants.basetypes.EnumElement ele = new ch.ehi.interlis.domainsandconstants.basetypes.EnumElement();
				ele.setDefLangName((String) attr.getXMIValueOfValue("name"));
				String docu = findTaggedValue(attr.getXMIId(), "documentation");
				if (docu != null) {
					ele.setDocumentation(new NlsString(docu));
				}
				enumeration.addEnumElement(ele);
			}
		}
		return null;
		// -end- 3E0F4BBE021D body3E0DB0710357 "visitAttribute"
	}

	/**
	 * process Class, Association and AssociationClass
	 */
	// -beg- preserve=no 3E0F4D5300A3 head3E0DB0710357 "visitAbstractClass"
	public java.lang.Object visitAbstractClass(XMIObject aclass, java.lang.Object arg)
	// -end- 3E0F4D5300A3 head3E0DB0710357 "visitAbstractClass"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4D5300A3 throws3E0DB0710357 "visitAbstractClass"

	// -end- 3E0F4D5300A3 throws3E0DB0710357 "visitAbstractClass"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4D5300A3 body3E0DB0710357 "visitAbstractClass"
		// findTaggedValue(aclass.getXMIId(),"persistence") );
		// findStereotype(aclass.getXMIId()) );
		ch.ehi.uml1_4.foundation.core.ModelElement impclass = null;
		String name = null;
		if (pass == 1) {
			if (aclass.getXMIName().equals("UML:Class")) {
				impclass = new ch.ehi.interlis.modeltopicclass.ClassDef();
				String stereotype = findStereotype(aclass.getXMIId());
				if ("ILISTRUCTURE".equals(stereotype)) {
					((ch.ehi.interlis.modeltopicclass.ClassDef) impclass)
							.setKind(ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE);
				} else if ("enumeration".equals(stereotype)) {
					ch.ehi.interlis.domainsandconstants.DomainDef imptype = new ch.ehi.interlis.domainsandconstants.DomainDef();
					impclass = imptype;
					ch.ehi.interlis.domainsandconstants.basetypes.Enumeration enumeration = new ch.ehi.interlis.domainsandconstants.basetypes.Enumeration();
					enumeration.setKind(ch.ehi.interlis.domainsandconstants.basetypes.EnumKind.UNDEFINED);
					imptype.attachType(enumeration);
				} else {
					((ch.ehi.interlis.modeltopicclass.ClassDef) impclass)
							.setKind(ch.ehi.interlis.modeltopicclass.ClassDefKind.CLASS);
				}
			} else if (aclass.getXMIName().equals("UML:Association")
					|| aclass.getXMIName().equals("UML:AssociationClass")) {
				impclass = new ch.ehi.interlis.associations.AssociationDef();
			}
			name = (String) aclass.getXMIValueOfValue("name");
			if (name != null) {
				if (name.startsWith("{")) {
					name = null;
				} else {
					int pos = name.indexOf('{');
					if (pos > 0) {
						name = name.substring(0, pos - 1);
					}
					impclass.setDefLangName(name);
				}
			}
			String docu = findTaggedValue(aclass.getXMIId(), "documentation");
			if (docu != null) {
				impclass.setDocumentation(new NlsString(docu));
			}
			if (aclass.getXMIValueOfValue("isAbstract").equals("true")) {
				if (impclass instanceof ch.ehi.interlis.modeltopicclass.AbstractClassDef) {
					((ch.ehi.interlis.modeltopicclass.AbstractClassDef) impclass).setAbstract(true);
				}
			}
			((ch.ehi.uml1_4.foundation.core.Namespace) arg).addOwnedElement(impclass);
			xmi2imp.put(aclass, impclass);
		} else {
			impclass = (ch.ehi.uml1_4.foundation.core.ModelElement) xmi2imp.get(aclass);
		}
		// visit Attributes/Operations
		Object obj = aclass.getXMIValueOfValue("UML:Classifier.feature");
		visitValue(obj, impclass);
		// visit Generalization
		if (impclass instanceof ch.ehi.interlis.modeltopicclass.AbstractClassDef) {
			obj = aclass.getXMIValueOfValue("UML:Namespace.ownedElement");
			visitValue(obj, impclass);
		}
		// visit Roles
		if (impclass instanceof ch.ehi.interlis.associations.AssociationDef) {
			obj = aclass.getXMIValueOfValue("UML:Association.connection");
			visitValue(obj, impclass);
			if (pass == 2 && impclass.getName() == null) {
				Iterator rolei = ((ch.ehi.interlis.associations.AssociationDef) impclass).iteratorConnection();
				StringBuffer namebuf = new StringBuffer();
				while (rolei.hasNext()) {
					ch.ehi.interlis.associations.RoleDef role = (ch.ehi.interlis.associations.RoleDef) rolei.next();
					namebuf.append(role.getDefLangName());
				}
				impclass.setDefLangName(namebuf.toString());

			}
		}
		return null;
		// -end- 3E0F4D5300A3 body3E0DB0710357 "visitAbstractClass"
	}

	// -beg- preserve=no 3E0F4D780010 head3E0DB0710357 "visitPackage"
	public java.lang.Object visitPackage(XMIObject apackage, java.lang.Object arg)
	// -end- 3E0F4D780010 head3E0DB0710357 "visitPackage"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4D780010 throws3E0DB0710357 "visitPackage"

	// -end- 3E0F4D780010 throws3E0DB0710357 "visitPackage"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4D780010 body3E0DB0710357 "visitPackage"
		ch.ehi.uml1_4.modelmanagement.Package imppackage;
		if (pass == 1) {
			String stereotype = findStereotype(apackage.getXMIId());
			if ("ILIMODEL".equals(stereotype)) {
				imppackage = new ch.ehi.interlis.modeltopicclass.ModelDef();
			} else if ("ILITOPIC".equals(stereotype)) {
				imppackage = new ch.ehi.interlis.modeltopicclass.TopicDef();
			} else {
				imppackage = new ch.ehi.uml1_4.implementation.UmlPackage();
			}
			imppackage.setDefLangName((String) apackage.getXMIValueOfValue("name"));
			String docu = findTaggedValue(apackage.getXMIId(), "documentation");
			if (docu != null) {
				imppackage.setDocumentation(new NlsString(docu));
			}
			((ch.ehi.uml1_4.foundation.core.Namespace) arg).addOwnedElement(imppackage);
			xmi2imp.put(apackage, imppackage);
		} else {
			imppackage = (ch.ehi.uml1_4.modelmanagement.Package) xmi2imp.get(apackage);
		}
		Object obj = apackage.getXMIValueOfValue("UML:Namespace.ownedElement");
		visitValue(obj, imppackage);
		return null;
		// -end- 3E0F4D780010 body3E0DB0710357 "visitPackage"
	}

	// -beg- preserve=no 3E0F4D870116 head3E0DB0710357 "visitModel"
	public java.lang.Object visitModel(XMIObject model, java.lang.Object arg)
	// -end- 3E0F4D870116 head3E0DB0710357 "visitModel"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4D870116 throws3E0DB0710357 "visitModel"

	// -end- 3E0F4D870116 throws3E0DB0710357 "visitModel"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4D870116 body3E0DB0710357 "visitModel"
		ch.ehi.uml1_4.foundation.core.Namespace impmodel;
		if (pass == 1) {
			impmodel = new ch.ehi.interlis.modeltopicclass.INTERLIS2Def();
			impmodel.setDefLangName((String) model.getXMIValueOfValue("name"));
			String docu = findTaggedValue(model.getXMIId(), "documentation");
			if (docu != null) {
				impmodel.setDocumentation(new NlsString(docu));
			}
			((ch.ehi.uml1_4.foundation.core.Namespace) arg).addOwnedElement(impmodel);
			xmi2imp.put(model, impmodel);

			boolean createmodel = true;
			Collection topv = cont.getData("UML:Stereotype");
			Iterator topi = topv.iterator();
			while (topi.hasNext()) {
				XMIObject obj = (XMIObject) topi.next();
				if (obj.getXMIValueOfValue("name").equals("ILIMODEL")) {
					createmodel = false;
				}
			}
			if (createmodel) {
				ch.ehi.uml1_4.foundation.core.Namespace impmodel2 = new ch.ehi.interlis.modeltopicclass.ModelDef();
				impmodel2.setDefLangName((String) model.getXMIValueOfValue("name"));
				impmodel.addOwnedElement(impmodel2);
				// replace INTERLIS2Def with ModelDef
				xmi2imp.put(model, impmodel2);
				impmodel = impmodel2;
			}

		} else {
			impmodel = (ch.ehi.uml1_4.foundation.core.Namespace) xmi2imp.get(model);
		}
		Object obj = model.getXMIValueOfValue("UML:Namespace.ownedElement");
		visitValue(obj, impmodel);
		return null;
		// -end- 3E0F4D870116 body3E0DB0710357 "visitModel"
	}

	// -beg- preserve=no 3E0F4D9B036D head3E0DB0710357 "visitGeneralization"
	public java.lang.Object visitGeneralization(XMIObject gen, java.lang.Object arg)
	// -end- 3E0F4D9B036D head3E0DB0710357 "visitGeneralization"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4D9B036D throws3E0DB0710357 "visitGeneralization"

	// -end- 3E0F4D9B036D throws3E0DB0710357 "visitGeneralization"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4D9B036D body3E0DB0710357
		// "visitGeneralization"
		if (pass == 2) {
			// child and parent points to class
			String childId = (String) gen.getXMIValueOfValue("child");
			XMIObject child = (XMIObject) id2xmiobj.get(childId);
			String parentId = (String) gen.getXMIValueOfValue("parent");
			XMIObject parent = (XMIObject) id2xmiobj.get(parentId);
			ch.ehi.uml1_4.foundation.core.ModelElement ele;
			ele = (ch.ehi.uml1_4.foundation.core.ModelElement) xmi2imp.get(child);
			if (!(ele instanceof ch.ehi.interlis.modeltopicclass.ClassDef)) {
				log(java.text.MessageFormat.format(rsrc.getString("CIerrGenIgnored"), (Object[]) new String[] {
						(String) parent.getXMIValueOfValue("name"), (String) child.getXMIValueOfValue("name") }));
				return null;
			}
			ch.ehi.interlis.modeltopicclass.ClassDef impchild = (ch.ehi.interlis.modeltopicclass.ClassDef) ele;
			ele = (ch.ehi.uml1_4.foundation.core.ModelElement) xmi2imp.get(parent);
			if (!(ele instanceof ch.ehi.interlis.modeltopicclass.ClassDef)) {
				log(java.text.MessageFormat.format(rsrc.getString("CIerrGenIgnored"),(Object[]) new String[] {
						(String) parent.getXMIValueOfValue("name"), (String) child.getXMIValueOfValue("name") }));
				return null;
			}
			ch.ehi.interlis.modeltopicclass.ClassDef impparent = (ch.ehi.interlis.modeltopicclass.ClassDef) ele;
			ch.ehi.interlis.modeltopicclass.ClassExtends impgen = new ch.ehi.interlis.modeltopicclass.ClassExtends();
			if (impparent.getDefLangName().equals(impchild.getDefLangName())) {
				impgen.setExtended(true);
			}
			impgen.attachChild(impchild);
			impgen.attachParent(impparent);
			xmi2imp.put(gen, impgen);
		}
		return null;
		// -end- 3E0F4D9B036D body3E0DB0710357 "visitGeneralization"
	}

	// -beg- preserve=no 3E0F4DB1024D head3E0DB0710357 "visitAssociationEnd"
	public java.lang.Object visitAssociationEnd(XMIObject role, java.lang.Object arg)
	// -end- 3E0F4DB1024D head3E0DB0710357 "visitAssociationEnd"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4DB1024D throws3E0DB0710357 "visitAssociationEnd"

	// -end- 3E0F4DB1024D throws3E0DB0710357 "visitAssociationEnd"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4DB1024D body3E0DB0710357
		// "visitAssociationEnd"
		// type points to class
		ch.ehi.interlis.associations.RoleDef improle = null;
		if (pass == 2) {
			improle = new ch.ehi.interlis.associations.RoleDef();
			((ch.ehi.interlis.associations.AssociationDef) arg).addConnection(improle);
			String name = (String) role.getXMIValueOfValue("name");
			String docu = findTaggedValue(role.getXMIId(), "documentation");
			if (docu != null) {
				improle.setDocumentation(new NlsString(docu));
			}
			String participantId = (String) role.getXMIValueOfValue("type");
			XMIObject participant = (XMIObject) id2xmiobj.get(participantId);
			ch.ehi.uml1_4.foundation.core.ModelElement impele = (ch.ehi.uml1_4.foundation.core.ModelElement) xmi2imp
					.get(participant);
			if (name != null && name.length() > 0) {
				improle.setDefLangName(name);
			} else {
				improle.setDefLangName(impele.getDefLangName());
			}
			ch.ehi.interlis.modeltopicclass.ClassDef impparticipant = null;
			if (impele instanceof ch.ehi.interlis.domainsandconstants.DomainDef) {
				impparticipant = findStructure((ch.ehi.interlis.domainsandconstants.DomainDef) impele);
			} else {
				impparticipant = (ch.ehi.interlis.modeltopicclass.ClassDef) impele;
			}
			improle.attachParticipant(impparticipant);
			String aggregation = (String) role.getXMIValueOfValue("aggregation");
			if (aggregation.equals("aggregate")) {
				improle.setAggregation(ch.ehi.interlis.associations.RoleDefKind.AGGREGATE);
			} else if (aggregation.equals("composite")) {
				improle.setAggregation(ch.ehi.interlis.associations.RoleDefKind.COMPOSITE);
			}
			String ordering = (String) role.getXMIValueOfValue("ordering");
			if (ordering.equals("ordered")) {
				improle.setOrdering(ch.ehi.uml1_4.foundation.datatypes.OrderingKind.ORDERED);
			}
			xmi2imp.put(role, improle);
		}
		Object obj = role.getXMIValueOfValue("UML:AssociationEnd.multiplicity");
		visitValue(obj, improle);
		return null;
		// -end- 3E0F4DB1024D body3E0DB0710357 "visitAssociationEnd"
	}

	// -beg- preserve=no 3E0F4DB40193 head3E0DB0710357 "visitMultiplicity"
	public java.lang.Object visitMultiplicity(XMIObject multiplicity, java.lang.Object arg)
	// -end- 3E0F4DB40193 head3E0DB0710357 "visitMultiplicity"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4DB40193 throws3E0DB0710357 "visitMultiplicity"

	// -end- 3E0F4DB40193 throws3E0DB0710357 "visitMultiplicity"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4DB40193 body3E0DB0710357 "visitMultiplicity"
		ch.ehi.uml1_4.implementation.UmlMultiplicity m = null;
		if (pass == 2) {
			m = new ch.ehi.uml1_4.implementation.UmlMultiplicity();
		}
		Object obj = multiplicity.getXMIValueOfValue("UML:Multiplicity.range");
		visitValue(obj, m);
		if (pass == 2) {
			if (m.sizeRange() > 0) {
				if (arg instanceof ch.ehi.interlis.associations.RoleDef) {
					((ch.ehi.interlis.associations.RoleDef) arg).setMultiplicity(m);
				} else {
					((ch.ehi.interlis.attributes.AttributeDef) arg).setMultiplicity(m);
				}
			}
		}
		return null;
		// -end- 3E0F4DB40193 body3E0DB0710357 "visitMultiplicity"
	}

	// -beg- preserve=no 3E0F4DF203AF head3E0DB0710357 "visitMultiplicityRange"
	public java.lang.Object visitMultiplicityRange(XMIObject range, java.lang.Object arg)
	// -end- 3E0F4DF203AF head3E0DB0710357 "visitMultiplicityRange"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4DF203AF throws3E0DB0710357
	// "visitMultiplicityRange"

	// -end- 3E0F4DF203AF throws3E0DB0710357 "visitMultiplicityRange"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4DF203AF body3E0DB0710357
		// "visitMultiplicityRange"
		// lower, upper
		if (pass == 2) {
			String lower = (String) range.getXMIValueOfValue("lower");
			String upper = (String) range.getXMIValueOfValue("upper");
			ch.ehi.uml1_4.implementation.UmlMultiplicityRange mr = new ch.ehi.uml1_4.implementation.UmlMultiplicityRange();
			mr.setLower(Long.parseLong(lower));
			if (upper.equals("-1")) {
				mr.setUpper(ch.ehi.uml1_4.implementation.UmlMultiplicityRange.UNBOUND);
			} else {
				mr.setUpper(Long.parseLong(upper));
			}
			((ch.ehi.uml1_4.implementation.UmlMultiplicity) arg).addRange(mr);
		}
		return null;
		// -end- 3E0F4DF203AF body3E0DB0710357 "visitMultiplicityRange"
	}

	// -beg- preserve=no 3E0F4DFC0204 head3E0DB0710357 "visitDiagram"
	public java.lang.Object visitDiagram(XMIObject diagram, java.lang.Object arg)
	// -end- 3E0F4DFC0204 head3E0DB0710357 "visitDiagram"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4DFC0204 throws3E0DB0710357 "visitDiagram"

	// -end- 3E0F4DFC0204 throws3E0DB0710357 "visitDiagram"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4DFC0204 body3E0DB0710357 "visitDiagram"
		if ("Rational Rose 98".equals(diagram.getXMIValueOfValue("toolName"))
				&& "ClassDiagram".equals(diagram.getXMIValueOfValue("diagramType"))) {
			ch.ehi.umleditor.umlpresentation.Diagram impdiagram = null;
			if (pass == 1) {
				String ownerId = (String) diagram.getXMIValueOfValue("owner");
				XMIObject owner = (XMIObject) id2xmiobj.get(ownerId);
				ch.ehi.uml1_4.foundation.core.Namespace impowner = (ch.ehi.uml1_4.foundation.core.Namespace) xmi2imp
						.get(owner);
				impdiagram = new ch.ehi.umleditor.umlpresentation.Diagram();
				impdiagram.setName(new ch.ehi.basics.types.NlsString((String) diagram.getXMIValueOfValue("name")));
				// documentation of diagram is not exported as tagged value
				String docu = (String) diagram.getXMIValueOfValue("style");
				if (docu != null && docu.startsWith("Doc:")) {
					impdiagram.setDocumentation(new NlsString(docu.substring(4)));
				}
				impowner.addDiagram(impdiagram);
				xmi2imp.put(diagram, impdiagram);
			} else {
				impdiagram = (ch.ehi.umleditor.umlpresentation.Diagram) xmi2imp.get(diagram);
			}
			// System.out.println("visitDiagram:
			// "+diagram.getXMIValueOfValue("name"));
			Object obj = diagram.getXMIValueOfValue("UML:Diagram.element");
			visitValue(obj, impdiagram);
		}
		return null;
		// -end- 3E0F4DFC0204 body3E0DB0710357 "visitDiagram"
	}

	// -beg- preserve=no 3E0F4E0A01B4 head3E0DB0710357 "visitDiagramElement"
	public java.lang.Object visitDiagramElement(XMIObject diagele, java.lang.Object arg)
	// -end- 3E0F4E0A01B4 head3E0DB0710357 "visitDiagramElement"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4E0A01B4 throws3E0DB0710357 "visitDiagramElement"

	// -end- 3E0F4E0A01B4 throws3E0DB0710357 "visitDiagramElement"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4E0A01B4 body3E0DB0710357
		// "visitDiagramElement"
		ch.ehi.umleditor.umlpresentation.Diagram impdiag = (ch.ehi.umleditor.umlpresentation.Diagram) arg;
		String style = (String) diagele.getXMIValueOfValue("style");
		// System.out.println("visitDiagramElement: "+style);
		if (style.startsWith("Association:")) {
			if (pass == 2) {
				String subjectId = (String) diagele.getXMIValueOfValue("subject");
				XMIObject subject = (XMIObject) id2xmiobj.get(subjectId);
				ch.ehi.uml1_4.foundation.core.ModelElement impsubject = (ch.ehi.uml1_4.foundation.core.ModelElement) xmi2imp
						.get(subject);

				if (!(impsubject instanceof ch.ehi.interlis.associations.AssociationDef)) {
					return null;
				}
				ch.ehi.interlis.associations.AssociationDef assocdef = (ch.ehi.interlis.associations.AssociationDef) impsubject;

				// check if all ends are on this diagram
				java.util.Iterator rolei = assocdef.iteratorConnection();
				boolean skipAssoc = false; // true if not all ends on this
											// diagram
				while (!skipAssoc && rolei.hasNext()) {
					Object objD = rolei.next();
					if (!(objD instanceof ch.ehi.interlis.associations.RoleDef)) {
						skipAssoc = true;
						continue;
					}
					ch.ehi.interlis.associations.RoleDef role = (ch.ehi.interlis.associations.RoleDef) objD;
					if (!role.containsParticipant()) {
						skipAssoc = true;
						continue;
					}
					ch.ehi.interlis.modeltopicclass.ClassDef end = (ch.ehi.interlis.modeltopicclass.ClassDef) role
							.getParticipant();
					if (findPresentationElement(impdiag, end) == null) {
						skipAssoc = true;
						continue;
					}
				}

				// all ends on this diagram?
				if (!skipAssoc) {

					// create composite
					ch.ehi.umleditor.umlpresentation.Association assocFig = new ch.ehi.umleditor.umlpresentation.Association();

					// create linkPresentation
					ch.ehi.umleditor.umlpresentation.PresentationAssocClass linkFig = new ch.ehi.umleditor.umlpresentation.PresentationAssocClass();
					linkFig.addSubject(assocdef);
					assocFig.attachLinkPresentation(linkFig);

					// create rolePresentation's
					rolei = assocdef.iteratorConnection();
					while (rolei.hasNext()) {
						ch.ehi.interlis.associations.RoleDef role = (ch.ehi.interlis.associations.RoleDef) rolei.next();
						ch.ehi.interlis.modeltopicclass.AbstractClassDef end = (ch.ehi.interlis.modeltopicclass.AbstractClassDef) role
								.getParticipant();
						ch.ehi.umleditor.umlpresentation.PresentationRole roleFig = new ch.ehi.umleditor.umlpresentation.PresentationRole();
						roleFig.addEndpoint(linkFig);
						roleFig.addEndpoint(
								(ch.ehi.umleditor.umlpresentation.Class) findPresentationElement(impdiag, end));
						roleFig.addSubject(role);
						assocFig.addRolePresentation(roleFig);
					}

					assocFig.addSubject(assocdef);
					impdiag.addPresentationElement(assocFig);
				}
			}
		} else if (style.equals("Role")) {
		} else if (style.startsWith("Note:")) {
			if (pass == 2) {
				String subjectId = (String) diagele.getXMIValueOfValue("subject");
				XMIObject subject = (XMIObject) id2xmiobj.get(subjectId);
				String annotatedElementId = (String) subject.getXMIValueOfValue("annotatedElement");
				XMIObject annotatedElement = (XMIObject) id2xmiobj.get(annotatedElementId);
				ch.ehi.uml1_4.foundation.core.ModelElement impannotatedElement = (ch.ehi.uml1_4.foundation.core.ModelElement) xmi2imp
						.get(annotatedElement);
				ch.ehi.umleditor.umlpresentation.Note note = new ch.ehi.umleditor.umlpresentation.Note();
				note.setContent(new NlsString((String) subject.getXMIValueOfValue("name")));
				String geometry = ((String) diagele.getXMIValueOfValue("geometry"));
				int start = 0;
				int pos = geometry.indexOf(',');
				String value = geometry.substring(start, pos).trim();
				note.setEast(Integer.parseInt(value));
				start = pos + 2;
				pos = geometry.indexOf(',', start);
				value = geometry.substring(start, pos).trim();
				note.setSouth(Integer.parseInt(value));
				impdiag.addPresentationElement(note);
				// create edge that links the note to the presentation of the
				// modelelement
				ch.ehi.uml1_4.foundation.core.PresentationElement fig = findPresentationElement(impdiag,
						impannotatedElement);
				if (fig != null) {
					ch.ehi.umleditor.umlpresentation.NoteEdge edge = null;
					edge = new ch.ehi.umleditor.umlpresentation.NoteEdge();
					edge.addEndpoint(fig);
					edge.addEndpoint(note);
					impdiag.addPresentationElement(edge);
				}
			}
		} else if (style.equals("Inheritance")) {
			if (pass == 2) {
				String subjectId = (String) diagele.getXMIValueOfValue("subject");
				XMIObject subject = (XMIObject) id2xmiobj.get(subjectId);
				ch.ehi.uml1_4.foundation.core.ModelElement impsubject = (ch.ehi.uml1_4.foundation.core.ModelElement) xmi2imp
						.get(subject);
				if (impsubject == null) {
					return null;
				}
				ch.ehi.umleditor.umlpresentation.PresentationEdge edge = null;
				edge = new ch.ehi.umleditor.umlpresentation.Generalization();
				edge.addSubject(impsubject);
				ch.ehi.umleditor.umlpresentation.PresentationNode node = null;
				node = (ch.ehi.umleditor.umlpresentation.PresentationNode) findPresentationElement(impdiag,
						((ch.ehi.uml1_4.foundation.core.Generalization) impsubject).getChild());
				edge.addEndpoint(node);
				node = (ch.ehi.umleditor.umlpresentation.PresentationNode) findPresentationElement(impdiag,
						((ch.ehi.uml1_4.foundation.core.Generalization) impsubject).getParent());
				edge.addEndpoint(node);
				impdiag.addPresentationElement(edge);
			}
		} else {
			String subjectId = (String) diagele.getXMIValueOfValue("subject");
			XMIObject subject = (XMIObject) id2xmiobj.get(subjectId);
			ch.ehi.uml1_4.foundation.core.ModelElement impsubject = (ch.ehi.uml1_4.foundation.core.ModelElement) xmi2imp
					.get(subject);
			if (pass == 1) {
				ch.ehi.umleditor.umlpresentation.PresentationNode node = null;
				if (impsubject instanceof ch.ehi.interlis.modeltopicclass.ClassDef) {
					node = new ch.ehi.umleditor.umlpresentation.Class();
				} else if (impsubject instanceof ch.ehi.interlis.associations.AssociationDef) {
					return null;
				} else if (impsubject instanceof ch.ehi.interlis.modeltopicclass.ModelDef
						|| impsubject instanceof ch.ehi.interlis.modeltopicclass.TopicDef
						|| impsubject instanceof ch.ehi.uml1_4.implementation.UmlPackage) {
					node = new ch.ehi.umleditor.umlpresentation.Package();
				} else {
					// log("diagele "+subjectId+", "+style);
					return null;
				}
				node.addSubject(impsubject);
				String geometry = ((String) diagele.getXMIValueOfValue("geometry"));
				int start = 0;
				int pos = geometry.indexOf(',');
				String value = geometry.substring(start, pos).trim();
				node.setEast(Integer.parseInt(value));
				start = pos + 2;
				pos = geometry.indexOf(',', start);
				value = geometry.substring(start, pos).trim();
				node.setSouth(Integer.parseInt(value));
				impdiag.addPresentationElement(node);
			} else if (pass == 2) {
				if (impsubject instanceof ch.ehi.interlis.associations.AssociationDef) {
					ch.ehi.uml1_4.foundation.core.PresentationElement fig = findPresentationElement(impdiag,
							impsubject);
					if (fig instanceof ch.ehi.umleditor.umlpresentation.Association) {
						fig = ((ch.ehi.umleditor.umlpresentation.Association) fig).getLinkPresentation();
					}
					ch.ehi.umleditor.umlpresentation.PresentationAssocClass node = (ch.ehi.umleditor.umlpresentation.PresentationAssocClass) fig;
					String geometry = ((String) diagele.getXMIValueOfValue("geometry"));
					int start = 0;
					int pos = geometry.indexOf(',');
					String value = geometry.substring(start, pos).trim();
					int x = Integer.parseInt(value);
					start = pos + 2;
					pos = geometry.indexOf(',', start);
					value = geometry.substring(start, pos).trim();
					int y = Integer.parseInt(value);
					// should store polar coordinates
					node.setClassAngle(x);
					node.setClassRadius(y);
				}
			}
		}
		return null;
		// -end- 3E0F4E0A01B4 body3E0DB0710357 "visitDiagramElement"
	}

	// -beg- preserve=no 3E0F4E3502BB head3E0DB0710357 "doXmiFile"
	public void doXmiFile(String filename)
	// -end- 3E0F4E3502BB head3E0DB0710357 "doXmiFile"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F4E3502BB throws3E0DB0710357 "doXmiFile"

	// -end- 3E0F4E3502BB throws3E0DB0710357 "doXmiFile"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F4E3502BB body3E0DB0710357 "doXmiFile"
		try {
			domain2struct = new HashMap();
			xmi2imp = new HashMap();
			id2xmiobj = new HashMap();
			XMIFile f = XMIFile.load(filename, XMIFile.DEFAULT, false);
			cont = new XMIContainer(f.getObjects().iterator());
			for (Iterator it = cont.getObjects().iterator(); it.hasNext();) {
				XMIObject obj = (XMIObject) it.next();
				String id = obj.getXMIId();
				if (id != null) {
					id2xmiobj.put(id, obj);
				}
			}

			for (pass = 1; pass <= 2; pass++) {
				// System.out.println(cont);
				Collection topv = cont.getData("UML:Model");
				Iterator topi = topv.iterator();
				while (topi.hasNext()) {
					XMIObject obj = (XMIObject) topi.next();
					visitModel(obj, ch.ehi.umleditor.application.LauncherView.getInstance().getModel());
				}
				Collection diagv = cont.getData("UML:Diagram");
				Iterator diagi = diagv.iterator();
				while (diagi.hasNext()) {
					XMIObject obj = (XMIObject) diagi.next();
					visitDiagram(obj, null);
				}
			}

		} catch (Exception e) {
			// show exception here or pass it to caller?
			e.printStackTrace();
		}
		// refresh view
		ch.ehi.umleditor.application.LauncherView.getInstance().refreshModel();
		// -end- 3E0F4E3502BB body3E0DB0710357 "doXmiFile"
	}

	// -beg- preserve=no 3E0F5AF0028F head3E0DB0710357 "visitDatatype"
	public java.lang.Object visitDatatype(XMIObject type, java.lang.Object arg)
	// -end- 3E0F5AF0028F head3E0DB0710357 "visitDatatype"
	// declare any checked exceptions
	// please fill in/modify the following section
	// -beg- preserve=no 3E0F5AF0028F throws3E0DB0710357 "visitDatatype"

	// -end- 3E0F5AF0028F throws3E0DB0710357 "visitDatatype"
	{
		// please fill in/modify the following section
		// -beg- preserve=yes 3E0F5AF0028F body3E0DB0710357 "visitDatatype"
		// findTaggedValue(aclass.getXMIId(),"persistence") );
		// findStereotype(aclass.getXMIId()) );
		ch.ehi.interlis.domainsandconstants.DomainDef imptype;
		if (pass == 1) {
			imptype = new ch.ehi.interlis.domainsandconstants.DomainDef();
			imptype.setDefLangName((String) type.getXMIValueOfValue("name"));
			String docu = findTaggedValue(type.getXMIId(), "documentation");
			if (docu != null) {
				imptype.setDocumentation(new NlsString(docu));
			}
			// define default datatype (TEXT*40)
			ch.ehi.interlis.domainsandconstants.basetypes.Text text = new ch.ehi.interlis.domainsandconstants.basetypes.Text();
			text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
			text.setMaxLength(40);
			imptype.attachType(text);
			((ch.ehi.uml1_4.foundation.core.Namespace) arg).addOwnedElement(imptype);
			xmi2imp.put(type, imptype);
		} else {
			imptype = (ch.ehi.interlis.domainsandconstants.DomainDef) xmi2imp.get(type);
		}
		return null;
		// -end- 3E0F5AF0028F body3E0DB0710357 "visitDatatype"
	}

	// declare/define something only in the code
	// please fill in/modify the following section
	// -beg- preserve=yes 3E0DB0710357 detail_end "TransferFromXmiRoseMetamodel"
	private void log(String logmsg) {
		ch.ehi.umleditor.application.LauncherView.getInstance().log("xmirose", logmsg);
	}

	private static ch.ehi.uml1_4.foundation.core.PresentationElement findPresentationElement(
			ch.ehi.umleditor.umlpresentation.Diagram diagram, ch.ehi.uml1_4.foundation.core.ModelElement subject) {
		Iterator elei = diagram.iteratorPresentationElement();
		while (elei.hasNext()) {
			ch.ehi.uml1_4.foundation.core.PresentationElement ele = (ch.ehi.uml1_4.foundation.core.PresentationElement) elei
					.next();
			Iterator subi = ele.iteratorSubject();
			while (subi.hasNext()) {
				if (subi.next() == subject) {
					return ele;
				}
			}
		}
		return null;
	}

	private ch.ehi.interlis.modeltopicclass.ClassDef findStructure(
			ch.ehi.interlis.domainsandconstants.DomainDef impele) {
		ch.ehi.interlis.modeltopicclass.ClassDef impparticipant = (ch.ehi.interlis.modeltopicclass.ClassDef) domain2struct
				.get(impele);
		if (impparticipant == null) {
			// create new structure in same topic as domaindef
			ch.ehi.uml1_4.foundation.core.Namespace domainPackage = impele.getNamespace();
			ch.ehi.interlis.modeltopicclass.ClassDef newstruct = new ch.ehi.interlis.modeltopicclass.ClassDef();
			newstruct.setDefLangName(impele.getDefLangName() + "_");
			newstruct.setKind(ch.ehi.interlis.modeltopicclass.ClassDefKind.STRUCTURE);
			ch.ehi.interlis.attributes.AttributeDef attr = new ch.ehi.interlis.attributes.AttributeDef();
			attr.setDefLangName("value");
			ch.ehi.interlis.attributes.DomainAttribute attrtype = new ch.ehi.interlis.attributes.DomainAttribute();
			attrtype.attachDomainDef((ch.ehi.interlis.domainsandconstants.DomainDef) impele);
			attr.attachAttrType(attrtype);
			newstruct.addFeature(attr);
			domainPackage.addOwnedElement(newstruct);
			domain2struct.put(impele, newstruct);
			impparticipant = newstruct;
		}
		return impparticipant;
	}

	private boolean isMaxCardOne(XMIObject attr) {
		ch.ehi.interlis.associations.RoleDef improle = null;
		improle = new ch.ehi.interlis.associations.RoleDef();
		Object obj = attr.getXMIValueOfValue("UML:StructuralFeature.multiplicity");
		visitValue(obj, improle);
		ch.ehi.uml1_4.foundation.datatypes.Multiplicity m = improle.getMultiplicity();
		Iterator mri = m.iteratorRange();
		long max = 0;
		while (mri.hasNext()) {
			ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange mr = (ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange) mri
					.next();
			max = mr.getUpper();
		}
		return max == 1;
	}

	private boolean isMinCardOne(XMIObject attr) {
		ch.ehi.interlis.associations.RoleDef improle = null;
		improle = new ch.ehi.interlis.associations.RoleDef();
		Object obj = attr.getXMIValueOfValue("UML:StructuralFeature.multiplicity");
		visitValue(obj, improle);
		ch.ehi.uml1_4.foundation.datatypes.Multiplicity m = improle.getMultiplicity();
		Iterator mri = m.iteratorRange();
		long min = 0;
		while (mri.hasNext()) {
			ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange mr = (ch.ehi.uml1_4.foundation.datatypes.MultiplicityRange) mri
					.next();
			min = mr.getLower();
		}
		return min == 1;
	}

	public java.lang.Object visitOperation(XMIObject ops, java.lang.Object aclass) {
		if (aclass instanceof ch.ehi.interlis.modeltopicclass.AbstractClassDef) {
			if (pass == 2) {
				ch.ehi.uml1_4.implementation.UmlOperation impop = new ch.ehi.uml1_4.implementation.UmlOperation();
				impop.setDefLangName((String) ops.getXMIValueOfValue("name"));
				String docu = findTaggedValue(ops.getXMIId(), "documentation");
				if (docu != null) {
					impop.setDocumentation(new NlsString(docu));
				}
				String visibility = (String) ops.getXMIValueOfValue("visibility");
				if (visibility.equals("public")) {
					impop.setVisibility(ch.ehi.uml1_4.foundation.datatypes.VisibilityKind.PUBLIC);
				} else if (visibility.equals("private")) {
					impop.setVisibility(ch.ehi.uml1_4.foundation.datatypes.VisibilityKind.PRIVATE);
				} else if (visibility.equals("protected")) {
					impop.setVisibility(ch.ehi.uml1_4.foundation.datatypes.VisibilityKind.PROTECTED);
				} else if (visibility.equals("package")) {
					impop.setVisibility(ch.ehi.uml1_4.foundation.datatypes.VisibilityKind.PACKAGE);
				}
				// isSpecification = 'false'
				String ownerScope = (String) ops.getXMIValueOfValue("ownerScope");
				if (ownerScope.equals("instance")) {
					impop.setOwnerScope(ch.ehi.uml1_4.foundation.datatypes.ScopeKind.INSTANCE);
				} else if (ownerScope.equals("classifier")) {
					impop.setOwnerScope(ch.ehi.uml1_4.foundation.datatypes.ScopeKind.CLASSIFIER);
				}
				String isQuery = (String) ops.getXMIValueOfValue("isQuery");
				impop.setQuery(isQuery.equals("true") ? true : false);
				String concurrency = (String) ops.getXMIValueOfValue("concurrency");
				if (concurrency.equals("sequential")) {
					impop.setConcurrency(ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind.SEQUENTIAL);
				} else if (concurrency.equals("quarded")) {
					impop.setConcurrency(ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind.GUARDED);
				} else if (concurrency.equals("concurrent")) {
					impop.setConcurrency(ch.ehi.uml1_4.foundation.datatypes.CallConcurrencyKind.CONCURRENT);
				}
				String isRoot = (String) ops.getXMIValueOfValue("isRoot");
				impop.setRoot(isRoot.equals("true") ? true : false);
				String isLeaf = (String) ops.getXMIValueOfValue("isLeaf");
				impop.setLeaf(isLeaf.equals("true") ? true : false);
				String isAbstract = (String) ops.getXMIValueOfValue("isAbstract");
				impop.setAbstract(isAbstract.equals("true") ? true : false);
				String specification = (String) ops.getXMIValueOfValue("specification");
				impop.setSpecification(new NlsString(specification));

				Object obj = ops.getXMIValueOfValue("UML:BehavioralFeature.parameter");
				visitValue(obj, impop);

				((ch.ehi.uml1_4.foundation.core.Classifier) aclass).addFeature(impop);
			}
		}
		return null;
	}

	public java.lang.Object visitParameter(XMIObject param, java.lang.Object ops) {
		if (ops instanceof ch.ehi.uml1_4.foundation.core.Operation) {
			if (pass == 2) {
				ch.ehi.uml1_4.implementation.UmlParameter impparam = new ch.ehi.uml1_4.implementation.UmlParameter();
				impparam.setDefLangName((String) param.getXMIValueOfValue("name"));
				String docu = findTaggedValue(param.getXMIId(), "documentation");
				if (docu != null) {
					impparam.setDocumentation(new NlsString(docu));
				}
				// visibility = 'public'
				// isSpecification = 'false'

				String kind = (String) param.getXMIValueOfValue("kind");
				if (kind.equals("inout")) {
					impparam.setKind(ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.INOUT);
				} else if (kind.equals("in")) {
					impparam.setKind(ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.IN);
				} else if (kind.equals("out")) {
					impparam.setKind(ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.OUT);
				} else if (kind.equals("return")) {
					impparam.setKind(ch.ehi.uml1_4.foundation.datatypes.ParameterDirectionKind.RETURN);
				}
				// type = 'G.1'

				((ch.ehi.uml1_4.foundation.core.Operation) ops).addParameter(impparam);
			}
		}
		return null;
	}

	// -end- 3E0DB0710357 detail_end "TransferFromXmiRoseMetamodel"

}
