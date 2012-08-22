
package com.jverstry.jpa.Inheritance.NonEntitySuperClass;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.pojomatic.annotations.AutoProperty;

@Entity
@AutoProperty
public class InheritingNonEntitySuperClass extends NonEntitySuperClass
        implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String s2;
	
	public InheritingNonEntitySuperClass() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}
	
}
