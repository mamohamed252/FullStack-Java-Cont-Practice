package com.week9FinalSetup.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.week9FinalSetup.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@RequestMapping("/addEmployee") // this is from href value
	public ModelAndView createEmployeeHandler(HttpServletRequest request, @SessionAttribute("employeekey") Employee employeeSession) {
		ModelAndView mav = new ModelAndView("underConstruction");

		// System.out.println(request.getParameter("name"));
		Employee employee = new Employee();
		employee.setName(request.getParameter("name"));
		employee.setEmail(request.getParameter("email"));
		System.out.println(employee);

		System.out.println("Session " + request.getSession());
		System.out.println("Session ID" + request.getRequestedSessionId());
		
		System.out.println("This is get Handler");
		System.out.println(employeeSession);
		return mav; // view file name sucess.jsp

	}

}
