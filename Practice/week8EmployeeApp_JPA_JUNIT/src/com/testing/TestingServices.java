package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dao.EmployeeServices;
import com.entities.Employee;

class TestingServices {
	
	EmployeeServices employeeservices = new EmployeeServices();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void testAddEmployeeNew() {
//		// given
//		Employee expectedEmp = new Employee(6, "Test", "Test", 99999.12);
//		int actualResult = employeeservices.addEmployee(expectedEmp);
//		
//		int expectedResult = 1;
//		assertEquals(expectedResult, actualResult);
//	}
	
//	@Test
//	void testAddEmployeeDuplicate() {
//		// given
//		Employee expectedEmp = new Employee(1, "Kevin", "McMahon", 20000.00);
//		int actualResult = employeeservices.addEmployee(expectedEmp);
//		
//		int expectedResult = 0;
//		assertEquals(expectedResult, actualResult);
//	}
	
	@Test
	void testGetEmployeeById() {
		//fail("Not yet implemented");
		Employee expectedEmployee = new Employee(100000, "MOoo", "Coow", 5000.00);
		employeeservices.addEmployee(expectedEmployee);
		Employee actualEmployee = employeeservices.getEmployeeById(expectedEmployee.getId());
		employeeservices.deleteEmployeeById(expectedEmployee.getId());
		assertEquals(100000, actualEmployee.getId());
		assertEquals("MOoo", actualEmployee.getFirstName());
		assertEquals("Coow", actualEmployee.getLastName());
		assertEquals(5000.00, actualEmployee.getSalary());
	}

	@Test
	void testUpdateEmployeeById() {
//		Employee expectedEmployee = new Employee(7777, "Testing", "Still", 555.55);
//		employeeservices.addEmployee(expectedEmployee);
//		int result = employeeservices.updateEmployeeById(expectedEmployee.getId(), new Employee(7777, "Changed", "another", 44444.00));
//		employeeservices.deleteEmployeeById(expectedEmployee.getId());
//		assertEquals(1, result);

		Employee expectedEmployee = new Employee(100000, "MOoo", "Coow", 5000.00);
		employeeservices.addEmployee(expectedEmployee);
		employeeservices.updateEmployeeById(expectedEmployee.getId(), new Employee(100000, "Changed", "Values", 100000.00));
		Employee actualEmployee = employeeservices.deleteEmployeeById(expectedEmployee.getId());
		assertEquals("Changed", actualEmployee.getFirstName());
		assertEquals("Values", actualEmployee.getLastName());
		assertEquals(100000.00, actualEmployee.getSalary());
	}

	@Test
	void testDeleteEmployeeById() {
		//fail("Not yet implemented");
		Employee expectedEmployee = new Employee(9999, "Hi", "Bye", 999.99);
		employeeservices.addEmployee(expectedEmployee);
		Employee actualEmployee = employeeservices.deleteEmployeeById(expectedEmployee.getId());
		assertEquals(expectedEmployee, actualEmployee);
		
	}

	@Test
	void testGetAllEmployees() {
		List<Employee> expectedEmployees = new ArrayList<>();
		expectedEmployees.add(new Employee(1, "Kevin", "McMahon", 20000.00));
		expectedEmployees.add(new Employee(2, "Derek", "Chou", 20000.00));

		List<Employee> actualEmployees = employeeservices.getAllEmployees();
		
		assertEquals(expectedEmployees, actualEmployees);
	
	}

}
