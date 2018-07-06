package ch.ehi.umleditor.translationxml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.Test;

import ch.ehi.uml1_4.modelmanagement.Model;
import ch.ehi.umleditor.xmiuml.PersistenceService;
import ch.interlis.ili2c.generator.nls.ElementType;
import ch.interlis.ili2c.generator.nls.ModelElements;
import ch.interlis.ili2c.generator.nls.TranslationElement;

class TransferToXmlTest {

	File xmlFile = new File("out.xml");
	String umlfile = "testdata/translationxml/TestB.uml";
	
	/**
	 * Es ueberprueft, ob die MODELLEN korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void model() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfModel = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef90")) {
					assertEquals("ModelDef90", ele.getName_en());
					assertEquals("", ele.getDocumentation_en());
					assertEquals(ElementType.MODEL, ele.getElementType());
					numberOfModel++;
				} else if (ele.getScopedName().equals("ModelDef4")) {
					assertEquals("ModelDef4", ele.getName_en());
					assertEquals("ModelDef4_de", ele.getName_de());	
					assertEquals("Documentation EN Model4", ele.getDocumentation_en());
					assertEquals("Documentation DE Model", ele.getDocumentation_de());
					assertEquals(ElementType.MODEL, ele.getElementType());
					numberOfModel++;
				}
			}
		}
		assertEquals(2,numberOfModel);
	}

	/**
	 * Es ueberprueft, ob die TOPIC korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void topic() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfTopic = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5")) {
					assertEquals("TopicDef5", ele.getName_en());
					assertEquals("Documentation EN Topic5", ele.getDocumentation_en());
					assertEquals("Documentation DE Topic5", ele.getDocumentation_de());
					assertEquals(ElementType.TOPIC, ele.getElementType());
					numberOfTopic++;
				} else if (ele.getScopedName().equals("ModelDef90.TopicDef91")) {
					assertEquals("TopicDef91", ele.getName_en());
					assertEquals("", ele.getDocumentation_en());
					assertEquals(ElementType.TOPIC, ele.getElementType());
					numberOfTopic++;					
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef89")) {
					assertEquals("TopicDef89", ele.getName_en());
					assertEquals("DOcumentation EN Topic 89", ele.getDocumentation_en());
					assertEquals("DOcumentation DE Topic 89", ele.getDocumentation_de());
					assertEquals(ElementType.TOPIC, ele.getElementType());
					numberOfTopic++;					
				}
			}
		}
		assertEquals(3, numberOfTopic);
	}

	/**
	 * Es ueberprueft, ob die UNIT korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void unit() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfUnit = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef89.UnitDef93")) {
					assertEquals("UnitDef93", ele.getName_en());
					assertEquals("Documentation EN Unit 93", ele.getDocumentation_en());
					assertEquals("Documentation DE Unit 93", ele.getDocumentation_de());		
					assertEquals(ElementType.UNIT, ele.getElementType());
					numberOfUnit++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.UnitDef87")) {
					assertEquals("UnitDef87", ele.getName_en());
					assertEquals("Documentation EN UnitDef87", ele.getDocumentation_en());
					assertEquals("Documentation DE UnitDef87", ele.getDocumentation_de());		
					assertEquals(ElementType.UNIT, ele.getElementType());
					numberOfUnit++;
				}
			}
		}
		assertEquals(2, numberOfUnit);
	}

	/**
	 * Es ueberprueft, ob die DOMAIN korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void domain() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.DomainDef86")) {
					assertEquals("DomainDef86", ele.getName_en());
					assertEquals("Documentation EN Domain 86", ele.getDocumentation_en());
					assertEquals("Documentation DE Domain 86", ele.getDocumentation_de());
					assertEquals(ElementType.DOMAIN, ele.getElementType());
					return;
				}
			}
		}
		fail("DOMAIN can not be found!");
	}

	/**
	 * Es ueberprueft, ob die KLASSEN korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void classTest() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfClass = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef85")) {
					assertEquals("ClassDef85", ele.getName_en());
					assertEquals("Documentation EN Class 85", ele.getDocumentation_en());
					assertEquals("Documentation DE Class 85", ele.getDocumentation_de());
					assertEquals(ElementType.CLASS, ele.getElementType());
					numberOfClass++;
				} else if (ele.getScopedName().equals("ModelDef90.TopicDef91.ClassDef92")) {
					assertEquals("ClassDef92", ele.getName_en());
					assertEquals("", ele.getDocumentation_en());
					assertEquals(ElementType.CLASS, ele.getElementType());
					numberOfClass++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef117")) {
					assertEquals("ClassDef117", ele.getName_de());
					assertEquals("Documentation EN Class 117", ele.getDocumentation_en());
					assertEquals("Documentation DE Class 117", ele.getDocumentation_de());
					assertEquals(ElementType.CLASS, ele.getElementType());
					numberOfClass++;
				}
			}
		}
		assertEquals(3, numberOfClass);
	}

	/**
	 * Es ueberprueft, ob die VIEWDEF88 korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void view() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.ViewDef88")) {
					assertEquals("ViewDef88", ele.getName_en());
					assertEquals("ViewDef88", ele.getName_de());
					assertEquals("Documentation EN View 88", ele.getDocumentation_en());
					assertEquals(ElementType.VIEW, ele.getElementType());
					return;
				}
			}
		}
		fail("VIEW ViewDef88 can not be found!");
	}
	
	/**
	 * Es ueberprueft, ob die FUNCTION korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void function() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.FunctionDef106")) {
					assertEquals("FunctionDef106", ele.getName_de());
					assertEquals("Ducumentation EN Func\n", ele.getDocumentation_en());
					assertEquals("Documentation DE Func\n", ele.getDocumentation_de());
					assertEquals(ElementType.FUNCTION, ele.getElementType());
					return;
				}
			}
		}
		fail("FUNCTION can not be found!");
	}
	
	/**
	 * Es ueberprueft, ob die ATTRIBUTEN korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void attribute() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfattr = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef85.AttributeDef94")) {
					assertEquals("AttributeDef94", ele.getName_en());
					assertEquals("Documentation EN Attr94", ele.getDocumentation_en());
					assertEquals("Documentation DE AttrDef 94", ele.getDocumentation_de());
					assertEquals(ElementType.ATTRIBUTE, ele.getElementType());
					numberOfattr++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef85.AttributeDef95")) {
					assertEquals("AttributeDef95", ele.getName_en());
					assertEquals("Documentation EN Attr95", ele.getDocumentation_en());
					assertEquals(ElementType.ATTRIBUTE, ele.getElementType());
					numberOfattr++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef85.AttributeDef85")) {
					assertEquals("AttributeDef85", ele.getName_en());
					assertEquals("", ele.getDocumentation_en());
					assertEquals("", ele.getDocumentation_de());
					assertEquals(ElementType.ATTRIBUTE, ele.getElementType());
					numberOfattr++;
				}
			}
		}
		assertEquals(3, numberOfattr);
	}
	
	/**
	 * Es ueberprueft, ob die ENUMERATIONELEMENTEN korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void enumerationElement() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfenum = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef85.AttributeDef85.EnumEleA_en")) {
					assertEquals("EnumEleA_en", ele.getName_en());
					assertEquals("EnumEleA_de", ele.getName_de());
					assertEquals("", ele.getDocumentation_en());
					assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
					numberOfenum++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef85.AttributeDef85.EnumEleA_en.EnumEleA1_en")) {
					assertEquals("EnumEleA1_en", ele.getName_en());
					assertEquals("EnumEleA1_de", ele.getName_de());
					assertEquals("docu Enum Ele A1 in en", ele.getDocumentation_en());
					assertEquals("docu Enum Ele A1 in de", ele.getDocumentation_de());
					assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
					numberOfenum++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef85.AttributeDef85.EnumEleA_en.EnumEleA2_en")) {
					assertEquals("EnumEleA2_en", ele.getName_en());
					assertEquals("EnumEleA2_de", ele.getName_de());
					assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
					numberOfenum++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.DomainDef86.EnumElement102")) {
					assertEquals("EnumElement102", ele.getName_en());
					assertEquals("Docu DoaminDef86-EnumElement102\n", ele.getDocumentation_en());
					assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
					numberOfenum++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.DomainDef86.EnumElement102.EnumElement103")) {
					assertEquals("EnumElement103", ele.getName_en());
					assertEquals("Documentation DE EnumEl103", ele.getDocumentation_de());
					assertEquals("Docu DoaminDef86-EnumElement102-ENumEL103", ele.getDocumentation_en());
					assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
					numberOfenum++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.DomainDef86.EnumElement102.EnumElement105")) {
					assertEquals("EnumElement105", ele.getName_en());
					assertEquals("Documentation DE EnumEl105", ele.getDocumentation_de());
					assertEquals("Docu DoaminDef86-EnumElement102-ENumEL105", ele.getDocumentation_en());
					assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
					numberOfenum++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.DomainDef86.EnumEleD_en")) {
					assertEquals("EnumEleD_en", ele.getName_en());
					assertEquals("Documentation DE EnumEleD_en", ele.getDocumentation_de());
					assertEquals("Docu DoaminDef86-EnumEleD_en", ele.getDocumentation_en());
					assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
					numberOfenum++;
				} 
			}
		}
		assertEquals(7, numberOfenum);
	}
	
	/**
	 * Es ueberprueft, ob die ASSOCIATIONDEF korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void associationDef() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfAssoDef = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.AssociationDef111")) {
					assertEquals("AssociationDef111", ele.getName_en());
					assertEquals("AssociationDef111", ele.getName_de());	
					assertEquals("Documentation EN ASSO 111", ele.getDocumentation_en());
					assertEquals("Docu AsscoiationDef", ele.getDocumentation_de());
					assertEquals(ElementType.ASSOCIATION, ele.getElementType());
					numberOfAssoDef++;
				}
			}
		}
		assertEquals(1,numberOfAssoDef);
	}
	
	/**
	 * Es ueberprueft, ob die ROLEN korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void role() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfRole = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.AssociationDef111.RoleDef112")) {
					assertEquals("RoleDef112", ele.getName_en());
					assertEquals("RoleDef112", ele.getName_de());	
					assertEquals(ElementType.ROLE, ele.getElementType());
					numberOfRole++;
				} else if (ele.getScopedName().equals("ModelDef4.TopicDef5.AssociationDef111.RoleDef113")) {
					assertEquals("RoleDef113", ele.getName_de());	
					assertEquals(ElementType.ROLE, ele.getElementType());
					numberOfRole++;
				}
			}
		}
		assertEquals(2,numberOfRole);
	}
	
	/**
	 * Es ueberprueft, ob die STRUCTURE korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void structure() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfRole = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.StructA")) {
					assertEquals("StructA", ele.getName_de());	
					assertEquals(ElementType.CLASS, ele.getElementType());
					numberOfRole++;
				}
			}
		}
		assertEquals(1,numberOfRole);
	}
	
	/**
	 * Es ueberprueft, ob die CONSTRAINT korrekt in das translation xml file geschrieben wurde.
	 */
	@Test
	void constraint() throws Exception {
		PersistenceService service = new PersistenceService();
		Model model = service.readFile(umlfile);
		TransferToXml trsf = new TransferToXml();
		ModelElements modelElement = trsf.export(model, xmlFile);
		int numberOfConstraint = 0;
		for (TranslationElement ele : modelElement) {
			if (ele.getScopedName() != null) {
				if (ele.getScopedName().equals("ModelDef4.TopicDef5.ClassDef117.ConstraintA")) {
					assertEquals("ConstraintA", ele.getName_de());	
					assertEquals(ElementType.CONSTRAINT, ele.getElementType());
					numberOfConstraint++;
				}
			}
		}
		assertEquals(1,numberOfConstraint);
	}
}
