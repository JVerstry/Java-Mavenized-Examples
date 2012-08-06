
package com.jverstry.annotations.XmlElement;

import com.jverstry.annotations.JAXBAnnotationDemo;
import javax.xml.bind.JAXBException;

public class XmlElementExample {
	
	public static void main(String[] args) throws JAXBException {
		
		FieldAnnotation fa = new FieldAnnotation();
		fa.setA2(28);
		fa.setReq("Some value");
		
		JAXBAnnotationDemo.createXML(fa);

	}
	
}
