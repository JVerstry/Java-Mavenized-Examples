
package com.jverstry.jpa.Relationships;

import com.jverstry.jpa.JPA;
import com.jverstry.jpa.Relationships.ManyToMany.ManyToManyA;
import com.jverstry.jpa.Relationships.ManyToMany.ManyToManyB;
import com.jverstry.jpa.Relationships.ManyToOne.ManyToOneBidirectionalA;
import com.jverstry.jpa.Relationships.ManyToOne.ManyToOneBidirectionalB;
import com.jverstry.jpa.Relationships.ManyToOne.ManyToOneUnidirectionalA;
import com.jverstry.jpa.Relationships.ManyToOne.ManyToOneUnidirectionalB;
import com.jverstry.jpa.Relationships.OneToMany.OneToManyBidirectionalA;
import com.jverstry.jpa.Relationships.OneToMany.OneToManyBidirectionalB;
import com.jverstry.jpa.Relationships.OneToMany.OneToManyUnidirectionalA;
import com.jverstry.jpa.Relationships.OneToMany.OneToManyUnidirectionalB;
import com.jverstry.jpa.Relationships.OneToOne.OneToOneBidirectionalA;
import com.jverstry.jpa.Relationships.OneToOne.OneToOneBidirectionalB;
import com.jverstry.jpa.Relationships.OneToOne.OneToOneUnidirectionalA;
import com.jverstry.jpa.Relationships.OneToOne.OneToOneUnidirectionalB;

public class RelationshipsExample {
	
	public static void main(String[] args) {
		
		JPA.INSTANCE.clear();
		
		OneToOne();
		
	}
	
	public static void OneToOne() {
		
		OneToOneUnidirectionalA a = new OneToOneUnidirectionalA("AAA");
		OneToOneUnidirectionalB b = new OneToOneUnidirectionalB("BBB");
		
		a.setB(b);
		
		JPA.INSTANCE.save(b);
		JPA.INSTANCE.save(a);
		JPA.INSTANCE.clear();
		
		OneToOneUnidirectionalA retrA
			= JPA.INSTANCE.get(OneToOneUnidirectionalA.class, a.getId());
		
		System.out.println(retrA);
		System.out.println(retrA.getB());
		
		OneToOneBidirectionalA a2 = new OneToOneBidirectionalA("BiAAA");
		OneToOneBidirectionalB b2 = new OneToOneBidirectionalB("BiBBB");
		
		JPA.INSTANCE.save(b2);
		JPA.INSTANCE.save(a2);
		
		a2.setB(b2);
		b2.setA(a2);
		
		JPA.INSTANCE.save(b2);
		JPA.INSTANCE.save(a2);
		JPA.INSTANCE.clear();
		
		OneToOneBidirectionalA retrA2
			= JPA.INSTANCE.get(OneToOneBidirectionalA.class, a2.getId());
		
		System.out.println(retrA2 + " -> " + retrA2.getB());
		System.out.println(retrA2.getB()  + " -> " + retrA2.getB().getA());
		
	}
	
	public static void OneToMany() {
		
		OneToManyUnidirectionalA a = new OneToManyUnidirectionalA("AAA");
		OneToManyUnidirectionalB b = new OneToManyUnidirectionalB("BBB");
		
		// a.setB(b);
		
		JPA.INSTANCE.save(a);
		JPA.INSTANCE.clear();
		
		OneToManyUnidirectionalA retrA
			= JPA.INSTANCE.get(OneToManyUnidirectionalA.class, a.getId());
		
		System.out.println(retrA);
		System.out.println(retrA.getB());
		
		OneToManyBidirectionalA a2 = new OneToManyBidirectionalA("BiAAA");
		OneToManyBidirectionalB b2 = new OneToManyBidirectionalB("BiBBB");
		
		// a2.setB(b2);
		b2.setA(a2);
		
		JPA.INSTANCE.save(a);
		JPA.INSTANCE.clear();
		
		OneToManyBidirectionalA retrA2
			= JPA.INSTANCE.get(OneToManyBidirectionalA.class, a2.getId());
		
		System.out.println(retrA2);
		System.out.println(retrA2.getB());
		
	}
	
	public static void ManyToOne() {
		
		ManyToOneUnidirectionalA a = new ManyToOneUnidirectionalA("AAA");
		ManyToOneUnidirectionalB b = new ManyToOneUnidirectionalB("BBB");
		
		a.setB(b);
		
		JPA.INSTANCE.save(a);
		JPA.INSTANCE.clear();
		
		ManyToOneUnidirectionalA retrA
			= JPA.INSTANCE.get(ManyToOneUnidirectionalA.class, a.getId());
		
		System.out.println(retrA);
		System.out.println(retrA.getB());
		
		ManyToOneBidirectionalA a2 = new ManyToOneBidirectionalA("BiAAA");
		ManyToOneBidirectionalB b2 = new ManyToOneBidirectionalB("BiBBB");
		
		a2.setB(b2);
		// b2.setA(a2);
		
		JPA.INSTANCE.save(a);
		JPA.INSTANCE.clear();
		
		ManyToOneBidirectionalA retrA2
			= JPA.INSTANCE.get(ManyToOneBidirectionalA.class, a2.getId());
		
		System.out.println(retrA2);
		System.out.println(retrA2.getB());
		
	}
	
	public static void ManyToMany() {
		
		ManyToManyA a = new ManyToManyA("AAA");
		ManyToManyB b = new ManyToManyB("BBB");
		
		// a.setB(b);
		
		JPA.INSTANCE.save(a);
		JPA.INSTANCE.clear();
		
		ManyToManyA retrA
			= JPA.INSTANCE.get(ManyToManyA.class, a.getId());
		
		System.out.println(retrA);
		System.out.println(retrA.getB());
		
	}
	
}
