
package com.jverstry.stax;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StAX {
	
	public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
		
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		
		InputStream IS = StAX.class.getResourceAsStream("/rates.xml");
		XMLEventReader eventReader = inputFactory.createXMLEventReader(IS);
		
		// Pulling XML elements
		while (eventReader.hasNext()) {
			
			XMLEvent event = eventReader.nextEvent();
			
			if (event.isStartElement()) {
				
				StartElement se = event.asStartElement();					
				
				// Filtering on Cube elements
				if (se.getName().getLocalPart().equals("Cube")) {
					
					Iterator it = se.getAttributes();
					
					while (it.hasNext()) {
						
						Attribute a = (Attribute) it.next();
						System.out.print(a.getValue() + " ");
						
					}
					
					eventReader.nextEvent();
					System.out.println("");
					
					continue;
				}
				
			}
			
		}
		
	}
	
}
