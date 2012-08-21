
package com.jverstry.jpa.AuthorizedTypes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OtherEntity implements Serializable {
	
	@Id
	private long id;

	// A public constructor with
	// no-argument is required
	public OtherEntity() { };
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
