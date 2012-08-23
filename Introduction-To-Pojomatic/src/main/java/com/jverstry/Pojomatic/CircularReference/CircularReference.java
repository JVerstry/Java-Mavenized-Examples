
package com.jverstry.Pojomatic.CircularReference;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import org.pojomatic.annotations.PojomaticPolicy;
import org.pojomatic.annotations.Property;

@AutoProperty
public class CircularReference {
	
	private String data;
	
	@Property(policy=PojomaticPolicy.NONE)
	private CircularReference circularReference;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public CircularReference getCircularReference() {
		return circularReference;
	}

	public void setCircularReference(CircularReference circularReference) {
		this.circularReference = circularReference;
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
