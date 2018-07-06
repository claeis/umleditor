package ch.ehi.umleditor.translationxml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.modelmanagement.Model;
import ch.ehi.umleditor.xmiuml.PersistenceService;

public class FindIliModelElementTest {

	String umlFile = "testdata/translationxml/TestB.uml";

	@Test
	public void model() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);
		assertEquals("ModelDef4", modelElement.getName().getValue());
	}

	@Test
	public void topic() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopeName = "ModelDef4.TopicDef89";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopeName);
		assertEquals("TopicDef89", modelElement.getName().getValue());

		//
		scopeName = "ModelDef4.TopicDef5";
		modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopeName);
		assertEquals("TopicDef5", modelElement.getName().getValue());
	}

	@Test
	public void unit() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef89.UnitDef93";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("UnitDef93", modelElement.getName().getValue());
	}

	@Test
	public void function() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.FunctionDef106";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("FunctionDef106", modelElement.getName().getValue());
	}

	@Test
	public void associationDef() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.AssociationDef111";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("AssociationDef111", modelElement.getName().getValue());
	}

	@Test
	public void roleDef() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.AssociationDef111.RoleDef112";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);
		assertEquals("RoleDef112", modelElement.getName().getValue());

		scopedName = "ModelDef4.TopicDef5.AssociationDef111.RoleDef113";
		modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);
		assertEquals("RoleDef113", modelElement.getName().getValue());
	}

	@Test
	public void domain() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.DomainDef86";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("DomainDef86", modelElement.getName().getValue());
	}

	@Test
	public void domainEnumElement() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.DomainDef86.EnumElement102";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("EnumElement102", modelElement.getName().getValue());
	}

	@Test
	public void domainEnumSubElement() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.DomainDef86.EnumElement102.EnumElement103";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("EnumElement103", modelElement.getName().getValue());
	}
	
	@Test
	public void attributeEnumElement() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef85.AttributeDef85.EnumEleA_en";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("EnumEleA_en", modelElement.getName().getValue());
	}

	@Test
	public void attributeEnumSubElement() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef85.AttributeDef85.EnumEleA_en.EnumEleA1_en";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("EnumEleA1_en", modelElement.getName().getValue());
	}
	
	@Test
	public void classTest() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef117";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("ClassDef117", modelElement.getName().getValue());
	}

	@Test
	public void constraint() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef117.ConstraintA";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("ConstraintA", modelElement.getName().getValue());
	}

	@Test
	public void attribute() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.ClassDef85.AttributeDef94";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("AttributeDef94", modelElement.getName().getValue());
	}

	@Test
	public void view() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.ViewDef88";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("ViewDef88", modelElement.getName().getValue());
	}

	@Test
	public void structure() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.StructA";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals("StructA", modelElement.getName().getValue());
	}

	@Test
	public void viewNotFound() throws Exception {
		// Read UML File
		PersistenceService originalService = new PersistenceService();
		Model model = originalService.readFile(umlFile);

		String scopedName = "ModelDef4.TopicDef5.ViewDef88NotFound";
		ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model, scopedName);

		assertEquals(null, modelElement);
	}
}
