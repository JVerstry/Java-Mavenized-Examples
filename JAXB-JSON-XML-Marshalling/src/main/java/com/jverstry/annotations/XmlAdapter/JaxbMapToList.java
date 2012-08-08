
package com.jverstry.annotations.XmlAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JaxbMapToList <K, V> {
 
    private List<JaxbMapToListEntry<K, V>> list
		= new ArrayList<JaxbMapToListEntry<K, V>>();
 
    public JaxbMapToList() {
    }
 
    public JaxbMapToList(Map<K, V> map) {
        for (Map.Entry<K, V> e : map.entrySet()) {
            list.add(new JaxbMapToListEntry<K, V>(e));
        }
    }
 
    public List<JaxbMapToListEntry<K, V>> getList() {
        return list;
    }
 
    public void setList(List<JaxbMapToListEntry<K, V>> entry) {
        this.list = entry;
    }
	
}
