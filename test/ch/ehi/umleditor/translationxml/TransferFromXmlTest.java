package ch.ehi.umleditor.translationxml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Map;

import org.junit.Test;

import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.modelmanagement.Model;
import ch.ehi.umleditor.xmiuml.PersistenceService;
import ch.interlis.ili2c.generator.nls.Ili2TranslationXml;
import ch.interlis.ili2c.generator.nls.TranslationElement;

public class TransferFromXmlTest {

	File translationXmlFile = new File("testdata/translationxml/changedOut.xml");
	String umlFile = "testdata/translationxml/TestBV2.uml";

	//Es ueberprueft, ob die MODEL korrekt in das translation xml file geschrieben wurde.
	@Test
	public void model() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("EnumOkA", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("Das ist Dokumentation zum Modell in DE", modelElement.getDocumentation().getValue(Ili2TranslationXml.DE));
        assertEquals("AddedFRNameForModel", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals("AddedFRDocumentationForModel", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	//Es ueberprueft, ob die TOPIC korrekt in das translation xml file geschrieben wurde.
	@Test
	public void topic() throws Exception {
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.TopicA";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("TopicA", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals(3, allNameValues.size());
	}

	//Es ueberprueft, ob die UNIT korrekt in das translation xml file geschrieben wurde.
	@Test
	public void unit() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA.m3secA";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("m3secA", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("m3secB", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	//Es ueberprueft, ob die FUNCTION korrekt in das translation xml file geschrieben wurde.
	@Test
	public void function() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA.FunctionA";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("FunctionA", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}
	
    //Es ueberprueft, ob die LINE FORM korrekt in das translation xml file geschrieben wurde.
    @Test
    public void lineform() throws Exception {
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.LineFormA";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("LineFormA", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("LineFormFR", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals(2, allNameValues.size());
    }
    
    //Es ueberprueft, ob die META DATA BASKET korrekt in das translation xml file geschrieben wurde.
    @Test
    public void metaDataBasket() throws Exception {
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.BCoordSysA";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("BCoordSysA", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("BCoordSysB", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals(2, allNameValues.size());
    }
    
    //Es ueberprueft, ob die PARAMETER korrekt in das translation xml file geschrieben wurde.
    @Test
    public void parameter() throws Exception {
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.TopicA.SymbolA.PosA";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("PosA", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("PosB", modelElement.getName().getValue(Ili2TranslationXml.EN));
        assertEquals(2, allNameValues.size());
    }
	
    //Es ueberprueft, ob die CONSTRAINT_WITH_EXPLICIT_NAME korrekt in das translation xml file geschrieben wurde.
    @Test
    public void constraintWithExplicitName() throws Exception { 
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.TopicA.ClassA.UniqueConstraintA";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("UniqueConstraintA", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("UniqueConstraintB", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals(3, allNameValues.size());
    }

    //Es ueberprueft, ob die CONSTRAINT_WITHOUT_EXPLICIT_NAME korrekt in das translation xml file geschrieben wurde.
    @Test
    public void constraintWithoutExplicitName() throws Exception {
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.TopicA.ClassA.Constraint1";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("Constraint1", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("Constraint2", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals(3, allNameValues.size());
    }

	//Es ueberprueft, ob die ASSOCIATION korrekt in das translation xml file geschrieben wurde.
	@Test
	public void associationDef() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA.TopicA.roleA1roleA2";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("roleA1roleA2", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	//Es ueberprueft, ob die ROLE korrekt in das translation xml file geschrieben wurde.
	@Test
	public void role() throws Exception {
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.TopicA.roleA1roleA2.roleA1";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("roleA1", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("roleFR", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals(2, allNameValues.size());
	}

    //Es ueberprueft, ob die DOMAIN korrekt in das translation xml file geschrieben wurde.
	@Test
	public void domain() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA.Coord2";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Coord2", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}
	
    //Es ueberprueft, ob die ENUMERATION ELEMENTEN korrekt in das translation xml file geschrieben wurde.
    @Test
    public void enumElement() throws Exception {
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.TopicA.ClassA.attrA.a2.a21";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("a21", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("fr21", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals(2, allNameValues.size());
    }
	
    //Es ueberprueft, ob die GRAFIK korrekt in das translation xml file geschrieben wurde.
    @Test
    public void graphic() throws Exception { 
        // Read UML File
        PersistenceService originalService = new PersistenceService();
        Model model = originalService.readFile(umlFile);

        // Read/Merge Translations from XML
        TransferFromXml fromXml = new TransferFromXml();
        fromXml.merge(model, translationXmlFile);

        String scopedName = "EnumOkA.GrafikA";
        ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

        assertNotNull(modelElement);
        Map<String, String> allNameValues = modelElement.getName().getAllValues();

        assertEquals("GrafikA", modelElement.getName().getValue(Ili2TranslationXml.DE));
        assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
        assertEquals(2, allNameValues.size());
    }

	//Es ueberprueft, ob die KLASSE korrekt in das translation xml file geschrieben wurde.
	@Test
	public void classTest() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA.TopicA.Dokument";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Dokument", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}
	
	//Es ueberprueft, ob die ATTRIBUTEN korrekt in das translation xml file geschrieben wurde.
	@Test
	public void attribute() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA.Klothoide.a";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("a", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals("Added Documentation FR", modelElement.getDocumentation().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

	//Es ueberprueft, ob die VIEW korrekt in das translation xml file geschrieben wurde.
	@Test
	public void view() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA.TopicA.ClassA_V";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("ClassA_V", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("ClassFR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}

    //Es ueberprueft, ob die STRUCTURE korrekt in das translation xml file geschrieben wurde.
	@Test
	public void structure() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		// Read/Merge Translations from XML
		TransferFromXml fromXml = new TransferFromXml();
		fromXml.merge(model, translationXmlFile);

		String scopedName = "EnumOkA.Klothoide";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertNotNull(modelElement);
		Map<String, String> allNameValues = modelElement.getName().getAllValues();

		assertEquals("Klothoide", modelElement.getName().getValue(Ili2TranslationXml.DE));
		assertEquals("Added Name FR", modelElement.getName().getValue(Ili2TranslationXml.FR));
		assertEquals(2, allNameValues.size());
	}
}
