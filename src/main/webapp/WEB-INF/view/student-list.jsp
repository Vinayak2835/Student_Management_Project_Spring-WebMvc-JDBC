<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" type="text/css"  href="/Student-Management/URLToReachResourcesFolder/css/style-sheet.css">

</head>
<body class="myFonts">

<div align = "center" class="container">
<h1 align ="center">Student Data</h1>

<form action ="addStudentPage">
  <input type = "submit" value = "ADD" class="btn btn-primary"/><br><br>
</form>

 <table  class="table table-striped" border="1">
 <thead>
 <tr>
    <td>Id</td>
    <td>Name</td>
    <td>Mobile</td>
    <td>Country</td>
 </tr>
 </thead>

<c:forEach var = "student" items = "${students}">
    <tr>
       <td>${student.id}</td>
       <td>${student.name}</td>
       <td>${student.mobile}</td>
       <td>${student.country}</td>
       <td> <a href="/Student-Management/updateStudent?userId=${student.id}">Update</a></td>
        <td> <a href="/Student-Management/deleteStudent?userId=${student.id}" onclick="if(!(confirm('Are you sure want to delete the record'))) return false">Delete</a></td>
     </tr>
</c:forEach> 
 </table>
 <br><br>
 <img alt="school" src="/Student-Management//URLToReachImageFolder/school1.jpg">

 
 </div>
</body>
</html>