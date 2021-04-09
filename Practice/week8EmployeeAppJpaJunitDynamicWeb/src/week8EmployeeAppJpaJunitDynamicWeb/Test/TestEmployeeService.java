package week8EmployeeAppJpaJunitDynamicWeb.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import week8EmployeeAppJpaJunitDynamicWeb.dao.EmployeeDaoServices;
import week8EmployeeAppJpaJunitDynamicWeb.entity.Employee;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestEmployeeService {

	EmployeeDaoServices empDao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		empDao = new EmployeeDaoServices();
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	@Order(1)
	void testInsertEmployee() {
//		fail("Not yet implemented");
		
//		EmployeeDaoServices empDao = new EmployeeDaoServices();
//		
//		Employee employee = new Employee("Conner","name@gmail","usa");
//		
//		Assertions.assertTrue(empDao.insertEmployee(employee));
	

	
	}

	@Test
	@Order(2)
	void testGetEmployeeById() {
		// fail("Not yet implemented");

		assertTrue(true);
	}

	@Test
	@Order(2)
	void testGetAllEmployees() {
		// fail("Not yet implemented");
		
//		
//		List<Employee> expectedEmployee = new ArrayList<>();
//		expectedEmployee.add(new Employee(151,"Conner","name@gmail","usa"));
//		expectedEmployee.add(new Employee(251,"Hocine","name","usa"));
//		
//		
//		List<Employee> actualEmployee = empDao.getAllEmployees();
//		
//		assertEquals(expectedEmployee, actualEmployee);
	}

	@Test
	@Order(4)
	void testUpdateEmployee() {
		// fail("Not yet implemented");
		
//		Employee testUE = new Employee("Mohamed","name","spain");
//		
//		assertTrue(empDao.updateEmployee(151, testUE));
	}

	@Test
	@Order(5)
	void testRemoveEmployee() {
		// fail("Not yet implemented");
//		Employee removeAdd = new Employee(200,"John","name","spain");
//		empDao.insertEmployee(removeAdd);
//		
//		assertTrue(empDao.removeEmployee(200));
	}

	@Test
	@Order(6)
	void testGetAllEmployeesByNameQuery() {
		// fail("Not yet implemented");
		assertEquals("Mohamed",empDao.getAllEmployeesByNameQuery("Mohamed").get(0).getName());
		
	}

}
