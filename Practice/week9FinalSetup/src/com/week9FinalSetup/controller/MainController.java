package com.week9FinalSetup.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.week9FinalSetup.dao.EmployeeDaoServices;
import com.week9FinalSetup.entity.Employee;

@Controller
@RequestMapping("/")
@SessionAttributes("employeekey")
public class MainController {
	//handlers
	static EmployeeDaoServices employeeService = new EmployeeDaoServices();
	
	@ModelAttribute("employeekey")
	public Employee setUpEmployeeKey() {
		return new Employee();
	}
	
	
	
	@RequestMapping("/") // "/" -> this is the root or home page
	public String indexHandler() {
		return "login"; // view file name - index.jsp
	}
	
	
	@RequestMapping("home") // "/home" -> this is the href value
	public String homeHandeler() {
		return "index"; // view file name - index.jsp
	}
	
	@RequestMapping("aboutUs") // "/aboutUs" -> this is the href value
	public String aboutHandler() {
		return "about"; // view file name - about.jsp
	}
	
	
	@RequestMapping("contactUs") // "/contactUs" -> this is the href value
	public String contactHandeler() {
		return "contact"; // view file name - contact.jsp
	}
	
	@RequestMapping("registerEmployee") // "/" -> this is coming from element attribute 
	public ModelAndView registerEmployeeHandeler(@ModelAttribute Employee employee) {
		
		Employee employeeA = new Employee();
		employeeA.setName(employee.getName());
		employeeA.setCountry(employee.getCountry());
		employeeA.setEmail(employee.getEmail());
	
		employeeService.insertEmployee(employee);
		
		//passing data to the view
		ModelAndView mav = new ModelAndView();
		mav.setViewName("verificationEmployee");
		mav.addObject("employee", employee);
		mav.addObject("otherEmployee", employeeA);
		return mav; // view file name - contact.jsp
	}
	
	
	@RequestMapping("/showEmployees") // "/contactUs" -> this is the href value
	public ModelAndView showEmployeesHandeler() {
		
		ModelAndView mav = new ModelAndView("showEmployees");
		List<Employee> employeeList = employeeService.getAllEmployees();
		mav.addObject("employees", employeeList);
		return mav; // view file name - contact.jsp
	}
	@RequestMapping("/success")  // this is from href value
	public ModelAndView loginSuccessHandler(@ModelAttribute Employee user) {
		ModelAndView mav = new ModelAndView("success");
			
		mav.addObject("user", user );
		
		return mav; // view file name sucess.jsp
	}

	
	@RequestMapping("/newEmployee")  // this is from href value
	public String newEmployeeHandler(@SessionAttribute("employeekey") Employee employee) {
		System.out.println("New employee handler");
		System.out.println(employee);
		return "newEmployee"; // view file name sucess.jsp
	}
	
	
}
