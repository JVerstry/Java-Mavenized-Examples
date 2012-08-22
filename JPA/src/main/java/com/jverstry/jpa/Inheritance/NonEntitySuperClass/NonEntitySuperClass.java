
package com.jverstry.jpa.Inheritance.NonEntitySuperClass;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class NonEntitySuperClass {

	private String s;
	
	public NonEntitySuperClass() { }

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	@Override
	public boolean equals(Object o) {
		return Pojomatic.equals(this, o);
	}

	@Override
	public int hashCode() {
		return Pojomatic.hashCode(this);
	}

	@Override
	public String toString() {
		return Pojomatic.toString(this);
	}
	
}
