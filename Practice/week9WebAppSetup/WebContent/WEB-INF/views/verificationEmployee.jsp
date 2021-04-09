<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.week9WebAppSetup.entities.Employee" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>testing jsp</h1>
		<label>Id :</label>${employee.getId()}<br><br>
		<label>First Name :</label>${employee.getFirstName()}<br><br>
		<label>Last Name:</label>${employee.getLastName()}<br><br>
		<br><br>
		<label>${employee} ---> Salary:</label>${employee.getSalary()}
		
		
		<br><br> 
		<label>First Name from employeeA:</label> yyy 
		${otherEmployee.getFirstName()}


	</div>

	<header>
		<h1>EMPLOYEE VERIFICATION PAGE</h1>
		
		<nav>
			<a href="home">Home</a>
			<a href="#">About</a>
			<a href="contactUs">Contact us</a>
		</nav>
		
	</header>
	<div>
		<h2>NEW EMPLOYEE DATA</h2>
		<label>First Name</label> ${employee.getFirstName()}	
		</div>
	
	
	<footer>
		<h4>(c) TekGlobal 2021</h4>
	</footer>
</body>
</html>