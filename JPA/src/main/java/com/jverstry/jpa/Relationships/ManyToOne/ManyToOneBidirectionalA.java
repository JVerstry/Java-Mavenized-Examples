
package com.jverstry.jpa.Relationships.ManyToOne;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import org.pojomatic.annotations.PojomaticPolicy;
import org.pojomatic.annotations.Property;

@Entity
@AutoProperty
public class ManyToOneBidirectionalA implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Property(policy=PojomaticPolicy.NONE)	
	@ManyToOne
	private ManyToOneBidirectionalB b;
	
	private String s;
	
	public ManyToOneBidirectionalA() { }
	
	public ManyToOneBidirectionalA(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	

	public ManyToOneBidirectionalB getB() {
		return b;
	}

	public void setB(ManyToOneBidirectionalB b) {
		this.b = b;
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
