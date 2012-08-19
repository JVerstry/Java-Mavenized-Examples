
package com.jverstry.Security.Symmetric;

import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.codec.binary.Hex;

public class SymmetricKey {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		KeyGenerator kg = KeyGenerator.getInstance("AES");
		SecretKey sk;

		kg.init(128);
		sk = kg.generateKey();
		System.out.print("AES 128 - ");
		System.out.println(Hex.encodeHex(sk.getEncoded()));

		kg.init(192);
		sk = kg.generateKey();
		System.out.print("AES 192 - ");
		System.out.println(Hex.encodeHex(sk.getEncoded()));

		kg.init(256);
		sk = kg.generateKey();
		System.out.print("AES 256 - ");
		System.out.println(Hex.encodeHex(sk.getEncoded()));
		
	}
	
}
