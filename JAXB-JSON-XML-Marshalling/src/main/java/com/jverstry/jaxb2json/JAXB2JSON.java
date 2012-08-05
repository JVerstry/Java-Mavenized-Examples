
package com.jverstry.jaxb2json;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import java.io.IOException;

public class JAXB2JSON {
	
	public static void main(String[] args) throws IOException {
		
		Recipe recipe = new Recipe();
		recipe.setDuration(30);
		recipe.setTitle("Chicken recipe");
		
		ObjectMapper mapper = new ObjectMapper();
		
		AnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
		mapper.setAnnotationIntrospector(introspector);
		
		// Printing JSON
		String result = mapper.writeValueAsString(recipe);
 
		System.out.println(result);
		
		// Parsing JSON
		Recipe retr = mapper.readValue(result, Recipe.class);
		
		System.out.println("Title   : " + retr.getTitle());
		System.out.println("Duration: " + retr.getDuration());
		
	}
	
}
