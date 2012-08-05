
package com.jverstry.jaxb2xml;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXB2XML {

	public static void main(String[] args) throws JAXBException {

		Book book = new Book();
		book.setTitle("Book title");
		book.setYear(2010);

		// Creating a Marshaller
		JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		StringWriter result = new StringWriter();
		jaxbMarshaller.marshal(book, result);

		// Printing XML
		String xml = result.toString();
		System.out.println(xml);
		
		// Creating an Unmarshaller
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader sr = new StringReader(xml);
		
		Book retr = (Book) jaxbUnmarshaller.unmarshal(sr);
		
		System.out.println("Title: " + retr.getTitle());
		System.out.println("Year : " + retr.getYear());

	}
	
} 
