
package com.jverstry.jpa.LifeCycleAnnotations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NoLifeCycleAnnotations {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ID;
	
	private String name = "";

	public long getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
