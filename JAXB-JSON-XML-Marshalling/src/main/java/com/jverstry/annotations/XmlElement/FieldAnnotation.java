
package com.jverstry.annotations.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FieldAnnotation {
	
	@XmlElement
	private int a1 = 45;
	
	@XmlTransient
	private long a2 = 0;
	
	@XmlElement(nillable=true)
	private String xxx = null;

	@XmlElement(required=true)
	private String req;

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}	

	public long getA2() {
		return a2;
	}

	public void setA2(long a2) {
		this.a2 = a2;
	}

	public String getXxx() {
		return xxx;
	}

	public void setXxx(String xxx) {
		this.xxx = xxx;
	}

	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}
	
}
