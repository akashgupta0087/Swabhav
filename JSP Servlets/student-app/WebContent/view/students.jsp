<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.techlabs.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Students List</title>
</head>
<body>
<h1>Students List</h1>
<a href="addStudent">Add Student</a>
<% if(session.getAttribute("loggedIn")!=null){
	out.print("<label>" + session.getAttribute("loggedIn") + "</label>");
	out.print("<a href=logout>Logout</a>");
	}%>

<table class="table table-bordered">
<tr>
<th>ID</th>
<th>Roll No.</th>
<th>Name</th>
<th>Age</th>
<th>Email</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%
List<Student> students = (List)request.getAttribute("students");
for(Student student : students){
	//out.print("<br> Student:- Id : " + student.getId() + " Name : " + student.getName() + " Address : " + student.getAddress());
	out.print("<tr> <td>" + student.getId() + "</td>" + "<td>" + student.getRollNo() + "</td>" + "<td>" + student.getName() + "</td>" + "<td>" + student.getAge() + "</td>" + "<td>" + student.getEmail() + "</td>" + "<td>" + "<a href=editStudent?studentId="+ student.getId() + ">Edit</a>" + "</td>" +"<td><a href=deleteStudent?studentId="+ student.getId() + "><button class='glyphicon glyphicon-remove'>Delete</button> </a></tr>");
}
%>
</table>
</body>
</html>