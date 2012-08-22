
package com.jverstry.jpa.ElementCollections;

import com.jverstry.jpa.JPA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ElementCollectionExample {
	
	public static void main(String[] args) {
		
		JPA.INSTANCE.clear();
		
		ReferringItem ri = new ReferringItem();
		
		ArrayList<AnEmbeddable> coll
			= new ArrayList<AnEmbeddable>();
		coll.add(new AnEmbeddable("Coll1"));
		coll.add(new AnEmbeddable("Coll2"));
		ri.setMyCollection(coll);
		
		Set<Long> set = new HashSet<Long>();
		set.add(Long.MIN_VALUE);
		set.add(33l);
		ri.setMySet(set);
	
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		ri.setMyList(list);
		
		Map<String,AnEmbeddable> map
			= new HashMap<String,AnEmbeddable>();
		map.put("prt", new AnEmbeddable("Map1"));
		map.put("frd", new AnEmbeddable("Map2"));
		ri.setMap(map);
		
		JPA.INSTANCE.save(ri);
		JPA.INSTANCE.clear();
		
		ReferringItem retr = JPA.INSTANCE.get(
				ReferringItem.class, ri.getId());
		System.out.println("Source == Retrieved: " + (ri==retr));
		
		System.out.println("Retrieved Collection:");
		for (AnEmbeddable ae : retr.getMyCollection()) {
			System.out.println(ae);
		}
		
		System.out.println("Retrieved Set:");
		for (Long l : retr.getMySet()) {
			System.out.println(l);
		}
		
		System.out.println("Retrieved List:");
		for (Iterator it = retr.getMyList().iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
		System.out.println("Retrieved Map:");
		for (Map.Entry<String,AnEmbeddable> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
	}
	
}
