<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.week9WebAppSetup.entities.Employee" %>
    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type= "text/css" href="/week9WebAppSetup/resources/css/style.css" >
</head>
<%
	String message = null;
	String testId = "999";
	String testUserName = "Mohamed";
	String userId = null;
	String userName = null;
	
	Employee userInput = new Employee();
	userInput.setFirstName("testingFirstName");
	
	
	String fontColor = "red";
	Integer appCounter = 1;
	
	application.setAttribute("fontColor", fontColor);
	application.setAttribute("appCounter", appCounter);


	
	
	if (request.getParameter("login") != null) {
		 userId = request.getParameter("id");
		 userName = request.getParameter("firstName");
		 userInput.setId(Integer.parseInt(request.getParameter("id")));
		 userInput.setFirstName(request.getParameter("firstName"));
		
		
		if (userId.equals(testId) && (userName.equals(testUserName))){
			// set the id and the firstName in response so that we pass those values to handler
			
			response.sendRedirect("success?id=" + userId+ "&firstName=" + userName); //???
		} else {
			message = "ERROR: invalid login user Id or/and user name";
	
		}	
	}  else {
		message = "WELCOME TO YOUR NEW HOME";
	}
%>
<body>
	<jsp:useBean id="userBean" scope="request" class="com.week9WebAppSetup.entities.Employee" ></jsp:useBean>
	<jsp:setProperty name="userBean" property="firstName"  value="Amy" /> 
	
	<jsp:forward page="testBean.jsp"></jsp:forward>
	
	
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
			<%@ include file="menu.html" %>

		</div>
		<div>
			<button><a href="contactUs">Message</a></button>
		</div>
		
		<div>
			<h2>FORM SAMPLE</h2>
			
			<form method="GET">
				<label>User Id:</label> 			<input type="text" name="id"><br><br>
				<label>User First Name:</label> 	<input type="text" name="firstName"><br><br>
				<label>test button</label>  		<input type="submit" value="Login" name="login">
			</form>
			
		</div>
		
	</header>
	<footer>
		<h4>(c) TekGlobal 2021</h4>
	</footer>
</body>
</html>