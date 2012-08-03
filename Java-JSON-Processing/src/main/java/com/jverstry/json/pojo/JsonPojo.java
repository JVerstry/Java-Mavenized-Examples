
package com.jverstry.json.pojo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;

public class JsonPojo {
	
	public static void main(String[] args) throws IOException {
		
		PojoItem pi = new PojoItem();
		pi.setId(123466);
		pi.setTitle("My Title");
		pi.setReferences(new ArrayList<String>() { {
            add("Reference A"); add("Reference B");
		} });

		// Printing JSON
		ObjectMapper om = new ObjectMapper();
		String result = om.writeValueAsString(pi);
 
		System.out.println(result);
		
		// Parsing JSON
		PojoItem user = om.readValue(result, PojoItem.class);
		
		System.out.println("id " + user.getId());
		System.out.println("title " + user.getTitle());
		System.out.print("references ");
		for (String s : user.getReferences()) {
			System.out.print(s + " ");
		}
		System.out.println(" ");
		
	}
	
}
