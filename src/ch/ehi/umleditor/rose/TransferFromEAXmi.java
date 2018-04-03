package ch.ehi.umleditor.rose;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

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
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.ClassDefKind;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.foundation.core.Namespace;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.uml1_4.implementation.UmlPackage;
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.application.MultiplicityConverter;
import ch.ehi.umleditor.application.NavigationView;

public class TransferFromEAXmi {
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
	private UmlModel firstNodeModel = null;

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
			if (version.equals("2.1") && exporter.getNodeValue().equals("Enterprise Architect")) {
				LauncherView launcherview = LauncherView.getInstance();
				NavigationView navigator = launcherview.getIvjPnlNavigation();
				Object root = navigator.getTreNavigation().getModel().getRoot();

				if (root instanceof UmlModel) {
					firstNodeModel = (UmlModel) root;
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
								Node packageNode = childNode.getChildNodes().item(1); // fist child is " /n", second is
																						// the true
								NodeList packageNodes = packageNode.getChildNodes();
								for (int j = 0; j < packageNodes.getLength(); j++) {
									Node childPackageNode = packageNodes.item(j);
									if (childPackageNode.getNodeType() == Node.ELEMENT_NODE) {
										elem = (Element) childPackageNode;
										String modelDefId = elem.getAttribute("xmi:id");
										String modelDefName = elem.getAttribute("name");

										if (modelDefName.equals("INTERLIS")) { // Ya lo tengo
											continue;
										}

										interlis = new INTERLIS2Def();
										interlis.setName(new NlsString(modelDefName + ".ili"));
										interlis.setVersion(2.3);
										interlis.setDocumentation(new NlsString("Extracted from xmi"));

										if (umlPackage != null) {
											umlPackage.addOwnedElement(interlis);
										} else {
											firstNodeModel.addOwnedElement(interlis);
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
							}
						}
					}
				}
			} else {
				LauncherView.getInstance().log("Xmi import", filename + " Cannot be read");
			}
		} catch (Exception e) {
			e.printStackTrace();
			LauncherView.getInstance().log("Xmi import", filename + " Cannot be read");
		}
	}

	// soy el recursivo
	public void addPackageToModel(Element elem, ModelElement modelo) {
		String packagedElementType = elem.getAttribute("xmi:type");
		String elemName = elem.getAttribute("name");
		if (packagedElementType.equals("uml:PrimitiveType")) {
			// dominio
			addDomainToModel(elem, modelo);

		} else if (packagedElementType.equals("uml:DataType")) {
			// estructura
			addStructureToModel(elem, modelo);
		} else if (packagedElementType.equals("uml:Enumeration")) {
			//
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
				addTopicToModel(elem, (ModelDef) modelo);
			}
		} else {
			// nada
		}
	}

	private boolean isUnitDef(Element elem) {
		NodeList units = doc.getElementsByTagName("thecustomprofile:UnitDef");
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

	private void addStructureToModel(Element elem, ModelElement modelo) {
		clase = new ClassDef();
		String className = elem.getAttribute("name");
		clase.setName(new NlsString(className));
		clase.setDocumentation(new NlsString("Extracted from xmi"));
		clase.setKind(ClassDefKind.STRUCTURE);

		Node node = (Node) elem;
		NodeList atributos = node.getChildNodes();

		for (int x = 0; x < atributos.getLength(); ++x) {
			Node ownedAttribute = atributos.item(x);
			if (ownedAttribute.getNodeType() == Node.ELEMENT_NODE) {
				Element ownedAttributeElement = (Element) ownedAttribute;
				// findTypeAttribute(ownedAttributeElement.getAttribute("type"));

				String typeAttr = ownedAttributeElement.getAttribute("type");
				String[] modelLocation = typeAttr.split("\\.");
				Namespace namespace = (Namespace) firstNodeModel;

				ModelElement modelElement = findRecursiveInterlis2Def(modelLocation);

				DomainAttribute attrType = new DomainAttribute();
				// ch.ehi.interlis.domainsandconstants.basetypes.Text text = new
				// ch.ehi.interlis.domainsandconstants.basetypes.Text();
				// text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
				// text.setMaxLength(20);
				// DomainAttribute attrType = (DomainAttribute) hola;
				// attrType.attachDirect(domain);
				if (modelElement instanceof DomainDef) {
					DomainDef domainDef = (DomainDef) modelElement;
					attrType.attachDomainDef(domainDef);
				}

				AttributeDef atributo = new AttributeDef();
				atributo.setName(new NlsString(ownedAttributeElement.getAttribute("name")));
				atributo.setDocumentation(new NlsString("Extracted from xmi"));
				atributo.attachAttrType(attrType);

				addCardinality(atributo, ownedAttribute);
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
		Type typeOfElement = (Type) element;
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

	public void addClassToModel(Element elem, ModelElement modelo) { // estructure tiene atributos Class no 
		clase = new ClassDef();
		clase.setKind(ClassDefKind.CLASS);
		String className = elem.getAttribute("name");
		clase.setName(new NlsString(className));
		clase.setDocumentation(new NlsString("Extracted from xmi"));

		Node node = (Node) elem;
		NodeList atributos = node.getChildNodes();
		for (int x = 0; x < atributos.getLength(); ++x) {
			Node ownedAttribute = atributos.item(x);
			if (ownedAttribute.getNodeType() == Node.ELEMENT_NODE) {
				Element ownedAttributeElement = (Element) ownedAttribute;

				if (ownedAttributeElement.getNodeName().equals("generalization")) {
					continue;
				} else {

					// Type tipoAtributo =
					// findTypeAttribute(ownedAttributeElement.getAttribute("type"));
					// ch.ehi.interlis.domainsandconstants.basetypes.Text text = new
					// ch.ehi.interlis.domainsandconstants.basetypes.Text();
					// text.setKind(ch.ehi.interlis.domainsandconstants.basetypes.TextKind.MAXLEN);
					// text.setMaxLength(20);
					// attrType.attachDirect(text);

					String nombreAtributo = ownedAttributeElement.getAttribute("name");
					AttributeDef atributo = new AttributeDef();
					atributo.setName(new NlsString(nombreAtributo));
					atributo.setDocumentation(new NlsString("Extracted from xmi"));

					addCardinality(atributo, ownedAttribute);
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

	private void addAssociationToModel(Element elem, ModelElement modelo) {
		asociacion = new AssociationDef();
		asociacion.setName(new NlsString(elem.getAttribute("name")));
		asociacion.setDocumentation(new NlsString("Extracted from xmi"));

		Node node = (Node) elem;
		NodeList roles = node.getChildNodes();
		RoleDef rol = null;
		;
		for (int x = 0; x < roles.getLength(); ++x) {
			Node ownedEnd = roles.item(x);
			if (ownedEnd.getNodeType() == Node.ELEMENT_NODE) {
				Element ownedEndElement = (Element) ownedEnd;

				if (ownedEndElement.getTagName().equals("memberEnd")) {
					continue;
				}
				String ownedEndName = ownedEndElement.getAttribute("name");
				String ownedEndType = ownedEndElement.getAttribute("type");

				rol = new RoleDef();
				rol.setName(new NlsString(ownedEndName));
				rol.setDocumentation(new NlsString("Extracted from xmi"));
				rol.setIliAttributeKind(0);

				String[] modelLocation = ownedEndType.split("\\.");
				ModelElement modelElement = findRecursiveInterlis2Def(modelLocation);
				if (modelElement instanceof ClassDef) {
					// ClassDef cla = (ClassDef)modelElement;
					// cla.addClassifierRole(rol); addOwnedElement(rol);
					addCardinality(rol, ownedEndElement);

					// rol.attachParticipant((ClassDef) modelElement);

					// rol.attachNamespace(modelElement.getNamespace());
				}
				//

				asociacion.addConnection(rol);
				//

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

	private void addCardinality(ModelElement modElement, Node ownedEnd) {
		Node lowerUpper = (Node) ownedEnd;
		NodeList cardinalidad = lowerUpper.getChildNodes();
		String range = null;
		String lower = null;
		String upper = null;
		for (int i = 0; i < cardinalidad.getLength(); ++i) {
			Node childOwnedEndElement = cardinalidad.item(i);

			if (childOwnedEndElement.getNodeType() == Node.ELEMENT_NODE) {
				Element lowerOrUpper = (Element) childOwnedEndElement;
				String typeCardinal = lowerOrUpper.getTagName();

				// "string type" mode
				if (typeCardinal.equals("lowerValue")) {
					lower = lowerOrUpper.getAttribute("value");

				} else if (typeCardinal.equals("upperValue")) {
					upper = lowerOrUpper.getAttribute("value");
				}

				if (lower != null && upper != null) {
					if (lower.equals(upper)) {
						range = lower;
					} else {
						range = lower + ".." + upper;
					}
				}

				/*
				 * // another mode ch.ehi.uml1_4.implementation.UmlMultiplicityRange r = new
				 * ch.ehi.uml1_4.implementation.UmlMultiplicityRange();
				 * if(typeCardinal.equals("lowerValue")) { lower =
				 * lowerOrUpper.getAttribute("value"); r.setLower(Long.parseLong(lower)); } else
				 * if(typeCardinal.equals("upperValue")) { upper =
				 * lowerOrUpper.getAttribute("value"); if(upper.equals("*")) {
				 * r.setUpper(Long.MAX_VALUE); } else { r.setUpper(Long.parseLong(upper)); }
				 * 
				 * }
				 * 
				 * ch.ehi.uml1_4.implementation.UmlMultiplicity m = new
				 * ch.ehi.uml1_4.implementation.UmlMultiplicity(); m.addRange(r);
				 * 
				 */
				if (modElement instanceof RoleDef) {
					// ((RoleDef)modElement).setMultiplicity(m);
					((RoleDef) modElement).setMultiplicity(MultiplicityConverter.createMultiplicity(range));
				} else if (modElement instanceof AttributeDef) {
					// ((AttributeDef)modElement).setMultiplicity(m);
					((AttributeDef) modElement).setMultiplicity(MultiplicityConverter.createMultiplicity(range));
				}

			}
		}
	}

	private ModelElement findRecursiveModelElement(int level, String[] modelLocation, Namespace currentNamespace) {
		Iterator it = currentNamespace.iteratorOwnedElement();
		while (it.hasNext()) {
			ModelElement ele = (ModelElement) it.next();
			String name = ele.getName().getValue();
			String levelName = modelLocation[level];
			if (name.equals(levelName)) {
				if (modelLocation.length - 1 == level) {
					return ele;
				} else {
					level++;
					return findRecursiveModelElement(level, modelLocation, (Namespace) ele);
				}
			}
		}
		return null;
	}

	private ModelElement findRecursiveInterlis2Def(String[] modelLocation) {
		Namespace _firstNodeModel = (Namespace) firstNodeModel;
		Iterator it = _firstNodeModel.iteratorOwnedElement();
		while (it.hasNext()) {
			ModelElement ele = (ModelElement) it.next();
			String name = ele.getName().getValue();
			ModelElement result = findRecursiveModelElement(0, modelLocation, (Namespace) ele);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
}
