
package com.jverstry.annotations.JaxbContext;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InheritSomeA extends SomeA {
	
	private String moreData;

	@XmlElement
	public String getMoreData() {
		return moreData;
	}

	public void setMoreData(String moreData) {
		this.moreData = moreData;
	}
	
}
