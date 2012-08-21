
package com.jverstry.jpa.AuthorizedTypes;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class SomeEmbeddable implements Serializable {

	private String s;

	// A public constructor with
	// no-argument is required
	public SomeEmbeddable() { };
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}
