
package com.jverstry.annotations.XmlSeeAlso;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Image {
	
	private String name = "";

	@XmlElement	
	public String getName() {
		return name;
	}

	public void setName(String content) {
		this.name = content;
	}
	
}
