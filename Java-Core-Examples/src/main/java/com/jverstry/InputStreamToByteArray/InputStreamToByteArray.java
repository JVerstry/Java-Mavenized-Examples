
package com.jverstry.InputStreamToByteArray;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.io.IOUtils;

public class InputStreamToByteArray {
	
	public static void main(String[] args) throws IOException {
		
		byte[] ba = { -1, 2, -3, 4, 0, 66 };
		InputStream bais = new ByteArrayInputStream(ba);
		
		byte[] retr = IOUtils.toByteArray(bais);

		System.out.println("Expected  : " + Arrays.toString(ba));
		System.out.println("Retrieved : " + Arrays.toString(retr));
		
	}
	
}
