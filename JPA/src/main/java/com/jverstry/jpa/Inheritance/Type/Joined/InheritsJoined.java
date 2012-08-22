
package com.jverstry.jpa.Inheritance.Type.Joined;

import javax.persistence.Entity;
import org.pojomatic.annotations.AutoProperty;

@Entity
@AutoProperty
public class InheritsJoined extends Joined {
	
	private String s2;
	
	public InheritsJoined() { }

	public String getS2() {
		return s2;
	}

	public void setS2(String s) {
		this.s2 = s;
	}
	
}
