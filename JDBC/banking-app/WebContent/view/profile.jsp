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
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Aurionpro Bank</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Home</a></li> -->
      <li><a href="transaction">Transaction</a></li>
      <li><a href="passbook">Passbook</a></li>
      <li><a href="logout" class="glyphicon glyphicon-log-out" >Logout</a></li>
    </ul>
  </div>
</nav>
<div class="jumbotron">
<h2>A/c holder name : <%=session.getAttribute("loggedIn")%></h2>
<h2>Total balance : <%=request.getAttribute("balance")%></h2>
</div>
</body>
</html>