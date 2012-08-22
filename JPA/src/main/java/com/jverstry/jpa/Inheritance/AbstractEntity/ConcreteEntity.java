
package com.jverstry.jpa.Inheritance.AbstractEntity;

import javax.persistence.Entity;
import org.pojomatic.annotations.AutoProperty;

@Entity
@AutoProperty
public class ConcreteEntity extends AbstractEntity {

	private String s2;	
	
	public ConcreteEntity() { }

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}
	
}
