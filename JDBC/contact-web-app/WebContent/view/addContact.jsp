<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Add Contact</title>
</head>
<body>
<form method="POST" action="addContact">
<h1>Add Contact</h1><br>
<div class="form-inline">
<label>First Name: </label><input type="text" class="form-control" name="firstName"><br>
</div>
<div class="form-inline">
<label>Last Name : </label><input type="text" class="form-control" name="lastName"><br>
</div>
<div class="form-inline">
<label>E-mail : </label><input type="email" class="form-control" name="email"><br>
</div>
<div class="form-inline">
<label>Phone Number : </label><input type="number" class="form-control" name="phoneNo"><br>
</div>
<input type="submit" value="Submit" class="btn btn-primary">
</form>
</body>
</html>