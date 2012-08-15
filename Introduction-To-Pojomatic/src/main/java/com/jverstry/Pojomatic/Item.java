
package com.jverstry.Pojomatic;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import org.pojomatic.annotations.PojomaticPolicy;
import org.pojomatic.annotations.Property;

@AutoProperty
public class Item {
	
	@Property(policy=PojomaticPolicy.EQUALS_TO_STRING)
	private long id = 0;
	
	private String description = "";
	
	@Property(policy=PojomaticPolicy.NONE)
	private transient int transientData;
	
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
  
	public Item() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTransientData() {
		return transientData;
	}

	public void setTransientData(int transientData) {
		this.transientData = transientData;
	}
	
}
