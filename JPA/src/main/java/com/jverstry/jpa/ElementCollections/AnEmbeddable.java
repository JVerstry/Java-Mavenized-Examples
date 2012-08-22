
package com.jverstry.jpa.ElementCollections;

import java.io.Serializable;
import javax.persistence.Embeddable;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@Embeddable
@AutoProperty
public class AnEmbeddable implements Serializable {

	private String s;
	
	public AnEmbeddable() { }

	public AnEmbeddable(String s) {
		this.s = s;
	}
	
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
