
package com.jverstry.annotations.generics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bus extends Vehicle {
	
	private String type;
	
	public Bus() { };
	
	public Bus(String type) {
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
