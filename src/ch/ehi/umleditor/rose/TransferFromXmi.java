package ch.ehi.umleditor.rose;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import ch.ehi.uml1_4.implementation.UmlModel;
import ch.ehi.umleditor.application.LauncherView;
import ch.ehi.umleditor.application.NavigationView;

public class TransferFromXmi {
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
            	 System.out.println("necesito aqui a a navigation view");
	        	 LauncherView launcherview = LauncherView.getInstance();
	        	 NavigationView navigator = launcherview.getIvjPnlNavigation();
	        	 Object root = navigator.getTreNavigation().getModel().getRoot();
	        	 
	        	 if(root instanceof UmlModel) {
		        	  UmlModel firstNode = (UmlModel) root;
		        	  System.out.println(firstNode.getName().getValue());
	        	 }
	        	 
                 for (int j=0; j<l.getLength(); ++j) {
                     Node prop = l.item(j);
                     NamedNodeMap attr = prop.getAttributes();
                     if (null != attr) {
                    	 Node type = attr.getNamedItem("xmi:type");
                    	 if(type.getNodeValue() == "uml:Package") {
                    		 
                    	 }
                         Node p = attr.getNamedItem("xmi:id");
                         System.out.println("leyendo ... "+p.getNodeValue());
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