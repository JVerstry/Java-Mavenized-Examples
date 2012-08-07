
package com.jverstry.annotations.generics;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ObjectWithGenericList<T> {
	
	private List<T> myList;

	@XmlElementWrapper(name="MyGenericList")
	@XmlElement
	public List<T> getList() {
		return myList;
	}

	public void setList(List<T> list) {
		this.myList = list;
	}
	
}
