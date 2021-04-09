package week8EmployeeAppJpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeAppTest {

	public static void main(String[] args) {

		testDBConnection();
	}

	private static void testDBConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAExample");
		EntityManager em = emf.createEntityManager();
		
		String msg = em.isOpen()?"Connected DB":"Not Connected";
		System.out.println(msg);
		
		em.close();
		emf.close();
	}

}
