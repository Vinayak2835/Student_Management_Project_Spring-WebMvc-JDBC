<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align ="center"> Add-Student</h1>
<div align = "center">
<!-- Create a Spring form where user can enter the data -->
<form:form modelAttribute ="stud" action="saveStudent" method="get">
	<label>Name:</label>
	<form:input path="name"/><br><br>
	
	<label>Mobile:</label>
	<form:input path="mobile"/><br><br>
	
	<label>Country:</label>
	<form:input path="country"/><br><br>
	
	<input type ="submit" value="submit"/>
</form:form>
</div>
</body>
</html>