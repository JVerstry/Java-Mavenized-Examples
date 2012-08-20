
package com.jverstry.jpa.PrimaryKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CompositeKey.class)
public class WithIdClass {
	
	@Id
	String s;
	
	@Id
	long l;
	
	private String someData;

	public WithIdClass() { }
	
	public String getSomeData() {
		return someData;
	}

	public void setSomeData(String someData) {
		this.someData = someData;
	}
	
}
