
package com.jverstry.jaxb2json;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement()
public class Recipe {

	private String title;
	private int duration;

	public String getTitle() {
		return title;
	}

	@XmlTransient
	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	@XmlElement
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
