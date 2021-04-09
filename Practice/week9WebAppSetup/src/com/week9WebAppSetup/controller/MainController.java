package com.week9WebAppSetup.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.week9WebAppSetup.dao.EmployeeServices;
import com.week9WebAppSetup.entities.Employee;

@Controller
@RequestMapping("/")
@SessionAttributes("employeeKey")
public class MainController {
	EmployeeServices employeeServices = new EmployeeServices();
	
	@ModelAttribute("employeeKey")
	public Employee setUpEmployeeKey() {	
		return new Employee(888,"abc","def",999.99);
	}

	//handlers
	
	@RequestMapping(value={"/", "home"})  // "/" ==> this is the root or home page
	public String indexHandler() {
		return "index"; // view file name index.jsp
	}

//	@RequestMapping("home")  // "/" ==> this is the root or home page
//	public String homeHandler() {
//		return "index"; // view file name index.jsp
//
//	}
	
	@RequestMapping(value={"/aboutUs","/about", "/otherAbout"})  // this is from href value
	public String aboutHandler() {
		return "about"; // view file name about.jsp
	}
	
	@RequestMapping("/contactUs")  // "/"
	public String contactHandler() {
		return "contact"; // view file name contac.jsp
	}
	
	//"registerEmployee"
	@RequestMapping("/registerEmployee")  // "/registerEmployee" coming from the form element action attribute
	public ModelAndView registerEmployeeHandler(@ModelAttribute Employee employee) {

		//business logic or add code here
		
		Employee employeeA = new Employee();
		
		employeeA.setId(employee.getId());
		employeeA.setFirstName(employee.getFirstName());
		employeeA.setLastName(employee.getLastName());
		employeeA.setSalary(employee.getSalary());
		
		System.out.println("Employee object "+ employee);
		System.out.println("EmployeeA object "+ employeeA);
		
		
		employeeServices.addEmployee(employee);
		
		// passing data to the view
		ModelAndView mav = new ModelAndView();  // SCOPE request 
		mav.setViewName("verificationEmployee");
		mav.addObject("employee", employee);
		mav.addObject("otherEmployee", employeeA);
		return mav; // view file name contac.jsp
	}
	
	//showEmployees
	
	@RequestMapping("/showEmployees")  // "/"
	public ModelAndView derekHandler() {
		ModelAndView mav = new ModelAndView("showEmployees"); // viewName
		
		List<Employee> employeeList = employeeServices.getAllEmployees();
		
		mav.addObject("employees", employeeList);
		
		return mav; // view file name contac.jsp
	}
	
	@RequestMapping("/success")  // this is from href value
	public ModelAndView loginSuccessHandler(@ModelAttribute Employee user) {
		ModelAndView mav = new ModelAndView("success");
			
		mav.addObject("user", user );
		
		return mav; // view file name sucess.jsp
	}
	
	// testBean
	@RequestMapping("/testBean")
	public ModelAndView testBeanHandler(@ModelAttribute Employee userBean) {
		System.out.println("*************");
		System.out.println(userBean);
		System.out.println("*************");

		ModelAndView mav = new ModelAndView("about");
		return mav;
	}
	
	
	//newEmployee
	@RequestMapping("/newEmployee")
	public String newEmployeeHandler(@SessionAttribute("employeeKey") Employee employee) {
		System.out.println("New Employee Handler - session attribute");
		System.out.println(employee);
		return "newEmployee"; //jsp
	}
	
	
	
	
	
}
