
package com.jverstry.Security.Symmetric.Encryption;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.paddings.PKCS7Padding;

public class SymmetricEncryption {

	public static void main(String[] args)
			throws NoSuchAlgorithmException, UnsupportedEncodingException,
			DataLengthException, InvalidCipherTextException {
		
		KeyGenerator kg = KeyGenerator.getInstance("AES");
		kg.init(256);
		SecretKey sk = kg.generateKey();
		
		AESBouncyCastle abc = new AESBouncyCastle();
		abc.setPadding(new PKCS7Padding());
		abc.setKey(sk.getEncoded());
		
		String secret = "This is a secret message!";
		System.out.println(secret);
		byte[] ba = secret.getBytes("UTF-8");
		
		byte[] encr = abc.encrypt(ba);
		System.out.println("Encrypted : "
				+ Hex.encodeHexString(encr));
		byte[] retr = abc.decrypt(encr);
		
		if ( retr.length == ba.length ) {
			ba = retr;
		} else {
			System.arraycopy(retr, 0, ba, 0, ba.length);
		}
		
		String decrypted = new String(ba, "UTF-8");
		System.out.println(decrypted);
		
	}
	
}
