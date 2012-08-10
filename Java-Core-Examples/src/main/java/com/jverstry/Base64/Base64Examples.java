
package com.jverstry.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64InputStream;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.io.IOUtils;

public class Base64Examples {
	
	public static void main(String[] args) throws IOException {
	
		DataTypeConverterExample();
		StreamExample();
		
	}
	
	public static void DataTypeConverterExample() {

		String s = "String to encode/decode in Base64 with DataTypeConverter";
		
		String coded = DatatypeConverter.printBase64Binary(s.getBytes());
		byte[] retr = DatatypeConverter.parseBase64Binary(coded);
		
		System.out.println("Coded     : " + coded);
		System.out.println("Expected  : " + s);
		System.out.println("Retrieved : " + new String(retr));
		System.out.println();
		
	}
	
	public static void StreamExample() throws IOException {

		String s = "String to encode/decode in Base64 using streams";
		
		ByteArrayOutputStream collect = new ByteArrayOutputStream();
		Base64OutputStream b64os = new Base64OutputStream(collect);
		
		b64os.write(s.getBytes());
		b64os.close();
		
		byte[] ba = collect.toByteArray();
		String coded = new String(ba);

		InputStream is = new ByteArrayInputStream(ba);
		Base64InputStream b64is = new Base64InputStream(is);
		
		byte[] retr = IOUtils.toByteArray(b64is);
		
		System.out.println("Coded     : " + coded);
		System.out.println("Expected  : " + s);
		System.out.println("Retrieved : " + new String(retr));
		
	}

}
