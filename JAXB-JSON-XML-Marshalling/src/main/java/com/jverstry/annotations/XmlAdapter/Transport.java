package com.jverstry.annotations.XmlAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transport {

	private String transport;

	public String getTransport() {
		return transport;
	}

	@XmlElement
	public void setTransport(String transp) {
		this.transport = transp;
	}
	
}
