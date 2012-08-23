
package com.jverstry.jpa.Relationships.ManyToMany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import org.pojomatic.annotations.PojomaticPolicy;
import org.pojomatic.annotations.Property;

@Entity
@AutoProperty
public class ManyToManyB implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Property(policy=PojomaticPolicy.NONE)	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="listOfB")
	private Collection<ManyToManyA> listOfA
		= new ArrayList<ManyToManyA>();
	
	private String s;
	
	public ManyToManyB() { }
	
	public ManyToManyB(String s) {
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

	public Collection<ManyToManyA> getListOfA() {
		return listOfA;
	}

	public void setListOfA(Collection<ManyToManyA> listOfA) {
		this.listOfA = listOfA;
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
