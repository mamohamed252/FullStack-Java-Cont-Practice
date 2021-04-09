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
		<div>
			 <h2>Application Counter : <%=application.getAttribute("appCounter") %> </h2>
			 <%
				Integer counter = ((Integer)application.getAttribute("appCounter"))+1;
			 	application.setAttribute("appCounter",counter );
			 %>
		</div>

		<!--  JSP include for including a jsp file/script  -->
		<%@ include file="menu.html" %>
		
	</header>
	<footer>
		<h4>(c) TekGlobal 2021</h4>
	</footer>
</body>
</html>