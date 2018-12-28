package ch.ehi.umleditor.translationxml;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.Translation;
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
     * @throws Exception
     *             exception
     */
    public void merge(Model model, File xmlfile) throws Exception {

        ModelElements translationElements = Ili2TranslationXml.readModelElementsXml(xmlfile);
        ModelElementUtility modelElementUtility = new ModelElementUtility();
        for (TranslationElement translationElement : translationElements) {
            ModelElement modelElement = modelElementUtility.findIliModelElementByScopedName(model,
                    translationElement.getScopedName());
            if (modelElement != null) {
                mergeTranslationElementToModelElement(modelElement, translationElement);
            }else {
                EhiLogger.logAdaption("Model element "+translationElement.getScopedName()+" not found");
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
        java.util.Set<String> seenLanguages=new java.util.HashSet<String>();

        // Set Name
        if (modelElement.getName() != null) {
            Map name = modelElement.getName().getAllValues();

            if (translationElement.getName_de() != null && !translationElement.getName_de().isEmpty()) {
                if (!translationElement.getName_de().equals(name.get(Ili2TranslationXml.DE))) {
                    modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(),
                            Ili2TranslationXml.DE, translationElement.getName_de()));
                    seenLanguages.add(Ili2TranslationXml.DE);
                }
            }

            if (translationElement.getName_en() != null && !translationElement.getName_en().isEmpty()) {
                if (!translationElement.getName_en().equals(name.get(Ili2TranslationXml.EN))) {
                    modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(),
                            Ili2TranslationXml.EN, translationElement.getName_en()));
                    seenLanguages.add(Ili2TranslationXml.EN);
                }
            }

            if (translationElement.getName_fr() != null && !translationElement.getName_fr().isEmpty()) {
                if (!translationElement.getName_fr().equals(name.get(Ili2TranslationXml.FR))) {
                    modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(),
                            Ili2TranslationXml.FR, translationElement.getName_fr()));
                    seenLanguages.add(Ili2TranslationXml.FR);
                }
            }

            if (translationElement.getName_it() != null && !translationElement.getName_it().isEmpty()) {
                if (!translationElement.getName_it().equals(name.get(Ili2TranslationXml.IT))) {
                    modelElement.setName(new ch.ehi.basics.types.NlsString(modelElement.getName(),
                            Ili2TranslationXml.IT, translationElement.getName_it()));
                    seenLanguages.add(Ili2TranslationXml.IT);
                }
            }
            if(modelElement instanceof ModelDef && seenLanguages.size()>0) {
                ModelDef model=(ModelDef)modelElement;
                String baseLang=model.getBaseLanguage();
                
                // remove existing defined language translations from set of new languages
                seenLanguages.remove(baseLang);
                Iterator<Translation> langIt=model.iteratorTranslation();
                while(langIt.hasNext()) {
                    Translation lang=langIt.next();
                    seenLanguages.remove(lang.getLanguage());
                }
                
                // add new seen languages as translations
                for(String lang:seenLanguages) {
                    Translation trans=new Translation();
                    trans.setBaseLanguage(baseLang);
                    trans.setLanguage(lang);
                    model.addTranslation(trans);
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
        } else {
            if (translationElement.getDocumentation_de() != null) {
                if (!translationElement.getDocumentation_de().isEmpty()
                        && (translationElement.getDocumentation_de() != null
                                && translationElement.getDocumentation_de() != "")) {
                    modelElement.setDocumentation(new ch.ehi.basics.types.NlsString(Ili2TranslationXml.DE,
                            translationElement.getDocumentation_de()));
                }
            }

            if (translationElement.getDocumentation_en() != null) {
                if (!translationElement.getDocumentation_en().isEmpty()
                        && (translationElement.getDocumentation_en() != null
                                && translationElement.getDocumentation_en() != "")) {
                    modelElement.setDocumentation(new ch.ehi.basics.types.NlsString(Ili2TranslationXml.EN,
                            translationElement.getDocumentation_en()));
                }
            }
            if (translationElement.getDocumentation_fr() != null) {
                if (!translationElement.getDocumentation_fr().isEmpty()
                        && (translationElement.getDocumentation_fr() != null
                                && translationElement.getDocumentation_fr() != "")) {
                    modelElement.setDocumentation(new ch.ehi.basics.types.NlsString(Ili2TranslationXml.FR,
                            translationElement.getDocumentation_fr()));
                }
            }

            if (translationElement.getDocumentation_it() != null) {
                if (!translationElement.getDocumentation_it().isEmpty()
                        && (translationElement.getDocumentation_it() != null
                                && translationElement.getDocumentation_it() != "")) {
                    modelElement.setDocumentation(new ch.ehi.basics.types.NlsString(Ili2TranslationXml.IT,
                            translationElement.getDocumentation_it()));
                }
            }
        }
    }
}
