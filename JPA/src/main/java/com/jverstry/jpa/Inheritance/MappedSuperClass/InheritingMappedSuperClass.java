
package com.jverstry.jpa.Inheritance.MappedSuperClass;

import javax.persistence.Entity;
import org.pojomatic.annotations.AutoProperty;

@Entity
@AutoProperty
public class InheritingMappedSuperClass extends MappedSuperClass {

	private String s2;
	
	public InheritingMappedSuperClass() { }

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}
	
}
