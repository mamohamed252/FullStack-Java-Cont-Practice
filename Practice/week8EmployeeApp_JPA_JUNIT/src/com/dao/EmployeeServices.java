package com.dao;



import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

import com.entities.Employee;

public class EmployeeServices extends MariaDbDAO implements EmployeeI {
	
	@Override // case 1
	public int addEmployee(Employee employee) {
		
		int row = 0;
		connect();
		try {
			em.getTransaction().begin();
			em.persist(employee);
			em.persist(employee);
			em.persist(employee);
			em.getTransaction().commit();
			row = 1;
		} catch(Exception e) {
			row = 0;
		} finally {
			dispose();
		}

		
		return row;
	}

	@Override // case 2
	public Employee getEmployeeById(Integer id) {
		Employee emp = new Employee();
		Employee result = emp;
		connect();
		try {
			em.getTransaction().begin();
			em.find(emp.getClass(), id);
			em.getTransaction().commit();
			result = em.find(emp.getClass(), id);
		} catch(Exception e) {
			result = null;
		} finally {
			dispose();
		}
		return result;
	}

	@Override // case 3
	public int updateEmployeeById(Integer id, Employee updatedEmp) {
		
		int row = 0;
		connect();
		try {
			em.getTransaction().begin();
			Employee emp = em.find(Employee.class, id);
			emp.setFirstName(updatedEmp.getFirstName());
			emp.setLastName(updatedEmp.getLastName());
			emp.setSalary(updatedEmp.getSalary());
			em.getTransaction().commit();
			row = 1;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return row;
	}

	@Override // case 4
	public Employee deleteEmployeeById(Integer id) {
		connect();
		Employee result = null;
		try {
			em.getTransaction().begin();
			result = em.find(Employee.class, id);
			em.remove(result);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			result = null;
		}
		
		return result;
	}

	@Override // case 5
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = null;
		connect();
		try {
//			em.getTransaction().begin(); Don't need these transaction methods because we aren't modifying any data in the DB.
			allEmployees = em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList(); 
//			em.getTransaction().commit();
		}catch (Exception e) {
			allEmployees = null;
			System.out.println(e.getMessage());
		}finally {
			dispose();
		}
		return allEmployees;
	}

}
