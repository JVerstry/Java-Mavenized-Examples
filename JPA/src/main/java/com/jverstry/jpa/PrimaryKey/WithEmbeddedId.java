
package com.jverstry.jpa.PrimaryKey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class WithEmbeddedId {

	@EmbeddedId
	private CompositeKey id;
	
	private String data;

	public CompositeKey getId() {
		return id;
	}

	public void setId(CompositeKey id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
