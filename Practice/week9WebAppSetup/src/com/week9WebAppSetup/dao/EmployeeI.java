package com.week9WebAppSetup.dao;

import java.util.List;

import com.week9WebAppSetup.entities.Employee;

public interface EmployeeI {
	// first
	public int addEmployee(Employee employee);
	
	//later
	public Employee getEmployeeById(Integer id);
	public int updateEmployeeById(Integer id, Employee employee);
	public Employee deleteEmployeeById(Integer id);
	public List<Employee> getAllEmployees();	
}
