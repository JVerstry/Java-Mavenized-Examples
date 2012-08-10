
package com.jverstry.ByteArrayToHexadecimal;

import java.util.Arrays;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class ByteArrayToHexadecimal {
	
	public static void main(String[] args) throws DecoderException {
		
		byte[] ba = { 4, 55, -27, 99, 42, 0, -1 };
		
		String toHex = Hex.encodeHexString(ba);
		byte[] retr = Hex.decodeHex(toHex.toCharArray());
		
		System.out.println("Hexadecimal : " + toHex);
		System.out.println("Expected    : " + Arrays.toString(ba));
		System.out.println("Retrieved   : " + Arrays.toString(retr));
		
		ba = new byte[0];
		
		toHex = Hex.encodeHexString(ba);
		retr = Hex.decodeHex(toHex.toCharArray());
		
		System.out.println("Hexadecimal : " + toHex);
		System.out.println("Expected    : " + Arrays.toString(ba));
		System.out.println("Retrieved   : " + Arrays.toString(retr));		
		
	}
	
}
