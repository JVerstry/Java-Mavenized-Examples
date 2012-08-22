
package com.jverstry.jpa.Inheritance;

import com.jverstry.jpa.Inheritance.AbstractEntity.ConcreteEntity;
import com.jverstry.jpa.Inheritance.MappedSuperClass.InheritingMappedSuperClass;
import com.jverstry.jpa.Inheritance.NonEntitySuperClass.InheritingNonEntitySuperClass;
import com.jverstry.jpa.JPA;

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		// mappedSuperClass();
		// abstractEntity();
		nonEntitySuperClass();
		
	}

	public static void nonEntitySuperClass() {
		
		JPA.INSTANCE.clear();
		
		InheritingNonEntitySuperClass insc
			= new InheritingNonEntitySuperClass();
		insc.setS("P1P");
		insc.setS2("AZ3");
		
		JPA.INSTANCE.save(insc);
		JPA.INSTANCE.clear();
		
		InheritingNonEntitySuperClass retr = JPA.INSTANCE.get(
			InheritingNonEntitySuperClass.class, insc.getId());
		
		System.out.println("Source == Retrieved: " + (insc==retr));
		System.out.println(retr);
		
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
