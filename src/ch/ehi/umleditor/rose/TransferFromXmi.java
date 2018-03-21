package ch.ehi.umleditor.rose;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.associations.AssociationDef;
import ch.ehi.interlis.associations.RoleDef;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.domainsandconstants.basetypes.BooleanType;
import ch.ehi.interlis.domainsandconstants.basetypes.ClassType;
import ch.ehi.interlis.domainsandconstants.basetypes.CoordinateType;
import ch.ehi.interlis.domainsandconstants.basetypes.DateTimeType;
import ch.ehi.interlis.domainsandconstants.basetypes.DateType;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
import ch.ehi.interlis.domainsandconstants.basetypes.HorizAlignment;
import ch.ehi.interlis.domainsandconstants.basetypes.NumericalType;
import ch.ehi.interlis.domainsandconstants.basetypes.OidType;
import ch.ehi.interlis.domainsandconstants.basetypes.Text;
import ch.ehi.interlis.domainsandconstants.basetypes.TimeType;
import ch.ehi.interlis.domainsandconstants.linetypes.IliPolyline;
import ch.ehi.interlis.domainsandconstants.linetypes.IndividualSurface;
import ch.ehi.interlis.domainsandconstants.linetypes.Tesselation;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.ClassDefKind;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.uml1_4.implementation.UmlPackage;
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.application.NavigationView;

public class TransferFromXmi {
	public UmlPackage umlPackage = null;
	public INTERLIS2Def interlis = null;
	public ModelDef modelo = null;
	public TopicDef topic = null;
	public DomainDef dominio = null;
	public UnitDef unidad = null;
	public ClassDef clase = null;
	public AssociationDef asociacion = null;
	public DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	public Date date = new Date();
	private Document doc = null;

