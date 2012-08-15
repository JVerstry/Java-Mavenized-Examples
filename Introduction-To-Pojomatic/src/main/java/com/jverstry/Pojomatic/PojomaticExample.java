
package com.jverstry.Pojomatic;

public class PojomaticExample {
	
	public static void main(String[] args) {
		
		Item item = new Item();
		item.setDescription("Blue furniture");
		item.setId(123456);
		item.setTransientData(9999);
		
		System.out.println("equals   : " + item.equals(new Object()));
		System.out.println("hashCode : " + item.hashCode());
		System.out.println("toString : " + item.toString());
		
	}
	
}
