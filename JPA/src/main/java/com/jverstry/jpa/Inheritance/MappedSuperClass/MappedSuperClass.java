
package com.jverstry.jpa.Inheritance.MappedSuperClass;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@MappedSuperclass
@AutoProperty
public class MappedSuperClass implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	
	private String s;
	
	public MappedSuperClass() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
