<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.week9FinalSetup.entity.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Profile</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/styles.css"/>
	<%
	Employee emp = (Employee)session.getAttribute("employeekey");
	System.out.println("JSP emp => " + emp);
	session.setAttribute("employeekey.name", "Connor");
	%>
</head>
<body>
	
	<header>
		<h1>New Employee</h1>
		<jsp:include page="myHeader.jsp"></jsp:include>
		<h1>New Employee</h1>
		<div>
		
		</div>
		
			<form action= "employee/addEmployee" method="GET">
				
				<label>User Name:</label> 		<input type="text" name="name"><br><br>
				<label>User Email:</label> 			<input type="text" name="email"><br><br>
				<label>test button</label>  		<input type="submit" value="save" name="add">
			</form>
		<nav>
			<a href="home">Home</a>
			<a href="#">About</a>
			<a href="contactUs">Contact us</a>
		</nav>
		
	</header>
	<footer>
	<jsp:include page="myFooter.jsp"></jsp:include>
	</footer>
</body>
</html>