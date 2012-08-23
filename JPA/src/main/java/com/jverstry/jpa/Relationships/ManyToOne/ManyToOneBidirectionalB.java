
package com.jverstry.jpa.Relationships.ManyToOne;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import org.pojomatic.annotations.PojomaticPolicy;
import org.pojomatic.annotations.Property;

@Entity
@AutoProperty
public class ManyToOneBidirectionalB implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Property(policy=PojomaticPolicy.NONE)	
    @OneToMany(cascade=CascadeType.ALL, mappedBy="b")
    private Collection<ManyToOneBidirectionalA> a;
   
	private String s;
	
	public ManyToOneBidirectionalB() { }
	
	public ManyToOneBidirectionalB(String s) {
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

	public Collection<ManyToOneBidirectionalA> getA() {
		return a;
	}

	public void setA(Collection<ManyToOneBidirectionalA> a) {
		this.a = a;
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
