
package com.jverstry.annotations.XmlAdapter;

import java.util.Map;
import javax.xml.bind.annotation.XmlElement;

public class JaxbMapToListEntry<K, V> {
 
    private K key;
    private V value;
 
    public JaxbMapToListEntry() {
    }
 
    public JaxbMapToListEntry(Map.Entry<K, V> e) {
        key = e.getKey();
        value = e.getValue();
    }
 
    @XmlElement
    public K getKey() {
        return key;
    }
 
    public void setKey(K key) {
        this.key = key;
    }
 
    @XmlElement
    public V getValue() {
        return value;
    }
 
    public void setValue(V value) {
        this.value = value;
    }
	
}
