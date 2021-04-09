<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>ABOUT SPRING MVC APP TEAM</h1>
		
		<nav>
			<a href="home">Home</a>
			<a href="#">About</a>
			<a href="contactUs">Contact us</a>
		</nav>
		
	</header>
	<div>
		<label>List of Employees</label> <br><br>
		${employees.get(0).getId()} | ${employees.get(0).getFirstName()} 
		<br><br>
		${employees.get(1).getId()} | ${employees.get(1).getFirstName()} 
		<br><br>
		${employees.get(2).getId()} | ${employees.get(2).getFirstName()} 
		<br><br>
		${employees.get(3).getId()} | ${employees.get(3).getFirstName()} 
	</div>
	
	
	
	<footer>
		<h4>(c) TekGlobal 2021</h4>
	</footer>
</body>
</html>