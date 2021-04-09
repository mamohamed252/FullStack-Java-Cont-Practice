<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>PRINT EMPLOYEE</h1>
	<hr>
	<div>
		<label>Employee data</label>
		<label>Id:</label>${employee.getId()} 				<br><br>
		<label>First Name:</label> ${employee.getFirstName() } 		<br><br>
		<label>Last Name:</label>${employee.getLastName() } 		<br><br>
		<label>Salary:</label> ${employee.getSalary()}			<br><br>		
	</div>
	
</body>
</html>