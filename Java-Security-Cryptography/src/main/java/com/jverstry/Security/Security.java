
package com.jverstry.Security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class Security {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		KeyPair kp = generateKeyPair("RSA", 1200);
		
		System.out.println(kp.getPublic());
		System.out.println(kp.getPrivate());
		
	}
	
	public static KeyPair generateKeyPair(String algorithm, int keysize)
			throws NoSuchAlgorithmException {
		
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance(algorithm);
		keyGen.initialize(keysize);
		
		return keyGen.genKeyPair();
	
	}
	
}
