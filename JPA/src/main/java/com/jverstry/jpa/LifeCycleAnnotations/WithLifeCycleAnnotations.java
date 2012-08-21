
package com.jverstry.jpa.LifeCycleAnnotations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

@Entity
public class WithLifeCycleAnnotations {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ID;
	
	private String name = "";
	
	@PostLoad	
	public void postLoad() {
	    System.out.println("Post Load called !!!");
	}

	@PostPersist
	public void postPersist() {
	    System.out.println("Post Persist called !!!");
	}
	
	@PostRemove
	public void postRemove() {
	    System.out.println("Post Remove called !!!");
	}
	
	@PostUpdate
	public void postUpdate() {
	    System.out.println("Post Update called !!!");
	}
	
	@PrePersist
	public void prePersist() {
	    System.out.println("Pre Persist called !!!");
	}
	
	@PreRemove
	public void preRemove() {
	    System.out.println("Pre Remove called !!!");
	}
	
	@PreUpdate
	public void preUpdate() {
	    System.out.println("Pre Update called !!!");
	}
	
	public WithLifeCycleAnnotations() { }
	
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
