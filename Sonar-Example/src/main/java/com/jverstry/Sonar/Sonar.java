
package com.jverstry.Sonar;

import java.io.IOException;

public class Sonar {
	
	public static class A {
		public void print() {
			System.out.println("Hello Word !");
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		printMessage(null);
		
	}
	
	public static void printMessage(A a) {
		
		// Not testing for nullity
		a.print();
		
	}

}
