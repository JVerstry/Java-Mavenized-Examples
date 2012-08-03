
package com.jverstry.json.stax;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JsonStax {
	
	public static void main(String[] args) throws IOException {
		
		JsonFactory jf = new JsonFactory();

		// Creating in memory representation
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		JsonGenerator jg = jf.createJsonGenerator(
			baos, JsonEncoding.UTF8);
		
		jg.writeStartObject();

			jg.writeNumberField("Id", 123456);
			jg.writeStringField("Title", "My book title");

			jg.writeFieldName("References"); 
		
			jg.writeStartArray();
				jg.writeString("Reference A");
				jg.writeString("Reference B");
			jg.writeEndArray();

		jg.writeEndObject();

		jg.close();
		
		// Printing JSON
		String result = baos.toString("UTF8");
		System.out.println(result);
	
		// Parsing JSON
		JsonParser jp = jf.createJsonParser(result);

		while (jp.nextToken() != JsonToken.END_OBJECT) {

			String token = jp.getCurrentName();

			if ( "Id".equals(token) || "Title".equals(token) ) {
				
				System.out.print(token + " ");
				jp.nextToken();
				System.out.println(jp.getText());
				
			} else if ( "References".equals(token) ) {

				System.out.print(token + " ");
				jp.nextToken(); // JsonToken.START_ARRAY

				while (jp.nextToken() != JsonToken.END_ARRAY) {
					System.out.print(jp.getText() + " "); 
				}
				
				System.out.println("");

			}

		}
		
		jp.close();		
		
	}
	
}
