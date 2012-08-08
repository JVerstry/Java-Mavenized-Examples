
package com.jverstry.annotations.XmlListEnumAttributeValueMimeTypeInlineBinaryData;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MultipleExamples {
	
	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(
			MultipleTypes.class, MyEnum.class);
		
		MultipleTypes mt = new MultipleTypes();
		
		mt.setMyEnum(MyEnum.VAL_2);
		
		byte[] ba = { 1, 2, -3, -4 };
		mt.setByteArray(ba);
		
		List<String> l = new ArrayList<String>();
		l.add("tre");
		l.add("pml");
		l.add("xng");
		mt.setData(l);
		
		List<SpecialItem> lsi = new ArrayList<SpecialItem>();
		
		SpecialItem si = new SpecialItem();
		si.setAttribute1("aaaa");
		si.setAttribute2("ffff");
		si.setVal("pppp");
		lsi.add(si);

		si = new SpecialItem();
		si.setAttribute1("mer");
		si.setAttribute2("pqgd");
		si.setVal("xxw");
		lsi.add(si);
		
		mt.setSpecialItems(lsi);
		
		BufferedImage bi = ImageIO.read(
			MultipleExamples.class.getResourceAsStream("/flag.jpg"));
		mt.setImage(bi);
		
		MultipleTypes retr
			= marshallingUnmarshalling(jaxbContext, mt);
		
		for (SpecialItem rsi : retr.getSpecialItems()) {
			System.out.println(rsi.getVal() + " "
				+ rsi.getAttribute1() + " "
				+ rsi.getAttribute2());
		}
		
		System.out.println(mt.getMyEnum());
		
		for (String s : mt.getData()) {
			System.out.print(s + ", ");
		} System.out.println();

		for (byte b : mt.getByteArray()) {
			System.out.print((int) b + " ");
		} System.out.println();
		
		System.out.println("Image is available: "
			+ ( mt.getImage() != null ));
		
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
