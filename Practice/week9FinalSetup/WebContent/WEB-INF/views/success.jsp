<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.week9FinalSetup.entity.Employee" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/styles.css"/>

</head>
<body>

	<div>
		<h1 style="color: <%=application.getAttribute("fontColor")%>" >Application implicit object attributes</h1>
		<h2><%=application.getAttribute("fontColor") %> </h2>
		 
		 <h2>BEFORE Application Counter : <%=application.getAttribute("appCounter") %> </h2>
		 
		 <%
			Integer counter = ((Integer)application.getAttribute("appCounter"))+1;
		 	application.setAttribute("appCounter",counter );
		 %>
		 
		 <h2>AFTER Application Counter : <%=application.getAttribute("appCounter") %> </h2>
		 
		 
	</div>
	<div>
		
		<h1>LOGIN SUCESS</h1>
		<h2>Welcome, ${user.getName()}</h2>
		
		<label>User Name :</label>${user.getName()}<br><br>
		<label>User Email :</label>${user.getEmail()}<br><br>
	</div>

	<header>
		<hr>
		<nav>
			<a href="home">Home</a>
			<a href="aboutUs">About</a>
			<a href="contactUs">Contact us</a>
			<a href="/">Login</a>
			
		</nav>
		<hr>
		
	</header>


	<footer>
		<h4>(c) TekGlobal 2021</h4>
	</footer>
</body>
</html>