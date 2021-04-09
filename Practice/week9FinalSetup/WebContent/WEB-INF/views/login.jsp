<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type= "text/css" href="/week9FinalSetup/resources/css/style.css" >
</head>
<%
	String message = null;
	String testUserName = "Mohamed";
	String testEmail = "a@aol.com";
	String userId = null;
	String userName = null;
	
	String fontColor = "red";
	Integer appCounter = 1;
	
	application.setAttribute("fontColor", fontColor);
	application.setAttribute("appCounter", appCounter);


	
	
	if (request.getParameter("login") != null) {
		 userName = request.getParameter("name");
		 userId = request.getParameter("email");
		
		if (userName.equals(testUserName)&&(userId.equals(testEmail))){
			// set the id and the firstName in response so that we pass those values to handler
			
			response.sendRedirect("success?name=" + userName + "&name=" + userId); //???
		} else {
			message = "ERROR: invalid login user Id or/and user name";
	
		}	
	}  else {
		message = "WELCOME TO YOUR NEW HOME";
	}
%>
<body>
	<header>
		<h1 style="color:green">LOGIN</h1>
		<div>
			<%
				if (message == null){
					out.print("<h2>" + "hi, " + userName +"</h2>");

				} else {
					out.print("<h2>" + message +"</h2>");
				}
			
			%>
		</div>
		<div>
					
			<!--  JSP include for including a jsp file/script  -->
			<nav>
				<a href="#">Home</a>
				<a href="aboutUs">About</a>
				<a href="contactUs">Contact us</a>
				<a href="showEmployees">Show All Employees</a>
				<a href="newEmployee">New Employees</a>
			</nav>
		</div>
		<div>
			<button><a href="contactUs">Message</a></button>
		</div>
		
		<div>
			<h2>FORM SAMPLE Login</h2>
			
			<form method="GET">
				
				<label>User Name:</label> 		<input type="text" name="name"><br><br>
				<label>User Email:</label> 			<input type="text" name="email"><br><br>
				<label>test button</label>  		<input type="submit" value="Login" name="login">
			</form>
			
		</div>
		
	</header>
	<footer>
		<h4>(c) TekGlobal 2021</h4>
	</footer>
</body>
</html>