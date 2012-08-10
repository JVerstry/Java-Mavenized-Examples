
package com.jverstry.Digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

public class Digest {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		byte[] ba = { 120, 35, 48, -33, -99, -10 };
		
		System.out.println("MD2     :"
			+ Hex.encodeHexString(digest(ba, "MD2")));
		
		System.out.println("MD5     :"
			+ Hex.encodeHexString(digest(ba, "MD5")));
		
		System.out.println("SHA-1   :"
			+ Hex.encodeHexString(digest(ba, "SHA-1")));
		
		System.out.println("SHA-256 :"
			+ Hex.encodeHexString(digest(ba, "SHA-256")));
		
		System.out.println("SHA-384 :"
			+ Hex.encodeHexString(digest(ba, "SHA-384")));
		
		System.out.println("SHA-512 :"
			+ Hex.encodeHexString(digest(ba, "SHA-512")));
		
	}
	
	public static byte[] digest(byte[] ba, String algorithm)
			throws NoSuchAlgorithmException {
		
		return MessageDigest.getInstance(algorithm).digest(ba);
		
	}
	
}
