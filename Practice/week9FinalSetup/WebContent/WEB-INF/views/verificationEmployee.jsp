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
		<h1>Employee Verification Spring MVC APP</h1>
		<nav>
		<a href="home">Home</a>
		<a href="#">About</a>
		<a href="contactUs">Contact</a>
		</nav>
	</header>
	<div>
		<h1>New Employee Data</h1>
		<label>Name: </label>${employee.name}<br>
		<label>Country: </label>${employee.country}<br>
		<label>Email: </label>${employee.email}<br>
		<br><br><br>
		<label>Name: </label>${otherEmployee.name}<br>
		<label>Country: </label>${otherEmployee.country}<br>
		<label>Email: </label>${otherEmployee.email}<br>
	
	</div>
</html>