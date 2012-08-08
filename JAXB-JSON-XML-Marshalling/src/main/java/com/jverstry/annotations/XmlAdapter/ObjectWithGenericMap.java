
package com.jverstry.annotations.XmlAdapter;

import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class ObjectWithGenericMap<K, V> {
	
	private Map<K,V> map;

	@XmlElement
	@XmlJavaTypeAdapter(JaxbMapAdaptor.class)
	public Map<K,V> getMap() {
		return map;
	}
	
	public void setMap(Map<K,V> map) {
		this.map = map;
	}
	
}
