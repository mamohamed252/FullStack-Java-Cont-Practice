<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type= "text/css" href="/week9WebAppSetup/resources/css/style.css" >
</head>
<body>
	<header>
		<h1 style="color:green">HOME PAGE SPRING MVC APP</h1>
		
		<div>
			
			<img alt="say hi" src="/week9WebAppSetup/resources/images/edit-512.png">		
		
			<!--  JSP include for including a jsp file/script  -->
		
		<!-- 	
			<%@ include file="menu.html" %>
		 -->	
		 
			<jsp:include page="myHeader.jsp"/> 
			
		</div>
		<div>
			<button><a href="contactUs">Message</a></button>
		</div>
		
		<div>
			<h2>FORM SAMPLE</h2>
			
			<form action="registerEmployee" method="GET">
				<label>Id:</label> 			<input type="text" name="id"><br><br>
				<label>First Name:</label> 	<input type="text" name="firstName"><br><br>
				<label>Last Name:</label> 	<input type="text" name="lastName"><br><br>
				<label>Salary:</label> 		<input type="text" name="salary"><br><br>
				<label>test button</label>  <input type="submit" value="ok" name="save">
			</form>
			
		</div>
		
	</header>
	<footer>

	</footer>
</body>
</html>