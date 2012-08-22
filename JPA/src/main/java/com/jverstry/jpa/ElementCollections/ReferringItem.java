
package com.jverstry.jpa.ElementCollections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@Entity
@AutoProperty
public class ReferringItem implements Serializable {
	
	@Id
	private long id;
	
	// Element collection is required for basic types
	// and embeddables. Such elements are stored in
	// a separate table.
	@ElementCollection
	private Collection<AnEmbeddable> myCollection
		= new ArrayList<AnEmbeddable>();
	
	// By default, data is fetched lazily (when 
	// used for the first time). Making it eager
	// loads the data as soon as possible
	@ElementCollection(fetch=FetchType.EAGER)
	private Set<Long> mySet = new HashSet<Long>();
	
	// When not using generics, one must specify
	// the collection type (i.e., target class)
	@ElementCollection(targetClass=String.class)
	private List myList = new ArrayList();
	
	// Element collection is required when the value
	// is a basic type or an embeddable
	@ElementCollection
	private Map<String,AnEmbeddable> map
		= new HashMap<String,AnEmbeddable>();
	
	public ReferringItem() { }
	
	@Override
	public boolean equals(Object o) {
		return Pojomatic.equals(this, o);
	}

	@Override
	public int hashCode() {
		return Pojomatic.hashCode(this);
	}

	@Override
	public String toString() {
		return Pojomatic.toString(this);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<AnEmbeddable> getMyCollection() {
		return myCollection;
	}

	public void setMyCollection(Collection<AnEmbeddable> myCollection) {
		this.myCollection = myCollection;
	}

	public Set<Long> getMySet() {
		return mySet;
	}

	public void setMySet(Set<Long> mySet) {
		this.mySet = mySet;
	}

	public List getMyList() {
		return myList;
	}

	public void setMyList(List myList) {
		this.myList = myList;
	}

	public Map<String,AnEmbeddable> getMap() {
		return map;
	}

	public void setMap(Map<String,AnEmbeddable> map) {
		this.map = map;
	}
	
}
