<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="/Student-Management/URLToReachResourcesFolder/css/add-student.css">
<link rel="stylesheet" type="text/css" href="/Student-Management/URLToReachResourcesFolder/css/style-sheet.css">

</head>
  <body>
<h1 align ="center"> Add-Student</h1>
<div align = "center">
<!-- Create a Spring form where user can enter the data -->
<form:form modelAttribute ="stud" action="saveStudent" method="post">
    <form:hidden path ="id"></form:hidden>
	<label>Name:</label>
	<form:input path="name"/><br><br>
	
	<label>Mobile:</label>
	<form:input path="mobile"/><br><br>
	
	<label>Country:</label>
	<form:input path="country"/><br><br>
	
	<input type ="submit" value="submit" class="btn btn-success"/>
</form:form>
</div>
</body>
</html>