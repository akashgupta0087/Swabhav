<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>User Profile</title>
</head>
<body>
<div class="jumbotron">
<h2>A/c holder name : <%=session.getAttribute("loggedIn")%></h2>
<h2>Total balance : <%=request.getAttribute("balance")%></h2>
<a href="transaction"><button class="btn btn-primary">Transaction</button></a>
<a href=""><button class="btn btn-primary">Passbook</button></a>
</div>
</body>
</html>