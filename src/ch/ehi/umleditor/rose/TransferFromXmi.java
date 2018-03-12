package ch.ehi.umleditor.rose;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.domainsandconstants.DomainDef;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.interlis.modeltopicclass.TopicDef;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.uml1_4.implementation.UmlPackage;
import ch.ehi.umleditor.application.IliBaseTypeKind;
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.application.NavigationView;

import ch.ehi.interlis.domainsandconstants.Type;
import ch.ehi.interlis.domainsandconstants.basetypes.EnumElement;
import ch.ehi.interlis.domainsandconstants.basetypes.Enumeration;

public class TransferFromXmi {
	public UmlPackage umlPackage = null;
	public INTERLIS2Def interlis = null;
	public ModelDef modelo = null;
	public TopicDef topic = null;
	public DomainDef dominio = null;
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
		                    		 // Creating DomainDef - enumeration type
		                    		 if(type.getNodeValue().equals("uml:Enumeration") &&
		                    				 attr.getNamedItem("xmi:id").getNodeValue().startsWith(modelo.getName().getValue())) {
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