<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3> Use Bean Demo</h3>

<jsp:useBean id="object" class="com.simplilearn.demo.Student" scope="session"></jsp:useBean>

<h4>Before setting property</h4>
<br>
id: <jsp:getProperty property="id" name="object"/>
<br>
Name: <jsp:getProperty property="name" name="object"/>
<br>
AadharCard: <jsp:getProperty property="adharCard" name="object"/>
<br>
Age: <jsp:getProperty property="age" name="object"/>
<br>

Sex: <jsp:getProperty property="sex" name="object"/>
<br>

<jsp:setProperty property="id" name="object" value="3"/>
<jsp:setProperty property="name" name="object" value="Arunita"/>
<jsp:setProperty property="adharCard" name="object" value="123456781234"/>
<jsp:setProperty property="age" name="object" value="25"/>
<jsp:setProperty property="sex" name="object" value="Female"/>

 

<h4>After Setting Property</h4>
<br>
id: <jsp:getProperty property="id" name="object"/>
<br>
Name: <jsp:getProperty property="name" name="object"/>
<br>
AadharCard: <jsp:getProperty property="adharCard" name="object"/>
<br>
Age: <jsp:getProperty property="age" name="object"/>
<br>

Sex: <jsp:getProperty property="sex" name="object"/>
<br>


<a href="showbeans.jsp">Show value in another page</a>

</body>
</html>