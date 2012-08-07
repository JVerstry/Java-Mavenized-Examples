
package com.jverstry.annotations.generics;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ObjectWithList {
	
	private List<String> list;

	@XmlElementWrapper(name="MyList")
	@XmlElement
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
}
