
package com.jverstry.annotations.generics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car extends Vehicle {
	
	private String type;

	public Car() {};
	
	public Car(String type) {
		this.type = type;
	}
	
	@XmlElement
	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
