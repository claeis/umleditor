package ch.ehi.umleditor.rose;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.attributes.AttrType;
import ch.ehi.interlis.attributes.AttributeDef;
import ch.ehi.interlis.attributes.DomainAttribute;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.ClassDefKind;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.interlis.units.UnitDef;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.uml1_4.implementation.UmlPackage;
import ch.ehi.umleditor.application.IliBaseTypeKind;
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.application.NavigationView;
import ch.interlis.ili2c.metamodel.NumericType;
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
import ch.ehi.uml1_4.foundation.core.Feature;
import ch.ehi.interlis.domainsandconstants.linetypes.IndividualSurface;
import ch.ehi.interlis.domainsandconstants.linetypes.Tesselation;

public class TransferFromXmi {
	public UmlPackage umlPackage = null;
	public INTERLIS2Def interlis = null;
	public ModelDef modelo = null;
	public TopicDef topic = null;
	public DomainDef dominio = null;
	public UnitDef unidad = null;
	public ClassDef clase = null;
	public DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	public Date date = new Date();
	public void doXmiFile(String filename) {
		try {
			// Reading xmi file
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File(filename));
            doc.getDocumentElement().normalize();
            
            // Documentation xmi
            String version = doc.getDocumentElement().getAttribute("xmi:version") ;
            Node exporter = doc.getElementsByTagName("xmi:Documentation").item(0).getAttributes().item(0);
            
            // Validating 
            if(version.equals("2.1") && exporter.getNodeValue().equals("ili2c")) {
            	 NodeList l = doc.getElementsByTagName("packagedElement");
	        	 LauncherView launcherview = LauncherView.getInstance();
	        	 NavigationView navigator = launcherview.getIvjPnlNavigation();
	        	 Object root = navigator.getTreNavigation().getModel().getRoot();
	        	 Node nextProp = null;
	        	 NamedNodeMap nextAttr = null;
	        	 Node lastProp = null;
	        	 NamedNodeMap lastAttr = null;
	        	 if(root instanceof UmlModel) {
		        	  UmlModel firstNode = (UmlModel) root;
		        	  System.out.println(firstNode.getName().getValue());
		        	  //firstNode.addOwnedElement(index, ownedElement1);
		        	  for (int j=0; j<l.getLength(); ++j) {
		                     Node prop = l.item(j);
		                     NamedNodeMap attr = prop.getAttributes();
		                     if(j+1<=l.getLength()-1) {
		                    	 nextProp = l.item(j+1);
		                    	 nextAttr = nextProp.getAttributes();
		                     }
		                     
		                     if(j+2<=l.getLength()-2) {
		                    	 lastProp = l.item(j+2);
		                    	 lastAttr = lastProp.getAttributes();
		                     }
		                     if (null != attr) {
		                    	 Node type = attr.getNamedItem("xmi:type");
		                    	 Node nextType = nextAttr.getNamedItem("xmi:id");
		                    	 Node lastType = lastAttr.getNamedItem("xmi:id");
		                    	 if(!attr.getNamedItem("xmi:id").getNodeValue().contains("INTERLIS")) {
		                    		 // Creating UmlPackage imported
		                    		 if(type.getNodeValue().equals("uml:Package") && 
		                    				 (!nextType.getNodeValue().startsWith(attr.getNamedItem("xmi:id").getNodeValue()) && 
		                    						 !lastType.getNodeValue().startsWith(nextAttr.getNamedItem("xmi:id").getNodeValue())
		                    				)
		                    			){
		                    			 umlPackage = new UmlPackage();
		                    			 umlPackage.setName(new NlsString(attr.getNamedItem("name").getNodeValue()));
		                    			 firstNode.addOwnedElement(umlPackage);
		                       		 }
		                    		 // Creating INTERLIS and modelDef, adding to umlPackage created
		                    		 if(type.getNodeValue().equals("uml:Package") && isINTERLIS2Def(attr)){
		                    			 
		                    			 interlis = new INTERLIS2Def();
		                    			 interlis.setName(new NlsString(attr.getNamedItem("name").getNodeValue()+".ili"));
			                    		 interlis.setVersion(2.3);
			                    		 interlis.setDocumentation(new NlsString("Extracted from xmi"));
			                    		 
			                    		 if(umlPackage != null) {
			                    			 umlPackage.addOwnedElement(interlis);
			                    		 } else {
			                    			 firstNode.addOwnedElement(interlis);
			                    		 }
			                    		 
			                    		 modelo = new ModelDef();
			                    		 modelo.setName(new NlsString(attr.getNamedItem("name").getNodeValue()));
			                    		 modelo.setVersion(new NlsString(dateFormat.format(date)));
			                    		 modelo.setIssuerURI(new NlsString("mailto:vmbp@localhost"));
			                    		 modelo.setDocumentation(new NlsString("Extracted from xmi"));
			                    		 interlis.addOwnedElement(modelo);
			                    		 
		                    		 }
		                    		 // Creating DomainDef - enumeration type to ModelDef
		                    		 if(type.getNodeValue().equals("uml:Enumeration") &&
		                    				 attr.getNamedItem("xmi:id").getNodeValue().contains(modelo.getName().getValue()+"."+
		                    		 attr.getNamedItem("name").getNodeValue()) ) {
		                    			 dominio = new DomainDef();
		                    			 dominio.setName(new NlsString(attr.getNamedItem("name").getNodeValue()));
		                    			 Enumeration element = new Enumeration();
		                    			 element.setKind(1);
		                    			 // Get childs of actual packagedElement
		                    			 if(prop instanceof Element) {
		                    				 Element docElement = (Element)prop;
		                    				 NodeList enumElements = docElement.getElementsByTagName("ownedLiteral");
		                    				 for (int e=0; e<enumElements.getLength(); ++e) {
		                    					 Node actualEnumNode = enumElements.item(e);
		            		                     NamedNodeMap attrEnumNode = actualEnumNode.getAttributes();
		            		                     
		            		                     EnumElement actualEnumElement = new EnumElement();
		            		                     actualEnumElement.setName(new NlsString(attrEnumNode.getNamedItem("name").getNodeValue()));
		            		                     element.addEnumElement(actualEnumElement);
		                    				 }
		                    				  
		                    			 }
		                    			Type typeE = (Type)element;
		                    			 dominio.detachType();
		                    			 
		                    			 dominio.attachType(typeE);
		                    			 dominio.setDocumentation(new NlsString("Extracted from xmi"));
		                    			 modelo.addOwnedElement(dominio);
		                    		 }
		                    		 
		                    		 // Creating ClassDef (STRUCTURE type) to ModelDef
		                    		 if(type.getNodeValue().equals("uml:DataType") &&
		                    				 attr.getNamedItem("xmi:id").getNodeValue().contentEquals(modelo.getName().getValue()+"."+
		                    		attr.getNamedItem("name").getNodeValue())){
		                    			 clase = new ClassDef();
		                    			 clase.setName(new NlsString(attr.getNamedItem("name").getNodeValue()));
		                    			 clase.setKind(ClassDefKind.STRUCTURE);
		                    			 DomainAttribute prueba = new DomainAttribute();
		                    			
		                    			 if(prop instanceof Element) {
		                    				 Element docAtributo = (Element) prop;
		                    				 NodeList atributos = docAtributo.getElementsByTagName("ownedAttribute");
		                    				 for(int x=0; x<atributos.getLength(); ++x) {
		                    					 Node actualAtributo = atributos.item(x);
		                    					 NamedNodeMap attrAtributo = actualAtributo.getAttributes();
		                    					 
		                    					 AttributeDef atributo = new AttributeDef();
		                    					 atributo.setName(new NlsString(attrAtributo.getNamedItem("name").getNodeValue()));
		                    					 
		                    					 /*Type typeAt = (Type) findTypeAttribute(attrAtributo.getNamedItem("type").getNodeValue());
		                    					 
		                    					 if(typeAt != null) {
		                    						 prueba.detachDirect();
		                    						 prueba.attachDirect(typeAt);
			                    					 AttrType typeAttr = (AttrType) prueba;
			                    					 atributo.detachAttrType();
			                    					 atributo.attachAttrType(typeAttr);
		                    					 }*/
		                    					 
		                    					 atributo.setDocumentation(new NlsString("Extracted from xmi"));
		                    					 clase.addFeature((Feature) atributo);
		                    				 }
		                    			 }
		                    			 
		                    			 modelo.addOwnedElement(clase);
		                    		 }
		                    		 
		                    		 // Creating UnitDef to ModelDef
		                    		 NodeList units = doc.getElementsByTagName("ili:UnitDef");
		                    		 if(type.getNodeValue().equals("uml:Class") &&
		                    				 attr.getNamedItem("xmi:id").getNodeValue().contentEquals(modelo.getName().getValue()+"."+
		                    		attr.getNamedItem("name").getNodeValue()) &&
		                    				 isUnitDef(attr, units)){
		                    			 unidad = new UnitDef();
		                    			 unidad.setName(new NlsString(attr.getNamedItem("name").getNodeValue()));
		                    			 unidad.setDocumentation(new NlsString("Extracted from xmi"));
		                    			 modelo.addOwnedElement(unidad);
		                    		 }
		                    		 
		                    		// Creating ClassDef to ModelDef
		                    		 if(type.getNodeValue().equals("uml:Class") &&
		                    				 attr.getNamedItem("xmi:id").getNodeValue().contentEquals(modelo.getName().getValue()+"."+
		                    		attr.getNamedItem("name").getNodeValue()) &&
		                    				 !isUnitDef(attr, units)){
		                    			 clase = new ClassDef();
		                    			 clase.setKind(ClassDefKind.CLASS);
		                    			 clase.setAbstract(true);
		                    			 clase.setName(new NlsString(attr.getNamedItem("name").getNodeValue()));
		                    			 clase.setDocumentation(new NlsString("Extracted from xmi"));
		                    			 DomainAttribute prueba = new DomainAttribute();
		                    			 Enumeration elemento = new Enumeration();
		                    			 if(prop instanceof Element) {
		                    				 Element docAtributo = (Element) prop;
		                    				 NodeList atributos = docAtributo.getElementsByTagName("ownedAttribute");
		                    				 for(int x=0; x<atributos.getLength(); ++x) {
		                    					 Node actualAtributo = atributos.item(x);
		                    					 NamedNodeMap attrAtributo = actualAtributo.getAttributes();
		                    					 
		                    					 findTypeAttribute(attrAtributo.getNamedItem("type").getNodeValue());
		                    					 AttributeDef atributo = new AttributeDef();
		                    					 atributo.setName(new NlsString(attrAtributo.getNamedItem("name").getNodeValue()));
		                    					 /*elemento.addEnumElement(enumElement1);
		                    					 Type typeAt = (Type) elemento;
		                    					 prueba.attachDirect(typeAt);
		                    					 AttrType typeAttr = (AttrType) prueba;
		                    					 atributo.detachAttrType();
		                    					 atributo.attachAttrType(typeAttr);
		                    					 */
		                    					atributo.setDocumentation(new NlsString("Extracted from xmi"));
		                    					 clase.addFeature((Feature) atributo);
		                    				 }
		                    			 }
		                    			 modelo.addOwnedElement(clase);
		                    		 }
		                    		 
		                    		 // Creating TopicDef
		                    		 if(type.getNodeValue().equals("uml:Package") &&
		                    				 nextType.getNodeValue().startsWith(attr.getNamedItem("xmi:id").getNodeValue()) &&
		                    				 isTopicDef(attr) 
		                    				) {
		                    			 topic = new TopicDef();
		                    			 topic.setName(new NlsString(attr.getNamedItem("name").getNodeValue()));
		                    			 modelo.addOwnedElement(topic);
		                    		 }
		                    		 
		                    	 }
		                         Node p = attr.getNamedItem("xmi:id");
		                         System.out.println("leyendo ... "+p.getNodeValue());
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
    	String idTextType="C16095C6-1D80-49ab-9A0B-5847A355489B"; // Verschiedene Arten von Text
    	String idEnumerationType="279A049B-2BCC-4fb5-9C8F-3B22EF3EE0ED"; // Verschiedene Arten von Aufzaehlungen
    	String idEnumTreeValueType="064231DE-6F7D-43bb-A0B9-B4C37906E012"; // Weitere Art von Aufzaehlung
    	String idAlignmentType="B5F4B6BC-41B7-400b-84DF-64474E7B3F07"; // Vordefinierte Aufzaehlung (fuer ili1-Kompatibilitaet)
    	String idBooleanType="D2A6D48C-97F0-44d0-910A-7C55943BECA7"; // Vordefinierte Aufzaehlung (True/False)
    	String idNumericType="39FDCDA0-DAE3-4c14-B2DC-C4F0F4DAAAF8"; // Ganze Zahlen, Fliesskommazahlen, Festkommazahlen (inkl. min/max, Masseinheit)
    	String idFormattedType="36B2DF93-856E-4997-B610-61C456A6BD1B"; // Anwenderdefinierbare serialisierte Datentypen
    	String idTimeType="FBAA3B46-D164-4ecf-96C5-31D69315FDDF"; // Zeit inkl. min/max
    	String idDateType="259523F4-AAC6-4fe2-8B34-B9113604AB8C"; // Datum inkl. min/max
    	String idDateTimeType="5904195D-E562-4262-9F6B-7104FA1AB70D"; // Datum + Zeit inkl. min/max
    	String idOIDType="19ACF3BB-5A8B-4b73-9C38-D37C3DC8B207"; // Anwenderdefinierbare Arten von Objekt-Identifikatoren
    	String idBlackboxType="93ADB54A-B82F-421c-8C50-8881FFD61F42"; // Beliebige XML-Fragmente oder binaere Objekte
    	String idClassType="F1B17749-EACA-4ed1-A9EC-40B63C2A94B0"; // Klassenname (primaer fuer Metamodelle relevant)
    	String idAttributePathType="5AD53796-0781-4f5d-AEFA-B11FD46DD5AB"; // Attributname (primaer fuer Metamodelle relevant)
    	String idCoordinateType="45397FCA-66E2-4ac8-A8A7-89D3A573E44B"; // Koordinate (mit verschiedenen Konsistenzbedingungen)
    	String idPolylineType="F466480C-C0A2-47de-A0FC-D9D3932DB96E"; // Linie (mit verschiedenen Konsistenzbedingungen)
    	String idSurfaceType="D874C9DB-F082-4bd4-B4F1-DACD75BBFDD6"; // Einzelflaeche (mit verschiedenen Konsistenzbedingungen)
    	String idAreaType="E06837E3-F58C-49bb-8F82-22F666FB4CCF"; // Flaechennetz (= Einzelflaeche + vordefinierte Konsistenzbedingung)
    	
    	if(nodeValue.equals(idBooleanType)) {
    		BooleanType bool = new BooleanType();
    		return bool;
    	}
    	if(nodeValue.equals(idTextType)) {
    		Text texto = new Text();
    		return texto;
    	}
    	if(nodeValue.equals(idEnumerationType)) {
    		Enumeration enumas= new Enumeration();
    		return enumas;
    	}
    	if(nodeValue.equals(idNumericType)) {
    		ch.ehi.interlis.domainsandconstants.basetypes.NumericalType numret = new NumericalType() {
			};
    		//NumericType num = new NumericType();
    	
    		return numret;
    	}
    	if(nodeValue.equals(idCoordinateType)) {
    		CoordinateType coor = new CoordinateType();
    		return coor;
    	}
    	if(nodeValue.equals(idPolylineType)) {
    		IliPolyline poli = new IliPolyline();
    		return poli;
    	}
    	if(nodeValue.equals(idSurfaceType)){
    		IndividualSurface surf = new IndividualSurface();
    		return surf;
    	}
    	if(nodeValue.equals(idAreaType)) {
    		Tesselation area = new Tesselation();
    		return area;
    	}
    	if(nodeValue.equals(idDateType)) {
    		DateType date = new DateType();
    		return date;
    	}
    	if(nodeValue.equals(idDateTimeType)) {
    		DateTimeType dateTime = new DateTimeType();
    		return dateTime;
    	}
    	if(nodeValue.equals(idTimeType)) {
    		TimeType time = new TimeType();
    		return time;
    	}
    	if(nodeValue.equals(idOIDType)) {
    		OidType oid = new OidType();
    		return oid;
    	}
    	if(nodeValue.equals(idClassType)) {
    		ClassType clas = new ClassType();
    		return clas;
    	}
    	if(nodeValue.equals(idAlignmentType)) { // Assign Horizontal by default
    		HorizAlignment hor = new HorizAlignment();
    		return hor;
    	}
    	return null;
	}
	private boolean isUnitDef(NamedNodeMap attr, NodeList units) {
		String idClass = attr.getNamedItem("xmi:id").getNodeValue();
		  for (int j=0; j<units.getLength(); ++j) {
			  Node propUnit = units.item(j);
              NamedNodeMap attrUnit = propUnit.getAttributes();
			  if(attrUnit.getNamedItem("base_Class").getNodeValue().equals(idClass)) {
				  return true;
			  }
		  }
		return false;
	}
	private boolean isTopicDef(NamedNodeMap attr) {
		String id = attr.getNamedItem("xmi:id").getNodeValue();
		String [] elements = id.split("[.]");
		if(elements.length == 2) {
			return true;
		}
		return false;
	}
	private static boolean isNumeric(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }
	private boolean isINTERLIS2Def(NamedNodeMap attr) {
		String id = attr.getNamedItem("xmi:id").getNodeValue();
		if(id.contains(".") || isNumeric(id)) {
			return false;
		}
		return true;
	}
	
}