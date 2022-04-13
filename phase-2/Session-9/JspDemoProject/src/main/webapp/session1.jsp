<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String email=request.getParameter("email");
String pass=request.getParameter("pass");

if(email.equals("admin@gmail.com")&& pass.equals("admin123"))
{
	session.setAttribute("email", email);
%>

<h1> Welcome to the simplilearn</h1>
<h2>Your details: <%=email %></h2>
<a href="profile.jsp">Profile</a>

<% }

else{ %>

<h3 style="color:red ">Wrong username and password</h3>
<a href="SessionHandling.jsp">Click here to login again</a>
<%} %>

</body>
</html>