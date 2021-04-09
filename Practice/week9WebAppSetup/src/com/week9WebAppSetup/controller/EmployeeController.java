package com.week9WebAppSetup.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.week9WebAppSetup.dao.EmployeeServices;
import com.week9WebAppSetup.entities.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	//addEmployee
		//@RequestMapping("/addEmployee")                            // request contains the data from the newEmployee Form
		@RequestMapping(value="/addEmployee", method=RequestMethod.GET)
		public ModelAndView createEmployeeGetHandler(HttpServletRequest request) {
			System.out.println("THIS IS THE GET HANDLER");
			
//			ModelAndView mav = new ModelAndView("printEmployee");
			ModelAndView mav = new ModelAndView();

			
//			System.out.println(request.getAttribute("firstName"));
			
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(request.getParameter("id")));
			employee.setFirstName(request.getParameter("firstName"));
			employee.setLastName(request.getParameter("lastName"));
			employee.setSalary(Double.parseDouble(request.getParameter("salary")));
			System.out.println(employee);
			
//			System.out.println(request.getParameter("firstName"));	
//			System.out.println(request.getParameter("lastName"));	
//			System.out.println(request.getParameter("salary"));	
//			System.out.println(request.getParameter("id"));	
				
			System.out.println("Session "+request.getSession());
			System.out.println("Session ID" + request.getRequestedSessionId());

			
			EmployeeServices employeeServices = new EmployeeServices();
			int result = employeeServices.addEmployee(employee);
			if (result == 1) {
				// return view : sucess employee added
				mav.addObject("employee", employee);
				mav.setViewName("printEmployee");
			} else {
				// return view : error 
				mav.setViewName("underConstruction");
			}
			
			return mav;
		}

		@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
		public ModelAndView createEmployeePostHandler(HttpServletRequest request) {
			System.out.println("THIS IS THE POST HANDLER");

			
//			ModelAndView mav = new ModelAndView("printEmployee");
			ModelAndView mav = new ModelAndView();

			
//			System.out.println(request.getAttribute("firstName"));
			
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(request.getParameter("id")));
			employee.setFirstName(request.getParameter("firstName"));
			employee.setLastName(request.getParameter("lastName"));
			employee.setSalary(Double.parseDouble(request.getParameter("salary")));
			System.out.println(employee);
			
//			System.out.println(request.getParameter("firstName"));	
//			System.out.println(request.getParameter("lastName"));	
//			System.out.println(request.getParameter("salary"));	
//			System.out.println(request.getParameter("id"));	
				
			System.out.println("Session "+request.getSession());
			System.out.println("Session ID" + request.getRequestedSessionId());

			
			EmployeeServices employeeServices = new EmployeeServices();
			int result = employeeServices.addEmployee(employee);
			if (result == 1) {
				// return view : sucess employee added
				mav.addObject("employee", employee);
				mav.setViewName("printEmployee");
			} else {
				// return view : error 
				mav.setViewName("underConstruction");
			}
			
			return mav;
		}
		
}
