
package com.jverstry.ResourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {
	
	public static void main(String[] args) {
		
		// Creating locales
		Locale l_de_DE = new Locale("de", "DE");
		Locale l_fr_FR = new Locale("fr", "FR");
		
		// Resource bundles based on property files
		ResourceBundle rb_de_DE
			= ResourceBundle.getBundle(
				"com.jverstry.ResourceBundles.MessagesBundle",
				l_de_DE);
		
		ResourceBundle rb_fr_FR
			= ResourceBundle.getBundle(
				"com.jverstry.ResourceBundles.MessagesBundle",
				l_fr_FR);
		
		// Fetching translated text
		System.out.println(rb_de_DE.getString("inquiry"));
		System.out.println(rb_fr_FR.getString("inquiry"));
		
		System.out.println(rb_de_DE.getString("greetings"));
		System.out.println(rb_fr_FR.getString("greetings"));
		
	}
	
}
