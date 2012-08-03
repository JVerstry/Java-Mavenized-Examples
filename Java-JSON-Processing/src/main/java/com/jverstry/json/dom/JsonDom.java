
package com.jverstry.json.dom;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Iterator;

public class JsonDom {
	
	public static void main(String[] args) throws IOException {
		
		String json = "{\"Id\":123456," +
			"\"Title\":\"My book title\"," +
			"\"References\":[\"Reference A\",\"Reference B\"]}";

		System.out.println("Source: " + json);

		// Printing JSON with pretty prinet
		ObjectMapper om = new ObjectMapper();
		JsonNode retr = om.readTree(json);
		
		JsonNode id_node = retr.get("Id");
		System.out.println("Id " + id_node.asInt());
		
		JsonNode id_title = retr.get("Title");
		System.out.println("Title " + id_title.asText());
		
		
		JsonNode id_refs = retr.get("References");
		System.out.print("References ");
		
		Iterator<JsonNode> it = id_refs.elements();
		while ( it.hasNext() ) {
			System.out.print(" " + it.next().asText());
		}
		
		System.out.println(" ");
		
	}
	
}
