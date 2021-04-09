<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="com.week9WebAppSetup.entities.Employee" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>TEST BEAN PAGE</h1>
		

		<!--  JSP inFclude for including a jsp file/script  -->
		<%@ include file="menu.html" %>
		
	</header>
	
	<jsp:useBean id="userBean" scope="request" class="com.week9WebAppSetup.entities.Employee" ></jsp:useBean>
		<jsp:getProperty name="userBean" property="firstName"/>
	<%
		String userNameTest = (String)request.getAttribute("firstNameTest");
	%>
	<div>
		<h1>zzz USER BEAN - FIRST NAME : <%=userBean.getFirstName()%> </h1>
		
	</div>
	
	<footer>
		<h4>(c) TekGlobal 2021</h4>
	</footer>
</body>
</html>