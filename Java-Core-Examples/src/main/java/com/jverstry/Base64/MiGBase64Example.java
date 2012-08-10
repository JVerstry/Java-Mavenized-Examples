
package com.jverstry.Base64;

public class MiGBase64Example {
	
	public static void main(String[] args) {
		
		String s = "String to encode/decode with Base64";
		
		String coded = MiGBase64.encodeToString(s.getBytes(), true);
		System.out.println("Coded     : " + coded);
		
		String decoded = new String(MiGBase64.decode(coded.getBytes()));
		System.out.println("Retrieved : " + decoded);
		System.out.println("Expected  : " + s);
	
	}
	
}
