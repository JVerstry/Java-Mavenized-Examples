
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
public class ManyToManyA implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Property(policy=PojomaticPolicy.NONE)	
	@ManyToMany(cascade=CascadeType.ALL)
	private Collection<ManyToManyB> listOfB
		= new ArrayList<ManyToManyB>();

	private String s;
	
	public ManyToManyA() { }
	
	public ManyToManyA(String s) {
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

	public Collection<ManyToManyB> getListOfB() {
		return listOfB;
	}

	public void setListOfB(Collection<ManyToManyB> listOfB) {
		this.listOfB = listOfB;
	}
	
}
