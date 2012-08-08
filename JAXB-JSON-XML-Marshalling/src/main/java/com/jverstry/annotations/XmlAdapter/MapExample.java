
package com.jverstry.annotations.XmlAdapter;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MapExample {
	
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(
			ObjectWithGenericMap.class,
			Destination.class, Transport.class);
		
		ObjectWithGenericMap<Destination,Transport> owgm
			= new ObjectWithGenericMap<Destination,Transport>();

		Map<Destination,Transport> map
			= new HashMap<Destination,Transport>();
		owgm.setMap(map);
		
		Destination d = new Destination();
		d.setDestination("Paris");
		
		Transport t = new Transport();
		t.setTransport("Plane");
		
		map.put(d,t);
		
		d = new Destination();
		d.setDestination("New-York");
		
		t = new Transport();
		t.setTransport("Boat");
		
		map.put(d,t);
		
		ObjectWithGenericMap<Destination,Transport> retr
			= marshallingUnmarshalling(jaxbContext, owgm);
		
		for (Entry<Destination, Transport> e : retr.getMap().entrySet() ){
			Destination retrd = e.getKey();
			System.out.print(retrd.getDestination());
			Transport retrt = e.getValue();
			System.out.println(" " + retrt.getTransport());
		}
		
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
