package com.week9WebAppSetup.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractDao {

	// connection string
	private final static String persistenceUnitName = "week9WebAppSetup";
	protected static EntityManagerFactory emf = null;
	protected static EntityManager em = null;
	
	protected static void connect() {
		emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		em = emf.createEntityManager();	
	}
	
	protected static void dispose() {
		em.close();
		emf.close();
	}
}
