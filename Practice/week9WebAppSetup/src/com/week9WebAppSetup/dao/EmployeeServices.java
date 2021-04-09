package com.week9WebAppSetup.dao;



import java.util.List;

import com.week9WebAppSetup.entities.Employee;




public class EmployeeServices extends AbstractDao implements EmployeeI   {
	final String persistenceUnitName = "week8EmployeeAppJpa";

	@Override
	public int addEmployee(Employee employee) {
		int row = 0;

		//1. connect ==> create entityManagerFactory & entityManager
		//2. execute
		//3. close
		try {
			connect();
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			row = 1;
		}catch(Exception e) {
			row =0;
		} finally {
			dispose();			
		}

		return row;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployeeById(Integer id, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		connect();
		List<Employee> employeeList = em.createQuery("SELECT e FROM Employee e",Employee.class).getResultList();
		dispose();
		
		return employeeList;
	}

}
