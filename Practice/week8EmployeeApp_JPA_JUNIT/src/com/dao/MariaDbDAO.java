package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class MariaDbDAO {

	private final String persistenceUnitName = "week8EmployeeApp_JPA_JUNIT";
	
	protected EntityManagerFactory emf = null;
	protected EntityManager em = null;
	
	protected void connect() {
		emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		em = emf.createEntityManager();
	} 
	
	protected void dispose() { 
		
		em.close();
		emf.close();
	
	}
	
}