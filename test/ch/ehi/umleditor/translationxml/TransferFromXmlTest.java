package ch.ehi.umleditor.translationxml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Map;

import org.junit.Test;

import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.modelmanagement.Model;
import ch.ehi.umleditor.xmiuml.PersistenceService;
import ch.interlis.ili2c.generator.nls.Ili2TranslationXml;

public class TransferFromXmlTest {

	File translationXmlFile = new File("testdata/translationxml/changedOut.xml");
	String umlFile = "testdata/translationxml/TestB.uml";

	/**
	 * Es ueberprueft, ob die MODELLEN korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void model() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("ChangedModelDef4_de", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("AddedModelNameFR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("AddedModelDocumentationFR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(3,allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die TOPIC korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void topic() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef89";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE TopicDef89", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added TopicName FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation Topic FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());

		//
		modelElement = null;
		scopedName = "ModelDef4.TopicDef5";
		modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		allNameValues.clear();
		allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE Topic5", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die UNIT korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void unit() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef89.UnitDef93";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE Unit 93", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added UnitName FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation Unit FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die FUNCTION korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void function() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.FunctionDef106";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE Func", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added FunctionName FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation Function FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(3, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die ASSOCIATION korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void associationDef() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.AssociationDef111";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Docu AsscoiationDef", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(3, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die ROLE korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void roleDef() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.AssociationDef111.RoleDef112";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(3, allNameValues.size());

		scopedName = "ModelDef4.TopicDef5.AssociationDef111.RoleDef113";
		modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		allNameValues.clear();
		allNameValues = modelElement.getName().getAllValues();

		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die DOMAIN korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void domain() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.DomainDef86";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE Domain 86", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die ENUM_ELEMENT von Domain korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void domainEnumElement() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.DomainDef86.EnumElement102";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die ENUM_SUBELEMENT von Domain korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void domainEnumSubElement() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.DomainDef86.EnumElement102.EnumElement103";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE EnumEl103", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}
	
	/**
	 * Es ueberprueft, ob die ENUM_ELEMENT von Attribute korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void attributeEnumElement() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef85.AttributeDef85.EnumEleA_en";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(3, allNameValues.size());
	}
	
	/**
	 * Es ueberprueft, ob die ENUM_SUBELEMENT von Attribute korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void attribiuteEnumSubElement() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef85.AttributeDef85.EnumEleA_en.EnumEleA1_en";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed docu Enum Ele A1 in de", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(3, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die CLASS korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void classTest() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef117";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE Class 117", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die CONSTRAINT korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void constraint() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef117.ConstraintA";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Docu DE", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}
	
	/**
	 * Es ueberprueft, ob die ATTRIBUTE korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void attribute() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef85.AttributeDef94";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Documentation DE AttrDef 94", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die VIEW korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void view() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.ViewDef88";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Added Documentation DE", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(3, allNameValues.size());
	}

	/**
	 * Es ueberprueft, ob die STRUCTURE korrekt aus das translation xml file geschrieben wurde.
	 */
	@Test
	public void structure() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.StructA";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Changed Docu DE", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}
	
	/**
	 * Es ueberprueft, ob die STRUCTURE korrekt aus das translation xml file nicht geschrieben wurde.
	 */
	@Test
	public void viewNotFound() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "ModelDef4.TopicDef5.ViewDefNotFound";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals(null, modelElement);
	}

}
