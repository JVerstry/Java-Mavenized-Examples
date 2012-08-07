
package com.jverstry.annotations.generics;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class GenericsExample {
	
	public static void main(String[] args) throws JAXBException {
		
		simpleExample();
		genericListExample();
		interfaceExample();
		
	}
	
	public static void simpleExample() throws JAXBException {

		List<String> l = new ArrayList<String>();
		l.add("Soemwhere");
		l.add("This and that");
		l.add("Something");
		
		// Object with list
		ObjectWithList owl = new ObjectWithList();
		
		owl.setList(l);
		
		JAXBContext jc = JAXBContext.newInstance(ObjectWithList.class);
		ObjectWithList retr = marshallUnmarshall(owl, jc);
		
		for (String s : retr.getList()) {
			System.out.println(s);
		} System.out.println(" ");

	}
	
	public static void interfaceExample() throws JAXBException {

		List<Vehicle> l = new ArrayList<Vehicle>();
		l.add(new Bus("Large bus"));
		l.add(new Bus("Small bus"));
		l.add(new Car("Ferrari"));
		
		// Object with generic list
		ObjectWithListOfVehicles owgl
			= new ObjectWithListOfVehicles();
		owgl.setList(l);
		
		JAXBContext jc = JAXBContext.newInstance(
			Bus.class, Car.class,
			ObjectWithListOfVehicles.class);
		
		ObjectWithListOfVehicles retr
			= marshallUnmarshall(owgl, jc);
		
		for (Vehicle s : retr.getList()) {
			System.out.println(
				s.getClass().getSimpleName() + " - " + s.getType());
		} System.out.println(" ");

	}

	public static void genericListExample() throws JAXBException {

		List<Car> l = new ArrayList<Car>();
		l.add(new Car("red car"));
		l.add(new Car("blue car"));
		l.add(new Car("green car"));
		
		// Object with generic list
		ObjectWithGenericList<Car> owgl = new ObjectWithGenericList<Car>();
		owgl.setList(l);
		
		JAXBContext jc = JAXBContext.newInstance(
			ObjectWithGenericList.class, Car.class);
		ObjectWithGenericList<Car> retr = marshallUnmarshall(owgl, jc);
		
		for (Car s : retr.getList()) {
			System.out.println(
				s.getClass().getSimpleName() + " - " + s.getType());
		} System.out.println(" ");

	}
	
	public static <O> O marshallUnmarshall(O o, JAXBContext jc) throws JAXBException {
		
		// Creating a Marshaller
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
