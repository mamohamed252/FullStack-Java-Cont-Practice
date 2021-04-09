package com.dao;

import java.util.List;

import com.entities.Employee;

public interface EmployeeI {
	
	public int addEmployee(Employee employee); // case 1
	
	public Employee getEmployeeById(Integer id); // case 2
	
	public int updateEmployeeById(Integer id, Employee updatedEmp); // case 3
	
	public Employee deleteEmployeeById(Integer id); // case 4
	
	public List<Employee> getAllEmployees(); // case 5
	
}
