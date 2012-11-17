
package com.jverstry.DateFormatting;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatting {
	
	public static void main(String[] args) {
		
		// Creating locales
		Locale l_de_DE = new Locale("de", "DE");
		Locale l_fr_FR = new Locale("fr", "FR");
		
		// Retrieving date formatters
		DateFormat df_de_DE
		    = DateFormat.getDateInstance(DateFormat.FULL, l_de_DE);
		DateFormat df_fr_FR
		    = DateFormat.getDateInstance(DateFormat.FULL, l_fr_FR);
		
		Date date = new Date();
		
		System.out.println(df_de_DE.format(date));
		System.out.println(df_fr_FR.format(date));
		
	}	
	
}
