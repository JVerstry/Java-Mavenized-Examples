
package com.jverstry.Pojomatic.CircularReference;

public class CircularReferenceExample {
	
	public static void main(String[] args) {
		
		CircularReference cr1 = new CircularReference();
		cr1.setData("RRR");
		cr1.setCircularReference(cr1);
		
		System.out.println(cr1);
		
	}
	
}