	public void doXmiFile(String filename) {
		try {
			// Reading xmi file
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(new File(filename));

			doc.getDocumentElement().normalize();

			// Documentation xmi
			String version = doc.getDocumentElement().getAttribute("xmi:version");
			Node exporter = doc.getElementsByTagName("xmi:Documentation").item(0).getAttributes().item(0);

			// Validating
			if (version.equals("2.1") && exporter.getNodeValue().equals("ili2c")) {
				// NodeList l = doc.getElementsByTagName("packagedElement");
				LauncherView launcherview = LauncherView.getInstance();
				NavigationView navigator = launcherview.getIvjPnlNavigation();
				Object root = navigator.getTreNavigation().getModel().getRoot();
				
				if (root instanceof UmlModel) {
					UmlModel firstNode = (UmlModel) root;
					Node uml2 = doc.getFirstChild();
					NodeList childNodes = uml2.getChildNodes();
					for (int i = 0; i < childNodes.getLength(); i++) {

						Node childNode = childNodes.item(i);

						if (childNode.getNodeType() == Node.ELEMENT_NODE) {
							Element elem = (Element) childNode;
							String tagName = elem.getTagName();
							if (tagName.equals("xmi:Documentation")) {
								// nada por ahora
							} else if (tagName.equals("uml:Model")) {
								Node packageNode = childNode.getChildNodes().item(1); // fist child is " /n", second is the true
								NodeList packageNodes = packageNode.getChildNodes();
								for (int j = 0; j < packageNodes.getLength(); j++) {
									Node childPackageNode = packageNodes.item(j);
									if (childPackageNode.getNodeType() == Node.ELEMENT_NODE) {
										elem = (Element) childPackageNode;
										String modelDefId = elem.getAttribute("xmi:id");
										String modelDefName = elem.getAttribute("name");

										if (modelDefId.equals("INTERLIS")) { // Ya lo tengo
											continue;
										}

										interlis = new INTERLIS2Def();
										interlis.setName(new NlsString(modelDefName + ".ili"));
										interlis.setVersion(2.3);
										interlis.setDocumentation(new NlsString("Extracted from xmi"));

										if (umlPackage != null) {
											umlPackage.addOwnedElement(interlis);
										} else {
											firstNode.addOwnedElement(interlis);
										}

										modelo = new ModelDef();
										modelo.setName(new NlsString(modelDefName));
										modelo.setVersion(new NlsString(dateFormat.format(date)));
										modelo.setIssuerURI(new NlsString("mailto:vmbp@localhost"));
										modelo.setDocumentation(new NlsString("Extracted from xmi"));
										interlis.addOwnedElement(modelo);

										//

										NodeList packageElementNodes = childPackageNode.getChildNodes();
										for (int k = 0; k < packageElementNodes.getLength(); k++) {
											Node packageElementNode = packageElementNodes.item(k);
											if (packageElementNode.getNodeType() == Node.ELEMENT_NODE) {
												elem = (Element) packageElementNode;
												String elemName = elem.getAttribute("name");
												addPackageToModel(elem, modelo);												
											}
										}
									}
								}
							} else if (tagName.equals("ili:ModelDef")) {

							} else if (tagName.equals("ili:UnitDef")) {

							} else if (tagName.equals("ili:TopicDef")) {

							}
						}
					}
				}

			} else {
				System.out.println("NO PUEDO LEER ESTO!!!!!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Type findTypeAttribute(String nodeValue) {
		String idTextType = "C16095C6-1D80-49ab-9A0B-5847A355489B"; // Verschiedene Arten von Text
		String idEnumerationType = "279A049B-2BCC-4fb5-9C8F-3B22EF3EE0ED"; // Verschiedene Arten von Aufzaehlungen
		String idEnumTreeValueType = "064231DE-6F7D-43bb-A0B9-B4C37906E012"; // Weitere Art von Aufzaehlung
		String idAlignmentType = "B5F4B6BC-41B7-400b-84DF-64474E7B3F07"; // Vordefinierte Aufzaehlung (fuer
																			// ili1-Kompatibilitaet)
		String idBooleanType = "D2A6D48C-97F0-44d0-910A-7C55943BECA7"; // Vordefinierte Aufzaehlung (True/False)
		String idNumericType = "39FDCDA0-DAE3-4c14-B2DC-C4F0F4DAAAF8"; // Ganze Zahlen, Fliesskommazahlen,
																		// Festkommazahlen (inkl. min/max, Masseinheit)
		String idFormattedType = "36B2DF93-856E-4997-B610-61C456A6BD1B"; // Anwenderdefinierbare serialisierte
																			// Datentypen
		String idTimeType = "FBAA3B46-D164-4ecf-96C5-31D69315FDDF"; // Zeit inkl. min/max
		String idDateType = "259523F4-AAC6-4fe2-8B34-B9113604AB8C"; // Datum inkl. min/max
		String idDateTimeType = "5904195D-E562-4262-9F6B-7104FA1AB70D"; // Datum + Zeit inkl. min/max
		String idOIDType = "19ACF3BB-5A8B-4b73-9C38-D37C3DC8B207"; // Anwenderdefinierbare Arten von
																	// Objekt-Identifikatoren
		String idBlackboxType = "93ADB54A-B82F-421c-8C50-8881FFD61F42"; // Beliebige XML-Fragmente oder binaere Objekte
		String idClassType = "F1B17749-EACA-4ed1-A9EC-40B63C2A94B0"; // Klassenname (primaer fuer Metamodelle relevant)
		String idAttributePathType = "5AD53796-0781-4f5d-AEFA-B11FD46DD5AB"; // Attributname (primaer fuer Metamodelle
																				// relevant)
		String idCoordinateType = "45397FCA-66E2-4ac8-A8A7-89D3A573E44B"; // Koordinate (mit verschiedenen
																			// Konsistenzbedingungen)
		String idPolylineType = "F466480C-C0A2-47de-A0FC-D9D3932DB96E"; // Linie (mit verschiedenen
																		// Konsistenzbedingungen)
		String idSurfaceType = "D874C9DB-F082-4bd4-B4F1-DACD75BBFDD6"; // Einzelflaeche (mit verschiedenen
																		// Konsistenzbedingungen)
		String idAreaType = "E06837E3-F58C-49bb-8F82-22F666FB4CCF"; // Flaechennetz (= Einzelflaeche + vordefinierte
																	// Konsistenzbedingung)

		if (nodeValue.equals(idBooleanType)) {
			BooleanType bool = new BooleanType();
			return bool;
		}
		if (nodeValue.equals(idTextType)) {
			Text texto = new Text();
			return texto;
		}
		if (nodeValue.equals(idEnumerationType)) {
			Enumeration enumas = new Enumeration();
			return enumas;
		}
		if (nodeValue.equals(idNumericType)) {
			ch.ehi.interlis.domainsandconstants.basetypes.NumericalType numret = new NumericalType() {
			};
			// NumericType num = new NumericType();

			return numret;
		}
		if (nodeValue.equals(idCoordinateType)) {
			CoordinateType coor = new CoordinateType();
			return coor;
		}
		if (nodeValue.equals(idPolylineType)) {
			IliPolyline poli = new IliPolyline();
			return poli;
		}
		if (nodeValue.equals(idSurfaceType)) {
			IndividualSurface surf = new IndividualSurface();
			return surf;
		}
		if (nodeValue.equals(idAreaType)) {
			Tesselation area = new Tesselation();
			return area;
		}
		if (nodeValue.equals(idDateType)) {
			DateType date = new DateType();
			return date;
		}
		if (nodeValue.equals(idDateTimeType)) {
			DateTimeType dateTime = new DateTimeType();
			return dateTime;
		}
		if (nodeValue.equals(idTimeType)) {
			TimeType time = new TimeType();
			return time;
		}
		if (nodeValue.equals(idOIDType)) {
			OidType oid = new OidType();
			return oid;
		}
		if (nodeValue.equals(idClassType)) {
			ClassType clas = new ClassType();
			return clas;
		}
		if (nodeValue.equals(idAlignmentType)) { // Assign Horizontal by default
			HorizAlignment hor = new HorizAlignment();
			return hor;
		}
		return null;
	}

	private boolean isUnitDef(Element elem) {
		NodeList units = doc.getElementsByTagName("ili:UnitDef");
		String idClass = elem.getAttribute("xmi:id");
		for (int j = 0; j < units.getLength(); ++j) {
			Node propUnit = units.item(j);
			NamedNodeMap attrUnit = propUnit.getAttributes();
			if (attrUnit.getNamedItem("base_Class").getNodeValue().equals(idClass)) {
				return true;
			}
		}
		return false;
	}

	private boolean isTopicDef(NamedNodeMap attr) {
		String id = attr.getNamedItem("xmi:id").getNodeValue();
		String[] elements = id.split("[.]");
		if (elements.length == 2) {
			return true;
		}
		return false;
	}

	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	private boolean isINTERLIS2Def(NamedNodeMap attr) {
		String id = attr.getNamedItem("xmi:id").getNodeValue();
		if (id.contains(".") || isNumeric(id)) {
			return false;
		}
		return true;
	}
	
	private void addTopicToModel(Element elem, ModelDef modelo) {
		topic = new TopicDef();
		String topicName = elem.getAttribute("name");
		topic.setName(new NlsString(topicName));
		modelo.addOwnedElement(topic);
		
		Node node = (Node) elem;
		NodeList atributos = node.getChildNodes();
		for (int x = 0; x < atributos.getLength(); ++x) {
			Node ownedAttribute = atributos.item(x);
			if (ownedAttribute.getNodeType() == Node.ELEMENT_NODE) {
				Element ownedAttributeElement = (Element) ownedAttribute;
				String elemName = ownedAttributeElement.getAttribute("name");
				String type = ownedAttributeElement.getAttribute("type");
				addPackageToModel(ownedAttributeElement, topic);
			}
		}
	}
	
	// soy el recursivo
	private void addPackageToModel(Element elem, ModelElement modelo) {
		String packagedElementType = elem.getAttribute("xmi:type");
		String elemName = elem.getAttribute("name");
		if (packagedElementType.equals("uml:PrimitiveType")) {
			// dominio
			addDomainToModel(elem, modelo);
		} else if (packagedElementType.equals("uml:DataType")) {
			// estructura 
			addStructureToModel(elem, modelo);
		} else if (packagedElementType.equals("uml:Enumeration")) {
			// estructura de tipo enumeracion
			addStructureEnumTypeToModel(elem, modelo);
		} else if (packagedElementType.equals("uml:Class")) {
			if (isUnitDef(elem)) {
				unidad = new UnitDef();
				unidad.setName(new NlsString(elemName));
				unidad.setDocumentation(new NlsString("Extracted from xmi"));
				if (modelo instanceof ModelDef) {
					ModelDef _modelo = (ModelDef) modelo;
					_modelo.addOwnedElement(unidad);
				} else if (modelo instanceof TopicDef) {
					TopicDef _modelo = (TopicDef) modelo;
					_modelo.addOwnedElement(unidad);
				}
			} else {
				// clase normal
				addClassToModel(elem, modelo);
			}
		} else if (packagedElementType.equals("uml:Association")) {
			// Asociacion
			addAssociationToModel(elem, modelo);
		} else if (packagedElementType.equals("uml:Package")) {
			// un package dentro de otro package es un topic
			if (modelo instanceof ModelDef) {
				addTopicToModel(elem, (ModelDef)modelo);
			}
		} else {
			// nada
		} 
	}
	
	private void addAssociationToModel(Element elem, ModelElement modelo) {
		asociacion = new AssociationDef();
		asociacion.setName(new NlsString(elem.getAttribute("name")));
		asociacion.setDocumentation(new NlsString("Extracted from xmi")); 
		
		Node node = (Node) elem;
		NodeList roles = node.getChildNodes();
		for (int x = 0; x < roles.getLength(); ++x) {
			Node ownedEnd = roles.item(x);
			if (ownedEnd.getNodeType() == Node.ELEMENT_NODE) {
				Element ownedEndElement = (Element) ownedEnd;
				String ownedEndName = ownedEndElement.getAttribute("name");
				RoleDef rol = new RoleDef(); rol.setName(new NlsString(ownedEndName));
				rol.setDocumentation(new NlsString("Extracted from xmi"));
				rol.setIliAttributeKind(0);
						  
				asociacion.addConnection(rol);
				
			}
		}
		if (modelo instanceof ModelDef) {
			ModelDef _modelo = (ModelDef) modelo;
			_modelo.addOwnedElement(asociacion);
		} else if (modelo instanceof TopicDef) {
			TopicDef _modelo = (TopicDef) modelo;
			_modelo.addOwnedElement(asociacion);
		}
		
	}

	private void addStructureEnumTypeToModel(Element elem, ModelElement modelo) {
		dominio = new DomainDef();
		String structureEnumName = elem.getAttribute("name");
		dominio.setName(new NlsString(structureEnumName));
		Enumeration element = new Enumeration();
		element.setKind(1); // Get childs of actual packagedElement
		
		Node node = (Node) elem;
		NodeList enumElements = node.getChildNodes();
		for (int x = 0; x < enumElements.getLength(); ++x) {
			Node ownedLiteral = enumElements.item(x);
			if (ownedLiteral.getNodeType() == Node.ELEMENT_NODE) {
				Element ownedLiteralElement = (Element) ownedLiteral;
				
				EnumElement actualEnumElement = new EnumElement();
				String ownedLiteralName = ownedLiteralElement.getAttribute("name");
				actualEnumElement.setName(new NlsString(ownedLiteralName));
				element.addEnumElement(actualEnumElement);
				
			}
		}
		Type typeOfElement = (Type)element;
		dominio.detachType();
		dominio.attachType(typeOfElement);
		dominio.setDocumentation(new NlsString("Extracted from xmi"));
		
		if (modelo instanceof ModelDef) {
			ModelDef _modelo = (ModelDef) modelo;
			_modelo.addOwnedElement(dominio);
		} else if (modelo instanceof TopicDef) {
			TopicDef _modelo = (TopicDef) modelo;
			_modelo.addOwnedElement(dominio);
		}
		
	}

	private void addDomainToModel(Element elem, ModelElement modelo) {
		dominio = new DomainDef();
		String domainName = elem.getAttribute("name");
		dominio.setName(new NlsString(domainName));
		dominio.setDocumentation(new NlsString("Extracted from xmi"));
		if (modelo instanceof ModelDef) {
			ModelDef _modelo = (ModelDef) modelo;
			_modelo.addOwnedElement(dominio);
		} else if (modelo instanceof TopicDef) {
			TopicDef _modelo = (TopicDef) modelo;
			_modelo.addOwnedElement(dominio);
		}
	}

	private void addStructureToModel(Element elem, ModelElement modelo) {
		clase = new ClassDef();
		String className = elem.getAttribute("name");
		clase.setName(new NlsString(className));
		clase.setDocumentation(new NlsString("Extracted from xmi"));
		clase.setKind(ClassDefKind.STRUCTURE);
				
		Node node = (Node) elem;
		NodeList atributos = node.getChildNodes();
		
		for(int x=0;x<atributos.getLength(); ++x) { 
			Node ownedAttribute = atributos.item(x);
			if (ownedAttribute.getNodeType() == Node.ELEMENT_NODE) {
				Element ownedAttributeElement = (Element) ownedAttribute;
				//findTypeAttribute(ownedAttributeElement.getAttribute("type"));
				
				DomainAttribute attrType = new DomainAttribute();
				ch.ehi.interlis.domainsandconstants.basetypes.Text text = new ch.ehi.interlis.domainsandconstants.basetypes.Text();
				text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
				text.setMaxLength(20);
				attrType.attachDirect(text);
				
				AttributeDef atributo = new AttributeDef();
				atributo.setName(new NlsString(ownedAttributeElement.getAttribute("name")));
				atributo.setDocumentation(new NlsString("Extracted from xmi"));
				atributo.attachAttrType(attrType);
				
				clase.addFeature((Feature) atributo);
			}
		}
		if (modelo instanceof ModelDef) {
			ModelDef _modelo = (ModelDef) modelo;
			_modelo.addOwnedElement(clase);
		} else if (modelo instanceof TopicDef) {
			TopicDef _modelo = (TopicDef) modelo;
			_modelo.addOwnedElement(clase);
		}
		
	}

	public void addClassToModel (Element elem, ModelElement modelo) {
		clase = new ClassDef();
		clase.setKind(ClassDefKind.CLASS);
		String className = elem.getAttribute("name");
		clase.setName(new NlsString(className));
		clase.setDocumentation(new NlsString("Extracted from xmi"));
		
		Node node = (Node) elem;
		NodeList atributos = node.getChildNodes();
		for (int x=0; x<atributos.getLength(); ++x) {
			Node ownedAttribute = atributos.item(x);
			if (ownedAttribute.getNodeType() == Node.ELEMENT_NODE) {
				Element ownedAttributeElement = (Element) ownedAttribute;
				//findTypeAttribute(ownedAttributeElement.getAttribute("type"));
				
				if (ownedAttributeElement.getNodeName().equals("generalization")) {
					continue;
				} else {
					DomainAttribute attrType = new DomainAttribute();
					ch.ehi.interlis.domainsandconstants.basetypes.Text text = new ch.ehi.interlis.domainsandconstants.basetypes.Text();
					text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
					text.setMaxLength(20);
					attrType.attachDirect(text);
					
					String nombreAtributo = ownedAttributeElement.getAttribute("name");
					AttributeDef atributo = new AttributeDef();
					atributo.setName(new NlsString(nombreAtributo));
					atributo.setDocumentation(new NlsString("Extracted from xmi"));
					atributo.attachAttrType(attrType);
					
					clase.addFeature((Feature) atributo);
				}
			}
		}
		if (modelo instanceof ModelDef) {
			ModelDef _modelo = (ModelDef) modelo;
			clase.setAbstract(true);
			_modelo.addOwnedElement(clase);
		} else if (modelo instanceof TopicDef) {
			TopicDef _modelo = (TopicDef) modelo;
			_modelo.addOwnedElement(clase);
		}
	}

}