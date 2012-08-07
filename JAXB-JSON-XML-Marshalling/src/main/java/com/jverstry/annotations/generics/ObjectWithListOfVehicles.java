
package com.jverstry.annotations.generics;

import java.util.List;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ObjectWithListOfVehicles {
	
	private List<Vehicle> list;

	@XmlElementWrapper(name="MyVehicleList")
	@XmlElement
	public List<Vehicle> getList() {
		return list;
	}

	public void setList(List<Vehicle> list) {
		this.list = list;
	}
	
}
