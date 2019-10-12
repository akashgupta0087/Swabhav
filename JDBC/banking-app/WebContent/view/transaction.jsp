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