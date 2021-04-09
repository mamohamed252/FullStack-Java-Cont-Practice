package Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {
	
	public static void main(String[] args) {

		testDBConnection();
	}

	private static void testDBConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager em = emf.createEntityManager();
		
		String msg = em.isOpen()?"Connected to dataBase":"Not Connected";
		System.out.println(msg);
		
		em.close();
		emf.close();
	}


}
