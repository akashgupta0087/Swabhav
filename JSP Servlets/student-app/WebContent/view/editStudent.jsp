<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techlabs.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Edit Student</title>
</head>
<body>
<form method="POST" action="editStudent">
<h1>Edit Student</h1><br>
<%Student student = (Student)request.getAttribute("student");%>
<h3>Id : <%=student.getId()%></h3>
<div class="form-inline">
<label>Roll No. : </label><input type="number" class="form-control" name="rollNo" value="<%=student.getRollNo()%>"><br>
</div>
<div class="form-inline">
<label>Name : </label><input type="text" class="form-control" name="name" value="<%=student.getName()%>"><br>
</div>
<div class="form-inline">
<label>Age : </label><input type="number" class="form-control" name="age" value="<%=student.getAge()%>"><br>
</div>
<div class="form-inline">
<label>E-mail : </label><input type="email" class="form-control" name="email" value="<%=student.getEmail()%>"><br>
</div>
<input type="submit" value="Submit" class="btn btn-primary">
</form>
<h1><%= (request.getAttribute("message")==null)? "" : request.getAttribute("message") %></h1>
</body>
</html>