<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Transaction</title>
<style>
fieldset.scheduler-border {
            border: 2px solid black;
            padding: 15px;
            margin: 0px;
            width: 50%;
    
        }
    
        legend.scheduler-border {
            font-size: 1.2em;
            font-weight: bold;
            text-align: left;
            width: auto;
            padding: 0 10px;
            border-bottom: none;
        }
        #form {
            margin-left: 500px;
            margin-top: 20px;
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Aurionpro Bank</a>
    </div>
    <ul class="nav navbar-nav">
      <!-- <li class="active"><a href="#">Home</a></li> -->
      <li><a href="transaction">Transaction</a></li>
      <li><a href="passbook">Passbook</a></li>
      <li><a href="profile">Profile</a></li>
      <li><a href="logout" class="glyphicon glyphicon-log-out" >Logout</a></li>
    </ul>
  </div>
</nav>
<div id="form">
    <form method="POST" action="transaction">
        <fieldset class="scheduler-border">
            <legend class="scheduler-border">Transaction</legend>
            <div class="form-inline">
                <label>Amount : </label><input type="number" class="form-control" name="amount">
            </div>
            <br>
            <div class="form-inline">
                    <label>Deposit : </label><input type="radio"  name="transaction" value="Deposit">
                    <label>Withdraw : </label><input type="radio"  name="transaction" value="Withdraw">
            </div>
            <br>
            <br>
            <input type="submit" value="Submit" class="btn btn-primary">
        </fieldset>
    </form>
</div>
<h1 style="color:red;"><%= (request.getAttribute("message")==null)? "" : request.getAttribute("message") %></h1>
</body>
</html>