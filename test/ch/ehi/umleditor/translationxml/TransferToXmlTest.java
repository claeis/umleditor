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

public class TransferToXmlTest {

    File xmlFile = new File("out.xml");
    String umlfile = "testdata/translationxml/TestBV2.uml";

    //Es ueberprueft, ob die MODEL korrekt in das translation xml file geschrieben wurde.
    @Test
    public void model() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA")) {
                    assertEquals("EnumOkA", ele.getName_de());
                    assertEquals("Das ist Dokumentation zum Modell in DE", ele.getDocumentation_de());
                    assertEquals(ElementType.MODEL, ele.getElementType());
                    return;
                }
            }
        }
        fail("MODEL can not be found!");
    }

    //Es ueberprueft, ob die TOPIC korrekt in das translation xml file geschrieben wurde.
    @Test
    public void topic() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA")) {
                    assertEquals("TopicA", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.TOPIC, ele.getElementType());
                    return;
                }
            }
        }
        fail("TOPIC can not be found!");
    }

    //Es ueberprueft, ob die GRAFIK korrekt in das translation xml file geschrieben wurde.
    @Test
    public void graphic() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.GrafikA")) {
                    assertEquals("GrafikA", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.TOPIC, ele.getElementType());
                    return;
                }
            }
        }
        fail("GRAFIK can not be found!");
    }
    
    //Es ueberprueft, ob die LINE FORM korrekt in das translation xml file geschrieben wurde.
    @Test
    public void lineform() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.LineFormA")) {
                    assertEquals("LineFormA", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.LINE_FORM, ele.getElementType());
                    return;
                }
            }
        }
        fail("LINE FORM can not be found!");
    }
    
    //Es ueberprueft, ob die META DATA BASKET korrekt in das translation xml file geschrieben wurde.
    @Test
    public void metaDataBasket() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.BCoordSysA")) {
                    assertEquals("BCoordSysA", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.META_DATA_BASKET, ele.getElementType());
                    return;
                }
            }
        }
        fail("META DATA BASKET can not be found!");
    }
    
    //Es ueberprueft, ob die PARAMETER korrekt in das translation xml file geschrieben wurde.
    @Test
    public void parameter() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.SymbolA.PosA")) {
                    assertEquals("PosA", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.PARAMETER, ele.getElementType());
                    return;
                }
            }
        }
        fail("PARAMETER can not be found!");
    }
    
    //Es ueberprueft, ob die UNIT korrekt in das translation xml file geschrieben wurde.
    @Test
    public void unit() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.m3secA")) {
                    assertEquals("m3secA", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.UNIT, ele.getElementType());
                    return;
                }
            }
        }
        fail("UNIT can not be found!");
    }

    //Es ueberprueft, ob die DOMAIN korrekt in das translation xml file geschrieben wurde.
    @Test
    public void domain() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.Coord2")) {
                    assertEquals("Coord2", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.DOMAIN, ele.getElementType());
                    return;
                }
            }
        }
        fail("DOMAIN can not be found!");
    }

    //Es ueberprueft, ob die KLASSEN korrekt in das translation xml file geschrieben wurde.
    @Test
    public void classTest() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        int numberOfClass = 0;
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.ClassA")) {
                    assertEquals("ClassA", ele.getName_de());
                    assertEquals("Das ist CLASS Dokumentation in DE", ele.getDocumentation_de());
                    assertEquals(ElementType.CLASS, ele.getElementType());
                    numberOfClass++;
                } else if (ele.getScopedName().equals("EnumOkA.TopicA.Dokument")) {
                    assertEquals("Dokument", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.CLASS, ele.getElementType());
                    numberOfClass++;
                }
            }
        }
        assertEquals(2, numberOfClass);
    }

    //Es ueberprueft, ob die VIEW korrekt in das translation xml file geschrieben wurde.
    @Test
    public void view() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.ClassA_V")) {
                    assertEquals("ClassA_V", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.VIEW, ele.getElementType());
                    return;
                }
            }
        }
        fail("VIEW ClassA_V can not be found!");
    }

    //Es ueberprueft, ob die FUNCTION korrekt in das translation xml file geschrieben wurde.
    @Test
    public void function() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.FunctionA")) {
                    assertEquals("FunctionA", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.FUNCTION, ele.getElementType());
                    return;
                }
            }
        }
        fail("FUNCTION can not be found!");
    }

    //Es ueberprueft, ob die ATTRIBUTEN korrekt in das translation xml file geschrieben wurde.
    @Test
    public void attribute() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        int numberOfattr = 0;
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.Klothoide.a")) {
                    assertEquals("a", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.ATTRIBUTE, ele.getElementType());
                    numberOfattr++;
                } else if (ele.getScopedName().equals("EnumOkA.LocalisedUriDE.Text")) {
                    assertEquals("Text", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.ATTRIBUTE, ele.getElementType());
                    numberOfattr++;
                } else if (ele.getScopedName().equals("EnumOkA.TopicA.Dokument.Titel")) {
                    assertEquals("Titel", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.ATTRIBUTE, ele.getElementType());
                    numberOfattr++;
                }
            }
        }
        assertEquals(3, numberOfattr);
    }

    //Es ueberprueft, ob die ENUMERATION ELEMENTEN korrekt in das translation xml file geschrieben wurde.
    @Test
    public void enumElement() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        int numberOfenum = 0;
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.ClassA.attrA.a1")) {
                    assertEquals("a1", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
                    numberOfenum++;
                } else if (ele.getScopedName().equals("EnumOkA.TopicA.ClassA.attrA.a2.a21")) {
                    assertEquals("a21", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.ENUMERATION_ELEMENT, ele.getElementType());
                    numberOfenum++;
                }
            }
        }
        assertEquals(2, numberOfenum);
    }

    //Es ueberprueft, ob die META ATTRIBUTE korrekt in das translation xml file geschrieben wurde.
    @Test
    public void enumElementMetaAttribute() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.ClassA.attrA.a2.METAOBJECT.dispName")) {
                    assertEquals("a 2", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.METAATTRIBUTE, ele.getElementType());
                    return;
                }
            }
        }
        fail("META ATTRIBUTE can not be found!");
    }

    //Es ueberprueft, ob die ASSOCIATION korrekt in das translation xml file geschrieben wurde.
    @Test
    public void associationDef() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.roleA1roleA2")) {
                    assertEquals("roleA1roleA2", ele.getName_de());
                    assertEquals(null, ele.getDocumentation_de());
                    assertEquals(ElementType.ASSOCIATION, ele.getElementType());
                    return;
                }
            }
        }
        fail("ASSOCIATION can not be found!");
    }

    //Es ueberprueft, ob die ROLE korrekt in das translation xml file geschrieben wurde.
    @Test
    public void role() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        int numberOfRole = 0;
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.roleA1roleA2.roleA1")) {
                    assertEquals("roleA1", ele.getName_de());
                    assertEquals(ElementType.ROLE, ele.getElementType());
                    numberOfRole++;
                } else if (ele.getScopedName().equals("EnumOkA.TopicA.roleA1roleA2.roleA2")) {
                    assertEquals("roleA2", ele.getName_de());
                    assertEquals(ElementType.ROLE, ele.getElementType());
                    numberOfRole++;
                }
            }
        }
        assertEquals(2, numberOfRole);
    }
    
    //Es ueberprueft, ob die CONSTRAINT_WITH_EXPLICIT_NAME korrekt in das translation xml file geschrieben wurde.
    @Test
    public void constraintWithExplicitName() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.ClassA.UniqueConstraintA")) {
                    assertEquals("UniqueConstraintA", ele.getName_de());
                    assertEquals(ElementType.CONSTRAINT, ele.getElementType());
                    return;
                } 
            }
        }
        fail("Constraint can not be found!");
    }
    
    //Es ueberprueft, ob die CONSTRAINT_WITHOUT_EXPLICIT_NAME korrekt in das translation xml file geschrieben wurde.
    @Test
    public void constraintWithoutExplicitName() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.TopicA.ClassA.Constraint1")) {
                    assertEquals("Constraint1", ele.getName_de());
                    assertEquals(ElementType.CONSTRAINT, ele.getElementType());
                    return;
                } 
            }
        }
        fail("Constraint can not be found!");
    }

    //Es ueberprueft, ob die STRUCTURE korrekt in das translation xml file geschrieben wurde.
    @Test
    public void structure() throws Exception {
        PersistenceService service = new PersistenceService();
        Model model = service.readFile(umlfile);
        TransferToXml trsf = new TransferToXml();
        ModelElements modelElement = trsf.export(model, xmlFile);
        for (TranslationElement ele : modelElement) {
            if (ele.getScopedName() != null) {
                if (ele.getScopedName().equals("EnumOkA.Klothoide")) {
                    assertEquals("Klothoide", ele.getName_de());
                    assertEquals(ElementType.CLASS, ele.getElementType());
                    return;
                }
            }
        }
        fail("STRUCTURE can not be found!");
    }
}
