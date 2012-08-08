
package com.jverstry.annotations.XmlAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Destination {
	
	private String destination;

	public String getDestination() {
		return destination;
	}

	@XmlElement
	public void setDestination(String dest) {
		this.destination = dest;
	}
		
}
