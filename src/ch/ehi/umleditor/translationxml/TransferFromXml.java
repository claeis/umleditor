package ch.ehi.umleditor.translationxml;

import java.io.File;
import java.util.Map;

import ch.ehi.basics.types.NlsString;
import ch.ehi.uml1_4.foundation.core.ModelElement;
import ch.ehi.uml1_4.modelmanagement.Model;
import ch.interlis.ili2c.generator.nls.Ili2TranslationXml;
import ch.interlis.ili2c.generator.nls.ModelElements;
import ch.interlis.ili2c.generator.nls.TranslationElement;

public class TransferFromXml {

	public Model merge(Model model, File xmlfile) {
//		ModelElements trslEles=Ili2TranslationXml.readModelElementsXml(xmlfile);
//		for(TranslationElement trslEle : trslEles) {
//			// find ModelElement with trslEle.getScopedName()
//			findIliModelElementByScopedName(model, trslEle.getScopedName());
//			ModelElement ele=null;
//			// set name and documentation in not yet available language
//			NlsString name=ele.getName();
//			Map names = name.getAllValues();
//			if(!names.containsKey(Ili2TranslationXml.DE)) {
//				names.put(Ili2TranslationXml.DE, trslEle.getName_de());
//			}
//		}
		
		return null;
	}
	private ModelElement findIliModelElementByScopedName(Model model,String iliScopedName) {
		return null;
	}
}
