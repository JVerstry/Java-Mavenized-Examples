
package com.jverstry.jpa.Inheritance;

import com.jverstry.jpa.Inheritance.AbstractEntity.ConcreteEntity;
import com.jverstry.jpa.Inheritance.MappedSuperClass.InheritingMappedSuperClass;
import com.jverstry.jpa.Inheritance.NonEntitySuperClass.InheritingNonEntitySuperClass;
import com.jverstry.jpa.Inheritance.Type.Joined.InheritsJoined;
import com.jverstry.jpa.Inheritance.Type.SingleTable.InheritsSingleTable;
import com.jverstry.jpa.Inheritance.Type.TablePerClass.InheritsTablePerClass;
import com.jverstry.jpa.JPA;

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		mappedSuperClass();
		abstractEntity();
		nonEntitySuperClass();
		typeSingleTable();
		
	}

	public static void typeSingleTable() {
		
		JPA.INSTANCE.clear();
		
		InheritsJoined ij
			= new InheritsJoined();
		ij.setS("IJ1");
		ij.setS2("IJ2");
		
		JPA.INSTANCE.save(ij);
		
		InheritsSingleTable st
			= new InheritsSingleTable();
		st.setS("ST1");
		st.setS2("ST2");
		
		JPA.INSTANCE.save(st);
		
		InheritsTablePerClass tpc
			= new InheritsTablePerClass();
		tpc.setS("TPC1");
		tpc.setS2("TPC2");
		
		JPA.INSTANCE.save(tpc);
		
		JPA.INSTANCE.clear();
		
		InheritsJoined retr_ij = JPA.INSTANCE.get(
			InheritsJoined.class, ij.getId());
		
		System.out.println("Source == Retrieved: " + (ij==retr_ij));
		System.out.println(retr_ij);
		
		InheritsSingleTable retr_st = JPA.INSTANCE.get(
			InheritsSingleTable.class, st.getId());
		
		System.out.println("Source == Retrieved: " + (st==retr_st));
		System.out.println(retr_st);
		
		InheritsTablePerClass retr_tpc = JPA.INSTANCE.get(
			InheritsTablePerClass.class, tpc.getId());
		
		System.out.println("Source == Retrieved: " + (tpc==retr_tpc));
		System.out.println(retr_tpc);
		
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
