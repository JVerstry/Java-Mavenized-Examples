
package com.jverstry.Security.Random;

import java.security.SecureRandom;

public class RandomInRange {
	
	public static void main(String[] args) {
		
		int min = 122;
		int max = 134;
		
		SecureRandom rnd = new SecureRandom();
		int inclusive = max - min + 1;
		int exclusive = max - min;
		
		int rndIntIncl = rnd.nextInt(inclusive) + min;
		int rndIntExcl = rnd.nextInt(exclusive) + min;
		
		System.out.println("Integer (incl.): " + rndIntIncl);
		System.out.println("Integer (excl.): " + rndIntExcl);
		
		long rndLongIncl = ( rnd.nextLong() % inclusive ) + min;
		long rndLongExcl = ( rnd.nextLong() % exclusive ) + min;
		
		System.out.println("Long    (incl.): " + rndLongIncl);
		System.out.println("Long    (excl.): " + rndLongExcl);

		float rndFloat = ( rnd.nextFloat() * exclusive ) + min;
		
		System.out.println("Float          : " + rndFloat);
			
		double rndDouble = ( rnd.nextDouble() * exclusive ) + min;
		
		System.out.println("Double         : " + rndDouble);
		
	}
	
}
