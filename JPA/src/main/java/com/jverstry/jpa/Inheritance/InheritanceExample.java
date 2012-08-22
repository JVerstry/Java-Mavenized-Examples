
package com.jverstry.jpa.Inheritance;

import com.jverstry.jpa.Inheritance.AbstractEntity.ConcreteEntity;
import com.jverstry.jpa.JPA;

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		abstractEntity();
		
	}
	
	public static void abstractEntity() {
		
		JPA.INSTANCE.clear();
		
		ConcreteEntity ce = new ConcreteEntity();
		ce.setS("AAA");
		ce.setS2("BBB");
		
		JPA.INSTANCE.save(ce);
		JPA.INSTANCE.clear();
		
		ConcreteEntity retr = JPA.INSTANCE.get(
			ConcreteEntity.class, ce.getId());
		
		System.out.println("Source == Retrieved: " + (ce==retr));
		System.out.println(retr);
		
	}
	
}
