
package com.jverstry.jpa.Inheritance;

import com.jverstry.jpa.Inheritance.AbstractEntity.ConcreteEntity;
import com.jverstry.jpa.Inheritance.MappedSuperClass.InheritingMappedSuperClass;
import com.jverstry.jpa.JPA;

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		mappedSuperClass();
		// abstractEntity();
		
	}

	public static void mappedSuperClass() {
		
		JPA.INSTANCE.clear();
		
		InheritingMappedSuperClass ce = new InheritingMappedSuperClass();
		ce.setS("QQQ");
		ce.setS2("DDD");
		
		JPA.INSTANCE.save(ce);
		JPA.INSTANCE.clear();
		
		InheritingMappedSuperClass retr = JPA.INSTANCE.get(
			InheritingMappedSuperClass.class, ce.getId());
		
		System.out.println("Source == Retrieved: " + (ce==retr));
		System.out.println(retr);
		
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
