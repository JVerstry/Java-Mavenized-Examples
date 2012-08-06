
package com.jverstry.annotations.XmlType;

import com.jverstry.annotations.JAXBAnnotationDemo;
import javax.xml.bind.JAXBException;

public class XmlTypeExample {
	
	public static void main(String[] args) throws JAXBException {
		
		Order o = new Order();
		o.setA1(28);
		o.setA2(99);
		
		JAXBAnnotationDemo.createXML(o);
		
	}
	
}
