<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Add Student</title>
</head>
<body>
<form method="POST" action="addStudent">
<h1>Add Student</h1><br>
<div class="form-inline">
<label>Roll No. : </label><input type="number" class="form-control" name="rollNo" value=<%= (request.getAttribute("rollNo")==null)? "" : request.getAttribute("rollNo") %>><br>
</div>
<div class="form-inline">
<label>Name : </label><input type="text" class="form-control" name="name" value=<%= (request.getAttribute("name")==null)? "" : request.getAttribute("name") %>><br>
</div>
<div class="form-inline">
<label>Age : </label><input type="number" class="form-control" name="age" value=<%= (request.getAttribute("age")==null)? "" : request.getAttribute("age") %>><br>
</div>
<div class="form-inline">
<label>E-mail : </label><input type="email" class="form-control" name="email" value=<%= (request.getAttribute("email")==null)? "" : request.getAttribute("email") %>><br>
</div>
<input type="submit" value="Submit" class="btn btn-primary">
</form>
<h1><%= (request.getAttribute("message")==null)? "" : request.getAttribute("message") %></h1>
</body>
</html>