<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*" %>
    <%@ page import="com.techlabs.model.TransactionLog" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="assets/bootstrap-3.4.1-dist/css/bootstrap.css">
<title>Passbook</title>
<style>

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
      <li><a href="transaction">Transactions</a></li>
      <li><a href="passbook">Passbook</a></li>
       <li><a href="profile">Profile</a></li>
       <li><a href="logout" class="glyphicon glyphicon-log-out" >Logout</a></li>
    </ul>
  </div>
</nav>
<h1>Passbook</h1>
<span>A/c holder name : <%=session.getAttribute("loggedIn")%><span> &nbsp; &nbsp;
<a href="downloadCSV"><button class="btn btn-primary">Download</button></a> 
<br>
<br>
<table class="table table-bordered">
<tr>
<th>A/c Name</th>
<th>Amount</th>
<th>Transaction Type</th>
<th>Transaction Date</th>
</tr>
<%
List<TransactionLog> transactions = (List)request.getAttribute("transactions");
for(TransactionLog  transaction : transactions){
	out.print("<tr> <td>" + transaction.getAccName() + "</td>" + "<td>" + transaction.getAmount() + "</td>" + "<td>" + transaction.getTransactionType() + "</td>" + "<td>" + transaction.getTransactionDate() + "</td></tr>");
}

%>
</table>
</body>
</html>