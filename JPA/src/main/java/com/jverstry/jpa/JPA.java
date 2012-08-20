
package com.jverstry.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPA {
	
	public static final JPA INSTANCE = new JPA();
	
	public final EntityManagerFactory EMF;
	public final EntityManager EM;	
	
	public JPA() {
		
		EMF = Persistence.createEntityManagerFactory("JPA");
		EM = EMF.createEntityManager();	
	
	}

	public void clear() {
		EM.clear();
	}
	
	public void save(Object o) {
		
		EntityTransaction et = EM.getTransaction();

		et.begin();
		EM.persist(o);
		et.commit();
		
	}
	
	public <T> T get(Class<T> entityType, Object key) {
		
		return EM.find(entityType, key);
		
	}
	
	public void update(Object o) {
		
		EntityTransaction et = EM.getTransaction();
		et.begin();
		EM.merge(o);
		et.commit();
		
	}
	
	public void delete(Object o) {
		
		EntityTransaction et = EM.getTransaction();
		et.begin();
		EM.remove(o);
		et.commit();
		
	}
	
	@Override
	@SuppressWarnings("FinalizeDeclaration")
	protected void finalize() throws Throwable {
		
		super.finalize();
		
		EM.close();
		EMF.close();
		
	}
	
}
