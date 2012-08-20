
package com.jverstry.jpa.PrimaryKey;

import java.io.Serializable;
import javax.persistence.Embeddable;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

/**
 * Composite key must implement Serializable
 * and must be public.
 */
@AutoProperty
public class CompositeKey implements Serializable {
	
	// Must be public or protected
	public String s;
	public long l;
	
	// Default public parameter-less
	// constructor is required
	public CompositeKey() { }
	
	// Equals must be implemented
	@Override
	public boolean equals(Object o) {
		return Pojomatic.equals(this, o);
	}

	// hashCode() must be implemented
	@Override
	public int hashCode() {
		return Pojomatic.hashCode(this);
	}

	@Override
	public String toString() {
		return Pojomatic.toString(this);
	}	
	
}
