<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>JSp Demo</h1>

<h2>Scriptlet</h2>
<h3> Write Full java code in HTML</h3>

<%

int a=10;
int b= 20;
int c= a+b;

if(c>20)
	out.print("Addition is :" +c);
else
	out.print("Not valid result");

%>

<h2>Declaration</h2>

<p> Declare variable declare method</p>

<%! int number=20;

		Date d=new Date();

%>

<%!

int cube(int n){
	
	return n*n*n;
}


%>


<h2>Expressions</h2>

<p>To display value can use expression</p>

<h3>Value of number: <%=number %></h3>
<h3>Cube of 5 : <%=cube(5) %></h3>
<h3>Date : <%= Calendar.getInstance().getTime() %></h3>
<h3>Date: <%=d.getDate() %></h3>


</body>
</html>