<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/styles.css"/>
</head>
<body>
	<header>
		<h1 style="color:green">HOME PAGE SPRING MVC APP</h1>
		
		<div>
			
			<img alt="say hi" src="/week9FinalSetup/resources/images/edit-512.png">		
		
			<!--  JSP include for including a jsp file/script  -->
			<nav>
				<a href="#">Home</a>
				<a href="aboutUs">About</a>
				<a href="contactUs">Contact us</a>
				<a href="showEmployees">Show All Employees</a>
				
			</nav>
		</div>
		<div>
			<button><a href="contactUs">Message</a></button>
		</div>
		
		<div>
			<h2>FORM SAMPLE Index</h2>
			
			<form action="registerEmployee" method="GET">
				<label>Name:</label> 	<input type="text" name="name"><br><br>
				<label>email:</label> 	<input type="text" name="email"><br><br>
				<label>test button</label>  <input type="submit" value="ok" name="save">
			</form>
			
		</div>
		
	</header>
	<footer>
		<h4>(c) TekGlobal 2021</h4>
	</footer>
</body>