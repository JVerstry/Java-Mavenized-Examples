
package com.jverstry.annotations;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBAnnotationDemo {

	public static void createXML(Object o) throws JAXBException {
		
		// Creating a Marshaller
		JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		StringWriter result = new StringWriter();
		jaxbMarshaller.marshal(o, result);

		// Printing XML
		String xml = result.toString();
		System.out.println(xml);
		
	}
	
}
