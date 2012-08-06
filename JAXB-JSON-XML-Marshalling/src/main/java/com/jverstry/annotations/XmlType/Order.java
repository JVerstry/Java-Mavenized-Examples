
package com.jverstry.annotations.XmlType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"a2", "a1"},
	factoryClass=OrderFactory.class,
    factoryMethod="myConstructor")
public class Order {
	
	private int a1 = 0;
	private int a2 = 0;

	@XmlElement	
	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}	

	@XmlElement	
	public int getA2() {
		return a2;
	}

	public void setA2(int a2) {
		this.a2 = a2;
	}
	
}
