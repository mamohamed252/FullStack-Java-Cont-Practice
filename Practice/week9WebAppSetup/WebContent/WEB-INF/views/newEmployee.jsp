<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Employee Profile</title>
	</head>
	<body>
		<header>
			<jsp:include page="myHeader.jsp"></jsp:include>
			<h1>NEW EMPLOYEE</h1>
			
		</header>
		<div>
			<form action= "employee/addEmployee" method="GET">
				<label>Id:</label> 				<input type="text" name="id"><br><br>
				<label>First Name:</label> 		<input type="text" name="firstName"><br><br>
				<label>Last Name:</label> 		<input type="text" name="lastName"><br><br>
				<label>Salary:</label> 		<input type="text" name="salary"><br><br>
				<label>test button</label>  	<input type="submit" name="add" value="save">
			</form>
			<hr>
			<form action= "employee/addEmployee" method="POST">
				<label>Id:</label> 				<input type="text" name="id"><br><br>
				<label>First Name:</label> 		<input type="text" name="firstName"><br><br>
				<label>Last Name:</label> 		<input type="text" name="lastName"><br><br>
				<label>Salary:</label> 		<input type="text" name="salary"><br><br>
				<label>test button</label>  	<input type="submit" name="add" value="save">
			</form>
		
		</div>
		<footer>
				<jsp:include page="myFooter.jsp"></jsp:include>
		</footer>
		
	</body>
</html>