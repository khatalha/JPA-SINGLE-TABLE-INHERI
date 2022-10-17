package com.tk.classpertable;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SingleTableIheritence {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		Employee e = new Employee();
		e.setName("Talha");
		e.setSalary(18000);
		entityManager.persist(e);
		
		Manager m = new Manager();
		
		m.setName("Usman");
		m.setSalary(19000);
		m.setDpartmentName("MNG");
		entityManager.persist(m);
		
		
		entityManager.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
			
			
	}
}
