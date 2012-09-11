
package com.jverstry.jpa.CriteriaAPI;

import javax.persistence.EntityManager;
import com.jverstry.jpa.JPA;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class SelectFrom {
	
	public static void main(String[] args) {
		
		// Creating some data
		SomeItem A = new SomeItem("rttt");
		SomeItem B = new SomeItem("qqqq");
		SomeItem C = new SomeItem("zzzz");
		
		JPA.INSTANCE.save(A);
		JPA.INSTANCE.save(B);
		JPA.INSTANCE.save(C);
		
		CriteriaBuilder cb = JPA.INSTANCE.EM.getCriteriaBuilder();
		
		// Constructing Select * from SomeItem
		CriteriaQuery<SomeItem> q = cb.createQuery(SomeItem.class);
		Root<SomeItem> c = q.from(SomeItem.class);
		q.select(c);
		
		// Executing the query
		TypedQuery<SomeItem> query = JPA.INSTANCE.EM.createQuery(q);
		List<SomeItem> results = query.getResultList();
		
		// Printing result
		for ( SomeItem si : results ) {
			System.out.println(si);
		}
		
	}
	
}
