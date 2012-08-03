
package com.jverstry.dom;

import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CRUD {
	
	public static void main(String[] args) throws ParserConfigurationException,
			TransformerConfigurationException, TransformerException {
		
		//We need a Document
		DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
		Document doc = docBuilder.newDocument();

		Element root = doc.createElement("MyXML");
		doc.appendChild(root);


		Element sub = doc.createElement("MyNode");
		sub.setAttribute("MyAttribute", "33");
		root.appendChild(sub);

		Text text = doc.createTextNode("Some text for my node");
		sub.appendChild(text);
		
		Element sub2 = doc.createElement("MyNode2");
		sub2.setAttribute("MyAttribute", "45");
		root.appendChild(sub2);
		
		Element subnode = doc.createElement("MySubNode");
		sub2.appendChild(subnode);
		
		printXML(doc);
		
	}
	
	public static void printXML(Document doc) throws TransformerConfigurationException, TransformerException {
		
		TransformerFactory transfac = TransformerFactory.newInstance();
		Transformer trans = transfac.newTransformer();
		trans.setOutputProperty(OutputKeys.INDENT, "yes");

		StringWriter sw = new StringWriter();
		StreamResult sr = new StreamResult(sw);
		
		DOMSource source = new DOMSource(doc);
		trans.transform(source, sr);
		String result = sw.toString();

		System.out.println(result);
		
	}
	
}
