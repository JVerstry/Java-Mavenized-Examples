
package com.jverstry.GetInstalledLocales;

import java.util.Locale;

public class GetInstalledLocales {
	
	public static void main(String[] args) {
		
		for ( Locale l : Locale.getAvailableLocales() ) {
			String s = l.getDisplayLanguage(Locale.ENGLISH)
				+ " " + l.getDisplayCountry(Locale.ENGLISH);
			System.out.println(s);
		}
		
	}
	
}
