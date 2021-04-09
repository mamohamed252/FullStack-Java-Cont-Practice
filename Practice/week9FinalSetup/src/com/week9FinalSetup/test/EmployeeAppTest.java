package com.week9FinalSetup.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeAppTest {

	public static void main(String[] args) {

		testDBConnection();
	}

	private static void testDBConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("week9FinalSetup");
		EntityManager em = emf.createEntityManager();
		
		String msg = em.isOpen()?"Connected DB":"Not Connected";
		System.out.println(msg);
		
		em.close();
		emf.close();
	}

}
