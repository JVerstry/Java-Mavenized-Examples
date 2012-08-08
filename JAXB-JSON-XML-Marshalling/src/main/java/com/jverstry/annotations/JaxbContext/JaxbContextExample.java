
package com.jverstry.annotations.JaxbContext;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbContextExample {
	
	public static void main(String[] args) throws JAXBException {
		
		example1();
		example2();
		
	}

	public static void example1() throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(SomeA.class);
		
		StaticallyReferenced sr = new StaticallyReferenced();
		sr.setData("data1");
		
		StaticallyReferencedButTransient srbt = new StaticallyReferencedButTransient();
		srbt.setData("data2");
		
		SomeA someA = new SomeA();
		someA.setSr(sr);
		someA.setSrbt(srbt);
		
		SomeA retr = marshallingUnmarshalling(jaxbContext, someA);
		
	}
	
	public static void example2() throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(SomeA.class);
		
		StaticallyReferenced sr = new StaticallyReferenced();
		sr.setData("data1");
		
		StaticallyReferencedButTransient srbt = new StaticallyReferencedButTransient();
		srbt.setData("data2");
		
		InheritSomeA inheritSomeA = new InheritSomeA();
		inheritSomeA.setSr(sr);
		inheritSomeA.setSrbt(srbt);
		inheritSomeA.setMoreData("More data 23");
		
		InheritSomeA retr = marshallingUnmarshalling(jaxbContext, inheritSomeA);
		
	}

	public static <O> O marshallingUnmarshalling(JAXBContext jc, O o) throws JAXBException {
		
		Marshaller jaxbMarshaller = jc.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		StringWriter result = new StringWriter();
		jaxbMarshaller.marshal(o, result);

		// Printing XML
		String xml = result.toString();
		System.out.println(xml);
		
		// Creating an Unmarshaller
		Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();
		StringReader sr = new StringReader(xml);
		
		O retr = (O) jaxbUnmarshaller.unmarshal(sr);
		
		return retr;
		
	}
	
}
