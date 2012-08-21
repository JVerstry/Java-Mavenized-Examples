
package com.jverstry.jpa.LifeCycleAnnotations;

import com.jverstry.jpa.JPA;

public class LifeCycleAnnotationsExample {

	public static void main(String[] args) {
		
		JPA.INSTANCE.clear();
		
		NoLifeCycleAnnotations nlca = new NoLifeCycleAnnotations();
		nlca.setName("AAA");
		
		System.out.println("Saving NO lifecycle annotations");
				JPA.INSTANCE.save(nlca);

		System.out.println("Reading NO lifecycle annotations");
		NoLifeCycleAnnotations nlcaRetr =
			JPA.INSTANCE.get(NoLifeCycleAnnotations.class, nlca.getID());
		
		System.out.println("Updating NO lifecycle annotations");
		nlca.setName("BBB");
		JPA.INSTANCE.update(nlca);
		
		System.out.println("Deleting NO lifecycle annotations");
		nlca.setName("BBB");
		JPA.INSTANCE.delete(nlca);
		
		
		WithLifeCycleAnnotations wlca = new WithLifeCycleAnnotations();
		wlca.setName("AAA");
		
		System.out.println("Saving WITH lifecycle annotations:");
		JPA.INSTANCE.save(wlca);

		System.out.println("Reading WITH lifecycle annotations:");
		WithLifeCycleAnnotations wlcaRetr =
			JPA.INSTANCE.get(WithLifeCycleAnnotations.class, wlca.getID());
		
		System.out.println("Updating WITH lifecycle annotations:");
		wlca.setName("BBB");
		JPA.INSTANCE.update(wlca);
		
		System.out.println("Deleting WITH lifecycle annotations:");
		wlca.setName("BBB");
		JPA.INSTANCE.delete(wlca);
		
	}
	
}
