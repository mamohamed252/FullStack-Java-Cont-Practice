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
		<h1>Show Employees Spring MVC APP</h1>
		<nav>
		<a href="home">Home</a>
		<a href="#">About</a>
		<a href="contactUs">Contact</a>
		</nav>
	</header>
	
	<div>
		<label>List of Employees</label>
		${employees}
	</div>
	<footer>
		<h4>(c) TekSystems</h4>
	</footer>
</html>