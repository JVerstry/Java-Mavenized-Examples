
package com.jverstry.annotations.XmlSeeAlso;

import com.jverstry.annotations.JAXBAnnotationDemo;
import javax.xml.bind.JAXBException;

public class XmlSeeAlsoExample {
	
	public static void main(String[] args) throws JAXBException {
	
		Document document = new Document();
		document.setContent("My content");
		
		Image image = new Image();
		image.setName("My image");
		
		Folder folder = new Folder();
		folder.setDocument(document);
		folder.setImage(image);
		
		JAXBAnnotationDemo.createXML(folder);
		
//		B b = new B();
//		b.setB1(28);
//		
//		JAXBAnnotationDemo.createXML(b);
//		
//		InheritsB inheritsB = new InheritsB();
//		inheritsB.setB1(33);
//		inheritsB.setB2(66);
//		
//		JAXBAnnotationDemo.createXML(inheritsB);
		
	}
	
}
