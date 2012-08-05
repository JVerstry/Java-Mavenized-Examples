
package com.jverstry.crud;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOM {
	
	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		InputStream IS = DOM.class.getResourceAsStream("/rates.xml");
		Document doc = builder.parse(IS);
		
		// Retrieving cube XML nodes
		NodeList list = doc.getElementsByTagName("Cube");
		
		for (int i = 0; i < list.getLength(); i++) {
			
			Element element = (Element) list.item(i);
			
			// Retrieving attributes
			NamedNodeMap attr = element.getAttributes();
			for (int j=0;j<attr.getLength();j++) {
				System.out.print(attr.item(j).getTextContent() + " ");
			}
			
			System.out.println("");
				
		}
		
	}
	
}
