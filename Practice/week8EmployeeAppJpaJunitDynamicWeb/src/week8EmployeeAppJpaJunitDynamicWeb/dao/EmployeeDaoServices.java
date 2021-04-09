package week8EmployeeAppJpaJunitDynamicWeb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import week8EmployeeAppJpaJunitDynamicWeb.entity.Employee;
import week8EmployeeAppJpaJunitDynamicWeb.entity.abstractEmp;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class EmployeeDaoServices extends abstractEmp implements EmployeeDAOint {

	//name addEmployee 
	//Description: this method persist an employee into the table employee
	// Parameters: Employee
	//Return: int 1 =0 employee added  0 = employee not added
	//
	
	
	
	@Override
	public boolean insertEmployee(Employee employee) {
	
		try {
			this.connect();
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			try {
				this.disconnect();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 1. connect - create entityManagerFactoy & entityManager
		// 2. execute
		// 3. close

	}

	@Override
	public Employee getEmployeeById(int id) {
		// get employee using id

		try {
			this.connect();
			Employee employee = null;
			employee = em.find(Employee.class, id);
			return employee;
		} catch (Exception e) {
			return null;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		// get all employees
		try {
			this.connect();
			List<Employee> employees = new ArrayList<Employee>();
			Query query = em.createQuery("SELECT e FROM Employee e");//JPQL
			employees = query.getResultList();
			return employees;

		} catch (Exception e) {
			System.out.println("no employees");
			return null;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean updateEmployee(int id, Employee employee) {
		// update employee
		try {
			this.connect();
			em.getTransaction().begin();
			Employee foundEmployee = em.find(Employee.class, id);
			foundEmployee.setName(employee.getName());
			foundEmployee.setEmail(employee.getEmail());
			foundEmployee.setCountry(employee.getCountry());
			em.persist(foundEmployee);
			em.getTransaction().commit();
			return true;
		}

		catch (Exception e) {
			return false;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean removeEmployee(int id) {
		// delete employee
		try {
			this.connect();
			em.getTransaction().begin();

			Employee removeSearch = em.find(Employee.class, id);
			em.remove(removeSearch);
			em.getTransaction().commit();
			return true;
		}

		catch (Exception e) {
			return false;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Employee> getAllEmployeesByNameQuery(String name) {
		try {
			this.connect();
			List<Employee> employees = new ArrayList<Employee>();
			Query query = em.createNamedQuery("getEmployeeByName");
			query.setParameter("empName", name);
			employees = query.getResultList();
			return employees;

		} catch (Exception e) {
			System.out.println("no employees");
			return null;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
