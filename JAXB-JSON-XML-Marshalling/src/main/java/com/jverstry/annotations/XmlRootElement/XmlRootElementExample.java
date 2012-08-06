
package com.jverstry.annotations.XmlRootElement;

import com.jverstry.annotations.JAXBAnnotationDemo;
import javax.xml.bind.JAXBException;

public class XmlRootElementExample {
	
	public static void main(String[] args) throws JAXBException {
		
		A a = new A();
		a.setA1(28);
		
		JAXBAnnotationDemo.createXML(a);
		
		InheritsA inheritsA = new InheritsA();
		inheritsA.setA1(33);
		inheritsA.setA2(66);
		
		JAXBAnnotationDemo.createXML(inheritsA);		
	}
	
}
