package ch.ehi.umleditor.translationxml;

import java.io.File;
import java.util.Map;

import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.modelmanagement.Model;
import ch.interlis.ili2c.generator.nls.Ili2TranslationXml;
import ch.interlis.ili2c.generator.nls.ModelElements;
import ch.interlis.ili2c.generator.nls.TranslationElement;

public class TransferFromXml {

    /**
     * It translated the Model according to XML File.
     * 
     * @param model
     *            Model to be translated
     * @param xmlfile
     *            source File
     * @return translated Model
     * @throws Exception
     *             exception
     */
    public void merge(Model model, File xmlfile) throws Exception {
        ModelElements translationElements = Ili2TranslationXml.readModelElementsXml(xmlfile);
        for (TranslationElement translationElement : translationElements) {
            ModelElement modelElement = ModelElementUtility.findIliModelElementByScopedName(model,
                    translationElement.getScopedName());
            if (modelElement != null) {
                mergeTranslationElementToModelElement(modelElement, translationElement);
            }
        }

    }

    /**
     * it merge Translation Element to Model Element
     * 
     * @param modelElement
     *            The Element to Chance
     * @param translationElement
     *            Import Translation XML
     */
    private void mergeTranslationElementToModelElement(ModelElement modelElement,
            TranslationElement translationElement) {

        // Set Name
        if (modelElement.getName() != null) {
            Map name = modelElement.getName().getAllValues();

            if (translationElement.getName_de() != null) {
                if (!translationElement.getName_de().isEmpty()
                        && (translationElement.getName_de() != null && translationElement.getName_de() != "")) {
                    if (!translationElement.getName_de().equals(name.get(Ili2TranslationXml.DE))) {
                        modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(),
                                Ili2TranslationXml.DE, translationElement.getName_de()));
                    }
                }
            }

            if (translationElement.getName_en() != null) {
                if (!translationElement.getName_en().isEmpty()
                        && (translationElement.getName_en() != null && translationElement.getName_en() != "")) {
                    if (!translationElement.getName_en().equals(name.get(Ili2TranslationXml.EN))) {
                        modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(),
                                Ili2TranslationXml.EN, translationElement.getName_en()));

                    }
                }
            }

            if (translationElement.getName_fr() != null) {
                if (!translationElement.getName_fr().isEmpty()
                        && (translationElement.getName_fr() != null && translationElement.getName_fr() != "")) {
                    if (!translationElement.getName_fr().equals(name.get(Ili2TranslationXml.FR))) {
                        modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(),
                                Ili2TranslationXml.FR, translationElement.getName_fr()));
                    }
                }
            }

            if (translationElement.getName_it() != null) {
                if (!translationElement.getName_it().isEmpty()
                        && (translationElement.getName_it() != null && translationElement.getName_it() != "")) {
                    if (!translationElement.getName_it().equals(name.get(Ili2TranslationXml.IT))) {
                        modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(),
                                Ili2TranslationXml.IT, translationElement.getName_it()));
                    }
                }
            }
        }

        // Set Documentation
        if (modelElement.getDocumentation() != null) {
            Map documentation = modelElement.getDocumentation().getAllValues();

            if (translationElement.getDocumentation_de() != null) {
                if (!translationElement.getDocumentation_de().isEmpty()
                        && (translationElement.getDocumentation_de() != null
                                && translationElement.getDocumentation_de() != "")) {
                    if (!translationElement.getDocumentation_de().equals(documentation.get(Ili2TranslationXml.DE))) {
                        modelElement.setDocumentation(new ch.ehi.basics.types.NlsString(modelElement.getDocumentation(),
                                Ili2TranslationXml.DE, translationElement.getDocumentation_de()));
                    }
                }
            }

            if (translationElement.getDocumentation_en() != null) {
                if (!translationElement.getDocumentation_en().isEmpty()
                        && (translationElement.getDocumentation_en() != null
                                && translationElement.getDocumentation_en() != "")) {
                    if (!translationElement.getDocumentation_en().equals(documentation.get(Ili2TranslationXml.EN))) {
                        modelElement.setDocumentation(new ch.ehi.basics.types.NlsString(modelElement.getDocumentation(),
                                Ili2TranslationXml.EN, translationElement.getDocumentation_en()));
                    }
                }
            }
            if (translationElement.getDocumentation_fr() != null) {
                if (!translationElement.getDocumentation_fr().isEmpty()
                        && (translationElement.getDocumentation_fr() != null
                                && translationElement.getDocumentation_fr() != "")) {
                    if (!translationElement.getDocumentation_fr().equals(documentation.get(Ili2TranslationXml.FR))) {
                        modelElement.setDocumentation(new ch.ehi.basics.types.NlsString(modelElement.getDocumentation(),
                                Ili2TranslationXml.FR, translationElement.getDocumentation_fr()));
                    }
                }
            }

            if (translationElement.getDocumentation_it() != null) {
                if (!translationElement.getDocumentation_it().isEmpty()
                        && (translationElement.getDocumentation_it() != null
                                && translationElement.getDocumentation_it() != "")) {
                    if (!translationElement.getDocumentation_it().equals(documentation.get(Ili2TranslationXml.IT))) {
                        modelElement.setDocumentation(new ch.ehi.basics.types.NlsString(modelElement.getDocumentation(),
                                Ili2TranslationXml.IT, translationElement.getDocumentation_it()));
                    }
                }
            }
        }
    }
}
