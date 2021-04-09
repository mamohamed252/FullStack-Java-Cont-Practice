package jpa.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class abstractConnecetionMDB {
	
	final static String PERSISTENCEUNITNAME = "JPAExample";
	protected static EntityManagerFactory emf = null;
	protected static EntityManager em = null;
	
	public static void connect() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCEUNITNAME);
		em = emf.createEntityManager();
	}
	
	
	public static void disconnect(){
		if(em != null && em.isOpen()) {
			em.close();
		}
		if(emf != null && emf.isOpen()) {
			emf.close();
		}	
	}
}
