package ch.ehi.umleditor.rose;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ch.ehi.basics.types.NlsString;
import ch.ehi.interlis.modeltopicclass.ClassDef;
import ch.ehi.interlis.modeltopicclass.INTERLIS2Def;
import ch.ehi.interlis.modeltopicclass.ModelDef;
import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.application.NavigationView;

public class TransferFromXmi {
	public INTERLIS2Def interlis = null;
	public ModelDef modelo = null;
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
            
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            String version = doc.getDocumentElement().getAttribute("xmi:version") ;
            if(version.equals("2.1")) {
            	 NodeList l = doc.getElementsByTagName("packagedElement");
	        	 LauncherView launcherview = LauncherView.getInstance();
	        	 NavigationView navigator = launcherview.getIvjPnlNavigation();
	        	 Object root = navigator.getTreNavigation().getModel().getRoot();
	        	 
	        	 if(root instanceof UmlModel) {
		        	  UmlModel firstNode = (UmlModel) root;
		        	  System.out.println(firstNode.getName().getValue());
		        	  //firstNode.addOwnedElement(index, ownedElement1);
		        	  for (int j=0; j<l.getLength(); ++j) {
		                     Node prop = l.item(j);
		                     NamedNodeMap attr = prop.getAttributes();
		                     if (null != attr) {
		                    	 Node type = attr.getNamedItem("xmi:type");
		                    	 if(!attr.getNamedItem("xmi:id").getNodeValue().contains("INTERLIS")) {
		                    		 navigator.selectElement(firstNode);
		                    		// attr.getNamedItem("xmi:id").getNodeValue().contains("^[a-zA-Z].*")
		                    		 if(type.getNodeValue().equals("uml:Package")){
		                    			 interlis = new INTERLIS2Def();
		                    			 interlis.setName(new NlsString(attr.getNamedItem("xmi:id").getNodeValue()+".ili"));
			                    		 interlis.setVersion(2.3);
			                    		 interlis.setDocumentation(new NlsString("Extracted from xmi"));
			                    		 firstNode.addOwnedElement(interlis);
			                    		 
			                    		 modelo = new ModelDef();
			                    		 modelo.setName(new NlsString(attr.getNamedItem("xmi:id").getNodeValue()));
			                    		 modelo.setVersion(new NlsString(dateFormat.format(date)));
			                    		 modelo.setIssuerURI(new NlsString("mailto:vmbp@localhost"));
			                    		 modelo.setDocumentation(new NlsString("Extracted from xmi"));
			                    		 interlis.addOwnedElement(modelo);
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
}